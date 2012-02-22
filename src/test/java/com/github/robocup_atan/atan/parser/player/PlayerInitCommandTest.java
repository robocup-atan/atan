package com.github.robocup_atan.atan.parser.player;

import com.github.robocup_atan.atan.model.enums.PlayMode;
import com.github.robocup_atan.atan.parser.BaseCommandFilter;
import com.github.robocup_atan.atan.parser.Filter;
import java.io.StringReader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for parsing the player init command.
 *
 * @author Atan
 */
public class PlayerInitCommandTest {
    
    // Global test variables.
    CmdParserPlayer parser;
    TestFilter commandFilter;
    Filter filter;
    
    // Current test expected values.
    String currentCommand;
    boolean expectedIsTeamEast;
    int expectedPlayerNumber;
    PlayMode expectedPlayMode;

    @Before
    public void setUpTest() throws Exception {
        parser = new CmdParserPlayer(new StringReader(""));
        commandFilter = new TestFilter();
        filter = new Filter();
    }

    // Tests
    @Test
    public void beforeKickOffEastPlayer1() {
        setCommand("(init l 1 before_kick_off)");
        setExpected(false, 1, PlayMode.BEFORE_KICK_OFF);
        runTest();
    }

    @Test
    public void beforeKickOffWestPlayer1() {
        setCommand("(init r 1 before_kick_off)");
        setExpected(true, 1, PlayMode.BEFORE_KICK_OFF);
        runTest();
    }
    
    @Test
    public void timeOverEastPlayer1() {
        setCommand("(init l 1 time_over)");
        setExpected(false, 1, PlayMode.TIME_OVER);
        runTest();
    }
    
    @Test
    public void timeOverWestPlayer1() {
        setCommand("(init r 1 time_over)");
        setExpected(true, 1, PlayMode.TIME_OVER);
        runTest();
    }

    // Private methods to make writing tests simpler.
    private void setCommand(String command) {
        currentCommand = command;
    }

    private void setExpected(boolean isTeamEast, int playerNumber, PlayMode playMode) {
        expectedIsTeamEast = isTeamEast;
        expectedPlayerNumber = playerNumber;
        expectedPlayMode = playMode;
    }

    private void runTest() {
        filter.run(currentCommand, commandFilter);
    }

    // Private classes for these tests.
    private class TestFilter extends BaseCommandFilter {

        private TestController controller = new TestController();
        private TestActions action = new TestActions();

        @Override
        public void initCommand(String cmd) {
            try {
                parser.parseInitCommand(cmd, controller, action);
            } catch (ParseException ex) {
                Assert.fail(ex.getMessage());
            }
        }
    }

    private class TestController extends BaseControllerPlayer {

        @Override
        public void infoHearPlayMode(PlayMode playMode) {
            Assert.assertEquals(expectedPlayMode, playMode);
        }
    }

    private class TestActions extends BaseActionsPlayer {

        @Override
        public void setTeamEast(boolean is) {
            Assert.assertEquals(expectedIsTeamEast, is);
        }

        @Override
        public void setNumber(int num) {
            Assert.assertEquals(expectedPlayerNumber, num);
        }
    }
}
