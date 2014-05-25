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
 * An enum for errors.
 *
 * @author Atan
 */
public enum Errors {

    /**
     * There is already a coach connected.
     */
    ALREADY_HAVE_OFFLINE_COACH,

    /**
     * Cannot reconnect while the PlayMode is PLAYON.
     */
    CANNOT_RECONNECT_WHILE_PLAYON,

    /**
     * Cannot say a freeform while the PlayMode is PLAYON.
     */
    CANNOT_SAY_FREEFORM_WHILE_PLAYON,

    /**
     * Tried to connect a coach when the server isn't in coach mode.
     */
    CONNECTED_OFFLINE_COACH_WITHOUT_COACH_MODE,

    /**
     * Connection has failed.
     */
    CONNECTION_FAILED,

    /**
     * The server could not parse the say message.
     */
    COULD_NOT_PARSE_SAY,

    /**
     * A goalie already exists.
     */
    GOALIE_ALREADY_EXISTS,

    /**
     * Illegal client version provided.
     */
    ILLEGAL_CLIENT_VERSION,

    /**
     * The command sent to the server is in an invalid form.
     */
    ILLEGAL_COMMAND_FORM,

    /**
     * Tried setting the game mode to an invalid mode.
     */
    ILLEGAL_MODE,

    /**
     * The object passed to the server is in an invalid form.
     */
    ILLEGAL_OBJECT_FORM,

    /**
     * Illegal teamname.
     */
    ILLEGAL_TEAMNAME,

    /**
     * Illegal or too long teamname.
     */
    ILLEGAL_TEAMNAME_OR_TOO_LONG_TEAMNAME,

    /**
     * The XPM image recieved by the server wasn't in a valid format.
     */
    INVALID_XPM_DATA,

    /**
     * The server cannot connect any more monitors.
     */
    NO_MORE_MONITOR,

    /**
     * The server cannot connect any more teams.
     */
    NO_MORE_TEAM,

    /**
     * The server cannot connect any more players or goalie's.
     * Or an illegal client version was sent to SServer.
     */
    NO_MORE_PLAYER_OR_GOALIE_OR_ILLEGAL_CLIENT_VERSION,

    /**
     * No such team or player.
     */
    NO_SUCH_TEAM_OR_PLAYER,

    /*
     * Player type is out of range.
     */
    OUT_OF_RANGE_PLAYER_TYPE,

    /**
     * A red carded player tried to reconnect.
     */
    RED_CARDED_PLAYER,

    /**
     * Too many advice messages have been sent.
     */
    SAID_TOO_MANY_ADVICE_MESSAGES,

    /**
     * Too many define messages have been sent.
     */
    SAID_TOO_MANY_DEFINE_MESSAGES,

    /**
     * Too many del messages have been sent.
     */
    SAID_TOO_MANY_DEL_MESSAGES,

    /**
     * Too many freeform messages have been sent.
     */
    SAID_TOO_MANY_FREEFORM_MESSAGES,

    /**
     * Too many info messages have been sent.
     */
    SAID_TOO_MANY_INFO_MESSAGES,

    /**
     * We have said too many things, wait to say again.
     */
    SAID_TOO_MANY_MESSAGES,

    /**
     * Too many meta messages have been sent.
     */
    SAID_TOO_MANY_META_MESSAGES,

    /**
     * Too many rule messages have been sent.
     */
    SAID_TOO_MANY_RULE_MESSAGES,

    /**
     * Failed to open the socket when connecting to the server.
     */
    SOCKET_OPEN_FAILED,

    /**
     * We tried to perform too many moves in one turn.
     */
    TOO_MANY_MOVES,

    /**
     * The command sent to the server is completely unknown.
     */
    UNKNOWN_COMMAND;
}

