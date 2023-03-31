package ardsl.parser.antlr.internal;

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
import ardsl.services.ArdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArdslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'{'", "'URI'", "'elements'", "','", "'}'", "'-'", "'.'", "'E'", "'e'", "'dependences'", "'abstract'", "'invisible'", "':'", "'['", "']'", "'='", "'isParam'", "'isKey'", "'readOnly'", "'containtment'", "'min'", "'max'", "'target'", "'opposite'", "'Graphic'", "'element'", "'versions'", "'versionsName'", "'constraints'", "'v1'", "'->'", "'v2'", "'v3'", "'plane'", "'overlaps'", "'sizeMin'", "'sizeMax'", "'xVariation'", "'yVariation'", "'zVariation'", "'rotation'", "'Physics'", "'body'", "'forces'", "'contacts'", "'mass'", "'bodyType'", "'charge'", "'friction'", "'rollingFriction'", "'restitution'", "'damping'", "'angularDamping'", "'gesture'", "'id'", "'collision'", "'contact'", "'Gamelogic'", "'Display'", "'start'", "'win'", "'lose'", "'score'", "'Actions'", "'Collisions'", "'Buttons'", "'Elements'", "'goal'", "'lives'", "'action'", "'display'", "'timeEach'", "'changes'", "'to'", "'do'", "'in'", "'named'", "'where'", "'scale'", "'stat'", "'changeStat'", "'force'", "'rules'", "'if('", "')'", "'!'", "'('", "'All'", "'any'", "'horizontal'", "'vertical'", "'static'", "'dynamic'", "'kinematic'", "'create'", "'edit'", "'delete'", "'front'", "'default'", "'back'", "'&'", "'|'", "'>'", "'>='", "'<'", "'<='"
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
    // InternalArdsl.g:65:1: entryRuleOntological returns [EObject current=null] : iv_ruleOntological= ruleOntological EOF ;
    public final EObject entryRuleOntological() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntological = null;


        try {
            // InternalArdsl.g:65:52: (iv_ruleOntological= ruleOntological EOF )
            // InternalArdsl.g:66:2: iv_ruleOntological= ruleOntological EOF
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
    // InternalArdsl.g:72:1: ruleOntological returns [EObject current=null] : (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'URI' ( (lv_URI_4_0= ruleEString ) ) )? otherlv_5= 'elements' otherlv_6= '{' ( (lv_classes_7_0= ruleClass ) ) (otherlv_8= ',' ( (lv_classes_9_0= ruleClass ) ) )* otherlv_10= '}' otherlv_11= '}' ( (lv_graphic_12_0= ruleGraphic ) ) ( (lv_physic_13_0= rulePhysics ) ) ( (lv_gameloop_14_0= ruleGameloop ) ) ) ;
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

        EObject lv_graphic_12_0 = null;

        EObject lv_physic_13_0 = null;

        EObject lv_gameloop_14_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:78:2: ( (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'URI' ( (lv_URI_4_0= ruleEString ) ) )? otherlv_5= 'elements' otherlv_6= '{' ( (lv_classes_7_0= ruleClass ) ) (otherlv_8= ',' ( (lv_classes_9_0= ruleClass ) ) )* otherlv_10= '}' otherlv_11= '}' ( (lv_graphic_12_0= ruleGraphic ) ) ( (lv_physic_13_0= rulePhysics ) ) ( (lv_gameloop_14_0= ruleGameloop ) ) ) )
            // InternalArdsl.g:79:2: (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'URI' ( (lv_URI_4_0= ruleEString ) ) )? otherlv_5= 'elements' otherlv_6= '{' ( (lv_classes_7_0= ruleClass ) ) (otherlv_8= ',' ( (lv_classes_9_0= ruleClass ) ) )* otherlv_10= '}' otherlv_11= '}' ( (lv_graphic_12_0= ruleGraphic ) ) ( (lv_physic_13_0= rulePhysics ) ) ( (lv_gameloop_14_0= ruleGameloop ) ) )
            {
            // InternalArdsl.g:79:2: (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'URI' ( (lv_URI_4_0= ruleEString ) ) )? otherlv_5= 'elements' otherlv_6= '{' ( (lv_classes_7_0= ruleClass ) ) (otherlv_8= ',' ( (lv_classes_9_0= ruleClass ) ) )* otherlv_10= '}' otherlv_11= '}' ( (lv_graphic_12_0= ruleGraphic ) ) ( (lv_physic_13_0= rulePhysics ) ) ( (lv_gameloop_14_0= ruleGameloop ) ) )
            // InternalArdsl.g:80:3: otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'URI' ( (lv_URI_4_0= ruleEString ) ) )? otherlv_5= 'elements' otherlv_6= '{' ( (lv_classes_7_0= ruleClass ) ) (otherlv_8= ',' ( (lv_classes_9_0= ruleClass ) ) )* otherlv_10= '}' otherlv_11= '}' ( (lv_graphic_12_0= ruleGraphic ) ) ( (lv_physic_13_0= rulePhysics ) ) ( (lv_gameloop_14_0= ruleGameloop ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOntologicalAccess().getGameKeyword_0());
            		
            // InternalArdsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalArdsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalArdsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalArdsl.g:86:5: lv_name_1_0= ruleEString
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
            		
            // InternalArdsl.g:107:3: (otherlv_3= 'URI' ( (lv_URI_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalArdsl.g:108:4: otherlv_3= 'URI' ( (lv_URI_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getOntologicalAccess().getURIKeyword_3_0());
                    			
                    // InternalArdsl.g:112:4: ( (lv_URI_4_0= ruleEString ) )
                    // InternalArdsl.g:113:5: (lv_URI_4_0= ruleEString )
                    {
                    // InternalArdsl.g:113:5: (lv_URI_4_0= ruleEString )
                    // InternalArdsl.g:114:6: lv_URI_4_0= ruleEString
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
            		
            // InternalArdsl.g:140:3: ( (lv_classes_7_0= ruleClass ) )
            // InternalArdsl.g:141:4: (lv_classes_7_0= ruleClass )
            {
            // InternalArdsl.g:141:4: (lv_classes_7_0= ruleClass )
            // InternalArdsl.g:142:5: lv_classes_7_0= ruleClass
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

            // InternalArdsl.g:159:3: (otherlv_8= ',' ( (lv_classes_9_0= ruleClass ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalArdsl.g:160:4: otherlv_8= ',' ( (lv_classes_9_0= ruleClass ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getOntologicalAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalArdsl.g:164:4: ( (lv_classes_9_0= ruleClass ) )
            	    // InternalArdsl.g:165:5: (lv_classes_9_0= ruleClass )
            	    {
            	    // InternalArdsl.g:165:5: (lv_classes_9_0= ruleClass )
            	    // InternalArdsl.g:166:6: lv_classes_9_0= ruleClass
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
            		
            otherlv_11=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getOntologicalAccess().getRightCurlyBracketKeyword_9());
            		
            // InternalArdsl.g:192:3: ( (lv_graphic_12_0= ruleGraphic ) )
            // InternalArdsl.g:193:4: (lv_graphic_12_0= ruleGraphic )
            {
            // InternalArdsl.g:193:4: (lv_graphic_12_0= ruleGraphic )
            // InternalArdsl.g:194:5: lv_graphic_12_0= ruleGraphic
            {

            					newCompositeNode(grammarAccess.getOntologicalAccess().getGraphicGraphicParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_10);
            lv_graphic_12_0=ruleGraphic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRule());
            					}
            					set(
            						current,
            						"graphic",
            						lv_graphic_12_0,
            						"ardsl.Ardsl.Graphic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArdsl.g:211:3: ( (lv_physic_13_0= rulePhysics ) )
            // InternalArdsl.g:212:4: (lv_physic_13_0= rulePhysics )
            {
            // InternalArdsl.g:212:4: (lv_physic_13_0= rulePhysics )
            // InternalArdsl.g:213:5: lv_physic_13_0= rulePhysics
            {

            					newCompositeNode(grammarAccess.getOntologicalAccess().getPhysicPhysicsParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_physic_13_0=rulePhysics();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRule());
            					}
            					set(
            						current,
            						"physic",
            						lv_physic_13_0,
            						"ardsl.Ardsl.Physics");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArdsl.g:230:3: ( (lv_gameloop_14_0= ruleGameloop ) )
            // InternalArdsl.g:231:4: (lv_gameloop_14_0= ruleGameloop )
            {
            // InternalArdsl.g:231:4: (lv_gameloop_14_0= ruleGameloop )
            // InternalArdsl.g:232:5: lv_gameloop_14_0= ruleGameloop
            {

            					newCompositeNode(grammarAccess.getOntologicalAccess().getGameloopGameloopParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_2);
            lv_gameloop_14_0=ruleGameloop();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologicalRule());
            					}
            					set(
            						current,
            						"gameloop",
            						lv_gameloop_14_0,
            						"ardsl.Ardsl.Gameloop");
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


    // $ANTLR start "entryRuleEString"
    // InternalArdsl.g:253:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalArdsl.g:253:47: (iv_ruleEString= ruleEString EOF )
            // InternalArdsl.g:254:2: iv_ruleEString= ruleEString EOF
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
    // InternalArdsl.g:260:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalArdsl.g:266:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalArdsl.g:267:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalArdsl.g:267:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalArdsl.g:268:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalArdsl.g:276:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEDouble"
    // InternalArdsl.g:287:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalArdsl.g:287:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalArdsl.g:288:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalArdsl.g:294:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalArdsl.g:300:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalArdsl.g:301:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalArdsl.g:301:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalArdsl.g:302:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalArdsl.g:302:3: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalArdsl.g:303:4: kw= '-'
                    {
                    kw=(Token)match(input,17,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalArdsl.g:309:3: (this_INT_1= RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalArdsl.g:310:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_13); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,18,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_15); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalArdsl.g:330:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=19 && LA8_0<=20)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalArdsl.g:331:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalArdsl.g:331:4: (kw= 'E' | kw= 'e' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==19) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==20) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalArdsl.g:332:5: kw= 'E'
                            {
                            kw=(Token)match(input,19,FOLLOW_16); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalArdsl.g:338:5: kw= 'e'
                            {
                            kw=(Token)match(input,20,FOLLOW_16); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalArdsl.g:344:4: (kw= '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==17) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalArdsl.g:345:5: kw= '-'
                            {
                            kw=(Token)match(input,17,FOLLOW_14); 

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


    // $ANTLR start "entryRuleEInt"
    // InternalArdsl.g:363:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalArdsl.g:363:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalArdsl.g:364:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalArdsl.g:370:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalArdsl.g:376:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalArdsl.g:377:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalArdsl.g:377:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalArdsl.g:378:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalArdsl.g:378:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalArdsl.g:379:4: kw= '-'
                    {
                    kw=(Token)match(input,17,FOLLOW_14); 

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


    // $ANTLR start "entryRuleClass"
    // InternalArdsl.g:396:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalArdsl.g:396:46: (iv_ruleClass= ruleClass EOF )
            // InternalArdsl.g:397:2: iv_ruleClass= ruleClass EOF
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
    // InternalArdsl.g:403:1: ruleClass returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )? (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )? otherlv_11= '}' ( (lv_abstract_12_0= 'abstract' ) )? ( (lv_noSCN_13_0= 'invisible' ) )? ) ;
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
            // InternalArdsl.g:409:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )? (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )? otherlv_11= '}' ( (lv_abstract_12_0= 'abstract' ) )? ( (lv_noSCN_13_0= 'invisible' ) )? ) )
            // InternalArdsl.g:410:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )? (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )? otherlv_11= '}' ( (lv_abstract_12_0= 'abstract' ) )? ( (lv_noSCN_13_0= 'invisible' ) )? )
            {
            // InternalArdsl.g:410:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )? (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )? otherlv_11= '}' ( (lv_abstract_12_0= 'abstract' ) )? ( (lv_noSCN_13_0= 'invisible' ) )? )
            // InternalArdsl.g:411:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )? (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )? otherlv_11= '}' ( (lv_abstract_12_0= 'abstract' ) )? ( (lv_noSCN_13_0= 'invisible' ) )?
            {
            // InternalArdsl.g:411:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArdsl.g:412:4: (lv_name_0_0= ruleEString )
            {
            // InternalArdsl.g:412:4: (lv_name_0_0= ruleEString )
            // InternalArdsl.g:413:5: lv_name_0_0= ruleEString
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

            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalArdsl.g:434:3: ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalArdsl.g:435:4: ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )*
                    {
                    // InternalArdsl.g:435:4: ( (lv_attributes_2_0= ruleAttribute ) )
                    // InternalArdsl.g:436:5: (lv_attributes_2_0= ruleAttribute )
                    {
                    // InternalArdsl.g:436:5: (lv_attributes_2_0= ruleAttribute )
                    // InternalArdsl.g:437:6: lv_attributes_2_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_18);
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

                    // InternalArdsl.g:454:4: (otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalArdsl.g:455:5: otherlv_3= ',' ( (lv_attributes_4_0= ruleAttribute ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getClassAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalArdsl.g:459:5: ( (lv_attributes_4_0= ruleAttribute ) )
                    	    // InternalArdsl.g:460:6: (lv_attributes_4_0= ruleAttribute )
                    	    {
                    	    // InternalArdsl.g:460:6: (lv_attributes_4_0= ruleAttribute )
                    	    // InternalArdsl.g:461:7: lv_attributes_4_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
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
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalArdsl.g:480:3: (otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalArdsl.g:481:4: otherlv_5= 'dependences' otherlv_6= '{' ( (lv_references_7_0= ruleReference ) ) (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getDependencesKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalArdsl.g:489:4: ( (lv_references_7_0= ruleReference ) )
                    // InternalArdsl.g:490:5: (lv_references_7_0= ruleReference )
                    {
                    // InternalArdsl.g:490:5: (lv_references_7_0= ruleReference )
                    // InternalArdsl.g:491:6: lv_references_7_0= ruleReference
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

                    // InternalArdsl.g:508:4: (otherlv_8= ',' ( (lv_references_9_0= ruleReference ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalArdsl.g:509:5: otherlv_8= ',' ( (lv_references_9_0= ruleReference ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getClassAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalArdsl.g:513:5: ( (lv_references_9_0= ruleReference ) )
                    	    // InternalArdsl.g:514:6: (lv_references_9_0= ruleReference )
                    	    {
                    	    // InternalArdsl.g:514:6: (lv_references_9_0= ruleReference )
                    	    // InternalArdsl.g:515:7: lv_references_9_0= ruleReference
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
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_11, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalArdsl.g:542:3: ( (lv_abstract_12_0= 'abstract' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalArdsl.g:543:4: (lv_abstract_12_0= 'abstract' )
                    {
                    // InternalArdsl.g:543:4: (lv_abstract_12_0= 'abstract' )
                    // InternalArdsl.g:544:5: lv_abstract_12_0= 'abstract'
                    {
                    lv_abstract_12_0=(Token)match(input,22,FOLLOW_20); 

                    					newLeafNode(lv_abstract_12_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", lv_abstract_12_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalArdsl.g:556:3: ( (lv_noSCN_13_0= 'invisible' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalArdsl.g:557:4: (lv_noSCN_13_0= 'invisible' )
                    {
                    // InternalArdsl.g:557:4: (lv_noSCN_13_0= 'invisible' )
                    // InternalArdsl.g:558:5: lv_noSCN_13_0= 'invisible'
                    {
                    lv_noSCN_13_0=(Token)match(input,23,FOLLOW_2); 

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
    // InternalArdsl.g:574:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalArdsl.g:574:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalArdsl.g:575:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalArdsl.g:581:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEString ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleEString ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )? ) ;
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
            // InternalArdsl.g:587:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEString ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleEString ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )? ) )
            // InternalArdsl.g:588:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEString ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleEString ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )? )
            {
            // InternalArdsl.g:588:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEString ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleEString ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )? )
            // InternalArdsl.g:589:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_type_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEString ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEString ) ) otherlv_7= ']' otherlv_8= '=' ( (lv_default_9_0= ruleEString ) ) ( (lv_isParam_10_0= 'isParam' ) )? ( (lv_isKey_11_0= 'isKey' ) )? ( (lv_readOnly_12_0= 'readOnly' ) )?
            {
            // InternalArdsl.g:589:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArdsl.g:590:4: (lv_name_0_0= ruleEString )
            {
            // InternalArdsl.g:590:4: (lv_name_0_0= ruleEString )
            // InternalArdsl.g:591:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalArdsl.g:612:3: ( (lv_type_2_0= ruleEString ) )
            // InternalArdsl.g:613:4: (lv_type_2_0= ruleEString )
            {
            // InternalArdsl.g:613:4: (lv_type_2_0= ruleEString )
            // InternalArdsl.g:614:5: lv_type_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalArdsl.g:635:3: ( (lv_min_4_0= ruleEString ) )
            // InternalArdsl.g:636:4: (lv_min_4_0= ruleEString )
            {
            // InternalArdsl.g:636:4: (lv_min_4_0= ruleEString )
            // InternalArdsl.g:637:5: lv_min_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getMinEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
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
            		
            // InternalArdsl.g:658:3: ( (lv_max_6_0= ruleEString ) )
            // InternalArdsl.g:659:4: (lv_max_6_0= ruleEString )
            {
            // InternalArdsl.g:659:4: (lv_max_6_0= ruleEString )
            // InternalArdsl.g:660:5: lv_max_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getMaxEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_7=(Token)match(input,26,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getEqualsSignKeyword_8());
            		
            // InternalArdsl.g:685:3: ( (lv_default_9_0= ruleEString ) )
            // InternalArdsl.g:686:4: (lv_default_9_0= ruleEString )
            {
            // InternalArdsl.g:686:4: (lv_default_9_0= ruleEString )
            // InternalArdsl.g:687:5: lv_default_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getDefaultEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalArdsl.g:704:3: ( (lv_isParam_10_0= 'isParam' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalArdsl.g:705:4: (lv_isParam_10_0= 'isParam' )
                    {
                    // InternalArdsl.g:705:4: (lv_isParam_10_0= 'isParam' )
                    // InternalArdsl.g:706:5: lv_isParam_10_0= 'isParam'
                    {
                    lv_isParam_10_0=(Token)match(input,28,FOLLOW_27); 

                    					newLeafNode(lv_isParam_10_0, grammarAccess.getAttributeAccess().getIsParamIsParamKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isParam", lv_isParam_10_0 != null, "isParam");
                    				

                    }


                    }
                    break;

            }

            // InternalArdsl.g:718:3: ( (lv_isKey_11_0= 'isKey' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalArdsl.g:719:4: (lv_isKey_11_0= 'isKey' )
                    {
                    // InternalArdsl.g:719:4: (lv_isKey_11_0= 'isKey' )
                    // InternalArdsl.g:720:5: lv_isKey_11_0= 'isKey'
                    {
                    lv_isKey_11_0=(Token)match(input,29,FOLLOW_28); 

                    					newLeafNode(lv_isKey_11_0, grammarAccess.getAttributeAccess().getIsKeyIsKeyKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isKey", lv_isKey_11_0 != null, "isKey");
                    				

                    }


                    }
                    break;

            }

            // InternalArdsl.g:732:3: ( (lv_readOnly_12_0= 'readOnly' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalArdsl.g:733:4: (lv_readOnly_12_0= 'readOnly' )
                    {
                    // InternalArdsl.g:733:4: (lv_readOnly_12_0= 'readOnly' )
                    // InternalArdsl.g:734:5: lv_readOnly_12_0= 'readOnly'
                    {
                    lv_readOnly_12_0=(Token)match(input,30,FOLLOW_2); 

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
    // InternalArdsl.g:750:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalArdsl.g:750:50: (iv_ruleReference= ruleReference EOF )
            // InternalArdsl.g:751:2: iv_ruleReference= ruleReference EOF
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
    // InternalArdsl.g:757:1: ruleReference returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )? otherlv_3= 'min' ( (lv_min_4_0= ruleEString ) ) otherlv_5= 'max' ( (lv_max_6_0= ruleEString ) ) otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )? ) ;
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
            // InternalArdsl.g:763:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )? otherlv_3= 'min' ( (lv_min_4_0= ruleEString ) ) otherlv_5= 'max' ( (lv_max_6_0= ruleEString ) ) otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )? ) )
            // InternalArdsl.g:764:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )? otherlv_3= 'min' ( (lv_min_4_0= ruleEString ) ) otherlv_5= 'max' ( (lv_max_6_0= ruleEString ) ) otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )? )
            {
            // InternalArdsl.g:764:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )? otherlv_3= 'min' ( (lv_min_4_0= ruleEString ) ) otherlv_5= 'max' ( (lv_max_6_0= ruleEString ) ) otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )? )
            // InternalArdsl.g:765:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )? otherlv_3= 'min' ( (lv_min_4_0= ruleEString ) ) otherlv_5= 'max' ( (lv_max_6_0= ruleEString ) ) otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )?
            {
            // InternalArdsl.g:765:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArdsl.g:766:4: (lv_name_0_0= ruleEString )
            {
            // InternalArdsl.g:766:4: (lv_name_0_0= ruleEString )
            // InternalArdsl.g:767:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArdsl.g:784:3: (otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalArdsl.g:785:4: otherlv_1= 'containtment' ( (lv_containtment_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getContaintmentKeyword_1_0());
                    			
                    // InternalArdsl.g:789:4: ( (lv_containtment_2_0= ruleEString ) )
                    // InternalArdsl.g:790:5: (lv_containtment_2_0= ruleEString )
                    {
                    // InternalArdsl.g:790:5: (lv_containtment_2_0= ruleEString )
                    // InternalArdsl.g:791:6: lv_containtment_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getContaintmentEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_containtment_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"containtment",
                    							lv_containtment_2_0,
                    							"ardsl.Ardsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getMinKeyword_2());
            		
            // InternalArdsl.g:813:3: ( (lv_min_4_0= ruleEString ) )
            // InternalArdsl.g:814:4: (lv_min_4_0= ruleEString )
            {
            // InternalArdsl.g:814:4: (lv_min_4_0= ruleEString )
            // InternalArdsl.g:815:5: lv_min_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getMinEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_min_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"min",
            						lv_min_4_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getMaxKeyword_4());
            		
            // InternalArdsl.g:836:3: ( (lv_max_6_0= ruleEString ) )
            // InternalArdsl.g:837:4: (lv_max_6_0= ruleEString )
            {
            // InternalArdsl.g:837:4: (lv_max_6_0= ruleEString )
            // InternalArdsl.g:838:5: lv_max_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getMaxEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_32);
            lv_max_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"max",
            						lv_max_6_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getReferenceAccess().getTargetKeyword_6());
            		
            // InternalArdsl.g:859:3: ( (lv_target_8_0= ruleEString ) )
            // InternalArdsl.g:860:4: (lv_target_8_0= ruleEString )
            {
            // InternalArdsl.g:860:4: (lv_target_8_0= ruleEString )
            // InternalArdsl.g:861:5: lv_target_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getTargetEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_33);
            lv_target_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_8_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArdsl.g:878:3: (otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalArdsl.g:879:4: otherlv_9= 'opposite' ( (lv_opposite_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getReferenceAccess().getOppositeKeyword_8_0());
                    			
                    // InternalArdsl.g:883:4: ( (lv_opposite_10_0= ruleEString ) )
                    // InternalArdsl.g:884:5: (lv_opposite_10_0= ruleEString )
                    {
                    // InternalArdsl.g:884:5: (lv_opposite_10_0= ruleEString )
                    // InternalArdsl.g:885:6: lv_opposite_10_0= ruleEString
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
                    							"ardsl.Ardsl.EString");
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


    // $ANTLR start "entryRuleGraphic"
    // InternalArdsl.g:907:1: entryRuleGraphic returns [EObject current=null] : iv_ruleGraphic= ruleGraphic EOF ;
    public final EObject entryRuleGraphic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphic = null;


        try {
            // InternalArdsl.g:907:48: (iv_ruleGraphic= ruleGraphic EOF )
            // InternalArdsl.g:908:2: iv_ruleGraphic= ruleGraphic EOF
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
    // InternalArdsl.g:914:1: ruleGraphic returns [EObject current=null] : (otherlv_0= 'Graphic' otherlv_1= '{' ( (lv_classes_2_0= ruleGraphicClass ) ) otherlv_3= '}' ) ;
    public final EObject ruleGraphic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_classes_2_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:920:2: ( (otherlv_0= 'Graphic' otherlv_1= '{' ( (lv_classes_2_0= ruleGraphicClass ) ) otherlv_3= '}' ) )
            // InternalArdsl.g:921:2: (otherlv_0= 'Graphic' otherlv_1= '{' ( (lv_classes_2_0= ruleGraphicClass ) ) otherlv_3= '}' )
            {
            // InternalArdsl.g:921:2: (otherlv_0= 'Graphic' otherlv_1= '{' ( (lv_classes_2_0= ruleGraphicClass ) ) otherlv_3= '}' )
            // InternalArdsl.g:922:3: otherlv_0= 'Graphic' otherlv_1= '{' ( (lv_classes_2_0= ruleGraphicClass ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicAccess().getGraphicKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphicAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalArdsl.g:930:3: ( (lv_classes_2_0= ruleGraphicClass ) )
            // InternalArdsl.g:931:4: (lv_classes_2_0= ruleGraphicClass )
            {
            // InternalArdsl.g:931:4: (lv_classes_2_0= ruleGraphicClass )
            // InternalArdsl.g:932:5: lv_classes_2_0= ruleGraphicClass
            {

            					newCompositeNode(grammarAccess.getGraphicAccess().getClassesGraphicClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_classes_2_0=ruleGraphicClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicRule());
            					}
            					add(
            						current,
            						"classes",
            						lv_classes_2_0,
            						"ardsl.Ardsl.GraphicClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphicAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleGraphicClass"
    // InternalArdsl.g:957:1: entryRuleGraphicClass returns [EObject current=null] : iv_ruleGraphicClass= ruleGraphicClass EOF ;
    public final EObject entryRuleGraphicClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicClass = null;


        try {
            // InternalArdsl.g:957:53: (iv_ruleGraphicClass= ruleGraphicClass EOF )
            // InternalArdsl.g:958:2: iv_ruleGraphicClass= ruleGraphicClass EOF
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
    // InternalArdsl.g:964:1: ruleGraphicClass returns [EObject current=null] : (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'versions' otherlv_3= '{' ( (lv_versions_4_0= ruleVersions ) ) otherlv_5= '}' otherlv_6= 'versionsName' otherlv_7= '{' ( (lv_vname_8_0= ruleVersionName ) ) otherlv_9= '}' otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraints ) ) otherlv_13= '}' ) ;
    public final EObject ruleGraphicClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_versions_4_0 = null;

        EObject lv_vname_8_0 = null;

        EObject lv_constraints_12_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:970:2: ( (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'versions' otherlv_3= '{' ( (lv_versions_4_0= ruleVersions ) ) otherlv_5= '}' otherlv_6= 'versionsName' otherlv_7= '{' ( (lv_vname_8_0= ruleVersionName ) ) otherlv_9= '}' otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraints ) ) otherlv_13= '}' ) )
            // InternalArdsl.g:971:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'versions' otherlv_3= '{' ( (lv_versions_4_0= ruleVersions ) ) otherlv_5= '}' otherlv_6= 'versionsName' otherlv_7= '{' ( (lv_vname_8_0= ruleVersionName ) ) otherlv_9= '}' otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraints ) ) otherlv_13= '}' )
            {
            // InternalArdsl.g:971:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'versions' otherlv_3= '{' ( (lv_versions_4_0= ruleVersions ) ) otherlv_5= '}' otherlv_6= 'versionsName' otherlv_7= '{' ( (lv_vname_8_0= ruleVersionName ) ) otherlv_9= '}' otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraints ) ) otherlv_13= '}' )
            // InternalArdsl.g:972:3: otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'versions' otherlv_3= '{' ( (lv_versions_4_0= ruleVersions ) ) otherlv_5= '}' otherlv_6= 'versionsName' otherlv_7= '{' ( (lv_vname_8_0= ruleVersionName ) ) otherlv_9= '}' otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraints ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphicClassAccess().getElementKeyword_0());
            		
            // InternalArdsl.g:976:3: ( ( ruleEString ) )
            // InternalArdsl.g:977:4: ( ruleEString )
            {
            // InternalArdsl.g:977:4: ( ruleEString )
            // InternalArdsl.g:978:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphicClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGraphicClassAccess().getOntoClassClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphicClassAccess().getVersionsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphicClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalArdsl.g:1000:3: ( (lv_versions_4_0= ruleVersions ) )
            // InternalArdsl.g:1001:4: (lv_versions_4_0= ruleVersions )
            {
            // InternalArdsl.g:1001:4: (lv_versions_4_0= ruleVersions )
            // InternalArdsl.g:1002:5: lv_versions_4_0= ruleVersions
            {

            					newCompositeNode(grammarAccess.getGraphicClassAccess().getVersionsVersionsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_versions_4_0=ruleVersions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicClassRule());
            					}
            					set(
            						current,
            						"versions",
            						lv_versions_4_0,
            						"ardsl.Ardsl.Versions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_37); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphicClassAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getGraphicClassAccess().getVersionsNameKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_7, grammarAccess.getGraphicClassAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalArdsl.g:1031:3: ( (lv_vname_8_0= ruleVersionName ) )
            // InternalArdsl.g:1032:4: (lv_vname_8_0= ruleVersionName )
            {
            // InternalArdsl.g:1032:4: (lv_vname_8_0= ruleVersionName )
            // InternalArdsl.g:1033:5: lv_vname_8_0= ruleVersionName
            {

            					newCompositeNode(grammarAccess.getGraphicClassAccess().getVnameVersionNameParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_8);
            lv_vname_8_0=ruleVersionName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicClassRule());
            					}
            					set(
            						current,
            						"vname",
            						lv_vname_8_0,
            						"ardsl.Ardsl.VersionName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_38); 

            			newLeafNode(otherlv_9, grammarAccess.getGraphicClassAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getGraphicClassAccess().getConstraintsKeyword_10());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_11, grammarAccess.getGraphicClassAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalArdsl.g:1062:3: ( (lv_constraints_12_0= ruleConstraints ) )
            // InternalArdsl.g:1063:4: (lv_constraints_12_0= ruleConstraints )
            {
            // InternalArdsl.g:1063:4: (lv_constraints_12_0= ruleConstraints )
            // InternalArdsl.g:1064:5: lv_constraints_12_0= ruleConstraints
            {

            					newCompositeNode(grammarAccess.getGraphicClassAccess().getConstraintsConstraintsParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_8);
            lv_constraints_12_0=ruleConstraints();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphicClassRule());
            					}
            					set(
            						current,
            						"constraints",
            						lv_constraints_12_0,
            						"ardsl.Ardsl.Constraints");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getGraphicClassAccess().getRightCurlyBracketKeyword_13());
            		

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


    // $ANTLR start "entryRuleVersions"
    // InternalArdsl.g:1089:1: entryRuleVersions returns [EObject current=null] : iv_ruleVersions= ruleVersions EOF ;
    public final EObject entryRuleVersions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersions = null;


        try {
            // InternalArdsl.g:1089:49: (iv_ruleVersions= ruleVersions EOF )
            // InternalArdsl.g:1090:2: iv_ruleVersions= ruleVersions EOF
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
    // InternalArdsl.g:1096:1: ruleVersions returns [EObject current=null] : (otherlv_0= 'v1' otherlv_1= '->' ( (lv_v1_2_0= ruleEString ) ) otherlv_3= 'v2' otherlv_4= '->' ( (lv_v2_5_0= ruleEString ) ) otherlv_6= 'v3' otherlv_7= '->' ( (lv_v3_8_0= ruleEString ) ) ) ;
    public final EObject ruleVersions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_v1_2_0 = null;

        AntlrDatatypeRuleToken lv_v2_5_0 = null;

        AntlrDatatypeRuleToken lv_v3_8_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:1102:2: ( (otherlv_0= 'v1' otherlv_1= '->' ( (lv_v1_2_0= ruleEString ) ) otherlv_3= 'v2' otherlv_4= '->' ( (lv_v2_5_0= ruleEString ) ) otherlv_6= 'v3' otherlv_7= '->' ( (lv_v3_8_0= ruleEString ) ) ) )
            // InternalArdsl.g:1103:2: (otherlv_0= 'v1' otherlv_1= '->' ( (lv_v1_2_0= ruleEString ) ) otherlv_3= 'v2' otherlv_4= '->' ( (lv_v2_5_0= ruleEString ) ) otherlv_6= 'v3' otherlv_7= '->' ( (lv_v3_8_0= ruleEString ) ) )
            {
            // InternalArdsl.g:1103:2: (otherlv_0= 'v1' otherlv_1= '->' ( (lv_v1_2_0= ruleEString ) ) otherlv_3= 'v2' otherlv_4= '->' ( (lv_v2_5_0= ruleEString ) ) otherlv_6= 'v3' otherlv_7= '->' ( (lv_v3_8_0= ruleEString ) ) )
            // InternalArdsl.g:1104:3: otherlv_0= 'v1' otherlv_1= '->' ( (lv_v1_2_0= ruleEString ) ) otherlv_3= 'v2' otherlv_4= '->' ( (lv_v2_5_0= ruleEString ) ) otherlv_6= 'v3' otherlv_7= '->' ( (lv_v3_8_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getVersionsAccess().getV1Keyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionsAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalArdsl.g:1112:3: ( (lv_v1_2_0= ruleEString ) )
            // InternalArdsl.g:1113:4: (lv_v1_2_0= ruleEString )
            {
            // InternalArdsl.g:1113:4: (lv_v1_2_0= ruleEString )
            // InternalArdsl.g:1114:5: lv_v1_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVersionsAccess().getV1EStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_v1_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVersionsRule());
            					}
            					set(
            						current,
            						"v1",
            						lv_v1_2_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getVersionsAccess().getV2Keyword_3());
            		
            otherlv_4=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVersionsAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalArdsl.g:1139:3: ( (lv_v2_5_0= ruleEString ) )
            // InternalArdsl.g:1140:4: (lv_v2_5_0= ruleEString )
            {
            // InternalArdsl.g:1140:4: (lv_v2_5_0= ruleEString )
            // InternalArdsl.g:1141:5: lv_v2_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVersionsAccess().getV2EStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_42);
            lv_v2_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVersionsRule());
            					}
            					set(
            						current,
            						"v2",
            						lv_v2_5_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,44,FOLLOW_40); 

            			newLeafNode(otherlv_6, grammarAccess.getVersionsAccess().getV3Keyword_6());
            		
            otherlv_7=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getVersionsAccess().getHyphenMinusGreaterThanSignKeyword_7());
            		
            // InternalArdsl.g:1166:3: ( (lv_v3_8_0= ruleEString ) )
            // InternalArdsl.g:1167:4: (lv_v3_8_0= ruleEString )
            {
            // InternalArdsl.g:1167:4: (lv_v3_8_0= ruleEString )
            // InternalArdsl.g:1168:5: lv_v3_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVersionsAccess().getV3EStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_v3_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVersionsRule());
            					}
            					set(
            						current,
            						"v3",
            						lv_v3_8_0,
            						"ardsl.Ardsl.EString");
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


    // $ANTLR start "entryRuleVersionName"
    // InternalArdsl.g:1189:1: entryRuleVersionName returns [EObject current=null] : iv_ruleVersionName= ruleVersionName EOF ;
    public final EObject entryRuleVersionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionName = null;


        try {
            // InternalArdsl.g:1189:52: (iv_ruleVersionName= ruleVersionName EOF )
            // InternalArdsl.g:1190:2: iv_ruleVersionName= ruleVersionName EOF
            {
             newCompositeNode(grammarAccess.getVersionNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersionName=ruleVersionName();

            state._fsp--;

             current =iv_ruleVersionName; 
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
    // $ANTLR end "entryRuleVersionName"


    // $ANTLR start "ruleVersionName"
    // InternalArdsl.g:1196:1: ruleVersionName returns [EObject current=null] : (otherlv_0= 'v1' otherlv_1= '->' ( (lv_v1_2_0= ruleEString ) ) otherlv_3= 'v2' otherlv_4= '->' ( (lv_v2_5_0= ruleEString ) ) otherlv_6= 'v3' otherlv_7= '->' ( (lv_v3_8_0= ruleEString ) ) ) ;
    public final EObject ruleVersionName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_v1_2_0 = null;

        AntlrDatatypeRuleToken lv_v2_5_0 = null;

        AntlrDatatypeRuleToken lv_v3_8_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:1202:2: ( (otherlv_0= 'v1' otherlv_1= '->' ( (lv_v1_2_0= ruleEString ) ) otherlv_3= 'v2' otherlv_4= '->' ( (lv_v2_5_0= ruleEString ) ) otherlv_6= 'v3' otherlv_7= '->' ( (lv_v3_8_0= ruleEString ) ) ) )
            // InternalArdsl.g:1203:2: (otherlv_0= 'v1' otherlv_1= '->' ( (lv_v1_2_0= ruleEString ) ) otherlv_3= 'v2' otherlv_4= '->' ( (lv_v2_5_0= ruleEString ) ) otherlv_6= 'v3' otherlv_7= '->' ( (lv_v3_8_0= ruleEString ) ) )
            {
            // InternalArdsl.g:1203:2: (otherlv_0= 'v1' otherlv_1= '->' ( (lv_v1_2_0= ruleEString ) ) otherlv_3= 'v2' otherlv_4= '->' ( (lv_v2_5_0= ruleEString ) ) otherlv_6= 'v3' otherlv_7= '->' ( (lv_v3_8_0= ruleEString ) ) )
            // InternalArdsl.g:1204:3: otherlv_0= 'v1' otherlv_1= '->' ( (lv_v1_2_0= ruleEString ) ) otherlv_3= 'v2' otherlv_4= '->' ( (lv_v2_5_0= ruleEString ) ) otherlv_6= 'v3' otherlv_7= '->' ( (lv_v3_8_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getVersionNameAccess().getV1Keyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionNameAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalArdsl.g:1212:3: ( (lv_v1_2_0= ruleEString ) )
            // InternalArdsl.g:1213:4: (lv_v1_2_0= ruleEString )
            {
            // InternalArdsl.g:1213:4: (lv_v1_2_0= ruleEString )
            // InternalArdsl.g:1214:5: lv_v1_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVersionNameAccess().getV1EStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_v1_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVersionNameRule());
            					}
            					set(
            						current,
            						"v1",
            						lv_v1_2_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getVersionNameAccess().getV2Keyword_3());
            		
            otherlv_4=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVersionNameAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalArdsl.g:1239:3: ( (lv_v2_5_0= ruleEString ) )
            // InternalArdsl.g:1240:4: (lv_v2_5_0= ruleEString )
            {
            // InternalArdsl.g:1240:4: (lv_v2_5_0= ruleEString )
            // InternalArdsl.g:1241:5: lv_v2_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVersionNameAccess().getV2EStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_42);
            lv_v2_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVersionNameRule());
            					}
            					set(
            						current,
            						"v2",
            						lv_v2_5_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,44,FOLLOW_40); 

            			newLeafNode(otherlv_6, grammarAccess.getVersionNameAccess().getV3Keyword_6());
            		
            otherlv_7=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getVersionNameAccess().getHyphenMinusGreaterThanSignKeyword_7());
            		
            // InternalArdsl.g:1266:3: ( (lv_v3_8_0= ruleEString ) )
            // InternalArdsl.g:1267:4: (lv_v3_8_0= ruleEString )
            {
            // InternalArdsl.g:1267:4: (lv_v3_8_0= ruleEString )
            // InternalArdsl.g:1268:5: lv_v3_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVersionNameAccess().getV3EStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_v3_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVersionNameRule());
            					}
            					set(
            						current,
            						"v3",
            						lv_v3_8_0,
            						"ardsl.Ardsl.EString");
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
    // $ANTLR end "ruleVersionName"


    // $ANTLR start "entryRuleConstraints"
    // InternalArdsl.g:1289:1: entryRuleConstraints returns [EObject current=null] : iv_ruleConstraints= ruleConstraints EOF ;
    public final EObject entryRuleConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraints = null;


        try {
            // InternalArdsl.g:1289:52: (iv_ruleConstraints= ruleConstraints EOF )
            // InternalArdsl.g:1290:2: iv_ruleConstraints= ruleConstraints EOF
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
    // InternalArdsl.g:1296:1: ruleConstraints returns [EObject current=null] : (otherlv_0= 'plane' ( (lv_planes_1_0= rulePlanes ) ) ( (lv_overlapping_2_0= 'overlaps' ) ) otherlv_3= 'sizeMin' ( (lv_sizeMin_4_0= ruleEDouble ) ) otherlv_5= 'sizeMax' ( (lv_sizeMax_6_0= ruleEDouble ) ) otherlv_7= 'xVariation' ( (lv_xToOriginPos_8_0= ruleEDouble ) ) otherlv_9= 'yVariation' ( (lv_yToOriginPos_10_0= ruleEDouble ) ) otherlv_11= 'zVariation' ( (lv_zToOriginPos_12_0= ruleEDouble ) ) otherlv_13= 'rotation' ( (lv_rotation_14_0= ruleEInt ) ) ) ;
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
            // InternalArdsl.g:1302:2: ( (otherlv_0= 'plane' ( (lv_planes_1_0= rulePlanes ) ) ( (lv_overlapping_2_0= 'overlaps' ) ) otherlv_3= 'sizeMin' ( (lv_sizeMin_4_0= ruleEDouble ) ) otherlv_5= 'sizeMax' ( (lv_sizeMax_6_0= ruleEDouble ) ) otherlv_7= 'xVariation' ( (lv_xToOriginPos_8_0= ruleEDouble ) ) otherlv_9= 'yVariation' ( (lv_yToOriginPos_10_0= ruleEDouble ) ) otherlv_11= 'zVariation' ( (lv_zToOriginPos_12_0= ruleEDouble ) ) otherlv_13= 'rotation' ( (lv_rotation_14_0= ruleEInt ) ) ) )
            // InternalArdsl.g:1303:2: (otherlv_0= 'plane' ( (lv_planes_1_0= rulePlanes ) ) ( (lv_overlapping_2_0= 'overlaps' ) ) otherlv_3= 'sizeMin' ( (lv_sizeMin_4_0= ruleEDouble ) ) otherlv_5= 'sizeMax' ( (lv_sizeMax_6_0= ruleEDouble ) ) otherlv_7= 'xVariation' ( (lv_xToOriginPos_8_0= ruleEDouble ) ) otherlv_9= 'yVariation' ( (lv_yToOriginPos_10_0= ruleEDouble ) ) otherlv_11= 'zVariation' ( (lv_zToOriginPos_12_0= ruleEDouble ) ) otherlv_13= 'rotation' ( (lv_rotation_14_0= ruleEInt ) ) )
            {
            // InternalArdsl.g:1303:2: (otherlv_0= 'plane' ( (lv_planes_1_0= rulePlanes ) ) ( (lv_overlapping_2_0= 'overlaps' ) ) otherlv_3= 'sizeMin' ( (lv_sizeMin_4_0= ruleEDouble ) ) otherlv_5= 'sizeMax' ( (lv_sizeMax_6_0= ruleEDouble ) ) otherlv_7= 'xVariation' ( (lv_xToOriginPos_8_0= ruleEDouble ) ) otherlv_9= 'yVariation' ( (lv_yToOriginPos_10_0= ruleEDouble ) ) otherlv_11= 'zVariation' ( (lv_zToOriginPos_12_0= ruleEDouble ) ) otherlv_13= 'rotation' ( (lv_rotation_14_0= ruleEInt ) ) )
            // InternalArdsl.g:1304:3: otherlv_0= 'plane' ( (lv_planes_1_0= rulePlanes ) ) ( (lv_overlapping_2_0= 'overlaps' ) ) otherlv_3= 'sizeMin' ( (lv_sizeMin_4_0= ruleEDouble ) ) otherlv_5= 'sizeMax' ( (lv_sizeMax_6_0= ruleEDouble ) ) otherlv_7= 'xVariation' ( (lv_xToOriginPos_8_0= ruleEDouble ) ) otherlv_9= 'yVariation' ( (lv_yToOriginPos_10_0= ruleEDouble ) ) otherlv_11= 'zVariation' ( (lv_zToOriginPos_12_0= ruleEDouble ) ) otherlv_13= 'rotation' ( (lv_rotation_14_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintsAccess().getPlaneKeyword_0());
            		
            // InternalArdsl.g:1308:3: ( (lv_planes_1_0= rulePlanes ) )
            // InternalArdsl.g:1309:4: (lv_planes_1_0= rulePlanes )
            {
            // InternalArdsl.g:1309:4: (lv_planes_1_0= rulePlanes )
            // InternalArdsl.g:1310:5: lv_planes_1_0= rulePlanes
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
            						"ardsl.Ardsl.Planes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArdsl.g:1327:3: ( (lv_overlapping_2_0= 'overlaps' ) )
            // InternalArdsl.g:1328:4: (lv_overlapping_2_0= 'overlaps' )
            {
            // InternalArdsl.g:1328:4: (lv_overlapping_2_0= 'overlaps' )
            // InternalArdsl.g:1329:5: lv_overlapping_2_0= 'overlaps'
            {
            lv_overlapping_2_0=(Token)match(input,46,FOLLOW_45); 

            					newLeafNode(lv_overlapping_2_0, grammarAccess.getConstraintsAccess().getOverlappingOverlapsKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintsRule());
            					}
            					setWithLastConsumed(current, "overlapping", lv_overlapping_2_0 != null, "overlaps");
            				

            }


            }

            otherlv_3=(Token)match(input,47,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintsAccess().getSizeMinKeyword_3());
            		
            // InternalArdsl.g:1345:3: ( (lv_sizeMin_4_0= ruleEDouble ) )
            // InternalArdsl.g:1346:4: (lv_sizeMin_4_0= ruleEDouble )
            {
            // InternalArdsl.g:1346:4: (lv_sizeMin_4_0= ruleEDouble )
            // InternalArdsl.g:1347:5: lv_sizeMin_4_0= ruleEDouble
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
            						"ardsl.Ardsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,48,FOLLOW_46); 

            			newLeafNode(otherlv_5, grammarAccess.getConstraintsAccess().getSizeMaxKeyword_5());
            		
            // InternalArdsl.g:1368:3: ( (lv_sizeMax_6_0= ruleEDouble ) )
            // InternalArdsl.g:1369:4: (lv_sizeMax_6_0= ruleEDouble )
            {
            // InternalArdsl.g:1369:4: (lv_sizeMax_6_0= ruleEDouble )
            // InternalArdsl.g:1370:5: lv_sizeMax_6_0= ruleEDouble
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
            						"ardsl.Ardsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,49,FOLLOW_46); 

            			newLeafNode(otherlv_7, grammarAccess.getConstraintsAccess().getXVariationKeyword_7());
            		
            // InternalArdsl.g:1391:3: ( (lv_xToOriginPos_8_0= ruleEDouble ) )
            // InternalArdsl.g:1392:4: (lv_xToOriginPos_8_0= ruleEDouble )
            {
            // InternalArdsl.g:1392:4: (lv_xToOriginPos_8_0= ruleEDouble )
            // InternalArdsl.g:1393:5: lv_xToOriginPos_8_0= ruleEDouble
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
            						"ardsl.Ardsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,50,FOLLOW_46); 

            			newLeafNode(otherlv_9, grammarAccess.getConstraintsAccess().getYVariationKeyword_9());
            		
            // InternalArdsl.g:1414:3: ( (lv_yToOriginPos_10_0= ruleEDouble ) )
            // InternalArdsl.g:1415:4: (lv_yToOriginPos_10_0= ruleEDouble )
            {
            // InternalArdsl.g:1415:4: (lv_yToOriginPos_10_0= ruleEDouble )
            // InternalArdsl.g:1416:5: lv_yToOriginPos_10_0= ruleEDouble
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
            						"ardsl.Ardsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,51,FOLLOW_46); 

            			newLeafNode(otherlv_11, grammarAccess.getConstraintsAccess().getZVariationKeyword_11());
            		
            // InternalArdsl.g:1437:3: ( (lv_zToOriginPos_12_0= ruleEDouble ) )
            // InternalArdsl.g:1438:4: (lv_zToOriginPos_12_0= ruleEDouble )
            {
            // InternalArdsl.g:1438:4: (lv_zToOriginPos_12_0= ruleEDouble )
            // InternalArdsl.g:1439:5: lv_zToOriginPos_12_0= ruleEDouble
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
            						"ardsl.Ardsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,52,FOLLOW_16); 

            			newLeafNode(otherlv_13, grammarAccess.getConstraintsAccess().getRotationKeyword_13());
            		
            // InternalArdsl.g:1460:3: ( (lv_rotation_14_0= ruleEInt ) )
            // InternalArdsl.g:1461:4: (lv_rotation_14_0= ruleEInt )
            {
            // InternalArdsl.g:1461:4: (lv_rotation_14_0= ruleEInt )
            // InternalArdsl.g:1462:5: lv_rotation_14_0= ruleEInt
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
            						"ardsl.Ardsl.EInt");
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


    // $ANTLR start "entryRulePhysics"
    // InternalArdsl.g:1483:1: entryRulePhysics returns [EObject current=null] : iv_rulePhysics= rulePhysics EOF ;
    public final EObject entryRulePhysics() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysics = null;


        try {
            // InternalArdsl.g:1483:48: (iv_rulePhysics= rulePhysics EOF )
            // InternalArdsl.g:1484:2: iv_rulePhysics= rulePhysics EOF
            {
             newCompositeNode(grammarAccess.getPhysicsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhysics=rulePhysics();

            state._fsp--;

             current =iv_rulePhysics; 
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
    // $ANTLR end "entryRulePhysics"


    // $ANTLR start "rulePhysics"
    // InternalArdsl.g:1490:1: rulePhysics returns [EObject current=null] : (otherlv_0= 'Physics' otherlv_1= '{' ( (lv_classes_2_0= rulePhysicClass ) ) otherlv_3= '}' ) ;
    public final EObject rulePhysics() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_classes_2_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:1496:2: ( (otherlv_0= 'Physics' otherlv_1= '{' ( (lv_classes_2_0= rulePhysicClass ) ) otherlv_3= '}' ) )
            // InternalArdsl.g:1497:2: (otherlv_0= 'Physics' otherlv_1= '{' ( (lv_classes_2_0= rulePhysicClass ) ) otherlv_3= '}' )
            {
            // InternalArdsl.g:1497:2: (otherlv_0= 'Physics' otherlv_1= '{' ( (lv_classes_2_0= rulePhysicClass ) ) otherlv_3= '}' )
            // InternalArdsl.g:1498:3: otherlv_0= 'Physics' otherlv_1= '{' ( (lv_classes_2_0= rulePhysicClass ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPhysicsAccess().getPhysicsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getPhysicsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalArdsl.g:1506:3: ( (lv_classes_2_0= rulePhysicClass ) )
            // InternalArdsl.g:1507:4: (lv_classes_2_0= rulePhysicClass )
            {
            // InternalArdsl.g:1507:4: (lv_classes_2_0= rulePhysicClass )
            // InternalArdsl.g:1508:5: lv_classes_2_0= rulePhysicClass
            {

            					newCompositeNode(grammarAccess.getPhysicsAccess().getClassesPhysicClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_classes_2_0=rulePhysicClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicsRule());
            					}
            					add(
            						current,
            						"classes",
            						lv_classes_2_0,
            						"ardsl.Ardsl.PhysicClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPhysicsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulePhysics"


    // $ANTLR start "entryRulePhysicClass"
    // InternalArdsl.g:1533:1: entryRulePhysicClass returns [EObject current=null] : iv_rulePhysicClass= rulePhysicClass EOF ;
    public final EObject entryRulePhysicClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicClass = null;


        try {
            // InternalArdsl.g:1533:52: (iv_rulePhysicClass= rulePhysicClass EOF )
            // InternalArdsl.g:1534:2: iv_rulePhysicClass= rulePhysicClass EOF
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
    // InternalArdsl.g:1540:1: rulePhysicClass returns [EObject current=null] : (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'body' otherlv_3= '{' ( (lv_physicBody_4_0= rulePhysicBody ) ) otherlv_5= '}' (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForces ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForces ) ) )* otherlv_11= '}' )? otherlv_12= 'contacts' otherlv_13= '{' ( (lv_bitMasks_14_0= ruleBitMasks ) ) otherlv_15= '}' ) ;
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
            // InternalArdsl.g:1546:2: ( (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'body' otherlv_3= '{' ( (lv_physicBody_4_0= rulePhysicBody ) ) otherlv_5= '}' (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForces ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForces ) ) )* otherlv_11= '}' )? otherlv_12= 'contacts' otherlv_13= '{' ( (lv_bitMasks_14_0= ruleBitMasks ) ) otherlv_15= '}' ) )
            // InternalArdsl.g:1547:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'body' otherlv_3= '{' ( (lv_physicBody_4_0= rulePhysicBody ) ) otherlv_5= '}' (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForces ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForces ) ) )* otherlv_11= '}' )? otherlv_12= 'contacts' otherlv_13= '{' ( (lv_bitMasks_14_0= ruleBitMasks ) ) otherlv_15= '}' )
            {
            // InternalArdsl.g:1547:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'body' otherlv_3= '{' ( (lv_physicBody_4_0= rulePhysicBody ) ) otherlv_5= '}' (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForces ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForces ) ) )* otherlv_11= '}' )? otherlv_12= 'contacts' otherlv_13= '{' ( (lv_bitMasks_14_0= ruleBitMasks ) ) otherlv_15= '}' )
            // InternalArdsl.g:1548:3: otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'body' otherlv_3= '{' ( (lv_physicBody_4_0= rulePhysicBody ) ) otherlv_5= '}' (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForces ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForces ) ) )* otherlv_11= '}' )? otherlv_12= 'contacts' otherlv_13= '{' ( (lv_bitMasks_14_0= ruleBitMasks ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPhysicClassAccess().getElementKeyword_0());
            		
            // InternalArdsl.g:1552:3: ( ( ruleEString ) )
            // InternalArdsl.g:1553:4: ( ruleEString )
            {
            // InternalArdsl.g:1553:4: ( ruleEString )
            // InternalArdsl.g:1554:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhysicClassRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPhysicClassAccess().getOntoClassClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_52);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPhysicClassAccess().getBodyKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalArdsl.g:1576:3: ( (lv_physicBody_4_0= rulePhysicBody ) )
            // InternalArdsl.g:1577:4: (lv_physicBody_4_0= rulePhysicBody )
            {
            // InternalArdsl.g:1577:4: (lv_physicBody_4_0= rulePhysicBody )
            // InternalArdsl.g:1578:5: lv_physicBody_4_0= rulePhysicBody
            {

            					newCompositeNode(grammarAccess.getPhysicClassAccess().getPhysicBodyPhysicBodyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_physicBody_4_0=rulePhysicBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicClassRule());
            					}
            					set(
            						current,
            						"physicBody",
            						lv_physicBody_4_0,
            						"ardsl.Ardsl.PhysicBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_54); 

            			newLeafNode(otherlv_5, grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalArdsl.g:1599:3: (otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForces ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForces ) ) )* otherlv_11= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==55) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalArdsl.g:1600:4: otherlv_6= 'forces' otherlv_7= '{' ( (lv_forces_8_0= ruleForces ) ) (otherlv_9= ',' ( (lv_forces_10_0= ruleForces ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,55,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getPhysicClassAccess().getForcesKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalArdsl.g:1608:4: ( (lv_forces_8_0= ruleForces ) )
                    // InternalArdsl.g:1609:5: (lv_forces_8_0= ruleForces )
                    {
                    // InternalArdsl.g:1609:5: (lv_forces_8_0= ruleForces )
                    // InternalArdsl.g:1610:6: lv_forces_8_0= ruleForces
                    {

                    						newCompositeNode(grammarAccess.getPhysicClassAccess().getForcesForcesParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_forces_8_0=ruleForces();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhysicClassRule());
                    						}
                    						add(
                    							current,
                    							"forces",
                    							lv_forces_8_0,
                    							"ardsl.Ardsl.Forces");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArdsl.g:1627:4: (otherlv_9= ',' ( (lv_forces_10_0= ruleForces ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalArdsl.g:1628:5: otherlv_9= ',' ( (lv_forces_10_0= ruleForces ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getPhysicClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalArdsl.g:1632:5: ( (lv_forces_10_0= ruleForces ) )
                    	    // InternalArdsl.g:1633:6: (lv_forces_10_0= ruleForces )
                    	    {
                    	    // InternalArdsl.g:1633:6: (lv_forces_10_0= ruleForces )
                    	    // InternalArdsl.g:1634:7: lv_forces_10_0= ruleForces
                    	    {

                    	    							newCompositeNode(grammarAccess.getPhysicClassAccess().getForcesForcesParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_forces_10_0=ruleForces();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPhysicClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"forces",
                    	    								lv_forces_10_0,
                    	    								"ardsl.Ardsl.Forces");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_55); 

                    				newLeafNode(otherlv_11, grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,56,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getPhysicClassAccess().getContactsKeyword_7());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_13, grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalArdsl.g:1665:3: ( (lv_bitMasks_14_0= ruleBitMasks ) )
            // InternalArdsl.g:1666:4: (lv_bitMasks_14_0= ruleBitMasks )
            {
            // InternalArdsl.g:1666:4: (lv_bitMasks_14_0= ruleBitMasks )
            // InternalArdsl.g:1667:5: lv_bitMasks_14_0= ruleBitMasks
            {

            					newCompositeNode(grammarAccess.getPhysicClassAccess().getBitMasksBitMasksParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_bitMasks_14_0=ruleBitMasks();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicClassRule());
            					}
            					set(
            						current,
            						"bitMasks",
            						lv_bitMasks_14_0,
            						"ardsl.Ardsl.BitMasks");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,16,FOLLOW_2); 

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
    // InternalArdsl.g:1692:1: entryRulePhysicBody returns [EObject current=null] : iv_rulePhysicBody= rulePhysicBody EOF ;
    public final EObject entryRulePhysicBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicBody = null;


        try {
            // InternalArdsl.g:1692:51: (iv_rulePhysicBody= rulePhysicBody EOF )
            // InternalArdsl.g:1693:2: iv_rulePhysicBody= rulePhysicBody EOF
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
    // InternalArdsl.g:1699:1: rulePhysicBody returns [EObject current=null] : (otherlv_0= 'mass' ( (lv_mass_1_0= ruleEDouble ) ) otherlv_2= 'bodyType' ( (lv_bodyType_3_0= ruleBodyType ) ) otherlv_4= 'charge' ( (lv_charge_5_0= ruleEDouble ) ) otherlv_6= 'friction' ( (lv_friction_7_0= ruleEDouble ) ) otherlv_8= 'rollingFriction' ( (lv_rollingFriction_9_0= ruleEDouble ) ) otherlv_10= 'restitution' ( (lv_restitution_11_0= ruleEDouble ) ) otherlv_12= 'damping' ( (lv_damping_13_0= ruleEDouble ) ) otherlv_14= 'angularDamping' ( (lv_angularDamping_15_0= ruleEDouble ) ) ) ;
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
            // InternalArdsl.g:1705:2: ( (otherlv_0= 'mass' ( (lv_mass_1_0= ruleEDouble ) ) otherlv_2= 'bodyType' ( (lv_bodyType_3_0= ruleBodyType ) ) otherlv_4= 'charge' ( (lv_charge_5_0= ruleEDouble ) ) otherlv_6= 'friction' ( (lv_friction_7_0= ruleEDouble ) ) otherlv_8= 'rollingFriction' ( (lv_rollingFriction_9_0= ruleEDouble ) ) otherlv_10= 'restitution' ( (lv_restitution_11_0= ruleEDouble ) ) otherlv_12= 'damping' ( (lv_damping_13_0= ruleEDouble ) ) otherlv_14= 'angularDamping' ( (lv_angularDamping_15_0= ruleEDouble ) ) ) )
            // InternalArdsl.g:1706:2: (otherlv_0= 'mass' ( (lv_mass_1_0= ruleEDouble ) ) otherlv_2= 'bodyType' ( (lv_bodyType_3_0= ruleBodyType ) ) otherlv_4= 'charge' ( (lv_charge_5_0= ruleEDouble ) ) otherlv_6= 'friction' ( (lv_friction_7_0= ruleEDouble ) ) otherlv_8= 'rollingFriction' ( (lv_rollingFriction_9_0= ruleEDouble ) ) otherlv_10= 'restitution' ( (lv_restitution_11_0= ruleEDouble ) ) otherlv_12= 'damping' ( (lv_damping_13_0= ruleEDouble ) ) otherlv_14= 'angularDamping' ( (lv_angularDamping_15_0= ruleEDouble ) ) )
            {
            // InternalArdsl.g:1706:2: (otherlv_0= 'mass' ( (lv_mass_1_0= ruleEDouble ) ) otherlv_2= 'bodyType' ( (lv_bodyType_3_0= ruleBodyType ) ) otherlv_4= 'charge' ( (lv_charge_5_0= ruleEDouble ) ) otherlv_6= 'friction' ( (lv_friction_7_0= ruleEDouble ) ) otherlv_8= 'rollingFriction' ( (lv_rollingFriction_9_0= ruleEDouble ) ) otherlv_10= 'restitution' ( (lv_restitution_11_0= ruleEDouble ) ) otherlv_12= 'damping' ( (lv_damping_13_0= ruleEDouble ) ) otherlv_14= 'angularDamping' ( (lv_angularDamping_15_0= ruleEDouble ) ) )
            // InternalArdsl.g:1707:3: otherlv_0= 'mass' ( (lv_mass_1_0= ruleEDouble ) ) otherlv_2= 'bodyType' ( (lv_bodyType_3_0= ruleBodyType ) ) otherlv_4= 'charge' ( (lv_charge_5_0= ruleEDouble ) ) otherlv_6= 'friction' ( (lv_friction_7_0= ruleEDouble ) ) otherlv_8= 'rollingFriction' ( (lv_rollingFriction_9_0= ruleEDouble ) ) otherlv_10= 'restitution' ( (lv_restitution_11_0= ruleEDouble ) ) otherlv_12= 'damping' ( (lv_damping_13_0= ruleEDouble ) ) otherlv_14= 'angularDamping' ( (lv_angularDamping_15_0= ruleEDouble ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getPhysicBodyAccess().getMassKeyword_0());
            		
            // InternalArdsl.g:1711:3: ( (lv_mass_1_0= ruleEDouble ) )
            // InternalArdsl.g:1712:4: (lv_mass_1_0= ruleEDouble )
            {
            // InternalArdsl.g:1712:4: (lv_mass_1_0= ruleEDouble )
            // InternalArdsl.g:1713:5: lv_mass_1_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getMassEDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_57);
            lv_mass_1_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicBodyRule());
            					}
            					set(
            						current,
            						"mass",
            						lv_mass_1_0,
            						"ardsl.Ardsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,58,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getPhysicBodyAccess().getBodyTypeKeyword_2());
            		
            // InternalArdsl.g:1734:3: ( (lv_bodyType_3_0= ruleBodyType ) )
            // InternalArdsl.g:1735:4: (lv_bodyType_3_0= ruleBodyType )
            {
            // InternalArdsl.g:1735:4: (lv_bodyType_3_0= ruleBodyType )
            // InternalArdsl.g:1736:5: lv_bodyType_3_0= ruleBodyType
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getBodyTypeBodyTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_59);
            lv_bodyType_3_0=ruleBodyType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicBodyRule());
            					}
            					set(
            						current,
            						"bodyType",
            						lv_bodyType_3_0,
            						"ardsl.Ardsl.BodyType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,59,FOLLOW_46); 

            			newLeafNode(otherlv_4, grammarAccess.getPhysicBodyAccess().getChargeKeyword_4());
            		
            // InternalArdsl.g:1757:3: ( (lv_charge_5_0= ruleEDouble ) )
            // InternalArdsl.g:1758:4: (lv_charge_5_0= ruleEDouble )
            {
            // InternalArdsl.g:1758:4: (lv_charge_5_0= ruleEDouble )
            // InternalArdsl.g:1759:5: lv_charge_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getChargeEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_60);
            lv_charge_5_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicBodyRule());
            					}
            					set(
            						current,
            						"charge",
            						lv_charge_5_0,
            						"ardsl.Ardsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,60,FOLLOW_46); 

            			newLeafNode(otherlv_6, grammarAccess.getPhysicBodyAccess().getFrictionKeyword_6());
            		
            // InternalArdsl.g:1780:3: ( (lv_friction_7_0= ruleEDouble ) )
            // InternalArdsl.g:1781:4: (lv_friction_7_0= ruleEDouble )
            {
            // InternalArdsl.g:1781:4: (lv_friction_7_0= ruleEDouble )
            // InternalArdsl.g:1782:5: lv_friction_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getFrictionEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_61);
            lv_friction_7_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicBodyRule());
            					}
            					set(
            						current,
            						"friction",
            						lv_friction_7_0,
            						"ardsl.Ardsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,61,FOLLOW_46); 

            			newLeafNode(otherlv_8, grammarAccess.getPhysicBodyAccess().getRollingFrictionKeyword_8());
            		
            // InternalArdsl.g:1803:3: ( (lv_rollingFriction_9_0= ruleEDouble ) )
            // InternalArdsl.g:1804:4: (lv_rollingFriction_9_0= ruleEDouble )
            {
            // InternalArdsl.g:1804:4: (lv_rollingFriction_9_0= ruleEDouble )
            // InternalArdsl.g:1805:5: lv_rollingFriction_9_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getRollingFrictionEDoubleParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_62);
            lv_rollingFriction_9_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicBodyRule());
            					}
            					set(
            						current,
            						"rollingFriction",
            						lv_rollingFriction_9_0,
            						"ardsl.Ardsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,62,FOLLOW_46); 

            			newLeafNode(otherlv_10, grammarAccess.getPhysicBodyAccess().getRestitutionKeyword_10());
            		
            // InternalArdsl.g:1826:3: ( (lv_restitution_11_0= ruleEDouble ) )
            // InternalArdsl.g:1827:4: (lv_restitution_11_0= ruleEDouble )
            {
            // InternalArdsl.g:1827:4: (lv_restitution_11_0= ruleEDouble )
            // InternalArdsl.g:1828:5: lv_restitution_11_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getRestitutionEDoubleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_63);
            lv_restitution_11_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicBodyRule());
            					}
            					set(
            						current,
            						"restitution",
            						lv_restitution_11_0,
            						"ardsl.Ardsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,63,FOLLOW_46); 

            			newLeafNode(otherlv_12, grammarAccess.getPhysicBodyAccess().getDampingKeyword_12());
            		
            // InternalArdsl.g:1849:3: ( (lv_damping_13_0= ruleEDouble ) )
            // InternalArdsl.g:1850:4: (lv_damping_13_0= ruleEDouble )
            {
            // InternalArdsl.g:1850:4: (lv_damping_13_0= ruleEDouble )
            // InternalArdsl.g:1851:5: lv_damping_13_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPhysicBodyAccess().getDampingEDoubleParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_64);
            lv_damping_13_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicBodyRule());
            					}
            					set(
            						current,
            						"damping",
            						lv_damping_13_0,
            						"ardsl.Ardsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,64,FOLLOW_46); 

            			newLeafNode(otherlv_14, grammarAccess.getPhysicBodyAccess().getAngularDampingKeyword_14());
            		
            // InternalArdsl.g:1872:3: ( (lv_angularDamping_15_0= ruleEDouble ) )
            // InternalArdsl.g:1873:4: (lv_angularDamping_15_0= ruleEDouble )
            {
            // InternalArdsl.g:1873:4: (lv_angularDamping_15_0= ruleEDouble )
            // InternalArdsl.g:1874:5: lv_angularDamping_15_0= ruleEDouble
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
            						"ardsl.Ardsl.EDouble");
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


    // $ANTLR start "entryRuleForces"
    // InternalArdsl.g:1895:1: entryRuleForces returns [EObject current=null] : iv_ruleForces= ruleForces EOF ;
    public final EObject entryRuleForces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForces = null;


        try {
            // InternalArdsl.g:1895:47: (iv_ruleForces= ruleForces EOF )
            // InternalArdsl.g:1896:2: iv_ruleForces= ruleForces EOF
            {
             newCompositeNode(grammarAccess.getForcesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForces=ruleForces();

            state._fsp--;

             current =iv_ruleForces; 
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
    // $ANTLR end "entryRuleForces"


    // $ANTLR start "ruleForces"
    // InternalArdsl.g:1902:1: ruleForces returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'gesture' ( (lv_gesture_3_0= ruleEString ) ) (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )? ) ;
    public final EObject ruleForces() throws RecognitionException {
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
            // InternalArdsl.g:1908:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'gesture' ( (lv_gesture_3_0= ruleEString ) ) (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )? ) )
            // InternalArdsl.g:1909:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'gesture' ( (lv_gesture_3_0= ruleEString ) ) (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )? )
            {
            // InternalArdsl.g:1909:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'gesture' ( (lv_gesture_3_0= ruleEString ) ) (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )? )
            // InternalArdsl.g:1910:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'gesture' ( (lv_gesture_3_0= ruleEString ) ) (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )?
            {
            // InternalArdsl.g:1910:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArdsl.g:1911:4: (lv_name_0_0= ruleEString )
            {
            // InternalArdsl.g:1911:4: (lv_name_0_0= ruleEString )
            // InternalArdsl.g:1912:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getForcesAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForcesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getForcesAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getForcesAccess().getGestureKeyword_2());
            		
            // InternalArdsl.g:1937:3: ( (lv_gesture_3_0= ruleEString ) )
            // InternalArdsl.g:1938:4: (lv_gesture_3_0= ruleEString )
            {
            // InternalArdsl.g:1938:4: (lv_gesture_3_0= ruleEString )
            // InternalArdsl.g:1939:5: lv_gesture_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getForcesAccess().getGestureEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_66);
            lv_gesture_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForcesRule());
            					}
            					set(
            						current,
            						"gesture",
            						lv_gesture_3_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArdsl.g:1956:3: (otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalArdsl.g:1957:4: otherlv_4= '[' ( (lv_xVector_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_yVector_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_zVector_9_0= ruleEDouble ) ) otherlv_10= ']'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_46); 

                    				newLeafNode(otherlv_4, grammarAccess.getForcesAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalArdsl.g:1961:4: ( (lv_xVector_5_0= ruleEDouble ) )
                    // InternalArdsl.g:1962:5: (lv_xVector_5_0= ruleEDouble )
                    {
                    // InternalArdsl.g:1962:5: (lv_xVector_5_0= ruleEDouble )
                    // InternalArdsl.g:1963:6: lv_xVector_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getForcesAccess().getXVectorEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_xVector_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForcesRule());
                    						}
                    						set(
                    							current,
                    							"xVector",
                    							lv_xVector_5_0,
                    							"ardsl.Ardsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_46); 

                    				newLeafNode(otherlv_6, grammarAccess.getForcesAccess().getCommaKeyword_4_2());
                    			
                    // InternalArdsl.g:1984:4: ( (lv_yVector_7_0= ruleEDouble ) )
                    // InternalArdsl.g:1985:5: (lv_yVector_7_0= ruleEDouble )
                    {
                    // InternalArdsl.g:1985:5: (lv_yVector_7_0= ruleEDouble )
                    // InternalArdsl.g:1986:6: lv_yVector_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getForcesAccess().getYVectorEDoubleParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_yVector_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForcesRule());
                    						}
                    						set(
                    							current,
                    							"yVector",
                    							lv_yVector_7_0,
                    							"ardsl.Ardsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_46); 

                    				newLeafNode(otherlv_8, grammarAccess.getForcesAccess().getCommaKeyword_4_4());
                    			
                    // InternalArdsl.g:2007:4: ( (lv_zVector_9_0= ruleEDouble ) )
                    // InternalArdsl.g:2008:5: (lv_zVector_9_0= ruleEDouble )
                    {
                    // InternalArdsl.g:2008:5: (lv_zVector_9_0= ruleEDouble )
                    // InternalArdsl.g:2009:6: lv_zVector_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getForcesAccess().getZVectorEDoubleParserRuleCall_4_5_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_zVector_9_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForcesRule());
                    						}
                    						set(
                    							current,
                    							"zVector",
                    							lv_zVector_9_0,
                    							"ardsl.Ardsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getForcesAccess().getRightSquareBracketKeyword_4_6());
                    			

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
    // $ANTLR end "ruleForces"


    // $ANTLR start "entryRuleBitMasks"
    // InternalArdsl.g:2035:1: entryRuleBitMasks returns [EObject current=null] : iv_ruleBitMasks= ruleBitMasks EOF ;
    public final EObject entryRuleBitMasks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitMasks = null;


        try {
            // InternalArdsl.g:2035:49: (iv_ruleBitMasks= ruleBitMasks EOF )
            // InternalArdsl.g:2036:2: iv_ruleBitMasks= ruleBitMasks EOF
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
    // InternalArdsl.g:2042:1: ruleBitMasks returns [EObject current=null] : (otherlv_0= 'id' ( (lv_category_1_0= ruleEInt ) ) otherlv_2= 'collision' ( (lv_collision_3_0= ruleEInt ) ) otherlv_4= 'contact' ( (lv_contactTest_5_0= ruleEInt ) ) ) ;
    public final EObject ruleBitMasks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_category_1_0 = null;

        AntlrDatatypeRuleToken lv_collision_3_0 = null;

        AntlrDatatypeRuleToken lv_contactTest_5_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:2048:2: ( (otherlv_0= 'id' ( (lv_category_1_0= ruleEInt ) ) otherlv_2= 'collision' ( (lv_collision_3_0= ruleEInt ) ) otherlv_4= 'contact' ( (lv_contactTest_5_0= ruleEInt ) ) ) )
            // InternalArdsl.g:2049:2: (otherlv_0= 'id' ( (lv_category_1_0= ruleEInt ) ) otherlv_2= 'collision' ( (lv_collision_3_0= ruleEInt ) ) otherlv_4= 'contact' ( (lv_contactTest_5_0= ruleEInt ) ) )
            {
            // InternalArdsl.g:2049:2: (otherlv_0= 'id' ( (lv_category_1_0= ruleEInt ) ) otherlv_2= 'collision' ( (lv_collision_3_0= ruleEInt ) ) otherlv_4= 'contact' ( (lv_contactTest_5_0= ruleEInt ) ) )
            // InternalArdsl.g:2050:3: otherlv_0= 'id' ( (lv_category_1_0= ruleEInt ) ) otherlv_2= 'collision' ( (lv_collision_3_0= ruleEInt ) ) otherlv_4= 'contact' ( (lv_contactTest_5_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getBitMasksAccess().getIdKeyword_0());
            		
            // InternalArdsl.g:2054:3: ( (lv_category_1_0= ruleEInt ) )
            // InternalArdsl.g:2055:4: (lv_category_1_0= ruleEInt )
            {
            // InternalArdsl.g:2055:4: (lv_category_1_0= ruleEInt )
            // InternalArdsl.g:2056:5: lv_category_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBitMasksAccess().getCategoryEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_67);
            lv_category_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBitMasksRule());
            					}
            					set(
            						current,
            						"category",
            						lv_category_1_0,
            						"ardsl.Ardsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,67,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getBitMasksAccess().getCollisionKeyword_2());
            		
            // InternalArdsl.g:2077:3: ( (lv_collision_3_0= ruleEInt ) )
            // InternalArdsl.g:2078:4: (lv_collision_3_0= ruleEInt )
            {
            // InternalArdsl.g:2078:4: (lv_collision_3_0= ruleEInt )
            // InternalArdsl.g:2079:5: lv_collision_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBitMasksAccess().getCollisionEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_68);
            lv_collision_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBitMasksRule());
            					}
            					set(
            						current,
            						"collision",
            						lv_collision_3_0,
            						"ardsl.Ardsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,68,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getBitMasksAccess().getContactKeyword_4());
            		
            // InternalArdsl.g:2100:3: ( (lv_contactTest_5_0= ruleEInt ) )
            // InternalArdsl.g:2101:4: (lv_contactTest_5_0= ruleEInt )
            {
            // InternalArdsl.g:2101:4: (lv_contactTest_5_0= ruleEInt )
            // InternalArdsl.g:2102:5: lv_contactTest_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBitMasksAccess().getContactTestEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_contactTest_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBitMasksRule());
            					}
            					set(
            						current,
            						"contactTest",
            						lv_contactTest_5_0,
            						"ardsl.Ardsl.EInt");
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
    // $ANTLR end "ruleBitMasks"


    // $ANTLR start "entryRuleGameloop"
    // InternalArdsl.g:2123:1: entryRuleGameloop returns [EObject current=null] : iv_ruleGameloop= ruleGameloop EOF ;
    public final EObject entryRuleGameloop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameloop = null;


        try {
            // InternalArdsl.g:2123:49: (iv_ruleGameloop= ruleGameloop EOF )
            // InternalArdsl.g:2124:2: iv_ruleGameloop= ruleGameloop EOF
            {
             newCompositeNode(grammarAccess.getGameloopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGameloop=ruleGameloop();

            state._fsp--;

             current =iv_ruleGameloop; 
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
    // $ANTLR end "entryRuleGameloop"


    // $ANTLR start "ruleGameloop"
    // InternalArdsl.g:2130:1: ruleGameloop returns [EObject current=null] : (otherlv_0= 'Gamelogic' otherlv_1= '{' otherlv_2= 'Display' otherlv_3= ':' otherlv_4= 'start' ( (lv_start_5_0= ruleEString ) ) otherlv_6= 'win' ( (lv_win_7_0= ruleEString ) ) otherlv_8= 'lose' ( (lv_lose_9_0= ruleEString ) ) otherlv_10= 'score' otherlv_11= '{' ( (lv_score_12_0= ruleScore ) ) otherlv_13= '}' (otherlv_14= 'Actions' otherlv_15= '{' ( (lv_actionsTriggers_16_0= ruleActions ) ) (otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleActions ) ) )* otherlv_19= '}' )? (otherlv_20= 'Collisions' otherlv_21= '{' ( (lv_collisions_22_0= ruleCollisions ) ) (otherlv_23= ',' ( (lv_collisions_24_0= ruleCollisions ) ) )* otherlv_25= '}' )? (otherlv_26= 'Buttons' otherlv_27= '{' ( (lv_gamepad_28_0= ruleGamePad ) ) otherlv_29= '}' )? (otherlv_30= 'Elements' otherlv_31= '{' ( (lv_objInit_32_0= ruleObjInit ) ) (otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) ) )* otherlv_35= '}' )? otherlv_36= '}' ) ;
    public final EObject ruleGameloop() throws RecognitionException {
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
            // InternalArdsl.g:2136:2: ( (otherlv_0= 'Gamelogic' otherlv_1= '{' otherlv_2= 'Display' otherlv_3= ':' otherlv_4= 'start' ( (lv_start_5_0= ruleEString ) ) otherlv_6= 'win' ( (lv_win_7_0= ruleEString ) ) otherlv_8= 'lose' ( (lv_lose_9_0= ruleEString ) ) otherlv_10= 'score' otherlv_11= '{' ( (lv_score_12_0= ruleScore ) ) otherlv_13= '}' (otherlv_14= 'Actions' otherlv_15= '{' ( (lv_actionsTriggers_16_0= ruleActions ) ) (otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleActions ) ) )* otherlv_19= '}' )? (otherlv_20= 'Collisions' otherlv_21= '{' ( (lv_collisions_22_0= ruleCollisions ) ) (otherlv_23= ',' ( (lv_collisions_24_0= ruleCollisions ) ) )* otherlv_25= '}' )? (otherlv_26= 'Buttons' otherlv_27= '{' ( (lv_gamepad_28_0= ruleGamePad ) ) otherlv_29= '}' )? (otherlv_30= 'Elements' otherlv_31= '{' ( (lv_objInit_32_0= ruleObjInit ) ) (otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) ) )* otherlv_35= '}' )? otherlv_36= '}' ) )
            // InternalArdsl.g:2137:2: (otherlv_0= 'Gamelogic' otherlv_1= '{' otherlv_2= 'Display' otherlv_3= ':' otherlv_4= 'start' ( (lv_start_5_0= ruleEString ) ) otherlv_6= 'win' ( (lv_win_7_0= ruleEString ) ) otherlv_8= 'lose' ( (lv_lose_9_0= ruleEString ) ) otherlv_10= 'score' otherlv_11= '{' ( (lv_score_12_0= ruleScore ) ) otherlv_13= '}' (otherlv_14= 'Actions' otherlv_15= '{' ( (lv_actionsTriggers_16_0= ruleActions ) ) (otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleActions ) ) )* otherlv_19= '}' )? (otherlv_20= 'Collisions' otherlv_21= '{' ( (lv_collisions_22_0= ruleCollisions ) ) (otherlv_23= ',' ( (lv_collisions_24_0= ruleCollisions ) ) )* otherlv_25= '}' )? (otherlv_26= 'Buttons' otherlv_27= '{' ( (lv_gamepad_28_0= ruleGamePad ) ) otherlv_29= '}' )? (otherlv_30= 'Elements' otherlv_31= '{' ( (lv_objInit_32_0= ruleObjInit ) ) (otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) ) )* otherlv_35= '}' )? otherlv_36= '}' )
            {
            // InternalArdsl.g:2137:2: (otherlv_0= 'Gamelogic' otherlv_1= '{' otherlv_2= 'Display' otherlv_3= ':' otherlv_4= 'start' ( (lv_start_5_0= ruleEString ) ) otherlv_6= 'win' ( (lv_win_7_0= ruleEString ) ) otherlv_8= 'lose' ( (lv_lose_9_0= ruleEString ) ) otherlv_10= 'score' otherlv_11= '{' ( (lv_score_12_0= ruleScore ) ) otherlv_13= '}' (otherlv_14= 'Actions' otherlv_15= '{' ( (lv_actionsTriggers_16_0= ruleActions ) ) (otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleActions ) ) )* otherlv_19= '}' )? (otherlv_20= 'Collisions' otherlv_21= '{' ( (lv_collisions_22_0= ruleCollisions ) ) (otherlv_23= ',' ( (lv_collisions_24_0= ruleCollisions ) ) )* otherlv_25= '}' )? (otherlv_26= 'Buttons' otherlv_27= '{' ( (lv_gamepad_28_0= ruleGamePad ) ) otherlv_29= '}' )? (otherlv_30= 'Elements' otherlv_31= '{' ( (lv_objInit_32_0= ruleObjInit ) ) (otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) ) )* otherlv_35= '}' )? otherlv_36= '}' )
            // InternalArdsl.g:2138:3: otherlv_0= 'Gamelogic' otherlv_1= '{' otherlv_2= 'Display' otherlv_3= ':' otherlv_4= 'start' ( (lv_start_5_0= ruleEString ) ) otherlv_6= 'win' ( (lv_win_7_0= ruleEString ) ) otherlv_8= 'lose' ( (lv_lose_9_0= ruleEString ) ) otherlv_10= 'score' otherlv_11= '{' ( (lv_score_12_0= ruleScore ) ) otherlv_13= '}' (otherlv_14= 'Actions' otherlv_15= '{' ( (lv_actionsTriggers_16_0= ruleActions ) ) (otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleActions ) ) )* otherlv_19= '}' )? (otherlv_20= 'Collisions' otherlv_21= '{' ( (lv_collisions_22_0= ruleCollisions ) ) (otherlv_23= ',' ( (lv_collisions_24_0= ruleCollisions ) ) )* otherlv_25= '}' )? (otherlv_26= 'Buttons' otherlv_27= '{' ( (lv_gamepad_28_0= ruleGamePad ) ) otherlv_29= '}' )? (otherlv_30= 'Elements' otherlv_31= '{' ( (lv_objInit_32_0= ruleObjInit ) ) (otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) ) )* otherlv_35= '}' )? otherlv_36= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGameloopAccess().getGamelogicKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_69); 

            			newLeafNode(otherlv_1, grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,70,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getGameloopAccess().getDisplayKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_70); 

            			newLeafNode(otherlv_3, grammarAccess.getGameloopAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getGameloopAccess().getStartKeyword_4());
            		
            // InternalArdsl.g:2158:3: ( (lv_start_5_0= ruleEString ) )
            // InternalArdsl.g:2159:4: (lv_start_5_0= ruleEString )
            {
            // InternalArdsl.g:2159:4: (lv_start_5_0= ruleEString )
            // InternalArdsl.g:2160:5: lv_start_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGameloopAccess().getStartEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_71);
            lv_start_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameloopRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_5_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getGameloopAccess().getWinKeyword_6());
            		
            // InternalArdsl.g:2181:3: ( (lv_win_7_0= ruleEString ) )
            // InternalArdsl.g:2182:4: (lv_win_7_0= ruleEString )
            {
            // InternalArdsl.g:2182:4: (lv_win_7_0= ruleEString )
            // InternalArdsl.g:2183:5: lv_win_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGameloopAccess().getWinEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_72);
            lv_win_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameloopRule());
            					}
            					set(
            						current,
            						"win",
            						lv_win_7_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,73,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getGameloopAccess().getLoseKeyword_8());
            		
            // InternalArdsl.g:2204:3: ( (lv_lose_9_0= ruleEString ) )
            // InternalArdsl.g:2205:4: (lv_lose_9_0= ruleEString )
            {
            // InternalArdsl.g:2205:4: (lv_lose_9_0= ruleEString )
            // InternalArdsl.g:2206:5: lv_lose_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGameloopAccess().getLoseEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_73);
            lv_lose_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameloopRule());
            					}
            					set(
            						current,
            						"lose",
            						lv_lose_9_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,74,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getGameloopAccess().getScoreKeyword_10());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_11, grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalArdsl.g:2231:3: ( (lv_score_12_0= ruleScore ) )
            // InternalArdsl.g:2232:4: (lv_score_12_0= ruleScore )
            {
            // InternalArdsl.g:2232:4: (lv_score_12_0= ruleScore )
            // InternalArdsl.g:2233:5: lv_score_12_0= ruleScore
            {

            					newCompositeNode(grammarAccess.getGameloopAccess().getScoreScoreParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_8);
            lv_score_12_0=ruleScore();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameloopRule());
            					}
            					set(
            						current,
            						"score",
            						lv_score_12_0,
            						"ardsl.Ardsl.Score");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,16,FOLLOW_74); 

            			newLeafNode(otherlv_13, grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_13());
            		
            // InternalArdsl.g:2254:3: (otherlv_14= 'Actions' otherlv_15= '{' ( (lv_actionsTriggers_16_0= ruleActions ) ) (otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleActions ) ) )* otherlv_19= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==75) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalArdsl.g:2255:4: otherlv_14= 'Actions' otherlv_15= '{' ( (lv_actionsTriggers_16_0= ruleActions ) ) (otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleActions ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,75,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getGameloopAccess().getActionsKeyword_14_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalArdsl.g:2263:4: ( (lv_actionsTriggers_16_0= ruleActions ) )
                    // InternalArdsl.g:2264:5: (lv_actionsTriggers_16_0= ruleActions )
                    {
                    // InternalArdsl.g:2264:5: (lv_actionsTriggers_16_0= ruleActions )
                    // InternalArdsl.g:2265:6: lv_actionsTriggers_16_0= ruleActions
                    {

                    						newCompositeNode(grammarAccess.getGameloopAccess().getActionsTriggersActionsParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_actionsTriggers_16_0=ruleActions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameloopRule());
                    						}
                    						add(
                    							current,
                    							"actionsTriggers",
                    							lv_actionsTriggers_16_0,
                    							"ardsl.Ardsl.Actions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArdsl.g:2282:4: (otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleActions ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalArdsl.g:2283:5: otherlv_17= ',' ( (lv_actionsTriggers_18_0= ruleActions ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getGameloopAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalArdsl.g:2287:5: ( (lv_actionsTriggers_18_0= ruleActions ) )
                    	    // InternalArdsl.g:2288:6: (lv_actionsTriggers_18_0= ruleActions )
                    	    {
                    	    // InternalArdsl.g:2288:6: (lv_actionsTriggers_18_0= ruleActions )
                    	    // InternalArdsl.g:2289:7: lv_actionsTriggers_18_0= ruleActions
                    	    {

                    	    							newCompositeNode(grammarAccess.getGameloopAccess().getActionsTriggersActionsParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_actionsTriggers_18_0=ruleActions();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGameloopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actionsTriggers",
                    	    								lv_actionsTriggers_18_0,
                    	    								"ardsl.Ardsl.Actions");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,16,FOLLOW_75); 

                    				newLeafNode(otherlv_19, grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalArdsl.g:2312:3: (otherlv_20= 'Collisions' otherlv_21= '{' ( (lv_collisions_22_0= ruleCollisions ) ) (otherlv_23= ',' ( (lv_collisions_24_0= ruleCollisions ) ) )* otherlv_25= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==76) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalArdsl.g:2313:4: otherlv_20= 'Collisions' otherlv_21= '{' ( (lv_collisions_22_0= ruleCollisions ) ) (otherlv_23= ',' ( (lv_collisions_24_0= ruleCollisions ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,76,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getGameloopAccess().getCollisionsKeyword_15_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_34); 

                    				newLeafNode(otherlv_21, grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalArdsl.g:2321:4: ( (lv_collisions_22_0= ruleCollisions ) )
                    // InternalArdsl.g:2322:5: (lv_collisions_22_0= ruleCollisions )
                    {
                    // InternalArdsl.g:2322:5: (lv_collisions_22_0= ruleCollisions )
                    // InternalArdsl.g:2323:6: lv_collisions_22_0= ruleCollisions
                    {

                    						newCompositeNode(grammarAccess.getGameloopAccess().getCollisionsCollisionsParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_collisions_22_0=ruleCollisions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameloopRule());
                    						}
                    						add(
                    							current,
                    							"collisions",
                    							lv_collisions_22_0,
                    							"ardsl.Ardsl.Collisions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArdsl.g:2340:4: (otherlv_23= ',' ( (lv_collisions_24_0= ruleCollisions ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==15) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalArdsl.g:2341:5: otherlv_23= ',' ( (lv_collisions_24_0= ruleCollisions ) )
                    	    {
                    	    otherlv_23=(Token)match(input,15,FOLLOW_34); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getGameloopAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalArdsl.g:2345:5: ( (lv_collisions_24_0= ruleCollisions ) )
                    	    // InternalArdsl.g:2346:6: (lv_collisions_24_0= ruleCollisions )
                    	    {
                    	    // InternalArdsl.g:2346:6: (lv_collisions_24_0= ruleCollisions )
                    	    // InternalArdsl.g:2347:7: lv_collisions_24_0= ruleCollisions
                    	    {

                    	    							newCompositeNode(grammarAccess.getGameloopAccess().getCollisionsCollisionsParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_collisions_24_0=ruleCollisions();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGameloopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"collisions",
                    	    								lv_collisions_24_0,
                    	    								"ardsl.Ardsl.Collisions");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,16,FOLLOW_76); 

                    				newLeafNode(otherlv_25, grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            // InternalArdsl.g:2370:3: (otherlv_26= 'Buttons' otherlv_27= '{' ( (lv_gamepad_28_0= ruleGamePad ) ) otherlv_29= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==77) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalArdsl.g:2371:4: otherlv_26= 'Buttons' otherlv_27= '{' ( (lv_gamepad_28_0= ruleGamePad ) ) otherlv_29= '}'
                    {
                    otherlv_26=(Token)match(input,77,FOLLOW_4); 

                    				newLeafNode(otherlv_26, grammarAccess.getGameloopAccess().getButtonsKeyword_16_0());
                    			
                    otherlv_27=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalArdsl.g:2379:4: ( (lv_gamepad_28_0= ruleGamePad ) )
                    // InternalArdsl.g:2380:5: (lv_gamepad_28_0= ruleGamePad )
                    {
                    // InternalArdsl.g:2380:5: (lv_gamepad_28_0= ruleGamePad )
                    // InternalArdsl.g:2381:6: lv_gamepad_28_0= ruleGamePad
                    {

                    						newCompositeNode(grammarAccess.getGameloopAccess().getGamepadGamePadParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_gamepad_28_0=ruleGamePad();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameloopRule());
                    						}
                    						add(
                    							current,
                    							"gamepad",
                    							lv_gamepad_28_0,
                    							"ardsl.Ardsl.GamePad");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_29=(Token)match(input,16,FOLLOW_77); 

                    				newLeafNode(otherlv_29, grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_16_3());
                    			

                    }
                    break;

            }

            // InternalArdsl.g:2403:3: (otherlv_30= 'Elements' otherlv_31= '{' ( (lv_objInit_32_0= ruleObjInit ) ) (otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) ) )* otherlv_35= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==78) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalArdsl.g:2404:4: otherlv_30= 'Elements' otherlv_31= '{' ( (lv_objInit_32_0= ruleObjInit ) ) (otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,78,FOLLOW_4); 

                    				newLeafNode(otherlv_30, grammarAccess.getGameloopAccess().getElementsKeyword_17_0());
                    			
                    otherlv_31=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_31, grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_17_1());
                    			
                    // InternalArdsl.g:2412:4: ( (lv_objInit_32_0= ruleObjInit ) )
                    // InternalArdsl.g:2413:5: (lv_objInit_32_0= ruleObjInit )
                    {
                    // InternalArdsl.g:2413:5: (lv_objInit_32_0= ruleObjInit )
                    // InternalArdsl.g:2414:6: lv_objInit_32_0= ruleObjInit
                    {

                    						newCompositeNode(grammarAccess.getGameloopAccess().getObjInitObjInitParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_objInit_32_0=ruleObjInit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameloopRule());
                    						}
                    						add(
                    							current,
                    							"objInit",
                    							lv_objInit_32_0,
                    							"ardsl.Ardsl.ObjInit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArdsl.g:2431:4: (otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==15) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalArdsl.g:2432:5: otherlv_33= ',' ( (lv_objInit_34_0= ruleObjInit ) )
                    	    {
                    	    otherlv_33=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getGameloopAccess().getCommaKeyword_17_3_0());
                    	    				
                    	    // InternalArdsl.g:2436:5: ( (lv_objInit_34_0= ruleObjInit ) )
                    	    // InternalArdsl.g:2437:6: (lv_objInit_34_0= ruleObjInit )
                    	    {
                    	    // InternalArdsl.g:2437:6: (lv_objInit_34_0= ruleObjInit )
                    	    // InternalArdsl.g:2438:7: lv_objInit_34_0= ruleObjInit
                    	    {

                    	    							newCompositeNode(grammarAccess.getGameloopAccess().getObjInitObjInitParserRuleCall_17_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_objInit_34_0=ruleObjInit();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGameloopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"objInit",
                    	    								lv_objInit_34_0,
                    	    								"ardsl.Ardsl.ObjInit");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_35, grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_17_4());
                    			

                    }
                    break;

            }

            otherlv_36=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_36, grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleGameloop"


    // $ANTLR start "entryRuleScore"
    // InternalArdsl.g:2469:1: entryRuleScore returns [EObject current=null] : iv_ruleScore= ruleScore EOF ;
    public final EObject entryRuleScore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScore = null;


        try {
            // InternalArdsl.g:2469:46: (iv_ruleScore= ruleScore EOF )
            // InternalArdsl.g:2470:2: iv_ruleScore= ruleScore EOF
            {
             newCompositeNode(grammarAccess.getScoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScore=ruleScore();

            state._fsp--;

             current =iv_ruleScore; 
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
    // $ANTLR end "entryRuleScore"


    // $ANTLR start "ruleScore"
    // InternalArdsl.g:2476:1: ruleScore returns [EObject current=null] : (otherlv_0= 'start' ( (lv_start_1_0= ruleEInt ) ) otherlv_2= 'goal' ( (lv_finish_3_0= ruleEInt ) ) otherlv_4= 'lives' ( (lv_lives_5_0= ruleEInt ) ) ) ;
    public final EObject ruleScore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_start_1_0 = null;

        AntlrDatatypeRuleToken lv_finish_3_0 = null;

        AntlrDatatypeRuleToken lv_lives_5_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:2482:2: ( (otherlv_0= 'start' ( (lv_start_1_0= ruleEInt ) ) otherlv_2= 'goal' ( (lv_finish_3_0= ruleEInt ) ) otherlv_4= 'lives' ( (lv_lives_5_0= ruleEInt ) ) ) )
            // InternalArdsl.g:2483:2: (otherlv_0= 'start' ( (lv_start_1_0= ruleEInt ) ) otherlv_2= 'goal' ( (lv_finish_3_0= ruleEInt ) ) otherlv_4= 'lives' ( (lv_lives_5_0= ruleEInt ) ) )
            {
            // InternalArdsl.g:2483:2: (otherlv_0= 'start' ( (lv_start_1_0= ruleEInt ) ) otherlv_2= 'goal' ( (lv_finish_3_0= ruleEInt ) ) otherlv_4= 'lives' ( (lv_lives_5_0= ruleEInt ) ) )
            // InternalArdsl.g:2484:3: otherlv_0= 'start' ( (lv_start_1_0= ruleEInt ) ) otherlv_2= 'goal' ( (lv_finish_3_0= ruleEInt ) ) otherlv_4= 'lives' ( (lv_lives_5_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getScoreAccess().getStartKeyword_0());
            		
            // InternalArdsl.g:2488:3: ( (lv_start_1_0= ruleEInt ) )
            // InternalArdsl.g:2489:4: (lv_start_1_0= ruleEInt )
            {
            // InternalArdsl.g:2489:4: (lv_start_1_0= ruleEInt )
            // InternalArdsl.g:2490:5: lv_start_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getScoreAccess().getStartEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_78);
            lv_start_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScoreRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_1_0,
            						"ardsl.Ardsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,79,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getScoreAccess().getGoalKeyword_2());
            		
            // InternalArdsl.g:2511:3: ( (lv_finish_3_0= ruleEInt ) )
            // InternalArdsl.g:2512:4: (lv_finish_3_0= ruleEInt )
            {
            // InternalArdsl.g:2512:4: (lv_finish_3_0= ruleEInt )
            // InternalArdsl.g:2513:5: lv_finish_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getScoreAccess().getFinishEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_79);
            lv_finish_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScoreRule());
            					}
            					set(
            						current,
            						"finish",
            						lv_finish_3_0,
            						"ardsl.Ardsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,80,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getScoreAccess().getLivesKeyword_4());
            		
            // InternalArdsl.g:2534:3: ( (lv_lives_5_0= ruleEInt ) )
            // InternalArdsl.g:2535:4: (lv_lives_5_0= ruleEInt )
            {
            // InternalArdsl.g:2535:4: (lv_lives_5_0= ruleEInt )
            // InternalArdsl.g:2536:5: lv_lives_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getScoreAccess().getLivesEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_lives_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScoreRule());
            					}
            					set(
            						current,
            						"lives",
            						lv_lives_5_0,
            						"ardsl.Ardsl.EInt");
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
    // $ANTLR end "ruleScore"


    // $ANTLR start "entryRuleActions"
    // InternalArdsl.g:2557:1: entryRuleActions returns [EObject current=null] : iv_ruleActions= ruleActions EOF ;
    public final EObject entryRuleActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActions = null;


        try {
            // InternalArdsl.g:2557:48: (iv_ruleActions= ruleActions EOF )
            // InternalArdsl.g:2558:2: iv_ruleActions= ruleActions EOF
            {
             newCompositeNode(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActions=ruleActions();

            state._fsp--;

             current =iv_ruleActions; 
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
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // InternalArdsl.g:2564:1: ruleActions returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )? (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )? (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )? (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )? (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChanges ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChanges ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleActions() throws RecognitionException {
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
            // InternalArdsl.g:2570:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )? (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )? (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )? (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )? (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChanges ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChanges ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalArdsl.g:2571:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )? (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )? (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )? (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )? (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChanges ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChanges ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalArdsl.g:2571:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )? (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )? (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )? (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )? (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChanges ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChanges ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalArdsl.g:2572:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )? (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )? (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )? (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )? (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChanges ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChanges ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalArdsl.g:2572:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArdsl.g:2573:4: (lv_name_0_0= ruleEString )
            {
            // InternalArdsl.g:2573:4: (lv_name_0_0= ruleEString )
            // InternalArdsl.g:2574:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionsAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionsRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_80); 

            			newLeafNode(otherlv_1, grammarAccess.getActionsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalArdsl.g:2595:3: (otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==81) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalArdsl.g:2596:4: otherlv_2= 'action' ( (lv_action_3_0= ruleBasicActions ) )
                    {
                    otherlv_2=(Token)match(input,81,FOLLOW_81); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionsAccess().getActionKeyword_2_0());
                    			
                    // InternalArdsl.g:2600:4: ( (lv_action_3_0= ruleBasicActions ) )
                    // InternalArdsl.g:2601:5: (lv_action_3_0= ruleBasicActions )
                    {
                    // InternalArdsl.g:2601:5: (lv_action_3_0= ruleBasicActions )
                    // InternalArdsl.g:2602:6: lv_action_3_0= ruleBasicActions
                    {

                    						newCompositeNode(grammarAccess.getActionsAccess().getActionBasicActionsEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_82);
                    lv_action_3_0=ruleBasicActions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionsRule());
                    						}
                    						set(
                    							current,
                    							"action",
                    							lv_action_3_0,
                    							"ardsl.Ardsl.BasicActions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalArdsl.g:2620:3: (otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==82) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalArdsl.g:2621:4: otherlv_4= 'display' ( (lv_message_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,82,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionsAccess().getDisplayKeyword_3_0());
                    			
                    // InternalArdsl.g:2625:4: ( (lv_message_5_0= ruleEString ) )
                    // InternalArdsl.g:2626:5: (lv_message_5_0= ruleEString )
                    {
                    // InternalArdsl.g:2626:5: (lv_message_5_0= ruleEString )
                    // InternalArdsl.g:2627:6: lv_message_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActionsAccess().getMessageEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_83);
                    lv_message_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionsRule());
                    						}
                    						set(
                    							current,
                    							"message",
                    							lv_message_5_0,
                    							"ardsl.Ardsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalArdsl.g:2645:3: (otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==74) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalArdsl.g:2646:4: otherlv_6= 'score' ( (lv_scoreChange_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionsAccess().getScoreKeyword_4_0());
                    			
                    // InternalArdsl.g:2650:4: ( (lv_scoreChange_7_0= ruleEInt ) )
                    // InternalArdsl.g:2651:5: (lv_scoreChange_7_0= ruleEInt )
                    {
                    // InternalArdsl.g:2651:5: (lv_scoreChange_7_0= ruleEInt )
                    // InternalArdsl.g:2652:6: lv_scoreChange_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getActionsAccess().getScoreChangeEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_84);
                    lv_scoreChange_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionsRule());
                    						}
                    						set(
                    							current,
                    							"scoreChange",
                    							lv_scoreChange_7_0,
                    							"ardsl.Ardsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalArdsl.g:2670:3: (otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==83) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalArdsl.g:2671:4: otherlv_8= 'timeEach' ( (lv_timeTrigger_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,83,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionsAccess().getTimeEachKeyword_5_0());
                    			
                    // InternalArdsl.g:2675:4: ( (lv_timeTrigger_9_0= ruleEInt ) )
                    // InternalArdsl.g:2676:5: (lv_timeTrigger_9_0= ruleEInt )
                    {
                    // InternalArdsl.g:2676:5: (lv_timeTrigger_9_0= ruleEInt )
                    // InternalArdsl.g:2677:6: lv_timeTrigger_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getActionsAccess().getTimeTriggerEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_85);
                    lv_timeTrigger_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionsRule());
                    						}
                    						set(
                    							current,
                    							"timeTrigger",
                    							lv_timeTrigger_9_0,
                    							"ardsl.Ardsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalArdsl.g:2695:3: (otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChanges ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChanges ) ) )* otherlv_15= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==84) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalArdsl.g:2696:4: otherlv_10= 'changes' otherlv_11= '{' ( (lv_physicChanges_12_0= rulePhysicChanges ) ) (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChanges ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,84,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getActionsAccess().getChangesKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_86); 

                    				newLeafNode(otherlv_11, grammarAccess.getActionsAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalArdsl.g:2704:4: ( (lv_physicChanges_12_0= rulePhysicChanges ) )
                    // InternalArdsl.g:2705:5: (lv_physicChanges_12_0= rulePhysicChanges )
                    {
                    // InternalArdsl.g:2705:5: (lv_physicChanges_12_0= rulePhysicChanges )
                    // InternalArdsl.g:2706:6: lv_physicChanges_12_0= rulePhysicChanges
                    {

                    						newCompositeNode(grammarAccess.getActionsAccess().getPhysicChangesPhysicChangesParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_physicChanges_12_0=rulePhysicChanges();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionsRule());
                    						}
                    						add(
                    							current,
                    							"physicChanges",
                    							lv_physicChanges_12_0,
                    							"ardsl.Ardsl.PhysicChanges");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArdsl.g:2723:4: (otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChanges ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==15) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalArdsl.g:2724:5: otherlv_13= ',' ( (lv_physicChanges_14_0= rulePhysicChanges ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_86); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getActionsAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalArdsl.g:2728:5: ( (lv_physicChanges_14_0= rulePhysicChanges ) )
                    	    // InternalArdsl.g:2729:6: (lv_physicChanges_14_0= rulePhysicChanges )
                    	    {
                    	    // InternalArdsl.g:2729:6: (lv_physicChanges_14_0= rulePhysicChanges )
                    	    // InternalArdsl.g:2730:7: lv_physicChanges_14_0= rulePhysicChanges
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionsAccess().getPhysicChangesPhysicChangesParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_physicChanges_14_0=rulePhysicChanges();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"physicChanges",
                    	    								lv_physicChanges_14_0,
                    	    								"ardsl.Ardsl.PhysicChanges");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getActionsAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getActionsAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleCollisions"
    // InternalArdsl.g:2761:1: entryRuleCollisions returns [EObject current=null] : iv_ruleCollisions= ruleCollisions EOF ;
    public final EObject entryRuleCollisions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollisions = null;


        try {
            // InternalArdsl.g:2761:51: (iv_ruleCollisions= ruleCollisions EOF )
            // InternalArdsl.g:2762:2: iv_ruleCollisions= ruleCollisions EOF
            {
             newCompositeNode(grammarAccess.getCollisionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollisions=ruleCollisions();

            state._fsp--;

             current =iv_ruleCollisions; 
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
    // $ANTLR end "entryRuleCollisions"


    // $ANTLR start "ruleCollisions"
    // InternalArdsl.g:2768:1: ruleCollisions returns [EObject current=null] : (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleCollisions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalArdsl.g:2774:2: ( (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) ) )
            // InternalArdsl.g:2775:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) )
            {
            // InternalArdsl.g:2775:2: (otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) )
            // InternalArdsl.g:2776:3: otherlv_0= 'element' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCollisionsAccess().getElementKeyword_0());
            		
            // InternalArdsl.g:2780:3: ( ( ruleEString ) )
            // InternalArdsl.g:2781:4: ( ruleEString )
            {
            // InternalArdsl.g:2781:4: ( ruleEString )
            // InternalArdsl.g:2782:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollisionsRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCollisionsAccess().getClassAClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_87);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,85,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCollisionsAccess().getToKeyword_2());
            		
            // InternalArdsl.g:2800:3: ( ( ruleEString ) )
            // InternalArdsl.g:2801:4: ( ruleEString )
            {
            // InternalArdsl.g:2801:4: ( ruleEString )
            // InternalArdsl.g:2802:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollisionsRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCollisionsAccess().getClassBClassCrossReference_3_0());
            				
            pushFollow(FOLLOW_40);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getCollisionsAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalArdsl.g:2820:3: ( ( ruleEString ) )
            // InternalArdsl.g:2821:4: ( ruleEString )
            {
            // InternalArdsl.g:2821:4: ( ruleEString )
            // InternalArdsl.g:2822:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollisionsRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCollisionsAccess().getActionTriggerCrossReference_5_0());
            				
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
    // $ANTLR end "ruleCollisions"


    // $ANTLR start "entryRulePhysicChanges"
    // InternalArdsl.g:2840:1: entryRulePhysicChanges returns [EObject current=null] : iv_rulePhysicChanges= rulePhysicChanges EOF ;
    public final EObject entryRulePhysicChanges() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicChanges = null;


        try {
            // InternalArdsl.g:2840:54: (iv_rulePhysicChanges= rulePhysicChanges EOF )
            // InternalArdsl.g:2841:2: iv_rulePhysicChanges= rulePhysicChanges EOF
            {
             newCompositeNode(grammarAccess.getPhysicChangesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhysicChanges=rulePhysicChanges();

            state._fsp--;

             current =iv_rulePhysicChanges; 
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
    // $ANTLR end "entryRulePhysicChanges"


    // $ANTLR start "rulePhysicChanges"
    // InternalArdsl.g:2847:1: rulePhysicChanges returns [EObject current=null] : (otherlv_0= 'do' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'in' ( ( ruleEString ) ) otherlv_4= 'named' ( (lv_object_5_0= ruleEString ) ) (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )? (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )? (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )? (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )? (otherlv_14= 'force' ( ( ruleEString ) ) )? ) ;
    public final EObject rulePhysicChanges() throws RecognitionException {
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
            // InternalArdsl.g:2853:2: ( (otherlv_0= 'do' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'in' ( ( ruleEString ) ) otherlv_4= 'named' ( (lv_object_5_0= ruleEString ) ) (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )? (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )? (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )? (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )? (otherlv_14= 'force' ( ( ruleEString ) ) )? ) )
            // InternalArdsl.g:2854:2: (otherlv_0= 'do' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'in' ( ( ruleEString ) ) otherlv_4= 'named' ( (lv_object_5_0= ruleEString ) ) (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )? (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )? (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )? (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )? (otherlv_14= 'force' ( ( ruleEString ) ) )? )
            {
            // InternalArdsl.g:2854:2: (otherlv_0= 'do' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'in' ( ( ruleEString ) ) otherlv_4= 'named' ( (lv_object_5_0= ruleEString ) ) (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )? (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )? (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )? (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )? (otherlv_14= 'force' ( ( ruleEString ) ) )? )
            // InternalArdsl.g:2855:3: otherlv_0= 'do' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'in' ( ( ruleEString ) ) otherlv_4= 'named' ( (lv_object_5_0= ruleEString ) ) (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )? (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )? (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )? (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )? (otherlv_14= 'force' ( ( ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,86,FOLLOW_88); 

            			newLeafNode(otherlv_0, grammarAccess.getPhysicChangesAccess().getDoKeyword_0());
            		
            // InternalArdsl.g:2859:3: ( (lv_action_1_0= ruleAction ) )
            // InternalArdsl.g:2860:4: (lv_action_1_0= ruleAction )
            {
            // InternalArdsl.g:2860:4: (lv_action_1_0= ruleAction )
            // InternalArdsl.g:2861:5: lv_action_1_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getPhysicChangesAccess().getActionActionEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_89);
            lv_action_1_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicChangesRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_1_0,
            						"ardsl.Ardsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,87,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPhysicChangesAccess().getInKeyword_2());
            		
            // InternalArdsl.g:2882:3: ( ( ruleEString ) )
            // InternalArdsl.g:2883:4: ( ruleEString )
            {
            // InternalArdsl.g:2883:4: ( ruleEString )
            // InternalArdsl.g:2884:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhysicChangesRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPhysicChangesAccess().getClassClassCrossReference_3_0());
            				
            pushFollow(FOLLOW_90);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,88,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getPhysicChangesAccess().getNamedKeyword_4());
            		
            // InternalArdsl.g:2902:3: ( (lv_object_5_0= ruleEString ) )
            // InternalArdsl.g:2903:4: (lv_object_5_0= ruleEString )
            {
            // InternalArdsl.g:2903:4: (lv_object_5_0= ruleEString )
            // InternalArdsl.g:2904:5: lv_object_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPhysicChangesAccess().getObjectEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_91);
            lv_object_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicChangesRule());
            					}
            					set(
            						current,
            						"object",
            						lv_object_5_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArdsl.g:2921:3: (otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==89) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalArdsl.g:2922:4: otherlv_6= 'where' ( (lv_position_7_0= rulePosition ) )
                    {
                    otherlv_6=(Token)match(input,89,FOLLOW_92); 

                    				newLeafNode(otherlv_6, grammarAccess.getPhysicChangesAccess().getWhereKeyword_6_0());
                    			
                    // InternalArdsl.g:2926:4: ( (lv_position_7_0= rulePosition ) )
                    // InternalArdsl.g:2927:5: (lv_position_7_0= rulePosition )
                    {
                    // InternalArdsl.g:2927:5: (lv_position_7_0= rulePosition )
                    // InternalArdsl.g:2928:6: lv_position_7_0= rulePosition
                    {

                    						newCompositeNode(grammarAccess.getPhysicChangesAccess().getPositionPositionEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_93);
                    lv_position_7_0=rulePosition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhysicChangesRule());
                    						}
                    						set(
                    							current,
                    							"position",
                    							lv_position_7_0,
                    							"ardsl.Ardsl.Position");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalArdsl.g:2946:3: (otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==90) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalArdsl.g:2947:4: otherlv_8= 'scale' ( (lv_scale_9_0= ruleEDouble ) )
                    {
                    otherlv_8=(Token)match(input,90,FOLLOW_46); 

                    				newLeafNode(otherlv_8, grammarAccess.getPhysicChangesAccess().getScaleKeyword_7_0());
                    			
                    // InternalArdsl.g:2951:4: ( (lv_scale_9_0= ruleEDouble ) )
                    // InternalArdsl.g:2952:5: (lv_scale_9_0= ruleEDouble )
                    {
                    // InternalArdsl.g:2952:5: (lv_scale_9_0= ruleEDouble )
                    // InternalArdsl.g:2953:6: lv_scale_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getPhysicChangesAccess().getScaleEDoubleParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_94);
                    lv_scale_9_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhysicChangesRule());
                    						}
                    						set(
                    							current,
                    							"scale",
                    							lv_scale_9_0,
                    							"ardsl.Ardsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalArdsl.g:2971:3: (otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==91) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalArdsl.g:2972:4: otherlv_10= 'stat' ( (lv_attribute_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,91,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getPhysicChangesAccess().getStatKeyword_8_0());
                    			
                    // InternalArdsl.g:2976:4: ( (lv_attribute_11_0= ruleEString ) )
                    // InternalArdsl.g:2977:5: (lv_attribute_11_0= ruleEString )
                    {
                    // InternalArdsl.g:2977:5: (lv_attribute_11_0= ruleEString )
                    // InternalArdsl.g:2978:6: lv_attribute_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPhysicChangesAccess().getAttributeEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_95);
                    lv_attribute_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhysicChangesRule());
                    						}
                    						set(
                    							current,
                    							"attribute",
                    							lv_attribute_11_0,
                    							"ardsl.Ardsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalArdsl.g:2996:3: (otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==92) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalArdsl.g:2997:4: otherlv_12= 'changeStat' ( (lv_changeValue_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,92,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getPhysicChangesAccess().getChangeStatKeyword_9_0());
                    			
                    // InternalArdsl.g:3001:4: ( (lv_changeValue_13_0= ruleEInt ) )
                    // InternalArdsl.g:3002:5: (lv_changeValue_13_0= ruleEInt )
                    {
                    // InternalArdsl.g:3002:5: (lv_changeValue_13_0= ruleEInt )
                    // InternalArdsl.g:3003:6: lv_changeValue_13_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPhysicChangesAccess().getChangeValueEIntParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_96);
                    lv_changeValue_13_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhysicChangesRule());
                    						}
                    						set(
                    							current,
                    							"changeValue",
                    							lv_changeValue_13_0,
                    							"ardsl.Ardsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalArdsl.g:3021:3: (otherlv_14= 'force' ( ( ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==93) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalArdsl.g:3022:4: otherlv_14= 'force' ( ( ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,93,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getPhysicChangesAccess().getForceKeyword_10_0());
                    			
                    // InternalArdsl.g:3026:4: ( ( ruleEString ) )
                    // InternalArdsl.g:3027:5: ( ruleEString )
                    {
                    // InternalArdsl.g:3027:5: ( ruleEString )
                    // InternalArdsl.g:3028:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPhysicChangesRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPhysicChangesAccess().getForceForceCrossReference_10_1_0());
                    					
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
    // $ANTLR end "rulePhysicChanges"


    // $ANTLR start "entryRuleGamePad"
    // InternalArdsl.g:3047:1: entryRuleGamePad returns [EObject current=null] : iv_ruleGamePad= ruleGamePad EOF ;
    public final EObject entryRuleGamePad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGamePad = null;


        try {
            // InternalArdsl.g:3047:48: (iv_ruleGamePad= ruleGamePad EOF )
            // InternalArdsl.g:3048:2: iv_ruleGamePad= ruleGamePad EOF
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
    // InternalArdsl.g:3054:1: ruleGamePad returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleGamePad() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:3060:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) ) ) )
            // InternalArdsl.g:3061:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) ) )
            {
            // InternalArdsl.g:3061:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) ) )
            // InternalArdsl.g:3062:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) )
            {
            // InternalArdsl.g:3062:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArdsl.g:3063:4: (lv_name_0_0= ruleEString )
            {
            // InternalArdsl.g:3063:4: (lv_name_0_0= ruleEString )
            // InternalArdsl.g:3064:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGamePadAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGamePadRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGamePadAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalArdsl.g:3085:3: ( ( ruleEString ) )
            // InternalArdsl.g:3086:4: ( ruleEString )
            {
            // InternalArdsl.g:3086:4: ( ruleEString )
            // InternalArdsl.g:3087:5: ruleEString
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


    // $ANTLR start "entryRuleObjInit"
    // InternalArdsl.g:3105:1: entryRuleObjInit returns [EObject current=null] : iv_ruleObjInit= ruleObjInit EOF ;
    public final EObject entryRuleObjInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjInit = null;


        try {
            // InternalArdsl.g:3105:48: (iv_ruleObjInit= ruleObjInit EOF )
            // InternalArdsl.g:3106:2: iv_ruleObjInit= ruleObjInit EOF
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
    // InternalArdsl.g:3112:1: ruleObjInit returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '[' ( (lv_posX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_posY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_posZ_7_0= ruleEDouble ) ) otherlv_8= ']' (otherlv_9= 'rules' otherlv_10= '{' ( (lv_rules_11_0= ruleRule ) ) (otherlv_12= ',' ( (lv_rules_13_0= ruleRule ) ) )* otherlv_14= '}' )? ) ;
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
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_posX_3_0 = null;

        AntlrDatatypeRuleToken lv_posY_5_0 = null;

        AntlrDatatypeRuleToken lv_posZ_7_0 = null;

        EObject lv_rules_11_0 = null;

        EObject lv_rules_13_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:3118:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '[' ( (lv_posX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_posY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_posZ_7_0= ruleEDouble ) ) otherlv_8= ']' (otherlv_9= 'rules' otherlv_10= '{' ( (lv_rules_11_0= ruleRule ) ) (otherlv_12= ',' ( (lv_rules_13_0= ruleRule ) ) )* otherlv_14= '}' )? ) )
            // InternalArdsl.g:3119:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '[' ( (lv_posX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_posY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_posZ_7_0= ruleEDouble ) ) otherlv_8= ']' (otherlv_9= 'rules' otherlv_10= '{' ( (lv_rules_11_0= ruleRule ) ) (otherlv_12= ',' ( (lv_rules_13_0= ruleRule ) ) )* otherlv_14= '}' )? )
            {
            // InternalArdsl.g:3119:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '[' ( (lv_posX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_posY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_posZ_7_0= ruleEDouble ) ) otherlv_8= ']' (otherlv_9= 'rules' otherlv_10= '{' ( (lv_rules_11_0= ruleRule ) ) (otherlv_12= ',' ( (lv_rules_13_0= ruleRule ) ) )* otherlv_14= '}' )? )
            // InternalArdsl.g:3120:3: ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_2= '[' ( (lv_posX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_posY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_posZ_7_0= ruleEDouble ) ) otherlv_8= ']' (otherlv_9= 'rules' otherlv_10= '{' ( (lv_rules_11_0= ruleRule ) ) (otherlv_12= ',' ( (lv_rules_13_0= ruleRule ) ) )* otherlv_14= '}' )?
            {
            // InternalArdsl.g:3120:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArdsl.g:3121:4: (lv_name_0_0= ruleEString )
            {
            // InternalArdsl.g:3121:4: (lv_name_0_0= ruleEString )
            // InternalArdsl.g:3122:5: lv_name_0_0= ruleEString
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
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArdsl.g:3139:3: ( ( ruleEString ) )
            // InternalArdsl.g:3140:4: ( ruleEString )
            {
            // InternalArdsl.g:3140:4: ( ruleEString )
            // InternalArdsl.g:3141:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjInitRule());
            					}
            				

            					newCompositeNode(grammarAccess.getObjInitAccess().getClassClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getObjInitAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalArdsl.g:3159:3: ( (lv_posX_3_0= ruleEDouble ) )
            // InternalArdsl.g:3160:4: (lv_posX_3_0= ruleEDouble )
            {
            // InternalArdsl.g:3160:4: (lv_posX_3_0= ruleEDouble )
            // InternalArdsl.g:3161:5: lv_posX_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getObjInitAccess().getPosXEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_posX_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjInitRule());
            					}
            					set(
            						current,
            						"posX",
            						lv_posX_3_0,
            						"ardsl.Ardsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_46); 

            			newLeafNode(otherlv_4, grammarAccess.getObjInitAccess().getCommaKeyword_4());
            		
            // InternalArdsl.g:3182:3: ( (lv_posY_5_0= ruleEDouble ) )
            // InternalArdsl.g:3183:4: (lv_posY_5_0= ruleEDouble )
            {
            // InternalArdsl.g:3183:4: (lv_posY_5_0= ruleEDouble )
            // InternalArdsl.g:3184:5: lv_posY_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getObjInitAccess().getPosYEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_posY_5_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjInitRule());
            					}
            					set(
            						current,
            						"posY",
            						lv_posY_5_0,
            						"ardsl.Ardsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_46); 

            			newLeafNode(otherlv_6, grammarAccess.getObjInitAccess().getCommaKeyword_6());
            		
            // InternalArdsl.g:3205:3: ( (lv_posZ_7_0= ruleEDouble ) )
            // InternalArdsl.g:3206:4: (lv_posZ_7_0= ruleEDouble )
            {
            // InternalArdsl.g:3206:4: (lv_posZ_7_0= ruleEDouble )
            // InternalArdsl.g:3207:5: lv_posZ_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getObjInitAccess().getPosZEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_24);
            lv_posZ_7_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjInitRule());
            					}
            					set(
            						current,
            						"posZ",
            						lv_posZ_7_0,
            						"ardsl.Ardsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,26,FOLLOW_97); 

            			newLeafNode(otherlv_8, grammarAccess.getObjInitAccess().getRightSquareBracketKeyword_8());
            		
            // InternalArdsl.g:3228:3: (otherlv_9= 'rules' otherlv_10= '{' ( (lv_rules_11_0= ruleRule ) ) (otherlv_12= ',' ( (lv_rules_13_0= ruleRule ) ) )* otherlv_14= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==94) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalArdsl.g:3229:4: otherlv_9= 'rules' otherlv_10= '{' ( (lv_rules_11_0= ruleRule ) ) (otherlv_12= ',' ( (lv_rules_13_0= ruleRule ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,94,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getObjInitAccess().getRulesKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_86); 

                    				newLeafNode(otherlv_10, grammarAccess.getObjInitAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalArdsl.g:3237:4: ( (lv_rules_11_0= ruleRule ) )
                    // InternalArdsl.g:3238:5: (lv_rules_11_0= ruleRule )
                    {
                    // InternalArdsl.g:3238:5: (lv_rules_11_0= ruleRule )
                    // InternalArdsl.g:3239:6: lv_rules_11_0= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getObjInitAccess().getRulesRuleParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_rules_11_0=ruleRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjInitRule());
                    						}
                    						add(
                    							current,
                    							"rules",
                    							lv_rules_11_0,
                    							"ardsl.Ardsl.Rule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArdsl.g:3256:4: (otherlv_12= ',' ( (lv_rules_13_0= ruleRule ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==15) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalArdsl.g:3257:5: otherlv_12= ',' ( (lv_rules_13_0= ruleRule ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_86); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getObjInitAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalArdsl.g:3261:5: ( (lv_rules_13_0= ruleRule ) )
                    	    // InternalArdsl.g:3262:6: (lv_rules_13_0= ruleRule )
                    	    {
                    	    // InternalArdsl.g:3262:6: (lv_rules_13_0= ruleRule )
                    	    // InternalArdsl.g:3263:7: lv_rules_13_0= ruleRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjInitAccess().getRulesRuleParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_rules_13_0=ruleRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjInitRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rules",
                    	    								lv_rules_13_0,
                    	    								"ardsl.Ardsl.Rule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getObjInitAccess().getRightCurlyBracketKeyword_9_4());
                    			

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


    // $ANTLR start "entryRuleRule"
    // InternalArdsl.g:3290:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalArdsl.g:3290:45: (iv_ruleRule= ruleRule EOF )
            // InternalArdsl.g:3291:2: iv_ruleRule= ruleRule EOF
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
    // InternalArdsl.g:3297:1: ruleRule returns [EObject current=null] : (otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= 'if(' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:3303:2: ( (otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= 'if(' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')' ) )
            // InternalArdsl.g:3304:2: (otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= 'if(' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')' )
            {
            // InternalArdsl.g:3304:2: (otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= 'if(' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')' )
            // InternalArdsl.g:3305:3: otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= 'if(' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getDoKeyword_0());
            		
            // InternalArdsl.g:3309:3: ( ( ruleEString ) )
            // InternalArdsl.g:3310:4: ( ruleEString )
            {
            // InternalArdsl.g:3310:4: ( ruleEString )
            // InternalArdsl.g:3311:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRuleAccess().getActionTriggerCrossReference_1_0());
            				
            pushFollow(FOLLOW_98);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,95,FOLLOW_99); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getIfKeyword_2());
            		
            // InternalArdsl.g:3329:3: ( (lv_condition_3_0= ruleCondition ) )
            // InternalArdsl.g:3330:4: (lv_condition_3_0= ruleCondition )
            {
            // InternalArdsl.g:3330:4: (lv_condition_3_0= ruleCondition )
            // InternalArdsl.g:3331:5: lv_condition_3_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_100);
            lv_condition_3_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_3_0,
            						"ardsl.Ardsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,96,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCondition"
    // InternalArdsl.g:3356:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalArdsl.g:3356:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalArdsl.g:3357:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalArdsl.g:3363:1: ruleCondition returns [EObject current=null] : (this_LogicOp_0= ruleLogicOp | this_Arithmetic_1= ruleArithmetic ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_LogicOp_0 = null;

        EObject this_Arithmetic_1 = null;



        	enterRule();

        try {
            // InternalArdsl.g:3369:2: ( (this_LogicOp_0= ruleLogicOp | this_Arithmetic_1= ruleArithmetic ) )
            // InternalArdsl.g:3370:2: (this_LogicOp_0= ruleLogicOp | this_Arithmetic_1= ruleArithmetic )
            {
            // InternalArdsl.g:3370:2: (this_LogicOp_0= ruleLogicOp | this_Arithmetic_1= ruleArithmetic )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=97 && LA44_0<=98)) ) {
                alt44=1;
            }
            else if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_ID)||LA44_0==99) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalArdsl.g:3371:3: this_LogicOp_0= ruleLogicOp
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getLogicOpParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicOp_0=ruleLogicOp();

                    state._fsp--;


                    			current = this_LogicOp_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalArdsl.g:3380:3: this_Arithmetic_1= ruleArithmetic
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getArithmeticParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Arithmetic_1=ruleArithmetic();

                    state._fsp--;


                    			current = this_Arithmetic_1;
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


    // $ANTLR start "entryRuleLogicOp"
    // InternalArdsl.g:3392:1: entryRuleLogicOp returns [EObject current=null] : iv_ruleLogicOp= ruleLogicOp EOF ;
    public final EObject entryRuleLogicOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicOp = null;


        try {
            // InternalArdsl.g:3392:48: (iv_ruleLogicOp= ruleLogicOp EOF )
            // InternalArdsl.g:3393:2: iv_ruleLogicOp= ruleLogicOp EOF
            {
             newCompositeNode(grammarAccess.getLogicOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicOp=ruleLogicOp();

            state._fsp--;

             current =iv_ruleLogicOp; 
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
    // $ANTLR end "entryRuleLogicOp"


    // $ANTLR start "ruleLogicOp"
    // InternalArdsl.g:3399:1: ruleLogicOp returns [EObject current=null] : (this_Not_0= ruleNot | this_Binary_1= ruleBinary ) ;
    public final EObject ruleLogicOp() throws RecognitionException {
        EObject current = null;

        EObject this_Not_0 = null;

        EObject this_Binary_1 = null;



        	enterRule();

        try {
            // InternalArdsl.g:3405:2: ( (this_Not_0= ruleNot | this_Binary_1= ruleBinary ) )
            // InternalArdsl.g:3406:2: (this_Not_0= ruleNot | this_Binary_1= ruleBinary )
            {
            // InternalArdsl.g:3406:2: (this_Not_0= ruleNot | this_Binary_1= ruleBinary )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==97) ) {
                alt45=1;
            }
            else if ( (LA45_0==98) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalArdsl.g:3407:3: this_Not_0= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getLogicOpAccess().getNotParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_0=ruleNot();

                    state._fsp--;


                    			current = this_Not_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalArdsl.g:3416:3: this_Binary_1= ruleBinary
                    {

                    			newCompositeNode(grammarAccess.getLogicOpAccess().getBinaryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Binary_1=ruleBinary();

                    state._fsp--;


                    			current = this_Binary_1;
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
    // $ANTLR end "ruleLogicOp"


    // $ANTLR start "entryRuleArithmetic"
    // InternalArdsl.g:3428:1: entryRuleArithmetic returns [EObject current=null] : iv_ruleArithmetic= ruleArithmetic EOF ;
    public final EObject entryRuleArithmetic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmetic = null;


        try {
            // InternalArdsl.g:3428:51: (iv_ruleArithmetic= ruleArithmetic EOF )
            // InternalArdsl.g:3429:2: iv_ruleArithmetic= ruleArithmetic EOF
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
    // InternalArdsl.g:3435:1: ruleArithmetic returns [EObject current=null] : ( ( (lv_left_0_0= ruleValue ) ) ( (lv_op_1_0= ruleArithmOps ) ) ( (lv_right_2_0= ruleValue ) ) ) ;
    public final EObject ruleArithmetic() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:3441:2: ( ( ( (lv_left_0_0= ruleValue ) ) ( (lv_op_1_0= ruleArithmOps ) ) ( (lv_right_2_0= ruleValue ) ) ) )
            // InternalArdsl.g:3442:2: ( ( (lv_left_0_0= ruleValue ) ) ( (lv_op_1_0= ruleArithmOps ) ) ( (lv_right_2_0= ruleValue ) ) )
            {
            // InternalArdsl.g:3442:2: ( ( (lv_left_0_0= ruleValue ) ) ( (lv_op_1_0= ruleArithmOps ) ) ( (lv_right_2_0= ruleValue ) ) )
            // InternalArdsl.g:3443:3: ( (lv_left_0_0= ruleValue ) ) ( (lv_op_1_0= ruleArithmOps ) ) ( (lv_right_2_0= ruleValue ) )
            {
            // InternalArdsl.g:3443:3: ( (lv_left_0_0= ruleValue ) )
            // InternalArdsl.g:3444:4: (lv_left_0_0= ruleValue )
            {
            // InternalArdsl.g:3444:4: (lv_left_0_0= ruleValue )
            // InternalArdsl.g:3445:5: lv_left_0_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getArithmeticAccess().getLeftValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_101);
            lv_left_0_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArithmeticRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"ardsl.Ardsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArdsl.g:3462:3: ( (lv_op_1_0= ruleArithmOps ) )
            // InternalArdsl.g:3463:4: (lv_op_1_0= ruleArithmOps )
            {
            // InternalArdsl.g:3463:4: (lv_op_1_0= ruleArithmOps )
            // InternalArdsl.g:3464:5: lv_op_1_0= ruleArithmOps
            {

            					newCompositeNode(grammarAccess.getArithmeticAccess().getOpArithmOpsEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_99);
            lv_op_1_0=ruleArithmOps();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArithmeticRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"ardsl.Ardsl.ArithmOps");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArdsl.g:3481:3: ( (lv_right_2_0= ruleValue ) )
            // InternalArdsl.g:3482:4: (lv_right_2_0= ruleValue )
            {
            // InternalArdsl.g:3482:4: (lv_right_2_0= ruleValue )
            // InternalArdsl.g:3483:5: lv_right_2_0= ruleValue
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
            						"ardsl.Ardsl.Value");
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


    // $ANTLR start "entryRuleNot"
    // InternalArdsl.g:3504:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalArdsl.g:3504:44: (iv_ruleNot= ruleNot EOF )
            // InternalArdsl.g:3505:2: iv_ruleNot= ruleNot EOF
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
    // InternalArdsl.g:3511:1: ruleNot returns [EObject current=null] : (otherlv_0= '!' ( (lv_left_1_0= ruleCondition ) ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_left_1_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:3517:2: ( (otherlv_0= '!' ( (lv_left_1_0= ruleCondition ) ) ) )
            // InternalArdsl.g:3518:2: (otherlv_0= '!' ( (lv_left_1_0= ruleCondition ) ) )
            {
            // InternalArdsl.g:3518:2: (otherlv_0= '!' ( (lv_left_1_0= ruleCondition ) ) )
            // InternalArdsl.g:3519:3: otherlv_0= '!' ( (lv_left_1_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,97,FOLLOW_99); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getExclamationMarkKeyword_0());
            		
            // InternalArdsl.g:3523:3: ( (lv_left_1_0= ruleCondition ) )
            // InternalArdsl.g:3524:4: (lv_left_1_0= ruleCondition )
            {
            // InternalArdsl.g:3524:4: (lv_left_1_0= ruleCondition )
            // InternalArdsl.g:3525:5: lv_left_1_0= ruleCondition
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
            						"ardsl.Ardsl.Condition");
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
    // InternalArdsl.g:3546:1: entryRuleBinary returns [EObject current=null] : iv_ruleBinary= ruleBinary EOF ;
    public final EObject entryRuleBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinary = null;


        try {
            // InternalArdsl.g:3546:47: (iv_ruleBinary= ruleBinary EOF )
            // InternalArdsl.g:3547:2: iv_ruleBinary= ruleBinary EOF
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
    // InternalArdsl.g:3553:1: ruleBinary returns [EObject current=null] : (otherlv_0= '(' ( (lv_left_1_0= ruleCondition ) ) otherlv_2= ')' ( (lv_op_3_0= ruleLogicOps ) ) otherlv_4= '(' ( (lv_right_5_0= ruleCondition ) ) otherlv_6= ')' ) ;
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
            // InternalArdsl.g:3559:2: ( (otherlv_0= '(' ( (lv_left_1_0= ruleCondition ) ) otherlv_2= ')' ( (lv_op_3_0= ruleLogicOps ) ) otherlv_4= '(' ( (lv_right_5_0= ruleCondition ) ) otherlv_6= ')' ) )
            // InternalArdsl.g:3560:2: (otherlv_0= '(' ( (lv_left_1_0= ruleCondition ) ) otherlv_2= ')' ( (lv_op_3_0= ruleLogicOps ) ) otherlv_4= '(' ( (lv_right_5_0= ruleCondition ) ) otherlv_6= ')' )
            {
            // InternalArdsl.g:3560:2: (otherlv_0= '(' ( (lv_left_1_0= ruleCondition ) ) otherlv_2= ')' ( (lv_op_3_0= ruleLogicOps ) ) otherlv_4= '(' ( (lv_right_5_0= ruleCondition ) ) otherlv_6= ')' )
            // InternalArdsl.g:3561:3: otherlv_0= '(' ( (lv_left_1_0= ruleCondition ) ) otherlv_2= ')' ( (lv_op_3_0= ruleLogicOps ) ) otherlv_4= '(' ( (lv_right_5_0= ruleCondition ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,98,FOLLOW_99); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryAccess().getLeftParenthesisKeyword_0());
            		
            // InternalArdsl.g:3565:3: ( (lv_left_1_0= ruleCondition ) )
            // InternalArdsl.g:3566:4: (lv_left_1_0= ruleCondition )
            {
            // InternalArdsl.g:3566:4: (lv_left_1_0= ruleCondition )
            // InternalArdsl.g:3567:5: lv_left_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getLeftConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_100);
            lv_left_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"ardsl.Ardsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,96,FOLLOW_102); 

            			newLeafNode(otherlv_2, grammarAccess.getBinaryAccess().getRightParenthesisKeyword_2());
            		
            // InternalArdsl.g:3588:3: ( (lv_op_3_0= ruleLogicOps ) )
            // InternalArdsl.g:3589:4: (lv_op_3_0= ruleLogicOps )
            {
            // InternalArdsl.g:3589:4: (lv_op_3_0= ruleLogicOps )
            // InternalArdsl.g:3590:5: lv_op_3_0= ruleLogicOps
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getOpLogicOpsEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_103);
            lv_op_3_0=ruleLogicOps();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_3_0,
            						"ardsl.Ardsl.LogicOps");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,98,FOLLOW_99); 

            			newLeafNode(otherlv_4, grammarAccess.getBinaryAccess().getLeftParenthesisKeyword_4());
            		
            // InternalArdsl.g:3611:3: ( (lv_right_5_0= ruleCondition ) )
            // InternalArdsl.g:3612:4: (lv_right_5_0= ruleCondition )
            {
            // InternalArdsl.g:3612:4: (lv_right_5_0= ruleCondition )
            // InternalArdsl.g:3613:5: lv_right_5_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getRightConditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_100);
            lv_right_5_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_5_0,
            						"ardsl.Ardsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,96,FOLLOW_2); 

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


    // $ANTLR start "entryRuleValue"
    // InternalArdsl.g:3638:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalArdsl.g:3638:46: (iv_ruleValue= ruleValue EOF )
            // InternalArdsl.g:3639:2: iv_ruleValue= ruleValue EOF
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
    // InternalArdsl.g:3645:1: ruleValue returns [EObject current=null] : (this_AttributeValue_0= ruleAttributeValue | this_ConstantValue_1= ruleConstantValue | this_AllInstances_2= ruleAllInstances ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeValue_0 = null;

        EObject this_ConstantValue_1 = null;

        EObject this_AllInstances_2 = null;



        	enterRule();

        try {
            // InternalArdsl.g:3651:2: ( (this_AttributeValue_0= ruleAttributeValue | this_ConstantValue_1= ruleConstantValue | this_AllInstances_2= ruleAllInstances ) )
            // InternalArdsl.g:3652:2: (this_AttributeValue_0= ruleAttributeValue | this_ConstantValue_1= ruleConstantValue | this_AllInstances_2= ruleAllInstances )
            {
            // InternalArdsl.g:3652:2: (this_AttributeValue_0= ruleAttributeValue | this_ConstantValue_1= ruleConstantValue | this_AllInstances_2= ruleAllInstances )
            int alt46=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==EOF||LA46_1==27||LA46_1==96||(LA46_1>=114 && LA46_1<=117)) ) {
                    alt46=2;
                }
                else if ( (LA46_1==18) ) {
                    alt46=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA46_2 = input.LA(2);

                if ( (LA46_2==EOF||LA46_2==27||LA46_2==96||(LA46_2>=114 && LA46_2<=117)) ) {
                    alt46=2;
                }
                else if ( (LA46_2==18) ) {
                    alt46=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 2, input);

                    throw nvae;
                }
                }
                break;
            case 99:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalArdsl.g:3653:3: this_AttributeValue_0= ruleAttributeValue
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
                    // InternalArdsl.g:3662:3: this_ConstantValue_1= ruleConstantValue
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
                    // InternalArdsl.g:3671:3: this_AllInstances_2= ruleAllInstances
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


    // $ANTLR start "entryRuleAttributeValue"
    // InternalArdsl.g:3683:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalArdsl.g:3683:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalArdsl.g:3684:2: iv_ruleAttributeValue= ruleAttributeValue EOF
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
    // InternalArdsl.g:3690:1: ruleAttributeValue returns [EObject current=null] : ( ( (lv_class_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleEString ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_class_0_0 = null;

        AntlrDatatypeRuleToken lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:3696:2: ( ( ( (lv_class_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleEString ) ) ) )
            // InternalArdsl.g:3697:2: ( ( (lv_class_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleEString ) ) )
            {
            // InternalArdsl.g:3697:2: ( ( (lv_class_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleEString ) ) )
            // InternalArdsl.g:3698:3: ( (lv_class_0_0= ruleEString ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleEString ) )
            {
            // InternalArdsl.g:3698:3: ( (lv_class_0_0= ruleEString ) )
            // InternalArdsl.g:3699:4: (lv_class_0_0= ruleEString )
            {
            // InternalArdsl.g:3699:4: (lv_class_0_0= ruleEString )
            // InternalArdsl.g:3700:5: lv_class_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeValueAccess().getClassEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_class_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeValueRule());
            					}
            					set(
            						current,
            						"class",
            						lv_class_0_0,
            						"ardsl.Ardsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeValueAccess().getFullStopKeyword_1());
            		
            // InternalArdsl.g:3721:3: ( (lv_attribute_2_0= ruleEString ) )
            // InternalArdsl.g:3722:4: (lv_attribute_2_0= ruleEString )
            {
            // InternalArdsl.g:3722:4: (lv_attribute_2_0= ruleEString )
            // InternalArdsl.g:3723:5: lv_attribute_2_0= ruleEString
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
            						"ardsl.Ardsl.EString");
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
    // InternalArdsl.g:3744:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // InternalArdsl.g:3744:54: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalArdsl.g:3745:2: iv_ruleConstantValue= ruleConstantValue EOF
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
    // InternalArdsl.g:3751:1: ruleConstantValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:3757:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalArdsl.g:3758:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalArdsl.g:3758:2: ( (lv_value_0_0= ruleEString ) )
            // InternalArdsl.g:3759:3: (lv_value_0_0= ruleEString )
            {
            // InternalArdsl.g:3759:3: (lv_value_0_0= ruleEString )
            // InternalArdsl.g:3760:4: lv_value_0_0= ruleEString
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
            					"ardsl.Ardsl.EString");
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
    // InternalArdsl.g:3780:1: entryRuleAllInstances returns [EObject current=null] : iv_ruleAllInstances= ruleAllInstances EOF ;
    public final EObject entryRuleAllInstances() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllInstances = null;


        try {
            // InternalArdsl.g:3780:53: (iv_ruleAllInstances= ruleAllInstances EOF )
            // InternalArdsl.g:3781:2: iv_ruleAllInstances= ruleAllInstances EOF
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
    // InternalArdsl.g:3787:1: ruleAllInstances returns [EObject current=null] : (otherlv_0= 'All' ( (lv_type_1_0= ruleEString ) ) ) ;
    public final EObject ruleAllInstances() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalArdsl.g:3793:2: ( (otherlv_0= 'All' ( (lv_type_1_0= ruleEString ) ) ) )
            // InternalArdsl.g:3794:2: (otherlv_0= 'All' ( (lv_type_1_0= ruleEString ) ) )
            {
            // InternalArdsl.g:3794:2: (otherlv_0= 'All' ( (lv_type_1_0= ruleEString ) ) )
            // InternalArdsl.g:3795:3: otherlv_0= 'All' ( (lv_type_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,99,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAllInstancesAccess().getAllKeyword_0());
            		
            // InternalArdsl.g:3799:3: ( (lv_type_1_0= ruleEString ) )
            // InternalArdsl.g:3800:4: (lv_type_1_0= ruleEString )
            {
            // InternalArdsl.g:3800:4: (lv_type_1_0= ruleEString )
            // InternalArdsl.g:3801:5: lv_type_1_0= ruleEString
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
            						"ardsl.Ardsl.EString");
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


    // $ANTLR start "ruleBasicActions"
    // InternalArdsl.g:3822:1: ruleBasicActions returns [Enumerator current=null] : ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'lose' ) | (enumLiteral_2= 'win' ) ) ;
    public final Enumerator ruleBasicActions() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArdsl.g:3828:2: ( ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'lose' ) | (enumLiteral_2= 'win' ) ) )
            // InternalArdsl.g:3829:2: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'lose' ) | (enumLiteral_2= 'win' ) )
            {
            // InternalArdsl.g:3829:2: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'lose' ) | (enumLiteral_2= 'win' ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt47=1;
                }
                break;
            case 73:
                {
                alt47=2;
                }
                break;
            case 72:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalArdsl.g:3830:3: (enumLiteral_0= 'start' )
                    {
                    // InternalArdsl.g:3830:3: (enumLiteral_0= 'start' )
                    // InternalArdsl.g:3831:4: enumLiteral_0= 'start'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getBasicActionsAccess().getStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBasicActionsAccess().getStartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:3838:3: (enumLiteral_1= 'lose' )
                    {
                    // InternalArdsl.g:3838:3: (enumLiteral_1= 'lose' )
                    // InternalArdsl.g:3839:4: enumLiteral_1= 'lose'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getBasicActionsAccess().getLoseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBasicActionsAccess().getLoseEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArdsl.g:3846:3: (enumLiteral_2= 'win' )
                    {
                    // InternalArdsl.g:3846:3: (enumLiteral_2= 'win' )
                    // InternalArdsl.g:3847:4: enumLiteral_2= 'win'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getBasicActionsAccess().getWinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBasicActionsAccess().getWinEnumLiteralDeclaration_2());
                    			

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


    // $ANTLR start "rulePlanes"
    // InternalArdsl.g:3857:1: rulePlanes returns [Enumerator current=null] : ( (enumLiteral_0= 'any' ) | (enumLiteral_1= 'horizontal' ) | (enumLiteral_2= 'vertical' ) ) ;
    public final Enumerator rulePlanes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArdsl.g:3863:2: ( ( (enumLiteral_0= 'any' ) | (enumLiteral_1= 'horizontal' ) | (enumLiteral_2= 'vertical' ) ) )
            // InternalArdsl.g:3864:2: ( (enumLiteral_0= 'any' ) | (enumLiteral_1= 'horizontal' ) | (enumLiteral_2= 'vertical' ) )
            {
            // InternalArdsl.g:3864:2: ( (enumLiteral_0= 'any' ) | (enumLiteral_1= 'horizontal' ) | (enumLiteral_2= 'vertical' ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt48=1;
                }
                break;
            case 101:
                {
                alt48=2;
                }
                break;
            case 102:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalArdsl.g:3865:3: (enumLiteral_0= 'any' )
                    {
                    // InternalArdsl.g:3865:3: (enumLiteral_0= 'any' )
                    // InternalArdsl.g:3866:4: enumLiteral_0= 'any'
                    {
                    enumLiteral_0=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getPlanesAccess().getAnyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPlanesAccess().getAnyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:3873:3: (enumLiteral_1= 'horizontal' )
                    {
                    // InternalArdsl.g:3873:3: (enumLiteral_1= 'horizontal' )
                    // InternalArdsl.g:3874:4: enumLiteral_1= 'horizontal'
                    {
                    enumLiteral_1=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getPlanesAccess().getHorizontalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPlanesAccess().getHorizontalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArdsl.g:3881:3: (enumLiteral_2= 'vertical' )
                    {
                    // InternalArdsl.g:3881:3: (enumLiteral_2= 'vertical' )
                    // InternalArdsl.g:3882:4: enumLiteral_2= 'vertical'
                    {
                    enumLiteral_2=(Token)match(input,102,FOLLOW_2); 

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
    // InternalArdsl.g:3892:1: ruleBodyType returns [Enumerator current=null] : ( (enumLiteral_0= 'static' ) | (enumLiteral_1= 'dynamic' ) | (enumLiteral_2= 'kinematic' ) ) ;
    public final Enumerator ruleBodyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArdsl.g:3898:2: ( ( (enumLiteral_0= 'static' ) | (enumLiteral_1= 'dynamic' ) | (enumLiteral_2= 'kinematic' ) ) )
            // InternalArdsl.g:3899:2: ( (enumLiteral_0= 'static' ) | (enumLiteral_1= 'dynamic' ) | (enumLiteral_2= 'kinematic' ) )
            {
            // InternalArdsl.g:3899:2: ( (enumLiteral_0= 'static' ) | (enumLiteral_1= 'dynamic' ) | (enumLiteral_2= 'kinematic' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt49=1;
                }
                break;
            case 104:
                {
                alt49=2;
                }
                break;
            case 105:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalArdsl.g:3900:3: (enumLiteral_0= 'static' )
                    {
                    // InternalArdsl.g:3900:3: (enumLiteral_0= 'static' )
                    // InternalArdsl.g:3901:4: enumLiteral_0= 'static'
                    {
                    enumLiteral_0=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getBodyTypeAccess().getStaticEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBodyTypeAccess().getStaticEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:3908:3: (enumLiteral_1= 'dynamic' )
                    {
                    // InternalArdsl.g:3908:3: (enumLiteral_1= 'dynamic' )
                    // InternalArdsl.g:3909:4: enumLiteral_1= 'dynamic'
                    {
                    enumLiteral_1=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getBodyTypeAccess().getDynamicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBodyTypeAccess().getDynamicEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArdsl.g:3916:3: (enumLiteral_2= 'kinematic' )
                    {
                    // InternalArdsl.g:3916:3: (enumLiteral_2= 'kinematic' )
                    // InternalArdsl.g:3917:4: enumLiteral_2= 'kinematic'
                    {
                    enumLiteral_2=(Token)match(input,105,FOLLOW_2); 

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


    // $ANTLR start "ruleAction"
    // InternalArdsl.g:3927:1: ruleAction returns [Enumerator current=null] : ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'delete' ) ) ;
    public final Enumerator ruleAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArdsl.g:3933:2: ( ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'delete' ) ) )
            // InternalArdsl.g:3934:2: ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'delete' ) )
            {
            // InternalArdsl.g:3934:2: ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'edit' ) | (enumLiteral_2= 'delete' ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt50=1;
                }
                break;
            case 107:
                {
                alt50=2;
                }
                break;
            case 108:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalArdsl.g:3935:3: (enumLiteral_0= 'create' )
                    {
                    // InternalArdsl.g:3935:3: (enumLiteral_0= 'create' )
                    // InternalArdsl.g:3936:4: enumLiteral_0= 'create'
                    {
                    enumLiteral_0=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getCreateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getCreateEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:3943:3: (enumLiteral_1= 'edit' )
                    {
                    // InternalArdsl.g:3943:3: (enumLiteral_1= 'edit' )
                    // InternalArdsl.g:3944:4: enumLiteral_1= 'edit'
                    {
                    enumLiteral_1=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getEditEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getEditEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArdsl.g:3951:3: (enumLiteral_2= 'delete' )
                    {
                    // InternalArdsl.g:3951:3: (enumLiteral_2= 'delete' )
                    // InternalArdsl.g:3952:4: enumLiteral_2= 'delete'
                    {
                    enumLiteral_2=(Token)match(input,108,FOLLOW_2); 

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
    // InternalArdsl.g:3962:1: rulePosition returns [Enumerator current=null] : ( (enumLiteral_0= 'front' ) | (enumLiteral_1= 'default' ) | (enumLiteral_2= 'back' ) ) ;
    public final Enumerator rulePosition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArdsl.g:3968:2: ( ( (enumLiteral_0= 'front' ) | (enumLiteral_1= 'default' ) | (enumLiteral_2= 'back' ) ) )
            // InternalArdsl.g:3969:2: ( (enumLiteral_0= 'front' ) | (enumLiteral_1= 'default' ) | (enumLiteral_2= 'back' ) )
            {
            // InternalArdsl.g:3969:2: ( (enumLiteral_0= 'front' ) | (enumLiteral_1= 'default' ) | (enumLiteral_2= 'back' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 109:
                {
                alt51=1;
                }
                break;
            case 110:
                {
                alt51=2;
                }
                break;
            case 111:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalArdsl.g:3970:3: (enumLiteral_0= 'front' )
                    {
                    // InternalArdsl.g:3970:3: (enumLiteral_0= 'front' )
                    // InternalArdsl.g:3971:4: enumLiteral_0= 'front'
                    {
                    enumLiteral_0=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getPositionAccess().getFrontEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPositionAccess().getFrontEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:3978:3: (enumLiteral_1= 'default' )
                    {
                    // InternalArdsl.g:3978:3: (enumLiteral_1= 'default' )
                    // InternalArdsl.g:3979:4: enumLiteral_1= 'default'
                    {
                    enumLiteral_1=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getPositionAccess().getDefaultEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPositionAccess().getDefaultEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArdsl.g:3986:3: (enumLiteral_2= 'back' )
                    {
                    // InternalArdsl.g:3986:3: (enumLiteral_2= 'back' )
                    // InternalArdsl.g:3987:4: enumLiteral_2= 'back'
                    {
                    enumLiteral_2=(Token)match(input,111,FOLLOW_2); 

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
    // InternalArdsl.g:3997:1: ruleLogicOps returns [Enumerator current=null] : ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) ;
    public final Enumerator ruleLogicOps() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalArdsl.g:4003:2: ( ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) )
            // InternalArdsl.g:4004:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            {
            // InternalArdsl.g:4004:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==112) ) {
                alt52=1;
            }
            else if ( (LA52_0==113) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalArdsl.g:4005:3: (enumLiteral_0= '&' )
                    {
                    // InternalArdsl.g:4005:3: (enumLiteral_0= '&' )
                    // InternalArdsl.g:4006:4: enumLiteral_0= '&'
                    {
                    enumLiteral_0=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getLogicOpsAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicOpsAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:4013:3: (enumLiteral_1= '|' )
                    {
                    // InternalArdsl.g:4013:3: (enumLiteral_1= '|' )
                    // InternalArdsl.g:4014:4: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,113,FOLLOW_2); 

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
    // InternalArdsl.g:4024:1: ruleArithmOps returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) ) ;
    public final Enumerator ruleArithmOps() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalArdsl.g:4030:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) ) )
            // InternalArdsl.g:4031:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) )
            {
            // InternalArdsl.g:4031:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) )
            int alt53=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt53=1;
                }
                break;
            case 114:
                {
                alt53=2;
                }
                break;
            case 115:
                {
                alt53=3;
                }
                break;
            case 116:
                {
                alt53=4;
                }
                break;
            case 117:
                {
                alt53=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalArdsl.g:4032:3: (enumLiteral_0= '=' )
                    {
                    // InternalArdsl.g:4032:3: (enumLiteral_0= '=' )
                    // InternalArdsl.g:4033:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getArithmOpsAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getArithmOpsAccess().getEqualEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:4040:3: (enumLiteral_1= '>' )
                    {
                    // InternalArdsl.g:4040:3: (enumLiteral_1= '>' )
                    // InternalArdsl.g:4041:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getArithmOpsAccess().getGreaterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getArithmOpsAccess().getGreaterEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArdsl.g:4048:3: (enumLiteral_2= '>=' )
                    {
                    // InternalArdsl.g:4048:3: (enumLiteral_2= '>=' )
                    // InternalArdsl.g:4049:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getArithmOpsAccess().getGreaterEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getArithmOpsAccess().getGreaterEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalArdsl.g:4056:3: (enumLiteral_3= '<' )
                    {
                    // InternalArdsl.g:4056:3: (enumLiteral_3= '<' )
                    // InternalArdsl.g:4057:4: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getArithmOpsAccess().getLowerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getArithmOpsAccess().getLowerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalArdsl.g:4064:3: (enumLiteral_4= '<=' )
                    {
                    // InternalArdsl.g:4064:3: (enumLiteral_4= '<=' )
                    // InternalArdsl.g:4065:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,117,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000210030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000218000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000007000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000060040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000038000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000010000L,0x0000000000007800L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000010000L,0x0000000000007000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000010000L,0x0000000000006000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000010000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000010000L,0x00000000001E0400L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000010000L,0x00000000001C0400L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000010000L,0x0000000000180400L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000010000L,0x0000000000180000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000010000L,0x0000000000100000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x00001C0000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000002L,0x000000003E000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000E00000000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000002L,0x000000003C000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000002L,0x0000000038000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000030L,0x0000000E00000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000008000000L,0x003C000000000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});

}