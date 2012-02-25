package com.github.robocup_atan.atan.parser.player;

import com.github.robocup_atan.atan.parser.BaseCommandFilter;
import com.github.robocup_atan.atan.parser.Filter;
import java.io.StringReader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * Test class for parsing the player init command.
 *
 * @author Atan
 */
public class PlayerHearCommandTest {

    // Global test variables.
    CmdParserPlayer parser;
    TestFilter commandFilter;
    Filter filter;
    
    // Current test expected values.
    String currentCommand;
    double expectedDirection;
    String expectedMessage;

    @Before
    public void setUpTest() throws Exception {
        parser = new CmdParserPlayer(new StringReader(""));
        commandFilter = new TestFilter();
        filter = new Filter();
    }

    // Tests
    @Test
    public void hearOther180() {
        setCommand("(hear 1 180 RunFaster)");
        setExpected(180, "RunFaster");
        runTest();
    }
    
    @Test
    public void hearOtherNeg180() {
        setCommand("(hear 1 -180 RunFaster)");
        setExpected(-180, "RunFaster");
        runTest();
    }

    // Private methods to make writing tests simpler.
    private void setCommand(String command) {
        currentCommand = command;
    }

    private void setExpected(double direction, String message) {
        expectedDirection = direction;
        expectedMessage = message;
    }

    private void runTest() {
        filter.run(currentCommand, commandFilter);
    }

    // Private classes for these tests.
    private class TestFilter extends BaseCommandFilter {

        private TestController controller = new TestController();
        private BaseActionsPlayer action = new BaseActionsPlayer();

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
            System.out.println(description.getMethodName());
        }
    };
}
