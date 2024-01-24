/**
 */
package org.somox.sourcecodedecorator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.repository.Signature;
import org.somox.sourcecodedecorator.MethodLevelSourceCodeLink;
import org.somox.sourcecodedecorator.SourcecodedecoratorPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Method
 * Level Source Code Link</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.somox.sourcecodedecorator.impl.MethodLevelSourceCodeLinkImpl#getOperation
 * <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodLevelSourceCodeLinkImpl extends AbstractMethodLevelSourceCodeLinkImpl
        implements MethodLevelSourceCodeLink {
    /**
     * The cached value of the '{@link #getOperation() <em>Operation</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOperation()
     * @generated
     * @ordered
     */
    protected Signature operation;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MethodLevelSourceCodeLinkImpl() {
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SourcecodedecoratorPackage.Literals.METHOD_LEVEL_SOURCE_CODE_LINK;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Signature getOperation() {
        if ((operation != null) && ((EObject) operation).eIsProxy()) {
            final InternalEObject oldOperation = (InternalEObject) operation;
            operation = (Signature) eResolveProxy(oldOperation);
            if ((operation != oldOperation) && eNotificationRequired()) {
                eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SourcecodedecoratorPackage.METHOD_LEVEL_SOURCE_CODE_LINK__OPERATION, oldOperation, operation));
            }
        }
        return operation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Signature basicGetOperation() {
        return operation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setOperation(final Signature newOperation) {
        final Signature oldOperation = operation;
        operation = newOperation;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    SourcecodedecoratorPackage.METHOD_LEVEL_SOURCE_CODE_LINK__OPERATION, oldOperation, operation));
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
        case SourcecodedecoratorPackage.METHOD_LEVEL_SOURCE_CODE_LINK__OPERATION:
            if (resolve) {
                return getOperation();
            }
            return basicGetOperation();
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
        case SourcecodedecoratorPackage.METHOD_LEVEL_SOURCE_CODE_LINK__OPERATION:
            setOperation((Signature) newValue);
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
        case SourcecodedecoratorPackage.METHOD_LEVEL_SOURCE_CODE_LINK__OPERATION:
            setOperation((Signature) null);
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
        case SourcecodedecoratorPackage.METHOD_LEVEL_SOURCE_CODE_LINK__OPERATION:
            return operation != null;
        }
        return super.eIsSet(featureID);
    }

} // MethodLevelSourceCodeLinkImpl
