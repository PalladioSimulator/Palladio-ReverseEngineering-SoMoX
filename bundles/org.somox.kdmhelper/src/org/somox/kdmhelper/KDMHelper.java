package org.somox.kdmhelper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.parser.TagElement;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.BodyDeclaration;

import tools.mdsd.jamopp.model.java.classifiers.Class;
import tools.mdsd.jamopp.model.java.classifiers.Classifier;
import tools.mdsd.jamopp.model.java.classifiers.ConcreteClassifier;
import tools.mdsd.jamopp.model.java.classifiers.Interface;
import tools.mdsd.jamopp.model.java.commons.Commentable;
import tools.mdsd.jamopp.model.java.commons.NamedElement;
import tools.mdsd.jamopp.model.java.containers.CompilationUnit;
import tools.mdsd.jamopp.model.java.containers.Package;
import tools.mdsd.jamopp.model.java.generics.TypeArgument;
import tools.mdsd.jamopp.model.java.members.Constructor;
import tools.mdsd.jamopp.model.java.members.Member;
import tools.mdsd.jamopp.model.java.members.Method;
import tools.mdsd.jamopp.model.java.modifiers.AnnotableAndModifiable;
import tools.mdsd.jamopp.model.java.modifiers.Final;
import tools.mdsd.jamopp.model.java.modifiers.Modifier;
import tools.mdsd.jamopp.model.java.modifiers.ModifiersFactory;
import tools.mdsd.jamopp.model.java.modifiers.Private;
import tools.mdsd.jamopp.model.java.modifiers.Static;
import tools.mdsd.jamopp.model.java.parameters.Parameter;
import tools.mdsd.jamopp.model.java.parameters.VariableLengthParameter;
import tools.mdsd.jamopp.model.java.references.IdentifierReference;
import tools.mdsd.jamopp.model.java.references.MethodCall;
import tools.mdsd.jamopp.model.java.references.ReferenceableElement;
import tools.mdsd.jamopp.model.java.statements.StatementListContainer;
import tools.mdsd.jamopp.model.java.statements.StatementsFactory;
import tools.mdsd.jamopp.model.java.types.ClassifierReference;
import tools.mdsd.jamopp.model.java.types.PrimitiveType;
import tools.mdsd.jamopp.model.java.types.Type;
import tools.mdsd.jamopp.model.java.types.TypeReference;

/**
 * This class contains a set of methods that are missing in the MoDisco Java
 * meta model in comparison to the SISSy G-AST meta model.
 *
 * @author Oliver
 *
 */
public class KDMHelper {

    /**
     * SISSy does not model type parameters.<br>
     * For example:
     *
     * <pre>
     * List &lt;String&gt;
     * </pre>
     *
     * only detects List as type access. <br>
     * If this variable is true, then this class works like SISSy. Else, for the
     * example it also returns the String type.
     */
    private static boolean SISSYMODE = false;

    // /**
    // *
    // * @param clazz
    // * @return the real methods (not constructors) of a Class
    // */
    // public static List<AbstractMethodDeclaration> getMethods(ClassDeclaration
    // clazz){
    // List<AbstractMethodDeclaration> result = new
    // ArrayList<AbstractMethodDeclaration>();
    // for(BodyDeclaration bodyDec : clazz.getBodyDeclarations()){
    // if(bodyDec instanceof MethodDeclaration){
    // result.add((AbstractMethodDeclaration) bodyDec);
    // }
    // }
    // return result;
    // }
    public static String getName(final Type type) {
        if (null == type) {
            return null;
        }
        if (type instanceof NamedElement) {
            return ((NamedElement) type).getName();
        }
        if (type instanceof Classifier) {
            return ((Classifier) type).getName();
        }
        if (type instanceof Package) {
            return ((Package) type).getName();
        }
        if (type instanceof CompilationUnit) {
            return ((CompilationUnit) type).getName();
        }
        if (type instanceof Method) {
            return ((Method) type).getName();
        }
        if (type instanceof Parameter) {
            return ((Parameter) type).getName();
        }
        if (type instanceof Member) {
            return ((Member) type).getName();
        }
        if (type instanceof Interface) {
            return ((Interface) type).getName();
        }
        if (type instanceof PrimitiveType) {
            return getName((PrimitiveType) type);
        }
        return type.toString();
    }

    public static String getName(final PrimitiveType type) {
        if (type instanceof tools.mdsd.jamopp.model.java.types.Boolean) {
            return "bool";
        }
        if (type instanceof tools.mdsd.jamopp.model.java.types.Byte) {
            return "byte";
        }
        if (type instanceof tools.mdsd.jamopp.model.java.types.Char) {
            return "char";
        }
        if (type instanceof tools.mdsd.jamopp.model.java.types.Double) {
            return "double";
        }
        if (type instanceof tools.mdsd.jamopp.model.java.types.Float) {
            return "float";
        }
        if (type instanceof tools.mdsd.jamopp.model.java.types.Int) {
            return "int";
        }
        if (type instanceof tools.mdsd.jamopp.model.java.types.Long) {
            return "long";
        }
        if (type instanceof tools.mdsd.jamopp.model.java.types.Short) {
            return "short";
        }
        if (type instanceof tools.mdsd.jamopp.model.java.types.Void) {
            return "void";
        }
        return type.toString();
    }

    /**
     * Returns the qualified name for a type.
     *
     * @param astClass the {@link ASTNode} object
     * @return the full qualified name of the input object
     */
    public static String computeFullQualifiedName(final Commentable astClass) {
        EObject pack = astClass;

        String result = "";

        if (pack instanceof NamedElement) {
            result = getNameOfNamedElement((NamedElement) pack);
        }

        while (pack != null) {

            if ((pack.eContainer() != null) && (pack.eContainer() instanceof NamedElement)) {
                pack = pack.eContainer();
                result = getNameOfNamedElement((NamedElement) pack) + "." + result;
            } else {
                pack = pack.eContainer();
            }
        }
        return removeLastPoint(result);
    }

    public static Method getMethod(final MethodCall methodCall) {
        final ReferenceableElement re = methodCall.getTarget();
        if (re instanceof Method) {
            return (Method) re;
        }
        return null;
        // TODO: log error

    }

    public static String removeLastPoint(final String result) {
        if ((result != null) && result.endsWith(".")) {
            return result.substring(0, result.length() - 1);
        }
        return result;
    }

    private static String getNameOfNamedElement(final NamedElement input) {
        String result = "";
        if (input instanceof Method) {
            result = input.getName() + "()";
        } else {
            result = input.getName();
        }
        return result;
    }

    // TODO refactor with
    /**
     * For an access, returns the accessed types. <b>The result set does not contain
     * null pointer.</b>
     *
     * @param element an access element
     * @return the set of accessed types
     */
    private static Set<Type> getAccessedTypes(final Commentable element) {
        final Set<Type> result = new HashSet<>();

        final Type accessedType = GetAccessedType.getAccessedType(element);
        if (SISSYMODE) {
            if (accessedType != null) {
                result.add(accessedType);
            }
        } else if (accessedType instanceof VariableLengthParameter) {
            final Parameter paramType = (Parameter) accessedType;
            // 1. add main type
            result.add(paramType.getTypeReference().getTarget());
            // 2. add type arguments
            for (final TypeArgument typeAccess : paramType.getTypeArguments()) {
                if (((TypeReference) typeAccess).getTarget() instanceof Parameter) {
                    // recursive call
                    result.addAll(getAccessedTypes(typeAccess));
                } else {
                    result.add(GetAccessedType.getAccessedType(typeAccess));
                }
            }
        } else {// if a normal Type
            result.add(accessedType);
        }
        return result;

    }

    /**
     * For a {@link ParameterizedType} objects returns the accessed types.
     *
     * @param input a {@link ParameterizedType} object
     * @return a set of the accessed types
     */

    /**
     * Returns all accessed types inside a type.
     *
     * @param input the input {@link Type}
     * @return the list of accessed types
     */
    public static List<Type> getAllAccessedClasses(final Type input) {
        final Set<Type> resultList = new HashSet<>();
        final List<TypeReference> accesses = getAllAccesses(input);

        for (final Commentable node : accesses) {
            resultList.addAll(getAccessedTypes(node));
        }
        return new ArrayList<>(resultList);
    }

    /**
     * Returns <b>all accesses inside an ASTNode object</b>. <br>
     * Accesses <b>inside an {@link TagElement}</b> (for example in JavaDoc
     * comments) <br>
     * are <b>not in the result set</b>.
     *
     * @param input an {@link ASTNode} object
     * @return all accesses inside the ASTNode object
     */
    public static List<TypeReference> getAllAccesses(final Commentable input) {
        final List<TypeReference> result = new ArrayList<>();
        final TreeIterator<EObject> iterator = input.eAllContents();

        while (iterator.hasNext()) {
            final EObject element = iterator.next();
            if ((element instanceof TypeReference) && isAccess((TypeReference) element)) {
                result.add((TypeReference) element);

            }
        }
        return result;
    }

    /**
     * For a type returns all inner classes.
     *
     * @param clazz the input type
     * @return the list of inner classes
     */
    // SOMOXTODOCHANGE inner classes in inner classes???
    public static List<ConcreteClassifier> getInnerClasses(final ConcreteClassifier clazz) {
        final List<ConcreteClassifier> result = new ArrayList<>();
        if (!(clazz instanceof Class)) {
            return result;
        }
        for (final Iterator<EObject> iterator = clazz.eAllContents(); iterator.hasNext();) {
            final EObject element = iterator.next();
            if ((element instanceof Class) && isInnerClass((ConcreteClassifier) element)) {
                result.add((Class) element);
            }
        }
        return result;
    }

    /**
     * For an ASTNode computes the {@link JavaNodeSourceRegion} object.
     *
     * @param node the ASTNode object
     * @return the {@link JavaNodeSourceRegion}
     */
    // JavaNodeSourceRegion
    // Commentable statt
    public static CompilationUnit getJavaNodeSourceRegion(final Commentable node) {

        return node.getContainingCompilationUnit();

    }

    /**
     * Returns all real methods (not constructors) of a type.
     *
     * @param input the
     * @return the real methods (not constructors) of a Class
     */
    public static List<Method> getMethods(final ConcreteClassifier input) {
        return input.getMethods();
    }

    /**
     * Returns, if exist, the overridden member, else null.
     *
     * @param methDecInput the method object
     * @return the overridden method
     */
    public static Method getOverriddenASTNode(final Method methDecInput) {

        final ConcreteClassifier classifierOfMethod = methDecInput.getContainingConcreteClassifier();
        final Collection<ConcreteClassifier> superTypes = getSuperTypes(classifierOfMethod);

        for (final ConcreteClassifier concreteClassifier : superTypes) {
            final List<Method> method = KDMHelper.getMethods(concreteClassifier);
            for (final Method methodDeclaration : method) {
                if (EqualityChecker.areFunctionsEqual(methDecInput, methodDeclaration)) {
                    return methodDeclaration;
                }
            }
        }

        return null;
    }

    /**
     * Returns a string representing the {@link Commentable} object.
     *
     * @param node the {@link ASTNode} object
     * @return the toString string of the input object
     */
    public static String getSISSyID(final Commentable node) {
        return node.toString();
    }

    /**
     * Queries the {@link SourceFile} object for a {@link JavaNodeSourceRegion}
     * object.
     *
     * @param sourceRegion the input object
     * @return the {@link SourceFile} object
     */

    /**
     * Returns all super types of a type.
     *
     * @param concreteClassifier the input {@link ConcreteClassifier}
     * @return the list of super types
     */
    public static List<ConcreteClassifier> getSuperTypes(final ConcreteClassifier concreteClassifier) {
        if (concreteClassifier == null) {
            return Collections.emptyList();
        }
        return concreteClassifier.getAllSuperClassifiers();
    }

    /**
     * Returns the surrounding package of a type, else null.
     *
     * @param input the input {@link Type}
     * @return the {@link Package} containing the type
     */
    public static Package getSurroundingPackage(final Type input) {
        return null;
        // input.getChildrenByType((Type)Package);//
        // input.getContainingPackageName()

    }

    /**
     * Returns whether the AnnotableAndModifiable object is abstract.
     *
     * @param input the {@link Type} object
     * @return true or false
     */
    public static boolean isAbstract(final AnnotableAndModifiable input) {
        return input.getModifiers().contains(ModifiersFactory.eINSTANCE.createAbstract());
    }

    // TODO check refactor switch class
    // is fast, no refactoring needed
    /**
     *
     * @param element
     * @return true or false
     */
    public static boolean isAccess(final Commentable element) {

        if ((element instanceof MethodCall) || (element instanceof ClassifierReference)
                || (element instanceof IdentifierReference)) {
            return true;
        }

        // TODO check if handles all accesses
        // is an AbstractMethodInvocation, but contains a type access, would
        // else create the TypeAccess twice
        // if (element instanceof TypeReference)
        // if (element instanceof Class) {
        // return false;
        // }
        // if (element instanceof Method) {
        // return true;
        // }
        // if (element instanceof ArraysPackage) {
        // return true;
        // }
        // if (element instanceof Field) {
        // return true;
        // }
        // if (element instanceof TypeReference) {
        // return true;
        // }
        // if (element instanceof SelfReference) {
        // return true;
        // }
        return false;
    }

    /**
     * Checks if a type access is an inheritance type access.
     *
     * @param inputTypeAccess The type access to verify.
     * @return true or false.
     */
    public static boolean isInheritanceTypeAccess(final TypeReference inputTypeAccess) {
        if (inputTypeAccess.eContainer() instanceof ConcreteClassifier) {
            // Type statt AbstractTypeDeclaration
            final ConcreteClassifier concreteClassifier = (ConcreteClassifier) inputTypeAccess.eContainer();
            for (final TypeReference ta : getInheritanceTypeAccesses(concreteClassifier)) {
                if (ta == inputTypeAccess) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<ClassifierReference> getInheritanceTypeAccesses(final ConcreteClassifier concreteClassifier) {
        return concreteClassifier.getSuperTypeReferences();
    }

    /**
     * Returns if the type is an inner class.
     *
     * @param clazz the input {@link Type}
     * @return true or false
     */
    public static boolean isInnerClass(final ConcreteClassifier clazz) {
        return clazz.eContainer() instanceof Class;
    }

    public static EClass[] getNewEClassEnumeration() {
        return null;
    }

    /**
     * Returns if the type is an interface.
     *
     * @param input the input object
     * @return true or false
     */
    public static boolean isInterface(final Commentable input) {
        return input instanceof Interface;
    }

    /**
     *
     * @param method       The method to check the visibility.
     * @param inputVisKind the visibility kind to compare with
     * @return true or false
     */

    /**
     * Returns whether the type is primitive or not.
     *
     * @param input the input {@link Type}
     * @return true or false
     */
    public static boolean isPrimitive(final Type input) {
        return input instanceof PrimitiveType;
    }

    /**
     * A virtual method can be overridden. In Java 1. Static methods cannot be
     * overridden. 2. Non static private and final methods cannot be overridden.
     *
     * @param method the {@link BodyDeclaration} object
     * @return true or false
     */
    public static boolean isVirtual(final Method method) {
        if ((method == null) || (method.getModifiers() == null)) {
            return false;
        }

        for (final Modifier modifier : method.getModifiers()) {
            if ((modifier instanceof Private) || (modifier instanceof Static) || (modifier instanceof Final)) {
                return false;
            }
        }

        return true;
    }

    /**
     * retruns the body of a method Since we use jamopp we return the class method
     * itself since the ClassMethod is a StatementListContainer If the method is not
     * a class method we just return an empty block (which is also a
     * StatementListContainer)
     *
     * @param member
     * @return
     */
    public static StatementListContainer getBody(final Member member) {
        if (member instanceof StatementListContainer) {
            return (StatementListContainer) member;
        }
        return StatementsFactory.eINSTANCE.createBlock();
    }

    public static EList<Package> getOwnedPackages(final Package prefixPackage) {
        // TODO Test
        return null;// ( (Object) prefixPackage).getSubpackages();

        // EList<Package> ownedPackages=null;
        // tools.mdsd.jamopp.model.java.containers.Package p;
        //
        // for (CompilationUnit comUnit :prefixPackage.getCompilationUnits())
        // {
        // comUnit.getNamespaces();
        // if(comUnit.getContainingPackageName())
        // }
        // return null;
    }

    public static Object getPackage(final Package element) {
        // TODO Auto-generated method stub
        return null;
    }

    public static Collection<Package> getOwnedElements(final Package element) {
        // TODO Auto-generated method stub
        return null;
    }

    public static List<Constructor> getConstructors(final Type implementingClass) {
        final List<Constructor> constructors = new ArrayList<>();
        if (implementingClass instanceof final ConcreteClassifier concreteClassifier) {
            for (final Member member : concreteClassifier.getMembers()) {
                if (member instanceof Constructor) {
                    constructors.add((Constructor) member);
                }
            }
        }
        return constructors;
    }

    public static <T> T getFirstChildWithType(final Commentable commentable, final java.lang.Class<T> classType) {
        final EList<T> children = commentable.getChildrenByType(classType);
        if ((null != children) && (0 < children.size())) {
            return children.get(0);
        }
        return null;
    }

}
