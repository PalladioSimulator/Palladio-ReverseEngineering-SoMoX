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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import metricvalues.Component;
import metricvalues.MetricvaluesPackage;
import tools.mdsd.jamopp.model.java.types.Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Component</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link metricvalues.impl.ComponentImpl#getSubComponents <em>Sub
 * Components</em>}</li>
 * <li>{@link metricvalues.impl.ComponentImpl#getName <em>Name</em>}</li>
 * <li>{@link metricvalues.impl.ComponentImpl#getId <em>Id</em>}</li>
 * <li>{@link metricvalues.impl.ComponentImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
    /**
     * The cached value of the '{@link #getSubComponents() <em>Sub Components</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSubComponents()
     * @generated
     * @ordered
     */
    protected EList<Component> subComponents;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getClasses() <em>Classes</em>}' reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getClasses()
     * @generated
     * @ordered
     */
    protected EList<Type> classes;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ComponentImpl() {
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetricvaluesPackage.Literals.COMPONENT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Component> getSubComponents() {
        if (subComponents == null) {
            subComponents = new EObjectContainmentEList<>(Component.class, this,
                    MetricvaluesPackage.COMPONENT__SUB_COMPONENTS);
        }
        return subComponents;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setName(final String newName) {
        final String oldName = name;
        name = newName;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, MetricvaluesPackage.COMPONENT__NAME, oldName, name));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setId(final String newId) {
        final String oldId = id;
        id = newId;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, MetricvaluesPackage.COMPONENT__ID, oldId, id));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Type> getClasses() {
        if (classes == null) {
            classes = new EObjectResolvingEList<>(Type.class, this, MetricvaluesPackage.COMPONENT__CLASSES);
        }
        return classes;
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
        case MetricvaluesPackage.COMPONENT__SUB_COMPONENTS:
            return ((InternalEList<?>) getSubComponents()).basicRemove(otherEnd, msgs);
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
        case MetricvaluesPackage.COMPONENT__SUB_COMPONENTS:
            return getSubComponents();
        case MetricvaluesPackage.COMPONENT__NAME:
            return getName();
        case MetricvaluesPackage.COMPONENT__ID:
            return getId();
        case MetricvaluesPackage.COMPONENT__CLASSES:
            return getClasses();
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
        case MetricvaluesPackage.COMPONENT__SUB_COMPONENTS:
            getSubComponents().clear();
            getSubComponents().addAll((Collection<? extends Component>) newValue);
            return;
        case MetricvaluesPackage.COMPONENT__NAME:
            setName((String) newValue);
            return;
        case MetricvaluesPackage.COMPONENT__ID:
            setId((String) newValue);
            return;
        case MetricvaluesPackage.COMPONENT__CLASSES:
            getClasses().clear();
            getClasses().addAll((Collection<? extends Type>) newValue);
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
        case MetricvaluesPackage.COMPONENT__SUB_COMPONENTS:
            getSubComponents().clear();
            return;
        case MetricvaluesPackage.COMPONENT__NAME:
            setName(NAME_EDEFAULT);
            return;
        case MetricvaluesPackage.COMPONENT__ID:
            setId(ID_EDEFAULT);
            return;
        case MetricvaluesPackage.COMPONENT__CLASSES:
            getClasses().clear();
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
        case MetricvaluesPackage.COMPONENT__SUB_COMPONENTS:
            return (subComponents != null) && !subComponents.isEmpty();
        case MetricvaluesPackage.COMPONENT__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        case MetricvaluesPackage.COMPONENT__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
        case MetricvaluesPackage.COMPONENT__CLASSES:
            return (classes != null) && !classes.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) {
            return super.toString();
        }

        final StringBuilder result = new StringBuilder(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(", id: ");
        result.append(id);
        result.append(')');
        return result.toString();
    }

} // ComponentImpl
