package org.somox.gast2seff.visitors;

import java.util.BitSet;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.ComposedSwitch;
import org.somox.gast2seff.visitors.FunctionCallClassificationVisitor.FunctionCallType;
import org.somox.kdmhelper.KDMHelper;

import tools.mdsd.jamopp.model.java.commons.Commentable;
import tools.mdsd.jamopp.model.java.containers.CompilationUnit;
import tools.mdsd.jamopp.model.java.members.ClassMethod;
import tools.mdsd.jamopp.model.java.members.Method;
import tools.mdsd.jamopp.model.java.members.util.MembersSwitch;
import tools.mdsd.jamopp.model.java.statements.Assert;
import tools.mdsd.jamopp.model.java.statements.Block;
import tools.mdsd.jamopp.model.java.statements.Condition;
import tools.mdsd.jamopp.model.java.statements.DoWhileLoop;
import tools.mdsd.jamopp.model.java.statements.ExpressionStatement;
import tools.mdsd.jamopp.model.java.statements.ForEachLoop;
import tools.mdsd.jamopp.model.java.statements.ForLoop;
import tools.mdsd.jamopp.model.java.statements.Jump;
import tools.mdsd.jamopp.model.java.statements.LocalVariableStatement;
import tools.mdsd.jamopp.model.java.statements.Statement;
import tools.mdsd.jamopp.model.java.statements.StatementListContainer;
import tools.mdsd.jamopp.model.java.statements.Switch;
import tools.mdsd.jamopp.model.java.statements.SynchronizedBlock;
import tools.mdsd.jamopp.model.java.statements.TryBlock;
import tools.mdsd.jamopp.model.java.statements.WhileLoop;
import tools.mdsd.jamopp.model.java.statements.util.StatementsSwitch;

public abstract class AbstractJaMoPPStatementVisitor extends ComposedSwitch<Object> {
    private static final Logger logger = Logger.getLogger(AbstractJaMoPPStatementVisitor.class);
    /**
     * Map which contains for each statement in the GAST model the type of the
     * statement classified according to {@link FunctionCallType}. Nodes of control
     * flow constructs like loops and branches carry the union of the annotations of
     * their child statements
     */
    protected final Map<Commentable, List<BitSet>> functionClassificationAnnotation;
    /**
     * Classification annotation of the last visited statement. Used to skip
     * generating SEFF actions if they should be omitted because of the SEFFs
     * abstraction rule
     */
    protected BitSet lastType = null;

    /**
     * Can be used to force the shouldSkip method to not skip the next statement,
     * which eventually results in a new SEFF element for the next statement.
     *
     */
    protected boolean doNotSkipNextStatement;

    /** The method call finder */
    protected MethodCallFinder methodCallFinder;

    public AbstractJaMoPPStatementVisitor(final Map<Commentable, List<BitSet>> functionClassificationAnnotations,
            final MethodCallFinder methodCallFinder) {
        doNotSkipNextStatement = false;
        functionClassificationAnnotation = functionClassificationAnnotations;
        this.methodCallFinder = methodCallFinder;

        addSwitch(new MemberVisitor());
        addSwitch(new StatementVisitor());
    }

    // abstract methods that have to be overriden by subclasses of the class
    protected abstract Object handleLoopStatement(final Statement object, final Statement statement);

    protected abstract Object handleCondition(final Condition condition);

    protected abstract Object handleSwitch(final Switch switchStatement);

    protected abstract Object handleClassMethod(ClassMethod classMethod, Statement callStatement);

    protected abstract Object handleTryBlock(final TryBlock object);

    /**
     * Per default we do not handle synchronized blocks. Instead we treat the
     * synchronized statement like any other statement. It is, however, up to
     * subclasses to override this method and handle synchronized blocks.
     */
    protected Object handleSynchronizedBlock(final SynchronizedBlock synchronizedBlock) {
        return null;
    }

    protected abstract void foundInternalAction(Statement object);

    protected abstract void foundExternalCall(Statement object, Method calledMethod, BitSet statementAnnotation);

    /**
     * The method is if an emit event action has been found. As we are currently not
     * able to deal with emit event actions and in order to achieve backwards
     * compatibility, we provide a default implementation that treats the calls as
     * library calls.
     *
     * @param object
     * @param calledMethod
     * @param statementAnnotation
     */
    protected void foundEmitEventAction(final Statement object, final Method calledMethod,
            final BitSet statementAnnotation) {
        foundInternalAction(object);
    }

    /**
     * handleStatementListContainer can be implemented in abstract class, cause it
     * is similar in current implementing classes. If necessary, however, it can be
     * overriden of course.
     *
     * @param object the StatementListContainer (e.g. a Block or ClassMethod)
     * @return A Object to indicate that the Statement has been visited already
     */
    protected Object handleStatementListContainer(final StatementListContainer object) {
        for (final Statement s : object.getStatements()) {
            final Collection<BitSet> thisTypes = functionClassificationAnnotation.get(s);
            if (null == thisTypes) {
                logger.info("thisTypes == null - continue with next statement");
                continue;
            }
            for (final BitSet thisType : thisTypes) {
                // Only generate elements for statements which should not be abstracted away
                // avoid infinite recursion
                if (!shouldSkip(lastType, thisType) && !isVisitedStatement(thisType)) {
                    this.setVisited(thisTypes);
                    this.doSwitch(s);
                }
                lastType = thisType;
            }
        }
        return new Object();
    }

    protected Object handleFormerSimpleStatement(final Statement object) {
        final List<BitSet> statementAnnotations = functionClassificationAnnotation.get(object);
        final List<Method> calledMethods = methodCallFinder.getMethodCalls(object);
        if (0 < calledMethods.size()) {
            for (int i = 0; i < statementAnnotations.size(); i++) {
                final BitSet statementAnnotation = statementAnnotations.get(i);
                if (isExternalCall(statementAnnotation)) {
                    final Method calledMethod = calledMethods.get(i);
                    foundExternalCall(object, calledMethod, statementAnnotation);
                } else if (isEmitEventCall(statementAnnotation)) {
                    final Method calledMethod = calledMethods.get(i);
                    foundEmitEventAction(object, calledMethod, statementAnnotation);
                } else if (isInternalCall(statementAnnotation)) {
                    if (0 == calledMethods.size()) {
                        continue;
                    }
                    Method method = null;
                    if ((i + 1) > calledMethods.size()) {
                        method = calledMethods.get(0);
                    } else {
                        method = calledMethods.get(i);
                    }
                    if (!(method instanceof final ClassMethod classMethod)) {
                        logger.error("Referenceable element must be a class method");
                    } else if (classMethod.getStatements() != null) {
                        handleClassMethod(classMethod, object);
                    } else {
                        final StringBuilder msg = new StringBuilder("Behaviour not set in GAST for ")
                                .append(method.getName());
                        if ((KDMHelper.getJavaNodeSourceRegion(object) != null)
                                && (KDMHelper.getJavaNodeSourceRegion(object).getNamespacesAsString() != null)) {
                            msg.append(". Tried to call from ")
                                    .append(KDMHelper.getJavaNodeSourceRegion(object).getNamespacesAsString())
                                    .append(".");
                        } else {
                            msg.append(". (caller position unknown)");
                        }
                        logger.warn(msg.toString());
                    }
                } else {
                    foundInternalAction(object);
                }
            }
        } else {
            foundInternalAction(object);
        }
        return new Object();

    }

    private void setVisited(final Collection<BitSet> thisTypes) {
        for (final BitSet thisType : thisTypes) {
            this.setVisited(thisType);
        }

    }

    private class MemberVisitor extends MembersSwitch<Object> {
        @Override
        public Object caseStatementListContainer(final StatementListContainer object) {
            return handleStatementListContainer(object);
        }

        @Override
        public Object caseClassMethod(final ClassMethod classMethod) {
            return handleClassMethod(classMethod, null);
        }

    }

    private class StatementVisitor extends StatementsSwitch<Object> {

        @Override
        public Object caseSwitch(final Switch switchStatement) {
            return handleSwitch(switchStatement);
        }

        @Override
        public Object caseCondition(final Condition condition) {
            return handleCondition(condition);
        }

        @Override
        public Object caseBlock(final Block block) {
            return handleStatementListContainer(block);
        }

        @Override
        public Object caseForEachLoop(final ForEachLoop object) {
            return handleLoopStatement(object, object.getStatement());
        }

        @Override
        public Object caseForLoop(final ForLoop object) {//
            return handleLoopStatement(object, object.getStatement());
        }

        @Override
        public Object caseWhileLoop(final WhileLoop object) {
            return handleLoopStatement(object, object.getStatement());
        }

        @Override
        public Object caseDoWhileLoop(final DoWhileLoop object) {
            return handleLoopStatement(object, object.getStatement());
        }

        @Override
        public Object caseTryBlock(final TryBlock object) {
            return handleTryBlock(object);
        }

        @Override
        public Object caseSynchronizedBlock(final SynchronizedBlock synchronizedBlock) {
            return handleSynchronizedBlock(synchronizedBlock);
        }

        @Override
        public Object caseExpressionStatement(final ExpressionStatement object) {
            return handleFormerSimpleStatement(object);
        }

        @Override
        public Object caseLocalVariableStatement(final LocalVariableStatement object) {
            return handleFormerSimpleStatement(object);
        }

        @Override
        public Object caseAssert(final Assert object) {
            return handleFormerSimpleStatement(object);
        }

        @Override
        public Object caseStatement(final Statement statement) {
            return handleFormerSimpleStatement(statement);
        }

        @Override
        public Object caseJump(final Jump jump) {
            // ignore jump statements (break and continue)
            return new Object();
        }

        @Override
        public Object defaultCase(final EObject object) {
            return AbstractJaMoPPStatementVisitor.this.defaultCase(object);
        }
    }

    @Override
    public Object defaultCase(final EObject object) {
        logger.warn("Not handled object by statement visitor:\n  " + object);
        return super.defaultCase(object);
    }

    /**
     * Returns true if the statement or one of its child statements (e.g., for loops
     * or branches) is an external service call
     *
     * @param object The statement to check
     * @return true if the statement or one of its child statements is an external
     *         service call
     */
    protected boolean containsExternalCall(final Statement object) {
        final Collection<BitSet> statementTypes = functionClassificationAnnotation.get(object);
        for (final BitSet statementType : statementTypes) {
            final boolean isExternalCall = statementType
                    .get(FunctionCallClassificationVisitor.getIndex(FunctionCallType.EXTERNAL));
            final boolean isInternalCallContainingExternalCall = statementType.get(FunctionCallClassificationVisitor
                    .getIndex(FunctionCallType.INTERNAL_CALL_CONTAINING_EXTERNAL_CALL));
            final boolean isEmitEventCall = statementType
                    .get(FunctionCallClassificationVisitor.getIndex(FunctionCallType.EMITEVENT));
            if (isExternalCall || isInternalCallContainingExternalCall || isEmitEventCall) {
                return true;
            }
        }
        return false;
    }

    protected boolean isVisitedStatement(final BitSet statementAnnotation) {
        return statementAnnotation.get(FunctionCallClassificationVisitor.getIndex(FunctionCallType.VISITED));
    }

    protected void setVisited(final BitSet thisType) {
        thisType.set(FunctionCallClassificationVisitor.getIndex(FunctionCallType.VISITED), true);

    }

    protected String positionToString(final Commentable position) {
        final StringBuilder positionString = new StringBuilder(" @position: ");
        if (position != null) {
            // if (position != null) { // GAST2SEFFCHANGE//GAST2SEFFCHANGE
            // TODO change name of class; question: is fqnName of Class better than path?
            // positionString.append(KDMHelper.getSourceFile(position).getPath() +
            // KDMHelper.getSourceFile(position).getName());//GAST2SEFFCHANGE
            positionString.append(KDMHelper.computeFullQualifiedName(position)); // GAST2SEFFCHANGE
            // }
            if ((null != position.getLayoutInformations()) && (0 < position.getLayoutInformations().size())
                    && (null != position.getLayoutInformations().get(0))) {
                final int startPos = position.getLayoutInformations().get(0).getStartOffset();
                final int layoutSize = position.getLayoutInformations().size();
                final int endPos = position.getLayoutInformations().get(layoutSize - 1).getStartOffset();
                if (startPos != endPos) {
                    positionString.append(" from ").append(startPos).append(" to ").append(endPos);
                } else {
                    positionString.append(" at ").append(startPos);
                }
            } else {
                positionString.append(" unknown exact possition");
            }

        } else {
            positionString.append("no position information available");
        }
        return positionString.toString();
    }

    protected String positionToLineNumber(final CompilationUnit position) {// GAST2SEFFCHANGE
        final StringBuilder positionString = new StringBuilder("line ");
        if (position != null) {
            positionString.append(position.getLayoutInformations().get(0).getStartOffset());
        } else {
            positionString.append("no position information available");
        }
        return positionString.toString();
    }

    protected boolean isExternalCall(final BitSet statementAnnotation) {
        return statementAnnotation.get(FunctionCallClassificationVisitor.getIndex(FunctionCallType.EXTERNAL));
    }

    protected boolean isEmitEventCall(final BitSet statementAnnotation) {
        return statementAnnotation.get(FunctionCallClassificationVisitor.getIndex(FunctionCallType.EMITEVENT));
    }

    protected boolean isInternalCall(final BitSet statementAnnotation) {
        return statementAnnotation.get(FunctionCallClassificationVisitor.getIndex(FunctionCallType.INTERNAL));
    }

    protected boolean isInternalCallContainingExternalCall(final BitSet statementAnnotation) {
        return statementAnnotation.get(
                FunctionCallClassificationVisitor.getIndex(FunctionCallType.INTERNAL_CALL_CONTAINING_EXTERNAL_CALL));
    }

    protected boolean isLibraryCall(final BitSet statementAnnotation) {
        return statementAnnotation.get(FunctionCallClassificationVisitor.getIndex(FunctionCallType.LIBRARY));
    }

    /**
     * Returns true if the statement with thisType should not generate an action in
     * the newly generated SEFF.
     *
     * @param lastType The type of the preceeding statement
     * @param thisType The type of the statement to test
     * @return true if the current statement should not generate an element in the
     *         SEFF, i.e., it should be abstracted and thrown away
     */
    protected boolean shouldSkip(final BitSet lastType, final BitSet thisType) {
        if (doNotSkipNextStatement) {
            doNotSkipNextStatement = false;
            this.lastType = null;
            return false;
        }
        if ((lastType == null) || isExternalCall(thisType) || isInternalCallContainingExternalCall(thisType)
                || isEmitEventCall(thisType)) {
            return false;
        }

        // Here I know that thisType is internal or library
        // Hence, I can skip this if the last type was not an external call and not an
        // emit event call
        return !isExternalCall(lastType) && !isEmitEventCall(lastType);
    }

}
