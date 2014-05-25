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
 * An enum for referee messages.
 *
 * @author Atan
 */
public enum RefereeMessage {

    /**
     * Half time.
     */
    HALF_TIME,

    /**
     * No more time remaining.
     */
    TIME_UP,

    /**
     * Second half elapsed with no opposition team present.
     */
    TIME_UP_WITHOUT_A_TEAM,

    /**
     * Extra time.
     */
    TIME_EXTENDED,

    /**
     * Ball was dropped somewhere.
     */
    DROP_BALL,

    /**
     * We were offside.
     */
    OFFSIDE_OWN,

    /**
     * They were offside.
     */
    OFFSIDE_OTHER,

    /**
     * We commited a foul.
     */
    FOUL_OWN,

    /**
     * They commited a foul.
     */
    FOUL_OTHER,

    /**
     * Right team went offside.
     */
    OFFSIDE_R,

    /**
     * Left team went offside.
     */
    OFFSIDE_L,

    /**
     * Right team commited a foul.
     */
    FOUL_R,

    /**
     * Left team commited a foul.
     */
    FOUL_L;
}
