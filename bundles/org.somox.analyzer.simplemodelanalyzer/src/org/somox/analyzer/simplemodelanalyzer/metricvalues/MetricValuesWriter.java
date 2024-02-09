package org.somox.analyzer.simplemodelanalyzer.metricvalues;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.somox.analyzer.simplemodelanalyzer.Activator;
import org.somox.configuration.SoMoXConfiguration;
import org.somox.metrics.ClusteringRelation;
import org.somox.metrics.MetricID;
//import de.fzi.gast.types.GASTClass;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;

import metricvalues.Component;
import metricvalues.ComponentCandidate;
import metricvalues.Iteration;
import metricvalues.MetricValue;
import metricvalues.MetricValuesModel;
import metricvalues.MetricvaluesFactory;
import tools.mdsd.jamopp.model.java.classifiers.ConcreteClassifier;

public class MetricValuesWriter {

    private static final String CONFIG_METRIC_VALUES_MODEL_PROPERTIES_FILE = "/config/MetricValuesModel.properties";

    private static final String CONFIG_METRIC_VALUES_MODEL_PATH = "metricvaluesmodel.path";

    private final SoMoXConfiguration somoxConfiguration;

    public MetricValuesWriter(final SoMoXConfiguration somoxConfiguration) {
        this.somoxConfiguration = somoxConfiguration;
    }

    public void saveMetricValuesModel(
            final DefaultDirectedGraph<ComponentImplementingClassesLink, ClusteringRelation> metricsGraph,
            final int iteration, final double currentThreshold,
            final List<ComponentImplementingClassesLink> componentCandidates, final boolean isMergeIteration) {

        final URI resourceURI = getMetricValuesPlatformResourceURI();

        final ResourceSet resourceSet = new ResourceSetImpl();
        final URI normalized = resourceSet.getURIConverter().normalize(resourceURI);
        Resource resource = null;
        MetricValuesModel model = null;

        if (iteration == 1) {
            resource = resourceSet.createResource(normalized);
            model = MetricvaluesFactory.eINSTANCE.createMetricValuesModel();
            setModelAttributes(model);
        } else {
            resource = resourceSet.getResource(normalized, true);

            model = (MetricValuesModel) resource.getContents().get(0);
        }

        final Iteration currentIteration = createCurrentIteration(metricsGraph, iteration, currentThreshold,
                componentCandidates, isMergeIteration);

        model.getIterations().add(currentIteration);// REALLYCHANGEMF

        if (iteration == 1) {
            resource.getContents().add(model);
        }

        try {
            resource.save(Collections.EMPTY_MAP);

        } catch (final IOException e) {
        }

        Activator.getDefault().getLog()
                .log(new Status(IStatus.INFO, Activator.PLUGIN_ID, "Saved metric values of iteration " + iteration));
    }

    private void setModelAttributes(final MetricValuesModel model) {
        model.setMinCompThreshold(somoxConfiguration.getClusteringConfig().getMinComposeClusteringThreshold());
        model.setMaxMergeThreshold(somoxConfiguration.getClusteringConfig().getMaxMergeClusteringThreshold());
        model.setWeightDirectoryMapping(somoxConfiguration.getWeightDirectoryMapping());
        model.setWeightDMS(somoxConfiguration.getWeightDMS());
        model.setWeightHighCoupling(somoxConfiguration.getWeightHighCoupling());
        model.setWeightHighNameResemblance(somoxConfiguration.getWeightHighNameResemblance());
        model.setWeightHighSLAQ(somoxConfiguration.getWeightHighSLAQ());
        model.setWeightHighestNameResemblance(somoxConfiguration.getWeightHighestNameResemblance());
        model.setWeightInterfaceViolationIrrelevant(somoxConfiguration.getWeightInterfaceViolationIrrelevant());
        model.setWeightInterfaceViolationRelevant(somoxConfiguration.getWeightInterfaceViolationRelevant());
        model.setWeightLowCoupling(somoxConfiguration.getWeightLowCoupling());
        model.setWeightLowNameResemblance(somoxConfiguration.getWeightLowNameResemblance());
        model.setWeightLowSLAQ(somoxConfiguration.getWeightLowSLAQ());
        model.setWeightMidNameResemblance(somoxConfiguration.getWeightMidNameResemblance());
        model.setWeightPackageMapping(somoxConfiguration.getWeightPackageMapping());
        model.setWildcardKey(getBlacklistString(somoxConfiguration.getBlacklist()));
        model.setMinMergeThreshold(somoxConfiguration.getClusteringConfig().getMinMergeClusteringThreshold());
        model.setMaxComposeThreshold(somoxConfiguration.getClusteringConfig().getMaxComposeClusteringThreshold());
        model.setComposeThresholdDecrement(
                somoxConfiguration.getClusteringConfig().getClusteringComposeThresholdDecrement());
        model.setMergeThresholdDecrement(
                somoxConfiguration.getClusteringConfig().getClusteringMergeThresholdDecrement());
        model.setExcludedPrefixesForNameResemblance(somoxConfiguration.getExcludedPrefixesForNameResemblance());
        model.setExcludedSuffixesForNameResemblance(somoxConfiguration.getExcludedSuffixesForNameResemblance());
    }

    private String getBlacklistString(final Set<String> blacklist) {
        final StringBuilder blacklistString = new StringBuilder();
        for (final String string : blacklist) {
            blacklistString.append(string + SoMoXConfiguration.SOMOX_WILDCARD_DELIMITER);
        }
        return blacklistString.toString();
    }

    private Iteration createCurrentIteration(
            final DefaultDirectedGraph<ComponentImplementingClassesLink, ClusteringRelation> metricsGraph,
            final int iteration, final double currentThreshold,
            final List<ComponentImplementingClassesLink> componentCandidates, final boolean isMergeIteration) {
        final Iteration currentIteration = MetricvaluesFactory.eINSTANCE.createIteration();
        currentIteration.setNumber(iteration);
        // TODO FIXME: Depending on the isMergeIteration in any case only one of the
        // values makes
        // sense...
        // so only current should be stored
        currentIteration.setCurCompThreshold(currentThreshold);
        currentIteration.setCurMergeThreshold(currentThreshold);
        currentIteration.setIsMergeIteration(isMergeIteration);

        createComponents(componentCandidates, currentIteration);
        createComponentCandidates(metricsGraph, currentIteration);

        return currentIteration;
    }

    private void createComponentCandidates(
            final DefaultDirectedGraph<ComponentImplementingClassesLink, ClusteringRelation> metricsGraph,
            final Iteration currentIteration) {
        final Set<ClusteringRelation> edges = metricsGraph.edgeSet();
        for (final ClusteringRelation clusteringRelation : edges) {
            final ComponentCandidate compCandidate = MetricvaluesFactory.eINSTANCE.createComponentCandidate();
            final RepositoryComponent compA = clusteringRelation.getSourceComponent().getComponent();
            final RepositoryComponent compB = clusteringRelation.getTargetComponent().getComponent();

            for (final Component component : currentIteration.getComponents())// REALLYCHANGEMF
            {
                if (component.getId().equals(compA.getId())) {
                    compCandidate.setFirstComponent(component);
                } else if (component.getId().equals(compB.getId())) {
                    compCandidate.setSecondComponent(component);
                }
            }

            createMetricValue(clusteringRelation, compCandidate);

            currentIteration.getComponentCandidates().add(compCandidate);// REALLYCHANGEMF
        }
    }

    private void createMetricValue(final ClusteringRelation clusteringRelation,
            final ComponentCandidate compCandidate) {
        final Set<Entry<MetricID, Double>> clusteringMetrics = clusteringRelation.getResult().entrySet();
        for (final Entry<MetricID, Double> entry : clusteringMetrics) {
            final MetricValue metricValue = MetricvaluesFactory.eINSTANCE.createMetricValue();
            metricValue.setMetricID(entry.getKey().getMetricID());
            metricValue.setValue(entry.getValue());
            compCandidate.getMetricValues().add(metricValue);// REALLYCHANGEMF
        }
    }

    private void createComponents(final List<ComponentImplementingClassesLink> components,
            final Iteration currentIteration) {
        for (final ComponentImplementingClassesLink compLink : components) {
            final Component component = createComponent(currentIteration, compLink);

            currentIteration.getComponents().add(component);// REALLYCHANGEMF
        }
    }

    private Component createComponent(final Iteration currentIteration,
            final ComponentImplementingClassesLink compCand) {
        final Component component = MetricvaluesFactory.eINSTANCE.createComponent();
        final RepositoryComponent comp = compCand.getComponent();
        component.setId(comp.getId());
        component.setName(comp.getEntityName());

        final List<ConcreteClassifier> classes = compCand.getImplementingClasses();
        component.getClasses().addAll(classes);

        final List<ComponentImplementingClassesLink> subComponents = compCand.getSubComponents();
        for (final ComponentImplementingClassesLink componentImplementingClassesLink : subComponents) {
            final Component subComponent = createComponent(currentIteration, componentImplementingClassesLink);
            component.getSubComponents().add(subComponent);// REALLYCHANGEMF
        }

        return component;
    }

    // private Component createComponent(ComponentType comp)
    // {
    // Component component = MetricvaluesFactory.eINSTANCE.createComponent();
    // if (comp instanceof CompositeComponent)
    // {
    // List<SubcomponentInstance> subcomponents = ((CompositeComponent)
    // comp).getSubcomponents();
    // for (SubcomponentInstance subcomponentInstance : subcomponents)
    // {
    // ComponentType subcomponent = subcomponentInstance.getRealizedBy();
    // Component newComponent = createComponent(subcomponent);
    // component.getSubComponentsList().add(newComponent);
    // }
    // }
    //
    // return component;
    // }

    private URI getMetricValuesPlatformResourceURI() {
        final Properties properties = new Properties();
        try {
            final InputStream inStream = Activator.getDefault().getBundle()
                    .getEntry(CONFIG_METRIC_VALUES_MODEL_PROPERTIES_FILE).openStream();
            properties.load(inStream);
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return URI.createPlatformResourceURI(new File(somoxConfiguration.getFileLocations().getOutputFolder() + "/"
                + properties.getProperty(CONFIG_METRIC_VALUES_MODEL_PATH)).getPath(), true);
    }

}
