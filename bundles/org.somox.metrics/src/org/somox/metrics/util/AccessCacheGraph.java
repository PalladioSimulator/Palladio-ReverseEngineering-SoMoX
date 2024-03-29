package org.somox.metrics.util;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.somox.filter.BaseFilter;
import org.somox.filter.NotFilter;
import org.somox.metrics.helper.ClassAccessGraphEdge;
import org.somox.metrics.helper.SourceClassEdgeFilter;
import org.somox.metrics.helper.TargetClassEdgeFilter;

import tools.mdsd.jamopp.model.java.classifiers.ConcreteClassifier;

//import de.fzi.gast.types.GASTClass;

/**
 * Class used to encapsulate all computations based on the number of accesses
 * between two pairwise GASTClasses
 *
 * @author Steffen Becker
 */
public class AccessCacheGraph {

    /**
     * Logger of this class
     */
    private final Logger logger = Logger.getLogger(AccessCacheGraph.class);

    /**
     * A graph serving as cache for the number of accesses from each GASTClass to
     * each other GASTClass
     */
    private final DefaultDirectedGraph<ConcreteClassifier, ClassAccessGraphEdge> accessGraph;

    /**
     * Constructor of the access cache
     *
     * @param accessGraph A graph containing as nodes all GASTClasses considered in
     *                    the Somox run and as edges the number of directed accesses
     *                    between the two connected classes
     */
    public AccessCacheGraph(final DefaultDirectedGraph<ConcreteClassifier, ClassAccessGraphEdge> accessGraph) {
        this.accessGraph = accessGraph;
    }

    /**
     * Counts all directed accesses from any of the source classes to any of the
     * target classes. (Does not consider inverse accesses.)
     *
     * @param sourceClasses A set of source classes (nodes in the cache graph)
     * @param targetClasses A set of target classes (nodes in the cache graph)
     * @return count of accesses The number of total accesses from sourceClasses to
     *         targetClasses
     */
    public long calculateNumberOfAccessesToClassesInSet(final Set<ConcreteClassifier> sourceClasses,
            final Set<ConcreteClassifier> targetClasses) {

        if ((sourceClasses == null) || (targetClasses == null)) {
            throw new IllegalArgumentException("Source or target classes must not be null");
        }

        final TargetClassEdgeFilter filter = new TargetClassEdgeFilter(targetClasses);
        return getNumberOfFilteredOutgoingAccesses(sourceClasses, filter);
    }

    /**
     * Compute the number of accesses coming from any class outside and going to the
     * set of classes given
     *
     * @param sourceClasses A set of classes for which the incoming accesses are
     *                      counted
     * @return The total number of incoming accesses to the set of classes
     */
    public long calculateNumberOfIncommingAccesses(final Set<ConcreteClassifier> sourceClasses) {

        final BaseFilter<ClassAccessGraphEdge> filter = new NotFilter<>(new SourceClassEdgeFilter(sourceClasses));

        return getNumberOfFilteredIncomingAccesses(sourceClasses, filter);
    }

    /**
     * Calculates the number of outgoing accesses of any class in
     *
     * <pre>
     * sourceClasses
     * </pre>
     *
     * to any class not contained in source classes.
     *
     * @param sourceClasses The set of classes
     * @return Count of accesses
     */
    public long calculateNumberOfExternalAccesses(final Set<ConcreteClassifier> sourceClasses) {

        final BaseFilter<ClassAccessGraphEdge> filter = new NotFilter<>(new TargetClassEdgeFilter(sourceClasses));

        final long result = getNumberOfFilteredOutgoingAccesses(sourceClasses, filter);

        if (logger.isDebugEnabled()) {
            final Set<ConcreteClassifier> otherClasses = substractSet(accessGraph.vertexSet(), sourceClasses);
            assert result == calculateNumberOfAccessesToClassesInSet(sourceClasses, otherClasses);
        }

        return result;
    }

    /**
     * Calculates the number of inner accesses of any class in
     *
     * <pre>
     * sourceClasses
     * </pre>
     *
     * to any class contained in source classes.
     *
     * @param sourceClasses
     * @return Count of accesses
     */
    public long calculateNumberOfInternalAccesses(final Set<ConcreteClassifier> sourceClasses) {

        final BaseFilter<ClassAccessGraphEdge> filter = new TargetClassEdgeFilter(sourceClasses);

        final long result = getNumberOfFilteredOutgoingAccesses(sourceClasses, filter);

        if (logger.isDebugEnabled()) {
            assert result == calculateNumberOfAccessesToClassesInSet(sourceClasses, sourceClasses);
        }

        return result;
    }

    /**
     * Computes source - setToRemove
     *
     * @param source      Source Set
     * @param setToRemove Elements to be removed from source set
     * @return source - setToRemove
     */
    private Set<ConcreteClassifier> substractSet(final Set<ConcreteClassifier> source,
            final Set<ConcreteClassifier> setToRemove) {
        final Set<ConcreteClassifier> otherClasses = new HashSet<>();
        for (final ConcreteClassifier clazz : source) {
            if (!setToRemove.contains(clazz)) {
                otherClasses.add(clazz);
            }
        }
        return otherClasses;
    }

    private long getNumberOfFilteredOutgoingAccesses(final Set<ConcreteClassifier> sourceClasses,
            final BaseFilter<ClassAccessGraphEdge> filter) {
        // removelater
        // Helper.writeToFile("interfacecount.txt", "start");
        if (sourceClasses == null) {
            throw new IllegalArgumentException("Source classes must not be null.");
        }

        long numberOfReferences = 0;
        for (final ConcreteClassifier clazz : sourceClasses) {
            try {
                if (clazz.toString().startsWith("I")) {
                }

                if (!accessGraph.vertexSet().contains(clazz)) {
                }
                assert accessGraph.vertexSet().contains(clazz);
                if (accessGraph.outDegreeOf(clazz) > 0) {
                    for (final ClassAccessGraphEdge edge : filter.filter(accessGraph.outgoingEdgesOf(clazz))) {
                        numberOfReferences += edge.getCount();
                        // removelater
                        // Helper.writeToFile("interfacecount.txt",
                        // GASTClassHelper.computeFullQualifiedName(edge.getTargetClazz()) + " " +
                        // edge.getCount());
                    }
                }
            } catch (final IllegalArgumentException e) {
                // if edge of type clazz is not present, an illegal argument
                // exception is thrown
                throw new RuntimeException("This should never happen as outDegree was > 0", e);
            }
        }
        // removelater
        // Helper.writeToFile("interfacecount.txt", "end");

        return numberOfReferences;
    }

    private long getNumberOfFilteredIncomingAccesses(final Set<ConcreteClassifier> sourceClasses,
            final BaseFilter<ClassAccessGraphEdge> filter) {
        long numberOfReferences = 0;
        for (final ConcreteClassifier clazz : sourceClasses) {
            try {
                assert accessGraph.vertexSet().contains(clazz);
                if (accessGraph.inDegreeOf(clazz) > 0) {
                    for (final ClassAccessGraphEdge edge : filter.filter(accessGraph.incomingEdgesOf(clazz))) {
                        numberOfReferences += edge.getCount();
                    }
                }
            } catch (final IllegalArgumentException e) {
                // if edge of type clazz is not present, an illegal argument
                // exception is thrown: do nothing
                throw new RuntimeException("This should never happen as outDegree was > 0", e);
            }
        }
        return numberOfReferences;
    }
}
