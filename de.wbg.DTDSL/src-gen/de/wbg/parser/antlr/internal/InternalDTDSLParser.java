package de.wbg.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.wbg.services.DTDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDTDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'parserName'", "'='", "';'", "'beginWith'", "'String'", "':'", "'{'", "'}'", "'Key'", "'ofType'", "'Value'", "'to'", "'Node'", "'hasAttribute'", "'as'", "'hasNode'", "'hasNext'", "'java'", "'boolean'", "'short'", "'int'", "'long'", "'float'", "'double'", "'char'", "'byte'", "'*'", "'('", "'|'", "')'", "'?'"
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
    public String getGrammarFileName() { return "../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g"; }



     	private DTDSLGrammarAccess grammarAccess;
     	
        public InternalDTDSLParser(TokenStream input, DTDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DTDSL";	
       	}
       	
       	@Override
       	protected DTDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDTDSL"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:67:1: entryRuleDTDSL returns [EObject current=null] : iv_ruleDTDSL= ruleDTDSL EOF ;
    public final EObject entryRuleDTDSL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTDSL = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:68:2: (iv_ruleDTDSL= ruleDTDSL EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:69:2: iv_ruleDTDSL= ruleDTDSL EOF
            {
             newCompositeNode(grammarAccess.getDTDSLRule()); 
            pushFollow(FOLLOW_ruleDTDSL_in_entryRuleDTDSL75);
            iv_ruleDTDSL=ruleDTDSL();

            state._fsp--;

             current =iv_ruleDTDSL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDTDSL85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDTDSL"


    // $ANTLR start "ruleDTDSL"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:76:1: ruleDTDSL returns [EObject current=null] : (otherlv_0= 'parserName' otherlv_1= '=' ( (lv_parserName_2_0= RULE_STRING ) ) otherlv_3= ';' ( (lv_objDescription_4_0= ruleAbstract ) )* ( (lv_start_5_0= ruleStartPoint ) ) ) ;
    public final EObject ruleDTDSL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_parserName_2_0=null;
        Token otherlv_3=null;
        EObject lv_objDescription_4_0 = null;

        EObject lv_start_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:79:28: ( (otherlv_0= 'parserName' otherlv_1= '=' ( (lv_parserName_2_0= RULE_STRING ) ) otherlv_3= ';' ( (lv_objDescription_4_0= ruleAbstract ) )* ( (lv_start_5_0= ruleStartPoint ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:80:1: (otherlv_0= 'parserName' otherlv_1= '=' ( (lv_parserName_2_0= RULE_STRING ) ) otherlv_3= ';' ( (lv_objDescription_4_0= ruleAbstract ) )* ( (lv_start_5_0= ruleStartPoint ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:80:1: (otherlv_0= 'parserName' otherlv_1= '=' ( (lv_parserName_2_0= RULE_STRING ) ) otherlv_3= ';' ( (lv_objDescription_4_0= ruleAbstract ) )* ( (lv_start_5_0= ruleStartPoint ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:80:3: otherlv_0= 'parserName' otherlv_1= '=' ( (lv_parserName_2_0= RULE_STRING ) ) otherlv_3= ';' ( (lv_objDescription_4_0= ruleAbstract ) )* ( (lv_start_5_0= ruleStartPoint ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDTDSL122); 

                	newLeafNode(otherlv_0, grammarAccess.getDTDSLAccess().getParserNameKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleDTDSL134); 

                	newLeafNode(otherlv_1, grammarAccess.getDTDSLAccess().getEqualsSignKeyword_1());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:88:1: ( (lv_parserName_2_0= RULE_STRING ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:89:1: (lv_parserName_2_0= RULE_STRING )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:89:1: (lv_parserName_2_0= RULE_STRING )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:90:3: lv_parserName_2_0= RULE_STRING
            {
            lv_parserName_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDTDSL151); 

            			newLeafNode(lv_parserName_2_0, grammarAccess.getDTDSLAccess().getParserNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDTDSLRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"parserName",
                    		lv_parserName_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDTDSL168); 

                	newLeafNode(otherlv_3, grammarAccess.getDTDSLAccess().getSemicolonKeyword_3());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:110:1: ( (lv_objDescription_4_0= ruleAbstract ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:111:1: (lv_objDescription_4_0= ruleAbstract )
            	    {
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:111:1: (lv_objDescription_4_0= ruleAbstract )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:112:3: lv_objDescription_4_0= ruleAbstract
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDTDSLAccess().getObjDescriptionAbstractParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstract_in_ruleDTDSL189);
            	    lv_objDescription_4_0=ruleAbstract();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDTDSLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"objDescription",
            	            		lv_objDescription_4_0, 
            	            		"Abstract");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:128:3: ( (lv_start_5_0= ruleStartPoint ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:129:1: (lv_start_5_0= ruleStartPoint )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:129:1: (lv_start_5_0= ruleStartPoint )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:130:3: lv_start_5_0= ruleStartPoint
            {
             
            	        newCompositeNode(grammarAccess.getDTDSLAccess().getStartStartPointParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStartPoint_in_ruleDTDSL211);
            lv_start_5_0=ruleStartPoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDTDSLRule());
            	        }
                   		set(
                   			current, 
                   			"start",
                    		lv_start_5_0, 
                    		"StartPoint");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDTDSL"


    // $ANTLR start "entryRuleStartPoint"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:154:1: entryRuleStartPoint returns [EObject current=null] : iv_ruleStartPoint= ruleStartPoint EOF ;
    public final EObject entryRuleStartPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartPoint = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:155:2: (iv_ruleStartPoint= ruleStartPoint EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:156:2: iv_ruleStartPoint= ruleStartPoint EOF
            {
             newCompositeNode(grammarAccess.getStartPointRule()); 
            pushFollow(FOLLOW_ruleStartPoint_in_entryRuleStartPoint247);
            iv_ruleStartPoint=ruleStartPoint();

            state._fsp--;

             current =iv_ruleStartPoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartPoint257); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStartPoint"


    // $ANTLR start "ruleStartPoint"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:163:1: ruleStartPoint returns [EObject current=null] : ( (otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ) ;
    public final EObject ruleStartPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:166:28: ( ( (otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:167:1: ( (otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:167:1: ( (otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
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
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:167:2: (otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:167:2: (otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:167:4: otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleStartPoint295); 

                        	newLeafNode(otherlv_0, grammarAccess.getStartPointAccess().getBeginWithKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleStartPoint307); 

                        	newLeafNode(otherlv_1, grammarAccess.getStartPointAccess().getEqualsSignKeyword_0_1());
                        
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:175:1: ( (otherlv_2= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:176:1: (otherlv_2= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:176:1: (otherlv_2= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:177:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStartPointRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStartPoint327); 

                    		newLeafNode(otherlv_2, grammarAccess.getStartPointAccess().getBeginObjectDescriptionCrossReference_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:189:6: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:189:6: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:189:7: ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:189:7: ( (otherlv_3= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:190:1: (otherlv_3= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:190:1: (otherlv_3= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:191:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStartPointRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStartPoint355); 

                    		newLeafNode(otherlv_3, grammarAccess.getStartPointAccess().getBeginStringDescriptionCrossReference_1_0_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleStartPoint367); 

                        	newLeafNode(otherlv_4, grammarAccess.getStartPointAccess().getSemicolonKeyword_1_1());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStartPoint"


    // $ANTLR start "entryRuleAbstract"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:214:1: entryRuleAbstract returns [EObject current=null] : iv_ruleAbstract= ruleAbstract EOF ;
    public final EObject entryRuleAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstract = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:215:2: (iv_ruleAbstract= ruleAbstract EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:216:2: iv_ruleAbstract= ruleAbstract EOF
            {
             newCompositeNode(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract404);
            iv_ruleAbstract=ruleAbstract();

            state._fsp--;

             current =iv_ruleAbstract; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract414); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstract"


    // $ANTLR start "ruleAbstract"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:223:1: ruleAbstract returns [EObject current=null] : (this_ObjectDescription_0= ruleObjectDescription | this_StringDescription_1= ruleStringDescription ) ;
    public final EObject ruleAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectDescription_0 = null;

        EObject this_StringDescription_1 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:226:28: ( (this_ObjectDescription_0= ruleObjectDescription | this_StringDescription_1= ruleStringDescription ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:227:1: (this_ObjectDescription_0= ruleObjectDescription | this_StringDescription_1= ruleStringDescription )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:227:1: (this_ObjectDescription_0= ruleObjectDescription | this_StringDescription_1= ruleStringDescription )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:228:5: this_ObjectDescription_0= ruleObjectDescription
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractAccess().getObjectDescriptionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleObjectDescription_in_ruleAbstract461);
                    this_ObjectDescription_0=ruleObjectDescription();

                    state._fsp--;

                     
                            current = this_ObjectDescription_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:238:5: this_StringDescription_1= ruleStringDescription
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractAccess().getStringDescriptionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringDescription_in_ruleAbstract488);
                    this_StringDescription_1=ruleStringDescription();

                    state._fsp--;

                     
                            current = this_StringDescription_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstract"


    // $ANTLR start "entryRuleStringDescription"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:254:1: entryRuleStringDescription returns [EObject current=null] : iv_ruleStringDescription= ruleStringDescription EOF ;
    public final EObject entryRuleStringDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringDescription = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:255:2: (iv_ruleStringDescription= ruleStringDescription EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:256:2: iv_ruleStringDescription= ruleStringDescription EOF
            {
             newCompositeNode(grammarAccess.getStringDescriptionRule()); 
            pushFollow(FOLLOW_ruleStringDescription_in_entryRuleStringDescription523);
            iv_ruleStringDescription=ruleStringDescription();

            state._fsp--;

             current =iv_ruleStringDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringDescription533); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringDescription"


    // $ANTLR start "ruleStringDescription"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:263:1: ruleStringDescription returns [EObject current=null] : (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleStringDescriptionInner ) )* otherlv_5= '}' ) ;
    public final EObject ruleStringDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_description_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:266:28: ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleStringDescriptionInner ) )* otherlv_5= '}' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:267:1: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleStringDescriptionInner ) )* otherlv_5= '}' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:267:1: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleStringDescriptionInner ) )* otherlv_5= '}' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:267:3: otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleStringDescriptionInner ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleStringDescription570); 

                	newLeafNode(otherlv_0, grammarAccess.getStringDescriptionAccess().getStringKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:271:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:272:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:272:1: (lv_name_1_0= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:273:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringDescription587); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStringDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringDescriptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleStringDescription604); 

                	newLeafNode(otherlv_2, grammarAccess.getStringDescriptionAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleStringDescription616); 

                	newLeafNode(otherlv_3, grammarAccess.getStringDescriptionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:297:1: ( (lv_description_4_0= ruleStringDescriptionInner ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)||LA4_0==19||LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:298:1: (lv_description_4_0= ruleStringDescriptionInner )
            	    {
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:298:1: (lv_description_4_0= ruleStringDescriptionInner )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:299:3: lv_description_4_0= ruleStringDescriptionInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStringDescriptionAccess().getDescriptionStringDescriptionInnerParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStringDescriptionInner_in_ruleStringDescription637);
            	    lv_description_4_0=ruleStringDescriptionInner();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStringDescriptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"description",
            	            		lv_description_4_0, 
            	            		"StringDescriptionInner");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleStringDescription650); 

                	newLeafNode(otherlv_5, grammarAccess.getStringDescriptionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringDescription"


    // $ANTLR start "entryRuleStringDescriptionInner"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:327:1: entryRuleStringDescriptionInner returns [EObject current=null] : iv_ruleStringDescriptionInner= ruleStringDescriptionInner EOF ;
    public final EObject entryRuleStringDescriptionInner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringDescriptionInner = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:328:2: (iv_ruleStringDescriptionInner= ruleStringDescriptionInner EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:329:2: iv_ruleStringDescriptionInner= ruleStringDescriptionInner EOF
            {
             newCompositeNode(grammarAccess.getStringDescriptionInnerRule()); 
            pushFollow(FOLLOW_ruleStringDescriptionInner_in_entryRuleStringDescriptionInner686);
            iv_ruleStringDescriptionInner=ruleStringDescriptionInner();

            state._fsp--;

             current =iv_ruleStringDescriptionInner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringDescriptionInner696); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringDescriptionInner"


    // $ANTLR start "ruleStringDescriptionInner"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:336:1: ruleStringDescriptionInner returns [EObject current=null] : (this_StringOverRead_0= ruleStringOverRead | this_StringKey_1= ruleStringKey | this_StringValue_2= ruleStringValue | ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleStringDescriptionInner() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_StringOverRead_0 = null;

        EObject this_StringKey_1 = null;

        EObject this_StringValue_2 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:339:28: ( (this_StringOverRead_0= ruleStringOverRead | this_StringKey_1= ruleStringKey | this_StringValue_2= ruleStringValue | ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:340:1: (this_StringOverRead_0= ruleStringOverRead | this_StringKey_1= ruleStringKey | this_StringValue_2= ruleStringValue | ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:340:1: (this_StringOverRead_0= ruleStringOverRead | this_StringKey_1= ruleStringKey | this_StringValue_2= ruleStringValue | ( (otherlv_3= RULE_ID ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==12) ) {
                    int LA5_5 = input.LA(3);

                    if ( (LA5_5==21) ) {
                        alt5=3;
                    }
                    else if ( (LA5_5==19) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_2==EOF||(LA5_2>=RULE_STRING && LA5_2<=RULE_ID)||(LA5_2>=18 && LA5_2<=19)||LA5_2==21) ) {
                    alt5=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:341:5: this_StringOverRead_0= ruleStringOverRead
                    {
                     
                            newCompositeNode(grammarAccess.getStringDescriptionInnerAccess().getStringOverReadParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringOverRead_in_ruleStringDescriptionInner743);
                    this_StringOverRead_0=ruleStringOverRead();

                    state._fsp--;

                     
                            current = this_StringOverRead_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:351:5: this_StringKey_1= ruleStringKey
                    {
                     
                            newCompositeNode(grammarAccess.getStringDescriptionInnerAccess().getStringKeyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringKey_in_ruleStringDescriptionInner770);
                    this_StringKey_1=ruleStringKey();

                    state._fsp--;

                     
                            current = this_StringKey_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:361:5: this_StringValue_2= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getStringDescriptionInnerAccess().getStringValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleStringDescriptionInner797);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:370:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:370:6: ( (otherlv_3= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:371:1: (otherlv_3= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:371:1: (otherlv_3= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:372:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringDescriptionInnerRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringDescriptionInner822); 

                    		newLeafNode(otherlv_3, grammarAccess.getStringDescriptionInnerAccess().getKeyRefStringKeyCrossReference_3_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringDescriptionInner"


    // $ANTLR start "entryRuleStringOverRead"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:391:1: entryRuleStringOverRead returns [EObject current=null] : iv_ruleStringOverRead= ruleStringOverRead EOF ;
    public final EObject entryRuleStringOverRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringOverRead = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:392:2: (iv_ruleStringOverRead= ruleStringOverRead EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:393:2: iv_ruleStringOverRead= ruleStringOverRead EOF
            {
             newCompositeNode(grammarAccess.getStringOverReadRule()); 
            pushFollow(FOLLOW_ruleStringOverRead_in_entryRuleStringOverRead858);
            iv_ruleStringOverRead=ruleStringOverRead();

            state._fsp--;

             current =iv_ruleStringOverRead; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringOverRead868); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringOverRead"


    // $ANTLR start "ruleStringOverRead"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:400:1: ruleStringOverRead returns [EObject current=null] : ( (lv_overRead_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringOverRead() throws RecognitionException {
        EObject current = null;

        Token lv_overRead_0_0=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:403:28: ( ( (lv_overRead_0_0= RULE_STRING ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:404:1: ( (lv_overRead_0_0= RULE_STRING ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:404:1: ( (lv_overRead_0_0= RULE_STRING ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:405:1: (lv_overRead_0_0= RULE_STRING )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:405:1: (lv_overRead_0_0= RULE_STRING )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:406:3: lv_overRead_0_0= RULE_STRING
            {
            lv_overRead_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringOverRead909); 

            			newLeafNode(lv_overRead_0_0, grammarAccess.getStringOverReadAccess().getOverReadSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringOverReadRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"overRead",
                    		lv_overRead_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringOverRead"


    // $ANTLR start "entryRuleStringKey"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:430:1: entryRuleStringKey returns [EObject current=null] : iv_ruleStringKey= ruleStringKey EOF ;
    public final EObject entryRuleStringKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringKey = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:431:2: (iv_ruleStringKey= ruleStringKey EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:432:2: iv_ruleStringKey= ruleStringKey EOF
            {
             newCompositeNode(grammarAccess.getStringKeyRule()); 
            pushFollow(FOLLOW_ruleStringKey_in_entryRuleStringKey949);
            iv_ruleStringKey=ruleStringKey();

            state._fsp--;

             current =iv_ruleStringKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringKey959); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringKey"


    // $ANTLR start "ruleStringKey"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:439:1: ruleStringKey returns [EObject current=null] : ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Key' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) ) ;
    public final EObject ruleStringKey() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:442:28: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Key' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:443:1: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Key' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:443:1: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Key' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:443:2: () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Key' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:443:2: ()
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:444:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringKeyAccess().getStringKeyAction_0(),
                        current);
                

            }

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:449:2: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:449:3: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '='
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:449:3: ( (lv_name_1_0= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:450:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:450:1: (lv_name_1_0= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:451:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringKey1011); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getStringKeyAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringKeyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStringKey1028); 

                        	newLeafNode(otherlv_2, grammarAccess.getStringKeyAccess().getEqualsSignKeyword_1_1());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleStringKey1042); 

                	newLeafNode(otherlv_3, grammarAccess.getStringKeyAccess().getKeyKeyword_2());
                
            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleStringKey1054); 

                	newLeafNode(otherlv_4, grammarAccess.getStringKeyAccess().getOfTypeKeyword_3());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:479:1: ( (lv_type_5_0= ruleType ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:480:1: (lv_type_5_0= ruleType )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:480:1: (lv_type_5_0= ruleType )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:481:3: lv_type_5_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getStringKeyAccess().getTypeTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleStringKey1075);
            lv_type_5_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringKeyRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_5_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringKey"


    // $ANTLR start "entryRuleStringValue"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:505:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:506:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:507:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1111);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1121); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:514:1: ruleStringValue returns [EObject current=null] : ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Value' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_type_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:517:28: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Value' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:518:1: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Value' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:518:1: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Value' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:518:2: () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Value' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )?
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:518:2: ()
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:519:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringValueAccess().getStringValueAction_0(),
                        current);
                

            }

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:524:2: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:524:3: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '='
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:524:3: ( (lv_name_1_0= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:525:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:525:1: (lv_name_1_0= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:526:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringValue1173); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getStringValueAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStringValue1190); 

                        	newLeafNode(otherlv_2, grammarAccess.getStringValueAccess().getEqualsSignKeyword_1_1());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleStringValue1204); 

                	newLeafNode(otherlv_3, grammarAccess.getStringValueAccess().getValueKeyword_2());
                
            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleStringValue1216); 

                	newLeafNode(otherlv_4, grammarAccess.getStringValueAccess().getOfTypeKeyword_3());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:554:1: ( (lv_type_5_0= ruleType ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:555:1: (lv_type_5_0= ruleType )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:555:1: (lv_type_5_0= ruleType )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:556:3: lv_type_5_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getTypeTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleStringValue1237);
            lv_type_5_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringValueRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_5_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:572:2: (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:572:4: otherlv_6= 'to' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleStringValue1250); 

                        	newLeafNode(otherlv_6, grammarAccess.getStringValueAccess().getToKeyword_5_0());
                        
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:576:1: ( (otherlv_7= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:577:1: (otherlv_7= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:577:1: (otherlv_7= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:578:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringValueRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringValue1270); 

                    		newLeafNode(otherlv_7, grammarAccess.getStringValueAccess().getToKeyStringKeyCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleObjectDescription"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:597:1: entryRuleObjectDescription returns [EObject current=null] : iv_ruleObjectDescription= ruleObjectDescription EOF ;
    public final EObject entryRuleObjectDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDescription = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:598:2: (iv_ruleObjectDescription= ruleObjectDescription EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:599:2: iv_ruleObjectDescription= ruleObjectDescription EOF
            {
             newCompositeNode(grammarAccess.getObjectDescriptionRule()); 
            pushFollow(FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription1308);
            iv_ruleObjectDescription=ruleObjectDescription();

            state._fsp--;

             current =iv_ruleObjectDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescription1318); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectDescription"


    // $ANTLR start "ruleObjectDescription"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:606:1: ruleObjectDescription returns [EObject current=null] : (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleObjectDescriptionInner ) )* otherlv_5= '}' ) ;
    public final EObject ruleObjectDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_description_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:609:28: ( (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleObjectDescriptionInner ) )* otherlv_5= '}' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:610:1: (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleObjectDescriptionInner ) )* otherlv_5= '}' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:610:1: (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleObjectDescriptionInner ) )* otherlv_5= '}' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:610:3: otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleObjectDescriptionInner ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleObjectDescription1355); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectDescriptionAccess().getNodeKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:614:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:615:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:615:1: (lv_name_1_0= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:616:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectDescription1372); 

            			newLeafNode(lv_name_1_0, grammarAccess.getObjectDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectDescriptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleObjectDescription1389); 

                	newLeafNode(otherlv_2, grammarAccess.getObjectDescriptionAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleObjectDescription1401); 

                	newLeafNode(otherlv_3, grammarAccess.getObjectDescriptionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:640:1: ( (lv_description_4_0= ruleObjectDescriptionInner ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==24||(LA9_0>=26 && LA9_0<=27)||LA9_0==38) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:641:1: (lv_description_4_0= ruleObjectDescriptionInner )
            	    {
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:641:1: (lv_description_4_0= ruleObjectDescriptionInner )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:642:3: lv_description_4_0= ruleObjectDescriptionInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjectDescriptionAccess().getDescriptionObjectDescriptionInnerParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleObjectDescriptionInner_in_ruleObjectDescription1422);
            	    lv_description_4_0=ruleObjectDescriptionInner();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjectDescriptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"description",
            	            		lv_description_4_0, 
            	            		"ObjectDescriptionInner");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleObjectDescription1435); 

                	newLeafNode(otherlv_5, grammarAccess.getObjectDescriptionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectDescription"


    // $ANTLR start "entryRuleObjectDescriptionInner"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:672:1: entryRuleObjectDescriptionInner returns [EObject current=null] : iv_ruleObjectDescriptionInner= ruleObjectDescriptionInner EOF ;
    public final EObject entryRuleObjectDescriptionInner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDescriptionInner = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:673:2: (iv_ruleObjectDescriptionInner= ruleObjectDescriptionInner EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:674:2: iv_ruleObjectDescriptionInner= ruleObjectDescriptionInner EOF
            {
             newCompositeNode(grammarAccess.getObjectDescriptionInnerRule()); 
            pushFollow(FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner1473);
            iv_ruleObjectDescriptionInner=ruleObjectDescriptionInner();

            state._fsp--;

             current =iv_ruleObjectDescriptionInner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescriptionInner1483); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectDescriptionInner"


    // $ANTLR start "ruleObjectDescriptionInner"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:681:1: ruleObjectDescriptionInner returns [EObject current=null] : ( (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice ) otherlv_6= ';' ) ;
    public final EObject ruleObjectDescriptionInner() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        EObject this_ObjectNode_0 = null;

        EObject this_ObjectAttribute_1 = null;

        EObject this_ObjectNext_2 = null;

        EObject this_ObjectMaybe_3 = null;

        EObject this_ObjectMany_4 = null;

        EObject this_ObjectChoice_5 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:684:28: ( ( (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice ) otherlv_6= ';' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:685:1: ( (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice ) otherlv_6= ';' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:685:1: ( (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice ) otherlv_6= ';' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:685:2: (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice ) otherlv_6= ';'
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:685:2: (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice )
            int alt10=6;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:686:5: this_ObjectNode_0= ruleObjectNode
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectNodeParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleObjectNode_in_ruleObjectDescriptionInner1531);
                    this_ObjectNode_0=ruleObjectNode();

                    state._fsp--;

                     
                            current = this_ObjectNode_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:696:5: this_ObjectAttribute_1= ruleObjectAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectAttributeParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleObjectAttribute_in_ruleObjectDescriptionInner1558);
                    this_ObjectAttribute_1=ruleObjectAttribute();

                    state._fsp--;

                     
                            current = this_ObjectAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:706:5: this_ObjectNext_2= ruleObjectNext
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectNextParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleObjectNext_in_ruleObjectDescriptionInner1585);
                    this_ObjectNext_2=ruleObjectNext();

                    state._fsp--;

                     
                            current = this_ObjectNext_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:716:5: this_ObjectMaybe_3= ruleObjectMaybe
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectMaybeParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_ruleObjectMaybe_in_ruleObjectDescriptionInner1612);
                    this_ObjectMaybe_3=ruleObjectMaybe();

                    state._fsp--;

                     
                            current = this_ObjectMaybe_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:726:5: this_ObjectMany_4= ruleObjectMany
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectManyParserRuleCall_0_4()); 
                        
                    pushFollow(FOLLOW_ruleObjectMany_in_ruleObjectDescriptionInner1639);
                    this_ObjectMany_4=ruleObjectMany();

                    state._fsp--;

                     
                            current = this_ObjectMany_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:736:5: this_ObjectChoice_5= ruleObjectChoice
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectChoiceParserRuleCall_0_5()); 
                        
                    pushFollow(FOLLOW_ruleObjectChoice_in_ruleObjectDescriptionInner1666);
                    this_ObjectChoice_5=ruleObjectChoice();

                    state._fsp--;

                     
                            current = this_ObjectChoice_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleObjectDescriptionInner1678); 

                	newLeafNode(otherlv_6, grammarAccess.getObjectDescriptionInnerAccess().getSemicolonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectDescriptionInner"


    // $ANTLR start "entryRuleObjectAttribute"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:756:1: entryRuleObjectAttribute returns [EObject current=null] : iv_ruleObjectAttribute= ruleObjectAttribute EOF ;
    public final EObject entryRuleObjectAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAttribute = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:757:2: (iv_ruleObjectAttribute= ruleObjectAttribute EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:758:2: iv_ruleObjectAttribute= ruleObjectAttribute EOF
            {
             newCompositeNode(grammarAccess.getObjectAttributeRule()); 
            pushFollow(FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute1714);
            iv_ruleObjectAttribute=ruleObjectAttribute();

            state._fsp--;

             current =iv_ruleObjectAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectAttribute1724); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectAttribute"


    // $ANTLR start "ruleObjectAttribute"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:765:1: ruleObjectAttribute returns [EObject current=null] : (otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleObjectAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attributes_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:768:28: ( (otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )? ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:769:1: (otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )? )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:769:1: (otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )? )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:769:3: otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleObjectAttribute1761); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectAttributeAccess().getHasAttributeKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:773:1: ( (lv_attributes_1_0= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:774:1: (lv_attributes_1_0= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:774:1: (lv_attributes_1_0= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:775:3: lv_attributes_1_0= RULE_ID
            {
            lv_attributes_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectAttribute1778); 

            			newLeafNode(lv_attributes_1_0, grammarAccess.getObjectAttributeAccess().getAttributesIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attributes",
                    		lv_attributes_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:791:2: (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:791:4: otherlv_2= 'as' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleObjectAttribute1796); 

                        	newLeafNode(otherlv_2, grammarAccess.getObjectAttributeAccess().getAsKeyword_2_0());
                        
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:795:1: ( (otherlv_3= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:796:1: (otherlv_3= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:796:1: (otherlv_3= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:797:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjectAttributeRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectAttribute1816); 

                    		newLeafNode(otherlv_3, grammarAccess.getObjectAttributeAccess().getStringMethodeStringDescriptionCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectAttribute"


    // $ANTLR start "entryRuleObjectNode"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:818:1: entryRuleObjectNode returns [EObject current=null] : iv_ruleObjectNode= ruleObjectNode EOF ;
    public final EObject entryRuleObjectNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectNode = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:819:2: (iv_ruleObjectNode= ruleObjectNode EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:820:2: iv_ruleObjectNode= ruleObjectNode EOF
            {
             newCompositeNode(grammarAccess.getObjectNodeRule()); 
            pushFollow(FOLLOW_ruleObjectNode_in_entryRuleObjectNode1856);
            iv_ruleObjectNode=ruleObjectNode();

            state._fsp--;

             current =iv_ruleObjectNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectNode1866); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectNode"


    // $ANTLR start "ruleObjectNode"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:827:1: ruleObjectNode returns [EObject current=null] : (otherlv_0= 'hasNode' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleObjectNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attributes_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:830:28: ( (otherlv_0= 'hasNode' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:831:1: (otherlv_0= 'hasNode' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:831:1: (otherlv_0= 'hasNode' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:831:3: otherlv_0= 'hasNode' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleObjectNode1903); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectNodeAccess().getHasNodeKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:835:1: ( (lv_attributes_1_0= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:836:1: (lv_attributes_1_0= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:836:1: (lv_attributes_1_0= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:837:3: lv_attributes_1_0= RULE_ID
            {
            lv_attributes_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectNode1920); 

            			newLeafNode(lv_attributes_1_0, grammarAccess.getObjectNodeAccess().getAttributesIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectNodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attributes",
                    		lv_attributes_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleObjectNode1937); 

                	newLeafNode(otherlv_2, grammarAccess.getObjectNodeAccess().getAsKeyword_2());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:857:1: ( (otherlv_3= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:858:1: (otherlv_3= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:858:1: (otherlv_3= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:859:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectNodeRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectNode1957); 

            		newLeafNode(otherlv_3, grammarAccess.getObjectNodeAccess().getInnerObjectDescriptionCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectNode"


    // $ANTLR start "entryRuleObjectNext"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:878:1: entryRuleObjectNext returns [EObject current=null] : iv_ruleObjectNext= ruleObjectNext EOF ;
    public final EObject entryRuleObjectNext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectNext = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:879:2: (iv_ruleObjectNext= ruleObjectNext EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:880:2: iv_ruleObjectNext= ruleObjectNext EOF
            {
             newCompositeNode(grammarAccess.getObjectNextRule()); 
            pushFollow(FOLLOW_ruleObjectNext_in_entryRuleObjectNext1993);
            iv_ruleObjectNext=ruleObjectNext();

            state._fsp--;

             current =iv_ruleObjectNext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectNext2003); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectNext"


    // $ANTLR start "ruleObjectNext"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:887:1: ruleObjectNext returns [EObject current=null] : (otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleObjectNext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_attribute_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:890:28: ( (otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:891:1: (otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:891:1: (otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:891:3: otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleObjectNext2040); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectNextAccess().getHasNextKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:895:1: ( (lv_attribute_1_0= ruleJavaCodeOrID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:896:1: (lv_attribute_1_0= ruleJavaCodeOrID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:896:1: (lv_attribute_1_0= ruleJavaCodeOrID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:897:3: lv_attribute_1_0= ruleJavaCodeOrID
            {
             
            	        newCompositeNode(grammarAccess.getObjectNextAccess().getAttributeJavaCodeOrIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_ruleObjectNext2061);
            lv_attribute_1_0=ruleJavaCodeOrID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getObjectNextRule());
            	        }
                   		set(
                   			current, 
                   			"attribute",
                    		lv_attribute_1_0, 
                    		"JavaCodeOrID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleObjectNext2073); 

                	newLeafNode(otherlv_2, grammarAccess.getObjectNextAccess().getAsKeyword_2());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:917:1: ( (otherlv_3= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:918:1: (otherlv_3= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:918:1: (otherlv_3= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:919:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectNextRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectNext2093); 

            		newLeafNode(otherlv_3, grammarAccess.getObjectNextAccess().getObjectDesriptionObjectDescriptionCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectNext"


    // $ANTLR start "entryRuleJavaCodeOrID"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:938:1: entryRuleJavaCodeOrID returns [EObject current=null] : iv_ruleJavaCodeOrID= ruleJavaCodeOrID EOF ;
    public final EObject entryRuleJavaCodeOrID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaCodeOrID = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:939:2: (iv_ruleJavaCodeOrID= ruleJavaCodeOrID EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:940:2: iv_ruleJavaCodeOrID= ruleJavaCodeOrID EOF
            {
             newCompositeNode(grammarAccess.getJavaCodeOrIDRule()); 
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID2129);
            iv_ruleJavaCodeOrID=ruleJavaCodeOrID();

            state._fsp--;

             current =iv_ruleJavaCodeOrID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaCodeOrID2139); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJavaCodeOrID"


    // $ANTLR start "ruleJavaCodeOrID"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:947:1: ruleJavaCodeOrID returns [EObject current=null] : ( (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) ) | ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleJavaCodeOrID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_code_2_0=null;
        Token lv_id_3_0=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:950:28: ( ( (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) ) | ( (lv_id_3_0= RULE_ID ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:951:1: ( (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) ) | ( (lv_id_3_0= RULE_ID ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:951:1: ( (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) ) | ( (lv_id_3_0= RULE_ID ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:951:2: (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:951:2: (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:951:4: otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleJavaCodeOrID2177); 

                        	newLeafNode(otherlv_0, grammarAccess.getJavaCodeOrIDAccess().getJavaKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleJavaCodeOrID2189); 

                        	newLeafNode(otherlv_1, grammarAccess.getJavaCodeOrIDAccess().getColonKeyword_0_1());
                        
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:959:1: ( (lv_code_2_0= RULE_STRING ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:960:1: (lv_code_2_0= RULE_STRING )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:960:1: (lv_code_2_0= RULE_STRING )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:961:3: lv_code_2_0= RULE_STRING
                    {
                    lv_code_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJavaCodeOrID2206); 

                    			newLeafNode(lv_code_2_0, grammarAccess.getJavaCodeOrIDAccess().getCodeSTRINGTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJavaCodeOrIDRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"code",
                            		lv_code_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:978:6: ( (lv_id_3_0= RULE_ID ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:978:6: ( (lv_id_3_0= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:979:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:979:1: (lv_id_3_0= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:980:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJavaCodeOrID2235); 

                    			newLeafNode(lv_id_3_0, grammarAccess.getJavaCodeOrIDAccess().getIdIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJavaCodeOrIDRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJavaCodeOrID"


    // $ANTLR start "entryRuleType"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1004:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1005:2: (iv_ruleType= ruleType EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1006:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2277);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2288); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1013:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'char' | kw= 'String' | kw= 'byte' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1016:28: ( (kw= 'boolean' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'char' | kw= 'String' | kw= 'byte' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1017:1: (kw= 'boolean' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'char' | kw= 'String' | kw= 'byte' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1017:1: (kw= 'boolean' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'char' | kw= 'String' | kw= 'byte' )
            int alt13=9;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt13=1;
                }
                break;
            case 30:
                {
                alt13=2;
                }
                break;
            case 31:
                {
                alt13=3;
                }
                break;
            case 32:
                {
                alt13=4;
                }
                break;
            case 33:
                {
                alt13=5;
                }
                break;
            case 34:
                {
                alt13=6;
                }
                break;
            case 35:
                {
                alt13=7;
                }
                break;
            case 15:
                {
                alt13=8;
                }
                break;
            case 36:
                {
                alt13=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1018:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleType2326); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getBooleanKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1025:2: kw= 'short'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleType2345); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getShortKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1032:2: kw= 'int'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleType2364); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1039:2: kw= 'long'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleType2383); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getLongKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1046:2: kw= 'float'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleType2402); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getFloatKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1053:2: kw= 'double'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleType2421); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getDoubleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1060:2: kw= 'char'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleType2440); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getCharKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1067:2: kw= 'String'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleType2459); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1074:2: kw= 'byte'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleType2478); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getByteKeyword_8()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleObjectMany"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1087:1: entryRuleObjectMany returns [EObject current=null] : iv_ruleObjectMany= ruleObjectMany EOF ;
    public final EObject entryRuleObjectMany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectMany = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1088:2: (iv_ruleObjectMany= ruleObjectMany EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1089:2: iv_ruleObjectMany= ruleObjectMany EOF
            {
             newCompositeNode(grammarAccess.getObjectManyRule()); 
            pushFollow(FOLLOW_ruleObjectMany_in_entryRuleObjectMany2518);
            iv_ruleObjectMany=ruleObjectMany();

            state._fsp--;

             current =iv_ruleObjectMany; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMany2528); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectMany"


    // $ANTLR start "ruleObjectMany"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1096:1: ruleObjectMany returns [EObject current=null] : ( ( (lv_option_0_0= ruleObjectMaybeInner ) ) otherlv_1= '*' ) ;
    public final EObject ruleObjectMany() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_option_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1099:28: ( ( ( (lv_option_0_0= ruleObjectMaybeInner ) ) otherlv_1= '*' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1100:1: ( ( (lv_option_0_0= ruleObjectMaybeInner ) ) otherlv_1= '*' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1100:1: ( ( (lv_option_0_0= ruleObjectMaybeInner ) ) otherlv_1= '*' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1100:2: ( (lv_option_0_0= ruleObjectMaybeInner ) ) otherlv_1= '*'
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1100:2: ( (lv_option_0_0= ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1101:1: (lv_option_0_0= ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1101:1: (lv_option_0_0= ruleObjectMaybeInner )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1102:3: lv_option_0_0= ruleObjectMaybeInner
            {
             
            	        newCompositeNode(grammarAccess.getObjectManyAccess().getOptionObjectMaybeInnerParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_ruleObjectMany2574);
            lv_option_0_0=ruleObjectMaybeInner();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getObjectManyRule());
            	        }
                   		set(
                   			current, 
                   			"option",
                    		lv_option_0_0, 
                    		"ObjectMaybeInner");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleObjectMany2586); 

                	newLeafNode(otherlv_1, grammarAccess.getObjectManyAccess().getAsteriskKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectMany"


    // $ANTLR start "entryRuleObjectChoice"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1130:1: entryRuleObjectChoice returns [EObject current=null] : iv_ruleObjectChoice= ruleObjectChoice EOF ;
    public final EObject entryRuleObjectChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectChoice = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1131:2: (iv_ruleObjectChoice= ruleObjectChoice EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1132:2: iv_ruleObjectChoice= ruleObjectChoice EOF
            {
             newCompositeNode(grammarAccess.getObjectChoiceRule()); 
            pushFollow(FOLLOW_ruleObjectChoice_in_entryRuleObjectChoice2622);
            iv_ruleObjectChoice=ruleObjectChoice();

            state._fsp--;

             current =iv_ruleObjectChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectChoice2632); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectChoice"


    // $ANTLR start "ruleObjectChoice"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1139:1: ruleObjectChoice returns [EObject current=null] : (otherlv_0= '(' ( (lv_options_1_0= ruleObjectMaybeInner ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleObjectChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_options_1_0 = null;

        EObject lv_options_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1142:28: ( (otherlv_0= '(' ( (lv_options_1_0= ruleObjectMaybeInner ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )* otherlv_4= ')' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1143:1: (otherlv_0= '(' ( (lv_options_1_0= ruleObjectMaybeInner ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )* otherlv_4= ')' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1143:1: (otherlv_0= '(' ( (lv_options_1_0= ruleObjectMaybeInner ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )* otherlv_4= ')' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1143:3: otherlv_0= '(' ( (lv_options_1_0= ruleObjectMaybeInner ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleObjectChoice2669); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectChoiceAccess().getLeftParenthesisKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1147:1: ( (lv_options_1_0= ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1148:1: (lv_options_1_0= ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1148:1: (lv_options_1_0= ruleObjectMaybeInner )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1149:3: lv_options_1_0= ruleObjectMaybeInner
            {
             
            	        newCompositeNode(grammarAccess.getObjectChoiceAccess().getOptionsObjectMaybeInnerParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_ruleObjectChoice2690);
            lv_options_1_0=ruleObjectMaybeInner();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getObjectChoiceRule());
            	        }
                   		add(
                   			current, 
                   			"options",
                    		lv_options_1_0, 
                    		"ObjectMaybeInner");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1165:2: (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1165:4: otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) )
            	    {
            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleObjectChoice2703); 

            	        	newLeafNode(otherlv_2, grammarAccess.getObjectChoiceAccess().getVerticalLineKeyword_2_0());
            	        
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1169:1: ( (lv_options_3_0= ruleObjectMaybeInner ) )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1170:1: (lv_options_3_0= ruleObjectMaybeInner )
            	    {
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1170:1: (lv_options_3_0= ruleObjectMaybeInner )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1171:3: lv_options_3_0= ruleObjectMaybeInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjectChoiceAccess().getOptionsObjectMaybeInnerParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleObjectMaybeInner_in_ruleObjectChoice2724);
            	    lv_options_3_0=ruleObjectMaybeInner();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjectChoiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_3_0, 
            	            		"ObjectMaybeInner");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleObjectChoice2738); 

                	newLeafNode(otherlv_4, grammarAccess.getObjectChoiceAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectChoice"


    // $ANTLR start "entryRuleObjectMaybe"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1199:1: entryRuleObjectMaybe returns [EObject current=null] : iv_ruleObjectMaybe= ruleObjectMaybe EOF ;
    public final EObject entryRuleObjectMaybe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectMaybe = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1200:2: (iv_ruleObjectMaybe= ruleObjectMaybe EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1201:2: iv_ruleObjectMaybe= ruleObjectMaybe EOF
            {
             newCompositeNode(grammarAccess.getObjectMaybeRule()); 
            pushFollow(FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe2774);
            iv_ruleObjectMaybe=ruleObjectMaybe();

            state._fsp--;

             current =iv_ruleObjectMaybe; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMaybe2784); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectMaybe"


    // $ANTLR start "ruleObjectMaybe"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1208:1: ruleObjectMaybe returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' ) ) ;
    public final EObject ruleObjectMaybe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_description_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1211:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1212:1: ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1212:1: ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==24||(LA15_0>=26 && LA15_0<=27)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1212:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1212:2: ( (otherlv_0= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1213:1: (otherlv_0= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1213:1: (otherlv_0= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1214:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjectMaybeRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectMaybe2829); 

                    		newLeafNode(otherlv_0, grammarAccess.getObjectMaybeAccess().getOptionObjectDescriptionCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1226:6: ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1226:6: ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1226:7: ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?'
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1226:7: ( (lv_description_1_0= ruleObjectMaybeInner ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1227:1: (lv_description_1_0= ruleObjectMaybeInner )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1227:1: (lv_description_1_0= ruleObjectMaybeInner )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1228:3: lv_description_1_0= ruleObjectMaybeInner
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectMaybeAccess().getDescriptionObjectMaybeInnerParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleObjectMaybeInner_in_ruleObjectMaybe2857);
                    lv_description_1_0=ruleObjectMaybeInner();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectMaybeRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_1_0, 
                            		"ObjectMaybeInner");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleObjectMaybe2869); 

                        	newLeafNode(otherlv_2, grammarAccess.getObjectMaybeAccess().getQuestionMarkKeyword_1_1());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectMaybe"


    // $ANTLR start "entryRuleObjectMaybeInner"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1256:1: entryRuleObjectMaybeInner returns [EObject current=null] : iv_ruleObjectMaybeInner= ruleObjectMaybeInner EOF ;
    public final EObject entryRuleObjectMaybeInner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectMaybeInner = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1257:2: (iv_ruleObjectMaybeInner= ruleObjectMaybeInner EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1258:2: iv_ruleObjectMaybeInner= ruleObjectMaybeInner EOF
            {
             newCompositeNode(grammarAccess.getObjectMaybeInnerRule()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_entryRuleObjectMaybeInner2906);
            iv_ruleObjectMaybeInner=ruleObjectMaybeInner();

            state._fsp--;

             current =iv_ruleObjectMaybeInner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMaybeInner2916); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectMaybeInner"


    // $ANTLR start "ruleObjectMaybeInner"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1265:1: ruleObjectMaybeInner returns [EObject current=null] : (this_ObjectNext_0= ruleObjectNext | this_ObjectNode_1= ruleObjectNode | this_ObjectAttribute_2= ruleObjectAttribute ) ;
    public final EObject ruleObjectMaybeInner() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectNext_0 = null;

        EObject this_ObjectNode_1 = null;

        EObject this_ObjectAttribute_2 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1268:28: ( (this_ObjectNext_0= ruleObjectNext | this_ObjectNode_1= ruleObjectNode | this_ObjectAttribute_2= ruleObjectAttribute ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1269:1: (this_ObjectNext_0= ruleObjectNext | this_ObjectNode_1= ruleObjectNode | this_ObjectAttribute_2= ruleObjectAttribute )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1269:1: (this_ObjectNext_0= ruleObjectNext | this_ObjectNode_1= ruleObjectNode | this_ObjectAttribute_2= ruleObjectAttribute )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt16=1;
                }
                break;
            case 26:
                {
                alt16=2;
                }
                break;
            case 24:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1270:5: this_ObjectNext_0= ruleObjectNext
                    {
                     
                            newCompositeNode(grammarAccess.getObjectMaybeInnerAccess().getObjectNextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleObjectNext_in_ruleObjectMaybeInner2963);
                    this_ObjectNext_0=ruleObjectNext();

                    state._fsp--;

                     
                            current = this_ObjectNext_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1280:5: this_ObjectNode_1= ruleObjectNode
                    {
                     
                            newCompositeNode(grammarAccess.getObjectMaybeInnerAccess().getObjectNodeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleObjectNode_in_ruleObjectMaybeInner2990);
                    this_ObjectNode_1=ruleObjectNode();

                    state._fsp--;

                     
                            current = this_ObjectNode_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1290:5: this_ObjectAttribute_2= ruleObjectAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getObjectMaybeInnerAccess().getObjectAttributeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleObjectAttribute_in_ruleObjectMaybeInner3017);
                    this_ObjectAttribute_2=ruleObjectAttribute();

                    state._fsp--;

                     
                            current = this_ObjectAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectMaybeInner"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\26\uffff";
    static final String DFA10_eofS =
        "\26\uffff";
    static final String DFA10_minS =
        "\4\5\2\uffff\1\31\1\15\1\20\1\31\2\5\2\uffff\1\4\1\5\2\15\1\31"+
        "\1\15\2\uffff";
    static final String DFA10_maxS =
        "\1\46\2\5\1\34\2\uffff\1\31\1\51\1\20\1\31\2\5\2\uffff\1\4\1\5"+
        "\2\51\1\31\1\51\2\uffff";
    static final String DFA10_acceptS =
        "\4\uffff\1\4\1\6\6\uffff\1\5\1\2\6\uffff\1\1\1\3";
    static final String DFA10_specialS =
        "\26\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\4\22\uffff\1\2\1\uffff\1\1\1\3\12\uffff\1\5",
            "\1\6",
            "\1\7",
            "\1\11\26\uffff\1\10",
            "",
            "",
            "\1\12",
            "\1\15\13\uffff\1\13\13\uffff\1\14\3\uffff\1\4",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "",
            "",
            "\1\22",
            "\1\23",
            "\1\24\27\uffff\1\14\3\uffff\1\4",
            "\1\15\27\uffff\1\14\3\uffff\1\4",
            "\1\17",
            "\1\25\27\uffff\1\14\3\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "685:2: (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDTDSL_in_entryRuleDTDSL75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDTDSL85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDTDSL122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDTDSL134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDTDSL151 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDTDSL168 = new BitSet(new long[]{0x000000000080C020L});
    public static final BitSet FOLLOW_ruleAbstract_in_ruleDTDSL189 = new BitSet(new long[]{0x000000000080C020L});
    public static final BitSet FOLLOW_ruleStartPoint_in_ruleDTDSL211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartPoint_in_entryRuleStartPoint247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartPoint257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStartPoint295 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStartPoint307 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartPoint327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartPoint355 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStartPoint367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescription_in_ruleAbstract461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescription_in_ruleAbstract488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescription_in_entryRuleStringDescription523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringDescription533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStringDescription570 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringDescription587 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStringDescription604 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStringDescription616 = new BitSet(new long[]{0x00000000002C0030L});
    public static final BitSet FOLLOW_ruleStringDescriptionInner_in_ruleStringDescription637 = new BitSet(new long[]{0x00000000002C0030L});
    public static final BitSet FOLLOW_18_in_ruleStringDescription650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescriptionInner_in_entryRuleStringDescriptionInner686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringDescriptionInner696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringOverRead_in_ruleStringDescriptionInner743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringKey_in_ruleStringDescriptionInner770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleStringDescriptionInner797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringDescriptionInner822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringOverRead_in_entryRuleStringOverRead858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringOverRead868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringOverRead909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringKey_in_entryRuleStringKey949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringKey959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringKey1011 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStringKey1028 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStringKey1042 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStringKey1054 = new BitSet(new long[]{0x0000001FE0008000L});
    public static final BitSet FOLLOW_ruleType_in_ruleStringKey1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringValue1173 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStringValue1190 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStringValue1204 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStringValue1216 = new BitSet(new long[]{0x0000001FE0008000L});
    public static final BitSet FOLLOW_ruleType_in_ruleStringValue1237 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleStringValue1250 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringValue1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription1308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescription1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleObjectDescription1355 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectDescription1372 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleObjectDescription1389 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleObjectDescription1401 = new BitSet(new long[]{0x000000400D040020L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_ruleObjectDescription1422 = new BitSet(new long[]{0x000000400D040020L});
    public static final BitSet FOLLOW_18_in_ruleObjectDescription1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner1473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescriptionInner1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_ruleObjectDescriptionInner1531 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_ruleObjectDescriptionInner1558 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleObjectNext_in_ruleObjectDescriptionInner1585 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_ruleObjectDescriptionInner1612 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleObjectMany_in_ruleObjectDescriptionInner1639 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleObjectChoice_in_ruleObjectDescriptionInner1666 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleObjectDescriptionInner1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute1714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectAttribute1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleObjectAttribute1761 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectAttribute1778 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleObjectAttribute1796 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectAttribute1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_entryRuleObjectNode1856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectNode1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleObjectNode1903 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectNode1920 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleObjectNode1937 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectNode1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_entryRuleObjectNext1993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectNext2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleObjectNext2040 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_ruleObjectNext2061 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleObjectNext2073 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectNext2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID2129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaCodeOrID2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleJavaCodeOrID2177 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJavaCodeOrID2189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJavaCodeOrID2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJavaCodeOrID2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleType2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleType2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleType2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleType2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleType2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleType2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleType2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleType2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleType2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMany_in_entryRuleObjectMany2518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMany2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_ruleObjectMany2574 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleObjectMany2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectChoice_in_entryRuleObjectChoice2622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectChoice2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleObjectChoice2669 = new BitSet(new long[]{0x000000000D000020L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_ruleObjectChoice2690 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_39_in_ruleObjectChoice2703 = new BitSet(new long[]{0x000000000D000020L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_ruleObjectChoice2724 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_40_in_ruleObjectChoice2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe2774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMaybe2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectMaybe2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_ruleObjectMaybe2857 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleObjectMaybe2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_entryRuleObjectMaybeInner2906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMaybeInner2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_ruleObjectMaybeInner2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_ruleObjectMaybeInner2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_ruleObjectMaybeInner3017 = new BitSet(new long[]{0x0000000000000002L});

}