package com.github.robocup_atan.atan.parser.player;

/*
 * #%L
 * Atan
 * %%
 * Copyright (C) 2003 - 2014 Atan
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */

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
public class PlayerHearSelfTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {

                /**
                 * Tests for hearing others are captured in the following array
                 * structure.
                 *   0: Server command.
                 *   1: Expected value of the message.
                 */
                {"(hear 1 self \"(e1wFcQfcD\")", "(e1wFcQfcD"},
                {"(hear 1 self \"R/Q.VSYf_M\")", "R/Q.VSYf_M"},
                {"(hear 1 self \"wSnWQ6\")",     "wSnWQ6"},
                {"(hear 1 self \"Xs>mL(z*gh\")", "Xs>mL(z*gh"},
                {"(hear 1 self \"<b2DNFfYaD\")", "<b2DNFfYaD"},
                {"(hear 1 self \"HgYJP1ufcD\")", "HgYJP1ufcD"},
                {"(hear 1 self \"b3l?tK\")",     "b3l?tK"},
                {"(hear 1 self \"N.KLGCYecD\")", "N.KLGCYecD"},
                {"(hear 1 self \"RexIIsjXLJ\")", "RexIIsjXLJ"},
                {"(hear 1 self \"B5lo8oJTo2\")", "B5lo8oJTo2"},
                {"(hear 1 self \"Ig97+H_5cD\")", "Ig97+H_5cD"},
                {"(hear 1 self \"YRrEGcQfcD\")", "YRrEGcQfcD"},
                {"(hear 1 self \")y(?GcQfcD\")", ")y(?GcQfcD"},
                {"(hear 1 self \"*AA0YqvubD\")", "*AA0YqvubD"},
                {"(hear 1 self \"bw)R4i\")",     "bw)R4i"},
                {"(hear 1 self \"*xrixwSiwm\")", "*xrixwSiwm"},
                {"(hear 1 self \"bAI/lW\")",     "bAI/lW"},
                {"(hear 1 self \"RKLo)Esuue\")", "RKLo)Esuue"},
                {"(hear 1 self \"1TeG>2X?sj\")", "1TeG>2X?sj"},
                {"(hear 1 self \"R04*Ux Gz9\")", "R04*Ux Gz9"},
                {"(hear 1 self \"R/<XMh28ih\")", "R/<XMh28ih"},
                {"(hear 1 self \"6L4F9a-vtl\")", "6L4F9a-vtl"},
                {"(hear 1 self \"oNSWDtV\")",    "oNSWDtV"},
                {"(hear 1 self \"r_lKm5.7go\")", "r_lKm5.7go"},
                {"(hear 1 self \"zvbOlIIs)h\")", "zvbOlIIs)h"},
                {"(hear 1 self \"btGe< \")",     "btGe< "},
                {"(hear 1 self \"bsvldr\")",     "bsvldr"},
                {"(hear 1 self \"bbt3SrPLxw\")", "bbt3SrPLxw"},
                {"(hear 1 self \"RUxnLZFDH/\")", "RUxnLZFDH/"},
                {"(hear 1 self \"ARuZYW41aD\")", "ARuZYW41aD"},
                {"(hear 1 self \"_nhE(J4ecD\")", "_nhE(J4ecD"},
                {"(hear 1 self \"QySUUfGGaD\")", "QySUUfGGaD"},
                {"(hear 1 self \")Yd_1Ev/o4\")", ")Yd_1Ev/o4"},
                {"(hear 1 self \"XvVN0D<4cD\")", "XvVN0D<4cD"},
                {"(hear 1 self \"0GrVCL3fcD\")", "0GrVCL3fcD"},
                {"(hear 1 self \"VScJkpVW9D\")", "VScJkpVW9D"},
                {"(hear 1 self \"b49Uyb\")",     "b49Uyb"},
                {"(hear 1 self \"o2SAYdj\")",    "o2SAYdj"},
                {"(hear 1 self \"oySQNBD\")",    "oySQNBD"},
                {"(hear 1 self \"R3QkFj_sfx\")", "R3QkFj_sfx"},
                {"(hear 1 self \"4/N(yz5(aD\")", "4/N(yz5(aD"},
                {"(hear 1 self \"65ZvYG-6cD\")", "65ZvYG-6cD"},
                {"(hear 1 self \"R/Psugzgj_\")", "R/Psugzgj_"},
                {"(hear 1 self \"keqN?fv3mn\")", "keqN?fv3mn"},
                {"(hear 1 self \"wOzG<0l5aD\")", "wOzG<0l5aD"},
                {"(hear 1 self \"_+euFcQfcD\")", "_+euFcQfcD"},
                {"(hear 1 self \"o9SBwQO\")",    "o9SBwQO"},
                {"(hear 1 self \"WL-SxRmaCz\")", "WL-SxRmaCz"},
                {"(hear 1 self \"(vdn/Zd.aD\")", "(vdn/Zd.aD"},
                {"(hear 1 self \"riP>77_HZr\")", "riP>77_HZr"},
                {"(hear 1 self \"st.S./cecD\")", "st.S./cecD"},
                {"(hear 1 self \"+h7?EcQfcD\")", "+h7?EcQfcD"},
                {"(hear 1 self \"BfFHC).PLQ\")", "BfFHC).PLQ"},
                {"(hear 1 self \"(6YFjWu9cD\")", "(6YFjWu9cD"},
                {"(hear 1 self \"R8f.t Lnjp\")", "R8f.t Lnjp"},
                {"(hear 1 self \"WBwdh-NebD\")", "WBwdh-NebD"},
                {"(hear 1 self \"vLl<PVyUaD\")", "vLl<PVyUaD"},
                {"(hear 1 self \"4O/W+IMmaD\")", "4O/W+IMmaD"},
                {"(hear 1 self \"FeeslOjjyg\")", "FeeslOjjyg"},
                {"(hear 1 self \"S?_fxPu4c\")",  "S?_fxPu4c"},
                {"(hear 1 self \"-LjB1r/4cD\")", "-LjB1r/4cD"},
                {"(hear 1 self \"l09W-ie(9D\")", "l09W-ie(9D"},
                {"(hear 1 self \"6p9IXHWs-6\")", "6p9IXHWs-6"},
                {"(hear 1 self \"G)eXSDUUaD\")", "G)eXSDUUaD"},
                {"(hear 1 self \"ya5Zt43bcD\")", "ya5Zt43bcD"},
                {"(hear 1 self \"-Bm(8fQ1E1\")", "-Bm(8fQ1E1"},
                {"(hear 1 self \"yth_x54.Co\")", "yth_x54.Co"},
                {"(hear 1 self \"m*H.e+K4cD\")", "m*H.e+K4cD"},
                {"(hear 1 self \"b5(5u0\")",     "b5(5u0"},
                {"(hear 1 self \"wQ<IRan<\")",   "wQ<IRan<"},
                {"(hear 1 self \"EHU7qy<2bD\")", "EHU7qy<2bD"},
                {"(hear 1 self \"(dZ(EcQfcD\")", "(dZ(EcQfcD"},
                {"(hear 1 self \"bbBGtu\")",     "bbBGtu"},
                {"(hear 1 self \"ONmY9<K(9D\")", "ONmY9<K(9D"},
                {"(hear 1 self \"WP?9sQ73cD\")", "WP?9sQ73cD"},
                {"(hear 1 self \"1p9+9aZ<-A\")", "1p9+9aZ<-A"},
                {"(hear 1 self \"Q?-QsQ+\")",    "Q?-QsQ+"},
                {"(hear 1 self \"KdEOFcQfcD\")", "KdEOFcQfcD"},
                {"(hear 1 self \"revyfLCtto\")", "revyfLCtto"},
                {"(hear 1 self \"bq7Y)XP4Bt\")", "bq7Y)XP4Bt"},
                {"(hear 1 self \"2Os?WseCaD\")", "2Os?WseCaD"},
                {"(hear 1 self \"8pDPO6Qn0q\")", "8pDPO6Qn0q"},
                {"(hear 1 self \"fR5*GcQfcD\")", "fR5*GcQfcD"},
                {"(hear 1 self \"R8abz2PmIL\")", "R8abz2PmIL"},
                {"(hear 1 self \"fVgp1kkBaD\")", "fVgp1kkBaD"},
                {"(hear 1 self \"t*W*F-hfcD\")", "t*W*F-hfcD"},
                {"(hear 1 self \"RR33YD(zPy\")", "RR33YD(zPy"},
                {"(hear 1 self \"7RQT8yfdcD\")", "7RQT8yfdcD"},
                {"(hear 1 self \"0yPfGcQfcD\")", "0yPfGcQfcD"},
                {"(hear 1 self \"w5Ry7aBbcD\")", "w5Ry7aBbcD"},
                {"(hear 1 self \"9_nU*3*ccD\")", "9_nU*3*ccD"},
                {"(hear 1 self \"hk.yEWRPZa\")", "hk.yEWRPZa"},
                {"(hear 1 self \"pe7CuQgJh>\")", "pe7CuQgJh>"},
                {"(hear 1 self \"R8cSaV6pwu\")", "R8cSaV6pwu"},
                {"(hear 1 self \"R4Qw_l<qcl\")", "R4Qw_l<qcl"},
                {"(hear 1 self \"Stb<GcQfcD\")", "Stb<GcQfcD"},
                {"(hear 1 self \"QUSD6-N\")",    "QUSD6-N"},
                {"(hear 1 self \"4KTbNpFV9D\")", "4KTbNpFV9D"},
                {"(hear 1 self \"NWpBbN4ccD\")", "NWpBbN4ccD"},
                {"(hear 1 self \"vivKPY0p5B\")", "vivKPY0p5B"},
                {"(hear 1 self \"xI<xGcQfcD\")", "xI<xGcQfcD"},
                {"(hear 1 self \"rtEOl.U6cD\")", "rtEOl.U6cD"},
                {"(hear 1 self \"KO6+MAVVr\")",  "KO6+MAVVr"},
                {"(hear 1 self \"oLSNb+n\")",    "oLSNb+n"},
                {"(hear 1 self \"Fvx+gKbytC\")", "Fvx+gKbytC"},
                {"(hear 1 self \"fG80pD)EkA\")", "fG80pD)EkA"},
                {"(hear 1 self \"m>dGGcQfcD\")", "m>dGGcQfcD"},
                {"(hear 1 self \"RI<r_zD>Mu\")", "RI<r_zD>Mu"},
                {"(hear 1 self \"5KLW*AvOxB\")", "5KLW*AvOxB"},
                {"(hear 1 self \"R?jJPgYjtg\")", "R?jJPgYjtg"},
                {"(hear 1 self \"w3EhGcQfcD\")", "w3EhGcQfcD"},
                {"(hear 1 self \"07m5ndw9in\")", "07m5ndw9in"},
                {"(hear 1 self \"wn16OSs4bD\")", "wn16OSs4bD"},
                {"(hear 1 self \"R?-R44-U(c\")", "R?-R44-U(c"},
                {"(hear 1 self \"7arcIhFfcD\")", "7arcIhFfcD"},
                {"(hear 1 self \"29BzH(Vc1C\")", "29BzH(Vc1C"},
                {"(hear 1 self \"RLyylnOCnH\")", "RLyylnOCnH"},
                {"(hear 1 self \"tD7o_EiqaD\")", "tD7o_EiqaD"},
                {"(hear 1 self \"mf+ghlYIAw\")", "mf+ghlYIAw"},
                {"(hear 1 self \"KU_m0px*Bq\")", "KU_m0px*Bq"},
                {"(hear 1 self \"9(CDGcQfcD\")", "9(CDGcQfcD"},
                {"(hear 1 self \"wCCIwQ27cD\")", "wCCIwQ27cD"},
                {"(hear 1 self \"1bR1dwj(Hd\")", "1bR1dwj(Hd"},
                {"(hear 1 self \"b6FK)wPLbg\")", "b6FK)wPLbg"},
                {"(hear 1 self \"U-f4FcQfcD\")", "U-f4FcQfcD"},
                {"(hear 1 self \"DXv/FcQfcD\")", "DXv/FcQfcD"},
                {"(hear 1 self \"uz>KL6G+*7\")", "uz>KL6G+*7"},
                {"(hear 1 self \"shGOGjpflB\")", "shGOGjpflB"},
                {"(hear 1 self \"8o-yQ_bIaD\")", "8o-yQ_bIaD"},
                {"(hear 1 self \"QxZ4Khr6bD\")", "QxZ4Khr6bD"},
                {"(hear 1 self \"q<J2H*xfcD\")", "q<J2H*xfcD"},
                {"(hear 1 self \"Xy5Y7b(paD\")", "Xy5Y7b(paD"},
                {"(hear 1 self \"NOhj-S<1bD\")", "NOhj-S<1bD"},
                {"(hear 1 self \"0cL>Xg_y+w\")", "0cL>Xg_y+w"},
                {"(hear 1 self \"ovSSc)(\")",    "ovSSc)("},
                {"(hear 1 self \"djQ?4V4.q\")",  "djQ?4V4.q"},
                {"(hear 1 self \"?<YlwXidbD\")", "?<YlwXidbD"},
                {"(hear 1 self \"QH5RswmhTd\")", "QH5RswmhTd"},
                {"(hear 1 self \"Ek+0FcQfcD\")", "Ek+0FcQfcD"},
                {"(hear 1 self \"M1bxFcQfcD\")", "M1bxFcQfcD"},
                {"(hear 1 self \"M2/wJUSOBg\")", "M2/wJUSOBg"},
                {"(hear 1 self \"buN1fuPV_8\")", "buN1fuPV_8"},
                {"(hear 1 self \"JYumFcQfcD\")", "JYumFcQfcD"},
                {"(hear 1 self \"b6AsJP\")",     "b6AsJP"},
                {"(hear 1 self \"bC3YE8\")",     "bC3YE8"},
                {"(hear 1 self \"Yz<815FibD\")", "Yz<815FibD"},
                {"(hear 1 self \"Pi8TkVgtbD\")", "Pi8TkVgtbD"},
                {"(hear 1 self \"wg*dlpsZPC\")", "wg*dlpsZPC"},
                {"(hear 1 self \"8lvI8Sm2bD\")", "8lvI8Sm2bD"},
                {"(hear 1 self \"_C<UNAt7cD\")", "_C<UNAt7cD"},
                {"(hear 1 self \"wSQWGe\")",     "wSQWGe"},
                {"(hear 1 self \"VCc2vC?ecD\")", "VCc2vC?ecD"},
                {"(hear 1 self \"4rFMOLevbD\")", "4rFMOLevbD"},
                {"(hear 1 self \"/YJ52F?<9D\")", "/YJ52F?<9D"},
                {"(hear 1 self \"hDGZok\")",     "hDGZok"},
                {"(hear 1 self \"KDWSFcQfcD\")", "KDWSFcQfcD"},
                {"(hear 1 self \"hS/LFHnbYA\")", "hS/LFHnbYA"},
                {"(hear 1 self \"Q-qEU5lJaD\")", "Q-qEU5lJaD"},
                {"(hear 1 self \"jo)-GcQfcD\")", "jo)-GcQfcD"},
                {"(hear 1 self \"ko?k5zNFaD\")", "ko?k5zNFaD"},
                {"(hear 1 self \"V.3F2n/X92\")", "V.3F2n/X92"},
                {"(hear 1 self \"BcOySAQLbm\")", "BcOySAQLbm"},
                {"(hear 1 self \"RkQIkL*U4v\")", "RkQIkL*U4v"},
                {"(hear 1 self \"jAIks.cBxb\")", "jAIks.cBxb"},
                {"(hear 1 self \"b8b(<l\")",     "b8b(<l"},
                {"(hear 1 self \"5zE/GcQfcD\")", "5zE/GcQfcD"},
                {"(hear 1 self \"SBgPr\")",      "SBgPr"},
                {"(hear 1 self \"bRbIxpoD\")",   "bRbIxpoD"},
                {"(hear 1 self \"BjSf/OUbxG\")", "BjSf/OUbxG"},
                {"(hear 1 self \"bT32eAoK\")",   "bT32eAoK"},
                {"(hear 1 self \"/)ypH27N/9\")", "/)ypH27N/9"},
                {"(hear 1 self \"TMQK4nOfcD\")", "TMQK4nOfcD"},
                {"(hear 1 self \">J8ECu>6cD\")", ">J8ECu>6cD"},
                {"(hear 1 self \"1vvJGcQfcD\")", "1vvJGcQfcD"},
                {"(hear 1 self \"8h__8aPfcD\")", "8h__8aPfcD"},
                {"(hear 1 self \"sUB)-IFecD\")", "sUB)-IFecD"},
                {"(hear 1 self \"B76y<lumDu\")", "B76y<lumDu"},
                {"(hear 1 self \"wSWXUx\")",     "wSWXUx"},
                {"(hear 1 self \"Oo4if-MXSe\")", "Oo4if-MXSe"},
                {"(hear 1 self \"H8vWSt9U9D\")", "H8vWSt9U9D"},
                {"(hear 1 self \"bcT-f8\")",     "bcT-f8"},
                {"(hear 1 self \".<7iX<y3cD\")", ".<7iX<y3cD"},
                {"(hear 1 self \"gtxGk+fz.9\")", "gtxGk+fz.9"},
                {"(hear 1 self \"RJtEJ_<dj0\")", "RJtEJ_<dj0"},
                {"(hear 1 self \"g78n)mG2aD\")", "g78n)mG2aD"},
                {"(hear 1 self \"dUY?QL<Rcw\")", "dUY?QL<Rcw"},
                {"(hear 1 self \"R4tmvWK-e+\")", "R4tmvWK-e+"},
                {"(hear 1 self \"4jLBgGDibD\")", "4jLBgGDibD"},
                {"(hear 1 self \"SD)(5PTAS\")",  "SD)(5PTAS"},
                {"(hear 1 self \"ovSU5HT\")",    "ovSU5HT"},
                {"(hear 1 self \"7z8h(0N5aD\")", "7z8h(0N5aD"},
                {"(hear 1 self \"R3Hrt8F0IU\")", "R3Hrt8F0IU"},
                {"(hear 1 self \"Rki>?QMDm-\")", "Rki>?QMDm-"},
                {"(hear 1 self \"bk-0/S\")",     "bk-0/S"},
                {"(hear 1 self \".tjIQcigbD\")", ".tjIQcigbD"},
                {"(hear 1 self \"baF(o+\")",     "baF(o+"},
                {"(hear 1 self \"S1hxYawwaD\")", "S1hxYawwaD"},
                {"(hear 1 self \">*M2KaiU-w\")", ">*M2KaiU-w"},
                {"(hear 1 self \"oMQ M+uGa\")",  "oMQ M+uGa"},
                {"(hear 1 self \"V4lNok53aD\")", "V4lNok53aD"},

            });
    }

    // Global test variables.
    private CmdParserPlayer parser;
    private TestFilter      commandFilter;
    private Filter          filter;

    // Test parameters.
    private String command;
    private String expectedMessage;

    public PlayerHearSelfTest(
        String command,
        String message) {

        this.command = command;
        this.expectedMessage = message;
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
        public void infoHearSelf(String message) {
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

