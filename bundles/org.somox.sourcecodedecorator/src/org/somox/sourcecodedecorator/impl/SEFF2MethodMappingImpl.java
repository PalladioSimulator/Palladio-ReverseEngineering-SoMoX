/**
 */
package org.somox.sourcecodedecorator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.somox.sourcecodedecorator.SEFF2MethodMapping;
import org.somox.sourcecodedecorator.SourcecodedecoratorPackage;

import tools.mdsd.jamopp.model.java.statements.StatementListContainer;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>SEFF2
 * Method Mapping</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.somox.sourcecodedecorator.impl.SEFF2MethodMappingImpl#getSeff
 * <em>Seff</em>}</li>
 * <li>{@link org.somox.sourcecodedecorator.impl.SEFF2MethodMappingImpl#getStatementListContainer
 * <em>Statement List Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SEFF2MethodMappingImpl extends MinimalEObjectImpl.Container implements SEFF2MethodMapping {
    /**
     * The cached value of the '{@link #getSeff() <em>Seff</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSeff()
     * @generated
     * @ordered
     */
    protected ServiceEffectSpecification seff;

    /**
     * The cached value of the '{@link #getStatementListContainer() <em>Statement
     * List Container</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getStatementListContainer()
     * @generated
     * @ordered
     */
    protected StatementListContainer statementListContainer;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SEFF2MethodMappingImpl() {
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SourcecodedecoratorPackage.Literals.SEFF2_METHOD_MAPPING;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ServiceEffectSpecification getSeff() {
        if ((seff != null) && ((EObject) seff).eIsProxy()) {
            final InternalEObject oldSeff = (InternalEObject) seff;
            seff = (ServiceEffectSpecification) eResolveProxy(oldSeff);
            if ((seff != oldSeff) && eNotificationRequired()) {
                eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SourcecodedecoratorPackage.SEFF2_METHOD_MAPPING__SEFF, oldSeff, seff));
            }
        }
        return seff;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ServiceEffectSpecification basicGetSeff() {
        return seff;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSeff(final ServiceEffectSpecification newSeff) {
        final ServiceEffectSpecification oldSeff = seff;
        seff = newSeff;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, SourcecodedecoratorPackage.SEFF2_METHOD_MAPPING__SEFF,
                    oldSeff, seff));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StatementListContainer getStatementListContainer() {
        if ((statementListContainer != null) && statementListContainer.eIsProxy()) {
            final InternalEObject oldStatementListContainer = (InternalEObject) statementListContainer;
            statementListContainer = (StatementListContainer) eResolveProxy(oldStatementListContainer);
            if ((statementListContainer != oldStatementListContainer) && eNotificationRequired()) {
                eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SourcecodedecoratorPackage.SEFF2_METHOD_MAPPING__STATEMENT_LIST_CONTAINER,
                        oldStatementListContainer, statementListContainer));
            }
        }
        return statementListContainer;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public StatementListContainer basicGetStatementListContainer() {
        return statementListContainer;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStatementListContainer(final StatementListContainer newStatementListContainer) {
        final StatementListContainer oldStatementListContainer = statementListContainer;
        statementListContainer = newStatementListContainer;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    SourcecodedecoratorPackage.SEFF2_METHOD_MAPPING__STATEMENT_LIST_CONTAINER,
                    oldStatementListContainer, statementListContainer));
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
        case SourcecodedecoratorPackage.SEFF2_METHOD_MAPPING__SEFF:
            if (resolve) {
                return getSeff();
            }
            return basicGetSeff();
        case SourcecodedecoratorPackage.SEFF2_METHOD_MAPPING__STATEMENT_LIST_CONTAINER:
            if (resolve) {
                return getStatementListContainer();
            }
            return basicGetStatementListContainer();
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
        case SourcecodedecoratorPackage.SEFF2_METHOD_MAPPING__SEFF:
            setSeff((ServiceEffectSpecification) newValue);
            return;
        case SourcecodedecoratorPackage.SEFF2_METHOD_MAPPING__STATEMENT_LIST_CONTAINER:
            setStatementListContainer((StatementListContainer) newValue);
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
        case SourcecodedecoratorPackage.SEFF2_METHOD_MAPPING__SEFF:
            setSeff((ServiceEffectSpecification) null);
            return;
        case SourcecodedecoratorPackage.SEFF2_METHOD_MAPPING__STATEMENT_LIST_CONTAINER:
            setStatementListContainer((StatementListContainer) null);
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
        case SourcecodedecoratorPackage.SEFF2_METHOD_MAPPING__SEFF:
            return seff != null;
        case SourcecodedecoratorPackage.SEFF2_METHOD_MAPPING__STATEMENT_LIST_CONTAINER:
            return statementListContainer != null;
        }
        return super.eIsSet(featureID);
    }

} // SEFF2MethodMappingImpl
