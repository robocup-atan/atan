package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.enums.Errors;
import atan.model.enums.Ok;
import atan.model.enums.PlayMode;
import atan.model.enums.RefereeMessage;
import atan.model.enums.ServerParams;
import atan.model.enums.Warning;

//~--- JDK imports ------------------------------------------------------------

import java.util.HashMap;

/**
 * Interface that has to be implemented in order to play the role of a Coach
 * @author Atan
 */
public interface ControllerCoach {

    /**
     * The controller is informed when one of its own players is seen.
     * @param number The players uniform number.
     * @param goalie Is the player a goalie?
     * @param x The players x coordinate.
     * @param y The players y coordinate.
     * @param deltaX The players change of speed on the x plane.
     * @param deltaY The players change of speed on the y plane.
     * @param bodyAngle The players body angle.
     * @param neckAngle The players neck angle.
     */
    public void infoSeePlayerOwn(int number, boolean goalie, double x, double y, double deltaX, double deltaY,
                                 double bodyAngle, double neckAngle);

    /**
     * The controller is informed when an opposing player is seen.
     * @param number The players uniform number.
     * @param goalie Is the player a goalie?
     * @param x The players x coordinate.
     * @param y The players y coordinate.
     * @param deltaX The players change of speed on the x plane.
     * @param deltaY The players change of speed on the y plane.
     * @param bodyAngle The players body angle.
     * @param neckAngle The players neck angle.
     */
    public void infoSeePlayerOther(int number, boolean goalie, double x, double y, double deltaX, double deltaY,
                                   double bodyAngle, double neckAngle);

    /**
     * The controller is informed when its own goal is seen.
     * @param x The x coordinate of the center of the goal.
     * @param y The y coordinate of the center of the goal.
     */
    public void infoSeeGoalOwn(double x, double y);

    /**
     * The controller is informed when an opposing goal is seen.
     * @param x The x coordinate of the center of the goal.
     * @param y The y coordinate of the center of the goal.
     */
    public void infoSeeGoalOther(double x, double y);

    /**
     * The controller is informed that the Ball is in sight.
     * @param x The x coordinate of the ball.
     * @param y The y coordinate of the ball.
     * @param deltaX The balls change in speed on the x plane.
     * @param deltaY The balls change in speed on the y plane.
     */
    public void infoSeeBall(double x, double y, double deltaX, double deltaY);

    /**
     * The observer is informed when a referee message is broadcast.
     * @param refereeMessage possible values: FOUL_OWN, FOUL_OTHER,
     * HALF_TIME, TIME_UP, TIME_UP_WITHOUT_A_TEAM,
     * TIME_EXTENDED, DROP_BALL, OFFSIDE_OWN, OFFSIDE_OTHER
     */
    public void infoHearReferee(RefereeMessage refereeMessage);

    /**
     * The observer is informed when a play mode message is broadcast.
     * @param playMode possible values: BEFORE_KICK_OFF, TIME_OVER, PLAY_ON,
     * KICK_OFF_OWN, KICK_OFF_OTHER, FREE_KICK_OWN,
     * FREE_KICK_OTHER, GOAL_KICK_OWN, CORNER_KICK_OTHER,
     * GOAL_KICK_OWN, GOAL_KICK_OTHER, GOAL_OWN, GOAL_OTHER
     */
    public void infoHearPlayMode(PlayMode playMode);

    /**
     * The controller is informed when it hears a message from another player.
     * @param direction The direction from which the message originated.
     * @param message The actual message said.
     */
    public void infoHearPlayer(double direction, String message);

    /**
     * The coach is informed when it hears an error message.
     * @param error The error to handle
     */
    public void infoHearError(Errors error);

    /**
     * The coach is informed when it hears an OK message.
     * @param ok The message to handle.
     */
    public void infoHearOk(Ok ok);

    /**
     * The coach is informed when it hears a warning.
     * @param warning The warning to handle.
     */
    public void infoHearWarning(Warning warning);

    /**
     * The coach is informed when the player type message is received.
     * @param id
     * @param playerSpeedMax
     * @param staminaIncMax
     * @param playerDecay
     * @param inertiaMoment
     * @param dashPowerRate
     * @param playerSize
     * @param kickableMargin
     * @param kickRand
     * @param extraStamina
     * @param effortMax
     * @param effortMin
     */
    public void infoPlayerType(int id, double playerSpeedMax, double staminaIncMax, double playerDecay,
                               double inertiaMoment, double dashPowerRate, double playerSize, double kickableMargin,
                               double kickRand, double extraStamina, double effortMax, double effortMin);

    /**
     * The controller is informed when the change player type message is received.
     * @param unum The players uniform number.
     * @param type The players type.
     */
    public void infoCPTOwn(int unum, int type);

    /**
     * The controller is informed when the change player type message is received.
     * @param unum The players uniform number.
     */
    public void infoCPTOther(int unum);

    /**
     * The coach is informed when the player param message is received.
     * @param allowMultDefaultType
     * @param dashPowerRateDeltaMax
     * @param dashPowerRateDeltaMin
     * @param effortMaxDeltaFactor
     * @param effortMinDeltaFactor
     * @param extraStaminaDeltaMax
     * @param extraStaminaDeltaMin
     * @param inertiaMomentDeltaFactor
     * @param kickRandDeltaFactor
     * @param kickableMarginDeltaMax
     * @param kickableMarginDeltaMin
     * @param newDashPowerRateDeltaMax
     * @param newDashPowerRateDeltaMin
     * @param newStaminaIncMaxDeltaFactor
     * @param playerDecayDeltaMax
     * @param playerDecayDeltaMin
     * @param playerTypes
     * @param ptMax
     * @param randomSeed
     * @param staminaIncMaxDeltaFactor
     * @param subsMax
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
     * @param info A hashmap containing all the server param details.
     */
    public void infoServerParam(HashMap<ServerParams, Object> info);

    /**
     * Sets the coach that the controller is controlling.
     * @param c
     */
    public void setCoach(ActionsCoach c);

    /**
     * Returns the current instance of ActionsCoach.
     * @return ActionsCoach
     */
    public ActionsCoach getCoach();
}
