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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'{'", "'elements'", "'}'", "'URI'", "','", "'dependences'", "':'", "'['", "']'", "'='", "'Dependence'", "'min'", "'max'", "'target'", "'containtment'", "'opposite'", "'abstract'", "'invisible'", "'isParam'", "'isKey'", "'readOnly'"
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


    // $ANTLR start "entryRuleClass"
    // InternalArdsl.g:103:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalArdsl.g:104:1: ( ruleClass EOF )
            // InternalArdsl.g:105:1: ruleClass EOF
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
    // InternalArdsl.g:112:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:116:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalArdsl.g:117:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalArdsl.g:117:2: ( ( rule__Class__Group__0 ) )
            // InternalArdsl.g:118:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalArdsl.g:119:3: ( rule__Class__Group__0 )
            // InternalArdsl.g:119:4: rule__Class__Group__0
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
    // InternalArdsl.g:128:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalArdsl.g:129:1: ( ruleAttribute EOF )
            // InternalArdsl.g:130:1: ruleAttribute EOF
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
    // InternalArdsl.g:137:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:141:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalArdsl.g:142:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalArdsl.g:142:2: ( ( rule__Attribute__Group__0 ) )
            // InternalArdsl.g:143:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalArdsl.g:144:3: ( rule__Attribute__Group__0 )
            // InternalArdsl.g:144:4: rule__Attribute__Group__0
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
    // InternalArdsl.g:153:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalArdsl.g:154:1: ( ruleReference EOF )
            // InternalArdsl.g:155:1: ruleReference EOF
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
    // InternalArdsl.g:162:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:166:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalArdsl.g:167:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalArdsl.g:167:2: ( ( rule__Reference__Group__0 ) )
            // InternalArdsl.g:168:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalArdsl.g:169:3: ( rule__Reference__Group__0 )
            // InternalArdsl.g:169:4: rule__Reference__Group__0
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalArdsl.g:177:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:181:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalArdsl.g:182:2: ( RULE_STRING )
                    {
                    // InternalArdsl.g:182:2: ( RULE_STRING )
                    // InternalArdsl.g:183:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArdsl.g:188:2: ( RULE_ID )
                    {
                    // InternalArdsl.g:188:2: ( RULE_ID )
                    // InternalArdsl.g:189:3: RULE_ID
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


    // $ANTLR start "rule__Ontological__Group__0"
    // InternalArdsl.g:198:1: rule__Ontological__Group__0 : rule__Ontological__Group__0__Impl rule__Ontological__Group__1 ;
    public final void rule__Ontological__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:202:1: ( rule__Ontological__Group__0__Impl rule__Ontological__Group__1 )
            // InternalArdsl.g:203:2: rule__Ontological__Group__0__Impl rule__Ontological__Group__1
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
    // InternalArdsl.g:210:1: rule__Ontological__Group__0__Impl : ( 'Game' ) ;
    public final void rule__Ontological__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:214:1: ( ( 'Game' ) )
            // InternalArdsl.g:215:1: ( 'Game' )
            {
            // InternalArdsl.g:215:1: ( 'Game' )
            // InternalArdsl.g:216:2: 'Game'
            {
             before(grammarAccess.getOntologicalAccess().getGameKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalArdsl.g:225:1: rule__Ontological__Group__1 : rule__Ontological__Group__1__Impl rule__Ontological__Group__2 ;
    public final void rule__Ontological__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:229:1: ( rule__Ontological__Group__1__Impl rule__Ontological__Group__2 )
            // InternalArdsl.g:230:2: rule__Ontological__Group__1__Impl rule__Ontological__Group__2
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
    // InternalArdsl.g:237:1: rule__Ontological__Group__1__Impl : ( ( rule__Ontological__NameAssignment_1 ) ) ;
    public final void rule__Ontological__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:241:1: ( ( ( rule__Ontological__NameAssignment_1 ) ) )
            // InternalArdsl.g:242:1: ( ( rule__Ontological__NameAssignment_1 ) )
            {
            // InternalArdsl.g:242:1: ( ( rule__Ontological__NameAssignment_1 ) )
            // InternalArdsl.g:243:2: ( rule__Ontological__NameAssignment_1 )
            {
             before(grammarAccess.getOntologicalAccess().getNameAssignment_1()); 
            // InternalArdsl.g:244:2: ( rule__Ontological__NameAssignment_1 )
            // InternalArdsl.g:244:3: rule__Ontological__NameAssignment_1
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
    // InternalArdsl.g:252:1: rule__Ontological__Group__2 : rule__Ontological__Group__2__Impl rule__Ontological__Group__3 ;
    public final void rule__Ontological__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:256:1: ( rule__Ontological__Group__2__Impl rule__Ontological__Group__3 )
            // InternalArdsl.g:257:2: rule__Ontological__Group__2__Impl rule__Ontological__Group__3
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
    // InternalArdsl.g:264:1: rule__Ontological__Group__2__Impl : ( '{' ) ;
    public final void rule__Ontological__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:268:1: ( ( '{' ) )
            // InternalArdsl.g:269:1: ( '{' )
            {
            // InternalArdsl.g:269:1: ( '{' )
            // InternalArdsl.g:270:2: '{'
            {
             before(grammarAccess.getOntologicalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalArdsl.g:279:1: rule__Ontological__Group__3 : rule__Ontological__Group__3__Impl rule__Ontological__Group__4 ;
    public final void rule__Ontological__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:283:1: ( rule__Ontological__Group__3__Impl rule__Ontological__Group__4 )
            // InternalArdsl.g:284:2: rule__Ontological__Group__3__Impl rule__Ontological__Group__4
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
    // InternalArdsl.g:291:1: rule__Ontological__Group__3__Impl : ( ( rule__Ontological__Group_3__0 )? ) ;
    public final void rule__Ontological__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:295:1: ( ( ( rule__Ontological__Group_3__0 )? ) )
            // InternalArdsl.g:296:1: ( ( rule__Ontological__Group_3__0 )? )
            {
            // InternalArdsl.g:296:1: ( ( rule__Ontological__Group_3__0 )? )
            // InternalArdsl.g:297:2: ( rule__Ontological__Group_3__0 )?
            {
             before(grammarAccess.getOntologicalAccess().getGroup_3()); 
            // InternalArdsl.g:298:2: ( rule__Ontological__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalArdsl.g:298:3: rule__Ontological__Group_3__0
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
    // InternalArdsl.g:306:1: rule__Ontological__Group__4 : rule__Ontological__Group__4__Impl rule__Ontological__Group__5 ;
    public final void rule__Ontological__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:310:1: ( rule__Ontological__Group__4__Impl rule__Ontological__Group__5 )
            // InternalArdsl.g:311:2: rule__Ontological__Group__4__Impl rule__Ontological__Group__5
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
    // InternalArdsl.g:318:1: rule__Ontological__Group__4__Impl : ( 'elements' ) ;
    public final void rule__Ontological__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:322:1: ( ( 'elements' ) )
            // InternalArdsl.g:323:1: ( 'elements' )
            {
            // InternalArdsl.g:323:1: ( 'elements' )
            // InternalArdsl.g:324:2: 'elements'
            {
             before(grammarAccess.getOntologicalAccess().getElementsKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalArdsl.g:333:1: rule__Ontological__Group__5 : rule__Ontological__Group__5__Impl rule__Ontological__Group__6 ;
    public final void rule__Ontological__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:337:1: ( rule__Ontological__Group__5__Impl rule__Ontological__Group__6 )
            // InternalArdsl.g:338:2: rule__Ontological__Group__5__Impl rule__Ontological__Group__6
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
    // InternalArdsl.g:345:1: rule__Ontological__Group__5__Impl : ( '{' ) ;
    public final void rule__Ontological__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:349:1: ( ( '{' ) )
            // InternalArdsl.g:350:1: ( '{' )
            {
            // InternalArdsl.g:350:1: ( '{' )
            // InternalArdsl.g:351:2: '{'
            {
             before(grammarAccess.getOntologicalAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FOLLOW_2); 
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
    // InternalArdsl.g:360:1: rule__Ontological__Group__6 : rule__Ontological__Group__6__Impl rule__Ontological__Group__7 ;
    public final void rule__Ontological__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:364:1: ( rule__Ontological__Group__6__Impl rule__Ontological__Group__7 )
            // InternalArdsl.g:365:2: rule__Ontological__Group__6__Impl rule__Ontological__Group__7
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
    // InternalArdsl.g:372:1: rule__Ontological__Group__6__Impl : ( ( rule__Ontological__ClassesAssignment_6 ) ) ;
    public final void rule__Ontological__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:376:1: ( ( ( rule__Ontological__ClassesAssignment_6 ) ) )
            // InternalArdsl.g:377:1: ( ( rule__Ontological__ClassesAssignment_6 ) )
            {
            // InternalArdsl.g:377:1: ( ( rule__Ontological__ClassesAssignment_6 ) )
            // InternalArdsl.g:378:2: ( rule__Ontological__ClassesAssignment_6 )
            {
             before(grammarAccess.getOntologicalAccess().getClassesAssignment_6()); 
            // InternalArdsl.g:379:2: ( rule__Ontological__ClassesAssignment_6 )
            // InternalArdsl.g:379:3: rule__Ontological__ClassesAssignment_6
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
    // InternalArdsl.g:387:1: rule__Ontological__Group__7 : rule__Ontological__Group__7__Impl rule__Ontological__Group__8 ;
    public final void rule__Ontological__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:391:1: ( rule__Ontological__Group__7__Impl rule__Ontological__Group__8 )
            // InternalArdsl.g:392:2: rule__Ontological__Group__7__Impl rule__Ontological__Group__8
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
    // InternalArdsl.g:399:1: rule__Ontological__Group__7__Impl : ( ( rule__Ontological__Group_7__0 )* ) ;
    public final void rule__Ontological__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:403:1: ( ( ( rule__Ontological__Group_7__0 )* ) )
            // InternalArdsl.g:404:1: ( ( rule__Ontological__Group_7__0 )* )
            {
            // InternalArdsl.g:404:1: ( ( rule__Ontological__Group_7__0 )* )
            // InternalArdsl.g:405:2: ( rule__Ontological__Group_7__0 )*
            {
             before(grammarAccess.getOntologicalAccess().getGroup_7()); 
            // InternalArdsl.g:406:2: ( rule__Ontological__Group_7__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalArdsl.g:406:3: rule__Ontological__Group_7__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Ontological__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalArdsl.g:414:1: rule__Ontological__Group__8 : rule__Ontological__Group__8__Impl rule__Ontological__Group__9 ;
    public final void rule__Ontological__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:418:1: ( rule__Ontological__Group__8__Impl rule__Ontological__Group__9 )
            // InternalArdsl.g:419:2: rule__Ontological__Group__8__Impl rule__Ontological__Group__9
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
    // InternalArdsl.g:426:1: rule__Ontological__Group__8__Impl : ( '}' ) ;
    public final void rule__Ontological__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:430:1: ( ( '}' ) )
            // InternalArdsl.g:431:1: ( '}' )
            {
            // InternalArdsl.g:431:1: ( '}' )
            // InternalArdsl.g:432:2: '}'
            {
             before(grammarAccess.getOntologicalAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
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
    // InternalArdsl.g:441:1: rule__Ontological__Group__9 : rule__Ontological__Group__9__Impl ;
    public final void rule__Ontological__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:445:1: ( rule__Ontological__Group__9__Impl )
            // InternalArdsl.g:446:2: rule__Ontological__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ontological__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // InternalArdsl.g:452:1: rule__Ontological__Group__9__Impl : ( '}' ) ;
    public final void rule__Ontological__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:456:1: ( ( '}' ) )
            // InternalArdsl.g:457:1: ( '}' )
            {
            // InternalArdsl.g:457:1: ( '}' )
            // InternalArdsl.g:458:2: '}'
            {
             before(grammarAccess.getOntologicalAccess().getRightCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_2); 
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


    // $ANTLR start "rule__Ontological__Group_3__0"
    // InternalArdsl.g:468:1: rule__Ontological__Group_3__0 : rule__Ontological__Group_3__0__Impl rule__Ontological__Group_3__1 ;
    public final void rule__Ontological__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:472:1: ( rule__Ontological__Group_3__0__Impl rule__Ontological__Group_3__1 )
            // InternalArdsl.g:473:2: rule__Ontological__Group_3__0__Impl rule__Ontological__Group_3__1
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
    // InternalArdsl.g:480:1: rule__Ontological__Group_3__0__Impl : ( 'URI' ) ;
    public final void rule__Ontological__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:484:1: ( ( 'URI' ) )
            // InternalArdsl.g:485:1: ( 'URI' )
            {
            // InternalArdsl.g:485:1: ( 'URI' )
            // InternalArdsl.g:486:2: 'URI'
            {
             before(grammarAccess.getOntologicalAccess().getURIKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalArdsl.g:495:1: rule__Ontological__Group_3__1 : rule__Ontological__Group_3__1__Impl ;
    public final void rule__Ontological__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:499:1: ( rule__Ontological__Group_3__1__Impl )
            // InternalArdsl.g:500:2: rule__Ontological__Group_3__1__Impl
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
    // InternalArdsl.g:506:1: rule__Ontological__Group_3__1__Impl : ( ( rule__Ontological__URIAssignment_3_1 ) ) ;
    public final void rule__Ontological__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:510:1: ( ( ( rule__Ontological__URIAssignment_3_1 ) ) )
            // InternalArdsl.g:511:1: ( ( rule__Ontological__URIAssignment_3_1 ) )
            {
            // InternalArdsl.g:511:1: ( ( rule__Ontological__URIAssignment_3_1 ) )
            // InternalArdsl.g:512:2: ( rule__Ontological__URIAssignment_3_1 )
            {
             before(grammarAccess.getOntologicalAccess().getURIAssignment_3_1()); 
            // InternalArdsl.g:513:2: ( rule__Ontological__URIAssignment_3_1 )
            // InternalArdsl.g:513:3: rule__Ontological__URIAssignment_3_1
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
    // InternalArdsl.g:522:1: rule__Ontological__Group_7__0 : rule__Ontological__Group_7__0__Impl rule__Ontological__Group_7__1 ;
    public final void rule__Ontological__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:526:1: ( rule__Ontological__Group_7__0__Impl rule__Ontological__Group_7__1 )
            // InternalArdsl.g:527:2: rule__Ontological__Group_7__0__Impl rule__Ontological__Group_7__1
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
    // InternalArdsl.g:534:1: rule__Ontological__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Ontological__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:538:1: ( ( ',' ) )
            // InternalArdsl.g:539:1: ( ',' )
            {
            // InternalArdsl.g:539:1: ( ',' )
            // InternalArdsl.g:540:2: ','
            {
             before(grammarAccess.getOntologicalAccess().getCommaKeyword_7_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalArdsl.g:549:1: rule__Ontological__Group_7__1 : rule__Ontological__Group_7__1__Impl ;
    public final void rule__Ontological__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:553:1: ( rule__Ontological__Group_7__1__Impl )
            // InternalArdsl.g:554:2: rule__Ontological__Group_7__1__Impl
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
    // InternalArdsl.g:560:1: rule__Ontological__Group_7__1__Impl : ( ( rule__Ontological__ClassesAssignment_7_1 ) ) ;
    public final void rule__Ontological__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:564:1: ( ( ( rule__Ontological__ClassesAssignment_7_1 ) ) )
            // InternalArdsl.g:565:1: ( ( rule__Ontological__ClassesAssignment_7_1 ) )
            {
            // InternalArdsl.g:565:1: ( ( rule__Ontological__ClassesAssignment_7_1 ) )
            // InternalArdsl.g:566:2: ( rule__Ontological__ClassesAssignment_7_1 )
            {
             before(grammarAccess.getOntologicalAccess().getClassesAssignment_7_1()); 
            // InternalArdsl.g:567:2: ( rule__Ontological__ClassesAssignment_7_1 )
            // InternalArdsl.g:567:3: rule__Ontological__ClassesAssignment_7_1
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


    // $ANTLR start "rule__Class__Group__0"
    // InternalArdsl.g:576:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:580:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalArdsl.g:581:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalArdsl.g:588:1: rule__Class__Group__0__Impl : ( ( rule__Class__NameAssignment_0 ) ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:592:1: ( ( ( rule__Class__NameAssignment_0 ) ) )
            // InternalArdsl.g:593:1: ( ( rule__Class__NameAssignment_0 ) )
            {
            // InternalArdsl.g:593:1: ( ( rule__Class__NameAssignment_0 ) )
            // InternalArdsl.g:594:2: ( rule__Class__NameAssignment_0 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_0()); 
            // InternalArdsl.g:595:2: ( rule__Class__NameAssignment_0 )
            // InternalArdsl.g:595:3: rule__Class__NameAssignment_0
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
    // InternalArdsl.g:603:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:607:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalArdsl.g:608:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalArdsl.g:615:1: rule__Class__Group__1__Impl : ( '{' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:619:1: ( ( '{' ) )
            // InternalArdsl.g:620:1: ( '{' )
            {
            // InternalArdsl.g:620:1: ( '{' )
            // InternalArdsl.g:621:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalArdsl.g:630:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:634:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalArdsl.g:635:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalArdsl.g:642:1: rule__Class__Group__2__Impl : ( ( rule__Class__Group_2__0 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:646:1: ( ( ( rule__Class__Group_2__0 )? ) )
            // InternalArdsl.g:647:1: ( ( rule__Class__Group_2__0 )? )
            {
            // InternalArdsl.g:647:1: ( ( rule__Class__Group_2__0 )? )
            // InternalArdsl.g:648:2: ( rule__Class__Group_2__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_2()); 
            // InternalArdsl.g:649:2: ( rule__Class__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalArdsl.g:649:3: rule__Class__Group_2__0
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
    // InternalArdsl.g:657:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:661:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalArdsl.g:662:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalArdsl.g:669:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:673:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalArdsl.g:674:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalArdsl.g:674:1: ( ( rule__Class__Group_3__0 )? )
            // InternalArdsl.g:675:2: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalArdsl.g:676:2: ( rule__Class__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalArdsl.g:676:3: rule__Class__Group_3__0
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
    // InternalArdsl.g:684:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:688:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalArdsl.g:689:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalArdsl.g:696:1: rule__Class__Group__4__Impl : ( '}' ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:700:1: ( ( '}' ) )
            // InternalArdsl.g:701:1: ( '}' )
            {
            // InternalArdsl.g:701:1: ( '}' )
            // InternalArdsl.g:702:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalArdsl.g:711:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:715:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalArdsl.g:716:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalArdsl.g:723:1: rule__Class__Group__5__Impl : ( ( rule__Class__AbstractAssignment_5 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:727:1: ( ( ( rule__Class__AbstractAssignment_5 )? ) )
            // InternalArdsl.g:728:1: ( ( rule__Class__AbstractAssignment_5 )? )
            {
            // InternalArdsl.g:728:1: ( ( rule__Class__AbstractAssignment_5 )? )
            // InternalArdsl.g:729:2: ( rule__Class__AbstractAssignment_5 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_5()); 
            // InternalArdsl.g:730:2: ( rule__Class__AbstractAssignment_5 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalArdsl.g:730:3: rule__Class__AbstractAssignment_5
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
    // InternalArdsl.g:738:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:742:1: ( rule__Class__Group__6__Impl )
            // InternalArdsl.g:743:2: rule__Class__Group__6__Impl
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
    // InternalArdsl.g:749:1: rule__Class__Group__6__Impl : ( ( rule__Class__NoSCNAssignment_6 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:753:1: ( ( ( rule__Class__NoSCNAssignment_6 )? ) )
            // InternalArdsl.g:754:1: ( ( rule__Class__NoSCNAssignment_6 )? )
            {
            // InternalArdsl.g:754:1: ( ( rule__Class__NoSCNAssignment_6 )? )
            // InternalArdsl.g:755:2: ( rule__Class__NoSCNAssignment_6 )?
            {
             before(grammarAccess.getClassAccess().getNoSCNAssignment_6()); 
            // InternalArdsl.g:756:2: ( rule__Class__NoSCNAssignment_6 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalArdsl.g:756:3: rule__Class__NoSCNAssignment_6
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
    // InternalArdsl.g:765:1: rule__Class__Group_2__0 : rule__Class__Group_2__0__Impl rule__Class__Group_2__1 ;
    public final void rule__Class__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:769:1: ( rule__Class__Group_2__0__Impl rule__Class__Group_2__1 )
            // InternalArdsl.g:770:2: rule__Class__Group_2__0__Impl rule__Class__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalArdsl.g:777:1: rule__Class__Group_2__0__Impl : ( ( rule__Class__AttributesAssignment_2_0 ) ) ;
    public final void rule__Class__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:781:1: ( ( ( rule__Class__AttributesAssignment_2_0 ) ) )
            // InternalArdsl.g:782:1: ( ( rule__Class__AttributesAssignment_2_0 ) )
            {
            // InternalArdsl.g:782:1: ( ( rule__Class__AttributesAssignment_2_0 ) )
            // InternalArdsl.g:783:2: ( rule__Class__AttributesAssignment_2_0 )
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_2_0()); 
            // InternalArdsl.g:784:2: ( rule__Class__AttributesAssignment_2_0 )
            // InternalArdsl.g:784:3: rule__Class__AttributesAssignment_2_0
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
    // InternalArdsl.g:792:1: rule__Class__Group_2__1 : rule__Class__Group_2__1__Impl ;
    public final void rule__Class__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:796:1: ( rule__Class__Group_2__1__Impl )
            // InternalArdsl.g:797:2: rule__Class__Group_2__1__Impl
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
    // InternalArdsl.g:803:1: rule__Class__Group_2__1__Impl : ( ( rule__Class__Group_2_1__0 )* ) ;
    public final void rule__Class__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:807:1: ( ( ( rule__Class__Group_2_1__0 )* ) )
            // InternalArdsl.g:808:1: ( ( rule__Class__Group_2_1__0 )* )
            {
            // InternalArdsl.g:808:1: ( ( rule__Class__Group_2_1__0 )* )
            // InternalArdsl.g:809:2: ( rule__Class__Group_2_1__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_2_1()); 
            // InternalArdsl.g:810:2: ( rule__Class__Group_2_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalArdsl.g:810:3: rule__Class__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Class__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalArdsl.g:819:1: rule__Class__Group_2_1__0 : rule__Class__Group_2_1__0__Impl rule__Class__Group_2_1__1 ;
    public final void rule__Class__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:823:1: ( rule__Class__Group_2_1__0__Impl rule__Class__Group_2_1__1 )
            // InternalArdsl.g:824:2: rule__Class__Group_2_1__0__Impl rule__Class__Group_2_1__1
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
    // InternalArdsl.g:831:1: rule__Class__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:835:1: ( ( ',' ) )
            // InternalArdsl.g:836:1: ( ',' )
            {
            // InternalArdsl.g:836:1: ( ',' )
            // InternalArdsl.g:837:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_2_1_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalArdsl.g:846:1: rule__Class__Group_2_1__1 : rule__Class__Group_2_1__1__Impl ;
    public final void rule__Class__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:850:1: ( rule__Class__Group_2_1__1__Impl )
            // InternalArdsl.g:851:2: rule__Class__Group_2_1__1__Impl
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
    // InternalArdsl.g:857:1: rule__Class__Group_2_1__1__Impl : ( ( rule__Class__AttributesAssignment_2_1_1 ) ) ;
    public final void rule__Class__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:861:1: ( ( ( rule__Class__AttributesAssignment_2_1_1 ) ) )
            // InternalArdsl.g:862:1: ( ( rule__Class__AttributesAssignment_2_1_1 ) )
            {
            // InternalArdsl.g:862:1: ( ( rule__Class__AttributesAssignment_2_1_1 ) )
            // InternalArdsl.g:863:2: ( rule__Class__AttributesAssignment_2_1_1 )
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_2_1_1()); 
            // InternalArdsl.g:864:2: ( rule__Class__AttributesAssignment_2_1_1 )
            // InternalArdsl.g:864:3: rule__Class__AttributesAssignment_2_1_1
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
    // InternalArdsl.g:873:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:877:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalArdsl.g:878:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
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
    // InternalArdsl.g:885:1: rule__Class__Group_3__0__Impl : ( 'dependences' ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:889:1: ( ( 'dependences' ) )
            // InternalArdsl.g:890:1: ( 'dependences' )
            {
            // InternalArdsl.g:890:1: ( 'dependences' )
            // InternalArdsl.g:891:2: 'dependences'
            {
             before(grammarAccess.getClassAccess().getDependencesKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalArdsl.g:900:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl rule__Class__Group_3__2 ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:904:1: ( rule__Class__Group_3__1__Impl rule__Class__Group_3__2 )
            // InternalArdsl.g:905:2: rule__Class__Group_3__1__Impl rule__Class__Group_3__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalArdsl.g:912:1: rule__Class__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:916:1: ( ( '{' ) )
            // InternalArdsl.g:917:1: ( '{' )
            {
            // InternalArdsl.g:917:1: ( '{' )
            // InternalArdsl.g:918:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalArdsl.g:927:1: rule__Class__Group_3__2 : rule__Class__Group_3__2__Impl rule__Class__Group_3__3 ;
    public final void rule__Class__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:931:1: ( rule__Class__Group_3__2__Impl rule__Class__Group_3__3 )
            // InternalArdsl.g:932:2: rule__Class__Group_3__2__Impl rule__Class__Group_3__3
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
    // InternalArdsl.g:939:1: rule__Class__Group_3__2__Impl : ( ( rule__Class__ReferencesAssignment_3_2 ) ) ;
    public final void rule__Class__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:943:1: ( ( ( rule__Class__ReferencesAssignment_3_2 ) ) )
            // InternalArdsl.g:944:1: ( ( rule__Class__ReferencesAssignment_3_2 ) )
            {
            // InternalArdsl.g:944:1: ( ( rule__Class__ReferencesAssignment_3_2 ) )
            // InternalArdsl.g:945:2: ( rule__Class__ReferencesAssignment_3_2 )
            {
             before(grammarAccess.getClassAccess().getReferencesAssignment_3_2()); 
            // InternalArdsl.g:946:2: ( rule__Class__ReferencesAssignment_3_2 )
            // InternalArdsl.g:946:3: rule__Class__ReferencesAssignment_3_2
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
    // InternalArdsl.g:954:1: rule__Class__Group_3__3 : rule__Class__Group_3__3__Impl rule__Class__Group_3__4 ;
    public final void rule__Class__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:958:1: ( rule__Class__Group_3__3__Impl rule__Class__Group_3__4 )
            // InternalArdsl.g:959:2: rule__Class__Group_3__3__Impl rule__Class__Group_3__4
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
    // InternalArdsl.g:966:1: rule__Class__Group_3__3__Impl : ( ( rule__Class__Group_3_3__0 )* ) ;
    public final void rule__Class__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:970:1: ( ( ( rule__Class__Group_3_3__0 )* ) )
            // InternalArdsl.g:971:1: ( ( rule__Class__Group_3_3__0 )* )
            {
            // InternalArdsl.g:971:1: ( ( rule__Class__Group_3_3__0 )* )
            // InternalArdsl.g:972:2: ( rule__Class__Group_3_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_3_3()); 
            // InternalArdsl.g:973:2: ( rule__Class__Group_3_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalArdsl.g:973:3: rule__Class__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Class__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalArdsl.g:981:1: rule__Class__Group_3__4 : rule__Class__Group_3__4__Impl ;
    public final void rule__Class__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:985:1: ( rule__Class__Group_3__4__Impl )
            // InternalArdsl.g:986:2: rule__Class__Group_3__4__Impl
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
    // InternalArdsl.g:992:1: rule__Class__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:996:1: ( ( '}' ) )
            // InternalArdsl.g:997:1: ( '}' )
            {
            // InternalArdsl.g:997:1: ( '}' )
            // InternalArdsl.g:998:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalArdsl.g:1008:1: rule__Class__Group_3_3__0 : rule__Class__Group_3_3__0__Impl rule__Class__Group_3_3__1 ;
    public final void rule__Class__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1012:1: ( rule__Class__Group_3_3__0__Impl rule__Class__Group_3_3__1 )
            // InternalArdsl.g:1013:2: rule__Class__Group_3_3__0__Impl rule__Class__Group_3_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalArdsl.g:1020:1: rule__Class__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1024:1: ( ( ',' ) )
            // InternalArdsl.g:1025:1: ( ',' )
            {
            // InternalArdsl.g:1025:1: ( ',' )
            // InternalArdsl.g:1026:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_3_3_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalArdsl.g:1035:1: rule__Class__Group_3_3__1 : rule__Class__Group_3_3__1__Impl ;
    public final void rule__Class__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1039:1: ( rule__Class__Group_3_3__1__Impl )
            // InternalArdsl.g:1040:2: rule__Class__Group_3_3__1__Impl
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
    // InternalArdsl.g:1046:1: rule__Class__Group_3_3__1__Impl : ( ( rule__Class__ReferencesAssignment_3_3_1 ) ) ;
    public final void rule__Class__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1050:1: ( ( ( rule__Class__ReferencesAssignment_3_3_1 ) ) )
            // InternalArdsl.g:1051:1: ( ( rule__Class__ReferencesAssignment_3_3_1 ) )
            {
            // InternalArdsl.g:1051:1: ( ( rule__Class__ReferencesAssignment_3_3_1 ) )
            // InternalArdsl.g:1052:2: ( rule__Class__ReferencesAssignment_3_3_1 )
            {
             before(grammarAccess.getClassAccess().getReferencesAssignment_3_3_1()); 
            // InternalArdsl.g:1053:2: ( rule__Class__ReferencesAssignment_3_3_1 )
            // InternalArdsl.g:1053:3: rule__Class__ReferencesAssignment_3_3_1
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
    // InternalArdsl.g:1062:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1066:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalArdsl.g:1067:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalArdsl.g:1074:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1078:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalArdsl.g:1079:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalArdsl.g:1079:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalArdsl.g:1080:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalArdsl.g:1081:2: ( rule__Attribute__NameAssignment_0 )
            // InternalArdsl.g:1081:3: rule__Attribute__NameAssignment_0
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
    // InternalArdsl.g:1089:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1093:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalArdsl.g:1094:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalArdsl.g:1101:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1105:1: ( ( ':' ) )
            // InternalArdsl.g:1106:1: ( ':' )
            {
            // InternalArdsl.g:1106:1: ( ':' )
            // InternalArdsl.g:1107:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalArdsl.g:1116:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1120:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalArdsl.g:1121:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalArdsl.g:1128:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1132:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalArdsl.g:1133:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalArdsl.g:1133:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalArdsl.g:1134:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalArdsl.g:1135:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalArdsl.g:1135:3: rule__Attribute__TypeAssignment_2
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
    // InternalArdsl.g:1143:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1147:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalArdsl.g:1148:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalArdsl.g:1155:1: rule__Attribute__Group__3__Impl : ( '[' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1159:1: ( ( '[' ) )
            // InternalArdsl.g:1160:1: ( '[' )
            {
            // InternalArdsl.g:1160:1: ( '[' )
            // InternalArdsl.g:1161:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalArdsl.g:1170:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1174:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalArdsl.g:1175:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalArdsl.g:1182:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__MinAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1186:1: ( ( ( rule__Attribute__MinAssignment_4 ) ) )
            // InternalArdsl.g:1187:1: ( ( rule__Attribute__MinAssignment_4 ) )
            {
            // InternalArdsl.g:1187:1: ( ( rule__Attribute__MinAssignment_4 ) )
            // InternalArdsl.g:1188:2: ( rule__Attribute__MinAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getMinAssignment_4()); 
            // InternalArdsl.g:1189:2: ( rule__Attribute__MinAssignment_4 )
            // InternalArdsl.g:1189:3: rule__Attribute__MinAssignment_4
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
    // InternalArdsl.g:1197:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1201:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalArdsl.g:1202:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalArdsl.g:1209:1: rule__Attribute__Group__5__Impl : ( ',' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1213:1: ( ( ',' ) )
            // InternalArdsl.g:1214:1: ( ',' )
            {
            // InternalArdsl.g:1214:1: ( ',' )
            // InternalArdsl.g:1215:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_5()); 
            match(input,16,FOLLOW_2); 
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
    // InternalArdsl.g:1224:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1228:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalArdsl.g:1229:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalArdsl.g:1236:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__MaxAssignment_6 ) ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1240:1: ( ( ( rule__Attribute__MaxAssignment_6 ) ) )
            // InternalArdsl.g:1241:1: ( ( rule__Attribute__MaxAssignment_6 ) )
            {
            // InternalArdsl.g:1241:1: ( ( rule__Attribute__MaxAssignment_6 ) )
            // InternalArdsl.g:1242:2: ( rule__Attribute__MaxAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getMaxAssignment_6()); 
            // InternalArdsl.g:1243:2: ( rule__Attribute__MaxAssignment_6 )
            // InternalArdsl.g:1243:3: rule__Attribute__MaxAssignment_6
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
    // InternalArdsl.g:1251:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1255:1: ( rule__Attribute__Group__7__Impl rule__Attribute__Group__8 )
            // InternalArdsl.g:1256:2: rule__Attribute__Group__7__Impl rule__Attribute__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalArdsl.g:1263:1: rule__Attribute__Group__7__Impl : ( ']' ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1267:1: ( ( ']' ) )
            // InternalArdsl.g:1268:1: ( ']' )
            {
            // InternalArdsl.g:1268:1: ( ']' )
            // InternalArdsl.g:1269:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
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
    // InternalArdsl.g:1278:1: rule__Attribute__Group__8 : rule__Attribute__Group__8__Impl rule__Attribute__Group__9 ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1282:1: ( rule__Attribute__Group__8__Impl rule__Attribute__Group__9 )
            // InternalArdsl.g:1283:2: rule__Attribute__Group__8__Impl rule__Attribute__Group__9
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
    // InternalArdsl.g:1290:1: rule__Attribute__Group__8__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1294:1: ( ( '=' ) )
            // InternalArdsl.g:1295:1: ( '=' )
            {
            // InternalArdsl.g:1295:1: ( '=' )
            // InternalArdsl.g:1296:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_8()); 
            match(input,21,FOLLOW_2); 
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
    // InternalArdsl.g:1305:1: rule__Attribute__Group__9 : rule__Attribute__Group__9__Impl rule__Attribute__Group__10 ;
    public final void rule__Attribute__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1309:1: ( rule__Attribute__Group__9__Impl rule__Attribute__Group__10 )
            // InternalArdsl.g:1310:2: rule__Attribute__Group__9__Impl rule__Attribute__Group__10
            {
            pushFollow(FOLLOW_17);
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
    // InternalArdsl.g:1317:1: rule__Attribute__Group__9__Impl : ( ( rule__Attribute__DefaultAssignment_9 ) ) ;
    public final void rule__Attribute__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1321:1: ( ( ( rule__Attribute__DefaultAssignment_9 ) ) )
            // InternalArdsl.g:1322:1: ( ( rule__Attribute__DefaultAssignment_9 ) )
            {
            // InternalArdsl.g:1322:1: ( ( rule__Attribute__DefaultAssignment_9 ) )
            // InternalArdsl.g:1323:2: ( rule__Attribute__DefaultAssignment_9 )
            {
             before(grammarAccess.getAttributeAccess().getDefaultAssignment_9()); 
            // InternalArdsl.g:1324:2: ( rule__Attribute__DefaultAssignment_9 )
            // InternalArdsl.g:1324:3: rule__Attribute__DefaultAssignment_9
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
    // InternalArdsl.g:1332:1: rule__Attribute__Group__10 : rule__Attribute__Group__10__Impl rule__Attribute__Group__11 ;
    public final void rule__Attribute__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1336:1: ( rule__Attribute__Group__10__Impl rule__Attribute__Group__11 )
            // InternalArdsl.g:1337:2: rule__Attribute__Group__10__Impl rule__Attribute__Group__11
            {
            pushFollow(FOLLOW_17);
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
    // InternalArdsl.g:1344:1: rule__Attribute__Group__10__Impl : ( ( rule__Attribute__IsParamAssignment_10 )? ) ;
    public final void rule__Attribute__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1348:1: ( ( ( rule__Attribute__IsParamAssignment_10 )? ) )
            // InternalArdsl.g:1349:1: ( ( rule__Attribute__IsParamAssignment_10 )? )
            {
            // InternalArdsl.g:1349:1: ( ( rule__Attribute__IsParamAssignment_10 )? )
            // InternalArdsl.g:1350:2: ( rule__Attribute__IsParamAssignment_10 )?
            {
             before(grammarAccess.getAttributeAccess().getIsParamAssignment_10()); 
            // InternalArdsl.g:1351:2: ( rule__Attribute__IsParamAssignment_10 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalArdsl.g:1351:3: rule__Attribute__IsParamAssignment_10
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
    // InternalArdsl.g:1359:1: rule__Attribute__Group__11 : rule__Attribute__Group__11__Impl rule__Attribute__Group__12 ;
    public final void rule__Attribute__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1363:1: ( rule__Attribute__Group__11__Impl rule__Attribute__Group__12 )
            // InternalArdsl.g:1364:2: rule__Attribute__Group__11__Impl rule__Attribute__Group__12
            {
            pushFollow(FOLLOW_17);
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
    // InternalArdsl.g:1371:1: rule__Attribute__Group__11__Impl : ( ( rule__Attribute__IsKeyAssignment_11 )? ) ;
    public final void rule__Attribute__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1375:1: ( ( ( rule__Attribute__IsKeyAssignment_11 )? ) )
            // InternalArdsl.g:1376:1: ( ( rule__Attribute__IsKeyAssignment_11 )? )
            {
            // InternalArdsl.g:1376:1: ( ( rule__Attribute__IsKeyAssignment_11 )? )
            // InternalArdsl.g:1377:2: ( rule__Attribute__IsKeyAssignment_11 )?
            {
             before(grammarAccess.getAttributeAccess().getIsKeyAssignment_11()); 
            // InternalArdsl.g:1378:2: ( rule__Attribute__IsKeyAssignment_11 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalArdsl.g:1378:3: rule__Attribute__IsKeyAssignment_11
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
    // InternalArdsl.g:1386:1: rule__Attribute__Group__12 : rule__Attribute__Group__12__Impl ;
    public final void rule__Attribute__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1390:1: ( rule__Attribute__Group__12__Impl )
            // InternalArdsl.g:1391:2: rule__Attribute__Group__12__Impl
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
    // InternalArdsl.g:1397:1: rule__Attribute__Group__12__Impl : ( ( rule__Attribute__ReadOnlyAssignment_12 )? ) ;
    public final void rule__Attribute__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1401:1: ( ( ( rule__Attribute__ReadOnlyAssignment_12 )? ) )
            // InternalArdsl.g:1402:1: ( ( rule__Attribute__ReadOnlyAssignment_12 )? )
            {
            // InternalArdsl.g:1402:1: ( ( rule__Attribute__ReadOnlyAssignment_12 )? )
            // InternalArdsl.g:1403:2: ( rule__Attribute__ReadOnlyAssignment_12 )?
            {
             before(grammarAccess.getAttributeAccess().getReadOnlyAssignment_12()); 
            // InternalArdsl.g:1404:2: ( rule__Attribute__ReadOnlyAssignment_12 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalArdsl.g:1404:3: rule__Attribute__ReadOnlyAssignment_12
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
    // InternalArdsl.g:1413:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1417:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalArdsl.g:1418:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalArdsl.g:1425:1: rule__Reference__Group__0__Impl : ( 'Dependence' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1429:1: ( ( 'Dependence' ) )
            // InternalArdsl.g:1430:1: ( 'Dependence' )
            {
            // InternalArdsl.g:1430:1: ( 'Dependence' )
            // InternalArdsl.g:1431:2: 'Dependence'
            {
             before(grammarAccess.getReferenceAccess().getDependenceKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getDependenceKeyword_0()); 

            }


            }

        }
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
    // InternalArdsl.g:1440:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1444:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalArdsl.g:1445:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalArdsl.g:1452:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1456:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // InternalArdsl.g:1457:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // InternalArdsl.g:1457:1: ( ( rule__Reference__NameAssignment_1 ) )
            // InternalArdsl.g:1458:2: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // InternalArdsl.g:1459:2: ( rule__Reference__NameAssignment_1 )
            // InternalArdsl.g:1459:3: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalArdsl.g:1467:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1471:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalArdsl.g:1472:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalArdsl.g:1479:1: rule__Reference__Group__2__Impl : ( '{' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1483:1: ( ( '{' ) )
            // InternalArdsl.g:1484:1: ( '{' )
            {
            // InternalArdsl.g:1484:1: ( '{' )
            // InternalArdsl.g:1485:2: '{'
            {
             before(grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalArdsl.g:1494:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1498:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // InternalArdsl.g:1499:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalArdsl.g:1506:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__Group_3__0 )? ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1510:1: ( ( ( rule__Reference__Group_3__0 )? ) )
            // InternalArdsl.g:1511:1: ( ( rule__Reference__Group_3__0 )? )
            {
            // InternalArdsl.g:1511:1: ( ( rule__Reference__Group_3__0 )? )
            // InternalArdsl.g:1512:2: ( rule__Reference__Group_3__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_3()); 
            // InternalArdsl.g:1513:2: ( rule__Reference__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalArdsl.g:1513:3: rule__Reference__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalArdsl.g:1521:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1525:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // InternalArdsl.g:1526:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalArdsl.g:1533:1: rule__Reference__Group__4__Impl : ( 'min' ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1537:1: ( ( 'min' ) )
            // InternalArdsl.g:1538:1: ( 'min' )
            {
            // InternalArdsl.g:1538:1: ( 'min' )
            // InternalArdsl.g:1539:2: 'min'
            {
             before(grammarAccess.getReferenceAccess().getMinKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getMinKeyword_4()); 

            }


            }

        }
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
    // InternalArdsl.g:1548:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl rule__Reference__Group__6 ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1552:1: ( rule__Reference__Group__5__Impl rule__Reference__Group__6 )
            // InternalArdsl.g:1553:2: rule__Reference__Group__5__Impl rule__Reference__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalArdsl.g:1560:1: rule__Reference__Group__5__Impl : ( ( rule__Reference__MinAssignment_5 ) ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1564:1: ( ( ( rule__Reference__MinAssignment_5 ) ) )
            // InternalArdsl.g:1565:1: ( ( rule__Reference__MinAssignment_5 ) )
            {
            // InternalArdsl.g:1565:1: ( ( rule__Reference__MinAssignment_5 ) )
            // InternalArdsl.g:1566:2: ( rule__Reference__MinAssignment_5 )
            {
             before(grammarAccess.getReferenceAccess().getMinAssignment_5()); 
            // InternalArdsl.g:1567:2: ( rule__Reference__MinAssignment_5 )
            // InternalArdsl.g:1567:3: rule__Reference__MinAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Reference__MinAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getMinAssignment_5()); 

            }


            }

        }
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
    // InternalArdsl.g:1575:1: rule__Reference__Group__6 : rule__Reference__Group__6__Impl rule__Reference__Group__7 ;
    public final void rule__Reference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1579:1: ( rule__Reference__Group__6__Impl rule__Reference__Group__7 )
            // InternalArdsl.g:1580:2: rule__Reference__Group__6__Impl rule__Reference__Group__7
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
    // InternalArdsl.g:1587:1: rule__Reference__Group__6__Impl : ( 'max' ) ;
    public final void rule__Reference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1591:1: ( ( 'max' ) )
            // InternalArdsl.g:1592:1: ( 'max' )
            {
            // InternalArdsl.g:1592:1: ( 'max' )
            // InternalArdsl.g:1593:2: 'max'
            {
             before(grammarAccess.getReferenceAccess().getMaxKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getMaxKeyword_6()); 

            }


            }

        }
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
    // InternalArdsl.g:1602:1: rule__Reference__Group__7 : rule__Reference__Group__7__Impl rule__Reference__Group__8 ;
    public final void rule__Reference__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1606:1: ( rule__Reference__Group__7__Impl rule__Reference__Group__8 )
            // InternalArdsl.g:1607:2: rule__Reference__Group__7__Impl rule__Reference__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalArdsl.g:1614:1: rule__Reference__Group__7__Impl : ( ( rule__Reference__MaxAssignment_7 ) ) ;
    public final void rule__Reference__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1618:1: ( ( ( rule__Reference__MaxAssignment_7 ) ) )
            // InternalArdsl.g:1619:1: ( ( rule__Reference__MaxAssignment_7 ) )
            {
            // InternalArdsl.g:1619:1: ( ( rule__Reference__MaxAssignment_7 ) )
            // InternalArdsl.g:1620:2: ( rule__Reference__MaxAssignment_7 )
            {
             before(grammarAccess.getReferenceAccess().getMaxAssignment_7()); 
            // InternalArdsl.g:1621:2: ( rule__Reference__MaxAssignment_7 )
            // InternalArdsl.g:1621:3: rule__Reference__MaxAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Reference__MaxAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getMaxAssignment_7()); 

            }


            }

        }
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
    // InternalArdsl.g:1629:1: rule__Reference__Group__8 : rule__Reference__Group__8__Impl rule__Reference__Group__9 ;
    public final void rule__Reference__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1633:1: ( rule__Reference__Group__8__Impl rule__Reference__Group__9 )
            // InternalArdsl.g:1634:2: rule__Reference__Group__8__Impl rule__Reference__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__9();

            state._fsp--;


            }

        }
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
    // InternalArdsl.g:1641:1: rule__Reference__Group__8__Impl : ( 'target' ) ;
    public final void rule__Reference__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1645:1: ( ( 'target' ) )
            // InternalArdsl.g:1646:1: ( 'target' )
            {
            // InternalArdsl.g:1646:1: ( 'target' )
            // InternalArdsl.g:1647:2: 'target'
            {
             before(grammarAccess.getReferenceAccess().getTargetKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getTargetKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Reference__Group__9"
    // InternalArdsl.g:1656:1: rule__Reference__Group__9 : rule__Reference__Group__9__Impl rule__Reference__Group__10 ;
    public final void rule__Reference__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1660:1: ( rule__Reference__Group__9__Impl rule__Reference__Group__10 )
            // InternalArdsl.g:1661:2: rule__Reference__Group__9__Impl rule__Reference__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__Reference__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__9"


    // $ANTLR start "rule__Reference__Group__9__Impl"
    // InternalArdsl.g:1668:1: rule__Reference__Group__9__Impl : ( ( rule__Reference__TargetAssignment_9 ) ) ;
    public final void rule__Reference__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1672:1: ( ( ( rule__Reference__TargetAssignment_9 ) ) )
            // InternalArdsl.g:1673:1: ( ( rule__Reference__TargetAssignment_9 ) )
            {
            // InternalArdsl.g:1673:1: ( ( rule__Reference__TargetAssignment_9 ) )
            // InternalArdsl.g:1674:2: ( rule__Reference__TargetAssignment_9 )
            {
             before(grammarAccess.getReferenceAccess().getTargetAssignment_9()); 
            // InternalArdsl.g:1675:2: ( rule__Reference__TargetAssignment_9 )
            // InternalArdsl.g:1675:3: rule__Reference__TargetAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Reference__TargetAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getTargetAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__9__Impl"


    // $ANTLR start "rule__Reference__Group__10"
    // InternalArdsl.g:1683:1: rule__Reference__Group__10 : rule__Reference__Group__10__Impl rule__Reference__Group__11 ;
    public final void rule__Reference__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1687:1: ( rule__Reference__Group__10__Impl rule__Reference__Group__11 )
            // InternalArdsl.g:1688:2: rule__Reference__Group__10__Impl rule__Reference__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__Reference__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__10"


    // $ANTLR start "rule__Reference__Group__10__Impl"
    // InternalArdsl.g:1695:1: rule__Reference__Group__10__Impl : ( ( rule__Reference__Group_10__0 )? ) ;
    public final void rule__Reference__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1699:1: ( ( ( rule__Reference__Group_10__0 )? ) )
            // InternalArdsl.g:1700:1: ( ( rule__Reference__Group_10__0 )? )
            {
            // InternalArdsl.g:1700:1: ( ( rule__Reference__Group_10__0 )? )
            // InternalArdsl.g:1701:2: ( rule__Reference__Group_10__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_10()); 
            // InternalArdsl.g:1702:2: ( rule__Reference__Group_10__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalArdsl.g:1702:3: rule__Reference__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__10__Impl"


    // $ANTLR start "rule__Reference__Group__11"
    // InternalArdsl.g:1710:1: rule__Reference__Group__11 : rule__Reference__Group__11__Impl ;
    public final void rule__Reference__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1714:1: ( rule__Reference__Group__11__Impl )
            // InternalArdsl.g:1715:2: rule__Reference__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__11"


    // $ANTLR start "rule__Reference__Group__11__Impl"
    // InternalArdsl.g:1721:1: rule__Reference__Group__11__Impl : ( '}' ) ;
    public final void rule__Reference__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1725:1: ( ( '}' ) )
            // InternalArdsl.g:1726:1: ( '}' )
            {
            // InternalArdsl.g:1726:1: ( '}' )
            // InternalArdsl.g:1727:2: '}'
            {
             before(grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_11()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__11__Impl"


    // $ANTLR start "rule__Reference__Group_3__0"
    // InternalArdsl.g:1737:1: rule__Reference__Group_3__0 : rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 ;
    public final void rule__Reference__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1741:1: ( rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 )
            // InternalArdsl.g:1742:2: rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__0"


    // $ANTLR start "rule__Reference__Group_3__0__Impl"
    // InternalArdsl.g:1749:1: rule__Reference__Group_3__0__Impl : ( 'containtment' ) ;
    public final void rule__Reference__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1753:1: ( ( 'containtment' ) )
            // InternalArdsl.g:1754:1: ( 'containtment' )
            {
            // InternalArdsl.g:1754:1: ( 'containtment' )
            // InternalArdsl.g:1755:2: 'containtment'
            {
             before(grammarAccess.getReferenceAccess().getContaintmentKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getContaintmentKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__0__Impl"


    // $ANTLR start "rule__Reference__Group_3__1"
    // InternalArdsl.g:1764:1: rule__Reference__Group_3__1 : rule__Reference__Group_3__1__Impl ;
    public final void rule__Reference__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1768:1: ( rule__Reference__Group_3__1__Impl )
            // InternalArdsl.g:1769:2: rule__Reference__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__1"


    // $ANTLR start "rule__Reference__Group_3__1__Impl"
    // InternalArdsl.g:1775:1: rule__Reference__Group_3__1__Impl : ( ( rule__Reference__ContaintmentAssignment_3_1 ) ) ;
    public final void rule__Reference__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1779:1: ( ( ( rule__Reference__ContaintmentAssignment_3_1 ) ) )
            // InternalArdsl.g:1780:1: ( ( rule__Reference__ContaintmentAssignment_3_1 ) )
            {
            // InternalArdsl.g:1780:1: ( ( rule__Reference__ContaintmentAssignment_3_1 ) )
            // InternalArdsl.g:1781:2: ( rule__Reference__ContaintmentAssignment_3_1 )
            {
             before(grammarAccess.getReferenceAccess().getContaintmentAssignment_3_1()); 
            // InternalArdsl.g:1782:2: ( rule__Reference__ContaintmentAssignment_3_1 )
            // InternalArdsl.g:1782:3: rule__Reference__ContaintmentAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__ContaintmentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getContaintmentAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__1__Impl"


    // $ANTLR start "rule__Reference__Group_10__0"
    // InternalArdsl.g:1791:1: rule__Reference__Group_10__0 : rule__Reference__Group_10__0__Impl rule__Reference__Group_10__1 ;
    public final void rule__Reference__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1795:1: ( rule__Reference__Group_10__0__Impl rule__Reference__Group_10__1 )
            // InternalArdsl.g:1796:2: rule__Reference__Group_10__0__Impl rule__Reference__Group_10__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_10__0"


    // $ANTLR start "rule__Reference__Group_10__0__Impl"
    // InternalArdsl.g:1803:1: rule__Reference__Group_10__0__Impl : ( 'opposite' ) ;
    public final void rule__Reference__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1807:1: ( ( 'opposite' ) )
            // InternalArdsl.g:1808:1: ( 'opposite' )
            {
            // InternalArdsl.g:1808:1: ( 'opposite' )
            // InternalArdsl.g:1809:2: 'opposite'
            {
             before(grammarAccess.getReferenceAccess().getOppositeKeyword_10_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getOppositeKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_10__0__Impl"


    // $ANTLR start "rule__Reference__Group_10__1"
    // InternalArdsl.g:1818:1: rule__Reference__Group_10__1 : rule__Reference__Group_10__1__Impl ;
    public final void rule__Reference__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1822:1: ( rule__Reference__Group_10__1__Impl )
            // InternalArdsl.g:1823:2: rule__Reference__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_10__1"


    // $ANTLR start "rule__Reference__Group_10__1__Impl"
    // InternalArdsl.g:1829:1: rule__Reference__Group_10__1__Impl : ( ( rule__Reference__OppositeAssignment_10_1 ) ) ;
    public final void rule__Reference__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1833:1: ( ( ( rule__Reference__OppositeAssignment_10_1 ) ) )
            // InternalArdsl.g:1834:1: ( ( rule__Reference__OppositeAssignment_10_1 ) )
            {
            // InternalArdsl.g:1834:1: ( ( rule__Reference__OppositeAssignment_10_1 ) )
            // InternalArdsl.g:1835:2: ( rule__Reference__OppositeAssignment_10_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeAssignment_10_1()); 
            // InternalArdsl.g:1836:2: ( rule__Reference__OppositeAssignment_10_1 )
            // InternalArdsl.g:1836:3: rule__Reference__OppositeAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__OppositeAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getOppositeAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_10__1__Impl"


    // $ANTLR start "rule__Ontological__NameAssignment_1"
    // InternalArdsl.g:1845:1: rule__Ontological__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Ontological__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1849:1: ( ( ruleEString ) )
            // InternalArdsl.g:1850:2: ( ruleEString )
            {
            // InternalArdsl.g:1850:2: ( ruleEString )
            // InternalArdsl.g:1851:3: ruleEString
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
    // InternalArdsl.g:1860:1: rule__Ontological__URIAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Ontological__URIAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1864:1: ( ( ruleEString ) )
            // InternalArdsl.g:1865:2: ( ruleEString )
            {
            // InternalArdsl.g:1865:2: ( ruleEString )
            // InternalArdsl.g:1866:3: ruleEString
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
    // InternalArdsl.g:1875:1: rule__Ontological__ClassesAssignment_6 : ( ruleClass ) ;
    public final void rule__Ontological__ClassesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1879:1: ( ( ruleClass ) )
            // InternalArdsl.g:1880:2: ( ruleClass )
            {
            // InternalArdsl.g:1880:2: ( ruleClass )
            // InternalArdsl.g:1881:3: ruleClass
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
    // InternalArdsl.g:1890:1: rule__Ontological__ClassesAssignment_7_1 : ( ruleClass ) ;
    public final void rule__Ontological__ClassesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1894:1: ( ( ruleClass ) )
            // InternalArdsl.g:1895:2: ( ruleClass )
            {
            // InternalArdsl.g:1895:2: ( ruleClass )
            // InternalArdsl.g:1896:3: ruleClass
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


    // $ANTLR start "rule__Class__NameAssignment_0"
    // InternalArdsl.g:1905:1: rule__Class__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Class__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1909:1: ( ( ruleEString ) )
            // InternalArdsl.g:1910:2: ( ruleEString )
            {
            // InternalArdsl.g:1910:2: ( ruleEString )
            // InternalArdsl.g:1911:3: ruleEString
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
    // InternalArdsl.g:1920:1: rule__Class__AttributesAssignment_2_0 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1924:1: ( ( ruleAttribute ) )
            // InternalArdsl.g:1925:2: ( ruleAttribute )
            {
            // InternalArdsl.g:1925:2: ( ruleAttribute )
            // InternalArdsl.g:1926:3: ruleAttribute
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
    // InternalArdsl.g:1935:1: rule__Class__AttributesAssignment_2_1_1 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1939:1: ( ( ruleAttribute ) )
            // InternalArdsl.g:1940:2: ( ruleAttribute )
            {
            // InternalArdsl.g:1940:2: ( ruleAttribute )
            // InternalArdsl.g:1941:3: ruleAttribute
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
    // InternalArdsl.g:1950:1: rule__Class__ReferencesAssignment_3_2 : ( ruleReference ) ;
    public final void rule__Class__ReferencesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1954:1: ( ( ruleReference ) )
            // InternalArdsl.g:1955:2: ( ruleReference )
            {
            // InternalArdsl.g:1955:2: ( ruleReference )
            // InternalArdsl.g:1956:3: ruleReference
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
    // InternalArdsl.g:1965:1: rule__Class__ReferencesAssignment_3_3_1 : ( ruleReference ) ;
    public final void rule__Class__ReferencesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1969:1: ( ( ruleReference ) )
            // InternalArdsl.g:1970:2: ( ruleReference )
            {
            // InternalArdsl.g:1970:2: ( ruleReference )
            // InternalArdsl.g:1971:3: ruleReference
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
    // InternalArdsl.g:1980:1: rule__Class__AbstractAssignment_5 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:1984:1: ( ( ( 'abstract' ) ) )
            // InternalArdsl.g:1985:2: ( ( 'abstract' ) )
            {
            // InternalArdsl.g:1985:2: ( ( 'abstract' ) )
            // InternalArdsl.g:1986:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_5_0()); 
            // InternalArdsl.g:1987:3: ( 'abstract' )
            // InternalArdsl.g:1988:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalArdsl.g:1999:1: rule__Class__NoSCNAssignment_6 : ( ( 'invisible' ) ) ;
    public final void rule__Class__NoSCNAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2003:1: ( ( ( 'invisible' ) ) )
            // InternalArdsl.g:2004:2: ( ( 'invisible' ) )
            {
            // InternalArdsl.g:2004:2: ( ( 'invisible' ) )
            // InternalArdsl.g:2005:3: ( 'invisible' )
            {
             before(grammarAccess.getClassAccess().getNoSCNInvisibleKeyword_6_0()); 
            // InternalArdsl.g:2006:3: ( 'invisible' )
            // InternalArdsl.g:2007:4: 'invisible'
            {
             before(grammarAccess.getClassAccess().getNoSCNInvisibleKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalArdsl.g:2018:1: rule__Attribute__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2022:1: ( ( ruleEString ) )
            // InternalArdsl.g:2023:2: ( ruleEString )
            {
            // InternalArdsl.g:2023:2: ( ruleEString )
            // InternalArdsl.g:2024:3: ruleEString
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
    // InternalArdsl.g:2033:1: rule__Attribute__TypeAssignment_2 : ( ruleEString ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2037:1: ( ( ruleEString ) )
            // InternalArdsl.g:2038:2: ( ruleEString )
            {
            // InternalArdsl.g:2038:2: ( ruleEString )
            // InternalArdsl.g:2039:3: ruleEString
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
    // InternalArdsl.g:2048:1: rule__Attribute__MinAssignment_4 : ( ruleEString ) ;
    public final void rule__Attribute__MinAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2052:1: ( ( ruleEString ) )
            // InternalArdsl.g:2053:2: ( ruleEString )
            {
            // InternalArdsl.g:2053:2: ( ruleEString )
            // InternalArdsl.g:2054:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getMinEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getMinEStringParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalArdsl.g:2063:1: rule__Attribute__MaxAssignment_6 : ( ruleEString ) ;
    public final void rule__Attribute__MaxAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2067:1: ( ( ruleEString ) )
            // InternalArdsl.g:2068:2: ( ruleEString )
            {
            // InternalArdsl.g:2068:2: ( ruleEString )
            // InternalArdsl.g:2069:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getMaxEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getMaxEStringParserRuleCall_6_0()); 

            }


            }

        }
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
    // InternalArdsl.g:2078:1: rule__Attribute__DefaultAssignment_9 : ( ruleEString ) ;
    public final void rule__Attribute__DefaultAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2082:1: ( ( ruleEString ) )
            // InternalArdsl.g:2083:2: ( ruleEString )
            {
            // InternalArdsl.g:2083:2: ( ruleEString )
            // InternalArdsl.g:2084:3: ruleEString
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
    // InternalArdsl.g:2093:1: rule__Attribute__IsParamAssignment_10 : ( ( 'isParam' ) ) ;
    public final void rule__Attribute__IsParamAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2097:1: ( ( ( 'isParam' ) ) )
            // InternalArdsl.g:2098:2: ( ( 'isParam' ) )
            {
            // InternalArdsl.g:2098:2: ( ( 'isParam' ) )
            // InternalArdsl.g:2099:3: ( 'isParam' )
            {
             before(grammarAccess.getAttributeAccess().getIsParamIsParamKeyword_10_0()); 
            // InternalArdsl.g:2100:3: ( 'isParam' )
            // InternalArdsl.g:2101:4: 'isParam'
            {
             before(grammarAccess.getAttributeAccess().getIsParamIsParamKeyword_10_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalArdsl.g:2112:1: rule__Attribute__IsKeyAssignment_11 : ( ( 'isKey' ) ) ;
    public final void rule__Attribute__IsKeyAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2116:1: ( ( ( 'isKey' ) ) )
            // InternalArdsl.g:2117:2: ( ( 'isKey' ) )
            {
            // InternalArdsl.g:2117:2: ( ( 'isKey' ) )
            // InternalArdsl.g:2118:3: ( 'isKey' )
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsKeyKeyword_11_0()); 
            // InternalArdsl.g:2119:3: ( 'isKey' )
            // InternalArdsl.g:2120:4: 'isKey'
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsKeyKeyword_11_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalArdsl.g:2131:1: rule__Attribute__ReadOnlyAssignment_12 : ( ( 'readOnly' ) ) ;
    public final void rule__Attribute__ReadOnlyAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2135:1: ( ( ( 'readOnly' ) ) )
            // InternalArdsl.g:2136:2: ( ( 'readOnly' ) )
            {
            // InternalArdsl.g:2136:2: ( ( 'readOnly' ) )
            // InternalArdsl.g:2137:3: ( 'readOnly' )
            {
             before(grammarAccess.getAttributeAccess().getReadOnlyReadOnlyKeyword_12_0()); 
            // InternalArdsl.g:2138:3: ( 'readOnly' )
            // InternalArdsl.g:2139:4: 'readOnly'
            {
             before(grammarAccess.getAttributeAccess().getReadOnlyReadOnlyKeyword_12_0()); 
            match(input,32,FOLLOW_2); 
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


    // $ANTLR start "rule__Reference__NameAssignment_1"
    // InternalArdsl.g:2150:1: rule__Reference__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2154:1: ( ( ruleEString ) )
            // InternalArdsl.g:2155:2: ( ruleEString )
            {
            // InternalArdsl.g:2155:2: ( ruleEString )
            // InternalArdsl.g:2156:3: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NameAssignment_1"


    // $ANTLR start "rule__Reference__ContaintmentAssignment_3_1"
    // InternalArdsl.g:2165:1: rule__Reference__ContaintmentAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Reference__ContaintmentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2169:1: ( ( ruleEString ) )
            // InternalArdsl.g:2170:2: ( ruleEString )
            {
            // InternalArdsl.g:2170:2: ( ruleEString )
            // InternalArdsl.g:2171:3: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getContaintmentEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getContaintmentEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__ContaintmentAssignment_3_1"


    // $ANTLR start "rule__Reference__MinAssignment_5"
    // InternalArdsl.g:2180:1: rule__Reference__MinAssignment_5 : ( ruleEString ) ;
    public final void rule__Reference__MinAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2184:1: ( ( ruleEString ) )
            // InternalArdsl.g:2185:2: ( ruleEString )
            {
            // InternalArdsl.g:2185:2: ( ruleEString )
            // InternalArdsl.g:2186:3: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getMinEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getMinEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__MinAssignment_5"


    // $ANTLR start "rule__Reference__MaxAssignment_7"
    // InternalArdsl.g:2195:1: rule__Reference__MaxAssignment_7 : ( ruleEString ) ;
    public final void rule__Reference__MaxAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2199:1: ( ( ruleEString ) )
            // InternalArdsl.g:2200:2: ( ruleEString )
            {
            // InternalArdsl.g:2200:2: ( ruleEString )
            // InternalArdsl.g:2201:3: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getMaxEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getMaxEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__MaxAssignment_7"


    // $ANTLR start "rule__Reference__TargetAssignment_9"
    // InternalArdsl.g:2210:1: rule__Reference__TargetAssignment_9 : ( ruleEString ) ;
    public final void rule__Reference__TargetAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2214:1: ( ( ruleEString ) )
            // InternalArdsl.g:2215:2: ( ruleEString )
            {
            // InternalArdsl.g:2215:2: ( ruleEString )
            // InternalArdsl.g:2216:3: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getTargetEStringParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getTargetEStringParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__TargetAssignment_9"


    // $ANTLR start "rule__Reference__OppositeAssignment_10_1"
    // InternalArdsl.g:2225:1: rule__Reference__OppositeAssignment_10_1 : ( ruleEString ) ;
    public final void rule__Reference__OppositeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArdsl.g:2229:1: ( ( ruleEString ) )
            // InternalArdsl.g:2230:2: ( ruleEString )
            {
            // InternalArdsl.g:2230:2: ( ruleEString )
            // InternalArdsl.g:2231:3: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getOppositeEStringParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getOppositeEStringParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__OppositeAssignment_10_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000024030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008004000L});

}