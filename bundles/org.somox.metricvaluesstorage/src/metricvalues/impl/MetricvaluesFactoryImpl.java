/**
 */
package metricvalues.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import metricvalues.Component;
import metricvalues.ComponentCandidate;
import metricvalues.Iteration;
import metricvalues.MetricValue;
import metricvalues.MetricValuesModel;
import metricvalues.MetricvaluesFactory;
import metricvalues.MetricvaluesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class MetricvaluesFactoryImpl extends EFactoryImpl implements MetricvaluesFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public static MetricvaluesFactory init() {
        try {
            final MetricvaluesFactory theMetricvaluesFactory = (MetricvaluesFactory) EPackage.Registry.INSTANCE
                    .getEFactory(MetricvaluesPackage.eNS_URI);
            if (theMetricvaluesFactory != null) {
                return theMetricvaluesFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MetricvaluesFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    public MetricvaluesFactoryImpl() {
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        return switch (eClass.getClassifierID()) {
        case MetricvaluesPackage.COMPONENT -> createComponent();
        case MetricvaluesPackage.COMPONENT_CANDIDATE -> createComponentCandidate();
        case MetricvaluesPackage.ITERATION -> createIteration();
        case MetricvaluesPackage.METRIC_VALUE -> createMetricValue();
        case MetricvaluesPackage.METRIC_VALUES_MODEL -> createMetricValuesModel();
        default -> throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        };
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Component createComponent() {
        return new ComponentImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComponentCandidate createComponentCandidate() {
        return new ComponentCandidateImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Iteration createIteration() {
        return new IterationImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MetricValue createMetricValue() {
        return new MetricValueImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MetricValuesModel createMetricValuesModel() {
        return new MetricValuesModelImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MetricvaluesPackage getMetricvaluesPackage() {
        return (MetricvaluesPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MetricvaluesPackage getPackage() {
        return MetricvaluesPackage.eINSTANCE;
    }

} // MetricvaluesFactoryImpl
