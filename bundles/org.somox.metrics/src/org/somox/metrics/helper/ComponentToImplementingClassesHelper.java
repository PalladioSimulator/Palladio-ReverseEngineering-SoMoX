package org.somox.metrics.helper;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//import de.fzi.gast.types.GASTClass;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;
import org.somox.sourcecodedecorator.InterfaceSourceCodeLink;

import tools.mdsd.jamopp.model.java.classifiers.ConcreteClassifier;
import tools.mdsd.jamopp.model.java.types.Type;

/**
 * Helper for calculating recursively associated classes for a component.
 *
 * @author Steffen Becker, Klaus Krogmann
 */
public class ComponentToImplementingClassesHelper {

    /**
     * collects all implementing GAST classes (recursively derived) for a
     * {@link ComponentImplementingClassesLink}.
     */
    private final Map<ComponentImplementingClassesLink, Set<ConcreteClassifier>> mapOfImplementingClasses;

    /**
     * Constructs a new helper
     */
    public ComponentToImplementingClassesHelper() {
        mapOfImplementingClasses = new HashMap<>();
    }

    /**
     * Calculates a list of implementing classes derived for the input
     *
     * <pre>
     * componentCandidate
     * </pre>
     *
     * . The list of implementing classes is derived recursively for the component
     * candidate.
     *
     * @param componentCandidate The component for which to return its implementing
     *                           classes
     * @return Implementing classes of this and all sub-components.
     */
    public synchronized Set<ConcreteClassifier> deriveImplementingClasses(
            final ComponentImplementingClassesLink componentCandidate) {
        if (!mapOfImplementingClasses.containsKey(componentCandidate)) {

            // removelater
            // if(componentCandidate.getImplementingClasses().get(0).getName().equals("ProductStockItemTableModel")){
            // int i =0;
            // }

            final Set<ConcreteClassifier> classSet = new HashSet<>();
            // Collect our own classes
            for (final Type type : componentCandidate.getImplementingClasses()) {
                if (type instanceof ConcreteClassifier) {
                    classSet.add((ConcreteClassifier) type);
                }
            }
            // Collect all implementing classes of all sub components
            for (final ComponentImplementingClassesLink subComponent : componentCandidate.getSubComponents()) {
                classSet.addAll(deriveImplementingClasses(subComponent));
            }
            // Add the components provided interfaces class sources to the component, needed
            // for
            // metrics like coupling, etc.
            for (final InterfaceSourceCodeLink providedIfLink : componentCandidate.getProvidedInterfaces()) {
                if (!classSet.contains(providedIfLink.getGastClass())
                        && (providedIfLink.getGastClass() instanceof ConcreteClassifier)) {
                    classSet.add(providedIfLink.getGastClass());
                }
            }
            if (classSet.size() == 0) {
                throw new RuntimeException("Component must have associated classes");
            }
            mapOfImplementingClasses.put(componentCandidate, classSet);
        }
        final Set<ConcreteClassifier> result = mapOfImplementingClasses.get(componentCandidate);
        if (result == null) {
            throw new IllegalStateException(
                    "The component to class cache did not contain a value which has been asserted to be there. "
                            + "There might be a concurrency issue here");
        }
        return result;
    }

    /**
     * Collects all implementation classes for the given list of component
     * candidates
     *
     * @param componentCandidates A list of component candidates for which to
     *                            collect their implementing classes
     * @return The set of classes used to implement the list of components
     */
    public Set<ConcreteClassifier> collectAllClasses(final List<ComponentImplementingClassesLink> componentCandidates) {
        final Set<ConcreteClassifier> allOtherComponentClasses = new HashSet<>();
        for (final ComponentImplementingClassesLink classLink : componentCandidates) {
            allOtherComponentClasses.addAll(deriveImplementingClasses(classLink));
        }
        return allOtherComponentClasses;
    }
}
