package ardsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ardsl.services.ArdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArdslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'{'", "'URI'", "'elements'", "','", "'}'", "'dependences'", "'abstract'", "'invisible'", "':'", "'['", "']'", "'='", "'isParam'", "'isKey'", "'readOnly'", "'Dependence'", "'containtment'", "'min'", "'max'", "'target'", "'opposite'"
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


        public InternalArdslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArdslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArdslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalArdsl.g"; }



     	private ArdslGrammarAccess grammarAccess;

        public InternalArdslParser(TokenStream input, ArdslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Ontological";
       	}

       	@Override
       	protected ArdslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOntological"
    // InternalArdsl.g:64:1: entryRuleOntological returns [EObject current=null] : iv_ruleOntological= ruleOntological EOF ;
    public final EObject entryRuleOntological() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntological = null;


        try {
            // InternalArdsl.g:64:52: (iv_ruleOntological= ruleOntological EOF )
            // InternalArdsl.g:65:2: iv_ruleOntological= ruleOntological EOF
            {
             newCompositeNode(grammarAccess.getOntologicalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntological=ruleOntological();

            state._fsp--;

             current =iv_ruleOntological; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOntological"


    // $ANTLR start "ruleOntological"
    // InternalArdsl.g:71:1: ruleOntological returns [EObject current=null] : (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'URI' ( (lv_URI_4_0= ruleEString ) ) )? otherlv_5= 'elements' otherlv_6= '{' ( (lv_classes_7_0= ruleClass ) ) (otherlv_8= ',' ( (lv_classes_9_0= ruleClass ) ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleOntological() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_URI_4_0 = null;

        EObject lv_classes_7_0 = null;

        EObject lv_classes_9_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:77:2: ( (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'URI' ( (lv_URI_4_0= ruleEString ) ) )? otherlv_5= 'elements' otherlv_6= '{' ( (lv_classes_7_0= ruleClass ) ) (otherlv_8= ',' ( (lv_classes_9_0= ruleClass ) ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalArdsl.g:78:2: (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'URI' ( (lv_URI_4_0= ruleEString ) ) )? otherlv_5= 'elements' otherlv_6= '{' ( (lv_classes_7_0= ruleClass ) ) (otherlv_8= ',' ( (lv_classes_9_0= ruleClass ) ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalArdsl.g:78:2: (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'URI' ( (lv_URI_4_0= ruleEString ) ) )? otherlv_5= 'elements' otherlv_6= '{' ( (lv_classes_7_0= ruleClass ) ) (otherlv_8= ',' ( (lv_classes_9_0= ruleClass ) ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalArdsl.g:79:3: otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'URI' ( (lv_URI_4_0= ruleEString ) ) )? otherlv_5= 'elements' otherlv_6= '{' ( (lv_classes_7_0= ruleClass ) ) (otherlv_8= ',' ( (lv_classes_9_0= ruleClass ) ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalAccess().getGameKeyword_0());
            		
            // InternalArdsl.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalArdsl.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalArdsl.g:84:4: (lv_name_1_0= ruleEString )
            // InternalArdsl.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntologicalAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getOntologicalAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalArdsl.g:106:3: (otherlv_3= 'URI' ( (lv_URI_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalArdsl.g:107:4: otherlv_3= 'URI' ( (lv_URI_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getOntologicalAccess().getURIKeyword_3_0());
                    			
                    // InternalArdsl.g:111:4: ( (lv_URI_4_0= ruleEString ) )
                    // InternalArdsl.g:112:5: (lv_URI_4_0= ruleEString )
                    {
                    // InternalArdsl.g:112:5: (lv_URI_4_0= ruleEString )
                    // InternalArdsl.g:113:6: lv_URI_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOntologicalAccess().getURIEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_URI_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOntologicalRule());
                    						}
                    						set(
                    							current,
                    							"URI",
                    							lv_URI_4_0,
                    							"ardsl.Ardsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getOntologicalAccess().getElementsKeyword_4());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getOntologicalAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalArdsl.g:139:3: ( (lv_classes_7_0= ruleClass ) )
            // InternalArdsl.g:140:4: (lv_classes_7_0= ruleClass )
            {
            // InternalArdsl.g:140:4: (lv_classes_7_0= ruleClass )
            // InternalArdsl.g:141:5: lv_classes_7_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getOntologicalAccess().getClassesClassParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_classes_7_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRule());
            					}
            					add(
            						current,
            						"classes",
            						lv_classes_7_0,
            						"ardsl.Ardsl.Class");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArdsl.g:158:3: (otherlv_8= ',' ( (lv_classes_9_0= ruleClass ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalArdsl.g:159:4: otherlv_8= ',' ( (lv_classes_9_0= ruleClass ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getOntologicalAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalArdsl.g:163:4: ( (lv_classes_9_0= ruleClass ) )
            	    // InternalArdsl.g:164:5: (lv_classes_9_0= ruleClass )
            	    {
            	    // InternalArdsl.g:164:5: (lv_classes_9_0= ruleClass )
            	    // InternalArdsl.g:165:6: lv_classes_9_0= ruleClass
            	    {

            	    						newCompositeNode(grammarAccess.getOntologicalAccess().getClassesClassParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_classes_9_0=ruleClass();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOntologicalRule());
            	    						}
            	    						add(
            	    							current,
            	    							"classes",
            	    							lv_classes_9_0,
            	    							"ardsl.Ardsl.Class");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getOntologicalAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getOntologicalAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleOntological"


    // $ANTLR start "entryRuleEString"
    // InternalArdsl.g:195:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalArdsl.g:195:47: (iv_ruleEString= ruleEString EOF )
            // InternalArdsl.g:196:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalArdsl.g:202:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalArdsl.g:208:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalArdsl.g:209:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalArdsl.g:209:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
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
                    // InternalArdsl.g:210:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalArdsl.g:218:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleClass"
    // InternalArdsl.g:229:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalArdsl.g:229:46: (iv_ruleClass= ruleClass EOF )
            // InternalArdsl.g:230:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalArdsl.g:236:1: ruleClass returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )? (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )? otherlv_11= '}' ( (lv_abstract_12_0= 'abstract' ) )? ( (lv_noSCN_13_0= 'invisible' ) )? ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_abstract_12_0=null;
        Token lv_noSCN_13_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_attributes_2_0 = null;

        EObject lv_attributes_4_0 = null;

        EObject lv_references_7_0 = null;

        EObject lv_references_9_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:242:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )? (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )? otherlv_11= '}' ( (lv_abstract_12_0= 'abstract' ) )? ( (lv_noSCN_13_0= 'invisible' ) )? ) )
            // InternalArdsl.g:243:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )? (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )? otherlv_11= '}' ( (lv_abstract_12_0= 'abstract' ) )? ( (lv_noSCN_13_0= 'invisible' ) )? )
            {
            // InternalArdsl.g:243:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )? (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )? otherlv_11= '}' ( (lv_abstract_12_0= 'abstract' ) )? ( (lv_noSCN_13_0= 'invisible' ) )? )
            // InternalArdsl.g:244:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )? (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )? otherlv_11= '}' ( (lv_abstract_12_0= 'abstract' ) )? ( (lv_noSCN_13_0= 'invisible' ) )?
            {
            // InternalArdsl.g:244:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArdsl.g:245:4: (lv_name_0_0= ruleEString )
            {
            // InternalArdsl.g:245:4: (lv_name_0_0= ruleEString )
            // InternalArdsl.g:246:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalArdsl.g:267:3: ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalArdsl.g:268:4: ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )*
                    {
                    // InternalArdsl.g:268:4: ( (lv_attributes_2_0= ruleAttribute ) )
                    // InternalArdsl.g:269:5: (lv_attributes_2_0= ruleAttribute )
                    {
                    // InternalArdsl.g:269:5: (lv_attributes_2_0= ruleAttribute )
                    // InternalArdsl.g:270:6: lv_attributes_2_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_attributes_2_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_2_0,
                    							"ardsl.Ardsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArdsl.g:287:4: (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalArdsl.g:288:5: otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getClassAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalArdsl.g:292:5: ( (lv_attributes_4_0= ruleAttribute ) )
                    	    // InternalArdsl.g:293:6: (lv_attributes_4_0= ruleAttribute )
                    	    {
                    	    // InternalArdsl.g:293:6: (lv_attributes_4_0= ruleAttribute )
                    	    // InternalArdsl.g:294:7: lv_attributes_4_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_attributes_4_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_4_0,
                    	    								"ardsl.Ardsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalArdsl.g:313:3: (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalArdsl.g:314:4: otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getDependencesKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalArdsl.g:322:4: ( (lv_references_7_0= ruleReference ) )
                    // InternalArdsl.g:323:5: (lv_references_7_0= ruleReference )
                    {
                    // InternalArdsl.g:323:5: (lv_references_7_0= ruleReference )
                    // InternalArdsl.g:324:6: lv_references_7_0= ruleReference
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getReferencesReferenceParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_references_7_0=ruleReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"references",
                    							lv_references_7_0,
                    							"ardsl.Ardsl.Reference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArdsl.g:341:4: (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalArdsl.g:342:5: otherlv_8= ',' ( (lv_references_9_0= ruleReference ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getClassAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalArdsl.g:346:5: ( (lv_references_9_0= ruleReference ) )
                    	    // InternalArdsl.g:347:6: (lv_references_9_0= ruleReference )
                    	    {
                    	    // InternalArdsl.g:347:6: (lv_references_9_0= ruleReference )
                    	    // InternalArdsl.g:348:7: lv_references_9_0= ruleReference
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getReferencesReferenceParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_references_9_0=ruleReference();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"references",
                    	    								lv_references_9_0,
                    	    								"ardsl.Ardsl.Reference");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalArdsl.g:375:3: ( (lv_abstract_12_0= 'abstract' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalArdsl.g:376:4: (lv_abstract_12_0= 'abstract' )
                    {
                    // InternalArdsl.g:376:4: (lv_abstract_12_0= 'abstract' )
                    // InternalArdsl.g:377:5: lv_abstract_12_0= 'abstract'
                    {
                    lv_abstract_12_0=(Token)match(input,18,FOLLOW_13); 

                    					newLeafNode(lv_abstract_12_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", lv_abstract_12_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalArdsl.g:389:3: ( (lv_noSCN_13_0= 'invisible' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalArdsl.g:390:4: (lv_noSCN_13_0= 'invisible' )
                    {
                    // InternalArdsl.g:390:4: (lv_noSCN_13_0= 'invisible' )
                    // InternalArdsl.g:391:5: lv_noSCN_13_0= 'invisible'
                    {
                    lv_noSCN_13_0=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_noSCN_13_0, grammarAccess.getClassAccess().getNoSCNInvisibleKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "noSCN", lv_noSCN_13_0 != null, "invisible");
                    				

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalArdsl.g:407:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalArdsl.g:407:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalArdsl.g:408:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalArdsl.g:414:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEString ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleEString ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_isParam_10_0=null;
        Token lv_isKey_11_0=null;
        Token lv_readOnly_12_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_min_4_0 = null;

        AntlrDatatypeRuleToken lv_max_6_0 = null;

        AntlrDatatypeRuleToken lv_default_9_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:420:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEString ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleEString ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )? ) )
            // InternalArdsl.g:421:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEString ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleEString ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )? )
            {
            // InternalArdsl.g:421:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEString ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleEString ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )? )
            // InternalArdsl.g:422:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEString ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleEString ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )?
            {
            // InternalArdsl.g:422:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArdsl.g:423:4: (lv_name_0_0= ruleEString )
            {
            // InternalArdsl.g:423:4: (lv_name_0_0= ruleEString )
            // InternalArdsl.g:424:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalArdsl.g:445:3: ( (lv_type_2_0= ruleEString ) )
            // InternalArdsl.g:446:4: (lv_type_2_0= ruleEString )
            {
            // InternalArdsl.g:446:4: (lv_type_2_0= ruleEString )
            // InternalArdsl.g:447:5: lv_type_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_type_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalArdsl.g:468:3: ( (lv_min_4_0= ruleEString ) )
            // InternalArdsl.g:469:4: (lv_min_4_0= ruleEString )
            {
            // InternalArdsl.g:469:4: (lv_min_4_0= ruleEString )
            // InternalArdsl.g:470:5: lv_min_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getMinEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_min_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"min",
            						lv_min_4_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getCommaKeyword_5());
            		
            // InternalArdsl.g:491:3: ( (lv_max_6_0= ruleEString ) )
            // InternalArdsl.g:492:4: (lv_max_6_0= ruleEString )
            {
            // InternalArdsl.g:492:4: (lv_max_6_0= ruleEString )
            // InternalArdsl.g:493:5: lv_max_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getMaxEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_max_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"max",
            						lv_max_6_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getEqualsSignKeyword_8());
            		
            // InternalArdsl.g:518:3: ( (lv_default_9_0= ruleEString ) )
            // InternalArdsl.g:519:4: (lv_default_9_0= ruleEString )
            {
            // InternalArdsl.g:519:4: (lv_default_9_0= ruleEString )
            // InternalArdsl.g:520:5: lv_default_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getDefaultEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_19);
            lv_default_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"default",
            						lv_default_9_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArdsl.g:537:3: ( (lv_isParam_10_0= 'isParam' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalArdsl.g:538:4: (lv_isParam_10_0= 'isParam' )
                    {
                    // InternalArdsl.g:538:4: (lv_isParam_10_0= 'isParam' )
                    // InternalArdsl.g:539:5: lv_isParam_10_0= 'isParam'
                    {
                    lv_isParam_10_0=(Token)match(input,24,FOLLOW_20); 

                    					newLeafNode(lv_isParam_10_0, grammarAccess.getAttributeAccess().getIsParamIsParamKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isParam", lv_isParam_10_0 != null, "isParam");
                    				

                    }


                    }
                    break;

            }

            // InternalArdsl.g:551:3: ( (lv_isKey_11_0= 'isKey' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalArdsl.g:552:4: (lv_isKey_11_0= 'isKey' )
                    {
                    // InternalArdsl.g:552:4: (lv_isKey_11_0= 'isKey' )
                    // InternalArdsl.g:553:5: lv_isKey_11_0= 'isKey'
                    {
                    lv_isKey_11_0=(Token)match(input,25,FOLLOW_21); 

                    					newLeafNode(lv_isKey_11_0, grammarAccess.getAttributeAccess().getIsKeyIsKeyKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isKey", lv_isKey_11_0 != null, "isKey");
                    				

                    }


                    }
                    break;

            }

            // InternalArdsl.g:565:3: ( (lv_readOnly_12_0= 'readOnly' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalArdsl.g:566:4: (lv_readOnly_12_0= 'readOnly' )
                    {
                    // InternalArdsl.g:566:4: (lv_readOnly_12_0= 'readOnly' )
                    // InternalArdsl.g:567:5: lv_readOnly_12_0= 'readOnly'
                    {
                    lv_readOnly_12_0=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_readOnly_12_0, grammarAccess.getAttributeAccess().getReadOnlyReadOnlyKeyword_12_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "readOnly", lv_readOnly_12_0 != null, "readOnly");
                    				

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleReference"
    // InternalArdsl.g:583:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalArdsl.g:583:50: (iv_ruleReference= ruleReference EOF )
            // InternalArdsl.g:584:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalArdsl.g:590:1: ruleReference returns [EObject current=null] : (otherlv_0= 'Dependence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'containtment' ( (lv_containtment_4_0= ruleEString ) ) )? otherlv_5= 'min' ( (lv_min_6_0= ruleEString ) ) otherlv_7= 'max' ( (lv_max_8_0= ruleEString ) ) otherlv_9= 'target' ( (lv_target_10_0= ruleEString ) ) (otherlv_11= 'opposite' ( (lv_opposite_12_0= ruleEString ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_containtment_4_0 = null;

        AntlrDatatypeRuleToken lv_min_6_0 = null;

        AntlrDatatypeRuleToken lv_max_8_0 = null;

        AntlrDatatypeRuleToken lv_target_10_0 = null;

        AntlrDatatypeRuleToken lv_opposite_12_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:596:2: ( (otherlv_0= 'Dependence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'containtment' ( (lv_containtment_4_0= ruleEString ) ) )? otherlv_5= 'min' ( (lv_min_6_0= ruleEString ) ) otherlv_7= 'max' ( (lv_max_8_0= ruleEString ) ) otherlv_9= 'target' ( (lv_target_10_0= ruleEString ) ) (otherlv_11= 'opposite' ( (lv_opposite_12_0= ruleEString ) ) )? otherlv_13= '}' ) )
            // InternalArdsl.g:597:2: (otherlv_0= 'Dependence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'containtment' ( (lv_containtment_4_0= ruleEString ) ) )? otherlv_5= 'min' ( (lv_min_6_0= ruleEString ) ) otherlv_7= 'max' ( (lv_max_8_0= ruleEString ) ) otherlv_9= 'target' ( (lv_target_10_0= ruleEString ) ) (otherlv_11= 'opposite' ( (lv_opposite_12_0= ruleEString ) ) )? otherlv_13= '}' )
            {
            // InternalArdsl.g:597:2: (otherlv_0= 'Dependence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'containtment' ( (lv_containtment_4_0= ruleEString ) ) )? otherlv_5= 'min' ( (lv_min_6_0= ruleEString ) ) otherlv_7= 'max' ( (lv_max_8_0= ruleEString ) ) otherlv_9= 'target' ( (lv_target_10_0= ruleEString ) ) (otherlv_11= 'opposite' ( (lv_opposite_12_0= ruleEString ) ) )? otherlv_13= '}' )
            // InternalArdsl.g:598:3: otherlv_0= 'Dependence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'containtment' ( (lv_containtment_4_0= ruleEString ) ) )? otherlv_5= 'min' ( (lv_min_6_0= ruleEString ) ) otherlv_7= 'max' ( (lv_max_8_0= ruleEString ) ) otherlv_9= 'target' ( (lv_target_10_0= ruleEString ) ) (otherlv_11= 'opposite' ( (lv_opposite_12_0= ruleEString ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getDependenceKeyword_0());
            		
            // InternalArdsl.g:602:3: ( (lv_name_1_0= ruleEString ) )
            // InternalArdsl.g:603:4: (lv_name_1_0= ruleEString )
            {
            // InternalArdsl.g:603:4: (lv_name_1_0= ruleEString )
            // InternalArdsl.g:604:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalArdsl.g:625:3: (otherlv_3= 'containtment' ( (lv_containtment_4_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalArdsl.g:626:4: otherlv_3= 'containtment' ( (lv_containtment_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getContaintmentKeyword_3_0());
                    			
                    // InternalArdsl.g:630:4: ( (lv_containtment_4_0= ruleEString ) )
                    // InternalArdsl.g:631:5: (lv_containtment_4_0= ruleEString )
                    {
                    // InternalArdsl.g:631:5: (lv_containtment_4_0= ruleEString )
                    // InternalArdsl.g:632:6: lv_containtment_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getContaintmentEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_containtment_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"containtment",
                    							lv_containtment_4_0,
                    							"ardsl.Ardsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getMinKeyword_4());
            		
            // InternalArdsl.g:654:3: ( (lv_min_6_0= ruleEString ) )
            // InternalArdsl.g:655:4: (lv_min_6_0= ruleEString )
            {
            // InternalArdsl.g:655:4: (lv_min_6_0= ruleEString )
            // InternalArdsl.g:656:5: lv_min_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getMinEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_24);
            lv_min_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"min",
            						lv_min_6_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getReferenceAccess().getMaxKeyword_6());
            		
            // InternalArdsl.g:677:3: ( (lv_max_8_0= ruleEString ) )
            // InternalArdsl.g:678:4: (lv_max_8_0= ruleEString )
            {
            // InternalArdsl.g:678:4: (lv_max_8_0= ruleEString )
            // InternalArdsl.g:679:5: lv_max_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getMaxEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_25);
            lv_max_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"max",
            						lv_max_8_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getReferenceAccess().getTargetKeyword_8());
            		
            // InternalArdsl.g:700:3: ( (lv_target_10_0= ruleEString ) )
            // InternalArdsl.g:701:4: (lv_target_10_0= ruleEString )
            {
            // InternalArdsl.g:701:4: (lv_target_10_0= ruleEString )
            // InternalArdsl.g:702:5: lv_target_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getTargetEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_26);
            lv_target_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_10_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArdsl.g:719:3: (otherlv_11= 'opposite' ( (lv_opposite_12_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalArdsl.g:720:4: otherlv_11= 'opposite' ( (lv_opposite_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getReferenceAccess().getOppositeKeyword_10_0());
                    			
                    // InternalArdsl.g:724:4: ( (lv_opposite_12_0= ruleEString ) )
                    // InternalArdsl.g:725:5: (lv_opposite_12_0= ruleEString )
                    {
                    // InternalArdsl.g:725:5: (lv_opposite_12_0= ruleEString )
                    // InternalArdsl.g:726:6: lv_opposite_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getOppositeEStringParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_opposite_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"opposite",
                    							lv_opposite_12_0,
                    							"ardsl.Ardsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleReference"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100010000L});

}