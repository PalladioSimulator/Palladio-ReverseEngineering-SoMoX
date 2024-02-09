/**
 */
package org.somox.metrics.dsl.metricDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.somox.metrics.dsl.metricDSL.BoundAndWeight;
import org.somox.metrics.dsl.metricDSL.Constant;
import org.somox.metrics.dsl.metricDSL.ExternalMetric;
import org.somox.metrics.dsl.metricDSL.InternalMetric;
import org.somox.metrics.dsl.metricDSL.Metric;
import org.somox.metrics.dsl.metricDSL.MetricAndWeight;
import org.somox.metrics.dsl.metricDSL.MetricDSLFactory;
import org.somox.metrics.dsl.metricDSL.MetricDSLPackage;
import org.somox.metrics.dsl.metricDSL.MetricDefinition;
import org.somox.metrics.dsl.metricDSL.MetricModel;
import org.somox.metrics.dsl.metricDSL.Parameter;
import org.somox.metrics.dsl.metricDSL.RatioMetric;
import org.somox.metrics.dsl.metricDSL.StepwiseMetric;
import org.somox.metrics.dsl.metricDSL.WeightedMetric;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class MetricDSLFactoryImpl extends EFactoryImpl implements MetricDSLFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public static MetricDSLFactory init() {
        try {
            final MetricDSLFactory theMetricDSLFactory = (MetricDSLFactory) EPackage.Registry.INSTANCE
                    .getEFactory(MetricDSLPackage.eNS_URI);
            if (theMetricDSLFactory != null) {
                return theMetricDSLFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MetricDSLFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    public MetricDSLFactoryImpl() {
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        return switch (eClass.getClassifierID()) {
        case MetricDSLPackage.METRIC_MODEL -> createMetricModel();
        case MetricDSLPackage.METRIC -> createMetric();
        case MetricDSLPackage.EXTERNAL_METRIC -> createExternalMetric();
        case MetricDSLPackage.INTERNAL_METRIC -> createInternalMetric();
        case MetricDSLPackage.NUMBER -> createNumber();
        case MetricDSLPackage.PARAMETER -> createParameter();
        case MetricDSLPackage.CONSTANT -> createConstant();
        case MetricDSLPackage.METRIC_DEFINITION -> createMetricDefinition();
        case MetricDSLPackage.WEIGHTED_METRIC -> createWeightedMetric();
        case MetricDSLPackage.STEPWISE_METRIC -> createStepwiseMetric();
        case MetricDSLPackage.RATIO_METRIC -> createRatioMetric();
        case MetricDSLPackage.BOUND_AND_WEIGHT -> createBoundAndWeight();
        case MetricDSLPackage.METRIC_AND_WEIGHT -> createMetricAndWeight();
        default -> throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        };
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MetricModel createMetricModel() {
        return new MetricModelImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Metric createMetric() {
        return new MetricImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExternalMetric createExternalMetric() {
        return new ExternalMetricImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public InternalMetric createInternalMetric() {
        return new InternalMetricImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public org.somox.metrics.dsl.metricDSL.Number createNumber() {
        return new NumberImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Parameter createParameter() {
        return new ParameterImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Constant createConstant() {
        return new ConstantImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MetricDefinition createMetricDefinition() {
        return new MetricDefinitionImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public WeightedMetric createWeightedMetric() {
        return new WeightedMetricImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StepwiseMetric createStepwiseMetric() {
        return new StepwiseMetricImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RatioMetric createRatioMetric() {
        return new RatioMetricImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BoundAndWeight createBoundAndWeight() {
        return new BoundAndWeightImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MetricAndWeight createMetricAndWeight() {
        return new MetricAndWeightImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MetricDSLPackage getMetricDSLPackage() {
        return (MetricDSLPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MetricDSLPackage getPackage() {
        return MetricDSLPackage.eINSTANCE;
    }

} // MetricDSLFactoryImpl
