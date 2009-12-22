package atan.test;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.PlayMode;
import atan.model.RefereeMessage;

import atan.parser.CmdParser;
import atan.parser.CommandFilter;
import atan.parser.Filter;
import atan.parser.ParseException;

import junit.framework.TestCase;
import junit.framework.TestSuite;

//~--- JDK imports ------------------------------------------------------------

import java.io.StringReader;

import java.util.Iterator;
import java.util.Set;

/**
 * Testcases for the parser.
 */
public class ParserTest extends TestCase {
    private static CmdParser cmdp = null;

    /**
     * Constructs ...
     * @param name
     */
    public ParserTest(String name) {
        super(name);
    }

    /**
     * Method description
     * @throws ParseException
     */
    public void testCmdParserError00() throws ParseException {
        DummyPlayer c = new DummyPlayer();
        this.getCmdParser().parseErrorCommand("baby_go_home", c);
        assertEquals("|error|baby_go_home", c.getBuffer());
    }

    /**
     * Method description
     * @throws ParseException
     */
    public void testCmdParserInit00() throws ParseException {
        DummyPlayer    cl = new DummyPlayer();
        TestController co = new TestController();
        this.getCmdParser().parseInitCommand("l 1 before_kick_off", co, cl);
        assertTrue("player should be left", !cl.isTeamEast());
        assertEquals(1, cl.getNumber());
        assertEquals(1, co.getResult().size());
        co.getResult().contains("|infoHearPlayMode|" + PlayMode.BEFORE_KICK_OFF);
    }

    /**
     * Method description
     * @throws ParseException
     */
    public void testCmdParserInit01() throws ParseException {
        DummyPlayer    cl = new DummyPlayer();
        TestController co = new TestController();
        this.getCmdParser().parseInitCommand("r 2 before_kick_off", co, cl);
        assertEquals(2, cl.getNumber());
        assertTrue("player should be right", cl.isTeamEast());
        assertEquals(1, co.getResult().size());
        co.getResult().contains("|infoHearPlayMode|" + PlayMode.BEFORE_KICK_OFF);
    }

    /**
     * Method description
     * @throws Exception
     */
    public void testFilterCommand00() throws Exception {
        TestCommandFilter f = new TestCommandFilter();
        filterCommand("(see (a))", f);
        assertTrue("no see command", f.isTypeSee());
        assertEquals("(a)", f.getCommand());
    }

    /**
     * Method description
     * @throws Exception
     */
    public void testFilterCommand01() throws Exception {
        TestCommandFilter f = new TestCommandFilter();
        filterCommand("(see (a)(a))", f);
        assertTrue("no see command", f.isTypeSee());
        assertEquals("(a)(a)", f.getCommand());
    }

    /**
     * Method description
     * @throws Exception
     */
    public void testFilterCommand02() throws Exception {
        TestCommandFilter f = new TestCommandFilter();
        filterCommand("(see ()(h h h h) )", f);
        assertTrue("no see command", f.isTypeSee());
        assertEquals("()(h h h h) ", f.getCommand());
    }

    /**
     * Method description
     * @throws Exception
     */
    public void testFilterCommand08() throws Exception {
        TestCommandFilter f = new TestCommandFilter();
        filterCommand("(hear 23 referee -23 I_love_you)", f);
        assertTrue("no hear command", f.isTypeHear());
        assertEquals("23 referee -23 I_love_you", f.getCommand());
    }

    /**
     * Method description
     * @throws Exception
     */
    public void testFilterCommand10() throws Exception {
        TestCommandFilter f = new TestCommandFilter();
        filterCommand("(init l 23 go_home)", f);
        assertTrue("no init command", f.isTypeInit());
        assertEquals("l 23 go_home", f.getCommand());
    }

    /**
     * Method description
     * @throws Exception
     */
    public void testFilterCommand11() throws Exception {
        TestCommandFilter f = new TestCommandFilter();
        filterCommand("(error klumpi bumpi)", f);
        assertTrue("no error command", f.isTypeError());
        assertEquals("klumpi bumpi", f.getCommand());
    }

    /**
     * Method description
     * @throws Exception
     */
    public void testFilterCommand12() throws Exception {
        TestCommandFilter f = new TestCommandFilter();
        filterCommand("(sense_body 23 89 89 98 )", f);
        assertTrue("no sense_body command", f.isTypeSenseBody());
        assertEquals("23 89 89 98 ", f.getCommand());
    }

    /**
     * Method description
     * @throws Exception
     */
    public void testCmdPerformance() throws Exception {
        String s =
            "(see 0 ((goal r) 18.4 0) ((flag p r c) 1.8 0 -0 0) ((Player) 1.2 179) ((Player) 0.6 179) ((Player) 0.6 179) ((Player) 2.5 179) ((Player) 1.8 179) ((Player) 1.2 179) ((Player) 0.6 179) ((line r) 18.4 -89))";
        int  count = 0;
        long t1    = System.currentTimeMillis();
        while (count < 100) {
            count++;
            TestCommandFilter f = new TestCommandFilter();
            try {
                basicParseCmd(s);
            } catch (ParseException ex) {
                System.out.println("<<" + s + ">>");
                System.out.println(ex.getMessage());
                System.out.println("-------------------------------------");
            }
        }
        long t2 = System.currentTimeMillis();
        System.out.print("\n" + count + " messages parsed in " + (t2 - t1) + "ms. ");
        double t = (double) (t2 - t1) / count;
        t = (double) Math.round(t * 100) / 100;
        System.out.println("Parsing of one message took: " + t + "ms");
        assertTrue("parsing took more than 10 ms", t < 10.0);
    }

    /**
     * Method description
     * @param cmd
     * @param f
     * @throws ParseException
     */
    private void filterCommand(String cmd, CommandFilter f) throws ParseException {
        getFilter().run(cmd, f);
    }

    /**
     * Method description
     */
    public void testCmdParserBall00() {
        String cmd    = "(see 1 ((ball) 12 12))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeBall|12.0|12.0");
    }

    /**
     * Method description
     */
    public void testCmdParserBall01() {
        String cmd    = "(see 1 ((ball) 12.5 13))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeBall|12.5|13.0");
    }

    /**
     * Method description
     */
    public void testCmdParserBall02() {
        String cmd    = "(see 1 ((ball) 12.5 13 ))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeBall|12.5|13.0");
    }

    /**
     * Method description
     */
    public void testCmdParserBall03() {
        String cmd    = "(see 1 ((ball) 13 ))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeBall|100.0|13.0");
    }

    /**
     * Method description
     */
    public void testCmdParserBall04() {
        String cmd    = "(see 1 ((ball) 111 13 5 6))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeBall|111.0|13.0");
    }

    /**
     * Method description
     */
    public void testCmdParserBall05() {
        String cmd    = "(see 1 ((ball) 111 13 5 6 7 8))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeBall|111.0|13.0");
    }

    /**
     * Method description
     */
    public void testCmdParserPlayer00() {
        String cmd    = "(see 100 ((player teamEast 1)13.4 -2))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeePlayerOwn|1|13.4|-2.0");
    }

    /**
     * Method description
     */
    public void testCmdParserPlayer01() {
        String cmd    = "(see 1220 ((player teamWest 1)13.4 11))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeePlayerOther|1|13.4|11.0");
    }

    /**
     * Method description
     */
    public void testCmdParserPlayer02() {
        String cmd    = "(see 1220 ((player teamWest 2)13.4 11))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeePlayerOther|2|13.4|11.0");
    }

    /**
     * Method description
     */
    public void testCmdParserPlayer03() {
        String cmd    = "(see 1220 ((player teamWest 5)-13.4 11))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeePlayerOther|5|-13.4|11.0");
    }

    /**
     * Method description
     */
    public void testCmdParserPlayer04() {
        String cmd    = "(see 1220 ((player l 5)-13.4 11))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeePlayerOther|5|-13.4|11.0");
    }

    /**
     * Method description
     */
    public void testCmdParserPlayer05() {
        String cmd    = "(see 100 ((player r 1)13.4 -2))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeePlayerOwn|1|13.4|-2.0");
    }

    /**
     * Method description
     */
    public void testCmdParserGoal00() {
        String cmd    = "(see 1 ((goal l)-1.4 11))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagGoalOther|Flag[center]|-1.4|11.0");
    }

    /**
     * Method description
     */
    public void testCmdParserGoal01() {
        String cmd    = "(see 1 ((goal l)11))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagGoalOther|Flag[center]|100.0|11.0");
    }

    /**
     * Method description
     */
    public void testCmdParserGoal02() {
        String cmd    = "(see 1 ((goal r)110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagGoalOwn|Flag[center]|100.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserGoal03() {
        String cmd    = "(see 1 ((Goal r)110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagGoalOwn|Flag[center]|100.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserGoal04() {
        String cmd    = "(see 1 ((Goal)110))";
        Set    result = parseCmd(cmd);
        assertEquals(0, result.size());
    }

    /**
     * Method description
     */
    public void testCmdParserSee() {
        String cmd    = "(see 234)";
        Set    result = parseCmd(cmd);
        assertEquals(0, result.size());
    }

    /**
     * Method description
     */
    public void testCmdParserSee00() {
        String cmd    = "(see 0 ((flag r t)55.7 3) ((flag g r b) 70.8 38))";
        Set    result = parseCmd(cmd);
        assertEquals(2, result.size());
    }

    /**
     * Method description
     */
    public void testCmdParserFlag00() {
        String cmd    = "(see 1 ((flag c)22 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagCenter|Flag[center]|22.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag01() {
        String cmd    = "(see 1 ((flag c t)22 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagCenter|Flag[right]|22.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag02() {
        String cmd    = "(see 1 ((flag c b)22.1 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagCenter|Flag[left]|22.1|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag03() {
        String cmd    = "(see 1 ((flag p l t)22 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagPenaltyOther|Flag[right]|22.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag04() {
        String cmd    = "(see 1 ((flag p l)22 110))";
        Set    result = parseCmd(cmd);
        assertResult(cmd, result, "|infoSeeFlagPenaltyOther|Flag[center]|22.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag05() {
        String cmd    = "(see 1 ((flag p l b)22 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagPenaltyOther|Flag[left]|22.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag03a() {
        String cmd    = "(see 1 ((flag p r t)22 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagPenaltyOwn|Flag[right]|22.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag04a() {
        String cmd    = "(see 1 ((flag p r)22 110))";
        Set    result = parseCmd(cmd);
        assertResult(cmd, result, "|infoSeeFlagPenaltyOwn|Flag[center]|22.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag05a() {
        String cmd    = "(see 1 ((flag p r b)22 110))";
        Set    result = parseCmd(cmd);
        assertResult(cmd, result, "|infoSeeFlagPenaltyOwn|Flag[left]|22.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag06() {
        String cmd    = "(see 1 ((flag l t 30)22 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagOther|Flag[right30]|22.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag07() {
        String cmd    = "(see 1 ((flag l t 20)22 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagOther|Flag[right20]|22.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag08() {
        String cmd    = "(see 1 ((flag l t 10)22 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagOther|Flag[right10]|22.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag09() {
        String cmd    = "(see 1 ((flag l 0)22 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagOther|Flag[center]|22.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag10() {
        String cmd    = "(see 1 ((flag l b 10)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagOther|Flag[left10]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag11() {
        String cmd    = "(see 1 ((flag l b 20)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagOther|Flag[left20]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag12() {
        String cmd    = "(see 1 ((flag l b 30)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagOther|Flag[left30]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag06a() {
        String cmd    = "(see 1 ((flag r t 30)22 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagOwn|Flag[right30]|22.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag07a() {
        String cmd    = "(see 1 ((flag r t 20)22 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagOwn|Flag[right20]|22.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag08a() {
        String cmd    = "(see 1 ((flag r t 10)22 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagOwn|Flag[right10]|22.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag09a() {
        String cmd    = "(see 1 ((flag r 0)22 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagOwn|Flag[center]|22.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag10a() {
        String cmd    = "(see 1 ((flag r b 10)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagOwn|Flag[left10]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag11a() {
        String cmd    = "(see 1 ((flag r b 20)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagOwn|Flag[left20]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag12a() {
        String cmd    = "(see 1 ((flag r b 30)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagOwn|Flag[left30]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag13() {
        String cmd    = "(see 1 ((flag t l 50)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagRight|Flag[other50]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag14() {
        String cmd    = "(see 1 ((flag t l 40)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagRight|Flag[other40]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag15() {
        String cmd    = "(see 1 ((flag t l 30)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagRight|Flag[other30]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag16() {
        String cmd    = "(see 1 ((flag t l 20)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagRight|Flag[other20]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag17() {
        String cmd    = "(see 1 ((flag t l 10)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagRight|Flag[other10]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag18() {
        String cmd    = "(see 1 ((flag t 0)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagRight|Flag[center]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag19() {
        String cmd    = "(see 1 ((flag t r 10)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagRight|Flag[own10]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag20() {
        String cmd    = "(see 1 ((flag t r 20)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagRight|Flag[own20]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag21() {
        String cmd    = "(see 1 ((flag t r 30)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagRight|Flag[own30]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag22() {
        String cmd    = "(see 1 ((flag t r 40)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagRight|Flag[own40]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag23() {
        String cmd    = "(see 1 ((flag t r 50)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagRight|Flag[own50]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag13a() {
        String cmd    = "(see 1 ((flag b l 50)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagLeft|Flag[other50]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag14a() {
        String cmd    = "(see 1 ((flag b l 40)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagLeft|Flag[other40]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag15a() {
        String cmd    = "(see 1 ((flag b l 30)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagLeft|Flag[other30]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag16a() {
        String cmd    = "(see 1 ((flag b l 20)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagLeft|Flag[other20]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag17a() {
        String cmd    = "(see 1 ((flag b l 10)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagLeft|Flag[other10]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag18a() {
        String cmd    = "(see 1 ((flag b 0)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagLeft|Flag[center]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag19a() {
        String cmd    = "(see 1 ((flag b r 10)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagLeft|Flag[own10]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag20a() {
        String cmd    = "(see 1 ((flag b r 20)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagLeft|Flag[own20]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag21a() {
        String cmd    = "(see 1 ((flag b r 30)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagLeft|Flag[own30]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag22a() {
        String cmd    = "(see 1 ((flag b r 40)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagLeft|Flag[own40]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag23a() {
        String cmd    = "(see 1 ((flag b r 50)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagLeft|Flag[own50]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag24() {
        String cmd    = "(see 1 ((flag l b)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagCornerOther|Flag[left]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag25() {
        String cmd    = "(see 1 ((flag l t)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagCornerOther|Flag[right]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag26() {
        String cmd    = "(see 1 ((flag r t)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagCornerOwn|Flag[right]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserFlag27() {
        String cmd    = "(see 1 ((flag r b)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeFlagCornerOwn|Flag[left]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserLine00() {
        String cmd    = "(see 1 ((line l)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeLine|Line[other]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserLine01() {
        String cmd    = "(see 1 ((line r)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeLine|Line[own]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserLine02() {
        String cmd    = "(see 1 ((line t)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeLine|Line[right]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserLine03() {
        String cmd    = "(see 1 ((line b)23 110))";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoSeeLine|Line[left]|23.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserMulti00() {
        String cmd    = "(see 1 ((line b)23 110)((line b)23 111))";
        Set    result = parseCmd(cmd);
        assertTrue("there are not two objects", result.size() == 2);
        assertResult(cmd, result, "|infoSeeLine|Line[left]|23.0|110.0");
        assertResult(cmd, result, "|infoSeeLine|Line[left]|23.0|111.0");
    }

    /**
     * Method description
     */
    public void testCmdParserMulti01() {
        String cmd    = "(see 1 ((player teamEast 1)13.4 -2)((goal r)110)((flag c b)22 110))";
        Set    result = parseCmd(cmd);
        assertTrue("there are not three objects", result.size() == 3);
        assertResult(cmd, result, "|infoSeePlayerOwn|1|13.4|-2.0");
        assertResult(cmd, result, "|infoSeeFlagGoalOwn|Flag[center]|100.0|110.0");
        assertResult(cmd, result, "|infoSeeFlagCenter|Flag[left]|22.0|110.0");
    }

    /**
     * Method description
     */
    public void testCmdParserSenseBody00() {
        String cmd =
            "(sense_body 1 (view_mode high wide)(stamina 12)(speed -23.3)(head_angle 12)(kick 121)(dash 100)(turn 111)(say 99)(turn_neck 145))";
        Set result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result,
                     "|infoSenseBody|ViewQuality[high]|ViewAngle[wide]|12.0|-23.3|12.0|121|100|111|99|145");
    }

    /**
     * Method description
     */
    public void testCmdParserSenseBody01() {
        String cmd =
            "(sense_body 1 (view_mode low narrow)(stamina 12)(speed 23)(head_angle 12)(kick 121)(dash 100)(turn 111)(say 99)(turn_neck 145))";
        Set result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result,
                     "|infoSenseBody|ViewQuality[low]|ViewAngle[narrow]|12.0|23.0|12.0|121|100|111|99|145");
    }

    /**
     * Method description
     */
    public void testCmdParserHear00() {
        String cmd    = "(hear 34 referee play_on)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|PlayMode[playOn]");
    }

    /**
     * Method description
     */
    public void testCmdParserHear01() {
        String cmd    = "(hear 34 self buddy_go_home)";
        Set    result = parseCmd(cmd);
        assertEquals(0, result.size());
        assertTrue("result should be empty", result.isEmpty());
    }

    /**
     * Method description
     */
    public void testCmdParserHear02() {
        String cmd    = "(hear 34 123 buddy_go_home)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHear|123.0|buddy_go_home");
    }

    /**
     * Method description
     */
    public void testCmdParserInit02() {
        String cmd    = "(init r 1 before_kick_off)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.BEFORE_KICK_OFF);
    }

    /**
     * Method description
     */
    public void testCmdParserInit03() {
        String cmd    = "(init r 1 corner_kick_l)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.CORNER_KICK_OTHER);
    }

    /**
     * Method description
     */
    public void testCmdParserInit03a() {
        String cmd    = "(init l 1 corner_kick_r)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.CORNER_KICK_OTHER);
    }

    /**
     * Method description
     */
    public void testCmdParserInit04() {
        String cmd    = "(init l 1 corner_kick_l)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.CORNER_KICK_OWN);
    }

    /**
     * Method description
     */
    public void testCmdParserInit05() {
        String cmd    = "(init r 1 corner_kick_r)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.CORNER_KICK_OWN);
    }

    /**
     * Method description
     */
    public void testCmdParserInit06() {
        String cmd    = "(init r 1 free_kick_l)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.FREE_KICK_OTHER);
    }

    /**
     * Method description
     */
    public void testCmdParserInit07() {
        String cmd    = "(init l 1 free_kick_r)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.FREE_KICK_OTHER);
    }

    /**
     * Method description
     */
    public void testCmdParserInit08() {
        String cmd    = "(init l 1 free_kick_l)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.FREE_KICK_OWN);
    }

    /**
     * Method description
     */
    public void testCmdParserInit09() {
        String cmd    = "(init r 1 free_kick_r)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.FREE_KICK_OWN);
    }

    /**
     * Method description
     */
    public void testCmdParserInit10() {
        String cmd    = "(init l 1 goal_kick_r)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.GOAL_KICK_OTHER);
    }

    /**
     * Method description
     */
    public void testCmdParserInit11() {
        String cmd    = "(init r 1 goal_kick_l)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.GOAL_KICK_OTHER);
    }

    /**
     * Method description
     */
    public void testCmdParserInit12() {
        String cmd    = "(init l 1 goal_kick_l)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.GOAL_KICK_OWN);
    }

    /**
     * Method description
     */
    public void testCmdParserInit13() {
        String cmd    = "(init r 1 goal_kick_r)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.GOAL_KICK_OWN);
    }

    /**
     * Method description
     */
    public void testCmdParserInit14() {
        String cmd    = "(init r 1 goal_l_10)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.GOAL_OTHER);
    }

    /**
     * Method description
     */
    public void testCmdParserInit15() {
        String cmd    = "(init l 1 goal_r_2)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.GOAL_OTHER);
    }

    /**
     * Method description
     */
    public void testCmdParserInit16() {
        String cmd    = "(init r 1 goal_r_1)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.GOAL_OWN);
    }

    /**
     * Method description
     */
    public void testCmdParserInit17() {
        String cmd    = "(init l 1 goal_l_3)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.GOAL_OWN);
    }

    /**
     * Method description
     */
    public void testCmdParserInit18() {
        String cmd    = "(init r 1 kick_in_l)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.KICK_IN_OTHER);
    }

    /**
     * Method description
     */
    public void testCmdParserInit19() {
        String cmd    = "(init l 1 kick_in_r)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.KICK_IN_OTHER);
    }

    /**
     * Method description
     */
    public void testCmdParserInit20() {
        String cmd    = "(init r 1 kick_in_r)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.KICK_IN_OWN);
    }

    /**
     * Method description
     */
    public void testCmdParserInit21() {
        String cmd    = "(init l 10 kick_in_l)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.KICK_IN_OWN);
    }

    /**
     * Method description
     */
    public void testCmdParserInit22() {
        String cmd    = "(init r 10 kick_in_r)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.KICK_IN_OWN);
    }

    /**
     * Method description
     */
    public void testCmdParserInit23() {
        String cmd    = "(init r 10 kick_off_l)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.KICK_OFF_OTHER);
    }

    /**
     * Method description
     */
    public void testCmdParserInit24() {
        String cmd    = "(init l 10 kick_off_r)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.KICK_OFF_OTHER);
    }

    /**
     * Method description
     */
    public void testCmdParserInit25() {
        String cmd    = "(init l 10 kick_off_l)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.KICK_OFF_OWN);
    }

    /**
     * Method description
     */
    public void testCmdParserInit26() {
        String cmd    = "(init r 10 kick_off_r)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.KICK_OFF_OWN);
    }

    /**
     * Method description
     */
    public void testCmdParserInit27() {
        String cmd    = "(init r 10 time_over)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.TIME_OVER);
    }

    /**
     * Method description
     */
    public void testCmdParserInit28() {
        String cmd    = "(init l 110 time_over)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.TIME_OVER);
    }

    /**
     * Method description
     */
    public void testCmdParserHearRefereeA00a() {
        String cmd    = "(hear 55 referee offside_l)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearReferee|" + RefereeMessage.OFFSIDE_OTHER);
    }

    /**
     * Method description
     */
    public void testCmdParserHearRefereeA00b() {
        String cmd    = "(hear 55 referee offside_r)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearReferee|" + RefereeMessage.OFFSIDE_OWN);
    }

    /**
     * Method description
     */
    public void testCmdParserHearRefereeA00() {
        String cmd    = "(hear 55 referee foul_l)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearReferee|" + RefereeMessage.FOUL_OTHER);
    }

    /**
     * Method description
     */
    public void testCmdParserHearRefereeA01() {
        String cmd    = "(hear 55 referee foul_r)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearReferee|" + RefereeMessage.FOUL_OWN);
    }

    /**
     * Method description
     */
    public void testCmdParserHearRefereeA02() {
        String cmd    = "(hear 55 referee foul_l)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearReferee|" + RefereeMessage.FOUL_OTHER);
    }

    /**
     * Method description
     */
    public void testCmdParserHearRefereeA03() {
        String cmd    = "(hear 55 referee half_time)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearReferee|" + RefereeMessage.HALF_TIME);
    }

    /**
     * Method description
     */
    public void testCmdParserHearRefereeA04() {
        String cmd    = "(hear 55 referee time_extended)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearReferee|" + RefereeMessage.TIME_EXTENDED);
    }

    /**
     * Method description
     */
    public void testCmdParserHearRefereeA05() {
        String cmd    = "(hear 55 referee time_up)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearReferee|" + RefereeMessage.TIME_UP);
    }

    /**
     * Method description
     */
    public void testCmdParserHearRefereeA06() {
        String cmd    = "(hear 55 referee time_up_without_a_team)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearReferee|" + RefereeMessage.TIME_UP_WITHOUT_A_TEAM);
    }

    /**
     * Method description
     */
    public void testCmdParserHearRefereeA07() {
        String cmd    = "(hear 55 referee drop_ball)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearReferee|" + RefereeMessage.DROP_BALL);
    }

    /**
     * Method description
     */
    public void testCmdParserHearPlayMode00() {
        String cmd    = "(hear 55 referee before_kick_off)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.BEFORE_KICK_OFF);
    }

    /**
     * Method description
     */
    public void testCmdParserHearPlayMode01() {
        String cmd    = "(hear 55 referee free_kick_r)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.FREE_KICK_OWN);
    }

    /**
     * Method description
     */
    public void testCmdParserHearPlayMode02() {
        String cmd    = "(hear 55 referee kick_in_r)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.KICK_IN_OWN);
    }

    /**
     * Method description
     */
    public void testCmdParserHearPlayMode03() {
        String cmd    = "(hear 55 referee kick_in_l)";
        Set    result = parseCmd(cmd);
        assertEquals(1, result.size());
        assertResult(cmd, result, "|infoHearPlayMode|" + PlayMode.KICK_IN_OTHER);
    }

    /**
     * Method description
     */
    public void testCmdParserSeeMulti() {
        String cmd =
            "(see 0 ((goal r) 103.5 -6) ((flag c t) 68 -42) ((flag c b) 54.6 23) ((flag r t) 112.2 -24) ((flag r b) 104.6 12) ((flag p l c) 18.7 -40 0 0) ((flag p l b) 16.3 29 -0 0) ((flag p r t) 91.8 -20) ((flag p r c) 87.4 -8) ((flag p r b) 86.5 5) ((ball) 49.4 -13) ((line r) 102.5 -89)))";
        Set result = parseCmd(cmd);
        assertEquals(12, result.size());
        assertResult(cmd, result, "|infoSeeBall|49.4|-13.0");
    }

    /**
     * Method description
     * @param cmd
     * @param resultSet
     * @param resultString
     */
    private void assertResult(String cmd, Set resultSet, String resultString) {
        if (!resultSet.contains(resultString)) {
            StringBuffer sb = new StringBuffer();
            Iterator     i  = resultSet.iterator();
            sb.append(cmd);
            sb.append("\n\tleads to ->#");
            sb.append(resultSet.size());
            sb.append("[");
            while (i.hasNext()) {
                sb.append("'");
                sb.append(i.next());
                sb.append("',");
            }
            sb.append("]\n");
            sb.append("\tbut this contains not ->'");
            sb.append(resultString);
            sb.append("'");
            System.out.println(sb.toString());
            fail("Could not parse:'" + cmd + "' because <" + sb + ">");
        }
    }

    /**
     * Method description
     * @param s
     * @return
     */
    private Set parseCmd(String s) {
        try {
            return basicParseCmd(s);
        } catch (ParseException ex) {
            fail(ex.getMessage());
            return null;
        }
    }

    /**
     * Method description
     * @param s
     * @return
     * @throws ParseException
     */
    private Set basicParseCmd(String s) throws ParseException {
        TestCommandFilter f = new TestCommandFilter();
        filterCommand(s, f);
        TestController c      = new TestController();
        DummyPlayer    player = new DummyPlayer();
        player.setTeamEast(true);
        player.setTeamName("teamEast");
        if (f.isTypeSee()) {
            getCmdParser().parseSeeCommand(f.getCommand(), c, player);
        } else if (f.isTypeError()) {
            getCmdParser().parseErrorCommand(f.getCommand(), player);
        } else if (f.isTypeHear()) {
            getCmdParser().parseHearCommand(f.getCommand(), c, player);
        } else if (f.isTypeInit()) {
            getCmdParser().parseInitCommand(f.getCommand(), c, player);
        } else if (f.isTypeSenseBody()) {
            getCmdParser().parseSenseBodyCommand(f.getCommand(), c, player);
        } else if (f.isTypeUndefined()) {
            fail("CommandFilter could not identify type of: " + s);
        } else {
            fail("CommandFilter fails in: " + s);
        }
        return c.getResult();
    }

    /**
     * Method description
     * @return
     */
    private Filter getFilter() {
        return new Filter();
    }

    /**
     * Method description
     * @return
     * @throws ParseException
     */
    private CmdParser getCmdParser() throws ParseException {
        if (cmdp == null) {
            cmdp = new CmdParser(new StringReader(""));
        }
        return cmdp;
    }

    /**
     * Method description
     * @return
     */
    static TestSuite suite() {
        try {
            return new TestSuite(Class.forName("atan.test.ParserTest"));
        } catch (ClassNotFoundException ex) {
            throw new Error(ex.getMessage());
        }
    }
}
