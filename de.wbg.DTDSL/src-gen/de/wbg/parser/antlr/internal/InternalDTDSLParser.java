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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'parserName'", "'='", "';'", "'parserType'", "'javaObject'", "'string'", "'beginWith'", "'String'", "':'", "'{'", "'}'", "'Key'", "'Value'", "'Node'", "'hasAttribute'", "'as'", "'hasNode'", "'hasNext'", "'java'", "'*'", "'('", "'|'", "')'", "'?'"
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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:76:1: ruleDTDSL returns [EObject current=null] : (otherlv_0= 'parserName' otherlv_1= '=' ( (lv_parserName_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'parserType' otherlv_5= '=' ( ( (lv_type_6_1= 'javaObject' | lv_type_6_2= 'string' ) ) ) otherlv_7= ';' ( (lv_objDescription_8_0= ruleAbstract ) )* ( (lv_start_9_0= ruleStartPoint ) ) ) ;
    public final EObject ruleDTDSL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_parserName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_type_6_1=null;
        Token lv_type_6_2=null;
        Token otherlv_7=null;
        EObject lv_objDescription_8_0 = null;

        EObject lv_start_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:79:28: ( (otherlv_0= 'parserName' otherlv_1= '=' ( (lv_parserName_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'parserType' otherlv_5= '=' ( ( (lv_type_6_1= 'javaObject' | lv_type_6_2= 'string' ) ) ) otherlv_7= ';' ( (lv_objDescription_8_0= ruleAbstract ) )* ( (lv_start_9_0= ruleStartPoint ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:80:1: (otherlv_0= 'parserName' otherlv_1= '=' ( (lv_parserName_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'parserType' otherlv_5= '=' ( ( (lv_type_6_1= 'javaObject' | lv_type_6_2= 'string' ) ) ) otherlv_7= ';' ( (lv_objDescription_8_0= ruleAbstract ) )* ( (lv_start_9_0= ruleStartPoint ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:80:1: (otherlv_0= 'parserName' otherlv_1= '=' ( (lv_parserName_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'parserType' otherlv_5= '=' ( ( (lv_type_6_1= 'javaObject' | lv_type_6_2= 'string' ) ) ) otherlv_7= ';' ( (lv_objDescription_8_0= ruleAbstract ) )* ( (lv_start_9_0= ruleStartPoint ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:80:3: otherlv_0= 'parserName' otherlv_1= '=' ( (lv_parserName_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'parserType' otherlv_5= '=' ( ( (lv_type_6_1= 'javaObject' | lv_type_6_2= 'string' ) ) ) otherlv_7= ';' ( (lv_objDescription_8_0= ruleAbstract ) )* ( (lv_start_9_0= ruleStartPoint ) )
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
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleDTDSL180); 

                	newLeafNode(otherlv_4, grammarAccess.getDTDSLAccess().getParserTypeKeyword_4());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleDTDSL192); 

                	newLeafNode(otherlv_5, grammarAccess.getDTDSLAccess().getEqualsSignKeyword_5());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:118:1: ( ( (lv_type_6_1= 'javaObject' | lv_type_6_2= 'string' ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:119:1: ( (lv_type_6_1= 'javaObject' | lv_type_6_2= 'string' ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:119:1: ( (lv_type_6_1= 'javaObject' | lv_type_6_2= 'string' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:120:1: (lv_type_6_1= 'javaObject' | lv_type_6_2= 'string' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:120:1: (lv_type_6_1= 'javaObject' | lv_type_6_2= 'string' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:121:3: lv_type_6_1= 'javaObject'
                    {
                    lv_type_6_1=(Token)match(input,15,FOLLOW_15_in_ruleDTDSL212); 

                            newLeafNode(lv_type_6_1, grammarAccess.getDTDSLAccess().getTypeJavaObjectKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDTDSLRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:133:8: lv_type_6_2= 'string'
                    {
                    lv_type_6_2=(Token)match(input,16,FOLLOW_16_in_ruleDTDSL241); 

                            newLeafNode(lv_type_6_2, grammarAccess.getDTDSLAccess().getTypeStringKeyword_6_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDTDSLRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleDTDSL269); 

                	newLeafNode(otherlv_7, grammarAccess.getDTDSLAccess().getSemicolonKeyword_7());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:152:1: ( (lv_objDescription_8_0= ruleAbstract ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18||LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:153:1: (lv_objDescription_8_0= ruleAbstract )
            	    {
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:153:1: (lv_objDescription_8_0= ruleAbstract )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:154:3: lv_objDescription_8_0= ruleAbstract
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDTDSLAccess().getObjDescriptionAbstractParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstract_in_ruleDTDSL290);
            	    lv_objDescription_8_0=ruleAbstract();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDTDSLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"objDescription",
            	            		lv_objDescription_8_0, 
            	            		"Abstract");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:170:3: ( (lv_start_9_0= ruleStartPoint ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:171:1: (lv_start_9_0= ruleStartPoint )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:171:1: (lv_start_9_0= ruleStartPoint )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:172:3: lv_start_9_0= ruleStartPoint
            {
             
            	        newCompositeNode(grammarAccess.getDTDSLAccess().getStartStartPointParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleStartPoint_in_ruleDTDSL312);
            lv_start_9_0=ruleStartPoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDTDSLRule());
            	        }
                   		set(
                   			current, 
                   			"start",
                    		lv_start_9_0, 
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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:196:1: entryRuleStartPoint returns [EObject current=null] : iv_ruleStartPoint= ruleStartPoint EOF ;
    public final EObject entryRuleStartPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartPoint = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:197:2: (iv_ruleStartPoint= ruleStartPoint EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:198:2: iv_ruleStartPoint= ruleStartPoint EOF
            {
             newCompositeNode(grammarAccess.getStartPointRule()); 
            pushFollow(FOLLOW_ruleStartPoint_in_entryRuleStartPoint348);
            iv_ruleStartPoint=ruleStartPoint();

            state._fsp--;

             current =iv_ruleStartPoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartPoint358); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:205:1: ruleStartPoint returns [EObject current=null] : ( (otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ) ;
    public final EObject ruleStartPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:208:28: ( ( (otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:209:1: ( (otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:209:1: ( (otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:209:2: (otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:209:2: (otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:209:4: otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleStartPoint396); 

                        	newLeafNode(otherlv_0, grammarAccess.getStartPointAccess().getBeginWithKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleStartPoint408); 

                        	newLeafNode(otherlv_1, grammarAccess.getStartPointAccess().getEqualsSignKeyword_0_1());
                        
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:217:1: ( (otherlv_2= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:218:1: (otherlv_2= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:218:1: (otherlv_2= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:219:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStartPointRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStartPoint428); 

                    		newLeafNode(otherlv_2, grammarAccess.getStartPointAccess().getBeginObjectDescriptionCrossReference_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:231:6: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:231:6: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:231:7: ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:231:7: ( (otherlv_3= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:232:1: (otherlv_3= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:232:1: (otherlv_3= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:233:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStartPointRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStartPoint456); 

                    		newLeafNode(otherlv_3, grammarAccess.getStartPointAccess().getBeginStringDescriptionCrossReference_1_0_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleStartPoint468); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:256:1: entryRuleAbstract returns [EObject current=null] : iv_ruleAbstract= ruleAbstract EOF ;
    public final EObject entryRuleAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstract = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:257:2: (iv_ruleAbstract= ruleAbstract EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:258:2: iv_ruleAbstract= ruleAbstract EOF
            {
             newCompositeNode(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract505);
            iv_ruleAbstract=ruleAbstract();

            state._fsp--;

             current =iv_ruleAbstract; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract515); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:265:1: ruleAbstract returns [EObject current=null] : (this_ObjectDescription_0= ruleObjectDescription | this_StringDescription_1= ruleStringDescription ) ;
    public final EObject ruleAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectDescription_0 = null;

        EObject this_StringDescription_1 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:268:28: ( (this_ObjectDescription_0= ruleObjectDescription | this_StringDescription_1= ruleStringDescription ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:269:1: (this_ObjectDescription_0= ruleObjectDescription | this_StringDescription_1= ruleStringDescription )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:269:1: (this_ObjectDescription_0= ruleObjectDescription | this_StringDescription_1= ruleStringDescription )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:270:5: this_ObjectDescription_0= ruleObjectDescription
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractAccess().getObjectDescriptionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleObjectDescription_in_ruleAbstract562);
                    this_ObjectDescription_0=ruleObjectDescription();

                    state._fsp--;

                     
                            current = this_ObjectDescription_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:280:5: this_StringDescription_1= ruleStringDescription
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractAccess().getStringDescriptionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringDescription_in_ruleAbstract589);
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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:296:1: entryRuleStringDescription returns [EObject current=null] : iv_ruleStringDescription= ruleStringDescription EOF ;
    public final EObject entryRuleStringDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringDescription = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:297:2: (iv_ruleStringDescription= ruleStringDescription EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:298:2: iv_ruleStringDescription= ruleStringDescription EOF
            {
             newCompositeNode(grammarAccess.getStringDescriptionRule()); 
            pushFollow(FOLLOW_ruleStringDescription_in_entryRuleStringDescription624);
            iv_ruleStringDescription=ruleStringDescription();

            state._fsp--;

             current =iv_ruleStringDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringDescription634); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:305:1: ruleStringDescription returns [EObject current=null] : (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleStringDescriptionInner ) )* otherlv_5= '}' ) ;
    public final EObject ruleStringDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_description_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:308:28: ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleStringDescriptionInner ) )* otherlv_5= '}' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:309:1: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleStringDescriptionInner ) )* otherlv_5= '}' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:309:1: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleStringDescriptionInner ) )* otherlv_5= '}' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:309:3: otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleStringDescriptionInner ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleStringDescription671); 

                	newLeafNode(otherlv_0, grammarAccess.getStringDescriptionAccess().getStringKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:313:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:314:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:314:1: (lv_name_1_0= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:315:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringDescription688); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleStringDescription705); 

                	newLeafNode(otherlv_2, grammarAccess.getStringDescriptionAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleStringDescription717); 

                	newLeafNode(otherlv_3, grammarAccess.getStringDescriptionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:339:1: ( (lv_description_4_0= ruleStringDescriptionInner ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||(LA5_0>=22 && LA5_0<=23)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:340:1: (lv_description_4_0= ruleStringDescriptionInner )
            	    {
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:340:1: (lv_description_4_0= ruleStringDescriptionInner )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:341:3: lv_description_4_0= ruleStringDescriptionInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStringDescriptionAccess().getDescriptionStringDescriptionInnerParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStringDescriptionInner_in_ruleStringDescription738);
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
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleStringDescription751); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:369:1: entryRuleStringDescriptionInner returns [String current=null] : iv_ruleStringDescriptionInner= ruleStringDescriptionInner EOF ;
    public final String entryRuleStringDescriptionInner() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringDescriptionInner = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:370:2: (iv_ruleStringDescriptionInner= ruleStringDescriptionInner EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:371:2: iv_ruleStringDescriptionInner= ruleStringDescriptionInner EOF
            {
             newCompositeNode(grammarAccess.getStringDescriptionInnerRule()); 
            pushFollow(FOLLOW_ruleStringDescriptionInner_in_entryRuleStringDescriptionInner788);
            iv_ruleStringDescriptionInner=ruleStringDescriptionInner();

            state._fsp--;

             current =iv_ruleStringDescriptionInner.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringDescriptionInner799); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:378:1: ruleStringDescriptionInner returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_StringOverRead_0= ruleStringOverRead | this_StringKey_1= ruleStringKey | this_StringValue_2= ruleStringValue ) ;
    public final AntlrDatatypeRuleToken ruleStringDescriptionInner() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_StringOverRead_0 = null;

        AntlrDatatypeRuleToken this_StringKey_1 = null;

        AntlrDatatypeRuleToken this_StringValue_2 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:381:28: ( (this_StringOverRead_0= ruleStringOverRead | this_StringKey_1= ruleStringKey | this_StringValue_2= ruleStringValue ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:382:1: (this_StringOverRead_0= ruleStringOverRead | this_StringKey_1= ruleStringKey | this_StringValue_2= ruleStringValue )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:382:1: (this_StringOverRead_0= ruleStringOverRead | this_StringKey_1= ruleStringKey | this_StringValue_2= ruleStringValue )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case 22:
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
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:383:5: this_StringOverRead_0= ruleStringOverRead
                    {
                     
                            newCompositeNode(grammarAccess.getStringDescriptionInnerAccess().getStringOverReadParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringOverRead_in_ruleStringDescriptionInner846);
                    this_StringOverRead_0=ruleStringOverRead();

                    state._fsp--;


                    		current.merge(this_StringOverRead_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:395:5: this_StringKey_1= ruleStringKey
                    {
                     
                            newCompositeNode(grammarAccess.getStringDescriptionInnerAccess().getStringKeyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringKey_in_ruleStringDescriptionInner879);
                    this_StringKey_1=ruleStringKey();

                    state._fsp--;


                    		current.merge(this_StringKey_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:407:5: this_StringValue_2= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getStringDescriptionInnerAccess().getStringValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleStringDescriptionInner912);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;


                    		current.merge(this_StringValue_2);
                        
                     
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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:427:1: entryRuleStringOverRead returns [String current=null] : iv_ruleStringOverRead= ruleStringOverRead EOF ;
    public final String entryRuleStringOverRead() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringOverRead = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:428:2: (iv_ruleStringOverRead= ruleStringOverRead EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:429:2: iv_ruleStringOverRead= ruleStringOverRead EOF
            {
             newCompositeNode(grammarAccess.getStringOverReadRule()); 
            pushFollow(FOLLOW_ruleStringOverRead_in_entryRuleStringOverRead960);
            iv_ruleStringOverRead=ruleStringOverRead();

            state._fsp--;

             current =iv_ruleStringOverRead.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringOverRead971); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:436:1: ruleStringOverRead returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringOverRead() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:439:28: (this_STRING_0= RULE_STRING )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:440:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringOverRead1010); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getStringOverReadAccess().getSTRINGTerminalRuleCall()); 
                

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:455:1: entryRuleStringKey returns [String current=null] : iv_ruleStringKey= ruleStringKey EOF ;
    public final String entryRuleStringKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringKey = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:456:2: (iv_ruleStringKey= ruleStringKey EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:457:2: iv_ruleStringKey= ruleStringKey EOF
            {
             newCompositeNode(grammarAccess.getStringKeyRule()); 
            pushFollow(FOLLOW_ruleStringKey_in_entryRuleStringKey1055);
            iv_ruleStringKey=ruleStringKey();

            state._fsp--;

             current =iv_ruleStringKey.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringKey1066); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:464:1: ruleStringKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Key' ;
    public final AntlrDatatypeRuleToken ruleStringKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:467:28: (kw= 'Key' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:469:2: kw= 'Key'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleStringKey1103); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStringKeyAccess().getKeyKeyword()); 
                

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:482:1: entryRuleStringValue returns [String current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final String entryRuleStringValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringValue = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:483:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:484:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1143);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1154); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:491:1: ruleStringValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Value' ;
    public final AntlrDatatypeRuleToken ruleStringValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:494:28: (kw= 'Value' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:496:2: kw= 'Value'
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleStringValue1191); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStringValueAccess().getValueKeyword()); 
                

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:509:1: entryRuleObjectDescription returns [EObject current=null] : iv_ruleObjectDescription= ruleObjectDescription EOF ;
    public final EObject entryRuleObjectDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDescription = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:510:2: (iv_ruleObjectDescription= ruleObjectDescription EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:511:2: iv_ruleObjectDescription= ruleObjectDescription EOF
            {
             newCompositeNode(grammarAccess.getObjectDescriptionRule()); 
            pushFollow(FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription1230);
            iv_ruleObjectDescription=ruleObjectDescription();

            state._fsp--;

             current =iv_ruleObjectDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescription1240); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:518:1: ruleObjectDescription returns [EObject current=null] : (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleObjectDescriptionInner ) )* otherlv_5= '}' ) ;
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
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:521:28: ( (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleObjectDescriptionInner ) )* otherlv_5= '}' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:522:1: (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleObjectDescriptionInner ) )* otherlv_5= '}' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:522:1: (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleObjectDescriptionInner ) )* otherlv_5= '}' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:522:3: otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_description_4_0= ruleObjectDescriptionInner ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleObjectDescription1277); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectDescriptionAccess().getNodeKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:526:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:527:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:527:1: (lv_name_1_0= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:528:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectDescription1294); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleObjectDescription1311); 

                	newLeafNode(otherlv_2, grammarAccess.getObjectDescriptionAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleObjectDescription1323); 

                	newLeafNode(otherlv_3, grammarAccess.getObjectDescriptionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:552:1: ( (lv_description_4_0= ruleObjectDescriptionInner ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==25||(LA7_0>=27 && LA7_0<=28)||LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:553:1: (lv_description_4_0= ruleObjectDescriptionInner )
            	    {
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:553:1: (lv_description_4_0= ruleObjectDescriptionInner )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:554:3: lv_description_4_0= ruleObjectDescriptionInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjectDescriptionAccess().getDescriptionObjectDescriptionInnerParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleObjectDescriptionInner_in_ruleObjectDescription1344);
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
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleObjectDescription1357); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:584:1: entryRuleObjectDescriptionInner returns [EObject current=null] : iv_ruleObjectDescriptionInner= ruleObjectDescriptionInner EOF ;
    public final EObject entryRuleObjectDescriptionInner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDescriptionInner = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:585:2: (iv_ruleObjectDescriptionInner= ruleObjectDescriptionInner EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:586:2: iv_ruleObjectDescriptionInner= ruleObjectDescriptionInner EOF
            {
             newCompositeNode(grammarAccess.getObjectDescriptionInnerRule()); 
            pushFollow(FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner1395);
            iv_ruleObjectDescriptionInner=ruleObjectDescriptionInner();

            state._fsp--;

             current =iv_ruleObjectDescriptionInner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescriptionInner1405); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:593:1: ruleObjectDescriptionInner returns [EObject current=null] : ( (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice ) otherlv_6= ';' ) ;
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
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:596:28: ( ( (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice ) otherlv_6= ';' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:597:1: ( (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice ) otherlv_6= ';' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:597:1: ( (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice ) otherlv_6= ';' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:597:2: (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice ) otherlv_6= ';'
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:597:2: (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice )
            int alt8=6;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:598:5: this_ObjectNode_0= ruleObjectNode
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectNodeParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleObjectNode_in_ruleObjectDescriptionInner1453);
                    this_ObjectNode_0=ruleObjectNode();

                    state._fsp--;

                     
                            current = this_ObjectNode_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:608:5: this_ObjectAttribute_1= ruleObjectAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectAttributeParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleObjectAttribute_in_ruleObjectDescriptionInner1480);
                    this_ObjectAttribute_1=ruleObjectAttribute();

                    state._fsp--;

                     
                            current = this_ObjectAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:618:5: this_ObjectNext_2= ruleObjectNext
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectNextParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleObjectNext_in_ruleObjectDescriptionInner1507);
                    this_ObjectNext_2=ruleObjectNext();

                    state._fsp--;

                     
                            current = this_ObjectNext_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:628:5: this_ObjectMaybe_3= ruleObjectMaybe
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectMaybeParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_ruleObjectMaybe_in_ruleObjectDescriptionInner1534);
                    this_ObjectMaybe_3=ruleObjectMaybe();

                    state._fsp--;

                     
                            current = this_ObjectMaybe_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:638:5: this_ObjectMany_4= ruleObjectMany
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectManyParserRuleCall_0_4()); 
                        
                    pushFollow(FOLLOW_ruleObjectMany_in_ruleObjectDescriptionInner1561);
                    this_ObjectMany_4=ruleObjectMany();

                    state._fsp--;

                     
                            current = this_ObjectMany_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:648:5: this_ObjectChoice_5= ruleObjectChoice
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectChoiceParserRuleCall_0_5()); 
                        
                    pushFollow(FOLLOW_ruleObjectChoice_in_ruleObjectDescriptionInner1588);
                    this_ObjectChoice_5=ruleObjectChoice();

                    state._fsp--;

                     
                            current = this_ObjectChoice_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleObjectDescriptionInner1600); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:668:1: entryRuleObjectAttribute returns [EObject current=null] : iv_ruleObjectAttribute= ruleObjectAttribute EOF ;
    public final EObject entryRuleObjectAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAttribute = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:669:2: (iv_ruleObjectAttribute= ruleObjectAttribute EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:670:2: iv_ruleObjectAttribute= ruleObjectAttribute EOF
            {
             newCompositeNode(grammarAccess.getObjectAttributeRule()); 
            pushFollow(FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute1636);
            iv_ruleObjectAttribute=ruleObjectAttribute();

            state._fsp--;

             current =iv_ruleObjectAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectAttribute1646); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:677:1: ruleObjectAttribute returns [EObject current=null] : (otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleObjectAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attributes_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:680:28: ( (otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )? ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:681:1: (otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )? )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:681:1: (otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )? )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:681:3: otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleObjectAttribute1683); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectAttributeAccess().getHasAttributeKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:685:1: ( (lv_attributes_1_0= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:686:1: (lv_attributes_1_0= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:686:1: (lv_attributes_1_0= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:687:3: lv_attributes_1_0= RULE_ID
            {
            lv_attributes_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectAttribute1700); 

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

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:703:2: (otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:703:4: otherlv_2= 'as' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleObjectAttribute1718); 

                        	newLeafNode(otherlv_2, grammarAccess.getObjectAttributeAccess().getAsKeyword_2_0());
                        
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:707:1: ( (otherlv_3= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:708:1: (otherlv_3= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:708:1: (otherlv_3= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:709:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjectAttributeRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectAttribute1738); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:730:1: entryRuleObjectNode returns [EObject current=null] : iv_ruleObjectNode= ruleObjectNode EOF ;
    public final EObject entryRuleObjectNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectNode = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:731:2: (iv_ruleObjectNode= ruleObjectNode EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:732:2: iv_ruleObjectNode= ruleObjectNode EOF
            {
             newCompositeNode(grammarAccess.getObjectNodeRule()); 
            pushFollow(FOLLOW_ruleObjectNode_in_entryRuleObjectNode1778);
            iv_ruleObjectNode=ruleObjectNode();

            state._fsp--;

             current =iv_ruleObjectNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectNode1788); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:739:1: ruleObjectNode returns [EObject current=null] : (otherlv_0= 'hasNode' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleObjectNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attributes_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:742:28: ( (otherlv_0= 'hasNode' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:743:1: (otherlv_0= 'hasNode' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:743:1: (otherlv_0= 'hasNode' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:743:3: otherlv_0= 'hasNode' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleObjectNode1825); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectNodeAccess().getHasNodeKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:747:1: ( (lv_attributes_1_0= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:748:1: (lv_attributes_1_0= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:748:1: (lv_attributes_1_0= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:749:3: lv_attributes_1_0= RULE_ID
            {
            lv_attributes_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectNode1842); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleObjectNode1859); 

                	newLeafNode(otherlv_2, grammarAccess.getObjectNodeAccess().getAsKeyword_2());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:769:1: ( (otherlv_3= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:770:1: (otherlv_3= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:770:1: (otherlv_3= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:771:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectNodeRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectNode1879); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:790:1: entryRuleObjectNext returns [EObject current=null] : iv_ruleObjectNext= ruleObjectNext EOF ;
    public final EObject entryRuleObjectNext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectNext = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:791:2: (iv_ruleObjectNext= ruleObjectNext EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:792:2: iv_ruleObjectNext= ruleObjectNext EOF
            {
             newCompositeNode(grammarAccess.getObjectNextRule()); 
            pushFollow(FOLLOW_ruleObjectNext_in_entryRuleObjectNext1915);
            iv_ruleObjectNext=ruleObjectNext();

            state._fsp--;

             current =iv_ruleObjectNext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectNext1925); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:799:1: ruleObjectNext returns [EObject current=null] : (otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleObjectNext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_attribute_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:802:28: ( (otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:803:1: (otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:803:1: (otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:803:3: otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleObjectNext1962); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectNextAccess().getHasNextKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:807:1: ( (lv_attribute_1_0= ruleJavaCodeOrID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:808:1: (lv_attribute_1_0= ruleJavaCodeOrID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:808:1: (lv_attribute_1_0= ruleJavaCodeOrID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:809:3: lv_attribute_1_0= ruleJavaCodeOrID
            {
             
            	        newCompositeNode(grammarAccess.getObjectNextAccess().getAttributeJavaCodeOrIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_ruleObjectNext1983);
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

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleObjectNext1995); 

                	newLeafNode(otherlv_2, grammarAccess.getObjectNextAccess().getAsKeyword_2());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:829:1: ( (otherlv_3= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:830:1: (otherlv_3= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:830:1: (otherlv_3= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:831:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectNextRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectNext2015); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:850:1: entryRuleJavaCodeOrID returns [EObject current=null] : iv_ruleJavaCodeOrID= ruleJavaCodeOrID EOF ;
    public final EObject entryRuleJavaCodeOrID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaCodeOrID = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:851:2: (iv_ruleJavaCodeOrID= ruleJavaCodeOrID EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:852:2: iv_ruleJavaCodeOrID= ruleJavaCodeOrID EOF
            {
             newCompositeNode(grammarAccess.getJavaCodeOrIDRule()); 
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID2051);
            iv_ruleJavaCodeOrID=ruleJavaCodeOrID();

            state._fsp--;

             current =iv_ruleJavaCodeOrID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaCodeOrID2061); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:859:1: ruleJavaCodeOrID returns [EObject current=null] : ( (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) ) | ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleJavaCodeOrID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_code_2_0=null;
        Token lv_id_3_0=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:862:28: ( ( (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) ) | ( (lv_id_3_0= RULE_ID ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:863:1: ( (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) ) | ( (lv_id_3_0= RULE_ID ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:863:1: ( (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) ) | ( (lv_id_3_0= RULE_ID ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:863:2: (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:863:2: (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:863:4: otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleJavaCodeOrID2099); 

                        	newLeafNode(otherlv_0, grammarAccess.getJavaCodeOrIDAccess().getJavaKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleJavaCodeOrID2111); 

                        	newLeafNode(otherlv_1, grammarAccess.getJavaCodeOrIDAccess().getColonKeyword_0_1());
                        
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:871:1: ( (lv_code_2_0= RULE_STRING ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:872:1: (lv_code_2_0= RULE_STRING )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:872:1: (lv_code_2_0= RULE_STRING )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:873:3: lv_code_2_0= RULE_STRING
                    {
                    lv_code_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJavaCodeOrID2128); 

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
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:890:6: ( (lv_id_3_0= RULE_ID ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:890:6: ( (lv_id_3_0= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:891:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:891:1: (lv_id_3_0= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:892:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJavaCodeOrID2157); 

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


    // $ANTLR start "entryRuleObjectMany"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:916:1: entryRuleObjectMany returns [EObject current=null] : iv_ruleObjectMany= ruleObjectMany EOF ;
    public final EObject entryRuleObjectMany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectMany = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:917:2: (iv_ruleObjectMany= ruleObjectMany EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:918:2: iv_ruleObjectMany= ruleObjectMany EOF
            {
             newCompositeNode(grammarAccess.getObjectManyRule()); 
            pushFollow(FOLLOW_ruleObjectMany_in_entryRuleObjectMany2198);
            iv_ruleObjectMany=ruleObjectMany();

            state._fsp--;

             current =iv_ruleObjectMany; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMany2208); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:925:1: ruleObjectMany returns [EObject current=null] : ( ( (lv_option_0_0= ruleObjectMaybeInner ) ) otherlv_1= '*' ) ;
    public final EObject ruleObjectMany() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_option_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:928:28: ( ( ( (lv_option_0_0= ruleObjectMaybeInner ) ) otherlv_1= '*' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:929:1: ( ( (lv_option_0_0= ruleObjectMaybeInner ) ) otherlv_1= '*' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:929:1: ( ( (lv_option_0_0= ruleObjectMaybeInner ) ) otherlv_1= '*' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:929:2: ( (lv_option_0_0= ruleObjectMaybeInner ) ) otherlv_1= '*'
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:929:2: ( (lv_option_0_0= ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:930:1: (lv_option_0_0= ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:930:1: (lv_option_0_0= ruleObjectMaybeInner )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:931:3: lv_option_0_0= ruleObjectMaybeInner
            {
             
            	        newCompositeNode(grammarAccess.getObjectManyAccess().getOptionObjectMaybeInnerParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_ruleObjectMany2254);
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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleObjectMany2266); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:959:1: entryRuleObjectChoice returns [EObject current=null] : iv_ruleObjectChoice= ruleObjectChoice EOF ;
    public final EObject entryRuleObjectChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectChoice = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:960:2: (iv_ruleObjectChoice= ruleObjectChoice EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:961:2: iv_ruleObjectChoice= ruleObjectChoice EOF
            {
             newCompositeNode(grammarAccess.getObjectChoiceRule()); 
            pushFollow(FOLLOW_ruleObjectChoice_in_entryRuleObjectChoice2302);
            iv_ruleObjectChoice=ruleObjectChoice();

            state._fsp--;

             current =iv_ruleObjectChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectChoice2312); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:968:1: ruleObjectChoice returns [EObject current=null] : (otherlv_0= '(' ( (lv_options_1_0= ruleObjectMaybeInner ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleObjectChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_options_1_0 = null;

        EObject lv_options_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:971:28: ( (otherlv_0= '(' ( (lv_options_1_0= ruleObjectMaybeInner ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )* otherlv_4= ')' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:972:1: (otherlv_0= '(' ( (lv_options_1_0= ruleObjectMaybeInner ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )* otherlv_4= ')' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:972:1: (otherlv_0= '(' ( (lv_options_1_0= ruleObjectMaybeInner ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )* otherlv_4= ')' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:972:3: otherlv_0= '(' ( (lv_options_1_0= ruleObjectMaybeInner ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleObjectChoice2349); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectChoiceAccess().getLeftParenthesisKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:976:1: ( (lv_options_1_0= ruleObjectMaybeInner ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:977:1: (lv_options_1_0= ruleObjectMaybeInner )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:977:1: (lv_options_1_0= ruleObjectMaybeInner )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:978:3: lv_options_1_0= ruleObjectMaybeInner
            {
             
            	        newCompositeNode(grammarAccess.getObjectChoiceAccess().getOptionsObjectMaybeInnerParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_ruleObjectChoice2370);
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

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:994:2: (otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:994:4: otherlv_2= '|' ( (lv_options_3_0= ruleObjectMaybeInner ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleObjectChoice2383); 

            	        	newLeafNode(otherlv_2, grammarAccess.getObjectChoiceAccess().getVerticalLineKeyword_2_0());
            	        
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:998:1: ( (lv_options_3_0= ruleObjectMaybeInner ) )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:999:1: (lv_options_3_0= ruleObjectMaybeInner )
            	    {
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:999:1: (lv_options_3_0= ruleObjectMaybeInner )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1000:3: lv_options_3_0= ruleObjectMaybeInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjectChoiceAccess().getOptionsObjectMaybeInnerParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleObjectMaybeInner_in_ruleObjectChoice2404);
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
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleObjectChoice2418); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1028:1: entryRuleObjectMaybe returns [EObject current=null] : iv_ruleObjectMaybe= ruleObjectMaybe EOF ;
    public final EObject entryRuleObjectMaybe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectMaybe = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1029:2: (iv_ruleObjectMaybe= ruleObjectMaybe EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1030:2: iv_ruleObjectMaybe= ruleObjectMaybe EOF
            {
             newCompositeNode(grammarAccess.getObjectMaybeRule()); 
            pushFollow(FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe2454);
            iv_ruleObjectMaybe=ruleObjectMaybe();

            state._fsp--;

             current =iv_ruleObjectMaybe; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMaybe2464); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1037:1: ruleObjectMaybe returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' ) ) ;
    public final EObject ruleObjectMaybe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_description_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1040:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1041:1: ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1041:1: ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==25||(LA12_0>=27 && LA12_0<=28)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1041:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1041:2: ( (otherlv_0= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1042:1: (otherlv_0= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1042:1: (otherlv_0= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1043:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjectMaybeRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectMaybe2509); 

                    		newLeafNode(otherlv_0, grammarAccess.getObjectMaybeAccess().getOptionObjectDescriptionCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1055:6: ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1055:6: ( ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?' )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1055:7: ( (lv_description_1_0= ruleObjectMaybeInner ) ) otherlv_2= '?'
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1055:7: ( (lv_description_1_0= ruleObjectMaybeInner ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1056:1: (lv_description_1_0= ruleObjectMaybeInner )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1056:1: (lv_description_1_0= ruleObjectMaybeInner )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1057:3: lv_description_1_0= ruleObjectMaybeInner
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectMaybeAccess().getDescriptionObjectMaybeInnerParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleObjectMaybeInner_in_ruleObjectMaybe2537);
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

                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleObjectMaybe2549); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1085:1: entryRuleObjectMaybeInner returns [EObject current=null] : iv_ruleObjectMaybeInner= ruleObjectMaybeInner EOF ;
    public final EObject entryRuleObjectMaybeInner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectMaybeInner = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1086:2: (iv_ruleObjectMaybeInner= ruleObjectMaybeInner EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1087:2: iv_ruleObjectMaybeInner= ruleObjectMaybeInner EOF
            {
             newCompositeNode(grammarAccess.getObjectMaybeInnerRule()); 
            pushFollow(FOLLOW_ruleObjectMaybeInner_in_entryRuleObjectMaybeInner2586);
            iv_ruleObjectMaybeInner=ruleObjectMaybeInner();

            state._fsp--;

             current =iv_ruleObjectMaybeInner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMaybeInner2596); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1094:1: ruleObjectMaybeInner returns [EObject current=null] : (this_ObjectNext_0= ruleObjectNext | this_ObjectNode_1= ruleObjectNode | this_ObjectAttribute_2= ruleObjectAttribute ) ;
    public final EObject ruleObjectMaybeInner() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectNext_0 = null;

        EObject this_ObjectNode_1 = null;

        EObject this_ObjectAttribute_2 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1097:28: ( (this_ObjectNext_0= ruleObjectNext | this_ObjectNode_1= ruleObjectNode | this_ObjectAttribute_2= ruleObjectAttribute ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1098:1: (this_ObjectNext_0= ruleObjectNext | this_ObjectNode_1= ruleObjectNode | this_ObjectAttribute_2= ruleObjectAttribute )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1098:1: (this_ObjectNext_0= ruleObjectNext | this_ObjectNode_1= ruleObjectNode | this_ObjectAttribute_2= ruleObjectAttribute )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 25:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1099:5: this_ObjectNext_0= ruleObjectNext
                    {
                     
                            newCompositeNode(grammarAccess.getObjectMaybeInnerAccess().getObjectNextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleObjectNext_in_ruleObjectMaybeInner2643);
                    this_ObjectNext_0=ruleObjectNext();

                    state._fsp--;

                     
                            current = this_ObjectNext_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1109:5: this_ObjectNode_1= ruleObjectNode
                    {
                     
                            newCompositeNode(grammarAccess.getObjectMaybeInnerAccess().getObjectNodeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleObjectNode_in_ruleObjectMaybeInner2670);
                    this_ObjectNode_1=ruleObjectNode();

                    state._fsp--;

                     
                            current = this_ObjectNode_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:1119:5: this_ObjectAttribute_2= ruleObjectAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getObjectMaybeInnerAccess().getObjectAttributeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleObjectAttribute_in_ruleObjectMaybeInner2697);
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


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\26\uffff";
    static final String DFA8_eofS =
        "\26\uffff";
    static final String DFA8_minS =
        "\4\5\2\uffff\1\32\1\15\1\23\1\32\2\5\2\uffff\1\4\1\5\2\15\1\32"+
        "\1\15\2\uffff";
    static final String DFA8_maxS =
        "\1\37\2\5\1\35\2\uffff\1\32\1\42\1\23\1\32\2\5\2\uffff\1\4\1\5"+
        "\2\42\1\32\1\42\2\uffff";
    static final String DFA8_acceptS =
        "\4\uffff\1\4\1\6\6\uffff\1\5\1\2\6\uffff\1\1\1\3";
    static final String DFA8_specialS =
        "\26\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\4\23\uffff\1\2\1\uffff\1\1\1\3\2\uffff\1\5",
            "\1\6",
            "\1\7",
            "\1\11\27\uffff\1\10",
            "",
            "",
            "\1\12",
            "\1\15\14\uffff\1\13\3\uffff\1\14\3\uffff\1\4",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "",
            "",
            "\1\22",
            "\1\23",
            "\1\24\20\uffff\1\14\3\uffff\1\4",
            "\1\15\20\uffff\1\14\3\uffff\1\4",
            "\1\17",
            "\1\25\20\uffff\1\14\3\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "597:2: (this_ObjectNode_0= ruleObjectNode | this_ObjectAttribute_1= ruleObjectAttribute | this_ObjectNext_2= ruleObjectNext | this_ObjectMaybe_3= ruleObjectMaybe | this_ObjectMany_4= ruleObjectMany | this_ObjectChoice_5= ruleObjectChoice )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDTDSL_in_entryRuleDTDSL75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDTDSL85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDTDSL122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDTDSL134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDTDSL151 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDTDSL168 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDTDSL180 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDTDSL192 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleDTDSL212 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16_in_ruleDTDSL241 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDTDSL269 = new BitSet(new long[]{0x0000000001060020L});
    public static final BitSet FOLLOW_ruleAbstract_in_ruleDTDSL290 = new BitSet(new long[]{0x0000000001060020L});
    public static final BitSet FOLLOW_ruleStartPoint_in_ruleDTDSL312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartPoint_in_entryRuleStartPoint348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartPoint358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStartPoint396 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStartPoint408 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartPoint428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartPoint456 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStartPoint468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescription_in_ruleAbstract562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescription_in_ruleAbstract589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescription_in_entryRuleStringDescription624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringDescription634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleStringDescription671 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringDescription688 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStringDescription705 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStringDescription717 = new BitSet(new long[]{0x0000000000E00010L});
    public static final BitSet FOLLOW_ruleStringDescriptionInner_in_ruleStringDescription738 = new BitSet(new long[]{0x0000000000E00010L});
    public static final BitSet FOLLOW_21_in_ruleStringDescription751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDescriptionInner_in_entryRuleStringDescriptionInner788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringDescriptionInner799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringOverRead_in_ruleStringDescriptionInner846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringKey_in_ruleStringDescriptionInner879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleStringDescriptionInner912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringOverRead_in_entryRuleStringOverRead960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringOverRead971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringOverRead1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringKey_in_entryRuleStringKey1055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringKey1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleStringKey1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleStringValue1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription1230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescription1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleObjectDescription1277 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectDescription1294 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleObjectDescription1311 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleObjectDescription1323 = new BitSet(new long[]{0x000000009A200020L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_ruleObjectDescription1344 = new BitSet(new long[]{0x000000009A200020L});
    public static final BitSet FOLLOW_21_in_ruleObjectDescription1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner1395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescriptionInner1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_ruleObjectDescriptionInner1453 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_ruleObjectDescriptionInner1480 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleObjectNext_in_ruleObjectDescriptionInner1507 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_ruleObjectDescriptionInner1534 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleObjectMany_in_ruleObjectDescriptionInner1561 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleObjectChoice_in_ruleObjectDescriptionInner1588 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleObjectDescriptionInner1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute1636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectAttribute1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleObjectAttribute1683 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectAttribute1700 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleObjectAttribute1718 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectAttribute1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_entryRuleObjectNode1778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectNode1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleObjectNode1825 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectNode1842 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleObjectNode1859 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectNode1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_entryRuleObjectNext1915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectNext1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleObjectNext1962 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_ruleObjectNext1983 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleObjectNext1995 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectNext2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID2051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaCodeOrID2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleJavaCodeOrID2099 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleJavaCodeOrID2111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJavaCodeOrID2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJavaCodeOrID2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMany_in_entryRuleObjectMany2198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMany2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_ruleObjectMany2254 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleObjectMany2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectChoice_in_entryRuleObjectChoice2302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectChoice2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleObjectChoice2349 = new BitSet(new long[]{0x000000001A000020L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_ruleObjectChoice2370 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleObjectChoice2383 = new BitSet(new long[]{0x000000001A000020L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_ruleObjectChoice2404 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33_in_ruleObjectChoice2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe2454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMaybe2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectMaybe2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_ruleObjectMaybe2537 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleObjectMaybe2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybeInner_in_entryRuleObjectMaybeInner2586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMaybeInner2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_ruleObjectMaybeInner2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNode_in_ruleObjectMaybeInner2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_ruleObjectMaybeInner2697 = new BitSet(new long[]{0x0000000000000002L});

}