package org.somox.gast2seff.visitors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.ComposedSwitch;
import org.somox.kdmhelper.KDMHelper;

import tools.mdsd.jamopp.model.java.commons.Commentable;
import tools.mdsd.jamopp.model.java.expressions.util.ExpressionsSwitch;
import tools.mdsd.jamopp.model.java.members.Method;
import tools.mdsd.jamopp.model.java.members.util.MembersSwitch;
import tools.mdsd.jamopp.model.java.statements.Assert;
import tools.mdsd.jamopp.model.java.statements.Block;
import tools.mdsd.jamopp.model.java.statements.CatchBlock;
import tools.mdsd.jamopp.model.java.statements.Condition;
import tools.mdsd.jamopp.model.java.statements.DoWhileLoop;
import tools.mdsd.jamopp.model.java.statements.ExpressionStatement;
import tools.mdsd.jamopp.model.java.statements.ForEachLoop;
import tools.mdsd.jamopp.model.java.statements.ForLoop;
import tools.mdsd.jamopp.model.java.statements.LocalVariableStatement;
import tools.mdsd.jamopp.model.java.statements.Statement;
import tools.mdsd.jamopp.model.java.statements.StatementListContainer;
import tools.mdsd.jamopp.model.java.statements.TryBlock;
import tools.mdsd.jamopp.model.java.statements.WhileLoop;
import tools.mdsd.jamopp.model.java.statements.util.StatementsSwitch;

/**
 * Classifies function calls are internal, library, or external calls.
 * Transitively assigns that type to outer statements like loops or branches.
 *
 * @author Steffen Becker, Klaus Krogmann
 *
 */
// TODO: constructor calls
// TODO: Method calls within method calls
// TODO: Method calls in conditions (expressions)
public class FunctionCallClassificationVisitor extends ComposedSwitch<Collection<BitSet>> {// GAST2SEFFCHANGE

    private static final Logger logger = Logger.getLogger(JaMoPPStatementVisitor.class);

    private final MethodCallFinder methodCallFinder;

    public FunctionCallClassificationVisitor(final IFunctionClassificationStrategy strategy,
            final MethodCallFinder methodCallFinder) {
        this.methodCallFinder = methodCallFinder;
        myStrategy = strategy;
        addSwitch(new MembersClassification());
        addSwitch(new StatementClassification());
        addSwitch(new ExpressionClassification());
    }

    public enum FunctionCallType {
        /**
         * Classifies a component external call.
         */
        EXTERNAL,

        /**
         * Classifies a call to a system library.
         */
        LIBRARY,

        /**
         * Classifies an call to a method in the same class.
         */
        INTERNAL,

        /**
         * Indicates whether a statements which has been visited before.
         */
        VISITED,

        /**
         * Classifies a call as an internal call that contains an external call
         */
        INTERNAL_CALL_CONTAINING_EXTERNAL_CALL,
        /**
         * Classifies a call as an call that emits an event, i.e., it is an external
         * call also
         */
        EMITEVENT
    }

    private final HashMap<Commentable, List<BitSet>> annotations = new HashMap<>();
    private IFunctionClassificationStrategy myStrategy = null;

    private class MembersClassification extends MembersSwitch<Collection<BitSet>> {
        @Override
        public Collection<BitSet> caseStatementListContainer(final StatementListContainer object) {
            return handleStatementListContainer(object);
        }

    }

    private class StatementClassification extends StatementsSwitch<Collection<BitSet>> {

        @Override
        public Collection<BitSet> caseStatement(final Statement object) {
            return handleFormerSimpleStatement(object);
        }

        @Override
        public Collection<BitSet> caseBlock(final Block block) {
            return handleStatementListContainer(block);
        }

        @Override
        public Collection<BitSet> caseCondition(final Condition condition) {
            if (annotations.containsKey(condition)) {
                return annotations.get(condition);
            }

            final List<Statement> branchStatements = new ArrayList<>();
            if (null != condition.getCondition()) {
                this.doSwitch(condition.getCondition());
            }

            // statement is the if-part
            if (null != condition.getStatement()) {
                this.doSwitch(condition.getStatement());
                branchStatements.add(condition.getStatement());
            }

            if (null != condition.getElseStatement()) {
                this.doSwitch(condition.getElseStatement());
                branchStatements.add(condition.getElseStatement());
            }
            final List<BitSet> myType = Arrays.asList(computeChildAnnotations(new BitSet(), branchStatements));
            putBitSetInAnnotations(condition, myType);
            return myType;
        }

        @Override
        public Collection<BitSet> caseSwitch(final tools.mdsd.jamopp.model.java.statements.Switch switchStatement) {
            if (annotations.containsKey(switchStatement)) {
                return annotations.get(switchStatement);
            }
            final List<List<Statement>> branches = SwitchStatementHelper
                    .createBlockListFromSwitchStatement(switchStatement);
            for (final List<Statement> branch : branches) {
                // copied from the BlockCase
                computeChildAnnotations(new BitSet(), branch);
            }
            final List<Statement> branchStatements = new ArrayList<>();
            for (final List<Statement> branch : branches) {
                branchStatements.addAll(branch);
            }
            final List<BitSet> myType = Arrays.asList(computeChildAnnotations(new BitSet(), branchStatements));
            putBitSetInAnnotations(switchStatement, myType);

            return myType;
        }

        @Override
        public Collection<BitSet> caseForLoop(final ForLoop object) {
            return createBitSetLoop(object, object.getStatement());
        }

        @Override
        public Collection<BitSet> caseForEachLoop(final ForEachLoop object) {
            return createBitSetLoop(object, object.getStatement());
        }

        @Override
        public Collection<BitSet> caseWhileLoop(final WhileLoop object) {
            return createBitSetLoop(object, object.getStatement());
        }

        @Override
        public Collection<BitSet> caseDoWhileLoop(final DoWhileLoop object) {
            return createBitSetLoop(object, object.getStatement());
        }

        @Override
        public Collection<BitSet> caseTryBlock(final TryBlock object) {
            if (annotations.containsKey(object)) {
                return annotations.get(object);
            }

            // handle try block
            handleStatementListContainer(object);
            final List<Statement> allChildStatements = new ArrayList<>(object.getStatements());
            // handle guarded blocks
            for (final CatchBlock catchBlock : object.getCatcheBlocks()) {
                this.doSwitch(catchBlock);
                allChildStatements.addAll(catchBlock.getStatements());
            }
            // handle finally block
            if (object.getFinallyBlock() != null) {
                this.doSwitch(object.getFinallyBlock());
                allChildStatements.addAll(object.getFinallyBlock().getStatements());
            }
            final List<BitSet> myType = Arrays.asList(computeChildAnnotations(new BitSet(), allChildStatements));
            putBitSetInAnnotations(object, myType);
            return myType;
        }

        @Override
        public Collection<BitSet> caseAssert(final Assert object) {
            return handleFormerSimpleStatement(object);
        }

        @Override
        public Collection<BitSet> caseExpressionStatement(final ExpressionStatement object) {
            return handleFormerSimpleStatement(object);
        }

        @Override
        public Collection<BitSet> caseLocalVariableStatement(final LocalVariableStatement object) {
            return handleFormerSimpleStatement(object);
        }
    }

    // TODO: implement expression switch
    private static class ExpressionClassification extends ExpressionsSwitch<Collection<BitSet>> {

    }

    private Collection<BitSet> handleStatementListContainer(final StatementListContainer object) {
        if (FunctionCallClassificationVisitor.this.annotations.containsKey(object)) {
            return FunctionCallClassificationVisitor.this.annotations.get(object);
        }
        final List<BitSet> myTypes = Arrays.asList(
                FunctionCallClassificationVisitor.this.computeChildAnnotations(new BitSet(), object.getStatements()));
        putBitSetInAnnotations(object, myTypes);
        return myTypes;
    }

    /**
     * Creates a bit set for the a loop statement.
     *
     * @param loop the loop statement
     * @param body the body of the loop
     * @return the created bit set
     */
    private Collection<BitSet> createBitSetLoop(final Statement loop, final Statement body) {
        if (annotations.containsKey(loop)) {
            return annotations.get(loop);
        }

        this.doSwitch(body);

        final List<BitSet> myType = annotations.get(body);
        putBitSetInAnnotations(loop, myType);

        return myType;
    }

    /**
     * Helper Method to handle former SimpleStatement.
     *
     * <br>
     * Used in AssertStatement, ExpressionStatement, VariableDeclarationStatement
     *
     * @param statement the statement for which the bit set is computed
     * @return the computed bit set
     */
    private List<BitSet> handleFormerSimpleStatement(final Statement statement) {
        if (annotations.containsKey(statement)) {
            return annotations.get(statement);
        }

        final List<BitSet> myTypes = myStrategy.classifySimpleStatement(statement);
        putBitSetInAnnotations(statement, myTypes);
        final List<Method> calledMethods = methodCallFinder.getMethodCalls(statement);
        for (int i = 0; i < myTypes.size(); i++) {
            final BitSet myType = myTypes.get(i);
            if (myType.get(getIndex(FunctionCallType.INTERNAL))) {
                // Also annotate the internal method
                final Method calledMethod = calledMethods.get(i);
                final StatementListContainer targetFunctionBody = KDMHelper.getBody(calledMethod);
                Collection<BitSet> internalTypes = new ArrayList<>();
                if (targetFunctionBody != null) {
                    logger.trace("visiting internal call. accessed class: "
                            + calledMethod.getContainingConcreteClassifier());
                    internalTypes = this.doSwitch(targetFunctionBody);
                } else {
                    logger.warn("Behaviour not set in GAST for " + calledMethod.getName());
                }
                for (final BitSet internalType : internalTypes) {
                    // the internal call contains an external call
                    if (internalType.get(getIndex(FunctionCallType.EXTERNAL))
                            || internalType.get(getIndex(FunctionCallType.EMITEVENT))) {
                        myType.set(getIndex(FunctionCallType.INTERNAL_CALL_CONTAINING_EXTERNAL_CALL));
                    }
                }
            }
        }
        return myTypes;
    }

    private void putBitSetInAnnotations(final Commentable object, final List<BitSet> type) {
        annotations.put(object, type);
    }

    private BitSet computeChildAnnotations(final BitSet initalValue, final List<Statement> childStatements) {
        // 1. visit all sub statements
        for (final Statement s : childStatements) {
            if (null != s) {
                this.doSwitch(s);
            }
        }

        // 2. compute own type iteratively
        final BitSet myType = initalValue;
        for (final Statement s : childStatements) {
            if (null != s) {
                myStrategy.mergeFunctionCallType(myType, annotations.get(s));
            }
        }

        return myType;
    }

    public static int getIndex(final FunctionCallType type) {
        return switch (type) {
        case INTERNAL -> 0;
        case EXTERNAL -> 1;
        case LIBRARY -> 2;
        case VISITED -> 3;
        case INTERNAL_CALL_CONTAINING_EXTERNAL_CALL -> 4;
        case EMITEVENT -> 5;
        default -> throw new UnsupportedOperationException();
        };

    }

    public Map<Commentable, List<BitSet>> getAnnotations() {
        return Collections.unmodifiableMap(annotations);
    }

    @Override
    public Collection<BitSet> defaultCase(final EObject object) {
        logger.warn("Not handled object by function call visitor:\n  " + object);
        return super.defaultCase(object);
    }
}
