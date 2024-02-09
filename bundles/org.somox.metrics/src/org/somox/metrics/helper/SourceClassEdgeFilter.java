package org.somox.metrics.helper;

import java.util.Set;

import org.somox.filter.BaseFilter;

import tools.mdsd.jamopp.model.java.classifiers.ConcreteClassifier;

//import de.fzi.gast.types.GASTClass;

public class SourceClassEdgeFilter extends BaseFilter<ClassAccessGraphEdge> {

    private final Set<ConcreteClassifier> filteredTarget;

    /**
     *
     * @param filteredTarget positive list of non-filtered target class accesses
     */
    public SourceClassEdgeFilter(final Set<ConcreteClassifier> filteredTarget) {
        this.filteredTarget = filteredTarget;
    }

    @Override
    public boolean passes(final ClassAccessGraphEdge object) {
        return filteredTarget.contains(object.getSourceClazz());
    }

}
