package org.somox.gast2seff.visitors;

import org.apache.log4j.Logger;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.repository.SourceRole;
import org.somox.sourcecodedecorator.InterfaceSourceCodeLink;
import org.somox.sourcecodedecorator.MethodLevelSourceCodeLink;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;

import tools.mdsd.jamopp.model.java.classifiers.ConcreteClassifier;
import tools.mdsd.jamopp.model.java.members.Member;
import tools.mdsd.jamopp.model.java.members.Method;
import tools.mdsd.jamopp.model.java.statements.Statement;

public class DefaultInterfaceOfExternalCallFinder implements InterfaceOfExternalCallFinding {

    private static final Logger logger = Logger.getLogger(DefaultInterfaceOfExternalCallFinder.class.getSimpleName());

    private final SourceCodeDecoratorRepository sourceCodeDecoratorRepository;
    private final BasicComponent basicComponent;

    public DefaultInterfaceOfExternalCallFinder(final SourceCodeDecoratorRepository sourceCodeDecoratorRepository,
            final BasicComponent basicComponent) {
        this.sourceCodeDecoratorRepository = sourceCodeDecoratorRepository;
        this.basicComponent = basicComponent;
    }

    /**
     * Query the interface port for the function access using the source code
     * decorator.
     *
     * @param calledMethod The access to find in the PCM
     * @return interface port and operation for corresponding to the access.
     */
    @Override
    public InterfacePortOperationTuple getCalledInterfacePort(final Method calledMethod, final Statement statement) { // GAST2SEFFCHANGE
        final InterfacePortOperationTuple interfacePortOperationTuple = new InterfacePortOperationTuple();
        final ConcreteClassifier accessedConcreteClassifier = calledMethod.getContainingConcreteClassifier();

        for (final RequiredRole requiredRole : getBasicComponent().getRequiredRoles_InterfaceRequiringEntity()) {
            final Interface pcmInterface = getInterfaceFromRequiredRole(requiredRole);
            for (final InterfaceSourceCodeLink ifLink : getSourceCodeDecoratorRepository()
                    .getInterfaceSourceCodeLink()) {
                if ((pcmInterface != null) && pcmInterface.equals(ifLink.getInterface())) {
                    final ConcreteClassifier gastClass = ifLink.getGastClass();
                    if (gastClass.equals(accessedConcreteClassifier)) {
                        logger.trace("accessed interface port " + requiredRole.getEntityName());
                        interfacePortOperationTuple.role = requiredRole;
                        // query operation:
                        interfacePortOperationTuple.signature = queryInterfaceOperation(calledMethod);
                        return interfacePortOperationTuple;
                    }
                }
            }
        }
        logger.warn("found no if port for " + accessedConcreteClassifier);
        return interfacePortOperationTuple;
    }

    protected SourceCodeDecoratorRepository getSourceCodeDecoratorRepository() {
        return sourceCodeDecoratorRepository;
    }

    protected BasicComponent getBasicComponent() {
        return basicComponent;
    }

    private Interface getInterfaceFromRequiredRole(final RequiredRole requiredRole) {
        if (requiredRole instanceof final OperationRequiredRole operReqRole) {
            return operReqRole.getRequiredInterface__OperationRequiredRole();
        }
        if (requiredRole instanceof final SourceRole sourceRole) {
            return sourceRole.getEventGroup__SourceRole();
        }
        return null;
    }

    /**
     * Signature query
     *
     * @param invokedMethod The method invocation to find in the SAMM
     * @return Signature corresponding to function access
     */
    private Signature queryInterfaceOperation(final Method invokedMethod) { // GAST2SEFFCHANGE
        for (final MethodLevelSourceCodeLink methodLink : getSourceCodeDecoratorRepository()
                .getMethodLevelSourceCodeLink()) {

            final Member methodSourceCodeDecorator = methodLink.getFunction();
            if (methodSourceCodeDecorator.equals(invokedMethod)) { // GAST2SEFFCHANGE

                logger.trace("accessed operation " + methodLink.getOperation().getEntityName());
                return methodLink.getOperation();
            }
        }

        logger.warn("no accessed operation found for " + invokedMethod.getContainingConcreteClassifier() + "::"
                + invokedMethod.getName()); // GAST2SEFFCHANGE//GAST2SEFFCHANGE
        return null;
    }

}
