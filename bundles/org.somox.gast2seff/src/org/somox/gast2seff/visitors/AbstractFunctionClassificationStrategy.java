package org.somox.gast2seff.visitors;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.somox.gast2seff.visitors.FunctionCallClassificationVisitor.FunctionCallType;

import tools.mdsd.jamopp.model.java.members.Method;
import tools.mdsd.jamopp.model.java.statements.Statement;

/**
 * Base implementation of {@link IFunctionClassificationStrategy}. Delagates the
 * decisions on the function call types to subclasses
 *
 * @author Steffen Becker, Klaus Krogmann
 */
public abstract class AbstractFunctionClassificationStrategy implements IFunctionClassificationStrategy {

    private final Logger logger = Logger.getLogger(BasicFunctionClassificationStrategy.class);
    private final MethodCallFinder methodCallFinder;

    public AbstractFunctionClassificationStrategy(final MethodCallFinder methodCallFinder) {
        this.methodCallFinder = methodCallFinder;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.somox.gast2seff.visitors.IFunctionClassificationStrategy#
     * classifySimpleStatement(de.fzi .gast.statements.SimpleStatement)
     */
    @Override
    public List<BitSet> classifySimpleStatement(final Statement object) {// GAST2SEFFCHANGE
                                                                         // //can/should
        // be replaced with Statement

        final Collection<Method> methods = methodCallFinder.getMethodCalls(object);// GAST2SEFFCHANGE
        final List<BitSet> result = new ArrayList<>(methods.size());

        for (final Method method : methods) {
            final BitSet currentBitSet = new BitSet();
            if (method != null) {
                if (isExternalCall(method)) {
                    logger.debug("Found external call: " + method.getName());// GAST2SEFFCHANGE//GAST2SEFFCHANGE
                    currentBitSet.set(FunctionCallClassificationVisitor.getIndex(FunctionCallType.EXTERNAL));
                } else if (isEmitEventCall(method)) {
                    logger.debug("Found emit event call: " + method.getName());// GAST2SEFFCHANGE//GAST2SEFFCHANGE
                    currentBitSet.set(FunctionCallClassificationVisitor.getIndex(FunctionCallType.EMITEVENT));
                } else if (isLibraryCall(method)) {
                    logger.debug("Found library call: " + method.getName());// GAST2SEFFCHANGE//GAST2SEFFCHANGE
                    currentBitSet.set(FunctionCallClassificationVisitor.getIndex(FunctionCallType.LIBRARY));
                } else { // default: internal call
                    logger.debug("Found internal call: " + method.getName());// GAST2SEFFCHANGE//GAST2SEFFCHANGE
                    currentBitSet.set(FunctionCallClassificationVisitor.getIndex(FunctionCallType.INTERNAL));
                }
            }
            result.add(currentBitSet);
        }
        // ensure that at least one (empty) BitSet is contained in the result list -->
        // enables us to
        // create interalActions if needed
        if (result.isEmpty()) {
            result.add(new BitSet());
        }
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.somox.gast2seff.visitors.IFunctionClassificationStrategy#
     * mergeFunctionCallType(java.util .BitSet, java.util.BitSet)
     */
    @Override
    public void mergeFunctionCallType(final BitSet myType, final Collection<BitSet> functionCallTypes) {
        if ((null == myType) || (null == functionCallTypes)) {
            logger.debug("myType: " + myType + " and/or functionCallTypes: " + functionCallTypes
                    + " is null. mergeFunctionCallType can not be applied");
            return;

        }
        for (final BitSet functionCallType : functionCallTypes) {
            if (functionCallType == null) {
                logger.debug("current functionCallType in " + functionCallTypes
                        + " is null. mergeFunctionCallType can not be applied for the functionCallType.");
                continue;
            }
            myType.or(functionCallType);
        }
    }

    /**
     * Decide whether the given simple statement which is the given function access
     * is an external call, i.e., a call which results in a external call action in
     * the SEFF
     *
     * @param method The function access to test
     * @return true if the function access is an external call
     */
    protected abstract boolean isExternalCall(Method method);

    /**
     * Decide whether the given method, which is called method, is an emit event
     * call, i.e., a call which results in a emit event action in the SEFF For
     * backwards compatibility, we provide an empty implemention here that returns
     * false, i.e., emit event call actions are not created per default.
     *
     * @param method The method to test
     * @return true if the method is an external call
     */
    protected boolean isEmitEventCall(final Method method) {
        return false;
    }

    /**
     * Decide whether the given simple statement which is the given function access
     * is a library call, i.e., a call to an internal method which should be inlined
     * into the SEFF
     *
     * @param method The function access to test
     * @return true if the function access is
     */
    protected abstract boolean isLibraryCall(Method method);

}
