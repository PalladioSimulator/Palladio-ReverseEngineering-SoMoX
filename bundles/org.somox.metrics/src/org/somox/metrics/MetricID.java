package org.somox.metrics;

import java.util.Objects;

/**
 * A string based identifier of a metric used in SoMoX.
 *
 * @author snowball
 */
public class MetricID {

    private final String metricID;

    public MetricID(final String id) {
        if (id == null) {
            throw new IllegalArgumentException("Metric ID must not be null");
        }

        metricID = id;
    }

    public String getMetricID() {
        return metricID;
    }

    @Override
    public String toString() {
        return metricID;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(metricID);
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (this.getClass() != obj.getClass())) {
            return false;
        }
        final MetricID other = (MetricID) obj;
        if (!metricID.equals(other.metricID)) {
            return false;
        }
        return true;
    }

}