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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'short'", "'int'", "'long'", "'float'", "'double'", "'char'", "'String'", "'byte'", "'parserName'", "'='", "';'", "'beginWith'", "':'", "'{'", "'}'", "'Key'", "'ofType'", "'Value'", "'to'", "'Node'", "'hasAttribute'", "'as'", "'hasNode'", "'hasNext'", "'java'", "'*'", "'('", "')'", "'|'", "'?'"
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


    // $ANTLR start "entryRuleObjectDescription"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:284:1: entryRuleObjectDescription : ruleObjectDescription EOF ;
    public final void entryRuleObjectDescription() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:285:1: ( ruleObjectDescription EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:286:1: ruleObjectDescription EOF
            {
             before(grammarAccess.getObjectDescriptionRule()); 
            pushFollow(FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription541);
            ruleObjectDescription();

            state._fsp--;

             after(grammarAccess.getObjectDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescription548); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:293:1: ruleObjectDescription : ( ( rule__ObjectDescription__Group__0 ) ) ;
    public final void ruleObjectDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:297:2: ( ( ( rule__ObjectDescription__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:298:1: ( ( rule__ObjectDescription__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:298:1: ( ( rule__ObjectDescription__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:299:1: ( rule__ObjectDescription__Group__0 )
            {
             before(grammarAccess.getObjectDescriptionAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:300:1: ( rule__ObjectDescription__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:300:2: rule__ObjectDescription__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__0_in_ruleObjectDescription574);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:314:1: entryRuleObjectDescriptionInner : ruleObjectDescriptionInner EOF ;
    public final void entryRuleObjectDescriptionInner() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:315:1: ( ruleObjectDescriptionInner EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:316:1: ruleObjectDescriptionInner EOF
            {
             before(grammarAccess.getObjectDescriptionInnerRule()); 
            pushFollow(FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner603);
            ruleObjectDescriptionInner();

            state._fsp--;

             after(grammarAccess.getObjectDescriptionInnerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescriptionInner610); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:323:1: ruleObjectDescriptionInner : ( ( rule__ObjectDescriptionInner__Group__0 ) ) ;
    public final void ruleObjectDescriptionInner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:327:2: ( ( ( rule__ObjectDescriptionInner__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:328:1: ( ( rule__ObjectDescriptionInner__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:328:1: ( ( rule__ObjectDescriptionInner__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:329:1: ( rule__ObjectDescriptionInner__Group__0 )
            {
             before(grammarAccess.getObjectDescriptionInnerAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:330:1: ( rule__ObjectDescriptionInner__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:330:2: rule__ObjectDescriptionInner__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Group__0_in_ruleObjectDescriptionInner636);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:342:1: entryRuleObjectAttribute : ruleObjectAttribute EOF ;
    public final void entryRuleObjectAttribute() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:343:1: ( ruleObjectAttribute EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:344:1: ruleObjectAttribute EOF
            {
             before(grammarAccess.getObjectAttributeRule()); 
            pushFollow(FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute663);
            ruleObjectAttribute();

            state._fsp--;

             after(grammarAccess.getObjectAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectAttribute670); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:351:1: ruleObjectAttribute : ( ( rule__ObjectAttribute__Group__0 ) ) ;
    public final void ruleObjectAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:355:2: ( ( ( rule__ObjectAttribute__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:356:1: ( ( rule__ObjectAttribute__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:356:1: ( ( rule__ObjectAttribute__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:357:1: ( rule__ObjectAttribute__Group__0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:358:1: ( rule__ObjectAttribute__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:358:2: rule__ObjectAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__0_in_ruleObjectAttribute696);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:372:1: entryRuleObjectNode : ruleObjectNode EOF ;
    public final void entryRuleObjectNode() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:373:1: ( ruleObjectNode EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:374:1: ruleObjectNode EOF
            {
             before(grammarAccess.getObjectNodeRule()); 
            pushFollow(FOLLOW_ruleObjectNode_in_entryRuleObjectNode725);
            ruleObjectNode();

            state._fsp--;

             after(grammarAccess.getObjectNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectNode732); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:381:1: ruleObjectNode : ( ( rule__ObjectNode__Group__0 ) ) ;
    public final void ruleObjectNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:385:2: ( ( ( rule__ObjectNode__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:386:1: ( ( rule__ObjectNode__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:386:1: ( ( rule__ObjectNode__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:387:1: ( rule__ObjectNode__Group__0 )
            {
             before(grammarAccess.getObjectNodeAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:388:1: ( rule__ObjectNode__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:388:2: rule__ObjectNode__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__0_in_ruleObjectNode758);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:400:1: entryRuleObjectNext : ruleObjectNext EOF ;
    public final void entryRuleObjectNext() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:401:1: ( ruleObjectNext EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:402:1: ruleObjectNext EOF
            {
             before(grammarAccess.getObjectNextRule()); 
            pushFollow(FOLLOW_ruleObjectNext_in_entryRuleObjectNext785);
            ruleObjectNext();

            state._fsp--;

             after(grammarAccess.getObjectNextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectNext792); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:409:1: ruleObjectNext : ( ( rule__ObjectNext__Group__0 ) ) ;
    public final void ruleObjectNext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:413:2: ( ( ( rule__ObjectNext__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:414:1: ( ( rule__ObjectNext__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:414:1: ( ( rule__ObjectNext__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:415:1: ( rule__ObjectNext__Group__0 )
            {
             before(grammarAccess.getObjectNextAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:416:1: ( rule__ObjectNext__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:416:2: rule__ObjectNext__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__0_in_ruleObjectNext818);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:428:1: entryRuleJavaCodeOrID : ruleJavaCodeOrID EOF ;
    public final void entryRuleJavaCodeOrID() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:429:1: ( ruleJavaCodeOrID EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:430:1: ruleJavaCodeOrID EOF
            {
             before(grammarAccess.getJavaCodeOrIDRule()); 
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID845);
            ruleJavaCodeOrID();

            state._fsp--;

             after(grammarAccess.getJavaCodeOrIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaCodeOrID852); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:437:1: ruleJavaCodeOrID : ( ( rule__JavaCodeOrID__Alternatives ) ) ;
    public final void ruleJavaCodeOrID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:441:2: ( ( ( rule__JavaCodeOrID__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:442:1: ( ( rule__JavaCodeOrID__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:442:1: ( ( rule__JavaCodeOrID__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:443:1: ( rule__JavaCodeOrID__Alternatives )
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:444:1: ( rule__JavaCodeOrID__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:444:2: rule__JavaCodeOrID__Alternatives
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Alternatives_in_ruleJavaCodeOrID878);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:456:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:457:1: ( ruleType EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:458:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType905);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType912); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:465:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:469:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:470:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:470:1: ( ( rule__Type__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:471:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:472:1: ( rule__Type__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:472:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType938);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:484:1: entryRuleObjectMany : ruleObjectMany EOF ;
    public final void entryRuleObjectMany() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:485:1: ( ruleObjectMany EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:486:1: ruleObjectMany EOF
            {
             before(grammarAccess.getObjectManyRule()); 
            pushFollow(FOLLOW_ruleObjectMany_in_entryRuleObjectMany965);
            ruleObjectMany();

            state._fsp--;

             after(grammarAccess.getObjectManyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMany972); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:493:1: ruleObjectMany : ( ( rule__ObjectMany__Group__0 ) ) ;
    public final void ruleObjectMany() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:497:2: ( ( ( rule__ObjectMany__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:498:1: ( ( rule__ObjectMany__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:498:1: ( ( rule__ObjectMany__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:499:1: ( rule__ObjectMany__Group__0 )
            {
             before(grammarAccess.getObjectManyAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:500:1: ( rule__ObjectMany__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:500:2: rule__ObjectMany__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectMany__Group__0_in_ruleObjectMany998);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:512:1: entryRuleObjectChoice : ruleObjectChoice EOF ;
    public final void entryRuleObjectChoice() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:513:1: ( ruleObjectChoice EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:514:1: ruleObjectChoice EOF
            {
             before(grammarAccess.getObjectChoiceRule()); 
            pushFollow(FOLLOW_ruleObjectChoice_in_entryRuleObjectChoice1025);
            ruleObjectChoice();

            state._fsp--;

             after(grammarAccess.getObjectChoiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectChoice1032); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:521:1: ruleObjectChoice : ( ( rule__ObjectChoice__Group__0 ) ) ;
    public final void ruleObjectChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:525:2: ( ( ( rule__ObjectChoice__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:526:1: ( ( rule__ObjectChoice__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:526:1: ( ( rule__ObjectChoice__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:527:1: ( rule__ObjectChoice__Group__0 )
            {
             before(grammarAccess.getObjectChoiceAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:528:1: ( rule__ObjectChoice__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:528:2: rule__ObjectChoice__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__0_in_ruleObjectChoice1058);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:540:1: entryRuleObjectMaybe : ruleObjectMaybe EOF ;
    public final void entryRuleObjectMaybe() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:541:1: ( ruleObjectMaybe EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:542:1: ruleObjectMaybe EOF
            {
             before(grammarAccess.getObjectMaybeRule()); 
            pushFollow(FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe1085);
            ruleObjectMaybe();

            state._fsp--;

             after(grammarAccess.getObjectMaybeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMaybe1092); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:549:1: ruleObjectMaybe : ( ( rule__ObjectMaybe__Alternatives ) ) ;
    public final void ruleObjectMaybe() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:553:2: ( ( ( rule__ObjectMaybe__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:554:1: ( ( rule__ObjectMaybe__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:554:1: ( ( rule__ObjectMaybe__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:555:1: ( rule__ObjectMaybe__Alternatives )
            {
             before(grammarAccess.getObjectMaybeAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:556:1: ( rule__ObjectMaybe__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:556:2: rule__ObjectMaybe__Alternatives
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Alternatives_in_ruleObjectMaybe1118);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:568:1: entryRuleObjectMaybeInner : ruleObjectMaybeInner EOF ;
    public final void entryRuleObjectMaybeInner() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:569:1: ( ruleObjectMaybeInner EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:570:1: ruleObjectMaybeInner EOF
            {
             before(grammarAccess.getObjectMaybeInnerRule()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_entryRuleObjectMaybeInner1145);
            ruleObjectMaybeInner();

            state._fsp--;

             after(grammarAccess.getObjectMaybeInnerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMaybeInner1152); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:577:1: ruleObjectMaybeInner : ( ( rule__ObjectMaybeInner__Alternatives ) ) ;
    public final void ruleObjectMaybeInner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:581:2: ( ( ( rule__ObjectMaybeInner__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:582:1: ( ( rule__ObjectMaybeInner__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:582:1: ( ( rule__ObjectMaybeInner__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:583:1: ( rule__ObjectMaybeInner__Alternatives )
            {
             before(grammarAccess.getObjectMaybeInnerAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:584:1: ( rule__ObjectMaybeInner__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:584:2: rule__ObjectMaybeInner__Alternatives
            {
            pushFollow(FOLLOW_rule__ObjectMaybeInner__Alternatives_in_ruleObjectMaybeInner1178);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:598:1: rule__StartPoint__Alternatives : ( ( ( rule__StartPoint__Group_0__0 ) ) | ( ( rule__StartPoint__Group_1__0 ) ) );
    public final void rule__StartPoint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:602:1: ( ( ( rule__StartPoint__Group_0__0 ) ) | ( ( rule__StartPoint__Group_1__0 ) ) )
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
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:603:1: ( ( rule__StartPoint__Group_0__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:603:1: ( ( rule__StartPoint__Group_0__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:604:1: ( rule__StartPoint__Group_0__0 )
                    {
                     before(grammarAccess.getStartPointAccess().getGroup_0()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:605:1: ( rule__StartPoint__Group_0__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:605:2: rule__StartPoint__Group_0__0
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
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:609:6: ( ( rule__StartPoint__Group_1__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:609:6: ( ( rule__StartPoint__Group_1__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:610:1: ( rule__StartPoint__Group_1__0 )
                    {
                     before(grammarAccess.getStartPointAccess().getGroup_1()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:611:1: ( rule__StartPoint__Group_1__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:611:2: rule__StartPoint__Group_1__0
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:620:1: rule__Abstract__Alternatives : ( ( ruleObjectDescription ) | ( ruleStringDescription ) );
    public final void rule__Abstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:624:1: ( ( ruleObjectDescription ) | ( ruleStringDescription ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
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
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:625:1: ( ruleObjectDescription )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:625:1: ( ruleObjectDescription )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:626:1: ruleObjectDescription
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
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:631:6: ( ruleStringDescription )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:631:6: ( ruleStringDescription )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:632:1: ruleStringDescription
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:642:1: rule__StringDescriptionInner__Alternatives : ( ( ruleStringOverRead ) | ( ruleStringKey ) | ( ruleStringValue ) | ( ( rule__StringDescriptionInner__KeyRefAssignment_3 ) ) );
    public final void rule__StringDescriptionInner__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:646:1: ( ( ruleStringOverRead ) | ( ruleStringKey ) | ( ruleStringValue ) | ( ( rule__StringDescriptionInner__KeyRefAssignment_3 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==EOF||(LA3_2>=RULE_STRING && LA3_2<=RULE_ID)||(LA3_2>=26 && LA3_2<=27)||LA3_2==29) ) {
                    alt3=4;
                }
                else if ( (LA3_2==21) ) {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6==29) ) {
                        alt3=3;
                    }
                    else if ( (LA3_6==27) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case 29:
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
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:647:1: ( ruleStringOverRead )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:647:1: ( ruleStringOverRead )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:648:1: ruleStringOverRead
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
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:653:6: ( ruleStringKey )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:653:6: ( ruleStringKey )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:654:1: ruleStringKey
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
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:659:6: ( ruleStringValue )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:659:6: ( ruleStringValue )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:660:1: ruleStringValue
                    {
                     before(grammarAccess.getStringDescriptionInnerAccess().getStringValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__StringDescriptionInner__Alternatives1350);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getStringDescriptionInnerAccess().getStringValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:665:6: ( ( rule__StringDescriptionInner__KeyRefAssignment_3 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:665:6: ( ( rule__StringDescriptionInner__KeyRefAssignment_3 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:666:1: ( rule__StringDescriptionInner__KeyRefAssignment_3 )
                    {
                     before(grammarAccess.getStringDescriptionInnerAccess().getKeyRefAssignment_3()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:667:1: ( rule__StringDescriptionInner__KeyRefAssignment_3 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:667:2: rule__StringDescriptionInner__KeyRefAssignment_3
                    {
                    pushFollow(FOLLOW_rule__StringDescriptionInner__KeyRefAssignment_3_in_rule__StringDescriptionInner__Alternatives1367);
                    rule__StringDescriptionInner__KeyRefAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringDescriptionInnerAccess().getKeyRefAssignment_3()); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:677:1: rule__ObjectDescriptionInner__Alternatives_0 : ( ( ruleObjectNode ) | ( ruleObjectAttribute ) | ( ruleObjectNext ) | ( ruleObjectMaybe ) | ( ruleObjectMany ) | ( ruleObjectChoice ) );
    public final void rule__ObjectDescriptionInner__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:681:1: ( ( ruleObjectNode ) | ( ruleObjectAttribute ) | ( ruleObjectNext ) | ( ruleObjectMaybe ) | ( ruleObjectMany ) | ( ruleObjectChoice ) )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:682:1: ( ruleObjectNode )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:682:1: ( ruleObjectNode )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:683:1: ruleObjectNode
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectNodeParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleObjectNode_in_rule__ObjectDescriptionInner__Alternatives_01401);
                    ruleObjectNode();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectNodeParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:688:6: ( ruleObjectAttribute )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:688:6: ( ruleObjectAttribute )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:689:1: ruleObjectAttribute
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectAttributeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleObjectAttribute_in_rule__ObjectDescriptionInner__Alternatives_01418);
                    ruleObjectAttribute();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectAttributeParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:694:6: ( ruleObjectNext )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:694:6: ( ruleObjectNext )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:695:1: ruleObjectNext
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectNextParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleObjectNext_in_rule__ObjectDescriptionInner__Alternatives_01435);
                    ruleObjectNext();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectNextParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:700:6: ( ruleObjectMaybe )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:700:6: ( ruleObjectMaybe )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:701:1: ruleObjectMaybe
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectMaybeParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleObjectMaybe_in_rule__ObjectDescriptionInner__Alternatives_01452);
                    ruleObjectMaybe();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectMaybeParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:706:6: ( ruleObjectMany )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:706:6: ( ruleObjectMany )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:707:1: ruleObjectMany
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectManyParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleObjectMany_in_rule__ObjectDescriptionInner__Alternatives_01469);
                    ruleObjectMany();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectManyParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:712:6: ( ruleObjectChoice )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:712:6: ( ruleObjectChoice )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:713:1: ruleObjectChoice
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectChoiceParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_ruleObjectChoice_in_rule__ObjectDescriptionInner__Alternatives_01486);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:723:1: rule__JavaCodeOrID__Alternatives : ( ( ( rule__JavaCodeOrID__Group_0__0 ) ) | ( ( rule__JavaCodeOrID__IdAssignment_1 ) ) );
    public final void rule__JavaCodeOrID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:727:1: ( ( ( rule__JavaCodeOrID__Group_0__0 ) ) | ( ( rule__JavaCodeOrID__IdAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
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
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:728:1: ( ( rule__JavaCodeOrID__Group_0__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:728:1: ( ( rule__JavaCodeOrID__Group_0__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:729:1: ( rule__JavaCodeOrID__Group_0__0 )
                    {
                     before(grammarAccess.getJavaCodeOrIDAccess().getGroup_0()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:730:1: ( rule__JavaCodeOrID__Group_0__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:730:2: rule__JavaCodeOrID__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__0_in_rule__JavaCodeOrID__Alternatives1518);
                    rule__JavaCodeOrID__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJavaCodeOrIDAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:734:6: ( ( rule__JavaCodeOrID__IdAssignment_1 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:734:6: ( ( rule__JavaCodeOrID__IdAssignment_1 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:735:1: ( rule__JavaCodeOrID__IdAssignment_1 )
                    {
                     before(grammarAccess.getJavaCodeOrIDAccess().getIdAssignment_1()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:736:1: ( rule__JavaCodeOrID__IdAssignment_1 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:736:2: rule__JavaCodeOrID__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JavaCodeOrID__IdAssignment_1_in_rule__JavaCodeOrID__Alternatives1536);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:745:1: rule__Type__Alternatives : ( ( 'boolean' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'char' ) | ( 'String' ) | ( 'byte' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:749:1: ( ( 'boolean' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'char' ) | ( 'String' ) | ( 'byte' ) )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            case 15:
                {
                alt6=5;
                }
                break;
            case 16:
                {
                alt6=6;
                }
                break;
            case 17:
                {
                alt6=7;
                }
                break;
            case 18:
                {
                alt6=8;
                }
                break;
            case 19:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:750:1: ( 'boolean' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:750:1: ( 'boolean' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:751:1: 'boolean'
                    {
                     before(grammarAccess.getTypeAccess().getBooleanKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Type__Alternatives1570); 
                     after(grammarAccess.getTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:758:6: ( 'short' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:758:6: ( 'short' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:759:1: 'short'
                    {
                     before(grammarAccess.getTypeAccess().getShortKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Type__Alternatives1590); 
                     after(grammarAccess.getTypeAccess().getShortKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:766:6: ( 'int' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:766:6: ( 'int' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:767:1: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Type__Alternatives1610); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:774:6: ( 'long' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:774:6: ( 'long' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:775:1: 'long'
                    {
                     before(grammarAccess.getTypeAccess().getLongKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Type__Alternatives1630); 
                     after(grammarAccess.getTypeAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:782:6: ( 'float' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:782:6: ( 'float' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:783:1: 'float'
                    {
                     before(grammarAccess.getTypeAccess().getFloatKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__Type__Alternatives1650); 
                     after(grammarAccess.getTypeAccess().getFloatKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:790:6: ( 'double' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:790:6: ( 'double' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:791:1: 'double'
                    {
                     before(grammarAccess.getTypeAccess().getDoubleKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__Type__Alternatives1670); 
                     after(grammarAccess.getTypeAccess().getDoubleKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:798:6: ( 'char' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:798:6: ( 'char' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:799:1: 'char'
                    {
                     before(grammarAccess.getTypeAccess().getCharKeyword_6()); 
                    match(input,17,FOLLOW_17_in_rule__Type__Alternatives1690); 
                     after(grammarAccess.getTypeAccess().getCharKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:806:6: ( 'String' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:806:6: ( 'String' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:807:1: 'String'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_7()); 
                    match(input,18,FOLLOW_18_in_rule__Type__Alternatives1710); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:814:6: ( 'byte' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:814:6: ( 'byte' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:815:1: 'byte'
                    {
                     before(grammarAccess.getTypeAccess().getByteKeyword_8()); 
                    match(input,19,FOLLOW_19_in_rule__Type__Alternatives1730); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:827:1: rule__ObjectMaybe__Alternatives : ( ( ( rule__ObjectMaybe__OptionAssignment_0 ) ) | ( ( rule__ObjectMaybe__Group_1__0 ) ) );
    public final void rule__ObjectMaybe__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:831:1: ( ( ( rule__ObjectMaybe__OptionAssignment_0 ) ) | ( ( rule__ObjectMaybe__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==32||(LA7_0>=34 && LA7_0<=35)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:832:1: ( ( rule__ObjectMaybe__OptionAssignment_0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:832:1: ( ( rule__ObjectMaybe__OptionAssignment_0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:833:1: ( rule__ObjectMaybe__OptionAssignment_0 )
                    {
                     before(grammarAccess.getObjectMaybeAccess().getOptionAssignment_0()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:834:1: ( rule__ObjectMaybe__OptionAssignment_0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:834:2: rule__ObjectMaybe__OptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ObjectMaybe__OptionAssignment_0_in_rule__ObjectMaybe__Alternatives1764);
                    rule__ObjectMaybe__OptionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectMaybeAccess().getOptionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:838:6: ( ( rule__ObjectMaybe__Group_1__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:838:6: ( ( rule__ObjectMaybe__Group_1__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:839:1: ( rule__ObjectMaybe__Group_1__0 )
                    {
                     before(grammarAccess.getObjectMaybeAccess().getGroup_1()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:840:1: ( rule__ObjectMaybe__Group_1__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:840:2: rule__ObjectMaybe__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__0_in_rule__ObjectMaybe__Alternatives1782);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:849:1: rule__ObjectMaybeInner__Alternatives : ( ( ruleObjectNext ) | ( ruleObjectNode ) | ( ruleObjectAttribute ) );
    public final void rule__ObjectMaybeInner__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:853:1: ( ( ruleObjectNext ) | ( ruleObjectNode ) | ( ruleObjectAttribute ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case 32:
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
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:854:1: ( ruleObjectNext )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:854:1: ( ruleObjectNext )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:855:1: ruleObjectNext
                    {
                     before(grammarAccess.getObjectMaybeInnerAccess().getObjectNextParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleObjectNext_in_rule__ObjectMaybeInner__Alternatives1815);
                    ruleObjectNext();

                    state._fsp--;

                     after(grammarAccess.getObjectMaybeInnerAccess().getObjectNextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:860:6: ( ruleObjectNode )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:860:6: ( ruleObjectNode )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:861:1: ruleObjectNode
                    {
                     before(grammarAccess.getObjectMaybeInnerAccess().getObjectNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleObjectNode_in_rule__ObjectMaybeInner__Alternatives1832);
                    ruleObjectNode();

                    state._fsp--;

                     after(grammarAccess.getObjectMaybeInnerAccess().getObjectNodeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:866:6: ( ruleObjectAttribute )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:866:6: ( ruleObjectAttribute )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:867:1: ruleObjectAttribute
                    {
                     before(grammarAccess.getObjectMaybeInnerAccess().getObjectAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleObjectAttribute_in_rule__ObjectMaybeInner__Alternatives1849);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:880:1: rule__DTDSL__Group__0 : rule__DTDSL__Group__0__Impl rule__DTDSL__Group__1 ;
    public final void rule__DTDSL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:884:1: ( rule__DTDSL__Group__0__Impl rule__DTDSL__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:885:2: rule__DTDSL__Group__0__Impl rule__DTDSL__Group__1
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__0__Impl_in_rule__DTDSL__Group__01880);
            rule__DTDSL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__1_in_rule__DTDSL__Group__01883);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:892:1: rule__DTDSL__Group__0__Impl : ( 'parserName' ) ;
    public final void rule__DTDSL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:896:1: ( ( 'parserName' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:897:1: ( 'parserName' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:897:1: ( 'parserName' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:898:1: 'parserName'
            {
             before(grammarAccess.getDTDSLAccess().getParserNameKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__DTDSL__Group__0__Impl1911); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:911:1: rule__DTDSL__Group__1 : rule__DTDSL__Group__1__Impl rule__DTDSL__Group__2 ;
    public final void rule__DTDSL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:915:1: ( rule__DTDSL__Group__1__Impl rule__DTDSL__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:916:2: rule__DTDSL__Group__1__Impl rule__DTDSL__Group__2
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__1__Impl_in_rule__DTDSL__Group__11942);
            rule__DTDSL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__2_in_rule__DTDSL__Group__11945);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:923:1: rule__DTDSL__Group__1__Impl : ( '=' ) ;
    public final void rule__DTDSL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:927:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:928:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:928:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:929:1: '='
            {
             before(grammarAccess.getDTDSLAccess().getEqualsSignKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__DTDSL__Group__1__Impl1973); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:942:1: rule__DTDSL__Group__2 : rule__DTDSL__Group__2__Impl rule__DTDSL__Group__3 ;
    public final void rule__DTDSL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:946:1: ( rule__DTDSL__Group__2__Impl rule__DTDSL__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:947:2: rule__DTDSL__Group__2__Impl rule__DTDSL__Group__3
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__2__Impl_in_rule__DTDSL__Group__22004);
            rule__DTDSL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__3_in_rule__DTDSL__Group__22007);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:954:1: rule__DTDSL__Group__2__Impl : ( ( rule__DTDSL__ParserNameAssignment_2 ) ) ;
    public final void rule__DTDSL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:958:1: ( ( ( rule__DTDSL__ParserNameAssignment_2 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:959:1: ( ( rule__DTDSL__ParserNameAssignment_2 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:959:1: ( ( rule__DTDSL__ParserNameAssignment_2 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:960:1: ( rule__DTDSL__ParserNameAssignment_2 )
            {
             before(grammarAccess.getDTDSLAccess().getParserNameAssignment_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:961:1: ( rule__DTDSL__ParserNameAssignment_2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:961:2: rule__DTDSL__ParserNameAssignment_2
            {
            pushFollow(FOLLOW_rule__DTDSL__ParserNameAssignment_2_in_rule__DTDSL__Group__2__Impl2034);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:971:1: rule__DTDSL__Group__3 : rule__DTDSL__Group__3__Impl rule__DTDSL__Group__4 ;
    public final void rule__DTDSL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:975:1: ( rule__DTDSL__Group__3__Impl rule__DTDSL__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:976:2: rule__DTDSL__Group__3__Impl rule__DTDSL__Group__4
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__3__Impl_in_rule__DTDSL__Group__32064);
            rule__DTDSL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__4_in_rule__DTDSL__Group__32067);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:983:1: rule__DTDSL__Group__3__Impl : ( ';' ) ;
    public final void rule__DTDSL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:987:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:988:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:988:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:989:1: ';'
            {
             before(grammarAccess.getDTDSLAccess().getSemicolonKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__DTDSL__Group__3__Impl2095); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1002:1: rule__DTDSL__Group__4 : rule__DTDSL__Group__4__Impl rule__DTDSL__Group__5 ;
    public final void rule__DTDSL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1006:1: ( rule__DTDSL__Group__4__Impl rule__DTDSL__Group__5 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1007:2: rule__DTDSL__Group__4__Impl rule__DTDSL__Group__5
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__4__Impl_in_rule__DTDSL__Group__42126);
            rule__DTDSL__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__5_in_rule__DTDSL__Group__42129);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1014:1: rule__DTDSL__Group__4__Impl : ( ( rule__DTDSL__ObjDescriptionAssignment_4 )* ) ;
    public final void rule__DTDSL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1018:1: ( ( ( rule__DTDSL__ObjDescriptionAssignment_4 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1019:1: ( ( rule__DTDSL__ObjDescriptionAssignment_4 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1019:1: ( ( rule__DTDSL__ObjDescriptionAssignment_4 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1020:1: ( rule__DTDSL__ObjDescriptionAssignment_4 )*
            {
             before(grammarAccess.getDTDSLAccess().getObjDescriptionAssignment_4()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1021:1: ( rule__DTDSL__ObjDescriptionAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18||LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1021:2: rule__DTDSL__ObjDescriptionAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__DTDSL__ObjDescriptionAssignment_4_in_rule__DTDSL__Group__4__Impl2156);
            	    rule__DTDSL__ObjDescriptionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1031:1: rule__DTDSL__Group__5 : rule__DTDSL__Group__5__Impl ;
    public final void rule__DTDSL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1035:1: ( rule__DTDSL__Group__5__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1036:2: rule__DTDSL__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__5__Impl_in_rule__DTDSL__Group__52187);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1042:1: rule__DTDSL__Group__5__Impl : ( ( rule__DTDSL__StartAssignment_5 ) ) ;
    public final void rule__DTDSL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1046:1: ( ( ( rule__DTDSL__StartAssignment_5 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1047:1: ( ( rule__DTDSL__StartAssignment_5 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1047:1: ( ( rule__DTDSL__StartAssignment_5 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1048:1: ( rule__DTDSL__StartAssignment_5 )
            {
             before(grammarAccess.getDTDSLAccess().getStartAssignment_5()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1049:1: ( rule__DTDSL__StartAssignment_5 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1049:2: rule__DTDSL__StartAssignment_5
            {
            pushFollow(FOLLOW_rule__DTDSL__StartAssignment_5_in_rule__DTDSL__Group__5__Impl2214);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1071:1: rule__StartPoint__Group_0__0 : rule__StartPoint__Group_0__0__Impl rule__StartPoint__Group_0__1 ;
    public final void rule__StartPoint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1075:1: ( rule__StartPoint__Group_0__0__Impl rule__StartPoint__Group_0__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1076:2: rule__StartPoint__Group_0__0__Impl rule__StartPoint__Group_0__1
            {
            pushFollow(FOLLOW_rule__StartPoint__Group_0__0__Impl_in_rule__StartPoint__Group_0__02256);
            rule__StartPoint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartPoint__Group_0__1_in_rule__StartPoint__Group_0__02259);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1083:1: rule__StartPoint__Group_0__0__Impl : ( 'beginWith' ) ;
    public final void rule__StartPoint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1087:1: ( ( 'beginWith' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1088:1: ( 'beginWith' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1088:1: ( 'beginWith' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1089:1: 'beginWith'
            {
             before(grammarAccess.getStartPointAccess().getBeginWithKeyword_0_0()); 
            match(input,23,FOLLOW_23_in_rule__StartPoint__Group_0__0__Impl2287); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1102:1: rule__StartPoint__Group_0__1 : rule__StartPoint__Group_0__1__Impl rule__StartPoint__Group_0__2 ;
    public final void rule__StartPoint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1106:1: ( rule__StartPoint__Group_0__1__Impl rule__StartPoint__Group_0__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1107:2: rule__StartPoint__Group_0__1__Impl rule__StartPoint__Group_0__2
            {
            pushFollow(FOLLOW_rule__StartPoint__Group_0__1__Impl_in_rule__StartPoint__Group_0__12318);
            rule__StartPoint__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartPoint__Group_0__2_in_rule__StartPoint__Group_0__12321);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1114:1: rule__StartPoint__Group_0__1__Impl : ( '=' ) ;
    public final void rule__StartPoint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1118:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1119:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1119:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1120:1: '='
            {
             before(grammarAccess.getStartPointAccess().getEqualsSignKeyword_0_1()); 
            match(input,21,FOLLOW_21_in_rule__StartPoint__Group_0__1__Impl2349); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1133:1: rule__StartPoint__Group_0__2 : rule__StartPoint__Group_0__2__Impl ;
    public final void rule__StartPoint__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1137:1: ( rule__StartPoint__Group_0__2__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1138:2: rule__StartPoint__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__StartPoint__Group_0__2__Impl_in_rule__StartPoint__Group_0__22380);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1144:1: rule__StartPoint__Group_0__2__Impl : ( ( rule__StartPoint__BeginAssignment_0_2 ) ) ;
    public final void rule__StartPoint__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1148:1: ( ( ( rule__StartPoint__BeginAssignment_0_2 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1149:1: ( ( rule__StartPoint__BeginAssignment_0_2 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1149:1: ( ( rule__StartPoint__BeginAssignment_0_2 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1150:1: ( rule__StartPoint__BeginAssignment_0_2 )
            {
             before(grammarAccess.getStartPointAccess().getBeginAssignment_0_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1151:1: ( rule__StartPoint__BeginAssignment_0_2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1151:2: rule__StartPoint__BeginAssignment_0_2
            {
            pushFollow(FOLLOW_rule__StartPoint__BeginAssignment_0_2_in_rule__StartPoint__Group_0__2__Impl2407);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1167:1: rule__StartPoint__Group_1__0 : rule__StartPoint__Group_1__0__Impl rule__StartPoint__Group_1__1 ;
    public final void rule__StartPoint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1171:1: ( rule__StartPoint__Group_1__0__Impl rule__StartPoint__Group_1__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1172:2: rule__StartPoint__Group_1__0__Impl rule__StartPoint__Group_1__1
            {
            pushFollow(FOLLOW_rule__StartPoint__Group_1__0__Impl_in_rule__StartPoint__Group_1__02443);
            rule__StartPoint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartPoint__Group_1__1_in_rule__StartPoint__Group_1__02446);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1179:1: rule__StartPoint__Group_1__0__Impl : ( ( rule__StartPoint__BeginAssignment_1_0 ) ) ;
    public final void rule__StartPoint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1183:1: ( ( ( rule__StartPoint__BeginAssignment_1_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1184:1: ( ( rule__StartPoint__BeginAssignment_1_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1184:1: ( ( rule__StartPoint__BeginAssignment_1_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1185:1: ( rule__StartPoint__BeginAssignment_1_0 )
            {
             before(grammarAccess.getStartPointAccess().getBeginAssignment_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1186:1: ( rule__StartPoint__BeginAssignment_1_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1186:2: rule__StartPoint__BeginAssignment_1_0
            {
            pushFollow(FOLLOW_rule__StartPoint__BeginAssignment_1_0_in_rule__StartPoint__Group_1__0__Impl2473);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1196:1: rule__StartPoint__Group_1__1 : rule__StartPoint__Group_1__1__Impl ;
    public final void rule__StartPoint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1200:1: ( rule__StartPoint__Group_1__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1201:2: rule__StartPoint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__StartPoint__Group_1__1__Impl_in_rule__StartPoint__Group_1__12503);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1207:1: rule__StartPoint__Group_1__1__Impl : ( ';' ) ;
    public final void rule__StartPoint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1211:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1212:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1212:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1213:1: ';'
            {
             before(grammarAccess.getStartPointAccess().getSemicolonKeyword_1_1()); 
            match(input,22,FOLLOW_22_in_rule__StartPoint__Group_1__1__Impl2531); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1230:1: rule__StringDescription__Group__0 : rule__StringDescription__Group__0__Impl rule__StringDescription__Group__1 ;
    public final void rule__StringDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1234:1: ( rule__StringDescription__Group__0__Impl rule__StringDescription__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1235:2: rule__StringDescription__Group__0__Impl rule__StringDescription__Group__1
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__0__Impl_in_rule__StringDescription__Group__02566);
            rule__StringDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__1_in_rule__StringDescription__Group__02569);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1242:1: rule__StringDescription__Group__0__Impl : ( 'String' ) ;
    public final void rule__StringDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1246:1: ( ( 'String' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1247:1: ( 'String' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1247:1: ( 'String' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1248:1: 'String'
            {
             before(grammarAccess.getStringDescriptionAccess().getStringKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__StringDescription__Group__0__Impl2597); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1261:1: rule__StringDescription__Group__1 : rule__StringDescription__Group__1__Impl rule__StringDescription__Group__2 ;
    public final void rule__StringDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1265:1: ( rule__StringDescription__Group__1__Impl rule__StringDescription__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1266:2: rule__StringDescription__Group__1__Impl rule__StringDescription__Group__2
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__1__Impl_in_rule__StringDescription__Group__12628);
            rule__StringDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__2_in_rule__StringDescription__Group__12631);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1273:1: rule__StringDescription__Group__1__Impl : ( ( rule__StringDescription__NameAssignment_1 ) ) ;
    public final void rule__StringDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1277:1: ( ( ( rule__StringDescription__NameAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1278:1: ( ( rule__StringDescription__NameAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1278:1: ( ( rule__StringDescription__NameAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1279:1: ( rule__StringDescription__NameAssignment_1 )
            {
             before(grammarAccess.getStringDescriptionAccess().getNameAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1280:1: ( rule__StringDescription__NameAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1280:2: rule__StringDescription__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StringDescription__NameAssignment_1_in_rule__StringDescription__Group__1__Impl2658);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1290:1: rule__StringDescription__Group__2 : rule__StringDescription__Group__2__Impl rule__StringDescription__Group__3 ;
    public final void rule__StringDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1294:1: ( rule__StringDescription__Group__2__Impl rule__StringDescription__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1295:2: rule__StringDescription__Group__2__Impl rule__StringDescription__Group__3
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__2__Impl_in_rule__StringDescription__Group__22688);
            rule__StringDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__3_in_rule__StringDescription__Group__22691);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1302:1: rule__StringDescription__Group__2__Impl : ( ':' ) ;
    public final void rule__StringDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1306:1: ( ( ':' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1307:1: ( ':' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1307:1: ( ':' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1308:1: ':'
            {
             before(grammarAccess.getStringDescriptionAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__StringDescription__Group__2__Impl2719); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1321:1: rule__StringDescription__Group__3 : rule__StringDescription__Group__3__Impl rule__StringDescription__Group__4 ;
    public final void rule__StringDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1325:1: ( rule__StringDescription__Group__3__Impl rule__StringDescription__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1326:2: rule__StringDescription__Group__3__Impl rule__StringDescription__Group__4
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__3__Impl_in_rule__StringDescription__Group__32750);
            rule__StringDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__4_in_rule__StringDescription__Group__32753);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1333:1: rule__StringDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__StringDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1337:1: ( ( '{' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1338:1: ( '{' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1338:1: ( '{' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1339:1: '{'
            {
             before(grammarAccess.getStringDescriptionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__StringDescription__Group__3__Impl2781); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1352:1: rule__StringDescription__Group__4 : rule__StringDescription__Group__4__Impl rule__StringDescription__Group__5 ;
    public final void rule__StringDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1356:1: ( rule__StringDescription__Group__4__Impl rule__StringDescription__Group__5 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1357:2: rule__StringDescription__Group__4__Impl rule__StringDescription__Group__5
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__4__Impl_in_rule__StringDescription__Group__42812);
            rule__StringDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__5_in_rule__StringDescription__Group__42815);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1364:1: rule__StringDescription__Group__4__Impl : ( ( rule__StringDescription__DescriptionAssignment_4 )* ) ;
    public final void rule__StringDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1368:1: ( ( ( rule__StringDescription__DescriptionAssignment_4 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1369:1: ( ( rule__StringDescription__DescriptionAssignment_4 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1369:1: ( ( rule__StringDescription__DescriptionAssignment_4 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1370:1: ( rule__StringDescription__DescriptionAssignment_4 )*
            {
             before(grammarAccess.getStringDescriptionAccess().getDescriptionAssignment_4()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1371:1: ( rule__StringDescription__DescriptionAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||LA10_0==27||LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1371:2: rule__StringDescription__DescriptionAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__StringDescription__DescriptionAssignment_4_in_rule__StringDescription__Group__4__Impl2842);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1381:1: rule__StringDescription__Group__5 : rule__StringDescription__Group__5__Impl ;
    public final void rule__StringDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1385:1: ( rule__StringDescription__Group__5__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1386:2: rule__StringDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__5__Impl_in_rule__StringDescription__Group__52873);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1392:1: rule__StringDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__StringDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1396:1: ( ( '}' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1397:1: ( '}' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1397:1: ( '}' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1398:1: '}'
            {
             before(grammarAccess.getStringDescriptionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__StringDescription__Group__5__Impl2901); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1423:1: rule__StringKey__Group__0 : rule__StringKey__Group__0__Impl rule__StringKey__Group__1 ;
    public final void rule__StringKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1427:1: ( rule__StringKey__Group__0__Impl rule__StringKey__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1428:2: rule__StringKey__Group__0__Impl rule__StringKey__Group__1
            {
            pushFollow(FOLLOW_rule__StringKey__Group__0__Impl_in_rule__StringKey__Group__02944);
            rule__StringKey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringKey__Group__1_in_rule__StringKey__Group__02947);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1435:1: rule__StringKey__Group__0__Impl : ( () ) ;
    public final void rule__StringKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1439:1: ( ( () ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1440:1: ( () )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1440:1: ( () )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1441:1: ()
            {
             before(grammarAccess.getStringKeyAccess().getStringKeyAction_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1442:1: ()
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1444:1: 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1454:1: rule__StringKey__Group__1 : rule__StringKey__Group__1__Impl rule__StringKey__Group__2 ;
    public final void rule__StringKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1458:1: ( rule__StringKey__Group__1__Impl rule__StringKey__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1459:2: rule__StringKey__Group__1__Impl rule__StringKey__Group__2
            {
            pushFollow(FOLLOW_rule__StringKey__Group__1__Impl_in_rule__StringKey__Group__13005);
            rule__StringKey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringKey__Group__2_in_rule__StringKey__Group__13008);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1466:1: rule__StringKey__Group__1__Impl : ( ( rule__StringKey__Group_1__0 )? ) ;
    public final void rule__StringKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1470:1: ( ( ( rule__StringKey__Group_1__0 )? ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1471:1: ( ( rule__StringKey__Group_1__0 )? )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1471:1: ( ( rule__StringKey__Group_1__0 )? )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1472:1: ( rule__StringKey__Group_1__0 )?
            {
             before(grammarAccess.getStringKeyAccess().getGroup_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1473:1: ( rule__StringKey__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1473:2: rule__StringKey__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StringKey__Group_1__0_in_rule__StringKey__Group__1__Impl3035);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1483:1: rule__StringKey__Group__2 : rule__StringKey__Group__2__Impl rule__StringKey__Group__3 ;
    public final void rule__StringKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1487:1: ( rule__StringKey__Group__2__Impl rule__StringKey__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1488:2: rule__StringKey__Group__2__Impl rule__StringKey__Group__3
            {
            pushFollow(FOLLOW_rule__StringKey__Group__2__Impl_in_rule__StringKey__Group__23066);
            rule__StringKey__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringKey__Group__3_in_rule__StringKey__Group__23069);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1495:1: rule__StringKey__Group__2__Impl : ( 'Key' ) ;
    public final void rule__StringKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1499:1: ( ( 'Key' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1500:1: ( 'Key' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1500:1: ( 'Key' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1501:1: 'Key'
            {
             before(grammarAccess.getStringKeyAccess().getKeyKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__StringKey__Group__2__Impl3097); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1514:1: rule__StringKey__Group__3 : rule__StringKey__Group__3__Impl rule__StringKey__Group__4 ;
    public final void rule__StringKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1518:1: ( rule__StringKey__Group__3__Impl rule__StringKey__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1519:2: rule__StringKey__Group__3__Impl rule__StringKey__Group__4
            {
            pushFollow(FOLLOW_rule__StringKey__Group__3__Impl_in_rule__StringKey__Group__33128);
            rule__StringKey__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringKey__Group__4_in_rule__StringKey__Group__33131);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1526:1: rule__StringKey__Group__3__Impl : ( 'ofType' ) ;
    public final void rule__StringKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1530:1: ( ( 'ofType' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1531:1: ( 'ofType' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1531:1: ( 'ofType' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1532:1: 'ofType'
            {
             before(grammarAccess.getStringKeyAccess().getOfTypeKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__StringKey__Group__3__Impl3159); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1545:1: rule__StringKey__Group__4 : rule__StringKey__Group__4__Impl ;
    public final void rule__StringKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1549:1: ( rule__StringKey__Group__4__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1550:2: rule__StringKey__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StringKey__Group__4__Impl_in_rule__StringKey__Group__43190);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1556:1: rule__StringKey__Group__4__Impl : ( ( rule__StringKey__TypeAssignment_4 ) ) ;
    public final void rule__StringKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1560:1: ( ( ( rule__StringKey__TypeAssignment_4 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1561:1: ( ( rule__StringKey__TypeAssignment_4 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1561:1: ( ( rule__StringKey__TypeAssignment_4 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1562:1: ( rule__StringKey__TypeAssignment_4 )
            {
             before(grammarAccess.getStringKeyAccess().getTypeAssignment_4()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1563:1: ( rule__StringKey__TypeAssignment_4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1563:2: rule__StringKey__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__StringKey__TypeAssignment_4_in_rule__StringKey__Group__4__Impl3217);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1583:1: rule__StringKey__Group_1__0 : rule__StringKey__Group_1__0__Impl rule__StringKey__Group_1__1 ;
    public final void rule__StringKey__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1587:1: ( rule__StringKey__Group_1__0__Impl rule__StringKey__Group_1__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1588:2: rule__StringKey__Group_1__0__Impl rule__StringKey__Group_1__1
            {
            pushFollow(FOLLOW_rule__StringKey__Group_1__0__Impl_in_rule__StringKey__Group_1__03257);
            rule__StringKey__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringKey__Group_1__1_in_rule__StringKey__Group_1__03260);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1595:1: rule__StringKey__Group_1__0__Impl : ( ( rule__StringKey__NameAssignment_1_0 ) ) ;
    public final void rule__StringKey__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1599:1: ( ( ( rule__StringKey__NameAssignment_1_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1600:1: ( ( rule__StringKey__NameAssignment_1_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1600:1: ( ( rule__StringKey__NameAssignment_1_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1601:1: ( rule__StringKey__NameAssignment_1_0 )
            {
             before(grammarAccess.getStringKeyAccess().getNameAssignment_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1602:1: ( rule__StringKey__NameAssignment_1_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1602:2: rule__StringKey__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__StringKey__NameAssignment_1_0_in_rule__StringKey__Group_1__0__Impl3287);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1612:1: rule__StringKey__Group_1__1 : rule__StringKey__Group_1__1__Impl ;
    public final void rule__StringKey__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1616:1: ( rule__StringKey__Group_1__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1617:2: rule__StringKey__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__StringKey__Group_1__1__Impl_in_rule__StringKey__Group_1__13317);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1623:1: rule__StringKey__Group_1__1__Impl : ( '=' ) ;
    public final void rule__StringKey__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1627:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1628:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1628:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1629:1: '='
            {
             before(grammarAccess.getStringKeyAccess().getEqualsSignKeyword_1_1()); 
            match(input,21,FOLLOW_21_in_rule__StringKey__Group_1__1__Impl3345); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1646:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1650:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1651:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FOLLOW_rule__StringValue__Group__0__Impl_in_rule__StringValue__Group__03380);
            rule__StringValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringValue__Group__1_in_rule__StringValue__Group__03383);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1658:1: rule__StringValue__Group__0__Impl : ( () ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1662:1: ( ( () ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1663:1: ( () )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1663:1: ( () )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1664:1: ()
            {
             before(grammarAccess.getStringValueAccess().getStringValueAction_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1665:1: ()
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1667:1: 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1677:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl rule__StringValue__Group__2 ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1681:1: ( rule__StringValue__Group__1__Impl rule__StringValue__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1682:2: rule__StringValue__Group__1__Impl rule__StringValue__Group__2
            {
            pushFollow(FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__13441);
            rule__StringValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringValue__Group__2_in_rule__StringValue__Group__13444);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1689:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__Group_1__0 )? ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1693:1: ( ( ( rule__StringValue__Group_1__0 )? ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1694:1: ( ( rule__StringValue__Group_1__0 )? )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1694:1: ( ( rule__StringValue__Group_1__0 )? )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1695:1: ( rule__StringValue__Group_1__0 )?
            {
             before(grammarAccess.getStringValueAccess().getGroup_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1696:1: ( rule__StringValue__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1696:2: rule__StringValue__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StringValue__Group_1__0_in_rule__StringValue__Group__1__Impl3471);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1706:1: rule__StringValue__Group__2 : rule__StringValue__Group__2__Impl rule__StringValue__Group__3 ;
    public final void rule__StringValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1710:1: ( rule__StringValue__Group__2__Impl rule__StringValue__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1711:2: rule__StringValue__Group__2__Impl rule__StringValue__Group__3
            {
            pushFollow(FOLLOW_rule__StringValue__Group__2__Impl_in_rule__StringValue__Group__23502);
            rule__StringValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringValue__Group__3_in_rule__StringValue__Group__23505);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1718:1: rule__StringValue__Group__2__Impl : ( 'Value' ) ;
    public final void rule__StringValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1722:1: ( ( 'Value' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1723:1: ( 'Value' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1723:1: ( 'Value' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1724:1: 'Value'
            {
             before(grammarAccess.getStringValueAccess().getValueKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__StringValue__Group__2__Impl3533); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1737:1: rule__StringValue__Group__3 : rule__StringValue__Group__3__Impl rule__StringValue__Group__4 ;
    public final void rule__StringValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1741:1: ( rule__StringValue__Group__3__Impl rule__StringValue__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1742:2: rule__StringValue__Group__3__Impl rule__StringValue__Group__4
            {
            pushFollow(FOLLOW_rule__StringValue__Group__3__Impl_in_rule__StringValue__Group__33564);
            rule__StringValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringValue__Group__4_in_rule__StringValue__Group__33567);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1749:1: rule__StringValue__Group__3__Impl : ( 'ofType' ) ;
    public final void rule__StringValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1753:1: ( ( 'ofType' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1754:1: ( 'ofType' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1754:1: ( 'ofType' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1755:1: 'ofType'
            {
             before(grammarAccess.getStringValueAccess().getOfTypeKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__StringValue__Group__3__Impl3595); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1768:1: rule__StringValue__Group__4 : rule__StringValue__Group__4__Impl rule__StringValue__Group__5 ;
    public final void rule__StringValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1772:1: ( rule__StringValue__Group__4__Impl rule__StringValue__Group__5 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1773:2: rule__StringValue__Group__4__Impl rule__StringValue__Group__5
            {
            pushFollow(FOLLOW_rule__StringValue__Group__4__Impl_in_rule__StringValue__Group__43626);
            rule__StringValue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringValue__Group__5_in_rule__StringValue__Group__43629);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1780:1: rule__StringValue__Group__4__Impl : ( ( rule__StringValue__TypeAssignment_4 ) ) ;
    public final void rule__StringValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1784:1: ( ( ( rule__StringValue__TypeAssignment_4 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1785:1: ( ( rule__StringValue__TypeAssignment_4 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1785:1: ( ( rule__StringValue__TypeAssignment_4 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1786:1: ( rule__StringValue__TypeAssignment_4 )
            {
             before(grammarAccess.getStringValueAccess().getTypeAssignment_4()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1787:1: ( rule__StringValue__TypeAssignment_4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1787:2: rule__StringValue__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__StringValue__TypeAssignment_4_in_rule__StringValue__Group__4__Impl3656);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1797:1: rule__StringValue__Group__5 : rule__StringValue__Group__5__Impl ;
    public final void rule__StringValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1801:1: ( rule__StringValue__Group__5__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1802:2: rule__StringValue__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__StringValue__Group__5__Impl_in_rule__StringValue__Group__53686);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1808:1: rule__StringValue__Group__5__Impl : ( ( rule__StringValue__Group_5__0 )? ) ;
    public final void rule__StringValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1812:1: ( ( ( rule__StringValue__Group_5__0 )? ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1813:1: ( ( rule__StringValue__Group_5__0 )? )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1813:1: ( ( rule__StringValue__Group_5__0 )? )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1814:1: ( rule__StringValue__Group_5__0 )?
            {
             before(grammarAccess.getStringValueAccess().getGroup_5()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1815:1: ( rule__StringValue__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1815:2: rule__StringValue__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__StringValue__Group_5__0_in_rule__StringValue__Group__5__Impl3713);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1837:1: rule__StringValue__Group_1__0 : rule__StringValue__Group_1__0__Impl rule__StringValue__Group_1__1 ;
    public final void rule__StringValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1841:1: ( rule__StringValue__Group_1__0__Impl rule__StringValue__Group_1__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1842:2: rule__StringValue__Group_1__0__Impl rule__StringValue__Group_1__1
            {
            pushFollow(FOLLOW_rule__StringValue__Group_1__0__Impl_in_rule__StringValue__Group_1__03756);
            rule__StringValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringValue__Group_1__1_in_rule__StringValue__Group_1__03759);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1849:1: rule__StringValue__Group_1__0__Impl : ( ( rule__StringValue__NameAssignment_1_0 ) ) ;
    public final void rule__StringValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1853:1: ( ( ( rule__StringValue__NameAssignment_1_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1854:1: ( ( rule__StringValue__NameAssignment_1_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1854:1: ( ( rule__StringValue__NameAssignment_1_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1855:1: ( rule__StringValue__NameAssignment_1_0 )
            {
             before(grammarAccess.getStringValueAccess().getNameAssignment_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1856:1: ( rule__StringValue__NameAssignment_1_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1856:2: rule__StringValue__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__StringValue__NameAssignment_1_0_in_rule__StringValue__Group_1__0__Impl3786);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1866:1: rule__StringValue__Group_1__1 : rule__StringValue__Group_1__1__Impl ;
    public final void rule__StringValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1870:1: ( rule__StringValue__Group_1__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1871:2: rule__StringValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__StringValue__Group_1__1__Impl_in_rule__StringValue__Group_1__13816);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1877:1: rule__StringValue__Group_1__1__Impl : ( '=' ) ;
    public final void rule__StringValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1881:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1882:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1882:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1883:1: '='
            {
             before(grammarAccess.getStringValueAccess().getEqualsSignKeyword_1_1()); 
            match(input,21,FOLLOW_21_in_rule__StringValue__Group_1__1__Impl3844); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1900:1: rule__StringValue__Group_5__0 : rule__StringValue__Group_5__0__Impl rule__StringValue__Group_5__1 ;
    public final void rule__StringValue__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1904:1: ( rule__StringValue__Group_5__0__Impl rule__StringValue__Group_5__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1905:2: rule__StringValue__Group_5__0__Impl rule__StringValue__Group_5__1
            {
            pushFollow(FOLLOW_rule__StringValue__Group_5__0__Impl_in_rule__StringValue__Group_5__03879);
            rule__StringValue__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringValue__Group_5__1_in_rule__StringValue__Group_5__03882);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1912:1: rule__StringValue__Group_5__0__Impl : ( 'to' ) ;
    public final void rule__StringValue__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1916:1: ( ( 'to' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1917:1: ( 'to' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1917:1: ( 'to' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1918:1: 'to'
            {
             before(grammarAccess.getStringValueAccess().getToKeyword_5_0()); 
            match(input,30,FOLLOW_30_in_rule__StringValue__Group_5__0__Impl3910); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1931:1: rule__StringValue__Group_5__1 : rule__StringValue__Group_5__1__Impl ;
    public final void rule__StringValue__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1935:1: ( rule__StringValue__Group_5__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1936:2: rule__StringValue__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__StringValue__Group_5__1__Impl_in_rule__StringValue__Group_5__13941);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1942:1: rule__StringValue__Group_5__1__Impl : ( ( rule__StringValue__ToKeyAssignment_5_1 ) ) ;
    public final void rule__StringValue__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1946:1: ( ( ( rule__StringValue__ToKeyAssignment_5_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1947:1: ( ( rule__StringValue__ToKeyAssignment_5_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1947:1: ( ( rule__StringValue__ToKeyAssignment_5_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1948:1: ( rule__StringValue__ToKeyAssignment_5_1 )
            {
             before(grammarAccess.getStringValueAccess().getToKeyAssignment_5_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1949:1: ( rule__StringValue__ToKeyAssignment_5_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1949:2: rule__StringValue__ToKeyAssignment_5_1
            {
            pushFollow(FOLLOW_rule__StringValue__ToKeyAssignment_5_1_in_rule__StringValue__Group_5__1__Impl3968);
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


    // $ANTLR start "rule__ObjectDescription__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1963:1: rule__ObjectDescription__Group__0 : rule__ObjectDescription__Group__0__Impl rule__ObjectDescription__Group__1 ;
    public final void rule__ObjectDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1967:1: ( rule__ObjectDescription__Group__0__Impl rule__ObjectDescription__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1968:2: rule__ObjectDescription__Group__0__Impl rule__ObjectDescription__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__0__Impl_in_rule__ObjectDescription__Group__04002);
            rule__ObjectDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__1_in_rule__ObjectDescription__Group__04005);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1975:1: rule__ObjectDescription__Group__0__Impl : ( 'Node' ) ;
    public final void rule__ObjectDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1979:1: ( ( 'Node' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1980:1: ( 'Node' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1980:1: ( 'Node' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1981:1: 'Node'
            {
             before(grammarAccess.getObjectDescriptionAccess().getNodeKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__ObjectDescription__Group__0__Impl4033); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1994:1: rule__ObjectDescription__Group__1 : rule__ObjectDescription__Group__1__Impl rule__ObjectDescription__Group__2 ;
    public final void rule__ObjectDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1998:1: ( rule__ObjectDescription__Group__1__Impl rule__ObjectDescription__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1999:2: rule__ObjectDescription__Group__1__Impl rule__ObjectDescription__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__1__Impl_in_rule__ObjectDescription__Group__14064);
            rule__ObjectDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__2_in_rule__ObjectDescription__Group__14067);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2006:1: rule__ObjectDescription__Group__1__Impl : ( ( rule__ObjectDescription__NameAssignment_1 ) ) ;
    public final void rule__ObjectDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2010:1: ( ( ( rule__ObjectDescription__NameAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2011:1: ( ( rule__ObjectDescription__NameAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2011:1: ( ( rule__ObjectDescription__NameAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2012:1: ( rule__ObjectDescription__NameAssignment_1 )
            {
             before(grammarAccess.getObjectDescriptionAccess().getNameAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2013:1: ( rule__ObjectDescription__NameAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2013:2: rule__ObjectDescription__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectDescription__NameAssignment_1_in_rule__ObjectDescription__Group__1__Impl4094);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2023:1: rule__ObjectDescription__Group__2 : rule__ObjectDescription__Group__2__Impl rule__ObjectDescription__Group__3 ;
    public final void rule__ObjectDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2027:1: ( rule__ObjectDescription__Group__2__Impl rule__ObjectDescription__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2028:2: rule__ObjectDescription__Group__2__Impl rule__ObjectDescription__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__2__Impl_in_rule__ObjectDescription__Group__24124);
            rule__ObjectDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__3_in_rule__ObjectDescription__Group__24127);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2035:1: rule__ObjectDescription__Group__2__Impl : ( ':' ) ;
    public final void rule__ObjectDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2039:1: ( ( ':' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2040:1: ( ':' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2040:1: ( ':' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2041:1: ':'
            {
             before(grammarAccess.getObjectDescriptionAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__ObjectDescription__Group__2__Impl4155); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2054:1: rule__ObjectDescription__Group__3 : rule__ObjectDescription__Group__3__Impl rule__ObjectDescription__Group__4 ;
    public final void rule__ObjectDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2058:1: ( rule__ObjectDescription__Group__3__Impl rule__ObjectDescription__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2059:2: rule__ObjectDescription__Group__3__Impl rule__ObjectDescription__Group__4
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__3__Impl_in_rule__ObjectDescription__Group__34186);
            rule__ObjectDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__4_in_rule__ObjectDescription__Group__34189);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2066:1: rule__ObjectDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__ObjectDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2070:1: ( ( '{' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2071:1: ( '{' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2071:1: ( '{' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2072:1: '{'
            {
             before(grammarAccess.getObjectDescriptionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__ObjectDescription__Group__3__Impl4217); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2085:1: rule__ObjectDescription__Group__4 : rule__ObjectDescription__Group__4__Impl rule__ObjectDescription__Group__5 ;
    public final void rule__ObjectDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2089:1: ( rule__ObjectDescription__Group__4__Impl rule__ObjectDescription__Group__5 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2090:2: rule__ObjectDescription__Group__4__Impl rule__ObjectDescription__Group__5
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__4__Impl_in_rule__ObjectDescription__Group__44248);
            rule__ObjectDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__5_in_rule__ObjectDescription__Group__44251);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2097:1: rule__ObjectDescription__Group__4__Impl : ( ( rule__ObjectDescription__DescriptionAssignment_4 )* ) ;
    public final void rule__ObjectDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2101:1: ( ( ( rule__ObjectDescription__DescriptionAssignment_4 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2102:1: ( ( rule__ObjectDescription__DescriptionAssignment_4 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2102:1: ( ( rule__ObjectDescription__DescriptionAssignment_4 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2103:1: ( rule__ObjectDescription__DescriptionAssignment_4 )*
            {
             before(grammarAccess.getObjectDescriptionAccess().getDescriptionAssignment_4()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2104:1: ( rule__ObjectDescription__DescriptionAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==32||(LA14_0>=34 && LA14_0<=35)||LA14_0==38) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2104:2: rule__ObjectDescription__DescriptionAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ObjectDescription__DescriptionAssignment_4_in_rule__ObjectDescription__Group__4__Impl4278);
            	    rule__ObjectDescription__DescriptionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2114:1: rule__ObjectDescription__Group__5 : rule__ObjectDescription__Group__5__Impl ;
    public final void rule__ObjectDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2118:1: ( rule__ObjectDescription__Group__5__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2119:2: rule__ObjectDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__5__Impl_in_rule__ObjectDescription__Group__54309);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2125:1: rule__ObjectDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__ObjectDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2129:1: ( ( '}' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2130:1: ( '}' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2130:1: ( '}' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2131:1: '}'
            {
             before(grammarAccess.getObjectDescriptionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__ObjectDescription__Group__5__Impl4337); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2156:1: rule__ObjectDescriptionInner__Group__0 : rule__ObjectDescriptionInner__Group__0__Impl rule__ObjectDescriptionInner__Group__1 ;
    public final void rule__ObjectDescriptionInner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2160:1: ( rule__ObjectDescriptionInner__Group__0__Impl rule__ObjectDescriptionInner__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2161:2: rule__ObjectDescriptionInner__Group__0__Impl rule__ObjectDescriptionInner__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Group__0__Impl_in_rule__ObjectDescriptionInner__Group__04380);
            rule__ObjectDescriptionInner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Group__1_in_rule__ObjectDescriptionInner__Group__04383);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2168:1: rule__ObjectDescriptionInner__Group__0__Impl : ( ( rule__ObjectDescriptionInner__Alternatives_0 ) ) ;
    public final void rule__ObjectDescriptionInner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2172:1: ( ( ( rule__ObjectDescriptionInner__Alternatives_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2173:1: ( ( rule__ObjectDescriptionInner__Alternatives_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2173:1: ( ( rule__ObjectDescriptionInner__Alternatives_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2174:1: ( rule__ObjectDescriptionInner__Alternatives_0 )
            {
             before(grammarAccess.getObjectDescriptionInnerAccess().getAlternatives_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2175:1: ( rule__ObjectDescriptionInner__Alternatives_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2175:2: rule__ObjectDescriptionInner__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Alternatives_0_in_rule__ObjectDescriptionInner__Group__0__Impl4410);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2185:1: rule__ObjectDescriptionInner__Group__1 : rule__ObjectDescriptionInner__Group__1__Impl ;
    public final void rule__ObjectDescriptionInner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2189:1: ( rule__ObjectDescriptionInner__Group__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2190:2: rule__ObjectDescriptionInner__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Group__1__Impl_in_rule__ObjectDescriptionInner__Group__14440);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2196:1: rule__ObjectDescriptionInner__Group__1__Impl : ( ';' ) ;
    public final void rule__ObjectDescriptionInner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2200:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2201:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2201:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2202:1: ';'
            {
             before(grammarAccess.getObjectDescriptionInnerAccess().getSemicolonKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ObjectDescriptionInner__Group__1__Impl4468); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2219:1: rule__ObjectAttribute__Group__0 : rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 ;
    public final void rule__ObjectAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2223:1: ( rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2224:2: rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__0__Impl_in_rule__ObjectAttribute__Group__04503);
            rule__ObjectAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectAttribute__Group__1_in_rule__ObjectAttribute__Group__04506);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2231:1: rule__ObjectAttribute__Group__0__Impl : ( 'hasAttribute' ) ;
    public final void rule__ObjectAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2235:1: ( ( 'hasAttribute' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2236:1: ( 'hasAttribute' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2236:1: ( 'hasAttribute' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2237:1: 'hasAttribute'
            {
             before(grammarAccess.getObjectAttributeAccess().getHasAttributeKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ObjectAttribute__Group__0__Impl4534); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2250:1: rule__ObjectAttribute__Group__1 : rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 ;
    public final void rule__ObjectAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2254:1: ( rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2255:2: rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__1__Impl_in_rule__ObjectAttribute__Group__14565);
            rule__ObjectAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectAttribute__Group__2_in_rule__ObjectAttribute__Group__14568);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2262:1: rule__ObjectAttribute__Group__1__Impl : ( ( rule__ObjectAttribute__AttributesAssignment_1 ) ) ;
    public final void rule__ObjectAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2266:1: ( ( ( rule__ObjectAttribute__AttributesAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2267:1: ( ( rule__ObjectAttribute__AttributesAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2267:1: ( ( rule__ObjectAttribute__AttributesAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2268:1: ( rule__ObjectAttribute__AttributesAssignment_1 )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributesAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2269:1: ( rule__ObjectAttribute__AttributesAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2269:2: rule__ObjectAttribute__AttributesAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__AttributesAssignment_1_in_rule__ObjectAttribute__Group__1__Impl4595);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2279:1: rule__ObjectAttribute__Group__2 : rule__ObjectAttribute__Group__2__Impl ;
    public final void rule__ObjectAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2283:1: ( rule__ObjectAttribute__Group__2__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2284:2: rule__ObjectAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__2__Impl_in_rule__ObjectAttribute__Group__24625);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2290:1: rule__ObjectAttribute__Group__2__Impl : ( ( rule__ObjectAttribute__Group_2__0 )? ) ;
    public final void rule__ObjectAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2294:1: ( ( ( rule__ObjectAttribute__Group_2__0 )? ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2295:1: ( ( rule__ObjectAttribute__Group_2__0 )? )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2295:1: ( ( rule__ObjectAttribute__Group_2__0 )? )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2296:1: ( rule__ObjectAttribute__Group_2__0 )?
            {
             before(grammarAccess.getObjectAttributeAccess().getGroup_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2297:1: ( rule__ObjectAttribute__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2297:2: rule__ObjectAttribute__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ObjectAttribute__Group_2__0_in_rule__ObjectAttribute__Group__2__Impl4652);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2313:1: rule__ObjectAttribute__Group_2__0 : rule__ObjectAttribute__Group_2__0__Impl rule__ObjectAttribute__Group_2__1 ;
    public final void rule__ObjectAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2317:1: ( rule__ObjectAttribute__Group_2__0__Impl rule__ObjectAttribute__Group_2__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2318:2: rule__ObjectAttribute__Group_2__0__Impl rule__ObjectAttribute__Group_2__1
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group_2__0__Impl_in_rule__ObjectAttribute__Group_2__04689);
            rule__ObjectAttribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectAttribute__Group_2__1_in_rule__ObjectAttribute__Group_2__04692);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2325:1: rule__ObjectAttribute__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__ObjectAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2329:1: ( ( 'as' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2330:1: ( 'as' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2330:1: ( 'as' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2331:1: 'as'
            {
             before(grammarAccess.getObjectAttributeAccess().getAsKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__ObjectAttribute__Group_2__0__Impl4720); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2344:1: rule__ObjectAttribute__Group_2__1 : rule__ObjectAttribute__Group_2__1__Impl ;
    public final void rule__ObjectAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2348:1: ( rule__ObjectAttribute__Group_2__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2349:2: rule__ObjectAttribute__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group_2__1__Impl_in_rule__ObjectAttribute__Group_2__14751);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2355:1: rule__ObjectAttribute__Group_2__1__Impl : ( ( rule__ObjectAttribute__StringMethodeAssignment_2_1 ) ) ;
    public final void rule__ObjectAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2359:1: ( ( ( rule__ObjectAttribute__StringMethodeAssignment_2_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2360:1: ( ( rule__ObjectAttribute__StringMethodeAssignment_2_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2360:1: ( ( rule__ObjectAttribute__StringMethodeAssignment_2_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2361:1: ( rule__ObjectAttribute__StringMethodeAssignment_2_1 )
            {
             before(grammarAccess.getObjectAttributeAccess().getStringMethodeAssignment_2_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2362:1: ( rule__ObjectAttribute__StringMethodeAssignment_2_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2362:2: rule__ObjectAttribute__StringMethodeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__StringMethodeAssignment_2_1_in_rule__ObjectAttribute__Group_2__1__Impl4778);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2378:1: rule__ObjectNode__Group__0 : rule__ObjectNode__Group__0__Impl rule__ObjectNode__Group__1 ;
    public final void rule__ObjectNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2382:1: ( rule__ObjectNode__Group__0__Impl rule__ObjectNode__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2383:2: rule__ObjectNode__Group__0__Impl rule__ObjectNode__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__0__Impl_in_rule__ObjectNode__Group__04814);
            rule__ObjectNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNode__Group__1_in_rule__ObjectNode__Group__04817);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2390:1: rule__ObjectNode__Group__0__Impl : ( 'hasNode' ) ;
    public final void rule__ObjectNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2394:1: ( ( 'hasNode' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2395:1: ( 'hasNode' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2395:1: ( 'hasNode' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2396:1: 'hasNode'
            {
             before(grammarAccess.getObjectNodeAccess().getHasNodeKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__ObjectNode__Group__0__Impl4845); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2409:1: rule__ObjectNode__Group__1 : rule__ObjectNode__Group__1__Impl rule__ObjectNode__Group__2 ;
    public final void rule__ObjectNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2413:1: ( rule__ObjectNode__Group__1__Impl rule__ObjectNode__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2414:2: rule__ObjectNode__Group__1__Impl rule__ObjectNode__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__1__Impl_in_rule__ObjectNode__Group__14876);
            rule__ObjectNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNode__Group__2_in_rule__ObjectNode__Group__14879);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2421:1: rule__ObjectNode__Group__1__Impl : ( ( rule__ObjectNode__AttributesAssignment_1 ) ) ;
    public final void rule__ObjectNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2425:1: ( ( ( rule__ObjectNode__AttributesAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2426:1: ( ( rule__ObjectNode__AttributesAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2426:1: ( ( rule__ObjectNode__AttributesAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2427:1: ( rule__ObjectNode__AttributesAssignment_1 )
            {
             before(grammarAccess.getObjectNodeAccess().getAttributesAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2428:1: ( rule__ObjectNode__AttributesAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2428:2: rule__ObjectNode__AttributesAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectNode__AttributesAssignment_1_in_rule__ObjectNode__Group__1__Impl4906);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2438:1: rule__ObjectNode__Group__2 : rule__ObjectNode__Group__2__Impl rule__ObjectNode__Group__3 ;
    public final void rule__ObjectNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2442:1: ( rule__ObjectNode__Group__2__Impl rule__ObjectNode__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2443:2: rule__ObjectNode__Group__2__Impl rule__ObjectNode__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__2__Impl_in_rule__ObjectNode__Group__24936);
            rule__ObjectNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNode__Group__3_in_rule__ObjectNode__Group__24939);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2450:1: rule__ObjectNode__Group__2__Impl : ( 'as' ) ;
    public final void rule__ObjectNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2454:1: ( ( 'as' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2455:1: ( 'as' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2455:1: ( 'as' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2456:1: 'as'
            {
             before(grammarAccess.getObjectNodeAccess().getAsKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__ObjectNode__Group__2__Impl4967); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2469:1: rule__ObjectNode__Group__3 : rule__ObjectNode__Group__3__Impl ;
    public final void rule__ObjectNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2473:1: ( rule__ObjectNode__Group__3__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2474:2: rule__ObjectNode__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__3__Impl_in_rule__ObjectNode__Group__34998);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2480:1: rule__ObjectNode__Group__3__Impl : ( ( rule__ObjectNode__InnerAssignment_3 ) ) ;
    public final void rule__ObjectNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2484:1: ( ( ( rule__ObjectNode__InnerAssignment_3 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2485:1: ( ( rule__ObjectNode__InnerAssignment_3 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2485:1: ( ( rule__ObjectNode__InnerAssignment_3 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2486:1: ( rule__ObjectNode__InnerAssignment_3 )
            {
             before(grammarAccess.getObjectNodeAccess().getInnerAssignment_3()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2487:1: ( rule__ObjectNode__InnerAssignment_3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2487:2: rule__ObjectNode__InnerAssignment_3
            {
            pushFollow(FOLLOW_rule__ObjectNode__InnerAssignment_3_in_rule__ObjectNode__Group__3__Impl5025);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2505:1: rule__ObjectNext__Group__0 : rule__ObjectNext__Group__0__Impl rule__ObjectNext__Group__1 ;
    public final void rule__ObjectNext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2509:1: ( rule__ObjectNext__Group__0__Impl rule__ObjectNext__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2510:2: rule__ObjectNext__Group__0__Impl rule__ObjectNext__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__0__Impl_in_rule__ObjectNext__Group__05063);
            rule__ObjectNext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNext__Group__1_in_rule__ObjectNext__Group__05066);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2517:1: rule__ObjectNext__Group__0__Impl : ( 'hasNext' ) ;
    public final void rule__ObjectNext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2521:1: ( ( 'hasNext' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2522:1: ( 'hasNext' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2522:1: ( 'hasNext' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2523:1: 'hasNext'
            {
             before(grammarAccess.getObjectNextAccess().getHasNextKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__ObjectNext__Group__0__Impl5094); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2536:1: rule__ObjectNext__Group__1 : rule__ObjectNext__Group__1__Impl rule__ObjectNext__Group__2 ;
    public final void rule__ObjectNext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2540:1: ( rule__ObjectNext__Group__1__Impl rule__ObjectNext__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2541:2: rule__ObjectNext__Group__1__Impl rule__ObjectNext__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__1__Impl_in_rule__ObjectNext__Group__15125);
            rule__ObjectNext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNext__Group__2_in_rule__ObjectNext__Group__15128);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2548:1: rule__ObjectNext__Group__1__Impl : ( ( rule__ObjectNext__AttributeAssignment_1 ) ) ;
    public final void rule__ObjectNext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2552:1: ( ( ( rule__ObjectNext__AttributeAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2553:1: ( ( rule__ObjectNext__AttributeAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2553:1: ( ( rule__ObjectNext__AttributeAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2554:1: ( rule__ObjectNext__AttributeAssignment_1 )
            {
             before(grammarAccess.getObjectNextAccess().getAttributeAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2555:1: ( rule__ObjectNext__AttributeAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2555:2: rule__ObjectNext__AttributeAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectNext__AttributeAssignment_1_in_rule__ObjectNext__Group__1__Impl5155);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2565:1: rule__ObjectNext__Group__2 : rule__ObjectNext__Group__2__Impl rule__ObjectNext__Group__3 ;
    public final void rule__ObjectNext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2569:1: ( rule__ObjectNext__Group__2__Impl rule__ObjectNext__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2570:2: rule__ObjectNext__Group__2__Impl rule__ObjectNext__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__2__Impl_in_rule__ObjectNext__Group__25185);
            rule__ObjectNext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNext__Group__3_in_rule__ObjectNext__Group__25188);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2577:1: rule__ObjectNext__Group__2__Impl : ( 'as' ) ;
    public final void rule__ObjectNext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2581:1: ( ( 'as' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2582:1: ( 'as' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2582:1: ( 'as' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2583:1: 'as'
            {
             before(grammarAccess.getObjectNextAccess().getAsKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__ObjectNext__Group__2__Impl5216); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2596:1: rule__ObjectNext__Group__3 : rule__ObjectNext__Group__3__Impl ;
    public final void rule__ObjectNext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2600:1: ( rule__ObjectNext__Group__3__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2601:2: rule__ObjectNext__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__3__Impl_in_rule__ObjectNext__Group__35247);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2607:1: rule__ObjectNext__Group__3__Impl : ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) ) ;
    public final void rule__ObjectNext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2611:1: ( ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2612:1: ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2612:1: ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2613:1: ( rule__ObjectNext__ObjectDesriptionAssignment_3 )
            {
             before(grammarAccess.getObjectNextAccess().getObjectDesriptionAssignment_3()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2614:1: ( rule__ObjectNext__ObjectDesriptionAssignment_3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2614:2: rule__ObjectNext__ObjectDesriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__ObjectNext__ObjectDesriptionAssignment_3_in_rule__ObjectNext__Group__3__Impl5274);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2632:1: rule__JavaCodeOrID__Group_0__0 : rule__JavaCodeOrID__Group_0__0__Impl rule__JavaCodeOrID__Group_0__1 ;
    public final void rule__JavaCodeOrID__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2636:1: ( rule__JavaCodeOrID__Group_0__0__Impl rule__JavaCodeOrID__Group_0__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2637:2: rule__JavaCodeOrID__Group_0__0__Impl rule__JavaCodeOrID__Group_0__1
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__0__Impl_in_rule__JavaCodeOrID__Group_0__05312);
            rule__JavaCodeOrID__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__1_in_rule__JavaCodeOrID__Group_0__05315);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2644:1: rule__JavaCodeOrID__Group_0__0__Impl : ( 'java' ) ;
    public final void rule__JavaCodeOrID__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2648:1: ( ( 'java' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2649:1: ( 'java' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2649:1: ( 'java' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2650:1: 'java'
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getJavaKeyword_0_0()); 
            match(input,36,FOLLOW_36_in_rule__JavaCodeOrID__Group_0__0__Impl5343); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2663:1: rule__JavaCodeOrID__Group_0__1 : rule__JavaCodeOrID__Group_0__1__Impl rule__JavaCodeOrID__Group_0__2 ;
    public final void rule__JavaCodeOrID__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2667:1: ( rule__JavaCodeOrID__Group_0__1__Impl rule__JavaCodeOrID__Group_0__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2668:2: rule__JavaCodeOrID__Group_0__1__Impl rule__JavaCodeOrID__Group_0__2
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__1__Impl_in_rule__JavaCodeOrID__Group_0__15374);
            rule__JavaCodeOrID__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__2_in_rule__JavaCodeOrID__Group_0__15377);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2675:1: rule__JavaCodeOrID__Group_0__1__Impl : ( ':' ) ;
    public final void rule__JavaCodeOrID__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2679:1: ( ( ':' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2680:1: ( ':' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2680:1: ( ':' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2681:1: ':'
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getColonKeyword_0_1()); 
            match(input,24,FOLLOW_24_in_rule__JavaCodeOrID__Group_0__1__Impl5405); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2694:1: rule__JavaCodeOrID__Group_0__2 : rule__JavaCodeOrID__Group_0__2__Impl ;
    public final void rule__JavaCodeOrID__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2698:1: ( rule__JavaCodeOrID__Group_0__2__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2699:2: rule__JavaCodeOrID__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__2__Impl_in_rule__JavaCodeOrID__Group_0__25436);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2705:1: rule__JavaCodeOrID__Group_0__2__Impl : ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) ) ;
    public final void rule__JavaCodeOrID__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2709:1: ( ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2710:1: ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2710:1: ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2711:1: ( rule__JavaCodeOrID__CodeAssignment_0_2 )
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getCodeAssignment_0_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2712:1: ( rule__JavaCodeOrID__CodeAssignment_0_2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2712:2: rule__JavaCodeOrID__CodeAssignment_0_2
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__CodeAssignment_0_2_in_rule__JavaCodeOrID__Group_0__2__Impl5463);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2728:1: rule__ObjectMany__Group__0 : rule__ObjectMany__Group__0__Impl rule__ObjectMany__Group__1 ;
    public final void rule__ObjectMany__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2732:1: ( rule__ObjectMany__Group__0__Impl rule__ObjectMany__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2733:2: rule__ObjectMany__Group__0__Impl rule__ObjectMany__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectMany__Group__0__Impl_in_rule__ObjectMany__Group__05499);
            rule__ObjectMany__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectMany__Group__1_in_rule__ObjectMany__Group__05502);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2740:1: rule__ObjectMany__Group__0__Impl : ( ( rule__ObjectMany__OptionAssignment_0 ) ) ;
    public final void rule__ObjectMany__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2744:1: ( ( ( rule__ObjectMany__OptionAssignment_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2745:1: ( ( rule__ObjectMany__OptionAssignment_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2745:1: ( ( rule__ObjectMany__OptionAssignment_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2746:1: ( rule__ObjectMany__OptionAssignment_0 )
            {
             before(grammarAccess.getObjectManyAccess().getOptionAssignment_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2747:1: ( rule__ObjectMany__OptionAssignment_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2747:2: rule__ObjectMany__OptionAssignment_0
            {
            pushFollow(FOLLOW_rule__ObjectMany__OptionAssignment_0_in_rule__ObjectMany__Group__0__Impl5529);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2757:1: rule__ObjectMany__Group__1 : rule__ObjectMany__Group__1__Impl ;
    public final void rule__ObjectMany__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2761:1: ( rule__ObjectMany__Group__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2762:2: rule__ObjectMany__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectMany__Group__1__Impl_in_rule__ObjectMany__Group__15559);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2768:1: rule__ObjectMany__Group__1__Impl : ( '*' ) ;
    public final void rule__ObjectMany__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2772:1: ( ( '*' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2773:1: ( '*' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2773:1: ( '*' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2774:1: '*'
            {
             before(grammarAccess.getObjectManyAccess().getAsteriskKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__ObjectMany__Group__1__Impl5587); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2791:1: rule__ObjectChoice__Group__0 : rule__ObjectChoice__Group__0__Impl rule__ObjectChoice__Group__1 ;
    public final void rule__ObjectChoice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2795:1: ( rule__ObjectChoice__Group__0__Impl rule__ObjectChoice__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2796:2: rule__ObjectChoice__Group__0__Impl rule__ObjectChoice__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__0__Impl_in_rule__ObjectChoice__Group__05622);
            rule__ObjectChoice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectChoice__Group__1_in_rule__ObjectChoice__Group__05625);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2803:1: rule__ObjectChoice__Group__0__Impl : ( '(' ) ;
    public final void rule__ObjectChoice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2807:1: ( ( '(' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2808:1: ( '(' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2808:1: ( '(' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2809:1: '('
            {
             before(grammarAccess.getObjectChoiceAccess().getLeftParenthesisKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__ObjectChoice__Group__0__Impl5653); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2822:1: rule__ObjectChoice__Group__1 : rule__ObjectChoice__Group__1__Impl rule__ObjectChoice__Group__2 ;
    public final void rule__ObjectChoice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2826:1: ( rule__ObjectChoice__Group__1__Impl rule__ObjectChoice__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2827:2: rule__ObjectChoice__Group__1__Impl rule__ObjectChoice__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__1__Impl_in_rule__ObjectChoice__Group__15684);
            rule__ObjectChoice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectChoice__Group__2_in_rule__ObjectChoice__Group__15687);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2834:1: rule__ObjectChoice__Group__1__Impl : ( ( rule__ObjectChoice__OptionsAssignment_1 ) ) ;
    public final void rule__ObjectChoice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2838:1: ( ( ( rule__ObjectChoice__OptionsAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2839:1: ( ( rule__ObjectChoice__OptionsAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2839:1: ( ( rule__ObjectChoice__OptionsAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2840:1: ( rule__ObjectChoice__OptionsAssignment_1 )
            {
             before(grammarAccess.getObjectChoiceAccess().getOptionsAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2841:1: ( rule__ObjectChoice__OptionsAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2841:2: rule__ObjectChoice__OptionsAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectChoice__OptionsAssignment_1_in_rule__ObjectChoice__Group__1__Impl5714);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2851:1: rule__ObjectChoice__Group__2 : rule__ObjectChoice__Group__2__Impl rule__ObjectChoice__Group__3 ;
    public final void rule__ObjectChoice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2855:1: ( rule__ObjectChoice__Group__2__Impl rule__ObjectChoice__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2856:2: rule__ObjectChoice__Group__2__Impl rule__ObjectChoice__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__2__Impl_in_rule__ObjectChoice__Group__25744);
            rule__ObjectChoice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectChoice__Group__3_in_rule__ObjectChoice__Group__25747);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2863:1: rule__ObjectChoice__Group__2__Impl : ( ( rule__ObjectChoice__Group_2__0 )* ) ;
    public final void rule__ObjectChoice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2867:1: ( ( ( rule__ObjectChoice__Group_2__0 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2868:1: ( ( rule__ObjectChoice__Group_2__0 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2868:1: ( ( rule__ObjectChoice__Group_2__0 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2869:1: ( rule__ObjectChoice__Group_2__0 )*
            {
             before(grammarAccess.getObjectChoiceAccess().getGroup_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2870:1: ( rule__ObjectChoice__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2870:2: rule__ObjectChoice__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ObjectChoice__Group_2__0_in_rule__ObjectChoice__Group__2__Impl5774);
            	    rule__ObjectChoice__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2880:1: rule__ObjectChoice__Group__3 : rule__ObjectChoice__Group__3__Impl ;
    public final void rule__ObjectChoice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2884:1: ( rule__ObjectChoice__Group__3__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2885:2: rule__ObjectChoice__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__3__Impl_in_rule__ObjectChoice__Group__35805);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2891:1: rule__ObjectChoice__Group__3__Impl : ( ')' ) ;
    public final void rule__ObjectChoice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2895:1: ( ( ')' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2896:1: ( ')' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2896:1: ( ')' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2897:1: ')'
            {
             before(grammarAccess.getObjectChoiceAccess().getRightParenthesisKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__ObjectChoice__Group__3__Impl5833); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2918:1: rule__ObjectChoice__Group_2__0 : rule__ObjectChoice__Group_2__0__Impl rule__ObjectChoice__Group_2__1 ;
    public final void rule__ObjectChoice__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2922:1: ( rule__ObjectChoice__Group_2__0__Impl rule__ObjectChoice__Group_2__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2923:2: rule__ObjectChoice__Group_2__0__Impl rule__ObjectChoice__Group_2__1
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group_2__0__Impl_in_rule__ObjectChoice__Group_2__05872);
            rule__ObjectChoice__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectChoice__Group_2__1_in_rule__ObjectChoice__Group_2__05875);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2930:1: rule__ObjectChoice__Group_2__0__Impl : ( '|' ) ;
    public final void rule__ObjectChoice__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2934:1: ( ( '|' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2935:1: ( '|' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2935:1: ( '|' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2936:1: '|'
            {
             before(grammarAccess.getObjectChoiceAccess().getVerticalLineKeyword_2_0()); 
            match(input,40,FOLLOW_40_in_rule__ObjectChoice__Group_2__0__Impl5903); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2949:1: rule__ObjectChoice__Group_2__1 : rule__ObjectChoice__Group_2__1__Impl ;
    public final void rule__ObjectChoice__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2953:1: ( rule__ObjectChoice__Group_2__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2954:2: rule__ObjectChoice__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group_2__1__Impl_in_rule__ObjectChoice__Group_2__15934);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2960:1: rule__ObjectChoice__Group_2__1__Impl : ( ( rule__ObjectChoice__OptionsAssignment_2_1 ) ) ;
    public final void rule__ObjectChoice__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2964:1: ( ( ( rule__ObjectChoice__OptionsAssignment_2_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2965:1: ( ( rule__ObjectChoice__OptionsAssignment_2_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2965:1: ( ( rule__ObjectChoice__OptionsAssignment_2_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2966:1: ( rule__ObjectChoice__OptionsAssignment_2_1 )
            {
             before(grammarAccess.getObjectChoiceAccess().getOptionsAssignment_2_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2967:1: ( rule__ObjectChoice__OptionsAssignment_2_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2967:2: rule__ObjectChoice__OptionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ObjectChoice__OptionsAssignment_2_1_in_rule__ObjectChoice__Group_2__1__Impl5961);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2981:1: rule__ObjectMaybe__Group_1__0 : rule__ObjectMaybe__Group_1__0__Impl rule__ObjectMaybe__Group_1__1 ;
    public final void rule__ObjectMaybe__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2985:1: ( rule__ObjectMaybe__Group_1__0__Impl rule__ObjectMaybe__Group_1__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2986:2: rule__ObjectMaybe__Group_1__0__Impl rule__ObjectMaybe__Group_1__1
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__0__Impl_in_rule__ObjectMaybe__Group_1__05995);
            rule__ObjectMaybe__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__1_in_rule__ObjectMaybe__Group_1__05998);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2993:1: rule__ObjectMaybe__Group_1__0__Impl : ( ( rule__ObjectMaybe__DescriptionAssignment_1_0 ) ) ;
    public final void rule__ObjectMaybe__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2997:1: ( ( ( rule__ObjectMaybe__DescriptionAssignment_1_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2998:1: ( ( rule__ObjectMaybe__DescriptionAssignment_1_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2998:1: ( ( rule__ObjectMaybe__DescriptionAssignment_1_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2999:1: ( rule__ObjectMaybe__DescriptionAssignment_1_0 )
            {
             before(grammarAccess.getObjectMaybeAccess().getDescriptionAssignment_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3000:1: ( rule__ObjectMaybe__DescriptionAssignment_1_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3000:2: rule__ObjectMaybe__DescriptionAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__DescriptionAssignment_1_0_in_rule__ObjectMaybe__Group_1__0__Impl6025);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3010:1: rule__ObjectMaybe__Group_1__1 : rule__ObjectMaybe__Group_1__1__Impl ;
    public final void rule__ObjectMaybe__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3014:1: ( rule__ObjectMaybe__Group_1__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3015:2: rule__ObjectMaybe__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__1__Impl_in_rule__ObjectMaybe__Group_1__16055);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3021:1: rule__ObjectMaybe__Group_1__1__Impl : ( '?' ) ;
    public final void rule__ObjectMaybe__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3025:1: ( ( '?' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3026:1: ( '?' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3026:1: ( '?' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3027:1: '?'
            {
             before(grammarAccess.getObjectMaybeAccess().getQuestionMarkKeyword_1_1()); 
            match(input,41,FOLLOW_41_in_rule__ObjectMaybe__Group_1__1__Impl6083); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3045:1: rule__DTDSL__ParserNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DTDSL__ParserNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3049:1: ( ( RULE_STRING ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3050:1: ( RULE_STRING )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3050:1: ( RULE_STRING )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3051:1: RULE_STRING
            {
             before(grammarAccess.getDTDSLAccess().getParserNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DTDSL__ParserNameAssignment_26123); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3060:1: rule__DTDSL__ObjDescriptionAssignment_4 : ( ruleAbstract ) ;
    public final void rule__DTDSL__ObjDescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3064:1: ( ( ruleAbstract ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3065:1: ( ruleAbstract )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3065:1: ( ruleAbstract )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3066:1: ruleAbstract
            {
             before(grammarAccess.getDTDSLAccess().getObjDescriptionAbstractParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAbstract_in_rule__DTDSL__ObjDescriptionAssignment_46154);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3075:1: rule__DTDSL__StartAssignment_5 : ( ruleStartPoint ) ;
    public final void rule__DTDSL__StartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3079:1: ( ( ruleStartPoint ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3080:1: ( ruleStartPoint )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3080:1: ( ruleStartPoint )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3081:1: ruleStartPoint
            {
             before(grammarAccess.getDTDSLAccess().getStartStartPointParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStartPoint_in_rule__DTDSL__StartAssignment_56185);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3090:1: rule__StartPoint__BeginAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__StartPoint__BeginAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3094:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3095:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3095:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3096:1: ( RULE_ID )
            {
             before(grammarAccess.getStartPointAccess().getBeginObjectDescriptionCrossReference_0_2_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3097:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3098:1: RULE_ID
            {
             before(grammarAccess.getStartPointAccess().getBeginObjectDescriptionIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartPoint__BeginAssignment_0_26220); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3109:1: rule__StartPoint__BeginAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__StartPoint__BeginAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3113:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3114:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3114:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3115:1: ( RULE_ID )
            {
             before(grammarAccess.getStartPointAccess().getBeginStringDescriptionCrossReference_1_0_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3116:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3117:1: RULE_ID
            {
             before(grammarAccess.getStartPointAccess().getBeginStringDescriptionIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartPoint__BeginAssignment_1_06259); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3128:1: rule__StringDescription__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringDescription__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3132:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3133:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3133:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3134:1: RULE_ID
            {
             before(grammarAccess.getStringDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringDescription__NameAssignment_16294); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3143:1: rule__StringDescription__DescriptionAssignment_4 : ( ruleStringDescriptionInner ) ;
    public final void rule__StringDescription__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3147:1: ( ( ruleStringDescriptionInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3148:1: ( ruleStringDescriptionInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3148:1: ( ruleStringDescriptionInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3149:1: ruleStringDescriptionInner
            {
             before(grammarAccess.getStringDescriptionAccess().getDescriptionStringDescriptionInnerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStringDescriptionInner_in_rule__StringDescription__DescriptionAssignment_46325);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3158:1: rule__StringDescriptionInner__KeyRefAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__StringDescriptionInner__KeyRefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3162:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3163:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3163:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3164:1: ( RULE_ID )
            {
             before(grammarAccess.getStringDescriptionInnerAccess().getKeyRefStringKeyCrossReference_3_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3165:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3166:1: RULE_ID
            {
             before(grammarAccess.getStringDescriptionInnerAccess().getKeyRefStringKeyIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringDescriptionInner__KeyRefAssignment_36360); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3177:1: rule__StringOverRead__OverReadAssignment : ( RULE_STRING ) ;
    public final void rule__StringOverRead__OverReadAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3181:1: ( ( RULE_STRING ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3182:1: ( RULE_STRING )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3182:1: ( RULE_STRING )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3183:1: RULE_STRING
            {
             before(grammarAccess.getStringOverReadAccess().getOverReadSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringOverRead__OverReadAssignment6395); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3192:1: rule__StringKey__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__StringKey__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3196:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3197:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3197:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3198:1: RULE_ID
            {
             before(grammarAccess.getStringKeyAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringKey__NameAssignment_1_06426); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3207:1: rule__StringKey__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__StringKey__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3211:1: ( ( ruleType ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3212:1: ( ruleType )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3212:1: ( ruleType )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3213:1: ruleType
            {
             before(grammarAccess.getStringKeyAccess().getTypeTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__StringKey__TypeAssignment_46457);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3222:1: rule__StringValue__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__StringValue__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3226:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3227:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3227:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3228:1: RULE_ID
            {
             before(grammarAccess.getStringValueAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringValue__NameAssignment_1_06488); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3237:1: rule__StringValue__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__StringValue__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3241:1: ( ( ruleType ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3242:1: ( ruleType )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3242:1: ( ruleType )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3243:1: ruleType
            {
             before(grammarAccess.getStringValueAccess().getTypeTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__StringValue__TypeAssignment_46519);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3252:1: rule__StringValue__ToKeyAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__StringValue__ToKeyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3256:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3257:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3257:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3258:1: ( RULE_ID )
            {
             before(grammarAccess.getStringValueAccess().getToKeyStringKeyCrossReference_5_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3259:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3260:1: RULE_ID
            {
             before(grammarAccess.getStringValueAccess().getToKeyStringKeyIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringValue__ToKeyAssignment_5_16554); 
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


    // $ANTLR start "rule__ObjectDescription__NameAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3271:1: rule__ObjectDescription__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectDescription__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3275:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3276:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3276:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3277:1: RULE_ID
            {
             before(grammarAccess.getObjectDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectDescription__NameAssignment_16589); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3286:1: rule__ObjectDescription__DescriptionAssignment_4 : ( ruleObjectDescriptionInner ) ;
    public final void rule__ObjectDescription__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3290:1: ( ( ruleObjectDescriptionInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3291:1: ( ruleObjectDescriptionInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3291:1: ( ruleObjectDescriptionInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3292:1: ruleObjectDescriptionInner
            {
             before(grammarAccess.getObjectDescriptionAccess().getDescriptionObjectDescriptionInnerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleObjectDescriptionInner_in_rule__ObjectDescription__DescriptionAssignment_46620);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3301:1: rule__ObjectAttribute__AttributesAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectAttribute__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3305:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3306:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3306:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3307:1: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectAttribute__AttributesAssignment_16651); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3316:1: rule__ObjectAttribute__StringMethodeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__StringMethodeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3320:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3321:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3321:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3322:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getStringMethodeStringDescriptionCrossReference_2_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3323:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3324:1: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getStringMethodeStringDescriptionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectAttribute__StringMethodeAssignment_2_16686); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3335:1: rule__ObjectNode__AttributesAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectNode__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3339:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3340:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3340:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3341:1: RULE_ID
            {
             before(grammarAccess.getObjectNodeAccess().getAttributesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectNode__AttributesAssignment_16721); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3350:1: rule__ObjectNode__InnerAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectNode__InnerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3354:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3355:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3355:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3356:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectNodeAccess().getInnerObjectDescriptionCrossReference_3_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3357:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3358:1: RULE_ID
            {
             before(grammarAccess.getObjectNodeAccess().getInnerObjectDescriptionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectNode__InnerAssignment_36756); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3369:1: rule__ObjectNext__AttributeAssignment_1 : ( ruleJavaCodeOrID ) ;
    public final void rule__ObjectNext__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3373:1: ( ( ruleJavaCodeOrID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3374:1: ( ruleJavaCodeOrID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3374:1: ( ruleJavaCodeOrID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3375:1: ruleJavaCodeOrID
            {
             before(grammarAccess.getObjectNextAccess().getAttributeJavaCodeOrIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_rule__ObjectNext__AttributeAssignment_16791);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3384:1: rule__ObjectNext__ObjectDesriptionAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectNext__ObjectDesriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3388:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3389:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3389:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3390:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectNextAccess().getObjectDesriptionObjectDescriptionCrossReference_3_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3391:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3392:1: RULE_ID
            {
             before(grammarAccess.getObjectNextAccess().getObjectDesriptionObjectDescriptionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectNext__ObjectDesriptionAssignment_36826); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3403:1: rule__JavaCodeOrID__CodeAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__JavaCodeOrID__CodeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3407:1: ( ( RULE_STRING ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3408:1: ( RULE_STRING )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3408:1: ( RULE_STRING )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3409:1: RULE_STRING
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getCodeSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JavaCodeOrID__CodeAssignment_0_26861); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3418:1: rule__JavaCodeOrID__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__JavaCodeOrID__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3422:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3423:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3423:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3424:1: RULE_ID
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JavaCodeOrID__IdAssignment_16892); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3433:1: rule__ObjectMany__OptionAssignment_0 : ( ruleObjectMaybeInner ) ;
    public final void rule__ObjectMany__OptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3437:1: ( ( ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3438:1: ( ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3438:1: ( ruleObjectMaybeInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3439:1: ruleObjectMaybeInner
            {
             before(grammarAccess.getObjectManyAccess().getOptionObjectMaybeInnerParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_rule__ObjectMany__OptionAssignment_06923);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3448:1: rule__ObjectChoice__OptionsAssignment_1 : ( ruleObjectMaybeInner ) ;
    public final void rule__ObjectChoice__OptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3452:1: ( ( ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3453:1: ( ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3453:1: ( ruleObjectMaybeInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3454:1: ruleObjectMaybeInner
            {
             before(grammarAccess.getObjectChoiceAccess().getOptionsObjectMaybeInnerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_rule__ObjectChoice__OptionsAssignment_16954);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3463:1: rule__ObjectChoice__OptionsAssignment_2_1 : ( ruleObjectMaybeInner ) ;
    public final void rule__ObjectChoice__OptionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3467:1: ( ( ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3468:1: ( ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3468:1: ( ruleObjectMaybeInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3469:1: ruleObjectMaybeInner
            {
             before(grammarAccess.getObjectChoiceAccess().getOptionsObjectMaybeInnerParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_rule__ObjectChoice__OptionsAssignment_2_16985);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3478:1: rule__ObjectMaybe__OptionAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectMaybe__OptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3482:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3483:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3483:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3484:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectMaybeAccess().getOptionObjectDescriptionCrossReference_0_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3485:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3486:1: RULE_ID
            {
             before(grammarAccess.getObjectMaybeAccess().getOptionObjectDescriptionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectMaybe__OptionAssignment_07020); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3497:1: rule__ObjectMaybe__DescriptionAssignment_1_0 : ( ruleObjectMaybeInner ) ;
    public final void rule__ObjectMaybe__DescriptionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3501:1: ( ( ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3502:1: ( ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3502:1: ( ruleObjectMaybeInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:3503:1: ruleObjectMaybeInner
            {
             before(grammarAccess.getObjectMaybeAccess().getDescriptionObjectMaybeInnerParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_rule__ObjectMaybe__DescriptionAssignment_1_07055);
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


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\26\uffff";
    static final String DFA4_eofS =
        "\26\uffff";
    static final String DFA4_minS =
        "\4\5\2\uffff\1\41\1\26\1\30\1\41\2\5\2\uffff\1\4\1\5\2\26\1\41"+
        "\1\26\2\uffff";
    static final String DFA4_maxS =
        "\1\46\2\5\1\44\2\uffff\1\41\1\51\1\30\1\41\2\5\2\uffff\1\4\1\5"+
        "\2\51\1\41\1\51\2\uffff";
    static final String DFA4_acceptS =
        "\4\uffff\1\4\1\6\6\uffff\1\2\1\5\6\uffff\1\1\1\3";
    static final String DFA4_specialS =
        "\26\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\4\32\uffff\1\2\1\uffff\1\1\1\3\2\uffff\1\5",
            "\1\6",
            "\1\7",
            "\1\11\36\uffff\1\10",
            "",
            "",
            "\1\12",
            "\1\14\12\uffff\1\13\3\uffff\1\15\3\uffff\1\4",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "",
            "",
            "\1\22",
            "\1\23",
            "\1\24\16\uffff\1\15\3\uffff\1\4",
            "\1\14\16\uffff\1\15\3\uffff\1\4",
            "\1\17",
            "\1\25\16\uffff\1\15\3\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "677:1: rule__ObjectDescriptionInner__Alternatives_0 : ( ( ruleObjectNode ) | ( ruleObjectAttribute ) | ( ruleObjectNext ) | ( ruleObjectMaybe ) | ( ruleObjectMany ) | ( ruleObjectChoice ) );";
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
    public static final BitSet FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescription548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__0_in_ruleObjectDescription574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescriptionInner610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Group__0_in_ruleObjectDescriptionInner636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectAttribute670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__0_in_ruleObjectAttribute696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_entryRuleObjectNode725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectNode732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__0_in_ruleObjectNode758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_entryRuleObjectNext785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectNext792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__0_in_ruleObjectNext818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaCodeOrID852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Alternatives_in_ruleJavaCodeOrID878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMany_in_entryRuleObjectMany965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMany972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMany__Group__0_in_ruleObjectMany998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectChoice_in_entryRuleObjectChoice1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectChoice1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__0_in_ruleObjectChoice1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe1085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMaybe1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Alternatives_in_ruleObjectMaybe1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_entryRuleObjectMaybeInner1145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMaybeInner1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybeInner__Alternatives_in_ruleObjectMaybeInner1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__0_in_rule__StartPoint__Alternatives1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_1__0_in_rule__StartPoint__Alternatives1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescription_in_rule__Abstract__Alternatives1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescription_in_rule__Abstract__Alternatives1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringOverRead_in_rule__StringDescriptionInner__Alternatives1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringKey_in_rule__StringDescriptionInner__Alternatives1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__StringDescriptionInner__Alternatives1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescriptionInner__KeyRefAssignment_3_in_rule__StringDescriptionInner__Alternatives1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_rule__ObjectDescriptionInner__Alternatives_01401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_rule__ObjectDescriptionInner__Alternatives_01418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_rule__ObjectDescriptionInner__Alternatives_01435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_rule__ObjectDescriptionInner__Alternatives_01452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMany_in_rule__ObjectDescriptionInner__Alternatives_01469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectChoice_in_rule__ObjectDescriptionInner__Alternatives_01486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__0_in_rule__JavaCodeOrID__Alternatives1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__IdAssignment_1_in_rule__JavaCodeOrID__Alternatives1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type__Alternatives1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__Alternatives1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__Alternatives1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__Alternatives1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type__Alternatives1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type__Alternatives1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type__Alternatives1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type__Alternatives1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Type__Alternatives1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__OptionAssignment_0_in_rule__ObjectMaybe__Alternatives1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__0_in_rule__ObjectMaybe__Alternatives1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_rule__ObjectMaybeInner__Alternatives1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_rule__ObjectMaybeInner__Alternatives1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_rule__ObjectMaybeInner__Alternatives1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__0__Impl_in_rule__DTDSL__Group__01880 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__1_in_rule__DTDSL__Group__01883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DTDSL__Group__0__Impl1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__1__Impl_in_rule__DTDSL__Group__11942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__2_in_rule__DTDSL__Group__11945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DTDSL__Group__1__Impl1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__2__Impl_in_rule__DTDSL__Group__22004 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__3_in_rule__DTDSL__Group__22007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__ParserNameAssignment_2_in_rule__DTDSL__Group__2__Impl2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__3__Impl_in_rule__DTDSL__Group__32064 = new BitSet(new long[]{0x0000000080840020L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__4_in_rule__DTDSL__Group__32067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DTDSL__Group__3__Impl2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__4__Impl_in_rule__DTDSL__Group__42126 = new BitSet(new long[]{0x0000000080840020L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__5_in_rule__DTDSL__Group__42129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__ObjDescriptionAssignment_4_in_rule__DTDSL__Group__4__Impl2156 = new BitSet(new long[]{0x0000000080040002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__5__Impl_in_rule__DTDSL__Group__52187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__StartAssignment_5_in_rule__DTDSL__Group__5__Impl2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__0__Impl_in_rule__StartPoint__Group_0__02256 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__1_in_rule__StartPoint__Group_0__02259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__StartPoint__Group_0__0__Impl2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__1__Impl_in_rule__StartPoint__Group_0__12318 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__2_in_rule__StartPoint__Group_0__12321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StartPoint__Group_0__1__Impl2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_0__2__Impl_in_rule__StartPoint__Group_0__22380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__BeginAssignment_0_2_in_rule__StartPoint__Group_0__2__Impl2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_1__0__Impl_in_rule__StartPoint__Group_1__02443 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_1__1_in_rule__StartPoint__Group_1__02446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__BeginAssignment_1_0_in_rule__StartPoint__Group_1__0__Impl2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group_1__1__Impl_in_rule__StartPoint__Group_1__12503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StartPoint__Group_1__1__Impl2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__0__Impl_in_rule__StringDescription__Group__02566 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__1_in_rule__StringDescription__Group__02569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StringDescription__Group__0__Impl2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__1__Impl_in_rule__StringDescription__Group__12628 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__2_in_rule__StringDescription__Group__12631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__NameAssignment_1_in_rule__StringDescription__Group__1__Impl2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__2__Impl_in_rule__StringDescription__Group__22688 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__3_in_rule__StringDescription__Group__22691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__StringDescription__Group__2__Impl2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__3__Impl_in_rule__StringDescription__Group__32750 = new BitSet(new long[]{0x000000002C000030L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__4_in_rule__StringDescription__Group__32753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StringDescription__Group__3__Impl2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__4__Impl_in_rule__StringDescription__Group__42812 = new BitSet(new long[]{0x000000002C000030L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__5_in_rule__StringDescription__Group__42815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__DescriptionAssignment_4_in_rule__StringDescription__Group__4__Impl2842 = new BitSet(new long[]{0x0000000028000032L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__5__Impl_in_rule__StringDescription__Group__52873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StringDescription__Group__5__Impl2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__Group__0__Impl_in_rule__StringKey__Group__02944 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__StringKey__Group__1_in_rule__StringKey__Group__02947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__Group__1__Impl_in_rule__StringKey__Group__13005 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__StringKey__Group__2_in_rule__StringKey__Group__13008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__Group_1__0_in_rule__StringKey__Group__1__Impl3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__Group__2__Impl_in_rule__StringKey__Group__23066 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__StringKey__Group__3_in_rule__StringKey__Group__23069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__StringKey__Group__2__Impl3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__Group__3__Impl_in_rule__StringKey__Group__33128 = new BitSet(new long[]{0x00000000000FF800L});
    public static final BitSet FOLLOW_rule__StringKey__Group__4_in_rule__StringKey__Group__33131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StringKey__Group__3__Impl3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__Group__4__Impl_in_rule__StringKey__Group__43190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__TypeAssignment_4_in_rule__StringKey__Group__4__Impl3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__Group_1__0__Impl_in_rule__StringKey__Group_1__03257 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StringKey__Group_1__1_in_rule__StringKey__Group_1__03260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__NameAssignment_1_0_in_rule__StringKey__Group_1__0__Impl3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringKey__Group_1__1__Impl_in_rule__StringKey__Group_1__13317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringKey__Group_1__1__Impl3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__0__Impl_in_rule__StringValue__Group__03380 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_rule__StringValue__Group__1_in_rule__StringValue__Group__03383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__13441 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_rule__StringValue__Group__2_in_rule__StringValue__Group__13444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group_1__0_in_rule__StringValue__Group__1__Impl3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__2__Impl_in_rule__StringValue__Group__23502 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__StringValue__Group__3_in_rule__StringValue__Group__23505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__StringValue__Group__2__Impl3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__3__Impl_in_rule__StringValue__Group__33564 = new BitSet(new long[]{0x00000000000FF800L});
    public static final BitSet FOLLOW_rule__StringValue__Group__4_in_rule__StringValue__Group__33567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StringValue__Group__3__Impl3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__4__Impl_in_rule__StringValue__Group__43626 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__StringValue__Group__5_in_rule__StringValue__Group__43629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__TypeAssignment_4_in_rule__StringValue__Group__4__Impl3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group__5__Impl_in_rule__StringValue__Group__53686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group_5__0_in_rule__StringValue__Group__5__Impl3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group_1__0__Impl_in_rule__StringValue__Group_1__03756 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StringValue__Group_1__1_in_rule__StringValue__Group_1__03759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__NameAssignment_1_0_in_rule__StringValue__Group_1__0__Impl3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group_1__1__Impl_in_rule__StringValue__Group_1__13816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringValue__Group_1__1__Impl3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group_5__0__Impl_in_rule__StringValue__Group_5__03879 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringValue__Group_5__1_in_rule__StringValue__Group_5__03882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StringValue__Group_5__0__Impl3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__Group_5__1__Impl_in_rule__StringValue__Group_5__13941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ToKeyAssignment_5_1_in_rule__StringValue__Group_5__1__Impl3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__0__Impl_in_rule__ObjectDescription__Group__04002 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__1_in_rule__ObjectDescription__Group__04005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ObjectDescription__Group__0__Impl4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__1__Impl_in_rule__ObjectDescription__Group__14064 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__2_in_rule__ObjectDescription__Group__14067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__NameAssignment_1_in_rule__ObjectDescription__Group__1__Impl4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__2__Impl_in_rule__ObjectDescription__Group__24124 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__3_in_rule__ObjectDescription__Group__24127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ObjectDescription__Group__2__Impl4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__3__Impl_in_rule__ObjectDescription__Group__34186 = new BitSet(new long[]{0x0000004D04000020L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__4_in_rule__ObjectDescription__Group__34189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ObjectDescription__Group__3__Impl4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__4__Impl_in_rule__ObjectDescription__Group__44248 = new BitSet(new long[]{0x0000004D04000020L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__5_in_rule__ObjectDescription__Group__44251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__DescriptionAssignment_4_in_rule__ObjectDescription__Group__4__Impl4278 = new BitSet(new long[]{0x0000004D00000022L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__5__Impl_in_rule__ObjectDescription__Group__54309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ObjectDescription__Group__5__Impl4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Group__0__Impl_in_rule__ObjectDescriptionInner__Group__04380 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Group__1_in_rule__ObjectDescriptionInner__Group__04383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Alternatives_0_in_rule__ObjectDescriptionInner__Group__0__Impl4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Group__1__Impl_in_rule__ObjectDescriptionInner__Group__14440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ObjectDescriptionInner__Group__1__Impl4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__0__Impl_in_rule__ObjectAttribute__Group__04503 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__1_in_rule__ObjectAttribute__Group__04506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ObjectAttribute__Group__0__Impl4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__1__Impl_in_rule__ObjectAttribute__Group__14565 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__2_in_rule__ObjectAttribute__Group__14568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__AttributesAssignment_1_in_rule__ObjectAttribute__Group__1__Impl4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__2__Impl_in_rule__ObjectAttribute__Group__24625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_2__0_in_rule__ObjectAttribute__Group__2__Impl4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_2__0__Impl_in_rule__ObjectAttribute__Group_2__04689 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_2__1_in_rule__ObjectAttribute__Group_2__04692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ObjectAttribute__Group_2__0__Impl4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group_2__1__Impl_in_rule__ObjectAttribute__Group_2__14751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__StringMethodeAssignment_2_1_in_rule__ObjectAttribute__Group_2__1__Impl4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__0__Impl_in_rule__ObjectNode__Group__04814 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__1_in_rule__ObjectNode__Group__04817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ObjectNode__Group__0__Impl4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__1__Impl_in_rule__ObjectNode__Group__14876 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__2_in_rule__ObjectNode__Group__14879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__AttributesAssignment_1_in_rule__ObjectNode__Group__1__Impl4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__2__Impl_in_rule__ObjectNode__Group__24936 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__3_in_rule__ObjectNode__Group__24939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ObjectNode__Group__2__Impl4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__3__Impl_in_rule__ObjectNode__Group__34998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__InnerAssignment_3_in_rule__ObjectNode__Group__3__Impl5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__0__Impl_in_rule__ObjectNext__Group__05063 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__1_in_rule__ObjectNext__Group__05066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ObjectNext__Group__0__Impl5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__1__Impl_in_rule__ObjectNext__Group__15125 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__2_in_rule__ObjectNext__Group__15128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__AttributeAssignment_1_in_rule__ObjectNext__Group__1__Impl5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__2__Impl_in_rule__ObjectNext__Group__25185 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__3_in_rule__ObjectNext__Group__25188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ObjectNext__Group__2__Impl5216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__3__Impl_in_rule__ObjectNext__Group__35247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__ObjectDesriptionAssignment_3_in_rule__ObjectNext__Group__3__Impl5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__0__Impl_in_rule__JavaCodeOrID__Group_0__05312 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__1_in_rule__JavaCodeOrID__Group_0__05315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__JavaCodeOrID__Group_0__0__Impl5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__1__Impl_in_rule__JavaCodeOrID__Group_0__15374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__2_in_rule__JavaCodeOrID__Group_0__15377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__JavaCodeOrID__Group_0__1__Impl5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__2__Impl_in_rule__JavaCodeOrID__Group_0__25436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__CodeAssignment_0_2_in_rule__JavaCodeOrID__Group_0__2__Impl5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMany__Group__0__Impl_in_rule__ObjectMany__Group__05499 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ObjectMany__Group__1_in_rule__ObjectMany__Group__05502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMany__OptionAssignment_0_in_rule__ObjectMany__Group__0__Impl5529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMany__Group__1__Impl_in_rule__ObjectMany__Group__15559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ObjectMany__Group__1__Impl5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__0__Impl_in_rule__ObjectChoice__Group__05622 = new BitSet(new long[]{0x0000000D00000020L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__1_in_rule__ObjectChoice__Group__05625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ObjectChoice__Group__0__Impl5653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__1__Impl_in_rule__ObjectChoice__Group__15684 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__2_in_rule__ObjectChoice__Group__15687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__OptionsAssignment_1_in_rule__ObjectChoice__Group__1__Impl5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__2__Impl_in_rule__ObjectChoice__Group__25744 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__3_in_rule__ObjectChoice__Group__25747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group_2__0_in_rule__ObjectChoice__Group__2__Impl5774 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__3__Impl_in_rule__ObjectChoice__Group__35805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ObjectChoice__Group__3__Impl5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group_2__0__Impl_in_rule__ObjectChoice__Group_2__05872 = new BitSet(new long[]{0x0000000D00000020L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group_2__1_in_rule__ObjectChoice__Group_2__05875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ObjectChoice__Group_2__0__Impl5903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group_2__1__Impl_in_rule__ObjectChoice__Group_2__15934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__OptionsAssignment_2_1_in_rule__ObjectChoice__Group_2__1__Impl5961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__0__Impl_in_rule__ObjectMaybe__Group_1__05995 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__1_in_rule__ObjectMaybe__Group_1__05998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__DescriptionAssignment_1_0_in_rule__ObjectMaybe__Group_1__0__Impl6025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__1__Impl_in_rule__ObjectMaybe__Group_1__16055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ObjectMaybe__Group_1__1__Impl6083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DTDSL__ParserNameAssignment_26123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_rule__DTDSL__ObjDescriptionAssignment_46154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartPoint_in_rule__DTDSL__StartAssignment_56185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartPoint__BeginAssignment_0_26220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartPoint__BeginAssignment_1_06259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringDescription__NameAssignment_16294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescriptionInner_in_rule__StringDescription__DescriptionAssignment_46325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringDescriptionInner__KeyRefAssignment_36360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringOverRead__OverReadAssignment6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringKey__NameAssignment_1_06426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__StringKey__TypeAssignment_46457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringValue__NameAssignment_1_06488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__StringValue__TypeAssignment_46519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringValue__ToKeyAssignment_5_16554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectDescription__NameAssignment_16589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_rule__ObjectDescription__DescriptionAssignment_46620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectAttribute__AttributesAssignment_16651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectAttribute__StringMethodeAssignment_2_16686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectNode__AttributesAssignment_16721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectNode__InnerAssignment_36756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_rule__ObjectNext__AttributeAssignment_16791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectNext__ObjectDesriptionAssignment_36826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JavaCodeOrID__CodeAssignment_0_26861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JavaCodeOrID__IdAssignment_16892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_rule__ObjectMany__OptionAssignment_06923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_rule__ObjectChoice__OptionsAssignment_16954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_rule__ObjectChoice__OptionsAssignment_2_16985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectMaybe__OptionAssignment_07020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_rule__ObjectMaybe__DescriptionAssignment_1_07055 = new BitSet(new long[]{0x0000000000000002L});

}