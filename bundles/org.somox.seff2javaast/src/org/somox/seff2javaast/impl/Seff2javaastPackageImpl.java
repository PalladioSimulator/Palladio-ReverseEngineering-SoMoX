/**
 */
package org.somox.seff2javaast.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.seff.SeffPackage;
import org.somox.seff2javaast.SEFF2JavaAST;
import org.somox.seff2javaast.SEFF2MethodMapping;
import org.somox.seff2javaast.Seff2javaastFactory;
import org.somox.seff2javaast.Seff2javaastPackage;

import tools.mdsd.jamopp.model.java.annotations.AnnotationsPackage;
import tools.mdsd.jamopp.model.java.arrays.ArraysPackage;
import tools.mdsd.jamopp.model.java.classifiers.ClassifiersPackage;
import tools.mdsd.jamopp.model.java.commons.CommonsPackage;
import tools.mdsd.jamopp.model.java.containers.ContainersPackage;
import tools.mdsd.jamopp.model.java.expressions.ExpressionsPackage;
import tools.mdsd.jamopp.model.java.generics.GenericsPackage;
import tools.mdsd.jamopp.model.java.imports.ImportsPackage;
import tools.mdsd.jamopp.model.java.instantiations.InstantiationsPackage;
import tools.mdsd.jamopp.model.java.literals.LiteralsPackage;
import tools.mdsd.jamopp.model.java.members.MembersPackage;
import tools.mdsd.jamopp.model.java.modifiers.ModifiersPackage;
import tools.mdsd.jamopp.model.java.operators.OperatorsPackage;
import tools.mdsd.jamopp.model.java.parameters.ParametersPackage;
import tools.mdsd.jamopp.model.java.references.ReferencesPackage;
import tools.mdsd.jamopp.model.java.statements.StatementsPackage;
import tools.mdsd.jamopp.model.java.types.TypesPackage;
import tools.mdsd.jamopp.model.java.variables.VariablesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class Seff2javaastPackageImpl extends EPackageImpl implements Seff2javaastPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass seff2MethodMappingEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass seff2JavaASTEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
     * package package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory method
     * {@link #init init()}, which also performs initialization of the package, or
     * returns the registered package, if one already exists. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.somox.seff2javaast.Seff2javaastPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private Seff2javaastPackageImpl() {
        super(eNS_URI, Seff2javaastFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and
     * for any others upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link Seff2javaastPackage#eINSTANCE} when
     * that field is accessed. Clients should not invoke it directly. Instead, they
     * should simply access that field to obtain the package. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static Seff2javaastPackage init() {
        if (isInited) {
            return (Seff2javaastPackage) EPackage.Registry.INSTANCE.getEPackage(Seff2javaastPackage.eNS_URI);
        }

        // Obtain or create and register package
        final Seff2javaastPackageImpl theSeff2javaastPackage = (Seff2javaastPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof Seff2javaastPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new Seff2javaastPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        AnnotationsPackage.eINSTANCE.eClass();
        ArraysPackage.eINSTANCE.eClass();
        ClassifiersPackage.eINSTANCE.eClass();
        CommonsPackage.eINSTANCE.eClass();
        ContainersPackage.eINSTANCE.eClass();
        ExpressionsPackage.eINSTANCE.eClass();
        GenericsPackage.eINSTANCE.eClass();
        ImportsPackage.eINSTANCE.eClass();
        InstantiationsPackage.eINSTANCE.eClass();
        LiteralsPackage.eINSTANCE.eClass();
        MembersPackage.eINSTANCE.eClass();
        ModifiersPackage.eINSTANCE.eClass();
        OperatorsPackage.eINSTANCE.eClass();
        ParametersPackage.eINSTANCE.eClass();
        ReferencesPackage.eINSTANCE.eClass();
        StatementsPackage.eINSTANCE.eClass();
        TypesPackage.eINSTANCE.eClass();
        VariablesPackage.eINSTANCE.eClass();
        PcmPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theSeff2javaastPackage.createPackageContents();

        // Initialize created meta-data
        theSeff2javaastPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSeff2javaastPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(Seff2javaastPackage.eNS_URI, theSeff2javaastPackage);
        return theSeff2javaastPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSEFF2MethodMapping() {
        return seff2MethodMappingEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getSEFF2MethodMapping_Blockstatement() {
        return (EReference) seff2MethodMappingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getSEFF2MethodMapping_Seff() {
        return (EReference) seff2MethodMappingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSEFF2JavaAST() {
        return seff2JavaASTEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getSEFF2JavaAST_Seff2MethodMappings() {
        return (EReference) seff2JavaASTEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Seff2javaastFactory getSeff2javaastFactory() {
        return (Seff2javaastFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to
     * have no affect on any invocation but its first. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) {
            return;
        }
        isCreated = true;

        // Create classes and their features
        seff2MethodMappingEClass = createEClass(SEFF2_METHOD_MAPPING);
        createEReference(seff2MethodMappingEClass, SEFF2_METHOD_MAPPING__BLOCKSTATEMENT);
        createEReference(seff2MethodMappingEClass, SEFF2_METHOD_MAPPING__SEFF);

        seff2JavaASTEClass = createEClass(SEFF2_JAVA_AST);
        createEReference(seff2JavaASTEClass, SEFF2_JAVA_AST__SEFF2_METHOD_MAPPINGS);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is
     * guarded to have no affect on any invocation but its first. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) {
            return;
        }
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        final StatementsPackage theStatementsPackage = (StatementsPackage) EPackage.Registry.INSTANCE
                .getEPackage(StatementsPackage.eNS_URI);
        final SeffPackage theSeffPackage = (SeffPackage) EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        this.initEClass(seff2MethodMappingEClass, SEFF2MethodMapping.class, "SEFF2MethodMapping", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(getSEFF2MethodMapping_Blockstatement(), theStatementsPackage.getStatementListContainer(),
                null, "blockstatement", null, 1, 1, SEFF2MethodMapping.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(getSEFF2MethodMapping_Seff(), theSeffPackage.getServiceEffectSpecification(), null, "seff",
                null, 1, 1, SEFF2MethodMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(seff2JavaASTEClass, SEFF2JavaAST.class, "SEFF2JavaAST", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(getSEFF2JavaAST_Seff2MethodMappings(), getSEFF2MethodMapping(), null, "seff2MethodMappings",
                null, 0, -1, SEFF2JavaAST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} // Seff2javaastPackageImpl
