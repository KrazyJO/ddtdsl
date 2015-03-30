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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Key'", "'Value'", "'javaObject'", "'string'", "'parserName'", "'='", "';'", "'parserType'", "'beginWith'", "'String'", "':'", "'{'", "'}'", "'Node'", "'hasAttribute'", "'as'", "'hasNode'", "'hasNext'", "'java'", "'*'", "'('", "')'", "'|'", "'?'"
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
    public static final int T__14=14;
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


    // $ANTLR start "entryRuleStartPoint"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:88:1: entryRuleStartPoint : ruleStartPoint EOF ;
    public final void entryRuleStartPoint() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:89:1: ( ruleStartPoint EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:90:1: ruleStartPoint EOF
            {
             before(grammarAccess.getStartPointRule()); 
            pushFollow(FOLLOW_ruleStartPoint_in_entryRuleStartPoint121);
            ruleStartPoint();

            state._fsp--;

             after(grammarAccess.getStartPointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartPoint128); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:97:1: ruleStartPoint : ( ( rule__StartPoint__Alternatives ) ) ;
    public final void ruleStartPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:101:2: ( ( ( rule__StartPoint__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:102:1: ( ( rule__StartPoint__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:102:1: ( ( rule__StartPoint__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:103:1: ( rule__StartPoint__Alternatives )
            {
             before(grammarAccess.getStartPointAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:104:1: ( rule__StartPoint__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:104:2: rule__StartPoint__Alternatives
            {
            pushFollow(FOLLOW_rule__StartPoint__Alternatives_in_ruleStartPoint154);
            rule__StartPoint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStartPointAccess().getAlternatives()); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:116:1: entryRuleAbstract : ruleAbstract EOF ;
    public final void entryRuleAbstract() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:117:1: ( ruleAbstract EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:118:1: ruleAbstract EOF
            {
             before(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract181);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getAbstractRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract188); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:125:1: ruleAbstract : ( ( rule__Abstract__Alternatives ) ) ;
    public final void ruleAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:129:2: ( ( ( rule__Abstract__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:130:1: ( ( rule__Abstract__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:130:1: ( ( rule__Abstract__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:131:1: ( rule__Abstract__Alternatives )
            {
             before(grammarAccess.getAbstractAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:132:1: ( rule__Abstract__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:132:2: rule__Abstract__Alternatives
            {
            pushFollow(FOLLOW_rule__Abstract__Alternatives_in_ruleAbstract214);
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


    // $ANTLR start "entryRuleStringDescription"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:144:1: entryRuleStringDescription : ruleStringDescription EOF ;
    public final void entryRuleStringDescription() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:145:1: ( ruleStringDescription EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:146:1: ruleStringDescription EOF
            {
             before(grammarAccess.getStringDescriptionRule()); 
            pushFollow(FOLLOW_ruleStringDescription_in_entryRuleStringDescription241);
            ruleStringDescription();

            state._fsp--;

             after(grammarAccess.getStringDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringDescription248); 

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
    // $ANTLR end "entryRuleStringDescription"


    // $ANTLR start "ruleStringDescription"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:153:1: ruleStringDescription : ( ( rule__StringDescription__Group__0 ) ) ;
    public final void ruleStringDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:157:2: ( ( ( rule__StringDescription__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:158:1: ( ( rule__StringDescription__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:158:1: ( ( rule__StringDescription__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:159:1: ( rule__StringDescription__Group__0 )
            {
             before(grammarAccess.getStringDescriptionAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:160:1: ( rule__StringDescription__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:160:2: rule__StringDescription__Group__0
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__0_in_ruleStringDescription274);
            rule__StringDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringDescriptionAccess().getGroup()); 

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
    // $ANTLR end "ruleStringDescription"


    // $ANTLR start "entryRuleStringDescriptionInner"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:172:1: entryRuleStringDescriptionInner : ruleStringDescriptionInner EOF ;
    public final void entryRuleStringDescriptionInner() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:173:1: ( ruleStringDescriptionInner EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:174:1: ruleStringDescriptionInner EOF
            {
             before(grammarAccess.getStringDescriptionInnerRule()); 
            pushFollow(FOLLOW_ruleStringDescriptionInner_in_entryRuleStringDescriptionInner301);
            ruleStringDescriptionInner();

            state._fsp--;

             after(grammarAccess.getStringDescriptionInnerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringDescriptionInner308); 

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
    // $ANTLR end "entryRuleStringDescriptionInner"


    // $ANTLR start "ruleStringDescriptionInner"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:181:1: ruleStringDescriptionInner : ( ( rule__StringDescriptionInner__Alternatives ) ) ;
    public final void ruleStringDescriptionInner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:185:2: ( ( ( rule__StringDescriptionInner__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:186:1: ( ( rule__StringDescriptionInner__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:186:1: ( ( rule__StringDescriptionInner__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:187:1: ( rule__StringDescriptionInner__Alternatives )
            {
             before(grammarAccess.getStringDescriptionInnerAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:188:1: ( rule__StringDescriptionInner__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:188:2: rule__StringDescriptionInner__Alternatives
            {
            pushFollow(FOLLOW_rule__StringDescriptionInner__Alternatives_in_ruleStringDescriptionInner334);
            rule__StringDescriptionInner__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringDescriptionInnerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStringDescriptionInner"


    // $ANTLR start "entryRuleStringOverRead"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:202:1: entryRuleStringOverRead : ruleStringOverRead EOF ;
    public final void entryRuleStringOverRead() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:203:1: ( ruleStringOverRead EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:204:1: ruleStringOverRead EOF
            {
             before(grammarAccess.getStringOverReadRule()); 
            pushFollow(FOLLOW_ruleStringOverRead_in_entryRuleStringOverRead363);
            ruleStringOverRead();

            state._fsp--;

             after(grammarAccess.getStringOverReadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringOverRead370); 

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
    // $ANTLR end "entryRuleStringOverRead"


    // $ANTLR start "ruleStringOverRead"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:211:1: ruleStringOverRead : ( RULE_STRING ) ;
    public final void ruleStringOverRead() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:215:2: ( ( RULE_STRING ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:216:1: ( RULE_STRING )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:216:1: ( RULE_STRING )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:217:1: RULE_STRING
            {
             before(grammarAccess.getStringOverReadAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringOverRead396); 
             after(grammarAccess.getStringOverReadAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleStringOverRead"


    // $ANTLR start "entryRuleStringKey"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:230:1: entryRuleStringKey : ruleStringKey EOF ;
    public final void entryRuleStringKey() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:231:1: ( ruleStringKey EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:232:1: ruleStringKey EOF
            {
             before(grammarAccess.getStringKeyRule()); 
            pushFollow(FOLLOW_ruleStringKey_in_entryRuleStringKey422);
            ruleStringKey();

            state._fsp--;

             after(grammarAccess.getStringKeyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringKey429); 

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
    // $ANTLR end "entryRuleStringKey"


    // $ANTLR start "ruleStringKey"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:239:1: ruleStringKey : ( 'Key' ) ;
    public final void ruleStringKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:243:2: ( ( 'Key' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:244:1: ( 'Key' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:244:1: ( 'Key' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:245:1: 'Key'
            {
             before(grammarAccess.getStringKeyAccess().getKeyKeyword()); 
            match(input,11,FOLLOW_11_in_ruleStringKey456); 
             after(grammarAccess.getStringKeyAccess().getKeyKeyword()); 

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
    // $ANTLR end "ruleStringKey"


    // $ANTLR start "entryRuleStringValue"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:260:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:261:1: ( ruleStringValue EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:262:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue484);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue491); 

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:269:1: ruleStringValue : ( 'Value' ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:273:2: ( ( 'Value' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:274:1: ( 'Value' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:274:1: ( 'Value' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:275:1: 'Value'
            {
             before(grammarAccess.getStringValueAccess().getValueKeyword()); 
            match(input,12,FOLLOW_12_in_ruleStringValue518); 
             after(grammarAccess.getStringValueAccess().getValueKeyword()); 

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleObjectDescription"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:290:1: entryRuleObjectDescription : ruleObjectDescription EOF ;
    public final void entryRuleObjectDescription() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:291:1: ( ruleObjectDescription EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:292:1: ruleObjectDescription EOF
            {
             before(grammarAccess.getObjectDescriptionRule()); 
            pushFollow(FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription546);
            ruleObjectDescription();

            state._fsp--;

             after(grammarAccess.getObjectDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescription553); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:299:1: ruleObjectDescription : ( ( rule__ObjectDescription__Group__0 ) ) ;
    public final void ruleObjectDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:303:2: ( ( ( rule__ObjectDescription__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:304:1: ( ( rule__ObjectDescription__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:304:1: ( ( rule__ObjectDescription__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:305:1: ( rule__ObjectDescription__Group__0 )
            {
             before(grammarAccess.getObjectDescriptionAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:306:1: ( rule__ObjectDescription__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:306:2: rule__ObjectDescription__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__0_in_ruleObjectDescription579);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:320:1: entryRuleObjectDescriptionInner : ruleObjectDescriptionInner EOF ;
    public final void entryRuleObjectDescriptionInner() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:321:1: ( ruleObjectDescriptionInner EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:322:1: ruleObjectDescriptionInner EOF
            {
             before(grammarAccess.getObjectDescriptionInnerRule()); 
            pushFollow(FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner608);
            ruleObjectDescriptionInner();

            state._fsp--;

             after(grammarAccess.getObjectDescriptionInnerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescriptionInner615); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:329:1: ruleObjectDescriptionInner : ( ( rule__ObjectDescriptionInner__Group__0 ) ) ;
    public final void ruleObjectDescriptionInner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:333:2: ( ( ( rule__ObjectDescriptionInner__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:334:1: ( ( rule__ObjectDescriptionInner__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:334:1: ( ( rule__ObjectDescriptionInner__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:335:1: ( rule__ObjectDescriptionInner__Group__0 )
            {
             before(grammarAccess.getObjectDescriptionInnerAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:336:1: ( rule__ObjectDescriptionInner__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:336:2: rule__ObjectDescriptionInner__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Group__0_in_ruleObjectDescriptionInner641);
            rule__ObjectDescriptionInner__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectDescriptionInnerAccess().getGroup()); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:348:1: entryRuleObjectAttribute : ruleObjectAttribute EOF ;
    public final void entryRuleObjectAttribute() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:349:1: ( ruleObjectAttribute EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:350:1: ruleObjectAttribute EOF
            {
             before(grammarAccess.getObjectAttributeRule()); 
            pushFollow(FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute668);
            ruleObjectAttribute();

            state._fsp--;

             after(grammarAccess.getObjectAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectAttribute675); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:357:1: ruleObjectAttribute : ( ( rule__ObjectAttribute__Group__0 ) ) ;
    public final void ruleObjectAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:361:2: ( ( ( rule__ObjectAttribute__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:362:1: ( ( rule__ObjectAttribute__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:362:1: ( ( rule__ObjectAttribute__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:363:1: ( rule__ObjectAttribute__Group__0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:364:1: ( rule__ObjectAttribute__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:364:2: rule__ObjectAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__0_in_ruleObjectAttribute701);
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


    // $ANTLR start "entryRuleObjectNode"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:378:1: entryRuleObjectNode : ruleObjectNode EOF ;
    public final void entryRuleObjectNode() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:379:1: ( ruleObjectNode EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:380:1: ruleObjectNode EOF
            {
             before(grammarAccess.getObjectNodeRule()); 
            pushFollow(FOLLOW_ruleObjectNode_in_entryRuleObjectNode730);
            ruleObjectNode();

            state._fsp--;

             after(grammarAccess.getObjectNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectNode737); 

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
    // $ANTLR end "entryRuleObjectNode"


    // $ANTLR start "ruleObjectNode"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:387:1: ruleObjectNode : ( ( rule__ObjectNode__Group__0 ) ) ;
    public final void ruleObjectNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:391:2: ( ( ( rule__ObjectNode__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:392:1: ( ( rule__ObjectNode__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:392:1: ( ( rule__ObjectNode__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:393:1: ( rule__ObjectNode__Group__0 )
            {
             before(grammarAccess.getObjectNodeAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:394:1: ( rule__ObjectNode__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:394:2: rule__ObjectNode__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__0_in_ruleObjectNode763);
            rule__ObjectNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectNodeAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectNode"


    // $ANTLR start "entryRuleObjectNext"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:406:1: entryRuleObjectNext : ruleObjectNext EOF ;
    public final void entryRuleObjectNext() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:407:1: ( ruleObjectNext EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:408:1: ruleObjectNext EOF
            {
             before(grammarAccess.getObjectNextRule()); 
            pushFollow(FOLLOW_ruleObjectNext_in_entryRuleObjectNext790);
            ruleObjectNext();

            state._fsp--;

             after(grammarAccess.getObjectNextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectNext797); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:415:1: ruleObjectNext : ( ( rule__ObjectNext__Group__0 ) ) ;
    public final void ruleObjectNext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:419:2: ( ( ( rule__ObjectNext__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:420:1: ( ( rule__ObjectNext__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:420:1: ( ( rule__ObjectNext__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:421:1: ( rule__ObjectNext__Group__0 )
            {
             before(grammarAccess.getObjectNextAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:422:1: ( rule__ObjectNext__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:422:2: rule__ObjectNext__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__0_in_ruleObjectNext823);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:434:1: entryRuleJavaCodeOrID : ruleJavaCodeOrID EOF ;
    public final void entryRuleJavaCodeOrID() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:435:1: ( ruleJavaCodeOrID EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:436:1: ruleJavaCodeOrID EOF
            {
             before(grammarAccess.getJavaCodeOrIDRule()); 
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID850);
            ruleJavaCodeOrID();

            state._fsp--;

             after(grammarAccess.getJavaCodeOrIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaCodeOrID857); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:443:1: ruleJavaCodeOrID : ( ( rule__JavaCodeOrID__Alternatives ) ) ;
    public final void ruleJavaCodeOrID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:447:2: ( ( ( rule__JavaCodeOrID__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:448:1: ( ( rule__JavaCodeOrID__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:448:1: ( ( rule__JavaCodeOrID__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:449:1: ( rule__JavaCodeOrID__Alternatives )
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:450:1: ( rule__JavaCodeOrID__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:450:2: rule__JavaCodeOrID__Alternatives
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Alternatives_in_ruleJavaCodeOrID883);
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


    // $ANTLR start "entryRuleObjectMany"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:462:1: entryRuleObjectMany : ruleObjectMany EOF ;
    public final void entryRuleObjectMany() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:463:1: ( ruleObjectMany EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:464:1: ruleObjectMany EOF
            {
             before(grammarAccess.getObjectManyRule()); 
            pushFollow(FOLLOW_ruleObjectMany_in_entryRuleObjectMany910);
            ruleObjectMany();

            state._fsp--;

             after(grammarAccess.getObjectManyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMany917); 

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
    // $ANTLR end "entryRuleObjectMany"


    // $ANTLR start "ruleObjectMany"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:471:1: ruleObjectMany : ( ( rule__ObjectMany__Group__0 ) ) ;
    public final void ruleObjectMany() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:475:2: ( ( ( rule__ObjectMany__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:476:1: ( ( rule__ObjectMany__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:476:1: ( ( rule__ObjectMany__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:477:1: ( rule__ObjectMany__Group__0 )
            {
             before(grammarAccess.getObjectManyAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:478:1: ( rule__ObjectMany__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:478:2: rule__ObjectMany__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectMany__Group__0_in_ruleObjectMany943);
            rule__ObjectMany__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectManyAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectMany"


    // $ANTLR start "entryRuleObjectChoice"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:490:1: entryRuleObjectChoice : ruleObjectChoice EOF ;
    public final void entryRuleObjectChoice() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:491:1: ( ruleObjectChoice EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:492:1: ruleObjectChoice EOF
            {
             before(grammarAccess.getObjectChoiceRule()); 
            pushFollow(FOLLOW_ruleObjectChoice_in_entryRuleObjectChoice970);
            ruleObjectChoice();

            state._fsp--;

             after(grammarAccess.getObjectChoiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectChoice977); 

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
    // $ANTLR end "entryRuleObjectChoice"


    // $ANTLR start "ruleObjectChoice"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:499:1: ruleObjectChoice : ( ( rule__ObjectChoice__Group__0 ) ) ;
    public final void ruleObjectChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:503:2: ( ( ( rule__ObjectChoice__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:504:1: ( ( rule__ObjectChoice__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:504:1: ( ( rule__ObjectChoice__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:505:1: ( rule__ObjectChoice__Group__0 )
            {
             before(grammarAccess.getObjectChoiceAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:506:1: ( rule__ObjectChoice__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:506:2: rule__ObjectChoice__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__0_in_ruleObjectChoice1003);
            rule__ObjectChoice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectChoiceAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectChoice"


    // $ANTLR start "entryRuleObjectMaybe"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:518:1: entryRuleObjectMaybe : ruleObjectMaybe EOF ;
    public final void entryRuleObjectMaybe() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:519:1: ( ruleObjectMaybe EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:520:1: ruleObjectMaybe EOF
            {
             before(grammarAccess.getObjectMaybeRule()); 
            pushFollow(FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe1030);
            ruleObjectMaybe();

            state._fsp--;

             after(grammarAccess.getObjectMaybeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMaybe1037); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:527:1: ruleObjectMaybe : ( ( rule__ObjectMaybe__Alternatives ) ) ;
    public final void ruleObjectMaybe() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:531:2: ( ( ( rule__ObjectMaybe__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:532:1: ( ( rule__ObjectMaybe__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:532:1: ( ( rule__ObjectMaybe__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:533:1: ( rule__ObjectMaybe__Alternatives )
            {
             before(grammarAccess.getObjectMaybeAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:534:1: ( rule__ObjectMaybe__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:534:2: rule__ObjectMaybe__Alternatives
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Alternatives_in_ruleObjectMaybe1063);
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


    // $ANTLR start "entryRuleObjectMaybeInner"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:546:1: entryRuleObjectMaybeInner : ruleObjectMaybeInner EOF ;
    public final void entryRuleObjectMaybeInner() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:547:1: ( ruleObjectMaybeInner EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:548:1: ruleObjectMaybeInner EOF
            {
             before(grammarAccess.getObjectMaybeInnerRule()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_entryRuleObjectMaybeInner1090);
            ruleObjectMaybeInner();

            state._fsp--;

             after(grammarAccess.getObjectMaybeInnerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMaybeInner1097); 

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
    // $ANTLR end "entryRuleObjectMaybeInner"


    // $ANTLR start "ruleObjectMaybeInner"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:555:1: ruleObjectMaybeInner : ( ( rule__ObjectMaybeInner__Alternatives ) ) ;
    public final void ruleObjectMaybeInner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:559:2: ( ( ( rule__ObjectMaybeInner__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:560:1: ( ( rule__ObjectMaybeInner__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:560:1: ( ( rule__ObjectMaybeInner__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:561:1: ( rule__ObjectMaybeInner__Alternatives )
            {
             before(grammarAccess.getObjectMaybeInnerAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:562:1: ( rule__ObjectMaybeInner__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:562:2: rule__ObjectMaybeInner__Alternatives
            {
            pushFollow(FOLLOW_rule__ObjectMaybeInner__Alternatives_in_ruleObjectMaybeInner1123);
            rule__ObjectMaybeInner__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjectMaybeInnerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleObjectMaybeInner"


    // $ANTLR start "rule__DTDSL__TypeAlternatives_6_0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:576:1: rule__DTDSL__TypeAlternatives_6_0 : ( ( 'javaObject' ) | ( 'string' ) );
    public final void rule__DTDSL__TypeAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:580:1: ( ( 'javaObject' ) | ( 'string' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:581:1: ( 'javaObject' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:581:1: ( 'javaObject' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:582:1: 'javaObject'
                    {
                     before(grammarAccess.getDTDSLAccess().getTypeJavaObjectKeyword_6_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__DTDSL__TypeAlternatives_6_01162); 
                     after(grammarAccess.getDTDSLAccess().getTypeJavaObjectKeyword_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:589:6: ( 'string' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:589:6: ( 'string' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:590:1: 'string'
                    {
                     before(grammarAccess.getDTDSLAccess().getTypeStringKeyword_6_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__DTDSL__TypeAlternatives_6_01182); 
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


    // $ANTLR start "rule__StartPoint__Alternatives"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:602:1: rule__StartPoint__Alternatives : ( ( ( rule__StartPoint__Group_0__0 ) ) | ( ( rule__StartPoint__Group_1__0 ) ) );
    public final void rule__StartPoint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:606:1: ( ( ( rule__StartPoint__Group_0__0 ) ) | ( ( rule__StartPoint__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:607:1: ( ( rule__StartPoint__Group_0__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:607:1: ( ( rule__StartPoint__Group_0__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:608:1: ( rule__StartPoint__Group_0__0 )
                    {
                     before(grammarAccess.getStartPointAccess().getGroup_0()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:609:1: ( rule__StartPoint__Group_0__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:609:2: rule__StartPoint__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__StartPoint__Group_0__0_in_rule__StartPoint__Alternatives1216);
                    rule__StartPoint__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStartPointAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:613:6: ( ( rule__StartPoint__Group_1__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:613:6: ( ( rule__StartPoint__Group_1__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:614:1: ( rule__StartPoint__Group_1__0 )
                    {
                     before(grammarAccess.getStartPointAccess().getGroup_1()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:615:1: ( rule__StartPoint__Group_1__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:615:2: rule__StartPoint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StartPoint__Group_1__0_in_rule__StartPoint__Alternatives1234);
                    rule__StartPoint__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStartPointAccess().getGroup_1()); 

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
    // $ANTLR end "rule__StartPoint__Alternatives"


    // $ANTLR start "rule__Abstract__Alternatives"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:624:1: rule__Abstract__Alternatives : ( ( ruleObjectDescription ) | ( ruleStringDescription ) );
    public final void rule__Abstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:628:1: ( ( ruleObjectDescription ) | ( ruleStringDescription ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:629:1: ( ruleObjectDescription )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:629:1: ( ruleObjectDescription )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:630:1: ruleObjectDescription
                    {
                     before(grammarAccess.getAbstractAccess().getObjectDescriptionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleObjectDescription_in_rule__Abstract__Alternatives1267);
                    ruleObjectDescription();

                    state._fsp--;

                     after(grammarAccess.getAbstractAccess().getObjectDescriptionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:635:6: ( ruleStringDescription )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:635:6: ( ruleStringDescription )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:636:1: ruleStringDescription
                    {
                     before(grammarAccess.getAbstractAccess().getStringDescriptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringDescription_in_rule__Abstract__Alternatives1284);
                    ruleStringDescription();

                    state._fsp--;

                     after(grammarAccess.getAbstractAccess().getStringDescriptionParserRuleCall_1()); 

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


    // $ANTLR start "rule__StringDescriptionInner__Alternatives"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:646:1: rule__StringDescriptionInner__Alternatives : ( ( ruleStringOverRead ) | ( ruleStringKey ) | ( ruleStringValue ) );
    public final void rule__StringDescriptionInner__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:650:1: ( ( ruleStringOverRead ) | ( ruleStringKey ) | ( ruleStringValue ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case 11:
                {
                alt4=2;
                }
                break;
            case 12:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:651:1: ( ruleStringOverRead )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:651:1: ( ruleStringOverRead )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:652:1: ruleStringOverRead
                    {
                     before(grammarAccess.getStringDescriptionInnerAccess().getStringOverReadParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringOverRead_in_rule__StringDescriptionInner__Alternatives1316);
                    ruleStringOverRead();

                    state._fsp--;

                     after(grammarAccess.getStringDescriptionInnerAccess().getStringOverReadParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:657:6: ( ruleStringKey )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:657:6: ( ruleStringKey )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:658:1: ruleStringKey
                    {
                     before(grammarAccess.getStringDescriptionInnerAccess().getStringKeyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringKey_in_rule__StringDescriptionInner__Alternatives1333);
                    ruleStringKey();

                    state._fsp--;

                     after(grammarAccess.getStringDescriptionInnerAccess().getStringKeyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:663:6: ( ruleStringValue )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:663:6: ( ruleStringValue )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:664:1: ruleStringValue
                    {
                     before(grammarAccess.getStringDescriptionInnerAccess().getStringValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__StringDescriptionInner__Alternatives1350);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getStringDescriptionInnerAccess().getStringValueParserRuleCall_2()); 

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
    // $ANTLR end "rule__StringDescriptionInner__Alternatives"


    // $ANTLR start "rule__ObjectDescriptionInner__Alternatives_0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:676:1: rule__ObjectDescriptionInner__Alternatives_0 : ( ( ruleObjectNode ) | ( ruleObjectAttribute ) | ( ruleObjectNext ) | ( ruleObjectMaybe ) | ( ruleObjectMany ) | ( ruleObjectChoice ) );
    public final void rule__ObjectDescriptionInner__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:680:1: ( ( ruleObjectNode ) | ( ruleObjectAttribute ) | ( ruleObjectNext ) | ( ruleObjectMaybe ) | ( ruleObjectMany ) | ( ruleObjectChoice ) )
            int alt5=6;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:681:1: ( ruleObjectNode )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:681:1: ( ruleObjectNode )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:682:1: ruleObjectNode
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectNodeParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleObjectNode_in_rule__ObjectDescriptionInner__Alternatives_01384);
                    ruleObjectNode();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectNodeParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:687:6: ( ruleObjectAttribute )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:687:6: ( ruleObjectAttribute )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:688:1: ruleObjectAttribute
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectAttributeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleObjectAttribute_in_rule__ObjectDescriptionInner__Alternatives_01401);
                    ruleObjectAttribute();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectAttributeParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:693:6: ( ruleObjectNext )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:693:6: ( ruleObjectNext )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:694:1: ruleObjectNext
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectNextParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleObjectNext_in_rule__ObjectDescriptionInner__Alternatives_01418);
                    ruleObjectNext();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectNextParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:699:6: ( ruleObjectMaybe )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:699:6: ( ruleObjectMaybe )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:700:1: ruleObjectMaybe
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectMaybeParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleObjectMaybe_in_rule__ObjectDescriptionInner__Alternatives_01435);
                    ruleObjectMaybe();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectMaybeParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:705:6: ( ruleObjectMany )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:705:6: ( ruleObjectMany )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:706:1: ruleObjectMany
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectManyParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleObjectMany_in_rule__ObjectDescriptionInner__Alternatives_01452);
                    ruleObjectMany();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectManyParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:711:6: ( ruleObjectChoice )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:711:6: ( ruleObjectChoice )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:712:1: ruleObjectChoice
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectChoiceParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_ruleObjectChoice_in_rule__ObjectDescriptionInner__Alternatives_01469);
                    ruleObjectChoice();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectChoiceParserRuleCall_0_5()); 

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
    // $ANTLR end "rule__ObjectDescriptionInner__Alternatives_0"


    // $ANTLR start "rule__JavaCodeOrID__Alternatives"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:722:1: rule__JavaCodeOrID__Alternatives : ( ( ( rule__JavaCodeOrID__Group_0__0 ) ) | ( ( rule__JavaCodeOrID__IdAssignment_1 ) ) );
    public final void rule__JavaCodeOrID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:726:1: ( ( ( rule__JavaCodeOrID__Group_0__0 ) ) | ( ( rule__JavaCodeOrID__IdAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:727:1: ( ( rule__JavaCodeOrID__Group_0__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:727:1: ( ( rule__JavaCodeOrID__Group_0__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:728:1: ( rule__JavaCodeOrID__Group_0__0 )
                    {
                     before(grammarAccess.getJavaCodeOrIDAccess().getGroup_0()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:729:1: ( rule__JavaCodeOrID__Group_0__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:729:2: rule__JavaCodeOrID__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__0_in_rule__JavaCodeOrID__Alternatives1501);
                    rule__JavaCodeOrID__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJavaCodeOrIDAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:733:6: ( ( rule__JavaCodeOrID__IdAssignment_1 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:733:6: ( ( rule__JavaCodeOrID__IdAssignment_1 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:734:1: ( rule__JavaCodeOrID__IdAssignment_1 )
                    {
                     before(grammarAccess.getJavaCodeOrIDAccess().getIdAssignment_1()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:735:1: ( rule__JavaCodeOrID__IdAssignment_1 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:735:2: rule__JavaCodeOrID__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JavaCodeOrID__IdAssignment_1_in_rule__JavaCodeOrID__Alternatives1519);
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


    // $ANTLR start "rule__ObjectMaybe__Alternatives"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:744:1: rule__ObjectMaybe__Alternatives : ( ( ( rule__ObjectMaybe__OptionAssignment_0 ) ) | ( ( rule__ObjectMaybe__Group_1__0 ) ) );
    public final void rule__ObjectMaybe__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:748:1: ( ( ( rule__ObjectMaybe__OptionAssignment_0 ) ) | ( ( rule__ObjectMaybe__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==25||(LA7_0>=27 && LA7_0<=28)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:749:1: ( ( rule__ObjectMaybe__OptionAssignment_0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:749:1: ( ( rule__ObjectMaybe__OptionAssignment_0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:750:1: ( rule__ObjectMaybe__OptionAssignment_0 )
                    {
                     before(grammarAccess.getObjectMaybeAccess().getOptionAssignment_0()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:751:1: ( rule__ObjectMaybe__OptionAssignment_0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:751:2: rule__ObjectMaybe__OptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ObjectMaybe__OptionAssignment_0_in_rule__ObjectMaybe__Alternatives1552);
                    rule__ObjectMaybe__OptionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectMaybeAccess().getOptionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:755:6: ( ( rule__ObjectMaybe__Group_1__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:755:6: ( ( rule__ObjectMaybe__Group_1__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:756:1: ( rule__ObjectMaybe__Group_1__0 )
                    {
                     before(grammarAccess.getObjectMaybeAccess().getGroup_1()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:757:1: ( rule__ObjectMaybe__Group_1__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:757:2: rule__ObjectMaybe__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__0_in_rule__ObjectMaybe__Alternatives1570);
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


    // $ANTLR start "rule__ObjectMaybeInner__Alternatives"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:766:1: rule__ObjectMaybeInner__Alternatives : ( ( ruleObjectNext ) | ( ruleObjectNode ) | ( ruleObjectAttribute ) );
    public final void rule__ObjectMaybeInner__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:770:1: ( ( ruleObjectNext ) | ( ruleObjectNode ) | ( ruleObjectAttribute ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt8=1;
                }
                break;
            case 27:
                {
                alt8=2;
                }
                break;
            case 25:
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
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:771:1: ( ruleObjectNext )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:771:1: ( ruleObjectNext )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:772:1: ruleObjectNext
                    {
                     before(grammarAccess.getObjectMaybeInnerAccess().getObjectNextParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleObjectNext_in_rule__ObjectMaybeInner__Alternatives1603);
                    ruleObjectNext();

                    state._fsp--;

                     after(grammarAccess.getObjectMaybeInnerAccess().getObjectNextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:777:6: ( ruleObjectNode )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:777:6: ( ruleObjectNode )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:778:1: ruleObjectNode
                    {
                     before(grammarAccess.getObjectMaybeInnerAccess().getObjectNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleObjectNode_in_rule__ObjectMaybeInner__Alternatives1620);
                    ruleObjectNode();

                    state._fsp--;

                     after(grammarAccess.getObjectMaybeInnerAccess().getObjectNodeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:783:6: ( ruleObjectAttribute )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:783:6: ( ruleObjectAttribute )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:784:1: ruleObjectAttribute
                    {
                     before(grammarAccess.getObjectMaybeInnerAccess().getObjectAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleObjectAttribute_in_rule__ObjectMaybeInner__Alternatives1637);
                    ruleObjectAttribute();

                    state._fsp--;

                     after(grammarAccess.getObjectMaybeInnerAccess().getObjectAttributeParserRuleCall_2()); 

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
    // $ANTLR end "rule__ObjectMaybeInner__Alternatives"


    // $ANTLR start "rule__DTDSL__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:797:1: rule__DTDSL__Group__0 : rule__DTDSL__Group__0__Impl rule__DTDSL__Group__1 ;
    public final void rule__DTDSL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:801:1: ( rule__DTDSL__Group__0__Impl rule__DTDSL__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:802:2: rule__DTDSL__Group__0__Impl rule__DTDSL__Group__1
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__0__Impl_in_rule__DTDSL__Group__01668);
            rule__DTDSL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__1_in_rule__DTDSL__Group__01671);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:809:1: rule__DTDSL__Group__0__Impl : ( 'parserName' ) ;
    public final void rule__DTDSL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:813:1: ( ( 'parserName' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:814:1: ( 'parserName' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:814:1: ( 'parserName' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:815:1: 'parserName'
            {
             before(grammarAccess.getDTDSLAccess().getParserNameKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__DTDSL__Group__0__Impl1699); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:828:1: rule__DTDSL__Group__1 : rule__DTDSL__Group__1__Impl rule__DTDSL__Group__2 ;
    public final void rule__DTDSL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:832:1: ( rule__DTDSL__Group__1__Impl rule__DTDSL__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:833:2: rule__DTDSL__Group__1__Impl rule__DTDSL__Group__2
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__1__Impl_in_rule__DTDSL__Group__11730);
            rule__DTDSL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__2_in_rule__DTDSL__Group__11733);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:840:1: rule__DTDSL__Group__1__Impl : ( '=' ) ;
    public final void rule__DTDSL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:844:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:845:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:845:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:846:1: '='
            {
             before(grammarAccess.getDTDSLAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__DTDSL__Group__1__Impl1761); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:859:1: rule__DTDSL__Group__2 : rule__DTDSL__Group__2__Impl rule__DTDSL__Group__3 ;
    public final void rule__DTDSL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:863:1: ( rule__DTDSL__Group__2__Impl rule__DTDSL__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:864:2: rule__DTDSL__Group__2__Impl rule__DTDSL__Group__3
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__2__Impl_in_rule__DTDSL__Group__21792);
            rule__DTDSL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__3_in_rule__DTDSL__Group__21795);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:871:1: rule__DTDSL__Group__2__Impl : ( ( rule__DTDSL__ParserNameAssignment_2 ) ) ;
    public final void rule__DTDSL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:875:1: ( ( ( rule__DTDSL__ParserNameAssignment_2 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:876:1: ( ( rule__DTDSL__ParserNameAssignment_2 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:876:1: ( ( rule__DTDSL__ParserNameAssignment_2 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:877:1: ( rule__DTDSL__ParserNameAssignment_2 )
            {
             before(grammarAccess.getDTDSLAccess().getParserNameAssignment_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:878:1: ( rule__DTDSL__ParserNameAssignment_2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:878:2: rule__DTDSL__ParserNameAssignment_2
            {
            pushFollow(FOLLOW_rule__DTDSL__ParserNameAssignment_2_in_rule__DTDSL__Group__2__Impl1822);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:888:1: rule__DTDSL__Group__3 : rule__DTDSL__Group__3__Impl rule__DTDSL__Group__4 ;
    public final void rule__DTDSL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:892:1: ( rule__DTDSL__Group__3__Impl rule__DTDSL__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:893:2: rule__DTDSL__Group__3__Impl rule__DTDSL__Group__4
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__3__Impl_in_rule__DTDSL__Group__31852);
            rule__DTDSL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__4_in_rule__DTDSL__Group__31855);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:900:1: rule__DTDSL__Group__3__Impl : ( ';' ) ;
    public final void rule__DTDSL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:904:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:905:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:905:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:906:1: ';'
            {
             before(grammarAccess.getDTDSLAccess().getSemicolonKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__DTDSL__Group__3__Impl1883); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:919:1: rule__DTDSL__Group__4 : rule__DTDSL__Group__4__Impl rule__DTDSL__Group__5 ;
    public final void rule__DTDSL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:923:1: ( rule__DTDSL__Group__4__Impl rule__DTDSL__Group__5 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:924:2: rule__DTDSL__Group__4__Impl rule__DTDSL__Group__5
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__4__Impl_in_rule__DTDSL__Group__41914);
            rule__DTDSL__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__5_in_rule__DTDSL__Group__41917);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:931:1: rule__DTDSL__Group__4__Impl : ( 'parserType' ) ;
    public final void rule__DTDSL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:935:1: ( ( 'parserType' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:936:1: ( 'parserType' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:936:1: ( 'parserType' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:937:1: 'parserType'
            {
             before(grammarAccess.getDTDSLAccess().getParserTypeKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__DTDSL__Group__4__Impl1945); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:950:1: rule__DTDSL__Group__5 : rule__DTDSL__Group__5__Impl rule__DTDSL__Group__6 ;
    public final void rule__DTDSL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:954:1: ( rule__DTDSL__Group__5__Impl rule__DTDSL__Group__6 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:955:2: rule__DTDSL__Group__5__Impl rule__DTDSL__Group__6
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__5__Impl_in_rule__DTDSL__Group__51976);
            rule__DTDSL__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__6_in_rule__DTDSL__Group__51979);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:962:1: rule__DTDSL__Group__5__Impl : ( '=' ) ;
    public final void rule__DTDSL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:966:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:967:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:967:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:968:1: '='
            {
             before(grammarAccess.getDTDSLAccess().getEqualsSignKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__DTDSL__Group__5__Impl2007); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:981:1: rule__DTDSL__Group__6 : rule__DTDSL__Group__6__Impl rule__DTDSL__Group__7 ;
    public final void rule__DTDSL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:985:1: ( rule__DTDSL__Group__6__Impl rule__DTDSL__Group__7 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:986:2: rule__DTDSL__Group__6__Impl rule__DTDSL__Group__7
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__6__Impl_in_rule__DTDSL__Group__62038);
            rule__DTDSL__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__7_in_rule__DTDSL__Group__62041);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:993:1: rule__DTDSL__Group__6__Impl : ( ( rule__DTDSL__TypeAssignment_6 ) ) ;
    public final void rule__DTDSL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:997:1: ( ( ( rule__DTDSL__TypeAssignment_6 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:998:1: ( ( rule__DTDSL__TypeAssignment_6 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:998:1: ( ( rule__DTDSL__TypeAssignment_6 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:999:1: ( rule__DTDSL__TypeAssignment_6 )
            {
             before(grammarAccess.getDTDSLAccess().getTypeAssignment_6()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1000:1: ( rule__DTDSL__TypeAssignment_6 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1000:2: rule__DTDSL__TypeAssignment_6
            {
            pushFollow(FOLLOW_rule__DTDSL__TypeAssignment_6_in_rule__DTDSL__Group__6__Impl2068);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1010:1: rule__DTDSL__Group__7 : rule__DTDSL__Group__7__Impl rule__DTDSL__Group__8 ;
    public final void rule__DTDSL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1014:1: ( rule__DTDSL__Group__7__Impl rule__DTDSL__Group__8 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1015:2: rule__DTDSL__Group__7__Impl rule__DTDSL__Group__8
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__7__Impl_in_rule__DTDSL__Group__72098);
            rule__DTDSL__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__8_in_rule__DTDSL__Group__72101);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1022:1: rule__DTDSL__Group__7__Impl : ( ';' ) ;
    public final void rule__DTDSL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1026:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1027:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1027:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1028:1: ';'
            {
             before(grammarAccess.getDTDSLAccess().getSemicolonKeyword_7()); 
            match(input,17,FOLLOW_17_in_rule__DTDSL__Group__7__Impl2129); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1041:1: rule__DTDSL__Group__8 : rule__DTDSL__Group__8__Impl rule__DTDSL__Group__9 ;
    public final void rule__DTDSL__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1045:1: ( rule__DTDSL__Group__8__Impl rule__DTDSL__Group__9 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1046:2: rule__DTDSL__Group__8__Impl rule__DTDSL__Group__9
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__8__Impl_in_rule__DTDSL__Group__82160);
            rule__DTDSL__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__9_in_rule__DTDSL__Group__82163);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1053:1: rule__DTDSL__Group__8__Impl : ( ( rule__DTDSL__ObjDescriptionAssignment_8 )* ) ;
    public final void rule__DTDSL__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1057:1: ( ( ( rule__DTDSL__ObjDescriptionAssignment_8 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1058:1: ( ( rule__DTDSL__ObjDescriptionAssignment_8 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1058:1: ( ( rule__DTDSL__ObjDescriptionAssignment_8 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1059:1: ( rule__DTDSL__ObjDescriptionAssignment_8 )*
            {
             before(grammarAccess.getDTDSLAccess().getObjDescriptionAssignment_8()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1060:1: ( rule__DTDSL__ObjDescriptionAssignment_8 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20||LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1060:2: rule__DTDSL__ObjDescriptionAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__DTDSL__ObjDescriptionAssignment_8_in_rule__DTDSL__Group__8__Impl2190);
            	    rule__DTDSL__ObjDescriptionAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDTDSLAccess().getObjDescriptionAssignment_8()); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1070:1: rule__DTDSL__Group__9 : rule__DTDSL__Group__9__Impl ;
    public final void rule__DTDSL__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1074:1: ( rule__DTDSL__Group__9__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1075:2: rule__DTDSL__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__9__Impl_in_rule__DTDSL__Group__92221);
            rule__DTDSL__Group__9__Impl();

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1081:1: rule__DTDSL__Group__9__Impl : ( ( rule__DTDSL__StartAssignment_9 ) ) ;
    public final void rule__DTDSL__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1085:1: ( ( ( rule__DTDSL__StartAssignment_9 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1086:1: ( ( rule__DTDSL__StartAssignment_9 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1086:1: ( ( rule__DTDSL__StartAssignment_9 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1087:1: ( rule__DTDSL__StartAssignment_9 )
            {
             before(grammarAccess.getDTDSLAccess().getStartAssignment_9()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1088:1: ( rule__DTDSL__StartAssignment_9 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1088:2: rule__DTDSL__StartAssignment_9
            {
            pushFollow(FOLLOW_rule__DTDSL__StartAssignment_9_in_rule__DTDSL__Group__9__Impl2248);
            rule__DTDSL__StartAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getDTDSLAccess().getStartAssignment_9()); 

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


    // $ANTLR start "rule__StartPoint__Group_0__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1118:1: rule__StartPoint__Group_0__0 : rule__StartPoint__Group_0__0__Impl rule__StartPoint__Group_0__1 ;
    public final void rule__StartPoint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1122:1: ( rule__StartPoint__Group_0__0__Impl rule__StartPoint__Group_0__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1123:2: rule__StartPoint__Group_0__0__Impl rule__StartPoint__Group_0__1
            {
            pushFollow(FOLLOW_rule__StartPoint__Group_0__0__Impl_in_rule__StartPoint__Group_0__02298);
            rule__StartPoint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartPoint__Group_0__1_in_rule__StartPoint__Group_0__02301);
            rule__StartPoint__Group_0__1();

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
    // $ANTLR end "rule__StartPoint__Group_0__0"


    // $ANTLR start "rule__StartPoint__Group_0__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1130:1: rule__StartPoint__Group_0__0__Impl : ( 'beginWith' ) ;
    public final void rule__StartPoint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1134:1: ( ( 'beginWith' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1135:1: ( 'beginWith' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1135:1: ( 'beginWith' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1136:1: 'beginWith'
            {
             before(grammarAccess.getStartPointAccess().getBeginWithKeyword_0_0()); 
            match(input,19,FOLLOW_19_in_rule__StartPoint__Group_0__0__Impl2329); 
             after(grammarAccess.getStartPointAccess().getBeginWithKeyword_0_0()); 

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
    // $ANTLR end "rule__StartPoint__Group_0__0__Impl"


    // $ANTLR start "rule__StartPoint__Group_0__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1149:1: rule__StartPoint__Group_0__1 : rule__StartPoint__Group_0__1__Impl rule__StartPoint__Group_0__2 ;
    public final void rule__StartPoint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1153:1: ( rule__StartPoint__Group_0__1__Impl rule__StartPoint__Group_0__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1154:2: rule__StartPoint__Group_0__1__Impl rule__StartPoint__Group_0__2
            {
            pushFollow(FOLLOW_rule__StartPoint__Group_0__1__Impl_in_rule__StartPoint__Group_0__12360);
            rule__StartPoint__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartPoint__Group_0__2_in_rule__StartPoint__Group_0__12363);
            rule__StartPoint__Group_0__2();

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
    // $ANTLR end "rule__StartPoint__Group_0__1"


    // $ANTLR start "rule__StartPoint__Group_0__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1161:1: rule__StartPoint__Group_0__1__Impl : ( '=' ) ;
    public final void rule__StartPoint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1165:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1166:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1166:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1167:1: '='
            {
             before(grammarAccess.getStartPointAccess().getEqualsSignKeyword_0_1()); 
            match(input,16,FOLLOW_16_in_rule__StartPoint__Group_0__1__Impl2391); 
             after(grammarAccess.getStartPointAccess().getEqualsSignKeyword_0_1()); 

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
    // $ANTLR end "rule__StartPoint__Group_0__1__Impl"


    // $ANTLR start "rule__StartPoint__Group_0__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1180:1: rule__StartPoint__Group_0__2 : rule__StartPoint__Group_0__2__Impl ;
    public final void rule__StartPoint__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1184:1: ( rule__StartPoint__Group_0__2__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1185:2: rule__StartPoint__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__StartPoint__Group_0__2__Impl_in_rule__StartPoint__Group_0__22422);
            rule__StartPoint__Group_0__2__Impl();

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
    // $ANTLR end "rule__StartPoint__Group_0__2"


    // $ANTLR start "rule__StartPoint__Group_0__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1191:1: rule__StartPoint__Group_0__2__Impl : ( ( rule__StartPoint__BeginAssignment_0_2 ) ) ;
    public final void rule__StartPoint__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1195:1: ( ( ( rule__StartPoint__BeginAssignment_0_2 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1196:1: ( ( rule__StartPoint__BeginAssignment_0_2 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1196:1: ( ( rule__StartPoint__BeginAssignment_0_2 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1197:1: ( rule__StartPoint__BeginAssignment_0_2 )
            {
             before(grammarAccess.getStartPointAccess().getBeginAssignment_0_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1198:1: ( rule__StartPoint__BeginAssignment_0_2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1198:2: rule__StartPoint__BeginAssignment_0_2
            {
            pushFollow(FOLLOW_rule__StartPoint__BeginAssignment_0_2_in_rule__StartPoint__Group_0__2__Impl2449);
            rule__StartPoint__BeginAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getStartPointAccess().getBeginAssignment_0_2()); 

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
    // $ANTLR end "rule__StartPoint__Group_0__2__Impl"


    // $ANTLR start "rule__StartPoint__Group_1__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1214:1: rule__StartPoint__Group_1__0 : rule__StartPoint__Group_1__0__Impl rule__StartPoint__Group_1__1 ;
    public final void rule__StartPoint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1218:1: ( rule__StartPoint__Group_1__0__Impl rule__StartPoint__Group_1__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1219:2: rule__StartPoint__Group_1__0__Impl rule__StartPoint__Group_1__1
            {
            pushFollow(FOLLOW_rule__StartPoint__Group_1__0__Impl_in_rule__StartPoint__Group_1__02485);
            rule__StartPoint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartPoint__Group_1__1_in_rule__StartPoint__Group_1__02488);
            rule__StartPoint__Group_1__1();

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
    // $ANTLR end "rule__StartPoint__Group_1__0"


    // $ANTLR start "rule__StartPoint__Group_1__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1226:1: rule__StartPoint__Group_1__0__Impl : ( ( rule__StartPoint__BeginAssignment_1_0 ) ) ;
    public final void rule__StartPoint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1230:1: ( ( ( rule__StartPoint__BeginAssignment_1_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1231:1: ( ( rule__StartPoint__BeginAssignment_1_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1231:1: ( ( rule__StartPoint__BeginAssignment_1_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1232:1: ( rule__StartPoint__BeginAssignment_1_0 )
            {
             before(grammarAccess.getStartPointAccess().getBeginAssignment_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1233:1: ( rule__StartPoint__BeginAssignment_1_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1233:2: rule__StartPoint__BeginAssignment_1_0
            {
            pushFollow(FOLLOW_rule__StartPoint__BeginAssignment_1_0_in_rule__StartPoint__Group_1__0__Impl2515);
            rule__StartPoint__BeginAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStartPointAccess().getBeginAssignment_1_0()); 

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
    // $ANTLR end "rule__StartPoint__Group_1__0__Impl"


    // $ANTLR start "rule__StartPoint__Group_1__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1243:1: rule__StartPoint__Group_1__1 : rule__StartPoint__Group_1__1__Impl ;
    public final void rule__StartPoint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1247:1: ( rule__StartPoint__Group_1__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1248:2: rule__StartPoint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__StartPoint__Group_1__1__Impl_in_rule__StartPoint__Group_1__12545);
            rule__StartPoint__Group_1__1__Impl();

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
    // $ANTLR end "rule__StartPoint__Group_1__1"


    // $ANTLR start "rule__StartPoint__Group_1__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1254:1: rule__StartPoint__Group_1__1__Impl : ( ';' ) ;
    public final void rule__StartPoint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1258:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1259:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1259:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1260:1: ';'
            {
             before(grammarAccess.getStartPointAccess().getSemicolonKeyword_1_1()); 
            match(input,17,FOLLOW_17_in_rule__StartPoint__Group_1__1__Impl2573); 
             after(grammarAccess.getStartPointAccess().getSemicolonKeyword_1_1()); 

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
    // $ANTLR end "rule__StartPoint__Group_1__1__Impl"


    // $ANTLR start "rule__StringDescription__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1277:1: rule__StringDescription__Group__0 : rule__StringDescription__Group__0__Impl rule__StringDescription__Group__1 ;
    public final void rule__StringDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1281:1: ( rule__StringDescription__Group__0__Impl rule__StringDescription__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1282:2: rule__StringDescription__Group__0__Impl rule__StringDescription__Group__1
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__0__Impl_in_rule__StringDescription__Group__02608);
            rule__StringDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__1_in_rule__StringDescription__Group__02611);
            rule__StringDescription__Group__1();

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
    // $ANTLR end "rule__StringDescription__Group__0"


    // $ANTLR start "rule__StringDescription__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1289:1: rule__StringDescription__Group__0__Impl : ( 'String' ) ;
    public final void rule__StringDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1293:1: ( ( 'String' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1294:1: ( 'String' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1294:1: ( 'String' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1295:1: 'String'
            {
             before(grammarAccess.getStringDescriptionAccess().getStringKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__StringDescription__Group__0__Impl2639); 
             after(grammarAccess.getStringDescriptionAccess().getStringKeyword_0()); 

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
    // $ANTLR end "rule__StringDescription__Group__0__Impl"


    // $ANTLR start "rule__StringDescription__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1308:1: rule__StringDescription__Group__1 : rule__StringDescription__Group__1__Impl rule__StringDescription__Group__2 ;
    public final void rule__StringDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1312:1: ( rule__StringDescription__Group__1__Impl rule__StringDescription__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1313:2: rule__StringDescription__Group__1__Impl rule__StringDescription__Group__2
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__1__Impl_in_rule__StringDescription__Group__12670);
            rule__StringDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__2_in_rule__StringDescription__Group__12673);
            rule__StringDescription__Group__2();

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
    // $ANTLR end "rule__StringDescription__Group__1"


    // $ANTLR start "rule__StringDescription__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1320:1: rule__StringDescription__Group__1__Impl : ( ( rule__StringDescription__NameAssignment_1 ) ) ;
    public final void rule__StringDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1324:1: ( ( ( rule__StringDescription__NameAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1325:1: ( ( rule__StringDescription__NameAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1325:1: ( ( rule__StringDescription__NameAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1326:1: ( rule__StringDescription__NameAssignment_1 )
            {
             before(grammarAccess.getStringDescriptionAccess().getNameAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1327:1: ( rule__StringDescription__NameAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1327:2: rule__StringDescription__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StringDescription__NameAssignment_1_in_rule__StringDescription__Group__1__Impl2700);
            rule__StringDescription__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringDescriptionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__StringDescription__Group__1__Impl"


    // $ANTLR start "rule__StringDescription__Group__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1337:1: rule__StringDescription__Group__2 : rule__StringDescription__Group__2__Impl rule__StringDescription__Group__3 ;
    public final void rule__StringDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1341:1: ( rule__StringDescription__Group__2__Impl rule__StringDescription__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1342:2: rule__StringDescription__Group__2__Impl rule__StringDescription__Group__3
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__2__Impl_in_rule__StringDescription__Group__22730);
            rule__StringDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__3_in_rule__StringDescription__Group__22733);
            rule__StringDescription__Group__3();

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
    // $ANTLR end "rule__StringDescription__Group__2"


    // $ANTLR start "rule__StringDescription__Group__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1349:1: rule__StringDescription__Group__2__Impl : ( ':' ) ;
    public final void rule__StringDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1353:1: ( ( ':' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1354:1: ( ':' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1354:1: ( ':' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1355:1: ':'
            {
             before(grammarAccess.getStringDescriptionAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__StringDescription__Group__2__Impl2761); 
             after(grammarAccess.getStringDescriptionAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__StringDescription__Group__2__Impl"


    // $ANTLR start "rule__StringDescription__Group__3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1368:1: rule__StringDescription__Group__3 : rule__StringDescription__Group__3__Impl rule__StringDescription__Group__4 ;
    public final void rule__StringDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1372:1: ( rule__StringDescription__Group__3__Impl rule__StringDescription__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1373:2: rule__StringDescription__Group__3__Impl rule__StringDescription__Group__4
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__3__Impl_in_rule__StringDescription__Group__32792);
            rule__StringDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__4_in_rule__StringDescription__Group__32795);
            rule__StringDescription__Group__4();

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
    // $ANTLR end "rule__StringDescription__Group__3"


    // $ANTLR start "rule__StringDescription__Group__3__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1380:1: rule__StringDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__StringDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1384:1: ( ( '{' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1385:1: ( '{' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1385:1: ( '{' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1386:1: '{'
            {
             before(grammarAccess.getStringDescriptionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__StringDescription__Group__3__Impl2823); 
             after(grammarAccess.getStringDescriptionAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__StringDescription__Group__3__Impl"


    // $ANTLR start "rule__StringDescription__Group__4"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1399:1: rule__StringDescription__Group__4 : rule__StringDescription__Group__4__Impl rule__StringDescription__Group__5 ;
    public final void rule__StringDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1403:1: ( rule__StringDescription__Group__4__Impl rule__StringDescription__Group__5 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1404:2: rule__StringDescription__Group__4__Impl rule__StringDescription__Group__5
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__4__Impl_in_rule__StringDescription__Group__42854);
            rule__StringDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__5_in_rule__StringDescription__Group__42857);
            rule__StringDescription__Group__5();

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
    // $ANTLR end "rule__StringDescription__Group__4"


    // $ANTLR start "rule__StringDescription__Group__4__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1411:1: rule__StringDescription__Group__4__Impl : ( ( rule__StringDescription__DescriptionAssignment_4 )* ) ;
    public final void rule__StringDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1415:1: ( ( ( rule__StringDescription__DescriptionAssignment_4 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1416:1: ( ( rule__StringDescription__DescriptionAssignment_4 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1416:1: ( ( rule__StringDescription__DescriptionAssignment_4 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1417:1: ( rule__StringDescription__DescriptionAssignment_4 )*
            {
             before(grammarAccess.getStringDescriptionAccess().getDescriptionAssignment_4()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1418:1: ( rule__StringDescription__DescriptionAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING||(LA10_0>=11 && LA10_0<=12)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1418:2: rule__StringDescription__DescriptionAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__StringDescription__DescriptionAssignment_4_in_rule__StringDescription__Group__4__Impl2884);
            	    rule__StringDescription__DescriptionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getStringDescriptionAccess().getDescriptionAssignment_4()); 

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
    // $ANTLR end "rule__StringDescription__Group__4__Impl"


    // $ANTLR start "rule__StringDescription__Group__5"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1428:1: rule__StringDescription__Group__5 : rule__StringDescription__Group__5__Impl ;
    public final void rule__StringDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1432:1: ( rule__StringDescription__Group__5__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1433:2: rule__StringDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__5__Impl_in_rule__StringDescription__Group__52915);
            rule__StringDescription__Group__5__Impl();

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
    // $ANTLR end "rule__StringDescription__Group__5"


    // $ANTLR start "rule__StringDescription__Group__5__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1439:1: rule__StringDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__StringDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1443:1: ( ( '}' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1444:1: ( '}' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1444:1: ( '}' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1445:1: '}'
            {
             before(grammarAccess.getStringDescriptionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__StringDescription__Group__5__Impl2943); 
             after(grammarAccess.getStringDescriptionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__StringDescription__Group__5__Impl"


    // $ANTLR start "rule__ObjectDescription__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1470:1: rule__ObjectDescription__Group__0 : rule__ObjectDescription__Group__0__Impl rule__ObjectDescription__Group__1 ;
    public final void rule__ObjectDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1474:1: ( rule__ObjectDescription__Group__0__Impl rule__ObjectDescription__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1475:2: rule__ObjectDescription__Group__0__Impl rule__ObjectDescription__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__0__Impl_in_rule__ObjectDescription__Group__02986);
            rule__ObjectDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__1_in_rule__ObjectDescription__Group__02989);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1482:1: rule__ObjectDescription__Group__0__Impl : ( 'Node' ) ;
    public final void rule__ObjectDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1486:1: ( ( 'Node' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1487:1: ( 'Node' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1487:1: ( 'Node' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1488:1: 'Node'
            {
             before(grammarAccess.getObjectDescriptionAccess().getNodeKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ObjectDescription__Group__0__Impl3017); 
             after(grammarAccess.getObjectDescriptionAccess().getNodeKeyword_0()); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1501:1: rule__ObjectDescription__Group__1 : rule__ObjectDescription__Group__1__Impl rule__ObjectDescription__Group__2 ;
    public final void rule__ObjectDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1505:1: ( rule__ObjectDescription__Group__1__Impl rule__ObjectDescription__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1506:2: rule__ObjectDescription__Group__1__Impl rule__ObjectDescription__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__1__Impl_in_rule__ObjectDescription__Group__13048);
            rule__ObjectDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__2_in_rule__ObjectDescription__Group__13051);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1513:1: rule__ObjectDescription__Group__1__Impl : ( ( rule__ObjectDescription__NameAssignment_1 ) ) ;
    public final void rule__ObjectDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1517:1: ( ( ( rule__ObjectDescription__NameAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1518:1: ( ( rule__ObjectDescription__NameAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1518:1: ( ( rule__ObjectDescription__NameAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1519:1: ( rule__ObjectDescription__NameAssignment_1 )
            {
             before(grammarAccess.getObjectDescriptionAccess().getNameAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1520:1: ( rule__ObjectDescription__NameAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1520:2: rule__ObjectDescription__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectDescription__NameAssignment_1_in_rule__ObjectDescription__Group__1__Impl3078);
            rule__ObjectDescription__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectDescriptionAccess().getNameAssignment_1()); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1530:1: rule__ObjectDescription__Group__2 : rule__ObjectDescription__Group__2__Impl rule__ObjectDescription__Group__3 ;
    public final void rule__ObjectDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1534:1: ( rule__ObjectDescription__Group__2__Impl rule__ObjectDescription__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1535:2: rule__ObjectDescription__Group__2__Impl rule__ObjectDescription__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__2__Impl_in_rule__ObjectDescription__Group__23108);
            rule__ObjectDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__3_in_rule__ObjectDescription__Group__23111);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1542:1: rule__ObjectDescription__Group__2__Impl : ( ':' ) ;
    public final void rule__ObjectDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1546:1: ( ( ':' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1547:1: ( ':' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1547:1: ( ':' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1548:1: ':'
            {
             before(grammarAccess.getObjectDescriptionAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__ObjectDescription__Group__2__Impl3139); 
             after(grammarAccess.getObjectDescriptionAccess().getColonKeyword_2()); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1561:1: rule__ObjectDescription__Group__3 : rule__ObjectDescription__Group__3__Impl rule__ObjectDescription__Group__4 ;
    public final void rule__ObjectDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1565:1: ( rule__ObjectDescription__Group__3__Impl rule__ObjectDescription__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1566:2: rule__ObjectDescription__Group__3__Impl rule__ObjectDescription__Group__4
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__3__Impl_in_rule__ObjectDescription__Group__33170);
            rule__ObjectDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__4_in_rule__ObjectDescription__Group__33173);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1573:1: rule__ObjectDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__ObjectDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1577:1: ( ( '{' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1578:1: ( '{' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1578:1: ( '{' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1579:1: '{'
            {
             before(grammarAccess.getObjectDescriptionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__ObjectDescription__Group__3__Impl3201); 
             after(grammarAccess.getObjectDescriptionAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1592:1: rule__ObjectDescription__Group__4 : rule__ObjectDescription__Group__4__Impl rule__ObjectDescription__Group__5 ;
    public final void rule__ObjectDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1596:1: ( rule__ObjectDescription__Group__4__Impl rule__ObjectDescription__Group__5 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1597:2: rule__ObjectDescription__Group__4__Impl rule__ObjectDescription__Group__5
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__4__Impl_in_rule__ObjectDescription__Group__43232);
            rule__ObjectDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__5_in_rule__ObjectDescription__Group__43235);
            rule__ObjectDescription__Group__5();

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1604:1: rule__ObjectDescription__Group__4__Impl : ( ( rule__ObjectDescription__DescriptionAssignment_4 )* ) ;
    public final void rule__ObjectDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1608:1: ( ( ( rule__ObjectDescription__DescriptionAssignment_4 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1609:1: ( ( rule__ObjectDescription__DescriptionAssignment_4 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1609:1: ( ( rule__ObjectDescription__DescriptionAssignment_4 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1610:1: ( rule__ObjectDescription__DescriptionAssignment_4 )*
            {
             before(grammarAccess.getObjectDescriptionAccess().getDescriptionAssignment_4()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1611:1: ( rule__ObjectDescription__DescriptionAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==25||(LA11_0>=27 && LA11_0<=28)||LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1611:2: rule__ObjectDescription__DescriptionAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ObjectDescription__DescriptionAssignment_4_in_rule__ObjectDescription__Group__4__Impl3262);
            	    rule__ObjectDescription__DescriptionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getObjectDescriptionAccess().getDescriptionAssignment_4()); 

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


    // $ANTLR start "rule__ObjectDescription__Group__5"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1621:1: rule__ObjectDescription__Group__5 : rule__ObjectDescription__Group__5__Impl ;
    public final void rule__ObjectDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1625:1: ( rule__ObjectDescription__Group__5__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1626:2: rule__ObjectDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__5__Impl_in_rule__ObjectDescription__Group__53293);
            rule__ObjectDescription__Group__5__Impl();

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
    // $ANTLR end "rule__ObjectDescription__Group__5"


    // $ANTLR start "rule__ObjectDescription__Group__5__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1632:1: rule__ObjectDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__ObjectDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1636:1: ( ( '}' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1637:1: ( '}' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1637:1: ( '}' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1638:1: '}'
            {
             before(grammarAccess.getObjectDescriptionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__ObjectDescription__Group__5__Impl3321); 
             after(grammarAccess.getObjectDescriptionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ObjectDescription__Group__5__Impl"


    // $ANTLR start "rule__ObjectDescriptionInner__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1663:1: rule__ObjectDescriptionInner__Group__0 : rule__ObjectDescriptionInner__Group__0__Impl rule__ObjectDescriptionInner__Group__1 ;
    public final void rule__ObjectDescriptionInner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1667:1: ( rule__ObjectDescriptionInner__Group__0__Impl rule__ObjectDescriptionInner__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1668:2: rule__ObjectDescriptionInner__Group__0__Impl rule__ObjectDescriptionInner__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Group__0__Impl_in_rule__ObjectDescriptionInner__Group__03364);
            rule__ObjectDescriptionInner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Group__1_in_rule__ObjectDescriptionInner__Group__03367);
            rule__ObjectDescriptionInner__Group__1();

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
    // $ANTLR end "rule__ObjectDescriptionInner__Group__0"


    // $ANTLR start "rule__ObjectDescriptionInner__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1675:1: rule__ObjectDescriptionInner__Group__0__Impl : ( ( rule__ObjectDescriptionInner__Alternatives_0 ) ) ;
    public final void rule__ObjectDescriptionInner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1679:1: ( ( ( rule__ObjectDescriptionInner__Alternatives_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1680:1: ( ( rule__ObjectDescriptionInner__Alternatives_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1680:1: ( ( rule__ObjectDescriptionInner__Alternatives_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1681:1: ( rule__ObjectDescriptionInner__Alternatives_0 )
            {
             before(grammarAccess.getObjectDescriptionInnerAccess().getAlternatives_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1682:1: ( rule__ObjectDescriptionInner__Alternatives_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1682:2: rule__ObjectDescriptionInner__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Alternatives_0_in_rule__ObjectDescriptionInner__Group__0__Impl3394);
            rule__ObjectDescriptionInner__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectDescriptionInnerAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__ObjectDescriptionInner__Group__0__Impl"


    // $ANTLR start "rule__ObjectDescriptionInner__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1692:1: rule__ObjectDescriptionInner__Group__1 : rule__ObjectDescriptionInner__Group__1__Impl ;
    public final void rule__ObjectDescriptionInner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1696:1: ( rule__ObjectDescriptionInner__Group__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1697:2: rule__ObjectDescriptionInner__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Group__1__Impl_in_rule__ObjectDescriptionInner__Group__13424);
            rule__ObjectDescriptionInner__Group__1__Impl();

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
    // $ANTLR end "rule__ObjectDescriptionInner__Group__1"


    // $ANTLR start "rule__ObjectDescriptionInner__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1703:1: rule__ObjectDescriptionInner__Group__1__Impl : ( ';' ) ;
    public final void rule__ObjectDescriptionInner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1707:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1708:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1708:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1709:1: ';'
            {
             before(grammarAccess.getObjectDescriptionInnerAccess().getSemicolonKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__ObjectDescriptionInner__Group__1__Impl3452); 
             after(grammarAccess.getObjectDescriptionInnerAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__ObjectDescriptionInner__Group__1__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1726:1: rule__ObjectAttribute__Group__0 : rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 ;
    public final void rule__ObjectAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1730:1: ( rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1731:2: rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__0__Impl_in_rule__ObjectAttribute__Group__03487);
            rule__ObjectAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectAttribute__Group__1_in_rule__ObjectAttribute__Group__03490);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1738:1: rule__ObjectAttribute__Group__0__Impl : ( 'hasAttribute' ) ;
    public final void rule__ObjectAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1742:1: ( ( 'hasAttribute' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1743:1: ( 'hasAttribute' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1743:1: ( 'hasAttribute' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1744:1: 'hasAttribute'
            {
             before(grammarAccess.getObjectAttributeAccess().getHasAttributeKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__ObjectAttribute__Group__0__Impl3518); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1757:1: rule__ObjectAttribute__Group__1 : rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 ;
    public final void rule__ObjectAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1761:1: ( rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1762:2: rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__1__Impl_in_rule__ObjectAttribute__Group__13549);
            rule__ObjectAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectAttribute__Group__2_in_rule__ObjectAttribute__Group__13552);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1769:1: rule__ObjectAttribute__Group__1__Impl : ( ( rule__ObjectAttribute__AttributesAssignment_1 ) ) ;
    public final void rule__ObjectAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1773:1: ( ( ( rule__ObjectAttribute__AttributesAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1774:1: ( ( rule__ObjectAttribute__AttributesAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1774:1: ( ( rule__ObjectAttribute__AttributesAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1775:1: ( rule__ObjectAttribute__AttributesAssignment_1 )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributesAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1776:1: ( rule__ObjectAttribute__AttributesAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1776:2: rule__ObjectAttribute__AttributesAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__AttributesAssignment_1_in_rule__ObjectAttribute__Group__1__Impl3579);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1786:1: rule__ObjectAttribute__Group__2 : rule__ObjectAttribute__Group__2__Impl ;
    public final void rule__ObjectAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1790:1: ( rule__ObjectAttribute__Group__2__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1791:2: rule__ObjectAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__2__Impl_in_rule__ObjectAttribute__Group__23609);
            rule__ObjectAttribute__Group__2__Impl();

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1797:1: rule__ObjectAttribute__Group__2__Impl : ( ( rule__ObjectAttribute__Group_2__0 )? ) ;
    public final void rule__ObjectAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1801:1: ( ( ( rule__ObjectAttribute__Group_2__0 )? ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1802:1: ( ( rule__ObjectAttribute__Group_2__0 )? )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1802:1: ( ( rule__ObjectAttribute__Group_2__0 )? )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1803:1: ( rule__ObjectAttribute__Group_2__0 )?
            {
             before(grammarAccess.getObjectAttributeAccess().getGroup_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1804:1: ( rule__ObjectAttribute__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1804:2: rule__ObjectAttribute__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ObjectAttribute__Group_2__0_in_rule__ObjectAttribute__Group__2__Impl3636);
                    rule__ObjectAttribute__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectAttributeAccess().getGroup_2()); 

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


    // $ANTLR start "rule__ObjectAttribute__Group_2__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1820:1: rule__ObjectAttribute__Group_2__0 : rule__ObjectAttribute__Group_2__0__Impl rule__ObjectAttribute__Group_2__1 ;
    public final void rule__ObjectAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1824:1: ( rule__ObjectAttribute__Group_2__0__Impl rule__ObjectAttribute__Group_2__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1825:2: rule__ObjectAttribute__Group_2__0__Impl rule__ObjectAttribute__Group_2__1
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group_2__0__Impl_in_rule__ObjectAttribute__Group_2__03673);
            rule__ObjectAttribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectAttribute__Group_2__1_in_rule__ObjectAttribute__Group_2__03676);
            rule__ObjectAttribute__Group_2__1();

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
    // $ANTLR end "rule__ObjectAttribute__Group_2__0"


    // $ANTLR start "rule__ObjectAttribute__Group_2__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1832:1: rule__ObjectAttribute__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__ObjectAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1836:1: ( ( 'as' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1837:1: ( 'as' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1837:1: ( 'as' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1838:1: 'as'
            {
             before(grammarAccess.getObjectAttributeAccess().getAsKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__ObjectAttribute__Group_2__0__Impl3704); 
             after(grammarAccess.getObjectAttributeAccess().getAsKeyword_2_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group_2__0__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group_2__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1851:1: rule__ObjectAttribute__Group_2__1 : rule__ObjectAttribute__Group_2__1__Impl ;
    public final void rule__ObjectAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1855:1: ( rule__ObjectAttribute__Group_2__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1856:2: rule__ObjectAttribute__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group_2__1__Impl_in_rule__ObjectAttribute__Group_2__13735);
            rule__ObjectAttribute__Group_2__1__Impl();

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
    // $ANTLR end "rule__ObjectAttribute__Group_2__1"


    // $ANTLR start "rule__ObjectAttribute__Group_2__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1862:1: rule__ObjectAttribute__Group_2__1__Impl : ( ( rule__ObjectAttribute__StringMethodeAssignment_2_1 ) ) ;
    public final void rule__ObjectAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1866:1: ( ( ( rule__ObjectAttribute__StringMethodeAssignment_2_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1867:1: ( ( rule__ObjectAttribute__StringMethodeAssignment_2_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1867:1: ( ( rule__ObjectAttribute__StringMethodeAssignment_2_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1868:1: ( rule__ObjectAttribute__StringMethodeAssignment_2_1 )
            {
             before(grammarAccess.getObjectAttributeAccess().getStringMethodeAssignment_2_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1869:1: ( rule__ObjectAttribute__StringMethodeAssignment_2_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1869:2: rule__ObjectAttribute__StringMethodeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__StringMethodeAssignment_2_1_in_rule__ObjectAttribute__Group_2__1__Impl3762);
            rule__ObjectAttribute__StringMethodeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAttributeAccess().getStringMethodeAssignment_2_1()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group_2__1__Impl"


    // $ANTLR start "rule__ObjectNode__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1885:1: rule__ObjectNode__Group__0 : rule__ObjectNode__Group__0__Impl rule__ObjectNode__Group__1 ;
    public final void rule__ObjectNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1889:1: ( rule__ObjectNode__Group__0__Impl rule__ObjectNode__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1890:2: rule__ObjectNode__Group__0__Impl rule__ObjectNode__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__0__Impl_in_rule__ObjectNode__Group__03798);
            rule__ObjectNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNode__Group__1_in_rule__ObjectNode__Group__03801);
            rule__ObjectNode__Group__1();

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
    // $ANTLR end "rule__ObjectNode__Group__0"


    // $ANTLR start "rule__ObjectNode__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1897:1: rule__ObjectNode__Group__0__Impl : ( 'hasNode' ) ;
    public final void rule__ObjectNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1901:1: ( ( 'hasNode' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1902:1: ( 'hasNode' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1902:1: ( 'hasNode' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1903:1: 'hasNode'
            {
             before(grammarAccess.getObjectNodeAccess().getHasNodeKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__ObjectNode__Group__0__Impl3829); 
             after(grammarAccess.getObjectNodeAccess().getHasNodeKeyword_0()); 

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
    // $ANTLR end "rule__ObjectNode__Group__0__Impl"


    // $ANTLR start "rule__ObjectNode__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1916:1: rule__ObjectNode__Group__1 : rule__ObjectNode__Group__1__Impl rule__ObjectNode__Group__2 ;
    public final void rule__ObjectNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1920:1: ( rule__ObjectNode__Group__1__Impl rule__ObjectNode__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1921:2: rule__ObjectNode__Group__1__Impl rule__ObjectNode__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__1__Impl_in_rule__ObjectNode__Group__13860);
            rule__ObjectNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNode__Group__2_in_rule__ObjectNode__Group__13863);
            rule__ObjectNode__Group__2();

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
    // $ANTLR end "rule__ObjectNode__Group__1"


    // $ANTLR start "rule__ObjectNode__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1928:1: rule__ObjectNode__Group__1__Impl : ( ( rule__ObjectNode__AttributesAssignment_1 ) ) ;
    public final void rule__ObjectNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1932:1: ( ( ( rule__ObjectNode__AttributesAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1933:1: ( ( rule__ObjectNode__AttributesAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1933:1: ( ( rule__ObjectNode__AttributesAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1934:1: ( rule__ObjectNode__AttributesAssignment_1 )
            {
             before(grammarAccess.getObjectNodeAccess().getAttributesAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1935:1: ( rule__ObjectNode__AttributesAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1935:2: rule__ObjectNode__AttributesAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectNode__AttributesAssignment_1_in_rule__ObjectNode__Group__1__Impl3890);
            rule__ObjectNode__AttributesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectNodeAccess().getAttributesAssignment_1()); 

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
    // $ANTLR end "rule__ObjectNode__Group__1__Impl"


    // $ANTLR start "rule__ObjectNode__Group__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1945:1: rule__ObjectNode__Group__2 : rule__ObjectNode__Group__2__Impl rule__ObjectNode__Group__3 ;
    public final void rule__ObjectNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1949:1: ( rule__ObjectNode__Group__2__Impl rule__ObjectNode__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1950:2: rule__ObjectNode__Group__2__Impl rule__ObjectNode__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__2__Impl_in_rule__ObjectNode__Group__23920);
            rule__ObjectNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNode__Group__3_in_rule__ObjectNode__Group__23923);
            rule__ObjectNode__Group__3();

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
    // $ANTLR end "rule__ObjectNode__Group__2"


    // $ANTLR start "rule__ObjectNode__Group__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1957:1: rule__ObjectNode__Group__2__Impl : ( 'as' ) ;
    public final void rule__ObjectNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1961:1: ( ( 'as' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1962:1: ( 'as' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1962:1: ( 'as' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1963:1: 'as'
            {
             before(grammarAccess.getObjectNodeAccess().getAsKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__ObjectNode__Group__2__Impl3951); 
             after(grammarAccess.getObjectNodeAccess().getAsKeyword_2()); 

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
    // $ANTLR end "rule__ObjectNode__Group__2__Impl"


    // $ANTLR start "rule__ObjectNode__Group__3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1976:1: rule__ObjectNode__Group__3 : rule__ObjectNode__Group__3__Impl ;
    public final void rule__ObjectNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1980:1: ( rule__ObjectNode__Group__3__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1981:2: rule__ObjectNode__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__3__Impl_in_rule__ObjectNode__Group__33982);
            rule__ObjectNode__Group__3__Impl();

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
    // $ANTLR end "rule__ObjectNode__Group__3"


    // $ANTLR start "rule__ObjectNode__Group__3__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1987:1: rule__ObjectNode__Group__3__Impl : ( ( rule__ObjectNode__InnerAssignment_3 ) ) ;
    public final void rule__ObjectNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1991:1: ( ( ( rule__ObjectNode__InnerAssignment_3 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1992:1: ( ( rule__ObjectNode__InnerAssignment_3 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1992:1: ( ( rule__ObjectNode__InnerAssignment_3 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1993:1: ( rule__ObjectNode__InnerAssignment_3 )
            {
             before(grammarAccess.getObjectNodeAccess().getInnerAssignment_3()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1994:1: ( rule__ObjectNode__InnerAssignment_3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1994:2: rule__ObjectNode__InnerAssignment_3
            {
            pushFollow(FOLLOW_rule__ObjectNode__InnerAssignment_3_in_rule__ObjectNode__Group__3__Impl4009);
            rule__ObjectNode__InnerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getObjectNodeAccess().getInnerAssignment_3()); 

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
    // $ANTLR end "rule__ObjectNode__Group__3__Impl"


    // $ANTLR start "rule__ObjectNext__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2012:1: rule__ObjectNext__Group__0 : rule__ObjectNext__Group__0__Impl rule__ObjectNext__Group__1 ;
    public final void rule__ObjectNext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2016:1: ( rule__ObjectNext__Group__0__Impl rule__ObjectNext__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2017:2: rule__ObjectNext__Group__0__Impl rule__ObjectNext__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__0__Impl_in_rule__ObjectNext__Group__04047);
            rule__ObjectNext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNext__Group__1_in_rule__ObjectNext__Group__04050);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2024:1: rule__ObjectNext__Group__0__Impl : ( 'hasNext' ) ;
    public final void rule__ObjectNext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2028:1: ( ( 'hasNext' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2029:1: ( 'hasNext' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2029:1: ( 'hasNext' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2030:1: 'hasNext'
            {
             before(grammarAccess.getObjectNextAccess().getHasNextKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__ObjectNext__Group__0__Impl4078); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2043:1: rule__ObjectNext__Group__1 : rule__ObjectNext__Group__1__Impl rule__ObjectNext__Group__2 ;
    public final void rule__ObjectNext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2047:1: ( rule__ObjectNext__Group__1__Impl rule__ObjectNext__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2048:2: rule__ObjectNext__Group__1__Impl rule__ObjectNext__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__1__Impl_in_rule__ObjectNext__Group__14109);
            rule__ObjectNext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNext__Group__2_in_rule__ObjectNext__Group__14112);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2055:1: rule__ObjectNext__Group__1__Impl : ( ( rule__ObjectNext__AttributeAssignment_1 ) ) ;
    public final void rule__ObjectNext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2059:1: ( ( ( rule__ObjectNext__AttributeAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2060:1: ( ( rule__ObjectNext__AttributeAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2060:1: ( ( rule__ObjectNext__AttributeAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2061:1: ( rule__ObjectNext__AttributeAssignment_1 )
            {
             before(grammarAccess.getObjectNextAccess().getAttributeAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2062:1: ( rule__ObjectNext__AttributeAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2062:2: rule__ObjectNext__AttributeAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectNext__AttributeAssignment_1_in_rule__ObjectNext__Group__1__Impl4139);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2072:1: rule__ObjectNext__Group__2 : rule__ObjectNext__Group__2__Impl rule__ObjectNext__Group__3 ;
    public final void rule__ObjectNext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2076:1: ( rule__ObjectNext__Group__2__Impl rule__ObjectNext__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2077:2: rule__ObjectNext__Group__2__Impl rule__ObjectNext__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__2__Impl_in_rule__ObjectNext__Group__24169);
            rule__ObjectNext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNext__Group__3_in_rule__ObjectNext__Group__24172);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2084:1: rule__ObjectNext__Group__2__Impl : ( 'as' ) ;
    public final void rule__ObjectNext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2088:1: ( ( 'as' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2089:1: ( 'as' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2089:1: ( 'as' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2090:1: 'as'
            {
             before(grammarAccess.getObjectNextAccess().getAsKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__ObjectNext__Group__2__Impl4200); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2103:1: rule__ObjectNext__Group__3 : rule__ObjectNext__Group__3__Impl ;
    public final void rule__ObjectNext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2107:1: ( rule__ObjectNext__Group__3__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2108:2: rule__ObjectNext__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__3__Impl_in_rule__ObjectNext__Group__34231);
            rule__ObjectNext__Group__3__Impl();

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2114:1: rule__ObjectNext__Group__3__Impl : ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) ) ;
    public final void rule__ObjectNext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2118:1: ( ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2119:1: ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2119:1: ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2120:1: ( rule__ObjectNext__ObjectDesriptionAssignment_3 )
            {
             before(grammarAccess.getObjectNextAccess().getObjectDesriptionAssignment_3()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2121:1: ( rule__ObjectNext__ObjectDesriptionAssignment_3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2121:2: rule__ObjectNext__ObjectDesriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__ObjectNext__ObjectDesriptionAssignment_3_in_rule__ObjectNext__Group__3__Impl4258);
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


    // $ANTLR start "rule__JavaCodeOrID__Group_0__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2139:1: rule__JavaCodeOrID__Group_0__0 : rule__JavaCodeOrID__Group_0__0__Impl rule__JavaCodeOrID__Group_0__1 ;
    public final void rule__JavaCodeOrID__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2143:1: ( rule__JavaCodeOrID__Group_0__0__Impl rule__JavaCodeOrID__Group_0__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2144:2: rule__JavaCodeOrID__Group_0__0__Impl rule__JavaCodeOrID__Group_0__1
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__0__Impl_in_rule__JavaCodeOrID__Group_0__04296);
            rule__JavaCodeOrID__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__1_in_rule__JavaCodeOrID__Group_0__04299);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2151:1: rule__JavaCodeOrID__Group_0__0__Impl : ( 'java' ) ;
    public final void rule__JavaCodeOrID__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2155:1: ( ( 'java' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2156:1: ( 'java' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2156:1: ( 'java' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2157:1: 'java'
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getJavaKeyword_0_0()); 
            match(input,29,FOLLOW_29_in_rule__JavaCodeOrID__Group_0__0__Impl4327); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2170:1: rule__JavaCodeOrID__Group_0__1 : rule__JavaCodeOrID__Group_0__1__Impl rule__JavaCodeOrID__Group_0__2 ;
    public final void rule__JavaCodeOrID__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2174:1: ( rule__JavaCodeOrID__Group_0__1__Impl rule__JavaCodeOrID__Group_0__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2175:2: rule__JavaCodeOrID__Group_0__1__Impl rule__JavaCodeOrID__Group_0__2
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__1__Impl_in_rule__JavaCodeOrID__Group_0__14358);
            rule__JavaCodeOrID__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__2_in_rule__JavaCodeOrID__Group_0__14361);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2182:1: rule__JavaCodeOrID__Group_0__1__Impl : ( ':' ) ;
    public final void rule__JavaCodeOrID__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2186:1: ( ( ':' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2187:1: ( ':' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2187:1: ( ':' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2188:1: ':'
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getColonKeyword_0_1()); 
            match(input,21,FOLLOW_21_in_rule__JavaCodeOrID__Group_0__1__Impl4389); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2201:1: rule__JavaCodeOrID__Group_0__2 : rule__JavaCodeOrID__Group_0__2__Impl ;
    public final void rule__JavaCodeOrID__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2205:1: ( rule__JavaCodeOrID__Group_0__2__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2206:2: rule__JavaCodeOrID__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__2__Impl_in_rule__JavaCodeOrID__Group_0__24420);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2212:1: rule__JavaCodeOrID__Group_0__2__Impl : ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) ) ;
    public final void rule__JavaCodeOrID__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2216:1: ( ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2217:1: ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2217:1: ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2218:1: ( rule__JavaCodeOrID__CodeAssignment_0_2 )
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getCodeAssignment_0_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2219:1: ( rule__JavaCodeOrID__CodeAssignment_0_2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2219:2: rule__JavaCodeOrID__CodeAssignment_0_2
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__CodeAssignment_0_2_in_rule__JavaCodeOrID__Group_0__2__Impl4447);
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


    // $ANTLR start "rule__ObjectMany__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2235:1: rule__ObjectMany__Group__0 : rule__ObjectMany__Group__0__Impl rule__ObjectMany__Group__1 ;
    public final void rule__ObjectMany__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2239:1: ( rule__ObjectMany__Group__0__Impl rule__ObjectMany__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2240:2: rule__ObjectMany__Group__0__Impl rule__ObjectMany__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectMany__Group__0__Impl_in_rule__ObjectMany__Group__04483);
            rule__ObjectMany__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectMany__Group__1_in_rule__ObjectMany__Group__04486);
            rule__ObjectMany__Group__1();

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
    // $ANTLR end "rule__ObjectMany__Group__0"


    // $ANTLR start "rule__ObjectMany__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2247:1: rule__ObjectMany__Group__0__Impl : ( ( rule__ObjectMany__OptionAssignment_0 ) ) ;
    public final void rule__ObjectMany__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2251:1: ( ( ( rule__ObjectMany__OptionAssignment_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2252:1: ( ( rule__ObjectMany__OptionAssignment_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2252:1: ( ( rule__ObjectMany__OptionAssignment_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2253:1: ( rule__ObjectMany__OptionAssignment_0 )
            {
             before(grammarAccess.getObjectManyAccess().getOptionAssignment_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2254:1: ( rule__ObjectMany__OptionAssignment_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2254:2: rule__ObjectMany__OptionAssignment_0
            {
            pushFollow(FOLLOW_rule__ObjectMany__OptionAssignment_0_in_rule__ObjectMany__Group__0__Impl4513);
            rule__ObjectMany__OptionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectManyAccess().getOptionAssignment_0()); 

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
    // $ANTLR end "rule__ObjectMany__Group__0__Impl"


    // $ANTLR start "rule__ObjectMany__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2264:1: rule__ObjectMany__Group__1 : rule__ObjectMany__Group__1__Impl ;
    public final void rule__ObjectMany__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2268:1: ( rule__ObjectMany__Group__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2269:2: rule__ObjectMany__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectMany__Group__1__Impl_in_rule__ObjectMany__Group__14543);
            rule__ObjectMany__Group__1__Impl();

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
    // $ANTLR end "rule__ObjectMany__Group__1"


    // $ANTLR start "rule__ObjectMany__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2275:1: rule__ObjectMany__Group__1__Impl : ( '*' ) ;
    public final void rule__ObjectMany__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2279:1: ( ( '*' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2280:1: ( '*' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2280:1: ( '*' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2281:1: '*'
            {
             before(grammarAccess.getObjectManyAccess().getAsteriskKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__ObjectMany__Group__1__Impl4571); 
             after(grammarAccess.getObjectManyAccess().getAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__ObjectMany__Group__1__Impl"


    // $ANTLR start "rule__ObjectChoice__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2298:1: rule__ObjectChoice__Group__0 : rule__ObjectChoice__Group__0__Impl rule__ObjectChoice__Group__1 ;
    public final void rule__ObjectChoice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2302:1: ( rule__ObjectChoice__Group__0__Impl rule__ObjectChoice__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2303:2: rule__ObjectChoice__Group__0__Impl rule__ObjectChoice__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__0__Impl_in_rule__ObjectChoice__Group__04606);
            rule__ObjectChoice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectChoice__Group__1_in_rule__ObjectChoice__Group__04609);
            rule__ObjectChoice__Group__1();

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
    // $ANTLR end "rule__ObjectChoice__Group__0"


    // $ANTLR start "rule__ObjectChoice__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2310:1: rule__ObjectChoice__Group__0__Impl : ( '(' ) ;
    public final void rule__ObjectChoice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2314:1: ( ( '(' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2315:1: ( '(' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2315:1: ( '(' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2316:1: '('
            {
             before(grammarAccess.getObjectChoiceAccess().getLeftParenthesisKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__ObjectChoice__Group__0__Impl4637); 
             after(grammarAccess.getObjectChoiceAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__ObjectChoice__Group__0__Impl"


    // $ANTLR start "rule__ObjectChoice__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2329:1: rule__ObjectChoice__Group__1 : rule__ObjectChoice__Group__1__Impl rule__ObjectChoice__Group__2 ;
    public final void rule__ObjectChoice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2333:1: ( rule__ObjectChoice__Group__1__Impl rule__ObjectChoice__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2334:2: rule__ObjectChoice__Group__1__Impl rule__ObjectChoice__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__1__Impl_in_rule__ObjectChoice__Group__14668);
            rule__ObjectChoice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectChoice__Group__2_in_rule__ObjectChoice__Group__14671);
            rule__ObjectChoice__Group__2();

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
    // $ANTLR end "rule__ObjectChoice__Group__1"


    // $ANTLR start "rule__ObjectChoice__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2341:1: rule__ObjectChoice__Group__1__Impl : ( ( rule__ObjectChoice__OptionsAssignment_1 ) ) ;
    public final void rule__ObjectChoice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2345:1: ( ( ( rule__ObjectChoice__OptionsAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2346:1: ( ( rule__ObjectChoice__OptionsAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2346:1: ( ( rule__ObjectChoice__OptionsAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2347:1: ( rule__ObjectChoice__OptionsAssignment_1 )
            {
             before(grammarAccess.getObjectChoiceAccess().getOptionsAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2348:1: ( rule__ObjectChoice__OptionsAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2348:2: rule__ObjectChoice__OptionsAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectChoice__OptionsAssignment_1_in_rule__ObjectChoice__Group__1__Impl4698);
            rule__ObjectChoice__OptionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectChoiceAccess().getOptionsAssignment_1()); 

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
    // $ANTLR end "rule__ObjectChoice__Group__1__Impl"


    // $ANTLR start "rule__ObjectChoice__Group__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2358:1: rule__ObjectChoice__Group__2 : rule__ObjectChoice__Group__2__Impl rule__ObjectChoice__Group__3 ;
    public final void rule__ObjectChoice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2362:1: ( rule__ObjectChoice__Group__2__Impl rule__ObjectChoice__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2363:2: rule__ObjectChoice__Group__2__Impl rule__ObjectChoice__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__2__Impl_in_rule__ObjectChoice__Group__24728);
            rule__ObjectChoice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectChoice__Group__3_in_rule__ObjectChoice__Group__24731);
            rule__ObjectChoice__Group__3();

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
    // $ANTLR end "rule__ObjectChoice__Group__2"


    // $ANTLR start "rule__ObjectChoice__Group__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2370:1: rule__ObjectChoice__Group__2__Impl : ( ( rule__ObjectChoice__Group_2__0 )* ) ;
    public final void rule__ObjectChoice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2374:1: ( ( ( rule__ObjectChoice__Group_2__0 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2375:1: ( ( rule__ObjectChoice__Group_2__0 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2375:1: ( ( rule__ObjectChoice__Group_2__0 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2376:1: ( rule__ObjectChoice__Group_2__0 )*
            {
             before(grammarAccess.getObjectChoiceAccess().getGroup_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2377:1: ( rule__ObjectChoice__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2377:2: rule__ObjectChoice__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ObjectChoice__Group_2__0_in_rule__ObjectChoice__Group__2__Impl4758);
            	    rule__ObjectChoice__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getObjectChoiceAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ObjectChoice__Group__2__Impl"


    // $ANTLR start "rule__ObjectChoice__Group__3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2387:1: rule__ObjectChoice__Group__3 : rule__ObjectChoice__Group__3__Impl ;
    public final void rule__ObjectChoice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2391:1: ( rule__ObjectChoice__Group__3__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2392:2: rule__ObjectChoice__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__3__Impl_in_rule__ObjectChoice__Group__34789);
            rule__ObjectChoice__Group__3__Impl();

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
    // $ANTLR end "rule__ObjectChoice__Group__3"


    // $ANTLR start "rule__ObjectChoice__Group__3__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2398:1: rule__ObjectChoice__Group__3__Impl : ( ')' ) ;
    public final void rule__ObjectChoice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2402:1: ( ( ')' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2403:1: ( ')' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2403:1: ( ')' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2404:1: ')'
            {
             before(grammarAccess.getObjectChoiceAccess().getRightParenthesisKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__ObjectChoice__Group__3__Impl4817); 
             after(grammarAccess.getObjectChoiceAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__ObjectChoice__Group__3__Impl"


    // $ANTLR start "rule__ObjectChoice__Group_2__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2425:1: rule__ObjectChoice__Group_2__0 : rule__ObjectChoice__Group_2__0__Impl rule__ObjectChoice__Group_2__1 ;
    public final void rule__ObjectChoice__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2429:1: ( rule__ObjectChoice__Group_2__0__Impl rule__ObjectChoice__Group_2__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2430:2: rule__ObjectChoice__Group_2__0__Impl rule__ObjectChoice__Group_2__1
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group_2__0__Impl_in_rule__ObjectChoice__Group_2__04856);
            rule__ObjectChoice__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectChoice__Group_2__1_in_rule__ObjectChoice__Group_2__04859);
            rule__ObjectChoice__Group_2__1();

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
    // $ANTLR end "rule__ObjectChoice__Group_2__0"


    // $ANTLR start "rule__ObjectChoice__Group_2__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2437:1: rule__ObjectChoice__Group_2__0__Impl : ( '|' ) ;
    public final void rule__ObjectChoice__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2441:1: ( ( '|' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2442:1: ( '|' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2442:1: ( '|' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2443:1: '|'
            {
             before(grammarAccess.getObjectChoiceAccess().getVerticalLineKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__ObjectChoice__Group_2__0__Impl4887); 
             after(grammarAccess.getObjectChoiceAccess().getVerticalLineKeyword_2_0()); 

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
    // $ANTLR end "rule__ObjectChoice__Group_2__0__Impl"


    // $ANTLR start "rule__ObjectChoice__Group_2__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2456:1: rule__ObjectChoice__Group_2__1 : rule__ObjectChoice__Group_2__1__Impl ;
    public final void rule__ObjectChoice__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2460:1: ( rule__ObjectChoice__Group_2__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2461:2: rule__ObjectChoice__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group_2__1__Impl_in_rule__ObjectChoice__Group_2__14918);
            rule__ObjectChoice__Group_2__1__Impl();

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
    // $ANTLR end "rule__ObjectChoice__Group_2__1"


    // $ANTLR start "rule__ObjectChoice__Group_2__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2467:1: rule__ObjectChoice__Group_2__1__Impl : ( ( rule__ObjectChoice__OptionsAssignment_2_1 ) ) ;
    public final void rule__ObjectChoice__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2471:1: ( ( ( rule__ObjectChoice__OptionsAssignment_2_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2472:1: ( ( rule__ObjectChoice__OptionsAssignment_2_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2472:1: ( ( rule__ObjectChoice__OptionsAssignment_2_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2473:1: ( rule__ObjectChoice__OptionsAssignment_2_1 )
            {
             before(grammarAccess.getObjectChoiceAccess().getOptionsAssignment_2_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2474:1: ( rule__ObjectChoice__OptionsAssignment_2_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2474:2: rule__ObjectChoice__OptionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ObjectChoice__OptionsAssignment_2_1_in_rule__ObjectChoice__Group_2__1__Impl4945);
            rule__ObjectChoice__OptionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectChoiceAccess().getOptionsAssignment_2_1()); 

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
    // $ANTLR end "rule__ObjectChoice__Group_2__1__Impl"


    // $ANTLR start "rule__ObjectMaybe__Group_1__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2488:1: rule__ObjectMaybe__Group_1__0 : rule__ObjectMaybe__Group_1__0__Impl rule__ObjectMaybe__Group_1__1 ;
    public final void rule__ObjectMaybe__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2492:1: ( rule__ObjectMaybe__Group_1__0__Impl rule__ObjectMaybe__Group_1__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2493:2: rule__ObjectMaybe__Group_1__0__Impl rule__ObjectMaybe__Group_1__1
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__0__Impl_in_rule__ObjectMaybe__Group_1__04979);
            rule__ObjectMaybe__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__1_in_rule__ObjectMaybe__Group_1__04982);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2500:1: rule__ObjectMaybe__Group_1__0__Impl : ( ( rule__ObjectMaybe__DescriptionAssignment_1_0 ) ) ;
    public final void rule__ObjectMaybe__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2504:1: ( ( ( rule__ObjectMaybe__DescriptionAssignment_1_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2505:1: ( ( rule__ObjectMaybe__DescriptionAssignment_1_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2505:1: ( ( rule__ObjectMaybe__DescriptionAssignment_1_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2506:1: ( rule__ObjectMaybe__DescriptionAssignment_1_0 )
            {
             before(grammarAccess.getObjectMaybeAccess().getDescriptionAssignment_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2507:1: ( rule__ObjectMaybe__DescriptionAssignment_1_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2507:2: rule__ObjectMaybe__DescriptionAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__DescriptionAssignment_1_0_in_rule__ObjectMaybe__Group_1__0__Impl5009);
            rule__ObjectMaybe__DescriptionAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectMaybeAccess().getDescriptionAssignment_1_0()); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2517:1: rule__ObjectMaybe__Group_1__1 : rule__ObjectMaybe__Group_1__1__Impl ;
    public final void rule__ObjectMaybe__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2521:1: ( rule__ObjectMaybe__Group_1__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2522:2: rule__ObjectMaybe__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__1__Impl_in_rule__ObjectMaybe__Group_1__15039);
            rule__ObjectMaybe__Group_1__1__Impl();

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2528:1: rule__ObjectMaybe__Group_1__1__Impl : ( '?' ) ;
    public final void rule__ObjectMaybe__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2532:1: ( ( '?' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2533:1: ( '?' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2533:1: ( '?' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2534:1: '?'
            {
             before(grammarAccess.getObjectMaybeAccess().getQuestionMarkKeyword_1_1()); 
            match(input,34,FOLLOW_34_in_rule__ObjectMaybe__Group_1__1__Impl5067); 
             after(grammarAccess.getObjectMaybeAccess().getQuestionMarkKeyword_1_1()); 

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


    // $ANTLR start "rule__DTDSL__ParserNameAssignment_2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2552:1: rule__DTDSL__ParserNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DTDSL__ParserNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2556:1: ( ( RULE_STRING ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2557:1: ( RULE_STRING )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2557:1: ( RULE_STRING )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2558:1: RULE_STRING
            {
             before(grammarAccess.getDTDSLAccess().getParserNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DTDSL__ParserNameAssignment_25107); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2567:1: rule__DTDSL__TypeAssignment_6 : ( ( rule__DTDSL__TypeAlternatives_6_0 ) ) ;
    public final void rule__DTDSL__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2571:1: ( ( ( rule__DTDSL__TypeAlternatives_6_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2572:1: ( ( rule__DTDSL__TypeAlternatives_6_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2572:1: ( ( rule__DTDSL__TypeAlternatives_6_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2573:1: ( rule__DTDSL__TypeAlternatives_6_0 )
            {
             before(grammarAccess.getDTDSLAccess().getTypeAlternatives_6_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2574:1: ( rule__DTDSL__TypeAlternatives_6_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2574:2: rule__DTDSL__TypeAlternatives_6_0
            {
            pushFollow(FOLLOW_rule__DTDSL__TypeAlternatives_6_0_in_rule__DTDSL__TypeAssignment_65138);
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


    // $ANTLR start "rule__DTDSL__ObjDescriptionAssignment_8"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2583:1: rule__DTDSL__ObjDescriptionAssignment_8 : ( ruleAbstract ) ;
    public final void rule__DTDSL__ObjDescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2587:1: ( ( ruleAbstract ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2588:1: ( ruleAbstract )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2588:1: ( ruleAbstract )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2589:1: ruleAbstract
            {
             before(grammarAccess.getDTDSLAccess().getObjDescriptionAbstractParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleAbstract_in_rule__DTDSL__ObjDescriptionAssignment_85171);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getDTDSLAccess().getObjDescriptionAbstractParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__DTDSL__ObjDescriptionAssignment_8"


    // $ANTLR start "rule__DTDSL__StartAssignment_9"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2598:1: rule__DTDSL__StartAssignment_9 : ( ruleStartPoint ) ;
    public final void rule__DTDSL__StartAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2602:1: ( ( ruleStartPoint ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2603:1: ( ruleStartPoint )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2603:1: ( ruleStartPoint )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2604:1: ruleStartPoint
            {
             before(grammarAccess.getDTDSLAccess().getStartStartPointParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleStartPoint_in_rule__DTDSL__StartAssignment_95202);
            ruleStartPoint();

            state._fsp--;

             after(grammarAccess.getDTDSLAccess().getStartStartPointParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__DTDSL__StartAssignment_9"


    // $ANTLR start "rule__StartPoint__BeginAssignment_0_2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2613:1: rule__StartPoint__BeginAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__StartPoint__BeginAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2617:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2618:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2618:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2619:1: ( RULE_ID )
            {
             before(grammarAccess.getStartPointAccess().getBeginObjectDescriptionCrossReference_0_2_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2620:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2621:1: RULE_ID
            {
             before(grammarAccess.getStartPointAccess().getBeginObjectDescriptionIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartPoint__BeginAssignment_0_25237); 
             after(grammarAccess.getStartPointAccess().getBeginObjectDescriptionIDTerminalRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getStartPointAccess().getBeginObjectDescriptionCrossReference_0_2_0()); 

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
    // $ANTLR end "rule__StartPoint__BeginAssignment_0_2"


    // $ANTLR start "rule__StartPoint__BeginAssignment_1_0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2632:1: rule__StartPoint__BeginAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__StartPoint__BeginAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2636:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2637:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2637:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2638:1: ( RULE_ID )
            {
             before(grammarAccess.getStartPointAccess().getBeginStringDescriptionCrossReference_1_0_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2639:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2640:1: RULE_ID
            {
             before(grammarAccess.getStartPointAccess().getBeginStringDescriptionIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartPoint__BeginAssignment_1_05276); 
             after(grammarAccess.getStartPointAccess().getBeginStringDescriptionIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getStartPointAccess().getBeginStringDescriptionCrossReference_1_0_0()); 

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
    // $ANTLR end "rule__StartPoint__BeginAssignment_1_0"


    // $ANTLR start "rule__StringDescription__NameAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2651:1: rule__StringDescription__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringDescription__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2655:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2656:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2656:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2657:1: RULE_ID
            {
             before(grammarAccess.getStringDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringDescription__NameAssignment_15311); 
             after(grammarAccess.getStringDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__StringDescription__NameAssignment_1"


    // $ANTLR start "rule__StringDescription__DescriptionAssignment_4"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2666:1: rule__StringDescription__DescriptionAssignment_4 : ( ruleStringDescriptionInner ) ;
    public final void rule__StringDescription__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2670:1: ( ( ruleStringDescriptionInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2671:1: ( ruleStringDescriptionInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2671:1: ( ruleStringDescriptionInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2672:1: ruleStringDescriptionInner
            {
             before(grammarAccess.getStringDescriptionAccess().getDescriptionStringDescriptionInnerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStringDescriptionInner_in_rule__StringDescription__DescriptionAssignment_45342);
            ruleStringDescriptionInner();

            state._fsp--;

             after(grammarAccess.getStringDescriptionAccess().getDescriptionStringDescriptionInnerParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__StringDescription__DescriptionAssignment_4"


    // $ANTLR start "rule__ObjectDescription__NameAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2681:1: rule__ObjectDescription__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectDescription__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2685:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2686:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2686:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2687:1: RULE_ID
            {
             before(grammarAccess.getObjectDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectDescription__NameAssignment_15373); 
             after(grammarAccess.getObjectDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ObjectDescription__NameAssignment_1"


    // $ANTLR start "rule__ObjectDescription__DescriptionAssignment_4"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2696:1: rule__ObjectDescription__DescriptionAssignment_4 : ( ruleObjectDescriptionInner ) ;
    public final void rule__ObjectDescription__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2700:1: ( ( ruleObjectDescriptionInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2701:1: ( ruleObjectDescriptionInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2701:1: ( ruleObjectDescriptionInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2702:1: ruleObjectDescriptionInner
            {
             before(grammarAccess.getObjectDescriptionAccess().getDescriptionObjectDescriptionInnerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleObjectDescriptionInner_in_rule__ObjectDescription__DescriptionAssignment_45404);
            ruleObjectDescriptionInner();

            state._fsp--;

             after(grammarAccess.getObjectDescriptionAccess().getDescriptionObjectDescriptionInnerParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ObjectDescription__DescriptionAssignment_4"


    // $ANTLR start "rule__ObjectAttribute__AttributesAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2711:1: rule__ObjectAttribute__AttributesAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectAttribute__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2715:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2716:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2716:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2717:1: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectAttribute__AttributesAssignment_15435); 
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


    // $ANTLR start "rule__ObjectAttribute__StringMethodeAssignment_2_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2726:1: rule__ObjectAttribute__StringMethodeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__StringMethodeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2730:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2731:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2731:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2732:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getStringMethodeStringDescriptionCrossReference_2_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2733:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2734:1: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getStringMethodeStringDescriptionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectAttribute__StringMethodeAssignment_2_15470); 
             after(grammarAccess.getObjectAttributeAccess().getStringMethodeStringDescriptionIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getObjectAttributeAccess().getStringMethodeStringDescriptionCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__StringMethodeAssignment_2_1"


    // $ANTLR start "rule__ObjectNode__AttributesAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2745:1: rule__ObjectNode__AttributesAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectNode__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2749:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2750:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2750:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2751:1: RULE_ID
            {
             before(grammarAccess.getObjectNodeAccess().getAttributesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectNode__AttributesAssignment_15505); 
             after(grammarAccess.getObjectNodeAccess().getAttributesIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ObjectNode__AttributesAssignment_1"


    // $ANTLR start "rule__ObjectNode__InnerAssignment_3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2760:1: rule__ObjectNode__InnerAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectNode__InnerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2764:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2765:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2765:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2766:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectNodeAccess().getInnerObjectDescriptionCrossReference_3_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2767:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2768:1: RULE_ID
            {
             before(grammarAccess.getObjectNodeAccess().getInnerObjectDescriptionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectNode__InnerAssignment_35540); 
             after(grammarAccess.getObjectNodeAccess().getInnerObjectDescriptionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getObjectNodeAccess().getInnerObjectDescriptionCrossReference_3_0()); 

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
    // $ANTLR end "rule__ObjectNode__InnerAssignment_3"


    // $ANTLR start "rule__ObjectNext__AttributeAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2779:1: rule__ObjectNext__AttributeAssignment_1 : ( ruleJavaCodeOrID ) ;
    public final void rule__ObjectNext__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2783:1: ( ( ruleJavaCodeOrID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2784:1: ( ruleJavaCodeOrID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2784:1: ( ruleJavaCodeOrID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2785:1: ruleJavaCodeOrID
            {
             before(grammarAccess.getObjectNextAccess().getAttributeJavaCodeOrIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_rule__ObjectNext__AttributeAssignment_15575);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2794:1: rule__ObjectNext__ObjectDesriptionAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectNext__ObjectDesriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2798:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2799:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2799:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2800:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectNextAccess().getObjectDesriptionObjectDescriptionCrossReference_3_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2801:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2802:1: RULE_ID
            {
             before(grammarAccess.getObjectNextAccess().getObjectDesriptionObjectDescriptionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectNext__ObjectDesriptionAssignment_35610); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2813:1: rule__JavaCodeOrID__CodeAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__JavaCodeOrID__CodeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2817:1: ( ( RULE_STRING ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2818:1: ( RULE_STRING )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2818:1: ( RULE_STRING )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2819:1: RULE_STRING
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getCodeSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JavaCodeOrID__CodeAssignment_0_25645); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2828:1: rule__JavaCodeOrID__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__JavaCodeOrID__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2832:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2833:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2833:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2834:1: RULE_ID
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JavaCodeOrID__IdAssignment_15676); 
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


    // $ANTLR start "rule__ObjectMany__OptionAssignment_0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2843:1: rule__ObjectMany__OptionAssignment_0 : ( ruleObjectMaybeInner ) ;
    public final void rule__ObjectMany__OptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2847:1: ( ( ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2848:1: ( ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2848:1: ( ruleObjectMaybeInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2849:1: ruleObjectMaybeInner
            {
             before(grammarAccess.getObjectManyAccess().getOptionObjectMaybeInnerParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_rule__ObjectMany__OptionAssignment_05707);
            ruleObjectMaybeInner();

            state._fsp--;

             after(grammarAccess.getObjectManyAccess().getOptionObjectMaybeInnerParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ObjectMany__OptionAssignment_0"


    // $ANTLR start "rule__ObjectChoice__OptionsAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2858:1: rule__ObjectChoice__OptionsAssignment_1 : ( ruleObjectMaybeInner ) ;
    public final void rule__ObjectChoice__OptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2862:1: ( ( ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2863:1: ( ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2863:1: ( ruleObjectMaybeInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2864:1: ruleObjectMaybeInner
            {
             before(grammarAccess.getObjectChoiceAccess().getOptionsObjectMaybeInnerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_rule__ObjectChoice__OptionsAssignment_15738);
            ruleObjectMaybeInner();

            state._fsp--;

             after(grammarAccess.getObjectChoiceAccess().getOptionsObjectMaybeInnerParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ObjectChoice__OptionsAssignment_1"


    // $ANTLR start "rule__ObjectChoice__OptionsAssignment_2_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2873:1: rule__ObjectChoice__OptionsAssignment_2_1 : ( ruleObjectMaybeInner ) ;
    public final void rule__ObjectChoice__OptionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2877:1: ( ( ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2878:1: ( ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2878:1: ( ruleObjectMaybeInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2879:1: ruleObjectMaybeInner
            {
             before(grammarAccess.getObjectChoiceAccess().getOptionsObjectMaybeInnerParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_rule__ObjectChoice__OptionsAssignment_2_15769);
            ruleObjectMaybeInner();

            state._fsp--;

             after(grammarAccess.getObjectChoiceAccess().getOptionsObjectMaybeInnerParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ObjectChoice__OptionsAssignment_2_1"


    // $ANTLR start "rule__ObjectMaybe__OptionAssignment_0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2888:1: rule__ObjectMaybe__OptionAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectMaybe__OptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2892:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2893:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2893:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2894:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectMaybeAccess().getOptionObjectDescriptionCrossReference_0_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2895:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2896:1: RULE_ID
            {
             before(grammarAccess.getObjectMaybeAccess().getOptionObjectDescriptionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectMaybe__OptionAssignment_05804); 
             after(grammarAccess.getObjectMaybeAccess().getOptionObjectDescriptionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getObjectMaybeAccess().getOptionObjectDescriptionCrossReference_0_0()); 

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
    // $ANTLR end "rule__ObjectMaybe__OptionAssignment_0"


    // $ANTLR start "rule__ObjectMaybe__DescriptionAssignment_1_0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2907:1: rule__ObjectMaybe__DescriptionAssignment_1_0 : ( ruleObjectMaybeInner ) ;
    public final void rule__ObjectMaybe__DescriptionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2911:1: ( ( ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2912:1: ( ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2912:1: ( ruleObjectMaybeInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2913:1: ruleObjectMaybeInner
            {
             before(grammarAccess.getObjectMaybeAccess().getDescriptionObjectMaybeInnerParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_rule__ObjectMaybe__DescriptionAssignment_1_05839);
            ruleObjectMaybeInner();

            state._fsp--;

             after(grammarAccess.getObjectMaybeAccess().getDescriptionObjectMaybeInnerParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ObjectMaybe__DescriptionAssignment_1_0"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\26\uffff";
    static final String DFA5_eofS =
        "\26\uffff";
    static final String DFA5_minS =
        "\4\5\2\uffff\1\32\1\21\1\25\1\32\2\5\2\uffff\1\4\1\5\2\21\1\32"+
        "\1\21\2\uffff";
    static final String DFA5_maxS =
        "\1\37\2\5\1\35\2\uffff\1\32\1\42\1\25\1\32\2\5\2\uffff\1\4\1\5"+
        "\2\42\1\32\1\42\2\uffff";
    static final String DFA5_acceptS =
        "\4\uffff\1\4\1\6\6\uffff\1\2\1\5\6\uffff\1\1\1\3";
    static final String DFA5_specialS =
        "\26\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\4\23\uffff\1\2\1\uffff\1\1\1\3\2\uffff\1\5",
            "\1\6",
            "\1\7",
            "\1\11\27\uffff\1\10",
            "",
            "",
            "\1\12",
            "\1\14\10\uffff\1\13\3\uffff\1\15\3\uffff\1\4",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "",
            "",
            "\1\22",
            "\1\23",
            "\1\24\14\uffff\1\15\3\uffff\1\4",
            "\1\14\14\uffff\1\15\3\uffff\1\4",
            "\1\17",
            "\1\25\14\uffff\1\15\3\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "676:1: rule__ObjectDescriptionInner__Alternatives_0 : ( ( ruleObjectNode ) | ( ruleObjectAttribute ) | ( ruleObjectNext ) | ( ruleObjectMaybe ) | ( ruleObjectMany ) | ( ruleObjectChoice ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleDTDSL_in_entryRuleDTDSL61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDTDSL68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__0_in_ruleDTDSL94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartPoint_in_entryRuleStartPoint121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartPoint128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Alternatives_in_ruleStartPoint154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Alternatives_in_ruleAbstract214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescription_in_entryRuleStringDescription241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringDescription248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__0_in_ruleStringDescription274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescriptionInner_in_entryRuleStringDescriptionInner301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringDescriptionInner308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescriptionInner__Alternatives_in_ruleStringDescriptionInner334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringOverRead_in_entryRuleStringOverRead363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringOverRead370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringOverRead396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringKey_in_entryRuleStringKey422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringKey429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStringKey456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStringValue518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescription553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__0_in_ruleObjectDescription579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescriptionInner615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Group__0_in_ruleObjectDescriptionInner641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectAttribute675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__0_in_ruleObjectAttribute701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_entryRuleObjectNode730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectNode737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__0_in_ruleObjectNode763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_entryRuleObjectNext790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectNext797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__0_in_ruleObjectNext823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaCodeOrID857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Alternatives_in_ruleJavaCodeOrID883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMany_in_entryRuleObjectMany910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMany917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMany__Group__0_in_ruleObjectMany943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectChoice_in_entryRuleObjectChoice970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectChoice977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__0_in_ruleObjectChoice1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe1030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMaybe1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Alternatives_in_ruleObjectMaybe1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_entryRuleObjectMaybeInner1090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMaybeInner1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybeInner__Alternatives_in_ruleObjectMaybeInner1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DTDSL__TypeAlternatives_6_01162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DTDSL__TypeAlternatives_6_01182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__0_in_rule__StartPoint__Alternatives1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_1__0_in_rule__StartPoint__Alternatives1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescription_in_rule__Abstract__Alternatives1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescription_in_rule__Abstract__Alternatives1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringOverRead_in_rule__StringDescriptionInner__Alternatives1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringKey_in_rule__StringDescriptionInner__Alternatives1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__StringDescriptionInner__Alternatives1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_rule__ObjectDescriptionInner__Alternatives_01384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_rule__ObjectDescriptionInner__Alternatives_01401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_rule__ObjectDescriptionInner__Alternatives_01418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_rule__ObjectDescriptionInner__Alternatives_01435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMany_in_rule__ObjectDescriptionInner__Alternatives_01452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectChoice_in_rule__ObjectDescriptionInner__Alternatives_01469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__0_in_rule__JavaCodeOrID__Alternatives1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__IdAssignment_1_in_rule__JavaCodeOrID__Alternatives1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__OptionAssignment_0_in_rule__ObjectMaybe__Alternatives1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__0_in_rule__ObjectMaybe__Alternatives1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_rule__ObjectMaybeInner__Alternatives1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_rule__ObjectMaybeInner__Alternatives1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_rule__ObjectMaybeInner__Alternatives1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__0__Impl_in_rule__DTDSL__Group__01668 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__1_in_rule__DTDSL__Group__01671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DTDSL__Group__0__Impl1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__1__Impl_in_rule__DTDSL__Group__11730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__2_in_rule__DTDSL__Group__11733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DTDSL__Group__1__Impl1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__2__Impl_in_rule__DTDSL__Group__21792 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__3_in_rule__DTDSL__Group__21795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__ParserNameAssignment_2_in_rule__DTDSL__Group__2__Impl1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__3__Impl_in_rule__DTDSL__Group__31852 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__4_in_rule__DTDSL__Group__31855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DTDSL__Group__3__Impl1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__4__Impl_in_rule__DTDSL__Group__41914 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__5_in_rule__DTDSL__Group__41917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DTDSL__Group__4__Impl1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__5__Impl_in_rule__DTDSL__Group__51976 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__6_in_rule__DTDSL__Group__51979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DTDSL__Group__5__Impl2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__6__Impl_in_rule__DTDSL__Group__62038 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__7_in_rule__DTDSL__Group__62041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__TypeAssignment_6_in_rule__DTDSL__Group__6__Impl2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__7__Impl_in_rule__DTDSL__Group__72098 = new BitSet(new long[]{0x0000000001180020L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__8_in_rule__DTDSL__Group__72101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DTDSL__Group__7__Impl2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__8__Impl_in_rule__DTDSL__Group__82160 = new BitSet(new long[]{0x0000000001180020L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__9_in_rule__DTDSL__Group__82163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__ObjDescriptionAssignment_8_in_rule__DTDSL__Group__8__Impl2190 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__9__Impl_in_rule__DTDSL__Group__92221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__StartAssignment_9_in_rule__DTDSL__Group__9__Impl2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__0__Impl_in_rule__StartPoint__Group_0__02298 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__1_in_rule__StartPoint__Group_0__02301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StartPoint__Group_0__0__Impl2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__1__Impl_in_rule__StartPoint__Group_0__12360 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__2_in_rule__StartPoint__Group_0__12363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__StartPoint__Group_0__1__Impl2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__2__Impl_in_rule__StartPoint__Group_0__22422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__BeginAssignment_0_2_in_rule__StartPoint__Group_0__2__Impl2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_1__0__Impl_in_rule__StartPoint__Group_1__02485 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_1__1_in_rule__StartPoint__Group_1__02488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__BeginAssignment_1_0_in_rule__StartPoint__Group_1__0__Impl2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_1__1__Impl_in_rule__StartPoint__Group_1__12545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StartPoint__Group_1__1__Impl2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__0__Impl_in_rule__StringDescription__Group__02608 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__1_in_rule__StringDescription__Group__02611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__StringDescription__Group__0__Impl2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__1__Impl_in_rule__StringDescription__Group__12670 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__2_in_rule__StringDescription__Group__12673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__NameAssignment_1_in_rule__StringDescription__Group__1__Impl2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__2__Impl_in_rule__StringDescription__Group__22730 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__3_in_rule__StringDescription__Group__22733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringDescription__Group__2__Impl2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__3__Impl_in_rule__StringDescription__Group__32792 = new BitSet(new long[]{0x0000000000801810L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__4_in_rule__StringDescription__Group__32795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StringDescription__Group__3__Impl2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__4__Impl_in_rule__StringDescription__Group__42854 = new BitSet(new long[]{0x0000000000801810L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__5_in_rule__StringDescription__Group__42857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__DescriptionAssignment_4_in_rule__StringDescription__Group__4__Impl2884 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__5__Impl_in_rule__StringDescription__Group__52915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__StringDescription__Group__5__Impl2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__0__Impl_in_rule__ObjectDescription__Group__02986 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__1_in_rule__ObjectDescription__Group__02989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ObjectDescription__Group__0__Impl3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__1__Impl_in_rule__ObjectDescription__Group__13048 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__2_in_rule__ObjectDescription__Group__13051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__NameAssignment_1_in_rule__ObjectDescription__Group__1__Impl3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__2__Impl_in_rule__ObjectDescription__Group__23108 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__3_in_rule__ObjectDescription__Group__23111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ObjectDescription__Group__2__Impl3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__3__Impl_in_rule__ObjectDescription__Group__33170 = new BitSet(new long[]{0x000000009A800020L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__4_in_rule__ObjectDescription__Group__33173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ObjectDescription__Group__3__Impl3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__4__Impl_in_rule__ObjectDescription__Group__43232 = new BitSet(new long[]{0x000000009A800020L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__5_in_rule__ObjectDescription__Group__43235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__DescriptionAssignment_4_in_rule__ObjectDescription__Group__4__Impl3262 = new BitSet(new long[]{0x000000009A000022L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__5__Impl_in_rule__ObjectDescription__Group__53293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ObjectDescription__Group__5__Impl3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Group__0__Impl_in_rule__ObjectDescriptionInner__Group__03364 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Group__1_in_rule__ObjectDescriptionInner__Group__03367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Alternatives_0_in_rule__ObjectDescriptionInner__Group__0__Impl3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Group__1__Impl_in_rule__ObjectDescriptionInner__Group__13424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ObjectDescriptionInner__Group__1__Impl3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__0__Impl_in_rule__ObjectAttribute__Group__03487 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__1_in_rule__ObjectAttribute__Group__03490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ObjectAttribute__Group__0__Impl3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__1__Impl_in_rule__ObjectAttribute__Group__13549 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__2_in_rule__ObjectAttribute__Group__13552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__AttributesAssignment_1_in_rule__ObjectAttribute__Group__1__Impl3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__2__Impl_in_rule__ObjectAttribute__Group__23609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_2__0_in_rule__ObjectAttribute__Group__2__Impl3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_2__0__Impl_in_rule__ObjectAttribute__Group_2__03673 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_2__1_in_rule__ObjectAttribute__Group_2__03676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ObjectAttribute__Group_2__0__Impl3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_2__1__Impl_in_rule__ObjectAttribute__Group_2__13735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__StringMethodeAssignment_2_1_in_rule__ObjectAttribute__Group_2__1__Impl3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__0__Impl_in_rule__ObjectNode__Group__03798 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__1_in_rule__ObjectNode__Group__03801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ObjectNode__Group__0__Impl3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__1__Impl_in_rule__ObjectNode__Group__13860 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__2_in_rule__ObjectNode__Group__13863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__AttributesAssignment_1_in_rule__ObjectNode__Group__1__Impl3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__2__Impl_in_rule__ObjectNode__Group__23920 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__3_in_rule__ObjectNode__Group__23923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ObjectNode__Group__2__Impl3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__3__Impl_in_rule__ObjectNode__Group__33982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__InnerAssignment_3_in_rule__ObjectNode__Group__3__Impl4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__0__Impl_in_rule__ObjectNext__Group__04047 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__1_in_rule__ObjectNext__Group__04050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ObjectNext__Group__0__Impl4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__1__Impl_in_rule__ObjectNext__Group__14109 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__2_in_rule__ObjectNext__Group__14112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__AttributeAssignment_1_in_rule__ObjectNext__Group__1__Impl4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__2__Impl_in_rule__ObjectNext__Group__24169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__3_in_rule__ObjectNext__Group__24172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ObjectNext__Group__2__Impl4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__3__Impl_in_rule__ObjectNext__Group__34231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__ObjectDesriptionAssignment_3_in_rule__ObjectNext__Group__3__Impl4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__0__Impl_in_rule__JavaCodeOrID__Group_0__04296 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__1_in_rule__JavaCodeOrID__Group_0__04299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__JavaCodeOrID__Group_0__0__Impl4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__1__Impl_in_rule__JavaCodeOrID__Group_0__14358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__2_in_rule__JavaCodeOrID__Group_0__14361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__JavaCodeOrID__Group_0__1__Impl4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__2__Impl_in_rule__JavaCodeOrID__Group_0__24420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__CodeAssignment_0_2_in_rule__JavaCodeOrID__Group_0__2__Impl4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMany__Group__0__Impl_in_rule__ObjectMany__Group__04483 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ObjectMany__Group__1_in_rule__ObjectMany__Group__04486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMany__OptionAssignment_0_in_rule__ObjectMany__Group__0__Impl4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMany__Group__1__Impl_in_rule__ObjectMany__Group__14543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ObjectMany__Group__1__Impl4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__0__Impl_in_rule__ObjectChoice__Group__04606 = new BitSet(new long[]{0x000000001A000020L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__1_in_rule__ObjectChoice__Group__04609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ObjectChoice__Group__0__Impl4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__1__Impl_in_rule__ObjectChoice__Group__14668 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__2_in_rule__ObjectChoice__Group__14671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__OptionsAssignment_1_in_rule__ObjectChoice__Group__1__Impl4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__2__Impl_in_rule__ObjectChoice__Group__24728 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__3_in_rule__ObjectChoice__Group__24731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group_2__0_in_rule__ObjectChoice__Group__2__Impl4758 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__3__Impl_in_rule__ObjectChoice__Group__34789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ObjectChoice__Group__3__Impl4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group_2__0__Impl_in_rule__ObjectChoice__Group_2__04856 = new BitSet(new long[]{0x000000001A000020L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group_2__1_in_rule__ObjectChoice__Group_2__04859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ObjectChoice__Group_2__0__Impl4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group_2__1__Impl_in_rule__ObjectChoice__Group_2__14918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__OptionsAssignment_2_1_in_rule__ObjectChoice__Group_2__1__Impl4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__0__Impl_in_rule__ObjectMaybe__Group_1__04979 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__1_in_rule__ObjectMaybe__Group_1__04982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__DescriptionAssignment_1_0_in_rule__ObjectMaybe__Group_1__0__Impl5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__1__Impl_in_rule__ObjectMaybe__Group_1__15039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ObjectMaybe__Group_1__1__Impl5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DTDSL__ParserNameAssignment_25107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__TypeAlternatives_6_0_in_rule__DTDSL__TypeAssignment_65138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_rule__DTDSL__ObjDescriptionAssignment_85171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartPoint_in_rule__DTDSL__StartAssignment_95202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartPoint__BeginAssignment_0_25237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartPoint__BeginAssignment_1_05276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringDescription__NameAssignment_15311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescriptionInner_in_rule__StringDescription__DescriptionAssignment_45342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectDescription__NameAssignment_15373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_rule__ObjectDescription__DescriptionAssignment_45404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectAttribute__AttributesAssignment_15435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectAttribute__StringMethodeAssignment_2_15470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectNode__AttributesAssignment_15505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectNode__InnerAssignment_35540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_rule__ObjectNext__AttributeAssignment_15575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectNext__ObjectDesriptionAssignment_35610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JavaCodeOrID__CodeAssignment_0_25645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JavaCodeOrID__IdAssignment_15676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_rule__ObjectMany__OptionAssignment_05707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_rule__ObjectChoice__OptionsAssignment_15738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_rule__ObjectChoice__OptionsAssignment_2_15769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectMaybe__OptionAssignment_05804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_rule__ObjectMaybe__DescriptionAssignment_1_05839 = new BitSet(new long[]{0x0000000000000002L});

}