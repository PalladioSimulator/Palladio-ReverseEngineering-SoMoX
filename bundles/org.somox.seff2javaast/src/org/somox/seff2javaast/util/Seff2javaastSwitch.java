/**
 */
package org.somox.seff2javaast.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.somox.seff2javaast.SEFF2JavaAST;
import org.somox.seff2javaast.SEFF2MethodMapping;
import org.somox.seff2javaast.Seff2javaastPackage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 *
 * @see org.somox.seff2javaast.Seff2javaastPackage
 * @generated
 */
public class Seff2javaastSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static Seff2javaastPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    public Seff2javaastSwitch() {
        if (modelPackage == null) {
            modelPackage = Seff2javaastPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a
     * non null result; it yields that result. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case Seff2javaastPackage.SEFF2_METHOD_MAPPING: {
            final SEFF2MethodMapping seff2MethodMapping = (SEFF2MethodMapping) theEObject;
            T result = this.caseSEFF2MethodMapping(seff2MethodMapping);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case Seff2javaastPackage.SEFF2_JAVA_AST: {
            final SEFF2JavaAST seff2JavaAST = (SEFF2JavaAST) theEObject;
            T result = this.caseSEFF2JavaAST(seff2JavaAST);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of ' <em>SEFF2
     * Method Mapping</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of ' <em>SEFF2
     *         Method Mapping</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSEFF2MethodMapping(final SEFF2MethodMapping object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SEFF2
     * Java AST</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SEFF2
     *         Java AST</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSEFF2JavaAST(final SEFF2JavaAST object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of
     * '<em>EObject</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last
     * case anyway. <!-- end-user-doc -->
     *
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of
     *         '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(final EObject object) {
        return null;
    }

} // Seff2javaastSwitch
