package de.wbg.ui.contentassist.antlr.internal; 

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
import de.wbg.services.DTDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDTDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'javaObject'", "'string'", "'int'", "'float'", "'String'", "'parserName'", "'='", "';'", "'parserType'", "'import'", "'beginWith'", "':'", "'{'", "'}'", "'hasAttribute'", "'ofType'", "'as'", "'hasNext'", "'java'", "'('", "')'", "'*'", "'|'", "'?'", "'Key'", "'Value'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDTDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDTDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDTDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g"; }


     
     	private DTDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DTDSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDTDSL"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:60:1: entryRuleDTDSL : ruleDTDSL EOF ;
    public final void entryRuleDTDSL() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:61:1: ( ruleDTDSL EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:62:1: ruleDTDSL EOF
            {
             before(grammarAccess.getDTDSLRule()); 
            pushFollow(FOLLOW_ruleDTDSL_in_entryRuleDTDSL61);
            ruleDTDSL();

            state._fsp--;

             after(grammarAccess.getDTDSLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDTDSL68); 

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
    // $ANTLR end "entryRuleDTDSL"


    // $ANTLR start "ruleDTDSL"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:69:1: ruleDTDSL : ( ( rule__DTDSL__Group__0 ) ) ;
    public final void ruleDTDSL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:73:2: ( ( ( rule__DTDSL__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:74:1: ( ( rule__DTDSL__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:74:1: ( ( rule__DTDSL__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:75:1: ( rule__DTDSL__Group__0 )
            {
             before(grammarAccess.getDTDSLAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:76:1: ( rule__DTDSL__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:76:2: rule__DTDSL__Group__0
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__0_in_ruleDTDSL94);
            rule__DTDSL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDTDSLAccess().getGroup()); 

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
    // $ANTLR end "ruleDTDSL"


    // $ANTLR start "entryRuleimportStatement"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:88:1: entryRuleimportStatement : ruleimportStatement EOF ;
    public final void entryRuleimportStatement() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:89:1: ( ruleimportStatement EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:90:1: ruleimportStatement EOF
            {
             before(grammarAccess.getImportStatementRule()); 
            pushFollow(FOLLOW_ruleimportStatement_in_entryRuleimportStatement121);
            ruleimportStatement();

            state._fsp--;

             after(grammarAccess.getImportStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleimportStatement128); 

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
    // $ANTLR end "entryRuleimportStatement"


    // $ANTLR start "ruleimportStatement"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:97:1: ruleimportStatement : ( ( rule__ImportStatement__Group__0 ) ) ;
    public final void ruleimportStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:101:2: ( ( ( rule__ImportStatement__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:102:1: ( ( rule__ImportStatement__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:102:1: ( ( rule__ImportStatement__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:103:1: ( rule__ImportStatement__Group__0 )
            {
             before(grammarAccess.getImportStatementAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:104:1: ( rule__ImportStatement__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:104:2: rule__ImportStatement__Group__0
            {
            pushFollow(FOLLOW_rule__ImportStatement__Group__0_in_ruleimportStatement154);
            rule__ImportStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleimportStatement"


    // $ANTLR start "entryRuleStartPoint"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:116:1: entryRuleStartPoint : ruleStartPoint EOF ;
    public final void entryRuleStartPoint() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:117:1: ( ruleStartPoint EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:118:1: ruleStartPoint EOF
            {
             before(grammarAccess.getStartPointRule()); 
            pushFollow(FOLLOW_ruleStartPoint_in_entryRuleStartPoint181);
            ruleStartPoint();

            state._fsp--;

             after(grammarAccess.getStartPointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartPoint188); 

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
    // $ANTLR end "entryRuleStartPoint"


    // $ANTLR start "ruleStartPoint"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:125:1: ruleStartPoint : ( ( rule__StartPoint__Group__0 ) ) ;
    public final void ruleStartPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:129:2: ( ( ( rule__StartPoint__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:130:1: ( ( rule__StartPoint__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:130:1: ( ( rule__StartPoint__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:131:1: ( rule__StartPoint__Group__0 )
            {
             before(grammarAccess.getStartPointAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:132:1: ( rule__StartPoint__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:132:2: rule__StartPoint__Group__0
            {
            pushFollow(FOLLOW_rule__StartPoint__Group__0_in_ruleStartPoint214);
            rule__StartPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartPointAccess().getGroup()); 

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
    // $ANTLR end "ruleStartPoint"


    // $ANTLR start "entryRuleAbstract"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:144:1: entryRuleAbstract : ruleAbstract EOF ;
    public final void entryRuleAbstract() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:145:1: ( ruleAbstract EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:146:1: ruleAbstract EOF
            {
             before(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract241);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getAbstractRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract248); 

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
    // $ANTLR end "entryRuleAbstract"


    // $ANTLR start "ruleAbstract"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:153:1: ruleAbstract : ( ( rule__Abstract__Alternatives ) ) ;
    public final void ruleAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:157:2: ( ( ( rule__Abstract__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:158:1: ( ( rule__Abstract__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:158:1: ( ( rule__Abstract__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:159:1: ( rule__Abstract__Alternatives )
            {
             before(grammarAccess.getAbstractAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:160:1: ( rule__Abstract__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:160:2: rule__Abstract__Alternatives
            {
            pushFollow(FOLLOW_rule__Abstract__Alternatives_in_ruleAbstract274);
            rule__Abstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstract"


    // $ANTLR start "entryRuleObjectDescription"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:172:1: entryRuleObjectDescription : ruleObjectDescription EOF ;
    public final void entryRuleObjectDescription() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:173:1: ( ruleObjectDescription EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:174:1: ruleObjectDescription EOF
            {
             before(grammarAccess.getObjectDescriptionRule()); 
            pushFollow(FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription301);
            ruleObjectDescription();

            state._fsp--;

             after(grammarAccess.getObjectDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescription308); 

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
    // $ANTLR end "entryRuleObjectDescription"


    // $ANTLR start "ruleObjectDescription"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:181:1: ruleObjectDescription : ( ( rule__ObjectDescription__Group__0 ) ) ;
    public final void ruleObjectDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:185:2: ( ( ( rule__ObjectDescription__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:186:1: ( ( rule__ObjectDescription__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:186:1: ( ( rule__ObjectDescription__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:187:1: ( rule__ObjectDescription__Group__0 )
            {
             before(grammarAccess.getObjectDescriptionAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:188:1: ( rule__ObjectDescription__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:188:2: rule__ObjectDescription__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__0_in_ruleObjectDescription334);
            rule__ObjectDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectDescriptionAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectDescription"


    // $ANTLR start "entryRuleObjectDescriptionInner"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:200:1: entryRuleObjectDescriptionInner : ruleObjectDescriptionInner EOF ;
    public final void entryRuleObjectDescriptionInner() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:201:1: ( ruleObjectDescriptionInner EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:202:1: ruleObjectDescriptionInner EOF
            {
             before(grammarAccess.getObjectDescriptionInnerRule()); 
            pushFollow(FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner361);
            ruleObjectDescriptionInner();

            state._fsp--;

             after(grammarAccess.getObjectDescriptionInnerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescriptionInner368); 

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
    // $ANTLR end "entryRuleObjectDescriptionInner"


    // $ANTLR start "ruleObjectDescriptionInner"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:209:1: ruleObjectDescriptionInner : ( ( rule__ObjectDescriptionInner__Alternatives ) ) ;
    public final void ruleObjectDescriptionInner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:213:2: ( ( ( rule__ObjectDescriptionInner__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:214:1: ( ( rule__ObjectDescriptionInner__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:214:1: ( ( rule__ObjectDescriptionInner__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:215:1: ( rule__ObjectDescriptionInner__Alternatives )
            {
             before(grammarAccess.getObjectDescriptionInnerAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:216:1: ( rule__ObjectDescriptionInner__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:216:2: rule__ObjectDescriptionInner__Alternatives
            {
            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Alternatives_in_ruleObjectDescriptionInner394);
            rule__ObjectDescriptionInner__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjectDescriptionInnerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleObjectDescriptionInner"


    // $ANTLR start "entryRuleObjectAttribute"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:228:1: entryRuleObjectAttribute : ruleObjectAttribute EOF ;
    public final void entryRuleObjectAttribute() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:229:1: ( ruleObjectAttribute EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:230:1: ruleObjectAttribute EOF
            {
             before(grammarAccess.getObjectAttributeRule()); 
            pushFollow(FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute421);
            ruleObjectAttribute();

            state._fsp--;

             after(grammarAccess.getObjectAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectAttribute428); 

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
    // $ANTLR end "entryRuleObjectAttribute"


    // $ANTLR start "ruleObjectAttribute"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:237:1: ruleObjectAttribute : ( ( rule__ObjectAttribute__Group__0 ) ) ;
    public final void ruleObjectAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:241:2: ( ( ( rule__ObjectAttribute__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:242:1: ( ( rule__ObjectAttribute__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:242:1: ( ( rule__ObjectAttribute__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:243:1: ( rule__ObjectAttribute__Group__0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:244:1: ( rule__ObjectAttribute__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:244:2: rule__ObjectAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__0_in_ruleObjectAttribute454);
            rule__ObjectAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectAttribute"


    // $ANTLR start "entryRuleObjectNext"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:256:1: entryRuleObjectNext : ruleObjectNext EOF ;
    public final void entryRuleObjectNext() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:257:1: ( ruleObjectNext EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:258:1: ruleObjectNext EOF
            {
             before(grammarAccess.getObjectNextRule()); 
            pushFollow(FOLLOW_ruleObjectNext_in_entryRuleObjectNext481);
            ruleObjectNext();

            state._fsp--;

             after(grammarAccess.getObjectNextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectNext488); 

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
    // $ANTLR end "entryRuleObjectNext"


    // $ANTLR start "ruleObjectNext"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:265:1: ruleObjectNext : ( ( rule__ObjectNext__Group__0 ) ) ;
    public final void ruleObjectNext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:269:2: ( ( ( rule__ObjectNext__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:270:1: ( ( rule__ObjectNext__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:270:1: ( ( rule__ObjectNext__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:271:1: ( rule__ObjectNext__Group__0 )
            {
             before(grammarAccess.getObjectNextAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:272:1: ( rule__ObjectNext__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:272:2: rule__ObjectNext__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__0_in_ruleObjectNext514);
            rule__ObjectNext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectNextAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectNext"


    // $ANTLR start "entryRuleJavaCodeOrID"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:284:1: entryRuleJavaCodeOrID : ruleJavaCodeOrID EOF ;
    public final void entryRuleJavaCodeOrID() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:285:1: ( ruleJavaCodeOrID EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:286:1: ruleJavaCodeOrID EOF
            {
             before(grammarAccess.getJavaCodeOrIDRule()); 
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID541);
            ruleJavaCodeOrID();

            state._fsp--;

             after(grammarAccess.getJavaCodeOrIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaCodeOrID548); 

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
    // $ANTLR end "entryRuleJavaCodeOrID"


    // $ANTLR start "ruleJavaCodeOrID"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:293:1: ruleJavaCodeOrID : ( ( rule__JavaCodeOrID__Alternatives ) ) ;
    public final void ruleJavaCodeOrID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:297:2: ( ( ( rule__JavaCodeOrID__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:298:1: ( ( rule__JavaCodeOrID__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:298:1: ( ( rule__JavaCodeOrID__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:299:1: ( rule__JavaCodeOrID__Alternatives )
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:300:1: ( rule__JavaCodeOrID__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:300:2: rule__JavaCodeOrID__Alternatives
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Alternatives_in_ruleJavaCodeOrID574);
            rule__JavaCodeOrID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJavaCodeOrIDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleJavaCodeOrID"


    // $ANTLR start "entryRuleType"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:312:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:313:1: ( ruleType EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:314:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType601);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType608); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:321:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:325:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:326:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:326:1: ( ( rule__Type__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:327:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:328:1: ( rule__Type__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:328:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType634);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleMany"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:340:1: entryRuleMany : ruleMany EOF ;
    public final void entryRuleMany() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:341:1: ( ruleMany EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:342:1: ruleMany EOF
            {
             before(grammarAccess.getManyRule()); 
            pushFollow(FOLLOW_ruleMany_in_entryRuleMany661);
            ruleMany();

            state._fsp--;

             after(grammarAccess.getManyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMany668); 

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
    // $ANTLR end "entryRuleMany"


    // $ANTLR start "ruleMany"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:349:1: ruleMany : ( ( rule__Many__Group__0 ) ) ;
    public final void ruleMany() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:353:2: ( ( ( rule__Many__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:354:1: ( ( rule__Many__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:354:1: ( ( rule__Many__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:355:1: ( rule__Many__Group__0 )
            {
             before(grammarAccess.getManyAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:356:1: ( rule__Many__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:356:2: rule__Many__Group__0
            {
            pushFollow(FOLLOW_rule__Many__Group__0_in_ruleMany694);
            rule__Many__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManyAccess().getGroup()); 

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
    // $ANTLR end "ruleMany"


    // $ANTLR start "entryRuleChoice"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:368:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:369:1: ( ruleChoice EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:370:1: ruleChoice EOF
            {
             before(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice721);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getChoiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice728); 

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
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:377:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:381:2: ( ( ( rule__Choice__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:382:1: ( ( rule__Choice__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:382:1: ( ( rule__Choice__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:383:1: ( rule__Choice__Group__0 )
            {
             before(grammarAccess.getChoiceAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:384:1: ( rule__Choice__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:384:2: rule__Choice__Group__0
            {
            pushFollow(FOLLOW_rule__Choice__Group__0_in_ruleChoice754);
            rule__Choice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getGroup()); 

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
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleObjectMaybe"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:396:1: entryRuleObjectMaybe : ruleObjectMaybe EOF ;
    public final void entryRuleObjectMaybe() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:397:1: ( ruleObjectMaybe EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:398:1: ruleObjectMaybe EOF
            {
             before(grammarAccess.getObjectMaybeRule()); 
            pushFollow(FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe781);
            ruleObjectMaybe();

            state._fsp--;

             after(grammarAccess.getObjectMaybeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMaybe788); 

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
    // $ANTLR end "entryRuleObjectMaybe"


    // $ANTLR start "ruleObjectMaybe"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:405:1: ruleObjectMaybe : ( ( rule__ObjectMaybe__Alternatives ) ) ;
    public final void ruleObjectMaybe() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:409:2: ( ( ( rule__ObjectMaybe__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:410:1: ( ( rule__ObjectMaybe__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:410:1: ( ( rule__ObjectMaybe__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:411:1: ( rule__ObjectMaybe__Alternatives )
            {
             before(grammarAccess.getObjectMaybeAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:412:1: ( rule__ObjectMaybe__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:412:2: rule__ObjectMaybe__Alternatives
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Alternatives_in_ruleObjectMaybe814);
            rule__ObjectMaybe__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjectMaybeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleObjectMaybe"


    // $ANTLR start "entryRuleKeyword"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:424:1: entryRuleKeyword : ruleKeyword EOF ;
    public final void entryRuleKeyword() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:425:1: ( ruleKeyword EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:426:1: ruleKeyword EOF
            {
             before(grammarAccess.getKeywordRule()); 
            pushFollow(FOLLOW_ruleKeyword_in_entryRuleKeyword841);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getKeywordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyword848); 

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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:433:1: ruleKeyword : ( ( rule__Keyword__Alternatives ) ) ;
    public final void ruleKeyword() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:437:2: ( ( ( rule__Keyword__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:438:1: ( ( rule__Keyword__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:438:1: ( ( rule__Keyword__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:439:1: ( rule__Keyword__Alternatives )
            {
             before(grammarAccess.getKeywordAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:440:1: ( rule__Keyword__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:440:2: rule__Keyword__Alternatives
            {
            pushFollow(FOLLOW_rule__Keyword__Alternatives_in_ruleKeyword874);
            rule__Keyword__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKeywordAccess().getAlternatives()); 

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
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "rule__DTDSL__TypeAlternatives_6_0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:452:1: rule__DTDSL__TypeAlternatives_6_0 : ( ( 'javaObject' ) | ( 'string' ) );
    public final void rule__DTDSL__TypeAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:456:1: ( ( 'javaObject' ) | ( 'string' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:457:1: ( 'javaObject' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:457:1: ( 'javaObject' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:458:1: 'javaObject'
                    {
                     before(grammarAccess.getDTDSLAccess().getTypeJavaObjectKeyword_6_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__DTDSL__TypeAlternatives_6_0911); 
                     after(grammarAccess.getDTDSLAccess().getTypeJavaObjectKeyword_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:465:6: ( 'string' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:465:6: ( 'string' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:466:1: 'string'
                    {
                     before(grammarAccess.getDTDSLAccess().getTypeStringKeyword_6_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__DTDSL__TypeAlternatives_6_0931); 
                     after(grammarAccess.getDTDSLAccess().getTypeStringKeyword_6_0_1()); 

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
    // $ANTLR end "rule__DTDSL__TypeAlternatives_6_0"


    // $ANTLR start "rule__Abstract__Alternatives"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:478:1: rule__Abstract__Alternatives : ( ( ruleObjectDescription ) | ( ruleChoice ) | ( ruleMany ) );
    public final void rule__Abstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:482:1: ( ( ruleObjectDescription ) | ( ruleChoice ) | ( ruleMany ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==30) ) {
                switch ( input.LA(2) ) {
                case 25:
                case 28:
                case 30:
                    {
                    alt2=3;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==31) ) {
                        int LA2_6 = input.LA(4);

                        if ( (LA2_6==EOF||LA2_6==RULE_ID||LA2_6==21||(LA2_6>=24 && LA2_6<=25)||LA2_6==28||(LA2_6>=30 && LA2_6<=31)) ) {
                            alt2=2;
                        }
                        else if ( (LA2_6==34) ) {
                            alt2=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 6, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA2_4==33) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 35:
                case 36:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:483:1: ( ruleObjectDescription )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:483:1: ( ruleObjectDescription )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:484:1: ruleObjectDescription
                    {
                     before(grammarAccess.getAbstractAccess().getObjectDescriptionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleObjectDescription_in_rule__Abstract__Alternatives965);
                    ruleObjectDescription();

                    state._fsp--;

                     after(grammarAccess.getAbstractAccess().getObjectDescriptionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:489:6: ( ruleChoice )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:489:6: ( ruleChoice )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:490:1: ruleChoice
                    {
                     before(grammarAccess.getAbstractAccess().getChoiceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleChoice_in_rule__Abstract__Alternatives982);
                    ruleChoice();

                    state._fsp--;

                     after(grammarAccess.getAbstractAccess().getChoiceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:495:6: ( ruleMany )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:495:6: ( ruleMany )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:496:1: ruleMany
                    {
                     before(grammarAccess.getAbstractAccess().getManyParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMany_in_rule__Abstract__Alternatives999);
                    ruleMany();

                    state._fsp--;

                     after(grammarAccess.getAbstractAccess().getManyParserRuleCall_2()); 

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
    // $ANTLR end "rule__Abstract__Alternatives"


    // $ANTLR start "rule__ObjectDescriptionInner__Alternatives"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:506:1: rule__ObjectDescriptionInner__Alternatives : ( ( ruleObjectAttribute ) | ( ruleObjectNext ) | ( ruleObjectMaybe ) );
    public final void rule__ObjectDescriptionInner__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:510:1: ( ( ruleObjectAttribute ) | ( ruleObjectNext ) | ( ruleObjectMaybe ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
            case 30:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:511:1: ( ruleObjectAttribute )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:511:1: ( ruleObjectAttribute )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:512:1: ruleObjectAttribute
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleObjectAttribute_in_rule__ObjectDescriptionInner__Alternatives1031);
                    ruleObjectAttribute();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:517:6: ( ruleObjectNext )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:517:6: ( ruleObjectNext )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:518:1: ruleObjectNext
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectNextParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleObjectNext_in_rule__ObjectDescriptionInner__Alternatives1048);
                    ruleObjectNext();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectNextParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:523:6: ( ruleObjectMaybe )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:523:6: ( ruleObjectMaybe )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:524:1: ruleObjectMaybe
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectMaybeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleObjectMaybe_in_rule__ObjectDescriptionInner__Alternatives1065);
                    ruleObjectMaybe();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectMaybeParserRuleCall_2()); 

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
    // $ANTLR end "rule__ObjectDescriptionInner__Alternatives"


    // $ANTLR start "rule__ObjectAttribute__Alternatives_3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:534:1: rule__ObjectAttribute__Alternatives_3 : ( ( ( rule__ObjectAttribute__Group_3_0__0 ) ) | ( ( rule__ObjectAttribute__InnerAssignment_3_1 ) ) );
    public final void rule__ObjectAttribute__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:538:1: ( ( ( rule__ObjectAttribute__Group_3_0__0 ) ) | ( ( rule__ObjectAttribute__InnerAssignment_3_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=13 && LA4_0<=15)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:539:1: ( ( rule__ObjectAttribute__Group_3_0__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:539:1: ( ( rule__ObjectAttribute__Group_3_0__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:540:1: ( rule__ObjectAttribute__Group_3_0__0 )
                    {
                     before(grammarAccess.getObjectAttributeAccess().getGroup_3_0()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:541:1: ( rule__ObjectAttribute__Group_3_0__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:541:2: rule__ObjectAttribute__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__ObjectAttribute__Group_3_0__0_in_rule__ObjectAttribute__Alternatives_31097);
                    rule__ObjectAttribute__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAttributeAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:545:6: ( ( rule__ObjectAttribute__InnerAssignment_3_1 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:545:6: ( ( rule__ObjectAttribute__InnerAssignment_3_1 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:546:1: ( rule__ObjectAttribute__InnerAssignment_3_1 )
                    {
                     before(grammarAccess.getObjectAttributeAccess().getInnerAssignment_3_1()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:547:1: ( rule__ObjectAttribute__InnerAssignment_3_1 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:547:2: rule__ObjectAttribute__InnerAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__ObjectAttribute__InnerAssignment_3_1_in_rule__ObjectAttribute__Alternatives_31115);
                    rule__ObjectAttribute__InnerAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAttributeAccess().getInnerAssignment_3_1()); 

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
    // $ANTLR end "rule__ObjectAttribute__Alternatives_3"


    // $ANTLR start "rule__JavaCodeOrID__Alternatives"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:556:1: rule__JavaCodeOrID__Alternatives : ( ( ( rule__JavaCodeOrID__Group_0__0 ) ) | ( ( rule__JavaCodeOrID__IdAssignment_1 ) ) );
    public final void rule__JavaCodeOrID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:560:1: ( ( ( rule__JavaCodeOrID__Group_0__0 ) ) | ( ( rule__JavaCodeOrID__IdAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:561:1: ( ( rule__JavaCodeOrID__Group_0__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:561:1: ( ( rule__JavaCodeOrID__Group_0__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:562:1: ( rule__JavaCodeOrID__Group_0__0 )
                    {
                     before(grammarAccess.getJavaCodeOrIDAccess().getGroup_0()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:563:1: ( rule__JavaCodeOrID__Group_0__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:563:2: rule__JavaCodeOrID__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__0_in_rule__JavaCodeOrID__Alternatives1148);
                    rule__JavaCodeOrID__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJavaCodeOrIDAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:567:6: ( ( rule__JavaCodeOrID__IdAssignment_1 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:567:6: ( ( rule__JavaCodeOrID__IdAssignment_1 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:568:1: ( rule__JavaCodeOrID__IdAssignment_1 )
                    {
                     before(grammarAccess.getJavaCodeOrIDAccess().getIdAssignment_1()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:569:1: ( rule__JavaCodeOrID__IdAssignment_1 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:569:2: rule__JavaCodeOrID__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JavaCodeOrID__IdAssignment_1_in_rule__JavaCodeOrID__Alternatives1166);
                    rule__JavaCodeOrID__IdAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getJavaCodeOrIDAccess().getIdAssignment_1()); 

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
    // $ANTLR end "rule__JavaCodeOrID__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:578:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'float' ) | ( 'String' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:582:1: ( ( 'int' ) | ( 'float' ) | ( 'String' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:583:1: ( 'int' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:583:1: ( 'int' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:584:1: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__Type__Alternatives1200); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:591:6: ( 'float' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:591:6: ( 'float' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:592:1: 'float'
                    {
                     before(grammarAccess.getTypeAccess().getFloatKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__Type__Alternatives1220); 
                     after(grammarAccess.getTypeAccess().getFloatKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:599:6: ( 'String' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:599:6: ( 'String' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:600:1: 'String'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_2()); 
                    match(input,15,FOLLOW_15_in_rule__Type__Alternatives1240); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_2()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__ObjectMaybe__Alternatives"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:612:1: rule__ObjectMaybe__Alternatives : ( ( ( rule__ObjectMaybe__Group_0__0 ) ) | ( ( rule__ObjectMaybe__Group_1__0 ) ) );
    public final void rule__ObjectMaybe__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:616:1: ( ( ( rule__ObjectMaybe__Group_0__0 ) ) | ( ( rule__ObjectMaybe__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:617:1: ( ( rule__ObjectMaybe__Group_0__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:617:1: ( ( rule__ObjectMaybe__Group_0__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:618:1: ( rule__ObjectMaybe__Group_0__0 )
                    {
                     before(grammarAccess.getObjectMaybeAccess().getGroup_0()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:619:1: ( rule__ObjectMaybe__Group_0__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:619:2: rule__ObjectMaybe__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ObjectMaybe__Group_0__0_in_rule__ObjectMaybe__Alternatives1274);
                    rule__ObjectMaybe__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectMaybeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:623:6: ( ( rule__ObjectMaybe__Group_1__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:623:6: ( ( rule__ObjectMaybe__Group_1__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:624:1: ( rule__ObjectMaybe__Group_1__0 )
                    {
                     before(grammarAccess.getObjectMaybeAccess().getGroup_1()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:625:1: ( rule__ObjectMaybe__Group_1__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:625:2: rule__ObjectMaybe__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__0_in_rule__ObjectMaybe__Alternatives1292);
                    rule__ObjectMaybe__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectMaybeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ObjectMaybe__Alternatives"


    // $ANTLR start "rule__Keyword__Alternatives"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:634:1: rule__Keyword__Alternatives : ( ( ( rule__Keyword__NameAssignment_0 ) ) | ( ( rule__Keyword__NameAssignment_1 ) ) | ( ( rule__Keyword__NameAssignment_2 ) ) );
    public final void rule__Keyword__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:638:1: ( ( ( rule__Keyword__NameAssignment_0 ) ) | ( ( rule__Keyword__NameAssignment_1 ) ) | ( ( rule__Keyword__NameAssignment_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt8=1;
                }
                break;
            case 36:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:639:1: ( ( rule__Keyword__NameAssignment_0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:639:1: ( ( rule__Keyword__NameAssignment_0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:640:1: ( rule__Keyword__NameAssignment_0 )
                    {
                     before(grammarAccess.getKeywordAccess().getNameAssignment_0()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:641:1: ( rule__Keyword__NameAssignment_0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:641:2: rule__Keyword__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Keyword__NameAssignment_0_in_rule__Keyword__Alternatives1325);
                    rule__Keyword__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKeywordAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:645:6: ( ( rule__Keyword__NameAssignment_1 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:645:6: ( ( rule__Keyword__NameAssignment_1 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:646:1: ( rule__Keyword__NameAssignment_1 )
                    {
                     before(grammarAccess.getKeywordAccess().getNameAssignment_1()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:647:1: ( rule__Keyword__NameAssignment_1 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:647:2: rule__Keyword__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Keyword__NameAssignment_1_in_rule__Keyword__Alternatives1343);
                    rule__Keyword__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getKeywordAccess().getNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:651:6: ( ( rule__Keyword__NameAssignment_2 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:651:6: ( ( rule__Keyword__NameAssignment_2 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:652:1: ( rule__Keyword__NameAssignment_2 )
                    {
                     before(grammarAccess.getKeywordAccess().getNameAssignment_2()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:653:1: ( rule__Keyword__NameAssignment_2 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:653:2: rule__Keyword__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Keyword__NameAssignment_2_in_rule__Keyword__Alternatives1361);
                    rule__Keyword__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getKeywordAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Keyword__Alternatives"


    // $ANTLR start "rule__DTDSL__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:664:1: rule__DTDSL__Group__0 : rule__DTDSL__Group__0__Impl rule__DTDSL__Group__1 ;
    public final void rule__DTDSL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:668:1: ( rule__DTDSL__Group__0__Impl rule__DTDSL__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:669:2: rule__DTDSL__Group__0__Impl rule__DTDSL__Group__1
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__0__Impl_in_rule__DTDSL__Group__01392);
            rule__DTDSL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__1_in_rule__DTDSL__Group__01395);
            rule__DTDSL__Group__1();

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
    // $ANTLR end "rule__DTDSL__Group__0"


    // $ANTLR start "rule__DTDSL__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:676:1: rule__DTDSL__Group__0__Impl : ( 'parserName' ) ;
    public final void rule__DTDSL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:680:1: ( ( 'parserName' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:681:1: ( 'parserName' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:681:1: ( 'parserName' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:682:1: 'parserName'
            {
             before(grammarAccess.getDTDSLAccess().getParserNameKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__DTDSL__Group__0__Impl1423); 
             after(grammarAccess.getDTDSLAccess().getParserNameKeyword_0()); 

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
    // $ANTLR end "rule__DTDSL__Group__0__Impl"


    // $ANTLR start "rule__DTDSL__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:695:1: rule__DTDSL__Group__1 : rule__DTDSL__Group__1__Impl rule__DTDSL__Group__2 ;
    public final void rule__DTDSL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:699:1: ( rule__DTDSL__Group__1__Impl rule__DTDSL__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:700:2: rule__DTDSL__Group__1__Impl rule__DTDSL__Group__2
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__1__Impl_in_rule__DTDSL__Group__11454);
            rule__DTDSL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__2_in_rule__DTDSL__Group__11457);
            rule__DTDSL__Group__2();

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
    // $ANTLR end "rule__DTDSL__Group__1"


    // $ANTLR start "rule__DTDSL__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:707:1: rule__DTDSL__Group__1__Impl : ( '=' ) ;
    public final void rule__DTDSL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:711:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:712:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:712:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:713:1: '='
            {
             before(grammarAccess.getDTDSLAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__DTDSL__Group__1__Impl1485); 
             after(grammarAccess.getDTDSLAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__DTDSL__Group__1__Impl"


    // $ANTLR start "rule__DTDSL__Group__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:726:1: rule__DTDSL__Group__2 : rule__DTDSL__Group__2__Impl rule__DTDSL__Group__3 ;
    public final void rule__DTDSL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:730:1: ( rule__DTDSL__Group__2__Impl rule__DTDSL__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:731:2: rule__DTDSL__Group__2__Impl rule__DTDSL__Group__3
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__2__Impl_in_rule__DTDSL__Group__21516);
            rule__DTDSL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__3_in_rule__DTDSL__Group__21519);
            rule__DTDSL__Group__3();

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
    // $ANTLR end "rule__DTDSL__Group__2"


    // $ANTLR start "rule__DTDSL__Group__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:738:1: rule__DTDSL__Group__2__Impl : ( ( rule__DTDSL__ParserNameAssignment_2 ) ) ;
    public final void rule__DTDSL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:742:1: ( ( ( rule__DTDSL__ParserNameAssignment_2 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:743:1: ( ( rule__DTDSL__ParserNameAssignment_2 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:743:1: ( ( rule__DTDSL__ParserNameAssignment_2 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:744:1: ( rule__DTDSL__ParserNameAssignment_2 )
            {
             before(grammarAccess.getDTDSLAccess().getParserNameAssignment_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:745:1: ( rule__DTDSL__ParserNameAssignment_2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:745:2: rule__DTDSL__ParserNameAssignment_2
            {
            pushFollow(FOLLOW_rule__DTDSL__ParserNameAssignment_2_in_rule__DTDSL__Group__2__Impl1546);
            rule__DTDSL__ParserNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDTDSLAccess().getParserNameAssignment_2()); 

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
    // $ANTLR end "rule__DTDSL__Group__2__Impl"


    // $ANTLR start "rule__DTDSL__Group__3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:755:1: rule__DTDSL__Group__3 : rule__DTDSL__Group__3__Impl rule__DTDSL__Group__4 ;
    public final void rule__DTDSL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:759:1: ( rule__DTDSL__Group__3__Impl rule__DTDSL__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:760:2: rule__DTDSL__Group__3__Impl rule__DTDSL__Group__4
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__3__Impl_in_rule__DTDSL__Group__31576);
            rule__DTDSL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__4_in_rule__DTDSL__Group__31579);
            rule__DTDSL__Group__4();

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
    // $ANTLR end "rule__DTDSL__Group__3"


    // $ANTLR start "rule__DTDSL__Group__3__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:767:1: rule__DTDSL__Group__3__Impl : ( ';' ) ;
    public final void rule__DTDSL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:771:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:772:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:772:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:773:1: ';'
            {
             before(grammarAccess.getDTDSLAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__DTDSL__Group__3__Impl1607); 
             after(grammarAccess.getDTDSLAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__DTDSL__Group__3__Impl"


    // $ANTLR start "rule__DTDSL__Group__4"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:786:1: rule__DTDSL__Group__4 : rule__DTDSL__Group__4__Impl rule__DTDSL__Group__5 ;
    public final void rule__DTDSL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:790:1: ( rule__DTDSL__Group__4__Impl rule__DTDSL__Group__5 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:791:2: rule__DTDSL__Group__4__Impl rule__DTDSL__Group__5
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__4__Impl_in_rule__DTDSL__Group__41638);
            rule__DTDSL__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__5_in_rule__DTDSL__Group__41641);
            rule__DTDSL__Group__5();

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
    // $ANTLR end "rule__DTDSL__Group__4"


    // $ANTLR start "rule__DTDSL__Group__4__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:798:1: rule__DTDSL__Group__4__Impl : ( 'parserType' ) ;
    public final void rule__DTDSL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:802:1: ( ( 'parserType' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:803:1: ( 'parserType' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:803:1: ( 'parserType' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:804:1: 'parserType'
            {
             before(grammarAccess.getDTDSLAccess().getParserTypeKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__DTDSL__Group__4__Impl1669); 
             after(grammarAccess.getDTDSLAccess().getParserTypeKeyword_4()); 

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
    // $ANTLR end "rule__DTDSL__Group__4__Impl"


    // $ANTLR start "rule__DTDSL__Group__5"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:817:1: rule__DTDSL__Group__5 : rule__DTDSL__Group__5__Impl rule__DTDSL__Group__6 ;
    public final void rule__DTDSL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:821:1: ( rule__DTDSL__Group__5__Impl rule__DTDSL__Group__6 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:822:2: rule__DTDSL__Group__5__Impl rule__DTDSL__Group__6
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__5__Impl_in_rule__DTDSL__Group__51700);
            rule__DTDSL__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__6_in_rule__DTDSL__Group__51703);
            rule__DTDSL__Group__6();

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
    // $ANTLR end "rule__DTDSL__Group__5"


    // $ANTLR start "rule__DTDSL__Group__5__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:829:1: rule__DTDSL__Group__5__Impl : ( '=' ) ;
    public final void rule__DTDSL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:833:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:834:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:834:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:835:1: '='
            {
             before(grammarAccess.getDTDSLAccess().getEqualsSignKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__DTDSL__Group__5__Impl1731); 
             after(grammarAccess.getDTDSLAccess().getEqualsSignKeyword_5()); 

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
    // $ANTLR end "rule__DTDSL__Group__5__Impl"


    // $ANTLR start "rule__DTDSL__Group__6"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:848:1: rule__DTDSL__Group__6 : rule__DTDSL__Group__6__Impl rule__DTDSL__Group__7 ;
    public final void rule__DTDSL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:852:1: ( rule__DTDSL__Group__6__Impl rule__DTDSL__Group__7 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:853:2: rule__DTDSL__Group__6__Impl rule__DTDSL__Group__7
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__6__Impl_in_rule__DTDSL__Group__61762);
            rule__DTDSL__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__7_in_rule__DTDSL__Group__61765);
            rule__DTDSL__Group__7();

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
    // $ANTLR end "rule__DTDSL__Group__6"


    // $ANTLR start "rule__DTDSL__Group__6__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:860:1: rule__DTDSL__Group__6__Impl : ( ( rule__DTDSL__TypeAssignment_6 ) ) ;
    public final void rule__DTDSL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:864:1: ( ( ( rule__DTDSL__TypeAssignment_6 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:865:1: ( ( rule__DTDSL__TypeAssignment_6 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:865:1: ( ( rule__DTDSL__TypeAssignment_6 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:866:1: ( rule__DTDSL__TypeAssignment_6 )
            {
             before(grammarAccess.getDTDSLAccess().getTypeAssignment_6()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:867:1: ( rule__DTDSL__TypeAssignment_6 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:867:2: rule__DTDSL__TypeAssignment_6
            {
            pushFollow(FOLLOW_rule__DTDSL__TypeAssignment_6_in_rule__DTDSL__Group__6__Impl1792);
            rule__DTDSL__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDTDSLAccess().getTypeAssignment_6()); 

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
    // $ANTLR end "rule__DTDSL__Group__6__Impl"


    // $ANTLR start "rule__DTDSL__Group__7"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:877:1: rule__DTDSL__Group__7 : rule__DTDSL__Group__7__Impl rule__DTDSL__Group__8 ;
    public final void rule__DTDSL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:881:1: ( rule__DTDSL__Group__7__Impl rule__DTDSL__Group__8 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:882:2: rule__DTDSL__Group__7__Impl rule__DTDSL__Group__8
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__7__Impl_in_rule__DTDSL__Group__71822);
            rule__DTDSL__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__8_in_rule__DTDSL__Group__71825);
            rule__DTDSL__Group__8();

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
    // $ANTLR end "rule__DTDSL__Group__7"


    // $ANTLR start "rule__DTDSL__Group__7__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:889:1: rule__DTDSL__Group__7__Impl : ( ';' ) ;
    public final void rule__DTDSL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:893:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:894:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:894:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:895:1: ';'
            {
             before(grammarAccess.getDTDSLAccess().getSemicolonKeyword_7()); 
            match(input,18,FOLLOW_18_in_rule__DTDSL__Group__7__Impl1853); 
             after(grammarAccess.getDTDSLAccess().getSemicolonKeyword_7()); 

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
    // $ANTLR end "rule__DTDSL__Group__7__Impl"


    // $ANTLR start "rule__DTDSL__Group__8"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:908:1: rule__DTDSL__Group__8 : rule__DTDSL__Group__8__Impl rule__DTDSL__Group__9 ;
    public final void rule__DTDSL__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:912:1: ( rule__DTDSL__Group__8__Impl rule__DTDSL__Group__9 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:913:2: rule__DTDSL__Group__8__Impl rule__DTDSL__Group__9
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__8__Impl_in_rule__DTDSL__Group__81884);
            rule__DTDSL__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__9_in_rule__DTDSL__Group__81887);
            rule__DTDSL__Group__9();

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
    // $ANTLR end "rule__DTDSL__Group__8"


    // $ANTLR start "rule__DTDSL__Group__8__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:920:1: rule__DTDSL__Group__8__Impl : ( ( rule__DTDSL__ImportsAssignment_8 )* ) ;
    public final void rule__DTDSL__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:924:1: ( ( ( rule__DTDSL__ImportsAssignment_8 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:925:1: ( ( rule__DTDSL__ImportsAssignment_8 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:925:1: ( ( rule__DTDSL__ImportsAssignment_8 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:926:1: ( rule__DTDSL__ImportsAssignment_8 )*
            {
             before(grammarAccess.getDTDSLAccess().getImportsAssignment_8()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:927:1: ( rule__DTDSL__ImportsAssignment_8 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:927:2: rule__DTDSL__ImportsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__DTDSL__ImportsAssignment_8_in_rule__DTDSL__Group__8__Impl1914);
            	    rule__DTDSL__ImportsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDTDSLAccess().getImportsAssignment_8()); 

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
    // $ANTLR end "rule__DTDSL__Group__8__Impl"


    // $ANTLR start "rule__DTDSL__Group__9"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:937:1: rule__DTDSL__Group__9 : rule__DTDSL__Group__9__Impl rule__DTDSL__Group__10 ;
    public final void rule__DTDSL__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:941:1: ( rule__DTDSL__Group__9__Impl rule__DTDSL__Group__10 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:942:2: rule__DTDSL__Group__9__Impl rule__DTDSL__Group__10
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__9__Impl_in_rule__DTDSL__Group__91945);
            rule__DTDSL__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__10_in_rule__DTDSL__Group__91948);
            rule__DTDSL__Group__10();

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
    // $ANTLR end "rule__DTDSL__Group__9"


    // $ANTLR start "rule__DTDSL__Group__9__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:949:1: rule__DTDSL__Group__9__Impl : ( ( rule__DTDSL__ObjDescriptionAssignment_9 )* ) ;
    public final void rule__DTDSL__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:953:1: ( ( ( rule__DTDSL__ObjDescriptionAssignment_9 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:954:1: ( ( rule__DTDSL__ObjDescriptionAssignment_9 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:954:1: ( ( rule__DTDSL__ObjDescriptionAssignment_9 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:955:1: ( rule__DTDSL__ObjDescriptionAssignment_9 )*
            {
             before(grammarAccess.getDTDSLAccess().getObjDescriptionAssignment_9()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:956:1: ( rule__DTDSL__ObjDescriptionAssignment_9 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:956:2: rule__DTDSL__ObjDescriptionAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__DTDSL__ObjDescriptionAssignment_9_in_rule__DTDSL__Group__9__Impl1975);
            	    rule__DTDSL__ObjDescriptionAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDTDSLAccess().getObjDescriptionAssignment_9()); 

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
    // $ANTLR end "rule__DTDSL__Group__9__Impl"


    // $ANTLR start "rule__DTDSL__Group__10"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:966:1: rule__DTDSL__Group__10 : rule__DTDSL__Group__10__Impl ;
    public final void rule__DTDSL__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:970:1: ( rule__DTDSL__Group__10__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:971:2: rule__DTDSL__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__10__Impl_in_rule__DTDSL__Group__102006);
            rule__DTDSL__Group__10__Impl();

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
    // $ANTLR end "rule__DTDSL__Group__10"


    // $ANTLR start "rule__DTDSL__Group__10__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:977:1: rule__DTDSL__Group__10__Impl : ( ( rule__DTDSL__StartAssignment_10 ) ) ;
    public final void rule__DTDSL__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:981:1: ( ( ( rule__DTDSL__StartAssignment_10 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:982:1: ( ( rule__DTDSL__StartAssignment_10 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:982:1: ( ( rule__DTDSL__StartAssignment_10 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:983:1: ( rule__DTDSL__StartAssignment_10 )
            {
             before(grammarAccess.getDTDSLAccess().getStartAssignment_10()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:984:1: ( rule__DTDSL__StartAssignment_10 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:984:2: rule__DTDSL__StartAssignment_10
            {
            pushFollow(FOLLOW_rule__DTDSL__StartAssignment_10_in_rule__DTDSL__Group__10__Impl2033);
            rule__DTDSL__StartAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getDTDSLAccess().getStartAssignment_10()); 

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
    // $ANTLR end "rule__DTDSL__Group__10__Impl"


    // $ANTLR start "rule__ImportStatement__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1016:1: rule__ImportStatement__Group__0 : rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1 ;
    public final void rule__ImportStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1020:1: ( rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1021:2: rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1
            {
            pushFollow(FOLLOW_rule__ImportStatement__Group__0__Impl_in_rule__ImportStatement__Group__02085);
            rule__ImportStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportStatement__Group__1_in_rule__ImportStatement__Group__02088);
            rule__ImportStatement__Group__1();

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
    // $ANTLR end "rule__ImportStatement__Group__0"


    // $ANTLR start "rule__ImportStatement__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1028:1: rule__ImportStatement__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1032:1: ( ( 'import' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1033:1: ( 'import' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1033:1: ( 'import' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1034:1: 'import'
            {
             before(grammarAccess.getImportStatementAccess().getImportKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__ImportStatement__Group__0__Impl2116); 
             after(grammarAccess.getImportStatementAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__ImportStatement__Group__0__Impl"


    // $ANTLR start "rule__ImportStatement__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1047:1: rule__ImportStatement__Group__1 : rule__ImportStatement__Group__1__Impl rule__ImportStatement__Group__2 ;
    public final void rule__ImportStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1051:1: ( rule__ImportStatement__Group__1__Impl rule__ImportStatement__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1052:2: rule__ImportStatement__Group__1__Impl rule__ImportStatement__Group__2
            {
            pushFollow(FOLLOW_rule__ImportStatement__Group__1__Impl_in_rule__ImportStatement__Group__12147);
            rule__ImportStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportStatement__Group__2_in_rule__ImportStatement__Group__12150);
            rule__ImportStatement__Group__2();

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
    // $ANTLR end "rule__ImportStatement__Group__1"


    // $ANTLR start "rule__ImportStatement__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1059:1: rule__ImportStatement__Group__1__Impl : ( ( rule__ImportStatement__ImportClassAssignment_1 ) ) ;
    public final void rule__ImportStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1063:1: ( ( ( rule__ImportStatement__ImportClassAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1064:1: ( ( rule__ImportStatement__ImportClassAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1064:1: ( ( rule__ImportStatement__ImportClassAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1065:1: ( rule__ImportStatement__ImportClassAssignment_1 )
            {
             before(grammarAccess.getImportStatementAccess().getImportClassAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1066:1: ( rule__ImportStatement__ImportClassAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1066:2: rule__ImportStatement__ImportClassAssignment_1
            {
            pushFollow(FOLLOW_rule__ImportStatement__ImportClassAssignment_1_in_rule__ImportStatement__Group__1__Impl2177);
            rule__ImportStatement__ImportClassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportStatementAccess().getImportClassAssignment_1()); 

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
    // $ANTLR end "rule__ImportStatement__Group__1__Impl"


    // $ANTLR start "rule__ImportStatement__Group__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1076:1: rule__ImportStatement__Group__2 : rule__ImportStatement__Group__2__Impl ;
    public final void rule__ImportStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1080:1: ( rule__ImportStatement__Group__2__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1081:2: rule__ImportStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ImportStatement__Group__2__Impl_in_rule__ImportStatement__Group__22207);
            rule__ImportStatement__Group__2__Impl();

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
    // $ANTLR end "rule__ImportStatement__Group__2"


    // $ANTLR start "rule__ImportStatement__Group__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1087:1: rule__ImportStatement__Group__2__Impl : ( ';' ) ;
    public final void rule__ImportStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1091:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1092:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1092:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1093:1: ';'
            {
             before(grammarAccess.getImportStatementAccess().getSemicolonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__ImportStatement__Group__2__Impl2235); 
             after(grammarAccess.getImportStatementAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__ImportStatement__Group__2__Impl"


    // $ANTLR start "rule__StartPoint__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1112:1: rule__StartPoint__Group__0 : rule__StartPoint__Group__0__Impl rule__StartPoint__Group__1 ;
    public final void rule__StartPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1116:1: ( rule__StartPoint__Group__0__Impl rule__StartPoint__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1117:2: rule__StartPoint__Group__0__Impl rule__StartPoint__Group__1
            {
            pushFollow(FOLLOW_rule__StartPoint__Group__0__Impl_in_rule__StartPoint__Group__02272);
            rule__StartPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartPoint__Group__1_in_rule__StartPoint__Group__02275);
            rule__StartPoint__Group__1();

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
    // $ANTLR end "rule__StartPoint__Group__0"


    // $ANTLR start "rule__StartPoint__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1124:1: rule__StartPoint__Group__0__Impl : ( 'beginWith' ) ;
    public final void rule__StartPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1128:1: ( ( 'beginWith' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1129:1: ( 'beginWith' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1129:1: ( 'beginWith' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1130:1: 'beginWith'
            {
             before(grammarAccess.getStartPointAccess().getBeginWithKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__StartPoint__Group__0__Impl2303); 
             after(grammarAccess.getStartPointAccess().getBeginWithKeyword_0()); 

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
    // $ANTLR end "rule__StartPoint__Group__0__Impl"


    // $ANTLR start "rule__StartPoint__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1143:1: rule__StartPoint__Group__1 : rule__StartPoint__Group__1__Impl rule__StartPoint__Group__2 ;
    public final void rule__StartPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1147:1: ( rule__StartPoint__Group__1__Impl rule__StartPoint__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1148:2: rule__StartPoint__Group__1__Impl rule__StartPoint__Group__2
            {
            pushFollow(FOLLOW_rule__StartPoint__Group__1__Impl_in_rule__StartPoint__Group__12334);
            rule__StartPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartPoint__Group__2_in_rule__StartPoint__Group__12337);
            rule__StartPoint__Group__2();

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
    // $ANTLR end "rule__StartPoint__Group__1"


    // $ANTLR start "rule__StartPoint__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1155:1: rule__StartPoint__Group__1__Impl : ( '=' ) ;
    public final void rule__StartPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1159:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1160:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1160:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1161:1: '='
            {
             before(grammarAccess.getStartPointAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__StartPoint__Group__1__Impl2365); 
             after(grammarAccess.getStartPointAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__StartPoint__Group__1__Impl"


    // $ANTLR start "rule__StartPoint__Group__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1174:1: rule__StartPoint__Group__2 : rule__StartPoint__Group__2__Impl rule__StartPoint__Group__3 ;
    public final void rule__StartPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1178:1: ( rule__StartPoint__Group__2__Impl rule__StartPoint__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1179:2: rule__StartPoint__Group__2__Impl rule__StartPoint__Group__3
            {
            pushFollow(FOLLOW_rule__StartPoint__Group__2__Impl_in_rule__StartPoint__Group__22396);
            rule__StartPoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartPoint__Group__3_in_rule__StartPoint__Group__22399);
            rule__StartPoint__Group__3();

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
    // $ANTLR end "rule__StartPoint__Group__2"


    // $ANTLR start "rule__StartPoint__Group__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1186:1: rule__StartPoint__Group__2__Impl : ( ( rule__StartPoint__BeginAssignment_2 ) ) ;
    public final void rule__StartPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1190:1: ( ( ( rule__StartPoint__BeginAssignment_2 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1191:1: ( ( rule__StartPoint__BeginAssignment_2 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1191:1: ( ( rule__StartPoint__BeginAssignment_2 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1192:1: ( rule__StartPoint__BeginAssignment_2 )
            {
             before(grammarAccess.getStartPointAccess().getBeginAssignment_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1193:1: ( rule__StartPoint__BeginAssignment_2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1193:2: rule__StartPoint__BeginAssignment_2
            {
            pushFollow(FOLLOW_rule__StartPoint__BeginAssignment_2_in_rule__StartPoint__Group__2__Impl2426);
            rule__StartPoint__BeginAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStartPointAccess().getBeginAssignment_2()); 

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
    // $ANTLR end "rule__StartPoint__Group__2__Impl"


    // $ANTLR start "rule__StartPoint__Group__3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1203:1: rule__StartPoint__Group__3 : rule__StartPoint__Group__3__Impl ;
    public final void rule__StartPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1207:1: ( rule__StartPoint__Group__3__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1208:2: rule__StartPoint__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StartPoint__Group__3__Impl_in_rule__StartPoint__Group__32456);
            rule__StartPoint__Group__3__Impl();

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
    // $ANTLR end "rule__StartPoint__Group__3"


    // $ANTLR start "rule__StartPoint__Group__3__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1214:1: rule__StartPoint__Group__3__Impl : ( ';' ) ;
    public final void rule__StartPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1218:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1219:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1219:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1220:1: ';'
            {
             before(grammarAccess.getStartPointAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__StartPoint__Group__3__Impl2484); 
             after(grammarAccess.getStartPointAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__StartPoint__Group__3__Impl"


    // $ANTLR start "rule__ObjectDescription__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1241:1: rule__ObjectDescription__Group__0 : rule__ObjectDescription__Group__0__Impl rule__ObjectDescription__Group__1 ;
    public final void rule__ObjectDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1245:1: ( rule__ObjectDescription__Group__0__Impl rule__ObjectDescription__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1246:2: rule__ObjectDescription__Group__0__Impl rule__ObjectDescription__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__0__Impl_in_rule__ObjectDescription__Group__02523);
            rule__ObjectDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__1_in_rule__ObjectDescription__Group__02526);
            rule__ObjectDescription__Group__1();

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
    // $ANTLR end "rule__ObjectDescription__Group__0"


    // $ANTLR start "rule__ObjectDescription__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1253:1: rule__ObjectDescription__Group__0__Impl : ( ( rule__ObjectDescription__NameAssignment_0 ) ) ;
    public final void rule__ObjectDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1257:1: ( ( ( rule__ObjectDescription__NameAssignment_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1258:1: ( ( rule__ObjectDescription__NameAssignment_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1258:1: ( ( rule__ObjectDescription__NameAssignment_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1259:1: ( rule__ObjectDescription__NameAssignment_0 )
            {
             before(grammarAccess.getObjectDescriptionAccess().getNameAssignment_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1260:1: ( rule__ObjectDescription__NameAssignment_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1260:2: rule__ObjectDescription__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ObjectDescription__NameAssignment_0_in_rule__ObjectDescription__Group__0__Impl2553);
            rule__ObjectDescription__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectDescriptionAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ObjectDescription__Group__0__Impl"


    // $ANTLR start "rule__ObjectDescription__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1270:1: rule__ObjectDescription__Group__1 : rule__ObjectDescription__Group__1__Impl rule__ObjectDescription__Group__2 ;
    public final void rule__ObjectDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1274:1: ( rule__ObjectDescription__Group__1__Impl rule__ObjectDescription__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1275:2: rule__ObjectDescription__Group__1__Impl rule__ObjectDescription__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__1__Impl_in_rule__ObjectDescription__Group__12583);
            rule__ObjectDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__2_in_rule__ObjectDescription__Group__12586);
            rule__ObjectDescription__Group__2();

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
    // $ANTLR end "rule__ObjectDescription__Group__1"


    // $ANTLR start "rule__ObjectDescription__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1282:1: rule__ObjectDescription__Group__1__Impl : ( ':' ) ;
    public final void rule__ObjectDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1286:1: ( ( ':' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1287:1: ( ':' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1287:1: ( ':' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1288:1: ':'
            {
             before(grammarAccess.getObjectDescriptionAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ObjectDescription__Group__1__Impl2614); 
             after(grammarAccess.getObjectDescriptionAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ObjectDescription__Group__1__Impl"


    // $ANTLR start "rule__ObjectDescription__Group__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1301:1: rule__ObjectDescription__Group__2 : rule__ObjectDescription__Group__2__Impl rule__ObjectDescription__Group__3 ;
    public final void rule__ObjectDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1305:1: ( rule__ObjectDescription__Group__2__Impl rule__ObjectDescription__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1306:2: rule__ObjectDescription__Group__2__Impl rule__ObjectDescription__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__2__Impl_in_rule__ObjectDescription__Group__22645);
            rule__ObjectDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__3_in_rule__ObjectDescription__Group__22648);
            rule__ObjectDescription__Group__3();

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
    // $ANTLR end "rule__ObjectDescription__Group__2"


    // $ANTLR start "rule__ObjectDescription__Group__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1313:1: rule__ObjectDescription__Group__2__Impl : ( '{' ) ;
    public final void rule__ObjectDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1317:1: ( ( '{' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1318:1: ( '{' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1318:1: ( '{' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1319:1: '{'
            {
             before(grammarAccess.getObjectDescriptionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__ObjectDescription__Group__2__Impl2676); 
             after(grammarAccess.getObjectDescriptionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ObjectDescription__Group__2__Impl"


    // $ANTLR start "rule__ObjectDescription__Group__3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1332:1: rule__ObjectDescription__Group__3 : rule__ObjectDescription__Group__3__Impl rule__ObjectDescription__Group__4 ;
    public final void rule__ObjectDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1336:1: ( rule__ObjectDescription__Group__3__Impl rule__ObjectDescription__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1337:2: rule__ObjectDescription__Group__3__Impl rule__ObjectDescription__Group__4
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__3__Impl_in_rule__ObjectDescription__Group__32707);
            rule__ObjectDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__4_in_rule__ObjectDescription__Group__32710);
            rule__ObjectDescription__Group__4();

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
    // $ANTLR end "rule__ObjectDescription__Group__3"


    // $ANTLR start "rule__ObjectDescription__Group__3__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1344:1: rule__ObjectDescription__Group__3__Impl : ( ( rule__ObjectDescription__DescriptionAssignment_3 )* ) ;
    public final void rule__ObjectDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1348:1: ( ( ( rule__ObjectDescription__DescriptionAssignment_3 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1349:1: ( ( rule__ObjectDescription__DescriptionAssignment_3 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1349:1: ( ( rule__ObjectDescription__DescriptionAssignment_3 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1350:1: ( rule__ObjectDescription__DescriptionAssignment_3 )*
            {
             before(grammarAccess.getObjectDescriptionAccess().getDescriptionAssignment_3()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1351:1: ( rule__ObjectDescription__DescriptionAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==25||LA11_0==28||LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1351:2: rule__ObjectDescription__DescriptionAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ObjectDescription__DescriptionAssignment_3_in_rule__ObjectDescription__Group__3__Impl2737);
            	    rule__ObjectDescription__DescriptionAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getObjectDescriptionAccess().getDescriptionAssignment_3()); 

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
    // $ANTLR end "rule__ObjectDescription__Group__3__Impl"


    // $ANTLR start "rule__ObjectDescription__Group__4"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1361:1: rule__ObjectDescription__Group__4 : rule__ObjectDescription__Group__4__Impl ;
    public final void rule__ObjectDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1365:1: ( rule__ObjectDescription__Group__4__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1366:2: rule__ObjectDescription__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__4__Impl_in_rule__ObjectDescription__Group__42768);
            rule__ObjectDescription__Group__4__Impl();

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
    // $ANTLR end "rule__ObjectDescription__Group__4"


    // $ANTLR start "rule__ObjectDescription__Group__4__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1372:1: rule__ObjectDescription__Group__4__Impl : ( '}' ) ;
    public final void rule__ObjectDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1376:1: ( ( '}' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1377:1: ( '}' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1377:1: ( '}' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1378:1: '}'
            {
             before(grammarAccess.getObjectDescriptionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__ObjectDescription__Group__4__Impl2796); 
             after(grammarAccess.getObjectDescriptionAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ObjectDescription__Group__4__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1401:1: rule__ObjectAttribute__Group__0 : rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 ;
    public final void rule__ObjectAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1405:1: ( rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1406:2: rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__0__Impl_in_rule__ObjectAttribute__Group__02837);
            rule__ObjectAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectAttribute__Group__1_in_rule__ObjectAttribute__Group__02840);
            rule__ObjectAttribute__Group__1();

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
    // $ANTLR end "rule__ObjectAttribute__Group__0"


    // $ANTLR start "rule__ObjectAttribute__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1413:1: rule__ObjectAttribute__Group__0__Impl : ( 'hasAttribute' ) ;
    public final void rule__ObjectAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1417:1: ( ( 'hasAttribute' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1418:1: ( 'hasAttribute' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1418:1: ( 'hasAttribute' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1419:1: 'hasAttribute'
            {
             before(grammarAccess.getObjectAttributeAccess().getHasAttributeKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__ObjectAttribute__Group__0__Impl2868); 
             after(grammarAccess.getObjectAttributeAccess().getHasAttributeKeyword_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group__0__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1432:1: rule__ObjectAttribute__Group__1 : rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 ;
    public final void rule__ObjectAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1436:1: ( rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1437:2: rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__1__Impl_in_rule__ObjectAttribute__Group__12899);
            rule__ObjectAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectAttribute__Group__2_in_rule__ObjectAttribute__Group__12902);
            rule__ObjectAttribute__Group__2();

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
    // $ANTLR end "rule__ObjectAttribute__Group__1"


    // $ANTLR start "rule__ObjectAttribute__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1444:1: rule__ObjectAttribute__Group__1__Impl : ( ( rule__ObjectAttribute__AttributesAssignment_1 ) ) ;
    public final void rule__ObjectAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1448:1: ( ( ( rule__ObjectAttribute__AttributesAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1449:1: ( ( rule__ObjectAttribute__AttributesAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1449:1: ( ( rule__ObjectAttribute__AttributesAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1450:1: ( rule__ObjectAttribute__AttributesAssignment_1 )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributesAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1451:1: ( rule__ObjectAttribute__AttributesAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1451:2: rule__ObjectAttribute__AttributesAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__AttributesAssignment_1_in_rule__ObjectAttribute__Group__1__Impl2929);
            rule__ObjectAttribute__AttributesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAttributeAccess().getAttributesAssignment_1()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group__1__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1461:1: rule__ObjectAttribute__Group__2 : rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3 ;
    public final void rule__ObjectAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1465:1: ( rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1466:2: rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__2__Impl_in_rule__ObjectAttribute__Group__22959);
            rule__ObjectAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectAttribute__Group__3_in_rule__ObjectAttribute__Group__22962);
            rule__ObjectAttribute__Group__3();

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
    // $ANTLR end "rule__ObjectAttribute__Group__2"


    // $ANTLR start "rule__ObjectAttribute__Group__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1473:1: rule__ObjectAttribute__Group__2__Impl : ( 'ofType' ) ;
    public final void rule__ObjectAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1477:1: ( ( 'ofType' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1478:1: ( 'ofType' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1478:1: ( 'ofType' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1479:1: 'ofType'
            {
             before(grammarAccess.getObjectAttributeAccess().getOfTypeKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__ObjectAttribute__Group__2__Impl2990); 
             after(grammarAccess.getObjectAttributeAccess().getOfTypeKeyword_2()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group__2__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group__3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1492:1: rule__ObjectAttribute__Group__3 : rule__ObjectAttribute__Group__3__Impl rule__ObjectAttribute__Group__4 ;
    public final void rule__ObjectAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1496:1: ( rule__ObjectAttribute__Group__3__Impl rule__ObjectAttribute__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1497:2: rule__ObjectAttribute__Group__3__Impl rule__ObjectAttribute__Group__4
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__3__Impl_in_rule__ObjectAttribute__Group__33021);
            rule__ObjectAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectAttribute__Group__4_in_rule__ObjectAttribute__Group__33024);
            rule__ObjectAttribute__Group__4();

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
    // $ANTLR end "rule__ObjectAttribute__Group__3"


    // $ANTLR start "rule__ObjectAttribute__Group__3__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1504:1: rule__ObjectAttribute__Group__3__Impl : ( ( rule__ObjectAttribute__Alternatives_3 ) ) ;
    public final void rule__ObjectAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1508:1: ( ( ( rule__ObjectAttribute__Alternatives_3 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1509:1: ( ( rule__ObjectAttribute__Alternatives_3 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1509:1: ( ( rule__ObjectAttribute__Alternatives_3 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1510:1: ( rule__ObjectAttribute__Alternatives_3 )
            {
             before(grammarAccess.getObjectAttributeAccess().getAlternatives_3()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1511:1: ( rule__ObjectAttribute__Alternatives_3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1511:2: rule__ObjectAttribute__Alternatives_3
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Alternatives_3_in_rule__ObjectAttribute__Group__3__Impl3051);
            rule__ObjectAttribute__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getObjectAttributeAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group__3__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group__4"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1521:1: rule__ObjectAttribute__Group__4 : rule__ObjectAttribute__Group__4__Impl ;
    public final void rule__ObjectAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1525:1: ( rule__ObjectAttribute__Group__4__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1526:2: rule__ObjectAttribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__4__Impl_in_rule__ObjectAttribute__Group__43081);
            rule__ObjectAttribute__Group__4__Impl();

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
    // $ANTLR end "rule__ObjectAttribute__Group__4"


    // $ANTLR start "rule__ObjectAttribute__Group__4__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1532:1: rule__ObjectAttribute__Group__4__Impl : ( ';' ) ;
    public final void rule__ObjectAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1536:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1537:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1537:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1538:1: ';'
            {
             before(grammarAccess.getObjectAttributeAccess().getSemicolonKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__ObjectAttribute__Group__4__Impl3109); 
             after(grammarAccess.getObjectAttributeAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group__4__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group_3_0__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1561:1: rule__ObjectAttribute__Group_3_0__0 : rule__ObjectAttribute__Group_3_0__0__Impl rule__ObjectAttribute__Group_3_0__1 ;
    public final void rule__ObjectAttribute__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1565:1: ( rule__ObjectAttribute__Group_3_0__0__Impl rule__ObjectAttribute__Group_3_0__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1566:2: rule__ObjectAttribute__Group_3_0__0__Impl rule__ObjectAttribute__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group_3_0__0__Impl_in_rule__ObjectAttribute__Group_3_0__03150);
            rule__ObjectAttribute__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectAttribute__Group_3_0__1_in_rule__ObjectAttribute__Group_3_0__03153);
            rule__ObjectAttribute__Group_3_0__1();

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
    // $ANTLR end "rule__ObjectAttribute__Group_3_0__0"


    // $ANTLR start "rule__ObjectAttribute__Group_3_0__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1573:1: rule__ObjectAttribute__Group_3_0__0__Impl : ( ( rule__ObjectAttribute__TypesAssignment_3_0_0 ) ) ;
    public final void rule__ObjectAttribute__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1577:1: ( ( ( rule__ObjectAttribute__TypesAssignment_3_0_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1578:1: ( ( rule__ObjectAttribute__TypesAssignment_3_0_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1578:1: ( ( rule__ObjectAttribute__TypesAssignment_3_0_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1579:1: ( rule__ObjectAttribute__TypesAssignment_3_0_0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getTypesAssignment_3_0_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1580:1: ( rule__ObjectAttribute__TypesAssignment_3_0_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1580:2: rule__ObjectAttribute__TypesAssignment_3_0_0
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__TypesAssignment_3_0_0_in_rule__ObjectAttribute__Group_3_0__0__Impl3180);
            rule__ObjectAttribute__TypesAssignment_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAttributeAccess().getTypesAssignment_3_0_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group_3_0__0__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group_3_0__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1590:1: rule__ObjectAttribute__Group_3_0__1 : rule__ObjectAttribute__Group_3_0__1__Impl rule__ObjectAttribute__Group_3_0__2 ;
    public final void rule__ObjectAttribute__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1594:1: ( rule__ObjectAttribute__Group_3_0__1__Impl rule__ObjectAttribute__Group_3_0__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1595:2: rule__ObjectAttribute__Group_3_0__1__Impl rule__ObjectAttribute__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group_3_0__1__Impl_in_rule__ObjectAttribute__Group_3_0__13210);
            rule__ObjectAttribute__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectAttribute__Group_3_0__2_in_rule__ObjectAttribute__Group_3_0__13213);
            rule__ObjectAttribute__Group_3_0__2();

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
    // $ANTLR end "rule__ObjectAttribute__Group_3_0__1"


    // $ANTLR start "rule__ObjectAttribute__Group_3_0__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1602:1: rule__ObjectAttribute__Group_3_0__1__Impl : ( 'as' ) ;
    public final void rule__ObjectAttribute__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1606:1: ( ( 'as' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1607:1: ( 'as' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1607:1: ( 'as' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1608:1: 'as'
            {
             before(grammarAccess.getObjectAttributeAccess().getAsKeyword_3_0_1()); 
            match(input,27,FOLLOW_27_in_rule__ObjectAttribute__Group_3_0__1__Impl3241); 
             after(grammarAccess.getObjectAttributeAccess().getAsKeyword_3_0_1()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group_3_0__1__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group_3_0__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1621:1: rule__ObjectAttribute__Group_3_0__2 : rule__ObjectAttribute__Group_3_0__2__Impl ;
    public final void rule__ObjectAttribute__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1625:1: ( rule__ObjectAttribute__Group_3_0__2__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1626:2: rule__ObjectAttribute__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group_3_0__2__Impl_in_rule__ObjectAttribute__Group_3_0__23272);
            rule__ObjectAttribute__Group_3_0__2__Impl();

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
    // $ANTLR end "rule__ObjectAttribute__Group_3_0__2"


    // $ANTLR start "rule__ObjectAttribute__Group_3_0__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1632:1: rule__ObjectAttribute__Group_3_0__2__Impl : ( ( rule__ObjectAttribute__KeywordAssignment_3_0_2 ) ) ;
    public final void rule__ObjectAttribute__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1636:1: ( ( ( rule__ObjectAttribute__KeywordAssignment_3_0_2 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1637:1: ( ( rule__ObjectAttribute__KeywordAssignment_3_0_2 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1637:1: ( ( rule__ObjectAttribute__KeywordAssignment_3_0_2 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1638:1: ( rule__ObjectAttribute__KeywordAssignment_3_0_2 )
            {
             before(grammarAccess.getObjectAttributeAccess().getKeywordAssignment_3_0_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1639:1: ( rule__ObjectAttribute__KeywordAssignment_3_0_2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1639:2: rule__ObjectAttribute__KeywordAssignment_3_0_2
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__KeywordAssignment_3_0_2_in_rule__ObjectAttribute__Group_3_0__2__Impl3299);
            rule__ObjectAttribute__KeywordAssignment_3_0_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectAttributeAccess().getKeywordAssignment_3_0_2()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group_3_0__2__Impl"


    // $ANTLR start "rule__ObjectNext__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1655:1: rule__ObjectNext__Group__0 : rule__ObjectNext__Group__0__Impl rule__ObjectNext__Group__1 ;
    public final void rule__ObjectNext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1659:1: ( rule__ObjectNext__Group__0__Impl rule__ObjectNext__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1660:2: rule__ObjectNext__Group__0__Impl rule__ObjectNext__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__0__Impl_in_rule__ObjectNext__Group__03335);
            rule__ObjectNext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNext__Group__1_in_rule__ObjectNext__Group__03338);
            rule__ObjectNext__Group__1();

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
    // $ANTLR end "rule__ObjectNext__Group__0"


    // $ANTLR start "rule__ObjectNext__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1667:1: rule__ObjectNext__Group__0__Impl : ( 'hasNext' ) ;
    public final void rule__ObjectNext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1671:1: ( ( 'hasNext' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1672:1: ( 'hasNext' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1672:1: ( 'hasNext' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1673:1: 'hasNext'
            {
             before(grammarAccess.getObjectNextAccess().getHasNextKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__ObjectNext__Group__0__Impl3366); 
             after(grammarAccess.getObjectNextAccess().getHasNextKeyword_0()); 

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
    // $ANTLR end "rule__ObjectNext__Group__0__Impl"


    // $ANTLR start "rule__ObjectNext__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1686:1: rule__ObjectNext__Group__1 : rule__ObjectNext__Group__1__Impl rule__ObjectNext__Group__2 ;
    public final void rule__ObjectNext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1690:1: ( rule__ObjectNext__Group__1__Impl rule__ObjectNext__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1691:2: rule__ObjectNext__Group__1__Impl rule__ObjectNext__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__1__Impl_in_rule__ObjectNext__Group__13397);
            rule__ObjectNext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNext__Group__2_in_rule__ObjectNext__Group__13400);
            rule__ObjectNext__Group__2();

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
    // $ANTLR end "rule__ObjectNext__Group__1"


    // $ANTLR start "rule__ObjectNext__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1698:1: rule__ObjectNext__Group__1__Impl : ( ( rule__ObjectNext__AttributeAssignment_1 ) ) ;
    public final void rule__ObjectNext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1702:1: ( ( ( rule__ObjectNext__AttributeAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1703:1: ( ( rule__ObjectNext__AttributeAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1703:1: ( ( rule__ObjectNext__AttributeAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1704:1: ( rule__ObjectNext__AttributeAssignment_1 )
            {
             before(grammarAccess.getObjectNextAccess().getAttributeAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1705:1: ( rule__ObjectNext__AttributeAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1705:2: rule__ObjectNext__AttributeAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectNext__AttributeAssignment_1_in_rule__ObjectNext__Group__1__Impl3427);
            rule__ObjectNext__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectNextAccess().getAttributeAssignment_1()); 

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
    // $ANTLR end "rule__ObjectNext__Group__1__Impl"


    // $ANTLR start "rule__ObjectNext__Group__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1715:1: rule__ObjectNext__Group__2 : rule__ObjectNext__Group__2__Impl rule__ObjectNext__Group__3 ;
    public final void rule__ObjectNext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1719:1: ( rule__ObjectNext__Group__2__Impl rule__ObjectNext__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1720:2: rule__ObjectNext__Group__2__Impl rule__ObjectNext__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__2__Impl_in_rule__ObjectNext__Group__23457);
            rule__ObjectNext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNext__Group__3_in_rule__ObjectNext__Group__23460);
            rule__ObjectNext__Group__3();

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
    // $ANTLR end "rule__ObjectNext__Group__2"


    // $ANTLR start "rule__ObjectNext__Group__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1727:1: rule__ObjectNext__Group__2__Impl : ( 'as' ) ;
    public final void rule__ObjectNext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1731:1: ( ( 'as' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1732:1: ( 'as' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1732:1: ( 'as' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1733:1: 'as'
            {
             before(grammarAccess.getObjectNextAccess().getAsKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ObjectNext__Group__2__Impl3488); 
             after(grammarAccess.getObjectNextAccess().getAsKeyword_2()); 

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
    // $ANTLR end "rule__ObjectNext__Group__2__Impl"


    // $ANTLR start "rule__ObjectNext__Group__3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1746:1: rule__ObjectNext__Group__3 : rule__ObjectNext__Group__3__Impl rule__ObjectNext__Group__4 ;
    public final void rule__ObjectNext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1750:1: ( rule__ObjectNext__Group__3__Impl rule__ObjectNext__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1751:2: rule__ObjectNext__Group__3__Impl rule__ObjectNext__Group__4
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__3__Impl_in_rule__ObjectNext__Group__33519);
            rule__ObjectNext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNext__Group__4_in_rule__ObjectNext__Group__33522);
            rule__ObjectNext__Group__4();

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
    // $ANTLR end "rule__ObjectNext__Group__3"


    // $ANTLR start "rule__ObjectNext__Group__3__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1758:1: rule__ObjectNext__Group__3__Impl : ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) ) ;
    public final void rule__ObjectNext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1762:1: ( ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1763:1: ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1763:1: ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1764:1: ( rule__ObjectNext__ObjectDesriptionAssignment_3 )
            {
             before(grammarAccess.getObjectNextAccess().getObjectDesriptionAssignment_3()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1765:1: ( rule__ObjectNext__ObjectDesriptionAssignment_3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1765:2: rule__ObjectNext__ObjectDesriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__ObjectNext__ObjectDesriptionAssignment_3_in_rule__ObjectNext__Group__3__Impl3549);
            rule__ObjectNext__ObjectDesriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getObjectNextAccess().getObjectDesriptionAssignment_3()); 

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
    // $ANTLR end "rule__ObjectNext__Group__3__Impl"


    // $ANTLR start "rule__ObjectNext__Group__4"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1775:1: rule__ObjectNext__Group__4 : rule__ObjectNext__Group__4__Impl ;
    public final void rule__ObjectNext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1779:1: ( rule__ObjectNext__Group__4__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1780:2: rule__ObjectNext__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__4__Impl_in_rule__ObjectNext__Group__43579);
            rule__ObjectNext__Group__4__Impl();

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
    // $ANTLR end "rule__ObjectNext__Group__4"


    // $ANTLR start "rule__ObjectNext__Group__4__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1786:1: rule__ObjectNext__Group__4__Impl : ( ';' ) ;
    public final void rule__ObjectNext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1790:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1791:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1791:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1792:1: ';'
            {
             before(grammarAccess.getObjectNextAccess().getSemicolonKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__ObjectNext__Group__4__Impl3607); 
             after(grammarAccess.getObjectNextAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__ObjectNext__Group__4__Impl"


    // $ANTLR start "rule__JavaCodeOrID__Group_0__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1815:1: rule__JavaCodeOrID__Group_0__0 : rule__JavaCodeOrID__Group_0__0__Impl rule__JavaCodeOrID__Group_0__1 ;
    public final void rule__JavaCodeOrID__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1819:1: ( rule__JavaCodeOrID__Group_0__0__Impl rule__JavaCodeOrID__Group_0__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1820:2: rule__JavaCodeOrID__Group_0__0__Impl rule__JavaCodeOrID__Group_0__1
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__0__Impl_in_rule__JavaCodeOrID__Group_0__03648);
            rule__JavaCodeOrID__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__1_in_rule__JavaCodeOrID__Group_0__03651);
            rule__JavaCodeOrID__Group_0__1();

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
    // $ANTLR end "rule__JavaCodeOrID__Group_0__0"


    // $ANTLR start "rule__JavaCodeOrID__Group_0__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1827:1: rule__JavaCodeOrID__Group_0__0__Impl : ( 'java' ) ;
    public final void rule__JavaCodeOrID__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1831:1: ( ( 'java' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1832:1: ( 'java' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1832:1: ( 'java' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1833:1: 'java'
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getJavaKeyword_0_0()); 
            match(input,29,FOLLOW_29_in_rule__JavaCodeOrID__Group_0__0__Impl3679); 
             after(grammarAccess.getJavaCodeOrIDAccess().getJavaKeyword_0_0()); 

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
    // $ANTLR end "rule__JavaCodeOrID__Group_0__0__Impl"


    // $ANTLR start "rule__JavaCodeOrID__Group_0__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1846:1: rule__JavaCodeOrID__Group_0__1 : rule__JavaCodeOrID__Group_0__1__Impl rule__JavaCodeOrID__Group_0__2 ;
    public final void rule__JavaCodeOrID__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1850:1: ( rule__JavaCodeOrID__Group_0__1__Impl rule__JavaCodeOrID__Group_0__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1851:2: rule__JavaCodeOrID__Group_0__1__Impl rule__JavaCodeOrID__Group_0__2
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__1__Impl_in_rule__JavaCodeOrID__Group_0__13710);
            rule__JavaCodeOrID__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__2_in_rule__JavaCodeOrID__Group_0__13713);
            rule__JavaCodeOrID__Group_0__2();

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
    // $ANTLR end "rule__JavaCodeOrID__Group_0__1"


    // $ANTLR start "rule__JavaCodeOrID__Group_0__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1858:1: rule__JavaCodeOrID__Group_0__1__Impl : ( ':' ) ;
    public final void rule__JavaCodeOrID__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1862:1: ( ( ':' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1863:1: ( ':' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1863:1: ( ':' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1864:1: ':'
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getColonKeyword_0_1()); 
            match(input,22,FOLLOW_22_in_rule__JavaCodeOrID__Group_0__1__Impl3741); 
             after(grammarAccess.getJavaCodeOrIDAccess().getColonKeyword_0_1()); 

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
    // $ANTLR end "rule__JavaCodeOrID__Group_0__1__Impl"


    // $ANTLR start "rule__JavaCodeOrID__Group_0__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1877:1: rule__JavaCodeOrID__Group_0__2 : rule__JavaCodeOrID__Group_0__2__Impl ;
    public final void rule__JavaCodeOrID__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1881:1: ( rule__JavaCodeOrID__Group_0__2__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1882:2: rule__JavaCodeOrID__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__2__Impl_in_rule__JavaCodeOrID__Group_0__23772);
            rule__JavaCodeOrID__Group_0__2__Impl();

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
    // $ANTLR end "rule__JavaCodeOrID__Group_0__2"


    // $ANTLR start "rule__JavaCodeOrID__Group_0__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1888:1: rule__JavaCodeOrID__Group_0__2__Impl : ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) ) ;
    public final void rule__JavaCodeOrID__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1892:1: ( ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1893:1: ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1893:1: ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1894:1: ( rule__JavaCodeOrID__CodeAssignment_0_2 )
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getCodeAssignment_0_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1895:1: ( rule__JavaCodeOrID__CodeAssignment_0_2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1895:2: rule__JavaCodeOrID__CodeAssignment_0_2
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__CodeAssignment_0_2_in_rule__JavaCodeOrID__Group_0__2__Impl3799);
            rule__JavaCodeOrID__CodeAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getJavaCodeOrIDAccess().getCodeAssignment_0_2()); 

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
    // $ANTLR end "rule__JavaCodeOrID__Group_0__2__Impl"


    // $ANTLR start "rule__Many__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1911:1: rule__Many__Group__0 : rule__Many__Group__0__Impl rule__Many__Group__1 ;
    public final void rule__Many__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1915:1: ( rule__Many__Group__0__Impl rule__Many__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1916:2: rule__Many__Group__0__Impl rule__Many__Group__1
            {
            pushFollow(FOLLOW_rule__Many__Group__0__Impl_in_rule__Many__Group__03835);
            rule__Many__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Many__Group__1_in_rule__Many__Group__03838);
            rule__Many__Group__1();

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
    // $ANTLR end "rule__Many__Group__0"


    // $ANTLR start "rule__Many__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1923:1: rule__Many__Group__0__Impl : ( () ) ;
    public final void rule__Many__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1927:1: ( ( () ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1928:1: ( () )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1928:1: ( () )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1929:1: ()
            {
             before(grammarAccess.getManyAccess().getManyAction_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1930:1: ()
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1932:1: 
            {
            }

             after(grammarAccess.getManyAccess().getManyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Many__Group__0__Impl"


    // $ANTLR start "rule__Many__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1942:1: rule__Many__Group__1 : rule__Many__Group__1__Impl rule__Many__Group__2 ;
    public final void rule__Many__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1946:1: ( rule__Many__Group__1__Impl rule__Many__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1947:2: rule__Many__Group__1__Impl rule__Many__Group__2
            {
            pushFollow(FOLLOW_rule__Many__Group__1__Impl_in_rule__Many__Group__13896);
            rule__Many__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Many__Group__2_in_rule__Many__Group__13899);
            rule__Many__Group__2();

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
    // $ANTLR end "rule__Many__Group__1"


    // $ANTLR start "rule__Many__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1954:1: rule__Many__Group__1__Impl : ( '(' ) ;
    public final void rule__Many__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1958:1: ( ( '(' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1959:1: ( '(' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1959:1: ( '(' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1960:1: '('
            {
             before(grammarAccess.getManyAccess().getLeftParenthesisKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__Many__Group__1__Impl3927); 
             after(grammarAccess.getManyAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Many__Group__1__Impl"


    // $ANTLR start "rule__Many__Group__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1973:1: rule__Many__Group__2 : rule__Many__Group__2__Impl rule__Many__Group__3 ;
    public final void rule__Many__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1977:1: ( rule__Many__Group__2__Impl rule__Many__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1978:2: rule__Many__Group__2__Impl rule__Many__Group__3
            {
            pushFollow(FOLLOW_rule__Many__Group__2__Impl_in_rule__Many__Group__23958);
            rule__Many__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Many__Group__3_in_rule__Many__Group__23961);
            rule__Many__Group__3();

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
    // $ANTLR end "rule__Many__Group__2"


    // $ANTLR start "rule__Many__Group__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1985:1: rule__Many__Group__2__Impl : ( ( rule__Many__DescriptionAssignment_2 ) ) ;
    public final void rule__Many__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1989:1: ( ( ( rule__Many__DescriptionAssignment_2 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1990:1: ( ( rule__Many__DescriptionAssignment_2 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1990:1: ( ( rule__Many__DescriptionAssignment_2 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1991:1: ( rule__Many__DescriptionAssignment_2 )
            {
             before(grammarAccess.getManyAccess().getDescriptionAssignment_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1992:1: ( rule__Many__DescriptionAssignment_2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1992:2: rule__Many__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__Many__DescriptionAssignment_2_in_rule__Many__Group__2__Impl3988);
            rule__Many__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getManyAccess().getDescriptionAssignment_2()); 

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
    // $ANTLR end "rule__Many__Group__2__Impl"


    // $ANTLR start "rule__Many__Group__3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2002:1: rule__Many__Group__3 : rule__Many__Group__3__Impl rule__Many__Group__4 ;
    public final void rule__Many__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2006:1: ( rule__Many__Group__3__Impl rule__Many__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2007:2: rule__Many__Group__3__Impl rule__Many__Group__4
            {
            pushFollow(FOLLOW_rule__Many__Group__3__Impl_in_rule__Many__Group__34018);
            rule__Many__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Many__Group__4_in_rule__Many__Group__34021);
            rule__Many__Group__4();

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
    // $ANTLR end "rule__Many__Group__3"


    // $ANTLR start "rule__Many__Group__3__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2014:1: rule__Many__Group__3__Impl : ( ')' ) ;
    public final void rule__Many__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2018:1: ( ( ')' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2019:1: ( ')' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2019:1: ( ')' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2020:1: ')'
            {
             before(grammarAccess.getManyAccess().getRightParenthesisKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__Many__Group__3__Impl4049); 
             after(grammarAccess.getManyAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Many__Group__3__Impl"


    // $ANTLR start "rule__Many__Group__4"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2033:1: rule__Many__Group__4 : rule__Many__Group__4__Impl ;
    public final void rule__Many__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2037:1: ( rule__Many__Group__4__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2038:2: rule__Many__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Many__Group__4__Impl_in_rule__Many__Group__44080);
            rule__Many__Group__4__Impl();

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
    // $ANTLR end "rule__Many__Group__4"


    // $ANTLR start "rule__Many__Group__4__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2044:1: rule__Many__Group__4__Impl : ( '*' ) ;
    public final void rule__Many__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2048:1: ( ( '*' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2049:1: ( '*' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2049:1: ( '*' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2050:1: '*'
            {
             before(grammarAccess.getManyAccess().getAsteriskKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__Many__Group__4__Impl4108); 
             after(grammarAccess.getManyAccess().getAsteriskKeyword_4()); 

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
    // $ANTLR end "rule__Many__Group__4__Impl"


    // $ANTLR start "rule__Choice__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2073:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2077:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2078:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__04149);
            rule__Choice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__04152);
            rule__Choice__Group__1();

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
    // $ANTLR end "rule__Choice__Group__0"


    // $ANTLR start "rule__Choice__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2085:1: rule__Choice__Group__0__Impl : ( '(' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2089:1: ( ( '(' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2090:1: ( '(' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2090:1: ( '(' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2091:1: '('
            {
             before(grammarAccess.getChoiceAccess().getLeftParenthesisKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Choice__Group__0__Impl4180); 
             after(grammarAccess.getChoiceAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Choice__Group__0__Impl"


    // $ANTLR start "rule__Choice__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2104:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2108:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2109:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__14211);
            rule__Choice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__14214);
            rule__Choice__Group__2();

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
    // $ANTLR end "rule__Choice__Group__1"


    // $ANTLR start "rule__Choice__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2116:1: rule__Choice__Group__1__Impl : ( ( rule__Choice__OptionsAssignment_1 ) ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2120:1: ( ( ( rule__Choice__OptionsAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2121:1: ( ( rule__Choice__OptionsAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2121:1: ( ( rule__Choice__OptionsAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2122:1: ( rule__Choice__OptionsAssignment_1 )
            {
             before(grammarAccess.getChoiceAccess().getOptionsAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2123:1: ( rule__Choice__OptionsAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2123:2: rule__Choice__OptionsAssignment_1
            {
            pushFollow(FOLLOW_rule__Choice__OptionsAssignment_1_in_rule__Choice__Group__1__Impl4241);
            rule__Choice__OptionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getOptionsAssignment_1()); 

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
    // $ANTLR end "rule__Choice__Group__1__Impl"


    // $ANTLR start "rule__Choice__Group__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2133:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2137:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2138:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
            {
            pushFollow(FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__24271);
            rule__Choice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__3_in_rule__Choice__Group__24274);
            rule__Choice__Group__3();

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
    // $ANTLR end "rule__Choice__Group__2"


    // $ANTLR start "rule__Choice__Group__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2145:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__Group_2__0 )* ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2149:1: ( ( ( rule__Choice__Group_2__0 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2150:1: ( ( rule__Choice__Group_2__0 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2150:1: ( ( rule__Choice__Group_2__0 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2151:1: ( rule__Choice__Group_2__0 )*
            {
             before(grammarAccess.getChoiceAccess().getGroup_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2152:1: ( rule__Choice__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2152:2: rule__Choice__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Choice__Group_2__0_in_rule__Choice__Group__2__Impl4301);
            	    rule__Choice__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getChoiceAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Choice__Group__2__Impl"


    // $ANTLR start "rule__Choice__Group__3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2162:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2166:1: ( rule__Choice__Group__3__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2167:2: rule__Choice__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Choice__Group__3__Impl_in_rule__Choice__Group__34332);
            rule__Choice__Group__3__Impl();

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
    // $ANTLR end "rule__Choice__Group__3"


    // $ANTLR start "rule__Choice__Group__3__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2173:1: rule__Choice__Group__3__Impl : ( ')' ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2177:1: ( ( ')' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2178:1: ( ')' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2178:1: ( ')' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2179:1: ')'
            {
             before(grammarAccess.getChoiceAccess().getRightParenthesisKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__Choice__Group__3__Impl4360); 
             after(grammarAccess.getChoiceAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Choice__Group__3__Impl"


    // $ANTLR start "rule__Choice__Group_2__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2200:1: rule__Choice__Group_2__0 : rule__Choice__Group_2__0__Impl rule__Choice__Group_2__1 ;
    public final void rule__Choice__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2204:1: ( rule__Choice__Group_2__0__Impl rule__Choice__Group_2__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2205:2: rule__Choice__Group_2__0__Impl rule__Choice__Group_2__1
            {
            pushFollow(FOLLOW_rule__Choice__Group_2__0__Impl_in_rule__Choice__Group_2__04399);
            rule__Choice__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group_2__1_in_rule__Choice__Group_2__04402);
            rule__Choice__Group_2__1();

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
    // $ANTLR end "rule__Choice__Group_2__0"


    // $ANTLR start "rule__Choice__Group_2__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2212:1: rule__Choice__Group_2__0__Impl : ( '|' ) ;
    public final void rule__Choice__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2216:1: ( ( '|' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2217:1: ( '|' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2217:1: ( '|' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2218:1: '|'
            {
             before(grammarAccess.getChoiceAccess().getVerticalLineKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__Choice__Group_2__0__Impl4430); 
             after(grammarAccess.getChoiceAccess().getVerticalLineKeyword_2_0()); 

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
    // $ANTLR end "rule__Choice__Group_2__0__Impl"


    // $ANTLR start "rule__Choice__Group_2__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2231:1: rule__Choice__Group_2__1 : rule__Choice__Group_2__1__Impl ;
    public final void rule__Choice__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2235:1: ( rule__Choice__Group_2__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2236:2: rule__Choice__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Choice__Group_2__1__Impl_in_rule__Choice__Group_2__14461);
            rule__Choice__Group_2__1__Impl();

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
    // $ANTLR end "rule__Choice__Group_2__1"


    // $ANTLR start "rule__Choice__Group_2__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2242:1: rule__Choice__Group_2__1__Impl : ( ( rule__Choice__OptionsAssignment_2_1 ) ) ;
    public final void rule__Choice__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2246:1: ( ( ( rule__Choice__OptionsAssignment_2_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2247:1: ( ( rule__Choice__OptionsAssignment_2_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2247:1: ( ( rule__Choice__OptionsAssignment_2_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2248:1: ( rule__Choice__OptionsAssignment_2_1 )
            {
             before(grammarAccess.getChoiceAccess().getOptionsAssignment_2_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2249:1: ( rule__Choice__OptionsAssignment_2_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2249:2: rule__Choice__OptionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Choice__OptionsAssignment_2_1_in_rule__Choice__Group_2__1__Impl4488);
            rule__Choice__OptionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getOptionsAssignment_2_1()); 

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
    // $ANTLR end "rule__Choice__Group_2__1__Impl"


    // $ANTLR start "rule__ObjectMaybe__Group_0__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2263:1: rule__ObjectMaybe__Group_0__0 : rule__ObjectMaybe__Group_0__0__Impl rule__ObjectMaybe__Group_0__1 ;
    public final void rule__ObjectMaybe__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2267:1: ( rule__ObjectMaybe__Group_0__0__Impl rule__ObjectMaybe__Group_0__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2268:2: rule__ObjectMaybe__Group_0__0__Impl rule__ObjectMaybe__Group_0__1
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Group_0__0__Impl_in_rule__ObjectMaybe__Group_0__04522);
            rule__ObjectMaybe__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectMaybe__Group_0__1_in_rule__ObjectMaybe__Group_0__04525);
            rule__ObjectMaybe__Group_0__1();

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
    // $ANTLR end "rule__ObjectMaybe__Group_0__0"


    // $ANTLR start "rule__ObjectMaybe__Group_0__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2275:1: rule__ObjectMaybe__Group_0__0__Impl : ( '(' ) ;
    public final void rule__ObjectMaybe__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2279:1: ( ( '(' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2280:1: ( '(' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2280:1: ( '(' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2281:1: '('
            {
             before(grammarAccess.getObjectMaybeAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__ObjectMaybe__Group_0__0__Impl4553); 
             after(grammarAccess.getObjectMaybeAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__ObjectMaybe__Group_0__0__Impl"


    // $ANTLR start "rule__ObjectMaybe__Group_0__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2294:1: rule__ObjectMaybe__Group_0__1 : rule__ObjectMaybe__Group_0__1__Impl ;
    public final void rule__ObjectMaybe__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2298:1: ( rule__ObjectMaybe__Group_0__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2299:2: rule__ObjectMaybe__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Group_0__1__Impl_in_rule__ObjectMaybe__Group_0__14584);
            rule__ObjectMaybe__Group_0__1__Impl();

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
    // $ANTLR end "rule__ObjectMaybe__Group_0__1"


    // $ANTLR start "rule__ObjectMaybe__Group_0__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2305:1: rule__ObjectMaybe__Group_0__1__Impl : ( ( rule__ObjectMaybe__ObjectAssignment_0_1 ) ) ;
    public final void rule__ObjectMaybe__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2309:1: ( ( ( rule__ObjectMaybe__ObjectAssignment_0_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2310:1: ( ( rule__ObjectMaybe__ObjectAssignment_0_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2310:1: ( ( rule__ObjectMaybe__ObjectAssignment_0_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2311:1: ( rule__ObjectMaybe__ObjectAssignment_0_1 )
            {
             before(grammarAccess.getObjectMaybeAccess().getObjectAssignment_0_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2312:1: ( rule__ObjectMaybe__ObjectAssignment_0_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2312:2: rule__ObjectMaybe__ObjectAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__ObjectAssignment_0_1_in_rule__ObjectMaybe__Group_0__1__Impl4611);
            rule__ObjectMaybe__ObjectAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectMaybeAccess().getObjectAssignment_0_1()); 

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
    // $ANTLR end "rule__ObjectMaybe__Group_0__1__Impl"


    // $ANTLR start "rule__ObjectMaybe__Group_1__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2326:1: rule__ObjectMaybe__Group_1__0 : rule__ObjectMaybe__Group_1__0__Impl rule__ObjectMaybe__Group_1__1 ;
    public final void rule__ObjectMaybe__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2330:1: ( rule__ObjectMaybe__Group_1__0__Impl rule__ObjectMaybe__Group_1__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2331:2: rule__ObjectMaybe__Group_1__0__Impl rule__ObjectMaybe__Group_1__1
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__0__Impl_in_rule__ObjectMaybe__Group_1__04645);
            rule__ObjectMaybe__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__1_in_rule__ObjectMaybe__Group_1__04648);
            rule__ObjectMaybe__Group_1__1();

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
    // $ANTLR end "rule__ObjectMaybe__Group_1__0"


    // $ANTLR start "rule__ObjectMaybe__Group_1__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2338:1: rule__ObjectMaybe__Group_1__0__Impl : ( ( rule__ObjectMaybe__IdAssignment_1_0 ) ) ;
    public final void rule__ObjectMaybe__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2342:1: ( ( ( rule__ObjectMaybe__IdAssignment_1_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2343:1: ( ( rule__ObjectMaybe__IdAssignment_1_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2343:1: ( ( rule__ObjectMaybe__IdAssignment_1_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2344:1: ( rule__ObjectMaybe__IdAssignment_1_0 )
            {
             before(grammarAccess.getObjectMaybeAccess().getIdAssignment_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2345:1: ( rule__ObjectMaybe__IdAssignment_1_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2345:2: rule__ObjectMaybe__IdAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__IdAssignment_1_0_in_rule__ObjectMaybe__Group_1__0__Impl4675);
            rule__ObjectMaybe__IdAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectMaybeAccess().getIdAssignment_1_0()); 

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
    // $ANTLR end "rule__ObjectMaybe__Group_1__0__Impl"


    // $ANTLR start "rule__ObjectMaybe__Group_1__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2355:1: rule__ObjectMaybe__Group_1__1 : rule__ObjectMaybe__Group_1__1__Impl rule__ObjectMaybe__Group_1__2 ;
    public final void rule__ObjectMaybe__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2359:1: ( rule__ObjectMaybe__Group_1__1__Impl rule__ObjectMaybe__Group_1__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2360:2: rule__ObjectMaybe__Group_1__1__Impl rule__ObjectMaybe__Group_1__2
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__1__Impl_in_rule__ObjectMaybe__Group_1__14705);
            rule__ObjectMaybe__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__2_in_rule__ObjectMaybe__Group_1__14708);
            rule__ObjectMaybe__Group_1__2();

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
    // $ANTLR end "rule__ObjectMaybe__Group_1__1"


    // $ANTLR start "rule__ObjectMaybe__Group_1__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2367:1: rule__ObjectMaybe__Group_1__1__Impl : ( ')' ) ;
    public final void rule__ObjectMaybe__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2371:1: ( ( ')' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2372:1: ( ')' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2372:1: ( ')' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2373:1: ')'
            {
             before(grammarAccess.getObjectMaybeAccess().getRightParenthesisKeyword_1_1()); 
            match(input,31,FOLLOW_31_in_rule__ObjectMaybe__Group_1__1__Impl4736); 
             after(grammarAccess.getObjectMaybeAccess().getRightParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__ObjectMaybe__Group_1__1__Impl"


    // $ANTLR start "rule__ObjectMaybe__Group_1__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2386:1: rule__ObjectMaybe__Group_1__2 : rule__ObjectMaybe__Group_1__2__Impl ;
    public final void rule__ObjectMaybe__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2390:1: ( rule__ObjectMaybe__Group_1__2__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2391:2: rule__ObjectMaybe__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__2__Impl_in_rule__ObjectMaybe__Group_1__24767);
            rule__ObjectMaybe__Group_1__2__Impl();

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
    // $ANTLR end "rule__ObjectMaybe__Group_1__2"


    // $ANTLR start "rule__ObjectMaybe__Group_1__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2397:1: rule__ObjectMaybe__Group_1__2__Impl : ( '?' ) ;
    public final void rule__ObjectMaybe__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2401:1: ( ( '?' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2402:1: ( '?' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2402:1: ( '?' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2403:1: '?'
            {
             before(grammarAccess.getObjectMaybeAccess().getQuestionMarkKeyword_1_2()); 
            match(input,34,FOLLOW_34_in_rule__ObjectMaybe__Group_1__2__Impl4795); 
             after(grammarAccess.getObjectMaybeAccess().getQuestionMarkKeyword_1_2()); 

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
    // $ANTLR end "rule__ObjectMaybe__Group_1__2__Impl"


    // $ANTLR start "rule__DTDSL__ParserNameAssignment_2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2423:1: rule__DTDSL__ParserNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DTDSL__ParserNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2427:1: ( ( RULE_STRING ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2428:1: ( RULE_STRING )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2428:1: ( RULE_STRING )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2429:1: RULE_STRING
            {
             before(grammarAccess.getDTDSLAccess().getParserNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DTDSL__ParserNameAssignment_24837); 
             after(grammarAccess.getDTDSLAccess().getParserNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DTDSL__ParserNameAssignment_2"


    // $ANTLR start "rule__DTDSL__TypeAssignment_6"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2438:1: rule__DTDSL__TypeAssignment_6 : ( ( rule__DTDSL__TypeAlternatives_6_0 ) ) ;
    public final void rule__DTDSL__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2442:1: ( ( ( rule__DTDSL__TypeAlternatives_6_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2443:1: ( ( rule__DTDSL__TypeAlternatives_6_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2443:1: ( ( rule__DTDSL__TypeAlternatives_6_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2444:1: ( rule__DTDSL__TypeAlternatives_6_0 )
            {
             before(grammarAccess.getDTDSLAccess().getTypeAlternatives_6_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2445:1: ( rule__DTDSL__TypeAlternatives_6_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2445:2: rule__DTDSL__TypeAlternatives_6_0
            {
            pushFollow(FOLLOW_rule__DTDSL__TypeAlternatives_6_0_in_rule__DTDSL__TypeAssignment_64868);
            rule__DTDSL__TypeAlternatives_6_0();

            state._fsp--;


            }

             after(grammarAccess.getDTDSLAccess().getTypeAlternatives_6_0()); 

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
    // $ANTLR end "rule__DTDSL__TypeAssignment_6"


    // $ANTLR start "rule__DTDSL__ImportsAssignment_8"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2454:1: rule__DTDSL__ImportsAssignment_8 : ( ruleimportStatement ) ;
    public final void rule__DTDSL__ImportsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2458:1: ( ( ruleimportStatement ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2459:1: ( ruleimportStatement )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2459:1: ( ruleimportStatement )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2460:1: ruleimportStatement
            {
             before(grammarAccess.getDTDSLAccess().getImportsImportStatementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleimportStatement_in_rule__DTDSL__ImportsAssignment_84901);
            ruleimportStatement();

            state._fsp--;

             after(grammarAccess.getDTDSLAccess().getImportsImportStatementParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__DTDSL__ImportsAssignment_8"


    // $ANTLR start "rule__DTDSL__ObjDescriptionAssignment_9"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2469:1: rule__DTDSL__ObjDescriptionAssignment_9 : ( ruleAbstract ) ;
    public final void rule__DTDSL__ObjDescriptionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2473:1: ( ( ruleAbstract ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2474:1: ( ruleAbstract )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2474:1: ( ruleAbstract )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2475:1: ruleAbstract
            {
             before(grammarAccess.getDTDSLAccess().getObjDescriptionAbstractParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleAbstract_in_rule__DTDSL__ObjDescriptionAssignment_94932);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getDTDSLAccess().getObjDescriptionAbstractParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__DTDSL__ObjDescriptionAssignment_9"


    // $ANTLR start "rule__DTDSL__StartAssignment_10"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2484:1: rule__DTDSL__StartAssignment_10 : ( ruleStartPoint ) ;
    public final void rule__DTDSL__StartAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2488:1: ( ( ruleStartPoint ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2489:1: ( ruleStartPoint )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2489:1: ( ruleStartPoint )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2490:1: ruleStartPoint
            {
             before(grammarAccess.getDTDSLAccess().getStartStartPointParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleStartPoint_in_rule__DTDSL__StartAssignment_104963);
            ruleStartPoint();

            state._fsp--;

             after(grammarAccess.getDTDSLAccess().getStartStartPointParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__DTDSL__StartAssignment_10"


    // $ANTLR start "rule__ImportStatement__ImportClassAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2499:1: rule__ImportStatement__ImportClassAssignment_1 : ( RULE_ID ) ;
    public final void rule__ImportStatement__ImportClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2503:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2504:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2504:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2505:1: RULE_ID
            {
             before(grammarAccess.getImportStatementAccess().getImportClassIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImportStatement__ImportClassAssignment_14994); 
             after(grammarAccess.getImportStatementAccess().getImportClassIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ImportStatement__ImportClassAssignment_1"


    // $ANTLR start "rule__StartPoint__BeginAssignment_2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2514:1: rule__StartPoint__BeginAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StartPoint__BeginAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2518:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2519:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2519:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2520:1: ( RULE_ID )
            {
             before(grammarAccess.getStartPointAccess().getBeginObjectDescriptionCrossReference_2_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2521:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2522:1: RULE_ID
            {
             before(grammarAccess.getStartPointAccess().getBeginObjectDescriptionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartPoint__BeginAssignment_25029); 
             after(grammarAccess.getStartPointAccess().getBeginObjectDescriptionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStartPointAccess().getBeginObjectDescriptionCrossReference_2_0()); 

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
    // $ANTLR end "rule__StartPoint__BeginAssignment_2"


    // $ANTLR start "rule__ObjectDescription__NameAssignment_0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2533:1: rule__ObjectDescription__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ObjectDescription__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2537:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2538:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2538:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2539:1: RULE_ID
            {
             before(grammarAccess.getObjectDescriptionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectDescription__NameAssignment_05064); 
             after(grammarAccess.getObjectDescriptionAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ObjectDescription__NameAssignment_0"


    // $ANTLR start "rule__ObjectDescription__DescriptionAssignment_3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2548:1: rule__ObjectDescription__DescriptionAssignment_3 : ( ruleObjectDescriptionInner ) ;
    public final void rule__ObjectDescription__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2552:1: ( ( ruleObjectDescriptionInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2553:1: ( ruleObjectDescriptionInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2553:1: ( ruleObjectDescriptionInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2554:1: ruleObjectDescriptionInner
            {
             before(grammarAccess.getObjectDescriptionAccess().getDescriptionObjectDescriptionInnerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleObjectDescriptionInner_in_rule__ObjectDescription__DescriptionAssignment_35095);
            ruleObjectDescriptionInner();

            state._fsp--;

             after(grammarAccess.getObjectDescriptionAccess().getDescriptionObjectDescriptionInnerParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ObjectDescription__DescriptionAssignment_3"


    // $ANTLR start "rule__ObjectAttribute__AttributesAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2563:1: rule__ObjectAttribute__AttributesAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectAttribute__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2567:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2568:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2568:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2569:1: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectAttribute__AttributesAssignment_15126); 
             after(grammarAccess.getObjectAttributeAccess().getAttributesIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__AttributesAssignment_1"


    // $ANTLR start "rule__ObjectAttribute__TypesAssignment_3_0_0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2578:1: rule__ObjectAttribute__TypesAssignment_3_0_0 : ( ruleType ) ;
    public final void rule__ObjectAttribute__TypesAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2582:1: ( ( ruleType ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2583:1: ( ruleType )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2583:1: ( ruleType )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2584:1: ruleType
            {
             before(grammarAccess.getObjectAttributeAccess().getTypesTypeParserRuleCall_3_0_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__ObjectAttribute__TypesAssignment_3_0_05157);
            ruleType();

            state._fsp--;

             after(grammarAccess.getObjectAttributeAccess().getTypesTypeParserRuleCall_3_0_0_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__TypesAssignment_3_0_0"


    // $ANTLR start "rule__ObjectAttribute__KeywordAssignment_3_0_2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2593:1: rule__ObjectAttribute__KeywordAssignment_3_0_2 : ( ruleKeyword ) ;
    public final void rule__ObjectAttribute__KeywordAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2597:1: ( ( ruleKeyword ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2598:1: ( ruleKeyword )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2598:1: ( ruleKeyword )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2599:1: ruleKeyword
            {
             before(grammarAccess.getObjectAttributeAccess().getKeywordKeywordParserRuleCall_3_0_2_0()); 
            pushFollow(FOLLOW_ruleKeyword_in_rule__ObjectAttribute__KeywordAssignment_3_0_25188);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getObjectAttributeAccess().getKeywordKeywordParserRuleCall_3_0_2_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__KeywordAssignment_3_0_2"


    // $ANTLR start "rule__ObjectAttribute__InnerAssignment_3_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2608:1: rule__ObjectAttribute__InnerAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__InnerAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2612:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2613:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2613:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2614:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getInnerObjectDescriptionCrossReference_3_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2615:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2616:1: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getInnerObjectDescriptionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectAttribute__InnerAssignment_3_15223); 
             after(grammarAccess.getObjectAttributeAccess().getInnerObjectDescriptionIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getObjectAttributeAccess().getInnerObjectDescriptionCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__InnerAssignment_3_1"


    // $ANTLR start "rule__ObjectNext__AttributeAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2627:1: rule__ObjectNext__AttributeAssignment_1 : ( ruleJavaCodeOrID ) ;
    public final void rule__ObjectNext__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2631:1: ( ( ruleJavaCodeOrID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2632:1: ( ruleJavaCodeOrID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2632:1: ( ruleJavaCodeOrID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2633:1: ruleJavaCodeOrID
            {
             before(grammarAccess.getObjectNextAccess().getAttributeJavaCodeOrIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_rule__ObjectNext__AttributeAssignment_15258);
            ruleJavaCodeOrID();

            state._fsp--;

             after(grammarAccess.getObjectNextAccess().getAttributeJavaCodeOrIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ObjectNext__AttributeAssignment_1"


    // $ANTLR start "rule__ObjectNext__ObjectDesriptionAssignment_3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2642:1: rule__ObjectNext__ObjectDesriptionAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectNext__ObjectDesriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2646:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2647:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2647:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2648:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectNextAccess().getObjectDesriptionObjectDescriptionCrossReference_3_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2649:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2650:1: RULE_ID
            {
             before(grammarAccess.getObjectNextAccess().getObjectDesriptionObjectDescriptionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectNext__ObjectDesriptionAssignment_35293); 
             after(grammarAccess.getObjectNextAccess().getObjectDesriptionObjectDescriptionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getObjectNextAccess().getObjectDesriptionObjectDescriptionCrossReference_3_0()); 

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
    // $ANTLR end "rule__ObjectNext__ObjectDesriptionAssignment_3"


    // $ANTLR start "rule__JavaCodeOrID__CodeAssignment_0_2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2661:1: rule__JavaCodeOrID__CodeAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__JavaCodeOrID__CodeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2665:1: ( ( RULE_STRING ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2666:1: ( RULE_STRING )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2666:1: ( RULE_STRING )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2667:1: RULE_STRING
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getCodeSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JavaCodeOrID__CodeAssignment_0_25328); 
             after(grammarAccess.getJavaCodeOrIDAccess().getCodeSTRINGTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__JavaCodeOrID__CodeAssignment_0_2"


    // $ANTLR start "rule__JavaCodeOrID__IdAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2676:1: rule__JavaCodeOrID__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__JavaCodeOrID__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2680:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2681:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2681:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2682:1: RULE_ID
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JavaCodeOrID__IdAssignment_15359); 
             after(grammarAccess.getJavaCodeOrIDAccess().getIdIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__JavaCodeOrID__IdAssignment_1"


    // $ANTLR start "rule__Many__DescriptionAssignment_2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2691:1: rule__Many__DescriptionAssignment_2 : ( ruleObjectDescriptionInner ) ;
    public final void rule__Many__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2695:1: ( ( ruleObjectDescriptionInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2696:1: ( ruleObjectDescriptionInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2696:1: ( ruleObjectDescriptionInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2697:1: ruleObjectDescriptionInner
            {
             before(grammarAccess.getManyAccess().getDescriptionObjectDescriptionInnerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleObjectDescriptionInner_in_rule__Many__DescriptionAssignment_25390);
            ruleObjectDescriptionInner();

            state._fsp--;

             after(grammarAccess.getManyAccess().getDescriptionObjectDescriptionInnerParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Many__DescriptionAssignment_2"


    // $ANTLR start "rule__Choice__OptionsAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2706:1: rule__Choice__OptionsAssignment_1 : ( ruleKeyword ) ;
    public final void rule__Choice__OptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2710:1: ( ( ruleKeyword ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2711:1: ( ruleKeyword )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2711:1: ( ruleKeyword )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2712:1: ruleKeyword
            {
             before(grammarAccess.getChoiceAccess().getOptionsKeywordParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleKeyword_in_rule__Choice__OptionsAssignment_15421);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getOptionsKeywordParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Choice__OptionsAssignment_1"


    // $ANTLR start "rule__Choice__OptionsAssignment_2_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2721:1: rule__Choice__OptionsAssignment_2_1 : ( ruleKeyword ) ;
    public final void rule__Choice__OptionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2725:1: ( ( ruleKeyword ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2726:1: ( ruleKeyword )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2726:1: ( ruleKeyword )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2727:1: ruleKeyword
            {
             before(grammarAccess.getChoiceAccess().getOptionsKeywordParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleKeyword_in_rule__Choice__OptionsAssignment_2_15452);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getOptionsKeywordParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Choice__OptionsAssignment_2_1"


    // $ANTLR start "rule__ObjectMaybe__ObjectAssignment_0_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2736:1: rule__ObjectMaybe__ObjectAssignment_0_1 : ( ruleAbstract ) ;
    public final void rule__ObjectMaybe__ObjectAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2740:1: ( ( ruleAbstract ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2741:1: ( ruleAbstract )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2741:1: ( ruleAbstract )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2742:1: ruleAbstract
            {
             before(grammarAccess.getObjectMaybeAccess().getObjectAbstractParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleAbstract_in_rule__ObjectMaybe__ObjectAssignment_0_15483);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getObjectMaybeAccess().getObjectAbstractParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__ObjectMaybe__ObjectAssignment_0_1"


    // $ANTLR start "rule__ObjectMaybe__IdAssignment_1_0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2751:1: rule__ObjectMaybe__IdAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectMaybe__IdAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2755:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2756:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2756:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2757:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectMaybeAccess().getIdObjectDescriptionCrossReference_1_0_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2758:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2759:1: RULE_ID
            {
             before(grammarAccess.getObjectMaybeAccess().getIdObjectDescriptionIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectMaybe__IdAssignment_1_05518); 
             after(grammarAccess.getObjectMaybeAccess().getIdObjectDescriptionIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getObjectMaybeAccess().getIdObjectDescriptionCrossReference_1_0_0()); 

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
    // $ANTLR end "rule__ObjectMaybe__IdAssignment_1_0"


    // $ANTLR start "rule__Keyword__NameAssignment_0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2770:1: rule__Keyword__NameAssignment_0 : ( ( 'Key' ) ) ;
    public final void rule__Keyword__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2774:1: ( ( ( 'Key' ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2775:1: ( ( 'Key' ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2775:1: ( ( 'Key' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2776:1: ( 'Key' )
            {
             before(grammarAccess.getKeywordAccess().getNameKeyKeyword_0_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2777:1: ( 'Key' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2778:1: 'Key'
            {
             before(grammarAccess.getKeywordAccess().getNameKeyKeyword_0_0()); 
            match(input,35,FOLLOW_35_in_rule__Keyword__NameAssignment_05558); 
             after(grammarAccess.getKeywordAccess().getNameKeyKeyword_0_0()); 

            }

             after(grammarAccess.getKeywordAccess().getNameKeyKeyword_0_0()); 

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
    // $ANTLR end "rule__Keyword__NameAssignment_0"


    // $ANTLR start "rule__Keyword__NameAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2793:1: rule__Keyword__NameAssignment_1 : ( ( 'Value' ) ) ;
    public final void rule__Keyword__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2797:1: ( ( ( 'Value' ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2798:1: ( ( 'Value' ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2798:1: ( ( 'Value' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2799:1: ( 'Value' )
            {
             before(grammarAccess.getKeywordAccess().getNameValueKeyword_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2800:1: ( 'Value' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2801:1: 'Value'
            {
             before(grammarAccess.getKeywordAccess().getNameValueKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__Keyword__NameAssignment_15602); 
             after(grammarAccess.getKeywordAccess().getNameValueKeyword_1_0()); 

            }

             after(grammarAccess.getKeywordAccess().getNameValueKeyword_1_0()); 

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
    // $ANTLR end "rule__Keyword__NameAssignment_1"


    // $ANTLR start "rule__Keyword__NameAssignment_2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2816:1: rule__Keyword__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Keyword__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2820:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2821:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2821:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2822:1: RULE_ID
            {
             before(grammarAccess.getKeywordAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Keyword__NameAssignment_25641); 
             after(grammarAccess.getKeywordAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Keyword__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDTDSL_in_entryRuleDTDSL61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDTDSL68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__0_in_ruleDTDSL94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimportStatement_in_entryRuleimportStatement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleimportStatement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportStatement__Group__0_in_ruleimportStatement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartPoint_in_entryRuleStartPoint181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartPoint188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group__0_in_ruleStartPoint214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Alternatives_in_ruleAbstract274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescription308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__0_in_ruleObjectDescription334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescriptionInner368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Alternatives_in_ruleObjectDescriptionInner394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectAttribute428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__0_in_ruleObjectAttribute454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_entryRuleObjectNext481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectNext488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__0_in_ruleObjectNext514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaCodeOrID548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Alternatives_in_ruleJavaCodeOrID574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMany_in_entryRuleMany661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMany668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Many__Group__0_in_ruleMany694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0_in_ruleChoice754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMaybe788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Alternatives_in_ruleObjectMaybe814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyword_in_entryRuleKeyword841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyword848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Keyword__Alternatives_in_ruleKeyword874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DTDSL__TypeAlternatives_6_0911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DTDSL__TypeAlternatives_6_0931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescription_in_rule__Abstract__Alternatives965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_rule__Abstract__Alternatives982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMany_in_rule__Abstract__Alternatives999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_rule__ObjectDescriptionInner__Alternatives1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_rule__ObjectDescriptionInner__Alternatives1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_rule__ObjectDescriptionInner__Alternatives1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_3_0__0_in_rule__ObjectAttribute__Alternatives_31097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__InnerAssignment_3_1_in_rule__ObjectAttribute__Alternatives_31115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__0_in_rule__JavaCodeOrID__Alternatives1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__IdAssignment_1_in_rule__JavaCodeOrID__Alternatives1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__Alternatives1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__Alternatives1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type__Alternatives1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_0__0_in_rule__ObjectMaybe__Alternatives1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__0_in_rule__ObjectMaybe__Alternatives1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Keyword__NameAssignment_0_in_rule__Keyword__Alternatives1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Keyword__NameAssignment_1_in_rule__Keyword__Alternatives1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Keyword__NameAssignment_2_in_rule__Keyword__Alternatives1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__0__Impl_in_rule__DTDSL__Group__01392 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__1_in_rule__DTDSL__Group__01395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DTDSL__Group__0__Impl1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__1__Impl_in_rule__DTDSL__Group__11454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__2_in_rule__DTDSL__Group__11457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DTDSL__Group__1__Impl1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__2__Impl_in_rule__DTDSL__Group__21516 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__3_in_rule__DTDSL__Group__21519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__ParserNameAssignment_2_in_rule__DTDSL__Group__2__Impl1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__3__Impl_in_rule__DTDSL__Group__31576 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__4_in_rule__DTDSL__Group__31579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DTDSL__Group__3__Impl1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__4__Impl_in_rule__DTDSL__Group__41638 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__5_in_rule__DTDSL__Group__41641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DTDSL__Group__4__Impl1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__5__Impl_in_rule__DTDSL__Group__51700 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__6_in_rule__DTDSL__Group__51703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DTDSL__Group__5__Impl1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__6__Impl_in_rule__DTDSL__Group__61762 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__7_in_rule__DTDSL__Group__61765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__TypeAssignment_6_in_rule__DTDSL__Group__6__Impl1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__7__Impl_in_rule__DTDSL__Group__71822 = new BitSet(new long[]{0x0000000040300020L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__8_in_rule__DTDSL__Group__71825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DTDSL__Group__7__Impl1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__8__Impl_in_rule__DTDSL__Group__81884 = new BitSet(new long[]{0x0000000040300020L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__9_in_rule__DTDSL__Group__81887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__ImportsAssignment_8_in_rule__DTDSL__Group__8__Impl1914 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__9__Impl_in_rule__DTDSL__Group__91945 = new BitSet(new long[]{0x0000000040300020L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__10_in_rule__DTDSL__Group__91948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__ObjDescriptionAssignment_9_in_rule__DTDSL__Group__9__Impl1975 = new BitSet(new long[]{0x0000000040000022L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__10__Impl_in_rule__DTDSL__Group__102006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__StartAssignment_10_in_rule__DTDSL__Group__10__Impl2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportStatement__Group__0__Impl_in_rule__ImportStatement__Group__02085 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ImportStatement__Group__1_in_rule__ImportStatement__Group__02088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ImportStatement__Group__0__Impl2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportStatement__Group__1__Impl_in_rule__ImportStatement__Group__12147 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ImportStatement__Group__2_in_rule__ImportStatement__Group__12150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportStatement__ImportClassAssignment_1_in_rule__ImportStatement__Group__1__Impl2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportStatement__Group__2__Impl_in_rule__ImportStatement__Group__22207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ImportStatement__Group__2__Impl2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group__0__Impl_in_rule__StartPoint__Group__02272 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__StartPoint__Group__1_in_rule__StartPoint__Group__02275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StartPoint__Group__0__Impl2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group__1__Impl_in_rule__StartPoint__Group__12334 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StartPoint__Group__2_in_rule__StartPoint__Group__12337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StartPoint__Group__1__Impl2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group__2__Impl_in_rule__StartPoint__Group__22396 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__StartPoint__Group__3_in_rule__StartPoint__Group__22399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__BeginAssignment_2_in_rule__StartPoint__Group__2__Impl2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group__3__Impl_in_rule__StartPoint__Group__32456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StartPoint__Group__3__Impl2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__0__Impl_in_rule__ObjectDescription__Group__02523 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__1_in_rule__ObjectDescription__Group__02526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__NameAssignment_0_in_rule__ObjectDescription__Group__0__Impl2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__1__Impl_in_rule__ObjectDescription__Group__12583 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__2_in_rule__ObjectDescription__Group__12586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ObjectDescription__Group__1__Impl2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__2__Impl_in_rule__ObjectDescription__Group__22645 = new BitSet(new long[]{0x0000000053000020L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__3_in_rule__ObjectDescription__Group__22648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ObjectDescription__Group__2__Impl2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__3__Impl_in_rule__ObjectDescription__Group__32707 = new BitSet(new long[]{0x0000000053000020L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__4_in_rule__ObjectDescription__Group__32710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__DescriptionAssignment_3_in_rule__ObjectDescription__Group__3__Impl2737 = new BitSet(new long[]{0x0000000052000022L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__4__Impl_in_rule__ObjectDescription__Group__42768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ObjectDescription__Group__4__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__0__Impl_in_rule__ObjectAttribute__Group__02837 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__1_in_rule__ObjectAttribute__Group__02840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ObjectAttribute__Group__0__Impl2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__1__Impl_in_rule__ObjectAttribute__Group__12899 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__2_in_rule__ObjectAttribute__Group__12902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__AttributesAssignment_1_in_rule__ObjectAttribute__Group__1__Impl2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__2__Impl_in_rule__ObjectAttribute__Group__22959 = new BitSet(new long[]{0x000000000000E020L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__3_in_rule__ObjectAttribute__Group__22962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ObjectAttribute__Group__2__Impl2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__3__Impl_in_rule__ObjectAttribute__Group__33021 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__4_in_rule__ObjectAttribute__Group__33024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Alternatives_3_in_rule__ObjectAttribute__Group__3__Impl3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__4__Impl_in_rule__ObjectAttribute__Group__43081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ObjectAttribute__Group__4__Impl3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_3_0__0__Impl_in_rule__ObjectAttribute__Group_3_0__03150 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_3_0__1_in_rule__ObjectAttribute__Group_3_0__03153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__TypesAssignment_3_0_0_in_rule__ObjectAttribute__Group_3_0__0__Impl3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_3_0__1__Impl_in_rule__ObjectAttribute__Group_3_0__13210 = new BitSet(new long[]{0x0000001800000020L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_3_0__2_in_rule__ObjectAttribute__Group_3_0__13213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ObjectAttribute__Group_3_0__1__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_3_0__2__Impl_in_rule__ObjectAttribute__Group_3_0__23272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__KeywordAssignment_3_0_2_in_rule__ObjectAttribute__Group_3_0__2__Impl3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__0__Impl_in_rule__ObjectNext__Group__03335 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__1_in_rule__ObjectNext__Group__03338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ObjectNext__Group__0__Impl3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__1__Impl_in_rule__ObjectNext__Group__13397 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__2_in_rule__ObjectNext__Group__13400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__AttributeAssignment_1_in_rule__ObjectNext__Group__1__Impl3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__2__Impl_in_rule__ObjectNext__Group__23457 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__3_in_rule__ObjectNext__Group__23460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ObjectNext__Group__2__Impl3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__3__Impl_in_rule__ObjectNext__Group__33519 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__4_in_rule__ObjectNext__Group__33522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__ObjectDesriptionAssignment_3_in_rule__ObjectNext__Group__3__Impl3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__4__Impl_in_rule__ObjectNext__Group__43579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ObjectNext__Group__4__Impl3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__0__Impl_in_rule__JavaCodeOrID__Group_0__03648 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__1_in_rule__JavaCodeOrID__Group_0__03651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__JavaCodeOrID__Group_0__0__Impl3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__1__Impl_in_rule__JavaCodeOrID__Group_0__13710 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__2_in_rule__JavaCodeOrID__Group_0__13713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JavaCodeOrID__Group_0__1__Impl3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__2__Impl_in_rule__JavaCodeOrID__Group_0__23772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__CodeAssignment_0_2_in_rule__JavaCodeOrID__Group_0__2__Impl3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Many__Group__0__Impl_in_rule__Many__Group__03835 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__Many__Group__1_in_rule__Many__Group__03838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Many__Group__1__Impl_in_rule__Many__Group__13896 = new BitSet(new long[]{0x0000000052000020L});
    public static final BitSet FOLLOW_rule__Many__Group__2_in_rule__Many__Group__13899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Many__Group__1__Impl3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Many__Group__2__Impl_in_rule__Many__Group__23958 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Many__Group__3_in_rule__Many__Group__23961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Many__DescriptionAssignment_2_in_rule__Many__Group__2__Impl3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Many__Group__3__Impl_in_rule__Many__Group__34018 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Many__Group__4_in_rule__Many__Group__34021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Many__Group__3__Impl4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Many__Group__4__Impl_in_rule__Many__Group__44080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Many__Group__4__Impl4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__04149 = new BitSet(new long[]{0x0000001800000020L});
    public static final BitSet FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__04152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Choice__Group__0__Impl4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__14211 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__14214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__OptionsAssignment_1_in_rule__Choice__Group__1__Impl4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__24271 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_rule__Choice__Group__3_in_rule__Choice__Group__24274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group_2__0_in_rule__Choice__Group__2__Impl4301 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__3__Impl_in_rule__Choice__Group__34332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Choice__Group__3__Impl4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group_2__0__Impl_in_rule__Choice__Group_2__04399 = new BitSet(new long[]{0x0000001800000020L});
    public static final BitSet FOLLOW_rule__Choice__Group_2__1_in_rule__Choice__Group_2__04402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Choice__Group_2__0__Impl4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group_2__1__Impl_in_rule__Choice__Group_2__14461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__OptionsAssignment_2_1_in_rule__Choice__Group_2__1__Impl4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_0__0__Impl_in_rule__ObjectMaybe__Group_0__04522 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_0__1_in_rule__ObjectMaybe__Group_0__04525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ObjectMaybe__Group_0__0__Impl4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_0__1__Impl_in_rule__ObjectMaybe__Group_0__14584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__ObjectAssignment_0_1_in_rule__ObjectMaybe__Group_0__1__Impl4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__0__Impl_in_rule__ObjectMaybe__Group_1__04645 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__1_in_rule__ObjectMaybe__Group_1__04648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__IdAssignment_1_0_in_rule__ObjectMaybe__Group_1__0__Impl4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__1__Impl_in_rule__ObjectMaybe__Group_1__14705 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__2_in_rule__ObjectMaybe__Group_1__14708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ObjectMaybe__Group_1__1__Impl4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__2__Impl_in_rule__ObjectMaybe__Group_1__24767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ObjectMaybe__Group_1__2__Impl4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DTDSL__ParserNameAssignment_24837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__TypeAlternatives_6_0_in_rule__DTDSL__TypeAssignment_64868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimportStatement_in_rule__DTDSL__ImportsAssignment_84901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_rule__DTDSL__ObjDescriptionAssignment_94932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartPoint_in_rule__DTDSL__StartAssignment_104963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImportStatement__ImportClassAssignment_14994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartPoint__BeginAssignment_25029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectDescription__NameAssignment_05064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_rule__ObjectDescription__DescriptionAssignment_35095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectAttribute__AttributesAssignment_15126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ObjectAttribute__TypesAssignment_3_0_05157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyword_in_rule__ObjectAttribute__KeywordAssignment_3_0_25188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectAttribute__InnerAssignment_3_15223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_rule__ObjectNext__AttributeAssignment_15258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectNext__ObjectDesriptionAssignment_35293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JavaCodeOrID__CodeAssignment_0_25328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JavaCodeOrID__IdAssignment_15359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_rule__Many__DescriptionAssignment_25390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyword_in_rule__Choice__OptionsAssignment_15421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyword_in_rule__Choice__OptionsAssignment_2_15452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_rule__ObjectMaybe__ObjectAssignment_0_15483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectMaybe__IdAssignment_1_05518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Keyword__NameAssignment_05558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Keyword__NameAssignment_15602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Keyword__NameAssignment_25641 = new BitSet(new long[]{0x0000000000000002L});

}