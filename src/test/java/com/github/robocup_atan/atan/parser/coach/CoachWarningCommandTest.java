package com.github.robocup_atan.atan.parser.coach;

import com.github.robocup_atan.atan.model.enums.Warning;
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
 * Test class for parsing the coach warning command.
 *
 * @author Atan
 */
@RunWith(Parameterized.class)
public class CoachWarningCommandTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {

                /**
                 * Warning only takes one format, so the array only contains the
                 * following structure.
                 *   0: Server command.
                 *   1: Expected value of warning.
                 */

                {"(warning cannot_change_goalie)",                     Warning.CANNOT_CHANGE_GOALIE},
                {"(warning cannot_change_goalie_while_penalty_taken)", Warning.CANNOT_CHANGE_GOALIE_WHILE_PENALTY_TAKEN},
                {"(warning cannot_change_goalie_while_playon)",        Warning.CANNOT_CHANGE_GOALIE_WHILE_PLAYON},
                {"(warning cannot_say_while_playon)",                  Warning.CANNOT_SAY_WHILE_PLAYON },
                {"(warning cannot_sub_while_penalty_shootouts)",       Warning.CANNOT_SUB_WHILE_PENALTY_SHOOTOUTS},
                {"(warning cannot_sub_while_playon)",                  Warning.CANNOT_SUB_WHILE_PLAYON},
                {"(warning compression_unsupported)",                  Warning.COMPRESSION_UNSUPPORTED},
                {"(warning invalid_tile_location)",                    Warning.INVALID_TILE_LOCATION },
                {"(warning invalid_tile_size)",                        Warning.INVALID_TILE_SIZE },
                {"(warning max_of_that_type_on_field)",                Warning.MAX_OF_THAT_TYPE_ON_FIELD},
                //{"(warning max_of_type_%d_on_field)",                Warning.MAX_OF_TYPE_%d_ON_FIELD},
                {"(warning message_not_null_terminated)",              Warning.MESSAGE_NOT_NULL_TERMINATED},
                {"(warning no_left_of_that_type)",                     Warning.NO_LEFT_OF_THAT_TYPE},
                {"(warning no_subs_left)",                             Warning.NO_SUBS_LEFT},
                {"(warning no_such_player)",                           Warning.NO_SUCH_PLAYER},
                {"(warning no_team_found)",                            Warning.NO_TEAM_FOUND},
                {"(warning only_before_kick_off)",                     Warning.ONLY_BEFORE_KICK_OFF}

            });
    }

    // Global test variables.
    private CmdParserCoach parser;
    private TestFilter     commandFilter;
    private Filter         filter;

    // Test parameters.
    private String   command;
    private Warning expectedWarning;

    public CoachWarningCommandTest(
        String command,
        Warning warning) {

        this.command         = command;
        this.expectedWarning = warning;
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
        public void warningCommand(String cmd) {
            try {
                parser.parseWarningCommand(cmd, controller, action);
            } catch (ParseException ex) {
                Assert.fail(ex.getMessage());
            }
        }
    }

    private class TestController extends BaseControllerCoach {

        @Override
        public void infoHearWarning(Warning warning) {
            Assert.assertEquals(expectedWarning, warning);
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

