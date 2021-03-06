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
public class CoachHearRefereeTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {

                /**
                 * Tests for hearing the referee are captured in the following
                 * array structure.
                 *   0: Server command.
                 *   1: Value of isTeamEast.
                 *   2: Expected value of play mode.
                 */

                // East team referee messages.
                {"(hear 1 referee before_kick_off)",   true,  PlayMode.BEFORE_KICK_OFF},
                {"(hear 1 referee time_over)",         true,  PlayMode.TIME_OVER},
                {"(hear 1 referee play_on)",           true,  PlayMode.PLAY_ON},
                {"(hear 1 referee kick_off_l)",        true,  PlayMode.KICK_OFF_OTHER},
                {"(hear 1 referee kick_off_r)",        true,  PlayMode.KICK_OFF_OWN},
                {"(hear 1 referee kick_in_l)",         true,  PlayMode.KICK_IN_OTHER},
                {"(hear 1 referee kick_in_r)",         true,  PlayMode.KICK_IN_OWN},
                {"(hear 1 referee free_kick_l)",       true,  PlayMode.FREE_KICK_OTHER},
                {"(hear 1 referee free_kick_r)",       true,  PlayMode.FREE_KICK_OWN},
                {"(hear 1 referee free_kick_fault_l)", true,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(hear 1 referee free_kick_fault_r)", true,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(hear 1 referee corner_kick_l)",     true,  PlayMode.CORNER_KICK_OTHER},
                {"(hear 1 referee corner_kick_r)",     true,  PlayMode.CORNER_KICK_OWN},
                {"(hear 1 referee goal_kick_l)",       true,  PlayMode.GOAL_KICK_OTHER},
                {"(hear 1 referee goal_kick_r)",       true,  PlayMode.GOAL_KICK_OWN},
                {"(hear 1 referee goal_l_1)",          true,  PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_l_2)",          true,  PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_l_3)",          true,  PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_l_4)",          true,  PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_l_5)",          true,  PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_l_6)",          true,  PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_l_7)",          true,  PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_l_8)",          true,  PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_l_9)",          true,  PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_l_10)",         true,  PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_l_11)",         true,  PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_r_1)",          true,  PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_r_2)",          true,  PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_r_3)",          true,  PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_r_4)",          true,  PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_r_5)",          true,  PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_r_6)",          true,  PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_r_7)",          true,  PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_r_8)",          true,  PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_r_9)",          true,  PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_r_10)",         true,  PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_r_11)",         true,  PlayMode.GOAL_OWN},
                // West team referee messages.
                {"(hear 1 referee before_kick_off)",   false, PlayMode.BEFORE_KICK_OFF},
                {"(hear 1 referee time_over)",         false, PlayMode.TIME_OVER},
                {"(hear 1 referee play_on)",           false, PlayMode.PLAY_ON},
                {"(hear 1 referee kick_off_l)",        false, PlayMode.KICK_OFF_OWN},
                {"(hear 1 referee kick_off_r)",        false, PlayMode.KICK_OFF_OTHER},
                {"(hear 1 referee kick_in_l)",         false, PlayMode.KICK_IN_OWN},
                {"(hear 1 referee kick_in_r)",         false, PlayMode.KICK_IN_OTHER},
                {"(hear 1 referee free_kick_l)",       false, PlayMode.FREE_KICK_OWN},
                {"(hear 1 referee free_kick_r)",       false, PlayMode.FREE_KICK_OTHER},
                {"(hear 1 referee free_kick_fault_l)", false, PlayMode.FREE_KICK_FAULT_OWN},
                {"(hear 1 referee free_kick_fault_r)", false, PlayMode.FREE_KICK_FAULT_OTHER},
                {"(hear 1 referee corner_kick_l)",     false, PlayMode.CORNER_KICK_OWN},
                {"(hear 1 referee corner_kick_r)",     false, PlayMode.CORNER_KICK_OTHER},
                {"(hear 1 referee goal_kick_l)",       false, PlayMode.GOAL_KICK_OWN},
                {"(hear 1 referee goal_kick_r)",       false, PlayMode.GOAL_KICK_OTHER},
                {"(hear 1 referee goal_l_1)",          false, PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_l_2)",          false, PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_l_3)",          false, PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_l_4)",          false, PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_l_5)",          false, PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_l_6)",          false, PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_l_7)",          false, PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_l_8)",          false, PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_l_9)",          false, PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_l_10)",         false, PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_l_11)",         false, PlayMode.GOAL_OWN},
                {"(hear 1 referee goal_r_1)",          false, PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_r_2)",          false, PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_r_3)",          false, PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_r_4)",          false, PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_r_5)",          false, PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_r_6)",          false, PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_r_7)",          false, PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_r_8)",          false, PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_r_9)",          false, PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_r_10)",         false, PlayMode.GOAL_OTHER},
                {"(hear 1 referee goal_r_11)",         false, PlayMode.GOAL_OTHER},

            });
    }

    // Global test variables.
    private CmdParserCoach parser;
    private TestFilter      commandFilter;
    private Filter          filter;

    // Test parameters.
    private String   command;
    private boolean  isTeamEast;
    private PlayMode expectedPlayMode;

    public CoachHearRefereeTest(
        String   command,
        boolean  isTeamEast,
        PlayMode playMode) {

        this.command          = command;
        this.isTeamEast       = isTeamEast;
        this.expectedPlayMode = playMode;
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

        private TestController controller = new TestController();
        private TestActions    action     = new TestActions();

        @Override
        public void hearCommand(String cmd) {
            try {
                parser.parseHearCommand(cmd, controller, action);
            } catch (ParseException ex) {
                Assert.fail(ex.getMessage());
            }
        }
    }

    private class TestController extends BaseControllerCoach {

        @Override
        public void infoHearPlayMode(PlayMode playMode) {
            Assert.assertEquals(expectedPlayMode, playMode);
        }
    }

    private class TestActions extends BaseActionsCoach {

        @Override
        public boolean isTeamEast() {
            return isTeamEast;
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

