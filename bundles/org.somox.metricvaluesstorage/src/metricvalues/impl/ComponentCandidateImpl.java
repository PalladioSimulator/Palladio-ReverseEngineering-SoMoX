/**
 */
package metricvalues.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import metricvalues.Component;
import metricvalues.ComponentCandidate;
import metricvalues.MetricValue;
import metricvalues.MetricvaluesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Component Candidate</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link metricvalues.impl.ComponentCandidateImpl#getMetricValues
 * <em>Metric Values</em>}</li>
 * <li>{@link metricvalues.impl.ComponentCandidateImpl#getFirstComponent
 * <em>First Component</em>}</li>
 * <li>{@link metricvalues.impl.ComponentCandidateImpl#getSecondComponent
 * <em>Second Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentCandidateImpl extends MinimalEObjectImpl.Container implements ComponentCandidate {
    /**
     * The cached value of the '{@link #getMetricValues() <em>Metric Values</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMetricValues()
     * @generated
     * @ordered
     */
    protected EList<MetricValue> metricValues;

    /**
     * The cached value of the '{@link #getFirstComponent() <em>First
     * Component</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFirstComponent()
     * @generated
     * @ordered
     */
    protected Component firstComponent;

    /**
     * The cached value of the '{@link #getSecondComponent() <em>Second
     * Component</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSecondComponent()
     * @generated
     * @ordered
     */
    protected Component secondComponent;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ComponentCandidateImpl() {
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetricvaluesPackage.Literals.COMPONENT_CANDIDATE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<MetricValue> getMetricValues() {
        if (metricValues == null) {
            metricValues = new EObjectContainmentEList<>(MetricValue.class, this,
                    MetricvaluesPackage.COMPONENT_CANDIDATE__METRIC_VALUES);
        }
        return metricValues;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Component getFirstComponent() {
        if ((firstComponent != null) && firstComponent.eIsProxy()) {
            final InternalEObject oldFirstComponent = (InternalEObject) firstComponent;
            firstComponent = (Component) eResolveProxy(oldFirstComponent);
            if ((firstComponent != oldFirstComponent) && eNotificationRequired()) {
                eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        MetricvaluesPackage.COMPONENT_CANDIDATE__FIRST_COMPONENT, oldFirstComponent, firstComponent));
            }
        }
        return firstComponent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Component basicGetFirstComponent() {
        return firstComponent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFirstComponent(final Component newFirstComponent) {
        final Component oldFirstComponent = firstComponent;
        firstComponent = newFirstComponent;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MetricvaluesPackage.COMPONENT_CANDIDATE__FIRST_COMPONENT, oldFirstComponent, firstComponent));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Component getSecondComponent() {
        if ((secondComponent != null) && secondComponent.eIsProxy()) {
            final InternalEObject oldSecondComponent = (InternalEObject) secondComponent;
            secondComponent = (Component) eResolveProxy(oldSecondComponent);
            if ((secondComponent != oldSecondComponent) && eNotificationRequired()) {
                eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        MetricvaluesPackage.COMPONENT_CANDIDATE__SECOND_COMPONENT, oldSecondComponent,
                        secondComponent));
            }
        }
        return secondComponent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Component basicGetSecondComponent() {
        return secondComponent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSecondComponent(final Component newSecondComponent) {
        final Component oldSecondComponent = secondComponent;
        secondComponent = newSecondComponent;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MetricvaluesPackage.COMPONENT_CANDIDATE__SECOND_COMPONENT, oldSecondComponent, secondComponent));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case MetricvaluesPackage.COMPONENT_CANDIDATE__METRIC_VALUES:
            return ((InternalEList<?>) getMetricValues()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MetricvaluesPackage.COMPONENT_CANDIDATE__METRIC_VALUES:
            return getMetricValues();
        case MetricvaluesPackage.COMPONENT_CANDIDATE__FIRST_COMPONENT:
            if (resolve) {
                return getFirstComponent();
            }
            return basicGetFirstComponent();
        case MetricvaluesPackage.COMPONENT_CANDIDATE__SECOND_COMPONENT:
            if (resolve) {
                return getSecondComponent();
            }
            return basicGetSecondComponent();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case MetricvaluesPackage.COMPONENT_CANDIDATE__METRIC_VALUES:
            getMetricValues().clear();
            getMetricValues().addAll((Collection<? extends MetricValue>) newValue);
            return;
        case MetricvaluesPackage.COMPONENT_CANDIDATE__FIRST_COMPONENT:
            setFirstComponent((Component) newValue);
            return;
        case MetricvaluesPackage.COMPONENT_CANDIDATE__SECOND_COMPONENT:
            setSecondComponent((Component) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case MetricvaluesPackage.COMPONENT_CANDIDATE__METRIC_VALUES:
            getMetricValues().clear();
            return;
        case MetricvaluesPackage.COMPONENT_CANDIDATE__FIRST_COMPONENT:
            setFirstComponent((Component) null);
            return;
        case MetricvaluesPackage.COMPONENT_CANDIDATE__SECOND_COMPONENT:
            setSecondComponent((Component) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case MetricvaluesPackage.COMPONENT_CANDIDATE__METRIC_VALUES:
            return (metricValues != null) && !metricValues.isEmpty();
        case MetricvaluesPackage.COMPONENT_CANDIDATE__FIRST_COMPONENT:
            return firstComponent != null;
        case MetricvaluesPackage.COMPONENT_CANDIDATE__SECOND_COMPONENT:
            return secondComponent != null;
        }
        return super.eIsSet(featureID);
    }

} // ComponentCandidateImpl
