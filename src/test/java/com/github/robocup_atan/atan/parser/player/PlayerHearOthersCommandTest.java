package com.github.robocup_atan.atan.parser.player;

import com.github.robocup_atan.atan.model.enums.PlayMode;
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
                {"(hear 1 180 \"test_message\")",       180,    "test_message"},
                {"(hear 1 -180 \"test_message\")",      -180,   "test_message"},
                {"(hear 5000 55.55 \"test_message\")",  55.55,  "test_message"},
                {"(hear 5000 -55.55 \"test_message\")", -55.55, "test_message"},

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

