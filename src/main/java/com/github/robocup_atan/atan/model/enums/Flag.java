package com.github.robocup_atan.atan.model.enums;

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

/**
 * An Enum for Flags.
 *
 * @author Atan
 */
public enum Flag {

    /**
     * A flag used to indicate the center of something. Could be of a goal,
     * penalty box etc.
     */
    CENTER,

    /**
     * A flag used to indicate the left of something. Could be of a goal,
     * left corner flag, penalty box etc.
     */
    LEFT,

    /**
     * The flag on the left hand side of the goal, 10 along from the center of the goal. (could be left or right goal)
     */
    LEFT_10,

    /**
     * The flag on the left hand side of the goal, 20 along from the center of the goal. (could be left or right goal)
     */
    LEFT_20,

    /**
     * The flag on the left hand side of the goal, 30 along from the center of the goal. (could be left or right goal)
     */
    LEFT_30,

    /**
     * The flag on the other side of the pitch, 10 along from the center line. (could be top or bottom)
     */
    OTHER_10,

    /**
     * The flag on the other side of the pitch, 20 along from the center line. (could be top or bottom)
     */
    OTHER_20,

    /**
     * The flag on the other side of the pitch, 30 along from the center line. (could be top or bottom)
     */
    OTHER_30,

    /**
     * The flag on the other side of the pitch, 40 along from the center line. (could be top or bottom)
     */
    OTHER_40,

    /**
     * The flag on the other side of the pitch, 50 along from the center line. (could be top or bottom)
     */
    OTHER_50,

    /**
     * The flag on our side of the pitch, 10 along from the center line. (could be top or bottom)
     */
    OWN_10,

    /**
     * The flag on our side of the pitch, 20 along from the center line. (could be top or bottom)
     */
    OWN_20,

    /**
     * The flag on our side of the pitch, 30 along from the center line. (could be top or bottom)
     */
    OWN_30,

    /**
     * The flag on our side of the pitch, 40 along from the center line. (could be top or bottom)
     */
    OWN_40,

    /**
     * The flag on our side of the pitch, 50 along from the center line. (could be top or bottom)
     */
    OWN_50,

    /**
     * A flag used to indicate the right of something. Could be of a goal,
     * left corner flag, penalty box etc.
     */
    RIGHT,

    /**
     * The flag on the right hand side of the goal, 10 along from the center of the goal. (could be left or right goal)
     */
    RIGHT_10,

    /**
     * The flag on the right hand side of the goal, 20 along from the center of the goal. (could be left or right goal)
     */
    RIGHT_20,

    /**
     * The flag on the right hand side of the goal, 30 along from the center of the goal. (could be left or right goal)
     */
    RIGHT_30;

    /**
     * Checks if the enum flag is LEFT RIGHT or CENTER.
     *
     * @param pointer The flag to check.
     * @return true or false
     */
    public static boolean isLeftRightCenter(Flag pointer) {
        if (pointer.name().equals("LEFT") || pointer.name().equals("CENTER") || pointer.name().equals("RIGHT")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if the enum flag is LEFT or RIGHT.
     *
     * @param pointer The flag to check.
     * @return true or false
     */
    public static boolean isLeftRight(Flag pointer) {
        if (pointer.name().equals("LEFT") || pointer.name().equals("RIGHT")) {
            return true;
        } else {
            return false;
        }
    }
}
