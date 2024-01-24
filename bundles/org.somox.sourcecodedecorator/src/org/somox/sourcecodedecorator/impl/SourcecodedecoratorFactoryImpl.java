/**
 */
package org.somox.sourcecodedecorator.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.somox.sourcecodedecorator.AbstractActionClassMethodLink;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;
import org.somox.sourcecodedecorator.ControlFlowLevelSourceCodeLink;
import org.somox.sourcecodedecorator.DataTypeSourceCodeLink;
import org.somox.sourcecodedecorator.FileLevelSourceCodeLink;
import org.somox.sourcecodedecorator.InnerDatatypeSourceCodeLink;
import org.somox.sourcecodedecorator.InterfaceSourceCodeLink;
import org.somox.sourcecodedecorator.MethodLevelResourceDemandingInternalBehaviorLink;
import org.somox.sourcecodedecorator.MethodLevelSourceCodeLink;
import org.somox.sourcecodedecorator.PCMSystemImplementatingClassesLink;
import org.somox.sourcecodedecorator.SEFF2MethodMapping;
import org.somox.sourcecodedecorator.SeffElementSourceCodeLink;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;
import org.somox.sourcecodedecorator.SourcecodedecoratorFactory;
import org.somox.sourcecodedecorator.SourcecodedecoratorPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class SourcecodedecoratorFactoryImpl extends EFactoryImpl implements SourcecodedecoratorFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public static SourcecodedecoratorFactory init() {
        try {
            final SourcecodedecoratorFactory theSourcecodedecoratorFactory = (SourcecodedecoratorFactory) EPackage.Registry.INSTANCE
                    .getEFactory(SourcecodedecoratorPackage.eNS_URI);
            if (theSourcecodedecoratorFactory != null) {
                return theSourcecodedecoratorFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SourcecodedecoratorFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    public SourcecodedecoratorFactoryImpl() {
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        return switch (eClass.getClassifierID()) {
        case SourcecodedecoratorPackage.FILE_LEVEL_SOURCE_CODE_LINK -> createFileLevelSourceCodeLink();
        case SourcecodedecoratorPackage.METHOD_LEVEL_SOURCE_CODE_LINK -> createMethodLevelSourceCodeLink();
        case SourcecodedecoratorPackage.CONTROL_FLOW_LEVEL_SOURCE_CODE_LINK -> createControlFlowLevelSourceCodeLink();
        case SourcecodedecoratorPackage.SOURCE_CODE_DECORATOR_REPOSITORY -> createSourceCodeDecoratorRepository();
        case SourcecodedecoratorPackage.INTERFACE_SOURCE_CODE_LINK -> createInterfaceSourceCodeLink();
        case SourcecodedecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK -> createComponentImplementingClassesLink();
        case SourcecodedecoratorPackage.PCM_SYSTEM_IMPLEMENTATING_CLASSES_LINK ->
            createPCMSystemImplementatingClassesLink();
        case SourcecodedecoratorPackage.DATA_TYPE_SOURCE_CODE_LINK -> createDataTypeSourceCodeLink();
        case SourcecodedecoratorPackage.INNER_DATATYPE_SOURCE_CODE_LINK -> createInnerDatatypeSourceCodeLink();
        case SourcecodedecoratorPackage.ABSTRACT_ACTION_CLASS_METHOD_LINK -> createAbstractActionClassMethodLink();
        case SourcecodedecoratorPackage.METHOD_LEVEL_RESOURCE_DEMANDING_INTERNAL_BEHAVIOR_LINK ->
            createMethodLevelResourceDemandingInternalBehaviorLink();
        case SourcecodedecoratorPackage.SEFF2_METHOD_MAPPING -> createSEFF2MethodMapping();
        case SourcecodedecoratorPackage.SEFF_ELEMENT_SOURCE_CODE_LINK -> createSeffElementSourceCodeLink();
        default -> throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        };
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public FileLevelSourceCodeLink createFileLevelSourceCodeLink() {
        return new FileLevelSourceCodeLinkImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MethodLevelSourceCodeLink createMethodLevelSourceCodeLink() {
        return new MethodLevelSourceCodeLinkImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ControlFlowLevelSourceCodeLink createControlFlowLevelSourceCodeLink() {
        return new ControlFlowLevelSourceCodeLinkImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SourceCodeDecoratorRepository createSourceCodeDecoratorRepository() {
        return new SourceCodeDecoratorRepositoryImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public InterfaceSourceCodeLink createInterfaceSourceCodeLink() {
        return new InterfaceSourceCodeLinkImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComponentImplementingClassesLink createComponentImplementingClassesLink() {
        return new ComponentImplementingClassesLinkImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PCMSystemImplementatingClassesLink createPCMSystemImplementatingClassesLink() {
        return new PCMSystemImplementatingClassesLinkImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DataTypeSourceCodeLink createDataTypeSourceCodeLink() {
        return new DataTypeSourceCodeLinkImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public InnerDatatypeSourceCodeLink createInnerDatatypeSourceCodeLink() {
        return new InnerDatatypeSourceCodeLinkImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AbstractActionClassMethodLink createAbstractActionClassMethodLink() {
        return new AbstractActionClassMethodLinkImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MethodLevelResourceDemandingInternalBehaviorLink createMethodLevelResourceDemandingInternalBehaviorLink() {
        return new MethodLevelResourceDemandingInternalBehaviorLinkImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SEFF2MethodMapping createSEFF2MethodMapping() {
        return new SEFF2MethodMappingImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SeffElementSourceCodeLink createSeffElementSourceCodeLink() {
        return new SeffElementSourceCodeLinkImpl();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SourcecodedecoratorPackage getSourcecodedecoratorPackage() {
        return (SourcecodedecoratorPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SourcecodedecoratorPackage getPackage() {
        return SourcecodedecoratorPackage.eINSTANCE;
    }

} // SourcecodedecoratorFactoryImpl
