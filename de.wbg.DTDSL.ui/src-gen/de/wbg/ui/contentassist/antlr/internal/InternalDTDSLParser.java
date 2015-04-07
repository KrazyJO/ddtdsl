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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'short'", "'int'", "'long'", "'float'", "'double'", "'char'", "'String'", "'byte'", "'parserName'", "'='", "';'", "'beginWith'", "':'", "'{'", "'}'", "'Key'", "'ofType'", "'Value'", "'to'", "'or'", "'('", "')'", "'|'", "'Node'", "'hasAttribute'", "'as'", "'hasNode'", "'hasNext'", "'java'", "'*'", "'?'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:200:1: entryRuleStringOverRead : ruleStringOverRead EOF ;
    public final void entryRuleStringOverRead() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:201:1: ( ruleStringOverRead EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:202:1: ruleStringOverRead EOF
            {
             before(grammarAccess.getStringOverReadRule()); 
            pushFollow(FOLLOW_ruleStringOverRead_in_entryRuleStringOverRead361);
            ruleStringOverRead();

            state._fsp--;

             after(grammarAccess.getStringOverReadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringOverRead368); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:209:1: ruleStringOverRead : ( ( rule__StringOverRead__OverReadAssignment ) ) ;
    public final void ruleStringOverRead() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:213:2: ( ( ( rule__StringOverRead__OverReadAssignment ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:214:1: ( ( rule__StringOverRead__OverReadAssignment ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:214:1: ( ( rule__StringOverRead__OverReadAssignment ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:215:1: ( rule__StringOverRead__OverReadAssignment )
            {
             before(grammarAccess.getStringOverReadAccess().getOverReadAssignment()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:216:1: ( rule__StringOverRead__OverReadAssignment )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:216:2: rule__StringOverRead__OverReadAssignment
            {
            pushFollow(FOLLOW_rule__StringOverRead__OverReadAssignment_in_ruleStringOverRead394);
            rule__StringOverRead__OverReadAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringOverReadAccess().getOverReadAssignment()); 

            }


            }

        }
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:228:1: entryRuleStringKey : ruleStringKey EOF ;
    public final void entryRuleStringKey() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:229:1: ( ruleStringKey EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:230:1: ruleStringKey EOF
            {
             before(grammarAccess.getStringKeyRule()); 
            pushFollow(FOLLOW_ruleStringKey_in_entryRuleStringKey421);
            ruleStringKey();

            state._fsp--;

             after(grammarAccess.getStringKeyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringKey428); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:237:1: ruleStringKey : ( ( rule__StringKey__Group__0 ) ) ;
    public final void ruleStringKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:241:2: ( ( ( rule__StringKey__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:242:1: ( ( rule__StringKey__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:242:1: ( ( rule__StringKey__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:243:1: ( rule__StringKey__Group__0 )
            {
             before(grammarAccess.getStringKeyAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:244:1: ( rule__StringKey__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:244:2: rule__StringKey__Group__0
            {
            pushFollow(FOLLOW_rule__StringKey__Group__0_in_ruleStringKey454);
            rule__StringKey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringKeyAccess().getGroup()); 

            }


            }

        }
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:256:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:257:1: ( ruleStringValue EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:258:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue481);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue488); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:265:1: ruleStringValue : ( ( rule__StringValue__Group__0 ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:269:2: ( ( ( rule__StringValue__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:270:1: ( ( rule__StringValue__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:270:1: ( ( rule__StringValue__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:271:1: ( rule__StringValue__Group__0 )
            {
             before(grammarAccess.getStringValueAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:272:1: ( rule__StringValue__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:272:2: rule__StringValue__Group__0
            {
            pushFollow(FOLLOW_rule__StringValue__Group__0_in_ruleStringValue514);
            rule__StringValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleStringOr"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:284:1: entryRuleStringOr : ruleStringOr EOF ;
    public final void entryRuleStringOr() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:285:1: ( ruleStringOr EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:286:1: ruleStringOr EOF
            {
             before(grammarAccess.getStringOrRule()); 
            pushFollow(FOLLOW_ruleStringOr_in_entryRuleStringOr541);
            ruleStringOr();

            state._fsp--;

             after(grammarAccess.getStringOrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringOr548); 

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
    // $ANTLR end "entryRuleStringOr"


    // $ANTLR start "ruleStringOr"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:293:1: ruleStringOr : ( ( rule__StringOr__Group__0 ) ) ;
    public final void ruleStringOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:297:2: ( ( ( rule__StringOr__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:298:1: ( ( rule__StringOr__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:298:1: ( ( rule__StringOr__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:299:1: ( rule__StringOr__Group__0 )
            {
             before(grammarAccess.getStringOrAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:300:1: ( rule__StringOr__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:300:2: rule__StringOr__Group__0
            {
            pushFollow(FOLLOW_rule__StringOr__Group__0_in_ruleStringOr574);
            rule__StringOr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringOr"


    // $ANTLR start "entryRuleStringDescriptionInVariable"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:312:1: entryRuleStringDescriptionInVariable : ruleStringDescriptionInVariable EOF ;
    public final void entryRuleStringDescriptionInVariable() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:313:1: ( ruleStringDescriptionInVariable EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:314:1: ruleStringDescriptionInVariable EOF
            {
             before(grammarAccess.getStringDescriptionInVariableRule()); 
            pushFollow(FOLLOW_ruleStringDescriptionInVariable_in_entryRuleStringDescriptionInVariable601);
            ruleStringDescriptionInVariable();

            state._fsp--;

             after(grammarAccess.getStringDescriptionInVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringDescriptionInVariable608); 

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
    // $ANTLR end "entryRuleStringDescriptionInVariable"


    // $ANTLR start "ruleStringDescriptionInVariable"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:321:1: ruleStringDescriptionInVariable : ( ( rule__StringDescriptionInVariable__Group__0 ) ) ;
    public final void ruleStringDescriptionInVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:325:2: ( ( ( rule__StringDescriptionInVariable__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:326:1: ( ( rule__StringDescriptionInVariable__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:326:1: ( ( rule__StringDescriptionInVariable__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:327:1: ( rule__StringDescriptionInVariable__Group__0 )
            {
             before(grammarAccess.getStringDescriptionInVariableAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:328:1: ( rule__StringDescriptionInVariable__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:328:2: rule__StringDescriptionInVariable__Group__0
            {
            pushFollow(FOLLOW_rule__StringDescriptionInVariable__Group__0_in_ruleStringDescriptionInVariable634);
            rule__StringDescriptionInVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringDescriptionInVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringDescriptionInVariable"


    // $ANTLR start "entryRuleStringComplex"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:340:1: entryRuleStringComplex : ruleStringComplex EOF ;
    public final void entryRuleStringComplex() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:341:1: ( ruleStringComplex EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:342:1: ruleStringComplex EOF
            {
             before(grammarAccess.getStringComplexRule()); 
            pushFollow(FOLLOW_ruleStringComplex_in_entryRuleStringComplex661);
            ruleStringComplex();

            state._fsp--;

             after(grammarAccess.getStringComplexRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringComplex668); 

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
    // $ANTLR end "entryRuleStringComplex"


    // $ANTLR start "ruleStringComplex"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:349:1: ruleStringComplex : ( ( rule__StringComplex__Group__0 ) ) ;
    public final void ruleStringComplex() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:353:2: ( ( ( rule__StringComplex__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:354:1: ( ( rule__StringComplex__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:354:1: ( ( rule__StringComplex__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:355:1: ( rule__StringComplex__Group__0 )
            {
             before(grammarAccess.getStringComplexAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:356:1: ( rule__StringComplex__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:356:2: rule__StringComplex__Group__0
            {
            pushFollow(FOLLOW_rule__StringComplex__Group__0_in_ruleStringComplex694);
            rule__StringComplex__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringComplexAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringComplex"


    // $ANTLR start "entryRuleObjectDescription"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:368:1: entryRuleObjectDescription : ruleObjectDescription EOF ;
    public final void entryRuleObjectDescription() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:369:1: ( ruleObjectDescription EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:370:1: ruleObjectDescription EOF
            {
             before(grammarAccess.getObjectDescriptionRule()); 
            pushFollow(FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription721);
            ruleObjectDescription();

            state._fsp--;

             after(grammarAccess.getObjectDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescription728); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:377:1: ruleObjectDescription : ( ( rule__ObjectDescription__Group__0 ) ) ;
    public final void ruleObjectDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:381:2: ( ( ( rule__ObjectDescription__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:382:1: ( ( rule__ObjectDescription__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:382:1: ( ( rule__ObjectDescription__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:383:1: ( rule__ObjectDescription__Group__0 )
            {
             before(grammarAccess.getObjectDescriptionAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:384:1: ( rule__ObjectDescription__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:384:2: rule__ObjectDescription__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__0_in_ruleObjectDescription754);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:396:1: entryRuleObjectDescriptionInner : ruleObjectDescriptionInner EOF ;
    public final void entryRuleObjectDescriptionInner() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:397:1: ( ruleObjectDescriptionInner EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:398:1: ruleObjectDescriptionInner EOF
            {
             before(grammarAccess.getObjectDescriptionInnerRule()); 
            pushFollow(FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner781);
            ruleObjectDescriptionInner();

            state._fsp--;

             after(grammarAccess.getObjectDescriptionInnerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescriptionInner788); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:405:1: ruleObjectDescriptionInner : ( ( rule__ObjectDescriptionInner__Group__0 ) ) ;
    public final void ruleObjectDescriptionInner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:409:2: ( ( ( rule__ObjectDescriptionInner__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:410:1: ( ( rule__ObjectDescriptionInner__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:410:1: ( ( rule__ObjectDescriptionInner__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:411:1: ( rule__ObjectDescriptionInner__Group__0 )
            {
             before(grammarAccess.getObjectDescriptionInnerAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:412:1: ( rule__ObjectDescriptionInner__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:412:2: rule__ObjectDescriptionInner__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Group__0_in_ruleObjectDescriptionInner814);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:424:1: entryRuleObjectAttribute : ruleObjectAttribute EOF ;
    public final void entryRuleObjectAttribute() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:425:1: ( ruleObjectAttribute EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:426:1: ruleObjectAttribute EOF
            {
             before(grammarAccess.getObjectAttributeRule()); 
            pushFollow(FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute841);
            ruleObjectAttribute();

            state._fsp--;

             after(grammarAccess.getObjectAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectAttribute848); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:433:1: ruleObjectAttribute : ( ( rule__ObjectAttribute__Group__0 ) ) ;
    public final void ruleObjectAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:437:2: ( ( ( rule__ObjectAttribute__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:438:1: ( ( rule__ObjectAttribute__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:438:1: ( ( rule__ObjectAttribute__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:439:1: ( rule__ObjectAttribute__Group__0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:440:1: ( rule__ObjectAttribute__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:440:2: rule__ObjectAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__0_in_ruleObjectAttribute874);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:452:1: entryRuleObjectNode : ruleObjectNode EOF ;
    public final void entryRuleObjectNode() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:453:1: ( ruleObjectNode EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:454:1: ruleObjectNode EOF
            {
             before(grammarAccess.getObjectNodeRule()); 
            pushFollow(FOLLOW_ruleObjectNode_in_entryRuleObjectNode901);
            ruleObjectNode();

            state._fsp--;

             after(grammarAccess.getObjectNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectNode908); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:461:1: ruleObjectNode : ( ( rule__ObjectNode__Group__0 ) ) ;
    public final void ruleObjectNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:465:2: ( ( ( rule__ObjectNode__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:466:1: ( ( rule__ObjectNode__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:466:1: ( ( rule__ObjectNode__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:467:1: ( rule__ObjectNode__Group__0 )
            {
             before(grammarAccess.getObjectNodeAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:468:1: ( rule__ObjectNode__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:468:2: rule__ObjectNode__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__0_in_ruleObjectNode934);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:480:1: entryRuleObjectNext : ruleObjectNext EOF ;
    public final void entryRuleObjectNext() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:481:1: ( ruleObjectNext EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:482:1: ruleObjectNext EOF
            {
             before(grammarAccess.getObjectNextRule()); 
            pushFollow(FOLLOW_ruleObjectNext_in_entryRuleObjectNext961);
            ruleObjectNext();

            state._fsp--;

             after(grammarAccess.getObjectNextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectNext968); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:489:1: ruleObjectNext : ( ( rule__ObjectNext__Group__0 ) ) ;
    public final void ruleObjectNext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:493:2: ( ( ( rule__ObjectNext__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:494:1: ( ( rule__ObjectNext__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:494:1: ( ( rule__ObjectNext__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:495:1: ( rule__ObjectNext__Group__0 )
            {
             before(grammarAccess.getObjectNextAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:496:1: ( rule__ObjectNext__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:496:2: rule__ObjectNext__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__0_in_ruleObjectNext994);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:508:1: entryRuleJavaCodeOrID : ruleJavaCodeOrID EOF ;
    public final void entryRuleJavaCodeOrID() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:509:1: ( ruleJavaCodeOrID EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:510:1: ruleJavaCodeOrID EOF
            {
             before(grammarAccess.getJavaCodeOrIDRule()); 
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID1021);
            ruleJavaCodeOrID();

            state._fsp--;

             after(grammarAccess.getJavaCodeOrIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaCodeOrID1028); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:517:1: ruleJavaCodeOrID : ( ( rule__JavaCodeOrID__Alternatives ) ) ;
    public final void ruleJavaCodeOrID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:521:2: ( ( ( rule__JavaCodeOrID__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:522:1: ( ( rule__JavaCodeOrID__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:522:1: ( ( rule__JavaCodeOrID__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:523:1: ( rule__JavaCodeOrID__Alternatives )
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:524:1: ( rule__JavaCodeOrID__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:524:2: rule__JavaCodeOrID__Alternatives
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Alternatives_in_ruleJavaCodeOrID1054);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:536:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:537:1: ( ruleType EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:538:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1081);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1088); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:545:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:549:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:550:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:550:1: ( ( rule__Type__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:551:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:552:1: ( rule__Type__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:552:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1114);
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


    // $ANTLR start "entryRuleObjectMany"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:564:1: entryRuleObjectMany : ruleObjectMany EOF ;
    public final void entryRuleObjectMany() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:565:1: ( ruleObjectMany EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:566:1: ruleObjectMany EOF
            {
             before(grammarAccess.getObjectManyRule()); 
            pushFollow(FOLLOW_ruleObjectMany_in_entryRuleObjectMany1141);
            ruleObjectMany();

            state._fsp--;

             after(grammarAccess.getObjectManyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMany1148); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:573:1: ruleObjectMany : ( ( rule__ObjectMany__Group__0 ) ) ;
    public final void ruleObjectMany() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:577:2: ( ( ( rule__ObjectMany__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:578:1: ( ( rule__ObjectMany__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:578:1: ( ( rule__ObjectMany__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:579:1: ( rule__ObjectMany__Group__0 )
            {
             before(grammarAccess.getObjectManyAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:580:1: ( rule__ObjectMany__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:580:2: rule__ObjectMany__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectMany__Group__0_in_ruleObjectMany1174);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:592:1: entryRuleObjectChoice : ruleObjectChoice EOF ;
    public final void entryRuleObjectChoice() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:593:1: ( ruleObjectChoice EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:594:1: ruleObjectChoice EOF
            {
             before(grammarAccess.getObjectChoiceRule()); 
            pushFollow(FOLLOW_ruleObjectChoice_in_entryRuleObjectChoice1201);
            ruleObjectChoice();

            state._fsp--;

             after(grammarAccess.getObjectChoiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectChoice1208); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:601:1: ruleObjectChoice : ( ( rule__ObjectChoice__Group__0 ) ) ;
    public final void ruleObjectChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:605:2: ( ( ( rule__ObjectChoice__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:606:1: ( ( rule__ObjectChoice__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:606:1: ( ( rule__ObjectChoice__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:607:1: ( rule__ObjectChoice__Group__0 )
            {
             before(grammarAccess.getObjectChoiceAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:608:1: ( rule__ObjectChoice__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:608:2: rule__ObjectChoice__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__0_in_ruleObjectChoice1234);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:620:1: entryRuleObjectMaybe : ruleObjectMaybe EOF ;
    public final void entryRuleObjectMaybe() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:621:1: ( ruleObjectMaybe EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:622:1: ruleObjectMaybe EOF
            {
             before(grammarAccess.getObjectMaybeRule()); 
            pushFollow(FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe1261);
            ruleObjectMaybe();

            state._fsp--;

             after(grammarAccess.getObjectMaybeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMaybe1268); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:629:1: ruleObjectMaybe : ( ( rule__ObjectMaybe__Alternatives ) ) ;
    public final void ruleObjectMaybe() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:633:2: ( ( ( rule__ObjectMaybe__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:634:1: ( ( rule__ObjectMaybe__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:634:1: ( ( rule__ObjectMaybe__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:635:1: ( rule__ObjectMaybe__Alternatives )
            {
             before(grammarAccess.getObjectMaybeAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:636:1: ( rule__ObjectMaybe__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:636:2: rule__ObjectMaybe__Alternatives
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Alternatives_in_ruleObjectMaybe1294);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:648:1: entryRuleObjectMaybeInner : ruleObjectMaybeInner EOF ;
    public final void entryRuleObjectMaybeInner() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:649:1: ( ruleObjectMaybeInner EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:650:1: ruleObjectMaybeInner EOF
            {
             before(grammarAccess.getObjectMaybeInnerRule()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_entryRuleObjectMaybeInner1321);
            ruleObjectMaybeInner();

            state._fsp--;

             after(grammarAccess.getObjectMaybeInnerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMaybeInner1328); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:657:1: ruleObjectMaybeInner : ( ( rule__ObjectMaybeInner__Alternatives ) ) ;
    public final void ruleObjectMaybeInner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:661:2: ( ( ( rule__ObjectMaybeInner__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:662:1: ( ( rule__ObjectMaybeInner__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:662:1: ( ( rule__ObjectMaybeInner__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:663:1: ( rule__ObjectMaybeInner__Alternatives )
            {
             before(grammarAccess.getObjectMaybeInnerAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:664:1: ( rule__ObjectMaybeInner__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:664:2: rule__ObjectMaybeInner__Alternatives
            {
            pushFollow(FOLLOW_rule__ObjectMaybeInner__Alternatives_in_ruleObjectMaybeInner1354);
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


    // $ANTLR start "rule__StartPoint__Alternatives"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:676:1: rule__StartPoint__Alternatives : ( ( ( rule__StartPoint__Group_0__0 ) ) | ( ( rule__StartPoint__Group_1__0 ) ) );
    public final void rule__StartPoint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:680:1: ( ( ( rule__StartPoint__Group_0__0 ) ) | ( ( rule__StartPoint__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:681:1: ( ( rule__StartPoint__Group_0__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:681:1: ( ( rule__StartPoint__Group_0__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:682:1: ( rule__StartPoint__Group_0__0 )
                    {
                     before(grammarAccess.getStartPointAccess().getGroup_0()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:683:1: ( rule__StartPoint__Group_0__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:683:2: rule__StartPoint__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__StartPoint__Group_0__0_in_rule__StartPoint__Alternatives1390);
                    rule__StartPoint__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStartPointAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:687:6: ( ( rule__StartPoint__Group_1__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:687:6: ( ( rule__StartPoint__Group_1__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:688:1: ( rule__StartPoint__Group_1__0 )
                    {
                     before(grammarAccess.getStartPointAccess().getGroup_1()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:689:1: ( rule__StartPoint__Group_1__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:689:2: rule__StartPoint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StartPoint__Group_1__0_in_rule__StartPoint__Alternatives1408);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:698:1: rule__Abstract__Alternatives : ( ( ruleObjectDescription ) | ( ruleStringDescription ) );
    public final void rule__Abstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:702:1: ( ( ruleObjectDescription ) | ( ruleStringDescription ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==35) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:703:1: ( ruleObjectDescription )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:703:1: ( ruleObjectDescription )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:704:1: ruleObjectDescription
                    {
                     before(grammarAccess.getAbstractAccess().getObjectDescriptionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleObjectDescription_in_rule__Abstract__Alternatives1441);
                    ruleObjectDescription();

                    state._fsp--;

                     after(grammarAccess.getAbstractAccess().getObjectDescriptionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:709:6: ( ruleStringDescription )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:709:6: ( ruleStringDescription )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:710:1: ruleStringDescription
                    {
                     before(grammarAccess.getAbstractAccess().getStringDescriptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringDescription_in_rule__Abstract__Alternatives1458);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:720:1: rule__StringDescriptionInner__Alternatives : ( ( ruleStringOverRead ) | ( ruleStringKey ) | ( ruleStringValue ) | ( ( rule__StringDescriptionInner__KeyRefAssignment_3 ) ) | ( ruleStringComplex ) | ( ruleStringOr ) | ( ruleStringDescriptionInVariable ) );
    public final void rule__StringDescriptionInner__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:724:1: ( ( ruleStringOverRead ) | ( ruleStringKey ) | ( ruleStringValue ) | ( ( rule__StringDescriptionInner__KeyRefAssignment_3 ) ) | ( ruleStringComplex ) | ( ruleStringOr ) | ( ruleStringDescriptionInVariable ) )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:725:1: ( ruleStringOverRead )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:725:1: ( ruleStringOverRead )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:726:1: ruleStringOverRead
                    {
                     before(grammarAccess.getStringDescriptionInnerAccess().getStringOverReadParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringOverRead_in_rule__StringDescriptionInner__Alternatives1490);
                    ruleStringOverRead();

                    state._fsp--;

                     after(grammarAccess.getStringDescriptionInnerAccess().getStringOverReadParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:731:6: ( ruleStringKey )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:731:6: ( ruleStringKey )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:732:1: ruleStringKey
                    {
                     before(grammarAccess.getStringDescriptionInnerAccess().getStringKeyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringKey_in_rule__StringDescriptionInner__Alternatives1507);
                    ruleStringKey();

                    state._fsp--;

                     after(grammarAccess.getStringDescriptionInnerAccess().getStringKeyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:737:6: ( ruleStringValue )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:737:6: ( ruleStringValue )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:738:1: ruleStringValue
                    {
                     before(grammarAccess.getStringDescriptionInnerAccess().getStringValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__StringDescriptionInner__Alternatives1524);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getStringDescriptionInnerAccess().getStringValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:743:6: ( ( rule__StringDescriptionInner__KeyRefAssignment_3 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:743:6: ( ( rule__StringDescriptionInner__KeyRefAssignment_3 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:744:1: ( rule__StringDescriptionInner__KeyRefAssignment_3 )
                    {
                     before(grammarAccess.getStringDescriptionInnerAccess().getKeyRefAssignment_3()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:745:1: ( rule__StringDescriptionInner__KeyRefAssignment_3 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:745:2: rule__StringDescriptionInner__KeyRefAssignment_3
                    {
                    pushFollow(FOLLOW_rule__StringDescriptionInner__KeyRefAssignment_3_in_rule__StringDescriptionInner__Alternatives1541);
                    rule__StringDescriptionInner__KeyRefAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringDescriptionInnerAccess().getKeyRefAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:749:6: ( ruleStringComplex )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:749:6: ( ruleStringComplex )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:750:1: ruleStringComplex
                    {
                     before(grammarAccess.getStringDescriptionInnerAccess().getStringComplexParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleStringComplex_in_rule__StringDescriptionInner__Alternatives1559);
                    ruleStringComplex();

                    state._fsp--;

                     after(grammarAccess.getStringDescriptionInnerAccess().getStringComplexParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:755:6: ( ruleStringOr )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:755:6: ( ruleStringOr )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:756:1: ruleStringOr
                    {
                     before(grammarAccess.getStringDescriptionInnerAccess().getStringOrParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleStringOr_in_rule__StringDescriptionInner__Alternatives1576);
                    ruleStringOr();

                    state._fsp--;

                     after(grammarAccess.getStringDescriptionInnerAccess().getStringOrParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:761:6: ( ruleStringDescriptionInVariable )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:761:6: ( ruleStringDescriptionInVariable )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:762:1: ruleStringDescriptionInVariable
                    {
                     before(grammarAccess.getStringDescriptionInnerAccess().getStringDescriptionInVariableParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleStringDescriptionInVariable_in_rule__StringDescriptionInner__Alternatives1593);
                    ruleStringDescriptionInVariable();

                    state._fsp--;

                     after(grammarAccess.getStringDescriptionInnerAccess().getStringDescriptionInVariableParserRuleCall_6()); 

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


    // $ANTLR start "rule__StringComplex__Alternatives_3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:772:1: rule__StringComplex__Alternatives_3 : ( ( ( rule__StringComplex__ManyAssignment_3_0 ) ) | ( ( rule__StringComplex__MaybeAssignment_3_1 ) ) );
    public final void rule__StringComplex__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:776:1: ( ( ( rule__StringComplex__ManyAssignment_3_0 ) ) | ( ( rule__StringComplex__MaybeAssignment_3_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==41) ) {
                alt4=1;
            }
            else if ( (LA4_0==42) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:777:1: ( ( rule__StringComplex__ManyAssignment_3_0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:777:1: ( ( rule__StringComplex__ManyAssignment_3_0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:778:1: ( rule__StringComplex__ManyAssignment_3_0 )
                    {
                     before(grammarAccess.getStringComplexAccess().getManyAssignment_3_0()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:779:1: ( rule__StringComplex__ManyAssignment_3_0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:779:2: rule__StringComplex__ManyAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__StringComplex__ManyAssignment_3_0_in_rule__StringComplex__Alternatives_31625);
                    rule__StringComplex__ManyAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringComplexAccess().getManyAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:783:6: ( ( rule__StringComplex__MaybeAssignment_3_1 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:783:6: ( ( rule__StringComplex__MaybeAssignment_3_1 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:784:1: ( rule__StringComplex__MaybeAssignment_3_1 )
                    {
                     before(grammarAccess.getStringComplexAccess().getMaybeAssignment_3_1()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:785:1: ( rule__StringComplex__MaybeAssignment_3_1 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:785:2: rule__StringComplex__MaybeAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__StringComplex__MaybeAssignment_3_1_in_rule__StringComplex__Alternatives_31643);
                    rule__StringComplex__MaybeAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringComplexAccess().getMaybeAssignment_3_1()); 

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
    // $ANTLR end "rule__StringComplex__Alternatives_3"


    // $ANTLR start "rule__ObjectDescriptionInner__Alternatives_0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:794:1: rule__ObjectDescriptionInner__Alternatives_0 : ( ( ruleObjectNode ) | ( ruleObjectAttribute ) | ( ruleObjectNext ) | ( ruleObjectMaybe ) | ( ruleObjectMany ) | ( ruleObjectChoice ) );
    public final void rule__ObjectDescriptionInner__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:798:1: ( ( ruleObjectNode ) | ( ruleObjectAttribute ) | ( ruleObjectNext ) | ( ruleObjectMaybe ) | ( ruleObjectMany ) | ( ruleObjectChoice ) )
            int alt5=6;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:799:1: ( ruleObjectNode )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:799:1: ( ruleObjectNode )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:800:1: ruleObjectNode
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectNodeParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleObjectNode_in_rule__ObjectDescriptionInner__Alternatives_01676);
                    ruleObjectNode();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectNodeParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:805:6: ( ruleObjectAttribute )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:805:6: ( ruleObjectAttribute )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:806:1: ruleObjectAttribute
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectAttributeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleObjectAttribute_in_rule__ObjectDescriptionInner__Alternatives_01693);
                    ruleObjectAttribute();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectAttributeParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:811:6: ( ruleObjectNext )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:811:6: ( ruleObjectNext )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:812:1: ruleObjectNext
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectNextParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleObjectNext_in_rule__ObjectDescriptionInner__Alternatives_01710);
                    ruleObjectNext();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectNextParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:817:6: ( ruleObjectMaybe )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:817:6: ( ruleObjectMaybe )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:818:1: ruleObjectMaybe
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectMaybeParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleObjectMaybe_in_rule__ObjectDescriptionInner__Alternatives_01727);
                    ruleObjectMaybe();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectMaybeParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:823:6: ( ruleObjectMany )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:823:6: ( ruleObjectMany )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:824:1: ruleObjectMany
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectManyParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleObjectMany_in_rule__ObjectDescriptionInner__Alternatives_01744);
                    ruleObjectMany();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectManyParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:829:6: ( ruleObjectChoice )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:829:6: ( ruleObjectChoice )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:830:1: ruleObjectChoice
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectChoiceParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_ruleObjectChoice_in_rule__ObjectDescriptionInner__Alternatives_01761);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:840:1: rule__JavaCodeOrID__Alternatives : ( ( ( rule__JavaCodeOrID__Group_0__0 ) ) | ( ( rule__JavaCodeOrID__IdAssignment_1 ) ) );
    public final void rule__JavaCodeOrID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:844:1: ( ( ( rule__JavaCodeOrID__Group_0__0 ) ) | ( ( rule__JavaCodeOrID__IdAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==40) ) {
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
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:845:1: ( ( rule__JavaCodeOrID__Group_0__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:845:1: ( ( rule__JavaCodeOrID__Group_0__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:846:1: ( rule__JavaCodeOrID__Group_0__0 )
                    {
                     before(grammarAccess.getJavaCodeOrIDAccess().getGroup_0()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:847:1: ( rule__JavaCodeOrID__Group_0__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:847:2: rule__JavaCodeOrID__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__0_in_rule__JavaCodeOrID__Alternatives1793);
                    rule__JavaCodeOrID__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJavaCodeOrIDAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:851:6: ( ( rule__JavaCodeOrID__IdAssignment_1 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:851:6: ( ( rule__JavaCodeOrID__IdAssignment_1 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:852:1: ( rule__JavaCodeOrID__IdAssignment_1 )
                    {
                     before(grammarAccess.getJavaCodeOrIDAccess().getIdAssignment_1()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:853:1: ( rule__JavaCodeOrID__IdAssignment_1 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:853:2: rule__JavaCodeOrID__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JavaCodeOrID__IdAssignment_1_in_rule__JavaCodeOrID__Alternatives1811);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:862:1: rule__Type__Alternatives : ( ( 'boolean' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'char' ) | ( 'String' ) | ( 'byte' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:866:1: ( ( 'boolean' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'char' ) | ( 'String' ) | ( 'byte' ) )
            int alt7=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            case 14:
                {
                alt7=4;
                }
                break;
            case 15:
                {
                alt7=5;
                }
                break;
            case 16:
                {
                alt7=6;
                }
                break;
            case 17:
                {
                alt7=7;
                }
                break;
            case 18:
                {
                alt7=8;
                }
                break;
            case 19:
                {
                alt7=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:867:1: ( 'boolean' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:867:1: ( 'boolean' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:868:1: 'boolean'
                    {
                     before(grammarAccess.getTypeAccess().getBooleanKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Type__Alternatives1845); 
                     after(grammarAccess.getTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:875:6: ( 'short' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:875:6: ( 'short' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:876:1: 'short'
                    {
                     before(grammarAccess.getTypeAccess().getShortKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Type__Alternatives1865); 
                     after(grammarAccess.getTypeAccess().getShortKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:883:6: ( 'int' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:883:6: ( 'int' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:884:1: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Type__Alternatives1885); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:891:6: ( 'long' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:891:6: ( 'long' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:892:1: 'long'
                    {
                     before(grammarAccess.getTypeAccess().getLongKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Type__Alternatives1905); 
                     after(grammarAccess.getTypeAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:899:6: ( 'float' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:899:6: ( 'float' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:900:1: 'float'
                    {
                     before(grammarAccess.getTypeAccess().getFloatKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__Type__Alternatives1925); 
                     after(grammarAccess.getTypeAccess().getFloatKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:907:6: ( 'double' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:907:6: ( 'double' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:908:1: 'double'
                    {
                     before(grammarAccess.getTypeAccess().getDoubleKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__Type__Alternatives1945); 
                     after(grammarAccess.getTypeAccess().getDoubleKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:915:6: ( 'char' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:915:6: ( 'char' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:916:1: 'char'
                    {
                     before(grammarAccess.getTypeAccess().getCharKeyword_6()); 
                    match(input,17,FOLLOW_17_in_rule__Type__Alternatives1965); 
                     after(grammarAccess.getTypeAccess().getCharKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:923:6: ( 'String' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:923:6: ( 'String' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:924:1: 'String'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_7()); 
                    match(input,18,FOLLOW_18_in_rule__Type__Alternatives1985); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:931:6: ( 'byte' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:931:6: ( 'byte' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:932:1: 'byte'
                    {
                     before(grammarAccess.getTypeAccess().getByteKeyword_8()); 
                    match(input,19,FOLLOW_19_in_rule__Type__Alternatives2005); 
                     after(grammarAccess.getTypeAccess().getByteKeyword_8()); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:944:1: rule__ObjectMaybe__Alternatives : ( ( ( rule__ObjectMaybe__OptionAssignment_0 ) ) | ( ( rule__ObjectMaybe__Group_1__0 ) ) );
    public final void rule__ObjectMaybe__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:948:1: ( ( ( rule__ObjectMaybe__OptionAssignment_0 ) ) | ( ( rule__ObjectMaybe__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==36||(LA8_0>=38 && LA8_0<=39)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:949:1: ( ( rule__ObjectMaybe__OptionAssignment_0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:949:1: ( ( rule__ObjectMaybe__OptionAssignment_0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:950:1: ( rule__ObjectMaybe__OptionAssignment_0 )
                    {
                     before(grammarAccess.getObjectMaybeAccess().getOptionAssignment_0()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:951:1: ( rule__ObjectMaybe__OptionAssignment_0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:951:2: rule__ObjectMaybe__OptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ObjectMaybe__OptionAssignment_0_in_rule__ObjectMaybe__Alternatives2039);
                    rule__ObjectMaybe__OptionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectMaybeAccess().getOptionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:955:6: ( ( rule__ObjectMaybe__Group_1__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:955:6: ( ( rule__ObjectMaybe__Group_1__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:956:1: ( rule__ObjectMaybe__Group_1__0 )
                    {
                     before(grammarAccess.getObjectMaybeAccess().getGroup_1()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:957:1: ( rule__ObjectMaybe__Group_1__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:957:2: rule__ObjectMaybe__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__0_in_rule__ObjectMaybe__Alternatives2057);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:966:1: rule__ObjectMaybeInner__Alternatives : ( ( ruleObjectNext ) | ( ruleObjectNode ) | ( ruleObjectAttribute ) );
    public final void rule__ObjectMaybeInner__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:970:1: ( ( ruleObjectNext ) | ( ruleObjectNode ) | ( ruleObjectAttribute ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt9=1;
                }
                break;
            case 38:
                {
                alt9=2;
                }
                break;
            case 36:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:971:1: ( ruleObjectNext )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:971:1: ( ruleObjectNext )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:972:1: ruleObjectNext
                    {
                     before(grammarAccess.getObjectMaybeInnerAccess().getObjectNextParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleObjectNext_in_rule__ObjectMaybeInner__Alternatives2090);
                    ruleObjectNext();

                    state._fsp--;

                     after(grammarAccess.getObjectMaybeInnerAccess().getObjectNextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:977:6: ( ruleObjectNode )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:977:6: ( ruleObjectNode )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:978:1: ruleObjectNode
                    {
                     before(grammarAccess.getObjectMaybeInnerAccess().getObjectNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleObjectNode_in_rule__ObjectMaybeInner__Alternatives2107);
                    ruleObjectNode();

                    state._fsp--;

                     after(grammarAccess.getObjectMaybeInnerAccess().getObjectNodeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:983:6: ( ruleObjectAttribute )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:983:6: ( ruleObjectAttribute )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:984:1: ruleObjectAttribute
                    {
                     before(grammarAccess.getObjectMaybeInnerAccess().getObjectAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleObjectAttribute_in_rule__ObjectMaybeInner__Alternatives2124);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:996:1: rule__DTDSL__Group__0 : rule__DTDSL__Group__0__Impl rule__DTDSL__Group__1 ;
    public final void rule__DTDSL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1000:1: ( rule__DTDSL__Group__0__Impl rule__DTDSL__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1001:2: rule__DTDSL__Group__0__Impl rule__DTDSL__Group__1
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__0__Impl_in_rule__DTDSL__Group__02154);
            rule__DTDSL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__1_in_rule__DTDSL__Group__02157);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1008:1: rule__DTDSL__Group__0__Impl : ( 'parserName' ) ;
    public final void rule__DTDSL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1012:1: ( ( 'parserName' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1013:1: ( 'parserName' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1013:1: ( 'parserName' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1014:1: 'parserName'
            {
             before(grammarAccess.getDTDSLAccess().getParserNameKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__DTDSL__Group__0__Impl2185); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1027:1: rule__DTDSL__Group__1 : rule__DTDSL__Group__1__Impl rule__DTDSL__Group__2 ;
    public final void rule__DTDSL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1031:1: ( rule__DTDSL__Group__1__Impl rule__DTDSL__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1032:2: rule__DTDSL__Group__1__Impl rule__DTDSL__Group__2
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__1__Impl_in_rule__DTDSL__Group__12216);
            rule__DTDSL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__2_in_rule__DTDSL__Group__12219);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1039:1: rule__DTDSL__Group__1__Impl : ( '=' ) ;
    public final void rule__DTDSL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1043:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1044:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1044:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1045:1: '='
            {
             before(grammarAccess.getDTDSLAccess().getEqualsSignKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__DTDSL__Group__1__Impl2247); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1058:1: rule__DTDSL__Group__2 : rule__DTDSL__Group__2__Impl rule__DTDSL__Group__3 ;
    public final void rule__DTDSL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1062:1: ( rule__DTDSL__Group__2__Impl rule__DTDSL__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1063:2: rule__DTDSL__Group__2__Impl rule__DTDSL__Group__3
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__2__Impl_in_rule__DTDSL__Group__22278);
            rule__DTDSL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__3_in_rule__DTDSL__Group__22281);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1070:1: rule__DTDSL__Group__2__Impl : ( ( rule__DTDSL__ParserNameAssignment_2 ) ) ;
    public final void rule__DTDSL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1074:1: ( ( ( rule__DTDSL__ParserNameAssignment_2 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1075:1: ( ( rule__DTDSL__ParserNameAssignment_2 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1075:1: ( ( rule__DTDSL__ParserNameAssignment_2 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1076:1: ( rule__DTDSL__ParserNameAssignment_2 )
            {
             before(grammarAccess.getDTDSLAccess().getParserNameAssignment_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1077:1: ( rule__DTDSL__ParserNameAssignment_2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1077:2: rule__DTDSL__ParserNameAssignment_2
            {
            pushFollow(FOLLOW_rule__DTDSL__ParserNameAssignment_2_in_rule__DTDSL__Group__2__Impl2308);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1087:1: rule__DTDSL__Group__3 : rule__DTDSL__Group__3__Impl rule__DTDSL__Group__4 ;
    public final void rule__DTDSL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1091:1: ( rule__DTDSL__Group__3__Impl rule__DTDSL__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1092:2: rule__DTDSL__Group__3__Impl rule__DTDSL__Group__4
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__3__Impl_in_rule__DTDSL__Group__32338);
            rule__DTDSL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__4_in_rule__DTDSL__Group__32341);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1099:1: rule__DTDSL__Group__3__Impl : ( ';' ) ;
    public final void rule__DTDSL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1103:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1104:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1104:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1105:1: ';'
            {
             before(grammarAccess.getDTDSLAccess().getSemicolonKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__DTDSL__Group__3__Impl2369); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1118:1: rule__DTDSL__Group__4 : rule__DTDSL__Group__4__Impl rule__DTDSL__Group__5 ;
    public final void rule__DTDSL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1122:1: ( rule__DTDSL__Group__4__Impl rule__DTDSL__Group__5 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1123:2: rule__DTDSL__Group__4__Impl rule__DTDSL__Group__5
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__4__Impl_in_rule__DTDSL__Group__42400);
            rule__DTDSL__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__5_in_rule__DTDSL__Group__42403);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1130:1: rule__DTDSL__Group__4__Impl : ( ( rule__DTDSL__ObjDescriptionAssignment_4 )* ) ;
    public final void rule__DTDSL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1134:1: ( ( ( rule__DTDSL__ObjDescriptionAssignment_4 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1135:1: ( ( rule__DTDSL__ObjDescriptionAssignment_4 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1135:1: ( ( rule__DTDSL__ObjDescriptionAssignment_4 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1136:1: ( rule__DTDSL__ObjDescriptionAssignment_4 )*
            {
             before(grammarAccess.getDTDSLAccess().getObjDescriptionAssignment_4()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1137:1: ( rule__DTDSL__ObjDescriptionAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18||LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1137:2: rule__DTDSL__ObjDescriptionAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__DTDSL__ObjDescriptionAssignment_4_in_rule__DTDSL__Group__4__Impl2430);
            	    rule__DTDSL__ObjDescriptionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDTDSLAccess().getObjDescriptionAssignment_4()); 

            }


            }

        }
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1147:1: rule__DTDSL__Group__5 : rule__DTDSL__Group__5__Impl ;
    public final void rule__DTDSL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1151:1: ( rule__DTDSL__Group__5__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1152:2: rule__DTDSL__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__5__Impl_in_rule__DTDSL__Group__52461);
            rule__DTDSL__Group__5__Impl();

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1158:1: rule__DTDSL__Group__5__Impl : ( ( rule__DTDSL__StartAssignment_5 ) ) ;
    public final void rule__DTDSL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1162:1: ( ( ( rule__DTDSL__StartAssignment_5 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1163:1: ( ( rule__DTDSL__StartAssignment_5 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1163:1: ( ( rule__DTDSL__StartAssignment_5 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1164:1: ( rule__DTDSL__StartAssignment_5 )
            {
             before(grammarAccess.getDTDSLAccess().getStartAssignment_5()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1165:1: ( rule__DTDSL__StartAssignment_5 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1165:2: rule__DTDSL__StartAssignment_5
            {
            pushFollow(FOLLOW_rule__DTDSL__StartAssignment_5_in_rule__DTDSL__Group__5__Impl2488);
            rule__DTDSL__StartAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDTDSLAccess().getStartAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__StartPoint__Group_0__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1187:1: rule__StartPoint__Group_0__0 : rule__StartPoint__Group_0__0__Impl rule__StartPoint__Group_0__1 ;
    public final void rule__StartPoint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1191:1: ( rule__StartPoint__Group_0__0__Impl rule__StartPoint__Group_0__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1192:2: rule__StartPoint__Group_0__0__Impl rule__StartPoint__Group_0__1
            {
            pushFollow(FOLLOW_rule__StartPoint__Group_0__0__Impl_in_rule__StartPoint__Group_0__02530);
            rule__StartPoint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartPoint__Group_0__1_in_rule__StartPoint__Group_0__02533);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1199:1: rule__StartPoint__Group_0__0__Impl : ( 'beginWith' ) ;
    public final void rule__StartPoint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1203:1: ( ( 'beginWith' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1204:1: ( 'beginWith' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1204:1: ( 'beginWith' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1205:1: 'beginWith'
            {
             before(grammarAccess.getStartPointAccess().getBeginWithKeyword_0_0()); 
            match(input,23,FOLLOW_23_in_rule__StartPoint__Group_0__0__Impl2561); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1218:1: rule__StartPoint__Group_0__1 : rule__StartPoint__Group_0__1__Impl rule__StartPoint__Group_0__2 ;
    public final void rule__StartPoint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1222:1: ( rule__StartPoint__Group_0__1__Impl rule__StartPoint__Group_0__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1223:2: rule__StartPoint__Group_0__1__Impl rule__StartPoint__Group_0__2
            {
            pushFollow(FOLLOW_rule__StartPoint__Group_0__1__Impl_in_rule__StartPoint__Group_0__12592);
            rule__StartPoint__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartPoint__Group_0__2_in_rule__StartPoint__Group_0__12595);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1230:1: rule__StartPoint__Group_0__1__Impl : ( '=' ) ;
    public final void rule__StartPoint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1234:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1235:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1235:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1236:1: '='
            {
             before(grammarAccess.getStartPointAccess().getEqualsSignKeyword_0_1()); 
            match(input,21,FOLLOW_21_in_rule__StartPoint__Group_0__1__Impl2623); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1249:1: rule__StartPoint__Group_0__2 : rule__StartPoint__Group_0__2__Impl ;
    public final void rule__StartPoint__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1253:1: ( rule__StartPoint__Group_0__2__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1254:2: rule__StartPoint__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__StartPoint__Group_0__2__Impl_in_rule__StartPoint__Group_0__22654);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1260:1: rule__StartPoint__Group_0__2__Impl : ( ( rule__StartPoint__BeginAssignment_0_2 ) ) ;
    public final void rule__StartPoint__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1264:1: ( ( ( rule__StartPoint__BeginAssignment_0_2 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1265:1: ( ( rule__StartPoint__BeginAssignment_0_2 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1265:1: ( ( rule__StartPoint__BeginAssignment_0_2 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1266:1: ( rule__StartPoint__BeginAssignment_0_2 )
            {
             before(grammarAccess.getStartPointAccess().getBeginAssignment_0_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1267:1: ( rule__StartPoint__BeginAssignment_0_2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1267:2: rule__StartPoint__BeginAssignment_0_2
            {
            pushFollow(FOLLOW_rule__StartPoint__BeginAssignment_0_2_in_rule__StartPoint__Group_0__2__Impl2681);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1283:1: rule__StartPoint__Group_1__0 : rule__StartPoint__Group_1__0__Impl rule__StartPoint__Group_1__1 ;
    public final void rule__StartPoint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1287:1: ( rule__StartPoint__Group_1__0__Impl rule__StartPoint__Group_1__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1288:2: rule__StartPoint__Group_1__0__Impl rule__StartPoint__Group_1__1
            {
            pushFollow(FOLLOW_rule__StartPoint__Group_1__0__Impl_in_rule__StartPoint__Group_1__02717);
            rule__StartPoint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartPoint__Group_1__1_in_rule__StartPoint__Group_1__02720);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1295:1: rule__StartPoint__Group_1__0__Impl : ( ( rule__StartPoint__BeginAssignment_1_0 ) ) ;
    public final void rule__StartPoint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1299:1: ( ( ( rule__StartPoint__BeginAssignment_1_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1300:1: ( ( rule__StartPoint__BeginAssignment_1_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1300:1: ( ( rule__StartPoint__BeginAssignment_1_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1301:1: ( rule__StartPoint__BeginAssignment_1_0 )
            {
             before(grammarAccess.getStartPointAccess().getBeginAssignment_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1302:1: ( rule__StartPoint__BeginAssignment_1_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1302:2: rule__StartPoint__BeginAssignment_1_0
            {
            pushFollow(FOLLOW_rule__StartPoint__BeginAssignment_1_0_in_rule__StartPoint__Group_1__0__Impl2747);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1312:1: rule__StartPoint__Group_1__1 : rule__StartPoint__Group_1__1__Impl ;
    public final void rule__StartPoint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1316:1: ( rule__StartPoint__Group_1__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1317:2: rule__StartPoint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__StartPoint__Group_1__1__Impl_in_rule__StartPoint__Group_1__12777);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1323:1: rule__StartPoint__Group_1__1__Impl : ( ';' ) ;
    public final void rule__StartPoint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1327:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1328:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1328:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1329:1: ';'
            {
             before(grammarAccess.getStartPointAccess().getSemicolonKeyword_1_1()); 
            match(input,22,FOLLOW_22_in_rule__StartPoint__Group_1__1__Impl2805); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1346:1: rule__StringDescription__Group__0 : rule__StringDescription__Group__0__Impl rule__StringDescription__Group__1 ;
    public final void rule__StringDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1350:1: ( rule__StringDescription__Group__0__Impl rule__StringDescription__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1351:2: rule__StringDescription__Group__0__Impl rule__StringDescription__Group__1
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__0__Impl_in_rule__StringDescription__Group__02840);
            rule__StringDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__1_in_rule__StringDescription__Group__02843);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1358:1: rule__StringDescription__Group__0__Impl : ( 'String' ) ;
    public final void rule__StringDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1362:1: ( ( 'String' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1363:1: ( 'String' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1363:1: ( 'String' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1364:1: 'String'
            {
             before(grammarAccess.getStringDescriptionAccess().getStringKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__StringDescription__Group__0__Impl2871); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1377:1: rule__StringDescription__Group__1 : rule__StringDescription__Group__1__Impl rule__StringDescription__Group__2 ;
    public final void rule__StringDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1381:1: ( rule__StringDescription__Group__1__Impl rule__StringDescription__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1382:2: rule__StringDescription__Group__1__Impl rule__StringDescription__Group__2
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__1__Impl_in_rule__StringDescription__Group__12902);
            rule__StringDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__2_in_rule__StringDescription__Group__12905);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1389:1: rule__StringDescription__Group__1__Impl : ( ( rule__StringDescription__NameAssignment_1 ) ) ;
    public final void rule__StringDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1393:1: ( ( ( rule__StringDescription__NameAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1394:1: ( ( rule__StringDescription__NameAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1394:1: ( ( rule__StringDescription__NameAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1395:1: ( rule__StringDescription__NameAssignment_1 )
            {
             before(grammarAccess.getStringDescriptionAccess().getNameAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1396:1: ( rule__StringDescription__NameAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1396:2: rule__StringDescription__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StringDescription__NameAssignment_1_in_rule__StringDescription__Group__1__Impl2932);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1406:1: rule__StringDescription__Group__2 : rule__StringDescription__Group__2__Impl rule__StringDescription__Group__3 ;
    public final void rule__StringDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1410:1: ( rule__StringDescription__Group__2__Impl rule__StringDescription__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1411:2: rule__StringDescription__Group__2__Impl rule__StringDescription__Group__3
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__2__Impl_in_rule__StringDescription__Group__22962);
            rule__StringDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__3_in_rule__StringDescription__Group__22965);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1418:1: rule__StringDescription__Group__2__Impl : ( ':' ) ;
    public final void rule__StringDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1422:1: ( ( ':' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1423:1: ( ':' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1423:1: ( ':' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1424:1: ':'
            {
             before(grammarAccess.getStringDescriptionAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__StringDescription__Group__2__Impl2993); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1437:1: rule__StringDescription__Group__3 : rule__StringDescription__Group__3__Impl rule__StringDescription__Group__4 ;
    public final void rule__StringDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1441:1: ( rule__StringDescription__Group__3__Impl rule__StringDescription__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1442:2: rule__StringDescription__Group__3__Impl rule__StringDescription__Group__4
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__3__Impl_in_rule__StringDescription__Group__33024);
            rule__StringDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__4_in_rule__StringDescription__Group__33027);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1449:1: rule__StringDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__StringDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1453:1: ( ( '{' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1454:1: ( '{' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1454:1: ( '{' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1455:1: '{'
            {
             before(grammarAccess.getStringDescriptionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__StringDescription__Group__3__Impl3055); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1468:1: rule__StringDescription__Group__4 : rule__StringDescription__Group__4__Impl rule__StringDescription__Group__5 ;
    public final void rule__StringDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1472:1: ( rule__StringDescription__Group__4__Impl rule__StringDescription__Group__5 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1473:2: rule__StringDescription__Group__4__Impl rule__StringDescription__Group__5
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__4__Impl_in_rule__StringDescription__Group__43086);
            rule__StringDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__5_in_rule__StringDescription__Group__43089);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1480:1: rule__StringDescription__Group__4__Impl : ( ( rule__StringDescription__DescriptionAssignment_4 )* ) ;
    public final void rule__StringDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1484:1: ( ( ( rule__StringDescription__DescriptionAssignment_4 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1485:1: ( ( rule__StringDescription__DescriptionAssignment_4 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1485:1: ( ( rule__StringDescription__DescriptionAssignment_4 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1486:1: ( rule__StringDescription__DescriptionAssignment_4 )*
            {
             before(grammarAccess.getStringDescriptionAccess().getDescriptionAssignment_4()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1487:1: ( rule__StringDescription__DescriptionAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)||LA11_0==27||LA11_0==29||(LA11_0>=31 && LA11_0<=32)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1487:2: rule__StringDescription__DescriptionAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__StringDescription__DescriptionAssignment_4_in_rule__StringDescription__Group__4__Impl3116);
            	    rule__StringDescription__DescriptionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1497:1: rule__StringDescription__Group__5 : rule__StringDescription__Group__5__Impl ;
    public final void rule__StringDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1501:1: ( rule__StringDescription__Group__5__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1502:2: rule__StringDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__5__Impl_in_rule__StringDescription__Group__53147);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1508:1: rule__StringDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__StringDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1512:1: ( ( '}' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1513:1: ( '}' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1513:1: ( '}' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1514:1: '}'
            {
             before(grammarAccess.getStringDescriptionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__StringDescription__Group__5__Impl3175); 
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


    // $ANTLR start "rule__StringKey__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1539:1: rule__StringKey__Group__0 : rule__StringKey__Group__0__Impl rule__StringKey__Group__1 ;
    public final void rule__StringKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1543:1: ( rule__StringKey__Group__0__Impl rule__StringKey__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1544:2: rule__StringKey__Group__0__Impl rule__StringKey__Group__1
            {
            pushFollow(FOLLOW_rule__StringKey__Group__0__Impl_in_rule__StringKey__Group__03218);
            rule__StringKey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringKey__Group__1_in_rule__StringKey__Group__03221);
            rule__StringKey__Group__1();

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
    // $ANTLR end "rule__StringKey__Group__0"


    // $ANTLR start "rule__StringKey__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1551:1: rule__StringKey__Group__0__Impl : ( () ) ;
    public final void rule__StringKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1555:1: ( ( () ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1556:1: ( () )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1556:1: ( () )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1557:1: ()
            {
             before(grammarAccess.getStringKeyAccess().getStringKeyAction_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1558:1: ()
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1560:1: 
            {
            }

             after(grammarAccess.getStringKeyAccess().getStringKeyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringKey__Group__0__Impl"


    // $ANTLR start "rule__StringKey__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1570:1: rule__StringKey__Group__1 : rule__StringKey__Group__1__Impl rule__StringKey__Group__2 ;
    public final void rule__StringKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1574:1: ( rule__StringKey__Group__1__Impl rule__StringKey__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1575:2: rule__StringKey__Group__1__Impl rule__StringKey__Group__2
            {
            pushFollow(FOLLOW_rule__StringKey__Group__1__Impl_in_rule__StringKey__Group__13279);
            rule__StringKey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringKey__Group__2_in_rule__StringKey__Group__13282);
            rule__StringKey__Group__2();

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
    // $ANTLR end "rule__StringKey__Group__1"


    // $ANTLR start "rule__StringKey__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1582:1: rule__StringKey__Group__1__Impl : ( ( rule__StringKey__Group_1__0 )? ) ;
    public final void rule__StringKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1586:1: ( ( ( rule__StringKey__Group_1__0 )? ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1587:1: ( ( rule__StringKey__Group_1__0 )? )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1587:1: ( ( rule__StringKey__Group_1__0 )? )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1588:1: ( rule__StringKey__Group_1__0 )?
            {
             before(grammarAccess.getStringKeyAccess().getGroup_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1589:1: ( rule__StringKey__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1589:2: rule__StringKey__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StringKey__Group_1__0_in_rule__StringKey__Group__1__Impl3309);
                    rule__StringKey__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringKeyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringKey__Group__1__Impl"


    // $ANTLR start "rule__StringKey__Group__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1599:1: rule__StringKey__Group__2 : rule__StringKey__Group__2__Impl rule__StringKey__Group__3 ;
    public final void rule__StringKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1603:1: ( rule__StringKey__Group__2__Impl rule__StringKey__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1604:2: rule__StringKey__Group__2__Impl rule__StringKey__Group__3
            {
            pushFollow(FOLLOW_rule__StringKey__Group__2__Impl_in_rule__StringKey__Group__23340);
            rule__StringKey__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringKey__Group__3_in_rule__StringKey__Group__23343);
            rule__StringKey__Group__3();

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
    // $ANTLR end "rule__StringKey__Group__2"


    // $ANTLR start "rule__StringKey__Group__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1611:1: rule__StringKey__Group__2__Impl : ( 'Key' ) ;
    public final void rule__StringKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1615:1: ( ( 'Key' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1616:1: ( 'Key' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1616:1: ( 'Key' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1617:1: 'Key'
            {
             before(grammarAccess.getStringKeyAccess().getKeyKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__StringKey__Group__2__Impl3371); 
             after(grammarAccess.getStringKeyAccess().getKeyKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringKey__Group__2__Impl"


    // $ANTLR start "rule__StringKey__Group__3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1630:1: rule__StringKey__Group__3 : rule__StringKey__Group__3__Impl rule__StringKey__Group__4 ;
    public final void rule__StringKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1634:1: ( rule__StringKey__Group__3__Impl rule__StringKey__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1635:2: rule__StringKey__Group__3__Impl rule__StringKey__Group__4
            {
            pushFollow(FOLLOW_rule__StringKey__Group__3__Impl_in_rule__StringKey__Group__33402);
            rule__StringKey__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringKey__Group__4_in_rule__StringKey__Group__33405);
            rule__StringKey__Group__4();

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
    // $ANTLR end "rule__StringKey__Group__3"


    // $ANTLR start "rule__StringKey__Group__3__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1642:1: rule__StringKey__Group__3__Impl : ( 'ofType' ) ;
    public final void rule__StringKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1646:1: ( ( 'ofType' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1647:1: ( 'ofType' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1647:1: ( 'ofType' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1648:1: 'ofType'
            {
             before(grammarAccess.getStringKeyAccess().getOfTypeKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__StringKey__Group__3__Impl3433); 
             after(grammarAccess.getStringKeyAccess().getOfTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringKey__Group__3__Impl"


    // $ANTLR start "rule__StringKey__Group__4"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1661:1: rule__StringKey__Group__4 : rule__StringKey__Group__4__Impl ;
    public final void rule__StringKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1665:1: ( rule__StringKey__Group__4__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1666:2: rule__StringKey__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StringKey__Group__4__Impl_in_rule__StringKey__Group__43464);
            rule__StringKey__Group__4__Impl();

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
    // $ANTLR end "rule__StringKey__Group__4"


    // $ANTLR start "rule__StringKey__Group__4__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1672:1: rule__StringKey__Group__4__Impl : ( ( rule__StringKey__TypeAssignment_4 ) ) ;
    public final void rule__StringKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1676:1: ( ( ( rule__StringKey__TypeAssignment_4 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1677:1: ( ( rule__StringKey__TypeAssignment_4 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1677:1: ( ( rule__StringKey__TypeAssignment_4 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1678:1: ( rule__StringKey__TypeAssignment_4 )
            {
             before(grammarAccess.getStringKeyAccess().getTypeAssignment_4()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1679:1: ( rule__StringKey__TypeAssignment_4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1679:2: rule__StringKey__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__StringKey__TypeAssignment_4_in_rule__StringKey__Group__4__Impl3491);
            rule__StringKey__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStringKeyAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringKey__Group__4__Impl"


    // $ANTLR start "rule__StringKey__Group_1__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1699:1: rule__StringKey__Group_1__0 : rule__StringKey__Group_1__0__Impl rule__StringKey__Group_1__1 ;
    public final void rule__StringKey__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1703:1: ( rule__StringKey__Group_1__0__Impl rule__StringKey__Group_1__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1704:2: rule__StringKey__Group_1__0__Impl rule__StringKey__Group_1__1
            {
            pushFollow(FOLLOW_rule__StringKey__Group_1__0__Impl_in_rule__StringKey__Group_1__03531);
            rule__StringKey__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringKey__Group_1__1_in_rule__StringKey__Group_1__03534);
            rule__StringKey__Group_1__1();

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
    // $ANTLR end "rule__StringKey__Group_1__0"


    // $ANTLR start "rule__StringKey__Group_1__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1711:1: rule__StringKey__Group_1__0__Impl : ( ( rule__StringKey__NameAssignment_1_0 ) ) ;
    public final void rule__StringKey__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1715:1: ( ( ( rule__StringKey__NameAssignment_1_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1716:1: ( ( rule__StringKey__NameAssignment_1_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1716:1: ( ( rule__StringKey__NameAssignment_1_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1717:1: ( rule__StringKey__NameAssignment_1_0 )
            {
             before(grammarAccess.getStringKeyAccess().getNameAssignment_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1718:1: ( rule__StringKey__NameAssignment_1_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1718:2: rule__StringKey__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__StringKey__NameAssignment_1_0_in_rule__StringKey__Group_1__0__Impl3561);
            rule__StringKey__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStringKeyAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringKey__Group_1__0__Impl"


    // $ANTLR start "rule__StringKey__Group_1__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1728:1: rule__StringKey__Group_1__1 : rule__StringKey__Group_1__1__Impl ;
    public final void rule__StringKey__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1732:1: ( rule__StringKey__Group_1__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1733:2: rule__StringKey__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__StringKey__Group_1__1__Impl_in_rule__StringKey__Group_1__13591);
            rule__StringKey__Group_1__1__Impl();

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
    // $ANTLR end "rule__StringKey__Group_1__1"


    // $ANTLR start "rule__StringKey__Group_1__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1739:1: rule__StringKey__Group_1__1__Impl : ( '=' ) ;
    public final void rule__StringKey__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1743:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1744:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1744:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1745:1: '='
            {
             before(grammarAccess.getStringKeyAccess().getEqualsSignKeyword_1_1()); 
            match(input,21,FOLLOW_21_in_rule__StringKey__Group_1__1__Impl3619); 
             after(grammarAccess.getStringKeyAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringKey__Group_1__1__Impl"


    // $ANTLR start "rule__StringValue__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1762:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1766:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1767:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FOLLOW_rule__StringValue__Group__0__Impl_in_rule__StringValue__Group__03654);
            rule__StringValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringValue__Group__1_in_rule__StringValue__Group__03657);
            rule__StringValue__Group__1();

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
    // $ANTLR end "rule__StringValue__Group__0"


    // $ANTLR start "rule__StringValue__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1774:1: rule__StringValue__Group__0__Impl : ( () ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1778:1: ( ( () ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1779:1: ( () )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1779:1: ( () )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1780:1: ()
            {
             before(grammarAccess.getStringValueAccess().getStringValueAction_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1781:1: ()
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1783:1: 
            {
            }

             after(grammarAccess.getStringValueAccess().getStringValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__0__Impl"


    // $ANTLR start "rule__StringValue__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1793:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl rule__StringValue__Group__2 ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1797:1: ( rule__StringValue__Group__1__Impl rule__StringValue__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1798:2: rule__StringValue__Group__1__Impl rule__StringValue__Group__2
            {
            pushFollow(FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__13715);
            rule__StringValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringValue__Group__2_in_rule__StringValue__Group__13718);
            rule__StringValue__Group__2();

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
    // $ANTLR end "rule__StringValue__Group__1"


    // $ANTLR start "rule__StringValue__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1805:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__Group_1__0 )? ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1809:1: ( ( ( rule__StringValue__Group_1__0 )? ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1810:1: ( ( rule__StringValue__Group_1__0 )? )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1810:1: ( ( rule__StringValue__Group_1__0 )? )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1811:1: ( rule__StringValue__Group_1__0 )?
            {
             before(grammarAccess.getStringValueAccess().getGroup_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1812:1: ( rule__StringValue__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1812:2: rule__StringValue__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StringValue__Group_1__0_in_rule__StringValue__Group__1__Impl3745);
                    rule__StringValue__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringValueAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__1__Impl"


    // $ANTLR start "rule__StringValue__Group__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1822:1: rule__StringValue__Group__2 : rule__StringValue__Group__2__Impl rule__StringValue__Group__3 ;
    public final void rule__StringValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1826:1: ( rule__StringValue__Group__2__Impl rule__StringValue__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1827:2: rule__StringValue__Group__2__Impl rule__StringValue__Group__3
            {
            pushFollow(FOLLOW_rule__StringValue__Group__2__Impl_in_rule__StringValue__Group__23776);
            rule__StringValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringValue__Group__3_in_rule__StringValue__Group__23779);
            rule__StringValue__Group__3();

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
    // $ANTLR end "rule__StringValue__Group__2"


    // $ANTLR start "rule__StringValue__Group__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1834:1: rule__StringValue__Group__2__Impl : ( 'Value' ) ;
    public final void rule__StringValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1838:1: ( ( 'Value' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1839:1: ( 'Value' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1839:1: ( 'Value' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1840:1: 'Value'
            {
             before(grammarAccess.getStringValueAccess().getValueKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__StringValue__Group__2__Impl3807); 
             after(grammarAccess.getStringValueAccess().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__2__Impl"


    // $ANTLR start "rule__StringValue__Group__3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1853:1: rule__StringValue__Group__3 : rule__StringValue__Group__3__Impl rule__StringValue__Group__4 ;
    public final void rule__StringValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1857:1: ( rule__StringValue__Group__3__Impl rule__StringValue__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1858:2: rule__StringValue__Group__3__Impl rule__StringValue__Group__4
            {
            pushFollow(FOLLOW_rule__StringValue__Group__3__Impl_in_rule__StringValue__Group__33838);
            rule__StringValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringValue__Group__4_in_rule__StringValue__Group__33841);
            rule__StringValue__Group__4();

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
    // $ANTLR end "rule__StringValue__Group__3"


    // $ANTLR start "rule__StringValue__Group__3__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1865:1: rule__StringValue__Group__3__Impl : ( 'ofType' ) ;
    public final void rule__StringValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1869:1: ( ( 'ofType' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1870:1: ( 'ofType' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1870:1: ( 'ofType' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1871:1: 'ofType'
            {
             before(grammarAccess.getStringValueAccess().getOfTypeKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__StringValue__Group__3__Impl3869); 
             after(grammarAccess.getStringValueAccess().getOfTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__3__Impl"


    // $ANTLR start "rule__StringValue__Group__4"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1884:1: rule__StringValue__Group__4 : rule__StringValue__Group__4__Impl rule__StringValue__Group__5 ;
    public final void rule__StringValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1888:1: ( rule__StringValue__Group__4__Impl rule__StringValue__Group__5 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1889:2: rule__StringValue__Group__4__Impl rule__StringValue__Group__5
            {
            pushFollow(FOLLOW_rule__StringValue__Group__4__Impl_in_rule__StringValue__Group__43900);
            rule__StringValue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringValue__Group__5_in_rule__StringValue__Group__43903);
            rule__StringValue__Group__5();

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
    // $ANTLR end "rule__StringValue__Group__4"


    // $ANTLR start "rule__StringValue__Group__4__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1896:1: rule__StringValue__Group__4__Impl : ( ( rule__StringValue__TypeAssignment_4 ) ) ;
    public final void rule__StringValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1900:1: ( ( ( rule__StringValue__TypeAssignment_4 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1901:1: ( ( rule__StringValue__TypeAssignment_4 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1901:1: ( ( rule__StringValue__TypeAssignment_4 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1902:1: ( rule__StringValue__TypeAssignment_4 )
            {
             before(grammarAccess.getStringValueAccess().getTypeAssignment_4()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1903:1: ( rule__StringValue__TypeAssignment_4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1903:2: rule__StringValue__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__StringValue__TypeAssignment_4_in_rule__StringValue__Group__4__Impl3930);
            rule__StringValue__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__4__Impl"


    // $ANTLR start "rule__StringValue__Group__5"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1913:1: rule__StringValue__Group__5 : rule__StringValue__Group__5__Impl ;
    public final void rule__StringValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1917:1: ( rule__StringValue__Group__5__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1918:2: rule__StringValue__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__StringValue__Group__5__Impl_in_rule__StringValue__Group__53960);
            rule__StringValue__Group__5__Impl();

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
    // $ANTLR end "rule__StringValue__Group__5"


    // $ANTLR start "rule__StringValue__Group__5__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1924:1: rule__StringValue__Group__5__Impl : ( ( rule__StringValue__Group_5__0 )? ) ;
    public final void rule__StringValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1928:1: ( ( ( rule__StringValue__Group_5__0 )? ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1929:1: ( ( rule__StringValue__Group_5__0 )? )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1929:1: ( ( rule__StringValue__Group_5__0 )? )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1930:1: ( rule__StringValue__Group_5__0 )?
            {
             before(grammarAccess.getStringValueAccess().getGroup_5()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1931:1: ( rule__StringValue__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1931:2: rule__StringValue__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__StringValue__Group_5__0_in_rule__StringValue__Group__5__Impl3987);
                    rule__StringValue__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringValueAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__5__Impl"


    // $ANTLR start "rule__StringValue__Group_1__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1953:1: rule__StringValue__Group_1__0 : rule__StringValue__Group_1__0__Impl rule__StringValue__Group_1__1 ;
    public final void rule__StringValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1957:1: ( rule__StringValue__Group_1__0__Impl rule__StringValue__Group_1__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1958:2: rule__StringValue__Group_1__0__Impl rule__StringValue__Group_1__1
            {
            pushFollow(FOLLOW_rule__StringValue__Group_1__0__Impl_in_rule__StringValue__Group_1__04030);
            rule__StringValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringValue__Group_1__1_in_rule__StringValue__Group_1__04033);
            rule__StringValue__Group_1__1();

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
    // $ANTLR end "rule__StringValue__Group_1__0"


    // $ANTLR start "rule__StringValue__Group_1__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1965:1: rule__StringValue__Group_1__0__Impl : ( ( rule__StringValue__NameAssignment_1_0 ) ) ;
    public final void rule__StringValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1969:1: ( ( ( rule__StringValue__NameAssignment_1_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1970:1: ( ( rule__StringValue__NameAssignment_1_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1970:1: ( ( rule__StringValue__NameAssignment_1_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1971:1: ( rule__StringValue__NameAssignment_1_0 )
            {
             before(grammarAccess.getStringValueAccess().getNameAssignment_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1972:1: ( rule__StringValue__NameAssignment_1_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1972:2: rule__StringValue__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__StringValue__NameAssignment_1_0_in_rule__StringValue__Group_1__0__Impl4060);
            rule__StringValue__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_1__0__Impl"


    // $ANTLR start "rule__StringValue__Group_1__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1982:1: rule__StringValue__Group_1__1 : rule__StringValue__Group_1__1__Impl ;
    public final void rule__StringValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1986:1: ( rule__StringValue__Group_1__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1987:2: rule__StringValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__StringValue__Group_1__1__Impl_in_rule__StringValue__Group_1__14090);
            rule__StringValue__Group_1__1__Impl();

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
    // $ANTLR end "rule__StringValue__Group_1__1"


    // $ANTLR start "rule__StringValue__Group_1__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1993:1: rule__StringValue__Group_1__1__Impl : ( '=' ) ;
    public final void rule__StringValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1997:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1998:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1998:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1999:1: '='
            {
             before(grammarAccess.getStringValueAccess().getEqualsSignKeyword_1_1()); 
            match(input,21,FOLLOW_21_in_rule__StringValue__Group_1__1__Impl4118); 
             after(grammarAccess.getStringValueAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_1__1__Impl"


    // $ANTLR start "rule__StringValue__Group_5__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2016:1: rule__StringValue__Group_5__0 : rule__StringValue__Group_5__0__Impl rule__StringValue__Group_5__1 ;
    public final void rule__StringValue__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2020:1: ( rule__StringValue__Group_5__0__Impl rule__StringValue__Group_5__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2021:2: rule__StringValue__Group_5__0__Impl rule__StringValue__Group_5__1
            {
            pushFollow(FOLLOW_rule__StringValue__Group_5__0__Impl_in_rule__StringValue__Group_5__04153);
            rule__StringValue__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringValue__Group_5__1_in_rule__StringValue__Group_5__04156);
            rule__StringValue__Group_5__1();

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
    // $ANTLR end "rule__StringValue__Group_5__0"


    // $ANTLR start "rule__StringValue__Group_5__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2028:1: rule__StringValue__Group_5__0__Impl : ( 'to' ) ;
    public final void rule__StringValue__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2032:1: ( ( 'to' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2033:1: ( 'to' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2033:1: ( 'to' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2034:1: 'to'
            {
             before(grammarAccess.getStringValueAccess().getToKeyword_5_0()); 
            match(input,30,FOLLOW_30_in_rule__StringValue__Group_5__0__Impl4184); 
             after(grammarAccess.getStringValueAccess().getToKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_5__0__Impl"


    // $ANTLR start "rule__StringValue__Group_5__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2047:1: rule__StringValue__Group_5__1 : rule__StringValue__Group_5__1__Impl ;
    public final void rule__StringValue__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2051:1: ( rule__StringValue__Group_5__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2052:2: rule__StringValue__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__StringValue__Group_5__1__Impl_in_rule__StringValue__Group_5__14215);
            rule__StringValue__Group_5__1__Impl();

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
    // $ANTLR end "rule__StringValue__Group_5__1"


    // $ANTLR start "rule__StringValue__Group_5__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2058:1: rule__StringValue__Group_5__1__Impl : ( ( rule__StringValue__ToKeyAssignment_5_1 ) ) ;
    public final void rule__StringValue__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2062:1: ( ( ( rule__StringValue__ToKeyAssignment_5_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2063:1: ( ( rule__StringValue__ToKeyAssignment_5_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2063:1: ( ( rule__StringValue__ToKeyAssignment_5_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2064:1: ( rule__StringValue__ToKeyAssignment_5_1 )
            {
             before(grammarAccess.getStringValueAccess().getToKeyAssignment_5_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2065:1: ( rule__StringValue__ToKeyAssignment_5_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2065:2: rule__StringValue__ToKeyAssignment_5_1
            {
            pushFollow(FOLLOW_rule__StringValue__ToKeyAssignment_5_1_in_rule__StringValue__Group_5__1__Impl4242);
            rule__StringValue__ToKeyAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getToKeyAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_5__1__Impl"


    // $ANTLR start "rule__StringOr__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2079:1: rule__StringOr__Group__0 : rule__StringOr__Group__0__Impl rule__StringOr__Group__1 ;
    public final void rule__StringOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2083:1: ( rule__StringOr__Group__0__Impl rule__StringOr__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2084:2: rule__StringOr__Group__0__Impl rule__StringOr__Group__1
            {
            pushFollow(FOLLOW_rule__StringOr__Group__0__Impl_in_rule__StringOr__Group__04276);
            rule__StringOr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringOr__Group__1_in_rule__StringOr__Group__04279);
            rule__StringOr__Group__1();

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
    // $ANTLR end "rule__StringOr__Group__0"


    // $ANTLR start "rule__StringOr__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2091:1: rule__StringOr__Group__0__Impl : ( () ) ;
    public final void rule__StringOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2095:1: ( ( () ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2096:1: ( () )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2096:1: ( () )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2097:1: ()
            {
             before(grammarAccess.getStringOrAccess().getStringOrAction_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2098:1: ()
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2100:1: 
            {
            }

             after(grammarAccess.getStringOrAccess().getStringOrAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOr__Group__0__Impl"


    // $ANTLR start "rule__StringOr__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2110:1: rule__StringOr__Group__1 : rule__StringOr__Group__1__Impl rule__StringOr__Group__2 ;
    public final void rule__StringOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2114:1: ( rule__StringOr__Group__1__Impl rule__StringOr__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2115:2: rule__StringOr__Group__1__Impl rule__StringOr__Group__2
            {
            pushFollow(FOLLOW_rule__StringOr__Group__1__Impl_in_rule__StringOr__Group__14337);
            rule__StringOr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringOr__Group__2_in_rule__StringOr__Group__14340);
            rule__StringOr__Group__2();

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
    // $ANTLR end "rule__StringOr__Group__1"


    // $ANTLR start "rule__StringOr__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2122:1: rule__StringOr__Group__1__Impl : ( 'or' ) ;
    public final void rule__StringOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2126:1: ( ( 'or' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2127:1: ( 'or' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2127:1: ( 'or' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2128:1: 'or'
            {
             before(grammarAccess.getStringOrAccess().getOrKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__StringOr__Group__1__Impl4368); 
             after(grammarAccess.getStringOrAccess().getOrKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOr__Group__1__Impl"


    // $ANTLR start "rule__StringOr__Group__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2141:1: rule__StringOr__Group__2 : rule__StringOr__Group__2__Impl rule__StringOr__Group__3 ;
    public final void rule__StringOr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2145:1: ( rule__StringOr__Group__2__Impl rule__StringOr__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2146:2: rule__StringOr__Group__2__Impl rule__StringOr__Group__3
            {
            pushFollow(FOLLOW_rule__StringOr__Group__2__Impl_in_rule__StringOr__Group__24399);
            rule__StringOr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringOr__Group__3_in_rule__StringOr__Group__24402);
            rule__StringOr__Group__3();

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
    // $ANTLR end "rule__StringOr__Group__2"


    // $ANTLR start "rule__StringOr__Group__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2153:1: rule__StringOr__Group__2__Impl : ( '(' ) ;
    public final void rule__StringOr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2157:1: ( ( '(' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2158:1: ( '(' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2158:1: ( '(' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2159:1: '('
            {
             before(grammarAccess.getStringOrAccess().getLeftParenthesisKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__StringOr__Group__2__Impl4430); 
             after(grammarAccess.getStringOrAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOr__Group__2__Impl"


    // $ANTLR start "rule__StringOr__Group__3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2172:1: rule__StringOr__Group__3 : rule__StringOr__Group__3__Impl rule__StringOr__Group__4 ;
    public final void rule__StringOr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2176:1: ( rule__StringOr__Group__3__Impl rule__StringOr__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2177:2: rule__StringOr__Group__3__Impl rule__StringOr__Group__4
            {
            pushFollow(FOLLOW_rule__StringOr__Group__3__Impl_in_rule__StringOr__Group__34461);
            rule__StringOr__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringOr__Group__4_in_rule__StringOr__Group__34464);
            rule__StringOr__Group__4();

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
    // $ANTLR end "rule__StringOr__Group__3"


    // $ANTLR start "rule__StringOr__Group__3__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2184:1: rule__StringOr__Group__3__Impl : ( ( rule__StringOr__OptionAssignment_3 ) ) ;
    public final void rule__StringOr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2188:1: ( ( ( rule__StringOr__OptionAssignment_3 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2189:1: ( ( rule__StringOr__OptionAssignment_3 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2189:1: ( ( rule__StringOr__OptionAssignment_3 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2190:1: ( rule__StringOr__OptionAssignment_3 )
            {
             before(grammarAccess.getStringOrAccess().getOptionAssignment_3()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2191:1: ( rule__StringOr__OptionAssignment_3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2191:2: rule__StringOr__OptionAssignment_3
            {
            pushFollow(FOLLOW_rule__StringOr__OptionAssignment_3_in_rule__StringOr__Group__3__Impl4491);
            rule__StringOr__OptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStringOrAccess().getOptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOr__Group__3__Impl"


    // $ANTLR start "rule__StringOr__Group__4"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2201:1: rule__StringOr__Group__4 : rule__StringOr__Group__4__Impl rule__StringOr__Group__5 ;
    public final void rule__StringOr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2205:1: ( rule__StringOr__Group__4__Impl rule__StringOr__Group__5 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2206:2: rule__StringOr__Group__4__Impl rule__StringOr__Group__5
            {
            pushFollow(FOLLOW_rule__StringOr__Group__4__Impl_in_rule__StringOr__Group__44521);
            rule__StringOr__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringOr__Group__5_in_rule__StringOr__Group__44524);
            rule__StringOr__Group__5();

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
    // $ANTLR end "rule__StringOr__Group__4"


    // $ANTLR start "rule__StringOr__Group__4__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2213:1: rule__StringOr__Group__4__Impl : ( ( rule__StringOr__Group_4__0 )* ) ;
    public final void rule__StringOr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2217:1: ( ( ( rule__StringOr__Group_4__0 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2218:1: ( ( rule__StringOr__Group_4__0 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2218:1: ( ( rule__StringOr__Group_4__0 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2219:1: ( rule__StringOr__Group_4__0 )*
            {
             before(grammarAccess.getStringOrAccess().getGroup_4()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2220:1: ( rule__StringOr__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2220:2: rule__StringOr__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__StringOr__Group_4__0_in_rule__StringOr__Group__4__Impl4551);
            	    rule__StringOr__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getStringOrAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOr__Group__4__Impl"


    // $ANTLR start "rule__StringOr__Group__5"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2230:1: rule__StringOr__Group__5 : rule__StringOr__Group__5__Impl ;
    public final void rule__StringOr__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2234:1: ( rule__StringOr__Group__5__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2235:2: rule__StringOr__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__StringOr__Group__5__Impl_in_rule__StringOr__Group__54582);
            rule__StringOr__Group__5__Impl();

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
    // $ANTLR end "rule__StringOr__Group__5"


    // $ANTLR start "rule__StringOr__Group__5__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2241:1: rule__StringOr__Group__5__Impl : ( ')' ) ;
    public final void rule__StringOr__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2245:1: ( ( ')' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2246:1: ( ')' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2246:1: ( ')' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2247:1: ')'
            {
             before(grammarAccess.getStringOrAccess().getRightParenthesisKeyword_5()); 
            match(input,33,FOLLOW_33_in_rule__StringOr__Group__5__Impl4610); 
             after(grammarAccess.getStringOrAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOr__Group__5__Impl"


    // $ANTLR start "rule__StringOr__Group_4__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2272:1: rule__StringOr__Group_4__0 : rule__StringOr__Group_4__0__Impl rule__StringOr__Group_4__1 ;
    public final void rule__StringOr__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2276:1: ( rule__StringOr__Group_4__0__Impl rule__StringOr__Group_4__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2277:2: rule__StringOr__Group_4__0__Impl rule__StringOr__Group_4__1
            {
            pushFollow(FOLLOW_rule__StringOr__Group_4__0__Impl_in_rule__StringOr__Group_4__04653);
            rule__StringOr__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringOr__Group_4__1_in_rule__StringOr__Group_4__04656);
            rule__StringOr__Group_4__1();

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
    // $ANTLR end "rule__StringOr__Group_4__0"


    // $ANTLR start "rule__StringOr__Group_4__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2284:1: rule__StringOr__Group_4__0__Impl : ( '|' ) ;
    public final void rule__StringOr__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2288:1: ( ( '|' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2289:1: ( '|' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2289:1: ( '|' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2290:1: '|'
            {
             before(grammarAccess.getStringOrAccess().getVerticalLineKeyword_4_0()); 
            match(input,34,FOLLOW_34_in_rule__StringOr__Group_4__0__Impl4684); 
             after(grammarAccess.getStringOrAccess().getVerticalLineKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOr__Group_4__0__Impl"


    // $ANTLR start "rule__StringOr__Group_4__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2303:1: rule__StringOr__Group_4__1 : rule__StringOr__Group_4__1__Impl ;
    public final void rule__StringOr__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2307:1: ( rule__StringOr__Group_4__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2308:2: rule__StringOr__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__StringOr__Group_4__1__Impl_in_rule__StringOr__Group_4__14715);
            rule__StringOr__Group_4__1__Impl();

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
    // $ANTLR end "rule__StringOr__Group_4__1"


    // $ANTLR start "rule__StringOr__Group_4__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2314:1: rule__StringOr__Group_4__1__Impl : ( ( rule__StringOr__OptionAssignment_4_1 ) ) ;
    public final void rule__StringOr__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2318:1: ( ( ( rule__StringOr__OptionAssignment_4_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2319:1: ( ( rule__StringOr__OptionAssignment_4_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2319:1: ( ( rule__StringOr__OptionAssignment_4_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2320:1: ( rule__StringOr__OptionAssignment_4_1 )
            {
             before(grammarAccess.getStringOrAccess().getOptionAssignment_4_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2321:1: ( rule__StringOr__OptionAssignment_4_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2321:2: rule__StringOr__OptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__StringOr__OptionAssignment_4_1_in_rule__StringOr__Group_4__1__Impl4742);
            rule__StringOr__OptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStringOrAccess().getOptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOr__Group_4__1__Impl"


    // $ANTLR start "rule__StringDescriptionInVariable__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2335:1: rule__StringDescriptionInVariable__Group__0 : rule__StringDescriptionInVariable__Group__0__Impl rule__StringDescriptionInVariable__Group__1 ;
    public final void rule__StringDescriptionInVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2339:1: ( rule__StringDescriptionInVariable__Group__0__Impl rule__StringDescriptionInVariable__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2340:2: rule__StringDescriptionInVariable__Group__0__Impl rule__StringDescriptionInVariable__Group__1
            {
            pushFollow(FOLLOW_rule__StringDescriptionInVariable__Group__0__Impl_in_rule__StringDescriptionInVariable__Group__04776);
            rule__StringDescriptionInVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescriptionInVariable__Group__1_in_rule__StringDescriptionInVariable__Group__04779);
            rule__StringDescriptionInVariable__Group__1();

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
    // $ANTLR end "rule__StringDescriptionInVariable__Group__0"


    // $ANTLR start "rule__StringDescriptionInVariable__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2347:1: rule__StringDescriptionInVariable__Group__0__Impl : ( ( rule__StringDescriptionInVariable__NameAssignment_0 ) ) ;
    public final void rule__StringDescriptionInVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2351:1: ( ( ( rule__StringDescriptionInVariable__NameAssignment_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2352:1: ( ( rule__StringDescriptionInVariable__NameAssignment_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2352:1: ( ( rule__StringDescriptionInVariable__NameAssignment_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2353:1: ( rule__StringDescriptionInVariable__NameAssignment_0 )
            {
             before(grammarAccess.getStringDescriptionInVariableAccess().getNameAssignment_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2354:1: ( rule__StringDescriptionInVariable__NameAssignment_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2354:2: rule__StringDescriptionInVariable__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__StringDescriptionInVariable__NameAssignment_0_in_rule__StringDescriptionInVariable__Group__0__Impl4806);
            rule__StringDescriptionInVariable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringDescriptionInVariableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDescriptionInVariable__Group__0__Impl"


    // $ANTLR start "rule__StringDescriptionInVariable__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2364:1: rule__StringDescriptionInVariable__Group__1 : rule__StringDescriptionInVariable__Group__1__Impl rule__StringDescriptionInVariable__Group__2 ;
    public final void rule__StringDescriptionInVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2368:1: ( rule__StringDescriptionInVariable__Group__1__Impl rule__StringDescriptionInVariable__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2369:2: rule__StringDescriptionInVariable__Group__1__Impl rule__StringDescriptionInVariable__Group__2
            {
            pushFollow(FOLLOW_rule__StringDescriptionInVariable__Group__1__Impl_in_rule__StringDescriptionInVariable__Group__14836);
            rule__StringDescriptionInVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescriptionInVariable__Group__2_in_rule__StringDescriptionInVariable__Group__14839);
            rule__StringDescriptionInVariable__Group__2();

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
    // $ANTLR end "rule__StringDescriptionInVariable__Group__1"


    // $ANTLR start "rule__StringDescriptionInVariable__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2376:1: rule__StringDescriptionInVariable__Group__1__Impl : ( ':' ) ;
    public final void rule__StringDescriptionInVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2380:1: ( ( ':' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2381:1: ( ':' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2381:1: ( ':' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2382:1: ':'
            {
             before(grammarAccess.getStringDescriptionInVariableAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__StringDescriptionInVariable__Group__1__Impl4867); 
             after(grammarAccess.getStringDescriptionInVariableAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDescriptionInVariable__Group__1__Impl"


    // $ANTLR start "rule__StringDescriptionInVariable__Group__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2395:1: rule__StringDescriptionInVariable__Group__2 : rule__StringDescriptionInVariable__Group__2__Impl rule__StringDescriptionInVariable__Group__3 ;
    public final void rule__StringDescriptionInVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2399:1: ( rule__StringDescriptionInVariable__Group__2__Impl rule__StringDescriptionInVariable__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2400:2: rule__StringDescriptionInVariable__Group__2__Impl rule__StringDescriptionInVariable__Group__3
            {
            pushFollow(FOLLOW_rule__StringDescriptionInVariable__Group__2__Impl_in_rule__StringDescriptionInVariable__Group__24898);
            rule__StringDescriptionInVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescriptionInVariable__Group__3_in_rule__StringDescriptionInVariable__Group__24901);
            rule__StringDescriptionInVariable__Group__3();

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
    // $ANTLR end "rule__StringDescriptionInVariable__Group__2"


    // $ANTLR start "rule__StringDescriptionInVariable__Group__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2407:1: rule__StringDescriptionInVariable__Group__2__Impl : ( '=' ) ;
    public final void rule__StringDescriptionInVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2411:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2412:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2412:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2413:1: '='
            {
             before(grammarAccess.getStringDescriptionInVariableAccess().getEqualsSignKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__StringDescriptionInVariable__Group__2__Impl4929); 
             after(grammarAccess.getStringDescriptionInVariableAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDescriptionInVariable__Group__2__Impl"


    // $ANTLR start "rule__StringDescriptionInVariable__Group__3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2426:1: rule__StringDescriptionInVariable__Group__3 : rule__StringDescriptionInVariable__Group__3__Impl rule__StringDescriptionInVariable__Group__4 ;
    public final void rule__StringDescriptionInVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2430:1: ( rule__StringDescriptionInVariable__Group__3__Impl rule__StringDescriptionInVariable__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2431:2: rule__StringDescriptionInVariable__Group__3__Impl rule__StringDescriptionInVariable__Group__4
            {
            pushFollow(FOLLOW_rule__StringDescriptionInVariable__Group__3__Impl_in_rule__StringDescriptionInVariable__Group__34960);
            rule__StringDescriptionInVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescriptionInVariable__Group__4_in_rule__StringDescriptionInVariable__Group__34963);
            rule__StringDescriptionInVariable__Group__4();

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
    // $ANTLR end "rule__StringDescriptionInVariable__Group__3"


    // $ANTLR start "rule__StringDescriptionInVariable__Group__3__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2438:1: rule__StringDescriptionInVariable__Group__3__Impl : ( ( rule__StringDescriptionInVariable__DescriptionAssignment_3 )* ) ;
    public final void rule__StringDescriptionInVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2442:1: ( ( ( rule__StringDescriptionInVariable__DescriptionAssignment_3 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2443:1: ( ( rule__StringDescriptionInVariable__DescriptionAssignment_3 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2443:1: ( ( rule__StringDescriptionInVariable__DescriptionAssignment_3 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2444:1: ( rule__StringDescriptionInVariable__DescriptionAssignment_3 )*
            {
             before(grammarAccess.getStringDescriptionInVariableAccess().getDescriptionAssignment_3()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2445:1: ( rule__StringDescriptionInVariable__DescriptionAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||LA16_0==27||LA16_0==29||(LA16_0>=31 && LA16_0<=32)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2445:2: rule__StringDescriptionInVariable__DescriptionAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__StringDescriptionInVariable__DescriptionAssignment_3_in_rule__StringDescriptionInVariable__Group__3__Impl4990);
            	    rule__StringDescriptionInVariable__DescriptionAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getStringDescriptionInVariableAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDescriptionInVariable__Group__3__Impl"


    // $ANTLR start "rule__StringDescriptionInVariable__Group__4"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2455:1: rule__StringDescriptionInVariable__Group__4 : rule__StringDescriptionInVariable__Group__4__Impl ;
    public final void rule__StringDescriptionInVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2459:1: ( rule__StringDescriptionInVariable__Group__4__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2460:2: rule__StringDescriptionInVariable__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StringDescriptionInVariable__Group__4__Impl_in_rule__StringDescriptionInVariable__Group__45021);
            rule__StringDescriptionInVariable__Group__4__Impl();

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
    // $ANTLR end "rule__StringDescriptionInVariable__Group__4"


    // $ANTLR start "rule__StringDescriptionInVariable__Group__4__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2466:1: rule__StringDescriptionInVariable__Group__4__Impl : ( ';' ) ;
    public final void rule__StringDescriptionInVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2470:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2471:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2471:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2472:1: ';'
            {
             before(grammarAccess.getStringDescriptionInVariableAccess().getSemicolonKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__StringDescriptionInVariable__Group__4__Impl5049); 
             after(grammarAccess.getStringDescriptionInVariableAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDescriptionInVariable__Group__4__Impl"


    // $ANTLR start "rule__StringComplex__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2495:1: rule__StringComplex__Group__0 : rule__StringComplex__Group__0__Impl rule__StringComplex__Group__1 ;
    public final void rule__StringComplex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2499:1: ( rule__StringComplex__Group__0__Impl rule__StringComplex__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2500:2: rule__StringComplex__Group__0__Impl rule__StringComplex__Group__1
            {
            pushFollow(FOLLOW_rule__StringComplex__Group__0__Impl_in_rule__StringComplex__Group__05090);
            rule__StringComplex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringComplex__Group__1_in_rule__StringComplex__Group__05093);
            rule__StringComplex__Group__1();

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
    // $ANTLR end "rule__StringComplex__Group__0"


    // $ANTLR start "rule__StringComplex__Group__0__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2507:1: rule__StringComplex__Group__0__Impl : ( '(' ) ;
    public final void rule__StringComplex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2511:1: ( ( '(' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2512:1: ( '(' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2512:1: ( '(' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2513:1: '('
            {
             before(grammarAccess.getStringComplexAccess().getLeftParenthesisKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__StringComplex__Group__0__Impl5121); 
             after(grammarAccess.getStringComplexAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringComplex__Group__0__Impl"


    // $ANTLR start "rule__StringComplex__Group__1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2526:1: rule__StringComplex__Group__1 : rule__StringComplex__Group__1__Impl rule__StringComplex__Group__2 ;
    public final void rule__StringComplex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2530:1: ( rule__StringComplex__Group__1__Impl rule__StringComplex__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2531:2: rule__StringComplex__Group__1__Impl rule__StringComplex__Group__2
            {
            pushFollow(FOLLOW_rule__StringComplex__Group__1__Impl_in_rule__StringComplex__Group__15152);
            rule__StringComplex__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringComplex__Group__2_in_rule__StringComplex__Group__15155);
            rule__StringComplex__Group__2();

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
    // $ANTLR end "rule__StringComplex__Group__1"


    // $ANTLR start "rule__StringComplex__Group__1__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2538:1: rule__StringComplex__Group__1__Impl : ( ( rule__StringComplex__DescriptionAssignment_1 )* ) ;
    public final void rule__StringComplex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2542:1: ( ( ( rule__StringComplex__DescriptionAssignment_1 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2543:1: ( ( rule__StringComplex__DescriptionAssignment_1 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2543:1: ( ( rule__StringComplex__DescriptionAssignment_1 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2544:1: ( rule__StringComplex__DescriptionAssignment_1 )*
            {
             before(grammarAccess.getStringComplexAccess().getDescriptionAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2545:1: ( rule__StringComplex__DescriptionAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)||LA17_0==27||LA17_0==29||(LA17_0>=31 && LA17_0<=32)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2545:2: rule__StringComplex__DescriptionAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__StringComplex__DescriptionAssignment_1_in_rule__StringComplex__Group__1__Impl5182);
            	    rule__StringComplex__DescriptionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getStringComplexAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringComplex__Group__1__Impl"


    // $ANTLR start "rule__StringComplex__Group__2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2555:1: rule__StringComplex__Group__2 : rule__StringComplex__Group__2__Impl rule__StringComplex__Group__3 ;
    public final void rule__StringComplex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2559:1: ( rule__StringComplex__Group__2__Impl rule__StringComplex__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2560:2: rule__StringComplex__Group__2__Impl rule__StringComplex__Group__3
            {
            pushFollow(FOLLOW_rule__StringComplex__Group__2__Impl_in_rule__StringComplex__Group__25213);
            rule__StringComplex__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringComplex__Group__3_in_rule__StringComplex__Group__25216);
            rule__StringComplex__Group__3();

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
    // $ANTLR end "rule__StringComplex__Group__2"


    // $ANTLR start "rule__StringComplex__Group__2__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2567:1: rule__StringComplex__Group__2__Impl : ( ')' ) ;
    public final void rule__StringComplex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2571:1: ( ( ')' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2572:1: ( ')' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2572:1: ( ')' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2573:1: ')'
            {
             before(grammarAccess.getStringComplexAccess().getRightParenthesisKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__StringComplex__Group__2__Impl5244); 
             after(grammarAccess.getStringComplexAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringComplex__Group__2__Impl"


    // $ANTLR start "rule__StringComplex__Group__3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2586:1: rule__StringComplex__Group__3 : rule__StringComplex__Group__3__Impl ;
    public final void rule__StringComplex__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2590:1: ( rule__StringComplex__Group__3__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2591:2: rule__StringComplex__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StringComplex__Group__3__Impl_in_rule__StringComplex__Group__35275);
            rule__StringComplex__Group__3__Impl();

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
    // $ANTLR end "rule__StringComplex__Group__3"


    // $ANTLR start "rule__StringComplex__Group__3__Impl"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2597:1: rule__StringComplex__Group__3__Impl : ( ( rule__StringComplex__Alternatives_3 ) ) ;
    public final void rule__StringComplex__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2601:1: ( ( ( rule__StringComplex__Alternatives_3 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2602:1: ( ( rule__StringComplex__Alternatives_3 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2602:1: ( ( rule__StringComplex__Alternatives_3 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2603:1: ( rule__StringComplex__Alternatives_3 )
            {
             before(grammarAccess.getStringComplexAccess().getAlternatives_3()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2604:1: ( rule__StringComplex__Alternatives_3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2604:2: rule__StringComplex__Alternatives_3
            {
            pushFollow(FOLLOW_rule__StringComplex__Alternatives_3_in_rule__StringComplex__Group__3__Impl5302);
            rule__StringComplex__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getStringComplexAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringComplex__Group__3__Impl"


    // $ANTLR start "rule__ObjectDescription__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2622:1: rule__ObjectDescription__Group__0 : rule__ObjectDescription__Group__0__Impl rule__ObjectDescription__Group__1 ;
    public final void rule__ObjectDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2626:1: ( rule__ObjectDescription__Group__0__Impl rule__ObjectDescription__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2627:2: rule__ObjectDescription__Group__0__Impl rule__ObjectDescription__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__0__Impl_in_rule__ObjectDescription__Group__05340);
            rule__ObjectDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__1_in_rule__ObjectDescription__Group__05343);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2634:1: rule__ObjectDescription__Group__0__Impl : ( 'Node' ) ;
    public final void rule__ObjectDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2638:1: ( ( 'Node' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2639:1: ( 'Node' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2639:1: ( 'Node' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2640:1: 'Node'
            {
             before(grammarAccess.getObjectDescriptionAccess().getNodeKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__ObjectDescription__Group__0__Impl5371); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2653:1: rule__ObjectDescription__Group__1 : rule__ObjectDescription__Group__1__Impl rule__ObjectDescription__Group__2 ;
    public final void rule__ObjectDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2657:1: ( rule__ObjectDescription__Group__1__Impl rule__ObjectDescription__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2658:2: rule__ObjectDescription__Group__1__Impl rule__ObjectDescription__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__1__Impl_in_rule__ObjectDescription__Group__15402);
            rule__ObjectDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__2_in_rule__ObjectDescription__Group__15405);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2665:1: rule__ObjectDescription__Group__1__Impl : ( ( rule__ObjectDescription__NameAssignment_1 ) ) ;
    public final void rule__ObjectDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2669:1: ( ( ( rule__ObjectDescription__NameAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2670:1: ( ( rule__ObjectDescription__NameAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2670:1: ( ( rule__ObjectDescription__NameAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2671:1: ( rule__ObjectDescription__NameAssignment_1 )
            {
             before(grammarAccess.getObjectDescriptionAccess().getNameAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2672:1: ( rule__ObjectDescription__NameAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2672:2: rule__ObjectDescription__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectDescription__NameAssignment_1_in_rule__ObjectDescription__Group__1__Impl5432);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2682:1: rule__ObjectDescription__Group__2 : rule__ObjectDescription__Group__2__Impl rule__ObjectDescription__Group__3 ;
    public final void rule__ObjectDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2686:1: ( rule__ObjectDescription__Group__2__Impl rule__ObjectDescription__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2687:2: rule__ObjectDescription__Group__2__Impl rule__ObjectDescription__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__2__Impl_in_rule__ObjectDescription__Group__25462);
            rule__ObjectDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__3_in_rule__ObjectDescription__Group__25465);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2694:1: rule__ObjectDescription__Group__2__Impl : ( ':' ) ;
    public final void rule__ObjectDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2698:1: ( ( ':' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2699:1: ( ':' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2699:1: ( ':' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2700:1: ':'
            {
             before(grammarAccess.getObjectDescriptionAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__ObjectDescription__Group__2__Impl5493); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2713:1: rule__ObjectDescription__Group__3 : rule__ObjectDescription__Group__3__Impl rule__ObjectDescription__Group__4 ;
    public final void rule__ObjectDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2717:1: ( rule__ObjectDescription__Group__3__Impl rule__ObjectDescription__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2718:2: rule__ObjectDescription__Group__3__Impl rule__ObjectDescription__Group__4
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__3__Impl_in_rule__ObjectDescription__Group__35524);
            rule__ObjectDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__4_in_rule__ObjectDescription__Group__35527);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2725:1: rule__ObjectDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__ObjectDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2729:1: ( ( '{' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2730:1: ( '{' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2730:1: ( '{' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2731:1: '{'
            {
             before(grammarAccess.getObjectDescriptionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__ObjectDescription__Group__3__Impl5555); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2744:1: rule__ObjectDescription__Group__4 : rule__ObjectDescription__Group__4__Impl rule__ObjectDescription__Group__5 ;
    public final void rule__ObjectDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2748:1: ( rule__ObjectDescription__Group__4__Impl rule__ObjectDescription__Group__5 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2749:2: rule__ObjectDescription__Group__4__Impl rule__ObjectDescription__Group__5
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__4__Impl_in_rule__ObjectDescription__Group__45586);
            rule__ObjectDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__5_in_rule__ObjectDescription__Group__45589);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2756:1: rule__ObjectDescription__Group__4__Impl : ( ( rule__ObjectDescription__DescriptionAssignment_4 )* ) ;
    public final void rule__ObjectDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2760:1: ( ( ( rule__ObjectDescription__DescriptionAssignment_4 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2761:1: ( ( rule__ObjectDescription__DescriptionAssignment_4 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2761:1: ( ( rule__ObjectDescription__DescriptionAssignment_4 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2762:1: ( rule__ObjectDescription__DescriptionAssignment_4 )*
            {
             before(grammarAccess.getObjectDescriptionAccess().getDescriptionAssignment_4()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2763:1: ( rule__ObjectDescription__DescriptionAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==32||LA18_0==36||(LA18_0>=38 && LA18_0<=39)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2763:2: rule__ObjectDescription__DescriptionAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ObjectDescription__DescriptionAssignment_4_in_rule__ObjectDescription__Group__4__Impl5616);
            	    rule__ObjectDescription__DescriptionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2773:1: rule__ObjectDescription__Group__5 : rule__ObjectDescription__Group__5__Impl ;
    public final void rule__ObjectDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2777:1: ( rule__ObjectDescription__Group__5__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2778:2: rule__ObjectDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__5__Impl_in_rule__ObjectDescription__Group__55647);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2784:1: rule__ObjectDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__ObjectDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2788:1: ( ( '}' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2789:1: ( '}' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2789:1: ( '}' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2790:1: '}'
            {
             before(grammarAccess.getObjectDescriptionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__ObjectDescription__Group__5__Impl5675); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2815:1: rule__ObjectDescriptionInner__Group__0 : rule__ObjectDescriptionInner__Group__0__Impl rule__ObjectDescriptionInner__Group__1 ;
    public final void rule__ObjectDescriptionInner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2819:1: ( rule__ObjectDescriptionInner__Group__0__Impl rule__ObjectDescriptionInner__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2820:2: rule__ObjectDescriptionInner__Group__0__Impl rule__ObjectDescriptionInner__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Group__0__Impl_in_rule__ObjectDescriptionInner__Group__05718);
            rule__ObjectDescriptionInner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Group__1_in_rule__ObjectDescriptionInner__Group__05721);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2827:1: rule__ObjectDescriptionInner__Group__0__Impl : ( ( rule__ObjectDescriptionInner__Alternatives_0 ) ) ;
    public final void rule__ObjectDescriptionInner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2831:1: ( ( ( rule__ObjectDescriptionInner__Alternatives_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2832:1: ( ( rule__ObjectDescriptionInner__Alternatives_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2832:1: ( ( rule__ObjectDescriptionInner__Alternatives_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2833:1: ( rule__ObjectDescriptionInner__Alternatives_0 )
            {
             before(grammarAccess.getObjectDescriptionInnerAccess().getAlternatives_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2834:1: ( rule__ObjectDescriptionInner__Alternatives_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2834:2: rule__ObjectDescriptionInner__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Alternatives_0_in_rule__ObjectDescriptionInner__Group__0__Impl5748);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2844:1: rule__ObjectDescriptionInner__Group__1 : rule__ObjectDescriptionInner__Group__1__Impl ;
    public final void rule__ObjectDescriptionInner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2848:1: ( rule__ObjectDescriptionInner__Group__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2849:2: rule__ObjectDescriptionInner__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Group__1__Impl_in_rule__ObjectDescriptionInner__Group__15778);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2855:1: rule__ObjectDescriptionInner__Group__1__Impl : ( ';' ) ;
    public final void rule__ObjectDescriptionInner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2859:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2860:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2860:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2861:1: ';'
            {
             before(grammarAccess.getObjectDescriptionInnerAccess().getSemicolonKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ObjectDescriptionInner__Group__1__Impl5806); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2878:1: rule__ObjectAttribute__Group__0 : rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 ;
    public final void rule__ObjectAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2882:1: ( rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2883:2: rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__0__Impl_in_rule__ObjectAttribute__Group__05841);
            rule__ObjectAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectAttribute__Group__1_in_rule__ObjectAttribute__Group__05844);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2890:1: rule__ObjectAttribute__Group__0__Impl : ( 'hasAttribute' ) ;
    public final void rule__ObjectAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2894:1: ( ( 'hasAttribute' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2895:1: ( 'hasAttribute' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2895:1: ( 'hasAttribute' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2896:1: 'hasAttribute'
            {
             before(grammarAccess.getObjectAttributeAccess().getHasAttributeKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__ObjectAttribute__Group__0__Impl5872); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2909:1: rule__ObjectAttribute__Group__1 : rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 ;
    public final void rule__ObjectAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2913:1: ( rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2914:2: rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__1__Impl_in_rule__ObjectAttribute__Group__15903);
            rule__ObjectAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectAttribute__Group__2_in_rule__ObjectAttribute__Group__15906);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2921:1: rule__ObjectAttribute__Group__1__Impl : ( ( rule__ObjectAttribute__AttributesAssignment_1 ) ) ;
    public final void rule__ObjectAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2925:1: ( ( ( rule__ObjectAttribute__AttributesAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2926:1: ( ( rule__ObjectAttribute__AttributesAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2926:1: ( ( rule__ObjectAttribute__AttributesAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2927:1: ( rule__ObjectAttribute__AttributesAssignment_1 )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributesAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2928:1: ( rule__ObjectAttribute__AttributesAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2928:2: rule__ObjectAttribute__AttributesAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__AttributesAssignment_1_in_rule__ObjectAttribute__Group__1__Impl5933);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2938:1: rule__ObjectAttribute__Group__2 : rule__ObjectAttribute__Group__2__Impl ;
    public final void rule__ObjectAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2942:1: ( rule__ObjectAttribute__Group__2__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2943:2: rule__ObjectAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__2__Impl_in_rule__ObjectAttribute__Group__25963);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2949:1: rule__ObjectAttribute__Group__2__Impl : ( ( rule__ObjectAttribute__Group_2__0 )? ) ;
    public final void rule__ObjectAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2953:1: ( ( ( rule__ObjectAttribute__Group_2__0 )? ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2954:1: ( ( rule__ObjectAttribute__Group_2__0 )? )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2954:1: ( ( rule__ObjectAttribute__Group_2__0 )? )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2955:1: ( rule__ObjectAttribute__Group_2__0 )?
            {
             before(grammarAccess.getObjectAttributeAccess().getGroup_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2956:1: ( rule__ObjectAttribute__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2956:2: rule__ObjectAttribute__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ObjectAttribute__Group_2__0_in_rule__ObjectAttribute__Group__2__Impl5990);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2972:1: rule__ObjectAttribute__Group_2__0 : rule__ObjectAttribute__Group_2__0__Impl rule__ObjectAttribute__Group_2__1 ;
    public final void rule__ObjectAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2976:1: ( rule__ObjectAttribute__Group_2__0__Impl rule__ObjectAttribute__Group_2__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2977:2: rule__ObjectAttribute__Group_2__0__Impl rule__ObjectAttribute__Group_2__1
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group_2__0__Impl_in_rule__ObjectAttribute__Group_2__06027);
            rule__ObjectAttribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectAttribute__Group_2__1_in_rule__ObjectAttribute__Group_2__06030);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2984:1: rule__ObjectAttribute__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__ObjectAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2988:1: ( ( 'as' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2989:1: ( 'as' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2989:1: ( 'as' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2990:1: 'as'
            {
             before(grammarAccess.getObjectAttributeAccess().getAsKeyword_2_0()); 
            match(input,37,FOLLOW_37_in_rule__ObjectAttribute__Group_2__0__Impl6058); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3003:1: rule__ObjectAttribute__Group_2__1 : rule__ObjectAttribute__Group_2__1__Impl ;
    public final void rule__ObjectAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3007:1: ( rule__ObjectAttribute__Group_2__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3008:2: rule__ObjectAttribute__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group_2__1__Impl_in_rule__ObjectAttribute__Group_2__16089);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3014:1: rule__ObjectAttribute__Group_2__1__Impl : ( ( rule__ObjectAttribute__StringMethodeAssignment_2_1 ) ) ;
    public final void rule__ObjectAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3018:1: ( ( ( rule__ObjectAttribute__StringMethodeAssignment_2_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3019:1: ( ( rule__ObjectAttribute__StringMethodeAssignment_2_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3019:1: ( ( rule__ObjectAttribute__StringMethodeAssignment_2_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3020:1: ( rule__ObjectAttribute__StringMethodeAssignment_2_1 )
            {
             before(grammarAccess.getObjectAttributeAccess().getStringMethodeAssignment_2_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3021:1: ( rule__ObjectAttribute__StringMethodeAssignment_2_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3021:2: rule__ObjectAttribute__StringMethodeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__StringMethodeAssignment_2_1_in_rule__ObjectAttribute__Group_2__1__Impl6116);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3035:1: rule__ObjectNode__Group__0 : rule__ObjectNode__Group__0__Impl rule__ObjectNode__Group__1 ;
    public final void rule__ObjectNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3039:1: ( rule__ObjectNode__Group__0__Impl rule__ObjectNode__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3040:2: rule__ObjectNode__Group__0__Impl rule__ObjectNode__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__0__Impl_in_rule__ObjectNode__Group__06150);
            rule__ObjectNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNode__Group__1_in_rule__ObjectNode__Group__06153);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3047:1: rule__ObjectNode__Group__0__Impl : ( 'hasNode' ) ;
    public final void rule__ObjectNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3051:1: ( ( 'hasNode' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3052:1: ( 'hasNode' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3052:1: ( 'hasNode' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3053:1: 'hasNode'
            {
             before(grammarAccess.getObjectNodeAccess().getHasNodeKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__ObjectNode__Group__0__Impl6181); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3066:1: rule__ObjectNode__Group__1 : rule__ObjectNode__Group__1__Impl rule__ObjectNode__Group__2 ;
    public final void rule__ObjectNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3070:1: ( rule__ObjectNode__Group__1__Impl rule__ObjectNode__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3071:2: rule__ObjectNode__Group__1__Impl rule__ObjectNode__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__1__Impl_in_rule__ObjectNode__Group__16212);
            rule__ObjectNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNode__Group__2_in_rule__ObjectNode__Group__16215);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3078:1: rule__ObjectNode__Group__1__Impl : ( ( rule__ObjectNode__AttributesAssignment_1 ) ) ;
    public final void rule__ObjectNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3082:1: ( ( ( rule__ObjectNode__AttributesAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3083:1: ( ( rule__ObjectNode__AttributesAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3083:1: ( ( rule__ObjectNode__AttributesAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3084:1: ( rule__ObjectNode__AttributesAssignment_1 )
            {
             before(grammarAccess.getObjectNodeAccess().getAttributesAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3085:1: ( rule__ObjectNode__AttributesAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3085:2: rule__ObjectNode__AttributesAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectNode__AttributesAssignment_1_in_rule__ObjectNode__Group__1__Impl6242);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3095:1: rule__ObjectNode__Group__2 : rule__ObjectNode__Group__2__Impl rule__ObjectNode__Group__3 ;
    public final void rule__ObjectNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3099:1: ( rule__ObjectNode__Group__2__Impl rule__ObjectNode__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3100:2: rule__ObjectNode__Group__2__Impl rule__ObjectNode__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__2__Impl_in_rule__ObjectNode__Group__26272);
            rule__ObjectNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNode__Group__3_in_rule__ObjectNode__Group__26275);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3107:1: rule__ObjectNode__Group__2__Impl : ( 'as' ) ;
    public final void rule__ObjectNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3111:1: ( ( 'as' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3112:1: ( 'as' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3112:1: ( 'as' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3113:1: 'as'
            {
             before(grammarAccess.getObjectNodeAccess().getAsKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__ObjectNode__Group__2__Impl6303); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3126:1: rule__ObjectNode__Group__3 : rule__ObjectNode__Group__3__Impl ;
    public final void rule__ObjectNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3130:1: ( rule__ObjectNode__Group__3__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3131:2: rule__ObjectNode__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__3__Impl_in_rule__ObjectNode__Group__36334);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3137:1: rule__ObjectNode__Group__3__Impl : ( ( rule__ObjectNode__InnerAssignment_3 ) ) ;
    public final void rule__ObjectNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3141:1: ( ( ( rule__ObjectNode__InnerAssignment_3 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3142:1: ( ( rule__ObjectNode__InnerAssignment_3 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3142:1: ( ( rule__ObjectNode__InnerAssignment_3 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3143:1: ( rule__ObjectNode__InnerAssignment_3 )
            {
             before(grammarAccess.getObjectNodeAccess().getInnerAssignment_3()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3144:1: ( rule__ObjectNode__InnerAssignment_3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3144:2: rule__ObjectNode__InnerAssignment_3
            {
            pushFollow(FOLLOW_rule__ObjectNode__InnerAssignment_3_in_rule__ObjectNode__Group__3__Impl6361);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3162:1: rule__ObjectNext__Group__0 : rule__ObjectNext__Group__0__Impl rule__ObjectNext__Group__1 ;
    public final void rule__ObjectNext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3166:1: ( rule__ObjectNext__Group__0__Impl rule__ObjectNext__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3167:2: rule__ObjectNext__Group__0__Impl rule__ObjectNext__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__0__Impl_in_rule__ObjectNext__Group__06399);
            rule__ObjectNext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNext__Group__1_in_rule__ObjectNext__Group__06402);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3174:1: rule__ObjectNext__Group__0__Impl : ( 'hasNext' ) ;
    public final void rule__ObjectNext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3178:1: ( ( 'hasNext' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3179:1: ( 'hasNext' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3179:1: ( 'hasNext' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3180:1: 'hasNext'
            {
             before(grammarAccess.getObjectNextAccess().getHasNextKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__ObjectNext__Group__0__Impl6430); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3193:1: rule__ObjectNext__Group__1 : rule__ObjectNext__Group__1__Impl rule__ObjectNext__Group__2 ;
    public final void rule__ObjectNext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3197:1: ( rule__ObjectNext__Group__1__Impl rule__ObjectNext__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3198:2: rule__ObjectNext__Group__1__Impl rule__ObjectNext__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__1__Impl_in_rule__ObjectNext__Group__16461);
            rule__ObjectNext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNext__Group__2_in_rule__ObjectNext__Group__16464);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3205:1: rule__ObjectNext__Group__1__Impl : ( ( rule__ObjectNext__AttributeAssignment_1 ) ) ;
    public final void rule__ObjectNext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3209:1: ( ( ( rule__ObjectNext__AttributeAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3210:1: ( ( rule__ObjectNext__AttributeAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3210:1: ( ( rule__ObjectNext__AttributeAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3211:1: ( rule__ObjectNext__AttributeAssignment_1 )
            {
             before(grammarAccess.getObjectNextAccess().getAttributeAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3212:1: ( rule__ObjectNext__AttributeAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3212:2: rule__ObjectNext__AttributeAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectNext__AttributeAssignment_1_in_rule__ObjectNext__Group__1__Impl6491);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3222:1: rule__ObjectNext__Group__2 : rule__ObjectNext__Group__2__Impl rule__ObjectNext__Group__3 ;
    public final void rule__ObjectNext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3226:1: ( rule__ObjectNext__Group__2__Impl rule__ObjectNext__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3227:2: rule__ObjectNext__Group__2__Impl rule__ObjectNext__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__2__Impl_in_rule__ObjectNext__Group__26521);
            rule__ObjectNext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNext__Group__3_in_rule__ObjectNext__Group__26524);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3234:1: rule__ObjectNext__Group__2__Impl : ( 'as' ) ;
    public final void rule__ObjectNext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3238:1: ( ( 'as' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3239:1: ( 'as' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3239:1: ( 'as' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3240:1: 'as'
            {
             before(grammarAccess.getObjectNextAccess().getAsKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__ObjectNext__Group__2__Impl6552); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3253:1: rule__ObjectNext__Group__3 : rule__ObjectNext__Group__3__Impl ;
    public final void rule__ObjectNext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3257:1: ( rule__ObjectNext__Group__3__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3258:2: rule__ObjectNext__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__3__Impl_in_rule__ObjectNext__Group__36583);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3264:1: rule__ObjectNext__Group__3__Impl : ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) ) ;
    public final void rule__ObjectNext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3268:1: ( ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3269:1: ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3269:1: ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3270:1: ( rule__ObjectNext__ObjectDesriptionAssignment_3 )
            {
             before(grammarAccess.getObjectNextAccess().getObjectDesriptionAssignment_3()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3271:1: ( rule__ObjectNext__ObjectDesriptionAssignment_3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3271:2: rule__ObjectNext__ObjectDesriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__ObjectNext__ObjectDesriptionAssignment_3_in_rule__ObjectNext__Group__3__Impl6610);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3289:1: rule__JavaCodeOrID__Group_0__0 : rule__JavaCodeOrID__Group_0__0__Impl rule__JavaCodeOrID__Group_0__1 ;
    public final void rule__JavaCodeOrID__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3293:1: ( rule__JavaCodeOrID__Group_0__0__Impl rule__JavaCodeOrID__Group_0__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3294:2: rule__JavaCodeOrID__Group_0__0__Impl rule__JavaCodeOrID__Group_0__1
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__0__Impl_in_rule__JavaCodeOrID__Group_0__06648);
            rule__JavaCodeOrID__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__1_in_rule__JavaCodeOrID__Group_0__06651);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3301:1: rule__JavaCodeOrID__Group_0__0__Impl : ( 'java' ) ;
    public final void rule__JavaCodeOrID__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3305:1: ( ( 'java' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3306:1: ( 'java' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3306:1: ( 'java' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3307:1: 'java'
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getJavaKeyword_0_0()); 
            match(input,40,FOLLOW_40_in_rule__JavaCodeOrID__Group_0__0__Impl6679); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3320:1: rule__JavaCodeOrID__Group_0__1 : rule__JavaCodeOrID__Group_0__1__Impl rule__JavaCodeOrID__Group_0__2 ;
    public final void rule__JavaCodeOrID__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3324:1: ( rule__JavaCodeOrID__Group_0__1__Impl rule__JavaCodeOrID__Group_0__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3325:2: rule__JavaCodeOrID__Group_0__1__Impl rule__JavaCodeOrID__Group_0__2
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__1__Impl_in_rule__JavaCodeOrID__Group_0__16710);
            rule__JavaCodeOrID__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__2_in_rule__JavaCodeOrID__Group_0__16713);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3332:1: rule__JavaCodeOrID__Group_0__1__Impl : ( ':' ) ;
    public final void rule__JavaCodeOrID__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3336:1: ( ( ':' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3337:1: ( ':' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3337:1: ( ':' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3338:1: ':'
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getColonKeyword_0_1()); 
            match(input,24,FOLLOW_24_in_rule__JavaCodeOrID__Group_0__1__Impl6741); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3351:1: rule__JavaCodeOrID__Group_0__2 : rule__JavaCodeOrID__Group_0__2__Impl ;
    public final void rule__JavaCodeOrID__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3355:1: ( rule__JavaCodeOrID__Group_0__2__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3356:2: rule__JavaCodeOrID__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__2__Impl_in_rule__JavaCodeOrID__Group_0__26772);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3362:1: rule__JavaCodeOrID__Group_0__2__Impl : ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) ) ;
    public final void rule__JavaCodeOrID__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3366:1: ( ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3367:1: ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3367:1: ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3368:1: ( rule__JavaCodeOrID__CodeAssignment_0_2 )
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getCodeAssignment_0_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3369:1: ( rule__JavaCodeOrID__CodeAssignment_0_2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3369:2: rule__JavaCodeOrID__CodeAssignment_0_2
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__CodeAssignment_0_2_in_rule__JavaCodeOrID__Group_0__2__Impl6799);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3385:1: rule__ObjectMany__Group__0 : rule__ObjectMany__Group__0__Impl rule__ObjectMany__Group__1 ;
    public final void rule__ObjectMany__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3389:1: ( rule__ObjectMany__Group__0__Impl rule__ObjectMany__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3390:2: rule__ObjectMany__Group__0__Impl rule__ObjectMany__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectMany__Group__0__Impl_in_rule__ObjectMany__Group__06835);
            rule__ObjectMany__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectMany__Group__1_in_rule__ObjectMany__Group__06838);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3397:1: rule__ObjectMany__Group__0__Impl : ( ( rule__ObjectMany__OptionAssignment_0 ) ) ;
    public final void rule__ObjectMany__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3401:1: ( ( ( rule__ObjectMany__OptionAssignment_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3402:1: ( ( rule__ObjectMany__OptionAssignment_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3402:1: ( ( rule__ObjectMany__OptionAssignment_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3403:1: ( rule__ObjectMany__OptionAssignment_0 )
            {
             before(grammarAccess.getObjectManyAccess().getOptionAssignment_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3404:1: ( rule__ObjectMany__OptionAssignment_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3404:2: rule__ObjectMany__OptionAssignment_0
            {
            pushFollow(FOLLOW_rule__ObjectMany__OptionAssignment_0_in_rule__ObjectMany__Group__0__Impl6865);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3414:1: rule__ObjectMany__Group__1 : rule__ObjectMany__Group__1__Impl ;
    public final void rule__ObjectMany__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3418:1: ( rule__ObjectMany__Group__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3419:2: rule__ObjectMany__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectMany__Group__1__Impl_in_rule__ObjectMany__Group__16895);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3425:1: rule__ObjectMany__Group__1__Impl : ( '*' ) ;
    public final void rule__ObjectMany__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3429:1: ( ( '*' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3430:1: ( '*' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3430:1: ( '*' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3431:1: '*'
            {
             before(grammarAccess.getObjectManyAccess().getAsteriskKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__ObjectMany__Group__1__Impl6923); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3448:1: rule__ObjectChoice__Group__0 : rule__ObjectChoice__Group__0__Impl rule__ObjectChoice__Group__1 ;
    public final void rule__ObjectChoice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3452:1: ( rule__ObjectChoice__Group__0__Impl rule__ObjectChoice__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3453:2: rule__ObjectChoice__Group__0__Impl rule__ObjectChoice__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__0__Impl_in_rule__ObjectChoice__Group__06958);
            rule__ObjectChoice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectChoice__Group__1_in_rule__ObjectChoice__Group__06961);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3460:1: rule__ObjectChoice__Group__0__Impl : ( '(' ) ;
    public final void rule__ObjectChoice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3464:1: ( ( '(' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3465:1: ( '(' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3465:1: ( '(' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3466:1: '('
            {
             before(grammarAccess.getObjectChoiceAccess().getLeftParenthesisKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ObjectChoice__Group__0__Impl6989); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3479:1: rule__ObjectChoice__Group__1 : rule__ObjectChoice__Group__1__Impl rule__ObjectChoice__Group__2 ;
    public final void rule__ObjectChoice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3483:1: ( rule__ObjectChoice__Group__1__Impl rule__ObjectChoice__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3484:2: rule__ObjectChoice__Group__1__Impl rule__ObjectChoice__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__1__Impl_in_rule__ObjectChoice__Group__17020);
            rule__ObjectChoice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectChoice__Group__2_in_rule__ObjectChoice__Group__17023);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3491:1: rule__ObjectChoice__Group__1__Impl : ( ( rule__ObjectChoice__OptionsAssignment_1 ) ) ;
    public final void rule__ObjectChoice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3495:1: ( ( ( rule__ObjectChoice__OptionsAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3496:1: ( ( rule__ObjectChoice__OptionsAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3496:1: ( ( rule__ObjectChoice__OptionsAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3497:1: ( rule__ObjectChoice__OptionsAssignment_1 )
            {
             before(grammarAccess.getObjectChoiceAccess().getOptionsAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3498:1: ( rule__ObjectChoice__OptionsAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3498:2: rule__ObjectChoice__OptionsAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectChoice__OptionsAssignment_1_in_rule__ObjectChoice__Group__1__Impl7050);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3508:1: rule__ObjectChoice__Group__2 : rule__ObjectChoice__Group__2__Impl rule__ObjectChoice__Group__3 ;
    public final void rule__ObjectChoice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3512:1: ( rule__ObjectChoice__Group__2__Impl rule__ObjectChoice__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3513:2: rule__ObjectChoice__Group__2__Impl rule__ObjectChoice__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__2__Impl_in_rule__ObjectChoice__Group__27080);
            rule__ObjectChoice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectChoice__Group__3_in_rule__ObjectChoice__Group__27083);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3520:1: rule__ObjectChoice__Group__2__Impl : ( ( rule__ObjectChoice__Group_2__0 )* ) ;
    public final void rule__ObjectChoice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3524:1: ( ( ( rule__ObjectChoice__Group_2__0 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3525:1: ( ( rule__ObjectChoice__Group_2__0 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3525:1: ( ( rule__ObjectChoice__Group_2__0 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3526:1: ( rule__ObjectChoice__Group_2__0 )*
            {
             before(grammarAccess.getObjectChoiceAccess().getGroup_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3527:1: ( rule__ObjectChoice__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3527:2: rule__ObjectChoice__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ObjectChoice__Group_2__0_in_rule__ObjectChoice__Group__2__Impl7110);
            	    rule__ObjectChoice__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3537:1: rule__ObjectChoice__Group__3 : rule__ObjectChoice__Group__3__Impl ;
    public final void rule__ObjectChoice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3541:1: ( rule__ObjectChoice__Group__3__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3542:2: rule__ObjectChoice__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__3__Impl_in_rule__ObjectChoice__Group__37141);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3548:1: rule__ObjectChoice__Group__3__Impl : ( ')' ) ;
    public final void rule__ObjectChoice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3552:1: ( ( ')' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3553:1: ( ')' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3553:1: ( ')' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3554:1: ')'
            {
             before(grammarAccess.getObjectChoiceAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__ObjectChoice__Group__3__Impl7169); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3575:1: rule__ObjectChoice__Group_2__0 : rule__ObjectChoice__Group_2__0__Impl rule__ObjectChoice__Group_2__1 ;
    public final void rule__ObjectChoice__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3579:1: ( rule__ObjectChoice__Group_2__0__Impl rule__ObjectChoice__Group_2__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3580:2: rule__ObjectChoice__Group_2__0__Impl rule__ObjectChoice__Group_2__1
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group_2__0__Impl_in_rule__ObjectChoice__Group_2__07208);
            rule__ObjectChoice__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectChoice__Group_2__1_in_rule__ObjectChoice__Group_2__07211);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3587:1: rule__ObjectChoice__Group_2__0__Impl : ( '|' ) ;
    public final void rule__ObjectChoice__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3591:1: ( ( '|' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3592:1: ( '|' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3592:1: ( '|' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3593:1: '|'
            {
             before(grammarAccess.getObjectChoiceAccess().getVerticalLineKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__ObjectChoice__Group_2__0__Impl7239); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3606:1: rule__ObjectChoice__Group_2__1 : rule__ObjectChoice__Group_2__1__Impl ;
    public final void rule__ObjectChoice__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3610:1: ( rule__ObjectChoice__Group_2__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3611:2: rule__ObjectChoice__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group_2__1__Impl_in_rule__ObjectChoice__Group_2__17270);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3617:1: rule__ObjectChoice__Group_2__1__Impl : ( ( rule__ObjectChoice__OptionsAssignment_2_1 ) ) ;
    public final void rule__ObjectChoice__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3621:1: ( ( ( rule__ObjectChoice__OptionsAssignment_2_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3622:1: ( ( rule__ObjectChoice__OptionsAssignment_2_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3622:1: ( ( rule__ObjectChoice__OptionsAssignment_2_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3623:1: ( rule__ObjectChoice__OptionsAssignment_2_1 )
            {
             before(grammarAccess.getObjectChoiceAccess().getOptionsAssignment_2_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3624:1: ( rule__ObjectChoice__OptionsAssignment_2_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3624:2: rule__ObjectChoice__OptionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ObjectChoice__OptionsAssignment_2_1_in_rule__ObjectChoice__Group_2__1__Impl7297);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3638:1: rule__ObjectMaybe__Group_1__0 : rule__ObjectMaybe__Group_1__0__Impl rule__ObjectMaybe__Group_1__1 ;
    public final void rule__ObjectMaybe__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3642:1: ( rule__ObjectMaybe__Group_1__0__Impl rule__ObjectMaybe__Group_1__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3643:2: rule__ObjectMaybe__Group_1__0__Impl rule__ObjectMaybe__Group_1__1
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__0__Impl_in_rule__ObjectMaybe__Group_1__07331);
            rule__ObjectMaybe__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__1_in_rule__ObjectMaybe__Group_1__07334);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3650:1: rule__ObjectMaybe__Group_1__0__Impl : ( ( rule__ObjectMaybe__DescriptionAssignment_1_0 ) ) ;
    public final void rule__ObjectMaybe__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3654:1: ( ( ( rule__ObjectMaybe__DescriptionAssignment_1_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3655:1: ( ( rule__ObjectMaybe__DescriptionAssignment_1_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3655:1: ( ( rule__ObjectMaybe__DescriptionAssignment_1_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3656:1: ( rule__ObjectMaybe__DescriptionAssignment_1_0 )
            {
             before(grammarAccess.getObjectMaybeAccess().getDescriptionAssignment_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3657:1: ( rule__ObjectMaybe__DescriptionAssignment_1_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3657:2: rule__ObjectMaybe__DescriptionAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__DescriptionAssignment_1_0_in_rule__ObjectMaybe__Group_1__0__Impl7361);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3667:1: rule__ObjectMaybe__Group_1__1 : rule__ObjectMaybe__Group_1__1__Impl ;
    public final void rule__ObjectMaybe__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3671:1: ( rule__ObjectMaybe__Group_1__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3672:2: rule__ObjectMaybe__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__1__Impl_in_rule__ObjectMaybe__Group_1__17391);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3678:1: rule__ObjectMaybe__Group_1__1__Impl : ( '?' ) ;
    public final void rule__ObjectMaybe__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3682:1: ( ( '?' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3683:1: ( '?' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3683:1: ( '?' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3684:1: '?'
            {
             before(grammarAccess.getObjectMaybeAccess().getQuestionMarkKeyword_1_1()); 
            match(input,42,FOLLOW_42_in_rule__ObjectMaybe__Group_1__1__Impl7419); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3702:1: rule__DTDSL__ParserNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DTDSL__ParserNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3706:1: ( ( RULE_STRING ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3707:1: ( RULE_STRING )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3707:1: ( RULE_STRING )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3708:1: RULE_STRING
            {
             before(grammarAccess.getDTDSLAccess().getParserNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DTDSL__ParserNameAssignment_27459); 
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


    // $ANTLR start "rule__DTDSL__ObjDescriptionAssignment_4"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3717:1: rule__DTDSL__ObjDescriptionAssignment_4 : ( ruleAbstract ) ;
    public final void rule__DTDSL__ObjDescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3721:1: ( ( ruleAbstract ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3722:1: ( ruleAbstract )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3722:1: ( ruleAbstract )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3723:1: ruleAbstract
            {
             before(grammarAccess.getDTDSLAccess().getObjDescriptionAbstractParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAbstract_in_rule__DTDSL__ObjDescriptionAssignment_47490);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getDTDSLAccess().getObjDescriptionAbstractParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTDSL__ObjDescriptionAssignment_4"


    // $ANTLR start "rule__DTDSL__StartAssignment_5"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3732:1: rule__DTDSL__StartAssignment_5 : ( ruleStartPoint ) ;
    public final void rule__DTDSL__StartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3736:1: ( ( ruleStartPoint ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3737:1: ( ruleStartPoint )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3737:1: ( ruleStartPoint )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3738:1: ruleStartPoint
            {
             before(grammarAccess.getDTDSLAccess().getStartStartPointParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStartPoint_in_rule__DTDSL__StartAssignment_57521);
            ruleStartPoint();

            state._fsp--;

             after(grammarAccess.getDTDSLAccess().getStartStartPointParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTDSL__StartAssignment_5"


    // $ANTLR start "rule__StartPoint__BeginAssignment_0_2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3747:1: rule__StartPoint__BeginAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__StartPoint__BeginAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3751:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3752:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3752:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3753:1: ( RULE_ID )
            {
             before(grammarAccess.getStartPointAccess().getBeginObjectDescriptionCrossReference_0_2_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3754:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3755:1: RULE_ID
            {
             before(grammarAccess.getStartPointAccess().getBeginObjectDescriptionIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartPoint__BeginAssignment_0_27556); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3766:1: rule__StartPoint__BeginAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__StartPoint__BeginAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3770:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3771:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3771:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3772:1: ( RULE_ID )
            {
             before(grammarAccess.getStartPointAccess().getBeginStringDescriptionCrossReference_1_0_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3773:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3774:1: RULE_ID
            {
             before(grammarAccess.getStartPointAccess().getBeginStringDescriptionIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartPoint__BeginAssignment_1_07595); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3785:1: rule__StringDescription__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringDescription__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3789:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3790:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3790:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3791:1: RULE_ID
            {
             before(grammarAccess.getStringDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringDescription__NameAssignment_17630); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3800:1: rule__StringDescription__DescriptionAssignment_4 : ( ruleStringDescriptionInner ) ;
    public final void rule__StringDescription__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3804:1: ( ( ruleStringDescriptionInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3805:1: ( ruleStringDescriptionInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3805:1: ( ruleStringDescriptionInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3806:1: ruleStringDescriptionInner
            {
             before(grammarAccess.getStringDescriptionAccess().getDescriptionStringDescriptionInnerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStringDescriptionInner_in_rule__StringDescription__DescriptionAssignment_47661);
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


    // $ANTLR start "rule__StringDescriptionInner__KeyRefAssignment_3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3815:1: rule__StringDescriptionInner__KeyRefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__StringDescriptionInner__KeyRefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3819:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3820:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3820:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3821:1: ( RULE_ID )
            {
             before(grammarAccess.getStringDescriptionInnerAccess().getKeyRefStringKeyCrossReference_3_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3822:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3823:1: RULE_ID
            {
             before(grammarAccess.getStringDescriptionInnerAccess().getKeyRefStringKeyIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringDescriptionInner__KeyRefAssignment_37696); 
             after(grammarAccess.getStringDescriptionInnerAccess().getKeyRefStringKeyIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getStringDescriptionInnerAccess().getKeyRefStringKeyCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDescriptionInner__KeyRefAssignment_3"


    // $ANTLR start "rule__StringOverRead__OverReadAssignment"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3834:1: rule__StringOverRead__OverReadAssignment : ( RULE_STRING ) ;
    public final void rule__StringOverRead__OverReadAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3838:1: ( ( RULE_STRING ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3839:1: ( RULE_STRING )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3839:1: ( RULE_STRING )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3840:1: RULE_STRING
            {
             before(grammarAccess.getStringOverReadAccess().getOverReadSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringOverRead__OverReadAssignment7731); 
             after(grammarAccess.getStringOverReadAccess().getOverReadSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOverRead__OverReadAssignment"


    // $ANTLR start "rule__StringKey__NameAssignment_1_0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3849:1: rule__StringKey__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__StringKey__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3853:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3854:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3854:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3855:1: RULE_ID
            {
             before(grammarAccess.getStringKeyAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringKey__NameAssignment_1_07762); 
             after(grammarAccess.getStringKeyAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringKey__NameAssignment_1_0"


    // $ANTLR start "rule__StringKey__TypeAssignment_4"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3864:1: rule__StringKey__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__StringKey__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3868:1: ( ( ruleType ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3869:1: ( ruleType )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3869:1: ( ruleType )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3870:1: ruleType
            {
             before(grammarAccess.getStringKeyAccess().getTypeTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__StringKey__TypeAssignment_47793);
            ruleType();

            state._fsp--;

             after(grammarAccess.getStringKeyAccess().getTypeTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringKey__TypeAssignment_4"


    // $ANTLR start "rule__StringValue__NameAssignment_1_0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3879:1: rule__StringValue__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__StringValue__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3883:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3884:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3884:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3885:1: RULE_ID
            {
             before(grammarAccess.getStringValueAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringValue__NameAssignment_1_07824); 
             after(grammarAccess.getStringValueAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__NameAssignment_1_0"


    // $ANTLR start "rule__StringValue__TypeAssignment_4"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3894:1: rule__StringValue__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__StringValue__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3898:1: ( ( ruleType ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3899:1: ( ruleType )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3899:1: ( ruleType )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3900:1: ruleType
            {
             before(grammarAccess.getStringValueAccess().getTypeTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__StringValue__TypeAssignment_47855);
            ruleType();

            state._fsp--;

             after(grammarAccess.getStringValueAccess().getTypeTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__TypeAssignment_4"


    // $ANTLR start "rule__StringValue__ToKeyAssignment_5_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3909:1: rule__StringValue__ToKeyAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__StringValue__ToKeyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3913:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3914:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3914:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3915:1: ( RULE_ID )
            {
             before(grammarAccess.getStringValueAccess().getToKeyStringKeyCrossReference_5_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3916:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3917:1: RULE_ID
            {
             before(grammarAccess.getStringValueAccess().getToKeyStringKeyIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringValue__ToKeyAssignment_5_17890); 
             after(grammarAccess.getStringValueAccess().getToKeyStringKeyIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getStringValueAccess().getToKeyStringKeyCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ToKeyAssignment_5_1"


    // $ANTLR start "rule__StringOr__OptionAssignment_3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3928:1: rule__StringOr__OptionAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__StringOr__OptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3932:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3933:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3933:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3934:1: ( RULE_ID )
            {
             before(grammarAccess.getStringOrAccess().getOptionStringDescriptionInVariableCrossReference_3_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3935:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3936:1: RULE_ID
            {
             before(grammarAccess.getStringOrAccess().getOptionStringDescriptionInVariableIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringOr__OptionAssignment_37929); 
             after(grammarAccess.getStringOrAccess().getOptionStringDescriptionInVariableIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getStringOrAccess().getOptionStringDescriptionInVariableCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOr__OptionAssignment_3"


    // $ANTLR start "rule__StringOr__OptionAssignment_4_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3947:1: rule__StringOr__OptionAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__StringOr__OptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3951:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3952:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3952:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3953:1: ( RULE_ID )
            {
             before(grammarAccess.getStringOrAccess().getOptionStringDescriptionInVariableCrossReference_4_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3954:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3955:1: RULE_ID
            {
             before(grammarAccess.getStringOrAccess().getOptionStringDescriptionInVariableIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringOr__OptionAssignment_4_17968); 
             after(grammarAccess.getStringOrAccess().getOptionStringDescriptionInVariableIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getStringOrAccess().getOptionStringDescriptionInVariableCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOr__OptionAssignment_4_1"


    // $ANTLR start "rule__StringDescriptionInVariable__NameAssignment_0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3966:1: rule__StringDescriptionInVariable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__StringDescriptionInVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3970:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3971:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3971:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3972:1: RULE_ID
            {
             before(grammarAccess.getStringDescriptionInVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringDescriptionInVariable__NameAssignment_08003); 
             after(grammarAccess.getStringDescriptionInVariableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDescriptionInVariable__NameAssignment_0"


    // $ANTLR start "rule__StringDescriptionInVariable__DescriptionAssignment_3"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3981:1: rule__StringDescriptionInVariable__DescriptionAssignment_3 : ( ruleStringDescriptionInner ) ;
    public final void rule__StringDescriptionInVariable__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3985:1: ( ( ruleStringDescriptionInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3986:1: ( ruleStringDescriptionInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3986:1: ( ruleStringDescriptionInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3987:1: ruleStringDescriptionInner
            {
             before(grammarAccess.getStringDescriptionInVariableAccess().getDescriptionStringDescriptionInnerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStringDescriptionInner_in_rule__StringDescriptionInVariable__DescriptionAssignment_38034);
            ruleStringDescriptionInner();

            state._fsp--;

             after(grammarAccess.getStringDescriptionInVariableAccess().getDescriptionStringDescriptionInnerParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDescriptionInVariable__DescriptionAssignment_3"


    // $ANTLR start "rule__StringComplex__DescriptionAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3996:1: rule__StringComplex__DescriptionAssignment_1 : ( ruleStringDescriptionInner ) ;
    public final void rule__StringComplex__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4000:1: ( ( ruleStringDescriptionInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4001:1: ( ruleStringDescriptionInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4001:1: ( ruleStringDescriptionInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4002:1: ruleStringDescriptionInner
            {
             before(grammarAccess.getStringComplexAccess().getDescriptionStringDescriptionInnerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStringDescriptionInner_in_rule__StringComplex__DescriptionAssignment_18065);
            ruleStringDescriptionInner();

            state._fsp--;

             after(grammarAccess.getStringComplexAccess().getDescriptionStringDescriptionInnerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringComplex__DescriptionAssignment_1"


    // $ANTLR start "rule__StringComplex__ManyAssignment_3_0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4011:1: rule__StringComplex__ManyAssignment_3_0 : ( ( '*' ) ) ;
    public final void rule__StringComplex__ManyAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4015:1: ( ( ( '*' ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4016:1: ( ( '*' ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4016:1: ( ( '*' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4017:1: ( '*' )
            {
             before(grammarAccess.getStringComplexAccess().getManyAsteriskKeyword_3_0_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4018:1: ( '*' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4019:1: '*'
            {
             before(grammarAccess.getStringComplexAccess().getManyAsteriskKeyword_3_0_0()); 
            match(input,41,FOLLOW_41_in_rule__StringComplex__ManyAssignment_3_08101); 
             after(grammarAccess.getStringComplexAccess().getManyAsteriskKeyword_3_0_0()); 

            }

             after(grammarAccess.getStringComplexAccess().getManyAsteriskKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringComplex__ManyAssignment_3_0"


    // $ANTLR start "rule__StringComplex__MaybeAssignment_3_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4034:1: rule__StringComplex__MaybeAssignment_3_1 : ( ( '?' ) ) ;
    public final void rule__StringComplex__MaybeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4038:1: ( ( ( '?' ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4039:1: ( ( '?' ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4039:1: ( ( '?' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4040:1: ( '?' )
            {
             before(grammarAccess.getStringComplexAccess().getMaybeQuestionMarkKeyword_3_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4041:1: ( '?' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4042:1: '?'
            {
             before(grammarAccess.getStringComplexAccess().getMaybeQuestionMarkKeyword_3_1_0()); 
            match(input,42,FOLLOW_42_in_rule__StringComplex__MaybeAssignment_3_18145); 
             after(grammarAccess.getStringComplexAccess().getMaybeQuestionMarkKeyword_3_1_0()); 

            }

             after(grammarAccess.getStringComplexAccess().getMaybeQuestionMarkKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringComplex__MaybeAssignment_3_1"


    // $ANTLR start "rule__ObjectDescription__NameAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4057:1: rule__ObjectDescription__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectDescription__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4061:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4062:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4062:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4063:1: RULE_ID
            {
             before(grammarAccess.getObjectDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectDescription__NameAssignment_18184); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4072:1: rule__ObjectDescription__DescriptionAssignment_4 : ( ruleObjectDescriptionInner ) ;
    public final void rule__ObjectDescription__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4076:1: ( ( ruleObjectDescriptionInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4077:1: ( ruleObjectDescriptionInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4077:1: ( ruleObjectDescriptionInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4078:1: ruleObjectDescriptionInner
            {
             before(grammarAccess.getObjectDescriptionAccess().getDescriptionObjectDescriptionInnerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleObjectDescriptionInner_in_rule__ObjectDescription__DescriptionAssignment_48215);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4087:1: rule__ObjectAttribute__AttributesAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectAttribute__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4091:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4092:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4092:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4093:1: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectAttribute__AttributesAssignment_18246); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4102:1: rule__ObjectAttribute__StringMethodeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__StringMethodeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4106:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4107:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4107:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4108:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getStringMethodeStringDescriptionCrossReference_2_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4109:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4110:1: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getStringMethodeStringDescriptionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectAttribute__StringMethodeAssignment_2_18281); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4121:1: rule__ObjectNode__AttributesAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectNode__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4125:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4126:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4126:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4127:1: RULE_ID
            {
             before(grammarAccess.getObjectNodeAccess().getAttributesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectNode__AttributesAssignment_18316); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4136:1: rule__ObjectNode__InnerAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectNode__InnerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4140:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4141:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4141:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4142:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectNodeAccess().getInnerObjectDescriptionCrossReference_3_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4143:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4144:1: RULE_ID
            {
             before(grammarAccess.getObjectNodeAccess().getInnerObjectDescriptionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectNode__InnerAssignment_38351); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4155:1: rule__ObjectNext__AttributeAssignment_1 : ( ruleJavaCodeOrID ) ;
    public final void rule__ObjectNext__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4159:1: ( ( ruleJavaCodeOrID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4160:1: ( ruleJavaCodeOrID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4160:1: ( ruleJavaCodeOrID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4161:1: ruleJavaCodeOrID
            {
             before(grammarAccess.getObjectNextAccess().getAttributeJavaCodeOrIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_rule__ObjectNext__AttributeAssignment_18386);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4170:1: rule__ObjectNext__ObjectDesriptionAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectNext__ObjectDesriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4174:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4175:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4175:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4176:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectNextAccess().getObjectDesriptionObjectDescriptionCrossReference_3_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4177:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4178:1: RULE_ID
            {
             before(grammarAccess.getObjectNextAccess().getObjectDesriptionObjectDescriptionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectNext__ObjectDesriptionAssignment_38421); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4189:1: rule__JavaCodeOrID__CodeAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__JavaCodeOrID__CodeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4193:1: ( ( RULE_STRING ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4194:1: ( RULE_STRING )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4194:1: ( RULE_STRING )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4195:1: RULE_STRING
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getCodeSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JavaCodeOrID__CodeAssignment_0_28456); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4204:1: rule__JavaCodeOrID__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__JavaCodeOrID__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4208:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4209:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4209:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4210:1: RULE_ID
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JavaCodeOrID__IdAssignment_18487); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4219:1: rule__ObjectMany__OptionAssignment_0 : ( ruleObjectMaybeInner ) ;
    public final void rule__ObjectMany__OptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4223:1: ( ( ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4224:1: ( ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4224:1: ( ruleObjectMaybeInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4225:1: ruleObjectMaybeInner
            {
             before(grammarAccess.getObjectManyAccess().getOptionObjectMaybeInnerParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_rule__ObjectMany__OptionAssignment_08518);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4234:1: rule__ObjectChoice__OptionsAssignment_1 : ( ruleObjectMaybeInner ) ;
    public final void rule__ObjectChoice__OptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4238:1: ( ( ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4239:1: ( ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4239:1: ( ruleObjectMaybeInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4240:1: ruleObjectMaybeInner
            {
             before(grammarAccess.getObjectChoiceAccess().getOptionsObjectMaybeInnerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_rule__ObjectChoice__OptionsAssignment_18549);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4249:1: rule__ObjectChoice__OptionsAssignment_2_1 : ( ruleObjectMaybeInner ) ;
    public final void rule__ObjectChoice__OptionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4253:1: ( ( ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4254:1: ( ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4254:1: ( ruleObjectMaybeInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4255:1: ruleObjectMaybeInner
            {
             before(grammarAccess.getObjectChoiceAccess().getOptionsObjectMaybeInnerParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_rule__ObjectChoice__OptionsAssignment_2_18580);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4264:1: rule__ObjectMaybe__OptionAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectMaybe__OptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4268:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4269:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4269:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4270:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectMaybeAccess().getOptionObjectDescriptionCrossReference_0_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4271:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4272:1: RULE_ID
            {
             before(grammarAccess.getObjectMaybeAccess().getOptionObjectDescriptionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectMaybe__OptionAssignment_08615); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4283:1: rule__ObjectMaybe__DescriptionAssignment_1_0 : ( ruleObjectMaybeInner ) ;
    public final void rule__ObjectMaybe__DescriptionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4287:1: ( ( ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4288:1: ( ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4288:1: ( ruleObjectMaybeInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:4289:1: ruleObjectMaybeInner
            {
             before(grammarAccess.getObjectMaybeAccess().getDescriptionObjectMaybeInnerParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_rule__ObjectMaybe__DescriptionAssignment_1_08650);
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA3_eotS =
        "\12\uffff";
    static final String DFA3_eofS =
        "\2\uffff\1\7\7\uffff";
    static final String DFA3_minS =
        "\1\4\1\uffff\1\4\5\uffff\1\33\1\uffff";
    static final String DFA3_maxS =
        "\1\40\1\uffff\1\41\5\uffff\1\35\1\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\5\1\6\1\4\1\uffff\1\7";
    static final String DFA3_specialS =
        "\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\2\25\uffff\1\3\1\uffff\1\4\1\uffff\1\6\1\5",
            "",
            "\2\7\17\uffff\1\10\1\7\1\uffff\1\11\1\uffff\2\7\1\uffff\1"+
            "\7\1\uffff\3\7",
            "",
            "",
            "",
            "",
            "",
            "\1\3\1\uffff\1\4",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "720:1: rule__StringDescriptionInner__Alternatives : ( ( ruleStringOverRead ) | ( ruleStringKey ) | ( ruleStringValue ) | ( ( rule__StringDescriptionInner__KeyRefAssignment_3 ) ) | ( ruleStringComplex ) | ( ruleStringOr ) | ( ruleStringDescriptionInVariable ) );";
        }
    }
    static final String DFA5_eotS =
        "\26\uffff";
    static final String DFA5_eofS =
        "\26\uffff";
    static final String DFA5_minS =
        "\4\5\2\uffff\1\45\1\26\1\30\1\45\2\5\2\uffff\1\4\1\5\2\26\1\45"+
        "\1\26\2\uffff";
    static final String DFA5_maxS =
        "\1\47\2\5\1\50\2\uffff\1\45\1\52\1\30\1\45\2\5\2\uffff\1\4\1\5"+
        "\2\52\1\45\1\52\2\uffff";
    static final String DFA5_acceptS =
        "\4\uffff\1\4\1\6\6\uffff\1\2\1\5\6\uffff\1\1\1\3";
    static final String DFA5_specialS =
        "\26\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\4\32\uffff\1\5\3\uffff\1\2\1\uffff\1\1\1\3",
            "\1\6",
            "\1\7",
            "\1\11\42\uffff\1\10",
            "",
            "",
            "\1\12",
            "\1\14\16\uffff\1\13\3\uffff\1\15\1\4",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "",
            "",
            "\1\22",
            "\1\23",
            "\1\24\22\uffff\1\15\1\4",
            "\1\14\22\uffff\1\15\1\4",
            "\1\17",
            "\1\25\22\uffff\1\15\1\4",
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
            return "794:1: rule__ObjectDescriptionInner__Alternatives_0 : ( ( ruleObjectNode ) | ( ruleObjectAttribute ) | ( ruleObjectNext ) | ( ruleObjectMaybe ) | ( ruleObjectMany ) | ( ruleObjectChoice ) );";
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
    public static final BitSet FOLLOW_ruleStringOverRead_in_entryRuleStringOverRead361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringOverRead368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringOverRead__OverReadAssignment_in_ruleStringOverRead394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringKey_in_entryRuleStringKey421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringKey428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__Group__0_in_ruleStringKey454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__0_in_ruleStringValue514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringOr_in_entryRuleStringOr541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringOr548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringOr__Group__0_in_ruleStringOr574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescriptionInVariable_in_entryRuleStringDescriptionInVariable601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringDescriptionInVariable608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescriptionInVariable__Group__0_in_ruleStringDescriptionInVariable634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringComplex_in_entryRuleStringComplex661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringComplex668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringComplex__Group__0_in_ruleStringComplex694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescription728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__0_in_ruleObjectDescription754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescriptionInner788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Group__0_in_ruleObjectDescriptionInner814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectAttribute848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__0_in_ruleObjectAttribute874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_entryRuleObjectNode901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectNode908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__0_in_ruleObjectNode934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_entryRuleObjectNext961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectNext968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__0_in_ruleObjectNext994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaCodeOrID1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Alternatives_in_ruleJavaCodeOrID1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMany_in_entryRuleObjectMany1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMany1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMany__Group__0_in_ruleObjectMany1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectChoice_in_entryRuleObjectChoice1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectChoice1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__0_in_ruleObjectChoice1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMaybe1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Alternatives_in_ruleObjectMaybe1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_entryRuleObjectMaybeInner1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMaybeInner1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybeInner__Alternatives_in_ruleObjectMaybeInner1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__0_in_rule__StartPoint__Alternatives1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_1__0_in_rule__StartPoint__Alternatives1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescription_in_rule__Abstract__Alternatives1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescription_in_rule__Abstract__Alternatives1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringOverRead_in_rule__StringDescriptionInner__Alternatives1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringKey_in_rule__StringDescriptionInner__Alternatives1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__StringDescriptionInner__Alternatives1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescriptionInner__KeyRefAssignment_3_in_rule__StringDescriptionInner__Alternatives1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringComplex_in_rule__StringDescriptionInner__Alternatives1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringOr_in_rule__StringDescriptionInner__Alternatives1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescriptionInVariable_in_rule__StringDescriptionInner__Alternatives1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringComplex__ManyAssignment_3_0_in_rule__StringComplex__Alternatives_31625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringComplex__MaybeAssignment_3_1_in_rule__StringComplex__Alternatives_31643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_rule__ObjectDescriptionInner__Alternatives_01676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_rule__ObjectDescriptionInner__Alternatives_01693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_rule__ObjectDescriptionInner__Alternatives_01710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_rule__ObjectDescriptionInner__Alternatives_01727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMany_in_rule__ObjectDescriptionInner__Alternatives_01744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectChoice_in_rule__ObjectDescriptionInner__Alternatives_01761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__0_in_rule__JavaCodeOrID__Alternatives1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__IdAssignment_1_in_rule__JavaCodeOrID__Alternatives1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type__Alternatives1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__Alternatives1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__Alternatives1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__Alternatives1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type__Alternatives1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type__Alternatives1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type__Alternatives1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type__Alternatives1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Type__Alternatives2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__OptionAssignment_0_in_rule__ObjectMaybe__Alternatives2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__0_in_rule__ObjectMaybe__Alternatives2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_rule__ObjectMaybeInner__Alternatives2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_rule__ObjectMaybeInner__Alternatives2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_rule__ObjectMaybeInner__Alternatives2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__0__Impl_in_rule__DTDSL__Group__02154 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__1_in_rule__DTDSL__Group__02157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DTDSL__Group__0__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__1__Impl_in_rule__DTDSL__Group__12216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__2_in_rule__DTDSL__Group__12219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DTDSL__Group__1__Impl2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__2__Impl_in_rule__DTDSL__Group__22278 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__3_in_rule__DTDSL__Group__22281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__ParserNameAssignment_2_in_rule__DTDSL__Group__2__Impl2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__3__Impl_in_rule__DTDSL__Group__32338 = new BitSet(new long[]{0x0000000800840020L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__4_in_rule__DTDSL__Group__32341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DTDSL__Group__3__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__4__Impl_in_rule__DTDSL__Group__42400 = new BitSet(new long[]{0x0000000800840020L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__5_in_rule__DTDSL__Group__42403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__ObjDescriptionAssignment_4_in_rule__DTDSL__Group__4__Impl2430 = new BitSet(new long[]{0x0000000800040002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__5__Impl_in_rule__DTDSL__Group__52461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__StartAssignment_5_in_rule__DTDSL__Group__5__Impl2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__0__Impl_in_rule__StartPoint__Group_0__02530 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__1_in_rule__StartPoint__Group_0__02533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__StartPoint__Group_0__0__Impl2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__1__Impl_in_rule__StartPoint__Group_0__12592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__2_in_rule__StartPoint__Group_0__12595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StartPoint__Group_0__1__Impl2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__2__Impl_in_rule__StartPoint__Group_0__22654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__BeginAssignment_0_2_in_rule__StartPoint__Group_0__2__Impl2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_1__0__Impl_in_rule__StartPoint__Group_1__02717 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_1__1_in_rule__StartPoint__Group_1__02720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__BeginAssignment_1_0_in_rule__StartPoint__Group_1__0__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_1__1__Impl_in_rule__StartPoint__Group_1__12777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StartPoint__Group_1__1__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__0__Impl_in_rule__StringDescription__Group__02840 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__1_in_rule__StringDescription__Group__02843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StringDescription__Group__0__Impl2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__1__Impl_in_rule__StringDescription__Group__12902 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__2_in_rule__StringDescription__Group__12905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__NameAssignment_1_in_rule__StringDescription__Group__1__Impl2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__2__Impl_in_rule__StringDescription__Group__22962 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__3_in_rule__StringDescription__Group__22965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__StringDescription__Group__2__Impl2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__3__Impl_in_rule__StringDescription__Group__33024 = new BitSet(new long[]{0x00000001AC000030L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__4_in_rule__StringDescription__Group__33027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StringDescription__Group__3__Impl3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__4__Impl_in_rule__StringDescription__Group__43086 = new BitSet(new long[]{0x00000001AC000030L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__5_in_rule__StringDescription__Group__43089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__DescriptionAssignment_4_in_rule__StringDescription__Group__4__Impl3116 = new BitSet(new long[]{0x00000001A8000032L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__5__Impl_in_rule__StringDescription__Group__53147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StringDescription__Group__5__Impl3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__Group__0__Impl_in_rule__StringKey__Group__03218 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__StringKey__Group__1_in_rule__StringKey__Group__03221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__Group__1__Impl_in_rule__StringKey__Group__13279 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__StringKey__Group__2_in_rule__StringKey__Group__13282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__Group_1__0_in_rule__StringKey__Group__1__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__Group__2__Impl_in_rule__StringKey__Group__23340 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__StringKey__Group__3_in_rule__StringKey__Group__23343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__StringKey__Group__2__Impl3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__Group__3__Impl_in_rule__StringKey__Group__33402 = new BitSet(new long[]{0x00000000000FF800L});
    public static final BitSet FOLLOW_rule__StringKey__Group__4_in_rule__StringKey__Group__33405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StringKey__Group__3__Impl3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__Group__4__Impl_in_rule__StringKey__Group__43464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__TypeAssignment_4_in_rule__StringKey__Group__4__Impl3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__Group_1__0__Impl_in_rule__StringKey__Group_1__03531 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StringKey__Group_1__1_in_rule__StringKey__Group_1__03534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__NameAssignment_1_0_in_rule__StringKey__Group_1__0__Impl3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__Group_1__1__Impl_in_rule__StringKey__Group_1__13591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringKey__Group_1__1__Impl3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__0__Impl_in_rule__StringValue__Group__03654 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_rule__StringValue__Group__1_in_rule__StringValue__Group__03657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__13715 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_rule__StringValue__Group__2_in_rule__StringValue__Group__13718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group_1__0_in_rule__StringValue__Group__1__Impl3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__2__Impl_in_rule__StringValue__Group__23776 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__StringValue__Group__3_in_rule__StringValue__Group__23779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__StringValue__Group__2__Impl3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__3__Impl_in_rule__StringValue__Group__33838 = new BitSet(new long[]{0x00000000000FF800L});
    public static final BitSet FOLLOW_rule__StringValue__Group__4_in_rule__StringValue__Group__33841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StringValue__Group__3__Impl3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__4__Impl_in_rule__StringValue__Group__43900 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__StringValue__Group__5_in_rule__StringValue__Group__43903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__TypeAssignment_4_in_rule__StringValue__Group__4__Impl3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__5__Impl_in_rule__StringValue__Group__53960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group_5__0_in_rule__StringValue__Group__5__Impl3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group_1__0__Impl_in_rule__StringValue__Group_1__04030 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StringValue__Group_1__1_in_rule__StringValue__Group_1__04033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__NameAssignment_1_0_in_rule__StringValue__Group_1__0__Impl4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group_1__1__Impl_in_rule__StringValue__Group_1__14090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringValue__Group_1__1__Impl4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group_5__0__Impl_in_rule__StringValue__Group_5__04153 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringValue__Group_5__1_in_rule__StringValue__Group_5__04156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StringValue__Group_5__0__Impl4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group_5__1__Impl_in_rule__StringValue__Group_5__14215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ToKeyAssignment_5_1_in_rule__StringValue__Group_5__1__Impl4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringOr__Group__0__Impl_in_rule__StringOr__Group__04276 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__StringOr__Group__1_in_rule__StringOr__Group__04279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringOr__Group__1__Impl_in_rule__StringOr__Group__14337 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__StringOr__Group__2_in_rule__StringOr__Group__14340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__StringOr__Group__1__Impl4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringOr__Group__2__Impl_in_rule__StringOr__Group__24399 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringOr__Group__3_in_rule__StringOr__Group__24402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__StringOr__Group__2__Impl4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringOr__Group__3__Impl_in_rule__StringOr__Group__34461 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__StringOr__Group__4_in_rule__StringOr__Group__34464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringOr__OptionAssignment_3_in_rule__StringOr__Group__3__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringOr__Group__4__Impl_in_rule__StringOr__Group__44521 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__StringOr__Group__5_in_rule__StringOr__Group__44524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringOr__Group_4__0_in_rule__StringOr__Group__4__Impl4551 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__StringOr__Group__5__Impl_in_rule__StringOr__Group__54582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__StringOr__Group__5__Impl4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringOr__Group_4__0__Impl_in_rule__StringOr__Group_4__04653 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringOr__Group_4__1_in_rule__StringOr__Group_4__04656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__StringOr__Group_4__0__Impl4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringOr__Group_4__1__Impl_in_rule__StringOr__Group_4__14715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringOr__OptionAssignment_4_1_in_rule__StringOr__Group_4__1__Impl4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescriptionInVariable__Group__0__Impl_in_rule__StringDescriptionInVariable__Group__04776 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__StringDescriptionInVariable__Group__1_in_rule__StringDescriptionInVariable__Group__04779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescriptionInVariable__NameAssignment_0_in_rule__StringDescriptionInVariable__Group__0__Impl4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescriptionInVariable__Group__1__Impl_in_rule__StringDescriptionInVariable__Group__14836 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StringDescriptionInVariable__Group__2_in_rule__StringDescriptionInVariable__Group__14839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__StringDescriptionInVariable__Group__1__Impl4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescriptionInVariable__Group__2__Impl_in_rule__StringDescriptionInVariable__Group__24898 = new BitSet(new long[]{0x00000001A8400030L});
    public static final BitSet FOLLOW_rule__StringDescriptionInVariable__Group__3_in_rule__StringDescriptionInVariable__Group__24901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringDescriptionInVariable__Group__2__Impl4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescriptionInVariable__Group__3__Impl_in_rule__StringDescriptionInVariable__Group__34960 = new BitSet(new long[]{0x00000001A8400030L});
    public static final BitSet FOLLOW_rule__StringDescriptionInVariable__Group__4_in_rule__StringDescriptionInVariable__Group__34963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescriptionInVariable__DescriptionAssignment_3_in_rule__StringDescriptionInVariable__Group__3__Impl4990 = new BitSet(new long[]{0x00000001A8000032L});
    public static final BitSet FOLLOW_rule__StringDescriptionInVariable__Group__4__Impl_in_rule__StringDescriptionInVariable__Group__45021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StringDescriptionInVariable__Group__4__Impl5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringComplex__Group__0__Impl_in_rule__StringComplex__Group__05090 = new BitSet(new long[]{0x00000003A8000030L});
    public static final BitSet FOLLOW_rule__StringComplex__Group__1_in_rule__StringComplex__Group__05093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__StringComplex__Group__0__Impl5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringComplex__Group__1__Impl_in_rule__StringComplex__Group__15152 = new BitSet(new long[]{0x00000003A8000030L});
    public static final BitSet FOLLOW_rule__StringComplex__Group__2_in_rule__StringComplex__Group__15155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringComplex__DescriptionAssignment_1_in_rule__StringComplex__Group__1__Impl5182 = new BitSet(new long[]{0x00000001A8000032L});
    public static final BitSet FOLLOW_rule__StringComplex__Group__2__Impl_in_rule__StringComplex__Group__25213 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__StringComplex__Group__3_in_rule__StringComplex__Group__25216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__StringComplex__Group__2__Impl5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringComplex__Group__3__Impl_in_rule__StringComplex__Group__35275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringComplex__Alternatives_3_in_rule__StringComplex__Group__3__Impl5302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__0__Impl_in_rule__ObjectDescription__Group__05340 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__1_in_rule__ObjectDescription__Group__05343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ObjectDescription__Group__0__Impl5371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__1__Impl_in_rule__ObjectDescription__Group__15402 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__2_in_rule__ObjectDescription__Group__15405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__NameAssignment_1_in_rule__ObjectDescription__Group__1__Impl5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__2__Impl_in_rule__ObjectDescription__Group__25462 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__3_in_rule__ObjectDescription__Group__25465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ObjectDescription__Group__2__Impl5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__3__Impl_in_rule__ObjectDescription__Group__35524 = new BitSet(new long[]{0x000000D104000020L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__4_in_rule__ObjectDescription__Group__35527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ObjectDescription__Group__3__Impl5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__4__Impl_in_rule__ObjectDescription__Group__45586 = new BitSet(new long[]{0x000000D104000020L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__5_in_rule__ObjectDescription__Group__45589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__DescriptionAssignment_4_in_rule__ObjectDescription__Group__4__Impl5616 = new BitSet(new long[]{0x000000D100000022L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__5__Impl_in_rule__ObjectDescription__Group__55647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ObjectDescription__Group__5__Impl5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Group__0__Impl_in_rule__ObjectDescriptionInner__Group__05718 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Group__1_in_rule__ObjectDescriptionInner__Group__05721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Alternatives_0_in_rule__ObjectDescriptionInner__Group__0__Impl5748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Group__1__Impl_in_rule__ObjectDescriptionInner__Group__15778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ObjectDescriptionInner__Group__1__Impl5806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__0__Impl_in_rule__ObjectAttribute__Group__05841 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__1_in_rule__ObjectAttribute__Group__05844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ObjectAttribute__Group__0__Impl5872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__1__Impl_in_rule__ObjectAttribute__Group__15903 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__2_in_rule__ObjectAttribute__Group__15906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__AttributesAssignment_1_in_rule__ObjectAttribute__Group__1__Impl5933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__2__Impl_in_rule__ObjectAttribute__Group__25963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_2__0_in_rule__ObjectAttribute__Group__2__Impl5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_2__0__Impl_in_rule__ObjectAttribute__Group_2__06027 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_2__1_in_rule__ObjectAttribute__Group_2__06030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ObjectAttribute__Group_2__0__Impl6058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_2__1__Impl_in_rule__ObjectAttribute__Group_2__16089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__StringMethodeAssignment_2_1_in_rule__ObjectAttribute__Group_2__1__Impl6116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__0__Impl_in_rule__ObjectNode__Group__06150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__1_in_rule__ObjectNode__Group__06153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ObjectNode__Group__0__Impl6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__1__Impl_in_rule__ObjectNode__Group__16212 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__2_in_rule__ObjectNode__Group__16215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__AttributesAssignment_1_in_rule__ObjectNode__Group__1__Impl6242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__2__Impl_in_rule__ObjectNode__Group__26272 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__3_in_rule__ObjectNode__Group__26275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ObjectNode__Group__2__Impl6303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__3__Impl_in_rule__ObjectNode__Group__36334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__InnerAssignment_3_in_rule__ObjectNode__Group__3__Impl6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__0__Impl_in_rule__ObjectNext__Group__06399 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__1_in_rule__ObjectNext__Group__06402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ObjectNext__Group__0__Impl6430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__1__Impl_in_rule__ObjectNext__Group__16461 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__2_in_rule__ObjectNext__Group__16464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__AttributeAssignment_1_in_rule__ObjectNext__Group__1__Impl6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__2__Impl_in_rule__ObjectNext__Group__26521 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__3_in_rule__ObjectNext__Group__26524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ObjectNext__Group__2__Impl6552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__3__Impl_in_rule__ObjectNext__Group__36583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__ObjectDesriptionAssignment_3_in_rule__ObjectNext__Group__3__Impl6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__0__Impl_in_rule__JavaCodeOrID__Group_0__06648 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__1_in_rule__JavaCodeOrID__Group_0__06651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__JavaCodeOrID__Group_0__0__Impl6679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__1__Impl_in_rule__JavaCodeOrID__Group_0__16710 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__2_in_rule__JavaCodeOrID__Group_0__16713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__JavaCodeOrID__Group_0__1__Impl6741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__2__Impl_in_rule__JavaCodeOrID__Group_0__26772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__CodeAssignment_0_2_in_rule__JavaCodeOrID__Group_0__2__Impl6799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMany__Group__0__Impl_in_rule__ObjectMany__Group__06835 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ObjectMany__Group__1_in_rule__ObjectMany__Group__06838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMany__OptionAssignment_0_in_rule__ObjectMany__Group__0__Impl6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMany__Group__1__Impl_in_rule__ObjectMany__Group__16895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ObjectMany__Group__1__Impl6923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__0__Impl_in_rule__ObjectChoice__Group__06958 = new BitSet(new long[]{0x000000D000000020L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__1_in_rule__ObjectChoice__Group__06961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ObjectChoice__Group__0__Impl6989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__1__Impl_in_rule__ObjectChoice__Group__17020 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__2_in_rule__ObjectChoice__Group__17023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__OptionsAssignment_1_in_rule__ObjectChoice__Group__1__Impl7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__2__Impl_in_rule__ObjectChoice__Group__27080 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__3_in_rule__ObjectChoice__Group__27083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group_2__0_in_rule__ObjectChoice__Group__2__Impl7110 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__3__Impl_in_rule__ObjectChoice__Group__37141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ObjectChoice__Group__3__Impl7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group_2__0__Impl_in_rule__ObjectChoice__Group_2__07208 = new BitSet(new long[]{0x000000D000000020L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group_2__1_in_rule__ObjectChoice__Group_2__07211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ObjectChoice__Group_2__0__Impl7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group_2__1__Impl_in_rule__ObjectChoice__Group_2__17270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__OptionsAssignment_2_1_in_rule__ObjectChoice__Group_2__1__Impl7297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__0__Impl_in_rule__ObjectMaybe__Group_1__07331 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__1_in_rule__ObjectMaybe__Group_1__07334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__DescriptionAssignment_1_0_in_rule__ObjectMaybe__Group_1__0__Impl7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__1__Impl_in_rule__ObjectMaybe__Group_1__17391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ObjectMaybe__Group_1__1__Impl7419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DTDSL__ParserNameAssignment_27459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_rule__DTDSL__ObjDescriptionAssignment_47490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartPoint_in_rule__DTDSL__StartAssignment_57521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartPoint__BeginAssignment_0_27556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartPoint__BeginAssignment_1_07595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringDescription__NameAssignment_17630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescriptionInner_in_rule__StringDescription__DescriptionAssignment_47661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringDescriptionInner__KeyRefAssignment_37696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringOverRead__OverReadAssignment7731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringKey__NameAssignment_1_07762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__StringKey__TypeAssignment_47793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringValue__NameAssignment_1_07824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__StringValue__TypeAssignment_47855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringValue__ToKeyAssignment_5_17890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringOr__OptionAssignment_37929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringOr__OptionAssignment_4_17968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringDescriptionInVariable__NameAssignment_08003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescriptionInner_in_rule__StringDescriptionInVariable__DescriptionAssignment_38034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescriptionInner_in_rule__StringComplex__DescriptionAssignment_18065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__StringComplex__ManyAssignment_3_08101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__StringComplex__MaybeAssignment_3_18145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectDescription__NameAssignment_18184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_rule__ObjectDescription__DescriptionAssignment_48215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectAttribute__AttributesAssignment_18246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectAttribute__StringMethodeAssignment_2_18281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectNode__AttributesAssignment_18316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectNode__InnerAssignment_38351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_rule__ObjectNext__AttributeAssignment_18386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectNext__ObjectDesriptionAssignment_38421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JavaCodeOrID__CodeAssignment_0_28456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JavaCodeOrID__IdAssignment_18487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_rule__ObjectMany__OptionAssignment_08518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_rule__ObjectChoice__OptionsAssignment_18549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_rule__ObjectChoice__OptionsAssignment_2_18580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectMaybe__OptionAssignment_08615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_rule__ObjectMaybe__DescriptionAssignment_1_08650 = new BitSet(new long[]{0x0000000000000002L});

}