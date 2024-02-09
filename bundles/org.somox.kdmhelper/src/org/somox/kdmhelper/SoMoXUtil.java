package org.somox.kdmhelper;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.ResourcesPlugin;

import tools.mdsd.jamopp.model.java.classifiers.ConcreteClassifier;
import tools.mdsd.jamopp.model.java.members.ClassMethod;
import tools.mdsd.jamopp.model.java.members.InterfaceMethod;
import tools.mdsd.jamopp.model.java.members.Method;
import tools.mdsd.jamopp.model.java.statements.StatementListContainer;

public class SoMoXUtil {

    private SoMoXUtil() {

    }

    /**
     * Determines whether SoMoX is executed within a new Eclipse or whether it runs
     * standalone
     *
     * @return
     */
    public static boolean isStandalone() {
        try {
            ResourcesPlugin.getWorkspace();
        } catch (final IllegalStateException e) {
            // this means we run standalone
            return true;
        }
        return false;
    }

    public static Collection<StatementListContainer> findImplementingMethods(final InterfaceMethod interfaceMethod,
            final Collection<ConcreteClassifier> implementingClasses) {
        final ConcreteClassifier interfaceOfMethod = interfaceMethod.getContainingConcreteClassifier();
        final Set<StatementListContainer> implementingStatementListContainers = new HashSet<>();
        if (null != implementingClasses) {
            for (final ConcreteClassifier classInComponent : implementingClasses) {
                if (KDMHelper.getSuperTypes(classInComponent).contains(interfaceOfMethod)) {
                    // find the overriden interface method
                    for (final Method methodInClass : classInComponent.getMethods()) {
                        if (EqualityChecker.areFunctionsEqual(interfaceMethod, methodInClass)
                                && (methodInClass instanceof ClassMethod)) {
                            implementingStatementListContainers.add(KDMHelper.getBody(methodInClass));
                        }
                    }
                }
            }
        }
        return implementingStatementListContainers;
    }
}
