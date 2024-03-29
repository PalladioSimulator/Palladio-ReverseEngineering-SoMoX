/**
 */
package org.somox.sourcecodedecorator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.pcm.repository.Interface;
import org.somox.sourcecodedecorator.InterfaceSourceCodeLink;
import org.somox.sourcecodedecorator.SourcecodedecoratorPackage;

import tools.mdsd.jamopp.model.java.classifiers.ConcreteClassifier;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Interface Source Code Link</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.somox.sourcecodedecorator.impl.InterfaceSourceCodeLinkImpl#getInterface
 * <em>Interface</em>}</li>
 * <li>{@link org.somox.sourcecodedecorator.impl.InterfaceSourceCodeLinkImpl#getGastClass
 * <em>Gast Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceSourceCodeLinkImpl extends MinimalEObjectImpl.Container implements InterfaceSourceCodeLink {
    /**
     * The cached value of the '{@link #getInterface() <em>Interface</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getInterface()
     * @generated
     * @ordered
     */
    protected Interface interface_;

    /**
     * The cached value of the '{@link #getGastClass() <em>Gast Class</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getGastClass()
     * @generated
     * @ordered
     */
    protected ConcreteClassifier gastClass;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InterfaceSourceCodeLinkImpl() {
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SourcecodedecoratorPackage.Literals.INTERFACE_SOURCE_CODE_LINK;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Interface getInterface() {
        if ((interface_ != null) && ((EObject) interface_).eIsProxy()) {
            final InternalEObject oldInterface = (InternalEObject) interface_;
            interface_ = (Interface) eResolveProxy(oldInterface);
            if ((interface_ != oldInterface) && eNotificationRequired()) {
                eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SourcecodedecoratorPackage.INTERFACE_SOURCE_CODE_LINK__INTERFACE, oldInterface, interface_));
            }
        }
        return interface_;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Interface basicGetInterface() {
        return interface_;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setInterface(final Interface newInterface) {
        final Interface oldInterface = interface_;
        interface_ = newInterface;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    SourcecodedecoratorPackage.INTERFACE_SOURCE_CODE_LINK__INTERFACE, oldInterface, interface_));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ConcreteClassifier getGastClass() {
        if ((gastClass != null) && gastClass.eIsProxy()) {
            final InternalEObject oldGastClass = (InternalEObject) gastClass;
            gastClass = (ConcreteClassifier) eResolveProxy(oldGastClass);
            if ((gastClass != oldGastClass) && eNotificationRequired()) {
                eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SourcecodedecoratorPackage.INTERFACE_SOURCE_CODE_LINK__GAST_CLASS, oldGastClass, gastClass));
            }
        }
        return gastClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ConcreteClassifier basicGetGastClass() {
        return gastClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setGastClass(final ConcreteClassifier newGastClass) {
        final ConcreteClassifier oldGastClass = gastClass;
        gastClass = newGastClass;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    SourcecodedecoratorPackage.INTERFACE_SOURCE_CODE_LINK__GAST_CLASS, oldGastClass, gastClass));
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
        case SourcecodedecoratorPackage.INTERFACE_SOURCE_CODE_LINK__INTERFACE:
            if (resolve) {
                return getInterface();
            }
            return basicGetInterface();
        case SourcecodedecoratorPackage.INTERFACE_SOURCE_CODE_LINK__GAST_CLASS:
            if (resolve) {
                return getGastClass();
            }
            return basicGetGastClass();
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
        case SourcecodedecoratorPackage.INTERFACE_SOURCE_CODE_LINK__INTERFACE:
            setInterface((Interface) newValue);
            return;
        case SourcecodedecoratorPackage.INTERFACE_SOURCE_CODE_LINK__GAST_CLASS:
            setGastClass((ConcreteClassifier) newValue);
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
        case SourcecodedecoratorPackage.INTERFACE_SOURCE_CODE_LINK__INTERFACE:
            setInterface((Interface) null);
            return;
        case SourcecodedecoratorPackage.INTERFACE_SOURCE_CODE_LINK__GAST_CLASS:
            setGastClass((ConcreteClassifier) null);
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
        case SourcecodedecoratorPackage.INTERFACE_SOURCE_CODE_LINK__INTERFACE:
            return interface_ != null;
        case SourcecodedecoratorPackage.INTERFACE_SOURCE_CODE_LINK__GAST_CLASS:
            return gastClass != null;
        }
        return super.eIsSet(featureID);
    }

} // InterfaceSourceCodeLinkImpl
