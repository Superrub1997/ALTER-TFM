package arg.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import arg.services.ArgGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArgParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'E'", "'e'", "'camera'", "'drag'", "'tilt'", "'touch'", "'any'", "'horizontal'", "'vertical'", "'static'", "'dynamic'", "'kinematic'", "'start'", "'win'", "'lose'", "'none'", "'restart'", "'create'", "'edit'", "'delete'", "'front'", "'default'", "'back'", "'&'", "'|'", "'='", "'>'", "'>='", "'<'", "'<='", "'Game'", "'{'", "'elements'", "'}'", "'dependences'", "'Graphic'", "'Physics'", "'Gamelogic'", "'Display'", "'score'", "'Actions'", "'Collisions'", "'Buttons'", "'Elements'", "':'", "'['", "'..'", "']'", "'min'", "'max'", "'target'", "'containtment'", "'opposite'", "'-'", "'element'", "'versions'", "'constraints'", "'plane'", "'sizeMin'", "'sizeMax'", "'xVariation'", "'yVariation'", "'zVariation'", "'rotation'", "'.'", "'body'", "'forces'", "'contacts'", "'mass'", "'bodyType'", "'charge'", "'friction'", "'rollingFriction'", "'restitution'", "'damping'", "'angularDamping'", "'collision'", "'contact'", "'gesture'", "','", "'->'", "'goal'", "'lives'", "'action'", "'display'", "'timeEach'", "'changes'", "'to'", "'attributes'", "'rules'", "'do'", "'in'", "'named'", "'where'", "'scale'", "'stat'", "'changeStat'", "'force'", "'value'", "'if('", "')'", "'!'", "'('", "'Number'", "'abstract'", "'invisible'", "'isParam'", "'isKey'", "'readOnly'", "'overlaps'"
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
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__120=120;
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

    	public void setGrammarAccess(ArgGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleOntological"
    // InternalArg.g:53:1: entryRuleOntological : ruleOntological EOF ;
    public final void entryRuleOntological() throws RecognitionException {
        try {
            // InternalArg.g:54:1: ( ruleOntological EOF )
            // InternalArg.g:55:1: ruleOntological EOF
            {
             before(grammarAccess.getOntologicalRule()); 
            pushFollow(FOLLOW_1);
            ruleOntological();

            state._fsp--;

             after(grammarAccess.getOntologicalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOntological"


    // $ANTLR start "ruleOntological"
    // InternalArg.g:62:1: ruleOntological : ( ( rule__Ontological__Group__0 ) ) ;
    public final void ruleOntological() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:66:2: ( ( ( rule__Ontological__Group__0 ) ) )
            // InternalArg.g:67:2: ( ( rule__Ontological__Group__0 ) )
            {
            // InternalArg.g:67:2: ( ( rule__Ontological__Group__0 ) )
            // InternalArg.g:68:3: ( rule__Ontological__Group__0 )
            {
             before(grammarAccess.getOntologicalAccess().getGroup()); 
            // InternalArg.g:69:3: ( rule__Ontological__Group__0 )
            // InternalArg.g:69:4: rule__Ontological__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ontological__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalAccess().getGroup()); 

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
    // $ANTLR end "ruleOntological"


    // $ANTLR start "entryRuleCondition"
    // InternalArg.g:78:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalArg.g:79:1: ( ruleCondition EOF )
            // InternalArg.g:80:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalArg.g:87:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:91:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalArg.g:92:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalArg.g:92:2: ( ( rule__Condition__Alternatives ) )
            // InternalArg.g:93:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalArg.g:94:3: ( rule__Condition__Alternatives )
            // InternalArg.g:94:4: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleValue"
    // InternalArg.g:103:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalArg.g:104:1: ( ruleValue EOF )
            // InternalArg.g:105:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalArg.g:112:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:116:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalArg.g:117:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalArg.g:117:2: ( ( rule__Value__Alternatives ) )
            // InternalArg.g:118:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalArg.g:119:3: ( rule__Value__Alternatives )
            // InternalArg.g:119:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleEString"
    // InternalArg.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalArg.g:129:1: ( ruleEString EOF )
            // InternalArg.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalArg.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalArg.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalArg.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalArg.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalArg.g:144:3: ( rule__EString__Alternatives )
            // InternalArg.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleClass"
    // InternalArg.g:153:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalArg.g:154:1: ( ruleClass EOF )
            // InternalArg.g:155:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalArg.g:162:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:166:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalArg.g:167:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalArg.g:167:2: ( ( rule__Class__Group__0 ) )
            // InternalArg.g:168:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalArg.g:169:3: ( rule__Class__Group__0 )
            // InternalArg.g:169:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleGraphic"
    // InternalArg.g:178:1: entryRuleGraphic : ruleGraphic EOF ;
    public final void entryRuleGraphic() throws RecognitionException {
        try {
            // InternalArg.g:179:1: ( ruleGraphic EOF )
            // InternalArg.g:180:1: ruleGraphic EOF
            {
             before(grammarAccess.getGraphicRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphic();

            state._fsp--;

             after(grammarAccess.getGraphicRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGraphic"


    // $ANTLR start "ruleGraphic"
    // InternalArg.g:187:1: ruleGraphic : ( ( rule__Graphic__Group__0 ) ) ;
    public final void ruleGraphic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:191:2: ( ( ( rule__Graphic__Group__0 ) ) )
            // InternalArg.g:192:2: ( ( rule__Graphic__Group__0 ) )
            {
            // InternalArg.g:192:2: ( ( rule__Graphic__Group__0 ) )
            // InternalArg.g:193:3: ( rule__Graphic__Group__0 )
            {
             before(grammarAccess.getGraphicAccess().getGroup()); 
            // InternalArg.g:194:3: ( rule__Graphic__Group__0 )
            // InternalArg.g:194:4: rule__Graphic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Graphic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicAccess().getGroup()); 

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
    // $ANTLR end "ruleGraphic"


    // $ANTLR start "entryRulePhysic"
    // InternalArg.g:203:1: entryRulePhysic : rulePhysic EOF ;
    public final void entryRulePhysic() throws RecognitionException {
        try {
            // InternalArg.g:204:1: ( rulePhysic EOF )
            // InternalArg.g:205:1: rulePhysic EOF
            {
             before(grammarAccess.getPhysicRule()); 
            pushFollow(FOLLOW_1);
            rulePhysic();

            state._fsp--;

             after(grammarAccess.getPhysicRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePhysic"


    // $ANTLR start "rulePhysic"
    // InternalArg.g:212:1: rulePhysic : ( ( rule__Physic__Group__0 ) ) ;
    public final void rulePhysic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:216:2: ( ( ( rule__Physic__Group__0 ) ) )
            // InternalArg.g:217:2: ( ( rule__Physic__Group__0 ) )
            {
            // InternalArg.g:217:2: ( ( rule__Physic__Group__0 ) )
            // InternalArg.g:218:3: ( rule__Physic__Group__0 )
            {
             before(grammarAccess.getPhysicAccess().getGroup()); 
            // InternalArg.g:219:3: ( rule__Physic__Group__0 )
            // InternalArg.g:219:4: rule__Physic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Physic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhysicAccess().getGroup()); 

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
    // $ANTLR end "rulePhysic"


    // $ANTLR start "entryRuleGame"
    // InternalArg.g:228:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // InternalArg.g:229:1: ( ruleGame EOF )
            // InternalArg.g:230:1: ruleGame EOF
            {
             before(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getGameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalArg.g:237:1: ruleGame : ( ( rule__Game__Group__0 ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:241:2: ( ( ( rule__Game__Group__0 ) ) )
            // InternalArg.g:242:2: ( ( rule__Game__Group__0 ) )
            {
            // InternalArg.g:242:2: ( ( rule__Game__Group__0 ) )
            // InternalArg.g:243:3: ( rule__Game__Group__0 )
            {
             before(grammarAccess.getGameAccess().getGroup()); 
            // InternalArg.g:244:3: ( rule__Game__Group__0 )
            // InternalArg.g:244:4: rule__Game__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGroup()); 

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
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleAttribute"
    // InternalArg.g:253:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalArg.g:254:1: ( ruleAttribute EOF )
            // InternalArg.g:255:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalArg.g:262:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:266:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalArg.g:267:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalArg.g:267:2: ( ( rule__Attribute__Group__0 ) )
            // InternalArg.g:268:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalArg.g:269:3: ( rule__Attribute__Group__0 )
            // InternalArg.g:269:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeMax"
    // InternalArg.g:278:1: entryRuleAttributeMax : ruleAttributeMax EOF ;
    public final void entryRuleAttributeMax() throws RecognitionException {
        try {
            // InternalArg.g:279:1: ( ruleAttributeMax EOF )
            // InternalArg.g:280:1: ruleAttributeMax EOF
            {
             before(grammarAccess.getAttributeMaxRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeMax();

            state._fsp--;

             after(grammarAccess.getAttributeMaxRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeMax"


    // $ANTLR start "ruleAttributeMax"
    // InternalArg.g:287:1: ruleAttributeMax : ( ( rule__AttributeMax__Alternatives ) ) ;
    public final void ruleAttributeMax() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:291:2: ( ( ( rule__AttributeMax__Alternatives ) ) )
            // InternalArg.g:292:2: ( ( rule__AttributeMax__Alternatives ) )
            {
            // InternalArg.g:292:2: ( ( rule__AttributeMax__Alternatives ) )
            // InternalArg.g:293:3: ( rule__AttributeMax__Alternatives )
            {
             before(grammarAccess.getAttributeMaxAccess().getAlternatives()); 
            // InternalArg.g:294:3: ( rule__AttributeMax__Alternatives )
            // InternalArg.g:294:4: rule__AttributeMax__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeMax__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeMaxAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttributeMax"


    // $ANTLR start "entryRuleReference"
    // InternalArg.g:303:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalArg.g:304:1: ( ruleReference EOF )
            // InternalArg.g:305:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalArg.g:312:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:316:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalArg.g:317:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalArg.g:317:2: ( ( rule__Reference__Group__0 ) )
            // InternalArg.g:318:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalArg.g:319:3: ( rule__Reference__Group__0 )
            // InternalArg.g:319:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleEInt"
    // InternalArg.g:328:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalArg.g:329:1: ( ruleEInt EOF )
            // InternalArg.g:330:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalArg.g:337:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:341:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalArg.g:342:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalArg.g:342:2: ( ( rule__EInt__Group__0 ) )
            // InternalArg.g:343:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalArg.g:344:3: ( rule__EInt__Group__0 )
            // InternalArg.g:344:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleGraphicClass"
    // InternalArg.g:353:1: entryRuleGraphicClass : ruleGraphicClass EOF ;
    public final void entryRuleGraphicClass() throws RecognitionException {
        try {
            // InternalArg.g:354:1: ( ruleGraphicClass EOF )
            // InternalArg.g:355:1: ruleGraphicClass EOF
            {
             before(grammarAccess.getGraphicClassRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicClass();

            state._fsp--;

             after(grammarAccess.getGraphicClassRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGraphicClass"


    // $ANTLR start "ruleGraphicClass"
    // InternalArg.g:362:1: ruleGraphicClass : ( ( rule__GraphicClass__Group__0 ) ) ;
    public final void ruleGraphicClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:366:2: ( ( ( rule__GraphicClass__Group__0 ) ) )
            // InternalArg.g:367:2: ( ( rule__GraphicClass__Group__0 ) )
            {
            // InternalArg.g:367:2: ( ( rule__GraphicClass__Group__0 ) )
            // InternalArg.g:368:3: ( rule__GraphicClass__Group__0 )
            {
             before(grammarAccess.getGraphicClassAccess().getGroup()); 
            // InternalArg.g:369:3: ( rule__GraphicClass__Group__0 )
            // InternalArg.g:369:4: rule__GraphicClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphicClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphicClassAccess().getGroup()); 

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
    // $ANTLR end "ruleGraphicClass"


    // $ANTLR start "entryRuleConstraints"
    // InternalArg.g:378:1: entryRuleConstraints : ruleConstraints EOF ;
    public final void entryRuleConstraints() throws RecognitionException {
        try {
            // InternalArg.g:379:1: ( ruleConstraints EOF )
            // InternalArg.g:380:1: ruleConstraints EOF
            {
             before(grammarAccess.getConstraintsRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraints();

            state._fsp--;

             after(grammarAccess.getConstraintsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstraints"


    // $ANTLR start "ruleConstraints"
    // InternalArg.g:387:1: ruleConstraints : ( ( rule__Constraints__Group__0 ) ) ;
    public final void ruleConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:391:2: ( ( ( rule__Constraints__Group__0 ) ) )
            // InternalArg.g:392:2: ( ( rule__Constraints__Group__0 ) )
            {
            // InternalArg.g:392:2: ( ( rule__Constraints__Group__0 ) )
            // InternalArg.g:393:3: ( rule__Constraints__Group__0 )
            {
             before(grammarAccess.getConstraintsAccess().getGroup()); 
            // InternalArg.g:394:3: ( rule__Constraints__Group__0 )
            // InternalArg.g:394:4: rule__Constraints__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getGroup()); 

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
    // $ANTLR end "ruleConstraints"


    // $ANTLR start "entryRuleVersions"
    // InternalArg.g:403:1: entryRuleVersions : ruleVersions EOF ;
    public final void entryRuleVersions() throws RecognitionException {
        try {
            // InternalArg.g:404:1: ( ruleVersions EOF )
            // InternalArg.g:405:1: ruleVersions EOF
            {
             before(grammarAccess.getVersionsRule()); 
            pushFollow(FOLLOW_1);
            ruleVersions();

            state._fsp--;

             after(grammarAccess.getVersionsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVersions"


    // $ANTLR start "ruleVersions"
    // InternalArg.g:412:1: ruleVersions : ( ( rule__Versions__Group__0 ) ) ;
    public final void ruleVersions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:416:2: ( ( ( rule__Versions__Group__0 ) ) )
            // InternalArg.g:417:2: ( ( rule__Versions__Group__0 ) )
            {
            // InternalArg.g:417:2: ( ( rule__Versions__Group__0 ) )
            // InternalArg.g:418:3: ( rule__Versions__Group__0 )
            {
             before(grammarAccess.getVersionsAccess().getGroup()); 
            // InternalArg.g:419:3: ( rule__Versions__Group__0 )
            // InternalArg.g:419:4: rule__Versions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Versions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionsAccess().getGroup()); 

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
    // $ANTLR end "ruleVersions"


    // $ANTLR start "entryRuleEDouble"
    // InternalArg.g:428:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalArg.g:429:1: ( ruleEDouble EOF )
            // InternalArg.g:430:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalArg.g:437:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:441:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalArg.g:442:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalArg.g:442:2: ( ( rule__EDouble__Group__0 ) )
            // InternalArg.g:443:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalArg.g:444:3: ( rule__EDouble__Group__0 )
            // InternalArg.g:444:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRulePhysicClass"
    // InternalArg.g:453:1: entryRulePhysicClass : rulePhysicClass EOF ;
    public final void entryRulePhysicClass() throws RecognitionException {
        try {
            // InternalArg.g:454:1: ( rulePhysicClass EOF )
            // InternalArg.g:455:1: rulePhysicClass EOF
            {
             before(grammarAccess.getPhysicClassRule()); 
            pushFollow(FOLLOW_1);
            rulePhysicClass();

            state._fsp--;

             after(grammarAccess.getPhysicClassRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePhysicClass"


    // $ANTLR start "rulePhysicClass"
    // InternalArg.g:462:1: rulePhysicClass : ( ( rule__PhysicClass__Group__0 ) ) ;
    public final void rulePhysicClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:466:2: ( ( ( rule__PhysicClass__Group__0 ) ) )
            // InternalArg.g:467:2: ( ( rule__PhysicClass__Group__0 ) )
            {
            // InternalArg.g:467:2: ( ( rule__PhysicClass__Group__0 ) )
            // InternalArg.g:468:3: ( rule__PhysicClass__Group__0 )
            {
             before(grammarAccess.getPhysicClassAccess().getGroup()); 
            // InternalArg.g:469:3: ( rule__PhysicClass__Group__0 )
            // InternalArg.g:469:4: rule__PhysicClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhysicClassAccess().getGroup()); 

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
    // $ANTLR end "rulePhysicClass"


    // $ANTLR start "entryRulePhysicBody"
    // InternalArg.g:478:1: entryRulePhysicBody : rulePhysicBody EOF ;
    public final void entryRulePhysicBody() throws RecognitionException {
        try {
            // InternalArg.g:479:1: ( rulePhysicBody EOF )
            // InternalArg.g:480:1: rulePhysicBody EOF
            {
             before(grammarAccess.getPhysicBodyRule()); 
            pushFollow(FOLLOW_1);
            rulePhysicBody();

            state._fsp--;

             after(grammarAccess.getPhysicBodyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePhysicBody"


    // $ANTLR start "rulePhysicBody"
    // InternalArg.g:487:1: rulePhysicBody : ( ( rule__PhysicBody__Group__0 ) ) ;
    public final void rulePhysicBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:491:2: ( ( ( rule__PhysicBody__Group__0 ) ) )
            // InternalArg.g:492:2: ( ( rule__PhysicBody__Group__0 ) )
            {
            // InternalArg.g:492:2: ( ( rule__PhysicBody__Group__0 ) )
            // InternalArg.g:493:3: ( rule__PhysicBody__Group__0 )
            {
             before(grammarAccess.getPhysicBodyAccess().getGroup()); 
            // InternalArg.g:494:3: ( rule__PhysicBody__Group__0 )
            // InternalArg.g:494:4: rule__PhysicBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PhysicBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhysicBodyAccess().getGroup()); 

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
    // $ANTLR end "rulePhysicBody"


    // $ANTLR start "entryRuleBitMasks"
    // InternalArg.g:503:1: entryRuleBitMasks : ruleBitMasks EOF ;
    public final void entryRuleBitMasks() throws RecognitionException {
        try {
            // InternalArg.g:504:1: ( ruleBitMasks EOF )
            // InternalArg.g:505:1: ruleBitMasks EOF
            {
             before(grammarAccess.getBitMasksRule()); 
            pushFollow(FOLLOW_1);
            ruleBitMasks();

            state._fsp--;

             after(grammarAccess.getBitMasksRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBitMasks"


    // $ANTLR start "ruleBitMasks"
    // InternalArg.g:512:1: ruleBitMasks : ( ( rule__BitMasks__Group__0 ) ) ;
    public final void ruleBitMasks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:516:2: ( ( ( rule__BitMasks__Group__0 ) ) )
            // InternalArg.g:517:2: ( ( rule__BitMasks__Group__0 ) )
            {
            // InternalArg.g:517:2: ( ( rule__BitMasks__Group__0 ) )
            // InternalArg.g:518:3: ( rule__BitMasks__Group__0 )
            {
             before(grammarAccess.getBitMasksAccess().getGroup()); 
            // InternalArg.g:519:3: ( rule__BitMasks__Group__0 )
            // InternalArg.g:519:4: rule__BitMasks__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BitMasks__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBitMasksAccess().getGroup()); 

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
    // $ANTLR end "ruleBitMasks"


    // $ANTLR start "entryRuleForce"
    // InternalArg.g:528:1: entryRuleForce : ruleForce EOF ;
    public final void entryRuleForce() throws RecognitionException {
        try {
            // InternalArg.g:529:1: ( ruleForce EOF )
            // InternalArg.g:530:1: ruleForce EOF
            {
             before(grammarAccess.getForceRule()); 
            pushFollow(FOLLOW_1);
            ruleForce();

            state._fsp--;

             after(grammarAccess.getForceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForce"


    // $ANTLR start "ruleForce"
    // InternalArg.g:537:1: ruleForce : ( ( rule__Force__Group__0 ) ) ;
    public final void ruleForce() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:541:2: ( ( ( rule__Force__Group__0 ) ) )
            // InternalArg.g:542:2: ( ( rule__Force__Group__0 ) )
            {
            // InternalArg.g:542:2: ( ( rule__Force__Group__0 ) )
            // InternalArg.g:543:3: ( rule__Force__Group__0 )
            {
             before(grammarAccess.getForceAccess().getGroup()); 
            // InternalArg.g:544:3: ( rule__Force__Group__0 )
            // InternalArg.g:544:4: rule__Force__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Force__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForceAccess().getGroup()); 

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
    // $ANTLR end "ruleForce"


    // $ANTLR start "entryRuleGamePad"
    // InternalArg.g:553:1: entryRuleGamePad : ruleGamePad EOF ;
    public final void entryRuleGamePad() throws RecognitionException {
        try {
            // InternalArg.g:554:1: ( ruleGamePad EOF )
            // InternalArg.g:555:1: ruleGamePad EOF
            {
             before(grammarAccess.getGamePadRule()); 
            pushFollow(FOLLOW_1);
            ruleGamePad();

            state._fsp--;

             after(grammarAccess.getGamePadRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGamePad"


    // $ANTLR start "ruleGamePad"
    // InternalArg.g:562:1: ruleGamePad : ( ( rule__GamePad__Group__0 ) ) ;
    public final void ruleGamePad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:566:2: ( ( ( rule__GamePad__Group__0 ) ) )
            // InternalArg.g:567:2: ( ( rule__GamePad__Group__0 ) )
            {
            // InternalArg.g:567:2: ( ( rule__GamePad__Group__0 ) )
            // InternalArg.g:568:3: ( rule__GamePad__Group__0 )
            {
             before(grammarAccess.getGamePadAccess().getGroup()); 
            // InternalArg.g:569:3: ( rule__GamePad__Group__0 )
            // InternalArg.g:569:4: rule__GamePad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GamePad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGamePadAccess().getGroup()); 

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
    // $ANTLR end "ruleGamePad"


    // $ANTLR start "entryRuleScoreSystem"
    // InternalArg.g:578:1: entryRuleScoreSystem : ruleScoreSystem EOF ;
    public final void entryRuleScoreSystem() throws RecognitionException {
        try {
            // InternalArg.g:579:1: ( ruleScoreSystem EOF )
            // InternalArg.g:580:1: ruleScoreSystem EOF
            {
             before(grammarAccess.getScoreSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleScoreSystem();

            state._fsp--;

             after(grammarAccess.getScoreSystemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScoreSystem"


    // $ANTLR start "ruleScoreSystem"
    // InternalArg.g:587:1: ruleScoreSystem : ( ( rule__ScoreSystem__Group__0 ) ) ;
    public final void ruleScoreSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:591:2: ( ( ( rule__ScoreSystem__Group__0 ) ) )
            // InternalArg.g:592:2: ( ( rule__ScoreSystem__Group__0 ) )
            {
            // InternalArg.g:592:2: ( ( rule__ScoreSystem__Group__0 ) )
            // InternalArg.g:593:3: ( rule__ScoreSystem__Group__0 )
            {
             before(grammarAccess.getScoreSystemAccess().getGroup()); 
            // InternalArg.g:594:3: ( rule__ScoreSystem__Group__0 )
            // InternalArg.g:594:4: rule__ScoreSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScoreSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScoreSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleScoreSystem"


    // $ANTLR start "entryRuleTrigger"
    // InternalArg.g:603:1: entryRuleTrigger : ruleTrigger EOF ;
    public final void entryRuleTrigger() throws RecognitionException {
        try {
            // InternalArg.g:604:1: ( ruleTrigger EOF )
            // InternalArg.g:605:1: ruleTrigger EOF
            {
             before(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getTriggerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalArg.g:612:1: ruleTrigger : ( ( rule__Trigger__Group__0 ) ) ;
    public final void ruleTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:616:2: ( ( ( rule__Trigger__Group__0 ) ) )
            // InternalArg.g:617:2: ( ( rule__Trigger__Group__0 ) )
            {
            // InternalArg.g:617:2: ( ( rule__Trigger__Group__0 ) )
            // InternalArg.g:618:3: ( rule__Trigger__Group__0 )
            {
             before(grammarAccess.getTriggerAccess().getGroup()); 
            // InternalArg.g:619:3: ( rule__Trigger__Group__0 )
            // InternalArg.g:619:4: rule__Trigger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getGroup()); 

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleCollision"
    // InternalArg.g:628:1: entryRuleCollision : ruleCollision EOF ;
    public final void entryRuleCollision() throws RecognitionException {
        try {
            // InternalArg.g:629:1: ( ruleCollision EOF )
            // InternalArg.g:630:1: ruleCollision EOF
            {
             before(grammarAccess.getCollisionRule()); 
            pushFollow(FOLLOW_1);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getCollisionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCollision"


    // $ANTLR start "ruleCollision"
    // InternalArg.g:637:1: ruleCollision : ( ( rule__Collision__Group__0 ) ) ;
    public final void ruleCollision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:641:2: ( ( ( rule__Collision__Group__0 ) ) )
            // InternalArg.g:642:2: ( ( rule__Collision__Group__0 ) )
            {
            // InternalArg.g:642:2: ( ( rule__Collision__Group__0 ) )
            // InternalArg.g:643:3: ( rule__Collision__Group__0 )
            {
             before(grammarAccess.getCollisionAccess().getGroup()); 
            // InternalArg.g:644:3: ( rule__Collision__Group__0 )
            // InternalArg.g:644:4: rule__Collision__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getGroup()); 

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
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRuleObjInit"
    // InternalArg.g:653:1: entryRuleObjInit : ruleObjInit EOF ;
    public final void entryRuleObjInit() throws RecognitionException {
        try {
            // InternalArg.g:654:1: ( ruleObjInit EOF )
            // InternalArg.g:655:1: ruleObjInit EOF
            {
             before(grammarAccess.getObjInitRule()); 
            pushFollow(FOLLOW_1);
            ruleObjInit();

            state._fsp--;

             after(grammarAccess.getObjInitRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObjInit"


    // $ANTLR start "ruleObjInit"
    // InternalArg.g:662:1: ruleObjInit : ( ( rule__ObjInit__Group__0 ) ) ;
    public final void ruleObjInit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:666:2: ( ( ( rule__ObjInit__Group__0 ) ) )
            // InternalArg.g:667:2: ( ( rule__ObjInit__Group__0 ) )
            {
            // InternalArg.g:667:2: ( ( rule__ObjInit__Group__0 ) )
            // InternalArg.g:668:3: ( rule__ObjInit__Group__0 )
            {
             before(grammarAccess.getObjInitAccess().getGroup()); 
            // InternalArg.g:669:3: ( rule__ObjInit__Group__0 )
            // InternalArg.g:669:4: rule__ObjInit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjInitAccess().getGroup()); 

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
    // $ANTLR end "ruleObjInit"


    // $ANTLR start "entryRulePosOrCamera"
    // InternalArg.g:678:1: entryRulePosOrCamera : rulePosOrCamera EOF ;
    public final void entryRulePosOrCamera() throws RecognitionException {
        try {
            // InternalArg.g:679:1: ( rulePosOrCamera EOF )
            // InternalArg.g:680:1: rulePosOrCamera EOF
            {
             before(grammarAccess.getPosOrCameraRule()); 
            pushFollow(FOLLOW_1);
            rulePosOrCamera();

            state._fsp--;

             after(grammarAccess.getPosOrCameraRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePosOrCamera"


    // $ANTLR start "rulePosOrCamera"
    // InternalArg.g:687:1: rulePosOrCamera : ( ( rule__PosOrCamera__Alternatives ) ) ;
    public final void rulePosOrCamera() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:691:2: ( ( ( rule__PosOrCamera__Alternatives ) ) )
            // InternalArg.g:692:2: ( ( rule__PosOrCamera__Alternatives ) )
            {
            // InternalArg.g:692:2: ( ( rule__PosOrCamera__Alternatives ) )
            // InternalArg.g:693:3: ( rule__PosOrCamera__Alternatives )
            {
             before(grammarAccess.getPosOrCameraAccess().getAlternatives()); 
            // InternalArg.g:694:3: ( rule__PosOrCamera__Alternatives )
            // InternalArg.g:694:4: rule__PosOrCamera__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PosOrCamera__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPosOrCameraAccess().getAlternatives()); 

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
    // $ANTLR end "rulePosOrCamera"


    // $ANTLR start "entryRulePhysicChange"
    // InternalArg.g:703:1: entryRulePhysicChange : rulePhysicChange EOF ;
    public final void entryRulePhysicChange() throws RecognitionException {
        try {
            // InternalArg.g:704:1: ( rulePhysicChange EOF )
            // InternalArg.g:705:1: rulePhysicChange EOF
            {
             before(grammarAccess.getPhysicChangeRule()); 
            pushFollow(FOLLOW_1);
            rulePhysicChange();

            state._fsp--;

             after(grammarAccess.getPhysicChangeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePhysicChange"


    // $ANTLR start "rulePhysicChange"
    // InternalArg.g:712:1: rulePhysicChange : ( ( rule__PhysicChange__Group__0 ) ) ;
    public final void rulePhysicChange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:716:2: ( ( ( rule__PhysicChange__Group__0 ) ) )
            // InternalArg.g:717:2: ( ( rule__PhysicChange__Group__0 ) )
            {
            // InternalArg.g:717:2: ( ( rule__PhysicChange__Group__0 ) )
            // InternalArg.g:718:3: ( rule__PhysicChange__Group__0 )
            {
             before(grammarAccess.getPhysicChangeAccess().getGroup()); 
            // InternalArg.g:719:3: ( rule__PhysicChange__Group__0 )
            // InternalArg.g:719:4: rule__PhysicChange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangeAccess().getGroup()); 

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
    // $ANTLR end "rulePhysicChange"


    // $ANTLR start "entryRuleObjAttribute"
    // InternalArg.g:728:1: entryRuleObjAttribute : ruleObjAttribute EOF ;
    public final void entryRuleObjAttribute() throws RecognitionException {
        try {
            // InternalArg.g:729:1: ( ruleObjAttribute EOF )
            // InternalArg.g:730:1: ruleObjAttribute EOF
            {
             before(grammarAccess.getObjAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleObjAttribute();

            state._fsp--;

             after(grammarAccess.getObjAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObjAttribute"


    // $ANTLR start "ruleObjAttribute"
    // InternalArg.g:737:1: ruleObjAttribute : ( ( rule__ObjAttribute__Group__0 ) ) ;
    public final void ruleObjAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:741:2: ( ( ( rule__ObjAttribute__Group__0 ) ) )
            // InternalArg.g:742:2: ( ( rule__ObjAttribute__Group__0 ) )
            {
            // InternalArg.g:742:2: ( ( rule__ObjAttribute__Group__0 ) )
            // InternalArg.g:743:3: ( rule__ObjAttribute__Group__0 )
            {
             before(grammarAccess.getObjAttributeAccess().getGroup()); 
            // InternalArg.g:744:3: ( rule__ObjAttribute__Group__0 )
            // InternalArg.g:744:4: rule__ObjAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleObjAttribute"


    // $ANTLR start "entryRuleRule"
    // InternalArg.g:753:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalArg.g:754:1: ( ruleRule EOF )
            // InternalArg.g:755:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalArg.g:762:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:766:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalArg.g:767:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalArg.g:767:2: ( ( rule__Rule__Group__0 ) )
            // InternalArg.g:768:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalArg.g:769:3: ( rule__Rule__Group__0 )
            // InternalArg.g:769:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleNot"
    // InternalArg.g:778:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalArg.g:779:1: ( ruleNot EOF )
            // InternalArg.g:780:1: ruleNot EOF
            {
             before(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            ruleNot();

            state._fsp--;

             after(grammarAccess.getNotRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalArg.g:787:1: ruleNot : ( ( rule__Not__Group__0 ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:791:2: ( ( ( rule__Not__Group__0 ) ) )
            // InternalArg.g:792:2: ( ( rule__Not__Group__0 ) )
            {
            // InternalArg.g:792:2: ( ( rule__Not__Group__0 ) )
            // InternalArg.g:793:3: ( rule__Not__Group__0 )
            {
             before(grammarAccess.getNotAccess().getGroup()); 
            // InternalArg.g:794:3: ( rule__Not__Group__0 )
            // InternalArg.g:794:4: rule__Not__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getGroup()); 

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
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleBinary"
    // InternalArg.g:803:1: entryRuleBinary : ruleBinary EOF ;
    public final void entryRuleBinary() throws RecognitionException {
        try {
            // InternalArg.g:804:1: ( ruleBinary EOF )
            // InternalArg.g:805:1: ruleBinary EOF
            {
             before(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_1);
            ruleBinary();

            state._fsp--;

             after(grammarAccess.getBinaryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBinary"


    // $ANTLR start "ruleBinary"
    // InternalArg.g:812:1: ruleBinary : ( ( rule__Binary__Group__0 ) ) ;
    public final void ruleBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:816:2: ( ( ( rule__Binary__Group__0 ) ) )
            // InternalArg.g:817:2: ( ( rule__Binary__Group__0 ) )
            {
            // InternalArg.g:817:2: ( ( rule__Binary__Group__0 ) )
            // InternalArg.g:818:3: ( rule__Binary__Group__0 )
            {
             before(grammarAccess.getBinaryAccess().getGroup()); 
            // InternalArg.g:819:3: ( rule__Binary__Group__0 )
            // InternalArg.g:819:4: rule__Binary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getGroup()); 

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
    // $ANTLR end "ruleBinary"


    // $ANTLR start "entryRuleArithmetic"
    // InternalArg.g:828:1: entryRuleArithmetic : ruleArithmetic EOF ;
    public final void entryRuleArithmetic() throws RecognitionException {
        try {
            // InternalArg.g:829:1: ( ruleArithmetic EOF )
            // InternalArg.g:830:1: ruleArithmetic EOF
            {
             before(grammarAccess.getArithmeticRule()); 
            pushFollow(FOLLOW_1);
            ruleArithmetic();

            state._fsp--;

             after(grammarAccess.getArithmeticRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArithmetic"


    // $ANTLR start "ruleArithmetic"
    // InternalArg.g:837:1: ruleArithmetic : ( ( rule__Arithmetic__Group__0 ) ) ;
    public final void ruleArithmetic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:841:2: ( ( ( rule__Arithmetic__Group__0 ) ) )
            // InternalArg.g:842:2: ( ( rule__Arithmetic__Group__0 ) )
            {
            // InternalArg.g:842:2: ( ( rule__Arithmetic__Group__0 ) )
            // InternalArg.g:843:3: ( rule__Arithmetic__Group__0 )
            {
             before(grammarAccess.getArithmeticAccess().getGroup()); 
            // InternalArg.g:844:3: ( rule__Arithmetic__Group__0 )
            // InternalArg.g:844:4: rule__Arithmetic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arithmetic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticAccess().getGroup()); 

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
    // $ANTLR end "ruleArithmetic"


    // $ANTLR start "entryRuleAttributeValue"
    // InternalArg.g:853:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // InternalArg.g:854:1: ( ruleAttributeValue EOF )
            // InternalArg.g:855:1: ruleAttributeValue EOF
            {
             before(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getAttributeValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalArg.g:862:1: ruleAttributeValue : ( ( rule__AttributeValue__Group__0 ) ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:866:2: ( ( ( rule__AttributeValue__Group__0 ) ) )
            // InternalArg.g:867:2: ( ( rule__AttributeValue__Group__0 ) )
            {
            // InternalArg.g:867:2: ( ( rule__AttributeValue__Group__0 ) )
            // InternalArg.g:868:3: ( rule__AttributeValue__Group__0 )
            {
             before(grammarAccess.getAttributeValueAccess().getGroup()); 
            // InternalArg.g:869:3: ( rule__AttributeValue__Group__0 )
            // InternalArg.g:869:4: rule__AttributeValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValueAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleConstantValue"
    // InternalArg.g:878:1: entryRuleConstantValue : ruleConstantValue EOF ;
    public final void entryRuleConstantValue() throws RecognitionException {
        try {
            // InternalArg.g:879:1: ( ruleConstantValue EOF )
            // InternalArg.g:880:1: ruleConstantValue EOF
            {
             before(grammarAccess.getConstantValueRule()); 
            pushFollow(FOLLOW_1);
            ruleConstantValue();

            state._fsp--;

             after(grammarAccess.getConstantValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // InternalArg.g:887:1: ruleConstantValue : ( ( rule__ConstantValue__ValueAssignment ) ) ;
    public final void ruleConstantValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:891:2: ( ( ( rule__ConstantValue__ValueAssignment ) ) )
            // InternalArg.g:892:2: ( ( rule__ConstantValue__ValueAssignment ) )
            {
            // InternalArg.g:892:2: ( ( rule__ConstantValue__ValueAssignment ) )
            // InternalArg.g:893:3: ( rule__ConstantValue__ValueAssignment )
            {
             before(grammarAccess.getConstantValueAccess().getValueAssignment()); 
            // InternalArg.g:894:3: ( rule__ConstantValue__ValueAssignment )
            // InternalArg.g:894:4: rule__ConstantValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConstantValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConstantValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleConstantValue"


    // $ANTLR start "entryRuleConstant"
    // InternalArg.g:903:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalArg.g:904:1: ( ruleConstant EOF )
            // InternalArg.g:905:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalArg.g:912:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:916:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalArg.g:917:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalArg.g:917:2: ( ( rule__Constant__Alternatives ) )
            // InternalArg.g:918:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalArg.g:919:3: ( rule__Constant__Alternatives )
            // InternalArg.g:919:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleAllInstances"
    // InternalArg.g:928:1: entryRuleAllInstances : ruleAllInstances EOF ;
    public final void entryRuleAllInstances() throws RecognitionException {
        try {
            // InternalArg.g:929:1: ( ruleAllInstances EOF )
            // InternalArg.g:930:1: ruleAllInstances EOF
            {
             before(grammarAccess.getAllInstancesRule()); 
            pushFollow(FOLLOW_1);
            ruleAllInstances();

            state._fsp--;

             after(grammarAccess.getAllInstancesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAllInstances"


    // $ANTLR start "ruleAllInstances"
    // InternalArg.g:937:1: ruleAllInstances : ( ( rule__AllInstances__Group__0 ) ) ;
    public final void ruleAllInstances() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:941:2: ( ( ( rule__AllInstances__Group__0 ) ) )
            // InternalArg.g:942:2: ( ( rule__AllInstances__Group__0 ) )
            {
            // InternalArg.g:942:2: ( ( rule__AllInstances__Group__0 ) )
            // InternalArg.g:943:3: ( rule__AllInstances__Group__0 )
            {
             before(grammarAccess.getAllInstancesAccess().getGroup()); 
            // InternalArg.g:944:3: ( rule__AllInstances__Group__0 )
            // InternalArg.g:944:4: rule__AllInstances__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getGroup()); 

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
    // $ANTLR end "ruleAllInstances"


    // $ANTLR start "ruleGesture"
    // InternalArg.g:953:1: ruleGesture : ( ( rule__Gesture__Alternatives ) ) ;
    public final void ruleGesture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:957:1: ( ( ( rule__Gesture__Alternatives ) ) )
            // InternalArg.g:958:2: ( ( rule__Gesture__Alternatives ) )
            {
            // InternalArg.g:958:2: ( ( rule__Gesture__Alternatives ) )
            // InternalArg.g:959:3: ( rule__Gesture__Alternatives )
            {
             before(grammarAccess.getGestureAccess().getAlternatives()); 
            // InternalArg.g:960:3: ( rule__Gesture__Alternatives )
            // InternalArg.g:960:4: rule__Gesture__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Gesture__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGestureAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGesture"


    // $ANTLR start "rulePlanes"
    // InternalArg.g:969:1: rulePlanes : ( ( rule__Planes__Alternatives ) ) ;
    public final void rulePlanes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:973:1: ( ( ( rule__Planes__Alternatives ) ) )
            // InternalArg.g:974:2: ( ( rule__Planes__Alternatives ) )
            {
            // InternalArg.g:974:2: ( ( rule__Planes__Alternatives ) )
            // InternalArg.g:975:3: ( rule__Planes__Alternatives )
            {
             before(grammarAccess.getPlanesAccess().getAlternatives()); 
            // InternalArg.g:976:3: ( rule__Planes__Alternatives )
            // InternalArg.g:976:4: rule__Planes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Planes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPlanesAccess().getAlternatives()); 

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
    // $ANTLR end "rulePlanes"


    // $ANTLR start "ruleBodyType"
    // InternalArg.g:985:1: ruleBodyType : ( ( rule__BodyType__Alternatives ) ) ;
    public final void ruleBodyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:989:1: ( ( ( rule__BodyType__Alternatives ) ) )
            // InternalArg.g:990:2: ( ( rule__BodyType__Alternatives ) )
            {
            // InternalArg.g:990:2: ( ( rule__BodyType__Alternatives ) )
            // InternalArg.g:991:3: ( rule__BodyType__Alternatives )
            {
             before(grammarAccess.getBodyTypeAccess().getAlternatives()); 
            // InternalArg.g:992:3: ( rule__BodyType__Alternatives )
            // InternalArg.g:992:4: rule__BodyType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BodyType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBodyTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBodyType"


    // $ANTLR start "ruleBasicActions"
    // InternalArg.g:1001:1: ruleBasicActions : ( ( rule__BasicActions__Alternatives ) ) ;
    public final void ruleBasicActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1005:1: ( ( ( rule__BasicActions__Alternatives ) ) )
            // InternalArg.g:1006:2: ( ( rule__BasicActions__Alternatives ) )
            {
            // InternalArg.g:1006:2: ( ( rule__BasicActions__Alternatives ) )
            // InternalArg.g:1007:3: ( rule__BasicActions__Alternatives )
            {
             before(grammarAccess.getBasicActionsAccess().getAlternatives()); 
            // InternalArg.g:1008:3: ( rule__BasicActions__Alternatives )
            // InternalArg.g:1008:4: rule__BasicActions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BasicActions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicActionsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBasicActions"


    // $ANTLR start "ruleAction"
    // InternalArg.g:1017:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1021:1: ( ( ( rule__Action__Alternatives ) ) )
            // InternalArg.g:1022:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalArg.g:1022:2: ( ( rule__Action__Alternatives ) )
            // InternalArg.g:1023:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalArg.g:1024:3: ( rule__Action__Alternatives )
            // InternalArg.g:1024:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "rulePosition"
    // InternalArg.g:1033:1: rulePosition : ( ( rule__Position__Alternatives ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1037:1: ( ( ( rule__Position__Alternatives ) ) )
            // InternalArg.g:1038:2: ( ( rule__Position__Alternatives ) )
            {
            // InternalArg.g:1038:2: ( ( rule__Position__Alternatives ) )
            // InternalArg.g:1039:3: ( rule__Position__Alternatives )
            {
             before(grammarAccess.getPositionAccess().getAlternatives()); 
            // InternalArg.g:1040:3: ( rule__Position__Alternatives )
            // InternalArg.g:1040:4: rule__Position__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Position__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getAlternatives()); 

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
    // $ANTLR end "rulePosition"


    // $ANTLR start "ruleLogicOps"
    // InternalArg.g:1049:1: ruleLogicOps : ( ( rule__LogicOps__Alternatives ) ) ;
    public final void ruleLogicOps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1053:1: ( ( ( rule__LogicOps__Alternatives ) ) )
            // InternalArg.g:1054:2: ( ( rule__LogicOps__Alternatives ) )
            {
            // InternalArg.g:1054:2: ( ( rule__LogicOps__Alternatives ) )
            // InternalArg.g:1055:3: ( rule__LogicOps__Alternatives )
            {
             before(grammarAccess.getLogicOpsAccess().getAlternatives()); 
            // InternalArg.g:1056:3: ( rule__LogicOps__Alternatives )
            // InternalArg.g:1056:4: rule__LogicOps__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogicOps__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicOpsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLogicOps"


    // $ANTLR start "ruleArithmOps"
    // InternalArg.g:1065:1: ruleArithmOps : ( ( rule__ArithmOps__Alternatives ) ) ;
    public final void ruleArithmOps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1069:1: ( ( ( rule__ArithmOps__Alternatives ) ) )
            // InternalArg.g:1070:2: ( ( rule__ArithmOps__Alternatives ) )
            {
            // InternalArg.g:1070:2: ( ( rule__ArithmOps__Alternatives ) )
            // InternalArg.g:1071:3: ( rule__ArithmOps__Alternatives )
            {
             before(grammarAccess.getArithmOpsAccess().getAlternatives()); 
            // InternalArg.g:1072:3: ( rule__ArithmOps__Alternatives )
            // InternalArg.g:1072:4: rule__ArithmOps__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArithmOps__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArithmOpsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleArithmOps"


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalArg.g:1080:1: rule__Condition__Alternatives : ( ( ruleNot ) | ( ruleBinary ) | ( ruleArithmetic ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1084:1: ( ( ruleNot ) | ( ruleBinary ) | ( ruleArithmetic ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 113:
                {
                alt1=1;
                }
                break;
            case 114:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case 65:
            case 115:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalArg.g:1085:2: ( ruleNot )
                    {
                    // InternalArg.g:1085:2: ( ruleNot )
                    // InternalArg.g:1086:3: ruleNot
                    {
                     before(grammarAccess.getConditionAccess().getNotParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNot();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getNotParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:1091:2: ( ruleBinary )
                    {
                    // InternalArg.g:1091:2: ( ruleBinary )
                    // InternalArg.g:1092:3: ruleBinary
                    {
                     before(grammarAccess.getConditionAccess().getBinaryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBinary();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getBinaryParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:1097:2: ( ruleArithmetic )
                    {
                    // InternalArg.g:1097:2: ( ruleArithmetic )
                    // InternalArg.g:1098:3: ruleArithmetic
                    {
                     before(grammarAccess.getConditionAccess().getArithmeticParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleArithmetic();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getArithmeticParserRuleCall_2()); 

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
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalArg.g:1107:1: rule__Value__Alternatives : ( ( ruleAttributeValue ) | ( ruleConstantValue ) | ( ruleAllInstances ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1111:1: ( ( ruleAttributeValue ) | ( ruleConstantValue ) | ( ruleAllInstances ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==76) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||(LA2_1>=37 && LA2_1<=41)||LA2_1==112) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==EOF||(LA2_2>=37 && LA2_2<=41)||LA2_2==112) ) {
                    alt2=2;
                }
                else if ( (LA2_2==76) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 65:
                {
                alt2=2;
                }
                break;
            case 115:
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
                    // InternalArg.g:1112:2: ( ruleAttributeValue )
                    {
                    // InternalArg.g:1112:2: ( ruleAttributeValue )
                    // InternalArg.g:1113:3: ruleAttributeValue
                    {
                     before(grammarAccess.getValueAccess().getAttributeValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getAttributeValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:1118:2: ( ruleConstantValue )
                    {
                    // InternalArg.g:1118:2: ( ruleConstantValue )
                    // InternalArg.g:1119:3: ruleConstantValue
                    {
                     before(grammarAccess.getValueAccess().getConstantValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConstantValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getConstantValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:1124:2: ( ruleAllInstances )
                    {
                    // InternalArg.g:1124:2: ( ruleAllInstances )
                    // InternalArg.g:1125:3: ruleAllInstances
                    {
                     before(grammarAccess.getValueAccess().getAllInstancesParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAllInstances();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getAllInstancesParserRuleCall_2()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalArg.g:1134:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1138:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalArg.g:1139:2: ( RULE_STRING )
                    {
                    // InternalArg.g:1139:2: ( RULE_STRING )
                    // InternalArg.g:1140:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:1145:2: ( RULE_ID )
                    {
                    // InternalArg.g:1145:2: ( RULE_ID )
                    // InternalArg.g:1146:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__AttributeMax__Alternatives"
    // InternalArg.g:1155:1: rule__AttributeMax__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__AttributeMax__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1159:1: ( ( '*' ) | ( RULE_INT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalArg.g:1160:2: ( '*' )
                    {
                    // InternalArg.g:1160:2: ( '*' )
                    // InternalArg.g:1161:3: '*'
                    {
                     before(grammarAccess.getAttributeMaxAccess().getAsteriskKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAttributeMaxAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:1166:2: ( RULE_INT )
                    {
                    // InternalArg.g:1166:2: ( RULE_INT )
                    // InternalArg.g:1167:3: RULE_INT
                    {
                     before(grammarAccess.getAttributeMaxAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getAttributeMaxAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__AttributeMax__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalArg.g:1176:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1180:1: ( ( 'E' ) | ( 'e' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalArg.g:1181:2: ( 'E' )
                    {
                    // InternalArg.g:1181:2: ( 'E' )
                    // InternalArg.g:1182:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:1187:2: ( 'e' )
                    {
                    // InternalArg.g:1187:2: ( 'e' )
                    // InternalArg.g:1188:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__PosOrCamera__Alternatives"
    // InternalArg.g:1197:1: rule__PosOrCamera__Alternatives : ( ( 'camera' ) | ( ruleEDouble ) );
    public final void rule__PosOrCamera__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1201:1: ( ( 'camera' ) | ( ruleEDouble ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT||LA6_0==65||LA6_0==76) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalArg.g:1202:2: ( 'camera' )
                    {
                    // InternalArg.g:1202:2: ( 'camera' )
                    // InternalArg.g:1203:3: 'camera'
                    {
                     before(grammarAccess.getPosOrCameraAccess().getCameraKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getPosOrCameraAccess().getCameraKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:1208:2: ( ruleEDouble )
                    {
                    // InternalArg.g:1208:2: ( ruleEDouble )
                    // InternalArg.g:1209:3: ruleEDouble
                    {
                     before(grammarAccess.getPosOrCameraAccess().getEDoubleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEDouble();

                    state._fsp--;

                     after(grammarAccess.getPosOrCameraAccess().getEDoubleParserRuleCall_1()); 

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
    // $ANTLR end "rule__PosOrCamera__Alternatives"


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalArg.g:1218:1: rule__Constant__Alternatives : ( ( ruleEInt ) | ( ruleEString ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1222:1: ( ( ruleEInt ) | ( ruleEString ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||LA7_0==65) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalArg.g:1223:2: ( ruleEInt )
                    {
                    // InternalArg.g:1223:2: ( ruleEInt )
                    // InternalArg.g:1224:3: ruleEInt
                    {
                     before(grammarAccess.getConstantAccess().getEIntParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEInt();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getEIntParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:1229:2: ( ruleEString )
                    {
                    // InternalArg.g:1229:2: ( ruleEString )
                    // InternalArg.g:1230:3: ruleEString
                    {
                     before(grammarAccess.getConstantAccess().getEStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getEStringParserRuleCall_1()); 

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
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__Gesture__Alternatives"
    // InternalArg.g:1239:1: rule__Gesture__Alternatives : ( ( ( 'drag' ) ) | ( ( 'tilt' ) ) | ( ( 'touch' ) ) );
    public final void rule__Gesture__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1243:1: ( ( ( 'drag' ) ) | ( ( 'tilt' ) ) | ( ( 'touch' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 17:
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
                    // InternalArg.g:1244:2: ( ( 'drag' ) )
                    {
                    // InternalArg.g:1244:2: ( ( 'drag' ) )
                    // InternalArg.g:1245:3: ( 'drag' )
                    {
                     before(grammarAccess.getGestureAccess().getDragEnumLiteralDeclaration_0()); 
                    // InternalArg.g:1246:3: ( 'drag' )
                    // InternalArg.g:1246:4: 'drag'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getGestureAccess().getDragEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:1250:2: ( ( 'tilt' ) )
                    {
                    // InternalArg.g:1250:2: ( ( 'tilt' ) )
                    // InternalArg.g:1251:3: ( 'tilt' )
                    {
                     before(grammarAccess.getGestureAccess().getTiltEnumLiteralDeclaration_1()); 
                    // InternalArg.g:1252:3: ( 'tilt' )
                    // InternalArg.g:1252:4: 'tilt'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getGestureAccess().getTiltEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:1256:2: ( ( 'touch' ) )
                    {
                    // InternalArg.g:1256:2: ( ( 'touch' ) )
                    // InternalArg.g:1257:3: ( 'touch' )
                    {
                     before(grammarAccess.getGestureAccess().getTouchEnumLiteralDeclaration_2()); 
                    // InternalArg.g:1258:3: ( 'touch' )
                    // InternalArg.g:1258:4: 'touch'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getGestureAccess().getTouchEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Gesture__Alternatives"


    // $ANTLR start "rule__Planes__Alternatives"
    // InternalArg.g:1266:1: rule__Planes__Alternatives : ( ( ( 'any' ) ) | ( ( 'horizontal' ) ) | ( ( 'vertical' ) ) );
    public final void rule__Planes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1270:1: ( ( ( 'any' ) ) | ( ( 'horizontal' ) ) | ( ( 'vertical' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
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
                    // InternalArg.g:1271:2: ( ( 'any' ) )
                    {
                    // InternalArg.g:1271:2: ( ( 'any' ) )
                    // InternalArg.g:1272:3: ( 'any' )
                    {
                     before(grammarAccess.getPlanesAccess().getAnyEnumLiteralDeclaration_0()); 
                    // InternalArg.g:1273:3: ( 'any' )
                    // InternalArg.g:1273:4: 'any'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPlanesAccess().getAnyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:1277:2: ( ( 'horizontal' ) )
                    {
                    // InternalArg.g:1277:2: ( ( 'horizontal' ) )
                    // InternalArg.g:1278:3: ( 'horizontal' )
                    {
                     before(grammarAccess.getPlanesAccess().getHorizontalEnumLiteralDeclaration_1()); 
                    // InternalArg.g:1279:3: ( 'horizontal' )
                    // InternalArg.g:1279:4: 'horizontal'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPlanesAccess().getHorizontalEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:1283:2: ( ( 'vertical' ) )
                    {
                    // InternalArg.g:1283:2: ( ( 'vertical' ) )
                    // InternalArg.g:1284:3: ( 'vertical' )
                    {
                     before(grammarAccess.getPlanesAccess().getVerticalEnumLiteralDeclaration_2()); 
                    // InternalArg.g:1285:3: ( 'vertical' )
                    // InternalArg.g:1285:4: 'vertical'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPlanesAccess().getVerticalEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Planes__Alternatives"


    // $ANTLR start "rule__BodyType__Alternatives"
    // InternalArg.g:1293:1: rule__BodyType__Alternatives : ( ( ( 'static' ) ) | ( ( 'dynamic' ) ) | ( ( 'kinematic' ) ) );
    public final void rule__BodyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1297:1: ( ( ( 'static' ) ) | ( ( 'dynamic' ) ) | ( ( 'kinematic' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalArg.g:1298:2: ( ( 'static' ) )
                    {
                    // InternalArg.g:1298:2: ( ( 'static' ) )
                    // InternalArg.g:1299:3: ( 'static' )
                    {
                     before(grammarAccess.getBodyTypeAccess().getStaticEnumLiteralDeclaration_0()); 
                    // InternalArg.g:1300:3: ( 'static' )
                    // InternalArg.g:1300:4: 'static'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBodyTypeAccess().getStaticEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:1304:2: ( ( 'dynamic' ) )
                    {
                    // InternalArg.g:1304:2: ( ( 'dynamic' ) )
                    // InternalArg.g:1305:3: ( 'dynamic' )
                    {
                     before(grammarAccess.getBodyTypeAccess().getDynamicEnumLiteralDeclaration_1()); 
                    // InternalArg.g:1306:3: ( 'dynamic' )
                    // InternalArg.g:1306:4: 'dynamic'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBodyTypeAccess().getDynamicEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:1310:2: ( ( 'kinematic' ) )
                    {
                    // InternalArg.g:1310:2: ( ( 'kinematic' ) )
                    // InternalArg.g:1311:3: ( 'kinematic' )
                    {
                     before(grammarAccess.getBodyTypeAccess().getKinematicEnumLiteralDeclaration_2()); 
                    // InternalArg.g:1312:3: ( 'kinematic' )
                    // InternalArg.g:1312:4: 'kinematic'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBodyTypeAccess().getKinematicEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__BodyType__Alternatives"


    // $ANTLR start "rule__BasicActions__Alternatives"
    // InternalArg.g:1320:1: rule__BasicActions__Alternatives : ( ( ( 'start' ) ) | ( ( 'win' ) ) | ( ( 'lose' ) ) | ( ( 'none' ) ) | ( ( 'restart' ) ) );
    public final void rule__BasicActions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1324:1: ( ( ( 'start' ) ) | ( ( 'win' ) ) | ( ( 'lose' ) ) | ( ( 'none' ) ) | ( ( 'restart' ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
                }
                break;
            case 28:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalArg.g:1325:2: ( ( 'start' ) )
                    {
                    // InternalArg.g:1325:2: ( ( 'start' ) )
                    // InternalArg.g:1326:3: ( 'start' )
                    {
                     before(grammarAccess.getBasicActionsAccess().getStartEnumLiteralDeclaration_0()); 
                    // InternalArg.g:1327:3: ( 'start' )
                    // InternalArg.g:1327:4: 'start'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicActionsAccess().getStartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:1331:2: ( ( 'win' ) )
                    {
                    // InternalArg.g:1331:2: ( ( 'win' ) )
                    // InternalArg.g:1332:3: ( 'win' )
                    {
                     before(grammarAccess.getBasicActionsAccess().getWinEnumLiteralDeclaration_1()); 
                    // InternalArg.g:1333:3: ( 'win' )
                    // InternalArg.g:1333:4: 'win'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicActionsAccess().getWinEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:1337:2: ( ( 'lose' ) )
                    {
                    // InternalArg.g:1337:2: ( ( 'lose' ) )
                    // InternalArg.g:1338:3: ( 'lose' )
                    {
                     before(grammarAccess.getBasicActionsAccess().getLoseEnumLiteralDeclaration_2()); 
                    // InternalArg.g:1339:3: ( 'lose' )
                    // InternalArg.g:1339:4: 'lose'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicActionsAccess().getLoseEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalArg.g:1343:2: ( ( 'none' ) )
                    {
                    // InternalArg.g:1343:2: ( ( 'none' ) )
                    // InternalArg.g:1344:3: ( 'none' )
                    {
                     before(grammarAccess.getBasicActionsAccess().getNoneEnumLiteralDeclaration_3()); 
                    // InternalArg.g:1345:3: ( 'none' )
                    // InternalArg.g:1345:4: 'none'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicActionsAccess().getNoneEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalArg.g:1349:2: ( ( 'restart' ) )
                    {
                    // InternalArg.g:1349:2: ( ( 'restart' ) )
                    // InternalArg.g:1350:3: ( 'restart' )
                    {
                     before(grammarAccess.getBasicActionsAccess().getRestartEnumLiteralDeclaration_4()); 
                    // InternalArg.g:1351:3: ( 'restart' )
                    // InternalArg.g:1351:4: 'restart'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicActionsAccess().getRestartEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__BasicActions__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalArg.g:1359:1: rule__Action__Alternatives : ( ( ( 'create' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1363:1: ( ( ( 'create' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
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
                    // InternalArg.g:1364:2: ( ( 'create' ) )
                    {
                    // InternalArg.g:1364:2: ( ( 'create' ) )
                    // InternalArg.g:1365:3: ( 'create' )
                    {
                     before(grammarAccess.getActionAccess().getCreateEnumLiteralDeclaration_0()); 
                    // InternalArg.g:1366:3: ( 'create' )
                    // InternalArg.g:1366:4: 'create'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getCreateEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:1370:2: ( ( 'edit' ) )
                    {
                    // InternalArg.g:1370:2: ( ( 'edit' ) )
                    // InternalArg.g:1371:3: ( 'edit' )
                    {
                     before(grammarAccess.getActionAccess().getEditEnumLiteralDeclaration_1()); 
                    // InternalArg.g:1372:3: ( 'edit' )
                    // InternalArg.g:1372:4: 'edit'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getEditEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:1376:2: ( ( 'delete' ) )
                    {
                    // InternalArg.g:1376:2: ( ( 'delete' ) )
                    // InternalArg.g:1377:3: ( 'delete' )
                    {
                     before(grammarAccess.getActionAccess().getDeleteEnumLiteralDeclaration_2()); 
                    // InternalArg.g:1378:3: ( 'delete' )
                    // InternalArg.g:1378:4: 'delete'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getDeleteEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Position__Alternatives"
    // InternalArg.g:1386:1: rule__Position__Alternatives : ( ( ( 'front' ) ) | ( ( 'default' ) ) | ( ( 'back' ) ) );
    public final void rule__Position__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1390:1: ( ( ( 'front' ) ) | ( ( 'default' ) ) | ( ( 'back' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt13=1;
                }
                break;
            case 33:
                {
                alt13=2;
                }
                break;
            case 34:
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
                    // InternalArg.g:1391:2: ( ( 'front' ) )
                    {
                    // InternalArg.g:1391:2: ( ( 'front' ) )
                    // InternalArg.g:1392:3: ( 'front' )
                    {
                     before(grammarAccess.getPositionAccess().getFrontEnumLiteralDeclaration_0()); 
                    // InternalArg.g:1393:3: ( 'front' )
                    // InternalArg.g:1393:4: 'front'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionAccess().getFrontEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:1397:2: ( ( 'default' ) )
                    {
                    // InternalArg.g:1397:2: ( ( 'default' ) )
                    // InternalArg.g:1398:3: ( 'default' )
                    {
                     before(grammarAccess.getPositionAccess().getDefaultEnumLiteralDeclaration_1()); 
                    // InternalArg.g:1399:3: ( 'default' )
                    // InternalArg.g:1399:4: 'default'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionAccess().getDefaultEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:1403:2: ( ( 'back' ) )
                    {
                    // InternalArg.g:1403:2: ( ( 'back' ) )
                    // InternalArg.g:1404:3: ( 'back' )
                    {
                     before(grammarAccess.getPositionAccess().getBackEnumLiteralDeclaration_2()); 
                    // InternalArg.g:1405:3: ( 'back' )
                    // InternalArg.g:1405:4: 'back'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionAccess().getBackEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Position__Alternatives"


    // $ANTLR start "rule__LogicOps__Alternatives"
    // InternalArg.g:1413:1: rule__LogicOps__Alternatives : ( ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__LogicOps__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1417:1: ( ( ( '&' ) ) | ( ( '|' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            else if ( (LA14_0==36) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalArg.g:1418:2: ( ( '&' ) )
                    {
                    // InternalArg.g:1418:2: ( ( '&' ) )
                    // InternalArg.g:1419:3: ( '&' )
                    {
                     before(grammarAccess.getLogicOpsAccess().getAndEnumLiteralDeclaration_0()); 
                    // InternalArg.g:1420:3: ( '&' )
                    // InternalArg.g:1420:4: '&'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicOpsAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:1424:2: ( ( '|' ) )
                    {
                    // InternalArg.g:1424:2: ( ( '|' ) )
                    // InternalArg.g:1425:3: ( '|' )
                    {
                     before(grammarAccess.getLogicOpsAccess().getOrEnumLiteralDeclaration_1()); 
                    // InternalArg.g:1426:3: ( '|' )
                    // InternalArg.g:1426:4: '|'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicOpsAccess().getOrEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__LogicOps__Alternatives"


    // $ANTLR start "rule__ArithmOps__Alternatives"
    // InternalArg.g:1434:1: rule__ArithmOps__Alternatives : ( ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) );
    public final void rule__ArithmOps__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1438:1: ( ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt15=1;
                }
                break;
            case 38:
                {
                alt15=2;
                }
                break;
            case 39:
                {
                alt15=3;
                }
                break;
            case 40:
                {
                alt15=4;
                }
                break;
            case 41:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalArg.g:1439:2: ( ( '=' ) )
                    {
                    // InternalArg.g:1439:2: ( ( '=' ) )
                    // InternalArg.g:1440:3: ( '=' )
                    {
                     before(grammarAccess.getArithmOpsAccess().getEqualEnumLiteralDeclaration_0()); 
                    // InternalArg.g:1441:3: ( '=' )
                    // InternalArg.g:1441:4: '='
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getArithmOpsAccess().getEqualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArg.g:1445:2: ( ( '>' ) )
                    {
                    // InternalArg.g:1445:2: ( ( '>' ) )
                    // InternalArg.g:1446:3: ( '>' )
                    {
                     before(grammarAccess.getArithmOpsAccess().getGreaterEnumLiteralDeclaration_1()); 
                    // InternalArg.g:1447:3: ( '>' )
                    // InternalArg.g:1447:4: '>'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getArithmOpsAccess().getGreaterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArg.g:1451:2: ( ( '>=' ) )
                    {
                    // InternalArg.g:1451:2: ( ( '>=' ) )
                    // InternalArg.g:1452:3: ( '>=' )
                    {
                     before(grammarAccess.getArithmOpsAccess().getGreaterEqualEnumLiteralDeclaration_2()); 
                    // InternalArg.g:1453:3: ( '>=' )
                    // InternalArg.g:1453:4: '>='
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getArithmOpsAccess().getGreaterEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalArg.g:1457:2: ( ( '<' ) )
                    {
                    // InternalArg.g:1457:2: ( ( '<' ) )
                    // InternalArg.g:1458:3: ( '<' )
                    {
                     before(grammarAccess.getArithmOpsAccess().getLowerEnumLiteralDeclaration_3()); 
                    // InternalArg.g:1459:3: ( '<' )
                    // InternalArg.g:1459:4: '<'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getArithmOpsAccess().getLowerEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalArg.g:1463:2: ( ( '<=' ) )
                    {
                    // InternalArg.g:1463:2: ( ( '<=' ) )
                    // InternalArg.g:1464:3: ( '<=' )
                    {
                     before(grammarAccess.getArithmOpsAccess().getLowerEqualEnumLiteralDeclaration_4()); 
                    // InternalArg.g:1465:3: ( '<=' )
                    // InternalArg.g:1465:4: '<='
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getArithmOpsAccess().getLowerEqualEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__ArithmOps__Alternatives"


    // $ANTLR start "rule__Ontological__Group__0"
    // InternalArg.g:1473:1: rule__Ontological__Group__0 : rule__Ontological__Group__0__Impl rule__Ontological__Group__1 ;
    public final void rule__Ontological__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1477:1: ( rule__Ontological__Group__0__Impl rule__Ontological__Group__1 )
            // InternalArg.g:1478:2: rule__Ontological__Group__0__Impl rule__Ontological__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Ontological__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ontological__Group__1();

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
    // $ANTLR end "rule__Ontological__Group__0"


    // $ANTLR start "rule__Ontological__Group__0__Impl"
    // InternalArg.g:1485:1: rule__Ontological__Group__0__Impl : ( 'Game' ) ;
    public final void rule__Ontological__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1489:1: ( ( 'Game' ) )
            // InternalArg.g:1490:1: ( 'Game' )
            {
            // InternalArg.g:1490:1: ( 'Game' )
            // InternalArg.g:1491:2: 'Game'
            {
             before(grammarAccess.getOntologicalAccess().getGameKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getOntologicalAccess().getGameKeyword_0()); 

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
    // $ANTLR end "rule__Ontological__Group__0__Impl"


    // $ANTLR start "rule__Ontological__Group__1"
    // InternalArg.g:1500:1: rule__Ontological__Group__1 : rule__Ontological__Group__1__Impl rule__Ontological__Group__2 ;
    public final void rule__Ontological__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1504:1: ( rule__Ontological__Group__1__Impl rule__Ontological__Group__2 )
            // InternalArg.g:1505:2: rule__Ontological__Group__1__Impl rule__Ontological__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Ontological__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ontological__Group__2();

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
    // $ANTLR end "rule__Ontological__Group__1"


    // $ANTLR start "rule__Ontological__Group__1__Impl"
    // InternalArg.g:1512:1: rule__Ontological__Group__1__Impl : ( ( rule__Ontological__NameAssignment_1 ) ) ;
    public final void rule__Ontological__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1516:1: ( ( ( rule__Ontological__NameAssignment_1 ) ) )
            // InternalArg.g:1517:1: ( ( rule__Ontological__NameAssignment_1 ) )
            {
            // InternalArg.g:1517:1: ( ( rule__Ontological__NameAssignment_1 ) )
            // InternalArg.g:1518:2: ( rule__Ontological__NameAssignment_1 )
            {
             before(grammarAccess.getOntologicalAccess().getNameAssignment_1()); 
            // InternalArg.g:1519:2: ( rule__Ontological__NameAssignment_1 )
            // InternalArg.g:1519:3: rule__Ontological__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ontological__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Ontological__Group__1__Impl"


    // $ANTLR start "rule__Ontological__Group__2"
    // InternalArg.g:1527:1: rule__Ontological__Group__2 : rule__Ontological__Group__2__Impl rule__Ontological__Group__3 ;
    public final void rule__Ontological__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1531:1: ( rule__Ontological__Group__2__Impl rule__Ontological__Group__3 )
            // InternalArg.g:1532:2: rule__Ontological__Group__2__Impl rule__Ontological__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Ontological__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ontological__Group__3();

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
    // $ANTLR end "rule__Ontological__Group__2"


    // $ANTLR start "rule__Ontological__Group__2__Impl"
    // InternalArg.g:1539:1: rule__Ontological__Group__2__Impl : ( '{' ) ;
    public final void rule__Ontological__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1543:1: ( ( '{' ) )
            // InternalArg.g:1544:1: ( '{' )
            {
            // InternalArg.g:1544:1: ( '{' )
            // InternalArg.g:1545:2: '{'
            {
             before(grammarAccess.getOntologicalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOntologicalAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Ontological__Group__2__Impl"


    // $ANTLR start "rule__Ontological__Group__3"
    // InternalArg.g:1554:1: rule__Ontological__Group__3 : rule__Ontological__Group__3__Impl rule__Ontological__Group__4 ;
    public final void rule__Ontological__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1558:1: ( rule__Ontological__Group__3__Impl rule__Ontological__Group__4 )
            // InternalArg.g:1559:2: rule__Ontological__Group__3__Impl rule__Ontological__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Ontological__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ontological__Group__4();

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
    // $ANTLR end "rule__Ontological__Group__3"


    // $ANTLR start "rule__Ontological__Group__3__Impl"
    // InternalArg.g:1566:1: rule__Ontological__Group__3__Impl : ( 'elements' ) ;
    public final void rule__Ontological__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1570:1: ( ( 'elements' ) )
            // InternalArg.g:1571:1: ( 'elements' )
            {
            // InternalArg.g:1571:1: ( 'elements' )
            // InternalArg.g:1572:2: 'elements'
            {
             before(grammarAccess.getOntologicalAccess().getElementsKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getOntologicalAccess().getElementsKeyword_3()); 

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
    // $ANTLR end "rule__Ontological__Group__3__Impl"


    // $ANTLR start "rule__Ontological__Group__4"
    // InternalArg.g:1581:1: rule__Ontological__Group__4 : rule__Ontological__Group__4__Impl rule__Ontological__Group__5 ;
    public final void rule__Ontological__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1585:1: ( rule__Ontological__Group__4__Impl rule__Ontological__Group__5 )
            // InternalArg.g:1586:2: rule__Ontological__Group__4__Impl rule__Ontological__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Ontological__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ontological__Group__5();

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
    // $ANTLR end "rule__Ontological__Group__4"


    // $ANTLR start "rule__Ontological__Group__4__Impl"
    // InternalArg.g:1593:1: rule__Ontological__Group__4__Impl : ( '{' ) ;
    public final void rule__Ontological__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1597:1: ( ( '{' ) )
            // InternalArg.g:1598:1: ( '{' )
            {
            // InternalArg.g:1598:1: ( '{' )
            // InternalArg.g:1599:2: '{'
            {
             before(grammarAccess.getOntologicalAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOntologicalAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Ontological__Group__4__Impl"


    // $ANTLR start "rule__Ontological__Group__5"
    // InternalArg.g:1608:1: rule__Ontological__Group__5 : rule__Ontological__Group__5__Impl rule__Ontological__Group__6 ;
    public final void rule__Ontological__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1612:1: ( rule__Ontological__Group__5__Impl rule__Ontological__Group__6 )
            // InternalArg.g:1613:2: rule__Ontological__Group__5__Impl rule__Ontological__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Ontological__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ontological__Group__6();

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
    // $ANTLR end "rule__Ontological__Group__5"


    // $ANTLR start "rule__Ontological__Group__5__Impl"
    // InternalArg.g:1620:1: rule__Ontological__Group__5__Impl : ( ( rule__Ontological__ClassesAssignment_5 ) ) ;
    public final void rule__Ontological__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1624:1: ( ( ( rule__Ontological__ClassesAssignment_5 ) ) )
            // InternalArg.g:1625:1: ( ( rule__Ontological__ClassesAssignment_5 ) )
            {
            // InternalArg.g:1625:1: ( ( rule__Ontological__ClassesAssignment_5 ) )
            // InternalArg.g:1626:2: ( rule__Ontological__ClassesAssignment_5 )
            {
             before(grammarAccess.getOntologicalAccess().getClassesAssignment_5()); 
            // InternalArg.g:1627:2: ( rule__Ontological__ClassesAssignment_5 )
            // InternalArg.g:1627:3: rule__Ontological__ClassesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Ontological__ClassesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalAccess().getClassesAssignment_5()); 

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
    // $ANTLR end "rule__Ontological__Group__5__Impl"


    // $ANTLR start "rule__Ontological__Group__6"
    // InternalArg.g:1635:1: rule__Ontological__Group__6 : rule__Ontological__Group__6__Impl rule__Ontological__Group__7 ;
    public final void rule__Ontological__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1639:1: ( rule__Ontological__Group__6__Impl rule__Ontological__Group__7 )
            // InternalArg.g:1640:2: rule__Ontological__Group__6__Impl rule__Ontological__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Ontological__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ontological__Group__7();

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
    // $ANTLR end "rule__Ontological__Group__6"


    // $ANTLR start "rule__Ontological__Group__6__Impl"
    // InternalArg.g:1647:1: rule__Ontological__Group__6__Impl : ( ( rule__Ontological__ClassesAssignment_6 )* ) ;
    public final void rule__Ontological__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1651:1: ( ( ( rule__Ontological__ClassesAssignment_6 )* ) )
            // InternalArg.g:1652:1: ( ( rule__Ontological__ClassesAssignment_6 )* )
            {
            // InternalArg.g:1652:1: ( ( rule__Ontological__ClassesAssignment_6 )* )
            // InternalArg.g:1653:2: ( rule__Ontological__ClassesAssignment_6 )*
            {
             before(grammarAccess.getOntologicalAccess().getClassesAssignment_6()); 
            // InternalArg.g:1654:2: ( rule__Ontological__ClassesAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalArg.g:1654:3: rule__Ontological__ClassesAssignment_6
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Ontological__ClassesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getOntologicalAccess().getClassesAssignment_6()); 

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
    // $ANTLR end "rule__Ontological__Group__6__Impl"


    // $ANTLR start "rule__Ontological__Group__7"
    // InternalArg.g:1662:1: rule__Ontological__Group__7 : rule__Ontological__Group__7__Impl rule__Ontological__Group__8 ;
    public final void rule__Ontological__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1666:1: ( rule__Ontological__Group__7__Impl rule__Ontological__Group__8 )
            // InternalArg.g:1667:2: rule__Ontological__Group__7__Impl rule__Ontological__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Ontological__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ontological__Group__8();

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
    // $ANTLR end "rule__Ontological__Group__7"


    // $ANTLR start "rule__Ontological__Group__7__Impl"
    // InternalArg.g:1674:1: rule__Ontological__Group__7__Impl : ( '}' ) ;
    public final void rule__Ontological__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1678:1: ( ( '}' ) )
            // InternalArg.g:1679:1: ( '}' )
            {
            // InternalArg.g:1679:1: ( '}' )
            // InternalArg.g:1680:2: '}'
            {
             before(grammarAccess.getOntologicalAccess().getRightCurlyBracketKeyword_7()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getOntologicalAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Ontological__Group__7__Impl"


    // $ANTLR start "rule__Ontological__Group__8"
    // InternalArg.g:1689:1: rule__Ontological__Group__8 : rule__Ontological__Group__8__Impl rule__Ontological__Group__9 ;
    public final void rule__Ontological__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1693:1: ( rule__Ontological__Group__8__Impl rule__Ontological__Group__9 )
            // InternalArg.g:1694:2: rule__Ontological__Group__8__Impl rule__Ontological__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Ontological__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ontological__Group__9();

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
    // $ANTLR end "rule__Ontological__Group__8"


    // $ANTLR start "rule__Ontological__Group__8__Impl"
    // InternalArg.g:1701:1: rule__Ontological__Group__8__Impl : ( '}' ) ;
    public final void rule__Ontological__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1705:1: ( ( '}' ) )
            // InternalArg.g:1706:1: ( '}' )
            {
            // InternalArg.g:1706:1: ( '}' )
            // InternalArg.g:1707:2: '}'
            {
             before(grammarAccess.getOntologicalAccess().getRightCurlyBracketKeyword_8()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getOntologicalAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Ontological__Group__8__Impl"


    // $ANTLR start "rule__Ontological__Group__9"
    // InternalArg.g:1716:1: rule__Ontological__Group__9 : rule__Ontological__Group__9__Impl rule__Ontological__Group__10 ;
    public final void rule__Ontological__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1720:1: ( rule__Ontological__Group__9__Impl rule__Ontological__Group__10 )
            // InternalArg.g:1721:2: rule__Ontological__Group__9__Impl rule__Ontological__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Ontological__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ontological__Group__10();

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
    // $ANTLR end "rule__Ontological__Group__9"


    // $ANTLR start "rule__Ontological__Group__9__Impl"
    // InternalArg.g:1728:1: rule__Ontological__Group__9__Impl : ( ( rule__Ontological__GraphicAssignment_9 ) ) ;
    public final void rule__Ontological__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1732:1: ( ( ( rule__Ontological__GraphicAssignment_9 ) ) )
            // InternalArg.g:1733:1: ( ( rule__Ontological__GraphicAssignment_9 ) )
            {
            // InternalArg.g:1733:1: ( ( rule__Ontological__GraphicAssignment_9 ) )
            // InternalArg.g:1734:2: ( rule__Ontological__GraphicAssignment_9 )
            {
             before(grammarAccess.getOntologicalAccess().getGraphicAssignment_9()); 
            // InternalArg.g:1735:2: ( rule__Ontological__GraphicAssignment_9 )
            // InternalArg.g:1735:3: rule__Ontological__GraphicAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Ontological__GraphicAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalAccess().getGraphicAssignment_9()); 

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
    // $ANTLR end "rule__Ontological__Group__9__Impl"


    // $ANTLR start "rule__Ontological__Group__10"
    // InternalArg.g:1743:1: rule__Ontological__Group__10 : rule__Ontological__Group__10__Impl rule__Ontological__Group__11 ;
    public final void rule__Ontological__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1747:1: ( rule__Ontological__Group__10__Impl rule__Ontological__Group__11 )
            // InternalArg.g:1748:2: rule__Ontological__Group__10__Impl rule__Ontological__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Ontological__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ontological__Group__11();

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
    // $ANTLR end "rule__Ontological__Group__10"


    // $ANTLR start "rule__Ontological__Group__10__Impl"
    // InternalArg.g:1755:1: rule__Ontological__Group__10__Impl : ( ( rule__Ontological__PhysicAssignment_10 ) ) ;
    public final void rule__Ontological__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1759:1: ( ( ( rule__Ontological__PhysicAssignment_10 ) ) )
            // InternalArg.g:1760:1: ( ( rule__Ontological__PhysicAssignment_10 ) )
            {
            // InternalArg.g:1760:1: ( ( rule__Ontological__PhysicAssignment_10 ) )
            // InternalArg.g:1761:2: ( rule__Ontological__PhysicAssignment_10 )
            {
             before(grammarAccess.getOntologicalAccess().getPhysicAssignment_10()); 
            // InternalArg.g:1762:2: ( rule__Ontological__PhysicAssignment_10 )
            // InternalArg.g:1762:3: rule__Ontological__PhysicAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Ontological__PhysicAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalAccess().getPhysicAssignment_10()); 

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
    // $ANTLR end "rule__Ontological__Group__10__Impl"


    // $ANTLR start "rule__Ontological__Group__11"
    // InternalArg.g:1770:1: rule__Ontological__Group__11 : rule__Ontological__Group__11__Impl ;
    public final void rule__Ontological__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1774:1: ( rule__Ontological__Group__11__Impl )
            // InternalArg.g:1775:2: rule__Ontological__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ontological__Group__11__Impl();

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
    // $ANTLR end "rule__Ontological__Group__11"


    // $ANTLR start "rule__Ontological__Group__11__Impl"
    // InternalArg.g:1781:1: rule__Ontological__Group__11__Impl : ( ( rule__Ontological__GameAssignment_11 ) ) ;
    public final void rule__Ontological__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1785:1: ( ( ( rule__Ontological__GameAssignment_11 ) ) )
            // InternalArg.g:1786:1: ( ( rule__Ontological__GameAssignment_11 ) )
            {
            // InternalArg.g:1786:1: ( ( rule__Ontological__GameAssignment_11 ) )
            // InternalArg.g:1787:2: ( rule__Ontological__GameAssignment_11 )
            {
             before(grammarAccess.getOntologicalAccess().getGameAssignment_11()); 
            // InternalArg.g:1788:2: ( rule__Ontological__GameAssignment_11 )
            // InternalArg.g:1788:3: rule__Ontological__GameAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Ontological__GameAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalAccess().getGameAssignment_11()); 

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
    // $ANTLR end "rule__Ontological__Group__11__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalArg.g:1797:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1801:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalArg.g:1802:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

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
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalArg.g:1809:1: rule__Class__Group__0__Impl : ( ( rule__Class__NameAssignment_0 ) ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1813:1: ( ( ( rule__Class__NameAssignment_0 ) ) )
            // InternalArg.g:1814:1: ( ( rule__Class__NameAssignment_0 ) )
            {
            // InternalArg.g:1814:1: ( ( rule__Class__NameAssignment_0 ) )
            // InternalArg.g:1815:2: ( rule__Class__NameAssignment_0 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_0()); 
            // InternalArg.g:1816:2: ( rule__Class__NameAssignment_0 )
            // InternalArg.g:1816:3: rule__Class__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalArg.g:1824:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1828:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalArg.g:1829:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

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
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalArg.g:1836:1: rule__Class__Group__1__Impl : ( '{' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1840:1: ( ( '{' ) )
            // InternalArg.g:1841:1: ( '{' )
            {
            // InternalArg.g:1841:1: ( '{' )
            // InternalArg.g:1842:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalArg.g:1851:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1855:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalArg.g:1856:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

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
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalArg.g:1863:1: rule__Class__Group__2__Impl : ( ( rule__Class__Group_2__0 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1867:1: ( ( ( rule__Class__Group_2__0 )? ) )
            // InternalArg.g:1868:1: ( ( rule__Class__Group_2__0 )? )
            {
            // InternalArg.g:1868:1: ( ( rule__Class__Group_2__0 )? )
            // InternalArg.g:1869:2: ( rule__Class__Group_2__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_2()); 
            // InternalArg.g:1870:2: ( rule__Class__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalArg.g:1870:3: rule__Class__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalArg.g:1878:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1882:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalArg.g:1883:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

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
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalArg.g:1890:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1894:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalArg.g:1895:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalArg.g:1895:1: ( ( rule__Class__Group_3__0 )? )
            // InternalArg.g:1896:2: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalArg.g:1897:2: ( rule__Class__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==46) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalArg.g:1897:3: rule__Class__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalArg.g:1905:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1909:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalArg.g:1910:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

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
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalArg.g:1917:1: rule__Class__Group__4__Impl : ( '}' ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1921:1: ( ( '}' ) )
            // InternalArg.g:1922:1: ( '}' )
            {
            // InternalArg.g:1922:1: ( '}' )
            // InternalArg.g:1923:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalArg.g:1932:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1936:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalArg.g:1937:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

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
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalArg.g:1944:1: rule__Class__Group__5__Impl : ( ( rule__Class__AbstractAssignment_5 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1948:1: ( ( ( rule__Class__AbstractAssignment_5 )? ) )
            // InternalArg.g:1949:1: ( ( rule__Class__AbstractAssignment_5 )? )
            {
            // InternalArg.g:1949:1: ( ( rule__Class__AbstractAssignment_5 )? )
            // InternalArg.g:1950:2: ( rule__Class__AbstractAssignment_5 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_5()); 
            // InternalArg.g:1951:2: ( rule__Class__AbstractAssignment_5 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==116) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalArg.g:1951:3: rule__Class__AbstractAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__AbstractAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getAbstractAssignment_5()); 

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
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // InternalArg.g:1959:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1963:1: ( rule__Class__Group__6__Impl )
            // InternalArg.g:1964:2: rule__Class__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__6__Impl();

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
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalArg.g:1970:1: rule__Class__Group__6__Impl : ( ( rule__Class__NoSCNAssignment_6 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1974:1: ( ( ( rule__Class__NoSCNAssignment_6 )? ) )
            // InternalArg.g:1975:1: ( ( rule__Class__NoSCNAssignment_6 )? )
            {
            // InternalArg.g:1975:1: ( ( rule__Class__NoSCNAssignment_6 )? )
            // InternalArg.g:1976:2: ( rule__Class__NoSCNAssignment_6 )?
            {
             before(grammarAccess.getClassAccess().getNoSCNAssignment_6()); 
            // InternalArg.g:1977:2: ( rule__Class__NoSCNAssignment_6 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==117) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalArg.g:1977:3: rule__Class__NoSCNAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__NoSCNAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getNoSCNAssignment_6()); 

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
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group_2__0"
    // InternalArg.g:1986:1: rule__Class__Group_2__0 : rule__Class__Group_2__0__Impl rule__Class__Group_2__1 ;
    public final void rule__Class__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:1990:1: ( rule__Class__Group_2__0__Impl rule__Class__Group_2__1 )
            // InternalArg.g:1991:2: rule__Class__Group_2__0__Impl rule__Class__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_2__1();

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
    // $ANTLR end "rule__Class__Group_2__0"


    // $ANTLR start "rule__Class__Group_2__0__Impl"
    // InternalArg.g:1998:1: rule__Class__Group_2__0__Impl : ( ( rule__Class__AttributesAssignment_2_0 ) ) ;
    public final void rule__Class__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2002:1: ( ( ( rule__Class__AttributesAssignment_2_0 ) ) )
            // InternalArg.g:2003:1: ( ( rule__Class__AttributesAssignment_2_0 ) )
            {
            // InternalArg.g:2003:1: ( ( rule__Class__AttributesAssignment_2_0 ) )
            // InternalArg.g:2004:2: ( rule__Class__AttributesAssignment_2_0 )
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_2_0()); 
            // InternalArg.g:2005:2: ( rule__Class__AttributesAssignment_2_0 )
            // InternalArg.g:2005:3: rule__Class__AttributesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Class__AttributesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAttributesAssignment_2_0()); 

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
    // $ANTLR end "rule__Class__Group_2__0__Impl"


    // $ANTLR start "rule__Class__Group_2__1"
    // InternalArg.g:2013:1: rule__Class__Group_2__1 : rule__Class__Group_2__1__Impl ;
    public final void rule__Class__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2017:1: ( rule__Class__Group_2__1__Impl )
            // InternalArg.g:2018:2: rule__Class__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_2__1__Impl();

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
    // $ANTLR end "rule__Class__Group_2__1"


    // $ANTLR start "rule__Class__Group_2__1__Impl"
    // InternalArg.g:2024:1: rule__Class__Group_2__1__Impl : ( ( rule__Class__AttributesAssignment_2_1 )* ) ;
    public final void rule__Class__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2028:1: ( ( ( rule__Class__AttributesAssignment_2_1 )* ) )
            // InternalArg.g:2029:1: ( ( rule__Class__AttributesAssignment_2_1 )* )
            {
            // InternalArg.g:2029:1: ( ( rule__Class__AttributesAssignment_2_1 )* )
            // InternalArg.g:2030:2: ( rule__Class__AttributesAssignment_2_1 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_2_1()); 
            // InternalArg.g:2031:2: ( rule__Class__AttributesAssignment_2_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalArg.g:2031:3: rule__Class__AttributesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Class__AttributesAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getAttributesAssignment_2_1()); 

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
    // $ANTLR end "rule__Class__Group_2__1__Impl"


    // $ANTLR start "rule__Class__Group_3__0"
    // InternalArg.g:2040:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2044:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalArg.g:2045:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__1();

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
    // $ANTLR end "rule__Class__Group_3__0"


    // $ANTLR start "rule__Class__Group_3__0__Impl"
    // InternalArg.g:2052:1: rule__Class__Group_3__0__Impl : ( 'dependences' ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2056:1: ( ( 'dependences' ) )
            // InternalArg.g:2057:1: ( 'dependences' )
            {
            // InternalArg.g:2057:1: ( 'dependences' )
            // InternalArg.g:2058:2: 'dependences'
            {
             before(grammarAccess.getClassAccess().getDependencesKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getDependencesKeyword_3_0()); 

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
    // $ANTLR end "rule__Class__Group_3__0__Impl"


    // $ANTLR start "rule__Class__Group_3__1"
    // InternalArg.g:2067:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl rule__Class__Group_3__2 ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2071:1: ( rule__Class__Group_3__1__Impl rule__Class__Group_3__2 )
            // InternalArg.g:2072:2: rule__Class__Group_3__1__Impl rule__Class__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__2();

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
    // $ANTLR end "rule__Class__Group_3__1"


    // $ANTLR start "rule__Class__Group_3__1__Impl"
    // InternalArg.g:2079:1: rule__Class__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2083:1: ( ( '{' ) )
            // InternalArg.g:2084:1: ( '{' )
            {
            // InternalArg.g:2084:1: ( '{' )
            // InternalArg.g:2085:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__Class__Group_3__1__Impl"


    // $ANTLR start "rule__Class__Group_3__2"
    // InternalArg.g:2094:1: rule__Class__Group_3__2 : rule__Class__Group_3__2__Impl rule__Class__Group_3__3 ;
    public final void rule__Class__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2098:1: ( rule__Class__Group_3__2__Impl rule__Class__Group_3__3 )
            // InternalArg.g:2099:2: rule__Class__Group_3__2__Impl rule__Class__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__3();

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
    // $ANTLR end "rule__Class__Group_3__2"


    // $ANTLR start "rule__Class__Group_3__2__Impl"
    // InternalArg.g:2106:1: rule__Class__Group_3__2__Impl : ( ( rule__Class__ReferencesAssignment_3_2 ) ) ;
    public final void rule__Class__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2110:1: ( ( ( rule__Class__ReferencesAssignment_3_2 ) ) )
            // InternalArg.g:2111:1: ( ( rule__Class__ReferencesAssignment_3_2 ) )
            {
            // InternalArg.g:2111:1: ( ( rule__Class__ReferencesAssignment_3_2 ) )
            // InternalArg.g:2112:2: ( rule__Class__ReferencesAssignment_3_2 )
            {
             before(grammarAccess.getClassAccess().getReferencesAssignment_3_2()); 
            // InternalArg.g:2113:2: ( rule__Class__ReferencesAssignment_3_2 )
            // InternalArg.g:2113:3: rule__Class__ReferencesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__ReferencesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getReferencesAssignment_3_2()); 

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
    // $ANTLR end "rule__Class__Group_3__2__Impl"


    // $ANTLR start "rule__Class__Group_3__3"
    // InternalArg.g:2121:1: rule__Class__Group_3__3 : rule__Class__Group_3__3__Impl rule__Class__Group_3__4 ;
    public final void rule__Class__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2125:1: ( rule__Class__Group_3__3__Impl rule__Class__Group_3__4 )
            // InternalArg.g:2126:2: rule__Class__Group_3__3__Impl rule__Class__Group_3__4
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__4();

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
    // $ANTLR end "rule__Class__Group_3__3"


    // $ANTLR start "rule__Class__Group_3__3__Impl"
    // InternalArg.g:2133:1: rule__Class__Group_3__3__Impl : ( ( rule__Class__ReferencesAssignment_3_3 )* ) ;
    public final void rule__Class__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2137:1: ( ( ( rule__Class__ReferencesAssignment_3_3 )* ) )
            // InternalArg.g:2138:1: ( ( rule__Class__ReferencesAssignment_3_3 )* )
            {
            // InternalArg.g:2138:1: ( ( rule__Class__ReferencesAssignment_3_3 )* )
            // InternalArg.g:2139:2: ( rule__Class__ReferencesAssignment_3_3 )*
            {
             before(grammarAccess.getClassAccess().getReferencesAssignment_3_3()); 
            // InternalArg.g:2140:2: ( rule__Class__ReferencesAssignment_3_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalArg.g:2140:3: rule__Class__ReferencesAssignment_3_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Class__ReferencesAssignment_3_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getReferencesAssignment_3_3()); 

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
    // $ANTLR end "rule__Class__Group_3__3__Impl"


    // $ANTLR start "rule__Class__Group_3__4"
    // InternalArg.g:2148:1: rule__Class__Group_3__4 : rule__Class__Group_3__4__Impl ;
    public final void rule__Class__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2152:1: ( rule__Class__Group_3__4__Impl )
            // InternalArg.g:2153:2: rule__Class__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__4__Impl();

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
    // $ANTLR end "rule__Class__Group_3__4"


    // $ANTLR start "rule__Class__Group_3__4__Impl"
    // InternalArg.g:2159:1: rule__Class__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2163:1: ( ( '}' ) )
            // InternalArg.g:2164:1: ( '}' )
            {
            // InternalArg.g:2164:1: ( '}' )
            // InternalArg.g:2165:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Class__Group_3__4__Impl"


    // $ANTLR start "rule__Graphic__Group__0"
    // InternalArg.g:2175:1: rule__Graphic__Group__0 : rule__Graphic__Group__0__Impl rule__Graphic__Group__1 ;
    public final void rule__Graphic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2179:1: ( rule__Graphic__Group__0__Impl rule__Graphic__Group__1 )
            // InternalArg.g:2180:2: rule__Graphic__Group__0__Impl rule__Graphic__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Graphic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphic__Group__1();

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
    // $ANTLR end "rule__Graphic__Group__0"


    // $ANTLR start "rule__Graphic__Group__0__Impl"
    // InternalArg.g:2187:1: rule__Graphic__Group__0__Impl : ( 'Graphic' ) ;
    public final void rule__Graphic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2191:1: ( ( 'Graphic' ) )
            // InternalArg.g:2192:1: ( 'Graphic' )
            {
            // InternalArg.g:2192:1: ( 'Graphic' )
            // InternalArg.g:2193:2: 'Graphic'
            {
             before(grammarAccess.getGraphicAccess().getGraphicKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getGraphicAccess().getGraphicKeyword_0()); 

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
    // $ANTLR end "rule__Graphic__Group__0__Impl"


    // $ANTLR start "rule__Graphic__Group__1"
    // InternalArg.g:2202:1: rule__Graphic__Group__1 : rule__Graphic__Group__1__Impl rule__Graphic__Group__2 ;
    public final void rule__Graphic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2206:1: ( rule__Graphic__Group__1__Impl rule__Graphic__Group__2 )
            // InternalArg.g:2207:2: rule__Graphic__Group__1__Impl rule__Graphic__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Graphic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphic__Group__2();

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
    // $ANTLR end "rule__Graphic__Group__1"


    // $ANTLR start "rule__Graphic__Group__1__Impl"
    // InternalArg.g:2214:1: rule__Graphic__Group__1__Impl : ( '{' ) ;
    public final void rule__Graphic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2218:1: ( ( '{' ) )
            // InternalArg.g:2219:1: ( '{' )
            {
            // InternalArg.g:2219:1: ( '{' )
            // InternalArg.g:2220:2: '{'
            {
             before(grammarAccess.getGraphicAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGraphicAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Graphic__Group__1__Impl"


    // $ANTLR start "rule__Graphic__Group__2"
    // InternalArg.g:2229:1: rule__Graphic__Group__2 : rule__Graphic__Group__2__Impl rule__Graphic__Group__3 ;
    public final void rule__Graphic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2233:1: ( rule__Graphic__Group__2__Impl rule__Graphic__Group__3 )
            // InternalArg.g:2234:2: rule__Graphic__Group__2__Impl rule__Graphic__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Graphic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphic__Group__3();

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
    // $ANTLR end "rule__Graphic__Group__2"


    // $ANTLR start "rule__Graphic__Group__2__Impl"
    // InternalArg.g:2241:1: rule__Graphic__Group__2__Impl : ( ( rule__Graphic__ClassesAssignment_2 ) ) ;
    public final void rule__Graphic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2245:1: ( ( ( rule__Graphic__ClassesAssignment_2 ) ) )
            // InternalArg.g:2246:1: ( ( rule__Graphic__ClassesAssignment_2 ) )
            {
            // InternalArg.g:2246:1: ( ( rule__Graphic__ClassesAssignment_2 ) )
            // InternalArg.g:2247:2: ( rule__Graphic__ClassesAssignment_2 )
            {
             before(grammarAccess.getGraphicAccess().getClassesAssignment_2()); 
            // InternalArg.g:2248:2: ( rule__Graphic__ClassesAssignment_2 )
            // InternalArg.g:2248:3: rule__Graphic__ClassesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Graphic__ClassesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphicAccess().getClassesAssignment_2()); 

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
    // $ANTLR end "rule__Graphic__Group__2__Impl"


    // $ANTLR start "rule__Graphic__Group__3"
    // InternalArg.g:2256:1: rule__Graphic__Group__3 : rule__Graphic__Group__3__Impl rule__Graphic__Group__4 ;
    public final void rule__Graphic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2260:1: ( rule__Graphic__Group__3__Impl rule__Graphic__Group__4 )
            // InternalArg.g:2261:2: rule__Graphic__Group__3__Impl rule__Graphic__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Graphic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphic__Group__4();

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
    // $ANTLR end "rule__Graphic__Group__3"


    // $ANTLR start "rule__Graphic__Group__3__Impl"
    // InternalArg.g:2268:1: rule__Graphic__Group__3__Impl : ( ( rule__Graphic__ClassesAssignment_3 )* ) ;
    public final void rule__Graphic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2272:1: ( ( ( rule__Graphic__ClassesAssignment_3 )* ) )
            // InternalArg.g:2273:1: ( ( rule__Graphic__ClassesAssignment_3 )* )
            {
            // InternalArg.g:2273:1: ( ( rule__Graphic__ClassesAssignment_3 )* )
            // InternalArg.g:2274:2: ( rule__Graphic__ClassesAssignment_3 )*
            {
             before(grammarAccess.getGraphicAccess().getClassesAssignment_3()); 
            // InternalArg.g:2275:2: ( rule__Graphic__ClassesAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==66) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalArg.g:2275:3: rule__Graphic__ClassesAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Graphic__ClassesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getGraphicAccess().getClassesAssignment_3()); 

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
    // $ANTLR end "rule__Graphic__Group__3__Impl"


    // $ANTLR start "rule__Graphic__Group__4"
    // InternalArg.g:2283:1: rule__Graphic__Group__4 : rule__Graphic__Group__4__Impl ;
    public final void rule__Graphic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2287:1: ( rule__Graphic__Group__4__Impl )
            // InternalArg.g:2288:2: rule__Graphic__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graphic__Group__4__Impl();

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
    // $ANTLR end "rule__Graphic__Group__4"


    // $ANTLR start "rule__Graphic__Group__4__Impl"
    // InternalArg.g:2294:1: rule__Graphic__Group__4__Impl : ( '}' ) ;
    public final void rule__Graphic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2298:1: ( ( '}' ) )
            // InternalArg.g:2299:1: ( '}' )
            {
            // InternalArg.g:2299:1: ( '}' )
            // InternalArg.g:2300:2: '}'
            {
             before(grammarAccess.getGraphicAccess().getRightCurlyBracketKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGraphicAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Graphic__Group__4__Impl"


    // $ANTLR start "rule__Physic__Group__0"
    // InternalArg.g:2310:1: rule__Physic__Group__0 : rule__Physic__Group__0__Impl rule__Physic__Group__1 ;
    public final void rule__Physic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2314:1: ( rule__Physic__Group__0__Impl rule__Physic__Group__1 )
            // InternalArg.g:2315:2: rule__Physic__Group__0__Impl rule__Physic__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Physic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Physic__Group__1();

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
    // $ANTLR end "rule__Physic__Group__0"


    // $ANTLR start "rule__Physic__Group__0__Impl"
    // InternalArg.g:2322:1: rule__Physic__Group__0__Impl : ( 'Physics' ) ;
    public final void rule__Physic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2326:1: ( ( 'Physics' ) )
            // InternalArg.g:2327:1: ( 'Physics' )
            {
            // InternalArg.g:2327:1: ( 'Physics' )
            // InternalArg.g:2328:2: 'Physics'
            {
             before(grammarAccess.getPhysicAccess().getPhysicsKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getPhysicAccess().getPhysicsKeyword_0()); 

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
    // $ANTLR end "rule__Physic__Group__0__Impl"


    // $ANTLR start "rule__Physic__Group__1"
    // InternalArg.g:2337:1: rule__Physic__Group__1 : rule__Physic__Group__1__Impl rule__Physic__Group__2 ;
    public final void rule__Physic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2341:1: ( rule__Physic__Group__1__Impl rule__Physic__Group__2 )
            // InternalArg.g:2342:2: rule__Physic__Group__1__Impl rule__Physic__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Physic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Physic__Group__2();

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
    // $ANTLR end "rule__Physic__Group__1"


    // $ANTLR start "rule__Physic__Group__1__Impl"
    // InternalArg.g:2349:1: rule__Physic__Group__1__Impl : ( '{' ) ;
    public final void rule__Physic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2353:1: ( ( '{' ) )
            // InternalArg.g:2354:1: ( '{' )
            {
            // InternalArg.g:2354:1: ( '{' )
            // InternalArg.g:2355:2: '{'
            {
             before(grammarAccess.getPhysicAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPhysicAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Physic__Group__1__Impl"


    // $ANTLR start "rule__Physic__Group__2"
    // InternalArg.g:2364:1: rule__Physic__Group__2 : rule__Physic__Group__2__Impl rule__Physic__Group__3 ;
    public final void rule__Physic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2368:1: ( rule__Physic__Group__2__Impl rule__Physic__Group__3 )
            // InternalArg.g:2369:2: rule__Physic__Group__2__Impl rule__Physic__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Physic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Physic__Group__3();

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
    // $ANTLR end "rule__Physic__Group__2"


    // $ANTLR start "rule__Physic__Group__2__Impl"
    // InternalArg.g:2376:1: rule__Physic__Group__2__Impl : ( ( rule__Physic__ClassesAssignment_2 ) ) ;
    public final void rule__Physic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2380:1: ( ( ( rule__Physic__ClassesAssignment_2 ) ) )
            // InternalArg.g:2381:1: ( ( rule__Physic__ClassesAssignment_2 ) )
            {
            // InternalArg.g:2381:1: ( ( rule__Physic__ClassesAssignment_2 ) )
            // InternalArg.g:2382:2: ( rule__Physic__ClassesAssignment_2 )
            {
             before(grammarAccess.getPhysicAccess().getClassesAssignment_2()); 
            // InternalArg.g:2383:2: ( rule__Physic__ClassesAssignment_2 )
            // InternalArg.g:2383:3: rule__Physic__ClassesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Physic__ClassesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPhysicAccess().getClassesAssignment_2()); 

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
    // $ANTLR end "rule__Physic__Group__2__Impl"


    // $ANTLR start "rule__Physic__Group__3"
    // InternalArg.g:2391:1: rule__Physic__Group__3 : rule__Physic__Group__3__Impl rule__Physic__Group__4 ;
    public final void rule__Physic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2395:1: ( rule__Physic__Group__3__Impl rule__Physic__Group__4 )
            // InternalArg.g:2396:2: rule__Physic__Group__3__Impl rule__Physic__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Physic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Physic__Group__4();

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
    // $ANTLR end "rule__Physic__Group__3"


    // $ANTLR start "rule__Physic__Group__3__Impl"
    // InternalArg.g:2403:1: rule__Physic__Group__3__Impl : ( ( rule__Physic__ClassesAssignment_3 )* ) ;
    public final void rule__Physic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2407:1: ( ( ( rule__Physic__ClassesAssignment_3 )* ) )
            // InternalArg.g:2408:1: ( ( rule__Physic__ClassesAssignment_3 )* )
            {
            // InternalArg.g:2408:1: ( ( rule__Physic__ClassesAssignment_3 )* )
            // InternalArg.g:2409:2: ( rule__Physic__ClassesAssignment_3 )*
            {
             before(grammarAccess.getPhysicAccess().getClassesAssignment_3()); 
            // InternalArg.g:2410:2: ( rule__Physic__ClassesAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==66) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalArg.g:2410:3: rule__Physic__ClassesAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Physic__ClassesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getPhysicAccess().getClassesAssignment_3()); 

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
    // $ANTLR end "rule__Physic__Group__3__Impl"


    // $ANTLR start "rule__Physic__Group__4"
    // InternalArg.g:2418:1: rule__Physic__Group__4 : rule__Physic__Group__4__Impl ;
    public final void rule__Physic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2422:1: ( rule__Physic__Group__4__Impl )
            // InternalArg.g:2423:2: rule__Physic__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Physic__Group__4__Impl();

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
    // $ANTLR end "rule__Physic__Group__4"


    // $ANTLR start "rule__Physic__Group__4__Impl"
    // InternalArg.g:2429:1: rule__Physic__Group__4__Impl : ( '}' ) ;
    public final void rule__Physic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2433:1: ( ( '}' ) )
            // InternalArg.g:2434:1: ( '}' )
            {
            // InternalArg.g:2434:1: ( '}' )
            // InternalArg.g:2435:2: '}'
            {
             before(grammarAccess.getPhysicAccess().getRightCurlyBracketKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPhysicAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Physic__Group__4__Impl"


    // $ANTLR start "rule__Game__Group__0"
    // InternalArg.g:2445:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2449:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalArg.g:2450:2: rule__Game__Group__0__Impl rule__Game__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__1();

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
    // $ANTLR end "rule__Game__Group__0"


    // $ANTLR start "rule__Game__Group__0__Impl"
    // InternalArg.g:2457:1: rule__Game__Group__0__Impl : ( 'Gamelogic' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2461:1: ( ( 'Gamelogic' ) )
            // InternalArg.g:2462:1: ( 'Gamelogic' )
            {
            // InternalArg.g:2462:1: ( 'Gamelogic' )
            // InternalArg.g:2463:2: 'Gamelogic'
            {
             before(grammarAccess.getGameAccess().getGamelogicKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getGamelogicKeyword_0()); 

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
    // $ANTLR end "rule__Game__Group__0__Impl"


    // $ANTLR start "rule__Game__Group__1"
    // InternalArg.g:2472:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2476:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalArg.g:2477:2: rule__Game__Group__1__Impl rule__Game__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Game__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__2();

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
    // $ANTLR end "rule__Game__Group__1"


    // $ANTLR start "rule__Game__Group__1__Impl"
    // InternalArg.g:2484:1: rule__Game__Group__1__Impl : ( '{' ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2488:1: ( ( '{' ) )
            // InternalArg.g:2489:1: ( '{' )
            {
            // InternalArg.g:2489:1: ( '{' )
            // InternalArg.g:2490:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Game__Group__1__Impl"


    // $ANTLR start "rule__Game__Group__2"
    // InternalArg.g:2499:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2503:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalArg.g:2504:2: rule__Game__Group__2__Impl rule__Game__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__3();

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
    // $ANTLR end "rule__Game__Group__2"


    // $ANTLR start "rule__Game__Group__2__Impl"
    // InternalArg.g:2511:1: rule__Game__Group__2__Impl : ( 'Display' ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2515:1: ( ( 'Display' ) )
            // InternalArg.g:2516:1: ( 'Display' )
            {
            // InternalArg.g:2516:1: ( 'Display' )
            // InternalArg.g:2517:2: 'Display'
            {
             before(grammarAccess.getGameAccess().getDisplayKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getDisplayKeyword_2()); 

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
    // $ANTLR end "rule__Game__Group__2__Impl"


    // $ANTLR start "rule__Game__Group__3"
    // InternalArg.g:2526:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2530:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalArg.g:2531:2: rule__Game__Group__3__Impl rule__Game__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Game__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__4();

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
    // $ANTLR end "rule__Game__Group__3"


    // $ANTLR start "rule__Game__Group__3__Impl"
    // InternalArg.g:2538:1: rule__Game__Group__3__Impl : ( '{' ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2542:1: ( ( '{' ) )
            // InternalArg.g:2543:1: ( '{' )
            {
            // InternalArg.g:2543:1: ( '{' )
            // InternalArg.g:2544:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Game__Group__3__Impl"


    // $ANTLR start "rule__Game__Group__4"
    // InternalArg.g:2553:1: rule__Game__Group__4 : rule__Game__Group__4__Impl rule__Game__Group__5 ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2557:1: ( rule__Game__Group__4__Impl rule__Game__Group__5 )
            // InternalArg.g:2558:2: rule__Game__Group__4__Impl rule__Game__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__5();

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
    // $ANTLR end "rule__Game__Group__4"


    // $ANTLR start "rule__Game__Group__4__Impl"
    // InternalArg.g:2565:1: rule__Game__Group__4__Impl : ( 'start' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2569:1: ( ( 'start' ) )
            // InternalArg.g:2570:1: ( 'start' )
            {
            // InternalArg.g:2570:1: ( 'start' )
            // InternalArg.g:2571:2: 'start'
            {
             before(grammarAccess.getGameAccess().getStartKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getStartKeyword_4()); 

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
    // $ANTLR end "rule__Game__Group__4__Impl"


    // $ANTLR start "rule__Game__Group__5"
    // InternalArg.g:2580:1: rule__Game__Group__5 : rule__Game__Group__5__Impl rule__Game__Group__6 ;
    public final void rule__Game__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2584:1: ( rule__Game__Group__5__Impl rule__Game__Group__6 )
            // InternalArg.g:2585:2: rule__Game__Group__5__Impl rule__Game__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Game__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__6();

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
    // $ANTLR end "rule__Game__Group__5"


    // $ANTLR start "rule__Game__Group__5__Impl"
    // InternalArg.g:2592:1: rule__Game__Group__5__Impl : ( ( rule__Game__StartAssignment_5 ) ) ;
    public final void rule__Game__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2596:1: ( ( ( rule__Game__StartAssignment_5 ) ) )
            // InternalArg.g:2597:1: ( ( rule__Game__StartAssignment_5 ) )
            {
            // InternalArg.g:2597:1: ( ( rule__Game__StartAssignment_5 ) )
            // InternalArg.g:2598:2: ( rule__Game__StartAssignment_5 )
            {
             before(grammarAccess.getGameAccess().getStartAssignment_5()); 
            // InternalArg.g:2599:2: ( rule__Game__StartAssignment_5 )
            // InternalArg.g:2599:3: rule__Game__StartAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Game__StartAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getStartAssignment_5()); 

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
    // $ANTLR end "rule__Game__Group__5__Impl"


    // $ANTLR start "rule__Game__Group__6"
    // InternalArg.g:2607:1: rule__Game__Group__6 : rule__Game__Group__6__Impl rule__Game__Group__7 ;
    public final void rule__Game__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2611:1: ( rule__Game__Group__6__Impl rule__Game__Group__7 )
            // InternalArg.g:2612:2: rule__Game__Group__6__Impl rule__Game__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__7();

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
    // $ANTLR end "rule__Game__Group__6"


    // $ANTLR start "rule__Game__Group__6__Impl"
    // InternalArg.g:2619:1: rule__Game__Group__6__Impl : ( 'win' ) ;
    public final void rule__Game__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2623:1: ( ( 'win' ) )
            // InternalArg.g:2624:1: ( 'win' )
            {
            // InternalArg.g:2624:1: ( 'win' )
            // InternalArg.g:2625:2: 'win'
            {
             before(grammarAccess.getGameAccess().getWinKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getWinKeyword_6()); 

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
    // $ANTLR end "rule__Game__Group__6__Impl"


    // $ANTLR start "rule__Game__Group__7"
    // InternalArg.g:2634:1: rule__Game__Group__7 : rule__Game__Group__7__Impl rule__Game__Group__8 ;
    public final void rule__Game__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2638:1: ( rule__Game__Group__7__Impl rule__Game__Group__8 )
            // InternalArg.g:2639:2: rule__Game__Group__7__Impl rule__Game__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Game__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__8();

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
    // $ANTLR end "rule__Game__Group__7"


    // $ANTLR start "rule__Game__Group__7__Impl"
    // InternalArg.g:2646:1: rule__Game__Group__7__Impl : ( ( rule__Game__WinAssignment_7 ) ) ;
    public final void rule__Game__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2650:1: ( ( ( rule__Game__WinAssignment_7 ) ) )
            // InternalArg.g:2651:1: ( ( rule__Game__WinAssignment_7 ) )
            {
            // InternalArg.g:2651:1: ( ( rule__Game__WinAssignment_7 ) )
            // InternalArg.g:2652:2: ( rule__Game__WinAssignment_7 )
            {
             before(grammarAccess.getGameAccess().getWinAssignment_7()); 
            // InternalArg.g:2653:2: ( rule__Game__WinAssignment_7 )
            // InternalArg.g:2653:3: rule__Game__WinAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Game__WinAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getWinAssignment_7()); 

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
    // $ANTLR end "rule__Game__Group__7__Impl"


    // $ANTLR start "rule__Game__Group__8"
    // InternalArg.g:2661:1: rule__Game__Group__8 : rule__Game__Group__8__Impl rule__Game__Group__9 ;
    public final void rule__Game__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2665:1: ( rule__Game__Group__8__Impl rule__Game__Group__9 )
            // InternalArg.g:2666:2: rule__Game__Group__8__Impl rule__Game__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__9();

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
    // $ANTLR end "rule__Game__Group__8"


    // $ANTLR start "rule__Game__Group__8__Impl"
    // InternalArg.g:2673:1: rule__Game__Group__8__Impl : ( 'lose' ) ;
    public final void rule__Game__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2677:1: ( ( 'lose' ) )
            // InternalArg.g:2678:1: ( 'lose' )
            {
            // InternalArg.g:2678:1: ( 'lose' )
            // InternalArg.g:2679:2: 'lose'
            {
             before(grammarAccess.getGameAccess().getLoseKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLoseKeyword_8()); 

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
    // $ANTLR end "rule__Game__Group__8__Impl"


    // $ANTLR start "rule__Game__Group__9"
    // InternalArg.g:2688:1: rule__Game__Group__9 : rule__Game__Group__9__Impl rule__Game__Group__10 ;
    public final void rule__Game__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2692:1: ( rule__Game__Group__9__Impl rule__Game__Group__10 )
            // InternalArg.g:2693:2: rule__Game__Group__9__Impl rule__Game__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__Game__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__10();

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
    // $ANTLR end "rule__Game__Group__9"


    // $ANTLR start "rule__Game__Group__9__Impl"
    // InternalArg.g:2700:1: rule__Game__Group__9__Impl : ( ( rule__Game__LoseAssignment_9 ) ) ;
    public final void rule__Game__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2704:1: ( ( ( rule__Game__LoseAssignment_9 ) ) )
            // InternalArg.g:2705:1: ( ( rule__Game__LoseAssignment_9 ) )
            {
            // InternalArg.g:2705:1: ( ( rule__Game__LoseAssignment_9 ) )
            // InternalArg.g:2706:2: ( rule__Game__LoseAssignment_9 )
            {
             before(grammarAccess.getGameAccess().getLoseAssignment_9()); 
            // InternalArg.g:2707:2: ( rule__Game__LoseAssignment_9 )
            // InternalArg.g:2707:3: rule__Game__LoseAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Game__LoseAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getLoseAssignment_9()); 

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
    // $ANTLR end "rule__Game__Group__9__Impl"


    // $ANTLR start "rule__Game__Group__10"
    // InternalArg.g:2715:1: rule__Game__Group__10 : rule__Game__Group__10__Impl rule__Game__Group__11 ;
    public final void rule__Game__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2719:1: ( rule__Game__Group__10__Impl rule__Game__Group__11 )
            // InternalArg.g:2720:2: rule__Game__Group__10__Impl rule__Game__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__11();

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
    // $ANTLR end "rule__Game__Group__10"


    // $ANTLR start "rule__Game__Group__10__Impl"
    // InternalArg.g:2727:1: rule__Game__Group__10__Impl : ( 'score' ) ;
    public final void rule__Game__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2731:1: ( ( 'score' ) )
            // InternalArg.g:2732:1: ( 'score' )
            {
            // InternalArg.g:2732:1: ( 'score' )
            // InternalArg.g:2733:2: 'score'
            {
             before(grammarAccess.getGameAccess().getScoreKeyword_10()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getScoreKeyword_10()); 

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
    // $ANTLR end "rule__Game__Group__10__Impl"


    // $ANTLR start "rule__Game__Group__11"
    // InternalArg.g:2742:1: rule__Game__Group__11 : rule__Game__Group__11__Impl rule__Game__Group__12 ;
    public final void rule__Game__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2746:1: ( rule__Game__Group__11__Impl rule__Game__Group__12 )
            // InternalArg.g:2747:2: rule__Game__Group__11__Impl rule__Game__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__Game__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__12();

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
    // $ANTLR end "rule__Game__Group__11"


    // $ANTLR start "rule__Game__Group__11__Impl"
    // InternalArg.g:2754:1: rule__Game__Group__11__Impl : ( '{' ) ;
    public final void rule__Game__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2758:1: ( ( '{' ) )
            // InternalArg.g:2759:1: ( '{' )
            {
            // InternalArg.g:2759:1: ( '{' )
            // InternalArg.g:2760:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Game__Group__11__Impl"


    // $ANTLR start "rule__Game__Group__12"
    // InternalArg.g:2769:1: rule__Game__Group__12 : rule__Game__Group__12__Impl rule__Game__Group__13 ;
    public final void rule__Game__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2773:1: ( rule__Game__Group__12__Impl rule__Game__Group__13 )
            // InternalArg.g:2774:2: rule__Game__Group__12__Impl rule__Game__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__Game__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__13();

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
    // $ANTLR end "rule__Game__Group__12"


    // $ANTLR start "rule__Game__Group__12__Impl"
    // InternalArg.g:2781:1: rule__Game__Group__12__Impl : ( ( rule__Game__ScoreAssignment_12 ) ) ;
    public final void rule__Game__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2785:1: ( ( ( rule__Game__ScoreAssignment_12 ) ) )
            // InternalArg.g:2786:1: ( ( rule__Game__ScoreAssignment_12 ) )
            {
            // InternalArg.g:2786:1: ( ( rule__Game__ScoreAssignment_12 ) )
            // InternalArg.g:2787:2: ( rule__Game__ScoreAssignment_12 )
            {
             before(grammarAccess.getGameAccess().getScoreAssignment_12()); 
            // InternalArg.g:2788:2: ( rule__Game__ScoreAssignment_12 )
            // InternalArg.g:2788:3: rule__Game__ScoreAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Game__ScoreAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getScoreAssignment_12()); 

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
    // $ANTLR end "rule__Game__Group__12__Impl"


    // $ANTLR start "rule__Game__Group__13"
    // InternalArg.g:2796:1: rule__Game__Group__13 : rule__Game__Group__13__Impl rule__Game__Group__14 ;
    public final void rule__Game__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2800:1: ( rule__Game__Group__13__Impl rule__Game__Group__14 )
            // InternalArg.g:2801:2: rule__Game__Group__13__Impl rule__Game__Group__14
            {
            pushFollow(FOLLOW_8);
            rule__Game__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__14();

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
    // $ANTLR end "rule__Game__Group__13"


    // $ANTLR start "rule__Game__Group__13__Impl"
    // InternalArg.g:2808:1: rule__Game__Group__13__Impl : ( '}' ) ;
    public final void rule__Game__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2812:1: ( ( '}' ) )
            // InternalArg.g:2813:1: ( '}' )
            {
            // InternalArg.g:2813:1: ( '}' )
            // InternalArg.g:2814:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_13()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Game__Group__13__Impl"


    // $ANTLR start "rule__Game__Group__14"
    // InternalArg.g:2823:1: rule__Game__Group__14 : rule__Game__Group__14__Impl rule__Game__Group__15 ;
    public final void rule__Game__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2827:1: ( rule__Game__Group__14__Impl rule__Game__Group__15 )
            // InternalArg.g:2828:2: rule__Game__Group__14__Impl rule__Game__Group__15
            {
            pushFollow(FOLLOW_22);
            rule__Game__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__15();

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
    // $ANTLR end "rule__Game__Group__14"


    // $ANTLR start "rule__Game__Group__14__Impl"
    // InternalArg.g:2835:1: rule__Game__Group__14__Impl : ( '}' ) ;
    public final void rule__Game__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2839:1: ( ( '}' ) )
            // InternalArg.g:2840:1: ( '}' )
            {
            // InternalArg.g:2840:1: ( '}' )
            // InternalArg.g:2841:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_14()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__Game__Group__14__Impl"


    // $ANTLR start "rule__Game__Group__15"
    // InternalArg.g:2850:1: rule__Game__Group__15 : rule__Game__Group__15__Impl rule__Game__Group__16 ;
    public final void rule__Game__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2854:1: ( rule__Game__Group__15__Impl rule__Game__Group__16 )
            // InternalArg.g:2855:2: rule__Game__Group__15__Impl rule__Game__Group__16
            {
            pushFollow(FOLLOW_22);
            rule__Game__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__16();

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
    // $ANTLR end "rule__Game__Group__15"


    // $ANTLR start "rule__Game__Group__15__Impl"
    // InternalArg.g:2862:1: rule__Game__Group__15__Impl : ( ( rule__Game__Group_15__0 )? ) ;
    public final void rule__Game__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2866:1: ( ( ( rule__Game__Group_15__0 )? ) )
            // InternalArg.g:2867:1: ( ( rule__Game__Group_15__0 )? )
            {
            // InternalArg.g:2867:1: ( ( rule__Game__Group_15__0 )? )
            // InternalArg.g:2868:2: ( rule__Game__Group_15__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_15()); 
            // InternalArg.g:2869:2: ( rule__Game__Group_15__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==52) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalArg.g:2869:3: rule__Game__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Game__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameAccess().getGroup_15()); 

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
    // $ANTLR end "rule__Game__Group__15__Impl"


    // $ANTLR start "rule__Game__Group__16"
    // InternalArg.g:2877:1: rule__Game__Group__16 : rule__Game__Group__16__Impl rule__Game__Group__17 ;
    public final void rule__Game__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2881:1: ( rule__Game__Group__16__Impl rule__Game__Group__17 )
            // InternalArg.g:2882:2: rule__Game__Group__16__Impl rule__Game__Group__17
            {
            pushFollow(FOLLOW_22);
            rule__Game__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__17();

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
    // $ANTLR end "rule__Game__Group__16"


    // $ANTLR start "rule__Game__Group__16__Impl"
    // InternalArg.g:2889:1: rule__Game__Group__16__Impl : ( ( rule__Game__Group_16__0 )? ) ;
    public final void rule__Game__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2893:1: ( ( ( rule__Game__Group_16__0 )? ) )
            // InternalArg.g:2894:1: ( ( rule__Game__Group_16__0 )? )
            {
            // InternalArg.g:2894:1: ( ( rule__Game__Group_16__0 )? )
            // InternalArg.g:2895:2: ( rule__Game__Group_16__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_16()); 
            // InternalArg.g:2896:2: ( rule__Game__Group_16__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==53) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalArg.g:2896:3: rule__Game__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Game__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameAccess().getGroup_16()); 

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
    // $ANTLR end "rule__Game__Group__16__Impl"


    // $ANTLR start "rule__Game__Group__17"
    // InternalArg.g:2904:1: rule__Game__Group__17 : rule__Game__Group__17__Impl rule__Game__Group__18 ;
    public final void rule__Game__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2908:1: ( rule__Game__Group__17__Impl rule__Game__Group__18 )
            // InternalArg.g:2909:2: rule__Game__Group__17__Impl rule__Game__Group__18
            {
            pushFollow(FOLLOW_22);
            rule__Game__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__18();

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
    // $ANTLR end "rule__Game__Group__17"


    // $ANTLR start "rule__Game__Group__17__Impl"
    // InternalArg.g:2916:1: rule__Game__Group__17__Impl : ( ( rule__Game__Group_17__0 )? ) ;
    public final void rule__Game__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2920:1: ( ( ( rule__Game__Group_17__0 )? ) )
            // InternalArg.g:2921:1: ( ( rule__Game__Group_17__0 )? )
            {
            // InternalArg.g:2921:1: ( ( rule__Game__Group_17__0 )? )
            // InternalArg.g:2922:2: ( rule__Game__Group_17__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_17()); 
            // InternalArg.g:2923:2: ( rule__Game__Group_17__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==54) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalArg.g:2923:3: rule__Game__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Game__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameAccess().getGroup_17()); 

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
    // $ANTLR end "rule__Game__Group__17__Impl"


    // $ANTLR start "rule__Game__Group__18"
    // InternalArg.g:2931:1: rule__Game__Group__18 : rule__Game__Group__18__Impl rule__Game__Group__19 ;
    public final void rule__Game__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2935:1: ( rule__Game__Group__18__Impl rule__Game__Group__19 )
            // InternalArg.g:2936:2: rule__Game__Group__18__Impl rule__Game__Group__19
            {
            pushFollow(FOLLOW_22);
            rule__Game__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__19();

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
    // $ANTLR end "rule__Game__Group__18"


    // $ANTLR start "rule__Game__Group__18__Impl"
    // InternalArg.g:2943:1: rule__Game__Group__18__Impl : ( ( rule__Game__Group_18__0 )? ) ;
    public final void rule__Game__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2947:1: ( ( ( rule__Game__Group_18__0 )? ) )
            // InternalArg.g:2948:1: ( ( rule__Game__Group_18__0 )? )
            {
            // InternalArg.g:2948:1: ( ( rule__Game__Group_18__0 )? )
            // InternalArg.g:2949:2: ( rule__Game__Group_18__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_18()); 
            // InternalArg.g:2950:2: ( rule__Game__Group_18__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==55) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalArg.g:2950:3: rule__Game__Group_18__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Game__Group_18__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameAccess().getGroup_18()); 

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
    // $ANTLR end "rule__Game__Group__18__Impl"


    // $ANTLR start "rule__Game__Group__19"
    // InternalArg.g:2958:1: rule__Game__Group__19 : rule__Game__Group__19__Impl ;
    public final void rule__Game__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2962:1: ( rule__Game__Group__19__Impl )
            // InternalArg.g:2963:2: rule__Game__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__19__Impl();

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
    // $ANTLR end "rule__Game__Group__19"


    // $ANTLR start "rule__Game__Group__19__Impl"
    // InternalArg.g:2969:1: rule__Game__Group__19__Impl : ( '}' ) ;
    public final void rule__Game__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2973:1: ( ( '}' ) )
            // InternalArg.g:2974:1: ( '}' )
            {
            // InternalArg.g:2974:1: ( '}' )
            // InternalArg.g:2975:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_19()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_19()); 

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
    // $ANTLR end "rule__Game__Group__19__Impl"


    // $ANTLR start "rule__Game__Group_15__0"
    // InternalArg.g:2985:1: rule__Game__Group_15__0 : rule__Game__Group_15__0__Impl rule__Game__Group_15__1 ;
    public final void rule__Game__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:2989:1: ( rule__Game__Group_15__0__Impl rule__Game__Group_15__1 )
            // InternalArg.g:2990:2: rule__Game__Group_15__0__Impl rule__Game__Group_15__1
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_15__1();

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
    // $ANTLR end "rule__Game__Group_15__0"


    // $ANTLR start "rule__Game__Group_15__0__Impl"
    // InternalArg.g:2997:1: rule__Game__Group_15__0__Impl : ( 'Actions' ) ;
    public final void rule__Game__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3001:1: ( ( 'Actions' ) )
            // InternalArg.g:3002:1: ( 'Actions' )
            {
            // InternalArg.g:3002:1: ( 'Actions' )
            // InternalArg.g:3003:2: 'Actions'
            {
             before(grammarAccess.getGameAccess().getActionsKeyword_15_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getActionsKeyword_15_0()); 

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
    // $ANTLR end "rule__Game__Group_15__0__Impl"


    // $ANTLR start "rule__Game__Group_15__1"
    // InternalArg.g:3012:1: rule__Game__Group_15__1 : rule__Game__Group_15__1__Impl rule__Game__Group_15__2 ;
    public final void rule__Game__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3016:1: ( rule__Game__Group_15__1__Impl rule__Game__Group_15__2 )
            // InternalArg.g:3017:2: rule__Game__Group_15__1__Impl rule__Game__Group_15__2
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_15__2();

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
    // $ANTLR end "rule__Game__Group_15__1"


    // $ANTLR start "rule__Game__Group_15__1__Impl"
    // InternalArg.g:3024:1: rule__Game__Group_15__1__Impl : ( '{' ) ;
    public final void rule__Game__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3028:1: ( ( '{' ) )
            // InternalArg.g:3029:1: ( '{' )
            {
            // InternalArg.g:3029:1: ( '{' )
            // InternalArg.g:3030:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_15_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_15_1()); 

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
    // $ANTLR end "rule__Game__Group_15__1__Impl"


    // $ANTLR start "rule__Game__Group_15__2"
    // InternalArg.g:3039:1: rule__Game__Group_15__2 : rule__Game__Group_15__2__Impl rule__Game__Group_15__3 ;
    public final void rule__Game__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3043:1: ( rule__Game__Group_15__2__Impl rule__Game__Group_15__3 )
            // InternalArg.g:3044:2: rule__Game__Group_15__2__Impl rule__Game__Group_15__3
            {
            pushFollow(FOLLOW_6);
            rule__Game__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_15__3();

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
    // $ANTLR end "rule__Game__Group_15__2"


    // $ANTLR start "rule__Game__Group_15__2__Impl"
    // InternalArg.g:3051:1: rule__Game__Group_15__2__Impl : ( ( rule__Game__ActionsTriggersAssignment_15_2 ) ) ;
    public final void rule__Game__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3055:1: ( ( ( rule__Game__ActionsTriggersAssignment_15_2 ) ) )
            // InternalArg.g:3056:1: ( ( rule__Game__ActionsTriggersAssignment_15_2 ) )
            {
            // InternalArg.g:3056:1: ( ( rule__Game__ActionsTriggersAssignment_15_2 ) )
            // InternalArg.g:3057:2: ( rule__Game__ActionsTriggersAssignment_15_2 )
            {
             before(grammarAccess.getGameAccess().getActionsTriggersAssignment_15_2()); 
            // InternalArg.g:3058:2: ( rule__Game__ActionsTriggersAssignment_15_2 )
            // InternalArg.g:3058:3: rule__Game__ActionsTriggersAssignment_15_2
            {
            pushFollow(FOLLOW_2);
            rule__Game__ActionsTriggersAssignment_15_2();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getActionsTriggersAssignment_15_2()); 

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
    // $ANTLR end "rule__Game__Group_15__2__Impl"


    // $ANTLR start "rule__Game__Group_15__3"
    // InternalArg.g:3066:1: rule__Game__Group_15__3 : rule__Game__Group_15__3__Impl rule__Game__Group_15__4 ;
    public final void rule__Game__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3070:1: ( rule__Game__Group_15__3__Impl rule__Game__Group_15__4 )
            // InternalArg.g:3071:2: rule__Game__Group_15__3__Impl rule__Game__Group_15__4
            {
            pushFollow(FOLLOW_6);
            rule__Game__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_15__4();

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
    // $ANTLR end "rule__Game__Group_15__3"


    // $ANTLR start "rule__Game__Group_15__3__Impl"
    // InternalArg.g:3078:1: rule__Game__Group_15__3__Impl : ( ( rule__Game__ActionsTriggersAssignment_15_3 )* ) ;
    public final void rule__Game__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3082:1: ( ( ( rule__Game__ActionsTriggersAssignment_15_3 )* ) )
            // InternalArg.g:3083:1: ( ( rule__Game__ActionsTriggersAssignment_15_3 )* )
            {
            // InternalArg.g:3083:1: ( ( rule__Game__ActionsTriggersAssignment_15_3 )* )
            // InternalArg.g:3084:2: ( rule__Game__ActionsTriggersAssignment_15_3 )*
            {
             before(grammarAccess.getGameAccess().getActionsTriggersAssignment_15_3()); 
            // InternalArg.g:3085:2: ( rule__Game__ActionsTriggersAssignment_15_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalArg.g:3085:3: rule__Game__ActionsTriggersAssignment_15_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Game__ActionsTriggersAssignment_15_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getActionsTriggersAssignment_15_3()); 

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
    // $ANTLR end "rule__Game__Group_15__3__Impl"


    // $ANTLR start "rule__Game__Group_15__4"
    // InternalArg.g:3093:1: rule__Game__Group_15__4 : rule__Game__Group_15__4__Impl ;
    public final void rule__Game__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3097:1: ( rule__Game__Group_15__4__Impl )
            // InternalArg.g:3098:2: rule__Game__Group_15__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group_15__4__Impl();

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
    // $ANTLR end "rule__Game__Group_15__4"


    // $ANTLR start "rule__Game__Group_15__4__Impl"
    // InternalArg.g:3104:1: rule__Game__Group_15__4__Impl : ( '}' ) ;
    public final void rule__Game__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3108:1: ( ( '}' ) )
            // InternalArg.g:3109:1: ( '}' )
            {
            // InternalArg.g:3109:1: ( '}' )
            // InternalArg.g:3110:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_15_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_15_4()); 

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
    // $ANTLR end "rule__Game__Group_15__4__Impl"


    // $ANTLR start "rule__Game__Group_16__0"
    // InternalArg.g:3120:1: rule__Game__Group_16__0 : rule__Game__Group_16__0__Impl rule__Game__Group_16__1 ;
    public final void rule__Game__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3124:1: ( rule__Game__Group_16__0__Impl rule__Game__Group_16__1 )
            // InternalArg.g:3125:2: rule__Game__Group_16__0__Impl rule__Game__Group_16__1
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_16__1();

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
    // $ANTLR end "rule__Game__Group_16__0"


    // $ANTLR start "rule__Game__Group_16__0__Impl"
    // InternalArg.g:3132:1: rule__Game__Group_16__0__Impl : ( 'Collisions' ) ;
    public final void rule__Game__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3136:1: ( ( 'Collisions' ) )
            // InternalArg.g:3137:1: ( 'Collisions' )
            {
            // InternalArg.g:3137:1: ( 'Collisions' )
            // InternalArg.g:3138:2: 'Collisions'
            {
             before(grammarAccess.getGameAccess().getCollisionsKeyword_16_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getCollisionsKeyword_16_0()); 

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
    // $ANTLR end "rule__Game__Group_16__0__Impl"


    // $ANTLR start "rule__Game__Group_16__1"
    // InternalArg.g:3147:1: rule__Game__Group_16__1 : rule__Game__Group_16__1__Impl rule__Game__Group_16__2 ;
    public final void rule__Game__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3151:1: ( rule__Game__Group_16__1__Impl rule__Game__Group_16__2 )
            // InternalArg.g:3152:2: rule__Game__Group_16__1__Impl rule__Game__Group_16__2
            {
            pushFollow(FOLLOW_14);
            rule__Game__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_16__2();

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
    // $ANTLR end "rule__Game__Group_16__1"


    // $ANTLR start "rule__Game__Group_16__1__Impl"
    // InternalArg.g:3159:1: rule__Game__Group_16__1__Impl : ( '{' ) ;
    public final void rule__Game__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3163:1: ( ( '{' ) )
            // InternalArg.g:3164:1: ( '{' )
            {
            // InternalArg.g:3164:1: ( '{' )
            // InternalArg.g:3165:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_16_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_16_1()); 

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
    // $ANTLR end "rule__Game__Group_16__1__Impl"


    // $ANTLR start "rule__Game__Group_16__2"
    // InternalArg.g:3174:1: rule__Game__Group_16__2 : rule__Game__Group_16__2__Impl rule__Game__Group_16__3 ;
    public final void rule__Game__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3178:1: ( rule__Game__Group_16__2__Impl rule__Game__Group_16__3 )
            // InternalArg.g:3179:2: rule__Game__Group_16__2__Impl rule__Game__Group_16__3
            {
            pushFollow(FOLLOW_15);
            rule__Game__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_16__3();

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
    // $ANTLR end "rule__Game__Group_16__2"


    // $ANTLR start "rule__Game__Group_16__2__Impl"
    // InternalArg.g:3186:1: rule__Game__Group_16__2__Impl : ( ( rule__Game__CollisionsAssignment_16_2 ) ) ;
    public final void rule__Game__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3190:1: ( ( ( rule__Game__CollisionsAssignment_16_2 ) ) )
            // InternalArg.g:3191:1: ( ( rule__Game__CollisionsAssignment_16_2 ) )
            {
            // InternalArg.g:3191:1: ( ( rule__Game__CollisionsAssignment_16_2 ) )
            // InternalArg.g:3192:2: ( rule__Game__CollisionsAssignment_16_2 )
            {
             before(grammarAccess.getGameAccess().getCollisionsAssignment_16_2()); 
            // InternalArg.g:3193:2: ( rule__Game__CollisionsAssignment_16_2 )
            // InternalArg.g:3193:3: rule__Game__CollisionsAssignment_16_2
            {
            pushFollow(FOLLOW_2);
            rule__Game__CollisionsAssignment_16_2();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getCollisionsAssignment_16_2()); 

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
    // $ANTLR end "rule__Game__Group_16__2__Impl"


    // $ANTLR start "rule__Game__Group_16__3"
    // InternalArg.g:3201:1: rule__Game__Group_16__3 : rule__Game__Group_16__3__Impl rule__Game__Group_16__4 ;
    public final void rule__Game__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3205:1: ( rule__Game__Group_16__3__Impl rule__Game__Group_16__4 )
            // InternalArg.g:3206:2: rule__Game__Group_16__3__Impl rule__Game__Group_16__4
            {
            pushFollow(FOLLOW_15);
            rule__Game__Group_16__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_16__4();

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
    // $ANTLR end "rule__Game__Group_16__3"


    // $ANTLR start "rule__Game__Group_16__3__Impl"
    // InternalArg.g:3213:1: rule__Game__Group_16__3__Impl : ( ( rule__Game__CollisionsAssignment_16_3 )* ) ;
    public final void rule__Game__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3217:1: ( ( ( rule__Game__CollisionsAssignment_16_3 )* ) )
            // InternalArg.g:3218:1: ( ( rule__Game__CollisionsAssignment_16_3 )* )
            {
            // InternalArg.g:3218:1: ( ( rule__Game__CollisionsAssignment_16_3 )* )
            // InternalArg.g:3219:2: ( rule__Game__CollisionsAssignment_16_3 )*
            {
             before(grammarAccess.getGameAccess().getCollisionsAssignment_16_3()); 
            // InternalArg.g:3220:2: ( rule__Game__CollisionsAssignment_16_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==66) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalArg.g:3220:3: rule__Game__CollisionsAssignment_16_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Game__CollisionsAssignment_16_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getCollisionsAssignment_16_3()); 

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
    // $ANTLR end "rule__Game__Group_16__3__Impl"


    // $ANTLR start "rule__Game__Group_16__4"
    // InternalArg.g:3228:1: rule__Game__Group_16__4 : rule__Game__Group_16__4__Impl ;
    public final void rule__Game__Group_16__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3232:1: ( rule__Game__Group_16__4__Impl )
            // InternalArg.g:3233:2: rule__Game__Group_16__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group_16__4__Impl();

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
    // $ANTLR end "rule__Game__Group_16__4"


    // $ANTLR start "rule__Game__Group_16__4__Impl"
    // InternalArg.g:3239:1: rule__Game__Group_16__4__Impl : ( '}' ) ;
    public final void rule__Game__Group_16__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3243:1: ( ( '}' ) )
            // InternalArg.g:3244:1: ( '}' )
            {
            // InternalArg.g:3244:1: ( '}' )
            // InternalArg.g:3245:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_16_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_16_4()); 

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
    // $ANTLR end "rule__Game__Group_16__4__Impl"


    // $ANTLR start "rule__Game__Group_17__0"
    // InternalArg.g:3255:1: rule__Game__Group_17__0 : rule__Game__Group_17__0__Impl rule__Game__Group_17__1 ;
    public final void rule__Game__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3259:1: ( rule__Game__Group_17__0__Impl rule__Game__Group_17__1 )
            // InternalArg.g:3260:2: rule__Game__Group_17__0__Impl rule__Game__Group_17__1
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_17__1();

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
    // $ANTLR end "rule__Game__Group_17__0"


    // $ANTLR start "rule__Game__Group_17__0__Impl"
    // InternalArg.g:3267:1: rule__Game__Group_17__0__Impl : ( 'Buttons' ) ;
    public final void rule__Game__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3271:1: ( ( 'Buttons' ) )
            // InternalArg.g:3272:1: ( 'Buttons' )
            {
            // InternalArg.g:3272:1: ( 'Buttons' )
            // InternalArg.g:3273:2: 'Buttons'
            {
             before(grammarAccess.getGameAccess().getButtonsKeyword_17_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getButtonsKeyword_17_0()); 

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
    // $ANTLR end "rule__Game__Group_17__0__Impl"


    // $ANTLR start "rule__Game__Group_17__1"
    // InternalArg.g:3282:1: rule__Game__Group_17__1 : rule__Game__Group_17__1__Impl rule__Game__Group_17__2 ;
    public final void rule__Game__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3286:1: ( rule__Game__Group_17__1__Impl rule__Game__Group_17__2 )
            // InternalArg.g:3287:2: rule__Game__Group_17__1__Impl rule__Game__Group_17__2
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_17__2();

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
    // $ANTLR end "rule__Game__Group_17__1"


    // $ANTLR start "rule__Game__Group_17__1__Impl"
    // InternalArg.g:3294:1: rule__Game__Group_17__1__Impl : ( '{' ) ;
    public final void rule__Game__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3298:1: ( ( '{' ) )
            // InternalArg.g:3299:1: ( '{' )
            {
            // InternalArg.g:3299:1: ( '{' )
            // InternalArg.g:3300:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_17_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_17_1()); 

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
    // $ANTLR end "rule__Game__Group_17__1__Impl"


    // $ANTLR start "rule__Game__Group_17__2"
    // InternalArg.g:3309:1: rule__Game__Group_17__2 : rule__Game__Group_17__2__Impl rule__Game__Group_17__3 ;
    public final void rule__Game__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3313:1: ( rule__Game__Group_17__2__Impl rule__Game__Group_17__3 )
            // InternalArg.g:3314:2: rule__Game__Group_17__2__Impl rule__Game__Group_17__3
            {
            pushFollow(FOLLOW_6);
            rule__Game__Group_17__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_17__3();

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
    // $ANTLR end "rule__Game__Group_17__2"


    // $ANTLR start "rule__Game__Group_17__2__Impl"
    // InternalArg.g:3321:1: rule__Game__Group_17__2__Impl : ( ( rule__Game__GamepadAssignment_17_2 ) ) ;
    public final void rule__Game__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3325:1: ( ( ( rule__Game__GamepadAssignment_17_2 ) ) )
            // InternalArg.g:3326:1: ( ( rule__Game__GamepadAssignment_17_2 ) )
            {
            // InternalArg.g:3326:1: ( ( rule__Game__GamepadAssignment_17_2 ) )
            // InternalArg.g:3327:2: ( rule__Game__GamepadAssignment_17_2 )
            {
             before(grammarAccess.getGameAccess().getGamepadAssignment_17_2()); 
            // InternalArg.g:3328:2: ( rule__Game__GamepadAssignment_17_2 )
            // InternalArg.g:3328:3: rule__Game__GamepadAssignment_17_2
            {
            pushFollow(FOLLOW_2);
            rule__Game__GamepadAssignment_17_2();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGamepadAssignment_17_2()); 

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
    // $ANTLR end "rule__Game__Group_17__2__Impl"


    // $ANTLR start "rule__Game__Group_17__3"
    // InternalArg.g:3336:1: rule__Game__Group_17__3 : rule__Game__Group_17__3__Impl rule__Game__Group_17__4 ;
    public final void rule__Game__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3340:1: ( rule__Game__Group_17__3__Impl rule__Game__Group_17__4 )
            // InternalArg.g:3341:2: rule__Game__Group_17__3__Impl rule__Game__Group_17__4
            {
            pushFollow(FOLLOW_6);
            rule__Game__Group_17__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_17__4();

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
    // $ANTLR end "rule__Game__Group_17__3"


    // $ANTLR start "rule__Game__Group_17__3__Impl"
    // InternalArg.g:3348:1: rule__Game__Group_17__3__Impl : ( ( rule__Game__GamepadAssignment_17_3 )* ) ;
    public final void rule__Game__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3352:1: ( ( ( rule__Game__GamepadAssignment_17_3 )* ) )
            // InternalArg.g:3353:1: ( ( rule__Game__GamepadAssignment_17_3 )* )
            {
            // InternalArg.g:3353:1: ( ( rule__Game__GamepadAssignment_17_3 )* )
            // InternalArg.g:3354:2: ( rule__Game__GamepadAssignment_17_3 )*
            {
             before(grammarAccess.getGameAccess().getGamepadAssignment_17_3()); 
            // InternalArg.g:3355:2: ( rule__Game__GamepadAssignment_17_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalArg.g:3355:3: rule__Game__GamepadAssignment_17_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Game__GamepadAssignment_17_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getGamepadAssignment_17_3()); 

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
    // $ANTLR end "rule__Game__Group_17__3__Impl"


    // $ANTLR start "rule__Game__Group_17__4"
    // InternalArg.g:3363:1: rule__Game__Group_17__4 : rule__Game__Group_17__4__Impl ;
    public final void rule__Game__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3367:1: ( rule__Game__Group_17__4__Impl )
            // InternalArg.g:3368:2: rule__Game__Group_17__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group_17__4__Impl();

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
    // $ANTLR end "rule__Game__Group_17__4"


    // $ANTLR start "rule__Game__Group_17__4__Impl"
    // InternalArg.g:3374:1: rule__Game__Group_17__4__Impl : ( '}' ) ;
    public final void rule__Game__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3378:1: ( ( '}' ) )
            // InternalArg.g:3379:1: ( '}' )
            {
            // InternalArg.g:3379:1: ( '}' )
            // InternalArg.g:3380:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_17_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_17_4()); 

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
    // $ANTLR end "rule__Game__Group_17__4__Impl"


    // $ANTLR start "rule__Game__Group_18__0"
    // InternalArg.g:3390:1: rule__Game__Group_18__0 : rule__Game__Group_18__0__Impl rule__Game__Group_18__1 ;
    public final void rule__Game__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3394:1: ( rule__Game__Group_18__0__Impl rule__Game__Group_18__1 )
            // InternalArg.g:3395:2: rule__Game__Group_18__0__Impl rule__Game__Group_18__1
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_18__1();

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
    // $ANTLR end "rule__Game__Group_18__0"


    // $ANTLR start "rule__Game__Group_18__0__Impl"
    // InternalArg.g:3402:1: rule__Game__Group_18__0__Impl : ( 'Elements' ) ;
    public final void rule__Game__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3406:1: ( ( 'Elements' ) )
            // InternalArg.g:3407:1: ( 'Elements' )
            {
            // InternalArg.g:3407:1: ( 'Elements' )
            // InternalArg.g:3408:2: 'Elements'
            {
             before(grammarAccess.getGameAccess().getElementsKeyword_18_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getElementsKeyword_18_0()); 

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
    // $ANTLR end "rule__Game__Group_18__0__Impl"


    // $ANTLR start "rule__Game__Group_18__1"
    // InternalArg.g:3417:1: rule__Game__Group_18__1 : rule__Game__Group_18__1__Impl rule__Game__Group_18__2 ;
    public final void rule__Game__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3421:1: ( rule__Game__Group_18__1__Impl rule__Game__Group_18__2 )
            // InternalArg.g:3422:2: rule__Game__Group_18__1__Impl rule__Game__Group_18__2
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group_18__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_18__2();

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
    // $ANTLR end "rule__Game__Group_18__1"


    // $ANTLR start "rule__Game__Group_18__1__Impl"
    // InternalArg.g:3429:1: rule__Game__Group_18__1__Impl : ( '{' ) ;
    public final void rule__Game__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3433:1: ( ( '{' ) )
            // InternalArg.g:3434:1: ( '{' )
            {
            // InternalArg.g:3434:1: ( '{' )
            // InternalArg.g:3435:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_18_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_18_1()); 

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
    // $ANTLR end "rule__Game__Group_18__1__Impl"


    // $ANTLR start "rule__Game__Group_18__2"
    // InternalArg.g:3444:1: rule__Game__Group_18__2 : rule__Game__Group_18__2__Impl rule__Game__Group_18__3 ;
    public final void rule__Game__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3448:1: ( rule__Game__Group_18__2__Impl rule__Game__Group_18__3 )
            // InternalArg.g:3449:2: rule__Game__Group_18__2__Impl rule__Game__Group_18__3
            {
            pushFollow(FOLLOW_6);
            rule__Game__Group_18__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_18__3();

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
    // $ANTLR end "rule__Game__Group_18__2"


    // $ANTLR start "rule__Game__Group_18__2__Impl"
    // InternalArg.g:3456:1: rule__Game__Group_18__2__Impl : ( ( rule__Game__ObjInitAssignment_18_2 ) ) ;
    public final void rule__Game__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3460:1: ( ( ( rule__Game__ObjInitAssignment_18_2 ) ) )
            // InternalArg.g:3461:1: ( ( rule__Game__ObjInitAssignment_18_2 ) )
            {
            // InternalArg.g:3461:1: ( ( rule__Game__ObjInitAssignment_18_2 ) )
            // InternalArg.g:3462:2: ( rule__Game__ObjInitAssignment_18_2 )
            {
             before(grammarAccess.getGameAccess().getObjInitAssignment_18_2()); 
            // InternalArg.g:3463:2: ( rule__Game__ObjInitAssignment_18_2 )
            // InternalArg.g:3463:3: rule__Game__ObjInitAssignment_18_2
            {
            pushFollow(FOLLOW_2);
            rule__Game__ObjInitAssignment_18_2();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getObjInitAssignment_18_2()); 

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
    // $ANTLR end "rule__Game__Group_18__2__Impl"


    // $ANTLR start "rule__Game__Group_18__3"
    // InternalArg.g:3471:1: rule__Game__Group_18__3 : rule__Game__Group_18__3__Impl rule__Game__Group_18__4 ;
    public final void rule__Game__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3475:1: ( rule__Game__Group_18__3__Impl rule__Game__Group_18__4 )
            // InternalArg.g:3476:2: rule__Game__Group_18__3__Impl rule__Game__Group_18__4
            {
            pushFollow(FOLLOW_6);
            rule__Game__Group_18__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_18__4();

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
    // $ANTLR end "rule__Game__Group_18__3"


    // $ANTLR start "rule__Game__Group_18__3__Impl"
    // InternalArg.g:3483:1: rule__Game__Group_18__3__Impl : ( ( rule__Game__ObjInitAssignment_18_3 )* ) ;
    public final void rule__Game__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3487:1: ( ( ( rule__Game__ObjInitAssignment_18_3 )* ) )
            // InternalArg.g:3488:1: ( ( rule__Game__ObjInitAssignment_18_3 )* )
            {
            // InternalArg.g:3488:1: ( ( rule__Game__ObjInitAssignment_18_3 )* )
            // InternalArg.g:3489:2: ( rule__Game__ObjInitAssignment_18_3 )*
            {
             before(grammarAccess.getGameAccess().getObjInitAssignment_18_3()); 
            // InternalArg.g:3490:2: ( rule__Game__ObjInitAssignment_18_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalArg.g:3490:3: rule__Game__ObjInitAssignment_18_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Game__ObjInitAssignment_18_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getObjInitAssignment_18_3()); 

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
    // $ANTLR end "rule__Game__Group_18__3__Impl"


    // $ANTLR start "rule__Game__Group_18__4"
    // InternalArg.g:3498:1: rule__Game__Group_18__4 : rule__Game__Group_18__4__Impl ;
    public final void rule__Game__Group_18__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3502:1: ( rule__Game__Group_18__4__Impl )
            // InternalArg.g:3503:2: rule__Game__Group_18__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group_18__4__Impl();

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
    // $ANTLR end "rule__Game__Group_18__4"


    // $ANTLR start "rule__Game__Group_18__4__Impl"
    // InternalArg.g:3509:1: rule__Game__Group_18__4__Impl : ( '}' ) ;
    public final void rule__Game__Group_18__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3513:1: ( ( '}' ) )
            // InternalArg.g:3514:1: ( '}' )
            {
            // InternalArg.g:3514:1: ( '}' )
            // InternalArg.g:3515:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_18_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_18_4()); 

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
    // $ANTLR end "rule__Game__Group_18__4__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalArg.g:3525:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3529:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalArg.g:3530:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalArg.g:3537:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3541:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalArg.g:3542:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalArg.g:3542:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalArg.g:3543:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalArg.g:3544:2: ( rule__Attribute__NameAssignment_0 )
            // InternalArg.g:3544:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalArg.g:3552:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3556:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalArg.g:3557:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalArg.g:3564:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3568:1: ( ( ':' ) )
            // InternalArg.g:3569:1: ( ':' )
            {
            // InternalArg.g:3569:1: ( ':' )
            // InternalArg.g:3570:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalArg.g:3579:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3583:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalArg.g:3584:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalArg.g:3591:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3595:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalArg.g:3596:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalArg.g:3596:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalArg.g:3597:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalArg.g:3598:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalArg.g:3598:3: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalArg.g:3606:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3610:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalArg.g:3611:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalArg.g:3618:1: rule__Attribute__Group__3__Impl : ( '[' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3622:1: ( ( '[' ) )
            // InternalArg.g:3623:1: ( '[' )
            {
            // InternalArg.g:3623:1: ( '[' )
            // InternalArg.g:3624:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalArg.g:3633:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3637:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalArg.g:3638:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

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
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalArg.g:3645:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__MinAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3649:1: ( ( ( rule__Attribute__MinAssignment_4 ) ) )
            // InternalArg.g:3650:1: ( ( rule__Attribute__MinAssignment_4 ) )
            {
            // InternalArg.g:3650:1: ( ( rule__Attribute__MinAssignment_4 ) )
            // InternalArg.g:3651:2: ( rule__Attribute__MinAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getMinAssignment_4()); 
            // InternalArg.g:3652:2: ( rule__Attribute__MinAssignment_4 )
            // InternalArg.g:3652:3: rule__Attribute__MinAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__MinAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMinAssignment_4()); 

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
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalArg.g:3660:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3664:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalArg.g:3665:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Attribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6();

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
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalArg.g:3672:1: rule__Attribute__Group__5__Impl : ( '..' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3676:1: ( ( '..' ) )
            // InternalArg.g:3677:1: ( '..' )
            {
            // InternalArg.g:3677:1: ( '..' )
            // InternalArg.g:3678:2: '..'
            {
             before(grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_5()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_5()); 

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
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__6"
    // InternalArg.g:3687:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3691:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalArg.g:3692:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__Attribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__7();

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
    // $ANTLR end "rule__Attribute__Group__6"


    // $ANTLR start "rule__Attribute__Group__6__Impl"
    // InternalArg.g:3699:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__MaxAssignment_6 ) ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3703:1: ( ( ( rule__Attribute__MaxAssignment_6 ) ) )
            // InternalArg.g:3704:1: ( ( rule__Attribute__MaxAssignment_6 ) )
            {
            // InternalArg.g:3704:1: ( ( rule__Attribute__MaxAssignment_6 ) )
            // InternalArg.g:3705:2: ( rule__Attribute__MaxAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getMaxAssignment_6()); 
            // InternalArg.g:3706:2: ( rule__Attribute__MaxAssignment_6 )
            // InternalArg.g:3706:3: rule__Attribute__MaxAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__MaxAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMaxAssignment_6()); 

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
    // $ANTLR end "rule__Attribute__Group__6__Impl"


    // $ANTLR start "rule__Attribute__Group__7"
    // InternalArg.g:3714:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3718:1: ( rule__Attribute__Group__7__Impl rule__Attribute__Group__8 )
            // InternalArg.g:3719:2: rule__Attribute__Group__7__Impl rule__Attribute__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__Attribute__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__8();

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
    // $ANTLR end "rule__Attribute__Group__7"


    // $ANTLR start "rule__Attribute__Group__7__Impl"
    // InternalArg.g:3726:1: rule__Attribute__Group__7__Impl : ( ']' ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3730:1: ( ( ']' ) )
            // InternalArg.g:3731:1: ( ']' )
            {
            // InternalArg.g:3731:1: ( ']' )
            // InternalArg.g:3732:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_7()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_7()); 

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
    // $ANTLR end "rule__Attribute__Group__7__Impl"


    // $ANTLR start "rule__Attribute__Group__8"
    // InternalArg.g:3741:1: rule__Attribute__Group__8 : rule__Attribute__Group__8__Impl rule__Attribute__Group__9 ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3745:1: ( rule__Attribute__Group__8__Impl rule__Attribute__Group__9 )
            // InternalArg.g:3746:2: rule__Attribute__Group__8__Impl rule__Attribute__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__Attribute__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__9();

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
    // $ANTLR end "rule__Attribute__Group__8"


    // $ANTLR start "rule__Attribute__Group__8__Impl"
    // InternalArg.g:3753:1: rule__Attribute__Group__8__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3757:1: ( ( '=' ) )
            // InternalArg.g:3758:1: ( '=' )
            {
            // InternalArg.g:3758:1: ( '=' )
            // InternalArg.g:3759:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_8()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_8()); 

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
    // $ANTLR end "rule__Attribute__Group__8__Impl"


    // $ANTLR start "rule__Attribute__Group__9"
    // InternalArg.g:3768:1: rule__Attribute__Group__9 : rule__Attribute__Group__9__Impl rule__Attribute__Group__10 ;
    public final void rule__Attribute__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3772:1: ( rule__Attribute__Group__9__Impl rule__Attribute__Group__10 )
            // InternalArg.g:3773:2: rule__Attribute__Group__9__Impl rule__Attribute__Group__10
            {
            pushFollow(FOLLOW_31);
            rule__Attribute__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__10();

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
    // $ANTLR end "rule__Attribute__Group__9"


    // $ANTLR start "rule__Attribute__Group__9__Impl"
    // InternalArg.g:3780:1: rule__Attribute__Group__9__Impl : ( ( rule__Attribute__DefaultAssignment_9 ) ) ;
    public final void rule__Attribute__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3784:1: ( ( ( rule__Attribute__DefaultAssignment_9 ) ) )
            // InternalArg.g:3785:1: ( ( rule__Attribute__DefaultAssignment_9 ) )
            {
            // InternalArg.g:3785:1: ( ( rule__Attribute__DefaultAssignment_9 ) )
            // InternalArg.g:3786:2: ( rule__Attribute__DefaultAssignment_9 )
            {
             before(grammarAccess.getAttributeAccess().getDefaultAssignment_9()); 
            // InternalArg.g:3787:2: ( rule__Attribute__DefaultAssignment_9 )
            // InternalArg.g:3787:3: rule__Attribute__DefaultAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__DefaultAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDefaultAssignment_9()); 

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
    // $ANTLR end "rule__Attribute__Group__9__Impl"


    // $ANTLR start "rule__Attribute__Group__10"
    // InternalArg.g:3795:1: rule__Attribute__Group__10 : rule__Attribute__Group__10__Impl rule__Attribute__Group__11 ;
    public final void rule__Attribute__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3799:1: ( rule__Attribute__Group__10__Impl rule__Attribute__Group__11 )
            // InternalArg.g:3800:2: rule__Attribute__Group__10__Impl rule__Attribute__Group__11
            {
            pushFollow(FOLLOW_31);
            rule__Attribute__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__11();

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
    // $ANTLR end "rule__Attribute__Group__10"


    // $ANTLR start "rule__Attribute__Group__10__Impl"
    // InternalArg.g:3807:1: rule__Attribute__Group__10__Impl : ( ( rule__Attribute__IsParamAssignment_10 )? ) ;
    public final void rule__Attribute__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3811:1: ( ( ( rule__Attribute__IsParamAssignment_10 )? ) )
            // InternalArg.g:3812:1: ( ( rule__Attribute__IsParamAssignment_10 )? )
            {
            // InternalArg.g:3812:1: ( ( rule__Attribute__IsParamAssignment_10 )? )
            // InternalArg.g:3813:2: ( rule__Attribute__IsParamAssignment_10 )?
            {
             before(grammarAccess.getAttributeAccess().getIsParamAssignment_10()); 
            // InternalArg.g:3814:2: ( rule__Attribute__IsParamAssignment_10 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==118) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalArg.g:3814:3: rule__Attribute__IsParamAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__IsParamAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getIsParamAssignment_10()); 

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
    // $ANTLR end "rule__Attribute__Group__10__Impl"


    // $ANTLR start "rule__Attribute__Group__11"
    // InternalArg.g:3822:1: rule__Attribute__Group__11 : rule__Attribute__Group__11__Impl rule__Attribute__Group__12 ;
    public final void rule__Attribute__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3826:1: ( rule__Attribute__Group__11__Impl rule__Attribute__Group__12 )
            // InternalArg.g:3827:2: rule__Attribute__Group__11__Impl rule__Attribute__Group__12
            {
            pushFollow(FOLLOW_31);
            rule__Attribute__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__12();

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
    // $ANTLR end "rule__Attribute__Group__11"


    // $ANTLR start "rule__Attribute__Group__11__Impl"
    // InternalArg.g:3834:1: rule__Attribute__Group__11__Impl : ( ( rule__Attribute__IsKeyAssignment_11 )? ) ;
    public final void rule__Attribute__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3838:1: ( ( ( rule__Attribute__IsKeyAssignment_11 )? ) )
            // InternalArg.g:3839:1: ( ( rule__Attribute__IsKeyAssignment_11 )? )
            {
            // InternalArg.g:3839:1: ( ( rule__Attribute__IsKeyAssignment_11 )? )
            // InternalArg.g:3840:2: ( rule__Attribute__IsKeyAssignment_11 )?
            {
             before(grammarAccess.getAttributeAccess().getIsKeyAssignment_11()); 
            // InternalArg.g:3841:2: ( rule__Attribute__IsKeyAssignment_11 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==119) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalArg.g:3841:3: rule__Attribute__IsKeyAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__IsKeyAssignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getIsKeyAssignment_11()); 

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
    // $ANTLR end "rule__Attribute__Group__11__Impl"


    // $ANTLR start "rule__Attribute__Group__12"
    // InternalArg.g:3849:1: rule__Attribute__Group__12 : rule__Attribute__Group__12__Impl ;
    public final void rule__Attribute__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3853:1: ( rule__Attribute__Group__12__Impl )
            // InternalArg.g:3854:2: rule__Attribute__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__12__Impl();

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
    // $ANTLR end "rule__Attribute__Group__12"


    // $ANTLR start "rule__Attribute__Group__12__Impl"
    // InternalArg.g:3860:1: rule__Attribute__Group__12__Impl : ( ( rule__Attribute__ReadOnlyAssignment_12 )? ) ;
    public final void rule__Attribute__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3864:1: ( ( ( rule__Attribute__ReadOnlyAssignment_12 )? ) )
            // InternalArg.g:3865:1: ( ( rule__Attribute__ReadOnlyAssignment_12 )? )
            {
            // InternalArg.g:3865:1: ( ( rule__Attribute__ReadOnlyAssignment_12 )? )
            // InternalArg.g:3866:2: ( rule__Attribute__ReadOnlyAssignment_12 )?
            {
             before(grammarAccess.getAttributeAccess().getReadOnlyAssignment_12()); 
            // InternalArg.g:3867:2: ( rule__Attribute__ReadOnlyAssignment_12 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==120) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalArg.g:3867:3: rule__Attribute__ReadOnlyAssignment_12
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__ReadOnlyAssignment_12();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getReadOnlyAssignment_12()); 

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
    // $ANTLR end "rule__Attribute__Group__12__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalArg.g:3876:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3880:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalArg.g:3881:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

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
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalArg.g:3888:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__NameAssignment_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3892:1: ( ( ( rule__Reference__NameAssignment_0 ) ) )
            // InternalArg.g:3893:1: ( ( rule__Reference__NameAssignment_0 ) )
            {
            // InternalArg.g:3893:1: ( ( rule__Reference__NameAssignment_0 ) )
            // InternalArg.g:3894:2: ( rule__Reference__NameAssignment_0 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_0()); 
            // InternalArg.g:3895:2: ( rule__Reference__NameAssignment_0 )
            // InternalArg.g:3895:3: rule__Reference__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalArg.g:3903:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3907:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalArg.g:3908:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__2();

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
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalArg.g:3915:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__Group_1__0 )? ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3919:1: ( ( ( rule__Reference__Group_1__0 )? ) )
            // InternalArg.g:3920:1: ( ( rule__Reference__Group_1__0 )? )
            {
            // InternalArg.g:3920:1: ( ( rule__Reference__Group_1__0 )? )
            // InternalArg.g:3921:2: ( rule__Reference__Group_1__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_1()); 
            // InternalArg.g:3922:2: ( rule__Reference__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==63) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalArg.g:3922:3: rule__Reference__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // InternalArg.g:3930:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3934:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalArg.g:3935:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__3();

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
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // InternalArg.g:3942:1: rule__Reference__Group__2__Impl : ( 'min' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3946:1: ( ( 'min' ) )
            // InternalArg.g:3947:1: ( 'min' )
            {
            // InternalArg.g:3947:1: ( 'min' )
            // InternalArg.g:3948:2: 'min'
            {
             before(grammarAccess.getReferenceAccess().getMinKeyword_2()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getMinKeyword_2()); 

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
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // InternalArg.g:3957:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3961:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // InternalArg.g:3962:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__4();

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
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // InternalArg.g:3969:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__MinAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3973:1: ( ( ( rule__Reference__MinAssignment_3 ) ) )
            // InternalArg.g:3974:1: ( ( rule__Reference__MinAssignment_3 ) )
            {
            // InternalArg.g:3974:1: ( ( rule__Reference__MinAssignment_3 ) )
            // InternalArg.g:3975:2: ( rule__Reference__MinAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getMinAssignment_3()); 
            // InternalArg.g:3976:2: ( rule__Reference__MinAssignment_3 )
            // InternalArg.g:3976:3: rule__Reference__MinAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Reference__MinAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getMinAssignment_3()); 

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
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // InternalArg.g:3984:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:3988:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // InternalArg.g:3989:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Reference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__5();

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
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // InternalArg.g:3996:1: rule__Reference__Group__4__Impl : ( 'max' ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4000:1: ( ( 'max' ) )
            // InternalArg.g:4001:1: ( 'max' )
            {
            // InternalArg.g:4001:1: ( 'max' )
            // InternalArg.g:4002:2: 'max'
            {
             before(grammarAccess.getReferenceAccess().getMaxKeyword_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getMaxKeyword_4()); 

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
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group__5"
    // InternalArg.g:4011:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl rule__Reference__Group__6 ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4015:1: ( rule__Reference__Group__5__Impl rule__Reference__Group__6 )
            // InternalArg.g:4016:2: rule__Reference__Group__5__Impl rule__Reference__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__Reference__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__6();

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
    // $ANTLR end "rule__Reference__Group__5"


    // $ANTLR start "rule__Reference__Group__5__Impl"
    // InternalArg.g:4023:1: rule__Reference__Group__5__Impl : ( ( rule__Reference__MaxAssignment_5 ) ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4027:1: ( ( ( rule__Reference__MaxAssignment_5 ) ) )
            // InternalArg.g:4028:1: ( ( rule__Reference__MaxAssignment_5 ) )
            {
            // InternalArg.g:4028:1: ( ( rule__Reference__MaxAssignment_5 ) )
            // InternalArg.g:4029:2: ( rule__Reference__MaxAssignment_5 )
            {
             before(grammarAccess.getReferenceAccess().getMaxAssignment_5()); 
            // InternalArg.g:4030:2: ( rule__Reference__MaxAssignment_5 )
            // InternalArg.g:4030:3: rule__Reference__MaxAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Reference__MaxAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getMaxAssignment_5()); 

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
    // $ANTLR end "rule__Reference__Group__5__Impl"


    // $ANTLR start "rule__Reference__Group__6"
    // InternalArg.g:4038:1: rule__Reference__Group__6 : rule__Reference__Group__6__Impl rule__Reference__Group__7 ;
    public final void rule__Reference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4042:1: ( rule__Reference__Group__6__Impl rule__Reference__Group__7 )
            // InternalArg.g:4043:2: rule__Reference__Group__6__Impl rule__Reference__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__7();

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
    // $ANTLR end "rule__Reference__Group__6"


    // $ANTLR start "rule__Reference__Group__6__Impl"
    // InternalArg.g:4050:1: rule__Reference__Group__6__Impl : ( 'target' ) ;
    public final void rule__Reference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4054:1: ( ( 'target' ) )
            // InternalArg.g:4055:1: ( 'target' )
            {
            // InternalArg.g:4055:1: ( 'target' )
            // InternalArg.g:4056:2: 'target'
            {
             before(grammarAccess.getReferenceAccess().getTargetKeyword_6()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getTargetKeyword_6()); 

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
    // $ANTLR end "rule__Reference__Group__6__Impl"


    // $ANTLR start "rule__Reference__Group__7"
    // InternalArg.g:4065:1: rule__Reference__Group__7 : rule__Reference__Group__7__Impl rule__Reference__Group__8 ;
    public final void rule__Reference__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4069:1: ( rule__Reference__Group__7__Impl rule__Reference__Group__8 )
            // InternalArg.g:4070:2: rule__Reference__Group__7__Impl rule__Reference__Group__8
            {
            pushFollow(FOLLOW_35);
            rule__Reference__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__8();

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
    // $ANTLR end "rule__Reference__Group__7"


    // $ANTLR start "rule__Reference__Group__7__Impl"
    // InternalArg.g:4077:1: rule__Reference__Group__7__Impl : ( ( rule__Reference__TargetAssignment_7 ) ) ;
    public final void rule__Reference__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4081:1: ( ( ( rule__Reference__TargetAssignment_7 ) ) )
            // InternalArg.g:4082:1: ( ( rule__Reference__TargetAssignment_7 ) )
            {
            // InternalArg.g:4082:1: ( ( rule__Reference__TargetAssignment_7 ) )
            // InternalArg.g:4083:2: ( rule__Reference__TargetAssignment_7 )
            {
             before(grammarAccess.getReferenceAccess().getTargetAssignment_7()); 
            // InternalArg.g:4084:2: ( rule__Reference__TargetAssignment_7 )
            // InternalArg.g:4084:3: rule__Reference__TargetAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Reference__TargetAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getTargetAssignment_7()); 

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
    // $ANTLR end "rule__Reference__Group__7__Impl"


    // $ANTLR start "rule__Reference__Group__8"
    // InternalArg.g:4092:1: rule__Reference__Group__8 : rule__Reference__Group__8__Impl ;
    public final void rule__Reference__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4096:1: ( rule__Reference__Group__8__Impl )
            // InternalArg.g:4097:2: rule__Reference__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__8__Impl();

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
    // $ANTLR end "rule__Reference__Group__8"


    // $ANTLR start "rule__Reference__Group__8__Impl"
    // InternalArg.g:4103:1: rule__Reference__Group__8__Impl : ( ( rule__Reference__Group_8__0 )? ) ;
    public final void rule__Reference__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4107:1: ( ( ( rule__Reference__Group_8__0 )? ) )
            // InternalArg.g:4108:1: ( ( rule__Reference__Group_8__0 )? )
            {
            // InternalArg.g:4108:1: ( ( rule__Reference__Group_8__0 )? )
            // InternalArg.g:4109:2: ( rule__Reference__Group_8__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_8()); 
            // InternalArg.g:4110:2: ( rule__Reference__Group_8__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==64) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalArg.g:4110:3: rule__Reference__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Reference__Group__8__Impl"


    // $ANTLR start "rule__Reference__Group_1__0"
    // InternalArg.g:4119:1: rule__Reference__Group_1__0 : rule__Reference__Group_1__0__Impl rule__Reference__Group_1__1 ;
    public final void rule__Reference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4123:1: ( rule__Reference__Group_1__0__Impl rule__Reference__Group_1__1 )
            // InternalArg.g:4124:2: rule__Reference__Group_1__0__Impl rule__Reference__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_1__1();

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
    // $ANTLR end "rule__Reference__Group_1__0"


    // $ANTLR start "rule__Reference__Group_1__0__Impl"
    // InternalArg.g:4131:1: rule__Reference__Group_1__0__Impl : ( 'containtment' ) ;
    public final void rule__Reference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4135:1: ( ( 'containtment' ) )
            // InternalArg.g:4136:1: ( 'containtment' )
            {
            // InternalArg.g:4136:1: ( 'containtment' )
            // InternalArg.g:4137:2: 'containtment'
            {
             before(grammarAccess.getReferenceAccess().getContaintmentKeyword_1_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getContaintmentKeyword_1_0()); 

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
    // $ANTLR end "rule__Reference__Group_1__0__Impl"


    // $ANTLR start "rule__Reference__Group_1__1"
    // InternalArg.g:4146:1: rule__Reference__Group_1__1 : rule__Reference__Group_1__1__Impl ;
    public final void rule__Reference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4150:1: ( rule__Reference__Group_1__1__Impl )
            // InternalArg.g:4151:2: rule__Reference__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_1__1__Impl();

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
    // $ANTLR end "rule__Reference__Group_1__1"


    // $ANTLR start "rule__Reference__Group_1__1__Impl"
    // InternalArg.g:4157:1: rule__Reference__Group_1__1__Impl : ( ( rule__Reference__ContaintmentAssignment_1_1 ) ) ;
    public final void rule__Reference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4161:1: ( ( ( rule__Reference__ContaintmentAssignment_1_1 ) ) )
            // InternalArg.g:4162:1: ( ( rule__Reference__ContaintmentAssignment_1_1 ) )
            {
            // InternalArg.g:4162:1: ( ( rule__Reference__ContaintmentAssignment_1_1 ) )
            // InternalArg.g:4163:2: ( rule__Reference__ContaintmentAssignment_1_1 )
            {
             before(grammarAccess.getReferenceAccess().getContaintmentAssignment_1_1()); 
            // InternalArg.g:4164:2: ( rule__Reference__ContaintmentAssignment_1_1 )
            // InternalArg.g:4164:3: rule__Reference__ContaintmentAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__ContaintmentAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getContaintmentAssignment_1_1()); 

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
    // $ANTLR end "rule__Reference__Group_1__1__Impl"


    // $ANTLR start "rule__Reference__Group_8__0"
    // InternalArg.g:4173:1: rule__Reference__Group_8__0 : rule__Reference__Group_8__0__Impl rule__Reference__Group_8__1 ;
    public final void rule__Reference__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4177:1: ( rule__Reference__Group_8__0__Impl rule__Reference__Group_8__1 )
            // InternalArg.g:4178:2: rule__Reference__Group_8__0__Impl rule__Reference__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_8__1();

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
    // $ANTLR end "rule__Reference__Group_8__0"


    // $ANTLR start "rule__Reference__Group_8__0__Impl"
    // InternalArg.g:4185:1: rule__Reference__Group_8__0__Impl : ( 'opposite' ) ;
    public final void rule__Reference__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4189:1: ( ( 'opposite' ) )
            // InternalArg.g:4190:1: ( 'opposite' )
            {
            // InternalArg.g:4190:1: ( 'opposite' )
            // InternalArg.g:4191:2: 'opposite'
            {
             before(grammarAccess.getReferenceAccess().getOppositeKeyword_8_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getOppositeKeyword_8_0()); 

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
    // $ANTLR end "rule__Reference__Group_8__0__Impl"


    // $ANTLR start "rule__Reference__Group_8__1"
    // InternalArg.g:4200:1: rule__Reference__Group_8__1 : rule__Reference__Group_8__1__Impl ;
    public final void rule__Reference__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4204:1: ( rule__Reference__Group_8__1__Impl )
            // InternalArg.g:4205:2: rule__Reference__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_8__1__Impl();

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
    // $ANTLR end "rule__Reference__Group_8__1"


    // $ANTLR start "rule__Reference__Group_8__1__Impl"
    // InternalArg.g:4211:1: rule__Reference__Group_8__1__Impl : ( ( rule__Reference__OppositeAssignment_8_1 ) ) ;
    public final void rule__Reference__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4215:1: ( ( ( rule__Reference__OppositeAssignment_8_1 ) ) )
            // InternalArg.g:4216:1: ( ( rule__Reference__OppositeAssignment_8_1 ) )
            {
            // InternalArg.g:4216:1: ( ( rule__Reference__OppositeAssignment_8_1 ) )
            // InternalArg.g:4217:2: ( rule__Reference__OppositeAssignment_8_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeAssignment_8_1()); 
            // InternalArg.g:4218:2: ( rule__Reference__OppositeAssignment_8_1 )
            // InternalArg.g:4218:3: rule__Reference__OppositeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__OppositeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getOppositeAssignment_8_1()); 

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
    // $ANTLR end "rule__Reference__Group_8__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalArg.g:4227:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4231:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalArg.g:4232:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalArg.g:4239:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4243:1: ( ( ( '-' )? ) )
            // InternalArg.g:4244:1: ( ( '-' )? )
            {
            // InternalArg.g:4244:1: ( ( '-' )? )
            // InternalArg.g:4245:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalArg.g:4246:2: ( '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==65) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalArg.g:4246:3: '-'
                    {
                    match(input,65,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalArg.g:4254:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4258:1: ( rule__EInt__Group__1__Impl )
            // InternalArg.g:4259:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalArg.g:4265:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4269:1: ( ( RULE_INT ) )
            // InternalArg.g:4270:1: ( RULE_INT )
            {
            // InternalArg.g:4270:1: ( RULE_INT )
            // InternalArg.g:4271:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__GraphicClass__Group__0"
    // InternalArg.g:4281:1: rule__GraphicClass__Group__0 : rule__GraphicClass__Group__0__Impl rule__GraphicClass__Group__1 ;
    public final void rule__GraphicClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4285:1: ( rule__GraphicClass__Group__0__Impl rule__GraphicClass__Group__1 )
            // InternalArg.g:4286:2: rule__GraphicClass__Group__0__Impl rule__GraphicClass__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GraphicClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicClass__Group__1();

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
    // $ANTLR end "rule__GraphicClass__Group__0"


    // $ANTLR start "rule__GraphicClass__Group__0__Impl"
    // InternalArg.g:4293:1: rule__GraphicClass__Group__0__Impl : ( 'element' ) ;
    public final void rule__GraphicClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4297:1: ( ( 'element' ) )
            // InternalArg.g:4298:1: ( 'element' )
            {
            // InternalArg.g:4298:1: ( 'element' )
            // InternalArg.g:4299:2: 'element'
            {
             before(grammarAccess.getGraphicClassAccess().getElementKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getGraphicClassAccess().getElementKeyword_0()); 

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
    // $ANTLR end "rule__GraphicClass__Group__0__Impl"


    // $ANTLR start "rule__GraphicClass__Group__1"
    // InternalArg.g:4308:1: rule__GraphicClass__Group__1 : rule__GraphicClass__Group__1__Impl rule__GraphicClass__Group__2 ;
    public final void rule__GraphicClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4312:1: ( rule__GraphicClass__Group__1__Impl rule__GraphicClass__Group__2 )
            // InternalArg.g:4313:2: rule__GraphicClass__Group__1__Impl rule__GraphicClass__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__GraphicClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicClass__Group__2();

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
    // $ANTLR end "rule__GraphicClass__Group__1"


    // $ANTLR start "rule__GraphicClass__Group__1__Impl"
    // InternalArg.g:4320:1: rule__GraphicClass__Group__1__Impl : ( ( rule__GraphicClass__OntoClassAssignment_1 ) ) ;
    public final void rule__GraphicClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4324:1: ( ( ( rule__GraphicClass__OntoClassAssignment_1 ) ) )
            // InternalArg.g:4325:1: ( ( rule__GraphicClass__OntoClassAssignment_1 ) )
            {
            // InternalArg.g:4325:1: ( ( rule__GraphicClass__OntoClassAssignment_1 ) )
            // InternalArg.g:4326:2: ( rule__GraphicClass__OntoClassAssignment_1 )
            {
             before(grammarAccess.getGraphicClassAccess().getOntoClassAssignment_1()); 
            // InternalArg.g:4327:2: ( rule__GraphicClass__OntoClassAssignment_1 )
            // InternalArg.g:4327:3: rule__GraphicClass__OntoClassAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphicClass__OntoClassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphicClassAccess().getOntoClassAssignment_1()); 

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
    // $ANTLR end "rule__GraphicClass__Group__1__Impl"


    // $ANTLR start "rule__GraphicClass__Group__2"
    // InternalArg.g:4335:1: rule__GraphicClass__Group__2 : rule__GraphicClass__Group__2__Impl rule__GraphicClass__Group__3 ;
    public final void rule__GraphicClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4339:1: ( rule__GraphicClass__Group__2__Impl rule__GraphicClass__Group__3 )
            // InternalArg.g:4340:2: rule__GraphicClass__Group__2__Impl rule__GraphicClass__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__GraphicClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicClass__Group__3();

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
    // $ANTLR end "rule__GraphicClass__Group__2"


    // $ANTLR start "rule__GraphicClass__Group__2__Impl"
    // InternalArg.g:4347:1: rule__GraphicClass__Group__2__Impl : ( 'versions' ) ;
    public final void rule__GraphicClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4351:1: ( ( 'versions' ) )
            // InternalArg.g:4352:1: ( 'versions' )
            {
            // InternalArg.g:4352:1: ( 'versions' )
            // InternalArg.g:4353:2: 'versions'
            {
             before(grammarAccess.getGraphicClassAccess().getVersionsKeyword_2()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getGraphicClassAccess().getVersionsKeyword_2()); 

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
    // $ANTLR end "rule__GraphicClass__Group__2__Impl"


    // $ANTLR start "rule__GraphicClass__Group__3"
    // InternalArg.g:4362:1: rule__GraphicClass__Group__3 : rule__GraphicClass__Group__3__Impl rule__GraphicClass__Group__4 ;
    public final void rule__GraphicClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4366:1: ( rule__GraphicClass__Group__3__Impl rule__GraphicClass__Group__4 )
            // InternalArg.g:4367:2: rule__GraphicClass__Group__3__Impl rule__GraphicClass__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__GraphicClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicClass__Group__4();

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
    // $ANTLR end "rule__GraphicClass__Group__3"


    // $ANTLR start "rule__GraphicClass__Group__3__Impl"
    // InternalArg.g:4374:1: rule__GraphicClass__Group__3__Impl : ( '{' ) ;
    public final void rule__GraphicClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4378:1: ( ( '{' ) )
            // InternalArg.g:4379:1: ( '{' )
            {
            // InternalArg.g:4379:1: ( '{' )
            // InternalArg.g:4380:2: '{'
            {
             before(grammarAccess.getGraphicClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGraphicClassAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__GraphicClass__Group__3__Impl"


    // $ANTLR start "rule__GraphicClass__Group__4"
    // InternalArg.g:4389:1: rule__GraphicClass__Group__4 : rule__GraphicClass__Group__4__Impl rule__GraphicClass__Group__5 ;
    public final void rule__GraphicClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4393:1: ( rule__GraphicClass__Group__4__Impl rule__GraphicClass__Group__5 )
            // InternalArg.g:4394:2: rule__GraphicClass__Group__4__Impl rule__GraphicClass__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__GraphicClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicClass__Group__5();

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
    // $ANTLR end "rule__GraphicClass__Group__4"


    // $ANTLR start "rule__GraphicClass__Group__4__Impl"
    // InternalArg.g:4401:1: rule__GraphicClass__Group__4__Impl : ( ( rule__GraphicClass__VersionsAssignment_4 ) ) ;
    public final void rule__GraphicClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4405:1: ( ( ( rule__GraphicClass__VersionsAssignment_4 ) ) )
            // InternalArg.g:4406:1: ( ( rule__GraphicClass__VersionsAssignment_4 ) )
            {
            // InternalArg.g:4406:1: ( ( rule__GraphicClass__VersionsAssignment_4 ) )
            // InternalArg.g:4407:2: ( rule__GraphicClass__VersionsAssignment_4 )
            {
             before(grammarAccess.getGraphicClassAccess().getVersionsAssignment_4()); 
            // InternalArg.g:4408:2: ( rule__GraphicClass__VersionsAssignment_4 )
            // InternalArg.g:4408:3: rule__GraphicClass__VersionsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GraphicClass__VersionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGraphicClassAccess().getVersionsAssignment_4()); 

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
    // $ANTLR end "rule__GraphicClass__Group__4__Impl"


    // $ANTLR start "rule__GraphicClass__Group__5"
    // InternalArg.g:4416:1: rule__GraphicClass__Group__5 : rule__GraphicClass__Group__5__Impl rule__GraphicClass__Group__6 ;
    public final void rule__GraphicClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4420:1: ( rule__GraphicClass__Group__5__Impl rule__GraphicClass__Group__6 )
            // InternalArg.g:4421:2: rule__GraphicClass__Group__5__Impl rule__GraphicClass__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__GraphicClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicClass__Group__6();

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
    // $ANTLR end "rule__GraphicClass__Group__5"


    // $ANTLR start "rule__GraphicClass__Group__5__Impl"
    // InternalArg.g:4428:1: rule__GraphicClass__Group__5__Impl : ( ( rule__GraphicClass__VersionsAssignment_5 )* ) ;
    public final void rule__GraphicClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4432:1: ( ( ( rule__GraphicClass__VersionsAssignment_5 )* ) )
            // InternalArg.g:4433:1: ( ( rule__GraphicClass__VersionsAssignment_5 )* )
            {
            // InternalArg.g:4433:1: ( ( rule__GraphicClass__VersionsAssignment_5 )* )
            // InternalArg.g:4434:2: ( rule__GraphicClass__VersionsAssignment_5 )*
            {
             before(grammarAccess.getGraphicClassAccess().getVersionsAssignment_5()); 
            // InternalArg.g:4435:2: ( rule__GraphicClass__VersionsAssignment_5 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalArg.g:4435:3: rule__GraphicClass__VersionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__GraphicClass__VersionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getGraphicClassAccess().getVersionsAssignment_5()); 

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
    // $ANTLR end "rule__GraphicClass__Group__5__Impl"


    // $ANTLR start "rule__GraphicClass__Group__6"
    // InternalArg.g:4443:1: rule__GraphicClass__Group__6 : rule__GraphicClass__Group__6__Impl rule__GraphicClass__Group__7 ;
    public final void rule__GraphicClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4447:1: ( rule__GraphicClass__Group__6__Impl rule__GraphicClass__Group__7 )
            // InternalArg.g:4448:2: rule__GraphicClass__Group__6__Impl rule__GraphicClass__Group__7
            {
            pushFollow(FOLLOW_37);
            rule__GraphicClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicClass__Group__7();

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
    // $ANTLR end "rule__GraphicClass__Group__6"


    // $ANTLR start "rule__GraphicClass__Group__6__Impl"
    // InternalArg.g:4455:1: rule__GraphicClass__Group__6__Impl : ( '}' ) ;
    public final void rule__GraphicClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4459:1: ( ( '}' ) )
            // InternalArg.g:4460:1: ( '}' )
            {
            // InternalArg.g:4460:1: ( '}' )
            // InternalArg.g:4461:2: '}'
            {
             before(grammarAccess.getGraphicClassAccess().getRightCurlyBracketKeyword_6()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGraphicClassAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__GraphicClass__Group__6__Impl"


    // $ANTLR start "rule__GraphicClass__Group__7"
    // InternalArg.g:4470:1: rule__GraphicClass__Group__7 : rule__GraphicClass__Group__7__Impl rule__GraphicClass__Group__8 ;
    public final void rule__GraphicClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4474:1: ( rule__GraphicClass__Group__7__Impl rule__GraphicClass__Group__8 )
            // InternalArg.g:4475:2: rule__GraphicClass__Group__7__Impl rule__GraphicClass__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__GraphicClass__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicClass__Group__8();

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
    // $ANTLR end "rule__GraphicClass__Group__7"


    // $ANTLR start "rule__GraphicClass__Group__7__Impl"
    // InternalArg.g:4482:1: rule__GraphicClass__Group__7__Impl : ( 'constraints' ) ;
    public final void rule__GraphicClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4486:1: ( ( 'constraints' ) )
            // InternalArg.g:4487:1: ( 'constraints' )
            {
            // InternalArg.g:4487:1: ( 'constraints' )
            // InternalArg.g:4488:2: 'constraints'
            {
             before(grammarAccess.getGraphicClassAccess().getConstraintsKeyword_7()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getGraphicClassAccess().getConstraintsKeyword_7()); 

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
    // $ANTLR end "rule__GraphicClass__Group__7__Impl"


    // $ANTLR start "rule__GraphicClass__Group__8"
    // InternalArg.g:4497:1: rule__GraphicClass__Group__8 : rule__GraphicClass__Group__8__Impl rule__GraphicClass__Group__9 ;
    public final void rule__GraphicClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4501:1: ( rule__GraphicClass__Group__8__Impl rule__GraphicClass__Group__9 )
            // InternalArg.g:4502:2: rule__GraphicClass__Group__8__Impl rule__GraphicClass__Group__9
            {
            pushFollow(FOLLOW_38);
            rule__GraphicClass__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicClass__Group__9();

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
    // $ANTLR end "rule__GraphicClass__Group__8"


    // $ANTLR start "rule__GraphicClass__Group__8__Impl"
    // InternalArg.g:4509:1: rule__GraphicClass__Group__8__Impl : ( '{' ) ;
    public final void rule__GraphicClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4513:1: ( ( '{' ) )
            // InternalArg.g:4514:1: ( '{' )
            {
            // InternalArg.g:4514:1: ( '{' )
            // InternalArg.g:4515:2: '{'
            {
             before(grammarAccess.getGraphicClassAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGraphicClassAccess().getLeftCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__GraphicClass__Group__8__Impl"


    // $ANTLR start "rule__GraphicClass__Group__9"
    // InternalArg.g:4524:1: rule__GraphicClass__Group__9 : rule__GraphicClass__Group__9__Impl rule__GraphicClass__Group__10 ;
    public final void rule__GraphicClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4528:1: ( rule__GraphicClass__Group__9__Impl rule__GraphicClass__Group__10 )
            // InternalArg.g:4529:2: rule__GraphicClass__Group__9__Impl rule__GraphicClass__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__GraphicClass__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicClass__Group__10();

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
    // $ANTLR end "rule__GraphicClass__Group__9"


    // $ANTLR start "rule__GraphicClass__Group__9__Impl"
    // InternalArg.g:4536:1: rule__GraphicClass__Group__9__Impl : ( ( rule__GraphicClass__ConstraintsAssignment_9 ) ) ;
    public final void rule__GraphicClass__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4540:1: ( ( ( rule__GraphicClass__ConstraintsAssignment_9 ) ) )
            // InternalArg.g:4541:1: ( ( rule__GraphicClass__ConstraintsAssignment_9 ) )
            {
            // InternalArg.g:4541:1: ( ( rule__GraphicClass__ConstraintsAssignment_9 ) )
            // InternalArg.g:4542:2: ( rule__GraphicClass__ConstraintsAssignment_9 )
            {
             before(grammarAccess.getGraphicClassAccess().getConstraintsAssignment_9()); 
            // InternalArg.g:4543:2: ( rule__GraphicClass__ConstraintsAssignment_9 )
            // InternalArg.g:4543:3: rule__GraphicClass__ConstraintsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__GraphicClass__ConstraintsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getGraphicClassAccess().getConstraintsAssignment_9()); 

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
    // $ANTLR end "rule__GraphicClass__Group__9__Impl"


    // $ANTLR start "rule__GraphicClass__Group__10"
    // InternalArg.g:4551:1: rule__GraphicClass__Group__10 : rule__GraphicClass__Group__10__Impl ;
    public final void rule__GraphicClass__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4555:1: ( rule__GraphicClass__Group__10__Impl )
            // InternalArg.g:4556:2: rule__GraphicClass__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicClass__Group__10__Impl();

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
    // $ANTLR end "rule__GraphicClass__Group__10"


    // $ANTLR start "rule__GraphicClass__Group__10__Impl"
    // InternalArg.g:4562:1: rule__GraphicClass__Group__10__Impl : ( '}' ) ;
    public final void rule__GraphicClass__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4566:1: ( ( '}' ) )
            // InternalArg.g:4567:1: ( '}' )
            {
            // InternalArg.g:4567:1: ( '}' )
            // InternalArg.g:4568:2: '}'
            {
             before(grammarAccess.getGraphicClassAccess().getRightCurlyBracketKeyword_10()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGraphicClassAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__GraphicClass__Group__10__Impl"


    // $ANTLR start "rule__Constraints__Group__0"
    // InternalArg.g:4578:1: rule__Constraints__Group__0 : rule__Constraints__Group__0__Impl rule__Constraints__Group__1 ;
    public final void rule__Constraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4582:1: ( rule__Constraints__Group__0__Impl rule__Constraints__Group__1 )
            // InternalArg.g:4583:2: rule__Constraints__Group__0__Impl rule__Constraints__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Constraints__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__1();

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
    // $ANTLR end "rule__Constraints__Group__0"


    // $ANTLR start "rule__Constraints__Group__0__Impl"
    // InternalArg.g:4590:1: rule__Constraints__Group__0__Impl : ( 'plane' ) ;
    public final void rule__Constraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4594:1: ( ( 'plane' ) )
            // InternalArg.g:4595:1: ( 'plane' )
            {
            // InternalArg.g:4595:1: ( 'plane' )
            // InternalArg.g:4596:2: 'plane'
            {
             before(grammarAccess.getConstraintsAccess().getPlaneKeyword_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getConstraintsAccess().getPlaneKeyword_0()); 

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
    // $ANTLR end "rule__Constraints__Group__0__Impl"


    // $ANTLR start "rule__Constraints__Group__1"
    // InternalArg.g:4605:1: rule__Constraints__Group__1 : rule__Constraints__Group__1__Impl rule__Constraints__Group__2 ;
    public final void rule__Constraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4609:1: ( rule__Constraints__Group__1__Impl rule__Constraints__Group__2 )
            // InternalArg.g:4610:2: rule__Constraints__Group__1__Impl rule__Constraints__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__Constraints__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__2();

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
    // $ANTLR end "rule__Constraints__Group__1"


    // $ANTLR start "rule__Constraints__Group__1__Impl"
    // InternalArg.g:4617:1: rule__Constraints__Group__1__Impl : ( ( rule__Constraints__PlanesAssignment_1 ) ) ;
    public final void rule__Constraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4621:1: ( ( ( rule__Constraints__PlanesAssignment_1 ) ) )
            // InternalArg.g:4622:1: ( ( rule__Constraints__PlanesAssignment_1 ) )
            {
            // InternalArg.g:4622:1: ( ( rule__Constraints__PlanesAssignment_1 ) )
            // InternalArg.g:4623:2: ( rule__Constraints__PlanesAssignment_1 )
            {
             before(grammarAccess.getConstraintsAccess().getPlanesAssignment_1()); 
            // InternalArg.g:4624:2: ( rule__Constraints__PlanesAssignment_1 )
            // InternalArg.g:4624:3: rule__Constraints__PlanesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__PlanesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getPlanesAssignment_1()); 

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
    // $ANTLR end "rule__Constraints__Group__1__Impl"


    // $ANTLR start "rule__Constraints__Group__2"
    // InternalArg.g:4632:1: rule__Constraints__Group__2 : rule__Constraints__Group__2__Impl rule__Constraints__Group__3 ;
    public final void rule__Constraints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4636:1: ( rule__Constraints__Group__2__Impl rule__Constraints__Group__3 )
            // InternalArg.g:4637:2: rule__Constraints__Group__2__Impl rule__Constraints__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Constraints__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__3();

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
    // $ANTLR end "rule__Constraints__Group__2"


    // $ANTLR start "rule__Constraints__Group__2__Impl"
    // InternalArg.g:4644:1: rule__Constraints__Group__2__Impl : ( ( rule__Constraints__OverlappingAssignment_2 ) ) ;
    public final void rule__Constraints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4648:1: ( ( ( rule__Constraints__OverlappingAssignment_2 ) ) )
            // InternalArg.g:4649:1: ( ( rule__Constraints__OverlappingAssignment_2 ) )
            {
            // InternalArg.g:4649:1: ( ( rule__Constraints__OverlappingAssignment_2 ) )
            // InternalArg.g:4650:2: ( rule__Constraints__OverlappingAssignment_2 )
            {
             before(grammarAccess.getConstraintsAccess().getOverlappingAssignment_2()); 
            // InternalArg.g:4651:2: ( rule__Constraints__OverlappingAssignment_2 )
            // InternalArg.g:4651:3: rule__Constraints__OverlappingAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__OverlappingAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getOverlappingAssignment_2()); 

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
    // $ANTLR end "rule__Constraints__Group__2__Impl"


    // $ANTLR start "rule__Constraints__Group__3"
    // InternalArg.g:4659:1: rule__Constraints__Group__3 : rule__Constraints__Group__3__Impl rule__Constraints__Group__4 ;
    public final void rule__Constraints__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4663:1: ( rule__Constraints__Group__3__Impl rule__Constraints__Group__4 )
            // InternalArg.g:4664:2: rule__Constraints__Group__3__Impl rule__Constraints__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__Constraints__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__4();

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
    // $ANTLR end "rule__Constraints__Group__3"


    // $ANTLR start "rule__Constraints__Group__3__Impl"
    // InternalArg.g:4671:1: rule__Constraints__Group__3__Impl : ( 'sizeMin' ) ;
    public final void rule__Constraints__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4675:1: ( ( 'sizeMin' ) )
            // InternalArg.g:4676:1: ( 'sizeMin' )
            {
            // InternalArg.g:4676:1: ( 'sizeMin' )
            // InternalArg.g:4677:2: 'sizeMin'
            {
             before(grammarAccess.getConstraintsAccess().getSizeMinKeyword_3()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getConstraintsAccess().getSizeMinKeyword_3()); 

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
    // $ANTLR end "rule__Constraints__Group__3__Impl"


    // $ANTLR start "rule__Constraints__Group__4"
    // InternalArg.g:4686:1: rule__Constraints__Group__4 : rule__Constraints__Group__4__Impl rule__Constraints__Group__5 ;
    public final void rule__Constraints__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4690:1: ( rule__Constraints__Group__4__Impl rule__Constraints__Group__5 )
            // InternalArg.g:4691:2: rule__Constraints__Group__4__Impl rule__Constraints__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__Constraints__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__5();

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
    // $ANTLR end "rule__Constraints__Group__4"


    // $ANTLR start "rule__Constraints__Group__4__Impl"
    // InternalArg.g:4698:1: rule__Constraints__Group__4__Impl : ( ( rule__Constraints__SizeMinAssignment_4 ) ) ;
    public final void rule__Constraints__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4702:1: ( ( ( rule__Constraints__SizeMinAssignment_4 ) ) )
            // InternalArg.g:4703:1: ( ( rule__Constraints__SizeMinAssignment_4 ) )
            {
            // InternalArg.g:4703:1: ( ( rule__Constraints__SizeMinAssignment_4 ) )
            // InternalArg.g:4704:2: ( rule__Constraints__SizeMinAssignment_4 )
            {
             before(grammarAccess.getConstraintsAccess().getSizeMinAssignment_4()); 
            // InternalArg.g:4705:2: ( rule__Constraints__SizeMinAssignment_4 )
            // InternalArg.g:4705:3: rule__Constraints__SizeMinAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__SizeMinAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getSizeMinAssignment_4()); 

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
    // $ANTLR end "rule__Constraints__Group__4__Impl"


    // $ANTLR start "rule__Constraints__Group__5"
    // InternalArg.g:4713:1: rule__Constraints__Group__5 : rule__Constraints__Group__5__Impl rule__Constraints__Group__6 ;
    public final void rule__Constraints__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4717:1: ( rule__Constraints__Group__5__Impl rule__Constraints__Group__6 )
            // InternalArg.g:4718:2: rule__Constraints__Group__5__Impl rule__Constraints__Group__6
            {
            pushFollow(FOLLOW_42);
            rule__Constraints__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__6();

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
    // $ANTLR end "rule__Constraints__Group__5"


    // $ANTLR start "rule__Constraints__Group__5__Impl"
    // InternalArg.g:4725:1: rule__Constraints__Group__5__Impl : ( 'sizeMax' ) ;
    public final void rule__Constraints__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4729:1: ( ( 'sizeMax' ) )
            // InternalArg.g:4730:1: ( 'sizeMax' )
            {
            // InternalArg.g:4730:1: ( 'sizeMax' )
            // InternalArg.g:4731:2: 'sizeMax'
            {
             before(grammarAccess.getConstraintsAccess().getSizeMaxKeyword_5()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getConstraintsAccess().getSizeMaxKeyword_5()); 

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
    // $ANTLR end "rule__Constraints__Group__5__Impl"


    // $ANTLR start "rule__Constraints__Group__6"
    // InternalArg.g:4740:1: rule__Constraints__Group__6 : rule__Constraints__Group__6__Impl rule__Constraints__Group__7 ;
    public final void rule__Constraints__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4744:1: ( rule__Constraints__Group__6__Impl rule__Constraints__Group__7 )
            // InternalArg.g:4745:2: rule__Constraints__Group__6__Impl rule__Constraints__Group__7
            {
            pushFollow(FOLLOW_44);
            rule__Constraints__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__7();

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
    // $ANTLR end "rule__Constraints__Group__6"


    // $ANTLR start "rule__Constraints__Group__6__Impl"
    // InternalArg.g:4752:1: rule__Constraints__Group__6__Impl : ( ( rule__Constraints__SizeMaxAssignment_6 ) ) ;
    public final void rule__Constraints__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4756:1: ( ( ( rule__Constraints__SizeMaxAssignment_6 ) ) )
            // InternalArg.g:4757:1: ( ( rule__Constraints__SizeMaxAssignment_6 ) )
            {
            // InternalArg.g:4757:1: ( ( rule__Constraints__SizeMaxAssignment_6 ) )
            // InternalArg.g:4758:2: ( rule__Constraints__SizeMaxAssignment_6 )
            {
             before(grammarAccess.getConstraintsAccess().getSizeMaxAssignment_6()); 
            // InternalArg.g:4759:2: ( rule__Constraints__SizeMaxAssignment_6 )
            // InternalArg.g:4759:3: rule__Constraints__SizeMaxAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__SizeMaxAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getSizeMaxAssignment_6()); 

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
    // $ANTLR end "rule__Constraints__Group__6__Impl"


    // $ANTLR start "rule__Constraints__Group__7"
    // InternalArg.g:4767:1: rule__Constraints__Group__7 : rule__Constraints__Group__7__Impl rule__Constraints__Group__8 ;
    public final void rule__Constraints__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4771:1: ( rule__Constraints__Group__7__Impl rule__Constraints__Group__8 )
            // InternalArg.g:4772:2: rule__Constraints__Group__7__Impl rule__Constraints__Group__8
            {
            pushFollow(FOLLOW_42);
            rule__Constraints__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__8();

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
    // $ANTLR end "rule__Constraints__Group__7"


    // $ANTLR start "rule__Constraints__Group__7__Impl"
    // InternalArg.g:4779:1: rule__Constraints__Group__7__Impl : ( 'xVariation' ) ;
    public final void rule__Constraints__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4783:1: ( ( 'xVariation' ) )
            // InternalArg.g:4784:1: ( 'xVariation' )
            {
            // InternalArg.g:4784:1: ( 'xVariation' )
            // InternalArg.g:4785:2: 'xVariation'
            {
             before(grammarAccess.getConstraintsAccess().getXVariationKeyword_7()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getConstraintsAccess().getXVariationKeyword_7()); 

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
    // $ANTLR end "rule__Constraints__Group__7__Impl"


    // $ANTLR start "rule__Constraints__Group__8"
    // InternalArg.g:4794:1: rule__Constraints__Group__8 : rule__Constraints__Group__8__Impl rule__Constraints__Group__9 ;
    public final void rule__Constraints__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4798:1: ( rule__Constraints__Group__8__Impl rule__Constraints__Group__9 )
            // InternalArg.g:4799:2: rule__Constraints__Group__8__Impl rule__Constraints__Group__9
            {
            pushFollow(FOLLOW_45);
            rule__Constraints__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__9();

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
    // $ANTLR end "rule__Constraints__Group__8"


    // $ANTLR start "rule__Constraints__Group__8__Impl"
    // InternalArg.g:4806:1: rule__Constraints__Group__8__Impl : ( ( rule__Constraints__XToOriginPosAssignment_8 ) ) ;
    public final void rule__Constraints__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4810:1: ( ( ( rule__Constraints__XToOriginPosAssignment_8 ) ) )
            // InternalArg.g:4811:1: ( ( rule__Constraints__XToOriginPosAssignment_8 ) )
            {
            // InternalArg.g:4811:1: ( ( rule__Constraints__XToOriginPosAssignment_8 ) )
            // InternalArg.g:4812:2: ( rule__Constraints__XToOriginPosAssignment_8 )
            {
             before(grammarAccess.getConstraintsAccess().getXToOriginPosAssignment_8()); 
            // InternalArg.g:4813:2: ( rule__Constraints__XToOriginPosAssignment_8 )
            // InternalArg.g:4813:3: rule__Constraints__XToOriginPosAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__XToOriginPosAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getXToOriginPosAssignment_8()); 

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
    // $ANTLR end "rule__Constraints__Group__8__Impl"


    // $ANTLR start "rule__Constraints__Group__9"
    // InternalArg.g:4821:1: rule__Constraints__Group__9 : rule__Constraints__Group__9__Impl rule__Constraints__Group__10 ;
    public final void rule__Constraints__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4825:1: ( rule__Constraints__Group__9__Impl rule__Constraints__Group__10 )
            // InternalArg.g:4826:2: rule__Constraints__Group__9__Impl rule__Constraints__Group__10
            {
            pushFollow(FOLLOW_42);
            rule__Constraints__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__10();

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
    // $ANTLR end "rule__Constraints__Group__9"


    // $ANTLR start "rule__Constraints__Group__9__Impl"
    // InternalArg.g:4833:1: rule__Constraints__Group__9__Impl : ( 'yVariation' ) ;
    public final void rule__Constraints__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4837:1: ( ( 'yVariation' ) )
            // InternalArg.g:4838:1: ( 'yVariation' )
            {
            // InternalArg.g:4838:1: ( 'yVariation' )
            // InternalArg.g:4839:2: 'yVariation'
            {
             before(grammarAccess.getConstraintsAccess().getYVariationKeyword_9()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getConstraintsAccess().getYVariationKeyword_9()); 

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
    // $ANTLR end "rule__Constraints__Group__9__Impl"


    // $ANTLR start "rule__Constraints__Group__10"
    // InternalArg.g:4848:1: rule__Constraints__Group__10 : rule__Constraints__Group__10__Impl rule__Constraints__Group__11 ;
    public final void rule__Constraints__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4852:1: ( rule__Constraints__Group__10__Impl rule__Constraints__Group__11 )
            // InternalArg.g:4853:2: rule__Constraints__Group__10__Impl rule__Constraints__Group__11
            {
            pushFollow(FOLLOW_46);
            rule__Constraints__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__11();

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
    // $ANTLR end "rule__Constraints__Group__10"


    // $ANTLR start "rule__Constraints__Group__10__Impl"
    // InternalArg.g:4860:1: rule__Constraints__Group__10__Impl : ( ( rule__Constraints__YToOriginPosAssignment_10 ) ) ;
    public final void rule__Constraints__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4864:1: ( ( ( rule__Constraints__YToOriginPosAssignment_10 ) ) )
            // InternalArg.g:4865:1: ( ( rule__Constraints__YToOriginPosAssignment_10 ) )
            {
            // InternalArg.g:4865:1: ( ( rule__Constraints__YToOriginPosAssignment_10 ) )
            // InternalArg.g:4866:2: ( rule__Constraints__YToOriginPosAssignment_10 )
            {
             before(grammarAccess.getConstraintsAccess().getYToOriginPosAssignment_10()); 
            // InternalArg.g:4867:2: ( rule__Constraints__YToOriginPosAssignment_10 )
            // InternalArg.g:4867:3: rule__Constraints__YToOriginPosAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__YToOriginPosAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getYToOriginPosAssignment_10()); 

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
    // $ANTLR end "rule__Constraints__Group__10__Impl"


    // $ANTLR start "rule__Constraints__Group__11"
    // InternalArg.g:4875:1: rule__Constraints__Group__11 : rule__Constraints__Group__11__Impl rule__Constraints__Group__12 ;
    public final void rule__Constraints__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4879:1: ( rule__Constraints__Group__11__Impl rule__Constraints__Group__12 )
            // InternalArg.g:4880:2: rule__Constraints__Group__11__Impl rule__Constraints__Group__12
            {
            pushFollow(FOLLOW_42);
            rule__Constraints__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__12();

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
    // $ANTLR end "rule__Constraints__Group__11"


    // $ANTLR start "rule__Constraints__Group__11__Impl"
    // InternalArg.g:4887:1: rule__Constraints__Group__11__Impl : ( 'zVariation' ) ;
    public final void rule__Constraints__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4891:1: ( ( 'zVariation' ) )
            // InternalArg.g:4892:1: ( 'zVariation' )
            {
            // InternalArg.g:4892:1: ( 'zVariation' )
            // InternalArg.g:4893:2: 'zVariation'
            {
             before(grammarAccess.getConstraintsAccess().getZVariationKeyword_11()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getConstraintsAccess().getZVariationKeyword_11()); 

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
    // $ANTLR end "rule__Constraints__Group__11__Impl"


    // $ANTLR start "rule__Constraints__Group__12"
    // InternalArg.g:4902:1: rule__Constraints__Group__12 : rule__Constraints__Group__12__Impl rule__Constraints__Group__13 ;
    public final void rule__Constraints__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4906:1: ( rule__Constraints__Group__12__Impl rule__Constraints__Group__13 )
            // InternalArg.g:4907:2: rule__Constraints__Group__12__Impl rule__Constraints__Group__13
            {
            pushFollow(FOLLOW_47);
            rule__Constraints__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__13();

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
    // $ANTLR end "rule__Constraints__Group__12"


    // $ANTLR start "rule__Constraints__Group__12__Impl"
    // InternalArg.g:4914:1: rule__Constraints__Group__12__Impl : ( ( rule__Constraints__ZToOriginPosAssignment_12 ) ) ;
    public final void rule__Constraints__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4918:1: ( ( ( rule__Constraints__ZToOriginPosAssignment_12 ) ) )
            // InternalArg.g:4919:1: ( ( rule__Constraints__ZToOriginPosAssignment_12 ) )
            {
            // InternalArg.g:4919:1: ( ( rule__Constraints__ZToOriginPosAssignment_12 ) )
            // InternalArg.g:4920:2: ( rule__Constraints__ZToOriginPosAssignment_12 )
            {
             before(grammarAccess.getConstraintsAccess().getZToOriginPosAssignment_12()); 
            // InternalArg.g:4921:2: ( rule__Constraints__ZToOriginPosAssignment_12 )
            // InternalArg.g:4921:3: rule__Constraints__ZToOriginPosAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__ZToOriginPosAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getZToOriginPosAssignment_12()); 

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
    // $ANTLR end "rule__Constraints__Group__12__Impl"


    // $ANTLR start "rule__Constraints__Group__13"
    // InternalArg.g:4929:1: rule__Constraints__Group__13 : rule__Constraints__Group__13__Impl rule__Constraints__Group__14 ;
    public final void rule__Constraints__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4933:1: ( rule__Constraints__Group__13__Impl rule__Constraints__Group__14 )
            // InternalArg.g:4934:2: rule__Constraints__Group__13__Impl rule__Constraints__Group__14
            {
            pushFollow(FOLLOW_25);
            rule__Constraints__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__14();

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
    // $ANTLR end "rule__Constraints__Group__13"


    // $ANTLR start "rule__Constraints__Group__13__Impl"
    // InternalArg.g:4941:1: rule__Constraints__Group__13__Impl : ( 'rotation' ) ;
    public final void rule__Constraints__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4945:1: ( ( 'rotation' ) )
            // InternalArg.g:4946:1: ( 'rotation' )
            {
            // InternalArg.g:4946:1: ( 'rotation' )
            // InternalArg.g:4947:2: 'rotation'
            {
             before(grammarAccess.getConstraintsAccess().getRotationKeyword_13()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getConstraintsAccess().getRotationKeyword_13()); 

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
    // $ANTLR end "rule__Constraints__Group__13__Impl"


    // $ANTLR start "rule__Constraints__Group__14"
    // InternalArg.g:4956:1: rule__Constraints__Group__14 : rule__Constraints__Group__14__Impl ;
    public final void rule__Constraints__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4960:1: ( rule__Constraints__Group__14__Impl )
            // InternalArg.g:4961:2: rule__Constraints__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__Group__14__Impl();

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
    // $ANTLR end "rule__Constraints__Group__14"


    // $ANTLR start "rule__Constraints__Group__14__Impl"
    // InternalArg.g:4967:1: rule__Constraints__Group__14__Impl : ( ( rule__Constraints__RotationAssignment_14 ) ) ;
    public final void rule__Constraints__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4971:1: ( ( ( rule__Constraints__RotationAssignment_14 ) ) )
            // InternalArg.g:4972:1: ( ( rule__Constraints__RotationAssignment_14 ) )
            {
            // InternalArg.g:4972:1: ( ( rule__Constraints__RotationAssignment_14 ) )
            // InternalArg.g:4973:2: ( rule__Constraints__RotationAssignment_14 )
            {
             before(grammarAccess.getConstraintsAccess().getRotationAssignment_14()); 
            // InternalArg.g:4974:2: ( rule__Constraints__RotationAssignment_14 )
            // InternalArg.g:4974:3: rule__Constraints__RotationAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__RotationAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getRotationAssignment_14()); 

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
    // $ANTLR end "rule__Constraints__Group__14__Impl"


    // $ANTLR start "rule__Versions__Group__0"
    // InternalArg.g:4983:1: rule__Versions__Group__0 : rule__Versions__Group__0__Impl rule__Versions__Group__1 ;
    public final void rule__Versions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4987:1: ( rule__Versions__Group__0__Impl rule__Versions__Group__1 )
            // InternalArg.g:4988:2: rule__Versions__Group__0__Impl rule__Versions__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Versions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Versions__Group__1();

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
    // $ANTLR end "rule__Versions__Group__0"


    // $ANTLR start "rule__Versions__Group__0__Impl"
    // InternalArg.g:4995:1: rule__Versions__Group__0__Impl : ( ( rule__Versions__NameAssignment_0 ) ) ;
    public final void rule__Versions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:4999:1: ( ( ( rule__Versions__NameAssignment_0 ) ) )
            // InternalArg.g:5000:1: ( ( rule__Versions__NameAssignment_0 ) )
            {
            // InternalArg.g:5000:1: ( ( rule__Versions__NameAssignment_0 ) )
            // InternalArg.g:5001:2: ( rule__Versions__NameAssignment_0 )
            {
             before(grammarAccess.getVersionsAccess().getNameAssignment_0()); 
            // InternalArg.g:5002:2: ( rule__Versions__NameAssignment_0 )
            // InternalArg.g:5002:3: rule__Versions__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Versions__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVersionsAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Versions__Group__0__Impl"


    // $ANTLR start "rule__Versions__Group__1"
    // InternalArg.g:5010:1: rule__Versions__Group__1 : rule__Versions__Group__1__Impl rule__Versions__Group__2 ;
    public final void rule__Versions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5014:1: ( rule__Versions__Group__1__Impl rule__Versions__Group__2 )
            // InternalArg.g:5015:2: rule__Versions__Group__1__Impl rule__Versions__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Versions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Versions__Group__2();

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
    // $ANTLR end "rule__Versions__Group__1"


    // $ANTLR start "rule__Versions__Group__1__Impl"
    // InternalArg.g:5022:1: rule__Versions__Group__1__Impl : ( '=' ) ;
    public final void rule__Versions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5026:1: ( ( '=' ) )
            // InternalArg.g:5027:1: ( '=' )
            {
            // InternalArg.g:5027:1: ( '=' )
            // InternalArg.g:5028:2: '='
            {
             before(grammarAccess.getVersionsAccess().getEqualsSignKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVersionsAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Versions__Group__1__Impl"


    // $ANTLR start "rule__Versions__Group__2"
    // InternalArg.g:5037:1: rule__Versions__Group__2 : rule__Versions__Group__2__Impl ;
    public final void rule__Versions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5041:1: ( rule__Versions__Group__2__Impl )
            // InternalArg.g:5042:2: rule__Versions__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Versions__Group__2__Impl();

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
    // $ANTLR end "rule__Versions__Group__2"


    // $ANTLR start "rule__Versions__Group__2__Impl"
    // InternalArg.g:5048:1: rule__Versions__Group__2__Impl : ( ( rule__Versions__URLAssignment_2 ) ) ;
    public final void rule__Versions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5052:1: ( ( ( rule__Versions__URLAssignment_2 ) ) )
            // InternalArg.g:5053:1: ( ( rule__Versions__URLAssignment_2 ) )
            {
            // InternalArg.g:5053:1: ( ( rule__Versions__URLAssignment_2 ) )
            // InternalArg.g:5054:2: ( rule__Versions__URLAssignment_2 )
            {
             before(grammarAccess.getVersionsAccess().getURLAssignment_2()); 
            // InternalArg.g:5055:2: ( rule__Versions__URLAssignment_2 )
            // InternalArg.g:5055:3: rule__Versions__URLAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Versions__URLAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVersionsAccess().getURLAssignment_2()); 

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
    // $ANTLR end "rule__Versions__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalArg.g:5064:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5068:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalArg.g:5069:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

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
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalArg.g:5076:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5080:1: ( ( ( '-' )? ) )
            // InternalArg.g:5081:1: ( ( '-' )? )
            {
            // InternalArg.g:5081:1: ( ( '-' )? )
            // InternalArg.g:5082:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalArg.g:5083:2: ( '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==65) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalArg.g:5083:3: '-'
                    {
                    match(input,65,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalArg.g:5091:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5095:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalArg.g:5096:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

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
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalArg.g:5103:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5107:1: ( ( ( RULE_INT )? ) )
            // InternalArg.g:5108:1: ( ( RULE_INT )? )
            {
            // InternalArg.g:5108:1: ( ( RULE_INT )? )
            // InternalArg.g:5109:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalArg.g:5110:2: ( RULE_INT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalArg.g:5110:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalArg.g:5118:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5122:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalArg.g:5123:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

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
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalArg.g:5130:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5134:1: ( ( '.' ) )
            // InternalArg.g:5135:1: ( '.' )
            {
            // InternalArg.g:5135:1: ( '.' )
            // InternalArg.g:5136:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalArg.g:5145:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5149:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalArg.g:5150:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

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
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalArg.g:5157:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5161:1: ( ( RULE_INT ) )
            // InternalArg.g:5162:1: ( RULE_INT )
            {
            // InternalArg.g:5162:1: ( RULE_INT )
            // InternalArg.g:5163:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalArg.g:5172:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5176:1: ( rule__EDouble__Group__4__Impl )
            // InternalArg.g:5177:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

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
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalArg.g:5183:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5187:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalArg.g:5188:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalArg.g:5188:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalArg.g:5189:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalArg.g:5190:2: ( rule__EDouble__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=12 && LA42_0<=13)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalArg.g:5190:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalArg.g:5199:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5203:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalArg.g:5204:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_25);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

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
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalArg.g:5211:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5215:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalArg.g:5216:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalArg.g:5216:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalArg.g:5217:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalArg.g:5218:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalArg.g:5218:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalArg.g:5226:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5230:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalArg.g:5231:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_25);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

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
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalArg.g:5238:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5242:1: ( ( ( '-' )? ) )
            // InternalArg.g:5243:1: ( ( '-' )? )
            {
            // InternalArg.g:5243:1: ( ( '-' )? )
            // InternalArg.g:5244:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalArg.g:5245:2: ( '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==65) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalArg.g:5245:3: '-'
                    {
                    match(input,65,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalArg.g:5253:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5257:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalArg.g:5258:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

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
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalArg.g:5264:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5268:1: ( ( RULE_INT ) )
            // InternalArg.g:5269:1: ( RULE_INT )
            {
            // InternalArg.g:5269:1: ( RULE_INT )
            // InternalArg.g:5270:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__PhysicClass__Group__0"
    // InternalArg.g:5280:1: rule__PhysicClass__Group__0 : rule__PhysicClass__Group__0__Impl rule__PhysicClass__Group__1 ;
    public final void rule__PhysicClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5284:1: ( rule__PhysicClass__Group__0__Impl rule__PhysicClass__Group__1 )
            // InternalArg.g:5285:2: rule__PhysicClass__Group__0__Impl rule__PhysicClass__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PhysicClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group__1();

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
    // $ANTLR end "rule__PhysicClass__Group__0"


    // $ANTLR start "rule__PhysicClass__Group__0__Impl"
    // InternalArg.g:5292:1: rule__PhysicClass__Group__0__Impl : ( 'element' ) ;
    public final void rule__PhysicClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5296:1: ( ( 'element' ) )
            // InternalArg.g:5297:1: ( 'element' )
            {
            // InternalArg.g:5297:1: ( 'element' )
            // InternalArg.g:5298:2: 'element'
            {
             before(grammarAccess.getPhysicClassAccess().getElementKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getPhysicClassAccess().getElementKeyword_0()); 

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
    // $ANTLR end "rule__PhysicClass__Group__0__Impl"


    // $ANTLR start "rule__PhysicClass__Group__1"
    // InternalArg.g:5307:1: rule__PhysicClass__Group__1 : rule__PhysicClass__Group__1__Impl rule__PhysicClass__Group__2 ;
    public final void rule__PhysicClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5311:1: ( rule__PhysicClass__Group__1__Impl rule__PhysicClass__Group__2 )
            // InternalArg.g:5312:2: rule__PhysicClass__Group__1__Impl rule__PhysicClass__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__PhysicClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group__2();

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
    // $ANTLR end "rule__PhysicClass__Group__1"


    // $ANTLR start "rule__PhysicClass__Group__1__Impl"
    // InternalArg.g:5319:1: rule__PhysicClass__Group__1__Impl : ( ( rule__PhysicClass__OntoClassAssignment_1 ) ) ;
    public final void rule__PhysicClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5323:1: ( ( ( rule__PhysicClass__OntoClassAssignment_1 ) ) )
            // InternalArg.g:5324:1: ( ( rule__PhysicClass__OntoClassAssignment_1 ) )
            {
            // InternalArg.g:5324:1: ( ( rule__PhysicClass__OntoClassAssignment_1 ) )
            // InternalArg.g:5325:2: ( rule__PhysicClass__OntoClassAssignment_1 )
            {
             before(grammarAccess.getPhysicClassAccess().getOntoClassAssignment_1()); 
            // InternalArg.g:5326:2: ( rule__PhysicClass__OntoClassAssignment_1 )
            // InternalArg.g:5326:3: rule__PhysicClass__OntoClassAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicClass__OntoClassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicClassAccess().getOntoClassAssignment_1()); 

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
    // $ANTLR end "rule__PhysicClass__Group__1__Impl"


    // $ANTLR start "rule__PhysicClass__Group__2"
    // InternalArg.g:5334:1: rule__PhysicClass__Group__2 : rule__PhysicClass__Group__2__Impl rule__PhysicClass__Group__3 ;
    public final void rule__PhysicClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5338:1: ( rule__PhysicClass__Group__2__Impl rule__PhysicClass__Group__3 )
            // InternalArg.g:5339:2: rule__PhysicClass__Group__2__Impl rule__PhysicClass__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__PhysicClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group__3();

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
    // $ANTLR end "rule__PhysicClass__Group__2"


    // $ANTLR start "rule__PhysicClass__Group__2__Impl"
    // InternalArg.g:5346:1: rule__PhysicClass__Group__2__Impl : ( 'body' ) ;
    public final void rule__PhysicClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5350:1: ( ( 'body' ) )
            // InternalArg.g:5351:1: ( 'body' )
            {
            // InternalArg.g:5351:1: ( 'body' )
            // InternalArg.g:5352:2: 'body'
            {
             before(grammarAccess.getPhysicClassAccess().getBodyKeyword_2()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getPhysicClassAccess().getBodyKeyword_2()); 

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
    // $ANTLR end "rule__PhysicClass__Group__2__Impl"


    // $ANTLR start "rule__PhysicClass__Group__3"
    // InternalArg.g:5361:1: rule__PhysicClass__Group__3 : rule__PhysicClass__Group__3__Impl rule__PhysicClass__Group__4 ;
    public final void rule__PhysicClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5365:1: ( rule__PhysicClass__Group__3__Impl rule__PhysicClass__Group__4 )
            // InternalArg.g:5366:2: rule__PhysicClass__Group__3__Impl rule__PhysicClass__Group__4
            {
            pushFollow(FOLLOW_51);
            rule__PhysicClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group__4();

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
    // $ANTLR end "rule__PhysicClass__Group__3"


    // $ANTLR start "rule__PhysicClass__Group__3__Impl"
    // InternalArg.g:5373:1: rule__PhysicClass__Group__3__Impl : ( '{' ) ;
    public final void rule__PhysicClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5377:1: ( ( '{' ) )
            // InternalArg.g:5378:1: ( '{' )
            {
            // InternalArg.g:5378:1: ( '{' )
            // InternalArg.g:5379:2: '{'
            {
             before(grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__PhysicClass__Group__3__Impl"


    // $ANTLR start "rule__PhysicClass__Group__4"
    // InternalArg.g:5388:1: rule__PhysicClass__Group__4 : rule__PhysicClass__Group__4__Impl rule__PhysicClass__Group__5 ;
    public final void rule__PhysicClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5392:1: ( rule__PhysicClass__Group__4__Impl rule__PhysicClass__Group__5 )
            // InternalArg.g:5393:2: rule__PhysicClass__Group__4__Impl rule__PhysicClass__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__PhysicClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group__5();

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
    // $ANTLR end "rule__PhysicClass__Group__4"


    // $ANTLR start "rule__PhysicClass__Group__4__Impl"
    // InternalArg.g:5400:1: rule__PhysicClass__Group__4__Impl : ( ( rule__PhysicClass__PhysicBodyAssignment_4 ) ) ;
    public final void rule__PhysicClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5404:1: ( ( ( rule__PhysicClass__PhysicBodyAssignment_4 ) ) )
            // InternalArg.g:5405:1: ( ( rule__PhysicClass__PhysicBodyAssignment_4 ) )
            {
            // InternalArg.g:5405:1: ( ( rule__PhysicClass__PhysicBodyAssignment_4 ) )
            // InternalArg.g:5406:2: ( rule__PhysicClass__PhysicBodyAssignment_4 )
            {
             before(grammarAccess.getPhysicClassAccess().getPhysicBodyAssignment_4()); 
            // InternalArg.g:5407:2: ( rule__PhysicClass__PhysicBodyAssignment_4 )
            // InternalArg.g:5407:3: rule__PhysicClass__PhysicBodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PhysicClass__PhysicBodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPhysicClassAccess().getPhysicBodyAssignment_4()); 

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
    // $ANTLR end "rule__PhysicClass__Group__4__Impl"


    // $ANTLR start "rule__PhysicClass__Group__5"
    // InternalArg.g:5415:1: rule__PhysicClass__Group__5 : rule__PhysicClass__Group__5__Impl rule__PhysicClass__Group__6 ;
    public final void rule__PhysicClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5419:1: ( rule__PhysicClass__Group__5__Impl rule__PhysicClass__Group__6 )
            // InternalArg.g:5420:2: rule__PhysicClass__Group__5__Impl rule__PhysicClass__Group__6
            {
            pushFollow(FOLLOW_52);
            rule__PhysicClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group__6();

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
    // $ANTLR end "rule__PhysicClass__Group__5"


    // $ANTLR start "rule__PhysicClass__Group__5__Impl"
    // InternalArg.g:5427:1: rule__PhysicClass__Group__5__Impl : ( '}' ) ;
    public final void rule__PhysicClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5431:1: ( ( '}' ) )
            // InternalArg.g:5432:1: ( '}' )
            {
            // InternalArg.g:5432:1: ( '}' )
            // InternalArg.g:5433:2: '}'
            {
             before(grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__PhysicClass__Group__5__Impl"


    // $ANTLR start "rule__PhysicClass__Group__6"
    // InternalArg.g:5442:1: rule__PhysicClass__Group__6 : rule__PhysicClass__Group__6__Impl rule__PhysicClass__Group__7 ;
    public final void rule__PhysicClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5446:1: ( rule__PhysicClass__Group__6__Impl rule__PhysicClass__Group__7 )
            // InternalArg.g:5447:2: rule__PhysicClass__Group__6__Impl rule__PhysicClass__Group__7
            {
            pushFollow(FOLLOW_52);
            rule__PhysicClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group__7();

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
    // $ANTLR end "rule__PhysicClass__Group__6"


    // $ANTLR start "rule__PhysicClass__Group__6__Impl"
    // InternalArg.g:5454:1: rule__PhysicClass__Group__6__Impl : ( ( rule__PhysicClass__Group_6__0 )? ) ;
    public final void rule__PhysicClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5458:1: ( ( ( rule__PhysicClass__Group_6__0 )? ) )
            // InternalArg.g:5459:1: ( ( rule__PhysicClass__Group_6__0 )? )
            {
            // InternalArg.g:5459:1: ( ( rule__PhysicClass__Group_6__0 )? )
            // InternalArg.g:5460:2: ( rule__PhysicClass__Group_6__0 )?
            {
             before(grammarAccess.getPhysicClassAccess().getGroup_6()); 
            // InternalArg.g:5461:2: ( rule__PhysicClass__Group_6__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==78) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalArg.g:5461:3: rule__PhysicClass__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhysicClass__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhysicClassAccess().getGroup_6()); 

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
    // $ANTLR end "rule__PhysicClass__Group__6__Impl"


    // $ANTLR start "rule__PhysicClass__Group__7"
    // InternalArg.g:5469:1: rule__PhysicClass__Group__7 : rule__PhysicClass__Group__7__Impl ;
    public final void rule__PhysicClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5473:1: ( rule__PhysicClass__Group__7__Impl )
            // InternalArg.g:5474:2: rule__PhysicClass__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group__7__Impl();

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
    // $ANTLR end "rule__PhysicClass__Group__7"


    // $ANTLR start "rule__PhysicClass__Group__7__Impl"
    // InternalArg.g:5480:1: rule__PhysicClass__Group__7__Impl : ( ( rule__PhysicClass__Group_7__0 )? ) ;
    public final void rule__PhysicClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5484:1: ( ( ( rule__PhysicClass__Group_7__0 )? ) )
            // InternalArg.g:5485:1: ( ( rule__PhysicClass__Group_7__0 )? )
            {
            // InternalArg.g:5485:1: ( ( rule__PhysicClass__Group_7__0 )? )
            // InternalArg.g:5486:2: ( rule__PhysicClass__Group_7__0 )?
            {
             before(grammarAccess.getPhysicClassAccess().getGroup_7()); 
            // InternalArg.g:5487:2: ( rule__PhysicClass__Group_7__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==79) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalArg.g:5487:3: rule__PhysicClass__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhysicClass__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhysicClassAccess().getGroup_7()); 

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
    // $ANTLR end "rule__PhysicClass__Group__7__Impl"


    // $ANTLR start "rule__PhysicClass__Group_6__0"
    // InternalArg.g:5496:1: rule__PhysicClass__Group_6__0 : rule__PhysicClass__Group_6__0__Impl rule__PhysicClass__Group_6__1 ;
    public final void rule__PhysicClass__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5500:1: ( rule__PhysicClass__Group_6__0__Impl rule__PhysicClass__Group_6__1 )
            // InternalArg.g:5501:2: rule__PhysicClass__Group_6__0__Impl rule__PhysicClass__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__PhysicClass__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group_6__1();

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
    // $ANTLR end "rule__PhysicClass__Group_6__0"


    // $ANTLR start "rule__PhysicClass__Group_6__0__Impl"
    // InternalArg.g:5508:1: rule__PhysicClass__Group_6__0__Impl : ( 'forces' ) ;
    public final void rule__PhysicClass__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5512:1: ( ( 'forces' ) )
            // InternalArg.g:5513:1: ( 'forces' )
            {
            // InternalArg.g:5513:1: ( 'forces' )
            // InternalArg.g:5514:2: 'forces'
            {
             before(grammarAccess.getPhysicClassAccess().getForcesKeyword_6_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getPhysicClassAccess().getForcesKeyword_6_0()); 

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
    // $ANTLR end "rule__PhysicClass__Group_6__0__Impl"


    // $ANTLR start "rule__PhysicClass__Group_6__1"
    // InternalArg.g:5523:1: rule__PhysicClass__Group_6__1 : rule__PhysicClass__Group_6__1__Impl rule__PhysicClass__Group_6__2 ;
    public final void rule__PhysicClass__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5527:1: ( rule__PhysicClass__Group_6__1__Impl rule__PhysicClass__Group_6__2 )
            // InternalArg.g:5528:2: rule__PhysicClass__Group_6__1__Impl rule__PhysicClass__Group_6__2
            {
            pushFollow(FOLLOW_3);
            rule__PhysicClass__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group_6__2();

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
    // $ANTLR end "rule__PhysicClass__Group_6__1"


    // $ANTLR start "rule__PhysicClass__Group_6__1__Impl"
    // InternalArg.g:5535:1: rule__PhysicClass__Group_6__1__Impl : ( '{' ) ;
    public final void rule__PhysicClass__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5539:1: ( ( '{' ) )
            // InternalArg.g:5540:1: ( '{' )
            {
            // InternalArg.g:5540:1: ( '{' )
            // InternalArg.g:5541:2: '{'
            {
             before(grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__PhysicClass__Group_6__1__Impl"


    // $ANTLR start "rule__PhysicClass__Group_6__2"
    // InternalArg.g:5550:1: rule__PhysicClass__Group_6__2 : rule__PhysicClass__Group_6__2__Impl rule__PhysicClass__Group_6__3 ;
    public final void rule__PhysicClass__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5554:1: ( rule__PhysicClass__Group_6__2__Impl rule__PhysicClass__Group_6__3 )
            // InternalArg.g:5555:2: rule__PhysicClass__Group_6__2__Impl rule__PhysicClass__Group_6__3
            {
            pushFollow(FOLLOW_6);
            rule__PhysicClass__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group_6__3();

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
    // $ANTLR end "rule__PhysicClass__Group_6__2"


    // $ANTLR start "rule__PhysicClass__Group_6__2__Impl"
    // InternalArg.g:5562:1: rule__PhysicClass__Group_6__2__Impl : ( ( rule__PhysicClass__ForcesAssignment_6_2 ) ) ;
    public final void rule__PhysicClass__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5566:1: ( ( ( rule__PhysicClass__ForcesAssignment_6_2 ) ) )
            // InternalArg.g:5567:1: ( ( rule__PhysicClass__ForcesAssignment_6_2 ) )
            {
            // InternalArg.g:5567:1: ( ( rule__PhysicClass__ForcesAssignment_6_2 ) )
            // InternalArg.g:5568:2: ( rule__PhysicClass__ForcesAssignment_6_2 )
            {
             before(grammarAccess.getPhysicClassAccess().getForcesAssignment_6_2()); 
            // InternalArg.g:5569:2: ( rule__PhysicClass__ForcesAssignment_6_2 )
            // InternalArg.g:5569:3: rule__PhysicClass__ForcesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__PhysicClass__ForcesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getPhysicClassAccess().getForcesAssignment_6_2()); 

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
    // $ANTLR end "rule__PhysicClass__Group_6__2__Impl"


    // $ANTLR start "rule__PhysicClass__Group_6__3"
    // InternalArg.g:5577:1: rule__PhysicClass__Group_6__3 : rule__PhysicClass__Group_6__3__Impl rule__PhysicClass__Group_6__4 ;
    public final void rule__PhysicClass__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5581:1: ( rule__PhysicClass__Group_6__3__Impl rule__PhysicClass__Group_6__4 )
            // InternalArg.g:5582:2: rule__PhysicClass__Group_6__3__Impl rule__PhysicClass__Group_6__4
            {
            pushFollow(FOLLOW_6);
            rule__PhysicClass__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group_6__4();

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
    // $ANTLR end "rule__PhysicClass__Group_6__3"


    // $ANTLR start "rule__PhysicClass__Group_6__3__Impl"
    // InternalArg.g:5589:1: rule__PhysicClass__Group_6__3__Impl : ( ( rule__PhysicClass__ForcesAssignment_6_3 )* ) ;
    public final void rule__PhysicClass__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5593:1: ( ( ( rule__PhysicClass__ForcesAssignment_6_3 )* ) )
            // InternalArg.g:5594:1: ( ( rule__PhysicClass__ForcesAssignment_6_3 )* )
            {
            // InternalArg.g:5594:1: ( ( rule__PhysicClass__ForcesAssignment_6_3 )* )
            // InternalArg.g:5595:2: ( rule__PhysicClass__ForcesAssignment_6_3 )*
            {
             before(grammarAccess.getPhysicClassAccess().getForcesAssignment_6_3()); 
            // InternalArg.g:5596:2: ( rule__PhysicClass__ForcesAssignment_6_3 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_ID)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalArg.g:5596:3: rule__PhysicClass__ForcesAssignment_6_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PhysicClass__ForcesAssignment_6_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getPhysicClassAccess().getForcesAssignment_6_3()); 

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
    // $ANTLR end "rule__PhysicClass__Group_6__3__Impl"


    // $ANTLR start "rule__PhysicClass__Group_6__4"
    // InternalArg.g:5604:1: rule__PhysicClass__Group_6__4 : rule__PhysicClass__Group_6__4__Impl ;
    public final void rule__PhysicClass__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5608:1: ( rule__PhysicClass__Group_6__4__Impl )
            // InternalArg.g:5609:2: rule__PhysicClass__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group_6__4__Impl();

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
    // $ANTLR end "rule__PhysicClass__Group_6__4"


    // $ANTLR start "rule__PhysicClass__Group_6__4__Impl"
    // InternalArg.g:5615:1: rule__PhysicClass__Group_6__4__Impl : ( '}' ) ;
    public final void rule__PhysicClass__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5619:1: ( ( '}' ) )
            // InternalArg.g:5620:1: ( '}' )
            {
            // InternalArg.g:5620:1: ( '}' )
            // InternalArg.g:5621:2: '}'
            {
             before(grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__PhysicClass__Group_6__4__Impl"


    // $ANTLR start "rule__PhysicClass__Group_7__0"
    // InternalArg.g:5631:1: rule__PhysicClass__Group_7__0 : rule__PhysicClass__Group_7__0__Impl rule__PhysicClass__Group_7__1 ;
    public final void rule__PhysicClass__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5635:1: ( rule__PhysicClass__Group_7__0__Impl rule__PhysicClass__Group_7__1 )
            // InternalArg.g:5636:2: rule__PhysicClass__Group_7__0__Impl rule__PhysicClass__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__PhysicClass__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group_7__1();

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
    // $ANTLR end "rule__PhysicClass__Group_7__0"


    // $ANTLR start "rule__PhysicClass__Group_7__0__Impl"
    // InternalArg.g:5643:1: rule__PhysicClass__Group_7__0__Impl : ( 'contacts' ) ;
    public final void rule__PhysicClass__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5647:1: ( ( 'contacts' ) )
            // InternalArg.g:5648:1: ( 'contacts' )
            {
            // InternalArg.g:5648:1: ( 'contacts' )
            // InternalArg.g:5649:2: 'contacts'
            {
             before(grammarAccess.getPhysicClassAccess().getContactsKeyword_7_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getPhysicClassAccess().getContactsKeyword_7_0()); 

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
    // $ANTLR end "rule__PhysicClass__Group_7__0__Impl"


    // $ANTLR start "rule__PhysicClass__Group_7__1"
    // InternalArg.g:5658:1: rule__PhysicClass__Group_7__1 : rule__PhysicClass__Group_7__1__Impl rule__PhysicClass__Group_7__2 ;
    public final void rule__PhysicClass__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5662:1: ( rule__PhysicClass__Group_7__1__Impl rule__PhysicClass__Group_7__2 )
            // InternalArg.g:5663:2: rule__PhysicClass__Group_7__1__Impl rule__PhysicClass__Group_7__2
            {
            pushFollow(FOLLOW_53);
            rule__PhysicClass__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group_7__2();

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
    // $ANTLR end "rule__PhysicClass__Group_7__1"


    // $ANTLR start "rule__PhysicClass__Group_7__1__Impl"
    // InternalArg.g:5670:1: rule__PhysicClass__Group_7__1__Impl : ( '{' ) ;
    public final void rule__PhysicClass__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5674:1: ( ( '{' ) )
            // InternalArg.g:5675:1: ( '{' )
            {
            // InternalArg.g:5675:1: ( '{' )
            // InternalArg.g:5676:2: '{'
            {
             before(grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__PhysicClass__Group_7__1__Impl"


    // $ANTLR start "rule__PhysicClass__Group_7__2"
    // InternalArg.g:5685:1: rule__PhysicClass__Group_7__2 : rule__PhysicClass__Group_7__2__Impl rule__PhysicClass__Group_7__3 ;
    public final void rule__PhysicClass__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5689:1: ( rule__PhysicClass__Group_7__2__Impl rule__PhysicClass__Group_7__3 )
            // InternalArg.g:5690:2: rule__PhysicClass__Group_7__2__Impl rule__PhysicClass__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__PhysicClass__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group_7__3();

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
    // $ANTLR end "rule__PhysicClass__Group_7__2"


    // $ANTLR start "rule__PhysicClass__Group_7__2__Impl"
    // InternalArg.g:5697:1: rule__PhysicClass__Group_7__2__Impl : ( ( rule__PhysicClass__BitMasksAssignment_7_2 ) ) ;
    public final void rule__PhysicClass__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5701:1: ( ( ( rule__PhysicClass__BitMasksAssignment_7_2 ) ) )
            // InternalArg.g:5702:1: ( ( rule__PhysicClass__BitMasksAssignment_7_2 ) )
            {
            // InternalArg.g:5702:1: ( ( rule__PhysicClass__BitMasksAssignment_7_2 ) )
            // InternalArg.g:5703:2: ( rule__PhysicClass__BitMasksAssignment_7_2 )
            {
             before(grammarAccess.getPhysicClassAccess().getBitMasksAssignment_7_2()); 
            // InternalArg.g:5704:2: ( rule__PhysicClass__BitMasksAssignment_7_2 )
            // InternalArg.g:5704:3: rule__PhysicClass__BitMasksAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__PhysicClass__BitMasksAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getPhysicClassAccess().getBitMasksAssignment_7_2()); 

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
    // $ANTLR end "rule__PhysicClass__Group_7__2__Impl"


    // $ANTLR start "rule__PhysicClass__Group_7__3"
    // InternalArg.g:5712:1: rule__PhysicClass__Group_7__3 : rule__PhysicClass__Group_7__3__Impl ;
    public final void rule__PhysicClass__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5716:1: ( rule__PhysicClass__Group_7__3__Impl )
            // InternalArg.g:5717:2: rule__PhysicClass__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group_7__3__Impl();

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
    // $ANTLR end "rule__PhysicClass__Group_7__3"


    // $ANTLR start "rule__PhysicClass__Group_7__3__Impl"
    // InternalArg.g:5723:1: rule__PhysicClass__Group_7__3__Impl : ( '}' ) ;
    public final void rule__PhysicClass__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5727:1: ( ( '}' ) )
            // InternalArg.g:5728:1: ( '}' )
            {
            // InternalArg.g:5728:1: ( '}' )
            // InternalArg.g:5729:2: '}'
            {
             before(grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_7_3()); 

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
    // $ANTLR end "rule__PhysicClass__Group_7__3__Impl"


    // $ANTLR start "rule__PhysicBody__Group__0"
    // InternalArg.g:5739:1: rule__PhysicBody__Group__0 : rule__PhysicBody__Group__0__Impl rule__PhysicBody__Group__1 ;
    public final void rule__PhysicBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5743:1: ( rule__PhysicBody__Group__0__Impl rule__PhysicBody__Group__1 )
            // InternalArg.g:5744:2: rule__PhysicBody__Group__0__Impl rule__PhysicBody__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__PhysicBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicBody__Group__1();

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
    // $ANTLR end "rule__PhysicBody__Group__0"


    // $ANTLR start "rule__PhysicBody__Group__0__Impl"
    // InternalArg.g:5751:1: rule__PhysicBody__Group__0__Impl : ( 'mass' ) ;
    public final void rule__PhysicBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5755:1: ( ( 'mass' ) )
            // InternalArg.g:5756:1: ( 'mass' )
            {
            // InternalArg.g:5756:1: ( 'mass' )
            // InternalArg.g:5757:2: 'mass'
            {
             before(grammarAccess.getPhysicBodyAccess().getMassKeyword_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getPhysicBodyAccess().getMassKeyword_0()); 

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
    // $ANTLR end "rule__PhysicBody__Group__0__Impl"


    // $ANTLR start "rule__PhysicBody__Group__1"
    // InternalArg.g:5766:1: rule__PhysicBody__Group__1 : rule__PhysicBody__Group__1__Impl rule__PhysicBody__Group__2 ;
    public final void rule__PhysicBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5770:1: ( rule__PhysicBody__Group__1__Impl rule__PhysicBody__Group__2 )
            // InternalArg.g:5771:2: rule__PhysicBody__Group__1__Impl rule__PhysicBody__Group__2
            {
            pushFollow(FOLLOW_54);
            rule__PhysicBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicBody__Group__2();

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
    // $ANTLR end "rule__PhysicBody__Group__1"


    // $ANTLR start "rule__PhysicBody__Group__1__Impl"
    // InternalArg.g:5778:1: rule__PhysicBody__Group__1__Impl : ( ( rule__PhysicBody__MassAssignment_1 ) ) ;
    public final void rule__PhysicBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5782:1: ( ( ( rule__PhysicBody__MassAssignment_1 ) ) )
            // InternalArg.g:5783:1: ( ( rule__PhysicBody__MassAssignment_1 ) )
            {
            // InternalArg.g:5783:1: ( ( rule__PhysicBody__MassAssignment_1 ) )
            // InternalArg.g:5784:2: ( rule__PhysicBody__MassAssignment_1 )
            {
             before(grammarAccess.getPhysicBodyAccess().getMassAssignment_1()); 
            // InternalArg.g:5785:2: ( rule__PhysicBody__MassAssignment_1 )
            // InternalArg.g:5785:3: rule__PhysicBody__MassAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicBody__MassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicBodyAccess().getMassAssignment_1()); 

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
    // $ANTLR end "rule__PhysicBody__Group__1__Impl"


    // $ANTLR start "rule__PhysicBody__Group__2"
    // InternalArg.g:5793:1: rule__PhysicBody__Group__2 : rule__PhysicBody__Group__2__Impl rule__PhysicBody__Group__3 ;
    public final void rule__PhysicBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5797:1: ( rule__PhysicBody__Group__2__Impl rule__PhysicBody__Group__3 )
            // InternalArg.g:5798:2: rule__PhysicBody__Group__2__Impl rule__PhysicBody__Group__3
            {
            pushFollow(FOLLOW_55);
            rule__PhysicBody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicBody__Group__3();

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
    // $ANTLR end "rule__PhysicBody__Group__2"


    // $ANTLR start "rule__PhysicBody__Group__2__Impl"
    // InternalArg.g:5805:1: rule__PhysicBody__Group__2__Impl : ( 'bodyType' ) ;
    public final void rule__PhysicBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5809:1: ( ( 'bodyType' ) )
            // InternalArg.g:5810:1: ( 'bodyType' )
            {
            // InternalArg.g:5810:1: ( 'bodyType' )
            // InternalArg.g:5811:2: 'bodyType'
            {
             before(grammarAccess.getPhysicBodyAccess().getBodyTypeKeyword_2()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getPhysicBodyAccess().getBodyTypeKeyword_2()); 

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
    // $ANTLR end "rule__PhysicBody__Group__2__Impl"


    // $ANTLR start "rule__PhysicBody__Group__3"
    // InternalArg.g:5820:1: rule__PhysicBody__Group__3 : rule__PhysicBody__Group__3__Impl rule__PhysicBody__Group__4 ;
    public final void rule__PhysicBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5824:1: ( rule__PhysicBody__Group__3__Impl rule__PhysicBody__Group__4 )
            // InternalArg.g:5825:2: rule__PhysicBody__Group__3__Impl rule__PhysicBody__Group__4
            {
            pushFollow(FOLLOW_56);
            rule__PhysicBody__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicBody__Group__4();

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
    // $ANTLR end "rule__PhysicBody__Group__3"


    // $ANTLR start "rule__PhysicBody__Group__3__Impl"
    // InternalArg.g:5832:1: rule__PhysicBody__Group__3__Impl : ( ( rule__PhysicBody__BodyTypeAssignment_3 ) ) ;
    public final void rule__PhysicBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5836:1: ( ( ( rule__PhysicBody__BodyTypeAssignment_3 ) ) )
            // InternalArg.g:5837:1: ( ( rule__PhysicBody__BodyTypeAssignment_3 ) )
            {
            // InternalArg.g:5837:1: ( ( rule__PhysicBody__BodyTypeAssignment_3 ) )
            // InternalArg.g:5838:2: ( rule__PhysicBody__BodyTypeAssignment_3 )
            {
             before(grammarAccess.getPhysicBodyAccess().getBodyTypeAssignment_3()); 
            // InternalArg.g:5839:2: ( rule__PhysicBody__BodyTypeAssignment_3 )
            // InternalArg.g:5839:3: rule__PhysicBody__BodyTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PhysicBody__BodyTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPhysicBodyAccess().getBodyTypeAssignment_3()); 

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
    // $ANTLR end "rule__PhysicBody__Group__3__Impl"


    // $ANTLR start "rule__PhysicBody__Group__4"
    // InternalArg.g:5847:1: rule__PhysicBody__Group__4 : rule__PhysicBody__Group__4__Impl rule__PhysicBody__Group__5 ;
    public final void rule__PhysicBody__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5851:1: ( rule__PhysicBody__Group__4__Impl rule__PhysicBody__Group__5 )
            // InternalArg.g:5852:2: rule__PhysicBody__Group__4__Impl rule__PhysicBody__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__PhysicBody__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicBody__Group__5();

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
    // $ANTLR end "rule__PhysicBody__Group__4"


    // $ANTLR start "rule__PhysicBody__Group__4__Impl"
    // InternalArg.g:5859:1: rule__PhysicBody__Group__4__Impl : ( 'charge' ) ;
    public final void rule__PhysicBody__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5863:1: ( ( 'charge' ) )
            // InternalArg.g:5864:1: ( 'charge' )
            {
            // InternalArg.g:5864:1: ( 'charge' )
            // InternalArg.g:5865:2: 'charge'
            {
             before(grammarAccess.getPhysicBodyAccess().getChargeKeyword_4()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getPhysicBodyAccess().getChargeKeyword_4()); 

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
    // $ANTLR end "rule__PhysicBody__Group__4__Impl"


    // $ANTLR start "rule__PhysicBody__Group__5"
    // InternalArg.g:5874:1: rule__PhysicBody__Group__5 : rule__PhysicBody__Group__5__Impl rule__PhysicBody__Group__6 ;
    public final void rule__PhysicBody__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5878:1: ( rule__PhysicBody__Group__5__Impl rule__PhysicBody__Group__6 )
            // InternalArg.g:5879:2: rule__PhysicBody__Group__5__Impl rule__PhysicBody__Group__6
            {
            pushFollow(FOLLOW_57);
            rule__PhysicBody__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicBody__Group__6();

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
    // $ANTLR end "rule__PhysicBody__Group__5"


    // $ANTLR start "rule__PhysicBody__Group__5__Impl"
    // InternalArg.g:5886:1: rule__PhysicBody__Group__5__Impl : ( ( rule__PhysicBody__ChargeAssignment_5 ) ) ;
    public final void rule__PhysicBody__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5890:1: ( ( ( rule__PhysicBody__ChargeAssignment_5 ) ) )
            // InternalArg.g:5891:1: ( ( rule__PhysicBody__ChargeAssignment_5 ) )
            {
            // InternalArg.g:5891:1: ( ( rule__PhysicBody__ChargeAssignment_5 ) )
            // InternalArg.g:5892:2: ( rule__PhysicBody__ChargeAssignment_5 )
            {
             before(grammarAccess.getPhysicBodyAccess().getChargeAssignment_5()); 
            // InternalArg.g:5893:2: ( rule__PhysicBody__ChargeAssignment_5 )
            // InternalArg.g:5893:3: rule__PhysicBody__ChargeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PhysicBody__ChargeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPhysicBodyAccess().getChargeAssignment_5()); 

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
    // $ANTLR end "rule__PhysicBody__Group__5__Impl"


    // $ANTLR start "rule__PhysicBody__Group__6"
    // InternalArg.g:5901:1: rule__PhysicBody__Group__6 : rule__PhysicBody__Group__6__Impl rule__PhysicBody__Group__7 ;
    public final void rule__PhysicBody__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5905:1: ( rule__PhysicBody__Group__6__Impl rule__PhysicBody__Group__7 )
            // InternalArg.g:5906:2: rule__PhysicBody__Group__6__Impl rule__PhysicBody__Group__7
            {
            pushFollow(FOLLOW_42);
            rule__PhysicBody__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicBody__Group__7();

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
    // $ANTLR end "rule__PhysicBody__Group__6"


    // $ANTLR start "rule__PhysicBody__Group__6__Impl"
    // InternalArg.g:5913:1: rule__PhysicBody__Group__6__Impl : ( 'friction' ) ;
    public final void rule__PhysicBody__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5917:1: ( ( 'friction' ) )
            // InternalArg.g:5918:1: ( 'friction' )
            {
            // InternalArg.g:5918:1: ( 'friction' )
            // InternalArg.g:5919:2: 'friction'
            {
             before(grammarAccess.getPhysicBodyAccess().getFrictionKeyword_6()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getPhysicBodyAccess().getFrictionKeyword_6()); 

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
    // $ANTLR end "rule__PhysicBody__Group__6__Impl"


    // $ANTLR start "rule__PhysicBody__Group__7"
    // InternalArg.g:5928:1: rule__PhysicBody__Group__7 : rule__PhysicBody__Group__7__Impl rule__PhysicBody__Group__8 ;
    public final void rule__PhysicBody__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5932:1: ( rule__PhysicBody__Group__7__Impl rule__PhysicBody__Group__8 )
            // InternalArg.g:5933:2: rule__PhysicBody__Group__7__Impl rule__PhysicBody__Group__8
            {
            pushFollow(FOLLOW_58);
            rule__PhysicBody__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicBody__Group__8();

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
    // $ANTLR end "rule__PhysicBody__Group__7"


    // $ANTLR start "rule__PhysicBody__Group__7__Impl"
    // InternalArg.g:5940:1: rule__PhysicBody__Group__7__Impl : ( ( rule__PhysicBody__FrictionAssignment_7 ) ) ;
    public final void rule__PhysicBody__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5944:1: ( ( ( rule__PhysicBody__FrictionAssignment_7 ) ) )
            // InternalArg.g:5945:1: ( ( rule__PhysicBody__FrictionAssignment_7 ) )
            {
            // InternalArg.g:5945:1: ( ( rule__PhysicBody__FrictionAssignment_7 ) )
            // InternalArg.g:5946:2: ( rule__PhysicBody__FrictionAssignment_7 )
            {
             before(grammarAccess.getPhysicBodyAccess().getFrictionAssignment_7()); 
            // InternalArg.g:5947:2: ( rule__PhysicBody__FrictionAssignment_7 )
            // InternalArg.g:5947:3: rule__PhysicBody__FrictionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__PhysicBody__FrictionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPhysicBodyAccess().getFrictionAssignment_7()); 

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
    // $ANTLR end "rule__PhysicBody__Group__7__Impl"


    // $ANTLR start "rule__PhysicBody__Group__8"
    // InternalArg.g:5955:1: rule__PhysicBody__Group__8 : rule__PhysicBody__Group__8__Impl rule__PhysicBody__Group__9 ;
    public final void rule__PhysicBody__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5959:1: ( rule__PhysicBody__Group__8__Impl rule__PhysicBody__Group__9 )
            // InternalArg.g:5960:2: rule__PhysicBody__Group__8__Impl rule__PhysicBody__Group__9
            {
            pushFollow(FOLLOW_42);
            rule__PhysicBody__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicBody__Group__9();

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
    // $ANTLR end "rule__PhysicBody__Group__8"


    // $ANTLR start "rule__PhysicBody__Group__8__Impl"
    // InternalArg.g:5967:1: rule__PhysicBody__Group__8__Impl : ( 'rollingFriction' ) ;
    public final void rule__PhysicBody__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5971:1: ( ( 'rollingFriction' ) )
            // InternalArg.g:5972:1: ( 'rollingFriction' )
            {
            // InternalArg.g:5972:1: ( 'rollingFriction' )
            // InternalArg.g:5973:2: 'rollingFriction'
            {
             before(grammarAccess.getPhysicBodyAccess().getRollingFrictionKeyword_8()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getPhysicBodyAccess().getRollingFrictionKeyword_8()); 

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
    // $ANTLR end "rule__PhysicBody__Group__8__Impl"


    // $ANTLR start "rule__PhysicBody__Group__9"
    // InternalArg.g:5982:1: rule__PhysicBody__Group__9 : rule__PhysicBody__Group__9__Impl rule__PhysicBody__Group__10 ;
    public final void rule__PhysicBody__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5986:1: ( rule__PhysicBody__Group__9__Impl rule__PhysicBody__Group__10 )
            // InternalArg.g:5987:2: rule__PhysicBody__Group__9__Impl rule__PhysicBody__Group__10
            {
            pushFollow(FOLLOW_59);
            rule__PhysicBody__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicBody__Group__10();

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
    // $ANTLR end "rule__PhysicBody__Group__9"


    // $ANTLR start "rule__PhysicBody__Group__9__Impl"
    // InternalArg.g:5994:1: rule__PhysicBody__Group__9__Impl : ( ( rule__PhysicBody__RollingFrictionAssignment_9 ) ) ;
    public final void rule__PhysicBody__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:5998:1: ( ( ( rule__PhysicBody__RollingFrictionAssignment_9 ) ) )
            // InternalArg.g:5999:1: ( ( rule__PhysicBody__RollingFrictionAssignment_9 ) )
            {
            // InternalArg.g:5999:1: ( ( rule__PhysicBody__RollingFrictionAssignment_9 ) )
            // InternalArg.g:6000:2: ( rule__PhysicBody__RollingFrictionAssignment_9 )
            {
             before(grammarAccess.getPhysicBodyAccess().getRollingFrictionAssignment_9()); 
            // InternalArg.g:6001:2: ( rule__PhysicBody__RollingFrictionAssignment_9 )
            // InternalArg.g:6001:3: rule__PhysicBody__RollingFrictionAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__PhysicBody__RollingFrictionAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPhysicBodyAccess().getRollingFrictionAssignment_9()); 

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
    // $ANTLR end "rule__PhysicBody__Group__9__Impl"


    // $ANTLR start "rule__PhysicBody__Group__10"
    // InternalArg.g:6009:1: rule__PhysicBody__Group__10 : rule__PhysicBody__Group__10__Impl rule__PhysicBody__Group__11 ;
    public final void rule__PhysicBody__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6013:1: ( rule__PhysicBody__Group__10__Impl rule__PhysicBody__Group__11 )
            // InternalArg.g:6014:2: rule__PhysicBody__Group__10__Impl rule__PhysicBody__Group__11
            {
            pushFollow(FOLLOW_42);
            rule__PhysicBody__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicBody__Group__11();

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
    // $ANTLR end "rule__PhysicBody__Group__10"


    // $ANTLR start "rule__PhysicBody__Group__10__Impl"
    // InternalArg.g:6021:1: rule__PhysicBody__Group__10__Impl : ( 'restitution' ) ;
    public final void rule__PhysicBody__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6025:1: ( ( 'restitution' ) )
            // InternalArg.g:6026:1: ( 'restitution' )
            {
            // InternalArg.g:6026:1: ( 'restitution' )
            // InternalArg.g:6027:2: 'restitution'
            {
             before(grammarAccess.getPhysicBodyAccess().getRestitutionKeyword_10()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getPhysicBodyAccess().getRestitutionKeyword_10()); 

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
    // $ANTLR end "rule__PhysicBody__Group__10__Impl"


    // $ANTLR start "rule__PhysicBody__Group__11"
    // InternalArg.g:6036:1: rule__PhysicBody__Group__11 : rule__PhysicBody__Group__11__Impl rule__PhysicBody__Group__12 ;
    public final void rule__PhysicBody__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6040:1: ( rule__PhysicBody__Group__11__Impl rule__PhysicBody__Group__12 )
            // InternalArg.g:6041:2: rule__PhysicBody__Group__11__Impl rule__PhysicBody__Group__12
            {
            pushFollow(FOLLOW_60);
            rule__PhysicBody__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicBody__Group__12();

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
    // $ANTLR end "rule__PhysicBody__Group__11"


    // $ANTLR start "rule__PhysicBody__Group__11__Impl"
    // InternalArg.g:6048:1: rule__PhysicBody__Group__11__Impl : ( ( rule__PhysicBody__RestitutionAssignment_11 ) ) ;
    public final void rule__PhysicBody__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6052:1: ( ( ( rule__PhysicBody__RestitutionAssignment_11 ) ) )
            // InternalArg.g:6053:1: ( ( rule__PhysicBody__RestitutionAssignment_11 ) )
            {
            // InternalArg.g:6053:1: ( ( rule__PhysicBody__RestitutionAssignment_11 ) )
            // InternalArg.g:6054:2: ( rule__PhysicBody__RestitutionAssignment_11 )
            {
             before(grammarAccess.getPhysicBodyAccess().getRestitutionAssignment_11()); 
            // InternalArg.g:6055:2: ( rule__PhysicBody__RestitutionAssignment_11 )
            // InternalArg.g:6055:3: rule__PhysicBody__RestitutionAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__PhysicBody__RestitutionAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getPhysicBodyAccess().getRestitutionAssignment_11()); 

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
    // $ANTLR end "rule__PhysicBody__Group__11__Impl"


    // $ANTLR start "rule__PhysicBody__Group__12"
    // InternalArg.g:6063:1: rule__PhysicBody__Group__12 : rule__PhysicBody__Group__12__Impl rule__PhysicBody__Group__13 ;
    public final void rule__PhysicBody__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6067:1: ( rule__PhysicBody__Group__12__Impl rule__PhysicBody__Group__13 )
            // InternalArg.g:6068:2: rule__PhysicBody__Group__12__Impl rule__PhysicBody__Group__13
            {
            pushFollow(FOLLOW_42);
            rule__PhysicBody__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicBody__Group__13();

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
    // $ANTLR end "rule__PhysicBody__Group__12"


    // $ANTLR start "rule__PhysicBody__Group__12__Impl"
    // InternalArg.g:6075:1: rule__PhysicBody__Group__12__Impl : ( 'damping' ) ;
    public final void rule__PhysicBody__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6079:1: ( ( 'damping' ) )
            // InternalArg.g:6080:1: ( 'damping' )
            {
            // InternalArg.g:6080:1: ( 'damping' )
            // InternalArg.g:6081:2: 'damping'
            {
             before(grammarAccess.getPhysicBodyAccess().getDampingKeyword_12()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getPhysicBodyAccess().getDampingKeyword_12()); 

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
    // $ANTLR end "rule__PhysicBody__Group__12__Impl"


    // $ANTLR start "rule__PhysicBody__Group__13"
    // InternalArg.g:6090:1: rule__PhysicBody__Group__13 : rule__PhysicBody__Group__13__Impl rule__PhysicBody__Group__14 ;
    public final void rule__PhysicBody__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6094:1: ( rule__PhysicBody__Group__13__Impl rule__PhysicBody__Group__14 )
            // InternalArg.g:6095:2: rule__PhysicBody__Group__13__Impl rule__PhysicBody__Group__14
            {
            pushFollow(FOLLOW_61);
            rule__PhysicBody__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicBody__Group__14();

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
    // $ANTLR end "rule__PhysicBody__Group__13"


    // $ANTLR start "rule__PhysicBody__Group__13__Impl"
    // InternalArg.g:6102:1: rule__PhysicBody__Group__13__Impl : ( ( rule__PhysicBody__DampingAssignment_13 ) ) ;
    public final void rule__PhysicBody__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6106:1: ( ( ( rule__PhysicBody__DampingAssignment_13 ) ) )
            // InternalArg.g:6107:1: ( ( rule__PhysicBody__DampingAssignment_13 ) )
            {
            // InternalArg.g:6107:1: ( ( rule__PhysicBody__DampingAssignment_13 ) )
            // InternalArg.g:6108:2: ( rule__PhysicBody__DampingAssignment_13 )
            {
             before(grammarAccess.getPhysicBodyAccess().getDampingAssignment_13()); 
            // InternalArg.g:6109:2: ( rule__PhysicBody__DampingAssignment_13 )
            // InternalArg.g:6109:3: rule__PhysicBody__DampingAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__PhysicBody__DampingAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getPhysicBodyAccess().getDampingAssignment_13()); 

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
    // $ANTLR end "rule__PhysicBody__Group__13__Impl"


    // $ANTLR start "rule__PhysicBody__Group__14"
    // InternalArg.g:6117:1: rule__PhysicBody__Group__14 : rule__PhysicBody__Group__14__Impl rule__PhysicBody__Group__15 ;
    public final void rule__PhysicBody__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6121:1: ( rule__PhysicBody__Group__14__Impl rule__PhysicBody__Group__15 )
            // InternalArg.g:6122:2: rule__PhysicBody__Group__14__Impl rule__PhysicBody__Group__15
            {
            pushFollow(FOLLOW_42);
            rule__PhysicBody__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicBody__Group__15();

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
    // $ANTLR end "rule__PhysicBody__Group__14"


    // $ANTLR start "rule__PhysicBody__Group__14__Impl"
    // InternalArg.g:6129:1: rule__PhysicBody__Group__14__Impl : ( 'angularDamping' ) ;
    public final void rule__PhysicBody__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6133:1: ( ( 'angularDamping' ) )
            // InternalArg.g:6134:1: ( 'angularDamping' )
            {
            // InternalArg.g:6134:1: ( 'angularDamping' )
            // InternalArg.g:6135:2: 'angularDamping'
            {
             before(grammarAccess.getPhysicBodyAccess().getAngularDampingKeyword_14()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getPhysicBodyAccess().getAngularDampingKeyword_14()); 

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
    // $ANTLR end "rule__PhysicBody__Group__14__Impl"


    // $ANTLR start "rule__PhysicBody__Group__15"
    // InternalArg.g:6144:1: rule__PhysicBody__Group__15 : rule__PhysicBody__Group__15__Impl ;
    public final void rule__PhysicBody__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6148:1: ( rule__PhysicBody__Group__15__Impl )
            // InternalArg.g:6149:2: rule__PhysicBody__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicBody__Group__15__Impl();

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
    // $ANTLR end "rule__PhysicBody__Group__15"


    // $ANTLR start "rule__PhysicBody__Group__15__Impl"
    // InternalArg.g:6155:1: rule__PhysicBody__Group__15__Impl : ( ( rule__PhysicBody__AngularDampingAssignment_15 ) ) ;
    public final void rule__PhysicBody__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6159:1: ( ( ( rule__PhysicBody__AngularDampingAssignment_15 ) ) )
            // InternalArg.g:6160:1: ( ( rule__PhysicBody__AngularDampingAssignment_15 ) )
            {
            // InternalArg.g:6160:1: ( ( rule__PhysicBody__AngularDampingAssignment_15 ) )
            // InternalArg.g:6161:2: ( rule__PhysicBody__AngularDampingAssignment_15 )
            {
             before(grammarAccess.getPhysicBodyAccess().getAngularDampingAssignment_15()); 
            // InternalArg.g:6162:2: ( rule__PhysicBody__AngularDampingAssignment_15 )
            // InternalArg.g:6162:3: rule__PhysicBody__AngularDampingAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__PhysicBody__AngularDampingAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getPhysicBodyAccess().getAngularDampingAssignment_15()); 

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
    // $ANTLR end "rule__PhysicBody__Group__15__Impl"


    // $ANTLR start "rule__BitMasks__Group__0"
    // InternalArg.g:6171:1: rule__BitMasks__Group__0 : rule__BitMasks__Group__0__Impl rule__BitMasks__Group__1 ;
    public final void rule__BitMasks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6175:1: ( rule__BitMasks__Group__0__Impl rule__BitMasks__Group__1 )
            // InternalArg.g:6176:2: rule__BitMasks__Group__0__Impl rule__BitMasks__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BitMasks__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BitMasks__Group__1();

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
    // $ANTLR end "rule__BitMasks__Group__0"


    // $ANTLR start "rule__BitMasks__Group__0__Impl"
    // InternalArg.g:6183:1: rule__BitMasks__Group__0__Impl : ( 'collision' ) ;
    public final void rule__BitMasks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6187:1: ( ( 'collision' ) )
            // InternalArg.g:6188:1: ( 'collision' )
            {
            // InternalArg.g:6188:1: ( 'collision' )
            // InternalArg.g:6189:2: 'collision'
            {
             before(grammarAccess.getBitMasksAccess().getCollisionKeyword_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getBitMasksAccess().getCollisionKeyword_0()); 

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
    // $ANTLR end "rule__BitMasks__Group__0__Impl"


    // $ANTLR start "rule__BitMasks__Group__1"
    // InternalArg.g:6198:1: rule__BitMasks__Group__1 : rule__BitMasks__Group__1__Impl rule__BitMasks__Group__2 ;
    public final void rule__BitMasks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6202:1: ( rule__BitMasks__Group__1__Impl rule__BitMasks__Group__2 )
            // InternalArg.g:6203:2: rule__BitMasks__Group__1__Impl rule__BitMasks__Group__2
            {
            pushFollow(FOLLOW_62);
            rule__BitMasks__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BitMasks__Group__2();

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
    // $ANTLR end "rule__BitMasks__Group__1"


    // $ANTLR start "rule__BitMasks__Group__1__Impl"
    // InternalArg.g:6210:1: rule__BitMasks__Group__1__Impl : ( ( rule__BitMasks__CollisionAssignment_1 ) ) ;
    public final void rule__BitMasks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6214:1: ( ( ( rule__BitMasks__CollisionAssignment_1 ) ) )
            // InternalArg.g:6215:1: ( ( rule__BitMasks__CollisionAssignment_1 ) )
            {
            // InternalArg.g:6215:1: ( ( rule__BitMasks__CollisionAssignment_1 ) )
            // InternalArg.g:6216:2: ( rule__BitMasks__CollisionAssignment_1 )
            {
             before(grammarAccess.getBitMasksAccess().getCollisionAssignment_1()); 
            // InternalArg.g:6217:2: ( rule__BitMasks__CollisionAssignment_1 )
            // InternalArg.g:6217:3: rule__BitMasks__CollisionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BitMasks__CollisionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBitMasksAccess().getCollisionAssignment_1()); 

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
    // $ANTLR end "rule__BitMasks__Group__1__Impl"


    // $ANTLR start "rule__BitMasks__Group__2"
    // InternalArg.g:6225:1: rule__BitMasks__Group__2 : rule__BitMasks__Group__2__Impl rule__BitMasks__Group__3 ;
    public final void rule__BitMasks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6229:1: ( rule__BitMasks__Group__2__Impl rule__BitMasks__Group__3 )
            // InternalArg.g:6230:2: rule__BitMasks__Group__2__Impl rule__BitMasks__Group__3
            {
            pushFollow(FOLLOW_62);
            rule__BitMasks__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BitMasks__Group__3();

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
    // $ANTLR end "rule__BitMasks__Group__2"


    // $ANTLR start "rule__BitMasks__Group__2__Impl"
    // InternalArg.g:6237:1: rule__BitMasks__Group__2__Impl : ( ( rule__BitMasks__CollisionAssignment_2 )* ) ;
    public final void rule__BitMasks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6241:1: ( ( ( rule__BitMasks__CollisionAssignment_2 )* ) )
            // InternalArg.g:6242:1: ( ( rule__BitMasks__CollisionAssignment_2 )* )
            {
            // InternalArg.g:6242:1: ( ( rule__BitMasks__CollisionAssignment_2 )* )
            // InternalArg.g:6243:2: ( rule__BitMasks__CollisionAssignment_2 )*
            {
             before(grammarAccess.getBitMasksAccess().getCollisionAssignment_2()); 
            // InternalArg.g:6244:2: ( rule__BitMasks__CollisionAssignment_2 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_STRING && LA47_0<=RULE_ID)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalArg.g:6244:3: rule__BitMasks__CollisionAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BitMasks__CollisionAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getBitMasksAccess().getCollisionAssignment_2()); 

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
    // $ANTLR end "rule__BitMasks__Group__2__Impl"


    // $ANTLR start "rule__BitMasks__Group__3"
    // InternalArg.g:6252:1: rule__BitMasks__Group__3 : rule__BitMasks__Group__3__Impl rule__BitMasks__Group__4 ;
    public final void rule__BitMasks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6256:1: ( rule__BitMasks__Group__3__Impl rule__BitMasks__Group__4 )
            // InternalArg.g:6257:2: rule__BitMasks__Group__3__Impl rule__BitMasks__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__BitMasks__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BitMasks__Group__4();

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
    // $ANTLR end "rule__BitMasks__Group__3"


    // $ANTLR start "rule__BitMasks__Group__3__Impl"
    // InternalArg.g:6264:1: rule__BitMasks__Group__3__Impl : ( 'contact' ) ;
    public final void rule__BitMasks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6268:1: ( ( 'contact' ) )
            // InternalArg.g:6269:1: ( 'contact' )
            {
            // InternalArg.g:6269:1: ( 'contact' )
            // InternalArg.g:6270:2: 'contact'
            {
             before(grammarAccess.getBitMasksAccess().getContactKeyword_3()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getBitMasksAccess().getContactKeyword_3()); 

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
    // $ANTLR end "rule__BitMasks__Group__3__Impl"


    // $ANTLR start "rule__BitMasks__Group__4"
    // InternalArg.g:6279:1: rule__BitMasks__Group__4 : rule__BitMasks__Group__4__Impl rule__BitMasks__Group__5 ;
    public final void rule__BitMasks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6283:1: ( rule__BitMasks__Group__4__Impl rule__BitMasks__Group__5 )
            // InternalArg.g:6284:2: rule__BitMasks__Group__4__Impl rule__BitMasks__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__BitMasks__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BitMasks__Group__5();

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
    // $ANTLR end "rule__BitMasks__Group__4"


    // $ANTLR start "rule__BitMasks__Group__4__Impl"
    // InternalArg.g:6291:1: rule__BitMasks__Group__4__Impl : ( ( rule__BitMasks__ContactAssignment_4 ) ) ;
    public final void rule__BitMasks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6295:1: ( ( ( rule__BitMasks__ContactAssignment_4 ) ) )
            // InternalArg.g:6296:1: ( ( rule__BitMasks__ContactAssignment_4 ) )
            {
            // InternalArg.g:6296:1: ( ( rule__BitMasks__ContactAssignment_4 ) )
            // InternalArg.g:6297:2: ( rule__BitMasks__ContactAssignment_4 )
            {
             before(grammarAccess.getBitMasksAccess().getContactAssignment_4()); 
            // InternalArg.g:6298:2: ( rule__BitMasks__ContactAssignment_4 )
            // InternalArg.g:6298:3: rule__BitMasks__ContactAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BitMasks__ContactAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBitMasksAccess().getContactAssignment_4()); 

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
    // $ANTLR end "rule__BitMasks__Group__4__Impl"


    // $ANTLR start "rule__BitMasks__Group__5"
    // InternalArg.g:6306:1: rule__BitMasks__Group__5 : rule__BitMasks__Group__5__Impl ;
    public final void rule__BitMasks__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6310:1: ( rule__BitMasks__Group__5__Impl )
            // InternalArg.g:6311:2: rule__BitMasks__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BitMasks__Group__5__Impl();

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
    // $ANTLR end "rule__BitMasks__Group__5"


    // $ANTLR start "rule__BitMasks__Group__5__Impl"
    // InternalArg.g:6317:1: rule__BitMasks__Group__5__Impl : ( ( rule__BitMasks__ContactAssignment_5 )* ) ;
    public final void rule__BitMasks__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6321:1: ( ( ( rule__BitMasks__ContactAssignment_5 )* ) )
            // InternalArg.g:6322:1: ( ( rule__BitMasks__ContactAssignment_5 )* )
            {
            // InternalArg.g:6322:1: ( ( rule__BitMasks__ContactAssignment_5 )* )
            // InternalArg.g:6323:2: ( rule__BitMasks__ContactAssignment_5 )*
            {
             before(grammarAccess.getBitMasksAccess().getContactAssignment_5()); 
            // InternalArg.g:6324:2: ( rule__BitMasks__ContactAssignment_5 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_ID)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalArg.g:6324:3: rule__BitMasks__ContactAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BitMasks__ContactAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getBitMasksAccess().getContactAssignment_5()); 

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
    // $ANTLR end "rule__BitMasks__Group__5__Impl"


    // $ANTLR start "rule__Force__Group__0"
    // InternalArg.g:6333:1: rule__Force__Group__0 : rule__Force__Group__0__Impl rule__Force__Group__1 ;
    public final void rule__Force__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6337:1: ( rule__Force__Group__0__Impl rule__Force__Group__1 )
            // InternalArg.g:6338:2: rule__Force__Group__0__Impl rule__Force__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Force__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Force__Group__1();

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
    // $ANTLR end "rule__Force__Group__0"


    // $ANTLR start "rule__Force__Group__0__Impl"
    // InternalArg.g:6345:1: rule__Force__Group__0__Impl : ( ( rule__Force__NameAssignment_0 ) ) ;
    public final void rule__Force__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6349:1: ( ( ( rule__Force__NameAssignment_0 ) ) )
            // InternalArg.g:6350:1: ( ( rule__Force__NameAssignment_0 ) )
            {
            // InternalArg.g:6350:1: ( ( rule__Force__NameAssignment_0 ) )
            // InternalArg.g:6351:2: ( rule__Force__NameAssignment_0 )
            {
             before(grammarAccess.getForceAccess().getNameAssignment_0()); 
            // InternalArg.g:6352:2: ( rule__Force__NameAssignment_0 )
            // InternalArg.g:6352:3: rule__Force__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Force__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getForceAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Force__Group__0__Impl"


    // $ANTLR start "rule__Force__Group__1"
    // InternalArg.g:6360:1: rule__Force__Group__1 : rule__Force__Group__1__Impl rule__Force__Group__2 ;
    public final void rule__Force__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6364:1: ( rule__Force__Group__1__Impl rule__Force__Group__2 )
            // InternalArg.g:6365:2: rule__Force__Group__1__Impl rule__Force__Group__2
            {
            pushFollow(FOLLOW_63);
            rule__Force__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Force__Group__2();

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
    // $ANTLR end "rule__Force__Group__1"


    // $ANTLR start "rule__Force__Group__1__Impl"
    // InternalArg.g:6372:1: rule__Force__Group__1__Impl : ( ':' ) ;
    public final void rule__Force__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6376:1: ( ( ':' ) )
            // InternalArg.g:6377:1: ( ':' )
            {
            // InternalArg.g:6377:1: ( ':' )
            // InternalArg.g:6378:2: ':'
            {
             before(grammarAccess.getForceAccess().getColonKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getForceAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Force__Group__1__Impl"


    // $ANTLR start "rule__Force__Group__2"
    // InternalArg.g:6387:1: rule__Force__Group__2 : rule__Force__Group__2__Impl rule__Force__Group__3 ;
    public final void rule__Force__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6391:1: ( rule__Force__Group__2__Impl rule__Force__Group__3 )
            // InternalArg.g:6392:2: rule__Force__Group__2__Impl rule__Force__Group__3
            {
            pushFollow(FOLLOW_64);
            rule__Force__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Force__Group__3();

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
    // $ANTLR end "rule__Force__Group__2"


    // $ANTLR start "rule__Force__Group__2__Impl"
    // InternalArg.g:6399:1: rule__Force__Group__2__Impl : ( 'gesture' ) ;
    public final void rule__Force__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6403:1: ( ( 'gesture' ) )
            // InternalArg.g:6404:1: ( 'gesture' )
            {
            // InternalArg.g:6404:1: ( 'gesture' )
            // InternalArg.g:6405:2: 'gesture'
            {
             before(grammarAccess.getForceAccess().getGestureKeyword_2()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getForceAccess().getGestureKeyword_2()); 

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
    // $ANTLR end "rule__Force__Group__2__Impl"


    // $ANTLR start "rule__Force__Group__3"
    // InternalArg.g:6414:1: rule__Force__Group__3 : rule__Force__Group__3__Impl rule__Force__Group__4 ;
    public final void rule__Force__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6418:1: ( rule__Force__Group__3__Impl rule__Force__Group__4 )
            // InternalArg.g:6419:2: rule__Force__Group__3__Impl rule__Force__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Force__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Force__Group__4();

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
    // $ANTLR end "rule__Force__Group__3"


    // $ANTLR start "rule__Force__Group__3__Impl"
    // InternalArg.g:6426:1: rule__Force__Group__3__Impl : ( ( rule__Force__GestureAssignment_3 ) ) ;
    public final void rule__Force__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6430:1: ( ( ( rule__Force__GestureAssignment_3 ) ) )
            // InternalArg.g:6431:1: ( ( rule__Force__GestureAssignment_3 ) )
            {
            // InternalArg.g:6431:1: ( ( rule__Force__GestureAssignment_3 ) )
            // InternalArg.g:6432:2: ( rule__Force__GestureAssignment_3 )
            {
             before(grammarAccess.getForceAccess().getGestureAssignment_3()); 
            // InternalArg.g:6433:2: ( rule__Force__GestureAssignment_3 )
            // InternalArg.g:6433:3: rule__Force__GestureAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Force__GestureAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForceAccess().getGestureAssignment_3()); 

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
    // $ANTLR end "rule__Force__Group__3__Impl"


    // $ANTLR start "rule__Force__Group__4"
    // InternalArg.g:6441:1: rule__Force__Group__4 : rule__Force__Group__4__Impl ;
    public final void rule__Force__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6445:1: ( rule__Force__Group__4__Impl )
            // InternalArg.g:6446:2: rule__Force__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Force__Group__4__Impl();

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
    // $ANTLR end "rule__Force__Group__4"


    // $ANTLR start "rule__Force__Group__4__Impl"
    // InternalArg.g:6452:1: rule__Force__Group__4__Impl : ( ( rule__Force__Group_4__0 )? ) ;
    public final void rule__Force__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6456:1: ( ( ( rule__Force__Group_4__0 )? ) )
            // InternalArg.g:6457:1: ( ( rule__Force__Group_4__0 )? )
            {
            // InternalArg.g:6457:1: ( ( rule__Force__Group_4__0 )? )
            // InternalArg.g:6458:2: ( rule__Force__Group_4__0 )?
            {
             before(grammarAccess.getForceAccess().getGroup_4()); 
            // InternalArg.g:6459:2: ( rule__Force__Group_4__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==57) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalArg.g:6459:3: rule__Force__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Force__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Force__Group__4__Impl"


    // $ANTLR start "rule__Force__Group_4__0"
    // InternalArg.g:6468:1: rule__Force__Group_4__0 : rule__Force__Group_4__0__Impl rule__Force__Group_4__1 ;
    public final void rule__Force__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6472:1: ( rule__Force__Group_4__0__Impl rule__Force__Group_4__1 )
            // InternalArg.g:6473:2: rule__Force__Group_4__0__Impl rule__Force__Group_4__1
            {
            pushFollow(FOLLOW_42);
            rule__Force__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Force__Group_4__1();

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
    // $ANTLR end "rule__Force__Group_4__0"


    // $ANTLR start "rule__Force__Group_4__0__Impl"
    // InternalArg.g:6480:1: rule__Force__Group_4__0__Impl : ( '[' ) ;
    public final void rule__Force__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6484:1: ( ( '[' ) )
            // InternalArg.g:6485:1: ( '[' )
            {
            // InternalArg.g:6485:1: ( '[' )
            // InternalArg.g:6486:2: '['
            {
             before(grammarAccess.getForceAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getForceAccess().getLeftSquareBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__Force__Group_4__0__Impl"


    // $ANTLR start "rule__Force__Group_4__1"
    // InternalArg.g:6495:1: rule__Force__Group_4__1 : rule__Force__Group_4__1__Impl rule__Force__Group_4__2 ;
    public final void rule__Force__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6499:1: ( rule__Force__Group_4__1__Impl rule__Force__Group_4__2 )
            // InternalArg.g:6500:2: rule__Force__Group_4__1__Impl rule__Force__Group_4__2
            {
            pushFollow(FOLLOW_65);
            rule__Force__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Force__Group_4__2();

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
    // $ANTLR end "rule__Force__Group_4__1"


    // $ANTLR start "rule__Force__Group_4__1__Impl"
    // InternalArg.g:6507:1: rule__Force__Group_4__1__Impl : ( ( rule__Force__XVectorAssignment_4_1 ) ) ;
    public final void rule__Force__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6511:1: ( ( ( rule__Force__XVectorAssignment_4_1 ) ) )
            // InternalArg.g:6512:1: ( ( rule__Force__XVectorAssignment_4_1 ) )
            {
            // InternalArg.g:6512:1: ( ( rule__Force__XVectorAssignment_4_1 ) )
            // InternalArg.g:6513:2: ( rule__Force__XVectorAssignment_4_1 )
            {
             before(grammarAccess.getForceAccess().getXVectorAssignment_4_1()); 
            // InternalArg.g:6514:2: ( rule__Force__XVectorAssignment_4_1 )
            // InternalArg.g:6514:3: rule__Force__XVectorAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Force__XVectorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getForceAccess().getXVectorAssignment_4_1()); 

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
    // $ANTLR end "rule__Force__Group_4__1__Impl"


    // $ANTLR start "rule__Force__Group_4__2"
    // InternalArg.g:6522:1: rule__Force__Group_4__2 : rule__Force__Group_4__2__Impl rule__Force__Group_4__3 ;
    public final void rule__Force__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6526:1: ( rule__Force__Group_4__2__Impl rule__Force__Group_4__3 )
            // InternalArg.g:6527:2: rule__Force__Group_4__2__Impl rule__Force__Group_4__3
            {
            pushFollow(FOLLOW_42);
            rule__Force__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Force__Group_4__3();

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
    // $ANTLR end "rule__Force__Group_4__2"


    // $ANTLR start "rule__Force__Group_4__2__Impl"
    // InternalArg.g:6534:1: rule__Force__Group_4__2__Impl : ( ',' ) ;
    public final void rule__Force__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6538:1: ( ( ',' ) )
            // InternalArg.g:6539:1: ( ',' )
            {
            // InternalArg.g:6539:1: ( ',' )
            // InternalArg.g:6540:2: ','
            {
             before(grammarAccess.getForceAccess().getCommaKeyword_4_2()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getForceAccess().getCommaKeyword_4_2()); 

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
    // $ANTLR end "rule__Force__Group_4__2__Impl"


    // $ANTLR start "rule__Force__Group_4__3"
    // InternalArg.g:6549:1: rule__Force__Group_4__3 : rule__Force__Group_4__3__Impl rule__Force__Group_4__4 ;
    public final void rule__Force__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6553:1: ( rule__Force__Group_4__3__Impl rule__Force__Group_4__4 )
            // InternalArg.g:6554:2: rule__Force__Group_4__3__Impl rule__Force__Group_4__4
            {
            pushFollow(FOLLOW_65);
            rule__Force__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Force__Group_4__4();

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
    // $ANTLR end "rule__Force__Group_4__3"


    // $ANTLR start "rule__Force__Group_4__3__Impl"
    // InternalArg.g:6561:1: rule__Force__Group_4__3__Impl : ( ( rule__Force__YVectorAssignment_4_3 ) ) ;
    public final void rule__Force__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6565:1: ( ( ( rule__Force__YVectorAssignment_4_3 ) ) )
            // InternalArg.g:6566:1: ( ( rule__Force__YVectorAssignment_4_3 ) )
            {
            // InternalArg.g:6566:1: ( ( rule__Force__YVectorAssignment_4_3 ) )
            // InternalArg.g:6567:2: ( rule__Force__YVectorAssignment_4_3 )
            {
             before(grammarAccess.getForceAccess().getYVectorAssignment_4_3()); 
            // InternalArg.g:6568:2: ( rule__Force__YVectorAssignment_4_3 )
            // InternalArg.g:6568:3: rule__Force__YVectorAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Force__YVectorAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getForceAccess().getYVectorAssignment_4_3()); 

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
    // $ANTLR end "rule__Force__Group_4__3__Impl"


    // $ANTLR start "rule__Force__Group_4__4"
    // InternalArg.g:6576:1: rule__Force__Group_4__4 : rule__Force__Group_4__4__Impl rule__Force__Group_4__5 ;
    public final void rule__Force__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6580:1: ( rule__Force__Group_4__4__Impl rule__Force__Group_4__5 )
            // InternalArg.g:6581:2: rule__Force__Group_4__4__Impl rule__Force__Group_4__5
            {
            pushFollow(FOLLOW_42);
            rule__Force__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Force__Group_4__5();

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
    // $ANTLR end "rule__Force__Group_4__4"


    // $ANTLR start "rule__Force__Group_4__4__Impl"
    // InternalArg.g:6588:1: rule__Force__Group_4__4__Impl : ( ',' ) ;
    public final void rule__Force__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6592:1: ( ( ',' ) )
            // InternalArg.g:6593:1: ( ',' )
            {
            // InternalArg.g:6593:1: ( ',' )
            // InternalArg.g:6594:2: ','
            {
             before(grammarAccess.getForceAccess().getCommaKeyword_4_4()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getForceAccess().getCommaKeyword_4_4()); 

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
    // $ANTLR end "rule__Force__Group_4__4__Impl"


    // $ANTLR start "rule__Force__Group_4__5"
    // InternalArg.g:6603:1: rule__Force__Group_4__5 : rule__Force__Group_4__5__Impl rule__Force__Group_4__6 ;
    public final void rule__Force__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6607:1: ( rule__Force__Group_4__5__Impl rule__Force__Group_4__6 )
            // InternalArg.g:6608:2: rule__Force__Group_4__5__Impl rule__Force__Group_4__6
            {
            pushFollow(FOLLOW_28);
            rule__Force__Group_4__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Force__Group_4__6();

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
    // $ANTLR end "rule__Force__Group_4__5"


    // $ANTLR start "rule__Force__Group_4__5__Impl"
    // InternalArg.g:6615:1: rule__Force__Group_4__5__Impl : ( ( rule__Force__ZVectorAssignment_4_5 ) ) ;
    public final void rule__Force__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6619:1: ( ( ( rule__Force__ZVectorAssignment_4_5 ) ) )
            // InternalArg.g:6620:1: ( ( rule__Force__ZVectorAssignment_4_5 ) )
            {
            // InternalArg.g:6620:1: ( ( rule__Force__ZVectorAssignment_4_5 ) )
            // InternalArg.g:6621:2: ( rule__Force__ZVectorAssignment_4_5 )
            {
             before(grammarAccess.getForceAccess().getZVectorAssignment_4_5()); 
            // InternalArg.g:6622:2: ( rule__Force__ZVectorAssignment_4_5 )
            // InternalArg.g:6622:3: rule__Force__ZVectorAssignment_4_5
            {
            pushFollow(FOLLOW_2);
            rule__Force__ZVectorAssignment_4_5();

            state._fsp--;


            }

             after(grammarAccess.getForceAccess().getZVectorAssignment_4_5()); 

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
    // $ANTLR end "rule__Force__Group_4__5__Impl"


    // $ANTLR start "rule__Force__Group_4__6"
    // InternalArg.g:6630:1: rule__Force__Group_4__6 : rule__Force__Group_4__6__Impl ;
    public final void rule__Force__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6634:1: ( rule__Force__Group_4__6__Impl )
            // InternalArg.g:6635:2: rule__Force__Group_4__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Force__Group_4__6__Impl();

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
    // $ANTLR end "rule__Force__Group_4__6"


    // $ANTLR start "rule__Force__Group_4__6__Impl"
    // InternalArg.g:6641:1: rule__Force__Group_4__6__Impl : ( ']' ) ;
    public final void rule__Force__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6645:1: ( ( ']' ) )
            // InternalArg.g:6646:1: ( ']' )
            {
            // InternalArg.g:6646:1: ( ']' )
            // InternalArg.g:6647:2: ']'
            {
             before(grammarAccess.getForceAccess().getRightSquareBracketKeyword_4_6()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getForceAccess().getRightSquareBracketKeyword_4_6()); 

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
    // $ANTLR end "rule__Force__Group_4__6__Impl"


    // $ANTLR start "rule__GamePad__Group__0"
    // InternalArg.g:6657:1: rule__GamePad__Group__0 : rule__GamePad__Group__0__Impl rule__GamePad__Group__1 ;
    public final void rule__GamePad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6661:1: ( rule__GamePad__Group__0__Impl rule__GamePad__Group__1 )
            // InternalArg.g:6662:2: rule__GamePad__Group__0__Impl rule__GamePad__Group__1
            {
            pushFollow(FOLLOW_66);
            rule__GamePad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GamePad__Group__1();

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
    // $ANTLR end "rule__GamePad__Group__0"


    // $ANTLR start "rule__GamePad__Group__0__Impl"
    // InternalArg.g:6669:1: rule__GamePad__Group__0__Impl : ( ( rule__GamePad__NameAssignment_0 ) ) ;
    public final void rule__GamePad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6673:1: ( ( ( rule__GamePad__NameAssignment_0 ) ) )
            // InternalArg.g:6674:1: ( ( rule__GamePad__NameAssignment_0 ) )
            {
            // InternalArg.g:6674:1: ( ( rule__GamePad__NameAssignment_0 ) )
            // InternalArg.g:6675:2: ( rule__GamePad__NameAssignment_0 )
            {
             before(grammarAccess.getGamePadAccess().getNameAssignment_0()); 
            // InternalArg.g:6676:2: ( rule__GamePad__NameAssignment_0 )
            // InternalArg.g:6676:3: rule__GamePad__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GamePad__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGamePadAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__GamePad__Group__0__Impl"


    // $ANTLR start "rule__GamePad__Group__1"
    // InternalArg.g:6684:1: rule__GamePad__Group__1 : rule__GamePad__Group__1__Impl rule__GamePad__Group__2 ;
    public final void rule__GamePad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6688:1: ( rule__GamePad__Group__1__Impl rule__GamePad__Group__2 )
            // InternalArg.g:6689:2: rule__GamePad__Group__1__Impl rule__GamePad__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__GamePad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GamePad__Group__2();

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
    // $ANTLR end "rule__GamePad__Group__1"


    // $ANTLR start "rule__GamePad__Group__1__Impl"
    // InternalArg.g:6696:1: rule__GamePad__Group__1__Impl : ( '->' ) ;
    public final void rule__GamePad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6700:1: ( ( '->' ) )
            // InternalArg.g:6701:1: ( '->' )
            {
            // InternalArg.g:6701:1: ( '->' )
            // InternalArg.g:6702:2: '->'
            {
             before(grammarAccess.getGamePadAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getGamePadAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__GamePad__Group__1__Impl"


    // $ANTLR start "rule__GamePad__Group__2"
    // InternalArg.g:6711:1: rule__GamePad__Group__2 : rule__GamePad__Group__2__Impl ;
    public final void rule__GamePad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6715:1: ( rule__GamePad__Group__2__Impl )
            // InternalArg.g:6716:2: rule__GamePad__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GamePad__Group__2__Impl();

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
    // $ANTLR end "rule__GamePad__Group__2"


    // $ANTLR start "rule__GamePad__Group__2__Impl"
    // InternalArg.g:6722:1: rule__GamePad__Group__2__Impl : ( ( rule__GamePad__TriggerAssignment_2 ) ) ;
    public final void rule__GamePad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6726:1: ( ( ( rule__GamePad__TriggerAssignment_2 ) ) )
            // InternalArg.g:6727:1: ( ( rule__GamePad__TriggerAssignment_2 ) )
            {
            // InternalArg.g:6727:1: ( ( rule__GamePad__TriggerAssignment_2 ) )
            // InternalArg.g:6728:2: ( rule__GamePad__TriggerAssignment_2 )
            {
             before(grammarAccess.getGamePadAccess().getTriggerAssignment_2()); 
            // InternalArg.g:6729:2: ( rule__GamePad__TriggerAssignment_2 )
            // InternalArg.g:6729:3: rule__GamePad__TriggerAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GamePad__TriggerAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGamePadAccess().getTriggerAssignment_2()); 

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
    // $ANTLR end "rule__GamePad__Group__2__Impl"


    // $ANTLR start "rule__ScoreSystem__Group__0"
    // InternalArg.g:6738:1: rule__ScoreSystem__Group__0 : rule__ScoreSystem__Group__0__Impl rule__ScoreSystem__Group__1 ;
    public final void rule__ScoreSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6742:1: ( rule__ScoreSystem__Group__0__Impl rule__ScoreSystem__Group__1 )
            // InternalArg.g:6743:2: rule__ScoreSystem__Group__0__Impl rule__ScoreSystem__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ScoreSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScoreSystem__Group__1();

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
    // $ANTLR end "rule__ScoreSystem__Group__0"


    // $ANTLR start "rule__ScoreSystem__Group__0__Impl"
    // InternalArg.g:6750:1: rule__ScoreSystem__Group__0__Impl : ( 'start' ) ;
    public final void rule__ScoreSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6754:1: ( ( 'start' ) )
            // InternalArg.g:6755:1: ( 'start' )
            {
            // InternalArg.g:6755:1: ( 'start' )
            // InternalArg.g:6756:2: 'start'
            {
             before(grammarAccess.getScoreSystemAccess().getStartKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getScoreSystemAccess().getStartKeyword_0()); 

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
    // $ANTLR end "rule__ScoreSystem__Group__0__Impl"


    // $ANTLR start "rule__ScoreSystem__Group__1"
    // InternalArg.g:6765:1: rule__ScoreSystem__Group__1 : rule__ScoreSystem__Group__1__Impl rule__ScoreSystem__Group__2 ;
    public final void rule__ScoreSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6769:1: ( rule__ScoreSystem__Group__1__Impl rule__ScoreSystem__Group__2 )
            // InternalArg.g:6770:2: rule__ScoreSystem__Group__1__Impl rule__ScoreSystem__Group__2
            {
            pushFollow(FOLLOW_67);
            rule__ScoreSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScoreSystem__Group__2();

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
    // $ANTLR end "rule__ScoreSystem__Group__1"


    // $ANTLR start "rule__ScoreSystem__Group__1__Impl"
    // InternalArg.g:6777:1: rule__ScoreSystem__Group__1__Impl : ( ( rule__ScoreSystem__StartAssignment_1 ) ) ;
    public final void rule__ScoreSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6781:1: ( ( ( rule__ScoreSystem__StartAssignment_1 ) ) )
            // InternalArg.g:6782:1: ( ( rule__ScoreSystem__StartAssignment_1 ) )
            {
            // InternalArg.g:6782:1: ( ( rule__ScoreSystem__StartAssignment_1 ) )
            // InternalArg.g:6783:2: ( rule__ScoreSystem__StartAssignment_1 )
            {
             before(grammarAccess.getScoreSystemAccess().getStartAssignment_1()); 
            // InternalArg.g:6784:2: ( rule__ScoreSystem__StartAssignment_1 )
            // InternalArg.g:6784:3: rule__ScoreSystem__StartAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ScoreSystem__StartAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScoreSystemAccess().getStartAssignment_1()); 

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
    // $ANTLR end "rule__ScoreSystem__Group__1__Impl"


    // $ANTLR start "rule__ScoreSystem__Group__2"
    // InternalArg.g:6792:1: rule__ScoreSystem__Group__2 : rule__ScoreSystem__Group__2__Impl rule__ScoreSystem__Group__3 ;
    public final void rule__ScoreSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6796:1: ( rule__ScoreSystem__Group__2__Impl rule__ScoreSystem__Group__3 )
            // InternalArg.g:6797:2: rule__ScoreSystem__Group__2__Impl rule__ScoreSystem__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__ScoreSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScoreSystem__Group__3();

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
    // $ANTLR end "rule__ScoreSystem__Group__2"


    // $ANTLR start "rule__ScoreSystem__Group__2__Impl"
    // InternalArg.g:6804:1: rule__ScoreSystem__Group__2__Impl : ( 'goal' ) ;
    public final void rule__ScoreSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6808:1: ( ( 'goal' ) )
            // InternalArg.g:6809:1: ( 'goal' )
            {
            // InternalArg.g:6809:1: ( 'goal' )
            // InternalArg.g:6810:2: 'goal'
            {
             before(grammarAccess.getScoreSystemAccess().getGoalKeyword_2()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getScoreSystemAccess().getGoalKeyword_2()); 

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
    // $ANTLR end "rule__ScoreSystem__Group__2__Impl"


    // $ANTLR start "rule__ScoreSystem__Group__3"
    // InternalArg.g:6819:1: rule__ScoreSystem__Group__3 : rule__ScoreSystem__Group__3__Impl rule__ScoreSystem__Group__4 ;
    public final void rule__ScoreSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6823:1: ( rule__ScoreSystem__Group__3__Impl rule__ScoreSystem__Group__4 )
            // InternalArg.g:6824:2: rule__ScoreSystem__Group__3__Impl rule__ScoreSystem__Group__4
            {
            pushFollow(FOLLOW_68);
            rule__ScoreSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScoreSystem__Group__4();

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
    // $ANTLR end "rule__ScoreSystem__Group__3"


    // $ANTLR start "rule__ScoreSystem__Group__3__Impl"
    // InternalArg.g:6831:1: rule__ScoreSystem__Group__3__Impl : ( ( rule__ScoreSystem__FinishAssignment_3 ) ) ;
    public final void rule__ScoreSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6835:1: ( ( ( rule__ScoreSystem__FinishAssignment_3 ) ) )
            // InternalArg.g:6836:1: ( ( rule__ScoreSystem__FinishAssignment_3 ) )
            {
            // InternalArg.g:6836:1: ( ( rule__ScoreSystem__FinishAssignment_3 ) )
            // InternalArg.g:6837:2: ( rule__ScoreSystem__FinishAssignment_3 )
            {
             before(grammarAccess.getScoreSystemAccess().getFinishAssignment_3()); 
            // InternalArg.g:6838:2: ( rule__ScoreSystem__FinishAssignment_3 )
            // InternalArg.g:6838:3: rule__ScoreSystem__FinishAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ScoreSystem__FinishAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScoreSystemAccess().getFinishAssignment_3()); 

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
    // $ANTLR end "rule__ScoreSystem__Group__3__Impl"


    // $ANTLR start "rule__ScoreSystem__Group__4"
    // InternalArg.g:6846:1: rule__ScoreSystem__Group__4 : rule__ScoreSystem__Group__4__Impl rule__ScoreSystem__Group__5 ;
    public final void rule__ScoreSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6850:1: ( rule__ScoreSystem__Group__4__Impl rule__ScoreSystem__Group__5 )
            // InternalArg.g:6851:2: rule__ScoreSystem__Group__4__Impl rule__ScoreSystem__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__ScoreSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScoreSystem__Group__5();

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
    // $ANTLR end "rule__ScoreSystem__Group__4"


    // $ANTLR start "rule__ScoreSystem__Group__4__Impl"
    // InternalArg.g:6858:1: rule__ScoreSystem__Group__4__Impl : ( 'lives' ) ;
    public final void rule__ScoreSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6862:1: ( ( 'lives' ) )
            // InternalArg.g:6863:1: ( 'lives' )
            {
            // InternalArg.g:6863:1: ( 'lives' )
            // InternalArg.g:6864:2: 'lives'
            {
             before(grammarAccess.getScoreSystemAccess().getLivesKeyword_4()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getScoreSystemAccess().getLivesKeyword_4()); 

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
    // $ANTLR end "rule__ScoreSystem__Group__4__Impl"


    // $ANTLR start "rule__ScoreSystem__Group__5"
    // InternalArg.g:6873:1: rule__ScoreSystem__Group__5 : rule__ScoreSystem__Group__5__Impl ;
    public final void rule__ScoreSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6877:1: ( rule__ScoreSystem__Group__5__Impl )
            // InternalArg.g:6878:2: rule__ScoreSystem__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScoreSystem__Group__5__Impl();

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
    // $ANTLR end "rule__ScoreSystem__Group__5"


    // $ANTLR start "rule__ScoreSystem__Group__5__Impl"
    // InternalArg.g:6884:1: rule__ScoreSystem__Group__5__Impl : ( ( rule__ScoreSystem__LivesAssignment_5 ) ) ;
    public final void rule__ScoreSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6888:1: ( ( ( rule__ScoreSystem__LivesAssignment_5 ) ) )
            // InternalArg.g:6889:1: ( ( rule__ScoreSystem__LivesAssignment_5 ) )
            {
            // InternalArg.g:6889:1: ( ( rule__ScoreSystem__LivesAssignment_5 ) )
            // InternalArg.g:6890:2: ( rule__ScoreSystem__LivesAssignment_5 )
            {
             before(grammarAccess.getScoreSystemAccess().getLivesAssignment_5()); 
            // InternalArg.g:6891:2: ( rule__ScoreSystem__LivesAssignment_5 )
            // InternalArg.g:6891:3: rule__ScoreSystem__LivesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ScoreSystem__LivesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getScoreSystemAccess().getLivesAssignment_5()); 

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
    // $ANTLR end "rule__ScoreSystem__Group__5__Impl"


    // $ANTLR start "rule__Trigger__Group__0"
    // InternalArg.g:6900:1: rule__Trigger__Group__0 : rule__Trigger__Group__0__Impl rule__Trigger__Group__1 ;
    public final void rule__Trigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6904:1: ( rule__Trigger__Group__0__Impl rule__Trigger__Group__1 )
            // InternalArg.g:6905:2: rule__Trigger__Group__0__Impl rule__Trigger__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Trigger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group__1();

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
    // $ANTLR end "rule__Trigger__Group__0"


    // $ANTLR start "rule__Trigger__Group__0__Impl"
    // InternalArg.g:6912:1: rule__Trigger__Group__0__Impl : ( ( rule__Trigger__NameAssignment_0 ) ) ;
    public final void rule__Trigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6916:1: ( ( ( rule__Trigger__NameAssignment_0 ) ) )
            // InternalArg.g:6917:1: ( ( rule__Trigger__NameAssignment_0 ) )
            {
            // InternalArg.g:6917:1: ( ( rule__Trigger__NameAssignment_0 ) )
            // InternalArg.g:6918:2: ( rule__Trigger__NameAssignment_0 )
            {
             before(grammarAccess.getTriggerAccess().getNameAssignment_0()); 
            // InternalArg.g:6919:2: ( rule__Trigger__NameAssignment_0 )
            // InternalArg.g:6919:3: rule__Trigger__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Trigger__Group__0__Impl"


    // $ANTLR start "rule__Trigger__Group__1"
    // InternalArg.g:6927:1: rule__Trigger__Group__1 : rule__Trigger__Group__1__Impl rule__Trigger__Group__2 ;
    public final void rule__Trigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6931:1: ( rule__Trigger__Group__1__Impl rule__Trigger__Group__2 )
            // InternalArg.g:6932:2: rule__Trigger__Group__1__Impl rule__Trigger__Group__2
            {
            pushFollow(FOLLOW_69);
            rule__Trigger__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group__2();

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
    // $ANTLR end "rule__Trigger__Group__1"


    // $ANTLR start "rule__Trigger__Group__1__Impl"
    // InternalArg.g:6939:1: rule__Trigger__Group__1__Impl : ( '{' ) ;
    public final void rule__Trigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6943:1: ( ( '{' ) )
            // InternalArg.g:6944:1: ( '{' )
            {
            // InternalArg.g:6944:1: ( '{' )
            // InternalArg.g:6945:2: '{'
            {
             before(grammarAccess.getTriggerAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTriggerAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Trigger__Group__1__Impl"


    // $ANTLR start "rule__Trigger__Group__2"
    // InternalArg.g:6954:1: rule__Trigger__Group__2 : rule__Trigger__Group__2__Impl rule__Trigger__Group__3 ;
    public final void rule__Trigger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6958:1: ( rule__Trigger__Group__2__Impl rule__Trigger__Group__3 )
            // InternalArg.g:6959:2: rule__Trigger__Group__2__Impl rule__Trigger__Group__3
            {
            pushFollow(FOLLOW_69);
            rule__Trigger__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group__3();

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
    // $ANTLR end "rule__Trigger__Group__2"


    // $ANTLR start "rule__Trigger__Group__2__Impl"
    // InternalArg.g:6966:1: rule__Trigger__Group__2__Impl : ( ( rule__Trigger__Group_2__0 )? ) ;
    public final void rule__Trigger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6970:1: ( ( ( rule__Trigger__Group_2__0 )? ) )
            // InternalArg.g:6971:1: ( ( rule__Trigger__Group_2__0 )? )
            {
            // InternalArg.g:6971:1: ( ( rule__Trigger__Group_2__0 )? )
            // InternalArg.g:6972:2: ( rule__Trigger__Group_2__0 )?
            {
             before(grammarAccess.getTriggerAccess().getGroup_2()); 
            // InternalArg.g:6973:2: ( rule__Trigger__Group_2__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==95) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalArg.g:6973:3: rule__Trigger__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Trigger__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTriggerAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Trigger__Group__2__Impl"


    // $ANTLR start "rule__Trigger__Group__3"
    // InternalArg.g:6981:1: rule__Trigger__Group__3 : rule__Trigger__Group__3__Impl rule__Trigger__Group__4 ;
    public final void rule__Trigger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6985:1: ( rule__Trigger__Group__3__Impl rule__Trigger__Group__4 )
            // InternalArg.g:6986:2: rule__Trigger__Group__3__Impl rule__Trigger__Group__4
            {
            pushFollow(FOLLOW_69);
            rule__Trigger__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group__4();

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
    // $ANTLR end "rule__Trigger__Group__3"


    // $ANTLR start "rule__Trigger__Group__3__Impl"
    // InternalArg.g:6993:1: rule__Trigger__Group__3__Impl : ( ( rule__Trigger__Group_3__0 )? ) ;
    public final void rule__Trigger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:6997:1: ( ( ( rule__Trigger__Group_3__0 )? ) )
            // InternalArg.g:6998:1: ( ( rule__Trigger__Group_3__0 )? )
            {
            // InternalArg.g:6998:1: ( ( rule__Trigger__Group_3__0 )? )
            // InternalArg.g:6999:2: ( rule__Trigger__Group_3__0 )?
            {
             before(grammarAccess.getTriggerAccess().getGroup_3()); 
            // InternalArg.g:7000:2: ( rule__Trigger__Group_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==96) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalArg.g:7000:3: rule__Trigger__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Trigger__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTriggerAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Trigger__Group__3__Impl"


    // $ANTLR start "rule__Trigger__Group__4"
    // InternalArg.g:7008:1: rule__Trigger__Group__4 : rule__Trigger__Group__4__Impl rule__Trigger__Group__5 ;
    public final void rule__Trigger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7012:1: ( rule__Trigger__Group__4__Impl rule__Trigger__Group__5 )
            // InternalArg.g:7013:2: rule__Trigger__Group__4__Impl rule__Trigger__Group__5
            {
            pushFollow(FOLLOW_69);
            rule__Trigger__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group__5();

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
    // $ANTLR end "rule__Trigger__Group__4"


    // $ANTLR start "rule__Trigger__Group__4__Impl"
    // InternalArg.g:7020:1: rule__Trigger__Group__4__Impl : ( ( rule__Trigger__Group_4__0 )? ) ;
    public final void rule__Trigger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7024:1: ( ( ( rule__Trigger__Group_4__0 )? ) )
            // InternalArg.g:7025:1: ( ( rule__Trigger__Group_4__0 )? )
            {
            // InternalArg.g:7025:1: ( ( rule__Trigger__Group_4__0 )? )
            // InternalArg.g:7026:2: ( rule__Trigger__Group_4__0 )?
            {
             before(grammarAccess.getTriggerAccess().getGroup_4()); 
            // InternalArg.g:7027:2: ( rule__Trigger__Group_4__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==51) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalArg.g:7027:3: rule__Trigger__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Trigger__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTriggerAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Trigger__Group__4__Impl"


    // $ANTLR start "rule__Trigger__Group__5"
    // InternalArg.g:7035:1: rule__Trigger__Group__5 : rule__Trigger__Group__5__Impl rule__Trigger__Group__6 ;
    public final void rule__Trigger__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7039:1: ( rule__Trigger__Group__5__Impl rule__Trigger__Group__6 )
            // InternalArg.g:7040:2: rule__Trigger__Group__5__Impl rule__Trigger__Group__6
            {
            pushFollow(FOLLOW_69);
            rule__Trigger__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group__6();

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
    // $ANTLR end "rule__Trigger__Group__5"


    // $ANTLR start "rule__Trigger__Group__5__Impl"
    // InternalArg.g:7047:1: rule__Trigger__Group__5__Impl : ( ( rule__Trigger__Group_5__0 )? ) ;
    public final void rule__Trigger__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7051:1: ( ( ( rule__Trigger__Group_5__0 )? ) )
            // InternalArg.g:7052:1: ( ( rule__Trigger__Group_5__0 )? )
            {
            // InternalArg.g:7052:1: ( ( rule__Trigger__Group_5__0 )? )
            // InternalArg.g:7053:2: ( rule__Trigger__Group_5__0 )?
            {
             before(grammarAccess.getTriggerAccess().getGroup_5()); 
            // InternalArg.g:7054:2: ( rule__Trigger__Group_5__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==97) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalArg.g:7054:3: rule__Trigger__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Trigger__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTriggerAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Trigger__Group__5__Impl"


    // $ANTLR start "rule__Trigger__Group__6"
    // InternalArg.g:7062:1: rule__Trigger__Group__6 : rule__Trigger__Group__6__Impl rule__Trigger__Group__7 ;
    public final void rule__Trigger__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7066:1: ( rule__Trigger__Group__6__Impl rule__Trigger__Group__7 )
            // InternalArg.g:7067:2: rule__Trigger__Group__6__Impl rule__Trigger__Group__7
            {
            pushFollow(FOLLOW_69);
            rule__Trigger__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group__7();

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
    // $ANTLR end "rule__Trigger__Group__6"


    // $ANTLR start "rule__Trigger__Group__6__Impl"
    // InternalArg.g:7074:1: rule__Trigger__Group__6__Impl : ( ( rule__Trigger__Group_6__0 )? ) ;
    public final void rule__Trigger__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7078:1: ( ( ( rule__Trigger__Group_6__0 )? ) )
            // InternalArg.g:7079:1: ( ( rule__Trigger__Group_6__0 )? )
            {
            // InternalArg.g:7079:1: ( ( rule__Trigger__Group_6__0 )? )
            // InternalArg.g:7080:2: ( rule__Trigger__Group_6__0 )?
            {
             before(grammarAccess.getTriggerAccess().getGroup_6()); 
            // InternalArg.g:7081:2: ( rule__Trigger__Group_6__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==98) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalArg.g:7081:3: rule__Trigger__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Trigger__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTriggerAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Trigger__Group__6__Impl"


    // $ANTLR start "rule__Trigger__Group__7"
    // InternalArg.g:7089:1: rule__Trigger__Group__7 : rule__Trigger__Group__7__Impl ;
    public final void rule__Trigger__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7093:1: ( rule__Trigger__Group__7__Impl )
            // InternalArg.g:7094:2: rule__Trigger__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__Group__7__Impl();

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
    // $ANTLR end "rule__Trigger__Group__7"


    // $ANTLR start "rule__Trigger__Group__7__Impl"
    // InternalArg.g:7100:1: rule__Trigger__Group__7__Impl : ( '}' ) ;
    public final void rule__Trigger__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7104:1: ( ( '}' ) )
            // InternalArg.g:7105:1: ( '}' )
            {
            // InternalArg.g:7105:1: ( '}' )
            // InternalArg.g:7106:2: '}'
            {
             before(grammarAccess.getTriggerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTriggerAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Trigger__Group__7__Impl"


    // $ANTLR start "rule__Trigger__Group_2__0"
    // InternalArg.g:7116:1: rule__Trigger__Group_2__0 : rule__Trigger__Group_2__0__Impl rule__Trigger__Group_2__1 ;
    public final void rule__Trigger__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7120:1: ( rule__Trigger__Group_2__0__Impl rule__Trigger__Group_2__1 )
            // InternalArg.g:7121:2: rule__Trigger__Group_2__0__Impl rule__Trigger__Group_2__1
            {
            pushFollow(FOLLOW_70);
            rule__Trigger__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group_2__1();

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
    // $ANTLR end "rule__Trigger__Group_2__0"


    // $ANTLR start "rule__Trigger__Group_2__0__Impl"
    // InternalArg.g:7128:1: rule__Trigger__Group_2__0__Impl : ( 'action' ) ;
    public final void rule__Trigger__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7132:1: ( ( 'action' ) )
            // InternalArg.g:7133:1: ( 'action' )
            {
            // InternalArg.g:7133:1: ( 'action' )
            // InternalArg.g:7134:2: 'action'
            {
             before(grammarAccess.getTriggerAccess().getActionKeyword_2_0()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getTriggerAccess().getActionKeyword_2_0()); 

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
    // $ANTLR end "rule__Trigger__Group_2__0__Impl"


    // $ANTLR start "rule__Trigger__Group_2__1"
    // InternalArg.g:7143:1: rule__Trigger__Group_2__1 : rule__Trigger__Group_2__1__Impl ;
    public final void rule__Trigger__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7147:1: ( rule__Trigger__Group_2__1__Impl )
            // InternalArg.g:7148:2: rule__Trigger__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__Group_2__1__Impl();

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
    // $ANTLR end "rule__Trigger__Group_2__1"


    // $ANTLR start "rule__Trigger__Group_2__1__Impl"
    // InternalArg.g:7154:1: rule__Trigger__Group_2__1__Impl : ( ( rule__Trigger__ActionAssignment_2_1 ) ) ;
    public final void rule__Trigger__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7158:1: ( ( ( rule__Trigger__ActionAssignment_2_1 ) ) )
            // InternalArg.g:7159:1: ( ( rule__Trigger__ActionAssignment_2_1 ) )
            {
            // InternalArg.g:7159:1: ( ( rule__Trigger__ActionAssignment_2_1 ) )
            // InternalArg.g:7160:2: ( rule__Trigger__ActionAssignment_2_1 )
            {
             before(grammarAccess.getTriggerAccess().getActionAssignment_2_1()); 
            // InternalArg.g:7161:2: ( rule__Trigger__ActionAssignment_2_1 )
            // InternalArg.g:7161:3: rule__Trigger__ActionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__ActionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getActionAssignment_2_1()); 

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
    // $ANTLR end "rule__Trigger__Group_2__1__Impl"


    // $ANTLR start "rule__Trigger__Group_3__0"
    // InternalArg.g:7170:1: rule__Trigger__Group_3__0 : rule__Trigger__Group_3__0__Impl rule__Trigger__Group_3__1 ;
    public final void rule__Trigger__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7174:1: ( rule__Trigger__Group_3__0__Impl rule__Trigger__Group_3__1 )
            // InternalArg.g:7175:2: rule__Trigger__Group_3__0__Impl rule__Trigger__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Trigger__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group_3__1();

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
    // $ANTLR end "rule__Trigger__Group_3__0"


    // $ANTLR start "rule__Trigger__Group_3__0__Impl"
    // InternalArg.g:7182:1: rule__Trigger__Group_3__0__Impl : ( 'display' ) ;
    public final void rule__Trigger__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7186:1: ( ( 'display' ) )
            // InternalArg.g:7187:1: ( 'display' )
            {
            // InternalArg.g:7187:1: ( 'display' )
            // InternalArg.g:7188:2: 'display'
            {
             before(grammarAccess.getTriggerAccess().getDisplayKeyword_3_0()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getTriggerAccess().getDisplayKeyword_3_0()); 

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
    // $ANTLR end "rule__Trigger__Group_3__0__Impl"


    // $ANTLR start "rule__Trigger__Group_3__1"
    // InternalArg.g:7197:1: rule__Trigger__Group_3__1 : rule__Trigger__Group_3__1__Impl ;
    public final void rule__Trigger__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7201:1: ( rule__Trigger__Group_3__1__Impl )
            // InternalArg.g:7202:2: rule__Trigger__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__Group_3__1__Impl();

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
    // $ANTLR end "rule__Trigger__Group_3__1"


    // $ANTLR start "rule__Trigger__Group_3__1__Impl"
    // InternalArg.g:7208:1: rule__Trigger__Group_3__1__Impl : ( ( rule__Trigger__MessageAssignment_3_1 ) ) ;
    public final void rule__Trigger__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7212:1: ( ( ( rule__Trigger__MessageAssignment_3_1 ) ) )
            // InternalArg.g:7213:1: ( ( rule__Trigger__MessageAssignment_3_1 ) )
            {
            // InternalArg.g:7213:1: ( ( rule__Trigger__MessageAssignment_3_1 ) )
            // InternalArg.g:7214:2: ( rule__Trigger__MessageAssignment_3_1 )
            {
             before(grammarAccess.getTriggerAccess().getMessageAssignment_3_1()); 
            // InternalArg.g:7215:2: ( rule__Trigger__MessageAssignment_3_1 )
            // InternalArg.g:7215:3: rule__Trigger__MessageAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__MessageAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getMessageAssignment_3_1()); 

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
    // $ANTLR end "rule__Trigger__Group_3__1__Impl"


    // $ANTLR start "rule__Trigger__Group_4__0"
    // InternalArg.g:7224:1: rule__Trigger__Group_4__0 : rule__Trigger__Group_4__0__Impl rule__Trigger__Group_4__1 ;
    public final void rule__Trigger__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7228:1: ( rule__Trigger__Group_4__0__Impl rule__Trigger__Group_4__1 )
            // InternalArg.g:7229:2: rule__Trigger__Group_4__0__Impl rule__Trigger__Group_4__1
            {
            pushFollow(FOLLOW_25);
            rule__Trigger__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group_4__1();

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
    // $ANTLR end "rule__Trigger__Group_4__0"


    // $ANTLR start "rule__Trigger__Group_4__0__Impl"
    // InternalArg.g:7236:1: rule__Trigger__Group_4__0__Impl : ( 'score' ) ;
    public final void rule__Trigger__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7240:1: ( ( 'score' ) )
            // InternalArg.g:7241:1: ( 'score' )
            {
            // InternalArg.g:7241:1: ( 'score' )
            // InternalArg.g:7242:2: 'score'
            {
             before(grammarAccess.getTriggerAccess().getScoreKeyword_4_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTriggerAccess().getScoreKeyword_4_0()); 

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
    // $ANTLR end "rule__Trigger__Group_4__0__Impl"


    // $ANTLR start "rule__Trigger__Group_4__1"
    // InternalArg.g:7251:1: rule__Trigger__Group_4__1 : rule__Trigger__Group_4__1__Impl ;
    public final void rule__Trigger__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7255:1: ( rule__Trigger__Group_4__1__Impl )
            // InternalArg.g:7256:2: rule__Trigger__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__Group_4__1__Impl();

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
    // $ANTLR end "rule__Trigger__Group_4__1"


    // $ANTLR start "rule__Trigger__Group_4__1__Impl"
    // InternalArg.g:7262:1: rule__Trigger__Group_4__1__Impl : ( ( rule__Trigger__ScoreChangeAssignment_4_1 ) ) ;
    public final void rule__Trigger__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7266:1: ( ( ( rule__Trigger__ScoreChangeAssignment_4_1 ) ) )
            // InternalArg.g:7267:1: ( ( rule__Trigger__ScoreChangeAssignment_4_1 ) )
            {
            // InternalArg.g:7267:1: ( ( rule__Trigger__ScoreChangeAssignment_4_1 ) )
            // InternalArg.g:7268:2: ( rule__Trigger__ScoreChangeAssignment_4_1 )
            {
             before(grammarAccess.getTriggerAccess().getScoreChangeAssignment_4_1()); 
            // InternalArg.g:7269:2: ( rule__Trigger__ScoreChangeAssignment_4_1 )
            // InternalArg.g:7269:3: rule__Trigger__ScoreChangeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__ScoreChangeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getScoreChangeAssignment_4_1()); 

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
    // $ANTLR end "rule__Trigger__Group_4__1__Impl"


    // $ANTLR start "rule__Trigger__Group_5__0"
    // InternalArg.g:7278:1: rule__Trigger__Group_5__0 : rule__Trigger__Group_5__0__Impl rule__Trigger__Group_5__1 ;
    public final void rule__Trigger__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7282:1: ( rule__Trigger__Group_5__0__Impl rule__Trigger__Group_5__1 )
            // InternalArg.g:7283:2: rule__Trigger__Group_5__0__Impl rule__Trigger__Group_5__1
            {
            pushFollow(FOLLOW_25);
            rule__Trigger__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group_5__1();

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
    // $ANTLR end "rule__Trigger__Group_5__0"


    // $ANTLR start "rule__Trigger__Group_5__0__Impl"
    // InternalArg.g:7290:1: rule__Trigger__Group_5__0__Impl : ( 'timeEach' ) ;
    public final void rule__Trigger__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7294:1: ( ( 'timeEach' ) )
            // InternalArg.g:7295:1: ( 'timeEach' )
            {
            // InternalArg.g:7295:1: ( 'timeEach' )
            // InternalArg.g:7296:2: 'timeEach'
            {
             before(grammarAccess.getTriggerAccess().getTimeEachKeyword_5_0()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getTriggerAccess().getTimeEachKeyword_5_0()); 

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
    // $ANTLR end "rule__Trigger__Group_5__0__Impl"


    // $ANTLR start "rule__Trigger__Group_5__1"
    // InternalArg.g:7305:1: rule__Trigger__Group_5__1 : rule__Trigger__Group_5__1__Impl ;
    public final void rule__Trigger__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7309:1: ( rule__Trigger__Group_5__1__Impl )
            // InternalArg.g:7310:2: rule__Trigger__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__Group_5__1__Impl();

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
    // $ANTLR end "rule__Trigger__Group_5__1"


    // $ANTLR start "rule__Trigger__Group_5__1__Impl"
    // InternalArg.g:7316:1: rule__Trigger__Group_5__1__Impl : ( ( rule__Trigger__TimeTriggerAssignment_5_1 ) ) ;
    public final void rule__Trigger__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7320:1: ( ( ( rule__Trigger__TimeTriggerAssignment_5_1 ) ) )
            // InternalArg.g:7321:1: ( ( rule__Trigger__TimeTriggerAssignment_5_1 ) )
            {
            // InternalArg.g:7321:1: ( ( rule__Trigger__TimeTriggerAssignment_5_1 ) )
            // InternalArg.g:7322:2: ( rule__Trigger__TimeTriggerAssignment_5_1 )
            {
             before(grammarAccess.getTriggerAccess().getTimeTriggerAssignment_5_1()); 
            // InternalArg.g:7323:2: ( rule__Trigger__TimeTriggerAssignment_5_1 )
            // InternalArg.g:7323:3: rule__Trigger__TimeTriggerAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__TimeTriggerAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getTimeTriggerAssignment_5_1()); 

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
    // $ANTLR end "rule__Trigger__Group_5__1__Impl"


    // $ANTLR start "rule__Trigger__Group_6__0"
    // InternalArg.g:7332:1: rule__Trigger__Group_6__0 : rule__Trigger__Group_6__0__Impl rule__Trigger__Group_6__1 ;
    public final void rule__Trigger__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7336:1: ( rule__Trigger__Group_6__0__Impl rule__Trigger__Group_6__1 )
            // InternalArg.g:7337:2: rule__Trigger__Group_6__0__Impl rule__Trigger__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Trigger__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group_6__1();

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
    // $ANTLR end "rule__Trigger__Group_6__0"


    // $ANTLR start "rule__Trigger__Group_6__0__Impl"
    // InternalArg.g:7344:1: rule__Trigger__Group_6__0__Impl : ( 'changes' ) ;
    public final void rule__Trigger__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7348:1: ( ( 'changes' ) )
            // InternalArg.g:7349:1: ( 'changes' )
            {
            // InternalArg.g:7349:1: ( 'changes' )
            // InternalArg.g:7350:2: 'changes'
            {
             before(grammarAccess.getTriggerAccess().getChangesKeyword_6_0()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getTriggerAccess().getChangesKeyword_6_0()); 

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
    // $ANTLR end "rule__Trigger__Group_6__0__Impl"


    // $ANTLR start "rule__Trigger__Group_6__1"
    // InternalArg.g:7359:1: rule__Trigger__Group_6__1 : rule__Trigger__Group_6__1__Impl rule__Trigger__Group_6__2 ;
    public final void rule__Trigger__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7363:1: ( rule__Trigger__Group_6__1__Impl rule__Trigger__Group_6__2 )
            // InternalArg.g:7364:2: rule__Trigger__Group_6__1__Impl rule__Trigger__Group_6__2
            {
            pushFollow(FOLLOW_71);
            rule__Trigger__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group_6__2();

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
    // $ANTLR end "rule__Trigger__Group_6__1"


    // $ANTLR start "rule__Trigger__Group_6__1__Impl"
    // InternalArg.g:7371:1: rule__Trigger__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Trigger__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7375:1: ( ( '{' ) )
            // InternalArg.g:7376:1: ( '{' )
            {
            // InternalArg.g:7376:1: ( '{' )
            // InternalArg.g:7377:2: '{'
            {
             before(grammarAccess.getTriggerAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTriggerAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__Trigger__Group_6__1__Impl"


    // $ANTLR start "rule__Trigger__Group_6__2"
    // InternalArg.g:7386:1: rule__Trigger__Group_6__2 : rule__Trigger__Group_6__2__Impl rule__Trigger__Group_6__3 ;
    public final void rule__Trigger__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7390:1: ( rule__Trigger__Group_6__2__Impl rule__Trigger__Group_6__3 )
            // InternalArg.g:7391:2: rule__Trigger__Group_6__2__Impl rule__Trigger__Group_6__3
            {
            pushFollow(FOLLOW_72);
            rule__Trigger__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group_6__3();

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
    // $ANTLR end "rule__Trigger__Group_6__2"


    // $ANTLR start "rule__Trigger__Group_6__2__Impl"
    // InternalArg.g:7398:1: rule__Trigger__Group_6__2__Impl : ( ( rule__Trigger__PhysicChangesAssignment_6_2 ) ) ;
    public final void rule__Trigger__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7402:1: ( ( ( rule__Trigger__PhysicChangesAssignment_6_2 ) ) )
            // InternalArg.g:7403:1: ( ( rule__Trigger__PhysicChangesAssignment_6_2 ) )
            {
            // InternalArg.g:7403:1: ( ( rule__Trigger__PhysicChangesAssignment_6_2 ) )
            // InternalArg.g:7404:2: ( rule__Trigger__PhysicChangesAssignment_6_2 )
            {
             before(grammarAccess.getTriggerAccess().getPhysicChangesAssignment_6_2()); 
            // InternalArg.g:7405:2: ( rule__Trigger__PhysicChangesAssignment_6_2 )
            // InternalArg.g:7405:3: rule__Trigger__PhysicChangesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__PhysicChangesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getPhysicChangesAssignment_6_2()); 

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
    // $ANTLR end "rule__Trigger__Group_6__2__Impl"


    // $ANTLR start "rule__Trigger__Group_6__3"
    // InternalArg.g:7413:1: rule__Trigger__Group_6__3 : rule__Trigger__Group_6__3__Impl rule__Trigger__Group_6__4 ;
    public final void rule__Trigger__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7417:1: ( rule__Trigger__Group_6__3__Impl rule__Trigger__Group_6__4 )
            // InternalArg.g:7418:2: rule__Trigger__Group_6__3__Impl rule__Trigger__Group_6__4
            {
            pushFollow(FOLLOW_72);
            rule__Trigger__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group_6__4();

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
    // $ANTLR end "rule__Trigger__Group_6__3"


    // $ANTLR start "rule__Trigger__Group_6__3__Impl"
    // InternalArg.g:7425:1: rule__Trigger__Group_6__3__Impl : ( ( rule__Trigger__PhysicChangesAssignment_6_3 )* ) ;
    public final void rule__Trigger__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7429:1: ( ( ( rule__Trigger__PhysicChangesAssignment_6_3 )* ) )
            // InternalArg.g:7430:1: ( ( rule__Trigger__PhysicChangesAssignment_6_3 )* )
            {
            // InternalArg.g:7430:1: ( ( rule__Trigger__PhysicChangesAssignment_6_3 )* )
            // InternalArg.g:7431:2: ( rule__Trigger__PhysicChangesAssignment_6_3 )*
            {
             before(grammarAccess.getTriggerAccess().getPhysicChangesAssignment_6_3()); 
            // InternalArg.g:7432:2: ( rule__Trigger__PhysicChangesAssignment_6_3 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==102) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalArg.g:7432:3: rule__Trigger__PhysicChangesAssignment_6_3
            	    {
            	    pushFollow(FOLLOW_73);
            	    rule__Trigger__PhysicChangesAssignment_6_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getTriggerAccess().getPhysicChangesAssignment_6_3()); 

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
    // $ANTLR end "rule__Trigger__Group_6__3__Impl"


    // $ANTLR start "rule__Trigger__Group_6__4"
    // InternalArg.g:7440:1: rule__Trigger__Group_6__4 : rule__Trigger__Group_6__4__Impl ;
    public final void rule__Trigger__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7444:1: ( rule__Trigger__Group_6__4__Impl )
            // InternalArg.g:7445:2: rule__Trigger__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__Group_6__4__Impl();

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
    // $ANTLR end "rule__Trigger__Group_6__4"


    // $ANTLR start "rule__Trigger__Group_6__4__Impl"
    // InternalArg.g:7451:1: rule__Trigger__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Trigger__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7455:1: ( ( '}' ) )
            // InternalArg.g:7456:1: ( '}' )
            {
            // InternalArg.g:7456:1: ( '}' )
            // InternalArg.g:7457:2: '}'
            {
             before(grammarAccess.getTriggerAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTriggerAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__Trigger__Group_6__4__Impl"


    // $ANTLR start "rule__Collision__Group__0"
    // InternalArg.g:7467:1: rule__Collision__Group__0 : rule__Collision__Group__0__Impl rule__Collision__Group__1 ;
    public final void rule__Collision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7471:1: ( rule__Collision__Group__0__Impl rule__Collision__Group__1 )
            // InternalArg.g:7472:2: rule__Collision__Group__0__Impl rule__Collision__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Collision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__1();

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
    // $ANTLR end "rule__Collision__Group__0"


    // $ANTLR start "rule__Collision__Group__0__Impl"
    // InternalArg.g:7479:1: rule__Collision__Group__0__Impl : ( 'element' ) ;
    public final void rule__Collision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7483:1: ( ( 'element' ) )
            // InternalArg.g:7484:1: ( 'element' )
            {
            // InternalArg.g:7484:1: ( 'element' )
            // InternalArg.g:7485:2: 'element'
            {
             before(grammarAccess.getCollisionAccess().getElementKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getElementKeyword_0()); 

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
    // $ANTLR end "rule__Collision__Group__0__Impl"


    // $ANTLR start "rule__Collision__Group__1"
    // InternalArg.g:7494:1: rule__Collision__Group__1 : rule__Collision__Group__1__Impl rule__Collision__Group__2 ;
    public final void rule__Collision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7498:1: ( rule__Collision__Group__1__Impl rule__Collision__Group__2 )
            // InternalArg.g:7499:2: rule__Collision__Group__1__Impl rule__Collision__Group__2
            {
            pushFollow(FOLLOW_74);
            rule__Collision__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__2();

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
    // $ANTLR end "rule__Collision__Group__1"


    // $ANTLR start "rule__Collision__Group__1__Impl"
    // InternalArg.g:7506:1: rule__Collision__Group__1__Impl : ( ( rule__Collision__ClassAAssignment_1 ) ) ;
    public final void rule__Collision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7510:1: ( ( ( rule__Collision__ClassAAssignment_1 ) ) )
            // InternalArg.g:7511:1: ( ( rule__Collision__ClassAAssignment_1 ) )
            {
            // InternalArg.g:7511:1: ( ( rule__Collision__ClassAAssignment_1 ) )
            // InternalArg.g:7512:2: ( rule__Collision__ClassAAssignment_1 )
            {
             before(grammarAccess.getCollisionAccess().getClassAAssignment_1()); 
            // InternalArg.g:7513:2: ( rule__Collision__ClassAAssignment_1 )
            // InternalArg.g:7513:3: rule__Collision__ClassAAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Collision__ClassAAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getClassAAssignment_1()); 

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
    // $ANTLR end "rule__Collision__Group__1__Impl"


    // $ANTLR start "rule__Collision__Group__2"
    // InternalArg.g:7521:1: rule__Collision__Group__2 : rule__Collision__Group__2__Impl rule__Collision__Group__3 ;
    public final void rule__Collision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7525:1: ( rule__Collision__Group__2__Impl rule__Collision__Group__3 )
            // InternalArg.g:7526:2: rule__Collision__Group__2__Impl rule__Collision__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Collision__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__3();

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
    // $ANTLR end "rule__Collision__Group__2"


    // $ANTLR start "rule__Collision__Group__2__Impl"
    // InternalArg.g:7533:1: rule__Collision__Group__2__Impl : ( 'to' ) ;
    public final void rule__Collision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7537:1: ( ( 'to' ) )
            // InternalArg.g:7538:1: ( 'to' )
            {
            // InternalArg.g:7538:1: ( 'to' )
            // InternalArg.g:7539:2: 'to'
            {
             before(grammarAccess.getCollisionAccess().getToKeyword_2()); 
            match(input,99,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getToKeyword_2()); 

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
    // $ANTLR end "rule__Collision__Group__2__Impl"


    // $ANTLR start "rule__Collision__Group__3"
    // InternalArg.g:7548:1: rule__Collision__Group__3 : rule__Collision__Group__3__Impl rule__Collision__Group__4 ;
    public final void rule__Collision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7552:1: ( rule__Collision__Group__3__Impl rule__Collision__Group__4 )
            // InternalArg.g:7553:2: rule__Collision__Group__3__Impl rule__Collision__Group__4
            {
            pushFollow(FOLLOW_66);
            rule__Collision__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__4();

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
    // $ANTLR end "rule__Collision__Group__3"


    // $ANTLR start "rule__Collision__Group__3__Impl"
    // InternalArg.g:7560:1: rule__Collision__Group__3__Impl : ( ( rule__Collision__ClassBAssignment_3 ) ) ;
    public final void rule__Collision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7564:1: ( ( ( rule__Collision__ClassBAssignment_3 ) ) )
            // InternalArg.g:7565:1: ( ( rule__Collision__ClassBAssignment_3 ) )
            {
            // InternalArg.g:7565:1: ( ( rule__Collision__ClassBAssignment_3 ) )
            // InternalArg.g:7566:2: ( rule__Collision__ClassBAssignment_3 )
            {
             before(grammarAccess.getCollisionAccess().getClassBAssignment_3()); 
            // InternalArg.g:7567:2: ( rule__Collision__ClassBAssignment_3 )
            // InternalArg.g:7567:3: rule__Collision__ClassBAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Collision__ClassBAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getClassBAssignment_3()); 

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
    // $ANTLR end "rule__Collision__Group__3__Impl"


    // $ANTLR start "rule__Collision__Group__4"
    // InternalArg.g:7575:1: rule__Collision__Group__4 : rule__Collision__Group__4__Impl rule__Collision__Group__5 ;
    public final void rule__Collision__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7579:1: ( rule__Collision__Group__4__Impl rule__Collision__Group__5 )
            // InternalArg.g:7580:2: rule__Collision__Group__4__Impl rule__Collision__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Collision__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__5();

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
    // $ANTLR end "rule__Collision__Group__4"


    // $ANTLR start "rule__Collision__Group__4__Impl"
    // InternalArg.g:7587:1: rule__Collision__Group__4__Impl : ( '->' ) ;
    public final void rule__Collision__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7591:1: ( ( '->' ) )
            // InternalArg.g:7592:1: ( '->' )
            {
            // InternalArg.g:7592:1: ( '->' )
            // InternalArg.g:7593:2: '->'
            {
             before(grammarAccess.getCollisionAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

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
    // $ANTLR end "rule__Collision__Group__4__Impl"


    // $ANTLR start "rule__Collision__Group__5"
    // InternalArg.g:7602:1: rule__Collision__Group__5 : rule__Collision__Group__5__Impl ;
    public final void rule__Collision__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7606:1: ( rule__Collision__Group__5__Impl )
            // InternalArg.g:7607:2: rule__Collision__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__5__Impl();

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
    // $ANTLR end "rule__Collision__Group__5"


    // $ANTLR start "rule__Collision__Group__5__Impl"
    // InternalArg.g:7613:1: rule__Collision__Group__5__Impl : ( ( rule__Collision__ActionAssignment_5 ) ) ;
    public final void rule__Collision__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7617:1: ( ( ( rule__Collision__ActionAssignment_5 ) ) )
            // InternalArg.g:7618:1: ( ( rule__Collision__ActionAssignment_5 ) )
            {
            // InternalArg.g:7618:1: ( ( rule__Collision__ActionAssignment_5 ) )
            // InternalArg.g:7619:2: ( rule__Collision__ActionAssignment_5 )
            {
             before(grammarAccess.getCollisionAccess().getActionAssignment_5()); 
            // InternalArg.g:7620:2: ( rule__Collision__ActionAssignment_5 )
            // InternalArg.g:7620:3: rule__Collision__ActionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Collision__ActionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getActionAssignment_5()); 

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
    // $ANTLR end "rule__Collision__Group__5__Impl"


    // $ANTLR start "rule__ObjInit__Group__0"
    // InternalArg.g:7629:1: rule__ObjInit__Group__0 : rule__ObjInit__Group__0__Impl rule__ObjInit__Group__1 ;
    public final void rule__ObjInit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7633:1: ( rule__ObjInit__Group__0__Impl rule__ObjInit__Group__1 )
            // InternalArg.g:7634:2: rule__ObjInit__Group__0__Impl rule__ObjInit__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ObjInit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group__1();

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
    // $ANTLR end "rule__ObjInit__Group__0"


    // $ANTLR start "rule__ObjInit__Group__0__Impl"
    // InternalArg.g:7641:1: rule__ObjInit__Group__0__Impl : ( ( rule__ObjInit__NameAssignment_0 ) ) ;
    public final void rule__ObjInit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7645:1: ( ( ( rule__ObjInit__NameAssignment_0 ) ) )
            // InternalArg.g:7646:1: ( ( rule__ObjInit__NameAssignment_0 ) )
            {
            // InternalArg.g:7646:1: ( ( rule__ObjInit__NameAssignment_0 ) )
            // InternalArg.g:7647:2: ( rule__ObjInit__NameAssignment_0 )
            {
             before(grammarAccess.getObjInitAccess().getNameAssignment_0()); 
            // InternalArg.g:7648:2: ( rule__ObjInit__NameAssignment_0 )
            // InternalArg.g:7648:3: rule__ObjInit__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjInitAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ObjInit__Group__0__Impl"


    // $ANTLR start "rule__ObjInit__Group__1"
    // InternalArg.g:7656:1: rule__ObjInit__Group__1 : rule__ObjInit__Group__1__Impl rule__ObjInit__Group__2 ;
    public final void rule__ObjInit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7660:1: ( rule__ObjInit__Group__1__Impl rule__ObjInit__Group__2 )
            // InternalArg.g:7661:2: rule__ObjInit__Group__1__Impl rule__ObjInit__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ObjInit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group__2();

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
    // $ANTLR end "rule__ObjInit__Group__1"


    // $ANTLR start "rule__ObjInit__Group__1__Impl"
    // InternalArg.g:7668:1: rule__ObjInit__Group__1__Impl : ( ':' ) ;
    public final void rule__ObjInit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7672:1: ( ( ':' ) )
            // InternalArg.g:7673:1: ( ':' )
            {
            // InternalArg.g:7673:1: ( ':' )
            // InternalArg.g:7674:2: ':'
            {
             before(grammarAccess.getObjInitAccess().getColonKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ObjInit__Group__1__Impl"


    // $ANTLR start "rule__ObjInit__Group__2"
    // InternalArg.g:7683:1: rule__ObjInit__Group__2 : rule__ObjInit__Group__2__Impl rule__ObjInit__Group__3 ;
    public final void rule__ObjInit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7687:1: ( rule__ObjInit__Group__2__Impl rule__ObjInit__Group__3 )
            // InternalArg.g:7688:2: rule__ObjInit__Group__2__Impl rule__ObjInit__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ObjInit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group__3();

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
    // $ANTLR end "rule__ObjInit__Group__2"


    // $ANTLR start "rule__ObjInit__Group__2__Impl"
    // InternalArg.g:7695:1: rule__ObjInit__Group__2__Impl : ( ( rule__ObjInit__ClassAssignment_2 ) ) ;
    public final void rule__ObjInit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7699:1: ( ( ( rule__ObjInit__ClassAssignment_2 ) ) )
            // InternalArg.g:7700:1: ( ( rule__ObjInit__ClassAssignment_2 ) )
            {
            // InternalArg.g:7700:1: ( ( rule__ObjInit__ClassAssignment_2 ) )
            // InternalArg.g:7701:2: ( rule__ObjInit__ClassAssignment_2 )
            {
             before(grammarAccess.getObjInitAccess().getClassAssignment_2()); 
            // InternalArg.g:7702:2: ( rule__ObjInit__ClassAssignment_2 )
            // InternalArg.g:7702:3: rule__ObjInit__ClassAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__ClassAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjInitAccess().getClassAssignment_2()); 

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
    // $ANTLR end "rule__ObjInit__Group__2__Impl"


    // $ANTLR start "rule__ObjInit__Group__3"
    // InternalArg.g:7710:1: rule__ObjInit__Group__3 : rule__ObjInit__Group__3__Impl rule__ObjInit__Group__4 ;
    public final void rule__ObjInit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7714:1: ( rule__ObjInit__Group__3__Impl rule__ObjInit__Group__4 )
            // InternalArg.g:7715:2: rule__ObjInit__Group__3__Impl rule__ObjInit__Group__4
            {
            pushFollow(FOLLOW_75);
            rule__ObjInit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group__4();

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
    // $ANTLR end "rule__ObjInit__Group__3"


    // $ANTLR start "rule__ObjInit__Group__3__Impl"
    // InternalArg.g:7722:1: rule__ObjInit__Group__3__Impl : ( '[' ) ;
    public final void rule__ObjInit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7726:1: ( ( '[' ) )
            // InternalArg.g:7727:1: ( '[' )
            {
            // InternalArg.g:7727:1: ( '[' )
            // InternalArg.g:7728:2: '['
            {
             before(grammarAccess.getObjInitAccess().getLeftSquareBracketKeyword_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getLeftSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__ObjInit__Group__3__Impl"


    // $ANTLR start "rule__ObjInit__Group__4"
    // InternalArg.g:7737:1: rule__ObjInit__Group__4 : rule__ObjInit__Group__4__Impl rule__ObjInit__Group__5 ;
    public final void rule__ObjInit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7741:1: ( rule__ObjInit__Group__4__Impl rule__ObjInit__Group__5 )
            // InternalArg.g:7742:2: rule__ObjInit__Group__4__Impl rule__ObjInit__Group__5
            {
            pushFollow(FOLLOW_65);
            rule__ObjInit__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group__5();

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
    // $ANTLR end "rule__ObjInit__Group__4"


    // $ANTLR start "rule__ObjInit__Group__4__Impl"
    // InternalArg.g:7749:1: rule__ObjInit__Group__4__Impl : ( ( rule__ObjInit__PosXAssignment_4 ) ) ;
    public final void rule__ObjInit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7753:1: ( ( ( rule__ObjInit__PosXAssignment_4 ) ) )
            // InternalArg.g:7754:1: ( ( rule__ObjInit__PosXAssignment_4 ) )
            {
            // InternalArg.g:7754:1: ( ( rule__ObjInit__PosXAssignment_4 ) )
            // InternalArg.g:7755:2: ( rule__ObjInit__PosXAssignment_4 )
            {
             before(grammarAccess.getObjInitAccess().getPosXAssignment_4()); 
            // InternalArg.g:7756:2: ( rule__ObjInit__PosXAssignment_4 )
            // InternalArg.g:7756:3: rule__ObjInit__PosXAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__PosXAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getObjInitAccess().getPosXAssignment_4()); 

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
    // $ANTLR end "rule__ObjInit__Group__4__Impl"


    // $ANTLR start "rule__ObjInit__Group__5"
    // InternalArg.g:7764:1: rule__ObjInit__Group__5 : rule__ObjInit__Group__5__Impl rule__ObjInit__Group__6 ;
    public final void rule__ObjInit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7768:1: ( rule__ObjInit__Group__5__Impl rule__ObjInit__Group__6 )
            // InternalArg.g:7769:2: rule__ObjInit__Group__5__Impl rule__ObjInit__Group__6
            {
            pushFollow(FOLLOW_75);
            rule__ObjInit__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group__6();

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
    // $ANTLR end "rule__ObjInit__Group__5"


    // $ANTLR start "rule__ObjInit__Group__5__Impl"
    // InternalArg.g:7776:1: rule__ObjInit__Group__5__Impl : ( ',' ) ;
    public final void rule__ObjInit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7780:1: ( ( ',' ) )
            // InternalArg.g:7781:1: ( ',' )
            {
            // InternalArg.g:7781:1: ( ',' )
            // InternalArg.g:7782:2: ','
            {
             before(grammarAccess.getObjInitAccess().getCommaKeyword_5()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__ObjInit__Group__5__Impl"


    // $ANTLR start "rule__ObjInit__Group__6"
    // InternalArg.g:7791:1: rule__ObjInit__Group__6 : rule__ObjInit__Group__6__Impl rule__ObjInit__Group__7 ;
    public final void rule__ObjInit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7795:1: ( rule__ObjInit__Group__6__Impl rule__ObjInit__Group__7 )
            // InternalArg.g:7796:2: rule__ObjInit__Group__6__Impl rule__ObjInit__Group__7
            {
            pushFollow(FOLLOW_65);
            rule__ObjInit__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group__7();

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
    // $ANTLR end "rule__ObjInit__Group__6"


    // $ANTLR start "rule__ObjInit__Group__6__Impl"
    // InternalArg.g:7803:1: rule__ObjInit__Group__6__Impl : ( ( rule__ObjInit__PosYAssignment_6 ) ) ;
    public final void rule__ObjInit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7807:1: ( ( ( rule__ObjInit__PosYAssignment_6 ) ) )
            // InternalArg.g:7808:1: ( ( rule__ObjInit__PosYAssignment_6 ) )
            {
            // InternalArg.g:7808:1: ( ( rule__ObjInit__PosYAssignment_6 ) )
            // InternalArg.g:7809:2: ( rule__ObjInit__PosYAssignment_6 )
            {
             before(grammarAccess.getObjInitAccess().getPosYAssignment_6()); 
            // InternalArg.g:7810:2: ( rule__ObjInit__PosYAssignment_6 )
            // InternalArg.g:7810:3: rule__ObjInit__PosYAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__PosYAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getObjInitAccess().getPosYAssignment_6()); 

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
    // $ANTLR end "rule__ObjInit__Group__6__Impl"


    // $ANTLR start "rule__ObjInit__Group__7"
    // InternalArg.g:7818:1: rule__ObjInit__Group__7 : rule__ObjInit__Group__7__Impl rule__ObjInit__Group__8 ;
    public final void rule__ObjInit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7822:1: ( rule__ObjInit__Group__7__Impl rule__ObjInit__Group__8 )
            // InternalArg.g:7823:2: rule__ObjInit__Group__7__Impl rule__ObjInit__Group__8
            {
            pushFollow(FOLLOW_75);
            rule__ObjInit__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group__8();

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
    // $ANTLR end "rule__ObjInit__Group__7"


    // $ANTLR start "rule__ObjInit__Group__7__Impl"
    // InternalArg.g:7830:1: rule__ObjInit__Group__7__Impl : ( ',' ) ;
    public final void rule__ObjInit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7834:1: ( ( ',' ) )
            // InternalArg.g:7835:1: ( ',' )
            {
            // InternalArg.g:7835:1: ( ',' )
            // InternalArg.g:7836:2: ','
            {
             before(grammarAccess.getObjInitAccess().getCommaKeyword_7()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getCommaKeyword_7()); 

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
    // $ANTLR end "rule__ObjInit__Group__7__Impl"


    // $ANTLR start "rule__ObjInit__Group__8"
    // InternalArg.g:7845:1: rule__ObjInit__Group__8 : rule__ObjInit__Group__8__Impl rule__ObjInit__Group__9 ;
    public final void rule__ObjInit__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7849:1: ( rule__ObjInit__Group__8__Impl rule__ObjInit__Group__9 )
            // InternalArg.g:7850:2: rule__ObjInit__Group__8__Impl rule__ObjInit__Group__9
            {
            pushFollow(FOLLOW_76);
            rule__ObjInit__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group__9();

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
    // $ANTLR end "rule__ObjInit__Group__8"


    // $ANTLR start "rule__ObjInit__Group__8__Impl"
    // InternalArg.g:7857:1: rule__ObjInit__Group__8__Impl : ( ( rule__ObjInit__PosZAssignment_8 ) ) ;
    public final void rule__ObjInit__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7861:1: ( ( ( rule__ObjInit__PosZAssignment_8 ) ) )
            // InternalArg.g:7862:1: ( ( rule__ObjInit__PosZAssignment_8 ) )
            {
            // InternalArg.g:7862:1: ( ( rule__ObjInit__PosZAssignment_8 ) )
            // InternalArg.g:7863:2: ( rule__ObjInit__PosZAssignment_8 )
            {
             before(grammarAccess.getObjInitAccess().getPosZAssignment_8()); 
            // InternalArg.g:7864:2: ( rule__ObjInit__PosZAssignment_8 )
            // InternalArg.g:7864:3: rule__ObjInit__PosZAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__PosZAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getObjInitAccess().getPosZAssignment_8()); 

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
    // $ANTLR end "rule__ObjInit__Group__8__Impl"


    // $ANTLR start "rule__ObjInit__Group__9"
    // InternalArg.g:7872:1: rule__ObjInit__Group__9 : rule__ObjInit__Group__9__Impl rule__ObjInit__Group__10 ;
    public final void rule__ObjInit__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7876:1: ( rule__ObjInit__Group__9__Impl rule__ObjInit__Group__10 )
            // InternalArg.g:7877:2: rule__ObjInit__Group__9__Impl rule__ObjInit__Group__10
            {
            pushFollow(FOLLOW_76);
            rule__ObjInit__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group__10();

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
    // $ANTLR end "rule__ObjInit__Group__9"


    // $ANTLR start "rule__ObjInit__Group__9__Impl"
    // InternalArg.g:7884:1: rule__ObjInit__Group__9__Impl : ( ( rule__ObjInit__Group_9__0 )? ) ;
    public final void rule__ObjInit__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7888:1: ( ( ( rule__ObjInit__Group_9__0 )? ) )
            // InternalArg.g:7889:1: ( ( rule__ObjInit__Group_9__0 )? )
            {
            // InternalArg.g:7889:1: ( ( rule__ObjInit__Group_9__0 )? )
            // InternalArg.g:7890:2: ( rule__ObjInit__Group_9__0 )?
            {
             before(grammarAccess.getObjInitAccess().getGroup_9()); 
            // InternalArg.g:7891:2: ( rule__ObjInit__Group_9__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==91) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalArg.g:7891:3: rule__ObjInit__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjInit__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjInitAccess().getGroup_9()); 

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
    // $ANTLR end "rule__ObjInit__Group__9__Impl"


    // $ANTLR start "rule__ObjInit__Group__10"
    // InternalArg.g:7899:1: rule__ObjInit__Group__10 : rule__ObjInit__Group__10__Impl rule__ObjInit__Group__11 ;
    public final void rule__ObjInit__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7903:1: ( rule__ObjInit__Group__10__Impl rule__ObjInit__Group__11 )
            // InternalArg.g:7904:2: rule__ObjInit__Group__10__Impl rule__ObjInit__Group__11
            {
            pushFollow(FOLLOW_77);
            rule__ObjInit__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group__11();

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
    // $ANTLR end "rule__ObjInit__Group__10"


    // $ANTLR start "rule__ObjInit__Group__10__Impl"
    // InternalArg.g:7911:1: rule__ObjInit__Group__10__Impl : ( ']' ) ;
    public final void rule__ObjInit__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7915:1: ( ( ']' ) )
            // InternalArg.g:7916:1: ( ']' )
            {
            // InternalArg.g:7916:1: ( ']' )
            // InternalArg.g:7917:2: ']'
            {
             before(grammarAccess.getObjInitAccess().getRightSquareBracketKeyword_10()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getRightSquareBracketKeyword_10()); 

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
    // $ANTLR end "rule__ObjInit__Group__10__Impl"


    // $ANTLR start "rule__ObjInit__Group__11"
    // InternalArg.g:7926:1: rule__ObjInit__Group__11 : rule__ObjInit__Group__11__Impl rule__ObjInit__Group__12 ;
    public final void rule__ObjInit__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7930:1: ( rule__ObjInit__Group__11__Impl rule__ObjInit__Group__12 )
            // InternalArg.g:7931:2: rule__ObjInit__Group__11__Impl rule__ObjInit__Group__12
            {
            pushFollow(FOLLOW_77);
            rule__ObjInit__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group__12();

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
    // $ANTLR end "rule__ObjInit__Group__11"


    // $ANTLR start "rule__ObjInit__Group__11__Impl"
    // InternalArg.g:7938:1: rule__ObjInit__Group__11__Impl : ( ( rule__ObjInit__Group_11__0 )? ) ;
    public final void rule__ObjInit__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7942:1: ( ( ( rule__ObjInit__Group_11__0 )? ) )
            // InternalArg.g:7943:1: ( ( rule__ObjInit__Group_11__0 )? )
            {
            // InternalArg.g:7943:1: ( ( rule__ObjInit__Group_11__0 )? )
            // InternalArg.g:7944:2: ( rule__ObjInit__Group_11__0 )?
            {
             before(grammarAccess.getObjInitAccess().getGroup_11()); 
            // InternalArg.g:7945:2: ( rule__ObjInit__Group_11__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==100) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalArg.g:7945:3: rule__ObjInit__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjInit__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjInitAccess().getGroup_11()); 

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
    // $ANTLR end "rule__ObjInit__Group__11__Impl"


    // $ANTLR start "rule__ObjInit__Group__12"
    // InternalArg.g:7953:1: rule__ObjInit__Group__12 : rule__ObjInit__Group__12__Impl ;
    public final void rule__ObjInit__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7957:1: ( rule__ObjInit__Group__12__Impl )
            // InternalArg.g:7958:2: rule__ObjInit__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__Group__12__Impl();

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
    // $ANTLR end "rule__ObjInit__Group__12"


    // $ANTLR start "rule__ObjInit__Group__12__Impl"
    // InternalArg.g:7964:1: rule__ObjInit__Group__12__Impl : ( ( rule__ObjInit__Group_12__0 )? ) ;
    public final void rule__ObjInit__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7968:1: ( ( ( rule__ObjInit__Group_12__0 )? ) )
            // InternalArg.g:7969:1: ( ( rule__ObjInit__Group_12__0 )? )
            {
            // InternalArg.g:7969:1: ( ( rule__ObjInit__Group_12__0 )? )
            // InternalArg.g:7970:2: ( rule__ObjInit__Group_12__0 )?
            {
             before(grammarAccess.getObjInitAccess().getGroup_12()); 
            // InternalArg.g:7971:2: ( rule__ObjInit__Group_12__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==101) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalArg.g:7971:3: rule__ObjInit__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjInit__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjInitAccess().getGroup_12()); 

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
    // $ANTLR end "rule__ObjInit__Group__12__Impl"


    // $ANTLR start "rule__ObjInit__Group_9__0"
    // InternalArg.g:7980:1: rule__ObjInit__Group_9__0 : rule__ObjInit__Group_9__0__Impl rule__ObjInit__Group_9__1 ;
    public final void rule__ObjInit__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7984:1: ( rule__ObjInit__Group_9__0__Impl rule__ObjInit__Group_9__1 )
            // InternalArg.g:7985:2: rule__ObjInit__Group_9__0__Impl rule__ObjInit__Group_9__1
            {
            pushFollow(FOLLOW_25);
            rule__ObjInit__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_9__1();

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
    // $ANTLR end "rule__ObjInit__Group_9__0"


    // $ANTLR start "rule__ObjInit__Group_9__0__Impl"
    // InternalArg.g:7992:1: rule__ObjInit__Group_9__0__Impl : ( ',' ) ;
    public final void rule__ObjInit__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:7996:1: ( ( ',' ) )
            // InternalArg.g:7997:1: ( ',' )
            {
            // InternalArg.g:7997:1: ( ',' )
            // InternalArg.g:7998:2: ','
            {
             before(grammarAccess.getObjInitAccess().getCommaKeyword_9_0()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getCommaKeyword_9_0()); 

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
    // $ANTLR end "rule__ObjInit__Group_9__0__Impl"


    // $ANTLR start "rule__ObjInit__Group_9__1"
    // InternalArg.g:8007:1: rule__ObjInit__Group_9__1 : rule__ObjInit__Group_9__1__Impl ;
    public final void rule__ObjInit__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8011:1: ( rule__ObjInit__Group_9__1__Impl )
            // InternalArg.g:8012:2: rule__ObjInit__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_9__1__Impl();

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
    // $ANTLR end "rule__ObjInit__Group_9__1"


    // $ANTLR start "rule__ObjInit__Group_9__1__Impl"
    // InternalArg.g:8018:1: rule__ObjInit__Group_9__1__Impl : ( ( rule__ObjInit__RotationAssignment_9_1 ) ) ;
    public final void rule__ObjInit__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8022:1: ( ( ( rule__ObjInit__RotationAssignment_9_1 ) ) )
            // InternalArg.g:8023:1: ( ( rule__ObjInit__RotationAssignment_9_1 ) )
            {
            // InternalArg.g:8023:1: ( ( rule__ObjInit__RotationAssignment_9_1 ) )
            // InternalArg.g:8024:2: ( rule__ObjInit__RotationAssignment_9_1 )
            {
             before(grammarAccess.getObjInitAccess().getRotationAssignment_9_1()); 
            // InternalArg.g:8025:2: ( rule__ObjInit__RotationAssignment_9_1 )
            // InternalArg.g:8025:3: rule__ObjInit__RotationAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__RotationAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getObjInitAccess().getRotationAssignment_9_1()); 

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
    // $ANTLR end "rule__ObjInit__Group_9__1__Impl"


    // $ANTLR start "rule__ObjInit__Group_11__0"
    // InternalArg.g:8034:1: rule__ObjInit__Group_11__0 : rule__ObjInit__Group_11__0__Impl rule__ObjInit__Group_11__1 ;
    public final void rule__ObjInit__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8038:1: ( rule__ObjInit__Group_11__0__Impl rule__ObjInit__Group_11__1 )
            // InternalArg.g:8039:2: rule__ObjInit__Group_11__0__Impl rule__ObjInit__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__ObjInit__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_11__1();

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
    // $ANTLR end "rule__ObjInit__Group_11__0"


    // $ANTLR start "rule__ObjInit__Group_11__0__Impl"
    // InternalArg.g:8046:1: rule__ObjInit__Group_11__0__Impl : ( 'attributes' ) ;
    public final void rule__ObjInit__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8050:1: ( ( 'attributes' ) )
            // InternalArg.g:8051:1: ( 'attributes' )
            {
            // InternalArg.g:8051:1: ( 'attributes' )
            // InternalArg.g:8052:2: 'attributes'
            {
             before(grammarAccess.getObjInitAccess().getAttributesKeyword_11_0()); 
            match(input,100,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getAttributesKeyword_11_0()); 

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
    // $ANTLR end "rule__ObjInit__Group_11__0__Impl"


    // $ANTLR start "rule__ObjInit__Group_11__1"
    // InternalArg.g:8061:1: rule__ObjInit__Group_11__1 : rule__ObjInit__Group_11__1__Impl rule__ObjInit__Group_11__2 ;
    public final void rule__ObjInit__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8065:1: ( rule__ObjInit__Group_11__1__Impl rule__ObjInit__Group_11__2 )
            // InternalArg.g:8066:2: rule__ObjInit__Group_11__1__Impl rule__ObjInit__Group_11__2
            {
            pushFollow(FOLLOW_3);
            rule__ObjInit__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_11__2();

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
    // $ANTLR end "rule__ObjInit__Group_11__1"


    // $ANTLR start "rule__ObjInit__Group_11__1__Impl"
    // InternalArg.g:8073:1: rule__ObjInit__Group_11__1__Impl : ( '{' ) ;
    public final void rule__ObjInit__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8077:1: ( ( '{' ) )
            // InternalArg.g:8078:1: ( '{' )
            {
            // InternalArg.g:8078:1: ( '{' )
            // InternalArg.g:8079:2: '{'
            {
             before(grammarAccess.getObjInitAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getLeftCurlyBracketKeyword_11_1()); 

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
    // $ANTLR end "rule__ObjInit__Group_11__1__Impl"


    // $ANTLR start "rule__ObjInit__Group_11__2"
    // InternalArg.g:8088:1: rule__ObjInit__Group_11__2 : rule__ObjInit__Group_11__2__Impl rule__ObjInit__Group_11__3 ;
    public final void rule__ObjInit__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8092:1: ( rule__ObjInit__Group_11__2__Impl rule__ObjInit__Group_11__3 )
            // InternalArg.g:8093:2: rule__ObjInit__Group_11__2__Impl rule__ObjInit__Group_11__3
            {
            pushFollow(FOLLOW_78);
            rule__ObjInit__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_11__3();

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
    // $ANTLR end "rule__ObjInit__Group_11__2"


    // $ANTLR start "rule__ObjInit__Group_11__2__Impl"
    // InternalArg.g:8100:1: rule__ObjInit__Group_11__2__Impl : ( ( rule__ObjInit__AttributeAssignment_11_2 ) ) ;
    public final void rule__ObjInit__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8104:1: ( ( ( rule__ObjInit__AttributeAssignment_11_2 ) ) )
            // InternalArg.g:8105:1: ( ( rule__ObjInit__AttributeAssignment_11_2 ) )
            {
            // InternalArg.g:8105:1: ( ( rule__ObjInit__AttributeAssignment_11_2 ) )
            // InternalArg.g:8106:2: ( rule__ObjInit__AttributeAssignment_11_2 )
            {
             before(grammarAccess.getObjInitAccess().getAttributeAssignment_11_2()); 
            // InternalArg.g:8107:2: ( rule__ObjInit__AttributeAssignment_11_2 )
            // InternalArg.g:8107:3: rule__ObjInit__AttributeAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__AttributeAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getObjInitAccess().getAttributeAssignment_11_2()); 

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
    // $ANTLR end "rule__ObjInit__Group_11__2__Impl"


    // $ANTLR start "rule__ObjInit__Group_11__3"
    // InternalArg.g:8115:1: rule__ObjInit__Group_11__3 : rule__ObjInit__Group_11__3__Impl rule__ObjInit__Group_11__4 ;
    public final void rule__ObjInit__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8119:1: ( rule__ObjInit__Group_11__3__Impl rule__ObjInit__Group_11__4 )
            // InternalArg.g:8120:2: rule__ObjInit__Group_11__3__Impl rule__ObjInit__Group_11__4
            {
            pushFollow(FOLLOW_78);
            rule__ObjInit__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_11__4();

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
    // $ANTLR end "rule__ObjInit__Group_11__3"


    // $ANTLR start "rule__ObjInit__Group_11__3__Impl"
    // InternalArg.g:8127:1: rule__ObjInit__Group_11__3__Impl : ( ( rule__ObjInit__Group_11_3__0 )* ) ;
    public final void rule__ObjInit__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8131:1: ( ( ( rule__ObjInit__Group_11_3__0 )* ) )
            // InternalArg.g:8132:1: ( ( rule__ObjInit__Group_11_3__0 )* )
            {
            // InternalArg.g:8132:1: ( ( rule__ObjInit__Group_11_3__0 )* )
            // InternalArg.g:8133:2: ( rule__ObjInit__Group_11_3__0 )*
            {
             before(grammarAccess.getObjInitAccess().getGroup_11_3()); 
            // InternalArg.g:8134:2: ( rule__ObjInit__Group_11_3__0 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==91) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalArg.g:8134:3: rule__ObjInit__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_79);
            	    rule__ObjInit__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getObjInitAccess().getGroup_11_3()); 

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
    // $ANTLR end "rule__ObjInit__Group_11__3__Impl"


    // $ANTLR start "rule__ObjInit__Group_11__4"
    // InternalArg.g:8142:1: rule__ObjInit__Group_11__4 : rule__ObjInit__Group_11__4__Impl ;
    public final void rule__ObjInit__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8146:1: ( rule__ObjInit__Group_11__4__Impl )
            // InternalArg.g:8147:2: rule__ObjInit__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_11__4__Impl();

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
    // $ANTLR end "rule__ObjInit__Group_11__4"


    // $ANTLR start "rule__ObjInit__Group_11__4__Impl"
    // InternalArg.g:8153:1: rule__ObjInit__Group_11__4__Impl : ( '}' ) ;
    public final void rule__ObjInit__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8157:1: ( ( '}' ) )
            // InternalArg.g:8158:1: ( '}' )
            {
            // InternalArg.g:8158:1: ( '}' )
            // InternalArg.g:8159:2: '}'
            {
             before(grammarAccess.getObjInitAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getRightCurlyBracketKeyword_11_4()); 

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
    // $ANTLR end "rule__ObjInit__Group_11__4__Impl"


    // $ANTLR start "rule__ObjInit__Group_11_3__0"
    // InternalArg.g:8169:1: rule__ObjInit__Group_11_3__0 : rule__ObjInit__Group_11_3__0__Impl rule__ObjInit__Group_11_3__1 ;
    public final void rule__ObjInit__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8173:1: ( rule__ObjInit__Group_11_3__0__Impl rule__ObjInit__Group_11_3__1 )
            // InternalArg.g:8174:2: rule__ObjInit__Group_11_3__0__Impl rule__ObjInit__Group_11_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ObjInit__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_11_3__1();

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
    // $ANTLR end "rule__ObjInit__Group_11_3__0"


    // $ANTLR start "rule__ObjInit__Group_11_3__0__Impl"
    // InternalArg.g:8181:1: rule__ObjInit__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__ObjInit__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8185:1: ( ( ',' ) )
            // InternalArg.g:8186:1: ( ',' )
            {
            // InternalArg.g:8186:1: ( ',' )
            // InternalArg.g:8187:2: ','
            {
             before(grammarAccess.getObjInitAccess().getCommaKeyword_11_3_0()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getCommaKeyword_11_3_0()); 

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
    // $ANTLR end "rule__ObjInit__Group_11_3__0__Impl"


    // $ANTLR start "rule__ObjInit__Group_11_3__1"
    // InternalArg.g:8196:1: rule__ObjInit__Group_11_3__1 : rule__ObjInit__Group_11_3__1__Impl ;
    public final void rule__ObjInit__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8200:1: ( rule__ObjInit__Group_11_3__1__Impl )
            // InternalArg.g:8201:2: rule__ObjInit__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_11_3__1__Impl();

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
    // $ANTLR end "rule__ObjInit__Group_11_3__1"


    // $ANTLR start "rule__ObjInit__Group_11_3__1__Impl"
    // InternalArg.g:8207:1: rule__ObjInit__Group_11_3__1__Impl : ( ( rule__ObjInit__AttributeAssignment_11_3_1 ) ) ;
    public final void rule__ObjInit__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8211:1: ( ( ( rule__ObjInit__AttributeAssignment_11_3_1 ) ) )
            // InternalArg.g:8212:1: ( ( rule__ObjInit__AttributeAssignment_11_3_1 ) )
            {
            // InternalArg.g:8212:1: ( ( rule__ObjInit__AttributeAssignment_11_3_1 ) )
            // InternalArg.g:8213:2: ( rule__ObjInit__AttributeAssignment_11_3_1 )
            {
             before(grammarAccess.getObjInitAccess().getAttributeAssignment_11_3_1()); 
            // InternalArg.g:8214:2: ( rule__ObjInit__AttributeAssignment_11_3_1 )
            // InternalArg.g:8214:3: rule__ObjInit__AttributeAssignment_11_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__AttributeAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getObjInitAccess().getAttributeAssignment_11_3_1()); 

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
    // $ANTLR end "rule__ObjInit__Group_11_3__1__Impl"


    // $ANTLR start "rule__ObjInit__Group_12__0"
    // InternalArg.g:8223:1: rule__ObjInit__Group_12__0 : rule__ObjInit__Group_12__0__Impl rule__ObjInit__Group_12__1 ;
    public final void rule__ObjInit__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8227:1: ( rule__ObjInit__Group_12__0__Impl rule__ObjInit__Group_12__1 )
            // InternalArg.g:8228:2: rule__ObjInit__Group_12__0__Impl rule__ObjInit__Group_12__1
            {
            pushFollow(FOLLOW_4);
            rule__ObjInit__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_12__1();

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
    // $ANTLR end "rule__ObjInit__Group_12__0"


    // $ANTLR start "rule__ObjInit__Group_12__0__Impl"
    // InternalArg.g:8235:1: rule__ObjInit__Group_12__0__Impl : ( 'rules' ) ;
    public final void rule__ObjInit__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8239:1: ( ( 'rules' ) )
            // InternalArg.g:8240:1: ( 'rules' )
            {
            // InternalArg.g:8240:1: ( 'rules' )
            // InternalArg.g:8241:2: 'rules'
            {
             before(grammarAccess.getObjInitAccess().getRulesKeyword_12_0()); 
            match(input,101,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getRulesKeyword_12_0()); 

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
    // $ANTLR end "rule__ObjInit__Group_12__0__Impl"


    // $ANTLR start "rule__ObjInit__Group_12__1"
    // InternalArg.g:8250:1: rule__ObjInit__Group_12__1 : rule__ObjInit__Group_12__1__Impl rule__ObjInit__Group_12__2 ;
    public final void rule__ObjInit__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8254:1: ( rule__ObjInit__Group_12__1__Impl rule__ObjInit__Group_12__2 )
            // InternalArg.g:8255:2: rule__ObjInit__Group_12__1__Impl rule__ObjInit__Group_12__2
            {
            pushFollow(FOLLOW_71);
            rule__ObjInit__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_12__2();

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
    // $ANTLR end "rule__ObjInit__Group_12__1"


    // $ANTLR start "rule__ObjInit__Group_12__1__Impl"
    // InternalArg.g:8262:1: rule__ObjInit__Group_12__1__Impl : ( '{' ) ;
    public final void rule__ObjInit__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8266:1: ( ( '{' ) )
            // InternalArg.g:8267:1: ( '{' )
            {
            // InternalArg.g:8267:1: ( '{' )
            // InternalArg.g:8268:2: '{'
            {
             before(grammarAccess.getObjInitAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getLeftCurlyBracketKeyword_12_1()); 

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
    // $ANTLR end "rule__ObjInit__Group_12__1__Impl"


    // $ANTLR start "rule__ObjInit__Group_12__2"
    // InternalArg.g:8277:1: rule__ObjInit__Group_12__2 : rule__ObjInit__Group_12__2__Impl rule__ObjInit__Group_12__3 ;
    public final void rule__ObjInit__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8281:1: ( rule__ObjInit__Group_12__2__Impl rule__ObjInit__Group_12__3 )
            // InternalArg.g:8282:2: rule__ObjInit__Group_12__2__Impl rule__ObjInit__Group_12__3
            {
            pushFollow(FOLLOW_78);
            rule__ObjInit__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_12__3();

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
    // $ANTLR end "rule__ObjInit__Group_12__2"


    // $ANTLR start "rule__ObjInit__Group_12__2__Impl"
    // InternalArg.g:8289:1: rule__ObjInit__Group_12__2__Impl : ( ( rule__ObjInit__RulesAssignment_12_2 ) ) ;
    public final void rule__ObjInit__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8293:1: ( ( ( rule__ObjInit__RulesAssignment_12_2 ) ) )
            // InternalArg.g:8294:1: ( ( rule__ObjInit__RulesAssignment_12_2 ) )
            {
            // InternalArg.g:8294:1: ( ( rule__ObjInit__RulesAssignment_12_2 ) )
            // InternalArg.g:8295:2: ( rule__ObjInit__RulesAssignment_12_2 )
            {
             before(grammarAccess.getObjInitAccess().getRulesAssignment_12_2()); 
            // InternalArg.g:8296:2: ( rule__ObjInit__RulesAssignment_12_2 )
            // InternalArg.g:8296:3: rule__ObjInit__RulesAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__RulesAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getObjInitAccess().getRulesAssignment_12_2()); 

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
    // $ANTLR end "rule__ObjInit__Group_12__2__Impl"


    // $ANTLR start "rule__ObjInit__Group_12__3"
    // InternalArg.g:8304:1: rule__ObjInit__Group_12__3 : rule__ObjInit__Group_12__3__Impl rule__ObjInit__Group_12__4 ;
    public final void rule__ObjInit__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8308:1: ( rule__ObjInit__Group_12__3__Impl rule__ObjInit__Group_12__4 )
            // InternalArg.g:8309:2: rule__ObjInit__Group_12__3__Impl rule__ObjInit__Group_12__4
            {
            pushFollow(FOLLOW_78);
            rule__ObjInit__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_12__4();

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
    // $ANTLR end "rule__ObjInit__Group_12__3"


    // $ANTLR start "rule__ObjInit__Group_12__3__Impl"
    // InternalArg.g:8316:1: rule__ObjInit__Group_12__3__Impl : ( ( rule__ObjInit__Group_12_3__0 )* ) ;
    public final void rule__ObjInit__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8320:1: ( ( ( rule__ObjInit__Group_12_3__0 )* ) )
            // InternalArg.g:8321:1: ( ( rule__ObjInit__Group_12_3__0 )* )
            {
            // InternalArg.g:8321:1: ( ( rule__ObjInit__Group_12_3__0 )* )
            // InternalArg.g:8322:2: ( rule__ObjInit__Group_12_3__0 )*
            {
             before(grammarAccess.getObjInitAccess().getGroup_12_3()); 
            // InternalArg.g:8323:2: ( rule__ObjInit__Group_12_3__0 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==91) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalArg.g:8323:3: rule__ObjInit__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_79);
            	    rule__ObjInit__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

             after(grammarAccess.getObjInitAccess().getGroup_12_3()); 

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
    // $ANTLR end "rule__ObjInit__Group_12__3__Impl"


    // $ANTLR start "rule__ObjInit__Group_12__4"
    // InternalArg.g:8331:1: rule__ObjInit__Group_12__4 : rule__ObjInit__Group_12__4__Impl ;
    public final void rule__ObjInit__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8335:1: ( rule__ObjInit__Group_12__4__Impl )
            // InternalArg.g:8336:2: rule__ObjInit__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_12__4__Impl();

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
    // $ANTLR end "rule__ObjInit__Group_12__4"


    // $ANTLR start "rule__ObjInit__Group_12__4__Impl"
    // InternalArg.g:8342:1: rule__ObjInit__Group_12__4__Impl : ( '}' ) ;
    public final void rule__ObjInit__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8346:1: ( ( '}' ) )
            // InternalArg.g:8347:1: ( '}' )
            {
            // InternalArg.g:8347:1: ( '}' )
            // InternalArg.g:8348:2: '}'
            {
             before(grammarAccess.getObjInitAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getRightCurlyBracketKeyword_12_4()); 

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
    // $ANTLR end "rule__ObjInit__Group_12__4__Impl"


    // $ANTLR start "rule__ObjInit__Group_12_3__0"
    // InternalArg.g:8358:1: rule__ObjInit__Group_12_3__0 : rule__ObjInit__Group_12_3__0__Impl rule__ObjInit__Group_12_3__1 ;
    public final void rule__ObjInit__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8362:1: ( rule__ObjInit__Group_12_3__0__Impl rule__ObjInit__Group_12_3__1 )
            // InternalArg.g:8363:2: rule__ObjInit__Group_12_3__0__Impl rule__ObjInit__Group_12_3__1
            {
            pushFollow(FOLLOW_71);
            rule__ObjInit__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_12_3__1();

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
    // $ANTLR end "rule__ObjInit__Group_12_3__0"


    // $ANTLR start "rule__ObjInit__Group_12_3__0__Impl"
    // InternalArg.g:8370:1: rule__ObjInit__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__ObjInit__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8374:1: ( ( ',' ) )
            // InternalArg.g:8375:1: ( ',' )
            {
            // InternalArg.g:8375:1: ( ',' )
            // InternalArg.g:8376:2: ','
            {
             before(grammarAccess.getObjInitAccess().getCommaKeyword_12_3_0()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getCommaKeyword_12_3_0()); 

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
    // $ANTLR end "rule__ObjInit__Group_12_3__0__Impl"


    // $ANTLR start "rule__ObjInit__Group_12_3__1"
    // InternalArg.g:8385:1: rule__ObjInit__Group_12_3__1 : rule__ObjInit__Group_12_3__1__Impl ;
    public final void rule__ObjInit__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8389:1: ( rule__ObjInit__Group_12_3__1__Impl )
            // InternalArg.g:8390:2: rule__ObjInit__Group_12_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_12_3__1__Impl();

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
    // $ANTLR end "rule__ObjInit__Group_12_3__1"


    // $ANTLR start "rule__ObjInit__Group_12_3__1__Impl"
    // InternalArg.g:8396:1: rule__ObjInit__Group_12_3__1__Impl : ( ( rule__ObjInit__RulesAssignment_12_3_1 ) ) ;
    public final void rule__ObjInit__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8400:1: ( ( ( rule__ObjInit__RulesAssignment_12_3_1 ) ) )
            // InternalArg.g:8401:1: ( ( rule__ObjInit__RulesAssignment_12_3_1 ) )
            {
            // InternalArg.g:8401:1: ( ( rule__ObjInit__RulesAssignment_12_3_1 ) )
            // InternalArg.g:8402:2: ( rule__ObjInit__RulesAssignment_12_3_1 )
            {
             before(grammarAccess.getObjInitAccess().getRulesAssignment_12_3_1()); 
            // InternalArg.g:8403:2: ( rule__ObjInit__RulesAssignment_12_3_1 )
            // InternalArg.g:8403:3: rule__ObjInit__RulesAssignment_12_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__RulesAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getObjInitAccess().getRulesAssignment_12_3_1()); 

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
    // $ANTLR end "rule__ObjInit__Group_12_3__1__Impl"


    // $ANTLR start "rule__PhysicChange__Group__0"
    // InternalArg.g:8412:1: rule__PhysicChange__Group__0 : rule__PhysicChange__Group__0__Impl rule__PhysicChange__Group__1 ;
    public final void rule__PhysicChange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8416:1: ( rule__PhysicChange__Group__0__Impl rule__PhysicChange__Group__1 )
            // InternalArg.g:8417:2: rule__PhysicChange__Group__0__Impl rule__PhysicChange__Group__1
            {
            pushFollow(FOLLOW_80);
            rule__PhysicChange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group__1();

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
    // $ANTLR end "rule__PhysicChange__Group__0"


    // $ANTLR start "rule__PhysicChange__Group__0__Impl"
    // InternalArg.g:8424:1: rule__PhysicChange__Group__0__Impl : ( 'do' ) ;
    public final void rule__PhysicChange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8428:1: ( ( 'do' ) )
            // InternalArg.g:8429:1: ( 'do' )
            {
            // InternalArg.g:8429:1: ( 'do' )
            // InternalArg.g:8430:2: 'do'
            {
             before(grammarAccess.getPhysicChangeAccess().getDoKeyword_0()); 
            match(input,102,FOLLOW_2); 
             after(grammarAccess.getPhysicChangeAccess().getDoKeyword_0()); 

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
    // $ANTLR end "rule__PhysicChange__Group__0__Impl"


    // $ANTLR start "rule__PhysicChange__Group__1"
    // InternalArg.g:8439:1: rule__PhysicChange__Group__1 : rule__PhysicChange__Group__1__Impl rule__PhysicChange__Group__2 ;
    public final void rule__PhysicChange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8443:1: ( rule__PhysicChange__Group__1__Impl rule__PhysicChange__Group__2 )
            // InternalArg.g:8444:2: rule__PhysicChange__Group__1__Impl rule__PhysicChange__Group__2
            {
            pushFollow(FOLLOW_81);
            rule__PhysicChange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group__2();

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
    // $ANTLR end "rule__PhysicChange__Group__1"


    // $ANTLR start "rule__PhysicChange__Group__1__Impl"
    // InternalArg.g:8451:1: rule__PhysicChange__Group__1__Impl : ( ( rule__PhysicChange__ActionAssignment_1 ) ) ;
    public final void rule__PhysicChange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8455:1: ( ( ( rule__PhysicChange__ActionAssignment_1 ) ) )
            // InternalArg.g:8456:1: ( ( rule__PhysicChange__ActionAssignment_1 ) )
            {
            // InternalArg.g:8456:1: ( ( rule__PhysicChange__ActionAssignment_1 ) )
            // InternalArg.g:8457:2: ( rule__PhysicChange__ActionAssignment_1 )
            {
             before(grammarAccess.getPhysicChangeAccess().getActionAssignment_1()); 
            // InternalArg.g:8458:2: ( rule__PhysicChange__ActionAssignment_1 )
            // InternalArg.g:8458:3: rule__PhysicChange__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChange__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangeAccess().getActionAssignment_1()); 

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
    // $ANTLR end "rule__PhysicChange__Group__1__Impl"


    // $ANTLR start "rule__PhysicChange__Group__2"
    // InternalArg.g:8466:1: rule__PhysicChange__Group__2 : rule__PhysicChange__Group__2__Impl rule__PhysicChange__Group__3 ;
    public final void rule__PhysicChange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8470:1: ( rule__PhysicChange__Group__2__Impl rule__PhysicChange__Group__3 )
            // InternalArg.g:8471:2: rule__PhysicChange__Group__2__Impl rule__PhysicChange__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__PhysicChange__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group__3();

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
    // $ANTLR end "rule__PhysicChange__Group__2"


    // $ANTLR start "rule__PhysicChange__Group__2__Impl"
    // InternalArg.g:8478:1: rule__PhysicChange__Group__2__Impl : ( 'in' ) ;
    public final void rule__PhysicChange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8482:1: ( ( 'in' ) )
            // InternalArg.g:8483:1: ( 'in' )
            {
            // InternalArg.g:8483:1: ( 'in' )
            // InternalArg.g:8484:2: 'in'
            {
             before(grammarAccess.getPhysicChangeAccess().getInKeyword_2()); 
            match(input,103,FOLLOW_2); 
             after(grammarAccess.getPhysicChangeAccess().getInKeyword_2()); 

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
    // $ANTLR end "rule__PhysicChange__Group__2__Impl"


    // $ANTLR start "rule__PhysicChange__Group__3"
    // InternalArg.g:8493:1: rule__PhysicChange__Group__3 : rule__PhysicChange__Group__3__Impl rule__PhysicChange__Group__4 ;
    public final void rule__PhysicChange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8497:1: ( rule__PhysicChange__Group__3__Impl rule__PhysicChange__Group__4 )
            // InternalArg.g:8498:2: rule__PhysicChange__Group__3__Impl rule__PhysicChange__Group__4
            {
            pushFollow(FOLLOW_82);
            rule__PhysicChange__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group__4();

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
    // $ANTLR end "rule__PhysicChange__Group__3"


    // $ANTLR start "rule__PhysicChange__Group__3__Impl"
    // InternalArg.g:8505:1: rule__PhysicChange__Group__3__Impl : ( ( rule__PhysicChange__ClassAssignment_3 ) ) ;
    public final void rule__PhysicChange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8509:1: ( ( ( rule__PhysicChange__ClassAssignment_3 ) ) )
            // InternalArg.g:8510:1: ( ( rule__PhysicChange__ClassAssignment_3 ) )
            {
            // InternalArg.g:8510:1: ( ( rule__PhysicChange__ClassAssignment_3 ) )
            // InternalArg.g:8511:2: ( rule__PhysicChange__ClassAssignment_3 )
            {
             before(grammarAccess.getPhysicChangeAccess().getClassAssignment_3()); 
            // InternalArg.g:8512:2: ( rule__PhysicChange__ClassAssignment_3 )
            // InternalArg.g:8512:3: rule__PhysicChange__ClassAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChange__ClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangeAccess().getClassAssignment_3()); 

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
    // $ANTLR end "rule__PhysicChange__Group__3__Impl"


    // $ANTLR start "rule__PhysicChange__Group__4"
    // InternalArg.g:8520:1: rule__PhysicChange__Group__4 : rule__PhysicChange__Group__4__Impl rule__PhysicChange__Group__5 ;
    public final void rule__PhysicChange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8524:1: ( rule__PhysicChange__Group__4__Impl rule__PhysicChange__Group__5 )
            // InternalArg.g:8525:2: rule__PhysicChange__Group__4__Impl rule__PhysicChange__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__PhysicChange__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group__5();

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
    // $ANTLR end "rule__PhysicChange__Group__4"


    // $ANTLR start "rule__PhysicChange__Group__4__Impl"
    // InternalArg.g:8532:1: rule__PhysicChange__Group__4__Impl : ( 'named' ) ;
    public final void rule__PhysicChange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8536:1: ( ( 'named' ) )
            // InternalArg.g:8537:1: ( 'named' )
            {
            // InternalArg.g:8537:1: ( 'named' )
            // InternalArg.g:8538:2: 'named'
            {
             before(grammarAccess.getPhysicChangeAccess().getNamedKeyword_4()); 
            match(input,104,FOLLOW_2); 
             after(grammarAccess.getPhysicChangeAccess().getNamedKeyword_4()); 

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
    // $ANTLR end "rule__PhysicChange__Group__4__Impl"


    // $ANTLR start "rule__PhysicChange__Group__5"
    // InternalArg.g:8547:1: rule__PhysicChange__Group__5 : rule__PhysicChange__Group__5__Impl rule__PhysicChange__Group__6 ;
    public final void rule__PhysicChange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8551:1: ( rule__PhysicChange__Group__5__Impl rule__PhysicChange__Group__6 )
            // InternalArg.g:8552:2: rule__PhysicChange__Group__5__Impl rule__PhysicChange__Group__6
            {
            pushFollow(FOLLOW_83);
            rule__PhysicChange__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group__6();

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
    // $ANTLR end "rule__PhysicChange__Group__5"


    // $ANTLR start "rule__PhysicChange__Group__5__Impl"
    // InternalArg.g:8559:1: rule__PhysicChange__Group__5__Impl : ( ( rule__PhysicChange__ObjectAssignment_5 ) ) ;
    public final void rule__PhysicChange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8563:1: ( ( ( rule__PhysicChange__ObjectAssignment_5 ) ) )
            // InternalArg.g:8564:1: ( ( rule__PhysicChange__ObjectAssignment_5 ) )
            {
            // InternalArg.g:8564:1: ( ( rule__PhysicChange__ObjectAssignment_5 ) )
            // InternalArg.g:8565:2: ( rule__PhysicChange__ObjectAssignment_5 )
            {
             before(grammarAccess.getPhysicChangeAccess().getObjectAssignment_5()); 
            // InternalArg.g:8566:2: ( rule__PhysicChange__ObjectAssignment_5 )
            // InternalArg.g:8566:3: rule__PhysicChange__ObjectAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChange__ObjectAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangeAccess().getObjectAssignment_5()); 

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
    // $ANTLR end "rule__PhysicChange__Group__5__Impl"


    // $ANTLR start "rule__PhysicChange__Group__6"
    // InternalArg.g:8574:1: rule__PhysicChange__Group__6 : rule__PhysicChange__Group__6__Impl rule__PhysicChange__Group__7 ;
    public final void rule__PhysicChange__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8578:1: ( rule__PhysicChange__Group__6__Impl rule__PhysicChange__Group__7 )
            // InternalArg.g:8579:2: rule__PhysicChange__Group__6__Impl rule__PhysicChange__Group__7
            {
            pushFollow(FOLLOW_83);
            rule__PhysicChange__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group__7();

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
    // $ANTLR end "rule__PhysicChange__Group__6"


    // $ANTLR start "rule__PhysicChange__Group__6__Impl"
    // InternalArg.g:8586:1: rule__PhysicChange__Group__6__Impl : ( ( rule__PhysicChange__Group_6__0 )? ) ;
    public final void rule__PhysicChange__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8590:1: ( ( ( rule__PhysicChange__Group_6__0 )? ) )
            // InternalArg.g:8591:1: ( ( rule__PhysicChange__Group_6__0 )? )
            {
            // InternalArg.g:8591:1: ( ( rule__PhysicChange__Group_6__0 )? )
            // InternalArg.g:8592:2: ( rule__PhysicChange__Group_6__0 )?
            {
             before(grammarAccess.getPhysicChangeAccess().getGroup_6()); 
            // InternalArg.g:8593:2: ( rule__PhysicChange__Group_6__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==105) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalArg.g:8593:3: rule__PhysicChange__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhysicChange__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhysicChangeAccess().getGroup_6()); 

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
    // $ANTLR end "rule__PhysicChange__Group__6__Impl"


    // $ANTLR start "rule__PhysicChange__Group__7"
    // InternalArg.g:8601:1: rule__PhysicChange__Group__7 : rule__PhysicChange__Group__7__Impl rule__PhysicChange__Group__8 ;
    public final void rule__PhysicChange__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8605:1: ( rule__PhysicChange__Group__7__Impl rule__PhysicChange__Group__8 )
            // InternalArg.g:8606:2: rule__PhysicChange__Group__7__Impl rule__PhysicChange__Group__8
            {
            pushFollow(FOLLOW_83);
            rule__PhysicChange__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group__8();

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
    // $ANTLR end "rule__PhysicChange__Group__7"


    // $ANTLR start "rule__PhysicChange__Group__7__Impl"
    // InternalArg.g:8613:1: rule__PhysicChange__Group__7__Impl : ( ( rule__PhysicChange__Group_7__0 )? ) ;
    public final void rule__PhysicChange__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8617:1: ( ( ( rule__PhysicChange__Group_7__0 )? ) )
            // InternalArg.g:8618:1: ( ( rule__PhysicChange__Group_7__0 )? )
            {
            // InternalArg.g:8618:1: ( ( rule__PhysicChange__Group_7__0 )? )
            // InternalArg.g:8619:2: ( rule__PhysicChange__Group_7__0 )?
            {
             before(grammarAccess.getPhysicChangeAccess().getGroup_7()); 
            // InternalArg.g:8620:2: ( rule__PhysicChange__Group_7__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==106) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalArg.g:8620:3: rule__PhysicChange__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhysicChange__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhysicChangeAccess().getGroup_7()); 

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
    // $ANTLR end "rule__PhysicChange__Group__7__Impl"


    // $ANTLR start "rule__PhysicChange__Group__8"
    // InternalArg.g:8628:1: rule__PhysicChange__Group__8 : rule__PhysicChange__Group__8__Impl rule__PhysicChange__Group__9 ;
    public final void rule__PhysicChange__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8632:1: ( rule__PhysicChange__Group__8__Impl rule__PhysicChange__Group__9 )
            // InternalArg.g:8633:2: rule__PhysicChange__Group__8__Impl rule__PhysicChange__Group__9
            {
            pushFollow(FOLLOW_83);
            rule__PhysicChange__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group__9();

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
    // $ANTLR end "rule__PhysicChange__Group__8"


    // $ANTLR start "rule__PhysicChange__Group__8__Impl"
    // InternalArg.g:8640:1: rule__PhysicChange__Group__8__Impl : ( ( rule__PhysicChange__Group_8__0 )? ) ;
    public final void rule__PhysicChange__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8644:1: ( ( ( rule__PhysicChange__Group_8__0 )? ) )
            // InternalArg.g:8645:1: ( ( rule__PhysicChange__Group_8__0 )? )
            {
            // InternalArg.g:8645:1: ( ( rule__PhysicChange__Group_8__0 )? )
            // InternalArg.g:8646:2: ( rule__PhysicChange__Group_8__0 )?
            {
             before(grammarAccess.getPhysicChangeAccess().getGroup_8()); 
            // InternalArg.g:8647:2: ( rule__PhysicChange__Group_8__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==107) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalArg.g:8647:3: rule__PhysicChange__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhysicChange__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhysicChangeAccess().getGroup_8()); 

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
    // $ANTLR end "rule__PhysicChange__Group__8__Impl"


    // $ANTLR start "rule__PhysicChange__Group__9"
    // InternalArg.g:8655:1: rule__PhysicChange__Group__9 : rule__PhysicChange__Group__9__Impl rule__PhysicChange__Group__10 ;
    public final void rule__PhysicChange__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8659:1: ( rule__PhysicChange__Group__9__Impl rule__PhysicChange__Group__10 )
            // InternalArg.g:8660:2: rule__PhysicChange__Group__9__Impl rule__PhysicChange__Group__10
            {
            pushFollow(FOLLOW_83);
            rule__PhysicChange__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group__10();

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
    // $ANTLR end "rule__PhysicChange__Group__9"


    // $ANTLR start "rule__PhysicChange__Group__9__Impl"
    // InternalArg.g:8667:1: rule__PhysicChange__Group__9__Impl : ( ( rule__PhysicChange__Group_9__0 )? ) ;
    public final void rule__PhysicChange__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8671:1: ( ( ( rule__PhysicChange__Group_9__0 )? ) )
            // InternalArg.g:8672:1: ( ( rule__PhysicChange__Group_9__0 )? )
            {
            // InternalArg.g:8672:1: ( ( rule__PhysicChange__Group_9__0 )? )
            // InternalArg.g:8673:2: ( rule__PhysicChange__Group_9__0 )?
            {
             before(grammarAccess.getPhysicChangeAccess().getGroup_9()); 
            // InternalArg.g:8674:2: ( rule__PhysicChange__Group_9__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==108) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalArg.g:8674:3: rule__PhysicChange__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhysicChange__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhysicChangeAccess().getGroup_9()); 

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
    // $ANTLR end "rule__PhysicChange__Group__9__Impl"


    // $ANTLR start "rule__PhysicChange__Group__10"
    // InternalArg.g:8682:1: rule__PhysicChange__Group__10 : rule__PhysicChange__Group__10__Impl ;
    public final void rule__PhysicChange__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8686:1: ( rule__PhysicChange__Group__10__Impl )
            // InternalArg.g:8687:2: rule__PhysicChange__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group__10__Impl();

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
    // $ANTLR end "rule__PhysicChange__Group__10"


    // $ANTLR start "rule__PhysicChange__Group__10__Impl"
    // InternalArg.g:8693:1: rule__PhysicChange__Group__10__Impl : ( ( rule__PhysicChange__Group_10__0 )? ) ;
    public final void rule__PhysicChange__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8697:1: ( ( ( rule__PhysicChange__Group_10__0 )? ) )
            // InternalArg.g:8698:1: ( ( rule__PhysicChange__Group_10__0 )? )
            {
            // InternalArg.g:8698:1: ( ( rule__PhysicChange__Group_10__0 )? )
            // InternalArg.g:8699:2: ( rule__PhysicChange__Group_10__0 )?
            {
             before(grammarAccess.getPhysicChangeAccess().getGroup_10()); 
            // InternalArg.g:8700:2: ( rule__PhysicChange__Group_10__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==109) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalArg.g:8700:3: rule__PhysicChange__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhysicChange__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhysicChangeAccess().getGroup_10()); 

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
    // $ANTLR end "rule__PhysicChange__Group__10__Impl"


    // $ANTLR start "rule__PhysicChange__Group_6__0"
    // InternalArg.g:8709:1: rule__PhysicChange__Group_6__0 : rule__PhysicChange__Group_6__0__Impl rule__PhysicChange__Group_6__1 ;
    public final void rule__PhysicChange__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8713:1: ( rule__PhysicChange__Group_6__0__Impl rule__PhysicChange__Group_6__1 )
            // InternalArg.g:8714:2: rule__PhysicChange__Group_6__0__Impl rule__PhysicChange__Group_6__1
            {
            pushFollow(FOLLOW_84);
            rule__PhysicChange__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group_6__1();

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
    // $ANTLR end "rule__PhysicChange__Group_6__0"


    // $ANTLR start "rule__PhysicChange__Group_6__0__Impl"
    // InternalArg.g:8721:1: rule__PhysicChange__Group_6__0__Impl : ( 'where' ) ;
    public final void rule__PhysicChange__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8725:1: ( ( 'where' ) )
            // InternalArg.g:8726:1: ( 'where' )
            {
            // InternalArg.g:8726:1: ( 'where' )
            // InternalArg.g:8727:2: 'where'
            {
             before(grammarAccess.getPhysicChangeAccess().getWhereKeyword_6_0()); 
            match(input,105,FOLLOW_2); 
             after(grammarAccess.getPhysicChangeAccess().getWhereKeyword_6_0()); 

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
    // $ANTLR end "rule__PhysicChange__Group_6__0__Impl"


    // $ANTLR start "rule__PhysicChange__Group_6__1"
    // InternalArg.g:8736:1: rule__PhysicChange__Group_6__1 : rule__PhysicChange__Group_6__1__Impl ;
    public final void rule__PhysicChange__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8740:1: ( rule__PhysicChange__Group_6__1__Impl )
            // InternalArg.g:8741:2: rule__PhysicChange__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group_6__1__Impl();

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
    // $ANTLR end "rule__PhysicChange__Group_6__1"


    // $ANTLR start "rule__PhysicChange__Group_6__1__Impl"
    // InternalArg.g:8747:1: rule__PhysicChange__Group_6__1__Impl : ( ( rule__PhysicChange__PositionAssignment_6_1 ) ) ;
    public final void rule__PhysicChange__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8751:1: ( ( ( rule__PhysicChange__PositionAssignment_6_1 ) ) )
            // InternalArg.g:8752:1: ( ( rule__PhysicChange__PositionAssignment_6_1 ) )
            {
            // InternalArg.g:8752:1: ( ( rule__PhysicChange__PositionAssignment_6_1 ) )
            // InternalArg.g:8753:2: ( rule__PhysicChange__PositionAssignment_6_1 )
            {
             before(grammarAccess.getPhysicChangeAccess().getPositionAssignment_6_1()); 
            // InternalArg.g:8754:2: ( rule__PhysicChange__PositionAssignment_6_1 )
            // InternalArg.g:8754:3: rule__PhysicChange__PositionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChange__PositionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangeAccess().getPositionAssignment_6_1()); 

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
    // $ANTLR end "rule__PhysicChange__Group_6__1__Impl"


    // $ANTLR start "rule__PhysicChange__Group_7__0"
    // InternalArg.g:8763:1: rule__PhysicChange__Group_7__0 : rule__PhysicChange__Group_7__0__Impl rule__PhysicChange__Group_7__1 ;
    public final void rule__PhysicChange__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8767:1: ( rule__PhysicChange__Group_7__0__Impl rule__PhysicChange__Group_7__1 )
            // InternalArg.g:8768:2: rule__PhysicChange__Group_7__0__Impl rule__PhysicChange__Group_7__1
            {
            pushFollow(FOLLOW_42);
            rule__PhysicChange__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group_7__1();

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
    // $ANTLR end "rule__PhysicChange__Group_7__0"


    // $ANTLR start "rule__PhysicChange__Group_7__0__Impl"
    // InternalArg.g:8775:1: rule__PhysicChange__Group_7__0__Impl : ( 'scale' ) ;
    public final void rule__PhysicChange__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8779:1: ( ( 'scale' ) )
            // InternalArg.g:8780:1: ( 'scale' )
            {
            // InternalArg.g:8780:1: ( 'scale' )
            // InternalArg.g:8781:2: 'scale'
            {
             before(grammarAccess.getPhysicChangeAccess().getScaleKeyword_7_0()); 
            match(input,106,FOLLOW_2); 
             after(grammarAccess.getPhysicChangeAccess().getScaleKeyword_7_0()); 

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
    // $ANTLR end "rule__PhysicChange__Group_7__0__Impl"


    // $ANTLR start "rule__PhysicChange__Group_7__1"
    // InternalArg.g:8790:1: rule__PhysicChange__Group_7__1 : rule__PhysicChange__Group_7__1__Impl ;
    public final void rule__PhysicChange__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8794:1: ( rule__PhysicChange__Group_7__1__Impl )
            // InternalArg.g:8795:2: rule__PhysicChange__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group_7__1__Impl();

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
    // $ANTLR end "rule__PhysicChange__Group_7__1"


    // $ANTLR start "rule__PhysicChange__Group_7__1__Impl"
    // InternalArg.g:8801:1: rule__PhysicChange__Group_7__1__Impl : ( ( rule__PhysicChange__ScaleAssignment_7_1 ) ) ;
    public final void rule__PhysicChange__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8805:1: ( ( ( rule__PhysicChange__ScaleAssignment_7_1 ) ) )
            // InternalArg.g:8806:1: ( ( rule__PhysicChange__ScaleAssignment_7_1 ) )
            {
            // InternalArg.g:8806:1: ( ( rule__PhysicChange__ScaleAssignment_7_1 ) )
            // InternalArg.g:8807:2: ( rule__PhysicChange__ScaleAssignment_7_1 )
            {
             before(grammarAccess.getPhysicChangeAccess().getScaleAssignment_7_1()); 
            // InternalArg.g:8808:2: ( rule__PhysicChange__ScaleAssignment_7_1 )
            // InternalArg.g:8808:3: rule__PhysicChange__ScaleAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChange__ScaleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangeAccess().getScaleAssignment_7_1()); 

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
    // $ANTLR end "rule__PhysicChange__Group_7__1__Impl"


    // $ANTLR start "rule__PhysicChange__Group_8__0"
    // InternalArg.g:8817:1: rule__PhysicChange__Group_8__0 : rule__PhysicChange__Group_8__0__Impl rule__PhysicChange__Group_8__1 ;
    public final void rule__PhysicChange__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8821:1: ( rule__PhysicChange__Group_8__0__Impl rule__PhysicChange__Group_8__1 )
            // InternalArg.g:8822:2: rule__PhysicChange__Group_8__0__Impl rule__PhysicChange__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__PhysicChange__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group_8__1();

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
    // $ANTLR end "rule__PhysicChange__Group_8__0"


    // $ANTLR start "rule__PhysicChange__Group_8__0__Impl"
    // InternalArg.g:8829:1: rule__PhysicChange__Group_8__0__Impl : ( 'stat' ) ;
    public final void rule__PhysicChange__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8833:1: ( ( 'stat' ) )
            // InternalArg.g:8834:1: ( 'stat' )
            {
            // InternalArg.g:8834:1: ( 'stat' )
            // InternalArg.g:8835:2: 'stat'
            {
             before(grammarAccess.getPhysicChangeAccess().getStatKeyword_8_0()); 
            match(input,107,FOLLOW_2); 
             after(grammarAccess.getPhysicChangeAccess().getStatKeyword_8_0()); 

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
    // $ANTLR end "rule__PhysicChange__Group_8__0__Impl"


    // $ANTLR start "rule__PhysicChange__Group_8__1"
    // InternalArg.g:8844:1: rule__PhysicChange__Group_8__1 : rule__PhysicChange__Group_8__1__Impl ;
    public final void rule__PhysicChange__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8848:1: ( rule__PhysicChange__Group_8__1__Impl )
            // InternalArg.g:8849:2: rule__PhysicChange__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group_8__1__Impl();

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
    // $ANTLR end "rule__PhysicChange__Group_8__1"


    // $ANTLR start "rule__PhysicChange__Group_8__1__Impl"
    // InternalArg.g:8855:1: rule__PhysicChange__Group_8__1__Impl : ( ( rule__PhysicChange__AttributeAssignment_8_1 ) ) ;
    public final void rule__PhysicChange__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8859:1: ( ( ( rule__PhysicChange__AttributeAssignment_8_1 ) ) )
            // InternalArg.g:8860:1: ( ( rule__PhysicChange__AttributeAssignment_8_1 ) )
            {
            // InternalArg.g:8860:1: ( ( rule__PhysicChange__AttributeAssignment_8_1 ) )
            // InternalArg.g:8861:2: ( rule__PhysicChange__AttributeAssignment_8_1 )
            {
             before(grammarAccess.getPhysicChangeAccess().getAttributeAssignment_8_1()); 
            // InternalArg.g:8862:2: ( rule__PhysicChange__AttributeAssignment_8_1 )
            // InternalArg.g:8862:3: rule__PhysicChange__AttributeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChange__AttributeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangeAccess().getAttributeAssignment_8_1()); 

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
    // $ANTLR end "rule__PhysicChange__Group_8__1__Impl"


    // $ANTLR start "rule__PhysicChange__Group_9__0"
    // InternalArg.g:8871:1: rule__PhysicChange__Group_9__0 : rule__PhysicChange__Group_9__0__Impl rule__PhysicChange__Group_9__1 ;
    public final void rule__PhysicChange__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8875:1: ( rule__PhysicChange__Group_9__0__Impl rule__PhysicChange__Group_9__1 )
            // InternalArg.g:8876:2: rule__PhysicChange__Group_9__0__Impl rule__PhysicChange__Group_9__1
            {
            pushFollow(FOLLOW_25);
            rule__PhysicChange__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group_9__1();

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
    // $ANTLR end "rule__PhysicChange__Group_9__0"


    // $ANTLR start "rule__PhysicChange__Group_9__0__Impl"
    // InternalArg.g:8883:1: rule__PhysicChange__Group_9__0__Impl : ( 'changeStat' ) ;
    public final void rule__PhysicChange__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8887:1: ( ( 'changeStat' ) )
            // InternalArg.g:8888:1: ( 'changeStat' )
            {
            // InternalArg.g:8888:1: ( 'changeStat' )
            // InternalArg.g:8889:2: 'changeStat'
            {
             before(grammarAccess.getPhysicChangeAccess().getChangeStatKeyword_9_0()); 
            match(input,108,FOLLOW_2); 
             after(grammarAccess.getPhysicChangeAccess().getChangeStatKeyword_9_0()); 

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
    // $ANTLR end "rule__PhysicChange__Group_9__0__Impl"


    // $ANTLR start "rule__PhysicChange__Group_9__1"
    // InternalArg.g:8898:1: rule__PhysicChange__Group_9__1 : rule__PhysicChange__Group_9__1__Impl ;
    public final void rule__PhysicChange__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8902:1: ( rule__PhysicChange__Group_9__1__Impl )
            // InternalArg.g:8903:2: rule__PhysicChange__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group_9__1__Impl();

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
    // $ANTLR end "rule__PhysicChange__Group_9__1"


    // $ANTLR start "rule__PhysicChange__Group_9__1__Impl"
    // InternalArg.g:8909:1: rule__PhysicChange__Group_9__1__Impl : ( ( rule__PhysicChange__ChangeValueAssignment_9_1 ) ) ;
    public final void rule__PhysicChange__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8913:1: ( ( ( rule__PhysicChange__ChangeValueAssignment_9_1 ) ) )
            // InternalArg.g:8914:1: ( ( rule__PhysicChange__ChangeValueAssignment_9_1 ) )
            {
            // InternalArg.g:8914:1: ( ( rule__PhysicChange__ChangeValueAssignment_9_1 ) )
            // InternalArg.g:8915:2: ( rule__PhysicChange__ChangeValueAssignment_9_1 )
            {
             before(grammarAccess.getPhysicChangeAccess().getChangeValueAssignment_9_1()); 
            // InternalArg.g:8916:2: ( rule__PhysicChange__ChangeValueAssignment_9_1 )
            // InternalArg.g:8916:3: rule__PhysicChange__ChangeValueAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChange__ChangeValueAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangeAccess().getChangeValueAssignment_9_1()); 

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
    // $ANTLR end "rule__PhysicChange__Group_9__1__Impl"


    // $ANTLR start "rule__PhysicChange__Group_10__0"
    // InternalArg.g:8925:1: rule__PhysicChange__Group_10__0 : rule__PhysicChange__Group_10__0__Impl rule__PhysicChange__Group_10__1 ;
    public final void rule__PhysicChange__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8929:1: ( rule__PhysicChange__Group_10__0__Impl rule__PhysicChange__Group_10__1 )
            // InternalArg.g:8930:2: rule__PhysicChange__Group_10__0__Impl rule__PhysicChange__Group_10__1
            {
            pushFollow(FOLLOW_3);
            rule__PhysicChange__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group_10__1();

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
    // $ANTLR end "rule__PhysicChange__Group_10__0"


    // $ANTLR start "rule__PhysicChange__Group_10__0__Impl"
    // InternalArg.g:8937:1: rule__PhysicChange__Group_10__0__Impl : ( 'force' ) ;
    public final void rule__PhysicChange__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8941:1: ( ( 'force' ) )
            // InternalArg.g:8942:1: ( 'force' )
            {
            // InternalArg.g:8942:1: ( 'force' )
            // InternalArg.g:8943:2: 'force'
            {
             before(grammarAccess.getPhysicChangeAccess().getForceKeyword_10_0()); 
            match(input,109,FOLLOW_2); 
             after(grammarAccess.getPhysicChangeAccess().getForceKeyword_10_0()); 

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
    // $ANTLR end "rule__PhysicChange__Group_10__0__Impl"


    // $ANTLR start "rule__PhysicChange__Group_10__1"
    // InternalArg.g:8952:1: rule__PhysicChange__Group_10__1 : rule__PhysicChange__Group_10__1__Impl ;
    public final void rule__PhysicChange__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8956:1: ( rule__PhysicChange__Group_10__1__Impl )
            // InternalArg.g:8957:2: rule__PhysicChange__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChange__Group_10__1__Impl();

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
    // $ANTLR end "rule__PhysicChange__Group_10__1"


    // $ANTLR start "rule__PhysicChange__Group_10__1__Impl"
    // InternalArg.g:8963:1: rule__PhysicChange__Group_10__1__Impl : ( ( rule__PhysicChange__ForceAssignment_10_1 ) ) ;
    public final void rule__PhysicChange__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8967:1: ( ( ( rule__PhysicChange__ForceAssignment_10_1 ) ) )
            // InternalArg.g:8968:1: ( ( rule__PhysicChange__ForceAssignment_10_1 ) )
            {
            // InternalArg.g:8968:1: ( ( rule__PhysicChange__ForceAssignment_10_1 ) )
            // InternalArg.g:8969:2: ( rule__PhysicChange__ForceAssignment_10_1 )
            {
             before(grammarAccess.getPhysicChangeAccess().getForceAssignment_10_1()); 
            // InternalArg.g:8970:2: ( rule__PhysicChange__ForceAssignment_10_1 )
            // InternalArg.g:8970:3: rule__PhysicChange__ForceAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChange__ForceAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangeAccess().getForceAssignment_10_1()); 

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
    // $ANTLR end "rule__PhysicChange__Group_10__1__Impl"


    // $ANTLR start "rule__ObjAttribute__Group__0"
    // InternalArg.g:8979:1: rule__ObjAttribute__Group__0 : rule__ObjAttribute__Group__0__Impl rule__ObjAttribute__Group__1 ;
    public final void rule__ObjAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8983:1: ( rule__ObjAttribute__Group__0__Impl rule__ObjAttribute__Group__1 )
            // InternalArg.g:8984:2: rule__ObjAttribute__Group__0__Impl rule__ObjAttribute__Group__1
            {
            pushFollow(FOLLOW_85);
            rule__ObjAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjAttribute__Group__1();

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
    // $ANTLR end "rule__ObjAttribute__Group__0"


    // $ANTLR start "rule__ObjAttribute__Group__0__Impl"
    // InternalArg.g:8991:1: rule__ObjAttribute__Group__0__Impl : ( ( rule__ObjAttribute__AttributeAssignment_0 ) ) ;
    public final void rule__ObjAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:8995:1: ( ( ( rule__ObjAttribute__AttributeAssignment_0 ) ) )
            // InternalArg.g:8996:1: ( ( rule__ObjAttribute__AttributeAssignment_0 ) )
            {
            // InternalArg.g:8996:1: ( ( rule__ObjAttribute__AttributeAssignment_0 ) )
            // InternalArg.g:8997:2: ( rule__ObjAttribute__AttributeAssignment_0 )
            {
             before(grammarAccess.getObjAttributeAccess().getAttributeAssignment_0()); 
            // InternalArg.g:8998:2: ( rule__ObjAttribute__AttributeAssignment_0 )
            // InternalArg.g:8998:3: rule__ObjAttribute__AttributeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjAttribute__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjAttributeAccess().getAttributeAssignment_0()); 

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
    // $ANTLR end "rule__ObjAttribute__Group__0__Impl"


    // $ANTLR start "rule__ObjAttribute__Group__1"
    // InternalArg.g:9006:1: rule__ObjAttribute__Group__1 : rule__ObjAttribute__Group__1__Impl rule__ObjAttribute__Group__2 ;
    public final void rule__ObjAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9010:1: ( rule__ObjAttribute__Group__1__Impl rule__ObjAttribute__Group__2 )
            // InternalArg.g:9011:2: rule__ObjAttribute__Group__1__Impl rule__ObjAttribute__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ObjAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjAttribute__Group__2();

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
    // $ANTLR end "rule__ObjAttribute__Group__1"


    // $ANTLR start "rule__ObjAttribute__Group__1__Impl"
    // InternalArg.g:9018:1: rule__ObjAttribute__Group__1__Impl : ( 'value' ) ;
    public final void rule__ObjAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9022:1: ( ( 'value' ) )
            // InternalArg.g:9023:1: ( 'value' )
            {
            // InternalArg.g:9023:1: ( 'value' )
            // InternalArg.g:9024:2: 'value'
            {
             before(grammarAccess.getObjAttributeAccess().getValueKeyword_1()); 
            match(input,110,FOLLOW_2); 
             after(grammarAccess.getObjAttributeAccess().getValueKeyword_1()); 

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
    // $ANTLR end "rule__ObjAttribute__Group__1__Impl"


    // $ANTLR start "rule__ObjAttribute__Group__2"
    // InternalArg.g:9033:1: rule__ObjAttribute__Group__2 : rule__ObjAttribute__Group__2__Impl ;
    public final void rule__ObjAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9037:1: ( rule__ObjAttribute__Group__2__Impl )
            // InternalArg.g:9038:2: rule__ObjAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjAttribute__Group__2__Impl();

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
    // $ANTLR end "rule__ObjAttribute__Group__2"


    // $ANTLR start "rule__ObjAttribute__Group__2__Impl"
    // InternalArg.g:9044:1: rule__ObjAttribute__Group__2__Impl : ( ( rule__ObjAttribute__ValueAssignment_2 ) ) ;
    public final void rule__ObjAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9048:1: ( ( ( rule__ObjAttribute__ValueAssignment_2 ) ) )
            // InternalArg.g:9049:1: ( ( rule__ObjAttribute__ValueAssignment_2 ) )
            {
            // InternalArg.g:9049:1: ( ( rule__ObjAttribute__ValueAssignment_2 ) )
            // InternalArg.g:9050:2: ( rule__ObjAttribute__ValueAssignment_2 )
            {
             before(grammarAccess.getObjAttributeAccess().getValueAssignment_2()); 
            // InternalArg.g:9051:2: ( rule__ObjAttribute__ValueAssignment_2 )
            // InternalArg.g:9051:3: rule__ObjAttribute__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjAttribute__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjAttributeAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__ObjAttribute__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalArg.g:9060:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9064:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalArg.g:9065:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalArg.g:9072:1: rule__Rule__Group__0__Impl : ( 'do' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9076:1: ( ( 'do' ) )
            // InternalArg.g:9077:1: ( 'do' )
            {
            // InternalArg.g:9077:1: ( 'do' )
            // InternalArg.g:9078:2: 'do'
            {
             before(grammarAccess.getRuleAccess().getDoKeyword_0()); 
            match(input,102,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getDoKeyword_0()); 

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalArg.g:9087:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9091:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalArg.g:9092:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_86);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalArg.g:9099:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ActionAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9103:1: ( ( ( rule__Rule__ActionAssignment_1 ) ) )
            // InternalArg.g:9104:1: ( ( rule__Rule__ActionAssignment_1 ) )
            {
            // InternalArg.g:9104:1: ( ( rule__Rule__ActionAssignment_1 ) )
            // InternalArg.g:9105:2: ( rule__Rule__ActionAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_1()); 
            // InternalArg.g:9106:2: ( rule__Rule__ActionAssignment_1 )
            // InternalArg.g:9106:3: rule__Rule__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getActionAssignment_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalArg.g:9114:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9118:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalArg.g:9119:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_87);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalArg.g:9126:1: rule__Rule__Group__2__Impl : ( 'if(' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9130:1: ( ( 'if(' ) )
            // InternalArg.g:9131:1: ( 'if(' )
            {
            // InternalArg.g:9131:1: ( 'if(' )
            // InternalArg.g:9132:2: 'if('
            {
             before(grammarAccess.getRuleAccess().getIfKeyword_2()); 
            match(input,111,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getIfKeyword_2()); 

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalArg.g:9141:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9145:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalArg.g:9146:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_88);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

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
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalArg.g:9153:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__ConditionAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9157:1: ( ( ( rule__Rule__ConditionAssignment_3 ) ) )
            // InternalArg.g:9158:1: ( ( rule__Rule__ConditionAssignment_3 ) )
            {
            // InternalArg.g:9158:1: ( ( rule__Rule__ConditionAssignment_3 ) )
            // InternalArg.g:9159:2: ( rule__Rule__ConditionAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_3()); 
            // InternalArg.g:9160:2: ( rule__Rule__ConditionAssignment_3 )
            // InternalArg.g:9160:3: rule__Rule__ConditionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConditionAssignment_3()); 

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
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalArg.g:9168:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9172:1: ( rule__Rule__Group__4__Impl )
            // InternalArg.g:9173:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__4__Impl();

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
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalArg.g:9179:1: rule__Rule__Group__4__Impl : ( ')' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9183:1: ( ( ')' ) )
            // InternalArg.g:9184:1: ( ')' )
            {
            // InternalArg.g:9184:1: ( ')' )
            // InternalArg.g:9185:2: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_4()); 
            match(input,112,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Not__Group__0"
    // InternalArg.g:9195:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9199:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // InternalArg.g:9200:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FOLLOW_87);
            rule__Not__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group__1();

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
    // $ANTLR end "rule__Not__Group__0"


    // $ANTLR start "rule__Not__Group__0__Impl"
    // InternalArg.g:9207:1: rule__Not__Group__0__Impl : ( '!' ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9211:1: ( ( '!' ) )
            // InternalArg.g:9212:1: ( '!' )
            {
            // InternalArg.g:9212:1: ( '!' )
            // InternalArg.g:9213:2: '!'
            {
             before(grammarAccess.getNotAccess().getExclamationMarkKeyword_0()); 
            match(input,113,FOLLOW_2); 
             after(grammarAccess.getNotAccess().getExclamationMarkKeyword_0()); 

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
    // $ANTLR end "rule__Not__Group__0__Impl"


    // $ANTLR start "rule__Not__Group__1"
    // InternalArg.g:9222:1: rule__Not__Group__1 : rule__Not__Group__1__Impl ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9226:1: ( rule__Not__Group__1__Impl )
            // InternalArg.g:9227:2: rule__Not__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group__1__Impl();

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
    // $ANTLR end "rule__Not__Group__1"


    // $ANTLR start "rule__Not__Group__1__Impl"
    // InternalArg.g:9233:1: rule__Not__Group__1__Impl : ( ( rule__Not__LeftAssignment_1 ) ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9237:1: ( ( ( rule__Not__LeftAssignment_1 ) ) )
            // InternalArg.g:9238:1: ( ( rule__Not__LeftAssignment_1 ) )
            {
            // InternalArg.g:9238:1: ( ( rule__Not__LeftAssignment_1 ) )
            // InternalArg.g:9239:2: ( rule__Not__LeftAssignment_1 )
            {
             before(grammarAccess.getNotAccess().getLeftAssignment_1()); 
            // InternalArg.g:9240:2: ( rule__Not__LeftAssignment_1 )
            // InternalArg.g:9240:3: rule__Not__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Not__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getLeftAssignment_1()); 

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
    // $ANTLR end "rule__Not__Group__1__Impl"


    // $ANTLR start "rule__Binary__Group__0"
    // InternalArg.g:9249:1: rule__Binary__Group__0 : rule__Binary__Group__0__Impl rule__Binary__Group__1 ;
    public final void rule__Binary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9253:1: ( rule__Binary__Group__0__Impl rule__Binary__Group__1 )
            // InternalArg.g:9254:2: rule__Binary__Group__0__Impl rule__Binary__Group__1
            {
            pushFollow(FOLLOW_87);
            rule__Binary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binary__Group__1();

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
    // $ANTLR end "rule__Binary__Group__0"


    // $ANTLR start "rule__Binary__Group__0__Impl"
    // InternalArg.g:9261:1: rule__Binary__Group__0__Impl : ( '(' ) ;
    public final void rule__Binary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9265:1: ( ( '(' ) )
            // InternalArg.g:9266:1: ( '(' )
            {
            // InternalArg.g:9266:1: ( '(' )
            // InternalArg.g:9267:2: '('
            {
             before(grammarAccess.getBinaryAccess().getLeftParenthesisKeyword_0()); 
            match(input,114,FOLLOW_2); 
             after(grammarAccess.getBinaryAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Binary__Group__0__Impl"


    // $ANTLR start "rule__Binary__Group__1"
    // InternalArg.g:9276:1: rule__Binary__Group__1 : rule__Binary__Group__1__Impl rule__Binary__Group__2 ;
    public final void rule__Binary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9280:1: ( rule__Binary__Group__1__Impl rule__Binary__Group__2 )
            // InternalArg.g:9281:2: rule__Binary__Group__1__Impl rule__Binary__Group__2
            {
            pushFollow(FOLLOW_88);
            rule__Binary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binary__Group__2();

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
    // $ANTLR end "rule__Binary__Group__1"


    // $ANTLR start "rule__Binary__Group__1__Impl"
    // InternalArg.g:9288:1: rule__Binary__Group__1__Impl : ( ( rule__Binary__LeftAssignment_1 ) ) ;
    public final void rule__Binary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9292:1: ( ( ( rule__Binary__LeftAssignment_1 ) ) )
            // InternalArg.g:9293:1: ( ( rule__Binary__LeftAssignment_1 ) )
            {
            // InternalArg.g:9293:1: ( ( rule__Binary__LeftAssignment_1 ) )
            // InternalArg.g:9294:2: ( rule__Binary__LeftAssignment_1 )
            {
             before(grammarAccess.getBinaryAccess().getLeftAssignment_1()); 
            // InternalArg.g:9295:2: ( rule__Binary__LeftAssignment_1 )
            // InternalArg.g:9295:3: rule__Binary__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Binary__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getLeftAssignment_1()); 

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
    // $ANTLR end "rule__Binary__Group__1__Impl"


    // $ANTLR start "rule__Binary__Group__2"
    // InternalArg.g:9303:1: rule__Binary__Group__2 : rule__Binary__Group__2__Impl rule__Binary__Group__3 ;
    public final void rule__Binary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9307:1: ( rule__Binary__Group__2__Impl rule__Binary__Group__3 )
            // InternalArg.g:9308:2: rule__Binary__Group__2__Impl rule__Binary__Group__3
            {
            pushFollow(FOLLOW_89);
            rule__Binary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binary__Group__3();

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
    // $ANTLR end "rule__Binary__Group__2"


    // $ANTLR start "rule__Binary__Group__2__Impl"
    // InternalArg.g:9315:1: rule__Binary__Group__2__Impl : ( ')' ) ;
    public final void rule__Binary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9319:1: ( ( ')' ) )
            // InternalArg.g:9320:1: ( ')' )
            {
            // InternalArg.g:9320:1: ( ')' )
            // InternalArg.g:9321:2: ')'
            {
             before(grammarAccess.getBinaryAccess().getRightParenthesisKeyword_2()); 
            match(input,112,FOLLOW_2); 
             after(grammarAccess.getBinaryAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Binary__Group__2__Impl"


    // $ANTLR start "rule__Binary__Group__3"
    // InternalArg.g:9330:1: rule__Binary__Group__3 : rule__Binary__Group__3__Impl rule__Binary__Group__4 ;
    public final void rule__Binary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9334:1: ( rule__Binary__Group__3__Impl rule__Binary__Group__4 )
            // InternalArg.g:9335:2: rule__Binary__Group__3__Impl rule__Binary__Group__4
            {
            pushFollow(FOLLOW_90);
            rule__Binary__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binary__Group__4();

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
    // $ANTLR end "rule__Binary__Group__3"


    // $ANTLR start "rule__Binary__Group__3__Impl"
    // InternalArg.g:9342:1: rule__Binary__Group__3__Impl : ( ( rule__Binary__OpAssignment_3 ) ) ;
    public final void rule__Binary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9346:1: ( ( ( rule__Binary__OpAssignment_3 ) ) )
            // InternalArg.g:9347:1: ( ( rule__Binary__OpAssignment_3 ) )
            {
            // InternalArg.g:9347:1: ( ( rule__Binary__OpAssignment_3 ) )
            // InternalArg.g:9348:2: ( rule__Binary__OpAssignment_3 )
            {
             before(grammarAccess.getBinaryAccess().getOpAssignment_3()); 
            // InternalArg.g:9349:2: ( rule__Binary__OpAssignment_3 )
            // InternalArg.g:9349:3: rule__Binary__OpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Binary__OpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getOpAssignment_3()); 

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
    // $ANTLR end "rule__Binary__Group__3__Impl"


    // $ANTLR start "rule__Binary__Group__4"
    // InternalArg.g:9357:1: rule__Binary__Group__4 : rule__Binary__Group__4__Impl rule__Binary__Group__5 ;
    public final void rule__Binary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9361:1: ( rule__Binary__Group__4__Impl rule__Binary__Group__5 )
            // InternalArg.g:9362:2: rule__Binary__Group__4__Impl rule__Binary__Group__5
            {
            pushFollow(FOLLOW_87);
            rule__Binary__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binary__Group__5();

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
    // $ANTLR end "rule__Binary__Group__4"


    // $ANTLR start "rule__Binary__Group__4__Impl"
    // InternalArg.g:9369:1: rule__Binary__Group__4__Impl : ( '(' ) ;
    public final void rule__Binary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9373:1: ( ( '(' ) )
            // InternalArg.g:9374:1: ( '(' )
            {
            // InternalArg.g:9374:1: ( '(' )
            // InternalArg.g:9375:2: '('
            {
             before(grammarAccess.getBinaryAccess().getLeftParenthesisKeyword_4()); 
            match(input,114,FOLLOW_2); 
             after(grammarAccess.getBinaryAccess().getLeftParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Binary__Group__4__Impl"


    // $ANTLR start "rule__Binary__Group__5"
    // InternalArg.g:9384:1: rule__Binary__Group__5 : rule__Binary__Group__5__Impl rule__Binary__Group__6 ;
    public final void rule__Binary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9388:1: ( rule__Binary__Group__5__Impl rule__Binary__Group__6 )
            // InternalArg.g:9389:2: rule__Binary__Group__5__Impl rule__Binary__Group__6
            {
            pushFollow(FOLLOW_88);
            rule__Binary__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binary__Group__6();

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
    // $ANTLR end "rule__Binary__Group__5"


    // $ANTLR start "rule__Binary__Group__5__Impl"
    // InternalArg.g:9396:1: rule__Binary__Group__5__Impl : ( ( rule__Binary__RightAssignment_5 ) ) ;
    public final void rule__Binary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9400:1: ( ( ( rule__Binary__RightAssignment_5 ) ) )
            // InternalArg.g:9401:1: ( ( rule__Binary__RightAssignment_5 ) )
            {
            // InternalArg.g:9401:1: ( ( rule__Binary__RightAssignment_5 ) )
            // InternalArg.g:9402:2: ( rule__Binary__RightAssignment_5 )
            {
             before(grammarAccess.getBinaryAccess().getRightAssignment_5()); 
            // InternalArg.g:9403:2: ( rule__Binary__RightAssignment_5 )
            // InternalArg.g:9403:3: rule__Binary__RightAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Binary__RightAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getRightAssignment_5()); 

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
    // $ANTLR end "rule__Binary__Group__5__Impl"


    // $ANTLR start "rule__Binary__Group__6"
    // InternalArg.g:9411:1: rule__Binary__Group__6 : rule__Binary__Group__6__Impl ;
    public final void rule__Binary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9415:1: ( rule__Binary__Group__6__Impl )
            // InternalArg.g:9416:2: rule__Binary__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group__6__Impl();

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
    // $ANTLR end "rule__Binary__Group__6"


    // $ANTLR start "rule__Binary__Group__6__Impl"
    // InternalArg.g:9422:1: rule__Binary__Group__6__Impl : ( ')' ) ;
    public final void rule__Binary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9426:1: ( ( ')' ) )
            // InternalArg.g:9427:1: ( ')' )
            {
            // InternalArg.g:9427:1: ( ')' )
            // InternalArg.g:9428:2: ')'
            {
             before(grammarAccess.getBinaryAccess().getRightParenthesisKeyword_6()); 
            match(input,112,FOLLOW_2); 
             after(grammarAccess.getBinaryAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Binary__Group__6__Impl"


    // $ANTLR start "rule__Arithmetic__Group__0"
    // InternalArg.g:9438:1: rule__Arithmetic__Group__0 : rule__Arithmetic__Group__0__Impl rule__Arithmetic__Group__1 ;
    public final void rule__Arithmetic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9442:1: ( rule__Arithmetic__Group__0__Impl rule__Arithmetic__Group__1 )
            // InternalArg.g:9443:2: rule__Arithmetic__Group__0__Impl rule__Arithmetic__Group__1
            {
            pushFollow(FOLLOW_91);
            rule__Arithmetic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arithmetic__Group__1();

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
    // $ANTLR end "rule__Arithmetic__Group__0"


    // $ANTLR start "rule__Arithmetic__Group__0__Impl"
    // InternalArg.g:9450:1: rule__Arithmetic__Group__0__Impl : ( ( rule__Arithmetic__LeftAssignment_0 ) ) ;
    public final void rule__Arithmetic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9454:1: ( ( ( rule__Arithmetic__LeftAssignment_0 ) ) )
            // InternalArg.g:9455:1: ( ( rule__Arithmetic__LeftAssignment_0 ) )
            {
            // InternalArg.g:9455:1: ( ( rule__Arithmetic__LeftAssignment_0 ) )
            // InternalArg.g:9456:2: ( rule__Arithmetic__LeftAssignment_0 )
            {
             before(grammarAccess.getArithmeticAccess().getLeftAssignment_0()); 
            // InternalArg.g:9457:2: ( rule__Arithmetic__LeftAssignment_0 )
            // InternalArg.g:9457:3: rule__Arithmetic__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Arithmetic__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__Arithmetic__Group__0__Impl"


    // $ANTLR start "rule__Arithmetic__Group__1"
    // InternalArg.g:9465:1: rule__Arithmetic__Group__1 : rule__Arithmetic__Group__1__Impl rule__Arithmetic__Group__2 ;
    public final void rule__Arithmetic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9469:1: ( rule__Arithmetic__Group__1__Impl rule__Arithmetic__Group__2 )
            // InternalArg.g:9470:2: rule__Arithmetic__Group__1__Impl rule__Arithmetic__Group__2
            {
            pushFollow(FOLLOW_87);
            rule__Arithmetic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arithmetic__Group__2();

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
    // $ANTLR end "rule__Arithmetic__Group__1"


    // $ANTLR start "rule__Arithmetic__Group__1__Impl"
    // InternalArg.g:9477:1: rule__Arithmetic__Group__1__Impl : ( ( rule__Arithmetic__OpAssignment_1 ) ) ;
    public final void rule__Arithmetic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9481:1: ( ( ( rule__Arithmetic__OpAssignment_1 ) ) )
            // InternalArg.g:9482:1: ( ( rule__Arithmetic__OpAssignment_1 ) )
            {
            // InternalArg.g:9482:1: ( ( rule__Arithmetic__OpAssignment_1 ) )
            // InternalArg.g:9483:2: ( rule__Arithmetic__OpAssignment_1 )
            {
             before(grammarAccess.getArithmeticAccess().getOpAssignment_1()); 
            // InternalArg.g:9484:2: ( rule__Arithmetic__OpAssignment_1 )
            // InternalArg.g:9484:3: rule__Arithmetic__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Arithmetic__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticAccess().getOpAssignment_1()); 

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
    // $ANTLR end "rule__Arithmetic__Group__1__Impl"


    // $ANTLR start "rule__Arithmetic__Group__2"
    // InternalArg.g:9492:1: rule__Arithmetic__Group__2 : rule__Arithmetic__Group__2__Impl ;
    public final void rule__Arithmetic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9496:1: ( rule__Arithmetic__Group__2__Impl )
            // InternalArg.g:9497:2: rule__Arithmetic__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arithmetic__Group__2__Impl();

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
    // $ANTLR end "rule__Arithmetic__Group__2"


    // $ANTLR start "rule__Arithmetic__Group__2__Impl"
    // InternalArg.g:9503:1: rule__Arithmetic__Group__2__Impl : ( ( rule__Arithmetic__RightAssignment_2 ) ) ;
    public final void rule__Arithmetic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9507:1: ( ( ( rule__Arithmetic__RightAssignment_2 ) ) )
            // InternalArg.g:9508:1: ( ( rule__Arithmetic__RightAssignment_2 ) )
            {
            // InternalArg.g:9508:1: ( ( rule__Arithmetic__RightAssignment_2 ) )
            // InternalArg.g:9509:2: ( rule__Arithmetic__RightAssignment_2 )
            {
             before(grammarAccess.getArithmeticAccess().getRightAssignment_2()); 
            // InternalArg.g:9510:2: ( rule__Arithmetic__RightAssignment_2 )
            // InternalArg.g:9510:3: rule__Arithmetic__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Arithmetic__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__Arithmetic__Group__2__Impl"


    // $ANTLR start "rule__AttributeValue__Group__0"
    // InternalArg.g:9519:1: rule__AttributeValue__Group__0 : rule__AttributeValue__Group__0__Impl rule__AttributeValue__Group__1 ;
    public final void rule__AttributeValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9523:1: ( rule__AttributeValue__Group__0__Impl rule__AttributeValue__Group__1 )
            // InternalArg.g:9524:2: rule__AttributeValue__Group__0__Impl rule__AttributeValue__Group__1
            {
            pushFollow(FOLLOW_92);
            rule__AttributeValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeValue__Group__1();

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
    // $ANTLR end "rule__AttributeValue__Group__0"


    // $ANTLR start "rule__AttributeValue__Group__0__Impl"
    // InternalArg.g:9531:1: rule__AttributeValue__Group__0__Impl : ( ( rule__AttributeValue__ClassAssignment_0 ) ) ;
    public final void rule__AttributeValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9535:1: ( ( ( rule__AttributeValue__ClassAssignment_0 ) ) )
            // InternalArg.g:9536:1: ( ( rule__AttributeValue__ClassAssignment_0 ) )
            {
            // InternalArg.g:9536:1: ( ( rule__AttributeValue__ClassAssignment_0 ) )
            // InternalArg.g:9537:2: ( rule__AttributeValue__ClassAssignment_0 )
            {
             before(grammarAccess.getAttributeValueAccess().getClassAssignment_0()); 
            // InternalArg.g:9538:2: ( rule__AttributeValue__ClassAssignment_0 )
            // InternalArg.g:9538:3: rule__AttributeValue__ClassAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValue__ClassAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValueAccess().getClassAssignment_0()); 

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
    // $ANTLR end "rule__AttributeValue__Group__0__Impl"


    // $ANTLR start "rule__AttributeValue__Group__1"
    // InternalArg.g:9546:1: rule__AttributeValue__Group__1 : rule__AttributeValue__Group__1__Impl rule__AttributeValue__Group__2 ;
    public final void rule__AttributeValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9550:1: ( rule__AttributeValue__Group__1__Impl rule__AttributeValue__Group__2 )
            // InternalArg.g:9551:2: rule__AttributeValue__Group__1__Impl rule__AttributeValue__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__AttributeValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeValue__Group__2();

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
    // $ANTLR end "rule__AttributeValue__Group__1"


    // $ANTLR start "rule__AttributeValue__Group__1__Impl"
    // InternalArg.g:9558:1: rule__AttributeValue__Group__1__Impl : ( '.' ) ;
    public final void rule__AttributeValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9562:1: ( ( '.' ) )
            // InternalArg.g:9563:1: ( '.' )
            {
            // InternalArg.g:9563:1: ( '.' )
            // InternalArg.g:9564:2: '.'
            {
             before(grammarAccess.getAttributeValueAccess().getFullStopKeyword_1()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getAttributeValueAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__AttributeValue__Group__1__Impl"


    // $ANTLR start "rule__AttributeValue__Group__2"
    // InternalArg.g:9573:1: rule__AttributeValue__Group__2 : rule__AttributeValue__Group__2__Impl ;
    public final void rule__AttributeValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9577:1: ( rule__AttributeValue__Group__2__Impl )
            // InternalArg.g:9578:2: rule__AttributeValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValue__Group__2__Impl();

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
    // $ANTLR end "rule__AttributeValue__Group__2"


    // $ANTLR start "rule__AttributeValue__Group__2__Impl"
    // InternalArg.g:9584:1: rule__AttributeValue__Group__2__Impl : ( ( rule__AttributeValue__AttributeAssignment_2 ) ) ;
    public final void rule__AttributeValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9588:1: ( ( ( rule__AttributeValue__AttributeAssignment_2 ) ) )
            // InternalArg.g:9589:1: ( ( rule__AttributeValue__AttributeAssignment_2 ) )
            {
            // InternalArg.g:9589:1: ( ( rule__AttributeValue__AttributeAssignment_2 ) )
            // InternalArg.g:9590:2: ( rule__AttributeValue__AttributeAssignment_2 )
            {
             before(grammarAccess.getAttributeValueAccess().getAttributeAssignment_2()); 
            // InternalArg.g:9591:2: ( rule__AttributeValue__AttributeAssignment_2 )
            // InternalArg.g:9591:3: rule__AttributeValue__AttributeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValue__AttributeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValueAccess().getAttributeAssignment_2()); 

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
    // $ANTLR end "rule__AttributeValue__Group__2__Impl"


    // $ANTLR start "rule__AllInstances__Group__0"
    // InternalArg.g:9600:1: rule__AllInstances__Group__0 : rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1 ;
    public final void rule__AllInstances__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9604:1: ( rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1 )
            // InternalArg.g:9605:2: rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AllInstances__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group__1();

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
    // $ANTLR end "rule__AllInstances__Group__0"


    // $ANTLR start "rule__AllInstances__Group__0__Impl"
    // InternalArg.g:9612:1: rule__AllInstances__Group__0__Impl : ( 'Number' ) ;
    public final void rule__AllInstances__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9616:1: ( ( 'Number' ) )
            // InternalArg.g:9617:1: ( 'Number' )
            {
            // InternalArg.g:9617:1: ( 'Number' )
            // InternalArg.g:9618:2: 'Number'
            {
             before(grammarAccess.getAllInstancesAccess().getNumberKeyword_0()); 
            match(input,115,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getNumberKeyword_0()); 

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
    // $ANTLR end "rule__AllInstances__Group__0__Impl"


    // $ANTLR start "rule__AllInstances__Group__1"
    // InternalArg.g:9627:1: rule__AllInstances__Group__1 : rule__AllInstances__Group__1__Impl ;
    public final void rule__AllInstances__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9631:1: ( rule__AllInstances__Group__1__Impl )
            // InternalArg.g:9632:2: rule__AllInstances__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group__1__Impl();

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
    // $ANTLR end "rule__AllInstances__Group__1"


    // $ANTLR start "rule__AllInstances__Group__1__Impl"
    // InternalArg.g:9638:1: rule__AllInstances__Group__1__Impl : ( ( rule__AllInstances__TypeAssignment_1 ) ) ;
    public final void rule__AllInstances__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9642:1: ( ( ( rule__AllInstances__TypeAssignment_1 ) ) )
            // InternalArg.g:9643:1: ( ( rule__AllInstances__TypeAssignment_1 ) )
            {
            // InternalArg.g:9643:1: ( ( rule__AllInstances__TypeAssignment_1 ) )
            // InternalArg.g:9644:2: ( rule__AllInstances__TypeAssignment_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getTypeAssignment_1()); 
            // InternalArg.g:9645:2: ( rule__AllInstances__TypeAssignment_1 )
            // InternalArg.g:9645:3: rule__AllInstances__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__AllInstances__Group__1__Impl"


    // $ANTLR start "rule__Ontological__NameAssignment_1"
    // InternalArg.g:9654:1: rule__Ontological__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Ontological__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9658:1: ( ( ruleEString ) )
            // InternalArg.g:9659:2: ( ruleEString )
            {
            // InternalArg.g:9659:2: ( ruleEString )
            // InternalArg.g:9660:3: ruleEString
            {
             before(grammarAccess.getOntologicalAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntologicalAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Ontological__NameAssignment_1"


    // $ANTLR start "rule__Ontological__ClassesAssignment_5"
    // InternalArg.g:9669:1: rule__Ontological__ClassesAssignment_5 : ( ruleClass ) ;
    public final void rule__Ontological__ClassesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9673:1: ( ( ruleClass ) )
            // InternalArg.g:9674:2: ( ruleClass )
            {
            // InternalArg.g:9674:2: ( ruleClass )
            // InternalArg.g:9675:3: ruleClass
            {
             before(grammarAccess.getOntologicalAccess().getClassesClassParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getOntologicalAccess().getClassesClassParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Ontological__ClassesAssignment_5"


    // $ANTLR start "rule__Ontological__ClassesAssignment_6"
    // InternalArg.g:9684:1: rule__Ontological__ClassesAssignment_6 : ( ruleClass ) ;
    public final void rule__Ontological__ClassesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9688:1: ( ( ruleClass ) )
            // InternalArg.g:9689:2: ( ruleClass )
            {
            // InternalArg.g:9689:2: ( ruleClass )
            // InternalArg.g:9690:3: ruleClass
            {
             before(grammarAccess.getOntologicalAccess().getClassesClassParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getOntologicalAccess().getClassesClassParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Ontological__ClassesAssignment_6"


    // $ANTLR start "rule__Ontological__GraphicAssignment_9"
    // InternalArg.g:9699:1: rule__Ontological__GraphicAssignment_9 : ( ruleGraphic ) ;
    public final void rule__Ontological__GraphicAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9703:1: ( ( ruleGraphic ) )
            // InternalArg.g:9704:2: ( ruleGraphic )
            {
            // InternalArg.g:9704:2: ( ruleGraphic )
            // InternalArg.g:9705:3: ruleGraphic
            {
             before(grammarAccess.getOntologicalAccess().getGraphicGraphicParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphic();

            state._fsp--;

             after(grammarAccess.getOntologicalAccess().getGraphicGraphicParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Ontological__GraphicAssignment_9"


    // $ANTLR start "rule__Ontological__PhysicAssignment_10"
    // InternalArg.g:9714:1: rule__Ontological__PhysicAssignment_10 : ( rulePhysic ) ;
    public final void rule__Ontological__PhysicAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9718:1: ( ( rulePhysic ) )
            // InternalArg.g:9719:2: ( rulePhysic )
            {
            // InternalArg.g:9719:2: ( rulePhysic )
            // InternalArg.g:9720:3: rulePhysic
            {
             before(grammarAccess.getOntologicalAccess().getPhysicPhysicParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            rulePhysic();

            state._fsp--;

             after(grammarAccess.getOntologicalAccess().getPhysicPhysicParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Ontological__PhysicAssignment_10"


    // $ANTLR start "rule__Ontological__GameAssignment_11"
    // InternalArg.g:9729:1: rule__Ontological__GameAssignment_11 : ( ruleGame ) ;
    public final void rule__Ontological__GameAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9733:1: ( ( ruleGame ) )
            // InternalArg.g:9734:2: ( ruleGame )
            {
            // InternalArg.g:9734:2: ( ruleGame )
            // InternalArg.g:9735:3: ruleGame
            {
             before(grammarAccess.getOntologicalAccess().getGameGameParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getOntologicalAccess().getGameGameParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Ontological__GameAssignment_11"


    // $ANTLR start "rule__Class__NameAssignment_0"
    // InternalArg.g:9744:1: rule__Class__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Class__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9748:1: ( ( ruleEString ) )
            // InternalArg.g:9749:2: ( ruleEString )
            {
            // InternalArg.g:9749:2: ( ruleEString )
            // InternalArg.g:9750:3: ruleEString
            {
             before(grammarAccess.getClassAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Class__NameAssignment_0"


    // $ANTLR start "rule__Class__AttributesAssignment_2_0"
    // InternalArg.g:9759:1: rule__Class__AttributesAssignment_2_0 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9763:1: ( ( ruleAttribute ) )
            // InternalArg.g:9764:2: ( ruleAttribute )
            {
            // InternalArg.g:9764:2: ( ruleAttribute )
            // InternalArg.g:9765:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Class__AttributesAssignment_2_0"


    // $ANTLR start "rule__Class__AttributesAssignment_2_1"
    // InternalArg.g:9774:1: rule__Class__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9778:1: ( ( ruleAttribute ) )
            // InternalArg.g:9779:2: ( ruleAttribute )
            {
            // InternalArg.g:9779:2: ( ruleAttribute )
            // InternalArg.g:9780:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Class__AttributesAssignment_2_1"


    // $ANTLR start "rule__Class__ReferencesAssignment_3_2"
    // InternalArg.g:9789:1: rule__Class__ReferencesAssignment_3_2 : ( ruleReference ) ;
    public final void rule__Class__ReferencesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9793:1: ( ( ruleReference ) )
            // InternalArg.g:9794:2: ( ruleReference )
            {
            // InternalArg.g:9794:2: ( ruleReference )
            // InternalArg.g:9795:3: ruleReference
            {
             before(grammarAccess.getClassAccess().getReferencesReferenceParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getClassAccess().getReferencesReferenceParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Class__ReferencesAssignment_3_2"


    // $ANTLR start "rule__Class__ReferencesAssignment_3_3"
    // InternalArg.g:9804:1: rule__Class__ReferencesAssignment_3_3 : ( ruleReference ) ;
    public final void rule__Class__ReferencesAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9808:1: ( ( ruleReference ) )
            // InternalArg.g:9809:2: ( ruleReference )
            {
            // InternalArg.g:9809:2: ( ruleReference )
            // InternalArg.g:9810:3: ruleReference
            {
             before(grammarAccess.getClassAccess().getReferencesReferenceParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getClassAccess().getReferencesReferenceParserRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__Class__ReferencesAssignment_3_3"


    // $ANTLR start "rule__Class__AbstractAssignment_5"
    // InternalArg.g:9819:1: rule__Class__AbstractAssignment_5 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9823:1: ( ( ( 'abstract' ) ) )
            // InternalArg.g:9824:2: ( ( 'abstract' ) )
            {
            // InternalArg.g:9824:2: ( ( 'abstract' ) )
            // InternalArg.g:9825:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_5_0()); 
            // InternalArg.g:9826:3: ( 'abstract' )
            // InternalArg.g:9827:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_5_0()); 
            match(input,116,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_5_0()); 

            }

             after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_5_0()); 

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
    // $ANTLR end "rule__Class__AbstractAssignment_5"


    // $ANTLR start "rule__Class__NoSCNAssignment_6"
    // InternalArg.g:9838:1: rule__Class__NoSCNAssignment_6 : ( ( 'invisible' ) ) ;
    public final void rule__Class__NoSCNAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9842:1: ( ( ( 'invisible' ) ) )
            // InternalArg.g:9843:2: ( ( 'invisible' ) )
            {
            // InternalArg.g:9843:2: ( ( 'invisible' ) )
            // InternalArg.g:9844:3: ( 'invisible' )
            {
             before(grammarAccess.getClassAccess().getNoSCNInvisibleKeyword_6_0()); 
            // InternalArg.g:9845:3: ( 'invisible' )
            // InternalArg.g:9846:4: 'invisible'
            {
             before(grammarAccess.getClassAccess().getNoSCNInvisibleKeyword_6_0()); 
            match(input,117,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getNoSCNInvisibleKeyword_6_0()); 

            }

             after(grammarAccess.getClassAccess().getNoSCNInvisibleKeyword_6_0()); 

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
    // $ANTLR end "rule__Class__NoSCNAssignment_6"


    // $ANTLR start "rule__Graphic__ClassesAssignment_2"
    // InternalArg.g:9857:1: rule__Graphic__ClassesAssignment_2 : ( ruleGraphicClass ) ;
    public final void rule__Graphic__ClassesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9861:1: ( ( ruleGraphicClass ) )
            // InternalArg.g:9862:2: ( ruleGraphicClass )
            {
            // InternalArg.g:9862:2: ( ruleGraphicClass )
            // InternalArg.g:9863:3: ruleGraphicClass
            {
             before(grammarAccess.getGraphicAccess().getClassesGraphicClassParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicClass();

            state._fsp--;

             after(grammarAccess.getGraphicAccess().getClassesGraphicClassParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Graphic__ClassesAssignment_2"


    // $ANTLR start "rule__Graphic__ClassesAssignment_3"
    // InternalArg.g:9872:1: rule__Graphic__ClassesAssignment_3 : ( ruleGraphicClass ) ;
    public final void rule__Graphic__ClassesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9876:1: ( ( ruleGraphicClass ) )
            // InternalArg.g:9877:2: ( ruleGraphicClass )
            {
            // InternalArg.g:9877:2: ( ruleGraphicClass )
            // InternalArg.g:9878:3: ruleGraphicClass
            {
             before(grammarAccess.getGraphicAccess().getClassesGraphicClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicClass();

            state._fsp--;

             after(grammarAccess.getGraphicAccess().getClassesGraphicClassParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Graphic__ClassesAssignment_3"


    // $ANTLR start "rule__Physic__ClassesAssignment_2"
    // InternalArg.g:9887:1: rule__Physic__ClassesAssignment_2 : ( rulePhysicClass ) ;
    public final void rule__Physic__ClassesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9891:1: ( ( rulePhysicClass ) )
            // InternalArg.g:9892:2: ( rulePhysicClass )
            {
            // InternalArg.g:9892:2: ( rulePhysicClass )
            // InternalArg.g:9893:3: rulePhysicClass
            {
             before(grammarAccess.getPhysicAccess().getClassesPhysicClassParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhysicClass();

            state._fsp--;

             after(grammarAccess.getPhysicAccess().getClassesPhysicClassParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Physic__ClassesAssignment_2"


    // $ANTLR start "rule__Physic__ClassesAssignment_3"
    // InternalArg.g:9902:1: rule__Physic__ClassesAssignment_3 : ( rulePhysicClass ) ;
    public final void rule__Physic__ClassesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9906:1: ( ( rulePhysicClass ) )
            // InternalArg.g:9907:2: ( rulePhysicClass )
            {
            // InternalArg.g:9907:2: ( rulePhysicClass )
            // InternalArg.g:9908:3: rulePhysicClass
            {
             before(grammarAccess.getPhysicAccess().getClassesPhysicClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePhysicClass();

            state._fsp--;

             after(grammarAccess.getPhysicAccess().getClassesPhysicClassParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Physic__ClassesAssignment_3"


    // $ANTLR start "rule__Game__StartAssignment_5"
    // InternalArg.g:9917:1: rule__Game__StartAssignment_5 : ( ruleEString ) ;
    public final void rule__Game__StartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9921:1: ( ( ruleEString ) )
            // InternalArg.g:9922:2: ( ruleEString )
            {
            // InternalArg.g:9922:2: ( ruleEString )
            // InternalArg.g:9923:3: ruleEString
            {
             before(grammarAccess.getGameAccess().getStartEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGameAccess().getStartEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Game__StartAssignment_5"


    // $ANTLR start "rule__Game__WinAssignment_7"
    // InternalArg.g:9932:1: rule__Game__WinAssignment_7 : ( ruleEString ) ;
    public final void rule__Game__WinAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9936:1: ( ( ruleEString ) )
            // InternalArg.g:9937:2: ( ruleEString )
            {
            // InternalArg.g:9937:2: ( ruleEString )
            // InternalArg.g:9938:3: ruleEString
            {
             before(grammarAccess.getGameAccess().getWinEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGameAccess().getWinEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Game__WinAssignment_7"


    // $ANTLR start "rule__Game__LoseAssignment_9"
    // InternalArg.g:9947:1: rule__Game__LoseAssignment_9 : ( ruleEString ) ;
    public final void rule__Game__LoseAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9951:1: ( ( ruleEString ) )
            // InternalArg.g:9952:2: ( ruleEString )
            {
            // InternalArg.g:9952:2: ( ruleEString )
            // InternalArg.g:9953:3: ruleEString
            {
             before(grammarAccess.getGameAccess().getLoseEStringParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGameAccess().getLoseEStringParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Game__LoseAssignment_9"


    // $ANTLR start "rule__Game__ScoreAssignment_12"
    // InternalArg.g:9962:1: rule__Game__ScoreAssignment_12 : ( ruleScoreSystem ) ;
    public final void rule__Game__ScoreAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9966:1: ( ( ruleScoreSystem ) )
            // InternalArg.g:9967:2: ( ruleScoreSystem )
            {
            // InternalArg.g:9967:2: ( ruleScoreSystem )
            // InternalArg.g:9968:3: ruleScoreSystem
            {
             before(grammarAccess.getGameAccess().getScoreScoreSystemParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleScoreSystem();

            state._fsp--;

             after(grammarAccess.getGameAccess().getScoreScoreSystemParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Game__ScoreAssignment_12"


    // $ANTLR start "rule__Game__ActionsTriggersAssignment_15_2"
    // InternalArg.g:9977:1: rule__Game__ActionsTriggersAssignment_15_2 : ( ruleTrigger ) ;
    public final void rule__Game__ActionsTriggersAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9981:1: ( ( ruleTrigger ) )
            // InternalArg.g:9982:2: ( ruleTrigger )
            {
            // InternalArg.g:9982:2: ( ruleTrigger )
            // InternalArg.g:9983:3: ruleTrigger
            {
             before(grammarAccess.getGameAccess().getActionsTriggersTriggerParserRuleCall_15_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getGameAccess().getActionsTriggersTriggerParserRuleCall_15_2_0()); 

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
    // $ANTLR end "rule__Game__ActionsTriggersAssignment_15_2"


    // $ANTLR start "rule__Game__ActionsTriggersAssignment_15_3"
    // InternalArg.g:9992:1: rule__Game__ActionsTriggersAssignment_15_3 : ( ruleTrigger ) ;
    public final void rule__Game__ActionsTriggersAssignment_15_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:9996:1: ( ( ruleTrigger ) )
            // InternalArg.g:9997:2: ( ruleTrigger )
            {
            // InternalArg.g:9997:2: ( ruleTrigger )
            // InternalArg.g:9998:3: ruleTrigger
            {
             before(grammarAccess.getGameAccess().getActionsTriggersTriggerParserRuleCall_15_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getGameAccess().getActionsTriggersTriggerParserRuleCall_15_3_0()); 

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
    // $ANTLR end "rule__Game__ActionsTriggersAssignment_15_3"


    // $ANTLR start "rule__Game__CollisionsAssignment_16_2"
    // InternalArg.g:10007:1: rule__Game__CollisionsAssignment_16_2 : ( ruleCollision ) ;
    public final void rule__Game__CollisionsAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10011:1: ( ( ruleCollision ) )
            // InternalArg.g:10012:2: ( ruleCollision )
            {
            // InternalArg.g:10012:2: ( ruleCollision )
            // InternalArg.g:10013:3: ruleCollision
            {
             before(grammarAccess.getGameAccess().getCollisionsCollisionParserRuleCall_16_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getGameAccess().getCollisionsCollisionParserRuleCall_16_2_0()); 

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
    // $ANTLR end "rule__Game__CollisionsAssignment_16_2"


    // $ANTLR start "rule__Game__CollisionsAssignment_16_3"
    // InternalArg.g:10022:1: rule__Game__CollisionsAssignment_16_3 : ( ruleCollision ) ;
    public final void rule__Game__CollisionsAssignment_16_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10026:1: ( ( ruleCollision ) )
            // InternalArg.g:10027:2: ( ruleCollision )
            {
            // InternalArg.g:10027:2: ( ruleCollision )
            // InternalArg.g:10028:3: ruleCollision
            {
             before(grammarAccess.getGameAccess().getCollisionsCollisionParserRuleCall_16_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getGameAccess().getCollisionsCollisionParserRuleCall_16_3_0()); 

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
    // $ANTLR end "rule__Game__CollisionsAssignment_16_3"


    // $ANTLR start "rule__Game__GamepadAssignment_17_2"
    // InternalArg.g:10037:1: rule__Game__GamepadAssignment_17_2 : ( ruleGamePad ) ;
    public final void rule__Game__GamepadAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10041:1: ( ( ruleGamePad ) )
            // InternalArg.g:10042:2: ( ruleGamePad )
            {
            // InternalArg.g:10042:2: ( ruleGamePad )
            // InternalArg.g:10043:3: ruleGamePad
            {
             before(grammarAccess.getGameAccess().getGamepadGamePadParserRuleCall_17_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGamePad();

            state._fsp--;

             after(grammarAccess.getGameAccess().getGamepadGamePadParserRuleCall_17_2_0()); 

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
    // $ANTLR end "rule__Game__GamepadAssignment_17_2"


    // $ANTLR start "rule__Game__GamepadAssignment_17_3"
    // InternalArg.g:10052:1: rule__Game__GamepadAssignment_17_3 : ( ruleGamePad ) ;
    public final void rule__Game__GamepadAssignment_17_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10056:1: ( ( ruleGamePad ) )
            // InternalArg.g:10057:2: ( ruleGamePad )
            {
            // InternalArg.g:10057:2: ( ruleGamePad )
            // InternalArg.g:10058:3: ruleGamePad
            {
             before(grammarAccess.getGameAccess().getGamepadGamePadParserRuleCall_17_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGamePad();

            state._fsp--;

             after(grammarAccess.getGameAccess().getGamepadGamePadParserRuleCall_17_3_0()); 

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
    // $ANTLR end "rule__Game__GamepadAssignment_17_3"


    // $ANTLR start "rule__Game__ObjInitAssignment_18_2"
    // InternalArg.g:10067:1: rule__Game__ObjInitAssignment_18_2 : ( ruleObjInit ) ;
    public final void rule__Game__ObjInitAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10071:1: ( ( ruleObjInit ) )
            // InternalArg.g:10072:2: ( ruleObjInit )
            {
            // InternalArg.g:10072:2: ( ruleObjInit )
            // InternalArg.g:10073:3: ruleObjInit
            {
             before(grammarAccess.getGameAccess().getObjInitObjInitParserRuleCall_18_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjInit();

            state._fsp--;

             after(grammarAccess.getGameAccess().getObjInitObjInitParserRuleCall_18_2_0()); 

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
    // $ANTLR end "rule__Game__ObjInitAssignment_18_2"


    // $ANTLR start "rule__Game__ObjInitAssignment_18_3"
    // InternalArg.g:10082:1: rule__Game__ObjInitAssignment_18_3 : ( ruleObjInit ) ;
    public final void rule__Game__ObjInitAssignment_18_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10086:1: ( ( ruleObjInit ) )
            // InternalArg.g:10087:2: ( ruleObjInit )
            {
            // InternalArg.g:10087:2: ( ruleObjInit )
            // InternalArg.g:10088:3: ruleObjInit
            {
             before(grammarAccess.getGameAccess().getObjInitObjInitParserRuleCall_18_3_0()); 
            pushFollow(FOLLOW_2);
            ruleObjInit();

            state._fsp--;

             after(grammarAccess.getGameAccess().getObjInitObjInitParserRuleCall_18_3_0()); 

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
    // $ANTLR end "rule__Game__ObjInitAssignment_18_3"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalArg.g:10097:1: rule__Attribute__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10101:1: ( ( ruleEString ) )
            // InternalArg.g:10102:2: ( ruleEString )
            {
            // InternalArg.g:10102:2: ( ruleEString )
            // InternalArg.g:10103:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // InternalArg.g:10112:1: rule__Attribute__TypeAssignment_2 : ( ruleEString ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10116:1: ( ( ruleEString ) )
            // InternalArg.g:10117:2: ( ruleEString )
            {
            // InternalArg.g:10117:2: ( ruleEString )
            // InternalArg.g:10118:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getTypeEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__Attribute__MinAssignment_4"
    // InternalArg.g:10127:1: rule__Attribute__MinAssignment_4 : ( ruleEInt ) ;
    public final void rule__Attribute__MinAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10131:1: ( ( ruleEInt ) )
            // InternalArg.g:10132:2: ( ruleEInt )
            {
            // InternalArg.g:10132:2: ( ruleEInt )
            // InternalArg.g:10133:3: ruleEInt
            {
             before(grammarAccess.getAttributeAccess().getMinEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getMinEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Attribute__MinAssignment_4"


    // $ANTLR start "rule__Attribute__MaxAssignment_6"
    // InternalArg.g:10142:1: rule__Attribute__MaxAssignment_6 : ( ruleAttributeMax ) ;
    public final void rule__Attribute__MaxAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10146:1: ( ( ruleAttributeMax ) )
            // InternalArg.g:10147:2: ( ruleAttributeMax )
            {
            // InternalArg.g:10147:2: ( ruleAttributeMax )
            // InternalArg.g:10148:3: ruleAttributeMax
            {
             before(grammarAccess.getAttributeAccess().getMaxAttributeMaxParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeMax();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getMaxAttributeMaxParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Attribute__MaxAssignment_6"


    // $ANTLR start "rule__Attribute__DefaultAssignment_9"
    // InternalArg.g:10157:1: rule__Attribute__DefaultAssignment_9 : ( ruleConstant ) ;
    public final void rule__Attribute__DefaultAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10161:1: ( ( ruleConstant ) )
            // InternalArg.g:10162:2: ( ruleConstant )
            {
            // InternalArg.g:10162:2: ( ruleConstant )
            // InternalArg.g:10163:3: ruleConstant
            {
             before(grammarAccess.getAttributeAccess().getDefaultConstantParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getDefaultConstantParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Attribute__DefaultAssignment_9"


    // $ANTLR start "rule__Attribute__IsParamAssignment_10"
    // InternalArg.g:10172:1: rule__Attribute__IsParamAssignment_10 : ( ( 'isParam' ) ) ;
    public final void rule__Attribute__IsParamAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10176:1: ( ( ( 'isParam' ) ) )
            // InternalArg.g:10177:2: ( ( 'isParam' ) )
            {
            // InternalArg.g:10177:2: ( ( 'isParam' ) )
            // InternalArg.g:10178:3: ( 'isParam' )
            {
             before(grammarAccess.getAttributeAccess().getIsParamIsParamKeyword_10_0()); 
            // InternalArg.g:10179:3: ( 'isParam' )
            // InternalArg.g:10180:4: 'isParam'
            {
             before(grammarAccess.getAttributeAccess().getIsParamIsParamKeyword_10_0()); 
            match(input,118,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIsParamIsParamKeyword_10_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIsParamIsParamKeyword_10_0()); 

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
    // $ANTLR end "rule__Attribute__IsParamAssignment_10"


    // $ANTLR start "rule__Attribute__IsKeyAssignment_11"
    // InternalArg.g:10191:1: rule__Attribute__IsKeyAssignment_11 : ( ( 'isKey' ) ) ;
    public final void rule__Attribute__IsKeyAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10195:1: ( ( ( 'isKey' ) ) )
            // InternalArg.g:10196:2: ( ( 'isKey' ) )
            {
            // InternalArg.g:10196:2: ( ( 'isKey' ) )
            // InternalArg.g:10197:3: ( 'isKey' )
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsKeyKeyword_11_0()); 
            // InternalArg.g:10198:3: ( 'isKey' )
            // InternalArg.g:10199:4: 'isKey'
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsKeyKeyword_11_0()); 
            match(input,119,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIsKeyIsKeyKeyword_11_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIsKeyIsKeyKeyword_11_0()); 

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
    // $ANTLR end "rule__Attribute__IsKeyAssignment_11"


    // $ANTLR start "rule__Attribute__ReadOnlyAssignment_12"
    // InternalArg.g:10210:1: rule__Attribute__ReadOnlyAssignment_12 : ( ( 'readOnly' ) ) ;
    public final void rule__Attribute__ReadOnlyAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10214:1: ( ( ( 'readOnly' ) ) )
            // InternalArg.g:10215:2: ( ( 'readOnly' ) )
            {
            // InternalArg.g:10215:2: ( ( 'readOnly' ) )
            // InternalArg.g:10216:3: ( 'readOnly' )
            {
             before(grammarAccess.getAttributeAccess().getReadOnlyReadOnlyKeyword_12_0()); 
            // InternalArg.g:10217:3: ( 'readOnly' )
            // InternalArg.g:10218:4: 'readOnly'
            {
             before(grammarAccess.getAttributeAccess().getReadOnlyReadOnlyKeyword_12_0()); 
            match(input,120,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getReadOnlyReadOnlyKeyword_12_0()); 

            }

             after(grammarAccess.getAttributeAccess().getReadOnlyReadOnlyKeyword_12_0()); 

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
    // $ANTLR end "rule__Attribute__ReadOnlyAssignment_12"


    // $ANTLR start "rule__Reference__NameAssignment_0"
    // InternalArg.g:10229:1: rule__Reference__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Reference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10233:1: ( ( ruleEString ) )
            // InternalArg.g:10234:2: ( ruleEString )
            {
            // InternalArg.g:10234:2: ( ruleEString )
            // InternalArg.g:10235:3: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Reference__NameAssignment_0"


    // $ANTLR start "rule__Reference__ContaintmentAssignment_1_1"
    // InternalArg.g:10244:1: rule__Reference__ContaintmentAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Reference__ContaintmentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10248:1: ( ( ruleEString ) )
            // InternalArg.g:10249:2: ( ruleEString )
            {
            // InternalArg.g:10249:2: ( ruleEString )
            // InternalArg.g:10250:3: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getContaintmentEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getContaintmentEStringParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Reference__ContaintmentAssignment_1_1"


    // $ANTLR start "rule__Reference__MinAssignment_3"
    // InternalArg.g:10259:1: rule__Reference__MinAssignment_3 : ( ruleEInt ) ;
    public final void rule__Reference__MinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10263:1: ( ( ruleEInt ) )
            // InternalArg.g:10264:2: ( ruleEInt )
            {
            // InternalArg.g:10264:2: ( ruleEInt )
            // InternalArg.g:10265:3: ruleEInt
            {
             before(grammarAccess.getReferenceAccess().getMinEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getMinEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Reference__MinAssignment_3"


    // $ANTLR start "rule__Reference__MaxAssignment_5"
    // InternalArg.g:10274:1: rule__Reference__MaxAssignment_5 : ( ruleEInt ) ;
    public final void rule__Reference__MaxAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10278:1: ( ( ruleEInt ) )
            // InternalArg.g:10279:2: ( ruleEInt )
            {
            // InternalArg.g:10279:2: ( ruleEInt )
            // InternalArg.g:10280:3: ruleEInt
            {
             before(grammarAccess.getReferenceAccess().getMaxEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getMaxEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Reference__MaxAssignment_5"


    // $ANTLR start "rule__Reference__TargetAssignment_7"
    // InternalArg.g:10289:1: rule__Reference__TargetAssignment_7 : ( ruleEString ) ;
    public final void rule__Reference__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10293:1: ( ( ruleEString ) )
            // InternalArg.g:10294:2: ( ruleEString )
            {
            // InternalArg.g:10294:2: ( ruleEString )
            // InternalArg.g:10295:3: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getTargetEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getTargetEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Reference__TargetAssignment_7"


    // $ANTLR start "rule__Reference__OppositeAssignment_8_1"
    // InternalArg.g:10304:1: rule__Reference__OppositeAssignment_8_1 : ( ruleEString ) ;
    public final void rule__Reference__OppositeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10308:1: ( ( ruleEString ) )
            // InternalArg.g:10309:2: ( ruleEString )
            {
            // InternalArg.g:10309:2: ( ruleEString )
            // InternalArg.g:10310:3: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getOppositeEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getOppositeEStringParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Reference__OppositeAssignment_8_1"


    // $ANTLR start "rule__GraphicClass__OntoClassAssignment_1"
    // InternalArg.g:10319:1: rule__GraphicClass__OntoClassAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__GraphicClass__OntoClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10323:1: ( ( ( ruleEString ) ) )
            // InternalArg.g:10324:2: ( ( ruleEString ) )
            {
            // InternalArg.g:10324:2: ( ( ruleEString ) )
            // InternalArg.g:10325:3: ( ruleEString )
            {
             before(grammarAccess.getGraphicClassAccess().getOntoClassClassCrossReference_1_0()); 
            // InternalArg.g:10326:3: ( ruleEString )
            // InternalArg.g:10327:4: ruleEString
            {
             before(grammarAccess.getGraphicClassAccess().getOntoClassClassEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphicClassAccess().getOntoClassClassEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getGraphicClassAccess().getOntoClassClassCrossReference_1_0()); 

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
    // $ANTLR end "rule__GraphicClass__OntoClassAssignment_1"


    // $ANTLR start "rule__GraphicClass__VersionsAssignment_4"
    // InternalArg.g:10338:1: rule__GraphicClass__VersionsAssignment_4 : ( ruleVersions ) ;
    public final void rule__GraphicClass__VersionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10342:1: ( ( ruleVersions ) )
            // InternalArg.g:10343:2: ( ruleVersions )
            {
            // InternalArg.g:10343:2: ( ruleVersions )
            // InternalArg.g:10344:3: ruleVersions
            {
             before(grammarAccess.getGraphicClassAccess().getVersionsVersionsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVersions();

            state._fsp--;

             after(grammarAccess.getGraphicClassAccess().getVersionsVersionsParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__GraphicClass__VersionsAssignment_4"


    // $ANTLR start "rule__GraphicClass__VersionsAssignment_5"
    // InternalArg.g:10353:1: rule__GraphicClass__VersionsAssignment_5 : ( ruleVersions ) ;
    public final void rule__GraphicClass__VersionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10357:1: ( ( ruleVersions ) )
            // InternalArg.g:10358:2: ( ruleVersions )
            {
            // InternalArg.g:10358:2: ( ruleVersions )
            // InternalArg.g:10359:3: ruleVersions
            {
             before(grammarAccess.getGraphicClassAccess().getVersionsVersionsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleVersions();

            state._fsp--;

             after(grammarAccess.getGraphicClassAccess().getVersionsVersionsParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__GraphicClass__VersionsAssignment_5"


    // $ANTLR start "rule__GraphicClass__ConstraintsAssignment_9"
    // InternalArg.g:10368:1: rule__GraphicClass__ConstraintsAssignment_9 : ( ruleConstraints ) ;
    public final void rule__GraphicClass__ConstraintsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10372:1: ( ( ruleConstraints ) )
            // InternalArg.g:10373:2: ( ruleConstraints )
            {
            // InternalArg.g:10373:2: ( ruleConstraints )
            // InternalArg.g:10374:3: ruleConstraints
            {
             before(grammarAccess.getGraphicClassAccess().getConstraintsConstraintsParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraints();

            state._fsp--;

             after(grammarAccess.getGraphicClassAccess().getConstraintsConstraintsParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__GraphicClass__ConstraintsAssignment_9"


    // $ANTLR start "rule__Constraints__PlanesAssignment_1"
    // InternalArg.g:10383:1: rule__Constraints__PlanesAssignment_1 : ( rulePlanes ) ;
    public final void rule__Constraints__PlanesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10387:1: ( ( rulePlanes ) )
            // InternalArg.g:10388:2: ( rulePlanes )
            {
            // InternalArg.g:10388:2: ( rulePlanes )
            // InternalArg.g:10389:3: rulePlanes
            {
             before(grammarAccess.getConstraintsAccess().getPlanesPlanesEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlanes();

            state._fsp--;

             after(grammarAccess.getConstraintsAccess().getPlanesPlanesEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Constraints__PlanesAssignment_1"


    // $ANTLR start "rule__Constraints__OverlappingAssignment_2"
    // InternalArg.g:10398:1: rule__Constraints__OverlappingAssignment_2 : ( ( 'overlaps' ) ) ;
    public final void rule__Constraints__OverlappingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10402:1: ( ( ( 'overlaps' ) ) )
            // InternalArg.g:10403:2: ( ( 'overlaps' ) )
            {
            // InternalArg.g:10403:2: ( ( 'overlaps' ) )
            // InternalArg.g:10404:3: ( 'overlaps' )
            {
             before(grammarAccess.getConstraintsAccess().getOverlappingOverlapsKeyword_2_0()); 
            // InternalArg.g:10405:3: ( 'overlaps' )
            // InternalArg.g:10406:4: 'overlaps'
            {
             before(grammarAccess.getConstraintsAccess().getOverlappingOverlapsKeyword_2_0()); 
            match(input,121,FOLLOW_2); 
             after(grammarAccess.getConstraintsAccess().getOverlappingOverlapsKeyword_2_0()); 

            }

             after(grammarAccess.getConstraintsAccess().getOverlappingOverlapsKeyword_2_0()); 

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
    // $ANTLR end "rule__Constraints__OverlappingAssignment_2"


    // $ANTLR start "rule__Constraints__SizeMinAssignment_4"
    // InternalArg.g:10417:1: rule__Constraints__SizeMinAssignment_4 : ( ruleEDouble ) ;
    public final void rule__Constraints__SizeMinAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10421:1: ( ( ruleEDouble ) )
            // InternalArg.g:10422:2: ( ruleEDouble )
            {
            // InternalArg.g:10422:2: ( ruleEDouble )
            // InternalArg.g:10423:3: ruleEDouble
            {
             before(grammarAccess.getConstraintsAccess().getSizeMinEDoubleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getConstraintsAccess().getSizeMinEDoubleParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Constraints__SizeMinAssignment_4"


    // $ANTLR start "rule__Constraints__SizeMaxAssignment_6"
    // InternalArg.g:10432:1: rule__Constraints__SizeMaxAssignment_6 : ( ruleEDouble ) ;
    public final void rule__Constraints__SizeMaxAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10436:1: ( ( ruleEDouble ) )
            // InternalArg.g:10437:2: ( ruleEDouble )
            {
            // InternalArg.g:10437:2: ( ruleEDouble )
            // InternalArg.g:10438:3: ruleEDouble
            {
             before(grammarAccess.getConstraintsAccess().getSizeMaxEDoubleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getConstraintsAccess().getSizeMaxEDoubleParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Constraints__SizeMaxAssignment_6"


    // $ANTLR start "rule__Constraints__XToOriginPosAssignment_8"
    // InternalArg.g:10447:1: rule__Constraints__XToOriginPosAssignment_8 : ( ruleEDouble ) ;
    public final void rule__Constraints__XToOriginPosAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10451:1: ( ( ruleEDouble ) )
            // InternalArg.g:10452:2: ( ruleEDouble )
            {
            // InternalArg.g:10452:2: ( ruleEDouble )
            // InternalArg.g:10453:3: ruleEDouble
            {
             before(grammarAccess.getConstraintsAccess().getXToOriginPosEDoubleParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getConstraintsAccess().getXToOriginPosEDoubleParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Constraints__XToOriginPosAssignment_8"


    // $ANTLR start "rule__Constraints__YToOriginPosAssignment_10"
    // InternalArg.g:10462:1: rule__Constraints__YToOriginPosAssignment_10 : ( ruleEDouble ) ;
    public final void rule__Constraints__YToOriginPosAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10466:1: ( ( ruleEDouble ) )
            // InternalArg.g:10467:2: ( ruleEDouble )
            {
            // InternalArg.g:10467:2: ( ruleEDouble )
            // InternalArg.g:10468:3: ruleEDouble
            {
             before(grammarAccess.getConstraintsAccess().getYToOriginPosEDoubleParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getConstraintsAccess().getYToOriginPosEDoubleParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Constraints__YToOriginPosAssignment_10"


    // $ANTLR start "rule__Constraints__ZToOriginPosAssignment_12"
    // InternalArg.g:10477:1: rule__Constraints__ZToOriginPosAssignment_12 : ( ruleEDouble ) ;
    public final void rule__Constraints__ZToOriginPosAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10481:1: ( ( ruleEDouble ) )
            // InternalArg.g:10482:2: ( ruleEDouble )
            {
            // InternalArg.g:10482:2: ( ruleEDouble )
            // InternalArg.g:10483:3: ruleEDouble
            {
             before(grammarAccess.getConstraintsAccess().getZToOriginPosEDoubleParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getConstraintsAccess().getZToOriginPosEDoubleParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Constraints__ZToOriginPosAssignment_12"


    // $ANTLR start "rule__Constraints__RotationAssignment_14"
    // InternalArg.g:10492:1: rule__Constraints__RotationAssignment_14 : ( ruleEInt ) ;
    public final void rule__Constraints__RotationAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10496:1: ( ( ruleEInt ) )
            // InternalArg.g:10497:2: ( ruleEInt )
            {
            // InternalArg.g:10497:2: ( ruleEInt )
            // InternalArg.g:10498:3: ruleEInt
            {
             before(grammarAccess.getConstraintsAccess().getRotationEIntParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getConstraintsAccess().getRotationEIntParserRuleCall_14_0()); 

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
    // $ANTLR end "rule__Constraints__RotationAssignment_14"


    // $ANTLR start "rule__Versions__NameAssignment_0"
    // InternalArg.g:10507:1: rule__Versions__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Versions__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10511:1: ( ( ruleEString ) )
            // InternalArg.g:10512:2: ( ruleEString )
            {
            // InternalArg.g:10512:2: ( ruleEString )
            // InternalArg.g:10513:3: ruleEString
            {
             before(grammarAccess.getVersionsAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVersionsAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Versions__NameAssignment_0"


    // $ANTLR start "rule__Versions__URLAssignment_2"
    // InternalArg.g:10522:1: rule__Versions__URLAssignment_2 : ( ruleEString ) ;
    public final void rule__Versions__URLAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10526:1: ( ( ruleEString ) )
            // InternalArg.g:10527:2: ( ruleEString )
            {
            // InternalArg.g:10527:2: ( ruleEString )
            // InternalArg.g:10528:3: ruleEString
            {
             before(grammarAccess.getVersionsAccess().getURLEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVersionsAccess().getURLEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Versions__URLAssignment_2"


    // $ANTLR start "rule__PhysicClass__OntoClassAssignment_1"
    // InternalArg.g:10537:1: rule__PhysicClass__OntoClassAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__PhysicClass__OntoClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10541:1: ( ( ( ruleEString ) ) )
            // InternalArg.g:10542:2: ( ( ruleEString ) )
            {
            // InternalArg.g:10542:2: ( ( ruleEString ) )
            // InternalArg.g:10543:3: ( ruleEString )
            {
             before(grammarAccess.getPhysicClassAccess().getOntoClassClassCrossReference_1_0()); 
            // InternalArg.g:10544:3: ( ruleEString )
            // InternalArg.g:10545:4: ruleEString
            {
             before(grammarAccess.getPhysicClassAccess().getOntoClassClassEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPhysicClassAccess().getOntoClassClassEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPhysicClassAccess().getOntoClassClassCrossReference_1_0()); 

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
    // $ANTLR end "rule__PhysicClass__OntoClassAssignment_1"


    // $ANTLR start "rule__PhysicClass__PhysicBodyAssignment_4"
    // InternalArg.g:10556:1: rule__PhysicClass__PhysicBodyAssignment_4 : ( rulePhysicBody ) ;
    public final void rule__PhysicClass__PhysicBodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10560:1: ( ( rulePhysicBody ) )
            // InternalArg.g:10561:2: ( rulePhysicBody )
            {
            // InternalArg.g:10561:2: ( rulePhysicBody )
            // InternalArg.g:10562:3: rulePhysicBody
            {
             before(grammarAccess.getPhysicClassAccess().getPhysicBodyPhysicBodyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePhysicBody();

            state._fsp--;

             after(grammarAccess.getPhysicClassAccess().getPhysicBodyPhysicBodyParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__PhysicClass__PhysicBodyAssignment_4"


    // $ANTLR start "rule__PhysicClass__ForcesAssignment_6_2"
    // InternalArg.g:10571:1: rule__PhysicClass__ForcesAssignment_6_2 : ( ruleForce ) ;
    public final void rule__PhysicClass__ForcesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10575:1: ( ( ruleForce ) )
            // InternalArg.g:10576:2: ( ruleForce )
            {
            // InternalArg.g:10576:2: ( ruleForce )
            // InternalArg.g:10577:3: ruleForce
            {
             before(grammarAccess.getPhysicClassAccess().getForcesForceParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleForce();

            state._fsp--;

             after(grammarAccess.getPhysicClassAccess().getForcesForceParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__PhysicClass__ForcesAssignment_6_2"


    // $ANTLR start "rule__PhysicClass__ForcesAssignment_6_3"
    // InternalArg.g:10586:1: rule__PhysicClass__ForcesAssignment_6_3 : ( ruleForce ) ;
    public final void rule__PhysicClass__ForcesAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10590:1: ( ( ruleForce ) )
            // InternalArg.g:10591:2: ( ruleForce )
            {
            // InternalArg.g:10591:2: ( ruleForce )
            // InternalArg.g:10592:3: ruleForce
            {
             before(grammarAccess.getPhysicClassAccess().getForcesForceParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleForce();

            state._fsp--;

             after(grammarAccess.getPhysicClassAccess().getForcesForceParserRuleCall_6_3_0()); 

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
    // $ANTLR end "rule__PhysicClass__ForcesAssignment_6_3"


    // $ANTLR start "rule__PhysicClass__BitMasksAssignment_7_2"
    // InternalArg.g:10601:1: rule__PhysicClass__BitMasksAssignment_7_2 : ( ruleBitMasks ) ;
    public final void rule__PhysicClass__BitMasksAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10605:1: ( ( ruleBitMasks ) )
            // InternalArg.g:10606:2: ( ruleBitMasks )
            {
            // InternalArg.g:10606:2: ( ruleBitMasks )
            // InternalArg.g:10607:3: ruleBitMasks
            {
             before(grammarAccess.getPhysicClassAccess().getBitMasksBitMasksParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBitMasks();

            state._fsp--;

             after(grammarAccess.getPhysicClassAccess().getBitMasksBitMasksParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__PhysicClass__BitMasksAssignment_7_2"


    // $ANTLR start "rule__PhysicBody__MassAssignment_1"
    // InternalArg.g:10616:1: rule__PhysicBody__MassAssignment_1 : ( ruleEDouble ) ;
    public final void rule__PhysicBody__MassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10620:1: ( ( ruleEDouble ) )
            // InternalArg.g:10621:2: ( ruleEDouble )
            {
            // InternalArg.g:10621:2: ( ruleEDouble )
            // InternalArg.g:10622:3: ruleEDouble
            {
             before(grammarAccess.getPhysicBodyAccess().getMassEDoubleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPhysicBodyAccess().getMassEDoubleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PhysicBody__MassAssignment_1"


    // $ANTLR start "rule__PhysicBody__BodyTypeAssignment_3"
    // InternalArg.g:10631:1: rule__PhysicBody__BodyTypeAssignment_3 : ( ruleBodyType ) ;
    public final void rule__PhysicBody__BodyTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10635:1: ( ( ruleBodyType ) )
            // InternalArg.g:10636:2: ( ruleBodyType )
            {
            // InternalArg.g:10636:2: ( ruleBodyType )
            // InternalArg.g:10637:3: ruleBodyType
            {
             before(grammarAccess.getPhysicBodyAccess().getBodyTypeBodyTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBodyType();

            state._fsp--;

             after(grammarAccess.getPhysicBodyAccess().getBodyTypeBodyTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__PhysicBody__BodyTypeAssignment_3"


    // $ANTLR start "rule__PhysicBody__ChargeAssignment_5"
    // InternalArg.g:10646:1: rule__PhysicBody__ChargeAssignment_5 : ( ruleEDouble ) ;
    public final void rule__PhysicBody__ChargeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10650:1: ( ( ruleEDouble ) )
            // InternalArg.g:10651:2: ( ruleEDouble )
            {
            // InternalArg.g:10651:2: ( ruleEDouble )
            // InternalArg.g:10652:3: ruleEDouble
            {
             before(grammarAccess.getPhysicBodyAccess().getChargeEDoubleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPhysicBodyAccess().getChargeEDoubleParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__PhysicBody__ChargeAssignment_5"


    // $ANTLR start "rule__PhysicBody__FrictionAssignment_7"
    // InternalArg.g:10661:1: rule__PhysicBody__FrictionAssignment_7 : ( ruleEDouble ) ;
    public final void rule__PhysicBody__FrictionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10665:1: ( ( ruleEDouble ) )
            // InternalArg.g:10666:2: ( ruleEDouble )
            {
            // InternalArg.g:10666:2: ( ruleEDouble )
            // InternalArg.g:10667:3: ruleEDouble
            {
             before(grammarAccess.getPhysicBodyAccess().getFrictionEDoubleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPhysicBodyAccess().getFrictionEDoubleParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__PhysicBody__FrictionAssignment_7"


    // $ANTLR start "rule__PhysicBody__RollingFrictionAssignment_9"
    // InternalArg.g:10676:1: rule__PhysicBody__RollingFrictionAssignment_9 : ( ruleEDouble ) ;
    public final void rule__PhysicBody__RollingFrictionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10680:1: ( ( ruleEDouble ) )
            // InternalArg.g:10681:2: ( ruleEDouble )
            {
            // InternalArg.g:10681:2: ( ruleEDouble )
            // InternalArg.g:10682:3: ruleEDouble
            {
             before(grammarAccess.getPhysicBodyAccess().getRollingFrictionEDoubleParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPhysicBodyAccess().getRollingFrictionEDoubleParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__PhysicBody__RollingFrictionAssignment_9"


    // $ANTLR start "rule__PhysicBody__RestitutionAssignment_11"
    // InternalArg.g:10691:1: rule__PhysicBody__RestitutionAssignment_11 : ( ruleEDouble ) ;
    public final void rule__PhysicBody__RestitutionAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10695:1: ( ( ruleEDouble ) )
            // InternalArg.g:10696:2: ( ruleEDouble )
            {
            // InternalArg.g:10696:2: ( ruleEDouble )
            // InternalArg.g:10697:3: ruleEDouble
            {
             before(grammarAccess.getPhysicBodyAccess().getRestitutionEDoubleParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPhysicBodyAccess().getRestitutionEDoubleParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__PhysicBody__RestitutionAssignment_11"


    // $ANTLR start "rule__PhysicBody__DampingAssignment_13"
    // InternalArg.g:10706:1: rule__PhysicBody__DampingAssignment_13 : ( ruleEDouble ) ;
    public final void rule__PhysicBody__DampingAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10710:1: ( ( ruleEDouble ) )
            // InternalArg.g:10711:2: ( ruleEDouble )
            {
            // InternalArg.g:10711:2: ( ruleEDouble )
            // InternalArg.g:10712:3: ruleEDouble
            {
             before(grammarAccess.getPhysicBodyAccess().getDampingEDoubleParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPhysicBodyAccess().getDampingEDoubleParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__PhysicBody__DampingAssignment_13"


    // $ANTLR start "rule__PhysicBody__AngularDampingAssignment_15"
    // InternalArg.g:10721:1: rule__PhysicBody__AngularDampingAssignment_15 : ( ruleEDouble ) ;
    public final void rule__PhysicBody__AngularDampingAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10725:1: ( ( ruleEDouble ) )
            // InternalArg.g:10726:2: ( ruleEDouble )
            {
            // InternalArg.g:10726:2: ( ruleEDouble )
            // InternalArg.g:10727:3: ruleEDouble
            {
             before(grammarAccess.getPhysicBodyAccess().getAngularDampingEDoubleParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPhysicBodyAccess().getAngularDampingEDoubleParserRuleCall_15_0()); 

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
    // $ANTLR end "rule__PhysicBody__AngularDampingAssignment_15"


    // $ANTLR start "rule__BitMasks__CollisionAssignment_1"
    // InternalArg.g:10736:1: rule__BitMasks__CollisionAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__BitMasks__CollisionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10740:1: ( ( ( ruleEString ) ) )
            // InternalArg.g:10741:2: ( ( ruleEString ) )
            {
            // InternalArg.g:10741:2: ( ( ruleEString ) )
            // InternalArg.g:10742:3: ( ruleEString )
            {
             before(grammarAccess.getBitMasksAccess().getCollisionClassCrossReference_1_0()); 
            // InternalArg.g:10743:3: ( ruleEString )
            // InternalArg.g:10744:4: ruleEString
            {
             before(grammarAccess.getBitMasksAccess().getCollisionClassEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBitMasksAccess().getCollisionClassEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBitMasksAccess().getCollisionClassCrossReference_1_0()); 

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
    // $ANTLR end "rule__BitMasks__CollisionAssignment_1"


    // $ANTLR start "rule__BitMasks__CollisionAssignment_2"
    // InternalArg.g:10755:1: rule__BitMasks__CollisionAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__BitMasks__CollisionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10759:1: ( ( ( ruleEString ) ) )
            // InternalArg.g:10760:2: ( ( ruleEString ) )
            {
            // InternalArg.g:10760:2: ( ( ruleEString ) )
            // InternalArg.g:10761:3: ( ruleEString )
            {
             before(grammarAccess.getBitMasksAccess().getCollisionClassCrossReference_2_0()); 
            // InternalArg.g:10762:3: ( ruleEString )
            // InternalArg.g:10763:4: ruleEString
            {
             before(grammarAccess.getBitMasksAccess().getCollisionClassEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBitMasksAccess().getCollisionClassEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBitMasksAccess().getCollisionClassCrossReference_2_0()); 

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
    // $ANTLR end "rule__BitMasks__CollisionAssignment_2"


    // $ANTLR start "rule__BitMasks__ContactAssignment_4"
    // InternalArg.g:10774:1: rule__BitMasks__ContactAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__BitMasks__ContactAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10778:1: ( ( ( ruleEString ) ) )
            // InternalArg.g:10779:2: ( ( ruleEString ) )
            {
            // InternalArg.g:10779:2: ( ( ruleEString ) )
            // InternalArg.g:10780:3: ( ruleEString )
            {
             before(grammarAccess.getBitMasksAccess().getContactClassCrossReference_4_0()); 
            // InternalArg.g:10781:3: ( ruleEString )
            // InternalArg.g:10782:4: ruleEString
            {
             before(grammarAccess.getBitMasksAccess().getContactClassEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBitMasksAccess().getContactClassEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getBitMasksAccess().getContactClassCrossReference_4_0()); 

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
    // $ANTLR end "rule__BitMasks__ContactAssignment_4"


    // $ANTLR start "rule__BitMasks__ContactAssignment_5"
    // InternalArg.g:10793:1: rule__BitMasks__ContactAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__BitMasks__ContactAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10797:1: ( ( ( ruleEString ) ) )
            // InternalArg.g:10798:2: ( ( ruleEString ) )
            {
            // InternalArg.g:10798:2: ( ( ruleEString ) )
            // InternalArg.g:10799:3: ( ruleEString )
            {
             before(grammarAccess.getBitMasksAccess().getContactClassCrossReference_5_0()); 
            // InternalArg.g:10800:3: ( ruleEString )
            // InternalArg.g:10801:4: ruleEString
            {
             before(grammarAccess.getBitMasksAccess().getContactClassEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBitMasksAccess().getContactClassEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getBitMasksAccess().getContactClassCrossReference_5_0()); 

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
    // $ANTLR end "rule__BitMasks__ContactAssignment_5"


    // $ANTLR start "rule__Force__NameAssignment_0"
    // InternalArg.g:10812:1: rule__Force__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Force__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10816:1: ( ( ruleEString ) )
            // InternalArg.g:10817:2: ( ruleEString )
            {
            // InternalArg.g:10817:2: ( ruleEString )
            // InternalArg.g:10818:3: ruleEString
            {
             before(grammarAccess.getForceAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getForceAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Force__NameAssignment_0"


    // $ANTLR start "rule__Force__GestureAssignment_3"
    // InternalArg.g:10827:1: rule__Force__GestureAssignment_3 : ( ruleGesture ) ;
    public final void rule__Force__GestureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10831:1: ( ( ruleGesture ) )
            // InternalArg.g:10832:2: ( ruleGesture )
            {
            // InternalArg.g:10832:2: ( ruleGesture )
            // InternalArg.g:10833:3: ruleGesture
            {
             before(grammarAccess.getForceAccess().getGestureGestureEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGesture();

            state._fsp--;

             after(grammarAccess.getForceAccess().getGestureGestureEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Force__GestureAssignment_3"


    // $ANTLR start "rule__Force__XVectorAssignment_4_1"
    // InternalArg.g:10842:1: rule__Force__XVectorAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__Force__XVectorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10846:1: ( ( ruleEDouble ) )
            // InternalArg.g:10847:2: ( ruleEDouble )
            {
            // InternalArg.g:10847:2: ( ruleEDouble )
            // InternalArg.g:10848:3: ruleEDouble
            {
             before(grammarAccess.getForceAccess().getXVectorEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getForceAccess().getXVectorEDoubleParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Force__XVectorAssignment_4_1"


    // $ANTLR start "rule__Force__YVectorAssignment_4_3"
    // InternalArg.g:10857:1: rule__Force__YVectorAssignment_4_3 : ( ruleEDouble ) ;
    public final void rule__Force__YVectorAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10861:1: ( ( ruleEDouble ) )
            // InternalArg.g:10862:2: ( ruleEDouble )
            {
            // InternalArg.g:10862:2: ( ruleEDouble )
            // InternalArg.g:10863:3: ruleEDouble
            {
             before(grammarAccess.getForceAccess().getYVectorEDoubleParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getForceAccess().getYVectorEDoubleParserRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__Force__YVectorAssignment_4_3"


    // $ANTLR start "rule__Force__ZVectorAssignment_4_5"
    // InternalArg.g:10872:1: rule__Force__ZVectorAssignment_4_5 : ( ruleEDouble ) ;
    public final void rule__Force__ZVectorAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10876:1: ( ( ruleEDouble ) )
            // InternalArg.g:10877:2: ( ruleEDouble )
            {
            // InternalArg.g:10877:2: ( ruleEDouble )
            // InternalArg.g:10878:3: ruleEDouble
            {
             before(grammarAccess.getForceAccess().getZVectorEDoubleParserRuleCall_4_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getForceAccess().getZVectorEDoubleParserRuleCall_4_5_0()); 

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
    // $ANTLR end "rule__Force__ZVectorAssignment_4_5"


    // $ANTLR start "rule__GamePad__NameAssignment_0"
    // InternalArg.g:10887:1: rule__GamePad__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__GamePad__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10891:1: ( ( ruleEString ) )
            // InternalArg.g:10892:2: ( ruleEString )
            {
            // InternalArg.g:10892:2: ( ruleEString )
            // InternalArg.g:10893:3: ruleEString
            {
             before(grammarAccess.getGamePadAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGamePadAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__GamePad__NameAssignment_0"


    // $ANTLR start "rule__GamePad__TriggerAssignment_2"
    // InternalArg.g:10902:1: rule__GamePad__TriggerAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__GamePad__TriggerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10906:1: ( ( ( ruleEString ) ) )
            // InternalArg.g:10907:2: ( ( ruleEString ) )
            {
            // InternalArg.g:10907:2: ( ( ruleEString ) )
            // InternalArg.g:10908:3: ( ruleEString )
            {
             before(grammarAccess.getGamePadAccess().getTriggerTriggerCrossReference_2_0()); 
            // InternalArg.g:10909:3: ( ruleEString )
            // InternalArg.g:10910:4: ruleEString
            {
             before(grammarAccess.getGamePadAccess().getTriggerTriggerEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGamePadAccess().getTriggerTriggerEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getGamePadAccess().getTriggerTriggerCrossReference_2_0()); 

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
    // $ANTLR end "rule__GamePad__TriggerAssignment_2"


    // $ANTLR start "rule__ScoreSystem__StartAssignment_1"
    // InternalArg.g:10921:1: rule__ScoreSystem__StartAssignment_1 : ( ruleEInt ) ;
    public final void rule__ScoreSystem__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10925:1: ( ( ruleEInt ) )
            // InternalArg.g:10926:2: ( ruleEInt )
            {
            // InternalArg.g:10926:2: ( ruleEInt )
            // InternalArg.g:10927:3: ruleEInt
            {
             before(grammarAccess.getScoreSystemAccess().getStartEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getScoreSystemAccess().getStartEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ScoreSystem__StartAssignment_1"


    // $ANTLR start "rule__ScoreSystem__FinishAssignment_3"
    // InternalArg.g:10936:1: rule__ScoreSystem__FinishAssignment_3 : ( ruleEInt ) ;
    public final void rule__ScoreSystem__FinishAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10940:1: ( ( ruleEInt ) )
            // InternalArg.g:10941:2: ( ruleEInt )
            {
            // InternalArg.g:10941:2: ( ruleEInt )
            // InternalArg.g:10942:3: ruleEInt
            {
             before(grammarAccess.getScoreSystemAccess().getFinishEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getScoreSystemAccess().getFinishEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ScoreSystem__FinishAssignment_3"


    // $ANTLR start "rule__ScoreSystem__LivesAssignment_5"
    // InternalArg.g:10951:1: rule__ScoreSystem__LivesAssignment_5 : ( ruleEInt ) ;
    public final void rule__ScoreSystem__LivesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10955:1: ( ( ruleEInt ) )
            // InternalArg.g:10956:2: ( ruleEInt )
            {
            // InternalArg.g:10956:2: ( ruleEInt )
            // InternalArg.g:10957:3: ruleEInt
            {
             before(grammarAccess.getScoreSystemAccess().getLivesEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getScoreSystemAccess().getLivesEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ScoreSystem__LivesAssignment_5"


    // $ANTLR start "rule__Trigger__NameAssignment_0"
    // InternalArg.g:10966:1: rule__Trigger__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Trigger__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10970:1: ( ( ruleEString ) )
            // InternalArg.g:10971:2: ( ruleEString )
            {
            // InternalArg.g:10971:2: ( ruleEString )
            // InternalArg.g:10972:3: ruleEString
            {
             before(grammarAccess.getTriggerAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTriggerAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Trigger__NameAssignment_0"


    // $ANTLR start "rule__Trigger__ActionAssignment_2_1"
    // InternalArg.g:10981:1: rule__Trigger__ActionAssignment_2_1 : ( ruleBasicActions ) ;
    public final void rule__Trigger__ActionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:10985:1: ( ( ruleBasicActions ) )
            // InternalArg.g:10986:2: ( ruleBasicActions )
            {
            // InternalArg.g:10986:2: ( ruleBasicActions )
            // InternalArg.g:10987:3: ruleBasicActions
            {
             before(grammarAccess.getTriggerAccess().getActionBasicActionsEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicActions();

            state._fsp--;

             after(grammarAccess.getTriggerAccess().getActionBasicActionsEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Trigger__ActionAssignment_2_1"


    // $ANTLR start "rule__Trigger__MessageAssignment_3_1"
    // InternalArg.g:10996:1: rule__Trigger__MessageAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Trigger__MessageAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11000:1: ( ( ruleEString ) )
            // InternalArg.g:11001:2: ( ruleEString )
            {
            // InternalArg.g:11001:2: ( ruleEString )
            // InternalArg.g:11002:3: ruleEString
            {
             before(grammarAccess.getTriggerAccess().getMessageEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTriggerAccess().getMessageEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Trigger__MessageAssignment_3_1"


    // $ANTLR start "rule__Trigger__ScoreChangeAssignment_4_1"
    // InternalArg.g:11011:1: rule__Trigger__ScoreChangeAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Trigger__ScoreChangeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11015:1: ( ( ruleEInt ) )
            // InternalArg.g:11016:2: ( ruleEInt )
            {
            // InternalArg.g:11016:2: ( ruleEInt )
            // InternalArg.g:11017:3: ruleEInt
            {
             before(grammarAccess.getTriggerAccess().getScoreChangeEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTriggerAccess().getScoreChangeEIntParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Trigger__ScoreChangeAssignment_4_1"


    // $ANTLR start "rule__Trigger__TimeTriggerAssignment_5_1"
    // InternalArg.g:11026:1: rule__Trigger__TimeTriggerAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Trigger__TimeTriggerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11030:1: ( ( ruleEInt ) )
            // InternalArg.g:11031:2: ( ruleEInt )
            {
            // InternalArg.g:11031:2: ( ruleEInt )
            // InternalArg.g:11032:3: ruleEInt
            {
             before(grammarAccess.getTriggerAccess().getTimeTriggerEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTriggerAccess().getTimeTriggerEIntParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Trigger__TimeTriggerAssignment_5_1"


    // $ANTLR start "rule__Trigger__PhysicChangesAssignment_6_2"
    // InternalArg.g:11041:1: rule__Trigger__PhysicChangesAssignment_6_2 : ( rulePhysicChange ) ;
    public final void rule__Trigger__PhysicChangesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11045:1: ( ( rulePhysicChange ) )
            // InternalArg.g:11046:2: ( rulePhysicChange )
            {
            // InternalArg.g:11046:2: ( rulePhysicChange )
            // InternalArg.g:11047:3: rulePhysicChange
            {
             before(grammarAccess.getTriggerAccess().getPhysicChangesPhysicChangeParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhysicChange();

            state._fsp--;

             after(grammarAccess.getTriggerAccess().getPhysicChangesPhysicChangeParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Trigger__PhysicChangesAssignment_6_2"


    // $ANTLR start "rule__Trigger__PhysicChangesAssignment_6_3"
    // InternalArg.g:11056:1: rule__Trigger__PhysicChangesAssignment_6_3 : ( rulePhysicChange ) ;
    public final void rule__Trigger__PhysicChangesAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11060:1: ( ( rulePhysicChange ) )
            // InternalArg.g:11061:2: ( rulePhysicChange )
            {
            // InternalArg.g:11061:2: ( rulePhysicChange )
            // InternalArg.g:11062:3: rulePhysicChange
            {
             before(grammarAccess.getTriggerAccess().getPhysicChangesPhysicChangeParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            rulePhysicChange();

            state._fsp--;

             after(grammarAccess.getTriggerAccess().getPhysicChangesPhysicChangeParserRuleCall_6_3_0()); 

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
    // $ANTLR end "rule__Trigger__PhysicChangesAssignment_6_3"


    // $ANTLR start "rule__Collision__ClassAAssignment_1"
    // InternalArg.g:11071:1: rule__Collision__ClassAAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Collision__ClassAAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11075:1: ( ( ( ruleEString ) ) )
            // InternalArg.g:11076:2: ( ( ruleEString ) )
            {
            // InternalArg.g:11076:2: ( ( ruleEString ) )
            // InternalArg.g:11077:3: ( ruleEString )
            {
             before(grammarAccess.getCollisionAccess().getClassAClassCrossReference_1_0()); 
            // InternalArg.g:11078:3: ( ruleEString )
            // InternalArg.g:11079:4: ruleEString
            {
             before(grammarAccess.getCollisionAccess().getClassAClassEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getClassAClassEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCollisionAccess().getClassAClassCrossReference_1_0()); 

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
    // $ANTLR end "rule__Collision__ClassAAssignment_1"


    // $ANTLR start "rule__Collision__ClassBAssignment_3"
    // InternalArg.g:11090:1: rule__Collision__ClassBAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Collision__ClassBAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11094:1: ( ( ( ruleEString ) ) )
            // InternalArg.g:11095:2: ( ( ruleEString ) )
            {
            // InternalArg.g:11095:2: ( ( ruleEString ) )
            // InternalArg.g:11096:3: ( ruleEString )
            {
             before(grammarAccess.getCollisionAccess().getClassBClassCrossReference_3_0()); 
            // InternalArg.g:11097:3: ( ruleEString )
            // InternalArg.g:11098:4: ruleEString
            {
             before(grammarAccess.getCollisionAccess().getClassBClassEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getClassBClassEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCollisionAccess().getClassBClassCrossReference_3_0()); 

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
    // $ANTLR end "rule__Collision__ClassBAssignment_3"


    // $ANTLR start "rule__Collision__ActionAssignment_5"
    // InternalArg.g:11109:1: rule__Collision__ActionAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Collision__ActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11113:1: ( ( ( ruleEString ) ) )
            // InternalArg.g:11114:2: ( ( ruleEString ) )
            {
            // InternalArg.g:11114:2: ( ( ruleEString ) )
            // InternalArg.g:11115:3: ( ruleEString )
            {
             before(grammarAccess.getCollisionAccess().getActionTriggerCrossReference_5_0()); 
            // InternalArg.g:11116:3: ( ruleEString )
            // InternalArg.g:11117:4: ruleEString
            {
             before(grammarAccess.getCollisionAccess().getActionTriggerEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getActionTriggerEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCollisionAccess().getActionTriggerCrossReference_5_0()); 

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
    // $ANTLR end "rule__Collision__ActionAssignment_5"


    // $ANTLR start "rule__ObjInit__NameAssignment_0"
    // InternalArg.g:11128:1: rule__ObjInit__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ObjInit__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11132:1: ( ( ruleEString ) )
            // InternalArg.g:11133:2: ( ruleEString )
            {
            // InternalArg.g:11133:2: ( ruleEString )
            // InternalArg.g:11134:3: ruleEString
            {
             before(grammarAccess.getObjInitAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getObjInitAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ObjInit__NameAssignment_0"


    // $ANTLR start "rule__ObjInit__ClassAssignment_2"
    // InternalArg.g:11143:1: rule__ObjInit__ClassAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__ObjInit__ClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11147:1: ( ( ( ruleEString ) ) )
            // InternalArg.g:11148:2: ( ( ruleEString ) )
            {
            // InternalArg.g:11148:2: ( ( ruleEString ) )
            // InternalArg.g:11149:3: ( ruleEString )
            {
             before(grammarAccess.getObjInitAccess().getClassClassCrossReference_2_0()); 
            // InternalArg.g:11150:3: ( ruleEString )
            // InternalArg.g:11151:4: ruleEString
            {
             before(grammarAccess.getObjInitAccess().getClassClassEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getObjInitAccess().getClassClassEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getObjInitAccess().getClassClassCrossReference_2_0()); 

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
    // $ANTLR end "rule__ObjInit__ClassAssignment_2"


    // $ANTLR start "rule__ObjInit__PosXAssignment_4"
    // InternalArg.g:11162:1: rule__ObjInit__PosXAssignment_4 : ( rulePosOrCamera ) ;
    public final void rule__ObjInit__PosXAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11166:1: ( ( rulePosOrCamera ) )
            // InternalArg.g:11167:2: ( rulePosOrCamera )
            {
            // InternalArg.g:11167:2: ( rulePosOrCamera )
            // InternalArg.g:11168:3: rulePosOrCamera
            {
             before(grammarAccess.getObjInitAccess().getPosXPosOrCameraParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePosOrCamera();

            state._fsp--;

             after(grammarAccess.getObjInitAccess().getPosXPosOrCameraParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ObjInit__PosXAssignment_4"


    // $ANTLR start "rule__ObjInit__PosYAssignment_6"
    // InternalArg.g:11177:1: rule__ObjInit__PosYAssignment_6 : ( rulePosOrCamera ) ;
    public final void rule__ObjInit__PosYAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11181:1: ( ( rulePosOrCamera ) )
            // InternalArg.g:11182:2: ( rulePosOrCamera )
            {
            // InternalArg.g:11182:2: ( rulePosOrCamera )
            // InternalArg.g:11183:3: rulePosOrCamera
            {
             before(grammarAccess.getObjInitAccess().getPosYPosOrCameraParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePosOrCamera();

            state._fsp--;

             after(grammarAccess.getObjInitAccess().getPosYPosOrCameraParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ObjInit__PosYAssignment_6"


    // $ANTLR start "rule__ObjInit__PosZAssignment_8"
    // InternalArg.g:11192:1: rule__ObjInit__PosZAssignment_8 : ( rulePosOrCamera ) ;
    public final void rule__ObjInit__PosZAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11196:1: ( ( rulePosOrCamera ) )
            // InternalArg.g:11197:2: ( rulePosOrCamera )
            {
            // InternalArg.g:11197:2: ( rulePosOrCamera )
            // InternalArg.g:11198:3: rulePosOrCamera
            {
             before(grammarAccess.getObjInitAccess().getPosZPosOrCameraParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            rulePosOrCamera();

            state._fsp--;

             after(grammarAccess.getObjInitAccess().getPosZPosOrCameraParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__ObjInit__PosZAssignment_8"


    // $ANTLR start "rule__ObjInit__RotationAssignment_9_1"
    // InternalArg.g:11207:1: rule__ObjInit__RotationAssignment_9_1 : ( ruleEInt ) ;
    public final void rule__ObjInit__RotationAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11211:1: ( ( ruleEInt ) )
            // InternalArg.g:11212:2: ( ruleEInt )
            {
            // InternalArg.g:11212:2: ( ruleEInt )
            // InternalArg.g:11213:3: ruleEInt
            {
             before(grammarAccess.getObjInitAccess().getRotationEIntParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getObjInitAccess().getRotationEIntParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__ObjInit__RotationAssignment_9_1"


    // $ANTLR start "rule__ObjInit__AttributeAssignment_11_2"
    // InternalArg.g:11222:1: rule__ObjInit__AttributeAssignment_11_2 : ( ruleObjAttribute ) ;
    public final void rule__ObjInit__AttributeAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11226:1: ( ( ruleObjAttribute ) )
            // InternalArg.g:11227:2: ( ruleObjAttribute )
            {
            // InternalArg.g:11227:2: ( ruleObjAttribute )
            // InternalArg.g:11228:3: ruleObjAttribute
            {
             before(grammarAccess.getObjInitAccess().getAttributeObjAttributeParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjAttribute();

            state._fsp--;

             after(grammarAccess.getObjInitAccess().getAttributeObjAttributeParserRuleCall_11_2_0()); 

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
    // $ANTLR end "rule__ObjInit__AttributeAssignment_11_2"


    // $ANTLR start "rule__ObjInit__AttributeAssignment_11_3_1"
    // InternalArg.g:11237:1: rule__ObjInit__AttributeAssignment_11_3_1 : ( ruleObjAttribute ) ;
    public final void rule__ObjInit__AttributeAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11241:1: ( ( ruleObjAttribute ) )
            // InternalArg.g:11242:2: ( ruleObjAttribute )
            {
            // InternalArg.g:11242:2: ( ruleObjAttribute )
            // InternalArg.g:11243:3: ruleObjAttribute
            {
             before(grammarAccess.getObjInitAccess().getAttributeObjAttributeParserRuleCall_11_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjAttribute();

            state._fsp--;

             after(grammarAccess.getObjInitAccess().getAttributeObjAttributeParserRuleCall_11_3_1_0()); 

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
    // $ANTLR end "rule__ObjInit__AttributeAssignment_11_3_1"


    // $ANTLR start "rule__ObjInit__RulesAssignment_12_2"
    // InternalArg.g:11252:1: rule__ObjInit__RulesAssignment_12_2 : ( ruleRule ) ;
    public final void rule__ObjInit__RulesAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11256:1: ( ( ruleRule ) )
            // InternalArg.g:11257:2: ( ruleRule )
            {
            // InternalArg.g:11257:2: ( ruleRule )
            // InternalArg.g:11258:3: ruleRule
            {
             before(grammarAccess.getObjInitAccess().getRulesRuleParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getObjInitAccess().getRulesRuleParserRuleCall_12_2_0()); 

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
    // $ANTLR end "rule__ObjInit__RulesAssignment_12_2"


    // $ANTLR start "rule__ObjInit__RulesAssignment_12_3_1"
    // InternalArg.g:11267:1: rule__ObjInit__RulesAssignment_12_3_1 : ( ruleRule ) ;
    public final void rule__ObjInit__RulesAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11271:1: ( ( ruleRule ) )
            // InternalArg.g:11272:2: ( ruleRule )
            {
            // InternalArg.g:11272:2: ( ruleRule )
            // InternalArg.g:11273:3: ruleRule
            {
             before(grammarAccess.getObjInitAccess().getRulesRuleParserRuleCall_12_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getObjInitAccess().getRulesRuleParserRuleCall_12_3_1_0()); 

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
    // $ANTLR end "rule__ObjInit__RulesAssignment_12_3_1"


    // $ANTLR start "rule__PhysicChange__ActionAssignment_1"
    // InternalArg.g:11282:1: rule__PhysicChange__ActionAssignment_1 : ( ruleAction ) ;
    public final void rule__PhysicChange__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11286:1: ( ( ruleAction ) )
            // InternalArg.g:11287:2: ( ruleAction )
            {
            // InternalArg.g:11287:2: ( ruleAction )
            // InternalArg.g:11288:3: ruleAction
            {
             before(grammarAccess.getPhysicChangeAccess().getActionActionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getPhysicChangeAccess().getActionActionEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__PhysicChange__ActionAssignment_1"


    // $ANTLR start "rule__PhysicChange__ClassAssignment_3"
    // InternalArg.g:11297:1: rule__PhysicChange__ClassAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__PhysicChange__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11301:1: ( ( ( ruleEString ) ) )
            // InternalArg.g:11302:2: ( ( ruleEString ) )
            {
            // InternalArg.g:11302:2: ( ( ruleEString ) )
            // InternalArg.g:11303:3: ( ruleEString )
            {
             before(grammarAccess.getPhysicChangeAccess().getClassClassCrossReference_3_0()); 
            // InternalArg.g:11304:3: ( ruleEString )
            // InternalArg.g:11305:4: ruleEString
            {
             before(grammarAccess.getPhysicChangeAccess().getClassClassEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPhysicChangeAccess().getClassClassEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPhysicChangeAccess().getClassClassCrossReference_3_0()); 

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
    // $ANTLR end "rule__PhysicChange__ClassAssignment_3"


    // $ANTLR start "rule__PhysicChange__ObjectAssignment_5"
    // InternalArg.g:11316:1: rule__PhysicChange__ObjectAssignment_5 : ( ruleEString ) ;
    public final void rule__PhysicChange__ObjectAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11320:1: ( ( ruleEString ) )
            // InternalArg.g:11321:2: ( ruleEString )
            {
            // InternalArg.g:11321:2: ( ruleEString )
            // InternalArg.g:11322:3: ruleEString
            {
             before(grammarAccess.getPhysicChangeAccess().getObjectEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPhysicChangeAccess().getObjectEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__PhysicChange__ObjectAssignment_5"


    // $ANTLR start "rule__PhysicChange__PositionAssignment_6_1"
    // InternalArg.g:11331:1: rule__PhysicChange__PositionAssignment_6_1 : ( rulePosition ) ;
    public final void rule__PhysicChange__PositionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11335:1: ( ( rulePosition ) )
            // InternalArg.g:11336:2: ( rulePosition )
            {
            // InternalArg.g:11336:2: ( rulePosition )
            // InternalArg.g:11337:3: rulePosition
            {
             before(grammarAccess.getPhysicChangeAccess().getPositionPositionEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPhysicChangeAccess().getPositionPositionEnumRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__PhysicChange__PositionAssignment_6_1"


    // $ANTLR start "rule__PhysicChange__ScaleAssignment_7_1"
    // InternalArg.g:11346:1: rule__PhysicChange__ScaleAssignment_7_1 : ( ruleEDouble ) ;
    public final void rule__PhysicChange__ScaleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11350:1: ( ( ruleEDouble ) )
            // InternalArg.g:11351:2: ( ruleEDouble )
            {
            // InternalArg.g:11351:2: ( ruleEDouble )
            // InternalArg.g:11352:3: ruleEDouble
            {
             before(grammarAccess.getPhysicChangeAccess().getScaleEDoubleParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPhysicChangeAccess().getScaleEDoubleParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__PhysicChange__ScaleAssignment_7_1"


    // $ANTLR start "rule__PhysicChange__AttributeAssignment_8_1"
    // InternalArg.g:11361:1: rule__PhysicChange__AttributeAssignment_8_1 : ( ruleEString ) ;
    public final void rule__PhysicChange__AttributeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11365:1: ( ( ruleEString ) )
            // InternalArg.g:11366:2: ( ruleEString )
            {
            // InternalArg.g:11366:2: ( ruleEString )
            // InternalArg.g:11367:3: ruleEString
            {
             before(grammarAccess.getPhysicChangeAccess().getAttributeEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPhysicChangeAccess().getAttributeEStringParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__PhysicChange__AttributeAssignment_8_1"


    // $ANTLR start "rule__PhysicChange__ChangeValueAssignment_9_1"
    // InternalArg.g:11376:1: rule__PhysicChange__ChangeValueAssignment_9_1 : ( ruleEInt ) ;
    public final void rule__PhysicChange__ChangeValueAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11380:1: ( ( ruleEInt ) )
            // InternalArg.g:11381:2: ( ruleEInt )
            {
            // InternalArg.g:11381:2: ( ruleEInt )
            // InternalArg.g:11382:3: ruleEInt
            {
             before(grammarAccess.getPhysicChangeAccess().getChangeValueEIntParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPhysicChangeAccess().getChangeValueEIntParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__PhysicChange__ChangeValueAssignment_9_1"


    // $ANTLR start "rule__PhysicChange__ForceAssignment_10_1"
    // InternalArg.g:11391:1: rule__PhysicChange__ForceAssignment_10_1 : ( ( ruleEString ) ) ;
    public final void rule__PhysicChange__ForceAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11395:1: ( ( ( ruleEString ) ) )
            // InternalArg.g:11396:2: ( ( ruleEString ) )
            {
            // InternalArg.g:11396:2: ( ( ruleEString ) )
            // InternalArg.g:11397:3: ( ruleEString )
            {
             before(grammarAccess.getPhysicChangeAccess().getForceForceCrossReference_10_1_0()); 
            // InternalArg.g:11398:3: ( ruleEString )
            // InternalArg.g:11399:4: ruleEString
            {
             before(grammarAccess.getPhysicChangeAccess().getForceForceEStringParserRuleCall_10_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPhysicChangeAccess().getForceForceEStringParserRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getPhysicChangeAccess().getForceForceCrossReference_10_1_0()); 

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
    // $ANTLR end "rule__PhysicChange__ForceAssignment_10_1"


    // $ANTLR start "rule__ObjAttribute__AttributeAssignment_0"
    // InternalArg.g:11410:1: rule__ObjAttribute__AttributeAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__ObjAttribute__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11414:1: ( ( ( ruleEString ) ) )
            // InternalArg.g:11415:2: ( ( ruleEString ) )
            {
            // InternalArg.g:11415:2: ( ( ruleEString ) )
            // InternalArg.g:11416:3: ( ruleEString )
            {
             before(grammarAccess.getObjAttributeAccess().getAttributeAttributeCrossReference_0_0()); 
            // InternalArg.g:11417:3: ( ruleEString )
            // InternalArg.g:11418:4: ruleEString
            {
             before(grammarAccess.getObjAttributeAccess().getAttributeAttributeEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getObjAttributeAccess().getAttributeAttributeEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getObjAttributeAccess().getAttributeAttributeCrossReference_0_0()); 

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
    // $ANTLR end "rule__ObjAttribute__AttributeAssignment_0"


    // $ANTLR start "rule__ObjAttribute__ValueAssignment_2"
    // InternalArg.g:11429:1: rule__ObjAttribute__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__ObjAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11433:1: ( ( ruleEString ) )
            // InternalArg.g:11434:2: ( ruleEString )
            {
            // InternalArg.g:11434:2: ( ruleEString )
            // InternalArg.g:11435:3: ruleEString
            {
             before(grammarAccess.getObjAttributeAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getObjAttributeAccess().getValueEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ObjAttribute__ValueAssignment_2"


    // $ANTLR start "rule__Rule__ActionAssignment_1"
    // InternalArg.g:11444:1: rule__Rule__ActionAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Rule__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11448:1: ( ( ( ruleEString ) ) )
            // InternalArg.g:11449:2: ( ( ruleEString ) )
            {
            // InternalArg.g:11449:2: ( ( ruleEString ) )
            // InternalArg.g:11450:3: ( ruleEString )
            {
             before(grammarAccess.getRuleAccess().getActionTriggerCrossReference_1_0()); 
            // InternalArg.g:11451:3: ( ruleEString )
            // InternalArg.g:11452:4: ruleEString
            {
             before(grammarAccess.getRuleAccess().getActionTriggerEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getActionTriggerEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getActionTriggerCrossReference_1_0()); 

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
    // $ANTLR end "rule__Rule__ActionAssignment_1"


    // $ANTLR start "rule__Rule__ConditionAssignment_3"
    // InternalArg.g:11463:1: rule__Rule__ConditionAssignment_3 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11467:1: ( ( ruleCondition ) )
            // InternalArg.g:11468:2: ( ruleCondition )
            {
            // InternalArg.g:11468:2: ( ruleCondition )
            // InternalArg.g:11469:3: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Rule__ConditionAssignment_3"


    // $ANTLR start "rule__Not__LeftAssignment_1"
    // InternalArg.g:11478:1: rule__Not__LeftAssignment_1 : ( ruleCondition ) ;
    public final void rule__Not__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11482:1: ( ( ruleCondition ) )
            // InternalArg.g:11483:2: ( ruleCondition )
            {
            // InternalArg.g:11483:2: ( ruleCondition )
            // InternalArg.g:11484:3: ruleCondition
            {
             before(grammarAccess.getNotAccess().getLeftConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getNotAccess().getLeftConditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Not__LeftAssignment_1"


    // $ANTLR start "rule__Binary__LeftAssignment_1"
    // InternalArg.g:11493:1: rule__Binary__LeftAssignment_1 : ( ruleCondition ) ;
    public final void rule__Binary__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11497:1: ( ( ruleCondition ) )
            // InternalArg.g:11498:2: ( ruleCondition )
            {
            // InternalArg.g:11498:2: ( ruleCondition )
            // InternalArg.g:11499:3: ruleCondition
            {
             before(grammarAccess.getBinaryAccess().getLeftConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getBinaryAccess().getLeftConditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Binary__LeftAssignment_1"


    // $ANTLR start "rule__Binary__OpAssignment_3"
    // InternalArg.g:11508:1: rule__Binary__OpAssignment_3 : ( ruleLogicOps ) ;
    public final void rule__Binary__OpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11512:1: ( ( ruleLogicOps ) )
            // InternalArg.g:11513:2: ( ruleLogicOps )
            {
            // InternalArg.g:11513:2: ( ruleLogicOps )
            // InternalArg.g:11514:3: ruleLogicOps
            {
             before(grammarAccess.getBinaryAccess().getOpLogicOpsEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicOps();

            state._fsp--;

             after(grammarAccess.getBinaryAccess().getOpLogicOpsEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Binary__OpAssignment_3"


    // $ANTLR start "rule__Binary__RightAssignment_5"
    // InternalArg.g:11523:1: rule__Binary__RightAssignment_5 : ( ruleCondition ) ;
    public final void rule__Binary__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11527:1: ( ( ruleCondition ) )
            // InternalArg.g:11528:2: ( ruleCondition )
            {
            // InternalArg.g:11528:2: ( ruleCondition )
            // InternalArg.g:11529:3: ruleCondition
            {
             before(grammarAccess.getBinaryAccess().getRightConditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getBinaryAccess().getRightConditionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Binary__RightAssignment_5"


    // $ANTLR start "rule__Arithmetic__LeftAssignment_0"
    // InternalArg.g:11538:1: rule__Arithmetic__LeftAssignment_0 : ( ruleValue ) ;
    public final void rule__Arithmetic__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11542:1: ( ( ruleValue ) )
            // InternalArg.g:11543:2: ( ruleValue )
            {
            // InternalArg.g:11543:2: ( ruleValue )
            // InternalArg.g:11544:3: ruleValue
            {
             before(grammarAccess.getArithmeticAccess().getLeftValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArithmeticAccess().getLeftValueParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Arithmetic__LeftAssignment_0"


    // $ANTLR start "rule__Arithmetic__OpAssignment_1"
    // InternalArg.g:11553:1: rule__Arithmetic__OpAssignment_1 : ( ruleArithmOps ) ;
    public final void rule__Arithmetic__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11557:1: ( ( ruleArithmOps ) )
            // InternalArg.g:11558:2: ( ruleArithmOps )
            {
            // InternalArg.g:11558:2: ( ruleArithmOps )
            // InternalArg.g:11559:3: ruleArithmOps
            {
             before(grammarAccess.getArithmeticAccess().getOpArithmOpsEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmOps();

            state._fsp--;

             after(grammarAccess.getArithmeticAccess().getOpArithmOpsEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Arithmetic__OpAssignment_1"


    // $ANTLR start "rule__Arithmetic__RightAssignment_2"
    // InternalArg.g:11568:1: rule__Arithmetic__RightAssignment_2 : ( ruleValue ) ;
    public final void rule__Arithmetic__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11572:1: ( ( ruleValue ) )
            // InternalArg.g:11573:2: ( ruleValue )
            {
            // InternalArg.g:11573:2: ( ruleValue )
            // InternalArg.g:11574:3: ruleValue
            {
             before(grammarAccess.getArithmeticAccess().getRightValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArithmeticAccess().getRightValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Arithmetic__RightAssignment_2"


    // $ANTLR start "rule__AttributeValue__ClassAssignment_0"
    // InternalArg.g:11583:1: rule__AttributeValue__ClassAssignment_0 : ( ruleEString ) ;
    public final void rule__AttributeValue__ClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11587:1: ( ( ruleEString ) )
            // InternalArg.g:11588:2: ( ruleEString )
            {
            // InternalArg.g:11588:2: ( ruleEString )
            // InternalArg.g:11589:3: ruleEString
            {
             before(grammarAccess.getAttributeValueAccess().getClassEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeValueAccess().getClassEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__AttributeValue__ClassAssignment_0"


    // $ANTLR start "rule__AttributeValue__AttributeAssignment_2"
    // InternalArg.g:11598:1: rule__AttributeValue__AttributeAssignment_2 : ( ruleEString ) ;
    public final void rule__AttributeValue__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11602:1: ( ( ruleEString ) )
            // InternalArg.g:11603:2: ( ruleEString )
            {
            // InternalArg.g:11603:2: ( ruleEString )
            // InternalArg.g:11604:3: ruleEString
            {
             before(grammarAccess.getAttributeValueAccess().getAttributeEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeValueAccess().getAttributeEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AttributeValue__AttributeAssignment_2"


    // $ANTLR start "rule__ConstantValue__ValueAssignment"
    // InternalArg.g:11613:1: rule__ConstantValue__ValueAssignment : ( ruleConstant ) ;
    public final void rule__ConstantValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11617:1: ( ( ruleConstant ) )
            // InternalArg.g:11618:2: ( ruleConstant )
            {
            // InternalArg.g:11618:2: ( ruleConstant )
            // InternalArg.g:11619:3: ruleConstant
            {
             before(grammarAccess.getConstantValueAccess().getValueConstantParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantValueAccess().getValueConstantParserRuleCall_0()); 

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
    // $ANTLR end "rule__ConstantValue__ValueAssignment"


    // $ANTLR start "rule__AllInstances__TypeAssignment_1"
    // InternalArg.g:11628:1: rule__AllInstances__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__AllInstances__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArg.g:11632:1: ( ( ruleEString ) )
            // InternalArg.g:11633:2: ( ruleEString )
            {
            // InternalArg.g:11633:2: ( ruleEString )
            // InternalArg.g:11634:3: ruleEString
            {
             before(grammarAccess.getAllInstancesAccess().getTypeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllInstancesAccess().getTypeEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AllInstances__TypeAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000200000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000600000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00F0200000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000070L,0x0000000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x01C0000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x9000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000040L,0x0000000000001002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000030L,0x0000000002000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0008200000000000L,0x0000000780000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000200000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000004040L,0x0000000000001002L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0800000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000200000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x00003E0000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000070L,0x000E000000000002L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});

}