package org.somox.filter;

public class NotFilter<T> extends BaseFilter<T> {

    private BaseFilter<T> innerFilter = null;

    public NotFilter(final BaseFilter<T> innerFilter) {
        this.innerFilter = innerFilter;
    }

    @Override
    public boolean passes(final T object) {
        return !innerFilter.passes(object);
    }

}
