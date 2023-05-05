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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'{'", "'elements'", "','", "'}'", "'dependences'", "'abstract'", "'invisible'", "'Graphic'", "'Physics'", "'Gamelogic'", "'Display'", "'start'", "'win'", "'lose'", "'score'", "'Actions'", "'Collisions'", "'Buttons'", "'Elements'", "':'", "'['", "'..'", "']'", "'='", "'isParam'", "'isKey'", "'readOnly'", "'*'", "'containtment'", "'min'", "'max'", "'target'", "'opposite'", "'-'", "'element'", "'versions'", "'constraints'", "'plane'", "'overlaps'", "'sizeMin'", "'sizeMax'", "'xVariation'", "'yVariation'", "'zVariation'", "'rotation'", "'.'", "'E'", "'e'", "'body'", "'forces'", "'contacts'", "'mass'", "'bodyType'", "'charge'", "'friction'", "'rollingFriction'", "'restitution'", "'damping'", "'angularDamping'", "'collision'", "'contact'", "'gesture'", "'->'", "'goal'", "'lives'", "'action'", "'display'", "'timeEach'", "'changes'", "'to'", "'attributes'", "'rules'", "'do'", "'in'", "'named'", "'where'", "'scale'", "'stat'", "'changeStat'", "'force'", "'value'", "'if('", "')'", "'!'", "'('", "'Number'", "'drag'", "'tilt'", "'touch'", "'any'", "'horizontal'", "'vertical'", "'static'", "'dynamic'", "'kinematic'", "'none'", "'create'", "'edit'", "'delete'", "'front'", "'default'", "'back'", "'&'", "'|'", "'>'", "'>='", "'<'", "'<='"
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
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
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
            case 95:
                {
                alt2=1;
                }
                break;
            case 96:
                {
                alt2=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case 45:
            case 97:
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

                if ( (LA3_1==EOF||LA3_1==35||LA3_1==94||(LA3_1>=116 && LA3_1<=119)) ) {
                    alt3=2;
                }
                else if ( (LA3_1==57) ) {
                    alt3=1;
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

                if ( (LA3_2==EOF||LA3_2==35||LA3_2==94||(LA3_2>=116 && LA3_2<=119)) ) {
                    alt3=2;
                }
                else if ( (LA3_2==57) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 45:
                {
                alt3=2;
                }
                break;
            case 97:
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
    // InternalArg.g:687:1: ruleGame returns [EObject current=null] : (otherlv_0= 'Gamelogic' otherlv_1= '{' otherlv_2= 'Display' otherlv_3= '{' otherlv_4= 'start' ( (lv_start_5_0= ruleEString ) ) otherlv_6= 'win' ( (lv_win_7_0= ruleEString ) ) otherlv_8= 'lose' ( (lv_lose_9_0= ruleEString ) ) otherlv_10= 'score' otherlv_11= '{' ( (lv_score_12_0= ruleScoreSystem ) ) otherlv_13= '}' otherlv_14= '}' (otherlv_15= 'Actions' otherlv_16= '{' ( (lv_actionsTriggers_17_0= ruleTrigger ) ) (otherlv_18= ',' ( (lv_actionsTriggers_19_0= ruleTrigger ) ) )* otherlv_20= '}' )? (otherlv_21= 'Collisions' otherlv_22= '{' ( (lv_collisions_23_0= ruleCollision ) ) (otherlv_24= ',' ( (lv_collisions_25_0= ruleCollision ) ) )* otherlv_26= '}' )? (otherlv_27= 'Buttons' otherlv_28= '{' ( (lv_gamepad_29_0= ruleGamePad ) ) otherlv_30= '}' )? (otherlv_31= 'Elements' otherlv_32= '{' ( (lv_objInit_33_0= ruleObjInit ) ) (otherlv_34= ',' ( (lv_objInit_35_0= ruleObjInit ) ) )* otherlv_36= '}' )? otherlv_37= '}' ) ;
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
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        AntlrDatatypeRuleToken lv_start_5_0 = null;

        AntlrDatatypeRuleToken lv_win_7_0 = null;

        AntlrDatatypeRuleToken lv_lose_9_0 = null;

        EObject lv_score_12_0 = null;

        EObject lv_actionsTriggers_17_0 = null;

        EObject lv_actionsTriggers_19_0 = null;

        EObject lv_collisions_23_0 = null;

        EObject lv_collisions_25_0 = null;

        EObject lv_gamepad_29_0 = null;

        EObject lv_objInit_33_0 = null;

        EObject lv_objInit_35_0 = null;



        	enterRule();

        try {
            // InternalArg.g:693:2: ( (otherlv_0= 'Gamelogic' otherlv_1= '{' otherlv_2= 'Display' otherlv_3= '{' otherlv_4= 'start' ( (lv_start_5_0= ruleEString ) ) otherlv_6= 'win' ( (lv_win_7_0= ruleEString ) ) otherlv_8= 'lose' ( (lv_lose_9_0= ruleEString ) ) otherlv_10= 'score' otherlv_11= '{' ( (lv_score_12_0= ruleScoreSystem ) ) otherlv_13= '}' otherlv_14= '}' (otherlv_15= 'Actions' otherlv_16= '{' ( (lv_actionsTriggers_17_0= ruleTrigger ) ) (otherlv_18= ',' ( (lv_actionsTriggers_19_0= ruleTrigger ) ) )* otherlv_20= '}' )? (otherlv_21= 'Collisions' otherlv_22= '{' ( (lv_collisions_23_0= ruleCollision ) ) (otherlv_24= ',' ( (lv_collisions_25_0= ruleCollision ) ) )* otherlv_26= '}' )? (otherlv_27= 'Buttons' otherlv_28= '{' ( (lv_gamepad_29_0= ruleGamePad ) ) otherlv_30= '}' )? (otherlv_31= 'Elements' otherlv_32= '{' ( (lv_objInit_33_0= ruleObjInit ) ) (otherlv_34= ',' ( (lv_objInit_35_0= ruleObjInit ) ) )* otherlv_36= '}' )? otherlv_37= '}' ) )
            // InternalArg.g:694:2: (otherlv_0= 'Gamelogic' otherlv_1= '{' otherlv_2= 'Display' otherlv_3= '{' otherlv_4= 'start' ( (lv_start_5_0= ruleEString ) ) otherlv_6= 'win' ( (lv_win_7_0= ruleEString ) ) otherlv_8= 'lose' ( (lv_lose_9_0= ruleEString ) ) otherlv_10= 'score' otherlv_11= '{' ( (lv_score_12_0= ruleScoreSystem ) ) otherlv_13= '}' otherlv_14= '}' (otherlv_15= 'Actions' otherlv_16= '{' ( (lv_actionsTriggers_17_0= ruleTrigger ) ) (otherlv_18= ',' ( (lv_actionsTriggers_19_0= ruleTrigger ) ) )* otherlv_20= '}' )? (otherlv_21= 'Collisions' otherlv_22= '{' ( (lv_collisions_23_0= ruleCollision ) ) (otherlv_24= ',' ( (lv_collisions_25_0= ruleCollision ) ) )* otherlv_26= '}' )? (otherlv_27= 'Buttons' otherlv_28= '{' ( (lv_gamepad_29_0= ruleGamePad ) ) otherlv_30= '}' )? (otherlv_31= 'Elements' otherlv_32= '{' ( (lv_objInit_33_0= ruleObjInit ) ) (otherlv_34= ',' ( (lv_objInit_35_0= ruleObjInit ) ) )* otherlv_36= '}' )? otherlv_37= '}' )
            {
            // InternalArg.g:694:2: (otherlv_0= 'Gamelogic' otherlv_1= '{' otherlv_2= 'Display' otherlv_3= '{' otherlv_4= 'start' ( (lv_start_5_0= ruleEString ) ) otherlv_6= 'win' ( (lv_win_7_0= ruleEString ) ) otherlv_8= 'lose' ( (lv_lose_9_0= ruleEString ) ) otherlv_10= 'score' otherlv_11= '{' ( (lv_score_12_0= ruleScoreSystem ) ) otherlv_13= '}' otherlv_14= '}' (otherlv_15= 'Actions' otherlv_16= '{' ( (lv_actionsTriggers_17_0= ruleTrigger ) ) (otherlv_18= ',' ( (lv_actionsTriggers_19_0= ruleTrigger ) ) )* otherlv_20= '}' )? (otherlv_21= 'Collisions' otherlv_22= '{' ( (lv_collisions_23_0= ruleCollision ) ) (otherlv_24= ',' ( (lv_collisions_25_0= ruleCollision ) ) )* otherlv_26= '}' )? (otherlv_27= 'Buttons' otherlv_28= '{' ( (lv_gamepad_29_0= ruleGamePad ) ) otherlv_30= '}' )? (otherlv_31= 'Elements' otherlv_32= '{' ( (lv_objInit_33_0= ruleObjInit ) ) (otherlv_34= ',' ( (lv_objInit_35_0= ruleObjInit ) ) )* otherlv_36= '}' )? otherlv_37= '}' )
            // InternalArg.g:695:3: otherlv_0= 'Gamelogic' otherlv_1= '{' otherlv_2= 'Display' otherlv_3= '{' otherlv_4= 'start' ( (lv_start_5_0= ruleEString ) ) otherlv_6= 'win' ( (lv_win_7_0= ruleEString ) ) otherlv_8= 'lose' ( (lv_lose_9_0= ruleEString ) ) otherlv_10= 'score' otherlv_11= '{' ( (lv_score_12_0= ruleScoreSystem ) ) otherlv_13= '}' otherlv_14= '}' (otherlv_15= 'Actions' otherlv_16= '{' ( (lv_actionsTriggers_17_0= ruleTrigger ) ) (otherlv_18= ',' ( (lv_actionsTriggers_19_0= ruleTrigger ) ) )* otherlv_20= '}' )? (otherlv_21= 'Collisions' otherlv_22= '{' ( (lv_collisions_23_0= ruleCollision ) ) (otherlv_24= ',' ( (lv_collisions_25_0= ruleCollision ) ) )* otherlv_26= '}' )? (otherlv_27= 'Buttons' otherlv_28= '{' ( (lv_gamepad_29_0= ruleGamePad ) ) otherlv_30= '}' )? (otherlv_31= 'Elements' otherlv_32= '{' ( (lv_objInit_33_0= ruleObjInit ) ) (otherlv_34= ',' ( (lv_objInit_35_0= ruleObjInit ) ) )* otherlv_36= '}' )? otherlv_37= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getGamelogicKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getGameAccess().getDisplayKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getGameAccess().getStartKeyword_4());
            		
            // InternalArg.g:715:3: ( (lv_start_5_0= ruleEString ) )
            // InternalArg.g:716:4: (lv_start_5_0= ruleEString )
            {
            // InternalArg.g:716:4: (lv_start_5_0= ruleEString )
            // InternalArg.g:717:5: lv_start_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGameAccess().getStartEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_6=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getGameAccess().getWinKeyword_6());
            		
            // InternalArg.g:738:3: ( (lv_win_7_0= ruleEString ) )
            // InternalArg.g:739:4: (lv_win_7_0= ruleEString )
            {
            // InternalArg.g:739:4: (lv_win_7_0= ruleEString )
            // InternalArg.g:740:5: lv_win_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGameAccess().getWinEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_8=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getGameAccess().getLoseKeyword_8());
            		
            // InternalArg.g:761:3: ( (lv_lose_9_0= ruleEString ) )
            // InternalArg.g:762:4: (lv_lose_9_0= ruleEString )
            {
            // InternalArg.g:762:4: (lv_lose_9_0= ruleEString )
            // InternalArg.g:763:5: lv_lose_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGameAccess().getLoseEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_10=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getGameAccess().getScoreKeyword_10());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_17); 

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

            otherlv_13=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_13, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_14=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_14, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_14());
            		
            // InternalArg.g:815:3: (otherlv_15= 'Actions' otherlv_16= '{' ( (lv_actionsTriggers_17_0= ruleTrigger ) ) (otherlv_18= ',' ( (lv_actionsTriggers_19_0= ruleTrigger ) ) )* otherlv_20= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalArg.g:816:4: otherlv_15= 'Actions' otherlv_16= '{' ( (lv_actionsTriggers_17_0= ruleTrigger ) ) (otherlv_18= ',' ( (lv_actionsTriggers_19_0= ruleTrigger ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getGameAccess().getActionsKeyword_15_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalArg.g:824:4: ( (lv_actionsTriggers_17_0= ruleTrigger ) )
                    // InternalArg.g:825:5: (lv_actionsTriggers_17_0= ruleTrigger )
                    {
                    // InternalArg.g:825:5: (lv_actionsTriggers_17_0= ruleTrigger )
                    // InternalArg.g:826:6: lv_actionsTriggers_17_0= ruleTrigger
                    {

                    						newCompositeNode(grammarAccess.getGameAccess().getActionsTriggersTriggerParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_actionsTriggers_17_0=ruleTrigger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameRule());
                    						}
                    						add(
                    							current,
                    							"actionsTriggers",
                    							lv_actionsTriggers_17_0,
                    							"arg.Arg.Trigger");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArg.g:843:4: (otherlv_18= ',' ( (lv_actionsTriggers_19_0= ruleTrigger ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalArg.g:844:5: otherlv_18= ',' ( (lv_actionsTriggers_19_0= ruleTrigger ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getGameAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalArg.g:848:5: ( (lv_actionsTriggers_19_0= ruleTrigger ) )
                    	    // InternalArg.g:849:6: (lv_actionsTriggers_19_0= ruleTrigger )
                    	    {
                    	    // InternalArg.g:849:6: (lv_actionsTriggers_19_0= ruleTrigger )
                    	    // InternalArg.g:850:7: lv_actionsTriggers_19_0= ruleTrigger
                    	    {

                    	    							newCompositeNode(grammarAccess.getGameAccess().getActionsTriggersTriggerParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_actionsTriggers_19_0=ruleTrigger();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGameRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actionsTriggers",
                    	    								lv_actionsTriggers_19_0,
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

                    otherlv_20=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_20, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            // InternalArg.g:873:3: (otherlv_21= 'Collisions' otherlv_22= '{' ( (lv_collisions_23_0= ruleCollision ) ) (otherlv_24= ',' ( (lv_collisions_25_0= ruleCollision ) ) )* otherlv_26= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalArg.g:874:4: otherlv_21= 'Collisions' otherlv_22= '{' ( (lv_collisions_23_0= ruleCollision ) ) (otherlv_24= ',' ( (lv_collisions_25_0= ruleCollision ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_21, grammarAccess.getGameAccess().getCollisionsKeyword_16_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_22, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalArg.g:882:4: ( (lv_collisions_23_0= ruleCollision ) )
                    // InternalArg.g:883:5: (lv_collisions_23_0= ruleCollision )
                    {
                    // InternalArg.g:883:5: (lv_collisions_23_0= ruleCollision )
                    // InternalArg.g:884:6: lv_collisions_23_0= ruleCollision
                    {

                    						newCompositeNode(grammarAccess.getGameAccess().getCollisionsCollisionParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_collisions_23_0=ruleCollision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameRule());
                    						}
                    						add(
                    							current,
                    							"collisions",
                    							lv_collisions_23_0,
                    							"arg.Arg.Collision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArg.g:901:4: (otherlv_24= ',' ( (lv_collisions_25_0= ruleCollision ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalArg.g:902:5: otherlv_24= ',' ( (lv_collisions_25_0= ruleCollision ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getGameAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalArg.g:906:5: ( (lv_collisions_25_0= ruleCollision ) )
                    	    // InternalArg.g:907:6: (lv_collisions_25_0= ruleCollision )
                    	    {
                    	    // InternalArg.g:907:6: (lv_collisions_25_0= ruleCollision )
                    	    // InternalArg.g:908:7: lv_collisions_25_0= ruleCollision
                    	    {

                    	    							newCompositeNode(grammarAccess.getGameAccess().getCollisionsCollisionParserRuleCall_16_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_collisions_25_0=ruleCollision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGameRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"collisions",
                    	    								lv_collisions_25_0,
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

                    otherlv_26=(Token)match(input,15,FOLLOW_23); 

                    				newLeafNode(otherlv_26, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalArg.g:931:3: (otherlv_27= 'Buttons' otherlv_28= '{' ( (lv_gamepad_29_0= ruleGamePad ) ) otherlv_30= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalArg.g:932:4: otherlv_27= 'Buttons' otherlv_28= '{' ( (lv_gamepad_29_0= ruleGamePad ) ) otherlv_30= '}'
                    {
                    otherlv_27=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_27, grammarAccess.getGameAccess().getButtonsKeyword_17_0());
                    			
                    otherlv_28=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_17_1());
                    			
                    // InternalArg.g:940:4: ( (lv_gamepad_29_0= ruleGamePad ) )
                    // InternalArg.g:941:5: (lv_gamepad_29_0= ruleGamePad )
                    {
                    // InternalArg.g:941:5: (lv_gamepad_29_0= ruleGamePad )
                    // InternalArg.g:942:6: lv_gamepad_29_0= ruleGamePad
                    {

                    						newCompositeNode(grammarAccess.getGameAccess().getGamepadGamePadParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_gamepad_29_0=ruleGamePad();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameRule());
                    						}
                    						add(
                    							current,
                    							"gamepad",
                    							lv_gamepad_29_0,
                    							"arg.Arg.GamePad");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_30=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_30, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_17_3());
                    			

                    }
                    break;

            }

            // InternalArg.g:964:3: (otherlv_31= 'Elements' otherlv_32= '{' ( (lv_objInit_33_0= ruleObjInit ) ) (otherlv_34= ',' ( (lv_objInit_35_0= ruleObjInit ) ) )* otherlv_36= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalArg.g:965:4: otherlv_31= 'Elements' otherlv_32= '{' ( (lv_objInit_33_0= ruleObjInit ) ) (otherlv_34= ',' ( (lv_objInit_35_0= ruleObjInit ) ) )* otherlv_36= '}'
                    {
                    otherlv_31=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_31, grammarAccess.getGameAccess().getElementsKeyword_18_0());
                    			
                    otherlv_32=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_32, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_18_1());
                    			
                    // InternalArg.g:973:4: ( (lv_objInit_33_0= ruleObjInit ) )
                    // InternalArg.g:974:5: (lv_objInit_33_0= ruleObjInit )
                    {
                    // InternalArg.g:974:5: (lv_objInit_33_0= ruleObjInit )
                    // InternalArg.g:975:6: lv_objInit_33_0= ruleObjInit
                    {

                    						newCompositeNode(grammarAccess.getGameAccess().getObjInitObjInitParserRuleCall_18_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_objInit_33_0=ruleObjInit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameRule());
                    						}
                    						add(
                    							current,
                    							"objInit",
                    							lv_objInit_33_0,
                    							"arg.Arg.ObjInit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArg.g:992:4: (otherlv_34= ',' ( (lv_objInit_35_0= ruleObjInit ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalArg.g:993:5: otherlv_34= ',' ( (lv_objInit_35_0= ruleObjInit ) )
                    	    {
                    	    otherlv_34=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_34, grammarAccess.getGameAccess().getCommaKeyword_18_3_0());
                    	    				
                    	    // InternalArg.g:997:5: ( (lv_objInit_35_0= ruleObjInit ) )
                    	    // InternalArg.g:998:6: (lv_objInit_35_0= ruleObjInit )
                    	    {
                    	    // InternalArg.g:998:6: (lv_objInit_35_0= ruleObjInit )
                    	    // InternalArg.g:999:7: lv_objInit_35_0= ruleObjInit
                    	    {

                    	    							newCompositeNode(grammarAccess.getGameAccess().getObjInitObjInitParserRuleCall_18_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_objInit_35_0=ruleObjInit();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGameRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"objInit",
                    	    								lv_objInit_35_0,
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

                    otherlv_36=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_36, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_18_4());
                    			

                    }
                    break;

            }

            otherlv_37=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_37, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_19());
            		

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
    // InternalArg.g:1030:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalArg.g:1030:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalArg.g:1031:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalArg.g:1037:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_max_6_0= ruleAttributeMax ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleConstant ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )? ) ;
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
            // InternalArg.g:1043:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_max_6_0= ruleAttributeMax ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleConstant ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )? ) )
            // InternalArg.g:1044:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_max_6_0= ruleAttributeMax ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleConstant ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )? )
            {
            // InternalArg.g:1044:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_max_6_0= ruleAttributeMax ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleConstant ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )? )
            // InternalArg.g:1045:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_max_6_0= ruleAttributeMax ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleConstant ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )?
            {
            // InternalArg.g:1045:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArg.g:1046:4: (lv_name_0_0= ruleEString )
            {
            // InternalArg.g:1046:4: (lv_name_0_0= ruleEString )
            // InternalArg.g:1047:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalArg.g:1068:3: ( (lv_type_2_0= ruleEString ) )
            // InternalArg.g:1069:4: (lv_type_2_0= ruleEString )
            {
            // InternalArg.g:1069:4: (lv_type_2_0= ruleEString )
            // InternalArg.g:1070:5: lv_type_2_0= ruleEString
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
            		
            // InternalArg.g:1091:3: ( (lv_min_4_0= ruleEInt ) )
            // InternalArg.g:1092:4: (lv_min_4_0= ruleEInt )
            {
            // InternalArg.g:1092:4: (lv_min_4_0= ruleEInt )
            // InternalArg.g:1093:5: lv_min_4_0= ruleEInt
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

            otherlv_5=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_5());
            		
            // InternalArg.g:1114:3: ( (lv_max_6_0= ruleAttributeMax ) )
            // InternalArg.g:1115:4: (lv_max_6_0= ruleAttributeMax )
            {
            // InternalArg.g:1115:4: (lv_max_6_0= ruleAttributeMax )
            // InternalArg.g:1116:5: lv_max_6_0= ruleAttributeMax
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getMaxAttributeMaxParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_30);
            lv_max_6_0=ruleAttributeMax();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"max",
            						lv_max_6_0,
            						"arg.Arg.AttributeMax");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,34,FOLLOW_31); 

            			newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getEqualsSignKeyword_8());
            		
            // InternalArg.g:1141:3: ( (lv_default_9_0= ruleConstant ) )
            // InternalArg.g:1142:4: (lv_default_9_0= ruleConstant )
            {
            // InternalArg.g:1142:4: (lv_default_9_0= ruleConstant )
            // InternalArg.g:1143:5: lv_default_9_0= ruleConstant
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getDefaultConstantParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_33);
            lv_default_9_0=ruleConstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"default",
            						lv_default_9_0,
            						"arg.Arg.Constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:1160:3: ( (lv_isParam_10_0= 'isParam' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalArg.g:1161:4: (lv_isParam_10_0= 'isParam' )
                    {
                    // InternalArg.g:1161:4: (lv_isParam_10_0= 'isParam' )
                    // InternalArg.g:1162:5: lv_isParam_10_0= 'isParam'
                    {
                    lv_isParam_10_0=(Token)match(input,36,FOLLOW_34); 

                    					newLeafNode(lv_isParam_10_0, grammarAccess.getAttributeAccess().getIsParamIsParamKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isParam", lv_isParam_10_0 != null, "isParam");
                    				

                    }


                    }
                    break;

            }

            // InternalArg.g:1174:3: ( (lv_isKey_11_0= 'isKey' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalArg.g:1175:4: (lv_isKey_11_0= 'isKey' )
                    {
                    // InternalArg.g:1175:4: (lv_isKey_11_0= 'isKey' )
                    // InternalArg.g:1176:5: lv_isKey_11_0= 'isKey'
                    {
                    lv_isKey_11_0=(Token)match(input,37,FOLLOW_35); 

                    					newLeafNode(lv_isKey_11_0, grammarAccess.getAttributeAccess().getIsKeyIsKeyKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isKey", lv_isKey_11_0 != null, "isKey");
                    				

                    }


                    }
                    break;

            }

            // InternalArg.g:1188:3: ( (lv_readOnly_12_0= 'readOnly' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalArg.g:1189:4: (lv_readOnly_12_0= 'readOnly' )
                    {
                    // InternalArg.g:1189:4: (lv_readOnly_12_0= 'readOnly' )
                    // InternalArg.g:1190:5: lv_readOnly_12_0= 'readOnly'
                    {
                    lv_readOnly_12_0=(Token)match(input,38,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAttributeMax"
    // InternalArg.g:1206:1: entryRuleAttributeMax returns [String current=null] : iv_ruleAttributeMax= ruleAttributeMax EOF ;
    public final String entryRuleAttributeMax() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeMax = null;


        try {
            // InternalArg.g:1206:52: (iv_ruleAttributeMax= ruleAttributeMax EOF )
            // InternalArg.g:1207:2: iv_ruleAttributeMax= ruleAttributeMax EOF
            {
             newCompositeNode(grammarAccess.getAttributeMaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeMax=ruleAttributeMax();

            state._fsp--;

             current =iv_ruleAttributeMax.getText(); 
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
    // $ANTLR end "entryRuleAttributeMax"


    // $ANTLR start "ruleAttributeMax"
    // InternalArg.g:1213:1: ruleAttributeMax returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleAttributeMax() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalArg.g:1219:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalArg.g:1220:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalArg.g:1220:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_INT) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalArg.g:1221:3: kw= '*'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeMaxAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalArg.g:1227:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getAttributeMaxAccess().getINTTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleAttributeMax"


    // $ANTLR start "entryRuleReference"
    // InternalArg.g:1238:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalArg.g:1238:50: (iv_ruleReference= ruleReference EOF )
            // InternalArg.g:1239:2: iv_ruleReference= ruleReference EOF
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
    // InternalArg.g:1245:1: ruleReference returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )? otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )? ) ;
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
            // InternalArg.g:1251:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )? otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )? ) )
            // InternalArg.g:1252:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )? otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )? )
            {
            // InternalArg.g:1252:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )? otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )? )
            // InternalArg.g:1253:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )? otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )?
            {
            // InternalArg.g:1253:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArg.g:1254:4: (lv_name_0_0= ruleEString )
            {
            // InternalArg.g:1254:4: (lv_name_0_0= ruleEString )
            // InternalArg.g:1255:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalArg.g:1272:3: (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalArg.g:1273:4: otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getContaintmentKeyword_1_0());
                    			
                    // InternalArg.g:1277:4: ( (lv_containtment_2_0= ruleEString ) )
                    // InternalArg.g:1278:5: (lv_containtment_2_0= ruleEString )
                    {
                    // InternalArg.g:1278:5: (lv_containtment_2_0= ruleEString )
                    // InternalArg.g:1279:6: lv_containtment_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getContaintmentEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_37);
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

            otherlv_3=(Token)match(input,41,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getMinKeyword_2());
            		
            // InternalArg.g:1301:3: ( (lv_min_4_0= ruleEInt ) )
            // InternalArg.g:1302:4: (lv_min_4_0= ruleEInt )
            {
            // InternalArg.g:1302:4: (lv_min_4_0= ruleEInt )
            // InternalArg.g:1303:5: lv_min_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getMinEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_38);
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

            otherlv_5=(Token)match(input,42,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getMaxKeyword_4());
            		
            // InternalArg.g:1324:3: ( (lv_max_6_0= ruleEInt ) )
            // InternalArg.g:1325:4: (lv_max_6_0= ruleEInt )
            {
            // InternalArg.g:1325:4: (lv_max_6_0= ruleEInt )
            // InternalArg.g:1326:5: lv_max_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getMaxEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_39);
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

            otherlv_7=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getReferenceAccess().getTargetKeyword_6());
            		
            // InternalArg.g:1347:3: ( (lv_target_8_0= ruleEString ) )
            // InternalArg.g:1348:4: (lv_target_8_0= ruleEString )
            {
            // InternalArg.g:1348:4: (lv_target_8_0= ruleEString )
            // InternalArg.g:1349:5: lv_target_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getTargetEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalArg.g:1366:3: (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalArg.g:1367:4: otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getReferenceAccess().getOppositeKeyword_8_0());
                    			
                    // InternalArg.g:1371:4: ( (lv_opposite_10_0= ruleEString ) )
                    // InternalArg.g:1372:5: (lv_opposite_10_0= ruleEString )
                    {
                    // InternalArg.g:1372:5: (lv_opposite_10_0= ruleEString )
                    // InternalArg.g:1373:6: lv_opposite_10_0= ruleEString
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
    // InternalArg.g:1395:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalArg.g:1395:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalArg.g:1396:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalArg.g:1402:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalArg.g:1408:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalArg.g:1409:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalArg.g:1409:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalArg.g:1410:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalArg.g:1410:3: (kw= '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalArg.g:1411:4: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_41); 

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
    // InternalArg.g:1428:1: entryRuleGraphicClass returns [EObject current=null] : iv_ruleGraphicClass= ruleGraphicClass EOF ;
    public final EObject entryRuleGraphicClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicClass = null;


        try {
            // InternalArg.g:1428:53: (iv_ruleGraphicClass= ruleGraphicClass EOF )
            // InternalArg.g:1429:2: iv_ruleGraphicClass= ruleGraphicClass EOF
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
    // InternalArg.g:1435:1: ruleGraphicClass returns [EObject current=null] : (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'versions' otherlv_3= '{' ( (lv_versions_4_0= ruleVersions ) ) ( (lv_versions_5_0= ruleVersions ) )* otherlv_6= '}' otherlv_7= 'constraints' otherlv_8= '{' ( (lv_constraints_9_0= ruleConstraints ) ) otherlv_10= '}' ) ;
    public final EObject ruleGraphicClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_versions_4_0 = null;

        EObject lv_versions_5_0 = null;

        EObject lv_constraints_9_0 = null;



        	enterRule();

        try {
            // InternalArg.g:1441:2: ( (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'versions' otherlv_3= '{' ( (lv_versions_4_0= ruleVersions ) ) ( (lv_versions_5_0= ruleVersions ) )* otherlv_6= '}' otherlv_7= 'constraints' otherlv_8= '{' ( (lv_constraints_9_0= ruleConstraints ) ) otherlv_10= '}' ) )
            // InternalArg.g:1442:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'versions' otherlv_3= '{' ( (lv_versions_4_0= ruleVersions ) ) ( (lv_versions_5_0= ruleVersions ) )* otherlv_6= '}' otherlv_7= 'constraints' otherlv_8= '{' ( (lv_constraints_9_0= ruleConstraints ) ) otherlv_10= '}' )
            {
            // InternalArg.g:1442:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'versions' otherlv_3= '{' ( (lv_versions_4_0= ruleVersions ) ) ( (lv_versions_5_0= ruleVersions ) )* otherlv_6= '}' otherlv_7= 'constraints' otherlv_8= '{' ( (lv_constraints_9_0= ruleConstraints ) ) otherlv_10= '}' )
            // InternalArg.g:1443:3: otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'versions' otherlv_3= '{' ( (lv_versions_4_0= ruleVersions ) ) ( (lv_versions_5_0= ruleVersions ) )* otherlv_6= '}' otherlv_7= 'constraints' otherlv_8= '{' ( (lv_constraints_9_0= ruleConstraints ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicClassAccess().getElementKeyword_0());
            		
            // InternalArg.g:1447:3: ( ( ruleEString ) )
            // InternalArg.g:1448:4: ( ruleEString )
            {
            // InternalArg.g:1448:4: ( ruleEString )
            // InternalArg.g:1449:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphicClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGraphicClassAccess().getOntoClassClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_42);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphicClassAccess().getVersionsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphicClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalArg.g:1471:3: ( (lv_versions_4_0= ruleVersions ) )
            // InternalArg.g:1472:4: (lv_versions_4_0= ruleVersions )
            {
            // InternalArg.g:1472:4: (lv_versions_4_0= ruleVersions )
            // InternalArg.g:1473:5: lv_versions_4_0= ruleVersions
            {

            					newCompositeNode(grammarAccess.getGraphicClassAccess().getVersionsVersionsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalArg.g:1490:3: ( (lv_versions_5_0= ruleVersions ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalArg.g:1491:4: (lv_versions_5_0= ruleVersions )
            	    {
            	    // InternalArg.g:1491:4: (lv_versions_5_0= ruleVersions )
            	    // InternalArg.g:1492:5: lv_versions_5_0= ruleVersions
            	    {

            	    					newCompositeNode(grammarAccess.getGraphicClassAccess().getVersionsVersionsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_versions_5_0=ruleVersions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGraphicClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"versions",
            	    						lv_versions_5_0,
            	    						"arg.Arg.Versions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_44); 

            			newLeafNode(otherlv_6, grammarAccess.getGraphicClassAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getGraphicClassAccess().getConstraintsKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_8, grammarAccess.getGraphicClassAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalArg.g:1521:3: ( (lv_constraints_9_0= ruleConstraints ) )
            // InternalArg.g:1522:4: (lv_constraints_9_0= ruleConstraints )
            {
            // InternalArg.g:1522:4: (lv_constraints_9_0= ruleConstraints )
            // InternalArg.g:1523:5: lv_constraints_9_0= ruleConstraints
            {

            					newCompositeNode(grammarAccess.getGraphicClassAccess().getConstraintsConstraintsParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_7);
            lv_constraints_9_0=ruleConstraints();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicClassRule());
            					}
            					set(
            						current,
            						"constraints",
            						lv_constraints_9_0,
            						"arg.Arg.Constraints");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getGraphicClassAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalArg.g:1548:1: entryRuleConstraints returns [EObject current=null] : iv_ruleConstraints= ruleConstraints EOF ;
    public final EObject entryRuleConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraints = null;


        try {
            // InternalArg.g:1548:52: (iv_ruleConstraints= ruleConstraints EOF )
            // InternalArg.g:1549:2: iv_ruleConstraints= ruleConstraints EOF
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
    // InternalArg.g:1555:1: ruleConstraints returns [EObject current=null] : (otherlv_0= 'plane' ( (lv_planes_1_0= rulePlanes ) ) ( (lv_overlapping_2_0= 'overlaps' ) ) otherlv_3= 'sizeMin' ( (lv_sizeMin_4_0= ruleEDouble ) ) otherlv_5= 'sizeMax' ( (lv_sizeMax_6_0= ruleEDouble ) ) otherlv_7= 'xVariation' ( (lv_xToOriginPos_8_0= ruleEDouble ) ) otherlv_9= 'yVariation' ( (lv_yToOriginPos_10_0= ruleEDouble ) ) otherlv_11= 'zVariation' ( (lv_zToOriginPos_12_0= ruleEDouble ) ) otherlv_13= 'rotation' ( (lv_rotation_14_0= ruleEInt ) ) ) ;
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
            // InternalArg.g:1561:2: ( (otherlv_0= 'plane' ( (lv_planes_1_0= rulePlanes ) ) ( (lv_overlapping_2_0= 'overlaps' ) ) otherlv_3= 'sizeMin' ( (lv_sizeMin_4_0= ruleEDouble ) ) otherlv_5= 'sizeMax' ( (lv_sizeMax_6_0= ruleEDouble ) ) otherlv_7= 'xVariation' ( (lv_xToOriginPos_8_0= ruleEDouble ) ) otherlv_9= 'yVariation' ( (lv_yToOriginPos_10_0= ruleEDouble ) ) otherlv_11= 'zVariation' ( (lv_zToOriginPos_12_0= ruleEDouble ) ) otherlv_13= 'rotation' ( (lv_rotation_14_0= ruleEInt ) ) ) )
            // InternalArg.g:1562:2: (otherlv_0= 'plane' ( (lv_planes_1_0= rulePlanes ) ) ( (lv_overlapping_2_0= 'overlaps' ) ) otherlv_3= 'sizeMin' ( (lv_sizeMin_4_0= ruleEDouble ) ) otherlv_5= 'sizeMax' ( (lv_sizeMax_6_0= ruleEDouble ) ) otherlv_7= 'xVariation' ( (lv_xToOriginPos_8_0= ruleEDouble ) ) otherlv_9= 'yVariation' ( (lv_yToOriginPos_10_0= ruleEDouble ) ) otherlv_11= 'zVariation' ( (lv_zToOriginPos_12_0= ruleEDouble ) ) otherlv_13= 'rotation' ( (lv_rotation_14_0= ruleEInt ) ) )
            {
            // InternalArg.g:1562:2: (otherlv_0= 'plane' ( (lv_planes_1_0= rulePlanes ) ) ( (lv_overlapping_2_0= 'overlaps' ) ) otherlv_3= 'sizeMin' ( (lv_sizeMin_4_0= ruleEDouble ) ) otherlv_5= 'sizeMax' ( (lv_sizeMax_6_0= ruleEDouble ) ) otherlv_7= 'xVariation' ( (lv_xToOriginPos_8_0= ruleEDouble ) ) otherlv_9= 'yVariation' ( (lv_yToOriginPos_10_0= ruleEDouble ) ) otherlv_11= 'zVariation' ( (lv_zToOriginPos_12_0= ruleEDouble ) ) otherlv_13= 'rotation' ( (lv_rotation_14_0= ruleEInt ) ) )
            // InternalArg.g:1563:3: otherlv_0= 'plane' ( (lv_planes_1_0= rulePlanes ) ) ( (lv_overlapping_2_0= 'overlaps' ) ) otherlv_3= 'sizeMin' ( (lv_sizeMin_4_0= ruleEDouble ) ) otherlv_5= 'sizeMax' ( (lv_sizeMax_6_0= ruleEDouble ) ) otherlv_7= 'xVariation' ( (lv_xToOriginPos_8_0= ruleEDouble ) ) otherlv_9= 'yVariation' ( (lv_yToOriginPos_10_0= ruleEDouble ) ) otherlv_11= 'zVariation' ( (lv_zToOriginPos_12_0= ruleEDouble ) ) otherlv_13= 'rotation' ( (lv_rotation_14_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintsAccess().getPlaneKeyword_0());
            		
            // InternalArg.g:1567:3: ( (lv_planes_1_0= rulePlanes ) )
            // InternalArg.g:1568:4: (lv_planes_1_0= rulePlanes )
            {
            // InternalArg.g:1568:4: (lv_planes_1_0= rulePlanes )
            // InternalArg.g:1569:5: lv_planes_1_0= rulePlanes
            {

            					newCompositeNode(grammarAccess.getConstraintsAccess().getPlanesPlanesEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
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

            // InternalArg.g:1586:3: ( (lv_overlapping_2_0= 'overlaps' ) )
            // InternalArg.g:1587:4: (lv_overlapping_2_0= 'overlaps' )
            {
            // InternalArg.g:1587:4: (lv_overlapping_2_0= 'overlaps' )
            // InternalArg.g:1588:5: lv_overlapping_2_0= 'overlaps'
            {
            lv_overlapping_2_0=(Token)match(input,50,FOLLOW_48); 

            					newLeafNode(lv_overlapping_2_0, grammarAccess.getConstraintsAccess().getOverlappingOverlapsKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintsRule());
            					}
            					setWithLastConsumed(current, "overlapping", lv_overlapping_2_0 != null, "overlaps");
            				

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintsAccess().getSizeMinKeyword_3());
            		
            // InternalArg.g:1604:3: ( (lv_sizeMin_4_0= ruleEDouble ) )
            // InternalArg.g:1605:4: (lv_sizeMin_4_0= ruleEDouble )
            {
            // InternalArg.g:1605:4: (lv_sizeMin_4_0= ruleEDouble )
            // InternalArg.g:1606:5: lv_sizeMin_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getConstraintsAccess().getSizeMinEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_50);
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

            otherlv_5=(Token)match(input,52,FOLLOW_49); 

            			newLeafNode(otherlv_5, grammarAccess.getConstraintsAccess().getSizeMaxKeyword_5());
            		
            // InternalArg.g:1627:3: ( (lv_sizeMax_6_0= ruleEDouble ) )
            // InternalArg.g:1628:4: (lv_sizeMax_6_0= ruleEDouble )
            {
            // InternalArg.g:1628:4: (lv_sizeMax_6_0= ruleEDouble )
            // InternalArg.g:1629:5: lv_sizeMax_6_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getConstraintsAccess().getSizeMaxEDoubleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_51);
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

            otherlv_7=(Token)match(input,53,FOLLOW_49); 

            			newLeafNode(otherlv_7, grammarAccess.getConstraintsAccess().getXVariationKeyword_7());
            		
            // InternalArg.g:1650:3: ( (lv_xToOriginPos_8_0= ruleEDouble ) )
            // InternalArg.g:1651:4: (lv_xToOriginPos_8_0= ruleEDouble )
            {
            // InternalArg.g:1651:4: (lv_xToOriginPos_8_0= ruleEDouble )
            // InternalArg.g:1652:5: lv_xToOriginPos_8_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getConstraintsAccess().getXToOriginPosEDoubleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_52);
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

            otherlv_9=(Token)match(input,54,FOLLOW_49); 

            			newLeafNode(otherlv_9, grammarAccess.getConstraintsAccess().getYVariationKeyword_9());
            		
            // InternalArg.g:1673:3: ( (lv_yToOriginPos_10_0= ruleEDouble ) )
            // InternalArg.g:1674:4: (lv_yToOriginPos_10_0= ruleEDouble )
            {
            // InternalArg.g:1674:4: (lv_yToOriginPos_10_0= ruleEDouble )
            // InternalArg.g:1675:5: lv_yToOriginPos_10_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getConstraintsAccess().getYToOriginPosEDoubleParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_53);
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

            otherlv_11=(Token)match(input,55,FOLLOW_49); 

            			newLeafNode(otherlv_11, grammarAccess.getConstraintsAccess().getZVariationKeyword_11());
            		
            // InternalArg.g:1696:3: ( (lv_zToOriginPos_12_0= ruleEDouble ) )
            // InternalArg.g:1697:4: (lv_zToOriginPos_12_0= ruleEDouble )
            {
            // InternalArg.g:1697:4: (lv_zToOriginPos_12_0= ruleEDouble )
            // InternalArg.g:1698:5: lv_zToOriginPos_12_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getConstraintsAccess().getZToOriginPosEDoubleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_54);
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

            otherlv_13=(Token)match(input,56,FOLLOW_27); 

            			newLeafNode(otherlv_13, grammarAccess.getConstraintsAccess().getRotationKeyword_13());
            		
            // InternalArg.g:1719:3: ( (lv_rotation_14_0= ruleEInt ) )
            // InternalArg.g:1720:4: (lv_rotation_14_0= ruleEInt )
            {
            // InternalArg.g:1720:4: (lv_rotation_14_0= ruleEInt )
            // InternalArg.g:1721:5: lv_rotation_14_0= ruleEInt
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
    // InternalArg.g:1742:1: entryRuleVersions returns [EObject current=null] : iv_ruleVersions= ruleVersions EOF ;
    public final EObject entryRuleVersions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersions = null;


        try {
            // InternalArg.g:1742:49: (iv_ruleVersions= ruleVersions EOF )
            // InternalArg.g:1743:2: iv_ruleVersions= ruleVersions EOF
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
    // InternalArg.g:1749:1: ruleVersions returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_URL_2_0= ruleEString ) ) ) ;
    public final EObject ruleVersions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_URL_2_0 = null;



        	enterRule();

        try {
            // InternalArg.g:1755:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_URL_2_0= ruleEString ) ) ) )
            // InternalArg.g:1756:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_URL_2_0= ruleEString ) ) )
            {
            // InternalArg.g:1756:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_URL_2_0= ruleEString ) ) )
            // InternalArg.g:1757:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_URL_2_0= ruleEString ) )
            {
            // InternalArg.g:1757:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArg.g:1758:4: (lv_name_0_0= ruleEString )
            {
            // InternalArg.g:1758:4: (lv_name_0_0= ruleEString )
            // InternalArg.g:1759:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVersionsAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionsAccess().getEqualsSignKeyword_1());
            		
            // InternalArg.g:1780:3: ( (lv_URL_2_0= ruleEString ) )
            // InternalArg.g:1781:4: (lv_URL_2_0= ruleEString )
            {
            // InternalArg.g:1781:4: (lv_URL_2_0= ruleEString )
            // InternalArg.g:1782:5: lv_URL_2_0= ruleEString
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
    // InternalArg.g:1803:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalArg.g:1803:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalArg.g:1804:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalArg.g:1810:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalArg.g:1816:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalArg.g:1817:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalArg.g:1817:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalArg.g:1818:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalArg.g:1818:3: (kw= '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalArg.g:1819:4: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_55); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalArg.g:1825:3: (this_INT_1= RULE_INT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalArg.g:1826:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_56); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,57,FOLLOW_41); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_57); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalArg.g:1846:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=58 && LA32_0<=59)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalArg.g:1847:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalArg.g:1847:4: (kw= 'E' | kw= 'e' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==58) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==59) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalArg.g:1848:5: kw= 'E'
                            {
                            kw=(Token)match(input,58,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalArg.g:1854:5: kw= 'e'
                            {
                            kw=(Token)match(input,59,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalArg.g:1860:4: (kw= '-' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==45) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalArg.g:1861:5: kw= '-'
                            {
                            kw=(Token)match(input,45,FOLLOW_41); 

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
    // InternalArg.g:1879:1: entryRulePhysicClass returns [EObject current=null] : iv_rulePhysicClass= rulePhysicClass EOF ;
    public final EObject entryRulePhysicClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicClass = null;


        try {
            // InternalArg.g:1879:52: (iv_rulePhysicClass= rulePhysicClass EOF )
            // InternalArg.g:1880:2: iv_rulePhysicClass= rulePhysicClass EOF
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
    // InternalArg.g:1886:1: rulePhysicClass returns [EObject current=null] : (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'body' otherlv_3= '{' ( (lv_physicBody_4_0= rulePhysicBody ) ) otherlv_5= '}' (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForce ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) ) )* otherlv_11= '}' )? (otherlv_12= 'contacts' otherlv_13= '{' ( (lv_bitMasks_14_0= ruleBitMasks ) ) otherlv_15= '}' )? ) ;
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
            // InternalArg.g:1892:2: ( (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'body' otherlv_3= '{' ( (lv_physicBody_4_0= rulePhysicBody ) ) otherlv_5= '}' (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForce ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) ) )* otherlv_11= '}' )? (otherlv_12= 'contacts' otherlv_13= '{' ( (lv_bitMasks_14_0= ruleBitMasks ) ) otherlv_15= '}' )? ) )
            // InternalArg.g:1893:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'body' otherlv_3= '{' ( (lv_physicBody_4_0= rulePhysicBody ) ) otherlv_5= '}' (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForce ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) ) )* otherlv_11= '}' )? (otherlv_12= 'contacts' otherlv_13= '{' ( (lv_bitMasks_14_0= ruleBitMasks ) ) otherlv_15= '}' )? )
            {
            // InternalArg.g:1893:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'body' otherlv_3= '{' ( (lv_physicBody_4_0= rulePhysicBody ) ) otherlv_5= '}' (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForce ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) ) )* otherlv_11= '}' )? (otherlv_12= 'contacts' otherlv_13= '{' ( (lv_bitMasks_14_0= ruleBitMasks ) ) otherlv_15= '}' )? )
            // InternalArg.g:1894:3: otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'body' otherlv_3= '{' ( (lv_physicBody_4_0= rulePhysicBody ) ) otherlv_5= '}' (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForce ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) ) )* otherlv_11= '}' )? (otherlv_12= 'contacts' otherlv_13= '{' ( (lv_bitMasks_14_0= ruleBitMasks ) ) otherlv_15= '}' )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPhysicClassAccess().getElementKeyword_0());
            		
            // InternalArg.g:1898:3: ( ( ruleEString ) )
            // InternalArg.g:1899:4: ( ruleEString )
            {
            // InternalArg.g:1899:4: ( ruleEString )
            // InternalArg.g:1900:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhysicClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPhysicClassAccess().getOntoClassClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_58);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPhysicClassAccess().getBodyKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalArg.g:1922:3: ( (lv_physicBody_4_0= rulePhysicBody ) )
            // InternalArg.g:1923:4: (lv_physicBody_4_0= rulePhysicBody )
            {
            // InternalArg.g:1923:4: (lv_physicBody_4_0= rulePhysicBody )
            // InternalArg.g:1924:5: lv_physicBody_4_0= rulePhysicBody
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

            otherlv_5=(Token)match(input,15,FOLLOW_60); 

            			newLeafNode(otherlv_5, grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalArg.g:1945:3: (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForce ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) ) )* otherlv_11= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==61) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalArg.g:1946:4: otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForce ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getPhysicClassAccess().getForcesKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalArg.g:1954:4: ( (lv_forces_8_0= ruleForce ) )
                    // InternalArg.g:1955:5: (lv_forces_8_0= ruleForce )
                    {
                    // InternalArg.g:1955:5: (lv_forces_8_0= ruleForce )
                    // InternalArg.g:1956:6: lv_forces_8_0= ruleForce
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

                    // InternalArg.g:1973:4: (otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalArg.g:1974:5: otherlv_9= ',' ( (lv_forces_10_0= ruleForce ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getPhysicClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalArg.g:1978:5: ( (lv_forces_10_0= ruleForce ) )
                    	    // InternalArg.g:1979:6: (lv_forces_10_0= ruleForce )
                    	    {
                    	    // InternalArg.g:1979:6: (lv_forces_10_0= ruleForce )
                    	    // InternalArg.g:1980:7: lv_forces_10_0= ruleForce
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
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_61); 

                    				newLeafNode(otherlv_11, grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalArg.g:2003:3: (otherlv_12= 'contacts' otherlv_13= '{' ( (lv_bitMasks_14_0= ruleBitMasks ) ) otherlv_15= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==62) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalArg.g:2004:4: otherlv_12= 'contacts' otherlv_13= '{' ( (lv_bitMasks_14_0= ruleBitMasks ) ) otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,62,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getPhysicClassAccess().getContactsKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_62); 

                    				newLeafNode(otherlv_13, grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalArg.g:2012:4: ( (lv_bitMasks_14_0= ruleBitMasks ) )
                    // InternalArg.g:2013:5: (lv_bitMasks_14_0= ruleBitMasks )
                    {
                    // InternalArg.g:2013:5: (lv_bitMasks_14_0= ruleBitMasks )
                    // InternalArg.g:2014:6: lv_bitMasks_14_0= ruleBitMasks
                    {

                    						newCompositeNode(grammarAccess.getPhysicClassAccess().getBitMasksBitMasksParserRuleCall_7_2_0());
                    					
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

                    				newLeafNode(otherlv_15, grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "rulePhysicClass"


    // $ANTLR start "entryRulePhysicBody"
    // InternalArg.g:2040:1: entryRulePhysicBody returns [EObject current=null] : iv_rulePhysicBody= rulePhysicBody EOF ;
    public final EObject entryRulePhysicBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicBody = null;


        try {
            // InternalArg.g:2040:51: (iv_rulePhysicBody= rulePhysicBody EOF )
            // InternalArg.g:2041:2: iv_rulePhysicBody= rulePhysicBody EOF
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
    // InternalArg.g:2047:1: rulePhysicBody returns [EObject current=null] : (otherlv_0= 'mass' ( (lv_mass_1_0= ruleEDouble ) ) otherlv_2= 'bodyType' ( (lv_bodyType_3_0= ruleBodyType ) ) otherlv_4= 'charge' ( (lv_charge_5_0= ruleEDouble ) ) otherlv_6= 'friction' ( (lv_friction_7_0= ruleEDouble ) ) otherlv_8= 'rollingFriction' ( (lv_rollingFriction_9_0= ruleEDouble ) ) otherlv_10= 'restitution' ( (lv_restitution_11_0= ruleEDouble ) ) otherlv_12= 'damping' ( (lv_damping_13_0= ruleEDouble ) ) otherlv_14= 'angularDamping' ( (lv_angularDamping_15_0= ruleEDouble ) ) ) ;
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
            // InternalArg.g:2053:2: ( (otherlv_0= 'mass' ( (lv_mass_1_0= ruleEDouble ) ) otherlv_2= 'bodyType' ( (lv_bodyType_3_0= ruleBodyType ) ) otherlv_4= 'charge' ( (lv_charge_5_0= ruleEDouble ) ) otherlv_6= 'friction' ( (lv_friction_7_0= ruleEDouble ) ) otherlv_8= 'rollingFriction' ( (lv_rollingFriction_9_0= ruleEDouble ) ) otherlv_10= 'restitution' ( (lv_restitution_11_0= ruleEDouble ) ) otherlv_12= 'damping' ( (lv_damping_13_0= ruleEDouble ) ) otherlv_14= 'angularDamping' ( (lv_angularDamping_15_0= ruleEDouble ) ) ) )
            // InternalArg.g:2054:2: (otherlv_0= 'mass' ( (lv_mass_1_0= ruleEDouble ) ) otherlv_2= 'bodyType' ( (lv_bodyType_3_0= ruleBodyType ) ) otherlv_4= 'charge' ( (lv_charge_5_0= ruleEDouble ) ) otherlv_6= 'friction' ( (lv_friction_7_0= ruleEDouble ) ) otherlv_8= 'rollingFriction' ( (lv_rollingFriction_9_0= ruleEDouble ) ) otherlv_10= 'restitution' ( (lv_restitution_11_0= ruleEDouble ) ) otherlv_12= 'damping' ( (lv_damping_13_0= ruleEDouble ) ) otherlv_14= 'angularDamping' ( (lv_angularDamping_15_0= ruleEDouble ) ) )
            {
            // InternalArg.g:2054:2: (otherlv_0= 'mass' ( (lv_mass_1_0= ruleEDouble ) ) otherlv_2= 'bodyType' ( (lv_bodyType_3_0= ruleBodyType ) ) otherlv_4= 'charge' ( (lv_charge_5_0= ruleEDouble ) ) otherlv_6= 'friction' ( (lv_friction_7_0= ruleEDouble ) ) otherlv_8= 'rollingFriction' ( (lv_rollingFriction_9_0= ruleEDouble ) ) otherlv_10= 'restitution' ( (lv_restitution_11_0= ruleEDouble ) ) otherlv_12= 'damping' ( (lv_damping_13_0= ruleEDouble ) ) otherlv_14= 'angularDamping' ( (lv_angularDamping_15_0= ruleEDouble ) ) )
            // InternalArg.g:2055:3: otherlv_0= 'mass' ( (lv_mass_1_0= ruleEDouble ) ) otherlv_2= 'bodyType' ( (lv_bodyType_3_0= ruleBodyType ) ) otherlv_4= 'charge' ( (lv_charge_5_0= ruleEDouble ) ) otherlv_6= 'friction' ( (lv_friction_7_0= ruleEDouble ) ) otherlv_8= 'rollingFriction' ( (lv_rollingFriction_9_0= ruleEDouble ) ) otherlv_10= 'restitution' ( (lv_restitution_11_0= ruleEDouble ) ) otherlv_12= 'damping' ( (lv_damping_13_0= ruleEDouble ) ) otherlv_14= 'angularDamping' ( (lv_angularDamping_15_0= ruleEDouble ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getPhysicBodyAccess().getMassKeyword_0());
            		
            // InternalArg.g:2059:3: ( (lv_mass_1_0= ruleEDouble ) )
            // InternalArg.g:2060:4: (lv_mass_1_0= ruleEDouble )
            {
            // InternalArg.g:2060:4: (lv_mass_1_0= ruleEDouble )
            // InternalArg.g:2061:5: lv_mass_1_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getMassEDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_63);
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

            otherlv_2=(Token)match(input,64,FOLLOW_64); 

            			newLeafNode(otherlv_2, grammarAccess.getPhysicBodyAccess().getBodyTypeKeyword_2());
            		
            // InternalArg.g:2082:3: ( (lv_bodyType_3_0= ruleBodyType ) )
            // InternalArg.g:2083:4: (lv_bodyType_3_0= ruleBodyType )
            {
            // InternalArg.g:2083:4: (lv_bodyType_3_0= ruleBodyType )
            // InternalArg.g:2084:5: lv_bodyType_3_0= ruleBodyType
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getBodyTypeBodyTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_65);
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

            otherlv_4=(Token)match(input,65,FOLLOW_49); 

            			newLeafNode(otherlv_4, grammarAccess.getPhysicBodyAccess().getChargeKeyword_4());
            		
            // InternalArg.g:2105:3: ( (lv_charge_5_0= ruleEDouble ) )
            // InternalArg.g:2106:4: (lv_charge_5_0= ruleEDouble )
            {
            // InternalArg.g:2106:4: (lv_charge_5_0= ruleEDouble )
            // InternalArg.g:2107:5: lv_charge_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getChargeEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_66);
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

            otherlv_6=(Token)match(input,66,FOLLOW_49); 

            			newLeafNode(otherlv_6, grammarAccess.getPhysicBodyAccess().getFrictionKeyword_6());
            		
            // InternalArg.g:2128:3: ( (lv_friction_7_0= ruleEDouble ) )
            // InternalArg.g:2129:4: (lv_friction_7_0= ruleEDouble )
            {
            // InternalArg.g:2129:4: (lv_friction_7_0= ruleEDouble )
            // InternalArg.g:2130:5: lv_friction_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getFrictionEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_67);
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

            otherlv_8=(Token)match(input,67,FOLLOW_49); 

            			newLeafNode(otherlv_8, grammarAccess.getPhysicBodyAccess().getRollingFrictionKeyword_8());
            		
            // InternalArg.g:2151:3: ( (lv_rollingFriction_9_0= ruleEDouble ) )
            // InternalArg.g:2152:4: (lv_rollingFriction_9_0= ruleEDouble )
            {
            // InternalArg.g:2152:4: (lv_rollingFriction_9_0= ruleEDouble )
            // InternalArg.g:2153:5: lv_rollingFriction_9_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getRollingFrictionEDoubleParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_68);
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

            otherlv_10=(Token)match(input,68,FOLLOW_49); 

            			newLeafNode(otherlv_10, grammarAccess.getPhysicBodyAccess().getRestitutionKeyword_10());
            		
            // InternalArg.g:2174:3: ( (lv_restitution_11_0= ruleEDouble ) )
            // InternalArg.g:2175:4: (lv_restitution_11_0= ruleEDouble )
            {
            // InternalArg.g:2175:4: (lv_restitution_11_0= ruleEDouble )
            // InternalArg.g:2176:5: lv_restitution_11_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getRestitutionEDoubleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_69);
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

            otherlv_12=(Token)match(input,69,FOLLOW_49); 

            			newLeafNode(otherlv_12, grammarAccess.getPhysicBodyAccess().getDampingKeyword_12());
            		
            // InternalArg.g:2197:3: ( (lv_damping_13_0= ruleEDouble ) )
            // InternalArg.g:2198:4: (lv_damping_13_0= ruleEDouble )
            {
            // InternalArg.g:2198:4: (lv_damping_13_0= ruleEDouble )
            // InternalArg.g:2199:5: lv_damping_13_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getDampingEDoubleParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_70);
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

            otherlv_14=(Token)match(input,70,FOLLOW_49); 

            			newLeafNode(otherlv_14, grammarAccess.getPhysicBodyAccess().getAngularDampingKeyword_14());
            		
            // InternalArg.g:2220:3: ( (lv_angularDamping_15_0= ruleEDouble ) )
            // InternalArg.g:2221:4: (lv_angularDamping_15_0= ruleEDouble )
            {
            // InternalArg.g:2221:4: (lv_angularDamping_15_0= ruleEDouble )
            // InternalArg.g:2222:5: lv_angularDamping_15_0= ruleEDouble
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
    // InternalArg.g:2243:1: entryRuleBitMasks returns [EObject current=null] : iv_ruleBitMasks= ruleBitMasks EOF ;
    public final EObject entryRuleBitMasks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitMasks = null;


        try {
            // InternalArg.g:2243:49: (iv_ruleBitMasks= ruleBitMasks EOF )
            // InternalArg.g:2244:2: iv_ruleBitMasks= ruleBitMasks EOF
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
    // InternalArg.g:2250:1: ruleBitMasks returns [EObject current=null] : (otherlv_0= 'collision' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'contact' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleBitMasks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalArg.g:2256:2: ( (otherlv_0= 'collision' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'contact' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* ) )
            // InternalArg.g:2257:2: (otherlv_0= 'collision' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'contact' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )
            {
            // InternalArg.g:2257:2: (otherlv_0= 'collision' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'contact' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )
            // InternalArg.g:2258:3: otherlv_0= 'collision' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'contact' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBitMasksAccess().getCollisionKeyword_0());
            		
            // InternalArg.g:2262:3: ( ( ruleEString ) )
            // InternalArg.g:2263:4: ( ruleEString )
            {
            // InternalArg.g:2263:4: ( ruleEString )
            // InternalArg.g:2264:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBitMasksRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBitMasksAccess().getCollisionClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_71);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:2278:3: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==14) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalArg.g:2279:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getBitMasksAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalArg.g:2283:4: ( ( ruleEString ) )
            	    // InternalArg.g:2284:5: ( ruleEString )
            	    {
            	    // InternalArg.g:2284:5: ( ruleEString )
            	    // InternalArg.g:2285:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBitMasksRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getBitMasksAccess().getCollisionClassCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_71);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_4=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getBitMasksAccess().getContactKeyword_3());
            		
            // InternalArg.g:2304:3: ( ( ruleEString ) )
            // InternalArg.g:2305:4: ( ruleEString )
            {
            // InternalArg.g:2305:4: ( ruleEString )
            // InternalArg.g:2306:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBitMasksRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBitMasksAccess().getContactClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_72);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:2320:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==14) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalArg.g:2321:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getBitMasksAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalArg.g:2325:4: ( ( ruleEString ) )
            	    // InternalArg.g:2326:5: ( ruleEString )
            	    {
            	    // InternalArg.g:2326:5: ( ruleEString )
            	    // InternalArg.g:2327:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBitMasksRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getBitMasksAccess().getContactClassCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_72);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalArg.g:2346:1: entryRuleForce returns [EObject current=null] : iv_ruleForce= ruleForce EOF ;
    public final EObject entryRuleForce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForce = null;


        try {
            // InternalArg.g:2346:46: (iv_ruleForce= ruleForce EOF )
            // InternalArg.g:2347:2: iv_ruleForce= ruleForce EOF
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
    // InternalArg.g:2353:1: ruleForce returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'gesture' ( (lv_gesture_3_0= ruleGesture ) ) (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )? ) ;
    public final EObject ruleForce() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_gesture_3_0 = null;

        AntlrDatatypeRuleToken lv_xVector_5_0 = null;

        AntlrDatatypeRuleToken lv_yVector_7_0 = null;

        AntlrDatatypeRuleToken lv_zVector_9_0 = null;



        	enterRule();

        try {
            // InternalArg.g:2359:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'gesture' ( (lv_gesture_3_0= ruleGesture ) ) (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )? ) )
            // InternalArg.g:2360:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'gesture' ( (lv_gesture_3_0= ruleGesture ) ) (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )? )
            {
            // InternalArg.g:2360:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'gesture' ( (lv_gesture_3_0= ruleGesture ) ) (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )? )
            // InternalArg.g:2361:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'gesture' ( (lv_gesture_3_0= ruleGesture ) ) (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )?
            {
            // InternalArg.g:2361:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArg.g:2362:4: (lv_name_0_0= ruleEString )
            {
            // InternalArg.g:2362:4: (lv_name_0_0= ruleEString )
            // InternalArg.g:2363:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getForceAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_1=(Token)match(input,31,FOLLOW_73); 

            			newLeafNode(otherlv_1, grammarAccess.getForceAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,73,FOLLOW_74); 

            			newLeafNode(otherlv_2, grammarAccess.getForceAccess().getGestureKeyword_2());
            		
            // InternalArg.g:2388:3: ( (lv_gesture_3_0= ruleGesture ) )
            // InternalArg.g:2389:4: (lv_gesture_3_0= ruleGesture )
            {
            // InternalArg.g:2389:4: (lv_gesture_3_0= ruleGesture )
            // InternalArg.g:2390:5: lv_gesture_3_0= ruleGesture
            {

            					newCompositeNode(grammarAccess.getForceAccess().getGestureGestureEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_75);
            lv_gesture_3_0=ruleGesture();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForceRule());
            					}
            					set(
            						current,
            						"gesture",
            						lv_gesture_3_0,
            						"arg.Arg.Gesture");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArg.g:2407:3: (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalArg.g:2408:4: otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_49); 

                    				newLeafNode(otherlv_4, grammarAccess.getForceAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalArg.g:2412:4: ( (lv_xVector_5_0= ruleEDouble ) )
                    // InternalArg.g:2413:5: (lv_xVector_5_0= ruleEDouble )
                    {
                    // InternalArg.g:2413:5: (lv_xVector_5_0= ruleEDouble )
                    // InternalArg.g:2414:6: lv_xVector_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getForceAccess().getXVectorEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_76);
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

                    otherlv_6=(Token)match(input,14,FOLLOW_49); 

                    				newLeafNode(otherlv_6, grammarAccess.getForceAccess().getCommaKeyword_4_2());
                    			
                    // InternalArg.g:2435:4: ( (lv_yVector_7_0= ruleEDouble ) )
                    // InternalArg.g:2436:5: (lv_yVector_7_0= ruleEDouble )
                    {
                    // InternalArg.g:2436:5: (lv_yVector_7_0= ruleEDouble )
                    // InternalArg.g:2437:6: lv_yVector_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getForceAccess().getYVectorEDoubleParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_76);
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

                    otherlv_8=(Token)match(input,14,FOLLOW_49); 

                    				newLeafNode(otherlv_8, grammarAccess.getForceAccess().getCommaKeyword_4_4());
                    			
                    // InternalArg.g:2458:4: ( (lv_zVector_9_0= ruleEDouble ) )
                    // InternalArg.g:2459:5: (lv_zVector_9_0= ruleEDouble )
                    {
                    // InternalArg.g:2459:5: (lv_zVector_9_0= ruleEDouble )
                    // InternalArg.g:2460:6: lv_zVector_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getForceAccess().getZVectorEDoubleParserRuleCall_4_5_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_10=(Token)match(input,34,FOLLOW_2); 

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
    // InternalArg.g:2486:1: entryRuleGamePad returns [EObject current=null] : iv_ruleGamePad= ruleGamePad EOF ;
    public final EObject entryRuleGamePad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGamePad = null;


        try {
            // InternalArg.g:2486:48: (iv_ruleGamePad= ruleGamePad EOF )
            // InternalArg.g:2487:2: iv_ruleGamePad= ruleGamePad EOF
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
    // InternalArg.g:2493:1: ruleGamePad returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleGamePad() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalArg.g:2499:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) ) ) )
            // InternalArg.g:2500:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) ) )
            {
            // InternalArg.g:2500:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) ) )
            // InternalArg.g:2501:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) )
            {
            // InternalArg.g:2501:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArg.g:2502:4: (lv_name_0_0= ruleEString )
            {
            // InternalArg.g:2502:4: (lv_name_0_0= ruleEString )
            // InternalArg.g:2503:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGamePadAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_77);
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

            otherlv_1=(Token)match(input,74,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGamePadAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalArg.g:2524:3: ( ( ruleEString ) )
            // InternalArg.g:2525:4: ( ruleEString )
            {
            // InternalArg.g:2525:4: ( ruleEString )
            // InternalArg.g:2526:5: ruleEString
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
    // InternalArg.g:2544:1: entryRuleScoreSystem returns [EObject current=null] : iv_ruleScoreSystem= ruleScoreSystem EOF ;
    public final EObject entryRuleScoreSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScoreSystem = null;


        try {
            // InternalArg.g:2544:52: (iv_ruleScoreSystem= ruleScoreSystem EOF )
            // InternalArg.g:2545:2: iv_ruleScoreSystem= ruleScoreSystem EOF
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
    // InternalArg.g:2551:1: ruleScoreSystem returns [EObject current=null] : (otherlv_0= 'start' ( (lv_start_1_0= ruleEInt ) ) otherlv_2= 'goal' ( (lv_finish_3_0= ruleEInt ) ) otherlv_4= 'lives' ( (lv_lives_5_0= ruleEInt ) ) ) ;
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
            // InternalArg.g:2557:2: ( (otherlv_0= 'start' ( (lv_start_1_0= ruleEInt ) ) otherlv_2= 'goal' ( (lv_finish_3_0= ruleEInt ) ) otherlv_4= 'lives' ( (lv_lives_5_0= ruleEInt ) ) ) )
            // InternalArg.g:2558:2: (otherlv_0= 'start' ( (lv_start_1_0= ruleEInt ) ) otherlv_2= 'goal' ( (lv_finish_3_0= ruleEInt ) ) otherlv_4= 'lives' ( (lv_lives_5_0= ruleEInt ) ) )
            {
            // InternalArg.g:2558:2: (otherlv_0= 'start' ( (lv_start_1_0= ruleEInt ) ) otherlv_2= 'goal' ( (lv_finish_3_0= ruleEInt ) ) otherlv_4= 'lives' ( (lv_lives_5_0= ruleEInt ) ) )
            // InternalArg.g:2559:3: otherlv_0= 'start' ( (lv_start_1_0= ruleEInt ) ) otherlv_2= 'goal' ( (lv_finish_3_0= ruleEInt ) ) otherlv_4= 'lives' ( (lv_lives_5_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getScoreSystemAccess().getStartKeyword_0());
            		
            // InternalArg.g:2563:3: ( (lv_start_1_0= ruleEInt ) )
            // InternalArg.g:2564:4: (lv_start_1_0= ruleEInt )
            {
            // InternalArg.g:2564:4: (lv_start_1_0= ruleEInt )
            // InternalArg.g:2565:5: lv_start_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getScoreSystemAccess().getStartEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_78);
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

            otherlv_2=(Token)match(input,75,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getScoreSystemAccess().getGoalKeyword_2());
            		
            // InternalArg.g:2586:3: ( (lv_finish_3_0= ruleEInt ) )
            // InternalArg.g:2587:4: (lv_finish_3_0= ruleEInt )
            {
            // InternalArg.g:2587:4: (lv_finish_3_0= ruleEInt )
            // InternalArg.g:2588:5: lv_finish_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getScoreSystemAccess().getFinishEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_79);
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

            otherlv_4=(Token)match(input,76,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getScoreSystemAccess().getLivesKeyword_4());
            		
            // InternalArg.g:2609:3: ( (lv_lives_5_0= ruleEInt ) )
            // InternalArg.g:2610:4: (lv_lives_5_0= ruleEInt )
            {
            // InternalArg.g:2610:4: (lv_lives_5_0= ruleEInt )
            // InternalArg.g:2611:5: lv_lives_5_0= ruleEInt
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
    // InternalArg.g:2632:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalArg.g:2632:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalArg.g:2633:2: iv_ruleTrigger= ruleTrigger EOF
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
    // InternalArg.g:2639:1: ruleTrigger returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )? (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )? (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )? (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )? (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChange ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalArg.g:2645:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )? (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )? (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )? (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )? (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChange ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalArg.g:2646:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )? (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )? (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )? (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )? (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChange ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalArg.g:2646:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )? (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )? (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )? (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )? (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChange ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalArg.g:2647:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )? (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )? (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )? (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )? (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChange ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalArg.g:2647:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArg.g:2648:4: (lv_name_0_0= ruleEString )
            {
            // InternalArg.g:2648:4: (lv_name_0_0= ruleEString )
            // InternalArg.g:2649:5: lv_name_0_0= ruleEString
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

            otherlv_1=(Token)match(input,12,FOLLOW_80); 

            			newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalArg.g:2670:3: (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==77) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalArg.g:2671:4: otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) )
                    {
                    otherlv_2=(Token)match(input,77,FOLLOW_81); 

                    				newLeafNode(otherlv_2, grammarAccess.getTriggerAccess().getActionKeyword_2_0());
                    			
                    // InternalArg.g:2675:4: ( (lv_action_3_0= ruleBasicActions ) )
                    // InternalArg.g:2676:5: (lv_action_3_0= ruleBasicActions )
                    {
                    // InternalArg.g:2676:5: (lv_action_3_0= ruleBasicActions )
                    // InternalArg.g:2677:6: lv_action_3_0= ruleBasicActions
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getActionBasicActionsEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_82);
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

            // InternalArg.g:2695:3: (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==78) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalArg.g:2696:4: otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,78,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTriggerAccess().getDisplayKeyword_3_0());
                    			
                    // InternalArg.g:2700:4: ( (lv_message_5_0= ruleEString ) )
                    // InternalArg.g:2701:5: (lv_message_5_0= ruleEString )
                    {
                    // InternalArg.g:2701:5: (lv_message_5_0= ruleEString )
                    // InternalArg.g:2702:6: lv_message_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getMessageEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_83);
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

            // InternalArg.g:2720:3: (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==26) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalArg.g:2721:4: otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getTriggerAccess().getScoreKeyword_4_0());
                    			
                    // InternalArg.g:2725:4: ( (lv_scoreChange_7_0= ruleEInt ) )
                    // InternalArg.g:2726:5: (lv_scoreChange_7_0= ruleEInt )
                    {
                    // InternalArg.g:2726:5: (lv_scoreChange_7_0= ruleEInt )
                    // InternalArg.g:2727:6: lv_scoreChange_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getScoreChangeEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_84);
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

            // InternalArg.g:2745:3: (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==79) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalArg.g:2746:4: otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,79,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getTriggerAccess().getTimeEachKeyword_5_0());
                    			
                    // InternalArg.g:2750:4: ( (lv_timeTrigger_9_0= ruleEInt ) )
                    // InternalArg.g:2751:5: (lv_timeTrigger_9_0= ruleEInt )
                    {
                    // InternalArg.g:2751:5: (lv_timeTrigger_9_0= ruleEInt )
                    // InternalArg.g:2752:6: lv_timeTrigger_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getTimeTriggerEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_85);
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

            // InternalArg.g:2770:3: (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChange ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) ) )* otherlv_15= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==80) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalArg.g:2771:4: otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChange ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,80,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getTriggerAccess().getChangesKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_86); 

                    				newLeafNode(otherlv_11, grammarAccess.getTriggerAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalArg.g:2779:4: ( (lv_physicChanges_12_0= rulePhysicChange ) )
                    // InternalArg.g:2780:5: (lv_physicChanges_12_0= rulePhysicChange )
                    {
                    // InternalArg.g:2780:5: (lv_physicChanges_12_0= rulePhysicChange )
                    // InternalArg.g:2781:6: lv_physicChanges_12_0= rulePhysicChange
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

                    // InternalArg.g:2798:4: (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==14) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalArg.g:2799:5: otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChange ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_86); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getTriggerAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalArg.g:2803:5: ( (lv_physicChanges_14_0= rulePhysicChange ) )
                    	    // InternalArg.g:2804:6: (lv_physicChanges_14_0= rulePhysicChange )
                    	    {
                    	    // InternalArg.g:2804:6: (lv_physicChanges_14_0= rulePhysicChange )
                    	    // InternalArg.g:2805:7: lv_physicChanges_14_0= rulePhysicChange
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
                    	    break loop43;
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
    // InternalArg.g:2836:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalArg.g:2836:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalArg.g:2837:2: iv_ruleCollision= ruleCollision EOF
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
    // InternalArg.g:2843:1: ruleCollision returns [EObject current=null] : (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleCollision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalArg.g:2849:2: ( (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) ) )
            // InternalArg.g:2850:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) )
            {
            // InternalArg.g:2850:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) )
            // InternalArg.g:2851:3: otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCollisionAccess().getElementKeyword_0());
            		
            // InternalArg.g:2855:3: ( ( ruleEString ) )
            // InternalArg.g:2856:4: ( ruleEString )
            {
            // InternalArg.g:2856:4: ( ruleEString )
            // InternalArg.g:2857:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollisionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCollisionAccess().getClassAClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_87);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCollisionAccess().getToKeyword_2());
            		
            // InternalArg.g:2875:3: ( ( ruleEString ) )
            // InternalArg.g:2876:4: ( ruleEString )
            {
            // InternalArg.g:2876:4: ( ruleEString )
            // InternalArg.g:2877:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollisionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCollisionAccess().getClassBClassCrossReference_3_0());
            				
            pushFollow(FOLLOW_77);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,74,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getCollisionAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalArg.g:2895:3: ( ( ruleEString ) )
            // InternalArg.g:2896:4: ( ruleEString )
            {
            // InternalArg.g:2896:4: ( ruleEString )
            // InternalArg.g:2897:5: ruleEString
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
    // InternalArg.g:2915:1: entryRuleObjInit returns [EObject current=null] : iv_ruleObjInit= ruleObjInit EOF ;
    public final EObject entryRuleObjInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjInit = null;


        try {
            // InternalArg.g:2915:48: (iv_ruleObjInit= ruleObjInit EOF )
            // InternalArg.g:2916:2: iv_ruleObjInit= ruleObjInit EOF
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
    // InternalArg.g:2922:1: ruleObjInit returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '[' ( (lv_posX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_posY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_posZ_7_0= ruleEDouble ) ) otherlv_8= ']' (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attribute_11_0= ruleObjAttribute ) ) (otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) ) )* otherlv_14= '}' )? (otherlv_15= 'rules' otherlv_16= '{' ( (lv_rules_17_0= ruleRule ) ) (otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) ) )* otherlv_20= '}' )? ) ;
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
            // InternalArg.g:2928:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '[' ( (lv_posX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_posY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_posZ_7_0= ruleEDouble ) ) otherlv_8= ']' (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attribute_11_0= ruleObjAttribute ) ) (otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) ) )* otherlv_14= '}' )? (otherlv_15= 'rules' otherlv_16= '{' ( (lv_rules_17_0= ruleRule ) ) (otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) ) )* otherlv_20= '}' )? ) )
            // InternalArg.g:2929:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '[' ( (lv_posX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_posY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_posZ_7_0= ruleEDouble ) ) otherlv_8= ']' (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attribute_11_0= ruleObjAttribute ) ) (otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) ) )* otherlv_14= '}' )? (otherlv_15= 'rules' otherlv_16= '{' ( (lv_rules_17_0= ruleRule ) ) (otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) ) )* otherlv_20= '}' )? )
            {
            // InternalArg.g:2929:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '[' ( (lv_posX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_posY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_posZ_7_0= ruleEDouble ) ) otherlv_8= ']' (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attribute_11_0= ruleObjAttribute ) ) (otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) ) )* otherlv_14= '}' )? (otherlv_15= 'rules' otherlv_16= '{' ( (lv_rules_17_0= ruleRule ) ) (otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) ) )* otherlv_20= '}' )? )
            // InternalArg.g:2930:3: ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '[' ( (lv_posX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_posY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_posZ_7_0= ruleEDouble ) ) otherlv_8= ']' (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attribute_11_0= ruleObjAttribute ) ) (otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) ) )* otherlv_14= '}' )? (otherlv_15= 'rules' otherlv_16= '{' ( (lv_rules_17_0= ruleRule ) ) (otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) ) )* otherlv_20= '}' )?
            {
            // InternalArg.g:2930:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArg.g:2931:4: (lv_name_0_0= ruleEString )
            {
            // InternalArg.g:2931:4: (lv_name_0_0= ruleEString )
            // InternalArg.g:2932:5: lv_name_0_0= ruleEString
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

            // InternalArg.g:2949:3: ( ( ruleEString ) )
            // InternalArg.g:2950:4: ( ruleEString )
            {
            // InternalArg.g:2950:4: ( ruleEString )
            // InternalArg.g:2951:5: ruleEString
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

            otherlv_2=(Token)match(input,32,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getObjInitAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalArg.g:2969:3: ( (lv_posX_3_0= ruleEDouble ) )
            // InternalArg.g:2970:4: (lv_posX_3_0= ruleEDouble )
            {
            // InternalArg.g:2970:4: (lv_posX_3_0= ruleEDouble )
            // InternalArg.g:2971:5: lv_posX_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getObjInitAccess().getPosXEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_76);
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

            otherlv_4=(Token)match(input,14,FOLLOW_49); 

            			newLeafNode(otherlv_4, grammarAccess.getObjInitAccess().getCommaKeyword_4());
            		
            // InternalArg.g:2992:3: ( (lv_posY_5_0= ruleEDouble ) )
            // InternalArg.g:2993:4: (lv_posY_5_0= ruleEDouble )
            {
            // InternalArg.g:2993:4: (lv_posY_5_0= ruleEDouble )
            // InternalArg.g:2994:5: lv_posY_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getObjInitAccess().getPosYEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_76);
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

            otherlv_6=(Token)match(input,14,FOLLOW_49); 

            			newLeafNode(otherlv_6, grammarAccess.getObjInitAccess().getCommaKeyword_6());
            		
            // InternalArg.g:3015:3: ( (lv_posZ_7_0= ruleEDouble ) )
            // InternalArg.g:3016:4: (lv_posZ_7_0= ruleEDouble )
            {
            // InternalArg.g:3016:4: (lv_posZ_7_0= ruleEDouble )
            // InternalArg.g:3017:5: lv_posZ_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getObjInitAccess().getPosZEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_8=(Token)match(input,34,FOLLOW_88); 

            			newLeafNode(otherlv_8, grammarAccess.getObjInitAccess().getRightSquareBracketKeyword_8());
            		
            // InternalArg.g:3038:3: (otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attribute_11_0= ruleObjAttribute ) ) (otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) ) )* otherlv_14= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==82) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalArg.g:3039:4: otherlv_9= 'attributes' otherlv_10= '{' ( (lv_attribute_11_0= ruleObjAttribute ) ) (otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,82,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getObjInitAccess().getAttributesKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getObjInitAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalArg.g:3047:4: ( (lv_attribute_11_0= ruleObjAttribute ) )
                    // InternalArg.g:3048:5: (lv_attribute_11_0= ruleObjAttribute )
                    {
                    // InternalArg.g:3048:5: (lv_attribute_11_0= ruleObjAttribute )
                    // InternalArg.g:3049:6: lv_attribute_11_0= ruleObjAttribute
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

                    // InternalArg.g:3066:4: (otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==14) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalArg.g:3067:5: otherlv_12= ',' ( (lv_attribute_13_0= ruleObjAttribute ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getObjInitAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalArg.g:3071:5: ( (lv_attribute_13_0= ruleObjAttribute ) )
                    	    // InternalArg.g:3072:6: (lv_attribute_13_0= ruleObjAttribute )
                    	    {
                    	    // InternalArg.g:3072:6: (lv_attribute_13_0= ruleObjAttribute )
                    	    // InternalArg.g:3073:7: lv_attribute_13_0= ruleObjAttribute
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
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_89); 

                    				newLeafNode(otherlv_14, grammarAccess.getObjInitAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalArg.g:3096:3: (otherlv_15= 'rules' otherlv_16= '{' ( (lv_rules_17_0= ruleRule ) ) (otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) ) )* otherlv_20= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==83) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalArg.g:3097:4: otherlv_15= 'rules' otherlv_16= '{' ( (lv_rules_17_0= ruleRule ) ) (otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,83,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getObjInitAccess().getRulesKeyword_10_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_86); 

                    				newLeafNode(otherlv_16, grammarAccess.getObjInitAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalArg.g:3105:4: ( (lv_rules_17_0= ruleRule ) )
                    // InternalArg.g:3106:5: (lv_rules_17_0= ruleRule )
                    {
                    // InternalArg.g:3106:5: (lv_rules_17_0= ruleRule )
                    // InternalArg.g:3107:6: lv_rules_17_0= ruleRule
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

                    // InternalArg.g:3124:4: (otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==14) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalArg.g:3125:5: otherlv_18= ',' ( (lv_rules_19_0= ruleRule ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_86); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getObjInitAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalArg.g:3129:5: ( (lv_rules_19_0= ruleRule ) )
                    	    // InternalArg.g:3130:6: (lv_rules_19_0= ruleRule )
                    	    {
                    	    // InternalArg.g:3130:6: (lv_rules_19_0= ruleRule )
                    	    // InternalArg.g:3131:7: lv_rules_19_0= ruleRule
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
                    	    break loop47;
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
    // InternalArg.g:3158:1: entryRulePhysicChange returns [EObject current=null] : iv_rulePhysicChange= rulePhysicChange EOF ;
    public final EObject entryRulePhysicChange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicChange = null;


        try {
            // InternalArg.g:3158:53: (iv_rulePhysicChange= rulePhysicChange EOF )
            // InternalArg.g:3159:2: iv_rulePhysicChange= rulePhysicChange EOF
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
    // InternalArg.g:3165:1: rulePhysicChange returns [EObject current=null] : (otherlv_0= 'do' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'in' ( ( ruleEString ) ) otherlv_4= 'named' ( (lv_object_5_0= ruleEString ) ) (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )? (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )? (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )? (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )? (otherlv_14= 'force' ( ( ruleEString ) ) )? ) ;
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
            // InternalArg.g:3171:2: ( (otherlv_0= 'do' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'in' ( ( ruleEString ) ) otherlv_4= 'named' ( (lv_object_5_0= ruleEString ) ) (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )? (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )? (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )? (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )? (otherlv_14= 'force' ( ( ruleEString ) ) )? ) )
            // InternalArg.g:3172:2: (otherlv_0= 'do' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'in' ( ( ruleEString ) ) otherlv_4= 'named' ( (lv_object_5_0= ruleEString ) ) (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )? (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )? (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )? (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )? (otherlv_14= 'force' ( ( ruleEString ) ) )? )
            {
            // InternalArg.g:3172:2: (otherlv_0= 'do' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'in' ( ( ruleEString ) ) otherlv_4= 'named' ( (lv_object_5_0= ruleEString ) ) (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )? (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )? (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )? (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )? (otherlv_14= 'force' ( ( ruleEString ) ) )? )
            // InternalArg.g:3173:3: otherlv_0= 'do' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'in' ( ( ruleEString ) ) otherlv_4= 'named' ( (lv_object_5_0= ruleEString ) ) (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )? (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )? (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )? (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )? (otherlv_14= 'force' ( ( ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,84,FOLLOW_90); 

            			newLeafNode(otherlv_0, grammarAccess.getPhysicChangeAccess().getDoKeyword_0());
            		
            // InternalArg.g:3177:3: ( (lv_action_1_0= ruleAction ) )
            // InternalArg.g:3178:4: (lv_action_1_0= ruleAction )
            {
            // InternalArg.g:3178:4: (lv_action_1_0= ruleAction )
            // InternalArg.g:3179:5: lv_action_1_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getPhysicChangeAccess().getActionActionEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_91);
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

            otherlv_2=(Token)match(input,85,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPhysicChangeAccess().getInKeyword_2());
            		
            // InternalArg.g:3200:3: ( ( ruleEString ) )
            // InternalArg.g:3201:4: ( ruleEString )
            {
            // InternalArg.g:3201:4: ( ruleEString )
            // InternalArg.g:3202:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhysicChangeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPhysicChangeAccess().getClassClassCrossReference_3_0());
            				
            pushFollow(FOLLOW_92);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getPhysicChangeAccess().getNamedKeyword_4());
            		
            // InternalArg.g:3220:3: ( (lv_object_5_0= ruleEString ) )
            // InternalArg.g:3221:4: (lv_object_5_0= ruleEString )
            {
            // InternalArg.g:3221:4: (lv_object_5_0= ruleEString )
            // InternalArg.g:3222:5: lv_object_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPhysicChangeAccess().getObjectEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_93);
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

            // InternalArg.g:3239:3: (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==87) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalArg.g:3240:4: otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) )
                    {
                    otherlv_6=(Token)match(input,87,FOLLOW_94); 

                    				newLeafNode(otherlv_6, grammarAccess.getPhysicChangeAccess().getWhereKeyword_6_0());
                    			
                    // InternalArg.g:3244:4: ( (lv_position_7_0= rulePosition ) )
                    // InternalArg.g:3245:5: (lv_position_7_0= rulePosition )
                    {
                    // InternalArg.g:3245:5: (lv_position_7_0= rulePosition )
                    // InternalArg.g:3246:6: lv_position_7_0= rulePosition
                    {

                    						newCompositeNode(grammarAccess.getPhysicChangeAccess().getPositionPositionEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_95);
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

            // InternalArg.g:3264:3: (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==88) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalArg.g:3265:4: otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) )
                    {
                    otherlv_8=(Token)match(input,88,FOLLOW_49); 

                    				newLeafNode(otherlv_8, grammarAccess.getPhysicChangeAccess().getScaleKeyword_7_0());
                    			
                    // InternalArg.g:3269:4: ( (lv_scale_9_0= ruleEDouble ) )
                    // InternalArg.g:3270:5: (lv_scale_9_0= ruleEDouble )
                    {
                    // InternalArg.g:3270:5: (lv_scale_9_0= ruleEDouble )
                    // InternalArg.g:3271:6: lv_scale_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getPhysicChangeAccess().getScaleEDoubleParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_96);
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

            // InternalArg.g:3289:3: (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==89) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalArg.g:3290:4: otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,89,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getPhysicChangeAccess().getStatKeyword_8_0());
                    			
                    // InternalArg.g:3294:4: ( (lv_attribute_11_0= ruleEString ) )
                    // InternalArg.g:3295:5: (lv_attribute_11_0= ruleEString )
                    {
                    // InternalArg.g:3295:5: (lv_attribute_11_0= ruleEString )
                    // InternalArg.g:3296:6: lv_attribute_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPhysicChangeAccess().getAttributeEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_97);
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

            // InternalArg.g:3314:3: (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==90) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalArg.g:3315:4: otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,90,FOLLOW_27); 

                    				newLeafNode(otherlv_12, grammarAccess.getPhysicChangeAccess().getChangeStatKeyword_9_0());
                    			
                    // InternalArg.g:3319:4: ( (lv_changeValue_13_0= ruleEInt ) )
                    // InternalArg.g:3320:5: (lv_changeValue_13_0= ruleEInt )
                    {
                    // InternalArg.g:3320:5: (lv_changeValue_13_0= ruleEInt )
                    // InternalArg.g:3321:6: lv_changeValue_13_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPhysicChangeAccess().getChangeValueEIntParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_98);
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

            // InternalArg.g:3339:3: (otherlv_14= 'force' ( ( ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==91) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalArg.g:3340:4: otherlv_14= 'force' ( ( ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,91,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getPhysicChangeAccess().getForceKeyword_10_0());
                    			
                    // InternalArg.g:3344:4: ( ( ruleEString ) )
                    // InternalArg.g:3345:5: ( ruleEString )
                    {
                    // InternalArg.g:3345:5: ( ruleEString )
                    // InternalArg.g:3346:6: ruleEString
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
    // InternalArg.g:3365:1: entryRuleObjAttribute returns [EObject current=null] : iv_ruleObjAttribute= ruleObjAttribute EOF ;
    public final EObject entryRuleObjAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjAttribute = null;


        try {
            // InternalArg.g:3365:53: (iv_ruleObjAttribute= ruleObjAttribute EOF )
            // InternalArg.g:3366:2: iv_ruleObjAttribute= ruleObjAttribute EOF
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
    // InternalArg.g:3372:1: ruleObjAttribute returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= 'value' ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleObjAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalArg.g:3378:2: ( ( ( ( ruleEString ) ) otherlv_1= 'value' ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalArg.g:3379:2: ( ( ( ruleEString ) ) otherlv_1= 'value' ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalArg.g:3379:2: ( ( ( ruleEString ) ) otherlv_1= 'value' ( (lv_value_2_0= ruleEString ) ) )
            // InternalArg.g:3380:3: ( ( ruleEString ) ) otherlv_1= 'value' ( (lv_value_2_0= ruleEString ) )
            {
            // InternalArg.g:3380:3: ( ( ruleEString ) )
            // InternalArg.g:3381:4: ( ruleEString )
            {
            // InternalArg.g:3381:4: ( ruleEString )
            // InternalArg.g:3382:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getObjAttributeAccess().getAttributeAttributeCrossReference_0_0());
            				
            pushFollow(FOLLOW_99);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,92,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getObjAttributeAccess().getValueKeyword_1());
            		
            // InternalArg.g:3400:3: ( (lv_value_2_0= ruleEString ) )
            // InternalArg.g:3401:4: (lv_value_2_0= ruleEString )
            {
            // InternalArg.g:3401:4: (lv_value_2_0= ruleEString )
            // InternalArg.g:3402:5: lv_value_2_0= ruleEString
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
    // InternalArg.g:3423:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalArg.g:3423:45: (iv_ruleRule= ruleRule EOF )
            // InternalArg.g:3424:2: iv_ruleRule= ruleRule EOF
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
    // InternalArg.g:3430:1: ruleRule returns [EObject current=null] : (otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= 'if(' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalArg.g:3436:2: ( (otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= 'if(' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')' ) )
            // InternalArg.g:3437:2: (otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= 'if(' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')' )
            {
            // InternalArg.g:3437:2: (otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= 'if(' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')' )
            // InternalArg.g:3438:3: otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= 'if(' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getDoKeyword_0());
            		
            // InternalArg.g:3442:3: ( ( ruleEString ) )
            // InternalArg.g:3443:4: ( ruleEString )
            {
            // InternalArg.g:3443:4: ( ruleEString )
            // InternalArg.g:3444:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRuleAccess().getActionTriggerCrossReference_1_0());
            				
            pushFollow(FOLLOW_100);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,93,FOLLOW_101); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getIfKeyword_2());
            		
            // InternalArg.g:3462:3: ( (lv_condition_3_0= ruleCondition ) )
            // InternalArg.g:3463:4: (lv_condition_3_0= ruleCondition )
            {
            // InternalArg.g:3463:4: (lv_condition_3_0= ruleCondition )
            // InternalArg.g:3464:5: lv_condition_3_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_102);
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

            otherlv_4=(Token)match(input,94,FOLLOW_2); 

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
    // InternalArg.g:3489:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalArg.g:3489:44: (iv_ruleNot= ruleNot EOF )
            // InternalArg.g:3490:2: iv_ruleNot= ruleNot EOF
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
    // InternalArg.g:3496:1: ruleNot returns [EObject current=null] : (otherlv_0= '!' ( (lv_left_1_0= ruleCondition ) ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_left_1_0 = null;



        	enterRule();

        try {
            // InternalArg.g:3502:2: ( (otherlv_0= '!' ( (lv_left_1_0= ruleCondition ) ) ) )
            // InternalArg.g:3503:2: (otherlv_0= '!' ( (lv_left_1_0= ruleCondition ) ) )
            {
            // InternalArg.g:3503:2: (otherlv_0= '!' ( (lv_left_1_0= ruleCondition ) ) )
            // InternalArg.g:3504:3: otherlv_0= '!' ( (lv_left_1_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,95,FOLLOW_101); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getExclamationMarkKeyword_0());
            		
            // InternalArg.g:3508:3: ( (lv_left_1_0= ruleCondition ) )
            // InternalArg.g:3509:4: (lv_left_1_0= ruleCondition )
            {
            // InternalArg.g:3509:4: (lv_left_1_0= ruleCondition )
            // InternalArg.g:3510:5: lv_left_1_0= ruleCondition
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
    // InternalArg.g:3531:1: entryRuleBinary returns [EObject current=null] : iv_ruleBinary= ruleBinary EOF ;
    public final EObject entryRuleBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinary = null;


        try {
            // InternalArg.g:3531:47: (iv_ruleBinary= ruleBinary EOF )
            // InternalArg.g:3532:2: iv_ruleBinary= ruleBinary EOF
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
    // InternalArg.g:3538:1: ruleBinary returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleCondition ) ) otherlv_2= ')' ( (lv_op_3_0= ruleLogicOps ) ) otherlv_4= '(' ( (lv_right_5_0= ruleCondition ) ) otherlv_6= ')' ) ;
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
            // InternalArg.g:3544:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleCondition ) ) otherlv_2= ')' ( (lv_op_3_0= ruleLogicOps ) ) otherlv_4= '(' ( (lv_right_5_0= ruleCondition ) ) otherlv_6= ')' ) )
            // InternalArg.g:3545:2: (otherlv_0= '(' ( (lv_left_1_0= ruleCondition ) ) otherlv_2= ')' ( (lv_op_3_0= ruleLogicOps ) ) otherlv_4= '(' ( (lv_right_5_0= ruleCondition ) ) otherlv_6= ')' )
            {
            // InternalArg.g:3545:2: (otherlv_0= '(' ( (lv_left_1_0= ruleCondition ) ) otherlv_2= ')' ( (lv_op_3_0= ruleLogicOps ) ) otherlv_4= '(' ( (lv_right_5_0= ruleCondition ) ) otherlv_6= ')' )
            // InternalArg.g:3546:3: otherlv_0= '(' ( (lv_left_1_0= ruleCondition ) ) otherlv_2= ')' ( (lv_op_3_0= ruleLogicOps ) ) otherlv_4= '(' ( (lv_right_5_0= ruleCondition ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,96,FOLLOW_101); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryAccess().getLeftParenthesisKeyword_0());
            		
            // InternalArg.g:3550:3: ( (lv_left_1_0= ruleCondition ) )
            // InternalArg.g:3551:4: (lv_left_1_0= ruleCondition )
            {
            // InternalArg.g:3551:4: (lv_left_1_0= ruleCondition )
            // InternalArg.g:3552:5: lv_left_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getLeftConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_102);
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

            otherlv_2=(Token)match(input,94,FOLLOW_103); 

            			newLeafNode(otherlv_2, grammarAccess.getBinaryAccess().getRightParenthesisKeyword_2());
            		
            // InternalArg.g:3573:3: ( (lv_op_3_0= ruleLogicOps ) )
            // InternalArg.g:3574:4: (lv_op_3_0= ruleLogicOps )
            {
            // InternalArg.g:3574:4: (lv_op_3_0= ruleLogicOps )
            // InternalArg.g:3575:5: lv_op_3_0= ruleLogicOps
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getOpLogicOpsEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_104);
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

            otherlv_4=(Token)match(input,96,FOLLOW_101); 

            			newLeafNode(otherlv_4, grammarAccess.getBinaryAccess().getLeftParenthesisKeyword_4());
            		
            // InternalArg.g:3596:3: ( (lv_right_5_0= ruleCondition ) )
            // InternalArg.g:3597:4: (lv_right_5_0= ruleCondition )
            {
            // InternalArg.g:3597:4: (lv_right_5_0= ruleCondition )
            // InternalArg.g:3598:5: lv_right_5_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getRightConditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_102);
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

            otherlv_6=(Token)match(input,94,FOLLOW_2); 

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
    // InternalArg.g:3623:1: entryRuleArithmetic returns [EObject current=null] : iv_ruleArithmetic= ruleArithmetic EOF ;
    public final EObject entryRuleArithmetic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmetic = null;


        try {
            // InternalArg.g:3623:51: (iv_ruleArithmetic= ruleArithmetic EOF )
            // InternalArg.g:3624:2: iv_ruleArithmetic= ruleArithmetic EOF
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
    // InternalArg.g:3630:1: ruleArithmetic returns [EObject current=null] : ( ( (lv_left_0_0= ruleValue ) ) ( (lv_op_1_0= ruleArithmOps ) ) ( (lv_right_2_0= ruleValue ) ) ) ;
    public final EObject ruleArithmetic() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalArg.g:3636:2: ( ( ( (lv_left_0_0= ruleValue ) ) ( (lv_op_1_0= ruleArithmOps ) ) ( (lv_right_2_0= ruleValue ) ) ) )
            // InternalArg.g:3637:2: ( ( (lv_left_0_0= ruleValue ) ) ( (lv_op_1_0= ruleArithmOps ) ) ( (lv_right_2_0= ruleValue ) ) )
            {
            // InternalArg.g:3637:2: ( ( (lv_left_0_0= ruleValue ) ) ( (lv_op_1_0= ruleArithmOps ) ) ( (lv_right_2_0= ruleValue ) ) )
            // InternalArg.g:3638:3: ( (lv_left_0_0= ruleValue ) ) ( (lv_op_1_0= ruleArithmOps ) ) ( (lv_right_2_0= ruleValue ) )
            {
            // InternalArg.g:3638:3: ( (lv_left_0_0= ruleValue ) )
            // InternalArg.g:3639:4: (lv_left_0_0= ruleValue )
            {
            // InternalArg.g:3639:4: (lv_left_0_0= ruleValue )
            // InternalArg.g:3640:5: lv_left_0_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getArithmeticAccess().getLeftValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_105);
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

            // InternalArg.g:3657:3: ( (lv_op_1_0= ruleArithmOps ) )
            // InternalArg.g:3658:4: (lv_op_1_0= ruleArithmOps )
            {
            // InternalArg.g:3658:4: (lv_op_1_0= ruleArithmOps )
            // InternalArg.g:3659:5: lv_op_1_0= ruleArithmOps
            {

            					newCompositeNode(grammarAccess.getArithmeticAccess().getOpArithmOpsEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_101);
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

            // InternalArg.g:3676:3: ( (lv_right_2_0= ruleValue ) )
            // InternalArg.g:3677:4: (lv_right_2_0= ruleValue )
            {
            // InternalArg.g:3677:4: (lv_right_2_0= ruleValue )
            // InternalArg.g:3678:5: lv_right_2_0= ruleValue
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
    // InternalArg.g:3699:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalArg.g:3699:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalArg.g:3700:2: iv_ruleAttributeValue= ruleAttributeValue EOF
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
    // InternalArg.g:3706:1: ruleAttributeValue returns [EObject current=null] : ( ( (lv_class_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleEString ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_class_0_0 = null;

        AntlrDatatypeRuleToken lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalArg.g:3712:2: ( ( ( (lv_class_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleEString ) ) ) )
            // InternalArg.g:3713:2: ( ( (lv_class_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleEString ) ) )
            {
            // InternalArg.g:3713:2: ( ( (lv_class_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleEString ) ) )
            // InternalArg.g:3714:3: ( (lv_class_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleEString ) )
            {
            // InternalArg.g:3714:3: ( (lv_class_0_0= ruleEString ) )
            // InternalArg.g:3715:4: (lv_class_0_0= ruleEString )
            {
            // InternalArg.g:3715:4: (lv_class_0_0= ruleEString )
            // InternalArg.g:3716:5: lv_class_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeValueAccess().getClassEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_56);
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

            otherlv_1=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeValueAccess().getFullStopKeyword_1());
            		
            // InternalArg.g:3737:3: ( (lv_attribute_2_0= ruleEString ) )
            // InternalArg.g:3738:4: (lv_attribute_2_0= ruleEString )
            {
            // InternalArg.g:3738:4: (lv_attribute_2_0= ruleEString )
            // InternalArg.g:3739:5: lv_attribute_2_0= ruleEString
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
    // InternalArg.g:3760:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // InternalArg.g:3760:54: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalArg.g:3761:2: iv_ruleConstantValue= ruleConstantValue EOF
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
    // InternalArg.g:3767:1: ruleConstantValue returns [EObject current=null] : ( (lv_value_0_0= ruleConstant ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalArg.g:3773:2: ( ( (lv_value_0_0= ruleConstant ) ) )
            // InternalArg.g:3774:2: ( (lv_value_0_0= ruleConstant ) )
            {
            // InternalArg.g:3774:2: ( (lv_value_0_0= ruleConstant ) )
            // InternalArg.g:3775:3: (lv_value_0_0= ruleConstant )
            {
            // InternalArg.g:3775:3: (lv_value_0_0= ruleConstant )
            // InternalArg.g:3776:4: lv_value_0_0= ruleConstant
            {

            				newCompositeNode(grammarAccess.getConstantValueAccess().getValueConstantParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleConstant();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getConstantValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"arg.Arg.Constant");
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


    // $ANTLR start "entryRuleConstant"
    // InternalArg.g:3796:1: entryRuleConstant returns [String current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final String entryRuleConstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstant = null;


        try {
            // InternalArg.g:3796:48: (iv_ruleConstant= ruleConstant EOF )
            // InternalArg.g:3797:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant.getText(); 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalArg.g:3803:1: ruleConstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EInt_0= ruleEInt | this_EString_1= ruleEString ) ;
    public final AntlrDatatypeRuleToken ruleConstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EInt_0 = null;

        AntlrDatatypeRuleToken this_EString_1 = null;



        	enterRule();

        try {
            // InternalArg.g:3809:2: ( (this_EInt_0= ruleEInt | this_EString_1= ruleEString ) )
            // InternalArg.g:3810:2: (this_EInt_0= ruleEInt | this_EString_1= ruleEString )
            {
            // InternalArg.g:3810:2: (this_EInt_0= ruleEInt | this_EString_1= ruleEString )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_INT||LA54_0==45) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=RULE_STRING && LA54_0<=RULE_ID)) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalArg.g:3811:3: this_EInt_0= ruleEInt
                    {

                    			newCompositeNode(grammarAccess.getConstantAccess().getEIntParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EInt_0=ruleEInt();

                    state._fsp--;


                    			current.merge(this_EInt_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalArg.g:3822:3: this_EString_1= ruleEString
                    {

                    			newCompositeNode(grammarAccess.getConstantAccess().getEStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EString_1=ruleEString();

                    state._fsp--;


                    			current.merge(this_EString_1);
                    		

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleAllInstances"
    // InternalArg.g:3836:1: entryRuleAllInstances returns [EObject current=null] : iv_ruleAllInstances= ruleAllInstances EOF ;
    public final EObject entryRuleAllInstances() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllInstances = null;


        try {
            // InternalArg.g:3836:53: (iv_ruleAllInstances= ruleAllInstances EOF )
            // InternalArg.g:3837:2: iv_ruleAllInstances= ruleAllInstances EOF
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
    // InternalArg.g:3843:1: ruleAllInstances returns [EObject current=null] : (otherlv_0= 'Number' ( (lv_type_1_0= ruleEString ) ) ) ;
    public final EObject ruleAllInstances() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalArg.g:3849:2: ( (otherlv_0= 'Number' ( (lv_type_1_0= ruleEString ) ) ) )
            // InternalArg.g:3850:2: (otherlv_0= 'Number' ( (lv_type_1_0= ruleEString ) ) )
            {
            // InternalArg.g:3850:2: (otherlv_0= 'Number' ( (lv_type_1_0= ruleEString ) ) )
            // InternalArg.g:3851:3: otherlv_0= 'Number' ( (lv_type_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,97,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAllInstancesAccess().getNumberKeyword_0());
            		
            // InternalArg.g:3855:3: ( (lv_type_1_0= ruleEString ) )
            // InternalArg.g:3856:4: (lv_type_1_0= ruleEString )
            {
            // InternalArg.g:3856:4: (lv_type_1_0= ruleEString )
            // InternalArg.g:3857:5: lv_type_1_0= ruleEString
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


    // $ANTLR start "ruleGesture"
    // InternalArg.g:3878:1: ruleGesture returns [Enumerator current=null] : ( (enumLiteral_0= 'drag' ) | (enumLiteral_1= 'tilt' ) | (enumLiteral_2= 'touch' ) ) ;
    public final Enumerator ruleGesture() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArg.g:3884:2: ( ( (enumLiteral_0= 'drag' ) | (enumLiteral_1= 'tilt' ) | (enumLiteral_2= 'touch' ) ) )
            // InternalArg.g:3885:2: ( (enumLiteral_0= 'drag' ) | (enumLiteral_1= 'tilt' ) | (enumLiteral_2= 'touch' ) )
            {
            // InternalArg.g:3885:2: ( (enumLiteral_0= 'drag' ) | (enumLiteral_1= 'tilt' ) | (enumLiteral_2= 'touch' ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt55=1;
                }
                break;
            case 99:
                {
                alt55=2;
                }
                break;
            case 100:
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
                    // InternalArg.g:3886:3: (enumLiteral_0= 'drag' )
                    {
                    // InternalArg.g:3886:3: (enumLiteral_0= 'drag' )
                    // InternalArg.g:3887:4: enumLiteral_0= 'drag'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getGestureAccess().getDragEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGestureAccess().getDragEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:3894:3: (enumLiteral_1= 'tilt' )
                    {
                    // InternalArg.g:3894:3: (enumLiteral_1= 'tilt' )
                    // InternalArg.g:3895:4: enumLiteral_1= 'tilt'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getGestureAccess().getTiltEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGestureAccess().getTiltEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:3902:3: (enumLiteral_2= 'touch' )
                    {
                    // InternalArg.g:3902:3: (enumLiteral_2= 'touch' )
                    // InternalArg.g:3903:4: enumLiteral_2= 'touch'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getGestureAccess().getTouchEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGestureAccess().getTouchEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleGesture"


    // $ANTLR start "rulePlanes"
    // InternalArg.g:3913:1: rulePlanes returns [Enumerator current=null] : ( (enumLiteral_0= 'any' ) | (enumLiteral_1= 'horizontal' ) | (enumLiteral_2= 'vertical' ) ) ;
    public final Enumerator rulePlanes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArg.g:3919:2: ( ( (enumLiteral_0= 'any' ) | (enumLiteral_1= 'horizontal' ) | (enumLiteral_2= 'vertical' ) ) )
            // InternalArg.g:3920:2: ( (enumLiteral_0= 'any' ) | (enumLiteral_1= 'horizontal' ) | (enumLiteral_2= 'vertical' ) )
            {
            // InternalArg.g:3920:2: ( (enumLiteral_0= 'any' ) | (enumLiteral_1= 'horizontal' ) | (enumLiteral_2= 'vertical' ) )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt56=1;
                }
                break;
            case 102:
                {
                alt56=2;
                }
                break;
            case 103:
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
                    // InternalArg.g:3921:3: (enumLiteral_0= 'any' )
                    {
                    // InternalArg.g:3921:3: (enumLiteral_0= 'any' )
                    // InternalArg.g:3922:4: enumLiteral_0= 'any'
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getPlanesAccess().getAnyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPlanesAccess().getAnyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:3929:3: (enumLiteral_1= 'horizontal' )
                    {
                    // InternalArg.g:3929:3: (enumLiteral_1= 'horizontal' )
                    // InternalArg.g:3930:4: enumLiteral_1= 'horizontal'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getPlanesAccess().getHorizontalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPlanesAccess().getHorizontalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:3937:3: (enumLiteral_2= 'vertical' )
                    {
                    // InternalArg.g:3937:3: (enumLiteral_2= 'vertical' )
                    // InternalArg.g:3938:4: enumLiteral_2= 'vertical'
                    {
                    enumLiteral_2=(Token)match(input,103,FOLLOW_2); 

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
    // InternalArg.g:3948:1: ruleBodyType returns [Enumerator current=null] : ( (enumLiteral_0= 'static' ) | (enumLiteral_1= 'dynamic' ) | (enumLiteral_2= 'kinematic' ) ) ;
    public final Enumerator ruleBodyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArg.g:3954:2: ( ( (enumLiteral_0= 'static' ) | (enumLiteral_1= 'dynamic' ) | (enumLiteral_2= 'kinematic' ) ) )
            // InternalArg.g:3955:2: ( (enumLiteral_0= 'static' ) | (enumLiteral_1= 'dynamic' ) | (enumLiteral_2= 'kinematic' ) )
            {
            // InternalArg.g:3955:2: ( (enumLiteral_0= 'static' ) | (enumLiteral_1= 'dynamic' ) | (enumLiteral_2= 'kinematic' ) )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt57=1;
                }
                break;
            case 105:
                {
                alt57=2;
                }
                break;
            case 106:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalArg.g:3956:3: (enumLiteral_0= 'static' )
                    {
                    // InternalArg.g:3956:3: (enumLiteral_0= 'static' )
                    // InternalArg.g:3957:4: enumLiteral_0= 'static'
                    {
                    enumLiteral_0=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getBodyTypeAccess().getStaticEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBodyTypeAccess().getStaticEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:3964:3: (enumLiteral_1= 'dynamic' )
                    {
                    // InternalArg.g:3964:3: (enumLiteral_1= 'dynamic' )
                    // InternalArg.g:3965:4: enumLiteral_1= 'dynamic'
                    {
                    enumLiteral_1=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getBodyTypeAccess().getDynamicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBodyTypeAccess().getDynamicEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:3972:3: (enumLiteral_2= 'kinematic' )
                    {
                    // InternalArg.g:3972:3: (enumLiteral_2= 'kinematic' )
                    // InternalArg.g:3973:4: enumLiteral_2= 'kinematic'
                    {
                    enumLiteral_2=(Token)match(input,106,FOLLOW_2); 

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
    // InternalArg.g:3983:1: ruleBasicActions returns [Enumerator current=null] : ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'win' ) | (enumLiteral_2= 'lose' ) | (enumLiteral_3= 'none' ) ) ;
    public final Enumerator ruleBasicActions() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalArg.g:3989:2: ( ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'win' ) | (enumLiteral_2= 'lose' ) | (enumLiteral_3= 'none' ) ) )
            // InternalArg.g:3990:2: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'win' ) | (enumLiteral_2= 'lose' ) | (enumLiteral_3= 'none' ) )
            {
            // InternalArg.g:3990:2: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'win' ) | (enumLiteral_2= 'lose' ) | (enumLiteral_3= 'none' ) )
            int alt58=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt58=1;
                }
                break;
            case 24:
                {
                alt58=2;
                }
                break;
            case 25:
                {
                alt58=3;
                }
                break;
            case 107:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalArg.g:3991:3: (enumLiteral_0= 'start' )
                    {
                    // InternalArg.g:3991:3: (enumLiteral_0= 'start' )
                    // InternalArg.g:3992:4: enumLiteral_0= 'start'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getBasicActionsAccess().getStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBasicActionsAccess().getStartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:3999:3: (enumLiteral_1= 'win' )
                    {
                    // InternalArg.g:3999:3: (enumLiteral_1= 'win' )
                    // InternalArg.g:4000:4: enumLiteral_1= 'win'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getBasicActionsAccess().getWinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBasicActionsAccess().getWinEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:4007:3: (enumLiteral_2= 'lose' )
                    {
                    // InternalArg.g:4007:3: (enumLiteral_2= 'lose' )
                    // InternalArg.g:4008:4: enumLiteral_2= 'lose'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getBasicActionsAccess().getLoseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBasicActionsAccess().getLoseEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalArg.g:4015:3: (enumLiteral_3= 'none' )
                    {
                    // InternalArg.g:4015:3: (enumLiteral_3= 'none' )
                    // InternalArg.g:4016:4: enumLiteral_3= 'none'
                    {
                    enumLiteral_3=(Token)match(input,107,FOLLOW_2); 

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
    // InternalArg.g:4026:1: ruleAction returns [Enumerator current=null] : ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'delete' ) ) ;
    public final Enumerator ruleAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArg.g:4032:2: ( ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'delete' ) ) )
            // InternalArg.g:4033:2: ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'delete' ) )
            {
            // InternalArg.g:4033:2: ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'delete' ) )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt59=1;
                }
                break;
            case 109:
                {
                alt59=2;
                }
                break;
            case 110:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalArg.g:4034:3: (enumLiteral_0= 'create' )
                    {
                    // InternalArg.g:4034:3: (enumLiteral_0= 'create' )
                    // InternalArg.g:4035:4: enumLiteral_0= 'create'
                    {
                    enumLiteral_0=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getCreateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getCreateEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:4042:3: (enumLiteral_1= 'edit' )
                    {
                    // InternalArg.g:4042:3: (enumLiteral_1= 'edit' )
                    // InternalArg.g:4043:4: enumLiteral_1= 'edit'
                    {
                    enumLiteral_1=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getEditEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getEditEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:4050:3: (enumLiteral_2= 'delete' )
                    {
                    // InternalArg.g:4050:3: (enumLiteral_2= 'delete' )
                    // InternalArg.g:4051:4: enumLiteral_2= 'delete'
                    {
                    enumLiteral_2=(Token)match(input,110,FOLLOW_2); 

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
    // InternalArg.g:4061:1: rulePosition returns [Enumerator current=null] : ( (enumLiteral_0= 'front' ) | (enumLiteral_1= 'default' ) | (enumLiteral_2= 'back' ) ) ;
    public final Enumerator rulePosition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArg.g:4067:2: ( ( (enumLiteral_0= 'front' ) | (enumLiteral_1= 'default' ) | (enumLiteral_2= 'back' ) ) )
            // InternalArg.g:4068:2: ( (enumLiteral_0= 'front' ) | (enumLiteral_1= 'default' ) | (enumLiteral_2= 'back' ) )
            {
            // InternalArg.g:4068:2: ( (enumLiteral_0= 'front' ) | (enumLiteral_1= 'default' ) | (enumLiteral_2= 'back' ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt60=1;
                }
                break;
            case 112:
                {
                alt60=2;
                }
                break;
            case 113:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalArg.g:4069:3: (enumLiteral_0= 'front' )
                    {
                    // InternalArg.g:4069:3: (enumLiteral_0= 'front' )
                    // InternalArg.g:4070:4: enumLiteral_0= 'front'
                    {
                    enumLiteral_0=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getPositionAccess().getFrontEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPositionAccess().getFrontEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:4077:3: (enumLiteral_1= 'default' )
                    {
                    // InternalArg.g:4077:3: (enumLiteral_1= 'default' )
                    // InternalArg.g:4078:4: enumLiteral_1= 'default'
                    {
                    enumLiteral_1=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getPositionAccess().getDefaultEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPositionAccess().getDefaultEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:4085:3: (enumLiteral_2= 'back' )
                    {
                    // InternalArg.g:4085:3: (enumLiteral_2= 'back' )
                    // InternalArg.g:4086:4: enumLiteral_2= 'back'
                    {
                    enumLiteral_2=(Token)match(input,113,FOLLOW_2); 

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
    // InternalArg.g:4096:1: ruleLogicOps returns [Enumerator current=null] : ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) ;
    public final Enumerator ruleLogicOps() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalArg.g:4102:2: ( ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) )
            // InternalArg.g:4103:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            {
            // InternalArg.g:4103:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==114) ) {
                alt61=1;
            }
            else if ( (LA61_0==115) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalArg.g:4104:3: (enumLiteral_0= '&' )
                    {
                    // InternalArg.g:4104:3: (enumLiteral_0= '&' )
                    // InternalArg.g:4105:4: enumLiteral_0= '&'
                    {
                    enumLiteral_0=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getLogicOpsAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicOpsAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:4112:3: (enumLiteral_1= '|' )
                    {
                    // InternalArg.g:4112:3: (enumLiteral_1= '|' )
                    // InternalArg.g:4113:4: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,115,FOLLOW_2); 

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
    // InternalArg.g:4123:1: ruleArithmOps returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) ) ;
    public final Enumerator ruleArithmOps() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalArg.g:4129:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) ) )
            // InternalArg.g:4130:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) )
            {
            // InternalArg.g:4130:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) )
            int alt62=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt62=1;
                }
                break;
            case 116:
                {
                alt62=2;
                }
                break;
            case 117:
                {
                alt62=3;
                }
                break;
            case 118:
                {
                alt62=4;
                }
                break;
            case 119:
                {
                alt62=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalArg.g:4131:3: (enumLiteral_0= '=' )
                    {
                    // InternalArg.g:4131:3: (enumLiteral_0= '=' )
                    // InternalArg.g:4132:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getArithmOpsAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getArithmOpsAccess().getEqualEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:4139:3: (enumLiteral_1= '>' )
                    {
                    // InternalArg.g:4139:3: (enumLiteral_1= '>' )
                    // InternalArg.g:4140:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getArithmOpsAccess().getGreaterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getArithmOpsAccess().getGreaterEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:4147:3: (enumLiteral_2= '>=' )
                    {
                    // InternalArg.g:4147:3: (enumLiteral_2= '>=' )
                    // InternalArg.g:4148:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getArithmOpsAccess().getGreaterEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getArithmOpsAccess().getGreaterEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalArg.g:4155:3: (enumLiteral_3= '<' )
                    {
                    // InternalArg.g:4155:3: (enumLiteral_3= '<' )
                    // InternalArg.g:4156:4: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getArithmOpsAccess().getLowerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getArithmOpsAccess().getLowerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalArg.g:4163:3: (enumLiteral_4= '<=' )
                    {
                    // InternalArg.g:4163:3: (enumLiteral_4= '<=' )
                    // InternalArg.g:4164:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,119,FOLLOW_2); 

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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000078008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000070008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000060008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000070L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x000000E000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0200200000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0200000000000040L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000004008000L,0x000000000001E000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000003800000L,0x0000080000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000004008000L,0x000000000001C000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000004008000L,0x0000000000018000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000008000L,0x0000000000018000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000008000L,0x0000000000010000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000700000000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000002L,0x000000000F800000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0003800000000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000002L,0x000000000F000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000002L,0x000000000E000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000200000000070L,0x0000000380000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000800000000L,0x00F0000000000000L});

}