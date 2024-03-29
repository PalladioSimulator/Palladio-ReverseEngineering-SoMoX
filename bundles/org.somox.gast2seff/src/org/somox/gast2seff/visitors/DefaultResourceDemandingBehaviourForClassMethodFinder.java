package org.somox.gast2seff.visitors;

import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.ResourceDemandingInternalBehaviour;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.somox.sourcecodedecorator.MethodLevelResourceDemandingInternalBehaviorLink;
import org.somox.sourcecodedecorator.MethodLevelSourceCodeLink;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;

import tools.mdsd.jamopp.model.java.members.ClassMethod;

public class DefaultResourceDemandingBehaviourForClassMethodFinder
        implements ResourceDemandingBehaviourForClassMethodFinding {

    private final SourceCodeDecoratorRepository sourceCodeDecoratorRepository;
    private final BasicComponent basicComponent;

    public DefaultResourceDemandingBehaviourForClassMethodFinder(
            final SourceCodeDecoratorRepository sourceCodeDecoratorRepository, final BasicComponent basicComponent) {
        this.sourceCodeDecoratorRepository = sourceCodeDecoratorRepository;
        this.basicComponent = basicComponent;
    }

    @Override
    public ResourceDemandingInternalBehaviour getCorrespondingResourceDemandingInternalBehaviour(
            final ClassMethod classMethod) {
        for (final MethodLevelResourceDemandingInternalBehaviorLink methodLevelResourceDemandingInternalBehaviorLink : sourceCodeDecoratorRepository
                .getMethodLevelResourceDemandingInternalBehaviorLink()) {
            if ((methodLevelResourceDemandingInternalBehaviorLink.getFunction() == classMethod)
                    && (null != methodLevelResourceDemandingInternalBehaviorLink
                            .getResourceDemandingInternalBehaviour())) {
                return methodLevelResourceDemandingInternalBehaviorLink.getResourceDemandingInternalBehaviour();
            }
        }
        return null;
    }

    @Override
    public ResourceDemandingSEFF getCorrespondingRDSEFForClassMethod(final ClassMethod classMethod) {
        final Signature signature = getCorrespondingSignatureForClassMethod(classMethod);
        if (null == signature) {
            return null;
        }
        return findSEFFInComponentForSignature(basicComponent, signature);
    }

    private ResourceDemandingSEFF findSEFFInComponentForSignature(final BasicComponent basicComponent,
            final Signature signature) {
        for (final ServiceEffectSpecification seff : basicComponent.getServiceEffectSpecifications__BasicComponent()) {
            if (signature == seff.getDescribedService__SEFF()) {
                return (ResourceDemandingSEFF) seff;
            }
        }
        return null;
    }

    private Signature getCorrespondingSignatureForClassMethod(final ClassMethod classMethod) {
        for (final MethodLevelSourceCodeLink methodLevelSourceCodeLink : sourceCodeDecoratorRepository
                .getMethodLevelSourceCodeLink()) {
            if (methodLevelSourceCodeLink.getFunction() == classMethod) {
                final Signature signature = methodLevelSourceCodeLink.getOperation();
                if (null != signature) {
                    return signature;
                }
            }
        }
        return null;
    }

}
