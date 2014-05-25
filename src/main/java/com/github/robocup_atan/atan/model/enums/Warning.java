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
 * An enum for warnings.
 *
 * @author Atan
 */
public enum Warning {

    /**
     * You cannot substitute the goalie.
     */
    CANNOT_CHANGE_GOALIE,

    /**
     * You cannot substitute the goalie during penalty shootouts.
     */
    CANNOT_CHANGE_GOALIE_WHILE_PENALTY_TAKEN,

    /**
     * You cannot substitute the goalie whilst game mode is play on.
     */
    CANNOT_CHANGE_GOALIE_WHILE_PLAYON,

    /**
     * Cannot say whilst game mode is play on.
     */
    CANNOT_SAY_WHILE_PLAYON,

    /**
     * Cannot substitute a player during penalty shootouts.
     */
    CANNOT_SUB_WHILE_PENALTY_SHOOTOUTS,

    /**
     * Cannot substitute a player whilst game mode is play on.
     */
    CANNOT_SUB_WHILE_PLAYON,

    /**
     * Compression isn't supported.
     */
    COMPRESSION_UNSUPPORTED,

    /**
     * The XPM tile location sent to the server was invalid.
     */
    INVALID_TILE_LOCATION,

    /**
     * The XPM tile size sent to the server was an invalid size.
     */
    INVALID_TILE_SIZE,

    /**
     * You already have the maximum type of that player on the field.
     */
    MAX_OF_THAT_TYPE_ON_FIELD,

    /**
     * The message you sent wasn't null terminated.
     */
    MESSAGE_NOT_NULL_TERMINATED,

    /**
     * There are no players of that type left.
     */
    NO_LEFT_OF_THAT_TYPE,

    /**
     * You have no substitutes left.
     */
    NO_SUBS_LEFT,

    /**
     * The player you tried to access doesn't exist.
     */
    NO_SUCH_PLAYER,

    /**
     * The team you tried to access doesn't exist.
     */
    NO_TEAM_FOUND,

    /**
     * This action can only be performed before kick off.
     */
    ONLY_BEFORE_KICK_OFF;
}
