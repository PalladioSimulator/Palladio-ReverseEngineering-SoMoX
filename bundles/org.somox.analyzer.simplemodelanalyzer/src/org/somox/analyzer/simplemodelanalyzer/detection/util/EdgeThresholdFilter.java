package org.somox.analyzer.simplemodelanalyzer.detection.util;

import org.somox.filter.BaseFilter;
import org.somox.metrics.ClusteringRelation;
import org.somox.metrics.MetricID;

/**
 * Filters based on edge threshold hold only.
 *
 */
public class EdgeThresholdFilter extends BaseFilter<ClusteringRelation> {

    private final MetricID metric;
    private final double threshold;

    public EdgeThresholdFilter(final MetricID metric, final double threshold) {
        this.metric = metric;
        this.threshold = threshold;
    }

    @Override
    public boolean passes(final ClusteringRelation object) {
        assert object.getResult().containsKey(metric);
        final double relationValue = object.getResult().get(metric);
        return relationValue > threshold;
    }
}
