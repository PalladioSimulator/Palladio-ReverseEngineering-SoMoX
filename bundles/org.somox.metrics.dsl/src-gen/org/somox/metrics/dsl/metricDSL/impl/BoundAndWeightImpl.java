/**
 */
package org.somox.metrics.dsl.metricDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.somox.metrics.dsl.metricDSL.BoundAndWeight;
import org.somox.metrics.dsl.metricDSL.MetricDSLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bound
 * And Weight</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.somox.metrics.dsl.metricDSL.impl.BoundAndWeightImpl#getUpperBound
 * <em>Upper Bound</em>}</li>
 * <li>{@link org.somox.metrics.dsl.metricDSL.impl.BoundAndWeightImpl#getWeight
 * <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoundAndWeightImpl extends MinimalEObjectImpl.Container implements BoundAndWeight {
    /**
     * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUpperBound()
     * @generated
     * @ordered
     */
    protected org.somox.metrics.dsl.metricDSL.Number upperBound;

    /**
     * The cached value of the '{@link #getWeight() <em>Weight</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getWeight()
     * @generated
     * @ordered
     */
    protected org.somox.metrics.dsl.metricDSL.Number weight;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected BoundAndWeightImpl() {
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetricDSLPackage.Literals.BOUND_AND_WEIGHT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public org.somox.metrics.dsl.metricDSL.Number getUpperBound() {
        if ((upperBound != null) && upperBound.eIsProxy()) {
            final InternalEObject oldUpperBound = (InternalEObject) upperBound;
            upperBound = (org.somox.metrics.dsl.metricDSL.Number) eResolveProxy(oldUpperBound);
            if ((upperBound != oldUpperBound) && eNotificationRequired()) {
                eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        MetricDSLPackage.BOUND_AND_WEIGHT__UPPER_BOUND, oldUpperBound, upperBound));
            }
        }
        return upperBound;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public org.somox.metrics.dsl.metricDSL.Number basicGetUpperBound() {
        return upperBound;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUpperBound(final org.somox.metrics.dsl.metricDSL.Number newUpperBound) {
        final org.somox.metrics.dsl.metricDSL.Number oldUpperBound = upperBound;
        upperBound = newUpperBound;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, MetricDSLPackage.BOUND_AND_WEIGHT__UPPER_BOUND,
                    oldUpperBound, upperBound));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public org.somox.metrics.dsl.metricDSL.Number getWeight() {
        if ((weight != null) && weight.eIsProxy()) {
            final InternalEObject oldWeight = (InternalEObject) weight;
            weight = (org.somox.metrics.dsl.metricDSL.Number) eResolveProxy(oldWeight);
            if ((weight != oldWeight) && eNotificationRequired()) {
                eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetricDSLPackage.BOUND_AND_WEIGHT__WEIGHT,
                        oldWeight, weight));
            }
        }
        return weight;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public org.somox.metrics.dsl.metricDSL.Number basicGetWeight() {
        return weight;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setWeight(final org.somox.metrics.dsl.metricDSL.Number newWeight) {
        final org.somox.metrics.dsl.metricDSL.Number oldWeight = weight;
        weight = newWeight;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, MetricDSLPackage.BOUND_AND_WEIGHT__WEIGHT, oldWeight,
                    weight));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MetricDSLPackage.BOUND_AND_WEIGHT__UPPER_BOUND:
            if (resolve) {
                return getUpperBound();
            }
            return basicGetUpperBound();
        case MetricDSLPackage.BOUND_AND_WEIGHT__WEIGHT:
            if (resolve) {
                return getWeight();
            }
            return basicGetWeight();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case MetricDSLPackage.BOUND_AND_WEIGHT__UPPER_BOUND:
            setUpperBound((org.somox.metrics.dsl.metricDSL.Number) newValue);
            return;
        case MetricDSLPackage.BOUND_AND_WEIGHT__WEIGHT:
            setWeight((org.somox.metrics.dsl.metricDSL.Number) newValue);
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
        case MetricDSLPackage.BOUND_AND_WEIGHT__UPPER_BOUND:
            setUpperBound((org.somox.metrics.dsl.metricDSL.Number) null);
            return;
        case MetricDSLPackage.BOUND_AND_WEIGHT__WEIGHT:
            setWeight((org.somox.metrics.dsl.metricDSL.Number) null);
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
        case MetricDSLPackage.BOUND_AND_WEIGHT__UPPER_BOUND:
            return upperBound != null;
        case MetricDSLPackage.BOUND_AND_WEIGHT__WEIGHT:
            return weight != null;
        }
        return super.eIsSet(featureID);
    }

} // BoundAndWeightImpl
