package org.somox.metrics.basic;

import java.util.Set;

import org.somox.metrics.ClusteringRelation;
import org.somox.metrics.MetricID;
import org.somox.metrics.abstractmetrics.AbstractCountingMetric;

import tools.mdsd.jamopp.model.java.classifiers.ConcreteClassifier;

public class TotalTypesCount extends AbstractCountingMetric {

    public static final MetricID METRIC_ID = new MetricID("org.somox.metrics.basic.TotalTypesCount");

    @Override
    protected void internalComputeDirected(final ClusteringRelation relationToCompute) {
        final Set<ConcreteClassifier> allClasses = this.calculateUnion(relationToCompute.getSourceComponent(),
                relationToCompute.getTargetComponent());
        relationToCompute.setResultMetric(getMID(), allClasses.size());
    }

    @Override
    public MetricID getMID() {
        return METRIC_ID;
    }

    @Override
    public boolean isCommutative() {
        return true;
    }

}
