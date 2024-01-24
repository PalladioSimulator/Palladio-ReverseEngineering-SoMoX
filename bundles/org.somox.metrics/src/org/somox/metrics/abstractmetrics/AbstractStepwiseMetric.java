package org.somox.metrics.abstractmetrics;

import org.somox.configuration.SoMoXConfiguration;
import org.somox.metrics.ICompositionFunction;

public abstract class AbstractStepwiseMetric extends AbstractComposedMetric {

    public class BoundAndWeightStruct {
        private final double upperBound;
        private final double weight;

        public BoundAndWeightStruct(final double upperBound, final double weight) {
            this.upperBound = upperBound;
            this.weight = weight;
        }

        /**
         * @return the upperBound
         */
        public double getUpperBound() {
            return upperBound;
        }

        /**
         * @return the weight
         */
        public double getWeight() {
            return weight;
        }
    }

    protected BoundAndWeightStruct[] boundsAndWeights = getBoundsAndWeights();
    private final ICompositionFunction function = metricValues -> {
        assert getAllChildMetrics().length == 1;
        final double innerMetricValue = metricValues.get(getAllChildMetrics()[0].getMID());
        for (final BoundAndWeightStruct range : boundsAndWeights) {
            if (innerMetricValue < range.getUpperBound()) {
                return innerMetricValue * range.getWeight();
            }
        }
        return innerMetricValue;
    };

    @Override
    protected ICompositionFunction getCompositionFunction(final SoMoXConfiguration somoxConfiguration) {
        return function;
    }

    @Override
    public boolean isNormalised() {
        return true;
    }

    protected abstract BoundAndWeightStruct[] getBoundsAndWeights();
}
