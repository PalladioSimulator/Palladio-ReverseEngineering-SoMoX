package org.somox.analyzer.simplemodelanalyzer.detection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.jgrapht.Graph;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.graph.AsSubgraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.somox.analyzer.ModelAnalyzerException;
import org.somox.analyzer.simplemodelanalyzer.builder.ComponentBuilder;
import org.somox.analyzer.simplemodelanalyzer.detection.util.ComponentPrinter;
import org.somox.analyzer.simplemodelanalyzer.detection.util.EdgeThresholdFilter;
import org.somox.analyzer.simplemodelanalyzer.detection.util.VertexTypeAndEdgeThresholdFilter;
import org.somox.analyzer.simplemodelanalyzer.metrics.DefaultCompositionIndicatingMetric;
import org.somox.analyzer.simplemodelanalyzer.metrics.DefaultMergeIndicatingMetric;
import org.somox.analyzer.simplemodelanalyzer.metricvalues.MetricValuesWriter;
import org.somox.configuration.AbstractMoxConfiguration;
import org.somox.configuration.SoMoXConfiguration;
import org.somox.filter.BaseFilter;
import org.somox.filter.FilteredCollectionsFactory;
import org.somox.kdmhelper.metamodeladdition.Root;
import org.somox.metrics.ClusteringRelation;
import org.somox.metrics.IMetric;
import org.somox.metrics.MetricID;
import org.somox.metrics.helper.Class2ClassAccessGraphHelper;
import org.somox.metrics.helper.ClassAccessGraphEdge;
import org.somox.metrics.helper.ComponentToImplementingClassesHelper;
import org.somox.metrics.registry.MetricsRegistry;
import org.somox.metrics.util.GraphPrinter;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;

import tools.mdsd.jamopp.model.java.classifiers.ConcreteClassifier;

/**
 * Detection strategy for composite component which relies on clustering of
 * metrics computed for pair-wise component relationships
 *
 * @author Steffen Becker, Klaus Krogmann, Michael Hauck
 */
public class ComponentDetectionByClustering implements IDetectionStrategy {

    /**
     * The logger of this detection strategy
     */
    private final static Logger LOG = Logger.getLogger(ComponentDetectionByClustering.class);

    /**
     * KDM model used to detect components
     */
    private final Root kdmModel;

    /**
     * Somox configuration to use to configure detection
     */
    private final SoMoXConfiguration somoxConfiguration;

    /**
     * Helper to convert {@link ComponentImplementingClassesLink}s to Set of
     * {@link org.eclipse.gmt.modisco.java.Type}
     */
    final private ComponentToImplementingClassesHelper componentToImplementingClassHelper = new ComponentToImplementingClassesHelper();

    /**
     * Metric used when computing the relationship graph that indicates a
     * composition of two or more components
     */
    private final IMetric compositionIndicatingMetric;

    /**
     * Metric used when merging the relationship graph that indicates a composition
     * of two or more components
     */
    private final IMetric mergeIndicatingMetric;

    /**
     * Map of all metrics in the Eclipse system and initialized for this clustering
     * algorithm
     */
    private final Map<MetricID, IMetric> allMetrics;

    /**
     * Executor service which is used to compute any damage to the clustering graph
     * in parallel
     */
    private final ExecutorCompletionService<ClusteringRelation[]> completionService;

    private ExecutorService pool;

    public ComponentDetectionByClustering(final Root kdmModelToAnalyze,
            final List<ComponentImplementingClassesLink> initialComponentCandidates,
            final SoMoXConfiguration somoxConfig) {
        validateConfiguration(somoxConfig);

        kdmModel = kdmModelToAnalyze;
        somoxConfiguration = somoxConfig;
        allMetrics = initializeMetrics(initialComponentCandidates);
        compositionIndicatingMetric = getMetric(allMetrics, DefaultCompositionIndicatingMetric.METRIC_ID);
        mergeIndicatingMetric = getMetric(allMetrics, DefaultMergeIndicatingMetric.METRIC_ID);
        completionService = initializeExecutorCompletionService();

        GraphPrinter.cleanOutputFolder(somoxConfig.getFileLocations().getAnalyserInputFile());
    }

    /**
     * Check the configuration for necessary preconditions. If checks fail, an
     * {@link IllegalArgumentException} is thrown
     *
     * @param somoxConfig configuration to check
     */
    private void validateConfiguration(final SoMoXConfiguration somoxConfig) {
        if (((somoxConfig.getClusteringConfig().getClusteringMergeThresholdDecrement() <= 0)
                || (somoxConfig.getClusteringConfig().getClusteringComposeThresholdDecrement() <= 0))) {
            throw new IllegalArgumentException(
                    "The merge and compose threshold increment/decrement have to be positive numbers");
        }
        if ((somoxConfig.getClusteringConfig().getMinComposeClusteringThreshold() >= somoxConfig.getClusteringConfig()
                .getMaxComposeClusteringThreshold())) {
            throw new IllegalArgumentException(
                    "The minimum clustering threshold must be lower than maximum clustering threshold");
        }
        if ((somoxConfig.getClusteringConfig().getMinMergeClusteringThreshold() >= somoxConfig.getClusteringConfig()
                .getMaxMergeClusteringThreshold())) {
            throw new IllegalArgumentException(
                    "The minimum merge threshold must be lower than maximum merge threshold");
        }
    }

    /**
     * Initialize the {@link ExecutorCompletionService} used to compute repair tasks
     * of the clustering graph
     *
     * @return the created {@link ExecutorCompletionService} initialized to the
     *         number of CPU cores or 1 in debug mode
     */
    private ExecutorCompletionService<ClusteringRelation[]> initializeExecutorCompletionService() {
        final int poolSize = LOG.isDebugEnabled() ? 1 : Runtime.getRuntime().availableProcessors() + 1;
        LOG.debug("Initialized thread pool to compute repair actions of the clustering graph with " + poolSize
                + " threads");
        pool = Executors.newFixedThreadPool(poolSize);
        return new ExecutorCompletionService<>(pool);
    }

    private enum OperationMode {
        MERGE, COMPOSE
    }

    /*
     * (non-Javadoc)
     *
     * @see org.somox.analyzer.simplemodelanalyzer.detection.IDetectionStrategy#
     * startDetection(org.somox .analyzer.simplemodelanalyzer.SimpleAnalysisResult,
     * org.eclipse.core.runtime.IProgressMonitor, java.util.List)
     */
    @Override
    public List<ComponentImplementingClassesLink> startDetection(final ComponentBuilder pcmBuilder,
            final AbstractMoxConfiguration somoxConfig, final IProgressMonitor progressMonitor,
            List<ComponentImplementingClassesLink> componentCandidates) throws ModelAnalyzerException {

        // merge or compose in a iteration; by default first try to merge
        OperationMode currentMode = OperationMode.MERGE;
        double currentThreshold = somoxConfiguration.getClusteringConfig().getMinMergeClusteringThreshold();
        double currentThresholdBound = somoxConfiguration.getClusteringConfig().getMaxMergeClusteringThreshold();
        double currentDelta = somoxConfiguration.getClusteringConfig().getClusteringMergeThresholdDecrement();

        int componentCountPreviousIteration = componentCandidates.size();
        boolean newComponentsFound = true;
        int iteration = 0;
        final DefaultDirectedGraph<ComponentImplementingClassesLink, ClusteringRelation> componentIndicatingGraph = setupGraph();

        // Cluster as long as there is a chance to find new components in the clustering
        // step
        while (clusteringCanContinue(componentCandidates, currentMode, currentThreshold, currentThresholdBound)) {

            iteration++;

            LOG.info("Clustering iteration nr.: " + iteration + " in mode: " + currentMode);
            LOG.info("NR Component candidates: " + componentCandidates.size());
            if (LOG.isDebugEnabled()) {
                LOG.debug("Operation mode: " + currentMode + ", current threshold value: " + currentThreshold
                        + ", current delta: " + currentDelta + ", current bound: " + currentThresholdBound);
            }

            if (newComponentsFound) {
                // Recompute missing metrics and add their corresponding vertices and edges
                LOG.debug("Computing clustering graphs");
                computeAllMetrics(componentCandidates, mergeIndicatingMetric, componentIndicatingGraph,
                        progressMonitor);

                saveMetricValuesModel(componentIndicatingGraph, iteration, currentThreshold, currentMode,
                        componentCandidates);
            }

            // 2. create projected graph from one with evaluated metrics:
            LOG.debug("Projecting graph based on current threshold " + currentThreshold);
            final DefaultDirectedGraph<ComponentImplementingClassesLink, ClusteringRelation> projectedGraph = createProjectedGraph(
                    componentIndicatingGraph, currentThreshold, currentMode);
            createDebugOutputForIteration(currentMode, iteration, componentIndicatingGraph, projectedGraph);

            // 3. Component Clustering
            componentCandidates = componentComposition(pcmBuilder, projectedGraph, iteration,
                    currentMode == OperationMode.MERGE);

            // update existing components for new interfaces
            // TODO: the following line causes a lot of performance overhead and is only
            // useful if
            // public methods are being recognized as interfaces in a fall back strategy
            pcmBuilder.updateRequiredInterfacesOfExistingPrimitiveComponents();

            // 4. Check whether new components have been found in this iteration
            if (componentCandidates.size() == componentCountPreviousIteration) {
                newComponentsFound = false;
            } else {
                componentCountPreviousIteration = componentCandidates.size();
                newComponentsFound = true;
            }

            // 5. adapt thresholds if necessary
            if (!newComponentsFound) {
                currentThreshold += currentDelta;
                if ((currentMode == OperationMode.MERGE)
                        && isSwitchToCompose(currentThreshold, currentThresholdBound)) {
                    LOG.info("Done merging primitive components, now starting to compose.");
                    currentMode = OperationMode.COMPOSE;
                    currentThreshold = somoxConfiguration.getClusteringConfig().getMaxComposeClusteringThreshold();
                    currentThresholdBound = somoxConfiguration.getClusteringConfig().getMinComposeClusteringThreshold();
                    currentDelta = -somoxConfiguration.getClusteringConfig().getClusteringComposeThresholdDecrement();
                }
            }
        }

        if (LOG.isDebugEnabled()) {
            ComponentPrinter.printComponents(componentCandidates, LOG);
        }

        pool.shutdown();

        return componentCandidates;
    }

    private boolean isSwitchToCompose(final double currentThreshold, final double currentThresholdBound) {
        return currentThreshold > currentThresholdBound;
    }

    /**
     * @param componentCandidates
     * @param currentComposeThreshold
     * @param currentMergeThreshold
     * @param iteration
     * @return
     */
    private boolean clusteringCanContinue(final List<ComponentImplementingClassesLink> componentCandidates,
            final OperationMode mode, final double currentThreshold, final double currentThresholdBound) {

        if (componentCandidates.size() <= 1) {
            return false;
        }

        if (mode == OperationMode.MERGE) {
            return true;
        }

        return currentThreshold >= currentThresholdBound;
        // WTF? && iteration < MAX_ACCEPTABLE_ITERATIONS;
    }

    private void saveMetricValuesModel(
            final DefaultDirectedGraph<ComponentImplementingClassesLink, ClusteringRelation> metricsGraph,
            final int iteration, final double currentThreshold, final OperationMode mode,
            final List<ComponentImplementingClassesLink> componentCandidates) {
        final MetricValuesWriter mvWriter = new MetricValuesWriter(somoxConfiguration);
        mvWriter.saveMetricValuesModel(metricsGraph, iteration, currentThreshold, componentCandidates,
                mode == OperationMode.MERGE);

    }

    /**
     * Dumps graphs and values in trace mode.
     *
     * @param isMergeIteration
     * @param iteration
     * @param componentIndicatingGraph
     * @param projectedGraph
     */
    private void createDebugOutputForIteration(final OperationMode currentMode, final int iteration,
            final DefaultDirectedGraph<ComponentImplementingClassesLink, ClusteringRelation> componentIndicatingGraph,
            final DefaultDirectedGraph<ComponentImplementingClassesLink, ClusteringRelation> projectedGraph) {
        if (LOG.isTraceEnabled()) {
            LOG.trace("graph in mode = " + currentMode + " contains " + projectedGraph.edgeSet().size() + " edges, "
                    + projectedGraph.vertexSet().size() + " vertices / orig graph: "
                    + componentIndicatingGraph.edgeSet().size() + " edges, " + projectedGraph.vertexSet().size()
                    + " vertices");

            GraphPrinter.dumpGraph(componentToImplementingClassHelper, componentIndicatingGraph,
                    somoxConfiguration.getFileLocations().getAnalyserInputFile(), iteration,
                    GraphPrinter.ORIGINAL_GRAPH);

            if (projectedGraph.edgeSet().size() > 0) {
                GraphPrinter.dumpGraph(componentToImplementingClassHelper, projectedGraph,
                        somoxConfiguration.getFileLocations().getAnalyserInputFile(), iteration,
                        GraphPrinter.PROJECTED_GRAPH);
            }
        }
    }

    /**
     * Computes a graph containing GAST classes as nodes and directed edges which
     * contain the number of accesses from the class in the source node to the class
     * in the target node. The nodes are filtered, i.e., only classes not filtered
     * by the blacklist are contained.
     *
     * @param componentCandidates The list of initial component candidates. Used to
     *                            further narrow the graph
     * @return The graph as described in the methods main description
     */
    private DefaultDirectedGraph<ConcreteClassifier, ClassAccessGraphEdge> getAccessGraph(
            final List<ComponentImplementingClassesLink> componentCandidates) {
        return Class2ClassAccessGraphHelper.computeFilteredClass2ClassAccessGraph(somoxConfiguration,
                componentToImplementingClassHelper.collectAllClasses(componentCandidates));
    }

    /**
     * This method is used to initialize all metrics used in the clustering
     * algorithm
     *
     * @param componentCandidates The set of component candidates. They will be used
     *                            to limit the size of the caching graph which is
     *                            sent to the metric instances.
     * @return The initialized set of metrics mapped on their IDs
     * @throws AnalyzerRuleException If the initialization of a metric fails, an
     *                               {@link AnalyzerRuleException} is thrown
     */
    private Map<MetricID, IMetric> initializeMetrics(final List<ComponentImplementingClassesLink> componentCandidates) {
        final Map<MetricID, IMetric> allMetrics = MetricsRegistry.getRegisteredMetrics();

        final DefaultDirectedGraph<ConcreteClassifier, ClassAccessGraphEdge> accessGraph = getAccessGraph(
                componentCandidates);
        for (final IMetric metric : allMetrics.values()) {
            metric.initialize(kdmModel, somoxConfiguration, allMetrics, accessGraph,
                    componentToImplementingClassHelper);
        }

        return allMetrics;
    }

    /**
     * Create projected graph from one with evaluated metrics. Only edges passing
     * the threshold are contained in the resulting graph.
     *
     * @param currentComposeThreshold  Current threshold to check against for
     *                                 compose cases.
     * @param currentMergeThreshold    Current threshold to check against for merge
     *                                 cases.
     * @param isMergeIteration         indicates compose or merge case
     * @param componentIndicatingGraph The original graph.
     * @return The projected graphs with removed edges.
     */
    private DefaultDirectedGraph<ComponentImplementingClassesLink, ClusteringRelation> createProjectedGraph(
            final DefaultDirectedGraph<ComponentImplementingClassesLink, ClusteringRelation> componentIndicatingGraph,
            final double currentThreshold, final OperationMode currentMode) {

        final BaseFilter<ClusteringRelation> filter = currentMode == OperationMode.MERGE
                ? new VertexTypeAndEdgeThresholdFilter(mergeIndicatingMetric.getMID(), currentThreshold)
                : new EdgeThresholdFilter(compositionIndicatingMetric.getMID(), currentThreshold);

        final DefaultDirectedGraph<ComponentImplementingClassesLink, ClusteringRelation> projectedGraph = new DefaultDirectedGraph<>(
                ClusteringRelation.class);
        componentIndicatingGraph.vertexSet().forEach(projectedGraph::addVertex);
        FilteredCollectionsFactory.getFilteredHashSet(filter, componentIndicatingGraph.edgeSet()).forEach(e -> {
            projectedGraph.addEdge(e.getSourceComponent(), e.getTargetComponent());
        });

        return projectedGraph;
    }

    /**
     * For the given list of potential components, i.e., classes, compute a
     * triangular matrix of metrics indicating the relationship of the two classes.
     *
     * @param newComponentCandidates    The list of potential components
     * @param metricComputationStrategy A class which encapsulates the computation
     *                                  of the metrics. The top level metric which
     *                                  is to be computed (merge or compose).
     * @param progressMonitor           The progress monitor used to indicate
     *                                  clustering progress
     * @return The elements of the triangular matrix showing the relationship of all
     *         classes pairwise
     * @throws ModelAnalyzerException Thrown if the metric computation fails
     *                                unexpectedly
     */
    private void computeAllMetrics(final List<ComponentImplementingClassesLink> newComponentCandidates,
            final IMetric metricComputationStrategy,
            final DefaultDirectedGraph<ComponentImplementingClassesLink, ClusteringRelation> previousGraph,
            final IProgressMonitor progressMonitor) throws ModelAnalyzerException {

        final Collection<NodePair> work = deriveComputationWork(newComponentCandidates, previousGraph);
        final int totalCount = work.size();

        final IProgressMonitor clusteringProgressMonitor = new SubProgressMonitor(progressMonitor, totalCount);
        final long startTimeClustering = System.nanoTime();
        LOG.debug("Creating weighted directed graph for " + newComponentCandidates.size() + " components.");

        for (final NodePair nodePair : work) {
            completionService.submit(nodePair.getWorkTask(metricComputationStrategy, allMetrics));
        }

        try {
            for (int stepNo = 0; stepNo < totalCount; stepNo++) {
                final ClusteringRelation[] computedRelationPair = completionService.take().get();
                for (final ClusteringRelation relation : computedRelationPair) {
                    previousGraph.addEdge(relation.getSourceComponent(), relation.getTargetComponent(), relation);
                }
                LOG.debug(((stepNo * 100) / totalCount) + "% of clustering done.");
            }
        } catch (final InterruptedException | ExecutionException e) {
            throw new RuntimeException("Parallel execution failed unexpectedly", e);
        }

        final long clusteringTime = System.nanoTime() - startTimeClustering;
        LOG.debug("TIME for Compute All Metrics: " + TimeUnit.NANOSECONDS.toSeconds(clusteringTime) + " s");

        clusteringProgressMonitor.done();
    }

    private Collection<NodePair> deriveComputationWork(final List<ComponentImplementingClassesLink> componentCandidates,
            final DefaultDirectedGraph<ComponentImplementingClassesLink, ClusteringRelation> previousGraph) {
        final Set<ComponentImplementingClassesLink> newNodes = new HashSet<>();
        final Set<ComponentImplementingClassesLink> nodesToRemove = new HashSet<>();

        for (final ComponentImplementingClassesLink link : previousGraph.vertexSet()) {
            if (!componentCandidates.contains(link)) {
                nodesToRemove.add(link);
            }
        }

        previousGraph.removeAllVertices(nodesToRemove);
        final Set<ComponentImplementingClassesLink> oldNodesSet = new HashSet<>(previousGraph.vertexSet());

        for (final ComponentImplementingClassesLink link : componentCandidates) {
            if (!previousGraph.vertexSet().contains(link)) {
                newNodes.add(link);
                previousGraph.addVertex(link);
            }
        }

        assert Collections.disjoint(newNodes, oldNodesSet);

        final int totalCount = ((newNodes.size() * (newNodes.size() - 1)) / 2) + (newNodes.size() * oldNodesSet.size());

        final Collection<NodePair> pairsToCompute = derivePairsToCompute(newNodes, oldNodesSet);
        assert pairsToCompute.size() == totalCount;

        return pairsToCompute;
    }

    private Collection<NodePair> derivePairsToCompute(final Set<ComponentImplementingClassesLink> newNodes,
            final Set<ComponentImplementingClassesLink> oldNodesSet) {
        final Set<NodePair> result = new HashSet<>();
        for (final ComponentImplementingClassesLink oldNode : oldNodesSet) {
            for (final ComponentImplementingClassesLink newNode : newNodes) {
                result.add(new NodePair(newNode, oldNode));
            }
        }
        for (final ComponentImplementingClassesLink newNode1 : newNodes) {
            for (final ComponentImplementingClassesLink newNode2 : newNodes) {
                if (newNode1 != newNode2) {
                    final NodePair newPair = new NodePair(newNode1, newNode2);
                    if (!result.contains(newPair)) {
                        result.add(newPair);
                    }
                }
            }
        }
        return result;
    }

    private DefaultDirectedGraph<ComponentImplementingClassesLink, ClusteringRelation> setupGraph() {
        return new DefaultDirectedGraph<>(ClusteringRelation.class);
    }

    /**
     * Perform the actual clustering of classes into composite components
     *
     * @param sammBuilder       Builder strategy
     * @param relationshipGraph The triangular matrix containing the metrics for the
     *                          relationship of pairwise classes
     * @param iteration         current iteration count
     * @param isMergeCase       indicates a merge or compose creation
     * @return A new list of component candidates which resulted from merging old
     *         component candidates into new components plus all non-clustered
     *         components
     */
    private List<ComponentImplementingClassesLink> componentComposition(final ComponentBuilder sammBuilder,
            final DefaultDirectedGraph<ComponentImplementingClassesLink, ClusteringRelation> relationshipGraph,
            final int iteration, final boolean isMergeCase) {

        final LinkedList<ComponentImplementingClassesLink> result = new LinkedList<>();

        if (LOG.isTraceEnabled()) {
            LOG.trace(relationshipGraph.toString());
        }
        final ConnectivityInspector<ComponentImplementingClassesLink, ClusteringRelation> connectivityInspector = new ConnectivityInspector<>(
                relationshipGraph);

        final List<Set<ComponentImplementingClassesLink>> subGraphs = connectivityInspector.connectedSets();
        LOG.debug("Found " + subGraphs.size() + " strong components in relation graph.");

        int subgraphNo = 1;
        for (final Set<ComponentImplementingClassesLink> componentsToMerge : subGraphs) {
            if (componentsToMerge.size() > 1) {

                LOG.debug("Found a cluster of " + componentsToMerge.size()
                        + " related components. Merging them into a composite component");
                final Graph<ComponentImplementingClassesLink, ClusteringRelation> compositeComponentSubgraph = new AsSubgraph<>(
                        relationshipGraph, componentsToMerge);

                // debug:
                if ((compositeComponentSubgraph.edgeSet().size() > 0) && LOG.isTraceEnabled()) {
                    GraphPrinter.dumpGraph(componentToImplementingClassHelper, compositeComponentSubgraph,
                            somoxConfiguration.getFileLocations().getAnalyserInputFile(), iteration, subgraphNo);
                    subgraphNo++;
                }

                // trigger the builders:
                ComponentImplementingClassesLink newComponent = null;
                if (isMergeCase) {
                    newComponent = sammBuilder.createMergedComponent(compositeComponentSubgraph);
                } else {
                    newComponent = sammBuilder.createCompositeComponent(compositeComponentSubgraph);
                }
                result.add(newComponent);
            } else {
                result.addAll(componentsToMerge);
            }
        }

        return result;
    }

    private IMetric getMetric(final Map<MetricID, IMetric> allMetrics, final MetricID metricId) {
        final IMetric result = allMetrics.get(metricId);

        if (result == null) {
            throw new RuntimeException("Configuration error, Metric " + metricId + " needed but not available");
        }

        return result;
    }
}
