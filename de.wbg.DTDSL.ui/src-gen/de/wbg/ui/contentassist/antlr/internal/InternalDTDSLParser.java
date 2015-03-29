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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'javaObject'", "'string'", "'parserName'", "'='", "';'", "'parserType'", "'beginWith'", "'String'", "':'", "'{'", "'}'", "'Node'", "'hasAttribute'", "'hasNode'", "'as'", "'hasNext'", "'java'", "'*'", "'('", "')'", "'|'", "'?'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:97:1: ruleStartPoint : ( ( rule__StartPoint__Group__0 ) ) ;
    public final void ruleStartPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:101:2: ( ( ( rule__StartPoint__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:102:1: ( ( rule__StartPoint__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:102:1: ( ( rule__StartPoint__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:103:1: ( rule__StartPoint__Group__0 )
            {
             before(grammarAccess.getStartPointAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:104:1: ( rule__StartPoint__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:104:2: rule__StartPoint__Group__0
            {
            pushFollow(FOLLOW_rule__StartPoint__Group__0_in_ruleStartPoint154);
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


    // $ANTLR start "entryRuleObjectDescription"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:174:1: entryRuleObjectDescription : ruleObjectDescription EOF ;
    public final void entryRuleObjectDescription() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:175:1: ( ruleObjectDescription EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:176:1: ruleObjectDescription EOF
            {
             before(grammarAccess.getObjectDescriptionRule()); 
            pushFollow(FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription303);
            ruleObjectDescription();

            state._fsp--;

             after(grammarAccess.getObjectDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescription310); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:183:1: ruleObjectDescription : ( ( rule__ObjectDescription__Group__0 ) ) ;
    public final void ruleObjectDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:187:2: ( ( ( rule__ObjectDescription__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:188:1: ( ( rule__ObjectDescription__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:188:1: ( ( rule__ObjectDescription__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:189:1: ( rule__ObjectDescription__Group__0 )
            {
             before(grammarAccess.getObjectDescriptionAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:190:1: ( rule__ObjectDescription__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:190:2: rule__ObjectDescription__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__0_in_ruleObjectDescription336);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:204:1: entryRuleObjectDescriptionInner : ruleObjectDescriptionInner EOF ;
    public final void entryRuleObjectDescriptionInner() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:205:1: ( ruleObjectDescriptionInner EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:206:1: ruleObjectDescriptionInner EOF
            {
             before(grammarAccess.getObjectDescriptionInnerRule()); 
            pushFollow(FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner365);
            ruleObjectDescriptionInner();

            state._fsp--;

             after(grammarAccess.getObjectDescriptionInnerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescriptionInner372); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:213:1: ruleObjectDescriptionInner : ( ( rule__ObjectDescriptionInner__Group__0 ) ) ;
    public final void ruleObjectDescriptionInner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:217:2: ( ( ( rule__ObjectDescriptionInner__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:218:1: ( ( rule__ObjectDescriptionInner__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:218:1: ( ( rule__ObjectDescriptionInner__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:219:1: ( rule__ObjectDescriptionInner__Group__0 )
            {
             before(grammarAccess.getObjectDescriptionInnerAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:220:1: ( rule__ObjectDescriptionInner__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:220:2: rule__ObjectDescriptionInner__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Group__0_in_ruleObjectDescriptionInner398);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:232:1: entryRuleObjectAttribute : ruleObjectAttribute EOF ;
    public final void entryRuleObjectAttribute() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:233:1: ( ruleObjectAttribute EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:234:1: ruleObjectAttribute EOF
            {
             before(grammarAccess.getObjectAttributeRule()); 
            pushFollow(FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute425);
            ruleObjectAttribute();

            state._fsp--;

             after(grammarAccess.getObjectAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectAttribute432); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:241:1: ruleObjectAttribute : ( ( rule__ObjectAttribute__Group__0 ) ) ;
    public final void ruleObjectAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:245:2: ( ( ( rule__ObjectAttribute__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:246:1: ( ( rule__ObjectAttribute__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:246:1: ( ( rule__ObjectAttribute__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:247:1: ( rule__ObjectAttribute__Group__0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:248:1: ( rule__ObjectAttribute__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:248:2: rule__ObjectAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__0_in_ruleObjectAttribute458);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:262:1: entryRuleObjectNode : ruleObjectNode EOF ;
    public final void entryRuleObjectNode() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:263:1: ( ruleObjectNode EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:264:1: ruleObjectNode EOF
            {
             before(grammarAccess.getObjectNodeRule()); 
            pushFollow(FOLLOW_ruleObjectNode_in_entryRuleObjectNode487);
            ruleObjectNode();

            state._fsp--;

             after(grammarAccess.getObjectNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectNode494); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:271:1: ruleObjectNode : ( ( rule__ObjectNode__Group__0 ) ) ;
    public final void ruleObjectNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:275:2: ( ( ( rule__ObjectNode__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:276:1: ( ( rule__ObjectNode__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:276:1: ( ( rule__ObjectNode__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:277:1: ( rule__ObjectNode__Group__0 )
            {
             before(grammarAccess.getObjectNodeAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:278:1: ( rule__ObjectNode__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:278:2: rule__ObjectNode__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__0_in_ruleObjectNode520);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:290:1: entryRuleObjectNext : ruleObjectNext EOF ;
    public final void entryRuleObjectNext() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:291:1: ( ruleObjectNext EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:292:1: ruleObjectNext EOF
            {
             before(grammarAccess.getObjectNextRule()); 
            pushFollow(FOLLOW_ruleObjectNext_in_entryRuleObjectNext547);
            ruleObjectNext();

            state._fsp--;

             after(grammarAccess.getObjectNextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectNext554); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:299:1: ruleObjectNext : ( ( rule__ObjectNext__Group__0 ) ) ;
    public final void ruleObjectNext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:303:2: ( ( ( rule__ObjectNext__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:304:1: ( ( rule__ObjectNext__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:304:1: ( ( rule__ObjectNext__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:305:1: ( rule__ObjectNext__Group__0 )
            {
             before(grammarAccess.getObjectNextAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:306:1: ( rule__ObjectNext__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:306:2: rule__ObjectNext__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__0_in_ruleObjectNext580);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:318:1: entryRuleJavaCodeOrID : ruleJavaCodeOrID EOF ;
    public final void entryRuleJavaCodeOrID() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:319:1: ( ruleJavaCodeOrID EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:320:1: ruleJavaCodeOrID EOF
            {
             before(grammarAccess.getJavaCodeOrIDRule()); 
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID607);
            ruleJavaCodeOrID();

            state._fsp--;

             after(grammarAccess.getJavaCodeOrIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaCodeOrID614); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:327:1: ruleJavaCodeOrID : ( ( rule__JavaCodeOrID__Alternatives ) ) ;
    public final void ruleJavaCodeOrID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:331:2: ( ( ( rule__JavaCodeOrID__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:332:1: ( ( rule__JavaCodeOrID__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:332:1: ( ( rule__JavaCodeOrID__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:333:1: ( rule__JavaCodeOrID__Alternatives )
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:334:1: ( rule__JavaCodeOrID__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:334:2: rule__JavaCodeOrID__Alternatives
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Alternatives_in_ruleJavaCodeOrID640);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:346:1: entryRuleObjectMany : ruleObjectMany EOF ;
    public final void entryRuleObjectMany() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:347:1: ( ruleObjectMany EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:348:1: ruleObjectMany EOF
            {
             before(grammarAccess.getObjectManyRule()); 
            pushFollow(FOLLOW_ruleObjectMany_in_entryRuleObjectMany667);
            ruleObjectMany();

            state._fsp--;

             after(grammarAccess.getObjectManyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMany674); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:355:1: ruleObjectMany : ( ( rule__ObjectMany__Group__0 ) ) ;
    public final void ruleObjectMany() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:359:2: ( ( ( rule__ObjectMany__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:360:1: ( ( rule__ObjectMany__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:360:1: ( ( rule__ObjectMany__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:361:1: ( rule__ObjectMany__Group__0 )
            {
             before(grammarAccess.getObjectManyAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:362:1: ( rule__ObjectMany__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:362:2: rule__ObjectMany__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectMany__Group__0_in_ruleObjectMany700);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:374:1: entryRuleObjectChoice : ruleObjectChoice EOF ;
    public final void entryRuleObjectChoice() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:375:1: ( ruleObjectChoice EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:376:1: ruleObjectChoice EOF
            {
             before(grammarAccess.getObjectChoiceRule()); 
            pushFollow(FOLLOW_ruleObjectChoice_in_entryRuleObjectChoice727);
            ruleObjectChoice();

            state._fsp--;

             after(grammarAccess.getObjectChoiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectChoice734); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:383:1: ruleObjectChoice : ( ( rule__ObjectChoice__Group__0 ) ) ;
    public final void ruleObjectChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:387:2: ( ( ( rule__ObjectChoice__Group__0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:388:1: ( ( rule__ObjectChoice__Group__0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:388:1: ( ( rule__ObjectChoice__Group__0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:389:1: ( rule__ObjectChoice__Group__0 )
            {
             before(grammarAccess.getObjectChoiceAccess().getGroup()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:390:1: ( rule__ObjectChoice__Group__0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:390:2: rule__ObjectChoice__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__0_in_ruleObjectChoice760);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:402:1: entryRuleObjectMaybe : ruleObjectMaybe EOF ;
    public final void entryRuleObjectMaybe() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:403:1: ( ruleObjectMaybe EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:404:1: ruleObjectMaybe EOF
            {
             before(grammarAccess.getObjectMaybeRule()); 
            pushFollow(FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe787);
            ruleObjectMaybe();

            state._fsp--;

             after(grammarAccess.getObjectMaybeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMaybe794); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:411:1: ruleObjectMaybe : ( ( rule__ObjectMaybe__Alternatives ) ) ;
    public final void ruleObjectMaybe() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:415:2: ( ( ( rule__ObjectMaybe__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:416:1: ( ( rule__ObjectMaybe__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:416:1: ( ( rule__ObjectMaybe__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:417:1: ( rule__ObjectMaybe__Alternatives )
            {
             before(grammarAccess.getObjectMaybeAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:418:1: ( rule__ObjectMaybe__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:418:2: rule__ObjectMaybe__Alternatives
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Alternatives_in_ruleObjectMaybe820);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:430:1: entryRuleObjectMaybeInner : ruleObjectMaybeInner EOF ;
    public final void entryRuleObjectMaybeInner() throws RecognitionException {
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:431:1: ( ruleObjectMaybeInner EOF )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:432:1: ruleObjectMaybeInner EOF
            {
             before(grammarAccess.getObjectMaybeInnerRule()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_entryRuleObjectMaybeInner847);
            ruleObjectMaybeInner();

            state._fsp--;

             after(grammarAccess.getObjectMaybeInnerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMaybeInner854); 

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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:439:1: ruleObjectMaybeInner : ( ( rule__ObjectMaybeInner__Alternatives ) ) ;
    public final void ruleObjectMaybeInner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:443:2: ( ( ( rule__ObjectMaybeInner__Alternatives ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:444:1: ( ( rule__ObjectMaybeInner__Alternatives ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:444:1: ( ( rule__ObjectMaybeInner__Alternatives ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:445:1: ( rule__ObjectMaybeInner__Alternatives )
            {
             before(grammarAccess.getObjectMaybeInnerAccess().getAlternatives()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:446:1: ( rule__ObjectMaybeInner__Alternatives )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:446:2: rule__ObjectMaybeInner__Alternatives
            {
            pushFollow(FOLLOW_rule__ObjectMaybeInner__Alternatives_in_ruleObjectMaybeInner880);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:460:1: rule__DTDSL__TypeAlternatives_6_0 : ( ( 'javaObject' ) | ( 'string' ) );
    public final void rule__DTDSL__TypeAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:464:1: ( ( 'javaObject' ) | ( 'string' ) )
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
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:465:1: ( 'javaObject' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:465:1: ( 'javaObject' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:466:1: 'javaObject'
                    {
                     before(grammarAccess.getDTDSLAccess().getTypeJavaObjectKeyword_6_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__DTDSL__TypeAlternatives_6_0919); 
                     after(grammarAccess.getDTDSLAccess().getTypeJavaObjectKeyword_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:473:6: ( 'string' )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:473:6: ( 'string' )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:474:1: 'string'
                    {
                     before(grammarAccess.getDTDSLAccess().getTypeStringKeyword_6_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__DTDSL__TypeAlternatives_6_0939); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:486:1: rule__Abstract__Alternatives : ( ( ruleObjectDescription ) | ( ruleStringDescription ) );
    public final void rule__Abstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:490:1: ( ( ruleObjectDescription ) | ( ruleStringDescription ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
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
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:491:1: ( ruleObjectDescription )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:491:1: ( ruleObjectDescription )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:492:1: ruleObjectDescription
                    {
                     before(grammarAccess.getAbstractAccess().getObjectDescriptionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleObjectDescription_in_rule__Abstract__Alternatives973);
                    ruleObjectDescription();

                    state._fsp--;

                     after(grammarAccess.getAbstractAccess().getObjectDescriptionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:497:6: ( ruleStringDescription )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:497:6: ( ruleStringDescription )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:498:1: ruleStringDescription
                    {
                     before(grammarAccess.getAbstractAccess().getStringDescriptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringDescription_in_rule__Abstract__Alternatives990);
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


    // $ANTLR start "rule__ObjectDescriptionInner__Alternatives_0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:509:1: rule__ObjectDescriptionInner__Alternatives_0 : ( ( ruleObjectNode ) | ( ruleObjectAttribute ) | ( ruleObjectNext ) | ( ruleObjectMaybe ) | ( ruleObjectMany ) | ( ruleObjectChoice ) );
    public final void rule__ObjectDescriptionInner__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:513:1: ( ( ruleObjectNode ) | ( ruleObjectAttribute ) | ( ruleObjectNext ) | ( ruleObjectMaybe ) | ( ruleObjectMany ) | ( ruleObjectChoice ) )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:514:1: ( ruleObjectNode )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:514:1: ( ruleObjectNode )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:515:1: ruleObjectNode
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectNodeParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleObjectNode_in_rule__ObjectDescriptionInner__Alternatives_01023);
                    ruleObjectNode();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectNodeParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:520:6: ( ruleObjectAttribute )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:520:6: ( ruleObjectAttribute )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:521:1: ruleObjectAttribute
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectAttributeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleObjectAttribute_in_rule__ObjectDescriptionInner__Alternatives_01040);
                    ruleObjectAttribute();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectAttributeParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:526:6: ( ruleObjectNext )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:526:6: ( ruleObjectNext )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:527:1: ruleObjectNext
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectNextParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleObjectNext_in_rule__ObjectDescriptionInner__Alternatives_01057);
                    ruleObjectNext();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectNextParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:532:6: ( ruleObjectMaybe )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:532:6: ( ruleObjectMaybe )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:533:1: ruleObjectMaybe
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectMaybeParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleObjectMaybe_in_rule__ObjectDescriptionInner__Alternatives_01074);
                    ruleObjectMaybe();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectMaybeParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:538:6: ( ruleObjectMany )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:538:6: ( ruleObjectMany )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:539:1: ruleObjectMany
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectManyParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleObjectMany_in_rule__ObjectDescriptionInner__Alternatives_01091);
                    ruleObjectMany();

                    state._fsp--;

                     after(grammarAccess.getObjectDescriptionInnerAccess().getObjectManyParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:544:6: ( ruleObjectChoice )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:544:6: ( ruleObjectChoice )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:545:1: ruleObjectChoice
                    {
                     before(grammarAccess.getObjectDescriptionInnerAccess().getObjectChoiceParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_ruleObjectChoice_in_rule__ObjectDescriptionInner__Alternatives_01108);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:555:1: rule__JavaCodeOrID__Alternatives : ( ( ( rule__JavaCodeOrID__Group_0__0 ) ) | ( ( rule__JavaCodeOrID__IdAssignment_1 ) ) );
    public final void rule__JavaCodeOrID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:559:1: ( ( ( rule__JavaCodeOrID__Group_0__0 ) ) | ( ( rule__JavaCodeOrID__IdAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
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
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:560:1: ( ( rule__JavaCodeOrID__Group_0__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:560:1: ( ( rule__JavaCodeOrID__Group_0__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:561:1: ( rule__JavaCodeOrID__Group_0__0 )
                    {
                     before(grammarAccess.getJavaCodeOrIDAccess().getGroup_0()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:562:1: ( rule__JavaCodeOrID__Group_0__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:562:2: rule__JavaCodeOrID__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__0_in_rule__JavaCodeOrID__Alternatives1140);
                    rule__JavaCodeOrID__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJavaCodeOrIDAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:566:6: ( ( rule__JavaCodeOrID__IdAssignment_1 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:566:6: ( ( rule__JavaCodeOrID__IdAssignment_1 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:567:1: ( rule__JavaCodeOrID__IdAssignment_1 )
                    {
                     before(grammarAccess.getJavaCodeOrIDAccess().getIdAssignment_1()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:568:1: ( rule__JavaCodeOrID__IdAssignment_1 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:568:2: rule__JavaCodeOrID__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JavaCodeOrID__IdAssignment_1_in_rule__JavaCodeOrID__Alternatives1158);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:577:1: rule__ObjectMaybe__Alternatives : ( ( ( rule__ObjectMaybe__OptionAssignment_0 ) ) | ( ( rule__ObjectMaybe__Group_1__0 ) ) );
    public final void rule__ObjectMaybe__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:581:1: ( ( ( rule__ObjectMaybe__OptionAssignment_0 ) ) | ( ( rule__ObjectMaybe__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=23 && LA5_0<=24)||LA5_0==26) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:582:1: ( ( rule__ObjectMaybe__OptionAssignment_0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:582:1: ( ( rule__ObjectMaybe__OptionAssignment_0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:583:1: ( rule__ObjectMaybe__OptionAssignment_0 )
                    {
                     before(grammarAccess.getObjectMaybeAccess().getOptionAssignment_0()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:584:1: ( rule__ObjectMaybe__OptionAssignment_0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:584:2: rule__ObjectMaybe__OptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ObjectMaybe__OptionAssignment_0_in_rule__ObjectMaybe__Alternatives1191);
                    rule__ObjectMaybe__OptionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectMaybeAccess().getOptionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:588:6: ( ( rule__ObjectMaybe__Group_1__0 ) )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:588:6: ( ( rule__ObjectMaybe__Group_1__0 ) )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:589:1: ( rule__ObjectMaybe__Group_1__0 )
                    {
                     before(grammarAccess.getObjectMaybeAccess().getGroup_1()); 
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:590:1: ( rule__ObjectMaybe__Group_1__0 )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:590:2: rule__ObjectMaybe__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__0_in_rule__ObjectMaybe__Alternatives1209);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:599:1: rule__ObjectMaybeInner__Alternatives : ( ( ruleObjectNext ) | ( ruleObjectNode ) | ( ruleObjectAttribute ) );
    public final void rule__ObjectMaybeInner__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:603:1: ( ( ruleObjectNext ) | ( ruleObjectNode ) | ( ruleObjectAttribute ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 23:
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
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:604:1: ( ruleObjectNext )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:604:1: ( ruleObjectNext )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:605:1: ruleObjectNext
                    {
                     before(grammarAccess.getObjectMaybeInnerAccess().getObjectNextParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleObjectNext_in_rule__ObjectMaybeInner__Alternatives1242);
                    ruleObjectNext();

                    state._fsp--;

                     after(grammarAccess.getObjectMaybeInnerAccess().getObjectNextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:610:6: ( ruleObjectNode )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:610:6: ( ruleObjectNode )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:611:1: ruleObjectNode
                    {
                     before(grammarAccess.getObjectMaybeInnerAccess().getObjectNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleObjectNode_in_rule__ObjectMaybeInner__Alternatives1259);
                    ruleObjectNode();

                    state._fsp--;

                     after(grammarAccess.getObjectMaybeInnerAccess().getObjectNodeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:616:6: ( ruleObjectAttribute )
                    {
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:616:6: ( ruleObjectAttribute )
                    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:617:1: ruleObjectAttribute
                    {
                     before(grammarAccess.getObjectMaybeInnerAccess().getObjectAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleObjectAttribute_in_rule__ObjectMaybeInner__Alternatives1276);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:630:1: rule__DTDSL__Group__0 : rule__DTDSL__Group__0__Impl rule__DTDSL__Group__1 ;
    public final void rule__DTDSL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:634:1: ( rule__DTDSL__Group__0__Impl rule__DTDSL__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:635:2: rule__DTDSL__Group__0__Impl rule__DTDSL__Group__1
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__0__Impl_in_rule__DTDSL__Group__01307);
            rule__DTDSL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__1_in_rule__DTDSL__Group__01310);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:642:1: rule__DTDSL__Group__0__Impl : ( 'parserName' ) ;
    public final void rule__DTDSL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:646:1: ( ( 'parserName' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:647:1: ( 'parserName' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:647:1: ( 'parserName' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:648:1: 'parserName'
            {
             before(grammarAccess.getDTDSLAccess().getParserNameKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__DTDSL__Group__0__Impl1338); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:661:1: rule__DTDSL__Group__1 : rule__DTDSL__Group__1__Impl rule__DTDSL__Group__2 ;
    public final void rule__DTDSL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:665:1: ( rule__DTDSL__Group__1__Impl rule__DTDSL__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:666:2: rule__DTDSL__Group__1__Impl rule__DTDSL__Group__2
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__1__Impl_in_rule__DTDSL__Group__11369);
            rule__DTDSL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__2_in_rule__DTDSL__Group__11372);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:673:1: rule__DTDSL__Group__1__Impl : ( '=' ) ;
    public final void rule__DTDSL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:677:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:678:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:678:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:679:1: '='
            {
             before(grammarAccess.getDTDSLAccess().getEqualsSignKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__DTDSL__Group__1__Impl1400); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:692:1: rule__DTDSL__Group__2 : rule__DTDSL__Group__2__Impl rule__DTDSL__Group__3 ;
    public final void rule__DTDSL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:696:1: ( rule__DTDSL__Group__2__Impl rule__DTDSL__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:697:2: rule__DTDSL__Group__2__Impl rule__DTDSL__Group__3
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__2__Impl_in_rule__DTDSL__Group__21431);
            rule__DTDSL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__3_in_rule__DTDSL__Group__21434);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:704:1: rule__DTDSL__Group__2__Impl : ( ( rule__DTDSL__ParserNameAssignment_2 ) ) ;
    public final void rule__DTDSL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:708:1: ( ( ( rule__DTDSL__ParserNameAssignment_2 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:709:1: ( ( rule__DTDSL__ParserNameAssignment_2 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:709:1: ( ( rule__DTDSL__ParserNameAssignment_2 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:710:1: ( rule__DTDSL__ParserNameAssignment_2 )
            {
             before(grammarAccess.getDTDSLAccess().getParserNameAssignment_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:711:1: ( rule__DTDSL__ParserNameAssignment_2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:711:2: rule__DTDSL__ParserNameAssignment_2
            {
            pushFollow(FOLLOW_rule__DTDSL__ParserNameAssignment_2_in_rule__DTDSL__Group__2__Impl1461);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:721:1: rule__DTDSL__Group__3 : rule__DTDSL__Group__3__Impl rule__DTDSL__Group__4 ;
    public final void rule__DTDSL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:725:1: ( rule__DTDSL__Group__3__Impl rule__DTDSL__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:726:2: rule__DTDSL__Group__3__Impl rule__DTDSL__Group__4
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__3__Impl_in_rule__DTDSL__Group__31491);
            rule__DTDSL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__4_in_rule__DTDSL__Group__31494);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:733:1: rule__DTDSL__Group__3__Impl : ( ';' ) ;
    public final void rule__DTDSL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:737:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:738:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:738:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:739:1: ';'
            {
             before(grammarAccess.getDTDSLAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__DTDSL__Group__3__Impl1522); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:752:1: rule__DTDSL__Group__4 : rule__DTDSL__Group__4__Impl rule__DTDSL__Group__5 ;
    public final void rule__DTDSL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:756:1: ( rule__DTDSL__Group__4__Impl rule__DTDSL__Group__5 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:757:2: rule__DTDSL__Group__4__Impl rule__DTDSL__Group__5
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__4__Impl_in_rule__DTDSL__Group__41553);
            rule__DTDSL__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__5_in_rule__DTDSL__Group__41556);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:764:1: rule__DTDSL__Group__4__Impl : ( 'parserType' ) ;
    public final void rule__DTDSL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:768:1: ( ( 'parserType' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:769:1: ( 'parserType' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:769:1: ( 'parserType' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:770:1: 'parserType'
            {
             before(grammarAccess.getDTDSLAccess().getParserTypeKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__DTDSL__Group__4__Impl1584); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:783:1: rule__DTDSL__Group__5 : rule__DTDSL__Group__5__Impl rule__DTDSL__Group__6 ;
    public final void rule__DTDSL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:787:1: ( rule__DTDSL__Group__5__Impl rule__DTDSL__Group__6 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:788:2: rule__DTDSL__Group__5__Impl rule__DTDSL__Group__6
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__5__Impl_in_rule__DTDSL__Group__51615);
            rule__DTDSL__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__6_in_rule__DTDSL__Group__51618);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:795:1: rule__DTDSL__Group__5__Impl : ( '=' ) ;
    public final void rule__DTDSL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:799:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:800:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:800:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:801:1: '='
            {
             before(grammarAccess.getDTDSLAccess().getEqualsSignKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__DTDSL__Group__5__Impl1646); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:814:1: rule__DTDSL__Group__6 : rule__DTDSL__Group__6__Impl rule__DTDSL__Group__7 ;
    public final void rule__DTDSL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:818:1: ( rule__DTDSL__Group__6__Impl rule__DTDSL__Group__7 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:819:2: rule__DTDSL__Group__6__Impl rule__DTDSL__Group__7
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__6__Impl_in_rule__DTDSL__Group__61677);
            rule__DTDSL__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__7_in_rule__DTDSL__Group__61680);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:826:1: rule__DTDSL__Group__6__Impl : ( ( rule__DTDSL__TypeAssignment_6 ) ) ;
    public final void rule__DTDSL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:830:1: ( ( ( rule__DTDSL__TypeAssignment_6 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:831:1: ( ( rule__DTDSL__TypeAssignment_6 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:831:1: ( ( rule__DTDSL__TypeAssignment_6 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:832:1: ( rule__DTDSL__TypeAssignment_6 )
            {
             before(grammarAccess.getDTDSLAccess().getTypeAssignment_6()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:833:1: ( rule__DTDSL__TypeAssignment_6 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:833:2: rule__DTDSL__TypeAssignment_6
            {
            pushFollow(FOLLOW_rule__DTDSL__TypeAssignment_6_in_rule__DTDSL__Group__6__Impl1707);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:843:1: rule__DTDSL__Group__7 : rule__DTDSL__Group__7__Impl rule__DTDSL__Group__8 ;
    public final void rule__DTDSL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:847:1: ( rule__DTDSL__Group__7__Impl rule__DTDSL__Group__8 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:848:2: rule__DTDSL__Group__7__Impl rule__DTDSL__Group__8
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__7__Impl_in_rule__DTDSL__Group__71737);
            rule__DTDSL__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__8_in_rule__DTDSL__Group__71740);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:855:1: rule__DTDSL__Group__7__Impl : ( ';' ) ;
    public final void rule__DTDSL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:859:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:860:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:860:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:861:1: ';'
            {
             before(grammarAccess.getDTDSLAccess().getSemicolonKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__DTDSL__Group__7__Impl1768); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:874:1: rule__DTDSL__Group__8 : rule__DTDSL__Group__8__Impl rule__DTDSL__Group__9 ;
    public final void rule__DTDSL__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:878:1: ( rule__DTDSL__Group__8__Impl rule__DTDSL__Group__9 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:879:2: rule__DTDSL__Group__8__Impl rule__DTDSL__Group__9
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__8__Impl_in_rule__DTDSL__Group__81799);
            rule__DTDSL__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DTDSL__Group__9_in_rule__DTDSL__Group__81802);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:886:1: rule__DTDSL__Group__8__Impl : ( ( rule__DTDSL__ObjDescriptionAssignment_8 )* ) ;
    public final void rule__DTDSL__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:890:1: ( ( ( rule__DTDSL__ObjDescriptionAssignment_8 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:891:1: ( ( rule__DTDSL__ObjDescriptionAssignment_8 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:891:1: ( ( rule__DTDSL__ObjDescriptionAssignment_8 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:892:1: ( rule__DTDSL__ObjDescriptionAssignment_8 )*
            {
             before(grammarAccess.getDTDSLAccess().getObjDescriptionAssignment_8()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:893:1: ( rule__DTDSL__ObjDescriptionAssignment_8 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18||LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:893:2: rule__DTDSL__ObjDescriptionAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__DTDSL__ObjDescriptionAssignment_8_in_rule__DTDSL__Group__8__Impl1829);
            	    rule__DTDSL__ObjDescriptionAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:903:1: rule__DTDSL__Group__9 : rule__DTDSL__Group__9__Impl ;
    public final void rule__DTDSL__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:907:1: ( rule__DTDSL__Group__9__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:908:2: rule__DTDSL__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__DTDSL__Group__9__Impl_in_rule__DTDSL__Group__91860);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:914:1: rule__DTDSL__Group__9__Impl : ( ( rule__DTDSL__StartAssignment_9 ) ) ;
    public final void rule__DTDSL__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:918:1: ( ( ( rule__DTDSL__StartAssignment_9 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:919:1: ( ( rule__DTDSL__StartAssignment_9 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:919:1: ( ( rule__DTDSL__StartAssignment_9 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:920:1: ( rule__DTDSL__StartAssignment_9 )
            {
             before(grammarAccess.getDTDSLAccess().getStartAssignment_9()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:921:1: ( rule__DTDSL__StartAssignment_9 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:921:2: rule__DTDSL__StartAssignment_9
            {
            pushFollow(FOLLOW_rule__DTDSL__StartAssignment_9_in_rule__DTDSL__Group__9__Impl1887);
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


    // $ANTLR start "rule__StartPoint__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:951:1: rule__StartPoint__Group__0 : rule__StartPoint__Group__0__Impl rule__StartPoint__Group__1 ;
    public final void rule__StartPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:955:1: ( rule__StartPoint__Group__0__Impl rule__StartPoint__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:956:2: rule__StartPoint__Group__0__Impl rule__StartPoint__Group__1
            {
            pushFollow(FOLLOW_rule__StartPoint__Group__0__Impl_in_rule__StartPoint__Group__01937);
            rule__StartPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartPoint__Group__1_in_rule__StartPoint__Group__01940);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:963:1: rule__StartPoint__Group__0__Impl : ( 'beginWith' ) ;
    public final void rule__StartPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:967:1: ( ( 'beginWith' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:968:1: ( 'beginWith' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:968:1: ( 'beginWith' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:969:1: 'beginWith'
            {
             before(grammarAccess.getStartPointAccess().getBeginWithKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__StartPoint__Group__0__Impl1968); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:982:1: rule__StartPoint__Group__1 : rule__StartPoint__Group__1__Impl rule__StartPoint__Group__2 ;
    public final void rule__StartPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:986:1: ( rule__StartPoint__Group__1__Impl rule__StartPoint__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:987:2: rule__StartPoint__Group__1__Impl rule__StartPoint__Group__2
            {
            pushFollow(FOLLOW_rule__StartPoint__Group__1__Impl_in_rule__StartPoint__Group__11999);
            rule__StartPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartPoint__Group__2_in_rule__StartPoint__Group__12002);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:994:1: rule__StartPoint__Group__1__Impl : ( '=' ) ;
    public final void rule__StartPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:998:1: ( ( '=' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:999:1: ( '=' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:999:1: ( '=' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1000:1: '='
            {
             before(grammarAccess.getStartPointAccess().getEqualsSignKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__StartPoint__Group__1__Impl2030); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1013:1: rule__StartPoint__Group__2 : rule__StartPoint__Group__2__Impl rule__StartPoint__Group__3 ;
    public final void rule__StartPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1017:1: ( rule__StartPoint__Group__2__Impl rule__StartPoint__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1018:2: rule__StartPoint__Group__2__Impl rule__StartPoint__Group__3
            {
            pushFollow(FOLLOW_rule__StartPoint__Group__2__Impl_in_rule__StartPoint__Group__22061);
            rule__StartPoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartPoint__Group__3_in_rule__StartPoint__Group__22064);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1025:1: rule__StartPoint__Group__2__Impl : ( ( rule__StartPoint__BeginAssignment_2 ) ) ;
    public final void rule__StartPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1029:1: ( ( ( rule__StartPoint__BeginAssignment_2 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1030:1: ( ( rule__StartPoint__BeginAssignment_2 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1030:1: ( ( rule__StartPoint__BeginAssignment_2 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1031:1: ( rule__StartPoint__BeginAssignment_2 )
            {
             before(grammarAccess.getStartPointAccess().getBeginAssignment_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1032:1: ( rule__StartPoint__BeginAssignment_2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1032:2: rule__StartPoint__BeginAssignment_2
            {
            pushFollow(FOLLOW_rule__StartPoint__BeginAssignment_2_in_rule__StartPoint__Group__2__Impl2091);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1042:1: rule__StartPoint__Group__3 : rule__StartPoint__Group__3__Impl ;
    public final void rule__StartPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1046:1: ( rule__StartPoint__Group__3__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1047:2: rule__StartPoint__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StartPoint__Group__3__Impl_in_rule__StartPoint__Group__32121);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1053:1: rule__StartPoint__Group__3__Impl : ( ';' ) ;
    public final void rule__StartPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1057:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1058:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1058:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1059:1: ';'
            {
             before(grammarAccess.getStartPointAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__StartPoint__Group__3__Impl2149); 
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


    // $ANTLR start "rule__StringDescription__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1080:1: rule__StringDescription__Group__0 : rule__StringDescription__Group__0__Impl rule__StringDescription__Group__1 ;
    public final void rule__StringDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1084:1: ( rule__StringDescription__Group__0__Impl rule__StringDescription__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1085:2: rule__StringDescription__Group__0__Impl rule__StringDescription__Group__1
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__0__Impl_in_rule__StringDescription__Group__02188);
            rule__StringDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__1_in_rule__StringDescription__Group__02191);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1092:1: rule__StringDescription__Group__0__Impl : ( 'String' ) ;
    public final void rule__StringDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1096:1: ( ( 'String' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1097:1: ( 'String' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1097:1: ( 'String' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1098:1: 'String'
            {
             before(grammarAccess.getStringDescriptionAccess().getStringKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__StringDescription__Group__0__Impl2219); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1111:1: rule__StringDescription__Group__1 : rule__StringDescription__Group__1__Impl rule__StringDescription__Group__2 ;
    public final void rule__StringDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1115:1: ( rule__StringDescription__Group__1__Impl rule__StringDescription__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1116:2: rule__StringDescription__Group__1__Impl rule__StringDescription__Group__2
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__1__Impl_in_rule__StringDescription__Group__12250);
            rule__StringDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__2_in_rule__StringDescription__Group__12253);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1123:1: rule__StringDescription__Group__1__Impl : ( ( rule__StringDescription__NameAssignment_1 ) ) ;
    public final void rule__StringDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1127:1: ( ( ( rule__StringDescription__NameAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1128:1: ( ( rule__StringDescription__NameAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1128:1: ( ( rule__StringDescription__NameAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1129:1: ( rule__StringDescription__NameAssignment_1 )
            {
             before(grammarAccess.getStringDescriptionAccess().getNameAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1130:1: ( rule__StringDescription__NameAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1130:2: rule__StringDescription__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StringDescription__NameAssignment_1_in_rule__StringDescription__Group__1__Impl2280);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1140:1: rule__StringDescription__Group__2 : rule__StringDescription__Group__2__Impl rule__StringDescription__Group__3 ;
    public final void rule__StringDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1144:1: ( rule__StringDescription__Group__2__Impl rule__StringDescription__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1145:2: rule__StringDescription__Group__2__Impl rule__StringDescription__Group__3
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__2__Impl_in_rule__StringDescription__Group__22310);
            rule__StringDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__3_in_rule__StringDescription__Group__22313);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1152:1: rule__StringDescription__Group__2__Impl : ( ':' ) ;
    public final void rule__StringDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1156:1: ( ( ':' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1157:1: ( ':' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1157:1: ( ':' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1158:1: ':'
            {
             before(grammarAccess.getStringDescriptionAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__StringDescription__Group__2__Impl2341); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1171:1: rule__StringDescription__Group__3 : rule__StringDescription__Group__3__Impl rule__StringDescription__Group__4 ;
    public final void rule__StringDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1175:1: ( rule__StringDescription__Group__3__Impl rule__StringDescription__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1176:2: rule__StringDescription__Group__3__Impl rule__StringDescription__Group__4
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__3__Impl_in_rule__StringDescription__Group__32372);
            rule__StringDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringDescription__Group__4_in_rule__StringDescription__Group__32375);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1183:1: rule__StringDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__StringDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1187:1: ( ( '{' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1188:1: ( '{' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1188:1: ( '{' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1189:1: '{'
            {
             before(grammarAccess.getStringDescriptionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__StringDescription__Group__3__Impl2403); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1202:1: rule__StringDescription__Group__4 : rule__StringDescription__Group__4__Impl ;
    public final void rule__StringDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1206:1: ( rule__StringDescription__Group__4__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1207:2: rule__StringDescription__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StringDescription__Group__4__Impl_in_rule__StringDescription__Group__42434);
            rule__StringDescription__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1213:1: rule__StringDescription__Group__4__Impl : ( '}' ) ;
    public final void rule__StringDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1217:1: ( ( '}' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1218:1: ( '}' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1218:1: ( '}' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1219:1: '}'
            {
             before(grammarAccess.getStringDescriptionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__StringDescription__Group__4__Impl2462); 
             after(grammarAccess.getStringDescriptionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ObjectDescription__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1242:1: rule__ObjectDescription__Group__0 : rule__ObjectDescription__Group__0__Impl rule__ObjectDescription__Group__1 ;
    public final void rule__ObjectDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1246:1: ( rule__ObjectDescription__Group__0__Impl rule__ObjectDescription__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1247:2: rule__ObjectDescription__Group__0__Impl rule__ObjectDescription__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__0__Impl_in_rule__ObjectDescription__Group__02503);
            rule__ObjectDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__1_in_rule__ObjectDescription__Group__02506);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1254:1: rule__ObjectDescription__Group__0__Impl : ( 'Node' ) ;
    public final void rule__ObjectDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1258:1: ( ( 'Node' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1259:1: ( 'Node' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1259:1: ( 'Node' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1260:1: 'Node'
            {
             before(grammarAccess.getObjectDescriptionAccess().getNodeKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ObjectDescription__Group__0__Impl2534); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1273:1: rule__ObjectDescription__Group__1 : rule__ObjectDescription__Group__1__Impl rule__ObjectDescription__Group__2 ;
    public final void rule__ObjectDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1277:1: ( rule__ObjectDescription__Group__1__Impl rule__ObjectDescription__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1278:2: rule__ObjectDescription__Group__1__Impl rule__ObjectDescription__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__1__Impl_in_rule__ObjectDescription__Group__12565);
            rule__ObjectDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__2_in_rule__ObjectDescription__Group__12568);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1285:1: rule__ObjectDescription__Group__1__Impl : ( ( rule__ObjectDescription__NameAssignment_1 ) ) ;
    public final void rule__ObjectDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1289:1: ( ( ( rule__ObjectDescription__NameAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1290:1: ( ( rule__ObjectDescription__NameAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1290:1: ( ( rule__ObjectDescription__NameAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1291:1: ( rule__ObjectDescription__NameAssignment_1 )
            {
             before(grammarAccess.getObjectDescriptionAccess().getNameAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1292:1: ( rule__ObjectDescription__NameAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1292:2: rule__ObjectDescription__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectDescription__NameAssignment_1_in_rule__ObjectDescription__Group__1__Impl2595);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1302:1: rule__ObjectDescription__Group__2 : rule__ObjectDescription__Group__2__Impl rule__ObjectDescription__Group__3 ;
    public final void rule__ObjectDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1306:1: ( rule__ObjectDescription__Group__2__Impl rule__ObjectDescription__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1307:2: rule__ObjectDescription__Group__2__Impl rule__ObjectDescription__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__2__Impl_in_rule__ObjectDescription__Group__22625);
            rule__ObjectDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__3_in_rule__ObjectDescription__Group__22628);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1314:1: rule__ObjectDescription__Group__2__Impl : ( ':' ) ;
    public final void rule__ObjectDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1318:1: ( ( ':' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1319:1: ( ':' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1319:1: ( ':' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1320:1: ':'
            {
             before(grammarAccess.getObjectDescriptionAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__ObjectDescription__Group__2__Impl2656); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1333:1: rule__ObjectDescription__Group__3 : rule__ObjectDescription__Group__3__Impl rule__ObjectDescription__Group__4 ;
    public final void rule__ObjectDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1337:1: ( rule__ObjectDescription__Group__3__Impl rule__ObjectDescription__Group__4 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1338:2: rule__ObjectDescription__Group__3__Impl rule__ObjectDescription__Group__4
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__3__Impl_in_rule__ObjectDescription__Group__32687);
            rule__ObjectDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__4_in_rule__ObjectDescription__Group__32690);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1345:1: rule__ObjectDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__ObjectDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1349:1: ( ( '{' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1350:1: ( '{' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1350:1: ( '{' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1351:1: '{'
            {
             before(grammarAccess.getObjectDescriptionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__ObjectDescription__Group__3__Impl2718); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1364:1: rule__ObjectDescription__Group__4 : rule__ObjectDescription__Group__4__Impl rule__ObjectDescription__Group__5 ;
    public final void rule__ObjectDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1368:1: ( rule__ObjectDescription__Group__4__Impl rule__ObjectDescription__Group__5 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1369:2: rule__ObjectDescription__Group__4__Impl rule__ObjectDescription__Group__5
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__4__Impl_in_rule__ObjectDescription__Group__42749);
            rule__ObjectDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescription__Group__5_in_rule__ObjectDescription__Group__42752);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1376:1: rule__ObjectDescription__Group__4__Impl : ( ( rule__ObjectDescription__DescriptionAssignment_4 )* ) ;
    public final void rule__ObjectDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1380:1: ( ( ( rule__ObjectDescription__DescriptionAssignment_4 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1381:1: ( ( rule__ObjectDescription__DescriptionAssignment_4 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1381:1: ( ( rule__ObjectDescription__DescriptionAssignment_4 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1382:1: ( rule__ObjectDescription__DescriptionAssignment_4 )*
            {
             before(grammarAccess.getObjectDescriptionAccess().getDescriptionAssignment_4()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1383:1: ( rule__ObjectDescription__DescriptionAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=23 && LA8_0<=24)||LA8_0==26||LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1383:2: rule__ObjectDescription__DescriptionAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ObjectDescription__DescriptionAssignment_4_in_rule__ObjectDescription__Group__4__Impl2779);
            	    rule__ObjectDescription__DescriptionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1393:1: rule__ObjectDescription__Group__5 : rule__ObjectDescription__Group__5__Impl ;
    public final void rule__ObjectDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1397:1: ( rule__ObjectDescription__Group__5__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1398:2: rule__ObjectDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ObjectDescription__Group__5__Impl_in_rule__ObjectDescription__Group__52810);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1404:1: rule__ObjectDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__ObjectDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1408:1: ( ( '}' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1409:1: ( '}' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1409:1: ( '}' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1410:1: '}'
            {
             before(grammarAccess.getObjectDescriptionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__ObjectDescription__Group__5__Impl2838); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1435:1: rule__ObjectDescriptionInner__Group__0 : rule__ObjectDescriptionInner__Group__0__Impl rule__ObjectDescriptionInner__Group__1 ;
    public final void rule__ObjectDescriptionInner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1439:1: ( rule__ObjectDescriptionInner__Group__0__Impl rule__ObjectDescriptionInner__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1440:2: rule__ObjectDescriptionInner__Group__0__Impl rule__ObjectDescriptionInner__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Group__0__Impl_in_rule__ObjectDescriptionInner__Group__02881);
            rule__ObjectDescriptionInner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Group__1_in_rule__ObjectDescriptionInner__Group__02884);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1447:1: rule__ObjectDescriptionInner__Group__0__Impl : ( ( rule__ObjectDescriptionInner__Alternatives_0 ) ) ;
    public final void rule__ObjectDescriptionInner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1451:1: ( ( ( rule__ObjectDescriptionInner__Alternatives_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1452:1: ( ( rule__ObjectDescriptionInner__Alternatives_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1452:1: ( ( rule__ObjectDescriptionInner__Alternatives_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1453:1: ( rule__ObjectDescriptionInner__Alternatives_0 )
            {
             before(grammarAccess.getObjectDescriptionInnerAccess().getAlternatives_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1454:1: ( rule__ObjectDescriptionInner__Alternatives_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1454:2: rule__ObjectDescriptionInner__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Alternatives_0_in_rule__ObjectDescriptionInner__Group__0__Impl2911);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1464:1: rule__ObjectDescriptionInner__Group__1 : rule__ObjectDescriptionInner__Group__1__Impl ;
    public final void rule__ObjectDescriptionInner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1468:1: ( rule__ObjectDescriptionInner__Group__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1469:2: rule__ObjectDescriptionInner__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectDescriptionInner__Group__1__Impl_in_rule__ObjectDescriptionInner__Group__12941);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1475:1: rule__ObjectDescriptionInner__Group__1__Impl : ( ';' ) ;
    public final void rule__ObjectDescriptionInner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1479:1: ( ( ';' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1480:1: ( ';' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1480:1: ( ';' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1481:1: ';'
            {
             before(grammarAccess.getObjectDescriptionInnerAccess().getSemicolonKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__ObjectDescriptionInner__Group__1__Impl2969); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1498:1: rule__ObjectAttribute__Group__0 : rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 ;
    public final void rule__ObjectAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1502:1: ( rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1503:2: rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__0__Impl_in_rule__ObjectAttribute__Group__03004);
            rule__ObjectAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectAttribute__Group__1_in_rule__ObjectAttribute__Group__03007);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1510:1: rule__ObjectAttribute__Group__0__Impl : ( 'hasAttribute' ) ;
    public final void rule__ObjectAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1514:1: ( ( 'hasAttribute' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1515:1: ( 'hasAttribute' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1515:1: ( 'hasAttribute' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1516:1: 'hasAttribute'
            {
             before(grammarAccess.getObjectAttributeAccess().getHasAttributeKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__ObjectAttribute__Group__0__Impl3035); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1529:1: rule__ObjectAttribute__Group__1 : rule__ObjectAttribute__Group__1__Impl ;
    public final void rule__ObjectAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1533:1: ( rule__ObjectAttribute__Group__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1534:2: rule__ObjectAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__Group__1__Impl_in_rule__ObjectAttribute__Group__13066);
            rule__ObjectAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1540:1: rule__ObjectAttribute__Group__1__Impl : ( ( rule__ObjectAttribute__AttributesAssignment_1 ) ) ;
    public final void rule__ObjectAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1544:1: ( ( ( rule__ObjectAttribute__AttributesAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1545:1: ( ( rule__ObjectAttribute__AttributesAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1545:1: ( ( rule__ObjectAttribute__AttributesAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1546:1: ( rule__ObjectAttribute__AttributesAssignment_1 )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributesAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1547:1: ( rule__ObjectAttribute__AttributesAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1547:2: rule__ObjectAttribute__AttributesAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectAttribute__AttributesAssignment_1_in_rule__ObjectAttribute__Group__1__Impl3093);
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


    // $ANTLR start "rule__ObjectNode__Group__0"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1563:1: rule__ObjectNode__Group__0 : rule__ObjectNode__Group__0__Impl rule__ObjectNode__Group__1 ;
    public final void rule__ObjectNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1567:1: ( rule__ObjectNode__Group__0__Impl rule__ObjectNode__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1568:2: rule__ObjectNode__Group__0__Impl rule__ObjectNode__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__0__Impl_in_rule__ObjectNode__Group__03129);
            rule__ObjectNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNode__Group__1_in_rule__ObjectNode__Group__03132);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1575:1: rule__ObjectNode__Group__0__Impl : ( 'hasNode' ) ;
    public final void rule__ObjectNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1579:1: ( ( 'hasNode' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1580:1: ( 'hasNode' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1580:1: ( 'hasNode' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1581:1: 'hasNode'
            {
             before(grammarAccess.getObjectNodeAccess().getHasNodeKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ObjectNode__Group__0__Impl3160); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1594:1: rule__ObjectNode__Group__1 : rule__ObjectNode__Group__1__Impl rule__ObjectNode__Group__2 ;
    public final void rule__ObjectNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1598:1: ( rule__ObjectNode__Group__1__Impl rule__ObjectNode__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1599:2: rule__ObjectNode__Group__1__Impl rule__ObjectNode__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__1__Impl_in_rule__ObjectNode__Group__13191);
            rule__ObjectNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNode__Group__2_in_rule__ObjectNode__Group__13194);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1606:1: rule__ObjectNode__Group__1__Impl : ( ( rule__ObjectNode__AttributesAssignment_1 ) ) ;
    public final void rule__ObjectNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1610:1: ( ( ( rule__ObjectNode__AttributesAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1611:1: ( ( rule__ObjectNode__AttributesAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1611:1: ( ( rule__ObjectNode__AttributesAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1612:1: ( rule__ObjectNode__AttributesAssignment_1 )
            {
             before(grammarAccess.getObjectNodeAccess().getAttributesAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1613:1: ( rule__ObjectNode__AttributesAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1613:2: rule__ObjectNode__AttributesAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectNode__AttributesAssignment_1_in_rule__ObjectNode__Group__1__Impl3221);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1623:1: rule__ObjectNode__Group__2 : rule__ObjectNode__Group__2__Impl rule__ObjectNode__Group__3 ;
    public final void rule__ObjectNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1627:1: ( rule__ObjectNode__Group__2__Impl rule__ObjectNode__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1628:2: rule__ObjectNode__Group__2__Impl rule__ObjectNode__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__2__Impl_in_rule__ObjectNode__Group__23251);
            rule__ObjectNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNode__Group__3_in_rule__ObjectNode__Group__23254);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1635:1: rule__ObjectNode__Group__2__Impl : ( 'as' ) ;
    public final void rule__ObjectNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1639:1: ( ( 'as' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1640:1: ( 'as' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1640:1: ( 'as' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1641:1: 'as'
            {
             before(grammarAccess.getObjectNodeAccess().getAsKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__ObjectNode__Group__2__Impl3282); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1654:1: rule__ObjectNode__Group__3 : rule__ObjectNode__Group__3__Impl ;
    public final void rule__ObjectNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1658:1: ( rule__ObjectNode__Group__3__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1659:2: rule__ObjectNode__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ObjectNode__Group__3__Impl_in_rule__ObjectNode__Group__33313);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1665:1: rule__ObjectNode__Group__3__Impl : ( ( rule__ObjectNode__InnerAssignment_3 ) ) ;
    public final void rule__ObjectNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1669:1: ( ( ( rule__ObjectNode__InnerAssignment_3 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1670:1: ( ( rule__ObjectNode__InnerAssignment_3 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1670:1: ( ( rule__ObjectNode__InnerAssignment_3 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1671:1: ( rule__ObjectNode__InnerAssignment_3 )
            {
             before(grammarAccess.getObjectNodeAccess().getInnerAssignment_3()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1672:1: ( rule__ObjectNode__InnerAssignment_3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1672:2: rule__ObjectNode__InnerAssignment_3
            {
            pushFollow(FOLLOW_rule__ObjectNode__InnerAssignment_3_in_rule__ObjectNode__Group__3__Impl3340);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1690:1: rule__ObjectNext__Group__0 : rule__ObjectNext__Group__0__Impl rule__ObjectNext__Group__1 ;
    public final void rule__ObjectNext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1694:1: ( rule__ObjectNext__Group__0__Impl rule__ObjectNext__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1695:2: rule__ObjectNext__Group__0__Impl rule__ObjectNext__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__0__Impl_in_rule__ObjectNext__Group__03378);
            rule__ObjectNext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNext__Group__1_in_rule__ObjectNext__Group__03381);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1702:1: rule__ObjectNext__Group__0__Impl : ( 'hasNext' ) ;
    public final void rule__ObjectNext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1706:1: ( ( 'hasNext' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1707:1: ( 'hasNext' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1707:1: ( 'hasNext' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1708:1: 'hasNext'
            {
             before(grammarAccess.getObjectNextAccess().getHasNextKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__ObjectNext__Group__0__Impl3409); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1721:1: rule__ObjectNext__Group__1 : rule__ObjectNext__Group__1__Impl rule__ObjectNext__Group__2 ;
    public final void rule__ObjectNext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1725:1: ( rule__ObjectNext__Group__1__Impl rule__ObjectNext__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1726:2: rule__ObjectNext__Group__1__Impl rule__ObjectNext__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__1__Impl_in_rule__ObjectNext__Group__13440);
            rule__ObjectNext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNext__Group__2_in_rule__ObjectNext__Group__13443);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1733:1: rule__ObjectNext__Group__1__Impl : ( ( rule__ObjectNext__AttributeAssignment_1 ) ) ;
    public final void rule__ObjectNext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1737:1: ( ( ( rule__ObjectNext__AttributeAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1738:1: ( ( rule__ObjectNext__AttributeAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1738:1: ( ( rule__ObjectNext__AttributeAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1739:1: ( rule__ObjectNext__AttributeAssignment_1 )
            {
             before(grammarAccess.getObjectNextAccess().getAttributeAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1740:1: ( rule__ObjectNext__AttributeAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1740:2: rule__ObjectNext__AttributeAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectNext__AttributeAssignment_1_in_rule__ObjectNext__Group__1__Impl3470);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1750:1: rule__ObjectNext__Group__2 : rule__ObjectNext__Group__2__Impl rule__ObjectNext__Group__3 ;
    public final void rule__ObjectNext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1754:1: ( rule__ObjectNext__Group__2__Impl rule__ObjectNext__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1755:2: rule__ObjectNext__Group__2__Impl rule__ObjectNext__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__2__Impl_in_rule__ObjectNext__Group__23500);
            rule__ObjectNext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectNext__Group__3_in_rule__ObjectNext__Group__23503);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1762:1: rule__ObjectNext__Group__2__Impl : ( 'as' ) ;
    public final void rule__ObjectNext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1766:1: ( ( 'as' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1767:1: ( 'as' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1767:1: ( 'as' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1768:1: 'as'
            {
             before(grammarAccess.getObjectNextAccess().getAsKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__ObjectNext__Group__2__Impl3531); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1781:1: rule__ObjectNext__Group__3 : rule__ObjectNext__Group__3__Impl ;
    public final void rule__ObjectNext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1785:1: ( rule__ObjectNext__Group__3__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1786:2: rule__ObjectNext__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ObjectNext__Group__3__Impl_in_rule__ObjectNext__Group__33562);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1792:1: rule__ObjectNext__Group__3__Impl : ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) ) ;
    public final void rule__ObjectNext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1796:1: ( ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1797:1: ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1797:1: ( ( rule__ObjectNext__ObjectDesriptionAssignment_3 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1798:1: ( rule__ObjectNext__ObjectDesriptionAssignment_3 )
            {
             before(grammarAccess.getObjectNextAccess().getObjectDesriptionAssignment_3()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1799:1: ( rule__ObjectNext__ObjectDesriptionAssignment_3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1799:2: rule__ObjectNext__ObjectDesriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__ObjectNext__ObjectDesriptionAssignment_3_in_rule__ObjectNext__Group__3__Impl3589);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1817:1: rule__JavaCodeOrID__Group_0__0 : rule__JavaCodeOrID__Group_0__0__Impl rule__JavaCodeOrID__Group_0__1 ;
    public final void rule__JavaCodeOrID__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1821:1: ( rule__JavaCodeOrID__Group_0__0__Impl rule__JavaCodeOrID__Group_0__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1822:2: rule__JavaCodeOrID__Group_0__0__Impl rule__JavaCodeOrID__Group_0__1
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__0__Impl_in_rule__JavaCodeOrID__Group_0__03627);
            rule__JavaCodeOrID__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__1_in_rule__JavaCodeOrID__Group_0__03630);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1829:1: rule__JavaCodeOrID__Group_0__0__Impl : ( 'java' ) ;
    public final void rule__JavaCodeOrID__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1833:1: ( ( 'java' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1834:1: ( 'java' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1834:1: ( 'java' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1835:1: 'java'
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getJavaKeyword_0_0()); 
            match(input,27,FOLLOW_27_in_rule__JavaCodeOrID__Group_0__0__Impl3658); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1848:1: rule__JavaCodeOrID__Group_0__1 : rule__JavaCodeOrID__Group_0__1__Impl rule__JavaCodeOrID__Group_0__2 ;
    public final void rule__JavaCodeOrID__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1852:1: ( rule__JavaCodeOrID__Group_0__1__Impl rule__JavaCodeOrID__Group_0__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1853:2: rule__JavaCodeOrID__Group_0__1__Impl rule__JavaCodeOrID__Group_0__2
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__1__Impl_in_rule__JavaCodeOrID__Group_0__13689);
            rule__JavaCodeOrID__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__2_in_rule__JavaCodeOrID__Group_0__13692);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1860:1: rule__JavaCodeOrID__Group_0__1__Impl : ( ':' ) ;
    public final void rule__JavaCodeOrID__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1864:1: ( ( ':' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1865:1: ( ':' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1865:1: ( ':' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1866:1: ':'
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getColonKeyword_0_1()); 
            match(input,19,FOLLOW_19_in_rule__JavaCodeOrID__Group_0__1__Impl3720); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1879:1: rule__JavaCodeOrID__Group_0__2 : rule__JavaCodeOrID__Group_0__2__Impl ;
    public final void rule__JavaCodeOrID__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1883:1: ( rule__JavaCodeOrID__Group_0__2__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1884:2: rule__JavaCodeOrID__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__Group_0__2__Impl_in_rule__JavaCodeOrID__Group_0__23751);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1890:1: rule__JavaCodeOrID__Group_0__2__Impl : ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) ) ;
    public final void rule__JavaCodeOrID__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1894:1: ( ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1895:1: ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1895:1: ( ( rule__JavaCodeOrID__CodeAssignment_0_2 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1896:1: ( rule__JavaCodeOrID__CodeAssignment_0_2 )
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getCodeAssignment_0_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1897:1: ( rule__JavaCodeOrID__CodeAssignment_0_2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1897:2: rule__JavaCodeOrID__CodeAssignment_0_2
            {
            pushFollow(FOLLOW_rule__JavaCodeOrID__CodeAssignment_0_2_in_rule__JavaCodeOrID__Group_0__2__Impl3778);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1913:1: rule__ObjectMany__Group__0 : rule__ObjectMany__Group__0__Impl rule__ObjectMany__Group__1 ;
    public final void rule__ObjectMany__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1917:1: ( rule__ObjectMany__Group__0__Impl rule__ObjectMany__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1918:2: rule__ObjectMany__Group__0__Impl rule__ObjectMany__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectMany__Group__0__Impl_in_rule__ObjectMany__Group__03814);
            rule__ObjectMany__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectMany__Group__1_in_rule__ObjectMany__Group__03817);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1925:1: rule__ObjectMany__Group__0__Impl : ( ( rule__ObjectMany__OptionAssignment_0 ) ) ;
    public final void rule__ObjectMany__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1929:1: ( ( ( rule__ObjectMany__OptionAssignment_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1930:1: ( ( rule__ObjectMany__OptionAssignment_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1930:1: ( ( rule__ObjectMany__OptionAssignment_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1931:1: ( rule__ObjectMany__OptionAssignment_0 )
            {
             before(grammarAccess.getObjectManyAccess().getOptionAssignment_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1932:1: ( rule__ObjectMany__OptionAssignment_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1932:2: rule__ObjectMany__OptionAssignment_0
            {
            pushFollow(FOLLOW_rule__ObjectMany__OptionAssignment_0_in_rule__ObjectMany__Group__0__Impl3844);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1942:1: rule__ObjectMany__Group__1 : rule__ObjectMany__Group__1__Impl ;
    public final void rule__ObjectMany__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1946:1: ( rule__ObjectMany__Group__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1947:2: rule__ObjectMany__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectMany__Group__1__Impl_in_rule__ObjectMany__Group__13874);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1953:1: rule__ObjectMany__Group__1__Impl : ( '*' ) ;
    public final void rule__ObjectMany__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1957:1: ( ( '*' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1958:1: ( '*' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1958:1: ( '*' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1959:1: '*'
            {
             before(grammarAccess.getObjectManyAccess().getAsteriskKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__ObjectMany__Group__1__Impl3902); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1976:1: rule__ObjectChoice__Group__0 : rule__ObjectChoice__Group__0__Impl rule__ObjectChoice__Group__1 ;
    public final void rule__ObjectChoice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1980:1: ( rule__ObjectChoice__Group__0__Impl rule__ObjectChoice__Group__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1981:2: rule__ObjectChoice__Group__0__Impl rule__ObjectChoice__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__0__Impl_in_rule__ObjectChoice__Group__03937);
            rule__ObjectChoice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectChoice__Group__1_in_rule__ObjectChoice__Group__03940);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1988:1: rule__ObjectChoice__Group__0__Impl : ( '(' ) ;
    public final void rule__ObjectChoice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1992:1: ( ( '(' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1993:1: ( '(' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1993:1: ( '(' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:1994:1: '('
            {
             before(grammarAccess.getObjectChoiceAccess().getLeftParenthesisKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ObjectChoice__Group__0__Impl3968); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2007:1: rule__ObjectChoice__Group__1 : rule__ObjectChoice__Group__1__Impl rule__ObjectChoice__Group__2 ;
    public final void rule__ObjectChoice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2011:1: ( rule__ObjectChoice__Group__1__Impl rule__ObjectChoice__Group__2 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2012:2: rule__ObjectChoice__Group__1__Impl rule__ObjectChoice__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__1__Impl_in_rule__ObjectChoice__Group__13999);
            rule__ObjectChoice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectChoice__Group__2_in_rule__ObjectChoice__Group__14002);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2019:1: rule__ObjectChoice__Group__1__Impl : ( ( rule__ObjectChoice__OptionsAssignment_1 ) ) ;
    public final void rule__ObjectChoice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2023:1: ( ( ( rule__ObjectChoice__OptionsAssignment_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2024:1: ( ( rule__ObjectChoice__OptionsAssignment_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2024:1: ( ( rule__ObjectChoice__OptionsAssignment_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2025:1: ( rule__ObjectChoice__OptionsAssignment_1 )
            {
             before(grammarAccess.getObjectChoiceAccess().getOptionsAssignment_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2026:1: ( rule__ObjectChoice__OptionsAssignment_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2026:2: rule__ObjectChoice__OptionsAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectChoice__OptionsAssignment_1_in_rule__ObjectChoice__Group__1__Impl4029);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2036:1: rule__ObjectChoice__Group__2 : rule__ObjectChoice__Group__2__Impl rule__ObjectChoice__Group__3 ;
    public final void rule__ObjectChoice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2040:1: ( rule__ObjectChoice__Group__2__Impl rule__ObjectChoice__Group__3 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2041:2: rule__ObjectChoice__Group__2__Impl rule__ObjectChoice__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__2__Impl_in_rule__ObjectChoice__Group__24059);
            rule__ObjectChoice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectChoice__Group__3_in_rule__ObjectChoice__Group__24062);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2048:1: rule__ObjectChoice__Group__2__Impl : ( ( rule__ObjectChoice__Group_2__0 )* ) ;
    public final void rule__ObjectChoice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2052:1: ( ( ( rule__ObjectChoice__Group_2__0 )* ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2053:1: ( ( rule__ObjectChoice__Group_2__0 )* )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2053:1: ( ( rule__ObjectChoice__Group_2__0 )* )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2054:1: ( rule__ObjectChoice__Group_2__0 )*
            {
             before(grammarAccess.getObjectChoiceAccess().getGroup_2()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2055:1: ( rule__ObjectChoice__Group_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2055:2: rule__ObjectChoice__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ObjectChoice__Group_2__0_in_rule__ObjectChoice__Group__2__Impl4089);
            	    rule__ObjectChoice__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2065:1: rule__ObjectChoice__Group__3 : rule__ObjectChoice__Group__3__Impl ;
    public final void rule__ObjectChoice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2069:1: ( rule__ObjectChoice__Group__3__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2070:2: rule__ObjectChoice__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group__3__Impl_in_rule__ObjectChoice__Group__34120);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2076:1: rule__ObjectChoice__Group__3__Impl : ( ')' ) ;
    public final void rule__ObjectChoice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2080:1: ( ( ')' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2081:1: ( ')' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2081:1: ( ')' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2082:1: ')'
            {
             before(grammarAccess.getObjectChoiceAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__ObjectChoice__Group__3__Impl4148); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2103:1: rule__ObjectChoice__Group_2__0 : rule__ObjectChoice__Group_2__0__Impl rule__ObjectChoice__Group_2__1 ;
    public final void rule__ObjectChoice__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2107:1: ( rule__ObjectChoice__Group_2__0__Impl rule__ObjectChoice__Group_2__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2108:2: rule__ObjectChoice__Group_2__0__Impl rule__ObjectChoice__Group_2__1
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group_2__0__Impl_in_rule__ObjectChoice__Group_2__04187);
            rule__ObjectChoice__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectChoice__Group_2__1_in_rule__ObjectChoice__Group_2__04190);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2115:1: rule__ObjectChoice__Group_2__0__Impl : ( '|' ) ;
    public final void rule__ObjectChoice__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2119:1: ( ( '|' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2120:1: ( '|' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2120:1: ( '|' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2121:1: '|'
            {
             before(grammarAccess.getObjectChoiceAccess().getVerticalLineKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__ObjectChoice__Group_2__0__Impl4218); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2134:1: rule__ObjectChoice__Group_2__1 : rule__ObjectChoice__Group_2__1__Impl ;
    public final void rule__ObjectChoice__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2138:1: ( rule__ObjectChoice__Group_2__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2139:2: rule__ObjectChoice__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectChoice__Group_2__1__Impl_in_rule__ObjectChoice__Group_2__14249);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2145:1: rule__ObjectChoice__Group_2__1__Impl : ( ( rule__ObjectChoice__OptionsAssignment_2_1 ) ) ;
    public final void rule__ObjectChoice__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2149:1: ( ( ( rule__ObjectChoice__OptionsAssignment_2_1 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2150:1: ( ( rule__ObjectChoice__OptionsAssignment_2_1 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2150:1: ( ( rule__ObjectChoice__OptionsAssignment_2_1 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2151:1: ( rule__ObjectChoice__OptionsAssignment_2_1 )
            {
             before(grammarAccess.getObjectChoiceAccess().getOptionsAssignment_2_1()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2152:1: ( rule__ObjectChoice__OptionsAssignment_2_1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2152:2: rule__ObjectChoice__OptionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ObjectChoice__OptionsAssignment_2_1_in_rule__ObjectChoice__Group_2__1__Impl4276);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2166:1: rule__ObjectMaybe__Group_1__0 : rule__ObjectMaybe__Group_1__0__Impl rule__ObjectMaybe__Group_1__1 ;
    public final void rule__ObjectMaybe__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2170:1: ( rule__ObjectMaybe__Group_1__0__Impl rule__ObjectMaybe__Group_1__1 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2171:2: rule__ObjectMaybe__Group_1__0__Impl rule__ObjectMaybe__Group_1__1
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__0__Impl_in_rule__ObjectMaybe__Group_1__04310);
            rule__ObjectMaybe__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__1_in_rule__ObjectMaybe__Group_1__04313);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2178:1: rule__ObjectMaybe__Group_1__0__Impl : ( ( rule__ObjectMaybe__DescriptionAssignment_1_0 ) ) ;
    public final void rule__ObjectMaybe__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2182:1: ( ( ( rule__ObjectMaybe__DescriptionAssignment_1_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2183:1: ( ( rule__ObjectMaybe__DescriptionAssignment_1_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2183:1: ( ( rule__ObjectMaybe__DescriptionAssignment_1_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2184:1: ( rule__ObjectMaybe__DescriptionAssignment_1_0 )
            {
             before(grammarAccess.getObjectMaybeAccess().getDescriptionAssignment_1_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2185:1: ( rule__ObjectMaybe__DescriptionAssignment_1_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2185:2: rule__ObjectMaybe__DescriptionAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__DescriptionAssignment_1_0_in_rule__ObjectMaybe__Group_1__0__Impl4340);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2195:1: rule__ObjectMaybe__Group_1__1 : rule__ObjectMaybe__Group_1__1__Impl ;
    public final void rule__ObjectMaybe__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2199:1: ( rule__ObjectMaybe__Group_1__1__Impl )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2200:2: rule__ObjectMaybe__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectMaybe__Group_1__1__Impl_in_rule__ObjectMaybe__Group_1__14370);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2206:1: rule__ObjectMaybe__Group_1__1__Impl : ( '?' ) ;
    public final void rule__ObjectMaybe__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2210:1: ( ( '?' ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2211:1: ( '?' )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2211:1: ( '?' )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2212:1: '?'
            {
             before(grammarAccess.getObjectMaybeAccess().getQuestionMarkKeyword_1_1()); 
            match(input,32,FOLLOW_32_in_rule__ObjectMaybe__Group_1__1__Impl4398); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2230:1: rule__DTDSL__ParserNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DTDSL__ParserNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2234:1: ( ( RULE_STRING ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2235:1: ( RULE_STRING )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2235:1: ( RULE_STRING )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2236:1: RULE_STRING
            {
             before(grammarAccess.getDTDSLAccess().getParserNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DTDSL__ParserNameAssignment_24438); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2245:1: rule__DTDSL__TypeAssignment_6 : ( ( rule__DTDSL__TypeAlternatives_6_0 ) ) ;
    public final void rule__DTDSL__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2249:1: ( ( ( rule__DTDSL__TypeAlternatives_6_0 ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2250:1: ( ( rule__DTDSL__TypeAlternatives_6_0 ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2250:1: ( ( rule__DTDSL__TypeAlternatives_6_0 ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2251:1: ( rule__DTDSL__TypeAlternatives_6_0 )
            {
             before(grammarAccess.getDTDSLAccess().getTypeAlternatives_6_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2252:1: ( rule__DTDSL__TypeAlternatives_6_0 )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2252:2: rule__DTDSL__TypeAlternatives_6_0
            {
            pushFollow(FOLLOW_rule__DTDSL__TypeAlternatives_6_0_in_rule__DTDSL__TypeAssignment_64469);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2261:1: rule__DTDSL__ObjDescriptionAssignment_8 : ( ruleAbstract ) ;
    public final void rule__DTDSL__ObjDescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2265:1: ( ( ruleAbstract ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2266:1: ( ruleAbstract )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2266:1: ( ruleAbstract )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2267:1: ruleAbstract
            {
             before(grammarAccess.getDTDSLAccess().getObjDescriptionAbstractParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleAbstract_in_rule__DTDSL__ObjDescriptionAssignment_84502);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2276:1: rule__DTDSL__StartAssignment_9 : ( ruleStartPoint ) ;
    public final void rule__DTDSL__StartAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2280:1: ( ( ruleStartPoint ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2281:1: ( ruleStartPoint )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2281:1: ( ruleStartPoint )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2282:1: ruleStartPoint
            {
             before(grammarAccess.getDTDSLAccess().getStartStartPointParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleStartPoint_in_rule__DTDSL__StartAssignment_94533);
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


    // $ANTLR start "rule__StartPoint__BeginAssignment_2"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2291:1: rule__StartPoint__BeginAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StartPoint__BeginAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2295:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2296:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2296:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2297:1: ( RULE_ID )
            {
             before(grammarAccess.getStartPointAccess().getBeginObjectDescriptionCrossReference_2_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2298:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2299:1: RULE_ID
            {
             before(grammarAccess.getStartPointAccess().getBeginObjectDescriptionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartPoint__BeginAssignment_24568); 
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


    // $ANTLR start "rule__StringDescription__NameAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2310:1: rule__StringDescription__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringDescription__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2314:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2315:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2315:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2316:1: RULE_ID
            {
             before(grammarAccess.getStringDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringDescription__NameAssignment_14603); 
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


    // $ANTLR start "rule__ObjectDescription__NameAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2325:1: rule__ObjectDescription__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectDescription__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2329:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2330:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2330:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2331:1: RULE_ID
            {
             before(grammarAccess.getObjectDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectDescription__NameAssignment_14634); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2340:1: rule__ObjectDescription__DescriptionAssignment_4 : ( ruleObjectDescriptionInner ) ;
    public final void rule__ObjectDescription__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2344:1: ( ( ruleObjectDescriptionInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2345:1: ( ruleObjectDescriptionInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2345:1: ( ruleObjectDescriptionInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2346:1: ruleObjectDescriptionInner
            {
             before(grammarAccess.getObjectDescriptionAccess().getDescriptionObjectDescriptionInnerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleObjectDescriptionInner_in_rule__ObjectDescription__DescriptionAssignment_44665);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2355:1: rule__ObjectAttribute__AttributesAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectAttribute__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2359:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2360:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2360:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2361:1: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectAttribute__AttributesAssignment_14696); 
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


    // $ANTLR start "rule__ObjectNode__AttributesAssignment_1"
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2370:1: rule__ObjectNode__AttributesAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectNode__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2374:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2375:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2375:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2376:1: RULE_ID
            {
             before(grammarAccess.getObjectNodeAccess().getAttributesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectNode__AttributesAssignment_14727); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2385:1: rule__ObjectNode__InnerAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectNode__InnerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2389:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2390:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2390:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2391:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectNodeAccess().getInnerObjectDescriptionCrossReference_3_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2392:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2393:1: RULE_ID
            {
             before(grammarAccess.getObjectNodeAccess().getInnerObjectDescriptionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectNode__InnerAssignment_34762); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2404:1: rule__ObjectNext__AttributeAssignment_1 : ( ruleJavaCodeOrID ) ;
    public final void rule__ObjectNext__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2408:1: ( ( ruleJavaCodeOrID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2409:1: ( ruleJavaCodeOrID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2409:1: ( ruleJavaCodeOrID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2410:1: ruleJavaCodeOrID
            {
             before(grammarAccess.getObjectNextAccess().getAttributeJavaCodeOrIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_rule__ObjectNext__AttributeAssignment_14797);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2419:1: rule__ObjectNext__ObjectDesriptionAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectNext__ObjectDesriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2423:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2424:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2424:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2425:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectNextAccess().getObjectDesriptionObjectDescriptionCrossReference_3_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2426:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2427:1: RULE_ID
            {
             before(grammarAccess.getObjectNextAccess().getObjectDesriptionObjectDescriptionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectNext__ObjectDesriptionAssignment_34832); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2438:1: rule__JavaCodeOrID__CodeAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__JavaCodeOrID__CodeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2442:1: ( ( RULE_STRING ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2443:1: ( RULE_STRING )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2443:1: ( RULE_STRING )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2444:1: RULE_STRING
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getCodeSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JavaCodeOrID__CodeAssignment_0_24867); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2453:1: rule__JavaCodeOrID__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__JavaCodeOrID__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2457:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2458:1: ( RULE_ID )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2458:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2459:1: RULE_ID
            {
             before(grammarAccess.getJavaCodeOrIDAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JavaCodeOrID__IdAssignment_14898); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2468:1: rule__ObjectMany__OptionAssignment_0 : ( ruleObjectMaybeInner ) ;
    public final void rule__ObjectMany__OptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2472:1: ( ( ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2473:1: ( ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2473:1: ( ruleObjectMaybeInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2474:1: ruleObjectMaybeInner
            {
             before(grammarAccess.getObjectManyAccess().getOptionObjectMaybeInnerParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_rule__ObjectMany__OptionAssignment_04929);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2483:1: rule__ObjectChoice__OptionsAssignment_1 : ( ruleObjectMaybeInner ) ;
    public final void rule__ObjectChoice__OptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2487:1: ( ( ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2488:1: ( ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2488:1: ( ruleObjectMaybeInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2489:1: ruleObjectMaybeInner
            {
             before(grammarAccess.getObjectChoiceAccess().getOptionsObjectMaybeInnerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_rule__ObjectChoice__OptionsAssignment_14960);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2498:1: rule__ObjectChoice__OptionsAssignment_2_1 : ( ruleObjectMaybeInner ) ;
    public final void rule__ObjectChoice__OptionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2502:1: ( ( ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2503:1: ( ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2503:1: ( ruleObjectMaybeInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2504:1: ruleObjectMaybeInner
            {
             before(grammarAccess.getObjectChoiceAccess().getOptionsObjectMaybeInnerParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_rule__ObjectChoice__OptionsAssignment_2_14991);
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2513:1: rule__ObjectMaybe__OptionAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectMaybe__OptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2517:1: ( ( ( RULE_ID ) ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2518:1: ( ( RULE_ID ) )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2518:1: ( ( RULE_ID ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2519:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectMaybeAccess().getOptionObjectDescriptionCrossReference_0_0()); 
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2520:1: ( RULE_ID )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2521:1: RULE_ID
            {
             before(grammarAccess.getObjectMaybeAccess().getOptionObjectDescriptionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectMaybe__OptionAssignment_05026); 
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
    // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2532:1: rule__ObjectMaybe__DescriptionAssignment_1_0 : ( ruleObjectMaybeInner ) ;
    public final void rule__ObjectMaybe__DescriptionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2536:1: ( ( ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2537:1: ( ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2537:1: ( ruleObjectMaybeInner )
            // ../de.wbg.DTDSL.ui/src-gen/de/wbg/ui/contentassist/antlr/internal/InternalDTDSL.g:2538:1: ruleObjectMaybeInner
            {
             before(grammarAccess.getObjectMaybeAccess().getDescriptionObjectMaybeInnerParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_rule__ObjectMaybe__DescriptionAssignment_1_05061);
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
    static final String DFA3_eotS =
        "\24\uffff";
    static final String DFA3_eofS =
        "\24\uffff";
    static final String DFA3_minS =
        "\4\5\2\uffff\1\31\1\17\1\23\1\31\1\5\2\uffff\1\4\1\5\1\17\1\31"+
        "\1\17\2\uffff";
    static final String DFA3_maxS =
        "\1\35\2\5\1\33\2\uffff\1\31\1\40\1\23\1\31\1\5\2\uffff\1\4\1\5"+
        "\1\40\1\31\1\40\2\uffff";
    static final String DFA3_acceptS =
        "\4\uffff\1\4\1\6\5\uffff\1\2\1\5\5\uffff\1\1\1\3";
    static final String DFA3_specialS =
        "\24\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\4\21\uffff\1\2\1\1\1\uffff\1\3\2\uffff\1\5",
            "\1\6",
            "\1\7",
            "\1\11\25\uffff\1\10",
            "",
            "",
            "\1\12",
            "\1\13\14\uffff\1\14\3\uffff\1\4",
            "\1\15",
            "\1\16",
            "\1\17",
            "",
            "",
            "\1\20",
            "\1\21",
            "\1\22\14\uffff\1\14\3\uffff\1\4",
            "\1\16",
            "\1\23\14\uffff\1\14\3\uffff\1\4",
            "",
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
            return "509:1: rule__ObjectDescriptionInner__Alternatives_0 : ( ( ruleObjectNode ) | ( ruleObjectAttribute ) | ( ruleObjectNext ) | ( ruleObjectMaybe ) | ( ruleObjectMany ) | ( ruleObjectChoice ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleDTDSL_in_entryRuleDTDSL61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDTDSL68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__0_in_ruleDTDSL94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartPoint_in_entryRuleStartPoint121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartPoint128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group__0_in_ruleStartPoint154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Alternatives_in_ruleAbstract214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescription_in_entryRuleStringDescription241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringDescription248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__0_in_ruleStringDescription274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescription310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__0_in_ruleObjectDescription336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescriptionInner372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Group__0_in_ruleObjectDescriptionInner398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectAttribute432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__0_in_ruleObjectAttribute458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_entryRuleObjectNode487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectNode494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__0_in_ruleObjectNode520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_entryRuleObjectNext547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectNext554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__0_in_ruleObjectNext580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaCodeOrID614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Alternatives_in_ruleJavaCodeOrID640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMany_in_entryRuleObjectMany667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMany674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMany__Group__0_in_ruleObjectMany700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectChoice_in_entryRuleObjectChoice727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectChoice734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__0_in_ruleObjectChoice760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMaybe794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Alternatives_in_ruleObjectMaybe820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_entryRuleObjectMaybeInner847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMaybeInner854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybeInner__Alternatives_in_ruleObjectMaybeInner880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DTDSL__TypeAlternatives_6_0919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DTDSL__TypeAlternatives_6_0939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescription_in_rule__Abstract__Alternatives973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescription_in_rule__Abstract__Alternatives990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_rule__ObjectDescriptionInner__Alternatives_01023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_rule__ObjectDescriptionInner__Alternatives_01040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_rule__ObjectDescriptionInner__Alternatives_01057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_rule__ObjectDescriptionInner__Alternatives_01074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMany_in_rule__ObjectDescriptionInner__Alternatives_01091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectChoice_in_rule__ObjectDescriptionInner__Alternatives_01108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__0_in_rule__JavaCodeOrID__Alternatives1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__IdAssignment_1_in_rule__JavaCodeOrID__Alternatives1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__OptionAssignment_0_in_rule__ObjectMaybe__Alternatives1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__0_in_rule__ObjectMaybe__Alternatives1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_rule__ObjectMaybeInner__Alternatives1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_rule__ObjectMaybeInner__Alternatives1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_rule__ObjectMaybeInner__Alternatives1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__0__Impl_in_rule__DTDSL__Group__01307 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__1_in_rule__DTDSL__Group__01310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DTDSL__Group__0__Impl1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__1__Impl_in_rule__DTDSL__Group__11369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__2_in_rule__DTDSL__Group__11372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DTDSL__Group__1__Impl1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__2__Impl_in_rule__DTDSL__Group__21431 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__3_in_rule__DTDSL__Group__21434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__ParserNameAssignment_2_in_rule__DTDSL__Group__2__Impl1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__3__Impl_in_rule__DTDSL__Group__31491 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__4_in_rule__DTDSL__Group__31494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DTDSL__Group__3__Impl1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__4__Impl_in_rule__DTDSL__Group__41553 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__5_in_rule__DTDSL__Group__41556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DTDSL__Group__4__Impl1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__5__Impl_in_rule__DTDSL__Group__51615 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__6_in_rule__DTDSL__Group__51618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DTDSL__Group__5__Impl1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__6__Impl_in_rule__DTDSL__Group__61677 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__7_in_rule__DTDSL__Group__61680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__TypeAssignment_6_in_rule__DTDSL__Group__6__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__7__Impl_in_rule__DTDSL__Group__71737 = new BitSet(new long[]{0x0000000000460000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__8_in_rule__DTDSL__Group__71740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DTDSL__Group__7__Impl1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__8__Impl_in_rule__DTDSL__Group__81799 = new BitSet(new long[]{0x0000000000460000L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__9_in_rule__DTDSL__Group__81802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__ObjDescriptionAssignment_8_in_rule__DTDSL__Group__8__Impl1829 = new BitSet(new long[]{0x0000000000440002L});
    public static final BitSet FOLLOW_rule__DTDSL__Group__9__Impl_in_rule__DTDSL__Group__91860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__StartAssignment_9_in_rule__DTDSL__Group__9__Impl1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group__0__Impl_in_rule__StartPoint__Group__01937 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__StartPoint__Group__1_in_rule__StartPoint__Group__01940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StartPoint__Group__0__Impl1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group__1__Impl_in_rule__StartPoint__Group__11999 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StartPoint__Group__2_in_rule__StartPoint__Group__12002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StartPoint__Group__1__Impl2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group__2__Impl_in_rule__StartPoint__Group__22061 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__StartPoint__Group__3_in_rule__StartPoint__Group__22064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__BeginAssignment_2_in_rule__StartPoint__Group__2__Impl2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartPoint__Group__3__Impl_in_rule__StartPoint__Group__32121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__StartPoint__Group__3__Impl2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__0__Impl_in_rule__StringDescription__Group__02188 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__1_in_rule__StringDescription__Group__02191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StringDescription__Group__0__Impl2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__1__Impl_in_rule__StringDescription__Group__12250 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__2_in_rule__StringDescription__Group__12253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__NameAssignment_1_in_rule__StringDescription__Group__1__Impl2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__2__Impl_in_rule__StringDescription__Group__22310 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__3_in_rule__StringDescription__Group__22313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StringDescription__Group__2__Impl2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__3__Impl_in_rule__StringDescription__Group__32372 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__4_in_rule__StringDescription__Group__32375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__StringDescription__Group__3__Impl2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDescription__Group__4__Impl_in_rule__StringDescription__Group__42434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringDescription__Group__4__Impl2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__0__Impl_in_rule__ObjectDescription__Group__02503 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__1_in_rule__ObjectDescription__Group__02506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ObjectDescription__Group__0__Impl2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__1__Impl_in_rule__ObjectDescription__Group__12565 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__2_in_rule__ObjectDescription__Group__12568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__NameAssignment_1_in_rule__ObjectDescription__Group__1__Impl2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__2__Impl_in_rule__ObjectDescription__Group__22625 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__3_in_rule__ObjectDescription__Group__22628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ObjectDescription__Group__2__Impl2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__3__Impl_in_rule__ObjectDescription__Group__32687 = new BitSet(new long[]{0x0000000025A00020L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__4_in_rule__ObjectDescription__Group__32690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ObjectDescription__Group__3__Impl2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__4__Impl_in_rule__ObjectDescription__Group__42749 = new BitSet(new long[]{0x0000000025A00020L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__5_in_rule__ObjectDescription__Group__42752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescription__DescriptionAssignment_4_in_rule__ObjectDescription__Group__4__Impl2779 = new BitSet(new long[]{0x0000000025800022L});
    public static final BitSet FOLLOW_rule__ObjectDescription__Group__5__Impl_in_rule__ObjectDescription__Group__52810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ObjectDescription__Group__5__Impl2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Group__0__Impl_in_rule__ObjectDescriptionInner__Group__02881 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Group__1_in_rule__ObjectDescriptionInner__Group__02884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Alternatives_0_in_rule__ObjectDescriptionInner__Group__0__Impl2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectDescriptionInner__Group__1__Impl_in_rule__ObjectDescriptionInner__Group__12941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ObjectDescriptionInner__Group__1__Impl2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__0__Impl_in_rule__ObjectAttribute__Group__03004 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__1_in_rule__ObjectAttribute__Group__03007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ObjectAttribute__Group__0__Impl3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__Group__1__Impl_in_rule__ObjectAttribute__Group__13066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectAttribute__AttributesAssignment_1_in_rule__ObjectAttribute__Group__1__Impl3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__0__Impl_in_rule__ObjectNode__Group__03129 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__1_in_rule__ObjectNode__Group__03132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ObjectNode__Group__0__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__1__Impl_in_rule__ObjectNode__Group__13191 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__2_in_rule__ObjectNode__Group__13194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__AttributesAssignment_1_in_rule__ObjectNode__Group__1__Impl3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__2__Impl_in_rule__ObjectNode__Group__23251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__3_in_rule__ObjectNode__Group__23254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ObjectNode__Group__2__Impl3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__Group__3__Impl_in_rule__ObjectNode__Group__33313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNode__InnerAssignment_3_in_rule__ObjectNode__Group__3__Impl3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__0__Impl_in_rule__ObjectNext__Group__03378 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__1_in_rule__ObjectNext__Group__03381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ObjectNext__Group__0__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__1__Impl_in_rule__ObjectNext__Group__13440 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__2_in_rule__ObjectNext__Group__13443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__AttributeAssignment_1_in_rule__ObjectNext__Group__1__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__2__Impl_in_rule__ObjectNext__Group__23500 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__3_in_rule__ObjectNext__Group__23503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ObjectNext__Group__2__Impl3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__Group__3__Impl_in_rule__ObjectNext__Group__33562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectNext__ObjectDesriptionAssignment_3_in_rule__ObjectNext__Group__3__Impl3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__0__Impl_in_rule__JavaCodeOrID__Group_0__03627 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__1_in_rule__JavaCodeOrID__Group_0__03630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__JavaCodeOrID__Group_0__0__Impl3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__1__Impl_in_rule__JavaCodeOrID__Group_0__13689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__2_in_rule__JavaCodeOrID__Group_0__13692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__JavaCodeOrID__Group_0__1__Impl3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__Group_0__2__Impl_in_rule__JavaCodeOrID__Group_0__23751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaCodeOrID__CodeAssignment_0_2_in_rule__JavaCodeOrID__Group_0__2__Impl3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMany__Group__0__Impl_in_rule__ObjectMany__Group__03814 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ObjectMany__Group__1_in_rule__ObjectMany__Group__03817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMany__OptionAssignment_0_in_rule__ObjectMany__Group__0__Impl3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMany__Group__1__Impl_in_rule__ObjectMany__Group__13874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ObjectMany__Group__1__Impl3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__0__Impl_in_rule__ObjectChoice__Group__03937 = new BitSet(new long[]{0x0000000005800020L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__1_in_rule__ObjectChoice__Group__03940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ObjectChoice__Group__0__Impl3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__1__Impl_in_rule__ObjectChoice__Group__13999 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__2_in_rule__ObjectChoice__Group__14002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__OptionsAssignment_1_in_rule__ObjectChoice__Group__1__Impl4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__2__Impl_in_rule__ObjectChoice__Group__24059 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__3_in_rule__ObjectChoice__Group__24062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group_2__0_in_rule__ObjectChoice__Group__2__Impl4089 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group__3__Impl_in_rule__ObjectChoice__Group__34120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ObjectChoice__Group__3__Impl4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group_2__0__Impl_in_rule__ObjectChoice__Group_2__04187 = new BitSet(new long[]{0x0000000005800020L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group_2__1_in_rule__ObjectChoice__Group_2__04190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ObjectChoice__Group_2__0__Impl4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__Group_2__1__Impl_in_rule__ObjectChoice__Group_2__14249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectChoice__OptionsAssignment_2_1_in_rule__ObjectChoice__Group_2__1__Impl4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__0__Impl_in_rule__ObjectMaybe__Group_1__04310 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__1_in_rule__ObjectMaybe__Group_1__04313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__DescriptionAssignment_1_0_in_rule__ObjectMaybe__Group_1__0__Impl4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectMaybe__Group_1__1__Impl_in_rule__ObjectMaybe__Group_1__14370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ObjectMaybe__Group_1__1__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DTDSL__ParserNameAssignment_24438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DTDSL__TypeAlternatives_6_0_in_rule__DTDSL__TypeAssignment_64469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_rule__DTDSL__ObjDescriptionAssignment_84502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartPoint_in_rule__DTDSL__StartAssignment_94533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartPoint__BeginAssignment_24568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringDescription__NameAssignment_14603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectDescription__NameAssignment_14634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_rule__ObjectDescription__DescriptionAssignment_44665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectAttribute__AttributesAssignment_14696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectNode__AttributesAssignment_14727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectNode__InnerAssignment_34762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_rule__ObjectNext__AttributeAssignment_14797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectNext__ObjectDesriptionAssignment_34832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JavaCodeOrID__CodeAssignment_0_24867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JavaCodeOrID__IdAssignment_14898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_rule__ObjectMany__OptionAssignment_04929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_rule__ObjectChoice__OptionsAssignment_14960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_rule__ObjectChoice__OptionsAssignment_2_14991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectMaybe__OptionAssignment_05026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_rule__ObjectMaybe__DescriptionAssignment_1_05061 = new BitSet(new long[]{0x0000000000000002L});

}