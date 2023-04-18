package ardsl.ide.contentassist.antlr.internal;

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
import ardsl.services.ArdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArdslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'start'", "'lose'", "'win'", "'any'", "'horizontal'", "'vertical'", "'static'", "'dynamic'", "'kinematic'", "'create'", "'edit'", "'delete'", "'front'", "'default'", "'back'", "'&'", "'|'", "'='", "'>'", "'>='", "'<'", "'<='", "'Game'", "'{'", "'elements'", "'}'", "'URI'", "','", "'-'", "'.'", "'dependences'", "':'", "'['", "']'", "'min'", "'max'", "'target'", "'containtment'", "'opposite'", "'Graphic'", "'element'", "'versions'", "'constraints'", "'plane'", "'sizeMin'", "'sizeMax'", "'xVariation'", "'yVariation'", "'zVariation'", "'rotation'", "'Physics'", "'body'", "'contacts'", "'forces'", "'mass'", "'bodyType'", "'charge'", "'friction'", "'rollingFriction'", "'restitution'", "'damping'", "'angularDamping'", "'gesture'", "'collision'", "'contact'", "'Gamelogic'", "'Display'", "'score'", "'Actions'", "'Collisions'", "'Buttons'", "'Elements'", "'goal'", "'lives'", "'action'", "'display'", "'timeEach'", "'changes'", "'to'", "'->'", "'do'", "'in'", "'named'", "'where'", "'scale'", "'stat'", "'changeStat'", "'force'", "'rules'", "'if('", "')'", "'!'", "'('", "'All'", "'abstract'", "'invisible'", "'isParam'", "'isKey'", "'readOnly'", "'overlaps'"
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
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
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

    	public void setGrammarAccess(ArdslGrammarAccess grammarAccess) {
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
    // InternalArdsl.g:53:1: entryRuleOntological : ruleOntological EOF ;
    public final void entryRuleOntological() throws RecognitionException {
        try {
            // InternalArdsl.g:54:1: ( ruleOntological EOF )
            // InternalArdsl.g:55:1: ruleOntological EOF
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
    // InternalArdsl.g:62:1: ruleOntological : ( ( rule__Ontological__Group__0 ) ) ;
    public final void ruleOntological() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:66:2: ( ( ( rule__Ontological__Group__0 ) ) )
            // InternalArdsl.g:67:2: ( ( rule__Ontological__Group__0 ) )
            {
            // InternalArdsl.g:67:2: ( ( rule__Ontological__Group__0 ) )
            // InternalArdsl.g:68:3: ( rule__Ontological__Group__0 )
            {
             before(grammarAccess.getOntologicalAccess().getGroup()); 
            // InternalArdsl.g:69:3: ( rule__Ontological__Group__0 )
            // InternalArdsl.g:69:4: rule__Ontological__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalArdsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalArdsl.g:79:1: ( ruleEString EOF )
            // InternalArdsl.g:80:1: ruleEString EOF
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
    // InternalArdsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalArdsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalArdsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalArdsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalArdsl.g:94:3: ( rule__EString__Alternatives )
            // InternalArdsl.g:94:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleEDouble"
    // InternalArdsl.g:103:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalArdsl.g:104:1: ( ruleEDouble EOF )
            // InternalArdsl.g:105:1: ruleEDouble EOF
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
    // InternalArdsl.g:112:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:116:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalArdsl.g:117:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalArdsl.g:117:2: ( ( rule__EDouble__Group__0 ) )
            // InternalArdsl.g:118:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalArdsl.g:119:3: ( rule__EDouble__Group__0 )
            // InternalArdsl.g:119:4: rule__EDouble__Group__0
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


    // $ANTLR start "entryRuleEInt"
    // InternalArdsl.g:128:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalArdsl.g:129:1: ( ruleEInt EOF )
            // InternalArdsl.g:130:1: ruleEInt EOF
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
    // InternalArdsl.g:137:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:141:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalArdsl.g:142:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalArdsl.g:142:2: ( ( rule__EInt__Group__0 ) )
            // InternalArdsl.g:143:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalArdsl.g:144:3: ( rule__EInt__Group__0 )
            // InternalArdsl.g:144:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRuleClass"
    // InternalArdsl.g:153:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalArdsl.g:154:1: ( ruleClass EOF )
            // InternalArdsl.g:155:1: ruleClass EOF
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
    // InternalArdsl.g:162:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:166:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalArdsl.g:167:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalArdsl.g:167:2: ( ( rule__Class__Group__0 ) )
            // InternalArdsl.g:168:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalArdsl.g:169:3: ( rule__Class__Group__0 )
            // InternalArdsl.g:169:4: rule__Class__Group__0
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


    // $ANTLR start "entryRuleAttribute"
    // InternalArdsl.g:178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalArdsl.g:179:1: ( ruleAttribute EOF )
            // InternalArdsl.g:180:1: ruleAttribute EOF
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
    // InternalArdsl.g:187:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:191:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalArdsl.g:192:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalArdsl.g:192:2: ( ( rule__Attribute__Group__0 ) )
            // InternalArdsl.g:193:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalArdsl.g:194:3: ( rule__Attribute__Group__0 )
            // InternalArdsl.g:194:4: rule__Attribute__Group__0
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


    // $ANTLR start "entryRuleReference"
    // InternalArdsl.g:203:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalArdsl.g:204:1: ( ruleReference EOF )
            // InternalArdsl.g:205:1: ruleReference EOF
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
    // InternalArdsl.g:212:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:216:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalArdsl.g:217:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalArdsl.g:217:2: ( ( rule__Reference__Group__0 ) )
            // InternalArdsl.g:218:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalArdsl.g:219:3: ( rule__Reference__Group__0 )
            // InternalArdsl.g:219:4: rule__Reference__Group__0
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


    // $ANTLR start "entryRuleGraphic"
    // InternalArdsl.g:228:1: entryRuleGraphic : ruleGraphic EOF ;
    public final void entryRuleGraphic() throws RecognitionException {
        try {
            // InternalArdsl.g:229:1: ( ruleGraphic EOF )
            // InternalArdsl.g:230:1: ruleGraphic EOF
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
    // InternalArdsl.g:237:1: ruleGraphic : ( ( rule__Graphic__Group__0 ) ) ;
    public final void ruleGraphic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:241:2: ( ( ( rule__Graphic__Group__0 ) ) )
            // InternalArdsl.g:242:2: ( ( rule__Graphic__Group__0 ) )
            {
            // InternalArdsl.g:242:2: ( ( rule__Graphic__Group__0 ) )
            // InternalArdsl.g:243:3: ( rule__Graphic__Group__0 )
            {
             before(grammarAccess.getGraphicAccess().getGroup()); 
            // InternalArdsl.g:244:3: ( rule__Graphic__Group__0 )
            // InternalArdsl.g:244:4: rule__Graphic__Group__0
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


    // $ANTLR start "entryRuleGraphicClass"
    // InternalArdsl.g:253:1: entryRuleGraphicClass : ruleGraphicClass EOF ;
    public final void entryRuleGraphicClass() throws RecognitionException {
        try {
            // InternalArdsl.g:254:1: ( ruleGraphicClass EOF )
            // InternalArdsl.g:255:1: ruleGraphicClass EOF
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
    // InternalArdsl.g:262:1: ruleGraphicClass : ( ( rule__GraphicClass__Group__0 ) ) ;
    public final void ruleGraphicClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:266:2: ( ( ( rule__GraphicClass__Group__0 ) ) )
            // InternalArdsl.g:267:2: ( ( rule__GraphicClass__Group__0 ) )
            {
            // InternalArdsl.g:267:2: ( ( rule__GraphicClass__Group__0 ) )
            // InternalArdsl.g:268:3: ( rule__GraphicClass__Group__0 )
            {
             before(grammarAccess.getGraphicClassAccess().getGroup()); 
            // InternalArdsl.g:269:3: ( rule__GraphicClass__Group__0 )
            // InternalArdsl.g:269:4: rule__GraphicClass__Group__0
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


    // $ANTLR start "entryRuleVersions"
    // InternalArdsl.g:278:1: entryRuleVersions : ruleVersions EOF ;
    public final void entryRuleVersions() throws RecognitionException {
        try {
            // InternalArdsl.g:279:1: ( ruleVersions EOF )
            // InternalArdsl.g:280:1: ruleVersions EOF
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
    // InternalArdsl.g:287:1: ruleVersions : ( ( rule__Versions__Group__0 ) ) ;
    public final void ruleVersions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:291:2: ( ( ( rule__Versions__Group__0 ) ) )
            // InternalArdsl.g:292:2: ( ( rule__Versions__Group__0 ) )
            {
            // InternalArdsl.g:292:2: ( ( rule__Versions__Group__0 ) )
            // InternalArdsl.g:293:3: ( rule__Versions__Group__0 )
            {
             before(grammarAccess.getVersionsAccess().getGroup()); 
            // InternalArdsl.g:294:3: ( rule__Versions__Group__0 )
            // InternalArdsl.g:294:4: rule__Versions__Group__0
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


    // $ANTLR start "entryRuleConstraints"
    // InternalArdsl.g:303:1: entryRuleConstraints : ruleConstraints EOF ;
    public final void entryRuleConstraints() throws RecognitionException {
        try {
            // InternalArdsl.g:304:1: ( ruleConstraints EOF )
            // InternalArdsl.g:305:1: ruleConstraints EOF
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
    // InternalArdsl.g:312:1: ruleConstraints : ( ( rule__Constraints__Group__0 ) ) ;
    public final void ruleConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:316:2: ( ( ( rule__Constraints__Group__0 ) ) )
            // InternalArdsl.g:317:2: ( ( rule__Constraints__Group__0 ) )
            {
            // InternalArdsl.g:317:2: ( ( rule__Constraints__Group__0 ) )
            // InternalArdsl.g:318:3: ( rule__Constraints__Group__0 )
            {
             before(grammarAccess.getConstraintsAccess().getGroup()); 
            // InternalArdsl.g:319:3: ( rule__Constraints__Group__0 )
            // InternalArdsl.g:319:4: rule__Constraints__Group__0
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


    // $ANTLR start "entryRulePhysics"
    // InternalArdsl.g:328:1: entryRulePhysics : rulePhysics EOF ;
    public final void entryRulePhysics() throws RecognitionException {
        try {
            // InternalArdsl.g:329:1: ( rulePhysics EOF )
            // InternalArdsl.g:330:1: rulePhysics EOF
            {
             before(grammarAccess.getPhysicsRule()); 
            pushFollow(FOLLOW_1);
            rulePhysics();

            state._fsp--;

             after(grammarAccess.getPhysicsRule()); 
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
    // $ANTLR end "entryRulePhysics"


    // $ANTLR start "rulePhysics"
    // InternalArdsl.g:337:1: rulePhysics : ( ( rule__Physics__Group__0 ) ) ;
    public final void rulePhysics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:341:2: ( ( ( rule__Physics__Group__0 ) ) )
            // InternalArdsl.g:342:2: ( ( rule__Physics__Group__0 ) )
            {
            // InternalArdsl.g:342:2: ( ( rule__Physics__Group__0 ) )
            // InternalArdsl.g:343:3: ( rule__Physics__Group__0 )
            {
             before(grammarAccess.getPhysicsAccess().getGroup()); 
            // InternalArdsl.g:344:3: ( rule__Physics__Group__0 )
            // InternalArdsl.g:344:4: rule__Physics__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Physics__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhysicsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhysics"


    // $ANTLR start "entryRulePhysicClass"
    // InternalArdsl.g:353:1: entryRulePhysicClass : rulePhysicClass EOF ;
    public final void entryRulePhysicClass() throws RecognitionException {
        try {
            // InternalArdsl.g:354:1: ( rulePhysicClass EOF )
            // InternalArdsl.g:355:1: rulePhysicClass EOF
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
    // InternalArdsl.g:362:1: rulePhysicClass : ( ( rule__PhysicClass__Group__0 ) ) ;
    public final void rulePhysicClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:366:2: ( ( ( rule__PhysicClass__Group__0 ) ) )
            // InternalArdsl.g:367:2: ( ( rule__PhysicClass__Group__0 ) )
            {
            // InternalArdsl.g:367:2: ( ( rule__PhysicClass__Group__0 ) )
            // InternalArdsl.g:368:3: ( rule__PhysicClass__Group__0 )
            {
             before(grammarAccess.getPhysicClassAccess().getGroup()); 
            // InternalArdsl.g:369:3: ( rule__PhysicClass__Group__0 )
            // InternalArdsl.g:369:4: rule__PhysicClass__Group__0
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
    // InternalArdsl.g:378:1: entryRulePhysicBody : rulePhysicBody EOF ;
    public final void entryRulePhysicBody() throws RecognitionException {
        try {
            // InternalArdsl.g:379:1: ( rulePhysicBody EOF )
            // InternalArdsl.g:380:1: rulePhysicBody EOF
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
    // InternalArdsl.g:387:1: rulePhysicBody : ( ( rule__PhysicBody__Group__0 ) ) ;
    public final void rulePhysicBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:391:2: ( ( ( rule__PhysicBody__Group__0 ) ) )
            // InternalArdsl.g:392:2: ( ( rule__PhysicBody__Group__0 ) )
            {
            // InternalArdsl.g:392:2: ( ( rule__PhysicBody__Group__0 ) )
            // InternalArdsl.g:393:3: ( rule__PhysicBody__Group__0 )
            {
             before(grammarAccess.getPhysicBodyAccess().getGroup()); 
            // InternalArdsl.g:394:3: ( rule__PhysicBody__Group__0 )
            // InternalArdsl.g:394:4: rule__PhysicBody__Group__0
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


    // $ANTLR start "entryRuleForces"
    // InternalArdsl.g:403:1: entryRuleForces : ruleForces EOF ;
    public final void entryRuleForces() throws RecognitionException {
        try {
            // InternalArdsl.g:404:1: ( ruleForces EOF )
            // InternalArdsl.g:405:1: ruleForces EOF
            {
             before(grammarAccess.getForcesRule()); 
            pushFollow(FOLLOW_1);
            ruleForces();

            state._fsp--;

             after(grammarAccess.getForcesRule()); 
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
    // $ANTLR end "entryRuleForces"


    // $ANTLR start "ruleForces"
    // InternalArdsl.g:412:1: ruleForces : ( ( rule__Forces__Group__0 ) ) ;
    public final void ruleForces() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:416:2: ( ( ( rule__Forces__Group__0 ) ) )
            // InternalArdsl.g:417:2: ( ( rule__Forces__Group__0 ) )
            {
            // InternalArdsl.g:417:2: ( ( rule__Forces__Group__0 ) )
            // InternalArdsl.g:418:3: ( rule__Forces__Group__0 )
            {
             before(grammarAccess.getForcesAccess().getGroup()); 
            // InternalArdsl.g:419:3: ( rule__Forces__Group__0 )
            // InternalArdsl.g:419:4: rule__Forces__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Forces__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForcesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForces"


    // $ANTLR start "entryRuleBitMasks"
    // InternalArdsl.g:428:1: entryRuleBitMasks : ruleBitMasks EOF ;
    public final void entryRuleBitMasks() throws RecognitionException {
        try {
            // InternalArdsl.g:429:1: ( ruleBitMasks EOF )
            // InternalArdsl.g:430:1: ruleBitMasks EOF
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
    // InternalArdsl.g:437:1: ruleBitMasks : ( ( rule__BitMasks__Group__0 ) ) ;
    public final void ruleBitMasks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:441:2: ( ( ( rule__BitMasks__Group__0 ) ) )
            // InternalArdsl.g:442:2: ( ( rule__BitMasks__Group__0 ) )
            {
            // InternalArdsl.g:442:2: ( ( rule__BitMasks__Group__0 ) )
            // InternalArdsl.g:443:3: ( rule__BitMasks__Group__0 )
            {
             before(grammarAccess.getBitMasksAccess().getGroup()); 
            // InternalArdsl.g:444:3: ( rule__BitMasks__Group__0 )
            // InternalArdsl.g:444:4: rule__BitMasks__Group__0
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


    // $ANTLR start "entryRuleGameloop"
    // InternalArdsl.g:453:1: entryRuleGameloop : ruleGameloop EOF ;
    public final void entryRuleGameloop() throws RecognitionException {
        try {
            // InternalArdsl.g:454:1: ( ruleGameloop EOF )
            // InternalArdsl.g:455:1: ruleGameloop EOF
            {
             before(grammarAccess.getGameloopRule()); 
            pushFollow(FOLLOW_1);
            ruleGameloop();

            state._fsp--;

             after(grammarAccess.getGameloopRule()); 
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
    // $ANTLR end "entryRuleGameloop"


    // $ANTLR start "ruleGameloop"
    // InternalArdsl.g:462:1: ruleGameloop : ( ( rule__Gameloop__Group__0 ) ) ;
    public final void ruleGameloop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:466:2: ( ( ( rule__Gameloop__Group__0 ) ) )
            // InternalArdsl.g:467:2: ( ( rule__Gameloop__Group__0 ) )
            {
            // InternalArdsl.g:467:2: ( ( rule__Gameloop__Group__0 ) )
            // InternalArdsl.g:468:3: ( rule__Gameloop__Group__0 )
            {
             before(grammarAccess.getGameloopAccess().getGroup()); 
            // InternalArdsl.g:469:3: ( rule__Gameloop__Group__0 )
            // InternalArdsl.g:469:4: rule__Gameloop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameloopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGameloop"


    // $ANTLR start "entryRuleScore"
    // InternalArdsl.g:478:1: entryRuleScore : ruleScore EOF ;
    public final void entryRuleScore() throws RecognitionException {
        try {
            // InternalArdsl.g:479:1: ( ruleScore EOF )
            // InternalArdsl.g:480:1: ruleScore EOF
            {
             before(grammarAccess.getScoreRule()); 
            pushFollow(FOLLOW_1);
            ruleScore();

            state._fsp--;

             after(grammarAccess.getScoreRule()); 
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
    // $ANTLR end "entryRuleScore"


    // $ANTLR start "ruleScore"
    // InternalArdsl.g:487:1: ruleScore : ( ( rule__Score__Group__0 ) ) ;
    public final void ruleScore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:491:2: ( ( ( rule__Score__Group__0 ) ) )
            // InternalArdsl.g:492:2: ( ( rule__Score__Group__0 ) )
            {
            // InternalArdsl.g:492:2: ( ( rule__Score__Group__0 ) )
            // InternalArdsl.g:493:3: ( rule__Score__Group__0 )
            {
             before(grammarAccess.getScoreAccess().getGroup()); 
            // InternalArdsl.g:494:3: ( rule__Score__Group__0 )
            // InternalArdsl.g:494:4: rule__Score__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Score__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScore"


    // $ANTLR start "entryRuleActions"
    // InternalArdsl.g:503:1: entryRuleActions : ruleActions EOF ;
    public final void entryRuleActions() throws RecognitionException {
        try {
            // InternalArdsl.g:504:1: ( ruleActions EOF )
            // InternalArdsl.g:505:1: ruleActions EOF
            {
             before(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getActionsRule()); 
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
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // InternalArdsl.g:512:1: ruleActions : ( ( rule__Actions__Group__0 ) ) ;
    public final void ruleActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:516:2: ( ( ( rule__Actions__Group__0 ) ) )
            // InternalArdsl.g:517:2: ( ( rule__Actions__Group__0 ) )
            {
            // InternalArdsl.g:517:2: ( ( rule__Actions__Group__0 ) )
            // InternalArdsl.g:518:3: ( rule__Actions__Group__0 )
            {
             before(grammarAccess.getActionsAccess().getGroup()); 
            // InternalArdsl.g:519:3: ( rule__Actions__Group__0 )
            // InternalArdsl.g:519:4: rule__Actions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleCollisions"
    // InternalArdsl.g:528:1: entryRuleCollisions : ruleCollisions EOF ;
    public final void entryRuleCollisions() throws RecognitionException {
        try {
            // InternalArdsl.g:529:1: ( ruleCollisions EOF )
            // InternalArdsl.g:530:1: ruleCollisions EOF
            {
             before(grammarAccess.getCollisionsRule()); 
            pushFollow(FOLLOW_1);
            ruleCollisions();

            state._fsp--;

             after(grammarAccess.getCollisionsRule()); 
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
    // $ANTLR end "entryRuleCollisions"


    // $ANTLR start "ruleCollisions"
    // InternalArdsl.g:537:1: ruleCollisions : ( ( rule__Collisions__Group__0 ) ) ;
    public final void ruleCollisions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:541:2: ( ( ( rule__Collisions__Group__0 ) ) )
            // InternalArdsl.g:542:2: ( ( rule__Collisions__Group__0 ) )
            {
            // InternalArdsl.g:542:2: ( ( rule__Collisions__Group__0 ) )
            // InternalArdsl.g:543:3: ( rule__Collisions__Group__0 )
            {
             before(grammarAccess.getCollisionsAccess().getGroup()); 
            // InternalArdsl.g:544:3: ( rule__Collisions__Group__0 )
            // InternalArdsl.g:544:4: rule__Collisions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Collisions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollisionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollisions"


    // $ANTLR start "entryRulePhysicChanges"
    // InternalArdsl.g:553:1: entryRulePhysicChanges : rulePhysicChanges EOF ;
    public final void entryRulePhysicChanges() throws RecognitionException {
        try {
            // InternalArdsl.g:554:1: ( rulePhysicChanges EOF )
            // InternalArdsl.g:555:1: rulePhysicChanges EOF
            {
             before(grammarAccess.getPhysicChangesRule()); 
            pushFollow(FOLLOW_1);
            rulePhysicChanges();

            state._fsp--;

             after(grammarAccess.getPhysicChangesRule()); 
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
    // $ANTLR end "entryRulePhysicChanges"


    // $ANTLR start "rulePhysicChanges"
    // InternalArdsl.g:562:1: rulePhysicChanges : ( ( rule__PhysicChanges__Group__0 ) ) ;
    public final void rulePhysicChanges() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:566:2: ( ( ( rule__PhysicChanges__Group__0 ) ) )
            // InternalArdsl.g:567:2: ( ( rule__PhysicChanges__Group__0 ) )
            {
            // InternalArdsl.g:567:2: ( ( rule__PhysicChanges__Group__0 ) )
            // InternalArdsl.g:568:3: ( rule__PhysicChanges__Group__0 )
            {
             before(grammarAccess.getPhysicChangesAccess().getGroup()); 
            // InternalArdsl.g:569:3: ( rule__PhysicChanges__Group__0 )
            // InternalArdsl.g:569:4: rule__PhysicChanges__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhysicChanges"


    // $ANTLR start "entryRuleGamePad"
    // InternalArdsl.g:578:1: entryRuleGamePad : ruleGamePad EOF ;
    public final void entryRuleGamePad() throws RecognitionException {
        try {
            // InternalArdsl.g:579:1: ( ruleGamePad EOF )
            // InternalArdsl.g:580:1: ruleGamePad EOF
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
    // InternalArdsl.g:587:1: ruleGamePad : ( ( rule__GamePad__Group__0 ) ) ;
    public final void ruleGamePad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:591:2: ( ( ( rule__GamePad__Group__0 ) ) )
            // InternalArdsl.g:592:2: ( ( rule__GamePad__Group__0 ) )
            {
            // InternalArdsl.g:592:2: ( ( rule__GamePad__Group__0 ) )
            // InternalArdsl.g:593:3: ( rule__GamePad__Group__0 )
            {
             before(grammarAccess.getGamePadAccess().getGroup()); 
            // InternalArdsl.g:594:3: ( rule__GamePad__Group__0 )
            // InternalArdsl.g:594:4: rule__GamePad__Group__0
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


    // $ANTLR start "entryRuleObjInit"
    // InternalArdsl.g:603:1: entryRuleObjInit : ruleObjInit EOF ;
    public final void entryRuleObjInit() throws RecognitionException {
        try {
            // InternalArdsl.g:604:1: ( ruleObjInit EOF )
            // InternalArdsl.g:605:1: ruleObjInit EOF
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
    // InternalArdsl.g:612:1: ruleObjInit : ( ( rule__ObjInit__Group__0 ) ) ;
    public final void ruleObjInit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:616:2: ( ( ( rule__ObjInit__Group__0 ) ) )
            // InternalArdsl.g:617:2: ( ( rule__ObjInit__Group__0 ) )
            {
            // InternalArdsl.g:617:2: ( ( rule__ObjInit__Group__0 ) )
            // InternalArdsl.g:618:3: ( rule__ObjInit__Group__0 )
            {
             before(grammarAccess.getObjInitAccess().getGroup()); 
            // InternalArdsl.g:619:3: ( rule__ObjInit__Group__0 )
            // InternalArdsl.g:619:4: rule__ObjInit__Group__0
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


    // $ANTLR start "entryRuleRule"
    // InternalArdsl.g:628:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalArdsl.g:629:1: ( ruleRule EOF )
            // InternalArdsl.g:630:1: ruleRule EOF
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
    // InternalArdsl.g:637:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:641:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalArdsl.g:642:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalArdsl.g:642:2: ( ( rule__Rule__Group__0 ) )
            // InternalArdsl.g:643:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalArdsl.g:644:3: ( rule__Rule__Group__0 )
            // InternalArdsl.g:644:4: rule__Rule__Group__0
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


    // $ANTLR start "entryRuleCondition"
    // InternalArdsl.g:653:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalArdsl.g:654:1: ( ruleCondition EOF )
            // InternalArdsl.g:655:1: ruleCondition EOF
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
    // InternalArdsl.g:662:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:666:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalArdsl.g:667:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalArdsl.g:667:2: ( ( rule__Condition__Alternatives ) )
            // InternalArdsl.g:668:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalArdsl.g:669:3: ( rule__Condition__Alternatives )
            // InternalArdsl.g:669:4: rule__Condition__Alternatives
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


    // $ANTLR start "entryRuleLogicOp"
    // InternalArdsl.g:678:1: entryRuleLogicOp : ruleLogicOp EOF ;
    public final void entryRuleLogicOp() throws RecognitionException {
        try {
            // InternalArdsl.g:679:1: ( ruleLogicOp EOF )
            // InternalArdsl.g:680:1: ruleLogicOp EOF
            {
             before(grammarAccess.getLogicOpRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicOp();

            state._fsp--;

             after(grammarAccess.getLogicOpRule()); 
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
    // $ANTLR end "entryRuleLogicOp"


    // $ANTLR start "ruleLogicOp"
    // InternalArdsl.g:687:1: ruleLogicOp : ( ( rule__LogicOp__Alternatives ) ) ;
    public final void ruleLogicOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:691:2: ( ( ( rule__LogicOp__Alternatives ) ) )
            // InternalArdsl.g:692:2: ( ( rule__LogicOp__Alternatives ) )
            {
            // InternalArdsl.g:692:2: ( ( rule__LogicOp__Alternatives ) )
            // InternalArdsl.g:693:3: ( rule__LogicOp__Alternatives )
            {
             before(grammarAccess.getLogicOpAccess().getAlternatives()); 
            // InternalArdsl.g:694:3: ( rule__LogicOp__Alternatives )
            // InternalArdsl.g:694:4: rule__LogicOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogicOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicOp"


    // $ANTLR start "entryRuleArithmetic"
    // InternalArdsl.g:703:1: entryRuleArithmetic : ruleArithmetic EOF ;
    public final void entryRuleArithmetic() throws RecognitionException {
        try {
            // InternalArdsl.g:704:1: ( ruleArithmetic EOF )
            // InternalArdsl.g:705:1: ruleArithmetic EOF
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
    // InternalArdsl.g:712:1: ruleArithmetic : ( ( rule__Arithmetic__Group__0 ) ) ;
    public final void ruleArithmetic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:716:2: ( ( ( rule__Arithmetic__Group__0 ) ) )
            // InternalArdsl.g:717:2: ( ( rule__Arithmetic__Group__0 ) )
            {
            // InternalArdsl.g:717:2: ( ( rule__Arithmetic__Group__0 ) )
            // InternalArdsl.g:718:3: ( rule__Arithmetic__Group__0 )
            {
             before(grammarAccess.getArithmeticAccess().getGroup()); 
            // InternalArdsl.g:719:3: ( rule__Arithmetic__Group__0 )
            // InternalArdsl.g:719:4: rule__Arithmetic__Group__0
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


    // $ANTLR start "entryRuleNot"
    // InternalArdsl.g:728:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalArdsl.g:729:1: ( ruleNot EOF )
            // InternalArdsl.g:730:1: ruleNot EOF
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
    // InternalArdsl.g:737:1: ruleNot : ( ( rule__Not__Group__0 ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:741:2: ( ( ( rule__Not__Group__0 ) ) )
            // InternalArdsl.g:742:2: ( ( rule__Not__Group__0 ) )
            {
            // InternalArdsl.g:742:2: ( ( rule__Not__Group__0 ) )
            // InternalArdsl.g:743:3: ( rule__Not__Group__0 )
            {
             before(grammarAccess.getNotAccess().getGroup()); 
            // InternalArdsl.g:744:3: ( rule__Not__Group__0 )
            // InternalArdsl.g:744:4: rule__Not__Group__0
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
    // InternalArdsl.g:753:1: entryRuleBinary : ruleBinary EOF ;
    public final void entryRuleBinary() throws RecognitionException {
        try {
            // InternalArdsl.g:754:1: ( ruleBinary EOF )
            // InternalArdsl.g:755:1: ruleBinary EOF
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
    // InternalArdsl.g:762:1: ruleBinary : ( ( rule__Binary__Group__0 ) ) ;
    public final void ruleBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:766:2: ( ( ( rule__Binary__Group__0 ) ) )
            // InternalArdsl.g:767:2: ( ( rule__Binary__Group__0 ) )
            {
            // InternalArdsl.g:767:2: ( ( rule__Binary__Group__0 ) )
            // InternalArdsl.g:768:3: ( rule__Binary__Group__0 )
            {
             before(grammarAccess.getBinaryAccess().getGroup()); 
            // InternalArdsl.g:769:3: ( rule__Binary__Group__0 )
            // InternalArdsl.g:769:4: rule__Binary__Group__0
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


    // $ANTLR start "entryRuleValue"
    // InternalArdsl.g:778:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalArdsl.g:779:1: ( ruleValue EOF )
            // InternalArdsl.g:780:1: ruleValue EOF
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
    // InternalArdsl.g:787:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:791:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalArdsl.g:792:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalArdsl.g:792:2: ( ( rule__Value__Alternatives ) )
            // InternalArdsl.g:793:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalArdsl.g:794:3: ( rule__Value__Alternatives )
            // InternalArdsl.g:794:4: rule__Value__Alternatives
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


    // $ANTLR start "entryRuleAttributeValue"
    // InternalArdsl.g:803:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // InternalArdsl.g:804:1: ( ruleAttributeValue EOF )
            // InternalArdsl.g:805:1: ruleAttributeValue EOF
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
    // InternalArdsl.g:812:1: ruleAttributeValue : ( ( rule__AttributeValue__Group__0 ) ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:816:2: ( ( ( rule__AttributeValue__Group__0 ) ) )
            // InternalArdsl.g:817:2: ( ( rule__AttributeValue__Group__0 ) )
            {
            // InternalArdsl.g:817:2: ( ( rule__AttributeValue__Group__0 ) )
            // InternalArdsl.g:818:3: ( rule__AttributeValue__Group__0 )
            {
             before(grammarAccess.getAttributeValueAccess().getGroup()); 
            // InternalArdsl.g:819:3: ( rule__AttributeValue__Group__0 )
            // InternalArdsl.g:819:4: rule__AttributeValue__Group__0
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
    // InternalArdsl.g:828:1: entryRuleConstantValue : ruleConstantValue EOF ;
    public final void entryRuleConstantValue() throws RecognitionException {
        try {
            // InternalArdsl.g:829:1: ( ruleConstantValue EOF )
            // InternalArdsl.g:830:1: ruleConstantValue EOF
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
    // InternalArdsl.g:837:1: ruleConstantValue : ( ( rule__ConstantValue__ValueAssignment ) ) ;
    public final void ruleConstantValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:841:2: ( ( ( rule__ConstantValue__ValueAssignment ) ) )
            // InternalArdsl.g:842:2: ( ( rule__ConstantValue__ValueAssignment ) )
            {
            // InternalArdsl.g:842:2: ( ( rule__ConstantValue__ValueAssignment ) )
            // InternalArdsl.g:843:3: ( rule__ConstantValue__ValueAssignment )
            {
             before(grammarAccess.getConstantValueAccess().getValueAssignment()); 
            // InternalArdsl.g:844:3: ( rule__ConstantValue__ValueAssignment )
            // InternalArdsl.g:844:4: rule__ConstantValue__ValueAssignment
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


    // $ANTLR start "entryRuleAllInstances"
    // InternalArdsl.g:853:1: entryRuleAllInstances : ruleAllInstances EOF ;
    public final void entryRuleAllInstances() throws RecognitionException {
        try {
            // InternalArdsl.g:854:1: ( ruleAllInstances EOF )
            // InternalArdsl.g:855:1: ruleAllInstances EOF
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
    // InternalArdsl.g:862:1: ruleAllInstances : ( ( rule__AllInstances__Group__0 ) ) ;
    public final void ruleAllInstances() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:866:2: ( ( ( rule__AllInstances__Group__0 ) ) )
            // InternalArdsl.g:867:2: ( ( rule__AllInstances__Group__0 ) )
            {
            // InternalArdsl.g:867:2: ( ( rule__AllInstances__Group__0 ) )
            // InternalArdsl.g:868:3: ( rule__AllInstances__Group__0 )
            {
             before(grammarAccess.getAllInstancesAccess().getGroup()); 
            // InternalArdsl.g:869:3: ( rule__AllInstances__Group__0 )
            // InternalArdsl.g:869:4: rule__AllInstances__Group__0
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


    // $ANTLR start "ruleBasicActions"
    // InternalArdsl.g:878:1: ruleBasicActions : ( ( rule__BasicActions__Alternatives ) ) ;
    public final void ruleBasicActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:882:1: ( ( ( rule__BasicActions__Alternatives ) ) )
            // InternalArdsl.g:883:2: ( ( rule__BasicActions__Alternatives ) )
            {
            // InternalArdsl.g:883:2: ( ( rule__BasicActions__Alternatives ) )
            // InternalArdsl.g:884:3: ( rule__BasicActions__Alternatives )
            {
             before(grammarAccess.getBasicActionsAccess().getAlternatives()); 
            // InternalArdsl.g:885:3: ( rule__BasicActions__Alternatives )
            // InternalArdsl.g:885:4: rule__BasicActions__Alternatives
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


    // $ANTLR start "rulePlanes"
    // InternalArdsl.g:894:1: rulePlanes : ( ( rule__Planes__Alternatives ) ) ;
    public final void rulePlanes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:898:1: ( ( ( rule__Planes__Alternatives ) ) )
            // InternalArdsl.g:899:2: ( ( rule__Planes__Alternatives ) )
            {
            // InternalArdsl.g:899:2: ( ( rule__Planes__Alternatives ) )
            // InternalArdsl.g:900:3: ( rule__Planes__Alternatives )
            {
             before(grammarAccess.getPlanesAccess().getAlternatives()); 
            // InternalArdsl.g:901:3: ( rule__Planes__Alternatives )
            // InternalArdsl.g:901:4: rule__Planes__Alternatives
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
    // InternalArdsl.g:910:1: ruleBodyType : ( ( rule__BodyType__Alternatives ) ) ;
    public final void ruleBodyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:914:1: ( ( ( rule__BodyType__Alternatives ) ) )
            // InternalArdsl.g:915:2: ( ( rule__BodyType__Alternatives ) )
            {
            // InternalArdsl.g:915:2: ( ( rule__BodyType__Alternatives ) )
            // InternalArdsl.g:916:3: ( rule__BodyType__Alternatives )
            {
             before(grammarAccess.getBodyTypeAccess().getAlternatives()); 
            // InternalArdsl.g:917:3: ( rule__BodyType__Alternatives )
            // InternalArdsl.g:917:4: rule__BodyType__Alternatives
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


    // $ANTLR start "ruleAction"
    // InternalArdsl.g:926:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:930:1: ( ( ( rule__Action__Alternatives ) ) )
            // InternalArdsl.g:931:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalArdsl.g:931:2: ( ( rule__Action__Alternatives ) )
            // InternalArdsl.g:932:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalArdsl.g:933:3: ( rule__Action__Alternatives )
            // InternalArdsl.g:933:4: rule__Action__Alternatives
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
    // InternalArdsl.g:942:1: rulePosition : ( ( rule__Position__Alternatives ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:946:1: ( ( ( rule__Position__Alternatives ) ) )
            // InternalArdsl.g:947:2: ( ( rule__Position__Alternatives ) )
            {
            // InternalArdsl.g:947:2: ( ( rule__Position__Alternatives ) )
            // InternalArdsl.g:948:3: ( rule__Position__Alternatives )
            {
             before(grammarAccess.getPositionAccess().getAlternatives()); 
            // InternalArdsl.g:949:3: ( rule__Position__Alternatives )
            // InternalArdsl.g:949:4: rule__Position__Alternatives
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
    // InternalArdsl.g:958:1: ruleLogicOps : ( ( rule__LogicOps__Alternatives ) ) ;
    public final void ruleLogicOps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:962:1: ( ( ( rule__LogicOps__Alternatives ) ) )
            // InternalArdsl.g:963:2: ( ( rule__LogicOps__Alternatives ) )
            {
            // InternalArdsl.g:963:2: ( ( rule__LogicOps__Alternatives ) )
            // InternalArdsl.g:964:3: ( rule__LogicOps__Alternatives )
            {
             before(grammarAccess.getLogicOpsAccess().getAlternatives()); 
            // InternalArdsl.g:965:3: ( rule__LogicOps__Alternatives )
            // InternalArdsl.g:965:4: rule__LogicOps__Alternatives
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
    // InternalArdsl.g:974:1: ruleArithmOps : ( ( rule__ArithmOps__Alternatives ) ) ;
    public final void ruleArithmOps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:978:1: ( ( ( rule__ArithmOps__Alternatives ) ) )
            // InternalArdsl.g:979:2: ( ( rule__ArithmOps__Alternatives ) )
            {
            // InternalArdsl.g:979:2: ( ( rule__ArithmOps__Alternatives ) )
            // InternalArdsl.g:980:3: ( rule__ArithmOps__Alternatives )
            {
             before(grammarAccess.getArithmOpsAccess().getAlternatives()); 
            // InternalArdsl.g:981:3: ( rule__ArithmOps__Alternatives )
            // InternalArdsl.g:981:4: rule__ArithmOps__Alternatives
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalArdsl.g:989:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:993:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalArdsl.g:994:2: ( RULE_STRING )
                    {
                    // InternalArdsl.g:994:2: ( RULE_STRING )
                    // InternalArdsl.g:995:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:1000:2: ( RULE_ID )
                    {
                    // InternalArdsl.g:1000:2: ( RULE_ID )
                    // InternalArdsl.g:1001:3: RULE_ID
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


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalArdsl.g:1010:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1014:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalArdsl.g:1015:2: ( 'E' )
                    {
                    // InternalArdsl.g:1015:2: ( 'E' )
                    // InternalArdsl.g:1016:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:1021:2: ( 'e' )
                    {
                    // InternalArdsl.g:1021:2: ( 'e' )
                    // InternalArdsl.g:1022:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
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


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalArdsl.g:1031:1: rule__Condition__Alternatives : ( ( ruleLogicOp ) | ( ruleArithmetic ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1035:1: ( ( ruleLogicOp ) | ( ruleArithmetic ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=104 && LA3_0<=105)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)||LA3_0==106) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArdsl.g:1036:2: ( ruleLogicOp )
                    {
                    // InternalArdsl.g:1036:2: ( ruleLogicOp )
                    // InternalArdsl.g:1037:3: ruleLogicOp
                    {
                     before(grammarAccess.getConditionAccess().getLogicOpParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLogicOp();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getLogicOpParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:1042:2: ( ruleArithmetic )
                    {
                    // InternalArdsl.g:1042:2: ( ruleArithmetic )
                    // InternalArdsl.g:1043:3: ruleArithmetic
                    {
                     before(grammarAccess.getConditionAccess().getArithmeticParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArithmetic();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getArithmeticParserRuleCall_1()); 

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


    // $ANTLR start "rule__LogicOp__Alternatives"
    // InternalArdsl.g:1052:1: rule__LogicOp__Alternatives : ( ( ruleNot ) | ( ruleBinary ) );
    public final void rule__LogicOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1056:1: ( ( ruleNot ) | ( ruleBinary ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==104) ) {
                alt4=1;
            }
            else if ( (LA4_0==105) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalArdsl.g:1057:2: ( ruleNot )
                    {
                    // InternalArdsl.g:1057:2: ( ruleNot )
                    // InternalArdsl.g:1058:3: ruleNot
                    {
                     before(grammarAccess.getLogicOpAccess().getNotParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNot();

                    state._fsp--;

                     after(grammarAccess.getLogicOpAccess().getNotParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:1063:2: ( ruleBinary )
                    {
                    // InternalArdsl.g:1063:2: ( ruleBinary )
                    // InternalArdsl.g:1064:3: ruleBinary
                    {
                     before(grammarAccess.getLogicOpAccess().getBinaryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBinary();

                    state._fsp--;

                     after(grammarAccess.getLogicOpAccess().getBinaryParserRuleCall_1()); 

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
    // $ANTLR end "rule__LogicOp__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalArdsl.g:1073:1: rule__Value__Alternatives : ( ( ruleAttributeValue ) | ( ruleConstantValue ) | ( ruleAllInstances ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1077:1: ( ( ruleAttributeValue ) | ( ruleConstantValue ) | ( ruleAllInstances ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||(LA5_1>=30 && LA5_1<=34)||LA5_1==103) ) {
                    alt5=2;
                }
                else if ( (LA5_1==42) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==EOF||(LA5_2>=30 && LA5_2<=34)||LA5_2==103) ) {
                    alt5=2;
                }
                else if ( (LA5_2==42) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 106:
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
                    // InternalArdsl.g:1078:2: ( ruleAttributeValue )
                    {
                    // InternalArdsl.g:1078:2: ( ruleAttributeValue )
                    // InternalArdsl.g:1079:3: ruleAttributeValue
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
                    // InternalArdsl.g:1084:2: ( ruleConstantValue )
                    {
                    // InternalArdsl.g:1084:2: ( ruleConstantValue )
                    // InternalArdsl.g:1085:3: ruleConstantValue
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
                    // InternalArdsl.g:1090:2: ( ruleAllInstances )
                    {
                    // InternalArdsl.g:1090:2: ( ruleAllInstances )
                    // InternalArdsl.g:1091:3: ruleAllInstances
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


    // $ANTLR start "rule__BasicActions__Alternatives"
    // InternalArdsl.g:1100:1: rule__BasicActions__Alternatives : ( ( ( 'start' ) ) | ( ( 'lose' ) ) | ( ( 'win' ) ) );
    public final void rule__BasicActions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1104:1: ( ( ( 'start' ) ) | ( ( 'lose' ) ) | ( ( 'win' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
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
                    // InternalArdsl.g:1105:2: ( ( 'start' ) )
                    {
                    // InternalArdsl.g:1105:2: ( ( 'start' ) )
                    // InternalArdsl.g:1106:3: ( 'start' )
                    {
                     before(grammarAccess.getBasicActionsAccess().getStartEnumLiteralDeclaration_0()); 
                    // InternalArdsl.g:1107:3: ( 'start' )
                    // InternalArdsl.g:1107:4: 'start'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicActionsAccess().getStartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:1111:2: ( ( 'lose' ) )
                    {
                    // InternalArdsl.g:1111:2: ( ( 'lose' ) )
                    // InternalArdsl.g:1112:3: ( 'lose' )
                    {
                     before(grammarAccess.getBasicActionsAccess().getLoseEnumLiteralDeclaration_1()); 
                    // InternalArdsl.g:1113:3: ( 'lose' )
                    // InternalArdsl.g:1113:4: 'lose'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicActionsAccess().getLoseEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArdsl.g:1117:2: ( ( 'win' ) )
                    {
                    // InternalArdsl.g:1117:2: ( ( 'win' ) )
                    // InternalArdsl.g:1118:3: ( 'win' )
                    {
                     before(grammarAccess.getBasicActionsAccess().getWinEnumLiteralDeclaration_2()); 
                    // InternalArdsl.g:1119:3: ( 'win' )
                    // InternalArdsl.g:1119:4: 'win'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicActionsAccess().getWinEnumLiteralDeclaration_2()); 

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


    // $ANTLR start "rule__Planes__Alternatives"
    // InternalArdsl.g:1127:1: rule__Planes__Alternatives : ( ( ( 'any' ) ) | ( ( 'horizontal' ) ) | ( ( 'vertical' ) ) );
    public final void rule__Planes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1131:1: ( ( ( 'any' ) ) | ( ( 'horizontal' ) ) | ( ( 'vertical' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalArdsl.g:1132:2: ( ( 'any' ) )
                    {
                    // InternalArdsl.g:1132:2: ( ( 'any' ) )
                    // InternalArdsl.g:1133:3: ( 'any' )
                    {
                     before(grammarAccess.getPlanesAccess().getAnyEnumLiteralDeclaration_0()); 
                    // InternalArdsl.g:1134:3: ( 'any' )
                    // InternalArdsl.g:1134:4: 'any'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPlanesAccess().getAnyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:1138:2: ( ( 'horizontal' ) )
                    {
                    // InternalArdsl.g:1138:2: ( ( 'horizontal' ) )
                    // InternalArdsl.g:1139:3: ( 'horizontal' )
                    {
                     before(grammarAccess.getPlanesAccess().getHorizontalEnumLiteralDeclaration_1()); 
                    // InternalArdsl.g:1140:3: ( 'horizontal' )
                    // InternalArdsl.g:1140:4: 'horizontal'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPlanesAccess().getHorizontalEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArdsl.g:1144:2: ( ( 'vertical' ) )
                    {
                    // InternalArdsl.g:1144:2: ( ( 'vertical' ) )
                    // InternalArdsl.g:1145:3: ( 'vertical' )
                    {
                     before(grammarAccess.getPlanesAccess().getVerticalEnumLiteralDeclaration_2()); 
                    // InternalArdsl.g:1146:3: ( 'vertical' )
                    // InternalArdsl.g:1146:4: 'vertical'
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalArdsl.g:1154:1: rule__BodyType__Alternatives : ( ( ( 'static' ) ) | ( ( 'dynamic' ) ) | ( ( 'kinematic' ) ) );
    public final void rule__BodyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1158:1: ( ( ( 'static' ) ) | ( ( 'dynamic' ) ) | ( ( 'kinematic' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
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
                    // InternalArdsl.g:1159:2: ( ( 'static' ) )
                    {
                    // InternalArdsl.g:1159:2: ( ( 'static' ) )
                    // InternalArdsl.g:1160:3: ( 'static' )
                    {
                     before(grammarAccess.getBodyTypeAccess().getStaticEnumLiteralDeclaration_0()); 
                    // InternalArdsl.g:1161:3: ( 'static' )
                    // InternalArdsl.g:1161:4: 'static'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBodyTypeAccess().getStaticEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:1165:2: ( ( 'dynamic' ) )
                    {
                    // InternalArdsl.g:1165:2: ( ( 'dynamic' ) )
                    // InternalArdsl.g:1166:3: ( 'dynamic' )
                    {
                     before(grammarAccess.getBodyTypeAccess().getDynamicEnumLiteralDeclaration_1()); 
                    // InternalArdsl.g:1167:3: ( 'dynamic' )
                    // InternalArdsl.g:1167:4: 'dynamic'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBodyTypeAccess().getDynamicEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArdsl.g:1171:2: ( ( 'kinematic' ) )
                    {
                    // InternalArdsl.g:1171:2: ( ( 'kinematic' ) )
                    // InternalArdsl.g:1172:3: ( 'kinematic' )
                    {
                     before(grammarAccess.getBodyTypeAccess().getKinematicEnumLiteralDeclaration_2()); 
                    // InternalArdsl.g:1173:3: ( 'kinematic' )
                    // InternalArdsl.g:1173:4: 'kinematic'
                    {
                    match(input,21,FOLLOW_2); 

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


    // $ANTLR start "rule__Action__Alternatives"
    // InternalArdsl.g:1181:1: rule__Action__Alternatives : ( ( ( 'create' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1185:1: ( ( ( 'create' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
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
                    // InternalArdsl.g:1186:2: ( ( 'create' ) )
                    {
                    // InternalArdsl.g:1186:2: ( ( 'create' ) )
                    // InternalArdsl.g:1187:3: ( 'create' )
                    {
                     before(grammarAccess.getActionAccess().getCreateEnumLiteralDeclaration_0()); 
                    // InternalArdsl.g:1188:3: ( 'create' )
                    // InternalArdsl.g:1188:4: 'create'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getCreateEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:1192:2: ( ( 'edit' ) )
                    {
                    // InternalArdsl.g:1192:2: ( ( 'edit' ) )
                    // InternalArdsl.g:1193:3: ( 'edit' )
                    {
                     before(grammarAccess.getActionAccess().getEditEnumLiteralDeclaration_1()); 
                    // InternalArdsl.g:1194:3: ( 'edit' )
                    // InternalArdsl.g:1194:4: 'edit'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getEditEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArdsl.g:1198:2: ( ( 'delete' ) )
                    {
                    // InternalArdsl.g:1198:2: ( ( 'delete' ) )
                    // InternalArdsl.g:1199:3: ( 'delete' )
                    {
                     before(grammarAccess.getActionAccess().getDeleteEnumLiteralDeclaration_2()); 
                    // InternalArdsl.g:1200:3: ( 'delete' )
                    // InternalArdsl.g:1200:4: 'delete'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalArdsl.g:1208:1: rule__Position__Alternatives : ( ( ( 'front' ) ) | ( ( 'default' ) ) | ( ( 'back' ) ) );
    public final void rule__Position__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1212:1: ( ( ( 'front' ) ) | ( ( 'default' ) ) | ( ( 'back' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 27:
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
                    // InternalArdsl.g:1213:2: ( ( 'front' ) )
                    {
                    // InternalArdsl.g:1213:2: ( ( 'front' ) )
                    // InternalArdsl.g:1214:3: ( 'front' )
                    {
                     before(grammarAccess.getPositionAccess().getFrontEnumLiteralDeclaration_0()); 
                    // InternalArdsl.g:1215:3: ( 'front' )
                    // InternalArdsl.g:1215:4: 'front'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionAccess().getFrontEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:1219:2: ( ( 'default' ) )
                    {
                    // InternalArdsl.g:1219:2: ( ( 'default' ) )
                    // InternalArdsl.g:1220:3: ( 'default' )
                    {
                     before(grammarAccess.getPositionAccess().getDefaultEnumLiteralDeclaration_1()); 
                    // InternalArdsl.g:1221:3: ( 'default' )
                    // InternalArdsl.g:1221:4: 'default'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionAccess().getDefaultEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArdsl.g:1225:2: ( ( 'back' ) )
                    {
                    // InternalArdsl.g:1225:2: ( ( 'back' ) )
                    // InternalArdsl.g:1226:3: ( 'back' )
                    {
                     before(grammarAccess.getPositionAccess().getBackEnumLiteralDeclaration_2()); 
                    // InternalArdsl.g:1227:3: ( 'back' )
                    // InternalArdsl.g:1227:4: 'back'
                    {
                    match(input,27,FOLLOW_2); 

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
    // InternalArdsl.g:1235:1: rule__LogicOps__Alternatives : ( ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__LogicOps__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1239:1: ( ( ( '&' ) ) | ( ( '|' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalArdsl.g:1240:2: ( ( '&' ) )
                    {
                    // InternalArdsl.g:1240:2: ( ( '&' ) )
                    // InternalArdsl.g:1241:3: ( '&' )
                    {
                     before(grammarAccess.getLogicOpsAccess().getAndEnumLiteralDeclaration_0()); 
                    // InternalArdsl.g:1242:3: ( '&' )
                    // InternalArdsl.g:1242:4: '&'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicOpsAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:1246:2: ( ( '|' ) )
                    {
                    // InternalArdsl.g:1246:2: ( ( '|' ) )
                    // InternalArdsl.g:1247:3: ( '|' )
                    {
                     before(grammarAccess.getLogicOpsAccess().getOrEnumLiteralDeclaration_1()); 
                    // InternalArdsl.g:1248:3: ( '|' )
                    // InternalArdsl.g:1248:4: '|'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalArdsl.g:1256:1: rule__ArithmOps__Alternatives : ( ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) );
    public final void rule__ArithmOps__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1260:1: ( ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case 32:
                {
                alt12=3;
                }
                break;
            case 33:
                {
                alt12=4;
                }
                break;
            case 34:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalArdsl.g:1261:2: ( ( '=' ) )
                    {
                    // InternalArdsl.g:1261:2: ( ( '=' ) )
                    // InternalArdsl.g:1262:3: ( '=' )
                    {
                     before(grammarAccess.getArithmOpsAccess().getEqualEnumLiteralDeclaration_0()); 
                    // InternalArdsl.g:1263:3: ( '=' )
                    // InternalArdsl.g:1263:4: '='
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getArithmOpsAccess().getEqualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:1267:2: ( ( '>' ) )
                    {
                    // InternalArdsl.g:1267:2: ( ( '>' ) )
                    // InternalArdsl.g:1268:3: ( '>' )
                    {
                     before(grammarAccess.getArithmOpsAccess().getGreaterEnumLiteralDeclaration_1()); 
                    // InternalArdsl.g:1269:3: ( '>' )
                    // InternalArdsl.g:1269:4: '>'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getArithmOpsAccess().getGreaterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArdsl.g:1273:2: ( ( '>=' ) )
                    {
                    // InternalArdsl.g:1273:2: ( ( '>=' ) )
                    // InternalArdsl.g:1274:3: ( '>=' )
                    {
                     before(grammarAccess.getArithmOpsAccess().getGreaterEqualEnumLiteralDeclaration_2()); 
                    // InternalArdsl.g:1275:3: ( '>=' )
                    // InternalArdsl.g:1275:4: '>='
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getArithmOpsAccess().getGreaterEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalArdsl.g:1279:2: ( ( '<' ) )
                    {
                    // InternalArdsl.g:1279:2: ( ( '<' ) )
                    // InternalArdsl.g:1280:3: ( '<' )
                    {
                     before(grammarAccess.getArithmOpsAccess().getLowerEnumLiteralDeclaration_3()); 
                    // InternalArdsl.g:1281:3: ( '<' )
                    // InternalArdsl.g:1281:4: '<'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getArithmOpsAccess().getLowerEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalArdsl.g:1285:2: ( ( '<=' ) )
                    {
                    // InternalArdsl.g:1285:2: ( ( '<=' ) )
                    // InternalArdsl.g:1286:3: ( '<=' )
                    {
                     before(grammarAccess.getArithmOpsAccess().getLowerEqualEnumLiteralDeclaration_4()); 
                    // InternalArdsl.g:1287:3: ( '<=' )
                    // InternalArdsl.g:1287:4: '<='
                    {
                    match(input,34,FOLLOW_2); 

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
    // InternalArdsl.g:1295:1: rule__Ontological__Group__0 : rule__Ontological__Group__0__Impl rule__Ontological__Group__1 ;
    public final void rule__Ontological__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1299:1: ( rule__Ontological__Group__0__Impl rule__Ontological__Group__1 )
            // InternalArdsl.g:1300:2: rule__Ontological__Group__0__Impl rule__Ontological__Group__1
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
    // InternalArdsl.g:1307:1: rule__Ontological__Group__0__Impl : ( 'Game' ) ;
    public final void rule__Ontological__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1311:1: ( ( 'Game' ) )
            // InternalArdsl.g:1312:1: ( 'Game' )
            {
            // InternalArdsl.g:1312:1: ( 'Game' )
            // InternalArdsl.g:1313:2: 'Game'
            {
             before(grammarAccess.getOntologicalAccess().getGameKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalArdsl.g:1322:1: rule__Ontological__Group__1 : rule__Ontological__Group__1__Impl rule__Ontological__Group__2 ;
    public final void rule__Ontological__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1326:1: ( rule__Ontological__Group__1__Impl rule__Ontological__Group__2 )
            // InternalArdsl.g:1327:2: rule__Ontological__Group__1__Impl rule__Ontological__Group__2
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
    // InternalArdsl.g:1334:1: rule__Ontological__Group__1__Impl : ( ( rule__Ontological__NameAssignment_1 ) ) ;
    public final void rule__Ontological__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1338:1: ( ( ( rule__Ontological__NameAssignment_1 ) ) )
            // InternalArdsl.g:1339:1: ( ( rule__Ontological__NameAssignment_1 ) )
            {
            // InternalArdsl.g:1339:1: ( ( rule__Ontological__NameAssignment_1 ) )
            // InternalArdsl.g:1340:2: ( rule__Ontological__NameAssignment_1 )
            {
             before(grammarAccess.getOntologicalAccess().getNameAssignment_1()); 
            // InternalArdsl.g:1341:2: ( rule__Ontological__NameAssignment_1 )
            // InternalArdsl.g:1341:3: rule__Ontological__NameAssignment_1
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
    // InternalArdsl.g:1349:1: rule__Ontological__Group__2 : rule__Ontological__Group__2__Impl rule__Ontological__Group__3 ;
    public final void rule__Ontological__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1353:1: ( rule__Ontological__Group__2__Impl rule__Ontological__Group__3 )
            // InternalArdsl.g:1354:2: rule__Ontological__Group__2__Impl rule__Ontological__Group__3
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
    // InternalArdsl.g:1361:1: rule__Ontological__Group__2__Impl : ( '{' ) ;
    public final void rule__Ontological__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1365:1: ( ( '{' ) )
            // InternalArdsl.g:1366:1: ( '{' )
            {
            // InternalArdsl.g:1366:1: ( '{' )
            // InternalArdsl.g:1367:2: '{'
            {
             before(grammarAccess.getOntologicalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalArdsl.g:1376:1: rule__Ontological__Group__3 : rule__Ontological__Group__3__Impl rule__Ontological__Group__4 ;
    public final void rule__Ontological__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1380:1: ( rule__Ontological__Group__3__Impl rule__Ontological__Group__4 )
            // InternalArdsl.g:1381:2: rule__Ontological__Group__3__Impl rule__Ontological__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalArdsl.g:1388:1: rule__Ontological__Group__3__Impl : ( ( rule__Ontological__Group_3__0 )? ) ;
    public final void rule__Ontological__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1392:1: ( ( ( rule__Ontological__Group_3__0 )? ) )
            // InternalArdsl.g:1393:1: ( ( rule__Ontological__Group_3__0 )? )
            {
            // InternalArdsl.g:1393:1: ( ( rule__Ontological__Group_3__0 )? )
            // InternalArdsl.g:1394:2: ( rule__Ontological__Group_3__0 )?
            {
             before(grammarAccess.getOntologicalAccess().getGroup_3()); 
            // InternalArdsl.g:1395:2: ( rule__Ontological__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalArdsl.g:1395:3: rule__Ontological__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ontological__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOntologicalAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalArdsl.g:1403:1: rule__Ontological__Group__4 : rule__Ontological__Group__4__Impl rule__Ontological__Group__5 ;
    public final void rule__Ontological__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1407:1: ( rule__Ontological__Group__4__Impl rule__Ontological__Group__5 )
            // InternalArdsl.g:1408:2: rule__Ontological__Group__4__Impl rule__Ontological__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalArdsl.g:1415:1: rule__Ontological__Group__4__Impl : ( 'elements' ) ;
    public final void rule__Ontological__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1419:1: ( ( 'elements' ) )
            // InternalArdsl.g:1420:1: ( 'elements' )
            {
            // InternalArdsl.g:1420:1: ( 'elements' )
            // InternalArdsl.g:1421:2: 'elements'
            {
             before(grammarAccess.getOntologicalAccess().getElementsKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOntologicalAccess().getElementsKeyword_4()); 

            }


            }

        }
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
    // InternalArdsl.g:1430:1: rule__Ontological__Group__5 : rule__Ontological__Group__5__Impl rule__Ontological__Group__6 ;
    public final void rule__Ontological__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1434:1: ( rule__Ontological__Group__5__Impl rule__Ontological__Group__6 )
            // InternalArdsl.g:1435:2: rule__Ontological__Group__5__Impl rule__Ontological__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalArdsl.g:1442:1: rule__Ontological__Group__5__Impl : ( '{' ) ;
    public final void rule__Ontological__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1446:1: ( ( '{' ) )
            // InternalArdsl.g:1447:1: ( '{' )
            {
            // InternalArdsl.g:1447:1: ( '{' )
            // InternalArdsl.g:1448:2: '{'
            {
             before(grammarAccess.getOntologicalAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOntologicalAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalArdsl.g:1457:1: rule__Ontological__Group__6 : rule__Ontological__Group__6__Impl rule__Ontological__Group__7 ;
    public final void rule__Ontological__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1461:1: ( rule__Ontological__Group__6__Impl rule__Ontological__Group__7 )
            // InternalArdsl.g:1462:2: rule__Ontological__Group__6__Impl rule__Ontological__Group__7
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
    // InternalArdsl.g:1469:1: rule__Ontological__Group__6__Impl : ( ( rule__Ontological__ClassesAssignment_6 ) ) ;
    public final void rule__Ontological__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1473:1: ( ( ( rule__Ontological__ClassesAssignment_6 ) ) )
            // InternalArdsl.g:1474:1: ( ( rule__Ontological__ClassesAssignment_6 ) )
            {
            // InternalArdsl.g:1474:1: ( ( rule__Ontological__ClassesAssignment_6 ) )
            // InternalArdsl.g:1475:2: ( rule__Ontological__ClassesAssignment_6 )
            {
             before(grammarAccess.getOntologicalAccess().getClassesAssignment_6()); 
            // InternalArdsl.g:1476:2: ( rule__Ontological__ClassesAssignment_6 )
            // InternalArdsl.g:1476:3: rule__Ontological__ClassesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Ontological__ClassesAssignment_6();

            state._fsp--;


            }

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
    // InternalArdsl.g:1484:1: rule__Ontological__Group__7 : rule__Ontological__Group__7__Impl rule__Ontological__Group__8 ;
    public final void rule__Ontological__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1488:1: ( rule__Ontological__Group__7__Impl rule__Ontological__Group__8 )
            // InternalArdsl.g:1489:2: rule__Ontological__Group__7__Impl rule__Ontological__Group__8
            {
            pushFollow(FOLLOW_6);
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
    // InternalArdsl.g:1496:1: rule__Ontological__Group__7__Impl : ( ( rule__Ontological__Group_7__0 )* ) ;
    public final void rule__Ontological__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1500:1: ( ( ( rule__Ontological__Group_7__0 )* ) )
            // InternalArdsl.g:1501:1: ( ( rule__Ontological__Group_7__0 )* )
            {
            // InternalArdsl.g:1501:1: ( ( rule__Ontological__Group_7__0 )* )
            // InternalArdsl.g:1502:2: ( rule__Ontological__Group_7__0 )*
            {
             before(grammarAccess.getOntologicalAccess().getGroup_7()); 
            // InternalArdsl.g:1503:2: ( rule__Ontological__Group_7__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==40) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalArdsl.g:1503:3: rule__Ontological__Group_7__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Ontological__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getOntologicalAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalArdsl.g:1511:1: rule__Ontological__Group__8 : rule__Ontological__Group__8__Impl rule__Ontological__Group__9 ;
    public final void rule__Ontological__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1515:1: ( rule__Ontological__Group__8__Impl rule__Ontological__Group__9 )
            // InternalArdsl.g:1516:2: rule__Ontological__Group__8__Impl rule__Ontological__Group__9
            {
            pushFollow(FOLLOW_8);
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
    // InternalArdsl.g:1523:1: rule__Ontological__Group__8__Impl : ( '}' ) ;
    public final void rule__Ontological__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1527:1: ( ( '}' ) )
            // InternalArdsl.g:1528:1: ( '}' )
            {
            // InternalArdsl.g:1528:1: ( '}' )
            // InternalArdsl.g:1529:2: '}'
            {
             before(grammarAccess.getOntologicalAccess().getRightCurlyBracketKeyword_8()); 
            match(input,38,FOLLOW_2); 
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
    // InternalArdsl.g:1538:1: rule__Ontological__Group__9 : rule__Ontological__Group__9__Impl rule__Ontological__Group__10 ;
    public final void rule__Ontological__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1542:1: ( rule__Ontological__Group__9__Impl rule__Ontological__Group__10 )
            // InternalArdsl.g:1543:2: rule__Ontological__Group__9__Impl rule__Ontological__Group__10
            {
            pushFollow(FOLLOW_9);
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
    // InternalArdsl.g:1550:1: rule__Ontological__Group__9__Impl : ( '}' ) ;
    public final void rule__Ontological__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1554:1: ( ( '}' ) )
            // InternalArdsl.g:1555:1: ( '}' )
            {
            // InternalArdsl.g:1555:1: ( '}' )
            // InternalArdsl.g:1556:2: '}'
            {
             before(grammarAccess.getOntologicalAccess().getRightCurlyBracketKeyword_9()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOntologicalAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
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
    // InternalArdsl.g:1565:1: rule__Ontological__Group__10 : rule__Ontological__Group__10__Impl rule__Ontological__Group__11 ;
    public final void rule__Ontological__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1569:1: ( rule__Ontological__Group__10__Impl rule__Ontological__Group__11 )
            // InternalArdsl.g:1570:2: rule__Ontological__Group__10__Impl rule__Ontological__Group__11
            {
            pushFollow(FOLLOW_10);
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
    // InternalArdsl.g:1577:1: rule__Ontological__Group__10__Impl : ( ( rule__Ontological__GraphicAssignment_10 ) ) ;
    public final void rule__Ontological__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1581:1: ( ( ( rule__Ontological__GraphicAssignment_10 ) ) )
            // InternalArdsl.g:1582:1: ( ( rule__Ontological__GraphicAssignment_10 ) )
            {
            // InternalArdsl.g:1582:1: ( ( rule__Ontological__GraphicAssignment_10 ) )
            // InternalArdsl.g:1583:2: ( rule__Ontological__GraphicAssignment_10 )
            {
             before(grammarAccess.getOntologicalAccess().getGraphicAssignment_10()); 
            // InternalArdsl.g:1584:2: ( rule__Ontological__GraphicAssignment_10 )
            // InternalArdsl.g:1584:3: rule__Ontological__GraphicAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Ontological__GraphicAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalAccess().getGraphicAssignment_10()); 

            }


            }

        }
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
    // InternalArdsl.g:1592:1: rule__Ontological__Group__11 : rule__Ontological__Group__11__Impl rule__Ontological__Group__12 ;
    public final void rule__Ontological__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1596:1: ( rule__Ontological__Group__11__Impl rule__Ontological__Group__12 )
            // InternalArdsl.g:1597:2: rule__Ontological__Group__11__Impl rule__Ontological__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__Ontological__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ontological__Group__12();

            state._fsp--;


            }

        }
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
    // InternalArdsl.g:1604:1: rule__Ontological__Group__11__Impl : ( ( rule__Ontological__PhysicAssignment_11 ) ) ;
    public final void rule__Ontological__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1608:1: ( ( ( rule__Ontological__PhysicAssignment_11 ) ) )
            // InternalArdsl.g:1609:1: ( ( rule__Ontological__PhysicAssignment_11 ) )
            {
            // InternalArdsl.g:1609:1: ( ( rule__Ontological__PhysicAssignment_11 ) )
            // InternalArdsl.g:1610:2: ( rule__Ontological__PhysicAssignment_11 )
            {
             before(grammarAccess.getOntologicalAccess().getPhysicAssignment_11()); 
            // InternalArdsl.g:1611:2: ( rule__Ontological__PhysicAssignment_11 )
            // InternalArdsl.g:1611:3: rule__Ontological__PhysicAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Ontological__PhysicAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalAccess().getPhysicAssignment_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__Ontological__Group__12"
    // InternalArdsl.g:1619:1: rule__Ontological__Group__12 : rule__Ontological__Group__12__Impl ;
    public final void rule__Ontological__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1623:1: ( rule__Ontological__Group__12__Impl )
            // InternalArdsl.g:1624:2: rule__Ontological__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ontological__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ontological__Group__12"


    // $ANTLR start "rule__Ontological__Group__12__Impl"
    // InternalArdsl.g:1630:1: rule__Ontological__Group__12__Impl : ( ( rule__Ontological__GameloopAssignment_12 ) ) ;
    public final void rule__Ontological__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1634:1: ( ( ( rule__Ontological__GameloopAssignment_12 ) ) )
            // InternalArdsl.g:1635:1: ( ( rule__Ontological__GameloopAssignment_12 ) )
            {
            // InternalArdsl.g:1635:1: ( ( rule__Ontological__GameloopAssignment_12 ) )
            // InternalArdsl.g:1636:2: ( rule__Ontological__GameloopAssignment_12 )
            {
             before(grammarAccess.getOntologicalAccess().getGameloopAssignment_12()); 
            // InternalArdsl.g:1637:2: ( rule__Ontological__GameloopAssignment_12 )
            // InternalArdsl.g:1637:3: rule__Ontological__GameloopAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Ontological__GameloopAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalAccess().getGameloopAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ontological__Group__12__Impl"


    // $ANTLR start "rule__Ontological__Group_3__0"
    // InternalArdsl.g:1646:1: rule__Ontological__Group_3__0 : rule__Ontological__Group_3__0__Impl rule__Ontological__Group_3__1 ;
    public final void rule__Ontological__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1650:1: ( rule__Ontological__Group_3__0__Impl rule__Ontological__Group_3__1 )
            // InternalArdsl.g:1651:2: rule__Ontological__Group_3__0__Impl rule__Ontological__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Ontological__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ontological__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ontological__Group_3__0"


    // $ANTLR start "rule__Ontological__Group_3__0__Impl"
    // InternalArdsl.g:1658:1: rule__Ontological__Group_3__0__Impl : ( 'URI' ) ;
    public final void rule__Ontological__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1662:1: ( ( 'URI' ) )
            // InternalArdsl.g:1663:1: ( 'URI' )
            {
            // InternalArdsl.g:1663:1: ( 'URI' )
            // InternalArdsl.g:1664:2: 'URI'
            {
             before(grammarAccess.getOntologicalAccess().getURIKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOntologicalAccess().getURIKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ontological__Group_3__0__Impl"


    // $ANTLR start "rule__Ontological__Group_3__1"
    // InternalArdsl.g:1673:1: rule__Ontological__Group_3__1 : rule__Ontological__Group_3__1__Impl ;
    public final void rule__Ontological__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1677:1: ( rule__Ontological__Group_3__1__Impl )
            // InternalArdsl.g:1678:2: rule__Ontological__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ontological__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ontological__Group_3__1"


    // $ANTLR start "rule__Ontological__Group_3__1__Impl"
    // InternalArdsl.g:1684:1: rule__Ontological__Group_3__1__Impl : ( ( rule__Ontological__URIAssignment_3_1 ) ) ;
    public final void rule__Ontological__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1688:1: ( ( ( rule__Ontological__URIAssignment_3_1 ) ) )
            // InternalArdsl.g:1689:1: ( ( rule__Ontological__URIAssignment_3_1 ) )
            {
            // InternalArdsl.g:1689:1: ( ( rule__Ontological__URIAssignment_3_1 ) )
            // InternalArdsl.g:1690:2: ( rule__Ontological__URIAssignment_3_1 )
            {
             before(grammarAccess.getOntologicalAccess().getURIAssignment_3_1()); 
            // InternalArdsl.g:1691:2: ( rule__Ontological__URIAssignment_3_1 )
            // InternalArdsl.g:1691:3: rule__Ontological__URIAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Ontological__URIAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalAccess().getURIAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ontological__Group_3__1__Impl"


    // $ANTLR start "rule__Ontological__Group_7__0"
    // InternalArdsl.g:1700:1: rule__Ontological__Group_7__0 : rule__Ontological__Group_7__0__Impl rule__Ontological__Group_7__1 ;
    public final void rule__Ontological__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1704:1: ( rule__Ontological__Group_7__0__Impl rule__Ontological__Group_7__1 )
            // InternalArdsl.g:1705:2: rule__Ontological__Group_7__0__Impl rule__Ontological__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Ontological__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ontological__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ontological__Group_7__0"


    // $ANTLR start "rule__Ontological__Group_7__0__Impl"
    // InternalArdsl.g:1712:1: rule__Ontological__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Ontological__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1716:1: ( ( ',' ) )
            // InternalArdsl.g:1717:1: ( ',' )
            {
            // InternalArdsl.g:1717:1: ( ',' )
            // InternalArdsl.g:1718:2: ','
            {
             before(grammarAccess.getOntologicalAccess().getCommaKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOntologicalAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ontological__Group_7__0__Impl"


    // $ANTLR start "rule__Ontological__Group_7__1"
    // InternalArdsl.g:1727:1: rule__Ontological__Group_7__1 : rule__Ontological__Group_7__1__Impl ;
    public final void rule__Ontological__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1731:1: ( rule__Ontological__Group_7__1__Impl )
            // InternalArdsl.g:1732:2: rule__Ontological__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ontological__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ontological__Group_7__1"


    // $ANTLR start "rule__Ontological__Group_7__1__Impl"
    // InternalArdsl.g:1738:1: rule__Ontological__Group_7__1__Impl : ( ( rule__Ontological__ClassesAssignment_7_1 ) ) ;
    public final void rule__Ontological__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1742:1: ( ( ( rule__Ontological__ClassesAssignment_7_1 ) ) )
            // InternalArdsl.g:1743:1: ( ( rule__Ontological__ClassesAssignment_7_1 ) )
            {
            // InternalArdsl.g:1743:1: ( ( rule__Ontological__ClassesAssignment_7_1 ) )
            // InternalArdsl.g:1744:2: ( rule__Ontological__ClassesAssignment_7_1 )
            {
             before(grammarAccess.getOntologicalAccess().getClassesAssignment_7_1()); 
            // InternalArdsl.g:1745:2: ( rule__Ontological__ClassesAssignment_7_1 )
            // InternalArdsl.g:1745:3: rule__Ontological__ClassesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Ontological__ClassesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getOntologicalAccess().getClassesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ontological__Group_7__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalArdsl.g:1754:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1758:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalArdsl.g:1759:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalArdsl.g:1766:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1770:1: ( ( ( '-' )? ) )
            // InternalArdsl.g:1771:1: ( ( '-' )? )
            {
            // InternalArdsl.g:1771:1: ( ( '-' )? )
            // InternalArdsl.g:1772:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalArdsl.g:1773:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalArdsl.g:1773:3: '-'
                    {
                    match(input,41,FOLLOW_2); 

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
    // InternalArdsl.g:1781:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1785:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalArdsl.g:1786:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalArdsl.g:1793:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1797:1: ( ( ( RULE_INT )? ) )
            // InternalArdsl.g:1798:1: ( ( RULE_INT )? )
            {
            // InternalArdsl.g:1798:1: ( ( RULE_INT )? )
            // InternalArdsl.g:1799:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalArdsl.g:1800:2: ( RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalArdsl.g:1800:3: RULE_INT
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
    // InternalArdsl.g:1808:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1812:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalArdsl.g:1813:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalArdsl.g:1820:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1824:1: ( ( '.' ) )
            // InternalArdsl.g:1825:1: ( '.' )
            {
            // InternalArdsl.g:1825:1: ( '.' )
            // InternalArdsl.g:1826:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalArdsl.g:1835:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1839:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalArdsl.g:1840:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalArdsl.g:1847:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1851:1: ( ( RULE_INT ) )
            // InternalArdsl.g:1852:1: ( RULE_INT )
            {
            // InternalArdsl.g:1852:1: ( RULE_INT )
            // InternalArdsl.g:1853:2: RULE_INT
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
    // InternalArdsl.g:1862:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1866:1: ( rule__EDouble__Group__4__Impl )
            // InternalArdsl.g:1867:2: rule__EDouble__Group__4__Impl
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
    // InternalArdsl.g:1873:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1877:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalArdsl.g:1878:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalArdsl.g:1878:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalArdsl.g:1879:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalArdsl.g:1880:2: ( rule__EDouble__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=11 && LA17_0<=12)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalArdsl.g:1880:3: rule__EDouble__Group_4__0
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
    // InternalArdsl.g:1889:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1893:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalArdsl.g:1894:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalArdsl.g:1901:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1905:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalArdsl.g:1906:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalArdsl.g:1906:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalArdsl.g:1907:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalArdsl.g:1908:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalArdsl.g:1908:3: rule__EDouble__Alternatives_4_0
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
    // InternalArdsl.g:1916:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1920:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalArdsl.g:1921:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalArdsl.g:1928:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1932:1: ( ( ( '-' )? ) )
            // InternalArdsl.g:1933:1: ( ( '-' )? )
            {
            // InternalArdsl.g:1933:1: ( ( '-' )? )
            // InternalArdsl.g:1934:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalArdsl.g:1935:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalArdsl.g:1935:3: '-'
                    {
                    match(input,41,FOLLOW_2); 

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
    // InternalArdsl.g:1943:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1947:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalArdsl.g:1948:2: rule__EDouble__Group_4__2__Impl
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
    // InternalArdsl.g:1954:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1958:1: ( ( RULE_INT ) )
            // InternalArdsl.g:1959:1: ( RULE_INT )
            {
            // InternalArdsl.g:1959:1: ( RULE_INT )
            // InternalArdsl.g:1960:2: RULE_INT
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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalArdsl.g:1970:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1974:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalArdsl.g:1975:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalArdsl.g:1982:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1986:1: ( ( ( '-' )? ) )
            // InternalArdsl.g:1987:1: ( ( '-' )? )
            {
            // InternalArdsl.g:1987:1: ( ( '-' )? )
            // InternalArdsl.g:1988:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalArdsl.g:1989:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalArdsl.g:1989:3: '-'
                    {
                    match(input,41,FOLLOW_2); 

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
    // InternalArdsl.g:1997:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2001:1: ( rule__EInt__Group__1__Impl )
            // InternalArdsl.g:2002:2: rule__EInt__Group__1__Impl
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
    // InternalArdsl.g:2008:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2012:1: ( ( RULE_INT ) )
            // InternalArdsl.g:2013:1: ( RULE_INT )
            {
            // InternalArdsl.g:2013:1: ( RULE_INT )
            // InternalArdsl.g:2014:2: RULE_INT
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


    // $ANTLR start "rule__Class__Group__0"
    // InternalArdsl.g:2024:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2028:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalArdsl.g:2029:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalArdsl.g:2036:1: rule__Class__Group__0__Impl : ( ( rule__Class__NameAssignment_0 ) ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2040:1: ( ( ( rule__Class__NameAssignment_0 ) ) )
            // InternalArdsl.g:2041:1: ( ( rule__Class__NameAssignment_0 ) )
            {
            // InternalArdsl.g:2041:1: ( ( rule__Class__NameAssignment_0 ) )
            // InternalArdsl.g:2042:2: ( rule__Class__NameAssignment_0 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_0()); 
            // InternalArdsl.g:2043:2: ( rule__Class__NameAssignment_0 )
            // InternalArdsl.g:2043:3: rule__Class__NameAssignment_0
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
    // InternalArdsl.g:2051:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2055:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalArdsl.g:2056:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalArdsl.g:2063:1: rule__Class__Group__1__Impl : ( '{' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2067:1: ( ( '{' ) )
            // InternalArdsl.g:2068:1: ( '{' )
            {
            // InternalArdsl.g:2068:1: ( '{' )
            // InternalArdsl.g:2069:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalArdsl.g:2078:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2082:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalArdsl.g:2083:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalArdsl.g:2090:1: rule__Class__Group__2__Impl : ( ( rule__Class__Group_2__0 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2094:1: ( ( ( rule__Class__Group_2__0 )? ) )
            // InternalArdsl.g:2095:1: ( ( rule__Class__Group_2__0 )? )
            {
            // InternalArdsl.g:2095:1: ( ( rule__Class__Group_2__0 )? )
            // InternalArdsl.g:2096:2: ( rule__Class__Group_2__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_2()); 
            // InternalArdsl.g:2097:2: ( rule__Class__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalArdsl.g:2097:3: rule__Class__Group_2__0
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
    // InternalArdsl.g:2105:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2109:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalArdsl.g:2110:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalArdsl.g:2117:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2121:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalArdsl.g:2122:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalArdsl.g:2122:1: ( ( rule__Class__Group_3__0 )? )
            // InternalArdsl.g:2123:2: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalArdsl.g:2124:2: ( rule__Class__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalArdsl.g:2124:3: rule__Class__Group_3__0
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
    // InternalArdsl.g:2132:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2136:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalArdsl.g:2137:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalArdsl.g:2144:1: rule__Class__Group__4__Impl : ( '}' ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2148:1: ( ( '}' ) )
            // InternalArdsl.g:2149:1: ( '}' )
            {
            // InternalArdsl.g:2149:1: ( '}' )
            // InternalArdsl.g:2150:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalArdsl.g:2159:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2163:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalArdsl.g:2164:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalArdsl.g:2171:1: rule__Class__Group__5__Impl : ( ( rule__Class__AbstractAssignment_5 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2175:1: ( ( ( rule__Class__AbstractAssignment_5 )? ) )
            // InternalArdsl.g:2176:1: ( ( rule__Class__AbstractAssignment_5 )? )
            {
            // InternalArdsl.g:2176:1: ( ( rule__Class__AbstractAssignment_5 )? )
            // InternalArdsl.g:2177:2: ( rule__Class__AbstractAssignment_5 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_5()); 
            // InternalArdsl.g:2178:2: ( rule__Class__AbstractAssignment_5 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==107) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalArdsl.g:2178:3: rule__Class__AbstractAssignment_5
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
    // InternalArdsl.g:2186:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2190:1: ( rule__Class__Group__6__Impl )
            // InternalArdsl.g:2191:2: rule__Class__Group__6__Impl
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
    // InternalArdsl.g:2197:1: rule__Class__Group__6__Impl : ( ( rule__Class__NoSCNAssignment_6 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2201:1: ( ( ( rule__Class__NoSCNAssignment_6 )? ) )
            // InternalArdsl.g:2202:1: ( ( rule__Class__NoSCNAssignment_6 )? )
            {
            // InternalArdsl.g:2202:1: ( ( rule__Class__NoSCNAssignment_6 )? )
            // InternalArdsl.g:2203:2: ( rule__Class__NoSCNAssignment_6 )?
            {
             before(grammarAccess.getClassAccess().getNoSCNAssignment_6()); 
            // InternalArdsl.g:2204:2: ( rule__Class__NoSCNAssignment_6 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==108) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalArdsl.g:2204:3: rule__Class__NoSCNAssignment_6
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
    // InternalArdsl.g:2213:1: rule__Class__Group_2__0 : rule__Class__Group_2__0__Impl rule__Class__Group_2__1 ;
    public final void rule__Class__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2217:1: ( rule__Class__Group_2__0__Impl rule__Class__Group_2__1 )
            // InternalArdsl.g:2218:2: rule__Class__Group_2__0__Impl rule__Class__Group_2__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalArdsl.g:2225:1: rule__Class__Group_2__0__Impl : ( ( rule__Class__AttributesAssignment_2_0 ) ) ;
    public final void rule__Class__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2229:1: ( ( ( rule__Class__AttributesAssignment_2_0 ) ) )
            // InternalArdsl.g:2230:1: ( ( rule__Class__AttributesAssignment_2_0 ) )
            {
            // InternalArdsl.g:2230:1: ( ( rule__Class__AttributesAssignment_2_0 ) )
            // InternalArdsl.g:2231:2: ( rule__Class__AttributesAssignment_2_0 )
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_2_0()); 
            // InternalArdsl.g:2232:2: ( rule__Class__AttributesAssignment_2_0 )
            // InternalArdsl.g:2232:3: rule__Class__AttributesAssignment_2_0
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
    // InternalArdsl.g:2240:1: rule__Class__Group_2__1 : rule__Class__Group_2__1__Impl ;
    public final void rule__Class__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2244:1: ( rule__Class__Group_2__1__Impl )
            // InternalArdsl.g:2245:2: rule__Class__Group_2__1__Impl
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
    // InternalArdsl.g:2251:1: rule__Class__Group_2__1__Impl : ( ( rule__Class__Group_2_1__0 )* ) ;
    public final void rule__Class__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2255:1: ( ( ( rule__Class__Group_2_1__0 )* ) )
            // InternalArdsl.g:2256:1: ( ( rule__Class__Group_2_1__0 )* )
            {
            // InternalArdsl.g:2256:1: ( ( rule__Class__Group_2_1__0 )* )
            // InternalArdsl.g:2257:2: ( rule__Class__Group_2_1__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_2_1()); 
            // InternalArdsl.g:2258:2: ( rule__Class__Group_2_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==40) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalArdsl.g:2258:3: rule__Class__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Class__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Class__Group_2_1__0"
    // InternalArdsl.g:2267:1: rule__Class__Group_2_1__0 : rule__Class__Group_2_1__0__Impl rule__Class__Group_2_1__1 ;
    public final void rule__Class__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2271:1: ( rule__Class__Group_2_1__0__Impl rule__Class__Group_2_1__1 )
            // InternalArdsl.g:2272:2: rule__Class__Group_2_1__0__Impl rule__Class__Group_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2_1__0"


    // $ANTLR start "rule__Class__Group_2_1__0__Impl"
    // InternalArdsl.g:2279:1: rule__Class__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2283:1: ( ( ',' ) )
            // InternalArdsl.g:2284:1: ( ',' )
            {
            // InternalArdsl.g:2284:1: ( ',' )
            // InternalArdsl.g:2285:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_2_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2_1__0__Impl"


    // $ANTLR start "rule__Class__Group_2_1__1"
    // InternalArdsl.g:2294:1: rule__Class__Group_2_1__1 : rule__Class__Group_2_1__1__Impl ;
    public final void rule__Class__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2298:1: ( rule__Class__Group_2_1__1__Impl )
            // InternalArdsl.g:2299:2: rule__Class__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2_1__1"


    // $ANTLR start "rule__Class__Group_2_1__1__Impl"
    // InternalArdsl.g:2305:1: rule__Class__Group_2_1__1__Impl : ( ( rule__Class__AttributesAssignment_2_1_1 ) ) ;
    public final void rule__Class__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2309:1: ( ( ( rule__Class__AttributesAssignment_2_1_1 ) ) )
            // InternalArdsl.g:2310:1: ( ( rule__Class__AttributesAssignment_2_1_1 ) )
            {
            // InternalArdsl.g:2310:1: ( ( rule__Class__AttributesAssignment_2_1_1 ) )
            // InternalArdsl.g:2311:2: ( rule__Class__AttributesAssignment_2_1_1 )
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_2_1_1()); 
            // InternalArdsl.g:2312:2: ( rule__Class__AttributesAssignment_2_1_1 )
            // InternalArdsl.g:2312:3: rule__Class__AttributesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__AttributesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAttributesAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2_1__1__Impl"


    // $ANTLR start "rule__Class__Group_3__0"
    // InternalArdsl.g:2321:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2325:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalArdsl.g:2326:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
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
    // InternalArdsl.g:2333:1: rule__Class__Group_3__0__Impl : ( 'dependences' ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2337:1: ( ( 'dependences' ) )
            // InternalArdsl.g:2338:1: ( 'dependences' )
            {
            // InternalArdsl.g:2338:1: ( 'dependences' )
            // InternalArdsl.g:2339:2: 'dependences'
            {
             before(grammarAccess.getClassAccess().getDependencesKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalArdsl.g:2348:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl rule__Class__Group_3__2 ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2352:1: ( rule__Class__Group_3__1__Impl rule__Class__Group_3__2 )
            // InternalArdsl.g:2353:2: rule__Class__Group_3__1__Impl rule__Class__Group_3__2
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
    // InternalArdsl.g:2360:1: rule__Class__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2364:1: ( ( '{' ) )
            // InternalArdsl.g:2365:1: ( '{' )
            {
            // InternalArdsl.g:2365:1: ( '{' )
            // InternalArdsl.g:2366:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalArdsl.g:2375:1: rule__Class__Group_3__2 : rule__Class__Group_3__2__Impl rule__Class__Group_3__3 ;
    public final void rule__Class__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2379:1: ( rule__Class__Group_3__2__Impl rule__Class__Group_3__3 )
            // InternalArdsl.g:2380:2: rule__Class__Group_3__2__Impl rule__Class__Group_3__3
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
    // InternalArdsl.g:2387:1: rule__Class__Group_3__2__Impl : ( ( rule__Class__ReferencesAssignment_3_2 ) ) ;
    public final void rule__Class__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2391:1: ( ( ( rule__Class__ReferencesAssignment_3_2 ) ) )
            // InternalArdsl.g:2392:1: ( ( rule__Class__ReferencesAssignment_3_2 ) )
            {
            // InternalArdsl.g:2392:1: ( ( rule__Class__ReferencesAssignment_3_2 ) )
            // InternalArdsl.g:2393:2: ( rule__Class__ReferencesAssignment_3_2 )
            {
             before(grammarAccess.getClassAccess().getReferencesAssignment_3_2()); 
            // InternalArdsl.g:2394:2: ( rule__Class__ReferencesAssignment_3_2 )
            // InternalArdsl.g:2394:3: rule__Class__ReferencesAssignment_3_2
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
    // InternalArdsl.g:2402:1: rule__Class__Group_3__3 : rule__Class__Group_3__3__Impl rule__Class__Group_3__4 ;
    public final void rule__Class__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2406:1: ( rule__Class__Group_3__3__Impl rule__Class__Group_3__4 )
            // InternalArdsl.g:2407:2: rule__Class__Group_3__3__Impl rule__Class__Group_3__4
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
    // InternalArdsl.g:2414:1: rule__Class__Group_3__3__Impl : ( ( rule__Class__Group_3_3__0 )* ) ;
    public final void rule__Class__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2418:1: ( ( ( rule__Class__Group_3_3__0 )* ) )
            // InternalArdsl.g:2419:1: ( ( rule__Class__Group_3_3__0 )* )
            {
            // InternalArdsl.g:2419:1: ( ( rule__Class__Group_3_3__0 )* )
            // InternalArdsl.g:2420:2: ( rule__Class__Group_3_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_3_3()); 
            // InternalArdsl.g:2421:2: ( rule__Class__Group_3_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==40) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalArdsl.g:2421:3: rule__Class__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Class__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_3_3()); 

            }


            }

        }
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
    // InternalArdsl.g:2429:1: rule__Class__Group_3__4 : rule__Class__Group_3__4__Impl ;
    public final void rule__Class__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2433:1: ( rule__Class__Group_3__4__Impl )
            // InternalArdsl.g:2434:2: rule__Class__Group_3__4__Impl
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
    // InternalArdsl.g:2440:1: rule__Class__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2444:1: ( ( '}' ) )
            // InternalArdsl.g:2445:1: ( '}' )
            {
            // InternalArdsl.g:2445:1: ( '}' )
            // InternalArdsl.g:2446:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__Class__Group_3_3__0"
    // InternalArdsl.g:2456:1: rule__Class__Group_3_3__0 : rule__Class__Group_3_3__0__Impl rule__Class__Group_3_3__1 ;
    public final void rule__Class__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2460:1: ( rule__Class__Group_3_3__0__Impl rule__Class__Group_3_3__1 )
            // InternalArdsl.g:2461:2: rule__Class__Group_3_3__0__Impl rule__Class__Group_3_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_3__0"


    // $ANTLR start "rule__Class__Group_3_3__0__Impl"
    // InternalArdsl.g:2468:1: rule__Class__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2472:1: ( ( ',' ) )
            // InternalArdsl.g:2473:1: ( ',' )
            {
            // InternalArdsl.g:2473:1: ( ',' )
            // InternalArdsl.g:2474:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_3_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_3__0__Impl"


    // $ANTLR start "rule__Class__Group_3_3__1"
    // InternalArdsl.g:2483:1: rule__Class__Group_3_3__1 : rule__Class__Group_3_3__1__Impl ;
    public final void rule__Class__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2487:1: ( rule__Class__Group_3_3__1__Impl )
            // InternalArdsl.g:2488:2: rule__Class__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_3__1"


    // $ANTLR start "rule__Class__Group_3_3__1__Impl"
    // InternalArdsl.g:2494:1: rule__Class__Group_3_3__1__Impl : ( ( rule__Class__ReferencesAssignment_3_3_1 ) ) ;
    public final void rule__Class__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2498:1: ( ( ( rule__Class__ReferencesAssignment_3_3_1 ) ) )
            // InternalArdsl.g:2499:1: ( ( rule__Class__ReferencesAssignment_3_3_1 ) )
            {
            // InternalArdsl.g:2499:1: ( ( rule__Class__ReferencesAssignment_3_3_1 ) )
            // InternalArdsl.g:2500:2: ( rule__Class__ReferencesAssignment_3_3_1 )
            {
             before(grammarAccess.getClassAccess().getReferencesAssignment_3_3_1()); 
            // InternalArdsl.g:2501:2: ( rule__Class__ReferencesAssignment_3_3_1 )
            // InternalArdsl.g:2501:3: rule__Class__ReferencesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__ReferencesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getReferencesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_3__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalArdsl.g:2510:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2514:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalArdsl.g:2515:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalArdsl.g:2522:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2526:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalArdsl.g:2527:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalArdsl.g:2527:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalArdsl.g:2528:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalArdsl.g:2529:2: ( rule__Attribute__NameAssignment_0 )
            // InternalArdsl.g:2529:3: rule__Attribute__NameAssignment_0
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
    // InternalArdsl.g:2537:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2541:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalArdsl.g:2542:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalArdsl.g:2549:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2553:1: ( ( ':' ) )
            // InternalArdsl.g:2554:1: ( ':' )
            {
            // InternalArdsl.g:2554:1: ( ':' )
            // InternalArdsl.g:2555:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalArdsl.g:2564:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2568:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalArdsl.g:2569:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalArdsl.g:2576:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2580:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalArdsl.g:2581:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalArdsl.g:2581:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalArdsl.g:2582:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalArdsl.g:2583:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalArdsl.g:2583:3: rule__Attribute__TypeAssignment_2
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
    // InternalArdsl.g:2591:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2595:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalArdsl.g:2596:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalArdsl.g:2603:1: rule__Attribute__Group__3__Impl : ( '[' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2607:1: ( ( '[' ) )
            // InternalArdsl.g:2608:1: ( '[' )
            {
            // InternalArdsl.g:2608:1: ( '[' )
            // InternalArdsl.g:2609:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalArdsl.g:2618:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2622:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalArdsl.g:2623:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalArdsl.g:2630:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__MinAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2634:1: ( ( ( rule__Attribute__MinAssignment_4 ) ) )
            // InternalArdsl.g:2635:1: ( ( rule__Attribute__MinAssignment_4 ) )
            {
            // InternalArdsl.g:2635:1: ( ( rule__Attribute__MinAssignment_4 ) )
            // InternalArdsl.g:2636:2: ( rule__Attribute__MinAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getMinAssignment_4()); 
            // InternalArdsl.g:2637:2: ( rule__Attribute__MinAssignment_4 )
            // InternalArdsl.g:2637:3: rule__Attribute__MinAssignment_4
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
    // InternalArdsl.g:2645:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2649:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalArdsl.g:2650:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalArdsl.g:2657:1: rule__Attribute__Group__5__Impl : ( ',' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2661:1: ( ( ',' ) )
            // InternalArdsl.g:2662:1: ( ',' )
            {
            // InternalArdsl.g:2662:1: ( ',' )
            // InternalArdsl.g:2663:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_5()); 

            }


            }

        }
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
    // InternalArdsl.g:2672:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2676:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalArdsl.g:2677:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalArdsl.g:2684:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__MaxAssignment_6 ) ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2688:1: ( ( ( rule__Attribute__MaxAssignment_6 ) ) )
            // InternalArdsl.g:2689:1: ( ( rule__Attribute__MaxAssignment_6 ) )
            {
            // InternalArdsl.g:2689:1: ( ( rule__Attribute__MaxAssignment_6 ) )
            // InternalArdsl.g:2690:2: ( rule__Attribute__MaxAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getMaxAssignment_6()); 
            // InternalArdsl.g:2691:2: ( rule__Attribute__MaxAssignment_6 )
            // InternalArdsl.g:2691:3: rule__Attribute__MaxAssignment_6
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
    // InternalArdsl.g:2699:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2703:1: ( rule__Attribute__Group__7__Impl rule__Attribute__Group__8 )
            // InternalArdsl.g:2704:2: rule__Attribute__Group__7__Impl rule__Attribute__Group__8
            {
            pushFollow(FOLLOW_22);
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
    // InternalArdsl.g:2711:1: rule__Attribute__Group__7__Impl : ( ']' ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2715:1: ( ( ']' ) )
            // InternalArdsl.g:2716:1: ( ']' )
            {
            // InternalArdsl.g:2716:1: ( ']' )
            // InternalArdsl.g:2717:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_7()); 
            match(input,46,FOLLOW_2); 
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
    // InternalArdsl.g:2726:1: rule__Attribute__Group__8 : rule__Attribute__Group__8__Impl rule__Attribute__Group__9 ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2730:1: ( rule__Attribute__Group__8__Impl rule__Attribute__Group__9 )
            // InternalArdsl.g:2731:2: rule__Attribute__Group__8__Impl rule__Attribute__Group__9
            {
            pushFollow(FOLLOW_3);
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
    // InternalArdsl.g:2738:1: rule__Attribute__Group__8__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2742:1: ( ( '=' ) )
            // InternalArdsl.g:2743:1: ( '=' )
            {
            // InternalArdsl.g:2743:1: ( '=' )
            // InternalArdsl.g:2744:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_8()); 
            match(input,30,FOLLOW_2); 
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
    // InternalArdsl.g:2753:1: rule__Attribute__Group__9 : rule__Attribute__Group__9__Impl rule__Attribute__Group__10 ;
    public final void rule__Attribute__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2757:1: ( rule__Attribute__Group__9__Impl rule__Attribute__Group__10 )
            // InternalArdsl.g:2758:2: rule__Attribute__Group__9__Impl rule__Attribute__Group__10
            {
            pushFollow(FOLLOW_23);
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
    // InternalArdsl.g:2765:1: rule__Attribute__Group__9__Impl : ( ( rule__Attribute__DefaultAssignment_9 ) ) ;
    public final void rule__Attribute__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2769:1: ( ( ( rule__Attribute__DefaultAssignment_9 ) ) )
            // InternalArdsl.g:2770:1: ( ( rule__Attribute__DefaultAssignment_9 ) )
            {
            // InternalArdsl.g:2770:1: ( ( rule__Attribute__DefaultAssignment_9 ) )
            // InternalArdsl.g:2771:2: ( rule__Attribute__DefaultAssignment_9 )
            {
             before(grammarAccess.getAttributeAccess().getDefaultAssignment_9()); 
            // InternalArdsl.g:2772:2: ( rule__Attribute__DefaultAssignment_9 )
            // InternalArdsl.g:2772:3: rule__Attribute__DefaultAssignment_9
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
    // InternalArdsl.g:2780:1: rule__Attribute__Group__10 : rule__Attribute__Group__10__Impl rule__Attribute__Group__11 ;
    public final void rule__Attribute__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2784:1: ( rule__Attribute__Group__10__Impl rule__Attribute__Group__11 )
            // InternalArdsl.g:2785:2: rule__Attribute__Group__10__Impl rule__Attribute__Group__11
            {
            pushFollow(FOLLOW_23);
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
    // InternalArdsl.g:2792:1: rule__Attribute__Group__10__Impl : ( ( rule__Attribute__IsParamAssignment_10 )? ) ;
    public final void rule__Attribute__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2796:1: ( ( ( rule__Attribute__IsParamAssignment_10 )? ) )
            // InternalArdsl.g:2797:1: ( ( rule__Attribute__IsParamAssignment_10 )? )
            {
            // InternalArdsl.g:2797:1: ( ( rule__Attribute__IsParamAssignment_10 )? )
            // InternalArdsl.g:2798:2: ( rule__Attribute__IsParamAssignment_10 )?
            {
             before(grammarAccess.getAttributeAccess().getIsParamAssignment_10()); 
            // InternalArdsl.g:2799:2: ( rule__Attribute__IsParamAssignment_10 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==109) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalArdsl.g:2799:3: rule__Attribute__IsParamAssignment_10
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
    // InternalArdsl.g:2807:1: rule__Attribute__Group__11 : rule__Attribute__Group__11__Impl rule__Attribute__Group__12 ;
    public final void rule__Attribute__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2811:1: ( rule__Attribute__Group__11__Impl rule__Attribute__Group__12 )
            // InternalArdsl.g:2812:2: rule__Attribute__Group__11__Impl rule__Attribute__Group__12
            {
            pushFollow(FOLLOW_23);
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
    // InternalArdsl.g:2819:1: rule__Attribute__Group__11__Impl : ( ( rule__Attribute__IsKeyAssignment_11 )? ) ;
    public final void rule__Attribute__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2823:1: ( ( ( rule__Attribute__IsKeyAssignment_11 )? ) )
            // InternalArdsl.g:2824:1: ( ( rule__Attribute__IsKeyAssignment_11 )? )
            {
            // InternalArdsl.g:2824:1: ( ( rule__Attribute__IsKeyAssignment_11 )? )
            // InternalArdsl.g:2825:2: ( rule__Attribute__IsKeyAssignment_11 )?
            {
             before(grammarAccess.getAttributeAccess().getIsKeyAssignment_11()); 
            // InternalArdsl.g:2826:2: ( rule__Attribute__IsKeyAssignment_11 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==110) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalArdsl.g:2826:3: rule__Attribute__IsKeyAssignment_11
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
    // InternalArdsl.g:2834:1: rule__Attribute__Group__12 : rule__Attribute__Group__12__Impl ;
    public final void rule__Attribute__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2838:1: ( rule__Attribute__Group__12__Impl )
            // InternalArdsl.g:2839:2: rule__Attribute__Group__12__Impl
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
    // InternalArdsl.g:2845:1: rule__Attribute__Group__12__Impl : ( ( rule__Attribute__ReadOnlyAssignment_12 )? ) ;
    public final void rule__Attribute__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2849:1: ( ( ( rule__Attribute__ReadOnlyAssignment_12 )? ) )
            // InternalArdsl.g:2850:1: ( ( rule__Attribute__ReadOnlyAssignment_12 )? )
            {
            // InternalArdsl.g:2850:1: ( ( rule__Attribute__ReadOnlyAssignment_12 )? )
            // InternalArdsl.g:2851:2: ( rule__Attribute__ReadOnlyAssignment_12 )?
            {
             before(grammarAccess.getAttributeAccess().getReadOnlyAssignment_12()); 
            // InternalArdsl.g:2852:2: ( rule__Attribute__ReadOnlyAssignment_12 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==111) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalArdsl.g:2852:3: rule__Attribute__ReadOnlyAssignment_12
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
    // InternalArdsl.g:2861:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2865:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalArdsl.g:2866:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalArdsl.g:2873:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__NameAssignment_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2877:1: ( ( ( rule__Reference__NameAssignment_0 ) ) )
            // InternalArdsl.g:2878:1: ( ( rule__Reference__NameAssignment_0 ) )
            {
            // InternalArdsl.g:2878:1: ( ( rule__Reference__NameAssignment_0 ) )
            // InternalArdsl.g:2879:2: ( rule__Reference__NameAssignment_0 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_0()); 
            // InternalArdsl.g:2880:2: ( rule__Reference__NameAssignment_0 )
            // InternalArdsl.g:2880:3: rule__Reference__NameAssignment_0
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
    // InternalArdsl.g:2888:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2892:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalArdsl.g:2893:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalArdsl.g:2900:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__Group_1__0 )? ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2904:1: ( ( ( rule__Reference__Group_1__0 )? ) )
            // InternalArdsl.g:2905:1: ( ( rule__Reference__Group_1__0 )? )
            {
            // InternalArdsl.g:2905:1: ( ( rule__Reference__Group_1__0 )? )
            // InternalArdsl.g:2906:2: ( rule__Reference__Group_1__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_1()); 
            // InternalArdsl.g:2907:2: ( rule__Reference__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==50) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalArdsl.g:2907:3: rule__Reference__Group_1__0
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
    // InternalArdsl.g:2915:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2919:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalArdsl.g:2920:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalArdsl.g:2927:1: rule__Reference__Group__2__Impl : ( 'min' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2931:1: ( ( 'min' ) )
            // InternalArdsl.g:2932:1: ( 'min' )
            {
            // InternalArdsl.g:2932:1: ( 'min' )
            // InternalArdsl.g:2933:2: 'min'
            {
             before(grammarAccess.getReferenceAccess().getMinKeyword_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalArdsl.g:2942:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2946:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // InternalArdsl.g:2947:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalArdsl.g:2954:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__MinAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2958:1: ( ( ( rule__Reference__MinAssignment_3 ) ) )
            // InternalArdsl.g:2959:1: ( ( rule__Reference__MinAssignment_3 ) )
            {
            // InternalArdsl.g:2959:1: ( ( rule__Reference__MinAssignment_3 ) )
            // InternalArdsl.g:2960:2: ( rule__Reference__MinAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getMinAssignment_3()); 
            // InternalArdsl.g:2961:2: ( rule__Reference__MinAssignment_3 )
            // InternalArdsl.g:2961:3: rule__Reference__MinAssignment_3
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
    // InternalArdsl.g:2969:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2973:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // InternalArdsl.g:2974:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalArdsl.g:2981:1: rule__Reference__Group__4__Impl : ( 'max' ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2985:1: ( ( 'max' ) )
            // InternalArdsl.g:2986:1: ( 'max' )
            {
            // InternalArdsl.g:2986:1: ( 'max' )
            // InternalArdsl.g:2987:2: 'max'
            {
             before(grammarAccess.getReferenceAccess().getMaxKeyword_4()); 
            match(input,48,FOLLOW_2); 
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
    // InternalArdsl.g:2996:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl rule__Reference__Group__6 ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3000:1: ( rule__Reference__Group__5__Impl rule__Reference__Group__6 )
            // InternalArdsl.g:3001:2: rule__Reference__Group__5__Impl rule__Reference__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalArdsl.g:3008:1: rule__Reference__Group__5__Impl : ( ( rule__Reference__MaxAssignment_5 ) ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3012:1: ( ( ( rule__Reference__MaxAssignment_5 ) ) )
            // InternalArdsl.g:3013:1: ( ( rule__Reference__MaxAssignment_5 ) )
            {
            // InternalArdsl.g:3013:1: ( ( rule__Reference__MaxAssignment_5 ) )
            // InternalArdsl.g:3014:2: ( rule__Reference__MaxAssignment_5 )
            {
             before(grammarAccess.getReferenceAccess().getMaxAssignment_5()); 
            // InternalArdsl.g:3015:2: ( rule__Reference__MaxAssignment_5 )
            // InternalArdsl.g:3015:3: rule__Reference__MaxAssignment_5
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
    // InternalArdsl.g:3023:1: rule__Reference__Group__6 : rule__Reference__Group__6__Impl rule__Reference__Group__7 ;
    public final void rule__Reference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3027:1: ( rule__Reference__Group__6__Impl rule__Reference__Group__7 )
            // InternalArdsl.g:3028:2: rule__Reference__Group__6__Impl rule__Reference__Group__7
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
    // InternalArdsl.g:3035:1: rule__Reference__Group__6__Impl : ( 'target' ) ;
    public final void rule__Reference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3039:1: ( ( 'target' ) )
            // InternalArdsl.g:3040:1: ( 'target' )
            {
            // InternalArdsl.g:3040:1: ( 'target' )
            // InternalArdsl.g:3041:2: 'target'
            {
             before(grammarAccess.getReferenceAccess().getTargetKeyword_6()); 
            match(input,49,FOLLOW_2); 
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
    // InternalArdsl.g:3050:1: rule__Reference__Group__7 : rule__Reference__Group__7__Impl rule__Reference__Group__8 ;
    public final void rule__Reference__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3054:1: ( rule__Reference__Group__7__Impl rule__Reference__Group__8 )
            // InternalArdsl.g:3055:2: rule__Reference__Group__7__Impl rule__Reference__Group__8
            {
            pushFollow(FOLLOW_27);
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
    // InternalArdsl.g:3062:1: rule__Reference__Group__7__Impl : ( ( rule__Reference__TargetAssignment_7 ) ) ;
    public final void rule__Reference__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3066:1: ( ( ( rule__Reference__TargetAssignment_7 ) ) )
            // InternalArdsl.g:3067:1: ( ( rule__Reference__TargetAssignment_7 ) )
            {
            // InternalArdsl.g:3067:1: ( ( rule__Reference__TargetAssignment_7 ) )
            // InternalArdsl.g:3068:2: ( rule__Reference__TargetAssignment_7 )
            {
             before(grammarAccess.getReferenceAccess().getTargetAssignment_7()); 
            // InternalArdsl.g:3069:2: ( rule__Reference__TargetAssignment_7 )
            // InternalArdsl.g:3069:3: rule__Reference__TargetAssignment_7
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
    // InternalArdsl.g:3077:1: rule__Reference__Group__8 : rule__Reference__Group__8__Impl ;
    public final void rule__Reference__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3081:1: ( rule__Reference__Group__8__Impl )
            // InternalArdsl.g:3082:2: rule__Reference__Group__8__Impl
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
    // InternalArdsl.g:3088:1: rule__Reference__Group__8__Impl : ( ( rule__Reference__Group_8__0 )? ) ;
    public final void rule__Reference__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3092:1: ( ( ( rule__Reference__Group_8__0 )? ) )
            // InternalArdsl.g:3093:1: ( ( rule__Reference__Group_8__0 )? )
            {
            // InternalArdsl.g:3093:1: ( ( rule__Reference__Group_8__0 )? )
            // InternalArdsl.g:3094:2: ( rule__Reference__Group_8__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_8()); 
            // InternalArdsl.g:3095:2: ( rule__Reference__Group_8__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==51) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalArdsl.g:3095:3: rule__Reference__Group_8__0
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
    // InternalArdsl.g:3104:1: rule__Reference__Group_1__0 : rule__Reference__Group_1__0__Impl rule__Reference__Group_1__1 ;
    public final void rule__Reference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3108:1: ( rule__Reference__Group_1__0__Impl rule__Reference__Group_1__1 )
            // InternalArdsl.g:3109:2: rule__Reference__Group_1__0__Impl rule__Reference__Group_1__1
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
    // InternalArdsl.g:3116:1: rule__Reference__Group_1__0__Impl : ( 'containtment' ) ;
    public final void rule__Reference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3120:1: ( ( 'containtment' ) )
            // InternalArdsl.g:3121:1: ( 'containtment' )
            {
            // InternalArdsl.g:3121:1: ( 'containtment' )
            // InternalArdsl.g:3122:2: 'containtment'
            {
             before(grammarAccess.getReferenceAccess().getContaintmentKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalArdsl.g:3131:1: rule__Reference__Group_1__1 : rule__Reference__Group_1__1__Impl ;
    public final void rule__Reference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3135:1: ( rule__Reference__Group_1__1__Impl )
            // InternalArdsl.g:3136:2: rule__Reference__Group_1__1__Impl
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
    // InternalArdsl.g:3142:1: rule__Reference__Group_1__1__Impl : ( ( rule__Reference__ContaintmentAssignment_1_1 ) ) ;
    public final void rule__Reference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3146:1: ( ( ( rule__Reference__ContaintmentAssignment_1_1 ) ) )
            // InternalArdsl.g:3147:1: ( ( rule__Reference__ContaintmentAssignment_1_1 ) )
            {
            // InternalArdsl.g:3147:1: ( ( rule__Reference__ContaintmentAssignment_1_1 ) )
            // InternalArdsl.g:3148:2: ( rule__Reference__ContaintmentAssignment_1_1 )
            {
             before(grammarAccess.getReferenceAccess().getContaintmentAssignment_1_1()); 
            // InternalArdsl.g:3149:2: ( rule__Reference__ContaintmentAssignment_1_1 )
            // InternalArdsl.g:3149:3: rule__Reference__ContaintmentAssignment_1_1
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
    // InternalArdsl.g:3158:1: rule__Reference__Group_8__0 : rule__Reference__Group_8__0__Impl rule__Reference__Group_8__1 ;
    public final void rule__Reference__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3162:1: ( rule__Reference__Group_8__0__Impl rule__Reference__Group_8__1 )
            // InternalArdsl.g:3163:2: rule__Reference__Group_8__0__Impl rule__Reference__Group_8__1
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
    // InternalArdsl.g:3170:1: rule__Reference__Group_8__0__Impl : ( 'opposite' ) ;
    public final void rule__Reference__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3174:1: ( ( 'opposite' ) )
            // InternalArdsl.g:3175:1: ( 'opposite' )
            {
            // InternalArdsl.g:3175:1: ( 'opposite' )
            // InternalArdsl.g:3176:2: 'opposite'
            {
             before(grammarAccess.getReferenceAccess().getOppositeKeyword_8_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalArdsl.g:3185:1: rule__Reference__Group_8__1 : rule__Reference__Group_8__1__Impl ;
    public final void rule__Reference__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3189:1: ( rule__Reference__Group_8__1__Impl )
            // InternalArdsl.g:3190:2: rule__Reference__Group_8__1__Impl
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
    // InternalArdsl.g:3196:1: rule__Reference__Group_8__1__Impl : ( ( rule__Reference__OppositeAssignment_8_1 ) ) ;
    public final void rule__Reference__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3200:1: ( ( ( rule__Reference__OppositeAssignment_8_1 ) ) )
            // InternalArdsl.g:3201:1: ( ( rule__Reference__OppositeAssignment_8_1 ) )
            {
            // InternalArdsl.g:3201:1: ( ( rule__Reference__OppositeAssignment_8_1 ) )
            // InternalArdsl.g:3202:2: ( rule__Reference__OppositeAssignment_8_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeAssignment_8_1()); 
            // InternalArdsl.g:3203:2: ( rule__Reference__OppositeAssignment_8_1 )
            // InternalArdsl.g:3203:3: rule__Reference__OppositeAssignment_8_1
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


    // $ANTLR start "rule__Graphic__Group__0"
    // InternalArdsl.g:3212:1: rule__Graphic__Group__0 : rule__Graphic__Group__0__Impl rule__Graphic__Group__1 ;
    public final void rule__Graphic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3216:1: ( rule__Graphic__Group__0__Impl rule__Graphic__Group__1 )
            // InternalArdsl.g:3217:2: rule__Graphic__Group__0__Impl rule__Graphic__Group__1
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
    // InternalArdsl.g:3224:1: rule__Graphic__Group__0__Impl : ( 'Graphic' ) ;
    public final void rule__Graphic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3228:1: ( ( 'Graphic' ) )
            // InternalArdsl.g:3229:1: ( 'Graphic' )
            {
            // InternalArdsl.g:3229:1: ( 'Graphic' )
            // InternalArdsl.g:3230:2: 'Graphic'
            {
             before(grammarAccess.getGraphicAccess().getGraphicKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalArdsl.g:3239:1: rule__Graphic__Group__1 : rule__Graphic__Group__1__Impl rule__Graphic__Group__2 ;
    public final void rule__Graphic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3243:1: ( rule__Graphic__Group__1__Impl rule__Graphic__Group__2 )
            // InternalArdsl.g:3244:2: rule__Graphic__Group__1__Impl rule__Graphic__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalArdsl.g:3251:1: rule__Graphic__Group__1__Impl : ( '{' ) ;
    public final void rule__Graphic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3255:1: ( ( '{' ) )
            // InternalArdsl.g:3256:1: ( '{' )
            {
            // InternalArdsl.g:3256:1: ( '{' )
            // InternalArdsl.g:3257:2: '{'
            {
             before(grammarAccess.getGraphicAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalArdsl.g:3266:1: rule__Graphic__Group__2 : rule__Graphic__Group__2__Impl rule__Graphic__Group__3 ;
    public final void rule__Graphic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3270:1: ( rule__Graphic__Group__2__Impl rule__Graphic__Group__3 )
            // InternalArdsl.g:3271:2: rule__Graphic__Group__2__Impl rule__Graphic__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalArdsl.g:3278:1: rule__Graphic__Group__2__Impl : ( ( rule__Graphic__ClassesAssignment_2 ) ) ;
    public final void rule__Graphic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3282:1: ( ( ( rule__Graphic__ClassesAssignment_2 ) ) )
            // InternalArdsl.g:3283:1: ( ( rule__Graphic__ClassesAssignment_2 ) )
            {
            // InternalArdsl.g:3283:1: ( ( rule__Graphic__ClassesAssignment_2 ) )
            // InternalArdsl.g:3284:2: ( rule__Graphic__ClassesAssignment_2 )
            {
             before(grammarAccess.getGraphicAccess().getClassesAssignment_2()); 
            // InternalArdsl.g:3285:2: ( rule__Graphic__ClassesAssignment_2 )
            // InternalArdsl.g:3285:3: rule__Graphic__ClassesAssignment_2
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
    // InternalArdsl.g:3293:1: rule__Graphic__Group__3 : rule__Graphic__Group__3__Impl rule__Graphic__Group__4 ;
    public final void rule__Graphic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3297:1: ( rule__Graphic__Group__3__Impl rule__Graphic__Group__4 )
            // InternalArdsl.g:3298:2: rule__Graphic__Group__3__Impl rule__Graphic__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalArdsl.g:3305:1: rule__Graphic__Group__3__Impl : ( ( rule__Graphic__Group_3__0 )* ) ;
    public final void rule__Graphic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3309:1: ( ( ( rule__Graphic__Group_3__0 )* ) )
            // InternalArdsl.g:3310:1: ( ( rule__Graphic__Group_3__0 )* )
            {
            // InternalArdsl.g:3310:1: ( ( rule__Graphic__Group_3__0 )* )
            // InternalArdsl.g:3311:2: ( rule__Graphic__Group_3__0 )*
            {
             before(grammarAccess.getGraphicAccess().getGroup_3()); 
            // InternalArdsl.g:3312:2: ( rule__Graphic__Group_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==40) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalArdsl.g:3312:3: rule__Graphic__Group_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Graphic__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getGraphicAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalArdsl.g:3320:1: rule__Graphic__Group__4 : rule__Graphic__Group__4__Impl ;
    public final void rule__Graphic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3324:1: ( rule__Graphic__Group__4__Impl )
            // InternalArdsl.g:3325:2: rule__Graphic__Group__4__Impl
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
    // InternalArdsl.g:3331:1: rule__Graphic__Group__4__Impl : ( '}' ) ;
    public final void rule__Graphic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3335:1: ( ( '}' ) )
            // InternalArdsl.g:3336:1: ( '}' )
            {
            // InternalArdsl.g:3336:1: ( '}' )
            // InternalArdsl.g:3337:2: '}'
            {
             before(grammarAccess.getGraphicAccess().getRightCurlyBracketKeyword_4()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__Graphic__Group_3__0"
    // InternalArdsl.g:3347:1: rule__Graphic__Group_3__0 : rule__Graphic__Group_3__0__Impl rule__Graphic__Group_3__1 ;
    public final void rule__Graphic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3351:1: ( rule__Graphic__Group_3__0__Impl rule__Graphic__Group_3__1 )
            // InternalArdsl.g:3352:2: rule__Graphic__Group_3__0__Impl rule__Graphic__Group_3__1
            {
            pushFollow(FOLLOW_28);
            rule__Graphic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphic__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphic__Group_3__0"


    // $ANTLR start "rule__Graphic__Group_3__0__Impl"
    // InternalArdsl.g:3359:1: rule__Graphic__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Graphic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3363:1: ( ( ',' ) )
            // InternalArdsl.g:3364:1: ( ',' )
            {
            // InternalArdsl.g:3364:1: ( ',' )
            // InternalArdsl.g:3365:2: ','
            {
             before(grammarAccess.getGraphicAccess().getCommaKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGraphicAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphic__Group_3__0__Impl"


    // $ANTLR start "rule__Graphic__Group_3__1"
    // InternalArdsl.g:3374:1: rule__Graphic__Group_3__1 : rule__Graphic__Group_3__1__Impl ;
    public final void rule__Graphic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3378:1: ( rule__Graphic__Group_3__1__Impl )
            // InternalArdsl.g:3379:2: rule__Graphic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graphic__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphic__Group_3__1"


    // $ANTLR start "rule__Graphic__Group_3__1__Impl"
    // InternalArdsl.g:3385:1: rule__Graphic__Group_3__1__Impl : ( ( rule__Graphic__ClassesAssignment_3_1 ) ) ;
    public final void rule__Graphic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3389:1: ( ( ( rule__Graphic__ClassesAssignment_3_1 ) ) )
            // InternalArdsl.g:3390:1: ( ( rule__Graphic__ClassesAssignment_3_1 ) )
            {
            // InternalArdsl.g:3390:1: ( ( rule__Graphic__ClassesAssignment_3_1 ) )
            // InternalArdsl.g:3391:2: ( rule__Graphic__ClassesAssignment_3_1 )
            {
             before(grammarAccess.getGraphicAccess().getClassesAssignment_3_1()); 
            // InternalArdsl.g:3392:2: ( rule__Graphic__ClassesAssignment_3_1 )
            // InternalArdsl.g:3392:3: rule__Graphic__ClassesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Graphic__ClassesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphicAccess().getClassesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphic__Group_3__1__Impl"


    // $ANTLR start "rule__GraphicClass__Group__0"
    // InternalArdsl.g:3401:1: rule__GraphicClass__Group__0 : rule__GraphicClass__Group__0__Impl rule__GraphicClass__Group__1 ;
    public final void rule__GraphicClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3405:1: ( rule__GraphicClass__Group__0__Impl rule__GraphicClass__Group__1 )
            // InternalArdsl.g:3406:2: rule__GraphicClass__Group__0__Impl rule__GraphicClass__Group__1
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
    // InternalArdsl.g:3413:1: rule__GraphicClass__Group__0__Impl : ( 'element' ) ;
    public final void rule__GraphicClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3417:1: ( ( 'element' ) )
            // InternalArdsl.g:3418:1: ( 'element' )
            {
            // InternalArdsl.g:3418:1: ( 'element' )
            // InternalArdsl.g:3419:2: 'element'
            {
             before(grammarAccess.getGraphicClassAccess().getElementKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalArdsl.g:3428:1: rule__GraphicClass__Group__1 : rule__GraphicClass__Group__1__Impl rule__GraphicClass__Group__2 ;
    public final void rule__GraphicClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3432:1: ( rule__GraphicClass__Group__1__Impl rule__GraphicClass__Group__2 )
            // InternalArdsl.g:3433:2: rule__GraphicClass__Group__1__Impl rule__GraphicClass__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalArdsl.g:3440:1: rule__GraphicClass__Group__1__Impl : ( ( rule__GraphicClass__OntoClassAssignment_1 ) ) ;
    public final void rule__GraphicClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3444:1: ( ( ( rule__GraphicClass__OntoClassAssignment_1 ) ) )
            // InternalArdsl.g:3445:1: ( ( rule__GraphicClass__OntoClassAssignment_1 ) )
            {
            // InternalArdsl.g:3445:1: ( ( rule__GraphicClass__OntoClassAssignment_1 ) )
            // InternalArdsl.g:3446:2: ( rule__GraphicClass__OntoClassAssignment_1 )
            {
             before(grammarAccess.getGraphicClassAccess().getOntoClassAssignment_1()); 
            // InternalArdsl.g:3447:2: ( rule__GraphicClass__OntoClassAssignment_1 )
            // InternalArdsl.g:3447:3: rule__GraphicClass__OntoClassAssignment_1
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
    // InternalArdsl.g:3455:1: rule__GraphicClass__Group__2 : rule__GraphicClass__Group__2__Impl rule__GraphicClass__Group__3 ;
    public final void rule__GraphicClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3459:1: ( rule__GraphicClass__Group__2__Impl rule__GraphicClass__Group__3 )
            // InternalArdsl.g:3460:2: rule__GraphicClass__Group__2__Impl rule__GraphicClass__Group__3
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
    // InternalArdsl.g:3467:1: rule__GraphicClass__Group__2__Impl : ( 'versions' ) ;
    public final void rule__GraphicClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3471:1: ( ( 'versions' ) )
            // InternalArdsl.g:3472:1: ( 'versions' )
            {
            // InternalArdsl.g:3472:1: ( 'versions' )
            // InternalArdsl.g:3473:2: 'versions'
            {
             before(grammarAccess.getGraphicClassAccess().getVersionsKeyword_2()); 
            match(input,54,FOLLOW_2); 
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
    // InternalArdsl.g:3482:1: rule__GraphicClass__Group__3 : rule__GraphicClass__Group__3__Impl rule__GraphicClass__Group__4 ;
    public final void rule__GraphicClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3486:1: ( rule__GraphicClass__Group__3__Impl rule__GraphicClass__Group__4 )
            // InternalArdsl.g:3487:2: rule__GraphicClass__Group__3__Impl rule__GraphicClass__Group__4
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
    // InternalArdsl.g:3494:1: rule__GraphicClass__Group__3__Impl : ( '{' ) ;
    public final void rule__GraphicClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3498:1: ( ( '{' ) )
            // InternalArdsl.g:3499:1: ( '{' )
            {
            // InternalArdsl.g:3499:1: ( '{' )
            // InternalArdsl.g:3500:2: '{'
            {
             before(grammarAccess.getGraphicClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalArdsl.g:3509:1: rule__GraphicClass__Group__4 : rule__GraphicClass__Group__4__Impl rule__GraphicClass__Group__5 ;
    public final void rule__GraphicClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3513:1: ( rule__GraphicClass__Group__4__Impl rule__GraphicClass__Group__5 )
            // InternalArdsl.g:3514:2: rule__GraphicClass__Group__4__Impl rule__GraphicClass__Group__5
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
    // InternalArdsl.g:3521:1: rule__GraphicClass__Group__4__Impl : ( ( rule__GraphicClass__VersionsAssignment_4 ) ) ;
    public final void rule__GraphicClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3525:1: ( ( ( rule__GraphicClass__VersionsAssignment_4 ) ) )
            // InternalArdsl.g:3526:1: ( ( rule__GraphicClass__VersionsAssignment_4 ) )
            {
            // InternalArdsl.g:3526:1: ( ( rule__GraphicClass__VersionsAssignment_4 ) )
            // InternalArdsl.g:3527:2: ( rule__GraphicClass__VersionsAssignment_4 )
            {
             before(grammarAccess.getGraphicClassAccess().getVersionsAssignment_4()); 
            // InternalArdsl.g:3528:2: ( rule__GraphicClass__VersionsAssignment_4 )
            // InternalArdsl.g:3528:3: rule__GraphicClass__VersionsAssignment_4
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
    // InternalArdsl.g:3536:1: rule__GraphicClass__Group__5 : rule__GraphicClass__Group__5__Impl rule__GraphicClass__Group__6 ;
    public final void rule__GraphicClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3540:1: ( rule__GraphicClass__Group__5__Impl rule__GraphicClass__Group__6 )
            // InternalArdsl.g:3541:2: rule__GraphicClass__Group__5__Impl rule__GraphicClass__Group__6
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
    // InternalArdsl.g:3548:1: rule__GraphicClass__Group__5__Impl : ( ( rule__GraphicClass__Group_5__0 )* ) ;
    public final void rule__GraphicClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3552:1: ( ( ( rule__GraphicClass__Group_5__0 )* ) )
            // InternalArdsl.g:3553:1: ( ( rule__GraphicClass__Group_5__0 )* )
            {
            // InternalArdsl.g:3553:1: ( ( rule__GraphicClass__Group_5__0 )* )
            // InternalArdsl.g:3554:2: ( rule__GraphicClass__Group_5__0 )*
            {
             before(grammarAccess.getGraphicClassAccess().getGroup_5()); 
            // InternalArdsl.g:3555:2: ( rule__GraphicClass__Group_5__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==40) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalArdsl.g:3555:3: rule__GraphicClass__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__GraphicClass__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getGraphicClassAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalArdsl.g:3563:1: rule__GraphicClass__Group__6 : rule__GraphicClass__Group__6__Impl rule__GraphicClass__Group__7 ;
    public final void rule__GraphicClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3567:1: ( rule__GraphicClass__Group__6__Impl rule__GraphicClass__Group__7 )
            // InternalArdsl.g:3568:2: rule__GraphicClass__Group__6__Impl rule__GraphicClass__Group__7
            {
            pushFollow(FOLLOW_30);
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
    // InternalArdsl.g:3575:1: rule__GraphicClass__Group__6__Impl : ( '}' ) ;
    public final void rule__GraphicClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3579:1: ( ( '}' ) )
            // InternalArdsl.g:3580:1: ( '}' )
            {
            // InternalArdsl.g:3580:1: ( '}' )
            // InternalArdsl.g:3581:2: '}'
            {
             before(grammarAccess.getGraphicClassAccess().getRightCurlyBracketKeyword_6()); 
            match(input,38,FOLLOW_2); 
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
    // InternalArdsl.g:3590:1: rule__GraphicClass__Group__7 : rule__GraphicClass__Group__7__Impl rule__GraphicClass__Group__8 ;
    public final void rule__GraphicClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3594:1: ( rule__GraphicClass__Group__7__Impl rule__GraphicClass__Group__8 )
            // InternalArdsl.g:3595:2: rule__GraphicClass__Group__7__Impl rule__GraphicClass__Group__8
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
    // InternalArdsl.g:3602:1: rule__GraphicClass__Group__7__Impl : ( 'constraints' ) ;
    public final void rule__GraphicClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3606:1: ( ( 'constraints' ) )
            // InternalArdsl.g:3607:1: ( 'constraints' )
            {
            // InternalArdsl.g:3607:1: ( 'constraints' )
            // InternalArdsl.g:3608:2: 'constraints'
            {
             before(grammarAccess.getGraphicClassAccess().getConstraintsKeyword_7()); 
            match(input,55,FOLLOW_2); 
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
    // InternalArdsl.g:3617:1: rule__GraphicClass__Group__8 : rule__GraphicClass__Group__8__Impl rule__GraphicClass__Group__9 ;
    public final void rule__GraphicClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3621:1: ( rule__GraphicClass__Group__8__Impl rule__GraphicClass__Group__9 )
            // InternalArdsl.g:3622:2: rule__GraphicClass__Group__8__Impl rule__GraphicClass__Group__9
            {
            pushFollow(FOLLOW_31);
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
    // InternalArdsl.g:3629:1: rule__GraphicClass__Group__8__Impl : ( '{' ) ;
    public final void rule__GraphicClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3633:1: ( ( '{' ) )
            // InternalArdsl.g:3634:1: ( '{' )
            {
            // InternalArdsl.g:3634:1: ( '{' )
            // InternalArdsl.g:3635:2: '{'
            {
             before(grammarAccess.getGraphicClassAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,36,FOLLOW_2); 
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
    // InternalArdsl.g:3644:1: rule__GraphicClass__Group__9 : rule__GraphicClass__Group__9__Impl rule__GraphicClass__Group__10 ;
    public final void rule__GraphicClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3648:1: ( rule__GraphicClass__Group__9__Impl rule__GraphicClass__Group__10 )
            // InternalArdsl.g:3649:2: rule__GraphicClass__Group__9__Impl rule__GraphicClass__Group__10
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
    // InternalArdsl.g:3656:1: rule__GraphicClass__Group__9__Impl : ( ( rule__GraphicClass__ConstraintsAssignment_9 ) ) ;
    public final void rule__GraphicClass__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3660:1: ( ( ( rule__GraphicClass__ConstraintsAssignment_9 ) ) )
            // InternalArdsl.g:3661:1: ( ( rule__GraphicClass__ConstraintsAssignment_9 ) )
            {
            // InternalArdsl.g:3661:1: ( ( rule__GraphicClass__ConstraintsAssignment_9 ) )
            // InternalArdsl.g:3662:2: ( rule__GraphicClass__ConstraintsAssignment_9 )
            {
             before(grammarAccess.getGraphicClassAccess().getConstraintsAssignment_9()); 
            // InternalArdsl.g:3663:2: ( rule__GraphicClass__ConstraintsAssignment_9 )
            // InternalArdsl.g:3663:3: rule__GraphicClass__ConstraintsAssignment_9
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
    // InternalArdsl.g:3671:1: rule__GraphicClass__Group__10 : rule__GraphicClass__Group__10__Impl ;
    public final void rule__GraphicClass__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3675:1: ( rule__GraphicClass__Group__10__Impl )
            // InternalArdsl.g:3676:2: rule__GraphicClass__Group__10__Impl
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
    // InternalArdsl.g:3682:1: rule__GraphicClass__Group__10__Impl : ( '}' ) ;
    public final void rule__GraphicClass__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3686:1: ( ( '}' ) )
            // InternalArdsl.g:3687:1: ( '}' )
            {
            // InternalArdsl.g:3687:1: ( '}' )
            // InternalArdsl.g:3688:2: '}'
            {
             before(grammarAccess.getGraphicClassAccess().getRightCurlyBracketKeyword_10()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__GraphicClass__Group_5__0"
    // InternalArdsl.g:3698:1: rule__GraphicClass__Group_5__0 : rule__GraphicClass__Group_5__0__Impl rule__GraphicClass__Group_5__1 ;
    public final void rule__GraphicClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3702:1: ( rule__GraphicClass__Group_5__0__Impl rule__GraphicClass__Group_5__1 )
            // InternalArdsl.g:3703:2: rule__GraphicClass__Group_5__0__Impl rule__GraphicClass__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__GraphicClass__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphicClass__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicClass__Group_5__0"


    // $ANTLR start "rule__GraphicClass__Group_5__0__Impl"
    // InternalArdsl.g:3710:1: rule__GraphicClass__Group_5__0__Impl : ( ',' ) ;
    public final void rule__GraphicClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3714:1: ( ( ',' ) )
            // InternalArdsl.g:3715:1: ( ',' )
            {
            // InternalArdsl.g:3715:1: ( ',' )
            // InternalArdsl.g:3716:2: ','
            {
             before(grammarAccess.getGraphicClassAccess().getCommaKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGraphicClassAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicClass__Group_5__0__Impl"


    // $ANTLR start "rule__GraphicClass__Group_5__1"
    // InternalArdsl.g:3725:1: rule__GraphicClass__Group_5__1 : rule__GraphicClass__Group_5__1__Impl ;
    public final void rule__GraphicClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3729:1: ( rule__GraphicClass__Group_5__1__Impl )
            // InternalArdsl.g:3730:2: rule__GraphicClass__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphicClass__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicClass__Group_5__1"


    // $ANTLR start "rule__GraphicClass__Group_5__1__Impl"
    // InternalArdsl.g:3736:1: rule__GraphicClass__Group_5__1__Impl : ( ( rule__GraphicClass__VersionsAssignment_5_1 ) ) ;
    public final void rule__GraphicClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3740:1: ( ( ( rule__GraphicClass__VersionsAssignment_5_1 ) ) )
            // InternalArdsl.g:3741:1: ( ( rule__GraphicClass__VersionsAssignment_5_1 ) )
            {
            // InternalArdsl.g:3741:1: ( ( rule__GraphicClass__VersionsAssignment_5_1 ) )
            // InternalArdsl.g:3742:2: ( rule__GraphicClass__VersionsAssignment_5_1 )
            {
             before(grammarAccess.getGraphicClassAccess().getVersionsAssignment_5_1()); 
            // InternalArdsl.g:3743:2: ( rule__GraphicClass__VersionsAssignment_5_1 )
            // InternalArdsl.g:3743:3: rule__GraphicClass__VersionsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphicClass__VersionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphicClassAccess().getVersionsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicClass__Group_5__1__Impl"


    // $ANTLR start "rule__Versions__Group__0"
    // InternalArdsl.g:3752:1: rule__Versions__Group__0 : rule__Versions__Group__0__Impl rule__Versions__Group__1 ;
    public final void rule__Versions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3756:1: ( rule__Versions__Group__0__Impl rule__Versions__Group__1 )
            // InternalArdsl.g:3757:2: rule__Versions__Group__0__Impl rule__Versions__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalArdsl.g:3764:1: rule__Versions__Group__0__Impl : ( ( rule__Versions__NameAssignment_0 ) ) ;
    public final void rule__Versions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3768:1: ( ( ( rule__Versions__NameAssignment_0 ) ) )
            // InternalArdsl.g:3769:1: ( ( rule__Versions__NameAssignment_0 ) )
            {
            // InternalArdsl.g:3769:1: ( ( rule__Versions__NameAssignment_0 ) )
            // InternalArdsl.g:3770:2: ( rule__Versions__NameAssignment_0 )
            {
             before(grammarAccess.getVersionsAccess().getNameAssignment_0()); 
            // InternalArdsl.g:3771:2: ( rule__Versions__NameAssignment_0 )
            // InternalArdsl.g:3771:3: rule__Versions__NameAssignment_0
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
    // InternalArdsl.g:3779:1: rule__Versions__Group__1 : rule__Versions__Group__1__Impl rule__Versions__Group__2 ;
    public final void rule__Versions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3783:1: ( rule__Versions__Group__1__Impl rule__Versions__Group__2 )
            // InternalArdsl.g:3784:2: rule__Versions__Group__1__Impl rule__Versions__Group__2
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
    // InternalArdsl.g:3791:1: rule__Versions__Group__1__Impl : ( '=' ) ;
    public final void rule__Versions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3795:1: ( ( '=' ) )
            // InternalArdsl.g:3796:1: ( '=' )
            {
            // InternalArdsl.g:3796:1: ( '=' )
            // InternalArdsl.g:3797:2: '='
            {
             before(grammarAccess.getVersionsAccess().getEqualsSignKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalArdsl.g:3806:1: rule__Versions__Group__2 : rule__Versions__Group__2__Impl ;
    public final void rule__Versions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3810:1: ( rule__Versions__Group__2__Impl )
            // InternalArdsl.g:3811:2: rule__Versions__Group__2__Impl
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
    // InternalArdsl.g:3817:1: rule__Versions__Group__2__Impl : ( ( rule__Versions__URLAssignment_2 ) ) ;
    public final void rule__Versions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3821:1: ( ( ( rule__Versions__URLAssignment_2 ) ) )
            // InternalArdsl.g:3822:1: ( ( rule__Versions__URLAssignment_2 ) )
            {
            // InternalArdsl.g:3822:1: ( ( rule__Versions__URLAssignment_2 ) )
            // InternalArdsl.g:3823:2: ( rule__Versions__URLAssignment_2 )
            {
             before(grammarAccess.getVersionsAccess().getURLAssignment_2()); 
            // InternalArdsl.g:3824:2: ( rule__Versions__URLAssignment_2 )
            // InternalArdsl.g:3824:3: rule__Versions__URLAssignment_2
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


    // $ANTLR start "rule__Constraints__Group__0"
    // InternalArdsl.g:3833:1: rule__Constraints__Group__0 : rule__Constraints__Group__0__Impl rule__Constraints__Group__1 ;
    public final void rule__Constraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3837:1: ( rule__Constraints__Group__0__Impl rule__Constraints__Group__1 )
            // InternalArdsl.g:3838:2: rule__Constraints__Group__0__Impl rule__Constraints__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalArdsl.g:3845:1: rule__Constraints__Group__0__Impl : ( 'plane' ) ;
    public final void rule__Constraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3849:1: ( ( 'plane' ) )
            // InternalArdsl.g:3850:1: ( 'plane' )
            {
            // InternalArdsl.g:3850:1: ( 'plane' )
            // InternalArdsl.g:3851:2: 'plane'
            {
             before(grammarAccess.getConstraintsAccess().getPlaneKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalArdsl.g:3860:1: rule__Constraints__Group__1 : rule__Constraints__Group__1__Impl rule__Constraints__Group__2 ;
    public final void rule__Constraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3864:1: ( rule__Constraints__Group__1__Impl rule__Constraints__Group__2 )
            // InternalArdsl.g:3865:2: rule__Constraints__Group__1__Impl rule__Constraints__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalArdsl.g:3872:1: rule__Constraints__Group__1__Impl : ( ( rule__Constraints__PlanesAssignment_1 ) ) ;
    public final void rule__Constraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3876:1: ( ( ( rule__Constraints__PlanesAssignment_1 ) ) )
            // InternalArdsl.g:3877:1: ( ( rule__Constraints__PlanesAssignment_1 ) )
            {
            // InternalArdsl.g:3877:1: ( ( rule__Constraints__PlanesAssignment_1 ) )
            // InternalArdsl.g:3878:2: ( rule__Constraints__PlanesAssignment_1 )
            {
             before(grammarAccess.getConstraintsAccess().getPlanesAssignment_1()); 
            // InternalArdsl.g:3879:2: ( rule__Constraints__PlanesAssignment_1 )
            // InternalArdsl.g:3879:3: rule__Constraints__PlanesAssignment_1
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
    // InternalArdsl.g:3887:1: rule__Constraints__Group__2 : rule__Constraints__Group__2__Impl rule__Constraints__Group__3 ;
    public final void rule__Constraints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3891:1: ( rule__Constraints__Group__2__Impl rule__Constraints__Group__3 )
            // InternalArdsl.g:3892:2: rule__Constraints__Group__2__Impl rule__Constraints__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalArdsl.g:3899:1: rule__Constraints__Group__2__Impl : ( ( rule__Constraints__OverlappingAssignment_2 ) ) ;
    public final void rule__Constraints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3903:1: ( ( ( rule__Constraints__OverlappingAssignment_2 ) ) )
            // InternalArdsl.g:3904:1: ( ( rule__Constraints__OverlappingAssignment_2 ) )
            {
            // InternalArdsl.g:3904:1: ( ( rule__Constraints__OverlappingAssignment_2 ) )
            // InternalArdsl.g:3905:2: ( rule__Constraints__OverlappingAssignment_2 )
            {
             before(grammarAccess.getConstraintsAccess().getOverlappingAssignment_2()); 
            // InternalArdsl.g:3906:2: ( rule__Constraints__OverlappingAssignment_2 )
            // InternalArdsl.g:3906:3: rule__Constraints__OverlappingAssignment_2
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
    // InternalArdsl.g:3914:1: rule__Constraints__Group__3 : rule__Constraints__Group__3__Impl rule__Constraints__Group__4 ;
    public final void rule__Constraints__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3918:1: ( rule__Constraints__Group__3__Impl rule__Constraints__Group__4 )
            // InternalArdsl.g:3919:2: rule__Constraints__Group__3__Impl rule__Constraints__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalArdsl.g:3926:1: rule__Constraints__Group__3__Impl : ( 'sizeMin' ) ;
    public final void rule__Constraints__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3930:1: ( ( 'sizeMin' ) )
            // InternalArdsl.g:3931:1: ( 'sizeMin' )
            {
            // InternalArdsl.g:3931:1: ( 'sizeMin' )
            // InternalArdsl.g:3932:2: 'sizeMin'
            {
             before(grammarAccess.getConstraintsAccess().getSizeMinKeyword_3()); 
            match(input,57,FOLLOW_2); 
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
    // InternalArdsl.g:3941:1: rule__Constraints__Group__4 : rule__Constraints__Group__4__Impl rule__Constraints__Group__5 ;
    public final void rule__Constraints__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3945:1: ( rule__Constraints__Group__4__Impl rule__Constraints__Group__5 )
            // InternalArdsl.g:3946:2: rule__Constraints__Group__4__Impl rule__Constraints__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalArdsl.g:3953:1: rule__Constraints__Group__4__Impl : ( ( rule__Constraints__SizeMinAssignment_4 ) ) ;
    public final void rule__Constraints__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3957:1: ( ( ( rule__Constraints__SizeMinAssignment_4 ) ) )
            // InternalArdsl.g:3958:1: ( ( rule__Constraints__SizeMinAssignment_4 ) )
            {
            // InternalArdsl.g:3958:1: ( ( rule__Constraints__SizeMinAssignment_4 ) )
            // InternalArdsl.g:3959:2: ( rule__Constraints__SizeMinAssignment_4 )
            {
             before(grammarAccess.getConstraintsAccess().getSizeMinAssignment_4()); 
            // InternalArdsl.g:3960:2: ( rule__Constraints__SizeMinAssignment_4 )
            // InternalArdsl.g:3960:3: rule__Constraints__SizeMinAssignment_4
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
    // InternalArdsl.g:3968:1: rule__Constraints__Group__5 : rule__Constraints__Group__5__Impl rule__Constraints__Group__6 ;
    public final void rule__Constraints__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3972:1: ( rule__Constraints__Group__5__Impl rule__Constraints__Group__6 )
            // InternalArdsl.g:3973:2: rule__Constraints__Group__5__Impl rule__Constraints__Group__6
            {
            pushFollow(FOLLOW_35);
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
    // InternalArdsl.g:3980:1: rule__Constraints__Group__5__Impl : ( 'sizeMax' ) ;
    public final void rule__Constraints__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3984:1: ( ( 'sizeMax' ) )
            // InternalArdsl.g:3985:1: ( 'sizeMax' )
            {
            // InternalArdsl.g:3985:1: ( 'sizeMax' )
            // InternalArdsl.g:3986:2: 'sizeMax'
            {
             before(grammarAccess.getConstraintsAccess().getSizeMaxKeyword_5()); 
            match(input,58,FOLLOW_2); 
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
    // InternalArdsl.g:3995:1: rule__Constraints__Group__6 : rule__Constraints__Group__6__Impl rule__Constraints__Group__7 ;
    public final void rule__Constraints__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:3999:1: ( rule__Constraints__Group__6__Impl rule__Constraints__Group__7 )
            // InternalArdsl.g:4000:2: rule__Constraints__Group__6__Impl rule__Constraints__Group__7
            {
            pushFollow(FOLLOW_37);
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
    // InternalArdsl.g:4007:1: rule__Constraints__Group__6__Impl : ( ( rule__Constraints__SizeMaxAssignment_6 ) ) ;
    public final void rule__Constraints__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4011:1: ( ( ( rule__Constraints__SizeMaxAssignment_6 ) ) )
            // InternalArdsl.g:4012:1: ( ( rule__Constraints__SizeMaxAssignment_6 ) )
            {
            // InternalArdsl.g:4012:1: ( ( rule__Constraints__SizeMaxAssignment_6 ) )
            // InternalArdsl.g:4013:2: ( rule__Constraints__SizeMaxAssignment_6 )
            {
             before(grammarAccess.getConstraintsAccess().getSizeMaxAssignment_6()); 
            // InternalArdsl.g:4014:2: ( rule__Constraints__SizeMaxAssignment_6 )
            // InternalArdsl.g:4014:3: rule__Constraints__SizeMaxAssignment_6
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
    // InternalArdsl.g:4022:1: rule__Constraints__Group__7 : rule__Constraints__Group__7__Impl rule__Constraints__Group__8 ;
    public final void rule__Constraints__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4026:1: ( rule__Constraints__Group__7__Impl rule__Constraints__Group__8 )
            // InternalArdsl.g:4027:2: rule__Constraints__Group__7__Impl rule__Constraints__Group__8
            {
            pushFollow(FOLLOW_35);
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
    // InternalArdsl.g:4034:1: rule__Constraints__Group__7__Impl : ( 'xVariation' ) ;
    public final void rule__Constraints__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4038:1: ( ( 'xVariation' ) )
            // InternalArdsl.g:4039:1: ( 'xVariation' )
            {
            // InternalArdsl.g:4039:1: ( 'xVariation' )
            // InternalArdsl.g:4040:2: 'xVariation'
            {
             before(grammarAccess.getConstraintsAccess().getXVariationKeyword_7()); 
            match(input,59,FOLLOW_2); 
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
    // InternalArdsl.g:4049:1: rule__Constraints__Group__8 : rule__Constraints__Group__8__Impl rule__Constraints__Group__9 ;
    public final void rule__Constraints__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4053:1: ( rule__Constraints__Group__8__Impl rule__Constraints__Group__9 )
            // InternalArdsl.g:4054:2: rule__Constraints__Group__8__Impl rule__Constraints__Group__9
            {
            pushFollow(FOLLOW_38);
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
    // InternalArdsl.g:4061:1: rule__Constraints__Group__8__Impl : ( ( rule__Constraints__XToOriginPosAssignment_8 ) ) ;
    public final void rule__Constraints__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4065:1: ( ( ( rule__Constraints__XToOriginPosAssignment_8 ) ) )
            // InternalArdsl.g:4066:1: ( ( rule__Constraints__XToOriginPosAssignment_8 ) )
            {
            // InternalArdsl.g:4066:1: ( ( rule__Constraints__XToOriginPosAssignment_8 ) )
            // InternalArdsl.g:4067:2: ( rule__Constraints__XToOriginPosAssignment_8 )
            {
             before(grammarAccess.getConstraintsAccess().getXToOriginPosAssignment_8()); 
            // InternalArdsl.g:4068:2: ( rule__Constraints__XToOriginPosAssignment_8 )
            // InternalArdsl.g:4068:3: rule__Constraints__XToOriginPosAssignment_8
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
    // InternalArdsl.g:4076:1: rule__Constraints__Group__9 : rule__Constraints__Group__9__Impl rule__Constraints__Group__10 ;
    public final void rule__Constraints__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4080:1: ( rule__Constraints__Group__9__Impl rule__Constraints__Group__10 )
            // InternalArdsl.g:4081:2: rule__Constraints__Group__9__Impl rule__Constraints__Group__10
            {
            pushFollow(FOLLOW_35);
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
    // InternalArdsl.g:4088:1: rule__Constraints__Group__9__Impl : ( 'yVariation' ) ;
    public final void rule__Constraints__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4092:1: ( ( 'yVariation' ) )
            // InternalArdsl.g:4093:1: ( 'yVariation' )
            {
            // InternalArdsl.g:4093:1: ( 'yVariation' )
            // InternalArdsl.g:4094:2: 'yVariation'
            {
             before(grammarAccess.getConstraintsAccess().getYVariationKeyword_9()); 
            match(input,60,FOLLOW_2); 
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
    // InternalArdsl.g:4103:1: rule__Constraints__Group__10 : rule__Constraints__Group__10__Impl rule__Constraints__Group__11 ;
    public final void rule__Constraints__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4107:1: ( rule__Constraints__Group__10__Impl rule__Constraints__Group__11 )
            // InternalArdsl.g:4108:2: rule__Constraints__Group__10__Impl rule__Constraints__Group__11
            {
            pushFollow(FOLLOW_39);
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
    // InternalArdsl.g:4115:1: rule__Constraints__Group__10__Impl : ( ( rule__Constraints__YToOriginPosAssignment_10 ) ) ;
    public final void rule__Constraints__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4119:1: ( ( ( rule__Constraints__YToOriginPosAssignment_10 ) ) )
            // InternalArdsl.g:4120:1: ( ( rule__Constraints__YToOriginPosAssignment_10 ) )
            {
            // InternalArdsl.g:4120:1: ( ( rule__Constraints__YToOriginPosAssignment_10 ) )
            // InternalArdsl.g:4121:2: ( rule__Constraints__YToOriginPosAssignment_10 )
            {
             before(grammarAccess.getConstraintsAccess().getYToOriginPosAssignment_10()); 
            // InternalArdsl.g:4122:2: ( rule__Constraints__YToOriginPosAssignment_10 )
            // InternalArdsl.g:4122:3: rule__Constraints__YToOriginPosAssignment_10
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
    // InternalArdsl.g:4130:1: rule__Constraints__Group__11 : rule__Constraints__Group__11__Impl rule__Constraints__Group__12 ;
    public final void rule__Constraints__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4134:1: ( rule__Constraints__Group__11__Impl rule__Constraints__Group__12 )
            // InternalArdsl.g:4135:2: rule__Constraints__Group__11__Impl rule__Constraints__Group__12
            {
            pushFollow(FOLLOW_35);
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
    // InternalArdsl.g:4142:1: rule__Constraints__Group__11__Impl : ( 'zVariation' ) ;
    public final void rule__Constraints__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4146:1: ( ( 'zVariation' ) )
            // InternalArdsl.g:4147:1: ( 'zVariation' )
            {
            // InternalArdsl.g:4147:1: ( 'zVariation' )
            // InternalArdsl.g:4148:2: 'zVariation'
            {
             before(grammarAccess.getConstraintsAccess().getZVariationKeyword_11()); 
            match(input,61,FOLLOW_2); 
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
    // InternalArdsl.g:4157:1: rule__Constraints__Group__12 : rule__Constraints__Group__12__Impl rule__Constraints__Group__13 ;
    public final void rule__Constraints__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4161:1: ( rule__Constraints__Group__12__Impl rule__Constraints__Group__13 )
            // InternalArdsl.g:4162:2: rule__Constraints__Group__12__Impl rule__Constraints__Group__13
            {
            pushFollow(FOLLOW_40);
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
    // InternalArdsl.g:4169:1: rule__Constraints__Group__12__Impl : ( ( rule__Constraints__ZToOriginPosAssignment_12 ) ) ;
    public final void rule__Constraints__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4173:1: ( ( ( rule__Constraints__ZToOriginPosAssignment_12 ) ) )
            // InternalArdsl.g:4174:1: ( ( rule__Constraints__ZToOriginPosAssignment_12 ) )
            {
            // InternalArdsl.g:4174:1: ( ( rule__Constraints__ZToOriginPosAssignment_12 ) )
            // InternalArdsl.g:4175:2: ( rule__Constraints__ZToOriginPosAssignment_12 )
            {
             before(grammarAccess.getConstraintsAccess().getZToOriginPosAssignment_12()); 
            // InternalArdsl.g:4176:2: ( rule__Constraints__ZToOriginPosAssignment_12 )
            // InternalArdsl.g:4176:3: rule__Constraints__ZToOriginPosAssignment_12
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
    // InternalArdsl.g:4184:1: rule__Constraints__Group__13 : rule__Constraints__Group__13__Impl rule__Constraints__Group__14 ;
    public final void rule__Constraints__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4188:1: ( rule__Constraints__Group__13__Impl rule__Constraints__Group__14 )
            // InternalArdsl.g:4189:2: rule__Constraints__Group__13__Impl rule__Constraints__Group__14
            {
            pushFollow(FOLLOW_15);
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
    // InternalArdsl.g:4196:1: rule__Constraints__Group__13__Impl : ( 'rotation' ) ;
    public final void rule__Constraints__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4200:1: ( ( 'rotation' ) )
            // InternalArdsl.g:4201:1: ( 'rotation' )
            {
            // InternalArdsl.g:4201:1: ( 'rotation' )
            // InternalArdsl.g:4202:2: 'rotation'
            {
             before(grammarAccess.getConstraintsAccess().getRotationKeyword_13()); 
            match(input,62,FOLLOW_2); 
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
    // InternalArdsl.g:4211:1: rule__Constraints__Group__14 : rule__Constraints__Group__14__Impl ;
    public final void rule__Constraints__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4215:1: ( rule__Constraints__Group__14__Impl )
            // InternalArdsl.g:4216:2: rule__Constraints__Group__14__Impl
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
    // InternalArdsl.g:4222:1: rule__Constraints__Group__14__Impl : ( ( rule__Constraints__RotationAssignment_14 ) ) ;
    public final void rule__Constraints__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4226:1: ( ( ( rule__Constraints__RotationAssignment_14 ) ) )
            // InternalArdsl.g:4227:1: ( ( rule__Constraints__RotationAssignment_14 ) )
            {
            // InternalArdsl.g:4227:1: ( ( rule__Constraints__RotationAssignment_14 ) )
            // InternalArdsl.g:4228:2: ( rule__Constraints__RotationAssignment_14 )
            {
             before(grammarAccess.getConstraintsAccess().getRotationAssignment_14()); 
            // InternalArdsl.g:4229:2: ( rule__Constraints__RotationAssignment_14 )
            // InternalArdsl.g:4229:3: rule__Constraints__RotationAssignment_14
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


    // $ANTLR start "rule__Physics__Group__0"
    // InternalArdsl.g:4238:1: rule__Physics__Group__0 : rule__Physics__Group__0__Impl rule__Physics__Group__1 ;
    public final void rule__Physics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4242:1: ( rule__Physics__Group__0__Impl rule__Physics__Group__1 )
            // InternalArdsl.g:4243:2: rule__Physics__Group__0__Impl rule__Physics__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Physics__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Physics__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Physics__Group__0"


    // $ANTLR start "rule__Physics__Group__0__Impl"
    // InternalArdsl.g:4250:1: rule__Physics__Group__0__Impl : ( 'Physics' ) ;
    public final void rule__Physics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4254:1: ( ( 'Physics' ) )
            // InternalArdsl.g:4255:1: ( 'Physics' )
            {
            // InternalArdsl.g:4255:1: ( 'Physics' )
            // InternalArdsl.g:4256:2: 'Physics'
            {
             before(grammarAccess.getPhysicsAccess().getPhysicsKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getPhysicsAccess().getPhysicsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Physics__Group__0__Impl"


    // $ANTLR start "rule__Physics__Group__1"
    // InternalArdsl.g:4265:1: rule__Physics__Group__1 : rule__Physics__Group__1__Impl rule__Physics__Group__2 ;
    public final void rule__Physics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4269:1: ( rule__Physics__Group__1__Impl rule__Physics__Group__2 )
            // InternalArdsl.g:4270:2: rule__Physics__Group__1__Impl rule__Physics__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Physics__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Physics__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Physics__Group__1"


    // $ANTLR start "rule__Physics__Group__1__Impl"
    // InternalArdsl.g:4277:1: rule__Physics__Group__1__Impl : ( '{' ) ;
    public final void rule__Physics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4281:1: ( ( '{' ) )
            // InternalArdsl.g:4282:1: ( '{' )
            {
            // InternalArdsl.g:4282:1: ( '{' )
            // InternalArdsl.g:4283:2: '{'
            {
             before(grammarAccess.getPhysicsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPhysicsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Physics__Group__1__Impl"


    // $ANTLR start "rule__Physics__Group__2"
    // InternalArdsl.g:4292:1: rule__Physics__Group__2 : rule__Physics__Group__2__Impl rule__Physics__Group__3 ;
    public final void rule__Physics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4296:1: ( rule__Physics__Group__2__Impl rule__Physics__Group__3 )
            // InternalArdsl.g:4297:2: rule__Physics__Group__2__Impl rule__Physics__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Physics__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Physics__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Physics__Group__2"


    // $ANTLR start "rule__Physics__Group__2__Impl"
    // InternalArdsl.g:4304:1: rule__Physics__Group__2__Impl : ( ( rule__Physics__ClassesAssignment_2 ) ) ;
    public final void rule__Physics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4308:1: ( ( ( rule__Physics__ClassesAssignment_2 ) ) )
            // InternalArdsl.g:4309:1: ( ( rule__Physics__ClassesAssignment_2 ) )
            {
            // InternalArdsl.g:4309:1: ( ( rule__Physics__ClassesAssignment_2 ) )
            // InternalArdsl.g:4310:2: ( rule__Physics__ClassesAssignment_2 )
            {
             before(grammarAccess.getPhysicsAccess().getClassesAssignment_2()); 
            // InternalArdsl.g:4311:2: ( rule__Physics__ClassesAssignment_2 )
            // InternalArdsl.g:4311:3: rule__Physics__ClassesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Physics__ClassesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPhysicsAccess().getClassesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Physics__Group__2__Impl"


    // $ANTLR start "rule__Physics__Group__3"
    // InternalArdsl.g:4319:1: rule__Physics__Group__3 : rule__Physics__Group__3__Impl rule__Physics__Group__4 ;
    public final void rule__Physics__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4323:1: ( rule__Physics__Group__3__Impl rule__Physics__Group__4 )
            // InternalArdsl.g:4324:2: rule__Physics__Group__3__Impl rule__Physics__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Physics__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Physics__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Physics__Group__3"


    // $ANTLR start "rule__Physics__Group__3__Impl"
    // InternalArdsl.g:4331:1: rule__Physics__Group__3__Impl : ( ( rule__Physics__Group_3__0 )* ) ;
    public final void rule__Physics__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4335:1: ( ( ( rule__Physics__Group_3__0 )* ) )
            // InternalArdsl.g:4336:1: ( ( rule__Physics__Group_3__0 )* )
            {
            // InternalArdsl.g:4336:1: ( ( rule__Physics__Group_3__0 )* )
            // InternalArdsl.g:4337:2: ( rule__Physics__Group_3__0 )*
            {
             before(grammarAccess.getPhysicsAccess().getGroup_3()); 
            // InternalArdsl.g:4338:2: ( rule__Physics__Group_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==40) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalArdsl.g:4338:3: rule__Physics__Group_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Physics__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getPhysicsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Physics__Group__3__Impl"


    // $ANTLR start "rule__Physics__Group__4"
    // InternalArdsl.g:4346:1: rule__Physics__Group__4 : rule__Physics__Group__4__Impl ;
    public final void rule__Physics__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4350:1: ( rule__Physics__Group__4__Impl )
            // InternalArdsl.g:4351:2: rule__Physics__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Physics__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Physics__Group__4"


    // $ANTLR start "rule__Physics__Group__4__Impl"
    // InternalArdsl.g:4357:1: rule__Physics__Group__4__Impl : ( '}' ) ;
    public final void rule__Physics__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4361:1: ( ( '}' ) )
            // InternalArdsl.g:4362:1: ( '}' )
            {
            // InternalArdsl.g:4362:1: ( '}' )
            // InternalArdsl.g:4363:2: '}'
            {
             before(grammarAccess.getPhysicsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPhysicsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Physics__Group__4__Impl"


    // $ANTLR start "rule__Physics__Group_3__0"
    // InternalArdsl.g:4373:1: rule__Physics__Group_3__0 : rule__Physics__Group_3__0__Impl rule__Physics__Group_3__1 ;
    public final void rule__Physics__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4377:1: ( rule__Physics__Group_3__0__Impl rule__Physics__Group_3__1 )
            // InternalArdsl.g:4378:2: rule__Physics__Group_3__0__Impl rule__Physics__Group_3__1
            {
            pushFollow(FOLLOW_28);
            rule__Physics__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Physics__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Physics__Group_3__0"


    // $ANTLR start "rule__Physics__Group_3__0__Impl"
    // InternalArdsl.g:4385:1: rule__Physics__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Physics__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4389:1: ( ( ',' ) )
            // InternalArdsl.g:4390:1: ( ',' )
            {
            // InternalArdsl.g:4390:1: ( ',' )
            // InternalArdsl.g:4391:2: ','
            {
             before(grammarAccess.getPhysicsAccess().getCommaKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPhysicsAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Physics__Group_3__0__Impl"


    // $ANTLR start "rule__Physics__Group_3__1"
    // InternalArdsl.g:4400:1: rule__Physics__Group_3__1 : rule__Physics__Group_3__1__Impl ;
    public final void rule__Physics__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4404:1: ( rule__Physics__Group_3__1__Impl )
            // InternalArdsl.g:4405:2: rule__Physics__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Physics__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Physics__Group_3__1"


    // $ANTLR start "rule__Physics__Group_3__1__Impl"
    // InternalArdsl.g:4411:1: rule__Physics__Group_3__1__Impl : ( ( rule__Physics__ClassesAssignment_3_1 ) ) ;
    public final void rule__Physics__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4415:1: ( ( ( rule__Physics__ClassesAssignment_3_1 ) ) )
            // InternalArdsl.g:4416:1: ( ( rule__Physics__ClassesAssignment_3_1 ) )
            {
            // InternalArdsl.g:4416:1: ( ( rule__Physics__ClassesAssignment_3_1 ) )
            // InternalArdsl.g:4417:2: ( rule__Physics__ClassesAssignment_3_1 )
            {
             before(grammarAccess.getPhysicsAccess().getClassesAssignment_3_1()); 
            // InternalArdsl.g:4418:2: ( rule__Physics__ClassesAssignment_3_1 )
            // InternalArdsl.g:4418:3: rule__Physics__ClassesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Physics__ClassesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicsAccess().getClassesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Physics__Group_3__1__Impl"


    // $ANTLR start "rule__PhysicClass__Group__0"
    // InternalArdsl.g:4427:1: rule__PhysicClass__Group__0 : rule__PhysicClass__Group__0__Impl rule__PhysicClass__Group__1 ;
    public final void rule__PhysicClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4431:1: ( rule__PhysicClass__Group__0__Impl rule__PhysicClass__Group__1 )
            // InternalArdsl.g:4432:2: rule__PhysicClass__Group__0__Impl rule__PhysicClass__Group__1
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
    // InternalArdsl.g:4439:1: rule__PhysicClass__Group__0__Impl : ( 'element' ) ;
    public final void rule__PhysicClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4443:1: ( ( 'element' ) )
            // InternalArdsl.g:4444:1: ( 'element' )
            {
            // InternalArdsl.g:4444:1: ( 'element' )
            // InternalArdsl.g:4445:2: 'element'
            {
             before(grammarAccess.getPhysicClassAccess().getElementKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalArdsl.g:4454:1: rule__PhysicClass__Group__1 : rule__PhysicClass__Group__1__Impl rule__PhysicClass__Group__2 ;
    public final void rule__PhysicClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4458:1: ( rule__PhysicClass__Group__1__Impl rule__PhysicClass__Group__2 )
            // InternalArdsl.g:4459:2: rule__PhysicClass__Group__1__Impl rule__PhysicClass__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalArdsl.g:4466:1: rule__PhysicClass__Group__1__Impl : ( ( rule__PhysicClass__OntoClassAssignment_1 ) ) ;
    public final void rule__PhysicClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4470:1: ( ( ( rule__PhysicClass__OntoClassAssignment_1 ) ) )
            // InternalArdsl.g:4471:1: ( ( rule__PhysicClass__OntoClassAssignment_1 ) )
            {
            // InternalArdsl.g:4471:1: ( ( rule__PhysicClass__OntoClassAssignment_1 ) )
            // InternalArdsl.g:4472:2: ( rule__PhysicClass__OntoClassAssignment_1 )
            {
             before(grammarAccess.getPhysicClassAccess().getOntoClassAssignment_1()); 
            // InternalArdsl.g:4473:2: ( rule__PhysicClass__OntoClassAssignment_1 )
            // InternalArdsl.g:4473:3: rule__PhysicClass__OntoClassAssignment_1
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
    // InternalArdsl.g:4481:1: rule__PhysicClass__Group__2 : rule__PhysicClass__Group__2__Impl rule__PhysicClass__Group__3 ;
    public final void rule__PhysicClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4485:1: ( rule__PhysicClass__Group__2__Impl rule__PhysicClass__Group__3 )
            // InternalArdsl.g:4486:2: rule__PhysicClass__Group__2__Impl rule__PhysicClass__Group__3
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
    // InternalArdsl.g:4493:1: rule__PhysicClass__Group__2__Impl : ( 'body' ) ;
    public final void rule__PhysicClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4497:1: ( ( 'body' ) )
            // InternalArdsl.g:4498:1: ( 'body' )
            {
            // InternalArdsl.g:4498:1: ( 'body' )
            // InternalArdsl.g:4499:2: 'body'
            {
             before(grammarAccess.getPhysicClassAccess().getBodyKeyword_2()); 
            match(input,64,FOLLOW_2); 
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
    // InternalArdsl.g:4508:1: rule__PhysicClass__Group__3 : rule__PhysicClass__Group__3__Impl rule__PhysicClass__Group__4 ;
    public final void rule__PhysicClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4512:1: ( rule__PhysicClass__Group__3__Impl rule__PhysicClass__Group__4 )
            // InternalArdsl.g:4513:2: rule__PhysicClass__Group__3__Impl rule__PhysicClass__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalArdsl.g:4520:1: rule__PhysicClass__Group__3__Impl : ( '{' ) ;
    public final void rule__PhysicClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4524:1: ( ( '{' ) )
            // InternalArdsl.g:4525:1: ( '{' )
            {
            // InternalArdsl.g:4525:1: ( '{' )
            // InternalArdsl.g:4526:2: '{'
            {
             before(grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalArdsl.g:4535:1: rule__PhysicClass__Group__4 : rule__PhysicClass__Group__4__Impl rule__PhysicClass__Group__5 ;
    public final void rule__PhysicClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4539:1: ( rule__PhysicClass__Group__4__Impl rule__PhysicClass__Group__5 )
            // InternalArdsl.g:4540:2: rule__PhysicClass__Group__4__Impl rule__PhysicClass__Group__5
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
    // InternalArdsl.g:4547:1: rule__PhysicClass__Group__4__Impl : ( ( rule__PhysicClass__PhysicBodyAssignment_4 ) ) ;
    public final void rule__PhysicClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4551:1: ( ( ( rule__PhysicClass__PhysicBodyAssignment_4 ) ) )
            // InternalArdsl.g:4552:1: ( ( rule__PhysicClass__PhysicBodyAssignment_4 ) )
            {
            // InternalArdsl.g:4552:1: ( ( rule__PhysicClass__PhysicBodyAssignment_4 ) )
            // InternalArdsl.g:4553:2: ( rule__PhysicClass__PhysicBodyAssignment_4 )
            {
             before(grammarAccess.getPhysicClassAccess().getPhysicBodyAssignment_4()); 
            // InternalArdsl.g:4554:2: ( rule__PhysicClass__PhysicBodyAssignment_4 )
            // InternalArdsl.g:4554:3: rule__PhysicClass__PhysicBodyAssignment_4
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
    // InternalArdsl.g:4562:1: rule__PhysicClass__Group__5 : rule__PhysicClass__Group__5__Impl rule__PhysicClass__Group__6 ;
    public final void rule__PhysicClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4566:1: ( rule__PhysicClass__Group__5__Impl rule__PhysicClass__Group__6 )
            // InternalArdsl.g:4567:2: rule__PhysicClass__Group__5__Impl rule__PhysicClass__Group__6
            {
            pushFollow(FOLLOW_43);
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
    // InternalArdsl.g:4574:1: rule__PhysicClass__Group__5__Impl : ( '}' ) ;
    public final void rule__PhysicClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4578:1: ( ( '}' ) )
            // InternalArdsl.g:4579:1: ( '}' )
            {
            // InternalArdsl.g:4579:1: ( '}' )
            // InternalArdsl.g:4580:2: '}'
            {
             before(grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalArdsl.g:4589:1: rule__PhysicClass__Group__6 : rule__PhysicClass__Group__6__Impl rule__PhysicClass__Group__7 ;
    public final void rule__PhysicClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4593:1: ( rule__PhysicClass__Group__6__Impl rule__PhysicClass__Group__7 )
            // InternalArdsl.g:4594:2: rule__PhysicClass__Group__6__Impl rule__PhysicClass__Group__7
            {
            pushFollow(FOLLOW_43);
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
    // InternalArdsl.g:4601:1: rule__PhysicClass__Group__6__Impl : ( ( rule__PhysicClass__Group_6__0 )? ) ;
    public final void rule__PhysicClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4605:1: ( ( ( rule__PhysicClass__Group_6__0 )? ) )
            // InternalArdsl.g:4606:1: ( ( rule__PhysicClass__Group_6__0 )? )
            {
            // InternalArdsl.g:4606:1: ( ( rule__PhysicClass__Group_6__0 )? )
            // InternalArdsl.g:4607:2: ( rule__PhysicClass__Group_6__0 )?
            {
             before(grammarAccess.getPhysicClassAccess().getGroup_6()); 
            // InternalArdsl.g:4608:2: ( rule__PhysicClass__Group_6__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==66) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalArdsl.g:4608:3: rule__PhysicClass__Group_6__0
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
    // InternalArdsl.g:4616:1: rule__PhysicClass__Group__7 : rule__PhysicClass__Group__7__Impl rule__PhysicClass__Group__8 ;
    public final void rule__PhysicClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4620:1: ( rule__PhysicClass__Group__7__Impl rule__PhysicClass__Group__8 )
            // InternalArdsl.g:4621:2: rule__PhysicClass__Group__7__Impl rule__PhysicClass__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__PhysicClass__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group__8();

            state._fsp--;


            }

        }
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
    // InternalArdsl.g:4628:1: rule__PhysicClass__Group__7__Impl : ( 'contacts' ) ;
    public final void rule__PhysicClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4632:1: ( ( 'contacts' ) )
            // InternalArdsl.g:4633:1: ( 'contacts' )
            {
            // InternalArdsl.g:4633:1: ( 'contacts' )
            // InternalArdsl.g:4634:2: 'contacts'
            {
             before(grammarAccess.getPhysicClassAccess().getContactsKeyword_7()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getPhysicClassAccess().getContactsKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__PhysicClass__Group__8"
    // InternalArdsl.g:4643:1: rule__PhysicClass__Group__8 : rule__PhysicClass__Group__8__Impl rule__PhysicClass__Group__9 ;
    public final void rule__PhysicClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4647:1: ( rule__PhysicClass__Group__8__Impl rule__PhysicClass__Group__9 )
            // InternalArdsl.g:4648:2: rule__PhysicClass__Group__8__Impl rule__PhysicClass__Group__9
            {
            pushFollow(FOLLOW_44);
            rule__PhysicClass__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicClass__Group__8"


    // $ANTLR start "rule__PhysicClass__Group__8__Impl"
    // InternalArdsl.g:4655:1: rule__PhysicClass__Group__8__Impl : ( '{' ) ;
    public final void rule__PhysicClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4659:1: ( ( '{' ) )
            // InternalArdsl.g:4660:1: ( '{' )
            {
            // InternalArdsl.g:4660:1: ( '{' )
            // InternalArdsl.g:4661:2: '{'
            {
             before(grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicClass__Group__8__Impl"


    // $ANTLR start "rule__PhysicClass__Group__9"
    // InternalArdsl.g:4670:1: rule__PhysicClass__Group__9 : rule__PhysicClass__Group__9__Impl rule__PhysicClass__Group__10 ;
    public final void rule__PhysicClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4674:1: ( rule__PhysicClass__Group__9__Impl rule__PhysicClass__Group__10 )
            // InternalArdsl.g:4675:2: rule__PhysicClass__Group__9__Impl rule__PhysicClass__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__PhysicClass__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicClass__Group__9"


    // $ANTLR start "rule__PhysicClass__Group__9__Impl"
    // InternalArdsl.g:4682:1: rule__PhysicClass__Group__9__Impl : ( ( rule__PhysicClass__BitMasksAssignment_9 ) ) ;
    public final void rule__PhysicClass__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4686:1: ( ( ( rule__PhysicClass__BitMasksAssignment_9 ) ) )
            // InternalArdsl.g:4687:1: ( ( rule__PhysicClass__BitMasksAssignment_9 ) )
            {
            // InternalArdsl.g:4687:1: ( ( rule__PhysicClass__BitMasksAssignment_9 ) )
            // InternalArdsl.g:4688:2: ( rule__PhysicClass__BitMasksAssignment_9 )
            {
             before(grammarAccess.getPhysicClassAccess().getBitMasksAssignment_9()); 
            // InternalArdsl.g:4689:2: ( rule__PhysicClass__BitMasksAssignment_9 )
            // InternalArdsl.g:4689:3: rule__PhysicClass__BitMasksAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__PhysicClass__BitMasksAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPhysicClassAccess().getBitMasksAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicClass__Group__9__Impl"


    // $ANTLR start "rule__PhysicClass__Group__10"
    // InternalArdsl.g:4697:1: rule__PhysicClass__Group__10 : rule__PhysicClass__Group__10__Impl ;
    public final void rule__PhysicClass__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4701:1: ( rule__PhysicClass__Group__10__Impl )
            // InternalArdsl.g:4702:2: rule__PhysicClass__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicClass__Group__10"


    // $ANTLR start "rule__PhysicClass__Group__10__Impl"
    // InternalArdsl.g:4708:1: rule__PhysicClass__Group__10__Impl : ( '}' ) ;
    public final void rule__PhysicClass__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4712:1: ( ( '}' ) )
            // InternalArdsl.g:4713:1: ( '}' )
            {
            // InternalArdsl.g:4713:1: ( '}' )
            // InternalArdsl.g:4714:2: '}'
            {
             before(grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_10()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicClass__Group__10__Impl"


    // $ANTLR start "rule__PhysicClass__Group_6__0"
    // InternalArdsl.g:4724:1: rule__PhysicClass__Group_6__0 : rule__PhysicClass__Group_6__0__Impl rule__PhysicClass__Group_6__1 ;
    public final void rule__PhysicClass__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4728:1: ( rule__PhysicClass__Group_6__0__Impl rule__PhysicClass__Group_6__1 )
            // InternalArdsl.g:4729:2: rule__PhysicClass__Group_6__0__Impl rule__PhysicClass__Group_6__1
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
    // InternalArdsl.g:4736:1: rule__PhysicClass__Group_6__0__Impl : ( 'forces' ) ;
    public final void rule__PhysicClass__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4740:1: ( ( 'forces' ) )
            // InternalArdsl.g:4741:1: ( 'forces' )
            {
            // InternalArdsl.g:4741:1: ( 'forces' )
            // InternalArdsl.g:4742:2: 'forces'
            {
             before(grammarAccess.getPhysicClassAccess().getForcesKeyword_6_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalArdsl.g:4751:1: rule__PhysicClass__Group_6__1 : rule__PhysicClass__Group_6__1__Impl rule__PhysicClass__Group_6__2 ;
    public final void rule__PhysicClass__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4755:1: ( rule__PhysicClass__Group_6__1__Impl rule__PhysicClass__Group_6__2 )
            // InternalArdsl.g:4756:2: rule__PhysicClass__Group_6__1__Impl rule__PhysicClass__Group_6__2
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
    // InternalArdsl.g:4763:1: rule__PhysicClass__Group_6__1__Impl : ( '{' ) ;
    public final void rule__PhysicClass__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4767:1: ( ( '{' ) )
            // InternalArdsl.g:4768:1: ( '{' )
            {
            // InternalArdsl.g:4768:1: ( '{' )
            // InternalArdsl.g:4769:2: '{'
            {
             before(grammarAccess.getPhysicClassAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalArdsl.g:4778:1: rule__PhysicClass__Group_6__2 : rule__PhysicClass__Group_6__2__Impl rule__PhysicClass__Group_6__3 ;
    public final void rule__PhysicClass__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4782:1: ( rule__PhysicClass__Group_6__2__Impl rule__PhysicClass__Group_6__3 )
            // InternalArdsl.g:4783:2: rule__PhysicClass__Group_6__2__Impl rule__PhysicClass__Group_6__3
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
    // InternalArdsl.g:4790:1: rule__PhysicClass__Group_6__2__Impl : ( ( rule__PhysicClass__ForcesAssignment_6_2 ) ) ;
    public final void rule__PhysicClass__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4794:1: ( ( ( rule__PhysicClass__ForcesAssignment_6_2 ) ) )
            // InternalArdsl.g:4795:1: ( ( rule__PhysicClass__ForcesAssignment_6_2 ) )
            {
            // InternalArdsl.g:4795:1: ( ( rule__PhysicClass__ForcesAssignment_6_2 ) )
            // InternalArdsl.g:4796:2: ( rule__PhysicClass__ForcesAssignment_6_2 )
            {
             before(grammarAccess.getPhysicClassAccess().getForcesAssignment_6_2()); 
            // InternalArdsl.g:4797:2: ( rule__PhysicClass__ForcesAssignment_6_2 )
            // InternalArdsl.g:4797:3: rule__PhysicClass__ForcesAssignment_6_2
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
    // InternalArdsl.g:4805:1: rule__PhysicClass__Group_6__3 : rule__PhysicClass__Group_6__3__Impl rule__PhysicClass__Group_6__4 ;
    public final void rule__PhysicClass__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4809:1: ( rule__PhysicClass__Group_6__3__Impl rule__PhysicClass__Group_6__4 )
            // InternalArdsl.g:4810:2: rule__PhysicClass__Group_6__3__Impl rule__PhysicClass__Group_6__4
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
    // InternalArdsl.g:4817:1: rule__PhysicClass__Group_6__3__Impl : ( ( rule__PhysicClass__Group_6_3__0 )* ) ;
    public final void rule__PhysicClass__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4821:1: ( ( ( rule__PhysicClass__Group_6_3__0 )* ) )
            // InternalArdsl.g:4822:1: ( ( rule__PhysicClass__Group_6_3__0 )* )
            {
            // InternalArdsl.g:4822:1: ( ( rule__PhysicClass__Group_6_3__0 )* )
            // InternalArdsl.g:4823:2: ( rule__PhysicClass__Group_6_3__0 )*
            {
             before(grammarAccess.getPhysicClassAccess().getGroup_6_3()); 
            // InternalArdsl.g:4824:2: ( rule__PhysicClass__Group_6_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==40) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalArdsl.g:4824:3: rule__PhysicClass__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PhysicClass__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getPhysicClassAccess().getGroup_6_3()); 

            }


            }

        }
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
    // InternalArdsl.g:4832:1: rule__PhysicClass__Group_6__4 : rule__PhysicClass__Group_6__4__Impl ;
    public final void rule__PhysicClass__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4836:1: ( rule__PhysicClass__Group_6__4__Impl )
            // InternalArdsl.g:4837:2: rule__PhysicClass__Group_6__4__Impl
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
    // InternalArdsl.g:4843:1: rule__PhysicClass__Group_6__4__Impl : ( '}' ) ;
    public final void rule__PhysicClass__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4847:1: ( ( '}' ) )
            // InternalArdsl.g:4848:1: ( '}' )
            {
            // InternalArdsl.g:4848:1: ( '}' )
            // InternalArdsl.g:4849:2: '}'
            {
             before(grammarAccess.getPhysicClassAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__PhysicClass__Group_6_3__0"
    // InternalArdsl.g:4859:1: rule__PhysicClass__Group_6_3__0 : rule__PhysicClass__Group_6_3__0__Impl rule__PhysicClass__Group_6_3__1 ;
    public final void rule__PhysicClass__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4863:1: ( rule__PhysicClass__Group_6_3__0__Impl rule__PhysicClass__Group_6_3__1 )
            // InternalArdsl.g:4864:2: rule__PhysicClass__Group_6_3__0__Impl rule__PhysicClass__Group_6_3__1
            {
            pushFollow(FOLLOW_3);
            rule__PhysicClass__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicClass__Group_6_3__0"


    // $ANTLR start "rule__PhysicClass__Group_6_3__0__Impl"
    // InternalArdsl.g:4871:1: rule__PhysicClass__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__PhysicClass__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4875:1: ( ( ',' ) )
            // InternalArdsl.g:4876:1: ( ',' )
            {
            // InternalArdsl.g:4876:1: ( ',' )
            // InternalArdsl.g:4877:2: ','
            {
             before(grammarAccess.getPhysicClassAccess().getCommaKeyword_6_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPhysicClassAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicClass__Group_6_3__0__Impl"


    // $ANTLR start "rule__PhysicClass__Group_6_3__1"
    // InternalArdsl.g:4886:1: rule__PhysicClass__Group_6_3__1 : rule__PhysicClass__Group_6_3__1__Impl ;
    public final void rule__PhysicClass__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4890:1: ( rule__PhysicClass__Group_6_3__1__Impl )
            // InternalArdsl.g:4891:2: rule__PhysicClass__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicClass__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicClass__Group_6_3__1"


    // $ANTLR start "rule__PhysicClass__Group_6_3__1__Impl"
    // InternalArdsl.g:4897:1: rule__PhysicClass__Group_6_3__1__Impl : ( ( rule__PhysicClass__ForcesAssignment_6_3_1 ) ) ;
    public final void rule__PhysicClass__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4901:1: ( ( ( rule__PhysicClass__ForcesAssignment_6_3_1 ) ) )
            // InternalArdsl.g:4902:1: ( ( rule__PhysicClass__ForcesAssignment_6_3_1 ) )
            {
            // InternalArdsl.g:4902:1: ( ( rule__PhysicClass__ForcesAssignment_6_3_1 ) )
            // InternalArdsl.g:4903:2: ( rule__PhysicClass__ForcesAssignment_6_3_1 )
            {
             before(grammarAccess.getPhysicClassAccess().getForcesAssignment_6_3_1()); 
            // InternalArdsl.g:4904:2: ( rule__PhysicClass__ForcesAssignment_6_3_1 )
            // InternalArdsl.g:4904:3: rule__PhysicClass__ForcesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicClass__ForcesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicClassAccess().getForcesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicClass__Group_6_3__1__Impl"


    // $ANTLR start "rule__PhysicBody__Group__0"
    // InternalArdsl.g:4913:1: rule__PhysicBody__Group__0 : rule__PhysicBody__Group__0__Impl rule__PhysicBody__Group__1 ;
    public final void rule__PhysicBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4917:1: ( rule__PhysicBody__Group__0__Impl rule__PhysicBody__Group__1 )
            // InternalArdsl.g:4918:2: rule__PhysicBody__Group__0__Impl rule__PhysicBody__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalArdsl.g:4925:1: rule__PhysicBody__Group__0__Impl : ( 'mass' ) ;
    public final void rule__PhysicBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4929:1: ( ( 'mass' ) )
            // InternalArdsl.g:4930:1: ( 'mass' )
            {
            // InternalArdsl.g:4930:1: ( 'mass' )
            // InternalArdsl.g:4931:2: 'mass'
            {
             before(grammarAccess.getPhysicBodyAccess().getMassKeyword_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalArdsl.g:4940:1: rule__PhysicBody__Group__1 : rule__PhysicBody__Group__1__Impl rule__PhysicBody__Group__2 ;
    public final void rule__PhysicBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4944:1: ( rule__PhysicBody__Group__1__Impl rule__PhysicBody__Group__2 )
            // InternalArdsl.g:4945:2: rule__PhysicBody__Group__1__Impl rule__PhysicBody__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalArdsl.g:4952:1: rule__PhysicBody__Group__1__Impl : ( ( rule__PhysicBody__MassAssignment_1 ) ) ;
    public final void rule__PhysicBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4956:1: ( ( ( rule__PhysicBody__MassAssignment_1 ) ) )
            // InternalArdsl.g:4957:1: ( ( rule__PhysicBody__MassAssignment_1 ) )
            {
            // InternalArdsl.g:4957:1: ( ( rule__PhysicBody__MassAssignment_1 ) )
            // InternalArdsl.g:4958:2: ( rule__PhysicBody__MassAssignment_1 )
            {
             before(grammarAccess.getPhysicBodyAccess().getMassAssignment_1()); 
            // InternalArdsl.g:4959:2: ( rule__PhysicBody__MassAssignment_1 )
            // InternalArdsl.g:4959:3: rule__PhysicBody__MassAssignment_1
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
    // InternalArdsl.g:4967:1: rule__PhysicBody__Group__2 : rule__PhysicBody__Group__2__Impl rule__PhysicBody__Group__3 ;
    public final void rule__PhysicBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4971:1: ( rule__PhysicBody__Group__2__Impl rule__PhysicBody__Group__3 )
            // InternalArdsl.g:4972:2: rule__PhysicBody__Group__2__Impl rule__PhysicBody__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalArdsl.g:4979:1: rule__PhysicBody__Group__2__Impl : ( 'bodyType' ) ;
    public final void rule__PhysicBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4983:1: ( ( 'bodyType' ) )
            // InternalArdsl.g:4984:1: ( 'bodyType' )
            {
            // InternalArdsl.g:4984:1: ( 'bodyType' )
            // InternalArdsl.g:4985:2: 'bodyType'
            {
             before(grammarAccess.getPhysicBodyAccess().getBodyTypeKeyword_2()); 
            match(input,68,FOLLOW_2); 
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
    // InternalArdsl.g:4994:1: rule__PhysicBody__Group__3 : rule__PhysicBody__Group__3__Impl rule__PhysicBody__Group__4 ;
    public final void rule__PhysicBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:4998:1: ( rule__PhysicBody__Group__3__Impl rule__PhysicBody__Group__4 )
            // InternalArdsl.g:4999:2: rule__PhysicBody__Group__3__Impl rule__PhysicBody__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalArdsl.g:5006:1: rule__PhysicBody__Group__3__Impl : ( ( rule__PhysicBody__BodyTypeAssignment_3 ) ) ;
    public final void rule__PhysicBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5010:1: ( ( ( rule__PhysicBody__BodyTypeAssignment_3 ) ) )
            // InternalArdsl.g:5011:1: ( ( rule__PhysicBody__BodyTypeAssignment_3 ) )
            {
            // InternalArdsl.g:5011:1: ( ( rule__PhysicBody__BodyTypeAssignment_3 ) )
            // InternalArdsl.g:5012:2: ( rule__PhysicBody__BodyTypeAssignment_3 )
            {
             before(grammarAccess.getPhysicBodyAccess().getBodyTypeAssignment_3()); 
            // InternalArdsl.g:5013:2: ( rule__PhysicBody__BodyTypeAssignment_3 )
            // InternalArdsl.g:5013:3: rule__PhysicBody__BodyTypeAssignment_3
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
    // InternalArdsl.g:5021:1: rule__PhysicBody__Group__4 : rule__PhysicBody__Group__4__Impl rule__PhysicBody__Group__5 ;
    public final void rule__PhysicBody__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5025:1: ( rule__PhysicBody__Group__4__Impl rule__PhysicBody__Group__5 )
            // InternalArdsl.g:5026:2: rule__PhysicBody__Group__4__Impl rule__PhysicBody__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalArdsl.g:5033:1: rule__PhysicBody__Group__4__Impl : ( 'charge' ) ;
    public final void rule__PhysicBody__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5037:1: ( ( 'charge' ) )
            // InternalArdsl.g:5038:1: ( 'charge' )
            {
            // InternalArdsl.g:5038:1: ( 'charge' )
            // InternalArdsl.g:5039:2: 'charge'
            {
             before(grammarAccess.getPhysicBodyAccess().getChargeKeyword_4()); 
            match(input,69,FOLLOW_2); 
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
    // InternalArdsl.g:5048:1: rule__PhysicBody__Group__5 : rule__PhysicBody__Group__5__Impl rule__PhysicBody__Group__6 ;
    public final void rule__PhysicBody__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5052:1: ( rule__PhysicBody__Group__5__Impl rule__PhysicBody__Group__6 )
            // InternalArdsl.g:5053:2: rule__PhysicBody__Group__5__Impl rule__PhysicBody__Group__6
            {
            pushFollow(FOLLOW_48);
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
    // InternalArdsl.g:5060:1: rule__PhysicBody__Group__5__Impl : ( ( rule__PhysicBody__ChargeAssignment_5 ) ) ;
    public final void rule__PhysicBody__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5064:1: ( ( ( rule__PhysicBody__ChargeAssignment_5 ) ) )
            // InternalArdsl.g:5065:1: ( ( rule__PhysicBody__ChargeAssignment_5 ) )
            {
            // InternalArdsl.g:5065:1: ( ( rule__PhysicBody__ChargeAssignment_5 ) )
            // InternalArdsl.g:5066:2: ( rule__PhysicBody__ChargeAssignment_5 )
            {
             before(grammarAccess.getPhysicBodyAccess().getChargeAssignment_5()); 
            // InternalArdsl.g:5067:2: ( rule__PhysicBody__ChargeAssignment_5 )
            // InternalArdsl.g:5067:3: rule__PhysicBody__ChargeAssignment_5
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
    // InternalArdsl.g:5075:1: rule__PhysicBody__Group__6 : rule__PhysicBody__Group__6__Impl rule__PhysicBody__Group__7 ;
    public final void rule__PhysicBody__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5079:1: ( rule__PhysicBody__Group__6__Impl rule__PhysicBody__Group__7 )
            // InternalArdsl.g:5080:2: rule__PhysicBody__Group__6__Impl rule__PhysicBody__Group__7
            {
            pushFollow(FOLLOW_35);
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
    // InternalArdsl.g:5087:1: rule__PhysicBody__Group__6__Impl : ( 'friction' ) ;
    public final void rule__PhysicBody__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5091:1: ( ( 'friction' ) )
            // InternalArdsl.g:5092:1: ( 'friction' )
            {
            // InternalArdsl.g:5092:1: ( 'friction' )
            // InternalArdsl.g:5093:2: 'friction'
            {
             before(grammarAccess.getPhysicBodyAccess().getFrictionKeyword_6()); 
            match(input,70,FOLLOW_2); 
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
    // InternalArdsl.g:5102:1: rule__PhysicBody__Group__7 : rule__PhysicBody__Group__7__Impl rule__PhysicBody__Group__8 ;
    public final void rule__PhysicBody__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5106:1: ( rule__PhysicBody__Group__7__Impl rule__PhysicBody__Group__8 )
            // InternalArdsl.g:5107:2: rule__PhysicBody__Group__7__Impl rule__PhysicBody__Group__8
            {
            pushFollow(FOLLOW_49);
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
    // InternalArdsl.g:5114:1: rule__PhysicBody__Group__7__Impl : ( ( rule__PhysicBody__FrictionAssignment_7 ) ) ;
    public final void rule__PhysicBody__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5118:1: ( ( ( rule__PhysicBody__FrictionAssignment_7 ) ) )
            // InternalArdsl.g:5119:1: ( ( rule__PhysicBody__FrictionAssignment_7 ) )
            {
            // InternalArdsl.g:5119:1: ( ( rule__PhysicBody__FrictionAssignment_7 ) )
            // InternalArdsl.g:5120:2: ( rule__PhysicBody__FrictionAssignment_7 )
            {
             before(grammarAccess.getPhysicBodyAccess().getFrictionAssignment_7()); 
            // InternalArdsl.g:5121:2: ( rule__PhysicBody__FrictionAssignment_7 )
            // InternalArdsl.g:5121:3: rule__PhysicBody__FrictionAssignment_7
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
    // InternalArdsl.g:5129:1: rule__PhysicBody__Group__8 : rule__PhysicBody__Group__8__Impl rule__PhysicBody__Group__9 ;
    public final void rule__PhysicBody__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5133:1: ( rule__PhysicBody__Group__8__Impl rule__PhysicBody__Group__9 )
            // InternalArdsl.g:5134:2: rule__PhysicBody__Group__8__Impl rule__PhysicBody__Group__9
            {
            pushFollow(FOLLOW_35);
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
    // InternalArdsl.g:5141:1: rule__PhysicBody__Group__8__Impl : ( 'rollingFriction' ) ;
    public final void rule__PhysicBody__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5145:1: ( ( 'rollingFriction' ) )
            // InternalArdsl.g:5146:1: ( 'rollingFriction' )
            {
            // InternalArdsl.g:5146:1: ( 'rollingFriction' )
            // InternalArdsl.g:5147:2: 'rollingFriction'
            {
             before(grammarAccess.getPhysicBodyAccess().getRollingFrictionKeyword_8()); 
            match(input,71,FOLLOW_2); 
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
    // InternalArdsl.g:5156:1: rule__PhysicBody__Group__9 : rule__PhysicBody__Group__9__Impl rule__PhysicBody__Group__10 ;
    public final void rule__PhysicBody__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5160:1: ( rule__PhysicBody__Group__9__Impl rule__PhysicBody__Group__10 )
            // InternalArdsl.g:5161:2: rule__PhysicBody__Group__9__Impl rule__PhysicBody__Group__10
            {
            pushFollow(FOLLOW_50);
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
    // InternalArdsl.g:5168:1: rule__PhysicBody__Group__9__Impl : ( ( rule__PhysicBody__RollingFrictionAssignment_9 ) ) ;
    public final void rule__PhysicBody__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5172:1: ( ( ( rule__PhysicBody__RollingFrictionAssignment_9 ) ) )
            // InternalArdsl.g:5173:1: ( ( rule__PhysicBody__RollingFrictionAssignment_9 ) )
            {
            // InternalArdsl.g:5173:1: ( ( rule__PhysicBody__RollingFrictionAssignment_9 ) )
            // InternalArdsl.g:5174:2: ( rule__PhysicBody__RollingFrictionAssignment_9 )
            {
             before(grammarAccess.getPhysicBodyAccess().getRollingFrictionAssignment_9()); 
            // InternalArdsl.g:5175:2: ( rule__PhysicBody__RollingFrictionAssignment_9 )
            // InternalArdsl.g:5175:3: rule__PhysicBody__RollingFrictionAssignment_9
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
    // InternalArdsl.g:5183:1: rule__PhysicBody__Group__10 : rule__PhysicBody__Group__10__Impl rule__PhysicBody__Group__11 ;
    public final void rule__PhysicBody__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5187:1: ( rule__PhysicBody__Group__10__Impl rule__PhysicBody__Group__11 )
            // InternalArdsl.g:5188:2: rule__PhysicBody__Group__10__Impl rule__PhysicBody__Group__11
            {
            pushFollow(FOLLOW_35);
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
    // InternalArdsl.g:5195:1: rule__PhysicBody__Group__10__Impl : ( 'restitution' ) ;
    public final void rule__PhysicBody__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5199:1: ( ( 'restitution' ) )
            // InternalArdsl.g:5200:1: ( 'restitution' )
            {
            // InternalArdsl.g:5200:1: ( 'restitution' )
            // InternalArdsl.g:5201:2: 'restitution'
            {
             before(grammarAccess.getPhysicBodyAccess().getRestitutionKeyword_10()); 
            match(input,72,FOLLOW_2); 
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
    // InternalArdsl.g:5210:1: rule__PhysicBody__Group__11 : rule__PhysicBody__Group__11__Impl rule__PhysicBody__Group__12 ;
    public final void rule__PhysicBody__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5214:1: ( rule__PhysicBody__Group__11__Impl rule__PhysicBody__Group__12 )
            // InternalArdsl.g:5215:2: rule__PhysicBody__Group__11__Impl rule__PhysicBody__Group__12
            {
            pushFollow(FOLLOW_51);
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
    // InternalArdsl.g:5222:1: rule__PhysicBody__Group__11__Impl : ( ( rule__PhysicBody__RestitutionAssignment_11 ) ) ;
    public final void rule__PhysicBody__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5226:1: ( ( ( rule__PhysicBody__RestitutionAssignment_11 ) ) )
            // InternalArdsl.g:5227:1: ( ( rule__PhysicBody__RestitutionAssignment_11 ) )
            {
            // InternalArdsl.g:5227:1: ( ( rule__PhysicBody__RestitutionAssignment_11 ) )
            // InternalArdsl.g:5228:2: ( rule__PhysicBody__RestitutionAssignment_11 )
            {
             before(grammarAccess.getPhysicBodyAccess().getRestitutionAssignment_11()); 
            // InternalArdsl.g:5229:2: ( rule__PhysicBody__RestitutionAssignment_11 )
            // InternalArdsl.g:5229:3: rule__PhysicBody__RestitutionAssignment_11
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
    // InternalArdsl.g:5237:1: rule__PhysicBody__Group__12 : rule__PhysicBody__Group__12__Impl rule__PhysicBody__Group__13 ;
    public final void rule__PhysicBody__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5241:1: ( rule__PhysicBody__Group__12__Impl rule__PhysicBody__Group__13 )
            // InternalArdsl.g:5242:2: rule__PhysicBody__Group__12__Impl rule__PhysicBody__Group__13
            {
            pushFollow(FOLLOW_35);
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
    // InternalArdsl.g:5249:1: rule__PhysicBody__Group__12__Impl : ( 'damping' ) ;
    public final void rule__PhysicBody__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5253:1: ( ( 'damping' ) )
            // InternalArdsl.g:5254:1: ( 'damping' )
            {
            // InternalArdsl.g:5254:1: ( 'damping' )
            // InternalArdsl.g:5255:2: 'damping'
            {
             before(grammarAccess.getPhysicBodyAccess().getDampingKeyword_12()); 
            match(input,73,FOLLOW_2); 
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
    // InternalArdsl.g:5264:1: rule__PhysicBody__Group__13 : rule__PhysicBody__Group__13__Impl rule__PhysicBody__Group__14 ;
    public final void rule__PhysicBody__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5268:1: ( rule__PhysicBody__Group__13__Impl rule__PhysicBody__Group__14 )
            // InternalArdsl.g:5269:2: rule__PhysicBody__Group__13__Impl rule__PhysicBody__Group__14
            {
            pushFollow(FOLLOW_52);
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
    // InternalArdsl.g:5276:1: rule__PhysicBody__Group__13__Impl : ( ( rule__PhysicBody__DampingAssignment_13 ) ) ;
    public final void rule__PhysicBody__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5280:1: ( ( ( rule__PhysicBody__DampingAssignment_13 ) ) )
            // InternalArdsl.g:5281:1: ( ( rule__PhysicBody__DampingAssignment_13 ) )
            {
            // InternalArdsl.g:5281:1: ( ( rule__PhysicBody__DampingAssignment_13 ) )
            // InternalArdsl.g:5282:2: ( rule__PhysicBody__DampingAssignment_13 )
            {
             before(grammarAccess.getPhysicBodyAccess().getDampingAssignment_13()); 
            // InternalArdsl.g:5283:2: ( rule__PhysicBody__DampingAssignment_13 )
            // InternalArdsl.g:5283:3: rule__PhysicBody__DampingAssignment_13
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
    // InternalArdsl.g:5291:1: rule__PhysicBody__Group__14 : rule__PhysicBody__Group__14__Impl rule__PhysicBody__Group__15 ;
    public final void rule__PhysicBody__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5295:1: ( rule__PhysicBody__Group__14__Impl rule__PhysicBody__Group__15 )
            // InternalArdsl.g:5296:2: rule__PhysicBody__Group__14__Impl rule__PhysicBody__Group__15
            {
            pushFollow(FOLLOW_35);
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
    // InternalArdsl.g:5303:1: rule__PhysicBody__Group__14__Impl : ( 'angularDamping' ) ;
    public final void rule__PhysicBody__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5307:1: ( ( 'angularDamping' ) )
            // InternalArdsl.g:5308:1: ( 'angularDamping' )
            {
            // InternalArdsl.g:5308:1: ( 'angularDamping' )
            // InternalArdsl.g:5309:2: 'angularDamping'
            {
             before(grammarAccess.getPhysicBodyAccess().getAngularDampingKeyword_14()); 
            match(input,74,FOLLOW_2); 
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
    // InternalArdsl.g:5318:1: rule__PhysicBody__Group__15 : rule__PhysicBody__Group__15__Impl ;
    public final void rule__PhysicBody__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5322:1: ( rule__PhysicBody__Group__15__Impl )
            // InternalArdsl.g:5323:2: rule__PhysicBody__Group__15__Impl
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
    // InternalArdsl.g:5329:1: rule__PhysicBody__Group__15__Impl : ( ( rule__PhysicBody__AngularDampingAssignment_15 ) ) ;
    public final void rule__PhysicBody__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5333:1: ( ( ( rule__PhysicBody__AngularDampingAssignment_15 ) ) )
            // InternalArdsl.g:5334:1: ( ( rule__PhysicBody__AngularDampingAssignment_15 ) )
            {
            // InternalArdsl.g:5334:1: ( ( rule__PhysicBody__AngularDampingAssignment_15 ) )
            // InternalArdsl.g:5335:2: ( rule__PhysicBody__AngularDampingAssignment_15 )
            {
             before(grammarAccess.getPhysicBodyAccess().getAngularDampingAssignment_15()); 
            // InternalArdsl.g:5336:2: ( rule__PhysicBody__AngularDampingAssignment_15 )
            // InternalArdsl.g:5336:3: rule__PhysicBody__AngularDampingAssignment_15
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


    // $ANTLR start "rule__Forces__Group__0"
    // InternalArdsl.g:5345:1: rule__Forces__Group__0 : rule__Forces__Group__0__Impl rule__Forces__Group__1 ;
    public final void rule__Forces__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5349:1: ( rule__Forces__Group__0__Impl rule__Forces__Group__1 )
            // InternalArdsl.g:5350:2: rule__Forces__Group__0__Impl rule__Forces__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Forces__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forces__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group__0"


    // $ANTLR start "rule__Forces__Group__0__Impl"
    // InternalArdsl.g:5357:1: rule__Forces__Group__0__Impl : ( ( rule__Forces__NameAssignment_0 ) ) ;
    public final void rule__Forces__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5361:1: ( ( ( rule__Forces__NameAssignment_0 ) ) )
            // InternalArdsl.g:5362:1: ( ( rule__Forces__NameAssignment_0 ) )
            {
            // InternalArdsl.g:5362:1: ( ( rule__Forces__NameAssignment_0 ) )
            // InternalArdsl.g:5363:2: ( rule__Forces__NameAssignment_0 )
            {
             before(grammarAccess.getForcesAccess().getNameAssignment_0()); 
            // InternalArdsl.g:5364:2: ( rule__Forces__NameAssignment_0 )
            // InternalArdsl.g:5364:3: rule__Forces__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Forces__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getForcesAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group__0__Impl"


    // $ANTLR start "rule__Forces__Group__1"
    // InternalArdsl.g:5372:1: rule__Forces__Group__1 : rule__Forces__Group__1__Impl rule__Forces__Group__2 ;
    public final void rule__Forces__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5376:1: ( rule__Forces__Group__1__Impl rule__Forces__Group__2 )
            // InternalArdsl.g:5377:2: rule__Forces__Group__1__Impl rule__Forces__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__Forces__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forces__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group__1"


    // $ANTLR start "rule__Forces__Group__1__Impl"
    // InternalArdsl.g:5384:1: rule__Forces__Group__1__Impl : ( ':' ) ;
    public final void rule__Forces__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5388:1: ( ( ':' ) )
            // InternalArdsl.g:5389:1: ( ':' )
            {
            // InternalArdsl.g:5389:1: ( ':' )
            // InternalArdsl.g:5390:2: ':'
            {
             before(grammarAccess.getForcesAccess().getColonKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getForcesAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group__1__Impl"


    // $ANTLR start "rule__Forces__Group__2"
    // InternalArdsl.g:5399:1: rule__Forces__Group__2 : rule__Forces__Group__2__Impl rule__Forces__Group__3 ;
    public final void rule__Forces__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5403:1: ( rule__Forces__Group__2__Impl rule__Forces__Group__3 )
            // InternalArdsl.g:5404:2: rule__Forces__Group__2__Impl rule__Forces__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Forces__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forces__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group__2"


    // $ANTLR start "rule__Forces__Group__2__Impl"
    // InternalArdsl.g:5411:1: rule__Forces__Group__2__Impl : ( 'gesture' ) ;
    public final void rule__Forces__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5415:1: ( ( 'gesture' ) )
            // InternalArdsl.g:5416:1: ( 'gesture' )
            {
            // InternalArdsl.g:5416:1: ( 'gesture' )
            // InternalArdsl.g:5417:2: 'gesture'
            {
             before(grammarAccess.getForcesAccess().getGestureKeyword_2()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getForcesAccess().getGestureKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group__2__Impl"


    // $ANTLR start "rule__Forces__Group__3"
    // InternalArdsl.g:5426:1: rule__Forces__Group__3 : rule__Forces__Group__3__Impl rule__Forces__Group__4 ;
    public final void rule__Forces__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5430:1: ( rule__Forces__Group__3__Impl rule__Forces__Group__4 )
            // InternalArdsl.g:5431:2: rule__Forces__Group__3__Impl rule__Forces__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Forces__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forces__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group__3"


    // $ANTLR start "rule__Forces__Group__3__Impl"
    // InternalArdsl.g:5438:1: rule__Forces__Group__3__Impl : ( ( rule__Forces__GestureAssignment_3 ) ) ;
    public final void rule__Forces__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5442:1: ( ( ( rule__Forces__GestureAssignment_3 ) ) )
            // InternalArdsl.g:5443:1: ( ( rule__Forces__GestureAssignment_3 ) )
            {
            // InternalArdsl.g:5443:1: ( ( rule__Forces__GestureAssignment_3 ) )
            // InternalArdsl.g:5444:2: ( rule__Forces__GestureAssignment_3 )
            {
             before(grammarAccess.getForcesAccess().getGestureAssignment_3()); 
            // InternalArdsl.g:5445:2: ( rule__Forces__GestureAssignment_3 )
            // InternalArdsl.g:5445:3: rule__Forces__GestureAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Forces__GestureAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForcesAccess().getGestureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group__3__Impl"


    // $ANTLR start "rule__Forces__Group__4"
    // InternalArdsl.g:5453:1: rule__Forces__Group__4 : rule__Forces__Group__4__Impl ;
    public final void rule__Forces__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5457:1: ( rule__Forces__Group__4__Impl )
            // InternalArdsl.g:5458:2: rule__Forces__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Forces__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group__4"


    // $ANTLR start "rule__Forces__Group__4__Impl"
    // InternalArdsl.g:5464:1: rule__Forces__Group__4__Impl : ( ( rule__Forces__Group_4__0 )? ) ;
    public final void rule__Forces__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5468:1: ( ( ( rule__Forces__Group_4__0 )? ) )
            // InternalArdsl.g:5469:1: ( ( rule__Forces__Group_4__0 )? )
            {
            // InternalArdsl.g:5469:1: ( ( rule__Forces__Group_4__0 )? )
            // InternalArdsl.g:5470:2: ( rule__Forces__Group_4__0 )?
            {
             before(grammarAccess.getForcesAccess().getGroup_4()); 
            // InternalArdsl.g:5471:2: ( rule__Forces__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==45) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalArdsl.g:5471:3: rule__Forces__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Forces__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForcesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group__4__Impl"


    // $ANTLR start "rule__Forces__Group_4__0"
    // InternalArdsl.g:5480:1: rule__Forces__Group_4__0 : rule__Forces__Group_4__0__Impl rule__Forces__Group_4__1 ;
    public final void rule__Forces__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5484:1: ( rule__Forces__Group_4__0__Impl rule__Forces__Group_4__1 )
            // InternalArdsl.g:5485:2: rule__Forces__Group_4__0__Impl rule__Forces__Group_4__1
            {
            pushFollow(FOLLOW_35);
            rule__Forces__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forces__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group_4__0"


    // $ANTLR start "rule__Forces__Group_4__0__Impl"
    // InternalArdsl.g:5492:1: rule__Forces__Group_4__0__Impl : ( '[' ) ;
    public final void rule__Forces__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5496:1: ( ( '[' ) )
            // InternalArdsl.g:5497:1: ( '[' )
            {
            // InternalArdsl.g:5497:1: ( '[' )
            // InternalArdsl.g:5498:2: '['
            {
             before(grammarAccess.getForcesAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getForcesAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group_4__0__Impl"


    // $ANTLR start "rule__Forces__Group_4__1"
    // InternalArdsl.g:5507:1: rule__Forces__Group_4__1 : rule__Forces__Group_4__1__Impl rule__Forces__Group_4__2 ;
    public final void rule__Forces__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5511:1: ( rule__Forces__Group_4__1__Impl rule__Forces__Group_4__2 )
            // InternalArdsl.g:5512:2: rule__Forces__Group_4__1__Impl rule__Forces__Group_4__2
            {
            pushFollow(FOLLOW_18);
            rule__Forces__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forces__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group_4__1"


    // $ANTLR start "rule__Forces__Group_4__1__Impl"
    // InternalArdsl.g:5519:1: rule__Forces__Group_4__1__Impl : ( ( rule__Forces__XVectorAssignment_4_1 ) ) ;
    public final void rule__Forces__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5523:1: ( ( ( rule__Forces__XVectorAssignment_4_1 ) ) )
            // InternalArdsl.g:5524:1: ( ( rule__Forces__XVectorAssignment_4_1 ) )
            {
            // InternalArdsl.g:5524:1: ( ( rule__Forces__XVectorAssignment_4_1 ) )
            // InternalArdsl.g:5525:2: ( rule__Forces__XVectorAssignment_4_1 )
            {
             before(grammarAccess.getForcesAccess().getXVectorAssignment_4_1()); 
            // InternalArdsl.g:5526:2: ( rule__Forces__XVectorAssignment_4_1 )
            // InternalArdsl.g:5526:3: rule__Forces__XVectorAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Forces__XVectorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getForcesAccess().getXVectorAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group_4__1__Impl"


    // $ANTLR start "rule__Forces__Group_4__2"
    // InternalArdsl.g:5534:1: rule__Forces__Group_4__2 : rule__Forces__Group_4__2__Impl rule__Forces__Group_4__3 ;
    public final void rule__Forces__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5538:1: ( rule__Forces__Group_4__2__Impl rule__Forces__Group_4__3 )
            // InternalArdsl.g:5539:2: rule__Forces__Group_4__2__Impl rule__Forces__Group_4__3
            {
            pushFollow(FOLLOW_35);
            rule__Forces__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forces__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group_4__2"


    // $ANTLR start "rule__Forces__Group_4__2__Impl"
    // InternalArdsl.g:5546:1: rule__Forces__Group_4__2__Impl : ( ',' ) ;
    public final void rule__Forces__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5550:1: ( ( ',' ) )
            // InternalArdsl.g:5551:1: ( ',' )
            {
            // InternalArdsl.g:5551:1: ( ',' )
            // InternalArdsl.g:5552:2: ','
            {
             before(grammarAccess.getForcesAccess().getCommaKeyword_4_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getForcesAccess().getCommaKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group_4__2__Impl"


    // $ANTLR start "rule__Forces__Group_4__3"
    // InternalArdsl.g:5561:1: rule__Forces__Group_4__3 : rule__Forces__Group_4__3__Impl rule__Forces__Group_4__4 ;
    public final void rule__Forces__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5565:1: ( rule__Forces__Group_4__3__Impl rule__Forces__Group_4__4 )
            // InternalArdsl.g:5566:2: rule__Forces__Group_4__3__Impl rule__Forces__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__Forces__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forces__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group_4__3"


    // $ANTLR start "rule__Forces__Group_4__3__Impl"
    // InternalArdsl.g:5573:1: rule__Forces__Group_4__3__Impl : ( ( rule__Forces__YVectorAssignment_4_3 ) ) ;
    public final void rule__Forces__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5577:1: ( ( ( rule__Forces__YVectorAssignment_4_3 ) ) )
            // InternalArdsl.g:5578:1: ( ( rule__Forces__YVectorAssignment_4_3 ) )
            {
            // InternalArdsl.g:5578:1: ( ( rule__Forces__YVectorAssignment_4_3 ) )
            // InternalArdsl.g:5579:2: ( rule__Forces__YVectorAssignment_4_3 )
            {
             before(grammarAccess.getForcesAccess().getYVectorAssignment_4_3()); 
            // InternalArdsl.g:5580:2: ( rule__Forces__YVectorAssignment_4_3 )
            // InternalArdsl.g:5580:3: rule__Forces__YVectorAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Forces__YVectorAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getForcesAccess().getYVectorAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group_4__3__Impl"


    // $ANTLR start "rule__Forces__Group_4__4"
    // InternalArdsl.g:5588:1: rule__Forces__Group_4__4 : rule__Forces__Group_4__4__Impl rule__Forces__Group_4__5 ;
    public final void rule__Forces__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5592:1: ( rule__Forces__Group_4__4__Impl rule__Forces__Group_4__5 )
            // InternalArdsl.g:5593:2: rule__Forces__Group_4__4__Impl rule__Forces__Group_4__5
            {
            pushFollow(FOLLOW_35);
            rule__Forces__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forces__Group_4__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group_4__4"


    // $ANTLR start "rule__Forces__Group_4__4__Impl"
    // InternalArdsl.g:5600:1: rule__Forces__Group_4__4__Impl : ( ',' ) ;
    public final void rule__Forces__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5604:1: ( ( ',' ) )
            // InternalArdsl.g:5605:1: ( ',' )
            {
            // InternalArdsl.g:5605:1: ( ',' )
            // InternalArdsl.g:5606:2: ','
            {
             before(grammarAccess.getForcesAccess().getCommaKeyword_4_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getForcesAccess().getCommaKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group_4__4__Impl"


    // $ANTLR start "rule__Forces__Group_4__5"
    // InternalArdsl.g:5615:1: rule__Forces__Group_4__5 : rule__Forces__Group_4__5__Impl rule__Forces__Group_4__6 ;
    public final void rule__Forces__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5619:1: ( rule__Forces__Group_4__5__Impl rule__Forces__Group_4__6 )
            // InternalArdsl.g:5620:2: rule__Forces__Group_4__5__Impl rule__Forces__Group_4__6
            {
            pushFollow(FOLLOW_21);
            rule__Forces__Group_4__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forces__Group_4__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group_4__5"


    // $ANTLR start "rule__Forces__Group_4__5__Impl"
    // InternalArdsl.g:5627:1: rule__Forces__Group_4__5__Impl : ( ( rule__Forces__ZVectorAssignment_4_5 ) ) ;
    public final void rule__Forces__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5631:1: ( ( ( rule__Forces__ZVectorAssignment_4_5 ) ) )
            // InternalArdsl.g:5632:1: ( ( rule__Forces__ZVectorAssignment_4_5 ) )
            {
            // InternalArdsl.g:5632:1: ( ( rule__Forces__ZVectorAssignment_4_5 ) )
            // InternalArdsl.g:5633:2: ( rule__Forces__ZVectorAssignment_4_5 )
            {
             before(grammarAccess.getForcesAccess().getZVectorAssignment_4_5()); 
            // InternalArdsl.g:5634:2: ( rule__Forces__ZVectorAssignment_4_5 )
            // InternalArdsl.g:5634:3: rule__Forces__ZVectorAssignment_4_5
            {
            pushFollow(FOLLOW_2);
            rule__Forces__ZVectorAssignment_4_5();

            state._fsp--;


            }

             after(grammarAccess.getForcesAccess().getZVectorAssignment_4_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group_4__5__Impl"


    // $ANTLR start "rule__Forces__Group_4__6"
    // InternalArdsl.g:5642:1: rule__Forces__Group_4__6 : rule__Forces__Group_4__6__Impl ;
    public final void rule__Forces__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5646:1: ( rule__Forces__Group_4__6__Impl )
            // InternalArdsl.g:5647:2: rule__Forces__Group_4__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Forces__Group_4__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group_4__6"


    // $ANTLR start "rule__Forces__Group_4__6__Impl"
    // InternalArdsl.g:5653:1: rule__Forces__Group_4__6__Impl : ( ']' ) ;
    public final void rule__Forces__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5657:1: ( ( ']' ) )
            // InternalArdsl.g:5658:1: ( ']' )
            {
            // InternalArdsl.g:5658:1: ( ']' )
            // InternalArdsl.g:5659:2: ']'
            {
             before(grammarAccess.getForcesAccess().getRightSquareBracketKeyword_4_6()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getForcesAccess().getRightSquareBracketKeyword_4_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__Group_4__6__Impl"


    // $ANTLR start "rule__BitMasks__Group__0"
    // InternalArdsl.g:5669:1: rule__BitMasks__Group__0 : rule__BitMasks__Group__0__Impl rule__BitMasks__Group__1 ;
    public final void rule__BitMasks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5673:1: ( rule__BitMasks__Group__0__Impl rule__BitMasks__Group__1 )
            // InternalArdsl.g:5674:2: rule__BitMasks__Group__0__Impl rule__BitMasks__Group__1
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
    // InternalArdsl.g:5681:1: rule__BitMasks__Group__0__Impl : ( 'collision' ) ;
    public final void rule__BitMasks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5685:1: ( ( 'collision' ) )
            // InternalArdsl.g:5686:1: ( 'collision' )
            {
            // InternalArdsl.g:5686:1: ( 'collision' )
            // InternalArdsl.g:5687:2: 'collision'
            {
             before(grammarAccess.getBitMasksAccess().getCollisionKeyword_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalArdsl.g:5696:1: rule__BitMasks__Group__1 : rule__BitMasks__Group__1__Impl rule__BitMasks__Group__2 ;
    public final void rule__BitMasks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5700:1: ( rule__BitMasks__Group__1__Impl rule__BitMasks__Group__2 )
            // InternalArdsl.g:5701:2: rule__BitMasks__Group__1__Impl rule__BitMasks__Group__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalArdsl.g:5708:1: rule__BitMasks__Group__1__Impl : ( ( rule__BitMasks__CollisionAssignment_1 ) ) ;
    public final void rule__BitMasks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5712:1: ( ( ( rule__BitMasks__CollisionAssignment_1 ) ) )
            // InternalArdsl.g:5713:1: ( ( rule__BitMasks__CollisionAssignment_1 ) )
            {
            // InternalArdsl.g:5713:1: ( ( rule__BitMasks__CollisionAssignment_1 ) )
            // InternalArdsl.g:5714:2: ( rule__BitMasks__CollisionAssignment_1 )
            {
             before(grammarAccess.getBitMasksAccess().getCollisionAssignment_1()); 
            // InternalArdsl.g:5715:2: ( rule__BitMasks__CollisionAssignment_1 )
            // InternalArdsl.g:5715:3: rule__BitMasks__CollisionAssignment_1
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
    // InternalArdsl.g:5723:1: rule__BitMasks__Group__2 : rule__BitMasks__Group__2__Impl rule__BitMasks__Group__3 ;
    public final void rule__BitMasks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5727:1: ( rule__BitMasks__Group__2__Impl rule__BitMasks__Group__3 )
            // InternalArdsl.g:5728:2: rule__BitMasks__Group__2__Impl rule__BitMasks__Group__3
            {
            pushFollow(FOLLOW_54);
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
    // InternalArdsl.g:5735:1: rule__BitMasks__Group__2__Impl : ( ( rule__BitMasks__Group_2__0 )* ) ;
    public final void rule__BitMasks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5739:1: ( ( ( rule__BitMasks__Group_2__0 )* ) )
            // InternalArdsl.g:5740:1: ( ( rule__BitMasks__Group_2__0 )* )
            {
            // InternalArdsl.g:5740:1: ( ( rule__BitMasks__Group_2__0 )* )
            // InternalArdsl.g:5741:2: ( rule__BitMasks__Group_2__0 )*
            {
             before(grammarAccess.getBitMasksAccess().getGroup_2()); 
            // InternalArdsl.g:5742:2: ( rule__BitMasks__Group_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==40) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalArdsl.g:5742:3: rule__BitMasks__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BitMasks__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getBitMasksAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalArdsl.g:5750:1: rule__BitMasks__Group__3 : rule__BitMasks__Group__3__Impl rule__BitMasks__Group__4 ;
    public final void rule__BitMasks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5754:1: ( rule__BitMasks__Group__3__Impl rule__BitMasks__Group__4 )
            // InternalArdsl.g:5755:2: rule__BitMasks__Group__3__Impl rule__BitMasks__Group__4
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
    // InternalArdsl.g:5762:1: rule__BitMasks__Group__3__Impl : ( 'contact' ) ;
    public final void rule__BitMasks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5766:1: ( ( 'contact' ) )
            // InternalArdsl.g:5767:1: ( 'contact' )
            {
            // InternalArdsl.g:5767:1: ( 'contact' )
            // InternalArdsl.g:5768:2: 'contact'
            {
             before(grammarAccess.getBitMasksAccess().getContactKeyword_3()); 
            match(input,77,FOLLOW_2); 
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
    // InternalArdsl.g:5777:1: rule__BitMasks__Group__4 : rule__BitMasks__Group__4__Impl rule__BitMasks__Group__5 ;
    public final void rule__BitMasks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5781:1: ( rule__BitMasks__Group__4__Impl rule__BitMasks__Group__5 )
            // InternalArdsl.g:5782:2: rule__BitMasks__Group__4__Impl rule__BitMasks__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalArdsl.g:5789:1: rule__BitMasks__Group__4__Impl : ( ( rule__BitMasks__ContactAssignment_4 ) ) ;
    public final void rule__BitMasks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5793:1: ( ( ( rule__BitMasks__ContactAssignment_4 ) ) )
            // InternalArdsl.g:5794:1: ( ( rule__BitMasks__ContactAssignment_4 ) )
            {
            // InternalArdsl.g:5794:1: ( ( rule__BitMasks__ContactAssignment_4 ) )
            // InternalArdsl.g:5795:2: ( rule__BitMasks__ContactAssignment_4 )
            {
             before(grammarAccess.getBitMasksAccess().getContactAssignment_4()); 
            // InternalArdsl.g:5796:2: ( rule__BitMasks__ContactAssignment_4 )
            // InternalArdsl.g:5796:3: rule__BitMasks__ContactAssignment_4
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
    // InternalArdsl.g:5804:1: rule__BitMasks__Group__5 : rule__BitMasks__Group__5__Impl ;
    public final void rule__BitMasks__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5808:1: ( rule__BitMasks__Group__5__Impl )
            // InternalArdsl.g:5809:2: rule__BitMasks__Group__5__Impl
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
    // InternalArdsl.g:5815:1: rule__BitMasks__Group__5__Impl : ( ( rule__BitMasks__Group_5__0 )* ) ;
    public final void rule__BitMasks__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5819:1: ( ( ( rule__BitMasks__Group_5__0 )* ) )
            // InternalArdsl.g:5820:1: ( ( rule__BitMasks__Group_5__0 )* )
            {
            // InternalArdsl.g:5820:1: ( ( rule__BitMasks__Group_5__0 )* )
            // InternalArdsl.g:5821:2: ( rule__BitMasks__Group_5__0 )*
            {
             before(grammarAccess.getBitMasksAccess().getGroup_5()); 
            // InternalArdsl.g:5822:2: ( rule__BitMasks__Group_5__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==40) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalArdsl.g:5822:3: rule__BitMasks__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BitMasks__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getBitMasksAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__BitMasks__Group_2__0"
    // InternalArdsl.g:5831:1: rule__BitMasks__Group_2__0 : rule__BitMasks__Group_2__0__Impl rule__BitMasks__Group_2__1 ;
    public final void rule__BitMasks__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5835:1: ( rule__BitMasks__Group_2__0__Impl rule__BitMasks__Group_2__1 )
            // InternalArdsl.g:5836:2: rule__BitMasks__Group_2__0__Impl rule__BitMasks__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__BitMasks__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BitMasks__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitMasks__Group_2__0"


    // $ANTLR start "rule__BitMasks__Group_2__0__Impl"
    // InternalArdsl.g:5843:1: rule__BitMasks__Group_2__0__Impl : ( ',' ) ;
    public final void rule__BitMasks__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5847:1: ( ( ',' ) )
            // InternalArdsl.g:5848:1: ( ',' )
            {
            // InternalArdsl.g:5848:1: ( ',' )
            // InternalArdsl.g:5849:2: ','
            {
             before(grammarAccess.getBitMasksAccess().getCommaKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBitMasksAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitMasks__Group_2__0__Impl"


    // $ANTLR start "rule__BitMasks__Group_2__1"
    // InternalArdsl.g:5858:1: rule__BitMasks__Group_2__1 : rule__BitMasks__Group_2__1__Impl ;
    public final void rule__BitMasks__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5862:1: ( rule__BitMasks__Group_2__1__Impl )
            // InternalArdsl.g:5863:2: rule__BitMasks__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BitMasks__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitMasks__Group_2__1"


    // $ANTLR start "rule__BitMasks__Group_2__1__Impl"
    // InternalArdsl.g:5869:1: rule__BitMasks__Group_2__1__Impl : ( ( rule__BitMasks__CollisionAssignment_2_1 ) ) ;
    public final void rule__BitMasks__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5873:1: ( ( ( rule__BitMasks__CollisionAssignment_2_1 ) ) )
            // InternalArdsl.g:5874:1: ( ( rule__BitMasks__CollisionAssignment_2_1 ) )
            {
            // InternalArdsl.g:5874:1: ( ( rule__BitMasks__CollisionAssignment_2_1 ) )
            // InternalArdsl.g:5875:2: ( rule__BitMasks__CollisionAssignment_2_1 )
            {
             before(grammarAccess.getBitMasksAccess().getCollisionAssignment_2_1()); 
            // InternalArdsl.g:5876:2: ( rule__BitMasks__CollisionAssignment_2_1 )
            // InternalArdsl.g:5876:3: rule__BitMasks__CollisionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BitMasks__CollisionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBitMasksAccess().getCollisionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitMasks__Group_2__1__Impl"


    // $ANTLR start "rule__BitMasks__Group_5__0"
    // InternalArdsl.g:5885:1: rule__BitMasks__Group_5__0 : rule__BitMasks__Group_5__0__Impl rule__BitMasks__Group_5__1 ;
    public final void rule__BitMasks__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5889:1: ( rule__BitMasks__Group_5__0__Impl rule__BitMasks__Group_5__1 )
            // InternalArdsl.g:5890:2: rule__BitMasks__Group_5__0__Impl rule__BitMasks__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__BitMasks__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BitMasks__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitMasks__Group_5__0"


    // $ANTLR start "rule__BitMasks__Group_5__0__Impl"
    // InternalArdsl.g:5897:1: rule__BitMasks__Group_5__0__Impl : ( ',' ) ;
    public final void rule__BitMasks__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5901:1: ( ( ',' ) )
            // InternalArdsl.g:5902:1: ( ',' )
            {
            // InternalArdsl.g:5902:1: ( ',' )
            // InternalArdsl.g:5903:2: ','
            {
             before(grammarAccess.getBitMasksAccess().getCommaKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBitMasksAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitMasks__Group_5__0__Impl"


    // $ANTLR start "rule__BitMasks__Group_5__1"
    // InternalArdsl.g:5912:1: rule__BitMasks__Group_5__1 : rule__BitMasks__Group_5__1__Impl ;
    public final void rule__BitMasks__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5916:1: ( rule__BitMasks__Group_5__1__Impl )
            // InternalArdsl.g:5917:2: rule__BitMasks__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BitMasks__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitMasks__Group_5__1"


    // $ANTLR start "rule__BitMasks__Group_5__1__Impl"
    // InternalArdsl.g:5923:1: rule__BitMasks__Group_5__1__Impl : ( ( rule__BitMasks__ContactAssignment_5_1 ) ) ;
    public final void rule__BitMasks__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5927:1: ( ( ( rule__BitMasks__ContactAssignment_5_1 ) ) )
            // InternalArdsl.g:5928:1: ( ( rule__BitMasks__ContactAssignment_5_1 ) )
            {
            // InternalArdsl.g:5928:1: ( ( rule__BitMasks__ContactAssignment_5_1 ) )
            // InternalArdsl.g:5929:2: ( rule__BitMasks__ContactAssignment_5_1 )
            {
             before(grammarAccess.getBitMasksAccess().getContactAssignment_5_1()); 
            // InternalArdsl.g:5930:2: ( rule__BitMasks__ContactAssignment_5_1 )
            // InternalArdsl.g:5930:3: rule__BitMasks__ContactAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BitMasks__ContactAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBitMasksAccess().getContactAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitMasks__Group_5__1__Impl"


    // $ANTLR start "rule__Gameloop__Group__0"
    // InternalArdsl.g:5939:1: rule__Gameloop__Group__0 : rule__Gameloop__Group__0__Impl rule__Gameloop__Group__1 ;
    public final void rule__Gameloop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5943:1: ( rule__Gameloop__Group__0__Impl rule__Gameloop__Group__1 )
            // InternalArdsl.g:5944:2: rule__Gameloop__Group__0__Impl rule__Gameloop__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Gameloop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__0"


    // $ANTLR start "rule__Gameloop__Group__0__Impl"
    // InternalArdsl.g:5951:1: rule__Gameloop__Group__0__Impl : ( 'Gamelogic' ) ;
    public final void rule__Gameloop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5955:1: ( ( 'Gamelogic' ) )
            // InternalArdsl.g:5956:1: ( 'Gamelogic' )
            {
            // InternalArdsl.g:5956:1: ( 'Gamelogic' )
            // InternalArdsl.g:5957:2: 'Gamelogic'
            {
             before(grammarAccess.getGameloopAccess().getGamelogicKeyword_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getGamelogicKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__0__Impl"


    // $ANTLR start "rule__Gameloop__Group__1"
    // InternalArdsl.g:5966:1: rule__Gameloop__Group__1 : rule__Gameloop__Group__1__Impl rule__Gameloop__Group__2 ;
    public final void rule__Gameloop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5970:1: ( rule__Gameloop__Group__1__Impl rule__Gameloop__Group__2 )
            // InternalArdsl.g:5971:2: rule__Gameloop__Group__1__Impl rule__Gameloop__Group__2
            {
            pushFollow(FOLLOW_55);
            rule__Gameloop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__1"


    // $ANTLR start "rule__Gameloop__Group__1__Impl"
    // InternalArdsl.g:5978:1: rule__Gameloop__Group__1__Impl : ( '{' ) ;
    public final void rule__Gameloop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5982:1: ( ( '{' ) )
            // InternalArdsl.g:5983:1: ( '{' )
            {
            // InternalArdsl.g:5983:1: ( '{' )
            // InternalArdsl.g:5984:2: '{'
            {
             before(grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__1__Impl"


    // $ANTLR start "rule__Gameloop__Group__2"
    // InternalArdsl.g:5993:1: rule__Gameloop__Group__2 : rule__Gameloop__Group__2__Impl rule__Gameloop__Group__3 ;
    public final void rule__Gameloop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:5997:1: ( rule__Gameloop__Group__2__Impl rule__Gameloop__Group__3 )
            // InternalArdsl.g:5998:2: rule__Gameloop__Group__2__Impl rule__Gameloop__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Gameloop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__2"


    // $ANTLR start "rule__Gameloop__Group__2__Impl"
    // InternalArdsl.g:6005:1: rule__Gameloop__Group__2__Impl : ( 'Display' ) ;
    public final void rule__Gameloop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6009:1: ( ( 'Display' ) )
            // InternalArdsl.g:6010:1: ( 'Display' )
            {
            // InternalArdsl.g:6010:1: ( 'Display' )
            // InternalArdsl.g:6011:2: 'Display'
            {
             before(grammarAccess.getGameloopAccess().getDisplayKeyword_2()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getDisplayKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__2__Impl"


    // $ANTLR start "rule__Gameloop__Group__3"
    // InternalArdsl.g:6020:1: rule__Gameloop__Group__3 : rule__Gameloop__Group__3__Impl rule__Gameloop__Group__4 ;
    public final void rule__Gameloop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6024:1: ( rule__Gameloop__Group__3__Impl rule__Gameloop__Group__4 )
            // InternalArdsl.g:6025:2: rule__Gameloop__Group__3__Impl rule__Gameloop__Group__4
            {
            pushFollow(FOLLOW_56);
            rule__Gameloop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__3"


    // $ANTLR start "rule__Gameloop__Group__3__Impl"
    // InternalArdsl.g:6032:1: rule__Gameloop__Group__3__Impl : ( ':' ) ;
    public final void rule__Gameloop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6036:1: ( ( ':' ) )
            // InternalArdsl.g:6037:1: ( ':' )
            {
            // InternalArdsl.g:6037:1: ( ':' )
            // InternalArdsl.g:6038:2: ':'
            {
             before(grammarAccess.getGameloopAccess().getColonKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__3__Impl"


    // $ANTLR start "rule__Gameloop__Group__4"
    // InternalArdsl.g:6047:1: rule__Gameloop__Group__4 : rule__Gameloop__Group__4__Impl rule__Gameloop__Group__5 ;
    public final void rule__Gameloop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6051:1: ( rule__Gameloop__Group__4__Impl rule__Gameloop__Group__5 )
            // InternalArdsl.g:6052:2: rule__Gameloop__Group__4__Impl rule__Gameloop__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Gameloop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__4"


    // $ANTLR start "rule__Gameloop__Group__4__Impl"
    // InternalArdsl.g:6059:1: rule__Gameloop__Group__4__Impl : ( 'start' ) ;
    public final void rule__Gameloop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6063:1: ( ( 'start' ) )
            // InternalArdsl.g:6064:1: ( 'start' )
            {
            // InternalArdsl.g:6064:1: ( 'start' )
            // InternalArdsl.g:6065:2: 'start'
            {
             before(grammarAccess.getGameloopAccess().getStartKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getStartKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__4__Impl"


    // $ANTLR start "rule__Gameloop__Group__5"
    // InternalArdsl.g:6074:1: rule__Gameloop__Group__5 : rule__Gameloop__Group__5__Impl rule__Gameloop__Group__6 ;
    public final void rule__Gameloop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6078:1: ( rule__Gameloop__Group__5__Impl rule__Gameloop__Group__6 )
            // InternalArdsl.g:6079:2: rule__Gameloop__Group__5__Impl rule__Gameloop__Group__6
            {
            pushFollow(FOLLOW_57);
            rule__Gameloop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__5"


    // $ANTLR start "rule__Gameloop__Group__5__Impl"
    // InternalArdsl.g:6086:1: rule__Gameloop__Group__5__Impl : ( ( rule__Gameloop__StartAssignment_5 ) ) ;
    public final void rule__Gameloop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6090:1: ( ( ( rule__Gameloop__StartAssignment_5 ) ) )
            // InternalArdsl.g:6091:1: ( ( rule__Gameloop__StartAssignment_5 ) )
            {
            // InternalArdsl.g:6091:1: ( ( rule__Gameloop__StartAssignment_5 ) )
            // InternalArdsl.g:6092:2: ( rule__Gameloop__StartAssignment_5 )
            {
             before(grammarAccess.getGameloopAccess().getStartAssignment_5()); 
            // InternalArdsl.g:6093:2: ( rule__Gameloop__StartAssignment_5 )
            // InternalArdsl.g:6093:3: rule__Gameloop__StartAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__StartAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGameloopAccess().getStartAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__5__Impl"


    // $ANTLR start "rule__Gameloop__Group__6"
    // InternalArdsl.g:6101:1: rule__Gameloop__Group__6 : rule__Gameloop__Group__6__Impl rule__Gameloop__Group__7 ;
    public final void rule__Gameloop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6105:1: ( rule__Gameloop__Group__6__Impl rule__Gameloop__Group__7 )
            // InternalArdsl.g:6106:2: rule__Gameloop__Group__6__Impl rule__Gameloop__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Gameloop__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__6"


    // $ANTLR start "rule__Gameloop__Group__6__Impl"
    // InternalArdsl.g:6113:1: rule__Gameloop__Group__6__Impl : ( 'win' ) ;
    public final void rule__Gameloop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6117:1: ( ( 'win' ) )
            // InternalArdsl.g:6118:1: ( 'win' )
            {
            // InternalArdsl.g:6118:1: ( 'win' )
            // InternalArdsl.g:6119:2: 'win'
            {
             before(grammarAccess.getGameloopAccess().getWinKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getWinKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__6__Impl"


    // $ANTLR start "rule__Gameloop__Group__7"
    // InternalArdsl.g:6128:1: rule__Gameloop__Group__7 : rule__Gameloop__Group__7__Impl rule__Gameloop__Group__8 ;
    public final void rule__Gameloop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6132:1: ( rule__Gameloop__Group__7__Impl rule__Gameloop__Group__8 )
            // InternalArdsl.g:6133:2: rule__Gameloop__Group__7__Impl rule__Gameloop__Group__8
            {
            pushFollow(FOLLOW_58);
            rule__Gameloop__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__7"


    // $ANTLR start "rule__Gameloop__Group__7__Impl"
    // InternalArdsl.g:6140:1: rule__Gameloop__Group__7__Impl : ( ( rule__Gameloop__WinAssignment_7 ) ) ;
    public final void rule__Gameloop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6144:1: ( ( ( rule__Gameloop__WinAssignment_7 ) ) )
            // InternalArdsl.g:6145:1: ( ( rule__Gameloop__WinAssignment_7 ) )
            {
            // InternalArdsl.g:6145:1: ( ( rule__Gameloop__WinAssignment_7 ) )
            // InternalArdsl.g:6146:2: ( rule__Gameloop__WinAssignment_7 )
            {
             before(grammarAccess.getGameloopAccess().getWinAssignment_7()); 
            // InternalArdsl.g:6147:2: ( rule__Gameloop__WinAssignment_7 )
            // InternalArdsl.g:6147:3: rule__Gameloop__WinAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__WinAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGameloopAccess().getWinAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__7__Impl"


    // $ANTLR start "rule__Gameloop__Group__8"
    // InternalArdsl.g:6155:1: rule__Gameloop__Group__8 : rule__Gameloop__Group__8__Impl rule__Gameloop__Group__9 ;
    public final void rule__Gameloop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6159:1: ( rule__Gameloop__Group__8__Impl rule__Gameloop__Group__9 )
            // InternalArdsl.g:6160:2: rule__Gameloop__Group__8__Impl rule__Gameloop__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Gameloop__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__8"


    // $ANTLR start "rule__Gameloop__Group__8__Impl"
    // InternalArdsl.g:6167:1: rule__Gameloop__Group__8__Impl : ( 'lose' ) ;
    public final void rule__Gameloop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6171:1: ( ( 'lose' ) )
            // InternalArdsl.g:6172:1: ( 'lose' )
            {
            // InternalArdsl.g:6172:1: ( 'lose' )
            // InternalArdsl.g:6173:2: 'lose'
            {
             before(grammarAccess.getGameloopAccess().getLoseKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getLoseKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__8__Impl"


    // $ANTLR start "rule__Gameloop__Group__9"
    // InternalArdsl.g:6182:1: rule__Gameloop__Group__9 : rule__Gameloop__Group__9__Impl rule__Gameloop__Group__10 ;
    public final void rule__Gameloop__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6186:1: ( rule__Gameloop__Group__9__Impl rule__Gameloop__Group__10 )
            // InternalArdsl.g:6187:2: rule__Gameloop__Group__9__Impl rule__Gameloop__Group__10
            {
            pushFollow(FOLLOW_59);
            rule__Gameloop__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__9"


    // $ANTLR start "rule__Gameloop__Group__9__Impl"
    // InternalArdsl.g:6194:1: rule__Gameloop__Group__9__Impl : ( ( rule__Gameloop__LoseAssignment_9 ) ) ;
    public final void rule__Gameloop__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6198:1: ( ( ( rule__Gameloop__LoseAssignment_9 ) ) )
            // InternalArdsl.g:6199:1: ( ( rule__Gameloop__LoseAssignment_9 ) )
            {
            // InternalArdsl.g:6199:1: ( ( rule__Gameloop__LoseAssignment_9 ) )
            // InternalArdsl.g:6200:2: ( rule__Gameloop__LoseAssignment_9 )
            {
             before(grammarAccess.getGameloopAccess().getLoseAssignment_9()); 
            // InternalArdsl.g:6201:2: ( rule__Gameloop__LoseAssignment_9 )
            // InternalArdsl.g:6201:3: rule__Gameloop__LoseAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__LoseAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getGameloopAccess().getLoseAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__9__Impl"


    // $ANTLR start "rule__Gameloop__Group__10"
    // InternalArdsl.g:6209:1: rule__Gameloop__Group__10 : rule__Gameloop__Group__10__Impl rule__Gameloop__Group__11 ;
    public final void rule__Gameloop__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6213:1: ( rule__Gameloop__Group__10__Impl rule__Gameloop__Group__11 )
            // InternalArdsl.g:6214:2: rule__Gameloop__Group__10__Impl rule__Gameloop__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__Gameloop__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__10"


    // $ANTLR start "rule__Gameloop__Group__10__Impl"
    // InternalArdsl.g:6221:1: rule__Gameloop__Group__10__Impl : ( 'score' ) ;
    public final void rule__Gameloop__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6225:1: ( ( 'score' ) )
            // InternalArdsl.g:6226:1: ( 'score' )
            {
            // InternalArdsl.g:6226:1: ( 'score' )
            // InternalArdsl.g:6227:2: 'score'
            {
             before(grammarAccess.getGameloopAccess().getScoreKeyword_10()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getScoreKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__10__Impl"


    // $ANTLR start "rule__Gameloop__Group__11"
    // InternalArdsl.g:6236:1: rule__Gameloop__Group__11 : rule__Gameloop__Group__11__Impl rule__Gameloop__Group__12 ;
    public final void rule__Gameloop__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6240:1: ( rule__Gameloop__Group__11__Impl rule__Gameloop__Group__12 )
            // InternalArdsl.g:6241:2: rule__Gameloop__Group__11__Impl rule__Gameloop__Group__12
            {
            pushFollow(FOLLOW_56);
            rule__Gameloop__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__11"


    // $ANTLR start "rule__Gameloop__Group__11__Impl"
    // InternalArdsl.g:6248:1: rule__Gameloop__Group__11__Impl : ( '{' ) ;
    public final void rule__Gameloop__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6252:1: ( ( '{' ) )
            // InternalArdsl.g:6253:1: ( '{' )
            {
            // InternalArdsl.g:6253:1: ( '{' )
            // InternalArdsl.g:6254:2: '{'
            {
             before(grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__11__Impl"


    // $ANTLR start "rule__Gameloop__Group__12"
    // InternalArdsl.g:6263:1: rule__Gameloop__Group__12 : rule__Gameloop__Group__12__Impl rule__Gameloop__Group__13 ;
    public final void rule__Gameloop__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6267:1: ( rule__Gameloop__Group__12__Impl rule__Gameloop__Group__13 )
            // InternalArdsl.g:6268:2: rule__Gameloop__Group__12__Impl rule__Gameloop__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__Gameloop__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__12"


    // $ANTLR start "rule__Gameloop__Group__12__Impl"
    // InternalArdsl.g:6275:1: rule__Gameloop__Group__12__Impl : ( ( rule__Gameloop__ScoreAssignment_12 ) ) ;
    public final void rule__Gameloop__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6279:1: ( ( ( rule__Gameloop__ScoreAssignment_12 ) ) )
            // InternalArdsl.g:6280:1: ( ( rule__Gameloop__ScoreAssignment_12 ) )
            {
            // InternalArdsl.g:6280:1: ( ( rule__Gameloop__ScoreAssignment_12 ) )
            // InternalArdsl.g:6281:2: ( rule__Gameloop__ScoreAssignment_12 )
            {
             before(grammarAccess.getGameloopAccess().getScoreAssignment_12()); 
            // InternalArdsl.g:6282:2: ( rule__Gameloop__ScoreAssignment_12 )
            // InternalArdsl.g:6282:3: rule__Gameloop__ScoreAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__ScoreAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getGameloopAccess().getScoreAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__12__Impl"


    // $ANTLR start "rule__Gameloop__Group__13"
    // InternalArdsl.g:6290:1: rule__Gameloop__Group__13 : rule__Gameloop__Group__13__Impl rule__Gameloop__Group__14 ;
    public final void rule__Gameloop__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6294:1: ( rule__Gameloop__Group__13__Impl rule__Gameloop__Group__14 )
            // InternalArdsl.g:6295:2: rule__Gameloop__Group__13__Impl rule__Gameloop__Group__14
            {
            pushFollow(FOLLOW_60);
            rule__Gameloop__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__13"


    // $ANTLR start "rule__Gameloop__Group__13__Impl"
    // InternalArdsl.g:6302:1: rule__Gameloop__Group__13__Impl : ( '}' ) ;
    public final void rule__Gameloop__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6306:1: ( ( '}' ) )
            // InternalArdsl.g:6307:1: ( '}' )
            {
            // InternalArdsl.g:6307:1: ( '}' )
            // InternalArdsl.g:6308:2: '}'
            {
             before(grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_13()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__13__Impl"


    // $ANTLR start "rule__Gameloop__Group__14"
    // InternalArdsl.g:6317:1: rule__Gameloop__Group__14 : rule__Gameloop__Group__14__Impl rule__Gameloop__Group__15 ;
    public final void rule__Gameloop__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6321:1: ( rule__Gameloop__Group__14__Impl rule__Gameloop__Group__15 )
            // InternalArdsl.g:6322:2: rule__Gameloop__Group__14__Impl rule__Gameloop__Group__15
            {
            pushFollow(FOLLOW_60);
            rule__Gameloop__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__14"


    // $ANTLR start "rule__Gameloop__Group__14__Impl"
    // InternalArdsl.g:6329:1: rule__Gameloop__Group__14__Impl : ( ( rule__Gameloop__Group_14__0 )? ) ;
    public final void rule__Gameloop__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6333:1: ( ( ( rule__Gameloop__Group_14__0 )? ) )
            // InternalArdsl.g:6334:1: ( ( rule__Gameloop__Group_14__0 )? )
            {
            // InternalArdsl.g:6334:1: ( ( rule__Gameloop__Group_14__0 )? )
            // InternalArdsl.g:6335:2: ( rule__Gameloop__Group_14__0 )?
            {
             before(grammarAccess.getGameloopAccess().getGroup_14()); 
            // InternalArdsl.g:6336:2: ( rule__Gameloop__Group_14__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==81) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalArdsl.g:6336:3: rule__Gameloop__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gameloop__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameloopAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__14__Impl"


    // $ANTLR start "rule__Gameloop__Group__15"
    // InternalArdsl.g:6344:1: rule__Gameloop__Group__15 : rule__Gameloop__Group__15__Impl rule__Gameloop__Group__16 ;
    public final void rule__Gameloop__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6348:1: ( rule__Gameloop__Group__15__Impl rule__Gameloop__Group__16 )
            // InternalArdsl.g:6349:2: rule__Gameloop__Group__15__Impl rule__Gameloop__Group__16
            {
            pushFollow(FOLLOW_60);
            rule__Gameloop__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__15"


    // $ANTLR start "rule__Gameloop__Group__15__Impl"
    // InternalArdsl.g:6356:1: rule__Gameloop__Group__15__Impl : ( ( rule__Gameloop__Group_15__0 )? ) ;
    public final void rule__Gameloop__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6360:1: ( ( ( rule__Gameloop__Group_15__0 )? ) )
            // InternalArdsl.g:6361:1: ( ( rule__Gameloop__Group_15__0 )? )
            {
            // InternalArdsl.g:6361:1: ( ( rule__Gameloop__Group_15__0 )? )
            // InternalArdsl.g:6362:2: ( rule__Gameloop__Group_15__0 )?
            {
             before(grammarAccess.getGameloopAccess().getGroup_15()); 
            // InternalArdsl.g:6363:2: ( rule__Gameloop__Group_15__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==82) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalArdsl.g:6363:3: rule__Gameloop__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gameloop__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameloopAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__15__Impl"


    // $ANTLR start "rule__Gameloop__Group__16"
    // InternalArdsl.g:6371:1: rule__Gameloop__Group__16 : rule__Gameloop__Group__16__Impl rule__Gameloop__Group__17 ;
    public final void rule__Gameloop__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6375:1: ( rule__Gameloop__Group__16__Impl rule__Gameloop__Group__17 )
            // InternalArdsl.g:6376:2: rule__Gameloop__Group__16__Impl rule__Gameloop__Group__17
            {
            pushFollow(FOLLOW_60);
            rule__Gameloop__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__16"


    // $ANTLR start "rule__Gameloop__Group__16__Impl"
    // InternalArdsl.g:6383:1: rule__Gameloop__Group__16__Impl : ( ( rule__Gameloop__Group_16__0 )? ) ;
    public final void rule__Gameloop__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6387:1: ( ( ( rule__Gameloop__Group_16__0 )? ) )
            // InternalArdsl.g:6388:1: ( ( rule__Gameloop__Group_16__0 )? )
            {
            // InternalArdsl.g:6388:1: ( ( rule__Gameloop__Group_16__0 )? )
            // InternalArdsl.g:6389:2: ( rule__Gameloop__Group_16__0 )?
            {
             before(grammarAccess.getGameloopAccess().getGroup_16()); 
            // InternalArdsl.g:6390:2: ( rule__Gameloop__Group_16__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==83) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalArdsl.g:6390:3: rule__Gameloop__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gameloop__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameloopAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__16__Impl"


    // $ANTLR start "rule__Gameloop__Group__17"
    // InternalArdsl.g:6398:1: rule__Gameloop__Group__17 : rule__Gameloop__Group__17__Impl rule__Gameloop__Group__18 ;
    public final void rule__Gameloop__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6402:1: ( rule__Gameloop__Group__17__Impl rule__Gameloop__Group__18 )
            // InternalArdsl.g:6403:2: rule__Gameloop__Group__17__Impl rule__Gameloop__Group__18
            {
            pushFollow(FOLLOW_60);
            rule__Gameloop__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__17"


    // $ANTLR start "rule__Gameloop__Group__17__Impl"
    // InternalArdsl.g:6410:1: rule__Gameloop__Group__17__Impl : ( ( rule__Gameloop__Group_17__0 )? ) ;
    public final void rule__Gameloop__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6414:1: ( ( ( rule__Gameloop__Group_17__0 )? ) )
            // InternalArdsl.g:6415:1: ( ( rule__Gameloop__Group_17__0 )? )
            {
            // InternalArdsl.g:6415:1: ( ( rule__Gameloop__Group_17__0 )? )
            // InternalArdsl.g:6416:2: ( rule__Gameloop__Group_17__0 )?
            {
             before(grammarAccess.getGameloopAccess().getGroup_17()); 
            // InternalArdsl.g:6417:2: ( rule__Gameloop__Group_17__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==84) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalArdsl.g:6417:3: rule__Gameloop__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gameloop__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameloopAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__17__Impl"


    // $ANTLR start "rule__Gameloop__Group__18"
    // InternalArdsl.g:6425:1: rule__Gameloop__Group__18 : rule__Gameloop__Group__18__Impl ;
    public final void rule__Gameloop__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6429:1: ( rule__Gameloop__Group__18__Impl )
            // InternalArdsl.g:6430:2: rule__Gameloop__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__18"


    // $ANTLR start "rule__Gameloop__Group__18__Impl"
    // InternalArdsl.g:6436:1: rule__Gameloop__Group__18__Impl : ( '}' ) ;
    public final void rule__Gameloop__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6440:1: ( ( '}' ) )
            // InternalArdsl.g:6441:1: ( '}' )
            {
            // InternalArdsl.g:6441:1: ( '}' )
            // InternalArdsl.g:6442:2: '}'
            {
             before(grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_18()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group__18__Impl"


    // $ANTLR start "rule__Gameloop__Group_14__0"
    // InternalArdsl.g:6452:1: rule__Gameloop__Group_14__0 : rule__Gameloop__Group_14__0__Impl rule__Gameloop__Group_14__1 ;
    public final void rule__Gameloop__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6456:1: ( rule__Gameloop__Group_14__0__Impl rule__Gameloop__Group_14__1 )
            // InternalArdsl.g:6457:2: rule__Gameloop__Group_14__0__Impl rule__Gameloop__Group_14__1
            {
            pushFollow(FOLLOW_4);
            rule__Gameloop__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_14__0"


    // $ANTLR start "rule__Gameloop__Group_14__0__Impl"
    // InternalArdsl.g:6464:1: rule__Gameloop__Group_14__0__Impl : ( 'Actions' ) ;
    public final void rule__Gameloop__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6468:1: ( ( 'Actions' ) )
            // InternalArdsl.g:6469:1: ( 'Actions' )
            {
            // InternalArdsl.g:6469:1: ( 'Actions' )
            // InternalArdsl.g:6470:2: 'Actions'
            {
             before(grammarAccess.getGameloopAccess().getActionsKeyword_14_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getActionsKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_14__0__Impl"


    // $ANTLR start "rule__Gameloop__Group_14__1"
    // InternalArdsl.g:6479:1: rule__Gameloop__Group_14__1 : rule__Gameloop__Group_14__1__Impl rule__Gameloop__Group_14__2 ;
    public final void rule__Gameloop__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6483:1: ( rule__Gameloop__Group_14__1__Impl rule__Gameloop__Group_14__2 )
            // InternalArdsl.g:6484:2: rule__Gameloop__Group_14__1__Impl rule__Gameloop__Group_14__2
            {
            pushFollow(FOLLOW_3);
            rule__Gameloop__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_14__1"


    // $ANTLR start "rule__Gameloop__Group_14__1__Impl"
    // InternalArdsl.g:6491:1: rule__Gameloop__Group_14__1__Impl : ( '{' ) ;
    public final void rule__Gameloop__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6495:1: ( ( '{' ) )
            // InternalArdsl.g:6496:1: ( '{' )
            {
            // InternalArdsl.g:6496:1: ( '{' )
            // InternalArdsl.g:6497:2: '{'
            {
             before(grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_14_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_14__1__Impl"


    // $ANTLR start "rule__Gameloop__Group_14__2"
    // InternalArdsl.g:6506:1: rule__Gameloop__Group_14__2 : rule__Gameloop__Group_14__2__Impl rule__Gameloop__Group_14__3 ;
    public final void rule__Gameloop__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6510:1: ( rule__Gameloop__Group_14__2__Impl rule__Gameloop__Group_14__3 )
            // InternalArdsl.g:6511:2: rule__Gameloop__Group_14__2__Impl rule__Gameloop__Group_14__3
            {
            pushFollow(FOLLOW_6);
            rule__Gameloop__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_14__2"


    // $ANTLR start "rule__Gameloop__Group_14__2__Impl"
    // InternalArdsl.g:6518:1: rule__Gameloop__Group_14__2__Impl : ( ( rule__Gameloop__ActionsTriggersAssignment_14_2 ) ) ;
    public final void rule__Gameloop__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6522:1: ( ( ( rule__Gameloop__ActionsTriggersAssignment_14_2 ) ) )
            // InternalArdsl.g:6523:1: ( ( rule__Gameloop__ActionsTriggersAssignment_14_2 ) )
            {
            // InternalArdsl.g:6523:1: ( ( rule__Gameloop__ActionsTriggersAssignment_14_2 ) )
            // InternalArdsl.g:6524:2: ( rule__Gameloop__ActionsTriggersAssignment_14_2 )
            {
             before(grammarAccess.getGameloopAccess().getActionsTriggersAssignment_14_2()); 
            // InternalArdsl.g:6525:2: ( rule__Gameloop__ActionsTriggersAssignment_14_2 )
            // InternalArdsl.g:6525:3: rule__Gameloop__ActionsTriggersAssignment_14_2
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__ActionsTriggersAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getGameloopAccess().getActionsTriggersAssignment_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_14__2__Impl"


    // $ANTLR start "rule__Gameloop__Group_14__3"
    // InternalArdsl.g:6533:1: rule__Gameloop__Group_14__3 : rule__Gameloop__Group_14__3__Impl rule__Gameloop__Group_14__4 ;
    public final void rule__Gameloop__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6537:1: ( rule__Gameloop__Group_14__3__Impl rule__Gameloop__Group_14__4 )
            // InternalArdsl.g:6538:2: rule__Gameloop__Group_14__3__Impl rule__Gameloop__Group_14__4
            {
            pushFollow(FOLLOW_6);
            rule__Gameloop__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_14__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_14__3"


    // $ANTLR start "rule__Gameloop__Group_14__3__Impl"
    // InternalArdsl.g:6545:1: rule__Gameloop__Group_14__3__Impl : ( ( rule__Gameloop__Group_14_3__0 )* ) ;
    public final void rule__Gameloop__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6549:1: ( ( ( rule__Gameloop__Group_14_3__0 )* ) )
            // InternalArdsl.g:6550:1: ( ( rule__Gameloop__Group_14_3__0 )* )
            {
            // InternalArdsl.g:6550:1: ( ( rule__Gameloop__Group_14_3__0 )* )
            // InternalArdsl.g:6551:2: ( rule__Gameloop__Group_14_3__0 )*
            {
             before(grammarAccess.getGameloopAccess().getGroup_14_3()); 
            // InternalArdsl.g:6552:2: ( rule__Gameloop__Group_14_3__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==40) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalArdsl.g:6552:3: rule__Gameloop__Group_14_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Gameloop__Group_14_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getGameloopAccess().getGroup_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_14__3__Impl"


    // $ANTLR start "rule__Gameloop__Group_14__4"
    // InternalArdsl.g:6560:1: rule__Gameloop__Group_14__4 : rule__Gameloop__Group_14__4__Impl ;
    public final void rule__Gameloop__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6564:1: ( rule__Gameloop__Group_14__4__Impl )
            // InternalArdsl.g:6565:2: rule__Gameloop__Group_14__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_14__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_14__4"


    // $ANTLR start "rule__Gameloop__Group_14__4__Impl"
    // InternalArdsl.g:6571:1: rule__Gameloop__Group_14__4__Impl : ( '}' ) ;
    public final void rule__Gameloop__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6575:1: ( ( '}' ) )
            // InternalArdsl.g:6576:1: ( '}' )
            {
            // InternalArdsl.g:6576:1: ( '}' )
            // InternalArdsl.g:6577:2: '}'
            {
             before(grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_14_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_14_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_14__4__Impl"


    // $ANTLR start "rule__Gameloop__Group_14_3__0"
    // InternalArdsl.g:6587:1: rule__Gameloop__Group_14_3__0 : rule__Gameloop__Group_14_3__0__Impl rule__Gameloop__Group_14_3__1 ;
    public final void rule__Gameloop__Group_14_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6591:1: ( rule__Gameloop__Group_14_3__0__Impl rule__Gameloop__Group_14_3__1 )
            // InternalArdsl.g:6592:2: rule__Gameloop__Group_14_3__0__Impl rule__Gameloop__Group_14_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Gameloop__Group_14_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_14_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_14_3__0"


    // $ANTLR start "rule__Gameloop__Group_14_3__0__Impl"
    // InternalArdsl.g:6599:1: rule__Gameloop__Group_14_3__0__Impl : ( ',' ) ;
    public final void rule__Gameloop__Group_14_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6603:1: ( ( ',' ) )
            // InternalArdsl.g:6604:1: ( ',' )
            {
            // InternalArdsl.g:6604:1: ( ',' )
            // InternalArdsl.g:6605:2: ','
            {
             before(grammarAccess.getGameloopAccess().getCommaKeyword_14_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getCommaKeyword_14_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_14_3__0__Impl"


    // $ANTLR start "rule__Gameloop__Group_14_3__1"
    // InternalArdsl.g:6614:1: rule__Gameloop__Group_14_3__1 : rule__Gameloop__Group_14_3__1__Impl ;
    public final void rule__Gameloop__Group_14_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6618:1: ( rule__Gameloop__Group_14_3__1__Impl )
            // InternalArdsl.g:6619:2: rule__Gameloop__Group_14_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_14_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_14_3__1"


    // $ANTLR start "rule__Gameloop__Group_14_3__1__Impl"
    // InternalArdsl.g:6625:1: rule__Gameloop__Group_14_3__1__Impl : ( ( rule__Gameloop__ActionsTriggersAssignment_14_3_1 ) ) ;
    public final void rule__Gameloop__Group_14_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6629:1: ( ( ( rule__Gameloop__ActionsTriggersAssignment_14_3_1 ) ) )
            // InternalArdsl.g:6630:1: ( ( rule__Gameloop__ActionsTriggersAssignment_14_3_1 ) )
            {
            // InternalArdsl.g:6630:1: ( ( rule__Gameloop__ActionsTriggersAssignment_14_3_1 ) )
            // InternalArdsl.g:6631:2: ( rule__Gameloop__ActionsTriggersAssignment_14_3_1 )
            {
             before(grammarAccess.getGameloopAccess().getActionsTriggersAssignment_14_3_1()); 
            // InternalArdsl.g:6632:2: ( rule__Gameloop__ActionsTriggersAssignment_14_3_1 )
            // InternalArdsl.g:6632:3: rule__Gameloop__ActionsTriggersAssignment_14_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__ActionsTriggersAssignment_14_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGameloopAccess().getActionsTriggersAssignment_14_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_14_3__1__Impl"


    // $ANTLR start "rule__Gameloop__Group_15__0"
    // InternalArdsl.g:6641:1: rule__Gameloop__Group_15__0 : rule__Gameloop__Group_15__0__Impl rule__Gameloop__Group_15__1 ;
    public final void rule__Gameloop__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6645:1: ( rule__Gameloop__Group_15__0__Impl rule__Gameloop__Group_15__1 )
            // InternalArdsl.g:6646:2: rule__Gameloop__Group_15__0__Impl rule__Gameloop__Group_15__1
            {
            pushFollow(FOLLOW_4);
            rule__Gameloop__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_15__0"


    // $ANTLR start "rule__Gameloop__Group_15__0__Impl"
    // InternalArdsl.g:6653:1: rule__Gameloop__Group_15__0__Impl : ( 'Collisions' ) ;
    public final void rule__Gameloop__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6657:1: ( ( 'Collisions' ) )
            // InternalArdsl.g:6658:1: ( 'Collisions' )
            {
            // InternalArdsl.g:6658:1: ( 'Collisions' )
            // InternalArdsl.g:6659:2: 'Collisions'
            {
             before(grammarAccess.getGameloopAccess().getCollisionsKeyword_15_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getCollisionsKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_15__0__Impl"


    // $ANTLR start "rule__Gameloop__Group_15__1"
    // InternalArdsl.g:6668:1: rule__Gameloop__Group_15__1 : rule__Gameloop__Group_15__1__Impl rule__Gameloop__Group_15__2 ;
    public final void rule__Gameloop__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6672:1: ( rule__Gameloop__Group_15__1__Impl rule__Gameloop__Group_15__2 )
            // InternalArdsl.g:6673:2: rule__Gameloop__Group_15__1__Impl rule__Gameloop__Group_15__2
            {
            pushFollow(FOLLOW_28);
            rule__Gameloop__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_15__1"


    // $ANTLR start "rule__Gameloop__Group_15__1__Impl"
    // InternalArdsl.g:6680:1: rule__Gameloop__Group_15__1__Impl : ( '{' ) ;
    public final void rule__Gameloop__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6684:1: ( ( '{' ) )
            // InternalArdsl.g:6685:1: ( '{' )
            {
            // InternalArdsl.g:6685:1: ( '{' )
            // InternalArdsl.g:6686:2: '{'
            {
             before(grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_15_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_15__1__Impl"


    // $ANTLR start "rule__Gameloop__Group_15__2"
    // InternalArdsl.g:6695:1: rule__Gameloop__Group_15__2 : rule__Gameloop__Group_15__2__Impl rule__Gameloop__Group_15__3 ;
    public final void rule__Gameloop__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6699:1: ( rule__Gameloop__Group_15__2__Impl rule__Gameloop__Group_15__3 )
            // InternalArdsl.g:6700:2: rule__Gameloop__Group_15__2__Impl rule__Gameloop__Group_15__3
            {
            pushFollow(FOLLOW_6);
            rule__Gameloop__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_15__2"


    // $ANTLR start "rule__Gameloop__Group_15__2__Impl"
    // InternalArdsl.g:6707:1: rule__Gameloop__Group_15__2__Impl : ( ( rule__Gameloop__CollisionsAssignment_15_2 ) ) ;
    public final void rule__Gameloop__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6711:1: ( ( ( rule__Gameloop__CollisionsAssignment_15_2 ) ) )
            // InternalArdsl.g:6712:1: ( ( rule__Gameloop__CollisionsAssignment_15_2 ) )
            {
            // InternalArdsl.g:6712:1: ( ( rule__Gameloop__CollisionsAssignment_15_2 ) )
            // InternalArdsl.g:6713:2: ( rule__Gameloop__CollisionsAssignment_15_2 )
            {
             before(grammarAccess.getGameloopAccess().getCollisionsAssignment_15_2()); 
            // InternalArdsl.g:6714:2: ( rule__Gameloop__CollisionsAssignment_15_2 )
            // InternalArdsl.g:6714:3: rule__Gameloop__CollisionsAssignment_15_2
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__CollisionsAssignment_15_2();

            state._fsp--;


            }

             after(grammarAccess.getGameloopAccess().getCollisionsAssignment_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_15__2__Impl"


    // $ANTLR start "rule__Gameloop__Group_15__3"
    // InternalArdsl.g:6722:1: rule__Gameloop__Group_15__3 : rule__Gameloop__Group_15__3__Impl rule__Gameloop__Group_15__4 ;
    public final void rule__Gameloop__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6726:1: ( rule__Gameloop__Group_15__3__Impl rule__Gameloop__Group_15__4 )
            // InternalArdsl.g:6727:2: rule__Gameloop__Group_15__3__Impl rule__Gameloop__Group_15__4
            {
            pushFollow(FOLLOW_6);
            rule__Gameloop__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_15__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_15__3"


    // $ANTLR start "rule__Gameloop__Group_15__3__Impl"
    // InternalArdsl.g:6734:1: rule__Gameloop__Group_15__3__Impl : ( ( rule__Gameloop__Group_15_3__0 )* ) ;
    public final void rule__Gameloop__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6738:1: ( ( ( rule__Gameloop__Group_15_3__0 )* ) )
            // InternalArdsl.g:6739:1: ( ( rule__Gameloop__Group_15_3__0 )* )
            {
            // InternalArdsl.g:6739:1: ( ( rule__Gameloop__Group_15_3__0 )* )
            // InternalArdsl.g:6740:2: ( rule__Gameloop__Group_15_3__0 )*
            {
             before(grammarAccess.getGameloopAccess().getGroup_15_3()); 
            // InternalArdsl.g:6741:2: ( rule__Gameloop__Group_15_3__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==40) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalArdsl.g:6741:3: rule__Gameloop__Group_15_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Gameloop__Group_15_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getGameloopAccess().getGroup_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_15__3__Impl"


    // $ANTLR start "rule__Gameloop__Group_15__4"
    // InternalArdsl.g:6749:1: rule__Gameloop__Group_15__4 : rule__Gameloop__Group_15__4__Impl ;
    public final void rule__Gameloop__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6753:1: ( rule__Gameloop__Group_15__4__Impl )
            // InternalArdsl.g:6754:2: rule__Gameloop__Group_15__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_15__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_15__4"


    // $ANTLR start "rule__Gameloop__Group_15__4__Impl"
    // InternalArdsl.g:6760:1: rule__Gameloop__Group_15__4__Impl : ( '}' ) ;
    public final void rule__Gameloop__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6764:1: ( ( '}' ) )
            // InternalArdsl.g:6765:1: ( '}' )
            {
            // InternalArdsl.g:6765:1: ( '}' )
            // InternalArdsl.g:6766:2: '}'
            {
             before(grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_15_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_15_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_15__4__Impl"


    // $ANTLR start "rule__Gameloop__Group_15_3__0"
    // InternalArdsl.g:6776:1: rule__Gameloop__Group_15_3__0 : rule__Gameloop__Group_15_3__0__Impl rule__Gameloop__Group_15_3__1 ;
    public final void rule__Gameloop__Group_15_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6780:1: ( rule__Gameloop__Group_15_3__0__Impl rule__Gameloop__Group_15_3__1 )
            // InternalArdsl.g:6781:2: rule__Gameloop__Group_15_3__0__Impl rule__Gameloop__Group_15_3__1
            {
            pushFollow(FOLLOW_28);
            rule__Gameloop__Group_15_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_15_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_15_3__0"


    // $ANTLR start "rule__Gameloop__Group_15_3__0__Impl"
    // InternalArdsl.g:6788:1: rule__Gameloop__Group_15_3__0__Impl : ( ',' ) ;
    public final void rule__Gameloop__Group_15_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6792:1: ( ( ',' ) )
            // InternalArdsl.g:6793:1: ( ',' )
            {
            // InternalArdsl.g:6793:1: ( ',' )
            // InternalArdsl.g:6794:2: ','
            {
             before(grammarAccess.getGameloopAccess().getCommaKeyword_15_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getCommaKeyword_15_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_15_3__0__Impl"


    // $ANTLR start "rule__Gameloop__Group_15_3__1"
    // InternalArdsl.g:6803:1: rule__Gameloop__Group_15_3__1 : rule__Gameloop__Group_15_3__1__Impl ;
    public final void rule__Gameloop__Group_15_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6807:1: ( rule__Gameloop__Group_15_3__1__Impl )
            // InternalArdsl.g:6808:2: rule__Gameloop__Group_15_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_15_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_15_3__1"


    // $ANTLR start "rule__Gameloop__Group_15_3__1__Impl"
    // InternalArdsl.g:6814:1: rule__Gameloop__Group_15_3__1__Impl : ( ( rule__Gameloop__CollisionsAssignment_15_3_1 ) ) ;
    public final void rule__Gameloop__Group_15_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6818:1: ( ( ( rule__Gameloop__CollisionsAssignment_15_3_1 ) ) )
            // InternalArdsl.g:6819:1: ( ( rule__Gameloop__CollisionsAssignment_15_3_1 ) )
            {
            // InternalArdsl.g:6819:1: ( ( rule__Gameloop__CollisionsAssignment_15_3_1 ) )
            // InternalArdsl.g:6820:2: ( rule__Gameloop__CollisionsAssignment_15_3_1 )
            {
             before(grammarAccess.getGameloopAccess().getCollisionsAssignment_15_3_1()); 
            // InternalArdsl.g:6821:2: ( rule__Gameloop__CollisionsAssignment_15_3_1 )
            // InternalArdsl.g:6821:3: rule__Gameloop__CollisionsAssignment_15_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__CollisionsAssignment_15_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGameloopAccess().getCollisionsAssignment_15_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_15_3__1__Impl"


    // $ANTLR start "rule__Gameloop__Group_16__0"
    // InternalArdsl.g:6830:1: rule__Gameloop__Group_16__0 : rule__Gameloop__Group_16__0__Impl rule__Gameloop__Group_16__1 ;
    public final void rule__Gameloop__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6834:1: ( rule__Gameloop__Group_16__0__Impl rule__Gameloop__Group_16__1 )
            // InternalArdsl.g:6835:2: rule__Gameloop__Group_16__0__Impl rule__Gameloop__Group_16__1
            {
            pushFollow(FOLLOW_4);
            rule__Gameloop__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_16__0"


    // $ANTLR start "rule__Gameloop__Group_16__0__Impl"
    // InternalArdsl.g:6842:1: rule__Gameloop__Group_16__0__Impl : ( 'Buttons' ) ;
    public final void rule__Gameloop__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6846:1: ( ( 'Buttons' ) )
            // InternalArdsl.g:6847:1: ( 'Buttons' )
            {
            // InternalArdsl.g:6847:1: ( 'Buttons' )
            // InternalArdsl.g:6848:2: 'Buttons'
            {
             before(grammarAccess.getGameloopAccess().getButtonsKeyword_16_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getButtonsKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_16__0__Impl"


    // $ANTLR start "rule__Gameloop__Group_16__1"
    // InternalArdsl.g:6857:1: rule__Gameloop__Group_16__1 : rule__Gameloop__Group_16__1__Impl rule__Gameloop__Group_16__2 ;
    public final void rule__Gameloop__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6861:1: ( rule__Gameloop__Group_16__1__Impl rule__Gameloop__Group_16__2 )
            // InternalArdsl.g:6862:2: rule__Gameloop__Group_16__1__Impl rule__Gameloop__Group_16__2
            {
            pushFollow(FOLLOW_3);
            rule__Gameloop__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_16__1"


    // $ANTLR start "rule__Gameloop__Group_16__1__Impl"
    // InternalArdsl.g:6869:1: rule__Gameloop__Group_16__1__Impl : ( '{' ) ;
    public final void rule__Gameloop__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6873:1: ( ( '{' ) )
            // InternalArdsl.g:6874:1: ( '{' )
            {
            // InternalArdsl.g:6874:1: ( '{' )
            // InternalArdsl.g:6875:2: '{'
            {
             before(grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_16_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_16__1__Impl"


    // $ANTLR start "rule__Gameloop__Group_16__2"
    // InternalArdsl.g:6884:1: rule__Gameloop__Group_16__2 : rule__Gameloop__Group_16__2__Impl rule__Gameloop__Group_16__3 ;
    public final void rule__Gameloop__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6888:1: ( rule__Gameloop__Group_16__2__Impl rule__Gameloop__Group_16__3 )
            // InternalArdsl.g:6889:2: rule__Gameloop__Group_16__2__Impl rule__Gameloop__Group_16__3
            {
            pushFollow(FOLLOW_8);
            rule__Gameloop__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_16__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_16__2"


    // $ANTLR start "rule__Gameloop__Group_16__2__Impl"
    // InternalArdsl.g:6896:1: rule__Gameloop__Group_16__2__Impl : ( ( rule__Gameloop__GamepadAssignment_16_2 ) ) ;
    public final void rule__Gameloop__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6900:1: ( ( ( rule__Gameloop__GamepadAssignment_16_2 ) ) )
            // InternalArdsl.g:6901:1: ( ( rule__Gameloop__GamepadAssignment_16_2 ) )
            {
            // InternalArdsl.g:6901:1: ( ( rule__Gameloop__GamepadAssignment_16_2 ) )
            // InternalArdsl.g:6902:2: ( rule__Gameloop__GamepadAssignment_16_2 )
            {
             before(grammarAccess.getGameloopAccess().getGamepadAssignment_16_2()); 
            // InternalArdsl.g:6903:2: ( rule__Gameloop__GamepadAssignment_16_2 )
            // InternalArdsl.g:6903:3: rule__Gameloop__GamepadAssignment_16_2
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__GamepadAssignment_16_2();

            state._fsp--;


            }

             after(grammarAccess.getGameloopAccess().getGamepadAssignment_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_16__2__Impl"


    // $ANTLR start "rule__Gameloop__Group_16__3"
    // InternalArdsl.g:6911:1: rule__Gameloop__Group_16__3 : rule__Gameloop__Group_16__3__Impl ;
    public final void rule__Gameloop__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6915:1: ( rule__Gameloop__Group_16__3__Impl )
            // InternalArdsl.g:6916:2: rule__Gameloop__Group_16__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_16__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_16__3"


    // $ANTLR start "rule__Gameloop__Group_16__3__Impl"
    // InternalArdsl.g:6922:1: rule__Gameloop__Group_16__3__Impl : ( '}' ) ;
    public final void rule__Gameloop__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6926:1: ( ( '}' ) )
            // InternalArdsl.g:6927:1: ( '}' )
            {
            // InternalArdsl.g:6927:1: ( '}' )
            // InternalArdsl.g:6928:2: '}'
            {
             before(grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_16_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_16_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_16__3__Impl"


    // $ANTLR start "rule__Gameloop__Group_17__0"
    // InternalArdsl.g:6938:1: rule__Gameloop__Group_17__0 : rule__Gameloop__Group_17__0__Impl rule__Gameloop__Group_17__1 ;
    public final void rule__Gameloop__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6942:1: ( rule__Gameloop__Group_17__0__Impl rule__Gameloop__Group_17__1 )
            // InternalArdsl.g:6943:2: rule__Gameloop__Group_17__0__Impl rule__Gameloop__Group_17__1
            {
            pushFollow(FOLLOW_4);
            rule__Gameloop__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_17__0"


    // $ANTLR start "rule__Gameloop__Group_17__0__Impl"
    // InternalArdsl.g:6950:1: rule__Gameloop__Group_17__0__Impl : ( 'Elements' ) ;
    public final void rule__Gameloop__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6954:1: ( ( 'Elements' ) )
            // InternalArdsl.g:6955:1: ( 'Elements' )
            {
            // InternalArdsl.g:6955:1: ( 'Elements' )
            // InternalArdsl.g:6956:2: 'Elements'
            {
             before(grammarAccess.getGameloopAccess().getElementsKeyword_17_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getElementsKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_17__0__Impl"


    // $ANTLR start "rule__Gameloop__Group_17__1"
    // InternalArdsl.g:6965:1: rule__Gameloop__Group_17__1 : rule__Gameloop__Group_17__1__Impl rule__Gameloop__Group_17__2 ;
    public final void rule__Gameloop__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6969:1: ( rule__Gameloop__Group_17__1__Impl rule__Gameloop__Group_17__2 )
            // InternalArdsl.g:6970:2: rule__Gameloop__Group_17__1__Impl rule__Gameloop__Group_17__2
            {
            pushFollow(FOLLOW_3);
            rule__Gameloop__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_17__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_17__1"


    // $ANTLR start "rule__Gameloop__Group_17__1__Impl"
    // InternalArdsl.g:6977:1: rule__Gameloop__Group_17__1__Impl : ( '{' ) ;
    public final void rule__Gameloop__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6981:1: ( ( '{' ) )
            // InternalArdsl.g:6982:1: ( '{' )
            {
            // InternalArdsl.g:6982:1: ( '{' )
            // InternalArdsl.g:6983:2: '{'
            {
             before(grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_17_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getLeftCurlyBracketKeyword_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_17__1__Impl"


    // $ANTLR start "rule__Gameloop__Group_17__2"
    // InternalArdsl.g:6992:1: rule__Gameloop__Group_17__2 : rule__Gameloop__Group_17__2__Impl rule__Gameloop__Group_17__3 ;
    public final void rule__Gameloop__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:6996:1: ( rule__Gameloop__Group_17__2__Impl rule__Gameloop__Group_17__3 )
            // InternalArdsl.g:6997:2: rule__Gameloop__Group_17__2__Impl rule__Gameloop__Group_17__3
            {
            pushFollow(FOLLOW_6);
            rule__Gameloop__Group_17__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_17__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_17__2"


    // $ANTLR start "rule__Gameloop__Group_17__2__Impl"
    // InternalArdsl.g:7004:1: rule__Gameloop__Group_17__2__Impl : ( ( rule__Gameloop__ObjInitAssignment_17_2 ) ) ;
    public final void rule__Gameloop__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7008:1: ( ( ( rule__Gameloop__ObjInitAssignment_17_2 ) ) )
            // InternalArdsl.g:7009:1: ( ( rule__Gameloop__ObjInitAssignment_17_2 ) )
            {
            // InternalArdsl.g:7009:1: ( ( rule__Gameloop__ObjInitAssignment_17_2 ) )
            // InternalArdsl.g:7010:2: ( rule__Gameloop__ObjInitAssignment_17_2 )
            {
             before(grammarAccess.getGameloopAccess().getObjInitAssignment_17_2()); 
            // InternalArdsl.g:7011:2: ( rule__Gameloop__ObjInitAssignment_17_2 )
            // InternalArdsl.g:7011:3: rule__Gameloop__ObjInitAssignment_17_2
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__ObjInitAssignment_17_2();

            state._fsp--;


            }

             after(grammarAccess.getGameloopAccess().getObjInitAssignment_17_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_17__2__Impl"


    // $ANTLR start "rule__Gameloop__Group_17__3"
    // InternalArdsl.g:7019:1: rule__Gameloop__Group_17__3 : rule__Gameloop__Group_17__3__Impl rule__Gameloop__Group_17__4 ;
    public final void rule__Gameloop__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7023:1: ( rule__Gameloop__Group_17__3__Impl rule__Gameloop__Group_17__4 )
            // InternalArdsl.g:7024:2: rule__Gameloop__Group_17__3__Impl rule__Gameloop__Group_17__4
            {
            pushFollow(FOLLOW_6);
            rule__Gameloop__Group_17__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_17__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_17__3"


    // $ANTLR start "rule__Gameloop__Group_17__3__Impl"
    // InternalArdsl.g:7031:1: rule__Gameloop__Group_17__3__Impl : ( ( rule__Gameloop__Group_17_3__0 )* ) ;
    public final void rule__Gameloop__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7035:1: ( ( ( rule__Gameloop__Group_17_3__0 )* ) )
            // InternalArdsl.g:7036:1: ( ( rule__Gameloop__Group_17_3__0 )* )
            {
            // InternalArdsl.g:7036:1: ( ( rule__Gameloop__Group_17_3__0 )* )
            // InternalArdsl.g:7037:2: ( rule__Gameloop__Group_17_3__0 )*
            {
             before(grammarAccess.getGameloopAccess().getGroup_17_3()); 
            // InternalArdsl.g:7038:2: ( rule__Gameloop__Group_17_3__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==40) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalArdsl.g:7038:3: rule__Gameloop__Group_17_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Gameloop__Group_17_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getGameloopAccess().getGroup_17_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_17__3__Impl"


    // $ANTLR start "rule__Gameloop__Group_17__4"
    // InternalArdsl.g:7046:1: rule__Gameloop__Group_17__4 : rule__Gameloop__Group_17__4__Impl ;
    public final void rule__Gameloop__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7050:1: ( rule__Gameloop__Group_17__4__Impl )
            // InternalArdsl.g:7051:2: rule__Gameloop__Group_17__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_17__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_17__4"


    // $ANTLR start "rule__Gameloop__Group_17__4__Impl"
    // InternalArdsl.g:7057:1: rule__Gameloop__Group_17__4__Impl : ( '}' ) ;
    public final void rule__Gameloop__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7061:1: ( ( '}' ) )
            // InternalArdsl.g:7062:1: ( '}' )
            {
            // InternalArdsl.g:7062:1: ( '}' )
            // InternalArdsl.g:7063:2: '}'
            {
             before(grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_17_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getRightCurlyBracketKeyword_17_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_17__4__Impl"


    // $ANTLR start "rule__Gameloop__Group_17_3__0"
    // InternalArdsl.g:7073:1: rule__Gameloop__Group_17_3__0 : rule__Gameloop__Group_17_3__0__Impl rule__Gameloop__Group_17_3__1 ;
    public final void rule__Gameloop__Group_17_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7077:1: ( rule__Gameloop__Group_17_3__0__Impl rule__Gameloop__Group_17_3__1 )
            // InternalArdsl.g:7078:2: rule__Gameloop__Group_17_3__0__Impl rule__Gameloop__Group_17_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Gameloop__Group_17_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_17_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_17_3__0"


    // $ANTLR start "rule__Gameloop__Group_17_3__0__Impl"
    // InternalArdsl.g:7085:1: rule__Gameloop__Group_17_3__0__Impl : ( ',' ) ;
    public final void rule__Gameloop__Group_17_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7089:1: ( ( ',' ) )
            // InternalArdsl.g:7090:1: ( ',' )
            {
            // InternalArdsl.g:7090:1: ( ',' )
            // InternalArdsl.g:7091:2: ','
            {
             before(grammarAccess.getGameloopAccess().getCommaKeyword_17_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGameloopAccess().getCommaKeyword_17_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_17_3__0__Impl"


    // $ANTLR start "rule__Gameloop__Group_17_3__1"
    // InternalArdsl.g:7100:1: rule__Gameloop__Group_17_3__1 : rule__Gameloop__Group_17_3__1__Impl ;
    public final void rule__Gameloop__Group_17_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7104:1: ( rule__Gameloop__Group_17_3__1__Impl )
            // InternalArdsl.g:7105:2: rule__Gameloop__Group_17_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__Group_17_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_17_3__1"


    // $ANTLR start "rule__Gameloop__Group_17_3__1__Impl"
    // InternalArdsl.g:7111:1: rule__Gameloop__Group_17_3__1__Impl : ( ( rule__Gameloop__ObjInitAssignment_17_3_1 ) ) ;
    public final void rule__Gameloop__Group_17_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7115:1: ( ( ( rule__Gameloop__ObjInitAssignment_17_3_1 ) ) )
            // InternalArdsl.g:7116:1: ( ( rule__Gameloop__ObjInitAssignment_17_3_1 ) )
            {
            // InternalArdsl.g:7116:1: ( ( rule__Gameloop__ObjInitAssignment_17_3_1 ) )
            // InternalArdsl.g:7117:2: ( rule__Gameloop__ObjInitAssignment_17_3_1 )
            {
             before(grammarAccess.getGameloopAccess().getObjInitAssignment_17_3_1()); 
            // InternalArdsl.g:7118:2: ( rule__Gameloop__ObjInitAssignment_17_3_1 )
            // InternalArdsl.g:7118:3: rule__Gameloop__ObjInitAssignment_17_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Gameloop__ObjInitAssignment_17_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGameloopAccess().getObjInitAssignment_17_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__Group_17_3__1__Impl"


    // $ANTLR start "rule__Score__Group__0"
    // InternalArdsl.g:7127:1: rule__Score__Group__0 : rule__Score__Group__0__Impl rule__Score__Group__1 ;
    public final void rule__Score__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7131:1: ( rule__Score__Group__0__Impl rule__Score__Group__1 )
            // InternalArdsl.g:7132:2: rule__Score__Group__0__Impl rule__Score__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Score__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__0"


    // $ANTLR start "rule__Score__Group__0__Impl"
    // InternalArdsl.g:7139:1: rule__Score__Group__0__Impl : ( 'start' ) ;
    public final void rule__Score__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7143:1: ( ( 'start' ) )
            // InternalArdsl.g:7144:1: ( 'start' )
            {
            // InternalArdsl.g:7144:1: ( 'start' )
            // InternalArdsl.g:7145:2: 'start'
            {
             before(grammarAccess.getScoreAccess().getStartKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getScoreAccess().getStartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__0__Impl"


    // $ANTLR start "rule__Score__Group__1"
    // InternalArdsl.g:7154:1: rule__Score__Group__1 : rule__Score__Group__1__Impl rule__Score__Group__2 ;
    public final void rule__Score__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7158:1: ( rule__Score__Group__1__Impl rule__Score__Group__2 )
            // InternalArdsl.g:7159:2: rule__Score__Group__1__Impl rule__Score__Group__2
            {
            pushFollow(FOLLOW_61);
            rule__Score__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__1"


    // $ANTLR start "rule__Score__Group__1__Impl"
    // InternalArdsl.g:7166:1: rule__Score__Group__1__Impl : ( ( rule__Score__StartAssignment_1 ) ) ;
    public final void rule__Score__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7170:1: ( ( ( rule__Score__StartAssignment_1 ) ) )
            // InternalArdsl.g:7171:1: ( ( rule__Score__StartAssignment_1 ) )
            {
            // InternalArdsl.g:7171:1: ( ( rule__Score__StartAssignment_1 ) )
            // InternalArdsl.g:7172:2: ( rule__Score__StartAssignment_1 )
            {
             before(grammarAccess.getScoreAccess().getStartAssignment_1()); 
            // InternalArdsl.g:7173:2: ( rule__Score__StartAssignment_1 )
            // InternalArdsl.g:7173:3: rule__Score__StartAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Score__StartAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScoreAccess().getStartAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__1__Impl"


    // $ANTLR start "rule__Score__Group__2"
    // InternalArdsl.g:7181:1: rule__Score__Group__2 : rule__Score__Group__2__Impl rule__Score__Group__3 ;
    public final void rule__Score__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7185:1: ( rule__Score__Group__2__Impl rule__Score__Group__3 )
            // InternalArdsl.g:7186:2: rule__Score__Group__2__Impl rule__Score__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Score__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__2"


    // $ANTLR start "rule__Score__Group__2__Impl"
    // InternalArdsl.g:7193:1: rule__Score__Group__2__Impl : ( 'goal' ) ;
    public final void rule__Score__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7197:1: ( ( 'goal' ) )
            // InternalArdsl.g:7198:1: ( 'goal' )
            {
            // InternalArdsl.g:7198:1: ( 'goal' )
            // InternalArdsl.g:7199:2: 'goal'
            {
             before(grammarAccess.getScoreAccess().getGoalKeyword_2()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getScoreAccess().getGoalKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__2__Impl"


    // $ANTLR start "rule__Score__Group__3"
    // InternalArdsl.g:7208:1: rule__Score__Group__3 : rule__Score__Group__3__Impl rule__Score__Group__4 ;
    public final void rule__Score__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7212:1: ( rule__Score__Group__3__Impl rule__Score__Group__4 )
            // InternalArdsl.g:7213:2: rule__Score__Group__3__Impl rule__Score__Group__4
            {
            pushFollow(FOLLOW_62);
            rule__Score__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__3"


    // $ANTLR start "rule__Score__Group__3__Impl"
    // InternalArdsl.g:7220:1: rule__Score__Group__3__Impl : ( ( rule__Score__FinishAssignment_3 ) ) ;
    public final void rule__Score__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7224:1: ( ( ( rule__Score__FinishAssignment_3 ) ) )
            // InternalArdsl.g:7225:1: ( ( rule__Score__FinishAssignment_3 ) )
            {
            // InternalArdsl.g:7225:1: ( ( rule__Score__FinishAssignment_3 ) )
            // InternalArdsl.g:7226:2: ( rule__Score__FinishAssignment_3 )
            {
             before(grammarAccess.getScoreAccess().getFinishAssignment_3()); 
            // InternalArdsl.g:7227:2: ( rule__Score__FinishAssignment_3 )
            // InternalArdsl.g:7227:3: rule__Score__FinishAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Score__FinishAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScoreAccess().getFinishAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__3__Impl"


    // $ANTLR start "rule__Score__Group__4"
    // InternalArdsl.g:7235:1: rule__Score__Group__4 : rule__Score__Group__4__Impl rule__Score__Group__5 ;
    public final void rule__Score__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7239:1: ( rule__Score__Group__4__Impl rule__Score__Group__5 )
            // InternalArdsl.g:7240:2: rule__Score__Group__4__Impl rule__Score__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Score__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__4"


    // $ANTLR start "rule__Score__Group__4__Impl"
    // InternalArdsl.g:7247:1: rule__Score__Group__4__Impl : ( 'lives' ) ;
    public final void rule__Score__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7251:1: ( ( 'lives' ) )
            // InternalArdsl.g:7252:1: ( 'lives' )
            {
            // InternalArdsl.g:7252:1: ( 'lives' )
            // InternalArdsl.g:7253:2: 'lives'
            {
             before(grammarAccess.getScoreAccess().getLivesKeyword_4()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getScoreAccess().getLivesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__4__Impl"


    // $ANTLR start "rule__Score__Group__5"
    // InternalArdsl.g:7262:1: rule__Score__Group__5 : rule__Score__Group__5__Impl ;
    public final void rule__Score__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7266:1: ( rule__Score__Group__5__Impl )
            // InternalArdsl.g:7267:2: rule__Score__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Score__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__5"


    // $ANTLR start "rule__Score__Group__5__Impl"
    // InternalArdsl.g:7273:1: rule__Score__Group__5__Impl : ( ( rule__Score__LivesAssignment_5 ) ) ;
    public final void rule__Score__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7277:1: ( ( ( rule__Score__LivesAssignment_5 ) ) )
            // InternalArdsl.g:7278:1: ( ( rule__Score__LivesAssignment_5 ) )
            {
            // InternalArdsl.g:7278:1: ( ( rule__Score__LivesAssignment_5 ) )
            // InternalArdsl.g:7279:2: ( rule__Score__LivesAssignment_5 )
            {
             before(grammarAccess.getScoreAccess().getLivesAssignment_5()); 
            // InternalArdsl.g:7280:2: ( rule__Score__LivesAssignment_5 )
            // InternalArdsl.g:7280:3: rule__Score__LivesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Score__LivesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getScoreAccess().getLivesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__5__Impl"


    // $ANTLR start "rule__Actions__Group__0"
    // InternalArdsl.g:7289:1: rule__Actions__Group__0 : rule__Actions__Group__0__Impl rule__Actions__Group__1 ;
    public final void rule__Actions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7293:1: ( rule__Actions__Group__0__Impl rule__Actions__Group__1 )
            // InternalArdsl.g:7294:2: rule__Actions__Group__0__Impl rule__Actions__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Actions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__0"


    // $ANTLR start "rule__Actions__Group__0__Impl"
    // InternalArdsl.g:7301:1: rule__Actions__Group__0__Impl : ( ( rule__Actions__NameAssignment_0 ) ) ;
    public final void rule__Actions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7305:1: ( ( ( rule__Actions__NameAssignment_0 ) ) )
            // InternalArdsl.g:7306:1: ( ( rule__Actions__NameAssignment_0 ) )
            {
            // InternalArdsl.g:7306:1: ( ( rule__Actions__NameAssignment_0 ) )
            // InternalArdsl.g:7307:2: ( rule__Actions__NameAssignment_0 )
            {
             before(grammarAccess.getActionsAccess().getNameAssignment_0()); 
            // InternalArdsl.g:7308:2: ( rule__Actions__NameAssignment_0 )
            // InternalArdsl.g:7308:3: rule__Actions__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Actions__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActionsAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__0__Impl"


    // $ANTLR start "rule__Actions__Group__1"
    // InternalArdsl.g:7316:1: rule__Actions__Group__1 : rule__Actions__Group__1__Impl rule__Actions__Group__2 ;
    public final void rule__Actions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7320:1: ( rule__Actions__Group__1__Impl rule__Actions__Group__2 )
            // InternalArdsl.g:7321:2: rule__Actions__Group__1__Impl rule__Actions__Group__2
            {
            pushFollow(FOLLOW_63);
            rule__Actions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__1"


    // $ANTLR start "rule__Actions__Group__1__Impl"
    // InternalArdsl.g:7328:1: rule__Actions__Group__1__Impl : ( '{' ) ;
    public final void rule__Actions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7332:1: ( ( '{' ) )
            // InternalArdsl.g:7333:1: ( '{' )
            {
            // InternalArdsl.g:7333:1: ( '{' )
            // InternalArdsl.g:7334:2: '{'
            {
             before(grammarAccess.getActionsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getActionsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__1__Impl"


    // $ANTLR start "rule__Actions__Group__2"
    // InternalArdsl.g:7343:1: rule__Actions__Group__2 : rule__Actions__Group__2__Impl rule__Actions__Group__3 ;
    public final void rule__Actions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7347:1: ( rule__Actions__Group__2__Impl rule__Actions__Group__3 )
            // InternalArdsl.g:7348:2: rule__Actions__Group__2__Impl rule__Actions__Group__3
            {
            pushFollow(FOLLOW_63);
            rule__Actions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__2"


    // $ANTLR start "rule__Actions__Group__2__Impl"
    // InternalArdsl.g:7355:1: rule__Actions__Group__2__Impl : ( ( rule__Actions__Group_2__0 )? ) ;
    public final void rule__Actions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7359:1: ( ( ( rule__Actions__Group_2__0 )? ) )
            // InternalArdsl.g:7360:1: ( ( rule__Actions__Group_2__0 )? )
            {
            // InternalArdsl.g:7360:1: ( ( rule__Actions__Group_2__0 )? )
            // InternalArdsl.g:7361:2: ( rule__Actions__Group_2__0 )?
            {
             before(grammarAccess.getActionsAccess().getGroup_2()); 
            // InternalArdsl.g:7362:2: ( rule__Actions__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==87) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalArdsl.g:7362:3: rule__Actions__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actions__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__2__Impl"


    // $ANTLR start "rule__Actions__Group__3"
    // InternalArdsl.g:7370:1: rule__Actions__Group__3 : rule__Actions__Group__3__Impl rule__Actions__Group__4 ;
    public final void rule__Actions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7374:1: ( rule__Actions__Group__3__Impl rule__Actions__Group__4 )
            // InternalArdsl.g:7375:2: rule__Actions__Group__3__Impl rule__Actions__Group__4
            {
            pushFollow(FOLLOW_63);
            rule__Actions__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__3"


    // $ANTLR start "rule__Actions__Group__3__Impl"
    // InternalArdsl.g:7382:1: rule__Actions__Group__3__Impl : ( ( rule__Actions__Group_3__0 )? ) ;
    public final void rule__Actions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7386:1: ( ( ( rule__Actions__Group_3__0 )? ) )
            // InternalArdsl.g:7387:1: ( ( rule__Actions__Group_3__0 )? )
            {
            // InternalArdsl.g:7387:1: ( ( rule__Actions__Group_3__0 )? )
            // InternalArdsl.g:7388:2: ( rule__Actions__Group_3__0 )?
            {
             before(grammarAccess.getActionsAccess().getGroup_3()); 
            // InternalArdsl.g:7389:2: ( rule__Actions__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==88) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalArdsl.g:7389:3: rule__Actions__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actions__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__3__Impl"


    // $ANTLR start "rule__Actions__Group__4"
    // InternalArdsl.g:7397:1: rule__Actions__Group__4 : rule__Actions__Group__4__Impl rule__Actions__Group__5 ;
    public final void rule__Actions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7401:1: ( rule__Actions__Group__4__Impl rule__Actions__Group__5 )
            // InternalArdsl.g:7402:2: rule__Actions__Group__4__Impl rule__Actions__Group__5
            {
            pushFollow(FOLLOW_63);
            rule__Actions__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__4"


    // $ANTLR start "rule__Actions__Group__4__Impl"
    // InternalArdsl.g:7409:1: rule__Actions__Group__4__Impl : ( ( rule__Actions__Group_4__0 )? ) ;
    public final void rule__Actions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7413:1: ( ( ( rule__Actions__Group_4__0 )? ) )
            // InternalArdsl.g:7414:1: ( ( rule__Actions__Group_4__0 )? )
            {
            // InternalArdsl.g:7414:1: ( ( rule__Actions__Group_4__0 )? )
            // InternalArdsl.g:7415:2: ( rule__Actions__Group_4__0 )?
            {
             before(grammarAccess.getActionsAccess().getGroup_4()); 
            // InternalArdsl.g:7416:2: ( rule__Actions__Group_4__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==80) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalArdsl.g:7416:3: rule__Actions__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actions__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__4__Impl"


    // $ANTLR start "rule__Actions__Group__5"
    // InternalArdsl.g:7424:1: rule__Actions__Group__5 : rule__Actions__Group__5__Impl rule__Actions__Group__6 ;
    public final void rule__Actions__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7428:1: ( rule__Actions__Group__5__Impl rule__Actions__Group__6 )
            // InternalArdsl.g:7429:2: rule__Actions__Group__5__Impl rule__Actions__Group__6
            {
            pushFollow(FOLLOW_63);
            rule__Actions__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__5"


    // $ANTLR start "rule__Actions__Group__5__Impl"
    // InternalArdsl.g:7436:1: rule__Actions__Group__5__Impl : ( ( rule__Actions__Group_5__0 )? ) ;
    public final void rule__Actions__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7440:1: ( ( ( rule__Actions__Group_5__0 )? ) )
            // InternalArdsl.g:7441:1: ( ( rule__Actions__Group_5__0 )? )
            {
            // InternalArdsl.g:7441:1: ( ( rule__Actions__Group_5__0 )? )
            // InternalArdsl.g:7442:2: ( rule__Actions__Group_5__0 )?
            {
             before(grammarAccess.getActionsAccess().getGroup_5()); 
            // InternalArdsl.g:7443:2: ( rule__Actions__Group_5__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==89) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalArdsl.g:7443:3: rule__Actions__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actions__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionsAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__5__Impl"


    // $ANTLR start "rule__Actions__Group__6"
    // InternalArdsl.g:7451:1: rule__Actions__Group__6 : rule__Actions__Group__6__Impl rule__Actions__Group__7 ;
    public final void rule__Actions__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7455:1: ( rule__Actions__Group__6__Impl rule__Actions__Group__7 )
            // InternalArdsl.g:7456:2: rule__Actions__Group__6__Impl rule__Actions__Group__7
            {
            pushFollow(FOLLOW_63);
            rule__Actions__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__6"


    // $ANTLR start "rule__Actions__Group__6__Impl"
    // InternalArdsl.g:7463:1: rule__Actions__Group__6__Impl : ( ( rule__Actions__Group_6__0 )? ) ;
    public final void rule__Actions__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7467:1: ( ( ( rule__Actions__Group_6__0 )? ) )
            // InternalArdsl.g:7468:1: ( ( rule__Actions__Group_6__0 )? )
            {
            // InternalArdsl.g:7468:1: ( ( rule__Actions__Group_6__0 )? )
            // InternalArdsl.g:7469:2: ( rule__Actions__Group_6__0 )?
            {
             before(grammarAccess.getActionsAccess().getGroup_6()); 
            // InternalArdsl.g:7470:2: ( rule__Actions__Group_6__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==90) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalArdsl.g:7470:3: rule__Actions__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actions__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionsAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__6__Impl"


    // $ANTLR start "rule__Actions__Group__7"
    // InternalArdsl.g:7478:1: rule__Actions__Group__7 : rule__Actions__Group__7__Impl ;
    public final void rule__Actions__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7482:1: ( rule__Actions__Group__7__Impl )
            // InternalArdsl.g:7483:2: rule__Actions__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__7"


    // $ANTLR start "rule__Actions__Group__7__Impl"
    // InternalArdsl.g:7489:1: rule__Actions__Group__7__Impl : ( '}' ) ;
    public final void rule__Actions__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7493:1: ( ( '}' ) )
            // InternalArdsl.g:7494:1: ( '}' )
            {
            // InternalArdsl.g:7494:1: ( '}' )
            // InternalArdsl.g:7495:2: '}'
            {
             before(grammarAccess.getActionsAccess().getRightCurlyBracketKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getActionsAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__7__Impl"


    // $ANTLR start "rule__Actions__Group_2__0"
    // InternalArdsl.g:7505:1: rule__Actions__Group_2__0 : rule__Actions__Group_2__0__Impl rule__Actions__Group_2__1 ;
    public final void rule__Actions__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7509:1: ( rule__Actions__Group_2__0__Impl rule__Actions__Group_2__1 )
            // InternalArdsl.g:7510:2: rule__Actions__Group_2__0__Impl rule__Actions__Group_2__1
            {
            pushFollow(FOLLOW_64);
            rule__Actions__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_2__0"


    // $ANTLR start "rule__Actions__Group_2__0__Impl"
    // InternalArdsl.g:7517:1: rule__Actions__Group_2__0__Impl : ( 'action' ) ;
    public final void rule__Actions__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7521:1: ( ( 'action' ) )
            // InternalArdsl.g:7522:1: ( 'action' )
            {
            // InternalArdsl.g:7522:1: ( 'action' )
            // InternalArdsl.g:7523:2: 'action'
            {
             before(grammarAccess.getActionsAccess().getActionKeyword_2_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getActionsAccess().getActionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_2__0__Impl"


    // $ANTLR start "rule__Actions__Group_2__1"
    // InternalArdsl.g:7532:1: rule__Actions__Group_2__1 : rule__Actions__Group_2__1__Impl ;
    public final void rule__Actions__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7536:1: ( rule__Actions__Group_2__1__Impl )
            // InternalArdsl.g:7537:2: rule__Actions__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_2__1"


    // $ANTLR start "rule__Actions__Group_2__1__Impl"
    // InternalArdsl.g:7543:1: rule__Actions__Group_2__1__Impl : ( ( rule__Actions__ActionAssignment_2_1 ) ) ;
    public final void rule__Actions__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7547:1: ( ( ( rule__Actions__ActionAssignment_2_1 ) ) )
            // InternalArdsl.g:7548:1: ( ( rule__Actions__ActionAssignment_2_1 ) )
            {
            // InternalArdsl.g:7548:1: ( ( rule__Actions__ActionAssignment_2_1 ) )
            // InternalArdsl.g:7549:2: ( rule__Actions__ActionAssignment_2_1 )
            {
             before(grammarAccess.getActionsAccess().getActionAssignment_2_1()); 
            // InternalArdsl.g:7550:2: ( rule__Actions__ActionAssignment_2_1 )
            // InternalArdsl.g:7550:3: rule__Actions__ActionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Actions__ActionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionsAccess().getActionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_2__1__Impl"


    // $ANTLR start "rule__Actions__Group_3__0"
    // InternalArdsl.g:7559:1: rule__Actions__Group_3__0 : rule__Actions__Group_3__0__Impl rule__Actions__Group_3__1 ;
    public final void rule__Actions__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7563:1: ( rule__Actions__Group_3__0__Impl rule__Actions__Group_3__1 )
            // InternalArdsl.g:7564:2: rule__Actions__Group_3__0__Impl rule__Actions__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Actions__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_3__0"


    // $ANTLR start "rule__Actions__Group_3__0__Impl"
    // InternalArdsl.g:7571:1: rule__Actions__Group_3__0__Impl : ( 'display' ) ;
    public final void rule__Actions__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7575:1: ( ( 'display' ) )
            // InternalArdsl.g:7576:1: ( 'display' )
            {
            // InternalArdsl.g:7576:1: ( 'display' )
            // InternalArdsl.g:7577:2: 'display'
            {
             before(grammarAccess.getActionsAccess().getDisplayKeyword_3_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getActionsAccess().getDisplayKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_3__0__Impl"


    // $ANTLR start "rule__Actions__Group_3__1"
    // InternalArdsl.g:7586:1: rule__Actions__Group_3__1 : rule__Actions__Group_3__1__Impl ;
    public final void rule__Actions__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7590:1: ( rule__Actions__Group_3__1__Impl )
            // InternalArdsl.g:7591:2: rule__Actions__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_3__1"


    // $ANTLR start "rule__Actions__Group_3__1__Impl"
    // InternalArdsl.g:7597:1: rule__Actions__Group_3__1__Impl : ( ( rule__Actions__MessageAssignment_3_1 ) ) ;
    public final void rule__Actions__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7601:1: ( ( ( rule__Actions__MessageAssignment_3_1 ) ) )
            // InternalArdsl.g:7602:1: ( ( rule__Actions__MessageAssignment_3_1 ) )
            {
            // InternalArdsl.g:7602:1: ( ( rule__Actions__MessageAssignment_3_1 ) )
            // InternalArdsl.g:7603:2: ( rule__Actions__MessageAssignment_3_1 )
            {
             before(grammarAccess.getActionsAccess().getMessageAssignment_3_1()); 
            // InternalArdsl.g:7604:2: ( rule__Actions__MessageAssignment_3_1 )
            // InternalArdsl.g:7604:3: rule__Actions__MessageAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Actions__MessageAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActionsAccess().getMessageAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_3__1__Impl"


    // $ANTLR start "rule__Actions__Group_4__0"
    // InternalArdsl.g:7613:1: rule__Actions__Group_4__0 : rule__Actions__Group_4__0__Impl rule__Actions__Group_4__1 ;
    public final void rule__Actions__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7617:1: ( rule__Actions__Group_4__0__Impl rule__Actions__Group_4__1 )
            // InternalArdsl.g:7618:2: rule__Actions__Group_4__0__Impl rule__Actions__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Actions__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_4__0"


    // $ANTLR start "rule__Actions__Group_4__0__Impl"
    // InternalArdsl.g:7625:1: rule__Actions__Group_4__0__Impl : ( 'score' ) ;
    public final void rule__Actions__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7629:1: ( ( 'score' ) )
            // InternalArdsl.g:7630:1: ( 'score' )
            {
            // InternalArdsl.g:7630:1: ( 'score' )
            // InternalArdsl.g:7631:2: 'score'
            {
             before(grammarAccess.getActionsAccess().getScoreKeyword_4_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getActionsAccess().getScoreKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_4__0__Impl"


    // $ANTLR start "rule__Actions__Group_4__1"
    // InternalArdsl.g:7640:1: rule__Actions__Group_4__1 : rule__Actions__Group_4__1__Impl ;
    public final void rule__Actions__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7644:1: ( rule__Actions__Group_4__1__Impl )
            // InternalArdsl.g:7645:2: rule__Actions__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_4__1"


    // $ANTLR start "rule__Actions__Group_4__1__Impl"
    // InternalArdsl.g:7651:1: rule__Actions__Group_4__1__Impl : ( ( rule__Actions__ScoreChangeAssignment_4_1 ) ) ;
    public final void rule__Actions__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7655:1: ( ( ( rule__Actions__ScoreChangeAssignment_4_1 ) ) )
            // InternalArdsl.g:7656:1: ( ( rule__Actions__ScoreChangeAssignment_4_1 ) )
            {
            // InternalArdsl.g:7656:1: ( ( rule__Actions__ScoreChangeAssignment_4_1 ) )
            // InternalArdsl.g:7657:2: ( rule__Actions__ScoreChangeAssignment_4_1 )
            {
             before(grammarAccess.getActionsAccess().getScoreChangeAssignment_4_1()); 
            // InternalArdsl.g:7658:2: ( rule__Actions__ScoreChangeAssignment_4_1 )
            // InternalArdsl.g:7658:3: rule__Actions__ScoreChangeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Actions__ScoreChangeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActionsAccess().getScoreChangeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_4__1__Impl"


    // $ANTLR start "rule__Actions__Group_5__0"
    // InternalArdsl.g:7667:1: rule__Actions__Group_5__0 : rule__Actions__Group_5__0__Impl rule__Actions__Group_5__1 ;
    public final void rule__Actions__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7671:1: ( rule__Actions__Group_5__0__Impl rule__Actions__Group_5__1 )
            // InternalArdsl.g:7672:2: rule__Actions__Group_5__0__Impl rule__Actions__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__Actions__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_5__0"


    // $ANTLR start "rule__Actions__Group_5__0__Impl"
    // InternalArdsl.g:7679:1: rule__Actions__Group_5__0__Impl : ( 'timeEach' ) ;
    public final void rule__Actions__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7683:1: ( ( 'timeEach' ) )
            // InternalArdsl.g:7684:1: ( 'timeEach' )
            {
            // InternalArdsl.g:7684:1: ( 'timeEach' )
            // InternalArdsl.g:7685:2: 'timeEach'
            {
             before(grammarAccess.getActionsAccess().getTimeEachKeyword_5_0()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getActionsAccess().getTimeEachKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_5__0__Impl"


    // $ANTLR start "rule__Actions__Group_5__1"
    // InternalArdsl.g:7694:1: rule__Actions__Group_5__1 : rule__Actions__Group_5__1__Impl ;
    public final void rule__Actions__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7698:1: ( rule__Actions__Group_5__1__Impl )
            // InternalArdsl.g:7699:2: rule__Actions__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_5__1"


    // $ANTLR start "rule__Actions__Group_5__1__Impl"
    // InternalArdsl.g:7705:1: rule__Actions__Group_5__1__Impl : ( ( rule__Actions__TimeTriggerAssignment_5_1 ) ) ;
    public final void rule__Actions__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7709:1: ( ( ( rule__Actions__TimeTriggerAssignment_5_1 ) ) )
            // InternalArdsl.g:7710:1: ( ( rule__Actions__TimeTriggerAssignment_5_1 ) )
            {
            // InternalArdsl.g:7710:1: ( ( rule__Actions__TimeTriggerAssignment_5_1 ) )
            // InternalArdsl.g:7711:2: ( rule__Actions__TimeTriggerAssignment_5_1 )
            {
             before(grammarAccess.getActionsAccess().getTimeTriggerAssignment_5_1()); 
            // InternalArdsl.g:7712:2: ( rule__Actions__TimeTriggerAssignment_5_1 )
            // InternalArdsl.g:7712:3: rule__Actions__TimeTriggerAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Actions__TimeTriggerAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getActionsAccess().getTimeTriggerAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_5__1__Impl"


    // $ANTLR start "rule__Actions__Group_6__0"
    // InternalArdsl.g:7721:1: rule__Actions__Group_6__0 : rule__Actions__Group_6__0__Impl rule__Actions__Group_6__1 ;
    public final void rule__Actions__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7725:1: ( rule__Actions__Group_6__0__Impl rule__Actions__Group_6__1 )
            // InternalArdsl.g:7726:2: rule__Actions__Group_6__0__Impl rule__Actions__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Actions__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_6__0"


    // $ANTLR start "rule__Actions__Group_6__0__Impl"
    // InternalArdsl.g:7733:1: rule__Actions__Group_6__0__Impl : ( 'changes' ) ;
    public final void rule__Actions__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7737:1: ( ( 'changes' ) )
            // InternalArdsl.g:7738:1: ( 'changes' )
            {
            // InternalArdsl.g:7738:1: ( 'changes' )
            // InternalArdsl.g:7739:2: 'changes'
            {
             before(grammarAccess.getActionsAccess().getChangesKeyword_6_0()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getActionsAccess().getChangesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_6__0__Impl"


    // $ANTLR start "rule__Actions__Group_6__1"
    // InternalArdsl.g:7748:1: rule__Actions__Group_6__1 : rule__Actions__Group_6__1__Impl rule__Actions__Group_6__2 ;
    public final void rule__Actions__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7752:1: ( rule__Actions__Group_6__1__Impl rule__Actions__Group_6__2 )
            // InternalArdsl.g:7753:2: rule__Actions__Group_6__1__Impl rule__Actions__Group_6__2
            {
            pushFollow(FOLLOW_65);
            rule__Actions__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_6__1"


    // $ANTLR start "rule__Actions__Group_6__1__Impl"
    // InternalArdsl.g:7760:1: rule__Actions__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Actions__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7764:1: ( ( '{' ) )
            // InternalArdsl.g:7765:1: ( '{' )
            {
            // InternalArdsl.g:7765:1: ( '{' )
            // InternalArdsl.g:7766:2: '{'
            {
             before(grammarAccess.getActionsAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getActionsAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_6__1__Impl"


    // $ANTLR start "rule__Actions__Group_6__2"
    // InternalArdsl.g:7775:1: rule__Actions__Group_6__2 : rule__Actions__Group_6__2__Impl rule__Actions__Group_6__3 ;
    public final void rule__Actions__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7779:1: ( rule__Actions__Group_6__2__Impl rule__Actions__Group_6__3 )
            // InternalArdsl.g:7780:2: rule__Actions__Group_6__2__Impl rule__Actions__Group_6__3
            {
            pushFollow(FOLLOW_6);
            rule__Actions__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_6__2"


    // $ANTLR start "rule__Actions__Group_6__2__Impl"
    // InternalArdsl.g:7787:1: rule__Actions__Group_6__2__Impl : ( ( rule__Actions__PhysicChangesAssignment_6_2 ) ) ;
    public final void rule__Actions__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7791:1: ( ( ( rule__Actions__PhysicChangesAssignment_6_2 ) ) )
            // InternalArdsl.g:7792:1: ( ( rule__Actions__PhysicChangesAssignment_6_2 ) )
            {
            // InternalArdsl.g:7792:1: ( ( rule__Actions__PhysicChangesAssignment_6_2 ) )
            // InternalArdsl.g:7793:2: ( rule__Actions__PhysicChangesAssignment_6_2 )
            {
             before(grammarAccess.getActionsAccess().getPhysicChangesAssignment_6_2()); 
            // InternalArdsl.g:7794:2: ( rule__Actions__PhysicChangesAssignment_6_2 )
            // InternalArdsl.g:7794:3: rule__Actions__PhysicChangesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Actions__PhysicChangesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getActionsAccess().getPhysicChangesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_6__2__Impl"


    // $ANTLR start "rule__Actions__Group_6__3"
    // InternalArdsl.g:7802:1: rule__Actions__Group_6__3 : rule__Actions__Group_6__3__Impl rule__Actions__Group_6__4 ;
    public final void rule__Actions__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7806:1: ( rule__Actions__Group_6__3__Impl rule__Actions__Group_6__4 )
            // InternalArdsl.g:7807:2: rule__Actions__Group_6__3__Impl rule__Actions__Group_6__4
            {
            pushFollow(FOLLOW_6);
            rule__Actions__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_6__3"


    // $ANTLR start "rule__Actions__Group_6__3__Impl"
    // InternalArdsl.g:7814:1: rule__Actions__Group_6__3__Impl : ( ( rule__Actions__Group_6_3__0 )* ) ;
    public final void rule__Actions__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7818:1: ( ( ( rule__Actions__Group_6_3__0 )* ) )
            // InternalArdsl.g:7819:1: ( ( rule__Actions__Group_6_3__0 )* )
            {
            // InternalArdsl.g:7819:1: ( ( rule__Actions__Group_6_3__0 )* )
            // InternalArdsl.g:7820:2: ( rule__Actions__Group_6_3__0 )*
            {
             before(grammarAccess.getActionsAccess().getGroup_6_3()); 
            // InternalArdsl.g:7821:2: ( rule__Actions__Group_6_3__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==40) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalArdsl.g:7821:3: rule__Actions__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Actions__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getActionsAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_6__3__Impl"


    // $ANTLR start "rule__Actions__Group_6__4"
    // InternalArdsl.g:7829:1: rule__Actions__Group_6__4 : rule__Actions__Group_6__4__Impl ;
    public final void rule__Actions__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7833:1: ( rule__Actions__Group_6__4__Impl )
            // InternalArdsl.g:7834:2: rule__Actions__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_6__4"


    // $ANTLR start "rule__Actions__Group_6__4__Impl"
    // InternalArdsl.g:7840:1: rule__Actions__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Actions__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7844:1: ( ( '}' ) )
            // InternalArdsl.g:7845:1: ( '}' )
            {
            // InternalArdsl.g:7845:1: ( '}' )
            // InternalArdsl.g:7846:2: '}'
            {
             before(grammarAccess.getActionsAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getActionsAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_6__4__Impl"


    // $ANTLR start "rule__Actions__Group_6_3__0"
    // InternalArdsl.g:7856:1: rule__Actions__Group_6_3__0 : rule__Actions__Group_6_3__0__Impl rule__Actions__Group_6_3__1 ;
    public final void rule__Actions__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7860:1: ( rule__Actions__Group_6_3__0__Impl rule__Actions__Group_6_3__1 )
            // InternalArdsl.g:7861:2: rule__Actions__Group_6_3__0__Impl rule__Actions__Group_6_3__1
            {
            pushFollow(FOLLOW_65);
            rule__Actions__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_6_3__0"


    // $ANTLR start "rule__Actions__Group_6_3__0__Impl"
    // InternalArdsl.g:7868:1: rule__Actions__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Actions__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7872:1: ( ( ',' ) )
            // InternalArdsl.g:7873:1: ( ',' )
            {
            // InternalArdsl.g:7873:1: ( ',' )
            // InternalArdsl.g:7874:2: ','
            {
             before(grammarAccess.getActionsAccess().getCommaKeyword_6_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getActionsAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_6_3__0__Impl"


    // $ANTLR start "rule__Actions__Group_6_3__1"
    // InternalArdsl.g:7883:1: rule__Actions__Group_6_3__1 : rule__Actions__Group_6_3__1__Impl ;
    public final void rule__Actions__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7887:1: ( rule__Actions__Group_6_3__1__Impl )
            // InternalArdsl.g:7888:2: rule__Actions__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_6_3__1"


    // $ANTLR start "rule__Actions__Group_6_3__1__Impl"
    // InternalArdsl.g:7894:1: rule__Actions__Group_6_3__1__Impl : ( ( rule__Actions__PhysicChangesAssignment_6_3_1 ) ) ;
    public final void rule__Actions__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7898:1: ( ( ( rule__Actions__PhysicChangesAssignment_6_3_1 ) ) )
            // InternalArdsl.g:7899:1: ( ( rule__Actions__PhysicChangesAssignment_6_3_1 ) )
            {
            // InternalArdsl.g:7899:1: ( ( rule__Actions__PhysicChangesAssignment_6_3_1 ) )
            // InternalArdsl.g:7900:2: ( rule__Actions__PhysicChangesAssignment_6_3_1 )
            {
             before(grammarAccess.getActionsAccess().getPhysicChangesAssignment_6_3_1()); 
            // InternalArdsl.g:7901:2: ( rule__Actions__PhysicChangesAssignment_6_3_1 )
            // InternalArdsl.g:7901:3: rule__Actions__PhysicChangesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Actions__PhysicChangesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActionsAccess().getPhysicChangesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group_6_3__1__Impl"


    // $ANTLR start "rule__Collisions__Group__0"
    // InternalArdsl.g:7910:1: rule__Collisions__Group__0 : rule__Collisions__Group__0__Impl rule__Collisions__Group__1 ;
    public final void rule__Collisions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7914:1: ( rule__Collisions__Group__0__Impl rule__Collisions__Group__1 )
            // InternalArdsl.g:7915:2: rule__Collisions__Group__0__Impl rule__Collisions__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Collisions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collisions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collisions__Group__0"


    // $ANTLR start "rule__Collisions__Group__0__Impl"
    // InternalArdsl.g:7922:1: rule__Collisions__Group__0__Impl : ( 'element' ) ;
    public final void rule__Collisions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7926:1: ( ( 'element' ) )
            // InternalArdsl.g:7927:1: ( 'element' )
            {
            // InternalArdsl.g:7927:1: ( 'element' )
            // InternalArdsl.g:7928:2: 'element'
            {
             before(grammarAccess.getCollisionsAccess().getElementKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCollisionsAccess().getElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collisions__Group__0__Impl"


    // $ANTLR start "rule__Collisions__Group__1"
    // InternalArdsl.g:7937:1: rule__Collisions__Group__1 : rule__Collisions__Group__1__Impl rule__Collisions__Group__2 ;
    public final void rule__Collisions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7941:1: ( rule__Collisions__Group__1__Impl rule__Collisions__Group__2 )
            // InternalArdsl.g:7942:2: rule__Collisions__Group__1__Impl rule__Collisions__Group__2
            {
            pushFollow(FOLLOW_66);
            rule__Collisions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collisions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collisions__Group__1"


    // $ANTLR start "rule__Collisions__Group__1__Impl"
    // InternalArdsl.g:7949:1: rule__Collisions__Group__1__Impl : ( ( rule__Collisions__ClassAAssignment_1 ) ) ;
    public final void rule__Collisions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7953:1: ( ( ( rule__Collisions__ClassAAssignment_1 ) ) )
            // InternalArdsl.g:7954:1: ( ( rule__Collisions__ClassAAssignment_1 ) )
            {
            // InternalArdsl.g:7954:1: ( ( rule__Collisions__ClassAAssignment_1 ) )
            // InternalArdsl.g:7955:2: ( rule__Collisions__ClassAAssignment_1 )
            {
             before(grammarAccess.getCollisionsAccess().getClassAAssignment_1()); 
            // InternalArdsl.g:7956:2: ( rule__Collisions__ClassAAssignment_1 )
            // InternalArdsl.g:7956:3: rule__Collisions__ClassAAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Collisions__ClassAAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCollisionsAccess().getClassAAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collisions__Group__1__Impl"


    // $ANTLR start "rule__Collisions__Group__2"
    // InternalArdsl.g:7964:1: rule__Collisions__Group__2 : rule__Collisions__Group__2__Impl rule__Collisions__Group__3 ;
    public final void rule__Collisions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7968:1: ( rule__Collisions__Group__2__Impl rule__Collisions__Group__3 )
            // InternalArdsl.g:7969:2: rule__Collisions__Group__2__Impl rule__Collisions__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Collisions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collisions__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collisions__Group__2"


    // $ANTLR start "rule__Collisions__Group__2__Impl"
    // InternalArdsl.g:7976:1: rule__Collisions__Group__2__Impl : ( 'to' ) ;
    public final void rule__Collisions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7980:1: ( ( 'to' ) )
            // InternalArdsl.g:7981:1: ( 'to' )
            {
            // InternalArdsl.g:7981:1: ( 'to' )
            // InternalArdsl.g:7982:2: 'to'
            {
             before(grammarAccess.getCollisionsAccess().getToKeyword_2()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getCollisionsAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collisions__Group__2__Impl"


    // $ANTLR start "rule__Collisions__Group__3"
    // InternalArdsl.g:7991:1: rule__Collisions__Group__3 : rule__Collisions__Group__3__Impl rule__Collisions__Group__4 ;
    public final void rule__Collisions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:7995:1: ( rule__Collisions__Group__3__Impl rule__Collisions__Group__4 )
            // InternalArdsl.g:7996:2: rule__Collisions__Group__3__Impl rule__Collisions__Group__4
            {
            pushFollow(FOLLOW_67);
            rule__Collisions__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collisions__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collisions__Group__3"


    // $ANTLR start "rule__Collisions__Group__3__Impl"
    // InternalArdsl.g:8003:1: rule__Collisions__Group__3__Impl : ( ( rule__Collisions__ClassBAssignment_3 ) ) ;
    public final void rule__Collisions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8007:1: ( ( ( rule__Collisions__ClassBAssignment_3 ) ) )
            // InternalArdsl.g:8008:1: ( ( rule__Collisions__ClassBAssignment_3 ) )
            {
            // InternalArdsl.g:8008:1: ( ( rule__Collisions__ClassBAssignment_3 ) )
            // InternalArdsl.g:8009:2: ( rule__Collisions__ClassBAssignment_3 )
            {
             before(grammarAccess.getCollisionsAccess().getClassBAssignment_3()); 
            // InternalArdsl.g:8010:2: ( rule__Collisions__ClassBAssignment_3 )
            // InternalArdsl.g:8010:3: rule__Collisions__ClassBAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Collisions__ClassBAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCollisionsAccess().getClassBAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collisions__Group__3__Impl"


    // $ANTLR start "rule__Collisions__Group__4"
    // InternalArdsl.g:8018:1: rule__Collisions__Group__4 : rule__Collisions__Group__4__Impl rule__Collisions__Group__5 ;
    public final void rule__Collisions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8022:1: ( rule__Collisions__Group__4__Impl rule__Collisions__Group__5 )
            // InternalArdsl.g:8023:2: rule__Collisions__Group__4__Impl rule__Collisions__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Collisions__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collisions__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collisions__Group__4"


    // $ANTLR start "rule__Collisions__Group__4__Impl"
    // InternalArdsl.g:8030:1: rule__Collisions__Group__4__Impl : ( '->' ) ;
    public final void rule__Collisions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8034:1: ( ( '->' ) )
            // InternalArdsl.g:8035:1: ( '->' )
            {
            // InternalArdsl.g:8035:1: ( '->' )
            // InternalArdsl.g:8036:2: '->'
            {
             before(grammarAccess.getCollisionsAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getCollisionsAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collisions__Group__4__Impl"


    // $ANTLR start "rule__Collisions__Group__5"
    // InternalArdsl.g:8045:1: rule__Collisions__Group__5 : rule__Collisions__Group__5__Impl ;
    public final void rule__Collisions__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8049:1: ( rule__Collisions__Group__5__Impl )
            // InternalArdsl.g:8050:2: rule__Collisions__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collisions__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collisions__Group__5"


    // $ANTLR start "rule__Collisions__Group__5__Impl"
    // InternalArdsl.g:8056:1: rule__Collisions__Group__5__Impl : ( ( rule__Collisions__ActionAssignment_5 ) ) ;
    public final void rule__Collisions__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8060:1: ( ( ( rule__Collisions__ActionAssignment_5 ) ) )
            // InternalArdsl.g:8061:1: ( ( rule__Collisions__ActionAssignment_5 ) )
            {
            // InternalArdsl.g:8061:1: ( ( rule__Collisions__ActionAssignment_5 ) )
            // InternalArdsl.g:8062:2: ( rule__Collisions__ActionAssignment_5 )
            {
             before(grammarAccess.getCollisionsAccess().getActionAssignment_5()); 
            // InternalArdsl.g:8063:2: ( rule__Collisions__ActionAssignment_5 )
            // InternalArdsl.g:8063:3: rule__Collisions__ActionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Collisions__ActionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCollisionsAccess().getActionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collisions__Group__5__Impl"


    // $ANTLR start "rule__PhysicChanges__Group__0"
    // InternalArdsl.g:8072:1: rule__PhysicChanges__Group__0 : rule__PhysicChanges__Group__0__Impl rule__PhysicChanges__Group__1 ;
    public final void rule__PhysicChanges__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8076:1: ( rule__PhysicChanges__Group__0__Impl rule__PhysicChanges__Group__1 )
            // InternalArdsl.g:8077:2: rule__PhysicChanges__Group__0__Impl rule__PhysicChanges__Group__1
            {
            pushFollow(FOLLOW_68);
            rule__PhysicChanges__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__0"


    // $ANTLR start "rule__PhysicChanges__Group__0__Impl"
    // InternalArdsl.g:8084:1: rule__PhysicChanges__Group__0__Impl : ( 'do' ) ;
    public final void rule__PhysicChanges__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8088:1: ( ( 'do' ) )
            // InternalArdsl.g:8089:1: ( 'do' )
            {
            // InternalArdsl.g:8089:1: ( 'do' )
            // InternalArdsl.g:8090:2: 'do'
            {
             before(grammarAccess.getPhysicChangesAccess().getDoKeyword_0()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getPhysicChangesAccess().getDoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__0__Impl"


    // $ANTLR start "rule__PhysicChanges__Group__1"
    // InternalArdsl.g:8099:1: rule__PhysicChanges__Group__1 : rule__PhysicChanges__Group__1__Impl rule__PhysicChanges__Group__2 ;
    public final void rule__PhysicChanges__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8103:1: ( rule__PhysicChanges__Group__1__Impl rule__PhysicChanges__Group__2 )
            // InternalArdsl.g:8104:2: rule__PhysicChanges__Group__1__Impl rule__PhysicChanges__Group__2
            {
            pushFollow(FOLLOW_69);
            rule__PhysicChanges__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__1"


    // $ANTLR start "rule__PhysicChanges__Group__1__Impl"
    // InternalArdsl.g:8111:1: rule__PhysicChanges__Group__1__Impl : ( ( rule__PhysicChanges__ActionAssignment_1 ) ) ;
    public final void rule__PhysicChanges__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8115:1: ( ( ( rule__PhysicChanges__ActionAssignment_1 ) ) )
            // InternalArdsl.g:8116:1: ( ( rule__PhysicChanges__ActionAssignment_1 ) )
            {
            // InternalArdsl.g:8116:1: ( ( rule__PhysicChanges__ActionAssignment_1 ) )
            // InternalArdsl.g:8117:2: ( rule__PhysicChanges__ActionAssignment_1 )
            {
             before(grammarAccess.getPhysicChangesAccess().getActionAssignment_1()); 
            // InternalArdsl.g:8118:2: ( rule__PhysicChanges__ActionAssignment_1 )
            // InternalArdsl.g:8118:3: rule__PhysicChanges__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChanges__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangesAccess().getActionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__1__Impl"


    // $ANTLR start "rule__PhysicChanges__Group__2"
    // InternalArdsl.g:8126:1: rule__PhysicChanges__Group__2 : rule__PhysicChanges__Group__2__Impl rule__PhysicChanges__Group__3 ;
    public final void rule__PhysicChanges__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8130:1: ( rule__PhysicChanges__Group__2__Impl rule__PhysicChanges__Group__3 )
            // InternalArdsl.g:8131:2: rule__PhysicChanges__Group__2__Impl rule__PhysicChanges__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__PhysicChanges__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__2"


    // $ANTLR start "rule__PhysicChanges__Group__2__Impl"
    // InternalArdsl.g:8138:1: rule__PhysicChanges__Group__2__Impl : ( 'in' ) ;
    public final void rule__PhysicChanges__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8142:1: ( ( 'in' ) )
            // InternalArdsl.g:8143:1: ( 'in' )
            {
            // InternalArdsl.g:8143:1: ( 'in' )
            // InternalArdsl.g:8144:2: 'in'
            {
             before(grammarAccess.getPhysicChangesAccess().getInKeyword_2()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getPhysicChangesAccess().getInKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__2__Impl"


    // $ANTLR start "rule__PhysicChanges__Group__3"
    // InternalArdsl.g:8153:1: rule__PhysicChanges__Group__3 : rule__PhysicChanges__Group__3__Impl rule__PhysicChanges__Group__4 ;
    public final void rule__PhysicChanges__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8157:1: ( rule__PhysicChanges__Group__3__Impl rule__PhysicChanges__Group__4 )
            // InternalArdsl.g:8158:2: rule__PhysicChanges__Group__3__Impl rule__PhysicChanges__Group__4
            {
            pushFollow(FOLLOW_70);
            rule__PhysicChanges__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__3"


    // $ANTLR start "rule__PhysicChanges__Group__3__Impl"
    // InternalArdsl.g:8165:1: rule__PhysicChanges__Group__3__Impl : ( ( rule__PhysicChanges__ClassAssignment_3 ) ) ;
    public final void rule__PhysicChanges__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8169:1: ( ( ( rule__PhysicChanges__ClassAssignment_3 ) ) )
            // InternalArdsl.g:8170:1: ( ( rule__PhysicChanges__ClassAssignment_3 ) )
            {
            // InternalArdsl.g:8170:1: ( ( rule__PhysicChanges__ClassAssignment_3 ) )
            // InternalArdsl.g:8171:2: ( rule__PhysicChanges__ClassAssignment_3 )
            {
             before(grammarAccess.getPhysicChangesAccess().getClassAssignment_3()); 
            // InternalArdsl.g:8172:2: ( rule__PhysicChanges__ClassAssignment_3 )
            // InternalArdsl.g:8172:3: rule__PhysicChanges__ClassAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChanges__ClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangesAccess().getClassAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__3__Impl"


    // $ANTLR start "rule__PhysicChanges__Group__4"
    // InternalArdsl.g:8180:1: rule__PhysicChanges__Group__4 : rule__PhysicChanges__Group__4__Impl rule__PhysicChanges__Group__5 ;
    public final void rule__PhysicChanges__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8184:1: ( rule__PhysicChanges__Group__4__Impl rule__PhysicChanges__Group__5 )
            // InternalArdsl.g:8185:2: rule__PhysicChanges__Group__4__Impl rule__PhysicChanges__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__PhysicChanges__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__4"


    // $ANTLR start "rule__PhysicChanges__Group__4__Impl"
    // InternalArdsl.g:8192:1: rule__PhysicChanges__Group__4__Impl : ( 'named' ) ;
    public final void rule__PhysicChanges__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8196:1: ( ( 'named' ) )
            // InternalArdsl.g:8197:1: ( 'named' )
            {
            // InternalArdsl.g:8197:1: ( 'named' )
            // InternalArdsl.g:8198:2: 'named'
            {
             before(grammarAccess.getPhysicChangesAccess().getNamedKeyword_4()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getPhysicChangesAccess().getNamedKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__4__Impl"


    // $ANTLR start "rule__PhysicChanges__Group__5"
    // InternalArdsl.g:8207:1: rule__PhysicChanges__Group__5 : rule__PhysicChanges__Group__5__Impl rule__PhysicChanges__Group__6 ;
    public final void rule__PhysicChanges__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8211:1: ( rule__PhysicChanges__Group__5__Impl rule__PhysicChanges__Group__6 )
            // InternalArdsl.g:8212:2: rule__PhysicChanges__Group__5__Impl rule__PhysicChanges__Group__6
            {
            pushFollow(FOLLOW_71);
            rule__PhysicChanges__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__5"


    // $ANTLR start "rule__PhysicChanges__Group__5__Impl"
    // InternalArdsl.g:8219:1: rule__PhysicChanges__Group__5__Impl : ( ( rule__PhysicChanges__ObjectAssignment_5 ) ) ;
    public final void rule__PhysicChanges__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8223:1: ( ( ( rule__PhysicChanges__ObjectAssignment_5 ) ) )
            // InternalArdsl.g:8224:1: ( ( rule__PhysicChanges__ObjectAssignment_5 ) )
            {
            // InternalArdsl.g:8224:1: ( ( rule__PhysicChanges__ObjectAssignment_5 ) )
            // InternalArdsl.g:8225:2: ( rule__PhysicChanges__ObjectAssignment_5 )
            {
             before(grammarAccess.getPhysicChangesAccess().getObjectAssignment_5()); 
            // InternalArdsl.g:8226:2: ( rule__PhysicChanges__ObjectAssignment_5 )
            // InternalArdsl.g:8226:3: rule__PhysicChanges__ObjectAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChanges__ObjectAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangesAccess().getObjectAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__5__Impl"


    // $ANTLR start "rule__PhysicChanges__Group__6"
    // InternalArdsl.g:8234:1: rule__PhysicChanges__Group__6 : rule__PhysicChanges__Group__6__Impl rule__PhysicChanges__Group__7 ;
    public final void rule__PhysicChanges__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8238:1: ( rule__PhysicChanges__Group__6__Impl rule__PhysicChanges__Group__7 )
            // InternalArdsl.g:8239:2: rule__PhysicChanges__Group__6__Impl rule__PhysicChanges__Group__7
            {
            pushFollow(FOLLOW_71);
            rule__PhysicChanges__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__6"


    // $ANTLR start "rule__PhysicChanges__Group__6__Impl"
    // InternalArdsl.g:8246:1: rule__PhysicChanges__Group__6__Impl : ( ( rule__PhysicChanges__Group_6__0 )? ) ;
    public final void rule__PhysicChanges__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8250:1: ( ( ( rule__PhysicChanges__Group_6__0 )? ) )
            // InternalArdsl.g:8251:1: ( ( rule__PhysicChanges__Group_6__0 )? )
            {
            // InternalArdsl.g:8251:1: ( ( rule__PhysicChanges__Group_6__0 )? )
            // InternalArdsl.g:8252:2: ( rule__PhysicChanges__Group_6__0 )?
            {
             before(grammarAccess.getPhysicChangesAccess().getGroup_6()); 
            // InternalArdsl.g:8253:2: ( rule__PhysicChanges__Group_6__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==96) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalArdsl.g:8253:3: rule__PhysicChanges__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhysicChanges__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhysicChangesAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__6__Impl"


    // $ANTLR start "rule__PhysicChanges__Group__7"
    // InternalArdsl.g:8261:1: rule__PhysicChanges__Group__7 : rule__PhysicChanges__Group__7__Impl rule__PhysicChanges__Group__8 ;
    public final void rule__PhysicChanges__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8265:1: ( rule__PhysicChanges__Group__7__Impl rule__PhysicChanges__Group__8 )
            // InternalArdsl.g:8266:2: rule__PhysicChanges__Group__7__Impl rule__PhysicChanges__Group__8
            {
            pushFollow(FOLLOW_71);
            rule__PhysicChanges__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__7"


    // $ANTLR start "rule__PhysicChanges__Group__7__Impl"
    // InternalArdsl.g:8273:1: rule__PhysicChanges__Group__7__Impl : ( ( rule__PhysicChanges__Group_7__0 )? ) ;
    public final void rule__PhysicChanges__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8277:1: ( ( ( rule__PhysicChanges__Group_7__0 )? ) )
            // InternalArdsl.g:8278:1: ( ( rule__PhysicChanges__Group_7__0 )? )
            {
            // InternalArdsl.g:8278:1: ( ( rule__PhysicChanges__Group_7__0 )? )
            // InternalArdsl.g:8279:2: ( rule__PhysicChanges__Group_7__0 )?
            {
             before(grammarAccess.getPhysicChangesAccess().getGroup_7()); 
            // InternalArdsl.g:8280:2: ( rule__PhysicChanges__Group_7__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==97) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalArdsl.g:8280:3: rule__PhysicChanges__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhysicChanges__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhysicChangesAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__7__Impl"


    // $ANTLR start "rule__PhysicChanges__Group__8"
    // InternalArdsl.g:8288:1: rule__PhysicChanges__Group__8 : rule__PhysicChanges__Group__8__Impl rule__PhysicChanges__Group__9 ;
    public final void rule__PhysicChanges__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8292:1: ( rule__PhysicChanges__Group__8__Impl rule__PhysicChanges__Group__9 )
            // InternalArdsl.g:8293:2: rule__PhysicChanges__Group__8__Impl rule__PhysicChanges__Group__9
            {
            pushFollow(FOLLOW_71);
            rule__PhysicChanges__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__8"


    // $ANTLR start "rule__PhysicChanges__Group__8__Impl"
    // InternalArdsl.g:8300:1: rule__PhysicChanges__Group__8__Impl : ( ( rule__PhysicChanges__Group_8__0 )? ) ;
    public final void rule__PhysicChanges__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8304:1: ( ( ( rule__PhysicChanges__Group_8__0 )? ) )
            // InternalArdsl.g:8305:1: ( ( rule__PhysicChanges__Group_8__0 )? )
            {
            // InternalArdsl.g:8305:1: ( ( rule__PhysicChanges__Group_8__0 )? )
            // InternalArdsl.g:8306:2: ( rule__PhysicChanges__Group_8__0 )?
            {
             before(grammarAccess.getPhysicChangesAccess().getGroup_8()); 
            // InternalArdsl.g:8307:2: ( rule__PhysicChanges__Group_8__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==98) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalArdsl.g:8307:3: rule__PhysicChanges__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhysicChanges__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhysicChangesAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__8__Impl"


    // $ANTLR start "rule__PhysicChanges__Group__9"
    // InternalArdsl.g:8315:1: rule__PhysicChanges__Group__9 : rule__PhysicChanges__Group__9__Impl rule__PhysicChanges__Group__10 ;
    public final void rule__PhysicChanges__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8319:1: ( rule__PhysicChanges__Group__9__Impl rule__PhysicChanges__Group__10 )
            // InternalArdsl.g:8320:2: rule__PhysicChanges__Group__9__Impl rule__PhysicChanges__Group__10
            {
            pushFollow(FOLLOW_71);
            rule__PhysicChanges__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__9"


    // $ANTLR start "rule__PhysicChanges__Group__9__Impl"
    // InternalArdsl.g:8327:1: rule__PhysicChanges__Group__9__Impl : ( ( rule__PhysicChanges__Group_9__0 )? ) ;
    public final void rule__PhysicChanges__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8331:1: ( ( ( rule__PhysicChanges__Group_9__0 )? ) )
            // InternalArdsl.g:8332:1: ( ( rule__PhysicChanges__Group_9__0 )? )
            {
            // InternalArdsl.g:8332:1: ( ( rule__PhysicChanges__Group_9__0 )? )
            // InternalArdsl.g:8333:2: ( rule__PhysicChanges__Group_9__0 )?
            {
             before(grammarAccess.getPhysicChangesAccess().getGroup_9()); 
            // InternalArdsl.g:8334:2: ( rule__PhysicChanges__Group_9__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==99) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalArdsl.g:8334:3: rule__PhysicChanges__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhysicChanges__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhysicChangesAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__9__Impl"


    // $ANTLR start "rule__PhysicChanges__Group__10"
    // InternalArdsl.g:8342:1: rule__PhysicChanges__Group__10 : rule__PhysicChanges__Group__10__Impl ;
    public final void rule__PhysicChanges__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8346:1: ( rule__PhysicChanges__Group__10__Impl )
            // InternalArdsl.g:8347:2: rule__PhysicChanges__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__10"


    // $ANTLR start "rule__PhysicChanges__Group__10__Impl"
    // InternalArdsl.g:8353:1: rule__PhysicChanges__Group__10__Impl : ( ( rule__PhysicChanges__Group_10__0 )? ) ;
    public final void rule__PhysicChanges__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8357:1: ( ( ( rule__PhysicChanges__Group_10__0 )? ) )
            // InternalArdsl.g:8358:1: ( ( rule__PhysicChanges__Group_10__0 )? )
            {
            // InternalArdsl.g:8358:1: ( ( rule__PhysicChanges__Group_10__0 )? )
            // InternalArdsl.g:8359:2: ( rule__PhysicChanges__Group_10__0 )?
            {
             before(grammarAccess.getPhysicChangesAccess().getGroup_10()); 
            // InternalArdsl.g:8360:2: ( rule__PhysicChanges__Group_10__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==100) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalArdsl.g:8360:3: rule__PhysicChanges__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhysicChanges__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhysicChangesAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group__10__Impl"


    // $ANTLR start "rule__PhysicChanges__Group_6__0"
    // InternalArdsl.g:8369:1: rule__PhysicChanges__Group_6__0 : rule__PhysicChanges__Group_6__0__Impl rule__PhysicChanges__Group_6__1 ;
    public final void rule__PhysicChanges__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8373:1: ( rule__PhysicChanges__Group_6__0__Impl rule__PhysicChanges__Group_6__1 )
            // InternalArdsl.g:8374:2: rule__PhysicChanges__Group_6__0__Impl rule__PhysicChanges__Group_6__1
            {
            pushFollow(FOLLOW_72);
            rule__PhysicChanges__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_6__0"


    // $ANTLR start "rule__PhysicChanges__Group_6__0__Impl"
    // InternalArdsl.g:8381:1: rule__PhysicChanges__Group_6__0__Impl : ( 'where' ) ;
    public final void rule__PhysicChanges__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8385:1: ( ( 'where' ) )
            // InternalArdsl.g:8386:1: ( 'where' )
            {
            // InternalArdsl.g:8386:1: ( 'where' )
            // InternalArdsl.g:8387:2: 'where'
            {
             before(grammarAccess.getPhysicChangesAccess().getWhereKeyword_6_0()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getPhysicChangesAccess().getWhereKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_6__0__Impl"


    // $ANTLR start "rule__PhysicChanges__Group_6__1"
    // InternalArdsl.g:8396:1: rule__PhysicChanges__Group_6__1 : rule__PhysicChanges__Group_6__1__Impl ;
    public final void rule__PhysicChanges__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8400:1: ( rule__PhysicChanges__Group_6__1__Impl )
            // InternalArdsl.g:8401:2: rule__PhysicChanges__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_6__1"


    // $ANTLR start "rule__PhysicChanges__Group_6__1__Impl"
    // InternalArdsl.g:8407:1: rule__PhysicChanges__Group_6__1__Impl : ( ( rule__PhysicChanges__PositionAssignment_6_1 ) ) ;
    public final void rule__PhysicChanges__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8411:1: ( ( ( rule__PhysicChanges__PositionAssignment_6_1 ) ) )
            // InternalArdsl.g:8412:1: ( ( rule__PhysicChanges__PositionAssignment_6_1 ) )
            {
            // InternalArdsl.g:8412:1: ( ( rule__PhysicChanges__PositionAssignment_6_1 ) )
            // InternalArdsl.g:8413:2: ( rule__PhysicChanges__PositionAssignment_6_1 )
            {
             before(grammarAccess.getPhysicChangesAccess().getPositionAssignment_6_1()); 
            // InternalArdsl.g:8414:2: ( rule__PhysicChanges__PositionAssignment_6_1 )
            // InternalArdsl.g:8414:3: rule__PhysicChanges__PositionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChanges__PositionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangesAccess().getPositionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_6__1__Impl"


    // $ANTLR start "rule__PhysicChanges__Group_7__0"
    // InternalArdsl.g:8423:1: rule__PhysicChanges__Group_7__0 : rule__PhysicChanges__Group_7__0__Impl rule__PhysicChanges__Group_7__1 ;
    public final void rule__PhysicChanges__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8427:1: ( rule__PhysicChanges__Group_7__0__Impl rule__PhysicChanges__Group_7__1 )
            // InternalArdsl.g:8428:2: rule__PhysicChanges__Group_7__0__Impl rule__PhysicChanges__Group_7__1
            {
            pushFollow(FOLLOW_35);
            rule__PhysicChanges__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_7__0"


    // $ANTLR start "rule__PhysicChanges__Group_7__0__Impl"
    // InternalArdsl.g:8435:1: rule__PhysicChanges__Group_7__0__Impl : ( 'scale' ) ;
    public final void rule__PhysicChanges__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8439:1: ( ( 'scale' ) )
            // InternalArdsl.g:8440:1: ( 'scale' )
            {
            // InternalArdsl.g:8440:1: ( 'scale' )
            // InternalArdsl.g:8441:2: 'scale'
            {
             before(grammarAccess.getPhysicChangesAccess().getScaleKeyword_7_0()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getPhysicChangesAccess().getScaleKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_7__0__Impl"


    // $ANTLR start "rule__PhysicChanges__Group_7__1"
    // InternalArdsl.g:8450:1: rule__PhysicChanges__Group_7__1 : rule__PhysicChanges__Group_7__1__Impl ;
    public final void rule__PhysicChanges__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8454:1: ( rule__PhysicChanges__Group_7__1__Impl )
            // InternalArdsl.g:8455:2: rule__PhysicChanges__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_7__1"


    // $ANTLR start "rule__PhysicChanges__Group_7__1__Impl"
    // InternalArdsl.g:8461:1: rule__PhysicChanges__Group_7__1__Impl : ( ( rule__PhysicChanges__ScaleAssignment_7_1 ) ) ;
    public final void rule__PhysicChanges__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8465:1: ( ( ( rule__PhysicChanges__ScaleAssignment_7_1 ) ) )
            // InternalArdsl.g:8466:1: ( ( rule__PhysicChanges__ScaleAssignment_7_1 ) )
            {
            // InternalArdsl.g:8466:1: ( ( rule__PhysicChanges__ScaleAssignment_7_1 ) )
            // InternalArdsl.g:8467:2: ( rule__PhysicChanges__ScaleAssignment_7_1 )
            {
             before(grammarAccess.getPhysicChangesAccess().getScaleAssignment_7_1()); 
            // InternalArdsl.g:8468:2: ( rule__PhysicChanges__ScaleAssignment_7_1 )
            // InternalArdsl.g:8468:3: rule__PhysicChanges__ScaleAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChanges__ScaleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangesAccess().getScaleAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_7__1__Impl"


    // $ANTLR start "rule__PhysicChanges__Group_8__0"
    // InternalArdsl.g:8477:1: rule__PhysicChanges__Group_8__0 : rule__PhysicChanges__Group_8__0__Impl rule__PhysicChanges__Group_8__1 ;
    public final void rule__PhysicChanges__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8481:1: ( rule__PhysicChanges__Group_8__0__Impl rule__PhysicChanges__Group_8__1 )
            // InternalArdsl.g:8482:2: rule__PhysicChanges__Group_8__0__Impl rule__PhysicChanges__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__PhysicChanges__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_8__0"


    // $ANTLR start "rule__PhysicChanges__Group_8__0__Impl"
    // InternalArdsl.g:8489:1: rule__PhysicChanges__Group_8__0__Impl : ( 'stat' ) ;
    public final void rule__PhysicChanges__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8493:1: ( ( 'stat' ) )
            // InternalArdsl.g:8494:1: ( 'stat' )
            {
            // InternalArdsl.g:8494:1: ( 'stat' )
            // InternalArdsl.g:8495:2: 'stat'
            {
             before(grammarAccess.getPhysicChangesAccess().getStatKeyword_8_0()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getPhysicChangesAccess().getStatKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_8__0__Impl"


    // $ANTLR start "rule__PhysicChanges__Group_8__1"
    // InternalArdsl.g:8504:1: rule__PhysicChanges__Group_8__1 : rule__PhysicChanges__Group_8__1__Impl ;
    public final void rule__PhysicChanges__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8508:1: ( rule__PhysicChanges__Group_8__1__Impl )
            // InternalArdsl.g:8509:2: rule__PhysicChanges__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_8__1"


    // $ANTLR start "rule__PhysicChanges__Group_8__1__Impl"
    // InternalArdsl.g:8515:1: rule__PhysicChanges__Group_8__1__Impl : ( ( rule__PhysicChanges__AttributeAssignment_8_1 ) ) ;
    public final void rule__PhysicChanges__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8519:1: ( ( ( rule__PhysicChanges__AttributeAssignment_8_1 ) ) )
            // InternalArdsl.g:8520:1: ( ( rule__PhysicChanges__AttributeAssignment_8_1 ) )
            {
            // InternalArdsl.g:8520:1: ( ( rule__PhysicChanges__AttributeAssignment_8_1 ) )
            // InternalArdsl.g:8521:2: ( rule__PhysicChanges__AttributeAssignment_8_1 )
            {
             before(grammarAccess.getPhysicChangesAccess().getAttributeAssignment_8_1()); 
            // InternalArdsl.g:8522:2: ( rule__PhysicChanges__AttributeAssignment_8_1 )
            // InternalArdsl.g:8522:3: rule__PhysicChanges__AttributeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChanges__AttributeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangesAccess().getAttributeAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_8__1__Impl"


    // $ANTLR start "rule__PhysicChanges__Group_9__0"
    // InternalArdsl.g:8531:1: rule__PhysicChanges__Group_9__0 : rule__PhysicChanges__Group_9__0__Impl rule__PhysicChanges__Group_9__1 ;
    public final void rule__PhysicChanges__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8535:1: ( rule__PhysicChanges__Group_9__0__Impl rule__PhysicChanges__Group_9__1 )
            // InternalArdsl.g:8536:2: rule__PhysicChanges__Group_9__0__Impl rule__PhysicChanges__Group_9__1
            {
            pushFollow(FOLLOW_15);
            rule__PhysicChanges__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_9__0"


    // $ANTLR start "rule__PhysicChanges__Group_9__0__Impl"
    // InternalArdsl.g:8543:1: rule__PhysicChanges__Group_9__0__Impl : ( 'changeStat' ) ;
    public final void rule__PhysicChanges__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8547:1: ( ( 'changeStat' ) )
            // InternalArdsl.g:8548:1: ( 'changeStat' )
            {
            // InternalArdsl.g:8548:1: ( 'changeStat' )
            // InternalArdsl.g:8549:2: 'changeStat'
            {
             before(grammarAccess.getPhysicChangesAccess().getChangeStatKeyword_9_0()); 
            match(input,99,FOLLOW_2); 
             after(grammarAccess.getPhysicChangesAccess().getChangeStatKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_9__0__Impl"


    // $ANTLR start "rule__PhysicChanges__Group_9__1"
    // InternalArdsl.g:8558:1: rule__PhysicChanges__Group_9__1 : rule__PhysicChanges__Group_9__1__Impl ;
    public final void rule__PhysicChanges__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8562:1: ( rule__PhysicChanges__Group_9__1__Impl )
            // InternalArdsl.g:8563:2: rule__PhysicChanges__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_9__1"


    // $ANTLR start "rule__PhysicChanges__Group_9__1__Impl"
    // InternalArdsl.g:8569:1: rule__PhysicChanges__Group_9__1__Impl : ( ( rule__PhysicChanges__ChangeValueAssignment_9_1 ) ) ;
    public final void rule__PhysicChanges__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8573:1: ( ( ( rule__PhysicChanges__ChangeValueAssignment_9_1 ) ) )
            // InternalArdsl.g:8574:1: ( ( rule__PhysicChanges__ChangeValueAssignment_9_1 ) )
            {
            // InternalArdsl.g:8574:1: ( ( rule__PhysicChanges__ChangeValueAssignment_9_1 ) )
            // InternalArdsl.g:8575:2: ( rule__PhysicChanges__ChangeValueAssignment_9_1 )
            {
             before(grammarAccess.getPhysicChangesAccess().getChangeValueAssignment_9_1()); 
            // InternalArdsl.g:8576:2: ( rule__PhysicChanges__ChangeValueAssignment_9_1 )
            // InternalArdsl.g:8576:3: rule__PhysicChanges__ChangeValueAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChanges__ChangeValueAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangesAccess().getChangeValueAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_9__1__Impl"


    // $ANTLR start "rule__PhysicChanges__Group_10__0"
    // InternalArdsl.g:8585:1: rule__PhysicChanges__Group_10__0 : rule__PhysicChanges__Group_10__0__Impl rule__PhysicChanges__Group_10__1 ;
    public final void rule__PhysicChanges__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8589:1: ( rule__PhysicChanges__Group_10__0__Impl rule__PhysicChanges__Group_10__1 )
            // InternalArdsl.g:8590:2: rule__PhysicChanges__Group_10__0__Impl rule__PhysicChanges__Group_10__1
            {
            pushFollow(FOLLOW_3);
            rule__PhysicChanges__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_10__0"


    // $ANTLR start "rule__PhysicChanges__Group_10__0__Impl"
    // InternalArdsl.g:8597:1: rule__PhysicChanges__Group_10__0__Impl : ( 'force' ) ;
    public final void rule__PhysicChanges__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8601:1: ( ( 'force' ) )
            // InternalArdsl.g:8602:1: ( 'force' )
            {
            // InternalArdsl.g:8602:1: ( 'force' )
            // InternalArdsl.g:8603:2: 'force'
            {
             before(grammarAccess.getPhysicChangesAccess().getForceKeyword_10_0()); 
            match(input,100,FOLLOW_2); 
             after(grammarAccess.getPhysicChangesAccess().getForceKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_10__0__Impl"


    // $ANTLR start "rule__PhysicChanges__Group_10__1"
    // InternalArdsl.g:8612:1: rule__PhysicChanges__Group_10__1 : rule__PhysicChanges__Group_10__1__Impl ;
    public final void rule__PhysicChanges__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8616:1: ( rule__PhysicChanges__Group_10__1__Impl )
            // InternalArdsl.g:8617:2: rule__PhysicChanges__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChanges__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_10__1"


    // $ANTLR start "rule__PhysicChanges__Group_10__1__Impl"
    // InternalArdsl.g:8623:1: rule__PhysicChanges__Group_10__1__Impl : ( ( rule__PhysicChanges__ForceAssignment_10_1 ) ) ;
    public final void rule__PhysicChanges__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8627:1: ( ( ( rule__PhysicChanges__ForceAssignment_10_1 ) ) )
            // InternalArdsl.g:8628:1: ( ( rule__PhysicChanges__ForceAssignment_10_1 ) )
            {
            // InternalArdsl.g:8628:1: ( ( rule__PhysicChanges__ForceAssignment_10_1 ) )
            // InternalArdsl.g:8629:2: ( rule__PhysicChanges__ForceAssignment_10_1 )
            {
             before(grammarAccess.getPhysicChangesAccess().getForceAssignment_10_1()); 
            // InternalArdsl.g:8630:2: ( rule__PhysicChanges__ForceAssignment_10_1 )
            // InternalArdsl.g:8630:3: rule__PhysicChanges__ForceAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__PhysicChanges__ForceAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getPhysicChangesAccess().getForceAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__Group_10__1__Impl"


    // $ANTLR start "rule__GamePad__Group__0"
    // InternalArdsl.g:8639:1: rule__GamePad__Group__0 : rule__GamePad__Group__0__Impl rule__GamePad__Group__1 ;
    public final void rule__GamePad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8643:1: ( rule__GamePad__Group__0__Impl rule__GamePad__Group__1 )
            // InternalArdsl.g:8644:2: rule__GamePad__Group__0__Impl rule__GamePad__Group__1
            {
            pushFollow(FOLLOW_67);
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
    // InternalArdsl.g:8651:1: rule__GamePad__Group__0__Impl : ( ( rule__GamePad__NameAssignment_0 ) ) ;
    public final void rule__GamePad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8655:1: ( ( ( rule__GamePad__NameAssignment_0 ) ) )
            // InternalArdsl.g:8656:1: ( ( rule__GamePad__NameAssignment_0 ) )
            {
            // InternalArdsl.g:8656:1: ( ( rule__GamePad__NameAssignment_0 ) )
            // InternalArdsl.g:8657:2: ( rule__GamePad__NameAssignment_0 )
            {
             before(grammarAccess.getGamePadAccess().getNameAssignment_0()); 
            // InternalArdsl.g:8658:2: ( rule__GamePad__NameAssignment_0 )
            // InternalArdsl.g:8658:3: rule__GamePad__NameAssignment_0
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
    // InternalArdsl.g:8666:1: rule__GamePad__Group__1 : rule__GamePad__Group__1__Impl rule__GamePad__Group__2 ;
    public final void rule__GamePad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8670:1: ( rule__GamePad__Group__1__Impl rule__GamePad__Group__2 )
            // InternalArdsl.g:8671:2: rule__GamePad__Group__1__Impl rule__GamePad__Group__2
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
    // InternalArdsl.g:8678:1: rule__GamePad__Group__1__Impl : ( '->' ) ;
    public final void rule__GamePad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8682:1: ( ( '->' ) )
            // InternalArdsl.g:8683:1: ( '->' )
            {
            // InternalArdsl.g:8683:1: ( '->' )
            // InternalArdsl.g:8684:2: '->'
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
    // InternalArdsl.g:8693:1: rule__GamePad__Group__2 : rule__GamePad__Group__2__Impl ;
    public final void rule__GamePad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8697:1: ( rule__GamePad__Group__2__Impl )
            // InternalArdsl.g:8698:2: rule__GamePad__Group__2__Impl
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
    // InternalArdsl.g:8704:1: rule__GamePad__Group__2__Impl : ( ( rule__GamePad__TriggerAssignment_2 ) ) ;
    public final void rule__GamePad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8708:1: ( ( ( rule__GamePad__TriggerAssignment_2 ) ) )
            // InternalArdsl.g:8709:1: ( ( rule__GamePad__TriggerAssignment_2 ) )
            {
            // InternalArdsl.g:8709:1: ( ( rule__GamePad__TriggerAssignment_2 ) )
            // InternalArdsl.g:8710:2: ( rule__GamePad__TriggerAssignment_2 )
            {
             before(grammarAccess.getGamePadAccess().getTriggerAssignment_2()); 
            // InternalArdsl.g:8711:2: ( rule__GamePad__TriggerAssignment_2 )
            // InternalArdsl.g:8711:3: rule__GamePad__TriggerAssignment_2
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


    // $ANTLR start "rule__ObjInit__Group__0"
    // InternalArdsl.g:8720:1: rule__ObjInit__Group__0 : rule__ObjInit__Group__0__Impl rule__ObjInit__Group__1 ;
    public final void rule__ObjInit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8724:1: ( rule__ObjInit__Group__0__Impl rule__ObjInit__Group__1 )
            // InternalArdsl.g:8725:2: rule__ObjInit__Group__0__Impl rule__ObjInit__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalArdsl.g:8732:1: rule__ObjInit__Group__0__Impl : ( ( rule__ObjInit__NameAssignment_0 ) ) ;
    public final void rule__ObjInit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8736:1: ( ( ( rule__ObjInit__NameAssignment_0 ) ) )
            // InternalArdsl.g:8737:1: ( ( rule__ObjInit__NameAssignment_0 ) )
            {
            // InternalArdsl.g:8737:1: ( ( rule__ObjInit__NameAssignment_0 ) )
            // InternalArdsl.g:8738:2: ( rule__ObjInit__NameAssignment_0 )
            {
             before(grammarAccess.getObjInitAccess().getNameAssignment_0()); 
            // InternalArdsl.g:8739:2: ( rule__ObjInit__NameAssignment_0 )
            // InternalArdsl.g:8739:3: rule__ObjInit__NameAssignment_0
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
    // InternalArdsl.g:8747:1: rule__ObjInit__Group__1 : rule__ObjInit__Group__1__Impl rule__ObjInit__Group__2 ;
    public final void rule__ObjInit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8751:1: ( rule__ObjInit__Group__1__Impl rule__ObjInit__Group__2 )
            // InternalArdsl.g:8752:2: rule__ObjInit__Group__1__Impl rule__ObjInit__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalArdsl.g:8759:1: rule__ObjInit__Group__1__Impl : ( ( rule__ObjInit__ClassAssignment_1 ) ) ;
    public final void rule__ObjInit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8763:1: ( ( ( rule__ObjInit__ClassAssignment_1 ) ) )
            // InternalArdsl.g:8764:1: ( ( rule__ObjInit__ClassAssignment_1 ) )
            {
            // InternalArdsl.g:8764:1: ( ( rule__ObjInit__ClassAssignment_1 ) )
            // InternalArdsl.g:8765:2: ( rule__ObjInit__ClassAssignment_1 )
            {
             before(grammarAccess.getObjInitAccess().getClassAssignment_1()); 
            // InternalArdsl.g:8766:2: ( rule__ObjInit__ClassAssignment_1 )
            // InternalArdsl.g:8766:3: rule__ObjInit__ClassAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__ClassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjInitAccess().getClassAssignment_1()); 

            }


            }

        }
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
    // InternalArdsl.g:8774:1: rule__ObjInit__Group__2 : rule__ObjInit__Group__2__Impl rule__ObjInit__Group__3 ;
    public final void rule__ObjInit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8778:1: ( rule__ObjInit__Group__2__Impl rule__ObjInit__Group__3 )
            // InternalArdsl.g:8779:2: rule__ObjInit__Group__2__Impl rule__ObjInit__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalArdsl.g:8786:1: rule__ObjInit__Group__2__Impl : ( '[' ) ;
    public final void rule__ObjInit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8790:1: ( ( '[' ) )
            // InternalArdsl.g:8791:1: ( '[' )
            {
            // InternalArdsl.g:8791:1: ( '[' )
            // InternalArdsl.g:8792:2: '['
            {
             before(grammarAccess.getObjInitAccess().getLeftSquareBracketKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
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
    // InternalArdsl.g:8801:1: rule__ObjInit__Group__3 : rule__ObjInit__Group__3__Impl rule__ObjInit__Group__4 ;
    public final void rule__ObjInit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8805:1: ( rule__ObjInit__Group__3__Impl rule__ObjInit__Group__4 )
            // InternalArdsl.g:8806:2: rule__ObjInit__Group__3__Impl rule__ObjInit__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalArdsl.g:8813:1: rule__ObjInit__Group__3__Impl : ( ( rule__ObjInit__PosXAssignment_3 ) ) ;
    public final void rule__ObjInit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8817:1: ( ( ( rule__ObjInit__PosXAssignment_3 ) ) )
            // InternalArdsl.g:8818:1: ( ( rule__ObjInit__PosXAssignment_3 ) )
            {
            // InternalArdsl.g:8818:1: ( ( rule__ObjInit__PosXAssignment_3 ) )
            // InternalArdsl.g:8819:2: ( rule__ObjInit__PosXAssignment_3 )
            {
             before(grammarAccess.getObjInitAccess().getPosXAssignment_3()); 
            // InternalArdsl.g:8820:2: ( rule__ObjInit__PosXAssignment_3 )
            // InternalArdsl.g:8820:3: rule__ObjInit__PosXAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__PosXAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getObjInitAccess().getPosXAssignment_3()); 

            }


            }

        }
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
    // InternalArdsl.g:8828:1: rule__ObjInit__Group__4 : rule__ObjInit__Group__4__Impl rule__ObjInit__Group__5 ;
    public final void rule__ObjInit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8832:1: ( rule__ObjInit__Group__4__Impl rule__ObjInit__Group__5 )
            // InternalArdsl.g:8833:2: rule__ObjInit__Group__4__Impl rule__ObjInit__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalArdsl.g:8840:1: rule__ObjInit__Group__4__Impl : ( ',' ) ;
    public final void rule__ObjInit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8844:1: ( ( ',' ) )
            // InternalArdsl.g:8845:1: ( ',' )
            {
            // InternalArdsl.g:8845:1: ( ',' )
            // InternalArdsl.g:8846:2: ','
            {
             before(grammarAccess.getObjInitAccess().getCommaKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getCommaKeyword_4()); 

            }


            }

        }
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
    // InternalArdsl.g:8855:1: rule__ObjInit__Group__5 : rule__ObjInit__Group__5__Impl rule__ObjInit__Group__6 ;
    public final void rule__ObjInit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8859:1: ( rule__ObjInit__Group__5__Impl rule__ObjInit__Group__6 )
            // InternalArdsl.g:8860:2: rule__ObjInit__Group__5__Impl rule__ObjInit__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalArdsl.g:8867:1: rule__ObjInit__Group__5__Impl : ( ( rule__ObjInit__PosYAssignment_5 ) ) ;
    public final void rule__ObjInit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8871:1: ( ( ( rule__ObjInit__PosYAssignment_5 ) ) )
            // InternalArdsl.g:8872:1: ( ( rule__ObjInit__PosYAssignment_5 ) )
            {
            // InternalArdsl.g:8872:1: ( ( rule__ObjInit__PosYAssignment_5 ) )
            // InternalArdsl.g:8873:2: ( rule__ObjInit__PosYAssignment_5 )
            {
             before(grammarAccess.getObjInitAccess().getPosYAssignment_5()); 
            // InternalArdsl.g:8874:2: ( rule__ObjInit__PosYAssignment_5 )
            // InternalArdsl.g:8874:3: rule__ObjInit__PosYAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__PosYAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getObjInitAccess().getPosYAssignment_5()); 

            }


            }

        }
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
    // InternalArdsl.g:8882:1: rule__ObjInit__Group__6 : rule__ObjInit__Group__6__Impl rule__ObjInit__Group__7 ;
    public final void rule__ObjInit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8886:1: ( rule__ObjInit__Group__6__Impl rule__ObjInit__Group__7 )
            // InternalArdsl.g:8887:2: rule__ObjInit__Group__6__Impl rule__ObjInit__Group__7
            {
            pushFollow(FOLLOW_35);
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
    // InternalArdsl.g:8894:1: rule__ObjInit__Group__6__Impl : ( ',' ) ;
    public final void rule__ObjInit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8898:1: ( ( ',' ) )
            // InternalArdsl.g:8899:1: ( ',' )
            {
            // InternalArdsl.g:8899:1: ( ',' )
            // InternalArdsl.g:8900:2: ','
            {
             before(grammarAccess.getObjInitAccess().getCommaKeyword_6()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getCommaKeyword_6()); 

            }


            }

        }
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
    // InternalArdsl.g:8909:1: rule__ObjInit__Group__7 : rule__ObjInit__Group__7__Impl rule__ObjInit__Group__8 ;
    public final void rule__ObjInit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8913:1: ( rule__ObjInit__Group__7__Impl rule__ObjInit__Group__8 )
            // InternalArdsl.g:8914:2: rule__ObjInit__Group__7__Impl rule__ObjInit__Group__8
            {
            pushFollow(FOLLOW_21);
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
    // InternalArdsl.g:8921:1: rule__ObjInit__Group__7__Impl : ( ( rule__ObjInit__PosZAssignment_7 ) ) ;
    public final void rule__ObjInit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8925:1: ( ( ( rule__ObjInit__PosZAssignment_7 ) ) )
            // InternalArdsl.g:8926:1: ( ( rule__ObjInit__PosZAssignment_7 ) )
            {
            // InternalArdsl.g:8926:1: ( ( rule__ObjInit__PosZAssignment_7 ) )
            // InternalArdsl.g:8927:2: ( rule__ObjInit__PosZAssignment_7 )
            {
             before(grammarAccess.getObjInitAccess().getPosZAssignment_7()); 
            // InternalArdsl.g:8928:2: ( rule__ObjInit__PosZAssignment_7 )
            // InternalArdsl.g:8928:3: rule__ObjInit__PosZAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__PosZAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getObjInitAccess().getPosZAssignment_7()); 

            }


            }

        }
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
    // InternalArdsl.g:8936:1: rule__ObjInit__Group__8 : rule__ObjInit__Group__8__Impl rule__ObjInit__Group__9 ;
    public final void rule__ObjInit__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8940:1: ( rule__ObjInit__Group__8__Impl rule__ObjInit__Group__9 )
            // InternalArdsl.g:8941:2: rule__ObjInit__Group__8__Impl rule__ObjInit__Group__9
            {
            pushFollow(FOLLOW_73);
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
    // InternalArdsl.g:8948:1: rule__ObjInit__Group__8__Impl : ( ']' ) ;
    public final void rule__ObjInit__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8952:1: ( ( ']' ) )
            // InternalArdsl.g:8953:1: ( ']' )
            {
            // InternalArdsl.g:8953:1: ( ']' )
            // InternalArdsl.g:8954:2: ']'
            {
             before(grammarAccess.getObjInitAccess().getRightSquareBracketKeyword_8()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getRightSquareBracketKeyword_8()); 

            }


            }

        }
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
    // InternalArdsl.g:8963:1: rule__ObjInit__Group__9 : rule__ObjInit__Group__9__Impl ;
    public final void rule__ObjInit__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8967:1: ( rule__ObjInit__Group__9__Impl )
            // InternalArdsl.g:8968:2: rule__ObjInit__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // InternalArdsl.g:8974:1: rule__ObjInit__Group__9__Impl : ( ( rule__ObjInit__Group_9__0 )? ) ;
    public final void rule__ObjInit__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8978:1: ( ( ( rule__ObjInit__Group_9__0 )? ) )
            // InternalArdsl.g:8979:1: ( ( rule__ObjInit__Group_9__0 )? )
            {
            // InternalArdsl.g:8979:1: ( ( rule__ObjInit__Group_9__0 )? )
            // InternalArdsl.g:8980:2: ( rule__ObjInit__Group_9__0 )?
            {
             before(grammarAccess.getObjInitAccess().getGroup_9()); 
            // InternalArdsl.g:8981:2: ( rule__ObjInit__Group_9__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==101) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalArdsl.g:8981:3: rule__ObjInit__Group_9__0
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


    // $ANTLR start "rule__ObjInit__Group_9__0"
    // InternalArdsl.g:8990:1: rule__ObjInit__Group_9__0 : rule__ObjInit__Group_9__0__Impl rule__ObjInit__Group_9__1 ;
    public final void rule__ObjInit__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:8994:1: ( rule__ObjInit__Group_9__0__Impl rule__ObjInit__Group_9__1 )
            // InternalArdsl.g:8995:2: rule__ObjInit__Group_9__0__Impl rule__ObjInit__Group_9__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalArdsl.g:9002:1: rule__ObjInit__Group_9__0__Impl : ( 'rules' ) ;
    public final void rule__ObjInit__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9006:1: ( ( 'rules' ) )
            // InternalArdsl.g:9007:1: ( 'rules' )
            {
            // InternalArdsl.g:9007:1: ( 'rules' )
            // InternalArdsl.g:9008:2: 'rules'
            {
             before(grammarAccess.getObjInitAccess().getRulesKeyword_9_0()); 
            match(input,101,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getRulesKeyword_9_0()); 

            }


            }

        }
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
    // InternalArdsl.g:9017:1: rule__ObjInit__Group_9__1 : rule__ObjInit__Group_9__1__Impl rule__ObjInit__Group_9__2 ;
    public final void rule__ObjInit__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9021:1: ( rule__ObjInit__Group_9__1__Impl rule__ObjInit__Group_9__2 )
            // InternalArdsl.g:9022:2: rule__ObjInit__Group_9__1__Impl rule__ObjInit__Group_9__2
            {
            pushFollow(FOLLOW_65);
            rule__ObjInit__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_9__2();

            state._fsp--;


            }

        }
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
    // InternalArdsl.g:9029:1: rule__ObjInit__Group_9__1__Impl : ( '{' ) ;
    public final void rule__ObjInit__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9033:1: ( ( '{' ) )
            // InternalArdsl.g:9034:1: ( '{' )
            {
            // InternalArdsl.g:9034:1: ( '{' )
            // InternalArdsl.g:9035:2: '{'
            {
             before(grammarAccess.getObjInitAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ObjInit__Group_9__2"
    // InternalArdsl.g:9044:1: rule__ObjInit__Group_9__2 : rule__ObjInit__Group_9__2__Impl rule__ObjInit__Group_9__3 ;
    public final void rule__ObjInit__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9048:1: ( rule__ObjInit__Group_9__2__Impl rule__ObjInit__Group_9__3 )
            // InternalArdsl.g:9049:2: rule__ObjInit__Group_9__2__Impl rule__ObjInit__Group_9__3
            {
            pushFollow(FOLLOW_6);
            rule__ObjInit__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjInit__Group_9__2"


    // $ANTLR start "rule__ObjInit__Group_9__2__Impl"
    // InternalArdsl.g:9056:1: rule__ObjInit__Group_9__2__Impl : ( ( rule__ObjInit__RulesAssignment_9_2 ) ) ;
    public final void rule__ObjInit__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9060:1: ( ( ( rule__ObjInit__RulesAssignment_9_2 ) ) )
            // InternalArdsl.g:9061:1: ( ( rule__ObjInit__RulesAssignment_9_2 ) )
            {
            // InternalArdsl.g:9061:1: ( ( rule__ObjInit__RulesAssignment_9_2 ) )
            // InternalArdsl.g:9062:2: ( rule__ObjInit__RulesAssignment_9_2 )
            {
             before(grammarAccess.getObjInitAccess().getRulesAssignment_9_2()); 
            // InternalArdsl.g:9063:2: ( rule__ObjInit__RulesAssignment_9_2 )
            // InternalArdsl.g:9063:3: rule__ObjInit__RulesAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__RulesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getObjInitAccess().getRulesAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjInit__Group_9__2__Impl"


    // $ANTLR start "rule__ObjInit__Group_9__3"
    // InternalArdsl.g:9071:1: rule__ObjInit__Group_9__3 : rule__ObjInit__Group_9__3__Impl rule__ObjInit__Group_9__4 ;
    public final void rule__ObjInit__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9075:1: ( rule__ObjInit__Group_9__3__Impl rule__ObjInit__Group_9__4 )
            // InternalArdsl.g:9076:2: rule__ObjInit__Group_9__3__Impl rule__ObjInit__Group_9__4
            {
            pushFollow(FOLLOW_6);
            rule__ObjInit__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjInit__Group_9__3"


    // $ANTLR start "rule__ObjInit__Group_9__3__Impl"
    // InternalArdsl.g:9083:1: rule__ObjInit__Group_9__3__Impl : ( ( rule__ObjInit__Group_9_3__0 )* ) ;
    public final void rule__ObjInit__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9087:1: ( ( ( rule__ObjInit__Group_9_3__0 )* ) )
            // InternalArdsl.g:9088:1: ( ( rule__ObjInit__Group_9_3__0 )* )
            {
            // InternalArdsl.g:9088:1: ( ( rule__ObjInit__Group_9_3__0 )* )
            // InternalArdsl.g:9089:2: ( rule__ObjInit__Group_9_3__0 )*
            {
             before(grammarAccess.getObjInitAccess().getGroup_9_3()); 
            // InternalArdsl.g:9090:2: ( rule__ObjInit__Group_9_3__0 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==40) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalArdsl.g:9090:3: rule__ObjInit__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ObjInit__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getObjInitAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjInit__Group_9__3__Impl"


    // $ANTLR start "rule__ObjInit__Group_9__4"
    // InternalArdsl.g:9098:1: rule__ObjInit__Group_9__4 : rule__ObjInit__Group_9__4__Impl ;
    public final void rule__ObjInit__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9102:1: ( rule__ObjInit__Group_9__4__Impl )
            // InternalArdsl.g:9103:2: rule__ObjInit__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjInit__Group_9__4"


    // $ANTLR start "rule__ObjInit__Group_9__4__Impl"
    // InternalArdsl.g:9109:1: rule__ObjInit__Group_9__4__Impl : ( '}' ) ;
    public final void rule__ObjInit__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9113:1: ( ( '}' ) )
            // InternalArdsl.g:9114:1: ( '}' )
            {
            // InternalArdsl.g:9114:1: ( '}' )
            // InternalArdsl.g:9115:2: '}'
            {
             before(grammarAccess.getObjInitAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjInit__Group_9__4__Impl"


    // $ANTLR start "rule__ObjInit__Group_9_3__0"
    // InternalArdsl.g:9125:1: rule__ObjInit__Group_9_3__0 : rule__ObjInit__Group_9_3__0__Impl rule__ObjInit__Group_9_3__1 ;
    public final void rule__ObjInit__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9129:1: ( rule__ObjInit__Group_9_3__0__Impl rule__ObjInit__Group_9_3__1 )
            // InternalArdsl.g:9130:2: rule__ObjInit__Group_9_3__0__Impl rule__ObjInit__Group_9_3__1
            {
            pushFollow(FOLLOW_65);
            rule__ObjInit__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjInit__Group_9_3__0"


    // $ANTLR start "rule__ObjInit__Group_9_3__0__Impl"
    // InternalArdsl.g:9137:1: rule__ObjInit__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__ObjInit__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9141:1: ( ( ',' ) )
            // InternalArdsl.g:9142:1: ( ',' )
            {
            // InternalArdsl.g:9142:1: ( ',' )
            // InternalArdsl.g:9143:2: ','
            {
             before(grammarAccess.getObjInitAccess().getCommaKeyword_9_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getObjInitAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjInit__Group_9_3__0__Impl"


    // $ANTLR start "rule__ObjInit__Group_9_3__1"
    // InternalArdsl.g:9152:1: rule__ObjInit__Group_9_3__1 : rule__ObjInit__Group_9_3__1__Impl ;
    public final void rule__ObjInit__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9156:1: ( rule__ObjInit__Group_9_3__1__Impl )
            // InternalArdsl.g:9157:2: rule__ObjInit__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjInit__Group_9_3__1"


    // $ANTLR start "rule__ObjInit__Group_9_3__1__Impl"
    // InternalArdsl.g:9163:1: rule__ObjInit__Group_9_3__1__Impl : ( ( rule__ObjInit__RulesAssignment_9_3_1 ) ) ;
    public final void rule__ObjInit__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9167:1: ( ( ( rule__ObjInit__RulesAssignment_9_3_1 ) ) )
            // InternalArdsl.g:9168:1: ( ( rule__ObjInit__RulesAssignment_9_3_1 ) )
            {
            // InternalArdsl.g:9168:1: ( ( rule__ObjInit__RulesAssignment_9_3_1 ) )
            // InternalArdsl.g:9169:2: ( rule__ObjInit__RulesAssignment_9_3_1 )
            {
             before(grammarAccess.getObjInitAccess().getRulesAssignment_9_3_1()); 
            // InternalArdsl.g:9170:2: ( rule__ObjInit__RulesAssignment_9_3_1 )
            // InternalArdsl.g:9170:3: rule__ObjInit__RulesAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjInit__RulesAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getObjInitAccess().getRulesAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjInit__Group_9_3__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalArdsl.g:9179:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9183:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalArdsl.g:9184:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalArdsl.g:9191:1: rule__Rule__Group__0__Impl : ( 'do' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9195:1: ( ( 'do' ) )
            // InternalArdsl.g:9196:1: ( 'do' )
            {
            // InternalArdsl.g:9196:1: ( 'do' )
            // InternalArdsl.g:9197:2: 'do'
            {
             before(grammarAccess.getRuleAccess().getDoKeyword_0()); 
            match(input,93,FOLLOW_2); 
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
    // InternalArdsl.g:9206:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9210:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalArdsl.g:9211:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_74);
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
    // InternalArdsl.g:9218:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ActionAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9222:1: ( ( ( rule__Rule__ActionAssignment_1 ) ) )
            // InternalArdsl.g:9223:1: ( ( rule__Rule__ActionAssignment_1 ) )
            {
            // InternalArdsl.g:9223:1: ( ( rule__Rule__ActionAssignment_1 ) )
            // InternalArdsl.g:9224:2: ( rule__Rule__ActionAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_1()); 
            // InternalArdsl.g:9225:2: ( rule__Rule__ActionAssignment_1 )
            // InternalArdsl.g:9225:3: rule__Rule__ActionAssignment_1
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
    // InternalArdsl.g:9233:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9237:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalArdsl.g:9238:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_75);
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
    // InternalArdsl.g:9245:1: rule__Rule__Group__2__Impl : ( 'if(' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9249:1: ( ( 'if(' ) )
            // InternalArdsl.g:9250:1: ( 'if(' )
            {
            // InternalArdsl.g:9250:1: ( 'if(' )
            // InternalArdsl.g:9251:2: 'if('
            {
             before(grammarAccess.getRuleAccess().getIfKeyword_2()); 
            match(input,102,FOLLOW_2); 
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
    // InternalArdsl.g:9260:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9264:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalArdsl.g:9265:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_76);
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
    // InternalArdsl.g:9272:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__ConditionAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9276:1: ( ( ( rule__Rule__ConditionAssignment_3 ) ) )
            // InternalArdsl.g:9277:1: ( ( rule__Rule__ConditionAssignment_3 ) )
            {
            // InternalArdsl.g:9277:1: ( ( rule__Rule__ConditionAssignment_3 ) )
            // InternalArdsl.g:9278:2: ( rule__Rule__ConditionAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_3()); 
            // InternalArdsl.g:9279:2: ( rule__Rule__ConditionAssignment_3 )
            // InternalArdsl.g:9279:3: rule__Rule__ConditionAssignment_3
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
    // InternalArdsl.g:9287:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9291:1: ( rule__Rule__Group__4__Impl )
            // InternalArdsl.g:9292:2: rule__Rule__Group__4__Impl
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
    // InternalArdsl.g:9298:1: rule__Rule__Group__4__Impl : ( ')' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9302:1: ( ( ')' ) )
            // InternalArdsl.g:9303:1: ( ')' )
            {
            // InternalArdsl.g:9303:1: ( ')' )
            // InternalArdsl.g:9304:2: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_4()); 
            match(input,103,FOLLOW_2); 
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


    // $ANTLR start "rule__Arithmetic__Group__0"
    // InternalArdsl.g:9314:1: rule__Arithmetic__Group__0 : rule__Arithmetic__Group__0__Impl rule__Arithmetic__Group__1 ;
    public final void rule__Arithmetic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9318:1: ( rule__Arithmetic__Group__0__Impl rule__Arithmetic__Group__1 )
            // InternalArdsl.g:9319:2: rule__Arithmetic__Group__0__Impl rule__Arithmetic__Group__1
            {
            pushFollow(FOLLOW_77);
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
    // InternalArdsl.g:9326:1: rule__Arithmetic__Group__0__Impl : ( ( rule__Arithmetic__LeftAssignment_0 ) ) ;
    public final void rule__Arithmetic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9330:1: ( ( ( rule__Arithmetic__LeftAssignment_0 ) ) )
            // InternalArdsl.g:9331:1: ( ( rule__Arithmetic__LeftAssignment_0 ) )
            {
            // InternalArdsl.g:9331:1: ( ( rule__Arithmetic__LeftAssignment_0 ) )
            // InternalArdsl.g:9332:2: ( rule__Arithmetic__LeftAssignment_0 )
            {
             before(grammarAccess.getArithmeticAccess().getLeftAssignment_0()); 
            // InternalArdsl.g:9333:2: ( rule__Arithmetic__LeftAssignment_0 )
            // InternalArdsl.g:9333:3: rule__Arithmetic__LeftAssignment_0
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
    // InternalArdsl.g:9341:1: rule__Arithmetic__Group__1 : rule__Arithmetic__Group__1__Impl rule__Arithmetic__Group__2 ;
    public final void rule__Arithmetic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9345:1: ( rule__Arithmetic__Group__1__Impl rule__Arithmetic__Group__2 )
            // InternalArdsl.g:9346:2: rule__Arithmetic__Group__1__Impl rule__Arithmetic__Group__2
            {
            pushFollow(FOLLOW_75);
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
    // InternalArdsl.g:9353:1: rule__Arithmetic__Group__1__Impl : ( ( rule__Arithmetic__OpAssignment_1 ) ) ;
    public final void rule__Arithmetic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9357:1: ( ( ( rule__Arithmetic__OpAssignment_1 ) ) )
            // InternalArdsl.g:9358:1: ( ( rule__Arithmetic__OpAssignment_1 ) )
            {
            // InternalArdsl.g:9358:1: ( ( rule__Arithmetic__OpAssignment_1 ) )
            // InternalArdsl.g:9359:2: ( rule__Arithmetic__OpAssignment_1 )
            {
             before(grammarAccess.getArithmeticAccess().getOpAssignment_1()); 
            // InternalArdsl.g:9360:2: ( rule__Arithmetic__OpAssignment_1 )
            // InternalArdsl.g:9360:3: rule__Arithmetic__OpAssignment_1
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
    // InternalArdsl.g:9368:1: rule__Arithmetic__Group__2 : rule__Arithmetic__Group__2__Impl ;
    public final void rule__Arithmetic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9372:1: ( rule__Arithmetic__Group__2__Impl )
            // InternalArdsl.g:9373:2: rule__Arithmetic__Group__2__Impl
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
    // InternalArdsl.g:9379:1: rule__Arithmetic__Group__2__Impl : ( ( rule__Arithmetic__RightAssignment_2 ) ) ;
    public final void rule__Arithmetic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9383:1: ( ( ( rule__Arithmetic__RightAssignment_2 ) ) )
            // InternalArdsl.g:9384:1: ( ( rule__Arithmetic__RightAssignment_2 ) )
            {
            // InternalArdsl.g:9384:1: ( ( rule__Arithmetic__RightAssignment_2 ) )
            // InternalArdsl.g:9385:2: ( rule__Arithmetic__RightAssignment_2 )
            {
             before(grammarAccess.getArithmeticAccess().getRightAssignment_2()); 
            // InternalArdsl.g:9386:2: ( rule__Arithmetic__RightAssignment_2 )
            // InternalArdsl.g:9386:3: rule__Arithmetic__RightAssignment_2
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


    // $ANTLR start "rule__Not__Group__0"
    // InternalArdsl.g:9395:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9399:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // InternalArdsl.g:9400:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FOLLOW_75);
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
    // InternalArdsl.g:9407:1: rule__Not__Group__0__Impl : ( '!' ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9411:1: ( ( '!' ) )
            // InternalArdsl.g:9412:1: ( '!' )
            {
            // InternalArdsl.g:9412:1: ( '!' )
            // InternalArdsl.g:9413:2: '!'
            {
             before(grammarAccess.getNotAccess().getExclamationMarkKeyword_0()); 
            match(input,104,FOLLOW_2); 
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
    // InternalArdsl.g:9422:1: rule__Not__Group__1 : rule__Not__Group__1__Impl ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9426:1: ( rule__Not__Group__1__Impl )
            // InternalArdsl.g:9427:2: rule__Not__Group__1__Impl
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
    // InternalArdsl.g:9433:1: rule__Not__Group__1__Impl : ( ( rule__Not__LeftAssignment_1 ) ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9437:1: ( ( ( rule__Not__LeftAssignment_1 ) ) )
            // InternalArdsl.g:9438:1: ( ( rule__Not__LeftAssignment_1 ) )
            {
            // InternalArdsl.g:9438:1: ( ( rule__Not__LeftAssignment_1 ) )
            // InternalArdsl.g:9439:2: ( rule__Not__LeftAssignment_1 )
            {
             before(grammarAccess.getNotAccess().getLeftAssignment_1()); 
            // InternalArdsl.g:9440:2: ( rule__Not__LeftAssignment_1 )
            // InternalArdsl.g:9440:3: rule__Not__LeftAssignment_1
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
    // InternalArdsl.g:9449:1: rule__Binary__Group__0 : rule__Binary__Group__0__Impl rule__Binary__Group__1 ;
    public final void rule__Binary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9453:1: ( rule__Binary__Group__0__Impl rule__Binary__Group__1 )
            // InternalArdsl.g:9454:2: rule__Binary__Group__0__Impl rule__Binary__Group__1
            {
            pushFollow(FOLLOW_75);
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
    // InternalArdsl.g:9461:1: rule__Binary__Group__0__Impl : ( '(' ) ;
    public final void rule__Binary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9465:1: ( ( '(' ) )
            // InternalArdsl.g:9466:1: ( '(' )
            {
            // InternalArdsl.g:9466:1: ( '(' )
            // InternalArdsl.g:9467:2: '('
            {
             before(grammarAccess.getBinaryAccess().getLeftParenthesisKeyword_0()); 
            match(input,105,FOLLOW_2); 
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
    // InternalArdsl.g:9476:1: rule__Binary__Group__1 : rule__Binary__Group__1__Impl rule__Binary__Group__2 ;
    public final void rule__Binary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9480:1: ( rule__Binary__Group__1__Impl rule__Binary__Group__2 )
            // InternalArdsl.g:9481:2: rule__Binary__Group__1__Impl rule__Binary__Group__2
            {
            pushFollow(FOLLOW_76);
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
    // InternalArdsl.g:9488:1: rule__Binary__Group__1__Impl : ( ( rule__Binary__LeftAssignment_1 ) ) ;
    public final void rule__Binary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9492:1: ( ( ( rule__Binary__LeftAssignment_1 ) ) )
            // InternalArdsl.g:9493:1: ( ( rule__Binary__LeftAssignment_1 ) )
            {
            // InternalArdsl.g:9493:1: ( ( rule__Binary__LeftAssignment_1 ) )
            // InternalArdsl.g:9494:2: ( rule__Binary__LeftAssignment_1 )
            {
             before(grammarAccess.getBinaryAccess().getLeftAssignment_1()); 
            // InternalArdsl.g:9495:2: ( rule__Binary__LeftAssignment_1 )
            // InternalArdsl.g:9495:3: rule__Binary__LeftAssignment_1
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
    // InternalArdsl.g:9503:1: rule__Binary__Group__2 : rule__Binary__Group__2__Impl rule__Binary__Group__3 ;
    public final void rule__Binary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9507:1: ( rule__Binary__Group__2__Impl rule__Binary__Group__3 )
            // InternalArdsl.g:9508:2: rule__Binary__Group__2__Impl rule__Binary__Group__3
            {
            pushFollow(FOLLOW_78);
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
    // InternalArdsl.g:9515:1: rule__Binary__Group__2__Impl : ( ')' ) ;
    public final void rule__Binary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9519:1: ( ( ')' ) )
            // InternalArdsl.g:9520:1: ( ')' )
            {
            // InternalArdsl.g:9520:1: ( ')' )
            // InternalArdsl.g:9521:2: ')'
            {
             before(grammarAccess.getBinaryAccess().getRightParenthesisKeyword_2()); 
            match(input,103,FOLLOW_2); 
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
    // InternalArdsl.g:9530:1: rule__Binary__Group__3 : rule__Binary__Group__3__Impl rule__Binary__Group__4 ;
    public final void rule__Binary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9534:1: ( rule__Binary__Group__3__Impl rule__Binary__Group__4 )
            // InternalArdsl.g:9535:2: rule__Binary__Group__3__Impl rule__Binary__Group__4
            {
            pushFollow(FOLLOW_79);
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
    // InternalArdsl.g:9542:1: rule__Binary__Group__3__Impl : ( ( rule__Binary__OpAssignment_3 ) ) ;
    public final void rule__Binary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9546:1: ( ( ( rule__Binary__OpAssignment_3 ) ) )
            // InternalArdsl.g:9547:1: ( ( rule__Binary__OpAssignment_3 ) )
            {
            // InternalArdsl.g:9547:1: ( ( rule__Binary__OpAssignment_3 ) )
            // InternalArdsl.g:9548:2: ( rule__Binary__OpAssignment_3 )
            {
             before(grammarAccess.getBinaryAccess().getOpAssignment_3()); 
            // InternalArdsl.g:9549:2: ( rule__Binary__OpAssignment_3 )
            // InternalArdsl.g:9549:3: rule__Binary__OpAssignment_3
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
    // InternalArdsl.g:9557:1: rule__Binary__Group__4 : rule__Binary__Group__4__Impl rule__Binary__Group__5 ;
    public final void rule__Binary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9561:1: ( rule__Binary__Group__4__Impl rule__Binary__Group__5 )
            // InternalArdsl.g:9562:2: rule__Binary__Group__4__Impl rule__Binary__Group__5
            {
            pushFollow(FOLLOW_75);
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
    // InternalArdsl.g:9569:1: rule__Binary__Group__4__Impl : ( '(' ) ;
    public final void rule__Binary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9573:1: ( ( '(' ) )
            // InternalArdsl.g:9574:1: ( '(' )
            {
            // InternalArdsl.g:9574:1: ( '(' )
            // InternalArdsl.g:9575:2: '('
            {
             before(grammarAccess.getBinaryAccess().getLeftParenthesisKeyword_4()); 
            match(input,105,FOLLOW_2); 
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
    // InternalArdsl.g:9584:1: rule__Binary__Group__5 : rule__Binary__Group__5__Impl rule__Binary__Group__6 ;
    public final void rule__Binary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9588:1: ( rule__Binary__Group__5__Impl rule__Binary__Group__6 )
            // InternalArdsl.g:9589:2: rule__Binary__Group__5__Impl rule__Binary__Group__6
            {
            pushFollow(FOLLOW_76);
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
    // InternalArdsl.g:9596:1: rule__Binary__Group__5__Impl : ( ( rule__Binary__RightAssignment_5 ) ) ;
    public final void rule__Binary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9600:1: ( ( ( rule__Binary__RightAssignment_5 ) ) )
            // InternalArdsl.g:9601:1: ( ( rule__Binary__RightAssignment_5 ) )
            {
            // InternalArdsl.g:9601:1: ( ( rule__Binary__RightAssignment_5 ) )
            // InternalArdsl.g:9602:2: ( rule__Binary__RightAssignment_5 )
            {
             before(grammarAccess.getBinaryAccess().getRightAssignment_5()); 
            // InternalArdsl.g:9603:2: ( rule__Binary__RightAssignment_5 )
            // InternalArdsl.g:9603:3: rule__Binary__RightAssignment_5
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
    // InternalArdsl.g:9611:1: rule__Binary__Group__6 : rule__Binary__Group__6__Impl ;
    public final void rule__Binary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9615:1: ( rule__Binary__Group__6__Impl )
            // InternalArdsl.g:9616:2: rule__Binary__Group__6__Impl
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
    // InternalArdsl.g:9622:1: rule__Binary__Group__6__Impl : ( ')' ) ;
    public final void rule__Binary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9626:1: ( ( ')' ) )
            // InternalArdsl.g:9627:1: ( ')' )
            {
            // InternalArdsl.g:9627:1: ( ')' )
            // InternalArdsl.g:9628:2: ')'
            {
             before(grammarAccess.getBinaryAccess().getRightParenthesisKeyword_6()); 
            match(input,103,FOLLOW_2); 
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


    // $ANTLR start "rule__AttributeValue__Group__0"
    // InternalArdsl.g:9638:1: rule__AttributeValue__Group__0 : rule__AttributeValue__Group__0__Impl rule__AttributeValue__Group__1 ;
    public final void rule__AttributeValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9642:1: ( rule__AttributeValue__Group__0__Impl rule__AttributeValue__Group__1 )
            // InternalArdsl.g:9643:2: rule__AttributeValue__Group__0__Impl rule__AttributeValue__Group__1
            {
            pushFollow(FOLLOW_80);
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
    // InternalArdsl.g:9650:1: rule__AttributeValue__Group__0__Impl : ( ( rule__AttributeValue__ClassAssignment_0 ) ) ;
    public final void rule__AttributeValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9654:1: ( ( ( rule__AttributeValue__ClassAssignment_0 ) ) )
            // InternalArdsl.g:9655:1: ( ( rule__AttributeValue__ClassAssignment_0 ) )
            {
            // InternalArdsl.g:9655:1: ( ( rule__AttributeValue__ClassAssignment_0 ) )
            // InternalArdsl.g:9656:2: ( rule__AttributeValue__ClassAssignment_0 )
            {
             before(grammarAccess.getAttributeValueAccess().getClassAssignment_0()); 
            // InternalArdsl.g:9657:2: ( rule__AttributeValue__ClassAssignment_0 )
            // InternalArdsl.g:9657:3: rule__AttributeValue__ClassAssignment_0
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
    // InternalArdsl.g:9665:1: rule__AttributeValue__Group__1 : rule__AttributeValue__Group__1__Impl rule__AttributeValue__Group__2 ;
    public final void rule__AttributeValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9669:1: ( rule__AttributeValue__Group__1__Impl rule__AttributeValue__Group__2 )
            // InternalArdsl.g:9670:2: rule__AttributeValue__Group__1__Impl rule__AttributeValue__Group__2
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
    // InternalArdsl.g:9677:1: rule__AttributeValue__Group__1__Impl : ( '.' ) ;
    public final void rule__AttributeValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9681:1: ( ( '.' ) )
            // InternalArdsl.g:9682:1: ( '.' )
            {
            // InternalArdsl.g:9682:1: ( '.' )
            // InternalArdsl.g:9683:2: '.'
            {
             before(grammarAccess.getAttributeValueAccess().getFullStopKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalArdsl.g:9692:1: rule__AttributeValue__Group__2 : rule__AttributeValue__Group__2__Impl ;
    public final void rule__AttributeValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9696:1: ( rule__AttributeValue__Group__2__Impl )
            // InternalArdsl.g:9697:2: rule__AttributeValue__Group__2__Impl
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
    // InternalArdsl.g:9703:1: rule__AttributeValue__Group__2__Impl : ( ( rule__AttributeValue__AttributeAssignment_2 ) ) ;
    public final void rule__AttributeValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9707:1: ( ( ( rule__AttributeValue__AttributeAssignment_2 ) ) )
            // InternalArdsl.g:9708:1: ( ( rule__AttributeValue__AttributeAssignment_2 ) )
            {
            // InternalArdsl.g:9708:1: ( ( rule__AttributeValue__AttributeAssignment_2 ) )
            // InternalArdsl.g:9709:2: ( rule__AttributeValue__AttributeAssignment_2 )
            {
             before(grammarAccess.getAttributeValueAccess().getAttributeAssignment_2()); 
            // InternalArdsl.g:9710:2: ( rule__AttributeValue__AttributeAssignment_2 )
            // InternalArdsl.g:9710:3: rule__AttributeValue__AttributeAssignment_2
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
    // InternalArdsl.g:9719:1: rule__AllInstances__Group__0 : rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1 ;
    public final void rule__AllInstances__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9723:1: ( rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1 )
            // InternalArdsl.g:9724:2: rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1
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
    // InternalArdsl.g:9731:1: rule__AllInstances__Group__0__Impl : ( 'All' ) ;
    public final void rule__AllInstances__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9735:1: ( ( 'All' ) )
            // InternalArdsl.g:9736:1: ( 'All' )
            {
            // InternalArdsl.g:9736:1: ( 'All' )
            // InternalArdsl.g:9737:2: 'All'
            {
             before(grammarAccess.getAllInstancesAccess().getAllKeyword_0()); 
            match(input,106,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getAllKeyword_0()); 

            }


            }

        }
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
    // InternalArdsl.g:9746:1: rule__AllInstances__Group__1 : rule__AllInstances__Group__1__Impl ;
    public final void rule__AllInstances__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9750:1: ( rule__AllInstances__Group__1__Impl )
            // InternalArdsl.g:9751:2: rule__AllInstances__Group__1__Impl
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
    // InternalArdsl.g:9757:1: rule__AllInstances__Group__1__Impl : ( ( rule__AllInstances__TypeAssignment_1 ) ) ;
    public final void rule__AllInstances__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9761:1: ( ( ( rule__AllInstances__TypeAssignment_1 ) ) )
            // InternalArdsl.g:9762:1: ( ( rule__AllInstances__TypeAssignment_1 ) )
            {
            // InternalArdsl.g:9762:1: ( ( rule__AllInstances__TypeAssignment_1 ) )
            // InternalArdsl.g:9763:2: ( rule__AllInstances__TypeAssignment_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getTypeAssignment_1()); 
            // InternalArdsl.g:9764:2: ( rule__AllInstances__TypeAssignment_1 )
            // InternalArdsl.g:9764:3: rule__AllInstances__TypeAssignment_1
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
    // InternalArdsl.g:9773:1: rule__Ontological__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Ontological__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9777:1: ( ( ruleEString ) )
            // InternalArdsl.g:9778:2: ( ruleEString )
            {
            // InternalArdsl.g:9778:2: ( ruleEString )
            // InternalArdsl.g:9779:3: ruleEString
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


    // $ANTLR start "rule__Ontological__URIAssignment_3_1"
    // InternalArdsl.g:9788:1: rule__Ontological__URIAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Ontological__URIAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9792:1: ( ( ruleEString ) )
            // InternalArdsl.g:9793:2: ( ruleEString )
            {
            // InternalArdsl.g:9793:2: ( ruleEString )
            // InternalArdsl.g:9794:3: ruleEString
            {
             before(grammarAccess.getOntologicalAccess().getURIEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntologicalAccess().getURIEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ontological__URIAssignment_3_1"


    // $ANTLR start "rule__Ontological__ClassesAssignment_6"
    // InternalArdsl.g:9803:1: rule__Ontological__ClassesAssignment_6 : ( ruleClass ) ;
    public final void rule__Ontological__ClassesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9807:1: ( ( ruleClass ) )
            // InternalArdsl.g:9808:2: ( ruleClass )
            {
            // InternalArdsl.g:9808:2: ( ruleClass )
            // InternalArdsl.g:9809:3: ruleClass
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


    // $ANTLR start "rule__Ontological__ClassesAssignment_7_1"
    // InternalArdsl.g:9818:1: rule__Ontological__ClassesAssignment_7_1 : ( ruleClass ) ;
    public final void rule__Ontological__ClassesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9822:1: ( ( ruleClass ) )
            // InternalArdsl.g:9823:2: ( ruleClass )
            {
            // InternalArdsl.g:9823:2: ( ruleClass )
            // InternalArdsl.g:9824:3: ruleClass
            {
             before(grammarAccess.getOntologicalAccess().getClassesClassParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getOntologicalAccess().getClassesClassParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ontological__ClassesAssignment_7_1"


    // $ANTLR start "rule__Ontological__GraphicAssignment_10"
    // InternalArdsl.g:9833:1: rule__Ontological__GraphicAssignment_10 : ( ruleGraphic ) ;
    public final void rule__Ontological__GraphicAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9837:1: ( ( ruleGraphic ) )
            // InternalArdsl.g:9838:2: ( ruleGraphic )
            {
            // InternalArdsl.g:9838:2: ( ruleGraphic )
            // InternalArdsl.g:9839:3: ruleGraphic
            {
             before(grammarAccess.getOntologicalAccess().getGraphicGraphicParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphic();

            state._fsp--;

             after(grammarAccess.getOntologicalAccess().getGraphicGraphicParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ontological__GraphicAssignment_10"


    // $ANTLR start "rule__Ontological__PhysicAssignment_11"
    // InternalArdsl.g:9848:1: rule__Ontological__PhysicAssignment_11 : ( rulePhysics ) ;
    public final void rule__Ontological__PhysicAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9852:1: ( ( rulePhysics ) )
            // InternalArdsl.g:9853:2: ( rulePhysics )
            {
            // InternalArdsl.g:9853:2: ( rulePhysics )
            // InternalArdsl.g:9854:3: rulePhysics
            {
             before(grammarAccess.getOntologicalAccess().getPhysicPhysicsParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            rulePhysics();

            state._fsp--;

             after(grammarAccess.getOntologicalAccess().getPhysicPhysicsParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ontological__PhysicAssignment_11"


    // $ANTLR start "rule__Ontological__GameloopAssignment_12"
    // InternalArdsl.g:9863:1: rule__Ontological__GameloopAssignment_12 : ( ruleGameloop ) ;
    public final void rule__Ontological__GameloopAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9867:1: ( ( ruleGameloop ) )
            // InternalArdsl.g:9868:2: ( ruleGameloop )
            {
            // InternalArdsl.g:9868:2: ( ruleGameloop )
            // InternalArdsl.g:9869:3: ruleGameloop
            {
             before(grammarAccess.getOntologicalAccess().getGameloopGameloopParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleGameloop();

            state._fsp--;

             after(grammarAccess.getOntologicalAccess().getGameloopGameloopParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ontological__GameloopAssignment_12"


    // $ANTLR start "rule__Class__NameAssignment_0"
    // InternalArdsl.g:9878:1: rule__Class__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Class__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9882:1: ( ( ruleEString ) )
            // InternalArdsl.g:9883:2: ( ruleEString )
            {
            // InternalArdsl.g:9883:2: ( ruleEString )
            // InternalArdsl.g:9884:3: ruleEString
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
    // InternalArdsl.g:9893:1: rule__Class__AttributesAssignment_2_0 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9897:1: ( ( ruleAttribute ) )
            // InternalArdsl.g:9898:2: ( ruleAttribute )
            {
            // InternalArdsl.g:9898:2: ( ruleAttribute )
            // InternalArdsl.g:9899:3: ruleAttribute
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


    // $ANTLR start "rule__Class__AttributesAssignment_2_1_1"
    // InternalArdsl.g:9908:1: rule__Class__AttributesAssignment_2_1_1 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9912:1: ( ( ruleAttribute ) )
            // InternalArdsl.g:9913:2: ( ruleAttribute )
            {
            // InternalArdsl.g:9913:2: ( ruleAttribute )
            // InternalArdsl.g:9914:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributesAssignment_2_1_1"


    // $ANTLR start "rule__Class__ReferencesAssignment_3_2"
    // InternalArdsl.g:9923:1: rule__Class__ReferencesAssignment_3_2 : ( ruleReference ) ;
    public final void rule__Class__ReferencesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9927:1: ( ( ruleReference ) )
            // InternalArdsl.g:9928:2: ( ruleReference )
            {
            // InternalArdsl.g:9928:2: ( ruleReference )
            // InternalArdsl.g:9929:3: ruleReference
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


    // $ANTLR start "rule__Class__ReferencesAssignment_3_3_1"
    // InternalArdsl.g:9938:1: rule__Class__ReferencesAssignment_3_3_1 : ( ruleReference ) ;
    public final void rule__Class__ReferencesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9942:1: ( ( ruleReference ) )
            // InternalArdsl.g:9943:2: ( ruleReference )
            {
            // InternalArdsl.g:9943:2: ( ruleReference )
            // InternalArdsl.g:9944:3: ruleReference
            {
             before(grammarAccess.getClassAccess().getReferencesReferenceParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getClassAccess().getReferencesReferenceParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ReferencesAssignment_3_3_1"


    // $ANTLR start "rule__Class__AbstractAssignment_5"
    // InternalArdsl.g:9953:1: rule__Class__AbstractAssignment_5 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9957:1: ( ( ( 'abstract' ) ) )
            // InternalArdsl.g:9958:2: ( ( 'abstract' ) )
            {
            // InternalArdsl.g:9958:2: ( ( 'abstract' ) )
            // InternalArdsl.g:9959:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_5_0()); 
            // InternalArdsl.g:9960:3: ( 'abstract' )
            // InternalArdsl.g:9961:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_5_0()); 
            match(input,107,FOLLOW_2); 
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
    // InternalArdsl.g:9972:1: rule__Class__NoSCNAssignment_6 : ( ( 'invisible' ) ) ;
    public final void rule__Class__NoSCNAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9976:1: ( ( ( 'invisible' ) ) )
            // InternalArdsl.g:9977:2: ( ( 'invisible' ) )
            {
            // InternalArdsl.g:9977:2: ( ( 'invisible' ) )
            // InternalArdsl.g:9978:3: ( 'invisible' )
            {
             before(grammarAccess.getClassAccess().getNoSCNInvisibleKeyword_6_0()); 
            // InternalArdsl.g:9979:3: ( 'invisible' )
            // InternalArdsl.g:9980:4: 'invisible'
            {
             before(grammarAccess.getClassAccess().getNoSCNInvisibleKeyword_6_0()); 
            match(input,108,FOLLOW_2); 
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


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalArdsl.g:9991:1: rule__Attribute__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:9995:1: ( ( ruleEString ) )
            // InternalArdsl.g:9996:2: ( ruleEString )
            {
            // InternalArdsl.g:9996:2: ( ruleEString )
            // InternalArdsl.g:9997:3: ruleEString
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
    // InternalArdsl.g:10006:1: rule__Attribute__TypeAssignment_2 : ( ruleEString ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10010:1: ( ( ruleEString ) )
            // InternalArdsl.g:10011:2: ( ruleEString )
            {
            // InternalArdsl.g:10011:2: ( ruleEString )
            // InternalArdsl.g:10012:3: ruleEString
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
    // InternalArdsl.g:10021:1: rule__Attribute__MinAssignment_4 : ( ruleEInt ) ;
    public final void rule__Attribute__MinAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10025:1: ( ( ruleEInt ) )
            // InternalArdsl.g:10026:2: ( ruleEInt )
            {
            // InternalArdsl.g:10026:2: ( ruleEInt )
            // InternalArdsl.g:10027:3: ruleEInt
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
    // InternalArdsl.g:10036:1: rule__Attribute__MaxAssignment_6 : ( ruleEInt ) ;
    public final void rule__Attribute__MaxAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10040:1: ( ( ruleEInt ) )
            // InternalArdsl.g:10041:2: ( ruleEInt )
            {
            // InternalArdsl.g:10041:2: ( ruleEInt )
            // InternalArdsl.g:10042:3: ruleEInt
            {
             before(grammarAccess.getAttributeAccess().getMaxEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getMaxEIntParserRuleCall_6_0()); 

            }


            }

        }
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
    // InternalArdsl.g:10051:1: rule__Attribute__DefaultAssignment_9 : ( ruleEString ) ;
    public final void rule__Attribute__DefaultAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10055:1: ( ( ruleEString ) )
            // InternalArdsl.g:10056:2: ( ruleEString )
            {
            // InternalArdsl.g:10056:2: ( ruleEString )
            // InternalArdsl.g:10057:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getDefaultEStringParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getDefaultEStringParserRuleCall_9_0()); 

            }


            }

        }
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
    // InternalArdsl.g:10066:1: rule__Attribute__IsParamAssignment_10 : ( ( 'isParam' ) ) ;
    public final void rule__Attribute__IsParamAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10070:1: ( ( ( 'isParam' ) ) )
            // InternalArdsl.g:10071:2: ( ( 'isParam' ) )
            {
            // InternalArdsl.g:10071:2: ( ( 'isParam' ) )
            // InternalArdsl.g:10072:3: ( 'isParam' )
            {
             before(grammarAccess.getAttributeAccess().getIsParamIsParamKeyword_10_0()); 
            // InternalArdsl.g:10073:3: ( 'isParam' )
            // InternalArdsl.g:10074:4: 'isParam'
            {
             before(grammarAccess.getAttributeAccess().getIsParamIsParamKeyword_10_0()); 
            match(input,109,FOLLOW_2); 
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
    // InternalArdsl.g:10085:1: rule__Attribute__IsKeyAssignment_11 : ( ( 'isKey' ) ) ;
    public final void rule__Attribute__IsKeyAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10089:1: ( ( ( 'isKey' ) ) )
            // InternalArdsl.g:10090:2: ( ( 'isKey' ) )
            {
            // InternalArdsl.g:10090:2: ( ( 'isKey' ) )
            // InternalArdsl.g:10091:3: ( 'isKey' )
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsKeyKeyword_11_0()); 
            // InternalArdsl.g:10092:3: ( 'isKey' )
            // InternalArdsl.g:10093:4: 'isKey'
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsKeyKeyword_11_0()); 
            match(input,110,FOLLOW_2); 
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
    // InternalArdsl.g:10104:1: rule__Attribute__ReadOnlyAssignment_12 : ( ( 'readOnly' ) ) ;
    public final void rule__Attribute__ReadOnlyAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10108:1: ( ( ( 'readOnly' ) ) )
            // InternalArdsl.g:10109:2: ( ( 'readOnly' ) )
            {
            // InternalArdsl.g:10109:2: ( ( 'readOnly' ) )
            // InternalArdsl.g:10110:3: ( 'readOnly' )
            {
             before(grammarAccess.getAttributeAccess().getReadOnlyReadOnlyKeyword_12_0()); 
            // InternalArdsl.g:10111:3: ( 'readOnly' )
            // InternalArdsl.g:10112:4: 'readOnly'
            {
             before(grammarAccess.getAttributeAccess().getReadOnlyReadOnlyKeyword_12_0()); 
            match(input,111,FOLLOW_2); 
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
    // InternalArdsl.g:10123:1: rule__Reference__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Reference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10127:1: ( ( ruleEString ) )
            // InternalArdsl.g:10128:2: ( ruleEString )
            {
            // InternalArdsl.g:10128:2: ( ruleEString )
            // InternalArdsl.g:10129:3: ruleEString
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
    // InternalArdsl.g:10138:1: rule__Reference__ContaintmentAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Reference__ContaintmentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10142:1: ( ( ruleEString ) )
            // InternalArdsl.g:10143:2: ( ruleEString )
            {
            // InternalArdsl.g:10143:2: ( ruleEString )
            // InternalArdsl.g:10144:3: ruleEString
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
    // InternalArdsl.g:10153:1: rule__Reference__MinAssignment_3 : ( ruleEInt ) ;
    public final void rule__Reference__MinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10157:1: ( ( ruleEInt ) )
            // InternalArdsl.g:10158:2: ( ruleEInt )
            {
            // InternalArdsl.g:10158:2: ( ruleEInt )
            // InternalArdsl.g:10159:3: ruleEInt
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
    // InternalArdsl.g:10168:1: rule__Reference__MaxAssignment_5 : ( ruleEInt ) ;
    public final void rule__Reference__MaxAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10172:1: ( ( ruleEInt ) )
            // InternalArdsl.g:10173:2: ( ruleEInt )
            {
            // InternalArdsl.g:10173:2: ( ruleEInt )
            // InternalArdsl.g:10174:3: ruleEInt
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
    // InternalArdsl.g:10183:1: rule__Reference__TargetAssignment_7 : ( ruleEString ) ;
    public final void rule__Reference__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10187:1: ( ( ruleEString ) )
            // InternalArdsl.g:10188:2: ( ruleEString )
            {
            // InternalArdsl.g:10188:2: ( ruleEString )
            // InternalArdsl.g:10189:3: ruleEString
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
    // InternalArdsl.g:10198:1: rule__Reference__OppositeAssignment_8_1 : ( ruleEString ) ;
    public final void rule__Reference__OppositeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10202:1: ( ( ruleEString ) )
            // InternalArdsl.g:10203:2: ( ruleEString )
            {
            // InternalArdsl.g:10203:2: ( ruleEString )
            // InternalArdsl.g:10204:3: ruleEString
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


    // $ANTLR start "rule__Graphic__ClassesAssignment_2"
    // InternalArdsl.g:10213:1: rule__Graphic__ClassesAssignment_2 : ( ruleGraphicClass ) ;
    public final void rule__Graphic__ClassesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10217:1: ( ( ruleGraphicClass ) )
            // InternalArdsl.g:10218:2: ( ruleGraphicClass )
            {
            // InternalArdsl.g:10218:2: ( ruleGraphicClass )
            // InternalArdsl.g:10219:3: ruleGraphicClass
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


    // $ANTLR start "rule__Graphic__ClassesAssignment_3_1"
    // InternalArdsl.g:10228:1: rule__Graphic__ClassesAssignment_3_1 : ( ruleGraphicClass ) ;
    public final void rule__Graphic__ClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10232:1: ( ( ruleGraphicClass ) )
            // InternalArdsl.g:10233:2: ( ruleGraphicClass )
            {
            // InternalArdsl.g:10233:2: ( ruleGraphicClass )
            // InternalArdsl.g:10234:3: ruleGraphicClass
            {
             before(grammarAccess.getGraphicAccess().getClassesGraphicClassParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicClass();

            state._fsp--;

             after(grammarAccess.getGraphicAccess().getClassesGraphicClassParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphic__ClassesAssignment_3_1"


    // $ANTLR start "rule__GraphicClass__OntoClassAssignment_1"
    // InternalArdsl.g:10243:1: rule__GraphicClass__OntoClassAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__GraphicClass__OntoClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10247:1: ( ( ( ruleEString ) ) )
            // InternalArdsl.g:10248:2: ( ( ruleEString ) )
            {
            // InternalArdsl.g:10248:2: ( ( ruleEString ) )
            // InternalArdsl.g:10249:3: ( ruleEString )
            {
             before(grammarAccess.getGraphicClassAccess().getOntoClassClassCrossReference_1_0()); 
            // InternalArdsl.g:10250:3: ( ruleEString )
            // InternalArdsl.g:10251:4: ruleEString
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
    // InternalArdsl.g:10262:1: rule__GraphicClass__VersionsAssignment_4 : ( ruleVersions ) ;
    public final void rule__GraphicClass__VersionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10266:1: ( ( ruleVersions ) )
            // InternalArdsl.g:10267:2: ( ruleVersions )
            {
            // InternalArdsl.g:10267:2: ( ruleVersions )
            // InternalArdsl.g:10268:3: ruleVersions
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


    // $ANTLR start "rule__GraphicClass__VersionsAssignment_5_1"
    // InternalArdsl.g:10277:1: rule__GraphicClass__VersionsAssignment_5_1 : ( ruleVersions ) ;
    public final void rule__GraphicClass__VersionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10281:1: ( ( ruleVersions ) )
            // InternalArdsl.g:10282:2: ( ruleVersions )
            {
            // InternalArdsl.g:10282:2: ( ruleVersions )
            // InternalArdsl.g:10283:3: ruleVersions
            {
             before(grammarAccess.getGraphicClassAccess().getVersionsVersionsParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVersions();

            state._fsp--;

             after(grammarAccess.getGraphicClassAccess().getVersionsVersionsParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphicClass__VersionsAssignment_5_1"


    // $ANTLR start "rule__GraphicClass__ConstraintsAssignment_9"
    // InternalArdsl.g:10292:1: rule__GraphicClass__ConstraintsAssignment_9 : ( ruleConstraints ) ;
    public final void rule__GraphicClass__ConstraintsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10296:1: ( ( ruleConstraints ) )
            // InternalArdsl.g:10297:2: ( ruleConstraints )
            {
            // InternalArdsl.g:10297:2: ( ruleConstraints )
            // InternalArdsl.g:10298:3: ruleConstraints
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


    // $ANTLR start "rule__Versions__NameAssignment_0"
    // InternalArdsl.g:10307:1: rule__Versions__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Versions__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10311:1: ( ( ruleEString ) )
            // InternalArdsl.g:10312:2: ( ruleEString )
            {
            // InternalArdsl.g:10312:2: ( ruleEString )
            // InternalArdsl.g:10313:3: ruleEString
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
    // InternalArdsl.g:10322:1: rule__Versions__URLAssignment_2 : ( ruleEString ) ;
    public final void rule__Versions__URLAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10326:1: ( ( ruleEString ) )
            // InternalArdsl.g:10327:2: ( ruleEString )
            {
            // InternalArdsl.g:10327:2: ( ruleEString )
            // InternalArdsl.g:10328:3: ruleEString
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


    // $ANTLR start "rule__Constraints__PlanesAssignment_1"
    // InternalArdsl.g:10337:1: rule__Constraints__PlanesAssignment_1 : ( rulePlanes ) ;
    public final void rule__Constraints__PlanesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10341:1: ( ( rulePlanes ) )
            // InternalArdsl.g:10342:2: ( rulePlanes )
            {
            // InternalArdsl.g:10342:2: ( rulePlanes )
            // InternalArdsl.g:10343:3: rulePlanes
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
    // InternalArdsl.g:10352:1: rule__Constraints__OverlappingAssignment_2 : ( ( 'overlaps' ) ) ;
    public final void rule__Constraints__OverlappingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10356:1: ( ( ( 'overlaps' ) ) )
            // InternalArdsl.g:10357:2: ( ( 'overlaps' ) )
            {
            // InternalArdsl.g:10357:2: ( ( 'overlaps' ) )
            // InternalArdsl.g:10358:3: ( 'overlaps' )
            {
             before(grammarAccess.getConstraintsAccess().getOverlappingOverlapsKeyword_2_0()); 
            // InternalArdsl.g:10359:3: ( 'overlaps' )
            // InternalArdsl.g:10360:4: 'overlaps'
            {
             before(grammarAccess.getConstraintsAccess().getOverlappingOverlapsKeyword_2_0()); 
            match(input,112,FOLLOW_2); 
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
    // InternalArdsl.g:10371:1: rule__Constraints__SizeMinAssignment_4 : ( ruleEDouble ) ;
    public final void rule__Constraints__SizeMinAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10375:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:10376:2: ( ruleEDouble )
            {
            // InternalArdsl.g:10376:2: ( ruleEDouble )
            // InternalArdsl.g:10377:3: ruleEDouble
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
    // InternalArdsl.g:10386:1: rule__Constraints__SizeMaxAssignment_6 : ( ruleEDouble ) ;
    public final void rule__Constraints__SizeMaxAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10390:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:10391:2: ( ruleEDouble )
            {
            // InternalArdsl.g:10391:2: ( ruleEDouble )
            // InternalArdsl.g:10392:3: ruleEDouble
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
    // InternalArdsl.g:10401:1: rule__Constraints__XToOriginPosAssignment_8 : ( ruleEDouble ) ;
    public final void rule__Constraints__XToOriginPosAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10405:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:10406:2: ( ruleEDouble )
            {
            // InternalArdsl.g:10406:2: ( ruleEDouble )
            // InternalArdsl.g:10407:3: ruleEDouble
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
    // InternalArdsl.g:10416:1: rule__Constraints__YToOriginPosAssignment_10 : ( ruleEDouble ) ;
    public final void rule__Constraints__YToOriginPosAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10420:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:10421:2: ( ruleEDouble )
            {
            // InternalArdsl.g:10421:2: ( ruleEDouble )
            // InternalArdsl.g:10422:3: ruleEDouble
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
    // InternalArdsl.g:10431:1: rule__Constraints__ZToOriginPosAssignment_12 : ( ruleEDouble ) ;
    public final void rule__Constraints__ZToOriginPosAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10435:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:10436:2: ( ruleEDouble )
            {
            // InternalArdsl.g:10436:2: ( ruleEDouble )
            // InternalArdsl.g:10437:3: ruleEDouble
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
    // InternalArdsl.g:10446:1: rule__Constraints__RotationAssignment_14 : ( ruleEInt ) ;
    public final void rule__Constraints__RotationAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10450:1: ( ( ruleEInt ) )
            // InternalArdsl.g:10451:2: ( ruleEInt )
            {
            // InternalArdsl.g:10451:2: ( ruleEInt )
            // InternalArdsl.g:10452:3: ruleEInt
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


    // $ANTLR start "rule__Physics__ClassesAssignment_2"
    // InternalArdsl.g:10461:1: rule__Physics__ClassesAssignment_2 : ( rulePhysicClass ) ;
    public final void rule__Physics__ClassesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10465:1: ( ( rulePhysicClass ) )
            // InternalArdsl.g:10466:2: ( rulePhysicClass )
            {
            // InternalArdsl.g:10466:2: ( rulePhysicClass )
            // InternalArdsl.g:10467:3: rulePhysicClass
            {
             before(grammarAccess.getPhysicsAccess().getClassesPhysicClassParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhysicClass();

            state._fsp--;

             after(grammarAccess.getPhysicsAccess().getClassesPhysicClassParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Physics__ClassesAssignment_2"


    // $ANTLR start "rule__Physics__ClassesAssignment_3_1"
    // InternalArdsl.g:10476:1: rule__Physics__ClassesAssignment_3_1 : ( rulePhysicClass ) ;
    public final void rule__Physics__ClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10480:1: ( ( rulePhysicClass ) )
            // InternalArdsl.g:10481:2: ( rulePhysicClass )
            {
            // InternalArdsl.g:10481:2: ( rulePhysicClass )
            // InternalArdsl.g:10482:3: rulePhysicClass
            {
             before(grammarAccess.getPhysicsAccess().getClassesPhysicClassParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhysicClass();

            state._fsp--;

             after(grammarAccess.getPhysicsAccess().getClassesPhysicClassParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Physics__ClassesAssignment_3_1"


    // $ANTLR start "rule__PhysicClass__OntoClassAssignment_1"
    // InternalArdsl.g:10491:1: rule__PhysicClass__OntoClassAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__PhysicClass__OntoClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10495:1: ( ( ( ruleEString ) ) )
            // InternalArdsl.g:10496:2: ( ( ruleEString ) )
            {
            // InternalArdsl.g:10496:2: ( ( ruleEString ) )
            // InternalArdsl.g:10497:3: ( ruleEString )
            {
             before(grammarAccess.getPhysicClassAccess().getOntoClassClassCrossReference_1_0()); 
            // InternalArdsl.g:10498:3: ( ruleEString )
            // InternalArdsl.g:10499:4: ruleEString
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
    // InternalArdsl.g:10510:1: rule__PhysicClass__PhysicBodyAssignment_4 : ( rulePhysicBody ) ;
    public final void rule__PhysicClass__PhysicBodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10514:1: ( ( rulePhysicBody ) )
            // InternalArdsl.g:10515:2: ( rulePhysicBody )
            {
            // InternalArdsl.g:10515:2: ( rulePhysicBody )
            // InternalArdsl.g:10516:3: rulePhysicBody
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
    // InternalArdsl.g:10525:1: rule__PhysicClass__ForcesAssignment_6_2 : ( ruleForces ) ;
    public final void rule__PhysicClass__ForcesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10529:1: ( ( ruleForces ) )
            // InternalArdsl.g:10530:2: ( ruleForces )
            {
            // InternalArdsl.g:10530:2: ( ruleForces )
            // InternalArdsl.g:10531:3: ruleForces
            {
             before(grammarAccess.getPhysicClassAccess().getForcesForcesParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleForces();

            state._fsp--;

             after(grammarAccess.getPhysicClassAccess().getForcesForcesParserRuleCall_6_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__PhysicClass__ForcesAssignment_6_3_1"
    // InternalArdsl.g:10540:1: rule__PhysicClass__ForcesAssignment_6_3_1 : ( ruleForces ) ;
    public final void rule__PhysicClass__ForcesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10544:1: ( ( ruleForces ) )
            // InternalArdsl.g:10545:2: ( ruleForces )
            {
            // InternalArdsl.g:10545:2: ( ruleForces )
            // InternalArdsl.g:10546:3: ruleForces
            {
             before(grammarAccess.getPhysicClassAccess().getForcesForcesParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleForces();

            state._fsp--;

             after(grammarAccess.getPhysicClassAccess().getForcesForcesParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicClass__ForcesAssignment_6_3_1"


    // $ANTLR start "rule__PhysicClass__BitMasksAssignment_9"
    // InternalArdsl.g:10555:1: rule__PhysicClass__BitMasksAssignment_9 : ( ruleBitMasks ) ;
    public final void rule__PhysicClass__BitMasksAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10559:1: ( ( ruleBitMasks ) )
            // InternalArdsl.g:10560:2: ( ruleBitMasks )
            {
            // InternalArdsl.g:10560:2: ( ruleBitMasks )
            // InternalArdsl.g:10561:3: ruleBitMasks
            {
             before(grammarAccess.getPhysicClassAccess().getBitMasksBitMasksParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleBitMasks();

            state._fsp--;

             after(grammarAccess.getPhysicClassAccess().getBitMasksBitMasksParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicClass__BitMasksAssignment_9"


    // $ANTLR start "rule__PhysicBody__MassAssignment_1"
    // InternalArdsl.g:10570:1: rule__PhysicBody__MassAssignment_1 : ( ruleEDouble ) ;
    public final void rule__PhysicBody__MassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10574:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:10575:2: ( ruleEDouble )
            {
            // InternalArdsl.g:10575:2: ( ruleEDouble )
            // InternalArdsl.g:10576:3: ruleEDouble
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
    // InternalArdsl.g:10585:1: rule__PhysicBody__BodyTypeAssignment_3 : ( ruleBodyType ) ;
    public final void rule__PhysicBody__BodyTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10589:1: ( ( ruleBodyType ) )
            // InternalArdsl.g:10590:2: ( ruleBodyType )
            {
            // InternalArdsl.g:10590:2: ( ruleBodyType )
            // InternalArdsl.g:10591:3: ruleBodyType
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
    // InternalArdsl.g:10600:1: rule__PhysicBody__ChargeAssignment_5 : ( ruleEDouble ) ;
    public final void rule__PhysicBody__ChargeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10604:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:10605:2: ( ruleEDouble )
            {
            // InternalArdsl.g:10605:2: ( ruleEDouble )
            // InternalArdsl.g:10606:3: ruleEDouble
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
    // InternalArdsl.g:10615:1: rule__PhysicBody__FrictionAssignment_7 : ( ruleEDouble ) ;
    public final void rule__PhysicBody__FrictionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10619:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:10620:2: ( ruleEDouble )
            {
            // InternalArdsl.g:10620:2: ( ruleEDouble )
            // InternalArdsl.g:10621:3: ruleEDouble
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
    // InternalArdsl.g:10630:1: rule__PhysicBody__RollingFrictionAssignment_9 : ( ruleEDouble ) ;
    public final void rule__PhysicBody__RollingFrictionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10634:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:10635:2: ( ruleEDouble )
            {
            // InternalArdsl.g:10635:2: ( ruleEDouble )
            // InternalArdsl.g:10636:3: ruleEDouble
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
    // InternalArdsl.g:10645:1: rule__PhysicBody__RestitutionAssignment_11 : ( ruleEDouble ) ;
    public final void rule__PhysicBody__RestitutionAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10649:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:10650:2: ( ruleEDouble )
            {
            // InternalArdsl.g:10650:2: ( ruleEDouble )
            // InternalArdsl.g:10651:3: ruleEDouble
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
    // InternalArdsl.g:10660:1: rule__PhysicBody__DampingAssignment_13 : ( ruleEDouble ) ;
    public final void rule__PhysicBody__DampingAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10664:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:10665:2: ( ruleEDouble )
            {
            // InternalArdsl.g:10665:2: ( ruleEDouble )
            // InternalArdsl.g:10666:3: ruleEDouble
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
    // InternalArdsl.g:10675:1: rule__PhysicBody__AngularDampingAssignment_15 : ( ruleEDouble ) ;
    public final void rule__PhysicBody__AngularDampingAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10679:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:10680:2: ( ruleEDouble )
            {
            // InternalArdsl.g:10680:2: ( ruleEDouble )
            // InternalArdsl.g:10681:3: ruleEDouble
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


    // $ANTLR start "rule__Forces__NameAssignment_0"
    // InternalArdsl.g:10690:1: rule__Forces__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Forces__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10694:1: ( ( ruleEString ) )
            // InternalArdsl.g:10695:2: ( ruleEString )
            {
            // InternalArdsl.g:10695:2: ( ruleEString )
            // InternalArdsl.g:10696:3: ruleEString
            {
             before(grammarAccess.getForcesAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getForcesAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__NameAssignment_0"


    // $ANTLR start "rule__Forces__GestureAssignment_3"
    // InternalArdsl.g:10705:1: rule__Forces__GestureAssignment_3 : ( ruleEString ) ;
    public final void rule__Forces__GestureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10709:1: ( ( ruleEString ) )
            // InternalArdsl.g:10710:2: ( ruleEString )
            {
            // InternalArdsl.g:10710:2: ( ruleEString )
            // InternalArdsl.g:10711:3: ruleEString
            {
             before(grammarAccess.getForcesAccess().getGestureEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getForcesAccess().getGestureEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__GestureAssignment_3"


    // $ANTLR start "rule__Forces__XVectorAssignment_4_1"
    // InternalArdsl.g:10720:1: rule__Forces__XVectorAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__Forces__XVectorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10724:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:10725:2: ( ruleEDouble )
            {
            // InternalArdsl.g:10725:2: ( ruleEDouble )
            // InternalArdsl.g:10726:3: ruleEDouble
            {
             before(grammarAccess.getForcesAccess().getXVectorEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getForcesAccess().getXVectorEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__XVectorAssignment_4_1"


    // $ANTLR start "rule__Forces__YVectorAssignment_4_3"
    // InternalArdsl.g:10735:1: rule__Forces__YVectorAssignment_4_3 : ( ruleEDouble ) ;
    public final void rule__Forces__YVectorAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10739:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:10740:2: ( ruleEDouble )
            {
            // InternalArdsl.g:10740:2: ( ruleEDouble )
            // InternalArdsl.g:10741:3: ruleEDouble
            {
             before(grammarAccess.getForcesAccess().getYVectorEDoubleParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getForcesAccess().getYVectorEDoubleParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__YVectorAssignment_4_3"


    // $ANTLR start "rule__Forces__ZVectorAssignment_4_5"
    // InternalArdsl.g:10750:1: rule__Forces__ZVectorAssignment_4_5 : ( ruleEDouble ) ;
    public final void rule__Forces__ZVectorAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10754:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:10755:2: ( ruleEDouble )
            {
            // InternalArdsl.g:10755:2: ( ruleEDouble )
            // InternalArdsl.g:10756:3: ruleEDouble
            {
             before(grammarAccess.getForcesAccess().getZVectorEDoubleParserRuleCall_4_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getForcesAccess().getZVectorEDoubleParserRuleCall_4_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forces__ZVectorAssignment_4_5"


    // $ANTLR start "rule__BitMasks__CollisionAssignment_1"
    // InternalArdsl.g:10765:1: rule__BitMasks__CollisionAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__BitMasks__CollisionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10769:1: ( ( ( ruleEString ) ) )
            // InternalArdsl.g:10770:2: ( ( ruleEString ) )
            {
            // InternalArdsl.g:10770:2: ( ( ruleEString ) )
            // InternalArdsl.g:10771:3: ( ruleEString )
            {
             before(grammarAccess.getBitMasksAccess().getCollisionClassCrossReference_1_0()); 
            // InternalArdsl.g:10772:3: ( ruleEString )
            // InternalArdsl.g:10773:4: ruleEString
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


    // $ANTLR start "rule__BitMasks__CollisionAssignment_2_1"
    // InternalArdsl.g:10784:1: rule__BitMasks__CollisionAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__BitMasks__CollisionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10788:1: ( ( ( ruleEString ) ) )
            // InternalArdsl.g:10789:2: ( ( ruleEString ) )
            {
            // InternalArdsl.g:10789:2: ( ( ruleEString ) )
            // InternalArdsl.g:10790:3: ( ruleEString )
            {
             before(grammarAccess.getBitMasksAccess().getCollisionClassCrossReference_2_1_0()); 
            // InternalArdsl.g:10791:3: ( ruleEString )
            // InternalArdsl.g:10792:4: ruleEString
            {
             before(grammarAccess.getBitMasksAccess().getCollisionClassEStringParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBitMasksAccess().getCollisionClassEStringParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getBitMasksAccess().getCollisionClassCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitMasks__CollisionAssignment_2_1"


    // $ANTLR start "rule__BitMasks__ContactAssignment_4"
    // InternalArdsl.g:10803:1: rule__BitMasks__ContactAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__BitMasks__ContactAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10807:1: ( ( ( ruleEString ) ) )
            // InternalArdsl.g:10808:2: ( ( ruleEString ) )
            {
            // InternalArdsl.g:10808:2: ( ( ruleEString ) )
            // InternalArdsl.g:10809:3: ( ruleEString )
            {
             before(grammarAccess.getBitMasksAccess().getContactClassCrossReference_4_0()); 
            // InternalArdsl.g:10810:3: ( ruleEString )
            // InternalArdsl.g:10811:4: ruleEString
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


    // $ANTLR start "rule__BitMasks__ContactAssignment_5_1"
    // InternalArdsl.g:10822:1: rule__BitMasks__ContactAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__BitMasks__ContactAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10826:1: ( ( ( ruleEString ) ) )
            // InternalArdsl.g:10827:2: ( ( ruleEString ) )
            {
            // InternalArdsl.g:10827:2: ( ( ruleEString ) )
            // InternalArdsl.g:10828:3: ( ruleEString )
            {
             before(grammarAccess.getBitMasksAccess().getContactClassCrossReference_5_1_0()); 
            // InternalArdsl.g:10829:3: ( ruleEString )
            // InternalArdsl.g:10830:4: ruleEString
            {
             before(grammarAccess.getBitMasksAccess().getContactClassEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBitMasksAccess().getContactClassEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getBitMasksAccess().getContactClassCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BitMasks__ContactAssignment_5_1"


    // $ANTLR start "rule__Gameloop__StartAssignment_5"
    // InternalArdsl.g:10841:1: rule__Gameloop__StartAssignment_5 : ( ruleEString ) ;
    public final void rule__Gameloop__StartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10845:1: ( ( ruleEString ) )
            // InternalArdsl.g:10846:2: ( ruleEString )
            {
            // InternalArdsl.g:10846:2: ( ruleEString )
            // InternalArdsl.g:10847:3: ruleEString
            {
             before(grammarAccess.getGameloopAccess().getStartEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGameloopAccess().getStartEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__StartAssignment_5"


    // $ANTLR start "rule__Gameloop__WinAssignment_7"
    // InternalArdsl.g:10856:1: rule__Gameloop__WinAssignment_7 : ( ruleEString ) ;
    public final void rule__Gameloop__WinAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10860:1: ( ( ruleEString ) )
            // InternalArdsl.g:10861:2: ( ruleEString )
            {
            // InternalArdsl.g:10861:2: ( ruleEString )
            // InternalArdsl.g:10862:3: ruleEString
            {
             before(grammarAccess.getGameloopAccess().getWinEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGameloopAccess().getWinEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__WinAssignment_7"


    // $ANTLR start "rule__Gameloop__LoseAssignment_9"
    // InternalArdsl.g:10871:1: rule__Gameloop__LoseAssignment_9 : ( ruleEString ) ;
    public final void rule__Gameloop__LoseAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10875:1: ( ( ruleEString ) )
            // InternalArdsl.g:10876:2: ( ruleEString )
            {
            // InternalArdsl.g:10876:2: ( ruleEString )
            // InternalArdsl.g:10877:3: ruleEString
            {
             before(grammarAccess.getGameloopAccess().getLoseEStringParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGameloopAccess().getLoseEStringParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__LoseAssignment_9"


    // $ANTLR start "rule__Gameloop__ScoreAssignment_12"
    // InternalArdsl.g:10886:1: rule__Gameloop__ScoreAssignment_12 : ( ruleScore ) ;
    public final void rule__Gameloop__ScoreAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10890:1: ( ( ruleScore ) )
            // InternalArdsl.g:10891:2: ( ruleScore )
            {
            // InternalArdsl.g:10891:2: ( ruleScore )
            // InternalArdsl.g:10892:3: ruleScore
            {
             before(grammarAccess.getGameloopAccess().getScoreScoreParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleScore();

            state._fsp--;

             after(grammarAccess.getGameloopAccess().getScoreScoreParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__ScoreAssignment_12"


    // $ANTLR start "rule__Gameloop__ActionsTriggersAssignment_14_2"
    // InternalArdsl.g:10901:1: rule__Gameloop__ActionsTriggersAssignment_14_2 : ( ruleActions ) ;
    public final void rule__Gameloop__ActionsTriggersAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10905:1: ( ( ruleActions ) )
            // InternalArdsl.g:10906:2: ( ruleActions )
            {
            // InternalArdsl.g:10906:2: ( ruleActions )
            // InternalArdsl.g:10907:3: ruleActions
            {
             before(grammarAccess.getGameloopAccess().getActionsTriggersActionsParserRuleCall_14_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getGameloopAccess().getActionsTriggersActionsParserRuleCall_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__ActionsTriggersAssignment_14_2"


    // $ANTLR start "rule__Gameloop__ActionsTriggersAssignment_14_3_1"
    // InternalArdsl.g:10916:1: rule__Gameloop__ActionsTriggersAssignment_14_3_1 : ( ruleActions ) ;
    public final void rule__Gameloop__ActionsTriggersAssignment_14_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10920:1: ( ( ruleActions ) )
            // InternalArdsl.g:10921:2: ( ruleActions )
            {
            // InternalArdsl.g:10921:2: ( ruleActions )
            // InternalArdsl.g:10922:3: ruleActions
            {
             before(grammarAccess.getGameloopAccess().getActionsTriggersActionsParserRuleCall_14_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getGameloopAccess().getActionsTriggersActionsParserRuleCall_14_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__ActionsTriggersAssignment_14_3_1"


    // $ANTLR start "rule__Gameloop__CollisionsAssignment_15_2"
    // InternalArdsl.g:10931:1: rule__Gameloop__CollisionsAssignment_15_2 : ( ruleCollisions ) ;
    public final void rule__Gameloop__CollisionsAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10935:1: ( ( ruleCollisions ) )
            // InternalArdsl.g:10936:2: ( ruleCollisions )
            {
            // InternalArdsl.g:10936:2: ( ruleCollisions )
            // InternalArdsl.g:10937:3: ruleCollisions
            {
             before(grammarAccess.getGameloopAccess().getCollisionsCollisionsParserRuleCall_15_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCollisions();

            state._fsp--;

             after(grammarAccess.getGameloopAccess().getCollisionsCollisionsParserRuleCall_15_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__CollisionsAssignment_15_2"


    // $ANTLR start "rule__Gameloop__CollisionsAssignment_15_3_1"
    // InternalArdsl.g:10946:1: rule__Gameloop__CollisionsAssignment_15_3_1 : ( ruleCollisions ) ;
    public final void rule__Gameloop__CollisionsAssignment_15_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10950:1: ( ( ruleCollisions ) )
            // InternalArdsl.g:10951:2: ( ruleCollisions )
            {
            // InternalArdsl.g:10951:2: ( ruleCollisions )
            // InternalArdsl.g:10952:3: ruleCollisions
            {
             before(grammarAccess.getGameloopAccess().getCollisionsCollisionsParserRuleCall_15_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollisions();

            state._fsp--;

             after(grammarAccess.getGameloopAccess().getCollisionsCollisionsParserRuleCall_15_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__CollisionsAssignment_15_3_1"


    // $ANTLR start "rule__Gameloop__GamepadAssignment_16_2"
    // InternalArdsl.g:10961:1: rule__Gameloop__GamepadAssignment_16_2 : ( ruleGamePad ) ;
    public final void rule__Gameloop__GamepadAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10965:1: ( ( ruleGamePad ) )
            // InternalArdsl.g:10966:2: ( ruleGamePad )
            {
            // InternalArdsl.g:10966:2: ( ruleGamePad )
            // InternalArdsl.g:10967:3: ruleGamePad
            {
             before(grammarAccess.getGameloopAccess().getGamepadGamePadParserRuleCall_16_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGamePad();

            state._fsp--;

             after(grammarAccess.getGameloopAccess().getGamepadGamePadParserRuleCall_16_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__GamepadAssignment_16_2"


    // $ANTLR start "rule__Gameloop__ObjInitAssignment_17_2"
    // InternalArdsl.g:10976:1: rule__Gameloop__ObjInitAssignment_17_2 : ( ruleObjInit ) ;
    public final void rule__Gameloop__ObjInitAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10980:1: ( ( ruleObjInit ) )
            // InternalArdsl.g:10981:2: ( ruleObjInit )
            {
            // InternalArdsl.g:10981:2: ( ruleObjInit )
            // InternalArdsl.g:10982:3: ruleObjInit
            {
             before(grammarAccess.getGameloopAccess().getObjInitObjInitParserRuleCall_17_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjInit();

            state._fsp--;

             after(grammarAccess.getGameloopAccess().getObjInitObjInitParserRuleCall_17_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__ObjInitAssignment_17_2"


    // $ANTLR start "rule__Gameloop__ObjInitAssignment_17_3_1"
    // InternalArdsl.g:10991:1: rule__Gameloop__ObjInitAssignment_17_3_1 : ( ruleObjInit ) ;
    public final void rule__Gameloop__ObjInitAssignment_17_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:10995:1: ( ( ruleObjInit ) )
            // InternalArdsl.g:10996:2: ( ruleObjInit )
            {
            // InternalArdsl.g:10996:2: ( ruleObjInit )
            // InternalArdsl.g:10997:3: ruleObjInit
            {
             before(grammarAccess.getGameloopAccess().getObjInitObjInitParserRuleCall_17_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjInit();

            state._fsp--;

             after(grammarAccess.getGameloopAccess().getObjInitObjInitParserRuleCall_17_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameloop__ObjInitAssignment_17_3_1"


    // $ANTLR start "rule__Score__StartAssignment_1"
    // InternalArdsl.g:11006:1: rule__Score__StartAssignment_1 : ( ruleEInt ) ;
    public final void rule__Score__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11010:1: ( ( ruleEInt ) )
            // InternalArdsl.g:11011:2: ( ruleEInt )
            {
            // InternalArdsl.g:11011:2: ( ruleEInt )
            // InternalArdsl.g:11012:3: ruleEInt
            {
             before(grammarAccess.getScoreAccess().getStartEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getScoreAccess().getStartEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__StartAssignment_1"


    // $ANTLR start "rule__Score__FinishAssignment_3"
    // InternalArdsl.g:11021:1: rule__Score__FinishAssignment_3 : ( ruleEInt ) ;
    public final void rule__Score__FinishAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11025:1: ( ( ruleEInt ) )
            // InternalArdsl.g:11026:2: ( ruleEInt )
            {
            // InternalArdsl.g:11026:2: ( ruleEInt )
            // InternalArdsl.g:11027:3: ruleEInt
            {
             before(grammarAccess.getScoreAccess().getFinishEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getScoreAccess().getFinishEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__FinishAssignment_3"


    // $ANTLR start "rule__Score__LivesAssignment_5"
    // InternalArdsl.g:11036:1: rule__Score__LivesAssignment_5 : ( ruleEInt ) ;
    public final void rule__Score__LivesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11040:1: ( ( ruleEInt ) )
            // InternalArdsl.g:11041:2: ( ruleEInt )
            {
            // InternalArdsl.g:11041:2: ( ruleEInt )
            // InternalArdsl.g:11042:3: ruleEInt
            {
             before(grammarAccess.getScoreAccess().getLivesEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getScoreAccess().getLivesEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__LivesAssignment_5"


    // $ANTLR start "rule__Actions__NameAssignment_0"
    // InternalArdsl.g:11051:1: rule__Actions__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Actions__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11055:1: ( ( ruleEString ) )
            // InternalArdsl.g:11056:2: ( ruleEString )
            {
            // InternalArdsl.g:11056:2: ( ruleEString )
            // InternalArdsl.g:11057:3: ruleEString
            {
             before(grammarAccess.getActionsAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionsAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__NameAssignment_0"


    // $ANTLR start "rule__Actions__ActionAssignment_2_1"
    // InternalArdsl.g:11066:1: rule__Actions__ActionAssignment_2_1 : ( ruleBasicActions ) ;
    public final void rule__Actions__ActionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11070:1: ( ( ruleBasicActions ) )
            // InternalArdsl.g:11071:2: ( ruleBasicActions )
            {
            // InternalArdsl.g:11071:2: ( ruleBasicActions )
            // InternalArdsl.g:11072:3: ruleBasicActions
            {
             before(grammarAccess.getActionsAccess().getActionBasicActionsEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicActions();

            state._fsp--;

             after(grammarAccess.getActionsAccess().getActionBasicActionsEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__ActionAssignment_2_1"


    // $ANTLR start "rule__Actions__MessageAssignment_3_1"
    // InternalArdsl.g:11081:1: rule__Actions__MessageAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Actions__MessageAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11085:1: ( ( ruleEString ) )
            // InternalArdsl.g:11086:2: ( ruleEString )
            {
            // InternalArdsl.g:11086:2: ( ruleEString )
            // InternalArdsl.g:11087:3: ruleEString
            {
             before(grammarAccess.getActionsAccess().getMessageEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionsAccess().getMessageEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__MessageAssignment_3_1"


    // $ANTLR start "rule__Actions__ScoreChangeAssignment_4_1"
    // InternalArdsl.g:11096:1: rule__Actions__ScoreChangeAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Actions__ScoreChangeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11100:1: ( ( ruleEInt ) )
            // InternalArdsl.g:11101:2: ( ruleEInt )
            {
            // InternalArdsl.g:11101:2: ( ruleEInt )
            // InternalArdsl.g:11102:3: ruleEInt
            {
             before(grammarAccess.getActionsAccess().getScoreChangeEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getActionsAccess().getScoreChangeEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__ScoreChangeAssignment_4_1"


    // $ANTLR start "rule__Actions__TimeTriggerAssignment_5_1"
    // InternalArdsl.g:11111:1: rule__Actions__TimeTriggerAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Actions__TimeTriggerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11115:1: ( ( ruleEInt ) )
            // InternalArdsl.g:11116:2: ( ruleEInt )
            {
            // InternalArdsl.g:11116:2: ( ruleEInt )
            // InternalArdsl.g:11117:3: ruleEInt
            {
             before(grammarAccess.getActionsAccess().getTimeTriggerEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getActionsAccess().getTimeTriggerEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__TimeTriggerAssignment_5_1"


    // $ANTLR start "rule__Actions__PhysicChangesAssignment_6_2"
    // InternalArdsl.g:11126:1: rule__Actions__PhysicChangesAssignment_6_2 : ( rulePhysicChanges ) ;
    public final void rule__Actions__PhysicChangesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11130:1: ( ( rulePhysicChanges ) )
            // InternalArdsl.g:11131:2: ( rulePhysicChanges )
            {
            // InternalArdsl.g:11131:2: ( rulePhysicChanges )
            // InternalArdsl.g:11132:3: rulePhysicChanges
            {
             before(grammarAccess.getActionsAccess().getPhysicChangesPhysicChangesParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhysicChanges();

            state._fsp--;

             after(grammarAccess.getActionsAccess().getPhysicChangesPhysicChangesParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__PhysicChangesAssignment_6_2"


    // $ANTLR start "rule__Actions__PhysicChangesAssignment_6_3_1"
    // InternalArdsl.g:11141:1: rule__Actions__PhysicChangesAssignment_6_3_1 : ( rulePhysicChanges ) ;
    public final void rule__Actions__PhysicChangesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11145:1: ( ( rulePhysicChanges ) )
            // InternalArdsl.g:11146:2: ( rulePhysicChanges )
            {
            // InternalArdsl.g:11146:2: ( rulePhysicChanges )
            // InternalArdsl.g:11147:3: rulePhysicChanges
            {
             before(grammarAccess.getActionsAccess().getPhysicChangesPhysicChangesParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhysicChanges();

            state._fsp--;

             after(grammarAccess.getActionsAccess().getPhysicChangesPhysicChangesParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__PhysicChangesAssignment_6_3_1"


    // $ANTLR start "rule__Collisions__ClassAAssignment_1"
    // InternalArdsl.g:11156:1: rule__Collisions__ClassAAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Collisions__ClassAAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11160:1: ( ( ( ruleEString ) ) )
            // InternalArdsl.g:11161:2: ( ( ruleEString ) )
            {
            // InternalArdsl.g:11161:2: ( ( ruleEString ) )
            // InternalArdsl.g:11162:3: ( ruleEString )
            {
             before(grammarAccess.getCollisionsAccess().getClassAClassCrossReference_1_0()); 
            // InternalArdsl.g:11163:3: ( ruleEString )
            // InternalArdsl.g:11164:4: ruleEString
            {
             before(grammarAccess.getCollisionsAccess().getClassAClassEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCollisionsAccess().getClassAClassEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCollisionsAccess().getClassAClassCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collisions__ClassAAssignment_1"


    // $ANTLR start "rule__Collisions__ClassBAssignment_3"
    // InternalArdsl.g:11175:1: rule__Collisions__ClassBAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Collisions__ClassBAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11179:1: ( ( ( ruleEString ) ) )
            // InternalArdsl.g:11180:2: ( ( ruleEString ) )
            {
            // InternalArdsl.g:11180:2: ( ( ruleEString ) )
            // InternalArdsl.g:11181:3: ( ruleEString )
            {
             before(grammarAccess.getCollisionsAccess().getClassBClassCrossReference_3_0()); 
            // InternalArdsl.g:11182:3: ( ruleEString )
            // InternalArdsl.g:11183:4: ruleEString
            {
             before(grammarAccess.getCollisionsAccess().getClassBClassEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCollisionsAccess().getClassBClassEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCollisionsAccess().getClassBClassCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collisions__ClassBAssignment_3"


    // $ANTLR start "rule__Collisions__ActionAssignment_5"
    // InternalArdsl.g:11194:1: rule__Collisions__ActionAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Collisions__ActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11198:1: ( ( ( ruleEString ) ) )
            // InternalArdsl.g:11199:2: ( ( ruleEString ) )
            {
            // InternalArdsl.g:11199:2: ( ( ruleEString ) )
            // InternalArdsl.g:11200:3: ( ruleEString )
            {
             before(grammarAccess.getCollisionsAccess().getActionTriggerCrossReference_5_0()); 
            // InternalArdsl.g:11201:3: ( ruleEString )
            // InternalArdsl.g:11202:4: ruleEString
            {
             before(grammarAccess.getCollisionsAccess().getActionTriggerEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCollisionsAccess().getActionTriggerEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCollisionsAccess().getActionTriggerCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collisions__ActionAssignment_5"


    // $ANTLR start "rule__PhysicChanges__ActionAssignment_1"
    // InternalArdsl.g:11213:1: rule__PhysicChanges__ActionAssignment_1 : ( ruleAction ) ;
    public final void rule__PhysicChanges__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11217:1: ( ( ruleAction ) )
            // InternalArdsl.g:11218:2: ( ruleAction )
            {
            // InternalArdsl.g:11218:2: ( ruleAction )
            // InternalArdsl.g:11219:3: ruleAction
            {
             before(grammarAccess.getPhysicChangesAccess().getActionActionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getPhysicChangesAccess().getActionActionEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__ActionAssignment_1"


    // $ANTLR start "rule__PhysicChanges__ClassAssignment_3"
    // InternalArdsl.g:11228:1: rule__PhysicChanges__ClassAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__PhysicChanges__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11232:1: ( ( ( ruleEString ) ) )
            // InternalArdsl.g:11233:2: ( ( ruleEString ) )
            {
            // InternalArdsl.g:11233:2: ( ( ruleEString ) )
            // InternalArdsl.g:11234:3: ( ruleEString )
            {
             before(grammarAccess.getPhysicChangesAccess().getClassClassCrossReference_3_0()); 
            // InternalArdsl.g:11235:3: ( ruleEString )
            // InternalArdsl.g:11236:4: ruleEString
            {
             before(grammarAccess.getPhysicChangesAccess().getClassClassEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPhysicChangesAccess().getClassClassEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPhysicChangesAccess().getClassClassCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__ClassAssignment_3"


    // $ANTLR start "rule__PhysicChanges__ObjectAssignment_5"
    // InternalArdsl.g:11247:1: rule__PhysicChanges__ObjectAssignment_5 : ( ruleEString ) ;
    public final void rule__PhysicChanges__ObjectAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11251:1: ( ( ruleEString ) )
            // InternalArdsl.g:11252:2: ( ruleEString )
            {
            // InternalArdsl.g:11252:2: ( ruleEString )
            // InternalArdsl.g:11253:3: ruleEString
            {
             before(grammarAccess.getPhysicChangesAccess().getObjectEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPhysicChangesAccess().getObjectEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__ObjectAssignment_5"


    // $ANTLR start "rule__PhysicChanges__PositionAssignment_6_1"
    // InternalArdsl.g:11262:1: rule__PhysicChanges__PositionAssignment_6_1 : ( rulePosition ) ;
    public final void rule__PhysicChanges__PositionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11266:1: ( ( rulePosition ) )
            // InternalArdsl.g:11267:2: ( rulePosition )
            {
            // InternalArdsl.g:11267:2: ( rulePosition )
            // InternalArdsl.g:11268:3: rulePosition
            {
             before(grammarAccess.getPhysicChangesAccess().getPositionPositionEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPhysicChangesAccess().getPositionPositionEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__PositionAssignment_6_1"


    // $ANTLR start "rule__PhysicChanges__ScaleAssignment_7_1"
    // InternalArdsl.g:11277:1: rule__PhysicChanges__ScaleAssignment_7_1 : ( ruleEDouble ) ;
    public final void rule__PhysicChanges__ScaleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11281:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:11282:2: ( ruleEDouble )
            {
            // InternalArdsl.g:11282:2: ( ruleEDouble )
            // InternalArdsl.g:11283:3: ruleEDouble
            {
             before(grammarAccess.getPhysicChangesAccess().getScaleEDoubleParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPhysicChangesAccess().getScaleEDoubleParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__ScaleAssignment_7_1"


    // $ANTLR start "rule__PhysicChanges__AttributeAssignment_8_1"
    // InternalArdsl.g:11292:1: rule__PhysicChanges__AttributeAssignment_8_1 : ( ruleEString ) ;
    public final void rule__PhysicChanges__AttributeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11296:1: ( ( ruleEString ) )
            // InternalArdsl.g:11297:2: ( ruleEString )
            {
            // InternalArdsl.g:11297:2: ( ruleEString )
            // InternalArdsl.g:11298:3: ruleEString
            {
             before(grammarAccess.getPhysicChangesAccess().getAttributeEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPhysicChangesAccess().getAttributeEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__AttributeAssignment_8_1"


    // $ANTLR start "rule__PhysicChanges__ChangeValueAssignment_9_1"
    // InternalArdsl.g:11307:1: rule__PhysicChanges__ChangeValueAssignment_9_1 : ( ruleEInt ) ;
    public final void rule__PhysicChanges__ChangeValueAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11311:1: ( ( ruleEInt ) )
            // InternalArdsl.g:11312:2: ( ruleEInt )
            {
            // InternalArdsl.g:11312:2: ( ruleEInt )
            // InternalArdsl.g:11313:3: ruleEInt
            {
             before(grammarAccess.getPhysicChangesAccess().getChangeValueEIntParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPhysicChangesAccess().getChangeValueEIntParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__ChangeValueAssignment_9_1"


    // $ANTLR start "rule__PhysicChanges__ForceAssignment_10_1"
    // InternalArdsl.g:11322:1: rule__PhysicChanges__ForceAssignment_10_1 : ( ( ruleEString ) ) ;
    public final void rule__PhysicChanges__ForceAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11326:1: ( ( ( ruleEString ) ) )
            // InternalArdsl.g:11327:2: ( ( ruleEString ) )
            {
            // InternalArdsl.g:11327:2: ( ( ruleEString ) )
            // InternalArdsl.g:11328:3: ( ruleEString )
            {
             before(grammarAccess.getPhysicChangesAccess().getForceForceCrossReference_10_1_0()); 
            // InternalArdsl.g:11329:3: ( ruleEString )
            // InternalArdsl.g:11330:4: ruleEString
            {
             before(grammarAccess.getPhysicChangesAccess().getForceForceEStringParserRuleCall_10_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPhysicChangesAccess().getForceForceEStringParserRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getPhysicChangesAccess().getForceForceCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhysicChanges__ForceAssignment_10_1"


    // $ANTLR start "rule__GamePad__NameAssignment_0"
    // InternalArdsl.g:11341:1: rule__GamePad__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__GamePad__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11345:1: ( ( ruleEString ) )
            // InternalArdsl.g:11346:2: ( ruleEString )
            {
            // InternalArdsl.g:11346:2: ( ruleEString )
            // InternalArdsl.g:11347:3: ruleEString
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
    // InternalArdsl.g:11356:1: rule__GamePad__TriggerAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__GamePad__TriggerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11360:1: ( ( ( ruleEString ) ) )
            // InternalArdsl.g:11361:2: ( ( ruleEString ) )
            {
            // InternalArdsl.g:11361:2: ( ( ruleEString ) )
            // InternalArdsl.g:11362:3: ( ruleEString )
            {
             before(grammarAccess.getGamePadAccess().getTriggerTriggerCrossReference_2_0()); 
            // InternalArdsl.g:11363:3: ( ruleEString )
            // InternalArdsl.g:11364:4: ruleEString
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


    // $ANTLR start "rule__ObjInit__NameAssignment_0"
    // InternalArdsl.g:11375:1: rule__ObjInit__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ObjInit__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11379:1: ( ( ruleEString ) )
            // InternalArdsl.g:11380:2: ( ruleEString )
            {
            // InternalArdsl.g:11380:2: ( ruleEString )
            // InternalArdsl.g:11381:3: ruleEString
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


    // $ANTLR start "rule__ObjInit__ClassAssignment_1"
    // InternalArdsl.g:11390:1: rule__ObjInit__ClassAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__ObjInit__ClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11394:1: ( ( ( ruleEString ) ) )
            // InternalArdsl.g:11395:2: ( ( ruleEString ) )
            {
            // InternalArdsl.g:11395:2: ( ( ruleEString ) )
            // InternalArdsl.g:11396:3: ( ruleEString )
            {
             before(grammarAccess.getObjInitAccess().getClassClassCrossReference_1_0()); 
            // InternalArdsl.g:11397:3: ( ruleEString )
            // InternalArdsl.g:11398:4: ruleEString
            {
             before(grammarAccess.getObjInitAccess().getClassClassEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getObjInitAccess().getClassClassEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getObjInitAccess().getClassClassCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjInit__ClassAssignment_1"


    // $ANTLR start "rule__ObjInit__PosXAssignment_3"
    // InternalArdsl.g:11409:1: rule__ObjInit__PosXAssignment_3 : ( ruleEDouble ) ;
    public final void rule__ObjInit__PosXAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11413:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:11414:2: ( ruleEDouble )
            {
            // InternalArdsl.g:11414:2: ( ruleEDouble )
            // InternalArdsl.g:11415:3: ruleEDouble
            {
             before(grammarAccess.getObjInitAccess().getPosXEDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getObjInitAccess().getPosXEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjInit__PosXAssignment_3"


    // $ANTLR start "rule__ObjInit__PosYAssignment_5"
    // InternalArdsl.g:11424:1: rule__ObjInit__PosYAssignment_5 : ( ruleEDouble ) ;
    public final void rule__ObjInit__PosYAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11428:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:11429:2: ( ruleEDouble )
            {
            // InternalArdsl.g:11429:2: ( ruleEDouble )
            // InternalArdsl.g:11430:3: ruleEDouble
            {
             before(grammarAccess.getObjInitAccess().getPosYEDoubleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getObjInitAccess().getPosYEDoubleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjInit__PosYAssignment_5"


    // $ANTLR start "rule__ObjInit__PosZAssignment_7"
    // InternalArdsl.g:11439:1: rule__ObjInit__PosZAssignment_7 : ( ruleEDouble ) ;
    public final void rule__ObjInit__PosZAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11443:1: ( ( ruleEDouble ) )
            // InternalArdsl.g:11444:2: ( ruleEDouble )
            {
            // InternalArdsl.g:11444:2: ( ruleEDouble )
            // InternalArdsl.g:11445:3: ruleEDouble
            {
             before(grammarAccess.getObjInitAccess().getPosZEDoubleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getObjInitAccess().getPosZEDoubleParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjInit__PosZAssignment_7"


    // $ANTLR start "rule__ObjInit__RulesAssignment_9_2"
    // InternalArdsl.g:11454:1: rule__ObjInit__RulesAssignment_9_2 : ( ruleRule ) ;
    public final void rule__ObjInit__RulesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11458:1: ( ( ruleRule ) )
            // InternalArdsl.g:11459:2: ( ruleRule )
            {
            // InternalArdsl.g:11459:2: ( ruleRule )
            // InternalArdsl.g:11460:3: ruleRule
            {
             before(grammarAccess.getObjInitAccess().getRulesRuleParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getObjInitAccess().getRulesRuleParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjInit__RulesAssignment_9_2"


    // $ANTLR start "rule__ObjInit__RulesAssignment_9_3_1"
    // InternalArdsl.g:11469:1: rule__ObjInit__RulesAssignment_9_3_1 : ( ruleRule ) ;
    public final void rule__ObjInit__RulesAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11473:1: ( ( ruleRule ) )
            // InternalArdsl.g:11474:2: ( ruleRule )
            {
            // InternalArdsl.g:11474:2: ( ruleRule )
            // InternalArdsl.g:11475:3: ruleRule
            {
             before(grammarAccess.getObjInitAccess().getRulesRuleParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getObjInitAccess().getRulesRuleParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjInit__RulesAssignment_9_3_1"


    // $ANTLR start "rule__Rule__ActionAssignment_1"
    // InternalArdsl.g:11484:1: rule__Rule__ActionAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Rule__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11488:1: ( ( ( ruleEString ) ) )
            // InternalArdsl.g:11489:2: ( ( ruleEString ) )
            {
            // InternalArdsl.g:11489:2: ( ( ruleEString ) )
            // InternalArdsl.g:11490:3: ( ruleEString )
            {
             before(grammarAccess.getRuleAccess().getActionTriggerCrossReference_1_0()); 
            // InternalArdsl.g:11491:3: ( ruleEString )
            // InternalArdsl.g:11492:4: ruleEString
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
    // InternalArdsl.g:11503:1: rule__Rule__ConditionAssignment_3 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11507:1: ( ( ruleCondition ) )
            // InternalArdsl.g:11508:2: ( ruleCondition )
            {
            // InternalArdsl.g:11508:2: ( ruleCondition )
            // InternalArdsl.g:11509:3: ruleCondition
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


    // $ANTLR start "rule__Arithmetic__LeftAssignment_0"
    // InternalArdsl.g:11518:1: rule__Arithmetic__LeftAssignment_0 : ( ruleValue ) ;
    public final void rule__Arithmetic__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11522:1: ( ( ruleValue ) )
            // InternalArdsl.g:11523:2: ( ruleValue )
            {
            // InternalArdsl.g:11523:2: ( ruleValue )
            // InternalArdsl.g:11524:3: ruleValue
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
    // InternalArdsl.g:11533:1: rule__Arithmetic__OpAssignment_1 : ( ruleArithmOps ) ;
    public final void rule__Arithmetic__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11537:1: ( ( ruleArithmOps ) )
            // InternalArdsl.g:11538:2: ( ruleArithmOps )
            {
            // InternalArdsl.g:11538:2: ( ruleArithmOps )
            // InternalArdsl.g:11539:3: ruleArithmOps
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
    // InternalArdsl.g:11548:1: rule__Arithmetic__RightAssignment_2 : ( ruleValue ) ;
    public final void rule__Arithmetic__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11552:1: ( ( ruleValue ) )
            // InternalArdsl.g:11553:2: ( ruleValue )
            {
            // InternalArdsl.g:11553:2: ( ruleValue )
            // InternalArdsl.g:11554:3: ruleValue
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


    // $ANTLR start "rule__Not__LeftAssignment_1"
    // InternalArdsl.g:11563:1: rule__Not__LeftAssignment_1 : ( ruleCondition ) ;
    public final void rule__Not__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11567:1: ( ( ruleCondition ) )
            // InternalArdsl.g:11568:2: ( ruleCondition )
            {
            // InternalArdsl.g:11568:2: ( ruleCondition )
            // InternalArdsl.g:11569:3: ruleCondition
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
    // InternalArdsl.g:11578:1: rule__Binary__LeftAssignment_1 : ( ruleCondition ) ;
    public final void rule__Binary__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11582:1: ( ( ruleCondition ) )
            // InternalArdsl.g:11583:2: ( ruleCondition )
            {
            // InternalArdsl.g:11583:2: ( ruleCondition )
            // InternalArdsl.g:11584:3: ruleCondition
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
    // InternalArdsl.g:11593:1: rule__Binary__OpAssignment_3 : ( ruleLogicOps ) ;
    public final void rule__Binary__OpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11597:1: ( ( ruleLogicOps ) )
            // InternalArdsl.g:11598:2: ( ruleLogicOps )
            {
            // InternalArdsl.g:11598:2: ( ruleLogicOps )
            // InternalArdsl.g:11599:3: ruleLogicOps
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
    // InternalArdsl.g:11608:1: rule__Binary__RightAssignment_5 : ( ruleCondition ) ;
    public final void rule__Binary__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11612:1: ( ( ruleCondition ) )
            // InternalArdsl.g:11613:2: ( ruleCondition )
            {
            // InternalArdsl.g:11613:2: ( ruleCondition )
            // InternalArdsl.g:11614:3: ruleCondition
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


    // $ANTLR start "rule__AttributeValue__ClassAssignment_0"
    // InternalArdsl.g:11623:1: rule__AttributeValue__ClassAssignment_0 : ( ruleEString ) ;
    public final void rule__AttributeValue__ClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11627:1: ( ( ruleEString ) )
            // InternalArdsl.g:11628:2: ( ruleEString )
            {
            // InternalArdsl.g:11628:2: ( ruleEString )
            // InternalArdsl.g:11629:3: ruleEString
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
    // InternalArdsl.g:11638:1: rule__AttributeValue__AttributeAssignment_2 : ( ruleEString ) ;
    public final void rule__AttributeValue__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11642:1: ( ( ruleEString ) )
            // InternalArdsl.g:11643:2: ( ruleEString )
            {
            // InternalArdsl.g:11643:2: ( ruleEString )
            // InternalArdsl.g:11644:3: ruleEString
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
    // InternalArdsl.g:11653:1: rule__ConstantValue__ValueAssignment : ( ruleEString ) ;
    public final void rule__ConstantValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11657:1: ( ( ruleEString ) )
            // InternalArdsl.g:11658:2: ( ruleEString )
            {
            // InternalArdsl.g:11658:2: ( ruleEString )
            // InternalArdsl.g:11659:3: ruleEString
            {
             before(grammarAccess.getConstantValueAccess().getValueEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConstantValueAccess().getValueEStringParserRuleCall_0()); 

            }


            }

        }
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
    // InternalArdsl.g:11668:1: rule__AllInstances__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__AllInstances__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:11672:1: ( ( ruleEString ) )
            // InternalArdsl.g:11673:2: ( ruleEString )
            {
            // InternalArdsl.g:11673:2: ( ruleEString )
            // InternalArdsl.g:11674:3: ruleEString
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000084000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000E00000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000060000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000010000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000004000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000004000000000L,0x0000000007810000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000001F00000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000030L,0x0000070000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000040000000000L});

}