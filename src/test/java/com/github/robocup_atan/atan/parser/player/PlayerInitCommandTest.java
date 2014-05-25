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
 * Test class for parsing the player init command.
 *
 * @author Atan
 */
@RunWith(Parameterized.class)
public class PlayerInitCommandTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {

                /**
                 * Init only takes one format, so the array only contains the
                 * following structure.
                 *   0: Server command.
                 *   1: Expected value of isTeamEast.
                 *   2: Expected value of player number.
                 *   3: Expected value of play mode.
                 */

                // East team before kick off.
                {"(init r 1 before_kick_off)",  true,  1,  PlayMode.BEFORE_KICK_OFF},
                {"(init r 2 before_kick_off)",  true,  2,  PlayMode.BEFORE_KICK_OFF},
                {"(init r 3 before_kick_off)",  true,  3,  PlayMode.BEFORE_KICK_OFF},
                {"(init r 4 before_kick_off)",  true,  4,  PlayMode.BEFORE_KICK_OFF},
                {"(init r 5 before_kick_off)",  true,  5,  PlayMode.BEFORE_KICK_OFF},
                {"(init r 6 before_kick_off)",  true,  6,  PlayMode.BEFORE_KICK_OFF},
                {"(init r 7 before_kick_off)",  true,  7,  PlayMode.BEFORE_KICK_OFF},
                {"(init r 8 before_kick_off)",  true,  8,  PlayMode.BEFORE_KICK_OFF},
                {"(init r 9 before_kick_off)",  true,  9,  PlayMode.BEFORE_KICK_OFF},
                {"(init r 10 before_kick_off)", true,  10, PlayMode.BEFORE_KICK_OFF},
                {"(init r 11 before_kick_off)", true,  11, PlayMode.BEFORE_KICK_OFF},
                // West team before kick off.
                {"(init l 1 before_kick_off)",  false, 1,  PlayMode.BEFORE_KICK_OFF},
                {"(init l 2 before_kick_off)",  false, 2,  PlayMode.BEFORE_KICK_OFF},
                {"(init l 3 before_kick_off)",  false, 3,  PlayMode.BEFORE_KICK_OFF},
                {"(init l 4 before_kick_off)",  false, 4,  PlayMode.BEFORE_KICK_OFF},
                {"(init l 5 before_kick_off)",  false, 5,  PlayMode.BEFORE_KICK_OFF},
                {"(init l 6 before_kick_off)",  false, 6,  PlayMode.BEFORE_KICK_OFF},
                {"(init l 7 before_kick_off)",  false, 7,  PlayMode.BEFORE_KICK_OFF},
                {"(init l 8 before_kick_off)",  false, 8,  PlayMode.BEFORE_KICK_OFF},
                {"(init l 9 before_kick_off)",  false, 9,  PlayMode.BEFORE_KICK_OFF},
                {"(init l 10 before_kick_off)", false, 10, PlayMode.BEFORE_KICK_OFF},
                {"(init l 11 before_kick_off)", false, 11, PlayMode.BEFORE_KICK_OFF},

                // East team time over.
                {"(init r 1 time_over)",  true,  1,  PlayMode.TIME_OVER},
                {"(init r 2 time_over)",  true,  2,  PlayMode.TIME_OVER},
                {"(init r 3 time_over)",  true,  3,  PlayMode.TIME_OVER},
                {"(init r 4 time_over)",  true,  4,  PlayMode.TIME_OVER},
                {"(init r 5 time_over)",  true,  5,  PlayMode.TIME_OVER},
                {"(init r 6 time_over)",  true,  6,  PlayMode.TIME_OVER},
                {"(init r 7 time_over)",  true,  7,  PlayMode.TIME_OVER},
                {"(init r 8 time_over)",  true,  8,  PlayMode.TIME_OVER},
                {"(init r 9 time_over)",  true,  9,  PlayMode.TIME_OVER},
                {"(init r 10 time_over)", true,  10, PlayMode.TIME_OVER},
                {"(init r 11 time_over)", true,  11, PlayMode.TIME_OVER},
                // West team time over.
                {"(init l 1 time_over)",  false, 1,  PlayMode.TIME_OVER},
                {"(init l 2 time_over)",  false, 2,  PlayMode.TIME_OVER},
                {"(init l 3 time_over)",  false, 3,  PlayMode.TIME_OVER},
                {"(init l 4 time_over)",  false, 4,  PlayMode.TIME_OVER},
                {"(init l 5 time_over)",  false, 5,  PlayMode.TIME_OVER},
                {"(init l 6 time_over)",  false, 6,  PlayMode.TIME_OVER},
                {"(init l 7 time_over)",  false, 7,  PlayMode.TIME_OVER},
                {"(init l 8 time_over)",  false, 8,  PlayMode.TIME_OVER},
                {"(init l 9 time_over)",  false, 9,  PlayMode.TIME_OVER},
                {"(init l 10 time_over)", false, 10, PlayMode.TIME_OVER},
                {"(init l 11 time_over)", false, 11, PlayMode.TIME_OVER},

                // East team play on.
                {"(init r 1 play_on)",  true,  1,  PlayMode.PLAY_ON},
                {"(init r 2 play_on)",  true,  2,  PlayMode.PLAY_ON},
                {"(init r 3 play_on)",  true,  3,  PlayMode.PLAY_ON},
                {"(init r 4 play_on)",  true,  4,  PlayMode.PLAY_ON},
                {"(init r 5 play_on)",  true,  5,  PlayMode.PLAY_ON},
                {"(init r 6 play_on)",  true,  6,  PlayMode.PLAY_ON},
                {"(init r 7 play_on)",  true,  7,  PlayMode.PLAY_ON},
                {"(init r 8 play_on)",  true,  8,  PlayMode.PLAY_ON},
                {"(init r 9 play_on)",  true,  9,  PlayMode.PLAY_ON},
                {"(init r 10 play_on)", true,  10, PlayMode.PLAY_ON},
                {"(init r 11 play_on)", true,  11, PlayMode.PLAY_ON},
                // West team play on.
                {"(init l 1 play_on)",  false, 1,  PlayMode.PLAY_ON},
                {"(init l 2 play_on)",  false, 2,  PlayMode.PLAY_ON},
                {"(init l 3 play_on)",  false, 3,  PlayMode.PLAY_ON},
                {"(init l 4 play_on)",  false, 4,  PlayMode.PLAY_ON},
                {"(init l 5 play_on)",  false, 5,  PlayMode.PLAY_ON},
                {"(init l 6 play_on)",  false, 6,  PlayMode.PLAY_ON},
                {"(init l 7 play_on)",  false, 7,  PlayMode.PLAY_ON},
                {"(init l 8 play_on)",  false, 8,  PlayMode.PLAY_ON},
                {"(init l 9 play_on)",  false, 9,  PlayMode.PLAY_ON},
                {"(init l 10 play_on)", false, 10, PlayMode.PLAY_ON},
                {"(init l 11 play_on)", false, 11, PlayMode.PLAY_ON},

                // East team kick off own.
                {"(init r 1 kick_off_r)",  true,  1,  PlayMode.KICK_OFF_OWN},
                {"(init r 2 kick_off_r)",  true,  2,  PlayMode.KICK_OFF_OWN},
                {"(init r 3 kick_off_r)",  true,  3,  PlayMode.KICK_OFF_OWN},
                {"(init r 4 kick_off_r)",  true,  4,  PlayMode.KICK_OFF_OWN},
                {"(init r 5 kick_off_r)",  true,  5,  PlayMode.KICK_OFF_OWN},
                {"(init r 6 kick_off_r)",  true,  6,  PlayMode.KICK_OFF_OWN},
                {"(init r 7 kick_off_r)",  true,  7,  PlayMode.KICK_OFF_OWN},
                {"(init r 8 kick_off_r)",  true,  8,  PlayMode.KICK_OFF_OWN},
                {"(init r 9 kick_off_r)",  true,  9,  PlayMode.KICK_OFF_OWN},
                {"(init r 10 kick_off_r)", true,  10, PlayMode.KICK_OFF_OWN},
                {"(init r 11 kick_off_r)", true,  11, PlayMode.KICK_OFF_OWN},
                // West team kick off own.
                {"(init l 1 kick_off_l)",  false, 1,  PlayMode.KICK_OFF_OWN},
                {"(init l 2 kick_off_l)",  false, 2,  PlayMode.KICK_OFF_OWN},
                {"(init l 3 kick_off_l)",  false, 3,  PlayMode.KICK_OFF_OWN},
                {"(init l 4 kick_off_l)",  false, 4,  PlayMode.KICK_OFF_OWN},
                {"(init l 5 kick_off_l)",  false, 5,  PlayMode.KICK_OFF_OWN},
                {"(init l 6 kick_off_l)",  false, 6,  PlayMode.KICK_OFF_OWN},
                {"(init l 7 kick_off_l)",  false, 7,  PlayMode.KICK_OFF_OWN},
                {"(init l 8 kick_off_l)",  false, 8,  PlayMode.KICK_OFF_OWN},
                {"(init l 9 kick_off_l)",  false, 9,  PlayMode.KICK_OFF_OWN},
                {"(init l 10 kick_off_l)", false, 10, PlayMode.KICK_OFF_OWN},
                {"(init l 11 kick_off_l)", false, 11, PlayMode.KICK_OFF_OWN},

                // East team kick off other.
                {"(init r 1 kick_off_l)",  true,  1,  PlayMode.KICK_OFF_OTHER},
                {"(init r 2 kick_off_l)",  true,  2,  PlayMode.KICK_OFF_OTHER},
                {"(init r 3 kick_off_l)",  true,  3,  PlayMode.KICK_OFF_OTHER},
                {"(init r 4 kick_off_l)",  true,  4,  PlayMode.KICK_OFF_OTHER},
                {"(init r 5 kick_off_l)",  true,  5,  PlayMode.KICK_OFF_OTHER},
                {"(init r 6 kick_off_l)",  true,  6,  PlayMode.KICK_OFF_OTHER},
                {"(init r 7 kick_off_l)",  true,  7,  PlayMode.KICK_OFF_OTHER},
                {"(init r 8 kick_off_l)",  true,  8,  PlayMode.KICK_OFF_OTHER},
                {"(init r 9 kick_off_l)",  true,  9,  PlayMode.KICK_OFF_OTHER},
                {"(init r 10 kick_off_l)", true,  10, PlayMode.KICK_OFF_OTHER},
                {"(init r 11 kick_off_l)", true,  11, PlayMode.KICK_OFF_OTHER},
                // West team kick off other.
                {"(init l 1 kick_off_r)",  false, 1,  PlayMode.KICK_OFF_OTHER},
                {"(init l 2 kick_off_r)",  false, 2,  PlayMode.KICK_OFF_OTHER},
                {"(init l 3 kick_off_r)",  false, 3,  PlayMode.KICK_OFF_OTHER},
                {"(init l 4 kick_off_r)",  false, 4,  PlayMode.KICK_OFF_OTHER},
                {"(init l 5 kick_off_r)",  false, 5,  PlayMode.KICK_OFF_OTHER},
                {"(init l 6 kick_off_r)",  false, 6,  PlayMode.KICK_OFF_OTHER},
                {"(init l 7 kick_off_r)",  false, 7,  PlayMode.KICK_OFF_OTHER},
                {"(init l 8 kick_off_r)",  false, 8,  PlayMode.KICK_OFF_OTHER},
                {"(init l 9 kick_off_r)",  false, 9,  PlayMode.KICK_OFF_OTHER},
                {"(init l 10 kick_off_r)", false, 10, PlayMode.KICK_OFF_OTHER},
                {"(init l 11 kick_off_r)", false, 11, PlayMode.KICK_OFF_OTHER},

                // East team kick in own.
                {"(init r 1 kick_in_r)",  true,  1,  PlayMode.KICK_IN_OWN},
                {"(init r 2 kick_in_r)",  true,  2,  PlayMode.KICK_IN_OWN},
                {"(init r 3 kick_in_r)",  true,  3,  PlayMode.KICK_IN_OWN},
                {"(init r 4 kick_in_r)",  true,  4,  PlayMode.KICK_IN_OWN},
                {"(init r 5 kick_in_r)",  true,  5,  PlayMode.KICK_IN_OWN},
                {"(init r 6 kick_in_r)",  true,  6,  PlayMode.KICK_IN_OWN},
                {"(init r 7 kick_in_r)",  true,  7,  PlayMode.KICK_IN_OWN},
                {"(init r 8 kick_in_r)",  true,  8,  PlayMode.KICK_IN_OWN},
                {"(init r 9 kick_in_r)",  true,  9,  PlayMode.KICK_IN_OWN},
                {"(init r 10 kick_in_r)", true,  10, PlayMode.KICK_IN_OWN},
                {"(init r 11 kick_in_r)", true,  11, PlayMode.KICK_IN_OWN},
                // West team kick in own.
                {"(init l 1 kick_in_l)",  false, 1,  PlayMode.KICK_IN_OWN},
                {"(init l 2 kick_in_l)",  false, 2,  PlayMode.KICK_IN_OWN},
                {"(init l 3 kick_in_l)",  false, 3,  PlayMode.KICK_IN_OWN},
                {"(init l 4 kick_in_l)",  false, 4,  PlayMode.KICK_IN_OWN},
                {"(init l 5 kick_in_l)",  false, 5,  PlayMode.KICK_IN_OWN},
                {"(init l 6 kick_in_l)",  false, 6,  PlayMode.KICK_IN_OWN},
                {"(init l 7 kick_in_l)",  false, 7,  PlayMode.KICK_IN_OWN},
                {"(init l 8 kick_in_l)",  false, 8,  PlayMode.KICK_IN_OWN},
                {"(init l 9 kick_in_l)",  false, 9,  PlayMode.KICK_IN_OWN},
                {"(init l 10 kick_in_l)", false, 10, PlayMode.KICK_IN_OWN},
                {"(init l 11 kick_in_l)", false, 11, PlayMode.KICK_IN_OWN},

                // East team kick in other.
                {"(init r 1 kick_in_l)",  true,  1,  PlayMode.KICK_IN_OTHER},
                {"(init r 2 kick_in_l)",  true,  2,  PlayMode.KICK_IN_OTHER},
                {"(init r 3 kick_in_l)",  true,  3,  PlayMode.KICK_IN_OTHER},
                {"(init r 4 kick_in_l)",  true,  4,  PlayMode.KICK_IN_OTHER},
                {"(init r 5 kick_in_l)",  true,  5,  PlayMode.KICK_IN_OTHER},
                {"(init r 6 kick_in_l)",  true,  6,  PlayMode.KICK_IN_OTHER},
                {"(init r 7 kick_in_l)",  true,  7,  PlayMode.KICK_IN_OTHER},
                {"(init r 8 kick_in_l)",  true,  8,  PlayMode.KICK_IN_OTHER},
                {"(init r 9 kick_in_l)",  true,  9,  PlayMode.KICK_IN_OTHER},
                {"(init r 10 kick_in_l)", true,  10, PlayMode.KICK_IN_OTHER},
                {"(init r 11 kick_in_l)", true,  11, PlayMode.KICK_IN_OTHER},
                // West team kick in other.
                {"(init l 1 kick_in_r)",  false, 1,  PlayMode.KICK_IN_OTHER},
                {"(init l 2 kick_in_r)",  false, 2,  PlayMode.KICK_IN_OTHER},
                {"(init l 3 kick_in_r)",  false, 3,  PlayMode.KICK_IN_OTHER},
                {"(init l 4 kick_in_r)",  false, 4,  PlayMode.KICK_IN_OTHER},
                {"(init l 5 kick_in_r)",  false, 5,  PlayMode.KICK_IN_OTHER},
                {"(init l 6 kick_in_r)",  false, 6,  PlayMode.KICK_IN_OTHER},
                {"(init l 7 kick_in_r)",  false, 7,  PlayMode.KICK_IN_OTHER},
                {"(init l 8 kick_in_r)",  false, 8,  PlayMode.KICK_IN_OTHER},
                {"(init l 9 kick_in_r)",  false, 9,  PlayMode.KICK_IN_OTHER},
                {"(init l 10 kick_in_r)", false, 10, PlayMode.KICK_IN_OTHER},
                {"(init l 11 kick_in_r)", false, 11, PlayMode.KICK_IN_OTHER},

                // East team free kick own.
                {"(init r 1 free_kick_r)",  true,  1,  PlayMode.FREE_KICK_OWN},
                {"(init r 2 free_kick_r)",  true,  2,  PlayMode.FREE_KICK_OWN},
                {"(init r 3 free_kick_r)",  true,  3,  PlayMode.FREE_KICK_OWN},
                {"(init r 4 free_kick_r)",  true,  4,  PlayMode.FREE_KICK_OWN},
                {"(init r 5 free_kick_r)",  true,  5,  PlayMode.FREE_KICK_OWN},
                {"(init r 6 free_kick_r)",  true,  6,  PlayMode.FREE_KICK_OWN},
                {"(init r 7 free_kick_r)",  true,  7,  PlayMode.FREE_KICK_OWN},
                {"(init r 8 free_kick_r)",  true,  8,  PlayMode.FREE_KICK_OWN},
                {"(init r 9 free_kick_r)",  true,  9,  PlayMode.FREE_KICK_OWN},
                {"(init r 10 free_kick_r)", true,  10, PlayMode.FREE_KICK_OWN},
                {"(init r 11 free_kick_r)", true,  11, PlayMode.FREE_KICK_OWN},
                // West team free kick own.
                {"(init l 1 free_kick_l)",  false, 1,  PlayMode.FREE_KICK_OWN},
                {"(init l 2 free_kick_l)",  false, 2,  PlayMode.FREE_KICK_OWN},
                {"(init l 3 free_kick_l)",  false, 3,  PlayMode.FREE_KICK_OWN},
                {"(init l 4 free_kick_l)",  false, 4,  PlayMode.FREE_KICK_OWN},
                {"(init l 5 free_kick_l)",  false, 5,  PlayMode.FREE_KICK_OWN},
                {"(init l 6 free_kick_l)",  false, 6,  PlayMode.FREE_KICK_OWN},
                {"(init l 7 free_kick_l)",  false, 7,  PlayMode.FREE_KICK_OWN},
                {"(init l 8 free_kick_l)",  false, 8,  PlayMode.FREE_KICK_OWN},
                {"(init l 9 free_kick_l)",  false, 9,  PlayMode.FREE_KICK_OWN},
                {"(init l 10 free_kick_l)", false, 10, PlayMode.FREE_KICK_OWN},
                {"(init l 11 free_kick_l)", false, 11, PlayMode.FREE_KICK_OWN},

                // East team free kick other.
                {"(init r 1 free_kick_l)",  true,  1,  PlayMode.FREE_KICK_OTHER},
                {"(init r 2 free_kick_l)",  true,  2,  PlayMode.FREE_KICK_OTHER},
                {"(init r 3 free_kick_l)",  true,  3,  PlayMode.FREE_KICK_OTHER},
                {"(init r 4 free_kick_l)",  true,  4,  PlayMode.FREE_KICK_OTHER},
                {"(init r 5 free_kick_l)",  true,  5,  PlayMode.FREE_KICK_OTHER},
                {"(init r 6 free_kick_l)",  true,  6,  PlayMode.FREE_KICK_OTHER},
                {"(init r 7 free_kick_l)",  true,  7,  PlayMode.FREE_KICK_OTHER},
                {"(init r 8 free_kick_l)",  true,  8,  PlayMode.FREE_KICK_OTHER},
                {"(init r 9 free_kick_l)",  true,  9,  PlayMode.FREE_KICK_OTHER},
                {"(init r 10 free_kick_l)", true,  10, PlayMode.FREE_KICK_OTHER},
                {"(init r 11 free_kick_l)", true,  11, PlayMode.FREE_KICK_OTHER},
                // West team free kick other.
                {"(init l 1 free_kick_r)",  false, 1,  PlayMode.FREE_KICK_OTHER},
                {"(init l 2 free_kick_r)",  false, 2,  PlayMode.FREE_KICK_OTHER},
                {"(init l 3 free_kick_r)",  false, 3,  PlayMode.FREE_KICK_OTHER},
                {"(init l 4 free_kick_r)",  false, 4,  PlayMode.FREE_KICK_OTHER},
                {"(init l 5 free_kick_r)",  false, 5,  PlayMode.FREE_KICK_OTHER},
                {"(init l 6 free_kick_r)",  false, 6,  PlayMode.FREE_KICK_OTHER},
                {"(init l 7 free_kick_r)",  false, 7,  PlayMode.FREE_KICK_OTHER},
                {"(init l 8 free_kick_r)",  false, 8,  PlayMode.FREE_KICK_OTHER},
                {"(init l 9 free_kick_r)",  false, 9,  PlayMode.FREE_KICK_OTHER},
                {"(init l 10 free_kick_r)", false, 10, PlayMode.FREE_KICK_OTHER},
                {"(init l 11 free_kick_r)", false, 11, PlayMode.FREE_KICK_OTHER},

                // East team free kick fault own.
                {"(init r 1 free_kick_fault_r)",  true,  1,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init r 2 free_kick_fault_r)",  true,  2,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init r 3 free_kick_fault_r)",  true,  3,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init r 4 free_kick_fault_r)",  true,  4,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init r 5 free_kick_fault_r)",  true,  5,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init r 6 free_kick_fault_r)",  true,  6,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init r 7 free_kick_fault_r)",  true,  7,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init r 8 free_kick_fault_r)",  true,  8,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init r 9 free_kick_fault_r)",  true,  9,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init r 10 free_kick_fault_r)", true,  10, PlayMode.FREE_KICK_FAULT_OWN},
                {"(init r 11 free_kick_fault_r)", true,  11, PlayMode.FREE_KICK_FAULT_OWN},
                // West team free kick fault own.
                {"(init l 1 free_kick_fault_l)",  false, 1,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init l 2 free_kick_fault_l)",  false, 2,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init l 3 free_kick_fault_l)",  false, 3,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init l 4 free_kick_fault_l)",  false, 4,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init l 5 free_kick_fault_l)",  false, 5,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init l 6 free_kick_fault_l)",  false, 6,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init l 7 free_kick_fault_l)",  false, 7,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init l 8 free_kick_fault_l)",  false, 8,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init l 9 free_kick_fault_l)",  false, 9,  PlayMode.FREE_KICK_FAULT_OWN},
                {"(init l 10 free_kick_fault_l)", false, 10, PlayMode.FREE_KICK_FAULT_OWN},
                {"(init l 11 free_kick_fault_l)", false, 11, PlayMode.FREE_KICK_FAULT_OWN},

                // East team free kick fault other.
                {"(init r 1 free_kick_fault_l)",  true,  1,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init r 2 free_kick_fault_l)",  true,  2,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init r 3 free_kick_fault_l)",  true,  3,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init r 4 free_kick_fault_l)",  true,  4,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init r 5 free_kick_fault_l)",  true,  5,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init r 6 free_kick_fault_l)",  true,  6,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init r 7 free_kick_fault_l)",  true,  7,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init r 8 free_kick_fault_l)",  true,  8,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init r 9 free_kick_fault_l)",  true,  9,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init r 10 free_kick_fault_l)", true,  10, PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init r 11 free_kick_fault_l)", true,  11, PlayMode.FREE_KICK_FAULT_OTHER},
                // West team free kick fault other.
                {"(init l 1 free_kick_fault_r)",  false, 1,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init l 2 free_kick_fault_r)",  false, 2,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init l 3 free_kick_fault_r)",  false, 3,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init l 4 free_kick_fault_r)",  false, 4,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init l 5 free_kick_fault_r)",  false, 5,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init l 6 free_kick_fault_r)",  false, 6,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init l 7 free_kick_fault_r)",  false, 7,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init l 8 free_kick_fault_r)",  false, 8,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init l 9 free_kick_fault_r)",  false, 9,  PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init l 10 free_kick_fault_r)", false, 10, PlayMode.FREE_KICK_FAULT_OTHER},
                {"(init l 11 free_kick_fault_r)", false, 11, PlayMode.FREE_KICK_FAULT_OTHER},

                // East team corner kick own.
                {"(init r 1 corner_kick_r)",  true,  1,  PlayMode.CORNER_KICK_OWN},
                {"(init r 2 corner_kick_r)",  true,  2,  PlayMode.CORNER_KICK_OWN},
                {"(init r 3 corner_kick_r)",  true,  3,  PlayMode.CORNER_KICK_OWN},
                {"(init r 4 corner_kick_r)",  true,  4,  PlayMode.CORNER_KICK_OWN},
                {"(init r 5 corner_kick_r)",  true,  5,  PlayMode.CORNER_KICK_OWN},
                {"(init r 6 corner_kick_r)",  true,  6,  PlayMode.CORNER_KICK_OWN},
                {"(init r 7 corner_kick_r)",  true,  7,  PlayMode.CORNER_KICK_OWN},
                {"(init r 8 corner_kick_r)",  true,  8,  PlayMode.CORNER_KICK_OWN},
                {"(init r 9 corner_kick_r)",  true,  9,  PlayMode.CORNER_KICK_OWN},
                {"(init r 10 corner_kick_r)", true,  10, PlayMode.CORNER_KICK_OWN},
                {"(init r 11 corner_kick_r)", true,  11, PlayMode.CORNER_KICK_OWN},
                // West team corner kick own.
                {"(init l 1 corner_kick_l)",  false, 1,  PlayMode.CORNER_KICK_OWN},
                {"(init l 2 corner_kick_l)",  false, 2,  PlayMode.CORNER_KICK_OWN},
                {"(init l 3 corner_kick_l)",  false, 3,  PlayMode.CORNER_KICK_OWN},
                {"(init l 4 corner_kick_l)",  false, 4,  PlayMode.CORNER_KICK_OWN},
                {"(init l 5 corner_kick_l)",  false, 5,  PlayMode.CORNER_KICK_OWN},
                {"(init l 6 corner_kick_l)",  false, 6,  PlayMode.CORNER_KICK_OWN},
                {"(init l 7 corner_kick_l)",  false, 7,  PlayMode.CORNER_KICK_OWN},
                {"(init l 8 corner_kick_l)",  false, 8,  PlayMode.CORNER_KICK_OWN},
                {"(init l 9 corner_kick_l)",  false, 9,  PlayMode.CORNER_KICK_OWN},
                {"(init l 10 corner_kick_l)", false, 10, PlayMode.CORNER_KICK_OWN},
                {"(init l 11 corner_kick_l)", false, 11, PlayMode.CORNER_KICK_OWN},

                // East team corner kick other.
                {"(init r 1 corner_kick_l)",  true,  1,  PlayMode.CORNER_KICK_OTHER},
                {"(init r 2 corner_kick_l)",  true,  2,  PlayMode.CORNER_KICK_OTHER},
                {"(init r 3 corner_kick_l)",  true,  3,  PlayMode.CORNER_KICK_OTHER},
                {"(init r 4 corner_kick_l)",  true,  4,  PlayMode.CORNER_KICK_OTHER},
                {"(init r 5 corner_kick_l)",  true,  5,  PlayMode.CORNER_KICK_OTHER},
                {"(init r 6 corner_kick_l)",  true,  6,  PlayMode.CORNER_KICK_OTHER},
                {"(init r 7 corner_kick_l)",  true,  7,  PlayMode.CORNER_KICK_OTHER},
                {"(init r 8 corner_kick_l)",  true,  8,  PlayMode.CORNER_KICK_OTHER},
                {"(init r 9 corner_kick_l)",  true,  9,  PlayMode.CORNER_KICK_OTHER},
                {"(init r 10 corner_kick_l)", true,  10, PlayMode.CORNER_KICK_OTHER},
                {"(init r 11 corner_kick_l)", true,  11, PlayMode.CORNER_KICK_OTHER},
                // West team corner kick other.
                {"(init l 1 corner_kick_r)",  false, 1,  PlayMode.CORNER_KICK_OTHER},
                {"(init l 2 corner_kick_r)",  false, 2,  PlayMode.CORNER_KICK_OTHER},
                {"(init l 3 corner_kick_r)",  false, 3,  PlayMode.CORNER_KICK_OTHER},
                {"(init l 4 corner_kick_r)",  false, 4,  PlayMode.CORNER_KICK_OTHER},
                {"(init l 5 corner_kick_r)",  false, 5,  PlayMode.CORNER_KICK_OTHER},
                {"(init l 6 corner_kick_r)",  false, 6,  PlayMode.CORNER_KICK_OTHER},
                {"(init l 7 corner_kick_r)",  false, 7,  PlayMode.CORNER_KICK_OTHER},
                {"(init l 8 corner_kick_r)",  false, 8,  PlayMode.CORNER_KICK_OTHER},
                {"(init l 9 corner_kick_r)",  false, 9,  PlayMode.CORNER_KICK_OTHER},
                {"(init l 10 corner_kick_r)", false, 10, PlayMode.CORNER_KICK_OTHER},
                {"(init l 11 corner_kick_r)", false, 11, PlayMode.CORNER_KICK_OTHER},

                // East team goal kick own.
                {"(init r 1 goal_kick_r)",  true,  1,  PlayMode.GOAL_KICK_OWN},
                {"(init r 2 goal_kick_r)",  true,  2,  PlayMode.GOAL_KICK_OWN},
                {"(init r 3 goal_kick_r)",  true,  3,  PlayMode.GOAL_KICK_OWN},
                {"(init r 4 goal_kick_r)",  true,  4,  PlayMode.GOAL_KICK_OWN},
                {"(init r 5 goal_kick_r)",  true,  5,  PlayMode.GOAL_KICK_OWN},
                {"(init r 6 goal_kick_r)",  true,  6,  PlayMode.GOAL_KICK_OWN},
                {"(init r 7 goal_kick_r)",  true,  7,  PlayMode.GOAL_KICK_OWN},
                {"(init r 8 goal_kick_r)",  true,  8,  PlayMode.GOAL_KICK_OWN},
                {"(init r 9 goal_kick_r)",  true,  9,  PlayMode.GOAL_KICK_OWN},
                {"(init r 10 goal_kick_r)", true,  10, PlayMode.GOAL_KICK_OWN},
                {"(init r 11 goal_kick_r)", true,  11, PlayMode.GOAL_KICK_OWN},
                // West team goal kick own.
                {"(init l 1 goal_kick_l)",  false, 1,  PlayMode.GOAL_KICK_OWN},
                {"(init l 2 goal_kick_l)",  false, 2,  PlayMode.GOAL_KICK_OWN},
                {"(init l 3 goal_kick_l)",  false, 3,  PlayMode.GOAL_KICK_OWN},
                {"(init l 4 goal_kick_l)",  false, 4,  PlayMode.GOAL_KICK_OWN},
                {"(init l 5 goal_kick_l)",  false, 5,  PlayMode.GOAL_KICK_OWN},
                {"(init l 6 goal_kick_l)",  false, 6,  PlayMode.GOAL_KICK_OWN},
                {"(init l 7 goal_kick_l)",  false, 7,  PlayMode.GOAL_KICK_OWN},
                {"(init l 8 goal_kick_l)",  false, 8,  PlayMode.GOAL_KICK_OWN},
                {"(init l 9 goal_kick_l)",  false, 9,  PlayMode.GOAL_KICK_OWN},
                {"(init l 10 goal_kick_l)", false, 10, PlayMode.GOAL_KICK_OWN},
                {"(init l 11 goal_kick_l)", false, 11, PlayMode.GOAL_KICK_OWN},

                // East team goal kick other.
                {"(init r 1 goal_kick_l)",  true,  1,  PlayMode.GOAL_KICK_OTHER},
                {"(init r 2 goal_kick_l)",  true,  2,  PlayMode.GOAL_KICK_OTHER},
                {"(init r 3 goal_kick_l)",  true,  3,  PlayMode.GOAL_KICK_OTHER},
                {"(init r 4 goal_kick_l)",  true,  4,  PlayMode.GOAL_KICK_OTHER},
                {"(init r 5 goal_kick_l)",  true,  5,  PlayMode.GOAL_KICK_OTHER},
                {"(init r 6 goal_kick_l)",  true,  6,  PlayMode.GOAL_KICK_OTHER},
                {"(init r 7 goal_kick_l)",  true,  7,  PlayMode.GOAL_KICK_OTHER},
                {"(init r 8 goal_kick_l)",  true,  8,  PlayMode.GOAL_KICK_OTHER},
                {"(init r 9 goal_kick_l)",  true,  9,  PlayMode.GOAL_KICK_OTHER},
                {"(init r 10 goal_kick_l)", true,  10, PlayMode.GOAL_KICK_OTHER},
                {"(init r 11 goal_kick_l)", true,  11, PlayMode.GOAL_KICK_OTHER},
                // West team goal kick other.
                {"(init l 1 goal_kick_r)",  false, 1,  PlayMode.GOAL_KICK_OTHER},
                {"(init l 2 goal_kick_r)",  false, 2,  PlayMode.GOAL_KICK_OTHER},
                {"(init l 3 goal_kick_r)",  false, 3,  PlayMode.GOAL_KICK_OTHER},
                {"(init l 4 goal_kick_r)",  false, 4,  PlayMode.GOAL_KICK_OTHER},
                {"(init l 5 goal_kick_r)",  false, 5,  PlayMode.GOAL_KICK_OTHER},
                {"(init l 6 goal_kick_r)",  false, 6,  PlayMode.GOAL_KICK_OTHER},
                {"(init l 7 goal_kick_r)",  false, 7,  PlayMode.GOAL_KICK_OTHER},
                {"(init l 8 goal_kick_r)",  false, 8,  PlayMode.GOAL_KICK_OTHER},
                {"(init l 9 goal_kick_r)",  false, 9,  PlayMode.GOAL_KICK_OTHER},
                {"(init l 10 goal_kick_r)", false, 10, PlayMode.GOAL_KICK_OTHER},
                {"(init l 11 goal_kick_r)", false, 11, PlayMode.GOAL_KICK_OTHER},

                // East team goal own.
                {"(init r 1 goal_r_1)",  true,  1,  PlayMode.GOAL_OWN},
                {"(init r 2 goal_r_1)",  true,  2,  PlayMode.GOAL_OWN},
                {"(init r 3 goal_r_1)",  true,  3,  PlayMode.GOAL_OWN},
                {"(init r 4 goal_r_1)",  true,  4,  PlayMode.GOAL_OWN},
                {"(init r 5 goal_r_1)",  true,  5,  PlayMode.GOAL_OWN},
                {"(init r 6 goal_r_1)",  true,  6,  PlayMode.GOAL_OWN},
                {"(init r 7 goal_r_1)",  true,  7,  PlayMode.GOAL_OWN},
                {"(init r 8 goal_r_1)",  true,  8,  PlayMode.GOAL_OWN},
                {"(init r 9 goal_r_1)",  true,  9,  PlayMode.GOAL_OWN},
                {"(init r 10 goal_r_1)", true,  10, PlayMode.GOAL_OWN},
                {"(init r 11 goal_r_1)", true,  11, PlayMode.GOAL_OWN},
                {"(init r 1 goal_r_2)",  true,  1,  PlayMode.GOAL_OWN},
                {"(init r 2 goal_r_2)",  true,  2,  PlayMode.GOAL_OWN},
                {"(init r 3 goal_r_2)",  true,  3,  PlayMode.GOAL_OWN},
                {"(init r 4 goal_r_2)",  true,  4,  PlayMode.GOAL_OWN},
                {"(init r 5 goal_r_2)",  true,  5,  PlayMode.GOAL_OWN},
                {"(init r 6 goal_r_2)",  true,  6,  PlayMode.GOAL_OWN},
                {"(init r 7 goal_r_2)",  true,  7,  PlayMode.GOAL_OWN},
                {"(init r 8 goal_r_2)",  true,  8,  PlayMode.GOAL_OWN},
                {"(init r 9 goal_r_2)",  true,  9,  PlayMode.GOAL_OWN},
                {"(init r 10 goal_r_2)", true,  10, PlayMode.GOAL_OWN},
                {"(init r 11 goal_r_2)", true,  11, PlayMode.GOAL_OWN},
                {"(init r 1 goal_r_3)",  true,  1,  PlayMode.GOAL_OWN},
                {"(init r 2 goal_r_3)",  true,  2,  PlayMode.GOAL_OWN},
                {"(init r 3 goal_r_3)",  true,  3,  PlayMode.GOAL_OWN},
                {"(init r 4 goal_r_3)",  true,  4,  PlayMode.GOAL_OWN},
                {"(init r 5 goal_r_3)",  true,  5,  PlayMode.GOAL_OWN},
                {"(init r 6 goal_r_3)",  true,  6,  PlayMode.GOAL_OWN},
                {"(init r 7 goal_r_3)",  true,  7,  PlayMode.GOAL_OWN},
                {"(init r 8 goal_r_3)",  true,  8,  PlayMode.GOAL_OWN},
                {"(init r 9 goal_r_3)",  true,  9,  PlayMode.GOAL_OWN},
                {"(init r 10 goal_r_3)", true,  10, PlayMode.GOAL_OWN},
                {"(init r 11 goal_r_3)", true,  11, PlayMode.GOAL_OWN},
                {"(init r 1 goal_r_4)",  true,  1,  PlayMode.GOAL_OWN},
                {"(init r 2 goal_r_4)",  true,  2,  PlayMode.GOAL_OWN},
                {"(init r 3 goal_r_4)",  true,  3,  PlayMode.GOAL_OWN},
                {"(init r 4 goal_r_4)",  true,  4,  PlayMode.GOAL_OWN},
                {"(init r 5 goal_r_4)",  true,  5,  PlayMode.GOAL_OWN},
                {"(init r 6 goal_r_4)",  true,  6,  PlayMode.GOAL_OWN},
                {"(init r 7 goal_r_4)",  true,  7,  PlayMode.GOAL_OWN},
                {"(init r 8 goal_r_4)",  true,  8,  PlayMode.GOAL_OWN},
                {"(init r 9 goal_r_4)",  true,  9,  PlayMode.GOAL_OWN},
                {"(init r 10 goal_r_4)", true,  10, PlayMode.GOAL_OWN},
                {"(init r 11 goal_r_4)", true,  11, PlayMode.GOAL_OWN},
                {"(init r 1 goal_r_5)",  true,  1,  PlayMode.GOAL_OWN},
                {"(init r 2 goal_r_5)",  true,  2,  PlayMode.GOAL_OWN},
                {"(init r 3 goal_r_5)",  true,  3,  PlayMode.GOAL_OWN},
                {"(init r 4 goal_r_5)",  true,  4,  PlayMode.GOAL_OWN},
                {"(init r 5 goal_r_5)",  true,  5,  PlayMode.GOAL_OWN},
                {"(init r 6 goal_r_5)",  true,  6,  PlayMode.GOAL_OWN},
                {"(init r 7 goal_r_5)",  true,  7,  PlayMode.GOAL_OWN},
                {"(init r 8 goal_r_5)",  true,  8,  PlayMode.GOAL_OWN},
                {"(init r 9 goal_r_5)",  true,  9,  PlayMode.GOAL_OWN},
                {"(init r 10 goal_r_5)", true,  10, PlayMode.GOAL_OWN},
                {"(init r 11 goal_r_5)", true,  11, PlayMode.GOAL_OWN},
                {"(init r 1 goal_r_6)",  true,  1,  PlayMode.GOAL_OWN},
                {"(init r 2 goal_r_6)",  true,  2,  PlayMode.GOAL_OWN},
                {"(init r 3 goal_r_6)",  true,  3,  PlayMode.GOAL_OWN},
                {"(init r 4 goal_r_6)",  true,  4,  PlayMode.GOAL_OWN},
                {"(init r 5 goal_r_6)",  true,  5,  PlayMode.GOAL_OWN},
                {"(init r 6 goal_r_6)",  true,  6,  PlayMode.GOAL_OWN},
                {"(init r 7 goal_r_6)",  true,  7,  PlayMode.GOAL_OWN},
                {"(init r 8 goal_r_6)",  true,  8,  PlayMode.GOAL_OWN},
                {"(init r 9 goal_r_6)",  true,  9,  PlayMode.GOAL_OWN},
                {"(init r 10 goal_r_6)", true,  10, PlayMode.GOAL_OWN},
                {"(init r 11 goal_r_6)", true,  11, PlayMode.GOAL_OWN},
                {"(init r 1 goal_r_7)",  true,  1,  PlayMode.GOAL_OWN},
                {"(init r 2 goal_r_7)",  true,  2,  PlayMode.GOAL_OWN},
                {"(init r 3 goal_r_7)",  true,  3,  PlayMode.GOAL_OWN},
                {"(init r 4 goal_r_7)",  true,  4,  PlayMode.GOAL_OWN},
                {"(init r 5 goal_r_7)",  true,  5,  PlayMode.GOAL_OWN},
                {"(init r 6 goal_r_7)",  true,  6,  PlayMode.GOAL_OWN},
                {"(init r 7 goal_r_7)",  true,  7,  PlayMode.GOAL_OWN},
                {"(init r 8 goal_r_7)",  true,  8,  PlayMode.GOAL_OWN},
                {"(init r 9 goal_r_7)",  true,  9,  PlayMode.GOAL_OWN},
                {"(init r 10 goal_r_7)", true,  10, PlayMode.GOAL_OWN},
                {"(init r 11 goal_r_7)", true,  11, PlayMode.GOAL_OWN},
                {"(init r 1 goal_r_8)",  true,  1,  PlayMode.GOAL_OWN},
                {"(init r 2 goal_r_8)",  true,  2,  PlayMode.GOAL_OWN},
                {"(init r 3 goal_r_8)",  true,  3,  PlayMode.GOAL_OWN},
                {"(init r 4 goal_r_8)",  true,  4,  PlayMode.GOAL_OWN},
                {"(init r 5 goal_r_8)",  true,  5,  PlayMode.GOAL_OWN},
                {"(init r 6 goal_r_8)",  true,  6,  PlayMode.GOAL_OWN},
                {"(init r 7 goal_r_8)",  true,  7,  PlayMode.GOAL_OWN},
                {"(init r 8 goal_r_8)",  true,  8,  PlayMode.GOAL_OWN},
                {"(init r 9 goal_r_8)",  true,  9,  PlayMode.GOAL_OWN},
                {"(init r 10 goal_r_8)", true,  10, PlayMode.GOAL_OWN},
                {"(init r 11 goal_r_8)", true,  11, PlayMode.GOAL_OWN},
                {"(init r 1 goal_r_9)",  true,  1,  PlayMode.GOAL_OWN},
                {"(init r 2 goal_r_9)",  true,  2,  PlayMode.GOAL_OWN},
                {"(init r 3 goal_r_9)",  true,  3,  PlayMode.GOAL_OWN},
                {"(init r 4 goal_r_9)",  true,  4,  PlayMode.GOAL_OWN},
                {"(init r 5 goal_r_9)",  true,  5,  PlayMode.GOAL_OWN},
                {"(init r 6 goal_r_9)",  true,  6,  PlayMode.GOAL_OWN},
                {"(init r 7 goal_r_9)",  true,  7,  PlayMode.GOAL_OWN},
                {"(init r 8 goal_r_9)",  true,  8,  PlayMode.GOAL_OWN},
                {"(init r 9 goal_r_9)",  true,  9,  PlayMode.GOAL_OWN},
                {"(init r 10 goal_r_9)", true,  10, PlayMode.GOAL_OWN},
                {"(init r 11 goal_r_9)", true,  11, PlayMode.GOAL_OWN},
                {"(init r 1 goal_r_10)",  true,  1,  PlayMode.GOAL_OWN},
                {"(init r 2 goal_r_10)",  true,  2,  PlayMode.GOAL_OWN},
                {"(init r 3 goal_r_10)",  true,  3,  PlayMode.GOAL_OWN},
                {"(init r 4 goal_r_10)",  true,  4,  PlayMode.GOAL_OWN},
                {"(init r 5 goal_r_10)",  true,  5,  PlayMode.GOAL_OWN},
                {"(init r 6 goal_r_10)",  true,  6,  PlayMode.GOAL_OWN},
                {"(init r 7 goal_r_10)",  true,  7,  PlayMode.GOAL_OWN},
                {"(init r 8 goal_r_10)",  true,  8,  PlayMode.GOAL_OWN},
                {"(init r 9 goal_r_10)",  true,  9,  PlayMode.GOAL_OWN},
                {"(init r 10 goal_r_10)", true,  10, PlayMode.GOAL_OWN},
                {"(init r 11 goal_r_10)", true,  11, PlayMode.GOAL_OWN},
                {"(init r 1 goal_r_11)",  true,  1,  PlayMode.GOAL_OWN},
                {"(init r 2 goal_r_11)",  true,  2,  PlayMode.GOAL_OWN},
                {"(init r 3 goal_r_11)",  true,  3,  PlayMode.GOAL_OWN},
                {"(init r 4 goal_r_11)",  true,  4,  PlayMode.GOAL_OWN},
                {"(init r 5 goal_r_11)",  true,  5,  PlayMode.GOAL_OWN},
                {"(init r 6 goal_r_11)",  true,  6,  PlayMode.GOAL_OWN},
                {"(init r 7 goal_r_11)",  true,  7,  PlayMode.GOAL_OWN},
                {"(init r 8 goal_r_11)",  true,  8,  PlayMode.GOAL_OWN},
                {"(init r 9 goal_r_11)",  true,  9,  PlayMode.GOAL_OWN},
                {"(init r 10 goal_r_11)", true,  10, PlayMode.GOAL_OWN},
                {"(init r 11 goal_r_11)", true,  11, PlayMode.GOAL_OWN},
                // West team goal own.
                {"(init l 1 goal_l_1)",  false,  1,  PlayMode.GOAL_OWN},
                {"(init l 2 goal_l_1)",  false,  2,  PlayMode.GOAL_OWN},
                {"(init l 3 goal_l_1)",  false,  3,  PlayMode.GOAL_OWN},
                {"(init l 4 goal_l_1)",  false,  4,  PlayMode.GOAL_OWN},
                {"(init l 5 goal_l_1)",  false,  5,  PlayMode.GOAL_OWN},
                {"(init l 6 goal_l_1)",  false,  6,  PlayMode.GOAL_OWN},
                {"(init l 7 goal_l_1)",  false,  7,  PlayMode.GOAL_OWN},
                {"(init l 8 goal_l_1)",  false,  8,  PlayMode.GOAL_OWN},
                {"(init l 9 goal_l_1)",  false,  9,  PlayMode.GOAL_OWN},
                {"(init l 10 goal_l_1)", false,  10, PlayMode.GOAL_OWN},
                {"(init l 11 goal_l_1)", false,  11, PlayMode.GOAL_OWN},
                {"(init l 1 goal_l_2)",  false,  1,  PlayMode.GOAL_OWN},
                {"(init l 2 goal_l_2)",  false,  2,  PlayMode.GOAL_OWN},
                {"(init l 3 goal_l_2)",  false,  3,  PlayMode.GOAL_OWN},
                {"(init l 4 goal_l_2)",  false,  4,  PlayMode.GOAL_OWN},
                {"(init l 5 goal_l_2)",  false,  5,  PlayMode.GOAL_OWN},
                {"(init l 6 goal_l_2)",  false,  6,  PlayMode.GOAL_OWN},
                {"(init l 7 goal_l_2)",  false,  7,  PlayMode.GOAL_OWN},
                {"(init l 8 goal_l_2)",  false,  8,  PlayMode.GOAL_OWN},
                {"(init l 9 goal_l_2)",  false,  9,  PlayMode.GOAL_OWN},
                {"(init l 10 goal_l_2)", false,  10, PlayMode.GOAL_OWN},
                {"(init l 11 goal_l_2)", false,  11, PlayMode.GOAL_OWN},
                {"(init l 1 goal_l_3)",  false,  1,  PlayMode.GOAL_OWN},
                {"(init l 2 goal_l_3)",  false,  2,  PlayMode.GOAL_OWN},
                {"(init l 3 goal_l_3)",  false,  3,  PlayMode.GOAL_OWN},
                {"(init l 4 goal_l_3)",  false,  4,  PlayMode.GOAL_OWN},
                {"(init l 5 goal_l_3)",  false,  5,  PlayMode.GOAL_OWN},
                {"(init l 6 goal_l_3)",  false,  6,  PlayMode.GOAL_OWN},
                {"(init l 7 goal_l_3)",  false,  7,  PlayMode.GOAL_OWN},
                {"(init l 8 goal_l_3)",  false,  8,  PlayMode.GOAL_OWN},
                {"(init l 9 goal_l_3)",  false,  9,  PlayMode.GOAL_OWN},
                {"(init l 10 goal_l_3)", false,  10, PlayMode.GOAL_OWN},
                {"(init l 11 goal_l_3)", false,  11, PlayMode.GOAL_OWN},
                {"(init l 1 goal_l_4)",  false,  1,  PlayMode.GOAL_OWN},
                {"(init l 2 goal_l_4)",  false,  2,  PlayMode.GOAL_OWN},
                {"(init l 3 goal_l_4)",  false,  3,  PlayMode.GOAL_OWN},
                {"(init l 4 goal_l_4)",  false,  4,  PlayMode.GOAL_OWN},
                {"(init l 5 goal_l_4)",  false,  5,  PlayMode.GOAL_OWN},
                {"(init l 6 goal_l_4)",  false,  6,  PlayMode.GOAL_OWN},
                {"(init l 7 goal_l_4)",  false,  7,  PlayMode.GOAL_OWN},
                {"(init l 8 goal_l_4)",  false,  8,  PlayMode.GOAL_OWN},
                {"(init l 9 goal_l_4)",  false,  9,  PlayMode.GOAL_OWN},
                {"(init l 10 goal_l_4)", false,  10, PlayMode.GOAL_OWN},
                {"(init l 11 goal_l_4)", false,  11, PlayMode.GOAL_OWN},
                {"(init l 1 goal_l_5)",  false,  1,  PlayMode.GOAL_OWN},
                {"(init l 2 goal_l_5)",  false,  2,  PlayMode.GOAL_OWN},
                {"(init l 3 goal_l_5)",  false,  3,  PlayMode.GOAL_OWN},
                {"(init l 4 goal_l_5)",  false,  4,  PlayMode.GOAL_OWN},
                {"(init l 5 goal_l_5)",  false,  5,  PlayMode.GOAL_OWN},
                {"(init l 6 goal_l_5)",  false,  6,  PlayMode.GOAL_OWN},
                {"(init l 7 goal_l_5)",  false,  7,  PlayMode.GOAL_OWN},
                {"(init l 8 goal_l_5)",  false,  8,  PlayMode.GOAL_OWN},
                {"(init l 9 goal_l_5)",  false,  9,  PlayMode.GOAL_OWN},
                {"(init l 10 goal_l_5)", false,  10, PlayMode.GOAL_OWN},
                {"(init l 11 goal_l_5)", false,  11, PlayMode.GOAL_OWN},
                {"(init l 1 goal_l_6)",  false,  1,  PlayMode.GOAL_OWN},
                {"(init l 2 goal_l_6)",  false,  2,  PlayMode.GOAL_OWN},
                {"(init l 3 goal_l_6)",  false,  3,  PlayMode.GOAL_OWN},
                {"(init l 4 goal_l_6)",  false,  4,  PlayMode.GOAL_OWN},
                {"(init l 5 goal_l_6)",  false,  5,  PlayMode.GOAL_OWN},
                {"(init l 6 goal_l_6)",  false,  6,  PlayMode.GOAL_OWN},
                {"(init l 7 goal_l_6)",  false,  7,  PlayMode.GOAL_OWN},
                {"(init l 8 goal_l_6)",  false,  8,  PlayMode.GOAL_OWN},
                {"(init l 9 goal_l_6)",  false,  9,  PlayMode.GOAL_OWN},
                {"(init l 10 goal_l_6)", false,  10, PlayMode.GOAL_OWN},
                {"(init l 11 goal_l_6)", false,  11, PlayMode.GOAL_OWN},
                {"(init l 1 goal_l_7)",  false,  1,  PlayMode.GOAL_OWN},
                {"(init l 2 goal_l_7)",  false,  2,  PlayMode.GOAL_OWN},
                {"(init l 3 goal_l_7)",  false,  3,  PlayMode.GOAL_OWN},
                {"(init l 4 goal_l_7)",  false,  4,  PlayMode.GOAL_OWN},
                {"(init l 5 goal_l_7)",  false,  5,  PlayMode.GOAL_OWN},
                {"(init l 6 goal_l_7)",  false,  6,  PlayMode.GOAL_OWN},
                {"(init l 7 goal_l_7)",  false,  7,  PlayMode.GOAL_OWN},
                {"(init l 8 goal_l_7)",  false,  8,  PlayMode.GOAL_OWN},
                {"(init l 9 goal_l_7)",  false,  9,  PlayMode.GOAL_OWN},
                {"(init l 10 goal_l_7)", false,  10, PlayMode.GOAL_OWN},
                {"(init l 11 goal_l_7)", false,  11, PlayMode.GOAL_OWN},
                {"(init l 1 goal_l_8)",  false,  1,  PlayMode.GOAL_OWN},
                {"(init l 2 goal_l_8)",  false,  2,  PlayMode.GOAL_OWN},
                {"(init l 3 goal_l_8)",  false,  3,  PlayMode.GOAL_OWN},
                {"(init l 4 goal_l_8)",  false,  4,  PlayMode.GOAL_OWN},
                {"(init l 5 goal_l_8)",  false,  5,  PlayMode.GOAL_OWN},
                {"(init l 6 goal_l_8)",  false,  6,  PlayMode.GOAL_OWN},
                {"(init l 7 goal_l_8)",  false,  7,  PlayMode.GOAL_OWN},
                {"(init l 8 goal_l_8)",  false,  8,  PlayMode.GOAL_OWN},
                {"(init l 9 goal_l_8)",  false,  9,  PlayMode.GOAL_OWN},
                {"(init l 10 goal_l_8)", false,  10, PlayMode.GOAL_OWN},
                {"(init l 11 goal_l_8)", false,  11, PlayMode.GOAL_OWN},
                {"(init l 1 goal_l_9)",  false,  1,  PlayMode.GOAL_OWN},
                {"(init l 2 goal_l_9)",  false,  2,  PlayMode.GOAL_OWN},
                {"(init l 3 goal_l_9)",  false,  3,  PlayMode.GOAL_OWN},
                {"(init l 4 goal_l_9)",  false,  4,  PlayMode.GOAL_OWN},
                {"(init l 5 goal_l_9)",  false,  5,  PlayMode.GOAL_OWN},
                {"(init l 6 goal_l_9)",  false,  6,  PlayMode.GOAL_OWN},
                {"(init l 7 goal_l_9)",  false,  7,  PlayMode.GOAL_OWN},
                {"(init l 8 goal_l_9)",  false,  8,  PlayMode.GOAL_OWN},
                {"(init l 9 goal_l_9)",  false,  9,  PlayMode.GOAL_OWN},
                {"(init l 10 goal_l_9)", false,  10, PlayMode.GOAL_OWN},
                {"(init l 11 goal_l_9)", false,  11, PlayMode.GOAL_OWN},
                {"(init l 1 goal_l_10)",  false,  1,  PlayMode.GOAL_OWN},
                {"(init l 2 goal_l_10)",  false,  2,  PlayMode.GOAL_OWN},
                {"(init l 3 goal_l_10)",  false,  3,  PlayMode.GOAL_OWN},
                {"(init l 4 goal_l_10)",  false,  4,  PlayMode.GOAL_OWN},
                {"(init l 5 goal_l_10)",  false,  5,  PlayMode.GOAL_OWN},
                {"(init l 6 goal_l_10)",  false,  6,  PlayMode.GOAL_OWN},
                {"(init l 7 goal_l_10)",  false,  7,  PlayMode.GOAL_OWN},
                {"(init l 8 goal_l_10)",  false,  8,  PlayMode.GOAL_OWN},
                {"(init l 9 goal_l_10)",  false,  9,  PlayMode.GOAL_OWN},
                {"(init l 10 goal_l_10)", false,  10, PlayMode.GOAL_OWN},
                {"(init l 11 goal_l_10)", false,  11, PlayMode.GOAL_OWN},
                {"(init l 1 goal_l_11)",  false,  1,  PlayMode.GOAL_OWN},
                {"(init l 2 goal_l_11)",  false,  2,  PlayMode.GOAL_OWN},
                {"(init l 3 goal_l_11)",  false,  3,  PlayMode.GOAL_OWN},
                {"(init l 4 goal_l_11)",  false,  4,  PlayMode.GOAL_OWN},
                {"(init l 5 goal_l_11)",  false,  5,  PlayMode.GOAL_OWN},
                {"(init l 6 goal_l_11)",  false,  6,  PlayMode.GOAL_OWN},
                {"(init l 7 goal_l_11)",  false,  7,  PlayMode.GOAL_OWN},
                {"(init l 8 goal_l_11)",  false,  8,  PlayMode.GOAL_OWN},
                {"(init l 9 goal_l_11)",  false,  9,  PlayMode.GOAL_OWN},
                {"(init l 10 goal_l_11)", false,  10, PlayMode.GOAL_OWN},
                {"(init l 11 goal_l_11)", false,  11, PlayMode.GOAL_OWN},

                // East team goal other.
                {"(init r 1 goal_l_1)",  true,  1,  PlayMode.GOAL_OTHER},
                {"(init r 2 goal_l_1)",  true,  2,  PlayMode.GOAL_OTHER},
                {"(init r 3 goal_l_1)",  true,  3,  PlayMode.GOAL_OTHER},
                {"(init r 4 goal_l_1)",  true,  4,  PlayMode.GOAL_OTHER},
                {"(init r 5 goal_l_1)",  true,  5,  PlayMode.GOAL_OTHER},
                {"(init r 6 goal_l_1)",  true,  6,  PlayMode.GOAL_OTHER},
                {"(init r 7 goal_l_1)",  true,  7,  PlayMode.GOAL_OTHER},
                {"(init r 8 goal_l_1)",  true,  8,  PlayMode.GOAL_OTHER},
                {"(init r 9 goal_l_1)",  true,  9,  PlayMode.GOAL_OTHER},
                {"(init r 10 goal_l_1)", true,  10, PlayMode.GOAL_OTHER},
                {"(init r 11 goal_l_1)", true,  11, PlayMode.GOAL_OTHER},
                {"(init r 1 goal_l_2)",  true,  1,  PlayMode.GOAL_OTHER},
                {"(init r 2 goal_l_2)",  true,  2,  PlayMode.GOAL_OTHER},
                {"(init r 3 goal_l_2)",  true,  3,  PlayMode.GOAL_OTHER},
                {"(init r 4 goal_l_2)",  true,  4,  PlayMode.GOAL_OTHER},
                {"(init r 5 goal_l_2)",  true,  5,  PlayMode.GOAL_OTHER},
                {"(init r 6 goal_l_2)",  true,  6,  PlayMode.GOAL_OTHER},
                {"(init r 7 goal_l_2)",  true,  7,  PlayMode.GOAL_OTHER},
                {"(init r 8 goal_l_2)",  true,  8,  PlayMode.GOAL_OTHER},
                {"(init r 9 goal_l_2)",  true,  9,  PlayMode.GOAL_OTHER},
                {"(init r 10 goal_l_2)", true,  10, PlayMode.GOAL_OTHER},
                {"(init r 11 goal_l_2)", true,  11, PlayMode.GOAL_OTHER},
                {"(init r 1 goal_l_3)",  true,  1,  PlayMode.GOAL_OTHER},
                {"(init r 2 goal_l_3)",  true,  2,  PlayMode.GOAL_OTHER},
                {"(init r 3 goal_l_3)",  true,  3,  PlayMode.GOAL_OTHER},
                {"(init r 4 goal_l_3)",  true,  4,  PlayMode.GOAL_OTHER},
                {"(init r 5 goal_l_3)",  true,  5,  PlayMode.GOAL_OTHER},
                {"(init r 6 goal_l_3)",  true,  6,  PlayMode.GOAL_OTHER},
                {"(init r 7 goal_l_3)",  true,  7,  PlayMode.GOAL_OTHER},
                {"(init r 8 goal_l_3)",  true,  8,  PlayMode.GOAL_OTHER},
                {"(init r 9 goal_l_3)",  true,  9,  PlayMode.GOAL_OTHER},
                {"(init r 10 goal_l_3)", true,  10, PlayMode.GOAL_OTHER},
                {"(init r 11 goal_l_3)", true,  11, PlayMode.GOAL_OTHER},
                {"(init r 1 goal_l_4)",  true,  1,  PlayMode.GOAL_OTHER},
                {"(init r 2 goal_l_4)",  true,  2,  PlayMode.GOAL_OTHER},
                {"(init r 3 goal_l_4)",  true,  3,  PlayMode.GOAL_OTHER},
                {"(init r 4 goal_l_4)",  true,  4,  PlayMode.GOAL_OTHER},
                {"(init r 5 goal_l_4)",  true,  5,  PlayMode.GOAL_OTHER},
                {"(init r 6 goal_l_4)",  true,  6,  PlayMode.GOAL_OTHER},
                {"(init r 7 goal_l_4)",  true,  7,  PlayMode.GOAL_OTHER},
                {"(init r 8 goal_l_4)",  true,  8,  PlayMode.GOAL_OTHER},
                {"(init r 9 goal_l_4)",  true,  9,  PlayMode.GOAL_OTHER},
                {"(init r 10 goal_l_4)", true,  10, PlayMode.GOAL_OTHER},
                {"(init r 11 goal_l_4)", true,  11, PlayMode.GOAL_OTHER},
                {"(init r 1 goal_l_5)",  true,  1,  PlayMode.GOAL_OTHER},
                {"(init r 2 goal_l_5)",  true,  2,  PlayMode.GOAL_OTHER},
                {"(init r 3 goal_l_5)",  true,  3,  PlayMode.GOAL_OTHER},
                {"(init r 4 goal_l_5)",  true,  4,  PlayMode.GOAL_OTHER},
                {"(init r 5 goal_l_5)",  true,  5,  PlayMode.GOAL_OTHER},
                {"(init r 6 goal_l_5)",  true,  6,  PlayMode.GOAL_OTHER},
                {"(init r 7 goal_l_5)",  true,  7,  PlayMode.GOAL_OTHER},
                {"(init r 8 goal_l_5)",  true,  8,  PlayMode.GOAL_OTHER},
                {"(init r 9 goal_l_5)",  true,  9,  PlayMode.GOAL_OTHER},
                {"(init r 10 goal_l_5)", true,  10, PlayMode.GOAL_OTHER},
                {"(init r 11 goal_l_5)", true,  11, PlayMode.GOAL_OTHER},
                {"(init r 1 goal_l_6)",  true,  1,  PlayMode.GOAL_OTHER},
                {"(init r 2 goal_l_6)",  true,  2,  PlayMode.GOAL_OTHER},
                {"(init r 3 goal_l_6)",  true,  3,  PlayMode.GOAL_OTHER},
                {"(init r 4 goal_l_6)",  true,  4,  PlayMode.GOAL_OTHER},
                {"(init r 5 goal_l_6)",  true,  5,  PlayMode.GOAL_OTHER},
                {"(init r 6 goal_l_6)",  true,  6,  PlayMode.GOAL_OTHER},
                {"(init r 7 goal_l_6)",  true,  7,  PlayMode.GOAL_OTHER},
                {"(init r 8 goal_l_6)",  true,  8,  PlayMode.GOAL_OTHER},
                {"(init r 9 goal_l_6)",  true,  9,  PlayMode.GOAL_OTHER},
                {"(init r 10 goal_l_6)", true,  10, PlayMode.GOAL_OTHER},
                {"(init r 11 goal_l_6)", true,  11, PlayMode.GOAL_OTHER},
                {"(init r 1 goal_l_7)",  true,  1,  PlayMode.GOAL_OTHER},
                {"(init r 2 goal_l_7)",  true,  2,  PlayMode.GOAL_OTHER},
                {"(init r 3 goal_l_7)",  true,  3,  PlayMode.GOAL_OTHER},
                {"(init r 4 goal_l_7)",  true,  4,  PlayMode.GOAL_OTHER},
                {"(init r 5 goal_l_7)",  true,  5,  PlayMode.GOAL_OTHER},
                {"(init r 6 goal_l_7)",  true,  6,  PlayMode.GOAL_OTHER},
                {"(init r 7 goal_l_7)",  true,  7,  PlayMode.GOAL_OTHER},
                {"(init r 8 goal_l_7)",  true,  8,  PlayMode.GOAL_OTHER},
                {"(init r 9 goal_l_7)",  true,  9,  PlayMode.GOAL_OTHER},
                {"(init r 10 goal_l_7)", true,  10, PlayMode.GOAL_OTHER},
                {"(init r 11 goal_l_7)", true,  11, PlayMode.GOAL_OTHER},
                {"(init r 1 goal_l_8)",  true,  1,  PlayMode.GOAL_OTHER},
                {"(init r 2 goal_l_8)",  true,  2,  PlayMode.GOAL_OTHER},
                {"(init r 3 goal_l_8)",  true,  3,  PlayMode.GOAL_OTHER},
                {"(init r 4 goal_l_8)",  true,  4,  PlayMode.GOAL_OTHER},
                {"(init r 5 goal_l_8)",  true,  5,  PlayMode.GOAL_OTHER},
                {"(init r 6 goal_l_8)",  true,  6,  PlayMode.GOAL_OTHER},
                {"(init r 7 goal_l_8)",  true,  7,  PlayMode.GOAL_OTHER},
                {"(init r 8 goal_l_8)",  true,  8,  PlayMode.GOAL_OTHER},
                {"(init r 9 goal_l_8)",  true,  9,  PlayMode.GOAL_OTHER},
                {"(init r 10 goal_l_8)", true,  10, PlayMode.GOAL_OTHER},
                {"(init r 11 goal_l_8)", true,  11, PlayMode.GOAL_OTHER},
                {"(init r 1 goal_l_9)",  true,  1,  PlayMode.GOAL_OTHER},
                {"(init r 2 goal_l_9)",  true,  2,  PlayMode.GOAL_OTHER},
                {"(init r 3 goal_l_9)",  true,  3,  PlayMode.GOAL_OTHER},
                {"(init r 4 goal_l_9)",  true,  4,  PlayMode.GOAL_OTHER},
                {"(init r 5 goal_l_9)",  true,  5,  PlayMode.GOAL_OTHER},
                {"(init r 6 goal_l_9)",  true,  6,  PlayMode.GOAL_OTHER},
                {"(init r 7 goal_l_9)",  true,  7,  PlayMode.GOAL_OTHER},
                {"(init r 8 goal_l_9)",  true,  8,  PlayMode.GOAL_OTHER},
                {"(init r 9 goal_l_9)",  true,  9,  PlayMode.GOAL_OTHER},
                {"(init r 10 goal_l_9)", true,  10, PlayMode.GOAL_OTHER},
                {"(init r 11 goal_l_9)", true,  11, PlayMode.GOAL_OTHER},
                {"(init r 1 goal_l_10)",  true,  1,  PlayMode.GOAL_OTHER},
                {"(init r 2 goal_l_10)",  true,  2,  PlayMode.GOAL_OTHER},
                {"(init r 3 goal_l_10)",  true,  3,  PlayMode.GOAL_OTHER},
                {"(init r 4 goal_l_10)",  true,  4,  PlayMode.GOAL_OTHER},
                {"(init r 5 goal_l_10)",  true,  5,  PlayMode.GOAL_OTHER},
                {"(init r 6 goal_l_10)",  true,  6,  PlayMode.GOAL_OTHER},
                {"(init r 7 goal_l_10)",  true,  7,  PlayMode.GOAL_OTHER},
                {"(init r 8 goal_l_10)",  true,  8,  PlayMode.GOAL_OTHER},
                {"(init r 9 goal_l_10)",  true,  9,  PlayMode.GOAL_OTHER},
                {"(init r 10 goal_l_10)", true,  10, PlayMode.GOAL_OTHER},
                {"(init r 11 goal_l_10)", true,  11, PlayMode.GOAL_OTHER},
                {"(init r 1 goal_l_11)",  true,  1,  PlayMode.GOAL_OTHER},
                {"(init r 2 goal_l_11)",  true,  2,  PlayMode.GOAL_OTHER},
                {"(init r 3 goal_l_11)",  true,  3,  PlayMode.GOAL_OTHER},
                {"(init r 4 goal_l_11)",  true,  4,  PlayMode.GOAL_OTHER},
                {"(init r 5 goal_l_11)",  true,  5,  PlayMode.GOAL_OTHER},
                {"(init r 6 goal_l_11)",  true,  6,  PlayMode.GOAL_OTHER},
                {"(init r 7 goal_l_11)",  true,  7,  PlayMode.GOAL_OTHER},
                {"(init r 8 goal_l_11)",  true,  8,  PlayMode.GOAL_OTHER},
                {"(init r 9 goal_l_11)",  true,  9,  PlayMode.GOAL_OTHER},
                {"(init r 10 goal_l_11)", true,  10, PlayMode.GOAL_OTHER},
                {"(init r 11 goal_l_11)", true,  11, PlayMode.GOAL_OTHER},
                // West team goal other.
                {"(init l 1 goal_r_1)",  false,  1,  PlayMode.GOAL_OTHER},
                {"(init l 2 goal_r_1)",  false,  2,  PlayMode.GOAL_OTHER},
                {"(init l 3 goal_r_1)",  false,  3,  PlayMode.GOAL_OTHER},
                {"(init l 4 goal_r_1)",  false,  4,  PlayMode.GOAL_OTHER},
                {"(init l 5 goal_r_1)",  false,  5,  PlayMode.GOAL_OTHER},
                {"(init l 6 goal_r_1)",  false,  6,  PlayMode.GOAL_OTHER},
                {"(init l 7 goal_r_1)",  false,  7,  PlayMode.GOAL_OTHER},
                {"(init l 8 goal_r_1)",  false,  8,  PlayMode.GOAL_OTHER},
                {"(init l 9 goal_r_1)",  false,  9,  PlayMode.GOAL_OTHER},
                {"(init l 10 goal_r_1)", false,  10, PlayMode.GOAL_OTHER},
                {"(init l 11 goal_r_1)", false,  11, PlayMode.GOAL_OTHER},
                {"(init l 1 goal_r_2)",  false,  1,  PlayMode.GOAL_OTHER},
                {"(init l 2 goal_r_2)",  false,  2,  PlayMode.GOAL_OTHER},
                {"(init l 3 goal_r_2)",  false,  3,  PlayMode.GOAL_OTHER},
                {"(init l 4 goal_r_2)",  false,  4,  PlayMode.GOAL_OTHER},
                {"(init l 5 goal_r_2)",  false,  5,  PlayMode.GOAL_OTHER},
                {"(init l 6 goal_r_2)",  false,  6,  PlayMode.GOAL_OTHER},
                {"(init l 7 goal_r_2)",  false,  7,  PlayMode.GOAL_OTHER},
                {"(init l 8 goal_r_2)",  false,  8,  PlayMode.GOAL_OTHER},
                {"(init l 9 goal_r_2)",  false,  9,  PlayMode.GOAL_OTHER},
                {"(init l 10 goal_r_2)", false,  10, PlayMode.GOAL_OTHER},
                {"(init l 11 goal_r_2)", false,  11, PlayMode.GOAL_OTHER},
                {"(init l 1 goal_r_3)",  false,  1,  PlayMode.GOAL_OTHER},
                {"(init l 2 goal_r_3)",  false,  2,  PlayMode.GOAL_OTHER},
                {"(init l 3 goal_r_3)",  false,  3,  PlayMode.GOAL_OTHER},
                {"(init l 4 goal_r_3)",  false,  4,  PlayMode.GOAL_OTHER},
                {"(init l 5 goal_r_3)",  false,  5,  PlayMode.GOAL_OTHER},
                {"(init l 6 goal_r_3)",  false,  6,  PlayMode.GOAL_OTHER},
                {"(init l 7 goal_r_3)",  false,  7,  PlayMode.GOAL_OTHER},
                {"(init l 8 goal_r_3)",  false,  8,  PlayMode.GOAL_OTHER},
                {"(init l 9 goal_r_3)",  false,  9,  PlayMode.GOAL_OTHER},
                {"(init l 10 goal_r_3)", false,  10, PlayMode.GOAL_OTHER},
                {"(init l 11 goal_r_3)", false,  11, PlayMode.GOAL_OTHER},
                {"(init l 1 goal_r_4)",  false,  1,  PlayMode.GOAL_OTHER},
                {"(init l 2 goal_r_4)",  false,  2,  PlayMode.GOAL_OTHER},
                {"(init l 3 goal_r_4)",  false,  3,  PlayMode.GOAL_OTHER},
                {"(init l 4 goal_r_4)",  false,  4,  PlayMode.GOAL_OTHER},
                {"(init l 5 goal_r_4)",  false,  5,  PlayMode.GOAL_OTHER},
                {"(init l 6 goal_r_4)",  false,  6,  PlayMode.GOAL_OTHER},
                {"(init l 7 goal_r_4)",  false,  7,  PlayMode.GOAL_OTHER},
                {"(init l 8 goal_r_4)",  false,  8,  PlayMode.GOAL_OTHER},
                {"(init l 9 goal_r_4)",  false,  9,  PlayMode.GOAL_OTHER},
                {"(init l 10 goal_r_4)", false,  10, PlayMode.GOAL_OTHER},
                {"(init l 11 goal_r_4)", false,  11, PlayMode.GOAL_OTHER},
                {"(init l 1 goal_r_5)",  false,  1,  PlayMode.GOAL_OTHER},
                {"(init l 2 goal_r_5)",  false,  2,  PlayMode.GOAL_OTHER},
                {"(init l 3 goal_r_5)",  false,  3,  PlayMode.GOAL_OTHER},
                {"(init l 4 goal_r_5)",  false,  4,  PlayMode.GOAL_OTHER},
                {"(init l 5 goal_r_5)",  false,  5,  PlayMode.GOAL_OTHER},
                {"(init l 6 goal_r_5)",  false,  6,  PlayMode.GOAL_OTHER},
                {"(init l 7 goal_r_5)",  false,  7,  PlayMode.GOAL_OTHER},
                {"(init l 8 goal_r_5)",  false,  8,  PlayMode.GOAL_OTHER},
                {"(init l 9 goal_r_5)",  false,  9,  PlayMode.GOAL_OTHER},
                {"(init l 10 goal_r_5)", false,  10, PlayMode.GOAL_OTHER},
                {"(init l 11 goal_r_5)", false,  11, PlayMode.GOAL_OTHER},
                {"(init l 1 goal_r_6)",  false,  1,  PlayMode.GOAL_OTHER},
                {"(init l 2 goal_r_6)",  false,  2,  PlayMode.GOAL_OTHER},
                {"(init l 3 goal_r_6)",  false,  3,  PlayMode.GOAL_OTHER},
                {"(init l 4 goal_r_6)",  false,  4,  PlayMode.GOAL_OTHER},
                {"(init l 5 goal_r_6)",  false,  5,  PlayMode.GOAL_OTHER},
                {"(init l 6 goal_r_6)",  false,  6,  PlayMode.GOAL_OTHER},
                {"(init l 7 goal_r_6)",  false,  7,  PlayMode.GOAL_OTHER},
                {"(init l 8 goal_r_6)",  false,  8,  PlayMode.GOAL_OTHER},
                {"(init l 9 goal_r_6)",  false,  9,  PlayMode.GOAL_OTHER},
                {"(init l 10 goal_r_6)", false,  10, PlayMode.GOAL_OTHER},
                {"(init l 11 goal_r_6)", false,  11, PlayMode.GOAL_OTHER},
                {"(init l 1 goal_r_7)",  false,  1,  PlayMode.GOAL_OTHER},
                {"(init l 2 goal_r_7)",  false,  2,  PlayMode.GOAL_OTHER},
                {"(init l 3 goal_r_7)",  false,  3,  PlayMode.GOAL_OTHER},
                {"(init l 4 goal_r_7)",  false,  4,  PlayMode.GOAL_OTHER},
                {"(init l 5 goal_r_7)",  false,  5,  PlayMode.GOAL_OTHER},
                {"(init l 6 goal_r_7)",  false,  6,  PlayMode.GOAL_OTHER},
                {"(init l 7 goal_r_7)",  false,  7,  PlayMode.GOAL_OTHER},
                {"(init l 8 goal_r_7)",  false,  8,  PlayMode.GOAL_OTHER},
                {"(init l 9 goal_r_7)",  false,  9,  PlayMode.GOAL_OTHER},
                {"(init l 10 goal_r_7)", false,  10, PlayMode.GOAL_OTHER},
                {"(init l 11 goal_r_7)", false,  11, PlayMode.GOAL_OTHER},
                {"(init l 1 goal_r_8)",  false,  1,  PlayMode.GOAL_OTHER},
                {"(init l 2 goal_r_8)",  false,  2,  PlayMode.GOAL_OTHER},
                {"(init l 3 goal_r_8)",  false,  3,  PlayMode.GOAL_OTHER},
                {"(init l 4 goal_r_8)",  false,  4,  PlayMode.GOAL_OTHER},
                {"(init l 5 goal_r_8)",  false,  5,  PlayMode.GOAL_OTHER},
                {"(init l 6 goal_r_8)",  false,  6,  PlayMode.GOAL_OTHER},
                {"(init l 7 goal_r_8)",  false,  7,  PlayMode.GOAL_OTHER},
                {"(init l 8 goal_r_8)",  false,  8,  PlayMode.GOAL_OTHER},
                {"(init l 9 goal_r_8)",  false,  9,  PlayMode.GOAL_OTHER},
                {"(init l 10 goal_r_8)", false,  10, PlayMode.GOAL_OTHER},
                {"(init l 11 goal_r_8)", false,  11, PlayMode.GOAL_OTHER},
                {"(init l 1 goal_r_9)",  false,  1,  PlayMode.GOAL_OTHER},
                {"(init l 2 goal_r_9)",  false,  2,  PlayMode.GOAL_OTHER},
                {"(init l 3 goal_r_9)",  false,  3,  PlayMode.GOAL_OTHER},
                {"(init l 4 goal_r_9)",  false,  4,  PlayMode.GOAL_OTHER},
                {"(init l 5 goal_r_9)",  false,  5,  PlayMode.GOAL_OTHER},
                {"(init l 6 goal_r_9)",  false,  6,  PlayMode.GOAL_OTHER},
                {"(init l 7 goal_r_9)",  false,  7,  PlayMode.GOAL_OTHER},
                {"(init l 8 goal_r_9)",  false,  8,  PlayMode.GOAL_OTHER},
                {"(init l 9 goal_r_9)",  false,  9,  PlayMode.GOAL_OTHER},
                {"(init l 10 goal_r_9)", false,  10, PlayMode.GOAL_OTHER},
                {"(init l 11 goal_r_9)", false,  11, PlayMode.GOAL_OTHER},
                {"(init l 1 goal_r_10)",  false,  1,  PlayMode.GOAL_OTHER},
                {"(init l 2 goal_r_10)",  false,  2,  PlayMode.GOAL_OTHER},
                {"(init l 3 goal_r_10)",  false,  3,  PlayMode.GOAL_OTHER},
                {"(init l 4 goal_r_10)",  false,  4,  PlayMode.GOAL_OTHER},
                {"(init l 5 goal_r_10)",  false,  5,  PlayMode.GOAL_OTHER},
                {"(init l 6 goal_r_10)",  false,  6,  PlayMode.GOAL_OTHER},
                {"(init l 7 goal_r_10)",  false,  7,  PlayMode.GOAL_OTHER},
                {"(init l 8 goal_r_10)",  false,  8,  PlayMode.GOAL_OTHER},
                {"(init l 9 goal_r_10)",  false,  9,  PlayMode.GOAL_OTHER},
                {"(init l 10 goal_r_10)", false,  10, PlayMode.GOAL_OTHER},
                {"(init l 11 goal_r_10)", false,  11, PlayMode.GOAL_OTHER},
                {"(init l 1 goal_r_11)",  false,  1,  PlayMode.GOAL_OTHER},
                {"(init l 2 goal_r_11)",  false,  2,  PlayMode.GOAL_OTHER},
                {"(init l 3 goal_r_11)",  false,  3,  PlayMode.GOAL_OTHER},
                {"(init l 4 goal_r_11)",  false,  4,  PlayMode.GOAL_OTHER},
                {"(init l 5 goal_r_11)",  false,  5,  PlayMode.GOAL_OTHER},
                {"(init l 6 goal_r_11)",  false,  6,  PlayMode.GOAL_OTHER},
                {"(init l 7 goal_r_11)",  false,  7,  PlayMode.GOAL_OTHER},
                {"(init l 8 goal_r_11)",  false,  8,  PlayMode.GOAL_OTHER},
                {"(init l 9 goal_r_11)",  false,  9,  PlayMode.GOAL_OTHER},
                {"(init l 10 goal_r_11)", false,  10, PlayMode.GOAL_OTHER},
                {"(init l 11 goal_r_11)", false,  11, PlayMode.GOAL_OTHER},
            });
    }

    // Global test variables.
    private CmdParserPlayer parser;
    private TestFilter      commandFilter;
    private Filter          filter;

    // Test parameters.
    private String   command;
    private boolean  expectedIsTeamEast;
    private int      expectedPlayerNumber;
    private PlayMode expectedPlayMode;

    public PlayerInitCommandTest(
        String   command,
        boolean  isTeamEast,
        int      playerNumber,
        PlayMode playMode) {

        this.command              = command;
        this.expectedIsTeamEast   = isTeamEast;
        this.expectedPlayerNumber = playerNumber;
        this.expectedPlayMode     = playMode;
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
        public boolean isTeamEast() {
            return expectedIsTeamEast;
        }

        @Override
        public void setNumber(int num) {
            Assert.assertEquals(expectedPlayerNumber, num);
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

