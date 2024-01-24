package org.somox.metrics.abstractmetrics;

import org.somox.configuration.SoMoXConfiguration;
import org.somox.metrics.ICompositionFunction;

public abstract class AbstractWeightedComposedMetric extends AbstractComposedMetric {

    private final double[] weights = getWeigths();

    private final ICompositionFunction function = metricValues -> {
        double weightSum = 0.0;
        double weightedSum = 0.0;
        for (int i = 0; i < weights.length; i++) {
            final double metricValue = metricValues.get(getAllChildMetrics()[i]);
            final double weight = weights[i];
            weightSum += weight;
            weightedSum += metricValue * weight;
        }
        return weightedSum / weightSum;
    };

    @Override
    protected ICompositionFunction getCompositionFunction(final SoMoXConfiguration somoxConfiguration) {
        return function;
    }

    protected abstract double[] getWeigths();

    @Override
    public boolean isNormalised() {
        return true;
    }
}
