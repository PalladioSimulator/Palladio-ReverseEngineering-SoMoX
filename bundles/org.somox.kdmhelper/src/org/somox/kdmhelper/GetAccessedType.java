package org.somox.kdmhelper;

import tools.mdsd.jamopp.model.java.classifiers.ConcreteClassifier;
import tools.mdsd.jamopp.model.java.commons.Commentable;
import tools.mdsd.jamopp.model.java.references.IdentifierReference;
import tools.mdsd.jamopp.model.java.references.MethodCall;
import tools.mdsd.jamopp.model.java.references.ReferenceableElement;
import tools.mdsd.jamopp.model.java.types.PrimitiveType;
import tools.mdsd.jamopp.model.java.types.Type;
import tools.mdsd.jamopp.model.java.types.TypeReference;

public class GetAccessedType {

    /**
     * Computes the accessed type for an access.
     *
     * @param input The input access.
     * @return The accessed Type from the access.
     */
    public static Type getAccessedType(final Commentable input) {

        if (input instanceof IdentifierReference) {

            return getAccessedType((IdentifierReference) input);
        }
        if (input instanceof TypeReference) {

            return getAccessedType((TypeReference) input);
        }
        if (input instanceof MethodCall) {

            return getAccessedType((MethodCall) input);
        }
        return null;
    }

    public static Type getAccessedType(final IdentifierReference reference) {
        if (reference != null) {
            return reference.getType();
        }
        return null;
    }

    public static Type getAccessedType(final TypeReference reference) {
        if ((reference != null) && (reference.getTarget() instanceof ConcreteClassifier)) {
            return reference.getTarget();
        }
        if (reference instanceof PrimitiveType) {
            return (PrimitiveType) reference;
        }
        return null;

    }

    public static ConcreteClassifier getAccessedType(final MethodCall methodCall) {
        if ((methodCall != null) && (methodCall.getType() != null)) {
            final ReferenceableElement targetMethod = methodCall.getTarget();
            return targetMethod.getContainingConcreteClassifier();
        }
        return null;
    }

}
