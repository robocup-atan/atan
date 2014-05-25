package com.github.robocup_atan.atan.model;

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

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.enums.ViewAngle;
import com.github.robocup_atan.atan.model.enums.ViewQuality;

/**
 * Interface for an abstract soccer player. To be used by ControllerPlayer.
 *
 * @author Atan
 */
public interface ActionsPlayer {

    /**
     * This command accelerates the player in the direction of its body.
     *
     * @param power Power is between minpower (-100) and maxpower (+100).
     */
    public void dash(int power);

    /**
     * This command can only be executed before kick off or after a goal.
     *
     * @param x X location (between -54 and +54).
     * @param y Y location (between -32 and +32).
     */
    public void move(int x, int y);

    /**
     * This command accelerates the ball with the given power in the given direction.
     *
     * @param power Power is between minpower (-100) and maxpower (+100).
     * @param direction Direction is relative to the body of the player.
     */
    public void kick(int power, double direction);

    /**
     * This command broadcasts the message throughout the field. Any player
     * near enough (specified with audio_cut_dist default 50.0 meters), with
     * enough hearing capacity will hear the message.
     *
     * @param message A valid String to say.
     */
    public void say(String message);

    /**
     * This command will turn the players body in degrees relative to their
     * current direction.
     *
     * @param angle Angle to turn (between -180 and +180).
     */
    public void turn(double angle);

    /**
     * This command can be sent (and will be executed) each cycle independently,
     * along with other action commands. The neck will rotate with the given angle
     * relative to the previous angle.
     *
     * @param angle Angle to turn the neck (between minneckang and maxneckang) (-90 to +90)
     */
    public void turnNeck(double angle);

    /**
     * Goalie special command. Tries to catch the ball in a given direction
     * relative to its body direction. If the catch is successful the ball will
     * be in the goalies hand until kicked away.
     *
     * @param direction The direction in which to catch, relative to its body.
     */
    public void catchBall(double direction);

    /**
     * Changes the view parameters of the player. The amount and detail returned
     * by the visual sensor depends on the width of view and the quality. But
     * note that the frequency of sending information also depends on these
     * parameters. (eg. If you change the quality from high to low, the
     * frequency doubles, and the time between the two see sensors will be
     * cut in half).
     *
     * @param angle Between NARROW, NORMAL or WIDE.
     * @param quality Between HIGH or LOW.
     */
    public void changeViewMode(ViewQuality quality, ViewAngle angle);

    /**
     * This is used to disconnect a player from the server.
     * The server will not respond.
     */
    public void bye();

    /**
     * The method used to show errors.
     *
     * @param error The error to show.
     */
    public void handleError(String error);

    /**
     * Requests the name of the team the player features in.
     *
     * @return The team name.
     */
    public String getTeamName();

    /**
     * Checks if the team is east or west.
     *
     * @return true if east.
     */
    public boolean isTeamEast();

    /**
     * Sets the team as east or west.
     *
     * @param is true if east.
     */
    public void setTeamEast(boolean is);

    /**
     * Sets the players number.
     *
     * @param num The players number (from 1 to 11).
     */
    public void setNumber(int num);

    /**
     * Gets the players number.
     *
     * @return The players number (from 1 to 11).
     */
    public int getNumber();
}
