package org.somox.filter;

import java.util.ArrayList;
import java.util.Arrays;

public class ComposedFilter<T> extends BaseFilter<T> {

    final private ArrayList<BaseFilter<T>> innerFilter = new ArrayList<>();

    public ComposedFilter(final BaseFilter<T>... innerFilter) {
        this.addFilter(innerFilter);
    }

    @Override
    public boolean passes(final T object) {
        for (final BaseFilter<T> inner : innerFilter) {
            if (!inner.passes(object)) {
                return false;
            }
        }
        return true;
    }

    public void addFilter(final BaseFilter<T>... filters) {
        innerFilter.addAll(Arrays.asList(filters));
    }

}
