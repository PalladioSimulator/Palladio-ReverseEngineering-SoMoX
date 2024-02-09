package org.somox.gast2seff.visitors;

import org.palladiosimulator.pcm.seff.ResourceDemandingInternalBehaviour;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;

import tools.mdsd.jamopp.model.java.members.ClassMethod;

public interface ResourceDemandingBehaviourForClassMethodFinding {
    ResourceDemandingSEFF getCorrespondingRDSEFForClassMethod(final ClassMethod classMethod);

    ResourceDemandingInternalBehaviour getCorrespondingResourceDemandingInternalBehaviour(
            final ClassMethod classMethod);
}
