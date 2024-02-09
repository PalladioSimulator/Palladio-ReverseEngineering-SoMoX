/**
 */
package org.somox.metrics.dsl.metricDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
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
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class MetricDSLPackageImpl extends EPackageImpl implements MetricDSLPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass metricModelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass metricEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass externalMetricEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass internalMetricEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass numberEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass parameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass constantEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass metricDefinitionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass weightedMetricEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass stepwiseMetricEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass ratioMetricEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass boundAndWeightEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass metricAndWeightEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
     * package package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory method
     * {@link #init init()}, which also performs initialization of the package, or
     * returns the registered package, if one already exists. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.somox.metrics.dsl.metricDSL.MetricDSLPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MetricDSLPackageImpl() {
        super(eNS_URI, MetricDSLFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and
     * for any others upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link MetricDSLPackage#eINSTANCE} when
     * that field is accessed. Clients should not invoke it directly. Instead, they
     * should simply access that field to obtain the package. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static MetricDSLPackage init() {
        if (isInited) {
            return (MetricDSLPackage) EPackage.Registry.INSTANCE.getEPackage(MetricDSLPackage.eNS_URI);
        }

        // Obtain or create and register package
        final MetricDSLPackageImpl theMetricDSLPackage = (MetricDSLPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof MetricDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new MetricDSLPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theMetricDSLPackage.createPackageContents();

        // Initialize created meta-data
        theMetricDSLPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theMetricDSLPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(MetricDSLPackage.eNS_URI, theMetricDSLPackage);
        return theMetricDSLPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMetricModel() {
        return metricModelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getMetricModel_ImportURI() {
        return (EAttribute) metricModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMetricModel_Metrics() {
        return (EReference) metricModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMetric() {
        return metricEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getMetric_Name() {
        return (EAttribute) metricEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getExternalMetric() {
        return externalMetricEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getInternalMetric() {
        return internalMetricEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getInternalMetric_ShortName() {
        return (EAttribute) internalMetricEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getInternalMetric_Description() {
        return (EAttribute) internalMetricEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getInternalMetric_Parameter() {
        return (EReference) internalMetricEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getInternalMetric_Definition() {
        return (EReference) internalMetricEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getNumber() {
        return numberEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getNumber_Name() {
        return (EAttribute) numberEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getParameter() {
        return parameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getParameter_Shortname() {
        return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getParameter_Description() {
        return (EAttribute) parameterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getParameter_DefaultValue() {
        return (EAttribute) parameterEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getConstant() {
        return constantEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getConstant_Value() {
        return (EAttribute) constantEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMetricDefinition() {
        return metricDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getWeightedMetric() {
        return weightedMetricEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getWeightedMetric_Weights() {
        return (EReference) weightedMetricEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getStepwiseMetric() {
        return stepwiseMetricEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getStepwiseMetric_InnerMetric() {
        return (EReference) stepwiseMetricEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getStepwiseMetric_Steps() {
        return (EReference) stepwiseMetricEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getRatioMetric() {
        return ratioMetricEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRatioMetric_NominatorMetric() {
        return (EReference) ratioMetricEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRatioMetric_DenominatorMetric() {
        return (EReference) ratioMetricEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getBoundAndWeight() {
        return boundAndWeightEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getBoundAndWeight_UpperBound() {
        return (EReference) boundAndWeightEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getBoundAndWeight_Weight() {
        return (EReference) boundAndWeightEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMetricAndWeight() {
        return metricAndWeightEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMetricAndWeight_Metric() {
        return (EReference) metricAndWeightEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMetricAndWeight_Weight() {
        return (EReference) metricAndWeightEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MetricDSLFactory getMetricDSLFactory() {
        return (MetricDSLFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to
     * have no affect on any invocation but its first. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) {
            return;
        }
        isCreated = true;

        // Create classes and their features
        metricModelEClass = createEClass(METRIC_MODEL);
        createEAttribute(metricModelEClass, METRIC_MODEL__IMPORT_URI);
        createEReference(metricModelEClass, METRIC_MODEL__METRICS);

        metricEClass = createEClass(METRIC);
        createEAttribute(metricEClass, METRIC__NAME);

        externalMetricEClass = createEClass(EXTERNAL_METRIC);

        internalMetricEClass = createEClass(INTERNAL_METRIC);
        createEAttribute(internalMetricEClass, INTERNAL_METRIC__SHORT_NAME);
        createEAttribute(internalMetricEClass, INTERNAL_METRIC__DESCRIPTION);
        createEReference(internalMetricEClass, INTERNAL_METRIC__PARAMETER);
        createEReference(internalMetricEClass, INTERNAL_METRIC__DEFINITION);

        numberEClass = createEClass(NUMBER);
        createEAttribute(numberEClass, NUMBER__NAME);

        parameterEClass = createEClass(PARAMETER);
        createEAttribute(parameterEClass, PARAMETER__SHORTNAME);
        createEAttribute(parameterEClass, PARAMETER__DESCRIPTION);
        createEAttribute(parameterEClass, PARAMETER__DEFAULT_VALUE);

        constantEClass = createEClass(CONSTANT);
        createEAttribute(constantEClass, CONSTANT__VALUE);

        metricDefinitionEClass = createEClass(METRIC_DEFINITION);

        weightedMetricEClass = createEClass(WEIGHTED_METRIC);
        createEReference(weightedMetricEClass, WEIGHTED_METRIC__WEIGHTS);

        stepwiseMetricEClass = createEClass(STEPWISE_METRIC);
        createEReference(stepwiseMetricEClass, STEPWISE_METRIC__INNER_METRIC);
        createEReference(stepwiseMetricEClass, STEPWISE_METRIC__STEPS);

        ratioMetricEClass = createEClass(RATIO_METRIC);
        createEReference(ratioMetricEClass, RATIO_METRIC__NOMINATOR_METRIC);
        createEReference(ratioMetricEClass, RATIO_METRIC__DENOMINATOR_METRIC);

        boundAndWeightEClass = createEClass(BOUND_AND_WEIGHT);
        createEReference(boundAndWeightEClass, BOUND_AND_WEIGHT__UPPER_BOUND);
        createEReference(boundAndWeightEClass, BOUND_AND_WEIGHT__WEIGHT);

        metricAndWeightEClass = createEClass(METRIC_AND_WEIGHT);
        createEReference(metricAndWeightEClass, METRIC_AND_WEIGHT__METRIC);
        createEReference(metricAndWeightEClass, METRIC_AND_WEIGHT__WEIGHT);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is
     * guarded to have no affect on any invocation but its first. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) {
            return;
        }
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        externalMetricEClass.getESuperTypes().add(getMetric());
        internalMetricEClass.getESuperTypes().add(getMetric());
        parameterEClass.getESuperTypes().add(getNumber());
        constantEClass.getESuperTypes().add(getNumber());
        weightedMetricEClass.getESuperTypes().add(getMetricDefinition());
        stepwiseMetricEClass.getESuperTypes().add(getMetricDefinition());
        ratioMetricEClass.getESuperTypes().add(getMetricDefinition());

        // Initialize classes and features; add operations and parameters
        this.initEClass(metricModelEClass, MetricModel.class, "MetricModel", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(getMetricModel_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, -1,
                MetricModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEReference(getMetricModel_Metrics(), getMetric(), null, "metrics", null, 0, -1, MetricModel.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(metricEClass, Metric.class, "Metric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(getMetric_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metric.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(externalMetricEClass, ExternalMetric.class, "ExternalMetric", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(internalMetricEClass, InternalMetric.class, "InternalMetric", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(getInternalMetric_ShortName(), ecorePackage.getEString(), "shortName", null, 0, 1,
                InternalMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(getInternalMetric_Description(), ecorePackage.getEString(), "description", null, 0, 1,
                InternalMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEReference(getInternalMetric_Parameter(), getNumber(), null, "parameter", null, 0, -1,
                InternalMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(getInternalMetric_Definition(), getMetricDefinition(), null, "definition", null, 0, 1,
                InternalMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(numberEClass, org.somox.metrics.dsl.metricDSL.Number.class, "Number", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(getNumber_Name(), ecorePackage.getEString(), "name", null, 0, 1,
                org.somox.metrics.dsl.metricDSL.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(getParameter_Shortname(), ecorePackage.getEString(), "shortname", null, 0, 1,
                Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(getParameter_Description(), ecorePackage.getEString(), "description", null, 0, 1,
                Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(getParameter_DefaultValue(), ecorePackage.getEDouble(), "defaultValue", null, 0, 1,
                Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(getConstant_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, Constant.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(metricDefinitionEClass, MetricDefinition.class, "MetricDefinition", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(weightedMetricEClass, WeightedMetric.class, "WeightedMetric", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(getWeightedMetric_Weights(), getMetricAndWeight(), null, "weights", null, 0, -1,
                WeightedMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(stepwiseMetricEClass, StepwiseMetric.class, "StepwiseMetric", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(getStepwiseMetric_InnerMetric(), getMetric(), null, "innerMetric", null, 0, 1,
                StepwiseMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(getStepwiseMetric_Steps(), getBoundAndWeight(), null, "steps", null, 0, -1,
                StepwiseMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(ratioMetricEClass, RatioMetric.class, "RatioMetric", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(getRatioMetric_NominatorMetric(), getMetric(), null, "nominatorMetric", null, 0, 1,
                RatioMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(getRatioMetric_DenominatorMetric(), getMetric(), null, "denominatorMetric", null, 0, 1,
                RatioMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(boundAndWeightEClass, BoundAndWeight.class, "BoundAndWeight", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(getBoundAndWeight_UpperBound(), getNumber(), null, "upperBound", null, 0, 1,
                BoundAndWeight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(getBoundAndWeight_Weight(), getNumber(), null, "weight", null, 0, 1, BoundAndWeight.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(metricAndWeightEClass, MetricAndWeight.class, "MetricAndWeight", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(getMetricAndWeight_Metric(), getMetric(), null, "metric", null, 0, 1, MetricAndWeight.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(getMetricAndWeight_Weight(), getNumber(), null, "weight", null, 0, 1, MetricAndWeight.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} // MetricDSLPackageImpl
