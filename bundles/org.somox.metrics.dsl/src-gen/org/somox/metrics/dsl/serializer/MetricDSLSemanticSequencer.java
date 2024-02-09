package org.somox.metrics.dsl.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.somox.metrics.dsl.metricDSL.BoundAndWeight;
import org.somox.metrics.dsl.metricDSL.Constant;
import org.somox.metrics.dsl.metricDSL.ExternalMetric;
import org.somox.metrics.dsl.metricDSL.InternalMetric;
import org.somox.metrics.dsl.metricDSL.MetricAndWeight;
import org.somox.metrics.dsl.metricDSL.MetricDSLPackage;
import org.somox.metrics.dsl.metricDSL.MetricModel;
import org.somox.metrics.dsl.metricDSL.Parameter;
import org.somox.metrics.dsl.metricDSL.RatioMetric;
import org.somox.metrics.dsl.metricDSL.StepwiseMetric;
import org.somox.metrics.dsl.metricDSL.WeightedMetric;
import org.somox.metrics.dsl.services.MetricDSLGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class MetricDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

    @Inject
    private MetricDSLGrammarAccess grammarAccess;

    @Override
    public void createSequence(final EObject context, final EObject semanticObject) {
        if (semanticObject.eClass().getEPackage() == MetricDSLPackage.eINSTANCE) {
            switch (semanticObject.eClass().getClassifierID()) {
            case MetricDSLPackage.BOUND_AND_WEIGHT:
                if (context == grammarAccess.getBoundAndWeightRule()) {
                    sequence_BoundAndWeight(context, (BoundAndWeight) semanticObject);
                    return;
                } else {
                    break;
                }
            case MetricDSLPackage.CONSTANT:
                if ((context == grammarAccess.getConstantRule()) || (context == grammarAccess.getNumberRule())) {
                    sequence_Constant(context, (Constant) semanticObject);
                    return;
                } else {
                    break;
                }
            case MetricDSLPackage.EXTERNAL_METRIC:
                if ((context == grammarAccess.getExternalMetricRule()) || (context == grammarAccess.getMetricRule())) {
                    sequence_ExternalMetric(context, (ExternalMetric) semanticObject);
                    return;
                } else {
                    break;
                }
            case MetricDSLPackage.INTERNAL_METRIC:
                if ((context == grammarAccess.getInternalMetricRule()) || (context == grammarAccess.getMetricRule())) {
                    sequence_InternalMetric(context, (InternalMetric) semanticObject);
                    return;
                } else {
                    break;
                }
            case MetricDSLPackage.METRIC_AND_WEIGHT:
                if (context == grammarAccess.getMetricAndWeightRule()) {
                    sequence_MetricAndWeight(context, (MetricAndWeight) semanticObject);
                    return;
                } else {
                    break;
                }
            case MetricDSLPackage.METRIC_MODEL:
                if (context == grammarAccess.getMetricModelRule()) {
                    sequence_MetricModel(context, (MetricModel) semanticObject);
                    return;
                } else {
                    break;
                }
            case MetricDSLPackage.PARAMETER:
                if ((context == grammarAccess.getNumberRule()) || (context == grammarAccess.getParameterRule())) {
                    sequence_Parameter(context, (Parameter) semanticObject);
                    return;
                } else {
                    break;
                }
            case MetricDSLPackage.RATIO_METRIC:
                if ((context == grammarAccess.getMetricDefinitionRule())
                        || (context == grammarAccess.getRatioMetricRule())) {
                    sequence_RatioMetric(context, (RatioMetric) semanticObject);
                    return;
                } else {
                    break;
                }
            case MetricDSLPackage.STEPWISE_METRIC:
                if ((context == grammarAccess.getMetricDefinitionRule())
                        || (context == grammarAccess.getStepwiseMetricRule())) {
                    sequence_StepwiseMetric(context, (StepwiseMetric) semanticObject);
                    return;
                } else {
                    break;
                }
            case MetricDSLPackage.WEIGHTED_METRIC:
                if ((context == grammarAccess.getMetricDefinitionRule())
                        || (context == grammarAccess.getWeightedMetricRule())) {
                    sequence_WeightedMetric(context, (WeightedMetric) semanticObject);
                    return;
                }
                break;
            }
        }
        if (errorAcceptor != null) {
            errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
        }
    }

    /**
     * Constraint: (upperBound=[Number|MYID] weight=[Number|MYID])
     */
    protected void sequence_BoundAndWeight(final EObject context, final BoundAndWeight semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject,
                    MetricDSLPackage.Literals.BOUND_AND_WEIGHT__UPPER_BOUND) == ValueTransient.YES) {
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
                        MetricDSLPackage.Literals.BOUND_AND_WEIGHT__UPPER_BOUND));
            }
            if (transientValues.isValueTransient(semanticObject,
                    MetricDSLPackage.Literals.BOUND_AND_WEIGHT__WEIGHT) == ValueTransient.YES) {
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
                        MetricDSLPackage.Literals.BOUND_AND_WEIGHT__WEIGHT));
            }
        }
        final INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
        final SequenceFeeder feeder = this.createSequencerFeeder(semanticObject, nodes);
        feeder.accept(grammarAccess.getBoundAndWeightAccess().getUpperBoundNumberMYIDParserRuleCall_1_0_1(),
                semanticObject.getUpperBound());
        feeder.accept(grammarAccess.getBoundAndWeightAccess().getWeightNumberMYIDParserRuleCall_3_0_1(),
                semanticObject.getWeight());
        feeder.finish();
    }

    /**
     * Constraint: (name=MYID value=DOUBLE)
     */
    protected void sequence_Constant(final EObject context, final Constant semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject,
                    MetricDSLPackage.Literals.NUMBER__NAME) == ValueTransient.YES) {
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
                        MetricDSLPackage.Literals.NUMBER__NAME));
            }
            if (transientValues.isValueTransient(semanticObject,
                    MetricDSLPackage.Literals.CONSTANT__VALUE) == ValueTransient.YES) {
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
                        MetricDSLPackage.Literals.CONSTANT__VALUE));
            }
        }
        final INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
        final SequenceFeeder feeder = this.createSequencerFeeder(semanticObject, nodes);
        feeder.accept(grammarAccess.getConstantAccess().getNameMYIDParserRuleCall_1_0(), semanticObject.getName());
        feeder.accept(grammarAccess.getConstantAccess().getValueDOUBLETerminalRuleCall_3_0(),
                semanticObject.getValue());
        feeder.finish();
    }

    /**
     * Constraint: name=MYID
     */
    protected void sequence_ExternalMetric(final EObject context, final ExternalMetric semanticObject) {
        if ((errorAcceptor != null) && (transientValues.isValueTransient(semanticObject,
                MetricDSLPackage.Literals.METRIC__NAME) == ValueTransient.YES)) {
            errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
                    MetricDSLPackage.Literals.METRIC__NAME));
        }
        final INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
        final SequenceFeeder feeder = this.createSequencerFeeder(semanticObject, nodes);
        feeder.accept(grammarAccess.getExternalMetricAccess().getNameMYIDParserRuleCall_0(), semanticObject.getName());
        feeder.finish();
    }

    /**
     * Constraint: (name=MYID shortName=STRING description=STRING parameter+=Number*
     * definition=MetricDefinition)
     */
    protected void sequence_InternalMetric(final EObject context, final InternalMetric semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }

    /**
     * Constraint: (metric=[Metric|MYID] weight=[Number|MYID])
     */
    protected void sequence_MetricAndWeight(final EObject context, final MetricAndWeight semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject,
                    MetricDSLPackage.Literals.METRIC_AND_WEIGHT__METRIC) == ValueTransient.YES) {
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
                        MetricDSLPackage.Literals.METRIC_AND_WEIGHT__METRIC));
            }
            if (transientValues.isValueTransient(semanticObject,
                    MetricDSLPackage.Literals.METRIC_AND_WEIGHT__WEIGHT) == ValueTransient.YES) {
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
                        MetricDSLPackage.Literals.METRIC_AND_WEIGHT__WEIGHT));
            }
        }
        final INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
        final SequenceFeeder feeder = this.createSequencerFeeder(semanticObject, nodes);
        feeder.accept(grammarAccess.getMetricAndWeightAccess().getMetricMetricMYIDParserRuleCall_1_0_1(),
                semanticObject.getMetric());
        feeder.accept(grammarAccess.getMetricAndWeightAccess().getWeightNumberMYIDParserRuleCall_3_0_1(),
                semanticObject.getWeight());
        feeder.finish();
    }

    /**
     * Constraint: (importURI+=STRING* metrics+=ExternalMetric*
     * metrics+=InternalMetric+)
     */
    protected void sequence_MetricModel(final EObject context, final MetricModel semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }

    /**
     * Constraint: (name=MYID shortname=STRING description=STRING
     * defaultValue=DOUBLE)
     */
    protected void sequence_Parameter(final EObject context, final Parameter semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject,
                    MetricDSLPackage.Literals.NUMBER__NAME) == ValueTransient.YES) {
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
                        MetricDSLPackage.Literals.NUMBER__NAME));
            }
            if (transientValues.isValueTransient(semanticObject,
                    MetricDSLPackage.Literals.PARAMETER__SHORTNAME) == ValueTransient.YES) {
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
                        MetricDSLPackage.Literals.PARAMETER__SHORTNAME));
            }
            if (transientValues.isValueTransient(semanticObject,
                    MetricDSLPackage.Literals.PARAMETER__DESCRIPTION) == ValueTransient.YES) {
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
                        MetricDSLPackage.Literals.PARAMETER__DESCRIPTION));
            }
            if (transientValues.isValueTransient(semanticObject,
                    MetricDSLPackage.Literals.PARAMETER__DEFAULT_VALUE) == ValueTransient.YES) {
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
                        MetricDSLPackage.Literals.PARAMETER__DEFAULT_VALUE));
            }
        }
        final INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
        final SequenceFeeder feeder = this.createSequencerFeeder(semanticObject, nodes);
        feeder.accept(grammarAccess.getParameterAccess().getNameMYIDParserRuleCall_1_0(), semanticObject.getName());
        feeder.accept(grammarAccess.getParameterAccess().getShortnameSTRINGTerminalRuleCall_3_0(),
                semanticObject.getShortname());
        feeder.accept(grammarAccess.getParameterAccess().getDescriptionSTRINGTerminalRuleCall_5_0(),
                semanticObject.getDescription());
        feeder.accept(grammarAccess.getParameterAccess().getDefaultValueDOUBLETerminalRuleCall_7_0(),
                semanticObject.getDefaultValue());
        feeder.finish();
    }

    /**
     * Constraint: (nominatorMetric=[Metric|MYID] denominatorMetric=[Metric|MYID])
     */
    protected void sequence_RatioMetric(final EObject context, final RatioMetric semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject,
                    MetricDSLPackage.Literals.RATIO_METRIC__NOMINATOR_METRIC) == ValueTransient.YES) {
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
                        MetricDSLPackage.Literals.RATIO_METRIC__NOMINATOR_METRIC));
            }
            if (transientValues.isValueTransient(semanticObject,
                    MetricDSLPackage.Literals.RATIO_METRIC__DENOMINATOR_METRIC) == ValueTransient.YES) {
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject,
                        MetricDSLPackage.Literals.RATIO_METRIC__DENOMINATOR_METRIC));
            }
        }
        final INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
        final SequenceFeeder feeder = this.createSequencerFeeder(semanticObject, nodes);
        feeder.accept(grammarAccess.getRatioMetricAccess().getNominatorMetricMetricMYIDParserRuleCall_2_0_1(),
                semanticObject.getNominatorMetric());
        feeder.accept(grammarAccess.getRatioMetricAccess().getDenominatorMetricMetricMYIDParserRuleCall_4_0_1(),
                semanticObject.getDenominatorMetric());
        feeder.finish();
    }

    /**
     * Constraint: (innerMetric=[Metric|MYID] steps+=BoundAndWeight*)
     */
    protected void sequence_StepwiseMetric(final EObject context, final StepwiseMetric semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }

    /**
     * Constraint: weights+=MetricAndWeight+
     */
    protected void sequence_WeightedMetric(final EObject context, final WeightedMetric semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }
}
