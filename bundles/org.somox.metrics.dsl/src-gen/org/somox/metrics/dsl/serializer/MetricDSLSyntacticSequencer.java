package org.somox.metrics.dsl.serializer;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.somox.metrics.dsl.services.MetricDSLGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class MetricDSLSyntacticSequencer extends AbstractSyntacticSequencer {

    protected MetricDSLGrammarAccess grammarAccess;
    protected AbstractElementAlias match_InternalMetric___ParametersKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q;

    @Inject
    protected void init(final IGrammarAccess access) {
        grammarAccess = (MetricDSLGrammarAccess) access;
        match_InternalMetric___ParametersKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q = new GroupAlias(
                false, true,
                new TokenAlias(false, false, grammarAccess.getInternalMetricAccess().getParametersKeyword_8_0()),
                new TokenAlias(false, false, grammarAccess.getInternalMetricAccess().getLeftCurlyBracketKeyword_8_1()),
                new TokenAlias(false, false,
                        grammarAccess.getInternalMetricAccess().getRightCurlyBracketKeyword_8_3()));
    }

    @Override
    protected String getUnassignedRuleCallToken(final EObject semanticObject, final RuleCall ruleCall,
            final INode node) {
        return "";
    }

    @Override
    protected void emitUnassignedTokens(final EObject semanticObject, final ISynTransition transition,
            final INode fromNode, final INode toNode) {
        if (transition.getAmbiguousSyntaxes().isEmpty()) {
            return;
        }
        final List<INode> transitionNodes = collectNodes(fromNode, toNode);
        for (final AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
            final List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
            if (match_InternalMetric___ParametersKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q
                    .equals(syntax)) {
                emit_InternalMetric___ParametersKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(
                        semanticObject, getLastNavigableState(), syntaxNodes);
            } else {
                this.acceptNodes(getLastNavigableState(), syntaxNodes);
            }
        }
    }

    /**
     * Syntax: ('parameters' '{' '}')?
     */
    protected void emit_InternalMetric___ParametersKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(
            final EObject semanticObject, final ISynNavigable transition, final List<INode> nodes) {
        this.acceptNodes(transition, nodes);
    }

}
