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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'parserName'", "'='", "';'", "'parserType'", "'javaObject'", "'string'", "'import'", "'beginWith'", "':'", "'{'", "'}'", "'hasAttribute'", "'ofType'", "'as'", "'hasNext'", "'java'", "'int'", "'float'", "'String'", "'('", "')'", "'*'", "'|'", "'?'", "'Key'", "'Value'"
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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:76:1: ruleDTDSL returns [EObject current=null] : (otherlv_0= 'parserName' otherlv_1= '=' ( (lv_parserName_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'parserType' otherlv_5= '=' ( ( (lv_type_6_1= 'javaObject' | lv_type_6_2= 'string' ) ) ) otherlv_7= ';' ( (lv_imports_8_0= ruleimportStatement ) )* ( (lv_objDescription_9_0= ruleAbstract ) )* ( (lv_start_10_0= ruleStartPoint ) ) ) ;
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
        EObject lv_imports_8_0 = null;

        EObject lv_objDescription_9_0 = null;

        EObject lv_start_10_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:79:28: ( (otherlv_0= 'parserName' otherlv_1= '=' ( (lv_parserName_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'parserType' otherlv_5= '=' ( ( (lv_type_6_1= 'javaObject' | lv_type_6_2= 'string' ) ) ) otherlv_7= ';' ( (lv_imports_8_0= ruleimportStatement ) )* ( (lv_objDescription_9_0= ruleAbstract ) )* ( (lv_start_10_0= ruleStartPoint ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:80:1: (otherlv_0= 'parserName' otherlv_1= '=' ( (lv_parserName_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'parserType' otherlv_5= '=' ( ( (lv_type_6_1= 'javaObject' | lv_type_6_2= 'string' ) ) ) otherlv_7= ';' ( (lv_imports_8_0= ruleimportStatement ) )* ( (lv_objDescription_9_0= ruleAbstract ) )* ( (lv_start_10_0= ruleStartPoint ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:80:1: (otherlv_0= 'parserName' otherlv_1= '=' ( (lv_parserName_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'parserType' otherlv_5= '=' ( ( (lv_type_6_1= 'javaObject' | lv_type_6_2= 'string' ) ) ) otherlv_7= ';' ( (lv_imports_8_0= ruleimportStatement ) )* ( (lv_objDescription_9_0= ruleAbstract ) )* ( (lv_start_10_0= ruleStartPoint ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:80:3: otherlv_0= 'parserName' otherlv_1= '=' ( (lv_parserName_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'parserType' otherlv_5= '=' ( ( (lv_type_6_1= 'javaObject' | lv_type_6_2= 'string' ) ) ) otherlv_7= ';' ( (lv_imports_8_0= ruleimportStatement ) )* ( (lv_objDescription_9_0= ruleAbstract ) )* ( (lv_start_10_0= ruleStartPoint ) )
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
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:152:1: ( (lv_imports_8_0= ruleimportStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:153:1: (lv_imports_8_0= ruleimportStatement )
            	    {
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:153:1: (lv_imports_8_0= ruleimportStatement )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:154:3: lv_imports_8_0= ruleimportStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDTDSLAccess().getImportsImportStatementParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleimportStatement_in_ruleDTDSL290);
            	    lv_imports_8_0=ruleimportStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDTDSLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_8_0, 
            	            		"importStatement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:170:3: ( (lv_objDescription_9_0= ruleAbstract ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==30) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:171:1: (lv_objDescription_9_0= ruleAbstract )
            	    {
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:171:1: (lv_objDescription_9_0= ruleAbstract )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:172:3: lv_objDescription_9_0= ruleAbstract
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDTDSLAccess().getObjDescriptionAbstractParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstract_in_ruleDTDSL312);
            	    lv_objDescription_9_0=ruleAbstract();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDTDSLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"objDescription",
            	            		lv_objDescription_9_0, 
            	            		"Abstract");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:188:3: ( (lv_start_10_0= ruleStartPoint ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:189:1: (lv_start_10_0= ruleStartPoint )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:189:1: (lv_start_10_0= ruleStartPoint )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:190:3: lv_start_10_0= ruleStartPoint
            {
             
            	        newCompositeNode(grammarAccess.getDTDSLAccess().getStartStartPointParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleStartPoint_in_ruleDTDSL334);
            lv_start_10_0=ruleStartPoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDTDSLRule());
            	        }
                   		set(
                   			current, 
                   			"start",
                    		lv_start_10_0, 
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


    // $ANTLR start "entryRuleimportStatement"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:214:1: entryRuleimportStatement returns [EObject current=null] : iv_ruleimportStatement= ruleimportStatement EOF ;
    public final EObject entryRuleimportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleimportStatement = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:215:2: (iv_ruleimportStatement= ruleimportStatement EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:216:2: iv_ruleimportStatement= ruleimportStatement EOF
            {
             newCompositeNode(grammarAccess.getImportStatementRule()); 
            pushFollow(FOLLOW_ruleimportStatement_in_entryRuleimportStatement370);
            iv_ruleimportStatement=ruleimportStatement();

            state._fsp--;

             current =iv_ruleimportStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleimportStatement380); 

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
    // $ANTLR end "entryRuleimportStatement"


    // $ANTLR start "ruleimportStatement"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:223:1: ruleimportStatement returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importClass_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleimportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importClass_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:226:28: ( (otherlv_0= 'import' ( (lv_importClass_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:227:1: (otherlv_0= 'import' ( (lv_importClass_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:227:1: (otherlv_0= 'import' ( (lv_importClass_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:227:3: otherlv_0= 'import' ( (lv_importClass_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleimportStatement417); 

                	newLeafNode(otherlv_0, grammarAccess.getImportStatementAccess().getImportKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:231:1: ( (lv_importClass_1_0= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:232:1: (lv_importClass_1_0= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:232:1: (lv_importClass_1_0= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:233:3: lv_importClass_1_0= RULE_ID
            {
            lv_importClass_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleimportStatement434); 

            			newLeafNode(lv_importClass_1_0, grammarAccess.getImportStatementAccess().getImportClassIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importClass",
                    		lv_importClass_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleimportStatement451); 

                	newLeafNode(otherlv_2, grammarAccess.getImportStatementAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleimportStatement"


    // $ANTLR start "entryRuleStartPoint"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:261:1: entryRuleStartPoint returns [EObject current=null] : iv_ruleStartPoint= ruleStartPoint EOF ;
    public final EObject entryRuleStartPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartPoint = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:262:2: (iv_ruleStartPoint= ruleStartPoint EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:263:2: iv_ruleStartPoint= ruleStartPoint EOF
            {
             newCompositeNode(grammarAccess.getStartPointRule()); 
            pushFollow(FOLLOW_ruleStartPoint_in_entryRuleStartPoint487);
            iv_ruleStartPoint=ruleStartPoint();

            state._fsp--;

             current =iv_ruleStartPoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartPoint497); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:270:1: ruleStartPoint returns [EObject current=null] : (otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleStartPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:273:28: ( (otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:274:1: (otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:274:1: (otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:274:3: otherlv_0= 'beginWith' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleStartPoint534); 

                	newLeafNode(otherlv_0, grammarAccess.getStartPointAccess().getBeginWithKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleStartPoint546); 

                	newLeafNode(otherlv_1, grammarAccess.getStartPointAccess().getEqualsSignKeyword_1());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:282:1: ( (otherlv_2= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:283:1: (otherlv_2= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:283:1: (otherlv_2= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:284:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStartPointRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStartPoint566); 

            		newLeafNode(otherlv_2, grammarAccess.getStartPointAccess().getBeginObjectDescriptionCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStartPoint578); 

                	newLeafNode(otherlv_3, grammarAccess.getStartPointAccess().getSemicolonKeyword_3());
                

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:307:1: entryRuleAbstract returns [EObject current=null] : iv_ruleAbstract= ruleAbstract EOF ;
    public final EObject entryRuleAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstract = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:308:2: (iv_ruleAbstract= ruleAbstract EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:309:2: iv_ruleAbstract= ruleAbstract EOF
            {
             newCompositeNode(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract614);
            iv_ruleAbstract=ruleAbstract();

            state._fsp--;

             current =iv_ruleAbstract; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract624); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:316:1: ruleAbstract returns [EObject current=null] : (this_ObjectDescription_0= ruleObjectDescription | this_Choice_1= ruleChoice | this_Many_2= ruleMany ) ;
    public final EObject ruleAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectDescription_0 = null;

        EObject this_Choice_1 = null;

        EObject this_Many_2 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:319:28: ( (this_ObjectDescription_0= ruleObjectDescription | this_Choice_1= ruleChoice | this_Many_2= ruleMany ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:320:1: (this_ObjectDescription_0= ruleObjectDescription | this_Choice_1= ruleChoice | this_Many_2= ruleMany )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:320:1: (this_ObjectDescription_0= ruleObjectDescription | this_Choice_1= ruleChoice | this_Many_2= ruleMany )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                switch ( input.LA(2) ) {
                case 35:
                case 36:
                    {
                    alt4=2;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==31) ) {
                        int LA4_6 = input.LA(4);

                        if ( (LA4_6==EOF||LA4_6==RULE_ID||LA4_6==18||(LA4_6>=21 && LA4_6<=22)||LA4_6==25||(LA4_6>=30 && LA4_6<=31)) ) {
                            alt4=2;
                        }
                        else if ( (LA4_6==34) ) {
                            alt4=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 6, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA4_4==33) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 22:
                case 25:
                case 30:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:321:5: this_ObjectDescription_0= ruleObjectDescription
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractAccess().getObjectDescriptionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleObjectDescription_in_ruleAbstract671);
                    this_ObjectDescription_0=ruleObjectDescription();

                    state._fsp--;

                     
                            current = this_ObjectDescription_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:331:5: this_Choice_1= ruleChoice
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractAccess().getChoiceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleChoice_in_ruleAbstract698);
                    this_Choice_1=ruleChoice();

                    state._fsp--;

                     
                            current = this_Choice_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:341:5: this_Many_2= ruleMany
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractAccess().getManyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMany_in_ruleAbstract725);
                    this_Many_2=ruleMany();

                    state._fsp--;

                     
                            current = this_Many_2; 
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


    // $ANTLR start "entryRuleObjectDescription"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:357:1: entryRuleObjectDescription returns [EObject current=null] : iv_ruleObjectDescription= ruleObjectDescription EOF ;
    public final EObject entryRuleObjectDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDescription = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:358:2: (iv_ruleObjectDescription= ruleObjectDescription EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:359:2: iv_ruleObjectDescription= ruleObjectDescription EOF
            {
             newCompositeNode(grammarAccess.getObjectDescriptionRule()); 
            pushFollow(FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription760);
            iv_ruleObjectDescription=ruleObjectDescription();

            state._fsp--;

             current =iv_ruleObjectDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescription770); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:366:1: ruleObjectDescription returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_description_3_0= ruleObjectDescriptionInner ) )* otherlv_4= '}' ) ;
    public final EObject ruleObjectDescription() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_description_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:369:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_description_3_0= ruleObjectDescriptionInner ) )* otherlv_4= '}' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:370:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_description_3_0= ruleObjectDescriptionInner ) )* otherlv_4= '}' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:370:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_description_3_0= ruleObjectDescriptionInner ) )* otherlv_4= '}' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:370:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_description_3_0= ruleObjectDescriptionInner ) )* otherlv_4= '}'
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:370:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:371:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:371:1: (lv_name_0_0= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:372:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectDescription812); 

            			newLeafNode(lv_name_0_0, grammarAccess.getObjectDescriptionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectDescriptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleObjectDescription829); 

                	newLeafNode(otherlv_1, grammarAccess.getObjectDescriptionAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleObjectDescription841); 

                	newLeafNode(otherlv_2, grammarAccess.getObjectDescriptionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:396:1: ( (lv_description_3_0= ruleObjectDescriptionInner ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==22||LA5_0==25||LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:397:1: (lv_description_3_0= ruleObjectDescriptionInner )
            	    {
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:397:1: (lv_description_3_0= ruleObjectDescriptionInner )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:398:3: lv_description_3_0= ruleObjectDescriptionInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjectDescriptionAccess().getDescriptionObjectDescriptionInnerParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleObjectDescriptionInner_in_ruleObjectDescription862);
            	    lv_description_3_0=ruleObjectDescriptionInner();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjectDescriptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"description",
            	            		lv_description_3_0, 
            	            		"ObjectDescriptionInner");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleObjectDescription875); 

                	newLeafNode(otherlv_4, grammarAccess.getObjectDescriptionAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:426:1: entryRuleObjectDescriptionInner returns [EObject current=null] : iv_ruleObjectDescriptionInner= ruleObjectDescriptionInner EOF ;
    public final EObject entryRuleObjectDescriptionInner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDescriptionInner = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:427:2: (iv_ruleObjectDescriptionInner= ruleObjectDescriptionInner EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:428:2: iv_ruleObjectDescriptionInner= ruleObjectDescriptionInner EOF
            {
             newCompositeNode(grammarAccess.getObjectDescriptionInnerRule()); 
            pushFollow(FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner911);
            iv_ruleObjectDescriptionInner=ruleObjectDescriptionInner();

            state._fsp--;

             current =iv_ruleObjectDescriptionInner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectDescriptionInner921); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:435:1: ruleObjectDescriptionInner returns [EObject current=null] : (this_ObjectAttribute_0= ruleObjectAttribute | this_ObjectNext_1= ruleObjectNext | this_ObjectMaybe_2= ruleObjectMaybe ) ;
    public final EObject ruleObjectDescriptionInner() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectAttribute_0 = null;

        EObject this_ObjectNext_1 = null;

        EObject this_ObjectMaybe_2 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:438:28: ( (this_ObjectAttribute_0= ruleObjectAttribute | this_ObjectNext_1= ruleObjectNext | this_ObjectMaybe_2= ruleObjectMaybe ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:439:1: (this_ObjectAttribute_0= ruleObjectAttribute | this_ObjectNext_1= ruleObjectNext | this_ObjectMaybe_2= ruleObjectMaybe )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:439:1: (this_ObjectAttribute_0= ruleObjectAttribute | this_ObjectNext_1= ruleObjectNext | this_ObjectMaybe_2= ruleObjectMaybe )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
            case 30:
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
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:440:5: this_ObjectAttribute_0= ruleObjectAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleObjectAttribute_in_ruleObjectDescriptionInner968);
                    this_ObjectAttribute_0=ruleObjectAttribute();

                    state._fsp--;

                     
                            current = this_ObjectAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:450:5: this_ObjectNext_1= ruleObjectNext
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectNextParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleObjectNext_in_ruleObjectDescriptionInner995);
                    this_ObjectNext_1=ruleObjectNext();

                    state._fsp--;

                     
                            current = this_ObjectNext_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:460:5: this_ObjectMaybe_2= ruleObjectMaybe
                    {
                     
                            newCompositeNode(grammarAccess.getObjectDescriptionInnerAccess().getObjectMaybeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleObjectMaybe_in_ruleObjectDescriptionInner1022);
                    this_ObjectMaybe_2=ruleObjectMaybe();

                    state._fsp--;

                     
                            current = this_ObjectMaybe_2; 
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
    // $ANTLR end "ruleObjectDescriptionInner"


    // $ANTLR start "entryRuleObjectAttribute"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:476:1: entryRuleObjectAttribute returns [EObject current=null] : iv_ruleObjectAttribute= ruleObjectAttribute EOF ;
    public final EObject entryRuleObjectAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAttribute = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:477:2: (iv_ruleObjectAttribute= ruleObjectAttribute EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:478:2: iv_ruleObjectAttribute= ruleObjectAttribute EOF
            {
             newCompositeNode(grammarAccess.getObjectAttributeRule()); 
            pushFollow(FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute1057);
            iv_ruleObjectAttribute=ruleObjectAttribute();

            state._fsp--;

             current =iv_ruleObjectAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectAttribute1067); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:485:1: ruleObjectAttribute returns [EObject current=null] : (otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'ofType' ( ( ( (lv_types_3_0= ruleType ) ) otherlv_4= 'as' ( (lv_keyword_5_0= ruleKeyword ) ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ';' ) ;
    public final EObject ruleObjectAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attributes_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_types_3_0 = null;

        EObject lv_keyword_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:488:28: ( (otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'ofType' ( ( ( (lv_types_3_0= ruleType ) ) otherlv_4= 'as' ( (lv_keyword_5_0= ruleKeyword ) ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ';' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:489:1: (otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'ofType' ( ( ( (lv_types_3_0= ruleType ) ) otherlv_4= 'as' ( (lv_keyword_5_0= ruleKeyword ) ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ';' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:489:1: (otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'ofType' ( ( ( (lv_types_3_0= ruleType ) ) otherlv_4= 'as' ( (lv_keyword_5_0= ruleKeyword ) ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ';' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:489:3: otherlv_0= 'hasAttribute' ( (lv_attributes_1_0= RULE_ID ) ) otherlv_2= 'ofType' ( ( ( (lv_types_3_0= ruleType ) ) otherlv_4= 'as' ( (lv_keyword_5_0= ruleKeyword ) ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleObjectAttribute1104); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectAttributeAccess().getHasAttributeKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:493:1: ( (lv_attributes_1_0= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:494:1: (lv_attributes_1_0= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:494:1: (lv_attributes_1_0= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:495:3: lv_attributes_1_0= RULE_ID
            {
            lv_attributes_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectAttribute1121); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleObjectAttribute1138); 

                	newLeafNode(otherlv_2, grammarAccess.getObjectAttributeAccess().getOfTypeKeyword_2());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:515:1: ( ( ( (lv_types_3_0= ruleType ) ) otherlv_4= 'as' ( (lv_keyword_5_0= ruleKeyword ) ) ) | ( (otherlv_6= RULE_ID ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=27 && LA7_0<=29)) ) {
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
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:515:2: ( ( (lv_types_3_0= ruleType ) ) otherlv_4= 'as' ( (lv_keyword_5_0= ruleKeyword ) ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:515:2: ( ( (lv_types_3_0= ruleType ) ) otherlv_4= 'as' ( (lv_keyword_5_0= ruleKeyword ) ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:515:3: ( (lv_types_3_0= ruleType ) ) otherlv_4= 'as' ( (lv_keyword_5_0= ruleKeyword ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:515:3: ( (lv_types_3_0= ruleType ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:516:1: (lv_types_3_0= ruleType )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:516:1: (lv_types_3_0= ruleType )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:517:3: lv_types_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectAttributeAccess().getTypesTypeParserRuleCall_3_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleObjectAttribute1161);
                    lv_types_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"types",
                            		lv_types_3_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleObjectAttribute1173); 

                        	newLeafNode(otherlv_4, grammarAccess.getObjectAttributeAccess().getAsKeyword_3_0_1());
                        
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:537:1: ( (lv_keyword_5_0= ruleKeyword ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:538:1: (lv_keyword_5_0= ruleKeyword )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:538:1: (lv_keyword_5_0= ruleKeyword )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:539:3: lv_keyword_5_0= ruleKeyword
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectAttributeAccess().getKeywordKeywordParserRuleCall_3_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKeyword_in_ruleObjectAttribute1194);
                    lv_keyword_5_0=ruleKeyword();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"keyword",
                            		lv_keyword_5_0, 
                            		"Keyword");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:556:6: ( (otherlv_6= RULE_ID ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:556:6: ( (otherlv_6= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:557:1: (otherlv_6= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:557:1: (otherlv_6= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:558:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjectAttributeRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectAttribute1221); 

                    		newLeafNode(otherlv_6, grammarAccess.getObjectAttributeAccess().getInnerObjectDescriptionCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleObjectAttribute1234); 

                	newLeafNode(otherlv_7, grammarAccess.getObjectAttributeAccess().getSemicolonKeyword_4());
                

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


    // $ANTLR start "entryRuleObjectNext"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:581:1: entryRuleObjectNext returns [EObject current=null] : iv_ruleObjectNext= ruleObjectNext EOF ;
    public final EObject entryRuleObjectNext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectNext = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:582:2: (iv_ruleObjectNext= ruleObjectNext EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:583:2: iv_ruleObjectNext= ruleObjectNext EOF
            {
             newCompositeNode(grammarAccess.getObjectNextRule()); 
            pushFollow(FOLLOW_ruleObjectNext_in_entryRuleObjectNext1270);
            iv_ruleObjectNext=ruleObjectNext();

            state._fsp--;

             current =iv_ruleObjectNext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectNext1280); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:590:1: ruleObjectNext returns [EObject current=null] : (otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleObjectNext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_attribute_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:593:28: ( (otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:594:1: (otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:594:1: (otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:594:3: otherlv_0= 'hasNext' ( (lv_attribute_1_0= ruleJavaCodeOrID ) ) otherlv_2= 'as' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleObjectNext1317); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectNextAccess().getHasNextKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:598:1: ( (lv_attribute_1_0= ruleJavaCodeOrID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:599:1: (lv_attribute_1_0= ruleJavaCodeOrID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:599:1: (lv_attribute_1_0= ruleJavaCodeOrID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:600:3: lv_attribute_1_0= ruleJavaCodeOrID
            {
             
            	        newCompositeNode(grammarAccess.getObjectNextAccess().getAttributeJavaCodeOrIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_ruleObjectNext1338);
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleObjectNext1350); 

                	newLeafNode(otherlv_2, grammarAccess.getObjectNextAccess().getAsKeyword_2());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:620:1: ( (otherlv_3= RULE_ID ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:621:1: (otherlv_3= RULE_ID )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:621:1: (otherlv_3= RULE_ID )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:622:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectNextRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectNext1370); 

            		newLeafNode(otherlv_3, grammarAccess.getObjectNextAccess().getObjectDesriptionObjectDescriptionCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleObjectNext1382); 

                	newLeafNode(otherlv_4, grammarAccess.getObjectNextAccess().getSemicolonKeyword_4());
                

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:645:1: entryRuleJavaCodeOrID returns [EObject current=null] : iv_ruleJavaCodeOrID= ruleJavaCodeOrID EOF ;
    public final EObject entryRuleJavaCodeOrID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaCodeOrID = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:646:2: (iv_ruleJavaCodeOrID= ruleJavaCodeOrID EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:647:2: iv_ruleJavaCodeOrID= ruleJavaCodeOrID EOF
            {
             newCompositeNode(grammarAccess.getJavaCodeOrIDRule()); 
            pushFollow(FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID1418);
            iv_ruleJavaCodeOrID=ruleJavaCodeOrID();

            state._fsp--;

             current =iv_ruleJavaCodeOrID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaCodeOrID1428); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:654:1: ruleJavaCodeOrID returns [EObject current=null] : ( (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) ) | ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleJavaCodeOrID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_code_2_0=null;
        Token lv_id_3_0=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:657:28: ( ( (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) ) | ( (lv_id_3_0= RULE_ID ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:658:1: ( (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) ) | ( (lv_id_3_0= RULE_ID ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:658:1: ( (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) ) | ( (lv_id_3_0= RULE_ID ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:658:2: (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:658:2: (otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:658:4: otherlv_0= 'java' otherlv_1= ':' ( (lv_code_2_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleJavaCodeOrID1466); 

                        	newLeafNode(otherlv_0, grammarAccess.getJavaCodeOrIDAccess().getJavaKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleJavaCodeOrID1478); 

                        	newLeafNode(otherlv_1, grammarAccess.getJavaCodeOrIDAccess().getColonKeyword_0_1());
                        
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:666:1: ( (lv_code_2_0= RULE_STRING ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:667:1: (lv_code_2_0= RULE_STRING )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:667:1: (lv_code_2_0= RULE_STRING )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:668:3: lv_code_2_0= RULE_STRING
                    {
                    lv_code_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJavaCodeOrID1495); 

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
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:685:6: ( (lv_id_3_0= RULE_ID ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:685:6: ( (lv_id_3_0= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:686:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:686:1: (lv_id_3_0= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:687:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJavaCodeOrID1524); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:711:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:712:2: (iv_ruleType= ruleType EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:713:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1566);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1577); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:720:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'float' | kw= 'String' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:723:28: ( (kw= 'int' | kw= 'float' | kw= 'String' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:724:1: (kw= 'int' | kw= 'float' | kw= 'String' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:724:1: (kw= 'int' | kw= 'float' | kw= 'String' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt9=1;
                }
                break;
            case 28:
                {
                alt9=2;
                }
                break;
            case 29:
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
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:725:2: kw= 'int'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleType1615); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:732:2: kw= 'float'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleType1634); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getFloatKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:739:2: kw= 'String'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleType1653); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_2()); 
                        

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


    // $ANTLR start "entryRuleMany"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:752:1: entryRuleMany returns [EObject current=null] : iv_ruleMany= ruleMany EOF ;
    public final EObject entryRuleMany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMany = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:753:2: (iv_ruleMany= ruleMany EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:754:2: iv_ruleMany= ruleMany EOF
            {
             newCompositeNode(grammarAccess.getManyRule()); 
            pushFollow(FOLLOW_ruleMany_in_entryRuleMany1693);
            iv_ruleMany=ruleMany();

            state._fsp--;

             current =iv_ruleMany; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMany1703); 

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
    // $ANTLR end "entryRuleMany"


    // $ANTLR start "ruleMany"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:761:1: ruleMany returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_description_2_0= ruleObjectDescriptionInner ) ) otherlv_3= ')' otherlv_4= '*' ) ;
    public final EObject ruleMany() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_description_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:764:28: ( ( () otherlv_1= '(' ( (lv_description_2_0= ruleObjectDescriptionInner ) ) otherlv_3= ')' otherlv_4= '*' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:765:1: ( () otherlv_1= '(' ( (lv_description_2_0= ruleObjectDescriptionInner ) ) otherlv_3= ')' otherlv_4= '*' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:765:1: ( () otherlv_1= '(' ( (lv_description_2_0= ruleObjectDescriptionInner ) ) otherlv_3= ')' otherlv_4= '*' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:765:2: () otherlv_1= '(' ( (lv_description_2_0= ruleObjectDescriptionInner ) ) otherlv_3= ')' otherlv_4= '*'
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:765:2: ()
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:766:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getManyAccess().getManyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleMany1749); 

                	newLeafNode(otherlv_1, grammarAccess.getManyAccess().getLeftParenthesisKeyword_1());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:775:1: ( (lv_description_2_0= ruleObjectDescriptionInner ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:776:1: (lv_description_2_0= ruleObjectDescriptionInner )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:776:1: (lv_description_2_0= ruleObjectDescriptionInner )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:777:3: lv_description_2_0= ruleObjectDescriptionInner
            {
             
            	        newCompositeNode(grammarAccess.getManyAccess().getDescriptionObjectDescriptionInnerParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleObjectDescriptionInner_in_ruleMany1770);
            lv_description_2_0=ruleObjectDescriptionInner();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getManyRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"ObjectDescriptionInner");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleMany1782); 

                	newLeafNode(otherlv_3, grammarAccess.getManyAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleMany1794); 

                	newLeafNode(otherlv_4, grammarAccess.getManyAccess().getAsteriskKeyword_4());
                

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
    // $ANTLR end "ruleMany"


    // $ANTLR start "entryRuleChoice"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:809:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:810:2: (iv_ruleChoice= ruleChoice EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:811:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice1830);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice1840); 

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
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:818:1: ruleChoice returns [EObject current=null] : (otherlv_0= '(' ( (lv_options_1_0= ruleKeyword ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleKeyword ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_options_1_0 = null;

        EObject lv_options_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:821:28: ( (otherlv_0= '(' ( (lv_options_1_0= ruleKeyword ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleKeyword ) ) )* otherlv_4= ')' ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:822:1: (otherlv_0= '(' ( (lv_options_1_0= ruleKeyword ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleKeyword ) ) )* otherlv_4= ')' )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:822:1: (otherlv_0= '(' ( (lv_options_1_0= ruleKeyword ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleKeyword ) ) )* otherlv_4= ')' )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:822:3: otherlv_0= '(' ( (lv_options_1_0= ruleKeyword ) ) (otherlv_2= '|' ( (lv_options_3_0= ruleKeyword ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleChoice1877); 

                	newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getLeftParenthesisKeyword_0());
                
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:826:1: ( (lv_options_1_0= ruleKeyword ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:827:1: (lv_options_1_0= ruleKeyword )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:827:1: (lv_options_1_0= ruleKeyword )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:828:3: lv_options_1_0= ruleKeyword
            {
             
            	        newCompositeNode(grammarAccess.getChoiceAccess().getOptionsKeywordParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleKeyword_in_ruleChoice1898);
            lv_options_1_0=ruleKeyword();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChoiceRule());
            	        }
                   		add(
                   			current, 
                   			"options",
                    		lv_options_1_0, 
                    		"Keyword");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:844:2: (otherlv_2= '|' ( (lv_options_3_0= ruleKeyword ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:844:4: otherlv_2= '|' ( (lv_options_3_0= ruleKeyword ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleChoice1911); 

            	        	newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getVerticalLineKeyword_2_0());
            	        
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:848:1: ( (lv_options_3_0= ruleKeyword ) )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:849:1: (lv_options_3_0= ruleKeyword )
            	    {
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:849:1: (lv_options_3_0= ruleKeyword )
            	    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:850:3: lv_options_3_0= ruleKeyword
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceAccess().getOptionsKeywordParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleKeyword_in_ruleChoice1932);
            	    lv_options_3_0=ruleKeyword();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChoiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_3_0, 
            	            		"Keyword");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleChoice1946); 

                	newLeafNode(otherlv_4, grammarAccess.getChoiceAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleObjectMaybe"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:878:1: entryRuleObjectMaybe returns [EObject current=null] : iv_ruleObjectMaybe= ruleObjectMaybe EOF ;
    public final EObject entryRuleObjectMaybe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectMaybe = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:879:2: (iv_ruleObjectMaybe= ruleObjectMaybe EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:880:2: iv_ruleObjectMaybe= ruleObjectMaybe EOF
            {
             newCompositeNode(grammarAccess.getObjectMaybeRule()); 
            pushFollow(FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe1982);
            iv_ruleObjectMaybe=ruleObjectMaybe();

            state._fsp--;

             current =iv_ruleObjectMaybe; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectMaybe1992); 

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
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:887:1: ruleObjectMaybe returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_object_1_0= ruleAbstract ) ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '?' ) ) ;
    public final EObject ruleObjectMaybe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_object_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:890:28: ( ( (otherlv_0= '(' ( (lv_object_1_0= ruleAbstract ) ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '?' ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:891:1: ( (otherlv_0= '(' ( (lv_object_1_0= ruleAbstract ) ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '?' ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:891:1: ( (otherlv_0= '(' ( (lv_object_1_0= ruleAbstract ) ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '?' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:891:2: (otherlv_0= '(' ( (lv_object_1_0= ruleAbstract ) ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:891:2: (otherlv_0= '(' ( (lv_object_1_0= ruleAbstract ) ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:891:4: otherlv_0= '(' ( (lv_object_1_0= ruleAbstract ) )
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleObjectMaybe2030); 

                        	newLeafNode(otherlv_0, grammarAccess.getObjectMaybeAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:895:1: ( (lv_object_1_0= ruleAbstract ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:896:1: (lv_object_1_0= ruleAbstract )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:896:1: (lv_object_1_0= ruleAbstract )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:897:3: lv_object_1_0= ruleAbstract
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectMaybeAccess().getObjectAbstractParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstract_in_ruleObjectMaybe2051);
                    lv_object_1_0=ruleAbstract();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectMaybeRule());
                    	        }
                           		set(
                           			current, 
                           			"object",
                            		lv_object_1_0, 
                            		"Abstract");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:914:6: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '?' )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:914:6: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '?' )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:914:7: ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '?'
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:914:7: ( (otherlv_2= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:915:1: (otherlv_2= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:915:1: (otherlv_2= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:916:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjectMaybeRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectMaybe2079); 

                    		newLeafNode(otherlv_2, grammarAccess.getObjectMaybeAccess().getIdObjectDescriptionCrossReference_1_0_0()); 
                    	

                    }


                    }

                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleObjectMaybe2091); 

                        	newLeafNode(otherlv_3, grammarAccess.getObjectMaybeAccess().getRightParenthesisKeyword_1_1());
                        
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleObjectMaybe2103); 

                        	newLeafNode(otherlv_4, grammarAccess.getObjectMaybeAccess().getQuestionMarkKeyword_1_2());
                        

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


    // $ANTLR start "entryRuleKeyword"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:943:1: entryRuleKeyword returns [EObject current=null] : iv_ruleKeyword= ruleKeyword EOF ;
    public final EObject entryRuleKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyword = null;


        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:944:2: (iv_ruleKeyword= ruleKeyword EOF )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:945:2: iv_ruleKeyword= ruleKeyword EOF
            {
             newCompositeNode(grammarAccess.getKeywordRule()); 
            pushFollow(FOLLOW_ruleKeyword_in_entryRuleKeyword2140);
            iv_ruleKeyword=ruleKeyword();

            state._fsp--;

             current =iv_ruleKeyword; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyword2150); 

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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:952:1: ruleKeyword returns [EObject current=null] : ( ( (lv_name_0_0= 'Key' ) ) | ( (lv_name_1_0= 'Value' ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:955:28: ( ( ( (lv_name_0_0= 'Key' ) ) | ( (lv_name_1_0= 'Value' ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:956:1: ( ( (lv_name_0_0= 'Key' ) ) | ( (lv_name_1_0= 'Value' ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:956:1: ( ( (lv_name_0_0= 'Key' ) ) | ( (lv_name_1_0= 'Value' ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt12=1;
                }
                break;
            case 36:
                {
                alt12=2;
                }
                break;
            case RULE_ID:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:956:2: ( (lv_name_0_0= 'Key' ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:956:2: ( (lv_name_0_0= 'Key' ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:957:1: (lv_name_0_0= 'Key' )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:957:1: (lv_name_0_0= 'Key' )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:958:3: lv_name_0_0= 'Key'
                    {
                    lv_name_0_0=(Token)match(input,35,FOLLOW_35_in_ruleKeyword2193); 

                            newLeafNode(lv_name_0_0, grammarAccess.getKeywordAccess().getNameKeyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKeywordRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "Key");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:972:6: ( (lv_name_1_0= 'Value' ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:972:6: ( (lv_name_1_0= 'Value' ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:973:1: (lv_name_1_0= 'Value' )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:973:1: (lv_name_1_0= 'Value' )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:974:3: lv_name_1_0= 'Value'
                    {
                    lv_name_1_0=(Token)match(input,36,FOLLOW_36_in_ruleKeyword2230); 

                            newLeafNode(lv_name_1_0, grammarAccess.getKeywordAccess().getNameValueKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKeywordRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_1_0, "Value");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:988:6: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:988:6: ( (lv_name_2_0= RULE_ID ) )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:989:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:989:1: (lv_name_2_0= RULE_ID )
                    // ../de.wbg.DTDSL/src-gen/de/wbg/parser/antlr/internal/InternalDTDSL.g:990:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKeyword2266); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getKeywordAccess().getNameIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKeywordRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
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
    // $ANTLR end "ruleKeyword"

    // Delegated rules


 

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
    public static final BitSet FOLLOW_13_in_ruleDTDSL269 = new BitSet(new long[]{0x0000000040060020L});
    public static final BitSet FOLLOW_ruleimportStatement_in_ruleDTDSL290 = new BitSet(new long[]{0x0000000040060020L});
    public static final BitSet FOLLOW_ruleAbstract_in_ruleDTDSL312 = new BitSet(new long[]{0x0000000040060020L});
    public static final BitSet FOLLOW_ruleStartPoint_in_ruleDTDSL334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimportStatement_in_entryRuleimportStatement370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleimportStatement380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleimportStatement417 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleimportStatement434 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleimportStatement451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartPoint_in_entryRuleStartPoint487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartPoint497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleStartPoint534 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStartPoint546 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartPoint566 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStartPoint578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescription_in_ruleAbstract671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleAbstract698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMany_in_ruleAbstract725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescription_in_entryRuleObjectDescription760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescription770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectDescription812 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleObjectDescription829 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleObjectDescription841 = new BitSet(new long[]{0x0000000042600020L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_ruleObjectDescription862 = new BitSet(new long[]{0x0000000042600020L});
    public static final BitSet FOLLOW_21_in_ruleObjectDescription875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_entryRuleObjectDescriptionInner911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectDescriptionInner921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_ruleObjectDescriptionInner968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_ruleObjectDescriptionInner995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_ruleObjectDescriptionInner1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectAttribute_in_entryRuleObjectAttribute1057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectAttribute1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleObjectAttribute1104 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectAttribute1121 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleObjectAttribute1138 = new BitSet(new long[]{0x0000000038000020L});
    public static final BitSet FOLLOW_ruleType_in_ruleObjectAttribute1161 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleObjectAttribute1173 = new BitSet(new long[]{0x0000001800000020L});
    public static final BitSet FOLLOW_ruleKeyword_in_ruleObjectAttribute1194 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectAttribute1221 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleObjectAttribute1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNext_in_entryRuleObjectNext1270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectNext1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleObjectNext1317 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_ruleObjectNext1338 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleObjectNext1350 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectNext1370 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleObjectNext1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaCodeOrID_in_entryRuleJavaCodeOrID1418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaCodeOrID1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleJavaCodeOrID1466 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleJavaCodeOrID1478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJavaCodeOrID1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJavaCodeOrID1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleType1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleType1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleType1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMany_in_entryRuleMany1693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMany1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMany1749 = new BitSet(new long[]{0x0000000042400020L});
    public static final BitSet FOLLOW_ruleObjectDescriptionInner_in_ruleMany1770 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMany1782 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleMany1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice1830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleChoice1877 = new BitSet(new long[]{0x0000001800000020L});
    public static final BitSet FOLLOW_ruleKeyword_in_ruleChoice1898 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_33_in_ruleChoice1911 = new BitSet(new long[]{0x0000001800000020L});
    public static final BitSet FOLLOW_ruleKeyword_in_ruleChoice1932 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_31_in_ruleChoice1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectMaybe_in_entryRuleObjectMaybe1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectMaybe1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleObjectMaybe2030 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_ruleAbstract_in_ruleObjectMaybe2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectMaybe2079 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleObjectMaybe2091 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleObjectMaybe2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyword_in_entryRuleKeyword2140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyword2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleKeyword2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleKeyword2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKeyword2266 = new BitSet(new long[]{0x0000000000000002L});

}