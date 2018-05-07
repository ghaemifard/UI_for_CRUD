package edu.aut.islab.ghaemi.minuy.parser.antlr.internal;

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
import edu.aut.islab.ghaemi.minuy.services.MyUiDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyUiDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ONECHAR", "RULE_INT", "RULE_STRING2", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'|'", "'import'", "'as'", "';'", "'_CSS'", "'_JS'", "'->'", "'*'", "':'", "'<'", "'>'", "'('", "')'", "'['", "']'", "','", "'{'", "'}'", "'border:'", "'color:'", "'bcolor:'", "'Red'", "'Blue'", "'Black'", "'Green'", "'Yellow'", "'Pink'", "'Brown'", "'Gold'", "'White'", "'Grey'", "'rgba('", "'red'", "'grn'", "'blu'", "'alfa'", "'Arc:'", "'Pos:'", "'Flt:'", "'Clr:'", "'Disp:'", "'Ver_Al:'", "'OFlow:'", "'Wid:'", "'H8:'", "'Coord:'", "'Marg:'", "'Padd:'", "'lo'", "'hi'", "'le'", "'ri'", "'up'", "'dn'", "'em'", "'%'", "'px'", "'Static'", "'Relative'", "'Fixed'", "'Absolute'", "'Steaky'", "'Left'", "'Right'", "'None'", "'Start'", "'End'", "'Both'", "'Block'", "'Inline'", "'InBl'", "'Table'", "'Top'", "'Down'", "'Center'", "'Scroll'", "'Visible'", "'Hidden'", "'Auto'", "'Div'", "'Para'", "'Input'", "'Tr'", "'Td'", "'Img'", "'Form'", "'Button'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_ONECHAR=5;
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

        public InternalMyUiDslParser(TokenStream input, MyUiDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyUiDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyUiDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyUiDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyUiDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyUiDsl.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_heads_0_0= ruleHead ) )* otherlv_1= '|' ( (lv_bodis_2_0= ruleBody ) )+ otherlv_3= '|' ( (lv_accessories_4_0= ruleAccessory ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_heads_0_0 = null;

        EObject lv_bodis_2_0 = null;

        EObject lv_accessories_4_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:78:2: ( ( ( (lv_heads_0_0= ruleHead ) )* otherlv_1= '|' ( (lv_bodis_2_0= ruleBody ) )+ otherlv_3= '|' ( (lv_accessories_4_0= ruleAccessory ) )* ) )
            // InternalMyUiDsl.g:79:2: ( ( (lv_heads_0_0= ruleHead ) )* otherlv_1= '|' ( (lv_bodis_2_0= ruleBody ) )+ otherlv_3= '|' ( (lv_accessories_4_0= ruleAccessory ) )* )
            {
            // InternalMyUiDsl.g:79:2: ( ( (lv_heads_0_0= ruleHead ) )* otherlv_1= '|' ( (lv_bodis_2_0= ruleBody ) )+ otherlv_3= '|' ( (lv_accessories_4_0= ruleAccessory ) )* )
            // InternalMyUiDsl.g:80:3: ( (lv_heads_0_0= ruleHead ) )* otherlv_1= '|' ( (lv_bodis_2_0= ruleBody ) )+ otherlv_3= '|' ( (lv_accessories_4_0= ruleAccessory ) )*
            {
            // InternalMyUiDsl.g:80:3: ( (lv_heads_0_0= ruleHead ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyUiDsl.g:81:4: (lv_heads_0_0= ruleHead )
            	    {
            	    // InternalMyUiDsl.g:81:4: (lv_heads_0_0= ruleHead )
            	    // InternalMyUiDsl.g:82:5: lv_heads_0_0= ruleHead
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getHeadsHeadParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_heads_0_0=ruleHead();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"heads",
            	    						lv_heads_0_0,
            	    						"edu.aut.islab.ghaemi.minuy.MyUiDsl.Head");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getVerticalLineKeyword_1());
            		
            // InternalMyUiDsl.g:103:3: ( (lv_bodis_2_0= ruleBody ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ONECHAR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyUiDsl.g:104:4: (lv_bodis_2_0= ruleBody )
            	    {
            	    // InternalMyUiDsl.g:104:4: (lv_bodis_2_0= ruleBody )
            	    // InternalMyUiDsl.g:105:5: lv_bodis_2_0= ruleBody
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getBodisBodyParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_bodis_2_0=ruleBody();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bodis",
            	    						lv_bodis_2_0,
            	    						"edu.aut.islab.ghaemi.minuy.MyUiDsl.Body");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getVerticalLineKeyword_3());
            		
            // InternalMyUiDsl.g:126:3: ( (lv_accessories_4_0= ruleAccessory ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ONECHAR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyUiDsl.g:127:4: (lv_accessories_4_0= ruleAccessory )
            	    {
            	    // InternalMyUiDsl.g:127:4: (lv_accessories_4_0= ruleAccessory )
            	    // InternalMyUiDsl.g:128:5: lv_accessories_4_0= ruleAccessory
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getAccessoriesAccessoryParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_accessories_4_0=ruleAccessory();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"accessories",
            	    						lv_accessories_4_0,
            	    						"edu.aut.islab.ghaemi.minuy.MyUiDsl.Accessory");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleHead"
    // InternalMyUiDsl.g:149:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHead = null;


        try {
            // InternalMyUiDsl.g:149:45: (iv_ruleHead= ruleHead EOF )
            // InternalMyUiDsl.g:150:2: iv_ruleHead= ruleHead EOF
            {
             newCompositeNode(grammarAccess.getHeadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHead=ruleHead();

            state._fsp--;

             current =iv_ruleHead; 
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
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // InternalMyUiDsl.g:156:1: ruleHead returns [EObject current=null] : (otherlv_0= 'import' ( (lv_fileName_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_headType_3_0= ruleHeadType ) ) otherlv_4= ';' ) ;
    public final EObject ruleHead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fileName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_headType_3_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:162:2: ( (otherlv_0= 'import' ( (lv_fileName_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_headType_3_0= ruleHeadType ) ) otherlv_4= ';' ) )
            // InternalMyUiDsl.g:163:2: (otherlv_0= 'import' ( (lv_fileName_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_headType_3_0= ruleHeadType ) ) otherlv_4= ';' )
            {
            // InternalMyUiDsl.g:163:2: (otherlv_0= 'import' ( (lv_fileName_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_headType_3_0= ruleHeadType ) ) otherlv_4= ';' )
            // InternalMyUiDsl.g:164:3: otherlv_0= 'import' ( (lv_fileName_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_headType_3_0= ruleHeadType ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getHeadAccess().getImportKeyword_0());
            		
            // InternalMyUiDsl.g:168:3: ( (lv_fileName_1_0= RULE_ID ) )
            // InternalMyUiDsl.g:169:4: (lv_fileName_1_0= RULE_ID )
            {
            // InternalMyUiDsl.g:169:4: (lv_fileName_1_0= RULE_ID )
            // InternalMyUiDsl.g:170:5: lv_fileName_1_0= RULE_ID
            {
            lv_fileName_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_fileName_1_0, grammarAccess.getHeadAccess().getFileNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fileName",
            						lv_fileName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getHeadAccess().getAsKeyword_2());
            		
            // InternalMyUiDsl.g:190:3: ( (lv_headType_3_0= ruleHeadType ) )
            // InternalMyUiDsl.g:191:4: (lv_headType_3_0= ruleHeadType )
            {
            // InternalMyUiDsl.g:191:4: (lv_headType_3_0= ruleHeadType )
            // InternalMyUiDsl.g:192:5: lv_headType_3_0= ruleHeadType
            {

            					newCompositeNode(grammarAccess.getHeadAccess().getHeadTypeHeadTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_headType_3_0=ruleHeadType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeadRule());
            					}
            					set(
            						current,
            						"headType",
            						lv_headType_3_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.HeadType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getHeadAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleHeadType"
    // InternalMyUiDsl.g:217:1: entryRuleHeadType returns [String current=null] : iv_ruleHeadType= ruleHeadType EOF ;
    public final String entryRuleHeadType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHeadType = null;


        try {
            // InternalMyUiDsl.g:217:48: (iv_ruleHeadType= ruleHeadType EOF )
            // InternalMyUiDsl.g:218:2: iv_ruleHeadType= ruleHeadType EOF
            {
             newCompositeNode(grammarAccess.getHeadTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeadType=ruleHeadType();

            state._fsp--;

             current =iv_ruleHeadType.getText(); 
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
    // $ANTLR end "entryRuleHeadType"


    // $ANTLR start "ruleHeadType"
    // InternalMyUiDsl.g:224:1: ruleHeadType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '_CSS' | kw= '_JS' | this_OneChar_2= RULE_ONECHAR ) ;
    public final AntlrDatatypeRuleToken ruleHeadType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_OneChar_2=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:230:2: ( (kw= '_CSS' | kw= '_JS' | this_OneChar_2= RULE_ONECHAR ) )
            // InternalMyUiDsl.g:231:2: (kw= '_CSS' | kw= '_JS' | this_OneChar_2= RULE_ONECHAR )
            {
            // InternalMyUiDsl.g:231:2: (kw= '_CSS' | kw= '_JS' | this_OneChar_2= RULE_ONECHAR )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case RULE_ONECHAR:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyUiDsl.g:232:3: kw= '_CSS'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getHeadTypeAccess().get_CSSKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:238:3: kw= '_JS'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getHeadTypeAccess().get_JSKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:244:3: this_OneChar_2= RULE_ONECHAR
                    {
                    this_OneChar_2=(Token)match(input,RULE_ONECHAR,FOLLOW_2); 

                    			current.merge(this_OneChar_2);
                    		

                    			newLeafNode(this_OneChar_2, grammarAccess.getHeadTypeAccess().getOneCharTerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleHeadType"


    // $ANTLR start "entryRuleBody"
    // InternalMyUiDsl.g:255:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalMyUiDsl.g:255:45: (iv_ruleBody= ruleBody EOF )
            // InternalMyUiDsl.g:256:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalMyUiDsl.g:262:1: ruleBody returns [EObject current=null] : ( ( (lv_name_0_0= ruleNode ) ) otherlv_1= '->' ( (lv_right_2_0= ruleNode ) )+ ( (lv_selfRepeat_3_0= ruleSelfRepeat ) )? otherlv_4= ';' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_name_0_0 = null;

        EObject lv_right_2_0 = null;

        EObject lv_selfRepeat_3_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:268:2: ( ( ( (lv_name_0_0= ruleNode ) ) otherlv_1= '->' ( (lv_right_2_0= ruleNode ) )+ ( (lv_selfRepeat_3_0= ruleSelfRepeat ) )? otherlv_4= ';' ) )
            // InternalMyUiDsl.g:269:2: ( ( (lv_name_0_0= ruleNode ) ) otherlv_1= '->' ( (lv_right_2_0= ruleNode ) )+ ( (lv_selfRepeat_3_0= ruleSelfRepeat ) )? otherlv_4= ';' )
            {
            // InternalMyUiDsl.g:269:2: ( ( (lv_name_0_0= ruleNode ) ) otherlv_1= '->' ( (lv_right_2_0= ruleNode ) )+ ( (lv_selfRepeat_3_0= ruleSelfRepeat ) )? otherlv_4= ';' )
            // InternalMyUiDsl.g:270:3: ( (lv_name_0_0= ruleNode ) ) otherlv_1= '->' ( (lv_right_2_0= ruleNode ) )+ ( (lv_selfRepeat_3_0= ruleSelfRepeat ) )? otherlv_4= ';'
            {
            // InternalMyUiDsl.g:270:3: ( (lv_name_0_0= ruleNode ) )
            // InternalMyUiDsl.g:271:4: (lv_name_0_0= ruleNode )
            {
            // InternalMyUiDsl.g:271:4: (lv_name_0_0= ruleNode )
            // InternalMyUiDsl.g:272:5: lv_name_0_0= ruleNode
            {

            					newCompositeNode(grammarAccess.getBodyAccess().getNameNodeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_0_0=ruleNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBodyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.Node");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMyUiDsl.g:293:3: ( (lv_right_2_0= ruleNode ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ONECHAR) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyUiDsl.g:294:4: (lv_right_2_0= ruleNode )
            	    {
            	    // InternalMyUiDsl.g:294:4: (lv_right_2_0= ruleNode )
            	    // InternalMyUiDsl.g:295:5: lv_right_2_0= ruleNode
            	    {

            	    					newCompositeNode(grammarAccess.getBodyAccess().getRightNodeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_right_2_0=ruleNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"right",
            	    						lv_right_2_0,
            	    						"edu.aut.islab.ghaemi.minuy.MyUiDsl.Node");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // InternalMyUiDsl.g:312:3: ( (lv_selfRepeat_3_0= ruleSelfRepeat ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyUiDsl.g:313:4: (lv_selfRepeat_3_0= ruleSelfRepeat )
                    {
                    // InternalMyUiDsl.g:313:4: (lv_selfRepeat_3_0= ruleSelfRepeat )
                    // InternalMyUiDsl.g:314:5: lv_selfRepeat_3_0= ruleSelfRepeat
                    {

                    					newCompositeNode(grammarAccess.getBodyAccess().getSelfRepeatSelfRepeatParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_selfRepeat_3_0=ruleSelfRepeat();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBodyRule());
                    					}
                    					set(
                    						current,
                    						"selfRepeat",
                    						lv_selfRepeat_3_0,
                    						"edu.aut.islab.ghaemi.minuy.MyUiDsl.SelfRepeat");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleNode"
    // InternalMyUiDsl.g:339:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalMyUiDsl.g:339:45: (iv_ruleNode= ruleNode EOF )
            // InternalMyUiDsl.g:340:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalMyUiDsl.g:346:1: ruleNode returns [EObject current=null] : ( (lv_name_0_0= RULE_ONECHAR ) ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:352:2: ( ( (lv_name_0_0= RULE_ONECHAR ) ) )
            // InternalMyUiDsl.g:353:2: ( (lv_name_0_0= RULE_ONECHAR ) )
            {
            // InternalMyUiDsl.g:353:2: ( (lv_name_0_0= RULE_ONECHAR ) )
            // InternalMyUiDsl.g:354:3: (lv_name_0_0= RULE_ONECHAR )
            {
            // InternalMyUiDsl.g:354:3: (lv_name_0_0= RULE_ONECHAR )
            // InternalMyUiDsl.g:355:4: lv_name_0_0= RULE_ONECHAR
            {
            lv_name_0_0=(Token)match(input,RULE_ONECHAR,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getNodeAccess().getNameOneCharTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNodeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"edu.aut.islab.ghaemi.minuy.MyUiDsl.OneChar");
            			

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleSelfRepeat"
    // InternalMyUiDsl.g:374:1: entryRuleSelfRepeat returns [EObject current=null] : iv_ruleSelfRepeat= ruleSelfRepeat EOF ;
    public final EObject entryRuleSelfRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfRepeat = null;


        try {
            // InternalMyUiDsl.g:374:51: (iv_ruleSelfRepeat= ruleSelfRepeat EOF )
            // InternalMyUiDsl.g:375:2: iv_ruleSelfRepeat= ruleSelfRepeat EOF
            {
             newCompositeNode(grammarAccess.getSelfRepeatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelfRepeat=ruleSelfRepeat();

            state._fsp--;

             current =iv_ruleSelfRepeat; 
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
    // $ANTLR end "entryRuleSelfRepeat"


    // $ANTLR start "ruleSelfRepeat"
    // InternalMyUiDsl.g:381:1: ruleSelfRepeat returns [EObject current=null] : ( ( (lv_number_0_0= RULE_INT ) ) ( (lv_vertical_1_0= '*' ) )? ) ;
    public final EObject ruleSelfRepeat() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_vertical_1_0=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:387:2: ( ( ( (lv_number_0_0= RULE_INT ) ) ( (lv_vertical_1_0= '*' ) )? ) )
            // InternalMyUiDsl.g:388:2: ( ( (lv_number_0_0= RULE_INT ) ) ( (lv_vertical_1_0= '*' ) )? )
            {
            // InternalMyUiDsl.g:388:2: ( ( (lv_number_0_0= RULE_INT ) ) ( (lv_vertical_1_0= '*' ) )? )
            // InternalMyUiDsl.g:389:3: ( (lv_number_0_0= RULE_INT ) ) ( (lv_vertical_1_0= '*' ) )?
            {
            // InternalMyUiDsl.g:389:3: ( (lv_number_0_0= RULE_INT ) )
            // InternalMyUiDsl.g:390:4: (lv_number_0_0= RULE_INT )
            {
            // InternalMyUiDsl.g:390:4: (lv_number_0_0= RULE_INT )
            // InternalMyUiDsl.g:391:5: lv_number_0_0= RULE_INT
            {
            lv_number_0_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_number_0_0, grammarAccess.getSelfRepeatAccess().getNumberINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelfRepeatRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyUiDsl.g:407:3: ( (lv_vertical_1_0= '*' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyUiDsl.g:408:4: (lv_vertical_1_0= '*' )
                    {
                    // InternalMyUiDsl.g:408:4: (lv_vertical_1_0= '*' )
                    // InternalMyUiDsl.g:409:5: lv_vertical_1_0= '*'
                    {
                    lv_vertical_1_0=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_vertical_1_0, grammarAccess.getSelfRepeatAccess().getVerticalAsteriskKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSelfRepeatRule());
                    					}
                    					setWithLastConsumed(current, "vertical", true, "*");
                    				

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
    // $ANTLR end "ruleSelfRepeat"


    // $ANTLR start "entryRuleAccessory"
    // InternalMyUiDsl.g:425:1: entryRuleAccessory returns [EObject current=null] : iv_ruleAccessory= ruleAccessory EOF ;
    public final EObject entryRuleAccessory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessory = null;


        try {
            // InternalMyUiDsl.g:425:50: (iv_ruleAccessory= ruleAccessory EOF )
            // InternalMyUiDsl.g:426:2: iv_ruleAccessory= ruleAccessory EOF
            {
             newCompositeNode(grammarAccess.getAccessoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessory=ruleAccessory();

            state._fsp--;

             current =iv_ruleAccessory; 
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
    // $ANTLR end "entryRuleAccessory"


    // $ANTLR start "ruleAccessory"
    // InternalMyUiDsl.g:432:1: ruleAccessory returns [EObject current=null] : ( ( (lv_left_0_0= ruleNode ) ) otherlv_1= ':' ( ( ( ( ({...}? => ( ({...}? => ( (lv_text_3_0= ruleInnerText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_6_0= ruleInnerType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleAccessory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_text_3_0 = null;

        EObject lv_style_4_0 = null;

        EObject lv_clazz_5_0 = null;

        EObject lv_type_6_0 = null;

        EObject lv_feature_7_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:438:2: ( ( ( (lv_left_0_0= ruleNode ) ) otherlv_1= ':' ( ( ( ( ({...}? => ( ({...}? => ( (lv_text_3_0= ruleInnerText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_6_0= ruleInnerType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) ) ) ) )* ) ) ) ) )
            // InternalMyUiDsl.g:439:2: ( ( (lv_left_0_0= ruleNode ) ) otherlv_1= ':' ( ( ( ( ({...}? => ( ({...}? => ( (lv_text_3_0= ruleInnerText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_6_0= ruleInnerType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) ) ) ) )* ) ) ) )
            {
            // InternalMyUiDsl.g:439:2: ( ( (lv_left_0_0= ruleNode ) ) otherlv_1= ':' ( ( ( ( ({...}? => ( ({...}? => ( (lv_text_3_0= ruleInnerText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_6_0= ruleInnerType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) ) ) ) )* ) ) ) )
            // InternalMyUiDsl.g:440:3: ( (lv_left_0_0= ruleNode ) ) otherlv_1= ':' ( ( ( ( ({...}? => ( ({...}? => ( (lv_text_3_0= ruleInnerText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_6_0= ruleInnerType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) ) ) ) )* ) ) )
            {
            // InternalMyUiDsl.g:440:3: ( (lv_left_0_0= ruleNode ) )
            // InternalMyUiDsl.g:441:4: (lv_left_0_0= ruleNode )
            {
            // InternalMyUiDsl.g:441:4: (lv_left_0_0= ruleNode )
            // InternalMyUiDsl.g:442:5: lv_left_0_0= ruleNode
            {

            					newCompositeNode(grammarAccess.getAccessoryAccess().getLeftNodeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_left_0_0=ruleNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccessoryRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.Node");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAccessoryAccess().getColonKeyword_1());
            		
            // InternalMyUiDsl.g:463:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_text_3_0= ruleInnerText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_6_0= ruleInnerType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) ) ) ) )* ) ) )
            // InternalMyUiDsl.g:464:4: ( ( ( ({...}? => ( ({...}? => ( (lv_text_3_0= ruleInnerText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_6_0= ruleInnerType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) ) ) ) )* ) )
            {
            // InternalMyUiDsl.g:464:4: ( ( ( ({...}? => ( ({...}? => ( (lv_text_3_0= ruleInnerText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_6_0= ruleInnerType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) ) ) ) )* ) )
            // InternalMyUiDsl.g:465:5: ( ( ({...}? => ( ({...}? => ( (lv_text_3_0= ruleInnerText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_6_0= ruleInnerType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAccessoryAccess().getUnorderedGroup_2());
            				
            // InternalMyUiDsl.g:468:5: ( ( ({...}? => ( ({...}? => ( (lv_text_3_0= ruleInnerText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_6_0= ruleInnerType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) ) ) ) )* )
            // InternalMyUiDsl.g:469:6: ( ({...}? => ( ({...}? => ( (lv_text_3_0= ruleInnerText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_6_0= ruleInnerType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) ) ) ) )*
            {
            // InternalMyUiDsl.g:469:6: ( ({...}? => ( ({...}? => ( (lv_text_3_0= ruleInnerText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_type_6_0= ruleInnerType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) ) ) ) )*
            loop8:
            do {
                int alt8=6;
                int LA8_0 = input.LA(1);

                if ( LA8_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 1) ) {
                    alt8=2;
                }
                else if ( LA8_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 2) ) {
                    alt8=3;
                }
                else if ( LA8_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 3) ) {
                    alt8=4;
                }
                else if ( LA8_0 == RULE_STRING2 && getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 4) ) {
                    alt8=5;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyUiDsl.g:470:4: ({...}? => ( ({...}? => ( (lv_text_3_0= ruleInnerText ) ) ) ) )
            	    {
            	    // InternalMyUiDsl.g:470:4: ({...}? => ( ({...}? => ( (lv_text_3_0= ruleInnerText ) ) ) ) )
            	    // InternalMyUiDsl.g:471:5: {...}? => ( ({...}? => ( (lv_text_3_0= ruleInnerText ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAccessory", "getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyUiDsl.g:471:106: ( ({...}? => ( (lv_text_3_0= ruleInnerText ) ) ) )
            	    // InternalMyUiDsl.g:472:6: ({...}? => ( (lv_text_3_0= ruleInnerText ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyUiDsl.g:475:9: ({...}? => ( (lv_text_3_0= ruleInnerText ) ) )
            	    // InternalMyUiDsl.g:475:10: {...}? => ( (lv_text_3_0= ruleInnerText ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAccessory", "true");
            	    }
            	    // InternalMyUiDsl.g:475:19: ( (lv_text_3_0= ruleInnerText ) )
            	    // InternalMyUiDsl.g:475:20: (lv_text_3_0= ruleInnerText )
            	    {
            	    // InternalMyUiDsl.g:475:20: (lv_text_3_0= ruleInnerText )
            	    // InternalMyUiDsl.g:476:10: lv_text_3_0= ruleInnerText
            	    {

            	    										newCompositeNode(grammarAccess.getAccessoryAccess().getTextInnerTextParserRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_text_3_0=ruleInnerText();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAccessoryRule());
            	    										}
            	    										set(
            	    											current,
            	    											"text",
            	    											lv_text_3_0,
            	    											"edu.aut.islab.ghaemi.minuy.MyUiDsl.InnerText");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAccessoryAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyUiDsl.g:498:4: ({...}? => ( ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) ) ) )
            	    {
            	    // InternalMyUiDsl.g:498:4: ({...}? => ( ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) ) ) )
            	    // InternalMyUiDsl.g:499:5: {...}? => ( ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAccessory", "getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyUiDsl.g:499:106: ( ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) ) )
            	    // InternalMyUiDsl.g:500:6: ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyUiDsl.g:503:9: ({...}? => ( (lv_style_4_0= ruleInnerStyle ) ) )
            	    // InternalMyUiDsl.g:503:10: {...}? => ( (lv_style_4_0= ruleInnerStyle ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAccessory", "true");
            	    }
            	    // InternalMyUiDsl.g:503:19: ( (lv_style_4_0= ruleInnerStyle ) )
            	    // InternalMyUiDsl.g:503:20: (lv_style_4_0= ruleInnerStyle )
            	    {
            	    // InternalMyUiDsl.g:503:20: (lv_style_4_0= ruleInnerStyle )
            	    // InternalMyUiDsl.g:504:10: lv_style_4_0= ruleInnerStyle
            	    {

            	    										newCompositeNode(grammarAccess.getAccessoryAccess().getStyleInnerStyleParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_style_4_0=ruleInnerStyle();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAccessoryRule());
            	    										}
            	    										set(
            	    											current,
            	    											"style",
            	    											lv_style_4_0,
            	    											"edu.aut.islab.ghaemi.minuy.MyUiDsl.InnerStyle");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAccessoryAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyUiDsl.g:526:4: ({...}? => ( ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) ) ) )
            	    {
            	    // InternalMyUiDsl.g:526:4: ({...}? => ( ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) ) ) )
            	    // InternalMyUiDsl.g:527:5: {...}? => ( ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAccessory", "getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyUiDsl.g:527:106: ( ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) ) )
            	    // InternalMyUiDsl.g:528:6: ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyUiDsl.g:531:9: ({...}? => ( (lv_clazz_5_0= ruleInnerClass ) ) )
            	    // InternalMyUiDsl.g:531:10: {...}? => ( (lv_clazz_5_0= ruleInnerClass ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAccessory", "true");
            	    }
            	    // InternalMyUiDsl.g:531:19: ( (lv_clazz_5_0= ruleInnerClass ) )
            	    // InternalMyUiDsl.g:531:20: (lv_clazz_5_0= ruleInnerClass )
            	    {
            	    // InternalMyUiDsl.g:531:20: (lv_clazz_5_0= ruleInnerClass )
            	    // InternalMyUiDsl.g:532:10: lv_clazz_5_0= ruleInnerClass
            	    {

            	    										newCompositeNode(grammarAccess.getAccessoryAccess().getClazzInnerClassParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_clazz_5_0=ruleInnerClass();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAccessoryRule());
            	    										}
            	    										set(
            	    											current,
            	    											"clazz",
            	    											lv_clazz_5_0,
            	    											"edu.aut.islab.ghaemi.minuy.MyUiDsl.InnerClass");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAccessoryAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyUiDsl.g:554:4: ({...}? => ( ({...}? => ( (lv_type_6_0= ruleInnerType ) ) ) ) )
            	    {
            	    // InternalMyUiDsl.g:554:4: ({...}? => ( ({...}? => ( (lv_type_6_0= ruleInnerType ) ) ) ) )
            	    // InternalMyUiDsl.g:555:5: {...}? => ( ({...}? => ( (lv_type_6_0= ruleInnerType ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAccessory", "getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyUiDsl.g:555:106: ( ({...}? => ( (lv_type_6_0= ruleInnerType ) ) ) )
            	    // InternalMyUiDsl.g:556:6: ({...}? => ( (lv_type_6_0= ruleInnerType ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyUiDsl.g:559:9: ({...}? => ( (lv_type_6_0= ruleInnerType ) ) )
            	    // InternalMyUiDsl.g:559:10: {...}? => ( (lv_type_6_0= ruleInnerType ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAccessory", "true");
            	    }
            	    // InternalMyUiDsl.g:559:19: ( (lv_type_6_0= ruleInnerType ) )
            	    // InternalMyUiDsl.g:559:20: (lv_type_6_0= ruleInnerType )
            	    {
            	    // InternalMyUiDsl.g:559:20: (lv_type_6_0= ruleInnerType )
            	    // InternalMyUiDsl.g:560:10: lv_type_6_0= ruleInnerType
            	    {

            	    										newCompositeNode(grammarAccess.getAccessoryAccess().getTypeInnerTypeParserRuleCall_2_3_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_type_6_0=ruleInnerType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAccessoryRule());
            	    										}
            	    										set(
            	    											current,
            	    											"type",
            	    											lv_type_6_0,
            	    											"edu.aut.islab.ghaemi.minuy.MyUiDsl.InnerType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAccessoryAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyUiDsl.g:582:4: ({...}? => ( ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) ) ) )
            	    {
            	    // InternalMyUiDsl.g:582:4: ({...}? => ( ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) ) ) )
            	    // InternalMyUiDsl.g:583:5: {...}? => ( ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAccessory", "getUnorderedGroupHelper().canSelect(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyUiDsl.g:583:106: ( ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) ) )
            	    // InternalMyUiDsl.g:584:6: ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAccessoryAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyUiDsl.g:587:9: ({...}? => ( (lv_feature_7_0= ruleInnerFeature ) ) )
            	    // InternalMyUiDsl.g:587:10: {...}? => ( (lv_feature_7_0= ruleInnerFeature ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAccessory", "true");
            	    }
            	    // InternalMyUiDsl.g:587:19: ( (lv_feature_7_0= ruleInnerFeature ) )
            	    // InternalMyUiDsl.g:587:20: (lv_feature_7_0= ruleInnerFeature )
            	    {
            	    // InternalMyUiDsl.g:587:20: (lv_feature_7_0= ruleInnerFeature )
            	    // InternalMyUiDsl.g:588:10: lv_feature_7_0= ruleInnerFeature
            	    {

            	    										newCompositeNode(grammarAccess.getAccessoryAccess().getFeatureInnerFeatureParserRuleCall_2_4_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_feature_7_0=ruleInnerFeature();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAccessoryRule());
            	    										}
            	    										set(
            	    											current,
            	    											"feature",
            	    											lv_feature_7_0,
            	    											"edu.aut.islab.ghaemi.minuy.MyUiDsl.InnerFeature");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAccessoryAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAccessoryAccess().getUnorderedGroup_2());
            				

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
    // $ANTLR end "ruleAccessory"


    // $ANTLR start "entryRuleInnerFeature"
    // InternalMyUiDsl.g:621:1: entryRuleInnerFeature returns [EObject current=null] : iv_ruleInnerFeature= ruleInnerFeature EOF ;
    public final EObject entryRuleInnerFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerFeature = null;


        try {
            // InternalMyUiDsl.g:621:53: (iv_ruleInnerFeature= ruleInnerFeature EOF )
            // InternalMyUiDsl.g:622:2: iv_ruleInnerFeature= ruleInnerFeature EOF
            {
             newCompositeNode(grammarAccess.getInnerFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInnerFeature=ruleInnerFeature();

            state._fsp--;

             current =iv_ruleInnerFeature; 
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
    // $ANTLR end "entryRuleInnerFeature"


    // $ANTLR start "ruleInnerFeature"
    // InternalMyUiDsl.g:628:1: ruleInnerFeature returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING2 ) ) ) ;
    public final EObject ruleInnerFeature() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:634:2: ( ( () ( (lv_value_1_0= RULE_STRING2 ) ) ) )
            // InternalMyUiDsl.g:635:2: ( () ( (lv_value_1_0= RULE_STRING2 ) ) )
            {
            // InternalMyUiDsl.g:635:2: ( () ( (lv_value_1_0= RULE_STRING2 ) ) )
            // InternalMyUiDsl.g:636:3: () ( (lv_value_1_0= RULE_STRING2 ) )
            {
            // InternalMyUiDsl.g:636:3: ()
            // InternalMyUiDsl.g:637:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInnerFeatureAccess().getInnerFeatureAction_0(),
            					current);
            			

            }

            // InternalMyUiDsl.g:643:3: ( (lv_value_1_0= RULE_STRING2 ) )
            // InternalMyUiDsl.g:644:4: (lv_value_1_0= RULE_STRING2 )
            {
            // InternalMyUiDsl.g:644:4: (lv_value_1_0= RULE_STRING2 )
            // InternalMyUiDsl.g:645:5: lv_value_1_0= RULE_STRING2
            {
            lv_value_1_0=(Token)match(input,RULE_STRING2,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getInnerFeatureAccess().getValueSTRING2TerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInnerFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.STRING2");
            				

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
    // $ANTLR end "ruleInnerFeature"


    // $ANTLR start "entryRuleInnerText"
    // InternalMyUiDsl.g:665:1: entryRuleInnerText returns [EObject current=null] : iv_ruleInnerText= ruleInnerText EOF ;
    public final EObject entryRuleInnerText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerText = null;


        try {
            // InternalMyUiDsl.g:665:50: (iv_ruleInnerText= ruleInnerText EOF )
            // InternalMyUiDsl.g:666:2: iv_ruleInnerText= ruleInnerText EOF
            {
             newCompositeNode(grammarAccess.getInnerTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInnerText=ruleInnerText();

            state._fsp--;

             current =iv_ruleInnerText; 
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
    // $ANTLR end "entryRuleInnerText"


    // $ANTLR start "ruleInnerText"
    // InternalMyUiDsl.g:672:1: ruleInnerText returns [EObject current=null] : (otherlv_0= '<' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '>' ) ;
    public final EObject ruleInnerText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:678:2: ( (otherlv_0= '<' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '>' ) )
            // InternalMyUiDsl.g:679:2: (otherlv_0= '<' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '>' )
            {
            // InternalMyUiDsl.g:679:2: (otherlv_0= '<' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '>' )
            // InternalMyUiDsl.g:680:3: otherlv_0= '<' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getInnerTextAccess().getLessThanSignKeyword_0());
            		
            // InternalMyUiDsl.g:684:3: ( (lv_value_1_0= RULE_ID ) )
            // InternalMyUiDsl.g:685:4: (lv_value_1_0= RULE_ID )
            {
            // InternalMyUiDsl.g:685:4: (lv_value_1_0= RULE_ID )
            // InternalMyUiDsl.g:686:5: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_value_1_0, grammarAccess.getInnerTextAccess().getValueIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInnerTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getInnerTextAccess().getGreaterThanSignKeyword_2());
            		

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
    // $ANTLR end "ruleInnerText"


    // $ANTLR start "entryRuleInnerStyle"
    // InternalMyUiDsl.g:710:1: entryRuleInnerStyle returns [EObject current=null] : iv_ruleInnerStyle= ruleInnerStyle EOF ;
    public final EObject entryRuleInnerStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerStyle = null;


        try {
            // InternalMyUiDsl.g:710:51: (iv_ruleInnerStyle= ruleInnerStyle EOF )
            // InternalMyUiDsl.g:711:2: iv_ruleInnerStyle= ruleInnerStyle EOF
            {
             newCompositeNode(grammarAccess.getInnerStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInnerStyle=ruleInnerStyle();

            state._fsp--;

             current =iv_ruleInnerStyle; 
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
    // $ANTLR end "entryRuleInnerStyle"


    // $ANTLR start "ruleInnerStyle"
    // InternalMyUiDsl.g:717:1: ruleInnerStyle returns [EObject current=null] : (otherlv_0= '(' () ( (lv_styles_2_0= ruleCssStyle ) )* otherlv_3= ')' ) ;
    public final EObject ruleInnerStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_styles_2_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:723:2: ( (otherlv_0= '(' () ( (lv_styles_2_0= ruleCssStyle ) )* otherlv_3= ')' ) )
            // InternalMyUiDsl.g:724:2: (otherlv_0= '(' () ( (lv_styles_2_0= ruleCssStyle ) )* otherlv_3= ')' )
            {
            // InternalMyUiDsl.g:724:2: (otherlv_0= '(' () ( (lv_styles_2_0= ruleCssStyle ) )* otherlv_3= ')' )
            // InternalMyUiDsl.g:725:3: otherlv_0= '(' () ( (lv_styles_2_0= ruleCssStyle ) )* otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getInnerStyleAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyUiDsl.g:729:3: ()
            // InternalMyUiDsl.g:730:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInnerStyleAccess().getInnerStyleAction_1(),
            					current);
            			

            }

            // InternalMyUiDsl.g:736:3: ( (lv_styles_2_0= ruleCssStyle ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=31 && LA9_0<=33)||(LA9_0>=49 && LA9_0<=60)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyUiDsl.g:737:4: (lv_styles_2_0= ruleCssStyle )
            	    {
            	    // InternalMyUiDsl.g:737:4: (lv_styles_2_0= ruleCssStyle )
            	    // InternalMyUiDsl.g:738:5: lv_styles_2_0= ruleCssStyle
            	    {

            	    					newCompositeNode(grammarAccess.getInnerStyleAccess().getStylesCssStyleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_styles_2_0=ruleCssStyle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInnerStyleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"styles",
            	    						lv_styles_2_0,
            	    						"edu.aut.islab.ghaemi.minuy.MyUiDsl.CssStyle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInnerStyleAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleInnerStyle"


    // $ANTLR start "entryRuleInnerClass"
    // InternalMyUiDsl.g:763:1: entryRuleInnerClass returns [EObject current=null] : iv_ruleInnerClass= ruleInnerClass EOF ;
    public final EObject entryRuleInnerClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerClass = null;


        try {
            // InternalMyUiDsl.g:763:51: (iv_ruleInnerClass= ruleInnerClass EOF )
            // InternalMyUiDsl.g:764:2: iv_ruleInnerClass= ruleInnerClass EOF
            {
             newCompositeNode(grammarAccess.getInnerClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInnerClass=ruleInnerClass();

            state._fsp--;

             current =iv_ruleInnerClass; 
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
    // $ANTLR end "entryRuleInnerClass"


    // $ANTLR start "ruleInnerClass"
    // InternalMyUiDsl.g:770:1: ruleInnerClass returns [EObject current=null] : (otherlv_0= '[' ( (lv_clazzes_1_0= ruleClassName ) ) otherlv_2= ']' ) ;
    public final EObject ruleInnerClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_clazzes_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:776:2: ( (otherlv_0= '[' ( (lv_clazzes_1_0= ruleClassName ) ) otherlv_2= ']' ) )
            // InternalMyUiDsl.g:777:2: (otherlv_0= '[' ( (lv_clazzes_1_0= ruleClassName ) ) otherlv_2= ']' )
            {
            // InternalMyUiDsl.g:777:2: (otherlv_0= '[' ( (lv_clazzes_1_0= ruleClassName ) ) otherlv_2= ']' )
            // InternalMyUiDsl.g:778:3: otherlv_0= '[' ( (lv_clazzes_1_0= ruleClassName ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getInnerClassAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMyUiDsl.g:782:3: ( (lv_clazzes_1_0= ruleClassName ) )
            // InternalMyUiDsl.g:783:4: (lv_clazzes_1_0= ruleClassName )
            {
            // InternalMyUiDsl.g:783:4: (lv_clazzes_1_0= ruleClassName )
            // InternalMyUiDsl.g:784:5: lv_clazzes_1_0= ruleClassName
            {

            					newCompositeNode(grammarAccess.getInnerClassAccess().getClazzesClassNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_clazzes_1_0=ruleClassName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInnerClassRule());
            					}
            					set(
            						current,
            						"clazzes",
            						lv_clazzes_1_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.ClassName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getInnerClassAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleInnerClass"


    // $ANTLR start "entryRuleClassName"
    // InternalMyUiDsl.g:809:1: entryRuleClassName returns [EObject current=null] : iv_ruleClassName= ruleClassName EOF ;
    public final EObject entryRuleClassName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassName = null;


        try {
            // InternalMyUiDsl.g:809:50: (iv_ruleClassName= ruleClassName EOF )
            // InternalMyUiDsl.g:810:2: iv_ruleClassName= ruleClassName EOF
            {
             newCompositeNode(grammarAccess.getClassNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassName=ruleClassName();

            state._fsp--;

             current =iv_ruleClassName; 
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
    // $ANTLR end "entryRuleClassName"


    // $ANTLR start "ruleClassName"
    // InternalMyUiDsl.g:816:1: ruleClassName returns [EObject current=null] : ( ( (lv_theId_0_0= RULE_ID ) )? ( (lv_clazz_1_0= ruleClassNameSec ) )* ) ;
    public final EObject ruleClassName() throws RecognitionException {
        EObject current = null;

        Token lv_theId_0_0=null;
        EObject lv_clazz_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:822:2: ( ( ( (lv_theId_0_0= RULE_ID ) )? ( (lv_clazz_1_0= ruleClassNameSec ) )* ) )
            // InternalMyUiDsl.g:823:2: ( ( (lv_theId_0_0= RULE_ID ) )? ( (lv_clazz_1_0= ruleClassNameSec ) )* )
            {
            // InternalMyUiDsl.g:823:2: ( ( (lv_theId_0_0= RULE_ID ) )? ( (lv_clazz_1_0= ruleClassNameSec ) )* )
            // InternalMyUiDsl.g:824:3: ( (lv_theId_0_0= RULE_ID ) )? ( (lv_clazz_1_0= ruleClassNameSec ) )*
            {
            // InternalMyUiDsl.g:824:3: ( (lv_theId_0_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyUiDsl.g:825:4: (lv_theId_0_0= RULE_ID )
                    {
                    // InternalMyUiDsl.g:825:4: (lv_theId_0_0= RULE_ID )
                    // InternalMyUiDsl.g:826:5: lv_theId_0_0= RULE_ID
                    {
                    lv_theId_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    					newLeafNode(lv_theId_0_0, grammarAccess.getClassNameAccess().getTheIdIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"theId",
                    						lv_theId_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalMyUiDsl.g:842:3: ( (lv_clazz_1_0= ruleClassNameSec ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyUiDsl.g:843:4: (lv_clazz_1_0= ruleClassNameSec )
            	    {
            	    // InternalMyUiDsl.g:843:4: (lv_clazz_1_0= ruleClassNameSec )
            	    // InternalMyUiDsl.g:844:5: lv_clazz_1_0= ruleClassNameSec
            	    {

            	    					newCompositeNode(grammarAccess.getClassNameAccess().getClazzClassNameSecParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_clazz_1_0=ruleClassNameSec();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassNameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clazz",
            	    						lv_clazz_1_0,
            	    						"edu.aut.islab.ghaemi.minuy.MyUiDsl.ClassNameSec");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleClassName"


    // $ANTLR start "entryRuleClassNameSec"
    // InternalMyUiDsl.g:865:1: entryRuleClassNameSec returns [EObject current=null] : iv_ruleClassNameSec= ruleClassNameSec EOF ;
    public final EObject entryRuleClassNameSec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassNameSec = null;


        try {
            // InternalMyUiDsl.g:865:53: (iv_ruleClassNameSec= ruleClassNameSec EOF )
            // InternalMyUiDsl.g:866:2: iv_ruleClassNameSec= ruleClassNameSec EOF
            {
             newCompositeNode(grammarAccess.getClassNameSecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassNameSec=ruleClassNameSec();

            state._fsp--;

             current =iv_ruleClassNameSec; 
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
    // $ANTLR end "entryRuleClassNameSec"


    // $ANTLR start "ruleClassNameSec"
    // InternalMyUiDsl.g:872:1: ruleClassNameSec returns [EObject current=null] : (otherlv_0= ',' ( (lv_cfClazz_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClassNameSec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cfClazz_1_0=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:878:2: ( (otherlv_0= ',' ( (lv_cfClazz_1_0= RULE_ID ) ) ) )
            // InternalMyUiDsl.g:879:2: (otherlv_0= ',' ( (lv_cfClazz_1_0= RULE_ID ) ) )
            {
            // InternalMyUiDsl.g:879:2: (otherlv_0= ',' ( (lv_cfClazz_1_0= RULE_ID ) ) )
            // InternalMyUiDsl.g:880:3: otherlv_0= ',' ( (lv_cfClazz_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getClassNameSecAccess().getCommaKeyword_0());
            		
            // InternalMyUiDsl.g:884:3: ( (lv_cfClazz_1_0= RULE_ID ) )
            // InternalMyUiDsl.g:885:4: (lv_cfClazz_1_0= RULE_ID )
            {
            // InternalMyUiDsl.g:885:4: (lv_cfClazz_1_0= RULE_ID )
            // InternalMyUiDsl.g:886:5: lv_cfClazz_1_0= RULE_ID
            {
            lv_cfClazz_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_cfClazz_1_0, grammarAccess.getClassNameSecAccess().getCfClazzIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassNameSecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cfClazz",
            						lv_cfClazz_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleClassNameSec"


    // $ANTLR start "entryRuleInnerType"
    // InternalMyUiDsl.g:906:1: entryRuleInnerType returns [EObject current=null] : iv_ruleInnerType= ruleInnerType EOF ;
    public final EObject entryRuleInnerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerType = null;


        try {
            // InternalMyUiDsl.g:906:50: (iv_ruleInnerType= ruleInnerType EOF )
            // InternalMyUiDsl.g:907:2: iv_ruleInnerType= ruleInnerType EOF
            {
             newCompositeNode(grammarAccess.getInnerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInnerType=ruleInnerType();

            state._fsp--;

             current =iv_ruleInnerType; 
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
    // $ANTLR end "entryRuleInnerType"


    // $ANTLR start "ruleInnerType"
    // InternalMyUiDsl.g:913:1: ruleInnerType returns [EObject current=null] : (otherlv_0= '{' ( (lv_value_1_0= ruleInnerTypeArray ) ) otherlv_2= '}' ) ;
    public final EObject ruleInnerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:919:2: ( (otherlv_0= '{' ( (lv_value_1_0= ruleInnerTypeArray ) ) otherlv_2= '}' ) )
            // InternalMyUiDsl.g:920:2: (otherlv_0= '{' ( (lv_value_1_0= ruleInnerTypeArray ) ) otherlv_2= '}' )
            {
            // InternalMyUiDsl.g:920:2: (otherlv_0= '{' ( (lv_value_1_0= ruleInnerTypeArray ) ) otherlv_2= '}' )
            // InternalMyUiDsl.g:921:3: otherlv_0= '{' ( (lv_value_1_0= ruleInnerTypeArray ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getInnerTypeAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMyUiDsl.g:925:3: ( (lv_value_1_0= ruleInnerTypeArray ) )
            // InternalMyUiDsl.g:926:4: (lv_value_1_0= ruleInnerTypeArray )
            {
            // InternalMyUiDsl.g:926:4: (lv_value_1_0= ruleInnerTypeArray )
            // InternalMyUiDsl.g:927:5: lv_value_1_0= ruleInnerTypeArray
            {

            					newCompositeNode(grammarAccess.getInnerTypeAccess().getValueInnerTypeArrayEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_value_1_0=ruleInnerTypeArray();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInnerTypeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.InnerTypeArray");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getInnerTypeAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleInnerType"


    // $ANTLR start "entryRuleCssStyle"
    // InternalMyUiDsl.g:952:1: entryRuleCssStyle returns [EObject current=null] : iv_ruleCssStyle= ruleCssStyle EOF ;
    public final EObject entryRuleCssStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCssStyle = null;


        try {
            // InternalMyUiDsl.g:952:49: (iv_ruleCssStyle= ruleCssStyle EOF )
            // InternalMyUiDsl.g:953:2: iv_ruleCssStyle= ruleCssStyle EOF
            {
             newCompositeNode(grammarAccess.getCssStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCssStyle=ruleCssStyle();

            state._fsp--;

             current =iv_ruleCssStyle; 
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
    // $ANTLR end "entryRuleCssStyle"


    // $ANTLR start "ruleCssStyle"
    // InternalMyUiDsl.g:959:1: ruleCssStyle returns [EObject current=null] : ( (this_Pos_0= rulePos | this_Flt_1= ruleFlt | this_Clr_2= ruleClr | this_Disp_3= ruleDisp | this_VerAl_4= ruleVerAl | this_Wid_5= ruleWid | this_H8_6= ruleH8 | this_Coord_7= ruleCoord | this_OFlow_8= ruleOFlow | this_Marg_9= ruleMarg | this_Padd_10= rulePadd | this_Border_11= ruleBorder | this_BorderRad_12= ruleBorderRad | this_Color_13= ruleColor | this_BackColor_14= ruleBackColor ) otherlv_15= ';' ) ;
    public final EObject ruleCssStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_15=null;
        EObject this_Pos_0 = null;

        EObject this_Flt_1 = null;

        EObject this_Clr_2 = null;

        EObject this_Disp_3 = null;

        EObject this_VerAl_4 = null;

        EObject this_Wid_5 = null;

        EObject this_H8_6 = null;

        EObject this_Coord_7 = null;

        EObject this_OFlow_8 = null;

        EObject this_Marg_9 = null;

        EObject this_Padd_10 = null;

        EObject this_Border_11 = null;

        EObject this_BorderRad_12 = null;

        EObject this_Color_13 = null;

        EObject this_BackColor_14 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:965:2: ( ( (this_Pos_0= rulePos | this_Flt_1= ruleFlt | this_Clr_2= ruleClr | this_Disp_3= ruleDisp | this_VerAl_4= ruleVerAl | this_Wid_5= ruleWid | this_H8_6= ruleH8 | this_Coord_7= ruleCoord | this_OFlow_8= ruleOFlow | this_Marg_9= ruleMarg | this_Padd_10= rulePadd | this_Border_11= ruleBorder | this_BorderRad_12= ruleBorderRad | this_Color_13= ruleColor | this_BackColor_14= ruleBackColor ) otherlv_15= ';' ) )
            // InternalMyUiDsl.g:966:2: ( (this_Pos_0= rulePos | this_Flt_1= ruleFlt | this_Clr_2= ruleClr | this_Disp_3= ruleDisp | this_VerAl_4= ruleVerAl | this_Wid_5= ruleWid | this_H8_6= ruleH8 | this_Coord_7= ruleCoord | this_OFlow_8= ruleOFlow | this_Marg_9= ruleMarg | this_Padd_10= rulePadd | this_Border_11= ruleBorder | this_BorderRad_12= ruleBorderRad | this_Color_13= ruleColor | this_BackColor_14= ruleBackColor ) otherlv_15= ';' )
            {
            // InternalMyUiDsl.g:966:2: ( (this_Pos_0= rulePos | this_Flt_1= ruleFlt | this_Clr_2= ruleClr | this_Disp_3= ruleDisp | this_VerAl_4= ruleVerAl | this_Wid_5= ruleWid | this_H8_6= ruleH8 | this_Coord_7= ruleCoord | this_OFlow_8= ruleOFlow | this_Marg_9= ruleMarg | this_Padd_10= rulePadd | this_Border_11= ruleBorder | this_BorderRad_12= ruleBorderRad | this_Color_13= ruleColor | this_BackColor_14= ruleBackColor ) otherlv_15= ';' )
            // InternalMyUiDsl.g:967:3: (this_Pos_0= rulePos | this_Flt_1= ruleFlt | this_Clr_2= ruleClr | this_Disp_3= ruleDisp | this_VerAl_4= ruleVerAl | this_Wid_5= ruleWid | this_H8_6= ruleH8 | this_Coord_7= ruleCoord | this_OFlow_8= ruleOFlow | this_Marg_9= ruleMarg | this_Padd_10= rulePadd | this_Border_11= ruleBorder | this_BorderRad_12= ruleBorderRad | this_Color_13= ruleColor | this_BackColor_14= ruleBackColor ) otherlv_15= ';'
            {
            // InternalMyUiDsl.g:967:3: (this_Pos_0= rulePos | this_Flt_1= ruleFlt | this_Clr_2= ruleClr | this_Disp_3= ruleDisp | this_VerAl_4= ruleVerAl | this_Wid_5= ruleWid | this_H8_6= ruleH8 | this_Coord_7= ruleCoord | this_OFlow_8= ruleOFlow | this_Marg_9= ruleMarg | this_Padd_10= rulePadd | this_Border_11= ruleBorder | this_BorderRad_12= ruleBorderRad | this_Color_13= ruleColor | this_BackColor_14= ruleBackColor )
            int alt12=15;
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
            case 53:
                {
                alt12=4;
                }
                break;
            case 54:
                {
                alt12=5;
                }
                break;
            case 56:
                {
                alt12=6;
                }
                break;
            case 57:
                {
                alt12=7;
                }
                break;
            case 58:
                {
                alt12=8;
                }
                break;
            case 55:
                {
                alt12=9;
                }
                break;
            case 59:
                {
                alt12=10;
                }
                break;
            case 60:
                {
                alt12=11;
                }
                break;
            case 31:
                {
                alt12=12;
                }
                break;
            case 49:
                {
                alt12=13;
                }
                break;
            case 32:
                {
                alt12=14;
                }
                break;
            case 33:
                {
                alt12=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyUiDsl.g:968:4: this_Pos_0= rulePos
                    {

                    				newCompositeNode(grammarAccess.getCssStyleAccess().getPosParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_10);
                    this_Pos_0=rulePos();

                    state._fsp--;


                    				current = this_Pos_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:977:4: this_Flt_1= ruleFlt
                    {

                    				newCompositeNode(grammarAccess.getCssStyleAccess().getFltParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Flt_1=ruleFlt();

                    state._fsp--;


                    				current = this_Flt_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:986:4: this_Clr_2= ruleClr
                    {

                    				newCompositeNode(grammarAccess.getCssStyleAccess().getClrParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_10);
                    this_Clr_2=ruleClr();

                    state._fsp--;


                    				current = this_Clr_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:995:4: this_Disp_3= ruleDisp
                    {

                    				newCompositeNode(grammarAccess.getCssStyleAccess().getDispParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_10);
                    this_Disp_3=ruleDisp();

                    state._fsp--;


                    				current = this_Disp_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalMyUiDsl.g:1004:4: this_VerAl_4= ruleVerAl
                    {

                    				newCompositeNode(grammarAccess.getCssStyleAccess().getVerAlParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_10);
                    this_VerAl_4=ruleVerAl();

                    state._fsp--;


                    				current = this_VerAl_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalMyUiDsl.g:1013:4: this_Wid_5= ruleWid
                    {

                    				newCompositeNode(grammarAccess.getCssStyleAccess().getWidParserRuleCall_0_5());
                    			
                    pushFollow(FOLLOW_10);
                    this_Wid_5=ruleWid();

                    state._fsp--;


                    				current = this_Wid_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalMyUiDsl.g:1022:4: this_H8_6= ruleH8
                    {

                    				newCompositeNode(grammarAccess.getCssStyleAccess().getH8ParserRuleCall_0_6());
                    			
                    pushFollow(FOLLOW_10);
                    this_H8_6=ruleH8();

                    state._fsp--;


                    				current = this_H8_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 8 :
                    // InternalMyUiDsl.g:1031:4: this_Coord_7= ruleCoord
                    {

                    				newCompositeNode(grammarAccess.getCssStyleAccess().getCoordParserRuleCall_0_7());
                    			
                    pushFollow(FOLLOW_10);
                    this_Coord_7=ruleCoord();

                    state._fsp--;


                    				current = this_Coord_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 9 :
                    // InternalMyUiDsl.g:1040:4: this_OFlow_8= ruleOFlow
                    {

                    				newCompositeNode(grammarAccess.getCssStyleAccess().getOFlowParserRuleCall_0_8());
                    			
                    pushFollow(FOLLOW_10);
                    this_OFlow_8=ruleOFlow();

                    state._fsp--;


                    				current = this_OFlow_8;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 10 :
                    // InternalMyUiDsl.g:1049:4: this_Marg_9= ruleMarg
                    {

                    				newCompositeNode(grammarAccess.getCssStyleAccess().getMargParserRuleCall_0_9());
                    			
                    pushFollow(FOLLOW_10);
                    this_Marg_9=ruleMarg();

                    state._fsp--;


                    				current = this_Marg_9;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 11 :
                    // InternalMyUiDsl.g:1058:4: this_Padd_10= rulePadd
                    {

                    				newCompositeNode(grammarAccess.getCssStyleAccess().getPaddParserRuleCall_0_10());
                    			
                    pushFollow(FOLLOW_10);
                    this_Padd_10=rulePadd();

                    state._fsp--;


                    				current = this_Padd_10;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 12 :
                    // InternalMyUiDsl.g:1067:4: this_Border_11= ruleBorder
                    {

                    				newCompositeNode(grammarAccess.getCssStyleAccess().getBorderParserRuleCall_0_11());
                    			
                    pushFollow(FOLLOW_10);
                    this_Border_11=ruleBorder();

                    state._fsp--;


                    				current = this_Border_11;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 13 :
                    // InternalMyUiDsl.g:1076:4: this_BorderRad_12= ruleBorderRad
                    {

                    				newCompositeNode(grammarAccess.getCssStyleAccess().getBorderRadParserRuleCall_0_12());
                    			
                    pushFollow(FOLLOW_10);
                    this_BorderRad_12=ruleBorderRad();

                    state._fsp--;


                    				current = this_BorderRad_12;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 14 :
                    // InternalMyUiDsl.g:1085:4: this_Color_13= ruleColor
                    {

                    				newCompositeNode(grammarAccess.getCssStyleAccess().getColorParserRuleCall_0_13());
                    			
                    pushFollow(FOLLOW_10);
                    this_Color_13=ruleColor();

                    state._fsp--;


                    				current = this_Color_13;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 15 :
                    // InternalMyUiDsl.g:1094:4: this_BackColor_14= ruleBackColor
                    {

                    				newCompositeNode(grammarAccess.getCssStyleAccess().getBackColorParserRuleCall_0_14());
                    			
                    pushFollow(FOLLOW_10);
                    this_BackColor_14=ruleBackColor();

                    state._fsp--;


                    				current = this_BackColor_14;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getCssStyleAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleCssStyle"


    // $ANTLR start "entryRuleBorder"
    // InternalMyUiDsl.g:1111:1: entryRuleBorder returns [EObject current=null] : iv_ruleBorder= ruleBorder EOF ;
    public final EObject entryRuleBorder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorder = null;


        try {
            // InternalMyUiDsl.g:1111:47: (iv_ruleBorder= ruleBorder EOF )
            // InternalMyUiDsl.g:1112:2: iv_ruleBorder= ruleBorder EOF
            {
             newCompositeNode(grammarAccess.getBorderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBorder=ruleBorder();

            state._fsp--;

             current =iv_ruleBorder; 
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
    // $ANTLR end "entryRuleBorder"


    // $ANTLR start "ruleBorder"
    // InternalMyUiDsl.g:1118:1: ruleBorder returns [EObject current=null] : (otherlv_0= 'border:' ( (lv_value_1_0= rulecolorDef ) ) ) ;
    public final EObject ruleBorder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:1124:2: ( (otherlv_0= 'border:' ( (lv_value_1_0= rulecolorDef ) ) ) )
            // InternalMyUiDsl.g:1125:2: (otherlv_0= 'border:' ( (lv_value_1_0= rulecolorDef ) ) )
            {
            // InternalMyUiDsl.g:1125:2: (otherlv_0= 'border:' ( (lv_value_1_0= rulecolorDef ) ) )
            // InternalMyUiDsl.g:1126:3: otherlv_0= 'border:' ( (lv_value_1_0= rulecolorDef ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getBorderAccess().getBorderKeyword_0());
            		
            // InternalMyUiDsl.g:1130:3: ( (lv_value_1_0= rulecolorDef ) )
            // InternalMyUiDsl.g:1131:4: (lv_value_1_0= rulecolorDef )
            {
            // InternalMyUiDsl.g:1131:4: (lv_value_1_0= rulecolorDef )
            // InternalMyUiDsl.g:1132:5: lv_value_1_0= rulecolorDef
            {

            					newCompositeNode(grammarAccess.getBorderAccess().getValueColorDefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=rulecolorDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBorderRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.colorDef");
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
    // $ANTLR end "ruleBorder"


    // $ANTLR start "entryRuleColor"
    // InternalMyUiDsl.g:1153:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalMyUiDsl.g:1153:46: (iv_ruleColor= ruleColor EOF )
            // InternalMyUiDsl.g:1154:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalMyUiDsl.g:1160:1: ruleColor returns [EObject current=null] : (otherlv_0= 'color:' ( (lv_value_1_0= rulecolorDef ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:1166:2: ( (otherlv_0= 'color:' ( (lv_value_1_0= rulecolorDef ) ) ) )
            // InternalMyUiDsl.g:1167:2: (otherlv_0= 'color:' ( (lv_value_1_0= rulecolorDef ) ) )
            {
            // InternalMyUiDsl.g:1167:2: (otherlv_0= 'color:' ( (lv_value_1_0= rulecolorDef ) ) )
            // InternalMyUiDsl.g:1168:3: otherlv_0= 'color:' ( (lv_value_1_0= rulecolorDef ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
            		
            // InternalMyUiDsl.g:1172:3: ( (lv_value_1_0= rulecolorDef ) )
            // InternalMyUiDsl.g:1173:4: (lv_value_1_0= rulecolorDef )
            {
            // InternalMyUiDsl.g:1173:4: (lv_value_1_0= rulecolorDef )
            // InternalMyUiDsl.g:1174:5: lv_value_1_0= rulecolorDef
            {

            					newCompositeNode(grammarAccess.getColorAccess().getValueColorDefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=rulecolorDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.colorDef");
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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleBackColor"
    // InternalMyUiDsl.g:1195:1: entryRuleBackColor returns [EObject current=null] : iv_ruleBackColor= ruleBackColor EOF ;
    public final EObject entryRuleBackColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackColor = null;


        try {
            // InternalMyUiDsl.g:1195:50: (iv_ruleBackColor= ruleBackColor EOF )
            // InternalMyUiDsl.g:1196:2: iv_ruleBackColor= ruleBackColor EOF
            {
             newCompositeNode(grammarAccess.getBackColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackColor=ruleBackColor();

            state._fsp--;

             current =iv_ruleBackColor; 
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
    // $ANTLR end "entryRuleBackColor"


    // $ANTLR start "ruleBackColor"
    // InternalMyUiDsl.g:1202:1: ruleBackColor returns [EObject current=null] : (otherlv_0= 'bcolor:' ( (lv_value_1_0= rulecolorDef ) ) ) ;
    public final EObject ruleBackColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:1208:2: ( (otherlv_0= 'bcolor:' ( (lv_value_1_0= rulecolorDef ) ) ) )
            // InternalMyUiDsl.g:1209:2: (otherlv_0= 'bcolor:' ( (lv_value_1_0= rulecolorDef ) ) )
            {
            // InternalMyUiDsl.g:1209:2: (otherlv_0= 'bcolor:' ( (lv_value_1_0= rulecolorDef ) ) )
            // InternalMyUiDsl.g:1210:3: otherlv_0= 'bcolor:' ( (lv_value_1_0= rulecolorDef ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getBackColorAccess().getBcolorKeyword_0());
            		
            // InternalMyUiDsl.g:1214:3: ( (lv_value_1_0= rulecolorDef ) )
            // InternalMyUiDsl.g:1215:4: (lv_value_1_0= rulecolorDef )
            {
            // InternalMyUiDsl.g:1215:4: (lv_value_1_0= rulecolorDef )
            // InternalMyUiDsl.g:1216:5: lv_value_1_0= rulecolorDef
            {

            					newCompositeNode(grammarAccess.getBackColorAccess().getValueColorDefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=rulecolorDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackColorRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.colorDef");
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
    // $ANTLR end "ruleBackColor"


    // $ANTLR start "entryRulecolorDef"
    // InternalMyUiDsl.g:1237:1: entryRulecolorDef returns [EObject current=null] : iv_rulecolorDef= rulecolorDef EOF ;
    public final EObject entryRulecolorDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecolorDef = null;


        try {
            // InternalMyUiDsl.g:1237:49: (iv_rulecolorDef= rulecolorDef EOF )
            // InternalMyUiDsl.g:1238:2: iv_rulecolorDef= rulecolorDef EOF
            {
             newCompositeNode(grammarAccess.getColorDefRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecolorDef=rulecolorDef();

            state._fsp--;

             current =iv_rulecolorDef; 
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
    // $ANTLR end "entryRulecolorDef"


    // $ANTLR start "rulecolorDef"
    // InternalMyUiDsl.g:1244:1: rulecolorDef returns [EObject current=null] : (this_LiteralColor_0= ruleLiteralColor | this_RgbaColor_1= ruleRgbaColor ) ;
    public final EObject rulecolorDef() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralColor_0 = null;

        EObject this_RgbaColor_1 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:1250:2: ( (this_LiteralColor_0= ruleLiteralColor | this_RgbaColor_1= ruleRgbaColor ) )
            // InternalMyUiDsl.g:1251:2: (this_LiteralColor_0= ruleLiteralColor | this_RgbaColor_1= ruleRgbaColor )
            {
            // InternalMyUiDsl.g:1251:2: (this_LiteralColor_0= ruleLiteralColor | this_RgbaColor_1= ruleRgbaColor )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=34 && LA13_0<=43)) ) {
                alt13=1;
            }
            else if ( (LA13_0==44) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyUiDsl.g:1252:3: this_LiteralColor_0= ruleLiteralColor
                    {

                    			newCompositeNode(grammarAccess.getColorDefAccess().getLiteralColorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralColor_0=ruleLiteralColor();

                    state._fsp--;


                    			current = this_LiteralColor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:1261:3: this_RgbaColor_1= ruleRgbaColor
                    {

                    			newCompositeNode(grammarAccess.getColorDefAccess().getRgbaColorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RgbaColor_1=ruleRgbaColor();

                    state._fsp--;


                    			current = this_RgbaColor_1;
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
    // $ANTLR end "rulecolorDef"


    // $ANTLR start "entryRuleLiteralColor"
    // InternalMyUiDsl.g:1273:1: entryRuleLiteralColor returns [EObject current=null] : iv_ruleLiteralColor= ruleLiteralColor EOF ;
    public final EObject entryRuleLiteralColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralColor = null;


        try {
            // InternalMyUiDsl.g:1273:53: (iv_ruleLiteralColor= ruleLiteralColor EOF )
            // InternalMyUiDsl.g:1274:2: iv_ruleLiteralColor= ruleLiteralColor EOF
            {
             newCompositeNode(grammarAccess.getLiteralColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralColor=ruleLiteralColor();

            state._fsp--;

             current =iv_ruleLiteralColor; 
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
    // $ANTLR end "entryRuleLiteralColor"


    // $ANTLR start "ruleLiteralColor"
    // InternalMyUiDsl.g:1280:1: ruleLiteralColor returns [EObject current=null] : ( ( (lv_value_0_1= 'Red' | lv_value_0_2= 'Blue' | lv_value_0_3= 'Black' | lv_value_0_4= 'Green' | lv_value_0_5= 'Yellow' | lv_value_0_6= 'Pink' | lv_value_0_7= 'Brown' | lv_value_0_8= 'Gold' | lv_value_0_9= 'White' | lv_value_0_10= 'Grey' ) ) ) ;
    public final EObject ruleLiteralColor() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;
        Token lv_value_0_6=null;
        Token lv_value_0_7=null;
        Token lv_value_0_8=null;
        Token lv_value_0_9=null;
        Token lv_value_0_10=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:1286:2: ( ( ( (lv_value_0_1= 'Red' | lv_value_0_2= 'Blue' | lv_value_0_3= 'Black' | lv_value_0_4= 'Green' | lv_value_0_5= 'Yellow' | lv_value_0_6= 'Pink' | lv_value_0_7= 'Brown' | lv_value_0_8= 'Gold' | lv_value_0_9= 'White' | lv_value_0_10= 'Grey' ) ) ) )
            // InternalMyUiDsl.g:1287:2: ( ( (lv_value_0_1= 'Red' | lv_value_0_2= 'Blue' | lv_value_0_3= 'Black' | lv_value_0_4= 'Green' | lv_value_0_5= 'Yellow' | lv_value_0_6= 'Pink' | lv_value_0_7= 'Brown' | lv_value_0_8= 'Gold' | lv_value_0_9= 'White' | lv_value_0_10= 'Grey' ) ) )
            {
            // InternalMyUiDsl.g:1287:2: ( ( (lv_value_0_1= 'Red' | lv_value_0_2= 'Blue' | lv_value_0_3= 'Black' | lv_value_0_4= 'Green' | lv_value_0_5= 'Yellow' | lv_value_0_6= 'Pink' | lv_value_0_7= 'Brown' | lv_value_0_8= 'Gold' | lv_value_0_9= 'White' | lv_value_0_10= 'Grey' ) ) )
            // InternalMyUiDsl.g:1288:3: ( (lv_value_0_1= 'Red' | lv_value_0_2= 'Blue' | lv_value_0_3= 'Black' | lv_value_0_4= 'Green' | lv_value_0_5= 'Yellow' | lv_value_0_6= 'Pink' | lv_value_0_7= 'Brown' | lv_value_0_8= 'Gold' | lv_value_0_9= 'White' | lv_value_0_10= 'Grey' ) )
            {
            // InternalMyUiDsl.g:1288:3: ( (lv_value_0_1= 'Red' | lv_value_0_2= 'Blue' | lv_value_0_3= 'Black' | lv_value_0_4= 'Green' | lv_value_0_5= 'Yellow' | lv_value_0_6= 'Pink' | lv_value_0_7= 'Brown' | lv_value_0_8= 'Gold' | lv_value_0_9= 'White' | lv_value_0_10= 'Grey' ) )
            // InternalMyUiDsl.g:1289:4: (lv_value_0_1= 'Red' | lv_value_0_2= 'Blue' | lv_value_0_3= 'Black' | lv_value_0_4= 'Green' | lv_value_0_5= 'Yellow' | lv_value_0_6= 'Pink' | lv_value_0_7= 'Brown' | lv_value_0_8= 'Gold' | lv_value_0_9= 'White' | lv_value_0_10= 'Grey' )
            {
            // InternalMyUiDsl.g:1289:4: (lv_value_0_1= 'Red' | lv_value_0_2= 'Blue' | lv_value_0_3= 'Black' | lv_value_0_4= 'Green' | lv_value_0_5= 'Yellow' | lv_value_0_6= 'Pink' | lv_value_0_7= 'Brown' | lv_value_0_8= 'Gold' | lv_value_0_9= 'White' | lv_value_0_10= 'Grey' )
            int alt14=10;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt14=1;
                }
                break;
            case 35:
                {
                alt14=2;
                }
                break;
            case 36:
                {
                alt14=3;
                }
                break;
            case 37:
                {
                alt14=4;
                }
                break;
            case 38:
                {
                alt14=5;
                }
                break;
            case 39:
                {
                alt14=6;
                }
                break;
            case 40:
                {
                alt14=7;
                }
                break;
            case 41:
                {
                alt14=8;
                }
                break;
            case 42:
                {
                alt14=9;
                }
                break;
            case 43:
                {
                alt14=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyUiDsl.g:1290:5: lv_value_0_1= 'Red'
                    {
                    lv_value_0_1=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getLiteralColorAccess().getValueRedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralColorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:1301:5: lv_value_0_2= 'Blue'
                    {
                    lv_value_0_2=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getLiteralColorAccess().getValueBlueKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralColorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:1312:5: lv_value_0_3= 'Black'
                    {
                    lv_value_0_3=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_value_0_3, grammarAccess.getLiteralColorAccess().getValueBlackKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralColorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:1323:5: lv_value_0_4= 'Green'
                    {
                    lv_value_0_4=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_value_0_4, grammarAccess.getLiteralColorAccess().getValueGreenKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralColorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMyUiDsl.g:1334:5: lv_value_0_5= 'Yellow'
                    {
                    lv_value_0_5=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_value_0_5, grammarAccess.getLiteralColorAccess().getValueYellowKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralColorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalMyUiDsl.g:1345:5: lv_value_0_6= 'Pink'
                    {
                    lv_value_0_6=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_value_0_6, grammarAccess.getLiteralColorAccess().getValuePinkKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralColorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalMyUiDsl.g:1356:5: lv_value_0_7= 'Brown'
                    {
                    lv_value_0_7=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_value_0_7, grammarAccess.getLiteralColorAccess().getValueBrownKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralColorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalMyUiDsl.g:1367:5: lv_value_0_8= 'Gold'
                    {
                    lv_value_0_8=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_value_0_8, grammarAccess.getLiteralColorAccess().getValueGoldKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralColorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalMyUiDsl.g:1378:5: lv_value_0_9= 'White'
                    {
                    lv_value_0_9=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_value_0_9, grammarAccess.getLiteralColorAccess().getValueWhiteKeyword_0_8());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralColorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_9, null);
                    				

                    }
                    break;
                case 10 :
                    // InternalMyUiDsl.g:1389:5: lv_value_0_10= 'Grey'
                    {
                    lv_value_0_10=(Token)match(input,43,FOLLOW_2); 

                    					newLeafNode(lv_value_0_10, grammarAccess.getLiteralColorAccess().getValueGreyKeyword_0_9());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLiteralColorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_10, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleLiteralColor"


    // $ANTLR start "entryRuleRgbaColor"
    // InternalMyUiDsl.g:1405:1: entryRuleRgbaColor returns [EObject current=null] : iv_ruleRgbaColor= ruleRgbaColor EOF ;
    public final EObject entryRuleRgbaColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRgbaColor = null;


        try {
            // InternalMyUiDsl.g:1405:50: (iv_ruleRgbaColor= ruleRgbaColor EOF )
            // InternalMyUiDsl.g:1406:2: iv_ruleRgbaColor= ruleRgbaColor EOF
            {
             newCompositeNode(grammarAccess.getRgbaColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRgbaColor=ruleRgbaColor();

            state._fsp--;

             current =iv_ruleRgbaColor; 
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
    // $ANTLR end "entryRuleRgbaColor"


    // $ANTLR start "ruleRgbaColor"
    // InternalMyUiDsl.g:1412:1: ruleRgbaColor returns [EObject current=null] : (otherlv_0= 'rgba(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_rval_2_0= ruleRval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_gval_3_0= ruleGval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bval_4_0= ruleBval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aval_5_0= ruleAval ) ) ) ) ) )* ) ) ) otherlv_6= ')' ) ;
    public final EObject ruleRgbaColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_6=null;
        EObject lv_rval_2_0 = null;

        EObject lv_gval_3_0 = null;

        EObject lv_bval_4_0 = null;

        EObject lv_aval_5_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:1418:2: ( (otherlv_0= 'rgba(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_rval_2_0= ruleRval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_gval_3_0= ruleGval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bval_4_0= ruleBval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aval_5_0= ruleAval ) ) ) ) ) )* ) ) ) otherlv_6= ')' ) )
            // InternalMyUiDsl.g:1419:2: (otherlv_0= 'rgba(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_rval_2_0= ruleRval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_gval_3_0= ruleGval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bval_4_0= ruleBval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aval_5_0= ruleAval ) ) ) ) ) )* ) ) ) otherlv_6= ')' )
            {
            // InternalMyUiDsl.g:1419:2: (otherlv_0= 'rgba(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_rval_2_0= ruleRval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_gval_3_0= ruleGval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bval_4_0= ruleBval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aval_5_0= ruleAval ) ) ) ) ) )* ) ) ) otherlv_6= ')' )
            // InternalMyUiDsl.g:1420:3: otherlv_0= 'rgba(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_rval_2_0= ruleRval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_gval_3_0= ruleGval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bval_4_0= ruleBval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aval_5_0= ruleAval ) ) ) ) ) )* ) ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getRgbaColorAccess().getRgbaKeyword_0());
            		
            // InternalMyUiDsl.g:1424:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_rval_2_0= ruleRval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_gval_3_0= ruleGval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bval_4_0= ruleBval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aval_5_0= ruleAval ) ) ) ) ) )* ) ) )
            // InternalMyUiDsl.g:1425:4: ( ( ( ({...}? => ( ({...}? => ( (lv_rval_2_0= ruleRval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_gval_3_0= ruleGval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bval_4_0= ruleBval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aval_5_0= ruleAval ) ) ) ) ) )* ) )
            {
            // InternalMyUiDsl.g:1425:4: ( ( ( ({...}? => ( ({...}? => ( (lv_rval_2_0= ruleRval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_gval_3_0= ruleGval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bval_4_0= ruleBval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aval_5_0= ruleAval ) ) ) ) ) )* ) )
            // InternalMyUiDsl.g:1426:5: ( ( ({...}? => ( ({...}? => ( (lv_rval_2_0= ruleRval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_gval_3_0= ruleGval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bval_4_0= ruleBval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aval_5_0= ruleAval ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1());
            				
            // InternalMyUiDsl.g:1429:5: ( ( ({...}? => ( ({...}? => ( (lv_rval_2_0= ruleRval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_gval_3_0= ruleGval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bval_4_0= ruleBval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aval_5_0= ruleAval ) ) ) ) ) )* )
            // InternalMyUiDsl.g:1430:6: ( ({...}? => ( ({...}? => ( (lv_rval_2_0= ruleRval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_gval_3_0= ruleGval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bval_4_0= ruleBval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aval_5_0= ruleAval ) ) ) ) ) )*
            {
            // InternalMyUiDsl.g:1430:6: ( ({...}? => ( ({...}? => ( (lv_rval_2_0= ruleRval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_gval_3_0= ruleGval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bval_4_0= ruleBval ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aval_5_0= ruleAval ) ) ) ) ) )*
            loop15:
            do {
                int alt15=5;
                int LA15_0 = input.LA(1);

                if ( LA15_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 3) ) ) {
                    int LA15_2 = input.LA(2);

                    if ( LA15_2 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 2) ) {
                        alt15=3;
                    }
                    else if ( LA15_2 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 1) ) {
                        alt15=2;
                    }
                    else if ( LA15_2 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 0) ) {
                        alt15=1;
                    }
                    else if ( LA15_2 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 3) ) {
                        alt15=4;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyUiDsl.g:1431:4: ({...}? => ( ({...}? => ( (lv_rval_2_0= ruleRval ) ) ) ) )
            	    {
            	    // InternalMyUiDsl.g:1431:4: ({...}? => ( ({...}? => ( (lv_rval_2_0= ruleRval ) ) ) ) )
            	    // InternalMyUiDsl.g:1432:5: {...}? => ( ({...}? => ( (lv_rval_2_0= ruleRval ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRgbaColor", "getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMyUiDsl.g:1432:106: ( ({...}? => ( (lv_rval_2_0= ruleRval ) ) ) )
            	    // InternalMyUiDsl.g:1433:6: ({...}? => ( (lv_rval_2_0= ruleRval ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMyUiDsl.g:1436:9: ({...}? => ( (lv_rval_2_0= ruleRval ) ) )
            	    // InternalMyUiDsl.g:1436:10: {...}? => ( (lv_rval_2_0= ruleRval ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRgbaColor", "true");
            	    }
            	    // InternalMyUiDsl.g:1436:19: ( (lv_rval_2_0= ruleRval ) )
            	    // InternalMyUiDsl.g:1436:20: (lv_rval_2_0= ruleRval )
            	    {
            	    // InternalMyUiDsl.g:1436:20: (lv_rval_2_0= ruleRval )
            	    // InternalMyUiDsl.g:1437:10: lv_rval_2_0= ruleRval
            	    {

            	    										newCompositeNode(grammarAccess.getRgbaColorAccess().getRvalRvalParserRuleCall_1_0_0());
            	    									
            	    pushFollow(FOLLOW_24);
            	    lv_rval_2_0=ruleRval();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRgbaColorRule());
            	    										}
            	    										set(
            	    											current,
            	    											"rval",
            	    											lv_rval_2_0,
            	    											"edu.aut.islab.ghaemi.minuy.MyUiDsl.Rval");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyUiDsl.g:1459:4: ({...}? => ( ({...}? => ( (lv_gval_3_0= ruleGval ) ) ) ) )
            	    {
            	    // InternalMyUiDsl.g:1459:4: ({...}? => ( ({...}? => ( (lv_gval_3_0= ruleGval ) ) ) ) )
            	    // InternalMyUiDsl.g:1460:5: {...}? => ( ({...}? => ( (lv_gval_3_0= ruleGval ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRgbaColor", "getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMyUiDsl.g:1460:106: ( ({...}? => ( (lv_gval_3_0= ruleGval ) ) ) )
            	    // InternalMyUiDsl.g:1461:6: ({...}? => ( (lv_gval_3_0= ruleGval ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMyUiDsl.g:1464:9: ({...}? => ( (lv_gval_3_0= ruleGval ) ) )
            	    // InternalMyUiDsl.g:1464:10: {...}? => ( (lv_gval_3_0= ruleGval ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRgbaColor", "true");
            	    }
            	    // InternalMyUiDsl.g:1464:19: ( (lv_gval_3_0= ruleGval ) )
            	    // InternalMyUiDsl.g:1464:20: (lv_gval_3_0= ruleGval )
            	    {
            	    // InternalMyUiDsl.g:1464:20: (lv_gval_3_0= ruleGval )
            	    // InternalMyUiDsl.g:1465:10: lv_gval_3_0= ruleGval
            	    {

            	    										newCompositeNode(grammarAccess.getRgbaColorAccess().getGvalGvalParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_24);
            	    lv_gval_3_0=ruleGval();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRgbaColorRule());
            	    										}
            	    										set(
            	    											current,
            	    											"gval",
            	    											lv_gval_3_0,
            	    											"edu.aut.islab.ghaemi.minuy.MyUiDsl.Gval");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyUiDsl.g:1487:4: ({...}? => ( ({...}? => ( (lv_bval_4_0= ruleBval ) ) ) ) )
            	    {
            	    // InternalMyUiDsl.g:1487:4: ({...}? => ( ({...}? => ( (lv_bval_4_0= ruleBval ) ) ) ) )
            	    // InternalMyUiDsl.g:1488:5: {...}? => ( ({...}? => ( (lv_bval_4_0= ruleBval ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRgbaColor", "getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMyUiDsl.g:1488:106: ( ({...}? => ( (lv_bval_4_0= ruleBval ) ) ) )
            	    // InternalMyUiDsl.g:1489:6: ({...}? => ( (lv_bval_4_0= ruleBval ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMyUiDsl.g:1492:9: ({...}? => ( (lv_bval_4_0= ruleBval ) ) )
            	    // InternalMyUiDsl.g:1492:10: {...}? => ( (lv_bval_4_0= ruleBval ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRgbaColor", "true");
            	    }
            	    // InternalMyUiDsl.g:1492:19: ( (lv_bval_4_0= ruleBval ) )
            	    // InternalMyUiDsl.g:1492:20: (lv_bval_4_0= ruleBval )
            	    {
            	    // InternalMyUiDsl.g:1492:20: (lv_bval_4_0= ruleBval )
            	    // InternalMyUiDsl.g:1493:10: lv_bval_4_0= ruleBval
            	    {

            	    										newCompositeNode(grammarAccess.getRgbaColorAccess().getBvalBvalParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_24);
            	    lv_bval_4_0=ruleBval();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRgbaColorRule());
            	    										}
            	    										set(
            	    											current,
            	    											"bval",
            	    											lv_bval_4_0,
            	    											"edu.aut.islab.ghaemi.minuy.MyUiDsl.Bval");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyUiDsl.g:1515:4: ({...}? => ( ({...}? => ( (lv_aval_5_0= ruleAval ) ) ) ) )
            	    {
            	    // InternalMyUiDsl.g:1515:4: ({...}? => ( ({...}? => ( (lv_aval_5_0= ruleAval ) ) ) ) )
            	    // InternalMyUiDsl.g:1516:5: {...}? => ( ({...}? => ( (lv_aval_5_0= ruleAval ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRgbaColor", "getUnorderedGroupHelper().canSelect(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMyUiDsl.g:1516:106: ( ({...}? => ( (lv_aval_5_0= ruleAval ) ) ) )
            	    // InternalMyUiDsl.g:1517:6: ({...}? => ( (lv_aval_5_0= ruleAval ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMyUiDsl.g:1520:9: ({...}? => ( (lv_aval_5_0= ruleAval ) ) )
            	    // InternalMyUiDsl.g:1520:10: {...}? => ( (lv_aval_5_0= ruleAval ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRgbaColor", "true");
            	    }
            	    // InternalMyUiDsl.g:1520:19: ( (lv_aval_5_0= ruleAval ) )
            	    // InternalMyUiDsl.g:1520:20: (lv_aval_5_0= ruleAval )
            	    {
            	    // InternalMyUiDsl.g:1520:20: (lv_aval_5_0= ruleAval )
            	    // InternalMyUiDsl.g:1521:10: lv_aval_5_0= ruleAval
            	    {

            	    										newCompositeNode(grammarAccess.getRgbaColorAccess().getAvalAvalParserRuleCall_1_3_0());
            	    									
            	    pushFollow(FOLLOW_24);
            	    lv_aval_5_0=ruleAval();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRgbaColorRule());
            	    										}
            	    										set(
            	    											current,
            	    											"aval",
            	    											lv_aval_5_0,
            	    											"edu.aut.islab.ghaemi.minuy.MyUiDsl.Aval");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getRgbaColorAccess().getUnorderedGroup_1());
            				

            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRgbaColorAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleRgbaColor"


    // $ANTLR start "entryRuleRval"
    // InternalMyUiDsl.g:1558:1: entryRuleRval returns [EObject current=null] : iv_ruleRval= ruleRval EOF ;
    public final EObject entryRuleRval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRval = null;


        try {
            // InternalMyUiDsl.g:1558:45: (iv_ruleRval= ruleRval EOF )
            // InternalMyUiDsl.g:1559:2: iv_ruleRval= ruleRval EOF
            {
             newCompositeNode(grammarAccess.getRvalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRval=ruleRval();

            state._fsp--;

             current =iv_ruleRval; 
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
    // $ANTLR end "entryRuleRval"


    // $ANTLR start "ruleRval"
    // InternalMyUiDsl.g:1565:1: ruleRval returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'red' ) ;
    public final EObject ruleRval() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:1571:2: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'red' ) )
            // InternalMyUiDsl.g:1572:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'red' )
            {
            // InternalMyUiDsl.g:1572:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'red' )
            // InternalMyUiDsl.g:1573:3: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'red'
            {
            // InternalMyUiDsl.g:1573:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyUiDsl.g:1574:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMyUiDsl.g:1574:4: (lv_value_0_0= RULE_INT )
            // InternalMyUiDsl.g:1575:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_value_0_0, grammarAccess.getRvalAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRvalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRvalAccess().getRedKeyword_1());
            		

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
    // $ANTLR end "ruleRval"


    // $ANTLR start "entryRuleGval"
    // InternalMyUiDsl.g:1599:1: entryRuleGval returns [EObject current=null] : iv_ruleGval= ruleGval EOF ;
    public final EObject entryRuleGval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGval = null;


        try {
            // InternalMyUiDsl.g:1599:45: (iv_ruleGval= ruleGval EOF )
            // InternalMyUiDsl.g:1600:2: iv_ruleGval= ruleGval EOF
            {
             newCompositeNode(grammarAccess.getGvalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGval=ruleGval();

            state._fsp--;

             current =iv_ruleGval; 
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
    // $ANTLR end "entryRuleGval"


    // $ANTLR start "ruleGval"
    // InternalMyUiDsl.g:1606:1: ruleGval returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'grn' ) ;
    public final EObject ruleGval() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:1612:2: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'grn' ) )
            // InternalMyUiDsl.g:1613:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'grn' )
            {
            // InternalMyUiDsl.g:1613:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'grn' )
            // InternalMyUiDsl.g:1614:3: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'grn'
            {
            // InternalMyUiDsl.g:1614:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyUiDsl.g:1615:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMyUiDsl.g:1615:4: (lv_value_0_0= RULE_INT )
            // InternalMyUiDsl.g:1616:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_value_0_0, grammarAccess.getGvalAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGvalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGvalAccess().getGrnKeyword_1());
            		

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
    // $ANTLR end "ruleGval"


    // $ANTLR start "entryRuleBval"
    // InternalMyUiDsl.g:1640:1: entryRuleBval returns [EObject current=null] : iv_ruleBval= ruleBval EOF ;
    public final EObject entryRuleBval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBval = null;


        try {
            // InternalMyUiDsl.g:1640:45: (iv_ruleBval= ruleBval EOF )
            // InternalMyUiDsl.g:1641:2: iv_ruleBval= ruleBval EOF
            {
             newCompositeNode(grammarAccess.getBvalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBval=ruleBval();

            state._fsp--;

             current =iv_ruleBval; 
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
    // $ANTLR end "entryRuleBval"


    // $ANTLR start "ruleBval"
    // InternalMyUiDsl.g:1647:1: ruleBval returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'blu' ) ;
    public final EObject ruleBval() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:1653:2: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'blu' ) )
            // InternalMyUiDsl.g:1654:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'blu' )
            {
            // InternalMyUiDsl.g:1654:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'blu' )
            // InternalMyUiDsl.g:1655:3: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'blu'
            {
            // InternalMyUiDsl.g:1655:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyUiDsl.g:1656:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMyUiDsl.g:1656:4: (lv_value_0_0= RULE_INT )
            // InternalMyUiDsl.g:1657:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_value_0_0, grammarAccess.getBvalAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBvalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBvalAccess().getBluKeyword_1());
            		

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
    // $ANTLR end "ruleBval"


    // $ANTLR start "entryRuleAval"
    // InternalMyUiDsl.g:1681:1: entryRuleAval returns [EObject current=null] : iv_ruleAval= ruleAval EOF ;
    public final EObject entryRuleAval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAval = null;


        try {
            // InternalMyUiDsl.g:1681:45: (iv_ruleAval= ruleAval EOF )
            // InternalMyUiDsl.g:1682:2: iv_ruleAval= ruleAval EOF
            {
             newCompositeNode(grammarAccess.getAvalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAval=ruleAval();

            state._fsp--;

             current =iv_ruleAval; 
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
    // $ANTLR end "entryRuleAval"


    // $ANTLR start "ruleAval"
    // InternalMyUiDsl.g:1688:1: ruleAval returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'alfa' ) ;
    public final EObject ruleAval() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:1694:2: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'alfa' ) )
            // InternalMyUiDsl.g:1695:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'alfa' )
            {
            // InternalMyUiDsl.g:1695:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'alfa' )
            // InternalMyUiDsl.g:1696:3: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'alfa'
            {
            // InternalMyUiDsl.g:1696:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyUiDsl.g:1697:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMyUiDsl.g:1697:4: (lv_value_0_0= RULE_INT )
            // InternalMyUiDsl.g:1698:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_value_0_0, grammarAccess.getAvalAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAvalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAvalAccess().getAlfaKeyword_1());
            		

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
    // $ANTLR end "ruleAval"


    // $ANTLR start "entryRuleBorderRad"
    // InternalMyUiDsl.g:1722:1: entryRuleBorderRad returns [EObject current=null] : iv_ruleBorderRad= ruleBorderRad EOF ;
    public final EObject entryRuleBorderRad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorderRad = null;


        try {
            // InternalMyUiDsl.g:1722:50: (iv_ruleBorderRad= ruleBorderRad EOF )
            // InternalMyUiDsl.g:1723:2: iv_ruleBorderRad= ruleBorderRad EOF
            {
             newCompositeNode(grammarAccess.getBorderRadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBorderRad=ruleBorderRad();

            state._fsp--;

             current =iv_ruleBorderRad; 
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
    // $ANTLR end "entryRuleBorderRad"


    // $ANTLR start "ruleBorderRad"
    // InternalMyUiDsl.g:1729:1: ruleBorderRad returns [EObject current=null] : (otherlv_0= 'Arc:' ( (lv_value_1_0= RULE_INT ) ) ( (lv_measureType_2_0= rulemeasureType ) )? ) ;
    public final EObject ruleBorderRad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_measureType_2_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:1735:2: ( (otherlv_0= 'Arc:' ( (lv_value_1_0= RULE_INT ) ) ( (lv_measureType_2_0= rulemeasureType ) )? ) )
            // InternalMyUiDsl.g:1736:2: (otherlv_0= 'Arc:' ( (lv_value_1_0= RULE_INT ) ) ( (lv_measureType_2_0= rulemeasureType ) )? )
            {
            // InternalMyUiDsl.g:1736:2: (otherlv_0= 'Arc:' ( (lv_value_1_0= RULE_INT ) ) ( (lv_measureType_2_0= rulemeasureType ) )? )
            // InternalMyUiDsl.g:1737:3: otherlv_0= 'Arc:' ( (lv_value_1_0= RULE_INT ) ) ( (lv_measureType_2_0= rulemeasureType ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getBorderRadAccess().getArcKeyword_0());
            		
            // InternalMyUiDsl.g:1741:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalMyUiDsl.g:1742:4: (lv_value_1_0= RULE_INT )
            {
            // InternalMyUiDsl.g:1742:4: (lv_value_1_0= RULE_INT )
            // InternalMyUiDsl.g:1743:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            					newLeafNode(lv_value_1_0, grammarAccess.getBorderRadAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBorderRadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyUiDsl.g:1759:3: ( (lv_measureType_2_0= rulemeasureType ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=67 && LA16_0<=69)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyUiDsl.g:1760:4: (lv_measureType_2_0= rulemeasureType )
                    {
                    // InternalMyUiDsl.g:1760:4: (lv_measureType_2_0= rulemeasureType )
                    // InternalMyUiDsl.g:1761:5: lv_measureType_2_0= rulemeasureType
                    {

                    					newCompositeNode(grammarAccess.getBorderRadAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_measureType_2_0=rulemeasureType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBorderRadRule());
                    					}
                    					set(
                    						current,
                    						"measureType",
                    						lv_measureType_2_0,
                    						"edu.aut.islab.ghaemi.minuy.MyUiDsl.measureType");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleBorderRad"


    // $ANTLR start "entryRulePos"
    // InternalMyUiDsl.g:1782:1: entryRulePos returns [EObject current=null] : iv_rulePos= rulePos EOF ;
    public final EObject entryRulePos() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePos = null;


        try {
            // InternalMyUiDsl.g:1782:44: (iv_rulePos= rulePos EOF )
            // InternalMyUiDsl.g:1783:2: iv_rulePos= rulePos EOF
            {
             newCompositeNode(grammarAccess.getPosRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePos=rulePos();

            state._fsp--;

             current =iv_rulePos; 
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
    // $ANTLR end "entryRulePos"


    // $ANTLR start "rulePos"
    // InternalMyUiDsl.g:1789:1: rulePos returns [EObject current=null] : (otherlv_0= 'Pos:' ( (lv_value_1_0= rulePosVals ) ) ) ;
    public final EObject rulePos() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:1795:2: ( (otherlv_0= 'Pos:' ( (lv_value_1_0= rulePosVals ) ) ) )
            // InternalMyUiDsl.g:1796:2: (otherlv_0= 'Pos:' ( (lv_value_1_0= rulePosVals ) ) )
            {
            // InternalMyUiDsl.g:1796:2: (otherlv_0= 'Pos:' ( (lv_value_1_0= rulePosVals ) ) )
            // InternalMyUiDsl.g:1797:3: otherlv_0= 'Pos:' ( (lv_value_1_0= rulePosVals ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getPosAccess().getPosKeyword_0());
            		
            // InternalMyUiDsl.g:1801:3: ( (lv_value_1_0= rulePosVals ) )
            // InternalMyUiDsl.g:1802:4: (lv_value_1_0= rulePosVals )
            {
            // InternalMyUiDsl.g:1802:4: (lv_value_1_0= rulePosVals )
            // InternalMyUiDsl.g:1803:5: lv_value_1_0= rulePosVals
            {

            					newCompositeNode(grammarAccess.getPosAccess().getValuePosValsEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=rulePosVals();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPosRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.PosVals");
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
    // $ANTLR end "rulePos"


    // $ANTLR start "entryRuleFlt"
    // InternalMyUiDsl.g:1824:1: entryRuleFlt returns [EObject current=null] : iv_ruleFlt= ruleFlt EOF ;
    public final EObject entryRuleFlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlt = null;


        try {
            // InternalMyUiDsl.g:1824:44: (iv_ruleFlt= ruleFlt EOF )
            // InternalMyUiDsl.g:1825:2: iv_ruleFlt= ruleFlt EOF
            {
             newCompositeNode(grammarAccess.getFltRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlt=ruleFlt();

            state._fsp--;

             current =iv_ruleFlt; 
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
    // $ANTLR end "entryRuleFlt"


    // $ANTLR start "ruleFlt"
    // InternalMyUiDsl.g:1831:1: ruleFlt returns [EObject current=null] : (otherlv_0= 'Flt:' ( (lv_value_1_0= ruleFltVals ) ) ) ;
    public final EObject ruleFlt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:1837:2: ( (otherlv_0= 'Flt:' ( (lv_value_1_0= ruleFltVals ) ) ) )
            // InternalMyUiDsl.g:1838:2: (otherlv_0= 'Flt:' ( (lv_value_1_0= ruleFltVals ) ) )
            {
            // InternalMyUiDsl.g:1838:2: (otherlv_0= 'Flt:' ( (lv_value_1_0= ruleFltVals ) ) )
            // InternalMyUiDsl.g:1839:3: otherlv_0= 'Flt:' ( (lv_value_1_0= ruleFltVals ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getFltAccess().getFltKeyword_0());
            		
            // InternalMyUiDsl.g:1843:3: ( (lv_value_1_0= ruleFltVals ) )
            // InternalMyUiDsl.g:1844:4: (lv_value_1_0= ruleFltVals )
            {
            // InternalMyUiDsl.g:1844:4: (lv_value_1_0= ruleFltVals )
            // InternalMyUiDsl.g:1845:5: lv_value_1_0= ruleFltVals
            {

            					newCompositeNode(grammarAccess.getFltAccess().getValueFltValsEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleFltVals();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFltRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.FltVals");
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
    // $ANTLR end "ruleFlt"


    // $ANTLR start "entryRuleClr"
    // InternalMyUiDsl.g:1866:1: entryRuleClr returns [EObject current=null] : iv_ruleClr= ruleClr EOF ;
    public final EObject entryRuleClr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClr = null;


        try {
            // InternalMyUiDsl.g:1866:44: (iv_ruleClr= ruleClr EOF )
            // InternalMyUiDsl.g:1867:2: iv_ruleClr= ruleClr EOF
            {
             newCompositeNode(grammarAccess.getClrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClr=ruleClr();

            state._fsp--;

             current =iv_ruleClr; 
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
    // $ANTLR end "entryRuleClr"


    // $ANTLR start "ruleClr"
    // InternalMyUiDsl.g:1873:1: ruleClr returns [EObject current=null] : (otherlv_0= 'Clr:' ( (lv_value_1_0= ruleClrVals ) ) ) ;
    public final EObject ruleClr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:1879:2: ( (otherlv_0= 'Clr:' ( (lv_value_1_0= ruleClrVals ) ) ) )
            // InternalMyUiDsl.g:1880:2: (otherlv_0= 'Clr:' ( (lv_value_1_0= ruleClrVals ) ) )
            {
            // InternalMyUiDsl.g:1880:2: (otherlv_0= 'Clr:' ( (lv_value_1_0= ruleClrVals ) ) )
            // InternalMyUiDsl.g:1881:3: otherlv_0= 'Clr:' ( (lv_value_1_0= ruleClrVals ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getClrAccess().getClrKeyword_0());
            		
            // InternalMyUiDsl.g:1885:3: ( (lv_value_1_0= ruleClrVals ) )
            // InternalMyUiDsl.g:1886:4: (lv_value_1_0= ruleClrVals )
            {
            // InternalMyUiDsl.g:1886:4: (lv_value_1_0= ruleClrVals )
            // InternalMyUiDsl.g:1887:5: lv_value_1_0= ruleClrVals
            {

            					newCompositeNode(grammarAccess.getClrAccess().getValueClrValsEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleClrVals();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClrRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.ClrVals");
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
    // $ANTLR end "ruleClr"


    // $ANTLR start "entryRuleDisp"
    // InternalMyUiDsl.g:1908:1: entryRuleDisp returns [EObject current=null] : iv_ruleDisp= ruleDisp EOF ;
    public final EObject entryRuleDisp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisp = null;


        try {
            // InternalMyUiDsl.g:1908:45: (iv_ruleDisp= ruleDisp EOF )
            // InternalMyUiDsl.g:1909:2: iv_ruleDisp= ruleDisp EOF
            {
             newCompositeNode(grammarAccess.getDispRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisp=ruleDisp();

            state._fsp--;

             current =iv_ruleDisp; 
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
    // $ANTLR end "entryRuleDisp"


    // $ANTLR start "ruleDisp"
    // InternalMyUiDsl.g:1915:1: ruleDisp returns [EObject current=null] : (otherlv_0= 'Disp:' ( (lv_value_1_0= ruleDispVals ) ) ) ;
    public final EObject ruleDisp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:1921:2: ( (otherlv_0= 'Disp:' ( (lv_value_1_0= ruleDispVals ) ) ) )
            // InternalMyUiDsl.g:1922:2: (otherlv_0= 'Disp:' ( (lv_value_1_0= ruleDispVals ) ) )
            {
            // InternalMyUiDsl.g:1922:2: (otherlv_0= 'Disp:' ( (lv_value_1_0= ruleDispVals ) ) )
            // InternalMyUiDsl.g:1923:3: otherlv_0= 'Disp:' ( (lv_value_1_0= ruleDispVals ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getDispAccess().getDispKeyword_0());
            		
            // InternalMyUiDsl.g:1927:3: ( (lv_value_1_0= ruleDispVals ) )
            // InternalMyUiDsl.g:1928:4: (lv_value_1_0= ruleDispVals )
            {
            // InternalMyUiDsl.g:1928:4: (lv_value_1_0= ruleDispVals )
            // InternalMyUiDsl.g:1929:5: lv_value_1_0= ruleDispVals
            {

            					newCompositeNode(grammarAccess.getDispAccess().getValueDispValsEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleDispVals();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDispRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.DispVals");
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
    // $ANTLR end "ruleDisp"


    // $ANTLR start "entryRuleVerAl"
    // InternalMyUiDsl.g:1950:1: entryRuleVerAl returns [EObject current=null] : iv_ruleVerAl= ruleVerAl EOF ;
    public final EObject entryRuleVerAl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerAl = null;


        try {
            // InternalMyUiDsl.g:1950:46: (iv_ruleVerAl= ruleVerAl EOF )
            // InternalMyUiDsl.g:1951:2: iv_ruleVerAl= ruleVerAl EOF
            {
             newCompositeNode(grammarAccess.getVerAlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerAl=ruleVerAl();

            state._fsp--;

             current =iv_ruleVerAl; 
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
    // $ANTLR end "entryRuleVerAl"


    // $ANTLR start "ruleVerAl"
    // InternalMyUiDsl.g:1957:1: ruleVerAl returns [EObject current=null] : (otherlv_0= 'Ver_Al:' ( (lv_value_1_0= ruleVeralVals ) ) ) ;
    public final EObject ruleVerAl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:1963:2: ( (otherlv_0= 'Ver_Al:' ( (lv_value_1_0= ruleVeralVals ) ) ) )
            // InternalMyUiDsl.g:1964:2: (otherlv_0= 'Ver_Al:' ( (lv_value_1_0= ruleVeralVals ) ) )
            {
            // InternalMyUiDsl.g:1964:2: (otherlv_0= 'Ver_Al:' ( (lv_value_1_0= ruleVeralVals ) ) )
            // InternalMyUiDsl.g:1965:3: otherlv_0= 'Ver_Al:' ( (lv_value_1_0= ruleVeralVals ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getVerAlAccess().getVer_AlKeyword_0());
            		
            // InternalMyUiDsl.g:1969:3: ( (lv_value_1_0= ruleVeralVals ) )
            // InternalMyUiDsl.g:1970:4: (lv_value_1_0= ruleVeralVals )
            {
            // InternalMyUiDsl.g:1970:4: (lv_value_1_0= ruleVeralVals )
            // InternalMyUiDsl.g:1971:5: lv_value_1_0= ruleVeralVals
            {

            					newCompositeNode(grammarAccess.getVerAlAccess().getValueVeralValsEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleVeralVals();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerAlRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.VeralVals");
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
    // $ANTLR end "ruleVerAl"


    // $ANTLR start "entryRuleOFlow"
    // InternalMyUiDsl.g:1992:1: entryRuleOFlow returns [EObject current=null] : iv_ruleOFlow= ruleOFlow EOF ;
    public final EObject entryRuleOFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOFlow = null;


        try {
            // InternalMyUiDsl.g:1992:46: (iv_ruleOFlow= ruleOFlow EOF )
            // InternalMyUiDsl.g:1993:2: iv_ruleOFlow= ruleOFlow EOF
            {
             newCompositeNode(grammarAccess.getOFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOFlow=ruleOFlow();

            state._fsp--;

             current =iv_ruleOFlow; 
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
    // $ANTLR end "entryRuleOFlow"


    // $ANTLR start "ruleOFlow"
    // InternalMyUiDsl.g:1999:1: ruleOFlow returns [EObject current=null] : (otherlv_0= 'OFlow:' ( (lv_value_1_0= ruleOFlowVals ) ) ) ;
    public final EObject ruleOFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:2005:2: ( (otherlv_0= 'OFlow:' ( (lv_value_1_0= ruleOFlowVals ) ) ) )
            // InternalMyUiDsl.g:2006:2: (otherlv_0= 'OFlow:' ( (lv_value_1_0= ruleOFlowVals ) ) )
            {
            // InternalMyUiDsl.g:2006:2: (otherlv_0= 'OFlow:' ( (lv_value_1_0= ruleOFlowVals ) ) )
            // InternalMyUiDsl.g:2007:3: otherlv_0= 'OFlow:' ( (lv_value_1_0= ruleOFlowVals ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getOFlowAccess().getOFlowKeyword_0());
            		
            // InternalMyUiDsl.g:2011:3: ( (lv_value_1_0= ruleOFlowVals ) )
            // InternalMyUiDsl.g:2012:4: (lv_value_1_0= ruleOFlowVals )
            {
            // InternalMyUiDsl.g:2012:4: (lv_value_1_0= ruleOFlowVals )
            // InternalMyUiDsl.g:2013:5: lv_value_1_0= ruleOFlowVals
            {

            					newCompositeNode(grammarAccess.getOFlowAccess().getValueOFlowValsEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleOFlowVals();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOFlowRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.OFlowVals");
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
    // $ANTLR end "ruleOFlow"


    // $ANTLR start "entryRuleWid"
    // InternalMyUiDsl.g:2034:1: entryRuleWid returns [EObject current=null] : iv_ruleWid= ruleWid EOF ;
    public final EObject entryRuleWid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWid = null;


        try {
            // InternalMyUiDsl.g:2034:44: (iv_ruleWid= ruleWid EOF )
            // InternalMyUiDsl.g:2035:2: iv_ruleWid= ruleWid EOF
            {
             newCompositeNode(grammarAccess.getWidRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWid=ruleWid();

            state._fsp--;

             current =iv_ruleWid; 
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
    // $ANTLR end "entryRuleWid"


    // $ANTLR start "ruleWid"
    // InternalMyUiDsl.g:2041:1: ruleWid returns [EObject current=null] : (otherlv_0= 'Wid:' ( (lv_value_1_0= ruleMinMaxValue ) ) ) ;
    public final EObject ruleWid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:2047:2: ( (otherlv_0= 'Wid:' ( (lv_value_1_0= ruleMinMaxValue ) ) ) )
            // InternalMyUiDsl.g:2048:2: (otherlv_0= 'Wid:' ( (lv_value_1_0= ruleMinMaxValue ) ) )
            {
            // InternalMyUiDsl.g:2048:2: (otherlv_0= 'Wid:' ( (lv_value_1_0= ruleMinMaxValue ) ) )
            // InternalMyUiDsl.g:2049:3: otherlv_0= 'Wid:' ( (lv_value_1_0= ruleMinMaxValue ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getWidAccess().getWidKeyword_0());
            		
            // InternalMyUiDsl.g:2053:3: ( (lv_value_1_0= ruleMinMaxValue ) )
            // InternalMyUiDsl.g:2054:4: (lv_value_1_0= ruleMinMaxValue )
            {
            // InternalMyUiDsl.g:2054:4: (lv_value_1_0= ruleMinMaxValue )
            // InternalMyUiDsl.g:2055:5: lv_value_1_0= ruleMinMaxValue
            {

            					newCompositeNode(grammarAccess.getWidAccess().getValueMinMaxValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleMinMaxValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWidRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.MinMaxValue");
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
    // $ANTLR end "ruleWid"


    // $ANTLR start "entryRuleH8"
    // InternalMyUiDsl.g:2076:1: entryRuleH8 returns [EObject current=null] : iv_ruleH8= ruleH8 EOF ;
    public final EObject entryRuleH8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleH8 = null;


        try {
            // InternalMyUiDsl.g:2076:43: (iv_ruleH8= ruleH8 EOF )
            // InternalMyUiDsl.g:2077:2: iv_ruleH8= ruleH8 EOF
            {
             newCompositeNode(grammarAccess.getH8Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleH8=ruleH8();

            state._fsp--;

             current =iv_ruleH8; 
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
    // $ANTLR end "entryRuleH8"


    // $ANTLR start "ruleH8"
    // InternalMyUiDsl.g:2083:1: ruleH8 returns [EObject current=null] : (otherlv_0= 'H8:' ( (lv_value_1_0= ruleMinMaxValue ) ) ) ;
    public final EObject ruleH8() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:2089:2: ( (otherlv_0= 'H8:' ( (lv_value_1_0= ruleMinMaxValue ) ) ) )
            // InternalMyUiDsl.g:2090:2: (otherlv_0= 'H8:' ( (lv_value_1_0= ruleMinMaxValue ) ) )
            {
            // InternalMyUiDsl.g:2090:2: (otherlv_0= 'H8:' ( (lv_value_1_0= ruleMinMaxValue ) ) )
            // InternalMyUiDsl.g:2091:3: otherlv_0= 'H8:' ( (lv_value_1_0= ruleMinMaxValue ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getH8Access().getH8Keyword_0());
            		
            // InternalMyUiDsl.g:2095:3: ( (lv_value_1_0= ruleMinMaxValue ) )
            // InternalMyUiDsl.g:2096:4: (lv_value_1_0= ruleMinMaxValue )
            {
            // InternalMyUiDsl.g:2096:4: (lv_value_1_0= ruleMinMaxValue )
            // InternalMyUiDsl.g:2097:5: lv_value_1_0= ruleMinMaxValue
            {

            					newCompositeNode(grammarAccess.getH8Access().getValueMinMaxValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleMinMaxValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getH8Rule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.MinMaxValue");
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
    // $ANTLR end "ruleH8"


    // $ANTLR start "entryRuleCoord"
    // InternalMyUiDsl.g:2118:1: entryRuleCoord returns [EObject current=null] : iv_ruleCoord= ruleCoord EOF ;
    public final EObject entryRuleCoord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoord = null;


        try {
            // InternalMyUiDsl.g:2118:46: (iv_ruleCoord= ruleCoord EOF )
            // InternalMyUiDsl.g:2119:2: iv_ruleCoord= ruleCoord EOF
            {
             newCompositeNode(grammarAccess.getCoordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoord=ruleCoord();

            state._fsp--;

             current =iv_ruleCoord; 
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
    // $ANTLR end "entryRuleCoord"


    // $ANTLR start "ruleCoord"
    // InternalMyUiDsl.g:2125:1: ruleCoord returns [EObject current=null] : (otherlv_0= 'Coord:' ( (lv_value_1_0= ruleFourAspect ) ) ) ;
    public final EObject ruleCoord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:2131:2: ( (otherlv_0= 'Coord:' ( (lv_value_1_0= ruleFourAspect ) ) ) )
            // InternalMyUiDsl.g:2132:2: (otherlv_0= 'Coord:' ( (lv_value_1_0= ruleFourAspect ) ) )
            {
            // InternalMyUiDsl.g:2132:2: (otherlv_0= 'Coord:' ( (lv_value_1_0= ruleFourAspect ) ) )
            // InternalMyUiDsl.g:2133:3: otherlv_0= 'Coord:' ( (lv_value_1_0= ruleFourAspect ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordAccess().getCoordKeyword_0());
            		
            // InternalMyUiDsl.g:2137:3: ( (lv_value_1_0= ruleFourAspect ) )
            // InternalMyUiDsl.g:2138:4: (lv_value_1_0= ruleFourAspect )
            {
            // InternalMyUiDsl.g:2138:4: (lv_value_1_0= ruleFourAspect )
            // InternalMyUiDsl.g:2139:5: lv_value_1_0= ruleFourAspect
            {

            					newCompositeNode(grammarAccess.getCoordAccess().getValueFourAspectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleFourAspect();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoordRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.FourAspect");
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
    // $ANTLR end "ruleCoord"


    // $ANTLR start "entryRuleMarg"
    // InternalMyUiDsl.g:2160:1: entryRuleMarg returns [EObject current=null] : iv_ruleMarg= ruleMarg EOF ;
    public final EObject entryRuleMarg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarg = null;


        try {
            // InternalMyUiDsl.g:2160:45: (iv_ruleMarg= ruleMarg EOF )
            // InternalMyUiDsl.g:2161:2: iv_ruleMarg= ruleMarg EOF
            {
             newCompositeNode(grammarAccess.getMargRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarg=ruleMarg();

            state._fsp--;

             current =iv_ruleMarg; 
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
    // $ANTLR end "entryRuleMarg"


    // $ANTLR start "ruleMarg"
    // InternalMyUiDsl.g:2167:1: ruleMarg returns [EObject current=null] : (otherlv_0= 'Marg:' ( (lv_value_1_0= ruleFourAspect ) ) ) ;
    public final EObject ruleMarg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:2173:2: ( (otherlv_0= 'Marg:' ( (lv_value_1_0= ruleFourAspect ) ) ) )
            // InternalMyUiDsl.g:2174:2: (otherlv_0= 'Marg:' ( (lv_value_1_0= ruleFourAspect ) ) )
            {
            // InternalMyUiDsl.g:2174:2: (otherlv_0= 'Marg:' ( (lv_value_1_0= ruleFourAspect ) ) )
            // InternalMyUiDsl.g:2175:3: otherlv_0= 'Marg:' ( (lv_value_1_0= ruleFourAspect ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getMargAccess().getMargKeyword_0());
            		
            // InternalMyUiDsl.g:2179:3: ( (lv_value_1_0= ruleFourAspect ) )
            // InternalMyUiDsl.g:2180:4: (lv_value_1_0= ruleFourAspect )
            {
            // InternalMyUiDsl.g:2180:4: (lv_value_1_0= ruleFourAspect )
            // InternalMyUiDsl.g:2181:5: lv_value_1_0= ruleFourAspect
            {

            					newCompositeNode(grammarAccess.getMargAccess().getValueFourAspectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleFourAspect();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMargRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.FourAspect");
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
    // $ANTLR end "ruleMarg"


    // $ANTLR start "entryRulePadd"
    // InternalMyUiDsl.g:2202:1: entryRulePadd returns [EObject current=null] : iv_rulePadd= rulePadd EOF ;
    public final EObject entryRulePadd() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePadd = null;


        try {
            // InternalMyUiDsl.g:2202:45: (iv_rulePadd= rulePadd EOF )
            // InternalMyUiDsl.g:2203:2: iv_rulePadd= rulePadd EOF
            {
             newCompositeNode(grammarAccess.getPaddRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePadd=rulePadd();

            state._fsp--;

             current =iv_rulePadd; 
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
    // $ANTLR end "entryRulePadd"


    // $ANTLR start "rulePadd"
    // InternalMyUiDsl.g:2209:1: rulePadd returns [EObject current=null] : (otherlv_0= 'Padd:' ( (lv_value_1_0= ruleFourAspect ) ) ) ;
    public final EObject rulePadd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:2215:2: ( (otherlv_0= 'Padd:' ( (lv_value_1_0= ruleFourAspect ) ) ) )
            // InternalMyUiDsl.g:2216:2: (otherlv_0= 'Padd:' ( (lv_value_1_0= ruleFourAspect ) ) )
            {
            // InternalMyUiDsl.g:2216:2: (otherlv_0= 'Padd:' ( (lv_value_1_0= ruleFourAspect ) ) )
            // InternalMyUiDsl.g:2217:3: otherlv_0= 'Padd:' ( (lv_value_1_0= ruleFourAspect ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getPaddAccess().getPaddKeyword_0());
            		
            // InternalMyUiDsl.g:2221:3: ( (lv_value_1_0= ruleFourAspect ) )
            // InternalMyUiDsl.g:2222:4: (lv_value_1_0= ruleFourAspect )
            {
            // InternalMyUiDsl.g:2222:4: (lv_value_1_0= ruleFourAspect )
            // InternalMyUiDsl.g:2223:5: lv_value_1_0= ruleFourAspect
            {

            					newCompositeNode(grammarAccess.getPaddAccess().getValueFourAspectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleFourAspect();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPaddRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"edu.aut.islab.ghaemi.minuy.MyUiDsl.FourAspect");
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
    // $ANTLR end "rulePadd"


    // $ANTLR start "entryRuleMinMaxValue"
    // InternalMyUiDsl.g:2244:1: entryRuleMinMaxValue returns [EObject current=null] : iv_ruleMinMaxValue= ruleMinMaxValue EOF ;
    public final EObject entryRuleMinMaxValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinMaxValue = null;


        try {
            // InternalMyUiDsl.g:2244:52: (iv_ruleMinMaxValue= ruleMinMaxValue EOF )
            // InternalMyUiDsl.g:2245:2: iv_ruleMinMaxValue= ruleMinMaxValue EOF
            {
             newCompositeNode(grammarAccess.getMinMaxValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinMaxValue=ruleMinMaxValue();

            state._fsp--;

             current =iv_ruleMinMaxValue; 
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
    // $ANTLR end "entryRuleMinMaxValue"


    // $ANTLR start "ruleMinMaxValue"
    // InternalMyUiDsl.g:2251:1: ruleMinMaxValue returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleMinMaxValue() throws RecognitionException {
        EObject current = null;

        EObject lv_minVal_2_0 = null;

        EObject lv_maxVal_3_0 = null;

        EObject lv_midVal_4_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:2257:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) ) ) ) )* ) ) ) ) )
            // InternalMyUiDsl.g:2258:2: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) ) ) ) )* ) ) ) )
            {
            // InternalMyUiDsl.g:2258:2: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) ) ) ) )* ) ) ) )
            // InternalMyUiDsl.g:2259:3: () ( ( ( ( ({...}? => ( ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) ) ) ) )* ) ) )
            {
            // InternalMyUiDsl.g:2259:3: ()
            // InternalMyUiDsl.g:2260:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMinMaxValueAccess().getMinMaxValueAction_0(),
            					current);
            			

            }

            // InternalMyUiDsl.g:2266:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) ) ) ) )* ) ) )
            // InternalMyUiDsl.g:2267:4: ( ( ( ({...}? => ( ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) ) ) ) )* ) )
            {
            // InternalMyUiDsl.g:2267:4: ( ( ( ({...}? => ( ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) ) ) ) )* ) )
            // InternalMyUiDsl.g:2268:5: ( ( ({...}? => ( ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1());
            				
            // InternalMyUiDsl.g:2271:5: ( ( ({...}? => ( ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) ) ) ) )* )
            // InternalMyUiDsl.g:2272:6: ( ({...}? => ( ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) ) ) ) )*
            {
            // InternalMyUiDsl.g:2272:6: ( ({...}? => ( ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) ) ) ) )*
            loop17:
            do {
                int alt17=4;
                int LA17_0 = input.LA(1);

                if ( LA17_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 0) ) ) {
                    int LA17_2 = input.LA(2);

                    if ( ( LA17_2 == EOF || LA17_2 == RULE_INT || LA17_2 == 16 || LA17_2 >= 67 && LA17_2 <= 69 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 2) ) {
                        alt17=3;
                    }
                    else if ( LA17_2 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 0) ) {
                        alt17=1;
                    }
                    else if ( LA17_2 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 1) ) {
                        alt17=2;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyUiDsl.g:2273:4: ({...}? => ( ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) ) ) )
            	    {
            	    // InternalMyUiDsl.g:2273:4: ({...}? => ( ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) ) ) )
            	    // InternalMyUiDsl.g:2274:5: {...}? => ( ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMinMaxValue", "getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMyUiDsl.g:2274:108: ( ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) ) )
            	    // InternalMyUiDsl.g:2275:6: ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMyUiDsl.g:2278:9: ({...}? => ( (lv_minVal_2_0= ruleMinVal ) ) )
            	    // InternalMyUiDsl.g:2278:10: {...}? => ( (lv_minVal_2_0= ruleMinVal ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMinMaxValue", "true");
            	    }
            	    // InternalMyUiDsl.g:2278:19: ( (lv_minVal_2_0= ruleMinVal ) )
            	    // InternalMyUiDsl.g:2278:20: (lv_minVal_2_0= ruleMinVal )
            	    {
            	    // InternalMyUiDsl.g:2278:20: (lv_minVal_2_0= ruleMinVal )
            	    // InternalMyUiDsl.g:2279:10: lv_minVal_2_0= ruleMinVal
            	    {

            	    										newCompositeNode(grammarAccess.getMinMaxValueAccess().getMinValMinValParserRuleCall_1_0_0());
            	    									
            	    pushFollow(FOLLOW_37);
            	    lv_minVal_2_0=ruleMinVal();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMinMaxValueRule());
            	    										}
            	    										set(
            	    											current,
            	    											"minVal",
            	    											lv_minVal_2_0,
            	    											"edu.aut.islab.ghaemi.minuy.MyUiDsl.MinVal");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyUiDsl.g:2301:4: ({...}? => ( ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) ) ) )
            	    {
            	    // InternalMyUiDsl.g:2301:4: ({...}? => ( ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) ) ) )
            	    // InternalMyUiDsl.g:2302:5: {...}? => ( ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMinMaxValue", "getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMyUiDsl.g:2302:108: ( ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) ) )
            	    // InternalMyUiDsl.g:2303:6: ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMyUiDsl.g:2306:9: ({...}? => ( (lv_maxVal_3_0= ruleMaxVal ) ) )
            	    // InternalMyUiDsl.g:2306:10: {...}? => ( (lv_maxVal_3_0= ruleMaxVal ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMinMaxValue", "true");
            	    }
            	    // InternalMyUiDsl.g:2306:19: ( (lv_maxVal_3_0= ruleMaxVal ) )
            	    // InternalMyUiDsl.g:2306:20: (lv_maxVal_3_0= ruleMaxVal )
            	    {
            	    // InternalMyUiDsl.g:2306:20: (lv_maxVal_3_0= ruleMaxVal )
            	    // InternalMyUiDsl.g:2307:10: lv_maxVal_3_0= ruleMaxVal
            	    {

            	    										newCompositeNode(grammarAccess.getMinMaxValueAccess().getMaxValMaxValParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_37);
            	    lv_maxVal_3_0=ruleMaxVal();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMinMaxValueRule());
            	    										}
            	    										set(
            	    											current,
            	    											"maxVal",
            	    											lv_maxVal_3_0,
            	    											"edu.aut.islab.ghaemi.minuy.MyUiDsl.MaxVal");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyUiDsl.g:2329:4: ({...}? => ( ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) ) ) )
            	    {
            	    // InternalMyUiDsl.g:2329:4: ({...}? => ( ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) ) ) )
            	    // InternalMyUiDsl.g:2330:5: {...}? => ( ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMinMaxValue", "getUnorderedGroupHelper().canSelect(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMyUiDsl.g:2330:108: ( ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) ) )
            	    // InternalMyUiDsl.g:2331:6: ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMyUiDsl.g:2334:9: ({...}? => ( (lv_midVal_4_0= ruleMidVal ) ) )
            	    // InternalMyUiDsl.g:2334:10: {...}? => ( (lv_midVal_4_0= ruleMidVal ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMinMaxValue", "true");
            	    }
            	    // InternalMyUiDsl.g:2334:19: ( (lv_midVal_4_0= ruleMidVal ) )
            	    // InternalMyUiDsl.g:2334:20: (lv_midVal_4_0= ruleMidVal )
            	    {
            	    // InternalMyUiDsl.g:2334:20: (lv_midVal_4_0= ruleMidVal )
            	    // InternalMyUiDsl.g:2335:10: lv_midVal_4_0= ruleMidVal
            	    {

            	    										newCompositeNode(grammarAccess.getMinMaxValueAccess().getMidValMidValParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_37);
            	    lv_midVal_4_0=ruleMidVal();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMinMaxValueRule());
            	    										}
            	    										set(
            	    											current,
            	    											"midVal",
            	    											lv_midVal_4_0,
            	    											"edu.aut.islab.ghaemi.minuy.MyUiDsl.MidVal");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMinMaxValueAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleMinMaxValue"


    // $ANTLR start "entryRuleMinVal"
    // InternalMyUiDsl.g:2368:1: entryRuleMinVal returns [EObject current=null] : iv_ruleMinVal= ruleMinVal EOF ;
    public final EObject entryRuleMinVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinVal = null;


        try {
            // InternalMyUiDsl.g:2368:47: (iv_ruleMinVal= ruleMinVal EOF )
            // InternalMyUiDsl.g:2369:2: iv_ruleMinVal= ruleMinVal EOF
            {
             newCompositeNode(grammarAccess.getMinValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinVal=ruleMinVal();

            state._fsp--;

             current =iv_ruleMinVal; 
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
    // $ANTLR end "entryRuleMinVal"


    // $ANTLR start "ruleMinVal"
    // InternalMyUiDsl.g:2375:1: ruleMinVal returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'lo' ( (lv_measureType_2_0= rulemeasureType ) )? ) ;
    public final EObject ruleMinVal() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_measureType_2_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:2381:2: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'lo' ( (lv_measureType_2_0= rulemeasureType ) )? ) )
            // InternalMyUiDsl.g:2382:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'lo' ( (lv_measureType_2_0= rulemeasureType ) )? )
            {
            // InternalMyUiDsl.g:2382:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'lo' ( (lv_measureType_2_0= rulemeasureType ) )? )
            // InternalMyUiDsl.g:2383:3: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'lo' ( (lv_measureType_2_0= rulemeasureType ) )?
            {
            // InternalMyUiDsl.g:2383:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyUiDsl.g:2384:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMyUiDsl.g:2384:4: (lv_value_0_0= RULE_INT )
            // InternalMyUiDsl.g:2385:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_38); 

            					newLeafNode(lv_value_0_0, grammarAccess.getMinValAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,61,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getMinValAccess().getLoKeyword_1());
            		
            // InternalMyUiDsl.g:2405:3: ( (lv_measureType_2_0= rulemeasureType ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=67 && LA18_0<=69)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyUiDsl.g:2406:4: (lv_measureType_2_0= rulemeasureType )
                    {
                    // InternalMyUiDsl.g:2406:4: (lv_measureType_2_0= rulemeasureType )
                    // InternalMyUiDsl.g:2407:5: lv_measureType_2_0= rulemeasureType
                    {

                    					newCompositeNode(grammarAccess.getMinValAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_measureType_2_0=rulemeasureType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMinValRule());
                    					}
                    					set(
                    						current,
                    						"measureType",
                    						lv_measureType_2_0,
                    						"edu.aut.islab.ghaemi.minuy.MyUiDsl.measureType");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleMinVal"


    // $ANTLR start "entryRuleMaxVal"
    // InternalMyUiDsl.g:2428:1: entryRuleMaxVal returns [EObject current=null] : iv_ruleMaxVal= ruleMaxVal EOF ;
    public final EObject entryRuleMaxVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxVal = null;


        try {
            // InternalMyUiDsl.g:2428:47: (iv_ruleMaxVal= ruleMaxVal EOF )
            // InternalMyUiDsl.g:2429:2: iv_ruleMaxVal= ruleMaxVal EOF
            {
             newCompositeNode(grammarAccess.getMaxValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxVal=ruleMaxVal();

            state._fsp--;

             current =iv_ruleMaxVal; 
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
    // $ANTLR end "entryRuleMaxVal"


    // $ANTLR start "ruleMaxVal"
    // InternalMyUiDsl.g:2435:1: ruleMaxVal returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'hi' ( (lv_measureType_2_0= rulemeasureType ) )? ) ;
    public final EObject ruleMaxVal() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_measureType_2_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:2441:2: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'hi' ( (lv_measureType_2_0= rulemeasureType ) )? ) )
            // InternalMyUiDsl.g:2442:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'hi' ( (lv_measureType_2_0= rulemeasureType ) )? )
            {
            // InternalMyUiDsl.g:2442:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'hi' ( (lv_measureType_2_0= rulemeasureType ) )? )
            // InternalMyUiDsl.g:2443:3: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'hi' ( (lv_measureType_2_0= rulemeasureType ) )?
            {
            // InternalMyUiDsl.g:2443:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyUiDsl.g:2444:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMyUiDsl.g:2444:4: (lv_value_0_0= RULE_INT )
            // InternalMyUiDsl.g:2445:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_value_0_0, grammarAccess.getMaxValAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxValAccess().getHiKeyword_1());
            		
            // InternalMyUiDsl.g:2465:3: ( (lv_measureType_2_0= rulemeasureType ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=67 && LA19_0<=69)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyUiDsl.g:2466:4: (lv_measureType_2_0= rulemeasureType )
                    {
                    // InternalMyUiDsl.g:2466:4: (lv_measureType_2_0= rulemeasureType )
                    // InternalMyUiDsl.g:2467:5: lv_measureType_2_0= rulemeasureType
                    {

                    					newCompositeNode(grammarAccess.getMaxValAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_measureType_2_0=rulemeasureType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMaxValRule());
                    					}
                    					set(
                    						current,
                    						"measureType",
                    						lv_measureType_2_0,
                    						"edu.aut.islab.ghaemi.minuy.MyUiDsl.measureType");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleMaxVal"


    // $ANTLR start "entryRuleMidVal"
    // InternalMyUiDsl.g:2488:1: entryRuleMidVal returns [EObject current=null] : iv_ruleMidVal= ruleMidVal EOF ;
    public final EObject entryRuleMidVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMidVal = null;


        try {
            // InternalMyUiDsl.g:2488:47: (iv_ruleMidVal= ruleMidVal EOF )
            // InternalMyUiDsl.g:2489:2: iv_ruleMidVal= ruleMidVal EOF
            {
             newCompositeNode(grammarAccess.getMidValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMidVal=ruleMidVal();

            state._fsp--;

             current =iv_ruleMidVal; 
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
    // $ANTLR end "entryRuleMidVal"


    // $ANTLR start "ruleMidVal"
    // InternalMyUiDsl.g:2495:1: ruleMidVal returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_measureType_1_0= rulemeasureType ) )? ) ;
    public final EObject ruleMidVal() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        AntlrDatatypeRuleToken lv_measureType_1_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:2501:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_measureType_1_0= rulemeasureType ) )? ) )
            // InternalMyUiDsl.g:2502:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_measureType_1_0= rulemeasureType ) )? )
            {
            // InternalMyUiDsl.g:2502:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_measureType_1_0= rulemeasureType ) )? )
            // InternalMyUiDsl.g:2503:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_measureType_1_0= rulemeasureType ) )?
            {
            // InternalMyUiDsl.g:2503:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyUiDsl.g:2504:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMyUiDsl.g:2504:4: (lv_value_0_0= RULE_INT )
            // InternalMyUiDsl.g:2505:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            					newLeafNode(lv_value_0_0, grammarAccess.getMidValAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMidValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyUiDsl.g:2521:3: ( (lv_measureType_1_0= rulemeasureType ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=67 && LA20_0<=69)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyUiDsl.g:2522:4: (lv_measureType_1_0= rulemeasureType )
                    {
                    // InternalMyUiDsl.g:2522:4: (lv_measureType_1_0= rulemeasureType )
                    // InternalMyUiDsl.g:2523:5: lv_measureType_1_0= rulemeasureType
                    {

                    					newCompositeNode(grammarAccess.getMidValAccess().getMeasureTypeMeasureTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_measureType_1_0=rulemeasureType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMidValRule());
                    					}
                    					set(
                    						current,
                    						"measureType",
                    						lv_measureType_1_0,
                    						"edu.aut.islab.ghaemi.minuy.MyUiDsl.measureType");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleMidVal"


    // $ANTLR start "entryRuleFourAspect"
    // InternalMyUiDsl.g:2544:1: entryRuleFourAspect returns [EObject current=null] : iv_ruleFourAspect= ruleFourAspect EOF ;
    public final EObject entryRuleFourAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFourAspect = null;


        try {
            // InternalMyUiDsl.g:2544:51: (iv_ruleFourAspect= ruleFourAspect EOF )
            // InternalMyUiDsl.g:2545:2: iv_ruleFourAspect= ruleFourAspect EOF
            {
             newCompositeNode(grammarAccess.getFourAspectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFourAspect=ruleFourAspect();

            state._fsp--;

             current =iv_ruleFourAspect; 
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
    // $ANTLR end "entryRuleFourAspect"


    // $ANTLR start "ruleFourAspect"
    // InternalMyUiDsl.g:2551:1: ruleFourAspect returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleFourAspect() throws RecognitionException {
        EObject current = null;

        EObject lv_left_2_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_up_4_0 = null;

        EObject lv_down_5_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:2557:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) ) ) ) )* ) ) ) ) )
            // InternalMyUiDsl.g:2558:2: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) ) ) ) )* ) ) ) )
            {
            // InternalMyUiDsl.g:2558:2: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) ) ) ) )* ) ) ) )
            // InternalMyUiDsl.g:2559:3: () ( ( ( ( ({...}? => ( ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) ) ) ) )* ) ) )
            {
            // InternalMyUiDsl.g:2559:3: ()
            // InternalMyUiDsl.g:2560:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFourAspectAccess().getFourAspectAction_0(),
            					current);
            			

            }

            // InternalMyUiDsl.g:2566:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) ) ) ) )* ) ) )
            // InternalMyUiDsl.g:2567:4: ( ( ( ({...}? => ( ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) ) ) ) )* ) )
            {
            // InternalMyUiDsl.g:2567:4: ( ( ( ({...}? => ( ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) ) ) ) )* ) )
            // InternalMyUiDsl.g:2568:5: ( ( ({...}? => ( ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFourAspectAccess().getUnorderedGroup_1());
            				
            // InternalMyUiDsl.g:2571:5: ( ( ({...}? => ( ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) ) ) ) )* )
            // InternalMyUiDsl.g:2572:6: ( ({...}? => ( ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) ) ) ) )*
            {
            // InternalMyUiDsl.g:2572:6: ( ({...}? => ( ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) ) ) ) )*
            loop21:
            do {
                int alt21=5;
                int LA21_0 = input.LA(1);

                if ( LA21_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 0) ) ) {
                    int LA21_2 = input.LA(2);

                    if ( LA21_2 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 2) ) {
                        alt21=3;
                    }
                    else if ( LA21_2 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 0) ) {
                        alt21=1;
                    }
                    else if ( LA21_2 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 3) ) {
                        alt21=4;
                    }
                    else if ( LA21_2 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 1) ) {
                        alt21=2;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyUiDsl.g:2573:4: ({...}? => ( ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) ) ) )
            	    {
            	    // InternalMyUiDsl.g:2573:4: ({...}? => ( ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) ) ) )
            	    // InternalMyUiDsl.g:2574:5: {...}? => ( ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFourAspect", "getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMyUiDsl.g:2574:107: ( ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) ) )
            	    // InternalMyUiDsl.g:2575:6: ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMyUiDsl.g:2578:9: ({...}? => ( (lv_left_2_0= ruleLeftAspect ) ) )
            	    // InternalMyUiDsl.g:2578:10: {...}? => ( (lv_left_2_0= ruleLeftAspect ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFourAspect", "true");
            	    }
            	    // InternalMyUiDsl.g:2578:19: ( (lv_left_2_0= ruleLeftAspect ) )
            	    // InternalMyUiDsl.g:2578:20: (lv_left_2_0= ruleLeftAspect )
            	    {
            	    // InternalMyUiDsl.g:2578:20: (lv_left_2_0= ruleLeftAspect )
            	    // InternalMyUiDsl.g:2579:10: lv_left_2_0= ruleLeftAspect
            	    {

            	    										newCompositeNode(grammarAccess.getFourAspectAccess().getLeftLeftAspectParserRuleCall_1_0_0());
            	    									
            	    pushFollow(FOLLOW_37);
            	    lv_left_2_0=ruleLeftAspect();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFourAspectRule());
            	    										}
            	    										set(
            	    											current,
            	    											"left",
            	    											lv_left_2_0,
            	    											"edu.aut.islab.ghaemi.minuy.MyUiDsl.LeftAspect");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFourAspectAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyUiDsl.g:2601:4: ({...}? => ( ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) ) ) )
            	    {
            	    // InternalMyUiDsl.g:2601:4: ({...}? => ( ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) ) ) )
            	    // InternalMyUiDsl.g:2602:5: {...}? => ( ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFourAspect", "getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMyUiDsl.g:2602:107: ( ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) ) )
            	    // InternalMyUiDsl.g:2603:6: ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMyUiDsl.g:2606:9: ({...}? => ( (lv_right_3_0= ruleRightAspect ) ) )
            	    // InternalMyUiDsl.g:2606:10: {...}? => ( (lv_right_3_0= ruleRightAspect ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFourAspect", "true");
            	    }
            	    // InternalMyUiDsl.g:2606:19: ( (lv_right_3_0= ruleRightAspect ) )
            	    // InternalMyUiDsl.g:2606:20: (lv_right_3_0= ruleRightAspect )
            	    {
            	    // InternalMyUiDsl.g:2606:20: (lv_right_3_0= ruleRightAspect )
            	    // InternalMyUiDsl.g:2607:10: lv_right_3_0= ruleRightAspect
            	    {

            	    										newCompositeNode(grammarAccess.getFourAspectAccess().getRightRightAspectParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=ruleRightAspect();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFourAspectRule());
            	    										}
            	    										set(
            	    											current,
            	    											"right",
            	    											lv_right_3_0,
            	    											"edu.aut.islab.ghaemi.minuy.MyUiDsl.RightAspect");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFourAspectAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyUiDsl.g:2629:4: ({...}? => ( ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) ) ) )
            	    {
            	    // InternalMyUiDsl.g:2629:4: ({...}? => ( ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) ) ) )
            	    // InternalMyUiDsl.g:2630:5: {...}? => ( ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFourAspect", "getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMyUiDsl.g:2630:107: ( ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) ) )
            	    // InternalMyUiDsl.g:2631:6: ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMyUiDsl.g:2634:9: ({...}? => ( (lv_up_4_0= ruleUpAspect ) ) )
            	    // InternalMyUiDsl.g:2634:10: {...}? => ( (lv_up_4_0= ruleUpAspect ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFourAspect", "true");
            	    }
            	    // InternalMyUiDsl.g:2634:19: ( (lv_up_4_0= ruleUpAspect ) )
            	    // InternalMyUiDsl.g:2634:20: (lv_up_4_0= ruleUpAspect )
            	    {
            	    // InternalMyUiDsl.g:2634:20: (lv_up_4_0= ruleUpAspect )
            	    // InternalMyUiDsl.g:2635:10: lv_up_4_0= ruleUpAspect
            	    {

            	    										newCompositeNode(grammarAccess.getFourAspectAccess().getUpUpAspectParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_37);
            	    lv_up_4_0=ruleUpAspect();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFourAspectRule());
            	    										}
            	    										set(
            	    											current,
            	    											"up",
            	    											lv_up_4_0,
            	    											"edu.aut.islab.ghaemi.minuy.MyUiDsl.UpAspect");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFourAspectAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyUiDsl.g:2657:4: ({...}? => ( ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) ) ) )
            	    {
            	    // InternalMyUiDsl.g:2657:4: ({...}? => ( ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) ) ) )
            	    // InternalMyUiDsl.g:2658:5: {...}? => ( ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFourAspect", "getUnorderedGroupHelper().canSelect(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMyUiDsl.g:2658:107: ( ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) ) )
            	    // InternalMyUiDsl.g:2659:6: ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFourAspectAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMyUiDsl.g:2662:9: ({...}? => ( (lv_down_5_0= ruleDownAspect ) ) )
            	    // InternalMyUiDsl.g:2662:10: {...}? => ( (lv_down_5_0= ruleDownAspect ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFourAspect", "true");
            	    }
            	    // InternalMyUiDsl.g:2662:19: ( (lv_down_5_0= ruleDownAspect ) )
            	    // InternalMyUiDsl.g:2662:20: (lv_down_5_0= ruleDownAspect )
            	    {
            	    // InternalMyUiDsl.g:2662:20: (lv_down_5_0= ruleDownAspect )
            	    // InternalMyUiDsl.g:2663:10: lv_down_5_0= ruleDownAspect
            	    {

            	    										newCompositeNode(grammarAccess.getFourAspectAccess().getDownDownAspectParserRuleCall_1_3_0());
            	    									
            	    pushFollow(FOLLOW_37);
            	    lv_down_5_0=ruleDownAspect();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFourAspectRule());
            	    										}
            	    										set(
            	    											current,
            	    											"down",
            	    											lv_down_5_0,
            	    											"edu.aut.islab.ghaemi.minuy.MyUiDsl.DownAspect");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFourAspectAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFourAspectAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleFourAspect"


    // $ANTLR start "entryRuleLeftAspect"
    // InternalMyUiDsl.g:2696:1: entryRuleLeftAspect returns [EObject current=null] : iv_ruleLeftAspect= ruleLeftAspect EOF ;
    public final EObject entryRuleLeftAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftAspect = null;


        try {
            // InternalMyUiDsl.g:2696:51: (iv_ruleLeftAspect= ruleLeftAspect EOF )
            // InternalMyUiDsl.g:2697:2: iv_ruleLeftAspect= ruleLeftAspect EOF
            {
             newCompositeNode(grammarAccess.getLeftAspectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftAspect=ruleLeftAspect();

            state._fsp--;

             current =iv_ruleLeftAspect; 
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
    // $ANTLR end "entryRuleLeftAspect"


    // $ANTLR start "ruleLeftAspect"
    // InternalMyUiDsl.g:2703:1: ruleLeftAspect returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'le' ( (lv_measureType_2_0= rulemeasureType ) )? ) ;
    public final EObject ruleLeftAspect() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_measureType_2_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:2709:2: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'le' ( (lv_measureType_2_0= rulemeasureType ) )? ) )
            // InternalMyUiDsl.g:2710:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'le' ( (lv_measureType_2_0= rulemeasureType ) )? )
            {
            // InternalMyUiDsl.g:2710:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'le' ( (lv_measureType_2_0= rulemeasureType ) )? )
            // InternalMyUiDsl.g:2711:3: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'le' ( (lv_measureType_2_0= rulemeasureType ) )?
            {
            // InternalMyUiDsl.g:2711:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyUiDsl.g:2712:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMyUiDsl.g:2712:4: (lv_value_0_0= RULE_INT )
            // InternalMyUiDsl.g:2713:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_40); 

            					newLeafNode(lv_value_0_0, grammarAccess.getLeftAspectAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeftAspectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,63,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftAspectAccess().getLeKeyword_1());
            		
            // InternalMyUiDsl.g:2733:3: ( (lv_measureType_2_0= rulemeasureType ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=67 && LA22_0<=69)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyUiDsl.g:2734:4: (lv_measureType_2_0= rulemeasureType )
                    {
                    // InternalMyUiDsl.g:2734:4: (lv_measureType_2_0= rulemeasureType )
                    // InternalMyUiDsl.g:2735:5: lv_measureType_2_0= rulemeasureType
                    {

                    					newCompositeNode(grammarAccess.getLeftAspectAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_measureType_2_0=rulemeasureType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLeftAspectRule());
                    					}
                    					set(
                    						current,
                    						"measureType",
                    						lv_measureType_2_0,
                    						"edu.aut.islab.ghaemi.minuy.MyUiDsl.measureType");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleLeftAspect"


    // $ANTLR start "entryRuleRightAspect"
    // InternalMyUiDsl.g:2756:1: entryRuleRightAspect returns [EObject current=null] : iv_ruleRightAspect= ruleRightAspect EOF ;
    public final EObject entryRuleRightAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightAspect = null;


        try {
            // InternalMyUiDsl.g:2756:52: (iv_ruleRightAspect= ruleRightAspect EOF )
            // InternalMyUiDsl.g:2757:2: iv_ruleRightAspect= ruleRightAspect EOF
            {
             newCompositeNode(grammarAccess.getRightAspectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightAspect=ruleRightAspect();

            state._fsp--;

             current =iv_ruleRightAspect; 
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
    // $ANTLR end "entryRuleRightAspect"


    // $ANTLR start "ruleRightAspect"
    // InternalMyUiDsl.g:2763:1: ruleRightAspect returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'ri' ( (lv_measureType_2_0= rulemeasureType ) )? ) ;
    public final EObject ruleRightAspect() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_measureType_2_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:2769:2: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'ri' ( (lv_measureType_2_0= rulemeasureType ) )? ) )
            // InternalMyUiDsl.g:2770:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'ri' ( (lv_measureType_2_0= rulemeasureType ) )? )
            {
            // InternalMyUiDsl.g:2770:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'ri' ( (lv_measureType_2_0= rulemeasureType ) )? )
            // InternalMyUiDsl.g:2771:3: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'ri' ( (lv_measureType_2_0= rulemeasureType ) )?
            {
            // InternalMyUiDsl.g:2771:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyUiDsl.g:2772:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMyUiDsl.g:2772:4: (lv_value_0_0= RULE_INT )
            // InternalMyUiDsl.g:2773:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_41); 

            					newLeafNode(lv_value_0_0, grammarAccess.getRightAspectAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRightAspectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,64,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getRightAspectAccess().getRiKeyword_1());
            		
            // InternalMyUiDsl.g:2793:3: ( (lv_measureType_2_0= rulemeasureType ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=67 && LA23_0<=69)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyUiDsl.g:2794:4: (lv_measureType_2_0= rulemeasureType )
                    {
                    // InternalMyUiDsl.g:2794:4: (lv_measureType_2_0= rulemeasureType )
                    // InternalMyUiDsl.g:2795:5: lv_measureType_2_0= rulemeasureType
                    {

                    					newCompositeNode(grammarAccess.getRightAspectAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_measureType_2_0=rulemeasureType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRightAspectRule());
                    					}
                    					set(
                    						current,
                    						"measureType",
                    						lv_measureType_2_0,
                    						"edu.aut.islab.ghaemi.minuy.MyUiDsl.measureType");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleRightAspect"


    // $ANTLR start "entryRuleUpAspect"
    // InternalMyUiDsl.g:2816:1: entryRuleUpAspect returns [EObject current=null] : iv_ruleUpAspect= ruleUpAspect EOF ;
    public final EObject entryRuleUpAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpAspect = null;


        try {
            // InternalMyUiDsl.g:2816:49: (iv_ruleUpAspect= ruleUpAspect EOF )
            // InternalMyUiDsl.g:2817:2: iv_ruleUpAspect= ruleUpAspect EOF
            {
             newCompositeNode(grammarAccess.getUpAspectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpAspect=ruleUpAspect();

            state._fsp--;

             current =iv_ruleUpAspect; 
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
    // $ANTLR end "entryRuleUpAspect"


    // $ANTLR start "ruleUpAspect"
    // InternalMyUiDsl.g:2823:1: ruleUpAspect returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'up' ( (lv_measureType_2_0= rulemeasureType ) )? ) ;
    public final EObject ruleUpAspect() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_measureType_2_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:2829:2: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'up' ( (lv_measureType_2_0= rulemeasureType ) )? ) )
            // InternalMyUiDsl.g:2830:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'up' ( (lv_measureType_2_0= rulemeasureType ) )? )
            {
            // InternalMyUiDsl.g:2830:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'up' ( (lv_measureType_2_0= rulemeasureType ) )? )
            // InternalMyUiDsl.g:2831:3: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'up' ( (lv_measureType_2_0= rulemeasureType ) )?
            {
            // InternalMyUiDsl.g:2831:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyUiDsl.g:2832:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMyUiDsl.g:2832:4: (lv_value_0_0= RULE_INT )
            // InternalMyUiDsl.g:2833:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_42); 

            					newLeafNode(lv_value_0_0, grammarAccess.getUpAspectAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpAspectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,65,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getUpAspectAccess().getUpKeyword_1());
            		
            // InternalMyUiDsl.g:2853:3: ( (lv_measureType_2_0= rulemeasureType ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=67 && LA24_0<=69)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyUiDsl.g:2854:4: (lv_measureType_2_0= rulemeasureType )
                    {
                    // InternalMyUiDsl.g:2854:4: (lv_measureType_2_0= rulemeasureType )
                    // InternalMyUiDsl.g:2855:5: lv_measureType_2_0= rulemeasureType
                    {

                    					newCompositeNode(grammarAccess.getUpAspectAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_measureType_2_0=rulemeasureType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUpAspectRule());
                    					}
                    					set(
                    						current,
                    						"measureType",
                    						lv_measureType_2_0,
                    						"edu.aut.islab.ghaemi.minuy.MyUiDsl.measureType");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleUpAspect"


    // $ANTLR start "entryRuleDownAspect"
    // InternalMyUiDsl.g:2876:1: entryRuleDownAspect returns [EObject current=null] : iv_ruleDownAspect= ruleDownAspect EOF ;
    public final EObject entryRuleDownAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDownAspect = null;


        try {
            // InternalMyUiDsl.g:2876:51: (iv_ruleDownAspect= ruleDownAspect EOF )
            // InternalMyUiDsl.g:2877:2: iv_ruleDownAspect= ruleDownAspect EOF
            {
             newCompositeNode(grammarAccess.getDownAspectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDownAspect=ruleDownAspect();

            state._fsp--;

             current =iv_ruleDownAspect; 
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
    // $ANTLR end "entryRuleDownAspect"


    // $ANTLR start "ruleDownAspect"
    // InternalMyUiDsl.g:2883:1: ruleDownAspect returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'dn' ( (lv_measureType_2_0= rulemeasureType ) )? ) ;
    public final EObject ruleDownAspect() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_measureType_2_0 = null;



        	enterRule();

        try {
            // InternalMyUiDsl.g:2889:2: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'dn' ( (lv_measureType_2_0= rulemeasureType ) )? ) )
            // InternalMyUiDsl.g:2890:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'dn' ( (lv_measureType_2_0= rulemeasureType ) )? )
            {
            // InternalMyUiDsl.g:2890:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'dn' ( (lv_measureType_2_0= rulemeasureType ) )? )
            // InternalMyUiDsl.g:2891:3: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'dn' ( (lv_measureType_2_0= rulemeasureType ) )?
            {
            // InternalMyUiDsl.g:2891:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyUiDsl.g:2892:4: (lv_value_0_0= RULE_INT )
            {
            // InternalMyUiDsl.g:2892:4: (lv_value_0_0= RULE_INT )
            // InternalMyUiDsl.g:2893:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_43); 

            					newLeafNode(lv_value_0_0, grammarAccess.getDownAspectAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDownAspectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,66,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getDownAspectAccess().getDnKeyword_1());
            		
            // InternalMyUiDsl.g:2913:3: ( (lv_measureType_2_0= rulemeasureType ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=67 && LA25_0<=69)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyUiDsl.g:2914:4: (lv_measureType_2_0= rulemeasureType )
                    {
                    // InternalMyUiDsl.g:2914:4: (lv_measureType_2_0= rulemeasureType )
                    // InternalMyUiDsl.g:2915:5: lv_measureType_2_0= rulemeasureType
                    {

                    					newCompositeNode(grammarAccess.getDownAspectAccess().getMeasureTypeMeasureTypeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_measureType_2_0=rulemeasureType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDownAspectRule());
                    					}
                    					set(
                    						current,
                    						"measureType",
                    						lv_measureType_2_0,
                    						"edu.aut.islab.ghaemi.minuy.MyUiDsl.measureType");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleDownAspect"


    // $ANTLR start "entryRulemeasureType"
    // InternalMyUiDsl.g:2936:1: entryRulemeasureType returns [String current=null] : iv_rulemeasureType= rulemeasureType EOF ;
    public final String entryRulemeasureType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemeasureType = null;


        try {
            // InternalMyUiDsl.g:2936:51: (iv_rulemeasureType= rulemeasureType EOF )
            // InternalMyUiDsl.g:2937:2: iv_rulemeasureType= rulemeasureType EOF
            {
             newCompositeNode(grammarAccess.getMeasureTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemeasureType=rulemeasureType();

            state._fsp--;

             current =iv_rulemeasureType.getText(); 
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
    // $ANTLR end "entryRulemeasureType"


    // $ANTLR start "rulemeasureType"
    // InternalMyUiDsl.g:2943:1: rulemeasureType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'em' | kw= '%' | kw= 'px' ) ;
    public final AntlrDatatypeRuleToken rulemeasureType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:2949:2: ( (kw= 'em' | kw= '%' | kw= 'px' ) )
            // InternalMyUiDsl.g:2950:2: (kw= 'em' | kw= '%' | kw= 'px' )
            {
            // InternalMyUiDsl.g:2950:2: (kw= 'em' | kw= '%' | kw= 'px' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt26=1;
                }
                break;
            case 68:
                {
                alt26=2;
                }
                break;
            case 69:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalMyUiDsl.g:2951:3: kw= 'em'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMeasureTypeAccess().getEmKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:2957:3: kw= '%'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMeasureTypeAccess().getPercentSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:2963:3: kw= 'px'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMeasureTypeAccess().getPxKeyword_2());
                    		

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
    // $ANTLR end "rulemeasureType"


    // $ANTLR start "rulePosVals"
    // InternalMyUiDsl.g:2972:1: rulePosVals returns [Enumerator current=null] : ( (enumLiteral_0= 'Static' ) | (enumLiteral_1= 'Relative' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Absolute' ) | (enumLiteral_4= 'Steaky' ) ) ;
    public final Enumerator rulePosVals() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:2978:2: ( ( (enumLiteral_0= 'Static' ) | (enumLiteral_1= 'Relative' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Absolute' ) | (enumLiteral_4= 'Steaky' ) ) )
            // InternalMyUiDsl.g:2979:2: ( (enumLiteral_0= 'Static' ) | (enumLiteral_1= 'Relative' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Absolute' ) | (enumLiteral_4= 'Steaky' ) )
            {
            // InternalMyUiDsl.g:2979:2: ( (enumLiteral_0= 'Static' ) | (enumLiteral_1= 'Relative' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Absolute' ) | (enumLiteral_4= 'Steaky' ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt27=1;
                }
                break;
            case 71:
                {
                alt27=2;
                }
                break;
            case 72:
                {
                alt27=3;
                }
                break;
            case 73:
                {
                alt27=4;
                }
                break;
            case 74:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMyUiDsl.g:2980:3: (enumLiteral_0= 'Static' )
                    {
                    // InternalMyUiDsl.g:2980:3: (enumLiteral_0= 'Static' )
                    // InternalMyUiDsl.g:2981:4: enumLiteral_0= 'Static'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getPosValsAccess().getStaticEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPosValsAccess().getStaticEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:2988:3: (enumLiteral_1= 'Relative' )
                    {
                    // InternalMyUiDsl.g:2988:3: (enumLiteral_1= 'Relative' )
                    // InternalMyUiDsl.g:2989:4: enumLiteral_1= 'Relative'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getPosValsAccess().getRelativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPosValsAccess().getRelativeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:2996:3: (enumLiteral_2= 'Fixed' )
                    {
                    // InternalMyUiDsl.g:2996:3: (enumLiteral_2= 'Fixed' )
                    // InternalMyUiDsl.g:2997:4: enumLiteral_2= 'Fixed'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getPosValsAccess().getFixedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPosValsAccess().getFixedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:3004:3: (enumLiteral_3= 'Absolute' )
                    {
                    // InternalMyUiDsl.g:3004:3: (enumLiteral_3= 'Absolute' )
                    // InternalMyUiDsl.g:3005:4: enumLiteral_3= 'Absolute'
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getPosValsAccess().getAbsoluteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPosValsAccess().getAbsoluteEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyUiDsl.g:3012:3: (enumLiteral_4= 'Steaky' )
                    {
                    // InternalMyUiDsl.g:3012:3: (enumLiteral_4= 'Steaky' )
                    // InternalMyUiDsl.g:3013:4: enumLiteral_4= 'Steaky'
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getPosValsAccess().getSteakyEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPosValsAccess().getSteakyEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "rulePosVals"


    // $ANTLR start "ruleFltVals"
    // InternalMyUiDsl.g:3023:1: ruleFltVals returns [Enumerator current=null] : ( (enumLiteral_0= 'Left' ) | (enumLiteral_1= 'Right' ) | (enumLiteral_2= 'None' ) | (enumLiteral_3= 'Start' ) | (enumLiteral_4= 'End' ) ) ;
    public final Enumerator ruleFltVals() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:3029:2: ( ( (enumLiteral_0= 'Left' ) | (enumLiteral_1= 'Right' ) | (enumLiteral_2= 'None' ) | (enumLiteral_3= 'Start' ) | (enumLiteral_4= 'End' ) ) )
            // InternalMyUiDsl.g:3030:2: ( (enumLiteral_0= 'Left' ) | (enumLiteral_1= 'Right' ) | (enumLiteral_2= 'None' ) | (enumLiteral_3= 'Start' ) | (enumLiteral_4= 'End' ) )
            {
            // InternalMyUiDsl.g:3030:2: ( (enumLiteral_0= 'Left' ) | (enumLiteral_1= 'Right' ) | (enumLiteral_2= 'None' ) | (enumLiteral_3= 'Start' ) | (enumLiteral_4= 'End' ) )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt28=1;
                }
                break;
            case 76:
                {
                alt28=2;
                }
                break;
            case 77:
                {
                alt28=3;
                }
                break;
            case 78:
                {
                alt28=4;
                }
                break;
            case 79:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMyUiDsl.g:3031:3: (enumLiteral_0= 'Left' )
                    {
                    // InternalMyUiDsl.g:3031:3: (enumLiteral_0= 'Left' )
                    // InternalMyUiDsl.g:3032:4: enumLiteral_0= 'Left'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getFltValsAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFltValsAccess().getLeftEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:3039:3: (enumLiteral_1= 'Right' )
                    {
                    // InternalMyUiDsl.g:3039:3: (enumLiteral_1= 'Right' )
                    // InternalMyUiDsl.g:3040:4: enumLiteral_1= 'Right'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getFltValsAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFltValsAccess().getRightEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:3047:3: (enumLiteral_2= 'None' )
                    {
                    // InternalMyUiDsl.g:3047:3: (enumLiteral_2= 'None' )
                    // InternalMyUiDsl.g:3048:4: enumLiteral_2= 'None'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getFltValsAccess().getNoneEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFltValsAccess().getNoneEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:3055:3: (enumLiteral_3= 'Start' )
                    {
                    // InternalMyUiDsl.g:3055:3: (enumLiteral_3= 'Start' )
                    // InternalMyUiDsl.g:3056:4: enumLiteral_3= 'Start'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getFltValsAccess().getStartEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFltValsAccess().getStartEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyUiDsl.g:3063:3: (enumLiteral_4= 'End' )
                    {
                    // InternalMyUiDsl.g:3063:3: (enumLiteral_4= 'End' )
                    // InternalMyUiDsl.g:3064:4: enumLiteral_4= 'End'
                    {
                    enumLiteral_4=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getFltValsAccess().getEndEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFltValsAccess().getEndEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleFltVals"


    // $ANTLR start "ruleClrVals"
    // InternalMyUiDsl.g:3074:1: ruleClrVals returns [Enumerator current=null] : ( (enumLiteral_0= 'Left' ) | (enumLiteral_1= 'Right' ) | (enumLiteral_2= 'Both' ) | (enumLiteral_3= 'None' ) ) ;
    public final Enumerator ruleClrVals() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:3080:2: ( ( (enumLiteral_0= 'Left' ) | (enumLiteral_1= 'Right' ) | (enumLiteral_2= 'Both' ) | (enumLiteral_3= 'None' ) ) )
            // InternalMyUiDsl.g:3081:2: ( (enumLiteral_0= 'Left' ) | (enumLiteral_1= 'Right' ) | (enumLiteral_2= 'Both' ) | (enumLiteral_3= 'None' ) )
            {
            // InternalMyUiDsl.g:3081:2: ( (enumLiteral_0= 'Left' ) | (enumLiteral_1= 'Right' ) | (enumLiteral_2= 'Both' ) | (enumLiteral_3= 'None' ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt29=1;
                }
                break;
            case 76:
                {
                alt29=2;
                }
                break;
            case 80:
                {
                alt29=3;
                }
                break;
            case 77:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalMyUiDsl.g:3082:3: (enumLiteral_0= 'Left' )
                    {
                    // InternalMyUiDsl.g:3082:3: (enumLiteral_0= 'Left' )
                    // InternalMyUiDsl.g:3083:4: enumLiteral_0= 'Left'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getClrValsAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getClrValsAccess().getLeftEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:3090:3: (enumLiteral_1= 'Right' )
                    {
                    // InternalMyUiDsl.g:3090:3: (enumLiteral_1= 'Right' )
                    // InternalMyUiDsl.g:3091:4: enumLiteral_1= 'Right'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getClrValsAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getClrValsAccess().getRightEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:3098:3: (enumLiteral_2= 'Both' )
                    {
                    // InternalMyUiDsl.g:3098:3: (enumLiteral_2= 'Both' )
                    // InternalMyUiDsl.g:3099:4: enumLiteral_2= 'Both'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getClrValsAccess().getBothEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getClrValsAccess().getBothEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:3106:3: (enumLiteral_3= 'None' )
                    {
                    // InternalMyUiDsl.g:3106:3: (enumLiteral_3= 'None' )
                    // InternalMyUiDsl.g:3107:4: enumLiteral_3= 'None'
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getClrValsAccess().getNoneEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getClrValsAccess().getNoneEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleClrVals"


    // $ANTLR start "ruleDispVals"
    // InternalMyUiDsl.g:3117:1: ruleDispVals returns [Enumerator current=null] : ( (enumLiteral_0= 'Block' ) | (enumLiteral_1= 'Inline' ) | (enumLiteral_2= 'InBl' ) | (enumLiteral_3= 'Table' ) | (enumLiteral_4= 'None' ) ) ;
    public final Enumerator ruleDispVals() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:3123:2: ( ( (enumLiteral_0= 'Block' ) | (enumLiteral_1= 'Inline' ) | (enumLiteral_2= 'InBl' ) | (enumLiteral_3= 'Table' ) | (enumLiteral_4= 'None' ) ) )
            // InternalMyUiDsl.g:3124:2: ( (enumLiteral_0= 'Block' ) | (enumLiteral_1= 'Inline' ) | (enumLiteral_2= 'InBl' ) | (enumLiteral_3= 'Table' ) | (enumLiteral_4= 'None' ) )
            {
            // InternalMyUiDsl.g:3124:2: ( (enumLiteral_0= 'Block' ) | (enumLiteral_1= 'Inline' ) | (enumLiteral_2= 'InBl' ) | (enumLiteral_3= 'Table' ) | (enumLiteral_4= 'None' ) )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt30=1;
                }
                break;
            case 82:
                {
                alt30=2;
                }
                break;
            case 83:
                {
                alt30=3;
                }
                break;
            case 84:
                {
                alt30=4;
                }
                break;
            case 77:
                {
                alt30=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalMyUiDsl.g:3125:3: (enumLiteral_0= 'Block' )
                    {
                    // InternalMyUiDsl.g:3125:3: (enumLiteral_0= 'Block' )
                    // InternalMyUiDsl.g:3126:4: enumLiteral_0= 'Block'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getDispValsAccess().getBlockEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDispValsAccess().getBlockEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:3133:3: (enumLiteral_1= 'Inline' )
                    {
                    // InternalMyUiDsl.g:3133:3: (enumLiteral_1= 'Inline' )
                    // InternalMyUiDsl.g:3134:4: enumLiteral_1= 'Inline'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getDispValsAccess().getInlineEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDispValsAccess().getInlineEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:3141:3: (enumLiteral_2= 'InBl' )
                    {
                    // InternalMyUiDsl.g:3141:3: (enumLiteral_2= 'InBl' )
                    // InternalMyUiDsl.g:3142:4: enumLiteral_2= 'InBl'
                    {
                    enumLiteral_2=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getDispValsAccess().getInBlEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDispValsAccess().getInBlEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:3149:3: (enumLiteral_3= 'Table' )
                    {
                    // InternalMyUiDsl.g:3149:3: (enumLiteral_3= 'Table' )
                    // InternalMyUiDsl.g:3150:4: enumLiteral_3= 'Table'
                    {
                    enumLiteral_3=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getDispValsAccess().getTableEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDispValsAccess().getTableEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyUiDsl.g:3157:3: (enumLiteral_4= 'None' )
                    {
                    // InternalMyUiDsl.g:3157:3: (enumLiteral_4= 'None' )
                    // InternalMyUiDsl.g:3158:4: enumLiteral_4= 'None'
                    {
                    enumLiteral_4=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getDispValsAccess().getNoneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDispValsAccess().getNoneEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleDispVals"


    // $ANTLR start "ruleVeralVals"
    // InternalMyUiDsl.g:3168:1: ruleVeralVals returns [Enumerator current=null] : ( (enumLiteral_0= 'Top' ) | (enumLiteral_1= 'Down' ) | (enumLiteral_2= 'Center' ) ) ;
    public final Enumerator ruleVeralVals() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:3174:2: ( ( (enumLiteral_0= 'Top' ) | (enumLiteral_1= 'Down' ) | (enumLiteral_2= 'Center' ) ) )
            // InternalMyUiDsl.g:3175:2: ( (enumLiteral_0= 'Top' ) | (enumLiteral_1= 'Down' ) | (enumLiteral_2= 'Center' ) )
            {
            // InternalMyUiDsl.g:3175:2: ( (enumLiteral_0= 'Top' ) | (enumLiteral_1= 'Down' ) | (enumLiteral_2= 'Center' ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt31=1;
                }
                break;
            case 86:
                {
                alt31=2;
                }
                break;
            case 87:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalMyUiDsl.g:3176:3: (enumLiteral_0= 'Top' )
                    {
                    // InternalMyUiDsl.g:3176:3: (enumLiteral_0= 'Top' )
                    // InternalMyUiDsl.g:3177:4: enumLiteral_0= 'Top'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getVeralValsAccess().getTopEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVeralValsAccess().getTopEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:3184:3: (enumLiteral_1= 'Down' )
                    {
                    // InternalMyUiDsl.g:3184:3: (enumLiteral_1= 'Down' )
                    // InternalMyUiDsl.g:3185:4: enumLiteral_1= 'Down'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getVeralValsAccess().getDownEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVeralValsAccess().getDownEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:3192:3: (enumLiteral_2= 'Center' )
                    {
                    // InternalMyUiDsl.g:3192:3: (enumLiteral_2= 'Center' )
                    // InternalMyUiDsl.g:3193:4: enumLiteral_2= 'Center'
                    {
                    enumLiteral_2=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getVeralValsAccess().getCenterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVeralValsAccess().getCenterEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleVeralVals"


    // $ANTLR start "ruleOFlowVals"
    // InternalMyUiDsl.g:3203:1: ruleOFlowVals returns [Enumerator current=null] : ( (enumLiteral_0= 'Scroll' ) | (enumLiteral_1= 'Visible' ) | (enumLiteral_2= 'Hidden' ) | (enumLiteral_3= 'Auto' ) ) ;
    public final Enumerator ruleOFlowVals() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:3209:2: ( ( (enumLiteral_0= 'Scroll' ) | (enumLiteral_1= 'Visible' ) | (enumLiteral_2= 'Hidden' ) | (enumLiteral_3= 'Auto' ) ) )
            // InternalMyUiDsl.g:3210:2: ( (enumLiteral_0= 'Scroll' ) | (enumLiteral_1= 'Visible' ) | (enumLiteral_2= 'Hidden' ) | (enumLiteral_3= 'Auto' ) )
            {
            // InternalMyUiDsl.g:3210:2: ( (enumLiteral_0= 'Scroll' ) | (enumLiteral_1= 'Visible' ) | (enumLiteral_2= 'Hidden' ) | (enumLiteral_3= 'Auto' ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt32=1;
                }
                break;
            case 89:
                {
                alt32=2;
                }
                break;
            case 90:
                {
                alt32=3;
                }
                break;
            case 91:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalMyUiDsl.g:3211:3: (enumLiteral_0= 'Scroll' )
                    {
                    // InternalMyUiDsl.g:3211:3: (enumLiteral_0= 'Scroll' )
                    // InternalMyUiDsl.g:3212:4: enumLiteral_0= 'Scroll'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getOFlowValsAccess().getScrollEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOFlowValsAccess().getScrollEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:3219:3: (enumLiteral_1= 'Visible' )
                    {
                    // InternalMyUiDsl.g:3219:3: (enumLiteral_1= 'Visible' )
                    // InternalMyUiDsl.g:3220:4: enumLiteral_1= 'Visible'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getOFlowValsAccess().getVisibleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOFlowValsAccess().getVisibleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:3227:3: (enumLiteral_2= 'Hidden' )
                    {
                    // InternalMyUiDsl.g:3227:3: (enumLiteral_2= 'Hidden' )
                    // InternalMyUiDsl.g:3228:4: enumLiteral_2= 'Hidden'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getOFlowValsAccess().getHiddenEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOFlowValsAccess().getHiddenEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:3235:3: (enumLiteral_3= 'Auto' )
                    {
                    // InternalMyUiDsl.g:3235:3: (enumLiteral_3= 'Auto' )
                    // InternalMyUiDsl.g:3236:4: enumLiteral_3= 'Auto'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getOFlowValsAccess().getAutoEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOFlowValsAccess().getAutoEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleOFlowVals"


    // $ANTLR start "ruleInnerTypeArray"
    // InternalMyUiDsl.g:3246:1: ruleInnerTypeArray returns [Enumerator current=null] : ( (enumLiteral_0= 'Div' ) | (enumLiteral_1= 'Para' ) | (enumLiteral_2= 'Input' ) | (enumLiteral_3= 'Table' ) | (enumLiteral_4= 'Tr' ) | (enumLiteral_5= 'Td' ) | (enumLiteral_6= 'Img' ) | (enumLiteral_7= 'Form' ) | (enumLiteral_8= 'Button' ) ) ;
    public final Enumerator ruleInnerTypeArray() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalMyUiDsl.g:3252:2: ( ( (enumLiteral_0= 'Div' ) | (enumLiteral_1= 'Para' ) | (enumLiteral_2= 'Input' ) | (enumLiteral_3= 'Table' ) | (enumLiteral_4= 'Tr' ) | (enumLiteral_5= 'Td' ) | (enumLiteral_6= 'Img' ) | (enumLiteral_7= 'Form' ) | (enumLiteral_8= 'Button' ) ) )
            // InternalMyUiDsl.g:3253:2: ( (enumLiteral_0= 'Div' ) | (enumLiteral_1= 'Para' ) | (enumLiteral_2= 'Input' ) | (enumLiteral_3= 'Table' ) | (enumLiteral_4= 'Tr' ) | (enumLiteral_5= 'Td' ) | (enumLiteral_6= 'Img' ) | (enumLiteral_7= 'Form' ) | (enumLiteral_8= 'Button' ) )
            {
            // InternalMyUiDsl.g:3253:2: ( (enumLiteral_0= 'Div' ) | (enumLiteral_1= 'Para' ) | (enumLiteral_2= 'Input' ) | (enumLiteral_3= 'Table' ) | (enumLiteral_4= 'Tr' ) | (enumLiteral_5= 'Td' ) | (enumLiteral_6= 'Img' ) | (enumLiteral_7= 'Form' ) | (enumLiteral_8= 'Button' ) )
            int alt33=9;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt33=1;
                }
                break;
            case 93:
                {
                alt33=2;
                }
                break;
            case 94:
                {
                alt33=3;
                }
                break;
            case 84:
                {
                alt33=4;
                }
                break;
            case 95:
                {
                alt33=5;
                }
                break;
            case 96:
                {
                alt33=6;
                }
                break;
            case 97:
                {
                alt33=7;
                }
                break;
            case 98:
                {
                alt33=8;
                }
                break;
            case 99:
                {
                alt33=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalMyUiDsl.g:3254:3: (enumLiteral_0= 'Div' )
                    {
                    // InternalMyUiDsl.g:3254:3: (enumLiteral_0= 'Div' )
                    // InternalMyUiDsl.g:3255:4: enumLiteral_0= 'Div'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getInnerTypeArrayAccess().getDivEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInnerTypeArrayAccess().getDivEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:3262:3: (enumLiteral_1= 'Para' )
                    {
                    // InternalMyUiDsl.g:3262:3: (enumLiteral_1= 'Para' )
                    // InternalMyUiDsl.g:3263:4: enumLiteral_1= 'Para'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getInnerTypeArrayAccess().getParaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getInnerTypeArrayAccess().getParaEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUiDsl.g:3270:3: (enumLiteral_2= 'Input' )
                    {
                    // InternalMyUiDsl.g:3270:3: (enumLiteral_2= 'Input' )
                    // InternalMyUiDsl.g:3271:4: enumLiteral_2= 'Input'
                    {
                    enumLiteral_2=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getInnerTypeArrayAccess().getInputEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getInnerTypeArrayAccess().getInputEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUiDsl.g:3278:3: (enumLiteral_3= 'Table' )
                    {
                    // InternalMyUiDsl.g:3278:3: (enumLiteral_3= 'Table' )
                    // InternalMyUiDsl.g:3279:4: enumLiteral_3= 'Table'
                    {
                    enumLiteral_3=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getInnerTypeArrayAccess().getTableEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getInnerTypeArrayAccess().getTableEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyUiDsl.g:3286:3: (enumLiteral_4= 'Tr' )
                    {
                    // InternalMyUiDsl.g:3286:3: (enumLiteral_4= 'Tr' )
                    // InternalMyUiDsl.g:3287:4: enumLiteral_4= 'Tr'
                    {
                    enumLiteral_4=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getInnerTypeArrayAccess().getTrEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getInnerTypeArrayAccess().getTrEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyUiDsl.g:3294:3: (enumLiteral_5= 'Td' )
                    {
                    // InternalMyUiDsl.g:3294:3: (enumLiteral_5= 'Td' )
                    // InternalMyUiDsl.g:3295:4: enumLiteral_5= 'Td'
                    {
                    enumLiteral_5=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getInnerTypeArrayAccess().getTdEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getInnerTypeArrayAccess().getTdEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyUiDsl.g:3302:3: (enumLiteral_6= 'Img' )
                    {
                    // InternalMyUiDsl.g:3302:3: (enumLiteral_6= 'Img' )
                    // InternalMyUiDsl.g:3303:4: enumLiteral_6= 'Img'
                    {
                    enumLiteral_6=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getInnerTypeArrayAccess().getImgEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getInnerTypeArrayAccess().getImgEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyUiDsl.g:3310:3: (enumLiteral_7= 'Form' )
                    {
                    // InternalMyUiDsl.g:3310:3: (enumLiteral_7= 'Form' )
                    // InternalMyUiDsl.g:3311:4: enumLiteral_7= 'Form'
                    {
                    enumLiteral_7=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getInnerTypeArrayAccess().getFormEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getInnerTypeArrayAccess().getFormEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyUiDsl.g:3318:3: (enumLiteral_8= 'Button' )
                    {
                    // InternalMyUiDsl.g:3318:3: (enumLiteral_8= 'Button' )
                    // InternalMyUiDsl.g:3319:4: enumLiteral_8= 'Button'
                    {
                    enumLiteral_8=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getInnerTypeArrayAccess().getButtonEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getInnerTypeArrayAccess().getButtonEnumLiteralDeclaration_8());
                    			

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
    // $ANTLR end "ruleInnerTypeArray"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010060L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000025400082L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x1FFE000382000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000FF0100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00001FFC00000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000038L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007C0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000013800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E2000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000E00000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x000000000F000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});

}
