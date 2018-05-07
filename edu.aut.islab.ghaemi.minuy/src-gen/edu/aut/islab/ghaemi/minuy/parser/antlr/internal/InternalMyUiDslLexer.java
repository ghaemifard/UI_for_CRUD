package edu.aut.islab.ghaemi.minuy.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyUiDslLexer extends Lexer {
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

    public InternalMyUiDslLexer() {;} 
    public InternalMyUiDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyUiDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyUiDsl.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:11:7: ( '|' )
            // InternalMyUiDsl.g:11:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:12:7: ( 'import' )
            // InternalMyUiDsl.g:12:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:13:7: ( 'as' )
            // InternalMyUiDsl.g:13:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:14:7: ( ';' )
            // InternalMyUiDsl.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:15:7: ( '_CSS' )
            // InternalMyUiDsl.g:15:9: '_CSS'
            {
            match("_CSS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:16:7: ( '_JS' )
            // InternalMyUiDsl.g:16:9: '_JS'
            {
            match("_JS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:17:7: ( '->' )
            // InternalMyUiDsl.g:17:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:18:7: ( '*' )
            // InternalMyUiDsl.g:18:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:19:7: ( ':' )
            // InternalMyUiDsl.g:19:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:20:7: ( '<' )
            // InternalMyUiDsl.g:20:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:21:7: ( '>' )
            // InternalMyUiDsl.g:21:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:22:7: ( '(' )
            // InternalMyUiDsl.g:22:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:23:7: ( ')' )
            // InternalMyUiDsl.g:23:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:24:7: ( '[' )
            // InternalMyUiDsl.g:24:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:25:7: ( ']' )
            // InternalMyUiDsl.g:25:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:26:7: ( ',' )
            // InternalMyUiDsl.g:26:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:27:7: ( '{' )
            // InternalMyUiDsl.g:27:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:28:7: ( '}' )
            // InternalMyUiDsl.g:28:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:29:7: ( 'border:' )
            // InternalMyUiDsl.g:29:9: 'border:'
            {
            match("border:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:30:7: ( 'color:' )
            // InternalMyUiDsl.g:30:9: 'color:'
            {
            match("color:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:31:7: ( 'bcolor:' )
            // InternalMyUiDsl.g:31:9: 'bcolor:'
            {
            match("bcolor:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:32:7: ( 'Red' )
            // InternalMyUiDsl.g:32:9: 'Red'
            {
            match("Red"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:33:7: ( 'Blue' )
            // InternalMyUiDsl.g:33:9: 'Blue'
            {
            match("Blue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:34:7: ( 'Black' )
            // InternalMyUiDsl.g:34:9: 'Black'
            {
            match("Black"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:35:7: ( 'Green' )
            // InternalMyUiDsl.g:35:9: 'Green'
            {
            match("Green"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:36:7: ( 'Yellow' )
            // InternalMyUiDsl.g:36:9: 'Yellow'
            {
            match("Yellow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:37:7: ( 'Pink' )
            // InternalMyUiDsl.g:37:9: 'Pink'
            {
            match("Pink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:38:7: ( 'Brown' )
            // InternalMyUiDsl.g:38:9: 'Brown'
            {
            match("Brown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:39:7: ( 'Gold' )
            // InternalMyUiDsl.g:39:9: 'Gold'
            {
            match("Gold"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:40:7: ( 'White' )
            // InternalMyUiDsl.g:40:9: 'White'
            {
            match("White"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:41:7: ( 'Grey' )
            // InternalMyUiDsl.g:41:9: 'Grey'
            {
            match("Grey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:42:7: ( 'rgba(' )
            // InternalMyUiDsl.g:42:9: 'rgba('
            {
            match("rgba("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:43:7: ( 'red' )
            // InternalMyUiDsl.g:43:9: 'red'
            {
            match("red"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:44:7: ( 'grn' )
            // InternalMyUiDsl.g:44:9: 'grn'
            {
            match("grn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:45:7: ( 'blu' )
            // InternalMyUiDsl.g:45:9: 'blu'
            {
            match("blu"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:46:7: ( 'alfa' )
            // InternalMyUiDsl.g:46:9: 'alfa'
            {
            match("alfa"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:47:7: ( 'Arc:' )
            // InternalMyUiDsl.g:47:9: 'Arc:'
            {
            match("Arc:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:48:7: ( 'Pos:' )
            // InternalMyUiDsl.g:48:9: 'Pos:'
            {
            match("Pos:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:49:7: ( 'Flt:' )
            // InternalMyUiDsl.g:49:9: 'Flt:'
            {
            match("Flt:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:50:7: ( 'Clr:' )
            // InternalMyUiDsl.g:50:9: 'Clr:'
            {
            match("Clr:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:51:7: ( 'Disp:' )
            // InternalMyUiDsl.g:51:9: 'Disp:'
            {
            match("Disp:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:52:7: ( 'Ver_Al:' )
            // InternalMyUiDsl.g:52:9: 'Ver_Al:'
            {
            match("Ver_Al:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:53:7: ( 'OFlow:' )
            // InternalMyUiDsl.g:53:9: 'OFlow:'
            {
            match("OFlow:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:54:7: ( 'Wid:' )
            // InternalMyUiDsl.g:54:9: 'Wid:'
            {
            match("Wid:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:55:7: ( 'H8:' )
            // InternalMyUiDsl.g:55:9: 'H8:'
            {
            match("H8:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:56:7: ( 'Coord:' )
            // InternalMyUiDsl.g:56:9: 'Coord:'
            {
            match("Coord:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:57:7: ( 'Marg:' )
            // InternalMyUiDsl.g:57:9: 'Marg:'
            {
            match("Marg:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:58:7: ( 'Padd:' )
            // InternalMyUiDsl.g:58:9: 'Padd:'
            {
            match("Padd:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:59:7: ( 'lo' )
            // InternalMyUiDsl.g:59:9: 'lo'
            {
            match("lo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:60:7: ( 'hi' )
            // InternalMyUiDsl.g:60:9: 'hi'
            {
            match("hi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:61:7: ( 'le' )
            // InternalMyUiDsl.g:61:9: 'le'
            {
            match("le"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:62:7: ( 'ri' )
            // InternalMyUiDsl.g:62:9: 'ri'
            {
            match("ri"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:63:7: ( 'up' )
            // InternalMyUiDsl.g:63:9: 'up'
            {
            match("up"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:64:7: ( 'dn' )
            // InternalMyUiDsl.g:64:9: 'dn'
            {
            match("dn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:65:7: ( 'em' )
            // InternalMyUiDsl.g:65:9: 'em'
            {
            match("em"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:66:7: ( '%' )
            // InternalMyUiDsl.g:66:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:67:7: ( 'px' )
            // InternalMyUiDsl.g:67:9: 'px'
            {
            match("px"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:68:7: ( 'Static' )
            // InternalMyUiDsl.g:68:9: 'Static'
            {
            match("Static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:69:7: ( 'Relative' )
            // InternalMyUiDsl.g:69:9: 'Relative'
            {
            match("Relative"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:70:7: ( 'Fixed' )
            // InternalMyUiDsl.g:70:9: 'Fixed'
            {
            match("Fixed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:71:7: ( 'Absolute' )
            // InternalMyUiDsl.g:71:9: 'Absolute'
            {
            match("Absolute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:72:7: ( 'Steaky' )
            // InternalMyUiDsl.g:72:9: 'Steaky'
            {
            match("Steaky"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:73:7: ( 'Left' )
            // InternalMyUiDsl.g:73:9: 'Left'
            {
            match("Left"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:74:7: ( 'Right' )
            // InternalMyUiDsl.g:74:9: 'Right'
            {
            match("Right"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:75:7: ( 'None' )
            // InternalMyUiDsl.g:75:9: 'None'
            {
            match("None"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:76:7: ( 'Start' )
            // InternalMyUiDsl.g:76:9: 'Start'
            {
            match("Start"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:77:7: ( 'End' )
            // InternalMyUiDsl.g:77:9: 'End'
            {
            match("End"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:78:7: ( 'Both' )
            // InternalMyUiDsl.g:78:9: 'Both'
            {
            match("Both"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:79:7: ( 'Block' )
            // InternalMyUiDsl.g:79:9: 'Block'
            {
            match("Block"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:80:7: ( 'Inline' )
            // InternalMyUiDsl.g:80:9: 'Inline'
            {
            match("Inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:81:7: ( 'InBl' )
            // InternalMyUiDsl.g:81:9: 'InBl'
            {
            match("InBl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:82:7: ( 'Table' )
            // InternalMyUiDsl.g:82:9: 'Table'
            {
            match("Table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:83:7: ( 'Top' )
            // InternalMyUiDsl.g:83:9: 'Top'
            {
            match("Top"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:84:7: ( 'Down' )
            // InternalMyUiDsl.g:84:9: 'Down'
            {
            match("Down"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:85:7: ( 'Center' )
            // InternalMyUiDsl.g:85:9: 'Center'
            {
            match("Center"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:86:7: ( 'Scroll' )
            // InternalMyUiDsl.g:86:9: 'Scroll'
            {
            match("Scroll"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:87:7: ( 'Visible' )
            // InternalMyUiDsl.g:87:9: 'Visible'
            {
            match("Visible"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:88:7: ( 'Hidden' )
            // InternalMyUiDsl.g:88:9: 'Hidden'
            {
            match("Hidden"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:89:7: ( 'Auto' )
            // InternalMyUiDsl.g:89:9: 'Auto'
            {
            match("Auto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:90:7: ( 'Div' )
            // InternalMyUiDsl.g:90:9: 'Div'
            {
            match("Div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:91:7: ( 'Para' )
            // InternalMyUiDsl.g:91:9: 'Para'
            {
            match("Para"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:92:7: ( 'Input' )
            // InternalMyUiDsl.g:92:9: 'Input'
            {
            match("Input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:93:7: ( 'Tr' )
            // InternalMyUiDsl.g:93:9: 'Tr'
            {
            match("Tr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:94:7: ( 'Td' )
            // InternalMyUiDsl.g:94:9: 'Td'
            {
            match("Td"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:95:7: ( 'Img' )
            // InternalMyUiDsl.g:95:9: 'Img'
            {
            match("Img"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:96:7: ( 'Form' )
            // InternalMyUiDsl.g:96:9: 'Form'
            {
            match("Form"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:97:7: ( 'Button' )
            // InternalMyUiDsl.g:97:9: 'Button'
            {
            match("Button"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "RULE_ONECHAR"
    public final void mRULE_ONECHAR() throws RecognitionException {
        try {
            int _type = RULE_ONECHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:3328:14: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalMyUiDsl.g:3328:16: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ONECHAR"

    // $ANTLR start "RULE_STRING2"
    public final void mRULE_STRING2() throws RecognitionException {
        try {
            int _type = RULE_STRING2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:3330:14: ( '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalMyUiDsl.g:3330:16: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalMyUiDsl.g:3330:21: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyUiDsl.g:3330:22: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMyUiDsl.g:3330:29: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING2"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:3332:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyUiDsl.g:3332:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyUiDsl.g:3332:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyUiDsl.g:3332:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyUiDsl.g:3332:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyUiDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:3334:10: ( ( '0' .. '9' )+ )
            // InternalMyUiDsl.g:3334:12: ( '0' .. '9' )+
            {
            // InternalMyUiDsl.g:3334:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyUiDsl.g:3334:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:3336:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyUiDsl.g:3336:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyUiDsl.g:3336:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyUiDsl.g:3336:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyUiDsl.g:3336:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyUiDsl.g:3336:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyUiDsl.g:3336:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyUiDsl.g:3336:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyUiDsl.g:3336:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyUiDsl.g:3336:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyUiDsl.g:3336:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:3338:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyUiDsl.g:3338:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyUiDsl.g:3338:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyUiDsl.g:3338:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:3340:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyUiDsl.g:3340:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyUiDsl.g:3340:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyUiDsl.g:3340:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalMyUiDsl.g:3340:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyUiDsl.g:3340:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyUiDsl.g:3340:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMyUiDsl.g:3340:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:3342:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyUiDsl.g:3342:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyUiDsl.g:3342:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyUiDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUiDsl.g:3344:16: ( . )
            // InternalMyUiDsl.g:3344:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyUiDsl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | RULE_ONECHAR | RULE_STRING2 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=96;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalMyUiDsl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalMyUiDsl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalMyUiDsl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalMyUiDsl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalMyUiDsl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalMyUiDsl.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalMyUiDsl.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalMyUiDsl.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalMyUiDsl.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalMyUiDsl.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalMyUiDsl.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalMyUiDsl.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalMyUiDsl.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalMyUiDsl.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalMyUiDsl.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalMyUiDsl.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalMyUiDsl.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalMyUiDsl.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalMyUiDsl.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalMyUiDsl.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalMyUiDsl.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalMyUiDsl.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalMyUiDsl.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalMyUiDsl.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalMyUiDsl.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalMyUiDsl.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalMyUiDsl.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalMyUiDsl.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalMyUiDsl.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalMyUiDsl.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalMyUiDsl.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalMyUiDsl.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalMyUiDsl.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalMyUiDsl.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalMyUiDsl.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalMyUiDsl.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalMyUiDsl.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // InternalMyUiDsl.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // InternalMyUiDsl.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // InternalMyUiDsl.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // InternalMyUiDsl.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // InternalMyUiDsl.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // InternalMyUiDsl.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // InternalMyUiDsl.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // InternalMyUiDsl.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // InternalMyUiDsl.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // InternalMyUiDsl.g:1:286: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // InternalMyUiDsl.g:1:292: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // InternalMyUiDsl.g:1:298: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // InternalMyUiDsl.g:1:304: T__62
                {
                mT__62(); 

                }
                break;
            case 51 :
                // InternalMyUiDsl.g:1:310: T__63
                {
                mT__63(); 

                }
                break;
            case 52 :
                // InternalMyUiDsl.g:1:316: T__64
                {
                mT__64(); 

                }
                break;
            case 53 :
                // InternalMyUiDsl.g:1:322: T__65
                {
                mT__65(); 

                }
                break;
            case 54 :
                // InternalMyUiDsl.g:1:328: T__66
                {
                mT__66(); 

                }
                break;
            case 55 :
                // InternalMyUiDsl.g:1:334: T__67
                {
                mT__67(); 

                }
                break;
            case 56 :
                // InternalMyUiDsl.g:1:340: T__68
                {
                mT__68(); 

                }
                break;
            case 57 :
                // InternalMyUiDsl.g:1:346: T__69
                {
                mT__69(); 

                }
                break;
            case 58 :
                // InternalMyUiDsl.g:1:352: T__70
                {
                mT__70(); 

                }
                break;
            case 59 :
                // InternalMyUiDsl.g:1:358: T__71
                {
                mT__71(); 

                }
                break;
            case 60 :
                // InternalMyUiDsl.g:1:364: T__72
                {
                mT__72(); 

                }
                break;
            case 61 :
                // InternalMyUiDsl.g:1:370: T__73
                {
                mT__73(); 

                }
                break;
            case 62 :
                // InternalMyUiDsl.g:1:376: T__74
                {
                mT__74(); 

                }
                break;
            case 63 :
                // InternalMyUiDsl.g:1:382: T__75
                {
                mT__75(); 

                }
                break;
            case 64 :
                // InternalMyUiDsl.g:1:388: T__76
                {
                mT__76(); 

                }
                break;
            case 65 :
                // InternalMyUiDsl.g:1:394: T__77
                {
                mT__77(); 

                }
                break;
            case 66 :
                // InternalMyUiDsl.g:1:400: T__78
                {
                mT__78(); 

                }
                break;
            case 67 :
                // InternalMyUiDsl.g:1:406: T__79
                {
                mT__79(); 

                }
                break;
            case 68 :
                // InternalMyUiDsl.g:1:412: T__80
                {
                mT__80(); 

                }
                break;
            case 69 :
                // InternalMyUiDsl.g:1:418: T__81
                {
                mT__81(); 

                }
                break;
            case 70 :
                // InternalMyUiDsl.g:1:424: T__82
                {
                mT__82(); 

                }
                break;
            case 71 :
                // InternalMyUiDsl.g:1:430: T__83
                {
                mT__83(); 

                }
                break;
            case 72 :
                // InternalMyUiDsl.g:1:436: T__84
                {
                mT__84(); 

                }
                break;
            case 73 :
                // InternalMyUiDsl.g:1:442: T__85
                {
                mT__85(); 

                }
                break;
            case 74 :
                // InternalMyUiDsl.g:1:448: T__86
                {
                mT__86(); 

                }
                break;
            case 75 :
                // InternalMyUiDsl.g:1:454: T__87
                {
                mT__87(); 

                }
                break;
            case 76 :
                // InternalMyUiDsl.g:1:460: T__88
                {
                mT__88(); 

                }
                break;
            case 77 :
                // InternalMyUiDsl.g:1:466: T__89
                {
                mT__89(); 

                }
                break;
            case 78 :
                // InternalMyUiDsl.g:1:472: T__90
                {
                mT__90(); 

                }
                break;
            case 79 :
                // InternalMyUiDsl.g:1:478: T__91
                {
                mT__91(); 

                }
                break;
            case 80 :
                // InternalMyUiDsl.g:1:484: T__92
                {
                mT__92(); 

                }
                break;
            case 81 :
                // InternalMyUiDsl.g:1:490: T__93
                {
                mT__93(); 

                }
                break;
            case 82 :
                // InternalMyUiDsl.g:1:496: T__94
                {
                mT__94(); 

                }
                break;
            case 83 :
                // InternalMyUiDsl.g:1:502: T__95
                {
                mT__95(); 

                }
                break;
            case 84 :
                // InternalMyUiDsl.g:1:508: T__96
                {
                mT__96(); 

                }
                break;
            case 85 :
                // InternalMyUiDsl.g:1:514: T__97
                {
                mT__97(); 

                }
                break;
            case 86 :
                // InternalMyUiDsl.g:1:520: T__98
                {
                mT__98(); 

                }
                break;
            case 87 :
                // InternalMyUiDsl.g:1:526: T__99
                {
                mT__99(); 

                }
                break;
            case 88 :
                // InternalMyUiDsl.g:1:532: RULE_ONECHAR
                {
                mRULE_ONECHAR(); 

                }
                break;
            case 89 :
                // InternalMyUiDsl.g:1:545: RULE_STRING2
                {
                mRULE_STRING2(); 

                }
                break;
            case 90 :
                // InternalMyUiDsl.g:1:558: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 91 :
                // InternalMyUiDsl.g:1:566: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 92 :
                // InternalMyUiDsl.g:1:575: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 93 :
                // InternalMyUiDsl.g:1:587: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 94 :
                // InternalMyUiDsl.g:1:603: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 95 :
                // InternalMyUiDsl.g:1:619: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 96 :
                // InternalMyUiDsl.g:1:627: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\2\uffff\2\73\1\uffff\1\74\1\70\13\uffff\27\73\1\uffff\10\73\2\70\1\uffff\2\70\3\uffff\1\74\2\uffff\1\u0091\1\74\1\uffff\2\74\14\uffff\24\74\1\u00ad\22\74\1\u00c1\1\u00c2\1\u00c3\1\u00c4\1\u00c5\1\u00c6\1\uffff\1\u00c7\11\74\1\u00d4\1\u00d5\10\uffff\1\74\1\uffff\2\74\1\u00db\2\74\1\u00de\1\74\1\u00e0\22\74\1\u00f4\1\uffff\1\u00f5\12\74\1\u0100\4\74\1\uffff\2\74\7\uffff\5\74\1\u010d\3\74\1\u0111\1\74\1\u0113\4\uffff\1\74\1\u0115\1\u0116\1\uffff\2\74\1\uffff\1\74\1\uffff\2\74\1\u011c\3\74\1\u0120\2\74\1\u0123\1\u0124\1\74\1\u0126\1\uffff\1\74\1\u0128\1\74\1\uffff\1\74\3\uffff\1\74\1\u012c\1\uffff\1\74\1\u012e\1\uffff\3\74\1\uffff\1\u0132\11\74\1\u013c\1\u013d\1\uffff\1\74\1\u013f\1\74\1\uffff\1\74\1\uffff\1\74\2\uffff\4\74\1\u0147\1\uffff\1\u0148\1\u0149\1\u014a\1\uffff\1\74\1\u014c\2\uffff\1\74\3\uffff\1\u014e\1\uffff\1\74\1\uffff\1\u0150\1\uffff\2\74\2\uffff\4\74\1\uffff\1\74\1\u0158\2\74\2\uffff\1\74\1\uffff\1\u015c\1\u015d\1\u015e\2\74\1\uffff\1\74\4\uffff\1\u0162\1\uffff\1\u0163\1\uffff\1\74\2\uffff\1\u0165\2\74\1\uffff\1\u0168\1\u0169\1\uffff\1\u016a\1\u016b\1\u016c\5\uffff\1\74\2\uffff\1\74\2\uffff\1\u016f\5\uffff\1\u0170\1\u0171\3\uffff";
    static final String DFA13_eofS =
        "\u0172\uffff";
    static final String DFA13_minS =
        "\1\0\1\uffff\2\60\1\uffff\1\103\1\76\13\uffff\27\60\1\uffff\10\60\1\0\1\101\1\uffff\1\0\1\52\3\uffff\1\160\2\uffff\1\60\1\146\1\uffff\2\123\14\uffff\1\162\1\157\1\165\1\154\1\144\1\147\1\141\1\157\2\164\1\145\2\154\1\156\1\163\1\144\1\151\1\144\1\142\1\144\1\60\1\156\1\143\1\163\2\164\1\170\2\162\1\157\1\156\1\163\1\167\1\162\1\163\1\154\1\72\1\144\1\162\6\60\1\uffff\1\60\1\141\1\162\1\146\1\156\1\144\1\102\1\147\1\142\1\160\2\60\2\0\6\uffff\1\157\1\uffff\1\141\1\123\1\60\1\144\1\154\1\60\1\157\1\60\1\141\1\150\1\145\2\143\1\167\1\150\1\164\1\145\1\144\1\154\1\153\1\72\1\144\1\141\1\164\1\72\1\141\1\60\1\uffff\1\60\1\72\2\157\1\72\1\145\1\155\1\72\1\162\1\164\1\160\1\60\1\156\1\137\1\151\1\157\1\uffff\1\144\1\147\7\uffff\1\162\1\141\1\157\1\164\1\145\1\60\1\151\1\154\1\165\1\60\1\154\1\60\2\uffff\1\0\1\uffff\1\162\2\60\1\uffff\1\145\1\157\1\uffff\1\162\1\uffff\2\164\1\60\2\153\1\156\1\60\1\157\1\156\2\60\1\157\1\60\1\uffff\1\72\1\60\1\145\1\uffff\1\50\3\uffff\1\154\1\60\1\uffff\1\144\1\60\1\uffff\1\144\1\145\1\72\1\uffff\1\60\1\101\1\142\1\167\1\145\1\72\1\151\1\164\1\153\1\154\2\60\1\uffff\1\156\1\60\1\164\1\uffff\1\145\1\uffff\1\164\2\uffff\2\162\1\72\1\151\1\60\1\uffff\3\60\1\uffff\1\156\1\60\2\uffff\1\167\3\uffff\1\60\1\uffff\1\165\1\uffff\1\60\1\uffff\1\72\1\162\2\uffff\2\154\1\72\1\156\1\uffff\1\143\1\60\1\171\1\154\2\uffff\1\145\1\uffff\3\60\2\72\1\uffff\1\166\4\uffff\1\60\1\uffff\1\60\1\uffff\1\164\2\uffff\1\60\1\72\1\145\1\uffff\2\60\1\uffff\3\60\5\uffff\1\145\2\uffff\1\145\2\uffff\1\60\5\uffff\2\60\3\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\uffff\2\172\1\uffff\1\112\1\76\13\uffff\27\172\1\uffff\10\172\1\uffff\1\172\1\uffff\1\uffff\1\57\3\uffff\1\160\2\uffff\1\172\1\146\1\uffff\2\123\14\uffff\1\162\1\157\1\165\2\154\1\147\1\165\1\157\2\164\1\145\2\154\1\156\1\163\1\162\1\151\1\144\1\142\1\144\1\172\1\156\1\143\1\163\2\164\1\170\2\162\1\157\1\156\1\166\1\167\1\162\1\163\1\154\1\72\1\144\1\162\6\172\1\uffff\1\172\1\145\1\162\1\146\1\156\1\144\1\160\1\147\1\142\1\160\2\172\2\uffff\6\uffff\1\157\1\uffff\1\141\1\123\1\172\1\144\1\154\1\172\1\157\1\172\1\141\1\150\1\145\2\143\1\167\1\150\1\164\1\171\1\144\1\154\1\153\1\72\1\144\1\141\1\164\1\72\1\141\1\172\1\uffff\1\172\1\72\2\157\1\72\1\145\1\155\1\72\1\162\1\164\1\160\1\172\1\156\1\137\1\151\1\157\1\uffff\1\144\1\147\7\uffff\1\164\1\141\1\157\1\164\1\145\1\172\1\151\1\154\1\165\1\172\1\154\1\172\2\uffff\1\uffff\1\uffff\1\162\2\172\1\uffff\1\145\1\157\1\uffff\1\162\1\uffff\2\164\1\172\2\153\1\156\1\172\1\157\1\156\2\172\1\157\1\172\1\uffff\1\72\1\172\1\145\1\uffff\1\50\3\uffff\1\154\1\172\1\uffff\1\144\1\172\1\uffff\1\144\1\145\1\72\1\uffff\1\172\1\101\1\142\1\167\1\145\1\72\1\151\1\164\1\153\1\154\2\172\1\uffff\1\156\1\172\1\164\1\uffff\1\145\1\uffff\1\164\2\uffff\2\162\1\72\1\151\1\172\1\uffff\3\172\1\uffff\1\156\1\172\2\uffff\1\167\3\uffff\1\172\1\uffff\1\165\1\uffff\1\172\1\uffff\1\72\1\162\2\uffff\2\154\1\72\1\156\1\uffff\1\143\1\172\1\171\1\154\2\uffff\1\145\1\uffff\3\172\2\72\1\uffff\1\166\4\uffff\1\172\1\uffff\1\172\1\uffff\1\164\2\uffff\1\172\1\72\1\145\1\uffff\2\172\1\uffff\3\172\5\uffff\1\145\2\uffff\1\145\2\uffff\1\172\5\uffff\2\172\3\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\2\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\27\uffff\1\70\12\uffff\1\133\2\uffff\1\137\1\140\1\1\1\uffff\1\130\1\132\2\uffff\1\4\2\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\55\uffff\1\70\16\uffff\1\131\1\133\1\134\1\135\1\136\1\137\1\uffff\1\3\33\uffff\1\64\20\uffff\1\55\2\uffff\1\61\1\63\1\62\1\65\1\66\1\67\1\71\14\uffff\1\123\1\124\1\uffff\1\131\3\uffff\1\6\2\uffff\1\43\1\uffff\1\26\15\uffff\1\46\3\uffff\1\54\1\uffff\1\41\1\42\1\45\2\uffff\1\47\2\uffff\1\50\3\uffff\1\120\14\uffff\1\103\3\uffff\1\125\1\uffff\1\111\1\uffff\1\44\1\5\5\uffff\1\27\3\uffff\1\104\2\uffff\1\37\1\35\1\uffff\1\33\1\60\1\121\1\uffff\1\40\1\uffff\1\117\1\uffff\1\126\2\uffff\1\51\1\112\4\uffff\1\57\4\uffff\1\77\1\101\1\uffff\1\107\5\uffff\1\24\1\uffff\1\100\1\30\1\105\1\34\1\uffff\1\31\1\uffff\1\36\1\uffff\1\74\1\56\3\uffff\1\53\2\uffff\1\102\3\uffff\1\122\1\110\1\2\1\23\1\25\1\uffff\1\127\1\32\1\uffff\1\113\1\52\1\uffff\1\116\1\72\1\76\1\114\1\106\2\uffff\1\115\1\73\1\75";
    static final String DFA13_specialS =
        "\1\2\61\uffff\1\1\2\uffff\1\3\122\uffff\1\0\1\5\114\uffff\1\4\u009b\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\70\2\67\2\70\1\67\22\70\1\67\1\70\1\65\2\70\1\51\1\70\1\62\1\13\1\14\1\7\1\70\1\17\1\6\1\70\1\66\12\64\1\10\1\4\1\11\1\70\1\12\2\70\1\34\1\25\1\36\1\37\1\56\1\35\1\26\1\42\1\57\2\61\1\54\1\43\1\55\1\41\1\30\1\61\1\24\1\53\1\60\1\61\1\40\1\31\1\61\1\27\1\61\1\15\1\70\1\16\1\63\1\5\1\70\1\3\1\22\1\23\1\47\1\50\1\61\1\33\1\45\1\2\2\61\1\44\3\61\1\52\1\61\1\32\2\61\1\46\5\61\1\20\1\1\1\21\uff82\70",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\14\74\1\72\15\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\13\74\1\76\6\74\1\75\7\74",
            "",
            "\1\100\6\uffff\1\101",
            "\1\102",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\2\74\1\117\10\74\1\120\2\74\1\116\13\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\16\74\1\121\13\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\122\3\74\1\123\21\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\13\74\1\124\2\74\1\126\2\74\1\125\2\74\1\127\5\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\16\74\1\131\2\74\1\130\10\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\132\25\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\1\135\7\74\1\133\5\74\1\134\13\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\7\74\1\136\1\137\21\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\141\1\74\1\140\1\74\1\142\21\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\21\74\1\143\10\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\1\74\1\145\17\74\1\144\2\74\1\146\5\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\10\74\1\150\2\74\1\147\2\74\1\151\13\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\154\6\74\1\152\2\74\1\153\13\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\10\74\1\155\5\74\1\156\13\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\157\3\74\1\160\21\74",
            "\12\74\7\uffff\5\74\1\161\24\74\4\uffff\1\74\1\uffff\32\74",
            "\10\74\1\162\1\74\7\uffff\32\74\4\uffff\1\74\1\uffff\10\74\1\163\21\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\1\164\31\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\166\11\74\1\165\13\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\10\74\1\167\21\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\17\74\1\170\12\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\15\74\1\171\14\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\14\74\1\172\15\74",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\27\74\1\174\2\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\2\74\1\176\20\74\1\175\6\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\177\25\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\16\74\1\u0080\13\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\15\74\1\u0081\14\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\14\74\1\u0083\1\u0082\14\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\1\u0084\2\74\1\u0087\12\74\1\u0085\2\74\1\u0086\10\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\47\u0089\1\u008a\64\u0089\1\u0088\uffa3\u0089",
            "\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\0\u008c",
            "\1\u008d\4\uffff\1\u008e",
            "",
            "",
            "",
            "\1\u0090",
            "",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099\7\uffff\1\u009a",
            "\1\u009b",
            "\1\u009d\15\uffff\1\u009e\5\uffff\1\u009c",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7\15\uffff\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8\2\uffff\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00c8\3\uffff\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00cf\51\uffff\1\u00ce\3\uffff\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\0\u00d6",
            "\47\u0089\1\u008a\64\u0089\1\u0088\uffa3\u0089",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00dc",
            "\1\u00dd",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00df",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9\23\uffff\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "",
            "\1\u0105",
            "\1\u0106",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0108\1\uffff\1\u0107",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0112",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "\47\u0089\1\u008a\64\u0089\1\u0088\uffa3\u0089",
            "",
            "\1\u0114",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u0117",
            "\1\u0118",
            "",
            "\1\u0119",
            "",
            "\1\u011a",
            "\1\u011b",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0121",
            "\1\u0122",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0125",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u0127",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0129",
            "",
            "\1\u012a",
            "",
            "",
            "",
            "\1\u012b",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u012d",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u013e",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0140",
            "",
            "\1\u0141",
            "",
            "\1\u0142",
            "",
            "",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u014b",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "\1\u014d",
            "",
            "",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u014f",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u0151",
            "\1\u0152",
            "",
            "",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "",
            "\1\u0157",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0159",
            "\1\u015a",
            "",
            "",
            "\1\u015b",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u015f",
            "\1\u0160",
            "",
            "\1\u0161",
            "",
            "",
            "",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\1\u0164",
            "",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0166",
            "\1\u0167",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "",
            "",
            "",
            "\1\u016d",
            "",
            "",
            "\1\u016e",
            "",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "",
            "",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | RULE_ONECHAR | RULE_STRING2 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_136 = input.LA(1);

                        s = -1;
                        if ( ((LA13_136>='\u0000' && LA13_136<='\uFFFF')) ) {s = 214;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_50 = input.LA(1);

                        s = -1;
                        if ( (LA13_50=='\\') ) {s = 136;}

                        else if ( ((LA13_50>='\u0000' && LA13_50<='&')||(LA13_50>='(' && LA13_50<='[')||(LA13_50>=']' && LA13_50<='\uFFFF')) ) {s = 137;}

                        else if ( (LA13_50=='\'') ) {s = 138;}

                        else s = 56;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='|') ) {s = 1;}

                        else if ( (LA13_0=='i') ) {s = 2;}

                        else if ( (LA13_0=='a') ) {s = 3;}

                        else if ( (LA13_0==';') ) {s = 4;}

                        else if ( (LA13_0=='_') ) {s = 5;}

                        else if ( (LA13_0=='-') ) {s = 6;}

                        else if ( (LA13_0=='*') ) {s = 7;}

                        else if ( (LA13_0==':') ) {s = 8;}

                        else if ( (LA13_0=='<') ) {s = 9;}

                        else if ( (LA13_0=='>') ) {s = 10;}

                        else if ( (LA13_0=='(') ) {s = 11;}

                        else if ( (LA13_0==')') ) {s = 12;}

                        else if ( (LA13_0=='[') ) {s = 13;}

                        else if ( (LA13_0==']') ) {s = 14;}

                        else if ( (LA13_0==',') ) {s = 15;}

                        else if ( (LA13_0=='{') ) {s = 16;}

                        else if ( (LA13_0=='}') ) {s = 17;}

                        else if ( (LA13_0=='b') ) {s = 18;}

                        else if ( (LA13_0=='c') ) {s = 19;}

                        else if ( (LA13_0=='R') ) {s = 20;}

                        else if ( (LA13_0=='B') ) {s = 21;}

                        else if ( (LA13_0=='G') ) {s = 22;}

                        else if ( (LA13_0=='Y') ) {s = 23;}

                        else if ( (LA13_0=='P') ) {s = 24;}

                        else if ( (LA13_0=='W') ) {s = 25;}

                        else if ( (LA13_0=='r') ) {s = 26;}

                        else if ( (LA13_0=='g') ) {s = 27;}

                        else if ( (LA13_0=='A') ) {s = 28;}

                        else if ( (LA13_0=='F') ) {s = 29;}

                        else if ( (LA13_0=='C') ) {s = 30;}

                        else if ( (LA13_0=='D') ) {s = 31;}

                        else if ( (LA13_0=='V') ) {s = 32;}

                        else if ( (LA13_0=='O') ) {s = 33;}

                        else if ( (LA13_0=='H') ) {s = 34;}

                        else if ( (LA13_0=='M') ) {s = 35;}

                        else if ( (LA13_0=='l') ) {s = 36;}

                        else if ( (LA13_0=='h') ) {s = 37;}

                        else if ( (LA13_0=='u') ) {s = 38;}

                        else if ( (LA13_0=='d') ) {s = 39;}

                        else if ( (LA13_0=='e') ) {s = 40;}

                        else if ( (LA13_0=='%') ) {s = 41;}

                        else if ( (LA13_0=='p') ) {s = 42;}

                        else if ( (LA13_0=='S') ) {s = 43;}

                        else if ( (LA13_0=='L') ) {s = 44;}

                        else if ( (LA13_0=='N') ) {s = 45;}

                        else if ( (LA13_0=='E') ) {s = 46;}

                        else if ( (LA13_0=='I') ) {s = 47;}

                        else if ( (LA13_0=='T') ) {s = 48;}

                        else if ( ((LA13_0>='J' && LA13_0<='K')||LA13_0=='Q'||LA13_0=='U'||LA13_0=='X'||LA13_0=='Z'||LA13_0=='f'||(LA13_0>='j' && LA13_0<='k')||(LA13_0>='m' && LA13_0<='o')||LA13_0=='q'||(LA13_0>='s' && LA13_0<='t')||(LA13_0>='v' && LA13_0<='z')) ) {s = 49;}

                        else if ( (LA13_0=='\'') ) {s = 50;}

                        else if ( (LA13_0=='^') ) {s = 51;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 52;}

                        else if ( (LA13_0=='\"') ) {s = 53;}

                        else if ( (LA13_0=='/') ) {s = 54;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 55;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='$')||LA13_0=='&'||LA13_0=='+'||LA13_0=='.'||LA13_0=='='||(LA13_0>='?' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 56;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_53 = input.LA(1);

                        s = -1;
                        if ( ((LA13_53>='\u0000' && LA13_53<='\uFFFF')) ) {s = 140;}

                        else s = 56;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_214 = input.LA(1);

                        s = -1;
                        if ( (LA13_214=='\'') ) {s = 138;}

                        else if ( (LA13_214=='\\') ) {s = 136;}

                        else if ( ((LA13_214>='\u0000' && LA13_214<='&')||(LA13_214>='(' && LA13_214<='[')||(LA13_214>=']' && LA13_214<='\uFFFF')) ) {s = 137;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_137 = input.LA(1);

                        s = -1;
                        if ( (LA13_137=='\'') ) {s = 138;}

                        else if ( (LA13_137=='\\') ) {s = 136;}

                        else if ( ((LA13_137>='\u0000' && LA13_137<='&')||(LA13_137>='(' && LA13_137<='[')||(LA13_137>=']' && LA13_137<='\uFFFF')) ) {s = 137;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}