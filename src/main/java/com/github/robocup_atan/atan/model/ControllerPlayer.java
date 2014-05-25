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
import com.github.robocup_atan.atan.model.enums.Flag;
import com.github.robocup_atan.atan.model.enums.Line;
import com.github.robocup_atan.atan.model.enums.Ok;
import com.github.robocup_atan.atan.model.enums.PlayMode;
import com.github.robocup_atan.atan.model.enums.RefereeMessage;
import com.github.robocup_atan.atan.model.enums.ServerParams;
import com.github.robocup_atan.atan.model.enums.ViewAngle;
import com.github.robocup_atan.atan.model.enums.ViewQuality;
import com.github.robocup_atan.atan.model.enums.Warning;

//~--- JDK imports ------------------------------------------------------------

import java.util.HashMap;

/**
 * Interface that has to be implemented in order to control players. The methods
 * are run in a cycle whenever a see command arrives from SServer. At first preInfo()
 * is invoked. then the info*() methods are called according to what kind of objects
 * are currently seen or what other commands where received from the server. At last
 * postInfo() is called. All objects are relative to the current side of the controller.
 *
 * @author Atan
 */
public interface ControllerPlayer {

    /**
     * This is the method called before the controller receives all the new visual
     * information.
     */
    public void preInfo();

    /**
     * This is the method called one all the visual information
     * has been processed.
     */
    public void postInfo();

    /**
     * Returns the current instance of the ActionsPlayer.
     *
     * @return ActionsPlayer.
     */
    public ActionsPlayer getPlayer();

    /**
     * Sets the player that the controller is controlling.
     *
     * @param c ActionsPlayer.
     */
    public void setPlayer(ActionsPlayer c);

    /**
     * Get the players type, if set.
     *
     * @return The players type (any string).
     */
    public String getType();

    /**
     * Set the players type.
     *
     * @param newType what the type will now be
     */
    public void setType(String newType);

    /**
     * The controller is informed when one of the flags along the right touchline
     * is in sight. The flags are positioned 5m behind the touchline.
     *
     * @param flag possible values: OWN_50, OWN_40, OWN_30, OWN_20, OWN_10, CENTER,
     * OTHER_10, OTHER_20, OTHER_30, OTHER_40, OTHER_50
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     * @param distChange a double.
     * @param dirChange a double.
     * @param bodyFacingDirection a double.
     * @param headFacingDirection a double.
     */
    public void infoSeeFlagRight(Flag flag, double distance, double direction, double distChange, double dirChange,
                                 double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed when one of the flags along the left touchline
     * is in sight. The flags are positioned 5m behind the touchline.
     *
     * @param flag possible values: OWN_50, OWN_40, OWN_30, OWN_20, OWN_10, CENTER
     * OTHER_10, OTHER_20, OTHER_30, OTHER_40, OTHER_50
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     * @param distChange a double.
     * @param dirChange a double.
     * @param bodyFacingDirection a double.
     * @param headFacingDirection a double.
     */
    public void infoSeeFlagLeft(Flag flag, double distance, double direction, double distChange, double dirChange,
                                double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed when one of the flags behind our teams
     * goal is in sight. These flags are positioned 5m behind the goal line.
     *
     * @param flag possible values: LEFT_10, LEFT_20, LEFT_30, CENTER,
     * RIGHT_10, RIGHT_20, RIGHT_30
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     * @param distChange a double.
     * @param dirChange a double.
     * @param bodyFacingDirection a double.
     * @param headFacingDirection a double.
     */
    public void infoSeeFlagOwn(Flag flag, double distance, double direction, double distChange, double dirChange,
                               double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed when one of the flags behind the other teams
     * goal is in sight. These flags are positioned 5m behind the goal line.
     *
     * @param flag possible values: LEFT_10, LEFT_20, LEFT_30, CENTER,
     * RIGHT_10, RIGHT_20, RIGHT_30
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     * @param distChange a double.
     * @param dirChange a double.
     * @param bodyFacingDirection a double.
     * @param headFacingDirection a double.
     */
    public void infoSeeFlagOther(Flag flag, double distance, double direction, double distChange, double dirChange,
                                 double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed when one of the flags on the center line are
     * in sight.
     *
     * @param flag possible values: LEFT, CENTER, RIGHT
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     * @param distChange a double.
     * @param dirChange a double.
     * @param bodyFacingDirection a double.
     * @param headFacingDirection a double.
     */
    public void infoSeeFlagCenter(Flag flag, double distance, double direction, double distChange, double dirChange,
                                  double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of our teams corner flags is
     * in sight.
     *
     * @param flag possible values: LEFT, RIGHT
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     * @param distChange a double.
     * @param dirChange a double.
     * @param bodyFacingDirection a double.
     * @param headFacingDirection a double.
     */
    public void infoSeeFlagCornerOwn(Flag flag, double distance, double direction, double distChange, double dirChange,
                                     double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of the other teams corner flags is
     * in sight.
     *
     * @param flag possible values: LEFT, RIGHT
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     * @param distChange a double.
     * @param dirChange a double.
     * @param bodyFacingDirection a double.
     * @param headFacingDirection a double.
     */
    public void infoSeeFlagCornerOther(Flag flag, double distance, double direction, double distChange,
                                       double dirChange, double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of our teams penalty box
     * flags is in sight. The flags map the outer most corners of the penalty
     * box and the centre point between these corners.
     *
     * @param flag possible values: LEFT, CENTER, RIGHT
     * @param distance The distance to this flag.
     * @param direction The direction of this flag.
     * @param distChange a double.
     * @param dirChange a double.
     * @param bodyFacingDirection a double.
     * @param headFacingDirection a double.
     */
    public void infoSeeFlagPenaltyOwn(Flag flag, double distance, double direction, double distChange,
                                      double dirChange, double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of the other teams penalty box
     * flags is in sight. The flags map the outer most corners of the penalty
     * box and the centre point between these corners.
     *
     * @param flag possible values: LEFT, CENTER, RIGHT
     * @param distance The distance to this flag.
     * @param direction The direction of this flag.
     * @param distChange a double.
     * @param dirChange a double.
     * @param bodyFacingDirection a double.
     * @param headFacingDirection a double.
     */
    public void infoSeeFlagPenaltyOther(Flag flag, double distance, double direction, double distChange,
            double dirChange, double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of our teams goal flags
     * is in sight. The flags map the posts of the goal and the center
     * of the goal.
     *
     * @param flag possible values: LEFT, CENTER, RIGHT
     * @param distance The distance to this flag.
     * @param direction The direction of the flag.
     * @param distChange a double.
     * @param dirChange a double.
     * @param bodyFacingDirection a double.
     * @param headFacingDirection a double.
     */
    public void infoSeeFlagGoalOwn(Flag flag, double distance, double direction, double distChange, double dirChange,
                                   double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of the other teams goal flags
     * is in sight. The flags map the posts of the goal and the center
     * of the goal.
     *
     * @param flag possible values: LEFT, CENTER, RIGHT
     * @param distance The distance to this flag.
     * @param direction The direction of the flag.
     * @param distChange a double.
     * @param dirChange a double.
     * @param bodyFacingDirection a double.
     * @param headFacingDirection a double.
     */
    public void infoSeeFlagGoalOther(Flag flag, double distance, double direction, double distChange, double dirChange,
                                     double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of the pitch lines are in sight.
     *
     * @param line a {@link com.github.robocup_atan.atan.model.enums.Line} object.
     * @param distance The distance to the line.
     * @param direction The direction of the line.
     * @param distChange a double.
     * @param dirChange a double.
     * @param bodyFacingDirection a double.
     * @param headFacingDirection a double.
     */
    public void infoSeeLine(Line line, double distance, double direction, double distChange, double dirChange,
                            double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of the other teams players is in sight.
     *
     * @param number The ID of the player (from 1 to 11)
     * @param goalie If the seen player is a goalie. False if unknown.
     * @param distance The distance to the player.
     * @param direction The direction of the player.
     * @param distChange a double.
     * @param dirChange a double.
     * @param bodyFacingDirection a double.
     * @param headFacingDirection a double.
     */
    public void infoSeePlayerOther(int number, boolean goalie, double distance, double direction, double distChange,
                                   double dirChange, double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of it's own team is in sight.
     *
     * @param number The ID of the player (from 1 to 11)
     * @param goalie If the seen player is a goalie. False if unknown.
     * @param distance The distance to the player.
     * @param direction The direction of the player.
     * @param distChange a double.
     * @param dirChange a double.
     * @param bodyFacingDirection a double.
     * @param headFacingDirection a double.
     */
    public void infoSeePlayerOwn(int number, boolean goalie, double distance, double direction, double distChange,
                                 double dirChange, double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that the Ball is in sight.
     *
     * @param distance The distance to the ball.
     * @param direction The direction of the ball.
     * @param distChange a double.
     * @param dirChange a double.
     * @param bodyFacingDirection a double.
     * @param headFacingDirection a double.
     */
    public void infoSeeBall(double distance, double direction, double distChange, double dirChange,
                            double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed when a referee message is broadcast.
     *
     * @param refereeMessage possible values: FOUL_OWN, FOUL_OTHER,
     * HALF_TIME, TIME_UP, TIME_UP_WITHOUT_A_TEAM,
     * TIME_EXTENDED, DROP_BALL, OFFSIDE_OWN, OFFSIDE_OTHER
     */
    public void infoHearReferee(RefereeMessage refereeMessage);

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
     * The controller is informed when it hears a message from another player.
     *
     * @param direction The direction from which the message originated.
     * @param message The actual message said.
     */
    public void infoHearPlayer(double direction, String message);

    /**
     * The player is informed when it hears an error message.
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

    /**
     * <p>infoSenseBody.</p>
     *
     * @param viewQuality possible values: HIGH, LOW
     * @param viewAngle possible values: NARROW, NORMAL, WIDE
     * @param stamina a double.
     * @param unknown a double.
     * @param effort a double.
     * @param speedAmount a double.
     * @param speedDirection a double.
     * @param headAngle a double.
     * @param dashCount a int.
     * @param kickCount a int.
     * @param turnCount a int.
     * @param sayCount a int.
     * @param turnNeckCount a int.
     * @param catchCount a int.
     * @param moveCount a int.
     * @param changeViewCount a int.
     */
    public void infoSenseBody(ViewQuality viewQuality, ViewAngle viewAngle, double stamina, double unknown,
                              double effort, double speedAmount, double speedDirection, double headAngle,
                              int kickCount, int dashCount, int turnCount, int sayCount, int turnNeckCount,
                              int catchCount, int moveCount, int changeViewCount);

    /**
     * The controller is informed when the change player type message is received.
     *
     * @param unum The players uniform number.
     * @param type The players type.
     */
    public void infoCPTOwn(int unum, int type);

    /**
     * The controller is informed when the change player type message is received.
     *
     * @param unum The players uniform number.
     */
    public void infoCPTOther(int unum);

    /**
     * The player is informed when the player type message is received.
     *
     * @param id a int.
     * @param playerSpeedMax a double.
     * @param staminaIncMax a double.
     * @param playerDecay a double.
     * @param inertiaMoment a double.
     * @param dashPowerRate a double.
     * @param playerSize a double.
     * @param kickableMargin a double.
     * @param kickRand a double.
     * @param extraStamina a double.
     * @param effortMax a double.
     * @param effortMin a double.
     */
    public void infoPlayerType(int id, double playerSpeedMax, double staminaIncMax, double playerDecay,
                               double inertiaMoment, double dashPowerRate, double playerSize, double kickableMargin,
                               double kickRand, double extraStamina, double effortMax, double effortMin);

    /**
     * The player is informed when the player param message is received.
     *
     * @param allowMultDefaultType a double.
     * @param dashPowerRateDeltaMax a double.
     * @param dashPowerRateDeltaMin a double.
     * @param effortMaxDeltaFactor a double.
     * @param effortMinDeltaFactor a double.
     * @param extraStaminaDeltaMax a double.
     * @param extraStaminaDeltaMin a double.
     * @param inertiaMomentDeltaFactor a double.
     * @param kickRandDeltaFactor a double.
     * @param kickableMarginDeltaMax a double.
     * @param kickableMarginDeltaMin a double.
     * @param newDashPowerRateDeltaMax a double.
     * @param newDashPowerRateDeltaMin a double.
     * @param newStaminaIncMaxDeltaFactor a double.
     * @param playerDecayDeltaMax a double.
     * @param playerDecayDeltaMin a double.
     * @param playerTypes a double.
     * @param ptMax a double.
     * @param randomSeed a double.
     * @param staminaIncMaxDeltaFactor a double.
     * @param subsMax a double.
     */
    public void infoPlayerParam(double allowMultDefaultType, double dashPowerRateDeltaMax,
                                double dashPowerRateDeltaMin, double effortMaxDeltaFactor, double effortMinDeltaFactor,
                                double extraStaminaDeltaMax, double extraStaminaDeltaMin,
                                double inertiaMomentDeltaFactor, double kickRandDeltaFactor,
                                double kickableMarginDeltaMax, double kickableMarginDeltaMin,
                                double newDashPowerRateDeltaMax, double newDashPowerRateDeltaMin,
                                double newStaminaIncMaxDeltaFactor, double playerDecayDeltaMax,
                                double playerDecayDeltaMin, double playerTypes, double ptMax, double randomSeed,
                                double staminaIncMaxDeltaFactor, double subsMax);

    /**
     * The controller is informed when the server param message is received.
     *
     * @param info A hashmap containing all the server param details.
     */
    public void infoServerParam(HashMap<ServerParams, Object> info);
}
