/**
 */
package org.somox.sourcecodedecorator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.somox.sourcecodedecorator.SeffElementSourceCodeLink;
import org.somox.sourcecodedecorator.SourcecodedecoratorPackage;

import de.uka.ipd.sdq.identifier.Identifier;
import tools.mdsd.jamopp.model.java.statements.Statement;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Seff
 * Element Source Code Link</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.somox.sourcecodedecorator.impl.SeffElementSourceCodeLinkImpl#getSeffElement
 * <em>Seff Element</em>}</li>
 * <li>{@link org.somox.sourcecodedecorator.impl.SeffElementSourceCodeLinkImpl#getStatement
 * <em>Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeffElementSourceCodeLinkImpl extends MinimalEObjectImpl.Container implements SeffElementSourceCodeLink {
    /**
     * The cached value of the '{@link #getSeffElement() <em>Seff Element</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSeffElement()
     * @generated
     * @ordered
     */
    protected Identifier seffElement;

    /**
     * The cached value of the '{@link #getStatement() <em>Statement</em>}'
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStatement()
     * @generated
     * @ordered
     */
    protected EList<Statement> statement;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SeffElementSourceCodeLinkImpl() {
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SourcecodedecoratorPackage.Literals.SEFF_ELEMENT_SOURCE_CODE_LINK;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Identifier getSeffElement() {
        if ((seffElement != null) && ((EObject) seffElement).eIsProxy()) {
            final InternalEObject oldSeffElement = (InternalEObject) seffElement;
            seffElement = (Identifier) eResolveProxy(oldSeffElement);
            if ((seffElement != oldSeffElement) && eNotificationRequired()) {
                eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SourcecodedecoratorPackage.SEFF_ELEMENT_SOURCE_CODE_LINK__SEFF_ELEMENT, oldSeffElement,
                        seffElement));
            }
        }
        return seffElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Identifier basicGetSeffElement() {
        return seffElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSeffElement(final Identifier newSeffElement) {
        final Identifier oldSeffElement = seffElement;
        seffElement = newSeffElement;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    SourcecodedecoratorPackage.SEFF_ELEMENT_SOURCE_CODE_LINK__SEFF_ELEMENT, oldSeffElement,
                    seffElement));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Statement> getStatement() {
        if (statement == null) {
            statement = new EObjectResolvingEList<>(Statement.class, this,
                    SourcecodedecoratorPackage.SEFF_ELEMENT_SOURCE_CODE_LINK__STATEMENT);
        }
        return statement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case SourcecodedecoratorPackage.SEFF_ELEMENT_SOURCE_CODE_LINK__SEFF_ELEMENT:
            if (resolve) {
                return getSeffElement();
            }
            return basicGetSeffElement();
        case SourcecodedecoratorPackage.SEFF_ELEMENT_SOURCE_CODE_LINK__STATEMENT:
            return getStatement();
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
        case SourcecodedecoratorPackage.SEFF_ELEMENT_SOURCE_CODE_LINK__SEFF_ELEMENT:
            setSeffElement((Identifier) newValue);
            return;
        case SourcecodedecoratorPackage.SEFF_ELEMENT_SOURCE_CODE_LINK__STATEMENT:
            getStatement().clear();
            getStatement().addAll((Collection<? extends Statement>) newValue);
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
        case SourcecodedecoratorPackage.SEFF_ELEMENT_SOURCE_CODE_LINK__SEFF_ELEMENT:
            setSeffElement((Identifier) null);
            return;
        case SourcecodedecoratorPackage.SEFF_ELEMENT_SOURCE_CODE_LINK__STATEMENT:
            getStatement().clear();
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
        case SourcecodedecoratorPackage.SEFF_ELEMENT_SOURCE_CODE_LINK__SEFF_ELEMENT:
            return seffElement != null;
        case SourcecodedecoratorPackage.SEFF_ELEMENT_SOURCE_CODE_LINK__STATEMENT:
            return (statement != null) && !statement.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // SeffElementSourceCodeLinkImpl
