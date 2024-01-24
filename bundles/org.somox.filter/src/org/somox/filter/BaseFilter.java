package org.somox.filter;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * See documentation at
 * http://www.erik-rasmussen.com/blog/2008/01/18/the-filter-pattern-java-conditional-abstraction-
 * with-iterables/
 *
 * @author Steffen Becker
 * @param <T> type of the objects to be filtered
 */
public abstract class BaseFilter<T> {
    public abstract boolean passes(T object);

    public Iterator<T> filter(final Iterator<T> iterator) {
        return new FilterIterator(iterator);
    }

    public Iterable<T> filter(final Iterable<T> iterable) {
        return () -> BaseFilter.this.filter(iterable.iterator());
    }

    private class FilterIterator implements Iterator<T> {
        private final Iterator<T> iterator;
        private T next;

        private FilterIterator(final Iterator<T> iterator) {
            this.iterator = iterator;
            this.toNext();
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public T next() {
            if (next == null) {
                throw new NoSuchElementException();
            }
            final T returnValue = next;
            this.toNext();
            return returnValue;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private void toNext() {
            next = null;
            while (iterator.hasNext()) {
                final T item = iterator.next();
                if ((item != null) && BaseFilter.this.passes(item)) {
                    next = item;
                    break;
                }
            }
        }
    }
}