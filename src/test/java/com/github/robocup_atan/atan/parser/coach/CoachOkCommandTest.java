package com.github.robocup_atan.atan.parser.coach;

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

import com.github.robocup_atan.atan.model.enums.Ok;
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
public class CoachOkCommandTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {

                /**
                 * Ok only takes one format, so the array only contains the
                 * following structure.
                 *   0: Server command.
                 *   1: Expected value of warning.
                 */

                {"(ok change_mode)",                       Ok.CHANGE_MODE},
                //{"(ok change_player_type %s %d %d)",     Ok.CHANGE_PLAYER_TYPE_%s_%d_%d},
                //{"(ok change_player_type %s %d goalie)", Ok.CHANGE_PLAYER_TYPE_%s_%d_goalie},
                //{"(ok check_ball %d %s)",                Ok.CHECK_BALL_%d_%s},
                //{"(ok compression %d)",                  Ok.COMPRESSION_%d},
                {"(ok ear off)",                           Ok.EAR_OFF},
                {"(ok ear on)",                            Ok.EAR_ON},
                {"(ok eye off)",                           Ok.EYE_OFF},
                {"(ok eye on)",                            Ok.EYE_ON},
                //{"(ok look %d)",                         Ok.LOOK},
                {"(ok move)",                              Ok.MOVE},
                {"(ok recover)",                           Ok.RECOVER},
                {"(ok say)",                               Ok.SAY},
                {"(ok start)",                             Ok.START}
                //{"(ok team_graphic %u %u)",              Ok.TEAM_GRAPHIC_%u_%u}
                //{"(ok team_names)",                      Ok.TEAM_NAMES}

            });
    }

    // Global test variables.
    private CmdParserCoach parser;
    private TestFilter     commandFilter;
    private Filter         filter;

    // Test parameters.
    private String  command;
    private Ok      expectedOk;

    public CoachOkCommandTest(
        String  command,
        Ok      ok) {

        this.command    = command;
        this.expectedOk = ok;
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
        public void okCommand(String cmd) {
            try {
                parser.parseOkCommand(cmd, controller, action);
            } catch (ParseException ex) {
                Assert.fail(ex.getMessage());
            }
        }
    }

    private class TestController extends BaseControllerCoach {

        @Override
        public void infoHearOk(Ok ok) {
            Assert.assertEquals(expectedOk, ok);
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

