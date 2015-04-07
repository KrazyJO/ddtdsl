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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'parserName'", "'='", "';'", "'beginWith'", "'String'", "':'", "'{'", "'}'", "'Key'", "'ofType'", "'Value'", "'to'", "'or'", "'('", "'|'", "')'", "'*'", "'?'", "'Node'", "'hasAttribute'", "'as'", "'hasNode'", "'hasNext'", "'java'", "'boolean'", "'short'", "'int'", "'long'", "'float'", "'double'", "'char'", "'byte'"
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

                if ( (LA1_0==15||LA1_0==29) ) {
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

            if ( (LA3_0==29) ) {
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

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)||LA4_0==19||LA4_0==21||(LA4_0>=23 && LA4_0<=24)) ) {
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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:336:1: ruleStringDescriptionInner returns [EObject current=null] : (this_StringOverRead_0= ruleStringOverRead | this_StringKey_1= ruleStringKey | this_StringValue_2= ruleStringValue | ( (otherlv_3= RULE_ID ) ) | this_StringComplex_4= ruleStringComplex | this_StringOr_5= ruleStringOr | this_StringDescriptionInVariable_6= ruleStringDescriptionInVariable ) ;
    public final EObject ruleStringDescriptionInner() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_StringOverRead_0 = null;

        EObject this_StringKey_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_StringComplex_4 = null;

        EObject this_StringOr_5 = null;

        EObject this_StringDescriptionInVariable_6 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:339:28: ( (this_StringOverRead_0= ruleStringOverRead | this_StringKey_1= ruleStringKey | this_StringValue_2= ruleStringValue | ( (otherlv_3= RULE_ID ) ) | this_StringComplex_4= ruleStringComplex | this_StringOr_5= ruleStringOr | this_StringDescriptionInVariable_6= ruleStringDescriptionInVariable ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:340:1: (this_StringOverRead_0= ruleStringOverRead | this_StringKey_1= ruleStringKey | this_StringValue_2= ruleStringValue | ( (otherlv_3= RULE_ID ) ) | this_StringComplex_4= ruleStringComplex | this_StringOr_5= ruleStringOr | this_StringDescriptionInVariable_6= ruleStringDescriptionInVariable )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:340:1: (this_StringOverRead_0= ruleStringOverRead | this_StringKey_1= ruleStringKey | this_StringValue_2= ruleStringValue | ( (otherlv_3= RULE_ID ) ) | this_StringComplex_4= ruleStringComplex | this_StringOr_5= ruleStringOr | this_StringDescriptionInVariable_6= ruleStringDescriptionInVariable )
            int alt5=7;
            alt5 = dfa5.predict(input);
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
                case 5 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:385:5: this_StringComplex_4= ruleStringComplex
                    {
                     
                            newCompositeNode(grammarAccess.getStringDescriptionInnerAccess().getStringComplexParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleStringComplex_in_ruleStringDescriptionInner850);
                    this_StringComplex_4=ruleStringComplex();

                    state._fsp--;

                     
                            current = this_StringComplex_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:395:5: this_StringOr_5= ruleStringOr
                    {
                     
                            newCompositeNode(grammarAccess.getStringDescriptionInnerAccess().getStringOrParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleStringOr_in_ruleStringDescriptionInner877);
                    this_StringOr_5=ruleStringOr();

                    state._fsp--;

                     
                            current = this_StringOr_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:405:5: this_StringDescriptionInVariable_6= ruleStringDescriptionInVariable
                    {
                     
                            newCompositeNode(grammarAccess.getStringDescriptionInnerAccess().getStringDescriptionInVariableParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleStringDescriptionInVariable_in_ruleStringDescriptionInner904);
                    this_StringDescriptionInVariable_6=ruleStringDescriptionInVariable();

                    state._fsp--;

                     
                            current = this_StringDescriptionInVariable_6; 
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
    // $ANTLR end "ruleStringDescriptionInner"


    // $ANTLR start "entryRuleStringOverRead"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:421:1: entryRuleStringOverRead returns [EObject current=null] : iv_ruleStringOverRead= ruleStringOverRead EOF ;
    public final EObject entryRuleStringOverRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringOverRead = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:422:2: (iv_ruleStringOverRead= ruleStringOverRead EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:423:2: iv_ruleStringOverRead= ruleStringOverRead EOF
            {
             newCompositeNode(grammarAccess.getStringOverReadRule()); 
            pushFollow(FOLLOW_ruleStringOverRead_in_entryRuleStringOverRead939);
            iv_ruleStringOverRead=ruleStringOverRead();

            state._fsp--;

             current =iv_ruleStringOverRead; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringOverRead949); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:430:1: ruleStringOverRead returns [EObject current=null] : ( (lv_overRead_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringOverRead() throws RecognitionException {
        EObject current = null;

        Token lv_overRead_0_0=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:433:28: ( ( (lv_overRead_0_0= RULE_STRING ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:434:1: ( (lv_overRead_0_0= RULE_STRING ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:434:1: ( (lv_overRead_0_0= RULE_STRING ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:435:1: (lv_overRead_0_0= RULE_STRING )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:435:1: (lv_overRead_0_0= RULE_STRING )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:436:3: lv_overRead_0_0= RULE_STRING
            {
            lv_overRead_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringOverRead990); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:460:1: entryRuleStringKey returns [EObject current=null] : iv_ruleStringKey= ruleStringKey EOF ;
    public final EObject entryRuleStringKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringKey = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:461:2: (iv_ruleStringKey= ruleStringKey EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:462:2: iv_ruleStringKey= ruleStringKey EOF
            {
             newCompositeNode(grammarAccess.getStringKeyRule()); 
            pushFollow(FOLLOW_ruleStringKey_in_entryRuleStringKey1030);
            iv_ruleStringKey=ruleStringKey();

            state._fsp--;

             current =iv_ruleStringKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringKey1040); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:469:1: ruleStringKey returns [EObject current=null] : ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Key' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) ) ;
    public final EObject ruleStringKey() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:472:28: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Key' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:473:1: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Key' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:473:1: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Key' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:473:2: () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Key' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:473:2: ()
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:474:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringKeyAccess().getStringKeyAction_0(),
                        current);
                

            }

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:479:2: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:479:3: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '='
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:479:3: ( (lv_name_1_0= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:480:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:480:1: (lv_name_1_0= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:481:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringKey1092); 

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

                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStringKey1109); 

                        	newLeafNode(otherlv_2, grammarAccess.getStringKeyAccess().getEqualsSignKeyword_1_1());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleStringKey1123); 

                	newLeafNode(otherlv_3, grammarAccess.getStringKeyAccess().getKeyKeyword_2());
                
            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleStringKey1135); 

                	newLeafNode(otherlv_4, grammarAccess.getStringKeyAccess().getOfTypeKeyword_3());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:509:1: ( (lv_type_5_0= ruleType ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:510:1: (lv_type_5_0= ruleType )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:510:1: (lv_type_5_0= ruleType )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:511:3: lv_type_5_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getStringKeyAccess().getTypeTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleStringKey1156);
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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:535:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:536:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:537:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1192);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1202); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:544:1: ruleStringValue returns [EObject current=null] : ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Value' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? ) ;
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
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:547:28: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Value' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:548:1: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Value' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:548:1: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Value' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:548:2: () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= 'Value' otherlv_4= 'ofType' ( (lv_type_5_0= ruleType ) ) (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )?
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:548:2: ()
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:549:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringValueAccess().getStringValueAction_0(),
                        current);
                

            }

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:554:2: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:554:3: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '='
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:554:3: ( (lv_name_1_0= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:555:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:555:1: (lv_name_1_0= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:556:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringValue1254); 

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

                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStringValue1271); 

                        	newLeafNode(otherlv_2, grammarAccess.getStringValueAccess().getEqualsSignKeyword_1_1());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleStringValue1285); 

                	newLeafNode(otherlv_3, grammarAccess.getStringValueAccess().getValueKeyword_2());
                
            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleStringValue1297); 

                	newLeafNode(otherlv_4, grammarAccess.getStringValueAccess().getOfTypeKeyword_3());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:584:1: ( (lv_type_5_0= ruleType ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:585:1: (lv_type_5_0= ruleType )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:585:1: (lv_type_5_0= ruleType )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:586:3: lv_type_5_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getTypeTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleStringValue1318);
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

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:602:2: (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:602:4: otherlv_6= 'to' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleStringValue1331); 

                        	newLeafNode(otherlv_6, grammarAccess.getStringValueAccess().getToKeyword_5_0());
                        
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:606:1: ( (otherlv_7= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:607:1: (otherlv_7= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:607:1: (otherlv_7= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:608:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringValueRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringValue1351); 

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


    // $ANTLR start "entryRuleStringOr"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:627:1: entryRuleStringOr returns [EObject current=null] : iv_ruleStringOr= ruleStringOr EOF ;
    public final EObject entryRuleStringOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringOr = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:628:2: (iv_ruleStringOr= ruleStringOr EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:629:2: iv_ruleStringOr= ruleStringOr EOF
            {
             newCompositeNode(grammarAccess.getStringOrRule()); 
            pushFollow(FOLLOW_ruleStringOr_in_entryRuleStringOr1389);
            iv_ruleStringOr=ruleStringOr();

            state._fsp--;

             current =iv_ruleStringOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringOr1399); 

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
    // $ANTLR end "entryRuleStringOr"


    // $ANTLR start "ruleStringOr"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:636:1: ruleStringOr returns [EObject current=null] : ( () otherlv_1= 'or' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleStringOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:639:28: ( ( () otherlv_1= 'or' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:640:1: ( () otherlv_1= 'or' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:640:1: ( () otherlv_1= 'or' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:640:2: () otherlv_1= 'or' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')'
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:640:2: ()
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:641:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringOrAccess().getStringOrAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleStringOr1445); 

                	newLeafNode(otherlv_1, grammarAccess.getStringOrAccess().getOrKeyword_1());
                
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleStringOr1457); 

                	newLeafNode(otherlv_2, grammarAccess.getStringOrAccess().getLeftParenthesisKeyword_2());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:654:1: ( (otherlv_3= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:655:1: (otherlv_3= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:655:1: (otherlv_3= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:656:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStringOrRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringOr1477); 

            		newLeafNode(otherlv_3, grammarAccess.getStringOrAccess().getOptionStringDescriptionInVariableCrossReference_3_0()); 
            	

            }


            }

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:667:2: (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:667:4: otherlv_4= '|' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleStringOr1490); 

            	        	newLeafNode(otherlv_4, grammarAccess.getStringOrAccess().getVerticalLineKeyword_4_0());
            	        
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:671:1: ( (otherlv_5= RULE_ID ) )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:672:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:672:1: (otherlv_5= RULE_ID )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:673:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStringOrRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringOr1510); 

            	    		newLeafNode(otherlv_5, grammarAccess.getStringOrAccess().getOptionStringDescriptionInVariableCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleStringOr1524); 

                	newLeafNode(otherlv_6, grammarAccess.getStringOrAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleStringOr"


    // $ANTLR start "entryRuleStringDescriptionInVariable"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:696:1: entryRuleStringDescriptionInVariable returns [EObject current=null] : iv_ruleStringDescriptionInVariable= ruleStringDescriptionInVariable EOF ;
    public final EObject entryRuleStringDescriptionInVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringDescriptionInVariable = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:697:2: (iv_ruleStringDescriptionInVariable= ruleStringDescriptionInVariable EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:698:2: iv_ruleStringDescriptionInVariable= ruleStringDescriptionInVariable EOF
            {
             newCompositeNode(grammarAccess.getStringDescriptionInVariableRule()); 
            pushFollow(FOLLOW_ruleStringDescriptionInVariable_in_entryRuleStringDescriptionInVariable1560);
            iv_ruleStringDescriptionInVariable=ruleStringDescriptionInVariable();

            state._fsp--;

             current =iv_ruleStringDescriptionInVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringDescriptionInVariable1570); 

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
    // $ANTLR end "entryRuleStringDescriptionInVariable"


    // $ANTLR start "ruleStringDescriptionInVariable"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:705:1: ruleStringDescriptionInVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '=' ( (lv_description_3_0= ruleStringDescriptionInner ) )* otherlv_4= ';' ) ;
    public final EObject ruleStringDescriptionInVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_description_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:708:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '=' ( (lv_description_3_0= ruleStringDescriptionInner ) )* otherlv_4= ';' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:709:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '=' ( (lv_description_3_0= ruleStringDescriptionInner ) )* otherlv_4= ';' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:709:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '=' ( (lv_description_3_0= ruleStringDescriptionInner ) )* otherlv_4= ';' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:709:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '=' ( (lv_description_3_0= ruleStringDescriptionInner ) )* otherlv_4= ';'
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:709:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:710:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:710:1: (lv_name_0_0= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:711:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringDescriptionInVariable1612); 

            			newLeafNode(lv_name_0_0, grammarAccess.getStringDescriptionInVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringDescriptionInVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleStringDescriptionInVariable1629); 

                	newLeafNode(otherlv_1, grammarAccess.getStringDescriptionInVariableAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStringDescriptionInVariable1641); 

                	newLeafNode(otherlv_2, grammarAccess.getStringDescriptionInVariableAccess().getEqualsSignKeyword_2());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:735:1: ( (lv_description_3_0= ruleStringDescriptionInner ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||LA10_0==19||LA10_0==21||(LA10_0>=23 && LA10_0<=24)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:736:1: (lv_description_3_0= ruleStringDescriptionInner )
            	    {
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:736:1: (lv_description_3_0= ruleStringDescriptionInner )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:737:3: lv_description_3_0= ruleStringDescriptionInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStringDescriptionInVariableAccess().getDescriptionStringDescriptionInnerParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStringDescriptionInner_in_ruleStringDescriptionInVariable1662);
            	    lv_description_3_0=ruleStringDescriptionInner();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStringDescriptionInVariableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"description",
            	            		lv_description_3_0, 
            	            		"StringDescriptionInner");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleStringDescriptionInVariable1675); 

                	newLeafNode(otherlv_4, grammarAccess.getStringDescriptionInVariableAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleStringDescriptionInVariable"


    // $ANTLR start "entryRuleStringComplex"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:765:1: entryRuleStringComplex returns [EObject current=null] : iv_ruleStringComplex= ruleStringComplex EOF ;
    public final EObject entryRuleStringComplex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringComplex = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:766:2: (iv_ruleStringComplex= ruleStringComplex EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:767:2: iv_ruleStringComplex= ruleStringComplex EOF
            {
             newCompositeNode(grammarAccess.getStringComplexRule()); 
            pushFollow(FOLLOW_ruleStringComplex_in_entryRuleStringComplex1711);
            iv_ruleStringComplex=ruleStringComplex();

            state._fsp--;

             current =iv_ruleStringComplex; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringComplex1721); 

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
    // $ANTLR end "entryRuleStringComplex"


    // $ANTLR start "ruleStringComplex"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:774:1: ruleStringComplex returns [EObject current=null] : (otherlv_0= '(' ( (lv_description_1_0= ruleStringDescriptionInner ) )* otherlv_2= ')' ( ( (lv_many_3_0= '*' ) ) | ( (lv_maybe_4_0= '?' ) ) ) ) ;
    public final EObject ruleStringComplex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_many_3_0=null;
        Token lv_maybe_4_0=null;
        EObject lv_description_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:777:28: ( (otherlv_0= '(' ( (lv_description_1_0= ruleStringDescriptionInner ) )* otherlv_2= ')' ( ( (lv_many_3_0= '*' ) ) | ( (lv_maybe_4_0= '?' ) ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:778:1: (otherlv_0= '(' ( (lv_description_1_0= ruleStringDescriptionInner ) )* otherlv_2= ')' ( ( (lv_many_3_0= '*' ) ) | ( (lv_maybe_4_0= '?' ) ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:778:1: (otherlv_0= '(' ( (lv_description_1_0= ruleStringDescriptionInner ) )* otherlv_2= ')' ( ( (lv_many_3_0= '*' ) ) | ( (lv_maybe_4_0= '?' ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:778:3: otherlv_0= '(' ( (lv_description_1_0= ruleStringDescriptionInner ) )* otherlv_2= ')' ( ( (lv_many_3_0= '*' ) ) | ( (lv_maybe_4_0= '?' ) ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleStringComplex1758); 

                	newLeafNode(otherlv_0, grammarAccess.getStringComplexAccess().getLeftParenthesisKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:782:1: ( (lv_description_1_0= ruleStringDescriptionInner ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)||LA11_0==19||LA11_0==21||(LA11_0>=23 && LA11_0<=24)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:783:1: (lv_description_1_0= ruleStringDescriptionInner )
            	    {
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:783:1: (lv_description_1_0= ruleStringDescriptionInner )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:784:3: lv_description_1_0= ruleStringDescriptionInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStringComplexAccess().getDescriptionStringDescriptionInnerParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStringDescriptionInner_in_ruleStringComplex1779);
            	    lv_description_1_0=ruleStringDescriptionInner();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStringComplexRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"description",
            	            		lv_description_1_0, 
            	            		"StringDescriptionInner");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleStringComplex1792); 

                	newLeafNode(otherlv_2, grammarAccess.getStringComplexAccess().getRightParenthesisKeyword_2());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:804:1: ( ( (lv_many_3_0= '*' ) ) | ( (lv_maybe_4_0= '?' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:804:2: ( (lv_many_3_0= '*' ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:804:2: ( (lv_many_3_0= '*' ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:805:1: (lv_many_3_0= '*' )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:805:1: (lv_many_3_0= '*' )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:806:3: lv_many_3_0= '*'
                    {
                    lv_many_3_0=(Token)match(input,27,FOLLOW_27_in_ruleStringComplex1811); 

                            newLeafNode(lv_many_3_0, grammarAccess.getStringComplexAccess().getManyAsteriskKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringComplexRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_3_0, "*");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:820:6: ( (lv_maybe_4_0= '?' ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:820:6: ( (lv_maybe_4_0= '?' ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:821:1: (lv_maybe_4_0= '?' )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:821:1: (lv_maybe_4_0= '?' )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:822:3: lv_maybe_4_0= '?'
                    {
                    lv_maybe_4_0=(Token)match(input,28,FOLLOW_28_in_ruleStringComplex1848); 

                            newLeafNode(lv_maybe_4_0, grammarAccess.getStringComplexAccess().getMaybeQuestionMarkKeyword_3_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringComplexRule());
                    	        }
                           		setWithLastConsumed(current, "maybe", lv_maybe_4_0, "?");
                    	    

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
    // $ANTLR end "ruleStringComplex"


    // $ANTLR start "entryRuleObjectDescription"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:843:1: entryRuleObjectDescription returns [EObject current=null] : iv_ruleObjectDescription= ruleObjectDescription EOF ;
    public final EObject entryRuleObjectDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDescription = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:844:2: (iv_ruleObjectDescription= ruleObjectDescription EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:845:2: iv_ruleObjectDescription= ruleObjectDescription EOF
            {
             newCompositeNode(grammarAccess.getObjectDescriptionRule()); 
            pushFollow(FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription1898);
            iv_ruleObjectDescription=ruleObjectDescription();

            state._fsp--;

             current =iv_ruleObjectDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescription1908); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:852:1: ruleObjectDescription returns [EObject current=null] : (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleObjectDescriptionInner ) )* otherlv_5= '}' ) ;
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
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:855:28: ( (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleObjectDescriptionInner ) )* otherlv_5= '}' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:856:1: (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleObjectDescriptionInner ) )* otherlv_5= '}' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:856:1: (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleObjectDescriptionInner ) )* otherlv_5= '}' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:856:3: otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleObjectDescriptionInner ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleObjectDescription1945); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectDescriptionAccess().getNodeKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:860:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:861:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:861:1: (lv_name_1_0= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:862:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectDescription1962); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleObjectDescription1979); 

                	newLeafNode(otherlv_2, grammarAccess.getObjectDescriptionAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleObjectDescription1991); 

                	newLeafNode(otherlv_3, grammarAccess.getObjectDescriptionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:886:1: ( (lv_description_4_0= ruleObjectDescriptionInner ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==24||LA13_0==30||(LA13_0>=32 && LA13_0<=33)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:887:1: (lv_description_4_0= ruleObjectDescriptionInner )
            	    {
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:887:1: (lv_description_4_0= ruleObjectDescriptionInner )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:888:3: lv_description_4_0= ruleObjectDescriptionInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjectDescriptionAccess().getDescriptionObjectDescriptionInnerParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleObjectDescriptionInner_in_ruleObjectDescription2012);
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
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleObjectDescription2025); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:916:1: entryRuleObjectDescriptionInner returns [EObject current=null] : iv_ruleObjectDescriptionInner= ruleObjectDescriptionInner EOF ;
    public final EObject entryRuleObjectDescriptionInner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDescriptionInner = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:917:2: (iv_ruleObjectDescriptionInner= ruleObjectDescriptionInner EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:918:2: iv_ruleObjectDescriptionInner= ruleObjectDescriptionInner EOF
            {
             newCompositeNode(grammarAccess.getObjectDescriptionInnerRule()); 
            pushFollow(FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner2061);
            iv_ruleObjectDescriptionInner=ruleObjectDescriptionInner();

            state._fsp--;

             current =iv_ruleObjectDescriptionInner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescriptionInner2071); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:925:1: ruleObjectDescriptionInner returns [EObject current=null] : ( (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice ) otherlv_6= ';' ) ;
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
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:928:28: ( ( (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice ) otherlv_6= ';' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:929:1: ( (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice ) otherlv_6= ';' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:929:1: ( (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice ) otherlv_6= ';' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:929:2: (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice ) otherlv_6= ';'
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:929:2: (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice )
            int alt14=6;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:930:5: this_ObjectNode_0= ruleObjectNode
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectNodeParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleObjectNode_in_ruleObjectDescriptionInner2119);
                    this_ObjectNode_0=ruleObjectNode();

                    state._fsp--;

                     
                            current = this_ObjectNode_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:940:5: this_ObjectAttribute_1= ruleObjectAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectAttributeParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleObjectAttribute_in_ruleObjectDescriptionInner2146);
                    this_ObjectAttribute_1=ruleObjectAttribute();

                    state._fsp--;

                     
                            current = this_ObjectAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:950:5: this_ObjectNext_2= ruleObjectNext
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectNextParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleObjectNext_in_ruleObjectDescriptionInner2173);
                    this_ObjectNext_2=ruleObjectNext();

                    state._fsp--;

                     
                            current = this_ObjectNext_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:960:5: this_ObjectMaybe_3= ruleObjectMaybe
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectMaybeParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_ruleObjectMaybe_in_ruleObjectDescriptionInner2200);
                    this_ObjectMaybe_3=ruleObjectMaybe();

                    state._fsp--;

                     
                            current = this_ObjectMaybe_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:970:5: this_ObjectMany_4= ruleObjectMany
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectManyParserRuleCall_0_4()); 
                        
                    pushFollow(FOLLOW_ruleObjectMany_in_ruleObjectDescriptionInner2227);
                    this_ObjectMany_4=ruleObjectMany();

                    state._fsp--;

                     
                            current = this_ObjectMany_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:980:5: this_ObjectChoice_5= ruleObjectChoice
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectChoiceParserRuleCall_0_5()); 
                        
                    pushFollow(FOLLOW_ruleObjectChoice_in_ruleObjectDescriptionInner2254);
                    this_ObjectChoice_5=ruleObjectChoice();

                    state._fsp--;

                     
                            current = this_ObjectChoice_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleObjectDescriptionInner2266); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1000:1: entryRuleObjectAttribute returns [EObject current=null] : iv_ruleObjectAttribute= ruleObjectAttribute EOF ;
    public final EObject entryRuleObjectAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAttribute = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1001:2: (iv_ruleObjectAttribute= ruleObjectAttribute EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1002:2: iv_ruleObjectAttribute= ruleObjectAttribute EOF
            {
             newCompositeNode(grammarAccess.getObjectAttributeRule()); 
            pushFollow(FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute2302);
            iv_ruleObjectAttribute=ruleObjectAttribute();

            state._fsp--;

             current =iv_ruleObjectAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectAttribute2312); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1009:1: ruleObjectAttribute returns [EObject current=null] : (otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleObjectAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attributes_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1012:28: ( (otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )? ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1013:1: (otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )? )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1013:1: (otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )? )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1013:3: otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleObjectAttribute2349); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectAttributeAccess().getHasAttributeKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1017:1: ( (lv_attributes_1_0= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1018:1: (lv_attributes_1_0= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1018:1: (lv_attributes_1_0= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1019:3: lv_attributes_1_0= RULE_ID
            {
            lv_attributes_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectAttribute2366); 

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

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1035:2: (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1035:4: otherlv_2= 'as' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleObjectAttribute2384); 

                        	newLeafNode(otherlv_2, grammarAccess.getObjectAttributeAccess().getAsKeyword_2_0());
                        
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1039:1: ( (otherlv_3= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1040:1: (otherlv_3= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1040:1: (otherlv_3= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1041:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjectAttributeRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectAttribute2404); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1060:1: entryRuleObjectNode returns [EObject current=null] : iv_ruleObjectNode= ruleObjectNode EOF ;
    public final EObject entryRuleObjectNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectNode = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1061:2: (iv_ruleObjectNode= ruleObjectNode EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1062:2: iv_ruleObjectNode= ruleObjectNode EOF
            {
             newCompositeNode(grammarAccess.getObjectNodeRule()); 
            pushFollow(FOLLOW_ruleObjectNode_in_entryRuleObjectNode2442);
            iv_ruleObjectNode=ruleObjectNode();

            state._fsp--;

             current =iv_ruleObjectNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectNode2452); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1069:1: ruleObjectNode returns [EObject current=null] : (otherlv_0= 'hasNode' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleObjectNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attributes_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1072:28: ( (otherlv_0= 'hasNode' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1073:1: (otherlv_0= 'hasNode' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1073:1: (otherlv_0= 'hasNode' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1073:3: otherlv_0= 'hasNode' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleObjectNode2489); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectNodeAccess().getHasNodeKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1077:1: ( (lv_attributes_1_0= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1078:1: (lv_attributes_1_0= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1078:1: (lv_attributes_1_0= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1079:3: lv_attributes_1_0= RULE_ID
            {
            lv_attributes_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectNode2506); 

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

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleObjectNode2523); 

                	newLeafNode(otherlv_2, grammarAccess.getObjectNodeAccess().getAsKeyword_2());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1099:1: ( (otherlv_3= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1100:1: (otherlv_3= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1100:1: (otherlv_3= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1101:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectNodeRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectNode2543); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1120:1: entryRuleObjectNext returns [EObject current=null] : iv_ruleObjectNext= ruleObjectNext EOF ;
    public final EObject entryRuleObjectNext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectNext = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1121:2: (iv_ruleObjectNext= ruleObjectNext EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1122:2: iv_ruleObjectNext= ruleObjectNext EOF
            {
             newCompositeNode(grammarAccess.getObjectNextRule()); 
            pushFollow(FOLLOW_ruleObjectNext_in_entryRuleObjectNext2579);
            iv_ruleObjectNext=ruleObjectNext();

            state._fsp--;

             current =iv_ruleObjectNext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectNext2589); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1129:1: ruleObjectNext returns [EObject current=null] : (otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleObjectNext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_attribute_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1132:28: ( (otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1133:1: (otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1133:1: (otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1133:3: otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleObjectNext2626); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectNextAccess().getHasNextKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1137:1: ( (lv_attribute_1_0= ruleJavaCodeOrID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1138:1: (lv_attribute_1_0= ruleJavaCodeOrID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1138:1: (lv_attribute_1_0= ruleJavaCodeOrID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1139:3: lv_attribute_1_0= ruleJavaCodeOrID
            {
             
            	        newCompositeNode(grammarAccess.getObjectNextAccess().getAttributeJavaCodeOrIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_ruleObjectNext2647);
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

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleObjectNext2659); 

                	newLeafNode(otherlv_2, grammarAccess.getObjectNextAccess().getAsKeyword_2());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1159:1: ( (otherlv_3= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1160:1: (otherlv_3= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1160:1: (otherlv_3= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1161:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectNextRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectNext2679); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1180:1: entryRuleJavaCodeOrID returns [EObject current=null] : iv_ruleJavaCodeOrID= ruleJavaCodeOrID EOF ;
    public final EObject entryRuleJavaCodeOrID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaCodeOrID = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1181:2: (iv_ruleJavaCodeOrID= ruleJavaCodeOrID EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1182:2: iv_ruleJavaCodeOrID= ruleJavaCodeOrID EOF
            {
             newCompositeNode(grammarAccess.getJavaCodeOrIDRule()); 
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID2715);
            iv_ruleJavaCodeOrID=ruleJavaCodeOrID();

            state._fsp--;

             current =iv_ruleJavaCodeOrID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaCodeOrID2725); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1189:1: ruleJavaCodeOrID returns [EObject current=null] : ( (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) ) | ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleJavaCodeOrID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_code_2_0=null;
        Token lv_id_3_0=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1192:28: ( ( (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) ) | ( (lv_id_3_0= RULE_ID ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1193:1: ( (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) ) | ( (lv_id_3_0= RULE_ID ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1193:1: ( (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) ) | ( (lv_id_3_0= RULE_ID ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1193:2: (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1193:2: (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1193:4: otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleJavaCodeOrID2763); 

                        	newLeafNode(otherlv_0, grammarAccess.getJavaCodeOrIDAccess().getJavaKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleJavaCodeOrID2775); 

                        	newLeafNode(otherlv_1, grammarAccess.getJavaCodeOrIDAccess().getColonKeyword_0_1());
                        
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1201:1: ( (lv_code_2_0= RULE_STRING ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1202:1: (lv_code_2_0= RULE_STRING )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1202:1: (lv_code_2_0= RULE_STRING )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1203:3: lv_code_2_0= RULE_STRING
                    {
                    lv_code_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJavaCodeOrID2792); 

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
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1220:6: ( (lv_id_3_0= RULE_ID ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1220:6: ( (lv_id_3_0= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1221:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1221:1: (lv_id_3_0= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1222:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJavaCodeOrID2821); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1246:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1247:2: (iv_ruleType= ruleType EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1248:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2863);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2874); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1255:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'char' | kw= 'String' | kw= 'byte' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1258:28: ( (kw= 'boolean' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'char' | kw= 'String' | kw= 'byte' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1259:1: (kw= 'boolean' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'char' | kw= 'String' | kw= 'byte' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1259:1: (kw= 'boolean' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' | kw= 'char' | kw= 'String' | kw= 'byte' )
            int alt17=9;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt17=1;
                }
                break;
            case 36:
                {
                alt17=2;
                }
                break;
            case 37:
                {
                alt17=3;
                }
                break;
            case 38:
                {
                alt17=4;
                }
                break;
            case 39:
                {
                alt17=5;
                }
                break;
            case 40:
                {
                alt17=6;
                }
                break;
            case 41:
                {
                alt17=7;
                }
                break;
            case 15:
                {
                alt17=8;
                }
                break;
            case 42:
                {
                alt17=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1260:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleType2912); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getBooleanKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1267:2: kw= 'short'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleType2931); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getShortKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1274:2: kw= 'int'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleType2950); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1281:2: kw= 'long'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleType2969); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getLongKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1288:2: kw= 'float'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleType2988); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getFloatKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1295:2: kw= 'double'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleType3007); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getDoubleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1302:2: kw= 'char'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleType3026); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getCharKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1309:2: kw= 'String'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleType3045); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1316:2: kw= 'byte'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleType3064); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1329:1: entryRuleObjectMany returns [EObject current=null] : iv_ruleObjectMany= ruleObjectMany EOF ;
    public final EObject entryRuleObjectMany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectMany = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1330:2: (iv_ruleObjectMany= ruleObjectMany EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1331:2: iv_ruleObjectMany= ruleObjectMany EOF
            {
             newCompositeNode(grammarAccess.getObjectManyRule()); 
            pushFollow(FOLLOW_ruleObjectMany_in_entryRuleObjectMany3104);
            iv_ruleObjectMany=ruleObjectMany();

            state._fsp--;

             current =iv_ruleObjectMany; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMany3114); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1338:1: ruleObjectMany returns [EObject current=null] : ( ( (lv_option_0_0= ruleObjectMaybeInner ) ) otherlv_1= '*' ) ;
    public final EObject ruleObjectMany() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_option_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1341:28: ( ( ( (lv_option_0_0= ruleObjectMaybeInner ) ) otherlv_1= '*' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1342:1: ( ( (lv_option_0_0= ruleObjectMaybeInner ) ) otherlv_1= '*' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1342:1: ( ( (lv_option_0_0= ruleObjectMaybeInner ) ) otherlv_1= '*' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1342:2: ( (lv_option_0_0= ruleObjectMaybeInner ) ) otherlv_1= '*'
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1342:2: ( (lv_option_0_0= ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1343:1: (lv_option_0_0= ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1343:1: (lv_option_0_0= ruleObjectMaybeInner )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1344:3: lv_option_0_0= ruleObjectMaybeInner
            {
             
            	        newCompositeNode(grammarAccess.getObjectManyAccess().getOptionObjectMaybeInnerParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_ruleObjectMany3160);
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleObjectMany3172); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1372:1: entryRuleObjectChoice returns [EObject current=null] : iv_ruleObjectChoice= ruleObjectChoice EOF ;
    public final EObject entryRuleObjectChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectChoice = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1373:2: (iv_ruleObjectChoice= ruleObjectChoice EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1374:2: iv_ruleObjectChoice= ruleObjectChoice EOF
            {
             newCompositeNode(grammarAccess.getObjectChoiceRule()); 
            pushFollow(FOLLOW_ruleObjectChoice_in_entryRuleObjectChoice3208);
            iv_ruleObjectChoice=ruleObjectChoice();

            state._fsp--;

             current =iv_ruleObjectChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectChoice3218); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1381:1: ruleObjectChoice returns [EObject current=null] : (otherlv_0= '(' ( (lv_options_1_0= ruleObjectMaybeInner ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleObjectChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_options_1_0 = null;

        EObject lv_options_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1384:28: ( (otherlv_0= '(' ( (lv_options_1_0= ruleObjectMaybeInner ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )* otherlv_4= ')' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1385:1: (otherlv_0= '(' ( (lv_options_1_0= ruleObjectMaybeInner ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )* otherlv_4= ')' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1385:1: (otherlv_0= '(' ( (lv_options_1_0= ruleObjectMaybeInner ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )* otherlv_4= ')' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1385:3: otherlv_0= '(' ( (lv_options_1_0= ruleObjectMaybeInner ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleObjectChoice3255); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectChoiceAccess().getLeftParenthesisKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1389:1: ( (lv_options_1_0= ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1390:1: (lv_options_1_0= ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1390:1: (lv_options_1_0= ruleObjectMaybeInner )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1391:3: lv_options_1_0= ruleObjectMaybeInner
            {
             
            	        newCompositeNode(grammarAccess.getObjectChoiceAccess().getOptionsObjectMaybeInnerParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_ruleObjectChoice3276);
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

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1407:2: (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1407:4: otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleObjectChoice3289); 

            	        	newLeafNode(otherlv_2, grammarAccess.getObjectChoiceAccess().getVerticalLineKeyword_2_0());
            	        
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1411:1: ( (lv_options_3_0= ruleObjectMaybeInner ) )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1412:1: (lv_options_3_0= ruleObjectMaybeInner )
            	    {
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1412:1: (lv_options_3_0= ruleObjectMaybeInner )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1413:3: lv_options_3_0= ruleObjectMaybeInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjectChoiceAccess().getOptionsObjectMaybeInnerParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleObjectMaybeInner_in_ruleObjectChoice3310);
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
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleObjectChoice3324); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1441:1: entryRuleObjectMaybe returns [EObject current=null] : iv_ruleObjectMaybe= ruleObjectMaybe EOF ;
    public final EObject entryRuleObjectMaybe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectMaybe = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1442:2: (iv_ruleObjectMaybe= ruleObjectMaybe EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1443:2: iv_ruleObjectMaybe= ruleObjectMaybe EOF
            {
             newCompositeNode(grammarAccess.getObjectMaybeRule()); 
            pushFollow(FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe3360);
            iv_ruleObjectMaybe=ruleObjectMaybe();

            state._fsp--;

             current =iv_ruleObjectMaybe; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMaybe3370); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1450:1: ruleObjectMaybe returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' ) ) ;
    public final EObject ruleObjectMaybe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_description_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1453:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1454:1: ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1454:1: ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==30||(LA19_0>=32 && LA19_0<=33)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1454:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1454:2: ( (otherlv_0= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1455:1: (otherlv_0= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1455:1: (otherlv_0= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1456:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjectMaybeRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectMaybe3415); 

                    		newLeafNode(otherlv_0, grammarAccess.getObjectMaybeAccess().getOptionObjectDescriptionCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1468:6: ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1468:6: ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1468:7: ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?'
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1468:7: ( (lv_description_1_0= ruleObjectMaybeInner ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1469:1: (lv_description_1_0= ruleObjectMaybeInner )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1469:1: (lv_description_1_0= ruleObjectMaybeInner )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1470:3: lv_description_1_0= ruleObjectMaybeInner
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectMaybeAccess().getDescriptionObjectMaybeInnerParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleObjectMaybeInner_in_ruleObjectMaybe3443);
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

                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleObjectMaybe3455); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1498:1: entryRuleObjectMaybeInner returns [EObject current=null] : iv_ruleObjectMaybeInner= ruleObjectMaybeInner EOF ;
    public final EObject entryRuleObjectMaybeInner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectMaybeInner = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1499:2: (iv_ruleObjectMaybeInner= ruleObjectMaybeInner EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1500:2: iv_ruleObjectMaybeInner= ruleObjectMaybeInner EOF
            {
             newCompositeNode(grammarAccess.getObjectMaybeInnerRule()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_entryRuleObjectMaybeInner3492);
            iv_ruleObjectMaybeInner=ruleObjectMaybeInner();

            state._fsp--;

             current =iv_ruleObjectMaybeInner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMaybeInner3502); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1507:1: ruleObjectMaybeInner returns [EObject current=null] : (this_ObjectNext_0= ruleObjectNext | this_ObjectNode_1= ruleObjectNode | this_ObjectAttribute_2= ruleObjectAttribute ) ;
    public final EObject ruleObjectMaybeInner() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectNext_0 = null;

        EObject this_ObjectNode_1 = null;

        EObject this_ObjectAttribute_2 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1510:28: ( (this_ObjectNext_0= ruleObjectNext | this_ObjectNode_1= ruleObjectNode | this_ObjectAttribute_2= ruleObjectAttribute ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1511:1: (this_ObjectNext_0= ruleObjectNext | this_ObjectNode_1= ruleObjectNode | this_ObjectAttribute_2= ruleObjectAttribute )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1511:1: (this_ObjectNext_0= ruleObjectNext | this_ObjectNode_1= ruleObjectNode | this_ObjectAttribute_2= ruleObjectAttribute )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt20=1;
                }
                break;
            case 32:
                {
                alt20=2;
                }
                break;
            case 30:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1512:5: this_ObjectNext_0= ruleObjectNext
                    {
                     
                            newCompositeNode(grammarAccess.getObjectMaybeInnerAccess().getObjectNextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleObjectNext_in_ruleObjectMaybeInner3549);
                    this_ObjectNext_0=ruleObjectNext();

                    state._fsp--;

                     
                            current = this_ObjectNext_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1522:5: this_ObjectNode_1= ruleObjectNode
                    {
                     
                            newCompositeNode(grammarAccess.getObjectMaybeInnerAccess().getObjectNodeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleObjectNode_in_ruleObjectMaybeInner3576);
                    this_ObjectNode_1=ruleObjectNode();

                    state._fsp--;

                     
                            current = this_ObjectNode_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1532:5: this_ObjectAttribute_2= ruleObjectAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getObjectMaybeInnerAccess().getObjectAttributeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleObjectAttribute_in_ruleObjectMaybeInner3603);
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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA5_eotS =
        "\12\uffff";
    static final String DFA5_eofS =
        "\2\uffff\1\10\7\uffff";
    static final String DFA5_minS =
        "\1\4\1\uffff\1\4\4\uffff\1\23\2\uffff";
    static final String DFA5_maxS =
        "\1\30\1\uffff\1\32\4\uffff\1\25\2\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\5\1\6\1\uffff\1\4\1\7";
    static final String DFA5_specialS =
        "\12\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\15\uffff\1\3\1\uffff\1\4\1\uffff\1\6\1\5",
            "",
            "\2\10\6\uffff\1\7\1\10\2\uffff\1\11\1\uffff\2\10\1\uffff\1"+
            "\10\1\uffff\2\10\1\uffff\1\10",
            "",
            "",
            "",
            "",
            "\1\3\1\uffff\1\4",
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
            return "340:1: (this_StringOverRead_0= ruleStringOverRead | this_StringKey_1= ruleStringKey | this_StringValue_2= ruleStringValue | ( (otherlv_3= RULE_ID ) ) | this_StringComplex_4= ruleStringComplex | this_StringOr_5= ruleStringOr | this_StringDescriptionInVariable_6= ruleStringDescriptionInVariable )";
        }
    }
    static final String DFA14_eotS =
        "\26\uffff";
    static final String DFA14_eofS =
        "\26\uffff";
    static final String DFA14_minS =
        "\4\5\2\uffff\1\37\1\15\1\20\1\37\2\5\2\uffff\1\4\1\5\2\15\1\37"+
        "\1\15\2\uffff";
    static final String DFA14_maxS =
        "\1\41\2\5\1\42\2\uffff\2\37\1\20\1\37\2\5\2\uffff\1\4\1\5\2\34"+
        "\1\37\1\34\2\uffff";
    static final String DFA14_acceptS =
        "\4\uffff\1\4\1\6\6\uffff\1\2\1\5\6\uffff\1\1\1\3";
    static final String DFA14_specialS =
        "\26\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\4\22\uffff\1\5\5\uffff\1\2\1\uffff\1\1\1\3",
            "\1\6",
            "\1\7",
            "\1\11\34\uffff\1\10",
            "",
            "",
            "\1\12",
            "\1\14\15\uffff\1\15\1\4\2\uffff\1\13",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "",
            "",
            "\1\22",
            "\1\23",
            "\1\24\15\uffff\1\15\1\4",
            "\1\14\15\uffff\1\15\1\4",
            "\1\17",
            "\1\25\15\uffff\1\15\1\4",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "929:2: (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDTDSL_in_entryRuleDTDSL75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDTDSL85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDTDSL122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDTDSL134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDTDSL151 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDTDSL168 = new BitSet(new long[]{0x000000002000C020L});
    public static final BitSet FOLLOW_ruleAbstract_in_ruleDTDSL189 = new BitSet(new long[]{0x000000002000C020L});
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
    public static final BitSet FOLLOW_17_in_ruleStringDescription616 = new BitSet(new long[]{0x0000000001AC0030L});
    public static final BitSet FOLLOW_ruleStringDescriptionInner_in_ruleStringDescription637 = new BitSet(new long[]{0x0000000001AC0030L});
    public static final BitSet FOLLOW_18_in_ruleStringDescription650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescriptionInner_in_entryRuleStringDescriptionInner686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringDescriptionInner696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringOverRead_in_ruleStringDescriptionInner743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringKey_in_ruleStringDescriptionInner770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleStringDescriptionInner797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringDescriptionInner822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringComplex_in_ruleStringDescriptionInner850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringOr_in_ruleStringDescriptionInner877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescriptionInVariable_in_ruleStringDescriptionInner904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringOverRead_in_entryRuleStringOverRead939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringOverRead949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringOverRead990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringKey_in_entryRuleStringKey1030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringKey1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringKey1092 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStringKey1109 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStringKey1123 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStringKey1135 = new BitSet(new long[]{0x000007F800008000L});
    public static final BitSet FOLLOW_ruleType_in_ruleStringKey1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringValue1254 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStringValue1271 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStringValue1285 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStringValue1297 = new BitSet(new long[]{0x000007F800008000L});
    public static final BitSet FOLLOW_ruleType_in_ruleStringValue1318 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleStringValue1331 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringValue1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringOr_in_entryRuleStringOr1389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringOr1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleStringOr1445 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStringOr1457 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringOr1477 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleStringOr1490 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringOr1510 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_ruleStringOr1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescriptionInVariable_in_entryRuleStringDescriptionInVariable1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringDescriptionInVariable1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringDescriptionInVariable1612 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStringDescriptionInVariable1629 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStringDescriptionInVariable1641 = new BitSet(new long[]{0x0000000001A82030L});
    public static final BitSet FOLLOW_ruleStringDescriptionInner_in_ruleStringDescriptionInVariable1662 = new BitSet(new long[]{0x0000000001A82030L});
    public static final BitSet FOLLOW_13_in_ruleStringDescriptionInVariable1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringComplex_in_entryRuleStringComplex1711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringComplex1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleStringComplex1758 = new BitSet(new long[]{0x0000000005A80030L});
    public static final BitSet FOLLOW_ruleStringDescriptionInner_in_ruleStringComplex1779 = new BitSet(new long[]{0x0000000005A80030L});
    public static final BitSet FOLLOW_26_in_ruleStringComplex1792 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleStringComplex1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleStringComplex1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription1898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescription1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleObjectDescription1945 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectDescription1962 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleObjectDescription1979 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleObjectDescription1991 = new BitSet(new long[]{0x0000000341040020L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_ruleObjectDescription2012 = new BitSet(new long[]{0x0000000341040020L});
    public static final BitSet FOLLOW_18_in_ruleObjectDescription2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner2061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescriptionInner2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_ruleObjectDescriptionInner2119 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_ruleObjectDescriptionInner2146 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleObjectNext_in_ruleObjectDescriptionInner2173 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_ruleObjectDescriptionInner2200 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleObjectMany_in_ruleObjectDescriptionInner2227 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleObjectChoice_in_ruleObjectDescriptionInner2254 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleObjectDescriptionInner2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute2302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectAttribute2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleObjectAttribute2349 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectAttribute2366 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleObjectAttribute2384 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectAttribute2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_entryRuleObjectNode2442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectNode2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleObjectNode2489 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectNode2506 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleObjectNode2523 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectNode2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_entryRuleObjectNext2579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectNext2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleObjectNext2626 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_ruleObjectNext2647 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleObjectNext2659 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectNext2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID2715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaCodeOrID2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleJavaCodeOrID2763 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJavaCodeOrID2775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJavaCodeOrID2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJavaCodeOrID2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleType2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleType2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleType2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleType2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleType2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleType3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleType3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleType3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleType3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMany_in_entryRuleObjectMany3104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMany3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_ruleObjectMany3160 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleObjectMany3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectChoice_in_entryRuleObjectChoice3208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectChoice3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleObjectChoice3255 = new BitSet(new long[]{0x0000000340000020L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_ruleObjectChoice3276 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleObjectChoice3289 = new BitSet(new long[]{0x0000000340000020L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_ruleObjectChoice3310 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_ruleObjectChoice3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe3360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMaybe3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectMaybe3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_ruleObjectMaybe3443 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleObjectMaybe3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_entryRuleObjectMaybeInner3492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMaybeInner3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_ruleObjectMaybeInner3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_ruleObjectMaybeInner3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_ruleObjectMaybeInner3603 = new BitSet(new long[]{0x0000000000000002L});

}