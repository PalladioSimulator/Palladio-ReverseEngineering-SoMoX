package org.somox.gast2seff.visitors;

import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.Signature;

import tools.mdsd.jamopp.model.java.members.Method;
import tools.mdsd.jamopp.model.java.statements.Statement;

/**
 * Implementations of the interface are used by {@link JaMoPPStatementVisitor}
 * to find the called interface port and the interface operation of an external
 * call.
 *
 * @author langhamm
 */
public interface InterfaceOfExternalCallFinding {

    /**
     * Query the interface port for the function access.
     *
     * @param calledMethod The access to find in the PCM
     * @param statement    The statement that issued the method call
     * @return interface port and operation corresponding to the access.
     */
    InterfacePortOperationTuple getCalledInterfacePort(final Method calledMethod, Statement statement);

    default InterfacePortOperationTuple getCalledInterfacePort(final Method calledMethod) {
        return getCalledInterfacePort(calledMethod, null);
    }

    public class InterfacePortOperationTuple {
        public Role role;
        public Signature signature;
    }
}
