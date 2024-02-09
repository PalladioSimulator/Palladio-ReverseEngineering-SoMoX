package org.somox.filter;

import java.util.Set;

import tools.mdsd.jamopp.model.java.types.Type;

/**
 * Removes one set from another set.
 *
 */
public class SubstractFilter extends BaseFilter<Type> {

    private final Set<Type> classesToRemove;

    public SubstractFilter(final Set<Type> classesToRemove) {
        this.classesToRemove = classesToRemove;
    }

    @Override
    public boolean passes(final Type object) {
        return !classesToRemove.contains(object);
    }

}
