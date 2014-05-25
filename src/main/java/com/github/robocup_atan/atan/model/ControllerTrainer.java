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

import com.github.robocup_atan.atan.model.enums.Errors;
import com.github.robocup_atan.atan.model.enums.Ok;
import com.github.robocup_atan.atan.model.enums.PlayMode;
import com.github.robocup_atan.atan.model.enums.RefereeMessage;
import com.github.robocup_atan.atan.model.enums.Warning;

/**
 * An interface that has to be implemented for a trainer.
 *
 * @author Atan
 */
public interface ControllerTrainer {

    /**
     * The controller is informed when it hears a message from another player.
     *
     * @param direction The direction from which the message originated.
     * @param message The actual message said.
     */
    public void infoHearPlayer(double direction, String message);

    /**
     * The controller is informed when a play mode message is broadcast.
     *
     * @param playMode possible values: BEFORE_KICK_OFF, TIME_OVER, PLAY_ON,
     * KICK_OFF_OWN, KICK_OFF_OTHER, FREE_KICK_OWN,
     * FREE_KICK_OTHER, GOAL_KICK_OWN, CORNER_KICK_OTHER,
     * GOAL_KICK_OWN, GOAL_KICK_OTHER, GOAL_OWN, GOAL_OTHER
     */
    public void infoHearPlayMode(PlayMode playMode);

    /**
     * The controller is informed when a referee message is broadcast.
     *
     * @param refereeMessage possible values: FOUL_OWN, FOUL_OTHER,
     * HALF_TIME, TIME_UP, TIME_UP_WITHOUT_A_TEAM,
     * TIME_EXTENDED, DROP_BALL, OFFSIDE_OWN, OFFSIDE_OTHER
     */
    public void infoHearReferee(RefereeMessage refereeMessage);

    /**
     * The trainer is informed when it hears an error message.
     *
     * @param error The error to handle
     */
    public void infoHearError(Errors error);

    /**
     * The player is informed when it hears an ok message.
     *
     * @param ok The message to handle.
     */
    public void infoHearOk(Ok ok);

    /**
     * The player is informed when it hears a warning.
     *
     * @param warning The warning to handle.
     */
    public void infoHearWarning(Warning warning);
}
