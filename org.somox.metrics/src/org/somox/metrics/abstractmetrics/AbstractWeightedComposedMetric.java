package org.somox.metrics.abstractmetrics;

import java.util.Map;

import org.somox.configuration.SoMoXConfiguration;
import org.somox.metrics.ICompositionFunction;
import org.somox.metrics.MetricID;

public abstract class AbstractWeightedComposedMetric extends AbstractComposedMetric {

	private final double[] weights = getWeigths();
	
	private final ICompositionFunction function = new ICompositionFunction() {
		
		@Override
		public double computeOverallDirectedMetricValue(
				Map<MetricID, Double> metricValues) {
			double weightSum = 0.0;
			double weightedSum = 0.0;
			for (int i = 0; i < AbstractWeightedComposedMetric.this.weights.length; i++) {
				double metricValue = metricValues.get(AbstractWeightedComposedMetric.this.getAllChildMetrics()[i]);
				double weight = AbstractWeightedComposedMetric.this.weights[i];
				weightSum += weight;
				weightedSum += metricValue * weight;
			}
			return weightedSum / weightSum;
		}
	};
	
	@Override
	protected ICompositionFunction getCompositionFunction(
			SoMoXConfiguration somoxConfiguration) {
		return function;
	}

	protected abstract double[] getWeigths();

	@Override
	public boolean isNormalised() {
		return true;
	}
}
