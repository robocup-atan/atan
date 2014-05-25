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

import com.github.robocup_atan.atan.model.enums.Flag;
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
 * Test class for parsing the player see command.
 *
 * @author Atan
 */
@RunWith(Parameterized.class)
public class PlayerSeePlayerOwnTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {

                /**
                 * Tests for seeing your own players are captured in the
                 * following array structure.
                 *   0: Server command.
                 *   1: Value of isTeamEast.
                 *   2: Value of team name.
                 *   3: Expected value of player number.
                 *   4: Expected value of goalie.
                 *   5: Expected value of distance.
                 *   6: Expected value of direction.
                 *   7: Expected value of distance change.
                 *   8: Expected value of direction change.
                 *   9: Expected value of body facing direction.
                 *   10: Expected value of head facing direction.
                 */

                // East team see player own messages.
                {"(see 123.45 ((p \"TeamOne\" 1) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 1,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 2) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 2,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 3) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 3,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 4) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 4,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 5) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 5,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 6) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 6,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 7) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 7,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 8) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 8,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 9) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 9,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 10) 123.45 123.45 123.45 123.45 123.45 123.45))", true,  "TeamOne", 10, false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 11) 123.45 123.45 123.45 123.45 123.45 123.45))", true,  "TeamOne", 11, false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                // West team see player own messages.
                {"(see 123.45 ((p \"TeamTwo\" 1) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 1,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 2) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 2,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 3) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 3,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 4) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 4,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 5) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 5,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 6) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 6,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 7) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 7,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 8) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 8,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 9) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 9,  false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 10) 123.45 123.45 123.45 123.45 123.45 123.45))", false, "TeamTwo", 10, false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 11) 123.45 123.45 123.45 123.45 123.45 123.45))", false, "TeamTwo", 11, false, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},

                // East team see goalie own messages.
                {"(see 123.45 ((p \"TeamOne\" 1 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 1,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 2 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 2,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 3 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 3,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 4 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 4,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 5 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 5,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 6 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 6,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 7 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 7,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 8 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 8,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 9 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  true,  "TeamOne", 9,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 10 g) 123.45 123.45 123.45 123.45 123.45 123.45))", true,  "TeamOne", 10, true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamOne\" 11 g) 123.45 123.45 123.45 123.45 123.45 123.45))", true,  "TeamOne", 11, true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                // West team see goalie own messages.
                {"(see 123.45 ((p \"TeamTwo\" 1 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 1,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 2 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 2,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 3 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 3,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 4 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 4,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 5 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 5,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 6 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 6,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 7 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 7,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 8 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 8,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 9 g) 123.45 123.45 123.45 123.45 123.45 123.45))",  false, "TeamTwo", 9,  true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 10 g) 123.45 123.45 123.45 123.45 123.45 123.45))", false, "TeamTwo", 10, true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},
                {"(see 123.45 ((p \"TeamTwo\" 11 g) 123.45 123.45 123.45 123.45 123.45 123.45))", false, "TeamTwo", 11, true, 123.45, 123.45, 123.45, 123.45, 123.45, 123.45},

            });
    }

    // Global test variables.
    private CmdParserPlayer parser;
    private TestFilter      commandFilter;
    private Filter          filter;

    // Test parameters.
    private String  command;
    private boolean isTeamEast;
    private String  teamName;
    private int     expectedPlayerNumber;
    private boolean expectedGoalie;
    private double  expectedDistance;
    private double  expectedDirection;
    private double  expectedDistChange;
    private double  expectedDirChange;
    private double  expectedBodyFacingDirection;
    private double  expectedHeadFacingDirection;

    public PlayerSeePlayerOwnTest(
        String  command,
        boolean isTeamEast,
        String  teamName,
        int     playerNumber,
        boolean goalie,
        double  distance,
        double  direction,
        double  distChange,
        double  dirChange,
        double  bodyFacingDirection,
        double  headFacingDirection) {

        this.command                     = command;
        this.isTeamEast                  = isTeamEast;
        this.teamName                    = teamName;
        this.expectedPlayerNumber        = playerNumber;
        this.expectedGoalie              = goalie;
        this.expectedDistance            = distance;
        this.expectedDirection           = direction;;
        this.expectedDistChange          = distChange;
        this.expectedDirChange           = dirChange;
        this.expectedBodyFacingDirection = bodyFacingDirection;
        this.expectedHeadFacingDirection = headFacingDirection;
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

        private TestController controller = new TestController();
        private TestActions    action     = new TestActions();

        @Override
        public void seeCommand(String cmd) {
            try {
                parser.parseSeeCommand(cmd, controller, action);
            } catch (ParseException ex) {
                Assert.fail(ex.getMessage());
            }
        }
    }

    private class TestController extends BaseControllerPlayer {

        @Override
        public void infoSeePlayerOwn(
            int     playerNumber,
            boolean goalie,
            double  distance,
            double  direction,
            double  distChange,
            double  dirChange,
            double  bodyFacingDirection,
            double  headFacingDirection) {

            Assert.assertEquals(expectedPlayerNumber, playerNumber);
            Assert.assertEquals(expectedGoalie, goalie);
            Assert.assertEquals(expectedDistance, distance, 0);
            Assert.assertEquals(expectedDirection, direction, 0);
            Assert.assertEquals(expectedDistChange, distChange, 0);
            Assert.assertEquals(expectedDirChange, dirChange, 0);
            Assert.assertEquals(expectedBodyFacingDirection, bodyFacingDirection, 0);
            Assert.assertEquals(expectedHeadFacingDirection, headFacingDirection, 0);
        }
    }

    private class TestActions extends BaseActionsPlayer {

        @Override
        public String getTeamName() {
            return teamName;
        }

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

