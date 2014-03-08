package com.github.robocup_atan.atan.parser.player;

import com.github.robocup_atan.atan.model.enums.Errors;
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
 * Test class for parsing the player error command.
 *
 * @author Atan
 */
@RunWith(Parameterized.class)
public class PlayerErrorCommandTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {

                /**
                 * Error only takes one format, so the array only contains the
                 * following structure.
                 *   0: Server command.
                 *   1: Expected value of error.
                 */

                {"(error cannot_reconnect_while_playon)",                      Errors.CANNOT_RECONNECT_WHILE_PLAYON},
                {"(error connection_failed)",                                  Errors.CONNECTION_FAILED},
                {"(error illegal_client_version)",                             Errors.ILLEGAL_CLIENT_VERSION},
                {"(error illegal_command_form)",                               Errors.ILLEGAL_COMMAND_FORM},
                {"(error illegal_teamname)",                                   Errors.ILLEGAL_TEAMNAME},
                {"(error illegal_teamname_or_too_long_teamname)",              Errors.ILLEGAL_TEAMNAME_OR_TOO_LONG_TEAMNAME},
                {"(error no_more_monitor)",                                    Errors.NO_MORE_MONITOR},
                {"(error no_more_player_or_goalie_or_illegal_client_version)", Errors.NO_MORE_PLAYER_OR_GOALIE_OR_ILLEGAL_CLIENT_VERSION},
                {"(error no_more_team)",                                       Errors.NO_MORE_TEAM},
                {"(error no_such_team_or_player)",                             Errors.NO_SUCH_TEAM_OR_PLAYER},
                {"(error red_carded_player)",                                  Errors.RED_CARDED_PLAYER},
                {"(error socket_open_failed)",                                 Errors.SOCKET_OPEN_FAILED},
                {"(error too_many_moves)",                                     Errors.TOO_MANY_MOVES},
                {"(error unknown_command)",                                    Errors.UNKNOWN_COMMAND},

            });
    }

    // Global test variables.
    private CmdParserPlayer parser;
    private TestFilter      commandFilter;
    private Filter          filter;

    // Test parameters.
    private String command;
    private Errors expectedError;

    public PlayerErrorCommandTest(
        String command,
        Errors error) {

        this.command       = command;
        this.expectedError = error;
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
        public void errorCommand(String cmd) {
            try {
                parser.parseErrorCommand(cmd, controller, action);
            } catch (ParseException ex) {
                Assert.fail(ex.getMessage());
            }
        }
    }

    private class TestController extends BaseControllerPlayer {

        @Override
        public void infoHearError(Errors error) {
            Assert.assertEquals(expectedError, error);
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

