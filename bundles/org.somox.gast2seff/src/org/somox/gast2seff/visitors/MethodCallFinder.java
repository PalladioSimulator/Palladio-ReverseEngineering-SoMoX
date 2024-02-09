package org.somox.gast2seff.visitors;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

// import tools.mdsd.jamopp.model.java.annotations.AnnotationAttribute;
import tools.mdsd.jamopp.model.java.expressions.Expression;
import tools.mdsd.jamopp.model.java.members.Method;
import tools.mdsd.jamopp.model.java.references.MethodCall;
import tools.mdsd.jamopp.model.java.references.Reference;
import tools.mdsd.jamopp.model.java.statements.Statement;

/**
 * The class finds methodCalls within a statement. It also caches the found
 * method calls for statements to improve performance.
 *
 */
public class MethodCallFinder {

    private static final Logger logger = Logger.getLogger(MethodCallFinder.class.getSimpleName());

    private final HashMap<Statement, List<Method>> methodListCacheForStatement;

    public MethodCallFinder() {
        methodListCacheForStatement = new HashMap<>();
    }

    /**
     * Get and returns the child method or constructor called contained in the
     * statement.
     *
     * @param statement A statement
     * @return A list of methods called if the statement contains one. Otherwise: an
     *         empty list
     */
    public List<Method> getMethodCalls(final Statement statement) {
        if (!methodListCacheForStatement.containsKey(statement)) {
            final LinkedList<Method> calledMethods = new LinkedList<>();
            final Set<EObject> investigatedEObjects = new HashSet<>();

            findMethodCallsInChildren(statement, calledMethods, investigatedEObjects);
            methodListCacheForStatement.put(statement, calledMethods);
        }
        return methodListCacheForStatement.get(statement);
    }

    private void findMethodCallsInChildren(final EObject eObject, final LinkedList<Method> calledMethods,
            final Set<EObject> investigatedEObjects) {
        if (null == eObject) {
            return;
        }
        final TreeIterator<EObject> treeIterator = eObject.eAllContents();
        while (treeIterator.hasNext()) {
            final EObject current = treeIterator.next();
            if (investigatedEObjects.contains(current)) {
                continue;
            }
            investigatedEObjects.add(current);
            if (current instanceof final MethodCall methodCall) {
                findMethodCallsInArguments(methodCall.getArguments(), calledMethods, investigatedEObjects);
                addMethodToCollection(calledMethods, methodCall);
                findMethodCallsInNext(methodCall.getNext(), calledMethods, investigatedEObjects);
            }
        }
    }

    private void findMethodCallsInNext(final Reference next, final LinkedList<Method> calledMethods,
            final Set<EObject> investigatedEObjects) {
        findMethodCallsInChildren(next, calledMethods, investigatedEObjects);

    }

    private void findMethodCallsInArguments(final EList<Expression> arguments, final LinkedList<Method> calledMethods,
            final Set<EObject> investigatedEObjects) {
        for (final Expression expression : arguments) {
            if (expression instanceof MethodCall) {
                investigatedEObjects.add(expression);
                addMethodToCollection(calledMethods, (MethodCall) expression);
            }
            findMethodCallsInChildren(expression, calledMethods, investigatedEObjects);
        }

    }

    private void addMethodToCollection(final LinkedList<Method> calledMethods, final MethodCall methodCall) {
        if (methodCall.getTarget() instanceof Method) {
            final Method target = (Method) methodCall.getTarget();
            // if (target instanceof AnnotationAttribute) {
            // MethodCallFinder.logger.info("Annotation Attribut found within methodCall in
            // a method of the
            // class"
            // + methodCall.getContainingConcreteClassifier() + " target: "
            // + methodCall.getTarget().getName());
            // calledMethods.add(target);
            // } else if (target instanceof Method) {
            calledMethods.add(target);
            // }
        }
    }
}
