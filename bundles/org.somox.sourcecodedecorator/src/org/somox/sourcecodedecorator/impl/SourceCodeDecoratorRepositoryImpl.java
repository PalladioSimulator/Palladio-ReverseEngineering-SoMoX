/**
 */
package org.somox.sourcecodedecorator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.somox.sourcecodedecorator.AbstractActionClassMethodLink;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;
import org.somox.sourcecodedecorator.ControlFlowLevelSourceCodeLink;
import org.somox.sourcecodedecorator.DataTypeSourceCodeLink;
import org.somox.sourcecodedecorator.FileLevelSourceCodeLink;
import org.somox.sourcecodedecorator.InterfaceSourceCodeLink;
import org.somox.sourcecodedecorator.MethodLevelResourceDemandingInternalBehaviorLink;
import org.somox.sourcecodedecorator.MethodLevelSourceCodeLink;
import org.somox.sourcecodedecorator.SEFF2MethodMapping;
import org.somox.sourcecodedecorator.SeffElementSourceCodeLink;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;
import org.somox.sourcecodedecorator.SourcecodedecoratorPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Source
 * Code Decorator Repository</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.somox.sourcecodedecorator.impl.SourceCodeDecoratorRepositoryImpl#getFileLevelSourceCodeLink
 * <em>File Level Source Code Link</em>}</li>
 * <li>{@link org.somox.sourcecodedecorator.impl.SourceCodeDecoratorRepositoryImpl#getMethodLevelSourceCodeLink
 * <em>Method Level Source Code Link</em>}</li>
 * <li>{@link org.somox.sourcecodedecorator.impl.SourceCodeDecoratorRepositoryImpl#getControlFlowLevelSourceCodeLink
 * <em>Control Flow Level Source Code Link</em>}</li>
 * <li>{@link org.somox.sourcecodedecorator.impl.SourceCodeDecoratorRepositoryImpl#getInterfaceSourceCodeLink
 * <em>Interface Source Code Link</em>}</li>
 * <li>{@link org.somox.sourcecodedecorator.impl.SourceCodeDecoratorRepositoryImpl#getComponentImplementingClassesLink
 * <em>Component Implementing Classes Link</em>}</li>
 * <li>{@link org.somox.sourcecodedecorator.impl.SourceCodeDecoratorRepositoryImpl#getDataTypeSourceCodeLink
 * <em>Data Type Source Code Link</em>}</li>
 * <li>{@link org.somox.sourcecodedecorator.impl.SourceCodeDecoratorRepositoryImpl#getAbstractActionClassMethodLink
 * <em>Abstract Action Class Method Link</em>}</li>
 * <li>{@link org.somox.sourcecodedecorator.impl.SourceCodeDecoratorRepositoryImpl#getMethodLevelResourceDemandingInternalBehaviorLink
 * <em>Method Level Resource Demanding Internal Behavior Link</em>}</li>
 * <li>{@link org.somox.sourcecodedecorator.impl.SourceCodeDecoratorRepositoryImpl#getSeff2MethodMappings
 * <em>Seff2 Method Mappings</em>}</li>
 * <li>{@link org.somox.sourcecodedecorator.impl.SourceCodeDecoratorRepositoryImpl#getSeffElementsSourceCodeLinks
 * <em>Seff Elements Source Code Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceCodeDecoratorRepositoryImpl extends MinimalEObjectImpl.Container
        implements SourceCodeDecoratorRepository {
    /**
     * The cached value of the '{@link #getFileLevelSourceCodeLink() <em>File Level
     * Source Code Link</em>}' containment reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getFileLevelSourceCodeLink()
     * @generated
     * @ordered
     */
    protected EList<FileLevelSourceCodeLink> fileLevelSourceCodeLink;

    /**
     * The cached value of the '{@link #getMethodLevelSourceCodeLink() <em>Method
     * Level Source Code Link</em>}' containment reference list. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getMethodLevelSourceCodeLink()
     * @generated
     * @ordered
     */
    protected EList<MethodLevelSourceCodeLink> methodLevelSourceCodeLink;

    /**
     * The cached value of the '{@link #getControlFlowLevelSourceCodeLink()
     * <em>Control Flow Level Source Code Link</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getControlFlowLevelSourceCodeLink()
     * @generated
     * @ordered
     */
    protected EList<ControlFlowLevelSourceCodeLink> controlFlowLevelSourceCodeLink;

    /**
     * The cached value of the '{@link #getInterfaceSourceCodeLink() <em>Interface
     * Source Code Link</em>}' containment reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getInterfaceSourceCodeLink()
     * @generated
     * @ordered
     */
    protected EList<InterfaceSourceCodeLink> interfaceSourceCodeLink;

    /**
     * The cached value of the '{@link #getComponentImplementingClassesLink()
     * <em>Component Implementing Classes Link</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getComponentImplementingClassesLink()
     * @generated
     * @ordered
     */
    protected EList<ComponentImplementingClassesLink> componentImplementingClassesLink;

    /**
     * The cached value of the '{@link #getDataTypeSourceCodeLink() <em>Data Type
     * Source Code Link</em>}' containment reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDataTypeSourceCodeLink()
     * @generated
     * @ordered
     */
    protected EList<DataTypeSourceCodeLink> dataTypeSourceCodeLink;

    /**
     * The cached value of the '{@link #getAbstractActionClassMethodLink()
     * <em>Abstract Action Class Method Link</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAbstractActionClassMethodLink()
     * @generated
     * @ordered
     */
    protected EList<AbstractActionClassMethodLink> abstractActionClassMethodLink;

    /**
     * The cached value of the
     * '{@link #getMethodLevelResourceDemandingInternalBehaviorLink() <em>Method
     * Level Resource Demanding Internal Behavior Link</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMethodLevelResourceDemandingInternalBehaviorLink()
     * @generated
     * @ordered
     */
    protected EList<MethodLevelResourceDemandingInternalBehaviorLink> methodLevelResourceDemandingInternalBehaviorLink;

    /**
     * The cached value of the '{@link #getSeff2MethodMappings() <em>Seff2 Method
     * Mappings</em>}' containment reference list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getSeff2MethodMappings()
     * @generated
     * @ordered
     */
    protected EList<SEFF2MethodMapping> seff2MethodMappings;

    /**
     * The cached value of the '{@link #getSeffElementsSourceCodeLinks() <em>Seff
     * Elements Source Code Links</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSeffElementsSourceCodeLinks()
     * @generated
     * @ordered
     */
    protected EList<SeffElementSourceCodeLink> seffElementsSourceCodeLinks;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SourceCodeDecoratorRepositoryImpl() {
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SourcecodedecoratorPackage.Literals.SOURCE_CODE_DECORATOR_REPOSITORY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<FileLevelSourceCodeLink> getFileLevelSourceCodeLink() {
        if (fileLevelSourceCodeLink == null) {
            fileLevelSourceCodeLink = new EObjectContainmentEList<>(FileLevelSourceCodeLink.class, this,
                    SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__FILE_LEVEL_SOURCE_CODE_LINK);
        }
        return fileLevelSourceCodeLink;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<MethodLevelSourceCodeLink> getMethodLevelSourceCodeLink() {
        if (methodLevelSourceCodeLink == null) {
            methodLevelSourceCodeLink = new EObjectContainmentEList<>(MethodLevelSourceCodeLink.class, this,
                    SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__METHOD_LEVEL_SOURCE_CODE_LINK);
        }
        return methodLevelSourceCodeLink;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ControlFlowLevelSourceCodeLink> getControlFlowLevelSourceCodeLink() {
        if (controlFlowLevelSourceCodeLink == null) {
            controlFlowLevelSourceCodeLink = new EObjectContainmentEList<>(ControlFlowLevelSourceCodeLink.class, this,
                    SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__CONTROL_FLOW_LEVEL_SOURCE_CODE_LINK);
        }
        return controlFlowLevelSourceCodeLink;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<InterfaceSourceCodeLink> getInterfaceSourceCodeLink() {
        if (interfaceSourceCodeLink == null) {
            interfaceSourceCodeLink = new EObjectContainmentEList<>(InterfaceSourceCodeLink.class, this,
                    SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__INTERFACE_SOURCE_CODE_LINK);
        }
        return interfaceSourceCodeLink;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ComponentImplementingClassesLink> getComponentImplementingClassesLink() {
        if (componentImplementingClassesLink == null) {
            componentImplementingClassesLink = new EObjectContainmentEList<>(ComponentImplementingClassesLink.class,
                    this,
                    SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__COMPONENT_IMPLEMENTING_CLASSES_LINK);
        }
        return componentImplementingClassesLink;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<DataTypeSourceCodeLink> getDataTypeSourceCodeLink() {
        if (dataTypeSourceCodeLink == null) {
            dataTypeSourceCodeLink = new EObjectContainmentEList<>(DataTypeSourceCodeLink.class, this,
                    SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__DATA_TYPE_SOURCE_CODE_LINK);
        }
        return dataTypeSourceCodeLink;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<AbstractActionClassMethodLink> getAbstractActionClassMethodLink() {
        if (abstractActionClassMethodLink == null) {
            abstractActionClassMethodLink = new EObjectContainmentEList<>(AbstractActionClassMethodLink.class, this,
                    SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__ABSTRACT_ACTION_CLASS_METHOD_LINK);
        }
        return abstractActionClassMethodLink;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<MethodLevelResourceDemandingInternalBehaviorLink> getMethodLevelResourceDemandingInternalBehaviorLink() {
        if (methodLevelResourceDemandingInternalBehaviorLink == null) {
            methodLevelResourceDemandingInternalBehaviorLink = new EObjectContainmentEList<>(
                    MethodLevelResourceDemandingInternalBehaviorLink.class, this,
                    SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__METHOD_LEVEL_RESOURCE_DEMANDING_INTERNAL_BEHAVIOR_LINK);
        }
        return methodLevelResourceDemandingInternalBehaviorLink;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<SEFF2MethodMapping> getSeff2MethodMappings() {
        if (seff2MethodMappings == null) {
            seff2MethodMappings = new EObjectContainmentEList<>(SEFF2MethodMapping.class, this,
                    SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__SEFF2_METHOD_MAPPINGS);
        }
        return seff2MethodMappings;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<SeffElementSourceCodeLink> getSeffElementsSourceCodeLinks() {
        if (seffElementsSourceCodeLinks == null) {
            seffElementsSourceCodeLinks = new EObjectContainmentEList<>(SeffElementSourceCodeLink.class, this,
                    SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__SEFF_ELEMENTS_SOURCE_CODE_LINKS);
        }
        return seffElementsSourceCodeLinks;
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
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__FILE_LEVEL_SOURCE_CODE_LINK:
            return ((InternalEList<?>) getFileLevelSourceCodeLink()).basicRemove(otherEnd, msgs);
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__METHOD_LEVEL_SOURCE_CODE_LINK:
            return ((InternalEList<?>) getMethodLevelSourceCodeLink()).basicRemove(otherEnd, msgs);
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__CONTROL_FLOW_LEVEL_SOURCE_CODE_LINK:
            return ((InternalEList<?>) getControlFlowLevelSourceCodeLink()).basicRemove(otherEnd, msgs);
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__INTERFACE_SOURCE_CODE_LINK:
            return ((InternalEList<?>) getInterfaceSourceCodeLink()).basicRemove(otherEnd, msgs);
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__COMPONENT_IMPLEMENTING_CLASSES_LINK:
            return ((InternalEList<?>) getComponentImplementingClassesLink()).basicRemove(otherEnd, msgs);
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__DATA_TYPE_SOURCE_CODE_LINK:
            return ((InternalEList<?>) getDataTypeSourceCodeLink()).basicRemove(otherEnd, msgs);
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__ABSTRACT_ACTION_CLASS_METHOD_LINK:
            return ((InternalEList<?>) getAbstractActionClassMethodLink()).basicRemove(otherEnd, msgs);
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__METHOD_LEVEL_RESOURCE_DEMANDING_INTERNAL_BEHAVIOR_LINK:
            return ((InternalEList<?>) getMethodLevelResourceDemandingInternalBehaviorLink()).basicRemove(otherEnd,
                    msgs);
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__SEFF2_METHOD_MAPPINGS:
            return ((InternalEList<?>) getSeff2MethodMappings()).basicRemove(otherEnd, msgs);
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__SEFF_ELEMENTS_SOURCE_CODE_LINKS:
            return ((InternalEList<?>) getSeffElementsSourceCodeLinks()).basicRemove(otherEnd, msgs);
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
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__FILE_LEVEL_SOURCE_CODE_LINK:
            return getFileLevelSourceCodeLink();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__METHOD_LEVEL_SOURCE_CODE_LINK:
            return getMethodLevelSourceCodeLink();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__CONTROL_FLOW_LEVEL_SOURCE_CODE_LINK:
            return getControlFlowLevelSourceCodeLink();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__INTERFACE_SOURCE_CODE_LINK:
            return getInterfaceSourceCodeLink();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__COMPONENT_IMPLEMENTING_CLASSES_LINK:
            return getComponentImplementingClassesLink();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__DATA_TYPE_SOURCE_CODE_LINK:
            return getDataTypeSourceCodeLink();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__ABSTRACT_ACTION_CLASS_METHOD_LINK:
            return getAbstractActionClassMethodLink();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__METHOD_LEVEL_RESOURCE_DEMANDING_INTERNAL_BEHAVIOR_LINK:
            return getMethodLevelResourceDemandingInternalBehaviorLink();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__SEFF2_METHOD_MAPPINGS:
            return getSeff2MethodMappings();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__SEFF_ELEMENTS_SOURCE_CODE_LINKS:
            return getSeffElementsSourceCodeLinks();
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
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__FILE_LEVEL_SOURCE_CODE_LINK:
            getFileLevelSourceCodeLink().clear();
            getFileLevelSourceCodeLink().addAll((Collection<? extends FileLevelSourceCodeLink>) newValue);
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__METHOD_LEVEL_SOURCE_CODE_LINK:
            getMethodLevelSourceCodeLink().clear();
            getMethodLevelSourceCodeLink().addAll((Collection<? extends MethodLevelSourceCodeLink>) newValue);
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__CONTROL_FLOW_LEVEL_SOURCE_CODE_LINK:
            getControlFlowLevelSourceCodeLink().clear();
            getControlFlowLevelSourceCodeLink().addAll((Collection<? extends ControlFlowLevelSourceCodeLink>) newValue);
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__INTERFACE_SOURCE_CODE_LINK:
            getInterfaceSourceCodeLink().clear();
            getInterfaceSourceCodeLink().addAll((Collection<? extends InterfaceSourceCodeLink>) newValue);
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__COMPONENT_IMPLEMENTING_CLASSES_LINK:
            getComponentImplementingClassesLink().clear();
            getComponentImplementingClassesLink()
                    .addAll((Collection<? extends ComponentImplementingClassesLink>) newValue);
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__DATA_TYPE_SOURCE_CODE_LINK:
            getDataTypeSourceCodeLink().clear();
            getDataTypeSourceCodeLink().addAll((Collection<? extends DataTypeSourceCodeLink>) newValue);
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__ABSTRACT_ACTION_CLASS_METHOD_LINK:
            getAbstractActionClassMethodLink().clear();
            getAbstractActionClassMethodLink().addAll((Collection<? extends AbstractActionClassMethodLink>) newValue);
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__METHOD_LEVEL_RESOURCE_DEMANDING_INTERNAL_BEHAVIOR_LINK:
            getMethodLevelResourceDemandingInternalBehaviorLink().clear();
            getMethodLevelResourceDemandingInternalBehaviorLink()
                    .addAll((Collection<? extends MethodLevelResourceDemandingInternalBehaviorLink>) newValue);
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__SEFF2_METHOD_MAPPINGS:
            getSeff2MethodMappings().clear();
            getSeff2MethodMappings().addAll((Collection<? extends SEFF2MethodMapping>) newValue);
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__SEFF_ELEMENTS_SOURCE_CODE_LINKS:
            getSeffElementsSourceCodeLinks().clear();
            getSeffElementsSourceCodeLinks().addAll((Collection<? extends SeffElementSourceCodeLink>) newValue);
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
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__FILE_LEVEL_SOURCE_CODE_LINK:
            getFileLevelSourceCodeLink().clear();
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__METHOD_LEVEL_SOURCE_CODE_LINK:
            getMethodLevelSourceCodeLink().clear();
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__CONTROL_FLOW_LEVEL_SOURCE_CODE_LINK:
            getControlFlowLevelSourceCodeLink().clear();
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__INTERFACE_SOURCE_CODE_LINK:
            getInterfaceSourceCodeLink().clear();
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__COMPONENT_IMPLEMENTING_CLASSES_LINK:
            getComponentImplementingClassesLink().clear();
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__DATA_TYPE_SOURCE_CODE_LINK:
            getDataTypeSourceCodeLink().clear();
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__ABSTRACT_ACTION_CLASS_METHOD_LINK:
            getAbstractActionClassMethodLink().clear();
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__METHOD_LEVEL_RESOURCE_DEMANDING_INTERNAL_BEHAVIOR_LINK:
            getMethodLevelResourceDemandingInternalBehaviorLink().clear();
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__SEFF2_METHOD_MAPPINGS:
            getSeff2MethodMappings().clear();
            return;
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__SEFF_ELEMENTS_SOURCE_CODE_LINKS:
            getSeffElementsSourceCodeLinks().clear();
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
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__FILE_LEVEL_SOURCE_CODE_LINK:
            return (fileLevelSourceCodeLink != null) && !fileLevelSourceCodeLink.isEmpty();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__METHOD_LEVEL_SOURCE_CODE_LINK:
            return (methodLevelSourceCodeLink != null) && !methodLevelSourceCodeLink.isEmpty();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__CONTROL_FLOW_LEVEL_SOURCE_CODE_LINK:
            return (controlFlowLevelSourceCodeLink != null) && !controlFlowLevelSourceCodeLink.isEmpty();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__INTERFACE_SOURCE_CODE_LINK:
            return (interfaceSourceCodeLink != null) && !interfaceSourceCodeLink.isEmpty();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__COMPONENT_IMPLEMENTING_CLASSES_LINK:
            return (componentImplementingClassesLink != null) && !componentImplementingClassesLink.isEmpty();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__DATA_TYPE_SOURCE_CODE_LINK:
            return (dataTypeSourceCodeLink != null) && !dataTypeSourceCodeLink.isEmpty();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__ABSTRACT_ACTION_CLASS_METHOD_LINK:
            return (abstractActionClassMethodLink != null) && !abstractActionClassMethodLink.isEmpty();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__METHOD_LEVEL_RESOURCE_DEMANDING_INTERNAL_BEHAVIOR_LINK:
            return (methodLevelResourceDemandingInternalBehaviorLink != null)
                    && !methodLevelResourceDemandingInternalBehaviorLink.isEmpty();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__SEFF2_METHOD_MAPPINGS:
            return (seff2MethodMappings != null) && !seff2MethodMappings.isEmpty();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY__SEFF_ELEMENTS_SOURCE_CODE_LINKS:
            return (seffElementsSourceCodeLinks != null) && !seffElementsSourceCodeLinks.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // SourceCodeDecoratorRepositoryImpl
