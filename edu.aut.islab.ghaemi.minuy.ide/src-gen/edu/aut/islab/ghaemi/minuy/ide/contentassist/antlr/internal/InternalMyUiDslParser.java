package edu.aut.islab.ghaemi.minuy.ide.contentassist.antlr.internal;

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
import edu.aut.islab.ghaemi.minuy.services.MyUiDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyUiDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ONECHAR", "RULE_ID", "RULE_INT", "RULE_STRING2", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_CSS'", "'_JS'", "'Red'", "'Blue'", "'Black'", "'Green'", "'Yellow'", "'Pink'", "'Brown'", "'Gold'", "'White'", "'Grey'", "'em'", "'%'", "'px'", "'Static'", "'Relative'", "'Fixed'", "'Absolute'", "'Steaky'", "'Left'", "'Right'", "'None'", "'Start'", "'End'", "'Both'", "'Block'", "'Inline'", "'InBl'", "'Table'", "'Top'", "'Down'", "'Center'", "'Scroll'", "'Visible'", "'Hidden'", "'Auto'", "'Div'", "'Para'", "'Input'", "'Tr'", "'Td'", "'Img'", "'Form'", "'Button'", "'|'", "'import'", "'as'", "';'", "'->'", "':'", "'<'", "'>'", "'('", "')'", "'['", "']'", "','", "'{'", "'}'", "'border:'", "'color:'", "'bcolor:'", "'rgba('", "'red'", "'grn'", "'blu'", "'alfa'", "'Arc:'", "'Pos:'", "'Flt:'", "'Clr:'", "'Disp:'", "'Ver_Al:'", "'OFlow:'", "'Wid:'", "'H8:'", "'Coord:'", "'Marg:'", "'Padd:'", "'lo'", "'hi'", "'le'", "'ri'", "'up'", "'dn'", "'*'"
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
    public static final int RULE_ML_COMMENT=9;
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
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
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
    public static final int RULE_STRING2=7;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_ONECHAR=4;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalMyUiDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyUiDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyUiDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyUiDsl.g"; }


    	private MyUiDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyUiDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalMyUiDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:54:1: ( ruleModel EOF )
            // InternalMyUiDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyUiDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyUiDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyUiDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyUiDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyUiDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyUiDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleHead"
    // InternalMyUiDsl.g:78:1: entryRuleHead : ruleHead EOF ;
    public final void entryRuleHead() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:79:1: ( ruleHead EOF )
            // InternalMyUiDsl.g:80:1: ruleHead EOF
            {
             before(grammarAccess.getHeadRule()); 
            pushFollow(FOLLOW_1);
            ruleHead();

            state._fsp--;

             after(grammarAccess.getHeadRule()); 
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
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // InternalMyUiDsl.g:87:1: ruleHead : ( ( rule__Head__Group__0 ) ) ;
    public final void ruleHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:91:2: ( ( ( rule__Head__Group__0 ) ) )
            // InternalMyUiDsl.g:92:2: ( ( rule__Head__Group__0 ) )
            {
            // InternalMyUiDsl.g:92:2: ( ( rule__Head__Group__0 ) )
            // InternalMyUiDsl.g:93:3: ( rule__Head__Group__0 )
            {
             before(grammarAccess.getHeadAccess().getGroup()); 
            // InternalMyUiDsl.g:94:3: ( rule__Head__Group__0 )
            // InternalMyUiDsl.g:94:4: rule__Head__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Head__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleHeadType"
    // InternalMyUiDsl.g:103:1: entryRuleHeadType : ruleHeadType EOF ;
    public final void entryRuleHeadType() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:104:1: ( ruleHeadType EOF )
            // InternalMyUiDsl.g:105:1: ruleHeadType EOF
            {
             before(grammarAccess.getHeadTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleHeadType();

            state._fsp--;

             after(grammarAccess.getHeadTypeRule()); 
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
    // $ANTLR end "entryRuleHeadType"


    // $ANTLR start "ruleHeadType"
    // InternalMyUiDsl.g:112:1: ruleHeadType : ( ( rule__HeadType__Alternatives ) ) ;
    public final void ruleHeadType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:116:2: ( ( ( rule__HeadType__Alternatives ) ) )
            // InternalMyUiDsl.g:117:2: ( ( rule__HeadType__Alternatives ) )
            {
            // InternalMyUiDsl.g:117:2: ( ( rule__HeadType__Alternatives ) )
            // InternalMyUiDsl.g:118:3: ( rule__HeadType__Alternatives )
            {
             before(grammarAccess.getHeadTypeAccess().getAlternatives()); 
            // InternalMyUiDsl.g:119:3: ( rule__HeadType__Alternatives )
            // InternalMyUiDsl.g:119:4: rule__HeadType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HeadType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHeadTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeadType"


    // $ANTLR start "entryRuleBody"
    // InternalMyUiDsl.g:128:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:129:1: ( ruleBody EOF )
            // InternalMyUiDsl.g:130:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getBodyRule()); 
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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalMyUiDsl.g:137:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:141:2: ( ( ( rule__Body__Group__0 ) ) )
            // InternalMyUiDsl.g:142:2: ( ( rule__Body__Group__0 ) )
            {
            // InternalMyUiDsl.g:142:2: ( ( rule__Body__Group__0 ) )
            // InternalMyUiDsl.g:143:3: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // InternalMyUiDsl.g:144:3: ( rule__Body__Group__0 )
            // InternalMyUiDsl.g:144:4: rule__Body__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleNode"
    // InternalMyUiDsl.g:153:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:154:1: ( ruleNode EOF )
            // InternalMyUiDsl.g:155:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalMyUiDsl.g:162:1: ruleNode : ( ( rule__Node__NameAssignment ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:166:2: ( ( ( rule__Node__NameAssignment ) ) )
            // InternalMyUiDsl.g:167:2: ( ( rule__Node__NameAssignment ) )
            {
            // InternalMyUiDsl.g:167:2: ( ( rule__Node__NameAssignment ) )
            // InternalMyUiDsl.g:168:3: ( rule__Node__NameAssignment )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment()); 
            // InternalMyUiDsl.g:169:3: ( rule__Node__NameAssignment )
            // InternalMyUiDsl.g:169:4: rule__Node__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleSelfRepeat"
    // InternalMyUiDsl.g:178:1: entryRuleSelfRepeat : ruleSelfRepeat EOF ;
    public final void entryRuleSelfRepeat() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:179:1: ( ruleSelfRepeat EOF )
            // InternalMyUiDsl.g:180:1: ruleSelfRepeat EOF
            {
             before(grammarAccess.getSelfRepeatRule()); 
            pushFollow(FOLLOW_1);
            ruleSelfRepeat();

            state._fsp--;

             after(grammarAccess.getSelfRepeatRule()); 
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
    // $ANTLR end "entryRuleSelfRepeat"


    // $ANTLR start "ruleSelfRepeat"
    // InternalMyUiDsl.g:187:1: ruleSelfRepeat : ( ( rule__SelfRepeat__Group__0 ) ) ;
    public final void ruleSelfRepeat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:191:2: ( ( ( rule__SelfRepeat__Group__0 ) ) )
            // InternalMyUiDsl.g:192:2: ( ( rule__SelfRepeat__Group__0 ) )
            {
            // InternalMyUiDsl.g:192:2: ( ( rule__SelfRepeat__Group__0 ) )
            // InternalMyUiDsl.g:193:3: ( rule__SelfRepeat__Group__0 )
            {
             before(grammarAccess.getSelfRepeatAccess().getGroup()); 
            // InternalMyUiDsl.g:194:3: ( rule__SelfRepeat__Group__0 )
            // InternalMyUiDsl.g:194:4: rule__SelfRepeat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelfRepeat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelfRepeatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelfRepeat"


    // $ANTLR start "entryRuleAccessory"
    // InternalMyUiDsl.g:203:1: entryRuleAccessory : ruleAccessory EOF ;
    public final void entryRuleAccessory() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:204:1: ( ruleAccessory EOF )
            // InternalMyUiDsl.g:205:1: ruleAccessory EOF
            {
             before(grammarAccess.getAccessoryRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessory();

            state._fsp--;

             after(grammarAccess.getAccessoryRule()); 
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
    // $ANTLR end "entryRuleAccessory"


    // $ANTLR start "ruleAccessory"
    // InternalMyUiDsl.g:212:1: ruleAccessory : ( ( rule__Accessory__Group__0 ) ) ;
    public final void ruleAccessory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:216:2: ( ( ( rule__Accessory__Group__0 ) ) )
            // InternalMyUiDsl.g:217:2: ( ( rule__Accessory__Group__0 ) )
            {
            // InternalMyUiDsl.g:217:2: ( ( rule__Accessory__Group__0 ) )
            // InternalMyUiDsl.g:218:3: ( rule__Accessory__Group__0 )
            {
             before(grammarAccess.getAccessoryAccess().getGroup()); 
            // InternalMyUiDsl.g:219:3: ( rule__Accessory__Group__0 )
            // InternalMyUiDsl.g:219:4: rule__Accessory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Accessory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessory"


    // $ANTLR start "entryRuleInnerFeature"
    // InternalMyUiDsl.g:228:1: entryRuleInnerFeature : ruleInnerFeature EOF ;
    public final void entryRuleInnerFeature() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:229:1: ( ruleInnerFeature EOF )
            // InternalMyUiDsl.g:230:1: ruleInnerFeature EOF
            {
             before(grammarAccess.getInnerFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleInnerFeature();

            state._fsp--;

             after(grammarAccess.getInnerFeatureRule()); 
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
    // $ANTLR end "entryRuleInnerFeature"


    // $ANTLR start "ruleInnerFeature"
    // InternalMyUiDsl.g:237:1: ruleInnerFeature : ( ( rule__InnerFeature__Group__0 ) ) ;
    public final void ruleInnerFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:241:2: ( ( ( rule__InnerFeature__Group__0 ) ) )
            // InternalMyUiDsl.g:242:2: ( ( rule__InnerFeature__Group__0 ) )
            {
            // InternalMyUiDsl.g:242:2: ( ( rule__InnerFeature__Group__0 ) )
            // InternalMyUiDsl.g:243:3: ( rule__InnerFeature__Group__0 )
            {
             before(grammarAccess.getInnerFeatureAccess().getGroup()); 
            // InternalMyUiDsl.g:244:3: ( rule__InnerFeature__Group__0 )
            // InternalMyUiDsl.g:244:4: rule__InnerFeature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InnerFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInnerFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInnerFeature"


    // $ANTLR start "entryRuleInnerText"
    // InternalMyUiDsl.g:253:1: entryRuleInnerText : ruleInnerText EOF ;
    public final void entryRuleInnerText() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:254:1: ( ruleInnerText EOF )
            // InternalMyUiDsl.g:255:1: ruleInnerText EOF
            {
             before(grammarAccess.getInnerTextRule()); 
            pushFollow(FOLLOW_1);
            ruleInnerText();

            state._fsp--;

             after(grammarAccess.getInnerTextRule()); 
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
    // $ANTLR end "entryRuleInnerText"


    // $ANTLR start "ruleInnerText"
    // InternalMyUiDsl.g:262:1: ruleInnerText : ( ( rule__InnerText__Group__0 ) ) ;
    public final void ruleInnerText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:266:2: ( ( ( rule__InnerText__Group__0 ) ) )
            // InternalMyUiDsl.g:267:2: ( ( rule__InnerText__Group__0 ) )
            {
            // InternalMyUiDsl.g:267:2: ( ( rule__InnerText__Group__0 ) )
            // InternalMyUiDsl.g:268:3: ( rule__InnerText__Group__0 )
            {
             before(grammarAccess.getInnerTextAccess().getGroup()); 
            // InternalMyUiDsl.g:269:3: ( rule__InnerText__Group__0 )
            // InternalMyUiDsl.g:269:4: rule__InnerText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InnerText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInnerTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInnerText"


    // $ANTLR start "entryRuleInnerStyle"
    // InternalMyUiDsl.g:278:1: entryRuleInnerStyle : ruleInnerStyle EOF ;
    public final void entryRuleInnerStyle() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:279:1: ( ruleInnerStyle EOF )
            // InternalMyUiDsl.g:280:1: ruleInnerStyle EOF
            {
             before(grammarAccess.getInnerStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleInnerStyle();

            state._fsp--;

             after(grammarAccess.getInnerStyleRule()); 
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
    // $ANTLR end "entryRuleInnerStyle"


    // $ANTLR start "ruleInnerStyle"
    // InternalMyUiDsl.g:287:1: ruleInnerStyle : ( ( rule__InnerStyle__Group__0 ) ) ;
    public final void ruleInnerStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:291:2: ( ( ( rule__InnerStyle__Group__0 ) ) )
            // InternalMyUiDsl.g:292:2: ( ( rule__InnerStyle__Group__0 ) )
            {
            // InternalMyUiDsl.g:292:2: ( ( rule__InnerStyle__Group__0 ) )
            // InternalMyUiDsl.g:293:3: ( rule__InnerStyle__Group__0 )
            {
             before(grammarAccess.getInnerStyleAccess().getGroup()); 
            // InternalMyUiDsl.g:294:3: ( rule__InnerStyle__Group__0 )
            // InternalMyUiDsl.g:294:4: rule__InnerStyle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InnerStyle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInnerStyleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInnerStyle"


    // $ANTLR start "entryRuleInnerClass"
    // InternalMyUiDsl.g:303:1: entryRuleInnerClass : ruleInnerClass EOF ;
    public final void entryRuleInnerClass() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:304:1: ( ruleInnerClass EOF )
            // InternalMyUiDsl.g:305:1: ruleInnerClass EOF
            {
             before(grammarAccess.getInnerClassRule()); 
            pushFollow(FOLLOW_1);
            ruleInnerClass();

            state._fsp--;

             after(grammarAccess.getInnerClassRule()); 
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
    // $ANTLR end "entryRuleInnerClass"


    // $ANTLR start "ruleInnerClass"
    // InternalMyUiDsl.g:312:1: ruleInnerClass : ( ( rule__InnerClass__Group__0 ) ) ;
    public final void ruleInnerClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:316:2: ( ( ( rule__InnerClass__Group__0 ) ) )
            // InternalMyUiDsl.g:317:2: ( ( rule__InnerClass__Group__0 ) )
            {
            // InternalMyUiDsl.g:317:2: ( ( rule__InnerClass__Group__0 ) )
            // InternalMyUiDsl.g:318:3: ( rule__InnerClass__Group__0 )
            {
             before(grammarAccess.getInnerClassAccess().getGroup()); 
            // InternalMyUiDsl.g:319:3: ( rule__InnerClass__Group__0 )
            // InternalMyUiDsl.g:319:4: rule__InnerClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InnerClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInnerClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInnerClass"


    // $ANTLR start "entryRuleClassName"
    // InternalMyUiDsl.g:328:1: entryRuleClassName : ruleClassName EOF ;
    public final void entryRuleClassName() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:329:1: ( ruleClassName EOF )
            // InternalMyUiDsl.g:330:1: ruleClassName EOF
            {
             before(grammarAccess.getClassNameRule()); 
            pushFollow(FOLLOW_1);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getClassNameRule()); 
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
    // $ANTLR end "entryRuleClassName"


    // $ANTLR start "ruleClassName"
    // InternalMyUiDsl.g:337:1: ruleClassName : ( ( rule__ClassName__Group__0 ) ) ;
    public final void ruleClassName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:341:2: ( ( ( rule__ClassName__Group__0 ) ) )
            // InternalMyUiDsl.g:342:2: ( ( rule__ClassName__Group__0 ) )
            {
            // InternalMyUiDsl.g:342:2: ( ( rule__ClassName__Group__0 ) )
            // InternalMyUiDsl.g:343:3: ( rule__ClassName__Group__0 )
            {
             before(grammarAccess.getClassNameAccess().getGroup()); 
            // InternalMyUiDsl.g:344:3: ( rule__ClassName__Group__0 )
            // InternalMyUiDsl.g:344:4: rule__ClassName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassName"


    // $ANTLR start "entryRuleClassNameSec"
    // InternalMyUiDsl.g:353:1: entryRuleClassNameSec : ruleClassNameSec EOF ;
    public final void entryRuleClassNameSec() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:354:1: ( ruleClassNameSec EOF )
            // InternalMyUiDsl.g:355:1: ruleClassNameSec EOF
            {
             before(grammarAccess.getClassNameSecRule()); 
            pushFollow(FOLLOW_1);
            ruleClassNameSec();

            state._fsp--;

             after(grammarAccess.getClassNameSecRule()); 
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
    // $ANTLR end "entryRuleClassNameSec"


    // $ANTLR start "ruleClassNameSec"
    // InternalMyUiDsl.g:362:1: ruleClassNameSec : ( ( rule__ClassNameSec__Group__0 ) ) ;
    public final void ruleClassNameSec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:366:2: ( ( ( rule__ClassNameSec__Group__0 ) ) )
            // InternalMyUiDsl.g:367:2: ( ( rule__ClassNameSec__Group__0 ) )
            {
            // InternalMyUiDsl.g:367:2: ( ( rule__ClassNameSec__Group__0 ) )
            // InternalMyUiDsl.g:368:3: ( rule__ClassNameSec__Group__0 )
            {
             before(grammarAccess.getClassNameSecAccess().getGroup()); 
            // InternalMyUiDsl.g:369:3: ( rule__ClassNameSec__Group__0 )
            // InternalMyUiDsl.g:369:4: rule__ClassNameSec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassNameSec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassNameSecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassNameSec"


    // $ANTLR start "entryRuleInnerType"
    // InternalMyUiDsl.g:378:1: entryRuleInnerType : ruleInnerType EOF ;
    public final void entryRuleInnerType() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:379:1: ( ruleInnerType EOF )
            // InternalMyUiDsl.g:380:1: ruleInnerType EOF
            {
             before(grammarAccess.getInnerTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleInnerType();

            state._fsp--;

             after(grammarAccess.getInnerTypeRule()); 
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
    // $ANTLR end "entryRuleInnerType"


    // $ANTLR start "ruleInnerType"
    // InternalMyUiDsl.g:387:1: ruleInnerType : ( ( rule__InnerType__Group__0 ) ) ;
    public final void ruleInnerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:391:2: ( ( ( rule__InnerType__Group__0 ) ) )
            // InternalMyUiDsl.g:392:2: ( ( rule__InnerType__Group__0 ) )
            {
            // InternalMyUiDsl.g:392:2: ( ( rule__InnerType__Group__0 ) )
            // InternalMyUiDsl.g:393:3: ( rule__InnerType__Group__0 )
            {
             before(grammarAccess.getInnerTypeAccess().getGroup()); 
            // InternalMyUiDsl.g:394:3: ( rule__InnerType__Group__0 )
            // InternalMyUiDsl.g:394:4: rule__InnerType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InnerType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInnerTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInnerType"


    // $ANTLR start "entryRuleCssStyle"
    // InternalMyUiDsl.g:403:1: entryRuleCssStyle : ruleCssStyle EOF ;
    public final void entryRuleCssStyle() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:404:1: ( ruleCssStyle EOF )
            // InternalMyUiDsl.g:405:1: ruleCssStyle EOF
            {
             before(grammarAccess.getCssStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleCssStyle();

            state._fsp--;

             after(grammarAccess.getCssStyleRule()); 
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
    // $ANTLR end "entryRuleCssStyle"


    // $ANTLR start "ruleCssStyle"
    // InternalMyUiDsl.g:412:1: ruleCssStyle : ( ( rule__CssStyle__Group__0 ) ) ;
    public final void ruleCssStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:416:2: ( ( ( rule__CssStyle__Group__0 ) ) )
            // InternalMyUiDsl.g:417:2: ( ( rule__CssStyle__Group__0 ) )
            {
            // InternalMyUiDsl.g:417:2: ( ( rule__CssStyle__Group__0 ) )
            // InternalMyUiDsl.g:418:3: ( rule__CssStyle__Group__0 )
            {
             before(grammarAccess.getCssStyleAccess().getGroup()); 
            // InternalMyUiDsl.g:419:3: ( rule__CssStyle__Group__0 )
            // InternalMyUiDsl.g:419:4: rule__CssStyle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CssStyle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCssStyleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCssStyle"


    // $ANTLR start "entryRuleBorder"
    // InternalMyUiDsl.g:428:1: entryRuleBorder : ruleBorder EOF ;
    public final void entryRuleBorder() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:429:1: ( ruleBorder EOF )
            // InternalMyUiDsl.g:430:1: ruleBorder EOF
            {
             before(grammarAccess.getBorderRule()); 
            pushFollow(FOLLOW_1);
            ruleBorder();

            state._fsp--;

             after(grammarAccess.getBorderRule()); 
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
    // $ANTLR end "entryRuleBorder"


    // $ANTLR start "ruleBorder"
    // InternalMyUiDsl.g:437:1: ruleBorder : ( ( rule__Border__Group__0 ) ) ;
    public final void ruleBorder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:441:2: ( ( ( rule__Border__Group__0 ) ) )
            // InternalMyUiDsl.g:442:2: ( ( rule__Border__Group__0 ) )
            {
            // InternalMyUiDsl.g:442:2: ( ( rule__Border__Group__0 ) )
            // InternalMyUiDsl.g:443:3: ( rule__Border__Group__0 )
            {
             before(grammarAccess.getBorderAccess().getGroup()); 
            // InternalMyUiDsl.g:444:3: ( rule__Border__Group__0 )
            // InternalMyUiDsl.g:444:4: rule__Border__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Border__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBorderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBorder"


    // $ANTLR start "entryRuleColor"
    // InternalMyUiDsl.g:453:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:454:1: ( ruleColor EOF )
            // InternalMyUiDsl.g:455:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalMyUiDsl.g:462:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:466:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalMyUiDsl.g:467:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalMyUiDsl.g:467:2: ( ( rule__Color__Group__0 ) )
            // InternalMyUiDsl.g:468:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalMyUiDsl.g:469:3: ( rule__Color__Group__0 )
            // InternalMyUiDsl.g:469:4: rule__Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleBackColor"
    // InternalMyUiDsl.g:478:1: entryRuleBackColor : ruleBackColor EOF ;
    public final void entryRuleBackColor() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:479:1: ( ruleBackColor EOF )
            // InternalMyUiDsl.g:480:1: ruleBackColor EOF
            {
             before(grammarAccess.getBackColorRule()); 
            pushFollow(FOLLOW_1);
            ruleBackColor();

            state._fsp--;

             after(grammarAccess.getBackColorRule()); 
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
    // $ANTLR end "entryRuleBackColor"


    // $ANTLR start "ruleBackColor"
    // InternalMyUiDsl.g:487:1: ruleBackColor : ( ( rule__BackColor__Group__0 ) ) ;
    public final void ruleBackColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:491:2: ( ( ( rule__BackColor__Group__0 ) ) )
            // InternalMyUiDsl.g:492:2: ( ( rule__BackColor__Group__0 ) )
            {
            // InternalMyUiDsl.g:492:2: ( ( rule__BackColor__Group__0 ) )
            // InternalMyUiDsl.g:493:3: ( rule__BackColor__Group__0 )
            {
             before(grammarAccess.getBackColorAccess().getGroup()); 
            // InternalMyUiDsl.g:494:3: ( rule__BackColor__Group__0 )
            // InternalMyUiDsl.g:494:4: rule__BackColor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BackColor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackColor"


    // $ANTLR start "entryRulecolorDef"
    // InternalMyUiDsl.g:503:1: entryRulecolorDef : rulecolorDef EOF ;
    public final void entryRulecolorDef() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:504:1: ( rulecolorDef EOF )
            // InternalMyUiDsl.g:505:1: rulecolorDef EOF
            {
             before(grammarAccess.getColorDefRule()); 
            pushFollow(FOLLOW_1);
            rulecolorDef();

            state._fsp--;

             after(grammarAccess.getColorDefRule()); 
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
    // $ANTLR end "entryRulecolorDef"


    // $ANTLR start "rulecolorDef"
    // InternalMyUiDsl.g:512:1: rulecolorDef : ( ( rule__ColorDef__Alternatives ) ) ;
    public final void rulecolorDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:516:2: ( ( ( rule__ColorDef__Alternatives ) ) )
            // InternalMyUiDsl.g:517:2: ( ( rule__ColorDef__Alternatives ) )
            {
            // InternalMyUiDsl.g:517:2: ( ( rule__ColorDef__Alternatives ) )
            // InternalMyUiDsl.g:518:3: ( rule__ColorDef__Alternatives )
            {
             before(grammarAccess.getColorDefAccess().getAlternatives()); 
            // InternalMyUiDsl.g:519:3: ( rule__ColorDef__Alternatives )
            // InternalMyUiDsl.g:519:4: rule__ColorDef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColorDef__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorDefAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecolorDef"


    // $ANTLR start "entryRuleLiteralColor"
    // InternalMyUiDsl.g:528:1: entryRuleLiteralColor : ruleLiteralColor EOF ;
    public final void entryRuleLiteralColor() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:529:1: ( ruleLiteralColor EOF )
            // InternalMyUiDsl.g:530:1: ruleLiteralColor EOF
            {
             before(grammarAccess.getLiteralColorRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralColor();

            state._fsp--;

             after(grammarAccess.getLiteralColorRule()); 
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
    // $ANTLR end "entryRuleLiteralColor"


    // $ANTLR start "ruleLiteralColor"
    // InternalMyUiDsl.g:537:1: ruleLiteralColor : ( ( rule__LiteralColor__ValueAssignment ) ) ;
    public final void ruleLiteralColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:541:2: ( ( ( rule__LiteralColor__ValueAssignment ) ) )
            // InternalMyUiDsl.g:542:2: ( ( rule__LiteralColor__ValueAssignment ) )
            {
            // InternalMyUiDsl.g:542:2: ( ( rule__LiteralColor__ValueAssignment ) )
            // InternalMyUiDsl.g:543:3: ( rule__LiteralColor__ValueAssignment )
            {
             before(grammarAccess.getLiteralColorAccess().getValueAssignment()); 
            // InternalMyUiDsl.g:544:3: ( rule__LiteralColor__ValueAssignment )
            // InternalMyUiDsl.g:544:4: rule__LiteralColor__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralColor__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralColorAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralColor"


    // $ANTLR start "entryRuleRgbaColor"
    // InternalMyUiDsl.g:553:1: entryRuleRgbaColor : ruleRgbaColor EOF ;
    public final void entryRuleRgbaColor() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:554:1: ( ruleRgbaColor EOF )
            // InternalMyUiDsl.g:555:1: ruleRgbaColor EOF
            {
             before(grammarAccess.getRgbaColorRule()); 
            pushFollow(FOLLOW_1);
            ruleRgbaColor();

            state._fsp--;

             after(grammarAccess.getRgbaColorRule()); 
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
    // $ANTLR end "entryRuleRgbaColor"


    // $ANTLR start "ruleRgbaColor"
    // InternalMyUiDsl.g:562:1: ruleRgbaColor : ( ( rule__RgbaColor__Group__0 ) ) ;
    public final void ruleRgbaColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:566:2: ( ( ( rule__RgbaColor__Group__0 ) ) )
            // InternalMyUiDsl.g:567:2: ( ( rule__RgbaColor__Group__0 ) )
            {
            // InternalMyUiDsl.g:567:2: ( ( rule__RgbaColor__Group__0 ) )
            // InternalMyUiDsl.g:568:3: ( rule__RgbaColor__Group__0 )
            {
             before(grammarAccess.getRgbaColorAccess().getGroup()); 
            // InternalMyUiDsl.g:569:3: ( rule__RgbaColor__Group__0 )
            // InternalMyUiDsl.g:569:4: rule__RgbaColor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RgbaColor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRgbaColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRgbaColor"


    // $ANTLR start "entryRuleRval"
    // InternalMyUiDsl.g:578:1: entryRuleRval : ruleRval EOF ;
    public final void entryRuleRval() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:579:1: ( ruleRval EOF )
            // InternalMyUiDsl.g:580:1: ruleRval EOF
            {
             before(grammarAccess.getRvalRule()); 
            pushFollow(FOLLOW_1);
            ruleRval();

            state._fsp--;

             after(grammarAccess.getRvalRule()); 
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
    // $ANTLR end "entryRuleRval"


    // $ANTLR start "ruleRval"
    // InternalMyUiDsl.g:587:1: ruleRval : ( ( rule__Rval__Group__0 ) ) ;
    public final void ruleRval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:591:2: ( ( ( rule__Rval__Group__0 ) ) )
            // InternalMyUiDsl.g:592:2: ( ( rule__Rval__Group__0 ) )
            {
            // InternalMyUiDsl.g:592:2: ( ( rule__Rval__Group__0 ) )
            // InternalMyUiDsl.g:593:3: ( rule__Rval__Group__0 )
            {
             before(grammarAccess.getRvalAccess().getGroup()); 
            // InternalMyUiDsl.g:594:3: ( rule__Rval__Group__0 )
            // InternalMyUiDsl.g:594:4: rule__Rval__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rval__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRvalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRval"


    // $ANTLR start "entryRuleGval"
    // InternalMyUiDsl.g:603:1: entryRuleGval : ruleGval EOF ;
    public final void entryRuleGval() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:604:1: ( ruleGval EOF )
            // InternalMyUiDsl.g:605:1: ruleGval EOF
            {
             before(grammarAccess.getGvalRule()); 
            pushFollow(FOLLOW_1);
            ruleGval();

            state._fsp--;

             after(grammarAccess.getGvalRule()); 
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
    // $ANTLR end "entryRuleGval"


    // $ANTLR start "ruleGval"
    // InternalMyUiDsl.g:612:1: ruleGval : ( ( rule__Gval__Group__0 ) ) ;
    public final void ruleGval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:616:2: ( ( ( rule__Gval__Group__0 ) ) )
            // InternalMyUiDsl.g:617:2: ( ( rule__Gval__Group__0 ) )
            {
            // InternalMyUiDsl.g:617:2: ( ( rule__Gval__Group__0 ) )
            // InternalMyUiDsl.g:618:3: ( rule__Gval__Group__0 )
            {
             before(grammarAccess.getGvalAccess().getGroup()); 
            // InternalMyUiDsl.g:619:3: ( rule__Gval__Group__0 )
            // InternalMyUiDsl.g:619:4: rule__Gval__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Gval__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGvalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGval"


    // $ANTLR start "entryRuleBval"
    // InternalMyUiDsl.g:628:1: entryRuleBval : ruleBval EOF ;
    public final void entryRuleBval() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:629:1: ( ruleBval EOF )
            // InternalMyUiDsl.g:630:1: ruleBval EOF
            {
             before(grammarAccess.getBvalRule()); 
            pushFollow(FOLLOW_1);
            ruleBval();

            state._fsp--;

             after(grammarAccess.getBvalRule()); 
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
    // $ANTLR end "entryRuleBval"


    // $ANTLR start "ruleBval"
    // InternalMyUiDsl.g:637:1: ruleBval : ( ( rule__Bval__Group__0 ) ) ;
    public final void ruleBval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:641:2: ( ( ( rule__Bval__Group__0 ) ) )
            // InternalMyUiDsl.g:642:2: ( ( rule__Bval__Group__0 ) )
            {
            // InternalMyUiDsl.g:642:2: ( ( rule__Bval__Group__0 ) )
            // InternalMyUiDsl.g:643:3: ( rule__Bval__Group__0 )
            {
             before(grammarAccess.getBvalAccess().getGroup()); 
            // InternalMyUiDsl.g:644:3: ( rule__Bval__Group__0 )
            // InternalMyUiDsl.g:644:4: rule__Bval__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bval__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBvalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBval"


    // $ANTLR start "entryRuleAval"
    // InternalMyUiDsl.g:653:1: entryRuleAval : ruleAval EOF ;
    public final void entryRuleAval() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:654:1: ( ruleAval EOF )
            // InternalMyUiDsl.g:655:1: ruleAval EOF
            {
             before(grammarAccess.getAvalRule()); 
            pushFollow(FOLLOW_1);
            ruleAval();

            state._fsp--;

             after(grammarAccess.getAvalRule()); 
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
    // $ANTLR end "entryRuleAval"


    // $ANTLR start "ruleAval"
    // InternalMyUiDsl.g:662:1: ruleAval : ( ( rule__Aval__Group__0 ) ) ;
    public final void ruleAval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:666:2: ( ( ( rule__Aval__Group__0 ) ) )
            // InternalMyUiDsl.g:667:2: ( ( rule__Aval__Group__0 ) )
            {
            // InternalMyUiDsl.g:667:2: ( ( rule__Aval__Group__0 ) )
            // InternalMyUiDsl.g:668:3: ( rule__Aval__Group__0 )
            {
             before(grammarAccess.getAvalAccess().getGroup()); 
            // InternalMyUiDsl.g:669:3: ( rule__Aval__Group__0 )
            // InternalMyUiDsl.g:669:4: rule__Aval__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Aval__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAvalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAval"


    // $ANTLR start "entryRuleBorderRad"
    // InternalMyUiDsl.g:678:1: entryRuleBorderRad : ruleBorderRad EOF ;
    public final void entryRuleBorderRad() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:679:1: ( ruleBorderRad EOF )
            // InternalMyUiDsl.g:680:1: ruleBorderRad EOF
            {
             before(grammarAccess.getBorderRadRule()); 
            pushFollow(FOLLOW_1);
            ruleBorderRad();

            state._fsp--;

             after(grammarAccess.getBorderRadRule()); 
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
    // $ANTLR end "entryRuleBorderRad"


    // $ANTLR start "ruleBorderRad"
    // InternalMyUiDsl.g:687:1: ruleBorderRad : ( ( rule__BorderRad__Group__0 ) ) ;
    public final void ruleBorderRad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:691:2: ( ( ( rule__BorderRad__Group__0 ) ) )
            // InternalMyUiDsl.g:692:2: ( ( rule__BorderRad__Group__0 ) )
            {
            // InternalMyUiDsl.g:692:2: ( ( rule__BorderRad__Group__0 ) )
            // InternalMyUiDsl.g:693:3: ( rule__BorderRad__Group__0 )
            {
             before(grammarAccess.getBorderRadAccess().getGroup()); 
            // InternalMyUiDsl.g:694:3: ( rule__BorderRad__Group__0 )
            // InternalMyUiDsl.g:694:4: rule__BorderRad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BorderRad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBorderRadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBorderRad"


    // $ANTLR start "entryRulePos"
    // InternalMyUiDsl.g:703:1: entryRulePos : rulePos EOF ;
    public final void entryRulePos() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:704:1: ( rulePos EOF )
            // InternalMyUiDsl.g:705:1: rulePos EOF
            {
             before(grammarAccess.getPosRule()); 
            pushFollow(FOLLOW_1);
            rulePos();

            state._fsp--;

             after(grammarAccess.getPosRule()); 
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
    // $ANTLR end "entryRulePos"


    // $ANTLR start "rulePos"
    // InternalMyUiDsl.g:712:1: rulePos : ( ( rule__Pos__Group__0 ) ) ;
    public final void rulePos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:716:2: ( ( ( rule__Pos__Group__0 ) ) )
            // InternalMyUiDsl.g:717:2: ( ( rule__Pos__Group__0 ) )
            {
            // InternalMyUiDsl.g:717:2: ( ( rule__Pos__Group__0 ) )
            // InternalMyUiDsl.g:718:3: ( rule__Pos__Group__0 )
            {
             before(grammarAccess.getPosAccess().getGroup()); 
            // InternalMyUiDsl.g:719:3: ( rule__Pos__Group__0 )
            // InternalMyUiDsl.g:719:4: rule__Pos__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pos__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPosAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePos"


    // $ANTLR start "entryRuleFlt"
    // InternalMyUiDsl.g:728:1: entryRuleFlt : ruleFlt EOF ;
    public final void entryRuleFlt() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:729:1: ( ruleFlt EOF )
            // InternalMyUiDsl.g:730:1: ruleFlt EOF
            {
             before(grammarAccess.getFltRule()); 
            pushFollow(FOLLOW_1);
            ruleFlt();

            state._fsp--;

             after(grammarAccess.getFltRule()); 
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
    // $ANTLR end "entryRuleFlt"


    // $ANTLR start "ruleFlt"
    // InternalMyUiDsl.g:737:1: ruleFlt : ( ( rule__Flt__Group__0 ) ) ;
    public final void ruleFlt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:741:2: ( ( ( rule__Flt__Group__0 ) ) )
            // InternalMyUiDsl.g:742:2: ( ( rule__Flt__Group__0 ) )
            {
            // InternalMyUiDsl.g:742:2: ( ( rule__Flt__Group__0 ) )
            // InternalMyUiDsl.g:743:3: ( rule__Flt__Group__0 )
            {
             before(grammarAccess.getFltAccess().getGroup()); 
            // InternalMyUiDsl.g:744:3: ( rule__Flt__Group__0 )
            // InternalMyUiDsl.g:744:4: rule__Flt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Flt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFltAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFlt"


    // $ANTLR start "entryRuleClr"
    // InternalMyUiDsl.g:753:1: entryRuleClr : ruleClr EOF ;
    public final void entryRuleClr() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:754:1: ( ruleClr EOF )
            // InternalMyUiDsl.g:755:1: ruleClr EOF
            {
             before(grammarAccess.getClrRule()); 
            pushFollow(FOLLOW_1);
            ruleClr();

            state._fsp--;

             after(grammarAccess.getClrRule()); 
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
    // $ANTLR end "entryRuleClr"


    // $ANTLR start "ruleClr"
    // InternalMyUiDsl.g:762:1: ruleClr : ( ( rule__Clr__Group__0 ) ) ;
    public final void ruleClr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:766:2: ( ( ( rule__Clr__Group__0 ) ) )
            // InternalMyUiDsl.g:767:2: ( ( rule__Clr__Group__0 ) )
            {
            // InternalMyUiDsl.g:767:2: ( ( rule__Clr__Group__0 ) )
            // InternalMyUiDsl.g:768:3: ( rule__Clr__Group__0 )
            {
             before(grammarAccess.getClrAccess().getGroup()); 
            // InternalMyUiDsl.g:769:3: ( rule__Clr__Group__0 )
            // InternalMyUiDsl.g:769:4: rule__Clr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClr"


    // $ANTLR start "entryRuleDisp"
    // InternalMyUiDsl.g:778:1: entryRuleDisp : ruleDisp EOF ;
    public final void entryRuleDisp() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:779:1: ( ruleDisp EOF )
            // InternalMyUiDsl.g:780:1: ruleDisp EOF
            {
             before(grammarAccess.getDispRule()); 
            pushFollow(FOLLOW_1);
            ruleDisp();

            state._fsp--;

             after(grammarAccess.getDispRule()); 
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
    // $ANTLR end "entryRuleDisp"


    // $ANTLR start "ruleDisp"
    // InternalMyUiDsl.g:787:1: ruleDisp : ( ( rule__Disp__Group__0 ) ) ;
    public final void ruleDisp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:791:2: ( ( ( rule__Disp__Group__0 ) ) )
            // InternalMyUiDsl.g:792:2: ( ( rule__Disp__Group__0 ) )
            {
            // InternalMyUiDsl.g:792:2: ( ( rule__Disp__Group__0 ) )
            // InternalMyUiDsl.g:793:3: ( rule__Disp__Group__0 )
            {
             before(grammarAccess.getDispAccess().getGroup()); 
            // InternalMyUiDsl.g:794:3: ( rule__Disp__Group__0 )
            // InternalMyUiDsl.g:794:4: rule__Disp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Disp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDispAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDisp"


    // $ANTLR start "entryRuleVerAl"
    // InternalMyUiDsl.g:803:1: entryRuleVerAl : ruleVerAl EOF ;
    public final void entryRuleVerAl() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:804:1: ( ruleVerAl EOF )
            // InternalMyUiDsl.g:805:1: ruleVerAl EOF
            {
             before(grammarAccess.getVerAlRule()); 
            pushFollow(FOLLOW_1);
            ruleVerAl();

            state._fsp--;

             after(grammarAccess.getVerAlRule()); 
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
    // $ANTLR end "entryRuleVerAl"


    // $ANTLR start "ruleVerAl"
    // InternalMyUiDsl.g:812:1: ruleVerAl : ( ( rule__VerAl__Group__0 ) ) ;
    public final void ruleVerAl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:816:2: ( ( ( rule__VerAl__Group__0 ) ) )
            // InternalMyUiDsl.g:817:2: ( ( rule__VerAl__Group__0 ) )
            {
            // InternalMyUiDsl.g:817:2: ( ( rule__VerAl__Group__0 ) )
            // InternalMyUiDsl.g:818:3: ( rule__VerAl__Group__0 )
            {
             before(grammarAccess.getVerAlAccess().getGroup()); 
            // InternalMyUiDsl.g:819:3: ( rule__VerAl__Group__0 )
            // InternalMyUiDsl.g:819:4: rule__VerAl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VerAl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerAlAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerAl"


    // $ANTLR start "entryRuleOFlow"
    // InternalMyUiDsl.g:828:1: entryRuleOFlow : ruleOFlow EOF ;
    public final void entryRuleOFlow() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:829:1: ( ruleOFlow EOF )
            // InternalMyUiDsl.g:830:1: ruleOFlow EOF
            {
             before(grammarAccess.getOFlowRule()); 
            pushFollow(FOLLOW_1);
            ruleOFlow();

            state._fsp--;

             after(grammarAccess.getOFlowRule()); 
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
    // $ANTLR end "entryRuleOFlow"


    // $ANTLR start "ruleOFlow"
    // InternalMyUiDsl.g:837:1: ruleOFlow : ( ( rule__OFlow__Group__0 ) ) ;
    public final void ruleOFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:841:2: ( ( ( rule__OFlow__Group__0 ) ) )
            // InternalMyUiDsl.g:842:2: ( ( rule__OFlow__Group__0 ) )
            {
            // InternalMyUiDsl.g:842:2: ( ( rule__OFlow__Group__0 ) )
            // InternalMyUiDsl.g:843:3: ( rule__OFlow__Group__0 )
            {
             before(grammarAccess.getOFlowAccess().getGroup()); 
            // InternalMyUiDsl.g:844:3: ( rule__OFlow__Group__0 )
            // InternalMyUiDsl.g:844:4: rule__OFlow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OFlow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOFlowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOFlow"


    // $ANTLR start "entryRuleWid"
    // InternalMyUiDsl.g:853:1: entryRuleWid : ruleWid EOF ;
    public final void entryRuleWid() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:854:1: ( ruleWid EOF )
            // InternalMyUiDsl.g:855:1: ruleWid EOF
            {
             before(grammarAccess.getWidRule()); 
            pushFollow(FOLLOW_1);
            ruleWid();

            state._fsp--;

             after(grammarAccess.getWidRule()); 
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
    // $ANTLR end "entryRuleWid"


    // $ANTLR start "ruleWid"
    // InternalMyUiDsl.g:862:1: ruleWid : ( ( rule__Wid__Group__0 ) ) ;
    public final void ruleWid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:866:2: ( ( ( rule__Wid__Group__0 ) ) )
            // InternalMyUiDsl.g:867:2: ( ( rule__Wid__Group__0 ) )
            {
            // InternalMyUiDsl.g:867:2: ( ( rule__Wid__Group__0 ) )
            // InternalMyUiDsl.g:868:3: ( rule__Wid__Group__0 )
            {
             before(grammarAccess.getWidAccess().getGroup()); 
            // InternalMyUiDsl.g:869:3: ( rule__Wid__Group__0 )
            // InternalMyUiDsl.g:869:4: rule__Wid__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Wid__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWidAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWid"


    // $ANTLR start "entryRuleH8"
    // InternalMyUiDsl.g:878:1: entryRuleH8 : ruleH8 EOF ;
    public final void entryRuleH8() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:879:1: ( ruleH8 EOF )
            // InternalMyUiDsl.g:880:1: ruleH8 EOF
            {
             before(grammarAccess.getH8Rule()); 
            pushFollow(FOLLOW_1);
            ruleH8();

            state._fsp--;

             after(grammarAccess.getH8Rule()); 
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
    // $ANTLR end "entryRuleH8"


    // $ANTLR start "ruleH8"
    // InternalMyUiDsl.g:887:1: ruleH8 : ( ( rule__H8__Group__0 ) ) ;
    public final void ruleH8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:891:2: ( ( ( rule__H8__Group__0 ) ) )
            // InternalMyUiDsl.g:892:2: ( ( rule__H8__Group__0 ) )
            {
            // InternalMyUiDsl.g:892:2: ( ( rule__H8__Group__0 ) )
            // InternalMyUiDsl.g:893:3: ( rule__H8__Group__0 )
            {
             before(grammarAccess.getH8Access().getGroup()); 
            // InternalMyUiDsl.g:894:3: ( rule__H8__Group__0 )
            // InternalMyUiDsl.g:894:4: rule__H8__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__H8__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getH8Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleH8"


    // $ANTLR start "entryRuleCoord"
    // InternalMyUiDsl.g:903:1: entryRuleCoord : ruleCoord EOF ;
    public final void entryRuleCoord() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:904:1: ( ruleCoord EOF )
            // InternalMyUiDsl.g:905:1: ruleCoord EOF
            {
             before(grammarAccess.getCoordRule()); 
            pushFollow(FOLLOW_1);
            ruleCoord();

            state._fsp--;

             after(grammarAccess.getCoordRule()); 
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
    // $ANTLR end "entryRuleCoord"


    // $ANTLR start "ruleCoord"
    // InternalMyUiDsl.g:912:1: ruleCoord : ( ( rule__Coord__Group__0 ) ) ;
    public final void ruleCoord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:916:2: ( ( ( rule__Coord__Group__0 ) ) )
            // InternalMyUiDsl.g:917:2: ( ( rule__Coord__Group__0 ) )
            {
            // InternalMyUiDsl.g:917:2: ( ( rule__Coord__Group__0 ) )
            // InternalMyUiDsl.g:918:3: ( rule__Coord__Group__0 )
            {
             before(grammarAccess.getCoordAccess().getGroup()); 
            // InternalMyUiDsl.g:919:3: ( rule__Coord__Group__0 )
            // InternalMyUiDsl.g:919:4: rule__Coord__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Coord__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoord"


    // $ANTLR start "entryRuleMarg"
    // InternalMyUiDsl.g:928:1: entryRuleMarg : ruleMarg EOF ;
    public final void entryRuleMarg() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:929:1: ( ruleMarg EOF )
            // InternalMyUiDsl.g:930:1: ruleMarg EOF
            {
             before(grammarAccess.getMargRule()); 
            pushFollow(FOLLOW_1);
            ruleMarg();

            state._fsp--;

             after(grammarAccess.getMargRule()); 
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
    // $ANTLR end "entryRuleMarg"


    // $ANTLR start "ruleMarg"
    // InternalMyUiDsl.g:937:1: ruleMarg : ( ( rule__Marg__Group__0 ) ) ;
    public final void ruleMarg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:941:2: ( ( ( rule__Marg__Group__0 ) ) )
            // InternalMyUiDsl.g:942:2: ( ( rule__Marg__Group__0 ) )
            {
            // InternalMyUiDsl.g:942:2: ( ( rule__Marg__Group__0 ) )
            // InternalMyUiDsl.g:943:3: ( rule__Marg__Group__0 )
            {
             before(grammarAccess.getMargAccess().getGroup()); 
            // InternalMyUiDsl.g:944:3: ( rule__Marg__Group__0 )
            // InternalMyUiDsl.g:944:4: rule__Marg__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Marg__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMargAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMarg"


    // $ANTLR start "entryRulePadd"
    // InternalMyUiDsl.g:953:1: entryRulePadd : rulePadd EOF ;
    public final void entryRulePadd() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:954:1: ( rulePadd EOF )
            // InternalMyUiDsl.g:955:1: rulePadd EOF
            {
             before(grammarAccess.getPaddRule()); 
            pushFollow(FOLLOW_1);
            rulePadd();

            state._fsp--;

             after(grammarAccess.getPaddRule()); 
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
    // $ANTLR end "entryRulePadd"


    // $ANTLR start "rulePadd"
    // InternalMyUiDsl.g:962:1: rulePadd : ( ( rule__Padd__Group__0 ) ) ;
    public final void rulePadd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:966:2: ( ( ( rule__Padd__Group__0 ) ) )
            // InternalMyUiDsl.g:967:2: ( ( rule__Padd__Group__0 ) )
            {
            // InternalMyUiDsl.g:967:2: ( ( rule__Padd__Group__0 ) )
            // InternalMyUiDsl.g:968:3: ( rule__Padd__Group__0 )
            {
             before(grammarAccess.getPaddAccess().getGroup()); 
            // InternalMyUiDsl.g:969:3: ( rule__Padd__Group__0 )
            // InternalMyUiDsl.g:969:4: rule__Padd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Padd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaddAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePadd"


    // $ANTLR start "entryRuleMinMaxValue"
    // InternalMyUiDsl.g:978:1: entryRuleMinMaxValue : ruleMinMaxValue EOF ;
    public final void entryRuleMinMaxValue() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:979:1: ( ruleMinMaxValue EOF )
            // InternalMyUiDsl.g:980:1: ruleMinMaxValue EOF
            {
             before(grammarAccess.getMinMaxValueRule()); 
            pushFollow(FOLLOW_1);
            ruleMinMaxValue();

            state._fsp--;

             after(grammarAccess.getMinMaxValueRule()); 
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
    // $ANTLR end "entryRuleMinMaxValue"


    // $ANTLR start "ruleMinMaxValue"
    // InternalMyUiDsl.g:987:1: ruleMinMaxValue : ( ( rule__MinMaxValue__Group__0 ) ) ;
    public final void ruleMinMaxValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:991:2: ( ( ( rule__MinMaxValue__Group__0 ) ) )
            // InternalMyUiDsl.g:992:2: ( ( rule__MinMaxValue__Group__0 ) )
            {
            // InternalMyUiDsl.g:992:2: ( ( rule__MinMaxValue__Group__0 ) )
            // InternalMyUiDsl.g:993:3: ( rule__MinMaxValue__Group__0 )
            {
             before(grammarAccess.getMinMaxValueAccess().getGroup()); 
            // InternalMyUiDsl.g:994:3: ( rule__MinMaxValue__Group__0 )
            // InternalMyUiDsl.g:994:4: rule__MinMaxValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinMaxValue"


    // $ANTLR start "entryRuleMinVal"
    // InternalMyUiDsl.g:1003:1: entryRuleMinVal : ruleMinVal EOF ;
    public final void entryRuleMinVal() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:1004:1: ( ruleMinVal EOF )
            // InternalMyUiDsl.g:1005:1: ruleMinVal EOF
            {
             before(grammarAccess.getMinValRule()); 
            pushFollow(FOLLOW_1);
            ruleMinVal();

            state._fsp--;

             after(grammarAccess.getMinValRule()); 
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
    // $ANTLR end "entryRuleMinVal"


    // $ANTLR start "ruleMinVal"
    // InternalMyUiDsl.g:1012:1: ruleMinVal : ( ( rule__MinVal__Group__0 ) ) ;
    public final void ruleMinVal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1016:2: ( ( ( rule__MinVal__Group__0 ) ) )
            // InternalMyUiDsl.g:1017:2: ( ( rule__MinVal__Group__0 ) )
            {
            // InternalMyUiDsl.g:1017:2: ( ( rule__MinVal__Group__0 ) )
            // InternalMyUiDsl.g:1018:3: ( rule__MinVal__Group__0 )
            {
             before(grammarAccess.getMinValAccess().getGroup()); 
            // InternalMyUiDsl.g:1019:3: ( rule__MinVal__Group__0 )
            // InternalMyUiDsl.g:1019:4: rule__MinVal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinVal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinValAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinVal"


    // $ANTLR start "entryRuleMaxVal"
    // InternalMyUiDsl.g:1028:1: entryRuleMaxVal : ruleMaxVal EOF ;
    public final void entryRuleMaxVal() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:1029:1: ( ruleMaxVal EOF )
            // InternalMyUiDsl.g:1030:1: ruleMaxVal EOF
            {
             before(grammarAccess.getMaxValRule()); 
            pushFollow(FOLLOW_1);
            ruleMaxVal();

            state._fsp--;

             after(grammarAccess.getMaxValRule()); 
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
    // $ANTLR end "entryRuleMaxVal"


    // $ANTLR start "ruleMaxVal"
    // InternalMyUiDsl.g:1037:1: ruleMaxVal : ( ( rule__MaxVal__Group__0 ) ) ;
    public final void ruleMaxVal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1041:2: ( ( ( rule__MaxVal__Group__0 ) ) )
            // InternalMyUiDsl.g:1042:2: ( ( rule__MaxVal__Group__0 ) )
            {
            // InternalMyUiDsl.g:1042:2: ( ( rule__MaxVal__Group__0 ) )
            // InternalMyUiDsl.g:1043:3: ( rule__MaxVal__Group__0 )
            {
             before(grammarAccess.getMaxValAccess().getGroup()); 
            // InternalMyUiDsl.g:1044:3: ( rule__MaxVal__Group__0 )
            // InternalMyUiDsl.g:1044:4: rule__MaxVal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxVal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxValAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaxVal"


    // $ANTLR start "entryRuleMidVal"
    // InternalMyUiDsl.g:1053:1: entryRuleMidVal : ruleMidVal EOF ;
    public final void entryRuleMidVal() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:1054:1: ( ruleMidVal EOF )
            // InternalMyUiDsl.g:1055:1: ruleMidVal EOF
            {
             before(grammarAccess.getMidValRule()); 
            pushFollow(FOLLOW_1);
            ruleMidVal();

            state._fsp--;

             after(grammarAccess.getMidValRule()); 
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
    // $ANTLR end "entryRuleMidVal"


    // $ANTLR start "ruleMidVal"
    // InternalMyUiDsl.g:1062:1: ruleMidVal : ( ( rule__MidVal__Group__0 ) ) ;
    public final void ruleMidVal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1066:2: ( ( ( rule__MidVal__Group__0 ) ) )
            // InternalMyUiDsl.g:1067:2: ( ( rule__MidVal__Group__0 ) )
            {
            // InternalMyUiDsl.g:1067:2: ( ( rule__MidVal__Group__0 ) )
            // InternalMyUiDsl.g:1068:3: ( rule__MidVal__Group__0 )
            {
             before(grammarAccess.getMidValAccess().getGroup()); 
            // InternalMyUiDsl.g:1069:3: ( rule__MidVal__Group__0 )
            // InternalMyUiDsl.g:1069:4: rule__MidVal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MidVal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMidValAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMidVal"


    // $ANTLR start "entryRuleFourAspect"
    // InternalMyUiDsl.g:1078:1: entryRuleFourAspect : ruleFourAspect EOF ;
    public final void entryRuleFourAspect() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:1079:1: ( ruleFourAspect EOF )
            // InternalMyUiDsl.g:1080:1: ruleFourAspect EOF
            {
             before(grammarAccess.getFourAspectRule()); 
            pushFollow(FOLLOW_1);
            ruleFourAspect();

            state._fsp--;

             after(grammarAccess.getFourAspectRule()); 
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
    // $ANTLR end "entryRuleFourAspect"


    // $ANTLR start "ruleFourAspect"
    // InternalMyUiDsl.g:1087:1: ruleFourAspect : ( ( rule__FourAspect__Group__0 ) ) ;
    public final void ruleFourAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1091:2: ( ( ( rule__FourAspect__Group__0 ) ) )
            // InternalMyUiDsl.g:1092:2: ( ( rule__FourAspect__Group__0 ) )
            {
            // InternalMyUiDsl.g:1092:2: ( ( rule__FourAspect__Group__0 ) )
            // InternalMyUiDsl.g:1093:3: ( rule__FourAspect__Group__0 )
            {
             before(grammarAccess.getFourAspectAccess().getGroup()); 
            // InternalMyUiDsl.g:1094:3: ( rule__FourAspect__Group__0 )
            // InternalMyUiDsl.g:1094:4: rule__FourAspect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FourAspect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFourAspectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFourAspect"


    // $ANTLR start "entryRuleLeftAspect"
    // InternalMyUiDsl.g:1103:1: entryRuleLeftAspect : ruleLeftAspect EOF ;
    public final void entryRuleLeftAspect() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:1104:1: ( ruleLeftAspect EOF )
            // InternalMyUiDsl.g:1105:1: ruleLeftAspect EOF
            {
             before(grammarAccess.getLeftAspectRule()); 
            pushFollow(FOLLOW_1);
            ruleLeftAspect();

            state._fsp--;

             after(grammarAccess.getLeftAspectRule()); 
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
    // $ANTLR end "entryRuleLeftAspect"


    // $ANTLR start "ruleLeftAspect"
    // InternalMyUiDsl.g:1112:1: ruleLeftAspect : ( ( rule__LeftAspect__Group__0 ) ) ;
    public final void ruleLeftAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1116:2: ( ( ( rule__LeftAspect__Group__0 ) ) )
            // InternalMyUiDsl.g:1117:2: ( ( rule__LeftAspect__Group__0 ) )
            {
            // InternalMyUiDsl.g:1117:2: ( ( rule__LeftAspect__Group__0 ) )
            // InternalMyUiDsl.g:1118:3: ( rule__LeftAspect__Group__0 )
            {
             before(grammarAccess.getLeftAspectAccess().getGroup()); 
            // InternalMyUiDsl.g:1119:3: ( rule__LeftAspect__Group__0 )
            // InternalMyUiDsl.g:1119:4: rule__LeftAspect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeftAspect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftAspectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeftAspect"


    // $ANTLR start "entryRuleRightAspect"
    // InternalMyUiDsl.g:1128:1: entryRuleRightAspect : ruleRightAspect EOF ;
    public final void entryRuleRightAspect() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:1129:1: ( ruleRightAspect EOF )
            // InternalMyUiDsl.g:1130:1: ruleRightAspect EOF
            {
             before(grammarAccess.getRightAspectRule()); 
            pushFollow(FOLLOW_1);
            ruleRightAspect();

            state._fsp--;

             after(grammarAccess.getRightAspectRule()); 
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
    // $ANTLR end "entryRuleRightAspect"


    // $ANTLR start "ruleRightAspect"
    // InternalMyUiDsl.g:1137:1: ruleRightAspect : ( ( rule__RightAspect__Group__0 ) ) ;
    public final void ruleRightAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1141:2: ( ( ( rule__RightAspect__Group__0 ) ) )
            // InternalMyUiDsl.g:1142:2: ( ( rule__RightAspect__Group__0 ) )
            {
            // InternalMyUiDsl.g:1142:2: ( ( rule__RightAspect__Group__0 ) )
            // InternalMyUiDsl.g:1143:3: ( rule__RightAspect__Group__0 )
            {
             before(grammarAccess.getRightAspectAccess().getGroup()); 
            // InternalMyUiDsl.g:1144:3: ( rule__RightAspect__Group__0 )
            // InternalMyUiDsl.g:1144:4: rule__RightAspect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RightAspect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightAspectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightAspect"


    // $ANTLR start "entryRuleUpAspect"
    // InternalMyUiDsl.g:1153:1: entryRuleUpAspect : ruleUpAspect EOF ;
    public final void entryRuleUpAspect() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:1154:1: ( ruleUpAspect EOF )
            // InternalMyUiDsl.g:1155:1: ruleUpAspect EOF
            {
             before(grammarAccess.getUpAspectRule()); 
            pushFollow(FOLLOW_1);
            ruleUpAspect();

            state._fsp--;

             after(grammarAccess.getUpAspectRule()); 
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
    // $ANTLR end "entryRuleUpAspect"


    // $ANTLR start "ruleUpAspect"
    // InternalMyUiDsl.g:1162:1: ruleUpAspect : ( ( rule__UpAspect__Group__0 ) ) ;
    public final void ruleUpAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1166:2: ( ( ( rule__UpAspect__Group__0 ) ) )
            // InternalMyUiDsl.g:1167:2: ( ( rule__UpAspect__Group__0 ) )
            {
            // InternalMyUiDsl.g:1167:2: ( ( rule__UpAspect__Group__0 ) )
            // InternalMyUiDsl.g:1168:3: ( rule__UpAspect__Group__0 )
            {
             before(grammarAccess.getUpAspectAccess().getGroup()); 
            // InternalMyUiDsl.g:1169:3: ( rule__UpAspect__Group__0 )
            // InternalMyUiDsl.g:1169:4: rule__UpAspect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpAspect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpAspectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpAspect"


    // $ANTLR start "entryRuleDownAspect"
    // InternalMyUiDsl.g:1178:1: entryRuleDownAspect : ruleDownAspect EOF ;
    public final void entryRuleDownAspect() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:1179:1: ( ruleDownAspect EOF )
            // InternalMyUiDsl.g:1180:1: ruleDownAspect EOF
            {
             before(grammarAccess.getDownAspectRule()); 
            pushFollow(FOLLOW_1);
            ruleDownAspect();

            state._fsp--;

             after(grammarAccess.getDownAspectRule()); 
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
    // $ANTLR end "entryRuleDownAspect"


    // $ANTLR start "ruleDownAspect"
    // InternalMyUiDsl.g:1187:1: ruleDownAspect : ( ( rule__DownAspect__Group__0 ) ) ;
    public final void ruleDownAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1191:2: ( ( ( rule__DownAspect__Group__0 ) ) )
            // InternalMyUiDsl.g:1192:2: ( ( rule__DownAspect__Group__0 ) )
            {
            // InternalMyUiDsl.g:1192:2: ( ( rule__DownAspect__Group__0 ) )
            // InternalMyUiDsl.g:1193:3: ( rule__DownAspect__Group__0 )
            {
             before(grammarAccess.getDownAspectAccess().getGroup()); 
            // InternalMyUiDsl.g:1194:3: ( rule__DownAspect__Group__0 )
            // InternalMyUiDsl.g:1194:4: rule__DownAspect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DownAspect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDownAspectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDownAspect"


    // $ANTLR start "entryRulemeasureType"
    // InternalMyUiDsl.g:1203:1: entryRulemeasureType : rulemeasureType EOF ;
    public final void entryRulemeasureType() throws RecognitionException {
        try {
            // InternalMyUiDsl.g:1204:1: ( rulemeasureType EOF )
            // InternalMyUiDsl.g:1205:1: rulemeasureType EOF
            {
             before(grammarAccess.getMeasureTypeRule()); 
            pushFollow(FOLLOW_1);
            rulemeasureType();

            state._fsp--;

             after(grammarAccess.getMeasureTypeRule()); 
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
    // $ANTLR end "entryRulemeasureType"


    // $ANTLR start "rulemeasureType"
    // InternalMyUiDsl.g:1212:1: rulemeasureType : ( ( rule__MeasureType__Alternatives ) ) ;
    public final void rulemeasureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1216:2: ( ( ( rule__MeasureType__Alternatives ) ) )
            // InternalMyUiDsl.g:1217:2: ( ( rule__MeasureType__Alternatives ) )
            {
            // InternalMyUiDsl.g:1217:2: ( ( rule__MeasureType__Alternatives ) )
            // InternalMyUiDsl.g:1218:3: ( rule__MeasureType__Alternatives )
            {
             before(grammarAccess.getMeasureTypeAccess().getAlternatives()); 
            // InternalMyUiDsl.g:1219:3: ( rule__MeasureType__Alternatives )
            // InternalMyUiDsl.g:1219:4: rule__MeasureType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MeasureType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMeasureTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemeasureType"


    // $ANTLR start "rulePosVals"
    // InternalMyUiDsl.g:1228:1: rulePosVals : ( ( rule__PosVals__Alternatives ) ) ;
    public final void rulePosVals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1232:1: ( ( ( rule__PosVals__Alternatives ) ) )
            // InternalMyUiDsl.g:1233:2: ( ( rule__PosVals__Alternatives ) )
            {
            // InternalMyUiDsl.g:1233:2: ( ( rule__PosVals__Alternatives ) )
            // InternalMyUiDsl.g:1234:3: ( rule__PosVals__Alternatives )
            {
             before(grammarAccess.getPosValsAccess().getAlternatives()); 
            // InternalMyUiDsl.g:1235:3: ( rule__PosVals__Alternatives )
            // InternalMyUiDsl.g:1235:4: rule__PosVals__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PosVals__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPosValsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosVals"


    // $ANTLR start "ruleFltVals"
    // InternalMyUiDsl.g:1244:1: ruleFltVals : ( ( rule__FltVals__Alternatives ) ) ;
    public final void ruleFltVals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1248:1: ( ( ( rule__FltVals__Alternatives ) ) )
            // InternalMyUiDsl.g:1249:2: ( ( rule__FltVals__Alternatives ) )
            {
            // InternalMyUiDsl.g:1249:2: ( ( rule__FltVals__Alternatives ) )
            // InternalMyUiDsl.g:1250:3: ( rule__FltVals__Alternatives )
            {
             before(grammarAccess.getFltValsAccess().getAlternatives()); 
            // InternalMyUiDsl.g:1251:3: ( rule__FltVals__Alternatives )
            // InternalMyUiDsl.g:1251:4: rule__FltVals__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FltVals__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFltValsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFltVals"


    // $ANTLR start "ruleClrVals"
    // InternalMyUiDsl.g:1260:1: ruleClrVals : ( ( rule__ClrVals__Alternatives ) ) ;
    public final void ruleClrVals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1264:1: ( ( ( rule__ClrVals__Alternatives ) ) )
            // InternalMyUiDsl.g:1265:2: ( ( rule__ClrVals__Alternatives ) )
            {
            // InternalMyUiDsl.g:1265:2: ( ( rule__ClrVals__Alternatives ) )
            // InternalMyUiDsl.g:1266:3: ( rule__ClrVals__Alternatives )
            {
             before(grammarAccess.getClrValsAccess().getAlternatives()); 
            // InternalMyUiDsl.g:1267:3: ( rule__ClrVals__Alternatives )
            // InternalMyUiDsl.g:1267:4: rule__ClrVals__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClrVals__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClrValsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClrVals"


    // $ANTLR start "ruleDispVals"
    // InternalMyUiDsl.g:1276:1: ruleDispVals : ( ( rule__DispVals__Alternatives ) ) ;
    public final void ruleDispVals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1280:1: ( ( ( rule__DispVals__Alternatives ) ) )
            // InternalMyUiDsl.g:1281:2: ( ( rule__DispVals__Alternatives ) )
            {
            // InternalMyUiDsl.g:1281:2: ( ( rule__DispVals__Alternatives ) )
            // InternalMyUiDsl.g:1282:3: ( rule__DispVals__Alternatives )
            {
             before(grammarAccess.getDispValsAccess().getAlternatives()); 
            // InternalMyUiDsl.g:1283:3: ( rule__DispVals__Alternatives )
            // InternalMyUiDsl.g:1283:4: rule__DispVals__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DispVals__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDispValsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDispVals"


    // $ANTLR start "ruleVeralVals"
    // InternalMyUiDsl.g:1292:1: ruleVeralVals : ( ( rule__VeralVals__Alternatives ) ) ;
    public final void ruleVeralVals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1296:1: ( ( ( rule__VeralVals__Alternatives ) ) )
            // InternalMyUiDsl.g:1297:2: ( ( rule__VeralVals__Alternatives ) )
            {
            // InternalMyUiDsl.g:1297:2: ( ( rule__VeralVals__Alternatives ) )
            // InternalMyUiDsl.g:1298:3: ( rule__VeralVals__Alternatives )
            {
             before(grammarAccess.getVeralValsAccess().getAlternatives()); 
            // InternalMyUiDsl.g:1299:3: ( rule__VeralVals__Alternatives )
            // InternalMyUiDsl.g:1299:4: rule__VeralVals__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VeralVals__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVeralValsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVeralVals"


    // $ANTLR start "ruleOFlowVals"
    // InternalMyUiDsl.g:1308:1: ruleOFlowVals : ( ( rule__OFlowVals__Alternatives ) ) ;
    public final void ruleOFlowVals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1312:1: ( ( ( rule__OFlowVals__Alternatives ) ) )
            // InternalMyUiDsl.g:1313:2: ( ( rule__OFlowVals__Alternatives ) )
            {
            // InternalMyUiDsl.g:1313:2: ( ( rule__OFlowVals__Alternatives ) )
            // InternalMyUiDsl.g:1314:3: ( rule__OFlowVals__Alternatives )
            {
             before(grammarAccess.getOFlowValsAccess().getAlternatives()); 
            // InternalMyUiDsl.g:1315:3: ( rule__OFlowVals__Alternatives )
            // InternalMyUiDsl.g:1315:4: rule__OFlowVals__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OFlowVals__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOFlowValsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOFlowVals"


    // $ANTLR start "ruleInnerTypeArray"
    // InternalMyUiDsl.g:1324:1: ruleInnerTypeArray : ( ( rule__InnerTypeArray__Alternatives ) ) ;
    public final void ruleInnerTypeArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1328:1: ( ( ( rule__InnerTypeArray__Alternatives ) ) )
            // InternalMyUiDsl.g:1329:2: ( ( rule__InnerTypeArray__Alternatives ) )
            {
            // InternalMyUiDsl.g:1329:2: ( ( rule__InnerTypeArray__Alternatives ) )
            // InternalMyUiDsl.g:1330:3: ( rule__InnerTypeArray__Alternatives )
            {
             before(grammarAccess.getInnerTypeArrayAccess().getAlternatives()); 
            // InternalMyUiDsl.g:1331:3: ( rule__InnerTypeArray__Alternatives )
            // InternalMyUiDsl.g:1331:4: rule__InnerTypeArray__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InnerTypeArray__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInnerTypeArrayAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInnerTypeArray"


    // $ANTLR start "rule__HeadType__Alternatives"
    // InternalMyUiDsl.g:1339:1: rule__HeadType__Alternatives : ( ( '_CSS' ) | ( '_JS' ) | ( RULE_ONECHAR ) );
    public final void rule__HeadType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1343:1: ( ( '_CSS' ) | ( '_JS' ) | ( RULE_ONECHAR ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case RULE_ONECHAR:
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
                    // InternalMyUiDsl.g:1344:2: ( '_CSS' )
                    {
                    // InternalMyUiDsl.g:1344:2: ( '_CSS' )
                    // InternalMyUiDsl.g:1345:3: '_CSS'
                    {
                     before(grammarAccess.getHeadTypeAccess().get_CSSKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getHeadTypeAccess().get_CSSKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:1350:2: ( '_JS' )
                    {
                    // InternalMyUiDsl.g:1350:2: ( '_JS' )
                    // InternalMyUiDsl.g:1351:3: '_JS'
                    {
                     before(grammarAccess.getHeadTypeAccess().get_JSKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getHeadTypeAccess().get_JSKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:1356:2: ( RULE_ONECHAR )
                    {
                    // InternalMyUiDsl.g:1356:2: ( RULE_ONECHAR )
                    // InternalMyUiDsl.g:1357:3: RULE_ONECHAR
                    {
                     before(grammarAccess.getHeadTypeAccess().getOneCharTerminalRuleCall_2()); 
                    match(input,RULE_ONECHAR,FOLLOW_2); 
                     after(grammarAccess.getHeadTypeAccess().getOneCharTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__HeadType__Alternatives"


    // $ANTLR start "rule__CssStyle__Alternatives_0"
    // InternalMyUiDsl.g:1366:1: rule__CssStyle__Alternatives_0 : ( ( rulePos ) | ( ruleFlt ) | ( ruleClr ) | ( ruleDisp ) | ( ruleVerAl ) | ( ruleWid ) | ( ruleH8 ) | ( ruleCoord ) | ( ruleOFlow ) | ( ruleMarg ) | ( rulePadd ) | ( ruleBorder ) | ( ruleBorderRad ) | ( ruleColor ) | ( ruleBackColor ) );
    public final void rule__CssStyle__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1370:1: ( ( rulePos ) | ( ruleFlt ) | ( ruleClr ) | ( ruleDisp ) | ( ruleVerAl ) | ( ruleWid ) | ( ruleH8 ) | ( ruleCoord ) | ( ruleOFlow ) | ( ruleMarg ) | ( rulePadd ) | ( ruleBorder ) | ( ruleBorderRad ) | ( ruleColor ) | ( ruleBackColor ) )
            int alt2=15;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt2=1;
                }
                break;
            case 83:
                {
                alt2=2;
                }
                break;
            case 84:
                {
                alt2=3;
                }
                break;
            case 85:
                {
                alt2=4;
                }
                break;
            case 86:
                {
                alt2=5;
                }
                break;
            case 88:
                {
                alt2=6;
                }
                break;
            case 89:
                {
                alt2=7;
                }
                break;
            case 90:
                {
                alt2=8;
                }
                break;
            case 87:
                {
                alt2=9;
                }
                break;
            case 91:
                {
                alt2=10;
                }
                break;
            case 92:
                {
                alt2=11;
                }
                break;
            case 73:
                {
                alt2=12;
                }
                break;
            case 81:
                {
                alt2=13;
                }
                break;
            case 74:
                {
                alt2=14;
                }
                break;
            case 75:
                {
                alt2=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyUiDsl.g:1371:2: ( rulePos )
                    {
                    // InternalMyUiDsl.g:1371:2: ( rulePos )
                    // InternalMyUiDsl.g:1372:3: rulePos
                    {
                     before(grammarAccess.getCssStyleAccess().getPosParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePos();

                    state._fsp--;

                     after(grammarAccess.getCssStyleAccess().getPosParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:1377:2: ( ruleFlt )
                    {
                    // InternalMyUiDsl.g:1377:2: ( ruleFlt )
                    // InternalMyUiDsl.g:1378:3: ruleFlt
                    {
                     before(grammarAccess.getCssStyleAccess().getFltParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFlt();

                    state._fsp--;

                     after(grammarAccess.getCssStyleAccess().getFltParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:1383:2: ( ruleClr )
                    {
                    // InternalMyUiDsl.g:1383:2: ( ruleClr )
                    // InternalMyUiDsl.g:1384:3: ruleClr
                    {
                     before(grammarAccess.getCssStyleAccess().getClrParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleClr();

                    state._fsp--;

                     after(grammarAccess.getCssStyleAccess().getClrParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:1389:2: ( ruleDisp )
                    {
                    // InternalMyUiDsl.g:1389:2: ( ruleDisp )
                    // InternalMyUiDsl.g:1390:3: ruleDisp
                    {
                     before(grammarAccess.getCssStyleAccess().getDispParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDisp();

                    state._fsp--;

                     after(grammarAccess.getCssStyleAccess().getDispParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyUiDsl.g:1395:2: ( ruleVerAl )
                    {
                    // InternalMyUiDsl.g:1395:2: ( ruleVerAl )
                    // InternalMyUiDsl.g:1396:3: ruleVerAl
                    {
                     before(grammarAccess.getCssStyleAccess().getVerAlParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVerAl();

                    state._fsp--;

                     after(grammarAccess.getCssStyleAccess().getVerAlParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyUiDsl.g:1401:2: ( ruleWid )
                    {
                    // InternalMyUiDsl.g:1401:2: ( ruleWid )
                    // InternalMyUiDsl.g:1402:3: ruleWid
                    {
                     before(grammarAccess.getCssStyleAccess().getWidParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleWid();

                    state._fsp--;

                     after(grammarAccess.getCssStyleAccess().getWidParserRuleCall_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyUiDsl.g:1407:2: ( ruleH8 )
                    {
                    // InternalMyUiDsl.g:1407:2: ( ruleH8 )
                    // InternalMyUiDsl.g:1408:3: ruleH8
                    {
                     before(grammarAccess.getCssStyleAccess().getH8ParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleH8();

                    state._fsp--;

                     after(grammarAccess.getCssStyleAccess().getH8ParserRuleCall_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyUiDsl.g:1413:2: ( ruleCoord )
                    {
                    // InternalMyUiDsl.g:1413:2: ( ruleCoord )
                    // InternalMyUiDsl.g:1414:3: ruleCoord
                    {
                     before(grammarAccess.getCssStyleAccess().getCoordParserRuleCall_0_7()); 
                    pushFollow(FOLLOW_2);
                    ruleCoord();

                    state._fsp--;

                     after(grammarAccess.getCssStyleAccess().getCoordParserRuleCall_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyUiDsl.g:1419:2: ( ruleOFlow )
                    {
                    // InternalMyUiDsl.g:1419:2: ( ruleOFlow )
                    // InternalMyUiDsl.g:1420:3: ruleOFlow
                    {
                     before(grammarAccess.getCssStyleAccess().getOFlowParserRuleCall_0_8()); 
                    pushFollow(FOLLOW_2);
                    ruleOFlow();

                    state._fsp--;

                     after(grammarAccess.getCssStyleAccess().getOFlowParserRuleCall_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyUiDsl.g:1425:2: ( ruleMarg )
                    {
                    // InternalMyUiDsl.g:1425:2: ( ruleMarg )
                    // InternalMyUiDsl.g:1426:3: ruleMarg
                    {
                     before(grammarAccess.getCssStyleAccess().getMargParserRuleCall_0_9()); 
                    pushFollow(FOLLOW_2);
                    ruleMarg();

                    state._fsp--;

                     after(grammarAccess.getCssStyleAccess().getMargParserRuleCall_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyUiDsl.g:1431:2: ( rulePadd )
                    {
                    // InternalMyUiDsl.g:1431:2: ( rulePadd )
                    // InternalMyUiDsl.g:1432:3: rulePadd
                    {
                     before(grammarAccess.getCssStyleAccess().getPaddParserRuleCall_0_10()); 
                    pushFollow(FOLLOW_2);
                    rulePadd();

                    state._fsp--;

                     after(grammarAccess.getCssStyleAccess().getPaddParserRuleCall_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyUiDsl.g:1437:2: ( ruleBorder )
                    {
                    // InternalMyUiDsl.g:1437:2: ( ruleBorder )
                    // InternalMyUiDsl.g:1438:3: ruleBorder
                    {
                     before(grammarAccess.getCssStyleAccess().getBorderParserRuleCall_0_11()); 
                    pushFollow(FOLLOW_2);
                    ruleBorder();

                    state._fsp--;

                     after(grammarAccess.getCssStyleAccess().getBorderParserRuleCall_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyUiDsl.g:1443:2: ( ruleBorderRad )
                    {
                    // InternalMyUiDsl.g:1443:2: ( ruleBorderRad )
                    // InternalMyUiDsl.g:1444:3: ruleBorderRad
                    {
                     before(grammarAccess.getCssStyleAccess().getBorderRadParserRuleCall_0_12()); 
                    pushFollow(FOLLOW_2);
                    ruleBorderRad();

                    state._fsp--;

                     after(grammarAccess.getCssStyleAccess().getBorderRadParserRuleCall_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyUiDsl.g:1449:2: ( ruleColor )
                    {
                    // InternalMyUiDsl.g:1449:2: ( ruleColor )
                    // InternalMyUiDsl.g:1450:3: ruleColor
                    {
                     before(grammarAccess.getCssStyleAccess().getColorParserRuleCall_0_13()); 
                    pushFollow(FOLLOW_2);
                    ruleColor();

                    state._fsp--;

                     after(grammarAccess.getCssStyleAccess().getColorParserRuleCall_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalMyUiDsl.g:1455:2: ( ruleBackColor )
                    {
                    // InternalMyUiDsl.g:1455:2: ( ruleBackColor )
                    // InternalMyUiDsl.g:1456:3: ruleBackColor
                    {
                     before(grammarAccess.getCssStyleAccess().getBackColorParserRuleCall_0_14()); 
                    pushFollow(FOLLOW_2);
                    ruleBackColor();

                    state._fsp--;

                     after(grammarAccess.getCssStyleAccess().getBackColorParserRuleCall_0_14()); 

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
    // $ANTLR end "rule__CssStyle__Alternatives_0"


    // $ANTLR start "rule__ColorDef__Alternatives"
    // InternalMyUiDsl.g:1465:1: rule__ColorDef__Alternatives : ( ( ruleLiteralColor ) | ( ruleRgbaColor ) );
    public final void rule__ColorDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1469:1: ( ( ruleLiteralColor ) | ( ruleRgbaColor ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=15 && LA3_0<=24)) ) {
                alt3=1;
            }
            else if ( (LA3_0==76) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyUiDsl.g:1470:2: ( ruleLiteralColor )
                    {
                    // InternalMyUiDsl.g:1470:2: ( ruleLiteralColor )
                    // InternalMyUiDsl.g:1471:3: ruleLiteralColor
                    {
                     before(grammarAccess.getColorDefAccess().getLiteralColorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralColor();

                    state._fsp--;

                     after(grammarAccess.getColorDefAccess().getLiteralColorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:1476:2: ( ruleRgbaColor )
                    {
                    // InternalMyUiDsl.g:1476:2: ( ruleRgbaColor )
                    // InternalMyUiDsl.g:1477:3: ruleRgbaColor
                    {
                     before(grammarAccess.getColorDefAccess().getRgbaColorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRgbaColor();

                    state._fsp--;

                     after(grammarAccess.getColorDefAccess().getRgbaColorParserRuleCall_1()); 

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
    // $ANTLR end "rule__ColorDef__Alternatives"


    // $ANTLR start "rule__LiteralColor__ValueAlternatives_0"
    // InternalMyUiDsl.g:1486:1: rule__LiteralColor__ValueAlternatives_0 : ( ( 'Red' ) | ( 'Blue' ) | ( 'Black' ) | ( 'Green' ) | ( 'Yellow' ) | ( 'Pink' ) | ( 'Brown' ) | ( 'Gold' ) | ( 'White' ) | ( 'Grey' ) );
    public final void rule__LiteralColor__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1490:1: ( ( 'Red' ) | ( 'Blue' ) | ( 'Black' ) | ( 'Green' ) | ( 'Yellow' ) | ( 'Pink' ) | ( 'Brown' ) | ( 'Gold' ) | ( 'White' ) | ( 'Grey' ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 19:
                {
                alt4=5;
                }
                break;
            case 20:
                {
                alt4=6;
                }
                break;
            case 21:
                {
                alt4=7;
                }
                break;
            case 22:
                {
                alt4=8;
                }
                break;
            case 23:
                {
                alt4=9;
                }
                break;
            case 24:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyUiDsl.g:1491:2: ( 'Red' )
                    {
                    // InternalMyUiDsl.g:1491:2: ( 'Red' )
                    // InternalMyUiDsl.g:1492:3: 'Red'
                    {
                     before(grammarAccess.getLiteralColorAccess().getValueRedKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getLiteralColorAccess().getValueRedKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:1497:2: ( 'Blue' )
                    {
                    // InternalMyUiDsl.g:1497:2: ( 'Blue' )
                    // InternalMyUiDsl.g:1498:3: 'Blue'
                    {
                     before(grammarAccess.getLiteralColorAccess().getValueBlueKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getLiteralColorAccess().getValueBlueKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:1503:2: ( 'Black' )
                    {
                    // InternalMyUiDsl.g:1503:2: ( 'Black' )
                    // InternalMyUiDsl.g:1504:3: 'Black'
                    {
                     before(grammarAccess.getLiteralColorAccess().getValueBlackKeyword_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getLiteralColorAccess().getValueBlackKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:1509:2: ( 'Green' )
                    {
                    // InternalMyUiDsl.g:1509:2: ( 'Green' )
                    // InternalMyUiDsl.g:1510:3: 'Green'
                    {
                     before(grammarAccess.getLiteralColorAccess().getValueGreenKeyword_0_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getLiteralColorAccess().getValueGreenKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyUiDsl.g:1515:2: ( 'Yellow' )
                    {
                    // InternalMyUiDsl.g:1515:2: ( 'Yellow' )
                    // InternalMyUiDsl.g:1516:3: 'Yellow'
                    {
                     before(grammarAccess.getLiteralColorAccess().getValueYellowKeyword_0_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getLiteralColorAccess().getValueYellowKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyUiDsl.g:1521:2: ( 'Pink' )
                    {
                    // InternalMyUiDsl.g:1521:2: ( 'Pink' )
                    // InternalMyUiDsl.g:1522:3: 'Pink'
                    {
                     before(grammarAccess.getLiteralColorAccess().getValuePinkKeyword_0_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getLiteralColorAccess().getValuePinkKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyUiDsl.g:1527:2: ( 'Brown' )
                    {
                    // InternalMyUiDsl.g:1527:2: ( 'Brown' )
                    // InternalMyUiDsl.g:1528:3: 'Brown'
                    {
                     before(grammarAccess.getLiteralColorAccess().getValueBrownKeyword_0_6()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getLiteralColorAccess().getValueBrownKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyUiDsl.g:1533:2: ( 'Gold' )
                    {
                    // InternalMyUiDsl.g:1533:2: ( 'Gold' )
                    // InternalMyUiDsl.g:1534:3: 'Gold'
                    {
                     before(grammarAccess.getLiteralColorAccess().getValueGoldKeyword_0_7()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getLiteralColorAccess().getValueGoldKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyUiDsl.g:1539:2: ( 'White' )
                    {
                    // InternalMyUiDsl.g:1539:2: ( 'White' )
                    // InternalMyUiDsl.g:1540:3: 'White'
                    {
                     before(grammarAccess.getLiteralColorAccess().getValueWhiteKeyword_0_8()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getLiteralColorAccess().getValueWhiteKeyword_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyUiDsl.g:1545:2: ( 'Grey' )
                    {
                    // InternalMyUiDsl.g:1545:2: ( 'Grey' )
                    // InternalMyUiDsl.g:1546:3: 'Grey'
                    {
                     before(grammarAccess.getLiteralColorAccess().getValueGreyKeyword_0_9()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getLiteralColorAccess().getValueGreyKeyword_0_9()); 

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
    // $ANTLR end "rule__LiteralColor__ValueAlternatives_0"


    // $ANTLR start "rule__MeasureType__Alternatives"
    // InternalMyUiDsl.g:1555:1: rule__MeasureType__Alternatives : ( ( 'em' ) | ( '%' ) | ( 'px' ) );
    public final void rule__MeasureType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1559:1: ( ( 'em' ) | ( '%' ) | ( 'px' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 27:
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
                    // InternalMyUiDsl.g:1560:2: ( 'em' )
                    {
                    // InternalMyUiDsl.g:1560:2: ( 'em' )
                    // InternalMyUiDsl.g:1561:3: 'em'
                    {
                     before(grammarAccess.getMeasureTypeAccess().getEmKeyword_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getMeasureTypeAccess().getEmKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:1566:2: ( '%' )
                    {
                    // InternalMyUiDsl.g:1566:2: ( '%' )
                    // InternalMyUiDsl.g:1567:3: '%'
                    {
                     before(grammarAccess.getMeasureTypeAccess().getPercentSignKeyword_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getMeasureTypeAccess().getPercentSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:1572:2: ( 'px' )
                    {
                    // InternalMyUiDsl.g:1572:2: ( 'px' )
                    // InternalMyUiDsl.g:1573:3: 'px'
                    {
                     before(grammarAccess.getMeasureTypeAccess().getPxKeyword_2()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getMeasureTypeAccess().getPxKeyword_2()); 

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
    // $ANTLR end "rule__MeasureType__Alternatives"


    // $ANTLR start "rule__PosVals__Alternatives"
    // InternalMyUiDsl.g:1582:1: rule__PosVals__Alternatives : ( ( ( 'Static' ) ) | ( ( 'Relative' ) ) | ( ( 'Fixed' ) ) | ( ( 'Absolute' ) ) | ( ( 'Steaky' ) ) );
    public final void rule__PosVals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1586:1: ( ( ( 'Static' ) ) | ( ( 'Relative' ) ) | ( ( 'Fixed' ) ) | ( ( 'Absolute' ) ) | ( ( 'Steaky' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            case 31:
                {
                alt6=4;
                }
                break;
            case 32:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyUiDsl.g:1587:2: ( ( 'Static' ) )
                    {
                    // InternalMyUiDsl.g:1587:2: ( ( 'Static' ) )
                    // InternalMyUiDsl.g:1588:3: ( 'Static' )
                    {
                     before(grammarAccess.getPosValsAccess().getStaticEnumLiteralDeclaration_0()); 
                    // InternalMyUiDsl.g:1589:3: ( 'Static' )
                    // InternalMyUiDsl.g:1589:4: 'Static'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPosValsAccess().getStaticEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:1593:2: ( ( 'Relative' ) )
                    {
                    // InternalMyUiDsl.g:1593:2: ( ( 'Relative' ) )
                    // InternalMyUiDsl.g:1594:3: ( 'Relative' )
                    {
                     before(grammarAccess.getPosValsAccess().getRelativeEnumLiteralDeclaration_1()); 
                    // InternalMyUiDsl.g:1595:3: ( 'Relative' )
                    // InternalMyUiDsl.g:1595:4: 'Relative'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getPosValsAccess().getRelativeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:1599:2: ( ( 'Fixed' ) )
                    {
                    // InternalMyUiDsl.g:1599:2: ( ( 'Fixed' ) )
                    // InternalMyUiDsl.g:1600:3: ( 'Fixed' )
                    {
                     before(grammarAccess.getPosValsAccess().getFixedEnumLiteralDeclaration_2()); 
                    // InternalMyUiDsl.g:1601:3: ( 'Fixed' )
                    // InternalMyUiDsl.g:1601:4: 'Fixed'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getPosValsAccess().getFixedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:1605:2: ( ( 'Absolute' ) )
                    {
                    // InternalMyUiDsl.g:1605:2: ( ( 'Absolute' ) )
                    // InternalMyUiDsl.g:1606:3: ( 'Absolute' )
                    {
                     before(grammarAccess.getPosValsAccess().getAbsoluteEnumLiteralDeclaration_3()); 
                    // InternalMyUiDsl.g:1607:3: ( 'Absolute' )
                    // InternalMyUiDsl.g:1607:4: 'Absolute'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getPosValsAccess().getAbsoluteEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyUiDsl.g:1611:2: ( ( 'Steaky' ) )
                    {
                    // InternalMyUiDsl.g:1611:2: ( ( 'Steaky' ) )
                    // InternalMyUiDsl.g:1612:3: ( 'Steaky' )
                    {
                     before(grammarAccess.getPosValsAccess().getSteakyEnumLiteralDeclaration_4()); 
                    // InternalMyUiDsl.g:1613:3: ( 'Steaky' )
                    // InternalMyUiDsl.g:1613:4: 'Steaky'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getPosValsAccess().getSteakyEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__PosVals__Alternatives"


    // $ANTLR start "rule__FltVals__Alternatives"
    // InternalMyUiDsl.g:1621:1: rule__FltVals__Alternatives : ( ( ( 'Left' ) ) | ( ( 'Right' ) ) | ( ( 'None' ) ) | ( ( 'Start' ) ) | ( ( 'End' ) ) );
    public final void rule__FltVals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1625:1: ( ( ( 'Left' ) ) | ( ( 'Right' ) ) | ( ( 'None' ) ) | ( ( 'Start' ) ) | ( ( 'End' ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt7=1;
                }
                break;
            case 34:
                {
                alt7=2;
                }
                break;
            case 35:
                {
                alt7=3;
                }
                break;
            case 36:
                {
                alt7=4;
                }
                break;
            case 37:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyUiDsl.g:1626:2: ( ( 'Left' ) )
                    {
                    // InternalMyUiDsl.g:1626:2: ( ( 'Left' ) )
                    // InternalMyUiDsl.g:1627:3: ( 'Left' )
                    {
                     before(grammarAccess.getFltValsAccess().getLeftEnumLiteralDeclaration_0()); 
                    // InternalMyUiDsl.g:1628:3: ( 'Left' )
                    // InternalMyUiDsl.g:1628:4: 'Left'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getFltValsAccess().getLeftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:1632:2: ( ( 'Right' ) )
                    {
                    // InternalMyUiDsl.g:1632:2: ( ( 'Right' ) )
                    // InternalMyUiDsl.g:1633:3: ( 'Right' )
                    {
                     before(grammarAccess.getFltValsAccess().getRightEnumLiteralDeclaration_1()); 
                    // InternalMyUiDsl.g:1634:3: ( 'Right' )
                    // InternalMyUiDsl.g:1634:4: 'Right'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getFltValsAccess().getRightEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:1638:2: ( ( 'None' ) )
                    {
                    // InternalMyUiDsl.g:1638:2: ( ( 'None' ) )
                    // InternalMyUiDsl.g:1639:3: ( 'None' )
                    {
                     before(grammarAccess.getFltValsAccess().getNoneEnumLiteralDeclaration_2()); 
                    // InternalMyUiDsl.g:1640:3: ( 'None' )
                    // InternalMyUiDsl.g:1640:4: 'None'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getFltValsAccess().getNoneEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:1644:2: ( ( 'Start' ) )
                    {
                    // InternalMyUiDsl.g:1644:2: ( ( 'Start' ) )
                    // InternalMyUiDsl.g:1645:3: ( 'Start' )
                    {
                     before(grammarAccess.getFltValsAccess().getStartEnumLiteralDeclaration_3()); 
                    // InternalMyUiDsl.g:1646:3: ( 'Start' )
                    // InternalMyUiDsl.g:1646:4: 'Start'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getFltValsAccess().getStartEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyUiDsl.g:1650:2: ( ( 'End' ) )
                    {
                    // InternalMyUiDsl.g:1650:2: ( ( 'End' ) )
                    // InternalMyUiDsl.g:1651:3: ( 'End' )
                    {
                     before(grammarAccess.getFltValsAccess().getEndEnumLiteralDeclaration_4()); 
                    // InternalMyUiDsl.g:1652:3: ( 'End' )
                    // InternalMyUiDsl.g:1652:4: 'End'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getFltValsAccess().getEndEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__FltVals__Alternatives"


    // $ANTLR start "rule__ClrVals__Alternatives"
    // InternalMyUiDsl.g:1660:1: rule__ClrVals__Alternatives : ( ( ( 'Left' ) ) | ( ( 'Right' ) ) | ( ( 'Both' ) ) | ( ( 'None' ) ) );
    public final void rule__ClrVals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1664:1: ( ( ( 'Left' ) ) | ( ( 'Right' ) ) | ( ( 'Both' ) ) | ( ( 'None' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case 38:
                {
                alt8=3;
                }
                break;
            case 35:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyUiDsl.g:1665:2: ( ( 'Left' ) )
                    {
                    // InternalMyUiDsl.g:1665:2: ( ( 'Left' ) )
                    // InternalMyUiDsl.g:1666:3: ( 'Left' )
                    {
                     before(grammarAccess.getClrValsAccess().getLeftEnumLiteralDeclaration_0()); 
                    // InternalMyUiDsl.g:1667:3: ( 'Left' )
                    // InternalMyUiDsl.g:1667:4: 'Left'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getClrValsAccess().getLeftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:1671:2: ( ( 'Right' ) )
                    {
                    // InternalMyUiDsl.g:1671:2: ( ( 'Right' ) )
                    // InternalMyUiDsl.g:1672:3: ( 'Right' )
                    {
                     before(grammarAccess.getClrValsAccess().getRightEnumLiteralDeclaration_1()); 
                    // InternalMyUiDsl.g:1673:3: ( 'Right' )
                    // InternalMyUiDsl.g:1673:4: 'Right'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getClrValsAccess().getRightEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:1677:2: ( ( 'Both' ) )
                    {
                    // InternalMyUiDsl.g:1677:2: ( ( 'Both' ) )
                    // InternalMyUiDsl.g:1678:3: ( 'Both' )
                    {
                     before(grammarAccess.getClrValsAccess().getBothEnumLiteralDeclaration_2()); 
                    // InternalMyUiDsl.g:1679:3: ( 'Both' )
                    // InternalMyUiDsl.g:1679:4: 'Both'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getClrValsAccess().getBothEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:1683:2: ( ( 'None' ) )
                    {
                    // InternalMyUiDsl.g:1683:2: ( ( 'None' ) )
                    // InternalMyUiDsl.g:1684:3: ( 'None' )
                    {
                     before(grammarAccess.getClrValsAccess().getNoneEnumLiteralDeclaration_3()); 
                    // InternalMyUiDsl.g:1685:3: ( 'None' )
                    // InternalMyUiDsl.g:1685:4: 'None'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getClrValsAccess().getNoneEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__ClrVals__Alternatives"


    // $ANTLR start "rule__DispVals__Alternatives"
    // InternalMyUiDsl.g:1693:1: rule__DispVals__Alternatives : ( ( ( 'Block' ) ) | ( ( 'Inline' ) ) | ( ( 'InBl' ) ) | ( ( 'Table' ) ) | ( ( 'None' ) ) );
    public final void rule__DispVals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1697:1: ( ( ( 'Block' ) ) | ( ( 'Inline' ) ) | ( ( 'InBl' ) ) | ( ( 'Table' ) ) | ( ( 'None' ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt9=1;
                }
                break;
            case 40:
                {
                alt9=2;
                }
                break;
            case 41:
                {
                alt9=3;
                }
                break;
            case 42:
                {
                alt9=4;
                }
                break;
            case 35:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyUiDsl.g:1698:2: ( ( 'Block' ) )
                    {
                    // InternalMyUiDsl.g:1698:2: ( ( 'Block' ) )
                    // InternalMyUiDsl.g:1699:3: ( 'Block' )
                    {
                     before(grammarAccess.getDispValsAccess().getBlockEnumLiteralDeclaration_0()); 
                    // InternalMyUiDsl.g:1700:3: ( 'Block' )
                    // InternalMyUiDsl.g:1700:4: 'Block'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getDispValsAccess().getBlockEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:1704:2: ( ( 'Inline' ) )
                    {
                    // InternalMyUiDsl.g:1704:2: ( ( 'Inline' ) )
                    // InternalMyUiDsl.g:1705:3: ( 'Inline' )
                    {
                     before(grammarAccess.getDispValsAccess().getInlineEnumLiteralDeclaration_1()); 
                    // InternalMyUiDsl.g:1706:3: ( 'Inline' )
                    // InternalMyUiDsl.g:1706:4: 'Inline'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getDispValsAccess().getInlineEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:1710:2: ( ( 'InBl' ) )
                    {
                    // InternalMyUiDsl.g:1710:2: ( ( 'InBl' ) )
                    // InternalMyUiDsl.g:1711:3: ( 'InBl' )
                    {
                     before(grammarAccess.getDispValsAccess().getInBlEnumLiteralDeclaration_2()); 
                    // InternalMyUiDsl.g:1712:3: ( 'InBl' )
                    // InternalMyUiDsl.g:1712:4: 'InBl'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getDispValsAccess().getInBlEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:1716:2: ( ( 'Table' ) )
                    {
                    // InternalMyUiDsl.g:1716:2: ( ( 'Table' ) )
                    // InternalMyUiDsl.g:1717:3: ( 'Table' )
                    {
                     before(grammarAccess.getDispValsAccess().getTableEnumLiteralDeclaration_3()); 
                    // InternalMyUiDsl.g:1718:3: ( 'Table' )
                    // InternalMyUiDsl.g:1718:4: 'Table'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getDispValsAccess().getTableEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyUiDsl.g:1722:2: ( ( 'None' ) )
                    {
                    // InternalMyUiDsl.g:1722:2: ( ( 'None' ) )
                    // InternalMyUiDsl.g:1723:3: ( 'None' )
                    {
                     before(grammarAccess.getDispValsAccess().getNoneEnumLiteralDeclaration_4()); 
                    // InternalMyUiDsl.g:1724:3: ( 'None' )
                    // InternalMyUiDsl.g:1724:4: 'None'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getDispValsAccess().getNoneEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__DispVals__Alternatives"


    // $ANTLR start "rule__VeralVals__Alternatives"
    // InternalMyUiDsl.g:1732:1: rule__VeralVals__Alternatives : ( ( ( 'Top' ) ) | ( ( 'Down' ) ) | ( ( 'Center' ) ) );
    public final void rule__VeralVals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1736:1: ( ( ( 'Top' ) ) | ( ( 'Down' ) ) | ( ( 'Center' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt10=1;
                }
                break;
            case 44:
                {
                alt10=2;
                }
                break;
            case 45:
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
                    // InternalMyUiDsl.g:1737:2: ( ( 'Top' ) )
                    {
                    // InternalMyUiDsl.g:1737:2: ( ( 'Top' ) )
                    // InternalMyUiDsl.g:1738:3: ( 'Top' )
                    {
                     before(grammarAccess.getVeralValsAccess().getTopEnumLiteralDeclaration_0()); 
                    // InternalMyUiDsl.g:1739:3: ( 'Top' )
                    // InternalMyUiDsl.g:1739:4: 'Top'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getVeralValsAccess().getTopEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:1743:2: ( ( 'Down' ) )
                    {
                    // InternalMyUiDsl.g:1743:2: ( ( 'Down' ) )
                    // InternalMyUiDsl.g:1744:3: ( 'Down' )
                    {
                     before(grammarAccess.getVeralValsAccess().getDownEnumLiteralDeclaration_1()); 
                    // InternalMyUiDsl.g:1745:3: ( 'Down' )
                    // InternalMyUiDsl.g:1745:4: 'Down'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getVeralValsAccess().getDownEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:1749:2: ( ( 'Center' ) )
                    {
                    // InternalMyUiDsl.g:1749:2: ( ( 'Center' ) )
                    // InternalMyUiDsl.g:1750:3: ( 'Center' )
                    {
                     before(grammarAccess.getVeralValsAccess().getCenterEnumLiteralDeclaration_2()); 
                    // InternalMyUiDsl.g:1751:3: ( 'Center' )
                    // InternalMyUiDsl.g:1751:4: 'Center'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getVeralValsAccess().getCenterEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__VeralVals__Alternatives"


    // $ANTLR start "rule__OFlowVals__Alternatives"
    // InternalMyUiDsl.g:1759:1: rule__OFlowVals__Alternatives : ( ( ( 'Scroll' ) ) | ( ( 'Visible' ) ) | ( ( 'Hidden' ) ) | ( ( 'Auto' ) ) );
    public final void rule__OFlowVals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1763:1: ( ( ( 'Scroll' ) ) | ( ( 'Visible' ) ) | ( ( 'Hidden' ) ) | ( ( 'Auto' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt11=1;
                }
                break;
            case 47:
                {
                alt11=2;
                }
                break;
            case 48:
                {
                alt11=3;
                }
                break;
            case 49:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyUiDsl.g:1764:2: ( ( 'Scroll' ) )
                    {
                    // InternalMyUiDsl.g:1764:2: ( ( 'Scroll' ) )
                    // InternalMyUiDsl.g:1765:3: ( 'Scroll' )
                    {
                     before(grammarAccess.getOFlowValsAccess().getScrollEnumLiteralDeclaration_0()); 
                    // InternalMyUiDsl.g:1766:3: ( 'Scroll' )
                    // InternalMyUiDsl.g:1766:4: 'Scroll'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getOFlowValsAccess().getScrollEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:1770:2: ( ( 'Visible' ) )
                    {
                    // InternalMyUiDsl.g:1770:2: ( ( 'Visible' ) )
                    // InternalMyUiDsl.g:1771:3: ( 'Visible' )
                    {
                     before(grammarAccess.getOFlowValsAccess().getVisibleEnumLiteralDeclaration_1()); 
                    // InternalMyUiDsl.g:1772:3: ( 'Visible' )
                    // InternalMyUiDsl.g:1772:4: 'Visible'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getOFlowValsAccess().getVisibleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:1776:2: ( ( 'Hidden' ) )
                    {
                    // InternalMyUiDsl.g:1776:2: ( ( 'Hidden' ) )
                    // InternalMyUiDsl.g:1777:3: ( 'Hidden' )
                    {
                     before(grammarAccess.getOFlowValsAccess().getHiddenEnumLiteralDeclaration_2()); 
                    // InternalMyUiDsl.g:1778:3: ( 'Hidden' )
                    // InternalMyUiDsl.g:1778:4: 'Hidden'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getOFlowValsAccess().getHiddenEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:1782:2: ( ( 'Auto' ) )
                    {
                    // InternalMyUiDsl.g:1782:2: ( ( 'Auto' ) )
                    // InternalMyUiDsl.g:1783:3: ( 'Auto' )
                    {
                     before(grammarAccess.getOFlowValsAccess().getAutoEnumLiteralDeclaration_3()); 
                    // InternalMyUiDsl.g:1784:3: ( 'Auto' )
                    // InternalMyUiDsl.g:1784:4: 'Auto'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getOFlowValsAccess().getAutoEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__OFlowVals__Alternatives"


    // $ANTLR start "rule__InnerTypeArray__Alternatives"
    // InternalMyUiDsl.g:1792:1: rule__InnerTypeArray__Alternatives : ( ( ( 'Div' ) ) | ( ( 'Para' ) ) | ( ( 'Input' ) ) | ( ( 'Table' ) ) | ( ( 'Tr' ) ) | ( ( 'Td' ) ) | ( ( 'Img' ) ) | ( ( 'Form' ) ) | ( ( 'Button' ) ) );
    public final void rule__InnerTypeArray__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1796:1: ( ( ( 'Div' ) ) | ( ( 'Para' ) ) | ( ( 'Input' ) ) | ( ( 'Table' ) ) | ( ( 'Tr' ) ) | ( ( 'Td' ) ) | ( ( 'Img' ) ) | ( ( 'Form' ) ) | ( ( 'Button' ) ) )
            int alt12=9;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt12=1;
                }
                break;
            case 51:
                {
                alt12=2;
                }
                break;
            case 52:
                {
                alt12=3;
                }
                break;
            case 42:
                {
                alt12=4;
                }
                break;
            case 53:
                {
                alt12=5;
                }
                break;
            case 54:
                {
                alt12=6;
                }
                break;
            case 55:
                {
                alt12=7;
                }
                break;
            case 56:
                {
                alt12=8;
                }
                break;
            case 57:
                {
                alt12=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyUiDsl.g:1797:2: ( ( 'Div' ) )
                    {
                    // InternalMyUiDsl.g:1797:2: ( ( 'Div' ) )
                    // InternalMyUiDsl.g:1798:3: ( 'Div' )
                    {
                     before(grammarAccess.getInnerTypeArrayAccess().getDivEnumLiteralDeclaration_0()); 
                    // InternalMyUiDsl.g:1799:3: ( 'Div' )
                    // InternalMyUiDsl.g:1799:4: 'Div'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getInnerTypeArrayAccess().getDivEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:1803:2: ( ( 'Para' ) )
                    {
                    // InternalMyUiDsl.g:1803:2: ( ( 'Para' ) )
                    // InternalMyUiDsl.g:1804:3: ( 'Para' )
                    {
                     before(grammarAccess.getInnerTypeArrayAccess().getParaEnumLiteralDeclaration_1()); 
                    // InternalMyUiDsl.g:1805:3: ( 'Para' )
                    // InternalMyUiDsl.g:1805:4: 'Para'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getInnerTypeArrayAccess().getParaEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:1809:2: ( ( 'Input' ) )
                    {
                    // InternalMyUiDsl.g:1809:2: ( ( 'Input' ) )
                    // InternalMyUiDsl.g:1810:3: ( 'Input' )
                    {
                     before(grammarAccess.getInnerTypeArrayAccess().getInputEnumLiteralDeclaration_2()); 
                    // InternalMyUiDsl.g:1811:3: ( 'Input' )
                    // InternalMyUiDsl.g:1811:4: 'Input'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getInnerTypeArrayAccess().getInputEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:1815:2: ( ( 'Table' ) )
                    {
                    // InternalMyUiDsl.g:1815:2: ( ( 'Table' ) )
                    // InternalMyUiDsl.g:1816:3: ( 'Table' )
                    {
                     before(grammarAccess.getInnerTypeArrayAccess().getTableEnumLiteralDeclaration_3()); 
                    // InternalMyUiDsl.g:1817:3: ( 'Table' )
                    // InternalMyUiDsl.g:1817:4: 'Table'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getInnerTypeArrayAccess().getTableEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyUiDsl.g:1821:2: ( ( 'Tr' ) )
                    {
                    // InternalMyUiDsl.g:1821:2: ( ( 'Tr' ) )
                    // InternalMyUiDsl.g:1822:3: ( 'Tr' )
                    {
                     before(grammarAccess.getInnerTypeArrayAccess().getTrEnumLiteralDeclaration_4()); 
                    // InternalMyUiDsl.g:1823:3: ( 'Tr' )
                    // InternalMyUiDsl.g:1823:4: 'Tr'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getInnerTypeArrayAccess().getTrEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyUiDsl.g:1827:2: ( ( 'Td' ) )
                    {
                    // InternalMyUiDsl.g:1827:2: ( ( 'Td' ) )
                    // InternalMyUiDsl.g:1828:3: ( 'Td' )
                    {
                     before(grammarAccess.getInnerTypeArrayAccess().getTdEnumLiteralDeclaration_5()); 
                    // InternalMyUiDsl.g:1829:3: ( 'Td' )
                    // InternalMyUiDsl.g:1829:4: 'Td'
                    {
                    match(input,54,FOLLOW_2); 

                    }

                     after(grammarAccess.getInnerTypeArrayAccess().getTdEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyUiDsl.g:1833:2: ( ( 'Img' ) )
                    {
                    // InternalMyUiDsl.g:1833:2: ( ( 'Img' ) )
                    // InternalMyUiDsl.g:1834:3: ( 'Img' )
                    {
                     before(grammarAccess.getInnerTypeArrayAccess().getImgEnumLiteralDeclaration_6()); 
                    // InternalMyUiDsl.g:1835:3: ( 'Img' )
                    // InternalMyUiDsl.g:1835:4: 'Img'
                    {
                    match(input,55,FOLLOW_2); 

                    }

                     after(grammarAccess.getInnerTypeArrayAccess().getImgEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyUiDsl.g:1839:2: ( ( 'Form' ) )
                    {
                    // InternalMyUiDsl.g:1839:2: ( ( 'Form' ) )
                    // InternalMyUiDsl.g:1840:3: ( 'Form' )
                    {
                     before(grammarAccess.getInnerTypeArrayAccess().getFormEnumLiteralDeclaration_7()); 
                    // InternalMyUiDsl.g:1841:3: ( 'Form' )
                    // InternalMyUiDsl.g:1841:4: 'Form'
                    {
                    match(input,56,FOLLOW_2); 

                    }

                     after(grammarAccess.getInnerTypeArrayAccess().getFormEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyUiDsl.g:1845:2: ( ( 'Button' ) )
                    {
                    // InternalMyUiDsl.g:1845:2: ( ( 'Button' ) )
                    // InternalMyUiDsl.g:1846:3: ( 'Button' )
                    {
                     before(grammarAccess.getInnerTypeArrayAccess().getButtonEnumLiteralDeclaration_8()); 
                    // InternalMyUiDsl.g:1847:3: ( 'Button' )
                    // InternalMyUiDsl.g:1847:4: 'Button'
                    {
                    match(input,57,FOLLOW_2); 

                    }

                     after(grammarAccess.getInnerTypeArrayAccess().getButtonEnumLiteralDeclaration_8()); 

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
    // $ANTLR end "rule__InnerTypeArray__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyUiDsl.g:1855:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1859:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyUiDsl.g:1860:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyUiDsl.g:1867:1: rule__Model__Group__0__Impl : ( ( rule__Model__HeadsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1871:1: ( ( ( rule__Model__HeadsAssignment_0 )* ) )
            // InternalMyUiDsl.g:1872:1: ( ( rule__Model__HeadsAssignment_0 )* )
            {
            // InternalMyUiDsl.g:1872:1: ( ( rule__Model__HeadsAssignment_0 )* )
            // InternalMyUiDsl.g:1873:2: ( rule__Model__HeadsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getHeadsAssignment_0()); 
            // InternalMyUiDsl.g:1874:2: ( rule__Model__HeadsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==59) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyUiDsl.g:1874:3: rule__Model__HeadsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__HeadsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getHeadsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyUiDsl.g:1882:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1886:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyUiDsl.g:1887:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyUiDsl.g:1894:1: rule__Model__Group__1__Impl : ( '|' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1898:1: ( ( '|' ) )
            // InternalMyUiDsl.g:1899:1: ( '|' )
            {
            // InternalMyUiDsl.g:1899:1: ( '|' )
            // InternalMyUiDsl.g:1900:2: '|'
            {
             before(grammarAccess.getModelAccess().getVerticalLineKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getVerticalLineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalMyUiDsl.g:1909:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1913:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMyUiDsl.g:1914:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalMyUiDsl.g:1921:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__BodisAssignment_2 ) ) ( ( rule__Model__BodisAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1925:1: ( ( ( ( rule__Model__BodisAssignment_2 ) ) ( ( rule__Model__BodisAssignment_2 )* ) ) )
            // InternalMyUiDsl.g:1926:1: ( ( ( rule__Model__BodisAssignment_2 ) ) ( ( rule__Model__BodisAssignment_2 )* ) )
            {
            // InternalMyUiDsl.g:1926:1: ( ( ( rule__Model__BodisAssignment_2 ) ) ( ( rule__Model__BodisAssignment_2 )* ) )
            // InternalMyUiDsl.g:1927:2: ( ( rule__Model__BodisAssignment_2 ) ) ( ( rule__Model__BodisAssignment_2 )* )
            {
            // InternalMyUiDsl.g:1927:2: ( ( rule__Model__BodisAssignment_2 ) )
            // InternalMyUiDsl.g:1928:3: ( rule__Model__BodisAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getBodisAssignment_2()); 
            // InternalMyUiDsl.g:1929:3: ( rule__Model__BodisAssignment_2 )
            // InternalMyUiDsl.g:1929:4: rule__Model__BodisAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__Model__BodisAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getBodisAssignment_2()); 

            }

            // InternalMyUiDsl.g:1932:2: ( ( rule__Model__BodisAssignment_2 )* )
            // InternalMyUiDsl.g:1933:3: ( rule__Model__BodisAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getBodisAssignment_2()); 
            // InternalMyUiDsl.g:1934:3: ( rule__Model__BodisAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ONECHAR) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyUiDsl.g:1934:4: rule__Model__BodisAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__BodisAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getBodisAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalMyUiDsl.g:1943:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1947:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalMyUiDsl.g:1948:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalMyUiDsl.g:1955:1: rule__Model__Group__3__Impl : ( '|' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1959:1: ( ( '|' ) )
            // InternalMyUiDsl.g:1960:1: ( '|' )
            {
            // InternalMyUiDsl.g:1960:1: ( '|' )
            // InternalMyUiDsl.g:1961:2: '|'
            {
             before(grammarAccess.getModelAccess().getVerticalLineKeyword_3()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getVerticalLineKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalMyUiDsl.g:1970:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1974:1: ( rule__Model__Group__4__Impl )
            // InternalMyUiDsl.g:1975:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalMyUiDsl.g:1981:1: rule__Model__Group__4__Impl : ( ( rule__Model__AccessoriesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:1985:1: ( ( ( rule__Model__AccessoriesAssignment_4 )* ) )
            // InternalMyUiDsl.g:1986:1: ( ( rule__Model__AccessoriesAssignment_4 )* )
            {
            // InternalMyUiDsl.g:1986:1: ( ( rule__Model__AccessoriesAssignment_4 )* )
            // InternalMyUiDsl.g:1987:2: ( rule__Model__AccessoriesAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getAccessoriesAssignment_4()); 
            // InternalMyUiDsl.g:1988:2: ( rule__Model__AccessoriesAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ONECHAR) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyUiDsl.g:1988:3: rule__Model__AccessoriesAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__AccessoriesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAccessoriesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Head__Group__0"
    // InternalMyUiDsl.g:1997:1: rule__Head__Group__0 : rule__Head__Group__0__Impl rule__Head__Group__1 ;
    public final void rule__Head__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2001:1: ( rule__Head__Group__0__Impl rule__Head__Group__1 )
            // InternalMyUiDsl.g:2002:2: rule__Head__Group__0__Impl rule__Head__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Head__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Head__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group__0"


    // $ANTLR start "rule__Head__Group__0__Impl"
    // InternalMyUiDsl.g:2009:1: rule__Head__Group__0__Impl : ( 'import' ) ;
    public final void rule__Head__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2013:1: ( ( 'import' ) )
            // InternalMyUiDsl.g:2014:1: ( 'import' )
            {
            // InternalMyUiDsl.g:2014:1: ( 'import' )
            // InternalMyUiDsl.g:2015:2: 'import'
            {
             before(grammarAccess.getHeadAccess().getImportKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getHeadAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group__0__Impl"


    // $ANTLR start "rule__Head__Group__1"
    // InternalMyUiDsl.g:2024:1: rule__Head__Group__1 : rule__Head__Group__1__Impl rule__Head__Group__2 ;
    public final void rule__Head__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2028:1: ( rule__Head__Group__1__Impl rule__Head__Group__2 )
            // InternalMyUiDsl.g:2029:2: rule__Head__Group__1__Impl rule__Head__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Head__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Head__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group__1"


    // $ANTLR start "rule__Head__Group__1__Impl"
    // InternalMyUiDsl.g:2036:1: rule__Head__Group__1__Impl : ( ( rule__Head__FileNameAssignment_1 ) ) ;
    public final void rule__Head__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2040:1: ( ( ( rule__Head__FileNameAssignment_1 ) ) )
            // InternalMyUiDsl.g:2041:1: ( ( rule__Head__FileNameAssignment_1 ) )
            {
            // InternalMyUiDsl.g:2041:1: ( ( rule__Head__FileNameAssignment_1 ) )
            // InternalMyUiDsl.g:2042:2: ( rule__Head__FileNameAssignment_1 )
            {
             before(grammarAccess.getHeadAccess().getFileNameAssignment_1()); 
            // InternalMyUiDsl.g:2043:2: ( rule__Head__FileNameAssignment_1 )
            // InternalMyUiDsl.g:2043:3: rule__Head__FileNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Head__FileNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeadAccess().getFileNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group__1__Impl"


    // $ANTLR start "rule__Head__Group__2"
    // InternalMyUiDsl.g:2051:1: rule__Head__Group__2 : rule__Head__Group__2__Impl rule__Head__Group__3 ;
    public final void rule__Head__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2055:1: ( rule__Head__Group__2__Impl rule__Head__Group__3 )
            // InternalMyUiDsl.g:2056:2: rule__Head__Group__2__Impl rule__Head__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Head__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Head__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group__2"


    // $ANTLR start "rule__Head__Group__2__Impl"
    // InternalMyUiDsl.g:2063:1: rule__Head__Group__2__Impl : ( 'as' ) ;
    public final void rule__Head__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2067:1: ( ( 'as' ) )
            // InternalMyUiDsl.g:2068:1: ( 'as' )
            {
            // InternalMyUiDsl.g:2068:1: ( 'as' )
            // InternalMyUiDsl.g:2069:2: 'as'
            {
             before(grammarAccess.getHeadAccess().getAsKeyword_2()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getHeadAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group__2__Impl"


    // $ANTLR start "rule__Head__Group__3"
    // InternalMyUiDsl.g:2078:1: rule__Head__Group__3 : rule__Head__Group__3__Impl rule__Head__Group__4 ;
    public final void rule__Head__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2082:1: ( rule__Head__Group__3__Impl rule__Head__Group__4 )
            // InternalMyUiDsl.g:2083:2: rule__Head__Group__3__Impl rule__Head__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Head__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Head__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group__3"


    // $ANTLR start "rule__Head__Group__3__Impl"
    // InternalMyUiDsl.g:2090:1: rule__Head__Group__3__Impl : ( ( rule__Head__HeadTypeAssignment_3 ) ) ;
    public final void rule__Head__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2094:1: ( ( ( rule__Head__HeadTypeAssignment_3 ) ) )
            // InternalMyUiDsl.g:2095:1: ( ( rule__Head__HeadTypeAssignment_3 ) )
            {
            // InternalMyUiDsl.g:2095:1: ( ( rule__Head__HeadTypeAssignment_3 ) )
            // InternalMyUiDsl.g:2096:2: ( rule__Head__HeadTypeAssignment_3 )
            {
             before(grammarAccess.getHeadAccess().getHeadTypeAssignment_3()); 
            // InternalMyUiDsl.g:2097:2: ( rule__Head__HeadTypeAssignment_3 )
            // InternalMyUiDsl.g:2097:3: rule__Head__HeadTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Head__HeadTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHeadAccess().getHeadTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group__3__Impl"


    // $ANTLR start "rule__Head__Group__4"
    // InternalMyUiDsl.g:2105:1: rule__Head__Group__4 : rule__Head__Group__4__Impl ;
    public final void rule__Head__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2109:1: ( rule__Head__Group__4__Impl )
            // InternalMyUiDsl.g:2110:2: rule__Head__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Head__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group__4"


    // $ANTLR start "rule__Head__Group__4__Impl"
    // InternalMyUiDsl.g:2116:1: rule__Head__Group__4__Impl : ( ';' ) ;
    public final void rule__Head__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2120:1: ( ( ';' ) )
            // InternalMyUiDsl.g:2121:1: ( ';' )
            {
            // InternalMyUiDsl.g:2121:1: ( ';' )
            // InternalMyUiDsl.g:2122:2: ';'
            {
             before(grammarAccess.getHeadAccess().getSemicolonKeyword_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getHeadAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group__4__Impl"


    // $ANTLR start "rule__Body__Group__0"
    // InternalMyUiDsl.g:2132:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2136:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // InternalMyUiDsl.g:2137:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Body__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__0"


    // $ANTLR start "rule__Body__Group__0__Impl"
    // InternalMyUiDsl.g:2144:1: rule__Body__Group__0__Impl : ( ( rule__Body__NameAssignment_0 ) ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2148:1: ( ( ( rule__Body__NameAssignment_0 ) ) )
            // InternalMyUiDsl.g:2149:1: ( ( rule__Body__NameAssignment_0 ) )
            {
            // InternalMyUiDsl.g:2149:1: ( ( rule__Body__NameAssignment_0 ) )
            // InternalMyUiDsl.g:2150:2: ( rule__Body__NameAssignment_0 )
            {
             before(grammarAccess.getBodyAccess().getNameAssignment_0()); 
            // InternalMyUiDsl.g:2151:2: ( rule__Body__NameAssignment_0 )
            // InternalMyUiDsl.g:2151:3: rule__Body__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Body__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__0__Impl"


    // $ANTLR start "rule__Body__Group__1"
    // InternalMyUiDsl.g:2159:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2163:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // InternalMyUiDsl.g:2164:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Body__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__1"


    // $ANTLR start "rule__Body__Group__1__Impl"
    // InternalMyUiDsl.g:2171:1: rule__Body__Group__1__Impl : ( '->' ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2175:1: ( ( '->' ) )
            // InternalMyUiDsl.g:2176:1: ( '->' )
            {
            // InternalMyUiDsl.g:2176:1: ( '->' )
            // InternalMyUiDsl.g:2177:2: '->'
            {
             before(grammarAccess.getBodyAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__1__Impl"


    // $ANTLR start "rule__Body__Group__2"
    // InternalMyUiDsl.g:2186:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2190:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // InternalMyUiDsl.g:2191:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Body__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__2"


    // $ANTLR start "rule__Body__Group__2__Impl"
    // InternalMyUiDsl.g:2198:1: rule__Body__Group__2__Impl : ( ( ( rule__Body__RightAssignment_2 ) ) ( ( rule__Body__RightAssignment_2 )* ) ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2202:1: ( ( ( ( rule__Body__RightAssignment_2 ) ) ( ( rule__Body__RightAssignment_2 )* ) ) )
            // InternalMyUiDsl.g:2203:1: ( ( ( rule__Body__RightAssignment_2 ) ) ( ( rule__Body__RightAssignment_2 )* ) )
            {
            // InternalMyUiDsl.g:2203:1: ( ( ( rule__Body__RightAssignment_2 ) ) ( ( rule__Body__RightAssignment_2 )* ) )
            // InternalMyUiDsl.g:2204:2: ( ( rule__Body__RightAssignment_2 ) ) ( ( rule__Body__RightAssignment_2 )* )
            {
            // InternalMyUiDsl.g:2204:2: ( ( rule__Body__RightAssignment_2 ) )
            // InternalMyUiDsl.g:2205:3: ( rule__Body__RightAssignment_2 )
            {
             before(grammarAccess.getBodyAccess().getRightAssignment_2()); 
            // InternalMyUiDsl.g:2206:3: ( rule__Body__RightAssignment_2 )
            // InternalMyUiDsl.g:2206:4: rule__Body__RightAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__Body__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getRightAssignment_2()); 

            }

            // InternalMyUiDsl.g:2209:2: ( ( rule__Body__RightAssignment_2 )* )
            // InternalMyUiDsl.g:2210:3: ( rule__Body__RightAssignment_2 )*
            {
             before(grammarAccess.getBodyAccess().getRightAssignment_2()); 
            // InternalMyUiDsl.g:2211:3: ( rule__Body__RightAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ONECHAR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyUiDsl.g:2211:4: rule__Body__RightAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Body__RightAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getBodyAccess().getRightAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__2__Impl"


    // $ANTLR start "rule__Body__Group__3"
    // InternalMyUiDsl.g:2220:1: rule__Body__Group__3 : rule__Body__Group__3__Impl rule__Body__Group__4 ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2224:1: ( rule__Body__Group__3__Impl rule__Body__Group__4 )
            // InternalMyUiDsl.g:2225:2: rule__Body__Group__3__Impl rule__Body__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Body__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__3"


    // $ANTLR start "rule__Body__Group__3__Impl"
    // InternalMyUiDsl.g:2232:1: rule__Body__Group__3__Impl : ( ( rule__Body__SelfRepeatAssignment_3 )? ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2236:1: ( ( ( rule__Body__SelfRepeatAssignment_3 )? ) )
            // InternalMyUiDsl.g:2237:1: ( ( rule__Body__SelfRepeatAssignment_3 )? )
            {
            // InternalMyUiDsl.g:2237:1: ( ( rule__Body__SelfRepeatAssignment_3 )? )
            // InternalMyUiDsl.g:2238:2: ( rule__Body__SelfRepeatAssignment_3 )?
            {
             before(grammarAccess.getBodyAccess().getSelfRepeatAssignment_3()); 
            // InternalMyUiDsl.g:2239:2: ( rule__Body__SelfRepeatAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyUiDsl.g:2239:3: rule__Body__SelfRepeatAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Body__SelfRepeatAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBodyAccess().getSelfRepeatAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__3__Impl"


    // $ANTLR start "rule__Body__Group__4"
    // InternalMyUiDsl.g:2247:1: rule__Body__Group__4 : rule__Body__Group__4__Impl ;
    public final void rule__Body__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2251:1: ( rule__Body__Group__4__Impl )
            // InternalMyUiDsl.g:2252:2: rule__Body__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__4"


    // $ANTLR start "rule__Body__Group__4__Impl"
    // InternalMyUiDsl.g:2258:1: rule__Body__Group__4__Impl : ( ';' ) ;
    public final void rule__Body__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2262:1: ( ( ';' ) )
            // InternalMyUiDsl.g:2263:1: ( ';' )
            {
            // InternalMyUiDsl.g:2263:1: ( ';' )
            // InternalMyUiDsl.g:2264:2: ';'
            {
             before(grammarAccess.getBodyAccess().getSemicolonKeyword_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__4__Impl"


    // $ANTLR start "rule__SelfRepeat__Group__0"
    // InternalMyUiDsl.g:2274:1: rule__SelfRepeat__Group__0 : rule__SelfRepeat__Group__0__Impl rule__SelfRepeat__Group__1 ;
    public final void rule__SelfRepeat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2278:1: ( rule__SelfRepeat__Group__0__Impl rule__SelfRepeat__Group__1 )
            // InternalMyUiDsl.g:2279:2: rule__SelfRepeat__Group__0__Impl rule__SelfRepeat__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__SelfRepeat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelfRepeat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfRepeat__Group__0"


    // $ANTLR start "rule__SelfRepeat__Group__0__Impl"
    // InternalMyUiDsl.g:2286:1: rule__SelfRepeat__Group__0__Impl : ( ( rule__SelfRepeat__NumberAssignment_0 ) ) ;
    public final void rule__SelfRepeat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2290:1: ( ( ( rule__SelfRepeat__NumberAssignment_0 ) ) )
            // InternalMyUiDsl.g:2291:1: ( ( rule__SelfRepeat__NumberAssignment_0 ) )
            {
            // InternalMyUiDsl.g:2291:1: ( ( rule__SelfRepeat__NumberAssignment_0 ) )
            // InternalMyUiDsl.g:2292:2: ( rule__SelfRepeat__NumberAssignment_0 )
            {
             before(grammarAccess.getSelfRepeatAccess().getNumberAssignment_0()); 
            // InternalMyUiDsl.g:2293:2: ( rule__SelfRepeat__NumberAssignment_0 )
            // InternalMyUiDsl.g:2293:3: rule__SelfRepeat__NumberAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelfRepeat__NumberAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelfRepeatAccess().getNumberAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfRepeat__Group__0__Impl"


    // $ANTLR start "rule__SelfRepeat__Group__1"
    // InternalMyUiDsl.g:2301:1: rule__SelfRepeat__Group__1 : rule__SelfRepeat__Group__1__Impl ;
    public final void rule__SelfRepeat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2305:1: ( rule__SelfRepeat__Group__1__Impl )
            // InternalMyUiDsl.g:2306:2: rule__SelfRepeat__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelfRepeat__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfRepeat__Group__1"


    // $ANTLR start "rule__SelfRepeat__Group__1__Impl"
    // InternalMyUiDsl.g:2312:1: rule__SelfRepeat__Group__1__Impl : ( ( rule__SelfRepeat__VerticalAssignment_1 )? ) ;
    public final void rule__SelfRepeat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2316:1: ( ( ( rule__SelfRepeat__VerticalAssignment_1 )? ) )
            // InternalMyUiDsl.g:2317:1: ( ( rule__SelfRepeat__VerticalAssignment_1 )? )
            {
            // InternalMyUiDsl.g:2317:1: ( ( rule__SelfRepeat__VerticalAssignment_1 )? )
            // InternalMyUiDsl.g:2318:2: ( rule__SelfRepeat__VerticalAssignment_1 )?
            {
             before(grammarAccess.getSelfRepeatAccess().getVerticalAssignment_1()); 
            // InternalMyUiDsl.g:2319:2: ( rule__SelfRepeat__VerticalAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==99) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyUiDsl.g:2319:3: rule__SelfRepeat__VerticalAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelfRepeat__VerticalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelfRepeatAccess().getVerticalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfRepeat__Group__1__Impl"


    // $ANTLR start "rule__Accessory__Group__0"
    // InternalMyUiDsl.g:2328:1: rule__Accessory__Group__0 : rule__Accessory__Group__0__Impl rule__Accessory__Group__1 ;
    public final void rule__Accessory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2332:1: ( rule__Accessory__Group__0__Impl rule__Accessory__Group__1 )
            // InternalMyUiDsl.g:2333:2: rule__Accessory__Group__0__Impl rule__Accessory__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Accessory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Accessory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__Group__0"


    // $ANTLR start "rule__Accessory__Group__0__Impl"
    // InternalMyUiDsl.g:2340:1: rule__Accessory__Group__0__Impl : ( ( rule__Accessory__LeftAssignment_0 ) ) ;
    public final void rule__Accessory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2344:1: ( ( ( rule__Accessory__LeftAssignment_0 ) ) )
            // InternalMyUiDsl.g:2345:1: ( ( rule__Accessory__LeftAssignment_0 ) )
            {
            // InternalMyUiDsl.g:2345:1: ( ( rule__Accessory__LeftAssignment_0 ) )
            // InternalMyUiDsl.g:2346:2: ( rule__Accessory__LeftAssignment_0 )
            {
             before(grammarAccess.getAccessoryAccess().getLeftAssignment_0()); 
            // InternalMyUiDsl.g:2347:2: ( rule__Accessory__LeftAssignment_0 )
            // InternalMyUiDsl.g:2347:3: rule__Accessory__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Accessory__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAccessoryAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__Group__0__Impl"


    // $ANTLR start "rule__Accessory__Group__1"
    // InternalMyUiDsl.g:2355:1: rule__Accessory__Group__1 : rule__Accessory__Group__1__Impl rule__Accessory__Group__2 ;
    public final void rule__Accessory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2359:1: ( rule__Accessory__Group__1__Impl rule__Accessory__Group__2 )
            // InternalMyUiDsl.g:2360:2: rule__Accessory__Group__1__Impl rule__Accessory__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Accessory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Accessory__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__Group__1"


    // $ANTLR start "rule__Accessory__Group__1__Impl"
    // InternalMyUiDsl.g:2367:1: rule__Accessory__Group__1__Impl : ( ':' ) ;
    public final void rule__Accessory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2371:1: ( ( ':' ) )
            // InternalMyUiDsl.g:2372:1: ( ':' )
            {
            // InternalMyUiDsl.g:2372:1: ( ':' )
            // InternalMyUiDsl.g:2373:2: ':'
            {
             before(grammarAccess.getAccessoryAccess().getColonKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getAccessoryAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__Group__1__Impl"


    // $ANTLR start "rule__Accessory__Group__2"
    // InternalMyUiDsl.g:2382:1: rule__Accessory__Group__2 : rule__Accessory__Group__2__Impl ;
    public final void rule__Accessory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2386:1: ( rule__Accessory__Group__2__Impl )
            // InternalMyUiDsl.g:2387:2: rule__Accessory__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Accessory__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__Group__2"


    // $ANTLR start "rule__Accessory__Group__2__Impl"
    // InternalMyUiDsl.g:2393:1: rule__Accessory__Group__2__Impl : ( ( rule__Accessory__UnorderedGroup_2 ) ) ;
    public final void rule__Accessory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2397:1: ( ( ( rule__Accessory__UnorderedGroup_2 ) ) )
            // InternalMyUiDsl.g:2398:1: ( ( rule__Accessory__UnorderedGroup_2 ) )
            {
            // InternalMyUiDsl.g:2398:1: ( ( rule__Accessory__UnorderedGroup_2 ) )
            // InternalMyUiDsl.g:2399:2: ( rule__Accessory__UnorderedGroup_2 )
            {
             before(grammarAccess.getAccessoryAccess().getUnorderedGroup_2()); 
            // InternalMyUiDsl.g:2400:2: ( rule__Accessory__UnorderedGroup_2 )
            // InternalMyUiDsl.g:2400:3: rule__Accessory__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__Accessory__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getAccessoryAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__Group__2__Impl"


    // $ANTLR start "rule__InnerFeature__Group__0"
    // InternalMyUiDsl.g:2409:1: rule__InnerFeature__Group__0 : rule__InnerFeature__Group__0__Impl rule__InnerFeature__Group__1 ;
    public final void rule__InnerFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2413:1: ( rule__InnerFeature__Group__0__Impl rule__InnerFeature__Group__1 )
            // InternalMyUiDsl.g:2414:2: rule__InnerFeature__Group__0__Impl rule__InnerFeature__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__InnerFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerFeature__Group__0"


    // $ANTLR start "rule__InnerFeature__Group__0__Impl"
    // InternalMyUiDsl.g:2421:1: rule__InnerFeature__Group__0__Impl : ( () ) ;
    public final void rule__InnerFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2425:1: ( ( () ) )
            // InternalMyUiDsl.g:2426:1: ( () )
            {
            // InternalMyUiDsl.g:2426:1: ( () )
            // InternalMyUiDsl.g:2427:2: ()
            {
             before(grammarAccess.getInnerFeatureAccess().getInnerFeatureAction_0()); 
            // InternalMyUiDsl.g:2428:2: ()
            // InternalMyUiDsl.g:2428:3: 
            {
            }

             after(grammarAccess.getInnerFeatureAccess().getInnerFeatureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerFeature__Group__0__Impl"


    // $ANTLR start "rule__InnerFeature__Group__1"
    // InternalMyUiDsl.g:2436:1: rule__InnerFeature__Group__1 : rule__InnerFeature__Group__1__Impl ;
    public final void rule__InnerFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2440:1: ( rule__InnerFeature__Group__1__Impl )
            // InternalMyUiDsl.g:2441:2: rule__InnerFeature__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerFeature__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerFeature__Group__1"


    // $ANTLR start "rule__InnerFeature__Group__1__Impl"
    // InternalMyUiDsl.g:2447:1: rule__InnerFeature__Group__1__Impl : ( ( rule__InnerFeature__ValueAssignment_1 ) ) ;
    public final void rule__InnerFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2451:1: ( ( ( rule__InnerFeature__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:2452:1: ( ( rule__InnerFeature__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:2452:1: ( ( rule__InnerFeature__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:2453:2: ( rule__InnerFeature__ValueAssignment_1 )
            {
             before(grammarAccess.getInnerFeatureAccess().getValueAssignment_1()); 
            // InternalMyUiDsl.g:2454:2: ( rule__InnerFeature__ValueAssignment_1 )
            // InternalMyUiDsl.g:2454:3: rule__InnerFeature__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InnerFeature__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerFeatureAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerFeature__Group__1__Impl"


    // $ANTLR start "rule__InnerText__Group__0"
    // InternalMyUiDsl.g:2463:1: rule__InnerText__Group__0 : rule__InnerText__Group__0__Impl rule__InnerText__Group__1 ;
    public final void rule__InnerText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2467:1: ( rule__InnerText__Group__0__Impl rule__InnerText__Group__1 )
            // InternalMyUiDsl.g:2468:2: rule__InnerText__Group__0__Impl rule__InnerText__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__InnerText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerText__Group__0"


    // $ANTLR start "rule__InnerText__Group__0__Impl"
    // InternalMyUiDsl.g:2475:1: rule__InnerText__Group__0__Impl : ( '<' ) ;
    public final void rule__InnerText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2479:1: ( ( '<' ) )
            // InternalMyUiDsl.g:2480:1: ( '<' )
            {
            // InternalMyUiDsl.g:2480:1: ( '<' )
            // InternalMyUiDsl.g:2481:2: '<'
            {
             before(grammarAccess.getInnerTextAccess().getLessThanSignKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getInnerTextAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerText__Group__0__Impl"


    // $ANTLR start "rule__InnerText__Group__1"
    // InternalMyUiDsl.g:2490:1: rule__InnerText__Group__1 : rule__InnerText__Group__1__Impl rule__InnerText__Group__2 ;
    public final void rule__InnerText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2494:1: ( rule__InnerText__Group__1__Impl rule__InnerText__Group__2 )
            // InternalMyUiDsl.g:2495:2: rule__InnerText__Group__1__Impl rule__InnerText__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__InnerText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerText__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerText__Group__1"


    // $ANTLR start "rule__InnerText__Group__1__Impl"
    // InternalMyUiDsl.g:2502:1: rule__InnerText__Group__1__Impl : ( ( rule__InnerText__ValueAssignment_1 ) ) ;
    public final void rule__InnerText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2506:1: ( ( ( rule__InnerText__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:2507:1: ( ( rule__InnerText__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:2507:1: ( ( rule__InnerText__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:2508:2: ( rule__InnerText__ValueAssignment_1 )
            {
             before(grammarAccess.getInnerTextAccess().getValueAssignment_1()); 
            // InternalMyUiDsl.g:2509:2: ( rule__InnerText__ValueAssignment_1 )
            // InternalMyUiDsl.g:2509:3: rule__InnerText__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InnerText__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerTextAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerText__Group__1__Impl"


    // $ANTLR start "rule__InnerText__Group__2"
    // InternalMyUiDsl.g:2517:1: rule__InnerText__Group__2 : rule__InnerText__Group__2__Impl ;
    public final void rule__InnerText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2521:1: ( rule__InnerText__Group__2__Impl )
            // InternalMyUiDsl.g:2522:2: rule__InnerText__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerText__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerText__Group__2"


    // $ANTLR start "rule__InnerText__Group__2__Impl"
    // InternalMyUiDsl.g:2528:1: rule__InnerText__Group__2__Impl : ( '>' ) ;
    public final void rule__InnerText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2532:1: ( ( '>' ) )
            // InternalMyUiDsl.g:2533:1: ( '>' )
            {
            // InternalMyUiDsl.g:2533:1: ( '>' )
            // InternalMyUiDsl.g:2534:2: '>'
            {
             before(grammarAccess.getInnerTextAccess().getGreaterThanSignKeyword_2()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getInnerTextAccess().getGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerText__Group__2__Impl"


    // $ANTLR start "rule__InnerStyle__Group__0"
    // InternalMyUiDsl.g:2544:1: rule__InnerStyle__Group__0 : rule__InnerStyle__Group__0__Impl rule__InnerStyle__Group__1 ;
    public final void rule__InnerStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2548:1: ( rule__InnerStyle__Group__0__Impl rule__InnerStyle__Group__1 )
            // InternalMyUiDsl.g:2549:2: rule__InnerStyle__Group__0__Impl rule__InnerStyle__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__InnerStyle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerStyle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerStyle__Group__0"


    // $ANTLR start "rule__InnerStyle__Group__0__Impl"
    // InternalMyUiDsl.g:2556:1: rule__InnerStyle__Group__0__Impl : ( '(' ) ;
    public final void rule__InnerStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2560:1: ( ( '(' ) )
            // InternalMyUiDsl.g:2561:1: ( '(' )
            {
            // InternalMyUiDsl.g:2561:1: ( '(' )
            // InternalMyUiDsl.g:2562:2: '('
            {
             before(grammarAccess.getInnerStyleAccess().getLeftParenthesisKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getInnerStyleAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerStyle__Group__0__Impl"


    // $ANTLR start "rule__InnerStyle__Group__1"
    // InternalMyUiDsl.g:2571:1: rule__InnerStyle__Group__1 : rule__InnerStyle__Group__1__Impl rule__InnerStyle__Group__2 ;
    public final void rule__InnerStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2575:1: ( rule__InnerStyle__Group__1__Impl rule__InnerStyle__Group__2 )
            // InternalMyUiDsl.g:2576:2: rule__InnerStyle__Group__1__Impl rule__InnerStyle__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__InnerStyle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerStyle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerStyle__Group__1"


    // $ANTLR start "rule__InnerStyle__Group__1__Impl"
    // InternalMyUiDsl.g:2583:1: rule__InnerStyle__Group__1__Impl : ( () ) ;
    public final void rule__InnerStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2587:1: ( ( () ) )
            // InternalMyUiDsl.g:2588:1: ( () )
            {
            // InternalMyUiDsl.g:2588:1: ( () )
            // InternalMyUiDsl.g:2589:2: ()
            {
             before(grammarAccess.getInnerStyleAccess().getInnerStyleAction_1()); 
            // InternalMyUiDsl.g:2590:2: ()
            // InternalMyUiDsl.g:2590:3: 
            {
            }

             after(grammarAccess.getInnerStyleAccess().getInnerStyleAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerStyle__Group__1__Impl"


    // $ANTLR start "rule__InnerStyle__Group__2"
    // InternalMyUiDsl.g:2598:1: rule__InnerStyle__Group__2 : rule__InnerStyle__Group__2__Impl rule__InnerStyle__Group__3 ;
    public final void rule__InnerStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2602:1: ( rule__InnerStyle__Group__2__Impl rule__InnerStyle__Group__3 )
            // InternalMyUiDsl.g:2603:2: rule__InnerStyle__Group__2__Impl rule__InnerStyle__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__InnerStyle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerStyle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerStyle__Group__2"


    // $ANTLR start "rule__InnerStyle__Group__2__Impl"
    // InternalMyUiDsl.g:2610:1: rule__InnerStyle__Group__2__Impl : ( ( rule__InnerStyle__StylesAssignment_2 )* ) ;
    public final void rule__InnerStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2614:1: ( ( ( rule__InnerStyle__StylesAssignment_2 )* ) )
            // InternalMyUiDsl.g:2615:1: ( ( rule__InnerStyle__StylesAssignment_2 )* )
            {
            // InternalMyUiDsl.g:2615:1: ( ( rule__InnerStyle__StylesAssignment_2 )* )
            // InternalMyUiDsl.g:2616:2: ( rule__InnerStyle__StylesAssignment_2 )*
            {
             before(grammarAccess.getInnerStyleAccess().getStylesAssignment_2()); 
            // InternalMyUiDsl.g:2617:2: ( rule__InnerStyle__StylesAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=73 && LA19_0<=75)||(LA19_0>=81 && LA19_0<=92)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyUiDsl.g:2617:3: rule__InnerStyle__StylesAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__InnerStyle__StylesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getInnerStyleAccess().getStylesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerStyle__Group__2__Impl"


    // $ANTLR start "rule__InnerStyle__Group__3"
    // InternalMyUiDsl.g:2625:1: rule__InnerStyle__Group__3 : rule__InnerStyle__Group__3__Impl ;
    public final void rule__InnerStyle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2629:1: ( rule__InnerStyle__Group__3__Impl )
            // InternalMyUiDsl.g:2630:2: rule__InnerStyle__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerStyle__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerStyle__Group__3"


    // $ANTLR start "rule__InnerStyle__Group__3__Impl"
    // InternalMyUiDsl.g:2636:1: rule__InnerStyle__Group__3__Impl : ( ')' ) ;
    public final void rule__InnerStyle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2640:1: ( ( ')' ) )
            // InternalMyUiDsl.g:2641:1: ( ')' )
            {
            // InternalMyUiDsl.g:2641:1: ( ')' )
            // InternalMyUiDsl.g:2642:2: ')'
            {
             before(grammarAccess.getInnerStyleAccess().getRightParenthesisKeyword_3()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getInnerStyleAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerStyle__Group__3__Impl"


    // $ANTLR start "rule__InnerClass__Group__0"
    // InternalMyUiDsl.g:2652:1: rule__InnerClass__Group__0 : rule__InnerClass__Group__0__Impl rule__InnerClass__Group__1 ;
    public final void rule__InnerClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2656:1: ( rule__InnerClass__Group__0__Impl rule__InnerClass__Group__1 )
            // InternalMyUiDsl.g:2657:2: rule__InnerClass__Group__0__Impl rule__InnerClass__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__InnerClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerClass__Group__0"


    // $ANTLR start "rule__InnerClass__Group__0__Impl"
    // InternalMyUiDsl.g:2664:1: rule__InnerClass__Group__0__Impl : ( '[' ) ;
    public final void rule__InnerClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2668:1: ( ( '[' ) )
            // InternalMyUiDsl.g:2669:1: ( '[' )
            {
            // InternalMyUiDsl.g:2669:1: ( '[' )
            // InternalMyUiDsl.g:2670:2: '['
            {
             before(grammarAccess.getInnerClassAccess().getLeftSquareBracketKeyword_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getInnerClassAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerClass__Group__0__Impl"


    // $ANTLR start "rule__InnerClass__Group__1"
    // InternalMyUiDsl.g:2679:1: rule__InnerClass__Group__1 : rule__InnerClass__Group__1__Impl rule__InnerClass__Group__2 ;
    public final void rule__InnerClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2683:1: ( rule__InnerClass__Group__1__Impl rule__InnerClass__Group__2 )
            // InternalMyUiDsl.g:2684:2: rule__InnerClass__Group__1__Impl rule__InnerClass__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__InnerClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerClass__Group__1"


    // $ANTLR start "rule__InnerClass__Group__1__Impl"
    // InternalMyUiDsl.g:2691:1: rule__InnerClass__Group__1__Impl : ( ( rule__InnerClass__ClazzesAssignment_1 ) ) ;
    public final void rule__InnerClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2695:1: ( ( ( rule__InnerClass__ClazzesAssignment_1 ) ) )
            // InternalMyUiDsl.g:2696:1: ( ( rule__InnerClass__ClazzesAssignment_1 ) )
            {
            // InternalMyUiDsl.g:2696:1: ( ( rule__InnerClass__ClazzesAssignment_1 ) )
            // InternalMyUiDsl.g:2697:2: ( rule__InnerClass__ClazzesAssignment_1 )
            {
             before(grammarAccess.getInnerClassAccess().getClazzesAssignment_1()); 
            // InternalMyUiDsl.g:2698:2: ( rule__InnerClass__ClazzesAssignment_1 )
            // InternalMyUiDsl.g:2698:3: rule__InnerClass__ClazzesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InnerClass__ClazzesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerClassAccess().getClazzesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerClass__Group__1__Impl"


    // $ANTLR start "rule__InnerClass__Group__2"
    // InternalMyUiDsl.g:2706:1: rule__InnerClass__Group__2 : rule__InnerClass__Group__2__Impl ;
    public final void rule__InnerClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2710:1: ( rule__InnerClass__Group__2__Impl )
            // InternalMyUiDsl.g:2711:2: rule__InnerClass__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerClass__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerClass__Group__2"


    // $ANTLR start "rule__InnerClass__Group__2__Impl"
    // InternalMyUiDsl.g:2717:1: rule__InnerClass__Group__2__Impl : ( ']' ) ;
    public final void rule__InnerClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2721:1: ( ( ']' ) )
            // InternalMyUiDsl.g:2722:1: ( ']' )
            {
            // InternalMyUiDsl.g:2722:1: ( ']' )
            // InternalMyUiDsl.g:2723:2: ']'
            {
             before(grammarAccess.getInnerClassAccess().getRightSquareBracketKeyword_2()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getInnerClassAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerClass__Group__2__Impl"


    // $ANTLR start "rule__ClassName__Group__0"
    // InternalMyUiDsl.g:2733:1: rule__ClassName__Group__0 : rule__ClassName__Group__0__Impl rule__ClassName__Group__1 ;
    public final void rule__ClassName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2737:1: ( rule__ClassName__Group__0__Impl rule__ClassName__Group__1 )
            // InternalMyUiDsl.g:2738:2: rule__ClassName__Group__0__Impl rule__ClassName__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ClassName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassName__Group__0"


    // $ANTLR start "rule__ClassName__Group__0__Impl"
    // InternalMyUiDsl.g:2745:1: rule__ClassName__Group__0__Impl : ( ( rule__ClassName__TheIdAssignment_0 )? ) ;
    public final void rule__ClassName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2749:1: ( ( ( rule__ClassName__TheIdAssignment_0 )? ) )
            // InternalMyUiDsl.g:2750:1: ( ( rule__ClassName__TheIdAssignment_0 )? )
            {
            // InternalMyUiDsl.g:2750:1: ( ( rule__ClassName__TheIdAssignment_0 )? )
            // InternalMyUiDsl.g:2751:2: ( rule__ClassName__TheIdAssignment_0 )?
            {
             before(grammarAccess.getClassNameAccess().getTheIdAssignment_0()); 
            // InternalMyUiDsl.g:2752:2: ( rule__ClassName__TheIdAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyUiDsl.g:2752:3: rule__ClassName__TheIdAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassName__TheIdAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassNameAccess().getTheIdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassName__Group__0__Impl"


    // $ANTLR start "rule__ClassName__Group__1"
    // InternalMyUiDsl.g:2760:1: rule__ClassName__Group__1 : rule__ClassName__Group__1__Impl ;
    public final void rule__ClassName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2764:1: ( rule__ClassName__Group__1__Impl )
            // InternalMyUiDsl.g:2765:2: rule__ClassName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassName__Group__1"


    // $ANTLR start "rule__ClassName__Group__1__Impl"
    // InternalMyUiDsl.g:2771:1: rule__ClassName__Group__1__Impl : ( ( rule__ClassName__ClazzAssignment_1 )* ) ;
    public final void rule__ClassName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2775:1: ( ( ( rule__ClassName__ClazzAssignment_1 )* ) )
            // InternalMyUiDsl.g:2776:1: ( ( rule__ClassName__ClazzAssignment_1 )* )
            {
            // InternalMyUiDsl.g:2776:1: ( ( rule__ClassName__ClazzAssignment_1 )* )
            // InternalMyUiDsl.g:2777:2: ( rule__ClassName__ClazzAssignment_1 )*
            {
             before(grammarAccess.getClassNameAccess().getClazzAssignment_1()); 
            // InternalMyUiDsl.g:2778:2: ( rule__ClassName__ClazzAssignment_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==70) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyUiDsl.g:2778:3: rule__ClassName__ClazzAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ClassName__ClazzAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getClassNameAccess().getClazzAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassName__Group__1__Impl"


    // $ANTLR start "rule__ClassNameSec__Group__0"
    // InternalMyUiDsl.g:2787:1: rule__ClassNameSec__Group__0 : rule__ClassNameSec__Group__0__Impl rule__ClassNameSec__Group__1 ;
    public final void rule__ClassNameSec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2791:1: ( rule__ClassNameSec__Group__0__Impl rule__ClassNameSec__Group__1 )
            // InternalMyUiDsl.g:2792:2: rule__ClassNameSec__Group__0__Impl rule__ClassNameSec__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ClassNameSec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassNameSec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassNameSec__Group__0"


    // $ANTLR start "rule__ClassNameSec__Group__0__Impl"
    // InternalMyUiDsl.g:2799:1: rule__ClassNameSec__Group__0__Impl : ( ',' ) ;
    public final void rule__ClassNameSec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2803:1: ( ( ',' ) )
            // InternalMyUiDsl.g:2804:1: ( ',' )
            {
            // InternalMyUiDsl.g:2804:1: ( ',' )
            // InternalMyUiDsl.g:2805:2: ','
            {
             before(grammarAccess.getClassNameSecAccess().getCommaKeyword_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getClassNameSecAccess().getCommaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassNameSec__Group__0__Impl"


    // $ANTLR start "rule__ClassNameSec__Group__1"
    // InternalMyUiDsl.g:2814:1: rule__ClassNameSec__Group__1 : rule__ClassNameSec__Group__1__Impl ;
    public final void rule__ClassNameSec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2818:1: ( rule__ClassNameSec__Group__1__Impl )
            // InternalMyUiDsl.g:2819:2: rule__ClassNameSec__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassNameSec__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassNameSec__Group__1"


    // $ANTLR start "rule__ClassNameSec__Group__1__Impl"
    // InternalMyUiDsl.g:2825:1: rule__ClassNameSec__Group__1__Impl : ( ( rule__ClassNameSec__CfClazzAssignment_1 ) ) ;
    public final void rule__ClassNameSec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2829:1: ( ( ( rule__ClassNameSec__CfClazzAssignment_1 ) ) )
            // InternalMyUiDsl.g:2830:1: ( ( rule__ClassNameSec__CfClazzAssignment_1 ) )
            {
            // InternalMyUiDsl.g:2830:1: ( ( rule__ClassNameSec__CfClazzAssignment_1 ) )
            // InternalMyUiDsl.g:2831:2: ( rule__ClassNameSec__CfClazzAssignment_1 )
            {
             before(grammarAccess.getClassNameSecAccess().getCfClazzAssignment_1()); 
            // InternalMyUiDsl.g:2832:2: ( rule__ClassNameSec__CfClazzAssignment_1 )
            // InternalMyUiDsl.g:2832:3: rule__ClassNameSec__CfClazzAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassNameSec__CfClazzAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassNameSecAccess().getCfClazzAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassNameSec__Group__1__Impl"


    // $ANTLR start "rule__InnerType__Group__0"
    // InternalMyUiDsl.g:2841:1: rule__InnerType__Group__0 : rule__InnerType__Group__0__Impl rule__InnerType__Group__1 ;
    public final void rule__InnerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2845:1: ( rule__InnerType__Group__0__Impl rule__InnerType__Group__1 )
            // InternalMyUiDsl.g:2846:2: rule__InnerType__Group__0__Impl rule__InnerType__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__InnerType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerType__Group__0"


    // $ANTLR start "rule__InnerType__Group__0__Impl"
    // InternalMyUiDsl.g:2853:1: rule__InnerType__Group__0__Impl : ( '{' ) ;
    public final void rule__InnerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2857:1: ( ( '{' ) )
            // InternalMyUiDsl.g:2858:1: ( '{' )
            {
            // InternalMyUiDsl.g:2858:1: ( '{' )
            // InternalMyUiDsl.g:2859:2: '{'
            {
             before(grammarAccess.getInnerTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getInnerTypeAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerType__Group__0__Impl"


    // $ANTLR start "rule__InnerType__Group__1"
    // InternalMyUiDsl.g:2868:1: rule__InnerType__Group__1 : rule__InnerType__Group__1__Impl rule__InnerType__Group__2 ;
    public final void rule__InnerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2872:1: ( rule__InnerType__Group__1__Impl rule__InnerType__Group__2 )
            // InternalMyUiDsl.g:2873:2: rule__InnerType__Group__1__Impl rule__InnerType__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__InnerType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerType__Group__1"


    // $ANTLR start "rule__InnerType__Group__1__Impl"
    // InternalMyUiDsl.g:2880:1: rule__InnerType__Group__1__Impl : ( ( rule__InnerType__ValueAssignment_1 ) ) ;
    public final void rule__InnerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2884:1: ( ( ( rule__InnerType__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:2885:1: ( ( rule__InnerType__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:2885:1: ( ( rule__InnerType__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:2886:2: ( rule__InnerType__ValueAssignment_1 )
            {
             before(grammarAccess.getInnerTypeAccess().getValueAssignment_1()); 
            // InternalMyUiDsl.g:2887:2: ( rule__InnerType__ValueAssignment_1 )
            // InternalMyUiDsl.g:2887:3: rule__InnerType__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InnerType__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerTypeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerType__Group__1__Impl"


    // $ANTLR start "rule__InnerType__Group__2"
    // InternalMyUiDsl.g:2895:1: rule__InnerType__Group__2 : rule__InnerType__Group__2__Impl ;
    public final void rule__InnerType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2899:1: ( rule__InnerType__Group__2__Impl )
            // InternalMyUiDsl.g:2900:2: rule__InnerType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerType__Group__2"


    // $ANTLR start "rule__InnerType__Group__2__Impl"
    // InternalMyUiDsl.g:2906:1: rule__InnerType__Group__2__Impl : ( '}' ) ;
    public final void rule__InnerType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2910:1: ( ( '}' ) )
            // InternalMyUiDsl.g:2911:1: ( '}' )
            {
            // InternalMyUiDsl.g:2911:1: ( '}' )
            // InternalMyUiDsl.g:2912:2: '}'
            {
             before(grammarAccess.getInnerTypeAccess().getRightCurlyBracketKeyword_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getInnerTypeAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerType__Group__2__Impl"


    // $ANTLR start "rule__CssStyle__Group__0"
    // InternalMyUiDsl.g:2922:1: rule__CssStyle__Group__0 : rule__CssStyle__Group__0__Impl rule__CssStyle__Group__1 ;
    public final void rule__CssStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2926:1: ( rule__CssStyle__Group__0__Impl rule__CssStyle__Group__1 )
            // InternalMyUiDsl.g:2927:2: rule__CssStyle__Group__0__Impl rule__CssStyle__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__CssStyle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CssStyle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssStyle__Group__0"


    // $ANTLR start "rule__CssStyle__Group__0__Impl"
    // InternalMyUiDsl.g:2934:1: rule__CssStyle__Group__0__Impl : ( ( rule__CssStyle__Alternatives_0 ) ) ;
    public final void rule__CssStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2938:1: ( ( ( rule__CssStyle__Alternatives_0 ) ) )
            // InternalMyUiDsl.g:2939:1: ( ( rule__CssStyle__Alternatives_0 ) )
            {
            // InternalMyUiDsl.g:2939:1: ( ( rule__CssStyle__Alternatives_0 ) )
            // InternalMyUiDsl.g:2940:2: ( rule__CssStyle__Alternatives_0 )
            {
             before(grammarAccess.getCssStyleAccess().getAlternatives_0()); 
            // InternalMyUiDsl.g:2941:2: ( rule__CssStyle__Alternatives_0 )
            // InternalMyUiDsl.g:2941:3: rule__CssStyle__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__CssStyle__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCssStyleAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssStyle__Group__0__Impl"


    // $ANTLR start "rule__CssStyle__Group__1"
    // InternalMyUiDsl.g:2949:1: rule__CssStyle__Group__1 : rule__CssStyle__Group__1__Impl ;
    public final void rule__CssStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2953:1: ( rule__CssStyle__Group__1__Impl )
            // InternalMyUiDsl.g:2954:2: rule__CssStyle__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CssStyle__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssStyle__Group__1"


    // $ANTLR start "rule__CssStyle__Group__1__Impl"
    // InternalMyUiDsl.g:2960:1: rule__CssStyle__Group__1__Impl : ( ';' ) ;
    public final void rule__CssStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2964:1: ( ( ';' ) )
            // InternalMyUiDsl.g:2965:1: ( ';' )
            {
            // InternalMyUiDsl.g:2965:1: ( ';' )
            // InternalMyUiDsl.g:2966:2: ';'
            {
             before(grammarAccess.getCssStyleAccess().getSemicolonKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getCssStyleAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssStyle__Group__1__Impl"


    // $ANTLR start "rule__Border__Group__0"
    // InternalMyUiDsl.g:2976:1: rule__Border__Group__0 : rule__Border__Group__0__Impl rule__Border__Group__1 ;
    public final void rule__Border__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2980:1: ( rule__Border__Group__0__Impl rule__Border__Group__1 )
            // InternalMyUiDsl.g:2981:2: rule__Border__Group__0__Impl rule__Border__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Border__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Border__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Border__Group__0"


    // $ANTLR start "rule__Border__Group__0__Impl"
    // InternalMyUiDsl.g:2988:1: rule__Border__Group__0__Impl : ( 'border:' ) ;
    public final void rule__Border__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:2992:1: ( ( 'border:' ) )
            // InternalMyUiDsl.g:2993:1: ( 'border:' )
            {
            // InternalMyUiDsl.g:2993:1: ( 'border:' )
            // InternalMyUiDsl.g:2994:2: 'border:'
            {
             before(grammarAccess.getBorderAccess().getBorderKeyword_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getBorderAccess().getBorderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Border__Group__0__Impl"


    // $ANTLR start "rule__Border__Group__1"
    // InternalMyUiDsl.g:3003:1: rule__Border__Group__1 : rule__Border__Group__1__Impl ;
    public final void rule__Border__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3007:1: ( rule__Border__Group__1__Impl )
            // InternalMyUiDsl.g:3008:2: rule__Border__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Border__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Border__Group__1"


    // $ANTLR start "rule__Border__Group__1__Impl"
    // InternalMyUiDsl.g:3014:1: rule__Border__Group__1__Impl : ( ( rule__Border__ValueAssignment_1 ) ) ;
    public final void rule__Border__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3018:1: ( ( ( rule__Border__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:3019:1: ( ( rule__Border__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:3019:1: ( ( rule__Border__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:3020:2: ( rule__Border__ValueAssignment_1 )
            {
             before(grammarAccess.getBorderAccess().getValueAssignment_1()); 
            // InternalMyUiDsl.g:3021:2: ( rule__Border__ValueAssignment_1 )
            // InternalMyUiDsl.g:3021:3: rule__Border__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Border__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBorderAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Border__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalMyUiDsl.g:3030:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3034:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalMyUiDsl.g:3035:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // InternalMyUiDsl.g:3042:1: rule__Color__Group__0__Impl : ( 'color:' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3046:1: ( ( 'color:' ) )
            // InternalMyUiDsl.g:3047:1: ( 'color:' )
            {
            // InternalMyUiDsl.g:3047:1: ( 'color:' )
            // InternalMyUiDsl.g:3048:2: 'color:'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalMyUiDsl.g:3057:1: rule__Color__Group__1 : rule__Color__Group__1__Impl ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3061:1: ( rule__Color__Group__1__Impl )
            // InternalMyUiDsl.g:3062:2: rule__Color__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // InternalMyUiDsl.g:3068:1: rule__Color__Group__1__Impl : ( ( rule__Color__ValueAssignment_1 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3072:1: ( ( ( rule__Color__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:3073:1: ( ( rule__Color__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:3073:1: ( ( rule__Color__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:3074:2: ( rule__Color__ValueAssignment_1 )
            {
             before(grammarAccess.getColorAccess().getValueAssignment_1()); 
            // InternalMyUiDsl.g:3075:2: ( rule__Color__ValueAssignment_1 )
            // InternalMyUiDsl.g:3075:3: rule__Color__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Color__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__BackColor__Group__0"
    // InternalMyUiDsl.g:3084:1: rule__BackColor__Group__0 : rule__BackColor__Group__0__Impl rule__BackColor__Group__1 ;
    public final void rule__BackColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3088:1: ( rule__BackColor__Group__0__Impl rule__BackColor__Group__1 )
            // InternalMyUiDsl.g:3089:2: rule__BackColor__Group__0__Impl rule__BackColor__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__BackColor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackColor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackColor__Group__0"


    // $ANTLR start "rule__BackColor__Group__0__Impl"
    // InternalMyUiDsl.g:3096:1: rule__BackColor__Group__0__Impl : ( 'bcolor:' ) ;
    public final void rule__BackColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3100:1: ( ( 'bcolor:' ) )
            // InternalMyUiDsl.g:3101:1: ( 'bcolor:' )
            {
            // InternalMyUiDsl.g:3101:1: ( 'bcolor:' )
            // InternalMyUiDsl.g:3102:2: 'bcolor:'
            {
             before(grammarAccess.getBackColorAccess().getBcolorKeyword_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getBackColorAccess().getBcolorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackColor__Group__0__Impl"


    // $ANTLR start "rule__BackColor__Group__1"
    // InternalMyUiDsl.g:3111:1: rule__BackColor__Group__1 : rule__BackColor__Group__1__Impl ;
    public final void rule__BackColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3115:1: ( rule__BackColor__Group__1__Impl )
            // InternalMyUiDsl.g:3116:2: rule__BackColor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BackColor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackColor__Group__1"


    // $ANTLR start "rule__BackColor__Group__1__Impl"
    // InternalMyUiDsl.g:3122:1: rule__BackColor__Group__1__Impl : ( ( rule__BackColor__ValueAssignment_1 ) ) ;
    public final void rule__BackColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3126:1: ( ( ( rule__BackColor__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:3127:1: ( ( rule__BackColor__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:3127:1: ( ( rule__BackColor__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:3128:2: ( rule__BackColor__ValueAssignment_1 )
            {
             before(grammarAccess.getBackColorAccess().getValueAssignment_1()); 
            // InternalMyUiDsl.g:3129:2: ( rule__BackColor__ValueAssignment_1 )
            // InternalMyUiDsl.g:3129:3: rule__BackColor__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BackColor__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBackColorAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackColor__Group__1__Impl"


    // $ANTLR start "rule__RgbaColor__Group__0"
    // InternalMyUiDsl.g:3138:1: rule__RgbaColor__Group__0 : rule__RgbaColor__Group__0__Impl rule__RgbaColor__Group__1 ;
    public final void rule__RgbaColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3142:1: ( rule__RgbaColor__Group__0__Impl rule__RgbaColor__Group__1 )
            // InternalMyUiDsl.g:3143:2: rule__RgbaColor__Group__0__Impl rule__RgbaColor__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__RgbaColor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RgbaColor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RgbaColor__Group__0"


    // $ANTLR start "rule__RgbaColor__Group__0__Impl"
    // InternalMyUiDsl.g:3150:1: rule__RgbaColor__Group__0__Impl : ( 'rgba(' ) ;
    public final void rule__RgbaColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3154:1: ( ( 'rgba(' ) )
            // InternalMyUiDsl.g:3155:1: ( 'rgba(' )
            {
            // InternalMyUiDsl.g:3155:1: ( 'rgba(' )
            // InternalMyUiDsl.g:3156:2: 'rgba('
            {
             before(grammarAccess.getRgbaColorAccess().getRgbaKeyword_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getRgbaColorAccess().getRgbaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RgbaColor__Group__0__Impl"


    // $ANTLR start "rule__RgbaColor__Group__1"
    // InternalMyUiDsl.g:3165:1: rule__RgbaColor__Group__1 : rule__RgbaColor__Group__1__Impl rule__RgbaColor__Group__2 ;
    public final void rule__RgbaColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3169:1: ( rule__RgbaColor__Group__1__Impl rule__RgbaColor__Group__2 )
            // InternalMyUiDsl.g:3170:2: rule__RgbaColor__Group__1__Impl rule__RgbaColor__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__RgbaColor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RgbaColor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RgbaColor__Group__1"


    // $ANTLR start "rule__RgbaColor__Group__1__Impl"
    // InternalMyUiDsl.g:3177:1: rule__RgbaColor__Group__1__Impl : ( ( rule__RgbaColor__UnorderedGroup_1 ) ) ;
    public final void rule__RgbaColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3181:1: ( ( ( rule__RgbaColor__UnorderedGroup_1 ) ) )
            // InternalMyUiDsl.g:3182:1: ( ( rule__RgbaColor__UnorderedGroup_1 ) )
            {
            // InternalMyUiDsl.g:3182:1: ( ( rule__RgbaColor__UnorderedGroup_1 ) )
            // InternalMyUiDsl.g:3183:2: ( rule__RgbaColor__UnorderedGroup_1 )
            {
             before(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1()); 
            // InternalMyUiDsl.g:3184:2: ( rule__RgbaColor__UnorderedGroup_1 )
            // InternalMyUiDsl.g:3184:3: rule__RgbaColor__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__RgbaColor__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RgbaColor__Group__1__Impl"


    // $ANTLR start "rule__RgbaColor__Group__2"
    // InternalMyUiDsl.g:3192:1: rule__RgbaColor__Group__2 : rule__RgbaColor__Group__2__Impl ;
    public final void rule__RgbaColor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3196:1: ( rule__RgbaColor__Group__2__Impl )
            // InternalMyUiDsl.g:3197:2: rule__RgbaColor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RgbaColor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RgbaColor__Group__2"


    // $ANTLR start "rule__RgbaColor__Group__2__Impl"
    // InternalMyUiDsl.g:3203:1: rule__RgbaColor__Group__2__Impl : ( ')' ) ;
    public final void rule__RgbaColor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3207:1: ( ( ')' ) )
            // InternalMyUiDsl.g:3208:1: ( ')' )
            {
            // InternalMyUiDsl.g:3208:1: ( ')' )
            // InternalMyUiDsl.g:3209:2: ')'
            {
             before(grammarAccess.getRgbaColorAccess().getRightParenthesisKeyword_2()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getRgbaColorAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RgbaColor__Group__2__Impl"


    // $ANTLR start "rule__Rval__Group__0"
    // InternalMyUiDsl.g:3219:1: rule__Rval__Group__0 : rule__Rval__Group__0__Impl rule__Rval__Group__1 ;
    public final void rule__Rval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3223:1: ( rule__Rval__Group__0__Impl rule__Rval__Group__1 )
            // InternalMyUiDsl.g:3224:2: rule__Rval__Group__0__Impl rule__Rval__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Rval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rval__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rval__Group__0"


    // $ANTLR start "rule__Rval__Group__0__Impl"
    // InternalMyUiDsl.g:3231:1: rule__Rval__Group__0__Impl : ( ( rule__Rval__ValueAssignment_0 ) ) ;
    public final void rule__Rval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3235:1: ( ( ( rule__Rval__ValueAssignment_0 ) ) )
            // InternalMyUiDsl.g:3236:1: ( ( rule__Rval__ValueAssignment_0 ) )
            {
            // InternalMyUiDsl.g:3236:1: ( ( rule__Rval__ValueAssignment_0 ) )
            // InternalMyUiDsl.g:3237:2: ( rule__Rval__ValueAssignment_0 )
            {
             before(grammarAccess.getRvalAccess().getValueAssignment_0()); 
            // InternalMyUiDsl.g:3238:2: ( rule__Rval__ValueAssignment_0 )
            // InternalMyUiDsl.g:3238:3: rule__Rval__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rval__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRvalAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rval__Group__0__Impl"


    // $ANTLR start "rule__Rval__Group__1"
    // InternalMyUiDsl.g:3246:1: rule__Rval__Group__1 : rule__Rval__Group__1__Impl ;
    public final void rule__Rval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3250:1: ( rule__Rval__Group__1__Impl )
            // InternalMyUiDsl.g:3251:2: rule__Rval__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rval__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rval__Group__1"


    // $ANTLR start "rule__Rval__Group__1__Impl"
    // InternalMyUiDsl.g:3257:1: rule__Rval__Group__1__Impl : ( 'red' ) ;
    public final void rule__Rval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3261:1: ( ( 'red' ) )
            // InternalMyUiDsl.g:3262:1: ( 'red' )
            {
            // InternalMyUiDsl.g:3262:1: ( 'red' )
            // InternalMyUiDsl.g:3263:2: 'red'
            {
             before(grammarAccess.getRvalAccess().getRedKeyword_1()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getRvalAccess().getRedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rval__Group__1__Impl"


    // $ANTLR start "rule__Gval__Group__0"
    // InternalMyUiDsl.g:3273:1: rule__Gval__Group__0 : rule__Gval__Group__0__Impl rule__Gval__Group__1 ;
    public final void rule__Gval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3277:1: ( rule__Gval__Group__0__Impl rule__Gval__Group__1 )
            // InternalMyUiDsl.g:3278:2: rule__Gval__Group__0__Impl rule__Gval__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Gval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gval__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gval__Group__0"


    // $ANTLR start "rule__Gval__Group__0__Impl"
    // InternalMyUiDsl.g:3285:1: rule__Gval__Group__0__Impl : ( ( rule__Gval__ValueAssignment_0 ) ) ;
    public final void rule__Gval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3289:1: ( ( ( rule__Gval__ValueAssignment_0 ) ) )
            // InternalMyUiDsl.g:3290:1: ( ( rule__Gval__ValueAssignment_0 ) )
            {
            // InternalMyUiDsl.g:3290:1: ( ( rule__Gval__ValueAssignment_0 ) )
            // InternalMyUiDsl.g:3291:2: ( rule__Gval__ValueAssignment_0 )
            {
             before(grammarAccess.getGvalAccess().getValueAssignment_0()); 
            // InternalMyUiDsl.g:3292:2: ( rule__Gval__ValueAssignment_0 )
            // InternalMyUiDsl.g:3292:3: rule__Gval__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Gval__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGvalAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gval__Group__0__Impl"


    // $ANTLR start "rule__Gval__Group__1"
    // InternalMyUiDsl.g:3300:1: rule__Gval__Group__1 : rule__Gval__Group__1__Impl ;
    public final void rule__Gval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3304:1: ( rule__Gval__Group__1__Impl )
            // InternalMyUiDsl.g:3305:2: rule__Gval__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gval__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gval__Group__1"


    // $ANTLR start "rule__Gval__Group__1__Impl"
    // InternalMyUiDsl.g:3311:1: rule__Gval__Group__1__Impl : ( 'grn' ) ;
    public final void rule__Gval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3315:1: ( ( 'grn' ) )
            // InternalMyUiDsl.g:3316:1: ( 'grn' )
            {
            // InternalMyUiDsl.g:3316:1: ( 'grn' )
            // InternalMyUiDsl.g:3317:2: 'grn'
            {
             before(grammarAccess.getGvalAccess().getGrnKeyword_1()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getGvalAccess().getGrnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gval__Group__1__Impl"


    // $ANTLR start "rule__Bval__Group__0"
    // InternalMyUiDsl.g:3327:1: rule__Bval__Group__0 : rule__Bval__Group__0__Impl rule__Bval__Group__1 ;
    public final void rule__Bval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3331:1: ( rule__Bval__Group__0__Impl rule__Bval__Group__1 )
            // InternalMyUiDsl.g:3332:2: rule__Bval__Group__0__Impl rule__Bval__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Bval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bval__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bval__Group__0"


    // $ANTLR start "rule__Bval__Group__0__Impl"
    // InternalMyUiDsl.g:3339:1: rule__Bval__Group__0__Impl : ( ( rule__Bval__ValueAssignment_0 ) ) ;
    public final void rule__Bval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3343:1: ( ( ( rule__Bval__ValueAssignment_0 ) ) )
            // InternalMyUiDsl.g:3344:1: ( ( rule__Bval__ValueAssignment_0 ) )
            {
            // InternalMyUiDsl.g:3344:1: ( ( rule__Bval__ValueAssignment_0 ) )
            // InternalMyUiDsl.g:3345:2: ( rule__Bval__ValueAssignment_0 )
            {
             before(grammarAccess.getBvalAccess().getValueAssignment_0()); 
            // InternalMyUiDsl.g:3346:2: ( rule__Bval__ValueAssignment_0 )
            // InternalMyUiDsl.g:3346:3: rule__Bval__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Bval__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBvalAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bval__Group__0__Impl"


    // $ANTLR start "rule__Bval__Group__1"
    // InternalMyUiDsl.g:3354:1: rule__Bval__Group__1 : rule__Bval__Group__1__Impl ;
    public final void rule__Bval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3358:1: ( rule__Bval__Group__1__Impl )
            // InternalMyUiDsl.g:3359:2: rule__Bval__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bval__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bval__Group__1"


    // $ANTLR start "rule__Bval__Group__1__Impl"
    // InternalMyUiDsl.g:3365:1: rule__Bval__Group__1__Impl : ( 'blu' ) ;
    public final void rule__Bval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3369:1: ( ( 'blu' ) )
            // InternalMyUiDsl.g:3370:1: ( 'blu' )
            {
            // InternalMyUiDsl.g:3370:1: ( 'blu' )
            // InternalMyUiDsl.g:3371:2: 'blu'
            {
             before(grammarAccess.getBvalAccess().getBluKeyword_1()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getBvalAccess().getBluKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bval__Group__1__Impl"


    // $ANTLR start "rule__Aval__Group__0"
    // InternalMyUiDsl.g:3381:1: rule__Aval__Group__0 : rule__Aval__Group__0__Impl rule__Aval__Group__1 ;
    public final void rule__Aval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3385:1: ( rule__Aval__Group__0__Impl rule__Aval__Group__1 )
            // InternalMyUiDsl.g:3386:2: rule__Aval__Group__0__Impl rule__Aval__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Aval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aval__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aval__Group__0"


    // $ANTLR start "rule__Aval__Group__0__Impl"
    // InternalMyUiDsl.g:3393:1: rule__Aval__Group__0__Impl : ( ( rule__Aval__ValueAssignment_0 ) ) ;
    public final void rule__Aval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3397:1: ( ( ( rule__Aval__ValueAssignment_0 ) ) )
            // InternalMyUiDsl.g:3398:1: ( ( rule__Aval__ValueAssignment_0 ) )
            {
            // InternalMyUiDsl.g:3398:1: ( ( rule__Aval__ValueAssignment_0 ) )
            // InternalMyUiDsl.g:3399:2: ( rule__Aval__ValueAssignment_0 )
            {
             before(grammarAccess.getAvalAccess().getValueAssignment_0()); 
            // InternalMyUiDsl.g:3400:2: ( rule__Aval__ValueAssignment_0 )
            // InternalMyUiDsl.g:3400:3: rule__Aval__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Aval__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAvalAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aval__Group__0__Impl"


    // $ANTLR start "rule__Aval__Group__1"
    // InternalMyUiDsl.g:3408:1: rule__Aval__Group__1 : rule__Aval__Group__1__Impl ;
    public final void rule__Aval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3412:1: ( rule__Aval__Group__1__Impl )
            // InternalMyUiDsl.g:3413:2: rule__Aval__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aval__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aval__Group__1"


    // $ANTLR start "rule__Aval__Group__1__Impl"
    // InternalMyUiDsl.g:3419:1: rule__Aval__Group__1__Impl : ( 'alfa' ) ;
    public final void rule__Aval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3423:1: ( ( 'alfa' ) )
            // InternalMyUiDsl.g:3424:1: ( 'alfa' )
            {
            // InternalMyUiDsl.g:3424:1: ( 'alfa' )
            // InternalMyUiDsl.g:3425:2: 'alfa'
            {
             before(grammarAccess.getAvalAccess().getAlfaKeyword_1()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getAvalAccess().getAlfaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aval__Group__1__Impl"


    // $ANTLR start "rule__BorderRad__Group__0"
    // InternalMyUiDsl.g:3435:1: rule__BorderRad__Group__0 : rule__BorderRad__Group__0__Impl rule__BorderRad__Group__1 ;
    public final void rule__BorderRad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3439:1: ( rule__BorderRad__Group__0__Impl rule__BorderRad__Group__1 )
            // InternalMyUiDsl.g:3440:2: rule__BorderRad__Group__0__Impl rule__BorderRad__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__BorderRad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BorderRad__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderRad__Group__0"


    // $ANTLR start "rule__BorderRad__Group__0__Impl"
    // InternalMyUiDsl.g:3447:1: rule__BorderRad__Group__0__Impl : ( 'Arc:' ) ;
    public final void rule__BorderRad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3451:1: ( ( 'Arc:' ) )
            // InternalMyUiDsl.g:3452:1: ( 'Arc:' )
            {
            // InternalMyUiDsl.g:3452:1: ( 'Arc:' )
            // InternalMyUiDsl.g:3453:2: 'Arc:'
            {
             before(grammarAccess.getBorderRadAccess().getArcKeyword_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getBorderRadAccess().getArcKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderRad__Group__0__Impl"


    // $ANTLR start "rule__BorderRad__Group__1"
    // InternalMyUiDsl.g:3462:1: rule__BorderRad__Group__1 : rule__BorderRad__Group__1__Impl rule__BorderRad__Group__2 ;
    public final void rule__BorderRad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3466:1: ( rule__BorderRad__Group__1__Impl rule__BorderRad__Group__2 )
            // InternalMyUiDsl.g:3467:2: rule__BorderRad__Group__1__Impl rule__BorderRad__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__BorderRad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BorderRad__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderRad__Group__1"


    // $ANTLR start "rule__BorderRad__Group__1__Impl"
    // InternalMyUiDsl.g:3474:1: rule__BorderRad__Group__1__Impl : ( ( rule__BorderRad__ValueAssignment_1 ) ) ;
    public final void rule__BorderRad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3478:1: ( ( ( rule__BorderRad__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:3479:1: ( ( rule__BorderRad__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:3479:1: ( ( rule__BorderRad__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:3480:2: ( rule__BorderRad__ValueAssignment_1 )
            {
             before(grammarAccess.getBorderRadAccess().getValueAssignment_1()); 
            // InternalMyUiDsl.g:3481:2: ( rule__BorderRad__ValueAssignment_1 )
            // InternalMyUiDsl.g:3481:3: rule__BorderRad__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BorderRad__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBorderRadAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderRad__Group__1__Impl"


    // $ANTLR start "rule__BorderRad__Group__2"
    // InternalMyUiDsl.g:3489:1: rule__BorderRad__Group__2 : rule__BorderRad__Group__2__Impl ;
    public final void rule__BorderRad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3493:1: ( rule__BorderRad__Group__2__Impl )
            // InternalMyUiDsl.g:3494:2: rule__BorderRad__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BorderRad__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderRad__Group__2"


    // $ANTLR start "rule__BorderRad__Group__2__Impl"
    // InternalMyUiDsl.g:3500:1: rule__BorderRad__Group__2__Impl : ( ( rule__BorderRad__MeasureTypeAssignment_2 )? ) ;
    public final void rule__BorderRad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3504:1: ( ( ( rule__BorderRad__MeasureTypeAssignment_2 )? ) )
            // InternalMyUiDsl.g:3505:1: ( ( rule__BorderRad__MeasureTypeAssignment_2 )? )
            {
            // InternalMyUiDsl.g:3505:1: ( ( rule__BorderRad__MeasureTypeAssignment_2 )? )
            // InternalMyUiDsl.g:3506:2: ( rule__BorderRad__MeasureTypeAssignment_2 )?
            {
             before(grammarAccess.getBorderRadAccess().getMeasureTypeAssignment_2()); 
            // InternalMyUiDsl.g:3507:2: ( rule__BorderRad__MeasureTypeAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=25 && LA22_0<=27)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyUiDsl.g:3507:3: rule__BorderRad__MeasureTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__BorderRad__MeasureTypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBorderRadAccess().getMeasureTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderRad__Group__2__Impl"


    // $ANTLR start "rule__Pos__Group__0"
    // InternalMyUiDsl.g:3516:1: rule__Pos__Group__0 : rule__Pos__Group__0__Impl rule__Pos__Group__1 ;
    public final void rule__Pos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3520:1: ( rule__Pos__Group__0__Impl rule__Pos__Group__1 )
            // InternalMyUiDsl.g:3521:2: rule__Pos__Group__0__Impl rule__Pos__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Pos__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pos__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pos__Group__0"


    // $ANTLR start "rule__Pos__Group__0__Impl"
    // InternalMyUiDsl.g:3528:1: rule__Pos__Group__0__Impl : ( 'Pos:' ) ;
    public final void rule__Pos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3532:1: ( ( 'Pos:' ) )
            // InternalMyUiDsl.g:3533:1: ( 'Pos:' )
            {
            // InternalMyUiDsl.g:3533:1: ( 'Pos:' )
            // InternalMyUiDsl.g:3534:2: 'Pos:'
            {
             before(grammarAccess.getPosAccess().getPosKeyword_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getPosAccess().getPosKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pos__Group__0__Impl"


    // $ANTLR start "rule__Pos__Group__1"
    // InternalMyUiDsl.g:3543:1: rule__Pos__Group__1 : rule__Pos__Group__1__Impl ;
    public final void rule__Pos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3547:1: ( rule__Pos__Group__1__Impl )
            // InternalMyUiDsl.g:3548:2: rule__Pos__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pos__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pos__Group__1"


    // $ANTLR start "rule__Pos__Group__1__Impl"
    // InternalMyUiDsl.g:3554:1: rule__Pos__Group__1__Impl : ( ( rule__Pos__ValueAssignment_1 ) ) ;
    public final void rule__Pos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3558:1: ( ( ( rule__Pos__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:3559:1: ( ( rule__Pos__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:3559:1: ( ( rule__Pos__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:3560:2: ( rule__Pos__ValueAssignment_1 )
            {
             before(grammarAccess.getPosAccess().getValueAssignment_1()); 
            // InternalMyUiDsl.g:3561:2: ( rule__Pos__ValueAssignment_1 )
            // InternalMyUiDsl.g:3561:3: rule__Pos__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pos__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPosAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pos__Group__1__Impl"


    // $ANTLR start "rule__Flt__Group__0"
    // InternalMyUiDsl.g:3570:1: rule__Flt__Group__0 : rule__Flt__Group__0__Impl rule__Flt__Group__1 ;
    public final void rule__Flt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3574:1: ( rule__Flt__Group__0__Impl rule__Flt__Group__1 )
            // InternalMyUiDsl.g:3575:2: rule__Flt__Group__0__Impl rule__Flt__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Flt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Flt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flt__Group__0"


    // $ANTLR start "rule__Flt__Group__0__Impl"
    // InternalMyUiDsl.g:3582:1: rule__Flt__Group__0__Impl : ( 'Flt:' ) ;
    public final void rule__Flt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3586:1: ( ( 'Flt:' ) )
            // InternalMyUiDsl.g:3587:1: ( 'Flt:' )
            {
            // InternalMyUiDsl.g:3587:1: ( 'Flt:' )
            // InternalMyUiDsl.g:3588:2: 'Flt:'
            {
             before(grammarAccess.getFltAccess().getFltKeyword_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getFltAccess().getFltKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flt__Group__0__Impl"


    // $ANTLR start "rule__Flt__Group__1"
    // InternalMyUiDsl.g:3597:1: rule__Flt__Group__1 : rule__Flt__Group__1__Impl ;
    public final void rule__Flt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3601:1: ( rule__Flt__Group__1__Impl )
            // InternalMyUiDsl.g:3602:2: rule__Flt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Flt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flt__Group__1"


    // $ANTLR start "rule__Flt__Group__1__Impl"
    // InternalMyUiDsl.g:3608:1: rule__Flt__Group__1__Impl : ( ( rule__Flt__ValueAssignment_1 ) ) ;
    public final void rule__Flt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3612:1: ( ( ( rule__Flt__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:3613:1: ( ( rule__Flt__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:3613:1: ( ( rule__Flt__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:3614:2: ( rule__Flt__ValueAssignment_1 )
            {
             before(grammarAccess.getFltAccess().getValueAssignment_1()); 
            // InternalMyUiDsl.g:3615:2: ( rule__Flt__ValueAssignment_1 )
            // InternalMyUiDsl.g:3615:3: rule__Flt__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Flt__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFltAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flt__Group__1__Impl"


    // $ANTLR start "rule__Clr__Group__0"
    // InternalMyUiDsl.g:3624:1: rule__Clr__Group__0 : rule__Clr__Group__0__Impl rule__Clr__Group__1 ;
    public final void rule__Clr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3628:1: ( rule__Clr__Group__0__Impl rule__Clr__Group__1 )
            // InternalMyUiDsl.g:3629:2: rule__Clr__Group__0__Impl rule__Clr__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Clr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clr__Group__0"


    // $ANTLR start "rule__Clr__Group__0__Impl"
    // InternalMyUiDsl.g:3636:1: rule__Clr__Group__0__Impl : ( 'Clr:' ) ;
    public final void rule__Clr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3640:1: ( ( 'Clr:' ) )
            // InternalMyUiDsl.g:3641:1: ( 'Clr:' )
            {
            // InternalMyUiDsl.g:3641:1: ( 'Clr:' )
            // InternalMyUiDsl.g:3642:2: 'Clr:'
            {
             before(grammarAccess.getClrAccess().getClrKeyword_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getClrAccess().getClrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clr__Group__0__Impl"


    // $ANTLR start "rule__Clr__Group__1"
    // InternalMyUiDsl.g:3651:1: rule__Clr__Group__1 : rule__Clr__Group__1__Impl ;
    public final void rule__Clr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3655:1: ( rule__Clr__Group__1__Impl )
            // InternalMyUiDsl.g:3656:2: rule__Clr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clr__Group__1"


    // $ANTLR start "rule__Clr__Group__1__Impl"
    // InternalMyUiDsl.g:3662:1: rule__Clr__Group__1__Impl : ( ( rule__Clr__ValueAssignment_1 ) ) ;
    public final void rule__Clr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3666:1: ( ( ( rule__Clr__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:3667:1: ( ( rule__Clr__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:3667:1: ( ( rule__Clr__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:3668:2: ( rule__Clr__ValueAssignment_1 )
            {
             before(grammarAccess.getClrAccess().getValueAssignment_1()); 
            // InternalMyUiDsl.g:3669:2: ( rule__Clr__ValueAssignment_1 )
            // InternalMyUiDsl.g:3669:3: rule__Clr__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Clr__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClrAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clr__Group__1__Impl"


    // $ANTLR start "rule__Disp__Group__0"
    // InternalMyUiDsl.g:3678:1: rule__Disp__Group__0 : rule__Disp__Group__0__Impl rule__Disp__Group__1 ;
    public final void rule__Disp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3682:1: ( rule__Disp__Group__0__Impl rule__Disp__Group__1 )
            // InternalMyUiDsl.g:3683:2: rule__Disp__Group__0__Impl rule__Disp__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Disp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Disp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disp__Group__0"


    // $ANTLR start "rule__Disp__Group__0__Impl"
    // InternalMyUiDsl.g:3690:1: rule__Disp__Group__0__Impl : ( 'Disp:' ) ;
    public final void rule__Disp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3694:1: ( ( 'Disp:' ) )
            // InternalMyUiDsl.g:3695:1: ( 'Disp:' )
            {
            // InternalMyUiDsl.g:3695:1: ( 'Disp:' )
            // InternalMyUiDsl.g:3696:2: 'Disp:'
            {
             before(grammarAccess.getDispAccess().getDispKeyword_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getDispAccess().getDispKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disp__Group__0__Impl"


    // $ANTLR start "rule__Disp__Group__1"
    // InternalMyUiDsl.g:3705:1: rule__Disp__Group__1 : rule__Disp__Group__1__Impl ;
    public final void rule__Disp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3709:1: ( rule__Disp__Group__1__Impl )
            // InternalMyUiDsl.g:3710:2: rule__Disp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Disp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disp__Group__1"


    // $ANTLR start "rule__Disp__Group__1__Impl"
    // InternalMyUiDsl.g:3716:1: rule__Disp__Group__1__Impl : ( ( rule__Disp__ValueAssignment_1 ) ) ;
    public final void rule__Disp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3720:1: ( ( ( rule__Disp__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:3721:1: ( ( rule__Disp__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:3721:1: ( ( rule__Disp__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:3722:2: ( rule__Disp__ValueAssignment_1 )
            {
             before(grammarAccess.getDispAccess().getValueAssignment_1()); 
            // InternalMyUiDsl.g:3723:2: ( rule__Disp__ValueAssignment_1 )
            // InternalMyUiDsl.g:3723:3: rule__Disp__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Disp__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDispAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disp__Group__1__Impl"


    // $ANTLR start "rule__VerAl__Group__0"
    // InternalMyUiDsl.g:3732:1: rule__VerAl__Group__0 : rule__VerAl__Group__0__Impl rule__VerAl__Group__1 ;
    public final void rule__VerAl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3736:1: ( rule__VerAl__Group__0__Impl rule__VerAl__Group__1 )
            // InternalMyUiDsl.g:3737:2: rule__VerAl__Group__0__Impl rule__VerAl__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__VerAl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerAl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerAl__Group__0"


    // $ANTLR start "rule__VerAl__Group__0__Impl"
    // InternalMyUiDsl.g:3744:1: rule__VerAl__Group__0__Impl : ( 'Ver_Al:' ) ;
    public final void rule__VerAl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3748:1: ( ( 'Ver_Al:' ) )
            // InternalMyUiDsl.g:3749:1: ( 'Ver_Al:' )
            {
            // InternalMyUiDsl.g:3749:1: ( 'Ver_Al:' )
            // InternalMyUiDsl.g:3750:2: 'Ver_Al:'
            {
             before(grammarAccess.getVerAlAccess().getVer_AlKeyword_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getVerAlAccess().getVer_AlKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerAl__Group__0__Impl"


    // $ANTLR start "rule__VerAl__Group__1"
    // InternalMyUiDsl.g:3759:1: rule__VerAl__Group__1 : rule__VerAl__Group__1__Impl ;
    public final void rule__VerAl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3763:1: ( rule__VerAl__Group__1__Impl )
            // InternalMyUiDsl.g:3764:2: rule__VerAl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VerAl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerAl__Group__1"


    // $ANTLR start "rule__VerAl__Group__1__Impl"
    // InternalMyUiDsl.g:3770:1: rule__VerAl__Group__1__Impl : ( ( rule__VerAl__ValueAssignment_1 ) ) ;
    public final void rule__VerAl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3774:1: ( ( ( rule__VerAl__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:3775:1: ( ( rule__VerAl__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:3775:1: ( ( rule__VerAl__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:3776:2: ( rule__VerAl__ValueAssignment_1 )
            {
             before(grammarAccess.getVerAlAccess().getValueAssignment_1()); 
            // InternalMyUiDsl.g:3777:2: ( rule__VerAl__ValueAssignment_1 )
            // InternalMyUiDsl.g:3777:3: rule__VerAl__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VerAl__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVerAlAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerAl__Group__1__Impl"


    // $ANTLR start "rule__OFlow__Group__0"
    // InternalMyUiDsl.g:3786:1: rule__OFlow__Group__0 : rule__OFlow__Group__0__Impl rule__OFlow__Group__1 ;
    public final void rule__OFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3790:1: ( rule__OFlow__Group__0__Impl rule__OFlow__Group__1 )
            // InternalMyUiDsl.g:3791:2: rule__OFlow__Group__0__Impl rule__OFlow__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__OFlow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OFlow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OFlow__Group__0"


    // $ANTLR start "rule__OFlow__Group__0__Impl"
    // InternalMyUiDsl.g:3798:1: rule__OFlow__Group__0__Impl : ( 'OFlow:' ) ;
    public final void rule__OFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3802:1: ( ( 'OFlow:' ) )
            // InternalMyUiDsl.g:3803:1: ( 'OFlow:' )
            {
            // InternalMyUiDsl.g:3803:1: ( 'OFlow:' )
            // InternalMyUiDsl.g:3804:2: 'OFlow:'
            {
             before(grammarAccess.getOFlowAccess().getOFlowKeyword_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getOFlowAccess().getOFlowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OFlow__Group__0__Impl"


    // $ANTLR start "rule__OFlow__Group__1"
    // InternalMyUiDsl.g:3813:1: rule__OFlow__Group__1 : rule__OFlow__Group__1__Impl ;
    public final void rule__OFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3817:1: ( rule__OFlow__Group__1__Impl )
            // InternalMyUiDsl.g:3818:2: rule__OFlow__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OFlow__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OFlow__Group__1"


    // $ANTLR start "rule__OFlow__Group__1__Impl"
    // InternalMyUiDsl.g:3824:1: rule__OFlow__Group__1__Impl : ( ( rule__OFlow__ValueAssignment_1 ) ) ;
    public final void rule__OFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3828:1: ( ( ( rule__OFlow__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:3829:1: ( ( rule__OFlow__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:3829:1: ( ( rule__OFlow__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:3830:2: ( rule__OFlow__ValueAssignment_1 )
            {
             before(grammarAccess.getOFlowAccess().getValueAssignment_1()); 
            // InternalMyUiDsl.g:3831:2: ( rule__OFlow__ValueAssignment_1 )
            // InternalMyUiDsl.g:3831:3: rule__OFlow__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OFlow__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOFlowAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OFlow__Group__1__Impl"


    // $ANTLR start "rule__Wid__Group__0"
    // InternalMyUiDsl.g:3840:1: rule__Wid__Group__0 : rule__Wid__Group__0__Impl rule__Wid__Group__1 ;
    public final void rule__Wid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3844:1: ( rule__Wid__Group__0__Impl rule__Wid__Group__1 )
            // InternalMyUiDsl.g:3845:2: rule__Wid__Group__0__Impl rule__Wid__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Wid__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wid__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wid__Group__0"


    // $ANTLR start "rule__Wid__Group__0__Impl"
    // InternalMyUiDsl.g:3852:1: rule__Wid__Group__0__Impl : ( 'Wid:' ) ;
    public final void rule__Wid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3856:1: ( ( 'Wid:' ) )
            // InternalMyUiDsl.g:3857:1: ( 'Wid:' )
            {
            // InternalMyUiDsl.g:3857:1: ( 'Wid:' )
            // InternalMyUiDsl.g:3858:2: 'Wid:'
            {
             before(grammarAccess.getWidAccess().getWidKeyword_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getWidAccess().getWidKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wid__Group__0__Impl"


    // $ANTLR start "rule__Wid__Group__1"
    // InternalMyUiDsl.g:3867:1: rule__Wid__Group__1 : rule__Wid__Group__1__Impl ;
    public final void rule__Wid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3871:1: ( rule__Wid__Group__1__Impl )
            // InternalMyUiDsl.g:3872:2: rule__Wid__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wid__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wid__Group__1"


    // $ANTLR start "rule__Wid__Group__1__Impl"
    // InternalMyUiDsl.g:3878:1: rule__Wid__Group__1__Impl : ( ( rule__Wid__ValueAssignment_1 ) ) ;
    public final void rule__Wid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3882:1: ( ( ( rule__Wid__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:3883:1: ( ( rule__Wid__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:3883:1: ( ( rule__Wid__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:3884:2: ( rule__Wid__ValueAssignment_1 )
            {
             before(grammarAccess.getWidAccess().getValueAssignment_1()); 
            // InternalMyUiDsl.g:3885:2: ( rule__Wid__ValueAssignment_1 )
            // InternalMyUiDsl.g:3885:3: rule__Wid__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Wid__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWidAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wid__Group__1__Impl"


    // $ANTLR start "rule__H8__Group__0"
    // InternalMyUiDsl.g:3894:1: rule__H8__Group__0 : rule__H8__Group__0__Impl rule__H8__Group__1 ;
    public final void rule__H8__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3898:1: ( rule__H8__Group__0__Impl rule__H8__Group__1 )
            // InternalMyUiDsl.g:3899:2: rule__H8__Group__0__Impl rule__H8__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__H8__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__H8__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__H8__Group__0"


    // $ANTLR start "rule__H8__Group__0__Impl"
    // InternalMyUiDsl.g:3906:1: rule__H8__Group__0__Impl : ( 'H8:' ) ;
    public final void rule__H8__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3910:1: ( ( 'H8:' ) )
            // InternalMyUiDsl.g:3911:1: ( 'H8:' )
            {
            // InternalMyUiDsl.g:3911:1: ( 'H8:' )
            // InternalMyUiDsl.g:3912:2: 'H8:'
            {
             before(grammarAccess.getH8Access().getH8Keyword_0()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getH8Access().getH8Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__H8__Group__0__Impl"


    // $ANTLR start "rule__H8__Group__1"
    // InternalMyUiDsl.g:3921:1: rule__H8__Group__1 : rule__H8__Group__1__Impl ;
    public final void rule__H8__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3925:1: ( rule__H8__Group__1__Impl )
            // InternalMyUiDsl.g:3926:2: rule__H8__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__H8__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__H8__Group__1"


    // $ANTLR start "rule__H8__Group__1__Impl"
    // InternalMyUiDsl.g:3932:1: rule__H8__Group__1__Impl : ( ( rule__H8__ValueAssignment_1 ) ) ;
    public final void rule__H8__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3936:1: ( ( ( rule__H8__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:3937:1: ( ( rule__H8__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:3937:1: ( ( rule__H8__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:3938:2: ( rule__H8__ValueAssignment_1 )
            {
             before(grammarAccess.getH8Access().getValueAssignment_1()); 
            // InternalMyUiDsl.g:3939:2: ( rule__H8__ValueAssignment_1 )
            // InternalMyUiDsl.g:3939:3: rule__H8__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__H8__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getH8Access().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__H8__Group__1__Impl"


    // $ANTLR start "rule__Coord__Group__0"
    // InternalMyUiDsl.g:3948:1: rule__Coord__Group__0 : rule__Coord__Group__0__Impl rule__Coord__Group__1 ;
    public final void rule__Coord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3952:1: ( rule__Coord__Group__0__Impl rule__Coord__Group__1 )
            // InternalMyUiDsl.g:3953:2: rule__Coord__Group__0__Impl rule__Coord__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Coord__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coord__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coord__Group__0"


    // $ANTLR start "rule__Coord__Group__0__Impl"
    // InternalMyUiDsl.g:3960:1: rule__Coord__Group__0__Impl : ( 'Coord:' ) ;
    public final void rule__Coord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3964:1: ( ( 'Coord:' ) )
            // InternalMyUiDsl.g:3965:1: ( 'Coord:' )
            {
            // InternalMyUiDsl.g:3965:1: ( 'Coord:' )
            // InternalMyUiDsl.g:3966:2: 'Coord:'
            {
             before(grammarAccess.getCoordAccess().getCoordKeyword_0()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getCoordAccess().getCoordKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coord__Group__0__Impl"


    // $ANTLR start "rule__Coord__Group__1"
    // InternalMyUiDsl.g:3975:1: rule__Coord__Group__1 : rule__Coord__Group__1__Impl ;
    public final void rule__Coord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3979:1: ( rule__Coord__Group__1__Impl )
            // InternalMyUiDsl.g:3980:2: rule__Coord__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Coord__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coord__Group__1"


    // $ANTLR start "rule__Coord__Group__1__Impl"
    // InternalMyUiDsl.g:3986:1: rule__Coord__Group__1__Impl : ( ( rule__Coord__ValueAssignment_1 ) ) ;
    public final void rule__Coord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:3990:1: ( ( ( rule__Coord__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:3991:1: ( ( rule__Coord__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:3991:1: ( ( rule__Coord__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:3992:2: ( rule__Coord__ValueAssignment_1 )
            {
             before(grammarAccess.getCoordAccess().getValueAssignment_1()); 
            // InternalMyUiDsl.g:3993:2: ( rule__Coord__ValueAssignment_1 )
            // InternalMyUiDsl.g:3993:3: rule__Coord__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Coord__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coord__Group__1__Impl"


    // $ANTLR start "rule__Marg__Group__0"
    // InternalMyUiDsl.g:4002:1: rule__Marg__Group__0 : rule__Marg__Group__0__Impl rule__Marg__Group__1 ;
    public final void rule__Marg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4006:1: ( rule__Marg__Group__0__Impl rule__Marg__Group__1 )
            // InternalMyUiDsl.g:4007:2: rule__Marg__Group__0__Impl rule__Marg__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Marg__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Marg__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marg__Group__0"


    // $ANTLR start "rule__Marg__Group__0__Impl"
    // InternalMyUiDsl.g:4014:1: rule__Marg__Group__0__Impl : ( 'Marg:' ) ;
    public final void rule__Marg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4018:1: ( ( 'Marg:' ) )
            // InternalMyUiDsl.g:4019:1: ( 'Marg:' )
            {
            // InternalMyUiDsl.g:4019:1: ( 'Marg:' )
            // InternalMyUiDsl.g:4020:2: 'Marg:'
            {
             before(grammarAccess.getMargAccess().getMargKeyword_0()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getMargAccess().getMargKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marg__Group__0__Impl"


    // $ANTLR start "rule__Marg__Group__1"
    // InternalMyUiDsl.g:4029:1: rule__Marg__Group__1 : rule__Marg__Group__1__Impl ;
    public final void rule__Marg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4033:1: ( rule__Marg__Group__1__Impl )
            // InternalMyUiDsl.g:4034:2: rule__Marg__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Marg__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marg__Group__1"


    // $ANTLR start "rule__Marg__Group__1__Impl"
    // InternalMyUiDsl.g:4040:1: rule__Marg__Group__1__Impl : ( ( rule__Marg__ValueAssignment_1 ) ) ;
    public final void rule__Marg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4044:1: ( ( ( rule__Marg__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:4045:1: ( ( rule__Marg__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:4045:1: ( ( rule__Marg__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:4046:2: ( rule__Marg__ValueAssignment_1 )
            {
             before(grammarAccess.getMargAccess().getValueAssignment_1()); 
            // InternalMyUiDsl.g:4047:2: ( rule__Marg__ValueAssignment_1 )
            // InternalMyUiDsl.g:4047:3: rule__Marg__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Marg__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMargAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marg__Group__1__Impl"


    // $ANTLR start "rule__Padd__Group__0"
    // InternalMyUiDsl.g:4056:1: rule__Padd__Group__0 : rule__Padd__Group__0__Impl rule__Padd__Group__1 ;
    public final void rule__Padd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4060:1: ( rule__Padd__Group__0__Impl rule__Padd__Group__1 )
            // InternalMyUiDsl.g:4061:2: rule__Padd__Group__0__Impl rule__Padd__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Padd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Padd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Padd__Group__0"


    // $ANTLR start "rule__Padd__Group__0__Impl"
    // InternalMyUiDsl.g:4068:1: rule__Padd__Group__0__Impl : ( 'Padd:' ) ;
    public final void rule__Padd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4072:1: ( ( 'Padd:' ) )
            // InternalMyUiDsl.g:4073:1: ( 'Padd:' )
            {
            // InternalMyUiDsl.g:4073:1: ( 'Padd:' )
            // InternalMyUiDsl.g:4074:2: 'Padd:'
            {
             before(grammarAccess.getPaddAccess().getPaddKeyword_0()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getPaddAccess().getPaddKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Padd__Group__0__Impl"


    // $ANTLR start "rule__Padd__Group__1"
    // InternalMyUiDsl.g:4083:1: rule__Padd__Group__1 : rule__Padd__Group__1__Impl ;
    public final void rule__Padd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4087:1: ( rule__Padd__Group__1__Impl )
            // InternalMyUiDsl.g:4088:2: rule__Padd__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Padd__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Padd__Group__1"


    // $ANTLR start "rule__Padd__Group__1__Impl"
    // InternalMyUiDsl.g:4094:1: rule__Padd__Group__1__Impl : ( ( rule__Padd__ValueAssignment_1 ) ) ;
    public final void rule__Padd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4098:1: ( ( ( rule__Padd__ValueAssignment_1 ) ) )
            // InternalMyUiDsl.g:4099:1: ( ( rule__Padd__ValueAssignment_1 ) )
            {
            // InternalMyUiDsl.g:4099:1: ( ( rule__Padd__ValueAssignment_1 ) )
            // InternalMyUiDsl.g:4100:2: ( rule__Padd__ValueAssignment_1 )
            {
             before(grammarAccess.getPaddAccess().getValueAssignment_1()); 
            // InternalMyUiDsl.g:4101:2: ( rule__Padd__ValueAssignment_1 )
            // InternalMyUiDsl.g:4101:3: rule__Padd__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Padd__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPaddAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Padd__Group__1__Impl"


    // $ANTLR start "rule__MinMaxValue__Group__0"
    // InternalMyUiDsl.g:4110:1: rule__MinMaxValue__Group__0 : rule__MinMaxValue__Group__0__Impl rule__MinMaxValue__Group__1 ;
    public final void rule__MinMaxValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4114:1: ( rule__MinMaxValue__Group__0__Impl rule__MinMaxValue__Group__1 )
            // InternalMyUiDsl.g:4115:2: rule__MinMaxValue__Group__0__Impl rule__MinMaxValue__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__MinMaxValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMaxValue__Group__0"


    // $ANTLR start "rule__MinMaxValue__Group__0__Impl"
    // InternalMyUiDsl.g:4122:1: rule__MinMaxValue__Group__0__Impl : ( () ) ;
    public final void rule__MinMaxValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4126:1: ( ( () ) )
            // InternalMyUiDsl.g:4127:1: ( () )
            {
            // InternalMyUiDsl.g:4127:1: ( () )
            // InternalMyUiDsl.g:4128:2: ()
            {
             before(grammarAccess.getMinMaxValueAccess().getMinMaxValueAction_0()); 
            // InternalMyUiDsl.g:4129:2: ()
            // InternalMyUiDsl.g:4129:3: 
            {
            }

             after(grammarAccess.getMinMaxValueAccess().getMinMaxValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMaxValue__Group__0__Impl"


    // $ANTLR start "rule__MinMaxValue__Group__1"
    // InternalMyUiDsl.g:4137:1: rule__MinMaxValue__Group__1 : rule__MinMaxValue__Group__1__Impl ;
    public final void rule__MinMaxValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4141:1: ( rule__MinMaxValue__Group__1__Impl )
            // InternalMyUiDsl.g:4142:2: rule__MinMaxValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMaxValue__Group__1"


    // $ANTLR start "rule__MinMaxValue__Group__1__Impl"
    // InternalMyUiDsl.g:4148:1: rule__MinMaxValue__Group__1__Impl : ( ( rule__MinMaxValue__UnorderedGroup_1 ) ) ;
    public final void rule__MinMaxValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4152:1: ( ( ( rule__MinMaxValue__UnorderedGroup_1 ) ) )
            // InternalMyUiDsl.g:4153:1: ( ( rule__MinMaxValue__UnorderedGroup_1 ) )
            {
            // InternalMyUiDsl.g:4153:1: ( ( rule__MinMaxValue__UnorderedGroup_1 ) )
            // InternalMyUiDsl.g:4154:2: ( rule__MinMaxValue__UnorderedGroup_1 )
            {
             before(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1()); 
            // InternalMyUiDsl.g:4155:2: ( rule__MinMaxValue__UnorderedGroup_1 )
            // InternalMyUiDsl.g:4155:3: rule__MinMaxValue__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxValue__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMaxValue__Group__1__Impl"


    // $ANTLR start "rule__MinVal__Group__0"
    // InternalMyUiDsl.g:4164:1: rule__MinVal__Group__0 : rule__MinVal__Group__0__Impl rule__MinVal__Group__1 ;
    public final void rule__MinVal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4168:1: ( rule__MinVal__Group__0__Impl rule__MinVal__Group__1 )
            // InternalMyUiDsl.g:4169:2: rule__MinVal__Group__0__Impl rule__MinVal__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__MinVal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinVal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinVal__Group__0"


    // $ANTLR start "rule__MinVal__Group__0__Impl"
    // InternalMyUiDsl.g:4176:1: rule__MinVal__Group__0__Impl : ( ( rule__MinVal__ValueAssignment_0 ) ) ;
    public final void rule__MinVal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4180:1: ( ( ( rule__MinVal__ValueAssignment_0 ) ) )
            // InternalMyUiDsl.g:4181:1: ( ( rule__MinVal__ValueAssignment_0 ) )
            {
            // InternalMyUiDsl.g:4181:1: ( ( rule__MinVal__ValueAssignment_0 ) )
            // InternalMyUiDsl.g:4182:2: ( rule__MinVal__ValueAssignment_0 )
            {
             before(grammarAccess.getMinValAccess().getValueAssignment_0()); 
            // InternalMyUiDsl.g:4183:2: ( rule__MinVal__ValueAssignment_0 )
            // InternalMyUiDsl.g:4183:3: rule__MinVal__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MinVal__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMinValAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinVal__Group__0__Impl"


    // $ANTLR start "rule__MinVal__Group__1"
    // InternalMyUiDsl.g:4191:1: rule__MinVal__Group__1 : rule__MinVal__Group__1__Impl rule__MinVal__Group__2 ;
    public final void rule__MinVal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4195:1: ( rule__MinVal__Group__1__Impl rule__MinVal__Group__2 )
            // InternalMyUiDsl.g:4196:2: rule__MinVal__Group__1__Impl rule__MinVal__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__MinVal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinVal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinVal__Group__1"


    // $ANTLR start "rule__MinVal__Group__1__Impl"
    // InternalMyUiDsl.g:4203:1: rule__MinVal__Group__1__Impl : ( 'lo' ) ;
    public final void rule__MinVal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4207:1: ( ( 'lo' ) )
            // InternalMyUiDsl.g:4208:1: ( 'lo' )
            {
            // InternalMyUiDsl.g:4208:1: ( 'lo' )
            // InternalMyUiDsl.g:4209:2: 'lo'
            {
             before(grammarAccess.getMinValAccess().getLoKeyword_1()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getMinValAccess().getLoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinVal__Group__1__Impl"


    // $ANTLR start "rule__MinVal__Group__2"
    // InternalMyUiDsl.g:4218:1: rule__MinVal__Group__2 : rule__MinVal__Group__2__Impl ;
    public final void rule__MinVal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4222:1: ( rule__MinVal__Group__2__Impl )
            // InternalMyUiDsl.g:4223:2: rule__MinVal__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinVal__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinVal__Group__2"


    // $ANTLR start "rule__MinVal__Group__2__Impl"
    // InternalMyUiDsl.g:4229:1: rule__MinVal__Group__2__Impl : ( ( rule__MinVal__MeasureTypeAssignment_2 )? ) ;
    public final void rule__MinVal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4233:1: ( ( ( rule__MinVal__MeasureTypeAssignment_2 )? ) )
            // InternalMyUiDsl.g:4234:1: ( ( rule__MinVal__MeasureTypeAssignment_2 )? )
            {
            // InternalMyUiDsl.g:4234:1: ( ( rule__MinVal__MeasureTypeAssignment_2 )? )
            // InternalMyUiDsl.g:4235:2: ( rule__MinVal__MeasureTypeAssignment_2 )?
            {
             before(grammarAccess.getMinValAccess().getMeasureTypeAssignment_2()); 
            // InternalMyUiDsl.g:4236:2: ( rule__MinVal__MeasureTypeAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=25 && LA23_0<=27)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyUiDsl.g:4236:3: rule__MinVal__MeasureTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MinVal__MeasureTypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMinValAccess().getMeasureTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinVal__Group__2__Impl"


    // $ANTLR start "rule__MaxVal__Group__0"
    // InternalMyUiDsl.g:4245:1: rule__MaxVal__Group__0 : rule__MaxVal__Group__0__Impl rule__MaxVal__Group__1 ;
    public final void rule__MaxVal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4249:1: ( rule__MaxVal__Group__0__Impl rule__MaxVal__Group__1 )
            // InternalMyUiDsl.g:4250:2: rule__MaxVal__Group__0__Impl rule__MaxVal__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__MaxVal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxVal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxVal__Group__0"


    // $ANTLR start "rule__MaxVal__Group__0__Impl"
    // InternalMyUiDsl.g:4257:1: rule__MaxVal__Group__0__Impl : ( ( rule__MaxVal__ValueAssignment_0 ) ) ;
    public final void rule__MaxVal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4261:1: ( ( ( rule__MaxVal__ValueAssignment_0 ) ) )
            // InternalMyUiDsl.g:4262:1: ( ( rule__MaxVal__ValueAssignment_0 ) )
            {
            // InternalMyUiDsl.g:4262:1: ( ( rule__MaxVal__ValueAssignment_0 ) )
            // InternalMyUiDsl.g:4263:2: ( rule__MaxVal__ValueAssignment_0 )
            {
             before(grammarAccess.getMaxValAccess().getValueAssignment_0()); 
            // InternalMyUiDsl.g:4264:2: ( rule__MaxVal__ValueAssignment_0 )
            // InternalMyUiDsl.g:4264:3: rule__MaxVal__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MaxVal__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMaxValAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxVal__Group__0__Impl"


    // $ANTLR start "rule__MaxVal__Group__1"
    // InternalMyUiDsl.g:4272:1: rule__MaxVal__Group__1 : rule__MaxVal__Group__1__Impl rule__MaxVal__Group__2 ;
    public final void rule__MaxVal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4276:1: ( rule__MaxVal__Group__1__Impl rule__MaxVal__Group__2 )
            // InternalMyUiDsl.g:4277:2: rule__MaxVal__Group__1__Impl rule__MaxVal__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__MaxVal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxVal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxVal__Group__1"


    // $ANTLR start "rule__MaxVal__Group__1__Impl"
    // InternalMyUiDsl.g:4284:1: rule__MaxVal__Group__1__Impl : ( 'hi' ) ;
    public final void rule__MaxVal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4288:1: ( ( 'hi' ) )
            // InternalMyUiDsl.g:4289:1: ( 'hi' )
            {
            // InternalMyUiDsl.g:4289:1: ( 'hi' )
            // InternalMyUiDsl.g:4290:2: 'hi'
            {
             before(grammarAccess.getMaxValAccess().getHiKeyword_1()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getMaxValAccess().getHiKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxVal__Group__1__Impl"


    // $ANTLR start "rule__MaxVal__Group__2"
    // InternalMyUiDsl.g:4299:1: rule__MaxVal__Group__2 : rule__MaxVal__Group__2__Impl ;
    public final void rule__MaxVal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4303:1: ( rule__MaxVal__Group__2__Impl )
            // InternalMyUiDsl.g:4304:2: rule__MaxVal__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxVal__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxVal__Group__2"


    // $ANTLR start "rule__MaxVal__Group__2__Impl"
    // InternalMyUiDsl.g:4310:1: rule__MaxVal__Group__2__Impl : ( ( rule__MaxVal__MeasureTypeAssignment_2 )? ) ;
    public final void rule__MaxVal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4314:1: ( ( ( rule__MaxVal__MeasureTypeAssignment_2 )? ) )
            // InternalMyUiDsl.g:4315:1: ( ( rule__MaxVal__MeasureTypeAssignment_2 )? )
            {
            // InternalMyUiDsl.g:4315:1: ( ( rule__MaxVal__MeasureTypeAssignment_2 )? )
            // InternalMyUiDsl.g:4316:2: ( rule__MaxVal__MeasureTypeAssignment_2 )?
            {
             before(grammarAccess.getMaxValAccess().getMeasureTypeAssignment_2()); 
            // InternalMyUiDsl.g:4317:2: ( rule__MaxVal__MeasureTypeAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=25 && LA24_0<=27)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyUiDsl.g:4317:3: rule__MaxVal__MeasureTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MaxVal__MeasureTypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMaxValAccess().getMeasureTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxVal__Group__2__Impl"


    // $ANTLR start "rule__MidVal__Group__0"
    // InternalMyUiDsl.g:4326:1: rule__MidVal__Group__0 : rule__MidVal__Group__0__Impl rule__MidVal__Group__1 ;
    public final void rule__MidVal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4330:1: ( rule__MidVal__Group__0__Impl rule__MidVal__Group__1 )
            // InternalMyUiDsl.g:4331:2: rule__MidVal__Group__0__Impl rule__MidVal__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__MidVal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MidVal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MidVal__Group__0"


    // $ANTLR start "rule__MidVal__Group__0__Impl"
    // InternalMyUiDsl.g:4338:1: rule__MidVal__Group__0__Impl : ( ( rule__MidVal__ValueAssignment_0 ) ) ;
    public final void rule__MidVal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4342:1: ( ( ( rule__MidVal__ValueAssignment_0 ) ) )
            // InternalMyUiDsl.g:4343:1: ( ( rule__MidVal__ValueAssignment_0 ) )
            {
            // InternalMyUiDsl.g:4343:1: ( ( rule__MidVal__ValueAssignment_0 ) )
            // InternalMyUiDsl.g:4344:2: ( rule__MidVal__ValueAssignment_0 )
            {
             before(grammarAccess.getMidValAccess().getValueAssignment_0()); 
            // InternalMyUiDsl.g:4345:2: ( rule__MidVal__ValueAssignment_0 )
            // InternalMyUiDsl.g:4345:3: rule__MidVal__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MidVal__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMidValAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MidVal__Group__0__Impl"


    // $ANTLR start "rule__MidVal__Group__1"
    // InternalMyUiDsl.g:4353:1: rule__MidVal__Group__1 : rule__MidVal__Group__1__Impl ;
    public final void rule__MidVal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4357:1: ( rule__MidVal__Group__1__Impl )
            // InternalMyUiDsl.g:4358:2: rule__MidVal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MidVal__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MidVal__Group__1"


    // $ANTLR start "rule__MidVal__Group__1__Impl"
    // InternalMyUiDsl.g:4364:1: rule__MidVal__Group__1__Impl : ( ( rule__MidVal__MeasureTypeAssignment_1 )? ) ;
    public final void rule__MidVal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4368:1: ( ( ( rule__MidVal__MeasureTypeAssignment_1 )? ) )
            // InternalMyUiDsl.g:4369:1: ( ( rule__MidVal__MeasureTypeAssignment_1 )? )
            {
            // InternalMyUiDsl.g:4369:1: ( ( rule__MidVal__MeasureTypeAssignment_1 )? )
            // InternalMyUiDsl.g:4370:2: ( rule__MidVal__MeasureTypeAssignment_1 )?
            {
             before(grammarAccess.getMidValAccess().getMeasureTypeAssignment_1()); 
            // InternalMyUiDsl.g:4371:2: ( rule__MidVal__MeasureTypeAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=25 && LA25_0<=27)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyUiDsl.g:4371:3: rule__MidVal__MeasureTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MidVal__MeasureTypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMidValAccess().getMeasureTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MidVal__Group__1__Impl"


    // $ANTLR start "rule__FourAspect__Group__0"
    // InternalMyUiDsl.g:4380:1: rule__FourAspect__Group__0 : rule__FourAspect__Group__0__Impl rule__FourAspect__Group__1 ;
    public final void rule__FourAspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4384:1: ( rule__FourAspect__Group__0__Impl rule__FourAspect__Group__1 )
            // InternalMyUiDsl.g:4385:2: rule__FourAspect__Group__0__Impl rule__FourAspect__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__FourAspect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FourAspect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FourAspect__Group__0"


    // $ANTLR start "rule__FourAspect__Group__0__Impl"
    // InternalMyUiDsl.g:4392:1: rule__FourAspect__Group__0__Impl : ( () ) ;
    public final void rule__FourAspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4396:1: ( ( () ) )
            // InternalMyUiDsl.g:4397:1: ( () )
            {
            // InternalMyUiDsl.g:4397:1: ( () )
            // InternalMyUiDsl.g:4398:2: ()
            {
             before(grammarAccess.getFourAspectAccess().getFourAspectAction_0()); 
            // InternalMyUiDsl.g:4399:2: ()
            // InternalMyUiDsl.g:4399:3: 
            {
            }

             after(grammarAccess.getFourAspectAccess().getFourAspectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FourAspect__Group__0__Impl"


    // $ANTLR start "rule__FourAspect__Group__1"
    // InternalMyUiDsl.g:4407:1: rule__FourAspect__Group__1 : rule__FourAspect__Group__1__Impl ;
    public final void rule__FourAspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4411:1: ( rule__FourAspect__Group__1__Impl )
            // InternalMyUiDsl.g:4412:2: rule__FourAspect__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FourAspect__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FourAspect__Group__1"


    // $ANTLR start "rule__FourAspect__Group__1__Impl"
    // InternalMyUiDsl.g:4418:1: rule__FourAspect__Group__1__Impl : ( ( rule__FourAspect__UnorderedGroup_1 ) ) ;
    public final void rule__FourAspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4422:1: ( ( ( rule__FourAspect__UnorderedGroup_1 ) ) )
            // InternalMyUiDsl.g:4423:1: ( ( rule__FourAspect__UnorderedGroup_1 ) )
            {
            // InternalMyUiDsl.g:4423:1: ( ( rule__FourAspect__UnorderedGroup_1 ) )
            // InternalMyUiDsl.g:4424:2: ( rule__FourAspect__UnorderedGroup_1 )
            {
             before(grammarAccess.getFourAspectAccess().getUnorderedGroup_1()); 
            // InternalMyUiDsl.g:4425:2: ( rule__FourAspect__UnorderedGroup_1 )
            // InternalMyUiDsl.g:4425:3: rule__FourAspect__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__FourAspect__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getFourAspectAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FourAspect__Group__1__Impl"


    // $ANTLR start "rule__LeftAspect__Group__0"
    // InternalMyUiDsl.g:4434:1: rule__LeftAspect__Group__0 : rule__LeftAspect__Group__0__Impl rule__LeftAspect__Group__1 ;
    public final void rule__LeftAspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4438:1: ( rule__LeftAspect__Group__0__Impl rule__LeftAspect__Group__1 )
            // InternalMyUiDsl.g:4439:2: rule__LeftAspect__Group__0__Impl rule__LeftAspect__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__LeftAspect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftAspect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftAspect__Group__0"


    // $ANTLR start "rule__LeftAspect__Group__0__Impl"
    // InternalMyUiDsl.g:4446:1: rule__LeftAspect__Group__0__Impl : ( ( rule__LeftAspect__ValueAssignment_0 ) ) ;
    public final void rule__LeftAspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4450:1: ( ( ( rule__LeftAspect__ValueAssignment_0 ) ) )
            // InternalMyUiDsl.g:4451:1: ( ( rule__LeftAspect__ValueAssignment_0 ) )
            {
            // InternalMyUiDsl.g:4451:1: ( ( rule__LeftAspect__ValueAssignment_0 ) )
            // InternalMyUiDsl.g:4452:2: ( rule__LeftAspect__ValueAssignment_0 )
            {
             before(grammarAccess.getLeftAspectAccess().getValueAssignment_0()); 
            // InternalMyUiDsl.g:4453:2: ( rule__LeftAspect__ValueAssignment_0 )
            // InternalMyUiDsl.g:4453:3: rule__LeftAspect__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LeftAspect__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLeftAspectAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftAspect__Group__0__Impl"


    // $ANTLR start "rule__LeftAspect__Group__1"
    // InternalMyUiDsl.g:4461:1: rule__LeftAspect__Group__1 : rule__LeftAspect__Group__1__Impl rule__LeftAspect__Group__2 ;
    public final void rule__LeftAspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4465:1: ( rule__LeftAspect__Group__1__Impl rule__LeftAspect__Group__2 )
            // InternalMyUiDsl.g:4466:2: rule__LeftAspect__Group__1__Impl rule__LeftAspect__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__LeftAspect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftAspect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftAspect__Group__1"


    // $ANTLR start "rule__LeftAspect__Group__1__Impl"
    // InternalMyUiDsl.g:4473:1: rule__LeftAspect__Group__1__Impl : ( 'le' ) ;
    public final void rule__LeftAspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4477:1: ( ( 'le' ) )
            // InternalMyUiDsl.g:4478:1: ( 'le' )
            {
            // InternalMyUiDsl.g:4478:1: ( 'le' )
            // InternalMyUiDsl.g:4479:2: 'le'
            {
             before(grammarAccess.getLeftAspectAccess().getLeKeyword_1()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getLeftAspectAccess().getLeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftAspect__Group__1__Impl"


    // $ANTLR start "rule__LeftAspect__Group__2"
    // InternalMyUiDsl.g:4488:1: rule__LeftAspect__Group__2 : rule__LeftAspect__Group__2__Impl ;
    public final void rule__LeftAspect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4492:1: ( rule__LeftAspect__Group__2__Impl )
            // InternalMyUiDsl.g:4493:2: rule__LeftAspect__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeftAspect__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftAspect__Group__2"


    // $ANTLR start "rule__LeftAspect__Group__2__Impl"
    // InternalMyUiDsl.g:4499:1: rule__LeftAspect__Group__2__Impl : ( ( rule__LeftAspect__MeasureTypeAssignment_2 )? ) ;
    public final void rule__LeftAspect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4503:1: ( ( ( rule__LeftAspect__MeasureTypeAssignment_2 )? ) )
            // InternalMyUiDsl.g:4504:1: ( ( rule__LeftAspect__MeasureTypeAssignment_2 )? )
            {
            // InternalMyUiDsl.g:4504:1: ( ( rule__LeftAspect__MeasureTypeAssignment_2 )? )
            // InternalMyUiDsl.g:4505:2: ( rule__LeftAspect__MeasureTypeAssignment_2 )?
            {
             before(grammarAccess.getLeftAspectAccess().getMeasureTypeAssignment_2()); 
            // InternalMyUiDsl.g:4506:2: ( rule__LeftAspect__MeasureTypeAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=25 && LA26_0<=27)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyUiDsl.g:4506:3: rule__LeftAspect__MeasureTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeftAspect__MeasureTypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeftAspectAccess().getMeasureTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftAspect__Group__2__Impl"


    // $ANTLR start "rule__RightAspect__Group__0"
    // InternalMyUiDsl.g:4515:1: rule__RightAspect__Group__0 : rule__RightAspect__Group__0__Impl rule__RightAspect__Group__1 ;
    public final void rule__RightAspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4519:1: ( rule__RightAspect__Group__0__Impl rule__RightAspect__Group__1 )
            // InternalMyUiDsl.g:4520:2: rule__RightAspect__Group__0__Impl rule__RightAspect__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__RightAspect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightAspect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightAspect__Group__0"


    // $ANTLR start "rule__RightAspect__Group__0__Impl"
    // InternalMyUiDsl.g:4527:1: rule__RightAspect__Group__0__Impl : ( ( rule__RightAspect__ValueAssignment_0 ) ) ;
    public final void rule__RightAspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4531:1: ( ( ( rule__RightAspect__ValueAssignment_0 ) ) )
            // InternalMyUiDsl.g:4532:1: ( ( rule__RightAspect__ValueAssignment_0 ) )
            {
            // InternalMyUiDsl.g:4532:1: ( ( rule__RightAspect__ValueAssignment_0 ) )
            // InternalMyUiDsl.g:4533:2: ( rule__RightAspect__ValueAssignment_0 )
            {
             before(grammarAccess.getRightAspectAccess().getValueAssignment_0()); 
            // InternalMyUiDsl.g:4534:2: ( rule__RightAspect__ValueAssignment_0 )
            // InternalMyUiDsl.g:4534:3: rule__RightAspect__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RightAspect__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRightAspectAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightAspect__Group__0__Impl"


    // $ANTLR start "rule__RightAspect__Group__1"
    // InternalMyUiDsl.g:4542:1: rule__RightAspect__Group__1 : rule__RightAspect__Group__1__Impl rule__RightAspect__Group__2 ;
    public final void rule__RightAspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4546:1: ( rule__RightAspect__Group__1__Impl rule__RightAspect__Group__2 )
            // InternalMyUiDsl.g:4547:2: rule__RightAspect__Group__1__Impl rule__RightAspect__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__RightAspect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightAspect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightAspect__Group__1"


    // $ANTLR start "rule__RightAspect__Group__1__Impl"
    // InternalMyUiDsl.g:4554:1: rule__RightAspect__Group__1__Impl : ( 'ri' ) ;
    public final void rule__RightAspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4558:1: ( ( 'ri' ) )
            // InternalMyUiDsl.g:4559:1: ( 'ri' )
            {
            // InternalMyUiDsl.g:4559:1: ( 'ri' )
            // InternalMyUiDsl.g:4560:2: 'ri'
            {
             before(grammarAccess.getRightAspectAccess().getRiKeyword_1()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getRightAspectAccess().getRiKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightAspect__Group__1__Impl"


    // $ANTLR start "rule__RightAspect__Group__2"
    // InternalMyUiDsl.g:4569:1: rule__RightAspect__Group__2 : rule__RightAspect__Group__2__Impl ;
    public final void rule__RightAspect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4573:1: ( rule__RightAspect__Group__2__Impl )
            // InternalMyUiDsl.g:4574:2: rule__RightAspect__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RightAspect__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightAspect__Group__2"


    // $ANTLR start "rule__RightAspect__Group__2__Impl"
    // InternalMyUiDsl.g:4580:1: rule__RightAspect__Group__2__Impl : ( ( rule__RightAspect__MeasureTypeAssignment_2 )? ) ;
    public final void rule__RightAspect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4584:1: ( ( ( rule__RightAspect__MeasureTypeAssignment_2 )? ) )
            // InternalMyUiDsl.g:4585:1: ( ( rule__RightAspect__MeasureTypeAssignment_2 )? )
            {
            // InternalMyUiDsl.g:4585:1: ( ( rule__RightAspect__MeasureTypeAssignment_2 )? )
            // InternalMyUiDsl.g:4586:2: ( rule__RightAspect__MeasureTypeAssignment_2 )?
            {
             before(grammarAccess.getRightAspectAccess().getMeasureTypeAssignment_2()); 
            // InternalMyUiDsl.g:4587:2: ( rule__RightAspect__MeasureTypeAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=25 && LA27_0<=27)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyUiDsl.g:4587:3: rule__RightAspect__MeasureTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RightAspect__MeasureTypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRightAspectAccess().getMeasureTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightAspect__Group__2__Impl"


    // $ANTLR start "rule__UpAspect__Group__0"
    // InternalMyUiDsl.g:4596:1: rule__UpAspect__Group__0 : rule__UpAspect__Group__0__Impl rule__UpAspect__Group__1 ;
    public final void rule__UpAspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4600:1: ( rule__UpAspect__Group__0__Impl rule__UpAspect__Group__1 )
            // InternalMyUiDsl.g:4601:2: rule__UpAspect__Group__0__Impl rule__UpAspect__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__UpAspect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpAspect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpAspect__Group__0"


    // $ANTLR start "rule__UpAspect__Group__0__Impl"
    // InternalMyUiDsl.g:4608:1: rule__UpAspect__Group__0__Impl : ( ( rule__UpAspect__ValueAssignment_0 ) ) ;
    public final void rule__UpAspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4612:1: ( ( ( rule__UpAspect__ValueAssignment_0 ) ) )
            // InternalMyUiDsl.g:4613:1: ( ( rule__UpAspect__ValueAssignment_0 ) )
            {
            // InternalMyUiDsl.g:4613:1: ( ( rule__UpAspect__ValueAssignment_0 ) )
            // InternalMyUiDsl.g:4614:2: ( rule__UpAspect__ValueAssignment_0 )
            {
             before(grammarAccess.getUpAspectAccess().getValueAssignment_0()); 
            // InternalMyUiDsl.g:4615:2: ( rule__UpAspect__ValueAssignment_0 )
            // InternalMyUiDsl.g:4615:3: rule__UpAspect__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UpAspect__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUpAspectAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpAspect__Group__0__Impl"


    // $ANTLR start "rule__UpAspect__Group__1"
    // InternalMyUiDsl.g:4623:1: rule__UpAspect__Group__1 : rule__UpAspect__Group__1__Impl rule__UpAspect__Group__2 ;
    public final void rule__UpAspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4627:1: ( rule__UpAspect__Group__1__Impl rule__UpAspect__Group__2 )
            // InternalMyUiDsl.g:4628:2: rule__UpAspect__Group__1__Impl rule__UpAspect__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__UpAspect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpAspect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpAspect__Group__1"


    // $ANTLR start "rule__UpAspect__Group__1__Impl"
    // InternalMyUiDsl.g:4635:1: rule__UpAspect__Group__1__Impl : ( 'up' ) ;
    public final void rule__UpAspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4639:1: ( ( 'up' ) )
            // InternalMyUiDsl.g:4640:1: ( 'up' )
            {
            // InternalMyUiDsl.g:4640:1: ( 'up' )
            // InternalMyUiDsl.g:4641:2: 'up'
            {
             before(grammarAccess.getUpAspectAccess().getUpKeyword_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getUpAspectAccess().getUpKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpAspect__Group__1__Impl"


    // $ANTLR start "rule__UpAspect__Group__2"
    // InternalMyUiDsl.g:4650:1: rule__UpAspect__Group__2 : rule__UpAspect__Group__2__Impl ;
    public final void rule__UpAspect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4654:1: ( rule__UpAspect__Group__2__Impl )
            // InternalMyUiDsl.g:4655:2: rule__UpAspect__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpAspect__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpAspect__Group__2"


    // $ANTLR start "rule__UpAspect__Group__2__Impl"
    // InternalMyUiDsl.g:4661:1: rule__UpAspect__Group__2__Impl : ( ( rule__UpAspect__MeasureTypeAssignment_2 )? ) ;
    public final void rule__UpAspect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4665:1: ( ( ( rule__UpAspect__MeasureTypeAssignment_2 )? ) )
            // InternalMyUiDsl.g:4666:1: ( ( rule__UpAspect__MeasureTypeAssignment_2 )? )
            {
            // InternalMyUiDsl.g:4666:1: ( ( rule__UpAspect__MeasureTypeAssignment_2 )? )
            // InternalMyUiDsl.g:4667:2: ( rule__UpAspect__MeasureTypeAssignment_2 )?
            {
             before(grammarAccess.getUpAspectAccess().getMeasureTypeAssignment_2()); 
            // InternalMyUiDsl.g:4668:2: ( rule__UpAspect__MeasureTypeAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=25 && LA28_0<=27)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyUiDsl.g:4668:3: rule__UpAspect__MeasureTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__UpAspect__MeasureTypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUpAspectAccess().getMeasureTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpAspect__Group__2__Impl"


    // $ANTLR start "rule__DownAspect__Group__0"
    // InternalMyUiDsl.g:4677:1: rule__DownAspect__Group__0 : rule__DownAspect__Group__0__Impl rule__DownAspect__Group__1 ;
    public final void rule__DownAspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4681:1: ( rule__DownAspect__Group__0__Impl rule__DownAspect__Group__1 )
            // InternalMyUiDsl.g:4682:2: rule__DownAspect__Group__0__Impl rule__DownAspect__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__DownAspect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DownAspect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DownAspect__Group__0"


    // $ANTLR start "rule__DownAspect__Group__0__Impl"
    // InternalMyUiDsl.g:4689:1: rule__DownAspect__Group__0__Impl : ( ( rule__DownAspect__ValueAssignment_0 ) ) ;
    public final void rule__DownAspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4693:1: ( ( ( rule__DownAspect__ValueAssignment_0 ) ) )
            // InternalMyUiDsl.g:4694:1: ( ( rule__DownAspect__ValueAssignment_0 ) )
            {
            // InternalMyUiDsl.g:4694:1: ( ( rule__DownAspect__ValueAssignment_0 ) )
            // InternalMyUiDsl.g:4695:2: ( rule__DownAspect__ValueAssignment_0 )
            {
             before(grammarAccess.getDownAspectAccess().getValueAssignment_0()); 
            // InternalMyUiDsl.g:4696:2: ( rule__DownAspect__ValueAssignment_0 )
            // InternalMyUiDsl.g:4696:3: rule__DownAspect__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DownAspect__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDownAspectAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DownAspect__Group__0__Impl"


    // $ANTLR start "rule__DownAspect__Group__1"
    // InternalMyUiDsl.g:4704:1: rule__DownAspect__Group__1 : rule__DownAspect__Group__1__Impl rule__DownAspect__Group__2 ;
    public final void rule__DownAspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4708:1: ( rule__DownAspect__Group__1__Impl rule__DownAspect__Group__2 )
            // InternalMyUiDsl.g:4709:2: rule__DownAspect__Group__1__Impl rule__DownAspect__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__DownAspect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DownAspect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DownAspect__Group__1"


    // $ANTLR start "rule__DownAspect__Group__1__Impl"
    // InternalMyUiDsl.g:4716:1: rule__DownAspect__Group__1__Impl : ( 'dn' ) ;
    public final void rule__DownAspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4720:1: ( ( 'dn' ) )
            // InternalMyUiDsl.g:4721:1: ( 'dn' )
            {
            // InternalMyUiDsl.g:4721:1: ( 'dn' )
            // InternalMyUiDsl.g:4722:2: 'dn'
            {
             before(grammarAccess.getDownAspectAccess().getDnKeyword_1()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getDownAspectAccess().getDnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DownAspect__Group__1__Impl"


    // $ANTLR start "rule__DownAspect__Group__2"
    // InternalMyUiDsl.g:4731:1: rule__DownAspect__Group__2 : rule__DownAspect__Group__2__Impl ;
    public final void rule__DownAspect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4735:1: ( rule__DownAspect__Group__2__Impl )
            // InternalMyUiDsl.g:4736:2: rule__DownAspect__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DownAspect__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DownAspect__Group__2"


    // $ANTLR start "rule__DownAspect__Group__2__Impl"
    // InternalMyUiDsl.g:4742:1: rule__DownAspect__Group__2__Impl : ( ( rule__DownAspect__MeasureTypeAssignment_2 )? ) ;
    public final void rule__DownAspect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4746:1: ( ( ( rule__DownAspect__MeasureTypeAssignment_2 )? ) )
            // InternalMyUiDsl.g:4747:1: ( ( rule__DownAspect__MeasureTypeAssignment_2 )? )
            {
            // InternalMyUiDsl.g:4747:1: ( ( rule__DownAspect__MeasureTypeAssignment_2 )? )
            // InternalMyUiDsl.g:4748:2: ( rule__DownAspect__MeasureTypeAssignment_2 )?
            {
             before(grammarAccess.getDownAspectAccess().getMeasureTypeAssignment_2()); 
            // InternalMyUiDsl.g:4749:2: ( rule__DownAspect__MeasureTypeAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=25 && LA29_0<=27)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyUiDsl.g:4749:3: rule__DownAspect__MeasureTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DownAspect__MeasureTypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDownAspectAccess().getMeasureTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DownAspect__Group__2__Impl"


    // $ANTLR start "rule__Accessory__UnorderedGroup_2"
    // InternalMyUiDsl.g:4758:1: rule__Accessory__UnorderedGroup_2 : ( rule__Accessory__UnorderedGroup_2__0 )? ;
    public final void rule__Accessory__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAccessoryAccess().getUnorderedGroup_2());
        	
        try {
            // InternalMyUiDsl.g:4763:1: ( ( rule__Accessory__UnorderedGroup_2__0 )? )
            // InternalMyUiDsl.g:4764:2: ( rule__Accessory__UnorderedGroup_2__0 )?
            {
            // InternalMyUiDsl.g:4764:2: ( rule__Accessory__UnorderedGroup_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 1) ) {
                alt30=1;
            }
            else if ( LA30_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 2) ) {
                alt30=1;
            }
            else if ( LA30_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 3) ) {
                alt30=1;
            }
            else if ( LA30_0 == RULE_STRING2 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 4) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyUiDsl.g:4764:2: rule__Accessory__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Accessory__UnorderedGroup_2__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getAccessoryAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__UnorderedGroup_2"


    // $ANTLR start "rule__Accessory__UnorderedGroup_2__Impl"
    // InternalMyUiDsl.g:4772:1: rule__Accessory__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__Accessory__TextAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Accessory__StyleAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__Accessory__ClazzAssignment_2_2 ) ) ) ) | ({...}? => ( ( ( rule__Accessory__TypeAssignment_2_3 ) ) ) ) | ({...}? => ( ( ( rule__Accessory__FeatureAssignment_2_4 ) ) ) ) ) ;
    public final void rule__Accessory__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMyUiDsl.g:4777:1: ( ( ({...}? => ( ( ( rule__Accessory__TextAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Accessory__StyleAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__Accessory__ClazzAssignment_2_2 ) ) ) ) | ({...}? => ( ( ( rule__Accessory__TypeAssignment_2_3 ) ) ) ) | ({...}? => ( ( ( rule__Accessory__FeatureAssignment_2_4 ) ) ) ) ) )
            // InternalMyUiDsl.g:4778:3: ( ({...}? => ( ( ( rule__Accessory__TextAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Accessory__StyleAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__Accessory__ClazzAssignment_2_2 ) ) ) ) | ({...}? => ( ( ( rule__Accessory__TypeAssignment_2_3 ) ) ) ) | ({...}? => ( ( ( rule__Accessory__FeatureAssignment_2_4 ) ) ) ) )
            {
            // InternalMyUiDsl.g:4778:3: ( ({...}? => ( ( ( rule__Accessory__TextAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Accessory__StyleAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__Accessory__ClazzAssignment_2_2 ) ) ) ) | ({...}? => ( ( ( rule__Accessory__TypeAssignment_2_3 ) ) ) ) | ({...}? => ( ( ( rule__Accessory__FeatureAssignment_2_4 ) ) ) ) )
            int alt31=5;
            int LA31_0 = input.LA(1);

            if ( LA31_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 1) ) {
                alt31=2;
            }
            else if ( LA31_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 2) ) {
                alt31=3;
            }
            else if ( LA31_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 3) ) {
                alt31=4;
            }
            else if ( LA31_0 == RULE_STRING2 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 4) ) {
                alt31=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyUiDsl.g:4779:3: ({...}? => ( ( ( rule__Accessory__TextAssignment_2_0 ) ) ) )
                    {
                    // InternalMyUiDsl.g:4779:3: ({...}? => ( ( ( rule__Accessory__TextAssignment_2_0 ) ) ) )
                    // InternalMyUiDsl.g:4780:4: {...}? => ( ( ( rule__Accessory__TextAssignment_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Accessory__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalMyUiDsl.g:4780:105: ( ( ( rule__Accessory__TextAssignment_2_0 ) ) )
                    // InternalMyUiDsl.g:4781:5: ( ( rule__Accessory__TextAssignment_2_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMyUiDsl.g:4787:5: ( ( rule__Accessory__TextAssignment_2_0 ) )
                    // InternalMyUiDsl.g:4788:6: ( rule__Accessory__TextAssignment_2_0 )
                    {
                     before(grammarAccess.getAccessoryAccess().getTextAssignment_2_0()); 
                    // InternalMyUiDsl.g:4789:6: ( rule__Accessory__TextAssignment_2_0 )
                    // InternalMyUiDsl.g:4789:7: rule__Accessory__TextAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Accessory__TextAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAccessoryAccess().getTextAssignment_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:4794:3: ({...}? => ( ( ( rule__Accessory__StyleAssignment_2_1 ) ) ) )
                    {
                    // InternalMyUiDsl.g:4794:3: ({...}? => ( ( ( rule__Accessory__StyleAssignment_2_1 ) ) ) )
                    // InternalMyUiDsl.g:4795:4: {...}? => ( ( ( rule__Accessory__StyleAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Accessory__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalMyUiDsl.g:4795:105: ( ( ( rule__Accessory__StyleAssignment_2_1 ) ) )
                    // InternalMyUiDsl.g:4796:5: ( ( rule__Accessory__StyleAssignment_2_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMyUiDsl.g:4802:5: ( ( rule__Accessory__StyleAssignment_2_1 ) )
                    // InternalMyUiDsl.g:4803:6: ( rule__Accessory__StyleAssignment_2_1 )
                    {
                     before(grammarAccess.getAccessoryAccess().getStyleAssignment_2_1()); 
                    // InternalMyUiDsl.g:4804:6: ( rule__Accessory__StyleAssignment_2_1 )
                    // InternalMyUiDsl.g:4804:7: rule__Accessory__StyleAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Accessory__StyleAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAccessoryAccess().getStyleAssignment_2_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:4809:3: ({...}? => ( ( ( rule__Accessory__ClazzAssignment_2_2 ) ) ) )
                    {
                    // InternalMyUiDsl.g:4809:3: ({...}? => ( ( ( rule__Accessory__ClazzAssignment_2_2 ) ) ) )
                    // InternalMyUiDsl.g:4810:4: {...}? => ( ( ( rule__Accessory__ClazzAssignment_2_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Accessory__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 2)");
                    }
                    // InternalMyUiDsl.g:4810:105: ( ( ( rule__Accessory__ClazzAssignment_2_2 ) ) )
                    // InternalMyUiDsl.g:4811:5: ( ( rule__Accessory__ClazzAssignment_2_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 2);
                    				

                    					selected = true;
                    				
                    // InternalMyUiDsl.g:4817:5: ( ( rule__Accessory__ClazzAssignment_2_2 ) )
                    // InternalMyUiDsl.g:4818:6: ( rule__Accessory__ClazzAssignment_2_2 )
                    {
                     before(grammarAccess.getAccessoryAccess().getClazzAssignment_2_2()); 
                    // InternalMyUiDsl.g:4819:6: ( rule__Accessory__ClazzAssignment_2_2 )
                    // InternalMyUiDsl.g:4819:7: rule__Accessory__ClazzAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Accessory__ClazzAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAccessoryAccess().getClazzAssignment_2_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:4824:3: ({...}? => ( ( ( rule__Accessory__TypeAssignment_2_3 ) ) ) )
                    {
                    // InternalMyUiDsl.g:4824:3: ({...}? => ( ( ( rule__Accessory__TypeAssignment_2_3 ) ) ) )
                    // InternalMyUiDsl.g:4825:4: {...}? => ( ( ( rule__Accessory__TypeAssignment_2_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Accessory__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 3)");
                    }
                    // InternalMyUiDsl.g:4825:105: ( ( ( rule__Accessory__TypeAssignment_2_3 ) ) )
                    // InternalMyUiDsl.g:4826:5: ( ( rule__Accessory__TypeAssignment_2_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 3);
                    				

                    					selected = true;
                    				
                    // InternalMyUiDsl.g:4832:5: ( ( rule__Accessory__TypeAssignment_2_3 ) )
                    // InternalMyUiDsl.g:4833:6: ( rule__Accessory__TypeAssignment_2_3 )
                    {
                     before(grammarAccess.getAccessoryAccess().getTypeAssignment_2_3()); 
                    // InternalMyUiDsl.g:4834:6: ( rule__Accessory__TypeAssignment_2_3 )
                    // InternalMyUiDsl.g:4834:7: rule__Accessory__TypeAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Accessory__TypeAssignment_2_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getAccessoryAccess().getTypeAssignment_2_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyUiDsl.g:4839:3: ({...}? => ( ( ( rule__Accessory__FeatureAssignment_2_4 ) ) ) )
                    {
                    // InternalMyUiDsl.g:4839:3: ({...}? => ( ( ( rule__Accessory__FeatureAssignment_2_4 ) ) ) )
                    // InternalMyUiDsl.g:4840:4: {...}? => ( ( ( rule__Accessory__FeatureAssignment_2_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Accessory__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 4)");
                    }
                    // InternalMyUiDsl.g:4840:105: ( ( ( rule__Accessory__FeatureAssignment_2_4 ) ) )
                    // InternalMyUiDsl.g:4841:5: ( ( rule__Accessory__FeatureAssignment_2_4 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 4);
                    				

                    					selected = true;
                    				
                    // InternalMyUiDsl.g:4847:5: ( ( rule__Accessory__FeatureAssignment_2_4 ) )
                    // InternalMyUiDsl.g:4848:6: ( rule__Accessory__FeatureAssignment_2_4 )
                    {
                     before(grammarAccess.getAccessoryAccess().getFeatureAssignment_2_4()); 
                    // InternalMyUiDsl.g:4849:6: ( rule__Accessory__FeatureAssignment_2_4 )
                    // InternalMyUiDsl.g:4849:7: rule__Accessory__FeatureAssignment_2_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Accessory__FeatureAssignment_2_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getAccessoryAccess().getFeatureAssignment_2_4()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAccessoryAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__Accessory__UnorderedGroup_2__0"
    // InternalMyUiDsl.g:4862:1: rule__Accessory__UnorderedGroup_2__0 : rule__Accessory__UnorderedGroup_2__Impl ( rule__Accessory__UnorderedGroup_2__1 )? ;
    public final void rule__Accessory__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4866:1: ( rule__Accessory__UnorderedGroup_2__Impl ( rule__Accessory__UnorderedGroup_2__1 )? )
            // InternalMyUiDsl.g:4867:2: rule__Accessory__UnorderedGroup_2__Impl ( rule__Accessory__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_44);
            rule__Accessory__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalMyUiDsl.g:4868:2: ( rule__Accessory__UnorderedGroup_2__1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 1) ) {
                alt32=1;
            }
            else if ( LA32_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 2) ) {
                alt32=1;
            }
            else if ( LA32_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 3) ) {
                alt32=1;
            }
            else if ( LA32_0 == RULE_STRING2 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 4) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyUiDsl.g:4868:2: rule__Accessory__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Accessory__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__UnorderedGroup_2__0"


    // $ANTLR start "rule__Accessory__UnorderedGroup_2__1"
    // InternalMyUiDsl.g:4874:1: rule__Accessory__UnorderedGroup_2__1 : rule__Accessory__UnorderedGroup_2__Impl ( rule__Accessory__UnorderedGroup_2__2 )? ;
    public final void rule__Accessory__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4878:1: ( rule__Accessory__UnorderedGroup_2__Impl ( rule__Accessory__UnorderedGroup_2__2 )? )
            // InternalMyUiDsl.g:4879:2: rule__Accessory__UnorderedGroup_2__Impl ( rule__Accessory__UnorderedGroup_2__2 )?
            {
            pushFollow(FOLLOW_44);
            rule__Accessory__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalMyUiDsl.g:4880:2: ( rule__Accessory__UnorderedGroup_2__2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( LA33_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 1) ) {
                alt33=1;
            }
            else if ( LA33_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 2) ) {
                alt33=1;
            }
            else if ( LA33_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 3) ) {
                alt33=1;
            }
            else if ( LA33_0 == RULE_STRING2 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 4) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyUiDsl.g:4880:2: rule__Accessory__UnorderedGroup_2__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Accessory__UnorderedGroup_2__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__UnorderedGroup_2__1"


    // $ANTLR start "rule__Accessory__UnorderedGroup_2__2"
    // InternalMyUiDsl.g:4886:1: rule__Accessory__UnorderedGroup_2__2 : rule__Accessory__UnorderedGroup_2__Impl ( rule__Accessory__UnorderedGroup_2__3 )? ;
    public final void rule__Accessory__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4890:1: ( rule__Accessory__UnorderedGroup_2__Impl ( rule__Accessory__UnorderedGroup_2__3 )? )
            // InternalMyUiDsl.g:4891:2: rule__Accessory__UnorderedGroup_2__Impl ( rule__Accessory__UnorderedGroup_2__3 )?
            {
            pushFollow(FOLLOW_44);
            rule__Accessory__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalMyUiDsl.g:4892:2: ( rule__Accessory__UnorderedGroup_2__3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( LA34_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 0) ) {
                alt34=1;
            }
            else if ( LA34_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 1) ) {
                alt34=1;
            }
            else if ( LA34_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 2) ) {
                alt34=1;
            }
            else if ( LA34_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 3) ) {
                alt34=1;
            }
            else if ( LA34_0 == RULE_STRING2 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 4) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyUiDsl.g:4892:2: rule__Accessory__UnorderedGroup_2__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Accessory__UnorderedGroup_2__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__UnorderedGroup_2__2"


    // $ANTLR start "rule__Accessory__UnorderedGroup_2__3"
    // InternalMyUiDsl.g:4898:1: rule__Accessory__UnorderedGroup_2__3 : rule__Accessory__UnorderedGroup_2__Impl ( rule__Accessory__UnorderedGroup_2__4 )? ;
    public final void rule__Accessory__UnorderedGroup_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4902:1: ( rule__Accessory__UnorderedGroup_2__Impl ( rule__Accessory__UnorderedGroup_2__4 )? )
            // InternalMyUiDsl.g:4903:2: rule__Accessory__UnorderedGroup_2__Impl ( rule__Accessory__UnorderedGroup_2__4 )?
            {
            pushFollow(FOLLOW_44);
            rule__Accessory__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalMyUiDsl.g:4904:2: ( rule__Accessory__UnorderedGroup_2__4 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( LA35_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 0) ) {
                alt35=1;
            }
            else if ( LA35_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 1) ) {
                alt35=1;
            }
            else if ( LA35_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 2) ) {
                alt35=1;
            }
            else if ( LA35_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 3) ) {
                alt35=1;
            }
            else if ( LA35_0 == RULE_STRING2 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 4) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyUiDsl.g:4904:2: rule__Accessory__UnorderedGroup_2__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Accessory__UnorderedGroup_2__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__UnorderedGroup_2__3"


    // $ANTLR start "rule__Accessory__UnorderedGroup_2__4"
    // InternalMyUiDsl.g:4910:1: rule__Accessory__UnorderedGroup_2__4 : rule__Accessory__UnorderedGroup_2__Impl ;
    public final void rule__Accessory__UnorderedGroup_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:4914:1: ( rule__Accessory__UnorderedGroup_2__Impl )
            // InternalMyUiDsl.g:4915:2: rule__Accessory__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Accessory__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__UnorderedGroup_2__4"


    // $ANTLR start "rule__RgbaColor__UnorderedGroup_1"
    // InternalMyUiDsl.g:4922:1: rule__RgbaColor__UnorderedGroup_1 : ( rule__RgbaColor__UnorderedGroup_1__0 )? ;
    public final void rule__RgbaColor__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1());
        	
        try {
            // InternalMyUiDsl.g:4927:1: ( ( rule__RgbaColor__UnorderedGroup_1__0 )? )
            // InternalMyUiDsl.g:4928:2: ( rule__RgbaColor__UnorderedGroup_1__0 )?
            {
            // InternalMyUiDsl.g:4928:2: ( rule__RgbaColor__UnorderedGroup_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( LA36_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 3) ) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyUiDsl.g:4928:2: rule__RgbaColor__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RgbaColor__UnorderedGroup_1__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RgbaColor__UnorderedGroup_1"


    // $ANTLR start "rule__RgbaColor__UnorderedGroup_1__Impl"
    // InternalMyUiDsl.g:4936:1: rule__RgbaColor__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__RgbaColor__RvalAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__RgbaColor__GvalAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__RgbaColor__BvalAssignment_1_2 ) ) ) ) | ({...}? => ( ( ( rule__RgbaColor__AvalAssignment_1_3 ) ) ) ) ) ;
    public final void rule__RgbaColor__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMyUiDsl.g:4941:1: ( ( ({...}? => ( ( ( rule__RgbaColor__RvalAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__RgbaColor__GvalAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__RgbaColor__BvalAssignment_1_2 ) ) ) ) | ({...}? => ( ( ( rule__RgbaColor__AvalAssignment_1_3 ) ) ) ) ) )
            // InternalMyUiDsl.g:4942:3: ( ({...}? => ( ( ( rule__RgbaColor__RvalAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__RgbaColor__GvalAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__RgbaColor__BvalAssignment_1_2 ) ) ) ) | ({...}? => ( ( ( rule__RgbaColor__AvalAssignment_1_3 ) ) ) ) )
            {
            // InternalMyUiDsl.g:4942:3: ( ({...}? => ( ( ( rule__RgbaColor__RvalAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__RgbaColor__GvalAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__RgbaColor__BvalAssignment_1_2 ) ) ) ) | ({...}? => ( ( ( rule__RgbaColor__AvalAssignment_1_3 ) ) ) ) )
            int alt37=4;
            int LA37_0 = input.LA(1);

            if ( LA37_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 3) ) ) {
                int LA37_1 = input.LA(2);

                if ( LA37_1 == 78 && getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 1) ) {
                    alt37=2;
                }
                else if ( LA37_1 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 2) ) {
                    alt37=3;
                }
                else if ( LA37_1 == 77 && getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_1 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 3) ) {
                    alt37=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyUiDsl.g:4943:3: ({...}? => ( ( ( rule__RgbaColor__RvalAssignment_1_0 ) ) ) )
                    {
                    // InternalMyUiDsl.g:4943:3: ({...}? => ( ( ( rule__RgbaColor__RvalAssignment_1_0 ) ) ) )
                    // InternalMyUiDsl.g:4944:4: {...}? => ( ( ( rule__RgbaColor__RvalAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__RgbaColor__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalMyUiDsl.g:4944:105: ( ( ( rule__RgbaColor__RvalAssignment_1_0 ) ) )
                    // InternalMyUiDsl.g:4945:5: ( ( rule__RgbaColor__RvalAssignment_1_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMyUiDsl.g:4951:5: ( ( rule__RgbaColor__RvalAssignment_1_0 ) )
                    // InternalMyUiDsl.g:4952:6: ( rule__RgbaColor__RvalAssignment_1_0 )
                    {
                     before(grammarAccess.getRgbaColorAccess().getRvalAssignment_1_0()); 
                    // InternalMyUiDsl.g:4953:6: ( rule__RgbaColor__RvalAssignment_1_0 )
                    // InternalMyUiDsl.g:4953:7: rule__RgbaColor__RvalAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RgbaColor__RvalAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRgbaColorAccess().getRvalAssignment_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:4958:3: ({...}? => ( ( ( rule__RgbaColor__GvalAssignment_1_1 ) ) ) )
                    {
                    // InternalMyUiDsl.g:4958:3: ({...}? => ( ( ( rule__RgbaColor__GvalAssignment_1_1 ) ) ) )
                    // InternalMyUiDsl.g:4959:4: {...}? => ( ( ( rule__RgbaColor__GvalAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__RgbaColor__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalMyUiDsl.g:4959:105: ( ( ( rule__RgbaColor__GvalAssignment_1_1 ) ) )
                    // InternalMyUiDsl.g:4960:5: ( ( rule__RgbaColor__GvalAssignment_1_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMyUiDsl.g:4966:5: ( ( rule__RgbaColor__GvalAssignment_1_1 ) )
                    // InternalMyUiDsl.g:4967:6: ( rule__RgbaColor__GvalAssignment_1_1 )
                    {
                     before(grammarAccess.getRgbaColorAccess().getGvalAssignment_1_1()); 
                    // InternalMyUiDsl.g:4968:6: ( rule__RgbaColor__GvalAssignment_1_1 )
                    // InternalMyUiDsl.g:4968:7: rule__RgbaColor__GvalAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RgbaColor__GvalAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRgbaColorAccess().getGvalAssignment_1_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:4973:3: ({...}? => ( ( ( rule__RgbaColor__BvalAssignment_1_2 ) ) ) )
                    {
                    // InternalMyUiDsl.g:4973:3: ({...}? => ( ( ( rule__RgbaColor__BvalAssignment_1_2 ) ) ) )
                    // InternalMyUiDsl.g:4974:4: {...}? => ( ( ( rule__RgbaColor__BvalAssignment_1_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__RgbaColor__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 2)");
                    }
                    // InternalMyUiDsl.g:4974:105: ( ( ( rule__RgbaColor__BvalAssignment_1_2 ) ) )
                    // InternalMyUiDsl.g:4975:5: ( ( rule__RgbaColor__BvalAssignment_1_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 2);
                    				

                    					selected = true;
                    				
                    // InternalMyUiDsl.g:4981:5: ( ( rule__RgbaColor__BvalAssignment_1_2 ) )
                    // InternalMyUiDsl.g:4982:6: ( rule__RgbaColor__BvalAssignment_1_2 )
                    {
                     before(grammarAccess.getRgbaColorAccess().getBvalAssignment_1_2()); 
                    // InternalMyUiDsl.g:4983:6: ( rule__RgbaColor__BvalAssignment_1_2 )
                    // InternalMyUiDsl.g:4983:7: rule__RgbaColor__BvalAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RgbaColor__BvalAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRgbaColorAccess().getBvalAssignment_1_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:4988:3: ({...}? => ( ( ( rule__RgbaColor__AvalAssignment_1_3 ) ) ) )
                    {
                    // InternalMyUiDsl.g:4988:3: ({...}? => ( ( ( rule__RgbaColor__AvalAssignment_1_3 ) ) ) )
                    // InternalMyUiDsl.g:4989:4: {...}? => ( ( ( rule__RgbaColor__AvalAssignment_1_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 3) ) {
                        throw new FailedPredicateException(input, "rule__RgbaColor__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 3)");
                    }
                    // InternalMyUiDsl.g:4989:105: ( ( ( rule__RgbaColor__AvalAssignment_1_3 ) ) )
                    // InternalMyUiDsl.g:4990:5: ( ( rule__RgbaColor__AvalAssignment_1_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 3);
                    				

                    					selected = true;
                    				
                    // InternalMyUiDsl.g:4996:5: ( ( rule__RgbaColor__AvalAssignment_1_3 ) )
                    // InternalMyUiDsl.g:4997:6: ( rule__RgbaColor__AvalAssignment_1_3 )
                    {
                     before(grammarAccess.getRgbaColorAccess().getAvalAssignment_1_3()); 
                    // InternalMyUiDsl.g:4998:6: ( rule__RgbaColor__AvalAssignment_1_3 )
                    // InternalMyUiDsl.g:4998:7: rule__RgbaColor__AvalAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RgbaColor__AvalAssignment_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getRgbaColorAccess().getAvalAssignment_1_3()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RgbaColor__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__RgbaColor__UnorderedGroup_1__0"
    // InternalMyUiDsl.g:5011:1: rule__RgbaColor__UnorderedGroup_1__0 : rule__RgbaColor__UnorderedGroup_1__Impl ( rule__RgbaColor__UnorderedGroup_1__1 )? ;
    public final void rule__RgbaColor__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5015:1: ( rule__RgbaColor__UnorderedGroup_1__Impl ( rule__RgbaColor__UnorderedGroup_1__1 )? )
            // InternalMyUiDsl.g:5016:2: rule__RgbaColor__UnorderedGroup_1__Impl ( rule__RgbaColor__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_45);
            rule__RgbaColor__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMyUiDsl.g:5017:2: ( rule__RgbaColor__UnorderedGroup_1__1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( LA38_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 3) ) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyUiDsl.g:5017:2: rule__RgbaColor__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RgbaColor__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RgbaColor__UnorderedGroup_1__0"


    // $ANTLR start "rule__RgbaColor__UnorderedGroup_1__1"
    // InternalMyUiDsl.g:5023:1: rule__RgbaColor__UnorderedGroup_1__1 : rule__RgbaColor__UnorderedGroup_1__Impl ( rule__RgbaColor__UnorderedGroup_1__2 )? ;
    public final void rule__RgbaColor__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5027:1: ( rule__RgbaColor__UnorderedGroup_1__Impl ( rule__RgbaColor__UnorderedGroup_1__2 )? )
            // InternalMyUiDsl.g:5028:2: rule__RgbaColor__UnorderedGroup_1__Impl ( rule__RgbaColor__UnorderedGroup_1__2 )?
            {
            pushFollow(FOLLOW_45);
            rule__RgbaColor__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMyUiDsl.g:5029:2: ( rule__RgbaColor__UnorderedGroup_1__2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( LA39_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 3) ) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyUiDsl.g:5029:2: rule__RgbaColor__UnorderedGroup_1__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RgbaColor__UnorderedGroup_1__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RgbaColor__UnorderedGroup_1__1"


    // $ANTLR start "rule__RgbaColor__UnorderedGroup_1__2"
    // InternalMyUiDsl.g:5035:1: rule__RgbaColor__UnorderedGroup_1__2 : rule__RgbaColor__UnorderedGroup_1__Impl ( rule__RgbaColor__UnorderedGroup_1__3 )? ;
    public final void rule__RgbaColor__UnorderedGroup_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5039:1: ( rule__RgbaColor__UnorderedGroup_1__Impl ( rule__RgbaColor__UnorderedGroup_1__3 )? )
            // InternalMyUiDsl.g:5040:2: rule__RgbaColor__UnorderedGroup_1__Impl ( rule__RgbaColor__UnorderedGroup_1__3 )?
            {
            pushFollow(FOLLOW_45);
            rule__RgbaColor__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMyUiDsl.g:5041:2: ( rule__RgbaColor__UnorderedGroup_1__3 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 3) ) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyUiDsl.g:5041:2: rule__RgbaColor__UnorderedGroup_1__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RgbaColor__UnorderedGroup_1__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RgbaColor__UnorderedGroup_1__2"


    // $ANTLR start "rule__RgbaColor__UnorderedGroup_1__3"
    // InternalMyUiDsl.g:5047:1: rule__RgbaColor__UnorderedGroup_1__3 : rule__RgbaColor__UnorderedGroup_1__Impl ;
    public final void rule__RgbaColor__UnorderedGroup_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5051:1: ( rule__RgbaColor__UnorderedGroup_1__Impl )
            // InternalMyUiDsl.g:5052:2: rule__RgbaColor__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RgbaColor__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RgbaColor__UnorderedGroup_1__3"


    // $ANTLR start "rule__MinMaxValue__UnorderedGroup_1"
    // InternalMyUiDsl.g:5059:1: rule__MinMaxValue__UnorderedGroup_1 : ( rule__MinMaxValue__UnorderedGroup_1__0 )? ;
    public final void rule__MinMaxValue__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1());
        	
        try {
            // InternalMyUiDsl.g:5064:1: ( ( rule__MinMaxValue__UnorderedGroup_1__0 )? )
            // InternalMyUiDsl.g:5065:2: ( rule__MinMaxValue__UnorderedGroup_1__0 )?
            {
            // InternalMyUiDsl.g:5065:2: ( rule__MinMaxValue__UnorderedGroup_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 0) ) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyUiDsl.g:5065:2: rule__MinMaxValue__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MinMaxValue__UnorderedGroup_1__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMaxValue__UnorderedGroup_1"


    // $ANTLR start "rule__MinMaxValue__UnorderedGroup_1__Impl"
    // InternalMyUiDsl.g:5073:1: rule__MinMaxValue__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__MinMaxValue__MinValAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MinMaxValue__MaxValAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MinMaxValue__MidValAssignment_1_2 ) ) ) ) ) ;
    public final void rule__MinMaxValue__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMyUiDsl.g:5078:1: ( ( ({...}? => ( ( ( rule__MinMaxValue__MinValAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MinMaxValue__MaxValAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MinMaxValue__MidValAssignment_1_2 ) ) ) ) ) )
            // InternalMyUiDsl.g:5079:3: ( ({...}? => ( ( ( rule__MinMaxValue__MinValAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MinMaxValue__MaxValAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MinMaxValue__MidValAssignment_1_2 ) ) ) ) )
            {
            // InternalMyUiDsl.g:5079:3: ( ({...}? => ( ( ( rule__MinMaxValue__MinValAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MinMaxValue__MaxValAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MinMaxValue__MidValAssignment_1_2 ) ) ) ) )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( LA42_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 0) ) ) {
                int LA42_1 = input.LA(2);

                if ( ( LA42_1 == EOF || LA42_1 == RULE_INT || LA42_1 >= 25 && LA42_1 <= 27 || LA42_1 == 61 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 2) ) {
                    alt42=3;
                }
                else if ( LA42_1 == 94 && getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 1) ) {
                    alt42=2;
                }
                else if ( LA42_1 == 93 && getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 0) ) {
                    alt42=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyUiDsl.g:5080:3: ({...}? => ( ( ( rule__MinMaxValue__MinValAssignment_1_0 ) ) ) )
                    {
                    // InternalMyUiDsl.g:5080:3: ({...}? => ( ( ( rule__MinMaxValue__MinValAssignment_1_0 ) ) ) )
                    // InternalMyUiDsl.g:5081:4: {...}? => ( ( ( rule__MinMaxValue__MinValAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__MinMaxValue__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalMyUiDsl.g:5081:107: ( ( ( rule__MinMaxValue__MinValAssignment_1_0 ) ) )
                    // InternalMyUiDsl.g:5082:5: ( ( rule__MinMaxValue__MinValAssignment_1_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMyUiDsl.g:5088:5: ( ( rule__MinMaxValue__MinValAssignment_1_0 ) )
                    // InternalMyUiDsl.g:5089:6: ( rule__MinMaxValue__MinValAssignment_1_0 )
                    {
                     before(grammarAccess.getMinMaxValueAccess().getMinValAssignment_1_0()); 
                    // InternalMyUiDsl.g:5090:6: ( rule__MinMaxValue__MinValAssignment_1_0 )
                    // InternalMyUiDsl.g:5090:7: rule__MinMaxValue__MinValAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MinMaxValue__MinValAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMinMaxValueAccess().getMinValAssignment_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:5095:3: ({...}? => ( ( ( rule__MinMaxValue__MaxValAssignment_1_1 ) ) ) )
                    {
                    // InternalMyUiDsl.g:5095:3: ({...}? => ( ( ( rule__MinMaxValue__MaxValAssignment_1_1 ) ) ) )
                    // InternalMyUiDsl.g:5096:4: {...}? => ( ( ( rule__MinMaxValue__MaxValAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__MinMaxValue__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalMyUiDsl.g:5096:107: ( ( ( rule__MinMaxValue__MaxValAssignment_1_1 ) ) )
                    // InternalMyUiDsl.g:5097:5: ( ( rule__MinMaxValue__MaxValAssignment_1_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMyUiDsl.g:5103:5: ( ( rule__MinMaxValue__MaxValAssignment_1_1 ) )
                    // InternalMyUiDsl.g:5104:6: ( rule__MinMaxValue__MaxValAssignment_1_1 )
                    {
                     before(grammarAccess.getMinMaxValueAccess().getMaxValAssignment_1_1()); 
                    // InternalMyUiDsl.g:5105:6: ( rule__MinMaxValue__MaxValAssignment_1_1 )
                    // InternalMyUiDsl.g:5105:7: rule__MinMaxValue__MaxValAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MinMaxValue__MaxValAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMinMaxValueAccess().getMaxValAssignment_1_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:5110:3: ({...}? => ( ( ( rule__MinMaxValue__MidValAssignment_1_2 ) ) ) )
                    {
                    // InternalMyUiDsl.g:5110:3: ({...}? => ( ( ( rule__MinMaxValue__MidValAssignment_1_2 ) ) ) )
                    // InternalMyUiDsl.g:5111:4: {...}? => ( ( ( rule__MinMaxValue__MidValAssignment_1_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__MinMaxValue__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 2)");
                    }
                    // InternalMyUiDsl.g:5111:107: ( ( ( rule__MinMaxValue__MidValAssignment_1_2 ) ) )
                    // InternalMyUiDsl.g:5112:5: ( ( rule__MinMaxValue__MidValAssignment_1_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 2);
                    				

                    					selected = true;
                    				
                    // InternalMyUiDsl.g:5118:5: ( ( rule__MinMaxValue__MidValAssignment_1_2 ) )
                    // InternalMyUiDsl.g:5119:6: ( rule__MinMaxValue__MidValAssignment_1_2 )
                    {
                     before(grammarAccess.getMinMaxValueAccess().getMidValAssignment_1_2()); 
                    // InternalMyUiDsl.g:5120:6: ( rule__MinMaxValue__MidValAssignment_1_2 )
                    // InternalMyUiDsl.g:5120:7: rule__MinMaxValue__MidValAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MinMaxValue__MidValAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMinMaxValueAccess().getMidValAssignment_1_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMaxValue__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__MinMaxValue__UnorderedGroup_1__0"
    // InternalMyUiDsl.g:5133:1: rule__MinMaxValue__UnorderedGroup_1__0 : rule__MinMaxValue__UnorderedGroup_1__Impl ( rule__MinMaxValue__UnorderedGroup_1__1 )? ;
    public final void rule__MinMaxValue__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5137:1: ( rule__MinMaxValue__UnorderedGroup_1__Impl ( rule__MinMaxValue__UnorderedGroup_1__1 )? )
            // InternalMyUiDsl.g:5138:2: rule__MinMaxValue__UnorderedGroup_1__Impl ( rule__MinMaxValue__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_45);
            rule__MinMaxValue__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMyUiDsl.g:5139:2: ( rule__MinMaxValue__UnorderedGroup_1__1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( LA43_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 0) ) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyUiDsl.g:5139:2: rule__MinMaxValue__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MinMaxValue__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMaxValue__UnorderedGroup_1__0"


    // $ANTLR start "rule__MinMaxValue__UnorderedGroup_1__1"
    // InternalMyUiDsl.g:5145:1: rule__MinMaxValue__UnorderedGroup_1__1 : rule__MinMaxValue__UnorderedGroup_1__Impl ( rule__MinMaxValue__UnorderedGroup_1__2 )? ;
    public final void rule__MinMaxValue__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5149:1: ( rule__MinMaxValue__UnorderedGroup_1__Impl ( rule__MinMaxValue__UnorderedGroup_1__2 )? )
            // InternalMyUiDsl.g:5150:2: rule__MinMaxValue__UnorderedGroup_1__Impl ( rule__MinMaxValue__UnorderedGroup_1__2 )?
            {
            pushFollow(FOLLOW_45);
            rule__MinMaxValue__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMyUiDsl.g:5151:2: ( rule__MinMaxValue__UnorderedGroup_1__2 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( LA44_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 0) ) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyUiDsl.g:5151:2: rule__MinMaxValue__UnorderedGroup_1__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MinMaxValue__UnorderedGroup_1__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMaxValue__UnorderedGroup_1__1"


    // $ANTLR start "rule__MinMaxValue__UnorderedGroup_1__2"
    // InternalMyUiDsl.g:5157:1: rule__MinMaxValue__UnorderedGroup_1__2 : rule__MinMaxValue__UnorderedGroup_1__Impl ;
    public final void rule__MinMaxValue__UnorderedGroup_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5161:1: ( rule__MinMaxValue__UnorderedGroup_1__Impl )
            // InternalMyUiDsl.g:5162:2: rule__MinMaxValue__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxValue__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMaxValue__UnorderedGroup_1__2"


    // $ANTLR start "rule__FourAspect__UnorderedGroup_1"
    // InternalMyUiDsl.g:5169:1: rule__FourAspect__UnorderedGroup_1 : ( rule__FourAspect__UnorderedGroup_1__0 )? ;
    public final void rule__FourAspect__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getFourAspectAccess().getUnorderedGroup_1());
        	
        try {
            // InternalMyUiDsl.g:5174:1: ( ( rule__FourAspect__UnorderedGroup_1__0 )? )
            // InternalMyUiDsl.g:5175:2: ( rule__FourAspect__UnorderedGroup_1__0 )?
            {
            // InternalMyUiDsl.g:5175:2: ( rule__FourAspect__UnorderedGroup_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( LA45_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 0) ) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyUiDsl.g:5175:2: rule__FourAspect__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FourAspect__UnorderedGroup_1__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getFourAspectAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FourAspect__UnorderedGroup_1"


    // $ANTLR start "rule__FourAspect__UnorderedGroup_1__Impl"
    // InternalMyUiDsl.g:5183:1: rule__FourAspect__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__FourAspect__LeftAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__FourAspect__RightAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__FourAspect__UpAssignment_1_2 ) ) ) ) | ({...}? => ( ( ( rule__FourAspect__DownAssignment_1_3 ) ) ) ) ) ;
    public final void rule__FourAspect__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMyUiDsl.g:5188:1: ( ( ({...}? => ( ( ( rule__FourAspect__LeftAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__FourAspect__RightAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__FourAspect__UpAssignment_1_2 ) ) ) ) | ({...}? => ( ( ( rule__FourAspect__DownAssignment_1_3 ) ) ) ) ) )
            // InternalMyUiDsl.g:5189:3: ( ({...}? => ( ( ( rule__FourAspect__LeftAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__FourAspect__RightAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__FourAspect__UpAssignment_1_2 ) ) ) ) | ({...}? => ( ( ( rule__FourAspect__DownAssignment_1_3 ) ) ) ) )
            {
            // InternalMyUiDsl.g:5189:3: ( ({...}? => ( ( ( rule__FourAspect__LeftAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__FourAspect__RightAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__FourAspect__UpAssignment_1_2 ) ) ) ) | ({...}? => ( ( ( rule__FourAspect__DownAssignment_1_3 ) ) ) ) )
            int alt46=4;
            int LA46_0 = input.LA(1);

            if ( LA46_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 0) ) ) {
                int LA46_1 = input.LA(2);

                if ( LA46_1 == 98 && getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 3) ) {
                    alt46=4;
                }
                else if ( LA46_1 == 97 && getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 2) ) {
                    alt46=3;
                }
                else if ( LA46_1 == 96 && getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 1) ) {
                    alt46=2;
                }
                else if ( LA46_1 == 95 && getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 0) ) {
                    alt46=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyUiDsl.g:5190:3: ({...}? => ( ( ( rule__FourAspect__LeftAssignment_1_0 ) ) ) )
                    {
                    // InternalMyUiDsl.g:5190:3: ({...}? => ( ( ( rule__FourAspect__LeftAssignment_1_0 ) ) ) )
                    // InternalMyUiDsl.g:5191:4: {...}? => ( ( ( rule__FourAspect__LeftAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__FourAspect__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalMyUiDsl.g:5191:106: ( ( ( rule__FourAspect__LeftAssignment_1_0 ) ) )
                    // InternalMyUiDsl.g:5192:5: ( ( rule__FourAspect__LeftAssignment_1_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMyUiDsl.g:5198:5: ( ( rule__FourAspect__LeftAssignment_1_0 ) )
                    // InternalMyUiDsl.g:5199:6: ( rule__FourAspect__LeftAssignment_1_0 )
                    {
                     before(grammarAccess.getFourAspectAccess().getLeftAssignment_1_0()); 
                    // InternalMyUiDsl.g:5200:6: ( rule__FourAspect__LeftAssignment_1_0 )
                    // InternalMyUiDsl.g:5200:7: rule__FourAspect__LeftAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FourAspect__LeftAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFourAspectAccess().getLeftAssignment_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:5205:3: ({...}? => ( ( ( rule__FourAspect__RightAssignment_1_1 ) ) ) )
                    {
                    // InternalMyUiDsl.g:5205:3: ({...}? => ( ( ( rule__FourAspect__RightAssignment_1_1 ) ) ) )
                    // InternalMyUiDsl.g:5206:4: {...}? => ( ( ( rule__FourAspect__RightAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__FourAspect__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalMyUiDsl.g:5206:106: ( ( ( rule__FourAspect__RightAssignment_1_1 ) ) )
                    // InternalMyUiDsl.g:5207:5: ( ( rule__FourAspect__RightAssignment_1_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMyUiDsl.g:5213:5: ( ( rule__FourAspect__RightAssignment_1_1 ) )
                    // InternalMyUiDsl.g:5214:6: ( rule__FourAspect__RightAssignment_1_1 )
                    {
                     before(grammarAccess.getFourAspectAccess().getRightAssignment_1_1()); 
                    // InternalMyUiDsl.g:5215:6: ( rule__FourAspect__RightAssignment_1_1 )
                    // InternalMyUiDsl.g:5215:7: rule__FourAspect__RightAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FourAspect__RightAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFourAspectAccess().getRightAssignment_1_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:5220:3: ({...}? => ( ( ( rule__FourAspect__UpAssignment_1_2 ) ) ) )
                    {
                    // InternalMyUiDsl.g:5220:3: ({...}? => ( ( ( rule__FourAspect__UpAssignment_1_2 ) ) ) )
                    // InternalMyUiDsl.g:5221:4: {...}? => ( ( ( rule__FourAspect__UpAssignment_1_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__FourAspect__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 2)");
                    }
                    // InternalMyUiDsl.g:5221:106: ( ( ( rule__FourAspect__UpAssignment_1_2 ) ) )
                    // InternalMyUiDsl.g:5222:5: ( ( rule__FourAspect__UpAssignment_1_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 2);
                    				

                    					selected = true;
                    				
                    // InternalMyUiDsl.g:5228:5: ( ( rule__FourAspect__UpAssignment_1_2 ) )
                    // InternalMyUiDsl.g:5229:6: ( rule__FourAspect__UpAssignment_1_2 )
                    {
                     before(grammarAccess.getFourAspectAccess().getUpAssignment_1_2()); 
                    // InternalMyUiDsl.g:5230:6: ( rule__FourAspect__UpAssignment_1_2 )
                    // InternalMyUiDsl.g:5230:7: rule__FourAspect__UpAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FourAspect__UpAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFourAspectAccess().getUpAssignment_1_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:5235:3: ({...}? => ( ( ( rule__FourAspect__DownAssignment_1_3 ) ) ) )
                    {
                    // InternalMyUiDsl.g:5235:3: ({...}? => ( ( ( rule__FourAspect__DownAssignment_1_3 ) ) ) )
                    // InternalMyUiDsl.g:5236:4: {...}? => ( ( ( rule__FourAspect__DownAssignment_1_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 3) ) {
                        throw new FailedPredicateException(input, "rule__FourAspect__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 3)");
                    }
                    // InternalMyUiDsl.g:5236:106: ( ( ( rule__FourAspect__DownAssignment_1_3 ) ) )
                    // InternalMyUiDsl.g:5237:5: ( ( rule__FourAspect__DownAssignment_1_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 3);
                    				

                    					selected = true;
                    				
                    // InternalMyUiDsl.g:5243:5: ( ( rule__FourAspect__DownAssignment_1_3 ) )
                    // InternalMyUiDsl.g:5244:6: ( rule__FourAspect__DownAssignment_1_3 )
                    {
                     before(grammarAccess.getFourAspectAccess().getDownAssignment_1_3()); 
                    // InternalMyUiDsl.g:5245:6: ( rule__FourAspect__DownAssignment_1_3 )
                    // InternalMyUiDsl.g:5245:7: rule__FourAspect__DownAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FourAspect__DownAssignment_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFourAspectAccess().getDownAssignment_1_3()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFourAspectAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FourAspect__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__FourAspect__UnorderedGroup_1__0"
    // InternalMyUiDsl.g:5258:1: rule__FourAspect__UnorderedGroup_1__0 : rule__FourAspect__UnorderedGroup_1__Impl ( rule__FourAspect__UnorderedGroup_1__1 )? ;
    public final void rule__FourAspect__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5262:1: ( rule__FourAspect__UnorderedGroup_1__Impl ( rule__FourAspect__UnorderedGroup_1__1 )? )
            // InternalMyUiDsl.g:5263:2: rule__FourAspect__UnorderedGroup_1__Impl ( rule__FourAspect__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_45);
            rule__FourAspect__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMyUiDsl.g:5264:2: ( rule__FourAspect__UnorderedGroup_1__1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( LA47_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 0) ) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyUiDsl.g:5264:2: rule__FourAspect__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FourAspect__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FourAspect__UnorderedGroup_1__0"


    // $ANTLR start "rule__FourAspect__UnorderedGroup_1__1"
    // InternalMyUiDsl.g:5270:1: rule__FourAspect__UnorderedGroup_1__1 : rule__FourAspect__UnorderedGroup_1__Impl ( rule__FourAspect__UnorderedGroup_1__2 )? ;
    public final void rule__FourAspect__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5274:1: ( rule__FourAspect__UnorderedGroup_1__Impl ( rule__FourAspect__UnorderedGroup_1__2 )? )
            // InternalMyUiDsl.g:5275:2: rule__FourAspect__UnorderedGroup_1__Impl ( rule__FourAspect__UnorderedGroup_1__2 )?
            {
            pushFollow(FOLLOW_45);
            rule__FourAspect__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMyUiDsl.g:5276:2: ( rule__FourAspect__UnorderedGroup_1__2 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( LA48_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 0) ) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyUiDsl.g:5276:2: rule__FourAspect__UnorderedGroup_1__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FourAspect__UnorderedGroup_1__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FourAspect__UnorderedGroup_1__1"


    // $ANTLR start "rule__FourAspect__UnorderedGroup_1__2"
    // InternalMyUiDsl.g:5282:1: rule__FourAspect__UnorderedGroup_1__2 : rule__FourAspect__UnorderedGroup_1__Impl ( rule__FourAspect__UnorderedGroup_1__3 )? ;
    public final void rule__FourAspect__UnorderedGroup_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5286:1: ( rule__FourAspect__UnorderedGroup_1__Impl ( rule__FourAspect__UnorderedGroup_1__3 )? )
            // InternalMyUiDsl.g:5287:2: rule__FourAspect__UnorderedGroup_1__Impl ( rule__FourAspect__UnorderedGroup_1__3 )?
            {
            pushFollow(FOLLOW_45);
            rule__FourAspect__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMyUiDsl.g:5288:2: ( rule__FourAspect__UnorderedGroup_1__3 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( LA49_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 0) ) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyUiDsl.g:5288:2: rule__FourAspect__UnorderedGroup_1__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FourAspect__UnorderedGroup_1__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FourAspect__UnorderedGroup_1__2"


    // $ANTLR start "rule__FourAspect__UnorderedGroup_1__3"
    // InternalMyUiDsl.g:5294:1: rule__FourAspect__UnorderedGroup_1__3 : rule__FourAspect__UnorderedGroup_1__Impl ;
    public final void rule__FourAspect__UnorderedGroup_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5298:1: ( rule__FourAspect__UnorderedGroup_1__Impl )
            // InternalMyUiDsl.g:5299:2: rule__FourAspect__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FourAspect__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FourAspect__UnorderedGroup_1__3"


    // $ANTLR start "rule__Model__HeadsAssignment_0"
    // InternalMyUiDsl.g:5306:1: rule__Model__HeadsAssignment_0 : ( ruleHead ) ;
    public final void rule__Model__HeadsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5310:1: ( ( ruleHead ) )
            // InternalMyUiDsl.g:5311:2: ( ruleHead )
            {
            // InternalMyUiDsl.g:5311:2: ( ruleHead )
            // InternalMyUiDsl.g:5312:3: ruleHead
            {
             before(grammarAccess.getModelAccess().getHeadsHeadParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHead();

            state._fsp--;

             after(grammarAccess.getModelAccess().getHeadsHeadParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__HeadsAssignment_0"


    // $ANTLR start "rule__Model__BodisAssignment_2"
    // InternalMyUiDsl.g:5321:1: rule__Model__BodisAssignment_2 : ( ruleBody ) ;
    public final void rule__Model__BodisAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5325:1: ( ( ruleBody ) )
            // InternalMyUiDsl.g:5326:2: ( ruleBody )
            {
            // InternalMyUiDsl.g:5326:2: ( ruleBody )
            // InternalMyUiDsl.g:5327:3: ruleBody
            {
             before(grammarAccess.getModelAccess().getBodisBodyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBodisBodyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__BodisAssignment_2"


    // $ANTLR start "rule__Model__AccessoriesAssignment_4"
    // InternalMyUiDsl.g:5336:1: rule__Model__AccessoriesAssignment_4 : ( ruleAccessory ) ;
    public final void rule__Model__AccessoriesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5340:1: ( ( ruleAccessory ) )
            // InternalMyUiDsl.g:5341:2: ( ruleAccessory )
            {
            // InternalMyUiDsl.g:5341:2: ( ruleAccessory )
            // InternalMyUiDsl.g:5342:3: ruleAccessory
            {
             before(grammarAccess.getModelAccess().getAccessoriesAccessoryParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAccessory();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAccessoriesAccessoryParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AccessoriesAssignment_4"


    // $ANTLR start "rule__Head__FileNameAssignment_1"
    // InternalMyUiDsl.g:5351:1: rule__Head__FileNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Head__FileNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5355:1: ( ( RULE_ID ) )
            // InternalMyUiDsl.g:5356:2: ( RULE_ID )
            {
            // InternalMyUiDsl.g:5356:2: ( RULE_ID )
            // InternalMyUiDsl.g:5357:3: RULE_ID
            {
             before(grammarAccess.getHeadAccess().getFileNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHeadAccess().getFileNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__FileNameAssignment_1"


    // $ANTLR start "rule__Head__HeadTypeAssignment_3"
    // InternalMyUiDsl.g:5366:1: rule__Head__HeadTypeAssignment_3 : ( ruleHeadType ) ;
    public final void rule__Head__HeadTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5370:1: ( ( ruleHeadType ) )
            // InternalMyUiDsl.g:5371:2: ( ruleHeadType )
            {
            // InternalMyUiDsl.g:5371:2: ( ruleHeadType )
            // InternalMyUiDsl.g:5372:3: ruleHeadType
            {
             before(grammarAccess.getHeadAccess().getHeadTypeHeadTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleHeadType();

            state._fsp--;

             after(grammarAccess.getHeadAccess().getHeadTypeHeadTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__HeadTypeAssignment_3"


    // $ANTLR start "rule__Body__NameAssignment_0"
    // InternalMyUiDsl.g:5381:1: rule__Body__NameAssignment_0 : ( ruleNode ) ;
    public final void rule__Body__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5385:1: ( ( ruleNode ) )
            // InternalMyUiDsl.g:5386:2: ( ruleNode )
            {
            // InternalMyUiDsl.g:5386:2: ( ruleNode )
            // InternalMyUiDsl.g:5387:3: ruleNode
            {
             before(grammarAccess.getBodyAccess().getNameNodeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getNameNodeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__NameAssignment_0"


    // $ANTLR start "rule__Body__RightAssignment_2"
    // InternalMyUiDsl.g:5396:1: rule__Body__RightAssignment_2 : ( ruleNode ) ;
    public final void rule__Body__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5400:1: ( ( ruleNode ) )
            // InternalMyUiDsl.g:5401:2: ( ruleNode )
            {
            // InternalMyUiDsl.g:5401:2: ( ruleNode )
            // InternalMyUiDsl.g:5402:3: ruleNode
            {
             before(grammarAccess.getBodyAccess().getRightNodeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getRightNodeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__RightAssignment_2"


    // $ANTLR start "rule__Body__SelfRepeatAssignment_3"
    // InternalMyUiDsl.g:5411:1: rule__Body__SelfRepeatAssignment_3 : ( ruleSelfRepeat ) ;
    public final void rule__Body__SelfRepeatAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5415:1: ( ( ruleSelfRepeat ) )
            // InternalMyUiDsl.g:5416:2: ( ruleSelfRepeat )
            {
            // InternalMyUiDsl.g:5416:2: ( ruleSelfRepeat )
            // InternalMyUiDsl.g:5417:3: ruleSelfRepeat
            {
             before(grammarAccess.getBodyAccess().getSelfRepeatSelfRepeatParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSelfRepeat();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getSelfRepeatSelfRepeatParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__SelfRepeatAssignment_3"


    // $ANTLR start "rule__Node__NameAssignment"
    // InternalMyUiDsl.g:5426:1: rule__Node__NameAssignment : ( RULE_ONECHAR ) ;
    public final void rule__Node__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5430:1: ( ( RULE_ONECHAR ) )
            // InternalMyUiDsl.g:5431:2: ( RULE_ONECHAR )
            {
            // InternalMyUiDsl.g:5431:2: ( RULE_ONECHAR )
            // InternalMyUiDsl.g:5432:3: RULE_ONECHAR
            {
             before(grammarAccess.getNodeAccess().getNameOneCharTerminalRuleCall_0()); 
            match(input,RULE_ONECHAR,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameOneCharTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment"


    // $ANTLR start "rule__SelfRepeat__NumberAssignment_0"
    // InternalMyUiDsl.g:5441:1: rule__SelfRepeat__NumberAssignment_0 : ( RULE_INT ) ;
    public final void rule__SelfRepeat__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5445:1: ( ( RULE_INT ) )
            // InternalMyUiDsl.g:5446:2: ( RULE_INT )
            {
            // InternalMyUiDsl.g:5446:2: ( RULE_INT )
            // InternalMyUiDsl.g:5447:3: RULE_INT
            {
             before(grammarAccess.getSelfRepeatAccess().getNumberINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSelfRepeatAccess().getNumberINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfRepeat__NumberAssignment_0"


    // $ANTLR start "rule__SelfRepeat__VerticalAssignment_1"
    // InternalMyUiDsl.g:5456:1: rule__SelfRepeat__VerticalAssignment_1 : ( ( '*' ) ) ;
    public final void rule__SelfRepeat__VerticalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5460:1: ( ( ( '*' ) ) )
            // InternalMyUiDsl.g:5461:2: ( ( '*' ) )
            {
            // InternalMyUiDsl.g:5461:2: ( ( '*' ) )
            // InternalMyUiDsl.g:5462:3: ( '*' )
            {
             before(grammarAccess.getSelfRepeatAccess().getVerticalAsteriskKeyword_1_0()); 
            // InternalMyUiDsl.g:5463:3: ( '*' )
            // InternalMyUiDsl.g:5464:4: '*'
            {
             before(grammarAccess.getSelfRepeatAccess().getVerticalAsteriskKeyword_1_0()); 
            match(input,99,FOLLOW_2); 
             after(grammarAccess.getSelfRepeatAccess().getVerticalAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getSelfRepeatAccess().getVerticalAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfRepeat__VerticalAssignment_1"


    // $ANTLR start "rule__Accessory__LeftAssignment_0"
    // InternalMyUiDsl.g:5475:1: rule__Accessory__LeftAssignment_0 : ( ruleNode ) ;
    public final void rule__Accessory__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5479:1: ( ( ruleNode ) )
            // InternalMyUiDsl.g:5480:2: ( ruleNode )
            {
            // InternalMyUiDsl.g:5480:2: ( ruleNode )
            // InternalMyUiDsl.g:5481:3: ruleNode
            {
             before(grammarAccess.getAccessoryAccess().getLeftNodeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getAccessoryAccess().getLeftNodeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__LeftAssignment_0"


    // $ANTLR start "rule__Accessory__TextAssignment_2_0"
    // InternalMyUiDsl.g:5490:1: rule__Accessory__TextAssignment_2_0 : ( ruleInnerText ) ;
    public final void rule__Accessory__TextAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5494:1: ( ( ruleInnerText ) )
            // InternalMyUiDsl.g:5495:2: ( ruleInnerText )
            {
            // InternalMyUiDsl.g:5495:2: ( ruleInnerText )
            // InternalMyUiDsl.g:5496:3: ruleInnerText
            {
             before(grammarAccess.getAccessoryAccess().getTextInnerTextParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInnerText();

            state._fsp--;

             after(grammarAccess.getAccessoryAccess().getTextInnerTextParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__TextAssignment_2_0"


    // $ANTLR start "rule__Accessory__StyleAssignment_2_1"
    // InternalMyUiDsl.g:5505:1: rule__Accessory__StyleAssignment_2_1 : ( ruleInnerStyle ) ;
    public final void rule__Accessory__StyleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5509:1: ( ( ruleInnerStyle ) )
            // InternalMyUiDsl.g:5510:2: ( ruleInnerStyle )
            {
            // InternalMyUiDsl.g:5510:2: ( ruleInnerStyle )
            // InternalMyUiDsl.g:5511:3: ruleInnerStyle
            {
             before(grammarAccess.getAccessoryAccess().getStyleInnerStyleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInnerStyle();

            state._fsp--;

             after(grammarAccess.getAccessoryAccess().getStyleInnerStyleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__StyleAssignment_2_1"


    // $ANTLR start "rule__Accessory__ClazzAssignment_2_2"
    // InternalMyUiDsl.g:5520:1: rule__Accessory__ClazzAssignment_2_2 : ( ruleInnerClass ) ;
    public final void rule__Accessory__ClazzAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5524:1: ( ( ruleInnerClass ) )
            // InternalMyUiDsl.g:5525:2: ( ruleInnerClass )
            {
            // InternalMyUiDsl.g:5525:2: ( ruleInnerClass )
            // InternalMyUiDsl.g:5526:3: ruleInnerClass
            {
             before(grammarAccess.getAccessoryAccess().getClazzInnerClassParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInnerClass();

            state._fsp--;

             after(grammarAccess.getAccessoryAccess().getClazzInnerClassParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__ClazzAssignment_2_2"


    // $ANTLR start "rule__Accessory__TypeAssignment_2_3"
    // InternalMyUiDsl.g:5535:1: rule__Accessory__TypeAssignment_2_3 : ( ruleInnerType ) ;
    public final void rule__Accessory__TypeAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5539:1: ( ( ruleInnerType ) )
            // InternalMyUiDsl.g:5540:2: ( ruleInnerType )
            {
            // InternalMyUiDsl.g:5540:2: ( ruleInnerType )
            // InternalMyUiDsl.g:5541:3: ruleInnerType
            {
             before(grammarAccess.getAccessoryAccess().getTypeInnerTypeParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInnerType();

            state._fsp--;

             after(grammarAccess.getAccessoryAccess().getTypeInnerTypeParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__TypeAssignment_2_3"


    // $ANTLR start "rule__Accessory__FeatureAssignment_2_4"
    // InternalMyUiDsl.g:5550:1: rule__Accessory__FeatureAssignment_2_4 : ( ruleInnerFeature ) ;
    public final void rule__Accessory__FeatureAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5554:1: ( ( ruleInnerFeature ) )
            // InternalMyUiDsl.g:5555:2: ( ruleInnerFeature )
            {
            // InternalMyUiDsl.g:5555:2: ( ruleInnerFeature )
            // InternalMyUiDsl.g:5556:3: ruleInnerFeature
            {
             before(grammarAccess.getAccessoryAccess().getFeatureInnerFeatureParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInnerFeature();

            state._fsp--;

             after(grammarAccess.getAccessoryAccess().getFeatureInnerFeatureParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accessory__FeatureAssignment_2_4"


    // $ANTLR start "rule__InnerFeature__ValueAssignment_1"
    // InternalMyUiDsl.g:5565:1: rule__InnerFeature__ValueAssignment_1 : ( RULE_STRING2 ) ;
    public final void rule__InnerFeature__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5569:1: ( ( RULE_STRING2 ) )
            // InternalMyUiDsl.g:5570:2: ( RULE_STRING2 )
            {
            // InternalMyUiDsl.g:5570:2: ( RULE_STRING2 )
            // InternalMyUiDsl.g:5571:3: RULE_STRING2
            {
             before(grammarAccess.getInnerFeatureAccess().getValueSTRING2TerminalRuleCall_1_0()); 
            match(input,RULE_STRING2,FOLLOW_2); 
             after(grammarAccess.getInnerFeatureAccess().getValueSTRING2TerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerFeature__ValueAssignment_1"


    // $ANTLR start "rule__InnerText__ValueAssignment_1"
    // InternalMyUiDsl.g:5580:1: rule__InnerText__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__InnerText__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5584:1: ( ( RULE_ID ) )
            // InternalMyUiDsl.g:5585:2: ( RULE_ID )
            {
            // InternalMyUiDsl.g:5585:2: ( RULE_ID )
            // InternalMyUiDsl.g:5586:3: RULE_ID
            {
             before(grammarAccess.getInnerTextAccess().getValueIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInnerTextAccess().getValueIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerText__ValueAssignment_1"


    // $ANTLR start "rule__InnerStyle__StylesAssignment_2"
    // InternalMyUiDsl.g:5595:1: rule__InnerStyle__StylesAssignment_2 : ( ruleCssStyle ) ;
    public final void rule__InnerStyle__StylesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5599:1: ( ( ruleCssStyle ) )
            // InternalMyUiDsl.g:5600:2: ( ruleCssStyle )
            {
            // InternalMyUiDsl.g:5600:2: ( ruleCssStyle )
            // InternalMyUiDsl.g:5601:3: ruleCssStyle
            {
             before(grammarAccess.getInnerStyleAccess().getStylesCssStyleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCssStyle();

            state._fsp--;

             after(grammarAccess.getInnerStyleAccess().getStylesCssStyleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerStyle__StylesAssignment_2"


    // $ANTLR start "rule__InnerClass__ClazzesAssignment_1"
    // InternalMyUiDsl.g:5610:1: rule__InnerClass__ClazzesAssignment_1 : ( ruleClassName ) ;
    public final void rule__InnerClass__ClazzesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5614:1: ( ( ruleClassName ) )
            // InternalMyUiDsl.g:5615:2: ( ruleClassName )
            {
            // InternalMyUiDsl.g:5615:2: ( ruleClassName )
            // InternalMyUiDsl.g:5616:3: ruleClassName
            {
             before(grammarAccess.getInnerClassAccess().getClazzesClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getInnerClassAccess().getClazzesClassNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerClass__ClazzesAssignment_1"


    // $ANTLR start "rule__ClassName__TheIdAssignment_0"
    // InternalMyUiDsl.g:5625:1: rule__ClassName__TheIdAssignment_0 : ( RULE_ID ) ;
    public final void rule__ClassName__TheIdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5629:1: ( ( RULE_ID ) )
            // InternalMyUiDsl.g:5630:2: ( RULE_ID )
            {
            // InternalMyUiDsl.g:5630:2: ( RULE_ID )
            // InternalMyUiDsl.g:5631:3: RULE_ID
            {
             before(grammarAccess.getClassNameAccess().getTheIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassNameAccess().getTheIdIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassName__TheIdAssignment_0"


    // $ANTLR start "rule__ClassName__ClazzAssignment_1"
    // InternalMyUiDsl.g:5640:1: rule__ClassName__ClazzAssignment_1 : ( ruleClassNameSec ) ;
    public final void rule__ClassName__ClazzAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5644:1: ( ( ruleClassNameSec ) )
            // InternalMyUiDsl.g:5645:2: ( ruleClassNameSec )
            {
            // InternalMyUiDsl.g:5645:2: ( ruleClassNameSec )
            // InternalMyUiDsl.g:5646:3: ruleClassNameSec
            {
             before(grammarAccess.getClassNameAccess().getClazzClassNameSecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassNameSec();

            state._fsp--;

             after(grammarAccess.getClassNameAccess().getClazzClassNameSecParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassName__ClazzAssignment_1"


    // $ANTLR start "rule__ClassNameSec__CfClazzAssignment_1"
    // InternalMyUiDsl.g:5655:1: rule__ClassNameSec__CfClazzAssignment_1 : ( RULE_ID ) ;
    public final void rule__ClassNameSec__CfClazzAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5659:1: ( ( RULE_ID ) )
            // InternalMyUiDsl.g:5660:2: ( RULE_ID )
            {
            // InternalMyUiDsl.g:5660:2: ( RULE_ID )
            // InternalMyUiDsl.g:5661:3: RULE_ID
            {
             before(grammarAccess.getClassNameSecAccess().getCfClazzIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassNameSecAccess().getCfClazzIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassNameSec__CfClazzAssignment_1"


    // $ANTLR start "rule__InnerType__ValueAssignment_1"
    // InternalMyUiDsl.g:5670:1: rule__InnerType__ValueAssignment_1 : ( ruleInnerTypeArray ) ;
    public final void rule__InnerType__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5674:1: ( ( ruleInnerTypeArray ) )
            // InternalMyUiDsl.g:5675:2: ( ruleInnerTypeArray )
            {
            // InternalMyUiDsl.g:5675:2: ( ruleInnerTypeArray )
            // InternalMyUiDsl.g:5676:3: ruleInnerTypeArray
            {
             before(grammarAccess.getInnerTypeAccess().getValueInnerTypeArrayEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInnerTypeArray();

            state._fsp--;

             after(grammarAccess.getInnerTypeAccess().getValueInnerTypeArrayEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerType__ValueAssignment_1"


    // $ANTLR start "rule__Border__ValueAssignment_1"
    // InternalMyUiDsl.g:5685:1: rule__Border__ValueAssignment_1 : ( rulecolorDef ) ;
    public final void rule__Border__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5689:1: ( ( rulecolorDef ) )
            // InternalMyUiDsl.g:5690:2: ( rulecolorDef )
            {
            // InternalMyUiDsl.g:5690:2: ( rulecolorDef )
            // InternalMyUiDsl.g:5691:3: rulecolorDef
            {
             before(grammarAccess.getBorderAccess().getValueColorDefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulecolorDef();

            state._fsp--;

             after(grammarAccess.getBorderAccess().getValueColorDefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Border__ValueAssignment_1"


    // $ANTLR start "rule__Color__ValueAssignment_1"
    // InternalMyUiDsl.g:5700:1: rule__Color__ValueAssignment_1 : ( rulecolorDef ) ;
    public final void rule__Color__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5704:1: ( ( rulecolorDef ) )
            // InternalMyUiDsl.g:5705:2: ( rulecolorDef )
            {
            // InternalMyUiDsl.g:5705:2: ( rulecolorDef )
            // InternalMyUiDsl.g:5706:3: rulecolorDef
            {
             before(grammarAccess.getColorAccess().getValueColorDefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulecolorDef();

            state._fsp--;

             after(grammarAccess.getColorAccess().getValueColorDefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__ValueAssignment_1"


    // $ANTLR start "rule__BackColor__ValueAssignment_1"
    // InternalMyUiDsl.g:5715:1: rule__BackColor__ValueAssignment_1 : ( rulecolorDef ) ;
    public final void rule__BackColor__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5719:1: ( ( rulecolorDef ) )
            // InternalMyUiDsl.g:5720:2: ( rulecolorDef )
            {
            // InternalMyUiDsl.g:5720:2: ( rulecolorDef )
            // InternalMyUiDsl.g:5721:3: rulecolorDef
            {
             before(grammarAccess.getBackColorAccess().getValueColorDefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulecolorDef();

            state._fsp--;

             after(grammarAccess.getBackColorAccess().getValueColorDefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackColor__ValueAssignment_1"


    // $ANTLR start "rule__LiteralColor__ValueAssignment"
    // InternalMyUiDsl.g:5730:1: rule__LiteralColor__ValueAssignment : ( ( rule__LiteralColor__ValueAlternatives_0 ) ) ;
    public final void rule__LiteralColor__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5734:1: ( ( ( rule__LiteralColor__ValueAlternatives_0 ) ) )
            // InternalMyUiDsl.g:5735:2: ( ( rule__LiteralColor__ValueAlternatives_0 ) )
            {
            // InternalMyUiDsl.g:5735:2: ( ( rule__LiteralColor__ValueAlternatives_0 ) )
            // InternalMyUiDsl.g:5736:3: ( rule__LiteralColor__ValueAlternatives_0 )
            {
             before(grammarAccess.getLiteralColorAccess().getValueAlternatives_0()); 
            // InternalMyUiDsl.g:5737:3: ( rule__LiteralColor__ValueAlternatives_0 )
            // InternalMyUiDsl.g:5737:4: rule__LiteralColor__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__LiteralColor__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getLiteralColorAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralColor__ValueAssignment"


    // $ANTLR start "rule__RgbaColor__RvalAssignment_1_0"
    // InternalMyUiDsl.g:5745:1: rule__RgbaColor__RvalAssignment_1_0 : ( ruleRval ) ;
    public final void rule__RgbaColor__RvalAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5749:1: ( ( ruleRval ) )
            // InternalMyUiDsl.g:5750:2: ( ruleRval )
            {
            // InternalMyUiDsl.g:5750:2: ( ruleRval )
            // InternalMyUiDsl.g:5751:3: ruleRval
            {
             before(grammarAccess.getRgbaColorAccess().getRvalRvalParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRval();

            state._fsp--;

             after(grammarAccess.getRgbaColorAccess().getRvalRvalParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RgbaColor__RvalAssignment_1_0"


    // $ANTLR start "rule__RgbaColor__GvalAssignment_1_1"
    // InternalMyUiDsl.g:5760:1: rule__RgbaColor__GvalAssignment_1_1 : ( ruleGval ) ;
    public final void rule__RgbaColor__GvalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5764:1: ( ( ruleGval ) )
            // InternalMyUiDsl.g:5765:2: ( ruleGval )
            {
            // InternalMyUiDsl.g:5765:2: ( ruleGval )
            // InternalMyUiDsl.g:5766:3: ruleGval
            {
             before(grammarAccess.getRgbaColorAccess().getGvalGvalParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGval();

            state._fsp--;

             after(grammarAccess.getRgbaColorAccess().getGvalGvalParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RgbaColor__GvalAssignment_1_1"


    // $ANTLR start "rule__RgbaColor__BvalAssignment_1_2"
    // InternalMyUiDsl.g:5775:1: rule__RgbaColor__BvalAssignment_1_2 : ( ruleBval ) ;
    public final void rule__RgbaColor__BvalAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5779:1: ( ( ruleBval ) )
            // InternalMyUiDsl.g:5780:2: ( ruleBval )
            {
            // InternalMyUiDsl.g:5780:2: ( ruleBval )
            // InternalMyUiDsl.g:5781:3: ruleBval
            {
             before(grammarAccess.getRgbaColorAccess().getBvalBvalParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBval();

            state._fsp--;

             after(grammarAccess.getRgbaColorAccess().getBvalBvalParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RgbaColor__BvalAssignment_1_2"


    // $ANTLR start "rule__RgbaColor__AvalAssignment_1_3"
    // InternalMyUiDsl.g:5790:1: rule__RgbaColor__AvalAssignment_1_3 : ( ruleAval ) ;
    public final void rule__RgbaColor__AvalAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5794:1: ( ( ruleAval ) )
            // InternalMyUiDsl.g:5795:2: ( ruleAval )
            {
            // InternalMyUiDsl.g:5795:2: ( ruleAval )
            // InternalMyUiDsl.g:5796:3: ruleAval
            {
             before(grammarAccess.getRgbaColorAccess().getAvalAvalParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAval();

            state._fsp--;

             after(grammarAccess.getRgbaColorAccess().getAvalAvalParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RgbaColor__AvalAssignment_1_3"


    // $ANTLR start "rule__Rval__ValueAssignment_0"
    // InternalMyUiDsl.g:5805:1: rule__Rval__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__Rval__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5809:1: ( ( RULE_INT ) )
            // InternalMyUiDsl.g:5810:2: ( RULE_INT )
            {
            // InternalMyUiDsl.g:5810:2: ( RULE_INT )
            // InternalMyUiDsl.g:5811:3: RULE_INT
            {
             before(grammarAccess.getRvalAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRvalAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rval__ValueAssignment_0"


    // $ANTLR start "rule__Gval__ValueAssignment_0"
    // InternalMyUiDsl.g:5820:1: rule__Gval__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__Gval__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5824:1: ( ( RULE_INT ) )
            // InternalMyUiDsl.g:5825:2: ( RULE_INT )
            {
            // InternalMyUiDsl.g:5825:2: ( RULE_INT )
            // InternalMyUiDsl.g:5826:3: RULE_INT
            {
             before(grammarAccess.getGvalAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGvalAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gval__ValueAssignment_0"


    // $ANTLR start "rule__Bval__ValueAssignment_0"
    // InternalMyUiDsl.g:5835:1: rule__Bval__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__Bval__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5839:1: ( ( RULE_INT ) )
            // InternalMyUiDsl.g:5840:2: ( RULE_INT )
            {
            // InternalMyUiDsl.g:5840:2: ( RULE_INT )
            // InternalMyUiDsl.g:5841:3: RULE_INT
            {
             before(grammarAccess.getBvalAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBvalAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bval__ValueAssignment_0"


    // $ANTLR start "rule__Aval__ValueAssignment_0"
    // InternalMyUiDsl.g:5850:1: rule__Aval__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__Aval__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5854:1: ( ( RULE_INT ) )
            // InternalMyUiDsl.g:5855:2: ( RULE_INT )
            {
            // InternalMyUiDsl.g:5855:2: ( RULE_INT )
            // InternalMyUiDsl.g:5856:3: RULE_INT
            {
             before(grammarAccess.getAvalAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAvalAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aval__ValueAssignment_0"


    // $ANTLR start "rule__BorderRad__ValueAssignment_1"
    // InternalMyUiDsl.g:5865:1: rule__BorderRad__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__BorderRad__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5869:1: ( ( RULE_INT ) )
            // InternalMyUiDsl.g:5870:2: ( RULE_INT )
            {
            // InternalMyUiDsl.g:5870:2: ( RULE_INT )
            // InternalMyUiDsl.g:5871:3: RULE_INT
            {
             before(grammarAccess.getBorderRadAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBorderRadAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderRad__ValueAssignment_1"


    // $ANTLR start "rule__BorderRad__MeasureTypeAssignment_2"
    // InternalMyUiDsl.g:5880:1: rule__BorderRad__MeasureTypeAssignment_2 : ( rulemeasureType ) ;
    public final void rule__BorderRad__MeasureTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5884:1: ( ( rulemeasureType ) )
            // InternalMyUiDsl.g:5885:2: ( rulemeasureType )
            {
            // InternalMyUiDsl.g:5885:2: ( rulemeasureType )
            // InternalMyUiDsl.g:5886:3: rulemeasureType
            {
             before(grammarAccess.getBorderRadAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulemeasureType();

            state._fsp--;

             after(grammarAccess.getBorderRadAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderRad__MeasureTypeAssignment_2"


    // $ANTLR start "rule__Pos__ValueAssignment_1"
    // InternalMyUiDsl.g:5895:1: rule__Pos__ValueAssignment_1 : ( rulePosVals ) ;
    public final void rule__Pos__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5899:1: ( ( rulePosVals ) )
            // InternalMyUiDsl.g:5900:2: ( rulePosVals )
            {
            // InternalMyUiDsl.g:5900:2: ( rulePosVals )
            // InternalMyUiDsl.g:5901:3: rulePosVals
            {
             before(grammarAccess.getPosAccess().getValuePosValsEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePosVals();

            state._fsp--;

             after(grammarAccess.getPosAccess().getValuePosValsEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pos__ValueAssignment_1"


    // $ANTLR start "rule__Flt__ValueAssignment_1"
    // InternalMyUiDsl.g:5910:1: rule__Flt__ValueAssignment_1 : ( ruleFltVals ) ;
    public final void rule__Flt__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5914:1: ( ( ruleFltVals ) )
            // InternalMyUiDsl.g:5915:2: ( ruleFltVals )
            {
            // InternalMyUiDsl.g:5915:2: ( ruleFltVals )
            // InternalMyUiDsl.g:5916:3: ruleFltVals
            {
             before(grammarAccess.getFltAccess().getValueFltValsEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFltVals();

            state._fsp--;

             after(grammarAccess.getFltAccess().getValueFltValsEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flt__ValueAssignment_1"


    // $ANTLR start "rule__Clr__ValueAssignment_1"
    // InternalMyUiDsl.g:5925:1: rule__Clr__ValueAssignment_1 : ( ruleClrVals ) ;
    public final void rule__Clr__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5929:1: ( ( ruleClrVals ) )
            // InternalMyUiDsl.g:5930:2: ( ruleClrVals )
            {
            // InternalMyUiDsl.g:5930:2: ( ruleClrVals )
            // InternalMyUiDsl.g:5931:3: ruleClrVals
            {
             before(grammarAccess.getClrAccess().getValueClrValsEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClrVals();

            state._fsp--;

             after(grammarAccess.getClrAccess().getValueClrValsEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clr__ValueAssignment_1"


    // $ANTLR start "rule__Disp__ValueAssignment_1"
    // InternalMyUiDsl.g:5940:1: rule__Disp__ValueAssignment_1 : ( ruleDispVals ) ;
    public final void rule__Disp__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5944:1: ( ( ruleDispVals ) )
            // InternalMyUiDsl.g:5945:2: ( ruleDispVals )
            {
            // InternalMyUiDsl.g:5945:2: ( ruleDispVals )
            // InternalMyUiDsl.g:5946:3: ruleDispVals
            {
             before(grammarAccess.getDispAccess().getValueDispValsEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDispVals();

            state._fsp--;

             after(grammarAccess.getDispAccess().getValueDispValsEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disp__ValueAssignment_1"


    // $ANTLR start "rule__VerAl__ValueAssignment_1"
    // InternalMyUiDsl.g:5955:1: rule__VerAl__ValueAssignment_1 : ( ruleVeralVals ) ;
    public final void rule__VerAl__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5959:1: ( ( ruleVeralVals ) )
            // InternalMyUiDsl.g:5960:2: ( ruleVeralVals )
            {
            // InternalMyUiDsl.g:5960:2: ( ruleVeralVals )
            // InternalMyUiDsl.g:5961:3: ruleVeralVals
            {
             before(grammarAccess.getVerAlAccess().getValueVeralValsEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVeralVals();

            state._fsp--;

             after(grammarAccess.getVerAlAccess().getValueVeralValsEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerAl__ValueAssignment_1"


    // $ANTLR start "rule__OFlow__ValueAssignment_1"
    // InternalMyUiDsl.g:5970:1: rule__OFlow__ValueAssignment_1 : ( ruleOFlowVals ) ;
    public final void rule__OFlow__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5974:1: ( ( ruleOFlowVals ) )
            // InternalMyUiDsl.g:5975:2: ( ruleOFlowVals )
            {
            // InternalMyUiDsl.g:5975:2: ( ruleOFlowVals )
            // InternalMyUiDsl.g:5976:3: ruleOFlowVals
            {
             before(grammarAccess.getOFlowAccess().getValueOFlowValsEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOFlowVals();

            state._fsp--;

             after(grammarAccess.getOFlowAccess().getValueOFlowValsEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OFlow__ValueAssignment_1"


    // $ANTLR start "rule__Wid__ValueAssignment_1"
    // InternalMyUiDsl.g:5985:1: rule__Wid__ValueAssignment_1 : ( ruleMinMaxValue ) ;
    public final void rule__Wid__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:5989:1: ( ( ruleMinMaxValue ) )
            // InternalMyUiDsl.g:5990:2: ( ruleMinMaxValue )
            {
            // InternalMyUiDsl.g:5990:2: ( ruleMinMaxValue )
            // InternalMyUiDsl.g:5991:3: ruleMinMaxValue
            {
             before(grammarAccess.getWidAccess().getValueMinMaxValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMinMaxValue();

            state._fsp--;

             after(grammarAccess.getWidAccess().getValueMinMaxValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wid__ValueAssignment_1"


    // $ANTLR start "rule__H8__ValueAssignment_1"
    // InternalMyUiDsl.g:6000:1: rule__H8__ValueAssignment_1 : ( ruleMinMaxValue ) ;
    public final void rule__H8__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6004:1: ( ( ruleMinMaxValue ) )
            // InternalMyUiDsl.g:6005:2: ( ruleMinMaxValue )
            {
            // InternalMyUiDsl.g:6005:2: ( ruleMinMaxValue )
            // InternalMyUiDsl.g:6006:3: ruleMinMaxValue
            {
             before(grammarAccess.getH8Access().getValueMinMaxValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMinMaxValue();

            state._fsp--;

             after(grammarAccess.getH8Access().getValueMinMaxValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__H8__ValueAssignment_1"


    // $ANTLR start "rule__Coord__ValueAssignment_1"
    // InternalMyUiDsl.g:6015:1: rule__Coord__ValueAssignment_1 : ( ruleFourAspect ) ;
    public final void rule__Coord__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6019:1: ( ( ruleFourAspect ) )
            // InternalMyUiDsl.g:6020:2: ( ruleFourAspect )
            {
            // InternalMyUiDsl.g:6020:2: ( ruleFourAspect )
            // InternalMyUiDsl.g:6021:3: ruleFourAspect
            {
             before(grammarAccess.getCoordAccess().getValueFourAspectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFourAspect();

            state._fsp--;

             after(grammarAccess.getCoordAccess().getValueFourAspectParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coord__ValueAssignment_1"


    // $ANTLR start "rule__Marg__ValueAssignment_1"
    // InternalMyUiDsl.g:6030:1: rule__Marg__ValueAssignment_1 : ( ruleFourAspect ) ;
    public final void rule__Marg__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6034:1: ( ( ruleFourAspect ) )
            // InternalMyUiDsl.g:6035:2: ( ruleFourAspect )
            {
            // InternalMyUiDsl.g:6035:2: ( ruleFourAspect )
            // InternalMyUiDsl.g:6036:3: ruleFourAspect
            {
             before(grammarAccess.getMargAccess().getValueFourAspectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFourAspect();

            state._fsp--;

             after(grammarAccess.getMargAccess().getValueFourAspectParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marg__ValueAssignment_1"


    // $ANTLR start "rule__Padd__ValueAssignment_1"
    // InternalMyUiDsl.g:6045:1: rule__Padd__ValueAssignment_1 : ( ruleFourAspect ) ;
    public final void rule__Padd__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6049:1: ( ( ruleFourAspect ) )
            // InternalMyUiDsl.g:6050:2: ( ruleFourAspect )
            {
            // InternalMyUiDsl.g:6050:2: ( ruleFourAspect )
            // InternalMyUiDsl.g:6051:3: ruleFourAspect
            {
             before(grammarAccess.getPaddAccess().getValueFourAspectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFourAspect();

            state._fsp--;

             after(grammarAccess.getPaddAccess().getValueFourAspectParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Padd__ValueAssignment_1"


    // $ANTLR start "rule__MinMaxValue__MinValAssignment_1_0"
    // InternalMyUiDsl.g:6060:1: rule__MinMaxValue__MinValAssignment_1_0 : ( ruleMinVal ) ;
    public final void rule__MinMaxValue__MinValAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6064:1: ( ( ruleMinVal ) )
            // InternalMyUiDsl.g:6065:2: ( ruleMinVal )
            {
            // InternalMyUiDsl.g:6065:2: ( ruleMinVal )
            // InternalMyUiDsl.g:6066:3: ruleMinVal
            {
             before(grammarAccess.getMinMaxValueAccess().getMinValMinValParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMinVal();

            state._fsp--;

             after(grammarAccess.getMinMaxValueAccess().getMinValMinValParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMaxValue__MinValAssignment_1_0"


    // $ANTLR start "rule__MinMaxValue__MaxValAssignment_1_1"
    // InternalMyUiDsl.g:6075:1: rule__MinMaxValue__MaxValAssignment_1_1 : ( ruleMaxVal ) ;
    public final void rule__MinMaxValue__MaxValAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6079:1: ( ( ruleMaxVal ) )
            // InternalMyUiDsl.g:6080:2: ( ruleMaxVal )
            {
            // InternalMyUiDsl.g:6080:2: ( ruleMaxVal )
            // InternalMyUiDsl.g:6081:3: ruleMaxVal
            {
             before(grammarAccess.getMinMaxValueAccess().getMaxValMaxValParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMaxVal();

            state._fsp--;

             after(grammarAccess.getMinMaxValueAccess().getMaxValMaxValParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMaxValue__MaxValAssignment_1_1"


    // $ANTLR start "rule__MinMaxValue__MidValAssignment_1_2"
    // InternalMyUiDsl.g:6090:1: rule__MinMaxValue__MidValAssignment_1_2 : ( ruleMidVal ) ;
    public final void rule__MinMaxValue__MidValAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6094:1: ( ( ruleMidVal ) )
            // InternalMyUiDsl.g:6095:2: ( ruleMidVal )
            {
            // InternalMyUiDsl.g:6095:2: ( ruleMidVal )
            // InternalMyUiDsl.g:6096:3: ruleMidVal
            {
             before(grammarAccess.getMinMaxValueAccess().getMidValMidValParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMidVal();

            state._fsp--;

             after(grammarAccess.getMinMaxValueAccess().getMidValMidValParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMaxValue__MidValAssignment_1_2"


    // $ANTLR start "rule__MinVal__ValueAssignment_0"
    // InternalMyUiDsl.g:6105:1: rule__MinVal__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__MinVal__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6109:1: ( ( RULE_INT ) )
            // InternalMyUiDsl.g:6110:2: ( RULE_INT )
            {
            // InternalMyUiDsl.g:6110:2: ( RULE_INT )
            // InternalMyUiDsl.g:6111:3: RULE_INT
            {
             before(grammarAccess.getMinValAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMinValAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinVal__ValueAssignment_0"


    // $ANTLR start "rule__MinVal__MeasureTypeAssignment_2"
    // InternalMyUiDsl.g:6120:1: rule__MinVal__MeasureTypeAssignment_2 : ( rulemeasureType ) ;
    public final void rule__MinVal__MeasureTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6124:1: ( ( rulemeasureType ) )
            // InternalMyUiDsl.g:6125:2: ( rulemeasureType )
            {
            // InternalMyUiDsl.g:6125:2: ( rulemeasureType )
            // InternalMyUiDsl.g:6126:3: rulemeasureType
            {
             before(grammarAccess.getMinValAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulemeasureType();

            state._fsp--;

             after(grammarAccess.getMinValAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinVal__MeasureTypeAssignment_2"


    // $ANTLR start "rule__MaxVal__ValueAssignment_0"
    // InternalMyUiDsl.g:6135:1: rule__MaxVal__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__MaxVal__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6139:1: ( ( RULE_INT ) )
            // InternalMyUiDsl.g:6140:2: ( RULE_INT )
            {
            // InternalMyUiDsl.g:6140:2: ( RULE_INT )
            // InternalMyUiDsl.g:6141:3: RULE_INT
            {
             before(grammarAccess.getMaxValAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMaxValAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxVal__ValueAssignment_0"


    // $ANTLR start "rule__MaxVal__MeasureTypeAssignment_2"
    // InternalMyUiDsl.g:6150:1: rule__MaxVal__MeasureTypeAssignment_2 : ( rulemeasureType ) ;
    public final void rule__MaxVal__MeasureTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6154:1: ( ( rulemeasureType ) )
            // InternalMyUiDsl.g:6155:2: ( rulemeasureType )
            {
            // InternalMyUiDsl.g:6155:2: ( rulemeasureType )
            // InternalMyUiDsl.g:6156:3: rulemeasureType
            {
             before(grammarAccess.getMaxValAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulemeasureType();

            state._fsp--;

             after(grammarAccess.getMaxValAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxVal__MeasureTypeAssignment_2"


    // $ANTLR start "rule__MidVal__ValueAssignment_0"
    // InternalMyUiDsl.g:6165:1: rule__MidVal__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__MidVal__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6169:1: ( ( RULE_INT ) )
            // InternalMyUiDsl.g:6170:2: ( RULE_INT )
            {
            // InternalMyUiDsl.g:6170:2: ( RULE_INT )
            // InternalMyUiDsl.g:6171:3: RULE_INT
            {
             before(grammarAccess.getMidValAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMidValAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MidVal__ValueAssignment_0"


    // $ANTLR start "rule__MidVal__MeasureTypeAssignment_1"
    // InternalMyUiDsl.g:6180:1: rule__MidVal__MeasureTypeAssignment_1 : ( rulemeasureType ) ;
    public final void rule__MidVal__MeasureTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6184:1: ( ( rulemeasureType ) )
            // InternalMyUiDsl.g:6185:2: ( rulemeasureType )
            {
            // InternalMyUiDsl.g:6185:2: ( rulemeasureType )
            // InternalMyUiDsl.g:6186:3: rulemeasureType
            {
             before(grammarAccess.getMidValAccess().getMeasureTypeMeasureTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulemeasureType();

            state._fsp--;

             after(grammarAccess.getMidValAccess().getMeasureTypeMeasureTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MidVal__MeasureTypeAssignment_1"


    // $ANTLR start "rule__FourAspect__LeftAssignment_1_0"
    // InternalMyUiDsl.g:6195:1: rule__FourAspect__LeftAssignment_1_0 : ( ruleLeftAspect ) ;
    public final void rule__FourAspect__LeftAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6199:1: ( ( ruleLeftAspect ) )
            // InternalMyUiDsl.g:6200:2: ( ruleLeftAspect )
            {
            // InternalMyUiDsl.g:6200:2: ( ruleLeftAspect )
            // InternalMyUiDsl.g:6201:3: ruleLeftAspect
            {
             before(grammarAccess.getFourAspectAccess().getLeftLeftAspectParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLeftAspect();

            state._fsp--;

             after(grammarAccess.getFourAspectAccess().getLeftLeftAspectParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FourAspect__LeftAssignment_1_0"


    // $ANTLR start "rule__FourAspect__RightAssignment_1_1"
    // InternalMyUiDsl.g:6210:1: rule__FourAspect__RightAssignment_1_1 : ( ruleRightAspect ) ;
    public final void rule__FourAspect__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6214:1: ( ( ruleRightAspect ) )
            // InternalMyUiDsl.g:6215:2: ( ruleRightAspect )
            {
            // InternalMyUiDsl.g:6215:2: ( ruleRightAspect )
            // InternalMyUiDsl.g:6216:3: ruleRightAspect
            {
             before(grammarAccess.getFourAspectAccess().getRightRightAspectParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRightAspect();

            state._fsp--;

             after(grammarAccess.getFourAspectAccess().getRightRightAspectParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FourAspect__RightAssignment_1_1"


    // $ANTLR start "rule__FourAspect__UpAssignment_1_2"
    // InternalMyUiDsl.g:6225:1: rule__FourAspect__UpAssignment_1_2 : ( ruleUpAspect ) ;
    public final void rule__FourAspect__UpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6229:1: ( ( ruleUpAspect ) )
            // InternalMyUiDsl.g:6230:2: ( ruleUpAspect )
            {
            // InternalMyUiDsl.g:6230:2: ( ruleUpAspect )
            // InternalMyUiDsl.g:6231:3: ruleUpAspect
            {
             before(grammarAccess.getFourAspectAccess().getUpUpAspectParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUpAspect();

            state._fsp--;

             after(grammarAccess.getFourAspectAccess().getUpUpAspectParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FourAspect__UpAssignment_1_2"


    // $ANTLR start "rule__FourAspect__DownAssignment_1_3"
    // InternalMyUiDsl.g:6240:1: rule__FourAspect__DownAssignment_1_3 : ( ruleDownAspect ) ;
    public final void rule__FourAspect__DownAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6244:1: ( ( ruleDownAspect ) )
            // InternalMyUiDsl.g:6245:2: ( ruleDownAspect )
            {
            // InternalMyUiDsl.g:6245:2: ( ruleDownAspect )
            // InternalMyUiDsl.g:6246:3: ruleDownAspect
            {
             before(grammarAccess.getFourAspectAccess().getDownDownAspectParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDownAspect();

            state._fsp--;

             after(grammarAccess.getFourAspectAccess().getDownDownAspectParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FourAspect__DownAssignment_1_3"


    // $ANTLR start "rule__LeftAspect__ValueAssignment_0"
    // InternalMyUiDsl.g:6255:1: rule__LeftAspect__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__LeftAspect__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6259:1: ( ( RULE_INT ) )
            // InternalMyUiDsl.g:6260:2: ( RULE_INT )
            {
            // InternalMyUiDsl.g:6260:2: ( RULE_INT )
            // InternalMyUiDsl.g:6261:3: RULE_INT
            {
             before(grammarAccess.getLeftAspectAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLeftAspectAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftAspect__ValueAssignment_0"


    // $ANTLR start "rule__LeftAspect__MeasureTypeAssignment_2"
    // InternalMyUiDsl.g:6270:1: rule__LeftAspect__MeasureTypeAssignment_2 : ( rulemeasureType ) ;
    public final void rule__LeftAspect__MeasureTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6274:1: ( ( rulemeasureType ) )
            // InternalMyUiDsl.g:6275:2: ( rulemeasureType )
            {
            // InternalMyUiDsl.g:6275:2: ( rulemeasureType )
            // InternalMyUiDsl.g:6276:3: rulemeasureType
            {
             before(grammarAccess.getLeftAspectAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulemeasureType();

            state._fsp--;

             after(grammarAccess.getLeftAspectAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftAspect__MeasureTypeAssignment_2"


    // $ANTLR start "rule__RightAspect__ValueAssignment_0"
    // InternalMyUiDsl.g:6285:1: rule__RightAspect__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__RightAspect__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6289:1: ( ( RULE_INT ) )
            // InternalMyUiDsl.g:6290:2: ( RULE_INT )
            {
            // InternalMyUiDsl.g:6290:2: ( RULE_INT )
            // InternalMyUiDsl.g:6291:3: RULE_INT
            {
             before(grammarAccess.getRightAspectAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRightAspectAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightAspect__ValueAssignment_0"


    // $ANTLR start "rule__RightAspect__MeasureTypeAssignment_2"
    // InternalMyUiDsl.g:6300:1: rule__RightAspect__MeasureTypeAssignment_2 : ( rulemeasureType ) ;
    public final void rule__RightAspect__MeasureTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6304:1: ( ( rulemeasureType ) )
            // InternalMyUiDsl.g:6305:2: ( rulemeasureType )
            {
            // InternalMyUiDsl.g:6305:2: ( rulemeasureType )
            // InternalMyUiDsl.g:6306:3: rulemeasureType
            {
             before(grammarAccess.getRightAspectAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulemeasureType();

            state._fsp--;

             after(grammarAccess.getRightAspectAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightAspect__MeasureTypeAssignment_2"


    // $ANTLR start "rule__UpAspect__ValueAssignment_0"
    // InternalMyUiDsl.g:6315:1: rule__UpAspect__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__UpAspect__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6319:1: ( ( RULE_INT ) )
            // InternalMyUiDsl.g:6320:2: ( RULE_INT )
            {
            // InternalMyUiDsl.g:6320:2: ( RULE_INT )
            // InternalMyUiDsl.g:6321:3: RULE_INT
            {
             before(grammarAccess.getUpAspectAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUpAspectAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpAspect__ValueAssignment_0"


    // $ANTLR start "rule__UpAspect__MeasureTypeAssignment_2"
    // InternalMyUiDsl.g:6330:1: rule__UpAspect__MeasureTypeAssignment_2 : ( rulemeasureType ) ;
    public final void rule__UpAspect__MeasureTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6334:1: ( ( rulemeasureType ) )
            // InternalMyUiDsl.g:6335:2: ( rulemeasureType )
            {
            // InternalMyUiDsl.g:6335:2: ( rulemeasureType )
            // InternalMyUiDsl.g:6336:3: rulemeasureType
            {
             before(grammarAccess.getUpAspectAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulemeasureType();

            state._fsp--;

             after(grammarAccess.getUpAspectAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpAspect__MeasureTypeAssignment_2"


    // $ANTLR start "rule__DownAspect__ValueAssignment_0"
    // InternalMyUiDsl.g:6345:1: rule__DownAspect__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__DownAspect__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6349:1: ( ( RULE_INT ) )
            // InternalMyUiDsl.g:6350:2: ( RULE_INT )
            {
            // InternalMyUiDsl.g:6350:2: ( RULE_INT )
            // InternalMyUiDsl.g:6351:3: RULE_INT
            {
             before(grammarAccess.getDownAspectAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDownAspectAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DownAspect__ValueAssignment_0"


    // $ANTLR start "rule__DownAspect__MeasureTypeAssignment_2"
    // InternalMyUiDsl.g:6360:1: rule__DownAspect__MeasureTypeAssignment_2 : ( rulemeasureType ) ;
    public final void rule__DownAspect__MeasureTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUiDsl.g:6364:1: ( ( rulemeasureType ) )
            // InternalMyUiDsl.g:6365:2: ( rulemeasureType )
            {
            // InternalMyUiDsl.g:6365:2: ( rulemeasureType )
            // InternalMyUiDsl.g:6366:3: rulemeasureType
            {
             before(grammarAccess.getDownAspectAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulemeasureType();

            state._fsp--;

             after(grammarAccess.getDownAspectAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DownAspect__MeasureTypeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x2000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000095L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x000000001FFE0E08L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000002L,0x000000001FFE0E00L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x03FC040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001FF8000L,0x0000000000001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004E00000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000078800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000095L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000042L});

}
