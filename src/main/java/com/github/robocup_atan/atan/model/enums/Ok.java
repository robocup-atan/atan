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
 * An enum for Ok messages.
 *
 * @author Atan
 */
public enum Ok {

    /**
     * The move command executed successfully.
     */
    MOVE,

    /**
     * The change_mode command executed successfully.
     */
    CHANGE_MODE,

    /**
     * The check_ball command executed successfully.
     */
    CHECK_BALL,

    /**
     * The start command executed successfully.
     */
    START,

    /**
     * The recover command executed successfully.
     */
    RECOVER,

    /**
     * The ear command executed successfully.
     * Ear was turned on.
     */
    EAR_ON,

    /**
     * The ear command executed successfully.
     * Ear was turned off.
     */
    EAR_OFF,

    /**
     * The say command executed successfully.
     */
    SAY,

    /**
     * The change_player_type command executed successfully.
     */
    CHANGE_PLAYER_TYPE,

    /**
     * The look command executed successfully.
     */
    LOOK,

    /**
     * The team_names command executed successfully.
     */
    TEAM_NAMES,

    /**
     * The team_graphic command executed successfully.
     */
    TEAM_GRAPHIC,

    /**
     * The eye command was executed successfully.
     * Eye was turned on.
     */
    EYE_ON,

    /**
     * The eye command was executed successfully.
     * Eye was turned off.
     */
    EYE_OFF;
}
