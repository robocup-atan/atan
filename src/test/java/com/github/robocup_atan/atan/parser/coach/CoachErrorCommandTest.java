package com.github.robocup_atan.atan.parser.coach;

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
 * Test class for parsing the coach error command.
 *
 * @author Atan
 */
@RunWith(Parameterized.class)
public class CoachErrorCommandTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {

                /**
                 * Error only takes one format, so the array only contains the
                 * following structure.
                 *   0: Server command.
                 *   1: Expected value of error.
                 */

                {"(error already_have_offline_coach)",                 Errors.ALREADY_HAVE_OFFLINE_COACH},
                {"(error cannot_say_freeform_while_playon)",           Errors.CANNOT_SAY_FREEFORM_WHILE_PLAYON},
                {"(error connected_offline_coach_without_coach_mode)", Errors.CONNECTED_OFFLINE_COACH_WITHOUT_COACH_MODE},
                {"(error connection_failed)",                          Errors.CONNECTION_FAILED},
                {"(error could_not_parse_say)",                        Errors.COULD_NOT_PARSE_SAY},
                {"(error goalie_already_exists)",                      Errors.GOALIE_ALREADY_EXISTS},
                {"(error illegal_client_version)",                     Errors.ILLEGAL_CLIENT_VERSION},
                {"(error illegal_command_form)",                       Errors.ILLEGAL_COMMAND_FORM},
                {"(error illegal_mode)",                               Errors.ILLEGAL_MODE},
                {"(error invalid_xpm_data)",                           Errors.INVALID_XPM_DATA},
                {"(error out_of_range_player_type)",                   Errors.OUT_OF_RANGE_PLAYER_TYPE},
                {"(error said_too_many_advice_messages)",              Errors.SAID_TOO_MANY_ADVICE_MESSAGES},
                {"(error said_too_many_define_messages)",              Errors.SAID_TOO_MANY_DEFINE_MESSAGES},
                {"(error said_too_many_del_messages)",                 Errors.SAID_TOO_MANY_DEL_MESSAGES},
                {"(error said_too_many_freeform_messages)",            Errors.SAID_TOO_MANY_FREEFORM_MESSAGES},
                {"(error said_too_many_info_messages)",                Errors.SAID_TOO_MANY_INFO_MESSAGES},
                {"(error said_too_many_messages)",                     Errors.SAID_TOO_MANY_MESSAGES},
                {"(error said_too_many_meta_messages)",                Errors.SAID_TOO_MANY_META_MESSAGES},
                {"(error said_too_many_rule_messages)",                Errors.SAID_TOO_MANY_RULE_MESSAGES},
                {"(error socket_open_failed)",                         Errors.SOCKET_OPEN_FAILED},
                {"(error unknown_command)",                            Errors.UNKNOWN_COMMAND},

            });
    }

    // Global test variables.
    private CmdParserCoach parser;
    private TestFilter     commandFilter;
    private Filter         filter;

    // Test parameters.
    private String command;
    private Errors expectedError;

    public CoachErrorCommandTest(
        String command,
        Errors error) {

        this.command       = command;
        this.expectedError = error;
    }

    @Before
    public void setUpTest() throws Exception {
        parser        = new CmdParserCoach(new StringReader(""));
        commandFilter = new TestFilter();
        filter        = new Filter();
    }

    @Test
    public void parseCommand() {
        filter.run(command, commandFilter);
    }

    private class TestFilter extends BaseCommandFilter {

        private TestController   controller = new TestController();
        private BaseActionsCoach action     = new BaseActionsCoach();

        @Override
        public void errorCommand(String cmd) {
            try {
                parser.parseErrorCommand(cmd, controller, action);
            } catch (ParseException ex) {
                Assert.fail(ex.getMessage());
            }
        }
    }

    private class TestController extends BaseControllerCoach {

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

