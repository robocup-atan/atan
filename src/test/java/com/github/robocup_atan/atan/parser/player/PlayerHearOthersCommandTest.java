package com.github.robocup_atan.atan.parser.player;

import com.github.robocup_atan.atan.parser.BaseCommandFilter;
import com.github.robocup_atan.atan.parser.Filter;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

/**
 * Test class for parsing the player hear command.
 *
 * @author Atan
 */
@RunWith(Parameterized.class)
public class PlayerHearOthersCommandTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {

                /**
                 * Tests for hearing others are captured in the following array
                 * structure.
                 *   0: Server command.
                 *   1: Expected value of direction.
                 *   2: Expected value of the message.
                 */
                {"(hear 1 123.45 \"(e1wFcQfcD\")", 123.45, "(e1wFcQfcD"},
                {"(hear 1 123.45 \"R/Q.VSYf_M\")", 123.45, "R/Q.VSYf_M"},
                {"(hear 1 123.45 \"wSnWQ6\")",     123.45, "wSnWQ6"},
                {"(hear 1 123.45 \"Xs>mL(z*gh\")", 123.45, "Xs>mL(z*gh"},
                {"(hear 1 123.45 \"<b2DNFfYaD\")", 123.45, "<b2DNFfYaD"},
                {"(hear 1 123.45 \"HgYJP1ufcD\")", 123.45, "HgYJP1ufcD"},
                {"(hear 1 123.45 \"b3l?tK\")",     123.45, "b3l?tK"},
                {"(hear 1 123.45 \"N.KLGCYecD\")", 123.45, "N.KLGCYecD"},
                {"(hear 1 123.45 \"RexIIsjXLJ\")", 123.45, "RexIIsjXLJ"},
                {"(hear 1 123.45 \"B5lo8oJTo2\")", 123.45, "B5lo8oJTo2"},
                {"(hear 1 123.45 \"Ig97+H_5cD\")", 123.45, "Ig97+H_5cD"},
                {"(hear 1 123.45 \"YRrEGcQfcD\")", 123.45, "YRrEGcQfcD"},
                {"(hear 1 123.45 \")y(?GcQfcD\")", 123.45, ")y(?GcQfcD"},
                {"(hear 1 123.45 \"*AA0YqvubD\")", 123.45, "*AA0YqvubD"},
                {"(hear 1 123.45 \"bw)R4i\")",     123.45, "bw)R4i"},
                {"(hear 1 123.45 \"*xrixwSiwm\")", 123.45, "*xrixwSiwm"},
                {"(hear 1 123.45 \"bAI/lW\")",     123.45, "bAI/lW"},
                {"(hear 1 123.45 \"RKLo)Esuue\")", 123.45, "RKLo)Esuue"},
                {"(hear 1 123.45 \"1TeG>2X?sj\")", 123.45, "1TeG>2X?sj"},
                {"(hear 1 123.45 \"R04*Ux Gz9\")", 123.45, "R04*Ux Gz9"},
                {"(hear 1 123.45 \"R/<XMh28ih\")", 123.45, "R/<XMh28ih"},
                {"(hear 1 123.45 \"6L4F9a-vtl\")", 123.45, "6L4F9a-vtl"},
                {"(hear 1 123.45 \"oNSWDtV\")",    123.45, "oNSWDtV"},
                {"(hear 1 123.45 \"r_lKm5.7go\")", 123.45, "r_lKm5.7go"},
                {"(hear 1 123.45 \"zvbOlIIs)h\")", 123.45, "zvbOlIIs)h"},
                {"(hear 1 123.45 \"btGe< \")",     123.45, "btGe< "},
                {"(hear 1 123.45 \"bsvldr\")",     123.45, "bsvldr"},
                {"(hear 1 123.45 \"bbt3SrPLxw\")", 123.45, "bbt3SrPLxw"},
                {"(hear 1 123.45 \"RUxnLZFDH/\")", 123.45, "RUxnLZFDH/"},
                {"(hear 1 123.45 \"ARuZYW41aD\")", 123.45, "ARuZYW41aD"},
                {"(hear 1 123.45 \"_nhE(J4ecD\")", 123.45, "_nhE(J4ecD"},
                {"(hear 1 123.45 \"QySUUfGGaD\")", 123.45, "QySUUfGGaD"},
                {"(hear 1 123.45 \")Yd_1Ev/o4\")", 123.45, ")Yd_1Ev/o4"},
                {"(hear 1 123.45 \"XvVN0D<4cD\")", 123.45, "XvVN0D<4cD"},
                {"(hear 1 123.45 \"0GrVCL3fcD\")", 123.45, "0GrVCL3fcD"},
                {"(hear 1 123.45 \"VScJkpVW9D\")", 123.45, "VScJkpVW9D"},
                {"(hear 1 123.45 \"b49Uyb\")",     123.45, "b49Uyb"},
                {"(hear 1 123.45 \"o2SAYdj\")",    123.45, "o2SAYdj"},
                {"(hear 1 123.45 \"oySQNBD\")",    123.45, "oySQNBD"},
                {"(hear 1 123.45 \"R3QkFj_sfx\")", 123.45, "R3QkFj_sfx"},
                {"(hear 1 123.45 \"4/N(yz5(aD\")", 123.45, "4/N(yz5(aD"},
                {"(hear 1 123.45 \"65ZvYG-6cD\")", 123.45, "65ZvYG-6cD"},
                {"(hear 1 123.45 \"R/Psugzgj_\")", 123.45, "R/Psugzgj_"},
                {"(hear 1 123.45 \"keqN?fv3mn\")", 123.45, "keqN?fv3mn"},
                {"(hear 1 123.45 \"wOzG<0l5aD\")", 123.45, "wOzG<0l5aD"},
                {"(hear 1 123.45 \"_+euFcQfcD\")", 123.45, "_+euFcQfcD"},
                {"(hear 1 123.45 \"o9SBwQO\")",    123.45, "o9SBwQO"},
                {"(hear 1 123.45 \"WL-SxRmaCz\")", 123.45, "WL-SxRmaCz"},
                {"(hear 1 123.45 \"(vdn/Zd.aD\")", 123.45, "(vdn/Zd.aD"},
                {"(hear 1 123.45 \"riP>77_HZr\")", 123.45, "riP>77_HZr"},
                {"(hear 1 123.45 \"st.S./cecD\")", 123.45, "st.S./cecD"},
                {"(hear 1 123.45 \"+h7?EcQfcD\")", 123.45, "+h7?EcQfcD"},
                {"(hear 1 123.45 \"BfFHC).PLQ\")", 123.45, "BfFHC).PLQ"},
                {"(hear 1 123.45 \"(6YFjWu9cD\")", 123.45, "(6YFjWu9cD"},
                {"(hear 1 123.45 \"R8f.t Lnjp\")", 123.45, "R8f.t Lnjp"},
                {"(hear 1 123.45 \"WBwdh-NebD\")", 123.45, "WBwdh-NebD"},
                {"(hear 1 123.45 \"vLl<PVyUaD\")", 123.45, "vLl<PVyUaD"},
                {"(hear 1 123.45 \"4O/W+IMmaD\")", 123.45, "4O/W+IMmaD"},
                {"(hear 1 123.45 \"FeeslOjjyg\")", 123.45, "FeeslOjjyg"},
                {"(hear 1 123.45 \"S?_fxPu4c\")",  123.45, "S?_fxPu4c"},
                {"(hear 1 123.45 \"-LjB1r/4cD\")", 123.45, "-LjB1r/4cD"},
                {"(hear 1 123.45 \"l09W-ie(9D\")", 123.45, "l09W-ie(9D"},
                {"(hear 1 123.45 \"6p9IXHWs-6\")", 123.45, "6p9IXHWs-6"},
                {"(hear 1 123.45 \"G)eXSDUUaD\")", 123.45, "G)eXSDUUaD"},
                {"(hear 1 123.45 \"ya5Zt43bcD\")", 123.45, "ya5Zt43bcD"},
                {"(hear 1 123.45 \"-Bm(8fQ1E1\")", 123.45, "-Bm(8fQ1E1"},
                {"(hear 1 123.45 \"yth_x54.Co\")", 123.45, "yth_x54.Co"},
                {"(hear 1 123.45 \"m*H.e+K4cD\")", 123.45, "m*H.e+K4cD"},
                {"(hear 1 123.45 \"b5(5u0\")",     123.45, "b5(5u0"},
                {"(hear 1 123.45 \"wQ<IRan<\")",   123.45, "wQ<IRan<"},
                {"(hear 1 123.45 \"EHU7qy<2bD\")", 123.45, "EHU7qy<2bD"},
                {"(hear 1 123.45 \"(dZ(EcQfcD\")", 123.45, "(dZ(EcQfcD"},
                {"(hear 1 123.45 \"bbBGtu\")",     123.45, "bbBGtu"},
                {"(hear 1 123.45 \"ONmY9<K(9D\")", 123.45, "ONmY9<K(9D"},
                {"(hear 1 123.45 \"WP?9sQ73cD\")", 123.45, "WP?9sQ73cD"},
                {"(hear 1 123.45 \"1p9+9aZ<-A\")", 123.45, "1p9+9aZ<-A"},
                {"(hear 1 123.45 \"Q?-QsQ+\")",    123.45, "Q?-QsQ+"},
                {"(hear 1 123.45 \"KdEOFcQfcD\")", 123.45, "KdEOFcQfcD"},
                {"(hear 1 123.45 \"revyfLCtto\")", 123.45, "revyfLCtto"},
                {"(hear 1 123.45 \"bq7Y)XP4Bt\")", 123.45, "bq7Y)XP4Bt"},
                {"(hear 1 123.45 \"2Os?WseCaD\")", 123.45, "2Os?WseCaD"},
                {"(hear 1 123.45 \"8pDPO6Qn0q\")", 123.45, "8pDPO6Qn0q"},
                {"(hear 1 123.45 \"fR5*GcQfcD\")", 123.45, "fR5*GcQfcD"},
                {"(hear 1 123.45 \"R8abz2PmIL\")", 123.45, "R8abz2PmIL"},
                {"(hear 1 123.45 \"fVgp1kkBaD\")", 123.45, "fVgp1kkBaD"},
                {"(hear 1 123.45 \"t*W*F-hfcD\")", 123.45, "t*W*F-hfcD"},
                {"(hear 1 123.45 \"RR33YD(zPy\")", 123.45, "RR33YD(zPy"},
                {"(hear 1 123.45 \"7RQT8yfdcD\")", 123.45, "7RQT8yfdcD"},
                {"(hear 1 123.45 \"0yPfGcQfcD\")", 123.45, "0yPfGcQfcD"},
                {"(hear 1 123.45 \"w5Ry7aBbcD\")", 123.45, "w5Ry7aBbcD"},
                {"(hear 1 123.45 \"9_nU*3*ccD\")", 123.45, "9_nU*3*ccD"},
                {"(hear 1 123.45 \"hk.yEWRPZa\")", 123.45, "hk.yEWRPZa"},
                {"(hear 1 123.45 \"pe7CuQgJh>\")", 123.45, "pe7CuQgJh>"},
                {"(hear 1 123.45 \"R8cSaV6pwu\")", 123.45, "R8cSaV6pwu"},
                {"(hear 1 123.45 \"R4Qw_l<qcl\")", 123.45, "R4Qw_l<qcl"},
                {"(hear 1 123.45 \"Stb<GcQfcD\")", 123.45, "Stb<GcQfcD"},
                {"(hear 1 123.45 \"QUSD6-N\")",    123.45, "QUSD6-N"},
                {"(hear 1 123.45 \"4KTbNpFV9D\")", 123.45, "4KTbNpFV9D"},
                {"(hear 1 123.45 \"NWpBbN4ccD\")", 123.45, "NWpBbN4ccD"},
                {"(hear 1 123.45 \"vivKPY0p5B\")", 123.45, "vivKPY0p5B"},
                {"(hear 1 123.45 \"xI<xGcQfcD\")", 123.45, "xI<xGcQfcD"},
                {"(hear 1 123.45 \"rtEOl.U6cD\")", 123.45, "rtEOl.U6cD"},
                {"(hear 1 123.45 \"KO6+MAVVr\")",  123.45, "KO6+MAVVr"},
                {"(hear 1 123.45 \"oLSNb+n\")",    123.45, "oLSNb+n"},
                {"(hear 1 123.45 \"Fvx+gKbytC\")", 123.45, "Fvx+gKbytC"},
                {"(hear 1 123.45 \"fG80pD)EkA\")", 123.45, "fG80pD)EkA"},
                {"(hear 1 123.45 \"m>dGGcQfcD\")", 123.45, "m>dGGcQfcD"},
                {"(hear 1 123.45 \"RI<r_zD>Mu\")", 123.45, "RI<r_zD>Mu"},
                {"(hear 1 123.45 \"5KLW*AvOxB\")", 123.45, "5KLW*AvOxB"},
                {"(hear 1 123.45 \"R?jJPgYjtg\")", 123.45, "R?jJPgYjtg"},
                {"(hear 1 123.45 \"w3EhGcQfcD\")", 123.45, "w3EhGcQfcD"},
                {"(hear 1 123.45 \"07m5ndw9in\")", 123.45, "07m5ndw9in"},
                {"(hear 1 123.45 \"wn16OSs4bD\")", 123.45, "wn16OSs4bD"},
                {"(hear 1 123.45 \"R?-R44-U(c\")", 123.45, "R?-R44-U(c"},
                {"(hear 1 123.45 \"7arcIhFfcD\")", 123.45, "7arcIhFfcD"},
                {"(hear 1 123.45 \"29BzH(Vc1C\")", 123.45, "29BzH(Vc1C"},
                {"(hear 1 123.45 \"RLyylnOCnH\")", 123.45, "RLyylnOCnH"},
                {"(hear 1 123.45 \"tD7o_EiqaD\")", 123.45, "tD7o_EiqaD"},
                {"(hear 1 123.45 \"mf+ghlYIAw\")", 123.45, "mf+ghlYIAw"},
                {"(hear 1 123.45 \"KU_m0px*Bq\")", 123.45, "KU_m0px*Bq"},
                {"(hear 1 123.45 \"9(CDGcQfcD\")", 123.45, "9(CDGcQfcD"},
                {"(hear 1 123.45 \"wCCIwQ27cD\")", 123.45, "wCCIwQ27cD"},
                {"(hear 1 123.45 \"1bR1dwj(Hd\")", 123.45, "1bR1dwj(Hd"},
                {"(hear 1 123.45 \"b6FK)wPLbg\")", 123.45, "b6FK)wPLbg"},
                {"(hear 1 123.45 \"U-f4FcQfcD\")", 123.45, "U-f4FcQfcD"},
                {"(hear 1 123.45 \"DXv/FcQfcD\")", 123.45, "DXv/FcQfcD"},
                {"(hear 1 123.45 \"uz>KL6G+*7\")", 123.45, "uz>KL6G+*7"},
                {"(hear 1 123.45 \"shGOGjpflB\")", 123.45, "shGOGjpflB"},
                {"(hear 1 123.45 \"8o-yQ_bIaD\")", 123.45, "8o-yQ_bIaD"},
                {"(hear 1 123.45 \"QxZ4Khr6bD\")", 123.45, "QxZ4Khr6bD"},
                {"(hear 1 123.45 \"q<J2H*xfcD\")", 123.45, "q<J2H*xfcD"},
                {"(hear 1 123.45 \"Xy5Y7b(paD\")", 123.45, "Xy5Y7b(paD"},
                {"(hear 1 123.45 \"NOhj-S<1bD\")", 123.45, "NOhj-S<1bD"},
                {"(hear 1 123.45 \"0cL>Xg_y+w\")", 123.45, "0cL>Xg_y+w"},
                {"(hear 1 123.45 \"ovSSc)(\")",    123.45, "ovSSc)("},
                {"(hear 1 123.45 \"djQ?4V4.q\")",  123.45, "djQ?4V4.q"},
                {"(hear 1 123.45 \"?<YlwXidbD\")", 123.45, "?<YlwXidbD"},
                {"(hear 1 123.45 \"QH5RswmhTd\")", 123.45, "QH5RswmhTd"},
                {"(hear 1 123.45 \"Ek+0FcQfcD\")", 123.45, "Ek+0FcQfcD"},
                {"(hear 1 123.45 \"M1bxFcQfcD\")", 123.45, "M1bxFcQfcD"},
                {"(hear 1 123.45 \"M2/wJUSOBg\")", 123.45, "M2/wJUSOBg"},
                {"(hear 1 123.45 \"buN1fuPV_8\")", 123.45, "buN1fuPV_8"},
                {"(hear 1 123.45 \"JYumFcQfcD\")", 123.45, "JYumFcQfcD"},
                {"(hear 1 123.45 \"b6AsJP\")",     123.45, "b6AsJP"},
                {"(hear 1 123.45 \"bC3YE8\")",     123.45, "bC3YE8"},
                {"(hear 1 123.45 \"Yz<815FibD\")", 123.45, "Yz<815FibD"},
                {"(hear 1 123.45 \"Pi8TkVgtbD\")", 123.45, "Pi8TkVgtbD"},
                {"(hear 1 123.45 \"wg*dlpsZPC\")", 123.45, "wg*dlpsZPC"},
                {"(hear 1 123.45 \"8lvI8Sm2bD\")", 123.45, "8lvI8Sm2bD"},
                {"(hear 1 123.45 \"_C<UNAt7cD\")", 123.45, "_C<UNAt7cD"},
                {"(hear 1 123.45 \"wSQWGe\")",     123.45, "wSQWGe"},
                {"(hear 1 123.45 \"VCc2vC?ecD\")", 123.45, "VCc2vC?ecD"},
                {"(hear 1 123.45 \"4rFMOLevbD\")", 123.45, "4rFMOLevbD"},
                {"(hear 1 123.45 \"/YJ52F?<9D\")", 123.45, "/YJ52F?<9D"},
                {"(hear 1 123.45 \"hDGZok\")",     123.45, "hDGZok"},
                {"(hear 1 123.45 \"KDWSFcQfcD\")", 123.45, "KDWSFcQfcD"},
                {"(hear 1 123.45 \"hS/LFHnbYA\")", 123.45, "hS/LFHnbYA"},
                {"(hear 1 123.45 \"Q-qEU5lJaD\")", 123.45, "Q-qEU5lJaD"},
                {"(hear 1 123.45 \"jo)-GcQfcD\")", 123.45, "jo)-GcQfcD"},
                {"(hear 1 123.45 \"ko?k5zNFaD\")", 123.45, "ko?k5zNFaD"},
                {"(hear 1 123.45 \"V.3F2n/X92\")", 123.45, "V.3F2n/X92"},
                {"(hear 1 123.45 \"BcOySAQLbm\")", 123.45, "BcOySAQLbm"},
                {"(hear 1 123.45 \"RkQIkL*U4v\")", 123.45, "RkQIkL*U4v"},
                {"(hear 1 123.45 \"jAIks.cBxb\")", 123.45, "jAIks.cBxb"},
                {"(hear 1 123.45 \"b8b(<l\")",     123.45, "b8b(<l"},
                {"(hear 1 123.45 \"5zE/GcQfcD\")", 123.45, "5zE/GcQfcD"},
                {"(hear 1 123.45 \"SBgPr\")",      123.45, "SBgPr"},
                {"(hear 1 123.45 \"bRbIxpoD\")",   123.45, "bRbIxpoD"},
                {"(hear 1 123.45 \"BjSf/OUbxG\")", 123.45, "BjSf/OUbxG"},
                {"(hear 1 123.45 \"bT32eAoK\")",   123.45, "bT32eAoK"},
                {"(hear 1 123.45 \"/)ypH27N/9\")", 123.45, "/)ypH27N/9"},
                {"(hear 1 123.45 \"TMQK4nOfcD\")", 123.45, "TMQK4nOfcD"},
                {"(hear 1 123.45 \">J8ECu>6cD\")", 123.45, ">J8ECu>6cD"},
                {"(hear 1 123.45 \"1vvJGcQfcD\")", 123.45, "1vvJGcQfcD"},
                {"(hear 1 123.45 \"8h__8aPfcD\")", 123.45, "8h__8aPfcD"},
                {"(hear 1 123.45 \"sUB)-IFecD\")", 123.45, "sUB)-IFecD"},
                {"(hear 1 123.45 \"B76y<lumDu\")", 123.45, "B76y<lumDu"},
                {"(hear 1 123.45 \"wSWXUx\")",     123.45, "wSWXUx"},
                {"(hear 1 123.45 \"Oo4if-MXSe\")", 123.45, "Oo4if-MXSe"},
                {"(hear 1 123.45 \"H8vWSt9U9D\")", 123.45, "H8vWSt9U9D"},
                {"(hear 1 123.45 \"bcT-f8\")",     123.45, "bcT-f8"},
                {"(hear 1 123.45 \".<7iX<y3cD\")", 123.45, ".<7iX<y3cD"},
                {"(hear 1 123.45 \"gtxGk+fz.9\")", 123.45, "gtxGk+fz.9"},
                {"(hear 1 123.45 \"RJtEJ_<dj0\")", 123.45, "RJtEJ_<dj0"},
                {"(hear 1 123.45 \"g78n)mG2aD\")", 123.45, "g78n)mG2aD"},
                {"(hear 1 123.45 \"dUY?QL<Rcw\")", 123.45, "dUY?QL<Rcw"},
                {"(hear 1 123.45 \"R4tmvWK-e+\")", 123.45, "R4tmvWK-e+"},
                {"(hear 1 123.45 \"4jLBgGDibD\")", 123.45, "4jLBgGDibD"},
                {"(hear 1 123.45 \"SD)(5PTAS\")",  123.45, "SD)(5PTAS"},
                {"(hear 1 123.45 \"ovSU5HT\")",    123.45, "ovSU5HT"},
                {"(hear 1 123.45 \"7z8h(0N5aD\")", 123.45, "7z8h(0N5aD"},
                {"(hear 1 123.45 \"R3Hrt8F0IU\")", 123.45, "R3Hrt8F0IU"},
                {"(hear 1 123.45 \"Rki>?QMDm-\")", 123.45, "Rki>?QMDm-"},
                {"(hear 1 123.45 \"bk-0/S\")",     123.45, "bk-0/S"},
                {"(hear 1 123.45 \".tjIQcigbD\")", 123.45, ".tjIQcigbD"},
                {"(hear 1 123.45 \"baF(o+\")",     123.45, "baF(o+"},
                {"(hear 1 123.45 \"S1hxYawwaD\")", 123.45, "S1hxYawwaD"},
                {"(hear 1 123.45 \">*M2KaiU-w\")", 123.45, ">*M2KaiU-w"},
                {"(hear 1 123.45 \"oMQ M+uGa\")",  123.45, "oMQ M+uGa"},
                {"(hear 1 123.45 \"V4lNok53aD\")", 123.45, "V4lNok53aD"},

            });
    }

    // Global test variables.
    private CmdParserPlayer parser;
    private TestFilter      commandFilter;
    private Filter          filter;

    // Test parameters.
    private String command;
    private double expectedDirection;
    private String expectedMessage;

    public PlayerHearOthersCommandTest(
        String command,
        double direction,
        String message) {

        this.command           = command;
        this.expectedDirection = direction;
        this.expectedMessage   = message;
    }

    @Before
    public void setUpTest() throws Exception {
        parser        = new CmdParserPlayer(new StringReader(""));
        commandFilter = new TestFilter();
        filter        = new Filter();
    }

    @Test
    public void parseCommand() {
        filter.run(command, commandFilter);
    }

    private class TestFilter extends BaseCommandFilter {

        private TestController    controller = new TestController();
        private BaseActionsPlayer action     = new BaseActionsPlayer();

        @Override
        public void hearCommand(String cmd) {
            try {
                parser.parseHearCommand(cmd, controller, action);
            } catch (ParseException ex) {
                Assert.fail(ex.getMessage());
            }
        }
    }

    private class TestController extends BaseControllerPlayer {

        @Override
        public void infoHearPlayer(double direction, String message) {
            Assert.assertEquals(expectedDirection, direction, 0);
            Assert.assertEquals(expectedMessage, message);
        }
    }
    
    // Test logging
    @Rule
    public TestWatcher watchman = new TestWatcher() {

        @Override
        protected void succeeded(Description description) {
            System.out.print("Passed - ");
        }
        
        @Override
        protected void failed(Throwable e, Description description) {
            System.out.print("FAILED - ");
        }
        
        @Override
        protected void finished(Description description) {
            System.out.println(command);
        }
    };
}

