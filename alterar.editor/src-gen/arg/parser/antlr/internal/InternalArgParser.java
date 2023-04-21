package arg.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import arg.services.ArgGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArgParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'{'", "'elements'", "','", "'}'", "'dependences'", "'abstract'", "'invisible'", "'Graphic'", "'Physics'", "'Gamelogic'", "'Display'", "':'", "'start'", "'win'", "'lose'", "'score'", "'Actions'", "'Collisions'", "'Buttons'", "'Elements'", "'['", "']'", "'='", "'isParam'", "'isKey'", "'readOnly'", "'containtment'", "'min'", "'max'", "'target'", "'opposite'", "'-'", "'element'", "'versions'", "'constraints'", "'plane'", "'overlaps'", "'sizeMin'", "'sizeMax'", "'xVariation'", "'yVariation'", "'zVariation'", "'rotation'", "'.'", "'E'", "'e'", "'body'", "'forces'", "'contacts'", "'mass'", "'bodyType'", "'charge'", "'friction'", "'rollingFriction'", "'restitution'", "'damping'", "'angularDamping'", "'collision'", "'contact'", "'gesture'", "'->'", "'goal'", "'lives'", "'action'", "'display'", "'timeEach'", "'changes'", "'to'", "'attributes'", "'rules'", "'do'", "'in'", "'named'", "'where'", "'scale'", "'stat'", "'changeStat'", "'force'", "'value'", "'if('", "')'", "'!'", "'('", "'All'", "'any'", "'horizontal'", "'vertical'", "'static'", "'dynamic'", "'kinematic'", "'none'", "'create'", "'edit'", "'delete'", "'front'", "'default'", "'back'", "'&'", "'|'", "'>'", "'>='", "'<'", "'<='"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalArgParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArgParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArgParser.tokenNames; }
    public String getGrammarFileName() { return "InternalArg.g"; }



     	private ArgGrammarAccess grammarAccess;

        public InternalArgParser(TokenStream input, ArgGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Ontological";
       	}

       	@Override
       	protected ArgGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOntological"
    // InternalArg.g:65:1: entryRuleOntological returns [EObject current=null] : iv_ruleOntological= ruleOntological EOF ;
    public final EObject entryRuleOntological() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntological = null;


        try {
            // InternalArg.g:65:52: (iv_ruleOntological= ruleOntological EOF )
            // InternalArg.g:66:2: iv_ruleOntological= ruleOntological EOF
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
    // InternalArg.g:72:1: ruleOntological returns [EObject current=null] : (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'elements' otherlv_4= '{' ( (lv_classes_5_0= ruleClass ) ) (otherlv_6= ',' ( (lv_classes_7_0= ruleClass ) ) )* otherlv_8= '}' otherlv_9= '}' ( (lv_graphic_10_0= ruleGraphic ) ) ( (lv_physic_11_0= rulePhysic ) ) ( (lv_game_12_0= ruleGame ) ) ) ;
    public final EObject ruleOntological() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_classes_5_0 = null;

        EObject lv_classes_7_0 = null;

        EObject lv_graphic_10_0 = null;

        EObject lv_physic_11_0 = null;

        EObject lv_game_12_0 = null;



        	enterRule();

        try {
            // InternalArg.g:78:2: ( (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'elements' otherlv_4= '{' ( (lv_classes_5_0= ruleClass ) ) (otherlv_6= ',' ( (lv_classes_7_0= ruleClass ) ) )* otherlv_8= '}' otherlv_9= '}' ( (lv_graphic_10_0= ruleGraphic ) ) ( (lv_physic_11_0= rulePhysic ) ) ( (lv_game_12_0= ruleGame ) ) ) )
            // InternalArg.g:79:2: (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'elements' otherlv_4= '{' ( (lv_classes_5_0= ruleClass ) ) (otherlv_6= ',' ( (lv_classes_7_0= ruleClass ) ) )* otherlv_8= '}' otherlv_9= '}' ( (lv_graphic_10_0= ruleGraphic ) ) ( (lv_physic_11_0= rulePhysic ) ) ( (lv_game_12_0= ruleGame ) ) )
            {
            // InternalArg.g:79:2: (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'elements' otherlv_4= '{' ( (lv_classes_5_0= ruleClass ) ) (otherlv_6= ',' ( (lv_classes_7_0= ruleClass ) ) )* otherlv_8= '}' otherlv_9= '}' ( (lv_graphic_10_0= ruleGraphic ) ) ( (lv_physic_11_0= rulePhysic ) ) ( (lv_game_12_0= ruleGame ) ) )
            // InternalArg.g:80:3: otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'elements' otherlv_4= '{' ( (lv_classes_5_0= ruleClass ) ) (otherlv_6= ',' ( (lv_classes_7_0= ruleClass ) ) )* otherlv_8= '}' otherlv_9= '}' ( (lv_graphic_10_0= ruleGraphic ) ) ( (lv_physic_11_0= rulePhysic ) ) ( (lv_game_12_0= ruleGame ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalAccess().getGameKeyword_0());
            		
            // InternalArg.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalArg.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalArg.g:85:4: (lv_name_1_0= ruleEString )
            // InternalArg.g:86:5: lv_name_1_0= ruleEString
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
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getOntologicalAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getOntologicalAccess().getElementsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getOntologicalAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalArg.g:115:3: ( (lv_classes_5_0= ruleClass ) )
            // InternalArg.g:116:4: (lv_classes_5_0= ruleClass )
            {
            // InternalArg.g:116:4: (lv_classes_5_0= ruleClass )
            // InternalArg.g:117:5: lv_classes_5_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getOntologicalAccess().getClassesClassParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_classes_5_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRule());
            					}
            					add(
            						current,
            						"classes",
            						lv_classes_5_0,
            						"arg.Arg.Class");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:134:3: (otherlv_6= ',' ( (lv_classes_7_0= ruleClass ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArg.g:135:4: otherlv_6= ',' ( (lv_classes_7_0= ruleClass ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getOntologicalAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalArg.g:139:4: ( (lv_classes_7_0= ruleClass ) )
            	    // InternalArg.g:140:5: (lv_classes_7_0= ruleClass )
            	    {
            	    // InternalArg.g:140:5: (lv_classes_7_0= ruleClass )
            	    // InternalArg.g:141:6: lv_classes_7_0= ruleClass
            	    {

            	    						newCompositeNode(grammarAccess.getOntologicalAccess().getClassesClassParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_classes_7_0=ruleClass();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOntologicalRule());
            	    						}
            	    						add(
            	    							current,
            	    							"classes",
            	    							lv_classes_7_0,
            	    							"arg.Arg.Class");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getOntologicalAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getOntologicalAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalArg.g:167:3: ( (lv_graphic_10_0= ruleGraphic ) )
            // InternalArg.g:168:4: (lv_graphic_10_0= ruleGraphic )
            {
            // InternalArg.g:168:4: (lv_graphic_10_0= ruleGraphic )
            // InternalArg.g:169:5: lv_graphic_10_0= ruleGraphic
            {

            					newCompositeNode(grammarAccess.getOntologicalAccess().getGraphicGraphicParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_graphic_10_0=ruleGraphic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRule());
            					}
            					set(
            						current,
            						"graphic",
            						lv_graphic_10_0,
            						"arg.Arg.Graphic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:186:3: ( (lv_physic_11_0= rulePhysic ) )
            // InternalArg.g:187:4: (lv_physic_11_0= rulePhysic )
            {
            // InternalArg.g:187:4: (lv_physic_11_0= rulePhysic )
            // InternalArg.g:188:5: lv_physic_11_0= rulePhysic
            {

            					newCompositeNode(grammarAccess.getOntologicalAccess().getPhysicPhysicParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_10);
            lv_physic_11_0=rulePhysic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRule());
            					}
            					set(
            						current,
            						"physic",
            						lv_physic_11_0,
            						"arg.Arg.Physic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:205:3: ( (lv_game_12_0= ruleGame ) )
            // InternalArg.g:206:4: (lv_game_12_0= ruleGame )
            {
            // InternalArg.g:206:4: (lv_game_12_0= ruleGame )
            // InternalArg.g:207:5: lv_game_12_0= ruleGame
            {

            					newCompositeNode(grammarAccess.getOntologicalAccess().getGameGameParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_2);
            lv_game_12_0=ruleGame();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRule());
            					}
            					set(
            						current,
            						"game",
            						lv_game_12_0,
            						"arg.Arg.Game");
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
    // $ANTLR end "ruleOntological"


    // $ANTLR start "entryRuleCondition"
    // InternalArg.g:228:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalArg.g:228:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalArg.g:229:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalArg.g:235:1: ruleCondition returns [EObject current=null] : (this_Not_0= ruleNot | this_Binary_1= ruleBinary | this_Arithmetic_2= ruleArithmetic ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Not_0 = null;

        EObject this_Binary_1 = null;

        EObject this_Arithmetic_2 = null;



        	enterRule();

        try {
            // InternalArg.g:241:2: ( (this_Not_0= ruleNot | this_Binary_1= ruleBinary | this_Arithmetic_2= ruleArithmetic ) )
            // InternalArg.g:242:2: (this_Not_0= ruleNot | this_Binary_1= ruleBinary | this_Arithmetic_2= ruleArithmetic )
            {
            // InternalArg.g:242:2: (this_Not_0= ruleNot | this_Binary_1= ruleBinary | this_Arithmetic_2= ruleArithmetic )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt2=1;
                }
                break;
            case 94:
                {
                alt2=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case 95:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalArg.g:243:3: this_Not_0= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getNotParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_0=ruleNot();

                    state._fsp--;


                    			current = this_Not_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalArg.g:252:3: this_Binary_1= ruleBinary
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getBinaryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Binary_1=ruleBinary();

                    state._fsp--;


                    			current = this_Binary_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalArg.g:261:3: this_Arithmetic_2= ruleArithmetic
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getArithmeticParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Arithmetic_2=ruleArithmetic();

                    state._fsp--;


                    			current = this_Arithmetic_2;
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleValue"
    // InternalArg.g:273:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalArg.g:273:46: (iv_ruleValue= ruleValue EOF )
            // InternalArg.g:274:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalArg.g:280:1: ruleValue returns [EObject current=null] : (this_AttributeValue_0= ruleAttributeValue | this_ConstantValue_1= ruleConstantValue | this_AllInstances_2= ruleAllInstances ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeValue_0 = null;

        EObject this_ConstantValue_1 = null;

        EObject this_AllInstances_2 = null;



        	enterRule();

        try {
            // InternalArg.g:286:2: ( (this_AttributeValue_0= ruleAttributeValue | this_ConstantValue_1= ruleConstantValue | this_AllInstances_2= ruleAllInstances ) )
            // InternalArg.g:287:2: (this_AttributeValue_0= ruleAttributeValue | this_ConstantValue_1= ruleConstantValue | this_AllInstances_2= ruleAllInstances )
            {
            // InternalArg.g:287:2: (this_AttributeValue_0= ruleAttributeValue | this_ConstantValue_1= ruleConstantValue | this_AllInstances_2= ruleAllInstances )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==55) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF||LA3_1==34||LA3_1==92||(LA3_1>=111 && LA3_1<=114)) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==EOF||LA3_2==34||LA3_2==92||(LA3_2>=111 && LA3_2<=114)) ) {
                    alt3=2;
                }
                else if ( (LA3_2==55) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 95:
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
                    // InternalArg.g:288:3: this_AttributeValue_0= ruleAttributeValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getAttributeValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeValue_0=ruleAttributeValue();

                    state._fsp--;


                    			current = this_AttributeValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalArg.g:297:3: this_ConstantValue_1= ruleConstantValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getConstantValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstantValue_1=ruleConstantValue();

                    state._fsp--;


                    			current = this_ConstantValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalArg.g:306:3: this_AllInstances_2= ruleAllInstances
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getAllInstancesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllInstances_2=ruleAllInstances();

                    state._fsp--;


                    			current = this_AllInstances_2;
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleEString"
    // InternalArg.g:318:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalArg.g:318:47: (iv_ruleEString= ruleEString EOF )
            // InternalArg.g:319:2: iv_ruleEString= ruleEString EOF
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
    // InternalArg.g:325:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalArg.g:331:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalArg.g:332:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalArg.g:332:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
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
                    // InternalArg.g:333:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalArg.g:341:3: this_ID_1= RULE_ID
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
    // InternalArg.g:352:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalArg.g:352:46: (iv_ruleClass= ruleClass EOF )
            // InternalArg.g:353:2: iv_ruleClass= ruleClass EOF
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
    // InternalArg.g:359:1: ruleClass returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )? (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )? otherlv_11= '}' ( (lv_abstract_12_0= 'abstract' ) )? ( (lv_noSCN_13_0= 'invisible' ) )? ) ;
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
            // InternalArg.g:365:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )? (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )? otherlv_11= '}' ( (lv_abstract_12_0= 'abstract' ) )? ( (lv_noSCN_13_0= 'invisible' ) )? ) )
            // InternalArg.g:366:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )? (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )? otherlv_11= '}' ( (lv_abstract_12_0= 'abstract' ) )? ( (lv_noSCN_13_0= 'invisible' ) )? )
            {
            // InternalArg.g:366:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )? (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )? otherlv_11= '}' ( (lv_abstract_12_0= 'abstract' ) )? ( (lv_noSCN_13_0= 'invisible' ) )? )
            // InternalArg.g:367:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )? (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )? otherlv_11= '}' ( (lv_abstract_12_0= 'abstract' ) )? ( (lv_noSCN_13_0= 'invisible' ) )?
            {
            // InternalArg.g:367:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArg.g:368:4: (lv_name_0_0= ruleEString )
            {
            // InternalArg.g:368:4: (lv_name_0_0= ruleEString )
            // InternalArg.g:369:5: lv_name_0_0= ruleEString
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
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalArg.g:390:3: ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalArg.g:391:4: ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )*
                    {
                    // InternalArg.g:391:4: ( (lv_attributes_2_0= ruleAttribute ) )
                    // InternalArg.g:392:5: (lv_attributes_2_0= ruleAttribute )
                    {
                    // InternalArg.g:392:5: (lv_attributes_2_0= ruleAttribute )
                    // InternalArg.g:393:6: lv_attributes_2_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_attributes_2_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_2_0,
                    							"arg.Arg.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArg.g:410:4: (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalArg.g:411:5: otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getClassAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalArg.g:415:5: ( (lv_attributes_4_0= ruleAttribute ) )
                    	    // InternalArg.g:416:6: (lv_attributes_4_0= ruleAttribute )
                    	    {
                    	    // InternalArg.g:416:6: (lv_attributes_4_0= ruleAttribute )
                    	    // InternalArg.g:417:7: lv_attributes_4_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_attributes_4_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_4_0,
                    	    								"arg.Arg.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalArg.g:436:3: (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalArg.g:437:4: otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getDependencesKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalArg.g:445:4: ( (lv_references_7_0= ruleReference ) )
                    // InternalArg.g:446:5: (lv_references_7_0= ruleReference )
                    {
                    // InternalArg.g:446:5: (lv_references_7_0= ruleReference )
                    // InternalArg.g:447:6: lv_references_7_0= ruleReference
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getReferencesReferenceParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_references_7_0=ruleReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"references",
                    							lv_references_7_0,
                    							"arg.Arg.Reference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArg.g:464:4: (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalArg.g:465:5: otherlv_8= ',' ( (lv_references_9_0= ruleReference ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getClassAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalArg.g:469:5: ( (lv_references_9_0= ruleReference ) )
                    	    // InternalArg.g:470:6: (lv_references_9_0= ruleReference )
                    	    {
                    	    // InternalArg.g:470:6: (lv_references_9_0= ruleReference )
                    	    // InternalArg.g:471:7: lv_references_9_0= ruleReference
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getReferencesReferenceParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_references_9_0=ruleReference();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"references",
                    	    								lv_references_9_0,
                    	    								"arg.Arg.Reference");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalArg.g:498:3: ( (lv_abstract_12_0= 'abstract' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalArg.g:499:4: (lv_abstract_12_0= 'abstract' )
                    {
                    // InternalArg.g:499:4: (lv_abstract_12_0= 'abstract' )
                    // InternalArg.g:500:5: lv_abstract_12_0= 'abstract'
                    {
                    lv_abstract_12_0=(Token)match(input,17,FOLLOW_14); 

                    					newLeafNode(lv_abstract_12_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", lv_abstract_12_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalArg.g:512:3: ( (lv_noSCN_13_0= 'invisible' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalArg.g:513:4: (lv_noSCN_13_0= 'invisible' )
                    {
                    // InternalArg.g:513:4: (lv_noSCN_13_0= 'invisible' )
                    // InternalArg.g:514:5: lv_noSCN_13_0= 'invisible'
                    {
                    lv_noSCN_13_0=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleGraphic"
    // InternalArg.g:530:1: entryRuleGraphic returns [EObject current=null] : iv_ruleGraphic= ruleGraphic EOF ;
    public final EObject entryRuleGraphic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphic = null;


        try {
            // InternalArg.g:530:48: (iv_ruleGraphic= ruleGraphic EOF )
            // InternalArg.g:531:2: iv_ruleGraphic= ruleGraphic EOF
            {
             newCompositeNode(grammarAccess.getGraphicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphic=ruleGraphic();

            state._fsp--;

             current =iv_ruleGraphic; 
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
    // $ANTLR end "entryRuleGraphic"


    // $ANTLR start "ruleGraphic"
    // InternalArg.g:537:1: ruleGraphic returns [EObject current=null] : (otherlv_0= 'Graphic' otherlv_1= '{' ( (lv_classes_2_0= ruleGraphicClass ) ) (otherlv_3= ',' ( (lv_classes_4_0= ruleGraphicClass ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleGraphic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_classes_2_0 = null;

        EObject lv_classes_4_0 = null;



        	enterRule();

        try {
            // InternalArg.g:543:2: ( (otherlv_0= 'Graphic' otherlv_1= '{' ( (lv_classes_2_0= ruleGraphicClass ) ) (otherlv_3= ',' ( (lv_classes_4_0= ruleGraphicClass ) ) )* otherlv_5= '}' ) )
            // InternalArg.g:544:2: (otherlv_0= 'Graphic' otherlv_1= '{' ( (lv_classes_2_0= ruleGraphicClass ) ) (otherlv_3= ',' ( (lv_classes_4_0= ruleGraphicClass ) ) )* otherlv_5= '}' )
            {
            // InternalArg.g:544:2: (otherlv_0= 'Graphic' otherlv_1= '{' ( (lv_classes_2_0= ruleGraphicClass ) ) (otherlv_3= ',' ( (lv_classes_4_0= ruleGraphicClass ) ) )* otherlv_5= '}' )
            // InternalArg.g:545:3: otherlv_0= 'Graphic' otherlv_1= '{' ( (lv_classes_2_0= ruleGraphicClass ) ) (otherlv_3= ',' ( (lv_classes_4_0= ruleGraphicClass ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicAccess().getGraphicKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalArg.g:553:3: ( (lv_classes_2_0= ruleGraphicClass ) )
            // InternalArg.g:554:4: (lv_classes_2_0= ruleGraphicClass )
            {
            // InternalArg.g:554:4: (lv_classes_2_0= ruleGraphicClass )
            // InternalArg.g:555:5: lv_classes_2_0= ruleGraphicClass
            {

            					newCompositeNode(grammarAccess.getGraphicAccess().getClassesGraphicClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_classes_2_0=ruleGraphicClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRule());
            					}
            					add(
            						current,
            						"classes",
            						lv_classes_2_0,
            						"arg.Arg.GraphicClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:572:3: (otherlv_3= ',' ( (lv_classes_4_0= ruleGraphicClass ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArg.g:573:4: otherlv_3= ',' ( (lv_classes_4_0= ruleGraphicClass ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getGraphicAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalArg.g:577:4: ( (lv_classes_4_0= ruleGraphicClass ) )
            	    // InternalArg.g:578:5: (lv_classes_4_0= ruleGraphicClass )
            	    {
            	    // InternalArg.g:578:5: (lv_classes_4_0= ruleGraphicClass )
            	    // InternalArg.g:579:6: lv_classes_4_0= ruleGraphicClass
            	    {

            	    						newCompositeNode(grammarAccess.getGraphicAccess().getClassesGraphicClassParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_classes_4_0=ruleGraphicClass();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGraphicRule());
            	    						}
            	    						add(
            	    							current,
            	    							"classes",
            	    							lv_classes_4_0,
            	    							"arg.Arg.GraphicClass");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphicAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGraphic"


    // $ANTLR start "entryRulePhysic"
    // InternalArg.g:605:1: entryRulePhysic returns [EObject current=null] : iv_rulePhysic= rulePhysic EOF ;
    public final EObject entryRulePhysic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysic = null;


        try {
            // InternalArg.g:605:47: (iv_rulePhysic= rulePhysic EOF )
            // InternalArg.g:606:2: iv_rulePhysic= rulePhysic EOF
            {
             newCompositeNode(grammarAccess.getPhysicRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhysic=rulePhysic();

            state._fsp--;

             current =iv_rulePhysic; 
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
    // $ANTLR end "entryRulePhysic"


    // $ANTLR start "rulePhysic"
    // InternalArg.g:612:1: rulePhysic returns [EObject current=null] : (otherlv_0= 'Physics' otherlv_1= '{' ( (lv_classes_2_0= rulePhysicClass ) ) (otherlv_3= ',' ( (lv_classes_4_0= rulePhysicClass ) ) )* otherlv_5= '}' ) ;
    public final EObject rulePhysic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_classes_2_0 = null;

        EObject lv_classes_4_0 = null;



        	enterRule();

        try {
            // InternalArg.g:618:2: ( (otherlv_0= 'Physics' otherlv_1= '{' ( (lv_classes_2_0= rulePhysicClass ) ) (otherlv_3= ',' ( (lv_classes_4_0= rulePhysicClass ) ) )* otherlv_5= '}' ) )
            // InternalArg.g:619:2: (otherlv_0= 'Physics' otherlv_1= '{' ( (lv_classes_2_0= rulePhysicClass ) ) (otherlv_3= ',' ( (lv_classes_4_0= rulePhysicClass ) ) )* otherlv_5= '}' )
            {
            // InternalArg.g:619:2: (otherlv_0= 'Physics' otherlv_1= '{' ( (lv_classes_2_0= rulePhysicClass ) ) (otherlv_3= ',' ( (lv_classes_4_0= rulePhysicClass ) ) )* otherlv_5= '}' )
            // InternalArg.g:620:3: otherlv_0= 'Physics' otherlv_1= '{' ( (lv_classes_2_0= rulePhysicClass ) ) (otherlv_3= ',' ( (lv_classes_4_0= rulePhysicClass ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPhysicAccess().getPhysicsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getPhysicAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalArg.g:628:3: ( (lv_classes_2_0= rulePhysicClass ) )
            // InternalArg.g:629:4: (lv_classes_2_0= rulePhysicClass )
            {
            // InternalArg.g:629:4: (lv_classes_2_0= rulePhysicClass )
            // InternalArg.g:630:5: lv_classes_2_0= rulePhysicClass
            {

            					newCompositeNode(grammarAccess.getPhysicAccess().getClassesPhysicClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_classes_2_0=rulePhysicClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicRule());
            					}
            					add(
            						current,
            						"classes",
            						lv_classes_2_0,
            						"arg.Arg.PhysicClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:647:3: (otherlv_3= ',' ( (lv_classes_4_0= rulePhysicClass ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArg.g:648:4: otherlv_3= ',' ( (lv_classes_4_0= rulePhysicClass ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getPhysicAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalArg.g:652:4: ( (lv_classes_4_0= rulePhysicClass ) )
            	    // InternalArg.g:653:5: (lv_classes_4_0= rulePhysicClass )
            	    {
            	    // InternalArg.g:653:5: (lv_classes_4_0= rulePhysicClass )
            	    // InternalArg.g:654:6: lv_classes_4_0= rulePhysicClass
            	    {

            	    						newCompositeNode(grammarAccess.getPhysicAccess().getClassesPhysicClassParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_classes_4_0=rulePhysicClass();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPhysicRule());
            	    						}
            	    						add(
            	    							current,
            	    							"classes",
            	    							lv_classes_4_0,
            	    							"arg.Arg.PhysicClass");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPhysicAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePhysic"


    // $ANTLR start "entryRuleGame"
    // InternalArg.g:680:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalArg.g:680:45: (iv_ruleGame= ruleGame EOF )
            // InternalArg.g:681:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
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
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalArg.g:687:1: ruleGame returns [EObject current=null] : (otherlv_0= 'Gamelogic' otherlv_1= '{' otherlv_2= 'Display' otherlv_3= ':' otherlv_4= 'start' ( (lv_start_5_0= ruleEString ) ) otherlv_6= 'win' ( (lv_win_7_0= ruleEString ) ) otherlv_8= 'lose' ( (lv_lose_9_0= ruleEString ) ) otherlv_10= 'score' otherlv_11= '{' ( (lv_score_12_0= ruleScoreSystem ) ) otherlv_13= '}' (otherlv_14= 'Actions' otherlv_15= '{' ( (lv_actionsTriggers_16_0= ruleTrigger ) ) (otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleTrigger ) ) )* otherlv_19= '}' )? (otherlv_20= 'Collisions' otherlv_21= '{' ( (lv_collisions_22_0= ruleCollision ) ) (otherlv_23= ',' ( (lv_collisions_24_0= ruleCollision ) ) )* otherlv_25= '}' )? (otherlv_26= 'Buttons' otherlv_27= '{' ( (lv_gamepad_28_0= ruleGamePad ) ) otherlv_29= '}' )? (otherlv_30= 'Elements' otherlv_31= '{' ( (lv_objInit_32_0= ruleObjInit ) ) (otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) ) )* otherlv_35= '}' )? otherlv_36= '}' ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        AntlrDatatypeRuleToken lv_start_5_0 = null;

        AntlrDatatypeRuleToken lv_win_7_0 = null;

        AntlrDatatypeRuleToken lv_lose_9_0 = null;

        EObject lv_score_12_0 = null;

        EObject lv_actionsTriggers_16_0 = null;

        EObject lv_actionsTriggers_18_0 = null;

        EObject lv_collisions_22_0 = null;

        EObject lv_collisions_24_0 = null;

        EObject lv_gamepad_28_0 = null;

        EObject lv_objInit_32_0 = null;

        EObject lv_objInit_34_0 = null;



        	enterRule();

        try {
            // InternalArg.g:693:2: ( (otherlv_0= 'Gamelogic' otherlv_1= '{' otherlv_2= 'Display' otherlv_3= ':' otherlv_4= 'start' ( (lv_start_5_0= ruleEString ) ) otherlv_6= 'win' ( (lv_win_7_0= ruleEString ) ) otherlv_8= 'lose' ( (lv_lose_9_0= ruleEString ) ) otherlv_10= 'score' otherlv_11= '{' ( (lv_score_12_0= ruleScoreSystem ) ) otherlv_13= '}' (otherlv_14= 'Actions' otherlv_15= '{' ( (lv_actionsTriggers_16_0= ruleTrigger ) ) (otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleTrigger ) ) )* otherlv_19= '}' )? (otherlv_20= 'Collisions' otherlv_21= '{' ( (lv_collisions_22_0= ruleCollision ) ) (otherlv_23= ',' ( (lv_collisions_24_0= ruleCollision ) ) )* otherlv_25= '}' )? (otherlv_26= 'Buttons' otherlv_27= '{' ( (lv_gamepad_28_0= ruleGamePad ) ) otherlv_29= '}' )? (otherlv_30= 'Elements' otherlv_31= '{' ( (lv_objInit_32_0= ruleObjInit ) ) (otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) ) )* otherlv_35= '}' )? otherlv_36= '}' ) )
            // InternalArg.g:694:2: (otherlv_0= 'Gamelogic' otherlv_1= '{' otherlv_2= 'Display' otherlv_3= ':' otherlv_4= 'start' ( (lv_start_5_0= ruleEString ) ) otherlv_6= 'win' ( (lv_win_7_0= ruleEString ) ) otherlv_8= 'lose' ( (lv_lose_9_0= ruleEString ) ) otherlv_10= 'score' otherlv_11= '{' ( (lv_score_12_0= ruleScoreSystem ) ) otherlv_13= '}' (otherlv_14= 'Actions' otherlv_15= '{' ( (lv_actionsTriggers_16_0= ruleTrigger ) ) (otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleTrigger ) ) )* otherlv_19= '}' )? (otherlv_20= 'Collisions' otherlv_21= '{' ( (lv_collisions_22_0= ruleCollision ) ) (otherlv_23= ',' ( (lv_collisions_24_0= ruleCollision ) ) )* otherlv_25= '}' )? (otherlv_26= 'Buttons' otherlv_27= '{' ( (lv_gamepad_28_0= ruleGamePad ) ) otherlv_29= '}' )? (otherlv_30= 'Elements' otherlv_31= '{' ( (lv_objInit_32_0= ruleObjInit ) ) (otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) ) )* otherlv_35= '}' )? otherlv_36= '}' )
            {
            // InternalArg.g:694:2: (otherlv_0= 'Gamelogic' otherlv_1= '{' otherlv_2= 'Display' otherlv_3= ':' otherlv_4= 'start' ( (lv_start_5_0= ruleEString ) ) otherlv_6= 'win' ( (lv_win_7_0= ruleEString ) ) otherlv_8= 'lose' ( (lv_lose_9_0= ruleEString ) ) otherlv_10= 'score' otherlv_11= '{' ( (lv_score_12_0= ruleScoreSystem ) ) otherlv_13= '}' (otherlv_14= 'Actions' otherlv_15= '{' ( (lv_actionsTriggers_16_0= ruleTrigger ) ) (otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleTrigger ) ) )* otherlv_19= '}' )? (otherlv_20= 'Collisions' otherlv_21= '{' ( (lv_collisions_22_0= ruleCollision ) ) (otherlv_23= ',' ( (lv_collisions_24_0= ruleCollision ) ) )* otherlv_25= '}' )? (otherlv_26= 'Buttons' otherlv_27= '{' ( (lv_gamepad_28_0= ruleGamePad ) ) otherlv_29= '}' )? (otherlv_30= 'Elements' otherlv_31= '{' ( (lv_objInit_32_0= ruleObjInit ) ) (otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) ) )* otherlv_35= '}' )? otherlv_36= '}' )
            // InternalArg.g:695:3: otherlv_0= 'Gamelogic' otherlv_1= '{' otherlv_2= 'Display' otherlv_3= ':' otherlv_4= 'start' ( (lv_start_5_0= ruleEString ) ) otherlv_6= 'win' ( (lv_win_7_0= ruleEString ) ) otherlv_8= 'lose' ( (lv_lose_9_0= ruleEString ) ) otherlv_10= 'score' otherlv_11= '{' ( (lv_score_12_0= ruleScoreSystem ) ) otherlv_13= '}' (otherlv_14= 'Actions' otherlv_15= '{' ( (lv_actionsTriggers_16_0= ruleTrigger ) ) (otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleTrigger ) ) )* otherlv_19= '}' )? (otherlv_20= 'Collisions' otherlv_21= '{' ( (lv_collisions_22_0= ruleCollision ) ) (otherlv_23= ',' ( (lv_collisions_24_0= ruleCollision ) ) )* otherlv_25= '}' )? (otherlv_26= 'Buttons' otherlv_27= '{' ( (lv_gamepad_28_0= ruleGamePad ) ) otherlv_29= '}' )? (otherlv_30= 'Elements' otherlv_31= '{' ( (lv_objInit_32_0= ruleObjInit ) ) (otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) ) )* otherlv_35= '}' )? otherlv_36= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getGamelogicKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getGameAccess().getDisplayKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getGameAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getGameAccess().getStartKeyword_4());
            		
            // InternalArg.g:715:3: ( (lv_start_5_0= ruleEString ) )
            // InternalArg.g:716:4: (lv_start_5_0= ruleEString )
            {
            // InternalArg.g:716:4: (lv_start_5_0= ruleEString )
            // InternalArg.g:717:5: lv_start_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGameAccess().getStartEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_start_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_5_0,
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getGameAccess().getWinKeyword_6());
            		
            // InternalArg.g:738:3: ( (lv_win_7_0= ruleEString ) )
            // InternalArg.g:739:4: (lv_win_7_0= ruleEString )
            {
            // InternalArg.g:739:4: (lv_win_7_0= ruleEString )
            // InternalArg.g:740:5: lv_win_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGameAccess().getWinEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_20);
            lv_win_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"win",
            						lv_win_7_0,
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getGameAccess().getLoseKeyword_8());
            		
            // InternalArg.g:761:3: ( (lv_lose_9_0= ruleEString ) )
            // InternalArg.g:762:4: (lv_lose_9_0= ruleEString )
            {
            // InternalArg.g:762:4: (lv_lose_9_0= ruleEString )
            // InternalArg.g:763:5: lv_lose_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGameAccess().getLoseEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_21);
            lv_lose_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"lose",
            						lv_lose_9_0,
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getGameAccess().getScoreKeyword_10());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_11, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalArg.g:788:3: ( (lv_score_12_0= ruleScoreSystem ) )
            // InternalArg.g:789:4: (lv_score_12_0= ruleScoreSystem )
            {
            // InternalArg.g:789:4: (lv_score_12_0= ruleScoreSystem )
            // InternalArg.g:790:5: lv_score_12_0= ruleScoreSystem
            {

            					newCompositeNode(grammarAccess.getGameAccess().getScoreScoreSystemParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_7);
            lv_score_12_0=ruleScoreSystem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"score",
            						lv_score_12_0,
            						"arg.Arg.ScoreSystem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_13, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_13());
            		
            // InternalArg.g:811:3: (otherlv_14= 'Actions' otherlv_15= '{' ( (lv_actionsTriggers_16_0= ruleTrigger ) ) (otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleTrigger ) ) )* otherlv_19= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalArg.g:812:4: otherlv_14= 'Actions' otherlv_15= '{' ( (lv_actionsTriggers_16_0= ruleTrigger ) ) (otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleTrigger ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getGameAccess().getActionsKeyword_14_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalArg.g:820:4: ( (lv_actionsTriggers_16_0= ruleTrigger ) )
                    // InternalArg.g:821:5: (lv_actionsTriggers_16_0= ruleTrigger )
                    {
                    // InternalArg.g:821:5: (lv_actionsTriggers_16_0= ruleTrigger )
                    // InternalArg.g:822:6: lv_actionsTriggers_16_0= ruleTrigger
                    {

                    						newCompositeNode(grammarAccess.getGameAccess().getActionsTriggersTriggerParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_actionsTriggers_16_0=ruleTrigger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameRule());
                    						}
                    						add(
                    							current,
                    							"actionsTriggers",
                    							lv_actionsTriggers_16_0,
                    							"arg.Arg.Trigger");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArg.g:839:4: (otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleTrigger ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalArg.g:840:5: otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleTrigger ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getGameAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalArg.g:844:5: ( (lv_actionsTriggers_18_0= ruleTrigger ) )
                    	    // InternalArg.g:845:6: (lv_actionsTriggers_18_0= ruleTrigger )
                    	    {
                    	    // InternalArg.g:845:6: (lv_actionsTriggers_18_0= ruleTrigger )
                    	    // InternalArg.g:846:7: lv_actionsTriggers_18_0= ruleTrigger
                    	    {

                    	    							newCompositeNode(grammarAccess.getGameAccess().getActionsTriggersTriggerParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_actionsTriggers_18_0=ruleTrigger();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGameRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actionsTriggers",
                    	    								lv_actionsTriggers_18_0,
                    	    								"arg.Arg.Trigger");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,15,FOLLOW_23); 

                    				newLeafNode(otherlv_19, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalArg.g:869:3: (otherlv_20= 'Collisions' otherlv_21= '{' ( (lv_collisions_22_0= ruleCollision ) ) (otherlv_23= ',' ( (lv_collisions_24_0= ruleCollision ) ) )* otherlv_25= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalArg.g:870:4: otherlv_20= 'Collisions' otherlv_21= '{' ( (lv_collisions_22_0= ruleCollision ) ) (otherlv_23= ',' ( (lv_collisions_24_0= ruleCollision ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getGameAccess().getCollisionsKeyword_15_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_21, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalArg.g:878:4: ( (lv_collisions_22_0= ruleCollision ) )
                    // InternalArg.g:879:5: (lv_collisions_22_0= ruleCollision )
                    {
                    // InternalArg.g:879:5: (lv_collisions_22_0= ruleCollision )
                    // InternalArg.g:880:6: lv_collisions_22_0= ruleCollision
                    {

                    						newCompositeNode(grammarAccess.getGameAccess().getCollisionsCollisionParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_collisions_22_0=ruleCollision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameRule());
                    						}
                    						add(
                    							current,
                    							"collisions",
                    							lv_collisions_22_0,
                    							"arg.Arg.Collision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArg.g:897:4: (otherlv_23= ',' ( (lv_collisions_24_0= ruleCollision ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalArg.g:898:5: otherlv_23= ',' ( (lv_collisions_24_0= ruleCollision ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getGameAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalArg.g:902:5: ( (lv_collisions_24_0= ruleCollision ) )
                    	    // InternalArg.g:903:6: (lv_collisions_24_0= ruleCollision )
                    	    {
                    	    // InternalArg.g:903:6: (lv_collisions_24_0= ruleCollision )
                    	    // InternalArg.g:904:7: lv_collisions_24_0= ruleCollision
                    	    {

                    	    							newCompositeNode(grammarAccess.getGameAccess().getCollisionsCollisionParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_collisions_24_0=ruleCollision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGameRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"collisions",
                    	    								lv_collisions_24_0,
                    	    								"arg.Arg.Collision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_25, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            // InternalArg.g:927:3: (otherlv_26= 'Buttons' otherlv_27= '{' ( (lv_gamepad_28_0= ruleGamePad ) ) otherlv_29= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalArg.g:928:4: otherlv_26= 'Buttons' otherlv_27= '{' ( (lv_gamepad_28_0= ruleGamePad ) ) otherlv_29= '}'
                    {
                    otherlv_26=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_26, grammarAccess.getGameAccess().getButtonsKeyword_16_0());
                    			
                    otherlv_27=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalArg.g:936:4: ( (lv_gamepad_28_0= ruleGamePad ) )
                    // InternalArg.g:937:5: (lv_gamepad_28_0= ruleGamePad )
                    {
                    // InternalArg.g:937:5: (lv_gamepad_28_0= ruleGamePad )
                    // InternalArg.g:938:6: lv_gamepad_28_0= ruleGamePad
                    {

                    						newCompositeNode(grammarAccess.getGameAccess().getGamepadGamePadParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_gamepad_28_0=ruleGamePad();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameRule());
                    						}
                    						add(
                    							current,
                    							"gamepad",
                    							lv_gamepad_28_0,
                    							"arg.Arg.GamePad");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_29=(Token)match(input,15,FOLLOW_25); 

                    				newLeafNode(otherlv_29, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_16_3());
                    			

                    }
                    break;

            }

            // InternalArg.g:960:3: (otherlv_30= 'Elements' otherlv_31= '{' ( (lv_objInit_32_0= ruleObjInit ) ) (otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) ) )* otherlv_35= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalArg.g:961:4: otherlv_30= 'Elements' otherlv_31= '{' ( (lv_objInit_32_0= ruleObjInit ) ) (otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_30, grammarAccess.getGameAccess().getElementsKeyword_17_0());
                    			
                    otherlv_31=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_31, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_17_1());
                    			
                    // InternalArg.g:969:4: ( (lv_objInit_32_0= ruleObjInit ) )
                    // InternalArg.g:970:5: (lv_objInit_32_0= ruleObjInit )
                    {
                    // InternalArg.g:970:5: (lv_objInit_32_0= ruleObjInit )
                    // InternalArg.g:971:6: lv_objInit_32_0= ruleObjInit
                    {

                    						newCompositeNode(grammarAccess.getGameAccess().getObjInitObjInitParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_objInit_32_0=ruleObjInit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameRule());
                    						}
                    						add(
                    							current,
                    							"objInit",
                    							lv_objInit_32_0,
                    							"arg.Arg.ObjInit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArg.g:988:4: (otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalArg.g:989:5: otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) )
                    	    {
                    	    otherlv_33=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getGameAccess().getCommaKeyword_17_3_0());
                    	    				
                    	    // InternalArg.g:993:5: ( (lv_objInit_34_0= ruleObjInit ) )
                    	    // InternalArg.g:994:6: (lv_objInit_34_0= ruleObjInit )
                    	    {
                    	    // InternalArg.g:994:6: (lv_objInit_34_0= ruleObjInit )
                    	    // InternalArg.g:995:7: lv_objInit_34_0= ruleObjInit
                    	    {

                    	    							newCompositeNode(grammarAccess.getGameAccess().getObjInitObjInitParserRuleCall_17_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_objInit_34_0=ruleObjInit();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGameRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"objInit",
                    	    								lv_objInit_34_0,
                    	    								"arg.Arg.ObjInit");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_35, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_17_4());
                    			

                    }
                    break;

            }

            otherlv_36=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_36, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleAttribute"
    // InternalArg.g:1026:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalArg.g:1026:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalArg.g:1027:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalArg.g:1033:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleEString ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )? ) ;
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
            // InternalArg.g:1039:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleEString ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )? ) )
            // InternalArg.g:1040:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleEString ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )? )
            {
            // InternalArg.g:1040:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleEString ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )? )
            // InternalArg.g:1041:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleEString ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )?
            {
            // InternalArg.g:1041:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArg.g:1042:4: (lv_name_0_0= ruleEString )
            {
            // InternalArg.g:1042:4: (lv_name_0_0= ruleEString )
            // InternalArg.g:1043:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalArg.g:1064:3: ( (lv_type_2_0= ruleEString ) )
            // InternalArg.g:1065:4: (lv_type_2_0= ruleEString )
            {
            // InternalArg.g:1065:4: (lv_type_2_0= ruleEString )
            // InternalArg.g:1066:5: lv_type_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_type_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalArg.g:1087:3: ( (lv_min_4_0= ruleEInt ) )
            // InternalArg.g:1088:4: (lv_min_4_0= ruleEInt )
            {
            // InternalArg.g:1088:4: (lv_min_4_0= ruleEInt )
            // InternalArg.g:1089:5: lv_min_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getMinEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
            lv_min_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"min",
            						lv_min_4_0,
            						"arg.Arg.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getCommaKeyword_5());
            		
            // InternalArg.g:1110:3: ( (lv_max_6_0= ruleEInt ) )
            // InternalArg.g:1111:4: (lv_max_6_0= ruleEInt )
            {
            // InternalArg.g:1111:4: (lv_max_6_0= ruleEInt )
            // InternalArg.g:1112:5: lv_max_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getMaxEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_29);
            lv_max_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"max",
            						lv_max_6_0,
            						"arg.Arg.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getEqualsSignKeyword_8());
            		
            // InternalArg.g:1137:3: ( (lv_default_9_0= ruleEString ) )
            // InternalArg.g:1138:4: (lv_default_9_0= ruleEString )
            {
            // InternalArg.g:1138:4: (lv_default_9_0= ruleEString )
            // InternalArg.g:1139:5: lv_default_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getDefaultEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_31);
            lv_default_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"default",
            						lv_default_9_0,
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:1156:3: ( (lv_isParam_10_0= 'isParam' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalArg.g:1157:4: (lv_isParam_10_0= 'isParam' )
                    {
                    // InternalArg.g:1157:4: (lv_isParam_10_0= 'isParam' )
                    // InternalArg.g:1158:5: lv_isParam_10_0= 'isParam'
                    {
                    lv_isParam_10_0=(Token)match(input,35,FOLLOW_32); 

                    					newLeafNode(lv_isParam_10_0, grammarAccess.getAttributeAccess().getIsParamIsParamKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isParam", lv_isParam_10_0 != null, "isParam");
                    				

                    }


                    }
                    break;

            }

            // InternalArg.g:1170:3: ( (lv_isKey_11_0= 'isKey' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalArg.g:1171:4: (lv_isKey_11_0= 'isKey' )
                    {
                    // InternalArg.g:1171:4: (lv_isKey_11_0= 'isKey' )
                    // InternalArg.g:1172:5: lv_isKey_11_0= 'isKey'
                    {
                    lv_isKey_11_0=(Token)match(input,36,FOLLOW_33); 

                    					newLeafNode(lv_isKey_11_0, grammarAccess.getAttributeAccess().getIsKeyIsKeyKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isKey", lv_isKey_11_0 != null, "isKey");
                    				

                    }


                    }
                    break;

            }

            // InternalArg.g:1184:3: ( (lv_readOnly_12_0= 'readOnly' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalArg.g:1185:4: (lv_readOnly_12_0= 'readOnly' )
                    {
                    // InternalArg.g:1185:4: (lv_readOnly_12_0= 'readOnly' )
                    // InternalArg.g:1186:5: lv_readOnly_12_0= 'readOnly'
                    {
                    lv_readOnly_12_0=(Token)match(input,37,FOLLOW_2); 

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
    // InternalArg.g:1202:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalArg.g:1202:50: (iv_ruleReference= ruleReference EOF )
            // InternalArg.g:1203:2: iv_ruleReference= ruleReference EOF
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
    // InternalArg.g:1209:1: ruleReference returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )? otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_containtment_2_0 = null;

        AntlrDatatypeRuleToken lv_min_4_0 = null;

        AntlrDatatypeRuleToken lv_max_6_0 = null;

        AntlrDatatypeRuleToken lv_target_8_0 = null;

        AntlrDatatypeRuleToken lv_opposite_10_0 = null;



        	enterRule();

        try {
            // InternalArg.g:1215:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )? otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )? ) )
            // InternalArg.g:1216:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )? otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )? )
            {
            // InternalArg.g:1216:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )? otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )? )
            // InternalArg.g:1217:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )? otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )?
            {
            // InternalArg.g:1217:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArg.g:1218:4: (lv_name_0_0= ruleEString )
            {
            // InternalArg.g:1218:4: (lv_name_0_0= ruleEString )
            // InternalArg.g:1219:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:1236:3: (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalArg.g:1237:4: otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getContaintmentKeyword_1_0());
                    			
                    // InternalArg.g:1241:4: ( (lv_containtment_2_0= ruleEString ) )
                    // InternalArg.g:1242:5: (lv_containtment_2_0= ruleEString )
                    {
                    // InternalArg.g:1242:5: (lv_containtment_2_0= ruleEString )
                    // InternalArg.g:1243:6: lv_containtment_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getContaintmentEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_containtment_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"containtment",
                    							lv_containtment_2_0,
                    							"arg.Arg.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,39,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getMinKeyword_2());
            		
            // InternalArg.g:1265:3: ( (lv_min_4_0= ruleEInt ) )
            // InternalArg.g:1266:4: (lv_min_4_0= ruleEInt )
            {
            // InternalArg.g:1266:4: (lv_min_4_0= ruleEInt )
            // InternalArg.g:1267:5: lv_min_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getMinEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_min_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"min",
            						lv_min_4_0,
            						"arg.Arg.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,40,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getMaxKeyword_4());
            		
            // InternalArg.g:1288:3: ( (lv_max_6_0= ruleEInt ) )
            // InternalArg.g:1289:4: (lv_max_6_0= ruleEInt )
            {
            // InternalArg.g:1289:4: (lv_max_6_0= ruleEInt )
            // InternalArg.g:1290:5: lv_max_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getMaxEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_37);
            lv_max_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"max",
            						lv_max_6_0,
            						"arg.Arg.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getReferenceAccess().getTargetKeyword_6());
            		
            // InternalArg.g:1311:3: ( (lv_target_8_0= ruleEString ) )
            // InternalArg.g:1312:4: (lv_target_8_0= ruleEString )
            {
            // InternalArg.g:1312:4: (lv_target_8_0= ruleEString )
            // InternalArg.g:1313:5: lv_target_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getTargetEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_38);
            lv_target_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_8_0,
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:1330:3: (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalArg.g:1331:4: otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getReferenceAccess().getOppositeKeyword_8_0());
                    			
                    // InternalArg.g:1335:4: ( (lv_opposite_10_0= ruleEString ) )
                    // InternalArg.g:1336:5: (lv_opposite_10_0= ruleEString )
                    {
                    // InternalArg.g:1336:5: (lv_opposite_10_0= ruleEString )
                    // InternalArg.g:1337:6: lv_opposite_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getOppositeEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_opposite_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"opposite",
                    							lv_opposite_10_0,
                    							"arg.Arg.EString");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleEInt"
    // InternalArg.g:1359:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalArg.g:1359:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalArg.g:1360:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalArg.g:1366:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalArg.g:1372:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalArg.g:1373:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalArg.g:1373:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalArg.g:1374:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalArg.g:1374:3: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalArg.g:1375:4: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleGraphicClass"
    // InternalArg.g:1392:1: entryRuleGraphicClass returns [EObject current=null] : iv_ruleGraphicClass= ruleGraphicClass EOF ;
    public final EObject entryRuleGraphicClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicClass = null;


        try {
            // InternalArg.g:1392:53: (iv_ruleGraphicClass= ruleGraphicClass EOF )
            // InternalArg.g:1393:2: iv_ruleGraphicClass= ruleGraphicClass EOF
            {
             newCompositeNode(grammarAccess.getGraphicClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicClass=ruleGraphicClass();

            state._fsp--;

             current =iv_ruleGraphicClass; 
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
    // $ANTLR end "entryRuleGraphicClass"


    // $ANTLR start "ruleGraphicClass"
    // InternalArg.g:1399:1: ruleGraphicClass returns [EObject current=null] : (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'versions' otherlv_3= '{' ( (lv_versions_4_0= ruleVersions ) ) (otherlv_5= ',' ( (lv_versions_6_0= ruleVersions ) ) )* otherlv_7= '}' otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraints ) ) otherlv_11= '}' ) ;
    public final EObject ruleGraphicClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_versions_4_0 = null;

        EObject lv_versions_6_0 = null;

        EObject lv_constraints_10_0 = null;



        	enterRule();

        try {
            // InternalArg.g:1405:2: ( (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'versions' otherlv_3= '{' ( (lv_versions_4_0= ruleVersions ) ) (otherlv_5= ',' ( (lv_versions_6_0= ruleVersions ) ) )* otherlv_7= '}' otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraints ) ) otherlv_11= '}' ) )
            // InternalArg.g:1406:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'versions' otherlv_3= '{' ( (lv_versions_4_0= ruleVersions ) ) (otherlv_5= ',' ( (lv_versions_6_0= ruleVersions ) ) )* otherlv_7= '}' otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraints ) ) otherlv_11= '}' )
            {
            // InternalArg.g:1406:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'versions' otherlv_3= '{' ( (lv_versions_4_0= ruleVersions ) ) (otherlv_5= ',' ( (lv_versions_6_0= ruleVersions ) ) )* otherlv_7= '}' otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraints ) ) otherlv_11= '}' )
            // InternalArg.g:1407:3: otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'versions' otherlv_3= '{' ( (lv_versions_4_0= ruleVersions ) ) (otherlv_5= ',' ( (lv_versions_6_0= ruleVersions ) ) )* otherlv_7= '}' otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraints ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicClassAccess().getElementKeyword_0());
            		
            // InternalArg.g:1411:3: ( ( ruleEString ) )
            // InternalArg.g:1412:4: ( ruleEString )
            {
            // InternalArg.g:1412:4: ( ruleEString )
            // InternalArg.g:1413:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphicClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGraphicClassAccess().getOntoClassClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_40);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphicClassAccess().getVersionsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphicClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalArg.g:1435:3: ( (lv_versions_4_0= ruleVersions ) )
            // InternalArg.g:1436:4: (lv_versions_4_0= ruleVersions )
            {
            // InternalArg.g:1436:4: (lv_versions_4_0= ruleVersions )
            // InternalArg.g:1437:5: lv_versions_4_0= ruleVersions
            {

            					newCompositeNode(grammarAccess.getGraphicClassAccess().getVersionsVersionsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_versions_4_0=ruleVersions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicClassRule());
            					}
            					add(
            						current,
            						"versions",
            						lv_versions_4_0,
            						"arg.Arg.Versions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:1454:3: (otherlv_5= ',' ( (lv_versions_6_0= ruleVersions ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==14) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalArg.g:1455:4: otherlv_5= ',' ( (lv_versions_6_0= ruleVersions ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getGraphicClassAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalArg.g:1459:4: ( (lv_versions_6_0= ruleVersions ) )
            	    // InternalArg.g:1460:5: (lv_versions_6_0= ruleVersions )
            	    {
            	    // InternalArg.g:1460:5: (lv_versions_6_0= ruleVersions )
            	    // InternalArg.g:1461:6: lv_versions_6_0= ruleVersions
            	    {

            	    						newCompositeNode(grammarAccess.getGraphicClassAccess().getVersionsVersionsParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_versions_6_0=ruleVersions();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGraphicClassRule());
            	    						}
            	    						add(
            	    							current,
            	    							"versions",
            	    							lv_versions_6_0,
            	    							"arg.Arg.Versions");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_41); 

            			newLeafNode(otherlv_7, grammarAccess.getGraphicClassAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getGraphicClassAccess().getConstraintsKeyword_7());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_9, grammarAccess.getGraphicClassAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalArg.g:1491:3: ( (lv_constraints_10_0= ruleConstraints ) )
            // InternalArg.g:1492:4: (lv_constraints_10_0= ruleConstraints )
            {
            // InternalArg.g:1492:4: (lv_constraints_10_0= ruleConstraints )
            // InternalArg.g:1493:5: lv_constraints_10_0= ruleConstraints
            {

            					newCompositeNode(grammarAccess.getGraphicClassAccess().getConstraintsConstraintsParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_7);
            lv_constraints_10_0=ruleConstraints();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicClassRule());
            					}
            					set(
            						current,
            						"constraints",
            						lv_constraints_10_0,
            						"arg.Arg.Constraints");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getGraphicClassAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleGraphicClass"


    // $ANTLR start "entryRuleConstraints"
    // InternalArg.g:1518:1: entryRuleConstraints returns [EObject current=null] : iv_ruleConstraints= ruleConstraints EOF ;
    public final EObject entryRuleConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraints = null;


        try {
            // InternalArg.g:1518:52: (iv_ruleConstraints= ruleConstraints EOF )
            // InternalArg.g:1519:2: iv_ruleConstraints= ruleConstraints EOF
            {
             newCompositeNode(grammarAccess.getConstraintsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraints=ruleConstraints();

            state._fsp--;

             current =iv_ruleConstraints; 
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
    // $ANTLR end "entryRuleConstraints"


    // $ANTLR start "ruleConstraints"
    // InternalArg.g:1525:1: ruleConstraints returns [EObject current=null] : (otherlv_0= 'plane' ( (lv_planes_1_0= rulePlanes ) ) ( (lv_overlapping_2_0= 'overlaps' ) ) otherlv_3= 'sizeMin' ( (lv_sizeMin_4_0= ruleEDouble ) ) otherlv_5= 'sizeMax' ( (lv_sizeMax_6_0= ruleEDouble ) ) otherlv_7= 'xVariation' ( (lv_xToOriginPos_8_0= ruleEDouble ) ) otherlv_9= 'yVariation' ( (lv_yToOriginPos_10_0= ruleEDouble ) ) otherlv_11= 'zVariation' ( (lv_zToOriginPos_12_0= ruleEDouble ) ) otherlv_13= 'rotation' ( (lv_rotation_14_0= ruleEInt ) ) ) ;
    public final EObject ruleConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_overlapping_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_planes_1_0 = null;

        AntlrDatatypeRuleToken lv_sizeMin_4_0 = null;

        AntlrDatatypeRuleToken lv_sizeMax_6_0 = null;

        AntlrDatatypeRuleToken lv_xToOriginPos_8_0 = null;

        AntlrDatatypeRuleToken lv_yToOriginPos_10_0 = null;

        AntlrDatatypeRuleToken lv_zToOriginPos_12_0 = null;

        AntlrDatatypeRuleToken lv_rotation_14_0 = null;



        	enterRule();

        try {
            // InternalArg.g:1531:2: ( (otherlv_0= 'plane' ( (lv_planes_1_0= rulePlanes ) ) ( (lv_overlapping_2_0= 'overlaps' ) ) otherlv_3= 'sizeMin' ( (lv_sizeMin_4_0= ruleEDouble ) ) otherlv_5= 'sizeMax' ( (lv_sizeMax_6_0= ruleEDouble ) ) otherlv_7= 'xVariation' ( (lv_xToOriginPos_8_0= ruleEDouble ) ) otherlv_9= 'yVariation' ( (lv_yToOriginPos_10_0= ruleEDouble ) ) otherlv_11= 'zVariation' ( (lv_zToOriginPos_12_0= ruleEDouble ) ) otherlv_13= 'rotation' ( (lv_rotation_14_0= ruleEInt ) ) ) )
            // InternalArg.g:1532:2: (otherlv_0= 'plane' ( (lv_planes_1_0= rulePlanes ) ) ( (lv_overlapping_2_0= 'overlaps' ) ) otherlv_3= 'sizeMin' ( (lv_sizeMin_4_0= ruleEDouble ) ) otherlv_5= 'sizeMax' ( (lv_sizeMax_6_0= ruleEDouble ) ) otherlv_7= 'xVariation' ( (lv_xToOriginPos_8_0= ruleEDouble ) ) otherlv_9= 'yVariation' ( (lv_yToOriginPos_10_0= ruleEDouble ) ) otherlv_11= 'zVariation' ( (lv_zToOriginPos_12_0= ruleEDouble ) ) otherlv_13= 'rotation' ( (lv_rotation_14_0= ruleEInt ) ) )
            {
            // InternalArg.g:1532:2: (otherlv_0= 'plane' ( (lv_planes_1_0= rulePlanes ) ) ( (lv_overlapping_2_0= 'overlaps' ) ) otherlv_3= 'sizeMin' ( (lv_sizeMin_4_0= ruleEDouble ) ) otherlv_5= 'sizeMax' ( (lv_sizeMax_6_0= ruleEDouble ) ) otherlv_7= 'xVariation' ( (lv_xToOriginPos_8_0= ruleEDouble ) ) otherlv_9= 'yVariation' ( (lv_yToOriginPos_10_0= ruleEDouble ) ) otherlv_11= 'zVariation' ( (lv_zToOriginPos_12_0= ruleEDouble ) ) otherlv_13= 'rotation' ( (lv_rotation_14_0= ruleEInt ) ) )
            // InternalArg.g:1533:3: otherlv_0= 'plane' ( (lv_planes_1_0= rulePlanes ) ) ( (lv_overlapping_2_0= 'overlaps' ) ) otherlv_3= 'sizeMin' ( (lv_sizeMin_4_0= ruleEDouble ) ) otherlv_5= 'sizeMax' ( (lv_sizeMax_6_0= ruleEDouble ) ) otherlv_7= 'xVariation' ( (lv_xToOriginPos_8_0= ruleEDouble ) ) otherlv_9= 'yVariation' ( (lv_yToOriginPos_10_0= ruleEDouble ) ) otherlv_11= 'zVariation' ( (lv_zToOriginPos_12_0= ruleEDouble ) ) otherlv_13= 'rotation' ( (lv_rotation_14_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintsAccess().getPlaneKeyword_0());
            		
            // InternalArg.g:1537:3: ( (lv_planes_1_0= rulePlanes ) )
            // InternalArg.g:1538:4: (lv_planes_1_0= rulePlanes )
            {
            // InternalArg.g:1538:4: (lv_planes_1_0= rulePlanes )
            // InternalArg.g:1539:5: lv_planes_1_0= rulePlanes
            {

            					newCompositeNode(grammarAccess.getConstraintsAccess().getPlanesPlanesEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_44);
            lv_planes_1_0=rulePlanes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            					}
            					set(
            						current,
            						"planes",
            						lv_planes_1_0,
            						"arg.Arg.Planes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:1556:3: ( (lv_overlapping_2_0= 'overlaps' ) )
            // InternalArg.g:1557:4: (lv_overlapping_2_0= 'overlaps' )
            {
            // InternalArg.g:1557:4: (lv_overlapping_2_0= 'overlaps' )
            // InternalArg.g:1558:5: lv_overlapping_2_0= 'overlaps'
            {
            lv_overlapping_2_0=(Token)match(input,48,FOLLOW_45); 

            					newLeafNode(lv_overlapping_2_0, grammarAccess.getConstraintsAccess().getOverlappingOverlapsKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintsRule());
            					}
            					setWithLastConsumed(current, "overlapping", lv_overlapping_2_0 != null, "overlaps");
            				

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintsAccess().getSizeMinKeyword_3());
            		
            // InternalArg.g:1574:3: ( (lv_sizeMin_4_0= ruleEDouble ) )
            // InternalArg.g:1575:4: (lv_sizeMin_4_0= ruleEDouble )
            {
            // InternalArg.g:1575:4: (lv_sizeMin_4_0= ruleEDouble )
            // InternalArg.g:1576:5: lv_sizeMin_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getConstraintsAccess().getSizeMinEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_47);
            lv_sizeMin_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            					}
            					set(
            						current,
            						"sizeMin",
            						lv_sizeMin_4_0,
            						"arg.Arg.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,50,FOLLOW_46); 

            			newLeafNode(otherlv_5, grammarAccess.getConstraintsAccess().getSizeMaxKeyword_5());
            		
            // InternalArg.g:1597:3: ( (lv_sizeMax_6_0= ruleEDouble ) )
            // InternalArg.g:1598:4: (lv_sizeMax_6_0= ruleEDouble )
            {
            // InternalArg.g:1598:4: (lv_sizeMax_6_0= ruleEDouble )
            // InternalArg.g:1599:5: lv_sizeMax_6_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getConstraintsAccess().getSizeMaxEDoubleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_48);
            lv_sizeMax_6_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            					}
            					set(
            						current,
            						"sizeMax",
            						lv_sizeMax_6_0,
            						"arg.Arg.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,51,FOLLOW_46); 

            			newLeafNode(otherlv_7, grammarAccess.getConstraintsAccess().getXVariationKeyword_7());
            		
            // InternalArg.g:1620:3: ( (lv_xToOriginPos_8_0= ruleEDouble ) )
            // InternalArg.g:1621:4: (lv_xToOriginPos_8_0= ruleEDouble )
            {
            // InternalArg.g:1621:4: (lv_xToOriginPos_8_0= ruleEDouble )
            // InternalArg.g:1622:5: lv_xToOriginPos_8_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getConstraintsAccess().getXToOriginPosEDoubleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_49);
            lv_xToOriginPos_8_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            					}
            					set(
            						current,
            						"xToOriginPos",
            						lv_xToOriginPos_8_0,
            						"arg.Arg.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,52,FOLLOW_46); 

            			newLeafNode(otherlv_9, grammarAccess.getConstraintsAccess().getYVariationKeyword_9());
            		
            // InternalArg.g:1643:3: ( (lv_yToOriginPos_10_0= ruleEDouble ) )
            // InternalArg.g:1644:4: (lv_yToOriginPos_10_0= ruleEDouble )
            {
            // InternalArg.g:1644:4: (lv_yToOriginPos_10_0= ruleEDouble )
            // InternalArg.g:1645:5: lv_yToOriginPos_10_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getConstraintsAccess().getYToOriginPosEDoubleParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_50);
            lv_yToOriginPos_10_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            					}
            					set(
            						current,
            						"yToOriginPos",
            						lv_yToOriginPos_10_0,
            						"arg.Arg.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,53,FOLLOW_46); 

            			newLeafNode(otherlv_11, grammarAccess.getConstraintsAccess().getZVariationKeyword_11());
            		
            // InternalArg.g:1666:3: ( (lv_zToOriginPos_12_0= ruleEDouble ) )
            // InternalArg.g:1667:4: (lv_zToOriginPos_12_0= ruleEDouble )
            {
            // InternalArg.g:1667:4: (lv_zToOriginPos_12_0= ruleEDouble )
            // InternalArg.g:1668:5: lv_zToOriginPos_12_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getConstraintsAccess().getZToOriginPosEDoubleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_51);
            lv_zToOriginPos_12_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            					}
            					set(
            						current,
            						"zToOriginPos",
            						lv_zToOriginPos_12_0,
            						"arg.Arg.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,54,FOLLOW_27); 

            			newLeafNode(otherlv_13, grammarAccess.getConstraintsAccess().getRotationKeyword_13());
            		
            // InternalArg.g:1689:3: ( (lv_rotation_14_0= ruleEInt ) )
            // InternalArg.g:1690:4: (lv_rotation_14_0= ruleEInt )
            {
            // InternalArg.g:1690:4: (lv_rotation_14_0= ruleEInt )
            // InternalArg.g:1691:5: lv_rotation_14_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getConstraintsAccess().getRotationEIntParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_2);
            lv_rotation_14_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            					}
            					set(
            						current,
            						"rotation",
            						lv_rotation_14_0,
            						"arg.Arg.EInt");
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
    // $ANTLR end "ruleConstraints"


    // $ANTLR start "entryRuleVersions"
    // InternalArg.g:1712:1: entryRuleVersions returns [EObject current=null] : iv_ruleVersions= ruleVersions EOF ;
    public final EObject entryRuleVersions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersions = null;


        try {
            // InternalArg.g:1712:49: (iv_ruleVersions= ruleVersions EOF )
            // InternalArg.g:1713:2: iv_ruleVersions= ruleVersions EOF
            {
             newCompositeNode(grammarAccess.getVersionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersions=ruleVersions();

            state._fsp--;

             current =iv_ruleVersions; 
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
    // $ANTLR end "entryRuleVersions"


    // $ANTLR start "ruleVersions"
    // InternalArg.g:1719:1: ruleVersions returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_URL_2_0= ruleEString ) ) ) ;
    public final EObject ruleVersions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_URL_2_0 = null;



        	enterRule();

        try {
            // InternalArg.g:1725:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_URL_2_0= ruleEString ) ) ) )
            // InternalArg.g:1726:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_URL_2_0= ruleEString ) ) )
            {
            // InternalArg.g:1726:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_URL_2_0= ruleEString ) ) )
            // InternalArg.g:1727:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_URL_2_0= ruleEString ) )
            {
            // InternalArg.g:1727:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArg.g:1728:4: (lv_name_0_0= ruleEString )
            {
            // InternalArg.g:1728:4: (lv_name_0_0= ruleEString )
            // InternalArg.g:1729:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVersionsAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVersionsRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionsAccess().getEqualsSignKeyword_1());
            		
            // InternalArg.g:1750:3: ( (lv_URL_2_0= ruleEString ) )
            // InternalArg.g:1751:4: (lv_URL_2_0= ruleEString )
            {
            // InternalArg.g:1751:4: (lv_URL_2_0= ruleEString )
            // InternalArg.g:1752:5: lv_URL_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVersionsAccess().getURLEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_URL_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVersionsRule());
            					}
            					set(
            						current,
            						"URL",
            						lv_URL_2_0,
            						"arg.Arg.EString");
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
    // $ANTLR end "ruleVersions"


    // $ANTLR start "entryRuleEDouble"
    // InternalArg.g:1773:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalArg.g:1773:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalArg.g:1774:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalArg.g:1780:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalArg.g:1786:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalArg.g:1787:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalArg.g:1787:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalArg.g:1788:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalArg.g:1788:3: (kw= '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalArg.g:1789:4: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_52); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalArg.g:1795:3: (this_INT_1= RULE_INT )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalArg.g:1796:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_53); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,55,FOLLOW_39); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_54); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalArg.g:1816:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=56 && LA31_0<=57)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalArg.g:1817:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalArg.g:1817:4: (kw= 'E' | kw= 'e' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==56) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==57) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalArg.g:1818:5: kw= 'E'
                            {
                            kw=(Token)match(input,56,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalArg.g:1824:5: kw= 'e'
                            {
                            kw=(Token)match(input,57,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalArg.g:1830:4: (kw= '-' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==43) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalArg.g:1831:5: kw= '-'
                            {
                            kw=(Token)match(input,43,FOLLOW_39); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRulePhysicClass"
    // InternalArg.g:1849:1: entryRulePhysicClass returns [EObject current=null] : iv_rulePhysicClass= rulePhysicClass EOF ;
    public final EObject entryRulePhysicClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicClass = null;


        try {
            // InternalArg.g:1849:52: (iv_rulePhysicClass= rulePhysicClass EOF )
            // InternalArg.g:1850:2: iv_rulePhysicClass= rulePhysicClass EOF
            {
             newCompositeNode(grammarAccess.getPhysicClassRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhysicClass=rulePhysicClass();

            state._fsp--;

             current =iv_rulePhysicClass; 
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
    // $ANTLR end "entryRulePhysicClass"


    // $ANTLR start "rulePhysicClass"
    // InternalArg.g:1856:1: rulePhysicClass returns [EObject current=null] : (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'body' otherlv_3= '{' ( (lv_physicBody_4_0= rulePhysicBody ) ) otherlv_5= '}' (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForce ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) ) )* otherlv_11= '}' )? otherlv_12= 'contacts' otherlv_13= '{' ( (lv_bitMasks_14_0= ruleBitMasks ) ) otherlv_15= '}' ) ;
    public final EObject rulePhysicClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_physicBody_4_0 = null;

        EObject lv_forces_8_0 = null;

        EObject lv_forces_10_0 = null;

        EObject lv_bitMasks_14_0 = null;



        	enterRule();

        try {
            // InternalArg.g:1862:2: ( (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'body' otherlv_3= '{' ( (lv_physicBody_4_0= rulePhysicBody ) ) otherlv_5= '}' (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForce ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) ) )* otherlv_11= '}' )? otherlv_12= 'contacts' otherlv_13= '{' ( (lv_bitMasks_14_0= ruleBitMasks ) ) otherlv_15= '}' ) )
            // InternalArg.g:1863:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'body' otherlv_3= '{' ( (lv_physicBody_4_0= rulePhysicBody ) ) otherlv_5= '}' (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForce ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) ) )* otherlv_11= '}' )? otherlv_12= 'contacts' otherlv_13= '{' ( (lv_bitMasks_14_0= ruleBitMasks ) ) otherlv_15= '}' )
            {
            // InternalArg.g:1863:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'body' otherlv_3= '{' ( (lv_physicBody_4_0= rulePhysicBody ) ) otherlv_5= '}' (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForce ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) ) )* otherlv_11= '}' )? otherlv_12= 'contacts' otherlv_13= '{' ( (lv_bitMasks_14_0= ruleBitMasks ) ) otherlv_15= '}' )
            // InternalArg.g:1864:3: otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'body' otherlv_3= '{' ( (lv_physicBody_4_0= rulePhysicBody ) ) otherlv_5= '}' (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForce ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) ) )* otherlv_11= '}' )? otherlv_12= 'contacts' otherlv_13= '{' ( (lv_bitMasks_14_0= ruleBitMasks ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPhysicClassAccess().getElementKeyword_0());
            		
            // InternalArg.g:1868:3: ( ( ruleEString ) )
            // InternalArg.g:1869:4: ( ruleEString )
            {
            // InternalArg.g:1869:4: ( ruleEString )
            // InternalArg.g:1870:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhysicClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPhysicClassAccess().getOntoClassClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_55);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPhysicClassAccess().getBodyKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_3, grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalArg.g:1892:3: ( (lv_physicBody_4_0= rulePhysicBody ) )
            // InternalArg.g:1893:4: (lv_physicBody_4_0= rulePhysicBody )
            {
            // InternalArg.g:1893:4: (lv_physicBody_4_0= rulePhysicBody )
            // InternalArg.g:1894:5: lv_physicBody_4_0= rulePhysicBody
            {

            					newCompositeNode(grammarAccess.getPhysicClassAccess().getPhysicBodyPhysicBodyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_physicBody_4_0=rulePhysicBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicClassRule());
            					}
            					set(
            						current,
            						"physicBody",
            						lv_physicBody_4_0,
            						"arg.Arg.PhysicBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_57); 

            			newLeafNode(otherlv_5, grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalArg.g:1915:3: (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForce ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) ) )* otherlv_11= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==59) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalArg.g:1916:4: otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForce ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getPhysicClassAccess().getForcesKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalArg.g:1924:4: ( (lv_forces_8_0= ruleForce ) )
                    // InternalArg.g:1925:5: (lv_forces_8_0= ruleForce )
                    {
                    // InternalArg.g:1925:5: (lv_forces_8_0= ruleForce )
                    // InternalArg.g:1926:6: lv_forces_8_0= ruleForce
                    {

                    						newCompositeNode(grammarAccess.getPhysicClassAccess().getForcesForceParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_forces_8_0=ruleForce();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhysicClassRule());
                    						}
                    						add(
                    							current,
                    							"forces",
                    							lv_forces_8_0,
                    							"arg.Arg.Force");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArg.g:1943:4: (otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==14) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalArg.g:1944:5: otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getPhysicClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalArg.g:1948:5: ( (lv_forces_10_0= ruleForce ) )
                    	    // InternalArg.g:1949:6: (lv_forces_10_0= ruleForce )
                    	    {
                    	    // InternalArg.g:1949:6: (lv_forces_10_0= ruleForce )
                    	    // InternalArg.g:1950:7: lv_forces_10_0= ruleForce
                    	    {

                    	    							newCompositeNode(grammarAccess.getPhysicClassAccess().getForcesForceParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_forces_10_0=ruleForce();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPhysicClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"forces",
                    	    								lv_forces_10_0,
                    	    								"arg.Arg.Force");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_58); 

                    				newLeafNode(otherlv_11, grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getPhysicClassAccess().getContactsKeyword_7());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_13, grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalArg.g:1981:3: ( (lv_bitMasks_14_0= ruleBitMasks ) )
            // InternalArg.g:1982:4: (lv_bitMasks_14_0= ruleBitMasks )
            {
            // InternalArg.g:1982:4: (lv_bitMasks_14_0= ruleBitMasks )
            // InternalArg.g:1983:5: lv_bitMasks_14_0= ruleBitMasks
            {

            					newCompositeNode(grammarAccess.getPhysicClassAccess().getBitMasksBitMasksParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_7);
            lv_bitMasks_14_0=ruleBitMasks();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicClassRule());
            					}
            					set(
            						current,
            						"bitMasks",
            						lv_bitMasks_14_0,
            						"arg.Arg.BitMasks");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "rulePhysicClass"


    // $ANTLR start "entryRulePhysicBody"
    // InternalArg.g:2008:1: entryRulePhysicBody returns [EObject current=null] : iv_rulePhysicBody= rulePhysicBody EOF ;
    public final EObject entryRulePhysicBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicBody = null;


        try {
            // InternalArg.g:2008:51: (iv_rulePhysicBody= rulePhysicBody EOF )
            // InternalArg.g:2009:2: iv_rulePhysicBody= rulePhysicBody EOF
            {
             newCompositeNode(grammarAccess.getPhysicBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhysicBody=rulePhysicBody();

            state._fsp--;

             current =iv_rulePhysicBody; 
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
    // $ANTLR end "entryRulePhysicBody"


    // $ANTLR start "rulePhysicBody"
    // InternalArg.g:2015:1: rulePhysicBody returns [EObject current=null] : (otherlv_0= 'mass' ( (lv_mass_1_0= ruleEDouble ) ) otherlv_2= 'bodyType' ( (lv_bodyType_3_0= ruleBodyType ) ) otherlv_4= 'charge' ( (lv_charge_5_0= ruleEDouble ) ) otherlv_6= 'friction' ( (lv_friction_7_0= ruleEDouble ) ) otherlv_8= 'rollingFriction' ( (lv_rollingFriction_9_0= ruleEDouble ) ) otherlv_10= 'restitution' ( (lv_restitution_11_0= ruleEDouble ) ) otherlv_12= 'damping' ( (lv_damping_13_0= ruleEDouble ) ) otherlv_14= 'angularDamping' ( (lv_angularDamping_15_0= ruleEDouble ) ) ) ;
    public final EObject rulePhysicBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_mass_1_0 = null;

        Enumerator lv_bodyType_3_0 = null;

        AntlrDatatypeRuleToken lv_charge_5_0 = null;

        AntlrDatatypeRuleToken lv_friction_7_0 = null;

        AntlrDatatypeRuleToken lv_rollingFriction_9_0 = null;

        AntlrDatatypeRuleToken lv_restitution_11_0 = null;

        AntlrDatatypeRuleToken lv_damping_13_0 = null;

        AntlrDatatypeRuleToken lv_angularDamping_15_0 = null;



        	enterRule();

        try {
            // InternalArg.g:2021:2: ( (otherlv_0= 'mass' ( (lv_mass_1_0= ruleEDouble ) ) otherlv_2= 'bodyType' ( (lv_bodyType_3_0= ruleBodyType ) ) otherlv_4= 'charge' ( (lv_charge_5_0= ruleEDouble ) ) otherlv_6= 'friction' ( (lv_friction_7_0= ruleEDouble ) ) otherlv_8= 'rollingFriction' ( (lv_rollingFriction_9_0= ruleEDouble ) ) otherlv_10= 'restitution' ( (lv_restitution_11_0= ruleEDouble ) ) otherlv_12= 'damping' ( (lv_damping_13_0= ruleEDouble ) ) otherlv_14= 'angularDamping' ( (lv_angularDamping_15_0= ruleEDouble ) ) ) )
            // InternalArg.g:2022:2: (otherlv_0= 'mass' ( (lv_mass_1_0= ruleEDouble ) ) otherlv_2= 'bodyType' ( (lv_bodyType_3_0= ruleBodyType ) ) otherlv_4= 'charge' ( (lv_charge_5_0= ruleEDouble ) ) otherlv_6= 'friction' ( (lv_friction_7_0= ruleEDouble ) ) otherlv_8= 'rollingFriction' ( (lv_rollingFriction_9_0= ruleEDouble ) ) otherlv_10= 'restitution' ( (lv_restitution_11_0= ruleEDouble ) ) otherlv_12= 'damping' ( (lv_damping_13_0= ruleEDouble ) ) otherlv_14= 'angularDamping' ( (lv_angularDamping_15_0= ruleEDouble ) ) )
            {
            // InternalArg.g:2022:2: (otherlv_0= 'mass' ( (lv_mass_1_0= ruleEDouble ) ) otherlv_2= 'bodyType' ( (lv_bodyType_3_0= ruleBodyType ) ) otherlv_4= 'charge' ( (lv_charge_5_0= ruleEDouble ) ) otherlv_6= 'friction' ( (lv_friction_7_0= ruleEDouble ) ) otherlv_8= 'rollingFriction' ( (lv_rollingFriction_9_0= ruleEDouble ) ) otherlv_10= 'restitution' ( (lv_restitution_11_0= ruleEDouble ) ) otherlv_12= 'damping' ( (lv_damping_13_0= ruleEDouble ) ) otherlv_14= 'angularDamping' ( (lv_angularDamping_15_0= ruleEDouble ) ) )
            // InternalArg.g:2023:3: otherlv_0= 'mass' ( (lv_mass_1_0= ruleEDouble ) ) otherlv_2= 'bodyType' ( (lv_bodyType_3_0= ruleBodyType ) ) otherlv_4= 'charge' ( (lv_charge_5_0= ruleEDouble ) ) otherlv_6= 'friction' ( (lv_friction_7_0= ruleEDouble ) ) otherlv_8= 'rollingFriction' ( (lv_rollingFriction_9_0= ruleEDouble ) ) otherlv_10= 'restitution' ( (lv_restitution_11_0= ruleEDouble ) ) otherlv_12= 'damping' ( (lv_damping_13_0= ruleEDouble ) ) otherlv_14= 'angularDamping' ( (lv_angularDamping_15_0= ruleEDouble ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getPhysicBodyAccess().getMassKeyword_0());
            		
            // InternalArg.g:2027:3: ( (lv_mass_1_0= ruleEDouble ) )
            // InternalArg.g:2028:4: (lv_mass_1_0= ruleEDouble )
            {
            // InternalArg.g:2028:4: (lv_mass_1_0= ruleEDouble )
            // InternalArg.g:2029:5: lv_mass_1_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getMassEDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_60);
            lv_mass_1_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicBodyRule());
            					}
            					set(
            						current,
            						"mass",
            						lv_mass_1_0,
            						"arg.Arg.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,62,FOLLOW_61); 

            			newLeafNode(otherlv_2, grammarAccess.getPhysicBodyAccess().getBodyTypeKeyword_2());
            		
            // InternalArg.g:2050:3: ( (lv_bodyType_3_0= ruleBodyType ) )
            // InternalArg.g:2051:4: (lv_bodyType_3_0= ruleBodyType )
            {
            // InternalArg.g:2051:4: (lv_bodyType_3_0= ruleBodyType )
            // InternalArg.g:2052:5: lv_bodyType_3_0= ruleBodyType
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getBodyTypeBodyTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_62);
            lv_bodyType_3_0=ruleBodyType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicBodyRule());
            					}
            					set(
            						current,
            						"bodyType",
            						lv_bodyType_3_0,
            						"arg.Arg.BodyType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,63,FOLLOW_46); 

            			newLeafNode(otherlv_4, grammarAccess.getPhysicBodyAccess().getChargeKeyword_4());
            		
            // InternalArg.g:2073:3: ( (lv_charge_5_0= ruleEDouble ) )
            // InternalArg.g:2074:4: (lv_charge_5_0= ruleEDouble )
            {
            // InternalArg.g:2074:4: (lv_charge_5_0= ruleEDouble )
            // InternalArg.g:2075:5: lv_charge_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getChargeEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_63);
            lv_charge_5_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicBodyRule());
            					}
            					set(
            						current,
            						"charge",
            						lv_charge_5_0,
            						"arg.Arg.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,64,FOLLOW_46); 

            			newLeafNode(otherlv_6, grammarAccess.getPhysicBodyAccess().getFrictionKeyword_6());
            		
            // InternalArg.g:2096:3: ( (lv_friction_7_0= ruleEDouble ) )
            // InternalArg.g:2097:4: (lv_friction_7_0= ruleEDouble )
            {
            // InternalArg.g:2097:4: (lv_friction_7_0= ruleEDouble )
            // InternalArg.g:2098:5: lv_friction_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getFrictionEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_64);
            lv_friction_7_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicBodyRule());
            					}
            					set(
            						current,
            						"friction",
            						lv_friction_7_0,
            						"arg.Arg.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,65,FOLLOW_46); 

            			newLeafNode(otherlv_8, grammarAccess.getPhysicBodyAccess().getRollingFrictionKeyword_8());
            		
            // InternalArg.g:2119:3: ( (lv_rollingFriction_9_0= ruleEDouble ) )
            // InternalArg.g:2120:4: (lv_rollingFriction_9_0= ruleEDouble )
            {
            // InternalArg.g:2120:4: (lv_rollingFriction_9_0= ruleEDouble )
            // InternalArg.g:2121:5: lv_rollingFriction_9_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getRollingFrictionEDoubleParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_65);
            lv_rollingFriction_9_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicBodyRule());
            					}
            					set(
            						current,
            						"rollingFriction",
            						lv_rollingFriction_9_0,
            						"arg.Arg.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,66,FOLLOW_46); 

            			newLeafNode(otherlv_10, grammarAccess.getPhysicBodyAccess().getRestitutionKeyword_10());
            		
            // InternalArg.g:2142:3: ( (lv_restitution_11_0= ruleEDouble ) )
            // InternalArg.g:2143:4: (lv_restitution_11_0= ruleEDouble )
            {
            // InternalArg.g:2143:4: (lv_restitution_11_0= ruleEDouble )
            // InternalArg.g:2144:5: lv_restitution_11_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getRestitutionEDoubleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_66);
            lv_restitution_11_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicBodyRule());
            					}
            					set(
            						current,
            						"restitution",
            						lv_restitution_11_0,
            						"arg.Arg.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,67,FOLLOW_46); 

            			newLeafNode(otherlv_12, grammarAccess.getPhysicBodyAccess().getDampingKeyword_12());
            		
            // InternalArg.g:2165:3: ( (lv_damping_13_0= ruleEDouble ) )
            // InternalArg.g:2166:4: (lv_damping_13_0= ruleEDouble )
            {
            // InternalArg.g:2166:4: (lv_damping_13_0= ruleEDouble )
            // InternalArg.g:2167:5: lv_damping_13_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getDampingEDoubleParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_67);
            lv_damping_13_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicBodyRule());
            					}
            					set(
            						current,
            						"damping",
            						lv_damping_13_0,
            						"arg.Arg.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,68,FOLLOW_46); 

            			newLeafNode(otherlv_14, grammarAccess.getPhysicBodyAccess().getAngularDampingKeyword_14());
            		
            // InternalArg.g:2188:3: ( (lv_angularDamping_15_0= ruleEDouble ) )
            // InternalArg.g:2189:4: (lv_angularDamping_15_0= ruleEDouble )
            {
            // InternalArg.g:2189:4: (lv_angularDamping_15_0= ruleEDouble )
            // InternalArg.g:2190:5: lv_angularDamping_15_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getAngularDampingEDoubleParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_2);
            lv_angularDamping_15_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicBodyRule());
            					}
            					set(
            						current,
            						"angularDamping",
            						lv_angularDamping_15_0,
            						"arg.Arg.EDouble");
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
    // $ANTLR end "rulePhysicBody"


    // $ANTLR start "entryRuleBitMasks"
    // InternalArg.g:2211:1: entryRuleBitMasks returns [EObject current=null] : iv_ruleBitMasks= ruleBitMasks EOF ;
    public final EObject entryRuleBitMasks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitMasks = null;


        try {
            // InternalArg.g:2211:49: (iv_ruleBitMasks= ruleBitMasks EOF )
            // InternalArg.g:2212:2: iv_ruleBitMasks= ruleBitMasks EOF
            {
             newCompositeNode(grammarAccess.getBitMasksRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBitMasks=ruleBitMasks();

            state._fsp--;

             current =iv_ruleBitMasks; 
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
    // $ANTLR end "entryRuleBitMasks"


    // $ANTLR start "ruleBitMasks"
    // InternalArg.g:2218:1: ruleBitMasks returns [EObject current=null] : (otherlv_0= 'collision' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'contact' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleBitMasks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalArg.g:2224:2: ( (otherlv_0= 'collision' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'contact' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* ) )
            // InternalArg.g:2225:2: (otherlv_0= 'collision' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'contact' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )
            {
            // InternalArg.g:2225:2: (otherlv_0= 'collision' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'contact' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )
            // InternalArg.g:2226:3: otherlv_0= 'collision' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'contact' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBitMasksAccess().getCollisionKeyword_0());
            		
            // InternalArg.g:2230:3: ( ( ruleEString ) )
            // InternalArg.g:2231:4: ( ruleEString )
            {
            // InternalArg.g:2231:4: ( ruleEString )
            // InternalArg.g:2232:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBitMasksRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBitMasksAccess().getCollisionClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_68);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:2246:3: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==14) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalArg.g:2247:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getBitMasksAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalArg.g:2251:4: ( ( ruleEString ) )
            	    // InternalArg.g:2252:5: ( ruleEString )
            	    {
            	    // InternalArg.g:2252:5: ( ruleEString )
            	    // InternalArg.g:2253:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBitMasksRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getBitMasksAccess().getCollisionClassCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_68);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_4=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getBitMasksAccess().getContactKeyword_3());
            		
            // InternalArg.g:2272:3: ( ( ruleEString ) )
            // InternalArg.g:2273:4: ( ruleEString )
            {
            // InternalArg.g:2273:4: ( ruleEString )
            // InternalArg.g:2274:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBitMasksRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBitMasksAccess().getContactClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_69);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:2288:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==14) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalArg.g:2289:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getBitMasksAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalArg.g:2293:4: ( ( ruleEString ) )
            	    // InternalArg.g:2294:5: ( ruleEString )
            	    {
            	    // InternalArg.g:2294:5: ( ruleEString )
            	    // InternalArg.g:2295:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBitMasksRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getBitMasksAccess().getContactClassCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_69);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


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
    // $ANTLR end "ruleBitMasks"


    // $ANTLR start "entryRuleForce"
    // InternalArg.g:2314:1: entryRuleForce returns [EObject current=null] : iv_ruleForce= ruleForce EOF ;
    public final EObject entryRuleForce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForce = null;


        try {
            // InternalArg.g:2314:46: (iv_ruleForce= ruleForce EOF )
            // InternalArg.g:2315:2: iv_ruleForce= ruleForce EOF
            {
             newCompositeNode(grammarAccess.getForceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForce=ruleForce();

            state._fsp--;

             current =iv_ruleForce; 
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
    // $ANTLR end "entryRuleForce"


    // $ANTLR start "ruleForce"
    // InternalArg.g:2321:1: ruleForce returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'gesture' ( (lv_gesture_3_0= ruleEString ) ) (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )? ) ;
    public final EObject ruleForce() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_gesture_3_0 = null;

        AntlrDatatypeRuleToken lv_xVector_5_0 = null;

        AntlrDatatypeRuleToken lv_yVector_7_0 = null;

        AntlrDatatypeRuleToken lv_zVector_9_0 = null;



        	enterRule();

        try {
            // InternalArg.g:2327:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'gesture' ( (lv_gesture_3_0= ruleEString ) ) (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )? ) )
            // InternalArg.g:2328:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'gesture' ( (lv_gesture_3_0= ruleEString ) ) (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )? )
            {
            // InternalArg.g:2328:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'gesture' ( (lv_gesture_3_0= ruleEString ) ) (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )? )
            // InternalArg.g:2329:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'gesture' ( (lv_gesture_3_0= ruleEString ) ) (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )?
            {
            // InternalArg.g:2329:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArg.g:2330:4: (lv_name_0_0= ruleEString )
            {
            // InternalArg.g:2330:4: (lv_name_0_0= ruleEString )
            // InternalArg.g:2331:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getForceAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_70); 

            			newLeafNode(otherlv_1, grammarAccess.getForceAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getForceAccess().getGestureKeyword_2());
            		
            // InternalArg.g:2356:3: ( (lv_gesture_3_0= ruleEString ) )
            // InternalArg.g:2357:4: (lv_gesture_3_0= ruleEString )
            {
            // InternalArg.g:2357:4: (lv_gesture_3_0= ruleEString )
            // InternalArg.g:2358:5: lv_gesture_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getForceAccess().getGestureEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_71);
            lv_gesture_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForceRule());
            					}
            					set(
            						current,
            						"gesture",
            						lv_gesture_3_0,
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:2375:3: (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalArg.g:2376:4: otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_46); 

                    				newLeafNode(otherlv_4, grammarAccess.getForceAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalArg.g:2380:4: ( (lv_xVector_5_0= ruleEDouble ) )
                    // InternalArg.g:2381:5: (lv_xVector_5_0= ruleEDouble )
                    {
                    // InternalArg.g:2381:5: (lv_xVector_5_0= ruleEDouble )
                    // InternalArg.g:2382:6: lv_xVector_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getForceAccess().getXVectorEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_xVector_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForceRule());
                    						}
                    						set(
                    							current,
                    							"xVector",
                    							lv_xVector_5_0,
                    							"arg.Arg.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,14,FOLLOW_46); 

                    				newLeafNode(otherlv_6, grammarAccess.getForceAccess().getCommaKeyword_4_2());
                    			
                    // InternalArg.g:2403:4: ( (lv_yVector_7_0= ruleEDouble ) )
                    // InternalArg.g:2404:5: (lv_yVector_7_0= ruleEDouble )
                    {
                    // InternalArg.g:2404:5: (lv_yVector_7_0= ruleEDouble )
                    // InternalArg.g:2405:6: lv_yVector_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getForceAccess().getYVectorEDoubleParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_yVector_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForceRule());
                    						}
                    						set(
                    							current,
                    							"yVector",
                    							lv_yVector_7_0,
                    							"arg.Arg.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,14,FOLLOW_46); 

                    				newLeafNode(otherlv_8, grammarAccess.getForceAccess().getCommaKeyword_4_4());
                    			
                    // InternalArg.g:2426:4: ( (lv_zVector_9_0= ruleEDouble ) )
                    // InternalArg.g:2427:5: (lv_zVector_9_0= ruleEDouble )
                    {
                    // InternalArg.g:2427:5: (lv_zVector_9_0= ruleEDouble )
                    // InternalArg.g:2428:6: lv_zVector_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getForceAccess().getZVectorEDoubleParserRuleCall_4_5_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_zVector_9_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForceRule());
                    						}
                    						set(
                    							current,
                    							"zVector",
                    							lv_zVector_9_0,
                    							"arg.Arg.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getForceAccess().getRightSquareBracketKeyword_4_6());
                    			

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
    // $ANTLR end "ruleForce"


    // $ANTLR start "entryRuleGamePad"
    // InternalArg.g:2454:1: entryRuleGamePad returns [EObject current=null] : iv_ruleGamePad= ruleGamePad EOF ;
    public final EObject entryRuleGamePad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGamePad = null;


        try {
            // InternalArg.g:2454:48: (iv_ruleGamePad= ruleGamePad EOF )
            // InternalArg.g:2455:2: iv_ruleGamePad= ruleGamePad EOF
            {
             newCompositeNode(grammarAccess.getGamePadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGamePad=ruleGamePad();

            state._fsp--;

             current =iv_ruleGamePad; 
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
    // $ANTLR end "entryRuleGamePad"


    // $ANTLR start "ruleGamePad"
    // InternalArg.g:2461:1: ruleGamePad returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleGamePad() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalArg.g:2467:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) ) ) )
            // InternalArg.g:2468:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) ) )
            {
            // InternalArg.g:2468:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) ) )
            // InternalArg.g:2469:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) )
            {
            // InternalArg.g:2469:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArg.g:2470:4: (lv_name_0_0= ruleEString )
            {
            // InternalArg.g:2470:4: (lv_name_0_0= ruleEString )
            // InternalArg.g:2471:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGamePadAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_72);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGamePadRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGamePadAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalArg.g:2492:3: ( ( ruleEString ) )
            // InternalArg.g:2493:4: ( ruleEString )
            {
            // InternalArg.g:2493:4: ( ruleEString )
            // InternalArg.g:2494:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGamePadRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGamePadAccess().getTriggerTriggerCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleGamePad"


    // $ANTLR start "entryRuleScoreSystem"
    // InternalArg.g:2512:1: entryRuleScoreSystem returns [EObject current=null] : iv_ruleScoreSystem= ruleScoreSystem EOF ;
    public final EObject entryRuleScoreSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScoreSystem = null;


        try {
            // InternalArg.g:2512:52: (iv_ruleScoreSystem= ruleScoreSystem EOF )
            // InternalArg.g:2513:2: iv_ruleScoreSystem= ruleScoreSystem EOF
            {
             newCompositeNode(grammarAccess.getScoreSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScoreSystem=ruleScoreSystem();

            state._fsp--;

             current =iv_ruleScoreSystem; 
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
    // $ANTLR end "entryRuleScoreSystem"


    // $ANTLR start "ruleScoreSystem"
    // InternalArg.g:2519:1: ruleScoreSystem returns [EObject current=null] : (otherlv_0= 'start' ( (lv_start_1_0= ruleEInt ) ) otherlv_2= 'goal' ( (lv_finish_3_0= ruleEInt ) ) otherlv_4= 'lives' ( (lv_lives_5_0= ruleEInt ) ) ) ;
    public final EObject ruleScoreSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_start_1_0 = null;

        AntlrDatatypeRuleToken lv_finish_3_0 = null;

        AntlrDatatypeRuleToken lv_lives_5_0 = null;



        	enterRule();

        try {
            // InternalArg.g:2525:2: ( (otherlv_0= 'start' ( (lv_start_1_0= ruleEInt ) ) otherlv_2= 'goal' ( (lv_finish_3_0= ruleEInt ) ) otherlv_4= 'lives' ( (lv_lives_5_0= ruleEInt ) ) ) )
            // InternalArg.g:2526:2: (otherlv_0= 'start' ( (lv_start_1_0= ruleEInt ) ) otherlv_2= 'goal' ( (lv_finish_3_0= ruleEInt ) ) otherlv_4= 'lives' ( (lv_lives_5_0= ruleEInt ) ) )
            {
            // InternalArg.g:2526:2: (otherlv_0= 'start' ( (lv_start_1_0= ruleEInt ) ) otherlv_2= 'goal' ( (lv_finish_3_0= ruleEInt ) ) otherlv_4= 'lives' ( (lv_lives_5_0= ruleEInt ) ) )
            // InternalArg.g:2527:3: otherlv_0= 'start' ( (lv_start_1_0= ruleEInt ) ) otherlv_2= 'goal' ( (lv_finish_3_0= ruleEInt ) ) otherlv_4= 'lives' ( (lv_lives_5_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getScoreSystemAccess().getStartKeyword_0());
            		
            // InternalArg.g:2531:3: ( (lv_start_1_0= ruleEInt ) )
            // InternalArg.g:2532:4: (lv_start_1_0= ruleEInt )
            {
            // InternalArg.g:2532:4: (lv_start_1_0= ruleEInt )
            // InternalArg.g:2533:5: lv_start_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getScoreSystemAccess().getStartEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_73);
            lv_start_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScoreSystemRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_1_0,
            						"arg.Arg.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,73,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getScoreSystemAccess().getGoalKeyword_2());
            		
            // InternalArg.g:2554:3: ( (lv_finish_3_0= ruleEInt ) )
            // InternalArg.g:2555:4: (lv_finish_3_0= ruleEInt )
            {
            // InternalArg.g:2555:4: (lv_finish_3_0= ruleEInt )
            // InternalArg.g:2556:5: lv_finish_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getScoreSystemAccess().getFinishEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_74);
            lv_finish_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScoreSystemRule());
            					}
            					set(
            						current,
            						"finish",
            						lv_finish_3_0,
            						"arg.Arg.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,74,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getScoreSystemAccess().getLivesKeyword_4());
            		
            // InternalArg.g:2577:3: ( (lv_lives_5_0= ruleEInt ) )
            // InternalArg.g:2578:4: (lv_lives_5_0= ruleEInt )
            {
            // InternalArg.g:2578:4: (lv_lives_5_0= ruleEInt )
            // InternalArg.g:2579:5: lv_lives_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getScoreSystemAccess().getLivesEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_lives_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScoreSystemRule());
            					}
            					set(
            						current,
            						"lives",
            						lv_lives_5_0,
            						"arg.Arg.EInt");
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
    // $ANTLR end "ruleScoreSystem"


    // $ANTLR start "entryRuleTrigger"
    // InternalArg.g:2600:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalArg.g:2600:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalArg.g:2601:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalArg.g:2607:1: ruleTrigger returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )? (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )? (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )? (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )? (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChange ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_action_3_0 = null;

        AntlrDatatypeRuleToken lv_message_5_0 = null;

        AntlrDatatypeRuleToken lv_scoreChange_7_0 = null;

        AntlrDatatypeRuleToken lv_timeTrigger_9_0 = null;

        EObject lv_physicChanges_12_0 = null;

        EObject lv_physicChanges_14_0 = null;



        	enterRule();

        try {
            // InternalArg.g:2613:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )? (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )? (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )? (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )? (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChange ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalArg.g:2614:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )? (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )? (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )? (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )? (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChange ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalArg.g:2614:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )? (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )? (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )? (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )? (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChange ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalArg.g:2615:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )? (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )? (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )? (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )? (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChange ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalArg.g:2615:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArg.g:2616:4: (lv_name_0_0= ruleEString )
            {
            // InternalArg.g:2616:4: (lv_name_0_0= ruleEString )
            // InternalArg.g:2617:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTriggerAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTriggerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_75); 

            			newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalArg.g:2638:3: (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==75) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalArg.g:2639:4: otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) )
                    {
                    otherlv_2=(Token)match(input,75,FOLLOW_76); 

                    				newLeafNode(otherlv_2, grammarAccess.getTriggerAccess().getActionKeyword_2_0());
                    			
                    // InternalArg.g:2643:4: ( (lv_action_3_0= ruleBasicActions ) )
                    // InternalArg.g:2644:5: (lv_action_3_0= ruleBasicActions )
                    {
                    // InternalArg.g:2644:5: (lv_action_3_0= ruleBasicActions )
                    // InternalArg.g:2645:6: lv_action_3_0= ruleBasicActions
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getActionBasicActionsEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_77);
                    lv_action_3_0=ruleBasicActions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTriggerRule());
                    						}
                    						set(
                    							current,
                    							"action",
                    							lv_action_3_0,
                    							"arg.Arg.BasicActions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalArg.g:2663:3: (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==76) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalArg.g:2664:4: otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,76,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTriggerAccess().getDisplayKeyword_3_0());
                    			
                    // InternalArg.g:2668:4: ( (lv_message_5_0= ruleEString ) )
                    // InternalArg.g:2669:5: (lv_message_5_0= ruleEString )
                    {
                    // InternalArg.g:2669:5: (lv_message_5_0= ruleEString )
                    // InternalArg.g:2670:6: lv_message_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getMessageEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    lv_message_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTriggerRule());
                    						}
                    						set(
                    							current,
                    							"message",
                    							lv_message_5_0,
                    							"arg.Arg.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalArg.g:2688:3: (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==27) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalArg.g:2689:4: otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getTriggerAccess().getScoreKeyword_4_0());
                    			
                    // InternalArg.g:2693:4: ( (lv_scoreChange_7_0= ruleEInt ) )
                    // InternalArg.g:2694:5: (lv_scoreChange_7_0= ruleEInt )
                    {
                    // InternalArg.g:2694:5: (lv_scoreChange_7_0= ruleEInt )
                    // InternalArg.g:2695:6: lv_scoreChange_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getScoreChangeEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_79);
                    lv_scoreChange_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTriggerRule());
                    						}
                    						set(
                    							current,
                    							"scoreChange",
                    							lv_scoreChange_7_0,
                    							"arg.Arg.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalArg.g:2713:3: (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==77) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalArg.g:2714:4: otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,77,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getTriggerAccess().getTimeEachKeyword_5_0());
                    			
                    // InternalArg.g:2718:4: ( (lv_timeTrigger_9_0= ruleEInt ) )
                    // InternalArg.g:2719:5: (lv_timeTrigger_9_0= ruleEInt )
                    {
                    // InternalArg.g:2719:5: (lv_timeTrigger_9_0= ruleEInt )
                    // InternalArg.g:2720:6: lv_timeTrigger_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getTimeTriggerEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_80);
                    lv_timeTrigger_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTriggerRule());
                    						}
                    						set(
                    							current,
                    							"timeTrigger",
                    							lv_timeTrigger_9_0,
                    							"arg.Arg.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalArg.g:2738:3: (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChange ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) ) )* otherlv_15= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==78) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalArg.g:2739:4: otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChange ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,78,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getTriggerAccess().getChangesKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_81); 

                    				newLeafNode(otherlv_11, grammarAccess.getTriggerAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalArg.g:2747:4: ( (lv_physicChanges_12_0= rulePhysicChange ) )
                    // InternalArg.g:2748:5: (lv_physicChanges_12_0= rulePhysicChange )
                    {
                    // InternalArg.g:2748:5: (lv_physicChanges_12_0= rulePhysicChange )
                    // InternalArg.g:2749:6: lv_physicChanges_12_0= rulePhysicChange
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getPhysicChangesPhysicChangeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_physicChanges_12_0=rulePhysicChange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTriggerRule());
                    						}
                    						add(
                    							current,
                    							"physicChanges",
                    							lv_physicChanges_12_0,
                    							"arg.Arg.PhysicChange");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArg.g:2766:4: (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==14) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalArg.g:2767:5: otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_81); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getTriggerAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalArg.g:2771:5: ( (lv_physicChanges_14_0= rulePhysicChange ) )
                    	    // InternalArg.g:2772:6: (lv_physicChanges_14_0= rulePhysicChange )
                    	    {
                    	    // InternalArg.g:2772:6: (lv_physicChanges_14_0= rulePhysicChange )
                    	    // InternalArg.g:2773:7: lv_physicChanges_14_0= rulePhysicChange
                    	    {

                    	    							newCompositeNode(grammarAccess.getTriggerAccess().getPhysicChangesPhysicChangeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_physicChanges_14_0=rulePhysicChange();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTriggerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"physicChanges",
                    	    								lv_physicChanges_14_0,
                    	    								"arg.Arg.PhysicChange");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getTriggerAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getTriggerAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleCollision"
    // InternalArg.g:2804:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalArg.g:2804:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalArg.g:2805:2: iv_ruleCollision= ruleCollision EOF
            {
             newCompositeNode(grammarAccess.getCollisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollision=ruleCollision();

            state._fsp--;

             current =iv_ruleCollision; 
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
    // $ANTLR end "entryRuleCollision"


    // $ANTLR start "ruleCollision"
    // InternalArg.g:2811:1: ruleCollision returns [EObject current=null] : (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleCollision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalArg.g:2817:2: ( (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) ) )
            // InternalArg.g:2818:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) )
            {
            // InternalArg.g:2818:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) )
            // InternalArg.g:2819:3: otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCollisionAccess().getElementKeyword_0());
            		
            // InternalArg.g:2823:3: ( ( ruleEString ) )
            // InternalArg.g:2824:4: ( ruleEString )
            {
            // InternalArg.g:2824:4: ( ruleEString )
            // InternalArg.g:2825:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollisionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCollisionAccess().getClassAClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_82);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCollisionAccess().getToKeyword_2());
            		
            // InternalArg.g:2843:3: ( ( ruleEString ) )
            // InternalArg.g:2844:4: ( ruleEString )
            {
            // InternalArg.g:2844:4: ( ruleEString )
            // InternalArg.g:2845:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollisionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCollisionAccess().getClassBClassCrossReference_3_0());
            				
            pushFollow(FOLLOW_72);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getCollisionAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalArg.g:2863:3: ( ( ruleEString ) )
            // InternalArg.g:2864:4: ( ruleEString )
            {
            // InternalArg.g:2864:4: ( ruleEString )
            // InternalArg.g:2865:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollisionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCollisionAccess().getActionTriggerCrossReference_5_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRuleObjInit"
    // InternalArg.g:2883:1: entryRuleObjInit returns [EObject current=null] : iv_ruleObjInit= ruleObjInit EOF ;
    public final EObject entryRuleObjInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjInit = null;


        try {
            // InternalArg.g:2883:48: (iv_ruleObjInit= ruleObjInit EOF )
            // InternalArg.g:2884:2: iv_ruleObjInit= ruleObjInit EOF
            {
             newCompositeNode(grammarAccess.getObjInitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjInit=ruleObjInit();

            state._fsp--;

             current =iv_ruleObjInit; 
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
    // $ANTLR end "entryRuleObjInit"


    // $ANTLR start "ruleObjInit"
    // InternalArg.g:2890:1: ruleObjInit returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '[' ( (lv_posX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_posY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_posZ_7_0= ruleEDouble ) ) otherlv_8= ']' (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attribute_11_0= ruleObjAttribute ) ) (otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) ) )* otherlv_14= '}' )? (otherlv_15= 'rules' otherlv_16= '{' ( (lv_rules_17_0= ruleRule ) ) (otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) ) )* otherlv_20= '}' )? ) ;
    public final EObject ruleObjInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_posX_3_0 = null;

        AntlrDatatypeRuleToken lv_posY_5_0 = null;

        AntlrDatatypeRuleToken lv_posZ_7_0 = null;

        EObject lv_attribute_11_0 = null;

        EObject lv_attribute_13_0 = null;

        EObject lv_rules_17_0 = null;

        EObject lv_rules_19_0 = null;



        	enterRule();

        try {
            // InternalArg.g:2896:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '[' ( (lv_posX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_posY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_posZ_7_0= ruleEDouble ) ) otherlv_8= ']' (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attribute_11_0= ruleObjAttribute ) ) (otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) ) )* otherlv_14= '}' )? (otherlv_15= 'rules' otherlv_16= '{' ( (lv_rules_17_0= ruleRule ) ) (otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) ) )* otherlv_20= '}' )? ) )
            // InternalArg.g:2897:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '[' ( (lv_posX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_posY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_posZ_7_0= ruleEDouble ) ) otherlv_8= ']' (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attribute_11_0= ruleObjAttribute ) ) (otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) ) )* otherlv_14= '}' )? (otherlv_15= 'rules' otherlv_16= '{' ( (lv_rules_17_0= ruleRule ) ) (otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) ) )* otherlv_20= '}' )? )
            {
            // InternalArg.g:2897:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '[' ( (lv_posX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_posY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_posZ_7_0= ruleEDouble ) ) otherlv_8= ']' (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attribute_11_0= ruleObjAttribute ) ) (otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) ) )* otherlv_14= '}' )? (otherlv_15= 'rules' otherlv_16= '{' ( (lv_rules_17_0= ruleRule ) ) (otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) ) )* otherlv_20= '}' )? )
            // InternalArg.g:2898:3: ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '[' ( (lv_posX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_posY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_posZ_7_0= ruleEDouble ) ) otherlv_8= ']' (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attribute_11_0= ruleObjAttribute ) ) (otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) ) )* otherlv_14= '}' )? (otherlv_15= 'rules' otherlv_16= '{' ( (lv_rules_17_0= ruleRule ) ) (otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) ) )* otherlv_20= '}' )?
            {
            // InternalArg.g:2898:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArg.g:2899:4: (lv_name_0_0= ruleEString )
            {
            // InternalArg.g:2899:4: (lv_name_0_0= ruleEString )
            // InternalArg.g:2900:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getObjInitAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjInitRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:2917:3: ( ( ruleEString ) )
            // InternalArg.g:2918:4: ( ruleEString )
            {
            // InternalArg.g:2918:4: ( ruleEString )
            // InternalArg.g:2919:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjInitRule());
            					}
            				

            					newCompositeNode(grammarAccess.getObjInitAccess().getClassClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getObjInitAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalArg.g:2937:3: ( (lv_posX_3_0= ruleEDouble ) )
            // InternalArg.g:2938:4: (lv_posX_3_0= ruleEDouble )
            {
            // InternalArg.g:2938:4: (lv_posX_3_0= ruleEDouble )
            // InternalArg.g:2939:5: lv_posX_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getObjInitAccess().getPosXEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_posX_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjInitRule());
            					}
            					set(
            						current,
            						"posX",
            						lv_posX_3_0,
            						"arg.Arg.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_46); 

            			newLeafNode(otherlv_4, grammarAccess.getObjInitAccess().getCommaKeyword_4());
            		
            // InternalArg.g:2960:3: ( (lv_posY_5_0= ruleEDouble ) )
            // InternalArg.g:2961:4: (lv_posY_5_0= ruleEDouble )
            {
            // InternalArg.g:2961:4: (lv_posY_5_0= ruleEDouble )
            // InternalArg.g:2962:5: lv_posY_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getObjInitAccess().getPosYEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_28);
            lv_posY_5_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjInitRule());
            					}
            					set(
            						current,
            						"posY",
            						lv_posY_5_0,
            						"arg.Arg.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_46); 

            			newLeafNode(otherlv_6, grammarAccess.getObjInitAccess().getCommaKeyword_6());
            		
            // InternalArg.g:2983:3: ( (lv_posZ_7_0= ruleEDouble ) )
            // InternalArg.g:2984:4: (lv_posZ_7_0= ruleEDouble )
            {
            // InternalArg.g:2984:4: (lv_posZ_7_0= ruleEDouble )
            // InternalArg.g:2985:5: lv_posZ_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getObjInitAccess().getPosZEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_29);
            lv_posZ_7_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjInitRule());
            					}
            					set(
            						current,
            						"posZ",
            						lv_posZ_7_0,
            						"arg.Arg.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,33,FOLLOW_83); 

            			newLeafNode(otherlv_8, grammarAccess.getObjInitAccess().getRightSquareBracketKeyword_8());
            		
            // InternalArg.g:3006:3: (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attribute_11_0= ruleObjAttribute ) ) (otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) ) )* otherlv_14= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==80) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalArg.g:3007:4: otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attribute_11_0= ruleObjAttribute ) ) (otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,80,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getObjInitAccess().getAttributesKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getObjInitAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalArg.g:3015:4: ( (lv_attribute_11_0= ruleObjAttribute ) )
                    // InternalArg.g:3016:5: (lv_attribute_11_0= ruleObjAttribute )
                    {
                    // InternalArg.g:3016:5: (lv_attribute_11_0= ruleObjAttribute )
                    // InternalArg.g:3017:6: lv_attribute_11_0= ruleObjAttribute
                    {

                    						newCompositeNode(grammarAccess.getObjInitAccess().getAttributeObjAttributeParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_attribute_11_0=ruleObjAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjInitRule());
                    						}
                    						add(
                    							current,
                    							"attribute",
                    							lv_attribute_11_0,
                    							"arg.Arg.ObjAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArg.g:3034:4: (otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==14) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalArg.g:3035:5: otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getObjInitAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalArg.g:3039:5: ( (lv_attribute_13_0= ruleObjAttribute ) )
                    	    // InternalArg.g:3040:6: (lv_attribute_13_0= ruleObjAttribute )
                    	    {
                    	    // InternalArg.g:3040:6: (lv_attribute_13_0= ruleObjAttribute )
                    	    // InternalArg.g:3041:7: lv_attribute_13_0= ruleObjAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjInitAccess().getAttributeObjAttributeParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_attribute_13_0=ruleObjAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjInitRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attribute",
                    	    								lv_attribute_13_0,
                    	    								"arg.Arg.ObjAttribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_84); 

                    				newLeafNode(otherlv_14, grammarAccess.getObjInitAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalArg.g:3064:3: (otherlv_15= 'rules' otherlv_16= '{' ( (lv_rules_17_0= ruleRule ) ) (otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) ) )* otherlv_20= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==81) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalArg.g:3065:4: otherlv_15= 'rules' otherlv_16= '{' ( (lv_rules_17_0= ruleRule ) ) (otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,81,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getObjInitAccess().getRulesKeyword_10_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_81); 

                    				newLeafNode(otherlv_16, grammarAccess.getObjInitAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalArg.g:3073:4: ( (lv_rules_17_0= ruleRule ) )
                    // InternalArg.g:3074:5: (lv_rules_17_0= ruleRule )
                    {
                    // InternalArg.g:3074:5: (lv_rules_17_0= ruleRule )
                    // InternalArg.g:3075:6: lv_rules_17_0= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getObjInitAccess().getRulesRuleParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_rules_17_0=ruleRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjInitRule());
                    						}
                    						add(
                    							current,
                    							"rules",
                    							lv_rules_17_0,
                    							"arg.Arg.Rule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArg.g:3092:4: (otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==14) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalArg.g:3093:5: otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_81); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getObjInitAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalArg.g:3097:5: ( (lv_rules_19_0= ruleRule ) )
                    	    // InternalArg.g:3098:6: (lv_rules_19_0= ruleRule )
                    	    {
                    	    // InternalArg.g:3098:6: (lv_rules_19_0= ruleRule )
                    	    // InternalArg.g:3099:7: lv_rules_19_0= ruleRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjInitAccess().getRulesRuleParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_rules_19_0=ruleRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjInitRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rules",
                    	    								lv_rules_19_0,
                    	    								"arg.Arg.Rule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getObjInitAccess().getRightCurlyBracketKeyword_10_4());
                    			

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
    // $ANTLR end "ruleObjInit"


    // $ANTLR start "entryRulePhysicChange"
    // InternalArg.g:3126:1: entryRulePhysicChange returns [EObject current=null] : iv_rulePhysicChange= rulePhysicChange EOF ;
    public final EObject entryRulePhysicChange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicChange = null;


        try {
            // InternalArg.g:3126:53: (iv_rulePhysicChange= rulePhysicChange EOF )
            // InternalArg.g:3127:2: iv_rulePhysicChange= rulePhysicChange EOF
            {
             newCompositeNode(grammarAccess.getPhysicChangeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhysicChange=rulePhysicChange();

            state._fsp--;

             current =iv_rulePhysicChange; 
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
    // $ANTLR end "entryRulePhysicChange"


    // $ANTLR start "rulePhysicChange"
    // InternalArg.g:3133:1: rulePhysicChange returns [EObject current=null] : (otherlv_0= 'do' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'in' ( ( ruleEString ) ) otherlv_4= 'named' ( (lv_object_5_0= ruleEString ) ) (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )? (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )? (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )? (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )? (otherlv_14= 'force' ( ( ruleEString ) ) )? ) ;
    public final EObject rulePhysicChange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Enumerator lv_action_1_0 = null;

        AntlrDatatypeRuleToken lv_object_5_0 = null;

        Enumerator lv_position_7_0 = null;

        AntlrDatatypeRuleToken lv_scale_9_0 = null;

        AntlrDatatypeRuleToken lv_attribute_11_0 = null;

        AntlrDatatypeRuleToken lv_changeValue_13_0 = null;



        	enterRule();

        try {
            // InternalArg.g:3139:2: ( (otherlv_0= 'do' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'in' ( ( ruleEString ) ) otherlv_4= 'named' ( (lv_object_5_0= ruleEString ) ) (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )? (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )? (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )? (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )? (otherlv_14= 'force' ( ( ruleEString ) ) )? ) )
            // InternalArg.g:3140:2: (otherlv_0= 'do' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'in' ( ( ruleEString ) ) otherlv_4= 'named' ( (lv_object_5_0= ruleEString ) ) (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )? (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )? (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )? (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )? (otherlv_14= 'force' ( ( ruleEString ) ) )? )
            {
            // InternalArg.g:3140:2: (otherlv_0= 'do' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'in' ( ( ruleEString ) ) otherlv_4= 'named' ( (lv_object_5_0= ruleEString ) ) (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )? (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )? (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )? (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )? (otherlv_14= 'force' ( ( ruleEString ) ) )? )
            // InternalArg.g:3141:3: otherlv_0= 'do' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'in' ( ( ruleEString ) ) otherlv_4= 'named' ( (lv_object_5_0= ruleEString ) ) (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )? (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )? (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )? (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )? (otherlv_14= 'force' ( ( ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,82,FOLLOW_85); 

            			newLeafNode(otherlv_0, grammarAccess.getPhysicChangeAccess().getDoKeyword_0());
            		
            // InternalArg.g:3145:3: ( (lv_action_1_0= ruleAction ) )
            // InternalArg.g:3146:4: (lv_action_1_0= ruleAction )
            {
            // InternalArg.g:3146:4: (lv_action_1_0= ruleAction )
            // InternalArg.g:3147:5: lv_action_1_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getPhysicChangeAccess().getActionActionEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_86);
            lv_action_1_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicChangeRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_1_0,
            						"arg.Arg.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPhysicChangeAccess().getInKeyword_2());
            		
            // InternalArg.g:3168:3: ( ( ruleEString ) )
            // InternalArg.g:3169:4: ( ruleEString )
            {
            // InternalArg.g:3169:4: ( ruleEString )
            // InternalArg.g:3170:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhysicChangeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPhysicChangeAccess().getClassClassCrossReference_3_0());
            				
            pushFollow(FOLLOW_87);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,84,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getPhysicChangeAccess().getNamedKeyword_4());
            		
            // InternalArg.g:3188:3: ( (lv_object_5_0= ruleEString ) )
            // InternalArg.g:3189:4: (lv_object_5_0= ruleEString )
            {
            // InternalArg.g:3189:4: (lv_object_5_0= ruleEString )
            // InternalArg.g:3190:5: lv_object_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPhysicChangeAccess().getObjectEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_88);
            lv_object_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicChangeRule());
            					}
            					set(
            						current,
            						"object",
            						lv_object_5_0,
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:3207:3: (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==85) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalArg.g:3208:4: otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) )
                    {
                    otherlv_6=(Token)match(input,85,FOLLOW_89); 

                    				newLeafNode(otherlv_6, grammarAccess.getPhysicChangeAccess().getWhereKeyword_6_0());
                    			
                    // InternalArg.g:3212:4: ( (lv_position_7_0= rulePosition ) )
                    // InternalArg.g:3213:5: (lv_position_7_0= rulePosition )
                    {
                    // InternalArg.g:3213:5: (lv_position_7_0= rulePosition )
                    // InternalArg.g:3214:6: lv_position_7_0= rulePosition
                    {

                    						newCompositeNode(grammarAccess.getPhysicChangeAccess().getPositionPositionEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_90);
                    lv_position_7_0=rulePosition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhysicChangeRule());
                    						}
                    						set(
                    							current,
                    							"position",
                    							lv_position_7_0,
                    							"arg.Arg.Position");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalArg.g:3232:3: (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==86) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalArg.g:3233:4: otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) )
                    {
                    otherlv_8=(Token)match(input,86,FOLLOW_46); 

                    				newLeafNode(otherlv_8, grammarAccess.getPhysicChangeAccess().getScaleKeyword_7_0());
                    			
                    // InternalArg.g:3237:4: ( (lv_scale_9_0= ruleEDouble ) )
                    // InternalArg.g:3238:5: (lv_scale_9_0= ruleEDouble )
                    {
                    // InternalArg.g:3238:5: (lv_scale_9_0= ruleEDouble )
                    // InternalArg.g:3239:6: lv_scale_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getPhysicChangeAccess().getScaleEDoubleParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_91);
                    lv_scale_9_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhysicChangeRule());
                    						}
                    						set(
                    							current,
                    							"scale",
                    							lv_scale_9_0,
                    							"arg.Arg.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalArg.g:3257:3: (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==87) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalArg.g:3258:4: otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,87,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getPhysicChangeAccess().getStatKeyword_8_0());
                    			
                    // InternalArg.g:3262:4: ( (lv_attribute_11_0= ruleEString ) )
                    // InternalArg.g:3263:5: (lv_attribute_11_0= ruleEString )
                    {
                    // InternalArg.g:3263:5: (lv_attribute_11_0= ruleEString )
                    // InternalArg.g:3264:6: lv_attribute_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPhysicChangeAccess().getAttributeEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_92);
                    lv_attribute_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhysicChangeRule());
                    						}
                    						set(
                    							current,
                    							"attribute",
                    							lv_attribute_11_0,
                    							"arg.Arg.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalArg.g:3282:3: (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==88) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalArg.g:3283:4: otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,88,FOLLOW_27); 

                    				newLeafNode(otherlv_12, grammarAccess.getPhysicChangeAccess().getChangeStatKeyword_9_0());
                    			
                    // InternalArg.g:3287:4: ( (lv_changeValue_13_0= ruleEInt ) )
                    // InternalArg.g:3288:5: (lv_changeValue_13_0= ruleEInt )
                    {
                    // InternalArg.g:3288:5: (lv_changeValue_13_0= ruleEInt )
                    // InternalArg.g:3289:6: lv_changeValue_13_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPhysicChangeAccess().getChangeValueEIntParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_93);
                    lv_changeValue_13_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhysicChangeRule());
                    						}
                    						set(
                    							current,
                    							"changeValue",
                    							lv_changeValue_13_0,
                    							"arg.Arg.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalArg.g:3307:3: (otherlv_14= 'force' ( ( ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==89) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalArg.g:3308:4: otherlv_14= 'force' ( ( ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,89,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getPhysicChangeAccess().getForceKeyword_10_0());
                    			
                    // InternalArg.g:3312:4: ( ( ruleEString ) )
                    // InternalArg.g:3313:5: ( ruleEString )
                    {
                    // InternalArg.g:3313:5: ( ruleEString )
                    // InternalArg.g:3314:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPhysicChangeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPhysicChangeAccess().getForceForceCrossReference_10_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "rulePhysicChange"


    // $ANTLR start "entryRuleObjAttribute"
    // InternalArg.g:3333:1: entryRuleObjAttribute returns [EObject current=null] : iv_ruleObjAttribute= ruleObjAttribute EOF ;
    public final EObject entryRuleObjAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjAttribute = null;


        try {
            // InternalArg.g:3333:53: (iv_ruleObjAttribute= ruleObjAttribute EOF )
            // InternalArg.g:3334:2: iv_ruleObjAttribute= ruleObjAttribute EOF
            {
             newCompositeNode(grammarAccess.getObjAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjAttribute=ruleObjAttribute();

            state._fsp--;

             current =iv_ruleObjAttribute; 
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
    // $ANTLR end "entryRuleObjAttribute"


    // $ANTLR start "ruleObjAttribute"
    // InternalArg.g:3340:1: ruleObjAttribute returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= 'value' ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleObjAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalArg.g:3346:2: ( ( ( ( ruleEString ) ) otherlv_1= 'value' ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalArg.g:3347:2: ( ( ( ruleEString ) ) otherlv_1= 'value' ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalArg.g:3347:2: ( ( ( ruleEString ) ) otherlv_1= 'value' ( (lv_value_2_0= ruleEString ) ) )
            // InternalArg.g:3348:3: ( ( ruleEString ) ) otherlv_1= 'value' ( (lv_value_2_0= ruleEString ) )
            {
            // InternalArg.g:3348:3: ( ( ruleEString ) )
            // InternalArg.g:3349:4: ( ruleEString )
            {
            // InternalArg.g:3349:4: ( ruleEString )
            // InternalArg.g:3350:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getObjAttributeAccess().getAttributeAttributeCrossReference_0_0());
            				
            pushFollow(FOLLOW_94);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getObjAttributeAccess().getValueKeyword_1());
            		
            // InternalArg.g:3368:3: ( (lv_value_2_0= ruleEString ) )
            // InternalArg.g:3369:4: (lv_value_2_0= ruleEString )
            {
            // InternalArg.g:3369:4: (lv_value_2_0= ruleEString )
            // InternalArg.g:3370:5: lv_value_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getObjAttributeAccess().getValueEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjAttributeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"arg.Arg.EString");
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
    // $ANTLR end "ruleObjAttribute"


    // $ANTLR start "entryRuleRule"
    // InternalArg.g:3391:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalArg.g:3391:45: (iv_ruleRule= ruleRule EOF )
            // InternalArg.g:3392:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalArg.g:3398:1: ruleRule returns [EObject current=null] : (otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= 'if(' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalArg.g:3404:2: ( (otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= 'if(' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')' ) )
            // InternalArg.g:3405:2: (otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= 'if(' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')' )
            {
            // InternalArg.g:3405:2: (otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= 'if(' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')' )
            // InternalArg.g:3406:3: otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= 'if(' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getDoKeyword_0());
            		
            // InternalArg.g:3410:3: ( ( ruleEString ) )
            // InternalArg.g:3411:4: ( ruleEString )
            {
            // InternalArg.g:3411:4: ( ruleEString )
            // InternalArg.g:3412:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRuleAccess().getActionTriggerCrossReference_1_0());
            				
            pushFollow(FOLLOW_95);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,91,FOLLOW_96); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getIfKeyword_2());
            		
            // InternalArg.g:3430:3: ( (lv_condition_3_0= ruleCondition ) )
            // InternalArg.g:3431:4: (lv_condition_3_0= ruleCondition )
            {
            // InternalArg.g:3431:4: (lv_condition_3_0= ruleCondition )
            // InternalArg.g:3432:5: lv_condition_3_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_97);
            lv_condition_3_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_3_0,
            						"arg.Arg.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,92,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleNot"
    // InternalArg.g:3457:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalArg.g:3457:44: (iv_ruleNot= ruleNot EOF )
            // InternalArg.g:3458:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
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
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalArg.g:3464:1: ruleNot returns [EObject current=null] : (otherlv_0= '!' ( (lv_left_1_0= ruleCondition ) ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_left_1_0 = null;



        	enterRule();

        try {
            // InternalArg.g:3470:2: ( (otherlv_0= '!' ( (lv_left_1_0= ruleCondition ) ) ) )
            // InternalArg.g:3471:2: (otherlv_0= '!' ( (lv_left_1_0= ruleCondition ) ) )
            {
            // InternalArg.g:3471:2: (otherlv_0= '!' ( (lv_left_1_0= ruleCondition ) ) )
            // InternalArg.g:3472:3: otherlv_0= '!' ( (lv_left_1_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,93,FOLLOW_96); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getExclamationMarkKeyword_0());
            		
            // InternalArg.g:3476:3: ( (lv_left_1_0= ruleCondition ) )
            // InternalArg.g:3477:4: (lv_left_1_0= ruleCondition )
            {
            // InternalArg.g:3477:4: (lv_left_1_0= ruleCondition )
            // InternalArg.g:3478:5: lv_left_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getNotAccess().getLeftConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_left_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"arg.Arg.Condition");
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
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleBinary"
    // InternalArg.g:3499:1: entryRuleBinary returns [EObject current=null] : iv_ruleBinary= ruleBinary EOF ;
    public final EObject entryRuleBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinary = null;


        try {
            // InternalArg.g:3499:47: (iv_ruleBinary= ruleBinary EOF )
            // InternalArg.g:3500:2: iv_ruleBinary= ruleBinary EOF
            {
             newCompositeNode(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinary=ruleBinary();

            state._fsp--;

             current =iv_ruleBinary; 
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
    // $ANTLR end "entryRuleBinary"


    // $ANTLR start "ruleBinary"
    // InternalArg.g:3506:1: ruleBinary returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleCondition ) ) otherlv_2= ')' ( (lv_op_3_0= ruleLogicOps ) ) otherlv_4= '(' ( (lv_right_5_0= ruleCondition ) ) otherlv_6= ')' ) ;
    public final EObject ruleBinary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_left_1_0 = null;

        Enumerator lv_op_3_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalArg.g:3512:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleCondition ) ) otherlv_2= ')' ( (lv_op_3_0= ruleLogicOps ) ) otherlv_4= '(' ( (lv_right_5_0= ruleCondition ) ) otherlv_6= ')' ) )
            // InternalArg.g:3513:2: (otherlv_0= '(' ( (lv_left_1_0= ruleCondition ) ) otherlv_2= ')' ( (lv_op_3_0= ruleLogicOps ) ) otherlv_4= '(' ( (lv_right_5_0= ruleCondition ) ) otherlv_6= ')' )
            {
            // InternalArg.g:3513:2: (otherlv_0= '(' ( (lv_left_1_0= ruleCondition ) ) otherlv_2= ')' ( (lv_op_3_0= ruleLogicOps ) ) otherlv_4= '(' ( (lv_right_5_0= ruleCondition ) ) otherlv_6= ')' )
            // InternalArg.g:3514:3: otherlv_0= '(' ( (lv_left_1_0= ruleCondition ) ) otherlv_2= ')' ( (lv_op_3_0= ruleLogicOps ) ) otherlv_4= '(' ( (lv_right_5_0= ruleCondition ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_96); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryAccess().getLeftParenthesisKeyword_0());
            		
            // InternalArg.g:3518:3: ( (lv_left_1_0= ruleCondition ) )
            // InternalArg.g:3519:4: (lv_left_1_0= ruleCondition )
            {
            // InternalArg.g:3519:4: (lv_left_1_0= ruleCondition )
            // InternalArg.g:3520:5: lv_left_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getLeftConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_97);
            lv_left_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"arg.Arg.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,92,FOLLOW_98); 

            			newLeafNode(otherlv_2, grammarAccess.getBinaryAccess().getRightParenthesisKeyword_2());
            		
            // InternalArg.g:3541:3: ( (lv_op_3_0= ruleLogicOps ) )
            // InternalArg.g:3542:4: (lv_op_3_0= ruleLogicOps )
            {
            // InternalArg.g:3542:4: (lv_op_3_0= ruleLogicOps )
            // InternalArg.g:3543:5: lv_op_3_0= ruleLogicOps
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getOpLogicOpsEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_99);
            lv_op_3_0=ruleLogicOps();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_3_0,
            						"arg.Arg.LogicOps");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,94,FOLLOW_96); 

            			newLeafNode(otherlv_4, grammarAccess.getBinaryAccess().getLeftParenthesisKeyword_4());
            		
            // InternalArg.g:3564:3: ( (lv_right_5_0= ruleCondition ) )
            // InternalArg.g:3565:4: (lv_right_5_0= ruleCondition )
            {
            // InternalArg.g:3565:4: (lv_right_5_0= ruleCondition )
            // InternalArg.g:3566:5: lv_right_5_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getRightConditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_97);
            lv_right_5_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_5_0,
            						"arg.Arg.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,92,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBinaryAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleBinary"


    // $ANTLR start "entryRuleArithmetic"
    // InternalArg.g:3591:1: entryRuleArithmetic returns [EObject current=null] : iv_ruleArithmetic= ruleArithmetic EOF ;
    public final EObject entryRuleArithmetic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmetic = null;


        try {
            // InternalArg.g:3591:51: (iv_ruleArithmetic= ruleArithmetic EOF )
            // InternalArg.g:3592:2: iv_ruleArithmetic= ruleArithmetic EOF
            {
             newCompositeNode(grammarAccess.getArithmeticRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmetic=ruleArithmetic();

            state._fsp--;

             current =iv_ruleArithmetic; 
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
    // $ANTLR end "entryRuleArithmetic"


    // $ANTLR start "ruleArithmetic"
    // InternalArg.g:3598:1: ruleArithmetic returns [EObject current=null] : ( ( (lv_left_0_0= ruleValue ) ) ( (lv_op_1_0= ruleArithmOps ) ) ( (lv_right_2_0= ruleValue ) ) ) ;
    public final EObject ruleArithmetic() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalArg.g:3604:2: ( ( ( (lv_left_0_0= ruleValue ) ) ( (lv_op_1_0= ruleArithmOps ) ) ( (lv_right_2_0= ruleValue ) ) ) )
            // InternalArg.g:3605:2: ( ( (lv_left_0_0= ruleValue ) ) ( (lv_op_1_0= ruleArithmOps ) ) ( (lv_right_2_0= ruleValue ) ) )
            {
            // InternalArg.g:3605:2: ( ( (lv_left_0_0= ruleValue ) ) ( (lv_op_1_0= ruleArithmOps ) ) ( (lv_right_2_0= ruleValue ) ) )
            // InternalArg.g:3606:3: ( (lv_left_0_0= ruleValue ) ) ( (lv_op_1_0= ruleArithmOps ) ) ( (lv_right_2_0= ruleValue ) )
            {
            // InternalArg.g:3606:3: ( (lv_left_0_0= ruleValue ) )
            // InternalArg.g:3607:4: (lv_left_0_0= ruleValue )
            {
            // InternalArg.g:3607:4: (lv_left_0_0= ruleValue )
            // InternalArg.g:3608:5: lv_left_0_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getArithmeticAccess().getLeftValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_100);
            lv_left_0_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArithmeticRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"arg.Arg.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:3625:3: ( (lv_op_1_0= ruleArithmOps ) )
            // InternalArg.g:3626:4: (lv_op_1_0= ruleArithmOps )
            {
            // InternalArg.g:3626:4: (lv_op_1_0= ruleArithmOps )
            // InternalArg.g:3627:5: lv_op_1_0= ruleArithmOps
            {

            					newCompositeNode(grammarAccess.getArithmeticAccess().getOpArithmOpsEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_96);
            lv_op_1_0=ruleArithmOps();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArithmeticRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"arg.Arg.ArithmOps");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:3644:3: ( (lv_right_2_0= ruleValue ) )
            // InternalArg.g:3645:4: (lv_right_2_0= ruleValue )
            {
            // InternalArg.g:3645:4: (lv_right_2_0= ruleValue )
            // InternalArg.g:3646:5: lv_right_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getArithmeticAccess().getRightValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArithmeticRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"arg.Arg.Value");
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
    // $ANTLR end "ruleArithmetic"


    // $ANTLR start "entryRuleAttributeValue"
    // InternalArg.g:3667:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalArg.g:3667:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalArg.g:3668:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
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
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalArg.g:3674:1: ruleAttributeValue returns [EObject current=null] : ( ( (lv_class_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleEString ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_class_0_0 = null;

        AntlrDatatypeRuleToken lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalArg.g:3680:2: ( ( ( (lv_class_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleEString ) ) ) )
            // InternalArg.g:3681:2: ( ( (lv_class_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleEString ) ) )
            {
            // InternalArg.g:3681:2: ( ( (lv_class_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleEString ) ) )
            // InternalArg.g:3682:3: ( (lv_class_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleEString ) )
            {
            // InternalArg.g:3682:3: ( (lv_class_0_0= ruleEString ) )
            // InternalArg.g:3683:4: (lv_class_0_0= ruleEString )
            {
            // InternalArg.g:3683:4: (lv_class_0_0= ruleEString )
            // InternalArg.g:3684:5: lv_class_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeValueAccess().getClassEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_53);
            lv_class_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeValueRule());
            					}
            					set(
            						current,
            						"class",
            						lv_class_0_0,
            						"arg.Arg.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeValueAccess().getFullStopKeyword_1());
            		
            // InternalArg.g:3705:3: ( (lv_attribute_2_0= ruleEString ) )
            // InternalArg.g:3706:4: (lv_attribute_2_0= ruleEString )
            {
            // InternalArg.g:3706:4: (lv_attribute_2_0= ruleEString )
            // InternalArg.g:3707:5: lv_attribute_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeValueAccess().getAttributeEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_attribute_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeValueRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_2_0,
            						"arg.Arg.EString");
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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleConstantValue"
    // InternalArg.g:3728:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // InternalArg.g:3728:54: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalArg.g:3729:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             newCompositeNode(grammarAccess.getConstantValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;

             current =iv_ruleConstantValue; 
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
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // InternalArg.g:3735:1: ruleConstantValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalArg.g:3741:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalArg.g:3742:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalArg.g:3742:2: ( (lv_value_0_0= ruleEString ) )
            // InternalArg.g:3743:3: (lv_value_0_0= ruleEString )
            {
            // InternalArg.g:3743:3: (lv_value_0_0= ruleEString )
            // InternalArg.g:3744:4: lv_value_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getConstantValueAccess().getValueEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getConstantValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"arg.Arg.EString");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleConstantValue"


    // $ANTLR start "entryRuleAllInstances"
    // InternalArg.g:3764:1: entryRuleAllInstances returns [EObject current=null] : iv_ruleAllInstances= ruleAllInstances EOF ;
    public final EObject entryRuleAllInstances() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllInstances = null;


        try {
            // InternalArg.g:3764:53: (iv_ruleAllInstances= ruleAllInstances EOF )
            // InternalArg.g:3765:2: iv_ruleAllInstances= ruleAllInstances EOF
            {
             newCompositeNode(grammarAccess.getAllInstancesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllInstances=ruleAllInstances();

            state._fsp--;

             current =iv_ruleAllInstances; 
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
    // $ANTLR end "entryRuleAllInstances"


    // $ANTLR start "ruleAllInstances"
    // InternalArg.g:3771:1: ruleAllInstances returns [EObject current=null] : (otherlv_0= 'All' ( (lv_type_1_0= ruleEString ) ) ) ;
    public final EObject ruleAllInstances() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalArg.g:3777:2: ( (otherlv_0= 'All' ( (lv_type_1_0= ruleEString ) ) ) )
            // InternalArg.g:3778:2: (otherlv_0= 'All' ( (lv_type_1_0= ruleEString ) ) )
            {
            // InternalArg.g:3778:2: (otherlv_0= 'All' ( (lv_type_1_0= ruleEString ) ) )
            // InternalArg.g:3779:3: otherlv_0= 'All' ( (lv_type_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,95,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAllInstancesAccess().getAllKeyword_0());
            		
            // InternalArg.g:3783:3: ( (lv_type_1_0= ruleEString ) )
            // InternalArg.g:3784:4: (lv_type_1_0= ruleEString )
            {
            // InternalArg.g:3784:4: (lv_type_1_0= ruleEString )
            // InternalArg.g:3785:5: lv_type_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAllInstancesAccess().getTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAllInstancesRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"arg.Arg.EString");
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
    // $ANTLR end "ruleAllInstances"


    // $ANTLR start "rulePlanes"
    // InternalArg.g:3806:1: rulePlanes returns [Enumerator current=null] : ( (enumLiteral_0= 'any' ) | (enumLiteral_1= 'horizontal' ) | (enumLiteral_2= 'vertical' ) ) ;
    public final Enumerator rulePlanes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArg.g:3812:2: ( ( (enumLiteral_0= 'any' ) | (enumLiteral_1= 'horizontal' ) | (enumLiteral_2= 'vertical' ) ) )
            // InternalArg.g:3813:2: ( (enumLiteral_0= 'any' ) | (enumLiteral_1= 'horizontal' ) | (enumLiteral_2= 'vertical' ) )
            {
            // InternalArg.g:3813:2: ( (enumLiteral_0= 'any' ) | (enumLiteral_1= 'horizontal' ) | (enumLiteral_2= 'vertical' ) )
            int alt52=3;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt52=1;
                }
                break;
            case 97:
                {
                alt52=2;
                }
                break;
            case 98:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalArg.g:3814:3: (enumLiteral_0= 'any' )
                    {
                    // InternalArg.g:3814:3: (enumLiteral_0= 'any' )
                    // InternalArg.g:3815:4: enumLiteral_0= 'any'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getPlanesAccess().getAnyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPlanesAccess().getAnyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:3822:3: (enumLiteral_1= 'horizontal' )
                    {
                    // InternalArg.g:3822:3: (enumLiteral_1= 'horizontal' )
                    // InternalArg.g:3823:4: enumLiteral_1= 'horizontal'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getPlanesAccess().getHorizontalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPlanesAccess().getHorizontalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:3830:3: (enumLiteral_2= 'vertical' )
                    {
                    // InternalArg.g:3830:3: (enumLiteral_2= 'vertical' )
                    // InternalArg.g:3831:4: enumLiteral_2= 'vertical'
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getPlanesAccess().getVerticalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPlanesAccess().getVerticalEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "rulePlanes"


    // $ANTLR start "ruleBodyType"
    // InternalArg.g:3841:1: ruleBodyType returns [Enumerator current=null] : ( (enumLiteral_0= 'static' ) | (enumLiteral_1= 'dynamic' ) | (enumLiteral_2= 'kinematic' ) ) ;
    public final Enumerator ruleBodyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArg.g:3847:2: ( ( (enumLiteral_0= 'static' ) | (enumLiteral_1= 'dynamic' ) | (enumLiteral_2= 'kinematic' ) ) )
            // InternalArg.g:3848:2: ( (enumLiteral_0= 'static' ) | (enumLiteral_1= 'dynamic' ) | (enumLiteral_2= 'kinematic' ) )
            {
            // InternalArg.g:3848:2: ( (enumLiteral_0= 'static' ) | (enumLiteral_1= 'dynamic' ) | (enumLiteral_2= 'kinematic' ) )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt53=1;
                }
                break;
            case 100:
                {
                alt53=2;
                }
                break;
            case 101:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalArg.g:3849:3: (enumLiteral_0= 'static' )
                    {
                    // InternalArg.g:3849:3: (enumLiteral_0= 'static' )
                    // InternalArg.g:3850:4: enumLiteral_0= 'static'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getBodyTypeAccess().getStaticEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBodyTypeAccess().getStaticEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:3857:3: (enumLiteral_1= 'dynamic' )
                    {
                    // InternalArg.g:3857:3: (enumLiteral_1= 'dynamic' )
                    // InternalArg.g:3858:4: enumLiteral_1= 'dynamic'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getBodyTypeAccess().getDynamicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBodyTypeAccess().getDynamicEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:3865:3: (enumLiteral_2= 'kinematic' )
                    {
                    // InternalArg.g:3865:3: (enumLiteral_2= 'kinematic' )
                    // InternalArg.g:3866:4: enumLiteral_2= 'kinematic'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getBodyTypeAccess().getKinematicEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBodyTypeAccess().getKinematicEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleBodyType"


    // $ANTLR start "ruleBasicActions"
    // InternalArg.g:3876:1: ruleBasicActions returns [Enumerator current=null] : ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'win' ) | (enumLiteral_2= 'lose' ) | (enumLiteral_3= 'none' ) ) ;
    public final Enumerator ruleBasicActions() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalArg.g:3882:2: ( ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'win' ) | (enumLiteral_2= 'lose' ) | (enumLiteral_3= 'none' ) ) )
            // InternalArg.g:3883:2: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'win' ) | (enumLiteral_2= 'lose' ) | (enumLiteral_3= 'none' ) )
            {
            // InternalArg.g:3883:2: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'win' ) | (enumLiteral_2= 'lose' ) | (enumLiteral_3= 'none' ) )
            int alt54=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt54=1;
                }
                break;
            case 25:
                {
                alt54=2;
                }
                break;
            case 26:
                {
                alt54=3;
                }
                break;
            case 102:
                {
                alt54=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalArg.g:3884:3: (enumLiteral_0= 'start' )
                    {
                    // InternalArg.g:3884:3: (enumLiteral_0= 'start' )
                    // InternalArg.g:3885:4: enumLiteral_0= 'start'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getBasicActionsAccess().getStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBasicActionsAccess().getStartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:3892:3: (enumLiteral_1= 'win' )
                    {
                    // InternalArg.g:3892:3: (enumLiteral_1= 'win' )
                    // InternalArg.g:3893:4: enumLiteral_1= 'win'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getBasicActionsAccess().getWinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBasicActionsAccess().getWinEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:3900:3: (enumLiteral_2= 'lose' )
                    {
                    // InternalArg.g:3900:3: (enumLiteral_2= 'lose' )
                    // InternalArg.g:3901:4: enumLiteral_2= 'lose'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getBasicActionsAccess().getLoseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBasicActionsAccess().getLoseEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalArg.g:3908:3: (enumLiteral_3= 'none' )
                    {
                    // InternalArg.g:3908:3: (enumLiteral_3= 'none' )
                    // InternalArg.g:3909:4: enumLiteral_3= 'none'
                    {
                    enumLiteral_3=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getBasicActionsAccess().getNoneEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBasicActionsAccess().getNoneEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleBasicActions"


    // $ANTLR start "ruleAction"
    // InternalArg.g:3919:1: ruleAction returns [Enumerator current=null] : ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'delete' ) ) ;
    public final Enumerator ruleAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArg.g:3925:2: ( ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'delete' ) ) )
            // InternalArg.g:3926:2: ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'delete' ) )
            {
            // InternalArg.g:3926:2: ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'delete' ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt55=1;
                }
                break;
            case 104:
                {
                alt55=2;
                }
                break;
            case 105:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalArg.g:3927:3: (enumLiteral_0= 'create' )
                    {
                    // InternalArg.g:3927:3: (enumLiteral_0= 'create' )
                    // InternalArg.g:3928:4: enumLiteral_0= 'create'
                    {
                    enumLiteral_0=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getCreateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getCreateEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:3935:3: (enumLiteral_1= 'edit' )
                    {
                    // InternalArg.g:3935:3: (enumLiteral_1= 'edit' )
                    // InternalArg.g:3936:4: enumLiteral_1= 'edit'
                    {
                    enumLiteral_1=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getEditEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getEditEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:3943:3: (enumLiteral_2= 'delete' )
                    {
                    // InternalArg.g:3943:3: (enumLiteral_2= 'delete' )
                    // InternalArg.g:3944:4: enumLiteral_2= 'delete'
                    {
                    enumLiteral_2=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getDeleteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionAccess().getDeleteEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "rulePosition"
    // InternalArg.g:3954:1: rulePosition returns [Enumerator current=null] : ( (enumLiteral_0= 'front' ) | (enumLiteral_1= 'default' ) | (enumLiteral_2= 'back' ) ) ;
    public final Enumerator rulePosition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArg.g:3960:2: ( ( (enumLiteral_0= 'front' ) | (enumLiteral_1= 'default' ) | (enumLiteral_2= 'back' ) ) )
            // InternalArg.g:3961:2: ( (enumLiteral_0= 'front' ) | (enumLiteral_1= 'default' ) | (enumLiteral_2= 'back' ) )
            {
            // InternalArg.g:3961:2: ( (enumLiteral_0= 'front' ) | (enumLiteral_1= 'default' ) | (enumLiteral_2= 'back' ) )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt56=1;
                }
                break;
            case 107:
                {
                alt56=2;
                }
                break;
            case 108:
                {
                alt56=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalArg.g:3962:3: (enumLiteral_0= 'front' )
                    {
                    // InternalArg.g:3962:3: (enumLiteral_0= 'front' )
                    // InternalArg.g:3963:4: enumLiteral_0= 'front'
                    {
                    enumLiteral_0=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getPositionAccess().getFrontEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPositionAccess().getFrontEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:3970:3: (enumLiteral_1= 'default' )
                    {
                    // InternalArg.g:3970:3: (enumLiteral_1= 'default' )
                    // InternalArg.g:3971:4: enumLiteral_1= 'default'
                    {
                    enumLiteral_1=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getPositionAccess().getDefaultEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPositionAccess().getDefaultEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:3978:3: (enumLiteral_2= 'back' )
                    {
                    // InternalArg.g:3978:3: (enumLiteral_2= 'back' )
                    // InternalArg.g:3979:4: enumLiteral_2= 'back'
                    {
                    enumLiteral_2=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getPositionAccess().getBackEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPositionAccess().getBackEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "rulePosition"


    // $ANTLR start "ruleLogicOps"
    // InternalArg.g:3989:1: ruleLogicOps returns [Enumerator current=null] : ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) ;
    public final Enumerator ruleLogicOps() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalArg.g:3995:2: ( ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) )
            // InternalArg.g:3996:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            {
            // InternalArg.g:3996:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==109) ) {
                alt57=1;
            }
            else if ( (LA57_0==110) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalArg.g:3997:3: (enumLiteral_0= '&' )
                    {
                    // InternalArg.g:3997:3: (enumLiteral_0= '&' )
                    // InternalArg.g:3998:4: enumLiteral_0= '&'
                    {
                    enumLiteral_0=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getLogicOpsAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicOpsAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:4005:3: (enumLiteral_1= '|' )
                    {
                    // InternalArg.g:4005:3: (enumLiteral_1= '|' )
                    // InternalArg.g:4006:4: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getLogicOpsAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicOpsAccess().getOrEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleLogicOps"


    // $ANTLR start "ruleArithmOps"
    // InternalArg.g:4016:1: ruleArithmOps returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) ) ;
    public final Enumerator ruleArithmOps() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalArg.g:4022:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) ) )
            // InternalArg.g:4023:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) )
            {
            // InternalArg.g:4023:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) )
            int alt58=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt58=1;
                }
                break;
            case 111:
                {
                alt58=2;
                }
                break;
            case 112:
                {
                alt58=3;
                }
                break;
            case 113:
                {
                alt58=4;
                }
                break;
            case 114:
                {
                alt58=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalArg.g:4024:3: (enumLiteral_0= '=' )
                    {
                    // InternalArg.g:4024:3: (enumLiteral_0= '=' )
                    // InternalArg.g:4025:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getArithmOpsAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getArithmOpsAccess().getEqualEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:4032:3: (enumLiteral_1= '>' )
                    {
                    // InternalArg.g:4032:3: (enumLiteral_1= '>' )
                    // InternalArg.g:4033:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getArithmOpsAccess().getGreaterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getArithmOpsAccess().getGreaterEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:4040:3: (enumLiteral_2= '>=' )
                    {
                    // InternalArg.g:4040:3: (enumLiteral_2= '>=' )
                    // InternalArg.g:4041:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getArithmOpsAccess().getGreaterEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getArithmOpsAccess().getGreaterEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalArg.g:4048:3: (enumLiteral_3= '<' )
                    {
                    // InternalArg.g:4048:3: (enumLiteral_3= '<' )
                    // InternalArg.g:4049:4: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getArithmOpsAccess().getLowerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getArithmOpsAccess().getLowerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalArg.g:4056:3: (enumLiteral_4= '<=' )
                    {
                    // InternalArg.g:4056:3: (enumLiteral_4= '<=' )
                    // InternalArg.g:4057:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getArithmOpsAccess().getLowerEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getArithmOpsAccess().getLowerEqualEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleArithmOps"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000018030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000F0008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000E0008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000C0008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003800000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000700000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0080080000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000008008000L,0x0000000000007800L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000007000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000008008000L,0x0000000000007000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000008008000L,0x0000000000006000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000008000L,0x0000000000006000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000008000L,0x0000000000004000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000038000000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000002L,0x0000000003E00000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x00001C0000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x0000000003C00000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000002L,0x0000000003800000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000030L,0x00000000E0000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000400000000L,0x0007800000000000L});

}