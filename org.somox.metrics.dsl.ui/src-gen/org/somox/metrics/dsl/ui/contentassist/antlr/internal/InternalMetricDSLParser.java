package org.somox.metrics.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.somox.metrics.dsl.services.MetricDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMetricDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Metrics'", "'{'", "'}'", "'import'", "';'", "'extern'", "'Metric'", "'('", "','", "')'", "'};'", "'parameters'", "'Parameter'", "'Const'", "'='", "'WeigthedSum'", "'Stepwise'", "'['", "']'", "'Ratio'", "'/'", "'<'", "'>'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_DOUBLE=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalMetricDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMetricDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMetricDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g"; }


     
     	private MetricDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MetricDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleMetricModel"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:60:1: entryRuleMetricModel : ruleMetricModel EOF ;
    public final void entryRuleMetricModel() throws RecognitionException {
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:61:1: ( ruleMetricModel EOF )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:62:1: ruleMetricModel EOF
            {
             before(grammarAccess.getMetricModelRule()); 
            pushFollow(FOLLOW_ruleMetricModel_in_entryRuleMetricModel61);
            ruleMetricModel();

            state._fsp--;

             after(grammarAccess.getMetricModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetricModel"


    // $ANTLR start "ruleMetricModel"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:69:1: ruleMetricModel : ( ( rule__MetricModel__Group__0 ) ) ;
    public final void ruleMetricModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:73:2: ( ( ( rule__MetricModel__Group__0 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:74:1: ( ( rule__MetricModel__Group__0 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:74:1: ( ( rule__MetricModel__Group__0 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:75:1: ( rule__MetricModel__Group__0 )
            {
             before(grammarAccess.getMetricModelAccess().getGroup()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:76:1: ( rule__MetricModel__Group__0 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:76:2: rule__MetricModel__Group__0
            {
            pushFollow(FOLLOW_rule__MetricModel__Group__0_in_ruleMetricModel94);
            rule__MetricModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetricModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetricModel"


    // $ANTLR start "entryRuleExternalMetric"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:90:1: entryRuleExternalMetric : ruleExternalMetric EOF ;
    public final void entryRuleExternalMetric() throws RecognitionException {
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:91:1: ( ruleExternalMetric EOF )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:92:1: ruleExternalMetric EOF
            {
             before(grammarAccess.getExternalMetricRule()); 
            pushFollow(FOLLOW_ruleExternalMetric_in_entryRuleExternalMetric123);
            ruleExternalMetric();

            state._fsp--;

             after(grammarAccess.getExternalMetricRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalMetric130); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalMetric"


    // $ANTLR start "ruleExternalMetric"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:99:1: ruleExternalMetric : ( ( rule__ExternalMetric__NameAssignment ) ) ;
    public final void ruleExternalMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:103:2: ( ( ( rule__ExternalMetric__NameAssignment ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:104:1: ( ( rule__ExternalMetric__NameAssignment ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:104:1: ( ( rule__ExternalMetric__NameAssignment ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:105:1: ( rule__ExternalMetric__NameAssignment )
            {
             before(grammarAccess.getExternalMetricAccess().getNameAssignment()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:106:1: ( rule__ExternalMetric__NameAssignment )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:106:2: rule__ExternalMetric__NameAssignment
            {
            pushFollow(FOLLOW_rule__ExternalMetric__NameAssignment_in_ruleExternalMetric156);
            rule__ExternalMetric__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExternalMetricAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalMetric"


    // $ANTLR start "entryRuleInternalMetric"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:118:1: entryRuleInternalMetric : ruleInternalMetric EOF ;
    public final void entryRuleInternalMetric() throws RecognitionException {
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:119:1: ( ruleInternalMetric EOF )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:120:1: ruleInternalMetric EOF
            {
             before(grammarAccess.getInternalMetricRule()); 
            pushFollow(FOLLOW_ruleInternalMetric_in_entryRuleInternalMetric183);
            ruleInternalMetric();

            state._fsp--;

             after(grammarAccess.getInternalMetricRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalMetric190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInternalMetric"


    // $ANTLR start "ruleInternalMetric"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:127:1: ruleInternalMetric : ( ( rule__InternalMetric__Group__0 ) ) ;
    public final void ruleInternalMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:131:2: ( ( ( rule__InternalMetric__Group__0 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:132:1: ( ( rule__InternalMetric__Group__0 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:132:1: ( ( rule__InternalMetric__Group__0 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:133:1: ( rule__InternalMetric__Group__0 )
            {
             before(grammarAccess.getInternalMetricAccess().getGroup()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:134:1: ( rule__InternalMetric__Group__0 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:134:2: rule__InternalMetric__Group__0
            {
            pushFollow(FOLLOW_rule__InternalMetric__Group__0_in_ruleInternalMetric216);
            rule__InternalMetric__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternalMetricAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInternalMetric"


    // $ANTLR start "entryRuleNumber"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:146:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:147:1: ( ruleNumber EOF )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:148:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber243);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber250); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:155:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:159:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:160:1: ( ( rule__Number__Alternatives ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:160:1: ( ( rule__Number__Alternatives ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:161:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:162:1: ( rule__Number__Alternatives )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:162:2: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_in_ruleNumber276);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleParameter"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:174:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:175:1: ( ruleParameter EOF )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:176:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter303);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter310); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:183:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:187:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:188:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:188:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:189:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:190:1: ( rule__Parameter__Group__0 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:190:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter336);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleConstant"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:202:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:203:1: ( ruleConstant EOF )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:204:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant363);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:211:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:215:2: ( ( ( rule__Constant__Group__0 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:216:1: ( ( rule__Constant__Group__0 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:216:1: ( ( rule__Constant__Group__0 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:217:1: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:218:1: ( rule__Constant__Group__0 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:218:2: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_rule__Constant__Group__0_in_ruleConstant396);
            rule__Constant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleMetricDefinition"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:230:1: entryRuleMetricDefinition : ruleMetricDefinition EOF ;
    public final void entryRuleMetricDefinition() throws RecognitionException {
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:231:1: ( ruleMetricDefinition EOF )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:232:1: ruleMetricDefinition EOF
            {
             before(grammarAccess.getMetricDefinitionRule()); 
            pushFollow(FOLLOW_ruleMetricDefinition_in_entryRuleMetricDefinition423);
            ruleMetricDefinition();

            state._fsp--;

             after(grammarAccess.getMetricDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricDefinition430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetricDefinition"


    // $ANTLR start "ruleMetricDefinition"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:239:1: ruleMetricDefinition : ( ( rule__MetricDefinition__Alternatives ) ) ;
    public final void ruleMetricDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:243:2: ( ( ( rule__MetricDefinition__Alternatives ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:244:1: ( ( rule__MetricDefinition__Alternatives ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:244:1: ( ( rule__MetricDefinition__Alternatives ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:245:1: ( rule__MetricDefinition__Alternatives )
            {
             before(grammarAccess.getMetricDefinitionAccess().getAlternatives()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:246:1: ( rule__MetricDefinition__Alternatives )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:246:2: rule__MetricDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__MetricDefinition__Alternatives_in_ruleMetricDefinition456);
            rule__MetricDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMetricDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetricDefinition"


    // $ANTLR start "entryRuleWeightedMetric"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:258:1: entryRuleWeightedMetric : ruleWeightedMetric EOF ;
    public final void entryRuleWeightedMetric() throws RecognitionException {
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:259:1: ( ruleWeightedMetric EOF )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:260:1: ruleWeightedMetric EOF
            {
             before(grammarAccess.getWeightedMetricRule()); 
            pushFollow(FOLLOW_ruleWeightedMetric_in_entryRuleWeightedMetric483);
            ruleWeightedMetric();

            state._fsp--;

             after(grammarAccess.getWeightedMetricRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeightedMetric490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWeightedMetric"


    // $ANTLR start "ruleWeightedMetric"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:267:1: ruleWeightedMetric : ( ( rule__WeightedMetric__Group__0 ) ) ;
    public final void ruleWeightedMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:271:2: ( ( ( rule__WeightedMetric__Group__0 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:272:1: ( ( rule__WeightedMetric__Group__0 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:272:1: ( ( rule__WeightedMetric__Group__0 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:273:1: ( rule__WeightedMetric__Group__0 )
            {
             before(grammarAccess.getWeightedMetricAccess().getGroup()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:274:1: ( rule__WeightedMetric__Group__0 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:274:2: rule__WeightedMetric__Group__0
            {
            pushFollow(FOLLOW_rule__WeightedMetric__Group__0_in_ruleWeightedMetric516);
            rule__WeightedMetric__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWeightedMetricAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWeightedMetric"


    // $ANTLR start "entryRuleStepwiseMetric"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:286:1: entryRuleStepwiseMetric : ruleStepwiseMetric EOF ;
    public final void entryRuleStepwiseMetric() throws RecognitionException {
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:287:1: ( ruleStepwiseMetric EOF )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:288:1: ruleStepwiseMetric EOF
            {
             before(grammarAccess.getStepwiseMetricRule()); 
            pushFollow(FOLLOW_ruleStepwiseMetric_in_entryRuleStepwiseMetric543);
            ruleStepwiseMetric();

            state._fsp--;

             after(grammarAccess.getStepwiseMetricRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepwiseMetric550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStepwiseMetric"


    // $ANTLR start "ruleStepwiseMetric"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:295:1: ruleStepwiseMetric : ( ( rule__StepwiseMetric__Group__0 ) ) ;
    public final void ruleStepwiseMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:299:2: ( ( ( rule__StepwiseMetric__Group__0 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:300:1: ( ( rule__StepwiseMetric__Group__0 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:300:1: ( ( rule__StepwiseMetric__Group__0 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:301:1: ( rule__StepwiseMetric__Group__0 )
            {
             before(grammarAccess.getStepwiseMetricAccess().getGroup()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:302:1: ( rule__StepwiseMetric__Group__0 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:302:2: rule__StepwiseMetric__Group__0
            {
            pushFollow(FOLLOW_rule__StepwiseMetric__Group__0_in_ruleStepwiseMetric576);
            rule__StepwiseMetric__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepwiseMetricAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStepwiseMetric"


    // $ANTLR start "entryRuleRatioMetric"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:314:1: entryRuleRatioMetric : ruleRatioMetric EOF ;
    public final void entryRuleRatioMetric() throws RecognitionException {
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:315:1: ( ruleRatioMetric EOF )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:316:1: ruleRatioMetric EOF
            {
             before(grammarAccess.getRatioMetricRule()); 
            pushFollow(FOLLOW_ruleRatioMetric_in_entryRuleRatioMetric603);
            ruleRatioMetric();

            state._fsp--;

             after(grammarAccess.getRatioMetricRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRatioMetric610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRatioMetric"


    // $ANTLR start "ruleRatioMetric"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:323:1: ruleRatioMetric : ( ( rule__RatioMetric__Group__0 ) ) ;
    public final void ruleRatioMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:327:2: ( ( ( rule__RatioMetric__Group__0 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:328:1: ( ( rule__RatioMetric__Group__0 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:328:1: ( ( rule__RatioMetric__Group__0 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:329:1: ( rule__RatioMetric__Group__0 )
            {
             before(grammarAccess.getRatioMetricAccess().getGroup()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:330:1: ( rule__RatioMetric__Group__0 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:330:2: rule__RatioMetric__Group__0
            {
            pushFollow(FOLLOW_rule__RatioMetric__Group__0_in_ruleRatioMetric636);
            rule__RatioMetric__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRatioMetricAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRatioMetric"


    // $ANTLR start "entryRuleBoundAndWeight"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:342:1: entryRuleBoundAndWeight : ruleBoundAndWeight EOF ;
    public final void entryRuleBoundAndWeight() throws RecognitionException {
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:343:1: ( ruleBoundAndWeight EOF )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:344:1: ruleBoundAndWeight EOF
            {
             before(grammarAccess.getBoundAndWeightRule()); 
            pushFollow(FOLLOW_ruleBoundAndWeight_in_entryRuleBoundAndWeight663);
            ruleBoundAndWeight();

            state._fsp--;

             after(grammarAccess.getBoundAndWeightRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoundAndWeight670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoundAndWeight"


    // $ANTLR start "ruleBoundAndWeight"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:351:1: ruleBoundAndWeight : ( ( rule__BoundAndWeight__Group__0 ) ) ;
    public final void ruleBoundAndWeight() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:355:2: ( ( ( rule__BoundAndWeight__Group__0 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:356:1: ( ( rule__BoundAndWeight__Group__0 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:356:1: ( ( rule__BoundAndWeight__Group__0 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:357:1: ( rule__BoundAndWeight__Group__0 )
            {
             before(grammarAccess.getBoundAndWeightAccess().getGroup()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:358:1: ( rule__BoundAndWeight__Group__0 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:358:2: rule__BoundAndWeight__Group__0
            {
            pushFollow(FOLLOW_rule__BoundAndWeight__Group__0_in_ruleBoundAndWeight696);
            rule__BoundAndWeight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoundAndWeightAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoundAndWeight"


    // $ANTLR start "entryRuleMetricAndWeight"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:370:1: entryRuleMetricAndWeight : ruleMetricAndWeight EOF ;
    public final void entryRuleMetricAndWeight() throws RecognitionException {
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:371:1: ( ruleMetricAndWeight EOF )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:372:1: ruleMetricAndWeight EOF
            {
             before(grammarAccess.getMetricAndWeightRule()); 
            pushFollow(FOLLOW_ruleMetricAndWeight_in_entryRuleMetricAndWeight723);
            ruleMetricAndWeight();

            state._fsp--;

             after(grammarAccess.getMetricAndWeightRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricAndWeight730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetricAndWeight"


    // $ANTLR start "ruleMetricAndWeight"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:379:1: ruleMetricAndWeight : ( ( rule__MetricAndWeight__Group__0 ) ) ;
    public final void ruleMetricAndWeight() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:383:2: ( ( ( rule__MetricAndWeight__Group__0 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:384:1: ( ( rule__MetricAndWeight__Group__0 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:384:1: ( ( rule__MetricAndWeight__Group__0 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:385:1: ( rule__MetricAndWeight__Group__0 )
            {
             before(grammarAccess.getMetricAndWeightAccess().getGroup()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:386:1: ( rule__MetricAndWeight__Group__0 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:386:2: rule__MetricAndWeight__Group__0
            {
            pushFollow(FOLLOW_rule__MetricAndWeight__Group__0_in_ruleMetricAndWeight756);
            rule__MetricAndWeight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetricAndWeightAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetricAndWeight"


    // $ANTLR start "entryRuleMYID"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:398:1: entryRuleMYID : ruleMYID EOF ;
    public final void entryRuleMYID() throws RecognitionException {
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:399:1: ( ruleMYID EOF )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:400:1: ruleMYID EOF
            {
             before(grammarAccess.getMYIDRule()); 
            pushFollow(FOLLOW_ruleMYID_in_entryRuleMYID783);
            ruleMYID();

            state._fsp--;

             after(grammarAccess.getMYIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMYID790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMYID"


    // $ANTLR start "ruleMYID"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:407:1: ruleMYID : ( ( rule__MYID__Group__0 ) ) ;
    public final void ruleMYID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:411:2: ( ( ( rule__MYID__Group__0 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:412:1: ( ( rule__MYID__Group__0 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:412:1: ( ( rule__MYID__Group__0 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:413:1: ( rule__MYID__Group__0 )
            {
             before(grammarAccess.getMYIDAccess().getGroup()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:414:1: ( rule__MYID__Group__0 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:414:2: rule__MYID__Group__0
            {
            pushFollow(FOLLOW_rule__MYID__Group__0_in_ruleMYID816);
            rule__MYID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMYIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMYID"


    // $ANTLR start "rule__Number__Alternatives"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:427:1: rule__Number__Alternatives : ( ( ruleParameter ) | ( ruleConstant ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:431:1: ( ( ruleParameter ) | ( ruleConstant ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            else if ( (LA1_0==25) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:432:1: ( ruleParameter )
                    {
                    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:432:1: ( ruleParameter )
                    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:433:1: ruleParameter
                    {
                     before(grammarAccess.getNumberAccess().getParameterParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleParameter_in_rule__Number__Alternatives853);
                    ruleParameter();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getParameterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:438:6: ( ruleConstant )
                    {
                    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:438:6: ( ruleConstant )
                    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:439:1: ruleConstant
                    {
                     before(grammarAccess.getNumberAccess().getConstantParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleConstant_in_rule__Number__Alternatives870);
                    ruleConstant();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getConstantParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__MetricDefinition__Alternatives"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:449:1: rule__MetricDefinition__Alternatives : ( ( ruleWeightedMetric ) | ( ruleStepwiseMetric ) | ( ruleRatioMetric ) );
    public final void rule__MetricDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:453:1: ( ( ruleWeightedMetric ) | ( ruleStepwiseMetric ) | ( ruleRatioMetric ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:454:1: ( ruleWeightedMetric )
                    {
                    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:454:1: ( ruleWeightedMetric )
                    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:455:1: ruleWeightedMetric
                    {
                     before(grammarAccess.getMetricDefinitionAccess().getWeightedMetricParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWeightedMetric_in_rule__MetricDefinition__Alternatives902);
                    ruleWeightedMetric();

                    state._fsp--;

                     after(grammarAccess.getMetricDefinitionAccess().getWeightedMetricParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:460:6: ( ruleStepwiseMetric )
                    {
                    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:460:6: ( ruleStepwiseMetric )
                    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:461:1: ruleStepwiseMetric
                    {
                     before(grammarAccess.getMetricDefinitionAccess().getStepwiseMetricParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStepwiseMetric_in_rule__MetricDefinition__Alternatives919);
                    ruleStepwiseMetric();

                    state._fsp--;

                     after(grammarAccess.getMetricDefinitionAccess().getStepwiseMetricParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:466:6: ( ruleRatioMetric )
                    {
                    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:466:6: ( ruleRatioMetric )
                    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:467:1: ruleRatioMetric
                    {
                     before(grammarAccess.getMetricDefinitionAccess().getRatioMetricParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRatioMetric_in_rule__MetricDefinition__Alternatives936);
                    ruleRatioMetric();

                    state._fsp--;

                     after(grammarAccess.getMetricDefinitionAccess().getRatioMetricParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricDefinition__Alternatives"


    // $ANTLR start "rule__MetricModel__Group__0"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:479:1: rule__MetricModel__Group__0 : rule__MetricModel__Group__0__Impl rule__MetricModel__Group__1 ;
    public final void rule__MetricModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:483:1: ( rule__MetricModel__Group__0__Impl rule__MetricModel__Group__1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:484:2: rule__MetricModel__Group__0__Impl rule__MetricModel__Group__1
            {
            pushFollow(FOLLOW_rule__MetricModel__Group__0__Impl_in_rule__MetricModel__Group__0966);
            rule__MetricModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricModel__Group__1_in_rule__MetricModel__Group__0969);
            rule__MetricModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group__0"


    // $ANTLR start "rule__MetricModel__Group__0__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:491:1: rule__MetricModel__Group__0__Impl : ( ( rule__MetricModel__Group_0__0 )* ) ;
    public final void rule__MetricModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:495:1: ( ( ( rule__MetricModel__Group_0__0 )* ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:496:1: ( ( rule__MetricModel__Group_0__0 )* )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:496:1: ( ( rule__MetricModel__Group_0__0 )* )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:497:1: ( rule__MetricModel__Group_0__0 )*
            {
             before(grammarAccess.getMetricModelAccess().getGroup_0()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:498:1: ( rule__MetricModel__Group_0__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:498:2: rule__MetricModel__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__MetricModel__Group_0__0_in_rule__MetricModel__Group__0__Impl996);
            	    rule__MetricModel__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMetricModelAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group__0__Impl"


    // $ANTLR start "rule__MetricModel__Group__1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:508:1: rule__MetricModel__Group__1 : rule__MetricModel__Group__1__Impl rule__MetricModel__Group__2 ;
    public final void rule__MetricModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:512:1: ( rule__MetricModel__Group__1__Impl rule__MetricModel__Group__2 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:513:2: rule__MetricModel__Group__1__Impl rule__MetricModel__Group__2
            {
            pushFollow(FOLLOW_rule__MetricModel__Group__1__Impl_in_rule__MetricModel__Group__11027);
            rule__MetricModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricModel__Group__2_in_rule__MetricModel__Group__11030);
            rule__MetricModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group__1"


    // $ANTLR start "rule__MetricModel__Group__1__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:520:1: rule__MetricModel__Group__1__Impl : ( ( rule__MetricModel__Group_1__0 )* ) ;
    public final void rule__MetricModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:524:1: ( ( ( rule__MetricModel__Group_1__0 )* ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:525:1: ( ( rule__MetricModel__Group_1__0 )* )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:525:1: ( ( rule__MetricModel__Group_1__0 )* )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:526:1: ( rule__MetricModel__Group_1__0 )*
            {
             before(grammarAccess.getMetricModelAccess().getGroup_1()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:527:1: ( rule__MetricModel__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:527:2: rule__MetricModel__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MetricModel__Group_1__0_in_rule__MetricModel__Group__1__Impl1057);
            	    rule__MetricModel__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMetricModelAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group__1__Impl"


    // $ANTLR start "rule__MetricModel__Group__2"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:537:1: rule__MetricModel__Group__2 : rule__MetricModel__Group__2__Impl rule__MetricModel__Group__3 ;
    public final void rule__MetricModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:541:1: ( rule__MetricModel__Group__2__Impl rule__MetricModel__Group__3 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:542:2: rule__MetricModel__Group__2__Impl rule__MetricModel__Group__3
            {
            pushFollow(FOLLOW_rule__MetricModel__Group__2__Impl_in_rule__MetricModel__Group__21088);
            rule__MetricModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricModel__Group__3_in_rule__MetricModel__Group__21091);
            rule__MetricModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group__2"


    // $ANTLR start "rule__MetricModel__Group__2__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:549:1: rule__MetricModel__Group__2__Impl : ( 'Metrics' ) ;
    public final void rule__MetricModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:553:1: ( ( 'Metrics' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:554:1: ( 'Metrics' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:554:1: ( 'Metrics' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:555:1: 'Metrics'
            {
             before(grammarAccess.getMetricModelAccess().getMetricsKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__MetricModel__Group__2__Impl1119); 
             after(grammarAccess.getMetricModelAccess().getMetricsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group__2__Impl"


    // $ANTLR start "rule__MetricModel__Group__3"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:568:1: rule__MetricModel__Group__3 : rule__MetricModel__Group__3__Impl rule__MetricModel__Group__4 ;
    public final void rule__MetricModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:572:1: ( rule__MetricModel__Group__3__Impl rule__MetricModel__Group__4 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:573:2: rule__MetricModel__Group__3__Impl rule__MetricModel__Group__4
            {
            pushFollow(FOLLOW_rule__MetricModel__Group__3__Impl_in_rule__MetricModel__Group__31150);
            rule__MetricModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricModel__Group__4_in_rule__MetricModel__Group__31153);
            rule__MetricModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group__3"


    // $ANTLR start "rule__MetricModel__Group__3__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:580:1: rule__MetricModel__Group__3__Impl : ( '{' ) ;
    public final void rule__MetricModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:584:1: ( ( '{' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:585:1: ( '{' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:585:1: ( '{' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:586:1: '{'
            {
             before(grammarAccess.getMetricModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__MetricModel__Group__3__Impl1181); 
             after(grammarAccess.getMetricModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group__3__Impl"


    // $ANTLR start "rule__MetricModel__Group__4"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:599:1: rule__MetricModel__Group__4 : rule__MetricModel__Group__4__Impl rule__MetricModel__Group__5 ;
    public final void rule__MetricModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:603:1: ( rule__MetricModel__Group__4__Impl rule__MetricModel__Group__5 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:604:2: rule__MetricModel__Group__4__Impl rule__MetricModel__Group__5
            {
            pushFollow(FOLLOW_rule__MetricModel__Group__4__Impl_in_rule__MetricModel__Group__41212);
            rule__MetricModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricModel__Group__5_in_rule__MetricModel__Group__41215);
            rule__MetricModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group__4"


    // $ANTLR start "rule__MetricModel__Group__4__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:611:1: rule__MetricModel__Group__4__Impl : ( ( ( rule__MetricModel__MetricsAssignment_4 ) ) ( ( rule__MetricModel__MetricsAssignment_4 )* ) ) ;
    public final void rule__MetricModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:615:1: ( ( ( ( rule__MetricModel__MetricsAssignment_4 ) ) ( ( rule__MetricModel__MetricsAssignment_4 )* ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:616:1: ( ( ( rule__MetricModel__MetricsAssignment_4 ) ) ( ( rule__MetricModel__MetricsAssignment_4 )* ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:616:1: ( ( ( rule__MetricModel__MetricsAssignment_4 ) ) ( ( rule__MetricModel__MetricsAssignment_4 )* ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:617:1: ( ( rule__MetricModel__MetricsAssignment_4 ) ) ( ( rule__MetricModel__MetricsAssignment_4 )* )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:617:1: ( ( rule__MetricModel__MetricsAssignment_4 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:618:1: ( rule__MetricModel__MetricsAssignment_4 )
            {
             before(grammarAccess.getMetricModelAccess().getMetricsAssignment_4()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:619:1: ( rule__MetricModel__MetricsAssignment_4 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:619:2: rule__MetricModel__MetricsAssignment_4
            {
            pushFollow(FOLLOW_rule__MetricModel__MetricsAssignment_4_in_rule__MetricModel__Group__4__Impl1244);
            rule__MetricModel__MetricsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMetricModelAccess().getMetricsAssignment_4()); 

            }

            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:622:1: ( ( rule__MetricModel__MetricsAssignment_4 )* )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:623:1: ( rule__MetricModel__MetricsAssignment_4 )*
            {
             before(grammarAccess.getMetricModelAccess().getMetricsAssignment_4()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:624:1: ( rule__MetricModel__MetricsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:624:2: rule__MetricModel__MetricsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__MetricModel__MetricsAssignment_4_in_rule__MetricModel__Group__4__Impl1256);
            	    rule__MetricModel__MetricsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMetricModelAccess().getMetricsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group__4__Impl"


    // $ANTLR start "rule__MetricModel__Group__5"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:635:1: rule__MetricModel__Group__5 : rule__MetricModel__Group__5__Impl ;
    public final void rule__MetricModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:639:1: ( rule__MetricModel__Group__5__Impl )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:640:2: rule__MetricModel__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__MetricModel__Group__5__Impl_in_rule__MetricModel__Group__51289);
            rule__MetricModel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group__5"


    // $ANTLR start "rule__MetricModel__Group__5__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:646:1: rule__MetricModel__Group__5__Impl : ( '}' ) ;
    public final void rule__MetricModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:650:1: ( ( '}' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:651:1: ( '}' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:651:1: ( '}' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:652:1: '}'
            {
             before(grammarAccess.getMetricModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__MetricModel__Group__5__Impl1317); 
             after(grammarAccess.getMetricModelAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group__5__Impl"


    // $ANTLR start "rule__MetricModel__Group_0__0"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:677:1: rule__MetricModel__Group_0__0 : rule__MetricModel__Group_0__0__Impl rule__MetricModel__Group_0__1 ;
    public final void rule__MetricModel__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:681:1: ( rule__MetricModel__Group_0__0__Impl rule__MetricModel__Group_0__1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:682:2: rule__MetricModel__Group_0__0__Impl rule__MetricModel__Group_0__1
            {
            pushFollow(FOLLOW_rule__MetricModel__Group_0__0__Impl_in_rule__MetricModel__Group_0__01360);
            rule__MetricModel__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricModel__Group_0__1_in_rule__MetricModel__Group_0__01363);
            rule__MetricModel__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group_0__0"


    // $ANTLR start "rule__MetricModel__Group_0__0__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:689:1: rule__MetricModel__Group_0__0__Impl : ( 'import' ) ;
    public final void rule__MetricModel__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:693:1: ( ( 'import' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:694:1: ( 'import' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:694:1: ( 'import' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:695:1: 'import'
            {
             before(grammarAccess.getMetricModelAccess().getImportKeyword_0_0()); 
            match(input,15,FOLLOW_15_in_rule__MetricModel__Group_0__0__Impl1391); 
             after(grammarAccess.getMetricModelAccess().getImportKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group_0__0__Impl"


    // $ANTLR start "rule__MetricModel__Group_0__1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:708:1: rule__MetricModel__Group_0__1 : rule__MetricModel__Group_0__1__Impl rule__MetricModel__Group_0__2 ;
    public final void rule__MetricModel__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:712:1: ( rule__MetricModel__Group_0__1__Impl rule__MetricModel__Group_0__2 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:713:2: rule__MetricModel__Group_0__1__Impl rule__MetricModel__Group_0__2
            {
            pushFollow(FOLLOW_rule__MetricModel__Group_0__1__Impl_in_rule__MetricModel__Group_0__11422);
            rule__MetricModel__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricModel__Group_0__2_in_rule__MetricModel__Group_0__11425);
            rule__MetricModel__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group_0__1"


    // $ANTLR start "rule__MetricModel__Group_0__1__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:720:1: rule__MetricModel__Group_0__1__Impl : ( ( rule__MetricModel__ImportURIAssignment_0_1 ) ) ;
    public final void rule__MetricModel__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:724:1: ( ( ( rule__MetricModel__ImportURIAssignment_0_1 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:725:1: ( ( rule__MetricModel__ImportURIAssignment_0_1 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:725:1: ( ( rule__MetricModel__ImportURIAssignment_0_1 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:726:1: ( rule__MetricModel__ImportURIAssignment_0_1 )
            {
             before(grammarAccess.getMetricModelAccess().getImportURIAssignment_0_1()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:727:1: ( rule__MetricModel__ImportURIAssignment_0_1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:727:2: rule__MetricModel__ImportURIAssignment_0_1
            {
            pushFollow(FOLLOW_rule__MetricModel__ImportURIAssignment_0_1_in_rule__MetricModel__Group_0__1__Impl1452);
            rule__MetricModel__ImportURIAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMetricModelAccess().getImportURIAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group_0__1__Impl"


    // $ANTLR start "rule__MetricModel__Group_0__2"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:737:1: rule__MetricModel__Group_0__2 : rule__MetricModel__Group_0__2__Impl ;
    public final void rule__MetricModel__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:741:1: ( rule__MetricModel__Group_0__2__Impl )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:742:2: rule__MetricModel__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__MetricModel__Group_0__2__Impl_in_rule__MetricModel__Group_0__21482);
            rule__MetricModel__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group_0__2"


    // $ANTLR start "rule__MetricModel__Group_0__2__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:748:1: rule__MetricModel__Group_0__2__Impl : ( ';' ) ;
    public final void rule__MetricModel__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:752:1: ( ( ';' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:753:1: ( ';' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:753:1: ( ';' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:754:1: ';'
            {
             before(grammarAccess.getMetricModelAccess().getSemicolonKeyword_0_2()); 
            match(input,16,FOLLOW_16_in_rule__MetricModel__Group_0__2__Impl1510); 
             after(grammarAccess.getMetricModelAccess().getSemicolonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group_0__2__Impl"


    // $ANTLR start "rule__MetricModel__Group_1__0"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:773:1: rule__MetricModel__Group_1__0 : rule__MetricModel__Group_1__0__Impl rule__MetricModel__Group_1__1 ;
    public final void rule__MetricModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:777:1: ( rule__MetricModel__Group_1__0__Impl rule__MetricModel__Group_1__1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:778:2: rule__MetricModel__Group_1__0__Impl rule__MetricModel__Group_1__1
            {
            pushFollow(FOLLOW_rule__MetricModel__Group_1__0__Impl_in_rule__MetricModel__Group_1__01547);
            rule__MetricModel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricModel__Group_1__1_in_rule__MetricModel__Group_1__01550);
            rule__MetricModel__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group_1__0"


    // $ANTLR start "rule__MetricModel__Group_1__0__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:785:1: rule__MetricModel__Group_1__0__Impl : ( 'extern' ) ;
    public final void rule__MetricModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:789:1: ( ( 'extern' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:790:1: ( 'extern' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:790:1: ( 'extern' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:791:1: 'extern'
            {
             before(grammarAccess.getMetricModelAccess().getExternKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__MetricModel__Group_1__0__Impl1578); 
             after(grammarAccess.getMetricModelAccess().getExternKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group_1__0__Impl"


    // $ANTLR start "rule__MetricModel__Group_1__1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:804:1: rule__MetricModel__Group_1__1 : rule__MetricModel__Group_1__1__Impl rule__MetricModel__Group_1__2 ;
    public final void rule__MetricModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:808:1: ( rule__MetricModel__Group_1__1__Impl rule__MetricModel__Group_1__2 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:809:2: rule__MetricModel__Group_1__1__Impl rule__MetricModel__Group_1__2
            {
            pushFollow(FOLLOW_rule__MetricModel__Group_1__1__Impl_in_rule__MetricModel__Group_1__11609);
            rule__MetricModel__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricModel__Group_1__2_in_rule__MetricModel__Group_1__11612);
            rule__MetricModel__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group_1__1"


    // $ANTLR start "rule__MetricModel__Group_1__1__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:816:1: rule__MetricModel__Group_1__1__Impl : ( ( rule__MetricModel__MetricsAssignment_1_1 ) ) ;
    public final void rule__MetricModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:820:1: ( ( ( rule__MetricModel__MetricsAssignment_1_1 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:821:1: ( ( rule__MetricModel__MetricsAssignment_1_1 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:821:1: ( ( rule__MetricModel__MetricsAssignment_1_1 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:822:1: ( rule__MetricModel__MetricsAssignment_1_1 )
            {
             before(grammarAccess.getMetricModelAccess().getMetricsAssignment_1_1()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:823:1: ( rule__MetricModel__MetricsAssignment_1_1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:823:2: rule__MetricModel__MetricsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MetricModel__MetricsAssignment_1_1_in_rule__MetricModel__Group_1__1__Impl1639);
            rule__MetricModel__MetricsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMetricModelAccess().getMetricsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group_1__1__Impl"


    // $ANTLR start "rule__MetricModel__Group_1__2"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:833:1: rule__MetricModel__Group_1__2 : rule__MetricModel__Group_1__2__Impl ;
    public final void rule__MetricModel__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:837:1: ( rule__MetricModel__Group_1__2__Impl )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:838:2: rule__MetricModel__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MetricModel__Group_1__2__Impl_in_rule__MetricModel__Group_1__21669);
            rule__MetricModel__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group_1__2"


    // $ANTLR start "rule__MetricModel__Group_1__2__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:844:1: rule__MetricModel__Group_1__2__Impl : ( ';' ) ;
    public final void rule__MetricModel__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:848:1: ( ( ';' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:849:1: ( ';' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:849:1: ( ';' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:850:1: ';'
            {
             before(grammarAccess.getMetricModelAccess().getSemicolonKeyword_1_2()); 
            match(input,16,FOLLOW_16_in_rule__MetricModel__Group_1__2__Impl1697); 
             after(grammarAccess.getMetricModelAccess().getSemicolonKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__Group_1__2__Impl"


    // $ANTLR start "rule__InternalMetric__Group__0"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:869:1: rule__InternalMetric__Group__0 : rule__InternalMetric__Group__0__Impl rule__InternalMetric__Group__1 ;
    public final void rule__InternalMetric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:873:1: ( rule__InternalMetric__Group__0__Impl rule__InternalMetric__Group__1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:874:2: rule__InternalMetric__Group__0__Impl rule__InternalMetric__Group__1
            {
            pushFollow(FOLLOW_rule__InternalMetric__Group__0__Impl_in_rule__InternalMetric__Group__01734);
            rule__InternalMetric__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalMetric__Group__1_in_rule__InternalMetric__Group__01737);
            rule__InternalMetric__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__0"


    // $ANTLR start "rule__InternalMetric__Group__0__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:881:1: rule__InternalMetric__Group__0__Impl : ( 'Metric' ) ;
    public final void rule__InternalMetric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:885:1: ( ( 'Metric' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:886:1: ( 'Metric' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:886:1: ( 'Metric' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:887:1: 'Metric'
            {
             before(grammarAccess.getInternalMetricAccess().getMetricKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__InternalMetric__Group__0__Impl1765); 
             after(grammarAccess.getInternalMetricAccess().getMetricKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__0__Impl"


    // $ANTLR start "rule__InternalMetric__Group__1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:900:1: rule__InternalMetric__Group__1 : rule__InternalMetric__Group__1__Impl rule__InternalMetric__Group__2 ;
    public final void rule__InternalMetric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:904:1: ( rule__InternalMetric__Group__1__Impl rule__InternalMetric__Group__2 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:905:2: rule__InternalMetric__Group__1__Impl rule__InternalMetric__Group__2
            {
            pushFollow(FOLLOW_rule__InternalMetric__Group__1__Impl_in_rule__InternalMetric__Group__11796);
            rule__InternalMetric__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalMetric__Group__2_in_rule__InternalMetric__Group__11799);
            rule__InternalMetric__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__1"


    // $ANTLR start "rule__InternalMetric__Group__1__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:912:1: rule__InternalMetric__Group__1__Impl : ( ( rule__InternalMetric__NameAssignment_1 ) ) ;
    public final void rule__InternalMetric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:916:1: ( ( ( rule__InternalMetric__NameAssignment_1 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:917:1: ( ( rule__InternalMetric__NameAssignment_1 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:917:1: ( ( rule__InternalMetric__NameAssignment_1 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:918:1: ( rule__InternalMetric__NameAssignment_1 )
            {
             before(grammarAccess.getInternalMetricAccess().getNameAssignment_1()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:919:1: ( rule__InternalMetric__NameAssignment_1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:919:2: rule__InternalMetric__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__InternalMetric__NameAssignment_1_in_rule__InternalMetric__Group__1__Impl1826);
            rule__InternalMetric__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInternalMetricAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__1__Impl"


    // $ANTLR start "rule__InternalMetric__Group__2"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:929:1: rule__InternalMetric__Group__2 : rule__InternalMetric__Group__2__Impl rule__InternalMetric__Group__3 ;
    public final void rule__InternalMetric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:933:1: ( rule__InternalMetric__Group__2__Impl rule__InternalMetric__Group__3 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:934:2: rule__InternalMetric__Group__2__Impl rule__InternalMetric__Group__3
            {
            pushFollow(FOLLOW_rule__InternalMetric__Group__2__Impl_in_rule__InternalMetric__Group__21856);
            rule__InternalMetric__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalMetric__Group__3_in_rule__InternalMetric__Group__21859);
            rule__InternalMetric__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__2"


    // $ANTLR start "rule__InternalMetric__Group__2__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:941:1: rule__InternalMetric__Group__2__Impl : ( '(' ) ;
    public final void rule__InternalMetric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:945:1: ( ( '(' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:946:1: ( '(' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:946:1: ( '(' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:947:1: '('
            {
             before(grammarAccess.getInternalMetricAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__InternalMetric__Group__2__Impl1887); 
             after(grammarAccess.getInternalMetricAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__2__Impl"


    // $ANTLR start "rule__InternalMetric__Group__3"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:960:1: rule__InternalMetric__Group__3 : rule__InternalMetric__Group__3__Impl rule__InternalMetric__Group__4 ;
    public final void rule__InternalMetric__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:964:1: ( rule__InternalMetric__Group__3__Impl rule__InternalMetric__Group__4 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:965:2: rule__InternalMetric__Group__3__Impl rule__InternalMetric__Group__4
            {
            pushFollow(FOLLOW_rule__InternalMetric__Group__3__Impl_in_rule__InternalMetric__Group__31918);
            rule__InternalMetric__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalMetric__Group__4_in_rule__InternalMetric__Group__31921);
            rule__InternalMetric__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__3"


    // $ANTLR start "rule__InternalMetric__Group__3__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:972:1: rule__InternalMetric__Group__3__Impl : ( ( rule__InternalMetric__ShortNameAssignment_3 ) ) ;
    public final void rule__InternalMetric__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:976:1: ( ( ( rule__InternalMetric__ShortNameAssignment_3 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:977:1: ( ( rule__InternalMetric__ShortNameAssignment_3 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:977:1: ( ( rule__InternalMetric__ShortNameAssignment_3 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:978:1: ( rule__InternalMetric__ShortNameAssignment_3 )
            {
             before(grammarAccess.getInternalMetricAccess().getShortNameAssignment_3()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:979:1: ( rule__InternalMetric__ShortNameAssignment_3 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:979:2: rule__InternalMetric__ShortNameAssignment_3
            {
            pushFollow(FOLLOW_rule__InternalMetric__ShortNameAssignment_3_in_rule__InternalMetric__Group__3__Impl1948);
            rule__InternalMetric__ShortNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInternalMetricAccess().getShortNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__3__Impl"


    // $ANTLR start "rule__InternalMetric__Group__4"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:989:1: rule__InternalMetric__Group__4 : rule__InternalMetric__Group__4__Impl rule__InternalMetric__Group__5 ;
    public final void rule__InternalMetric__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:993:1: ( rule__InternalMetric__Group__4__Impl rule__InternalMetric__Group__5 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:994:2: rule__InternalMetric__Group__4__Impl rule__InternalMetric__Group__5
            {
            pushFollow(FOLLOW_rule__InternalMetric__Group__4__Impl_in_rule__InternalMetric__Group__41978);
            rule__InternalMetric__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalMetric__Group__5_in_rule__InternalMetric__Group__41981);
            rule__InternalMetric__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__4"


    // $ANTLR start "rule__InternalMetric__Group__4__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1001:1: rule__InternalMetric__Group__4__Impl : ( ',' ) ;
    public final void rule__InternalMetric__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1005:1: ( ( ',' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1006:1: ( ',' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1006:1: ( ',' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1007:1: ','
            {
             before(grammarAccess.getInternalMetricAccess().getCommaKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__InternalMetric__Group__4__Impl2009); 
             after(grammarAccess.getInternalMetricAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__4__Impl"


    // $ANTLR start "rule__InternalMetric__Group__5"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1020:1: rule__InternalMetric__Group__5 : rule__InternalMetric__Group__5__Impl rule__InternalMetric__Group__6 ;
    public final void rule__InternalMetric__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1024:1: ( rule__InternalMetric__Group__5__Impl rule__InternalMetric__Group__6 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1025:2: rule__InternalMetric__Group__5__Impl rule__InternalMetric__Group__6
            {
            pushFollow(FOLLOW_rule__InternalMetric__Group__5__Impl_in_rule__InternalMetric__Group__52040);
            rule__InternalMetric__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalMetric__Group__6_in_rule__InternalMetric__Group__52043);
            rule__InternalMetric__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__5"


    // $ANTLR start "rule__InternalMetric__Group__5__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1032:1: rule__InternalMetric__Group__5__Impl : ( ( rule__InternalMetric__DescriptionAssignment_5 ) ) ;
    public final void rule__InternalMetric__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1036:1: ( ( ( rule__InternalMetric__DescriptionAssignment_5 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1037:1: ( ( rule__InternalMetric__DescriptionAssignment_5 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1037:1: ( ( rule__InternalMetric__DescriptionAssignment_5 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1038:1: ( rule__InternalMetric__DescriptionAssignment_5 )
            {
             before(grammarAccess.getInternalMetricAccess().getDescriptionAssignment_5()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1039:1: ( rule__InternalMetric__DescriptionAssignment_5 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1039:2: rule__InternalMetric__DescriptionAssignment_5
            {
            pushFollow(FOLLOW_rule__InternalMetric__DescriptionAssignment_5_in_rule__InternalMetric__Group__5__Impl2070);
            rule__InternalMetric__DescriptionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInternalMetricAccess().getDescriptionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__5__Impl"


    // $ANTLR start "rule__InternalMetric__Group__6"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1049:1: rule__InternalMetric__Group__6 : rule__InternalMetric__Group__6__Impl rule__InternalMetric__Group__7 ;
    public final void rule__InternalMetric__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1053:1: ( rule__InternalMetric__Group__6__Impl rule__InternalMetric__Group__7 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1054:2: rule__InternalMetric__Group__6__Impl rule__InternalMetric__Group__7
            {
            pushFollow(FOLLOW_rule__InternalMetric__Group__6__Impl_in_rule__InternalMetric__Group__62100);
            rule__InternalMetric__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalMetric__Group__7_in_rule__InternalMetric__Group__62103);
            rule__InternalMetric__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__6"


    // $ANTLR start "rule__InternalMetric__Group__6__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1061:1: rule__InternalMetric__Group__6__Impl : ( ')' ) ;
    public final void rule__InternalMetric__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1065:1: ( ( ')' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1066:1: ( ')' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1066:1: ( ')' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1067:1: ')'
            {
             before(grammarAccess.getInternalMetricAccess().getRightParenthesisKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__InternalMetric__Group__6__Impl2131); 
             after(grammarAccess.getInternalMetricAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__6__Impl"


    // $ANTLR start "rule__InternalMetric__Group__7"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1080:1: rule__InternalMetric__Group__7 : rule__InternalMetric__Group__7__Impl rule__InternalMetric__Group__8 ;
    public final void rule__InternalMetric__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1084:1: ( rule__InternalMetric__Group__7__Impl rule__InternalMetric__Group__8 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1085:2: rule__InternalMetric__Group__7__Impl rule__InternalMetric__Group__8
            {
            pushFollow(FOLLOW_rule__InternalMetric__Group__7__Impl_in_rule__InternalMetric__Group__72162);
            rule__InternalMetric__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalMetric__Group__8_in_rule__InternalMetric__Group__72165);
            rule__InternalMetric__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__7"


    // $ANTLR start "rule__InternalMetric__Group__7__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1092:1: rule__InternalMetric__Group__7__Impl : ( '{' ) ;
    public final void rule__InternalMetric__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1096:1: ( ( '{' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1097:1: ( '{' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1097:1: ( '{' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1098:1: '{'
            {
             before(grammarAccess.getInternalMetricAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__InternalMetric__Group__7__Impl2193); 
             after(grammarAccess.getInternalMetricAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__7__Impl"


    // $ANTLR start "rule__InternalMetric__Group__8"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1111:1: rule__InternalMetric__Group__8 : rule__InternalMetric__Group__8__Impl rule__InternalMetric__Group__9 ;
    public final void rule__InternalMetric__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1115:1: ( rule__InternalMetric__Group__8__Impl rule__InternalMetric__Group__9 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1116:2: rule__InternalMetric__Group__8__Impl rule__InternalMetric__Group__9
            {
            pushFollow(FOLLOW_rule__InternalMetric__Group__8__Impl_in_rule__InternalMetric__Group__82224);
            rule__InternalMetric__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalMetric__Group__9_in_rule__InternalMetric__Group__82227);
            rule__InternalMetric__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__8"


    // $ANTLR start "rule__InternalMetric__Group__8__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1123:1: rule__InternalMetric__Group__8__Impl : ( ( rule__InternalMetric__Group_8__0 )? ) ;
    public final void rule__InternalMetric__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1127:1: ( ( ( rule__InternalMetric__Group_8__0 )? ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1128:1: ( ( rule__InternalMetric__Group_8__0 )? )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1128:1: ( ( rule__InternalMetric__Group_8__0 )? )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1129:1: ( rule__InternalMetric__Group_8__0 )?
            {
             before(grammarAccess.getInternalMetricAccess().getGroup_8()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1130:1: ( rule__InternalMetric__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1130:2: rule__InternalMetric__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__InternalMetric__Group_8__0_in_rule__InternalMetric__Group__8__Impl2254);
                    rule__InternalMetric__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInternalMetricAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__8__Impl"


    // $ANTLR start "rule__InternalMetric__Group__9"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1140:1: rule__InternalMetric__Group__9 : rule__InternalMetric__Group__9__Impl rule__InternalMetric__Group__10 ;
    public final void rule__InternalMetric__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1144:1: ( rule__InternalMetric__Group__9__Impl rule__InternalMetric__Group__10 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1145:2: rule__InternalMetric__Group__9__Impl rule__InternalMetric__Group__10
            {
            pushFollow(FOLLOW_rule__InternalMetric__Group__9__Impl_in_rule__InternalMetric__Group__92285);
            rule__InternalMetric__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalMetric__Group__10_in_rule__InternalMetric__Group__92288);
            rule__InternalMetric__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__9"


    // $ANTLR start "rule__InternalMetric__Group__9__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1152:1: rule__InternalMetric__Group__9__Impl : ( ( rule__InternalMetric__DefinitionAssignment_9 ) ) ;
    public final void rule__InternalMetric__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1156:1: ( ( ( rule__InternalMetric__DefinitionAssignment_9 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1157:1: ( ( rule__InternalMetric__DefinitionAssignment_9 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1157:1: ( ( rule__InternalMetric__DefinitionAssignment_9 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1158:1: ( rule__InternalMetric__DefinitionAssignment_9 )
            {
             before(grammarAccess.getInternalMetricAccess().getDefinitionAssignment_9()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1159:1: ( rule__InternalMetric__DefinitionAssignment_9 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1159:2: rule__InternalMetric__DefinitionAssignment_9
            {
            pushFollow(FOLLOW_rule__InternalMetric__DefinitionAssignment_9_in_rule__InternalMetric__Group__9__Impl2315);
            rule__InternalMetric__DefinitionAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getInternalMetricAccess().getDefinitionAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__9__Impl"


    // $ANTLR start "rule__InternalMetric__Group__10"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1169:1: rule__InternalMetric__Group__10 : rule__InternalMetric__Group__10__Impl ;
    public final void rule__InternalMetric__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1173:1: ( rule__InternalMetric__Group__10__Impl )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1174:2: rule__InternalMetric__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__InternalMetric__Group__10__Impl_in_rule__InternalMetric__Group__102345);
            rule__InternalMetric__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__10"


    // $ANTLR start "rule__InternalMetric__Group__10__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1180:1: rule__InternalMetric__Group__10__Impl : ( '};' ) ;
    public final void rule__InternalMetric__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1184:1: ( ( '};' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1185:1: ( '};' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1185:1: ( '};' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1186:1: '};'
            {
             before(grammarAccess.getInternalMetricAccess().getRightCurlyBracketSemicolonKeyword_10()); 
            match(input,22,FOLLOW_22_in_rule__InternalMetric__Group__10__Impl2373); 
             after(grammarAccess.getInternalMetricAccess().getRightCurlyBracketSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group__10__Impl"


    // $ANTLR start "rule__InternalMetric__Group_8__0"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1221:1: rule__InternalMetric__Group_8__0 : rule__InternalMetric__Group_8__0__Impl rule__InternalMetric__Group_8__1 ;
    public final void rule__InternalMetric__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1225:1: ( rule__InternalMetric__Group_8__0__Impl rule__InternalMetric__Group_8__1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1226:2: rule__InternalMetric__Group_8__0__Impl rule__InternalMetric__Group_8__1
            {
            pushFollow(FOLLOW_rule__InternalMetric__Group_8__0__Impl_in_rule__InternalMetric__Group_8__02426);
            rule__InternalMetric__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalMetric__Group_8__1_in_rule__InternalMetric__Group_8__02429);
            rule__InternalMetric__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group_8__0"


    // $ANTLR start "rule__InternalMetric__Group_8__0__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1233:1: rule__InternalMetric__Group_8__0__Impl : ( 'parameters' ) ;
    public final void rule__InternalMetric__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1237:1: ( ( 'parameters' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1238:1: ( 'parameters' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1238:1: ( 'parameters' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1239:1: 'parameters'
            {
             before(grammarAccess.getInternalMetricAccess().getParametersKeyword_8_0()); 
            match(input,23,FOLLOW_23_in_rule__InternalMetric__Group_8__0__Impl2457); 
             after(grammarAccess.getInternalMetricAccess().getParametersKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group_8__0__Impl"


    // $ANTLR start "rule__InternalMetric__Group_8__1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1252:1: rule__InternalMetric__Group_8__1 : rule__InternalMetric__Group_8__1__Impl rule__InternalMetric__Group_8__2 ;
    public final void rule__InternalMetric__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1256:1: ( rule__InternalMetric__Group_8__1__Impl rule__InternalMetric__Group_8__2 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1257:2: rule__InternalMetric__Group_8__1__Impl rule__InternalMetric__Group_8__2
            {
            pushFollow(FOLLOW_rule__InternalMetric__Group_8__1__Impl_in_rule__InternalMetric__Group_8__12488);
            rule__InternalMetric__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalMetric__Group_8__2_in_rule__InternalMetric__Group_8__12491);
            rule__InternalMetric__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group_8__1"


    // $ANTLR start "rule__InternalMetric__Group_8__1__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1264:1: rule__InternalMetric__Group_8__1__Impl : ( '{' ) ;
    public final void rule__InternalMetric__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1268:1: ( ( '{' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1269:1: ( '{' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1269:1: ( '{' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1270:1: '{'
            {
             before(grammarAccess.getInternalMetricAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,13,FOLLOW_13_in_rule__InternalMetric__Group_8__1__Impl2519); 
             after(grammarAccess.getInternalMetricAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group_8__1__Impl"


    // $ANTLR start "rule__InternalMetric__Group_8__2"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1283:1: rule__InternalMetric__Group_8__2 : rule__InternalMetric__Group_8__2__Impl rule__InternalMetric__Group_8__3 ;
    public final void rule__InternalMetric__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1287:1: ( rule__InternalMetric__Group_8__2__Impl rule__InternalMetric__Group_8__3 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1288:2: rule__InternalMetric__Group_8__2__Impl rule__InternalMetric__Group_8__3
            {
            pushFollow(FOLLOW_rule__InternalMetric__Group_8__2__Impl_in_rule__InternalMetric__Group_8__22550);
            rule__InternalMetric__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalMetric__Group_8__3_in_rule__InternalMetric__Group_8__22553);
            rule__InternalMetric__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group_8__2"


    // $ANTLR start "rule__InternalMetric__Group_8__2__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1295:1: rule__InternalMetric__Group_8__2__Impl : ( ( rule__InternalMetric__ParameterAssignment_8_2 )* ) ;
    public final void rule__InternalMetric__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1299:1: ( ( ( rule__InternalMetric__ParameterAssignment_8_2 )* ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1300:1: ( ( rule__InternalMetric__ParameterAssignment_8_2 )* )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1300:1: ( ( rule__InternalMetric__ParameterAssignment_8_2 )* )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1301:1: ( rule__InternalMetric__ParameterAssignment_8_2 )*
            {
             before(grammarAccess.getInternalMetricAccess().getParameterAssignment_8_2()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1302:1: ( rule__InternalMetric__ParameterAssignment_8_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=24 && LA7_0<=25)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1302:2: rule__InternalMetric__ParameterAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__InternalMetric__ParameterAssignment_8_2_in_rule__InternalMetric__Group_8__2__Impl2580);
            	    rule__InternalMetric__ParameterAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getInternalMetricAccess().getParameterAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group_8__2__Impl"


    // $ANTLR start "rule__InternalMetric__Group_8__3"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1312:1: rule__InternalMetric__Group_8__3 : rule__InternalMetric__Group_8__3__Impl ;
    public final void rule__InternalMetric__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1316:1: ( rule__InternalMetric__Group_8__3__Impl )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1317:2: rule__InternalMetric__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__InternalMetric__Group_8__3__Impl_in_rule__InternalMetric__Group_8__32611);
            rule__InternalMetric__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group_8__3"


    // $ANTLR start "rule__InternalMetric__Group_8__3__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1323:1: rule__InternalMetric__Group_8__3__Impl : ( '}' ) ;
    public final void rule__InternalMetric__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1327:1: ( ( '}' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1328:1: ( '}' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1328:1: ( '}' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1329:1: '}'
            {
             before(grammarAccess.getInternalMetricAccess().getRightCurlyBracketKeyword_8_3()); 
            match(input,14,FOLLOW_14_in_rule__InternalMetric__Group_8__3__Impl2639); 
             after(grammarAccess.getInternalMetricAccess().getRightCurlyBracketKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__Group_8__3__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1350:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1354:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1355:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02678);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02681);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1362:1: rule__Parameter__Group__0__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1366:1: ( ( 'Parameter' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1367:1: ( 'Parameter' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1367:1: ( 'Parameter' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1368:1: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Parameter__Group__0__Impl2709); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1381:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1385:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1386:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12740);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__12743);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1393:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1397:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1398:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1398:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1399:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1400:1: ( rule__Parameter__NameAssignment_1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1400:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl2770);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1410:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1414:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1415:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22800);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__22803);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1422:1: rule__Parameter__Group__2__Impl : ( '(' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1426:1: ( ( '(' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1427:1: ( '(' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1427:1: ( '(' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1428:1: '('
            {
             before(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Parameter__Group__2__Impl2831); 
             after(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1441:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1445:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1446:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__32862);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__4_in_rule__Parameter__Group__32865);
            rule__Parameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1453:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__ShortnameAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1457:1: ( ( ( rule__Parameter__ShortnameAssignment_3 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1458:1: ( ( rule__Parameter__ShortnameAssignment_3 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1458:1: ( ( rule__Parameter__ShortnameAssignment_3 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1459:1: ( rule__Parameter__ShortnameAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getShortnameAssignment_3()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1460:1: ( rule__Parameter__ShortnameAssignment_3 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1460:2: rule__Parameter__ShortnameAssignment_3
            {
            pushFollow(FOLLOW_rule__Parameter__ShortnameAssignment_3_in_rule__Parameter__Group__3__Impl2892);
            rule__Parameter__ShortnameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getShortnameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1470:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1474:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1475:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_rule__Parameter__Group__4__Impl_in_rule__Parameter__Group__42922);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__5_in_rule__Parameter__Group__42925);
            rule__Parameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1482:1: rule__Parameter__Group__4__Impl : ( ',' ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1486:1: ( ( ',' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1487:1: ( ',' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1487:1: ( ',' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1488:1: ','
            {
             before(grammarAccess.getParameterAccess().getCommaKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Parameter__Group__4__Impl2953); 
             after(grammarAccess.getParameterAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1501:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl rule__Parameter__Group__6 ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1505:1: ( rule__Parameter__Group__5__Impl rule__Parameter__Group__6 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1506:2: rule__Parameter__Group__5__Impl rule__Parameter__Group__6
            {
            pushFollow(FOLLOW_rule__Parameter__Group__5__Impl_in_rule__Parameter__Group__52984);
            rule__Parameter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__6_in_rule__Parameter__Group__52987);
            rule__Parameter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1513:1: rule__Parameter__Group__5__Impl : ( ( rule__Parameter__DescriptionAssignment_5 ) ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1517:1: ( ( ( rule__Parameter__DescriptionAssignment_5 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1518:1: ( ( rule__Parameter__DescriptionAssignment_5 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1518:1: ( ( rule__Parameter__DescriptionAssignment_5 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1519:1: ( rule__Parameter__DescriptionAssignment_5 )
            {
             before(grammarAccess.getParameterAccess().getDescriptionAssignment_5()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1520:1: ( rule__Parameter__DescriptionAssignment_5 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1520:2: rule__Parameter__DescriptionAssignment_5
            {
            pushFollow(FOLLOW_rule__Parameter__DescriptionAssignment_5_in_rule__Parameter__Group__5__Impl3014);
            rule__Parameter__DescriptionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getDescriptionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__Parameter__Group__6"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1530:1: rule__Parameter__Group__6 : rule__Parameter__Group__6__Impl rule__Parameter__Group__7 ;
    public final void rule__Parameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1534:1: ( rule__Parameter__Group__6__Impl rule__Parameter__Group__7 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1535:2: rule__Parameter__Group__6__Impl rule__Parameter__Group__7
            {
            pushFollow(FOLLOW_rule__Parameter__Group__6__Impl_in_rule__Parameter__Group__63044);
            rule__Parameter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__7_in_rule__Parameter__Group__63047);
            rule__Parameter__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__6"


    // $ANTLR start "rule__Parameter__Group__6__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1542:1: rule__Parameter__Group__6__Impl : ( ',' ) ;
    public final void rule__Parameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1546:1: ( ( ',' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1547:1: ( ',' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1547:1: ( ',' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1548:1: ','
            {
             before(grammarAccess.getParameterAccess().getCommaKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__Parameter__Group__6__Impl3075); 
             after(grammarAccess.getParameterAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__6__Impl"


    // $ANTLR start "rule__Parameter__Group__7"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1561:1: rule__Parameter__Group__7 : rule__Parameter__Group__7__Impl rule__Parameter__Group__8 ;
    public final void rule__Parameter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1565:1: ( rule__Parameter__Group__7__Impl rule__Parameter__Group__8 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1566:2: rule__Parameter__Group__7__Impl rule__Parameter__Group__8
            {
            pushFollow(FOLLOW_rule__Parameter__Group__7__Impl_in_rule__Parameter__Group__73106);
            rule__Parameter__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__8_in_rule__Parameter__Group__73109);
            rule__Parameter__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__7"


    // $ANTLR start "rule__Parameter__Group__7__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1573:1: rule__Parameter__Group__7__Impl : ( ( rule__Parameter__DefaultValueAssignment_7 ) ) ;
    public final void rule__Parameter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1577:1: ( ( ( rule__Parameter__DefaultValueAssignment_7 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1578:1: ( ( rule__Parameter__DefaultValueAssignment_7 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1578:1: ( ( rule__Parameter__DefaultValueAssignment_7 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1579:1: ( rule__Parameter__DefaultValueAssignment_7 )
            {
             before(grammarAccess.getParameterAccess().getDefaultValueAssignment_7()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1580:1: ( rule__Parameter__DefaultValueAssignment_7 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1580:2: rule__Parameter__DefaultValueAssignment_7
            {
            pushFollow(FOLLOW_rule__Parameter__DefaultValueAssignment_7_in_rule__Parameter__Group__7__Impl3136);
            rule__Parameter__DefaultValueAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getDefaultValueAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__7__Impl"


    // $ANTLR start "rule__Parameter__Group__8"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1590:1: rule__Parameter__Group__8 : rule__Parameter__Group__8__Impl rule__Parameter__Group__9 ;
    public final void rule__Parameter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1594:1: ( rule__Parameter__Group__8__Impl rule__Parameter__Group__9 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1595:2: rule__Parameter__Group__8__Impl rule__Parameter__Group__9
            {
            pushFollow(FOLLOW_rule__Parameter__Group__8__Impl_in_rule__Parameter__Group__83166);
            rule__Parameter__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__9_in_rule__Parameter__Group__83169);
            rule__Parameter__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__8"


    // $ANTLR start "rule__Parameter__Group__8__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1602:1: rule__Parameter__Group__8__Impl : ( ')' ) ;
    public final void rule__Parameter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1606:1: ( ( ')' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1607:1: ( ')' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1607:1: ( ')' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1608:1: ')'
            {
             before(grammarAccess.getParameterAccess().getRightParenthesisKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__Parameter__Group__8__Impl3197); 
             after(grammarAccess.getParameterAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__8__Impl"


    // $ANTLR start "rule__Parameter__Group__9"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1621:1: rule__Parameter__Group__9 : rule__Parameter__Group__9__Impl ;
    public final void rule__Parameter__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1625:1: ( rule__Parameter__Group__9__Impl )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1626:2: rule__Parameter__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__9__Impl_in_rule__Parameter__Group__93228);
            rule__Parameter__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__9"


    // $ANTLR start "rule__Parameter__Group__9__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1632:1: rule__Parameter__Group__9__Impl : ( ';' ) ;
    public final void rule__Parameter__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1636:1: ( ( ';' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1637:1: ( ';' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1637:1: ( ';' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1638:1: ';'
            {
             before(grammarAccess.getParameterAccess().getSemicolonKeyword_9()); 
            match(input,16,FOLLOW_16_in_rule__Parameter__Group__9__Impl3256); 
             after(grammarAccess.getParameterAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__9__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1671:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1675:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1676:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__03307);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__03310);
            rule__Constant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1683:1: rule__Constant__Group__0__Impl : ( 'Const' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1687:1: ( ( 'Const' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1688:1: ( 'Const' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1688:1: ( 'Const' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1689:1: 'Const'
            {
             before(grammarAccess.getConstantAccess().getConstKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Constant__Group__0__Impl3338); 
             after(grammarAccess.getConstantAccess().getConstKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1702:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1706:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1707:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__13369);
            rule__Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__13372);
            rule__Constant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1714:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__NameAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1718:1: ( ( ( rule__Constant__NameAssignment_1 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1719:1: ( ( rule__Constant__NameAssignment_1 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1719:1: ( ( rule__Constant__NameAssignment_1 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1720:1: ( rule__Constant__NameAssignment_1 )
            {
             before(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1721:1: ( rule__Constant__NameAssignment_1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1721:2: rule__Constant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl3399);
            rule__Constant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__2"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1731:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1735:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1736:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__23429);
            rule__Constant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__23432);
            rule__Constant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2"


    // $ANTLR start "rule__Constant__Group__2__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1743:1: rule__Constant__Group__2__Impl : ( '=' ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1747:1: ( ( '=' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1748:1: ( '=' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1748:1: ( '=' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1749:1: '='
            {
             before(grammarAccess.getConstantAccess().getEqualsSignKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Constant__Group__2__Impl3460); 
             after(grammarAccess.getConstantAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group__3"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1762:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1766:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1767:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__33491);
            rule__Constant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__33494);
            rule__Constant__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3"


    // $ANTLR start "rule__Constant__Group__3__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1774:1: rule__Constant__Group__3__Impl : ( ( rule__Constant__ValueAssignment_3 ) ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1778:1: ( ( ( rule__Constant__ValueAssignment_3 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1779:1: ( ( rule__Constant__ValueAssignment_3 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1779:1: ( ( rule__Constant__ValueAssignment_3 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1780:1: ( rule__Constant__ValueAssignment_3 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_3()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1781:1: ( rule__Constant__ValueAssignment_3 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1781:2: rule__Constant__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Constant__ValueAssignment_3_in_rule__Constant__Group__3__Impl3521);
            rule__Constant__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3__Impl"


    // $ANTLR start "rule__Constant__Group__4"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1791:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1795:1: ( rule__Constant__Group__4__Impl )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1796:2: rule__Constant__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__43551);
            rule__Constant__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__4"


    // $ANTLR start "rule__Constant__Group__4__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1802:1: rule__Constant__Group__4__Impl : ( ';' ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1806:1: ( ( ';' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1807:1: ( ';' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1807:1: ( ';' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1808:1: ';'
            {
             before(grammarAccess.getConstantAccess().getSemicolonKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Constant__Group__4__Impl3579); 
             after(grammarAccess.getConstantAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__4__Impl"


    // $ANTLR start "rule__WeightedMetric__Group__0"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1831:1: rule__WeightedMetric__Group__0 : rule__WeightedMetric__Group__0__Impl rule__WeightedMetric__Group__1 ;
    public final void rule__WeightedMetric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1835:1: ( rule__WeightedMetric__Group__0__Impl rule__WeightedMetric__Group__1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1836:2: rule__WeightedMetric__Group__0__Impl rule__WeightedMetric__Group__1
            {
            pushFollow(FOLLOW_rule__WeightedMetric__Group__0__Impl_in_rule__WeightedMetric__Group__03620);
            rule__WeightedMetric__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WeightedMetric__Group__1_in_rule__WeightedMetric__Group__03623);
            rule__WeightedMetric__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WeightedMetric__Group__0"


    // $ANTLR start "rule__WeightedMetric__Group__0__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1843:1: rule__WeightedMetric__Group__0__Impl : ( 'WeigthedSum' ) ;
    public final void rule__WeightedMetric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1847:1: ( ( 'WeigthedSum' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1848:1: ( 'WeigthedSum' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1848:1: ( 'WeigthedSum' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1849:1: 'WeigthedSum'
            {
             before(grammarAccess.getWeightedMetricAccess().getWeigthedSumKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__WeightedMetric__Group__0__Impl3651); 
             after(grammarAccess.getWeightedMetricAccess().getWeigthedSumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WeightedMetric__Group__0__Impl"


    // $ANTLR start "rule__WeightedMetric__Group__1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1862:1: rule__WeightedMetric__Group__1 : rule__WeightedMetric__Group__1__Impl rule__WeightedMetric__Group__2 ;
    public final void rule__WeightedMetric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1866:1: ( rule__WeightedMetric__Group__1__Impl rule__WeightedMetric__Group__2 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1867:2: rule__WeightedMetric__Group__1__Impl rule__WeightedMetric__Group__2
            {
            pushFollow(FOLLOW_rule__WeightedMetric__Group__1__Impl_in_rule__WeightedMetric__Group__13682);
            rule__WeightedMetric__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WeightedMetric__Group__2_in_rule__WeightedMetric__Group__13685);
            rule__WeightedMetric__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WeightedMetric__Group__1"


    // $ANTLR start "rule__WeightedMetric__Group__1__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1874:1: rule__WeightedMetric__Group__1__Impl : ( '{' ) ;
    public final void rule__WeightedMetric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1878:1: ( ( '{' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1879:1: ( '{' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1879:1: ( '{' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1880:1: '{'
            {
             before(grammarAccess.getWeightedMetricAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__WeightedMetric__Group__1__Impl3713); 
             after(grammarAccess.getWeightedMetricAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WeightedMetric__Group__1__Impl"


    // $ANTLR start "rule__WeightedMetric__Group__2"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1893:1: rule__WeightedMetric__Group__2 : rule__WeightedMetric__Group__2__Impl rule__WeightedMetric__Group__3 ;
    public final void rule__WeightedMetric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1897:1: ( rule__WeightedMetric__Group__2__Impl rule__WeightedMetric__Group__3 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1898:2: rule__WeightedMetric__Group__2__Impl rule__WeightedMetric__Group__3
            {
            pushFollow(FOLLOW_rule__WeightedMetric__Group__2__Impl_in_rule__WeightedMetric__Group__23744);
            rule__WeightedMetric__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WeightedMetric__Group__3_in_rule__WeightedMetric__Group__23747);
            rule__WeightedMetric__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WeightedMetric__Group__2"


    // $ANTLR start "rule__WeightedMetric__Group__2__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1905:1: rule__WeightedMetric__Group__2__Impl : ( ( ( rule__WeightedMetric__WeightsAssignment_2 ) ) ( ( rule__WeightedMetric__WeightsAssignment_2 )* ) ) ;
    public final void rule__WeightedMetric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1909:1: ( ( ( ( rule__WeightedMetric__WeightsAssignment_2 ) ) ( ( rule__WeightedMetric__WeightsAssignment_2 )* ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1910:1: ( ( ( rule__WeightedMetric__WeightsAssignment_2 ) ) ( ( rule__WeightedMetric__WeightsAssignment_2 )* ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1910:1: ( ( ( rule__WeightedMetric__WeightsAssignment_2 ) ) ( ( rule__WeightedMetric__WeightsAssignment_2 )* ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1911:1: ( ( rule__WeightedMetric__WeightsAssignment_2 ) ) ( ( rule__WeightedMetric__WeightsAssignment_2 )* )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1911:1: ( ( rule__WeightedMetric__WeightsAssignment_2 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1912:1: ( rule__WeightedMetric__WeightsAssignment_2 )
            {
             before(grammarAccess.getWeightedMetricAccess().getWeightsAssignment_2()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1913:1: ( rule__WeightedMetric__WeightsAssignment_2 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1913:2: rule__WeightedMetric__WeightsAssignment_2
            {
            pushFollow(FOLLOW_rule__WeightedMetric__WeightsAssignment_2_in_rule__WeightedMetric__Group__2__Impl3776);
            rule__WeightedMetric__WeightsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWeightedMetricAccess().getWeightsAssignment_2()); 

            }

            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1916:1: ( ( rule__WeightedMetric__WeightsAssignment_2 )* )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1917:1: ( rule__WeightedMetric__WeightsAssignment_2 )*
            {
             before(grammarAccess.getWeightedMetricAccess().getWeightsAssignment_2()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1918:1: ( rule__WeightedMetric__WeightsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==33) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1918:2: rule__WeightedMetric__WeightsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__WeightedMetric__WeightsAssignment_2_in_rule__WeightedMetric__Group__2__Impl3788);
            	    rule__WeightedMetric__WeightsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getWeightedMetricAccess().getWeightsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WeightedMetric__Group__2__Impl"


    // $ANTLR start "rule__WeightedMetric__Group__3"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1929:1: rule__WeightedMetric__Group__3 : rule__WeightedMetric__Group__3__Impl ;
    public final void rule__WeightedMetric__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1933:1: ( rule__WeightedMetric__Group__3__Impl )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1934:2: rule__WeightedMetric__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WeightedMetric__Group__3__Impl_in_rule__WeightedMetric__Group__33821);
            rule__WeightedMetric__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WeightedMetric__Group__3"


    // $ANTLR start "rule__WeightedMetric__Group__3__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1940:1: rule__WeightedMetric__Group__3__Impl : ( '}' ) ;
    public final void rule__WeightedMetric__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1944:1: ( ( '}' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1945:1: ( '}' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1945:1: ( '}' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1946:1: '}'
            {
             before(grammarAccess.getWeightedMetricAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__WeightedMetric__Group__3__Impl3849); 
             after(grammarAccess.getWeightedMetricAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WeightedMetric__Group__3__Impl"


    // $ANTLR start "rule__StepwiseMetric__Group__0"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1967:1: rule__StepwiseMetric__Group__0 : rule__StepwiseMetric__Group__0__Impl rule__StepwiseMetric__Group__1 ;
    public final void rule__StepwiseMetric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1971:1: ( rule__StepwiseMetric__Group__0__Impl rule__StepwiseMetric__Group__1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1972:2: rule__StepwiseMetric__Group__0__Impl rule__StepwiseMetric__Group__1
            {
            pushFollow(FOLLOW_rule__StepwiseMetric__Group__0__Impl_in_rule__StepwiseMetric__Group__03888);
            rule__StepwiseMetric__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StepwiseMetric__Group__1_in_rule__StepwiseMetric__Group__03891);
            rule__StepwiseMetric__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepwiseMetric__Group__0"


    // $ANTLR start "rule__StepwiseMetric__Group__0__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1979:1: rule__StepwiseMetric__Group__0__Impl : ( 'Stepwise' ) ;
    public final void rule__StepwiseMetric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1983:1: ( ( 'Stepwise' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1984:1: ( 'Stepwise' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1984:1: ( 'Stepwise' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1985:1: 'Stepwise'
            {
             before(grammarAccess.getStepwiseMetricAccess().getStepwiseKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__StepwiseMetric__Group__0__Impl3919); 
             after(grammarAccess.getStepwiseMetricAccess().getStepwiseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepwiseMetric__Group__0__Impl"


    // $ANTLR start "rule__StepwiseMetric__Group__1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:1998:1: rule__StepwiseMetric__Group__1 : rule__StepwiseMetric__Group__1__Impl rule__StepwiseMetric__Group__2 ;
    public final void rule__StepwiseMetric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2002:1: ( rule__StepwiseMetric__Group__1__Impl rule__StepwiseMetric__Group__2 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2003:2: rule__StepwiseMetric__Group__1__Impl rule__StepwiseMetric__Group__2
            {
            pushFollow(FOLLOW_rule__StepwiseMetric__Group__1__Impl_in_rule__StepwiseMetric__Group__13950);
            rule__StepwiseMetric__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StepwiseMetric__Group__2_in_rule__StepwiseMetric__Group__13953);
            rule__StepwiseMetric__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepwiseMetric__Group__1"


    // $ANTLR start "rule__StepwiseMetric__Group__1__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2010:1: rule__StepwiseMetric__Group__1__Impl : ( '[' ) ;
    public final void rule__StepwiseMetric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2014:1: ( ( '[' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2015:1: ( '[' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2015:1: ( '[' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2016:1: '['
            {
             before(grammarAccess.getStepwiseMetricAccess().getLeftSquareBracketKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__StepwiseMetric__Group__1__Impl3981); 
             after(grammarAccess.getStepwiseMetricAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepwiseMetric__Group__1__Impl"


    // $ANTLR start "rule__StepwiseMetric__Group__2"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2029:1: rule__StepwiseMetric__Group__2 : rule__StepwiseMetric__Group__2__Impl rule__StepwiseMetric__Group__3 ;
    public final void rule__StepwiseMetric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2033:1: ( rule__StepwiseMetric__Group__2__Impl rule__StepwiseMetric__Group__3 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2034:2: rule__StepwiseMetric__Group__2__Impl rule__StepwiseMetric__Group__3
            {
            pushFollow(FOLLOW_rule__StepwiseMetric__Group__2__Impl_in_rule__StepwiseMetric__Group__24012);
            rule__StepwiseMetric__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StepwiseMetric__Group__3_in_rule__StepwiseMetric__Group__24015);
            rule__StepwiseMetric__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepwiseMetric__Group__2"


    // $ANTLR start "rule__StepwiseMetric__Group__2__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2041:1: rule__StepwiseMetric__Group__2__Impl : ( ( rule__StepwiseMetric__InnerMetricAssignment_2 ) ) ;
    public final void rule__StepwiseMetric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2045:1: ( ( ( rule__StepwiseMetric__InnerMetricAssignment_2 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2046:1: ( ( rule__StepwiseMetric__InnerMetricAssignment_2 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2046:1: ( ( rule__StepwiseMetric__InnerMetricAssignment_2 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2047:1: ( rule__StepwiseMetric__InnerMetricAssignment_2 )
            {
             before(grammarAccess.getStepwiseMetricAccess().getInnerMetricAssignment_2()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2048:1: ( rule__StepwiseMetric__InnerMetricAssignment_2 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2048:2: rule__StepwiseMetric__InnerMetricAssignment_2
            {
            pushFollow(FOLLOW_rule__StepwiseMetric__InnerMetricAssignment_2_in_rule__StepwiseMetric__Group__2__Impl4042);
            rule__StepwiseMetric__InnerMetricAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStepwiseMetricAccess().getInnerMetricAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepwiseMetric__Group__2__Impl"


    // $ANTLR start "rule__StepwiseMetric__Group__3"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2058:1: rule__StepwiseMetric__Group__3 : rule__StepwiseMetric__Group__3__Impl rule__StepwiseMetric__Group__4 ;
    public final void rule__StepwiseMetric__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2062:1: ( rule__StepwiseMetric__Group__3__Impl rule__StepwiseMetric__Group__4 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2063:2: rule__StepwiseMetric__Group__3__Impl rule__StepwiseMetric__Group__4
            {
            pushFollow(FOLLOW_rule__StepwiseMetric__Group__3__Impl_in_rule__StepwiseMetric__Group__34072);
            rule__StepwiseMetric__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StepwiseMetric__Group__4_in_rule__StepwiseMetric__Group__34075);
            rule__StepwiseMetric__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepwiseMetric__Group__3"


    // $ANTLR start "rule__StepwiseMetric__Group__3__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2070:1: rule__StepwiseMetric__Group__3__Impl : ( ']' ) ;
    public final void rule__StepwiseMetric__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2074:1: ( ( ']' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2075:1: ( ']' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2075:1: ( ']' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2076:1: ']'
            {
             before(grammarAccess.getStepwiseMetricAccess().getRightSquareBracketKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__StepwiseMetric__Group__3__Impl4103); 
             after(grammarAccess.getStepwiseMetricAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepwiseMetric__Group__3__Impl"


    // $ANTLR start "rule__StepwiseMetric__Group__4"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2089:1: rule__StepwiseMetric__Group__4 : rule__StepwiseMetric__Group__4__Impl rule__StepwiseMetric__Group__5 ;
    public final void rule__StepwiseMetric__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2093:1: ( rule__StepwiseMetric__Group__4__Impl rule__StepwiseMetric__Group__5 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2094:2: rule__StepwiseMetric__Group__4__Impl rule__StepwiseMetric__Group__5
            {
            pushFollow(FOLLOW_rule__StepwiseMetric__Group__4__Impl_in_rule__StepwiseMetric__Group__44134);
            rule__StepwiseMetric__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StepwiseMetric__Group__5_in_rule__StepwiseMetric__Group__44137);
            rule__StepwiseMetric__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepwiseMetric__Group__4"


    // $ANTLR start "rule__StepwiseMetric__Group__4__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2101:1: rule__StepwiseMetric__Group__4__Impl : ( '{' ) ;
    public final void rule__StepwiseMetric__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2105:1: ( ( '{' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2106:1: ( '{' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2106:1: ( '{' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2107:1: '{'
            {
             before(grammarAccess.getStepwiseMetricAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__StepwiseMetric__Group__4__Impl4165); 
             after(grammarAccess.getStepwiseMetricAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepwiseMetric__Group__4__Impl"


    // $ANTLR start "rule__StepwiseMetric__Group__5"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2120:1: rule__StepwiseMetric__Group__5 : rule__StepwiseMetric__Group__5__Impl rule__StepwiseMetric__Group__6 ;
    public final void rule__StepwiseMetric__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2124:1: ( rule__StepwiseMetric__Group__5__Impl rule__StepwiseMetric__Group__6 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2125:2: rule__StepwiseMetric__Group__5__Impl rule__StepwiseMetric__Group__6
            {
            pushFollow(FOLLOW_rule__StepwiseMetric__Group__5__Impl_in_rule__StepwiseMetric__Group__54196);
            rule__StepwiseMetric__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StepwiseMetric__Group__6_in_rule__StepwiseMetric__Group__54199);
            rule__StepwiseMetric__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepwiseMetric__Group__5"


    // $ANTLR start "rule__StepwiseMetric__Group__5__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2132:1: rule__StepwiseMetric__Group__5__Impl : ( ( rule__StepwiseMetric__StepsAssignment_5 )* ) ;
    public final void rule__StepwiseMetric__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2136:1: ( ( ( rule__StepwiseMetric__StepsAssignment_5 )* ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2137:1: ( ( rule__StepwiseMetric__StepsAssignment_5 )* )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2137:1: ( ( rule__StepwiseMetric__StepsAssignment_5 )* )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2138:1: ( rule__StepwiseMetric__StepsAssignment_5 )*
            {
             before(grammarAccess.getStepwiseMetricAccess().getStepsAssignment_5()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2139:1: ( rule__StepwiseMetric__StepsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==33) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2139:2: rule__StepwiseMetric__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__StepwiseMetric__StepsAssignment_5_in_rule__StepwiseMetric__Group__5__Impl4226);
            	    rule__StepwiseMetric__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getStepwiseMetricAccess().getStepsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepwiseMetric__Group__5__Impl"


    // $ANTLR start "rule__StepwiseMetric__Group__6"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2149:1: rule__StepwiseMetric__Group__6 : rule__StepwiseMetric__Group__6__Impl ;
    public final void rule__StepwiseMetric__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2153:1: ( rule__StepwiseMetric__Group__6__Impl )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2154:2: rule__StepwiseMetric__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__StepwiseMetric__Group__6__Impl_in_rule__StepwiseMetric__Group__64257);
            rule__StepwiseMetric__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepwiseMetric__Group__6"


    // $ANTLR start "rule__StepwiseMetric__Group__6__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2160:1: rule__StepwiseMetric__Group__6__Impl : ( '}' ) ;
    public final void rule__StepwiseMetric__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2164:1: ( ( '}' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2165:1: ( '}' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2165:1: ( '}' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2166:1: '}'
            {
             before(grammarAccess.getStepwiseMetricAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__StepwiseMetric__Group__6__Impl4285); 
             after(grammarAccess.getStepwiseMetricAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepwiseMetric__Group__6__Impl"


    // $ANTLR start "rule__RatioMetric__Group__0"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2193:1: rule__RatioMetric__Group__0 : rule__RatioMetric__Group__0__Impl rule__RatioMetric__Group__1 ;
    public final void rule__RatioMetric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2197:1: ( rule__RatioMetric__Group__0__Impl rule__RatioMetric__Group__1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2198:2: rule__RatioMetric__Group__0__Impl rule__RatioMetric__Group__1
            {
            pushFollow(FOLLOW_rule__RatioMetric__Group__0__Impl_in_rule__RatioMetric__Group__04330);
            rule__RatioMetric__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RatioMetric__Group__1_in_rule__RatioMetric__Group__04333);
            rule__RatioMetric__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioMetric__Group__0"


    // $ANTLR start "rule__RatioMetric__Group__0__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2205:1: rule__RatioMetric__Group__0__Impl : ( 'Ratio' ) ;
    public final void rule__RatioMetric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2209:1: ( ( 'Ratio' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2210:1: ( 'Ratio' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2210:1: ( 'Ratio' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2211:1: 'Ratio'
            {
             before(grammarAccess.getRatioMetricAccess().getRatioKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__RatioMetric__Group__0__Impl4361); 
             after(grammarAccess.getRatioMetricAccess().getRatioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioMetric__Group__0__Impl"


    // $ANTLR start "rule__RatioMetric__Group__1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2224:1: rule__RatioMetric__Group__1 : rule__RatioMetric__Group__1__Impl rule__RatioMetric__Group__2 ;
    public final void rule__RatioMetric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2228:1: ( rule__RatioMetric__Group__1__Impl rule__RatioMetric__Group__2 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2229:2: rule__RatioMetric__Group__1__Impl rule__RatioMetric__Group__2
            {
            pushFollow(FOLLOW_rule__RatioMetric__Group__1__Impl_in_rule__RatioMetric__Group__14392);
            rule__RatioMetric__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RatioMetric__Group__2_in_rule__RatioMetric__Group__14395);
            rule__RatioMetric__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioMetric__Group__1"


    // $ANTLR start "rule__RatioMetric__Group__1__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2236:1: rule__RatioMetric__Group__1__Impl : ( '{' ) ;
    public final void rule__RatioMetric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2240:1: ( ( '{' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2241:1: ( '{' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2241:1: ( '{' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2242:1: '{'
            {
             before(grammarAccess.getRatioMetricAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__RatioMetric__Group__1__Impl4423); 
             after(grammarAccess.getRatioMetricAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioMetric__Group__1__Impl"


    // $ANTLR start "rule__RatioMetric__Group__2"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2255:1: rule__RatioMetric__Group__2 : rule__RatioMetric__Group__2__Impl rule__RatioMetric__Group__3 ;
    public final void rule__RatioMetric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2259:1: ( rule__RatioMetric__Group__2__Impl rule__RatioMetric__Group__3 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2260:2: rule__RatioMetric__Group__2__Impl rule__RatioMetric__Group__3
            {
            pushFollow(FOLLOW_rule__RatioMetric__Group__2__Impl_in_rule__RatioMetric__Group__24454);
            rule__RatioMetric__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RatioMetric__Group__3_in_rule__RatioMetric__Group__24457);
            rule__RatioMetric__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioMetric__Group__2"


    // $ANTLR start "rule__RatioMetric__Group__2__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2267:1: rule__RatioMetric__Group__2__Impl : ( ( rule__RatioMetric__NominatorMetricAssignment_2 ) ) ;
    public final void rule__RatioMetric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2271:1: ( ( ( rule__RatioMetric__NominatorMetricAssignment_2 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2272:1: ( ( rule__RatioMetric__NominatorMetricAssignment_2 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2272:1: ( ( rule__RatioMetric__NominatorMetricAssignment_2 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2273:1: ( rule__RatioMetric__NominatorMetricAssignment_2 )
            {
             before(grammarAccess.getRatioMetricAccess().getNominatorMetricAssignment_2()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2274:1: ( rule__RatioMetric__NominatorMetricAssignment_2 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2274:2: rule__RatioMetric__NominatorMetricAssignment_2
            {
            pushFollow(FOLLOW_rule__RatioMetric__NominatorMetricAssignment_2_in_rule__RatioMetric__Group__2__Impl4484);
            rule__RatioMetric__NominatorMetricAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRatioMetricAccess().getNominatorMetricAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioMetric__Group__2__Impl"


    // $ANTLR start "rule__RatioMetric__Group__3"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2284:1: rule__RatioMetric__Group__3 : rule__RatioMetric__Group__3__Impl rule__RatioMetric__Group__4 ;
    public final void rule__RatioMetric__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2288:1: ( rule__RatioMetric__Group__3__Impl rule__RatioMetric__Group__4 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2289:2: rule__RatioMetric__Group__3__Impl rule__RatioMetric__Group__4
            {
            pushFollow(FOLLOW_rule__RatioMetric__Group__3__Impl_in_rule__RatioMetric__Group__34514);
            rule__RatioMetric__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RatioMetric__Group__4_in_rule__RatioMetric__Group__34517);
            rule__RatioMetric__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioMetric__Group__3"


    // $ANTLR start "rule__RatioMetric__Group__3__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2296:1: rule__RatioMetric__Group__3__Impl : ( '/' ) ;
    public final void rule__RatioMetric__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2300:1: ( ( '/' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2301:1: ( '/' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2301:1: ( '/' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2302:1: '/'
            {
             before(grammarAccess.getRatioMetricAccess().getSolidusKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__RatioMetric__Group__3__Impl4545); 
             after(grammarAccess.getRatioMetricAccess().getSolidusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioMetric__Group__3__Impl"


    // $ANTLR start "rule__RatioMetric__Group__4"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2315:1: rule__RatioMetric__Group__4 : rule__RatioMetric__Group__4__Impl rule__RatioMetric__Group__5 ;
    public final void rule__RatioMetric__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2319:1: ( rule__RatioMetric__Group__4__Impl rule__RatioMetric__Group__5 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2320:2: rule__RatioMetric__Group__4__Impl rule__RatioMetric__Group__5
            {
            pushFollow(FOLLOW_rule__RatioMetric__Group__4__Impl_in_rule__RatioMetric__Group__44576);
            rule__RatioMetric__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RatioMetric__Group__5_in_rule__RatioMetric__Group__44579);
            rule__RatioMetric__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioMetric__Group__4"


    // $ANTLR start "rule__RatioMetric__Group__4__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2327:1: rule__RatioMetric__Group__4__Impl : ( ( rule__RatioMetric__DenominatorMetricAssignment_4 ) ) ;
    public final void rule__RatioMetric__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2331:1: ( ( ( rule__RatioMetric__DenominatorMetricAssignment_4 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2332:1: ( ( rule__RatioMetric__DenominatorMetricAssignment_4 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2332:1: ( ( rule__RatioMetric__DenominatorMetricAssignment_4 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2333:1: ( rule__RatioMetric__DenominatorMetricAssignment_4 )
            {
             before(grammarAccess.getRatioMetricAccess().getDenominatorMetricAssignment_4()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2334:1: ( rule__RatioMetric__DenominatorMetricAssignment_4 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2334:2: rule__RatioMetric__DenominatorMetricAssignment_4
            {
            pushFollow(FOLLOW_rule__RatioMetric__DenominatorMetricAssignment_4_in_rule__RatioMetric__Group__4__Impl4606);
            rule__RatioMetric__DenominatorMetricAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRatioMetricAccess().getDenominatorMetricAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioMetric__Group__4__Impl"


    // $ANTLR start "rule__RatioMetric__Group__5"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2344:1: rule__RatioMetric__Group__5 : rule__RatioMetric__Group__5__Impl ;
    public final void rule__RatioMetric__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2348:1: ( rule__RatioMetric__Group__5__Impl )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2349:2: rule__RatioMetric__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__RatioMetric__Group__5__Impl_in_rule__RatioMetric__Group__54636);
            rule__RatioMetric__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioMetric__Group__5"


    // $ANTLR start "rule__RatioMetric__Group__5__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2355:1: rule__RatioMetric__Group__5__Impl : ( '}' ) ;
    public final void rule__RatioMetric__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2359:1: ( ( '}' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2360:1: ( '}' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2360:1: ( '}' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2361:1: '}'
            {
             before(grammarAccess.getRatioMetricAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__RatioMetric__Group__5__Impl4664); 
             after(grammarAccess.getRatioMetricAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioMetric__Group__5__Impl"


    // $ANTLR start "rule__BoundAndWeight__Group__0"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2386:1: rule__BoundAndWeight__Group__0 : rule__BoundAndWeight__Group__0__Impl rule__BoundAndWeight__Group__1 ;
    public final void rule__BoundAndWeight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2390:1: ( rule__BoundAndWeight__Group__0__Impl rule__BoundAndWeight__Group__1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2391:2: rule__BoundAndWeight__Group__0__Impl rule__BoundAndWeight__Group__1
            {
            pushFollow(FOLLOW_rule__BoundAndWeight__Group__0__Impl_in_rule__BoundAndWeight__Group__04707);
            rule__BoundAndWeight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoundAndWeight__Group__1_in_rule__BoundAndWeight__Group__04710);
            rule__BoundAndWeight__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAndWeight__Group__0"


    // $ANTLR start "rule__BoundAndWeight__Group__0__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2398:1: rule__BoundAndWeight__Group__0__Impl : ( '<' ) ;
    public final void rule__BoundAndWeight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2402:1: ( ( '<' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2403:1: ( '<' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2403:1: ( '<' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2404:1: '<'
            {
             before(grammarAccess.getBoundAndWeightAccess().getLessThanSignKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__BoundAndWeight__Group__0__Impl4738); 
             after(grammarAccess.getBoundAndWeightAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAndWeight__Group__0__Impl"


    // $ANTLR start "rule__BoundAndWeight__Group__1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2417:1: rule__BoundAndWeight__Group__1 : rule__BoundAndWeight__Group__1__Impl rule__BoundAndWeight__Group__2 ;
    public final void rule__BoundAndWeight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2421:1: ( rule__BoundAndWeight__Group__1__Impl rule__BoundAndWeight__Group__2 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2422:2: rule__BoundAndWeight__Group__1__Impl rule__BoundAndWeight__Group__2
            {
            pushFollow(FOLLOW_rule__BoundAndWeight__Group__1__Impl_in_rule__BoundAndWeight__Group__14769);
            rule__BoundAndWeight__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoundAndWeight__Group__2_in_rule__BoundAndWeight__Group__14772);
            rule__BoundAndWeight__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAndWeight__Group__1"


    // $ANTLR start "rule__BoundAndWeight__Group__1__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2429:1: rule__BoundAndWeight__Group__1__Impl : ( ( rule__BoundAndWeight__UpperBoundAssignment_1 ) ) ;
    public final void rule__BoundAndWeight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2433:1: ( ( ( rule__BoundAndWeight__UpperBoundAssignment_1 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2434:1: ( ( rule__BoundAndWeight__UpperBoundAssignment_1 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2434:1: ( ( rule__BoundAndWeight__UpperBoundAssignment_1 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2435:1: ( rule__BoundAndWeight__UpperBoundAssignment_1 )
            {
             before(grammarAccess.getBoundAndWeightAccess().getUpperBoundAssignment_1()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2436:1: ( rule__BoundAndWeight__UpperBoundAssignment_1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2436:2: rule__BoundAndWeight__UpperBoundAssignment_1
            {
            pushFollow(FOLLOW_rule__BoundAndWeight__UpperBoundAssignment_1_in_rule__BoundAndWeight__Group__1__Impl4799);
            rule__BoundAndWeight__UpperBoundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoundAndWeightAccess().getUpperBoundAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAndWeight__Group__1__Impl"


    // $ANTLR start "rule__BoundAndWeight__Group__2"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2446:1: rule__BoundAndWeight__Group__2 : rule__BoundAndWeight__Group__2__Impl rule__BoundAndWeight__Group__3 ;
    public final void rule__BoundAndWeight__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2450:1: ( rule__BoundAndWeight__Group__2__Impl rule__BoundAndWeight__Group__3 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2451:2: rule__BoundAndWeight__Group__2__Impl rule__BoundAndWeight__Group__3
            {
            pushFollow(FOLLOW_rule__BoundAndWeight__Group__2__Impl_in_rule__BoundAndWeight__Group__24829);
            rule__BoundAndWeight__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoundAndWeight__Group__3_in_rule__BoundAndWeight__Group__24832);
            rule__BoundAndWeight__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAndWeight__Group__2"


    // $ANTLR start "rule__BoundAndWeight__Group__2__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2458:1: rule__BoundAndWeight__Group__2__Impl : ( ',' ) ;
    public final void rule__BoundAndWeight__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2462:1: ( ( ',' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2463:1: ( ',' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2463:1: ( ',' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2464:1: ','
            {
             before(grammarAccess.getBoundAndWeightAccess().getCommaKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__BoundAndWeight__Group__2__Impl4860); 
             after(grammarAccess.getBoundAndWeightAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAndWeight__Group__2__Impl"


    // $ANTLR start "rule__BoundAndWeight__Group__3"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2477:1: rule__BoundAndWeight__Group__3 : rule__BoundAndWeight__Group__3__Impl rule__BoundAndWeight__Group__4 ;
    public final void rule__BoundAndWeight__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2481:1: ( rule__BoundAndWeight__Group__3__Impl rule__BoundAndWeight__Group__4 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2482:2: rule__BoundAndWeight__Group__3__Impl rule__BoundAndWeight__Group__4
            {
            pushFollow(FOLLOW_rule__BoundAndWeight__Group__3__Impl_in_rule__BoundAndWeight__Group__34891);
            rule__BoundAndWeight__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoundAndWeight__Group__4_in_rule__BoundAndWeight__Group__34894);
            rule__BoundAndWeight__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAndWeight__Group__3"


    // $ANTLR start "rule__BoundAndWeight__Group__3__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2489:1: rule__BoundAndWeight__Group__3__Impl : ( ( rule__BoundAndWeight__WeightAssignment_3 ) ) ;
    public final void rule__BoundAndWeight__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2493:1: ( ( ( rule__BoundAndWeight__WeightAssignment_3 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2494:1: ( ( rule__BoundAndWeight__WeightAssignment_3 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2494:1: ( ( rule__BoundAndWeight__WeightAssignment_3 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2495:1: ( rule__BoundAndWeight__WeightAssignment_3 )
            {
             before(grammarAccess.getBoundAndWeightAccess().getWeightAssignment_3()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2496:1: ( rule__BoundAndWeight__WeightAssignment_3 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2496:2: rule__BoundAndWeight__WeightAssignment_3
            {
            pushFollow(FOLLOW_rule__BoundAndWeight__WeightAssignment_3_in_rule__BoundAndWeight__Group__3__Impl4921);
            rule__BoundAndWeight__WeightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBoundAndWeightAccess().getWeightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAndWeight__Group__3__Impl"


    // $ANTLR start "rule__BoundAndWeight__Group__4"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2506:1: rule__BoundAndWeight__Group__4 : rule__BoundAndWeight__Group__4__Impl ;
    public final void rule__BoundAndWeight__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2510:1: ( rule__BoundAndWeight__Group__4__Impl )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2511:2: rule__BoundAndWeight__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BoundAndWeight__Group__4__Impl_in_rule__BoundAndWeight__Group__44951);
            rule__BoundAndWeight__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAndWeight__Group__4"


    // $ANTLR start "rule__BoundAndWeight__Group__4__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2517:1: rule__BoundAndWeight__Group__4__Impl : ( '>' ) ;
    public final void rule__BoundAndWeight__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2521:1: ( ( '>' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2522:1: ( '>' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2522:1: ( '>' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2523:1: '>'
            {
             before(grammarAccess.getBoundAndWeightAccess().getGreaterThanSignKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__BoundAndWeight__Group__4__Impl4979); 
             after(grammarAccess.getBoundAndWeightAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAndWeight__Group__4__Impl"


    // $ANTLR start "rule__MetricAndWeight__Group__0"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2546:1: rule__MetricAndWeight__Group__0 : rule__MetricAndWeight__Group__0__Impl rule__MetricAndWeight__Group__1 ;
    public final void rule__MetricAndWeight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2550:1: ( rule__MetricAndWeight__Group__0__Impl rule__MetricAndWeight__Group__1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2551:2: rule__MetricAndWeight__Group__0__Impl rule__MetricAndWeight__Group__1
            {
            pushFollow(FOLLOW_rule__MetricAndWeight__Group__0__Impl_in_rule__MetricAndWeight__Group__05020);
            rule__MetricAndWeight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricAndWeight__Group__1_in_rule__MetricAndWeight__Group__05023);
            rule__MetricAndWeight__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricAndWeight__Group__0"


    // $ANTLR start "rule__MetricAndWeight__Group__0__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2558:1: rule__MetricAndWeight__Group__0__Impl : ( '<' ) ;
    public final void rule__MetricAndWeight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2562:1: ( ( '<' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2563:1: ( '<' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2563:1: ( '<' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2564:1: '<'
            {
             before(grammarAccess.getMetricAndWeightAccess().getLessThanSignKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__MetricAndWeight__Group__0__Impl5051); 
             after(grammarAccess.getMetricAndWeightAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricAndWeight__Group__0__Impl"


    // $ANTLR start "rule__MetricAndWeight__Group__1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2577:1: rule__MetricAndWeight__Group__1 : rule__MetricAndWeight__Group__1__Impl rule__MetricAndWeight__Group__2 ;
    public final void rule__MetricAndWeight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2581:1: ( rule__MetricAndWeight__Group__1__Impl rule__MetricAndWeight__Group__2 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2582:2: rule__MetricAndWeight__Group__1__Impl rule__MetricAndWeight__Group__2
            {
            pushFollow(FOLLOW_rule__MetricAndWeight__Group__1__Impl_in_rule__MetricAndWeight__Group__15082);
            rule__MetricAndWeight__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricAndWeight__Group__2_in_rule__MetricAndWeight__Group__15085);
            rule__MetricAndWeight__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricAndWeight__Group__1"


    // $ANTLR start "rule__MetricAndWeight__Group__1__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2589:1: rule__MetricAndWeight__Group__1__Impl : ( ( rule__MetricAndWeight__MetricAssignment_1 ) ) ;
    public final void rule__MetricAndWeight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2593:1: ( ( ( rule__MetricAndWeight__MetricAssignment_1 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2594:1: ( ( rule__MetricAndWeight__MetricAssignment_1 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2594:1: ( ( rule__MetricAndWeight__MetricAssignment_1 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2595:1: ( rule__MetricAndWeight__MetricAssignment_1 )
            {
             before(grammarAccess.getMetricAndWeightAccess().getMetricAssignment_1()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2596:1: ( rule__MetricAndWeight__MetricAssignment_1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2596:2: rule__MetricAndWeight__MetricAssignment_1
            {
            pushFollow(FOLLOW_rule__MetricAndWeight__MetricAssignment_1_in_rule__MetricAndWeight__Group__1__Impl5112);
            rule__MetricAndWeight__MetricAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetricAndWeightAccess().getMetricAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricAndWeight__Group__1__Impl"


    // $ANTLR start "rule__MetricAndWeight__Group__2"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2606:1: rule__MetricAndWeight__Group__2 : rule__MetricAndWeight__Group__2__Impl rule__MetricAndWeight__Group__3 ;
    public final void rule__MetricAndWeight__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2610:1: ( rule__MetricAndWeight__Group__2__Impl rule__MetricAndWeight__Group__3 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2611:2: rule__MetricAndWeight__Group__2__Impl rule__MetricAndWeight__Group__3
            {
            pushFollow(FOLLOW_rule__MetricAndWeight__Group__2__Impl_in_rule__MetricAndWeight__Group__25142);
            rule__MetricAndWeight__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricAndWeight__Group__3_in_rule__MetricAndWeight__Group__25145);
            rule__MetricAndWeight__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricAndWeight__Group__2"


    // $ANTLR start "rule__MetricAndWeight__Group__2__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2618:1: rule__MetricAndWeight__Group__2__Impl : ( ',' ) ;
    public final void rule__MetricAndWeight__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2622:1: ( ( ',' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2623:1: ( ',' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2623:1: ( ',' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2624:1: ','
            {
             before(grammarAccess.getMetricAndWeightAccess().getCommaKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__MetricAndWeight__Group__2__Impl5173); 
             after(grammarAccess.getMetricAndWeightAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricAndWeight__Group__2__Impl"


    // $ANTLR start "rule__MetricAndWeight__Group__3"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2637:1: rule__MetricAndWeight__Group__3 : rule__MetricAndWeight__Group__3__Impl rule__MetricAndWeight__Group__4 ;
    public final void rule__MetricAndWeight__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2641:1: ( rule__MetricAndWeight__Group__3__Impl rule__MetricAndWeight__Group__4 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2642:2: rule__MetricAndWeight__Group__3__Impl rule__MetricAndWeight__Group__4
            {
            pushFollow(FOLLOW_rule__MetricAndWeight__Group__3__Impl_in_rule__MetricAndWeight__Group__35204);
            rule__MetricAndWeight__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricAndWeight__Group__4_in_rule__MetricAndWeight__Group__35207);
            rule__MetricAndWeight__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricAndWeight__Group__3"


    // $ANTLR start "rule__MetricAndWeight__Group__3__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2649:1: rule__MetricAndWeight__Group__3__Impl : ( ( rule__MetricAndWeight__WeightAssignment_3 ) ) ;
    public final void rule__MetricAndWeight__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2653:1: ( ( ( rule__MetricAndWeight__WeightAssignment_3 ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2654:1: ( ( rule__MetricAndWeight__WeightAssignment_3 ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2654:1: ( ( rule__MetricAndWeight__WeightAssignment_3 ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2655:1: ( rule__MetricAndWeight__WeightAssignment_3 )
            {
             before(grammarAccess.getMetricAndWeightAccess().getWeightAssignment_3()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2656:1: ( rule__MetricAndWeight__WeightAssignment_3 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2656:2: rule__MetricAndWeight__WeightAssignment_3
            {
            pushFollow(FOLLOW_rule__MetricAndWeight__WeightAssignment_3_in_rule__MetricAndWeight__Group__3__Impl5234);
            rule__MetricAndWeight__WeightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMetricAndWeightAccess().getWeightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricAndWeight__Group__3__Impl"


    // $ANTLR start "rule__MetricAndWeight__Group__4"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2666:1: rule__MetricAndWeight__Group__4 : rule__MetricAndWeight__Group__4__Impl ;
    public final void rule__MetricAndWeight__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2670:1: ( rule__MetricAndWeight__Group__4__Impl )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2671:2: rule__MetricAndWeight__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MetricAndWeight__Group__4__Impl_in_rule__MetricAndWeight__Group__45264);
            rule__MetricAndWeight__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricAndWeight__Group__4"


    // $ANTLR start "rule__MetricAndWeight__Group__4__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2677:1: rule__MetricAndWeight__Group__4__Impl : ( '>' ) ;
    public final void rule__MetricAndWeight__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2681:1: ( ( '>' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2682:1: ( '>' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2682:1: ( '>' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2683:1: '>'
            {
             before(grammarAccess.getMetricAndWeightAccess().getGreaterThanSignKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__MetricAndWeight__Group__4__Impl5292); 
             after(grammarAccess.getMetricAndWeightAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricAndWeight__Group__4__Impl"


    // $ANTLR start "rule__MYID__Group__0"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2706:1: rule__MYID__Group__0 : rule__MYID__Group__0__Impl rule__MYID__Group__1 ;
    public final void rule__MYID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2710:1: ( rule__MYID__Group__0__Impl rule__MYID__Group__1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2711:2: rule__MYID__Group__0__Impl rule__MYID__Group__1
            {
            pushFollow(FOLLOW_rule__MYID__Group__0__Impl_in_rule__MYID__Group__05333);
            rule__MYID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MYID__Group__1_in_rule__MYID__Group__05336);
            rule__MYID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MYID__Group__0"


    // $ANTLR start "rule__MYID__Group__0__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2718:1: rule__MYID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__MYID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2722:1: ( ( RULE_ID ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2723:1: ( RULE_ID )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2723:1: ( RULE_ID )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2724:1: RULE_ID
            {
             before(grammarAccess.getMYIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MYID__Group__0__Impl5363); 
             after(grammarAccess.getMYIDAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MYID__Group__0__Impl"


    // $ANTLR start "rule__MYID__Group__1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2735:1: rule__MYID__Group__1 : rule__MYID__Group__1__Impl ;
    public final void rule__MYID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2739:1: ( rule__MYID__Group__1__Impl )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2740:2: rule__MYID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MYID__Group__1__Impl_in_rule__MYID__Group__15392);
            rule__MYID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MYID__Group__1"


    // $ANTLR start "rule__MYID__Group__1__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2746:1: rule__MYID__Group__1__Impl : ( ( rule__MYID__Group_1__0 )* ) ;
    public final void rule__MYID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2750:1: ( ( ( rule__MYID__Group_1__0 )* ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2751:1: ( ( rule__MYID__Group_1__0 )* )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2751:1: ( ( rule__MYID__Group_1__0 )* )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2752:1: ( rule__MYID__Group_1__0 )*
            {
             before(grammarAccess.getMYIDAccess().getGroup_1()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2753:1: ( rule__MYID__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2753:2: rule__MYID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MYID__Group_1__0_in_rule__MYID__Group__1__Impl5419);
            	    rule__MYID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMYIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MYID__Group__1__Impl"


    // $ANTLR start "rule__MYID__Group_1__0"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2767:1: rule__MYID__Group_1__0 : rule__MYID__Group_1__0__Impl rule__MYID__Group_1__1 ;
    public final void rule__MYID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2771:1: ( rule__MYID__Group_1__0__Impl rule__MYID__Group_1__1 )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2772:2: rule__MYID__Group_1__0__Impl rule__MYID__Group_1__1
            {
            pushFollow(FOLLOW_rule__MYID__Group_1__0__Impl_in_rule__MYID__Group_1__05454);
            rule__MYID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MYID__Group_1__1_in_rule__MYID__Group_1__05457);
            rule__MYID__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MYID__Group_1__0"


    // $ANTLR start "rule__MYID__Group_1__0__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2779:1: rule__MYID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__MYID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2783:1: ( ( '.' ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2784:1: ( '.' )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2784:1: ( '.' )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2785:1: '.'
            {
             before(grammarAccess.getMYIDAccess().getFullStopKeyword_1_0()); 
            match(input,35,FOLLOW_35_in_rule__MYID__Group_1__0__Impl5485); 
             after(grammarAccess.getMYIDAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MYID__Group_1__0__Impl"


    // $ANTLR start "rule__MYID__Group_1__1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2798:1: rule__MYID__Group_1__1 : rule__MYID__Group_1__1__Impl ;
    public final void rule__MYID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2802:1: ( rule__MYID__Group_1__1__Impl )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2803:2: rule__MYID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MYID__Group_1__1__Impl_in_rule__MYID__Group_1__15516);
            rule__MYID__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MYID__Group_1__1"


    // $ANTLR start "rule__MYID__Group_1__1__Impl"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2809:1: rule__MYID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__MYID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2813:1: ( ( RULE_ID ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2814:1: ( RULE_ID )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2814:1: ( RULE_ID )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2815:1: RULE_ID
            {
             before(grammarAccess.getMYIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MYID__Group_1__1__Impl5543); 
             after(grammarAccess.getMYIDAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MYID__Group_1__1__Impl"


    // $ANTLR start "rule__MetricModel__ImportURIAssignment_0_1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2831:1: rule__MetricModel__ImportURIAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__MetricModel__ImportURIAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2835:1: ( ( RULE_STRING ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2836:1: ( RULE_STRING )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2836:1: ( RULE_STRING )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2837:1: RULE_STRING
            {
             before(grammarAccess.getMetricModelAccess().getImportURISTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MetricModel__ImportURIAssignment_0_15581); 
             after(grammarAccess.getMetricModelAccess().getImportURISTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__ImportURIAssignment_0_1"


    // $ANTLR start "rule__MetricModel__MetricsAssignment_1_1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2846:1: rule__MetricModel__MetricsAssignment_1_1 : ( ruleExternalMetric ) ;
    public final void rule__MetricModel__MetricsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2850:1: ( ( ruleExternalMetric ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2851:1: ( ruleExternalMetric )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2851:1: ( ruleExternalMetric )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2852:1: ruleExternalMetric
            {
             before(grammarAccess.getMetricModelAccess().getMetricsExternalMetricParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExternalMetric_in_rule__MetricModel__MetricsAssignment_1_15612);
            ruleExternalMetric();

            state._fsp--;

             after(grammarAccess.getMetricModelAccess().getMetricsExternalMetricParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__MetricsAssignment_1_1"


    // $ANTLR start "rule__MetricModel__MetricsAssignment_4"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2861:1: rule__MetricModel__MetricsAssignment_4 : ( ruleInternalMetric ) ;
    public final void rule__MetricModel__MetricsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2865:1: ( ( ruleInternalMetric ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2866:1: ( ruleInternalMetric )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2866:1: ( ruleInternalMetric )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2867:1: ruleInternalMetric
            {
             before(grammarAccess.getMetricModelAccess().getMetricsInternalMetricParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInternalMetric_in_rule__MetricModel__MetricsAssignment_45643);
            ruleInternalMetric();

            state._fsp--;

             after(grammarAccess.getMetricModelAccess().getMetricsInternalMetricParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricModel__MetricsAssignment_4"


    // $ANTLR start "rule__ExternalMetric__NameAssignment"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2876:1: rule__ExternalMetric__NameAssignment : ( ruleMYID ) ;
    public final void rule__ExternalMetric__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2880:1: ( ( ruleMYID ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2881:1: ( ruleMYID )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2881:1: ( ruleMYID )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2882:1: ruleMYID
            {
             before(grammarAccess.getExternalMetricAccess().getNameMYIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMYID_in_rule__ExternalMetric__NameAssignment5674);
            ruleMYID();

            state._fsp--;

             after(grammarAccess.getExternalMetricAccess().getNameMYIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalMetric__NameAssignment"


    // $ANTLR start "rule__InternalMetric__NameAssignment_1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2891:1: rule__InternalMetric__NameAssignment_1 : ( ruleMYID ) ;
    public final void rule__InternalMetric__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2895:1: ( ( ruleMYID ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2896:1: ( ruleMYID )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2896:1: ( ruleMYID )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2897:1: ruleMYID
            {
             before(grammarAccess.getInternalMetricAccess().getNameMYIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMYID_in_rule__InternalMetric__NameAssignment_15705);
            ruleMYID();

            state._fsp--;

             after(grammarAccess.getInternalMetricAccess().getNameMYIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__NameAssignment_1"


    // $ANTLR start "rule__InternalMetric__ShortNameAssignment_3"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2906:1: rule__InternalMetric__ShortNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__InternalMetric__ShortNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2910:1: ( ( RULE_STRING ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2911:1: ( RULE_STRING )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2911:1: ( RULE_STRING )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2912:1: RULE_STRING
            {
             before(grammarAccess.getInternalMetricAccess().getShortNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InternalMetric__ShortNameAssignment_35736); 
             after(grammarAccess.getInternalMetricAccess().getShortNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__ShortNameAssignment_3"


    // $ANTLR start "rule__InternalMetric__DescriptionAssignment_5"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2921:1: rule__InternalMetric__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__InternalMetric__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2925:1: ( ( RULE_STRING ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2926:1: ( RULE_STRING )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2926:1: ( RULE_STRING )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2927:1: RULE_STRING
            {
             before(grammarAccess.getInternalMetricAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InternalMetric__DescriptionAssignment_55767); 
             after(grammarAccess.getInternalMetricAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__DescriptionAssignment_5"


    // $ANTLR start "rule__InternalMetric__ParameterAssignment_8_2"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2936:1: rule__InternalMetric__ParameterAssignment_8_2 : ( ruleNumber ) ;
    public final void rule__InternalMetric__ParameterAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2940:1: ( ( ruleNumber ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2941:1: ( ruleNumber )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2941:1: ( ruleNumber )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2942:1: ruleNumber
            {
             before(grammarAccess.getInternalMetricAccess().getParameterNumberParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__InternalMetric__ParameterAssignment_8_25798);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getInternalMetricAccess().getParameterNumberParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__ParameterAssignment_8_2"


    // $ANTLR start "rule__InternalMetric__DefinitionAssignment_9"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2951:1: rule__InternalMetric__DefinitionAssignment_9 : ( ruleMetricDefinition ) ;
    public final void rule__InternalMetric__DefinitionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2955:1: ( ( ruleMetricDefinition ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2956:1: ( ruleMetricDefinition )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2956:1: ( ruleMetricDefinition )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2957:1: ruleMetricDefinition
            {
             before(grammarAccess.getInternalMetricAccess().getDefinitionMetricDefinitionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleMetricDefinition_in_rule__InternalMetric__DefinitionAssignment_95829);
            ruleMetricDefinition();

            state._fsp--;

             after(grammarAccess.getInternalMetricAccess().getDefinitionMetricDefinitionParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalMetric__DefinitionAssignment_9"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2966:1: rule__Parameter__NameAssignment_1 : ( ruleMYID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2970:1: ( ( ruleMYID ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2971:1: ( ruleMYID )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2971:1: ( ruleMYID )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2972:1: ruleMYID
            {
             before(grammarAccess.getParameterAccess().getNameMYIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMYID_in_rule__Parameter__NameAssignment_15860);
            ruleMYID();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameMYIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__ShortnameAssignment_3"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2981:1: rule__Parameter__ShortnameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Parameter__ShortnameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2985:1: ( ( RULE_STRING ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2986:1: ( RULE_STRING )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2986:1: ( RULE_STRING )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2987:1: RULE_STRING
            {
             before(grammarAccess.getParameterAccess().getShortnameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Parameter__ShortnameAssignment_35891); 
             after(grammarAccess.getParameterAccess().getShortnameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ShortnameAssignment_3"


    // $ANTLR start "rule__Parameter__DescriptionAssignment_5"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:2996:1: rule__Parameter__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Parameter__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3000:1: ( ( RULE_STRING ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3001:1: ( RULE_STRING )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3001:1: ( RULE_STRING )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3002:1: RULE_STRING
            {
             before(grammarAccess.getParameterAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Parameter__DescriptionAssignment_55922); 
             after(grammarAccess.getParameterAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__DescriptionAssignment_5"


    // $ANTLR start "rule__Parameter__DefaultValueAssignment_7"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3011:1: rule__Parameter__DefaultValueAssignment_7 : ( RULE_DOUBLE ) ;
    public final void rule__Parameter__DefaultValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3015:1: ( ( RULE_DOUBLE ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3016:1: ( RULE_DOUBLE )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3016:1: ( RULE_DOUBLE )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3017:1: RULE_DOUBLE
            {
             before(grammarAccess.getParameterAccess().getDefaultValueDOUBLETerminalRuleCall_7_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Parameter__DefaultValueAssignment_75953); 
             after(grammarAccess.getParameterAccess().getDefaultValueDOUBLETerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__DefaultValueAssignment_7"


    // $ANTLR start "rule__Constant__NameAssignment_1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3026:1: rule__Constant__NameAssignment_1 : ( ruleMYID ) ;
    public final void rule__Constant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3030:1: ( ( ruleMYID ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3031:1: ( ruleMYID )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3031:1: ( ruleMYID )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3032:1: ruleMYID
            {
             before(grammarAccess.getConstantAccess().getNameMYIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMYID_in_rule__Constant__NameAssignment_15984);
            ruleMYID();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getNameMYIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__NameAssignment_1"


    // $ANTLR start "rule__Constant__ValueAssignment_3"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3041:1: rule__Constant__ValueAssignment_3 : ( RULE_DOUBLE ) ;
    public final void rule__Constant__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3045:1: ( ( RULE_DOUBLE ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3046:1: ( RULE_DOUBLE )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3046:1: ( RULE_DOUBLE )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3047:1: RULE_DOUBLE
            {
             before(grammarAccess.getConstantAccess().getValueDOUBLETerminalRuleCall_3_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Constant__ValueAssignment_36015); 
             after(grammarAccess.getConstantAccess().getValueDOUBLETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__ValueAssignment_3"


    // $ANTLR start "rule__WeightedMetric__WeightsAssignment_2"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3056:1: rule__WeightedMetric__WeightsAssignment_2 : ( ruleMetricAndWeight ) ;
    public final void rule__WeightedMetric__WeightsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3060:1: ( ( ruleMetricAndWeight ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3061:1: ( ruleMetricAndWeight )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3061:1: ( ruleMetricAndWeight )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3062:1: ruleMetricAndWeight
            {
             before(grammarAccess.getWeightedMetricAccess().getWeightsMetricAndWeightParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMetricAndWeight_in_rule__WeightedMetric__WeightsAssignment_26046);
            ruleMetricAndWeight();

            state._fsp--;

             after(grammarAccess.getWeightedMetricAccess().getWeightsMetricAndWeightParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WeightedMetric__WeightsAssignment_2"


    // $ANTLR start "rule__StepwiseMetric__InnerMetricAssignment_2"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3071:1: rule__StepwiseMetric__InnerMetricAssignment_2 : ( ( ruleMYID ) ) ;
    public final void rule__StepwiseMetric__InnerMetricAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3075:1: ( ( ( ruleMYID ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3076:1: ( ( ruleMYID ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3076:1: ( ( ruleMYID ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3077:1: ( ruleMYID )
            {
             before(grammarAccess.getStepwiseMetricAccess().getInnerMetricMetricCrossReference_2_0()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3078:1: ( ruleMYID )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3079:1: ruleMYID
            {
             before(grammarAccess.getStepwiseMetricAccess().getInnerMetricMetricMYIDParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleMYID_in_rule__StepwiseMetric__InnerMetricAssignment_26081);
            ruleMYID();

            state._fsp--;

             after(grammarAccess.getStepwiseMetricAccess().getInnerMetricMetricMYIDParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStepwiseMetricAccess().getInnerMetricMetricCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepwiseMetric__InnerMetricAssignment_2"


    // $ANTLR start "rule__StepwiseMetric__StepsAssignment_5"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3090:1: rule__StepwiseMetric__StepsAssignment_5 : ( ruleBoundAndWeight ) ;
    public final void rule__StepwiseMetric__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3094:1: ( ( ruleBoundAndWeight ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3095:1: ( ruleBoundAndWeight )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3095:1: ( ruleBoundAndWeight )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3096:1: ruleBoundAndWeight
            {
             before(grammarAccess.getStepwiseMetricAccess().getStepsBoundAndWeightParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBoundAndWeight_in_rule__StepwiseMetric__StepsAssignment_56116);
            ruleBoundAndWeight();

            state._fsp--;

             after(grammarAccess.getStepwiseMetricAccess().getStepsBoundAndWeightParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepwiseMetric__StepsAssignment_5"


    // $ANTLR start "rule__RatioMetric__NominatorMetricAssignment_2"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3105:1: rule__RatioMetric__NominatorMetricAssignment_2 : ( ( ruleMYID ) ) ;
    public final void rule__RatioMetric__NominatorMetricAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3109:1: ( ( ( ruleMYID ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3110:1: ( ( ruleMYID ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3110:1: ( ( ruleMYID ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3111:1: ( ruleMYID )
            {
             before(grammarAccess.getRatioMetricAccess().getNominatorMetricMetricCrossReference_2_0()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3112:1: ( ruleMYID )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3113:1: ruleMYID
            {
             before(grammarAccess.getRatioMetricAccess().getNominatorMetricMetricMYIDParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleMYID_in_rule__RatioMetric__NominatorMetricAssignment_26151);
            ruleMYID();

            state._fsp--;

             after(grammarAccess.getRatioMetricAccess().getNominatorMetricMetricMYIDParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRatioMetricAccess().getNominatorMetricMetricCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioMetric__NominatorMetricAssignment_2"


    // $ANTLR start "rule__RatioMetric__DenominatorMetricAssignment_4"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3124:1: rule__RatioMetric__DenominatorMetricAssignment_4 : ( ( ruleMYID ) ) ;
    public final void rule__RatioMetric__DenominatorMetricAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3128:1: ( ( ( ruleMYID ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3129:1: ( ( ruleMYID ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3129:1: ( ( ruleMYID ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3130:1: ( ruleMYID )
            {
             before(grammarAccess.getRatioMetricAccess().getDenominatorMetricMetricCrossReference_4_0()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3131:1: ( ruleMYID )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3132:1: ruleMYID
            {
             before(grammarAccess.getRatioMetricAccess().getDenominatorMetricMetricMYIDParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_ruleMYID_in_rule__RatioMetric__DenominatorMetricAssignment_46190);
            ruleMYID();

            state._fsp--;

             after(grammarAccess.getRatioMetricAccess().getDenominatorMetricMetricMYIDParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRatioMetricAccess().getDenominatorMetricMetricCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatioMetric__DenominatorMetricAssignment_4"


    // $ANTLR start "rule__BoundAndWeight__UpperBoundAssignment_1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3143:1: rule__BoundAndWeight__UpperBoundAssignment_1 : ( ( ruleMYID ) ) ;
    public final void rule__BoundAndWeight__UpperBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3147:1: ( ( ( ruleMYID ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3148:1: ( ( ruleMYID ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3148:1: ( ( ruleMYID ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3149:1: ( ruleMYID )
            {
             before(grammarAccess.getBoundAndWeightAccess().getUpperBoundNumberCrossReference_1_0()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3150:1: ( ruleMYID )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3151:1: ruleMYID
            {
             before(grammarAccess.getBoundAndWeightAccess().getUpperBoundNumberMYIDParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleMYID_in_rule__BoundAndWeight__UpperBoundAssignment_16229);
            ruleMYID();

            state._fsp--;

             after(grammarAccess.getBoundAndWeightAccess().getUpperBoundNumberMYIDParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBoundAndWeightAccess().getUpperBoundNumberCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAndWeight__UpperBoundAssignment_1"


    // $ANTLR start "rule__BoundAndWeight__WeightAssignment_3"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3162:1: rule__BoundAndWeight__WeightAssignment_3 : ( ( ruleMYID ) ) ;
    public final void rule__BoundAndWeight__WeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3166:1: ( ( ( ruleMYID ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3167:1: ( ( ruleMYID ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3167:1: ( ( ruleMYID ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3168:1: ( ruleMYID )
            {
             before(grammarAccess.getBoundAndWeightAccess().getWeightNumberCrossReference_3_0()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3169:1: ( ruleMYID )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3170:1: ruleMYID
            {
             before(grammarAccess.getBoundAndWeightAccess().getWeightNumberMYIDParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleMYID_in_rule__BoundAndWeight__WeightAssignment_36268);
            ruleMYID();

            state._fsp--;

             after(grammarAccess.getBoundAndWeightAccess().getWeightNumberMYIDParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getBoundAndWeightAccess().getWeightNumberCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundAndWeight__WeightAssignment_3"


    // $ANTLR start "rule__MetricAndWeight__MetricAssignment_1"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3181:1: rule__MetricAndWeight__MetricAssignment_1 : ( ( ruleMYID ) ) ;
    public final void rule__MetricAndWeight__MetricAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3185:1: ( ( ( ruleMYID ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3186:1: ( ( ruleMYID ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3186:1: ( ( ruleMYID ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3187:1: ( ruleMYID )
            {
             before(grammarAccess.getMetricAndWeightAccess().getMetricMetricCrossReference_1_0()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3188:1: ( ruleMYID )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3189:1: ruleMYID
            {
             before(grammarAccess.getMetricAndWeightAccess().getMetricMetricMYIDParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleMYID_in_rule__MetricAndWeight__MetricAssignment_16307);
            ruleMYID();

            state._fsp--;

             after(grammarAccess.getMetricAndWeightAccess().getMetricMetricMYIDParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMetricAndWeightAccess().getMetricMetricCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricAndWeight__MetricAssignment_1"


    // $ANTLR start "rule__MetricAndWeight__WeightAssignment_3"
    // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3200:1: rule__MetricAndWeight__WeightAssignment_3 : ( ( ruleMYID ) ) ;
    public final void rule__MetricAndWeight__WeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3204:1: ( ( ( ruleMYID ) ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3205:1: ( ( ruleMYID ) )
            {
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3205:1: ( ( ruleMYID ) )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3206:1: ( ruleMYID )
            {
             before(grammarAccess.getMetricAndWeightAccess().getWeightNumberCrossReference_3_0()); 
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3207:1: ( ruleMYID )
            // ../org.somox.metrics.dsl.ui/src-gen/org/somox/metrics/dsl/ui/contentassist/antlr/internal/InternalMetricDSL.g:3208:1: ruleMYID
            {
             before(grammarAccess.getMetricAndWeightAccess().getWeightNumberMYIDParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleMYID_in_rule__MetricAndWeight__WeightAssignment_36346);
            ruleMYID();

            state._fsp--;

             after(grammarAccess.getMetricAndWeightAccess().getWeightNumberMYIDParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMetricAndWeightAccess().getWeightNumberCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricAndWeight__WeightAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMetricModel_in_entryRuleMetricModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricModel__Group__0_in_ruleMetricModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalMetric_in_entryRuleExternalMetric123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalMetric130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalMetric__NameAssignment_in_ruleExternalMetric156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalMetric_in_entryRuleInternalMetric183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalMetric190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__0_in_ruleInternalMetric216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_ruleNumber276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricDefinition_in_entryRuleMetricDefinition423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricDefinition430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricDefinition__Alternatives_in_ruleMetricDefinition456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeightedMetric_in_entryRuleWeightedMetric483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeightedMetric490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeightedMetric__Group__0_in_ruleWeightedMetric516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepwiseMetric_in_entryRuleStepwiseMetric543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepwiseMetric550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepwiseMetric__Group__0_in_ruleStepwiseMetric576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRatioMetric_in_entryRuleRatioMetric603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRatioMetric610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RatioMetric__Group__0_in_ruleRatioMetric636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoundAndWeight_in_entryRuleBoundAndWeight663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoundAndWeight670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoundAndWeight__Group__0_in_ruleBoundAndWeight696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricAndWeight_in_entryRuleMetricAndWeight723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricAndWeight730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricAndWeight__Group__0_in_ruleMetricAndWeight756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMYID_in_entryRuleMYID783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMYID790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MYID__Group__0_in_ruleMYID816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Number__Alternatives853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__Number__Alternatives870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeightedMetric_in_rule__MetricDefinition__Alternatives902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepwiseMetric_in_rule__MetricDefinition__Alternatives919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRatioMetric_in_rule__MetricDefinition__Alternatives936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricModel__Group__0__Impl_in_rule__MetricModel__Group__0966 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_rule__MetricModel__Group__1_in_rule__MetricModel__Group__0969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricModel__Group_0__0_in_rule__MetricModel__Group__0__Impl996 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__MetricModel__Group__1__Impl_in_rule__MetricModel__Group__11027 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_rule__MetricModel__Group__2_in_rule__MetricModel__Group__11030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricModel__Group_1__0_in_rule__MetricModel__Group__1__Impl1057 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__MetricModel__Group__2__Impl_in_rule__MetricModel__Group__21088 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MetricModel__Group__3_in_rule__MetricModel__Group__21091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MetricModel__Group__2__Impl1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricModel__Group__3__Impl_in_rule__MetricModel__Group__31150 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__MetricModel__Group__4_in_rule__MetricModel__Group__31153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MetricModel__Group__3__Impl1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricModel__Group__4__Impl_in_rule__MetricModel__Group__41212 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MetricModel__Group__5_in_rule__MetricModel__Group__41215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricModel__MetricsAssignment_4_in_rule__MetricModel__Group__4__Impl1244 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__MetricModel__MetricsAssignment_4_in_rule__MetricModel__Group__4__Impl1256 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__MetricModel__Group__5__Impl_in_rule__MetricModel__Group__51289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MetricModel__Group__5__Impl1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricModel__Group_0__0__Impl_in_rule__MetricModel__Group_0__01360 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetricModel__Group_0__1_in_rule__MetricModel__Group_0__01363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MetricModel__Group_0__0__Impl1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricModel__Group_0__1__Impl_in_rule__MetricModel__Group_0__11422 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__MetricModel__Group_0__2_in_rule__MetricModel__Group_0__11425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricModel__ImportURIAssignment_0_1_in_rule__MetricModel__Group_0__1__Impl1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricModel__Group_0__2__Impl_in_rule__MetricModel__Group_0__21482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MetricModel__Group_0__2__Impl1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricModel__Group_1__0__Impl_in_rule__MetricModel__Group_1__01547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetricModel__Group_1__1_in_rule__MetricModel__Group_1__01550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MetricModel__Group_1__0__Impl1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricModel__Group_1__1__Impl_in_rule__MetricModel__Group_1__11609 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__MetricModel__Group_1__2_in_rule__MetricModel__Group_1__11612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricModel__MetricsAssignment_1_1_in_rule__MetricModel__Group_1__1__Impl1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricModel__Group_1__2__Impl_in_rule__MetricModel__Group_1__21669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MetricModel__Group_1__2__Impl1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__0__Impl_in_rule__InternalMetric__Group__01734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__1_in_rule__InternalMetric__Group__01737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__InternalMetric__Group__0__Impl1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__1__Impl_in_rule__InternalMetric__Group__11796 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__2_in_rule__InternalMetric__Group__11799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__NameAssignment_1_in_rule__InternalMetric__Group__1__Impl1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__2__Impl_in_rule__InternalMetric__Group__21856 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__3_in_rule__InternalMetric__Group__21859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__InternalMetric__Group__2__Impl1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__3__Impl_in_rule__InternalMetric__Group__31918 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__4_in_rule__InternalMetric__Group__31921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__ShortNameAssignment_3_in_rule__InternalMetric__Group__3__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__4__Impl_in_rule__InternalMetric__Group__41978 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__5_in_rule__InternalMetric__Group__41981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__InternalMetric__Group__4__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__5__Impl_in_rule__InternalMetric__Group__52040 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__6_in_rule__InternalMetric__Group__52043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__DescriptionAssignment_5_in_rule__InternalMetric__Group__5__Impl2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__6__Impl_in_rule__InternalMetric__Group__62100 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__7_in_rule__InternalMetric__Group__62103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__InternalMetric__Group__6__Impl2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__7__Impl_in_rule__InternalMetric__Group__72162 = new BitSet(new long[]{0x0000000098800000L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__8_in_rule__InternalMetric__Group__72165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__InternalMetric__Group__7__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__8__Impl_in_rule__InternalMetric__Group__82224 = new BitSet(new long[]{0x0000000098800000L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__9_in_rule__InternalMetric__Group__82227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group_8__0_in_rule__InternalMetric__Group__8__Impl2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__9__Impl_in_rule__InternalMetric__Group__92285 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__10_in_rule__InternalMetric__Group__92288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__DefinitionAssignment_9_in_rule__InternalMetric__Group__9__Impl2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group__10__Impl_in_rule__InternalMetric__Group__102345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__InternalMetric__Group__10__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group_8__0__Impl_in_rule__InternalMetric__Group_8__02426 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group_8__1_in_rule__InternalMetric__Group_8__02429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__InternalMetric__Group_8__0__Impl2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group_8__1__Impl_in_rule__InternalMetric__Group_8__12488 = new BitSet(new long[]{0x0000000003004000L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group_8__2_in_rule__InternalMetric__Group_8__12491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__InternalMetric__Group_8__1__Impl2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group_8__2__Impl_in_rule__InternalMetric__Group_8__22550 = new BitSet(new long[]{0x0000000003004000L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group_8__3_in_rule__InternalMetric__Group_8__22553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__ParameterAssignment_8_2_in_rule__InternalMetric__Group_8__2__Impl2580 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__InternalMetric__Group_8__3__Impl_in_rule__InternalMetric__Group_8__32611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__InternalMetric__Group_8__3__Impl2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Parameter__Group__0__Impl2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12740 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__12743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22800 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__22803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Parameter__Group__2__Impl2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__32862 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__4_in_rule__Parameter__Group__32865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ShortnameAssignment_3_in_rule__Parameter__Group__3__Impl2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__4__Impl_in_rule__Parameter__Group__42922 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__5_in_rule__Parameter__Group__42925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Parameter__Group__4__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__5__Impl_in_rule__Parameter__Group__52984 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__6_in_rule__Parameter__Group__52987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__DescriptionAssignment_5_in_rule__Parameter__Group__5__Impl3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__6__Impl_in_rule__Parameter__Group__63044 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Parameter__Group__7_in_rule__Parameter__Group__63047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Parameter__Group__6__Impl3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__7__Impl_in_rule__Parameter__Group__73106 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__8_in_rule__Parameter__Group__73109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__DefaultValueAssignment_7_in_rule__Parameter__Group__7__Impl3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__8__Impl_in_rule__Parameter__Group__83166 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__9_in_rule__Parameter__Group__83169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Parameter__Group__8__Impl3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__9__Impl_in_rule__Parameter__Group__93228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Parameter__Group__9__Impl3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__03307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__03310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Constant__Group__0__Impl3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__13369 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__13372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__23429 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__23432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Constant__Group__2__Impl3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__33491 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__33494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ValueAssignment_3_in_rule__Constant__Group__3__Impl3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__43551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Constant__Group__4__Impl3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeightedMetric__Group__0__Impl_in_rule__WeightedMetric__Group__03620 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__WeightedMetric__Group__1_in_rule__WeightedMetric__Group__03623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__WeightedMetric__Group__0__Impl3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeightedMetric__Group__1__Impl_in_rule__WeightedMetric__Group__13682 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__WeightedMetric__Group__2_in_rule__WeightedMetric__Group__13685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__WeightedMetric__Group__1__Impl3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeightedMetric__Group__2__Impl_in_rule__WeightedMetric__Group__23744 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__WeightedMetric__Group__3_in_rule__WeightedMetric__Group__23747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeightedMetric__WeightsAssignment_2_in_rule__WeightedMetric__Group__2__Impl3776 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__WeightedMetric__WeightsAssignment_2_in_rule__WeightedMetric__Group__2__Impl3788 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__WeightedMetric__Group__3__Impl_in_rule__WeightedMetric__Group__33821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__WeightedMetric__Group__3__Impl3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepwiseMetric__Group__0__Impl_in_rule__StepwiseMetric__Group__03888 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__StepwiseMetric__Group__1_in_rule__StepwiseMetric__Group__03891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StepwiseMetric__Group__0__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepwiseMetric__Group__1__Impl_in_rule__StepwiseMetric__Group__13950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StepwiseMetric__Group__2_in_rule__StepwiseMetric__Group__13953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__StepwiseMetric__Group__1__Impl3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepwiseMetric__Group__2__Impl_in_rule__StepwiseMetric__Group__24012 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__StepwiseMetric__Group__3_in_rule__StepwiseMetric__Group__24015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepwiseMetric__InnerMetricAssignment_2_in_rule__StepwiseMetric__Group__2__Impl4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepwiseMetric__Group__3__Impl_in_rule__StepwiseMetric__Group__34072 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__StepwiseMetric__Group__4_in_rule__StepwiseMetric__Group__34075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StepwiseMetric__Group__3__Impl4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepwiseMetric__Group__4__Impl_in_rule__StepwiseMetric__Group__44134 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_rule__StepwiseMetric__Group__5_in_rule__StepwiseMetric__Group__44137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StepwiseMetric__Group__4__Impl4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepwiseMetric__Group__5__Impl_in_rule__StepwiseMetric__Group__54196 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_rule__StepwiseMetric__Group__6_in_rule__StepwiseMetric__Group__54199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StepwiseMetric__StepsAssignment_5_in_rule__StepwiseMetric__Group__5__Impl4226 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__StepwiseMetric__Group__6__Impl_in_rule__StepwiseMetric__Group__64257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StepwiseMetric__Group__6__Impl4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RatioMetric__Group__0__Impl_in_rule__RatioMetric__Group__04330 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__RatioMetric__Group__1_in_rule__RatioMetric__Group__04333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RatioMetric__Group__0__Impl4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RatioMetric__Group__1__Impl_in_rule__RatioMetric__Group__14392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RatioMetric__Group__2_in_rule__RatioMetric__Group__14395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RatioMetric__Group__1__Impl4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RatioMetric__Group__2__Impl_in_rule__RatioMetric__Group__24454 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__RatioMetric__Group__3_in_rule__RatioMetric__Group__24457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RatioMetric__NominatorMetricAssignment_2_in_rule__RatioMetric__Group__2__Impl4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RatioMetric__Group__3__Impl_in_rule__RatioMetric__Group__34514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RatioMetric__Group__4_in_rule__RatioMetric__Group__34517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RatioMetric__Group__3__Impl4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RatioMetric__Group__4__Impl_in_rule__RatioMetric__Group__44576 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__RatioMetric__Group__5_in_rule__RatioMetric__Group__44579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RatioMetric__DenominatorMetricAssignment_4_in_rule__RatioMetric__Group__4__Impl4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RatioMetric__Group__5__Impl_in_rule__RatioMetric__Group__54636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RatioMetric__Group__5__Impl4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoundAndWeight__Group__0__Impl_in_rule__BoundAndWeight__Group__04707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BoundAndWeight__Group__1_in_rule__BoundAndWeight__Group__04710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__BoundAndWeight__Group__0__Impl4738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoundAndWeight__Group__1__Impl_in_rule__BoundAndWeight__Group__14769 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BoundAndWeight__Group__2_in_rule__BoundAndWeight__Group__14772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoundAndWeight__UpperBoundAssignment_1_in_rule__BoundAndWeight__Group__1__Impl4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoundAndWeight__Group__2__Impl_in_rule__BoundAndWeight__Group__24829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BoundAndWeight__Group__3_in_rule__BoundAndWeight__Group__24832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BoundAndWeight__Group__2__Impl4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoundAndWeight__Group__3__Impl_in_rule__BoundAndWeight__Group__34891 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__BoundAndWeight__Group__4_in_rule__BoundAndWeight__Group__34894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoundAndWeight__WeightAssignment_3_in_rule__BoundAndWeight__Group__3__Impl4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoundAndWeight__Group__4__Impl_in_rule__BoundAndWeight__Group__44951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__BoundAndWeight__Group__4__Impl4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricAndWeight__Group__0__Impl_in_rule__MetricAndWeight__Group__05020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetricAndWeight__Group__1_in_rule__MetricAndWeight__Group__05023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MetricAndWeight__Group__0__Impl5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricAndWeight__Group__1__Impl_in_rule__MetricAndWeight__Group__15082 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MetricAndWeight__Group__2_in_rule__MetricAndWeight__Group__15085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricAndWeight__MetricAssignment_1_in_rule__MetricAndWeight__Group__1__Impl5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricAndWeight__Group__2__Impl_in_rule__MetricAndWeight__Group__25142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetricAndWeight__Group__3_in_rule__MetricAndWeight__Group__25145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MetricAndWeight__Group__2__Impl5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricAndWeight__Group__3__Impl_in_rule__MetricAndWeight__Group__35204 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__MetricAndWeight__Group__4_in_rule__MetricAndWeight__Group__35207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricAndWeight__WeightAssignment_3_in_rule__MetricAndWeight__Group__3__Impl5234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricAndWeight__Group__4__Impl_in_rule__MetricAndWeight__Group__45264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MetricAndWeight__Group__4__Impl5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MYID__Group__0__Impl_in_rule__MYID__Group__05333 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__MYID__Group__1_in_rule__MYID__Group__05336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MYID__Group__0__Impl5363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MYID__Group__1__Impl_in_rule__MYID__Group__15392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MYID__Group_1__0_in_rule__MYID__Group__1__Impl5419 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__MYID__Group_1__0__Impl_in_rule__MYID__Group_1__05454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MYID__Group_1__1_in_rule__MYID__Group_1__05457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MYID__Group_1__0__Impl5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MYID__Group_1__1__Impl_in_rule__MYID__Group_1__15516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MYID__Group_1__1__Impl5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MetricModel__ImportURIAssignment_0_15581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalMetric_in_rule__MetricModel__MetricsAssignment_1_15612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalMetric_in_rule__MetricModel__MetricsAssignment_45643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMYID_in_rule__ExternalMetric__NameAssignment5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMYID_in_rule__InternalMetric__NameAssignment_15705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InternalMetric__ShortNameAssignment_35736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InternalMetric__DescriptionAssignment_55767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__InternalMetric__ParameterAssignment_8_25798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricDefinition_in_rule__InternalMetric__DefinitionAssignment_95829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMYID_in_rule__Parameter__NameAssignment_15860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Parameter__ShortnameAssignment_35891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Parameter__DescriptionAssignment_55922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Parameter__DefaultValueAssignment_75953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMYID_in_rule__Constant__NameAssignment_15984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Constant__ValueAssignment_36015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricAndWeight_in_rule__WeightedMetric__WeightsAssignment_26046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMYID_in_rule__StepwiseMetric__InnerMetricAssignment_26081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoundAndWeight_in_rule__StepwiseMetric__StepsAssignment_56116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMYID_in_rule__RatioMetric__NominatorMetricAssignment_26151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMYID_in_rule__RatioMetric__DenominatorMetricAssignment_46190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMYID_in_rule__BoundAndWeight__UpperBoundAssignment_16229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMYID_in_rule__BoundAndWeight__WeightAssignment_36268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMYID_in_rule__MetricAndWeight__MetricAssignment_16307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMYID_in_rule__MetricAndWeight__WeightAssignment_36346 = new BitSet(new long[]{0x0000000000000002L});

}